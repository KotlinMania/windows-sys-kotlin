@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.iscsidisc

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.system.ioctl.StorageDeviceNumber

public class AtaPassThroughDirect internal constructor(
    public var length: UShort,
    public var ataFlags: UShort,
    public var pathId: UByte,
    public var targetId: UByte,
    public var lun: UByte,
    public var reservedAsUchar: UByte,
    public var dataTransferLength: UInt,
    public var timeOutValue: UInt,
    public var reservedAsUlong: UInt,
    dataBufferCtorArg: MutPtr,
    public var previousTaskFile: UByteArray,
    public var currentTaskFile: UByteArray,
) {
    public var dataBuffer: MutPtr = dataBufferCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        ataFlags = 0u,
        pathId = 0u,
        targetId = 0u,
        lun = 0u,
        reservedAsUchar = 0u,
        dataTransferLength = 0u,
        timeOutValue = 0u,
        reservedAsUlong = 0u,
        dataBufferCtorArg = MutPtr(0L),
        previousTaskFile = UByteArray(8),
        currentTaskFile = UByteArray(8),
    )

    public operator fun component1(): UShort = this.length

    public operator fun component2(): UShort = this.ataFlags

    public operator fun component3(): UByte = this.pathId

    public operator fun component4(): UByte = this.targetId

    public operator fun component5(): UByte = this.lun

    public operator fun component6(): UByte = this.reservedAsUchar

    public operator fun component7(): UInt = this.dataTransferLength

    public operator fun component8(): UInt = this.timeOutValue

    public operator fun component9(): UInt = this.reservedAsUlong

    public operator fun component10(): MutPtr = this.dataBuffer

    public operator fun component11(): UByteArray = this.previousTaskFile

    public operator fun component12(): UByteArray = this.currentTaskFile

    public fun copy(length: UShort = this.length, ataFlags: UShort = this.ataFlags, pathId: UByte = this.pathId, targetId: UByte = this.targetId, lun: UByte = this.lun, reservedAsUchar: UByte = this.reservedAsUchar, dataTransferLength: UInt = this.dataTransferLength, timeOutValue: UInt = this.timeOutValue, reservedAsUlong: UInt = this.reservedAsUlong, dataBuffer: MutPtr = this.dataBuffer, previousTaskFile: UByteArray = this.previousTaskFile, currentTaskFile: UByteArray = this.currentTaskFile): AtaPassThroughDirect = AtaPassThroughDirect(length = length, ataFlags = ataFlags, pathId = pathId, targetId = targetId, lun = lun, reservedAsUchar = reservedAsUchar, dataTransferLength = dataTransferLength, timeOutValue = timeOutValue, reservedAsUlong = reservedAsUlong, dataBufferCtorArg = dataBuffer, previousTaskFile = previousTaskFile, currentTaskFile = currentTaskFile)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AtaPassThroughDirect) return false
        if (this.length != other.length) return false
        if (this.ataFlags != other.ataFlags) return false
        if (this.pathId != other.pathId) return false
        if (this.targetId != other.targetId) return false
        if (this.lun != other.lun) return false
        if (this.reservedAsUchar != other.reservedAsUchar) return false
        if (this.dataTransferLength != other.dataTransferLength) return false
        if (this.timeOutValue != other.timeOutValue) return false
        if (this.reservedAsUlong != other.reservedAsUlong) return false
        if (this.dataBuffer != other.dataBuffer) return false
        if (!this.previousTaskFile.contentEquals(other.previousTaskFile)) return false
        if (!this.currentTaskFile.contentEquals(other.currentTaskFile)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.ataFlags.hashCode()
        result = 31 * result + this.pathId.hashCode()
        result = 31 * result + this.targetId.hashCode()
        result = 31 * result + this.lun.hashCode()
        result = 31 * result + this.reservedAsUchar.hashCode()
        result = 31 * result + this.dataTransferLength.hashCode()
        result = 31 * result + this.timeOutValue.hashCode()
        result = 31 * result + this.reservedAsUlong.hashCode()
        result = 31 * result + this.dataBuffer.hashCode()
        result = 31 * result + this.previousTaskFile.contentHashCode()
        result = 31 * result + this.currentTaskFile.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AtaPassThroughDirect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AtaPassThroughDirect> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): AtaPassThroughDirect =
                    AtaPassThroughDirect(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 32L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 40L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: AtaPassThroughDirect) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.ataFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.pathId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.targetId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.lun)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.reservedAsUchar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dataTransferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.timeOutValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.reservedAsUlong)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.dataBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 32L, value.previousTaskFile.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 40L, value.currentTaskFile.toList())
                }
            }

        public operator fun invoke(
            length: UShort = 0u,
            ataFlags: UShort = 0u,
            pathId: UByte = 0u,
            targetId: UByte = 0u,
            lun: UByte = 0u,
            reservedAsUchar: UByte = 0u,
            dataTransferLength: UInt = 0u,
            timeOutValue: UInt = 0u,
            reservedAsUlong: UInt = 0u,
            dataBuffer: MutPtr = MutPtr(0L),
            previousTaskFile: UByteArray = UByteArray(8),
            currentTaskFile: UByteArray = UByteArray(8),
        ): AtaPassThroughDirect =
            AtaPassThroughDirect(
                length = length,
                ataFlags = ataFlags,
                pathId = pathId,
                targetId = targetId,
                lun = lun,
                reservedAsUchar = reservedAsUchar,
                dataTransferLength = dataTransferLength,
                timeOutValue = timeOutValue,
                reservedAsUlong = reservedAsUlong,
                dataBufferCtorArg = dataBuffer,
                previousTaskFile = previousTaskFile,
                currentTaskFile = currentTaskFile,
            )
    }
}

public class AtaPassThroughDirect32 internal constructor(
    public var length: UShort,
    public var ataFlags: UShort,
    public var pathId: UByte,
    public var targetId: UByte,
    public var lun: UByte,
    public var reservedAsUchar: UByte,
    public var dataTransferLength: UInt,
    public var timeOutValue: UInt,
    public var reservedAsUlong: UInt,
    dataBufferCtorArg: MutPtr,
    public var previousTaskFile: UByteArray,
    public var currentTaskFile: UByteArray,
) {
    public var dataBuffer: MutPtr = dataBufferCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        ataFlags = 0u,
        pathId = 0u,
        targetId = 0u,
        lun = 0u,
        reservedAsUchar = 0u,
        dataTransferLength = 0u,
        timeOutValue = 0u,
        reservedAsUlong = 0u,
        dataBufferCtorArg = MutPtr(0L),
        previousTaskFile = UByteArray(8),
        currentTaskFile = UByteArray(8),
    )

    public operator fun component1(): UShort = this.length

    public operator fun component2(): UShort = this.ataFlags

    public operator fun component3(): UByte = this.pathId

    public operator fun component4(): UByte = this.targetId

    public operator fun component5(): UByte = this.lun

    public operator fun component6(): UByte = this.reservedAsUchar

    public operator fun component7(): UInt = this.dataTransferLength

    public operator fun component8(): UInt = this.timeOutValue

    public operator fun component9(): UInt = this.reservedAsUlong

    public operator fun component10(): MutPtr = this.dataBuffer

    public operator fun component11(): UByteArray = this.previousTaskFile

    public operator fun component12(): UByteArray = this.currentTaskFile

    public fun copy(length: UShort = this.length, ataFlags: UShort = this.ataFlags, pathId: UByte = this.pathId, targetId: UByte = this.targetId, lun: UByte = this.lun, reservedAsUchar: UByte = this.reservedAsUchar, dataTransferLength: UInt = this.dataTransferLength, timeOutValue: UInt = this.timeOutValue, reservedAsUlong: UInt = this.reservedAsUlong, dataBuffer: MutPtr = this.dataBuffer, previousTaskFile: UByteArray = this.previousTaskFile, currentTaskFile: UByteArray = this.currentTaskFile): AtaPassThroughDirect32 = AtaPassThroughDirect32(length = length, ataFlags = ataFlags, pathId = pathId, targetId = targetId, lun = lun, reservedAsUchar = reservedAsUchar, dataTransferLength = dataTransferLength, timeOutValue = timeOutValue, reservedAsUlong = reservedAsUlong, dataBufferCtorArg = dataBuffer, previousTaskFile = previousTaskFile, currentTaskFile = currentTaskFile)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AtaPassThroughDirect32) return false
        if (this.length != other.length) return false
        if (this.ataFlags != other.ataFlags) return false
        if (this.pathId != other.pathId) return false
        if (this.targetId != other.targetId) return false
        if (this.lun != other.lun) return false
        if (this.reservedAsUchar != other.reservedAsUchar) return false
        if (this.dataTransferLength != other.dataTransferLength) return false
        if (this.timeOutValue != other.timeOutValue) return false
        if (this.reservedAsUlong != other.reservedAsUlong) return false
        if (this.dataBuffer != other.dataBuffer) return false
        if (!this.previousTaskFile.contentEquals(other.previousTaskFile)) return false
        if (!this.currentTaskFile.contentEquals(other.currentTaskFile)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.ataFlags.hashCode()
        result = 31 * result + this.pathId.hashCode()
        result = 31 * result + this.targetId.hashCode()
        result = 31 * result + this.lun.hashCode()
        result = 31 * result + this.reservedAsUchar.hashCode()
        result = 31 * result + this.dataTransferLength.hashCode()
        result = 31 * result + this.timeOutValue.hashCode()
        result = 31 * result + this.reservedAsUlong.hashCode()
        result = 31 * result + this.dataBuffer.hashCode()
        result = 31 * result + this.previousTaskFile.contentHashCode()
        result = 31 * result + this.currentTaskFile.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AtaPassThroughDirect32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AtaPassThroughDirect32> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): AtaPassThroughDirect32 =
                    AtaPassThroughDirect32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 32L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 40L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: AtaPassThroughDirect32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.ataFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.pathId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.targetId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.lun)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.reservedAsUchar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dataTransferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.timeOutValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.reservedAsUlong)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.dataBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 32L, value.previousTaskFile.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 40L, value.currentTaskFile.toList())
                }
            }

        public operator fun invoke(
            length: UShort = 0u,
            ataFlags: UShort = 0u,
            pathId: UByte = 0u,
            targetId: UByte = 0u,
            lun: UByte = 0u,
            reservedAsUchar: UByte = 0u,
            dataTransferLength: UInt = 0u,
            timeOutValue: UInt = 0u,
            reservedAsUlong: UInt = 0u,
            dataBuffer: MutPtr = MutPtr(0L),
            previousTaskFile: UByteArray = UByteArray(8),
            currentTaskFile: UByteArray = UByteArray(8),
        ): AtaPassThroughDirect32 =
            AtaPassThroughDirect32(
                length = length,
                ataFlags = ataFlags,
                pathId = pathId,
                targetId = targetId,
                lun = lun,
                reservedAsUchar = reservedAsUchar,
                dataTransferLength = dataTransferLength,
                timeOutValue = timeOutValue,
                reservedAsUlong = reservedAsUlong,
                dataBufferCtorArg = dataBuffer,
                previousTaskFile = previousTaskFile,
                currentTaskFile = currentTaskFile,
            )
    }
}

public data class AtaPassThroughEx(
    public var length: UShort = 0u,
    public var ataFlags: UShort = 0u,
    public var pathId: UByte = 0u,
    public var targetId: UByte = 0u,
    public var lun: UByte = 0u,
    public var reservedAsUchar: UByte = 0u,
    public var dataTransferLength: UInt = 0u,
    public var timeOutValue: UInt = 0u,
    public var reservedAsUlong: UInt = 0u,
    public var dataBufferOffset: Int = 0,
    public var previousTaskFile: UByteArray = UByteArray(8),
    public var currentTaskFile: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AtaPassThroughEx) return false
        if (this.length != other.length) return false
        if (this.ataFlags != other.ataFlags) return false
        if (this.pathId != other.pathId) return false
        if (this.targetId != other.targetId) return false
        if (this.lun != other.lun) return false
        if (this.reservedAsUchar != other.reservedAsUchar) return false
        if (this.dataTransferLength != other.dataTransferLength) return false
        if (this.timeOutValue != other.timeOutValue) return false
        if (this.reservedAsUlong != other.reservedAsUlong) return false
        if (this.dataBufferOffset != other.dataBufferOffset) return false
        if (!this.previousTaskFile.contentEquals(other.previousTaskFile)) return false
        if (!this.currentTaskFile.contentEquals(other.currentTaskFile)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.ataFlags.hashCode()
        result = 31 * result + this.pathId.hashCode()
        result = 31 * result + this.targetId.hashCode()
        result = 31 * result + this.lun.hashCode()
        result = 31 * result + this.reservedAsUchar.hashCode()
        result = 31 * result + this.dataTransferLength.hashCode()
        result = 31 * result + this.timeOutValue.hashCode()
        result = 31 * result + this.reservedAsUlong.hashCode()
        result = 31 * result + this.dataBufferOffset.hashCode()
        result = 31 * result + this.previousTaskFile.contentHashCode()
        result = 31 * result + this.currentTaskFile.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AtaPassThroughEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AtaPassThroughEx> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): AtaPassThroughEx =
                    AtaPassThroughEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 32L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 40L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: AtaPassThroughEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.ataFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.pathId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.targetId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.lun)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.reservedAsUchar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dataTransferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.timeOutValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.reservedAsUlong)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.dataBufferOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 32L, value.previousTaskFile.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 40L, value.currentTaskFile.toList())
                }
            }
    }
}

public data class AtaPassThroughEx32(
    public var length: UShort = 0u,
    public var ataFlags: UShort = 0u,
    public var pathId: UByte = 0u,
    public var targetId: UByte = 0u,
    public var lun: UByte = 0u,
    public var reservedAsUchar: UByte = 0u,
    public var dataTransferLength: UInt = 0u,
    public var timeOutValue: UInt = 0u,
    public var reservedAsUlong: UInt = 0u,
    public var dataBufferOffset: UInt = 0u,
    public var previousTaskFile: UByteArray = UByteArray(8),
    public var currentTaskFile: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AtaPassThroughEx32) return false
        if (this.length != other.length) return false
        if (this.ataFlags != other.ataFlags) return false
        if (this.pathId != other.pathId) return false
        if (this.targetId != other.targetId) return false
        if (this.lun != other.lun) return false
        if (this.reservedAsUchar != other.reservedAsUchar) return false
        if (this.dataTransferLength != other.dataTransferLength) return false
        if (this.timeOutValue != other.timeOutValue) return false
        if (this.reservedAsUlong != other.reservedAsUlong) return false
        if (this.dataBufferOffset != other.dataBufferOffset) return false
        if (!this.previousTaskFile.contentEquals(other.previousTaskFile)) return false
        if (!this.currentTaskFile.contentEquals(other.currentTaskFile)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.ataFlags.hashCode()
        result = 31 * result + this.pathId.hashCode()
        result = 31 * result + this.targetId.hashCode()
        result = 31 * result + this.lun.hashCode()
        result = 31 * result + this.reservedAsUchar.hashCode()
        result = 31 * result + this.dataTransferLength.hashCode()
        result = 31 * result + this.timeOutValue.hashCode()
        result = 31 * result + this.reservedAsUlong.hashCode()
        result = 31 * result + this.dataBufferOffset.hashCode()
        result = 31 * result + this.previousTaskFile.contentHashCode()
        result = 31 * result + this.currentTaskFile.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AtaPassThroughEx32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AtaPassThroughEx32> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): AtaPassThroughEx32 =
                    AtaPassThroughEx32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 24L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 32L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: AtaPassThroughEx32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.ataFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.pathId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.targetId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.lun)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.reservedAsUchar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dataTransferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.timeOutValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.reservedAsUlong)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dataBufferOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 24L, value.previousTaskFile.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 32L, value.currentTaskFile.toList())
                }
            }
    }
}

public data class DsmNotificationRequestBlock(
    public var size: UInt = 0u,
    public var version: UInt = 0u,
    public var notifyFlags: UInt = 0u,
    public var dataSetProfile: UInt = 0u,
    public var reserved: UIntArray = UIntArray(3),
    public var dataSetRangesCount: UInt = 0u,
    public var dataSetRanges: List<MpDeviceDataSetRange> = List(1) { MpDeviceDataSetRange() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DsmNotificationRequestBlock) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.notifyFlags != other.notifyFlags) return false
        if (this.dataSetProfile != other.dataSetProfile) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.dataSetRangesCount != other.dataSetRangesCount) return false
        if (this.dataSetRanges != other.dataSetRanges) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.notifyFlags.hashCode()
        result = 31 * result + this.dataSetProfile.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.dataSetRangesCount.hashCode()
        result = 31 * result + this.dataSetRanges.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DsmNotificationRequestBlock> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DsmNotificationRequestBlock> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): DsmNotificationRequestBlock =
                    DsmNotificationRequestBlock(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                        ).readNative(addr + 16L).toUIntArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(MpDeviceDataSetRange.typeLayout(), (1).toInt())
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: DsmNotificationRequestBlock) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.notifyFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dataSetProfile)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                    ).writeNative(addr + 16L, value.reserved.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dataSetRangesCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(MpDeviceDataSetRange.typeLayout(), (1).toInt())
                    ).writeNative(addr + 32L, value.dataSetRanges)
                }
            }
    }
}

public class DumpDriver internal constructor(
    dumpDriverListCtorArg: MutPtr,
    public var driverName: UShortArray,
    public var baseName: UShortArray,
) {
    public var dumpDriverList: MutPtr = dumpDriverListCtorArg
        internal set

    public constructor() : this(
        dumpDriverListCtorArg = MutPtr(0L),
        driverName = UShortArray(15),
        baseName = UShortArray(15),
    )

    public operator fun component1(): MutPtr = this.dumpDriverList

    public operator fun component2(): UShortArray = this.driverName

    public operator fun component3(): UShortArray = this.baseName

    public fun copy(dumpDriverList: MutPtr = this.dumpDriverList, driverName: UShortArray = this.driverName, baseName: UShortArray = this.baseName): DumpDriver = DumpDriver(dumpDriverListCtorArg = dumpDriverList, driverName = driverName, baseName = baseName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DumpDriver) return false
        if (this.dumpDriverList != other.dumpDriverList) return false
        if (!this.driverName.contentEquals(other.driverName)) return false
        if (!this.baseName.contentEquals(other.baseName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dumpDriverList.hashCode()
        result = 31 * result + this.driverName.contentHashCode()
        result = 31 * result + this.baseName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DumpDriver> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DumpDriver> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): DumpDriver =
                    DumpDriver(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (15).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (15).toInt())
                        ).readNative(addr + 38L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: DumpDriver) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.dumpDriverList)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (15).toInt())
                    ).writeNative(addr + 8L, value.driverName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (15).toInt())
                    ).writeNative(addr + 38L, value.baseName.toList())
                }
            }

        public operator fun invoke(
            dumpDriverList: MutPtr = MutPtr(0L),
            driverName: UShortArray = UShortArray(15),
            baseName: UShortArray = UShortArray(15),
        ): DumpDriver =
            DumpDriver(
                dumpDriverListCtorArg = dumpDriverList,
                driverName = driverName,
                baseName = baseName,
            )
    }
}

public class DumpDriverEx internal constructor(
    dumpDriverListCtorArg: MutPtr,
    public var driverName: UShortArray,
    public var baseName: UShortArray,
    public var driverFullPath: NtscsiUnicodeString,
) {
    public var dumpDriverList: MutPtr = dumpDriverListCtorArg
        internal set

    public constructor() : this(
        dumpDriverListCtorArg = MutPtr(0L),
        driverName = UShortArray(15),
        baseName = UShortArray(15),
        driverFullPath = NtscsiUnicodeString(),
    )

    public operator fun component1(): MutPtr = this.dumpDriverList

    public operator fun component2(): UShortArray = this.driverName

    public operator fun component3(): UShortArray = this.baseName

    public operator fun component4(): NtscsiUnicodeString = this.driverFullPath

    public fun copy(dumpDriverList: MutPtr = this.dumpDriverList, driverName: UShortArray = this.driverName, baseName: UShortArray = this.baseName, driverFullPath: NtscsiUnicodeString = this.driverFullPath): DumpDriverEx = DumpDriverEx(dumpDriverListCtorArg = dumpDriverList, driverName = driverName, baseName = baseName, driverFullPath = driverFullPath)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DumpDriverEx) return false
        if (this.dumpDriverList != other.dumpDriverList) return false
        if (!this.driverName.contentEquals(other.driverName)) return false
        if (!this.baseName.contentEquals(other.baseName)) return false
        if (this.driverFullPath != other.driverFullPath) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dumpDriverList.hashCode()
        result = 31 * result + this.driverName.contentHashCode()
        result = 31 * result + this.baseName.contentHashCode()
        result = 31 * result + this.driverFullPath.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dumpDriverList: MutPtr = MutPtr(0L),
            driverName: UShortArray = UShortArray(15),
            baseName: UShortArray = UShortArray(15),
            driverFullPath: NtscsiUnicodeString = NtscsiUnicodeString(),
        ): DumpDriverEx =
            DumpDriverEx(
                dumpDriverListCtorArg = dumpDriverList,
                driverName = driverName,
                baseName = baseName,
                driverFullPath = driverFullPath,
            )
    }
}

