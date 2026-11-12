@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.deploymentservices

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey

public data class PxeAddress(
    public var uFlags: UInt = 0u,
    public var anonymous: PxeAddress0 = PxeAddress0(),
    public var uAddrLen: UInt = 0u,
    public var uPort: UShort = 0u,
)

public data class PxeAddress0(
    public var bAddress: UByteArray = UByteArray(16),
    public var uIpAddress: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PxeAddress0) return false
        if (!this.bAddress.contentEquals(other.bAddress)) return false
        if (this.uIpAddress != other.uIpAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bAddress.contentHashCode()
        result = 31 * result + this.uIpAddress.hashCode()
        return result
    }
}

public data class PxeDhcpv6Message(
    public var messageType: UByte = 0u,
    public var transactionIDByte1: UByte = 0u,
    public var transactionIDByte2: UByte = 0u,
    public var transactionIDByte3: UByte = 0u,
    public var options: List<PxeDhcpv6Option> = List(1) { PxeDhcpv6Option() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PxeDhcpv6Message> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PxeDhcpv6Message> {
                override val sizeBytes: Long = 9L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): PxeDhcpv6Message =
                    PxeDhcpv6Message(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(PxeDhcpv6Option.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PxeDhcpv6Message) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.messageType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.transactionIDByte1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.transactionIDByte2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.transactionIDByte3)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(PxeDhcpv6Option.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.options)
                }
            }
    }
}

public data class PxeDhcpv6MessageHeader(
    public var messageType: UByte = 0u,
    public var message: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PxeDhcpv6MessageHeader) return false
        if (this.messageType != other.messageType) return false
        if (!this.message.contentEquals(other.message)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.message.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PxeDhcpv6MessageHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PxeDhcpv6MessageHeader> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): PxeDhcpv6MessageHeader =
                    PxeDhcpv6MessageHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: PxeDhcpv6MessageHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.messageType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 1L, value.message)
                }
            }
    }
}

public class PxeDhcpv6NestedRelayMessage internal constructor(
    pRelayMessageCtorArg: MutPtr<PxeDhcpv6RelayMessage>,
    public var cbRelayMessage: UInt,
    pInterfaceIdOptionCtorArg: MutPtr<CVoid>,
    public var cbInterfaceIdOption: UShort,
) {
    public var pRelayMessage: MutPtr<PxeDhcpv6RelayMessage> = pRelayMessageCtorArg
        internal set

    public var pInterfaceIdOption: MutPtr<CVoid> = pInterfaceIdOptionCtorArg
        internal set

    public constructor() : this(
        pRelayMessageCtorArg = MutPtr(0L),
        cbRelayMessage = 0u,
        pInterfaceIdOptionCtorArg = MutPtr(0L),
        cbInterfaceIdOption = 0u,
    )

    public operator fun component1(): MutPtr<PxeDhcpv6RelayMessage> = this.pRelayMessage

    public operator fun component2(): UInt = this.cbRelayMessage

    public operator fun component3(): MutPtr<CVoid> = this.pInterfaceIdOption

    public operator fun component4(): UShort = this.cbInterfaceIdOption

    public fun copy(pRelayMessage: MutPtr<PxeDhcpv6RelayMessage> = this.pRelayMessage, cbRelayMessage: UInt = this.cbRelayMessage, pInterfaceIdOption: MutPtr<CVoid> = this.pInterfaceIdOption, cbInterfaceIdOption: UShort = this.cbInterfaceIdOption): PxeDhcpv6NestedRelayMessage = PxeDhcpv6NestedRelayMessage(pRelayMessageCtorArg = pRelayMessage, cbRelayMessage = cbRelayMessage, pInterfaceIdOptionCtorArg = pInterfaceIdOption, cbInterfaceIdOption = cbInterfaceIdOption)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PxeDhcpv6NestedRelayMessage) return false
        if (this.pRelayMessage != other.pRelayMessage) return false
        if (this.cbRelayMessage != other.cbRelayMessage) return false
        if (this.pInterfaceIdOption != other.pInterfaceIdOption) return false
        if (this.cbInterfaceIdOption != other.cbInterfaceIdOption) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pRelayMessage.hashCode()
        result = 31 * result + this.cbRelayMessage.hashCode()
        result = 31 * result + this.pInterfaceIdOption.hashCode()
        result = 31 * result + this.cbInterfaceIdOption.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PxeDhcpv6NestedRelayMessage> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PxeDhcpv6NestedRelayMessage> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PxeDhcpv6NestedRelayMessage =
                    PxeDhcpv6NestedRelayMessage(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<PxeDhcpv6RelayMessage>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: PxeDhcpv6NestedRelayMessage) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<PxeDhcpv6RelayMessage>(64)
                    ).writeNative(addr, value.pRelayMessage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbRelayMessage)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.pInterfaceIdOption)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.cbInterfaceIdOption)
                }
            }

        public operator fun invoke(
            pRelayMessage: MutPtr<PxeDhcpv6RelayMessage> = MutPtr(0L),
            cbRelayMessage: UInt = 0u,
            pInterfaceIdOption: MutPtr<CVoid> = MutPtr(0L),
            cbInterfaceIdOption: UShort = 0u,
        ): PxeDhcpv6NestedRelayMessage =
            PxeDhcpv6NestedRelayMessage(
                pRelayMessageCtorArg = pRelayMessage,
                cbRelayMessage = cbRelayMessage,
                pInterfaceIdOptionCtorArg = pInterfaceIdOption,
                cbInterfaceIdOption = cbInterfaceIdOption,
            )
    }
}

