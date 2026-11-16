@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.rras

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.In6Addr
import io.github.kotlinmania.windowssys.windows.win32.networking.winsock.InAddr
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CryptIntegerBlob

public class AuthValidationEx internal constructor(
    public var header: MprapiObjectHeader,
    hRasConnectionCtorArg: Handle,
    public var wszUserName: UShortArray,
    public var wszLogonDomain: UShortArray,
    public var authInfoSize: UInt,
    public var authInfo: UByteArray,
) {
    public var hRasConnection: Handle = hRasConnectionCtorArg
        internal set

    public constructor() : this(
        header = MprapiObjectHeader(),
        hRasConnectionCtorArg = MutPtr(0L),
        wszUserName = UShortArray(257),
        wszLogonDomain = UShortArray(16),
        authInfoSize = 0u,
        authInfo = UByteArray(1),
    )

    public operator fun component1(): MprapiObjectHeader = this.header

    public operator fun component2(): Handle = this.hRasConnection

    public operator fun component3(): UShortArray = this.wszUserName

    public operator fun component4(): UShortArray = this.wszLogonDomain

    public operator fun component5(): UInt = this.authInfoSize

    public operator fun component6(): UByteArray = this.authInfo

    public fun copy(header: MprapiObjectHeader = this.header, hRasConnection: Handle = this.hRasConnection, wszUserName: UShortArray = this.wszUserName, wszLogonDomain: UShortArray = this.wszLogonDomain, authInfoSize: UInt = this.authInfoSize, authInfo: UByteArray = this.authInfo): AuthValidationEx = AuthValidationEx(header = header, hRasConnectionCtorArg = hRasConnection, wszUserName = wszUserName, wszLogonDomain = wszLogonDomain, authInfoSize = authInfoSize, authInfo = authInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AuthValidationEx) return false
        if (this.header != other.header) return false
        if (this.hRasConnection != other.hRasConnection) return false
        if (!this.wszUserName.contentEquals(other.wszUserName)) return false
        if (!this.wszLogonDomain.contentEquals(other.wszLogonDomain)) return false
        if (this.authInfoSize != other.authInfoSize) return false
        if (!this.authInfo.contentEquals(other.authInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.hRasConnection.hashCode()
        result = 31 * result + this.wszUserName.contentHashCode()
        result = 31 * result + this.wszLogonDomain.contentHashCode()
        result = 31 * result + this.authInfoSize.hashCode()
        result = 31 * result + this.authInfo.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            header: MprapiObjectHeader = MprapiObjectHeader(),
            hRasConnection: Handle = MutPtr(0L),
            wszUserName: UShortArray = UShortArray(257),
            wszLogonDomain: UShortArray = UShortArray(16),
            authInfoSize: UInt = 0u,
            authInfo: UByteArray = UByteArray(1),
        ): AuthValidationEx =
            AuthValidationEx(
                header = header,
                hRasConnectionCtorArg = hRasConnection,
                wszUserName = wszUserName,
                wszLogonDomain = wszLogonDomain,
                authInfoSize = authInfoSize,
                authInfo = authInfo,
            )
    }
}

public data class GreConfigParams0(
    public var dwNumPorts: UInt = 0u,
    public var dwPortFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GreConfigParams0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GreConfigParams0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): GreConfigParams0 =
                    GreConfigParams0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: GreConfigParams0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumPorts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwPortFlags)
                }
            }
    }
}

public data class Ikev2ConfigParams(
    public var dwNumPorts: UInt = 0u,
    public var dwPortFlags: UInt = 0u,
    public var dwTunnelConfigParamFlags: UInt = 0u,
    public var tunnelConfigParams: Ikev2TunnelConfigParams4 = Ikev2TunnelConfigParams4(),
)

public data class Ikev2ProjectionInfo(
    public var dwIPv4NegotiationError: UInt = 0u,
    public var wszAddress: UShortArray = UShortArray(16),
    public var wszRemoteAddress: UShortArray = UShortArray(16),
    public var iPv4SubInterfaceIndex: ULong = 0uL,
    public var dwIPv6NegotiationError: UInt = 0u,
    public var bInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bRemoteInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bPrefix: UByteArray = UByteArray(8),
    public var dwPrefixLength: UInt = 0u,
    public var iPv6SubInterfaceIndex: ULong = 0uL,
    public var dwOptions: UInt = 0u,
    public var dwAuthenticationProtocol: UInt = 0u,
    public var dwEapTypeId: UInt = 0u,
    public var dwCompressionAlgorithm: UInt = 0u,
    public var dwEncryptionMethod: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ikev2ProjectionInfo) return false
        if (this.dwIPv4NegotiationError != other.dwIPv4NegotiationError) return false
        if (!this.wszAddress.contentEquals(other.wszAddress)) return false
        if (!this.wszRemoteAddress.contentEquals(other.wszRemoteAddress)) return false
        if (this.iPv4SubInterfaceIndex != other.iPv4SubInterfaceIndex) return false
        if (this.dwIPv6NegotiationError != other.dwIPv6NegotiationError) return false
        if (!this.bInterfaceIdentifier.contentEquals(other.bInterfaceIdentifier)) return false
        if (!this.bRemoteInterfaceIdentifier.contentEquals(other.bRemoteInterfaceIdentifier)) return false
        if (!this.bPrefix.contentEquals(other.bPrefix)) return false
        if (this.dwPrefixLength != other.dwPrefixLength) return false
        if (this.iPv6SubInterfaceIndex != other.iPv6SubInterfaceIndex) return false
        if (this.dwOptions != other.dwOptions) return false
        if (this.dwAuthenticationProtocol != other.dwAuthenticationProtocol) return false
        if (this.dwEapTypeId != other.dwEapTypeId) return false
        if (this.dwCompressionAlgorithm != other.dwCompressionAlgorithm) return false
        if (this.dwEncryptionMethod != other.dwEncryptionMethod) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwIPv4NegotiationError.hashCode()
        result = 31 * result + this.wszAddress.contentHashCode()
        result = 31 * result + this.wszRemoteAddress.contentHashCode()
        result = 31 * result + this.iPv4SubInterfaceIndex.hashCode()
        result = 31 * result + this.dwIPv6NegotiationError.hashCode()
        result = 31 * result + this.bInterfaceIdentifier.contentHashCode()
        result = 31 * result + this.bRemoteInterfaceIdentifier.contentHashCode()
        result = 31 * result + this.bPrefix.contentHashCode()
        result = 31 * result + this.dwPrefixLength.hashCode()
        result = 31 * result + this.iPv6SubInterfaceIndex.hashCode()
        result = 31 * result + this.dwOptions.hashCode()
        result = 31 * result + this.dwAuthenticationProtocol.hashCode()
        result = 31 * result + this.dwEapTypeId.hashCode()
        result = 31 * result + this.dwCompressionAlgorithm.hashCode()
        result = 31 * result + this.dwEncryptionMethod.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ikev2ProjectionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ikev2ProjectionInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 144L
                override fun readNative(addr: Long): Ikev2ProjectionInfo =
                    Ikev2ProjectionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                        ).readNative(addr + 36L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 84L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 92L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 100L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 108L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 124L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L),
                    )
                override fun writeNative(addr: Long, value: Ikev2ProjectionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwIPv4NegotiationError)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                    ).writeNative(addr + 4L, value.wszAddress.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                    ).writeNative(addr + 36L, value.wszRemoteAddress.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.iPv4SubInterfaceIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.dwIPv6NegotiationError)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 84L, value.bInterfaceIdentifier.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 92L, value.bRemoteInterfaceIdentifier.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 100L, value.bPrefix.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.dwPrefixLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.iPv6SubInterfaceIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 120L, value.dwOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 124L, value.dwAuthenticationProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.dwEapTypeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 132L, value.dwCompressionAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.dwEncryptionMethod)
                }
            }
    }
}

public data class Ikev2ProjectionInfo2(
    public var dwIPv4NegotiationError: UInt = 0u,
    public var wszAddress: UShortArray = UShortArray(16),
    public var wszRemoteAddress: UShortArray = UShortArray(16),
    public var iPv4SubInterfaceIndex: ULong = 0uL,
    public var dwIPv6NegotiationError: UInt = 0u,
    public var bInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bRemoteInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bPrefix: UByteArray = UByteArray(8),
    public var dwPrefixLength: UInt = 0u,
    public var iPv6SubInterfaceIndex: ULong = 0uL,
    public var dwOptions: UInt = 0u,
    public var dwAuthenticationProtocol: UInt = 0u,
    public var dwEapTypeId: UInt = 0u,
    public var dwEmbeddedEAPTypeId: UInt = 0u,
    public var dwCompressionAlgorithm: UInt = 0u,
    public var dwEncryptionMethod: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ikev2ProjectionInfo2) return false
        if (this.dwIPv4NegotiationError != other.dwIPv4NegotiationError) return false
        if (!this.wszAddress.contentEquals(other.wszAddress)) return false
        if (!this.wszRemoteAddress.contentEquals(other.wszRemoteAddress)) return false
        if (this.iPv4SubInterfaceIndex != other.iPv4SubInterfaceIndex) return false
        if (this.dwIPv6NegotiationError != other.dwIPv6NegotiationError) return false
        if (!this.bInterfaceIdentifier.contentEquals(other.bInterfaceIdentifier)) return false
        if (!this.bRemoteInterfaceIdentifier.contentEquals(other.bRemoteInterfaceIdentifier)) return false
        if (!this.bPrefix.contentEquals(other.bPrefix)) return false
        if (this.dwPrefixLength != other.dwPrefixLength) return false
        if (this.iPv6SubInterfaceIndex != other.iPv6SubInterfaceIndex) return false
        if (this.dwOptions != other.dwOptions) return false
        if (this.dwAuthenticationProtocol != other.dwAuthenticationProtocol) return false
        if (this.dwEapTypeId != other.dwEapTypeId) return false
        if (this.dwEmbeddedEAPTypeId != other.dwEmbeddedEAPTypeId) return false
        if (this.dwCompressionAlgorithm != other.dwCompressionAlgorithm) return false
        if (this.dwEncryptionMethod != other.dwEncryptionMethod) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwIPv4NegotiationError.hashCode()
        result = 31 * result + this.wszAddress.contentHashCode()
        result = 31 * result + this.wszRemoteAddress.contentHashCode()
        result = 31 * result + this.iPv4SubInterfaceIndex.hashCode()
        result = 31 * result + this.dwIPv6NegotiationError.hashCode()
        result = 31 * result + this.bInterfaceIdentifier.contentHashCode()
        result = 31 * result + this.bRemoteInterfaceIdentifier.contentHashCode()
        result = 31 * result + this.bPrefix.contentHashCode()
        result = 31 * result + this.dwPrefixLength.hashCode()
        result = 31 * result + this.iPv6SubInterfaceIndex.hashCode()
        result = 31 * result + this.dwOptions.hashCode()
        result = 31 * result + this.dwAuthenticationProtocol.hashCode()
        result = 31 * result + this.dwEapTypeId.hashCode()
        result = 31 * result + this.dwEmbeddedEAPTypeId.hashCode()
        result = 31 * result + this.dwCompressionAlgorithm.hashCode()
        result = 31 * result + this.dwEncryptionMethod.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ikev2ProjectionInfo2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ikev2ProjectionInfo2> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 144L
                override fun readNative(addr: Long): Ikev2ProjectionInfo2 =
                    Ikev2ProjectionInfo2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                        ).readNative(addr + 36L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 84L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 92L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 100L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 108L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 124L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 140L),
                    )
                override fun writeNative(addr: Long, value: Ikev2ProjectionInfo2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwIPv4NegotiationError)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                    ).writeNative(addr + 4L, value.wszAddress.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                    ).writeNative(addr + 36L, value.wszRemoteAddress.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.iPv4SubInterfaceIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.dwIPv6NegotiationError)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 84L, value.bInterfaceIdentifier.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 92L, value.bRemoteInterfaceIdentifier.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 100L, value.bPrefix.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.dwPrefixLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.iPv6SubInterfaceIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 120L, value.dwOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 124L, value.dwAuthenticationProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.dwEapTypeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 132L, value.dwEmbeddedEAPTypeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.dwCompressionAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 140L, value.dwEncryptionMethod)
                }
            }
    }
}

public class Ikev2TunnelConfigParams2 internal constructor(
    public var dwIdleTimeout: UInt,
    public var dwNetworkBlackoutTime: UInt,
    public var dwSaLifeTime: UInt,
    public var dwSaDataSizeForRenegotiation: UInt,
    public var dwConfigOptions: UInt,
    public var dwTotalCertificates: UInt,
    certificateNamesCtorArg: MutPtr,
    public var machineCertificateName: CryptIntegerBlob,
    public var dwEncryptionType: UInt,
    customPolicyCtorArg: MutPtr,
) {
    public var certificateNames: MutPtr = certificateNamesCtorArg
        internal set

    public var customPolicy: MutPtr = customPolicyCtorArg
        internal set

    public constructor() : this(
        dwIdleTimeout = 0u,
        dwNetworkBlackoutTime = 0u,
        dwSaLifeTime = 0u,
        dwSaDataSizeForRenegotiation = 0u,
        dwConfigOptions = 0u,
        dwTotalCertificates = 0u,
        certificateNamesCtorArg = MutPtr(0L),
        machineCertificateName = CryptIntegerBlob(),
        dwEncryptionType = 0u,
        customPolicyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwIdleTimeout

    public operator fun component2(): UInt = this.dwNetworkBlackoutTime

    public operator fun component3(): UInt = this.dwSaLifeTime

    public operator fun component4(): UInt = this.dwSaDataSizeForRenegotiation

    public operator fun component5(): UInt = this.dwConfigOptions

    public operator fun component6(): UInt = this.dwTotalCertificates

    public operator fun component7(): MutPtr = this.certificateNames

    public operator fun component8(): CryptIntegerBlob = this.machineCertificateName

    public operator fun component9(): UInt = this.dwEncryptionType

    public operator fun component10(): MutPtr = this.customPolicy

    public fun copy(dwIdleTimeout: UInt = this.dwIdleTimeout, dwNetworkBlackoutTime: UInt = this.dwNetworkBlackoutTime, dwSaLifeTime: UInt = this.dwSaLifeTime, dwSaDataSizeForRenegotiation: UInt = this.dwSaDataSizeForRenegotiation, dwConfigOptions: UInt = this.dwConfigOptions, dwTotalCertificates: UInt = this.dwTotalCertificates, certificateNames: MutPtr = this.certificateNames, machineCertificateName: CryptIntegerBlob = this.machineCertificateName, dwEncryptionType: UInt = this.dwEncryptionType, customPolicy: MutPtr = this.customPolicy): Ikev2TunnelConfigParams2 = Ikev2TunnelConfigParams2(dwIdleTimeout = dwIdleTimeout, dwNetworkBlackoutTime = dwNetworkBlackoutTime, dwSaLifeTime = dwSaLifeTime, dwSaDataSizeForRenegotiation = dwSaDataSizeForRenegotiation, dwConfigOptions = dwConfigOptions, dwTotalCertificates = dwTotalCertificates, certificateNamesCtorArg = certificateNames, machineCertificateName = machineCertificateName, dwEncryptionType = dwEncryptionType, customPolicyCtorArg = customPolicy)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ikev2TunnelConfigParams2) return false
        if (this.dwIdleTimeout != other.dwIdleTimeout) return false
        if (this.dwNetworkBlackoutTime != other.dwNetworkBlackoutTime) return false
        if (this.dwSaLifeTime != other.dwSaLifeTime) return false
        if (this.dwSaDataSizeForRenegotiation != other.dwSaDataSizeForRenegotiation) return false
        if (this.dwConfigOptions != other.dwConfigOptions) return false
        if (this.dwTotalCertificates != other.dwTotalCertificates) return false
        if (this.certificateNames != other.certificateNames) return false
        if (this.machineCertificateName != other.machineCertificateName) return false
        if (this.dwEncryptionType != other.dwEncryptionType) return false
        if (this.customPolicy != other.customPolicy) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwIdleTimeout.hashCode()
        result = 31 * result + this.dwNetworkBlackoutTime.hashCode()
        result = 31 * result + this.dwSaLifeTime.hashCode()
        result = 31 * result + this.dwSaDataSizeForRenegotiation.hashCode()
        result = 31 * result + this.dwConfigOptions.hashCode()
        result = 31 * result + this.dwTotalCertificates.hashCode()
        result = 31 * result + this.certificateNames.hashCode()
        result = 31 * result + this.machineCertificateName.hashCode()
        result = 31 * result + this.dwEncryptionType.hashCode()
        result = 31 * result + this.customPolicy.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwIdleTimeout: UInt = 0u,
            dwNetworkBlackoutTime: UInt = 0u,
            dwSaLifeTime: UInt = 0u,
            dwSaDataSizeForRenegotiation: UInt = 0u,
            dwConfigOptions: UInt = 0u,
            dwTotalCertificates: UInt = 0u,
            certificateNames: MutPtr = MutPtr(0L),
            machineCertificateName: CryptIntegerBlob = CryptIntegerBlob(),
            dwEncryptionType: UInt = 0u,
            customPolicy: MutPtr = MutPtr(0L),
        ): Ikev2TunnelConfigParams2 =
            Ikev2TunnelConfigParams2(
                dwIdleTimeout = dwIdleTimeout,
                dwNetworkBlackoutTime = dwNetworkBlackoutTime,
                dwSaLifeTime = dwSaLifeTime,
                dwSaDataSizeForRenegotiation = dwSaDataSizeForRenegotiation,
                dwConfigOptions = dwConfigOptions,
                dwTotalCertificates = dwTotalCertificates,
                certificateNamesCtorArg = certificateNames,
                machineCertificateName = machineCertificateName,
                dwEncryptionType = dwEncryptionType,
                customPolicyCtorArg = customPolicy,
            )
    }
}

public class Ikev2TunnelConfigParams3 internal constructor(
    public var dwIdleTimeout: UInt,
    public var dwNetworkBlackoutTime: UInt,
    public var dwSaLifeTime: UInt,
    public var dwSaDataSizeForRenegotiation: UInt,
    public var dwConfigOptions: UInt,
    public var dwTotalCertificates: UInt,
    certificateNamesCtorArg: MutPtr,
    public var machineCertificateName: CryptIntegerBlob,
    public var dwEncryptionType: UInt,
    customPolicyCtorArg: MutPtr,
    public var dwTotalEkus: UInt,
    certificateEKUsCtorArg: MutPtr,
    public var machineCertificateHash: CryptIntegerBlob,
) {
    public var certificateNames: MutPtr = certificateNamesCtorArg
        internal set

    public var customPolicy: MutPtr = customPolicyCtorArg
        internal set

    public var certificateEKUs: MutPtr = certificateEKUsCtorArg
        internal set

    public constructor() : this(
        dwIdleTimeout = 0u,
        dwNetworkBlackoutTime = 0u,
        dwSaLifeTime = 0u,
        dwSaDataSizeForRenegotiation = 0u,
        dwConfigOptions = 0u,
        dwTotalCertificates = 0u,
        certificateNamesCtorArg = MutPtr(0L),
        machineCertificateName = CryptIntegerBlob(),
        dwEncryptionType = 0u,
        customPolicyCtorArg = MutPtr(0L),
        dwTotalEkus = 0u,
        certificateEKUsCtorArg = MutPtr(0L),
        machineCertificateHash = CryptIntegerBlob(),
    )

    public operator fun component1(): UInt = this.dwIdleTimeout

    public operator fun component2(): UInt = this.dwNetworkBlackoutTime

    public operator fun component3(): UInt = this.dwSaLifeTime

    public operator fun component4(): UInt = this.dwSaDataSizeForRenegotiation

    public operator fun component5(): UInt = this.dwConfigOptions

    public operator fun component6(): UInt = this.dwTotalCertificates

    public operator fun component7(): MutPtr = this.certificateNames

    public operator fun component8(): CryptIntegerBlob = this.machineCertificateName

    public operator fun component9(): UInt = this.dwEncryptionType

    public operator fun component10(): MutPtr = this.customPolicy

    public operator fun component11(): UInt = this.dwTotalEkus

    public operator fun component12(): MutPtr = this.certificateEKUs

    public operator fun component13(): CryptIntegerBlob = this.machineCertificateHash

    public fun copy(dwIdleTimeout: UInt = this.dwIdleTimeout, dwNetworkBlackoutTime: UInt = this.dwNetworkBlackoutTime, dwSaLifeTime: UInt = this.dwSaLifeTime, dwSaDataSizeForRenegotiation: UInt = this.dwSaDataSizeForRenegotiation, dwConfigOptions: UInt = this.dwConfigOptions, dwTotalCertificates: UInt = this.dwTotalCertificates, certificateNames: MutPtr = this.certificateNames, machineCertificateName: CryptIntegerBlob = this.machineCertificateName, dwEncryptionType: UInt = this.dwEncryptionType, customPolicy: MutPtr = this.customPolicy, dwTotalEkus: UInt = this.dwTotalEkus, certificateEKUs: MutPtr = this.certificateEKUs, machineCertificateHash: CryptIntegerBlob = this.machineCertificateHash): Ikev2TunnelConfigParams3 = Ikev2TunnelConfigParams3(dwIdleTimeout = dwIdleTimeout, dwNetworkBlackoutTime = dwNetworkBlackoutTime, dwSaLifeTime = dwSaLifeTime, dwSaDataSizeForRenegotiation = dwSaDataSizeForRenegotiation, dwConfigOptions = dwConfigOptions, dwTotalCertificates = dwTotalCertificates, certificateNamesCtorArg = certificateNames, machineCertificateName = machineCertificateName, dwEncryptionType = dwEncryptionType, customPolicyCtorArg = customPolicy, dwTotalEkus = dwTotalEkus, certificateEKUsCtorArg = certificateEKUs, machineCertificateHash = machineCertificateHash)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ikev2TunnelConfigParams3) return false
        if (this.dwIdleTimeout != other.dwIdleTimeout) return false
        if (this.dwNetworkBlackoutTime != other.dwNetworkBlackoutTime) return false
        if (this.dwSaLifeTime != other.dwSaLifeTime) return false
        if (this.dwSaDataSizeForRenegotiation != other.dwSaDataSizeForRenegotiation) return false
        if (this.dwConfigOptions != other.dwConfigOptions) return false
        if (this.dwTotalCertificates != other.dwTotalCertificates) return false
        if (this.certificateNames != other.certificateNames) return false
        if (this.machineCertificateName != other.machineCertificateName) return false
        if (this.dwEncryptionType != other.dwEncryptionType) return false
        if (this.customPolicy != other.customPolicy) return false
        if (this.dwTotalEkus != other.dwTotalEkus) return false
        if (this.certificateEKUs != other.certificateEKUs) return false
        if (this.machineCertificateHash != other.machineCertificateHash) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwIdleTimeout.hashCode()
        result = 31 * result + this.dwNetworkBlackoutTime.hashCode()
        result = 31 * result + this.dwSaLifeTime.hashCode()
        result = 31 * result + this.dwSaDataSizeForRenegotiation.hashCode()
        result = 31 * result + this.dwConfigOptions.hashCode()
        result = 31 * result + this.dwTotalCertificates.hashCode()
        result = 31 * result + this.certificateNames.hashCode()
        result = 31 * result + this.machineCertificateName.hashCode()
        result = 31 * result + this.dwEncryptionType.hashCode()
        result = 31 * result + this.customPolicy.hashCode()
        result = 31 * result + this.dwTotalEkus.hashCode()
        result = 31 * result + this.certificateEKUs.hashCode()
        result = 31 * result + this.machineCertificateHash.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwIdleTimeout: UInt = 0u,
            dwNetworkBlackoutTime: UInt = 0u,
            dwSaLifeTime: UInt = 0u,
            dwSaDataSizeForRenegotiation: UInt = 0u,
            dwConfigOptions: UInt = 0u,
            dwTotalCertificates: UInt = 0u,
            certificateNames: MutPtr = MutPtr(0L),
            machineCertificateName: CryptIntegerBlob = CryptIntegerBlob(),
            dwEncryptionType: UInt = 0u,
            customPolicy: MutPtr = MutPtr(0L),
            dwTotalEkus: UInt = 0u,
            certificateEKUs: MutPtr = MutPtr(0L),
            machineCertificateHash: CryptIntegerBlob = CryptIntegerBlob(),
        ): Ikev2TunnelConfigParams3 =
            Ikev2TunnelConfigParams3(
                dwIdleTimeout = dwIdleTimeout,
                dwNetworkBlackoutTime = dwNetworkBlackoutTime,
                dwSaLifeTime = dwSaLifeTime,
                dwSaDataSizeForRenegotiation = dwSaDataSizeForRenegotiation,
                dwConfigOptions = dwConfigOptions,
                dwTotalCertificates = dwTotalCertificates,
                certificateNamesCtorArg = certificateNames,
                machineCertificateName = machineCertificateName,
                dwEncryptionType = dwEncryptionType,
                customPolicyCtorArg = customPolicy,
                dwTotalEkus = dwTotalEkus,
                certificateEKUsCtorArg = certificateEKUs,
                machineCertificateHash = machineCertificateHash,
            )
    }
}

public class Ikev2TunnelConfigParams4 internal constructor(
    public var dwIdleTimeout: UInt,
    public var dwNetworkBlackoutTime: UInt,
    public var dwSaLifeTime: UInt,
    public var dwSaDataSizeForRenegotiation: UInt,
    public var dwConfigOptions: UInt,
    public var dwTotalCertificates: UInt,
    certificateNamesCtorArg: MutPtr,
    public var machineCertificateName: CryptIntegerBlob,
    public var dwEncryptionType: UInt,
    customPolicyCtorArg: MutPtr,
    public var dwTotalEkus: UInt,
    certificateEKUsCtorArg: MutPtr,
    public var machineCertificateHash: CryptIntegerBlob,
    public var dwMmSaLifeTime: UInt,
) {
    public var certificateNames: MutPtr = certificateNamesCtorArg
        internal set

    public var customPolicy: MutPtr = customPolicyCtorArg
        internal set

    public var certificateEKUs: MutPtr = certificateEKUsCtorArg
        internal set

    public constructor() : this(
        dwIdleTimeout = 0u,
        dwNetworkBlackoutTime = 0u,
        dwSaLifeTime = 0u,
        dwSaDataSizeForRenegotiation = 0u,
        dwConfigOptions = 0u,
        dwTotalCertificates = 0u,
        certificateNamesCtorArg = MutPtr(0L),
        machineCertificateName = CryptIntegerBlob(),
        dwEncryptionType = 0u,
        customPolicyCtorArg = MutPtr(0L),
        dwTotalEkus = 0u,
        certificateEKUsCtorArg = MutPtr(0L),
        machineCertificateHash = CryptIntegerBlob(),
        dwMmSaLifeTime = 0u,
    )

    public operator fun component1(): UInt = this.dwIdleTimeout

    public operator fun component2(): UInt = this.dwNetworkBlackoutTime

    public operator fun component3(): UInt = this.dwSaLifeTime

    public operator fun component4(): UInt = this.dwSaDataSizeForRenegotiation

    public operator fun component5(): UInt = this.dwConfigOptions

    public operator fun component6(): UInt = this.dwTotalCertificates

    public operator fun component7(): MutPtr = this.certificateNames

    public operator fun component8(): CryptIntegerBlob = this.machineCertificateName

    public operator fun component9(): UInt = this.dwEncryptionType

    public operator fun component10(): MutPtr = this.customPolicy

    public operator fun component11(): UInt = this.dwTotalEkus

    public operator fun component12(): MutPtr = this.certificateEKUs

    public operator fun component13(): CryptIntegerBlob = this.machineCertificateHash

    public operator fun component14(): UInt = this.dwMmSaLifeTime

    public fun copy(dwIdleTimeout: UInt = this.dwIdleTimeout, dwNetworkBlackoutTime: UInt = this.dwNetworkBlackoutTime, dwSaLifeTime: UInt = this.dwSaLifeTime, dwSaDataSizeForRenegotiation: UInt = this.dwSaDataSizeForRenegotiation, dwConfigOptions: UInt = this.dwConfigOptions, dwTotalCertificates: UInt = this.dwTotalCertificates, certificateNames: MutPtr = this.certificateNames, machineCertificateName: CryptIntegerBlob = this.machineCertificateName, dwEncryptionType: UInt = this.dwEncryptionType, customPolicy: MutPtr = this.customPolicy, dwTotalEkus: UInt = this.dwTotalEkus, certificateEKUs: MutPtr = this.certificateEKUs, machineCertificateHash: CryptIntegerBlob = this.machineCertificateHash, dwMmSaLifeTime: UInt = this.dwMmSaLifeTime): Ikev2TunnelConfigParams4 = Ikev2TunnelConfigParams4(dwIdleTimeout = dwIdleTimeout, dwNetworkBlackoutTime = dwNetworkBlackoutTime, dwSaLifeTime = dwSaLifeTime, dwSaDataSizeForRenegotiation = dwSaDataSizeForRenegotiation, dwConfigOptions = dwConfigOptions, dwTotalCertificates = dwTotalCertificates, certificateNamesCtorArg = certificateNames, machineCertificateName = machineCertificateName, dwEncryptionType = dwEncryptionType, customPolicyCtorArg = customPolicy, dwTotalEkus = dwTotalEkus, certificateEKUsCtorArg = certificateEKUs, machineCertificateHash = machineCertificateHash, dwMmSaLifeTime = dwMmSaLifeTime)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ikev2TunnelConfigParams4) return false
        if (this.dwIdleTimeout != other.dwIdleTimeout) return false
        if (this.dwNetworkBlackoutTime != other.dwNetworkBlackoutTime) return false
        if (this.dwSaLifeTime != other.dwSaLifeTime) return false
        if (this.dwSaDataSizeForRenegotiation != other.dwSaDataSizeForRenegotiation) return false
        if (this.dwConfigOptions != other.dwConfigOptions) return false
        if (this.dwTotalCertificates != other.dwTotalCertificates) return false
        if (this.certificateNames != other.certificateNames) return false
        if (this.machineCertificateName != other.machineCertificateName) return false
        if (this.dwEncryptionType != other.dwEncryptionType) return false
        if (this.customPolicy != other.customPolicy) return false
        if (this.dwTotalEkus != other.dwTotalEkus) return false
        if (this.certificateEKUs != other.certificateEKUs) return false
        if (this.machineCertificateHash != other.machineCertificateHash) return false
        if (this.dwMmSaLifeTime != other.dwMmSaLifeTime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwIdleTimeout.hashCode()
        result = 31 * result + this.dwNetworkBlackoutTime.hashCode()
        result = 31 * result + this.dwSaLifeTime.hashCode()
        result = 31 * result + this.dwSaDataSizeForRenegotiation.hashCode()
        result = 31 * result + this.dwConfigOptions.hashCode()
        result = 31 * result + this.dwTotalCertificates.hashCode()
        result = 31 * result + this.certificateNames.hashCode()
        result = 31 * result + this.machineCertificateName.hashCode()
        result = 31 * result + this.dwEncryptionType.hashCode()
        result = 31 * result + this.customPolicy.hashCode()
        result = 31 * result + this.dwTotalEkus.hashCode()
        result = 31 * result + this.certificateEKUs.hashCode()
        result = 31 * result + this.machineCertificateHash.hashCode()
        result = 31 * result + this.dwMmSaLifeTime.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwIdleTimeout: UInt = 0u,
            dwNetworkBlackoutTime: UInt = 0u,
            dwSaLifeTime: UInt = 0u,
            dwSaDataSizeForRenegotiation: UInt = 0u,
            dwConfigOptions: UInt = 0u,
            dwTotalCertificates: UInt = 0u,
            certificateNames: MutPtr = MutPtr(0L),
            machineCertificateName: CryptIntegerBlob = CryptIntegerBlob(),
            dwEncryptionType: UInt = 0u,
            customPolicy: MutPtr = MutPtr(0L),
            dwTotalEkus: UInt = 0u,
            certificateEKUs: MutPtr = MutPtr(0L),
            machineCertificateHash: CryptIntegerBlob = CryptIntegerBlob(),
            dwMmSaLifeTime: UInt = 0u,
        ): Ikev2TunnelConfigParams4 =
            Ikev2TunnelConfigParams4(
                dwIdleTimeout = dwIdleTimeout,
                dwNetworkBlackoutTime = dwNetworkBlackoutTime,
                dwSaLifeTime = dwSaLifeTime,
                dwSaDataSizeForRenegotiation = dwSaDataSizeForRenegotiation,
                dwConfigOptions = dwConfigOptions,
                dwTotalCertificates = dwTotalCertificates,
                certificateNamesCtorArg = certificateNames,
                machineCertificateName = machineCertificateName,
                dwEncryptionType = dwEncryptionType,
                customPolicyCtorArg = customPolicy,
                dwTotalEkus = dwTotalEkus,
                certificateEKUsCtorArg = certificateEKUs,
                machineCertificateHash = machineCertificateHash,
                dwMmSaLifeTime = dwMmSaLifeTime,
            )
    }
}

public data class L2tpConfigParams0(
    public var dwNumPorts: UInt = 0u,
    public var dwPortFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<L2tpConfigParams0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<L2tpConfigParams0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): L2tpConfigParams0 =
                    L2tpConfigParams0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: L2tpConfigParams0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumPorts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwPortFlags)
                }
            }
    }
}

public data class L2tpConfigParams1(
    public var dwNumPorts: UInt = 0u,
    public var dwPortFlags: UInt = 0u,
    public var dwTunnelConfigParamFlags: UInt = 0u,
    public var tunnelConfigParams: L2tpTunnelConfigParams2 = L2tpTunnelConfigParams2(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<L2tpConfigParams1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<L2tpConfigParams1> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): L2tpConfigParams1 =
                    L2tpConfigParams1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (L2tpTunnelConfigParams2.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: L2tpConfigParams1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumPorts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwPortFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwTunnelConfigParamFlags)
                    (L2tpTunnelConfigParams2.typeLayout()).writeNative(addr + 16L, value.tunnelConfigParams)
                }
            }
    }
}