public class DumpPointers internal constructor(
    adapterObjectCtorArg: MutPtr,
    mappedRegisterBaseCtorArg: MutPtr,
    dumpDataCtorArg: MutPtr,
    commonBufferVaCtorArg: MutPtr,
    public var commonBufferPa: Long,
    public var commonBufferSize: UInt,
    public var allocateCommonBuffers: Boolean,
    public var useDiskDump: Boolean,
    public var spare1: UByteArray,
    deviceObjectCtorArg: MutPtr,
) {
    public var adapterObject: MutPtr = adapterObjectCtorArg
        internal set

    public var mappedRegisterBase: MutPtr = mappedRegisterBaseCtorArg
        internal set

    public var dumpData: MutPtr = dumpDataCtorArg
        internal set

    public var commonBufferVa: MutPtr = commonBufferVaCtorArg
        internal set

    public var deviceObject: MutPtr = deviceObjectCtorArg
        internal set

    public constructor() : this(
        adapterObjectCtorArg = MutPtr(0L),
        mappedRegisterBaseCtorArg = MutPtr(0L),
        dumpDataCtorArg = MutPtr(0L),
        commonBufferVaCtorArg = MutPtr(0L),
        commonBufferPa = 0L,
        commonBufferSize = 0u,
        allocateCommonBuffers = false,
        useDiskDump = false,
        spare1 = UByteArray(2),
        deviceObjectCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.adapterObject

    public operator fun component2(): MutPtr = this.mappedRegisterBase

    public operator fun component3(): MutPtr = this.dumpData

    public operator fun component4(): MutPtr = this.commonBufferVa

    public operator fun component5(): Long = this.commonBufferPa

    public operator fun component6(): UInt = this.commonBufferSize

    public operator fun component7(): Boolean = this.allocateCommonBuffers

    public operator fun component8(): Boolean = this.useDiskDump

    public operator fun component9(): UByteArray = this.spare1

    public operator fun component10(): MutPtr = this.deviceObject

    public fun copy(adapterObject: MutPtr = this.adapterObject, mappedRegisterBase: MutPtr = this.mappedRegisterBase, dumpData: MutPtr = this.dumpData, commonBufferVa: MutPtr = this.commonBufferVa, commonBufferPa: Long = this.commonBufferPa, commonBufferSize: UInt = this.commonBufferSize, allocateCommonBuffers: Boolean = this.allocateCommonBuffers, useDiskDump: Boolean = this.useDiskDump, spare1: UByteArray = this.spare1, deviceObject: MutPtr = this.deviceObject): DumpPointers = DumpPointers(adapterObjectCtorArg = adapterObject, mappedRegisterBaseCtorArg = mappedRegisterBase, dumpDataCtorArg = dumpData, commonBufferVaCtorArg = commonBufferVa, commonBufferPa = commonBufferPa, commonBufferSize = commonBufferSize, allocateCommonBuffers = allocateCommonBuffers, useDiskDump = useDiskDump, spare1 = spare1, deviceObjectCtorArg = deviceObject)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DumpPointers) return false
        if (this.adapterObject != other.adapterObject) return false
        if (this.mappedRegisterBase != other.mappedRegisterBase) return false
        if (this.dumpData != other.dumpData) return false
        if (this.commonBufferVa != other.commonBufferVa) return false
        if (this.commonBufferPa != other.commonBufferPa) return false
        if (this.commonBufferSize != other.commonBufferSize) return false
        if (this.allocateCommonBuffers != other.allocateCommonBuffers) return false
        if (this.useDiskDump != other.useDiskDump) return false
        if (!this.spare1.contentEquals(other.spare1)) return false
        if (this.deviceObject != other.deviceObject) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.adapterObject.hashCode()
        result = 31 * result + this.mappedRegisterBase.hashCode()
        result = 31 * result + this.dumpData.hashCode()
        result = 31 * result + this.commonBufferVa.hashCode()
        result = 31 * result + this.commonBufferPa.hashCode()
        result = 31 * result + this.commonBufferSize.hashCode()
        result = 31 * result + this.allocateCommonBuffers.hashCode()
        result = 31 * result + this.useDiskDump.hashCode()
        result = 31 * result + this.spare1.contentHashCode()
        result = 31 * result + this.deviceObject.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DumpPointers> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DumpPointers> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): DumpPointers =
                    DumpPointers(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 45L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 46L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: DumpPointers) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.adapterObject)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.mappedRegisterBase)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.dumpData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.commonBufferVa)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.commonBufferPa)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.commonBufferSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 44L, value.allocateCommonBuffers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 45L, value.useDiskDump)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 46L, value.spare1.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 48L, value.deviceObject)
                }
            }

        public operator fun invoke(
            adapterObject: MutPtr = MutPtr(0L),
            mappedRegisterBase: MutPtr = MutPtr(0L),
            dumpData: MutPtr = MutPtr(0L),
            commonBufferVa: MutPtr = MutPtr(0L),
            commonBufferPa: Long = 0L,
            commonBufferSize: UInt = 0u,
            allocateCommonBuffers: Boolean = false,
            useDiskDump: Boolean = false,
            spare1: UByteArray = UByteArray(2),
            deviceObject: MutPtr = MutPtr(0L),
        ): DumpPointers =
            DumpPointers(
                adapterObjectCtorArg = adapterObject,
                mappedRegisterBaseCtorArg = mappedRegisterBase,
                dumpDataCtorArg = dumpData,
                commonBufferVaCtorArg = commonBufferVa,
                commonBufferPa = commonBufferPa,
                commonBufferSize = commonBufferSize,
                allocateCommonBuffers = allocateCommonBuffers,
                useDiskDump = useDiskDump,
                spare1 = spare1,
                deviceObjectCtorArg = deviceObject,
            )
    }
}

public class DumpPointersEx internal constructor(
    public var header: DumpPointersVersion,
    dumpDataCtorArg: MutPtr,
    commonBufferVaCtorArg: MutPtr,
    public var commonBufferSize: UInt,
    public var allocateCommonBuffers: Boolean,
    deviceObjectCtorArg: MutPtr,
    driverListCtorArg: MutPtr,
    public var dwPortFlags: UInt,
    public var maxDeviceDumpSectionSize: UInt,
    public var maxDeviceDumpLevel: UInt,
    public var maxTransferSize: UInt,
    adapterObjectCtorArg: MutPtr,
    mappedRegisterBaseCtorArg: MutPtr,
    deviceReadyCtorArg: MutPtr,
    public var dumpDevicePowerOn: PdumpDevicePoweronRoutine,
    dumpDevicePowerOnContextCtorArg: MutPtr,
) {
    public var dumpData: MutPtr = dumpDataCtorArg
        internal set

    public var commonBufferVa: MutPtr = commonBufferVaCtorArg
        internal set

    public var deviceObject: MutPtr = deviceObjectCtorArg
        internal set

    public var driverList: MutPtr = driverListCtorArg
        internal set

    public var adapterObject: MutPtr = adapterObjectCtorArg
        internal set

    public var mappedRegisterBase: MutPtr = mappedRegisterBaseCtorArg
        internal set

    public var deviceReady: MutPtr = deviceReadyCtorArg
        internal set

    public var dumpDevicePowerOnContext: MutPtr = dumpDevicePowerOnContextCtorArg
        internal set

    public constructor() : this(
        header = DumpPointersVersion(),
        dumpDataCtorArg = MutPtr(0L),
        commonBufferVaCtorArg = MutPtr(0L),
        commonBufferSize = 0u,
        allocateCommonBuffers = false,
        deviceObjectCtorArg = MutPtr(0L),
        driverListCtorArg = MutPtr(0L),
        dwPortFlags = 0u,
        maxDeviceDumpSectionSize = 0u,
        maxDeviceDumpLevel = 0u,
        maxTransferSize = 0u,
        adapterObjectCtorArg = MutPtr(0L),
        mappedRegisterBaseCtorArg = MutPtr(0L),
        deviceReadyCtorArg = MutPtr(0L),
        dumpDevicePowerOn = null,
        dumpDevicePowerOnContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): DumpPointersVersion = this.header

    public operator fun component2(): MutPtr = this.dumpData

    public operator fun component3(): MutPtr = this.commonBufferVa

    public operator fun component4(): UInt = this.commonBufferSize

    public operator fun component5(): Boolean = this.allocateCommonBuffers

    public operator fun component6(): MutPtr = this.deviceObject

    public operator fun component7(): MutPtr = this.driverList

    public operator fun component8(): UInt = this.dwPortFlags

    public operator fun component9(): UInt = this.maxDeviceDumpSectionSize

    public operator fun component10(): UInt = this.maxDeviceDumpLevel

    public operator fun component11(): UInt = this.maxTransferSize

    public operator fun component12(): MutPtr = this.adapterObject

    public operator fun component13(): MutPtr = this.mappedRegisterBase

    public operator fun component14(): MutPtr = this.deviceReady

    public operator fun component15(): PdumpDevicePoweronRoutine = this.dumpDevicePowerOn

    public operator fun component16(): MutPtr = this.dumpDevicePowerOnContext

    public fun copy(header: DumpPointersVersion = this.header, dumpData: MutPtr = this.dumpData, commonBufferVa: MutPtr = this.commonBufferVa, commonBufferSize: UInt = this.commonBufferSize, allocateCommonBuffers: Boolean = this.allocateCommonBuffers, deviceObject: MutPtr = this.deviceObject, driverList: MutPtr = this.driverList, dwPortFlags: UInt = this.dwPortFlags, maxDeviceDumpSectionSize: UInt = this.maxDeviceDumpSectionSize, maxDeviceDumpLevel: UInt = this.maxDeviceDumpLevel, maxTransferSize: UInt = this.maxTransferSize, adapterObject: MutPtr = this.adapterObject, mappedRegisterBase: MutPtr = this.mappedRegisterBase, deviceReady: MutPtr = this.deviceReady, dumpDevicePowerOn: PdumpDevicePoweronRoutine = this.dumpDevicePowerOn, dumpDevicePowerOnContext: MutPtr = this.dumpDevicePowerOnContext): DumpPointersEx = DumpPointersEx(header = header, dumpDataCtorArg = dumpData, commonBufferVaCtorArg = commonBufferVa, commonBufferSize = commonBufferSize, allocateCommonBuffers = allocateCommonBuffers, deviceObjectCtorArg = deviceObject, driverListCtorArg = driverList, dwPortFlags = dwPortFlags, maxDeviceDumpSectionSize = maxDeviceDumpSectionSize, maxDeviceDumpLevel = maxDeviceDumpLevel, maxTransferSize = maxTransferSize, adapterObjectCtorArg = adapterObject, mappedRegisterBaseCtorArg = mappedRegisterBase, deviceReadyCtorArg = deviceReady, dumpDevicePowerOn = dumpDevicePowerOn, dumpDevicePowerOnContextCtorArg = dumpDevicePowerOnContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DumpPointersEx) return false
        if (this.header != other.header) return false
        if (this.dumpData != other.dumpData) return false
        if (this.commonBufferVa != other.commonBufferVa) return false
        if (this.commonBufferSize != other.commonBufferSize) return false
        if (this.allocateCommonBuffers != other.allocateCommonBuffers) return false
        if (this.deviceObject != other.deviceObject) return false
        if (this.driverList != other.driverList) return false
        if (this.dwPortFlags != other.dwPortFlags) return false
        if (this.maxDeviceDumpSectionSize != other.maxDeviceDumpSectionSize) return false
        if (this.maxDeviceDumpLevel != other.maxDeviceDumpLevel) return false
        if (this.maxTransferSize != other.maxTransferSize) return false
        if (this.adapterObject != other.adapterObject) return false
        if (this.mappedRegisterBase != other.mappedRegisterBase) return false
        if (this.deviceReady != other.deviceReady) return false
        if (this.dumpDevicePowerOn != other.dumpDevicePowerOn) return false
        if (this.dumpDevicePowerOnContext != other.dumpDevicePowerOnContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.dumpData.hashCode()
        result = 31 * result + this.commonBufferVa.hashCode()
        result = 31 * result + this.commonBufferSize.hashCode()
        result = 31 * result + this.allocateCommonBuffers.hashCode()
        result = 31 * result + this.deviceObject.hashCode()
        result = 31 * result + this.driverList.hashCode()
        result = 31 * result + this.dwPortFlags.hashCode()
        result = 31 * result + this.maxDeviceDumpSectionSize.hashCode()
        result = 31 * result + this.maxDeviceDumpLevel.hashCode()
        result = 31 * result + this.maxTransferSize.hashCode()
        result = 31 * result + this.adapterObject.hashCode()
        result = 31 * result + this.mappedRegisterBase.hashCode()
        result = 31 * result + this.deviceReady.hashCode()
        result = 31 * result + this.dumpDevicePowerOn.hashCode()
        result = 31 * result + this.dumpDevicePowerOnContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            header: DumpPointersVersion = DumpPointersVersion(),
            dumpData: MutPtr = MutPtr(0L),
            commonBufferVa: MutPtr = MutPtr(0L),
            commonBufferSize: UInt = 0u,
            allocateCommonBuffers: Boolean = false,
            deviceObject: MutPtr = MutPtr(0L),
            driverList: MutPtr = MutPtr(0L),
            dwPortFlags: UInt = 0u,
            maxDeviceDumpSectionSize: UInt = 0u,
            maxDeviceDumpLevel: UInt = 0u,
            maxTransferSize: UInt = 0u,
            adapterObject: MutPtr = MutPtr(0L),
            mappedRegisterBase: MutPtr = MutPtr(0L),
            deviceReady: MutPtr = MutPtr(0L),
            dumpDevicePowerOn: PdumpDevicePoweronRoutine = null,
            dumpDevicePowerOnContext: MutPtr = MutPtr(0L),
        ): DumpPointersEx =
            DumpPointersEx(
                header = header,
                dumpDataCtorArg = dumpData,
                commonBufferVaCtorArg = commonBufferVa,
                commonBufferSize = commonBufferSize,
                allocateCommonBuffers = allocateCommonBuffers,
                deviceObjectCtorArg = deviceObject,
                driverListCtorArg = driverList,
                dwPortFlags = dwPortFlags,
                maxDeviceDumpSectionSize = maxDeviceDumpSectionSize,
                maxDeviceDumpLevel = maxDeviceDumpLevel,
                maxTransferSize = maxTransferSize,
                adapterObjectCtorArg = adapterObject,
                mappedRegisterBaseCtorArg = mappedRegisterBase,
                deviceReadyCtorArg = deviceReady,
                dumpDevicePowerOn = dumpDevicePowerOn,
                dumpDevicePowerOnContextCtorArg = dumpDevicePowerOnContext,
            )
    }
}

public data class DumpPointersVersion(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DumpPointersVersion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DumpPointersVersion> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DumpPointersVersion =
                    DumpPointersVersion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DumpPointersVersion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                }
            }
    }
}

public data class FirmwareRequestBlock(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var function: UInt = 0u,
    public var flags: UInt = 0u,
    public var dataBufferOffset: UInt = 0u,
    public var dataBufferLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FirmwareRequestBlock> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FirmwareRequestBlock> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): FirmwareRequestBlock =
                    FirmwareRequestBlock(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: FirmwareRequestBlock) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.function)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dataBufferOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dataBufferLength)
                }
            }
    }
}

public data class HybridDemoteBySize(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var sourcePriority: UByte = 0u,
    public var targetPriority: UByte = 0u,
    public var reserved0: UShort = 0u,
    public var reserved1: UInt = 0u,
    public var lbaCount: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HybridDemoteBySize> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HybridDemoteBySize> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): HybridDemoteBySize =
                    HybridDemoteBySize(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: HybridDemoteBySize) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.sourcePriority)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.targetPriority)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.reserved0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.lbaCount)
                }
            }
    }
}

public data class HybridDirtyThresholds(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var dirtyLowThreshold: UInt = 0u,
    public var dirtyHighThreshold: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HybridDirtyThresholds> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HybridDirtyThresholds> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): HybridDirtyThresholds =
                    HybridDirtyThresholds(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: HybridDirtyThresholds) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dirtyLowThreshold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dirtyHighThreshold)
                }
            }
    }
}

public data class HybridInformation(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var hybridSupported: Boolean = false,
    public var status: NvcacheStatus = 0,
    public var cacheTypeEffective: NvcacheType = 0,
    public var cacheTypeDefault: NvcacheType = 0,
    public var fractionBase: UInt = 0u,
    public var cacheSize: ULong = 0uL,
    public var attributes: HybridInformation0 = HybridInformation0(),
    public var priorities: HybridInformation1 = HybridInformation1(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HybridInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HybridInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 96L
                override fun readNative(addr: Long): HybridInformation =
                    HybridInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (HybridInformation0.typeLayout()).readNative(addr + 40L),
                        (HybridInformation1.typeLayout()).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: HybridInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.hybridSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.status)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.cacheTypeEffective)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.cacheTypeDefault)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.fractionBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.cacheSize)
                    (HybridInformation0.typeLayout()).writeNative(addr + 40L, value.attributes)
                    (HybridInformation1.typeLayout()).writeNative(addr + 44L, value.priorities)
                }
            }
    }
}

public data class HybridInformation0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HybridInformation0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HybridInformation0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): HybridInformation0 =
                    HybridInformation0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: HybridInformation0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class HybridInformation1(
    public var priorityLevelCount: UByte = 0u,
    public var maxPriorityBehavior: Boolean = false,
    public var optimalWriteGranularity: UByte = 0u,
    public var reserved: UByte = 0u,
    public var dirtyThresholdLow: UInt = 0u,
    public var dirtyThresholdHigh: UInt = 0u,
    public var supportedCommands: HybridInformation10 = HybridInformation10(),
    public var priority: List<NvcachePriorityLevelDescriptor> = List(1) { NvcachePriorityLevelDescriptor() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HybridInformation1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HybridInformation1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 52L
                override fun readNative(addr: Long): HybridInformation1 =
                    HybridInformation1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (HybridInformation10.typeLayout()).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(NvcachePriorityLevelDescriptor.typeLayout(), (1).toInt())
                        ).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: HybridInformation1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.priorityLevelCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 1L, value.maxPriorityBehavior)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.optimalWriteGranularity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dirtyThresholdLow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dirtyThresholdHigh)
                    (HybridInformation10.typeLayout()).writeNative(addr + 12L, value.supportedCommands)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(NvcachePriorityLevelDescriptor.typeLayout(), (1).toInt())
                    ).writeNative(addr + 28L, value.priority)
                }
            }
    }
}

public data class HybridInformation10(
    public var bitfield: UInt = 0u,
    public var maxEvictCommands: UInt = 0u,
    public var maxLbaRangeCountForEvict: UInt = 0u,
    public var maxLbaRangeCountForChangeLba: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HybridInformation10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HybridInformation10> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): HybridInformation10 =
                    HybridInformation10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: HybridInformation10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxEvictCommands)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.maxLbaRangeCountForEvict)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.maxLbaRangeCountForChangeLba)
                }
            }
    }
}

public data class HybridRequestBlock(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var function: UInt = 0u,
    public var flags: UInt = 0u,
    public var dataBufferOffset: UInt = 0u,
    public var dataBufferLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HybridRequestBlock> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HybridRequestBlock> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): HybridRequestBlock =
                    HybridRequestBlock(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: HybridRequestBlock) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.function)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dataBufferOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dataBufferLength)
                }
            }
    }
}

public data class IdeIoControl(
    public var headerLength: UInt = 0u,
    public var signature: UByteArray = UByteArray(8),
    public var timeout: UInt = 0u,
    public var controlCode: UInt = 0u,
    public var returnStatus: UInt = 0u,
    public var dataLength: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IdeIoControl) return false
        if (this.headerLength != other.headerLength) return false
        if (!this.signature.contentEquals(other.signature)) return false
        if (this.timeout != other.timeout) return false
        if (this.controlCode != other.controlCode) return false
        if (this.returnStatus != other.returnStatus) return false
        if (this.dataLength != other.dataLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.headerLength.hashCode()
        result = 31 * result + this.signature.contentHashCode()
        result = 31 * result + this.timeout.hashCode()
        result = 31 * result + this.controlCode.hashCode()
        result = 31 * result + this.returnStatus.hashCode()
        result = 31 * result + this.dataLength.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IdeIoControl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IdeIoControl> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): IdeIoControl =
                    IdeIoControl(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: IdeIoControl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.headerLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 4L, value.signature.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.timeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.controlCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.returnStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dataLength)
                }
            }
    }
}

public data class IkeAuthenticationInformation(
    public var authMethod: IkeAuthenticationMethod = 0,
    public var anonymous: IkeAuthenticationInformation0 = IkeAuthenticationInformation0(),
)

public data class IkeAuthenticationInformation0(
    public var psKey: IkeAuthenticationPresharedKey = IkeAuthenticationPresharedKey(),
)

