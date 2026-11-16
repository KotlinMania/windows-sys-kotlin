@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.environment

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public data class EnclaveIdentity(
    public var ownerId: UByteArray = UByteArray(32),
    public var uniqueId: UByteArray = UByteArray(32),
    public var authorId: UByteArray = UByteArray(32),
    public var familyId: UByteArray = UByteArray(16),
    public var imageId: UByteArray = UByteArray(16),
    public var enclaveSvn: UInt = 0u,
    public var secureKernelSvn: UInt = 0u,
    public var platformSvn: UInt = 0u,
    public var flags: UInt = 0u,
    public var signingLevel: UInt = 0u,
    public var enclaveType: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EnclaveIdentity) return false
        if (!this.ownerId.contentEquals(other.ownerId)) return false
        if (!this.uniqueId.contentEquals(other.uniqueId)) return false
        if (!this.authorId.contentEquals(other.authorId)) return false
        if (!this.familyId.contentEquals(other.familyId)) return false
        if (!this.imageId.contentEquals(other.imageId)) return false
        if (this.enclaveSvn != other.enclaveSvn) return false
        if (this.secureKernelSvn != other.secureKernelSvn) return false
        if (this.platformSvn != other.platformSvn) return false
        if (this.flags != other.flags) return false
        if (this.signingLevel != other.signingLevel) return false
        if (this.enclaveType != other.enclaveType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ownerId.contentHashCode()
        result = 31 * result + this.uniqueId.contentHashCode()
        result = 31 * result + this.authorId.contentHashCode()
        result = 31 * result + this.familyId.contentHashCode()
        result = 31 * result + this.imageId.contentHashCode()
        result = 31 * result + this.enclaveSvn.hashCode()
        result = 31 * result + this.secureKernelSvn.hashCode()
        result = 31 * result + this.platformSvn.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.signingLevel.hashCode()
        result = 31 * result + this.enclaveType.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EnclaveIdentity> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EnclaveIdentity> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 152L
                override fun readNative(addr: Long): EnclaveIdentity =
                    EnclaveIdentity(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 32L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 64L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 96L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 112L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 140L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 148L),
                    )
                override fun writeNative(addr: Long, value: EnclaveIdentity) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr, value.ownerId.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 32L, value.uniqueId.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 64L, value.authorId.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 96L, value.familyId.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 112L, value.imageId.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.enclaveSvn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 132L, value.secureKernelSvn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.platformSvn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 140L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 144L, value.signingLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 148L, value.enclaveType)
                }
            }
    }
}

public class EnclaveInformation internal constructor(
    public var enclaveType: UInt,
    public var reserved: UInt,
    baseAddressCtorArg: MutPtr,
    public var size: Int,
    public var identity: EnclaveIdentity,
) {
    public var baseAddress: MutPtr = baseAddressCtorArg
        internal set

    public constructor() : this(
        enclaveType = 0u,
        reserved = 0u,
        baseAddressCtorArg = MutPtr(0L),
        size = 0,
        identity = EnclaveIdentity(),
    )

    public operator fun component1(): UInt = this.enclaveType

    public operator fun component2(): UInt = this.reserved

    public operator fun component3(): MutPtr = this.baseAddress

    public operator fun component4(): Int = this.size

    public operator fun component5(): EnclaveIdentity = this.identity

    public fun copy(enclaveType: UInt = this.enclaveType, reserved: UInt = this.reserved, baseAddress: MutPtr = this.baseAddress, size: Int = this.size, identity: EnclaveIdentity = this.identity): EnclaveInformation = EnclaveInformation(enclaveType = enclaveType, reserved = reserved, baseAddressCtorArg = baseAddress, size = size, identity = identity)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EnclaveInformation) return false
        if (this.enclaveType != other.enclaveType) return false
        if (this.reserved != other.reserved) return false
        if (this.baseAddress != other.baseAddress) return false
        if (this.size != other.size) return false
        if (this.identity != other.identity) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.enclaveType.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.baseAddress.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.identity.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EnclaveInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EnclaveInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 176L
                override fun readNative(addr: Long): EnclaveInformation =
                    EnclaveInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (EnclaveIdentity.typeLayout()).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: EnclaveInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.enclaveType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.baseAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.size)
                    (EnclaveIdentity.typeLayout()).writeNative(addr + 24L, value.identity)
                }
            }

        public operator fun invoke(
            enclaveType: UInt = 0u,
            reserved: UInt = 0u,
            baseAddress: MutPtr = MutPtr(0L),
            size: Int = 0,
            identity: EnclaveIdentity = EnclaveIdentity(),
        ): EnclaveInformation =
            EnclaveInformation(
                enclaveType = enclaveType,
                reserved = reserved,
                baseAddressCtorArg = baseAddress,
                size = size,
                identity = identity,
            )
    }
}

