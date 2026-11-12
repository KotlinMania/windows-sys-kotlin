@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.dvd

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public data class AacsBindingNonce(
    public var bindingNonce: UByteArray = UByteArray(16),
    public var mac: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AacsBindingNonce) return false
        if (!this.bindingNonce.contentEquals(other.bindingNonce)) return false
        if (!this.mac.contentEquals(other.mac)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bindingNonce.contentHashCode()
        result = 31 * result + this.mac.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AacsBindingNonce> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AacsBindingNonce> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): AacsBindingNonce =
                    AacsBindingNonce(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: AacsBindingNonce) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.bindingNonce)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 16L, value.mac)
                }
            }
    }
}

public data class AacsCertificate(
    public var nonce: UByteArray = UByteArray(20),
    public var certificate: UByteArray = UByteArray(92),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AacsCertificate) return false
        if (!this.nonce.contentEquals(other.nonce)) return false
        if (!this.certificate.contentEquals(other.certificate)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nonce.contentHashCode()
        result = 31 * result + this.certificate.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AacsCertificate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AacsCertificate> {
                override val sizeBytes: Long = 112L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): AacsCertificate =
                    AacsCertificate(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (92).toInt())
                        ).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: AacsCertificate) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                    ).writeNative(addr, value.nonce)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (92).toInt())
                    ).writeNative(addr + 20L, value.certificate)
                }
            }
    }
}

public data class AacsChallengeKey(
    public var ellipticCurvePoint: UByteArray = UByteArray(40),
    public var signature: UByteArray = UByteArray(40),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AacsChallengeKey) return false
        if (!this.ellipticCurvePoint.contentEquals(other.ellipticCurvePoint)) return false
        if (!this.signature.contentEquals(other.signature)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ellipticCurvePoint.contentHashCode()
        result = 31 * result + this.signature.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AacsChallengeKey> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AacsChallengeKey> {
                override val sizeBytes: Long = 80L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): AacsChallengeKey =
                    AacsChallengeKey(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (40).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (40).toInt())
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: AacsChallengeKey) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (40).toInt())
                    ).writeNative(addr, value.ellipticCurvePoint)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (40).toInt())
                    ).writeNative(addr + 40L, value.signature)
                }
            }
    }
}

public data class AacsMediaId(
    public var mediaID: UByteArray = UByteArray(16),
    public var mac: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AacsMediaId) return false
        if (!this.mediaID.contentEquals(other.mediaID)) return false
        if (!this.mac.contentEquals(other.mac)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mediaID.contentHashCode()
        result = 31 * result + this.mac.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AacsMediaId> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AacsMediaId> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): AacsMediaId =
                    AacsMediaId(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: AacsMediaId) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.mediaID)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 16L, value.mac)
                }
            }
    }
}

public data class AacsReadBindingNonce(
    public var sessionId: UInt = 0u,
    public var numberOfSectors: UInt = 0u,
    public var startLba: ULong = 0uL,
    public var anonymous: AacsReadBindingNonce0 = AacsReadBindingNonce0(),
)

public class AacsReadBindingNonce0 internal constructor(
    handleCtorArg: Handle,
    public var forceStructureLengthToMatch64bit: ULong,
) {
    public var handle: Handle = handleCtorArg
        internal set

    public constructor() : this(
        handleCtorArg = MutPtr(0L),
        forceStructureLengthToMatch64bit = 0uL,
    )

    public operator fun component1(): Handle = this.handle

    public operator fun component2(): ULong = this.forceStructureLengthToMatch64bit

    public fun copy(handle: Handle = this.handle, forceStructureLengthToMatch64bit: ULong = this.forceStructureLengthToMatch64bit): AacsReadBindingNonce0 = AacsReadBindingNonce0(handleCtorArg = handle, forceStructureLengthToMatch64bit = forceStructureLengthToMatch64bit)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AacsReadBindingNonce0) return false
        if (this.handle != other.handle) return false
        if (this.forceStructureLengthToMatch64bit != other.forceStructureLengthToMatch64bit) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.handle.hashCode()
        result = 31 * result + this.forceStructureLengthToMatch64bit.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            handle: Handle = MutPtr(0L),
            forceStructureLengthToMatch64bit: ULong = 0uL,
        ): AacsReadBindingNonce0 =
            AacsReadBindingNonce0(
                handleCtorArg = handle,
                forceStructureLengthToMatch64bit = forceStructureLengthToMatch64bit,
            )
    }
}

public data class AacsSendCertificate(
    public var sessionId: UInt = 0u,
    public var certificate: AacsCertificate = AacsCertificate(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AacsSendCertificate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AacsSendCertificate> {
                override val sizeBytes: Long = 116L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): AacsSendCertificate =
                    AacsSendCertificate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (AacsCertificate.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: AacsSendCertificate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sessionId)
                    (AacsCertificate.typeLayout()).writeNative(addr + 4L, value.certificate)
                }
            }
    }
}

public data class AacsSendChallengeKey(
    public var sessionId: UInt = 0u,
    public var challengeKey: AacsChallengeKey = AacsChallengeKey(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AacsSendChallengeKey> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AacsSendChallengeKey> {
                override val sizeBytes: Long = 84L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): AacsSendChallengeKey =
                    AacsSendChallengeKey(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (AacsChallengeKey.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: AacsSendChallengeKey) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sessionId)
                    (AacsChallengeKey.typeLayout()).writeNative(addr + 4L, value.challengeKey)
                }
            }
    }
}