public class L2tpTunnelConfigParams1 internal constructor(
    public var dwIdleTimeout: UInt,
    public var dwEncryptionType: UInt,
    public var dwSaLifeTime: UInt,
    public var dwSaDataSizeForRenegotiation: UInt,
    customPolicyCtorArg: MutPtr,
) {
    public var customPolicy: MutPtr = customPolicyCtorArg
        internal set

    public constructor() : this(
        dwIdleTimeout = 0u,
        dwEncryptionType = 0u,
        dwSaLifeTime = 0u,
        dwSaDataSizeForRenegotiation = 0u,
        customPolicyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwIdleTimeout

    public operator fun component2(): UInt = this.dwEncryptionType

    public operator fun component3(): UInt = this.dwSaLifeTime

    public operator fun component4(): UInt = this.dwSaDataSizeForRenegotiation

    public operator fun component5(): MutPtr = this.customPolicy

    public fun copy(dwIdleTimeout: UInt = this.dwIdleTimeout, dwEncryptionType: UInt = this.dwEncryptionType, dwSaLifeTime: UInt = this.dwSaLifeTime, dwSaDataSizeForRenegotiation: UInt = this.dwSaDataSizeForRenegotiation, customPolicy: MutPtr = this.customPolicy): L2tpTunnelConfigParams1 = L2tpTunnelConfigParams1(dwIdleTimeout = dwIdleTimeout, dwEncryptionType = dwEncryptionType, dwSaLifeTime = dwSaLifeTime, dwSaDataSizeForRenegotiation = dwSaDataSizeForRenegotiation, customPolicyCtorArg = customPolicy)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is L2tpTunnelConfigParams1) return false
        if (this.dwIdleTimeout != other.dwIdleTimeout) return false
        if (this.dwEncryptionType != other.dwEncryptionType) return false
        if (this.dwSaLifeTime != other.dwSaLifeTime) return false
        if (this.dwSaDataSizeForRenegotiation != other.dwSaDataSizeForRenegotiation) return false
        if (this.customPolicy != other.customPolicy) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwIdleTimeout.hashCode()
        result = 31 * result + this.dwEncryptionType.hashCode()
        result = 31 * result + this.dwSaLifeTime.hashCode()
        result = 31 * result + this.dwSaDataSizeForRenegotiation.hashCode()
        result = 31 * result + this.customPolicy.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<L2tpTunnelConfigParams1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<L2tpTunnelConfigParams1> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): L2tpTunnelConfigParams1 =
                    L2tpTunnelConfigParams1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: L2tpTunnelConfigParams1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwIdleTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwEncryptionType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwSaLifeTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwSaDataSizeForRenegotiation)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.customPolicy)
                }
            }

        public operator fun invoke(
            dwIdleTimeout: UInt = 0u,
            dwEncryptionType: UInt = 0u,
            dwSaLifeTime: UInt = 0u,
            dwSaDataSizeForRenegotiation: UInt = 0u,
            customPolicy: MutPtr = MutPtr(0L),
        ): L2tpTunnelConfigParams1 =
            L2tpTunnelConfigParams1(
                dwIdleTimeout = dwIdleTimeout,
                dwEncryptionType = dwEncryptionType,
                dwSaLifeTime = dwSaLifeTime,
                dwSaDataSizeForRenegotiation = dwSaDataSizeForRenegotiation,
                customPolicyCtorArg = customPolicy,
            )
    }
}

public class L2tpTunnelConfigParams2 internal constructor(
    public var dwIdleTimeout: UInt,
    public var dwEncryptionType: UInt,
    public var dwSaLifeTime: UInt,
    public var dwSaDataSizeForRenegotiation: UInt,
    customPolicyCtorArg: MutPtr,
    public var dwMmSaLifeTime: UInt,
) {
    public var customPolicy: MutPtr = customPolicyCtorArg
        internal set

    public constructor() : this(
        dwIdleTimeout = 0u,
        dwEncryptionType = 0u,
        dwSaLifeTime = 0u,
        dwSaDataSizeForRenegotiation = 0u,
        customPolicyCtorArg = MutPtr(0L),
        dwMmSaLifeTime = 0u,
    )

    public operator fun component1(): UInt = this.dwIdleTimeout

    public operator fun component2(): UInt = this.dwEncryptionType

    public operator fun component3(): UInt = this.dwSaLifeTime

    public operator fun component4(): UInt = this.dwSaDataSizeForRenegotiation

    public operator fun component5(): MutPtr = this.customPolicy

    public operator fun component6(): UInt = this.dwMmSaLifeTime

    public fun copy(dwIdleTimeout: UInt = this.dwIdleTimeout, dwEncryptionType: UInt = this.dwEncryptionType, dwSaLifeTime: UInt = this.dwSaLifeTime, dwSaDataSizeForRenegotiation: UInt = this.dwSaDataSizeForRenegotiation, customPolicy: MutPtr = this.customPolicy, dwMmSaLifeTime: UInt = this.dwMmSaLifeTime): L2tpTunnelConfigParams2 = L2tpTunnelConfigParams2(dwIdleTimeout = dwIdleTimeout, dwEncryptionType = dwEncryptionType, dwSaLifeTime = dwSaLifeTime, dwSaDataSizeForRenegotiation = dwSaDataSizeForRenegotiation, customPolicyCtorArg = customPolicy, dwMmSaLifeTime = dwMmSaLifeTime)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is L2tpTunnelConfigParams2) return false
        if (this.dwIdleTimeout != other.dwIdleTimeout) return false
        if (this.dwEncryptionType != other.dwEncryptionType) return false
        if (this.dwSaLifeTime != other.dwSaLifeTime) return false
        if (this.dwSaDataSizeForRenegotiation != other.dwSaDataSizeForRenegotiation) return false
        if (this.customPolicy != other.customPolicy) return false
        if (this.dwMmSaLifeTime != other.dwMmSaLifeTime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwIdleTimeout.hashCode()
        result = 31 * result + this.dwEncryptionType.hashCode()
        result = 31 * result + this.dwSaLifeTime.hashCode()
        result = 31 * result + this.dwSaDataSizeForRenegotiation.hashCode()
        result = 31 * result + this.customPolicy.hashCode()
        result = 31 * result + this.dwMmSaLifeTime.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<L2tpTunnelConfigParams2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<L2tpTunnelConfigParams2> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): L2tpTunnelConfigParams2 =
                    L2tpTunnelConfigParams2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: L2tpTunnelConfigParams2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwIdleTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwEncryptionType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwSaLifeTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwSaDataSizeForRenegotiation)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.customPolicy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwMmSaLifeTime)
                }
            }

        public operator fun invoke(
            dwIdleTimeout: UInt = 0u,
            dwEncryptionType: UInt = 0u,
            dwSaLifeTime: UInt = 0u,
            dwSaDataSizeForRenegotiation: UInt = 0u,
            customPolicy: MutPtr = MutPtr(0L),
            dwMmSaLifeTime: UInt = 0u,
        ): L2tpTunnelConfigParams2 =
            L2tpTunnelConfigParams2(
                dwIdleTimeout = dwIdleTimeout,
                dwEncryptionType = dwEncryptionType,
                dwSaLifeTime = dwSaLifeTime,
                dwSaDataSizeForRenegotiation = dwSaDataSizeForRenegotiation,
                customPolicyCtorArg = customPolicy,
                dwMmSaLifeTime = dwMmSaLifeTime,
            )
    }
}

public data class MgmIfEntry(
    public var dwIfIndex: UInt = 0u,
    public var dwIfNextHopAddr: UInt = 0u,
    public var bIGMP: Bool = 0,
    public var bIsEnabled: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MgmIfEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MgmIfEntry> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MgmIfEntry =
                    MgmIfEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: MgmIfEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwIfIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwIfNextHopAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.bIGMP)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.bIsEnabled)
                }
            }
    }
}

public data class MprapiAdminDllCallbacks(
    public var revision: UByte = 0u,
    public var lpfnMprAdminGetIpAddressForUser: Pmpradmingetipaddressforuser = null,
    public var lpfnMprAdminReleaseIpAddress: Pmpradminreleaseipadress = null,
    public var lpfnMprAdminGetIpv6AddressForUser: Pmpradmingetipv6addressforuser = null,
    public var lpfnMprAdminReleaseIpV6AddressForUser: Pmpradminreleaseipv6addressforuser = null,
    public var lpfnRasAdminAcceptNewLink: Pmpradminacceptnewlink = null,
    public var lpfnRasAdminLinkHangupNotification: Pmpradminlinkhangupnotification = null,
    public var lpfnRasAdminTerminateDll: Pmpradminterminatedll = null,
    public var lpfnRasAdminAcceptNewConnectionEx: Pmpradminacceptnewconnectionex = null,
    public var lpfnRasAdminAcceptEndpointChangeEx: Pmpradminaccepttunnelendpointchangeex = null,
    public var lpfnRasAdminAcceptReauthenticationEx: Pmpradminacceptreauthenticationex = null,
    public var lpfnRasAdminConnectionHangupNotificationEx: Pmpradminconnectionhangupnotificationex = null,
    public var lpfnRASValidatePreAuthenticatedConnectionEx: Pmpradminrasvalidatepreauthenticatedconnectionex = null,
)

public data class MprapiObjectHeader(
    public var revision: UByte = 0u,
    public var type: UByte = 0u,
    public var size: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MprapiObjectHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MprapiObjectHeader> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): MprapiObjectHeader =
                    MprapiObjectHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: MprapiObjectHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.revision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.size)
                }
            }
    }
}

public data class MprapiTunnelConfigParams0(
    public var ikeConfigParams: Ikev2ConfigParams = Ikev2ConfigParams(),
    public var pptpConfigParams: PptpConfigParams = PptpConfigParams(),
    public var l2tpConfigParams: L2tpConfigParams1 = L2tpConfigParams1(),
    public var sstpConfigParams: SstpConfigParams = SstpConfigParams(),
)

public data class MprapiTunnelConfigParams1(
    public var ikeConfigParams: Ikev2ConfigParams = Ikev2ConfigParams(),
    public var pptpConfigParams: PptpConfigParams = PptpConfigParams(),
    public var l2tpConfigParams: L2tpConfigParams1 = L2tpConfigParams1(),
    public var sstpConfigParams: SstpConfigParams = SstpConfigParams(),
    public var gREConfigParams: GreConfigParams0 = GreConfigParams0(),
)

public class MprCertEku internal constructor(
    public var dwSize: UInt,
    public var isEKUOID: Bool,
    pwszEKUCtorArg: Pwstr,
) {
    public var pwszEKU: Pwstr = pwszEKUCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        isEKUOID = 0,
        pwszEKUCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Bool = this.isEKUOID

    public operator fun component3(): Pwstr = this.pwszEKU

    public fun copy(dwSize: UInt = this.dwSize, isEKUOID: Bool = this.isEKUOID, pwszEKU: Pwstr = this.pwszEKU): MprCertEku = MprCertEku(dwSize = dwSize, isEKUOID = isEKUOID, pwszEKUCtorArg = pwszEKU)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MprCertEku) return false
        if (this.dwSize != other.dwSize) return false
        if (this.isEKUOID != other.isEKUOID) return false
        if (this.pwszEKU != other.pwszEKU) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.isEKUOID.hashCode()
        result = 31 * result + this.pwszEKU.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            isEKUOID: Bool = 0,
            pwszEKU: Pwstr = MutPtr(0L),
        ): MprCertEku =
            MprCertEku(
                dwSize = dwSize,
                isEKUOID = isEKUOID,
                pwszEKUCtorArg = pwszEKU,
            )
    }
}

public class MprCredentialsex0 internal constructor(
    public var dwSize: UInt,
    lpbCredentialsInfoCtorArg: MutPtr,
) {
    public var lpbCredentialsInfo: MutPtr = lpbCredentialsInfoCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        lpbCredentialsInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): MutPtr = this.lpbCredentialsInfo

    public fun copy(dwSize: UInt = this.dwSize, lpbCredentialsInfo: MutPtr = this.lpbCredentialsInfo): MprCredentialsex0 = MprCredentialsex0(dwSize = dwSize, lpbCredentialsInfoCtorArg = lpbCredentialsInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MprCredentialsex0) return false
        if (this.dwSize != other.dwSize) return false
        if (this.lpbCredentialsInfo != other.lpbCredentialsInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.lpbCredentialsInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MprCredentialsex0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MprCredentialsex0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MprCredentialsex0 =
                    MprCredentialsex0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MprCredentialsex0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpbCredentialsInfo)
                }
            }

        public operator fun invoke(
            dwSize: UInt = 0u,
            lpbCredentialsInfo: MutPtr = MutPtr(0L),
        ): MprCredentialsex0 =
            MprCredentialsex0(
                dwSize = dwSize,
                lpbCredentialsInfoCtorArg = lpbCredentialsInfo,
            )
    }
}

public class MprCredentialsex1 internal constructor(
    public var dwSize: UInt,
    lpbCredentialsInfoCtorArg: MutPtr,
) {
    public var lpbCredentialsInfo: MutPtr = lpbCredentialsInfoCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        lpbCredentialsInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): MutPtr = this.lpbCredentialsInfo

    public fun copy(dwSize: UInt = this.dwSize, lpbCredentialsInfo: MutPtr = this.lpbCredentialsInfo): MprCredentialsex1 = MprCredentialsex1(dwSize = dwSize, lpbCredentialsInfoCtorArg = lpbCredentialsInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MprCredentialsex1) return false
        if (this.dwSize != other.dwSize) return false
        if (this.lpbCredentialsInfo != other.lpbCredentialsInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.lpbCredentialsInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MprCredentialsex1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MprCredentialsex1> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MprCredentialsex1 =
                    MprCredentialsex1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MprCredentialsex1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lpbCredentialsInfo)
                }
            }

        public operator fun invoke(
            dwSize: UInt = 0u,
            lpbCredentialsInfo: MutPtr = MutPtr(0L),
        ): MprCredentialsex1 =
            MprCredentialsex1(
                dwSize = dwSize,
                lpbCredentialsInfoCtorArg = lpbCredentialsInfo,
            )
    }
}

public data class MprDevice0(
    public var szDeviceType: UShortArray = UShortArray(17),
    public var szDeviceName: UShortArray = UShortArray(129),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MprDevice0) return false
        if (!this.szDeviceType.contentEquals(other.szDeviceType)) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szDeviceType.contentHashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MprDevice0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MprDevice0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 292L
                override fun readNative(addr: Long): MprDevice0 =
                    MprDevice0(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (17).toInt())
                        ).readNative(addr).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (129).toInt())
                        ).readNative(addr + 34L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: MprDevice0) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (17).toInt())
                    ).writeNative(addr, value.szDeviceType.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (129).toInt())
                    ).writeNative(addr + 34L, value.szDeviceName.toList())
                }
            }
    }
}

public class MprDevice1 internal constructor(
    public var szDeviceType: UShortArray,
    public var szDeviceName: UShortArray,
    public var szLocalPhoneNumber: UShortArray,
    szAlternatesCtorArg: Pwstr,
) {
    public var szAlternates: Pwstr = szAlternatesCtorArg
        internal set

    public constructor() : this(
        szDeviceType = UShortArray(17),
        szDeviceName = UShortArray(129),
        szLocalPhoneNumber = UShortArray(129),
        szAlternatesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShortArray = this.szDeviceType

    public operator fun component2(): UShortArray = this.szDeviceName

    public operator fun component3(): UShortArray = this.szLocalPhoneNumber

    public operator fun component4(): Pwstr = this.szAlternates

    public fun copy(szDeviceType: UShortArray = this.szDeviceType, szDeviceName: UShortArray = this.szDeviceName, szLocalPhoneNumber: UShortArray = this.szLocalPhoneNumber, szAlternates: Pwstr = this.szAlternates): MprDevice1 = MprDevice1(szDeviceType = szDeviceType, szDeviceName = szDeviceName, szLocalPhoneNumber = szLocalPhoneNumber, szAlternatesCtorArg = szAlternates)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MprDevice1) return false
        if (!this.szDeviceType.contentEquals(other.szDeviceType)) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        if (!this.szLocalPhoneNumber.contentEquals(other.szLocalPhoneNumber)) return false
        if (this.szAlternates != other.szAlternates) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szDeviceType.contentHashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        result = 31 * result + this.szLocalPhoneNumber.contentHashCode()
        result = 31 * result + this.szAlternates.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            szDeviceType: UShortArray = UShortArray(17),
            szDeviceName: UShortArray = UShortArray(129),
            szLocalPhoneNumber: UShortArray = UShortArray(129),
            szAlternates: Pwstr = MutPtr(0L),
        ): MprDevice1 =
            MprDevice1(
                szDeviceType = szDeviceType,
                szDeviceName = szDeviceName,
                szLocalPhoneNumber = szLocalPhoneNumber,
                szAlternatesCtorArg = szAlternates,
            )
    }
}

public data class MprFilter0(
    public var fEnable: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MprFilter0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MprFilter0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): MprFilter0 =
                    MprFilter0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MprFilter0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.fEnable)
                }
            }
    }
}

public class MprIftransport0 internal constructor(
    public var dwTransportId: UInt,
    hIfTransportCtorArg: Handle,
    public var wszIfTransportName: UShortArray,
) {
    public var hIfTransport: Handle = hIfTransportCtorArg
        internal set

    public constructor() : this(
        dwTransportId = 0u,
        hIfTransportCtorArg = MutPtr(0L),
        wszIfTransportName = UShortArray(41),
    )

    public operator fun component1(): UInt = this.dwTransportId

    public operator fun component2(): Handle = this.hIfTransport

    public operator fun component3(): UShortArray = this.wszIfTransportName

    public fun copy(dwTransportId: UInt = this.dwTransportId, hIfTransport: Handle = this.hIfTransport, wszIfTransportName: UShortArray = this.wszIfTransportName): MprIftransport0 = MprIftransport0(dwTransportId = dwTransportId, hIfTransportCtorArg = hIfTransport, wszIfTransportName = wszIfTransportName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MprIftransport0) return false
        if (this.dwTransportId != other.dwTransportId) return false
        if (this.hIfTransport != other.hIfTransport) return false
        if (!this.wszIfTransportName.contentEquals(other.wszIfTransportName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwTransportId.hashCode()
        result = 31 * result + this.hIfTransport.hashCode()
        result = 31 * result + this.wszIfTransportName.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwTransportId: UInt = 0u,
            hIfTransport: Handle = MutPtr(0L),
            wszIfTransportName: UShortArray = UShortArray(41),
        ): MprIftransport0 =
            MprIftransport0(
                dwTransportId = dwTransportId,
                hIfTransportCtorArg = hIfTransport,
                wszIfTransportName = wszIfTransportName,
            )
    }
}

public data class MprIfCustominfoex0(
    public var header: MprapiObjectHeader = MprapiObjectHeader(),
    public var dwFlags: UInt = 0u,
    public var customIkev2Config: RouterIkev2IfCustomConfig0 = RouterIkev2IfCustomConfig0(),
)

public data class MprIfCustominfoex1(
    public var header: MprapiObjectHeader = MprapiObjectHeader(),
    public var dwFlags: UInt = 0u,
    public var customIkev2Config: RouterIkev2IfCustomConfig1 = RouterIkev2IfCustomConfig1(),
)

public data class MprIfCustominfoex2(
    public var header: MprapiObjectHeader = MprapiObjectHeader(),
    public var dwFlags: UInt = 0u,
    public var customIkev2Config: RouterIkev2IfCustomConfig2 = RouterIkev2IfCustomConfig2(),
)

public class MprInterface0 internal constructor(
    public var wszInterfaceName: UShortArray,
    hInterfaceCtorArg: Handle,
    public var fEnabled: Bool,
    public var dwIfType: RouterInterfaceType,
    public var dwConnectionState: RouterConnectionState,
    public var fUnReachabilityReasons: UInt,
    public var dwLastError: UInt,
) {
    public var hInterface: Handle = hInterfaceCtorArg
        internal set

    public constructor() : this(
        wszInterfaceName = UShortArray(257),
        hInterfaceCtorArg = MutPtr(0L),
        fEnabled = 0,
        dwIfType = 0,
        dwConnectionState = 0,
        fUnReachabilityReasons = 0u,
        dwLastError = 0u,
    )

    public operator fun component1(): UShortArray = this.wszInterfaceName

    public operator fun component2(): Handle = this.hInterface

    public operator fun component3(): Bool = this.fEnabled

    public operator fun component4(): RouterInterfaceType = this.dwIfType

    public operator fun component5(): RouterConnectionState = this.dwConnectionState

    public operator fun component6(): UInt = this.fUnReachabilityReasons

    public operator fun component7(): UInt = this.dwLastError

    public fun copy(wszInterfaceName: UShortArray = this.wszInterfaceName, hInterface: Handle = this.hInterface, fEnabled: Bool = this.fEnabled, dwIfType: RouterInterfaceType = this.dwIfType, dwConnectionState: RouterConnectionState = this.dwConnectionState, fUnReachabilityReasons: UInt = this.fUnReachabilityReasons, dwLastError: UInt = this.dwLastError): MprInterface0 = MprInterface0(wszInterfaceName = wszInterfaceName, hInterfaceCtorArg = hInterface, fEnabled = fEnabled, dwIfType = dwIfType, dwConnectionState = dwConnectionState, fUnReachabilityReasons = fUnReachabilityReasons, dwLastError = dwLastError)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MprInterface0) return false
        if (!this.wszInterfaceName.contentEquals(other.wszInterfaceName)) return false
        if (this.hInterface != other.hInterface) return false
        if (this.fEnabled != other.fEnabled) return false
        if (this.dwIfType != other.dwIfType) return false
        if (this.dwConnectionState != other.dwConnectionState) return false
        if (this.fUnReachabilityReasons != other.fUnReachabilityReasons) return false
        if (this.dwLastError != other.dwLastError) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wszInterfaceName.contentHashCode()
        result = 31 * result + this.hInterface.hashCode()
        result = 31 * result + this.fEnabled.hashCode()
        result = 31 * result + this.dwIfType.hashCode()
        result = 31 * result + this.dwConnectionState.hashCode()
        result = 31 * result + this.fUnReachabilityReasons.hashCode()
        result = 31 * result + this.dwLastError.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            wszInterfaceName: UShortArray = UShortArray(257),
            hInterface: Handle = MutPtr(0L),
            fEnabled: Bool = 0,
            dwIfType: RouterInterfaceType = 0,
            dwConnectionState: RouterConnectionState = 0,
            fUnReachabilityReasons: UInt = 0u,
            dwLastError: UInt = 0u,
        ): MprInterface0 =
            MprInterface0(
                wszInterfaceName = wszInterfaceName,
                hInterfaceCtorArg = hInterface,
                fEnabled = fEnabled,
                dwIfType = dwIfType,
                dwConnectionState = dwConnectionState,
                fUnReachabilityReasons = fUnReachabilityReasons,
                dwLastError = dwLastError,
            )
    }
}

public class MprInterface1 internal constructor(
    public var wszInterfaceName: UShortArray,
    hInterfaceCtorArg: Handle,
    public var fEnabled: Bool,
    public var dwIfType: RouterInterfaceType,
    public var dwConnectionState: RouterConnectionState,
    public var fUnReachabilityReasons: UInt,
    public var dwLastError: UInt,
    lpwsDialoutHoursRestrictionCtorArg: Pwstr,
) {
    public var hInterface: Handle = hInterfaceCtorArg
        internal set

    public var lpwsDialoutHoursRestriction: Pwstr = lpwsDialoutHoursRestrictionCtorArg
        internal set

    public constructor() : this(
        wszInterfaceName = UShortArray(257),
        hInterfaceCtorArg = MutPtr(0L),
        fEnabled = 0,
        dwIfType = 0,
        dwConnectionState = 0,
        fUnReachabilityReasons = 0u,
        dwLastError = 0u,
        lpwsDialoutHoursRestrictionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShortArray = this.wszInterfaceName

    public operator fun component2(): Handle = this.hInterface

    public operator fun component3(): Bool = this.fEnabled

    public operator fun component4(): RouterInterfaceType = this.dwIfType

    public operator fun component5(): RouterConnectionState = this.dwConnectionState

    public operator fun component6(): UInt = this.fUnReachabilityReasons

    public operator fun component7(): UInt = this.dwLastError

    public operator fun component8(): Pwstr = this.lpwsDialoutHoursRestriction

    public fun copy(wszInterfaceName: UShortArray = this.wszInterfaceName, hInterface: Handle = this.hInterface, fEnabled: Bool = this.fEnabled, dwIfType: RouterInterfaceType = this.dwIfType, dwConnectionState: RouterConnectionState = this.dwConnectionState, fUnReachabilityReasons: UInt = this.fUnReachabilityReasons, dwLastError: UInt = this.dwLastError, lpwsDialoutHoursRestriction: Pwstr = this.lpwsDialoutHoursRestriction): MprInterface1 = MprInterface1(wszInterfaceName = wszInterfaceName, hInterfaceCtorArg = hInterface, fEnabled = fEnabled, dwIfType = dwIfType, dwConnectionState = dwConnectionState, fUnReachabilityReasons = fUnReachabilityReasons, dwLastError = dwLastError, lpwsDialoutHoursRestrictionCtorArg = lpwsDialoutHoursRestriction)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MprInterface1) return false
        if (!this.wszInterfaceName.contentEquals(other.wszInterfaceName)) return false
        if (this.hInterface != other.hInterface) return false
        if (this.fEnabled != other.fEnabled) return false
        if (this.dwIfType != other.dwIfType) return false
        if (this.dwConnectionState != other.dwConnectionState) return false
        if (this.fUnReachabilityReasons != other.fUnReachabilityReasons) return false
        if (this.dwLastError != other.dwLastError) return false
        if (this.lpwsDialoutHoursRestriction != other.lpwsDialoutHoursRestriction) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wszInterfaceName.contentHashCode()
        result = 31 * result + this.hInterface.hashCode()
        result = 31 * result + this.fEnabled.hashCode()
        result = 31 * result + this.dwIfType.hashCode()
        result = 31 * result + this.dwConnectionState.hashCode()
        result = 31 * result + this.fUnReachabilityReasons.hashCode()
        result = 31 * result + this.dwLastError.hashCode()
        result = 31 * result + this.lpwsDialoutHoursRestriction.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            wszInterfaceName: UShortArray = UShortArray(257),
            hInterface: Handle = MutPtr(0L),
            fEnabled: Bool = 0,
            dwIfType: RouterInterfaceType = 0,
            dwConnectionState: RouterConnectionState = 0,
            fUnReachabilityReasons: UInt = 0u,
            dwLastError: UInt = 0u,
            lpwsDialoutHoursRestriction: Pwstr = MutPtr(0L),
        ): MprInterface1 =
            MprInterface1(
                wszInterfaceName = wszInterfaceName,
                hInterfaceCtorArg = hInterface,
                fEnabled = fEnabled,
                dwIfType = dwIfType,
                dwConnectionState = dwConnectionState,
                fUnReachabilityReasons = fUnReachabilityReasons,
                dwLastError = dwLastError,
                lpwsDialoutHoursRestrictionCtorArg = lpwsDialoutHoursRestriction,
            )
    }
}

public class MprInterface2 internal constructor(
    public var wszInterfaceName: UShortArray,
    hInterfaceCtorArg: Handle,
    public var fEnabled: Bool,
    public var dwIfType: RouterInterfaceType,
    public var dwConnectionState: RouterConnectionState,
    public var fUnReachabilityReasons: UInt,
    public var dwLastError: UInt,
    public var dwfOptions: UInt,
    public var szLocalPhoneNumber: UShortArray,
    szAlternatesCtorArg: Pwstr,
    public var ipaddr: UInt,
    public var ipaddrDns: UInt,
    public var ipaddrDnsAlt: UInt,
    public var ipaddrWins: UInt,
    public var ipaddrWinsAlt: UInt,
    public var dwfNetProtocols: UInt,
    public var szDeviceType: UShortArray,
    public var szDeviceName: UShortArray,
    public var szX25PadType: UShortArray,
    public var szX25Address: UShortArray,
    public var szX25Facilities: UShortArray,
    public var szX25UserData: UShortArray,
    public var dwChannels: UInt,
    public var dwSubEntries: UInt,
    public var dwDialMode: MprInterfaceDialMode,
    public var dwDialExtraPercent: UInt,
    public var dwDialExtraSampleSeconds: UInt,
    public var dwHangUpExtraPercent: UInt,
    public var dwHangUpExtraSampleSeconds: UInt,
    public var dwIdleDisconnectSeconds: UInt,
    public var dwType: UInt,
    public var dwEncryptionType: MprEt,
    public var dwCustomAuthKey: UInt,
    public var dwCustomAuthDataSize: UInt,
    lpbCustomAuthDataCtorArg: MutPtr,
    public var guidId: Guid,
    public var dwVpnStrategy: MprVs,
) {
    public var hInterface: Handle = hInterfaceCtorArg
        internal set

    public var szAlternates: Pwstr = szAlternatesCtorArg
        internal set

    public var lpbCustomAuthData: MutPtr = lpbCustomAuthDataCtorArg
        internal set

    public constructor() : this(
        wszInterfaceName = UShortArray(257),
        hInterfaceCtorArg = MutPtr(0L),
        fEnabled = 0,
        dwIfType = 0,
        dwConnectionState = 0,
        fUnReachabilityReasons = 0u,
        dwLastError = 0u,
        dwfOptions = 0u,
        szLocalPhoneNumber = UShortArray(129),
        szAlternatesCtorArg = MutPtr(0L),
        ipaddr = 0u,
        ipaddrDns = 0u,
        ipaddrDnsAlt = 0u,
        ipaddrWins = 0u,
        ipaddrWinsAlt = 0u,
        dwfNetProtocols = 0u,
        szDeviceType = UShortArray(17),
        szDeviceName = UShortArray(129),
        szX25PadType = UShortArray(33),
        szX25Address = UShortArray(201),
        szX25Facilities = UShortArray(201),
        szX25UserData = UShortArray(201),
        dwChannels = 0u,
        dwSubEntries = 0u,
        dwDialMode = 0u,
        dwDialExtraPercent = 0u,
        dwDialExtraSampleSeconds = 0u,
        dwHangUpExtraPercent = 0u,
        dwHangUpExtraSampleSeconds = 0u,
        dwIdleDisconnectSeconds = 0u,
        dwType = 0u,
        dwEncryptionType = 0u,
        dwCustomAuthKey = 0u,
        dwCustomAuthDataSize = 0u,
        lpbCustomAuthDataCtorArg = MutPtr(0L),
        guidId = Guid(),
        dwVpnStrategy = 0u,
    )

    public companion object {
        public operator fun invoke(
            wszInterfaceName: UShortArray = UShortArray(257),
            hInterface: Handle = MutPtr(0L),
            fEnabled: Bool = 0,
            dwIfType: RouterInterfaceType = 0,
            dwConnectionState: RouterConnectionState = 0,
            fUnReachabilityReasons: UInt = 0u,
            dwLastError: UInt = 0u,
            dwfOptions: UInt = 0u,
            szLocalPhoneNumber: UShortArray = UShortArray(129),
            szAlternates: Pwstr = MutPtr(0L),
            ipaddr: UInt = 0u,
            ipaddrDns: UInt = 0u,
            ipaddrDnsAlt: UInt = 0u,
            ipaddrWins: UInt = 0u,
            ipaddrWinsAlt: UInt = 0u,
            dwfNetProtocols: UInt = 0u,
            szDeviceType: UShortArray = UShortArray(17),
            szDeviceName: UShortArray = UShortArray(129),
            szX25PadType: UShortArray = UShortArray(33),
            szX25Address: UShortArray = UShortArray(201),
            szX25Facilities: UShortArray = UShortArray(201),
            szX25UserData: UShortArray = UShortArray(201),
            dwChannels: UInt = 0u,
            dwSubEntries: UInt = 0u,
            dwDialMode: MprInterfaceDialMode = 0u,
            dwDialExtraPercent: UInt = 0u,
            dwDialExtraSampleSeconds: UInt = 0u,
            dwHangUpExtraPercent: UInt = 0u,
            dwHangUpExtraSampleSeconds: UInt = 0u,
            dwIdleDisconnectSeconds: UInt = 0u,
            dwType: UInt = 0u,
            dwEncryptionType: MprEt = 0u,
            dwCustomAuthKey: UInt = 0u,
            dwCustomAuthDataSize: UInt = 0u,
            lpbCustomAuthData: MutPtr = MutPtr(0L),
            guidId: Guid = Guid(),
            dwVpnStrategy: MprVs = 0u,
        ): MprInterface2 =
            MprInterface2(
                wszInterfaceName = wszInterfaceName,
                hInterfaceCtorArg = hInterface,
                fEnabled = fEnabled,
                dwIfType = dwIfType,
                dwConnectionState = dwConnectionState,
                fUnReachabilityReasons = fUnReachabilityReasons,
                dwLastError = dwLastError,
                dwfOptions = dwfOptions,
                szLocalPhoneNumber = szLocalPhoneNumber,
                szAlternatesCtorArg = szAlternates,
                ipaddr = ipaddr,
                ipaddrDns = ipaddrDns,
                ipaddrDnsAlt = ipaddrDnsAlt,
                ipaddrWins = ipaddrWins,
                ipaddrWinsAlt = ipaddrWinsAlt,
                dwfNetProtocols = dwfNetProtocols,
                szDeviceType = szDeviceType,
                szDeviceName = szDeviceName,
                szX25PadType = szX25PadType,
                szX25Address = szX25Address,
                szX25Facilities = szX25Facilities,
                szX25UserData = szX25UserData,
                dwChannels = dwChannels,
                dwSubEntries = dwSubEntries,
                dwDialMode = dwDialMode,
                dwDialExtraPercent = dwDialExtraPercent,
                dwDialExtraSampleSeconds = dwDialExtraSampleSeconds,
                dwHangUpExtraPercent = dwHangUpExtraPercent,
                dwHangUpExtraSampleSeconds = dwHangUpExtraSampleSeconds,
                dwIdleDisconnectSeconds = dwIdleDisconnectSeconds,
                dwType = dwType,
                dwEncryptionType = dwEncryptionType,
                dwCustomAuthKey = dwCustomAuthKey,
                dwCustomAuthDataSize = dwCustomAuthDataSize,
                lpbCustomAuthDataCtorArg = lpbCustomAuthData,
                guidId = guidId,
                dwVpnStrategy = dwVpnStrategy,
            )
    }
}