public data class EnclaveVbsBasicKeyRequest(
    public var requestSize: UInt = 0u,
    public var flags: UInt = 0u,
    public var enclaveSVN: UInt = 0u,
    public var systemKeyID: UInt = 0u,
    public var currentSystemKeyID: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EnclaveVbsBasicKeyRequest> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EnclaveVbsBasicKeyRequest> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): EnclaveVbsBasicKeyRequest =
                    EnclaveVbsBasicKeyRequest(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: EnclaveVbsBasicKeyRequest) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.requestSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.enclaveSVN)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.systemKeyID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.currentSystemKeyID)
                }
            }
    }
}

public data class VbsBasicEnclaveExceptionAmd64(
    public var exceptionCode: UInt = 0u,
    public var numberParameters: UInt = 0u,
    public var exceptionInformation: IntArray = IntArray(3),
    public var exceptionRAX: Int = 0,
    public var exceptionRCX: Int = 0,
    public var exceptionRIP: Int = 0,
    public var exceptionRFLAGS: Int = 0,
    public var exceptionRSP: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VbsBasicEnclaveExceptionAmd64) return false
        if (this.exceptionCode != other.exceptionCode) return false
        if (this.numberParameters != other.numberParameters) return false
        if (!this.exceptionInformation.contentEquals(other.exceptionInformation)) return false
        if (this.exceptionRAX != other.exceptionRAX) return false
        if (this.exceptionRCX != other.exceptionRCX) return false
        if (this.exceptionRIP != other.exceptionRIP) return false
        if (this.exceptionRFLAGS != other.exceptionRFLAGS) return false
        if (this.exceptionRSP != other.exceptionRSP) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.exceptionCode.hashCode()
        result = 31 * result + this.numberParameters.hashCode()
        result = 31 * result + this.exceptionInformation.contentHashCode()
        result = 31 * result + this.exceptionRAX.hashCode()
        result = 31 * result + this.exceptionRCX.hashCode()
        result = 31 * result + this.exceptionRIP.hashCode()
        result = 31 * result + this.exceptionRFLAGS.hashCode()
        result = 31 * result + this.exceptionRSP.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbsBasicEnclaveExceptionAmd64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbsBasicEnclaveExceptionAmd64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): VbsBasicEnclaveExceptionAmd64 =
                    VbsBasicEnclaveExceptionAmd64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (3).toInt())
                        ).readNative(addr + 8L).toIntArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: VbsBasicEnclaveExceptionAmd64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.exceptionCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numberParameters)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (3).toInt())
                    ).writeNative(addr + 8L, value.exceptionInformation.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 32L, value.exceptionRAX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 40L, value.exceptionRCX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 48L, value.exceptionRIP)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 56L, value.exceptionRFLAGS)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 64L, value.exceptionRSP)
                }
            }
    }
}