public class IkeAuthenticationPresharedKey internal constructor(
    public var securityFlags: ULong,
    public var idType: UByte,
    public var idLengthInBytes: UInt,
    idCtorArg: MutPtr,
    public var keyLengthInBytes: UInt,
    keyCtorArg: MutPtr,
) {
    public var id: MutPtr = idCtorArg
        internal set

    public var key: MutPtr = keyCtorArg
        internal set

    public constructor() : this(
        securityFlags = 0uL,
        idType = 0u,
        idLengthInBytes = 0u,
        idCtorArg = MutPtr(0L),
        keyLengthInBytes = 0u,
        keyCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ULong = this.securityFlags

    public operator fun component2(): UByte = this.idType

    public operator fun component3(): UInt = this.idLengthInBytes

    public operator fun component4(): MutPtr = this.id

    public operator fun component5(): UInt = this.keyLengthInBytes

    public operator fun component6(): MutPtr = this.key

    public fun copy(securityFlags: ULong = this.securityFlags, idType: UByte = this.idType, idLengthInBytes: UInt = this.idLengthInBytes, id: MutPtr = this.id, keyLengthInBytes: UInt = this.keyLengthInBytes, key: MutPtr = this.key): IkeAuthenticationPresharedKey = IkeAuthenticationPresharedKey(securityFlags = securityFlags, idType = idType, idLengthInBytes = idLengthInBytes, idCtorArg = id, keyLengthInBytes = keyLengthInBytes, keyCtorArg = key)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IkeAuthenticationPresharedKey) return false
        if (this.securityFlags != other.securityFlags) return false
        if (this.idType != other.idType) return false
        if (this.idLengthInBytes != other.idLengthInBytes) return false
        if (this.id != other.id) return false
        if (this.keyLengthInBytes != other.keyLengthInBytes) return false
        if (this.key != other.key) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.securityFlags.hashCode()
        result = 31 * result + this.idType.hashCode()
        result = 31 * result + this.idLengthInBytes.hashCode()
        result = 31 * result + this.id.hashCode()
        result = 31 * result + this.keyLengthInBytes.hashCode()
        result = 31 * result + this.key.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeAuthenticationPresharedKey> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IkeAuthenticationPresharedKey> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): IkeAuthenticationPresharedKey =
                    IkeAuthenticationPresharedKey(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: IkeAuthenticationPresharedKey) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.securityFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.idType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.idLengthInBytes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.id)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.keyLengthInBytes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.key)
                }
            }

        public operator fun invoke(
            securityFlags: ULong = 0uL,
            idType: UByte = 0u,
            idLengthInBytes: UInt = 0u,
            id: MutPtr = MutPtr(0L),
            keyLengthInBytes: UInt = 0u,
            key: MutPtr = MutPtr(0L),
        ): IkeAuthenticationPresharedKey =
            IkeAuthenticationPresharedKey(
                securityFlags = securityFlags,
                idType = idType,
                idLengthInBytes = idLengthInBytes,
                idCtorArg = id,
                keyLengthInBytes = keyLengthInBytes,
                keyCtorArg = key,
            )
    }
}

public data class IoScsiCapabilities(
    public var length: UInt = 0u,
    public var maximumTransferLength: UInt = 0u,
    public var maximumPhysicalPages: UInt = 0u,
    public var supportedAsynchronousEvents: UInt = 0u,
    public var alignmentMask: UInt = 0u,
    public var taggedQueuing: Boolean = false,
    public var adapterScansDown: Boolean = false,
    public var adapterUsesPio: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoScsiCapabilities> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoScsiCapabilities> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): IoScsiCapabilities =
                    IoScsiCapabilities(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 21L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 22L),
                    )
                override fun writeNative(addr: Long, value: IoScsiCapabilities) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maximumTransferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.maximumPhysicalPages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.supportedAsynchronousEvents)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.alignmentMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 20L, value.taggedQueuing)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 21L, value.adapterScansDown)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 22L, value.adapterUsesPio)
                }
            }
    }
}

public class IscsiConnectionInfoa internal constructor(
    public var connectionId: IscsiUniqueSessionId,
    initiatorAddressCtorArg: Pstr,
    targetAddressCtorArg: Pstr,
    public var initiatorSocket: UShort,
    public var targetSocket: UShort,
    public var cid: UByteArray,
) {
    public var initiatorAddress: Pstr = initiatorAddressCtorArg
        internal set

    public var targetAddress: Pstr = targetAddressCtorArg
        internal set

    public constructor() : this(
        connectionId = IscsiUniqueSessionId(),
        initiatorAddressCtorArg = MutPtr(0L),
        targetAddressCtorArg = MutPtr(0L),
        initiatorSocket = 0u,
        targetSocket = 0u,
        cid = UByteArray(2),
    )

    public operator fun component1(): IscsiUniqueSessionId = this.connectionId

    public operator fun component2(): Pstr = this.initiatorAddress

    public operator fun component3(): Pstr = this.targetAddress

    public operator fun component4(): UShort = this.initiatorSocket

    public operator fun component5(): UShort = this.targetSocket

    public operator fun component6(): UByteArray = this.cid

    public fun copy(connectionId: IscsiUniqueSessionId = this.connectionId, initiatorAddress: Pstr = this.initiatorAddress, targetAddress: Pstr = this.targetAddress, initiatorSocket: UShort = this.initiatorSocket, targetSocket: UShort = this.targetSocket, cid: UByteArray = this.cid): IscsiConnectionInfoa = IscsiConnectionInfoa(connectionId = connectionId, initiatorAddressCtorArg = initiatorAddress, targetAddressCtorArg = targetAddress, initiatorSocket = initiatorSocket, targetSocket = targetSocket, cid = cid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IscsiConnectionInfoa) return false
        if (this.connectionId != other.connectionId) return false
        if (this.initiatorAddress != other.initiatorAddress) return false
        if (this.targetAddress != other.targetAddress) return false
        if (this.initiatorSocket != other.initiatorSocket) return false
        if (this.targetSocket != other.targetSocket) return false
        if (!this.cid.contentEquals(other.cid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.connectionId.hashCode()
        result = 31 * result + this.initiatorAddress.hashCode()
        result = 31 * result + this.targetAddress.hashCode()
        result = 31 * result + this.initiatorSocket.hashCode()
        result = 31 * result + this.targetSocket.hashCode()
        result = 31 * result + this.cid.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            connectionId: IscsiUniqueSessionId = IscsiUniqueSessionId(),
            initiatorAddress: Pstr = MutPtr(0L),
            targetAddress: Pstr = MutPtr(0L),
            initiatorSocket: UShort = 0u,
            targetSocket: UShort = 0u,
            cid: UByteArray = UByteArray(2),
        ): IscsiConnectionInfoa =
            IscsiConnectionInfoa(
                connectionId = connectionId,
                initiatorAddressCtorArg = initiatorAddress,
                targetAddressCtorArg = targetAddress,
                initiatorSocket = initiatorSocket,
                targetSocket = targetSocket,
                cid = cid,
            )
    }
}

public class IscsiConnectionInfow internal constructor(
    public var connectionId: IscsiUniqueSessionId,
    initiatorAddressCtorArg: Pwstr,
    targetAddressCtorArg: Pwstr,
    public var initiatorSocket: UShort,
    public var targetSocket: UShort,
    public var cid: UByteArray,
) {
    public var initiatorAddress: Pwstr = initiatorAddressCtorArg
        internal set

    public var targetAddress: Pwstr = targetAddressCtorArg
        internal set

    public constructor() : this(
        connectionId = IscsiUniqueSessionId(),
        initiatorAddressCtorArg = MutPtr(0L),
        targetAddressCtorArg = MutPtr(0L),
        initiatorSocket = 0u,
        targetSocket = 0u,
        cid = UByteArray(2),
    )

    public operator fun component1(): IscsiUniqueSessionId = this.connectionId

    public operator fun component2(): Pwstr = this.initiatorAddress

    public operator fun component3(): Pwstr = this.targetAddress

    public operator fun component4(): UShort = this.initiatorSocket

    public operator fun component5(): UShort = this.targetSocket

    public operator fun component6(): UByteArray = this.cid

    public fun copy(connectionId: IscsiUniqueSessionId = this.connectionId, initiatorAddress: Pwstr = this.initiatorAddress, targetAddress: Pwstr = this.targetAddress, initiatorSocket: UShort = this.initiatorSocket, targetSocket: UShort = this.targetSocket, cid: UByteArray = this.cid): IscsiConnectionInfow = IscsiConnectionInfow(connectionId = connectionId, initiatorAddressCtorArg = initiatorAddress, targetAddressCtorArg = targetAddress, initiatorSocket = initiatorSocket, targetSocket = targetSocket, cid = cid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IscsiConnectionInfow) return false
        if (this.connectionId != other.connectionId) return false
        if (this.initiatorAddress != other.initiatorAddress) return false
        if (this.targetAddress != other.targetAddress) return false
        if (this.initiatorSocket != other.initiatorSocket) return false
        if (this.targetSocket != other.targetSocket) return false
        if (!this.cid.contentEquals(other.cid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.connectionId.hashCode()
        result = 31 * result + this.initiatorAddress.hashCode()
        result = 31 * result + this.targetAddress.hashCode()
        result = 31 * result + this.initiatorSocket.hashCode()
        result = 31 * result + this.targetSocket.hashCode()
        result = 31 * result + this.cid.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            connectionId: IscsiUniqueSessionId = IscsiUniqueSessionId(),
            initiatorAddress: Pwstr = MutPtr(0L),
            targetAddress: Pwstr = MutPtr(0L),
            initiatorSocket: UShort = 0u,
            targetSocket: UShort = 0u,
            cid: UByteArray = UByteArray(2),
        ): IscsiConnectionInfow =
            IscsiConnectionInfow(
                connectionId = connectionId,
                initiatorAddressCtorArg = initiatorAddress,
                targetAddressCtorArg = targetAddress,
                initiatorSocket = initiatorSocket,
                targetSocket = targetSocket,
                cid = cid,
            )
    }
}

public data class IscsiConnectionInfoEx(
    public var connectionId: IscsiUniqueSessionId = IscsiUniqueSessionId(),
    public var state: UByte = 0u,
    public var protocol: UByte = 0u,
    public var headerDigest: UByte = 0u,
    public var dataDigest: UByte = 0u,
    public var maxRecvDataSegmentLength: UInt = 0u,
    public var authType: IscsiAuthTypes = 0,
    public var estimatedThroughput: ULong = 0uL,
    public var maxDatagramSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IscsiConnectionInfoEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IscsiConnectionInfoEx> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): IscsiConnectionInfoEx =
                    IscsiConnectionInfoEx(
                        (IscsiUniqueSessionId.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 19L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: IscsiConnectionInfoEx) {
                    (IscsiUniqueSessionId.typeLayout()).writeNative(addr, value.connectionId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.state)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.protocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 18L, value.headerDigest)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 19L, value.dataDigest)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.maxRecvDataSegmentLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.authType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.estimatedThroughput)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.maxDatagramSize)
                }
            }
    }
}

public data class IscsiDeviceOnSessiona(
    public var initiatorName: ByteArray = ByteArray(256),
    public var targetName: ByteArray = ByteArray(224),
    public var scsiAddress: ScsiAddress = ScsiAddress(),
    public var deviceInterfaceType: Guid = Guid(),
    public var deviceInterfaceName: ByteArray = ByteArray(260),
    public var legacyName: ByteArray = ByteArray(260),
    public var storageDeviceNumber: StorageDeviceNumber = StorageDeviceNumber(),
    public var deviceInstance: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IscsiDeviceOnSessiona) return false
        if (!this.initiatorName.contentEquals(other.initiatorName)) return false
        if (!this.targetName.contentEquals(other.targetName)) return false
        if (this.scsiAddress != other.scsiAddress) return false
        if (this.deviceInterfaceType != other.deviceInterfaceType) return false
        if (!this.deviceInterfaceName.contentEquals(other.deviceInterfaceName)) return false
        if (!this.legacyName.contentEquals(other.legacyName)) return false
        if (this.storageDeviceNumber != other.storageDeviceNumber) return false
        if (this.deviceInstance != other.deviceInstance) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.initiatorName.contentHashCode()
        result = 31 * result + this.targetName.contentHashCode()
        result = 31 * result + this.scsiAddress.hashCode()
        result = 31 * result + this.deviceInterfaceType.hashCode()
        result = 31 * result + this.deviceInterfaceName.contentHashCode()
        result = 31 * result + this.legacyName.contentHashCode()
        result = 31 * result + this.storageDeviceNumber.hashCode()
        result = 31 * result + this.deviceInstance.hashCode()
        return result
    }
}

public data class IscsiDeviceOnSessionw(
    public var initiatorName: UShortArray = UShortArray(256),
    public var targetName: UShortArray = UShortArray(224),
    public var scsiAddress: ScsiAddress = ScsiAddress(),
    public var deviceInterfaceType: Guid = Guid(),
    public var deviceInterfaceName: UShortArray = UShortArray(260),
    public var legacyName: UShortArray = UShortArray(260),
    public var storageDeviceNumber: StorageDeviceNumber = StorageDeviceNumber(),
    public var deviceInstance: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IscsiDeviceOnSessionw) return false
        if (!this.initiatorName.contentEquals(other.initiatorName)) return false
        if (!this.targetName.contentEquals(other.targetName)) return false
        if (this.scsiAddress != other.scsiAddress) return false
        if (this.deviceInterfaceType != other.deviceInterfaceType) return false
        if (!this.deviceInterfaceName.contentEquals(other.deviceInterfaceName)) return false
        if (!this.legacyName.contentEquals(other.legacyName)) return false
        if (this.storageDeviceNumber != other.storageDeviceNumber) return false
        if (this.deviceInstance != other.deviceInstance) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.initiatorName.contentHashCode()
        result = 31 * result + this.targetName.contentHashCode()
        result = 31 * result + this.scsiAddress.hashCode()
        result = 31 * result + this.deviceInterfaceType.hashCode()
        result = 31 * result + this.deviceInterfaceName.contentHashCode()
        result = 31 * result + this.legacyName.contentHashCode()
        result = 31 * result + this.storageDeviceNumber.hashCode()
        result = 31 * result + this.deviceInstance.hashCode()
        return result
    }
}

public class IscsiLoginOptions internal constructor(
    public var version: UInt,
    public var informationSpecified: UInt,
    public var loginFlags: UInt,
    public var authType: IscsiAuthTypes,
    public var headerDigest: IscsiDigestTypes,
    public var dataDigest: IscsiDigestTypes,
    public var maximumConnections: UInt,
    public var defaultTime2Wait: UInt,
    public var defaultTime2Retain: UInt,
    public var usernameLength: UInt,
    public var passwordLength: UInt,
    usernameCtorArg: MutPtr,
    passwordCtorArg: MutPtr,
) {
    public var username: MutPtr = usernameCtorArg
        internal set

    public var password: MutPtr = passwordCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        informationSpecified = 0u,
        loginFlags = 0u,
        authType = 0,
        headerDigest = 0,
        dataDigest = 0,
        maximumConnections = 0u,
        defaultTime2Wait = 0u,
        defaultTime2Retain = 0u,
        usernameLength = 0u,
        passwordLength = 0u,
        usernameCtorArg = MutPtr(0L),
        passwordCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): UInt = this.informationSpecified

    public operator fun component3(): UInt = this.loginFlags

    public operator fun component4(): IscsiAuthTypes = this.authType

    public operator fun component5(): IscsiDigestTypes = this.headerDigest

    public operator fun component6(): IscsiDigestTypes = this.dataDigest

    public operator fun component7(): UInt = this.maximumConnections

    public operator fun component8(): UInt = this.defaultTime2Wait

    public operator fun component9(): UInt = this.defaultTime2Retain

    public operator fun component10(): UInt = this.usernameLength

    public operator fun component11(): UInt = this.passwordLength

    public operator fun component12(): MutPtr = this.username

    public operator fun component13(): MutPtr = this.password

    public fun copy(version: UInt = this.version, informationSpecified: UInt = this.informationSpecified, loginFlags: UInt = this.loginFlags, authType: IscsiAuthTypes = this.authType, headerDigest: IscsiDigestTypes = this.headerDigest, dataDigest: IscsiDigestTypes = this.dataDigest, maximumConnections: UInt = this.maximumConnections, defaultTime2Wait: UInt = this.defaultTime2Wait, defaultTime2Retain: UInt = this.defaultTime2Retain, usernameLength: UInt = this.usernameLength, passwordLength: UInt = this.passwordLength, username: MutPtr = this.username, password: MutPtr = this.password): IscsiLoginOptions = IscsiLoginOptions(version = version, informationSpecified = informationSpecified, loginFlags = loginFlags, authType = authType, headerDigest = headerDigest, dataDigest = dataDigest, maximumConnections = maximumConnections, defaultTime2Wait = defaultTime2Wait, defaultTime2Retain = defaultTime2Retain, usernameLength = usernameLength, passwordLength = passwordLength, usernameCtorArg = username, passwordCtorArg = password)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IscsiLoginOptions) return false
        if (this.version != other.version) return false
        if (this.informationSpecified != other.informationSpecified) return false
        if (this.loginFlags != other.loginFlags) return false
        if (this.authType != other.authType) return false
        if (this.headerDigest != other.headerDigest) return false
        if (this.dataDigest != other.dataDigest) return false
        if (this.maximumConnections != other.maximumConnections) return false
        if (this.defaultTime2Wait != other.defaultTime2Wait) return false
        if (this.defaultTime2Retain != other.defaultTime2Retain) return false
        if (this.usernameLength != other.usernameLength) return false
        if (this.passwordLength != other.passwordLength) return false
        if (this.username != other.username) return false
        if (this.password != other.password) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.informationSpecified.hashCode()
        result = 31 * result + this.loginFlags.hashCode()
        result = 31 * result + this.authType.hashCode()
        result = 31 * result + this.headerDigest.hashCode()
        result = 31 * result + this.dataDigest.hashCode()
        result = 31 * result + this.maximumConnections.hashCode()
        result = 31 * result + this.defaultTime2Wait.hashCode()
        result = 31 * result + this.defaultTime2Retain.hashCode()
        result = 31 * result + this.usernameLength.hashCode()
        result = 31 * result + this.passwordLength.hashCode()
        result = 31 * result + this.username.hashCode()
        result = 31 * result + this.password.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IscsiLoginOptions> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IscsiLoginOptions> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): IscsiLoginOptions =
                    IscsiLoginOptions(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: IscsiLoginOptions) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.informationSpecified)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.loginFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.authType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.headerDigest)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.dataDigest)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.maximumConnections)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.defaultTime2Wait)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.defaultTime2Retain)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.usernameLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.passwordLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 48L, value.username)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 56L, value.password)
                }
            }

        public operator fun invoke(
            version: UInt = 0u,
            informationSpecified: UInt = 0u,
            loginFlags: UInt = 0u,
            authType: IscsiAuthTypes = 0,
            headerDigest: IscsiDigestTypes = 0,
            dataDigest: IscsiDigestTypes = 0,
            maximumConnections: UInt = 0u,
            defaultTime2Wait: UInt = 0u,
            defaultTime2Retain: UInt = 0u,
            usernameLength: UInt = 0u,
            passwordLength: UInt = 0u,
            username: MutPtr = MutPtr(0L),
            password: MutPtr = MutPtr(0L),
        ): IscsiLoginOptions =
            IscsiLoginOptions(
                version = version,
                informationSpecified = informationSpecified,
                loginFlags = loginFlags,
                authType = authType,
                headerDigest = headerDigest,
                dataDigest = dataDigest,
                maximumConnections = maximumConnections,
                defaultTime2Wait = defaultTime2Wait,
                defaultTime2Retain = defaultTime2Retain,
                usernameLength = usernameLength,
                passwordLength = passwordLength,
                usernameCtorArg = username,
                passwordCtorArg = password,
            )
    }
}