public class MprInterface3 internal constructor(
    public var wszInterfaceName: UShortArray,
    hInterfaceCtorArg: Handle,
    public var fEnabled: Bool,
    public var dwIfType: RouterInterfaceType,
    public var dwConnectionState: RouterConnectionState,
    public var fUnReachabilityReasons: UInt,
    public var dwLastError: UInt,
    public var dwfOptions: UInt,
    public var szLocalPhoneNumber: UShortArray,
    szAlternatesCtorArg: Pwstr,
    public var ipaddr: UInt,
    public var ipaddrDns: UInt,
    public var ipaddrDnsAlt: UInt,
    public var ipaddrWins: UInt,
    public var ipaddrWinsAlt: UInt,
    public var dwfNetProtocols: UInt,
    public var szDeviceType: UShortArray,
    public var szDeviceName: UShortArray,
    public var szX25PadType: UShortArray,
    public var szX25Address: UShortArray,
    public var szX25Facilities: UShortArray,
    public var szX25UserData: UShortArray,
    public var dwChannels: UInt,
    public var dwSubEntries: UInt,
    public var dwDialMode: MprInterfaceDialMode,
    public var dwDialExtraPercent: UInt,
    public var dwDialExtraSampleSeconds: UInt,
    public var dwHangUpExtraPercent: UInt,
    public var dwHangUpExtraSampleSeconds: UInt,
    public var dwIdleDisconnectSeconds: UInt,
    public var dwType: UInt,
    public var dwEncryptionType: MprEt,
    public var dwCustomAuthKey: UInt,
    public var dwCustomAuthDataSize: UInt,
    lpbCustomAuthDataCtorArg: MutPtr,
    public var guidId: Guid,
    public var dwVpnStrategy: MprVs,
    public var addressCount: UInt,
    public var ipv6addrDns: In6Addr,
    public var ipv6addrDnsAlt: In6Addr,
    ipv6addrCtorArg: MutPtr,
) {
    public var hInterface: Handle = hInterfaceCtorArg
        internal set

    public var szAlternates: Pwstr = szAlternatesCtorArg
        internal set

    public var lpbCustomAuthData: MutPtr = lpbCustomAuthDataCtorArg
        internal set

    public var ipv6addr: MutPtr = ipv6addrCtorArg
        internal set

    public constructor() : this(
        wszInterfaceName = UShortArray(257),
        hInterfaceCtorArg = MutPtr(0L),
        fEnabled = 0,
        dwIfType = 0,
        dwConnectionState = 0,
        fUnReachabilityReasons = 0u,
        dwLastError = 0u,
        dwfOptions = 0u,
        szLocalPhoneNumber = UShortArray(129),
        szAlternatesCtorArg = MutPtr(0L),
        ipaddr = 0u,
        ipaddrDns = 0u,
        ipaddrDnsAlt = 0u,
        ipaddrWins = 0u,
        ipaddrWinsAlt = 0u,
        dwfNetProtocols = 0u,
        szDeviceType = UShortArray(17),
        szDeviceName = UShortArray(129),
        szX25PadType = UShortArray(33),
        szX25Address = UShortArray(201),
        szX25Facilities = UShortArray(201),
        szX25UserData = UShortArray(201),
        dwChannels = 0u,
        dwSubEntries = 0u,
        dwDialMode = 0u,
        dwDialExtraPercent = 0u,
        dwDialExtraSampleSeconds = 0u,
        dwHangUpExtraPercent = 0u,
        dwHangUpExtraSampleSeconds = 0u,
        dwIdleDisconnectSeconds = 0u,
        dwType = 0u,
        dwEncryptionType = 0u,
        dwCustomAuthKey = 0u,
        dwCustomAuthDataSize = 0u,
        lpbCustomAuthDataCtorArg = MutPtr(0L),
        guidId = Guid(),
        dwVpnStrategy = 0u,
        addressCount = 0u,
        ipv6addrDns = In6Addr(),
        ipv6addrDnsAlt = In6Addr(),
        ipv6addrCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            wszInterfaceName: UShortArray = UShortArray(257),
            hInterface: Handle = MutPtr(0L),
            fEnabled: Bool = 0,
            dwIfType: RouterInterfaceType = 0,
            dwConnectionState: RouterConnectionState = 0,
            fUnReachabilityReasons: UInt = 0u,
            dwLastError: UInt = 0u,
            dwfOptions: UInt = 0u,
            szLocalPhoneNumber: UShortArray = UShortArray(129),
            szAlternates: Pwstr = MutPtr(0L),
            ipaddr: UInt = 0u,
            ipaddrDns: UInt = 0u,
            ipaddrDnsAlt: UInt = 0u,
            ipaddrWins: UInt = 0u,
            ipaddrWinsAlt: UInt = 0u,
            dwfNetProtocols: UInt = 0u,
            szDeviceType: UShortArray = UShortArray(17),
            szDeviceName: UShortArray = UShortArray(129),
            szX25PadType: UShortArray = UShortArray(33),
            szX25Address: UShortArray = UShortArray(201),
            szX25Facilities: UShortArray = UShortArray(201),
            szX25UserData: UShortArray = UShortArray(201),
            dwChannels: UInt = 0u,
            dwSubEntries: UInt = 0u,
            dwDialMode: MprInterfaceDialMode = 0u,
            dwDialExtraPercent: UInt = 0u,
            dwDialExtraSampleSeconds: UInt = 0u,
            dwHangUpExtraPercent: UInt = 0u,
            dwHangUpExtraSampleSeconds: UInt = 0u,
            dwIdleDisconnectSeconds: UInt = 0u,
            dwType: UInt = 0u,
            dwEncryptionType: MprEt = 0u,
            dwCustomAuthKey: UInt = 0u,
            dwCustomAuthDataSize: UInt = 0u,
            lpbCustomAuthData: MutPtr = MutPtr(0L),
            guidId: Guid = Guid(),
            dwVpnStrategy: MprVs = 0u,
            addressCount: UInt = 0u,
            ipv6addrDns: In6Addr = In6Addr(),
            ipv6addrDnsAlt: In6Addr = In6Addr(),
            ipv6addr: MutPtr = MutPtr(0L),
        ): MprInterface3 =
            MprInterface3(
                wszInterfaceName = wszInterfaceName,
                hInterfaceCtorArg = hInterface,
                fEnabled = fEnabled,
                dwIfType = dwIfType,
                dwConnectionState = dwConnectionState,
                fUnReachabilityReasons = fUnReachabilityReasons,
                dwLastError = dwLastError,
                dwfOptions = dwfOptions,
                szLocalPhoneNumber = szLocalPhoneNumber,
                szAlternatesCtorArg = szAlternates,
                ipaddr = ipaddr,
                ipaddrDns = ipaddrDns,
                ipaddrDnsAlt = ipaddrDnsAlt,
                ipaddrWins = ipaddrWins,
                ipaddrWinsAlt = ipaddrWinsAlt,
                dwfNetProtocols = dwfNetProtocols,
                szDeviceType = szDeviceType,
                szDeviceName = szDeviceName,
                szX25PadType = szX25PadType,
                szX25Address = szX25Address,
                szX25Facilities = szX25Facilities,
                szX25UserData = szX25UserData,
                dwChannels = dwChannels,
                dwSubEntries = dwSubEntries,
                dwDialMode = dwDialMode,
                dwDialExtraPercent = dwDialExtraPercent,
                dwDialExtraSampleSeconds = dwDialExtraSampleSeconds,
                dwHangUpExtraPercent = dwHangUpExtraPercent,
                dwHangUpExtraSampleSeconds = dwHangUpExtraSampleSeconds,
                dwIdleDisconnectSeconds = dwIdleDisconnectSeconds,
                dwType = dwType,
                dwEncryptionType = dwEncryptionType,
                dwCustomAuthKey = dwCustomAuthKey,
                dwCustomAuthDataSize = dwCustomAuthDataSize,
                lpbCustomAuthDataCtorArg = lpbCustomAuthData,
                guidId = guidId,
                dwVpnStrategy = dwVpnStrategy,
                addressCount = addressCount,
                ipv6addrDns = ipv6addrDns,
                ipv6addrDnsAlt = ipv6addrDnsAlt,
                ipv6addrCtorArg = ipv6addr,
            )
    }
}

public data class MprIpinipInterface0(
    public var wszFriendlyName: UShortArray = UShortArray(257),
    public var guid: Guid = Guid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MprIpinipInterface0) return false
        if (!this.wszFriendlyName.contentEquals(other.wszFriendlyName)) return false
        if (this.guid != other.guid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wszFriendlyName.contentHashCode()
        result = 31 * result + this.guid.hashCode()
        return result
    }
}

public data class MprServer0(
    public var fLanOnlyMode: Bool = 0,
    public var dwUpTime: UInt = 0u,
    public var dwTotalPorts: UInt = 0u,
    public var dwPortsInUse: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MprServer0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MprServer0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MprServer0 =
                    MprServer0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: MprServer0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.fLanOnlyMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwUpTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwTotalPorts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwPortsInUse)
                }
            }
    }
}

public data class MprServer1(
    public var dwNumPptpPorts: UInt = 0u,
    public var dwPptpPortFlags: UInt = 0u,
    public var dwNumL2tpPorts: UInt = 0u,
    public var dwL2tpPortFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MprServer1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MprServer1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MprServer1 =
                    MprServer1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: MprServer1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumPptpPorts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwPptpPortFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwNumL2tpPorts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwL2tpPortFlags)
                }
            }
    }
}

public data class MprServer2(
    public var dwNumPptpPorts: UInt = 0u,
    public var dwPptpPortFlags: UInt = 0u,
    public var dwNumL2tpPorts: UInt = 0u,
    public var dwL2tpPortFlags: UInt = 0u,
    public var dwNumSstpPorts: UInt = 0u,
    public var dwSstpPortFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MprServer2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MprServer2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MprServer2 =
                    MprServer2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: MprServer2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumPptpPorts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwPptpPortFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwNumL2tpPorts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwL2tpPortFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwNumSstpPorts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwSstpPortFlags)
                }
            }
    }
}

public data class MprServerEx0(
    public var header: MprapiObjectHeader = MprapiObjectHeader(),
    public var fLanOnlyMode: UInt = 0u,
    public var dwUpTime: UInt = 0u,
    public var dwTotalPorts: UInt = 0u,
    public var dwPortsInUse: UInt = 0u,
    public var reserved: UInt = 0u,
    public var configParams: MprapiTunnelConfigParams0 = MprapiTunnelConfigParams0(),
)

public data class MprServerEx1(
    public var header: MprapiObjectHeader = MprapiObjectHeader(),
    public var fLanOnlyMode: UInt = 0u,
    public var dwUpTime: UInt = 0u,
    public var dwTotalPorts: UInt = 0u,
    public var dwPortsInUse: UInt = 0u,
    public var reserved: UInt = 0u,
    public var configParams: MprapiTunnelConfigParams1 = MprapiTunnelConfigParams1(),
)

public data class MprServerSetConfigEx0(
    public var header: MprapiObjectHeader = MprapiObjectHeader(),
    public var setConfigForProtocols: UInt = 0u,
    public var configParams: MprapiTunnelConfigParams0 = MprapiTunnelConfigParams0(),
)

public data class MprServerSetConfigEx1(
    public var header: MprapiObjectHeader = MprapiObjectHeader(),
    public var setConfigForProtocols: UInt = 0u,
    public var configParams: MprapiTunnelConfigParams1 = MprapiTunnelConfigParams1(),
)

public class MprTransport0 internal constructor(
    public var dwTransportId: UInt,
    hTransportCtorArg: Handle,
    public var wszTransportName: UShortArray,
) {
    public var hTransport: Handle = hTransportCtorArg
        internal set

    public constructor() : this(
        dwTransportId = 0u,
        hTransportCtorArg = MutPtr(0L),
        wszTransportName = UShortArray(41),
    )

    public operator fun component1(): UInt = this.dwTransportId

    public operator fun component2(): Handle = this.hTransport

    public operator fun component3(): UShortArray = this.wszTransportName

    public fun copy(dwTransportId: UInt = this.dwTransportId, hTransport: Handle = this.hTransport, wszTransportName: UShortArray = this.wszTransportName): MprTransport0 = MprTransport0(dwTransportId = dwTransportId, hTransportCtorArg = hTransport, wszTransportName = wszTransportName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MprTransport0) return false
        if (this.dwTransportId != other.dwTransportId) return false
        if (this.hTransport != other.hTransport) return false
        if (!this.wszTransportName.contentEquals(other.wszTransportName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwTransportId.hashCode()
        result = 31 * result + this.hTransport.hashCode()
        result = 31 * result + this.wszTransportName.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwTransportId: UInt = 0u,
            hTransport: Handle = MutPtr(0L),
            wszTransportName: UShortArray = UShortArray(41),
        ): MprTransport0 =
            MprTransport0(
                dwTransportId = dwTransportId,
                hTransportCtorArg = hTransport,
                wszTransportName = wszTransportName,
            )
    }
}

public data class MprVpnTrafficSelector(
    public var type: MprVpnTsType = 0,
    public var protocolId: UByte = 0u,
    public var portStart: UShort = 0u,
    public var portEnd: UShort = 0u,
    public var tsPayloadId: UShort = 0u,
    public var addrStart: VpnTsIpAddress = VpnTsIpAddress(),
    public var addrEnd: VpnTsIpAddress = VpnTsIpAddress(),
)

public class MprVpnTrafficSelectors internal constructor(
    public var numTsi: UInt,
    public var numTsr: UInt,
    tsICtorArg: MutPtr,
    tsRCtorArg: MutPtr,
) {
    public var tsI: MutPtr = tsICtorArg
        internal set

    public var tsR: MutPtr = tsRCtorArg
        internal set

    public constructor() : this(
        numTsi = 0u,
        numTsr = 0u,
        tsICtorArg = MutPtr(0L),
        tsRCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numTsi

    public operator fun component2(): UInt = this.numTsr

    public operator fun component3(): MutPtr = this.tsI

    public operator fun component4(): MutPtr = this.tsR

    public fun copy(numTsi: UInt = this.numTsi, numTsr: UInt = this.numTsr, tsI: MutPtr = this.tsI, tsR: MutPtr = this.tsR): MprVpnTrafficSelectors = MprVpnTrafficSelectors(numTsi = numTsi, numTsr = numTsr, tsICtorArg = tsI, tsRCtorArg = tsR)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MprVpnTrafficSelectors) return false
        if (this.numTsi != other.numTsi) return false
        if (this.numTsr != other.numTsr) return false
        if (this.tsI != other.tsI) return false
        if (this.tsR != other.tsR) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numTsi.hashCode()
        result = 31 * result + this.numTsr.hashCode()
        result = 31 * result + this.tsI.hashCode()
        result = 31 * result + this.tsR.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MprVpnTrafficSelectors> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MprVpnTrafficSelectors> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MprVpnTrafficSelectors =
                    MprVpnTrafficSelectors(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MprVpnTrafficSelectors) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numTsi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numTsr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.tsI)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.tsR)
                }
            }

        public operator fun invoke(
            numTsi: UInt = 0u,
            numTsr: UInt = 0u,
            tsI: MutPtr = MutPtr(0L),
            tsR: MutPtr = MutPtr(0L),
        ): MprVpnTrafficSelectors =
            MprVpnTrafficSelectors(
                numTsi = numTsi,
                numTsr = numTsr,
                tsICtorArg = tsI,
                tsRCtorArg = tsR,
            )
    }
}

public data class PppAtcpInfo(
    public var dwError: UInt = 0u,
    public var wszAddress: UShortArray = UShortArray(33),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PppAtcpInfo) return false
        if (this.dwError != other.dwError) return false
        if (!this.wszAddress.contentEquals(other.wszAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwError.hashCode()
        result = 31 * result + this.wszAddress.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PppAtcpInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PppAtcpInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): PppAtcpInfo =
                    PppAtcpInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (33).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: PppAtcpInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwError)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (33).toInt())
                    ).writeNative(addr + 4L, value.wszAddress.toList())
                }
            }
    }
}

public data class PppCcpInfo(
    public var dwError: UInt = 0u,
    public var dwCompressionAlgorithm: UInt = 0u,
    public var dwOptions: UInt = 0u,
    public var dwRemoteCompressionAlgorithm: UInt = 0u,
    public var dwRemoteOptions: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PppCcpInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PppCcpInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): PppCcpInfo =
                    PppCcpInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: PppCcpInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwCompressionAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwRemoteCompressionAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwRemoteOptions)
                }
            }
    }
}

public data class PppInfo(
    public var nbf: PppNbfcpInfo = PppNbfcpInfo(),
    public var ip: PppIpcpInfo = PppIpcpInfo(),
    public var ipx: PppIpxcpInfo = PppIpxcpInfo(),
    public var at: PppAtcpInfo = PppAtcpInfo(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PppInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PppInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 232L
                override fun readNative(addr: Long): PppInfo =
                    PppInfo(
                        (PppNbfcpInfo.typeLayout()).readNative(addr),
                        (PppIpcpInfo.typeLayout()).readNative(addr + 40L),
                        (PppIpxcpInfo.typeLayout()).readNative(addr + 108L),
                        (PppAtcpInfo.typeLayout()).readNative(addr + 160L),
                    )
                override fun writeNative(addr: Long, value: PppInfo) {
                    (PppNbfcpInfo.typeLayout()).writeNative(addr, value.nbf)
                    (PppIpcpInfo.typeLayout()).writeNative(addr + 40L, value.ip)
                    (PppIpxcpInfo.typeLayout()).writeNative(addr + 108L, value.ipx)
                    (PppAtcpInfo.typeLayout()).writeNative(addr + 160L, value.at)
                }
            }
    }
}

public data class PppInfo2(
    public var nbf: PppNbfcpInfo = PppNbfcpInfo(),
    public var ip: PppIpcpInfo2 = PppIpcpInfo2(),
    public var ipx: PppIpxcpInfo = PppIpxcpInfo(),
    public var at: PppAtcpInfo = PppAtcpInfo(),
    public var ccp: PppCcpInfo = PppCcpInfo(),
    public var lcp: PppLcpInfo = PppLcpInfo(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PppInfo2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PppInfo2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 304L
                override fun readNative(addr: Long): PppInfo2 =
                    PppInfo2(
                        (PppNbfcpInfo.typeLayout()).readNative(addr),
                        (PppIpcpInfo2.typeLayout()).readNative(addr + 40L),
                        (PppIpxcpInfo.typeLayout()).readNative(addr + 116L),
                        (PppAtcpInfo.typeLayout()).readNative(addr + 168L),
                        (PppCcpInfo.typeLayout()).readNative(addr + 240L),
                        (PppLcpInfo.typeLayout()).readNative(addr + 260L),
                    )
                override fun writeNative(addr: Long, value: PppInfo2) {
                    (PppNbfcpInfo.typeLayout()).writeNative(addr, value.nbf)
                    (PppIpcpInfo2.typeLayout()).writeNative(addr + 40L, value.ip)
                    (PppIpxcpInfo.typeLayout()).writeNative(addr + 116L, value.ipx)
                    (PppAtcpInfo.typeLayout()).writeNative(addr + 168L, value.at)
                    (PppCcpInfo.typeLayout()).writeNative(addr + 240L, value.ccp)
                    (PppLcpInfo.typeLayout()).writeNative(addr + 260L, value.lcp)
                }
            }
    }
}

public data class PppInfo3(
    public var nbf: PppNbfcpInfo = PppNbfcpInfo(),
    public var ip: PppIpcpInfo2 = PppIpcpInfo2(),
    public var ipv6: PppIpv6CpInfo = PppIpv6CpInfo(),
    public var ccp: PppCcpInfo = PppCcpInfo(),
    public var lcp: PppLcpInfo = PppLcpInfo(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PppInfo3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PppInfo3> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 228L
                override fun readNative(addr: Long): PppInfo3 =
                    PppInfo3(
                        (PppNbfcpInfo.typeLayout()).readNative(addr),
                        (PppIpcpInfo2.typeLayout()).readNative(addr + 40L),
                        (PppIpv6CpInfo.typeLayout()).readNative(addr + 116L),
                        (PppCcpInfo.typeLayout()).readNative(addr + 164L),
                        (PppLcpInfo.typeLayout()).readNative(addr + 184L),
                    )
                override fun writeNative(addr: Long, value: PppInfo3) {
                    (PppNbfcpInfo.typeLayout()).writeNative(addr, value.nbf)
                    (PppIpcpInfo2.typeLayout()).writeNative(addr + 40L, value.ip)
                    (PppIpv6CpInfo.typeLayout()).writeNative(addr + 116L, value.ipv6)
                    (PppCcpInfo.typeLayout()).writeNative(addr + 164L, value.ccp)
                    (PppLcpInfo.typeLayout()).writeNative(addr + 184L, value.lcp)
                }
            }
    }
}

public data class PppIpcpInfo(
    public var dwError: UInt = 0u,
    public var wszAddress: UShortArray = UShortArray(16),
    public var wszRemoteAddress: UShortArray = UShortArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PppIpcpInfo) return false
        if (this.dwError != other.dwError) return false
        if (!this.wszAddress.contentEquals(other.wszAddress)) return false
        if (!this.wszRemoteAddress.contentEquals(other.wszRemoteAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwError.hashCode()
        result = 31 * result + this.wszAddress.contentHashCode()
        result = 31 * result + this.wszRemoteAddress.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PppIpcpInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PppIpcpInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 68L
                override fun readNative(addr: Long): PppIpcpInfo =
                    PppIpcpInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                        ).readNative(addr + 36L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: PppIpcpInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwError)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                    ).writeNative(addr + 4L, value.wszAddress.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                    ).writeNative(addr + 36L, value.wszRemoteAddress.toList())
                }
            }
    }
}

public data class PppIpcpInfo2(
    public var dwError: UInt = 0u,
    public var wszAddress: UShortArray = UShortArray(16),
    public var wszRemoteAddress: UShortArray = UShortArray(16),
    public var dwOptions: UInt = 0u,
    public var dwRemoteOptions: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PppIpcpInfo2) return false
        if (this.dwError != other.dwError) return false
        if (!this.wszAddress.contentEquals(other.wszAddress)) return false
        if (!this.wszRemoteAddress.contentEquals(other.wszRemoteAddress)) return false
        if (this.dwOptions != other.dwOptions) return false
        if (this.dwRemoteOptions != other.dwRemoteOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwError.hashCode()
        result = 31 * result + this.wszAddress.contentHashCode()
        result = 31 * result + this.wszRemoteAddress.contentHashCode()
        result = 31 * result + this.dwOptions.hashCode()
        result = 31 * result + this.dwRemoteOptions.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PppIpcpInfo2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PppIpcpInfo2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 76L
                override fun readNative(addr: Long): PppIpcpInfo2 =
                    PppIpcpInfo2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                        ).readNative(addr + 36L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                    )
                override fun writeNative(addr: Long, value: PppIpcpInfo2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwError)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                    ).writeNative(addr + 4L, value.wszAddress.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                    ).writeNative(addr + 36L, value.wszRemoteAddress.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.dwOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.dwRemoteOptions)
                }
            }
    }
}

public data class PppIpv6CpInfo(
    public var dwVersion: UInt = 0u,
    public var dwSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var bInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bRemoteInterfaceIdentifier: UByteArray = UByteArray(8),
    public var dwOptions: UInt = 0u,
    public var dwRemoteOptions: UInt = 0u,
    public var bPrefix: UByteArray = UByteArray(8),
    public var dwPrefixLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PppIpv6CpInfo) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwError != other.dwError) return false
        if (!this.bInterfaceIdentifier.contentEquals(other.bInterfaceIdentifier)) return false
        if (!this.bRemoteInterfaceIdentifier.contentEquals(other.bRemoteInterfaceIdentifier)) return false
        if (this.dwOptions != other.dwOptions) return false
        if (this.dwRemoteOptions != other.dwRemoteOptions) return false
        if (!this.bPrefix.contentEquals(other.bPrefix)) return false
        if (this.dwPrefixLength != other.dwPrefixLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.dwSize.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.bInterfaceIdentifier.contentHashCode()
        result = 31 * result + this.bRemoteInterfaceIdentifier.contentHashCode()
        result = 31 * result + this.dwOptions.hashCode()
        result = 31 * result + this.dwRemoteOptions.hashCode()
        result = 31 * result + this.bPrefix.contentHashCode()
        result = 31 * result + this.dwPrefixLength.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PppIpv6CpInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PppIpv6CpInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): PppIpv6CpInfo =
                    PppIpv6CpInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 20L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 36L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: PppIpv6CpInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwError)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 12L, value.bInterfaceIdentifier.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 20L, value.bRemoteInterfaceIdentifier.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwRemoteOptions)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 36L, value.bPrefix.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwPrefixLength)
                }
            }
    }
}

public data class PppIpxcpInfo(
    public var dwError: UInt = 0u,
    public var wszAddress: UShortArray = UShortArray(23),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PppIpxcpInfo) return false
        if (this.dwError != other.dwError) return false
        if (!this.wszAddress.contentEquals(other.wszAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwError.hashCode()
        result = 31 * result + this.wszAddress.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PppIpxcpInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PppIpxcpInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 52L
                override fun readNative(addr: Long): PppIpxcpInfo =
                    PppIpxcpInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (23).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: PppIpxcpInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwError)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (23).toInt())
                    ).writeNative(addr + 4L, value.wszAddress.toList())
                }
            }
    }
}

public data class PppLcpInfo(
    public var dwError: UInt = 0u,
    public var dwAuthenticationProtocol: PppLcp = 0u,
    public var dwAuthenticationData: PppLcpInfoAuthData = 0u,
    public var dwRemoteAuthenticationProtocol: UInt = 0u,
    public var dwRemoteAuthenticationData: UInt = 0u,
    public var dwTerminateReason: UInt = 0u,
    public var dwRemoteTerminateReason: UInt = 0u,
    public var dwOptions: UInt = 0u,
    public var dwRemoteOptions: UInt = 0u,
    public var dwEapTypeId: UInt = 0u,
    public var dwRemoteEapTypeId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PppLcpInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PppLcpInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 44L
                override fun readNative(addr: Long): PppLcpInfo =
                    PppLcpInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: PppLcpInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwAuthenticationProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwAuthenticationData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwRemoteAuthenticationProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwRemoteAuthenticationData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwTerminateReason)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwRemoteTerminateReason)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwRemoteOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwEapTypeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwRemoteEapTypeId)
                }
            }
    }
}

public data class PppNbfcpInfo(
    public var dwError: UInt = 0u,
    public var wszWksta: UShortArray = UShortArray(17),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PppNbfcpInfo) return false
        if (this.dwError != other.dwError) return false
        if (!this.wszWksta.contentEquals(other.wszWksta)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwError.hashCode()
        result = 31 * result + this.wszWksta.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PppNbfcpInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PppNbfcpInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): PppNbfcpInfo =
                    PppNbfcpInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (17).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: PppNbfcpInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwError)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (17).toInt())
                    ).writeNative(addr + 4L, value.wszWksta.toList())
                }
            }
    }
}

public class PppProjectionInfo(
    public var dwIPv4NegotiationError: UInt = 0u,
    public var wszAddress: UShortArray = UShortArray(16),
    public var wszRemoteAddress: UShortArray = UShortArray(16),
    public var dwIPv4Options: UInt = 0u,
    public var dwIPv4RemoteOptions: UInt = 0u,
    public var iPv4SubInterfaceIndex: ULong = 0uL,
    public var dwIPv6NegotiationError: UInt = 0u,
    public var bInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bRemoteInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bPrefix: UByteArray = UByteArray(8),
    public var dwPrefixLength: UInt = 0u,
    public var iPv6SubInterfaceIndex: ULong = 0uL,
    public var dwLcpError: UInt = 0u,
    public var dwAuthenticationProtocol: PppLcp = 0u,
    public var dwAuthenticationData: PppLcpInfoAuthData = 0u,
    public var dwRemoteAuthenticationProtocol: PppLcp = 0u,
    public var dwRemoteAuthenticationData: PppLcpInfoAuthData = 0u,
    public var dwLcpTerminateReason: UInt = 0u,
    public var dwLcpRemoteTerminateReason: UInt = 0u,
    public var dwLcpOptions: UInt = 0u,
    public var dwLcpRemoteOptions: UInt = 0u,
    public var dwEapTypeId: UInt = 0u,
    public var dwRemoteEapTypeId: UInt = 0u,
    public var dwCcpError: UInt = 0u,
    public var dwCompressionAlgorithm: UInt = 0u,
    public var dwCcpOptions: UInt = 0u,
    public var dwRemoteCompressionAlgorithm: UInt = 0u,
    public var dwCcpRemoteOptions: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PppProjectionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PppProjectionInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 192L
                override fun readNative(addr: Long): PppProjectionInfo =
                    PppProjectionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                        ).readNative(addr + 36L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 92L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 100L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 108L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 116L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 140L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 148L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 156L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 164L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 168L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 172L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 176L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 180L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 184L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 188L),
                    )
                override fun writeNative(addr: Long, value: PppProjectionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwIPv4NegotiationError)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                    ).writeNative(addr + 4L, value.wszAddress.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                    ).writeNative(addr + 36L, value.wszRemoteAddress.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.dwIPv4Options)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.dwIPv4RemoteOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.iPv4SubInterfaceIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.dwIPv6NegotiationError)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 92L, value.bInterfaceIdentifier.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 100L, value.bRemoteInterfaceIdentifier.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 108L, value.bPrefix.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 116L, value.dwPrefixLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.iPv6SubInterfaceIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.dwLcpError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 132L, value.dwAuthenticationProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.dwAuthenticationData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 140L, value.dwRemoteAuthenticationProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 144L, value.dwRemoteAuthenticationData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 148L, value.dwLcpTerminateReason)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 152L, value.dwLcpRemoteTerminateReason)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 156L, value.dwLcpOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 160L, value.dwLcpRemoteOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 164L, value.dwEapTypeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 168L, value.dwRemoteEapTypeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 172L, value.dwCcpError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 176L, value.dwCompressionAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 180L, value.dwCcpOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 184L, value.dwRemoteCompressionAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 188L, value.dwCcpRemoteOptions)
                }
            }
    }
}

public class PppProjectionInfo2(
    public var dwIPv4NegotiationError: UInt = 0u,
    public var wszAddress: UShortArray = UShortArray(16),
    public var wszRemoteAddress: UShortArray = UShortArray(16),
    public var dwIPv4Options: UInt = 0u,
    public var dwIPv4RemoteOptions: UInt = 0u,
    public var iPv4SubInterfaceIndex: ULong = 0uL,
    public var dwIPv6NegotiationError: UInt = 0u,
    public var bInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bRemoteInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bPrefix: UByteArray = UByteArray(8),
    public var dwPrefixLength: UInt = 0u,
    public var iPv6SubInterfaceIndex: ULong = 0uL,
    public var dwLcpError: UInt = 0u,
    public var dwAuthenticationProtocol: PppLcp = 0u,
    public var dwAuthenticationData: PppLcpInfoAuthData = 0u,
    public var dwRemoteAuthenticationProtocol: PppLcp = 0u,
    public var dwRemoteAuthenticationData: PppLcpInfoAuthData = 0u,
    public var dwLcpTerminateReason: UInt = 0u,
    public var dwLcpRemoteTerminateReason: UInt = 0u,
    public var dwLcpOptions: UInt = 0u,
    public var dwLcpRemoteOptions: UInt = 0u,
    public var dwEapTypeId: UInt = 0u,
    public var dwEmbeddedEAPTypeId: UInt = 0u,
    public var dwRemoteEapTypeId: UInt = 0u,
    public var dwCcpError: UInt = 0u,
    public var dwCompressionAlgorithm: UInt = 0u,
    public var dwCcpOptions: UInt = 0u,
    public var dwRemoteCompressionAlgorithm: UInt = 0u,
    public var dwCcpRemoteOptions: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PppProjectionInfo2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PppProjectionInfo2> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 200L
                override fun readNative(addr: Long): PppProjectionInfo2 =
                    PppProjectionInfo2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                        ).readNative(addr + 36L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 92L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 100L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 108L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 116L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 140L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 148L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 156L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 164L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 168L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 172L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 176L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 180L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 184L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 188L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 192L),
                    )
                override fun writeNative(addr: Long, value: PppProjectionInfo2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwIPv4NegotiationError)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                    ).writeNative(addr + 4L, value.wszAddress.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                    ).writeNative(addr + 36L, value.wszRemoteAddress.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.dwIPv4Options)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.dwIPv4RemoteOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.iPv4SubInterfaceIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.dwIPv6NegotiationError)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 92L, value.bInterfaceIdentifier.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 100L, value.bRemoteInterfaceIdentifier.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 108L, value.bPrefix.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 116L, value.dwPrefixLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.iPv6SubInterfaceIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.dwLcpError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 132L, value.dwAuthenticationProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.dwAuthenticationData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 140L, value.dwRemoteAuthenticationProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 144L, value.dwRemoteAuthenticationData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 148L, value.dwLcpTerminateReason)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 152L, value.dwLcpRemoteTerminateReason)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 156L, value.dwLcpOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 160L, value.dwLcpRemoteOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 164L, value.dwEapTypeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 168L, value.dwEmbeddedEAPTypeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 172L, value.dwRemoteEapTypeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 176L, value.dwCcpError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 180L, value.dwCompressionAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 184L, value.dwCcpOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 188L, value.dwRemoteCompressionAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 192L, value.dwCcpRemoteOptions)
                }
            }
    }
}

public data class PptpConfigParams(
    public var dwNumPorts: UInt = 0u,
    public var dwPortFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PptpConfigParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PptpConfigParams> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PptpConfigParams =
                    PptpConfigParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PptpConfigParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwNumPorts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwPortFlags)
                }
            }
    }
}

public data class ProjectionInfo(
    public var projectionInfoType: UByte = 0u,
    public var anonymous: ProjectionInfo0 = ProjectionInfo0(),
)

public data class ProjectionInfo0(
    public var pppProjectionInfo: PppProjectionInfo = PppProjectionInfo(),
    public var ikev2ProjectionInfo: Ikev2ProjectionInfo = Ikev2ProjectionInfo(),
)

public data class ProjectionInfo2(
    public var projectionInfoType: UByte = 0u,
    public var anonymous: ProjectionInfo20 = ProjectionInfo20(),
)

public data class ProjectionInfo20(
    public var pppProjectionInfo: PppProjectionInfo2 = PppProjectionInfo2(),
    public var ikev2ProjectionInfo: Ikev2ProjectionInfo2 = Ikev2ProjectionInfo2(),
)