public data class PxeDhcpv6Option(
    public var optionCode: UShort = 0u,
    public var dataLength: UShort = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PxeDhcpv6Option) return false
        if (this.optionCode != other.optionCode) return false
        if (this.dataLength != other.dataLength) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.optionCode.hashCode()
        result = 31 * result + this.dataLength.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PxeDhcpv6Option> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PxeDhcpv6Option> {
                override val sizeBytes: Long = 5L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): PxeDhcpv6Option =
                    PxeDhcpv6Option(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PxeDhcpv6Option) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.optionCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.dataLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.data)
                }
            }
    }
}

public data class PxeDhcpv6RelayMessage(
    public var messageType: UByte = 0u,
    public var hopCount: UByte = 0u,
    public var linkAddress: UByteArray = UByteArray(16),
    public var peerAddress: UByteArray = UByteArray(16),
    public var options: List<PxeDhcpv6Option> = List(1) { PxeDhcpv6Option() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PxeDhcpv6RelayMessage) return false
        if (this.messageType != other.messageType) return false
        if (this.hopCount != other.hopCount) return false
        if (!this.linkAddress.contentEquals(other.linkAddress)) return false
        if (!this.peerAddress.contentEquals(other.peerAddress)) return false
        if (this.options != other.options) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageType.hashCode()
        result = 31 * result + this.hopCount.hashCode()
        result = 31 * result + this.linkAddress.contentHashCode()
        result = 31 * result + this.peerAddress.contentHashCode()
        result = 31 * result + this.options.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PxeDhcpv6RelayMessage> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PxeDhcpv6RelayMessage> {
                override val sizeBytes: Long = 39L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): PxeDhcpv6RelayMessage =
                    PxeDhcpv6RelayMessage(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 18L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(PxeDhcpv6Option.typeLayout(), (1).toInt())
                        ).readNative(addr + 34L),
                    )
                override fun writeNative(addr: Long, value: PxeDhcpv6RelayMessage) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.messageType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.hopCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 2L, value.linkAddress)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 18L, value.peerAddress)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(PxeDhcpv6Option.typeLayout(), (1).toInt())
                    ).writeNative(addr + 34L, value.options)
                }
            }
    }
}