public class IscsiSessionInfoa internal constructor(
    public var sessionId: IscsiUniqueSessionId,
    initiatorNameCtorArg: Pstr,
    targetNodeNameCtorArg: Pstr,
    targetNameCtorArg: Pstr,
    public var isid: UByteArray,
    public var tsid: UByteArray,
    public var connectionCount: UInt,
    connectionsCtorArg: MutPtr,
) {
    public var initiatorName: Pstr = initiatorNameCtorArg
        internal set

    public var targetNodeName: Pstr = targetNodeNameCtorArg
        internal set

    public var targetName: Pstr = targetNameCtorArg
        internal set

    public var connections: MutPtr = connectionsCtorArg
        internal set

    public constructor() : this(
        sessionId = IscsiUniqueSessionId(),
        initiatorNameCtorArg = MutPtr(0L),
        targetNodeNameCtorArg = MutPtr(0L),
        targetNameCtorArg = MutPtr(0L),
        isid = UByteArray(6),
        tsid = UByteArray(2),
        connectionCount = 0u,
        connectionsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): IscsiUniqueSessionId = this.sessionId

    public operator fun component2(): Pstr = this.initiatorName

    public operator fun component3(): Pstr = this.targetNodeName

    public operator fun component4(): Pstr = this.targetName

    public operator fun component5(): UByteArray = this.isid

    public operator fun component6(): UByteArray = this.tsid

    public operator fun component7(): UInt = this.connectionCount

    public operator fun component8(): MutPtr = this.connections

    public fun copy(sessionId: IscsiUniqueSessionId = this.sessionId, initiatorName: Pstr = this.initiatorName, targetNodeName: Pstr = this.targetNodeName, targetName: Pstr = this.targetName, isid: UByteArray = this.isid, tsid: UByteArray = this.tsid, connectionCount: UInt = this.connectionCount, connections: MutPtr = this.connections): IscsiSessionInfoa = IscsiSessionInfoa(sessionId = sessionId, initiatorNameCtorArg = initiatorName, targetNodeNameCtorArg = targetNodeName, targetNameCtorArg = targetName, isid = isid, tsid = tsid, connectionCount = connectionCount, connectionsCtorArg = connections)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IscsiSessionInfoa) return false
        if (this.sessionId != other.sessionId) return false
        if (this.initiatorName != other.initiatorName) return false
        if (this.targetNodeName != other.targetNodeName) return false
        if (this.targetName != other.targetName) return false
        if (!this.isid.contentEquals(other.isid)) return false
        if (!this.tsid.contentEquals(other.tsid)) return false
        if (this.connectionCount != other.connectionCount) return false
        if (this.connections != other.connections) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sessionId.hashCode()
        result = 31 * result + this.initiatorName.hashCode()
        result = 31 * result + this.targetNodeName.hashCode()
        result = 31 * result + this.targetName.hashCode()
        result = 31 * result + this.isid.contentHashCode()
        result = 31 * result + this.tsid.contentHashCode()
        result = 31 * result + this.connectionCount.hashCode()
        result = 31 * result + this.connections.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sessionId: IscsiUniqueSessionId = IscsiUniqueSessionId(),
            initiatorName: Pstr = MutPtr(0L),
            targetNodeName: Pstr = MutPtr(0L),
            targetName: Pstr = MutPtr(0L),
            isid: UByteArray = UByteArray(6),
            tsid: UByteArray = UByteArray(2),
            connectionCount: UInt = 0u,
            connections: MutPtr = MutPtr(0L),
        ): IscsiSessionInfoa =
            IscsiSessionInfoa(
                sessionId = sessionId,
                initiatorNameCtorArg = initiatorName,
                targetNodeNameCtorArg = targetNodeName,
                targetNameCtorArg = targetName,
                isid = isid,
                tsid = tsid,
                connectionCount = connectionCount,
                connectionsCtorArg = connections,
            )
    }
}

public class IscsiSessionInfow internal constructor(
    public var sessionId: IscsiUniqueSessionId,
    initiatorNameCtorArg: Pwstr,
    targetNodeNameCtorArg: Pwstr,
    targetNameCtorArg: Pwstr,
    public var isid: UByteArray,
    public var tsid: UByteArray,
    public var connectionCount: UInt,
    connectionsCtorArg: MutPtr,
) {
    public var initiatorName: Pwstr = initiatorNameCtorArg
        internal set

    public var targetNodeName: Pwstr = targetNodeNameCtorArg
        internal set

    public var targetName: Pwstr = targetNameCtorArg
        internal set

    public var connections: MutPtr = connectionsCtorArg
        internal set

    public constructor() : this(
        sessionId = IscsiUniqueSessionId(),
        initiatorNameCtorArg = MutPtr(0L),
        targetNodeNameCtorArg = MutPtr(0L),
        targetNameCtorArg = MutPtr(0L),
        isid = UByteArray(6),
        tsid = UByteArray(2),
        connectionCount = 0u,
        connectionsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): IscsiUniqueSessionId = this.sessionId

    public operator fun component2(): Pwstr = this.initiatorName

    public operator fun component3(): Pwstr = this.targetNodeName

    public operator fun component4(): Pwstr = this.targetName

    public operator fun component5(): UByteArray = this.isid

    public operator fun component6(): UByteArray = this.tsid

    public operator fun component7(): UInt = this.connectionCount

    public operator fun component8(): MutPtr = this.connections

    public fun copy(sessionId: IscsiUniqueSessionId = this.sessionId, initiatorName: Pwstr = this.initiatorName, targetNodeName: Pwstr = this.targetNodeName, targetName: Pwstr = this.targetName, isid: UByteArray = this.isid, tsid: UByteArray = this.tsid, connectionCount: UInt = this.connectionCount, connections: MutPtr = this.connections): IscsiSessionInfow = IscsiSessionInfow(sessionId = sessionId, initiatorNameCtorArg = initiatorName, targetNodeNameCtorArg = targetNodeName, targetNameCtorArg = targetName, isid = isid, tsid = tsid, connectionCount = connectionCount, connectionsCtorArg = connections)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IscsiSessionInfow) return false
        if (this.sessionId != other.sessionId) return false
        if (this.initiatorName != other.initiatorName) return false
        if (this.targetNodeName != other.targetNodeName) return false
        if (this.targetName != other.targetName) return false
        if (!this.isid.contentEquals(other.isid)) return false
        if (!this.tsid.contentEquals(other.tsid)) return false
        if (this.connectionCount != other.connectionCount) return false
        if (this.connections != other.connections) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sessionId.hashCode()
        result = 31 * result + this.initiatorName.hashCode()
        result = 31 * result + this.targetNodeName.hashCode()
        result = 31 * result + this.targetName.hashCode()
        result = 31 * result + this.isid.contentHashCode()
        result = 31 * result + this.tsid.contentHashCode()
        result = 31 * result + this.connectionCount.hashCode()
        result = 31 * result + this.connections.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sessionId: IscsiUniqueSessionId = IscsiUniqueSessionId(),
            initiatorName: Pwstr = MutPtr(0L),
            targetNodeName: Pwstr = MutPtr(0L),
            targetName: Pwstr = MutPtr(0L),
            isid: UByteArray = UByteArray(6),
            tsid: UByteArray = UByteArray(2),
            connectionCount: UInt = 0u,
            connections: MutPtr = MutPtr(0L),
        ): IscsiSessionInfow =
            IscsiSessionInfow(
                sessionId = sessionId,
                initiatorNameCtorArg = initiatorName,
                targetNodeNameCtorArg = targetNodeName,
                targetNameCtorArg = targetName,
                isid = isid,
                tsid = tsid,
                connectionCount = connectionCount,
                connectionsCtorArg = connections,
            )
    }
}

public class IscsiSessionInfoEx internal constructor(
    public var sessionId: IscsiUniqueSessionId,
    public var initialR2t: Boolean,
    public var immediateData: Boolean,
    public var type: UByte,
    public var dataSequenceInOrder: Boolean,
    public var dataPduInOrder: Boolean,
    public var errorRecoveryLevel: UByte,
    public var maxOutstandingR2t: UInt,
    public var firstBurstLength: UInt,
    public var maxBurstLength: UInt,
    public var maximumConnections: UInt,
    public var connectionCount: UInt,
    connectionsCtorArg: MutPtr,
) {
    public var connections: MutPtr = connectionsCtorArg
        internal set

    public constructor() : this(
        sessionId = IscsiUniqueSessionId(),
        initialR2t = false,
        immediateData = false,
        type = 0u,
        dataSequenceInOrder = false,
        dataPduInOrder = false,
        errorRecoveryLevel = 0u,
        maxOutstandingR2t = 0u,
        firstBurstLength = 0u,
        maxBurstLength = 0u,
        maximumConnections = 0u,
        connectionCount = 0u,
        connectionsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): IscsiUniqueSessionId = this.sessionId

    public operator fun component2(): Boolean = this.initialR2t

    public operator fun component3(): Boolean = this.immediateData

    public operator fun component4(): UByte = this.type

    public operator fun component5(): Boolean = this.dataSequenceInOrder

    public operator fun component6(): Boolean = this.dataPduInOrder

    public operator fun component7(): UByte = this.errorRecoveryLevel

    public operator fun component8(): UInt = this.maxOutstandingR2t

    public operator fun component9(): UInt = this.firstBurstLength

    public operator fun component10(): UInt = this.maxBurstLength

    public operator fun component11(): UInt = this.maximumConnections

    public operator fun component12(): UInt = this.connectionCount

    public operator fun component13(): MutPtr = this.connections

    public fun copy(sessionId: IscsiUniqueSessionId = this.sessionId, initialR2t: Boolean = this.initialR2t, immediateData: Boolean = this.immediateData, type: UByte = this.type, dataSequenceInOrder: Boolean = this.dataSequenceInOrder, dataPduInOrder: Boolean = this.dataPduInOrder, errorRecoveryLevel: UByte = this.errorRecoveryLevel, maxOutstandingR2t: UInt = this.maxOutstandingR2t, firstBurstLength: UInt = this.firstBurstLength, maxBurstLength: UInt = this.maxBurstLength, maximumConnections: UInt = this.maximumConnections, connectionCount: UInt = this.connectionCount, connections: MutPtr = this.connections): IscsiSessionInfoEx = IscsiSessionInfoEx(sessionId = sessionId, initialR2t = initialR2t, immediateData = immediateData, type = type, dataSequenceInOrder = dataSequenceInOrder, dataPduInOrder = dataPduInOrder, errorRecoveryLevel = errorRecoveryLevel, maxOutstandingR2t = maxOutstandingR2t, firstBurstLength = firstBurstLength, maxBurstLength = maxBurstLength, maximumConnections = maximumConnections, connectionCount = connectionCount, connectionsCtorArg = connections)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IscsiSessionInfoEx) return false
        if (this.sessionId != other.sessionId) return false
        if (this.initialR2t != other.initialR2t) return false
        if (this.immediateData != other.immediateData) return false
        if (this.type != other.type) return false
        if (this.dataSequenceInOrder != other.dataSequenceInOrder) return false
        if (this.dataPduInOrder != other.dataPduInOrder) return false
        if (this.errorRecoveryLevel != other.errorRecoveryLevel) return false
        if (this.maxOutstandingR2t != other.maxOutstandingR2t) return false
        if (this.firstBurstLength != other.firstBurstLength) return false
        if (this.maxBurstLength != other.maxBurstLength) return false
        if (this.maximumConnections != other.maximumConnections) return false
        if (this.connectionCount != other.connectionCount) return false
        if (this.connections != other.connections) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sessionId.hashCode()
        result = 31 * result + this.initialR2t.hashCode()
        result = 31 * result + this.immediateData.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.dataSequenceInOrder.hashCode()
        result = 31 * result + this.dataPduInOrder.hashCode()
        result = 31 * result + this.errorRecoveryLevel.hashCode()
        result = 31 * result + this.maxOutstandingR2t.hashCode()
        result = 31 * result + this.firstBurstLength.hashCode()
        result = 31 * result + this.maxBurstLength.hashCode()
        result = 31 * result + this.maximumConnections.hashCode()
        result = 31 * result + this.connectionCount.hashCode()
        result = 31 * result + this.connections.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IscsiSessionInfoEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IscsiSessionInfoEx> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): IscsiSessionInfoEx =
                    IscsiSessionInfoEx(
                        (IscsiUniqueSessionId.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 17L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 19L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 21L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: IscsiSessionInfoEx) {
                    (IscsiUniqueSessionId.typeLayout()).writeNative(addr, value.sessionId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 16L, value.initialR2t)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 17L, value.immediateData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 18L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 19L, value.dataSequenceInOrder)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 20L, value.dataPduInOrder)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 21L, value.errorRecoveryLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.maxOutstandingR2t)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.firstBurstLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.maxBurstLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.maximumConnections)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.connectionCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 48L, value.connections)
                }
            }

        public operator fun invoke(
            sessionId: IscsiUniqueSessionId = IscsiUniqueSessionId(),
            initialR2t: Boolean = false,
            immediateData: Boolean = false,
            type: UByte = 0u,
            dataSequenceInOrder: Boolean = false,
            dataPduInOrder: Boolean = false,
            errorRecoveryLevel: UByte = 0u,
            maxOutstandingR2t: UInt = 0u,
            firstBurstLength: UInt = 0u,
            maxBurstLength: UInt = 0u,
            maximumConnections: UInt = 0u,
            connectionCount: UInt = 0u,
            connections: MutPtr = MutPtr(0L),
        ): IscsiSessionInfoEx =
            IscsiSessionInfoEx(
                sessionId = sessionId,
                initialR2t = initialR2t,
                immediateData = immediateData,
                type = type,
                dataSequenceInOrder = dataSequenceInOrder,
                dataPduInOrder = dataPduInOrder,
                errorRecoveryLevel = errorRecoveryLevel,
                maxOutstandingR2t = maxOutstandingR2t,
                firstBurstLength = firstBurstLength,
                maxBurstLength = maxBurstLength,
                maximumConnections = maximumConnections,
                connectionCount = connectionCount,
                connectionsCtorArg = connections,
            )
    }
}

public class IscsiTargetMappinga internal constructor(
    public var initiatorName: ByteArray,
    public var targetName: ByteArray,
    public var oSDeviceName: ByteArray,
    public var sessionId: IscsiUniqueSessionId,
    public var oSBusNumber: UInt,
    public var oSTargetNumber: UInt,
    public var lUNCount: UInt,
    lUNListCtorArg: MutPtr,
) {
    public var lUNList: MutPtr = lUNListCtorArg
        internal set

    public constructor() : this(
        initiatorName = ByteArray(256),
        targetName = ByteArray(224),
        oSDeviceName = ByteArray(260),
        sessionId = IscsiUniqueSessionId(),
        oSBusNumber = 0u,
        oSTargetNumber = 0u,
        lUNCount = 0u,
        lUNListCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ByteArray = this.initiatorName

    public operator fun component2(): ByteArray = this.targetName

    public operator fun component3(): ByteArray = this.oSDeviceName

    public operator fun component4(): IscsiUniqueSessionId = this.sessionId

    public operator fun component5(): UInt = this.oSBusNumber

    public operator fun component6(): UInt = this.oSTargetNumber

    public operator fun component7(): UInt = this.lUNCount

    public operator fun component8(): MutPtr = this.lUNList

    public fun copy(initiatorName: ByteArray = this.initiatorName, targetName: ByteArray = this.targetName, oSDeviceName: ByteArray = this.oSDeviceName, sessionId: IscsiUniqueSessionId = this.sessionId, oSBusNumber: UInt = this.oSBusNumber, oSTargetNumber: UInt = this.oSTargetNumber, lUNCount: UInt = this.lUNCount, lUNList: MutPtr = this.lUNList): IscsiTargetMappinga = IscsiTargetMappinga(initiatorName = initiatorName, targetName = targetName, oSDeviceName = oSDeviceName, sessionId = sessionId, oSBusNumber = oSBusNumber, oSTargetNumber = oSTargetNumber, lUNCount = lUNCount, lUNListCtorArg = lUNList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IscsiTargetMappinga) return false
        if (!this.initiatorName.contentEquals(other.initiatorName)) return false
        if (!this.targetName.contentEquals(other.targetName)) return false
        if (!this.oSDeviceName.contentEquals(other.oSDeviceName)) return false
        if (this.sessionId != other.sessionId) return false
        if (this.oSBusNumber != other.oSBusNumber) return false
        if (this.oSTargetNumber != other.oSTargetNumber) return false
        if (this.lUNCount != other.lUNCount) return false
        if (this.lUNList != other.lUNList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.initiatorName.contentHashCode()
        result = 31 * result + this.targetName.contentHashCode()
        result = 31 * result + this.oSDeviceName.contentHashCode()
        result = 31 * result + this.sessionId.hashCode()
        result = 31 * result + this.oSBusNumber.hashCode()
        result = 31 * result + this.oSTargetNumber.hashCode()
        result = 31 * result + this.lUNCount.hashCode()
        result = 31 * result + this.lUNList.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IscsiTargetMappinga> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IscsiTargetMappinga> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 784L
                override fun readNative(addr: Long): IscsiTargetMappinga =
                    IscsiTargetMappinga(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                        ).readNative(addr).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (224).toInt())
                        ).readNative(addr + 256L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                        ).readNative(addr + 480L).toByteArray(),
                        (IscsiUniqueSessionId.typeLayout()).readNative(addr + 744L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 760L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 764L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 768L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 776L),
                    )
                override fun writeNative(addr: Long, value: IscsiTargetMappinga) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                    ).writeNative(addr, value.initiatorName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (224).toInt())
                    ).writeNative(addr + 256L, value.targetName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (260).toInt())
                    ).writeNative(addr + 480L, value.oSDeviceName.toList())
                    (IscsiUniqueSessionId.typeLayout()).writeNative(addr + 744L, value.sessionId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 760L, value.oSBusNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 764L, value.oSTargetNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 768L, value.lUNCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 776L, value.lUNList)
                }
            }

        public operator fun invoke(
            initiatorName: ByteArray = ByteArray(256),
            targetName: ByteArray = ByteArray(224),
            oSDeviceName: ByteArray = ByteArray(260),
            sessionId: IscsiUniqueSessionId = IscsiUniqueSessionId(),
            oSBusNumber: UInt = 0u,
            oSTargetNumber: UInt = 0u,
            lUNCount: UInt = 0u,
            lUNList: MutPtr = MutPtr(0L),
        ): IscsiTargetMappinga =
            IscsiTargetMappinga(
                initiatorName = initiatorName,
                targetName = targetName,
                oSDeviceName = oSDeviceName,
                sessionId = sessionId,
                oSBusNumber = oSBusNumber,
                oSTargetNumber = oSTargetNumber,
                lUNCount = lUNCount,
                lUNListCtorArg = lUNList,
            )
    }
}

public class IscsiTargetMappingw internal constructor(
    public var initiatorName: UShortArray,
    public var targetName: UShortArray,
    public var oSDeviceName: UShortArray,
    public var sessionId: IscsiUniqueSessionId,
    public var oSBusNumber: UInt,
    public var oSTargetNumber: UInt,
    public var lUNCount: UInt,
    lUNListCtorArg: MutPtr,
) {
    public var lUNList: MutPtr = lUNListCtorArg
        internal set

    public constructor() : this(
        initiatorName = UShortArray(256),
        targetName = UShortArray(224),
        oSDeviceName = UShortArray(260),
        sessionId = IscsiUniqueSessionId(),
        oSBusNumber = 0u,
        oSTargetNumber = 0u,
        lUNCount = 0u,
        lUNListCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShortArray = this.initiatorName

    public operator fun component2(): UShortArray = this.targetName

    public operator fun component3(): UShortArray = this.oSDeviceName

    public operator fun component4(): IscsiUniqueSessionId = this.sessionId

    public operator fun component5(): UInt = this.oSBusNumber

    public operator fun component6(): UInt = this.oSTargetNumber

    public operator fun component7(): UInt = this.lUNCount

    public operator fun component8(): MutPtr = this.lUNList

    public fun copy(initiatorName: UShortArray = this.initiatorName, targetName: UShortArray = this.targetName, oSDeviceName: UShortArray = this.oSDeviceName, sessionId: IscsiUniqueSessionId = this.sessionId, oSBusNumber: UInt = this.oSBusNumber, oSTargetNumber: UInt = this.oSTargetNumber, lUNCount: UInt = this.lUNCount, lUNList: MutPtr = this.lUNList): IscsiTargetMappingw = IscsiTargetMappingw(initiatorName = initiatorName, targetName = targetName, oSDeviceName = oSDeviceName, sessionId = sessionId, oSBusNumber = oSBusNumber, oSTargetNumber = oSTargetNumber, lUNCount = lUNCount, lUNListCtorArg = lUNList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IscsiTargetMappingw) return false
        if (!this.initiatorName.contentEquals(other.initiatorName)) return false
        if (!this.targetName.contentEquals(other.targetName)) return false
        if (!this.oSDeviceName.contentEquals(other.oSDeviceName)) return false
        if (this.sessionId != other.sessionId) return false
        if (this.oSBusNumber != other.oSBusNumber) return false
        if (this.oSTargetNumber != other.oSTargetNumber) return false
        if (this.lUNCount != other.lUNCount) return false
        if (this.lUNList != other.lUNList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.initiatorName.contentHashCode()
        result = 31 * result + this.targetName.contentHashCode()
        result = 31 * result + this.oSDeviceName.contentHashCode()
        result = 31 * result + this.sessionId.hashCode()
        result = 31 * result + this.oSBusNumber.hashCode()
        result = 31 * result + this.oSTargetNumber.hashCode()
        result = 31 * result + this.lUNCount.hashCode()
        result = 31 * result + this.lUNList.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IscsiTargetMappingw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IscsiTargetMappingw> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 1520L
                override fun readNative(addr: Long): IscsiTargetMappingw =
                    IscsiTargetMappingw(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (224).toInt())
                        ).readNative(addr + 512L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 960L).toUShortArray(),
                        (IscsiUniqueSessionId.typeLayout()).readNative(addr + 1480L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1496L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1500L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1504L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 1512L),
                    )
                override fun writeNative(addr: Long, value: IscsiTargetMappingw) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr, value.initiatorName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (224).toInt())
                    ).writeNative(addr + 512L, value.targetName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 960L, value.oSDeviceName.toList())
                    (IscsiUniqueSessionId.typeLayout()).writeNative(addr + 1480L, value.sessionId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1496L, value.oSBusNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1500L, value.oSTargetNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1504L, value.lUNCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 1512L, value.lUNList)
                }
            }

        public operator fun invoke(
            initiatorName: UShortArray = UShortArray(256),
            targetName: UShortArray = UShortArray(224),
            oSDeviceName: UShortArray = UShortArray(260),
            sessionId: IscsiUniqueSessionId = IscsiUniqueSessionId(),
            oSBusNumber: UInt = 0u,
            oSTargetNumber: UInt = 0u,
            lUNCount: UInt = 0u,
            lUNList: MutPtr = MutPtr(0L),
        ): IscsiTargetMappingw =
            IscsiTargetMappingw(
                initiatorName = initiatorName,
                targetName = targetName,
                oSDeviceName = oSDeviceName,
                sessionId = sessionId,
                oSBusNumber = oSBusNumber,
                oSTargetNumber = oSTargetNumber,
                lUNCount = lUNCount,
                lUNListCtorArg = lUNList,
            )
    }
}