public class Rasadparams internal constructor(
    public var dwSize: UInt,
    hwndOwnerCtorArg: Hwnd,
    public var dwFlags: UInt,
    public var xDlg: Int,
    public var yDlg: Int,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        dwFlags = 0u,
        xDlg = 0,
        yDlg = 0,
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Hwnd = this.hwndOwner

    public operator fun component3(): UInt = this.dwFlags

    public operator fun component4(): Int = this.xDlg

    public operator fun component5(): Int = this.yDlg

    public fun copy(dwSize: UInt = this.dwSize, hwndOwner: Hwnd = this.hwndOwner, dwFlags: UInt = this.dwFlags, xDlg: Int = this.xDlg, yDlg: Int = this.yDlg): Rasadparams = Rasadparams(dwSize = dwSize, hwndOwnerCtorArg = hwndOwner, dwFlags = dwFlags, xDlg = xDlg, yDlg = yDlg)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasadparams) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hwndOwner != other.hwndOwner) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.xDlg != other.xDlg) return false
        if (this.yDlg != other.yDlg) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.hwndOwner.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.xDlg.hashCode()
        result = 31 * result + this.yDlg.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            dwFlags: UInt = 0u,
            xDlg: Int = 0,
            yDlg: Int = 0,
        ): Rasadparams =
            Rasadparams(
                dwSize = dwSize,
                hwndOwnerCtorArg = hwndOwner,
                dwFlags = dwFlags,
                xDlg = xDlg,
                yDlg = yDlg,
            )
    }
}

public data class Rasamba(
    public var dwSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var szNetBiosError: ByteArray = ByteArray(17),
    public var bLana: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasamba) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwError != other.dwError) return false
        if (!this.szNetBiosError.contentEquals(other.szNetBiosError)) return false
        if (this.bLana != other.bLana) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.szNetBiosError.contentHashCode()
        result = 31 * result + this.bLana.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rasamba> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rasamba> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): Rasamba =
                    Rasamba(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (17).toInt())
                        ).readNative(addr + 8L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 25L),
                    )
                override fun writeNative(addr: Long, value: Rasamba) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwError)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (17).toInt())
                    ).writeNative(addr + 8L, value.szNetBiosError.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 25L, value.bLana)
                }
            }
    }
}

public data class Rasambw(
    public var dwSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var szNetBiosError: UShortArray = UShortArray(17),
    public var bLana: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasambw) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwError != other.dwError) return false
        if (!this.szNetBiosError.contentEquals(other.szNetBiosError)) return false
        if (this.bLana != other.bLana) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.szNetBiosError.contentHashCode()
        result = 31 * result + this.bLana.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rasambw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rasambw> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 44L
                override fun readNative(addr: Long): Rasambw =
                    Rasambw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (17).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 42L),
                    )
                override fun writeNative(addr: Long, value: Rasambw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwError)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (17).toInt())
                    ).writeNative(addr + 8L, value.szNetBiosError.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 42L, value.bLana)
                }
            }
    }
}

public data class Rasautodialentrya(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwDialingLocation: UInt = 0u,
    public var szEntry: ByteArray = ByteArray(257),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasautodialentrya) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwDialingLocation != other.dwDialingLocation) return false
        if (!this.szEntry.contentEquals(other.szEntry)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwDialingLocation.hashCode()
        result = 31 * result + this.szEntry.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rasautodialentrya> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rasautodialentrya> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 272L
                override fun readNative(addr: Long): Rasautodialentrya =
                    Rasautodialentrya(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (257).toInt())
                        ).readNative(addr + 12L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: Rasautodialentrya) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwDialingLocation)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (257).toInt())
                    ).writeNative(addr + 12L, value.szEntry.toList())
                }
            }
    }
}

public data class Rasautodialentryw(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwDialingLocation: UInt = 0u,
    public var szEntry: UShortArray = UShortArray(257),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasautodialentryw) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwDialingLocation != other.dwDialingLocation) return false
        if (!this.szEntry.contentEquals(other.szEntry)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwDialingLocation.hashCode()
        result = 31 * result + this.szEntry.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rasautodialentryw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rasautodialentryw> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 528L
                override fun readNative(addr: Long): Rasautodialentryw =
                    Rasautodialentryw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (257).toInt())
                        ).readNative(addr + 12L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Rasautodialentryw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwDialingLocation)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (257).toInt())
                    ).writeNative(addr + 12L, value.szEntry.toList())
                }
            }
    }
}

public data class Rascommsettings(
    public var dwSize: UInt = 0u,
    public var bParity: UByte = 0u,
    public var bStop: UByte = 0u,
    public var bByteSize: UByte = 0u,
    public var bAlign: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rascommsettings> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rascommsettings> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Rascommsettings =
                    Rascommsettings(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                    )
                override fun writeNative(addr: Long, value: Rascommsettings) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.bParity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.bStop)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.bByteSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.bAlign)
                }
            }
    }
}

public class Rasconna internal constructor(
    public var dwSize: UInt,
    hrasconnCtorArg: Hrasconn,
    public var szEntryName: ByteArray,
    public var szDeviceType: ByteArray,
    public var szDeviceName: ByteArray,
    public var szPhonebook: ByteArray,
    public var dwSubEntry: UInt,
    public var guidEntry: Guid,
    public var dwFlags: UInt,
    public var luid: Luid,
    public var guidCorrelationId: Guid,
) {
    public var hrasconn: Hrasconn = hrasconnCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        hrasconnCtorArg = MutPtr(0L),
        szEntryName = ByteArray(257),
        szDeviceType = ByteArray(17),
        szDeviceName = ByteArray(129),
        szPhonebook = ByteArray(260),
        dwSubEntry = 0u,
        guidEntry = Guid(),
        dwFlags = 0u,
        luid = Luid(),
        guidCorrelationId = Guid(),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Hrasconn = this.hrasconn

    public operator fun component3(): ByteArray = this.szEntryName

    public operator fun component4(): ByteArray = this.szDeviceType

    public operator fun component5(): ByteArray = this.szDeviceName

    public operator fun component6(): ByteArray = this.szPhonebook

    public operator fun component7(): UInt = this.dwSubEntry

    public operator fun component8(): Guid = this.guidEntry

    public operator fun component9(): UInt = this.dwFlags

    public operator fun component10(): Luid = this.luid

    public operator fun component11(): Guid = this.guidCorrelationId

    public fun copy(dwSize: UInt = this.dwSize, hrasconn: Hrasconn = this.hrasconn, szEntryName: ByteArray = this.szEntryName, szDeviceType: ByteArray = this.szDeviceType, szDeviceName: ByteArray = this.szDeviceName, szPhonebook: ByteArray = this.szPhonebook, dwSubEntry: UInt = this.dwSubEntry, guidEntry: Guid = this.guidEntry, dwFlags: UInt = this.dwFlags, luid: Luid = this.luid, guidCorrelationId: Guid = this.guidCorrelationId): Rasconna = Rasconna(dwSize = dwSize, hrasconnCtorArg = hrasconn, szEntryName = szEntryName, szDeviceType = szDeviceType, szDeviceName = szDeviceName, szPhonebook = szPhonebook, dwSubEntry = dwSubEntry, guidEntry = guidEntry, dwFlags = dwFlags, luid = luid, guidCorrelationId = guidCorrelationId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasconna) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hrasconn != other.hrasconn) return false
        if (!this.szEntryName.contentEquals(other.szEntryName)) return false
        if (!this.szDeviceType.contentEquals(other.szDeviceType)) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        if (!this.szPhonebook.contentEquals(other.szPhonebook)) return false
        if (this.dwSubEntry != other.dwSubEntry) return false
        if (this.guidEntry != other.guidEntry) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.luid != other.luid) return false
        if (this.guidCorrelationId != other.guidCorrelationId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.hrasconn.hashCode()
        result = 31 * result + this.szEntryName.contentHashCode()
        result = 31 * result + this.szDeviceType.contentHashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        result = 31 * result + this.szPhonebook.contentHashCode()
        result = 31 * result + this.dwSubEntry.hashCode()
        result = 31 * result + this.guidEntry.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.luid.hashCode()
        result = 31 * result + this.guidCorrelationId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            hrasconn: Hrasconn = MutPtr(0L),
            szEntryName: ByteArray = ByteArray(257),
            szDeviceType: ByteArray = ByteArray(17),
            szDeviceName: ByteArray = ByteArray(129),
            szPhonebook: ByteArray = ByteArray(260),
            dwSubEntry: UInt = 0u,
            guidEntry: Guid = Guid(),
            dwFlags: UInt = 0u,
            luid: Luid = Luid(),
            guidCorrelationId: Guid = Guid(),
        ): Rasconna =
            Rasconna(
                dwSize = dwSize,
                hrasconnCtorArg = hrasconn,
                szEntryName = szEntryName,
                szDeviceType = szDeviceType,
                szDeviceName = szDeviceName,
                szPhonebook = szPhonebook,
                dwSubEntry = dwSubEntry,
                guidEntry = guidEntry,
                dwFlags = dwFlags,
                luid = luid,
                guidCorrelationId = guidCorrelationId,
            )
    }
}

public data class Rasconnstatusa(
    public var dwSize: UInt = 0u,
    public var rasconnstate: Rasconnstate = 0,
    public var dwError: UInt = 0u,
    public var szDeviceType: ByteArray = ByteArray(17),
    public var szDeviceName: ByteArray = ByteArray(129),
    public var szPhoneNumber: ByteArray = ByteArray(129),
    public var localEndPoint: Rastunnelendpoint = Rastunnelendpoint(),
    public var remoteEndPoint: Rastunnelendpoint = Rastunnelendpoint(),
    public var rasconnsubstate: Rasconnsubstate = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasconnstatusa) return false
        if (this.dwSize != other.dwSize) return false
        if (this.rasconnstate != other.rasconnstate) return false
        if (this.dwError != other.dwError) return false
        if (!this.szDeviceType.contentEquals(other.szDeviceType)) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        if (!this.szPhoneNumber.contentEquals(other.szPhoneNumber)) return false
        if (this.localEndPoint != other.localEndPoint) return false
        if (this.remoteEndPoint != other.remoteEndPoint) return false
        if (this.rasconnsubstate != other.rasconnsubstate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.rasconnstate.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.szDeviceType.contentHashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        result = 31 * result + this.szPhoneNumber.contentHashCode()
        result = 31 * result + this.localEndPoint.hashCode()
        result = 31 * result + this.remoteEndPoint.hashCode()
        result = 31 * result + this.rasconnsubstate.hashCode()
        return result
    }
}

public data class Rasconnstatusw(
    public var dwSize: UInt = 0u,
    public var rasconnstate: Rasconnstate = 0,
    public var dwError: UInt = 0u,
    public var szDeviceType: UShortArray = UShortArray(17),
    public var szDeviceName: UShortArray = UShortArray(129),
    public var szPhoneNumber: UShortArray = UShortArray(129),
    public var localEndPoint: Rastunnelendpoint = Rastunnelendpoint(),
    public var remoteEndPoint: Rastunnelendpoint = Rastunnelendpoint(),
    public var rasconnsubstate: Rasconnsubstate = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasconnstatusw) return false
        if (this.dwSize != other.dwSize) return false
        if (this.rasconnstate != other.rasconnstate) return false
        if (this.dwError != other.dwError) return false
        if (!this.szDeviceType.contentEquals(other.szDeviceType)) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        if (!this.szPhoneNumber.contentEquals(other.szPhoneNumber)) return false
        if (this.localEndPoint != other.localEndPoint) return false
        if (this.remoteEndPoint != other.remoteEndPoint) return false
        if (this.rasconnsubstate != other.rasconnsubstate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.rasconnstate.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.szDeviceType.contentHashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        result = 31 * result + this.szPhoneNumber.contentHashCode()
        result = 31 * result + this.localEndPoint.hashCode()
        result = 31 * result + this.remoteEndPoint.hashCode()
        result = 31 * result + this.rasconnsubstate.hashCode()
        return result
    }
}

public class Rasconnw internal constructor(
    public var dwSize: UInt,
    hrasconnCtorArg: Hrasconn,
    public var szEntryName: UShortArray,
    public var szDeviceType: UShortArray,
    public var szDeviceName: UShortArray,
    public var szPhonebook: UShortArray,
    public var dwSubEntry: UInt,
    public var guidEntry: Guid,
    public var dwFlags: UInt,
    public var luid: Luid,
    public var guidCorrelationId: Guid,
) {
    public var hrasconn: Hrasconn = hrasconnCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        hrasconnCtorArg = MutPtr(0L),
        szEntryName = UShortArray(257),
        szDeviceType = UShortArray(17),
        szDeviceName = UShortArray(129),
        szPhonebook = UShortArray(260),
        dwSubEntry = 0u,
        guidEntry = Guid(),
        dwFlags = 0u,
        luid = Luid(),
        guidCorrelationId = Guid(),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Hrasconn = this.hrasconn

    public operator fun component3(): UShortArray = this.szEntryName

    public operator fun component4(): UShortArray = this.szDeviceType

    public operator fun component5(): UShortArray = this.szDeviceName

    public operator fun component6(): UShortArray = this.szPhonebook

    public operator fun component7(): UInt = this.dwSubEntry

    public operator fun component8(): Guid = this.guidEntry

    public operator fun component9(): UInt = this.dwFlags

    public operator fun component10(): Luid = this.luid

    public operator fun component11(): Guid = this.guidCorrelationId

    public fun copy(dwSize: UInt = this.dwSize, hrasconn: Hrasconn = this.hrasconn, szEntryName: UShortArray = this.szEntryName, szDeviceType: UShortArray = this.szDeviceType, szDeviceName: UShortArray = this.szDeviceName, szPhonebook: UShortArray = this.szPhonebook, dwSubEntry: UInt = this.dwSubEntry, guidEntry: Guid = this.guidEntry, dwFlags: UInt = this.dwFlags, luid: Luid = this.luid, guidCorrelationId: Guid = this.guidCorrelationId): Rasconnw = Rasconnw(dwSize = dwSize, hrasconnCtorArg = hrasconn, szEntryName = szEntryName, szDeviceType = szDeviceType, szDeviceName = szDeviceName, szPhonebook = szPhonebook, dwSubEntry = dwSubEntry, guidEntry = guidEntry, dwFlags = dwFlags, luid = luid, guidCorrelationId = guidCorrelationId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasconnw) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hrasconn != other.hrasconn) return false
        if (!this.szEntryName.contentEquals(other.szEntryName)) return false
        if (!this.szDeviceType.contentEquals(other.szDeviceType)) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        if (!this.szPhonebook.contentEquals(other.szPhonebook)) return false
        if (this.dwSubEntry != other.dwSubEntry) return false
        if (this.guidEntry != other.guidEntry) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.luid != other.luid) return false
        if (this.guidCorrelationId != other.guidCorrelationId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.hrasconn.hashCode()
        result = 31 * result + this.szEntryName.contentHashCode()
        result = 31 * result + this.szDeviceType.contentHashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        result = 31 * result + this.szPhonebook.contentHashCode()
        result = 31 * result + this.dwSubEntry.hashCode()
        result = 31 * result + this.guidEntry.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.luid.hashCode()
        result = 31 * result + this.guidCorrelationId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            hrasconn: Hrasconn = MutPtr(0L),
            szEntryName: UShortArray = UShortArray(257),
            szDeviceType: UShortArray = UShortArray(17),
            szDeviceName: UShortArray = UShortArray(129),
            szPhonebook: UShortArray = UShortArray(260),
            dwSubEntry: UInt = 0u,
            guidEntry: Guid = Guid(),
            dwFlags: UInt = 0u,
            luid: Luid = Luid(),
            guidCorrelationId: Guid = Guid(),
        ): Rasconnw =
            Rasconnw(
                dwSize = dwSize,
                hrasconnCtorArg = hrasconn,
                szEntryName = szEntryName,
                szDeviceType = szDeviceType,
                szDeviceName = szDeviceName,
                szPhonebook = szPhonebook,
                dwSubEntry = dwSubEntry,
                guidEntry = guidEntry,
                dwFlags = dwFlags,
                luid = luid,
                guidCorrelationId = guidCorrelationId,
            )
    }
}

public data class Rascredentialsa(
    public var dwSize: UInt = 0u,
    public var dwMask: UInt = 0u,
    public var szUserName: ByteArray = ByteArray(257),
    public var szPassword: ByteArray = ByteArray(257),
    public var szDomain: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rascredentialsa) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwMask != other.dwMask) return false
        if (!this.szUserName.contentEquals(other.szUserName)) return false
        if (!this.szPassword.contentEquals(other.szPassword)) return false
        if (!this.szDomain.contentEquals(other.szDomain)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwMask.hashCode()
        result = 31 * result + this.szUserName.contentHashCode()
        result = 31 * result + this.szPassword.contentHashCode()
        result = 31 * result + this.szDomain.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rascredentialsa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rascredentialsa> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 540L
                override fun readNative(addr: Long): Rascredentialsa =
                    Rascredentialsa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (257).toInt())
                        ).readNative(addr + 8L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (257).toInt())
                        ).readNative(addr + 265L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                        ).readNative(addr + 522L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: Rascredentialsa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMask)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (257).toInt())
                    ).writeNative(addr + 8L, value.szUserName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (257).toInt())
                    ).writeNative(addr + 265L, value.szPassword.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                    ).writeNative(addr + 522L, value.szDomain.toList())
                }
            }
    }
}

public data class Rascredentialsw(
    public var dwSize: UInt = 0u,
    public var dwMask: UInt = 0u,
    public var szUserName: UShortArray = UShortArray(257),
    public var szPassword: UShortArray = UShortArray(257),
    public var szDomain: UShortArray = UShortArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rascredentialsw) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwMask != other.dwMask) return false
        if (!this.szUserName.contentEquals(other.szUserName)) return false
        if (!this.szPassword.contentEquals(other.szPassword)) return false
        if (!this.szDomain.contentEquals(other.szDomain)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwMask.hashCode()
        result = 31 * result + this.szUserName.contentHashCode()
        result = 31 * result + this.szPassword.contentHashCode()
        result = 31 * result + this.szDomain.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rascredentialsw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rascredentialsw> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1068L
                override fun readNative(addr: Long): Rascredentialsw =
                    Rascredentialsw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (257).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (257).toInt())
                        ).readNative(addr + 522L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                        ).readNative(addr + 1036L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Rascredentialsw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMask)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (257).toInt())
                    ).writeNative(addr + 8L, value.szUserName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (257).toInt())
                    ).writeNative(addr + 522L, value.szPassword.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                    ).writeNative(addr + 1036L, value.szDomain.toList())
                }
            }
    }
}

public data class Rasctryinfo(
    public var dwSize: UInt = 0u,
    public var dwCountryID: UInt = 0u,
    public var dwNextCountryID: UInt = 0u,
    public var dwCountryCode: UInt = 0u,
    public var dwCountryNameOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rasctryinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rasctryinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): Rasctryinfo =
                    Rasctryinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Rasctryinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwCountryID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwNextCountryID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwCountryCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwCountryNameOffset)
                }
            }
    }
}

public data class Rascustomscriptextensions(
    public var dwSize: UInt = 0u,
    public var pfnRasSetCommSettings: Pfnrassetcommsettings = null,
)

public data class Rasdevinfoa(
    public var dwSize: UInt = 0u,
    public var szDeviceType: ByteArray = ByteArray(17),
    public var szDeviceName: ByteArray = ByteArray(129),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasdevinfoa) return false
        if (this.dwSize != other.dwSize) return false
        if (!this.szDeviceType.contentEquals(other.szDeviceType)) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.szDeviceType.contentHashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rasdevinfoa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rasdevinfoa> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 152L
                override fun readNative(addr: Long): Rasdevinfoa =
                    Rasdevinfoa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (17).toInt())
                        ).readNative(addr + 4L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (129).toInt())
                        ).readNative(addr + 21L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: Rasdevinfoa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (17).toInt())
                    ).writeNative(addr + 4L, value.szDeviceType.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (129).toInt())
                    ).writeNative(addr + 21L, value.szDeviceName.toList())
                }
            }
    }
}

public data class Rasdevinfow(
    public var dwSize: UInt = 0u,
    public var szDeviceType: UShortArray = UShortArray(17),
    public var szDeviceName: UShortArray = UShortArray(129),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasdevinfow) return false
        if (this.dwSize != other.dwSize) return false
        if (!this.szDeviceType.contentEquals(other.szDeviceType)) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.szDeviceType.contentHashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rasdevinfow> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rasdevinfow> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 296L
                override fun readNative(addr: Long): Rasdevinfow =
                    Rasdevinfow(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (17).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (129).toInt())
                        ).readNative(addr + 38L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Rasdevinfow) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (17).toInt())
                    ).writeNative(addr + 4L, value.szDeviceType.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (129).toInt())
                    ).writeNative(addr + 38L, value.szDeviceName.toList())
                }
            }
    }
}

public class Rasdevspecificinfo internal constructor(
    public var dwSize: UInt,
    pbDevSpecificInfoCtorArg: MutPtr,
) {
    public var pbDevSpecificInfo: MutPtr = pbDevSpecificInfoCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        pbDevSpecificInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): MutPtr = this.pbDevSpecificInfo

    public fun copy(dwSize: UInt = this.dwSize, pbDevSpecificInfo: MutPtr = this.pbDevSpecificInfo): Rasdevspecificinfo = Rasdevspecificinfo(dwSize = dwSize, pbDevSpecificInfoCtorArg = pbDevSpecificInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasdevspecificinfo) return false
        if (this.dwSize != other.dwSize) return false
        if (this.pbDevSpecificInfo != other.pbDevSpecificInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.pbDevSpecificInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rasdevspecificinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rasdevspecificinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Rasdevspecificinfo =
                    Rasdevspecificinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Rasdevspecificinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 4L, value.pbDevSpecificInfo)
                }
            }

        public operator fun invoke(
            dwSize: UInt = 0u,
            pbDevSpecificInfo: MutPtr = MutPtr(0L),
        ): Rasdevspecificinfo =
            Rasdevspecificinfo(
                dwSize = dwSize,
                pbDevSpecificInfoCtorArg = pbDevSpecificInfo,
            )
    }
}

public class Rasdialdlg internal constructor(
    public var dwSize: UInt,
    hwndOwnerCtorArg: Hwnd,
    public var dwFlags: UInt,
    public var xDlg: Int,
    public var yDlg: Int,
    public var dwSubEntry: UInt,
    public var dwError: UInt,
    public var reserved: Int,
    public var reserved2: Int,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        dwFlags = 0u,
        xDlg = 0,
        yDlg = 0,
        dwSubEntry = 0u,
        dwError = 0u,
        reserved = 0,
        reserved2 = 0,
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Hwnd = this.hwndOwner

    public operator fun component3(): UInt = this.dwFlags

    public operator fun component4(): Int = this.xDlg

    public operator fun component5(): Int = this.yDlg

    public operator fun component6(): UInt = this.dwSubEntry

    public operator fun component7(): UInt = this.dwError

    public operator fun component8(): Int = this.reserved

    public operator fun component9(): Int = this.reserved2

    public fun copy(dwSize: UInt = this.dwSize, hwndOwner: Hwnd = this.hwndOwner, dwFlags: UInt = this.dwFlags, xDlg: Int = this.xDlg, yDlg: Int = this.yDlg, dwSubEntry: UInt = this.dwSubEntry, dwError: UInt = this.dwError, reserved: Int = this.reserved, reserved2: Int = this.reserved2): Rasdialdlg = Rasdialdlg(dwSize = dwSize, hwndOwnerCtorArg = hwndOwner, dwFlags = dwFlags, xDlg = xDlg, yDlg = yDlg, dwSubEntry = dwSubEntry, dwError = dwError, reserved = reserved, reserved2 = reserved2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasdialdlg) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hwndOwner != other.hwndOwner) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.xDlg != other.xDlg) return false
        if (this.yDlg != other.yDlg) return false
        if (this.dwSubEntry != other.dwSubEntry) return false
        if (this.dwError != other.dwError) return false
        if (this.reserved != other.reserved) return false
        if (this.reserved2 != other.reserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.hwndOwner.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.xDlg.hashCode()
        result = 31 * result + this.yDlg.hashCode()
        result = 31 * result + this.dwSubEntry.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            dwFlags: UInt = 0u,
            xDlg: Int = 0,
            yDlg: Int = 0,
            dwSubEntry: UInt = 0u,
            dwError: UInt = 0u,
            reserved: Int = 0,
            reserved2: Int = 0,
        ): Rasdialdlg =
            Rasdialdlg(
                dwSize = dwSize,
                hwndOwnerCtorArg = hwndOwner,
                dwFlags = dwFlags,
                xDlg = xDlg,
                yDlg = yDlg,
                dwSubEntry = dwSubEntry,
                dwError = dwError,
                reserved = reserved,
                reserved2 = reserved2,
            )
    }
}

public class Rasdialextensions internal constructor(
    public var dwSize: UInt,
    public var dwfOptions: UInt,
    hwndParentCtorArg: Hwnd,
    public var reserved: Int,
    public var reserved1: Int,
    public var rasEapInfo: Raseapinfo,
    public var fSkipPppAuth: Bool,
    public var rasDevSpecificInfo: Rasdevspecificinfo,
) {
    public var hwndParent: Hwnd = hwndParentCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        dwfOptions = 0u,
        hwndParentCtorArg = MutPtr(0L),
        reserved = 0,
        reserved1 = 0,
        rasEapInfo = Raseapinfo(),
        fSkipPppAuth = 0,
        rasDevSpecificInfo = Rasdevspecificinfo(),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UInt = this.dwfOptions

    public operator fun component3(): Hwnd = this.hwndParent

    public operator fun component4(): Int = this.reserved

    public operator fun component5(): Int = this.reserved1

    public operator fun component6(): Raseapinfo = this.rasEapInfo

    public operator fun component7(): Bool = this.fSkipPppAuth

    public operator fun component8(): Rasdevspecificinfo = this.rasDevSpecificInfo

    public fun copy(dwSize: UInt = this.dwSize, dwfOptions: UInt = this.dwfOptions, hwndParent: Hwnd = this.hwndParent, reserved: Int = this.reserved, reserved1: Int = this.reserved1, rasEapInfo: Raseapinfo = this.rasEapInfo, fSkipPppAuth: Bool = this.fSkipPppAuth, rasDevSpecificInfo: Rasdevspecificinfo = this.rasDevSpecificInfo): Rasdialextensions = Rasdialextensions(dwSize = dwSize, dwfOptions = dwfOptions, hwndParentCtorArg = hwndParent, reserved = reserved, reserved1 = reserved1, rasEapInfo = rasEapInfo, fSkipPppAuth = fSkipPppAuth, rasDevSpecificInfo = rasDevSpecificInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasdialextensions) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwfOptions != other.dwfOptions) return false
        if (this.hwndParent != other.hwndParent) return false
        if (this.reserved != other.reserved) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.rasEapInfo != other.rasEapInfo) return false
        if (this.fSkipPppAuth != other.fSkipPppAuth) return false
        if (this.rasDevSpecificInfo != other.rasDevSpecificInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwfOptions.hashCode()
        result = 31 * result + this.hwndParent.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.rasEapInfo.hashCode()
        result = 31 * result + this.fSkipPppAuth.hashCode()
        result = 31 * result + this.rasDevSpecificInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            dwfOptions: UInt = 0u,
            hwndParent: Hwnd = MutPtr(0L),
            reserved: Int = 0,
            reserved1: Int = 0,
            rasEapInfo: Raseapinfo = Raseapinfo(),
            fSkipPppAuth: Bool = 0,
            rasDevSpecificInfo: Rasdevspecificinfo = Rasdevspecificinfo(),
        ): Rasdialextensions =
            Rasdialextensions(
                dwSize = dwSize,
                dwfOptions = dwfOptions,
                hwndParentCtorArg = hwndParent,
                reserved = reserved,
                reserved1 = reserved1,
                rasEapInfo = rasEapInfo,
                fSkipPppAuth = fSkipPppAuth,
                rasDevSpecificInfo = rasDevSpecificInfo,
            )
    }
}

public class Rasdialparamsa internal constructor(
    public var dwSize: UInt,
    public var szEntryName: ByteArray,
    public var szPhoneNumber: ByteArray,
    public var szCallbackNumber: ByteArray,
    public var szUserName: ByteArray,
    public var szPassword: ByteArray,
    public var szDomain: ByteArray,
    public var dwSubEntry: UInt,
    public var dwCallbackId: Int,
    public var dwIfIndex: UInt,
    szEncPasswordCtorArg: Pstr,
) {
    public var szEncPassword: Pstr = szEncPasswordCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        szEntryName = ByteArray(257),
        szPhoneNumber = ByteArray(129),
        szCallbackNumber = ByteArray(129),
        szUserName = ByteArray(257),
        szPassword = ByteArray(257),
        szDomain = ByteArray(16),
        dwSubEntry = 0u,
        dwCallbackId = 0,
        dwIfIndex = 0u,
        szEncPasswordCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): ByteArray = this.szEntryName

    public operator fun component3(): ByteArray = this.szPhoneNumber

    public operator fun component4(): ByteArray = this.szCallbackNumber

    public operator fun component5(): ByteArray = this.szUserName

    public operator fun component6(): ByteArray = this.szPassword

    public operator fun component7(): ByteArray = this.szDomain

    public operator fun component8(): UInt = this.dwSubEntry

    public operator fun component9(): Int = this.dwCallbackId

    public operator fun component10(): UInt = this.dwIfIndex

    public operator fun component11(): Pstr = this.szEncPassword

    public fun copy(dwSize: UInt = this.dwSize, szEntryName: ByteArray = this.szEntryName, szPhoneNumber: ByteArray = this.szPhoneNumber, szCallbackNumber: ByteArray = this.szCallbackNumber, szUserName: ByteArray = this.szUserName, szPassword: ByteArray = this.szPassword, szDomain: ByteArray = this.szDomain, dwSubEntry: UInt = this.dwSubEntry, dwCallbackId: Int = this.dwCallbackId, dwIfIndex: UInt = this.dwIfIndex, szEncPassword: Pstr = this.szEncPassword): Rasdialparamsa = Rasdialparamsa(dwSize = dwSize, szEntryName = szEntryName, szPhoneNumber = szPhoneNumber, szCallbackNumber = szCallbackNumber, szUserName = szUserName, szPassword = szPassword, szDomain = szDomain, dwSubEntry = dwSubEntry, dwCallbackId = dwCallbackId, dwIfIndex = dwIfIndex, szEncPasswordCtorArg = szEncPassword)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasdialparamsa) return false
        if (this.dwSize != other.dwSize) return false
        if (!this.szEntryName.contentEquals(other.szEntryName)) return false
        if (!this.szPhoneNumber.contentEquals(other.szPhoneNumber)) return false
        if (!this.szCallbackNumber.contentEquals(other.szCallbackNumber)) return false
        if (!this.szUserName.contentEquals(other.szUserName)) return false
        if (!this.szPassword.contentEquals(other.szPassword)) return false
        if (!this.szDomain.contentEquals(other.szDomain)) return false
        if (this.dwSubEntry != other.dwSubEntry) return false
        if (this.dwCallbackId != other.dwCallbackId) return false
        if (this.dwIfIndex != other.dwIfIndex) return false
        if (this.szEncPassword != other.szEncPassword) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.szEntryName.contentHashCode()
        result = 31 * result + this.szPhoneNumber.contentHashCode()
        result = 31 * result + this.szCallbackNumber.contentHashCode()
        result = 31 * result + this.szUserName.contentHashCode()
        result = 31 * result + this.szPassword.contentHashCode()
        result = 31 * result + this.szDomain.contentHashCode()
        result = 31 * result + this.dwSubEntry.hashCode()
        result = 31 * result + this.dwCallbackId.hashCode()
        result = 31 * result + this.dwIfIndex.hashCode()
        result = 31 * result + this.szEncPassword.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            szEntryName: ByteArray = ByteArray(257),
            szPhoneNumber: ByteArray = ByteArray(129),
            szCallbackNumber: ByteArray = ByteArray(129),
            szUserName: ByteArray = ByteArray(257),
            szPassword: ByteArray = ByteArray(257),
            szDomain: ByteArray = ByteArray(16),
            dwSubEntry: UInt = 0u,
            dwCallbackId: Int = 0,
            dwIfIndex: UInt = 0u,
            szEncPassword: Pstr = MutPtr(0L),
        ): Rasdialparamsa =
            Rasdialparamsa(
                dwSize = dwSize,
                szEntryName = szEntryName,
                szPhoneNumber = szPhoneNumber,
                szCallbackNumber = szCallbackNumber,
                szUserName = szUserName,
                szPassword = szPassword,
                szDomain = szDomain,
                dwSubEntry = dwSubEntry,
                dwCallbackId = dwCallbackId,
                dwIfIndex = dwIfIndex,
                szEncPasswordCtorArg = szEncPassword,
            )
    }
}