public data class AacsSerialNumber(
    public var prerecordedSerialNumber: UByteArray = UByteArray(16),
    public var mac: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AacsSerialNumber) return false
        if (!this.prerecordedSerialNumber.contentEquals(other.prerecordedSerialNumber)) return false
        if (!this.mac.contentEquals(other.mac)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.prerecordedSerialNumber.contentHashCode()
        result = 31 * result + this.mac.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AacsSerialNumber> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AacsSerialNumber> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): AacsSerialNumber =
                    AacsSerialNumber(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: AacsSerialNumber) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.prerecordedSerialNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 16L, value.mac)
                }
            }
    }
}

public data class AacsVolumeId(
    public var volumeID: UByteArray = UByteArray(16),
    public var mac: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AacsVolumeId) return false
        if (!this.volumeID.contentEquals(other.volumeID)) return false
        if (!this.mac.contentEquals(other.mac)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.volumeID.contentHashCode()
        result = 31 * result + this.mac.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AacsVolumeId> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AacsVolumeId> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): AacsVolumeId =
                    AacsVolumeId(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: AacsVolumeId) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.volumeID)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 16L, value.mac)
                }
            }
    }
}

public data class BdDiscWriteProtectPac(
    public var header: BdPacHeader = BdPacHeader(),
    public var knownPACEntireDiscFlags: UByte = 0u,
    public var reserved1: UByteArray = UByteArray(3),
    public var writeProtectControlByte: UByte = 0u,
    public var reserved2: UByteArray = UByteArray(7),
    public var writeProtectPassword: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BdDiscWriteProtectPac) return false
        if (this.header != other.header) return false
        if (this.knownPACEntireDiscFlags != other.knownPACEntireDiscFlags) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.writeProtectControlByte != other.writeProtectControlByte) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        if (!this.writeProtectPassword.contentEquals(other.writeProtectPassword)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.knownPACEntireDiscFlags.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.writeProtectControlByte.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        result = 31 * result + this.writeProtectPassword.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BdDiscWriteProtectPac> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BdDiscWriteProtectPac> {
                override val sizeBytes: Long = 428L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): BdDiscWriteProtectPac =
                    BdDiscWriteProtectPac(
                        (BdPacHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 384L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 385L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 388L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (7).toInt())
                        ).readNative(addr + 389L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 396L),
                    )
                override fun writeNative(addr: Long, value: BdDiscWriteProtectPac) {
                    (BdPacHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 384L, value.knownPACEntireDiscFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 385L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 388L, value.writeProtectControlByte)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (7).toInt())
                    ).writeNative(addr + 389L, value.reserved2)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 396L, value.writeProtectPassword)
                }
            }
    }
}

public data class BdPacHeader(
    public var pACId: UByteArray = UByteArray(3),
    public var pACFormatNumber: UByte = 0u,
    public var pACUpdateCount: UByteArray = UByteArray(4),
    public var unknownPACRules: UByteArray = UByteArray(4),
    public var unkownPACEntireDiscFlag: UByte = 0u,
    public var reserved1: UByteArray = UByteArray(2),
    public var numberOfSegments: UByte = 0u,
    public var segments: UByteArray = UByteArray(256),
    public var reserved2: UByteArray = UByteArray(112),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BdPacHeader) return false
        if (!this.pACId.contentEquals(other.pACId)) return false
        if (this.pACFormatNumber != other.pACFormatNumber) return false
        if (!this.pACUpdateCount.contentEquals(other.pACUpdateCount)) return false
        if (!this.unknownPACRules.contentEquals(other.unknownPACRules)) return false
        if (this.unkownPACEntireDiscFlag != other.unkownPACEntireDiscFlag) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.numberOfSegments != other.numberOfSegments) return false
        if (!this.segments.contentEquals(other.segments)) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pACId.contentHashCode()
        result = 31 * result + this.pACFormatNumber.hashCode()
        result = 31 * result + this.pACUpdateCount.contentHashCode()
        result = 31 * result + this.unknownPACRules.contentHashCode()
        result = 31 * result + this.unkownPACEntireDiscFlag.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.numberOfSegments.hashCode()
        result = 31 * result + this.segments.contentHashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BdPacHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BdPacHeader> {
                override val sizeBytes: Long = 384L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): BdPacHeader =
                    BdPacHeader(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 13L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 15L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (112).toInt())
                        ).readNative(addr + 272L),
                    )
                override fun writeNative(addr: Long, value: BdPacHeader) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr, value.pACId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.pACFormatNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 4L, value.pACUpdateCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 8L, value.unknownPACRules)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.unkownPACEntireDiscFlag)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 13L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 15L, value.numberOfSegments)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                    ).writeNative(addr + 16L, value.segments)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (112).toInt())
                    ).writeNative(addr + 272L, value.reserved2)
                }
            }
    }
}

public data class DvdAsf(
    public var reserved0: UByteArray = UByteArray(3),
    public var bitfield: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdAsf) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (this.bitfield != other.bitfield) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved0.contentHashCode()
        result = 31 * result + this.bitfield.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdAsf> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdAsf> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdAsf =
                    DvdAsf(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: DvdAsf) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr, value.reserved0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.bitfield)
                }
            }
    }
}