public data class VbsBasicEnclaveSyscallPage(
    public var returnFromEnclave: VbsBasicEnclaveBasicCallReturnFromEnclave = null,
    public var returnFromException: VbsBasicEnclaveBasicCallReturnFromException = null,
    public var terminateThread: VbsBasicEnclaveBasicCallTerminateThread = null,
    public var interruptThread: VbsBasicEnclaveBasicCallInterruptThread = null,
    public var commitPages: VbsBasicEnclaveBasicCallCommitPages = null,
    public var decommitPages: VbsBasicEnclaveBasicCallDecommitPages = null,
    public var protectPages: VbsBasicEnclaveBasicCallProtectPages = null,
    public var createThread: VbsBasicEnclaveBasicCallCreateThread = null,
    public var getEnclaveInformation: VbsBasicEnclaveBasicCallGetEnclaveInformation = null,
    public var generateKey: VbsBasicEnclaveBasicCallGenerateKey = null,
    public var generateReport: VbsBasicEnclaveBasicCallGenerateReport = null,
    public var verifyReport: VbsBasicEnclaveBasicCallVerifyReport = null,
    public var generateRandomData: VbsBasicEnclaveBasicCallGenerateRandomData = null,
)

public data class VbsBasicEnclaveThreadDescriptor32(
    public var threadContext: UIntArray = UIntArray(4),
    public var entryPoint: UInt = 0u,
    public var stackPointer: UInt = 0u,
    public var exceptionEntryPoint: UInt = 0u,
    public var exceptionStack: UInt = 0u,
    public var exceptionActive: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VbsBasicEnclaveThreadDescriptor32) return false
        if (!this.threadContext.contentEquals(other.threadContext)) return false
        if (this.entryPoint != other.entryPoint) return false
        if (this.stackPointer != other.stackPointer) return false
        if (this.exceptionEntryPoint != other.exceptionEntryPoint) return false
        if (this.exceptionStack != other.exceptionStack) return false
        if (this.exceptionActive != other.exceptionActive) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.threadContext.contentHashCode()
        result = 31 * result + this.entryPoint.hashCode()
        result = 31 * result + this.stackPointer.hashCode()
        result = 31 * result + this.exceptionEntryPoint.hashCode()
        result = 31 * result + this.exceptionStack.hashCode()
        result = 31 * result + this.exceptionActive.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbsBasicEnclaveThreadDescriptor32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbsBasicEnclaveThreadDescriptor32> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): VbsBasicEnclaveThreadDescriptor32 =
                    VbsBasicEnclaveThreadDescriptor32(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr).toUIntArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: VbsBasicEnclaveThreadDescriptor32) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr, value.threadContext.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.entryPoint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.stackPointer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.exceptionEntryPoint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.exceptionStack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.exceptionActive)
                }
            }
    }
}

public data class VbsBasicEnclaveThreadDescriptor64(
    public var threadContext: ULongArray = ULongArray(4),
    public var entryPoint: ULong = 0uL,
    public var stackPointer: ULong = 0uL,
    public var exceptionEntryPoint: ULong = 0uL,
    public var exceptionStack: ULong = 0uL,
    public var exceptionActive: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VbsBasicEnclaveThreadDescriptor64) return false
        if (!this.threadContext.contentEquals(other.threadContext)) return false
        if (this.entryPoint != other.entryPoint) return false
        if (this.stackPointer != other.stackPointer) return false
        if (this.exceptionEntryPoint != other.exceptionEntryPoint) return false
        if (this.exceptionStack != other.exceptionStack) return false
        if (this.exceptionActive != other.exceptionActive) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.threadContext.contentHashCode()
        result = 31 * result + this.entryPoint.hashCode()
        result = 31 * result + this.stackPointer.hashCode()
        result = 31 * result + this.exceptionEntryPoint.hashCode()
        result = 31 * result + this.exceptionStack.hashCode()
        result = 31 * result + this.exceptionActive.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbsBasicEnclaveThreadDescriptor64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbsBasicEnclaveThreadDescriptor64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): VbsBasicEnclaveThreadDescriptor64 =
                    VbsBasicEnclaveThreadDescriptor64(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                        ).readNative(addr).toULongArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: VbsBasicEnclaveThreadDescriptor64) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                    ).writeNative(addr, value.threadContext.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.entryPoint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.stackPointer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.exceptionEntryPoint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.exceptionStack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.exceptionActive)
                }
            }
    }
}