public data class PxeDhcpMessage(
    public var operation: UByte = 0u,
    public var hardwareAddressType: UByte = 0u,
    public var hardwareAddressLength: UByte = 0u,
    public var hopCount: UByte = 0u,
    public var transactionID: UInt = 0u,
    public var secondsSinceBoot: UShort = 0u,
    public var reserved: UShort = 0u,
    public var clientIpAddress: UInt = 0u,
    public var yourIpAddress: UInt = 0u,
    public var bootstrapServerAddress: UInt = 0u,
    public var relayAgentIpAddress: UInt = 0u,
    public var hardwareAddress: UByteArray = UByteArray(16),
    public var hostName: UByteArray = UByteArray(64),
    public var bootFileName: UByteArray = UByteArray(128),
    public var anonymous: PxeDhcpMessage0 = PxeDhcpMessage0(),
    public var option: PxeDhcpOption = PxeDhcpOption(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PxeDhcpMessage) return false
        if (this.operation != other.operation) return false
        if (this.hardwareAddressType != other.hardwareAddressType) return false
        if (this.hardwareAddressLength != other.hardwareAddressLength) return false
        if (this.hopCount != other.hopCount) return false
        if (this.transactionID != other.transactionID) return false
        if (this.secondsSinceBoot != other.secondsSinceBoot) return false
        if (this.reserved != other.reserved) return false
        if (this.clientIpAddress != other.clientIpAddress) return false
        if (this.yourIpAddress != other.yourIpAddress) return false
        if (this.bootstrapServerAddress != other.bootstrapServerAddress) return false
        if (this.relayAgentIpAddress != other.relayAgentIpAddress) return false
        if (!this.hardwareAddress.contentEquals(other.hardwareAddress)) return false
        if (!this.hostName.contentEquals(other.hostName)) return false
        if (!this.bootFileName.contentEquals(other.bootFileName)) return false
        if (this.anonymous != other.anonymous) return false
        if (this.option != other.option) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.operation.hashCode()
        result = 31 * result + this.hardwareAddressType.hashCode()
        result = 31 * result + this.hardwareAddressLength.hashCode()
        result = 31 * result + this.hopCount.hashCode()
        result = 31 * result + this.transactionID.hashCode()
        result = 31 * result + this.secondsSinceBoot.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.clientIpAddress.hashCode()
        result = 31 * result + this.yourIpAddress.hashCode()
        result = 31 * result + this.bootstrapServerAddress.hashCode()
        result = 31 * result + this.relayAgentIpAddress.hashCode()
        result = 31 * result + this.hardwareAddress.contentHashCode()
        result = 31 * result + this.hostName.contentHashCode()
        result = 31 * result + this.bootFileName.contentHashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.option.hashCode()
        return result
    }
}

public data class PxeDhcpMessage0(
    public var bMagicCookie: UByteArray = UByteArray(4),
    public var uMagicCookie: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PxeDhcpMessage0) return false
        if (!this.bMagicCookie.contentEquals(other.bMagicCookie)) return false
        if (this.uMagicCookie != other.uMagicCookie) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bMagicCookie.contentHashCode()
        result = 31 * result + this.uMagicCookie.hashCode()
        return result
    }
}

public data class PxeDhcpOption(
    public var optionType: UByte = 0u,
    public var optionLength: UByte = 0u,
    public var optionValue: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PxeDhcpOption) return false
        if (this.optionType != other.optionType) return false
        if (this.optionLength != other.optionLength) return false
        if (!this.optionValue.contentEquals(other.optionValue)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.optionType.hashCode()
        result = 31 * result + this.optionLength.hashCode()
        result = 31 * result + this.optionValue.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PxeDhcpOption> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PxeDhcpOption> {
                override val sizeBytes: Long = 3L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): PxeDhcpOption =
                    PxeDhcpOption(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: PxeDhcpOption) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.optionType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.optionLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 2L, value.optionValue)
                }
            }
    }
}