public data class DvdBcaDescriptor(
    public var bCAInformation: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdBcaDescriptor) return false
        if (!this.bCAInformation.contentEquals(other.bCAInformation)) return false
        return true
    }

    override fun hashCode(): Int = this.bCAInformation.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdBcaDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdBcaDescriptor> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdBcaDescriptor =
                    DvdBcaDescriptor(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DvdBcaDescriptor) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr, value.bCAInformation)
                }
            }
    }
}

public data class DvdBdSpareAreaInformation(
    public var reserved1: UByteArray = UByteArray(4),
    public var numberOfFreeSpareBlocks: UByteArray = UByteArray(4),
    public var numberOfAllocatedSpareBlocks: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdBdSpareAreaInformation) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (!this.numberOfFreeSpareBlocks.contentEquals(other.numberOfFreeSpareBlocks)) return false
        if (!this.numberOfAllocatedSpareBlocks.contentEquals(other.numberOfAllocatedSpareBlocks)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.contentHashCode()
        result = 31 * result + this.numberOfFreeSpareBlocks.contentHashCode()
        result = 31 * result + this.numberOfAllocatedSpareBlocks.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdBdSpareAreaInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdBdSpareAreaInformation> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdBdSpareAreaInformation =
                    DvdBdSpareAreaInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DvdBdSpareAreaInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr, value.reserved1)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 4L, value.numberOfFreeSpareBlocks)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 8L, value.numberOfAllocatedSpareBlocks)
                }
            }
    }
}

public data class DvdCopyrightDescriptor(
    public var copyrightProtectionType: UByte = 0u,
    public var regionManagementInformation: UByte = 0u,
    public var reserved: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdCopyrightDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdCopyrightDescriptor> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdCopyrightDescriptor =
                    DvdCopyrightDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: DvdCopyrightDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.copyrightProtectionType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.regionManagementInformation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved)
                }
            }
    }
}

public data class DvdCopyrightManagementDescriptor(
    public var anonymous: DvdCopyrightManagementDescriptor0 = DvdCopyrightManagementDescriptor0(),
    public var reserved0: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdCopyrightManagementDescriptor) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        return result
    }
}

public data class DvdCopyrightManagementDescriptor0(
    public var dvdrom: DvdCopyrightManagementDescriptor00 = DvdCopyrightManagementDescriptor00(),
    public var dvdRecordableVersion1: DvdCopyrightManagementDescriptor01 = DvdCopyrightManagementDescriptor01(),
    public var dvdram: DvdCopyrightManagementDescriptor02 = DvdCopyrightManagementDescriptor02(),
    public var dvdRecordable: DvdCopyrightManagementDescriptor03 = DvdCopyrightManagementDescriptor03(),
    public var cprMai: UByte = 0u,
)

public data class DvdCopyrightManagementDescriptor01(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdCopyrightManagementDescriptor01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdCopyrightManagementDescriptor01> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdCopyrightManagementDescriptor01 =
                    DvdCopyrightManagementDescriptor01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DvdCopyrightManagementDescriptor01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DvdCopyrightManagementDescriptor03(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdCopyrightManagementDescriptor03> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdCopyrightManagementDescriptor03> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdCopyrightManagementDescriptor03 =
                    DvdCopyrightManagementDescriptor03(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DvdCopyrightManagementDescriptor03) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DvdCopyrightManagementDescriptor02(
    public var reserved0003: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdCopyrightManagementDescriptor02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdCopyrightManagementDescriptor02> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdCopyrightManagementDescriptor02 =
                    DvdCopyrightManagementDescriptor02(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DvdCopyrightManagementDescriptor02) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.reserved0003)
                }
            }
    }
}

public data class DvdCopyrightManagementDescriptor00(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdCopyrightManagementDescriptor00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdCopyrightManagementDescriptor00> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdCopyrightManagementDescriptor00 =
                    DvdCopyrightManagementDescriptor00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DvdCopyrightManagementDescriptor00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DvdCopyProtectKey(
    public var keyLength: UInt = 0u,
    public var sessionId: UInt = 0u,
    public var keyType: DvdKeyType = 0,
    public var keyFlags: UInt = 0u,
    public var parameters: DvdCopyProtectKey0 = DvdCopyProtectKey0(),
    public var keyData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdCopyProtectKey) return false
        if (this.keyLength != other.keyLength) return false
        if (this.sessionId != other.sessionId) return false
        if (this.keyType != other.keyType) return false
        if (this.keyFlags != other.keyFlags) return false
        if (this.parameters != other.parameters) return false
        if (!this.keyData.contentEquals(other.keyData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.keyLength.hashCode()
        result = 31 * result + this.sessionId.hashCode()
        result = 31 * result + this.keyType.hashCode()
        result = 31 * result + this.keyFlags.hashCode()
        result = 31 * result + this.parameters.hashCode()
        result = 31 * result + this.keyData.contentHashCode()
        return result
    }
}

public class DvdCopyProtectKey0 internal constructor(
    fileHandleCtorArg: Handle,
    public var titleOffset: Long,
) {
    public var fileHandle: Handle = fileHandleCtorArg
        internal set

    public constructor() : this(
        fileHandleCtorArg = MutPtr(0L),
        titleOffset = 0L,
    )

    public operator fun component1(): Handle = this.fileHandle

    public operator fun component2(): Long = this.titleOffset

    public fun copy(fileHandle: Handle = this.fileHandle, titleOffset: Long = this.titleOffset): DvdCopyProtectKey0 = DvdCopyProtectKey0(fileHandleCtorArg = fileHandle, titleOffset = titleOffset)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdCopyProtectKey0) return false
        if (this.fileHandle != other.fileHandle) return false
        if (this.titleOffset != other.titleOffset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fileHandle.hashCode()
        result = 31 * result + this.titleOffset.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fileHandle: Handle = MutPtr(0L),
            titleOffset: Long = 0L,
        ): DvdCopyProtectKey0 =
            DvdCopyProtectKey0(
                fileHandleCtorArg = fileHandle,
                titleOffset = titleOffset,
            )
    }
}