public data class IscsiTargetPortala(
    public var symbolicName: ByteArray = ByteArray(256),
    public var address: ByteArray = ByteArray(256),
    public var socket: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IscsiTargetPortala) return false
        if (!this.symbolicName.contentEquals(other.symbolicName)) return false
        if (!this.address.contentEquals(other.address)) return false
        if (this.socket != other.socket) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.symbolicName.contentHashCode()
        result = 31 * result + this.address.contentHashCode()
        result = 31 * result + this.socket.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IscsiTargetPortala> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IscsiTargetPortala> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 514L
                override fun readNative(addr: Long): IscsiTargetPortala =
                    IscsiTargetPortala(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                        ).readNative(addr).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                        ).readNative(addr + 256L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 512L),
                    )
                override fun writeNative(addr: Long, value: IscsiTargetPortala) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                    ).writeNative(addr, value.symbolicName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                    ).writeNative(addr + 256L, value.address.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 512L, value.socket)
                }
            }
    }
}

public data class IscsiTargetPortalw(
    public var symbolicName: UShortArray = UShortArray(256),
    public var address: UShortArray = UShortArray(256),
    public var socket: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IscsiTargetPortalw) return false
        if (!this.symbolicName.contentEquals(other.symbolicName)) return false
        if (!this.address.contentEquals(other.address)) return false
        if (this.socket != other.socket) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.symbolicName.contentHashCode()
        result = 31 * result + this.address.contentHashCode()
        result = 31 * result + this.socket.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IscsiTargetPortalw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IscsiTargetPortalw> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 1026L
                override fun readNative(addr: Long): IscsiTargetPortalw =
                    IscsiTargetPortalw(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 512L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 1024L),
                    )
                override fun writeNative(addr: Long, value: IscsiTargetPortalw) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr, value.symbolicName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 512L, value.address.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 1024L, value.socket)
                }
            }
    }
}

public data class IscsiTargetPortalGroupa(
    public var count: UInt = 0u,
    public var portals: List<IscsiTargetPortala> = List(1) { IscsiTargetPortala() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IscsiTargetPortalGroupa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IscsiTargetPortalGroupa> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 520L
                override fun readNative(addr: Long): IscsiTargetPortalGroupa =
                    IscsiTargetPortalGroupa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(IscsiTargetPortala.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: IscsiTargetPortalGroupa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(IscsiTargetPortala.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.portals)
                }
            }
    }
}

public data class IscsiTargetPortalGroupw(
    public var count: UInt = 0u,
    public var portals: List<IscsiTargetPortalw> = List(1) { IscsiTargetPortalw() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IscsiTargetPortalGroupw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IscsiTargetPortalGroupw> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1032L
                override fun readNative(addr: Long): IscsiTargetPortalGroupw =
                    IscsiTargetPortalGroupw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(IscsiTargetPortalw.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: IscsiTargetPortalGroupw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(IscsiTargetPortalw.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.portals)
                }
            }
    }
}

public data class IscsiTargetPortalInfoa(
    public var initiatorName: ByteArray = ByteArray(256),
    public var initiatorPortNumber: UInt = 0u,
    public var symbolicName: ByteArray = ByteArray(256),
    public var address: ByteArray = ByteArray(256),
    public var socket: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IscsiTargetPortalInfoa) return false
        if (!this.initiatorName.contentEquals(other.initiatorName)) return false
        if (this.initiatorPortNumber != other.initiatorPortNumber) return false
        if (!this.symbolicName.contentEquals(other.symbolicName)) return false
        if (!this.address.contentEquals(other.address)) return false
        if (this.socket != other.socket) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.initiatorName.contentHashCode()
        result = 31 * result + this.initiatorPortNumber.hashCode()
        result = 31 * result + this.symbolicName.contentHashCode()
        result = 31 * result + this.address.contentHashCode()
        result = 31 * result + this.socket.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IscsiTargetPortalInfoa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IscsiTargetPortalInfoa> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 776L
                override fun readNative(addr: Long): IscsiTargetPortalInfoa =
                    IscsiTargetPortalInfoa(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                        ).readNative(addr).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 256L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                        ).readNative(addr + 260L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                        ).readNative(addr + 516L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 772L),
                    )
                override fun writeNative(addr: Long, value: IscsiTargetPortalInfoa) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                    ).writeNative(addr, value.initiatorName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 256L, value.initiatorPortNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                    ).writeNative(addr + 260L, value.symbolicName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                    ).writeNative(addr + 516L, value.address.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 772L, value.socket)
                }
            }
    }
}

public data class IscsiTargetPortalInfow(
    public var initiatorName: UShortArray = UShortArray(256),
    public var initiatorPortNumber: UInt = 0u,
    public var symbolicName: UShortArray = UShortArray(256),
    public var address: UShortArray = UShortArray(256),
    public var socket: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IscsiTargetPortalInfow) return false
        if (!this.initiatorName.contentEquals(other.initiatorName)) return false
        if (this.initiatorPortNumber != other.initiatorPortNumber) return false
        if (!this.symbolicName.contentEquals(other.symbolicName)) return false
        if (!this.address.contentEquals(other.address)) return false
        if (this.socket != other.socket) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.initiatorName.contentHashCode()
        result = 31 * result + this.initiatorPortNumber.hashCode()
        result = 31 * result + this.symbolicName.contentHashCode()
        result = 31 * result + this.address.contentHashCode()
        result = 31 * result + this.socket.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IscsiTargetPortalInfow> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IscsiTargetPortalInfow> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 1544L
                override fun readNative(addr: Long): IscsiTargetPortalInfow =
                    IscsiTargetPortalInfow(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 512L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 516L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 1028L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 1540L),
                    )
                override fun writeNative(addr: Long, value: IscsiTargetPortalInfow) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr, value.initiatorName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 512L, value.initiatorPortNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 516L, value.symbolicName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 1028L, value.address.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 1540L, value.socket)
                }
            }
    }
}

public data class IscsiTargetPortalInfoExa(
    public var initiatorName: ByteArray = ByteArray(256),
    public var initiatorPortNumber: UInt = 0u,
    public var symbolicName: ByteArray = ByteArray(256),
    public var address: ByteArray = ByteArray(256),
    public var socket: UShort = 0u,
    public var securityFlags: ULong = 0uL,
    public var loginOptions: IscsiLoginOptions = IscsiLoginOptions(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IscsiTargetPortalInfoExa) return false
        if (!this.initiatorName.contentEquals(other.initiatorName)) return false
        if (this.initiatorPortNumber != other.initiatorPortNumber) return false
        if (!this.symbolicName.contentEquals(other.symbolicName)) return false
        if (!this.address.contentEquals(other.address)) return false
        if (this.socket != other.socket) return false
        if (this.securityFlags != other.securityFlags) return false
        if (this.loginOptions != other.loginOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.initiatorName.contentHashCode()
        result = 31 * result + this.initiatorPortNumber.hashCode()
        result = 31 * result + this.symbolicName.contentHashCode()
        result = 31 * result + this.address.contentHashCode()
        result = 31 * result + this.socket.hashCode()
        result = 31 * result + this.securityFlags.hashCode()
        result = 31 * result + this.loginOptions.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IscsiTargetPortalInfoExa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IscsiTargetPortalInfoExa> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 848L
                override fun readNative(addr: Long): IscsiTargetPortalInfoExa =
                    IscsiTargetPortalInfoExa(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                        ).readNative(addr).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 256L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                        ).readNative(addr + 260L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                        ).readNative(addr + 516L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 772L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 776L),
                        (IscsiLoginOptions.typeLayout()).readNative(addr + 784L),
                    )
                override fun writeNative(addr: Long, value: IscsiTargetPortalInfoExa) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                    ).writeNative(addr, value.initiatorName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 256L, value.initiatorPortNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                    ).writeNative(addr + 260L, value.symbolicName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                    ).writeNative(addr + 516L, value.address.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 772L, value.socket)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 776L, value.securityFlags)
                    (IscsiLoginOptions.typeLayout()).writeNative(addr + 784L, value.loginOptions)
                }
            }
    }
}

public data class IscsiTargetPortalInfoExw(
    public var initiatorName: UShortArray = UShortArray(256),
    public var initiatorPortNumber: UInt = 0u,
    public var symbolicName: UShortArray = UShortArray(256),
    public var address: UShortArray = UShortArray(256),
    public var socket: UShort = 0u,
    public var securityFlags: ULong = 0uL,
    public var loginOptions: IscsiLoginOptions = IscsiLoginOptions(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IscsiTargetPortalInfoExw) return false
        if (!this.initiatorName.contentEquals(other.initiatorName)) return false
        if (this.initiatorPortNumber != other.initiatorPortNumber) return false
        if (!this.symbolicName.contentEquals(other.symbolicName)) return false
        if (!this.address.contentEquals(other.address)) return false
        if (this.socket != other.socket) return false
        if (this.securityFlags != other.securityFlags) return false
        if (this.loginOptions != other.loginOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.initiatorName.contentHashCode()
        result = 31 * result + this.initiatorPortNumber.hashCode()
        result = 31 * result + this.symbolicName.contentHashCode()
        result = 31 * result + this.address.contentHashCode()
        result = 31 * result + this.socket.hashCode()
        result = 31 * result + this.securityFlags.hashCode()
        result = 31 * result + this.loginOptions.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IscsiTargetPortalInfoExw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IscsiTargetPortalInfoExw> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 1616L
                override fun readNative(addr: Long): IscsiTargetPortalInfoExw =
                    IscsiTargetPortalInfoExw(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 512L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 516L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 1028L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 1540L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 1544L),
                        (IscsiLoginOptions.typeLayout()).readNative(addr + 1552L),
                    )
                override fun writeNative(addr: Long, value: IscsiTargetPortalInfoExw) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr, value.initiatorName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 512L, value.initiatorPortNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 516L, value.symbolicName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 1028L, value.address.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 1540L, value.socket)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 1544L, value.securityFlags)
                    (IscsiLoginOptions.typeLayout()).writeNative(addr + 1552L, value.loginOptions)
                }
            }
    }
}

public data class IscsiUniqueSessionId(
    public var adapterUnique: ULong = 0uL,
    public var adapterSpecific: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IscsiUniqueSessionId> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IscsiUniqueSessionId> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): IscsiUniqueSessionId =
                    IscsiUniqueSessionId(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IscsiUniqueSessionId) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.adapterUnique)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.adapterSpecific)
                }
            }
    }
}

public data class IscsiVersionInfo(
    public var majorVersion: UInt = 0u,
    public var minorVersion: UInt = 0u,
    public var buildNumber: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IscsiVersionInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IscsiVersionInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): IscsiVersionInfo =
                    IscsiVersionInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IscsiVersionInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.majorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.minorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.buildNumber)
                }
            }
    }
}

public data class MpioPassThroughPath(
    public var passThrough: ScsiPassThrough = ScsiPassThrough(),
    public var version: UInt = 0u,
    public var length: UShort = 0u,
    public var flags: UByte = 0u,
    public var portNumber: UByte = 0u,
    public var mpioPathId: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MpioPassThroughPath> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MpioPassThroughPath> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): MpioPassThroughPath =
                    MpioPassThroughPath(
                        (ScsiPassThrough.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 62L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 63L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: MpioPassThroughPath) {
                    (ScsiPassThrough.typeLayout()).writeNative(addr, value.passThrough)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 60L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 62L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 63L, value.portNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.mpioPathId)
                }
            }
    }
}

public data class MpioPassThroughPath32(
    public var passThrough: ScsiPassThrough32 = ScsiPassThrough32(),
    public var version: UInt = 0u,
    public var length: UShort = 0u,
    public var flags: UByte = 0u,
    public var portNumber: UByte = 0u,
    public var mpioPathId: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MpioPassThroughPath32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MpioPassThroughPath32> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): MpioPassThroughPath32 =
                    MpioPassThroughPath32(
                        (ScsiPassThrough32.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 50L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 51L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: MpioPassThroughPath32) {
                    (ScsiPassThrough32.typeLayout()).writeNative(addr, value.passThrough)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 48L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 50L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 51L, value.portNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.mpioPathId)
                }
            }
    }
}

public data class MpioPassThroughPath32Ex(
    public var passThroughOffset: UInt = 0u,
    public var version: UInt = 0u,
    public var length: UShort = 0u,
    public var flags: UByte = 0u,
    public var portNumber: UByte = 0u,
    public var mpioPathId: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MpioPassThroughPath32Ex> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MpioPassThroughPath32Ex> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MpioPassThroughPath32Ex =
                    MpioPassThroughPath32Ex(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 11L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MpioPassThroughPath32Ex) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.passThroughOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 10L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 11L, value.portNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.mpioPathId)
                }
            }
    }
}

public data class MpioPassThroughPathDirect(
    public var passThrough: ScsiPassThroughDirect = ScsiPassThroughDirect(),
    public var version: UInt = 0u,
    public var length: UShort = 0u,
    public var flags: UByte = 0u,
    public var portNumber: UByte = 0u,
    public var mpioPathId: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MpioPassThroughPathDirect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MpioPassThroughPathDirect> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): MpioPassThroughPathDirect =
                    MpioPassThroughPathDirect(
                        (ScsiPassThroughDirect.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 62L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 63L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: MpioPassThroughPathDirect) {
                    (ScsiPassThroughDirect.typeLayout()).writeNative(addr, value.passThrough)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 60L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 62L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 63L, value.portNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.mpioPathId)
                }
            }
    }
}

public data class MpioPassThroughPathDirect32(
    public var passThrough: ScsiPassThroughDirect32 = ScsiPassThroughDirect32(),
    public var version: UInt = 0u,
    public var length: UShort = 0u,
    public var flags: UByte = 0u,
    public var portNumber: UByte = 0u,
    public var mpioPathId: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MpioPassThroughPathDirect32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MpioPassThroughPathDirect32> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): MpioPassThroughPathDirect32 =
                    MpioPassThroughPathDirect32(
                        (ScsiPassThroughDirect32.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 62L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 63L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: MpioPassThroughPathDirect32) {
                    (ScsiPassThroughDirect32.typeLayout()).writeNative(addr, value.passThrough)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 60L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 62L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 63L, value.portNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.mpioPathId)
                }
            }
    }
}

public data class MpioPassThroughPathDirect32Ex(
    public var passThroughOffset: UInt = 0u,
    public var version: UInt = 0u,
    public var length: UShort = 0u,
    public var flags: UByte = 0u,
    public var portNumber: UByte = 0u,
    public var mpioPathId: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MpioPassThroughPathDirect32Ex> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MpioPassThroughPathDirect32Ex> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MpioPassThroughPathDirect32Ex =
                    MpioPassThroughPathDirect32Ex(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 11L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MpioPassThroughPathDirect32Ex) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.passThroughOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 10L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 11L, value.portNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.mpioPathId)
                }
            }
    }
}

public data class MpioPassThroughPathDirectEx(
    public var passThroughOffset: UInt = 0u,
    public var version: UInt = 0u,
    public var length: UShort = 0u,
    public var flags: UByte = 0u,
    public var portNumber: UByte = 0u,
    public var mpioPathId: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MpioPassThroughPathDirectEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MpioPassThroughPathDirectEx> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MpioPassThroughPathDirectEx =
                    MpioPassThroughPathDirectEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 11L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MpioPassThroughPathDirectEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.passThroughOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 10L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 11L, value.portNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.mpioPathId)
                }
            }
    }
}

public data class MpioPassThroughPathEx(
    public var passThroughOffset: UInt = 0u,
    public var version: UInt = 0u,
    public var length: UShort = 0u,
    public var flags: UByte = 0u,
    public var portNumber: UByte = 0u,
    public var mpioPathId: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MpioPassThroughPathEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MpioPassThroughPathEx> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MpioPassThroughPathEx =
                    MpioPassThroughPathEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 11L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MpioPassThroughPathEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.passThroughOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 10L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 11L, value.portNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.mpioPathId)
                }
            }
    }
}

public data class MpDeviceDataSetRange(
    public var startingOffset: Long = 0L,
    public var lengthInBytes: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MpDeviceDataSetRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MpDeviceDataSetRange> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MpDeviceDataSetRange =
                    MpDeviceDataSetRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MpDeviceDataSetRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.startingOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.lengthInBytes)
                }
            }
    }
}

public class NtscsiUnicodeString internal constructor(
    public var length: UShort,
    public var maximumLength: UShort,
    bufferCtorArg: Pwstr,
) {
    public var buffer: Pwstr = bufferCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        maximumLength = 0u,
        bufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.length

    public operator fun component2(): UShort = this.maximumLength

    public operator fun component3(): Pwstr = this.buffer

    public fun copy(length: UShort = this.length, maximumLength: UShort = this.maximumLength, buffer: Pwstr = this.buffer): NtscsiUnicodeString = NtscsiUnicodeString(length = length, maximumLength = maximumLength, bufferCtorArg = buffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtscsiUnicodeString) return false
        if (this.length != other.length) return false
        if (this.maximumLength != other.maximumLength) return false
        if (this.buffer != other.buffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.maximumLength.hashCode()
        result = 31 * result + this.buffer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            length: UShort = 0u,
            maximumLength: UShort = 0u,
            buffer: Pwstr = MutPtr(0L),
        ): NtscsiUnicodeString =
            NtscsiUnicodeString(
                length = length,
                maximumLength = maximumLength,
                bufferCtorArg = buffer,
            )
    }
}

public data class NvcacheHintPayload(
    public var command: UByte = 0u,
    public var feature70: UByte = 0u,
    public var feature158: UByte = 0u,
    public var count158: UByte = 0u,
    public var lba70: UByte = 0u,
    public var lba158: UByte = 0u,
    public var lba2316: UByte = 0u,
    public var lba3124: UByte = 0u,
    public var lba3932: UByte = 0u,
    public var lba4740: UByte = 0u,
    public var auxiliary70: UByte = 0u,
    public var auxiliary2316: UByte = 0u,
    public var reserved: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvcacheHintPayload) return false
        if (this.command != other.command) return false
        if (this.feature70 != other.feature70) return false
        if (this.feature158 != other.feature158) return false
        if (this.count158 != other.count158) return false
        if (this.lba70 != other.lba70) return false
        if (this.lba158 != other.lba158) return false
        if (this.lba2316 != other.lba2316) return false
        if (this.lba3124 != other.lba3124) return false
        if (this.lba3932 != other.lba3932) return false
        if (this.lba4740 != other.lba4740) return false
        if (this.auxiliary70 != other.auxiliary70) return false
        if (this.auxiliary2316 != other.auxiliary2316) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.command.hashCode()
        result = 31 * result + this.feature70.hashCode()
        result = 31 * result + this.feature158.hashCode()
        result = 31 * result + this.count158.hashCode()
        result = 31 * result + this.lba70.hashCode()
        result = 31 * result + this.lba158.hashCode()
        result = 31 * result + this.lba2316.hashCode()
        result = 31 * result + this.lba3124.hashCode()
        result = 31 * result + this.lba3932.hashCode()
        result = 31 * result + this.lba4740.hashCode()
        result = 31 * result + this.auxiliary70.hashCode()
        result = 31 * result + this.auxiliary2316.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvcacheHintPayload> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvcacheHintPayload> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NvcacheHintPayload =
                    NvcacheHintPayload(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 11L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: NvcacheHintPayload) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.command)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.feature70)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.feature158)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.count158)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.lba70)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.lba158)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.lba2316)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.lba3124)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.lba3932)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.lba4740)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 10L, value.auxiliary70)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 11L, value.auxiliary2316)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 12L, value.reserved.toList())
                }
            }
    }
}