public class Rasdialparamsw internal constructor(
    public var dwSize: UInt,
    public var szEntryName: UShortArray,
    public var szPhoneNumber: UShortArray,
    public var szCallbackNumber: UShortArray,
    public var szUserName: UShortArray,
    public var szPassword: UShortArray,
    public var szDomain: UShortArray,
    public var dwSubEntry: UInt,
    public var dwCallbackId: Int,
    public var dwIfIndex: UInt,
    szEncPasswordCtorArg: Pwstr,
) {
    public var szEncPassword: Pwstr = szEncPasswordCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        szEntryName = UShortArray(257),
        szPhoneNumber = UShortArray(129),
        szCallbackNumber = UShortArray(129),
        szUserName = UShortArray(257),
        szPassword = UShortArray(257),
        szDomain = UShortArray(16),
        dwSubEntry = 0u,
        dwCallbackId = 0,
        dwIfIndex = 0u,
        szEncPasswordCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): UShortArray = this.szEntryName

    public operator fun component3(): UShortArray = this.szPhoneNumber

    public operator fun component4(): UShortArray = this.szCallbackNumber

    public operator fun component5(): UShortArray = this.szUserName

    public operator fun component6(): UShortArray = this.szPassword

    public operator fun component7(): UShortArray = this.szDomain

    public operator fun component8(): UInt = this.dwSubEntry

    public operator fun component9(): Int = this.dwCallbackId

    public operator fun component10(): UInt = this.dwIfIndex

    public operator fun component11(): Pwstr = this.szEncPassword

    public fun copy(dwSize: UInt = this.dwSize, szEntryName: UShortArray = this.szEntryName, szPhoneNumber: UShortArray = this.szPhoneNumber, szCallbackNumber: UShortArray = this.szCallbackNumber, szUserName: UShortArray = this.szUserName, szPassword: UShortArray = this.szPassword, szDomain: UShortArray = this.szDomain, dwSubEntry: UInt = this.dwSubEntry, dwCallbackId: Int = this.dwCallbackId, dwIfIndex: UInt = this.dwIfIndex, szEncPassword: Pwstr = this.szEncPassword): Rasdialparamsw = Rasdialparamsw(dwSize = dwSize, szEntryName = szEntryName, szPhoneNumber = szPhoneNumber, szCallbackNumber = szCallbackNumber, szUserName = szUserName, szPassword = szPassword, szDomain = szDomain, dwSubEntry = dwSubEntry, dwCallbackId = dwCallbackId, dwIfIndex = dwIfIndex, szEncPasswordCtorArg = szEncPassword)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasdialparamsw) return false
        if (this.dwSize != other.dwSize) return false
        if (!this.szEntryName.contentEquals(other.szEntryName)) return false
        if (!this.szPhoneNumber.contentEquals(other.szPhoneNumber)) return false
        if (!this.szCallbackNumber.contentEquals(other.szCallbackNumber)) return false
        if (!this.szUserName.contentEquals(other.szUserName)) return false
        if (!this.szPassword.contentEquals(other.szPassword)) return false
        if (!this.szDomain.contentEquals(other.szDomain)) return false
        if (this.dwSubEntry != other.dwSubEntry) return false
        if (this.dwCallbackId != other.dwCallbackId) return false
        if (this.dwIfIndex != other.dwIfIndex) return false
        if (this.szEncPassword != other.szEncPassword) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.szEntryName.contentHashCode()
        result = 31 * result + this.szPhoneNumber.contentHashCode()
        result = 31 * result + this.szCallbackNumber.contentHashCode()
        result = 31 * result + this.szUserName.contentHashCode()
        result = 31 * result + this.szPassword.contentHashCode()
        result = 31 * result + this.szDomain.contentHashCode()
        result = 31 * result + this.dwSubEntry.hashCode()
        result = 31 * result + this.dwCallbackId.hashCode()
        result = 31 * result + this.dwIfIndex.hashCode()
        result = 31 * result + this.szEncPassword.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            szEntryName: UShortArray = UShortArray(257),
            szPhoneNumber: UShortArray = UShortArray(129),
            szCallbackNumber: UShortArray = UShortArray(129),
            szUserName: UShortArray = UShortArray(257),
            szPassword: UShortArray = UShortArray(257),
            szDomain: UShortArray = UShortArray(16),
            dwSubEntry: UInt = 0u,
            dwCallbackId: Int = 0,
            dwIfIndex: UInt = 0u,
            szEncPassword: Pwstr = MutPtr(0L),
        ): Rasdialparamsw =
            Rasdialparamsw(
                dwSize = dwSize,
                szEntryName = szEntryName,
                szPhoneNumber = szPhoneNumber,
                szCallbackNumber = szCallbackNumber,
                szUserName = szUserName,
                szPassword = szPassword,
                szDomain = szDomain,
                dwSubEntry = dwSubEntry,
                dwCallbackId = dwCallbackId,
                dwIfIndex = dwIfIndex,
                szEncPasswordCtorArg = szEncPassword,
            )
    }
}

public class Raseapinfo internal constructor(
    public var dwSizeofEapInfo: UInt,
    pbEapInfoCtorArg: MutPtr,
) {
    public var pbEapInfo: MutPtr = pbEapInfoCtorArg
        internal set

    public constructor() : this(
        dwSizeofEapInfo = 0u,
        pbEapInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSizeofEapInfo

    public operator fun component2(): MutPtr = this.pbEapInfo

    public fun copy(dwSizeofEapInfo: UInt = this.dwSizeofEapInfo, pbEapInfo: MutPtr = this.pbEapInfo): Raseapinfo = Raseapinfo(dwSizeofEapInfo = dwSizeofEapInfo, pbEapInfoCtorArg = pbEapInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Raseapinfo) return false
        if (this.dwSizeofEapInfo != other.dwSizeofEapInfo) return false
        if (this.pbEapInfo != other.pbEapInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSizeofEapInfo.hashCode()
        result = 31 * result + this.pbEapInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Raseapinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Raseapinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Raseapinfo =
                    Raseapinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Raseapinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSizeofEapInfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 4L, value.pbEapInfo)
                }
            }

        public operator fun invoke(
            dwSizeofEapInfo: UInt = 0u,
            pbEapInfo: MutPtr = MutPtr(0L),
        ): Raseapinfo =
            Raseapinfo(
                dwSizeofEapInfo = dwSizeofEapInfo,
                pbEapInfoCtorArg = pbEapInfo,
            )
    }
}

public data class Raseapuseridentitya(
    public var szUserName: ByteArray = ByteArray(257),
    public var dwSizeofEapInfo: UInt = 0u,
    public var pbEapInfo: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Raseapuseridentitya) return false
        if (!this.szUserName.contentEquals(other.szUserName)) return false
        if (this.dwSizeofEapInfo != other.dwSizeofEapInfo) return false
        if (!this.pbEapInfo.contentEquals(other.pbEapInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szUserName.contentHashCode()
        result = 31 * result + this.dwSizeofEapInfo.hashCode()
        result = 31 * result + this.pbEapInfo.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Raseapuseridentitya> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Raseapuseridentitya> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 268L
                override fun readNative(addr: Long): Raseapuseridentitya =
                    Raseapuseridentitya(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (257).toInt())
                        ).readNative(addr).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 260L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 264L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Raseapuseridentitya) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (257).toInt())
                    ).writeNative(addr, value.szUserName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 260L, value.dwSizeofEapInfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 264L, value.pbEapInfo.toList())
                }
            }
    }
}

public data class Raseapuseridentityw(
    public var szUserName: UShortArray = UShortArray(257),
    public var dwSizeofEapInfo: UInt = 0u,
    public var pbEapInfo: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Raseapuseridentityw) return false
        if (!this.szUserName.contentEquals(other.szUserName)) return false
        if (this.dwSizeofEapInfo != other.dwSizeofEapInfo) return false
        if (!this.pbEapInfo.contentEquals(other.pbEapInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.szUserName.contentHashCode()
        result = 31 * result + this.dwSizeofEapInfo.hashCode()
        result = 31 * result + this.pbEapInfo.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Raseapuseridentityw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Raseapuseridentityw> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 524L
                override fun readNative(addr: Long): Raseapuseridentityw =
                    Raseapuseridentityw(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (257).toInt())
                        ).readNative(addr).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 516L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 520L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Raseapuseridentityw) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (257).toInt())
                    ).writeNative(addr, value.szUserName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 516L, value.dwSizeofEapInfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 520L, value.pbEapInfo.toList())
                }
            }
    }
}

public class Rasentrya(
    public var dwSize: UInt = 0u,
    public var dwfOptions: UInt = 0u,
    public var dwCountryID: UInt = 0u,
    public var dwCountryCode: UInt = 0u,
    public var szAreaCode: ByteArray = ByteArray(11),
    public var szLocalPhoneNumber: ByteArray = ByteArray(129),
    public var dwAlternateOffset: UInt = 0u,
    public var ipaddr: Rasipaddr = Rasipaddr(),
    public var ipaddrDns: Rasipaddr = Rasipaddr(),
    public var ipaddrDnsAlt: Rasipaddr = Rasipaddr(),
    public var ipaddrWins: Rasipaddr = Rasipaddr(),
    public var ipaddrWinsAlt: Rasipaddr = Rasipaddr(),
    public var dwFrameSize: UInt = 0u,
    public var dwfNetProtocols: UInt = 0u,
    public var dwFramingProtocol: UInt = 0u,
    public var szScript: ByteArray = ByteArray(260),
    public var szAutodialDll: ByteArray = ByteArray(260),
    public var szAutodialFunc: ByteArray = ByteArray(260),
    public var szDeviceType: ByteArray = ByteArray(17),
    public var szDeviceName: ByteArray = ByteArray(129),
    public var szX25PadType: ByteArray = ByteArray(33),
    public var szX25Address: ByteArray = ByteArray(201),
    public var szX25Facilities: ByteArray = ByteArray(201),
    public var szX25UserData: ByteArray = ByteArray(201),
    public var dwChannels: UInt = 0u,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var dwSubEntries: UInt = 0u,
    public var dwDialMode: RasentryDialMode = 0u,
    public var dwDialExtraPercent: UInt = 0u,
    public var dwDialExtraSampleSeconds: UInt = 0u,
    public var dwHangUpExtraPercent: UInt = 0u,
    public var dwHangUpExtraSampleSeconds: UInt = 0u,
    public var dwIdleDisconnectSeconds: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwEncryptionType: UInt = 0u,
    public var dwCustomAuthKey: UInt = 0u,
    public var guidId: Guid = Guid(),
    public var szCustomDialDll: ByteArray = ByteArray(260),
    public var dwVpnStrategy: UInt = 0u,
    public var dwfOptions2: UInt = 0u,
    public var dwfOptions3: UInt = 0u,
    public var szDnsSuffix: ByteArray = ByteArray(256),
    public var dwTcpWindowSize: UInt = 0u,
    public var szPrerequisitePbk: ByteArray = ByteArray(260),
    public var szPrerequisiteEntry: ByteArray = ByteArray(257),
    public var dwRedialCount: UInt = 0u,
    public var dwRedialPause: UInt = 0u,
    public var ipv6addrDns: In6Addr = In6Addr(),
    public var ipv6addrDnsAlt: In6Addr = In6Addr(),
    public var dwIPv4InterfaceMetric: UInt = 0u,
    public var dwIPv6InterfaceMetric: UInt = 0u,
    public var ipv6addr: In6Addr = In6Addr(),
    public var dwIPv6PrefixLength: UInt = 0u,
    public var dwNetworkOutageTime: UInt = 0u,
    public var szIDi: ByteArray = ByteArray(257),
    public var szIDr: ByteArray = ByteArray(257),
    public var fIsImsConfig: Bool = 0,
    public var idiType: Ikev2IdPayloadType = 0,
    public var idrType: Ikev2IdPayloadType = 0,
    public var fDisableIKEv2Fragmentation: Bool = 0,
)

public class Rasentrydlga internal constructor(
    public var dwSize: UInt,
    hwndOwnerCtorArg: Hwnd,
    public var dwFlags: UInt,
    public var xDlg: Int,
    public var yDlg: Int,
    public var szEntry: ByteArray,
    public var dwError: UInt,
    public var reserved: Int,
    public var reserved2: Int,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        dwFlags = 0u,
        xDlg = 0,
        yDlg = 0,
        szEntry = ByteArray(257),
        dwError = 0u,
        reserved = 0,
        reserved2 = 0,
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Hwnd = this.hwndOwner

    public operator fun component3(): UInt = this.dwFlags

    public operator fun component4(): Int = this.xDlg

    public operator fun component5(): Int = this.yDlg

    public operator fun component6(): ByteArray = this.szEntry

    public operator fun component7(): UInt = this.dwError

    public operator fun component8(): Int = this.reserved

    public operator fun component9(): Int = this.reserved2

    public fun copy(dwSize: UInt = this.dwSize, hwndOwner: Hwnd = this.hwndOwner, dwFlags: UInt = this.dwFlags, xDlg: Int = this.xDlg, yDlg: Int = this.yDlg, szEntry: ByteArray = this.szEntry, dwError: UInt = this.dwError, reserved: Int = this.reserved, reserved2: Int = this.reserved2): Rasentrydlga = Rasentrydlga(dwSize = dwSize, hwndOwnerCtorArg = hwndOwner, dwFlags = dwFlags, xDlg = xDlg, yDlg = yDlg, szEntry = szEntry, dwError = dwError, reserved = reserved, reserved2 = reserved2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasentrydlga) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hwndOwner != other.hwndOwner) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.xDlg != other.xDlg) return false
        if (this.yDlg != other.yDlg) return false
        if (!this.szEntry.contentEquals(other.szEntry)) return false
        if (this.dwError != other.dwError) return false
        if (this.reserved != other.reserved) return false
        if (this.reserved2 != other.reserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.hwndOwner.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.xDlg.hashCode()
        result = 31 * result + this.yDlg.hashCode()
        result = 31 * result + this.szEntry.contentHashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            dwFlags: UInt = 0u,
            xDlg: Int = 0,
            yDlg: Int = 0,
            szEntry: ByteArray = ByteArray(257),
            dwError: UInt = 0u,
            reserved: Int = 0,
            reserved2: Int = 0,
        ): Rasentrydlga =
            Rasentrydlga(
                dwSize = dwSize,
                hwndOwnerCtorArg = hwndOwner,
                dwFlags = dwFlags,
                xDlg = xDlg,
                yDlg = yDlg,
                szEntry = szEntry,
                dwError = dwError,
                reserved = reserved,
                reserved2 = reserved2,
            )
    }
}

public class Rasentrydlgw internal constructor(
    public var dwSize: UInt,
    hwndOwnerCtorArg: Hwnd,
    public var dwFlags: UInt,
    public var xDlg: Int,
    public var yDlg: Int,
    public var szEntry: UShortArray,
    public var dwError: UInt,
    public var reserved: Int,
    public var reserved2: Int,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        dwFlags = 0u,
        xDlg = 0,
        yDlg = 0,
        szEntry = UShortArray(257),
        dwError = 0u,
        reserved = 0,
        reserved2 = 0,
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Hwnd = this.hwndOwner

    public operator fun component3(): UInt = this.dwFlags

    public operator fun component4(): Int = this.xDlg

    public operator fun component5(): Int = this.yDlg

    public operator fun component6(): UShortArray = this.szEntry

    public operator fun component7(): UInt = this.dwError

    public operator fun component8(): Int = this.reserved

    public operator fun component9(): Int = this.reserved2

    public fun copy(dwSize: UInt = this.dwSize, hwndOwner: Hwnd = this.hwndOwner, dwFlags: UInt = this.dwFlags, xDlg: Int = this.xDlg, yDlg: Int = this.yDlg, szEntry: UShortArray = this.szEntry, dwError: UInt = this.dwError, reserved: Int = this.reserved, reserved2: Int = this.reserved2): Rasentrydlgw = Rasentrydlgw(dwSize = dwSize, hwndOwnerCtorArg = hwndOwner, dwFlags = dwFlags, xDlg = xDlg, yDlg = yDlg, szEntry = szEntry, dwError = dwError, reserved = reserved, reserved2 = reserved2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasentrydlgw) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hwndOwner != other.hwndOwner) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.xDlg != other.xDlg) return false
        if (this.yDlg != other.yDlg) return false
        if (!this.szEntry.contentEquals(other.szEntry)) return false
        if (this.dwError != other.dwError) return false
        if (this.reserved != other.reserved) return false
        if (this.reserved2 != other.reserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.hwndOwner.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.xDlg.hashCode()
        result = 31 * result + this.yDlg.hashCode()
        result = 31 * result + this.szEntry.contentHashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            dwFlags: UInt = 0u,
            xDlg: Int = 0,
            yDlg: Int = 0,
            szEntry: UShortArray = UShortArray(257),
            dwError: UInt = 0u,
            reserved: Int = 0,
            reserved2: Int = 0,
        ): Rasentrydlgw =
            Rasentrydlgw(
                dwSize = dwSize,
                hwndOwnerCtorArg = hwndOwner,
                dwFlags = dwFlags,
                xDlg = xDlg,
                yDlg = yDlg,
                szEntry = szEntry,
                dwError = dwError,
                reserved = reserved,
                reserved2 = reserved2,
            )
    }
}

public data class Rasentrynamea(
    public var dwSize: UInt = 0u,
    public var szEntryName: ByteArray = ByteArray(257),
    public var dwFlags: UInt = 0u,
    public var szPhonebookPath: ByteArray = ByteArray(261),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasentrynamea) return false
        if (this.dwSize != other.dwSize) return false
        if (!this.szEntryName.contentEquals(other.szEntryName)) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.szPhonebookPath.contentEquals(other.szPhonebookPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.szEntryName.contentHashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.szPhonebookPath.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rasentrynamea> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rasentrynamea> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 532L
                override fun readNative(addr: Long): Rasentrynamea =
                    Rasentrynamea(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (257).toInt())
                        ).readNative(addr + 4L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 264L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (261).toInt())
                        ).readNative(addr + 268L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: Rasentrynamea) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (257).toInt())
                    ).writeNative(addr + 4L, value.szEntryName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 264L, value.dwFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (261).toInt())
                    ).writeNative(addr + 268L, value.szPhonebookPath.toList())
                }
            }
    }
}

public data class Rasentrynamew(
    public var dwSize: UInt = 0u,
    public var szEntryName: UShortArray = UShortArray(257),
    public var dwFlags: UInt = 0u,
    public var szPhonebookPath: UShortArray = UShortArray(261),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasentrynamew) return false
        if (this.dwSize != other.dwSize) return false
        if (!this.szEntryName.contentEquals(other.szEntryName)) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.szPhonebookPath.contentEquals(other.szPhonebookPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.szEntryName.contentHashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.szPhonebookPath.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rasentrynamew> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rasentrynamew> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1048L
                override fun readNative(addr: Long): Rasentrynamew =
                    Rasentrynamew(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (257).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 520L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                        ).readNative(addr + 524L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Rasentrynamew) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (257).toInt())
                    ).writeNative(addr + 4L, value.szEntryName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 520L, value.dwFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (261).toInt())
                    ).writeNative(addr + 524L, value.szPhonebookPath.toList())
                }
            }
    }
}

public class Rasentryw(
    public var dwSize: UInt = 0u,
    public var dwfOptions: UInt = 0u,
    public var dwCountryID: UInt = 0u,
    public var dwCountryCode: UInt = 0u,
    public var szAreaCode: UShortArray = UShortArray(11),
    public var szLocalPhoneNumber: UShortArray = UShortArray(129),
    public var dwAlternateOffset: UInt = 0u,
    public var ipaddr: Rasipaddr = Rasipaddr(),
    public var ipaddrDns: Rasipaddr = Rasipaddr(),
    public var ipaddrDnsAlt: Rasipaddr = Rasipaddr(),
    public var ipaddrWins: Rasipaddr = Rasipaddr(),
    public var ipaddrWinsAlt: Rasipaddr = Rasipaddr(),
    public var dwFrameSize: UInt = 0u,
    public var dwfNetProtocols: UInt = 0u,
    public var dwFramingProtocol: UInt = 0u,
    public var szScript: UShortArray = UShortArray(260),
    public var szAutodialDll: UShortArray = UShortArray(260),
    public var szAutodialFunc: UShortArray = UShortArray(260),
    public var szDeviceType: UShortArray = UShortArray(17),
    public var szDeviceName: UShortArray = UShortArray(129),
    public var szX25PadType: UShortArray = UShortArray(33),
    public var szX25Address: UShortArray = UShortArray(201),
    public var szX25Facilities: UShortArray = UShortArray(201),
    public var szX25UserData: UShortArray = UShortArray(201),
    public var dwChannels: UInt = 0u,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var dwSubEntries: UInt = 0u,
    public var dwDialMode: RasentryDialMode = 0u,
    public var dwDialExtraPercent: UInt = 0u,
    public var dwDialExtraSampleSeconds: UInt = 0u,
    public var dwHangUpExtraPercent: UInt = 0u,
    public var dwHangUpExtraSampleSeconds: UInt = 0u,
    public var dwIdleDisconnectSeconds: UInt = 0u,
    public var dwType: UInt = 0u,
    public var dwEncryptionType: UInt = 0u,
    public var dwCustomAuthKey: UInt = 0u,
    public var guidId: Guid = Guid(),
    public var szCustomDialDll: UShortArray = UShortArray(260),
    public var dwVpnStrategy: UInt = 0u,
    public var dwfOptions2: UInt = 0u,
    public var dwfOptions3: UInt = 0u,
    public var szDnsSuffix: UShortArray = UShortArray(256),
    public var dwTcpWindowSize: UInt = 0u,
    public var szPrerequisitePbk: UShortArray = UShortArray(260),
    public var szPrerequisiteEntry: UShortArray = UShortArray(257),
    public var dwRedialCount: UInt = 0u,
    public var dwRedialPause: UInt = 0u,
    public var ipv6addrDns: In6Addr = In6Addr(),
    public var ipv6addrDnsAlt: In6Addr = In6Addr(),
    public var dwIPv4InterfaceMetric: UInt = 0u,
    public var dwIPv6InterfaceMetric: UInt = 0u,
    public var ipv6addr: In6Addr = In6Addr(),
    public var dwIPv6PrefixLength: UInt = 0u,
    public var dwNetworkOutageTime: UInt = 0u,
    public var szIDi: UShortArray = UShortArray(257),
    public var szIDr: UShortArray = UShortArray(257),
    public var fIsImsConfig: Bool = 0,
    public var idiType: Ikev2IdPayloadType = 0,
    public var idrType: Ikev2IdPayloadType = 0,
    public var fDisableIKEv2Fragmentation: Bool = 0,
)

public class Rasikev2ProjectionInfo internal constructor(
    public var dwIPv4NegotiationError: UInt,
    public var ipv4Address: InAddr,
    public var ipv4ServerAddress: InAddr,
    public var dwIPv6NegotiationError: UInt,
    public var ipv6Address: In6Addr,
    public var ipv6ServerAddress: In6Addr,
    public var dwPrefixLength: UInt,
    public var dwAuthenticationProtocol: UInt,
    public var dwEapTypeId: UInt,
    public var dwFlags: RasikevProjectionInfoFlags,
    public var dwEncryptionMethod: UInt,
    public var numIPv4ServerAddresses: UInt,
    ipv4ServerAddressesCtorArg: MutPtr,
    public var numIPv6ServerAddresses: UInt,
    ipv6ServerAddressesCtorArg: MutPtr,
) {
    public var ipv4ServerAddresses: MutPtr = ipv4ServerAddressesCtorArg
        internal set

    public var ipv6ServerAddresses: MutPtr = ipv6ServerAddressesCtorArg
        internal set

    public constructor() : this(
        dwIPv4NegotiationError = 0u,
        ipv4Address = InAddr(),
        ipv4ServerAddress = InAddr(),
        dwIPv6NegotiationError = 0u,
        ipv6Address = In6Addr(),
        ipv6ServerAddress = In6Addr(),
        dwPrefixLength = 0u,
        dwAuthenticationProtocol = 0u,
        dwEapTypeId = 0u,
        dwFlags = 0u,
        dwEncryptionMethod = 0u,
        numIPv4ServerAddresses = 0u,
        ipv4ServerAddressesCtorArg = MutPtr(0L),
        numIPv6ServerAddresses = 0u,
        ipv6ServerAddressesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwIPv4NegotiationError

    public operator fun component2(): InAddr = this.ipv4Address

    public operator fun component3(): InAddr = this.ipv4ServerAddress

    public operator fun component4(): UInt = this.dwIPv6NegotiationError

    public operator fun component5(): In6Addr = this.ipv6Address

    public operator fun component6(): In6Addr = this.ipv6ServerAddress

    public operator fun component7(): UInt = this.dwPrefixLength

    public operator fun component8(): UInt = this.dwAuthenticationProtocol

    public operator fun component9(): UInt = this.dwEapTypeId

    public operator fun component10(): RasikevProjectionInfoFlags = this.dwFlags

    public operator fun component11(): UInt = this.dwEncryptionMethod

    public operator fun component12(): UInt = this.numIPv4ServerAddresses

    public operator fun component13(): MutPtr = this.ipv4ServerAddresses

    public operator fun component14(): UInt = this.numIPv6ServerAddresses

    public operator fun component15(): MutPtr = this.ipv6ServerAddresses

    public fun copy(dwIPv4NegotiationError: UInt = this.dwIPv4NegotiationError, ipv4Address: InAddr = this.ipv4Address, ipv4ServerAddress: InAddr = this.ipv4ServerAddress, dwIPv6NegotiationError: UInt = this.dwIPv6NegotiationError, ipv6Address: In6Addr = this.ipv6Address, ipv6ServerAddress: In6Addr = this.ipv6ServerAddress, dwPrefixLength: UInt = this.dwPrefixLength, dwAuthenticationProtocol: UInt = this.dwAuthenticationProtocol, dwEapTypeId: UInt = this.dwEapTypeId, dwFlags: RasikevProjectionInfoFlags = this.dwFlags, dwEncryptionMethod: UInt = this.dwEncryptionMethod, numIPv4ServerAddresses: UInt = this.numIPv4ServerAddresses, ipv4ServerAddresses: MutPtr = this.ipv4ServerAddresses, numIPv6ServerAddresses: UInt = this.numIPv6ServerAddresses, ipv6ServerAddresses: MutPtr = this.ipv6ServerAddresses): Rasikev2ProjectionInfo = Rasikev2ProjectionInfo(dwIPv4NegotiationError = dwIPv4NegotiationError, ipv4Address = ipv4Address, ipv4ServerAddress = ipv4ServerAddress, dwIPv6NegotiationError = dwIPv6NegotiationError, ipv6Address = ipv6Address, ipv6ServerAddress = ipv6ServerAddress, dwPrefixLength = dwPrefixLength, dwAuthenticationProtocol = dwAuthenticationProtocol, dwEapTypeId = dwEapTypeId, dwFlags = dwFlags, dwEncryptionMethod = dwEncryptionMethod, numIPv4ServerAddresses = numIPv4ServerAddresses, ipv4ServerAddressesCtorArg = ipv4ServerAddresses, numIPv6ServerAddresses = numIPv6ServerAddresses, ipv6ServerAddressesCtorArg = ipv6ServerAddresses)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasikev2ProjectionInfo) return false
        if (this.dwIPv4NegotiationError != other.dwIPv4NegotiationError) return false
        if (this.ipv4Address != other.ipv4Address) return false
        if (this.ipv4ServerAddress != other.ipv4ServerAddress) return false
        if (this.dwIPv6NegotiationError != other.dwIPv6NegotiationError) return false
        if (this.ipv6Address != other.ipv6Address) return false
        if (this.ipv6ServerAddress != other.ipv6ServerAddress) return false
        if (this.dwPrefixLength != other.dwPrefixLength) return false
        if (this.dwAuthenticationProtocol != other.dwAuthenticationProtocol) return false
        if (this.dwEapTypeId != other.dwEapTypeId) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwEncryptionMethod != other.dwEncryptionMethod) return false
        if (this.numIPv4ServerAddresses != other.numIPv4ServerAddresses) return false
        if (this.ipv4ServerAddresses != other.ipv4ServerAddresses) return false
        if (this.numIPv6ServerAddresses != other.numIPv6ServerAddresses) return false
        if (this.ipv6ServerAddresses != other.ipv6ServerAddresses) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwIPv4NegotiationError.hashCode()
        result = 31 * result + this.ipv4Address.hashCode()
        result = 31 * result + this.ipv4ServerAddress.hashCode()
        result = 31 * result + this.dwIPv6NegotiationError.hashCode()
        result = 31 * result + this.ipv6Address.hashCode()
        result = 31 * result + this.ipv6ServerAddress.hashCode()
        result = 31 * result + this.dwPrefixLength.hashCode()
        result = 31 * result + this.dwAuthenticationProtocol.hashCode()
        result = 31 * result + this.dwEapTypeId.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwEncryptionMethod.hashCode()
        result = 31 * result + this.numIPv4ServerAddresses.hashCode()
        result = 31 * result + this.ipv4ServerAddresses.hashCode()
        result = 31 * result + this.numIPv6ServerAddresses.hashCode()
        result = 31 * result + this.ipv6ServerAddresses.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwIPv4NegotiationError: UInt = 0u,
            ipv4Address: InAddr = InAddr(),
            ipv4ServerAddress: InAddr = InAddr(),
            dwIPv6NegotiationError: UInt = 0u,
            ipv6Address: In6Addr = In6Addr(),
            ipv6ServerAddress: In6Addr = In6Addr(),
            dwPrefixLength: UInt = 0u,
            dwAuthenticationProtocol: UInt = 0u,
            dwEapTypeId: UInt = 0u,
            dwFlags: RasikevProjectionInfoFlags = 0u,
            dwEncryptionMethod: UInt = 0u,
            numIPv4ServerAddresses: UInt = 0u,
            ipv4ServerAddresses: MutPtr = MutPtr(0L),
            numIPv6ServerAddresses: UInt = 0u,
            ipv6ServerAddresses: MutPtr = MutPtr(0L),
        ): Rasikev2ProjectionInfo =
            Rasikev2ProjectionInfo(
                dwIPv4NegotiationError = dwIPv4NegotiationError,
                ipv4Address = ipv4Address,
                ipv4ServerAddress = ipv4ServerAddress,
                dwIPv6NegotiationError = dwIPv6NegotiationError,
                ipv6Address = ipv6Address,
                ipv6ServerAddress = ipv6ServerAddress,
                dwPrefixLength = dwPrefixLength,
                dwAuthenticationProtocol = dwAuthenticationProtocol,
                dwEapTypeId = dwEapTypeId,
                dwFlags = dwFlags,
                dwEncryptionMethod = dwEncryptionMethod,
                numIPv4ServerAddresses = numIPv4ServerAddresses,
                ipv4ServerAddressesCtorArg = ipv4ServerAddresses,
                numIPv6ServerAddresses = numIPv6ServerAddresses,
                ipv6ServerAddressesCtorArg = ipv6ServerAddresses,
            )
    }
}

public data class Rasipaddr(
    public var a: UByte = 0u,
    public var b: UByte = 0u,
    public var c: UByte = 0u,
    public var d: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rasipaddr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rasipaddr> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Rasipaddr =
                    Rasipaddr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: Rasipaddr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.a)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.b)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.c)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.d)
                }
            }
    }
}

public data class Rasipxw(
    public var dwSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var szIpxAddress: UShortArray = UShortArray(22),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasipxw) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwError != other.dwError) return false
        if (!this.szIpxAddress.contentEquals(other.szIpxAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.szIpxAddress.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rasipxw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rasipxw> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 52L
                override fun readNative(addr: Long): Rasipxw =
                    Rasipxw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (22).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Rasipxw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwError)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (22).toInt())
                    ).writeNative(addr + 8L, value.szIpxAddress.toList())
                }
            }
    }
}

public data class Rasnousera(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwTimeoutMs: UInt = 0u,
    public var szUserName: ByteArray = ByteArray(257),
    public var szPassword: ByteArray = ByteArray(257),
    public var szDomain: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasnousera) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwTimeoutMs != other.dwTimeoutMs) return false
        if (!this.szUserName.contentEquals(other.szUserName)) return false
        if (!this.szPassword.contentEquals(other.szPassword)) return false
        if (!this.szDomain.contentEquals(other.szDomain)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwTimeoutMs.hashCode()
        result = 31 * result + this.szUserName.contentHashCode()
        result = 31 * result + this.szPassword.contentHashCode()
        result = 31 * result + this.szDomain.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rasnousera> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rasnousera> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 544L
                override fun readNative(addr: Long): Rasnousera =
                    Rasnousera(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (257).toInt())
                        ).readNative(addr + 12L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (257).toInt())
                        ).readNative(addr + 269L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                        ).readNative(addr + 526L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: Rasnousera) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwTimeoutMs)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (257).toInt())
                    ).writeNative(addr + 12L, value.szUserName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (257).toInt())
                    ).writeNative(addr + 269L, value.szPassword.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                    ).writeNative(addr + 526L, value.szDomain.toList())
                }
            }
    }
}

public data class Rasnouserw(
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwTimeoutMs: UInt = 0u,
    public var szUserName: UShortArray = UShortArray(257),
    public var szPassword: UShortArray = UShortArray(257),
    public var szDomain: UShortArray = UShortArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasnouserw) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwTimeoutMs != other.dwTimeoutMs) return false
        if (!this.szUserName.contentEquals(other.szUserName)) return false
        if (!this.szPassword.contentEquals(other.szPassword)) return false
        if (!this.szDomain.contentEquals(other.szDomain)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.dwTimeoutMs.hashCode()
        result = 31 * result + this.szUserName.contentHashCode()
        result = 31 * result + this.szPassword.contentHashCode()
        result = 31 * result + this.szDomain.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rasnouserw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rasnouserw> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1072L
                override fun readNative(addr: Long): Rasnouserw =
                    Rasnouserw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (257).toInt())
                        ).readNative(addr + 12L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (257).toInt())
                        ).readNative(addr + 526L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                        ).readNative(addr + 1040L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Rasnouserw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwTimeoutMs)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (257).toInt())
                    ).writeNative(addr + 12L, value.szUserName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (257).toInt())
                    ).writeNative(addr + 526L, value.szPassword.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                    ).writeNative(addr + 1040L, value.szDomain.toList())
                }
            }
    }
}

public class Raspbdlga internal constructor(
    public var dwSize: UInt,
    hwndOwnerCtorArg: Hwnd,
    public var dwFlags: UInt,
    public var xDlg: Int,
    public var yDlg: Int,
    public var dwCallbackId: Int,
    public var pCallback: Raspbdlgfunca,
    public var dwError: UInt,
    public var reserved: Int,
    public var reserved2: Int,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        dwFlags = 0u,
        xDlg = 0,
        yDlg = 0,
        dwCallbackId = 0,
        pCallback = null,
        dwError = 0u,
        reserved = 0,
        reserved2 = 0,
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Hwnd = this.hwndOwner

    public operator fun component3(): UInt = this.dwFlags

    public operator fun component4(): Int = this.xDlg

    public operator fun component5(): Int = this.yDlg

    public operator fun component6(): Int = this.dwCallbackId

    public operator fun component7(): Raspbdlgfunca = this.pCallback

    public operator fun component8(): UInt = this.dwError

    public operator fun component9(): Int = this.reserved

    public operator fun component10(): Int = this.reserved2

    public fun copy(dwSize: UInt = this.dwSize, hwndOwner: Hwnd = this.hwndOwner, dwFlags: UInt = this.dwFlags, xDlg: Int = this.xDlg, yDlg: Int = this.yDlg, dwCallbackId: Int = this.dwCallbackId, pCallback: Raspbdlgfunca = this.pCallback, dwError: UInt = this.dwError, reserved: Int = this.reserved, reserved2: Int = this.reserved2): Raspbdlga = Raspbdlga(dwSize = dwSize, hwndOwnerCtorArg = hwndOwner, dwFlags = dwFlags, xDlg = xDlg, yDlg = yDlg, dwCallbackId = dwCallbackId, pCallback = pCallback, dwError = dwError, reserved = reserved, reserved2 = reserved2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Raspbdlga) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hwndOwner != other.hwndOwner) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.xDlg != other.xDlg) return false
        if (this.yDlg != other.yDlg) return false
        if (this.dwCallbackId != other.dwCallbackId) return false
        if (this.pCallback != other.pCallback) return false
        if (this.dwError != other.dwError) return false
        if (this.reserved != other.reserved) return false
        if (this.reserved2 != other.reserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.hwndOwner.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.xDlg.hashCode()
        result = 31 * result + this.yDlg.hashCode()
        result = 31 * result + this.dwCallbackId.hashCode()
        result = 31 * result + this.pCallback.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            dwFlags: UInt = 0u,
            xDlg: Int = 0,
            yDlg: Int = 0,
            dwCallbackId: Int = 0,
            pCallback: Raspbdlgfunca = null,
            dwError: UInt = 0u,
            reserved: Int = 0,
            reserved2: Int = 0,
        ): Raspbdlga =
            Raspbdlga(
                dwSize = dwSize,
                hwndOwnerCtorArg = hwndOwner,
                dwFlags = dwFlags,
                xDlg = xDlg,
                yDlg = yDlg,
                dwCallbackId = dwCallbackId,
                pCallback = pCallback,
                dwError = dwError,
                reserved = reserved,
                reserved2 = reserved2,
            )
    }
}