public data class DvdDescriptorHeader(
    public var length: UShort = 0u,
    public var reserved: UByteArray = UByteArray(2),
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdDescriptorHeader) return false
        if (this.length != other.length) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdDescriptorHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdDescriptorHeader> {
                override val sizeBytes: Long = 5L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdDescriptorHeader =
                    DvdDescriptorHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DvdDescriptorHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 2L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.data)
                }
            }
    }
}

public data class DvdDiscControlBlockHeader(
    public var contentDescriptor: UByteArray = UByteArray(4),
    public var prohibitedActions: DvdDiscControlBlockHeader0 = DvdDiscControlBlockHeader0(),
    public var vendorId: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdDiscControlBlockHeader) return false
        if (!this.contentDescriptor.contentEquals(other.contentDescriptor)) return false
        if (this.prohibitedActions != other.prohibitedActions) return false
        if (!this.vendorId.contentEquals(other.vendorId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.contentDescriptor.contentHashCode()
        result = 31 * result + this.prohibitedActions.hashCode()
        result = 31 * result + this.vendorId.contentHashCode()
        return result
    }
}

public data class DvdDiscControlBlockHeader0(
    public var anonymous: DvdDiscControlBlockHeader00 = DvdDiscControlBlockHeader00(),
    public var asByte: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdDiscControlBlockHeader0) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.asByte.contentEquals(other.asByte)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.asByte.contentHashCode()
        return result
    }
}

public data class DvdDiscControlBlockHeader00(
    public var reservedDoNotUseUseAsByteInstead0: UByteArray = UByteArray(3),
    public var bitfield: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdDiscControlBlockHeader00) return false
        if (!this.reservedDoNotUseUseAsByteInstead0.contentEquals(other.reservedDoNotUseUseAsByteInstead0)) return false
        if (this.bitfield != other.bitfield) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reservedDoNotUseUseAsByteInstead0.contentHashCode()
        result = 31 * result + this.bitfield.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdDiscControlBlockHeader00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdDiscControlBlockHeader00> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdDiscControlBlockHeader00 =
                    DvdDiscControlBlockHeader00(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: DvdDiscControlBlockHeader00) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr, value.reservedDoNotUseUseAsByteInstead0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.bitfield)
                }
            }
    }
}

public data class DvdDiscControlBlockList(
    public var header: DvdDiscControlBlockHeader = DvdDiscControlBlockHeader(),
    public var reserved0: UByte = 0u,
    public var readabldDCBs: UByte = 0u,
    public var reserved1: UByte = 0u,
    public var writableDCBs: UByte = 0u,
    public var dcbs: List<DvdDiscControlBlockListDcb> = List(1) { DvdDiscControlBlockListDcb() },
)

public data class DvdDiscControlBlockListDcb(
    public var dcbIdentifier: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdDiscControlBlockListDcb) return false
        if (!this.dcbIdentifier.contentEquals(other.dcbIdentifier)) return false
        return true
    }

    override fun hashCode(): Int = this.dcbIdentifier.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdDiscControlBlockListDcb> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdDiscControlBlockListDcb> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdDiscControlBlockListDcb =
                    DvdDiscControlBlockListDcb(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DvdDiscControlBlockListDcb) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr, value.dcbIdentifier)
                }
            }
    }
}

public data class DvdDiscControlBlockSession(
    public var header: DvdDiscControlBlockHeader = DvdDiscControlBlockHeader(),
    public var sessionNumber: UByteArray = UByteArray(2),
    public var reserved0: UByteArray = UByteArray(22),
    public var discID: UByteArray = UByteArray(32),
    public var reserved1: UByteArray = UByteArray(32),
    public var sessionItem: List<DvdDiscControlBlockSessionItem> = List(504) { DvdDiscControlBlockSessionItem() },
    public var reserved2: UByteArray = UByteArray(24576),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdDiscControlBlockSession) return false
        if (this.header != other.header) return false
        if (!this.sessionNumber.contentEquals(other.sessionNumber)) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (!this.discID.contentEquals(other.discID)) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.sessionItem != other.sessionItem) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.sessionNumber.contentHashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        result = 31 * result + this.discID.contentHashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.sessionItem.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }
}