public data class NvcachePriorityLevelDescriptor(
    public var priorityLevel: UByte = 0u,
    public var reserved0: UByteArray = UByteArray(3),
    public var consumedNVMSizeFraction: UInt = 0u,
    public var consumedMappingResourcesFraction: UInt = 0u,
    public var consumedNVMSizeForDirtyDataFraction: UInt = 0u,
    public var consumedMappingResourcesForDirtyDataFraction: UInt = 0u,
    public var reserved1: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvcachePriorityLevelDescriptor) return false
        if (this.priorityLevel != other.priorityLevel) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        if (this.consumedNVMSizeFraction != other.consumedNVMSizeFraction) return false
        if (this.consumedMappingResourcesFraction != other.consumedMappingResourcesFraction) return false
        if (this.consumedNVMSizeForDirtyDataFraction != other.consumedNVMSizeForDirtyDataFraction) return false
        if (this.consumedMappingResourcesForDirtyDataFraction != other.consumedMappingResourcesForDirtyDataFraction) return false
        if (this.reserved1 != other.reserved1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.priorityLevel.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        result = 31 * result + this.consumedNVMSizeFraction.hashCode()
        result = 31 * result + this.consumedMappingResourcesFraction.hashCode()
        result = 31 * result + this.consumedNVMSizeForDirtyDataFraction.hashCode()
        result = 31 * result + this.consumedMappingResourcesForDirtyDataFraction.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvcachePriorityLevelDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvcachePriorityLevelDescriptor> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): NvcachePriorityLevelDescriptor =
                    NvcachePriorityLevelDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 1L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: NvcachePriorityLevelDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.priorityLevel)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 1L, value.reserved0.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.consumedNVMSizeFraction)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.consumedMappingResourcesFraction)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.consumedNVMSizeForDirtyDataFraction)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.consumedMappingResourcesForDirtyDataFraction)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.reserved1)
                }
            }
    }
}

public data class NvcacheRequestBlock(
    public var nRBSize: UInt = 0u,
    public var function: UShort = 0u,
    public var nRBFlags: UInt = 0u,
    public var nRBStatus: UInt = 0u,
    public var count: UInt = 0u,
    public var lba: ULong = 0uL,
    public var dataBufSize: UInt = 0u,
    public var nVCacheStatus: UInt = 0u,
    public var nVCacheSubStatus: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvcacheRequestBlock> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvcacheRequestBlock> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): NvcacheRequestBlock =
                    NvcacheRequestBlock(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: NvcacheRequestBlock) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nRBSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.function)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nRBFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.nRBStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.count)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.lba)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dataBufSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.nVCacheStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.nVCacheSubStatus)
                }
            }
    }
}

public data class NvFeatureParameter(
    public var nVPowerModeEnabled: UShort = 0u,
    public var nVParameterReserv1: UShort = 0u,
    public var nVCmdEnabled: UShort = 0u,
    public var nVParameterReserv2: UShort = 0u,
    public var nVPowerModeVer: UShort = 0u,
    public var nVCmdVer: UShort = 0u,
    public var nVSize: UInt = 0u,
    public var nVReadSpeed: UShort = 0u,
    public var nVWrtSpeed: UShort = 0u,
    public var deviceSpinUpTime: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvFeatureParameter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvFeatureParameter> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): NvFeatureParameter =
                    NvFeatureParameter(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: NvFeatureParameter) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.nVPowerModeEnabled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.nVParameterReserv1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.nVCmdEnabled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.nVParameterReserv2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.nVPowerModeVer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.nVCmdVer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.nVSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.nVReadSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.nVWrtSpeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.deviceSpinUpTime)
                }
            }
    }
}

public data class NvSepCacheParameter(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var flags: NvSepCacheParameter0 = NvSepCacheParameter0(),
    public var writeCacheType: UByte = 0u,
    public var writeCacheTypeEffective: UByte = 0u,
    public var parameterReserve1: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NvSepCacheParameter) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.writeCacheType != other.writeCacheType) return false
        if (this.writeCacheTypeEffective != other.writeCacheTypeEffective) return false
        if (!this.parameterReserve1.contentEquals(other.parameterReserve1)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.writeCacheType.hashCode()
        result = 31 * result + this.writeCacheTypeEffective.hashCode()
        result = 31 * result + this.parameterReserve1.contentHashCode()
        return result
    }
}

public data class NvSepCacheParameter0(
    public var cacheFlags: NvSepCacheParameter00 = NvSepCacheParameter00(),
    public var cacheFlagsSet: UByte = 0u,
)

public data class NvSepCacheParameter00(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvSepCacheParameter00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NvSepCacheParameter00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): NvSepCacheParameter00 =
                    NvSepCacheParameter00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NvSepCacheParameter00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class PersistentIscsiLoginInfoa internal constructor(
    public var targetName: ByteArray,
    public var isInformationalSession: Boolean,
    public var initiatorInstance: ByteArray,
    public var initiatorPortNumber: UInt,
    public var targetPortal: IscsiTargetPortala,
    public var securityFlags: ULong,
    mappingsCtorArg: MutPtr,
    public var loginOptions: IscsiLoginOptions,
) {
    public var mappings: MutPtr = mappingsCtorArg
        internal set

    public constructor() : this(
        targetName = ByteArray(224),
        isInformationalSession = false,
        initiatorInstance = ByteArray(256),
        initiatorPortNumber = 0u,
        targetPortal = IscsiTargetPortala(),
        securityFlags = 0uL,
        mappingsCtorArg = MutPtr(0L),
        loginOptions = IscsiLoginOptions(),
    )

    public operator fun component1(): ByteArray = this.targetName

    public operator fun component2(): Boolean = this.isInformationalSession

    public operator fun component3(): ByteArray = this.initiatorInstance

    public operator fun component4(): UInt = this.initiatorPortNumber

    public operator fun component5(): IscsiTargetPortala = this.targetPortal

    public operator fun component6(): ULong = this.securityFlags

    public operator fun component7(): MutPtr = this.mappings

    public operator fun component8(): IscsiLoginOptions = this.loginOptions

    public fun copy(targetName: ByteArray = this.targetName, isInformationalSession: Boolean = this.isInformationalSession, initiatorInstance: ByteArray = this.initiatorInstance, initiatorPortNumber: UInt = this.initiatorPortNumber, targetPortal: IscsiTargetPortala = this.targetPortal, securityFlags: ULong = this.securityFlags, mappings: MutPtr = this.mappings, loginOptions: IscsiLoginOptions = this.loginOptions): PersistentIscsiLoginInfoa = PersistentIscsiLoginInfoa(targetName = targetName, isInformationalSession = isInformationalSession, initiatorInstance = initiatorInstance, initiatorPortNumber = initiatorPortNumber, targetPortal = targetPortal, securityFlags = securityFlags, mappingsCtorArg = mappings, loginOptions = loginOptions)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PersistentIscsiLoginInfoa) return false
        if (!this.targetName.contentEquals(other.targetName)) return false
        if (this.isInformationalSession != other.isInformationalSession) return false
        if (!this.initiatorInstance.contentEquals(other.initiatorInstance)) return false
        if (this.initiatorPortNumber != other.initiatorPortNumber) return false
        if (this.targetPortal != other.targetPortal) return false
        if (this.securityFlags != other.securityFlags) return false
        if (this.mappings != other.mappings) return false
        if (this.loginOptions != other.loginOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.targetName.contentHashCode()
        result = 31 * result + this.isInformationalSession.hashCode()
        result = 31 * result + this.initiatorInstance.contentHashCode()
        result = 31 * result + this.initiatorPortNumber.hashCode()
        result = 31 * result + this.targetPortal.hashCode()
        result = 31 * result + this.securityFlags.hashCode()
        result = 31 * result + this.mappings.hashCode()
        result = 31 * result + this.loginOptions.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PersistentIscsiLoginInfoa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PersistentIscsiLoginInfoa> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 1088L
                override fun readNative(addr: Long): PersistentIscsiLoginInfoa =
                    PersistentIscsiLoginInfoa(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (224).toInt())
                        ).readNative(addr).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 224L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                        ).readNative(addr + 225L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 484L),
                        (IscsiTargetPortala.typeLayout()).readNative(addr + 488L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 1008L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 1016L),
                        (IscsiLoginOptions.typeLayout()).readNative(addr + 1024L),
                    )
                override fun writeNative(addr: Long, value: PersistentIscsiLoginInfoa) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (224).toInt())
                    ).writeNative(addr, value.targetName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 224L, value.isInformationalSession)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256).toInt())
                    ).writeNative(addr + 225L, value.initiatorInstance.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 484L, value.initiatorPortNumber)
                    (IscsiTargetPortala.typeLayout()).writeNative(addr + 488L, value.targetPortal)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 1008L, value.securityFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 1016L, value.mappings)
                    (IscsiLoginOptions.typeLayout()).writeNative(addr + 1024L, value.loginOptions)
                }
            }

        public operator fun invoke(
            targetName: ByteArray = ByteArray(224),
            isInformationalSession: Boolean = false,
            initiatorInstance: ByteArray = ByteArray(256),
            initiatorPortNumber: UInt = 0u,
            targetPortal: IscsiTargetPortala = IscsiTargetPortala(),
            securityFlags: ULong = 0uL,
            mappings: MutPtr = MutPtr(0L),
            loginOptions: IscsiLoginOptions = IscsiLoginOptions(),
        ): PersistentIscsiLoginInfoa =
            PersistentIscsiLoginInfoa(
                targetName = targetName,
                isInformationalSession = isInformationalSession,
                initiatorInstance = initiatorInstance,
                initiatorPortNumber = initiatorPortNumber,
                targetPortal = targetPortal,
                securityFlags = securityFlags,
                mappingsCtorArg = mappings,
                loginOptions = loginOptions,
            )
    }
}

public class PersistentIscsiLoginInfow internal constructor(
    public var targetName: UShortArray,
    public var isInformationalSession: Boolean,
    public var initiatorInstance: UShortArray,
    public var initiatorPortNumber: UInt,
    public var targetPortal: IscsiTargetPortalw,
    public var securityFlags: ULong,
    mappingsCtorArg: MutPtr,
    public var loginOptions: IscsiLoginOptions,
) {
    public var mappings: MutPtr = mappingsCtorArg
        internal set

    public constructor() : this(
        targetName = UShortArray(224),
        isInformationalSession = false,
        initiatorInstance = UShortArray(256),
        initiatorPortNumber = 0u,
        targetPortal = IscsiTargetPortalw(),
        securityFlags = 0uL,
        mappingsCtorArg = MutPtr(0L),
        loginOptions = IscsiLoginOptions(),
    )

    public operator fun component1(): UShortArray = this.targetName

    public operator fun component2(): Boolean = this.isInformationalSession

    public operator fun component3(): UShortArray = this.initiatorInstance

    public operator fun component4(): UInt = this.initiatorPortNumber

    public operator fun component5(): IscsiTargetPortalw = this.targetPortal

    public operator fun component6(): ULong = this.securityFlags

    public operator fun component7(): MutPtr = this.mappings

    public operator fun component8(): IscsiLoginOptions = this.loginOptions

    public fun copy(targetName: UShortArray = this.targetName, isInformationalSession: Boolean = this.isInformationalSession, initiatorInstance: UShortArray = this.initiatorInstance, initiatorPortNumber: UInt = this.initiatorPortNumber, targetPortal: IscsiTargetPortalw = this.targetPortal, securityFlags: ULong = this.securityFlags, mappings: MutPtr = this.mappings, loginOptions: IscsiLoginOptions = this.loginOptions): PersistentIscsiLoginInfow = PersistentIscsiLoginInfow(targetName = targetName, isInformationalSession = isInformationalSession, initiatorInstance = initiatorInstance, initiatorPortNumber = initiatorPortNumber, targetPortal = targetPortal, securityFlags = securityFlags, mappingsCtorArg = mappings, loginOptions = loginOptions)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PersistentIscsiLoginInfow) return false
        if (!this.targetName.contentEquals(other.targetName)) return false
        if (this.isInformationalSession != other.isInformationalSession) return false
        if (!this.initiatorInstance.contentEquals(other.initiatorInstance)) return false
        if (this.initiatorPortNumber != other.initiatorPortNumber) return false
        if (this.targetPortal != other.targetPortal) return false
        if (this.securityFlags != other.securityFlags) return false
        if (this.mappings != other.mappings) return false
        if (this.loginOptions != other.loginOptions) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.targetName.contentHashCode()
        result = 31 * result + this.isInformationalSession.hashCode()
        result = 31 * result + this.initiatorInstance.contentHashCode()
        result = 31 * result + this.initiatorPortNumber.hashCode()
        result = 31 * result + this.targetPortal.hashCode()
        result = 31 * result + this.securityFlags.hashCode()
        result = 31 * result + this.mappings.hashCode()
        result = 31 * result + this.loginOptions.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PersistentIscsiLoginInfow> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PersistentIscsiLoginInfow> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 2080L
                override fun readNative(addr: Long): PersistentIscsiLoginInfow =
                    PersistentIscsiLoginInfow(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (224).toInt())
                        ).readNative(addr).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 448L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 450L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 964L),
                        (IscsiTargetPortalw.typeLayout()).readNative(addr + 968L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 2000L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 2008L),
                        (IscsiLoginOptions.typeLayout()).readNative(addr + 2016L),
                    )
                override fun writeNative(addr: Long, value: PersistentIscsiLoginInfow) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (224).toInt())
                    ).writeNative(addr, value.targetName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 448L, value.isInformationalSession)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 450L, value.initiatorInstance.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 964L, value.initiatorPortNumber)
                    (IscsiTargetPortalw.typeLayout()).writeNative(addr + 968L, value.targetPortal)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 2000L, value.securityFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 2008L, value.mappings)
                    (IscsiLoginOptions.typeLayout()).writeNative(addr + 2016L, value.loginOptions)
                }
            }

        public operator fun invoke(
            targetName: UShortArray = UShortArray(224),
            isInformationalSession: Boolean = false,
            initiatorInstance: UShortArray = UShortArray(256),
            initiatorPortNumber: UInt = 0u,
            targetPortal: IscsiTargetPortalw = IscsiTargetPortalw(),
            securityFlags: ULong = 0uL,
            mappings: MutPtr = MutPtr(0L),
            loginOptions: IscsiLoginOptions = IscsiLoginOptions(),
        ): PersistentIscsiLoginInfow =
            PersistentIscsiLoginInfow(
                targetName = targetName,
                isInformationalSession = isInformationalSession,
                initiatorInstance = initiatorInstance,
                initiatorPortNumber = initiatorPortNumber,
                targetPortal = targetPortal,
                securityFlags = securityFlags,
                mappingsCtorArg = mappings,
                loginOptions = loginOptions,
            )
    }
}

public data class ScsiAdapterBusInfo(
    public var numberOfBuses: UByte = 0u,
    public var busData: List<ScsiBusData> = List(1) { ScsiBusData() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScsiAdapterBusInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScsiAdapterBusInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ScsiAdapterBusInfo =
                    ScsiAdapterBusInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(ScsiBusData.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ScsiAdapterBusInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.numberOfBuses)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(ScsiBusData.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.busData)
                }
            }
    }
}

public data class ScsiAddress(
    public var length: UInt = 0u,
    public var portNumber: UByte = 0u,
    public var pathId: UByte = 0u,
    public var targetId: UByte = 0u,
    public var lun: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScsiAddress> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScsiAddress> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ScsiAddress =
                    ScsiAddress(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                    )
                override fun writeNative(addr: Long, value: ScsiAddress) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.portNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.pathId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.targetId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.lun)
                }
            }
    }
}

public data class ScsiBusData(
    public var numberOfLogicalUnits: UByte = 0u,
    public var initiatorBusId: UByte = 0u,
    public var inquiryDataOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScsiBusData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScsiBusData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ScsiBusData =
                    ScsiBusData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ScsiBusData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.numberOfLogicalUnits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.initiatorBusId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.inquiryDataOffset)
                }
            }
    }
}

public data class ScsiInquiryData(
    public var pathId: UByte = 0u,
    public var targetId: UByte = 0u,
    public var lun: UByte = 0u,
    public var deviceClaimed: Boolean = false,
    public var inquiryDataLength: UInt = 0u,
    public var nextInquiryDataOffset: UInt = 0u,
    public var inquiryData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScsiInquiryData) return false
        if (this.pathId != other.pathId) return false
        if (this.targetId != other.targetId) return false
        if (this.lun != other.lun) return false
        if (this.deviceClaimed != other.deviceClaimed) return false
        if (this.inquiryDataLength != other.inquiryDataLength) return false
        if (this.nextInquiryDataOffset != other.nextInquiryDataOffset) return false
        if (!this.inquiryData.contentEquals(other.inquiryData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pathId.hashCode()
        result = 31 * result + this.targetId.hashCode()
        result = 31 * result + this.lun.hashCode()
        result = 31 * result + this.deviceClaimed.hashCode()
        result = 31 * result + this.inquiryDataLength.hashCode()
        result = 31 * result + this.nextInquiryDataOffset.hashCode()
        result = 31 * result + this.inquiryData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScsiInquiryData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScsiInquiryData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ScsiInquiryData =
                    ScsiInquiryData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ScsiInquiryData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.pathId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.targetId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.lun)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 3L, value.deviceClaimed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.inquiryDataLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nextInquiryDataOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.inquiryData.toList())
                }
            }
    }
}

public data class ScsiLunList(
    public var oslun: UInt = 0u,
    public var targetLUN: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScsiLunList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScsiLunList> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ScsiLunList =
                    ScsiLunList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ScsiLunList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.oslun)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.targetLUN)
                }
            }
    }
}

public data class ScsiPassThrough(
    public var length: UShort = 0u,
    public var scsiStatus: UByte = 0u,
    public var pathId: UByte = 0u,
    public var targetId: UByte = 0u,
    public var lun: UByte = 0u,
    public var cdbLength: UByte = 0u,
    public var senseInfoLength: UByte = 0u,
    public var dataIn: UByte = 0u,
    public var dataTransferLength: UInt = 0u,
    public var timeOutValue: UInt = 0u,
    public var dataBufferOffset: Int = 0,
    public var senseInfoOffset: UInt = 0u,
    public var cdb: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScsiPassThrough) return false
        if (this.length != other.length) return false
        if (this.scsiStatus != other.scsiStatus) return false
        if (this.pathId != other.pathId) return false
        if (this.targetId != other.targetId) return false
        if (this.lun != other.lun) return false
        if (this.cdbLength != other.cdbLength) return false
        if (this.senseInfoLength != other.senseInfoLength) return false
        if (this.dataIn != other.dataIn) return false
        if (this.dataTransferLength != other.dataTransferLength) return false
        if (this.timeOutValue != other.timeOutValue) return false
        if (this.dataBufferOffset != other.dataBufferOffset) return false
        if (this.senseInfoOffset != other.senseInfoOffset) return false
        if (!this.cdb.contentEquals(other.cdb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.scsiStatus.hashCode()
        result = 31 * result + this.pathId.hashCode()
        result = 31 * result + this.targetId.hashCode()
        result = 31 * result + this.lun.hashCode()
        result = 31 * result + this.cdbLength.hashCode()
        result = 31 * result + this.senseInfoLength.hashCode()
        result = 31 * result + this.dataIn.hashCode()
        result = 31 * result + this.dataTransferLength.hashCode()
        result = 31 * result + this.timeOutValue.hashCode()
        result = 31 * result + this.dataBufferOffset.hashCode()
        result = 31 * result + this.senseInfoOffset.hashCode()
        result = 31 * result + this.cdb.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScsiPassThrough> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScsiPassThrough> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): ScsiPassThrough =
                    ScsiPassThrough(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 36L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ScsiPassThrough) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.scsiStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.pathId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.targetId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.lun)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.cdbLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.senseInfoLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.dataIn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dataTransferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.timeOutValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.dataBufferOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.senseInfoOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 36L, value.cdb.toList())
                }
            }
    }
}

public data class ScsiPassThrough32(
    public var length: UShort = 0u,
    public var scsiStatus: UByte = 0u,
    public var pathId: UByte = 0u,
    public var targetId: UByte = 0u,
    public var lun: UByte = 0u,
    public var cdbLength: UByte = 0u,
    public var senseInfoLength: UByte = 0u,
    public var dataIn: UByte = 0u,
    public var dataTransferLength: UInt = 0u,
    public var timeOutValue: UInt = 0u,
    public var dataBufferOffset: UInt = 0u,
    public var senseInfoOffset: UInt = 0u,
    public var cdb: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScsiPassThrough32) return false
        if (this.length != other.length) return false
        if (this.scsiStatus != other.scsiStatus) return false
        if (this.pathId != other.pathId) return false
        if (this.targetId != other.targetId) return false
        if (this.lun != other.lun) return false
        if (this.cdbLength != other.cdbLength) return false
        if (this.senseInfoLength != other.senseInfoLength) return false
        if (this.dataIn != other.dataIn) return false
        if (this.dataTransferLength != other.dataTransferLength) return false
        if (this.timeOutValue != other.timeOutValue) return false
        if (this.dataBufferOffset != other.dataBufferOffset) return false
        if (this.senseInfoOffset != other.senseInfoOffset) return false
        if (!this.cdb.contentEquals(other.cdb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.scsiStatus.hashCode()
        result = 31 * result + this.pathId.hashCode()
        result = 31 * result + this.targetId.hashCode()
        result = 31 * result + this.lun.hashCode()
        result = 31 * result + this.cdbLength.hashCode()
        result = 31 * result + this.senseInfoLength.hashCode()
        result = 31 * result + this.dataIn.hashCode()
        result = 31 * result + this.dataTransferLength.hashCode()
        result = 31 * result + this.timeOutValue.hashCode()
        result = 31 * result + this.dataBufferOffset.hashCode()
        result = 31 * result + this.senseInfoOffset.hashCode()
        result = 31 * result + this.cdb.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScsiPassThrough32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScsiPassThrough32> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 44L
                override fun readNative(addr: Long): ScsiPassThrough32 =
                    ScsiPassThrough32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 28L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ScsiPassThrough32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.scsiStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.pathId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.targetId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.lun)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.cdbLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.senseInfoLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.dataIn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dataTransferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.timeOutValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dataBufferOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.senseInfoOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 28L, value.cdb.toList())
                }
            }
    }
}