public class Raspbdlgw internal constructor(
    public var dwSize: UInt,
    hwndOwnerCtorArg: Hwnd,
    public var dwFlags: UInt,
    public var xDlg: Int,
    public var yDlg: Int,
    public var dwCallbackId: Int,
    public var pCallback: Raspbdlgfuncw,
    public var dwError: UInt,
    public var reserved: Int,
    public var reserved2: Int,
) {
    public var hwndOwner: Hwnd = hwndOwnerCtorArg
        internal set

    public constructor() : this(
        dwSize = 0u,
        hwndOwnerCtorArg = MutPtr(0L),
        dwFlags = 0u,
        xDlg = 0,
        yDlg = 0,
        dwCallbackId = 0,
        pCallback = null,
        dwError = 0u,
        reserved = 0,
        reserved2 = 0,
    )

    public operator fun component1(): UInt = this.dwSize

    public operator fun component2(): Hwnd = this.hwndOwner

    public operator fun component3(): UInt = this.dwFlags

    public operator fun component4(): Int = this.xDlg

    public operator fun component5(): Int = this.yDlg

    public operator fun component6(): Int = this.dwCallbackId

    public operator fun component7(): Raspbdlgfuncw = this.pCallback

    public operator fun component8(): UInt = this.dwError

    public operator fun component9(): Int = this.reserved

    public operator fun component10(): Int = this.reserved2

    public fun copy(dwSize: UInt = this.dwSize, hwndOwner: Hwnd = this.hwndOwner, dwFlags: UInt = this.dwFlags, xDlg: Int = this.xDlg, yDlg: Int = this.yDlg, dwCallbackId: Int = this.dwCallbackId, pCallback: Raspbdlgfuncw = this.pCallback, dwError: UInt = this.dwError, reserved: Int = this.reserved, reserved2: Int = this.reserved2): Raspbdlgw = Raspbdlgw(dwSize = dwSize, hwndOwnerCtorArg = hwndOwner, dwFlags = dwFlags, xDlg = xDlg, yDlg = yDlg, dwCallbackId = dwCallbackId, pCallback = pCallback, dwError = dwError, reserved = reserved, reserved2 = reserved2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Raspbdlgw) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hwndOwner != other.hwndOwner) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.xDlg != other.xDlg) return false
        if (this.yDlg != other.yDlg) return false
        if (this.dwCallbackId != other.dwCallbackId) return false
        if (this.pCallback != other.pCallback) return false
        if (this.dwError != other.dwError) return false
        if (this.reserved != other.reserved) return false
        if (this.reserved2 != other.reserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.hwndOwner.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.xDlg.hashCode()
        result = 31 * result + this.yDlg.hashCode()
        result = 31 * result + this.dwCallbackId.hashCode()
        result = 31 * result + this.pCallback.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.reserved2.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSize: UInt = 0u,
            hwndOwner: Hwnd = MutPtr(0L),
            dwFlags: UInt = 0u,
            xDlg: Int = 0,
            yDlg: Int = 0,
            dwCallbackId: Int = 0,
            pCallback: Raspbdlgfuncw = null,
            dwError: UInt = 0u,
            reserved: Int = 0,
            reserved2: Int = 0,
        ): Raspbdlgw =
            Raspbdlgw(
                dwSize = dwSize,
                hwndOwnerCtorArg = hwndOwner,
                dwFlags = dwFlags,
                xDlg = xDlg,
                yDlg = yDlg,
                dwCallbackId = dwCallbackId,
                pCallback = pCallback,
                dwError = dwError,
                reserved = reserved,
                reserved2 = reserved2,
            )
    }
}

public data class Raspppccp(
    public var dwSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var dwCompressionAlgorithm: UInt = 0u,
    public var dwOptions: UInt = 0u,
    public var dwServerCompressionAlgorithm: UInt = 0u,
    public var dwServerOptions: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Raspppccp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Raspppccp> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Raspppccp =
                    Raspppccp(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Raspppccp) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwCompressionAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwServerCompressionAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwServerOptions)
                }
            }
    }
}

public data class Raspppipa(
    public var dwSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var szIpAddress: ByteArray = ByteArray(16),
    public var szServerIpAddress: ByteArray = ByteArray(16),
    public var dwOptions: UInt = 0u,
    public var dwServerOptions: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Raspppipa) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwError != other.dwError) return false
        if (!this.szIpAddress.contentEquals(other.szIpAddress)) return false
        if (!this.szServerIpAddress.contentEquals(other.szServerIpAddress)) return false
        if (this.dwOptions != other.dwOptions) return false
        if (this.dwServerOptions != other.dwServerOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.szIpAddress.contentHashCode()
        result = 31 * result + this.szServerIpAddress.contentHashCode()
        result = 31 * result + this.dwOptions.hashCode()
        result = 31 * result + this.dwServerOptions.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Raspppipa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Raspppipa> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): Raspppipa =
                    Raspppipa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                        ).readNative(addr + 8L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                        ).readNative(addr + 24L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: Raspppipa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwError)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                    ).writeNative(addr + 8L, value.szIpAddress.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                    ).writeNative(addr + 24L, value.szServerIpAddress.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwServerOptions)
                }
            }
    }
}

public data class Raspppipv6(
    public var dwSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var bLocalInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bPeerInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bLocalCompressionProtocol: UByteArray = UByteArray(2),
    public var bPeerCompressionProtocol: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Raspppipv6) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwError != other.dwError) return false
        if (!this.bLocalInterfaceIdentifier.contentEquals(other.bLocalInterfaceIdentifier)) return false
        if (!this.bPeerInterfaceIdentifier.contentEquals(other.bPeerInterfaceIdentifier)) return false
        if (!this.bLocalCompressionProtocol.contentEquals(other.bLocalCompressionProtocol)) return false
        if (!this.bPeerCompressionProtocol.contentEquals(other.bPeerCompressionProtocol)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.bLocalInterfaceIdentifier.contentHashCode()
        result = 31 * result + this.bPeerInterfaceIdentifier.contentHashCode()
        result = 31 * result + this.bLocalCompressionProtocol.contentHashCode()
        result = 31 * result + this.bPeerCompressionProtocol.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Raspppipv6> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Raspppipv6> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): Raspppipv6 =
                    Raspppipv6(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 24L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 26L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Raspppipv6) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwError)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 8L, value.bLocalInterfaceIdentifier.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 16L, value.bPeerInterfaceIdentifier.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 24L, value.bLocalCompressionProtocol.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 26L, value.bPeerCompressionProtocol.toList())
                }
            }
    }
}

public data class Raspppipw(
    public var dwSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var szIpAddress: UShortArray = UShortArray(16),
    public var szServerIpAddress: UShortArray = UShortArray(16),
    public var dwOptions: UInt = 0u,
    public var dwServerOptions: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Raspppipw) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwError != other.dwError) return false
        if (!this.szIpAddress.contentEquals(other.szIpAddress)) return false
        if (!this.szServerIpAddress.contentEquals(other.szServerIpAddress)) return false
        if (this.dwOptions != other.dwOptions) return false
        if (this.dwServerOptions != other.dwServerOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.szIpAddress.contentHashCode()
        result = 31 * result + this.szServerIpAddress.contentHashCode()
        result = 31 * result + this.dwOptions.hashCode()
        result = 31 * result + this.dwServerOptions.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Raspppipw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Raspppipw> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): Raspppipw =
                    Raspppipw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                        ).readNative(addr + 40L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                    )
                override fun writeNative(addr: Long, value: Raspppipw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwError)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                    ).writeNative(addr + 8L, value.szIpAddress.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                    ).writeNative(addr + 40L, value.szServerIpAddress.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.dwOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.dwServerOptions)
                }
            }
    }
}

public data class Raspppipxa(
    public var dwSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var szIpxAddress: ByteArray = ByteArray(22),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Raspppipxa) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwError != other.dwError) return false
        if (!this.szIpxAddress.contentEquals(other.szIpxAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.szIpxAddress.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Raspppipxa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Raspppipxa> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Raspppipxa =
                    Raspppipxa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (22).toInt())
                        ).readNative(addr + 8L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: Raspppipxa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwError)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (22).toInt())
                    ).writeNative(addr + 8L, value.szIpxAddress.toList())
                }
            }
    }
}

public data class Rasppplcpa(
    public var dwSize: UInt = 0u,
    public var fBundled: Bool = 0,
    public var dwError: UInt = 0u,
    public var dwAuthenticationProtocol: UInt = 0u,
    public var dwAuthenticationData: UInt = 0u,
    public var dwEapTypeId: UInt = 0u,
    public var dwServerAuthenticationProtocol: UInt = 0u,
    public var dwServerAuthenticationData: UInt = 0u,
    public var dwServerEapTypeId: UInt = 0u,
    public var fMultilink: Bool = 0,
    public var dwTerminateReason: UInt = 0u,
    public var dwServerTerminateReason: UInt = 0u,
    public var szReplyMessage: ByteArray = ByteArray(1024),
    public var dwOptions: UInt = 0u,
    public var dwServerOptions: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasppplcpa) return false
        if (this.dwSize != other.dwSize) return false
        if (this.fBundled != other.fBundled) return false
        if (this.dwError != other.dwError) return false
        if (this.dwAuthenticationProtocol != other.dwAuthenticationProtocol) return false
        if (this.dwAuthenticationData != other.dwAuthenticationData) return false
        if (this.dwEapTypeId != other.dwEapTypeId) return false
        if (this.dwServerAuthenticationProtocol != other.dwServerAuthenticationProtocol) return false
        if (this.dwServerAuthenticationData != other.dwServerAuthenticationData) return false
        if (this.dwServerEapTypeId != other.dwServerEapTypeId) return false
        if (this.fMultilink != other.fMultilink) return false
        if (this.dwTerminateReason != other.dwTerminateReason) return false
        if (this.dwServerTerminateReason != other.dwServerTerminateReason) return false
        if (!this.szReplyMessage.contentEquals(other.szReplyMessage)) return false
        if (this.dwOptions != other.dwOptions) return false
        if (this.dwServerOptions != other.dwServerOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.fBundled.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.dwAuthenticationProtocol.hashCode()
        result = 31 * result + this.dwAuthenticationData.hashCode()
        result = 31 * result + this.dwEapTypeId.hashCode()
        result = 31 * result + this.dwServerAuthenticationProtocol.hashCode()
        result = 31 * result + this.dwServerAuthenticationData.hashCode()
        result = 31 * result + this.dwServerEapTypeId.hashCode()
        result = 31 * result + this.fMultilink.hashCode()
        result = 31 * result + this.dwTerminateReason.hashCode()
        result = 31 * result + this.dwServerTerminateReason.hashCode()
        result = 31 * result + this.szReplyMessage.contentHashCode()
        result = 31 * result + this.dwOptions.hashCode()
        result = 31 * result + this.dwServerOptions.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rasppplcpa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rasppplcpa> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1080L
                override fun readNative(addr: Long): Rasppplcpa =
                    Rasppplcpa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1024).toInt())
                        ).readNative(addr + 48L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1072L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1076L),
                    )
                override fun writeNative(addr: Long, value: Rasppplcpa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.fBundled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwAuthenticationProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwAuthenticationData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwEapTypeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwServerAuthenticationProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwServerAuthenticationData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwServerEapTypeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.fMultilink)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwTerminateReason)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwServerTerminateReason)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1024).toInt())
                    ).writeNative(addr + 48L, value.szReplyMessage.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1072L, value.dwOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1076L, value.dwServerOptions)
                }
            }
    }
}

public data class Rasppplcpw(
    public var dwSize: UInt = 0u,
    public var fBundled: Bool = 0,
    public var dwError: UInt = 0u,
    public var dwAuthenticationProtocol: UInt = 0u,
    public var dwAuthenticationData: UInt = 0u,
    public var dwEapTypeId: UInt = 0u,
    public var dwServerAuthenticationProtocol: UInt = 0u,
    public var dwServerAuthenticationData: UInt = 0u,
    public var dwServerEapTypeId: UInt = 0u,
    public var fMultilink: Bool = 0,
    public var dwTerminateReason: UInt = 0u,
    public var dwServerTerminateReason: UInt = 0u,
    public var szReplyMessage: UShortArray = UShortArray(1024),
    public var dwOptions: UInt = 0u,
    public var dwServerOptions: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rasppplcpw) return false
        if (this.dwSize != other.dwSize) return false
        if (this.fBundled != other.fBundled) return false
        if (this.dwError != other.dwError) return false
        if (this.dwAuthenticationProtocol != other.dwAuthenticationProtocol) return false
        if (this.dwAuthenticationData != other.dwAuthenticationData) return false
        if (this.dwEapTypeId != other.dwEapTypeId) return false
        if (this.dwServerAuthenticationProtocol != other.dwServerAuthenticationProtocol) return false
        if (this.dwServerAuthenticationData != other.dwServerAuthenticationData) return false
        if (this.dwServerEapTypeId != other.dwServerEapTypeId) return false
        if (this.fMultilink != other.fMultilink) return false
        if (this.dwTerminateReason != other.dwTerminateReason) return false
        if (this.dwServerTerminateReason != other.dwServerTerminateReason) return false
        if (!this.szReplyMessage.contentEquals(other.szReplyMessage)) return false
        if (this.dwOptions != other.dwOptions) return false
        if (this.dwServerOptions != other.dwServerOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.fBundled.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.dwAuthenticationProtocol.hashCode()
        result = 31 * result + this.dwAuthenticationData.hashCode()
        result = 31 * result + this.dwEapTypeId.hashCode()
        result = 31 * result + this.dwServerAuthenticationProtocol.hashCode()
        result = 31 * result + this.dwServerAuthenticationData.hashCode()
        result = 31 * result + this.dwServerEapTypeId.hashCode()
        result = 31 * result + this.fMultilink.hashCode()
        result = 31 * result + this.dwTerminateReason.hashCode()
        result = 31 * result + this.dwServerTerminateReason.hashCode()
        result = 31 * result + this.szReplyMessage.contentHashCode()
        result = 31 * result + this.dwOptions.hashCode()
        result = 31 * result + this.dwServerOptions.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rasppplcpw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rasppplcpw> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 2104L
                override fun readNative(addr: Long): Rasppplcpw =
                    Rasppplcpw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1024).toInt())
                        ).readNative(addr + 48L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 2096L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 2100L),
                    )
                override fun writeNative(addr: Long, value: Rasppplcpw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.fBundled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwAuthenticationProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwAuthenticationData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwEapTypeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwServerAuthenticationProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwServerAuthenticationData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwServerEapTypeId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.fMultilink)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwTerminateReason)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwServerTerminateReason)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1024).toInt())
                    ).writeNative(addr + 48L, value.szReplyMessage.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 2096L, value.dwOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 2100L, value.dwServerOptions)
                }
            }
    }
}

public data class Raspppnbfa(
    public var dwSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var dwNetBiosError: UInt = 0u,
    public var szNetBiosError: ByteArray = ByteArray(17),
    public var szWorkstationName: ByteArray = ByteArray(17),
    public var bLana: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Raspppnbfa) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwError != other.dwError) return false
        if (this.dwNetBiosError != other.dwNetBiosError) return false
        if (!this.szNetBiosError.contentEquals(other.szNetBiosError)) return false
        if (!this.szWorkstationName.contentEquals(other.szWorkstationName)) return false
        if (this.bLana != other.bLana) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.dwNetBiosError.hashCode()
        result = 31 * result + this.szNetBiosError.contentHashCode()
        result = 31 * result + this.szWorkstationName.contentHashCode()
        result = 31 * result + this.bLana.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Raspppnbfa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Raspppnbfa> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): Raspppnbfa =
                    Raspppnbfa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (17).toInt())
                        ).readNative(addr + 12L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (17).toInt())
                        ).readNative(addr + 29L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 46L),
                    )
                override fun writeNative(addr: Long, value: Raspppnbfa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwNetBiosError)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (17).toInt())
                    ).writeNative(addr + 12L, value.szNetBiosError.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (17).toInt())
                    ).writeNative(addr + 29L, value.szWorkstationName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 46L, value.bLana)
                }
            }
    }
}

public data class Raspppnbfw(
    public var dwSize: UInt = 0u,
    public var dwError: UInt = 0u,
    public var dwNetBiosError: UInt = 0u,
    public var szNetBiosError: UShortArray = UShortArray(17),
    public var szWorkstationName: UShortArray = UShortArray(17),
    public var bLana: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Raspppnbfw) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwError != other.dwError) return false
        if (this.dwNetBiosError != other.dwNetBiosError) return false
        if (!this.szNetBiosError.contentEquals(other.szNetBiosError)) return false
        if (!this.szWorkstationName.contentEquals(other.szWorkstationName)) return false
        if (this.bLana != other.bLana) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.dwNetBiosError.hashCode()
        result = 31 * result + this.szNetBiosError.contentHashCode()
        result = 31 * result + this.szWorkstationName.contentHashCode()
        result = 31 * result + this.bLana.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Raspppnbfw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Raspppnbfw> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 84L
                override fun readNative(addr: Long): Raspppnbfw =
                    Raspppnbfw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (17).toInt())
                        ).readNative(addr + 12L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (17).toInt())
                        ).readNative(addr + 46L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: Raspppnbfw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwNetBiosError)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (17).toInt())
                    ).writeNative(addr + 12L, value.szNetBiosError.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (17).toInt())
                    ).writeNative(addr + 46L, value.szWorkstationName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 80L, value.bLana)
                }
            }
    }
}

public class RaspppProjectionInfo(
    public var dwIPv4NegotiationError: UInt = 0u,
    public var ipv4Address: InAddr = InAddr(),
    public var ipv4ServerAddress: InAddr = InAddr(),
    public var dwIPv4Options: UInt = 0u,
    public var dwIPv4ServerOptions: UInt = 0u,
    public var dwIPv6NegotiationError: UInt = 0u,
    public var bInterfaceIdentifier: UByteArray = UByteArray(8),
    public var bServerInterfaceIdentifier: UByteArray = UByteArray(8),
    public var fBundled: Bool = 0,
    public var fMultilink: Bool = 0,
    public var dwAuthenticationProtocol: RaspppProjectionInfoServerAuthProtocol = 0u,
    public var dwAuthenticationData: RaspppProjectionInfoServerAuthData = 0u,
    public var dwServerAuthenticationProtocol: RaspppProjectionInfoServerAuthProtocol = 0u,
    public var dwServerAuthenticationData: RaspppProjectionInfoServerAuthData = 0u,
    public var dwEapTypeId: UInt = 0u,
    public var dwServerEapTypeId: UInt = 0u,
    public var dwLcpOptions: UInt = 0u,
    public var dwLcpServerOptions: UInt = 0u,
    public var dwCcpError: UInt = 0u,
    public var dwCcpCompressionAlgorithm: UInt = 0u,
    public var dwCcpServerCompressionAlgorithm: UInt = 0u,
    public var dwCcpOptions: UInt = 0u,
    public var dwCcpServerOptions: UInt = 0u,
)

public data class Rassubentrya(
    public var dwSize: UInt = 0u,
    public var dwfFlags: UInt = 0u,
    public var szDeviceType: ByteArray = ByteArray(17),
    public var szDeviceName: ByteArray = ByteArray(129),
    public var szLocalPhoneNumber: ByteArray = ByteArray(129),
    public var dwAlternateOffset: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rassubentrya) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwfFlags != other.dwfFlags) return false
        if (!this.szDeviceType.contentEquals(other.szDeviceType)) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        if (!this.szLocalPhoneNumber.contentEquals(other.szLocalPhoneNumber)) return false
        if (this.dwAlternateOffset != other.dwAlternateOffset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwfFlags.hashCode()
        result = 31 * result + this.szDeviceType.contentHashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        result = 31 * result + this.szLocalPhoneNumber.contentHashCode()
        result = 31 * result + this.dwAlternateOffset.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rassubentrya> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rassubentrya> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 288L
                override fun readNative(addr: Long): Rassubentrya =
                    Rassubentrya(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (17).toInt())
                        ).readNative(addr + 8L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (129).toInt())
                        ).readNative(addr + 25L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (129).toInt())
                        ).readNative(addr + 154L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 284L),
                    )
                override fun writeNative(addr: Long, value: Rassubentrya) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwfFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (17).toInt())
                    ).writeNative(addr + 8L, value.szDeviceType.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (129).toInt())
                    ).writeNative(addr + 25L, value.szDeviceName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (129).toInt())
                    ).writeNative(addr + 154L, value.szLocalPhoneNumber.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 284L, value.dwAlternateOffset)
                }
            }
    }
}

public data class Rassubentryw(
    public var dwSize: UInt = 0u,
    public var dwfFlags: UInt = 0u,
    public var szDeviceType: UShortArray = UShortArray(17),
    public var szDeviceName: UShortArray = UShortArray(129),
    public var szLocalPhoneNumber: UShortArray = UShortArray(129),
    public var dwAlternateOffset: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rassubentryw) return false
        if (this.dwSize != other.dwSize) return false
        if (this.dwfFlags != other.dwfFlags) return false
        if (!this.szDeviceType.contentEquals(other.szDeviceType)) return false
        if (!this.szDeviceName.contentEquals(other.szDeviceName)) return false
        if (!this.szLocalPhoneNumber.contentEquals(other.szLocalPhoneNumber)) return false
        if (this.dwAlternateOffset != other.dwAlternateOffset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSize.hashCode()
        result = 31 * result + this.dwfFlags.hashCode()
        result = 31 * result + this.szDeviceType.contentHashCode()
        result = 31 * result + this.szDeviceName.contentHashCode()
        result = 31 * result + this.szLocalPhoneNumber.contentHashCode()
        result = 31 * result + this.dwAlternateOffset.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rassubentryw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rassubentryw> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 564L
                override fun readNative(addr: Long): Rassubentryw =
                    Rassubentryw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (17).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (129).toInt())
                        ).readNative(addr + 42L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (129).toInt())
                        ).readNative(addr + 300L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 560L),
                    )
                override fun writeNative(addr: Long, value: Rassubentryw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwfFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (17).toInt())
                    ).writeNative(addr + 8L, value.szDeviceType.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (129).toInt())
                    ).writeNative(addr + 42L, value.szDeviceName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (129).toInt())
                    ).writeNative(addr + 300L, value.szLocalPhoneNumber.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 560L, value.dwAlternateOffset)
                }
            }
    }
}

public data class Rastunnelendpoint(
    public var dwType: UInt = 0u,
    public var anonymous: Rastunnelendpoint0 = Rastunnelendpoint0(),
)

public data class Rastunnelendpoint0(
    public var ipv4: InAddr = InAddr(),
    public var ipv6: In6Addr = In6Addr(),
)

public data class Rasupdateconn(
    public var version: Rasapiversion = 0,
    public var dwSize: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwIfIndex: UInt = 0u,
    public var localEndPoint: Rastunnelendpoint = Rastunnelendpoint(),
    public var remoteEndPoint: Rastunnelendpoint = Rastunnelendpoint(),
)

public class RasConnection0 internal constructor(
    hConnectionCtorArg: Handle,
    hInterfaceCtorArg: Handle,
    public var dwConnectDuration: UInt,
    public var dwInterfaceType: RouterInterfaceType,
    public var dwConnectionFlags: RasFlags,
    public var wszInterfaceName: UShortArray,
    public var wszUserName: UShortArray,
    public var wszLogonDomain: UShortArray,
    public var wszRemoteComputer: UShortArray,
) {
    public var hConnection: Handle = hConnectionCtorArg
        internal set

    public var hInterface: Handle = hInterfaceCtorArg
        internal set

    public constructor() : this(
        hConnectionCtorArg = MutPtr(0L),
        hInterfaceCtorArg = MutPtr(0L),
        dwConnectDuration = 0u,
        dwInterfaceType = 0,
        dwConnectionFlags = 0u,
        wszInterfaceName = UShortArray(257),
        wszUserName = UShortArray(257),
        wszLogonDomain = UShortArray(16),
        wszRemoteComputer = UShortArray(17),
    )

    public operator fun component1(): Handle = this.hConnection

    public operator fun component2(): Handle = this.hInterface

    public operator fun component3(): UInt = this.dwConnectDuration

    public operator fun component4(): RouterInterfaceType = this.dwInterfaceType

    public operator fun component5(): RasFlags = this.dwConnectionFlags

    public operator fun component6(): UShortArray = this.wszInterfaceName

    public operator fun component7(): UShortArray = this.wszUserName

    public operator fun component8(): UShortArray = this.wszLogonDomain

    public operator fun component9(): UShortArray = this.wszRemoteComputer

    public fun copy(hConnection: Handle = this.hConnection, hInterface: Handle = this.hInterface, dwConnectDuration: UInt = this.dwConnectDuration, dwInterfaceType: RouterInterfaceType = this.dwInterfaceType, dwConnectionFlags: RasFlags = this.dwConnectionFlags, wszInterfaceName: UShortArray = this.wszInterfaceName, wszUserName: UShortArray = this.wszUserName, wszLogonDomain: UShortArray = this.wszLogonDomain, wszRemoteComputer: UShortArray = this.wszRemoteComputer): RasConnection0 = RasConnection0(hConnectionCtorArg = hConnection, hInterfaceCtorArg = hInterface, dwConnectDuration = dwConnectDuration, dwInterfaceType = dwInterfaceType, dwConnectionFlags = dwConnectionFlags, wszInterfaceName = wszInterfaceName, wszUserName = wszUserName, wszLogonDomain = wszLogonDomain, wszRemoteComputer = wszRemoteComputer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RasConnection0) return false
        if (this.hConnection != other.hConnection) return false
        if (this.hInterface != other.hInterface) return false
        if (this.dwConnectDuration != other.dwConnectDuration) return false
        if (this.dwInterfaceType != other.dwInterfaceType) return false
        if (this.dwConnectionFlags != other.dwConnectionFlags) return false
        if (!this.wszInterfaceName.contentEquals(other.wszInterfaceName)) return false
        if (!this.wszUserName.contentEquals(other.wszUserName)) return false
        if (!this.wszLogonDomain.contentEquals(other.wszLogonDomain)) return false
        if (!this.wszRemoteComputer.contentEquals(other.wszRemoteComputer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hConnection.hashCode()
        result = 31 * result + this.hInterface.hashCode()
        result = 31 * result + this.dwConnectDuration.hashCode()
        result = 31 * result + this.dwInterfaceType.hashCode()
        result = 31 * result + this.dwConnectionFlags.hashCode()
        result = 31 * result + this.wszInterfaceName.contentHashCode()
        result = 31 * result + this.wszUserName.contentHashCode()
        result = 31 * result + this.wszLogonDomain.contentHashCode()
        result = 31 * result + this.wszRemoteComputer.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hConnection: Handle = MutPtr(0L),
            hInterface: Handle = MutPtr(0L),
            dwConnectDuration: UInt = 0u,
            dwInterfaceType: RouterInterfaceType = 0,
            dwConnectionFlags: RasFlags = 0u,
            wszInterfaceName: UShortArray = UShortArray(257),
            wszUserName: UShortArray = UShortArray(257),
            wszLogonDomain: UShortArray = UShortArray(16),
            wszRemoteComputer: UShortArray = UShortArray(17),
        ): RasConnection0 =
            RasConnection0(
                hConnectionCtorArg = hConnection,
                hInterfaceCtorArg = hInterface,
                dwConnectDuration = dwConnectDuration,
                dwInterfaceType = dwInterfaceType,
                dwConnectionFlags = dwConnectionFlags,
                wszInterfaceName = wszInterfaceName,
                wszUserName = wszUserName,
                wszLogonDomain = wszLogonDomain,
                wszRemoteComputer = wszRemoteComputer,
            )
    }
}

public class RasConnection1 internal constructor(
    hConnectionCtorArg: Handle,
    hInterfaceCtorArg: Handle,
    public var pppInfo: PppInfo,
    public var dwBytesXmited: UInt,
    public var dwBytesRcved: UInt,
    public var dwFramesXmited: UInt,
    public var dwFramesRcved: UInt,
    public var dwCrcErr: UInt,
    public var dwTimeoutErr: UInt,
    public var dwAlignmentErr: UInt,
    public var dwHardwareOverrunErr: UInt,
    public var dwFramingErr: UInt,
    public var dwBufferOverrunErr: UInt,
    public var dwCompressionRatioIn: UInt,
    public var dwCompressionRatioOut: UInt,
) {
    public var hConnection: Handle = hConnectionCtorArg
        internal set

    public var hInterface: Handle = hInterfaceCtorArg
        internal set

    public constructor() : this(
        hConnectionCtorArg = MutPtr(0L),
        hInterfaceCtorArg = MutPtr(0L),
        pppInfo = PppInfo(),
        dwBytesXmited = 0u,
        dwBytesRcved = 0u,
        dwFramesXmited = 0u,
        dwFramesRcved = 0u,
        dwCrcErr = 0u,
        dwTimeoutErr = 0u,
        dwAlignmentErr = 0u,
        dwHardwareOverrunErr = 0u,
        dwFramingErr = 0u,
        dwBufferOverrunErr = 0u,
        dwCompressionRatioIn = 0u,
        dwCompressionRatioOut = 0u,
    )

    public operator fun component1(): Handle = this.hConnection

    public operator fun component2(): Handle = this.hInterface

    public operator fun component3(): PppInfo = this.pppInfo

    public operator fun component4(): UInt = this.dwBytesXmited

    public operator fun component5(): UInt = this.dwBytesRcved

    public operator fun component6(): UInt = this.dwFramesXmited

    public operator fun component7(): UInt = this.dwFramesRcved

    public operator fun component8(): UInt = this.dwCrcErr

    public operator fun component9(): UInt = this.dwTimeoutErr

    public operator fun component10(): UInt = this.dwAlignmentErr

    public operator fun component11(): UInt = this.dwHardwareOverrunErr

    public operator fun component12(): UInt = this.dwFramingErr

    public operator fun component13(): UInt = this.dwBufferOverrunErr

    public operator fun component14(): UInt = this.dwCompressionRatioIn

    public operator fun component15(): UInt = this.dwCompressionRatioOut

    public fun copy(hConnection: Handle = this.hConnection, hInterface: Handle = this.hInterface, pppInfo: PppInfo = this.pppInfo, dwBytesXmited: UInt = this.dwBytesXmited, dwBytesRcved: UInt = this.dwBytesRcved, dwFramesXmited: UInt = this.dwFramesXmited, dwFramesRcved: UInt = this.dwFramesRcved, dwCrcErr: UInt = this.dwCrcErr, dwTimeoutErr: UInt = this.dwTimeoutErr, dwAlignmentErr: UInt = this.dwAlignmentErr, dwHardwareOverrunErr: UInt = this.dwHardwareOverrunErr, dwFramingErr: UInt = this.dwFramingErr, dwBufferOverrunErr: UInt = this.dwBufferOverrunErr, dwCompressionRatioIn: UInt = this.dwCompressionRatioIn, dwCompressionRatioOut: UInt = this.dwCompressionRatioOut): RasConnection1 = RasConnection1(hConnectionCtorArg = hConnection, hInterfaceCtorArg = hInterface, pppInfo = pppInfo, dwBytesXmited = dwBytesXmited, dwBytesRcved = dwBytesRcved, dwFramesXmited = dwFramesXmited, dwFramesRcved = dwFramesRcved, dwCrcErr = dwCrcErr, dwTimeoutErr = dwTimeoutErr, dwAlignmentErr = dwAlignmentErr, dwHardwareOverrunErr = dwHardwareOverrunErr, dwFramingErr = dwFramingErr, dwBufferOverrunErr = dwBufferOverrunErr, dwCompressionRatioIn = dwCompressionRatioIn, dwCompressionRatioOut = dwCompressionRatioOut)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RasConnection1) return false
        if (this.hConnection != other.hConnection) return false
        if (this.hInterface != other.hInterface) return false
        if (this.pppInfo != other.pppInfo) return false
        if (this.dwBytesXmited != other.dwBytesXmited) return false
        if (this.dwBytesRcved != other.dwBytesRcved) return false
        if (this.dwFramesXmited != other.dwFramesXmited) return false
        if (this.dwFramesRcved != other.dwFramesRcved) return false
        if (this.dwCrcErr != other.dwCrcErr) return false
        if (this.dwTimeoutErr != other.dwTimeoutErr) return false
        if (this.dwAlignmentErr != other.dwAlignmentErr) return false
        if (this.dwHardwareOverrunErr != other.dwHardwareOverrunErr) return false
        if (this.dwFramingErr != other.dwFramingErr) return false
        if (this.dwBufferOverrunErr != other.dwBufferOverrunErr) return false
        if (this.dwCompressionRatioIn != other.dwCompressionRatioIn) return false
        if (this.dwCompressionRatioOut != other.dwCompressionRatioOut) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hConnection.hashCode()
        result = 31 * result + this.hInterface.hashCode()
        result = 31 * result + this.pppInfo.hashCode()
        result = 31 * result + this.dwBytesXmited.hashCode()
        result = 31 * result + this.dwBytesRcved.hashCode()
        result = 31 * result + this.dwFramesXmited.hashCode()
        result = 31 * result + this.dwFramesRcved.hashCode()
        result = 31 * result + this.dwCrcErr.hashCode()
        result = 31 * result + this.dwTimeoutErr.hashCode()
        result = 31 * result + this.dwAlignmentErr.hashCode()
        result = 31 * result + this.dwHardwareOverrunErr.hashCode()
        result = 31 * result + this.dwFramingErr.hashCode()
        result = 31 * result + this.dwBufferOverrunErr.hashCode()
        result = 31 * result + this.dwCompressionRatioIn.hashCode()
        result = 31 * result + this.dwCompressionRatioOut.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hConnection: Handle = MutPtr(0L),
            hInterface: Handle = MutPtr(0L),
            pppInfo: PppInfo = PppInfo(),
            dwBytesXmited: UInt = 0u,
            dwBytesRcved: UInt = 0u,
            dwFramesXmited: UInt = 0u,
            dwFramesRcved: UInt = 0u,
            dwCrcErr: UInt = 0u,
            dwTimeoutErr: UInt = 0u,
            dwAlignmentErr: UInt = 0u,
            dwHardwareOverrunErr: UInt = 0u,
            dwFramingErr: UInt = 0u,
            dwBufferOverrunErr: UInt = 0u,
            dwCompressionRatioIn: UInt = 0u,
            dwCompressionRatioOut: UInt = 0u,
        ): RasConnection1 =
            RasConnection1(
                hConnectionCtorArg = hConnection,
                hInterfaceCtorArg = hInterface,
                pppInfo = pppInfo,
                dwBytesXmited = dwBytesXmited,
                dwBytesRcved = dwBytesRcved,
                dwFramesXmited = dwFramesXmited,
                dwFramesRcved = dwFramesRcved,
                dwCrcErr = dwCrcErr,
                dwTimeoutErr = dwTimeoutErr,
                dwAlignmentErr = dwAlignmentErr,
                dwHardwareOverrunErr = dwHardwareOverrunErr,
                dwFramingErr = dwFramingErr,
                dwBufferOverrunErr = dwBufferOverrunErr,
                dwCompressionRatioIn = dwCompressionRatioIn,
                dwCompressionRatioOut = dwCompressionRatioOut,
            )
    }
}