public data class DvdDiscControlBlockSessionItem(
    public var asByte: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdDiscControlBlockSessionItem) return false
        if (!this.asByte.contentEquals(other.asByte)) return false
        return true
    }

    override fun hashCode(): Int = this.asByte.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdDiscControlBlockSessionItem> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdDiscControlBlockSessionItem> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdDiscControlBlockSessionItem =
                    DvdDiscControlBlockSessionItem(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DvdDiscControlBlockSessionItem) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.asByte)
                }
            }
    }
}

public data class DvdDiscControlBlockWriteInhibit(
    public var header: DvdDiscControlBlockHeader = DvdDiscControlBlockHeader(),
    public var updateCount: UByteArray = UByteArray(4),
    public var writeProtectActions: DvdDiscControlBlockWriteInhibit0 = DvdDiscControlBlockWriteInhibit0(),
    public var reserved0: UByteArray = UByteArray(16),
    public var updatePassword: UByteArray = UByteArray(32),
    public var reserved1: UByteArray = UByteArray(32672),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdDiscControlBlockWriteInhibit) return false
        if (this.header != other.header) return false
        if (!this.updateCount.contentEquals(other.updateCount)) return false
        if (this.writeProtectActions != other.writeProtectActions) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (!this.updatePassword.contentEquals(other.updatePassword)) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.updateCount.contentHashCode()
        result = 31 * result + this.writeProtectActions.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        result = 31 * result + this.updatePassword.contentHashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        return result
    }
}

public data class DvdDiscControlBlockWriteInhibit0(
    public var anonymous: DvdDiscControlBlockWriteInhibit00 = DvdDiscControlBlockWriteInhibit00(),
    public var asByte: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdDiscControlBlockWriteInhibit0) return false
        if (this.anonymous != other.anonymous) return false
        if (!this.asByte.contentEquals(other.asByte)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.asByte.contentHashCode()
        return result
    }
}

public data class DvdDiscControlBlockWriteInhibit00(
    public var reservedDoNotUseUseAsByteInstead0: UByteArray = UByteArray(3),
    public var bitfield: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdDiscControlBlockWriteInhibit00) return false
        if (!this.reservedDoNotUseUseAsByteInstead0.contentEquals(other.reservedDoNotUseUseAsByteInstead0)) return false
        if (this.bitfield != other.bitfield) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reservedDoNotUseUseAsByteInstead0.contentHashCode()
        result = 31 * result + this.bitfield.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdDiscControlBlockWriteInhibit00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdDiscControlBlockWriteInhibit00> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdDiscControlBlockWriteInhibit00 =
                    DvdDiscControlBlockWriteInhibit00(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: DvdDiscControlBlockWriteInhibit00) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr, value.reservedDoNotUseUseAsByteInstead0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.bitfield)
                }
            }
    }
}

public data class DvdDiskKeyDescriptor(
    public var diskKeyData: UByteArray = UByteArray(2048),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdDiskKeyDescriptor) return false
        if (!this.diskKeyData.contentEquals(other.diskKeyData)) return false
        return true
    }

    override fun hashCode(): Int = this.diskKeyData.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdDiskKeyDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdDiskKeyDescriptor> {
                override val sizeBytes: Long = 2048L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdDiskKeyDescriptor =
                    DvdDiskKeyDescriptor(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2048).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DvdDiskKeyDescriptor) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2048).toInt())
                    ).writeNative(addr, value.diskKeyData)
                }
            }
    }
}

public data class DvdDualLayerJumpIntervalSize(
    public var reserved1: UByteArray = UByteArray(4),
    public var jumpIntervalSize: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdDualLayerJumpIntervalSize) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (!this.jumpIntervalSize.contentEquals(other.jumpIntervalSize)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.contentHashCode()
        result = 31 * result + this.jumpIntervalSize.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdDualLayerJumpIntervalSize> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdDualLayerJumpIntervalSize> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdDualLayerJumpIntervalSize =
                    DvdDualLayerJumpIntervalSize(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DvdDualLayerJumpIntervalSize) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr, value.reserved1)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 4L, value.jumpIntervalSize)
                }
            }
    }
}

public data class DvdDualLayerManualLayerJump(
    public var reserved1: UByteArray = UByteArray(4),
    public var manualJumpLayerAddress: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdDualLayerManualLayerJump) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (!this.manualJumpLayerAddress.contentEquals(other.manualJumpLayerAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.contentHashCode()
        result = 31 * result + this.manualJumpLayerAddress.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdDualLayerManualLayerJump> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdDualLayerManualLayerJump> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdDualLayerManualLayerJump =
                    DvdDualLayerManualLayerJump(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DvdDualLayerManualLayerJump) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr, value.reserved1)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 4L, value.manualJumpLayerAddress)
                }
            }
    }
}

public data class DvdDualLayerMiddleZoneStartAddress(
    public var bitfield: UByte = 0u,
    public var reserved1: UByteArray = UByteArray(3),
    public var shiftedMiddleAreaStartAddress: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdDualLayerMiddleZoneStartAddress) return false
        if (this.bitfield != other.bitfield) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (!this.shiftedMiddleAreaStartAddress.contentEquals(other.shiftedMiddleAreaStartAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bitfield.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.shiftedMiddleAreaStartAddress.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdDualLayerMiddleZoneStartAddress> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdDualLayerMiddleZoneStartAddress> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdDualLayerMiddleZoneStartAddress =
                    DvdDualLayerMiddleZoneStartAddress(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DvdDualLayerMiddleZoneStartAddress) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 1L, value.reserved1)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 4L, value.shiftedMiddleAreaStartAddress)
                }
            }
    }
}