public data class ScsiPassThrough32Ex(
    public var version: UInt = 0u,
    public var length: UInt = 0u,
    public var cdbLength: UInt = 0u,
    public var storAddressLength: UInt = 0u,
    public var scsiStatus: UByte = 0u,
    public var senseInfoLength: UByte = 0u,
    public var dataDirection: UByte = 0u,
    public var reserved: UByte = 0u,
    public var timeOutValue: UInt = 0u,
    public var storAddressOffset: UInt = 0u,
    public var senseInfoOffset: UInt = 0u,
    public var dataOutTransferLength: UInt = 0u,
    public var dataInTransferLength: UInt = 0u,
    public var dataOutBufferOffset: UInt = 0u,
    public var dataInBufferOffset: UInt = 0u,
    public var cdb: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScsiPassThrough32Ex) return false
        if (this.version != other.version) return false
        if (this.length != other.length) return false
        if (this.cdbLength != other.cdbLength) return false
        if (this.storAddressLength != other.storAddressLength) return false
        if (this.scsiStatus != other.scsiStatus) return false
        if (this.senseInfoLength != other.senseInfoLength) return false
        if (this.dataDirection != other.dataDirection) return false
        if (this.reserved != other.reserved) return false
        if (this.timeOutValue != other.timeOutValue) return false
        if (this.storAddressOffset != other.storAddressOffset) return false
        if (this.senseInfoOffset != other.senseInfoOffset) return false
        if (this.dataOutTransferLength != other.dataOutTransferLength) return false
        if (this.dataInTransferLength != other.dataInTransferLength) return false
        if (this.dataOutBufferOffset != other.dataOutBufferOffset) return false
        if (this.dataInBufferOffset != other.dataInBufferOffset) return false
        if (!this.cdb.contentEquals(other.cdb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.cdbLength.hashCode()
        result = 31 * result + this.storAddressLength.hashCode()
        result = 31 * result + this.scsiStatus.hashCode()
        result = 31 * result + this.senseInfoLength.hashCode()
        result = 31 * result + this.dataDirection.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.timeOutValue.hashCode()
        result = 31 * result + this.storAddressOffset.hashCode()
        result = 31 * result + this.senseInfoOffset.hashCode()
        result = 31 * result + this.dataOutTransferLength.hashCode()
        result = 31 * result + this.dataInTransferLength.hashCode()
        result = 31 * result + this.dataOutBufferOffset.hashCode()
        result = 31 * result + this.dataInBufferOffset.hashCode()
        result = 31 * result + this.cdb.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScsiPassThrough32Ex> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScsiPassThrough32Ex> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 52L
                override fun readNative(addr: Long): ScsiPassThrough32Ex =
                    ScsiPassThrough32Ex(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 19L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 48L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ScsiPassThrough32Ex) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cdbLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.storAddressLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.scsiStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.senseInfoLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 18L, value.dataDirection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 19L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.timeOutValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.storAddressOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.senseInfoOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dataOutTransferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dataInTransferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dataOutBufferOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dataInBufferOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 48L, value.cdb.toList())
                }
            }
    }
}

public class ScsiPassThroughDirect internal constructor(
    public var length: UShort,
    public var scsiStatus: UByte,
    public var pathId: UByte,
    public var targetId: UByte,
    public var lun: UByte,
    public var cdbLength: UByte,
    public var senseInfoLength: UByte,
    public var dataIn: UByte,
    public var dataTransferLength: UInt,
    public var timeOutValue: UInt,
    dataBufferCtorArg: MutPtr,
    public var senseInfoOffset: UInt,
    public var cdb: UByteArray,
) {
    public var dataBuffer: MutPtr = dataBufferCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        scsiStatus = 0u,
        pathId = 0u,
        targetId = 0u,
        lun = 0u,
        cdbLength = 0u,
        senseInfoLength = 0u,
        dataIn = 0u,
        dataTransferLength = 0u,
        timeOutValue = 0u,
        dataBufferCtorArg = MutPtr(0L),
        senseInfoOffset = 0u,
        cdb = UByteArray(16),
    )

    public operator fun component1(): UShort = this.length

    public operator fun component2(): UByte = this.scsiStatus

    public operator fun component3(): UByte = this.pathId

    public operator fun component4(): UByte = this.targetId

    public operator fun component5(): UByte = this.lun

    public operator fun component6(): UByte = this.cdbLength

    public operator fun component7(): UByte = this.senseInfoLength

    public operator fun component8(): UByte = this.dataIn

    public operator fun component9(): UInt = this.dataTransferLength

    public operator fun component10(): UInt = this.timeOutValue

    public operator fun component11(): MutPtr = this.dataBuffer

    public operator fun component12(): UInt = this.senseInfoOffset

    public operator fun component13(): UByteArray = this.cdb

    public fun copy(length: UShort = this.length, scsiStatus: UByte = this.scsiStatus, pathId: UByte = this.pathId, targetId: UByte = this.targetId, lun: UByte = this.lun, cdbLength: UByte = this.cdbLength, senseInfoLength: UByte = this.senseInfoLength, dataIn: UByte = this.dataIn, dataTransferLength: UInt = this.dataTransferLength, timeOutValue: UInt = this.timeOutValue, dataBuffer: MutPtr = this.dataBuffer, senseInfoOffset: UInt = this.senseInfoOffset, cdb: UByteArray = this.cdb): ScsiPassThroughDirect = ScsiPassThroughDirect(length = length, scsiStatus = scsiStatus, pathId = pathId, targetId = targetId, lun = lun, cdbLength = cdbLength, senseInfoLength = senseInfoLength, dataIn = dataIn, dataTransferLength = dataTransferLength, timeOutValue = timeOutValue, dataBufferCtorArg = dataBuffer, senseInfoOffset = senseInfoOffset, cdb = cdb)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScsiPassThroughDirect) return false
        if (this.length != other.length) return false
        if (this.scsiStatus != other.scsiStatus) return false
        if (this.pathId != other.pathId) return false
        if (this.targetId != other.targetId) return false
        if (this.lun != other.lun) return false
        if (this.cdbLength != other.cdbLength) return false
        if (this.senseInfoLength != other.senseInfoLength) return false
        if (this.dataIn != other.dataIn) return false
        if (this.dataTransferLength != other.dataTransferLength) return false
        if (this.timeOutValue != other.timeOutValue) return false
        if (this.dataBuffer != other.dataBuffer) return false
        if (this.senseInfoOffset != other.senseInfoOffset) return false
        if (!this.cdb.contentEquals(other.cdb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.scsiStatus.hashCode()
        result = 31 * result + this.pathId.hashCode()
        result = 31 * result + this.targetId.hashCode()
        result = 31 * result + this.lun.hashCode()
        result = 31 * result + this.cdbLength.hashCode()
        result = 31 * result + this.senseInfoLength.hashCode()
        result = 31 * result + this.dataIn.hashCode()
        result = 31 * result + this.dataTransferLength.hashCode()
        result = 31 * result + this.timeOutValue.hashCode()
        result = 31 * result + this.dataBuffer.hashCode()
        result = 31 * result + this.senseInfoOffset.hashCode()
        result = 31 * result + this.cdb.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScsiPassThroughDirect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScsiPassThroughDirect> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): ScsiPassThroughDirect =
                    ScsiPassThroughDirect(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 36L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ScsiPassThroughDirect) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.scsiStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.pathId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.targetId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.lun)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.cdbLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.senseInfoLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.dataIn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dataTransferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.timeOutValue)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.dataBuffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.senseInfoOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 36L, value.cdb.toList())
                }
            }

        public operator fun invoke(
            length: UShort = 0u,
            scsiStatus: UByte = 0u,
            pathId: UByte = 0u,
            targetId: UByte = 0u,
            lun: UByte = 0u,
            cdbLength: UByte = 0u,
            senseInfoLength: UByte = 0u,
            dataIn: UByte = 0u,
            dataTransferLength: UInt = 0u,
            timeOutValue: UInt = 0u,
            dataBuffer: MutPtr = MutPtr(0L),
            senseInfoOffset: UInt = 0u,
            cdb: UByteArray = UByteArray(16),
        ): ScsiPassThroughDirect =
            ScsiPassThroughDirect(
                length = length,
                scsiStatus = scsiStatus,
                pathId = pathId,
                targetId = targetId,
                lun = lun,
                cdbLength = cdbLength,
                senseInfoLength = senseInfoLength,
                dataIn = dataIn,
                dataTransferLength = dataTransferLength,
                timeOutValue = timeOutValue,
                dataBufferCtorArg = dataBuffer,
                senseInfoOffset = senseInfoOffset,
                cdb = cdb,
            )
    }
}

public class ScsiPassThroughDirect32 internal constructor(
    public var length: UShort,
    public var scsiStatus: UByte,
    public var pathId: UByte,
    public var targetId: UByte,
    public var lun: UByte,
    public var cdbLength: UByte,
    public var senseInfoLength: UByte,
    public var dataIn: UByte,
    public var dataTransferLength: UInt,
    public var timeOutValue: UInt,
    dataBufferCtorArg: MutPtr,
    public var senseInfoOffset: UInt,
    public var cdb: UByteArray,
) {
    public var dataBuffer: MutPtr = dataBufferCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        scsiStatus = 0u,
        pathId = 0u,
        targetId = 0u,
        lun = 0u,
        cdbLength = 0u,
        senseInfoLength = 0u,
        dataIn = 0u,
        dataTransferLength = 0u,
        timeOutValue = 0u,
        dataBufferCtorArg = MutPtr(0L),
        senseInfoOffset = 0u,
        cdb = UByteArray(16),
    )

    public operator fun component1(): UShort = this.length

    public operator fun component2(): UByte = this.scsiStatus

    public operator fun component3(): UByte = this.pathId

    public operator fun component4(): UByte = this.targetId

    public operator fun component5(): UByte = this.lun

    public operator fun component6(): UByte = this.cdbLength

    public operator fun component7(): UByte = this.senseInfoLength

    public operator fun component8(): UByte = this.dataIn

    public operator fun component9(): UInt = this.dataTransferLength

    public operator fun component10(): UInt = this.timeOutValue

    public operator fun component11(): MutPtr = this.dataBuffer

    public operator fun component12(): UInt = this.senseInfoOffset

    public operator fun component13(): UByteArray = this.cdb

    public fun copy(length: UShort = this.length, scsiStatus: UByte = this.scsiStatus, pathId: UByte = this.pathId, targetId: UByte = this.targetId, lun: UByte = this.lun, cdbLength: UByte = this.cdbLength, senseInfoLength: UByte = this.senseInfoLength, dataIn: UByte = this.dataIn, dataTransferLength: UInt = this.dataTransferLength, timeOutValue: UInt = this.timeOutValue, dataBuffer: MutPtr = this.dataBuffer, senseInfoOffset: UInt = this.senseInfoOffset, cdb: UByteArray = this.cdb): ScsiPassThroughDirect32 = ScsiPassThroughDirect32(length = length, scsiStatus = scsiStatus, pathId = pathId, targetId = targetId, lun = lun, cdbLength = cdbLength, senseInfoLength = senseInfoLength, dataIn = dataIn, dataTransferLength = dataTransferLength, timeOutValue = timeOutValue, dataBufferCtorArg = dataBuffer, senseInfoOffset = senseInfoOffset, cdb = cdb)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScsiPassThroughDirect32) return false
        if (this.length != other.length) return false
        if (this.scsiStatus != other.scsiStatus) return false
        if (this.pathId != other.pathId) return false
        if (this.targetId != other.targetId) return false
        if (this.lun != other.lun) return false
        if (this.cdbLength != other.cdbLength) return false
        if (this.senseInfoLength != other.senseInfoLength) return false
        if (this.dataIn != other.dataIn) return false
        if (this.dataTransferLength != other.dataTransferLength) return false
        if (this.timeOutValue != other.timeOutValue) return false
        if (this.dataBuffer != other.dataBuffer) return false
        if (this.senseInfoOffset != other.senseInfoOffset) return false
        if (!this.cdb.contentEquals(other.cdb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.scsiStatus.hashCode()
        result = 31 * result + this.pathId.hashCode()
        result = 31 * result + this.targetId.hashCode()
        result = 31 * result + this.lun.hashCode()
        result = 31 * result + this.cdbLength.hashCode()
        result = 31 * result + this.senseInfoLength.hashCode()
        result = 31 * result + this.dataIn.hashCode()
        result = 31 * result + this.dataTransferLength.hashCode()
        result = 31 * result + this.timeOutValue.hashCode()
        result = 31 * result + this.dataBuffer.hashCode()
        result = 31 * result + this.senseInfoOffset.hashCode()
        result = 31 * result + this.cdb.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScsiPassThroughDirect32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScsiPassThroughDirect32> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): ScsiPassThroughDirect32 =
                    ScsiPassThroughDirect32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 36L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ScsiPassThroughDirect32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.scsiStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.pathId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.targetId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.lun)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.cdbLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.senseInfoLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.dataIn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dataTransferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.timeOutValue)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.dataBuffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.senseInfoOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 36L, value.cdb.toList())
                }
            }

        public operator fun invoke(
            length: UShort = 0u,
            scsiStatus: UByte = 0u,
            pathId: UByte = 0u,
            targetId: UByte = 0u,
            lun: UByte = 0u,
            cdbLength: UByte = 0u,
            senseInfoLength: UByte = 0u,
            dataIn: UByte = 0u,
            dataTransferLength: UInt = 0u,
            timeOutValue: UInt = 0u,
            dataBuffer: MutPtr = MutPtr(0L),
            senseInfoOffset: UInt = 0u,
            cdb: UByteArray = UByteArray(16),
        ): ScsiPassThroughDirect32 =
            ScsiPassThroughDirect32(
                length = length,
                scsiStatus = scsiStatus,
                pathId = pathId,
                targetId = targetId,
                lun = lun,
                cdbLength = cdbLength,
                senseInfoLength = senseInfoLength,
                dataIn = dataIn,
                dataTransferLength = dataTransferLength,
                timeOutValue = timeOutValue,
                dataBufferCtorArg = dataBuffer,
                senseInfoOffset = senseInfoOffset,
                cdb = cdb,
            )
    }
}

public class ScsiPassThroughDirect32Ex internal constructor(
    public var version: UInt,
    public var length: UInt,
    public var cdbLength: UInt,
    public var storAddressLength: UInt,
    public var scsiStatus: UByte,
    public var senseInfoLength: UByte,
    public var dataDirection: UByte,
    public var reserved: UByte,
    public var timeOutValue: UInt,
    public var storAddressOffset: UInt,
    public var senseInfoOffset: UInt,
    public var dataOutTransferLength: UInt,
    public var dataInTransferLength: UInt,
    dataOutBufferCtorArg: MutPtr,
    dataInBufferCtorArg: MutPtr,
    public var cdb: UByteArray,
) {
    public var dataOutBuffer: MutPtr = dataOutBufferCtorArg
        internal set

    public var dataInBuffer: MutPtr = dataInBufferCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        length = 0u,
        cdbLength = 0u,
        storAddressLength = 0u,
        scsiStatus = 0u,
        senseInfoLength = 0u,
        dataDirection = 0u,
        reserved = 0u,
        timeOutValue = 0u,
        storAddressOffset = 0u,
        senseInfoOffset = 0u,
        dataOutTransferLength = 0u,
        dataInTransferLength = 0u,
        dataOutBufferCtorArg = MutPtr(0L),
        dataInBufferCtorArg = MutPtr(0L),
        cdb = UByteArray(1),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): UInt = this.length

    public operator fun component3(): UInt = this.cdbLength

    public operator fun component4(): UInt = this.storAddressLength

    public operator fun component5(): UByte = this.scsiStatus

    public operator fun component6(): UByte = this.senseInfoLength

    public operator fun component7(): UByte = this.dataDirection

    public operator fun component8(): UByte = this.reserved

    public operator fun component9(): UInt = this.timeOutValue

    public operator fun component10(): UInt = this.storAddressOffset

    public operator fun component11(): UInt = this.senseInfoOffset

    public operator fun component12(): UInt = this.dataOutTransferLength

    public operator fun component13(): UInt = this.dataInTransferLength

    public operator fun component14(): MutPtr = this.dataOutBuffer

    public operator fun component15(): MutPtr = this.dataInBuffer

    public operator fun component16(): UByteArray = this.cdb

    public fun copy(version: UInt = this.version, length: UInt = this.length, cdbLength: UInt = this.cdbLength, storAddressLength: UInt = this.storAddressLength, scsiStatus: UByte = this.scsiStatus, senseInfoLength: UByte = this.senseInfoLength, dataDirection: UByte = this.dataDirection, reserved: UByte = this.reserved, timeOutValue: UInt = this.timeOutValue, storAddressOffset: UInt = this.storAddressOffset, senseInfoOffset: UInt = this.senseInfoOffset, dataOutTransferLength: UInt = this.dataOutTransferLength, dataInTransferLength: UInt = this.dataInTransferLength, dataOutBuffer: MutPtr = this.dataOutBuffer, dataInBuffer: MutPtr = this.dataInBuffer, cdb: UByteArray = this.cdb): ScsiPassThroughDirect32Ex = ScsiPassThroughDirect32Ex(version = version, length = length, cdbLength = cdbLength, storAddressLength = storAddressLength, scsiStatus = scsiStatus, senseInfoLength = senseInfoLength, dataDirection = dataDirection, reserved = reserved, timeOutValue = timeOutValue, storAddressOffset = storAddressOffset, senseInfoOffset = senseInfoOffset, dataOutTransferLength = dataOutTransferLength, dataInTransferLength = dataInTransferLength, dataOutBufferCtorArg = dataOutBuffer, dataInBufferCtorArg = dataInBuffer, cdb = cdb)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScsiPassThroughDirect32Ex) return false
        if (this.version != other.version) return false
        if (this.length != other.length) return false
        if (this.cdbLength != other.cdbLength) return false
        if (this.storAddressLength != other.storAddressLength) return false
        if (this.scsiStatus != other.scsiStatus) return false
        if (this.senseInfoLength != other.senseInfoLength) return false
        if (this.dataDirection != other.dataDirection) return false
        if (this.reserved != other.reserved) return false
        if (this.timeOutValue != other.timeOutValue) return false
        if (this.storAddressOffset != other.storAddressOffset) return false
        if (this.senseInfoOffset != other.senseInfoOffset) return false
        if (this.dataOutTransferLength != other.dataOutTransferLength) return false
        if (this.dataInTransferLength != other.dataInTransferLength) return false
        if (this.dataOutBuffer != other.dataOutBuffer) return false
        if (this.dataInBuffer != other.dataInBuffer) return false
        if (!this.cdb.contentEquals(other.cdb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.cdbLength.hashCode()
        result = 31 * result + this.storAddressLength.hashCode()
        result = 31 * result + this.scsiStatus.hashCode()
        result = 31 * result + this.senseInfoLength.hashCode()
        result = 31 * result + this.dataDirection.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.timeOutValue.hashCode()
        result = 31 * result + this.storAddressOffset.hashCode()
        result = 31 * result + this.senseInfoOffset.hashCode()
        result = 31 * result + this.dataOutTransferLength.hashCode()
        result = 31 * result + this.dataInTransferLength.hashCode()
        result = 31 * result + this.dataOutBuffer.hashCode()
        result = 31 * result + this.dataInBuffer.hashCode()
        result = 31 * result + this.cdb.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScsiPassThroughDirect32Ex> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScsiPassThroughDirect32Ex> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): ScsiPassThroughDirect32Ex =
                    ScsiPassThroughDirect32Ex(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 19L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 56L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ScsiPassThroughDirect32Ex) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cdbLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.storAddressLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.scsiStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.senseInfoLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 18L, value.dataDirection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 19L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.timeOutValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.storAddressOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.senseInfoOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dataOutTransferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dataInTransferLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.dataOutBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 48L, value.dataInBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 56L, value.cdb.toList())
                }
            }

        public operator fun invoke(
            version: UInt = 0u,
            length: UInt = 0u,
            cdbLength: UInt = 0u,
            storAddressLength: UInt = 0u,
            scsiStatus: UByte = 0u,
            senseInfoLength: UByte = 0u,
            dataDirection: UByte = 0u,
            reserved: UByte = 0u,
            timeOutValue: UInt = 0u,
            storAddressOffset: UInt = 0u,
            senseInfoOffset: UInt = 0u,
            dataOutTransferLength: UInt = 0u,
            dataInTransferLength: UInt = 0u,
            dataOutBuffer: MutPtr = MutPtr(0L),
            dataInBuffer: MutPtr = MutPtr(0L),
            cdb: UByteArray = UByteArray(1),
        ): ScsiPassThroughDirect32Ex =
            ScsiPassThroughDirect32Ex(
                version = version,
                length = length,
                cdbLength = cdbLength,
                storAddressLength = storAddressLength,
                scsiStatus = scsiStatus,
                senseInfoLength = senseInfoLength,
                dataDirection = dataDirection,
                reserved = reserved,
                timeOutValue = timeOutValue,
                storAddressOffset = storAddressOffset,
                senseInfoOffset = senseInfoOffset,
                dataOutTransferLength = dataOutTransferLength,
                dataInTransferLength = dataInTransferLength,
                dataOutBufferCtorArg = dataOutBuffer,
                dataInBufferCtorArg = dataInBuffer,
                cdb = cdb,
            )
    }
}