public class PxeProvider internal constructor(
    public var uSizeOfStruct: UInt,
    pwszNameCtorArg: Pwstr,
    pwszFilePathCtorArg: Pwstr,
    public var bIsCritical: Bool,
    public var uIndex: UInt,
) {
    public var pwszName: Pwstr = pwszNameCtorArg
        internal set

    public var pwszFilePath: Pwstr = pwszFilePathCtorArg
        internal set

    public constructor() : this(
        uSizeOfStruct = 0u,
        pwszNameCtorArg = MutPtr(0L),
        pwszFilePathCtorArg = MutPtr(0L),
        bIsCritical = 0,
        uIndex = 0u,
    )

    public operator fun component1(): UInt = this.uSizeOfStruct

    public operator fun component2(): Pwstr = this.pwszName

    public operator fun component3(): Pwstr = this.pwszFilePath

    public operator fun component4(): Bool = this.bIsCritical

    public operator fun component5(): UInt = this.uIndex

    public fun copy(uSizeOfStruct: UInt = this.uSizeOfStruct, pwszName: Pwstr = this.pwszName, pwszFilePath: Pwstr = this.pwszFilePath, bIsCritical: Bool = this.bIsCritical, uIndex: UInt = this.uIndex): PxeProvider = PxeProvider(uSizeOfStruct = uSizeOfStruct, pwszNameCtorArg = pwszName, pwszFilePathCtorArg = pwszFilePath, bIsCritical = bIsCritical, uIndex = uIndex)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PxeProvider) return false
        if (this.uSizeOfStruct != other.uSizeOfStruct) return false
        if (this.pwszName != other.pwszName) return false
        if (this.pwszFilePath != other.pwszFilePath) return false
        if (this.bIsCritical != other.bIsCritical) return false
        if (this.uIndex != other.uIndex) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uSizeOfStruct.hashCode()
        result = 31 * result + this.pwszName.hashCode()
        result = 31 * result + this.pwszFilePath.hashCode()
        result = 31 * result + this.bIsCritical.hashCode()
        result = 31 * result + this.uIndex.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            uSizeOfStruct: UInt = 0u,
            pwszName: Pwstr = MutPtr(0L),
            pwszFilePath: Pwstr = MutPtr(0L),
            bIsCritical: Bool = 0,
            uIndex: UInt = 0u,
        ): PxeProvider =
            PxeProvider(
                uSizeOfStruct = uSizeOfStruct,
                pwszNameCtorArg = pwszName,
                pwszFilePathCtorArg = pwszFilePath,
                bIsCritical = bIsCritical,
                uIndex = uIndex,
            )
    }
}

public data class TransportclientSessionInfo(
    public var ulStructureLength: UInt = 0u,
    public var ullFileSize: ULong = 0uL,
    public var ulBlockSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TransportclientSessionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TransportclientSessionInfo> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): TransportclientSessionInfo =
                    TransportclientSessionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: TransportclientSessionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulStructureLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.ullFileSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ulBlockSize)
                }
            }
    }
}

public class WdsCliCred internal constructor(
    pwszUserNameCtorArg: Pcwstr,
    pwszDomainCtorArg: Pcwstr,
    pwszPasswordCtorArg: Pcwstr,
) {
    public var pwszUserName: Pcwstr = pwszUserNameCtorArg
        internal set

    public var pwszDomain: Pcwstr = pwszDomainCtorArg
        internal set

    public var pwszPassword: Pcwstr = pwszPasswordCtorArg
        internal set

    public constructor() : this(
        pwszUserNameCtorArg = ConstPtr(0L),
        pwszDomainCtorArg = ConstPtr(0L),
        pwszPasswordCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.pwszUserName

    public operator fun component2(): Pcwstr = this.pwszDomain

    public operator fun component3(): Pcwstr = this.pwszPassword

    public fun copy(pwszUserName: Pcwstr = this.pwszUserName, pwszDomain: Pcwstr = this.pwszDomain, pwszPassword: Pcwstr = this.pwszPassword): WdsCliCred = WdsCliCred(pwszUserNameCtorArg = pwszUserName, pwszDomainCtorArg = pwszDomain, pwszPasswordCtorArg = pwszPassword)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WdsCliCred) return false
        if (this.pwszUserName != other.pwszUserName) return false
        if (this.pwszDomain != other.pwszDomain) return false
        if (this.pwszPassword != other.pwszPassword) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwszUserName.hashCode()
        result = 31 * result + this.pwszDomain.hashCode()
        result = 31 * result + this.pwszPassword.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwszUserName: Pcwstr = ConstPtr(0L),
            pwszDomain: Pcwstr = ConstPtr(0L),
            pwszPassword: Pcwstr = ConstPtr(0L),
        ): WdsCliCred =
            WdsCliCred(
                pwszUserNameCtorArg = pwszUserName,
                pwszDomainCtorArg = pwszDomain,
                pwszPasswordCtorArg = pwszPassword,
            )
    }
}

public data class WdsTransportclientCallbacks(
    public var sessionStart: PfnWdsTransportClientSessionStart = null,
    public var sessionStartEx: PfnWdsTransportClientSessionStartEx = null,
    public var receiveContents: PfnWdsTransportClientReceiveContents = null,
    public var receiveMetadata: PfnWdsTransportClientReceiveMetadata = null,
    public var sessionComplete: PfnWdsTransportClientSessionComplete = null,
    public var sessionNegotiate: PfnWdsTransportClientSessionNegotiate = null,
)