public data class DvdDualLayerRecordingInformation(
    public var bitfield: UByte = 0u,
    public var reserved1: UByteArray = UByteArray(3),
    public var layer0Sectors: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdDualLayerRecordingInformation) return false
        if (this.bitfield != other.bitfield) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (!this.layer0Sectors.contentEquals(other.layer0Sectors)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bitfield.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.layer0Sectors.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdDualLayerRecordingInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdDualLayerRecordingInformation> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdDualLayerRecordingInformation =
                    DvdDualLayerRecordingInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DvdDualLayerRecordingInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 1L, value.reserved1)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 4L, value.layer0Sectors)
                }
            }
    }
}

public data class DvdDualLayerRemappingInformation(
    public var reserved1: UByteArray = UByteArray(4),
    public var remappingAddress: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdDualLayerRemappingInformation) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (!this.remappingAddress.contentEquals(other.remappingAddress)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved1.contentHashCode()
        result = 31 * result + this.remappingAddress.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdDualLayerRemappingInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdDualLayerRemappingInformation> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdDualLayerRemappingInformation =
                    DvdDualLayerRemappingInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DvdDualLayerRemappingInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr, value.reserved1)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 4L, value.remappingAddress)
                }
            }
    }
}

public data class DvdFullLayerDescriptor(
    public var commonHeader: DvdLayerDescriptor = DvdLayerDescriptor(),
    public var mediaSpecific: UByteArray = UByteArray(2031),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdFullLayerDescriptor) return false
        if (this.commonHeader != other.commonHeader) return false
        if (!this.mediaSpecific.contentEquals(other.mediaSpecific)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.commonHeader.hashCode()
        result = 31 * result + this.mediaSpecific.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdFullLayerDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdFullLayerDescriptor> {
                override val sizeBytes: Long = 2048L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdFullLayerDescriptor =
                    DvdFullLayerDescriptor(
                        (DvdLayerDescriptor.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2031).toInt())
                        ).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: DvdFullLayerDescriptor) {
                    (DvdLayerDescriptor.typeLayout()).writeNative(addr, value.commonHeader)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2031).toInt())
                    ).writeNative(addr + 17L, value.mediaSpecific)
                }
            }
    }
}

public data class DvdLayerDescriptor(
    public var bitfield1: UByte = 0u,
    public var bitfield2: UByte = 0u,
    public var bitfield3: UByte = 0u,
    public var bitfield4: UByte = 0u,
    public var startingDataSector: UInt = 0u,
    public var endDataSector: UInt = 0u,
    public var endLayerZeroSector: UInt = 0u,
    public var bitfield5: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdLayerDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdLayerDescriptor> {
                override val sizeBytes: Long = 17L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdLayerDescriptor =
                    DvdLayerDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DvdLayerDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bitfield2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.bitfield3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.bitfield4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.startingDataSector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.endDataSector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.endLayerZeroSector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.bitfield5)
                }
            }
    }
}

public data class DvdListOfRecognizedFormatLayers(
    public var typeCodeOfFormatLayer: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdListOfRecognizedFormatLayers) return false
        if (!this.typeCodeOfFormatLayer.contentEquals(other.typeCodeOfFormatLayer)) return false
        return true
    }

    override fun hashCode(): Int = this.typeCodeOfFormatLayer.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdListOfRecognizedFormatLayers> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdListOfRecognizedFormatLayers> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdListOfRecognizedFormatLayers =
                    DvdListOfRecognizedFormatLayers(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DvdListOfRecognizedFormatLayers) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr, value.typeCodeOfFormatLayer)
                }
            }
    }
}

public data class DvdListOfRecognizedFormatLayersTypeCode(
    public var numberOfRecognizedFormatLayers: UByte = 0u,
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdListOfRecognizedFormatLayersTypeCode> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdListOfRecognizedFormatLayersTypeCode> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdListOfRecognizedFormatLayersTypeCode =
                    DvdListOfRecognizedFormatLayersTypeCode(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: DvdListOfRecognizedFormatLayersTypeCode) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.numberOfRecognizedFormatLayers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bitfield)
                }
            }
    }
}

public data class DvdManufacturerDescriptor(
    public var manufacturingInformation: UByteArray = UByteArray(2048),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdManufacturerDescriptor) return false
        if (!this.manufacturingInformation.contentEquals(other.manufacturingInformation)) return false
        return true
    }

    override fun hashCode(): Int = this.manufacturingInformation.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdManufacturerDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdManufacturerDescriptor> {
                override val sizeBytes: Long = 2048L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdManufacturerDescriptor =
                    DvdManufacturerDescriptor(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2048).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DvdManufacturerDescriptor) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2048).toInt())
                    ).writeNative(addr, value.manufacturingInformation)
                }
            }
    }
}

