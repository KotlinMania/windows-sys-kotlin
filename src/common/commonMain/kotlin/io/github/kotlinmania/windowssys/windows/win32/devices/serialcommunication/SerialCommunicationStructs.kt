@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.serialcommunication

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public class SerenumPortDesc internal constructor(
    public var size: UInt,
    portHandleCtorArg: MutPtr<CVoid>,
    public var portAddress: Long,
    public var reserved: UShortArray,
) {
    public var portHandle: MutPtr<CVoid> = portHandleCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        portHandleCtorArg = MutPtr(0L),
        portAddress = 0L,
        reserved = UShortArray(1),
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): MutPtr<CVoid> = this.portHandle

    public operator fun component3(): Long = this.portAddress

    public operator fun component4(): UShortArray = this.reserved

    public fun copy(size: UInt = this.size, portHandle: MutPtr<CVoid> = this.portHandle, portAddress: Long = this.portAddress, reserved: UShortArray = this.reserved): SerenumPortDesc = SerenumPortDesc(size = size, portHandleCtorArg = portHandle, portAddress = portAddress, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SerenumPortDesc) return false
        if (this.size != other.size) return false
        if (this.portHandle != other.portHandle) return false
        if (this.portAddress != other.portAddress) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.portHandle.hashCode()
        result = 31 * result + this.portAddress.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SerenumPortDesc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SerenumPortDesc> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): SerenumPortDesc =
                    SerenumPortDesc(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 24L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: SerenumPortDesc) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.portHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.portAddress)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 24L, value.reserved.toList())
                }
            }

        public operator fun invoke(
            size: UInt = 0u,
            portHandle: MutPtr<CVoid> = MutPtr(0L),
            portAddress: Long = 0L,
            reserved: UShortArray = UShortArray(1),
        ): SerenumPortDesc =
            SerenumPortDesc(
                size = size,
                portHandleCtorArg = portHandle,
                portAddress = portAddress,
                reserved = reserved,
            )
    }
}

public class SerenumPortParameters internal constructor(
    public var size: UInt,
    public var readAccessor: PserenumReadport,
    public var writeAccessor: PserenumWriteport,
    serPortAddressCtorArg: MutPtr<CVoid>,
    hardwareHandleCtorArg: MutPtr<CVoid>,
    public var portion: SerenumPortion,
    public var numberAxis: UShort,
    public var reserved: UShortArray,
) {
    public var serPortAddress: MutPtr<CVoid> = serPortAddressCtorArg
        internal set

    public var hardwareHandle: MutPtr<CVoid> = hardwareHandleCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        readAccessor = null,
        writeAccessor = null,
        serPortAddressCtorArg = MutPtr(0L),
        hardwareHandleCtorArg = MutPtr(0L),
        portion = 0,
        numberAxis = 0u,
        reserved = UShortArray(3),
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): PserenumReadport = this.readAccessor

    public operator fun component3(): PserenumWriteport = this.writeAccessor

    public operator fun component4(): MutPtr<CVoid> = this.serPortAddress

    public operator fun component5(): MutPtr<CVoid> = this.hardwareHandle

    public operator fun component6(): SerenumPortion = this.portion

    public operator fun component7(): UShort = this.numberAxis

    public operator fun component8(): UShortArray = this.reserved

    public fun copy(size: UInt = this.size, readAccessor: PserenumReadport = this.readAccessor, writeAccessor: PserenumWriteport = this.writeAccessor, serPortAddress: MutPtr<CVoid> = this.serPortAddress, hardwareHandle: MutPtr<CVoid> = this.hardwareHandle, portion: SerenumPortion = this.portion, numberAxis: UShort = this.numberAxis, reserved: UShortArray = this.reserved): SerenumPortParameters = SerenumPortParameters(size = size, readAccessor = readAccessor, writeAccessor = writeAccessor, serPortAddressCtorArg = serPortAddress, hardwareHandleCtorArg = hardwareHandle, portion = portion, numberAxis = numberAxis, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SerenumPortParameters) return false
        if (this.size != other.size) return false
        if (this.readAccessor != other.readAccessor) return false
        if (this.writeAccessor != other.writeAccessor) return false
        if (this.serPortAddress != other.serPortAddress) return false
        if (this.hardwareHandle != other.hardwareHandle) return false
        if (this.portion != other.portion) return false
        if (this.numberAxis != other.numberAxis) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.readAccessor.hashCode()
        result = 31 * result + this.writeAccessor.hashCode()
        result = 31 * result + this.serPortAddress.hashCode()
        result = 31 * result + this.hardwareHandle.hashCode()
        result = 31 * result + this.portion.hashCode()
        result = 31 * result + this.numberAxis.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UInt = 0u,
            readAccessor: PserenumReadport = null,
            writeAccessor: PserenumWriteport = null,
            serPortAddress: MutPtr<CVoid> = MutPtr(0L),
            hardwareHandle: MutPtr<CVoid> = MutPtr(0L),
            portion: SerenumPortion = 0,
            numberAxis: UShort = 0u,
            reserved: UShortArray = UShortArray(3),
        ): SerenumPortParameters =
            SerenumPortParameters(
                size = size,
                readAccessor = readAccessor,
                writeAccessor = writeAccessor,
                serPortAddressCtorArg = serPortAddress,
                hardwareHandleCtorArg = hardwareHandle,
                portion = portion,
                numberAxis = numberAxis,
                reserved = reserved,
            )
    }
}