public class RasConnection2 internal constructor(
    hConnectionCtorArg: Handle,
    public var wszUserName: UShortArray,
    public var dwInterfaceType: RouterInterfaceType,
    public var guid: Guid,
    public var pppInfo2: PppInfo2,
) {
    public var hConnection: Handle = hConnectionCtorArg
        internal set

    public constructor() : this(
        hConnectionCtorArg = MutPtr(0L),
        wszUserName = UShortArray(257),
        dwInterfaceType = 0,
        guid = Guid(),
        pppInfo2 = PppInfo2(),
    )

    public operator fun component1(): Handle = this.hConnection

    public operator fun component2(): UShortArray = this.wszUserName

    public operator fun component3(): RouterInterfaceType = this.dwInterfaceType

    public operator fun component4(): Guid = this.guid

    public operator fun component5(): PppInfo2 = this.pppInfo2

    public fun copy(hConnection: Handle = this.hConnection, wszUserName: UShortArray = this.wszUserName, dwInterfaceType: RouterInterfaceType = this.dwInterfaceType, guid: Guid = this.guid, pppInfo2: PppInfo2 = this.pppInfo2): RasConnection2 = RasConnection2(hConnectionCtorArg = hConnection, wszUserName = wszUserName, dwInterfaceType = dwInterfaceType, guid = guid, pppInfo2 = pppInfo2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RasConnection2) return false
        if (this.hConnection != other.hConnection) return false
        if (!this.wszUserName.contentEquals(other.wszUserName)) return false
        if (this.dwInterfaceType != other.dwInterfaceType) return false
        if (this.guid != other.guid) return false
        if (this.pppInfo2 != other.pppInfo2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hConnection.hashCode()
        result = 31 * result + this.wszUserName.contentHashCode()
        result = 31 * result + this.dwInterfaceType.hashCode()
        result = 31 * result + this.guid.hashCode()
        result = 31 * result + this.pppInfo2.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hConnection: Handle = MutPtr(0L),
            wszUserName: UShortArray = UShortArray(257),
            dwInterfaceType: RouterInterfaceType = 0,
            guid: Guid = Guid(),
            pppInfo2: PppInfo2 = PppInfo2(),
        ): RasConnection2 =
            RasConnection2(
                hConnectionCtorArg = hConnection,
                wszUserName = wszUserName,
                dwInterfaceType = dwInterfaceType,
                guid = guid,
                pppInfo2 = pppInfo2,
            )
    }
}

public class RasConnection3 internal constructor(
    public var dwVersion: UInt,
    public var dwSize: UInt,
    hConnectionCtorArg: Handle,
    public var wszUserName: UShortArray,
    public var dwInterfaceType: RouterInterfaceType,
    public var guid: Guid,
    public var pppInfo3: PppInfo3,
    public var rasQuarState: RasQuarantineState,
    public var timer: Filetime,
) {
    public var hConnection: Handle = hConnectionCtorArg
        internal set

    public constructor() : this(
        dwVersion = 0u,
        dwSize = 0u,
        hConnectionCtorArg = MutPtr(0L),
        wszUserName = UShortArray(257),
        dwInterfaceType = 0,
        guid = Guid(),
        pppInfo3 = PppInfo3(),
        rasQuarState = 0,
        timer = Filetime(),
    )

    public operator fun component1(): UInt = this.dwVersion

    public operator fun component2(): UInt = this.dwSize

    public operator fun component3(): Handle = this.hConnection

    public operator fun component4(): UShortArray = this.wszUserName

    public operator fun component5(): RouterInterfaceType = this.dwInterfaceType

    public operator fun component6(): Guid = this.guid

    public operator fun component7(): PppInfo3 = this.pppInfo3

    public operator fun component8(): RasQuarantineState = this.rasQuarState

    public operator fun component9(): Filetime = this.timer

    public fun copy(dwVersion: UInt = this.dwVersion, dwSize: UInt = this.dwSize, hConnection: Handle = this.hConnection, wszUserName: UShortArray = this.wszUserName, dwInterfaceType: RouterInterfaceType = this.dwInterfaceType, guid: Guid = this.guid, pppInfo3: PppInfo3 = this.pppInfo3, rasQuarState: RasQuarantineState = this.rasQuarState, timer: Filetime = this.timer): RasConnection3 = RasConnection3(dwVersion = dwVersion, dwSize = dwSize, hConnectionCtorArg = hConnection, wszUserName = wszUserName, dwInterfaceType = dwInterfaceType, guid = guid, pppInfo3 = pppInfo3, rasQuarState = rasQuarState, timer = timer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RasConnection3) return false
        if (this.dwVersion != other.dwVersion) return false
        if (this.dwSize != other.dwSize) return false
        if (this.hConnection != other.hConnection) return false
        if (!this.wszUserName.contentEquals(other.wszUserName)) return false
        if (this.dwInterfaceType != other.dwInterfaceType) return false
        if (this.guid != other.guid) return false
        if (this.pppInfo3 != other.pppInfo3) return false
        if (this.rasQuarState != other.rasQuarState) return false
        if (this.timer != other.timer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwVersion.hashCode()
        result = 31 * result + this.dwSize.hashCode()
        result = 31 * result + this.hConnection.hashCode()
        result = 31 * result + this.wszUserName.contentHashCode()
        result = 31 * result + this.dwInterfaceType.hashCode()
        result = 31 * result + this.guid.hashCode()
        result = 31 * result + this.pppInfo3.hashCode()
        result = 31 * result + this.rasQuarState.hashCode()
        result = 31 * result + this.timer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwVersion: UInt = 0u,
            dwSize: UInt = 0u,
            hConnection: Handle = MutPtr(0L),
            wszUserName: UShortArray = UShortArray(257),
            dwInterfaceType: RouterInterfaceType = 0,
            guid: Guid = Guid(),
            pppInfo3: PppInfo3 = PppInfo3(),
            rasQuarState: RasQuarantineState = 0,
            timer: Filetime = Filetime(),
        ): RasConnection3 =
            RasConnection3(
                dwVersion = dwVersion,
                dwSize = dwSize,
                hConnectionCtorArg = hConnection,
                wszUserName = wszUserName,
                dwInterfaceType = dwInterfaceType,
                guid = guid,
                pppInfo3 = pppInfo3,
                rasQuarState = rasQuarState,
                timer = timer,
            )
    }
}

public class RasConnection4 internal constructor(
    public var dwConnectDuration: UInt,
    public var dwInterfaceType: RouterInterfaceType,
    public var dwConnectionFlags: RasFlags,
    public var wszInterfaceName: UShortArray,
    public var wszUserName: UShortArray,
    public var wszLogonDomain: UShortArray,
    public var wszRemoteComputer: UShortArray,
    public var guid: Guid,
    public var rasQuarState: RasQuarantineState,
    public var probationTime: Filetime,
    public var connectionStartTime: Filetime,
    public var ullBytesXmited: ULong,
    public var ullBytesRcved: ULong,
    public var dwFramesXmited: UInt,
    public var dwFramesRcved: UInt,
    public var dwCrcErr: UInt,
    public var dwTimeoutErr: UInt,
    public var dwAlignmentErr: UInt,
    public var dwHardwareOverrunErr: UInt,
    public var dwFramingErr: UInt,
    public var dwBufferOverrunErr: UInt,
    public var dwCompressionRatioIn: UInt,
    public var dwCompressionRatioOut: UInt,
    public var dwNumSwitchOvers: UInt,
    public var wszRemoteEndpointAddress: UShortArray,
    public var wszLocalEndpointAddress: UShortArray,
    public var projectionInfo: ProjectionInfo2,
    hConnectionCtorArg: Handle,
    hInterfaceCtorArg: Handle,
    public var dwDeviceType: UInt,
) {
    public var hConnection: Handle = hConnectionCtorArg
        internal set

    public var hInterface: Handle = hInterfaceCtorArg
        internal set

    public constructor() : this(
        dwConnectDuration = 0u,
        dwInterfaceType = 0,
        dwConnectionFlags = 0u,
        wszInterfaceName = UShortArray(257),
        wszUserName = UShortArray(257),
        wszLogonDomain = UShortArray(16),
        wszRemoteComputer = UShortArray(17),
        guid = Guid(),
        rasQuarState = 0,
        probationTime = Filetime(),
        connectionStartTime = Filetime(),
        ullBytesXmited = 0uL,
        ullBytesRcved = 0uL,
        dwFramesXmited = 0u,
        dwFramesRcved = 0u,
        dwCrcErr = 0u,
        dwTimeoutErr = 0u,
        dwAlignmentErr = 0u,
        dwHardwareOverrunErr = 0u,
        dwFramingErr = 0u,
        dwBufferOverrunErr = 0u,
        dwCompressionRatioIn = 0u,
        dwCompressionRatioOut = 0u,
        dwNumSwitchOvers = 0u,
        wszRemoteEndpointAddress = UShortArray(65),
        wszLocalEndpointAddress = UShortArray(65),
        projectionInfo = ProjectionInfo2(),
        hConnectionCtorArg = MutPtr(0L),
        hInterfaceCtorArg = MutPtr(0L),
        dwDeviceType = 0u,
    )

    public companion object {
        public operator fun invoke(
            dwConnectDuration: UInt = 0u,
            dwInterfaceType: RouterInterfaceType = 0,
            dwConnectionFlags: RasFlags = 0u,
            wszInterfaceName: UShortArray = UShortArray(257),
            wszUserName: UShortArray = UShortArray(257),
            wszLogonDomain: UShortArray = UShortArray(16),
            wszRemoteComputer: UShortArray = UShortArray(17),
            guid: Guid = Guid(),
            rasQuarState: RasQuarantineState = 0,
            probationTime: Filetime = Filetime(),
            connectionStartTime: Filetime = Filetime(),
            ullBytesXmited: ULong = 0uL,
            ullBytesRcved: ULong = 0uL,
            dwFramesXmited: UInt = 0u,
            dwFramesRcved: UInt = 0u,
            dwCrcErr: UInt = 0u,
            dwTimeoutErr: UInt = 0u,
            dwAlignmentErr: UInt = 0u,
            dwHardwareOverrunErr: UInt = 0u,
            dwFramingErr: UInt = 0u,
            dwBufferOverrunErr: UInt = 0u,
            dwCompressionRatioIn: UInt = 0u,
            dwCompressionRatioOut: UInt = 0u,
            dwNumSwitchOvers: UInt = 0u,
            wszRemoteEndpointAddress: UShortArray = UShortArray(65),
            wszLocalEndpointAddress: UShortArray = UShortArray(65),
            projectionInfo: ProjectionInfo2 = ProjectionInfo2(),
            hConnection: Handle = MutPtr(0L),
            hInterface: Handle = MutPtr(0L),
            dwDeviceType: UInt = 0u,
        ): RasConnection4 =
            RasConnection4(
                dwConnectDuration = dwConnectDuration,
                dwInterfaceType = dwInterfaceType,
                dwConnectionFlags = dwConnectionFlags,
                wszInterfaceName = wszInterfaceName,
                wszUserName = wszUserName,
                wszLogonDomain = wszLogonDomain,
                wszRemoteComputer = wszRemoteComputer,
                guid = guid,
                rasQuarState = rasQuarState,
                probationTime = probationTime,
                connectionStartTime = connectionStartTime,
                ullBytesXmited = ullBytesXmited,
                ullBytesRcved = ullBytesRcved,
                dwFramesXmited = dwFramesXmited,
                dwFramesRcved = dwFramesRcved,
                dwCrcErr = dwCrcErr,
                dwTimeoutErr = dwTimeoutErr,
                dwAlignmentErr = dwAlignmentErr,
                dwHardwareOverrunErr = dwHardwareOverrunErr,
                dwFramingErr = dwFramingErr,
                dwBufferOverrunErr = dwBufferOverrunErr,
                dwCompressionRatioIn = dwCompressionRatioIn,
                dwCompressionRatioOut = dwCompressionRatioOut,
                dwNumSwitchOvers = dwNumSwitchOvers,
                wszRemoteEndpointAddress = wszRemoteEndpointAddress,
                wszLocalEndpointAddress = wszLocalEndpointAddress,
                projectionInfo = projectionInfo,
                hConnectionCtorArg = hConnection,
                hInterfaceCtorArg = hInterface,
                dwDeviceType = dwDeviceType,
            )
    }
}

public class RasConnectionEx internal constructor(
    public var header: MprapiObjectHeader,
    public var dwConnectDuration: UInt,
    public var dwInterfaceType: RouterInterfaceType,
    public var dwConnectionFlags: RasFlags,
    public var wszInterfaceName: UShortArray,
    public var wszUserName: UShortArray,
    public var wszLogonDomain: UShortArray,
    public var wszRemoteComputer: UShortArray,
    public var guid: Guid,
    public var rasQuarState: RasQuarantineState,
    public var probationTime: Filetime,
    public var dwBytesXmited: UInt,
    public var dwBytesRcved: UInt,
    public var dwFramesXmited: UInt,
    public var dwFramesRcved: UInt,
    public var dwCrcErr: UInt,
    public var dwTimeoutErr: UInt,
    public var dwAlignmentErr: UInt,
    public var dwHardwareOverrunErr: UInt,
    public var dwFramingErr: UInt,
    public var dwBufferOverrunErr: UInt,
    public var dwCompressionRatioIn: UInt,
    public var dwCompressionRatioOut: UInt,
    public var dwNumSwitchOvers: UInt,
    public var wszRemoteEndpointAddress: UShortArray,
    public var wszLocalEndpointAddress: UShortArray,
    public var projectionInfo: ProjectionInfo,
    hConnectionCtorArg: Handle,
    hInterfaceCtorArg: Handle,
) {
    public var hConnection: Handle = hConnectionCtorArg
        internal set

    public var hInterface: Handle = hInterfaceCtorArg
        internal set

    public constructor() : this(
        header = MprapiObjectHeader(),
        dwConnectDuration = 0u,
        dwInterfaceType = 0,
        dwConnectionFlags = 0u,
        wszInterfaceName = UShortArray(257),
        wszUserName = UShortArray(257),
        wszLogonDomain = UShortArray(16),
        wszRemoteComputer = UShortArray(17),
        guid = Guid(),
        rasQuarState = 0,
        probationTime = Filetime(),
        dwBytesXmited = 0u,
        dwBytesRcved = 0u,
        dwFramesXmited = 0u,
        dwFramesRcved = 0u,
        dwCrcErr = 0u,
        dwTimeoutErr = 0u,
        dwAlignmentErr = 0u,
        dwHardwareOverrunErr = 0u,
        dwFramingErr = 0u,
        dwBufferOverrunErr = 0u,
        dwCompressionRatioIn = 0u,
        dwCompressionRatioOut = 0u,
        dwNumSwitchOvers = 0u,
        wszRemoteEndpointAddress = UShortArray(65),
        wszLocalEndpointAddress = UShortArray(65),
        projectionInfo = ProjectionInfo(),
        hConnectionCtorArg = MutPtr(0L),
        hInterfaceCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            header: MprapiObjectHeader = MprapiObjectHeader(),
            dwConnectDuration: UInt = 0u,
            dwInterfaceType: RouterInterfaceType = 0,
            dwConnectionFlags: RasFlags = 0u,
            wszInterfaceName: UShortArray = UShortArray(257),
            wszUserName: UShortArray = UShortArray(257),
            wszLogonDomain: UShortArray = UShortArray(16),
            wszRemoteComputer: UShortArray = UShortArray(17),
            guid: Guid = Guid(),
            rasQuarState: RasQuarantineState = 0,
            probationTime: Filetime = Filetime(),
            dwBytesXmited: UInt = 0u,
            dwBytesRcved: UInt = 0u,
            dwFramesXmited: UInt = 0u,
            dwFramesRcved: UInt = 0u,
            dwCrcErr: UInt = 0u,
            dwTimeoutErr: UInt = 0u,
            dwAlignmentErr: UInt = 0u,
            dwHardwareOverrunErr: UInt = 0u,
            dwFramingErr: UInt = 0u,
            dwBufferOverrunErr: UInt = 0u,
            dwCompressionRatioIn: UInt = 0u,
            dwCompressionRatioOut: UInt = 0u,
            dwNumSwitchOvers: UInt = 0u,
            wszRemoteEndpointAddress: UShortArray = UShortArray(65),
            wszLocalEndpointAddress: UShortArray = UShortArray(65),
            projectionInfo: ProjectionInfo = ProjectionInfo(),
            hConnection: Handle = MutPtr(0L),
            hInterface: Handle = MutPtr(0L),
        ): RasConnectionEx =
            RasConnectionEx(
                header = header,
                dwConnectDuration = dwConnectDuration,
                dwInterfaceType = dwInterfaceType,
                dwConnectionFlags = dwConnectionFlags,
                wszInterfaceName = wszInterfaceName,
                wszUserName = wszUserName,
                wszLogonDomain = wszLogonDomain,
                wszRemoteComputer = wszRemoteComputer,
                guid = guid,
                rasQuarState = rasQuarState,
                probationTime = probationTime,
                dwBytesXmited = dwBytesXmited,
                dwBytesRcved = dwBytesRcved,
                dwFramesXmited = dwFramesXmited,
                dwFramesRcved = dwFramesRcved,
                dwCrcErr = dwCrcErr,
                dwTimeoutErr = dwTimeoutErr,
                dwAlignmentErr = dwAlignmentErr,
                dwHardwareOverrunErr = dwHardwareOverrunErr,
                dwFramingErr = dwFramingErr,
                dwBufferOverrunErr = dwBufferOverrunErr,
                dwCompressionRatioIn = dwCompressionRatioIn,
                dwCompressionRatioOut = dwCompressionRatioOut,
                dwNumSwitchOvers = dwNumSwitchOvers,
                wszRemoteEndpointAddress = wszRemoteEndpointAddress,
                wszLocalEndpointAddress = wszLocalEndpointAddress,
                projectionInfo = projectionInfo,
                hConnectionCtorArg = hConnection,
                hInterfaceCtorArg = hInterface,
            )
    }
}

public class RasPort0 internal constructor(
    hPortCtorArg: Handle,
    hConnectionCtorArg: Handle,
    public var dwPortCondition: RasPortCondition,
    public var dwTotalNumberOfCalls: UInt,
    public var dwConnectDuration: UInt,
    public var wszPortName: UShortArray,
    public var wszMediaName: UShortArray,
    public var wszDeviceName: UShortArray,
    public var wszDeviceType: UShortArray,
) {
    public var hPort: Handle = hPortCtorArg
        internal set

    public var hConnection: Handle = hConnectionCtorArg
        internal set

    public constructor() : this(
        hPortCtorArg = MutPtr(0L),
        hConnectionCtorArg = MutPtr(0L),
        dwPortCondition = 0,
        dwTotalNumberOfCalls = 0u,
        dwConnectDuration = 0u,
        wszPortName = UShortArray(17),
        wszMediaName = UShortArray(17),
        wszDeviceName = UShortArray(129),
        wszDeviceType = UShortArray(17),
    )

    public operator fun component1(): Handle = this.hPort

    public operator fun component2(): Handle = this.hConnection

    public operator fun component3(): RasPortCondition = this.dwPortCondition

    public operator fun component4(): UInt = this.dwTotalNumberOfCalls

    public operator fun component5(): UInt = this.dwConnectDuration

    public operator fun component6(): UShortArray = this.wszPortName

    public operator fun component7(): UShortArray = this.wszMediaName

    public operator fun component8(): UShortArray = this.wszDeviceName

    public operator fun component9(): UShortArray = this.wszDeviceType

    public fun copy(hPort: Handle = this.hPort, hConnection: Handle = this.hConnection, dwPortCondition: RasPortCondition = this.dwPortCondition, dwTotalNumberOfCalls: UInt = this.dwTotalNumberOfCalls, dwConnectDuration: UInt = this.dwConnectDuration, wszPortName: UShortArray = this.wszPortName, wszMediaName: UShortArray = this.wszMediaName, wszDeviceName: UShortArray = this.wszDeviceName, wszDeviceType: UShortArray = this.wszDeviceType): RasPort0 = RasPort0(hPortCtorArg = hPort, hConnectionCtorArg = hConnection, dwPortCondition = dwPortCondition, dwTotalNumberOfCalls = dwTotalNumberOfCalls, dwConnectDuration = dwConnectDuration, wszPortName = wszPortName, wszMediaName = wszMediaName, wszDeviceName = wszDeviceName, wszDeviceType = wszDeviceType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RasPort0) return false
        if (this.hPort != other.hPort) return false
        if (this.hConnection != other.hConnection) return false
        if (this.dwPortCondition != other.dwPortCondition) return false
        if (this.dwTotalNumberOfCalls != other.dwTotalNumberOfCalls) return false
        if (this.dwConnectDuration != other.dwConnectDuration) return false
        if (!this.wszPortName.contentEquals(other.wszPortName)) return false
        if (!this.wszMediaName.contentEquals(other.wszMediaName)) return false
        if (!this.wszDeviceName.contentEquals(other.wszDeviceName)) return false
        if (!this.wszDeviceType.contentEquals(other.wszDeviceType)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hPort.hashCode()
        result = 31 * result + this.hConnection.hashCode()
        result = 31 * result + this.dwPortCondition.hashCode()
        result = 31 * result + this.dwTotalNumberOfCalls.hashCode()
        result = 31 * result + this.dwConnectDuration.hashCode()
        result = 31 * result + this.wszPortName.contentHashCode()
        result = 31 * result + this.wszMediaName.contentHashCode()
        result = 31 * result + this.wszDeviceName.contentHashCode()
        result = 31 * result + this.wszDeviceType.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hPort: Handle = MutPtr(0L),
            hConnection: Handle = MutPtr(0L),
            dwPortCondition: RasPortCondition = 0,
            dwTotalNumberOfCalls: UInt = 0u,
            dwConnectDuration: UInt = 0u,
            wszPortName: UShortArray = UShortArray(17),
            wszMediaName: UShortArray = UShortArray(17),
            wszDeviceName: UShortArray = UShortArray(129),
            wszDeviceType: UShortArray = UShortArray(17),
        ): RasPort0 =
            RasPort0(
                hPortCtorArg = hPort,
                hConnectionCtorArg = hConnection,
                dwPortCondition = dwPortCondition,
                dwTotalNumberOfCalls = dwTotalNumberOfCalls,
                dwConnectDuration = dwConnectDuration,
                wszPortName = wszPortName,
                wszMediaName = wszMediaName,
                wszDeviceName = wszDeviceName,
                wszDeviceType = wszDeviceType,
            )
    }
}

public class RasPort1 internal constructor(
    hPortCtorArg: Handle,
    hConnectionCtorArg: Handle,
    public var dwHardwareCondition: RasHardwareCondition,
    public var dwLineSpeed: UInt,
    public var dwBytesXmited: UInt,
    public var dwBytesRcved: UInt,
    public var dwFramesXmited: UInt,
    public var dwFramesRcved: UInt,
    public var dwCrcErr: UInt,
    public var dwTimeoutErr: UInt,
    public var dwAlignmentErr: UInt,
    public var dwHardwareOverrunErr: UInt,
    public var dwFramingErr: UInt,
    public var dwBufferOverrunErr: UInt,
    public var dwCompressionRatioIn: UInt,
    public var dwCompressionRatioOut: UInt,
) {
    public var hPort: Handle = hPortCtorArg
        internal set

    public var hConnection: Handle = hConnectionCtorArg
        internal set

    public constructor() : this(
        hPortCtorArg = MutPtr(0L),
        hConnectionCtorArg = MutPtr(0L),
        dwHardwareCondition = 0,
        dwLineSpeed = 0u,
        dwBytesXmited = 0u,
        dwBytesRcved = 0u,
        dwFramesXmited = 0u,
        dwFramesRcved = 0u,
        dwCrcErr = 0u,
        dwTimeoutErr = 0u,
        dwAlignmentErr = 0u,
        dwHardwareOverrunErr = 0u,
        dwFramingErr = 0u,
        dwBufferOverrunErr = 0u,
        dwCompressionRatioIn = 0u,
        dwCompressionRatioOut = 0u,
    )

    public operator fun component1(): Handle = this.hPort

    public operator fun component2(): Handle = this.hConnection

    public operator fun component3(): RasHardwareCondition = this.dwHardwareCondition

    public operator fun component4(): UInt = this.dwLineSpeed

    public operator fun component5(): UInt = this.dwBytesXmited

    public operator fun component6(): UInt = this.dwBytesRcved

    public operator fun component7(): UInt = this.dwFramesXmited

    public operator fun component8(): UInt = this.dwFramesRcved

    public operator fun component9(): UInt = this.dwCrcErr

    public operator fun component10(): UInt = this.dwTimeoutErr

    public operator fun component11(): UInt = this.dwAlignmentErr

    public operator fun component12(): UInt = this.dwHardwareOverrunErr

    public operator fun component13(): UInt = this.dwFramingErr

    public operator fun component14(): UInt = this.dwBufferOverrunErr

    public operator fun component15(): UInt = this.dwCompressionRatioIn

    public operator fun component16(): UInt = this.dwCompressionRatioOut

    public fun copy(hPort: Handle = this.hPort, hConnection: Handle = this.hConnection, dwHardwareCondition: RasHardwareCondition = this.dwHardwareCondition, dwLineSpeed: UInt = this.dwLineSpeed, dwBytesXmited: UInt = this.dwBytesXmited, dwBytesRcved: UInt = this.dwBytesRcved, dwFramesXmited: UInt = this.dwFramesXmited, dwFramesRcved: UInt = this.dwFramesRcved, dwCrcErr: UInt = this.dwCrcErr, dwTimeoutErr: UInt = this.dwTimeoutErr, dwAlignmentErr: UInt = this.dwAlignmentErr, dwHardwareOverrunErr: UInt = this.dwHardwareOverrunErr, dwFramingErr: UInt = this.dwFramingErr, dwBufferOverrunErr: UInt = this.dwBufferOverrunErr, dwCompressionRatioIn: UInt = this.dwCompressionRatioIn, dwCompressionRatioOut: UInt = this.dwCompressionRatioOut): RasPort1 = RasPort1(hPortCtorArg = hPort, hConnectionCtorArg = hConnection, dwHardwareCondition = dwHardwareCondition, dwLineSpeed = dwLineSpeed, dwBytesXmited = dwBytesXmited, dwBytesRcved = dwBytesRcved, dwFramesXmited = dwFramesXmited, dwFramesRcved = dwFramesRcved, dwCrcErr = dwCrcErr, dwTimeoutErr = dwTimeoutErr, dwAlignmentErr = dwAlignmentErr, dwHardwareOverrunErr = dwHardwareOverrunErr, dwFramingErr = dwFramingErr, dwBufferOverrunErr = dwBufferOverrunErr, dwCompressionRatioIn = dwCompressionRatioIn, dwCompressionRatioOut = dwCompressionRatioOut)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RasPort1) return false
        if (this.hPort != other.hPort) return false
        if (this.hConnection != other.hConnection) return false
        if (this.dwHardwareCondition != other.dwHardwareCondition) return false
        if (this.dwLineSpeed != other.dwLineSpeed) return false
        if (this.dwBytesXmited != other.dwBytesXmited) return false
        if (this.dwBytesRcved != other.dwBytesRcved) return false
        if (this.dwFramesXmited != other.dwFramesXmited) return false
        if (this.dwFramesRcved != other.dwFramesRcved) return false
        if (this.dwCrcErr != other.dwCrcErr) return false
        if (this.dwTimeoutErr != other.dwTimeoutErr) return false
        if (this.dwAlignmentErr != other.dwAlignmentErr) return false
        if (this.dwHardwareOverrunErr != other.dwHardwareOverrunErr) return false
        if (this.dwFramingErr != other.dwFramingErr) return false
        if (this.dwBufferOverrunErr != other.dwBufferOverrunErr) return false
        if (this.dwCompressionRatioIn != other.dwCompressionRatioIn) return false
        if (this.dwCompressionRatioOut != other.dwCompressionRatioOut) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hPort.hashCode()
        result = 31 * result + this.hConnection.hashCode()
        result = 31 * result + this.dwHardwareCondition.hashCode()
        result = 31 * result + this.dwLineSpeed.hashCode()
        result = 31 * result + this.dwBytesXmited.hashCode()
        result = 31 * result + this.dwBytesRcved.hashCode()
        result = 31 * result + this.dwFramesXmited.hashCode()
        result = 31 * result + this.dwFramesRcved.hashCode()
        result = 31 * result + this.dwCrcErr.hashCode()
        result = 31 * result + this.dwTimeoutErr.hashCode()
        result = 31 * result + this.dwAlignmentErr.hashCode()
        result = 31 * result + this.dwHardwareOverrunErr.hashCode()
        result = 31 * result + this.dwFramingErr.hashCode()
        result = 31 * result + this.dwBufferOverrunErr.hashCode()
        result = 31 * result + this.dwCompressionRatioIn.hashCode()
        result = 31 * result + this.dwCompressionRatioOut.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hPort: Handle = MutPtr(0L),
            hConnection: Handle = MutPtr(0L),
            dwHardwareCondition: RasHardwareCondition = 0,
            dwLineSpeed: UInt = 0u,
            dwBytesXmited: UInt = 0u,
            dwBytesRcved: UInt = 0u,
            dwFramesXmited: UInt = 0u,
            dwFramesRcved: UInt = 0u,
            dwCrcErr: UInt = 0u,
            dwTimeoutErr: UInt = 0u,
            dwAlignmentErr: UInt = 0u,
            dwHardwareOverrunErr: UInt = 0u,
            dwFramingErr: UInt = 0u,
            dwBufferOverrunErr: UInt = 0u,
            dwCompressionRatioIn: UInt = 0u,
            dwCompressionRatioOut: UInt = 0u,
        ): RasPort1 =
            RasPort1(
                hPortCtorArg = hPort,
                hConnectionCtorArg = hConnection,
                dwHardwareCondition = dwHardwareCondition,
                dwLineSpeed = dwLineSpeed,
                dwBytesXmited = dwBytesXmited,
                dwBytesRcved = dwBytesRcved,
                dwFramesXmited = dwFramesXmited,
                dwFramesRcved = dwFramesRcved,
                dwCrcErr = dwCrcErr,
                dwTimeoutErr = dwTimeoutErr,
                dwAlignmentErr = dwAlignmentErr,
                dwHardwareOverrunErr = dwHardwareOverrunErr,
                dwFramingErr = dwFramingErr,
                dwBufferOverrunErr = dwBufferOverrunErr,
                dwCompressionRatioIn = dwCompressionRatioIn,
                dwCompressionRatioOut = dwCompressionRatioOut,
            )
    }
}

public class RasPort2 internal constructor(
    hPortCtorArg: Handle,
    hConnectionCtorArg: Handle,
    public var dwConnState: UInt,
    public var wszPortName: UShortArray,
    public var wszMediaName: UShortArray,
    public var wszDeviceName: UShortArray,
    public var wszDeviceType: UShortArray,
    public var dwHardwareCondition: RasHardwareCondition,
    public var dwLineSpeed: UInt,
    public var dwCrcErr: UInt,
    public var dwSerialOverRunErrs: UInt,
    public var dwTimeoutErr: UInt,
    public var dwAlignmentErr: UInt,
    public var dwHardwareOverrunErr: UInt,
    public var dwFramingErr: UInt,
    public var dwBufferOverrunErr: UInt,
    public var dwCompressionRatioIn: UInt,
    public var dwCompressionRatioOut: UInt,
    public var dwTotalErrors: UInt,
    public var ullBytesXmited: ULong,
    public var ullBytesRcved: ULong,
    public var ullFramesXmited: ULong,
    public var ullFramesRcved: ULong,
    public var ullBytesTxUncompressed: ULong,
    public var ullBytesTxCompressed: ULong,
    public var ullBytesRcvUncompressed: ULong,
    public var ullBytesRcvCompressed: ULong,
) {
    public var hPort: Handle = hPortCtorArg
        internal set

    public var hConnection: Handle = hConnectionCtorArg
        internal set

    public constructor() : this(
        hPortCtorArg = MutPtr(0L),
        hConnectionCtorArg = MutPtr(0L),
        dwConnState = 0u,
        wszPortName = UShortArray(17),
        wszMediaName = UShortArray(17),
        wszDeviceName = UShortArray(129),
        wszDeviceType = UShortArray(17),
        dwHardwareCondition = 0,
        dwLineSpeed = 0u,
        dwCrcErr = 0u,
        dwSerialOverRunErrs = 0u,
        dwTimeoutErr = 0u,
        dwAlignmentErr = 0u,
        dwHardwareOverrunErr = 0u,
        dwFramingErr = 0u,
        dwBufferOverrunErr = 0u,
        dwCompressionRatioIn = 0u,
        dwCompressionRatioOut = 0u,
        dwTotalErrors = 0u,
        ullBytesXmited = 0uL,
        ullBytesRcved = 0uL,
        ullFramesXmited = 0uL,
        ullFramesRcved = 0uL,
        ullBytesTxUncompressed = 0uL,
        ullBytesTxCompressed = 0uL,
        ullBytesRcvUncompressed = 0uL,
        ullBytesRcvCompressed = 0uL,
    )

    public companion object {
        public operator fun invoke(
            hPort: Handle = MutPtr(0L),
            hConnection: Handle = MutPtr(0L),
            dwConnState: UInt = 0u,
            wszPortName: UShortArray = UShortArray(17),
            wszMediaName: UShortArray = UShortArray(17),
            wszDeviceName: UShortArray = UShortArray(129),
            wszDeviceType: UShortArray = UShortArray(17),
            dwHardwareCondition: RasHardwareCondition = 0,
            dwLineSpeed: UInt = 0u,
            dwCrcErr: UInt = 0u,
            dwSerialOverRunErrs: UInt = 0u,
            dwTimeoutErr: UInt = 0u,
            dwAlignmentErr: UInt = 0u,
            dwHardwareOverrunErr: UInt = 0u,
            dwFramingErr: UInt = 0u,
            dwBufferOverrunErr: UInt = 0u,
            dwCompressionRatioIn: UInt = 0u,
            dwCompressionRatioOut: UInt = 0u,
            dwTotalErrors: UInt = 0u,
            ullBytesXmited: ULong = 0uL,
            ullBytesRcved: ULong = 0uL,
            ullFramesXmited: ULong = 0uL,
            ullFramesRcved: ULong = 0uL,
            ullBytesTxUncompressed: ULong = 0uL,
            ullBytesTxCompressed: ULong = 0uL,
            ullBytesRcvUncompressed: ULong = 0uL,
            ullBytesRcvCompressed: ULong = 0uL,
        ): RasPort2 =
            RasPort2(
                hPortCtorArg = hPort,
                hConnectionCtorArg = hConnection,
                dwConnState = dwConnState,
                wszPortName = wszPortName,
                wszMediaName = wszMediaName,
                wszDeviceName = wszDeviceName,
                wszDeviceType = wszDeviceType,
                dwHardwareCondition = dwHardwareCondition,
                dwLineSpeed = dwLineSpeed,
                dwCrcErr = dwCrcErr,
                dwSerialOverRunErrs = dwSerialOverRunErrs,
                dwTimeoutErr = dwTimeoutErr,
                dwAlignmentErr = dwAlignmentErr,
                dwHardwareOverrunErr = dwHardwareOverrunErr,
                dwFramingErr = dwFramingErr,
                dwBufferOverrunErr = dwBufferOverrunErr,
                dwCompressionRatioIn = dwCompressionRatioIn,
                dwCompressionRatioOut = dwCompressionRatioOut,
                dwTotalErrors = dwTotalErrors,
                ullBytesXmited = ullBytesXmited,
                ullBytesRcved = ullBytesRcved,
                ullFramesXmited = ullFramesXmited,
                ullFramesRcved = ullFramesRcved,
                ullBytesTxUncompressed = ullBytesTxUncompressed,
                ullBytesTxCompressed = ullBytesTxCompressed,
                ullBytesRcvUncompressed = ullBytesRcvUncompressed,
                ullBytesRcvCompressed = ullBytesRcvCompressed,
            )
    }
}