public class WdsTransportclientRequest internal constructor(
    public var ulLength: UInt,
    public var ulApiVersion: UInt,
    public var ulAuthLevel: WdsTransportclientRequestAuthLevel,
    pwszServerCtorArg: Pcwstr,
    pwszNamespaceCtorArg: Pcwstr,
    pwszObjectNameCtorArg: Pcwstr,
    public var ulCacheSize: UInt,
    public var ulProtocol: UInt,
    pvProtocolDataCtorArg: MutPtr<CVoid>,
    public var ulProtocolDataLength: UInt,
) {
    public var pwszServer: Pcwstr = pwszServerCtorArg
        internal set

    public var pwszNamespace: Pcwstr = pwszNamespaceCtorArg
        internal set

    public var pwszObjectName: Pcwstr = pwszObjectNameCtorArg
        internal set

    public var pvProtocolData: MutPtr<CVoid> = pvProtocolDataCtorArg
        internal set

    public constructor() : this(
        ulLength = 0u,
        ulApiVersion = 0u,
        ulAuthLevel = 0u,
        pwszServerCtorArg = ConstPtr(0L),
        pwszNamespaceCtorArg = ConstPtr(0L),
        pwszObjectNameCtorArg = ConstPtr(0L),
        ulCacheSize = 0u,
        ulProtocol = 0u,
        pvProtocolDataCtorArg = MutPtr(0L),
        ulProtocolDataLength = 0u,
    )

    public operator fun component1(): UInt = this.ulLength

    public operator fun component2(): UInt = this.ulApiVersion

    public operator fun component3(): WdsTransportclientRequestAuthLevel = this.ulAuthLevel

    public operator fun component4(): Pcwstr = this.pwszServer

    public operator fun component5(): Pcwstr = this.pwszNamespace

    public operator fun component6(): Pcwstr = this.pwszObjectName

    public operator fun component7(): UInt = this.ulCacheSize

    public operator fun component8(): UInt = this.ulProtocol

    public operator fun component9(): MutPtr<CVoid> = this.pvProtocolData

    public operator fun component10(): UInt = this.ulProtocolDataLength

    public fun copy(ulLength: UInt = this.ulLength, ulApiVersion: UInt = this.ulApiVersion, ulAuthLevel: WdsTransportclientRequestAuthLevel = this.ulAuthLevel, pwszServer: Pcwstr = this.pwszServer, pwszNamespace: Pcwstr = this.pwszNamespace, pwszObjectName: Pcwstr = this.pwszObjectName, ulCacheSize: UInt = this.ulCacheSize, ulProtocol: UInt = this.ulProtocol, pvProtocolData: MutPtr<CVoid> = this.pvProtocolData, ulProtocolDataLength: UInt = this.ulProtocolDataLength): WdsTransportclientRequest = WdsTransportclientRequest(ulLength = ulLength, ulApiVersion = ulApiVersion, ulAuthLevel = ulAuthLevel, pwszServerCtorArg = pwszServer, pwszNamespaceCtorArg = pwszNamespace, pwszObjectNameCtorArg = pwszObjectName, ulCacheSize = ulCacheSize, ulProtocol = ulProtocol, pvProtocolDataCtorArg = pvProtocolData, ulProtocolDataLength = ulProtocolDataLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WdsTransportclientRequest) return false
        if (this.ulLength != other.ulLength) return false
        if (this.ulApiVersion != other.ulApiVersion) return false
        if (this.ulAuthLevel != other.ulAuthLevel) return false
        if (this.pwszServer != other.pwszServer) return false
        if (this.pwszNamespace != other.pwszNamespace) return false
        if (this.pwszObjectName != other.pwszObjectName) return false
        if (this.ulCacheSize != other.ulCacheSize) return false
        if (this.ulProtocol != other.ulProtocol) return false
        if (this.pvProtocolData != other.pvProtocolData) return false
        if (this.ulProtocolDataLength != other.ulProtocolDataLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulLength.hashCode()
        result = 31 * result + this.ulApiVersion.hashCode()
        result = 31 * result + this.ulAuthLevel.hashCode()
        result = 31 * result + this.pwszServer.hashCode()
        result = 31 * result + this.pwszNamespace.hashCode()
        result = 31 * result + this.pwszObjectName.hashCode()
        result = 31 * result + this.ulCacheSize.hashCode()
        result = 31 * result + this.ulProtocol.hashCode()
        result = 31 * result + this.pvProtocolData.hashCode()
        result = 31 * result + this.ulProtocolDataLength.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ulLength: UInt = 0u,
            ulApiVersion: UInt = 0u,
            ulAuthLevel: WdsTransportclientRequestAuthLevel = 0u,
            pwszServer: Pcwstr = ConstPtr(0L),
            pwszNamespace: Pcwstr = ConstPtr(0L),
            pwszObjectName: Pcwstr = ConstPtr(0L),
            ulCacheSize: UInt = 0u,
            ulProtocol: UInt = 0u,
            pvProtocolData: MutPtr<CVoid> = MutPtr(0L),
            ulProtocolDataLength: UInt = 0u,
        ): WdsTransportclientRequest =
            WdsTransportclientRequest(
                ulLength = ulLength,
                ulApiVersion = ulApiVersion,
                ulAuthLevel = ulAuthLevel,
                pwszServerCtorArg = pwszServer,
                pwszNamespaceCtorArg = pwszNamespace,
                pwszObjectNameCtorArg = pwszObjectName,
                ulCacheSize = ulCacheSize,
                ulProtocol = ulProtocol,
                pvProtocolDataCtorArg = pvProtocolData,
                ulProtocolDataLength = ulProtocolDataLength,
            )
    }
}