public class DvdPrerecordedInformation(
    public var fieldId1: UByte = 0u,
    public var discApplicationCode: UByte = 0u,
    public var discPhysicalCode: UByte = 0u,
    public var lastAddressOfDataRecordableArea: UByteArray = UByteArray(3),
    public var bitfield: UByte = 0u,
    public var reserved0: UByte = 0u,
    public var fieldId2: UByte = 0u,
    public var opcSuggestedCode: UByte = 0u,
    public var wavelengthCode: UByte = 0u,
    public var writeStrategyCode: UByteArray = UByteArray(4),
    public var reserved2: UByte = 0u,
    public var fieldId3: UByte = 0u,
    public var manufacturerId3: UByteArray = UByteArray(6),
    public var reserved3: UByte = 0u,
    public var fieldId4: UByte = 0u,
    public var manufacturerId4: UByteArray = UByteArray(6),
    public var reserved4: UByte = 0u,
    public var fieldId5: UByte = 0u,
    public var manufacturerId5: UByteArray = UByteArray(6),
    public var reserved5: UByte = 0u,
    public var reserved99: UByteArray = UByteArray(24),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdPrerecordedInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdPrerecordedInformation> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdPrerecordedInformation =
                    DvdPrerecordedInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 10L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 11L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 15L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 17L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 23L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 25L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 31L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 33L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 39L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (24).toInt())
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: DvdPrerecordedInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.fieldId1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.discApplicationCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.discPhysicalCode)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 3L, value.lastAddressOfDataRecordableArea)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.reserved0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.fieldId2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.opcSuggestedCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 10L, value.wavelengthCode)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 11L, value.writeStrategyCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 15L, value.reserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.fieldId3)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 17L, value.manufacturerId3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 23L, value.reserved3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 24L, value.fieldId4)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 25L, value.manufacturerId4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 31L, value.reserved4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 32L, value.fieldId5)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 33L, value.manufacturerId5)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 39L, value.reserved5)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (24).toInt())
                    ).writeNative(addr + 40L, value.reserved99)
                }
            }
    }
}

public data class DvdRamMediumStatus(
    public var bitfield: UByte = 0u,
    public var discTypeIdentification: UByte = 0u,
    public var reserved2: UByte = 0u,
    public var mediaSpecificWriteInhibitInformation: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdRamMediumStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdRamMediumStatus> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdRamMediumStatus =
                    DvdRamMediumStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: DvdRamMediumStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.discTypeIdentification)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.reserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.mediaSpecificWriteInhibitInformation)
                }
            }
    }
}

public data class DvdRamRecordingType(
    public var bitfield: UByte = 0u,
    public var reserved2: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdRamRecordingType) return false
        if (this.bitfield != other.bitfield) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bitfield.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdRamRecordingType> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdRamRecordingType> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdRamRecordingType =
                    DvdRamRecordingType(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: DvdRamRecordingType) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 1L, value.reserved2)
                }
            }
    }
}

public data class DvdRamSpareAreaInformation(
    public var freePrimarySpareSectors: UByteArray = UByteArray(4),
    public var freeSupplementalSpareSectors: UByteArray = UByteArray(4),
    public var allocatedSupplementalSpareSectors: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdRamSpareAreaInformation) return false
        if (!this.freePrimarySpareSectors.contentEquals(other.freePrimarySpareSectors)) return false
        if (!this.freeSupplementalSpareSectors.contentEquals(other.freeSupplementalSpareSectors)) return false
        if (!this.allocatedSupplementalSpareSectors.contentEquals(other.allocatedSupplementalSpareSectors)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.freePrimarySpareSectors.contentHashCode()
        result = 31 * result + this.freeSupplementalSpareSectors.contentHashCode()
        result = 31 * result + this.allocatedSupplementalSpareSectors.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdRamSpareAreaInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdRamSpareAreaInformation> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdRamSpareAreaInformation =
                    DvdRamSpareAreaInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DvdRamSpareAreaInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr, value.freePrimarySpareSectors)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 4L, value.freeSupplementalSpareSectors)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 8L, value.allocatedSupplementalSpareSectors)
                }
            }
    }
}

public data class DvdReadStructure(
    public var blockByteOffset: Long = 0L,
    public var format: DvdStructureFormat = 0,
    public var sessionId: UInt = 0u,
    public var layerNumber: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdReadStructure> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdReadStructure> {
                override val sizeBytes: Long = 17L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdReadStructure =
                    DvdReadStructure(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DvdReadStructure) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.blockByteOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.format)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.sessionId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.layerNumber)
                }
            }
    }
}

public data class DvdRecordingManagementAreaData(
    public var lastRecordedRMASectorNumber: UByteArray = UByteArray(4),
    public var rMDBytes: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdRecordingManagementAreaData) return false
        if (!this.lastRecordedRMASectorNumber.contentEquals(other.lastRecordedRMASectorNumber)) return false
        if (!this.rMDBytes.contentEquals(other.rMDBytes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lastRecordedRMASectorNumber.contentHashCode()
        result = 31 * result + this.rMDBytes.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdRecordingManagementAreaData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdRecordingManagementAreaData> {
                override val sizeBytes: Long = 5L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdRecordingManagementAreaData =
                    DvdRecordingManagementAreaData(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DvdRecordingManagementAreaData) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr, value.lastRecordedRMASectorNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.rMDBytes)
                }
            }
    }
}

public data class DvdRegion(
    public var copySystem: UByte = 0u,
    public var regionData: UByte = 0u,
    public var systemRegion: UByte = 0u,
    public var resetCount: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdRegion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdRegion> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdRegion =
                    DvdRegion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: DvdRegion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.copySystem)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.regionData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.systemRegion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.resetCount)
                }
            }
    }
}