public data class VbsEnclaveReport(
    public var reportSize: UInt = 0u,
    public var reportVersion: UInt = 0u,
    public var enclaveData: UByteArray = UByteArray(64),
    public var enclaveIdentity: EnclaveIdentity = EnclaveIdentity(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VbsEnclaveReport) return false
        if (this.reportSize != other.reportSize) return false
        if (this.reportVersion != other.reportVersion) return false
        if (!this.enclaveData.contentEquals(other.enclaveData)) return false
        if (this.enclaveIdentity != other.enclaveIdentity) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reportSize.hashCode()
        result = 31 * result + this.reportVersion.hashCode()
        result = 31 * result + this.enclaveData.contentHashCode()
        result = 31 * result + this.enclaveIdentity.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbsEnclaveReport> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbsEnclaveReport> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 224L
                override fun readNative(addr: Long): VbsEnclaveReport =
                    VbsEnclaveReport(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                        (EnclaveIdentity.typeLayout()).readNative(addr + 72L),
                    )
                override fun writeNative(addr: Long, value: VbsEnclaveReport) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.reportSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reportVersion)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                    ).writeNative(addr + 8L, value.enclaveData.toList())
                    (EnclaveIdentity.typeLayout()).writeNative(addr + 72L, value.enclaveIdentity)
                }
            }
    }
}

public data class VbsEnclaveReportModule(
    public var header: VbsEnclaveReportVardataHeader = VbsEnclaveReportVardataHeader(),
    public var uniqueId: UByteArray = UByteArray(32),
    public var authorId: UByteArray = UByteArray(32),
    public var familyId: UByteArray = UByteArray(16),
    public var imageId: UByteArray = UByteArray(16),
    public var svn: UInt = 0u,
    public var moduleName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VbsEnclaveReportModule) return false
        if (this.header != other.header) return false
        if (!this.uniqueId.contentEquals(other.uniqueId)) return false
        if (!this.authorId.contentEquals(other.authorId)) return false
        if (!this.familyId.contentEquals(other.familyId)) return false
        if (!this.imageId.contentEquals(other.imageId)) return false
        if (this.svn != other.svn) return false
        if (!this.moduleName.contentEquals(other.moduleName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uniqueId.contentHashCode()
        result = 31 * result + this.authorId.contentHashCode()
        result = 31 * result + this.familyId.contentHashCode()
        result = 31 * result + this.imageId.contentHashCode()
        result = 31 * result + this.svn.hashCode()
        result = 31 * result + this.moduleName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbsEnclaveReportModule> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbsEnclaveReportModule> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 110L
                override fun readNative(addr: Long): VbsEnclaveReportModule =
                    VbsEnclaveReportModule(
                        (VbsEnclaveReportVardataHeader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 40L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 72L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 88L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 104L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 108L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: VbsEnclaveReportModule) {
                    (VbsEnclaveReportVardataHeader.typeLayout()).writeNative(addr, value.header)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 8L, value.uniqueId.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 40L, value.authorId.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 72L, value.familyId.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 88L, value.imageId.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 104L, value.svn)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 108L, value.moduleName.toList())
                }
            }
    }
}

public data class VbsEnclaveReportPkgHeader(
    public var packageSize: UInt = 0u,
    public var version: UInt = 0u,
    public var signatureScheme: UInt = 0u,
    public var signedStatementSize: UInt = 0u,
    public var signatureSize: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbsEnclaveReportPkgHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbsEnclaveReportPkgHeader> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): VbsEnclaveReportPkgHeader =
                    VbsEnclaveReportPkgHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: VbsEnclaveReportPkgHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.packageSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.signatureScheme)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.signedStatementSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.signatureSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.reserved)
                }
            }
    }
}

public data class VbsEnclaveReportVardataHeader(
    public var dataType: UInt = 0u,
    public var size: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbsEnclaveReportVardataHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VbsEnclaveReportVardataHeader> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): VbsEnclaveReportVardataHeader =
                    VbsEnclaveReportVardataHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: VbsEnclaveReportVardataHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dataType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                }
            }
    }
}