public data class Serialconfig(
    public var size: UInt = 0u,
    public var version: UShort = 0u,
    public var subType: UInt = 0u,
    public var provOffset: UInt = 0u,
    public var providerSize: UInt = 0u,
    public var providerData: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Serialconfig) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.subType != other.subType) return false
        if (this.provOffset != other.provOffset) return false
        if (this.providerSize != other.providerSize) return false
        if (!this.providerData.contentEquals(other.providerData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.subType.hashCode()
        result = 31 * result + this.provOffset.hashCode()
        result = 31 * result + this.providerSize.hashCode()
        result = 31 * result + this.providerData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Serialconfig> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Serialconfig> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Serialconfig =
                    Serialconfig(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 20L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Serialconfig) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.subType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.provOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.providerSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 20L, value.providerData.toList())
                }
            }
    }
}

public data class SerialperfStats(
    public var receivedCount: UInt = 0u,
    public var transmittedCount: UInt = 0u,
    public var frameErrorCount: UInt = 0u,
    public var serialOverrunErrorCount: UInt = 0u,
    public var bufferOverrunErrorCount: UInt = 0u,
    public var parityErrorCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SerialperfStats> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SerialperfStats> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): SerialperfStats =
                    SerialperfStats(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: SerialperfStats) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.receivedCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.transmittedCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.frameErrorCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.serialOverrunErrorCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.bufferOverrunErrorCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.parityErrorCount)
                }
            }
    }
}

public data class SerialBasicSettings(
    public var timeouts: SerialTimeouts = SerialTimeouts(),
    public var handFlow: SerialHandflow = SerialHandflow(),
    public var rxFifo: UInt = 0u,
    public var txFifo: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SerialBasicSettings> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SerialBasicSettings> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 44L
                override fun readNative(addr: Long): SerialBasicSettings =
                    SerialBasicSettings(
                        (SerialTimeouts.typeLayout()).readNative(addr),
                        (SerialHandflow.typeLayout()).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: SerialBasicSettings) {
                    (SerialTimeouts.typeLayout()).writeNative(addr, value.timeouts)
                    (SerialHandflow.typeLayout()).writeNative(addr + 20L, value.handFlow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.rxFifo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.txFifo)
                }
            }
    }
}

public data class SerialBaudRate(
    public var baudRate: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SerialBaudRate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SerialBaudRate> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): SerialBaudRate =
                    SerialBaudRate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SerialBaudRate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.baudRate)
                }
            }
    }
}

public data class SerialChars(
    public var eofChar: UByte = 0u,
    public var errorChar: UByte = 0u,
    public var breakChar: UByte = 0u,
    public var eventChar: UByte = 0u,
    public var xonChar: UByte = 0u,
    public var xoffChar: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SerialChars> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SerialChars> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): SerialChars =
                    SerialChars(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                    )
                override fun writeNative(addr: Long, value: SerialChars) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.eofChar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.errorChar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.breakChar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.eventChar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.xonChar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.xoffChar)
                }
            }
    }
}