public data class DvdRpcKey(
    public var bitfield: UByte = 0u,
    public var regionMask: UByte = 0u,
    public var rpcScheme: UByte = 0u,
    public var reserved02: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdRpcKey> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdRpcKey> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdRpcKey =
                    DvdRpcKey(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: DvdRpcKey) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.regionMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.rpcScheme)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.reserved02)
                }
            }
    }
}

public data class DvdSetRpcKey(
    public var preferredDriveRegionCode: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdSetRpcKey) return false
        if (this.preferredDriveRegionCode != other.preferredDriveRegionCode) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.preferredDriveRegionCode.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdSetRpcKey> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdSetRpcKey> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdSetRpcKey =
                    DvdSetRpcKey(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: DvdSetRpcKey) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.preferredDriveRegionCode)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 1L, value.reserved)
                }
            }
    }
}

public data class DvdStructureListEntry(
    public var formatCode: UByte = 0u,
    public var bitfield: UByte = 0u,
    public var formatLength: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdStructureListEntry) return false
        if (this.formatCode != other.formatCode) return false
        if (this.bitfield != other.bitfield) return false
        if (!this.formatLength.contentEquals(other.formatLength)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.formatCode.hashCode()
        result = 31 * result + this.bitfield.hashCode()
        result = 31 * result + this.formatLength.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdStructureListEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdStructureListEntry> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdStructureListEntry =
                    DvdStructureListEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: DvdStructureListEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.formatCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bitfield)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 2L, value.formatLength)
                }
            }
    }
}

public data class DvdUniqueDiscIdentifier(
    public var reserved0: UByteArray = UByteArray(2),
    public var randomNumber: UByteArray = UByteArray(2),
    public var year: UByteArray = UByteArray(4),
    public var month: UByteArray = UByteArray(2),
    public var day: UByteArray = UByteArray(2),
    public var hour: UByteArray = UByteArray(2),
    public var minute: UByteArray = UByteArray(2),
    public var second: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdUniqueDiscIdentifier) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (!this.randomNumber.contentEquals(other.randomNumber)) return false
        if (!this.year.contentEquals(other.year)) return false
        if (!this.month.contentEquals(other.month)) return false
        if (!this.day.contentEquals(other.day)) return false
        if (!this.hour.contentEquals(other.hour)) return false
        if (!this.minute.contentEquals(other.minute)) return false
        if (!this.second.contentEquals(other.second)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reserved0.contentHashCode()
        result = 31 * result + this.randomNumber.contentHashCode()
        result = 31 * result + this.year.contentHashCode()
        result = 31 * result + this.month.contentHashCode()
        result = 31 * result + this.day.contentHashCode()
        result = 31 * result + this.hour.contentHashCode()
        result = 31 * result + this.minute.contentHashCode()
        result = 31 * result + this.second.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdUniqueDiscIdentifier> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdUniqueDiscIdentifier> {
                override val sizeBytes: Long = 18L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdUniqueDiscIdentifier =
                    DvdUniqueDiscIdentifier(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 10L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 14L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: DvdUniqueDiscIdentifier) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr, value.reserved0)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 2L, value.randomNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 4L, value.year)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 8L, value.month)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 10L, value.day)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 12L, value.hour)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 14L, value.minute)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 16L, value.second)
                }
            }
    }
}

public data class DvdWriteProtectionStatus(
    public var bitfield: UByte = 0u,
    public var reserved1: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DvdWriteProtectionStatus) return false
        if (this.bitfield != other.bitfield) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bitfield.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdWriteProtectionStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DvdWriteProtectionStatus> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): DvdWriteProtectionStatus =
                    DvdWriteProtectionStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: DvdWriteProtectionStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 1L, value.reserved1)
                }
            }
    }
}

public data class HdDvdRMediumStatus(
    public var bitfield: UByte = 0u,
    public var numberOfRemainingRMDsInRDZ: UByte = 0u,
    public var numberOfRemainingRMDsInCurrentRMZ: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HdDvdRMediumStatus) return false
        if (this.bitfield != other.bitfield) return false
        if (this.numberOfRemainingRMDsInRDZ != other.numberOfRemainingRMDsInRDZ) return false
        if (!this.numberOfRemainingRMDsInCurrentRMZ.contentEquals(other.numberOfRemainingRMDsInCurrentRMZ)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bitfield.hashCode()
        result = 31 * result + this.numberOfRemainingRMDsInRDZ.hashCode()
        result = 31 * result + this.numberOfRemainingRMDsInCurrentRMZ.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HdDvdRMediumStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HdDvdRMediumStatus> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): HdDvdRMediumStatus =
                    HdDvdRMediumStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: HdDvdRMediumStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.numberOfRemainingRMDsInRDZ)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 2L, value.numberOfRemainingRMDsInCurrentRMZ)
                }
            }
    }
}

public data class StorageSetReadAhead(
    public var triggerAddress: Long = 0L,
    public var targetAddress: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageSetReadAhead> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageSetReadAhead> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): StorageSetReadAhead =
                    StorageSetReadAhead(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: StorageSetReadAhead) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.triggerAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.targetAddress)
                }
            }
    }
}