public class ScsiPassThroughDirectEx internal constructor(
    public var version: UInt,
    public var length: UInt,
    public var cdbLength: UInt,
    public var storAddressLength: UInt,
    public var scsiStatus: UByte,
    public var senseInfoLength: UByte,
    public var dataDirection: UByte,
    public var reserved: UByte,
    public var timeOutValue: UInt,
    public var storAddressOffset: UInt,
    public var senseInfoOffset: UInt,
    public var dataOutTransferLength: UInt,
    public var dataInTransferLength: UInt,
    dataOutBufferCtorArg: MutPtr,
    dataInBufferCtorArg: MutPtr,
    public var cdb: UByteArray,
) {
    public var dataOutBuffer: MutPtr = dataOutBufferCtorArg
        internal set

    public var dataInBuffer: MutPtr = dataInBufferCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        length = 0u,
        cdbLength = 0u,
        storAddressLength = 0u,
        scsiStatus = 0u,
        senseInfoLength = 0u,
        dataDirection = 0u,
        reserved = 0u,
        timeOutValue = 0u,
        storAddressOffset = 0u,
        senseInfoOffset = 0u,
        dataOutTransferLength = 0u,
        dataInTransferLength = 0u,
        dataOutBufferCtorArg = MutPtr(0L),
        dataInBufferCtorArg = MutPtr(0L),
        cdb = UByteArray(1),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): UInt = this.length

    public operator fun component3(): UInt = this.cdbLength

    public operator fun component4(): UInt = this.storAddressLength

    public operator fun component5(): UByte = this.scsiStatus

    public operator fun component6(): UByte = this.senseInfoLength

    public operator fun component7(): UByte = this.dataDirection

    public operator fun component8(): UByte = this.reserved

    public operator fun component9(): UInt = this.timeOutValue

    public operator fun component10(): UInt = this.storAddressOffset

    public operator fun component11(): UInt = this.senseInfoOffset

    public operator fun component12(): UInt = this.dataOutTransferLength

    public operator fun component13(): UInt = this.dataInTransferLength

    public operator fun component14(): MutPtr = this.dataOutBuffer

    public operator fun component15(): MutPtr = this.dataInBuffer

    public operator fun component16(): UByteArray = this.cdb

    public fun copy(version: UInt = this.version, length: UInt = this.length, cdbLength: UInt = this.cdbLength, storAddressLength: UInt = this.storAddressLength, scsiStatus: UByte = this.scsiStatus, senseInfoLength: UByte = this.senseInfoLength, dataDirection: UByte = this.dataDirection, reserved: UByte = this.reserved, timeOutValue: UInt = this.timeOutValue, storAddressOffset: UInt = this.storAddressOffset, senseInfoOffset: UInt = this.senseInfoOffset, dataOutTransferLength: UInt = this.dataOutTransferLength, dataInTransferLength: UInt = this.dataInTransferLength, dataOutBuffer: MutPtr = this.dataOutBuffer, dataInBuffer: MutPtr = this.dataInBuffer, cdb: UByteArray = this.cdb): ScsiPassThroughDirectEx = ScsiPassThroughDirectEx(version = version, length = length, cdbLength = cdbLength, storAddressLength = storAddressLength, scsiStatus = scsiStatus, senseInfoLength = senseInfoLength, dataDirection = dataDirection, reserved = reserved, timeOutValue = timeOutValue, storAddressOffset = storAddressOffset, senseInfoOffset = senseInfoOffset, dataOutTransferLength = dataOutTransferLength, dataInTransferLength = dataInTransferLength, dataOutBufferCtorArg = dataOutBuffer, dataInBufferCtorArg = dataInBuffer, cdb = cdb)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScsiPassThroughDirectEx) return false
        if (this.version != other.version) return false
        if (this.length != other.length) return false
        if (this.cdbLength != other.cdbLength) return false
        if (this.storAddressLength != other.storAddressLength) return false
        if (this.scsiStatus != other.scsiStatus) return false
        if (this.senseInfoLength != other.senseInfoLength) return false
        if (this.dataDirection != other.dataDirection) return false
        if (this.reserved != other.reserved) return false
        if (this.timeOutValue != other.timeOutValue) return false
        if (this.storAddressOffset != other.storAddressOffset) return false
        if (this.senseInfoOffset != other.senseInfoOffset) return false
        if (this.dataOutTransferLength != other.dataOutTransferLength) return false
        if (this.dataInTransferLength != other.dataInTransferLength) return false
        if (this.dataOutBuffer != other.dataOutBuffer) return false
        if (this.dataInBuffer != other.dataInBuffer) return false
        if (!this.cdb.contentEquals(other.cdb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.cdbLength.hashCode()
        result = 31 * result + this.storAddressLength.hashCode()
        result = 31 * result + this.scsiStatus.hashCode()
        result = 31 * result + this.senseInfoLength.hashCode()
        result = 31 * result + this.dataDirection.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.timeOutValue.hashCode()
        result = 31 * result + this.storAddressOffset.hashCode()
        result = 31 * result + this.senseInfoOffset.hashCode()
        result = 31 * result + this.dataOutTransferLength.hashCode()
        result = 31 * result + this.dataInTransferLength.hashCode()
        result = 31 * result + this.dataOutBuffer.hashCode()
        result = 31 * result + this.dataInBuffer.hashCode()
        result = 31 * result + this.cdb.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScsiPassThroughDirectEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScsiPassThroughDirectEx> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): ScsiPassThroughDirectEx =
                    ScsiPassThroughDirectEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 19L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 56L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ScsiPassThroughDirectEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cdbLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.storAddressLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.scsiStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.senseInfoLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 18L, value.dataDirection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 19L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.timeOutValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.storAddressOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.senseInfoOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dataOutTransferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dataInTransferLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.dataOutBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 48L, value.dataInBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 56L, value.cdb.toList())
                }
            }

        public operator fun invoke(
            version: UInt = 0u,
            length: UInt = 0u,
            cdbLength: UInt = 0u,
            storAddressLength: UInt = 0u,
            scsiStatus: UByte = 0u,
            senseInfoLength: UByte = 0u,
            dataDirection: UByte = 0u,
            reserved: UByte = 0u,
            timeOutValue: UInt = 0u,
            storAddressOffset: UInt = 0u,
            senseInfoOffset: UInt = 0u,
            dataOutTransferLength: UInt = 0u,
            dataInTransferLength: UInt = 0u,
            dataOutBuffer: MutPtr = MutPtr(0L),
            dataInBuffer: MutPtr = MutPtr(0L),
            cdb: UByteArray = UByteArray(1),
        ): ScsiPassThroughDirectEx =
            ScsiPassThroughDirectEx(
                version = version,
                length = length,
                cdbLength = cdbLength,
                storAddressLength = storAddressLength,
                scsiStatus = scsiStatus,
                senseInfoLength = senseInfoLength,
                dataDirection = dataDirection,
                reserved = reserved,
                timeOutValue = timeOutValue,
                storAddressOffset = storAddressOffset,
                senseInfoOffset = senseInfoOffset,
                dataOutTransferLength = dataOutTransferLength,
                dataInTransferLength = dataInTransferLength,
                dataOutBufferCtorArg = dataOutBuffer,
                dataInBufferCtorArg = dataInBuffer,
                cdb = cdb,
            )
    }
}

public data class ScsiPassThroughEx(
    public var version: UInt = 0u,
    public var length: UInt = 0u,
    public var cdbLength: UInt = 0u,
    public var storAddressLength: UInt = 0u,
    public var scsiStatus: UByte = 0u,
    public var senseInfoLength: UByte = 0u,
    public var dataDirection: UByte = 0u,
    public var reserved: UByte = 0u,
    public var timeOutValue: UInt = 0u,
    public var storAddressOffset: UInt = 0u,
    public var senseInfoOffset: UInt = 0u,
    public var dataOutTransferLength: UInt = 0u,
    public var dataInTransferLength: UInt = 0u,
    public var dataOutBufferOffset: Int = 0,
    public var dataInBufferOffset: Int = 0,
    public var cdb: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScsiPassThroughEx) return false
        if (this.version != other.version) return false
        if (this.length != other.length) return false
        if (this.cdbLength != other.cdbLength) return false
        if (this.storAddressLength != other.storAddressLength) return false
        if (this.scsiStatus != other.scsiStatus) return false
        if (this.senseInfoLength != other.senseInfoLength) return false
        if (this.dataDirection != other.dataDirection) return false
        if (this.reserved != other.reserved) return false
        if (this.timeOutValue != other.timeOutValue) return false
        if (this.storAddressOffset != other.storAddressOffset) return false
        if (this.senseInfoOffset != other.senseInfoOffset) return false
        if (this.dataOutTransferLength != other.dataOutTransferLength) return false
        if (this.dataInTransferLength != other.dataInTransferLength) return false
        if (this.dataOutBufferOffset != other.dataOutBufferOffset) return false
        if (this.dataInBufferOffset != other.dataInBufferOffset) return false
        if (!this.cdb.contentEquals(other.cdb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.cdbLength.hashCode()
        result = 31 * result + this.storAddressLength.hashCode()
        result = 31 * result + this.scsiStatus.hashCode()
        result = 31 * result + this.senseInfoLength.hashCode()
        result = 31 * result + this.dataDirection.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.timeOutValue.hashCode()
        result = 31 * result + this.storAddressOffset.hashCode()
        result = 31 * result + this.senseInfoOffset.hashCode()
        result = 31 * result + this.dataOutTransferLength.hashCode()
        result = 31 * result + this.dataInTransferLength.hashCode()
        result = 31 * result + this.dataOutBufferOffset.hashCode()
        result = 31 * result + this.dataInBufferOffset.hashCode()
        result = 31 * result + this.cdb.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScsiPassThroughEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScsiPassThroughEx> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): ScsiPassThroughEx =
                    ScsiPassThroughEx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 19L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 56L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ScsiPassThroughEx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cdbLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.storAddressLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.scsiStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.senseInfoLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 18L, value.dataDirection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 19L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.timeOutValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.storAddressOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.senseInfoOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dataOutTransferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dataInTransferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 40L, value.dataOutBufferOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 48L, value.dataInBufferOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 56L, value.cdb.toList())
                }
            }
    }
}

public data class SrbIoControl(
    public var headerLength: UInt = 0u,
    public var signature: UByteArray = UByteArray(8),
    public var timeout: UInt = 0u,
    public var controlCode: UInt = 0u,
    public var returnCode: UInt = 0u,
    public var length: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SrbIoControl) return false
        if (this.headerLength != other.headerLength) return false
        if (!this.signature.contentEquals(other.signature)) return false
        if (this.timeout != other.timeout) return false
        if (this.controlCode != other.controlCode) return false
        if (this.returnCode != other.returnCode) return false
        if (this.length != other.length) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.headerLength.hashCode()
        result = 31 * result + this.signature.contentHashCode()
        result = 31 * result + this.timeout.hashCode()
        result = 31 * result + this.controlCode.hashCode()
        result = 31 * result + this.returnCode.hashCode()
        result = 31 * result + this.length.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SrbIoControl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SrbIoControl> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): SrbIoControl =
                    SrbIoControl(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: SrbIoControl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.headerLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 4L, value.signature.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.timeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.controlCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.returnCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.length)
                }
            }
    }
}

public data class StorageDiagnosticMpRequest(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var targetType: MpStorageDiagnosticTargetType = 0,
    public var level: MpStorageDiagnosticLevel = 0,
    public var providerId: Guid = Guid(),
    public var bufferSize: UInt = 0u,
    public var reserved: UInt = 0u,
    public var dataBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageDiagnosticMpRequest) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.targetType != other.targetType) return false
        if (this.level != other.level) return false
        if (this.providerId != other.providerId) return false
        if (this.bufferSize != other.bufferSize) return false
        if (this.reserved != other.reserved) return false
        if (!this.dataBuffer.contentEquals(other.dataBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.targetType.hashCode()
        result = 31 * result + this.level.hashCode()
        result = 31 * result + this.providerId.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.dataBuffer.contentHashCode()
        return result
    }
}

public data class StorageEnduranceDataDescriptor(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var enduranceInfo: StorageEnduranceInfo = StorageEnduranceInfo(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageEnduranceDataDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageEnduranceDataDescriptor> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): StorageEnduranceDataDescriptor =
                    StorageEnduranceDataDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (StorageEnduranceInfo.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: StorageEnduranceDataDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (StorageEnduranceInfo.typeLayout()).writeNative(addr + 8L, value.enduranceInfo)
                }
            }
    }
}

public data class StorageEnduranceInfo(
    public var validFields: UInt = 0u,
    public var groupId: UInt = 0u,
    public var flags: StorageEnduranceInfo0 = StorageEnduranceInfo0(),
    public var lifePercentage: UInt = 0u,
    public var bytesReadCount: UByteArray = UByteArray(16),
    public var byteWriteCount: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageEnduranceInfo) return false
        if (this.validFields != other.validFields) return false
        if (this.groupId != other.groupId) return false
        if (this.flags != other.flags) return false
        if (this.lifePercentage != other.lifePercentage) return false
        if (!this.bytesReadCount.contentEquals(other.bytesReadCount)) return false
        if (!this.byteWriteCount.contentEquals(other.byteWriteCount)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.validFields.hashCode()
        result = 31 * result + this.groupId.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.lifePercentage.hashCode()
        result = 31 * result + this.bytesReadCount.contentHashCode()
        result = 31 * result + this.byteWriteCount.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageEnduranceInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageEnduranceInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): StorageEnduranceInfo =
                    StorageEnduranceInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (StorageEnduranceInfo0.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 32L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: StorageEnduranceInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.validFields)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.groupId)
                    (StorageEnduranceInfo0.typeLayout()).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.lifePercentage)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 16L, value.bytesReadCount.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 32L, value.byteWriteCount.toList())
                }
            }
    }
}

public data class StorageEnduranceInfo0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageEnduranceInfo0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageEnduranceInfo0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): StorageEnduranceInfo0 =
                    StorageEnduranceInfo0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: StorageEnduranceInfo0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class StorageFirmwareActivate(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var slotToActivate: UByte = 0u,
    public var reserved0: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageFirmwareActivate) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.slotToActivate != other.slotToActivate) return false
        if (!this.reserved0.contentEquals(other.reserved0)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.slotToActivate.hashCode()
        result = 31 * result + this.reserved0.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageFirmwareActivate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageFirmwareActivate> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): StorageFirmwareActivate =
                    StorageFirmwareActivate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 9L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: StorageFirmwareActivate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.slotToActivate)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 9L, value.reserved0.toList())
                }
            }
    }
}

public data class StorageFirmwareDownload(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var offset: ULong = 0uL,
    public var bufferSize: ULong = 0uL,
    public var imageBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageFirmwareDownload) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.offset != other.offset) return false
        if (this.bufferSize != other.bufferSize) return false
        if (!this.imageBuffer.contentEquals(other.imageBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.imageBuffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageFirmwareDownload> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageFirmwareDownload> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): StorageFirmwareDownload =
                    StorageFirmwareDownload(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 24L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: StorageFirmwareDownload) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.bufferSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 24L, value.imageBuffer.toList())
                }
            }
    }
}

public data class StorageFirmwareDownloadV2(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var offset: ULong = 0uL,
    public var bufferSize: ULong = 0uL,
    public var slot: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
    public var imageSize: UInt = 0u,
    public var imageBuffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageFirmwareDownloadV2) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.offset != other.offset) return false
        if (this.bufferSize != other.bufferSize) return false
        if (this.slot != other.slot) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.imageSize != other.imageSize) return false
        if (!this.imageBuffer.contentEquals(other.imageBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.bufferSize.hashCode()
        result = 31 * result + this.slot.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.imageSize.hashCode()
        result = 31 * result + this.imageBuffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageFirmwareDownloadV2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageFirmwareDownloadV2> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): StorageFirmwareDownloadV2 =
                    StorageFirmwareDownloadV2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 25L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 32L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: StorageFirmwareDownloadV2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.bufferSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 24L, value.slot)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 25L, value.reserved.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.imageSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 32L, value.imageBuffer.toList())
                }
            }
    }
}

public data class StorageFirmwareInfo(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var upgradeSupport: Boolean = false,
    public var slotCount: UByte = 0u,
    public var activeSlot: UByte = 0u,
    public var pendingActivateSlot: UByte = 0u,
    public var reserved: UInt = 0u,
    public var slot: List<StorageFirmwareSlotInfo> = List(1) { StorageFirmwareSlotInfo() },
)

public data class StorageFirmwareInfoV2(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var upgradeSupport: Boolean = false,
    public var slotCount: UByte = 0u,
    public var activeSlot: UByte = 0u,
    public var pendingActivateSlot: UByte = 0u,
    public var firmwareShared: Boolean = false,
    public var reserved: UByteArray = UByteArray(3),
    public var imagePayloadAlignment: UInt = 0u,
    public var imagePayloadMaxSize: UInt = 0u,
    public var slot: List<StorageFirmwareSlotInfoV2> = List(1) { StorageFirmwareSlotInfoV2() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageFirmwareInfoV2) return false
        if (this.version != other.version) return false
        if (this.size != other.size) return false
        if (this.upgradeSupport != other.upgradeSupport) return false
        if (this.slotCount != other.slotCount) return false
        if (this.activeSlot != other.activeSlot) return false
        if (this.pendingActivateSlot != other.pendingActivateSlot) return false
        if (this.firmwareShared != other.firmwareShared) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.imagePayloadAlignment != other.imagePayloadAlignment) return false
        if (this.imagePayloadMaxSize != other.imagePayloadMaxSize) return false
        if (this.slot != other.slot) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.upgradeSupport.hashCode()
        result = 31 * result + this.slotCount.hashCode()
        result = 31 * result + this.activeSlot.hashCode()
        result = 31 * result + this.pendingActivateSlot.hashCode()
        result = 31 * result + this.firmwareShared.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.imagePayloadAlignment.hashCode()
        result = 31 * result + this.imagePayloadMaxSize.hashCode()
        result = 31 * result + this.slot.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageFirmwareInfoV2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageFirmwareInfoV2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): StorageFirmwareInfoV2 =
                    StorageFirmwareInfoV2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 11L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 13L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(StorageFirmwareSlotInfoV2.typeLayout(), (1).toInt())
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: StorageFirmwareInfoV2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.upgradeSupport)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.slotCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 10L, value.activeSlot)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 11L, value.pendingActivateSlot)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 12L, value.firmwareShared)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 13L, value.reserved.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.imagePayloadAlignment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.imagePayloadMaxSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(StorageFirmwareSlotInfoV2.typeLayout(), (1).toInt())
                    ).writeNative(addr + 24L, value.slot)
                }
            }
    }
}

public data class StorageFirmwareSlotInfo(
    public var slotNumber: UByte = 0u,
    public var readOnly: Boolean = false,
    public var reserved: UByteArray = UByteArray(6),
    public var revision: StorageFirmwareSlotInfo0 = StorageFirmwareSlotInfo0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageFirmwareSlotInfo) return false
        if (this.slotNumber != other.slotNumber) return false
        if (this.readOnly != other.readOnly) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.revision != other.revision) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.slotNumber.hashCode()
        result = 31 * result + this.readOnly.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.revision.hashCode()
        return result
    }
}

public data class StorageFirmwareSlotInfo0(
    public var info: UByteArray = UByteArray(8),
    public var asUlonglong: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageFirmwareSlotInfo0) return false
        if (!this.info.contentEquals(other.info)) return false
        if (this.asUlonglong != other.asUlonglong) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.info.contentHashCode()
        result = 31 * result + this.asUlonglong.hashCode()
        return result
    }
}

public data class StorageFirmwareSlotInfoV2(
    public var slotNumber: UByte = 0u,
    public var readOnly: Boolean = false,
    public var reserved: UByteArray = UByteArray(6),
    public var revision: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageFirmwareSlotInfoV2) return false
        if (this.slotNumber != other.slotNumber) return false
        if (this.readOnly != other.readOnly) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (!this.revision.contentEquals(other.revision)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.slotNumber.hashCode()
        result = 31 * result + this.readOnly.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.revision.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageFirmwareSlotInfoV2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StorageFirmwareSlotInfoV2> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): StorageFirmwareSlotInfoV2 =
                    StorageFirmwareSlotInfoV2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 2L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: StorageFirmwareSlotInfoV2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.slotNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 1L, value.readOnly)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 2L, value.reserved.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 8L, value.revision.toList())
                }
            }
    }
}