public class SerialCommprop(
    public var packetLength: UShort = 0u,
    public var packetVersion: UShort = 0u,
    public var serviceMask: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var maxTxQueue: UInt = 0u,
    public var maxRxQueue: UInt = 0u,
    public var maxBaud: UInt = 0u,
    public var provSubType: UInt = 0u,
    public var provCapabilities: UInt = 0u,
    public var settableParams: UInt = 0u,
    public var settableBaud: UInt = 0u,
    public var settableData: UShort = 0u,
    public var settableStopParity: UShort = 0u,
    public var currentTxQueue: UInt = 0u,
    public var currentRxQueue: UInt = 0u,
    public var provSpec1: UInt = 0u,
    public var provSpec2: UInt = 0u,
    public var provChar: UShortArray = UShortArray(1),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SerialCommprop> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SerialCommprop> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): SerialCommprop =
                    SerialCommprop(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 42L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 60L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: SerialCommprop) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.packetLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.packetVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.serviceMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.maxTxQueue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.maxRxQueue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.maxBaud)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.provSubType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.provCapabilities)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.settableParams)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.settableBaud)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 40L, value.settableData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 42L, value.settableStopParity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.currentTxQueue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.currentRxQueue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.provSpec1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.provSpec2)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 60L, value.provChar.toList())
                }
            }
    }
}

public data class SerialHandflow(
    public var controlHandShake: UInt = 0u,
    public var flowReplace: UInt = 0u,
    public var xonLimit: Int = 0,
    public var xoffLimit: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SerialHandflow> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SerialHandflow> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SerialHandflow =
                    SerialHandflow(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: SerialHandflow) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.controlHandShake)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flowReplace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.xonLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.xoffLimit)
                }
            }
    }
}

public data class SerialLineControl(
    public var stopBits: UByte = 0u,
    public var parity: UByte = 0u,
    public var wordLength: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SerialLineControl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SerialLineControl> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 3L
                override fun readNative(addr: Long): SerialLineControl =
                    SerialLineControl(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: SerialLineControl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.stopBits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.parity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.wordLength)
                }
            }
    }
}

public data class SerialQueueSize(
    public var inSize: UInt = 0u,
    public var outSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SerialQueueSize> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SerialQueueSize> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SerialQueueSize =
                    SerialQueueSize(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SerialQueueSize) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.inSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.outSize)
                }
            }
    }
}

public data class SerialStatus(
    public var errors: UInt = 0u,
    public var holdReasons: UInt = 0u,
    public var amountInInQueue: UInt = 0u,
    public var amountInOutQueue: UInt = 0u,
    public var eofReceived: Boolean = false,
    public var waitForImmediate: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SerialStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SerialStatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): SerialStatus =
                    SerialStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 17L),
                    )
                override fun writeNative(addr: Long, value: SerialStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.errors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.holdReasons)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.amountInInQueue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.amountInOutQueue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 16L, value.eofReceived)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 17L, value.waitForImmediate)
                }
            }
    }
}

public data class SerialTimeouts(
    public var readIntervalTimeout: UInt = 0u,
    public var readTotalTimeoutMultiplier: UInt = 0u,
    public var readTotalTimeoutConstant: UInt = 0u,
    public var writeTotalTimeoutMultiplier: UInt = 0u,
    public var writeTotalTimeoutConstant: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SerialTimeouts> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SerialTimeouts> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): SerialTimeouts =
                    SerialTimeouts(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: SerialTimeouts) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.readIntervalTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.readTotalTimeoutMultiplier)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.readTotalTimeoutConstant)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.writeTotalTimeoutMultiplier)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.writeTotalTimeoutConstant)
                }
            }
    }
}

public data class SerialXoffCounter(
    public var timeout: UInt = 0u,
    public var counter: Int = 0,
    public var xoffChar: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SerialXoffCounter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SerialXoffCounter> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): SerialXoffCounter =
                    SerialXoffCounter(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SerialXoffCounter) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.timeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.counter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.xoffChar)
                }
            }
    }
}