public class WdsTransportproviderInitParams internal constructor(
    public var ulLength: UInt,
    public var ulMcServerVersion: UInt,
    hRegistryKeyCtorArg: Hkey,
    hProviderCtorArg: Handle,
) {
    public var hRegistryKey: Hkey = hRegistryKeyCtorArg
        internal set

    public var hProvider: Handle = hProviderCtorArg
        internal set

    public constructor() : this(
        ulLength = 0u,
        ulMcServerVersion = 0u,
        hRegistryKeyCtorArg = MutPtr(0L),
        hProviderCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.ulLength

    public operator fun component2(): UInt = this.ulMcServerVersion

    public operator fun component3(): Hkey = this.hRegistryKey

    public operator fun component4(): Handle = this.hProvider

    public fun copy(ulLength: UInt = this.ulLength, ulMcServerVersion: UInt = this.ulMcServerVersion, hRegistryKey: Hkey = this.hRegistryKey, hProvider: Handle = this.hProvider): WdsTransportproviderInitParams = WdsTransportproviderInitParams(ulLength = ulLength, ulMcServerVersion = ulMcServerVersion, hRegistryKeyCtorArg = hRegistryKey, hProviderCtorArg = hProvider)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WdsTransportproviderInitParams) return false
        if (this.ulLength != other.ulLength) return false
        if (this.ulMcServerVersion != other.ulMcServerVersion) return false
        if (this.hRegistryKey != other.hRegistryKey) return false
        if (this.hProvider != other.hProvider) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulLength.hashCode()
        result = 31 * result + this.ulMcServerVersion.hashCode()
        result = 31 * result + this.hRegistryKey.hashCode()
        result = 31 * result + this.hProvider.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ulLength: UInt = 0u,
            ulMcServerVersion: UInt = 0u,
            hRegistryKey: Hkey = MutPtr(0L),
            hProvider: Handle = MutPtr(0L),
        ): WdsTransportproviderInitParams =
            WdsTransportproviderInitParams(
                ulLength = ulLength,
                ulMcServerVersion = ulMcServerVersion,
                hRegistryKeyCtorArg = hRegistryKey,
                hProviderCtorArg = hProvider,
            )
    }
}

public data class WdsTransportproviderSettings(
    public var ulLength: UInt = 0u,
    public var ulProviderVersion: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WdsTransportproviderSettings> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WdsTransportproviderSettings> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): WdsTransportproviderSettings =
                    WdsTransportproviderSettings(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: WdsTransportproviderSettings) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ulProviderVersion)
                }
            }
    }
}