public data class RasProjectionInfo(
    public var version: Rasapiversion = 0,
    public var type: RasprojectionInfoType = 0,
    public var anonymous: RasProjectionInfo0 = RasProjectionInfo0(),
)

public data class RasProjectionInfo0(
    public var ppp: RaspppProjectionInfo = RaspppProjectionInfo(),
    public var ikev2: Rasikev2ProjectionInfo = Rasikev2ProjectionInfo(),
)

public data class RasSecurityInfo(
    public var lastError: UInt = 0u,
    public var bytesReceived: UInt = 0u,
    public var deviceName: ByteArray = ByteArray(129),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RasSecurityInfo) return false
        if (this.lastError != other.lastError) return false
        if (this.bytesReceived != other.bytesReceived) return false
        if (!this.deviceName.contentEquals(other.deviceName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lastError.hashCode()
        result = 31 * result + this.bytesReceived.hashCode()
        result = 31 * result + this.deviceName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RasSecurityInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RasSecurityInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 140L
                override fun readNative(addr: Long): RasSecurityInfo =
                    RasSecurityInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (129).toInt())
                        ).readNative(addr + 8L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: RasSecurityInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.lastError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bytesReceived)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (129).toInt())
                    ).writeNative(addr + 8L, value.deviceName.toList())
                }
            }
    }
}

public data class RasStats(
    public var dwSize: UInt = 0u,
    public var dwBytesXmited: UInt = 0u,
    public var dwBytesRcved: UInt = 0u,
    public var dwFramesXmited: UInt = 0u,
    public var dwFramesRcved: UInt = 0u,
    public var dwCrcErr: UInt = 0u,
    public var dwTimeoutErr: UInt = 0u,
    public var dwAlignmentErr: UInt = 0u,
    public var dwHardwareOverrunErr: UInt = 0u,
    public var dwFramingErr: UInt = 0u,
    public var dwBufferOverrunErr: UInt = 0u,
    public var dwCompressionRatioIn: UInt = 0u,
    public var dwCompressionRatioOut: UInt = 0u,
    public var dwBps: UInt = 0u,
    public var dwConnectDuration: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RasStats> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RasStats> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 60L
                override fun readNative(addr: Long): RasStats =
                    RasStats(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: RasStats) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwBytesXmited)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwBytesRcved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwFramesXmited)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwFramesRcved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwCrcErr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwTimeoutErr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwAlignmentErr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwHardwareOverrunErr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwFramingErr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwBufferOverrunErr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwCompressionRatioIn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dwCompressionRatioOut)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.dwBps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.dwConnectDuration)
                }
            }
    }
}

public data class RasUpdateConnection(
    public var header: MprapiObjectHeader = MprapiObjectHeader(),
    public var dwIfIndex: UInt = 0u,
    public var wszLocalEndpointAddress: UShortArray = UShortArray(65),
    public var wszRemoteEndpointAddress: UShortArray = UShortArray(65),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RasUpdateConnection) return false
        if (this.header != other.header) return false
        if (this.dwIfIndex != other.dwIfIndex) return false
        if (!this.wszLocalEndpointAddress.contentEquals(other.wszLocalEndpointAddress)) return false
        if (!this.wszRemoteEndpointAddress.contentEquals(other.wszRemoteEndpointAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.dwIfIndex.hashCode()
        result = 31 * result + this.wszLocalEndpointAddress.contentHashCode()
        result = 31 * result + this.wszRemoteEndpointAddress.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RasUpdateConnection> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RasUpdateConnection> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 268L
                override fun readNative(addr: Long): RasUpdateConnection =
                    RasUpdateConnection(
                        (MprapiObjectHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (65).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (65).toInt())
                        ).readNative(addr + 138L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: RasUpdateConnection) {
                    (MprapiObjectHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwIfIndex)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (65).toInt())
                    ).writeNative(addr + 8L, value.wszLocalEndpointAddress.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (65).toInt())
                    ).writeNative(addr + 138L, value.wszRemoteEndpointAddress.toList())
                }
            }
    }
}

public data class RasUser0(
    public var bfPrivilege: UByte = 0u,
    public var wszPhoneNumber: UShortArray = UShortArray(129),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RasUser0) return false
        if (this.bfPrivilege != other.bfPrivilege) return false
        if (!this.wszPhoneNumber.contentEquals(other.wszPhoneNumber)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bfPrivilege.hashCode()
        result = 31 * result + this.wszPhoneNumber.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RasUser0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RasUser0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 260L
                override fun readNative(addr: Long): RasUser0 =
                    RasUser0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (129).toInt())
                        ).readNative(addr + 2L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: RasUser0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bfPrivilege)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (129).toInt())
                    ).writeNative(addr + 2L, value.wszPhoneNumber.toList())
                }
            }
    }
}

public data class RasUser1(
    public var bfPrivilege: UByte = 0u,
    public var wszPhoneNumber: UShortArray = UShortArray(129),
    public var bfPrivilege2: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RasUser1) return false
        if (this.bfPrivilege != other.bfPrivilege) return false
        if (!this.wszPhoneNumber.contentEquals(other.wszPhoneNumber)) return false
        if (this.bfPrivilege2 != other.bfPrivilege2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bfPrivilege.hashCode()
        result = 31 * result + this.wszPhoneNumber.contentHashCode()
        result = 31 * result + this.bfPrivilege2.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RasUser1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RasUser1> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 262L
                override fun readNative(addr: Long): RasUser1 =
                    RasUser1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (129).toInt())
                        ).readNative(addr + 2L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 260L),
                    )
                override fun writeNative(addr: Long, value: RasUser1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bfPrivilege)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (129).toInt())
                    ).writeNative(addr + 2L, value.wszPhoneNumber.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 260L, value.bfPrivilege2)
                }
            }
    }
}

public data class RouterCustomIkev2Policy0(
    public var dwIntegrityMethod: UInt = 0u,
    public var dwEncryptionMethod: UInt = 0u,
    public var dwCipherTransformConstant: UInt = 0u,
    public var dwAuthTransformConstant: UInt = 0u,
    public var dwPfsGroup: UInt = 0u,
    public var dwDhGroup: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RouterCustomIkev2Policy0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RouterCustomIkev2Policy0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): RouterCustomIkev2Policy0 =
                    RouterCustomIkev2Policy0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: RouterCustomIkev2Policy0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwIntegrityMethod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwEncryptionMethod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwCipherTransformConstant)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwAuthTransformConstant)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwPfsGroup)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwDhGroup)
                }
            }
    }
}

public class RouterIkev2IfCustomConfig0 internal constructor(
    public var dwSaLifeTime: UInt,
    public var dwSaDataSize: UInt,
    public var certificateName: CryptIntegerBlob,
    customPolicyCtorArg: MutPtr,
) {
    public var customPolicy: MutPtr = customPolicyCtorArg
        internal set

    public constructor() : this(
        dwSaLifeTime = 0u,
        dwSaDataSize = 0u,
        certificateName = CryptIntegerBlob(),
        customPolicyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwSaLifeTime

    public operator fun component2(): UInt = this.dwSaDataSize

    public operator fun component3(): CryptIntegerBlob = this.certificateName

    public operator fun component4(): MutPtr = this.customPolicy

    public fun copy(dwSaLifeTime: UInt = this.dwSaLifeTime, dwSaDataSize: UInt = this.dwSaDataSize, certificateName: CryptIntegerBlob = this.certificateName, customPolicy: MutPtr = this.customPolicy): RouterIkev2IfCustomConfig0 = RouterIkev2IfCustomConfig0(dwSaLifeTime = dwSaLifeTime, dwSaDataSize = dwSaDataSize, certificateName = certificateName, customPolicyCtorArg = customPolicy)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RouterIkev2IfCustomConfig0) return false
        if (this.dwSaLifeTime != other.dwSaLifeTime) return false
        if (this.dwSaDataSize != other.dwSaDataSize) return false
        if (this.certificateName != other.certificateName) return false
        if (this.customPolicy != other.customPolicy) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSaLifeTime.hashCode()
        result = 31 * result + this.dwSaDataSize.hashCode()
        result = 31 * result + this.certificateName.hashCode()
        result = 31 * result + this.customPolicy.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSaLifeTime: UInt = 0u,
            dwSaDataSize: UInt = 0u,
            certificateName: CryptIntegerBlob = CryptIntegerBlob(),
            customPolicy: MutPtr = MutPtr(0L),
        ): RouterIkev2IfCustomConfig0 =
            RouterIkev2IfCustomConfig0(
                dwSaLifeTime = dwSaLifeTime,
                dwSaDataSize = dwSaDataSize,
                certificateName = certificateName,
                customPolicyCtorArg = customPolicy,
            )
    }
}

public class RouterIkev2IfCustomConfig1 internal constructor(
    public var dwSaLifeTime: UInt,
    public var dwSaDataSize: UInt,
    public var certificateName: CryptIntegerBlob,
    customPolicyCtorArg: MutPtr,
    public var certificateHash: CryptIntegerBlob,
) {
    public var customPolicy: MutPtr = customPolicyCtorArg
        internal set

    public constructor() : this(
        dwSaLifeTime = 0u,
        dwSaDataSize = 0u,
        certificateName = CryptIntegerBlob(),
        customPolicyCtorArg = MutPtr(0L),
        certificateHash = CryptIntegerBlob(),
    )

    public operator fun component1(): UInt = this.dwSaLifeTime

    public operator fun component2(): UInt = this.dwSaDataSize

    public operator fun component3(): CryptIntegerBlob = this.certificateName

    public operator fun component4(): MutPtr = this.customPolicy

    public operator fun component5(): CryptIntegerBlob = this.certificateHash

    public fun copy(dwSaLifeTime: UInt = this.dwSaLifeTime, dwSaDataSize: UInt = this.dwSaDataSize, certificateName: CryptIntegerBlob = this.certificateName, customPolicy: MutPtr = this.customPolicy, certificateHash: CryptIntegerBlob = this.certificateHash): RouterIkev2IfCustomConfig1 = RouterIkev2IfCustomConfig1(dwSaLifeTime = dwSaLifeTime, dwSaDataSize = dwSaDataSize, certificateName = certificateName, customPolicyCtorArg = customPolicy, certificateHash = certificateHash)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RouterIkev2IfCustomConfig1) return false
        if (this.dwSaLifeTime != other.dwSaLifeTime) return false
        if (this.dwSaDataSize != other.dwSaDataSize) return false
        if (this.certificateName != other.certificateName) return false
        if (this.customPolicy != other.customPolicy) return false
        if (this.certificateHash != other.certificateHash) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSaLifeTime.hashCode()
        result = 31 * result + this.dwSaDataSize.hashCode()
        result = 31 * result + this.certificateName.hashCode()
        result = 31 * result + this.customPolicy.hashCode()
        result = 31 * result + this.certificateHash.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSaLifeTime: UInt = 0u,
            dwSaDataSize: UInt = 0u,
            certificateName: CryptIntegerBlob = CryptIntegerBlob(),
            customPolicy: MutPtr = MutPtr(0L),
            certificateHash: CryptIntegerBlob = CryptIntegerBlob(),
        ): RouterIkev2IfCustomConfig1 =
            RouterIkev2IfCustomConfig1(
                dwSaLifeTime = dwSaLifeTime,
                dwSaDataSize = dwSaDataSize,
                certificateName = certificateName,
                customPolicyCtorArg = customPolicy,
                certificateHash = certificateHash,
            )
    }
}

public class RouterIkev2IfCustomConfig2 internal constructor(
    public var dwSaLifeTime: UInt,
    public var dwSaDataSize: UInt,
    public var certificateName: CryptIntegerBlob,
    customPolicyCtorArg: MutPtr,
    public var certificateHash: CryptIntegerBlob,
    public var dwMmSaLifeTime: UInt,
    public var vpnTrafficSelectors: MprVpnTrafficSelectors,
) {
    public var customPolicy: MutPtr = customPolicyCtorArg
        internal set

    public constructor() : this(
        dwSaLifeTime = 0u,
        dwSaDataSize = 0u,
        certificateName = CryptIntegerBlob(),
        customPolicyCtorArg = MutPtr(0L),
        certificateHash = CryptIntegerBlob(),
        dwMmSaLifeTime = 0u,
        vpnTrafficSelectors = MprVpnTrafficSelectors(),
    )

    public operator fun component1(): UInt = this.dwSaLifeTime

    public operator fun component2(): UInt = this.dwSaDataSize

    public operator fun component3(): CryptIntegerBlob = this.certificateName

    public operator fun component4(): MutPtr = this.customPolicy

    public operator fun component5(): CryptIntegerBlob = this.certificateHash

    public operator fun component6(): UInt = this.dwMmSaLifeTime

    public operator fun component7(): MprVpnTrafficSelectors = this.vpnTrafficSelectors

    public fun copy(dwSaLifeTime: UInt = this.dwSaLifeTime, dwSaDataSize: UInt = this.dwSaDataSize, certificateName: CryptIntegerBlob = this.certificateName, customPolicy: MutPtr = this.customPolicy, certificateHash: CryptIntegerBlob = this.certificateHash, dwMmSaLifeTime: UInt = this.dwMmSaLifeTime, vpnTrafficSelectors: MprVpnTrafficSelectors = this.vpnTrafficSelectors): RouterIkev2IfCustomConfig2 = RouterIkev2IfCustomConfig2(dwSaLifeTime = dwSaLifeTime, dwSaDataSize = dwSaDataSize, certificateName = certificateName, customPolicyCtorArg = customPolicy, certificateHash = certificateHash, dwMmSaLifeTime = dwMmSaLifeTime, vpnTrafficSelectors = vpnTrafficSelectors)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RouterIkev2IfCustomConfig2) return false
        if (this.dwSaLifeTime != other.dwSaLifeTime) return false
        if (this.dwSaDataSize != other.dwSaDataSize) return false
        if (this.certificateName != other.certificateName) return false
        if (this.customPolicy != other.customPolicy) return false
        if (this.certificateHash != other.certificateHash) return false
        if (this.dwMmSaLifeTime != other.dwMmSaLifeTime) return false
        if (this.vpnTrafficSelectors != other.vpnTrafficSelectors) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwSaLifeTime.hashCode()
        result = 31 * result + this.dwSaDataSize.hashCode()
        result = 31 * result + this.certificateName.hashCode()
        result = 31 * result + this.customPolicy.hashCode()
        result = 31 * result + this.certificateHash.hashCode()
        result = 31 * result + this.dwMmSaLifeTime.hashCode()
        result = 31 * result + this.vpnTrafficSelectors.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwSaLifeTime: UInt = 0u,
            dwSaDataSize: UInt = 0u,
            certificateName: CryptIntegerBlob = CryptIntegerBlob(),
            customPolicy: MutPtr = MutPtr(0L),
            certificateHash: CryptIntegerBlob = CryptIntegerBlob(),
            dwMmSaLifeTime: UInt = 0u,
            vpnTrafficSelectors: MprVpnTrafficSelectors = MprVpnTrafficSelectors(),
        ): RouterIkev2IfCustomConfig2 =
            RouterIkev2IfCustomConfig2(
                dwSaLifeTime = dwSaLifeTime,
                dwSaDataSize = dwSaDataSize,
                certificateName = certificateName,
                customPolicyCtorArg = customPolicy,
                certificateHash = certificateHash,
                dwMmSaLifeTime = dwMmSaLifeTime,
                vpnTrafficSelectors = vpnTrafficSelectors,
            )
    }
}

public data class RoutingProtocolConfig(
    public var dwCallbackFlags: UInt = 0u,
    public var pfnRpfCallback: PmgmRpfCallback = null,
    public var pfnCreationAlertCallback: PmgmCreationAlertCallback = null,
    public var pfnPruneAlertCallback: PmgmPruneAlertCallback = null,
    public var pfnJoinAlertCallback: PmgmJoinAlertCallback = null,
    public var pfnWrongIfCallback: PmgmWrongIfCallback = null,
    public var pfnLocalJoinCallback: PmgmLocalJoinCallback = null,
    public var pfnLocalLeaveCallback: PmgmLocalLeaveCallback = null,
    public var pfnDisableIgmpCallback: PmgmDisableIgmpCallback = null,
    public var pfnEnableIgmpCallback: PmgmEnableIgmpCallback = null,
)

public data class RtmDestInfo(
    public var destHandle: Int = 0,
    public var destAddress: RtmNetAddress = RtmNetAddress(),
    public var lastChanged: Filetime = Filetime(),
    public var belongsToViews: UInt = 0u,
    public var numberOfViews: UInt = 0u,
    public var viewInfo: List<RtmDestInfo0> = List(1) { RtmDestInfo0() },
)

public data class RtmDestInfo0(
    public var viewId: Int = 0,
    public var numRoutes: UInt = 0u,
    public var route: Int = 0,
    public var owner: Int = 0,
    public var destFlags: UInt = 0u,
    public var holdRoute: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtmDestInfo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtmDestInfo0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): RtmDestInfo0 =
                    RtmDestInfo0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: RtmDestInfo0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.viewId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numRoutes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.route)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.owner)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.destFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 32L, value.holdRoute)
                }
            }
    }
}

public data class RtmEntityExportMethods(
    public var numMethods: UInt = 0u,
    public var methods: List<RtmEntityExportMethodFn> = emptyList(),
)

public data class RtmEntityId(
    public var anonymous: RtmEntityId0 = RtmEntityId0(),
)

public data class RtmEntityId0(
    public var anonymous: RtmEntityId00 = RtmEntityId00(),
    public var entityId: ULong = 0uL,
)

public data class RtmEntityId00(
    public var entityProtocolId: UInt = 0u,
    public var entityInstanceId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtmEntityId00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtmEntityId00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): RtmEntityId00 =
                    RtmEntityId00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: RtmEntityId00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.entityProtocolId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.entityInstanceId)
                }
            }
    }
}

public data class RtmEntityInfo(
    public var rtmInstanceId: UShort = 0u,
    public var addressFamily: UShort = 0u,
    public var entityId: RtmEntityId = RtmEntityId(),
)

public data class RtmEntityMethodInput(
    public var methodType: UInt = 0u,
    public var inputSize: UInt = 0u,
    public var inputData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtmEntityMethodInput) return false
        if (this.methodType != other.methodType) return false
        if (this.inputSize != other.inputSize) return false
        if (!this.inputData.contentEquals(other.inputData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.methodType.hashCode()
        result = 31 * result + this.inputSize.hashCode()
        result = 31 * result + this.inputData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtmEntityMethodInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtmEntityMethodInput> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): RtmEntityMethodInput =
                    RtmEntityMethodInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: RtmEntityMethodInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.methodType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.inputSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.inputData.toList())
                }
            }
    }
}

public data class RtmEntityMethodOutput(
    public var methodType: UInt = 0u,
    public var methodStatus: UInt = 0u,
    public var outputSize: UInt = 0u,
    public var outputData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtmEntityMethodOutput) return false
        if (this.methodType != other.methodType) return false
        if (this.methodStatus != other.methodStatus) return false
        if (this.outputSize != other.outputSize) return false
        if (!this.outputData.contentEquals(other.outputData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.methodType.hashCode()
        result = 31 * result + this.methodStatus.hashCode()
        result = 31 * result + this.outputSize.hashCode()
        result = 31 * result + this.outputData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtmEntityMethodOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtmEntityMethodOutput> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): RtmEntityMethodOutput =
                    RtmEntityMethodOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: RtmEntityMethodOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.methodType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.methodStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.outputSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.outputData.toList())
                }
            }
    }
}

public data class RtmNetAddress(
    public var addressFamily: UShort = 0u,
    public var numBits: UShort = 0u,
    public var addrBits: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtmNetAddress) return false
        if (this.addressFamily != other.addressFamily) return false
        if (this.numBits != other.numBits) return false
        if (!this.addrBits.contentEquals(other.addrBits)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addressFamily.hashCode()
        result = 31 * result + this.numBits.hashCode()
        result = 31 * result + this.addrBits.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtmNetAddress> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtmNetAddress> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): RtmNetAddress =
                    RtmNetAddress(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: RtmNetAddress) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.addressFamily)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.numBits)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 4L, value.addrBits.toList())
                }
            }
    }
}

public class RtmNexthopInfo internal constructor(
    public var nextHopAddress: RtmNetAddress,
    public var nextHopOwner: Int,
    public var interfaceIndex: UInt,
    public var state: UShort,
    public var flags: UShort,
    entitySpecificInfoCtorArg: MutPtr,
    public var remoteNextHop: Int,
) {
    public var entitySpecificInfo: MutPtr = entitySpecificInfoCtorArg
        internal set

    public constructor() : this(
        nextHopAddress = RtmNetAddress(),
        nextHopOwner = 0,
        interfaceIndex = 0u,
        state = 0u,
        flags = 0u,
        entitySpecificInfoCtorArg = MutPtr(0L),
        remoteNextHop = 0,
    )

    public operator fun component1(): RtmNetAddress = this.nextHopAddress

    public operator fun component2(): Int = this.nextHopOwner

    public operator fun component3(): UInt = this.interfaceIndex

    public operator fun component4(): UShort = this.state

    public operator fun component5(): UShort = this.flags

    public operator fun component6(): MutPtr = this.entitySpecificInfo

    public operator fun component7(): Int = this.remoteNextHop

    public fun copy(nextHopAddress: RtmNetAddress = this.nextHopAddress, nextHopOwner: Int = this.nextHopOwner, interfaceIndex: UInt = this.interfaceIndex, state: UShort = this.state, flags: UShort = this.flags, entitySpecificInfo: MutPtr = this.entitySpecificInfo, remoteNextHop: Int = this.remoteNextHop): RtmNexthopInfo = RtmNexthopInfo(nextHopAddress = nextHopAddress, nextHopOwner = nextHopOwner, interfaceIndex = interfaceIndex, state = state, flags = flags, entitySpecificInfoCtorArg = entitySpecificInfo, remoteNextHop = remoteNextHop)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtmNexthopInfo) return false
        if (this.nextHopAddress != other.nextHopAddress) return false
        if (this.nextHopOwner != other.nextHopOwner) return false
        if (this.interfaceIndex != other.interfaceIndex) return false
        if (this.state != other.state) return false
        if (this.flags != other.flags) return false
        if (this.entitySpecificInfo != other.entitySpecificInfo) return false
        if (this.remoteNextHop != other.remoteNextHop) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nextHopAddress.hashCode()
        result = 31 * result + this.nextHopOwner.hashCode()
        result = 31 * result + this.interfaceIndex.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.entitySpecificInfo.hashCode()
        result = 31 * result + this.remoteNextHop.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtmNexthopInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtmNexthopInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): RtmNexthopInfo =
                    RtmNexthopInfo(
                        (RtmNetAddress.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 38L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: RtmNexthopInfo) {
                    (RtmNetAddress.typeLayout()).writeNative(addr, value.nextHopAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 24L, value.nextHopOwner)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.interfaceIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 36L, value.state)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 38L, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.entitySpecificInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 48L, value.remoteNextHop)
                }
            }

        public operator fun invoke(
            nextHopAddress: RtmNetAddress = RtmNetAddress(),
            nextHopOwner: Int = 0,
            interfaceIndex: UInt = 0u,
            state: UShort = 0u,
            flags: UShort = 0u,
            entitySpecificInfo: MutPtr = MutPtr(0L),
            remoteNextHop: Int = 0,
        ): RtmNexthopInfo =
            RtmNexthopInfo(
                nextHopAddress = nextHopAddress,
                nextHopOwner = nextHopOwner,
                interfaceIndex = interfaceIndex,
                state = state,
                flags = flags,
                entitySpecificInfoCtorArg = entitySpecificInfo,
                remoteNextHop = remoteNextHop,
            )
    }
}

public data class RtmNexthopList(
    public var numNextHops: UShort = 0u,
    public var nextHops: IntArray = IntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtmNexthopList) return false
        if (this.numNextHops != other.numNextHops) return false
        if (!this.nextHops.contentEquals(other.nextHops)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numNextHops.hashCode()
        result = 31 * result + this.nextHops.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtmNexthopList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtmNexthopList> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): RtmNexthopList =
                    RtmNexthopList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64, (1).toInt())
                        ).readNative(addr + 8L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: RtmNexthopList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.numNextHops)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64, (1).toInt())
                    ).writeNative(addr + 8L, value.nextHops.toList())
                }
            }
    }
}

public data class RtmPrefInfo(
    public var metric: UInt = 0u,
    public var preference: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtmPrefInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtmPrefInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): RtmPrefInfo =
                    RtmPrefInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: RtmPrefInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.metric)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.preference)
                }
            }
    }
}

public data class RtmRegnProfile(
    public var maxNextHopsInRoute: UInt = 0u,
    public var maxHandlesInEnum: UInt = 0u,
    public var viewsSupported: UInt = 0u,
    public var numberOfViews: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtmRegnProfile> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtmRegnProfile> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): RtmRegnProfile =
                    RtmRegnProfile(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: RtmRegnProfile) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.maxNextHopsInRoute)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxHandlesInEnum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.viewsSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.numberOfViews)
                }
            }
    }
}

public class RtmRouteInfo internal constructor(
    public var destHandle: Int,
    public var routeOwner: Int,
    public var neighbour: Int,
    public var state: UByte,
    public var flags1: UByte,
    public var flags: UShort,
    public var prefInfo: RtmPrefInfo,
    public var belongsToViews: UInt,
    entitySpecificInfoCtorArg: MutPtr,
    public var nextHopsList: RtmNexthopList,
) {
    public var entitySpecificInfo: MutPtr = entitySpecificInfoCtorArg
        internal set

    public constructor() : this(
        destHandle = 0,
        routeOwner = 0,
        neighbour = 0,
        state = 0u,
        flags1 = 0u,
        flags = 0u,
        prefInfo = RtmPrefInfo(),
        belongsToViews = 0u,
        entitySpecificInfoCtorArg = MutPtr(0L),
        nextHopsList = RtmNexthopList(),
    )

    public operator fun component1(): Int = this.destHandle

    public operator fun component2(): Int = this.routeOwner

    public operator fun component3(): Int = this.neighbour

    public operator fun component4(): UByte = this.state

    public operator fun component5(): UByte = this.flags1

    public operator fun component6(): UShort = this.flags

    public operator fun component7(): RtmPrefInfo = this.prefInfo

    public operator fun component8(): UInt = this.belongsToViews

    public operator fun component9(): MutPtr = this.entitySpecificInfo

    public operator fun component10(): RtmNexthopList = this.nextHopsList

    public fun copy(destHandle: Int = this.destHandle, routeOwner: Int = this.routeOwner, neighbour: Int = this.neighbour, state: UByte = this.state, flags1: UByte = this.flags1, flags: UShort = this.flags, prefInfo: RtmPrefInfo = this.prefInfo, belongsToViews: UInt = this.belongsToViews, entitySpecificInfo: MutPtr = this.entitySpecificInfo, nextHopsList: RtmNexthopList = this.nextHopsList): RtmRouteInfo = RtmRouteInfo(destHandle = destHandle, routeOwner = routeOwner, neighbour = neighbour, state = state, flags1 = flags1, flags = flags, prefInfo = prefInfo, belongsToViews = belongsToViews, entitySpecificInfoCtorArg = entitySpecificInfo, nextHopsList = nextHopsList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtmRouteInfo) return false
        if (this.destHandle != other.destHandle) return false
        if (this.routeOwner != other.routeOwner) return false
        if (this.neighbour != other.neighbour) return false
        if (this.state != other.state) return false
        if (this.flags1 != other.flags1) return false
        if (this.flags != other.flags) return false
        if (this.prefInfo != other.prefInfo) return false
        if (this.belongsToViews != other.belongsToViews) return false
        if (this.entitySpecificInfo != other.entitySpecificInfo) return false
        if (this.nextHopsList != other.nextHopsList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.destHandle.hashCode()
        result = 31 * result + this.routeOwner.hashCode()
        result = 31 * result + this.neighbour.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.flags1.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.prefInfo.hashCode()
        result = 31 * result + this.belongsToViews.hashCode()
        result = 31 * result + this.entitySpecificInfo.hashCode()
        result = 31 * result + this.nextHopsList.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtmRouteInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtmRouteInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): RtmRouteInfo =
                    RtmRouteInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 25L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 26L),
                        (RtmPrefInfo.typeLayout()).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                        (RtmNexthopList.typeLayout()).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: RtmRouteInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.destHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.routeOwner)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.neighbour)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 24L, value.state)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 25L, value.flags1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 26L, value.flags)
                    (RtmPrefInfo.typeLayout()).writeNative(addr + 28L, value.prefInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.belongsToViews)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.entitySpecificInfo)
                    (RtmNexthopList.typeLayout()).writeNative(addr + 48L, value.nextHopsList)
                }
            }

        public operator fun invoke(
            destHandle: Int = 0,
            routeOwner: Int = 0,
            neighbour: Int = 0,
            state: UByte = 0u,
            flags1: UByte = 0u,
            flags: UShort = 0u,
            prefInfo: RtmPrefInfo = RtmPrefInfo(),
            belongsToViews: UInt = 0u,
            entitySpecificInfo: MutPtr = MutPtr(0L),
            nextHopsList: RtmNexthopList = RtmNexthopList(),
        ): RtmRouteInfo =
            RtmRouteInfo(
                destHandle = destHandle,
                routeOwner = routeOwner,
                neighbour = neighbour,
                state = state,
                flags1 = flags1,
                flags = flags,
                prefInfo = prefInfo,
                belongsToViews = belongsToViews,
                entitySpecificInfoCtorArg = entitySpecificInfo,
                nextHopsList = nextHopsList,
            )
    }
}

public data class SecurityMessage(
    public var dwMsgId: SecurityMessageMsgId = 0u,
    public var hPort: Int = 0,
    public var dwError: UInt = 0u,
    public var userName: ByteArray = ByteArray(257),
    public var domain: ByteArray = ByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SecurityMessage) return false
        if (this.dwMsgId != other.dwMsgId) return false
        if (this.hPort != other.hPort) return false
        if (this.dwError != other.dwError) return false
        if (!this.userName.contentEquals(other.userName)) return false
        if (!this.domain.contentEquals(other.domain)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwMsgId.hashCode()
        result = 31 * result + this.hPort.hashCode()
        result = 31 * result + this.dwError.hashCode()
        result = 31 * result + this.userName.contentHashCode()
        result = 31 * result + this.domain.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecurityMessage> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SecurityMessage> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 296L
                override fun readNative(addr: Long): SecurityMessage =
                    SecurityMessage(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (257).toInt())
                        ).readNative(addr + 20L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                        ).readNative(addr + 277L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: SecurityMessage) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwMsgId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.hPort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwError)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (257).toInt())
                    ).writeNative(addr + 20L, value.userName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                    ).writeNative(addr + 277L, value.domain.toList())
                }
            }
    }
}

public data class SourceGroupEntry(
    public var dwSourceAddr: UInt = 0u,
    public var dwSourceMask: UInt = 0u,
    public var dwGroupAddr: UInt = 0u,
    public var dwGroupMask: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SourceGroupEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SourceGroupEntry> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SourceGroupEntry =
                    SourceGroupEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: SourceGroupEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSourceAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwSourceMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwGroupAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwGroupMask)
                }
            }
    }
}

public data class SstpCertInfo(
    public var isDefault: Bool = 0,
    public var certBlob: CryptIntegerBlob = CryptIntegerBlob(),
)

public data class SstpConfigParams(
    public var dwNumPorts: UInt = 0u,
    public var dwPortFlags: UInt = 0u,
    public var isUseHttps: Bool = 0,
    public var certAlgorithm: UInt = 0u,
    public var sstpCertDetails: SstpCertInfo = SstpCertInfo(),
)

public data class VpnTsIpAddress(
    public var type: UShort = 0u,
    public var anonymous: VpnTsIpAddress0 = VpnTsIpAddress0(),
)

public data class VpnTsIpAddress0(
    public var v4: InAddr = InAddr(),
    public var v6: In6Addr = In6Addr(),
)
