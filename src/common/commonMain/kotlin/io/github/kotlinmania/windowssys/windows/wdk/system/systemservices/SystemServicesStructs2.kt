@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.systemservices

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.wdk.foundation.DispatcherHeader
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Kevent
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PioRemoveLockTrackingBlock
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PkdeferredRoutine
import io.github.kotlinmania.windowssys.windows.wdk.foundation.Pkinterrupt
import io.github.kotlinmania.windowssys.windows.wdk.foundation.PobjectType
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.UnicodeString
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.debug.XstateConfiguration
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ListEntry
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.NtProductType
import io.github.kotlinmania.windowssys.windows.win32.system.kernel.ProcessorNumber

public data class IoFoextSiloParameters00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoFoextSiloParameters00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoFoextSiloParameters00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): IoFoextSiloParameters00 =
                    IoFoextSiloParameters00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: IoFoextSiloParameters00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class IoInterruptMessageInfo(
    public var unifiedIrql: UByte = 0u,
    public var messageCount: UInt = 0u,
    public var messageInfo: List<IoInterruptMessageInfoEntry> = List(1) { IoInterruptMessageInfoEntry() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoInterruptMessageInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoInterruptMessageInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): IoInterruptMessageInfo =
                    IoInterruptMessageInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(IoInterruptMessageInfoEntry.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IoInterruptMessageInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.unifiedIrql)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.messageCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(IoInterruptMessageInfoEntry.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.messageInfo)
                }
            }
    }
}

public data class IoInterruptMessageInfoEntry(
    public var messageAddress: Long = 0L,
    public var targetProcessorSet: Int = 0,
    public var interruptObject: Pkinterrupt = 0L,
    public var messageData: UInt = 0u,
    public var vector: UInt = 0u,
    public var irql: UByte = 0u,
    public var mode: KinterruptMode = 0,
    public var polarity: KinterruptPolarity = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoInterruptMessageInfoEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoInterruptMessageInfoEntry> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): IoInterruptMessageInfoEntry =
                    IoInterruptMessageInfoEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: IoInterruptMessageInfoEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.messageAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.targetProcessorSet)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.interruptObject)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.messageData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.vector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 32L, value.irql)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.mode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.polarity)
                }
            }
    }
}

public data class IoRemoveLock(
    public var common: IoRemoveLockCommonBlock = IoRemoveLockCommonBlock(),
)

public data class IoRemoveLockCommonBlock(
    public var removed: Boolean = false,
    public var reserved: BooleanArray = BooleanArray(3),
    public var ioCount: Int = 0,
    public var removeEvent: Kevent = Kevent(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoRemoveLockCommonBlock) return false
        if (this.removed != other.removed) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.ioCount != other.ioCount) return false
        if (this.removeEvent != other.removeEvent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.removed.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.ioCount.hashCode()
        result = 31 * result + this.removeEvent.hashCode()
        return result
    }
}

public class IoRemoveLockDbgBlock internal constructor(
    public var signature: Int,
    public var highWatermark: UInt,
    public var maxLockedTicks: Long,
    public var allocateTag: Int,
    public var lockList: ListEntry,
    public var spin: Int,
    public var lowMemoryCount: Int,
    public var reserved1: UIntArray,
    reserved2CtorArg: MutPtr,
    public var blocks: PioRemoveLockTrackingBlock,
) {
    public var reserved2: MutPtr = reserved2CtorArg
        internal set

    public constructor() : this(
        signature = 0,
        highWatermark = 0u,
        maxLockedTicks = 0L,
        allocateTag = 0,
        lockList = ListEntry(),
        spin = 0,
        lowMemoryCount = 0,
        reserved1 = UIntArray(4),
        reserved2CtorArg = MutPtr(0L),
        blocks = 0,
    )

    public operator fun component1(): Int = this.signature

    public operator fun component2(): UInt = this.highWatermark

    public operator fun component3(): Long = this.maxLockedTicks

    public operator fun component4(): Int = this.allocateTag

    public operator fun component5(): ListEntry = this.lockList

    public operator fun component6(): Int = this.spin

    public operator fun component7(): Int = this.lowMemoryCount

    public operator fun component8(): UIntArray = this.reserved1

    public operator fun component9(): MutPtr = this.reserved2

    public operator fun component10(): PioRemoveLockTrackingBlock = this.blocks

    public fun copy(signature: Int = this.signature, highWatermark: UInt = this.highWatermark, maxLockedTicks: Long = this.maxLockedTicks, allocateTag: Int = this.allocateTag, lockList: ListEntry = this.lockList, spin: Int = this.spin, lowMemoryCount: Int = this.lowMemoryCount, reserved1: UIntArray = this.reserved1, reserved2: MutPtr = this.reserved2, blocks: PioRemoveLockTrackingBlock = this.blocks): IoRemoveLockDbgBlock = IoRemoveLockDbgBlock(signature = signature, highWatermark = highWatermark, maxLockedTicks = maxLockedTicks, allocateTag = allocateTag, lockList = lockList, spin = spin, lowMemoryCount = lowMemoryCount, reserved1 = reserved1, reserved2CtorArg = reserved2, blocks = blocks)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoRemoveLockDbgBlock) return false
        if (this.signature != other.signature) return false
        if (this.highWatermark != other.highWatermark) return false
        if (this.maxLockedTicks != other.maxLockedTicks) return false
        if (this.allocateTag != other.allocateTag) return false
        if (this.lockList != other.lockList) return false
        if (this.spin != other.spin) return false
        if (this.lowMemoryCount != other.lowMemoryCount) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.blocks != other.blocks) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.signature.hashCode()
        result = 31 * result + this.highWatermark.hashCode()
        result = 31 * result + this.maxLockedTicks.hashCode()
        result = 31 * result + this.allocateTag.hashCode()
        result = 31 * result + this.lockList.hashCode()
        result = 31 * result + this.spin.hashCode()
        result = 31 * result + this.lowMemoryCount.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.blocks.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            signature: Int = 0,
            highWatermark: UInt = 0u,
            maxLockedTicks: Long = 0L,
            allocateTag: Int = 0,
            lockList: ListEntry = ListEntry(),
            spin: Int = 0,
            lowMemoryCount: Int = 0,
            reserved1: UIntArray = UIntArray(4),
            reserved2: MutPtr = MutPtr(0L),
            blocks: PioRemoveLockTrackingBlock = 0,
        ): IoRemoveLockDbgBlock =
            IoRemoveLockDbgBlock(
                signature = signature,
                highWatermark = highWatermark,
                maxLockedTicks = maxLockedTicks,
                allocateTag = allocateTag,
                lockList = lockList,
                spin = spin,
                lowMemoryCount = lowMemoryCount,
                reserved1 = reserved1,
                reserved2CtorArg = reserved2,
                blocks = blocks,
            )
    }
}

public data class IoReportInterruptActiveStateParameters(
    public var version: UInt = 0u,
    public var connectionContext: IoReportInterruptActiveStateParameters0 = IoReportInterruptActiveStateParameters0(),
)

public class IoReportInterruptActiveStateParameters0 internal constructor(
    genericCtorArg: MutPtr,
    public var interruptObject: Pkinterrupt,
    interruptMessageTableCtorArg: MutPtr,
) {
    public var generic: MutPtr = genericCtorArg
        internal set

    public var interruptMessageTable: MutPtr = interruptMessageTableCtorArg
        internal set

    public constructor() : this(
        genericCtorArg = MutPtr(0L),
        interruptObject = 0L,
        interruptMessageTableCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.generic

    public operator fun component2(): Pkinterrupt = this.interruptObject

    public operator fun component3(): MutPtr = this.interruptMessageTable

    public fun copy(generic: MutPtr = this.generic, interruptObject: Pkinterrupt = this.interruptObject, interruptMessageTable: MutPtr = this.interruptMessageTable): IoReportInterruptActiveStateParameters0 = IoReportInterruptActiveStateParameters0(genericCtorArg = generic, interruptObject = interruptObject, interruptMessageTableCtorArg = interruptMessageTable)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoReportInterruptActiveStateParameters0) return false
        if (this.generic != other.generic) return false
        if (this.interruptObject != other.interruptObject) return false
        if (this.interruptMessageTable != other.interruptMessageTable) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.generic.hashCode()
        result = 31 * result + this.interruptObject.hashCode()
        result = 31 * result + this.interruptMessageTable.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            generic: MutPtr = MutPtr(0L),
            interruptObject: Pkinterrupt = 0L,
            interruptMessageTable: MutPtr = MutPtr(0L),
        ): IoReportInterruptActiveStateParameters0 =
            IoReportInterruptActiveStateParameters0(
                genericCtorArg = generic,
                interruptObject = interruptObject,
                interruptMessageTableCtorArg = interruptMessageTable,
            )
    }
}

public data class IoResourceDescriptor(
    public var option: UByte = 0u,
    public var type: UByte = 0u,
    public var shareDisposition: UByte = 0u,
    public var spare1: UByte = 0u,
    public var flags: UShort = 0u,
    public var spare2: UShort = 0u,
    public var u: IoResourceDescriptor0 = IoResourceDescriptor0(),
)

public data class IoResourceDescriptor0(
    public var port: IoResourceDescriptor00 = IoResourceDescriptor00(),
    public var memory: IoResourceDescriptor01 = IoResourceDescriptor01(),
    public var interrupt: IoResourceDescriptor02 = IoResourceDescriptor02(),
    public var dma: IoResourceDescriptor03 = IoResourceDescriptor03(),
    public var dmaV3: IoResourceDescriptor04 = IoResourceDescriptor04(),
    public var generic: IoResourceDescriptor05 = IoResourceDescriptor05(),
    public var devicePrivate: IoResourceDescriptor06 = IoResourceDescriptor06(),
    public var busNumber: IoResourceDescriptor07 = IoResourceDescriptor07(),
    public var configData: IoResourceDescriptor08 = IoResourceDescriptor08(),
    public var memory40: IoResourceDescriptor09 = IoResourceDescriptor09(),
    public var memory48: IoResourceDescriptor010 = IoResourceDescriptor010(),
    public var memory64: IoResourceDescriptor011 = IoResourceDescriptor011(),
    public var connection: IoResourceDescriptor012 = IoResourceDescriptor012(),
)

public data class IoResourceDescriptor07(
    public var length: UInt = 0u,
    public var minBusNumber: UInt = 0u,
    public var maxBusNumber: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoResourceDescriptor07> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoResourceDescriptor07> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): IoResourceDescriptor07 =
                    IoResourceDescriptor07(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: IoResourceDescriptor07) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.minBusNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.maxBusNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.reserved)
                }
            }
    }
}

public data class IoResourceDescriptor08(
    public var priority: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var reserved2: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoResourceDescriptor08> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoResourceDescriptor08> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): IoResourceDescriptor08 =
                    IoResourceDescriptor08(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IoResourceDescriptor08) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.priority)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.reserved2)
                }
            }
    }
}

public data class IoResourceDescriptor012(
    public var cls: UByte = 0u,
    public var type: UByte = 0u,
    public var reserved1: UByte = 0u,
    public var reserved2: UByte = 0u,
    public var idLowPart: UInt = 0u,
    public var idHighPart: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoResourceDescriptor012> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoResourceDescriptor012> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): IoResourceDescriptor012 =
                    IoResourceDescriptor012(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IoResourceDescriptor012) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.cls)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.reserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.reserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.idLowPart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.idHighPart)
                }
            }
    }
}

public data class IoResourceDescriptor06(
    public var data: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoResourceDescriptor06) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int = this.data.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoResourceDescriptor06> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoResourceDescriptor06> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): IoResourceDescriptor06 =
                    IoResourceDescriptor06(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                        ).readNative(addr).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: IoResourceDescriptor06) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                    ).writeNative(addr, value.data.toList())
                }
            }
    }
}

public data class IoResourceDescriptor04(
    public var requestLine: UInt = 0u,
    public var reserved: UInt = 0u,
    public var channel: UInt = 0u,
    public var transferWidth: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoResourceDescriptor04> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoResourceDescriptor04> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): IoResourceDescriptor04 =
                    IoResourceDescriptor04(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: IoResourceDescriptor04) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.requestLine)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.channel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.transferWidth)
                }
            }
    }
}

public data class IoResourceDescriptor03(
    public var minimumChannel: UInt = 0u,
    public var maximumChannel: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoResourceDescriptor03> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoResourceDescriptor03> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): IoResourceDescriptor03 =
                    IoResourceDescriptor03(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: IoResourceDescriptor03) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.minimumChannel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maximumChannel)
                }
            }
    }
}

public data class IoResourceDescriptor05(
    public var length: UInt = 0u,
    public var alignment: UInt = 0u,
    public var minimumAddress: Long = 0L,
    public var maximumAddress: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoResourceDescriptor05> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoResourceDescriptor05> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): IoResourceDescriptor05 =
                    IoResourceDescriptor05(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IoResourceDescriptor05) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.alignment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.minimumAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.maximumAddress)
                }
            }
    }
}

public data class IoResourceDescriptor02(
    public var minimumVector: UInt = 0u,
    public var maximumVector: UInt = 0u,
    public var affinityPolicy: IrqDevicePolicy = 0,
    public var priorityPolicy: IrqPriority = 0,
    public var targetedProcessors: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoResourceDescriptor02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoResourceDescriptor02> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): IoResourceDescriptor02 =
                    IoResourceDescriptor02(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IoResourceDescriptor02) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.minimumVector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maximumVector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.affinityPolicy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.priorityPolicy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.targetedProcessors)
                }
            }
    }
}

public data class IoResourceDescriptor09(
    public var length40: UInt = 0u,
    public var alignment40: UInt = 0u,
    public var minimumAddress: Long = 0L,
    public var maximumAddress: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoResourceDescriptor09> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoResourceDescriptor09> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): IoResourceDescriptor09 =
                    IoResourceDescriptor09(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IoResourceDescriptor09) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length40)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.alignment40)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.minimumAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.maximumAddress)
                }
            }
    }
}

public data class IoResourceDescriptor010(
    public var length48: UInt = 0u,
    public var alignment48: UInt = 0u,
    public var minimumAddress: Long = 0L,
    public var maximumAddress: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoResourceDescriptor010> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoResourceDescriptor010> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): IoResourceDescriptor010 =
                    IoResourceDescriptor010(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IoResourceDescriptor010) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length48)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.alignment48)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.minimumAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.maximumAddress)
                }
            }
    }
}

public data class IoResourceDescriptor011(
    public var length64: UInt = 0u,
    public var alignment64: UInt = 0u,
    public var minimumAddress: Long = 0L,
    public var maximumAddress: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoResourceDescriptor011> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoResourceDescriptor011> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): IoResourceDescriptor011 =
                    IoResourceDescriptor011(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IoResourceDescriptor011) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length64)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.alignment64)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.minimumAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.maximumAddress)
                }
            }
    }
}

public data class IoResourceDescriptor01(
    public var length: UInt = 0u,
    public var alignment: UInt = 0u,
    public var minimumAddress: Long = 0L,
    public var maximumAddress: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoResourceDescriptor01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoResourceDescriptor01> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): IoResourceDescriptor01 =
                    IoResourceDescriptor01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IoResourceDescriptor01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.alignment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.minimumAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.maximumAddress)
                }
            }
    }
}

public data class IoResourceDescriptor00(
    public var length: UInt = 0u,
    public var alignment: UInt = 0u,
    public var minimumAddress: Long = 0L,
    public var maximumAddress: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoResourceDescriptor00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoResourceDescriptor00> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): IoResourceDescriptor00 =
                    IoResourceDescriptor00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IoResourceDescriptor00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.alignment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.minimumAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.maximumAddress)
                }
            }
    }
}

public data class IoResourceList(
    public var version: UShort = 0u,
    public var revision: UShort = 0u,
    public var count: UInt = 0u,
    public var descriptors: List<IoResourceDescriptor> = List(1) { IoResourceDescriptor() },
)

public data class IoResourceRequirementsList(
    public var listSize: UInt = 0u,
    public var interfaceType: InterfaceType = 0,
    public var busNumber: UInt = 0u,
    public var slotNumber: UInt = 0u,
    public var reserved: UIntArray = UIntArray(3),
    public var alternativeLists: UInt = 0u,
    public var list: List<IoResourceList> = List(1) { IoResourceList() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoResourceRequirementsList) return false
        if (this.listSize != other.listSize) return false
        if (this.interfaceType != other.interfaceType) return false
        if (this.busNumber != other.busNumber) return false
        if (this.slotNumber != other.slotNumber) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.alternativeLists != other.alternativeLists) return false
        if (this.list != other.list) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.listSize.hashCode()
        result = 31 * result + this.interfaceType.hashCode()
        result = 31 * result + this.busNumber.hashCode()
        result = 31 * result + this.slotNumber.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.alternativeLists.hashCode()
        result = 31 * result + this.list.hashCode()
        return result
    }
}

public data class IoSessionConnectInfo(
    public var sessionId: UInt = 0u,
    public var localSession: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoSessionConnectInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoSessionConnectInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): IoSessionConnectInfo =
                    IoSessionConnectInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: IoSessionConnectInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sessionId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.localSession)
                }
            }
    }
}

public data class IoSessionStateInformation(
    public var sessionId: UInt = 0u,
    public var sessionState: IoSessionState = 0,
    public var localSession: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoSessionStateInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoSessionStateInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): IoSessionStateInformation =
                    IoSessionStateInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IoSessionStateInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sessionId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.sessionState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.localSession)
                }
            }
    }
}

public class IoSessionStateNotification internal constructor(
    public var size: UInt,
    public var flags: UInt,
    ioObjectCtorArg: MutPtr,
    public var eventMask: UInt,
    contextCtorArg: MutPtr,
) {
    public var ioObject: MutPtr = ioObjectCtorArg
        internal set

    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        flags = 0u,
        ioObjectCtorArg = MutPtr(0L),
        eventMask = 0u,
        contextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): MutPtr = this.ioObject

    public operator fun component4(): UInt = this.eventMask

    public operator fun component5(): MutPtr = this.context

    public fun copy(size: UInt = this.size, flags: UInt = this.flags, ioObject: MutPtr = this.ioObject, eventMask: UInt = this.eventMask, context: MutPtr = this.context): IoSessionStateNotification = IoSessionStateNotification(size = size, flags = flags, ioObjectCtorArg = ioObject, eventMask = eventMask, contextCtorArg = context)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoSessionStateNotification) return false
        if (this.size != other.size) return false
        if (this.flags != other.flags) return false
        if (this.ioObject != other.ioObject) return false
        if (this.eventMask != other.eventMask) return false
        if (this.context != other.context) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.ioObject.hashCode()
        result = 31 * result + this.eventMask.hashCode()
        result = 31 * result + this.context.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoSessionStateNotification> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoSessionStateNotification> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): IoSessionStateNotification =
                    IoSessionStateNotification(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: IoSessionStateNotification) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.ioObject)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.eventMask)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.context)
                }
            }

        public operator fun invoke(
            size: UInt = 0u,
            flags: UInt = 0u,
            ioObject: MutPtr = MutPtr(0L),
            eventMask: UInt = 0u,
            context: MutPtr = MutPtr(0L),
        ): IoSessionStateNotification =
            IoSessionStateNotification(
                size = size,
                flags = flags,
                ioObjectCtorArg = ioObject,
                eventMask = eventMask,
                contextCtorArg = context,
            )
    }
}

public data class IoStatusBlock32(
    public var status: Ntstatus = 0,
    public var information: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStatusBlock32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IoStatusBlock32> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): IoStatusBlock32 =
                    IoStatusBlock32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: IoStatusBlock32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.status)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.information)
                }
            }
    }
}

public data class IoStatusBlock64(
    public var anonymous: IoStatusBlock640 = IoStatusBlock640(),
    public var information: ULong = 0uL,
)

public class IoStatusBlock640 internal constructor(
    public var status: Ntstatus,
    pointerCtorArg: MutPtr,
) {
    public var pointer: MutPtr = pointerCtorArg
        internal set

    public constructor() : this(
        status = 0,
        pointerCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Ntstatus = this.status

    public operator fun component2(): MutPtr = this.pointer

    public fun copy(status: Ntstatus = this.status, pointer: MutPtr = this.pointer): IoStatusBlock640 = IoStatusBlock640(status = status, pointerCtorArg = pointer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IoStatusBlock640) return false
        if (this.status != other.status) return false
        if (this.pointer != other.pointer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.status.hashCode()
        result = 31 * result + this.pointer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            status: Ntstatus = 0,
            pointer: MutPtr = MutPtr(0L),
        ): IoStatusBlock640 =
            IoStatusBlock640(
                status = status,
                pointerCtorArg = pointer,
            )
    }
}

public class KaddressRange internal constructor(
    addressCtorArg: MutPtr,
    public var size: Int,
) {
    public var address: MutPtr = addressCtorArg
        internal set

    public constructor() : this(
        addressCtorArg = MutPtr(0L),
        size = 0,
    )

    public operator fun component1(): MutPtr = this.address

    public operator fun component2(): Int = this.size

    public fun copy(address: MutPtr = this.address, size: Int = this.size): KaddressRange = KaddressRange(addressCtorArg = address, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KaddressRange) return false
        if (this.address != other.address) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.address.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KaddressRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KaddressRange> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KaddressRange =
                    KaddressRange(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KaddressRange) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            address: MutPtr = MutPtr(0L),
            size: Int = 0,
        ): KaddressRange =
            KaddressRange(
                addressCtorArg = address,
                size = size,
            )
    }
}

public class KaddressRangeDescriptor internal constructor(
    addressRangesCtorArg: ConstPtr,
    public var addressRangeCount: Int,
) {
    public var addressRanges: ConstPtr = addressRangesCtorArg
        internal set

    public constructor() : this(
        addressRangesCtorArg = ConstPtr(0L),
        addressRangeCount = 0,
    )

    public operator fun component1(): ConstPtr = this.addressRanges

    public operator fun component2(): Int = this.addressRangeCount

    public fun copy(addressRanges: ConstPtr = this.addressRanges, addressRangeCount: Int = this.addressRangeCount): KaddressRangeDescriptor = KaddressRangeDescriptor(addressRangesCtorArg = addressRanges, addressRangeCount = addressRangeCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KaddressRangeDescriptor) return false
        if (this.addressRanges != other.addressRanges) return false
        if (this.addressRangeCount != other.addressRangeCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addressRanges.hashCode()
        result = 31 * result + this.addressRangeCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KaddressRangeDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KaddressRangeDescriptor> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KaddressRangeDescriptor =
                    KaddressRangeDescriptor(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KaddressRangeDescriptor) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr, value.addressRanges)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.addressRangeCount)
                }
            }

        public operator fun invoke(
            addressRanges: ConstPtr = ConstPtr(0L),
            addressRangeCount: Int = 0,
        ): KaddressRangeDescriptor =
            KaddressRangeDescriptor(
                addressRangesCtorArg = addressRanges,
                addressRangeCount = addressRangeCount,
            )
    }
}

public class Kapc internal constructor(
    public var type: UByte,
    public var allFlags: UByte,
    public var size: UByte,
    public var spareByte1: UByte,
    public var spareLong0: UInt,
    threadCtorArg: MutPtr,
    public var apcListEntry: ListEntry,
    reservedCtorArg: List<MutPtr>,
    normalContextCtorArg: MutPtr,
    systemArgument1CtorArg: MutPtr,
    systemArgument2CtorArg: MutPtr,
    public var apcStateIndex: Byte,
    public var apcMode: Byte,
    public var inserted: Boolean,
) {
    public var thread: MutPtr = threadCtorArg
        internal set

    public var reserved: List<MutPtr> = reservedCtorArg
        internal set

    public var normalContext: MutPtr = normalContextCtorArg
        internal set

    public var systemArgument1: MutPtr = systemArgument1CtorArg
        internal set

    public var systemArgument2: MutPtr = systemArgument2CtorArg
        internal set

    public constructor() : this(
        type = 0u,
        allFlags = 0u,
        size = 0u,
        spareByte1 = 0u,
        spareLong0 = 0u,
        threadCtorArg = MutPtr(0L),
        apcListEntry = ListEntry(),
        reservedCtorArg = List(3) { MutPtr(0L) },
        normalContextCtorArg = MutPtr(0L),
        systemArgument1CtorArg = MutPtr(0L),
        systemArgument2CtorArg = MutPtr(0L),
        apcStateIndex = 0,
        apcMode = 0,
        inserted = false,
    )

    public operator fun component1(): UByte = this.type

    public operator fun component2(): UByte = this.allFlags

    public operator fun component3(): UByte = this.size

    public operator fun component4(): UByte = this.spareByte1

    public operator fun component5(): UInt = this.spareLong0

    public operator fun component6(): MutPtr = this.thread

    public operator fun component7(): ListEntry = this.apcListEntry

    public operator fun component8(): List<MutPtr> = this.reserved

    public operator fun component9(): MutPtr = this.normalContext

    public operator fun component10(): MutPtr = this.systemArgument1

    public operator fun component11(): MutPtr = this.systemArgument2

    public operator fun component12(): Byte = this.apcStateIndex

    public operator fun component13(): Byte = this.apcMode

    public operator fun component14(): Boolean = this.inserted

    public fun copy(type: UByte = this.type, allFlags: UByte = this.allFlags, size: UByte = this.size, spareByte1: UByte = this.spareByte1, spareLong0: UInt = this.spareLong0, thread: MutPtr = this.thread, apcListEntry: ListEntry = this.apcListEntry, reserved: List<MutPtr> = this.reserved, normalContext: MutPtr = this.normalContext, systemArgument1: MutPtr = this.systemArgument1, systemArgument2: MutPtr = this.systemArgument2, apcStateIndex: Byte = this.apcStateIndex, apcMode: Byte = this.apcMode, inserted: Boolean = this.inserted): Kapc = Kapc(type = type, allFlags = allFlags, size = size, spareByte1 = spareByte1, spareLong0 = spareLong0, threadCtorArg = thread, apcListEntry = apcListEntry, reservedCtorArg = reserved, normalContextCtorArg = normalContext, systemArgument1CtorArg = systemArgument1, systemArgument2CtorArg = systemArgument2, apcStateIndex = apcStateIndex, apcMode = apcMode, inserted = inserted)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Kapc) return false
        if (this.type != other.type) return false
        if (this.allFlags != other.allFlags) return false
        if (this.size != other.size) return false
        if (this.spareByte1 != other.spareByte1) return false
        if (this.spareLong0 != other.spareLong0) return false
        if (this.thread != other.thread) return false
        if (this.apcListEntry != other.apcListEntry) return false
        if (this.reserved != other.reserved) return false
        if (this.normalContext != other.normalContext) return false
        if (this.systemArgument1 != other.systemArgument1) return false
        if (this.systemArgument2 != other.systemArgument2) return false
        if (this.apcStateIndex != other.apcStateIndex) return false
        if (this.apcMode != other.apcMode) return false
        if (this.inserted != other.inserted) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.allFlags.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.spareByte1.hashCode()
        result = 31 * result + this.spareLong0.hashCode()
        result = 31 * result + this.thread.hashCode()
        result = 31 * result + this.apcListEntry.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.normalContext.hashCode()
        result = 31 * result + this.systemArgument1.hashCode()
        result = 31 * result + this.systemArgument2.hashCode()
        result = 31 * result + this.apcStateIndex.hashCode()
        result = 31 * result + this.apcMode.hashCode()
        result = 31 * result + this.inserted.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            type: UByte = 0u,
            allFlags: UByte = 0u,
            size: UByte = 0u,
            spareByte1: UByte = 0u,
            spareLong0: UInt = 0u,
            thread: MutPtr = MutPtr(0L),
            apcListEntry: ListEntry = ListEntry(),
            reserved: List<MutPtr> = List(3) { MutPtr(0L) },
            normalContext: MutPtr = MutPtr(0L),
            systemArgument1: MutPtr = MutPtr(0L),
            systemArgument2: MutPtr = MutPtr(0L),
            apcStateIndex: Byte = 0,
            apcMode: Byte = 0,
            inserted: Boolean = false,
        ): Kapc =
            Kapc(
                type = type,
                allFlags = allFlags,
                size = size,
                spareByte1 = spareByte1,
                spareLong0 = spareLong0,
                threadCtorArg = thread,
                apcListEntry = apcListEntry,
                reservedCtorArg = reserved,
                normalContextCtorArg = normalContext,
                systemArgument1CtorArg = systemArgument1,
                systemArgument2CtorArg = systemArgument2,
                apcStateIndex = apcStateIndex,
                apcMode = apcMode,
                inserted = inserted,
            )
    }
}

public class KbugcheckAddPages internal constructor(
    contextCtorArg: MutPtr,
    public var flags: UInt,
    public var bugCheckCode: UInt,
    public var address: Int,
    public var count: Int,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        contextCtorArg = MutPtr(0L),
        flags = 0u,
        bugCheckCode = 0u,
        address = 0,
        count = 0,
    )

    public operator fun component1(): MutPtr = this.context

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): UInt = this.bugCheckCode

    public operator fun component4(): Int = this.address

    public operator fun component5(): Int = this.count

    public fun copy(context: MutPtr = this.context, flags: UInt = this.flags, bugCheckCode: UInt = this.bugCheckCode, address: Int = this.address, count: Int = this.count): KbugcheckAddPages = KbugcheckAddPages(contextCtorArg = context, flags = flags, bugCheckCode = bugCheckCode, address = address, count = count)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KbugcheckAddPages) return false
        if (this.context != other.context) return false
        if (this.flags != other.flags) return false
        if (this.bugCheckCode != other.bugCheckCode) return false
        if (this.address != other.address) return false
        if (this.count != other.count) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.context.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.bugCheckCode.hashCode()
        result = 31 * result + this.address.hashCode()
        result = 31 * result + this.count.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KbugcheckAddPages> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KbugcheckAddPages> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): KbugcheckAddPages =
                    KbugcheckAddPages(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: KbugcheckAddPages) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.context)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.bugCheckCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.count)
                }
            }

        public operator fun invoke(
            context: MutPtr = MutPtr(0L),
            flags: UInt = 0u,
            bugCheckCode: UInt = 0u,
            address: Int = 0,
            count: Int = 0,
        ): KbugcheckAddPages =
            KbugcheckAddPages(
                contextCtorArg = context,
                flags = flags,
                bugCheckCode = bugCheckCode,
                address = address,
                count = count,
            )
    }
}

public class KbugcheckCallbackRecord internal constructor(
    public var entry: ListEntry,
    public var callbackRoutine: PkbugcheckCallbackRoutine,
    bufferCtorArg: MutPtr,
    public var length: UInt,
    componentCtorArg: MutPtr,
    public var checksum: Int,
    public var state: UByte,
) {
    public var buffer: MutPtr = bufferCtorArg
        internal set

    public var component: MutPtr = componentCtorArg
        internal set

    public constructor() : this(
        entry = ListEntry(),
        callbackRoutine = null,
        bufferCtorArg = MutPtr(0L),
        length = 0u,
        componentCtorArg = MutPtr(0L),
        checksum = 0,
        state = 0u,
    )

    public operator fun component1(): ListEntry = this.entry

    public operator fun component2(): PkbugcheckCallbackRoutine = this.callbackRoutine

    public operator fun component3(): MutPtr = this.buffer

    public operator fun component4(): UInt = this.length

    public operator fun component5(): MutPtr = this.component

    public operator fun component6(): Int = this.checksum

    public operator fun component7(): UByte = this.state

    public fun copy(entry: ListEntry = this.entry, callbackRoutine: PkbugcheckCallbackRoutine = this.callbackRoutine, buffer: MutPtr = this.buffer, length: UInt = this.length, component: MutPtr = this.component, checksum: Int = this.checksum, state: UByte = this.state): KbugcheckCallbackRecord = KbugcheckCallbackRecord(entry = entry, callbackRoutine = callbackRoutine, bufferCtorArg = buffer, length = length, componentCtorArg = component, checksum = checksum, state = state)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KbugcheckCallbackRecord) return false
        if (this.entry != other.entry) return false
        if (this.callbackRoutine != other.callbackRoutine) return false
        if (this.buffer != other.buffer) return false
        if (this.length != other.length) return false
        if (this.component != other.component) return false
        if (this.checksum != other.checksum) return false
        if (this.state != other.state) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.entry.hashCode()
        result = 31 * result + this.callbackRoutine.hashCode()
        result = 31 * result + this.buffer.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.component.hashCode()
        result = 31 * result + this.checksum.hashCode()
        result = 31 * result + this.state.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            entry: ListEntry = ListEntry(),
            callbackRoutine: PkbugcheckCallbackRoutine = null,
            buffer: MutPtr = MutPtr(0L),
            length: UInt = 0u,
            component: MutPtr = MutPtr(0L),
            checksum: Int = 0,
            state: UByte = 0u,
        ): KbugcheckCallbackRecord =
            KbugcheckCallbackRecord(
                entry = entry,
                callbackRoutine = callbackRoutine,
                bufferCtorArg = buffer,
                length = length,
                componentCtorArg = component,
                checksum = checksum,
                state = state,
            )
    }
}

public class KbugcheckDumpIo internal constructor(
    public var offset: ULong,
    bufferCtorArg: MutPtr,
    public var bufferLength: UInt,
    public var type: KbugcheckDumpIoType,
) {
    public var buffer: MutPtr = bufferCtorArg
        internal set

    public constructor() : this(
        offset = 0uL,
        bufferCtorArg = MutPtr(0L),
        bufferLength = 0u,
        type = 0,
    )

    public operator fun component1(): ULong = this.offset

    public operator fun component2(): MutPtr = this.buffer

    public operator fun component3(): UInt = this.bufferLength

    public operator fun component4(): KbugcheckDumpIoType = this.type

    public fun copy(offset: ULong = this.offset, buffer: MutPtr = this.buffer, bufferLength: UInt = this.bufferLength, type: KbugcheckDumpIoType = this.type): KbugcheckDumpIo = KbugcheckDumpIo(offset = offset, bufferCtorArg = buffer, bufferLength = bufferLength, type = type)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KbugcheckDumpIo) return false
        if (this.offset != other.offset) return false
        if (this.buffer != other.buffer) return false
        if (this.bufferLength != other.bufferLength) return false
        if (this.type != other.type) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.offset.hashCode()
        result = 31 * result + this.buffer.hashCode()
        result = 31 * result + this.bufferLength.hashCode()
        result = 31 * result + this.type.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KbugcheckDumpIo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KbugcheckDumpIo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): KbugcheckDumpIo =
                    KbugcheckDumpIo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: KbugcheckDumpIo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.offset)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.buffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.bufferLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.type)
                }
            }

        public operator fun invoke(
            offset: ULong = 0uL,
            buffer: MutPtr = MutPtr(0L),
            bufferLength: UInt = 0u,
            type: KbugcheckDumpIoType = 0,
        ): KbugcheckDumpIo =
            KbugcheckDumpIo(
                offset = offset,
                bufferCtorArg = buffer,
                bufferLength = bufferLength,
                type = type,
            )
    }
}

public class KbugcheckReasonCallbackRecord internal constructor(
    public var entry: ListEntry,
    public var callbackRoutine: PkbugcheckReasonCallbackRoutine,
    componentCtorArg: MutPtr,
    public var checksum: Int,
    public var reason: KbugcheckCallbackReason,
    public var state: UByte,
) {
    public var component: MutPtr = componentCtorArg
        internal set

    public constructor() : this(
        entry = ListEntry(),
        callbackRoutine = null,
        componentCtorArg = MutPtr(0L),
        checksum = 0,
        reason = 0,
        state = 0u,
    )

    public operator fun component1(): ListEntry = this.entry

    public operator fun component2(): PkbugcheckReasonCallbackRoutine = this.callbackRoutine

    public operator fun component3(): MutPtr = this.component

    public operator fun component4(): Int = this.checksum

    public operator fun component5(): KbugcheckCallbackReason = this.reason

    public operator fun component6(): UByte = this.state

    public fun copy(entry: ListEntry = this.entry, callbackRoutine: PkbugcheckReasonCallbackRoutine = this.callbackRoutine, component: MutPtr = this.component, checksum: Int = this.checksum, reason: KbugcheckCallbackReason = this.reason, state: UByte = this.state): KbugcheckReasonCallbackRecord = KbugcheckReasonCallbackRecord(entry = entry, callbackRoutine = callbackRoutine, componentCtorArg = component, checksum = checksum, reason = reason, state = state)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KbugcheckReasonCallbackRecord) return false
        if (this.entry != other.entry) return false
        if (this.callbackRoutine != other.callbackRoutine) return false
        if (this.component != other.component) return false
        if (this.checksum != other.checksum) return false
        if (this.reason != other.reason) return false
        if (this.state != other.state) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.entry.hashCode()
        result = 31 * result + this.callbackRoutine.hashCode()
        result = 31 * result + this.component.hashCode()
        result = 31 * result + this.checksum.hashCode()
        result = 31 * result + this.reason.hashCode()
        result = 31 * result + this.state.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            entry: ListEntry = ListEntry(),
            callbackRoutine: PkbugcheckReasonCallbackRoutine = null,
            component: MutPtr = MutPtr(0L),
            checksum: Int = 0,
            reason: KbugcheckCallbackReason = 0,
            state: UByte = 0u,
        ): KbugcheckReasonCallbackRecord =
            KbugcheckReasonCallbackRecord(
                entry = entry,
                callbackRoutine = callbackRoutine,
                componentCtorArg = component,
                checksum = checksum,
                reason = reason,
                state = state,
            )
    }
}

public class KbugcheckRemovePages internal constructor(
    contextCtorArg: MutPtr,
    public var flags: UInt,
    public var bugCheckCode: UInt,
    public var address: Int,
    public var count: Int,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        contextCtorArg = MutPtr(0L),
        flags = 0u,
        bugCheckCode = 0u,
        address = 0,
        count = 0,
    )

    public operator fun component1(): MutPtr = this.context

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): UInt = this.bugCheckCode

    public operator fun component4(): Int = this.address

    public operator fun component5(): Int = this.count

    public fun copy(context: MutPtr = this.context, flags: UInt = this.flags, bugCheckCode: UInt = this.bugCheckCode, address: Int = this.address, count: Int = this.count): KbugcheckRemovePages = KbugcheckRemovePages(contextCtorArg = context, flags = flags, bugCheckCode = bugCheckCode, address = address, count = count)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KbugcheckRemovePages) return false
        if (this.context != other.context) return false
        if (this.flags != other.flags) return false
        if (this.bugCheckCode != other.bugCheckCode) return false
        if (this.address != other.address) return false
        if (this.count != other.count) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.context.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.bugCheckCode.hashCode()
        result = 31 * result + this.address.hashCode()
        result = 31 * result + this.count.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KbugcheckRemovePages> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KbugcheckRemovePages> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): KbugcheckRemovePages =
                    KbugcheckRemovePages(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: KbugcheckRemovePages) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.context)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.bugCheckCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.count)
                }
            }

        public operator fun invoke(
            context: MutPtr = MutPtr(0L),
            flags: UInt = 0u,
            bugCheckCode: UInt = 0u,
            address: Int = 0,
            count: Int = 0,
        ): KbugcheckRemovePages =
            KbugcheckRemovePages(
                contextCtorArg = context,
                flags = flags,
                bugCheckCode = bugCheckCode,
                address = address,
                count = count,
            )
    }
}

public class KbugcheckSecondaryDumpData internal constructor(
    inBufferCtorArg: MutPtr,
    public var inBufferLength: UInt,
    public var maximumAllowed: UInt,
    public var guid: Guid,
    outBufferCtorArg: MutPtr,
    public var outBufferLength: UInt,
) {
    public var inBuffer: MutPtr = inBufferCtorArg
        internal set

    public var outBuffer: MutPtr = outBufferCtorArg
        internal set

    public constructor() : this(
        inBufferCtorArg = MutPtr(0L),
        inBufferLength = 0u,
        maximumAllowed = 0u,
        guid = Guid(),
        outBufferCtorArg = MutPtr(0L),
        outBufferLength = 0u,
    )

    public operator fun component1(): MutPtr = this.inBuffer

    public operator fun component2(): UInt = this.inBufferLength

    public operator fun component3(): UInt = this.maximumAllowed

    public operator fun component4(): Guid = this.guid

    public operator fun component5(): MutPtr = this.outBuffer

    public operator fun component6(): UInt = this.outBufferLength

    public fun copy(inBuffer: MutPtr = this.inBuffer, inBufferLength: UInt = this.inBufferLength, maximumAllowed: UInt = this.maximumAllowed, guid: Guid = this.guid, outBuffer: MutPtr = this.outBuffer, outBufferLength: UInt = this.outBufferLength): KbugcheckSecondaryDumpData = KbugcheckSecondaryDumpData(inBufferCtorArg = inBuffer, inBufferLength = inBufferLength, maximumAllowed = maximumAllowed, guid = guid, outBufferCtorArg = outBuffer, outBufferLength = outBufferLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KbugcheckSecondaryDumpData) return false
        if (this.inBuffer != other.inBuffer) return false
        if (this.inBufferLength != other.inBufferLength) return false
        if (this.maximumAllowed != other.maximumAllowed) return false
        if (this.guid != other.guid) return false
        if (this.outBuffer != other.outBuffer) return false
        if (this.outBufferLength != other.outBufferLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.inBuffer.hashCode()
        result = 31 * result + this.inBufferLength.hashCode()
        result = 31 * result + this.maximumAllowed.hashCode()
        result = 31 * result + this.guid.hashCode()
        result = 31 * result + this.outBuffer.hashCode()
        result = 31 * result + this.outBufferLength.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            inBuffer: MutPtr = MutPtr(0L),
            inBufferLength: UInt = 0u,
            maximumAllowed: UInt = 0u,
            guid: Guid = Guid(),
            outBuffer: MutPtr = MutPtr(0L),
            outBufferLength: UInt = 0u,
        ): KbugcheckSecondaryDumpData =
            KbugcheckSecondaryDumpData(
                inBufferCtorArg = inBuffer,
                inBufferLength = inBufferLength,
                maximumAllowed = maximumAllowed,
                guid = guid,
                outBufferCtorArg = outBuffer,
                outBufferLength = outBufferLength,
            )
    }
}

public class KbugcheckSecondaryDumpDataEx internal constructor(
    inBufferCtorArg: MutPtr,
    public var inBufferLength: UInt,
    public var maximumAllowed: UInt,
    public var guid: Guid,
    outBufferCtorArg: MutPtr,
    public var outBufferLength: UInt,
    contextCtorArg: MutPtr,
    public var flags: UInt,
    public var dumpType: UInt,
    public var bugCheckCode: UInt,
    public var bugCheckParameter1: Int,
    public var bugCheckParameter2: Int,
    public var bugCheckParameter3: Int,
    public var bugCheckParameter4: Int,
) {
    public var inBuffer: MutPtr = inBufferCtorArg
        internal set

    public var outBuffer: MutPtr = outBufferCtorArg
        internal set

    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        inBufferCtorArg = MutPtr(0L),
        inBufferLength = 0u,
        maximumAllowed = 0u,
        guid = Guid(),
        outBufferCtorArg = MutPtr(0L),
        outBufferLength = 0u,
        contextCtorArg = MutPtr(0L),
        flags = 0u,
        dumpType = 0u,
        bugCheckCode = 0u,
        bugCheckParameter1 = 0,
        bugCheckParameter2 = 0,
        bugCheckParameter3 = 0,
        bugCheckParameter4 = 0,
    )

    public operator fun component1(): MutPtr = this.inBuffer

    public operator fun component2(): UInt = this.inBufferLength

    public operator fun component3(): UInt = this.maximumAllowed

    public operator fun component4(): Guid = this.guid

    public operator fun component5(): MutPtr = this.outBuffer

    public operator fun component6(): UInt = this.outBufferLength

    public operator fun component7(): MutPtr = this.context

    public operator fun component8(): UInt = this.flags

    public operator fun component9(): UInt = this.dumpType

    public operator fun component10(): UInt = this.bugCheckCode

    public operator fun component11(): Int = this.bugCheckParameter1

    public operator fun component12(): Int = this.bugCheckParameter2

    public operator fun component13(): Int = this.bugCheckParameter3

    public operator fun component14(): Int = this.bugCheckParameter4

    public fun copy(inBuffer: MutPtr = this.inBuffer, inBufferLength: UInt = this.inBufferLength, maximumAllowed: UInt = this.maximumAllowed, guid: Guid = this.guid, outBuffer: MutPtr = this.outBuffer, outBufferLength: UInt = this.outBufferLength, context: MutPtr = this.context, flags: UInt = this.flags, dumpType: UInt = this.dumpType, bugCheckCode: UInt = this.bugCheckCode, bugCheckParameter1: Int = this.bugCheckParameter1, bugCheckParameter2: Int = this.bugCheckParameter2, bugCheckParameter3: Int = this.bugCheckParameter3, bugCheckParameter4: Int = this.bugCheckParameter4): KbugcheckSecondaryDumpDataEx = KbugcheckSecondaryDumpDataEx(inBufferCtorArg = inBuffer, inBufferLength = inBufferLength, maximumAllowed = maximumAllowed, guid = guid, outBufferCtorArg = outBuffer, outBufferLength = outBufferLength, contextCtorArg = context, flags = flags, dumpType = dumpType, bugCheckCode = bugCheckCode, bugCheckParameter1 = bugCheckParameter1, bugCheckParameter2 = bugCheckParameter2, bugCheckParameter3 = bugCheckParameter3, bugCheckParameter4 = bugCheckParameter4)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KbugcheckSecondaryDumpDataEx) return false
        if (this.inBuffer != other.inBuffer) return false
        if (this.inBufferLength != other.inBufferLength) return false
        if (this.maximumAllowed != other.maximumAllowed) return false
        if (this.guid != other.guid) return false
        if (this.outBuffer != other.outBuffer) return false
        if (this.outBufferLength != other.outBufferLength) return false
        if (this.context != other.context) return false
        if (this.flags != other.flags) return false
        if (this.dumpType != other.dumpType) return false
        if (this.bugCheckCode != other.bugCheckCode) return false
        if (this.bugCheckParameter1 != other.bugCheckParameter1) return false
        if (this.bugCheckParameter2 != other.bugCheckParameter2) return false
        if (this.bugCheckParameter3 != other.bugCheckParameter3) return false
        if (this.bugCheckParameter4 != other.bugCheckParameter4) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.inBuffer.hashCode()
        result = 31 * result + this.inBufferLength.hashCode()
        result = 31 * result + this.maximumAllowed.hashCode()
        result = 31 * result + this.guid.hashCode()
        result = 31 * result + this.outBuffer.hashCode()
        result = 31 * result + this.outBufferLength.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.dumpType.hashCode()
        result = 31 * result + this.bugCheckCode.hashCode()
        result = 31 * result + this.bugCheckParameter1.hashCode()
        result = 31 * result + this.bugCheckParameter2.hashCode()
        result = 31 * result + this.bugCheckParameter3.hashCode()
        result = 31 * result + this.bugCheckParameter4.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            inBuffer: MutPtr = MutPtr(0L),
            inBufferLength: UInt = 0u,
            maximumAllowed: UInt = 0u,
            guid: Guid = Guid(),
            outBuffer: MutPtr = MutPtr(0L),
            outBufferLength: UInt = 0u,
            context: MutPtr = MutPtr(0L),
            flags: UInt = 0u,
            dumpType: UInt = 0u,
            bugCheckCode: UInt = 0u,
            bugCheckParameter1: Int = 0,
            bugCheckParameter2: Int = 0,
            bugCheckParameter3: Int = 0,
            bugCheckParameter4: Int = 0,
        ): KbugcheckSecondaryDumpDataEx =
            KbugcheckSecondaryDumpDataEx(
                inBufferCtorArg = inBuffer,
                inBufferLength = inBufferLength,
                maximumAllowed = maximumAllowed,
                guid = guid,
                outBufferCtorArg = outBuffer,
                outBufferLength = outBufferLength,
                contextCtorArg = context,
                flags = flags,
                dumpType = dumpType,
                bugCheckCode = bugCheckCode,
                bugCheckParameter1 = bugCheckParameter1,
                bugCheckParameter2 = bugCheckParameter2,
                bugCheckParameter3 = bugCheckParameter3,
                bugCheckParameter4 = bugCheckParameter4,
            )
    }
}

public class KbugcheckTriageDumpData internal constructor(
    dataArrayCtorArg: MutPtr,
    public var flags: UInt,
    public var maxVirtMemSize: UInt,
    public var bugCheckCode: UInt,
    public var bugCheckParameter1: Int,
    public var bugCheckParameter2: Int,
    public var bugCheckParameter3: Int,
    public var bugCheckParameter4: Int,
) {
    public var dataArray: MutPtr = dataArrayCtorArg
        internal set

    public constructor() : this(
        dataArrayCtorArg = MutPtr(0L),
        flags = 0u,
        maxVirtMemSize = 0u,
        bugCheckCode = 0u,
        bugCheckParameter1 = 0,
        bugCheckParameter2 = 0,
        bugCheckParameter3 = 0,
        bugCheckParameter4 = 0,
    )

    public operator fun component1(): MutPtr = this.dataArray

    public operator fun component2(): UInt = this.flags

    public operator fun component3(): UInt = this.maxVirtMemSize

    public operator fun component4(): UInt = this.bugCheckCode

    public operator fun component5(): Int = this.bugCheckParameter1

    public operator fun component6(): Int = this.bugCheckParameter2

    public operator fun component7(): Int = this.bugCheckParameter3

    public operator fun component8(): Int = this.bugCheckParameter4

    public fun copy(dataArray: MutPtr = this.dataArray, flags: UInt = this.flags, maxVirtMemSize: UInt = this.maxVirtMemSize, bugCheckCode: UInt = this.bugCheckCode, bugCheckParameter1: Int = this.bugCheckParameter1, bugCheckParameter2: Int = this.bugCheckParameter2, bugCheckParameter3: Int = this.bugCheckParameter3, bugCheckParameter4: Int = this.bugCheckParameter4): KbugcheckTriageDumpData = KbugcheckTriageDumpData(dataArrayCtorArg = dataArray, flags = flags, maxVirtMemSize = maxVirtMemSize, bugCheckCode = bugCheckCode, bugCheckParameter1 = bugCheckParameter1, bugCheckParameter2 = bugCheckParameter2, bugCheckParameter3 = bugCheckParameter3, bugCheckParameter4 = bugCheckParameter4)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KbugcheckTriageDumpData) return false
        if (this.dataArray != other.dataArray) return false
        if (this.flags != other.flags) return false
        if (this.maxVirtMemSize != other.maxVirtMemSize) return false
        if (this.bugCheckCode != other.bugCheckCode) return false
        if (this.bugCheckParameter1 != other.bugCheckParameter1) return false
        if (this.bugCheckParameter2 != other.bugCheckParameter2) return false
        if (this.bugCheckParameter3 != other.bugCheckParameter3) return false
        if (this.bugCheckParameter4 != other.bugCheckParameter4) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dataArray.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.maxVirtMemSize.hashCode()
        result = 31 * result + this.bugCheckCode.hashCode()
        result = 31 * result + this.bugCheckParameter1.hashCode()
        result = 31 * result + this.bugCheckParameter2.hashCode()
        result = 31 * result + this.bugCheckParameter3.hashCode()
        result = 31 * result + this.bugCheckParameter4.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KbugcheckTriageDumpData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KbugcheckTriageDumpData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): KbugcheckTriageDumpData =
                    KbugcheckTriageDumpData(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: KbugcheckTriageDumpData) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.dataArray)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.maxVirtMemSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.bugCheckCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.bugCheckParameter1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 32L, value.bugCheckParameter2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 40L, value.bugCheckParameter3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 48L, value.bugCheckParameter4)
                }
            }

        public operator fun invoke(
            dataArray: MutPtr = MutPtr(0L),
            flags: UInt = 0u,
            maxVirtMemSize: UInt = 0u,
            bugCheckCode: UInt = 0u,
            bugCheckParameter1: Int = 0,
            bugCheckParameter2: Int = 0,
            bugCheckParameter3: Int = 0,
            bugCheckParameter4: Int = 0,
        ): KbugcheckTriageDumpData =
            KbugcheckTriageDumpData(
                dataArrayCtorArg = dataArray,
                flags = flags,
                maxVirtMemSize = maxVirtMemSize,
                bugCheckCode = bugCheckCode,
                bugCheckParameter1 = bugCheckParameter1,
                bugCheckParameter2 = bugCheckParameter2,
                bugCheckParameter3 = bugCheckParameter3,
                bugCheckParameter4 = bugCheckParameter4,
            )
    }
}

public data class KdeviceQueueEntry(
    public var deviceListEntry: ListEntry = ListEntry(),
    public var sortKey: UInt = 0u,
    public var inserted: Boolean = false,
)

public data class KdpcWatchdogInformation(
    public var dpcTimeLimit: UInt = 0u,
    public var dpcTimeCount: UInt = 0u,
    public var dpcWatchdogLimit: UInt = 0u,
    public var dpcWatchdogCount: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KdpcWatchdogInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KdpcWatchdogInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): KdpcWatchdogInformation =
                    KdpcWatchdogInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: KdpcWatchdogInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dpcTimeLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dpcTimeCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dpcWatchdogLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dpcWatchdogCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.reserved)
                }
            }
    }
}

public data class KernelSoftRestartNotification(
    public var version: UShort = 0u,
    public var size: UShort = 0u,
    public var event: Guid = Guid(),
)

public data class KernelUserTimes(
    public var createTime: Long = 0L,
    public var exitTime: Long = 0L,
    public var kernelTime: Long = 0L,
    public var userTime: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KernelUserTimes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KernelUserTimes> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): KernelUserTimes =
                    KernelUserTimes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: KernelUserTimes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.createTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.exitTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.kernelTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.userTime)
                }
            }
    }
}

public data class KeyBasicInformation(
    public var lastWriteTime: Long = 0L,
    public var titleIndex: UInt = 0u,
    public var nameLength: UInt = 0u,
    public var name: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KeyBasicInformation) return false
        if (this.lastWriteTime != other.lastWriteTime) return false
        if (this.titleIndex != other.titleIndex) return false
        if (this.nameLength != other.nameLength) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lastWriteTime.hashCode()
        result = 31 * result + this.titleIndex.hashCode()
        result = 31 * result + this.nameLength.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyBasicInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyBasicInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): KeyBasicInformation =
                    KeyBasicInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 16L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: KeyBasicInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.lastWriteTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.titleIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.nameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 16L, value.name.toList())
                }
            }
    }
}

public data class KeyCachedInformation(
    public var lastWriteTime: Long = 0L,
    public var titleIndex: UInt = 0u,
    public var subKeys: UInt = 0u,
    public var maxNameLen: UInt = 0u,
    public var values: UInt = 0u,
    public var maxValueNameLen: UInt = 0u,
    public var maxValueDataLen: UInt = 0u,
    public var nameLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyCachedInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyCachedInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): KeyCachedInformation =
                    KeyCachedInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: KeyCachedInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.lastWriteTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.titleIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.subKeys)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.maxNameLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.values)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.maxValueNameLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.maxValueDataLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.nameLength)
                }
            }
    }
}

public data class KeyControlFlagsInformation(
    public var controlFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyControlFlagsInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyControlFlagsInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): KeyControlFlagsInformation =
                    KeyControlFlagsInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: KeyControlFlagsInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.controlFlags)
                }
            }
    }
}

public data class KeyFullInformation(
    public var lastWriteTime: Long = 0L,
    public var titleIndex: UInt = 0u,
    public var classOffset: UInt = 0u,
    public var classLength: UInt = 0u,
    public var subKeys: UInt = 0u,
    public var maxNameLen: UInt = 0u,
    public var maxClassLen: UInt = 0u,
    public var values: UInt = 0u,
    public var maxValueNameLen: UInt = 0u,
    public var maxValueDataLen: UInt = 0u,
    public var cls: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KeyFullInformation) return false
        if (this.lastWriteTime != other.lastWriteTime) return false
        if (this.titleIndex != other.titleIndex) return false
        if (this.classOffset != other.classOffset) return false
        if (this.classLength != other.classLength) return false
        if (this.subKeys != other.subKeys) return false
        if (this.maxNameLen != other.maxNameLen) return false
        if (this.maxClassLen != other.maxClassLen) return false
        if (this.values != other.values) return false
        if (this.maxValueNameLen != other.maxValueNameLen) return false
        if (this.maxValueDataLen != other.maxValueDataLen) return false
        if (!this.cls.contentEquals(other.cls)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lastWriteTime.hashCode()
        result = 31 * result + this.titleIndex.hashCode()
        result = 31 * result + this.classOffset.hashCode()
        result = 31 * result + this.classLength.hashCode()
        result = 31 * result + this.subKeys.hashCode()
        result = 31 * result + this.maxNameLen.hashCode()
        result = 31 * result + this.maxClassLen.hashCode()
        result = 31 * result + this.values.hashCode()
        result = 31 * result + this.maxValueNameLen.hashCode()
        result = 31 * result + this.maxValueDataLen.hashCode()
        result = 31 * result + this.cls.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyFullInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyFullInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): KeyFullInformation =
                    KeyFullInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 44L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: KeyFullInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.lastWriteTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.titleIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.classOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.classLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.subKeys)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.maxNameLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.maxClassLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.values)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.maxValueNameLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.maxValueDataLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 44L, value.cls.toList())
                }
            }
    }
}

public data class KeyLayerInformation(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyLayerInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyLayerInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): KeyLayerInformation =
                    KeyLayerInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: KeyLayerInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class KeyNameInformation(
    public var nameLength: UInt = 0u,
    public var name: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KeyNameInformation) return false
        if (this.nameLength != other.nameLength) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nameLength.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyNameInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyNameInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): KeyNameInformation =
                    KeyNameInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: KeyNameInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 4L, value.name.toList())
                }
            }
    }
}

public data class KeyNodeInformation(
    public var lastWriteTime: Long = 0L,
    public var titleIndex: UInt = 0u,
    public var classOffset: UInt = 0u,
    public var classLength: UInt = 0u,
    public var nameLength: UInt = 0u,
    public var name: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KeyNodeInformation) return false
        if (this.lastWriteTime != other.lastWriteTime) return false
        if (this.titleIndex != other.titleIndex) return false
        if (this.classOffset != other.classOffset) return false
        if (this.classLength != other.classLength) return false
        if (this.nameLength != other.nameLength) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lastWriteTime.hashCode()
        result = 31 * result + this.titleIndex.hashCode()
        result = 31 * result + this.classOffset.hashCode()
        result = 31 * result + this.classLength.hashCode()
        result = 31 * result + this.nameLength.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyNodeInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyNodeInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): KeyNodeInformation =
                    KeyNodeInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 24L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: KeyNodeInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.lastWriteTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.titleIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.classOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.classLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.nameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 24L, value.name.toList())
                }
            }
    }
}

public data class KeySetVirtualizationInformation(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeySetVirtualizationInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeySetVirtualizationInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): KeySetVirtualizationInformation =
                    KeySetVirtualizationInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: KeySetVirtualizationInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class KeyTrustInformation(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyTrustInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyTrustInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): KeyTrustInformation =
                    KeyTrustInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: KeyTrustInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class KeyValueBasicInformation(
    public var titleIndex: UInt = 0u,
    public var type: UInt = 0u,
    public var nameLength: UInt = 0u,
    public var name: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KeyValueBasicInformation) return false
        if (this.titleIndex != other.titleIndex) return false
        if (this.type != other.type) return false
        if (this.nameLength != other.nameLength) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.titleIndex.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.nameLength.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyValueBasicInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyValueBasicInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KeyValueBasicInformation =
                    KeyValueBasicInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 12L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: KeyValueBasicInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.titleIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 12L, value.name.toList())
                }
            }
    }
}

public data class KeyValueFullInformation(
    public var titleIndex: UInt = 0u,
    public var type: UInt = 0u,
    public var dataOffset: UInt = 0u,
    public var dataLength: UInt = 0u,
    public var nameLength: UInt = 0u,
    public var name: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KeyValueFullInformation) return false
        if (this.titleIndex != other.titleIndex) return false
        if (this.type != other.type) return false
        if (this.dataOffset != other.dataOffset) return false
        if (this.dataLength != other.dataLength) return false
        if (this.nameLength != other.nameLength) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.titleIndex.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.dataOffset.hashCode()
        result = 31 * result + this.dataLength.hashCode()
        result = 31 * result + this.nameLength.hashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyValueFullInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyValueFullInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): KeyValueFullInformation =
                    KeyValueFullInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 20L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: KeyValueFullInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.titleIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dataOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dataLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.nameLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 20L, value.name.toList())
                }
            }
    }
}

public data class KeyValueLayerInformation(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyValueLayerInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyValueLayerInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): KeyValueLayerInformation =
                    KeyValueLayerInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: KeyValueLayerInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class KeyValuePartialInformation(
    public var titleIndex: UInt = 0u,
    public var type: UInt = 0u,
    public var dataLength: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KeyValuePartialInformation) return false
        if (this.titleIndex != other.titleIndex) return false
        if (this.type != other.type) return false
        if (this.dataLength != other.dataLength) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.titleIndex.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.dataLength.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyValuePartialInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyValuePartialInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KeyValuePartialInformation =
                    KeyValuePartialInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: KeyValuePartialInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.titleIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dataLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.data.toList())
                }
            }
    }
}

public data class KeyValuePartialInformationAlign64(
    public var type: UInt = 0u,
    public var dataLength: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KeyValuePartialInformationAlign64) return false
        if (this.type != other.type) return false
        if (this.dataLength != other.dataLength) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.dataLength.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyValuePartialInformationAlign64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyValuePartialInformationAlign64> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): KeyValuePartialInformationAlign64 =
                    KeyValuePartialInformationAlign64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: KeyValuePartialInformationAlign64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dataLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.data.toList())
                }
            }
    }
}

public data class KeyVirtualizationInformation(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyVirtualizationInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyVirtualizationInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): KeyVirtualizationInformation =
                    KeyVirtualizationInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: KeyVirtualizationInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class KeyWow64FlagsInformation(
    public var userFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyWow64FlagsInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyWow64FlagsInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): KeyWow64FlagsInformation =
                    KeyWow64FlagsInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: KeyWow64FlagsInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.userFlags)
                }
            }
    }
}

public data class KeyWriteTimeInformation(
    public var lastWriteTime: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyWriteTimeInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KeyWriteTimeInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): KeyWriteTimeInformation =
                    KeyWriteTimeInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: KeyWriteTimeInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.lastWriteTime)
                }
            }
    }
}

public data class KeProcessorChangeNotifyContext(
    public var state: KeProcessorChangeNotifyState = 0,
    public var ntNumber: UInt = 0u,
    public var status: Ntstatus = 0,
    public var procNumber: ProcessorNumber = ProcessorNumber(),
)

public data class KfloatingSave(
    public var controlWord: UInt = 0u,
    public var statusWord: UInt = 0u,
    public var errorOffset: UInt = 0u,
    public var errorSelector: UInt = 0u,
    public var dataOffset: UInt = 0u,
    public var dataSelector: UInt = 0u,
    public var spare0: UInt = 0u,
    public var spare1: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KfloatingSave> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KfloatingSave> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): KfloatingSave =
                    KfloatingSave(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: KfloatingSave) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.controlWord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.statusWord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.errorOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.errorSelector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dataOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dataSelector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.spare0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.spare1)
                }
            }
    }
}

public data class Kgate(
    public var header: DispatcherHeader = DispatcherHeader(),
)

public data class KlockQueueHandle(
    public var lockQueue: KspinLockQueue = KspinLockQueue(),
    public var oldIrql: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KlockQueueHandle> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KlockQueueHandle> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): KlockQueueHandle =
                    KlockQueueHandle(
                        (KspinLockQueue.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: KlockQueueHandle) {
                    (KspinLockQueue.typeLayout()).writeNative(addr, value.lockQueue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.oldIrql)
                }
            }
    }
}

public data class Ksemaphore(
    public var header: DispatcherHeader = DispatcherHeader(),
    public var limit: Int = 0,
)

public class KspinLockQueue internal constructor(
    nextCtorArg: MutPtr,
    lockCtorArg: MutPtr,
) {
    public var next: MutPtr = nextCtorArg
        internal set

    public var lock: MutPtr = lockCtorArg
        internal set

    public constructor() : this(
        nextCtorArg = MutPtr(0L),
        lockCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.next

    public operator fun component2(): MutPtr = this.lock

    public fun copy(next: MutPtr = this.next, lock: MutPtr = this.lock): KspinLockQueue = KspinLockQueue(nextCtorArg = next, lockCtorArg = lock)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KspinLockQueue) return false
        if (this.next != other.next) return false
        if (this.lock != other.lock) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.next.hashCode()
        result = 31 * result + this.lock.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspinLockQueue> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KspinLockQueue> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KspinLockQueue =
                    KspinLockQueue(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KspinLockQueue) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.next)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.lock)
                }
            }

        public operator fun invoke(
            next: MutPtr = MutPtr(0L),
            lock: MutPtr = MutPtr(0L),
        ): KspinLockQueue =
            KspinLockQueue(
                nextCtorArg = next,
                lockCtorArg = lock,
            )
    }
}

public data class KsystemTime(
    public var lowPart: UInt = 0u,
    public var high1Time: Int = 0,
    public var high2Time: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsystemTime> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KsystemTime> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): KsystemTime =
                    KsystemTime(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: KsystemTime) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.lowPart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.high1Time)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.high2Time)
                }
            }
    }
}

public class Ktimer internal constructor(
    public var header: DispatcherHeader,
    public var dueTime: ULong,
    public var timerListEntry: ListEntry,
    dpcCtorArg: MutPtr,
    public var period: UInt,
) {
    public var dpc: MutPtr = dpcCtorArg
        internal set

    public constructor() : this(
        header = DispatcherHeader(),
        dueTime = 0uL,
        timerListEntry = ListEntry(),
        dpcCtorArg = MutPtr(0L),
        period = 0u,
    )

    public operator fun component1(): DispatcherHeader = this.header

    public operator fun component2(): ULong = this.dueTime

    public operator fun component3(): ListEntry = this.timerListEntry

    public operator fun component4(): MutPtr = this.dpc

    public operator fun component5(): UInt = this.period

    public fun copy(header: DispatcherHeader = this.header, dueTime: ULong = this.dueTime, timerListEntry: ListEntry = this.timerListEntry, dpc: MutPtr = this.dpc, period: UInt = this.period): Ktimer = Ktimer(header = header, dueTime = dueTime, timerListEntry = timerListEntry, dpcCtorArg = dpc, period = period)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ktimer) return false
        if (this.header != other.header) return false
        if (this.dueTime != other.dueTime) return false
        if (this.timerListEntry != other.timerListEntry) return false
        if (this.dpc != other.dpc) return false
        if (this.period != other.period) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.dueTime.hashCode()
        result = 31 * result + this.timerListEntry.hashCode()
        result = 31 * result + this.dpc.hashCode()
        result = 31 * result + this.period.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            header: DispatcherHeader = DispatcherHeader(),
            dueTime: ULong = 0uL,
            timerListEntry: ListEntry = ListEntry(),
            dpc: MutPtr = MutPtr(0L),
            period: UInt = 0u,
        ): Ktimer =
            Ktimer(
                header = header,
                dueTime = dueTime,
                timerListEntry = timerListEntry,
                dpcCtorArg = dpc,
                period = period,
            )
    }
}

public class KtriageDumpDataArray internal constructor(
    public var list: ListEntry,
    public var numBlocksUsed: UInt,
    public var numBlocksTotal: UInt,
    public var dataSize: UInt,
    public var maxDataSize: UInt,
    public var componentNameBufferLength: UInt,
    componentNameCtorArg: MutPtr,
    public var blocks: List<KaddressRange>,
) {
    public var componentName: MutPtr = componentNameCtorArg
        internal set

    public constructor() : this(
        list = ListEntry(),
        numBlocksUsed = 0u,
        numBlocksTotal = 0u,
        dataSize = 0u,
        maxDataSize = 0u,
        componentNameBufferLength = 0u,
        componentNameCtorArg = MutPtr(0L),
        blocks = List(1) { KaddressRange() },
    )

    public operator fun component1(): ListEntry = this.list

    public operator fun component2(): UInt = this.numBlocksUsed

    public operator fun component3(): UInt = this.numBlocksTotal

    public operator fun component4(): UInt = this.dataSize

    public operator fun component5(): UInt = this.maxDataSize

    public operator fun component6(): UInt = this.componentNameBufferLength

    public operator fun component7(): MutPtr = this.componentName

    public operator fun component8(): List<KaddressRange> = this.blocks

    public fun copy(list: ListEntry = this.list, numBlocksUsed: UInt = this.numBlocksUsed, numBlocksTotal: UInt = this.numBlocksTotal, dataSize: UInt = this.dataSize, maxDataSize: UInt = this.maxDataSize, componentNameBufferLength: UInt = this.componentNameBufferLength, componentName: MutPtr = this.componentName, blocks: List<KaddressRange> = this.blocks): KtriageDumpDataArray = KtriageDumpDataArray(list = list, numBlocksUsed = numBlocksUsed, numBlocksTotal = numBlocksTotal, dataSize = dataSize, maxDataSize = maxDataSize, componentNameBufferLength = componentNameBufferLength, componentNameCtorArg = componentName, blocks = blocks)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KtriageDumpDataArray) return false
        if (this.list != other.list) return false
        if (this.numBlocksUsed != other.numBlocksUsed) return false
        if (this.numBlocksTotal != other.numBlocksTotal) return false
        if (this.dataSize != other.dataSize) return false
        if (this.maxDataSize != other.maxDataSize) return false
        if (this.componentNameBufferLength != other.componentNameBufferLength) return false
        if (this.componentName != other.componentName) return false
        if (this.blocks != other.blocks) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.list.hashCode()
        result = 31 * result + this.numBlocksUsed.hashCode()
        result = 31 * result + this.numBlocksTotal.hashCode()
        result = 31 * result + this.dataSize.hashCode()
        result = 31 * result + this.maxDataSize.hashCode()
        result = 31 * result + this.componentNameBufferLength.hashCode()
        result = 31 * result + this.componentName.hashCode()
        result = 31 * result + this.blocks.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            list: ListEntry = ListEntry(),
            numBlocksUsed: UInt = 0u,
            numBlocksTotal: UInt = 0u,
            dataSize: UInt = 0u,
            maxDataSize: UInt = 0u,
            componentNameBufferLength: UInt = 0u,
            componentName: MutPtr = MutPtr(0L),
            blocks: List<KaddressRange> = List(1) { KaddressRange() },
        ): KtriageDumpDataArray =
            KtriageDumpDataArray(
                list = list,
                numBlocksUsed = numBlocksUsed,
                numBlocksTotal = numBlocksTotal,
                dataSize = dataSize,
                maxDataSize = maxDataSize,
                componentNameBufferLength = componentNameBufferLength,
                componentNameCtorArg = componentName,
                blocks = blocks,
            )
    }
}

public class KuserSharedData {
    public var tickCountLowDeprecated: UInt = 0u

    public var tickCountMultiplier: UInt = 0u

    public var interruptTime: KsystemTime = KsystemTime()

    public var systemTime: KsystemTime = KsystemTime()

    public var timeZoneBias: KsystemTime = KsystemTime()

    public var imageNumberLow: UShort = 0u

    public var imageNumberHigh: UShort = 0u

    public var ntSystemRoot: UShortArray = UShortArray(260)

    public var maxStackTraceDepth: UInt = 0u

    public var cryptoExponent: UInt = 0u

    public var timeZoneId: UInt = 0u

    public var largePageMinimum: UInt = 0u

    public var aitSamplingValue: UInt = 0u

    public var appCompatFlag: UInt = 0u

    public var rNGSeedVersion: ULong = 0uL

    public var globalValidationRunlevel: UInt = 0u

    public var timeZoneBiasStamp: Int = 0

    public var ntBuildNumber: UInt = 0u

    public var ntProductType: NtProductType = 0

    public var productTypeIsValid: Boolean = false

    public var reserved0: BooleanArray = BooleanArray(1)

    public var nativeProcessorArchitecture: UShort = 0u

    public var ntMajorVersion: UInt = 0u

    public var ntMinorVersion: UInt = 0u

    public var processorFeatures: BooleanArray = BooleanArray(64)

    public var reserved1: UInt = 0u

    public var reserved3: UInt = 0u

    public var timeSlip: UInt = 0u

    public var alternativeArchitecture: AlternativeArchitectureType = 0

    public var bootId: UInt = 0u

    public var systemExpirationDate: Long = 0L

    public var suiteMask: UInt = 0u

    public var kdDebuggerEnabled: Boolean = false

    public var anonymous1: KuserSharedData0 = KuserSharedData0()

    public var cyclesPerYield: UShort = 0u

    public var activeConsoleId: UInt = 0u

    public var dismountCount: UInt = 0u

    public var comPlusPackage: UInt = 0u

    public var lastSystemRITEventTickCount: UInt = 0u

    public var numberOfPhysicalPages: UInt = 0u

    public var safeBootMode: Boolean = false

    public var anonymous2: KuserSharedData1 = KuserSharedData1()

    public var reserved12: UByteArray = UByteArray(2)

    public var anonymous3: KuserSharedData2 = KuserSharedData2()

    public var dataFlagsPad: UIntArray = UIntArray(1)

    public var testRetInstruction: ULong = 0uL

    public var qpcFrequency: Long = 0L

    public var systemCall: UInt = 0u

    public var reserved2: UInt = 0u

    public var systemCallPad: ULongArray = ULongArray(2)

    public var anonymous4: KuserSharedData3 = KuserSharedData3()

    public var cookie: UInt = 0u

    public var cookiePad: UIntArray = UIntArray(1)

    public var consoleSessionForegroundProcessId: Long = 0L

    public var timeUpdateLock: ULong = 0uL

    public var baselineSystemTimeQpc: ULong = 0uL

    public var baselineInterruptTimeQpc: ULong = 0uL

    public var qpcSystemTimeIncrement: ULong = 0uL

    public var qpcInterruptTimeIncrement: ULong = 0uL

    public var qpcSystemTimeIncrementShift: UByte = 0u

    public var qpcInterruptTimeIncrementShift: UByte = 0u

    public var unparkedProcessorCount: UShort = 0u

    public var enclaveFeatureMask: UIntArray = UIntArray(4)

    public var telemetryCoverageRound: UInt = 0u

    public var userModeGlobalLogger: UShortArray = UShortArray(16)

    public var imageFileExecutionOptions: UInt = 0u

    public var langGenerationCount: UInt = 0u

    public var reserved4: ULong = 0uL

    public var interruptTimeBias: ULong = 0uL

    public var qpcBias: ULong = 0uL

    public var activeProcessorCount: UInt = 0u

    public var activeGroupCount: UByte = 0u

    public var reserved9: UByte = 0u

    public var anonymous5: KuserSharedData4 = KuserSharedData4()

    public var timeZoneBiasEffectiveStart: Long = 0L

    public var timeZoneBiasEffectiveEnd: Long = 0L

    public var xState: XstateConfiguration = XstateConfiguration()

    public var featureConfigurationChangeStamp: KsystemTime = KsystemTime()

    public var spare: UInt = 0u

    public var userPointerAuthMask: ULong = 0uL
}

public data class KuserSharedData0(
    public var mitigationPolicies: UByte = 0u,
    public var anonymous: KuserSharedData00 = KuserSharedData00(),
)

public data class KuserSharedData00(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KuserSharedData00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KuserSharedData00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): KuserSharedData00 =
                    KuserSharedData00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: KuserSharedData00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class KuserSharedData1(
    public var virtualizationFlags: UByte = 0u,
)

public data class KuserSharedData2(
    public var sharedDataFlags: UInt = 0u,
    public var anonymous: KuserSharedData20 = KuserSharedData20(),
)

public data class KuserSharedData20(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KuserSharedData20> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KuserSharedData20> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): KuserSharedData20 =
                    KuserSharedData20(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: KuserSharedData20) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class KuserSharedData3(
    public var tickCount: KsystemTime = KsystemTime(),
    public var tickCountQuad: ULong = 0uL,
    public var anonymous: KuserSharedData30 = KuserSharedData30(),
)

public data class KuserSharedData30(
    public var reservedTickCountOverlay: UIntArray = UIntArray(3),
    public var tickCountPad: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KuserSharedData30) return false
        if (!this.reservedTickCountOverlay.contentEquals(other.reservedTickCountOverlay)) return false
        if (!this.tickCountPad.contentEquals(other.tickCountPad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reservedTickCountOverlay.contentHashCode()
        result = 31 * result + this.tickCountPad.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KuserSharedData30> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KuserSharedData30> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KuserSharedData30 =
                    KuserSharedData30(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                        ).readNative(addr).toUIntArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 12L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: KuserSharedData30) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                    ).writeNative(addr, value.reservedTickCountOverlay.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 12L, value.tickCountPad.toList())
                }
            }
    }
}

public data class KuserSharedData4(
    public var qpcData: UShort = 0u,
    public var anonymous: KuserSharedData40 = KuserSharedData40(),
)

public data class KuserSharedData40(
    public var qpcBypassEnabled: UByte = 0u,
    public var qpcShift: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KuserSharedData40> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KuserSharedData40> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): KuserSharedData40 =
                    KuserSharedData40(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: KuserSharedData40) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.qpcBypassEnabled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.qpcShift)
                }
            }
    }
}

public class KwaitChain internal constructor(
    headCtorArg: MutPtr,
) {
    public var head: MutPtr = headCtorArg
        internal set

    public constructor() : this(
        headCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.head

    public fun copy(head: MutPtr = this.head): KwaitChain = KwaitChain(headCtorArg = head)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KwaitChain) return false
        if (this.head != other.head) return false
        return true
    }

    override fun hashCode(): Int = this.head.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KwaitChain> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KwaitChain> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): KwaitChain =
                    KwaitChain(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: KwaitChain) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.head)
                }
            }

        public operator fun invoke(
            head: MutPtr = MutPtr(0L),
        ): KwaitChain =
            KwaitChain(
                headCtorArg = head,
            )
    }
}

public data class LegacyBusInformation(
    public var busTypeGuid: Guid = Guid(),
    public var legacyBusType: InterfaceType = 0,
    public var busNumber: UInt = 0u,
)

public data class LinkShareAccess(
    public var openCount: UInt = 0u,
    public var deleters: UInt = 0u,
    public var sharedDelete: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LinkShareAccess> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LinkShareAccess> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): LinkShareAccess =
                    LinkShareAccess(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: LinkShareAccess) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.openCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.deleters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sharedDelete)
                }
            }
    }
}

public data class LoaderPartitionInformationEx(
    public var partitionStyle: UInt = 0u,
    public var partitionNumber: UInt = 0u,
    public var anonymous: LoaderPartitionInformationEx0 = LoaderPartitionInformationEx0(),
    public var flags: UInt = 0u,
)

public data class LoaderPartitionInformationEx0(
    public var signature: UInt = 0u,
    public var deviceId: Guid = Guid(),
)

public data class MailslotCreateParameters(
    public var mailslotQuota: UInt = 0u,
    public var maximumMessageSize: UInt = 0u,
    public var readTimeout: Long = 0L,
    public var timeoutSpecified: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MailslotCreateParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MailslotCreateParameters> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): MailslotCreateParameters =
                    MailslotCreateParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MailslotCreateParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.mailslotQuota)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maximumMessageSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.readTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 16L, value.timeoutSpecified)
                }
            }
    }
}

public class MapRegisterEntry internal constructor(
    mapRegisterCtorArg: MutPtr,
    public var writeToDevice: Boolean,
) {
    public var mapRegister: MutPtr = mapRegisterCtorArg
        internal set

    public constructor() : this(
        mapRegisterCtorArg = MutPtr(0L),
        writeToDevice = false,
    )

    public operator fun component1(): MutPtr = this.mapRegister

    public operator fun component2(): Boolean = this.writeToDevice

    public fun copy(mapRegister: MutPtr = this.mapRegister, writeToDevice: Boolean = this.writeToDevice): MapRegisterEntry = MapRegisterEntry(mapRegisterCtorArg = mapRegister, writeToDevice = writeToDevice)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MapRegisterEntry) return false
        if (this.mapRegister != other.mapRegister) return false
        if (this.writeToDevice != other.writeToDevice) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mapRegister.hashCode()
        result = 31 * result + this.writeToDevice.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MapRegisterEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MapRegisterEntry> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MapRegisterEntry =
                    MapRegisterEntry(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MapRegisterEntry) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.mapRegister)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.writeToDevice)
                }
            }

        public operator fun invoke(
            mapRegister: MutPtr = MutPtr(0L),
            writeToDevice: Boolean = false,
        ): MapRegisterEntry =
            MapRegisterEntry(
                mapRegisterCtorArg = mapRegister,
                writeToDevice = writeToDevice,
            )
    }
}

public class McaDriverInfo internal constructor(
    public var exceptionCallback: Int,
    public var dpcCallback: PkdeferredRoutine,
    deviceContextCtorArg: MutPtr,
) {
    public var deviceContext: MutPtr = deviceContextCtorArg
        internal set

    public constructor() : this(
        exceptionCallback = 0,
        dpcCallback = null,
        deviceContextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.exceptionCallback

    public operator fun component2(): PkdeferredRoutine = this.dpcCallback

    public operator fun component3(): MutPtr = this.deviceContext

    public fun copy(exceptionCallback: Int = this.exceptionCallback, dpcCallback: PkdeferredRoutine = this.dpcCallback, deviceContext: MutPtr = this.deviceContext): McaDriverInfo = McaDriverInfo(exceptionCallback = exceptionCallback, dpcCallback = dpcCallback, deviceContextCtorArg = deviceContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is McaDriverInfo) return false
        if (this.exceptionCallback != other.exceptionCallback) return false
        if (this.dpcCallback != other.dpcCallback) return false
        if (this.deviceContext != other.deviceContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.exceptionCallback.hashCode()
        result = 31 * result + this.dpcCallback.hashCode()
        result = 31 * result + this.deviceContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            exceptionCallback: Int = 0,
            dpcCallback: PkdeferredRoutine = null,
            deviceContext: MutPtr = MutPtr(0L),
        ): McaDriverInfo =
            McaDriverInfo(
                exceptionCallback = exceptionCallback,
                dpcCallback = dpcCallback,
                deviceContextCtorArg = deviceContext,
            )
    }
}

public data class McaException(
    public var versionNumber: UInt = 0u,
    public var exceptionType: McaExceptionType = 0,
    public var timeStamp: Long = 0L,
    public var processorNumber: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var u: McaException0 = McaException0(),
    public var extCnt: UInt = 0u,
    public var reserved3: UInt = 0u,
    public var extReg: ULongArray = ULongArray(24),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is McaException) return false
        if (this.versionNumber != other.versionNumber) return false
        if (this.exceptionType != other.exceptionType) return false
        if (this.timeStamp != other.timeStamp) return false
        if (this.processorNumber != other.processorNumber) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.u != other.u) return false
        if (this.extCnt != other.extCnt) return false
        if (this.reserved3 != other.reserved3) return false
        if (!this.extReg.contentEquals(other.extReg)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.versionNumber.hashCode()
        result = 31 * result + this.exceptionType.hashCode()
        result = 31 * result + this.timeStamp.hashCode()
        result = 31 * result + this.processorNumber.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.u.hashCode()
        result = 31 * result + this.extCnt.hashCode()
        result = 31 * result + this.reserved3.hashCode()
        result = 31 * result + this.extReg.contentHashCode()
        return result
    }
}

public data class McaException0(
    public var mca: McaException00 = McaException00(),
    public var mce: McaException01 = McaException01(),
)

public data class McaException00(
    public var bankNumber: UByte = 0u,
    public var reserved2: UByteArray = UByteArray(7),
    public var status: MciStats = MciStats(),
    public var address: MciAddr = MciAddr(),
    public var misc: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is McaException00) return false
        if (this.bankNumber != other.bankNumber) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        if (this.status != other.status) return false
        if (this.address != other.address) return false
        if (this.misc != other.misc) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bankNumber.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.address.hashCode()
        result = 31 * result + this.misc.hashCode()
        return result
    }
}

public data class McaException01(
    public var address: ULong = 0uL,
    public var type: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<McaException01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<McaException01> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): McaException01 =
                    McaException01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: McaException01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.type)
                }
            }
    }
}

public data class McgCap(
    public var anonymous: McgCap0 = McgCap0(),
    public var quadPart: ULong = 0uL,
)

public data class McgCap0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<McgCap0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<McgCap0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): McgCap0 =
                    McgCap0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: McgCap0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class McgStatus(
    public var anonymous: McgStatus0 = McgStatus0(),
    public var quadPart: ULong = 0uL,
)

public data class McgStatus0(
    public var bitfield: UInt = 0u,
    public var reserved2: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<McgStatus0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<McgStatus0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): McgStatus0 =
                    McgStatus0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: McgStatus0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved2)
                }
            }
    }
}

public data class MciAddr(
    public var anonymous: MciAddr0 = MciAddr0(),
    public var quadPart: ULong = 0uL,
)

public data class MciAddr0(
    public var address: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciAddr0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciAddr0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): MciAddr0 =
                    MciAddr0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MciAddr0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                }
            }
    }
}

public data class MciStats(
    public var mciStats: MciStats0 = MciStats0(),
    public var quadPart: ULong = 0uL,
)

public data class MciStats0(
    public var mcaCod: UShort = 0u,
    public var msCod: UShort = 0u,
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciStats0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciStats0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): MciStats0 =
                    MciStats0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MciStats0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.mcaCod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.msCod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bitfield)
                }
            }
    }
}

public data class MciStatus(
    public var commonBits: MciStatusBitsCommon = MciStatusBitsCommon(),
    public var amdBits: MciStatusAmdBits = MciStatusAmdBits(),
    public var intelBits: MciStatusIntelBits = MciStatusIntelBits(),
    public var quadPart: ULong = 0uL,
)

public data class MciStatusAmdBits(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciStatusAmdBits> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciStatusAmdBits> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): MciStatusAmdBits =
                    MciStatusAmdBits(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MciStatusAmdBits) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class MciStatusBitsCommon(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciStatusBitsCommon> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciStatusBitsCommon> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): MciStatusBitsCommon =
                    MciStatusBitsCommon(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MciStatusBitsCommon) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class MciStatusIntelBits(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciStatusIntelBits> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MciStatusIntelBits> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): MciStatusIntelBits =
                    MciStatusIntelBits(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MciStatusIntelBits) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class MemoryPartitionDedicatedMemoryOpenInformation internal constructor(
    public var dedicatedMemoryTypeId: ULong,
    public var handleAttributes: UInt,
    public var desiredAccess: UInt,
    dedicatedMemoryPartitionHandleCtorArg: Handle,
) {
    public var dedicatedMemoryPartitionHandle: Handle = dedicatedMemoryPartitionHandleCtorArg
        internal set

    public constructor() : this(
        dedicatedMemoryTypeId = 0uL,
        handleAttributes = 0u,
        desiredAccess = 0u,
        dedicatedMemoryPartitionHandleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ULong = this.dedicatedMemoryTypeId

    public operator fun component2(): UInt = this.handleAttributes

    public operator fun component3(): UInt = this.desiredAccess

    public operator fun component4(): Handle = this.dedicatedMemoryPartitionHandle

    public fun copy(dedicatedMemoryTypeId: ULong = this.dedicatedMemoryTypeId, handleAttributes: UInt = this.handleAttributes, desiredAccess: UInt = this.desiredAccess, dedicatedMemoryPartitionHandle: Handle = this.dedicatedMemoryPartitionHandle): MemoryPartitionDedicatedMemoryOpenInformation = MemoryPartitionDedicatedMemoryOpenInformation(dedicatedMemoryTypeId = dedicatedMemoryTypeId, handleAttributes = handleAttributes, desiredAccess = desiredAccess, dedicatedMemoryPartitionHandleCtorArg = dedicatedMemoryPartitionHandle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MemoryPartitionDedicatedMemoryOpenInformation) return false
        if (this.dedicatedMemoryTypeId != other.dedicatedMemoryTypeId) return false
        if (this.handleAttributes != other.handleAttributes) return false
        if (this.desiredAccess != other.desiredAccess) return false
        if (this.dedicatedMemoryPartitionHandle != other.dedicatedMemoryPartitionHandle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dedicatedMemoryTypeId.hashCode()
        result = 31 * result + this.handleAttributes.hashCode()
        result = 31 * result + this.desiredAccess.hashCode()
        result = 31 * result + this.dedicatedMemoryPartitionHandle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dedicatedMemoryTypeId: ULong = 0uL,
            handleAttributes: UInt = 0u,
            desiredAccess: UInt = 0u,
            dedicatedMemoryPartitionHandle: Handle = MutPtr(0L),
        ): MemoryPartitionDedicatedMemoryOpenInformation =
            MemoryPartitionDedicatedMemoryOpenInformation(
                dedicatedMemoryTypeId = dedicatedMemoryTypeId,
                handleAttributes = handleAttributes,
                desiredAccess = desiredAccess,
                dedicatedMemoryPartitionHandleCtorArg = dedicatedMemoryPartitionHandle,
            )
    }
}

public data class MmCopyAddress(
    public var anonymous: MmCopyAddress0 = MmCopyAddress0(),
)

public class MmCopyAddress0 internal constructor(
    virtualAddressCtorArg: MutPtr,
    public var physicalAddress: Long,
) {
    public var virtualAddress: MutPtr = virtualAddressCtorArg
        internal set

    public constructor() : this(
        virtualAddressCtorArg = MutPtr(0L),
        physicalAddress = 0L,
    )

    public operator fun component1(): MutPtr = this.virtualAddress

    public operator fun component2(): Long = this.physicalAddress

    public fun copy(virtualAddress: MutPtr = this.virtualAddress, physicalAddress: Long = this.physicalAddress): MmCopyAddress0 = MmCopyAddress0(virtualAddressCtorArg = virtualAddress, physicalAddress = physicalAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MmCopyAddress0) return false
        if (this.virtualAddress != other.virtualAddress) return false
        if (this.physicalAddress != other.physicalAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.virtualAddress.hashCode()
        result = 31 * result + this.physicalAddress.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            virtualAddress: MutPtr = MutPtr(0L),
            physicalAddress: Long = 0L,
        ): MmCopyAddress0 =
            MmCopyAddress0(
                virtualAddressCtorArg = virtualAddress,
                physicalAddress = physicalAddress,
            )
    }
}

public data class MmPhysicalAddressList(
    public var physicalAddress: Long = 0L,
    public var numberOfBytes: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MmPhysicalAddressList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MmPhysicalAddressList> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): MmPhysicalAddressList =
                    MmPhysicalAddressList(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: MmPhysicalAddressList) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.physicalAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.numberOfBytes)
                }
            }
    }
}

public data class MuTelemetrySection(
    public var componentID: Guid = Guid(),
    public var subComponentID: Guid = Guid(),
    public var reserved: UInt = 0u,
    public var errorStatusValue: UInt = 0u,
    public var additionalInfo1: ULong = 0uL,
    public var additionalInfo2: ULong = 0uL,
)

public data class NamedPipeCreateParameters(
    public var namedPipeType: UInt = 0u,
    public var readMode: UInt = 0u,
    public var completionMode: UInt = 0u,
    public var maximumInstances: UInt = 0u,
    public var inboundQuota: UInt = 0u,
    public var outboundQuota: UInt = 0u,
    public var defaultTimeout: Long = 0L,
    public var timeoutSpecified: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NamedPipeCreateParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NamedPipeCreateParameters> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): NamedPipeCreateParameters =
                    NamedPipeCreateParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: NamedPipeCreateParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.namedPipeType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.readMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.completionMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.maximumInstances)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.inboundQuota)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.outboundQuota)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.defaultTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 32L, value.timeoutSpecified)
                }
            }
    }
}

public data class NpemCapabilityStandard(
    public var anonymous: NpemCapabilityStandard0 = NpemCapabilityStandard0(),
    public var asULONG: UInt = 0u,
)

public data class NpemCapabilityStandard0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NpemCapabilityStandard0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NpemCapabilityStandard0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NpemCapabilityStandard0 =
                    NpemCapabilityStandard0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NpemCapabilityStandard0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class NpemControlInterface internal constructor(
    public var size: UShort,
    public var version: UShort,
    contextCtorArg: MutPtr,
    public var interfaceReference: PinterfaceReference,
    public var interfaceDereference: PinterfaceDereference,
    public var setNpemSupportState: PnpemControlEnableDisable,
    public var queryStandardCapabilities: PnpemControlQueryStandardCapabilities,
    public var setStandardControl: PnpemControlSetStandardControl,
    public var queryNpemControl: PnpemControlQueryControl,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        version = 0u,
        contextCtorArg = MutPtr(0L),
        interfaceReference = null,
        interfaceDereference = null,
        setNpemSupportState = null,
        queryStandardCapabilities = null,
        setStandardControl = null,
        queryNpemControl = null,
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): UShort = this.version

    public operator fun component3(): MutPtr = this.context

    public operator fun component4(): PinterfaceReference = this.interfaceReference

    public operator fun component5(): PinterfaceDereference = this.interfaceDereference

    public operator fun component6(): PnpemControlEnableDisable = this.setNpemSupportState

    public operator fun component7(): PnpemControlQueryStandardCapabilities = this.queryStandardCapabilities

    public operator fun component8(): PnpemControlSetStandardControl = this.setStandardControl

    public operator fun component9(): PnpemControlQueryControl = this.queryNpemControl

    public fun copy(size: UShort = this.size, version: UShort = this.version, context: MutPtr = this.context, interfaceReference: PinterfaceReference = this.interfaceReference, interfaceDereference: PinterfaceDereference = this.interfaceDereference, setNpemSupportState: PnpemControlEnableDisable = this.setNpemSupportState, queryStandardCapabilities: PnpemControlQueryStandardCapabilities = this.queryStandardCapabilities, setStandardControl: PnpemControlSetStandardControl = this.setStandardControl, queryNpemControl: PnpemControlQueryControl = this.queryNpemControl): NpemControlInterface = NpemControlInterface(size = size, version = version, contextCtorArg = context, interfaceReference = interfaceReference, interfaceDereference = interfaceDereference, setNpemSupportState = setNpemSupportState, queryStandardCapabilities = queryStandardCapabilities, setStandardControl = setStandardControl, queryNpemControl = queryNpemControl)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NpemControlInterface) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.context != other.context) return false
        if (this.interfaceReference != other.interfaceReference) return false
        if (this.interfaceDereference != other.interfaceDereference) return false
        if (this.setNpemSupportState != other.setNpemSupportState) return false
        if (this.queryStandardCapabilities != other.queryStandardCapabilities) return false
        if (this.setStandardControl != other.setStandardControl) return false
        if (this.queryNpemControl != other.queryNpemControl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.interfaceReference.hashCode()
        result = 31 * result + this.interfaceDereference.hashCode()
        result = 31 * result + this.setNpemSupportState.hashCode()
        result = 31 * result + this.queryStandardCapabilities.hashCode()
        result = 31 * result + this.setStandardControl.hashCode()
        result = 31 * result + this.queryNpemControl.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UShort = 0u,
            version: UShort = 0u,
            context: MutPtr = MutPtr(0L),
            interfaceReference: PinterfaceReference = null,
            interfaceDereference: PinterfaceDereference = null,
            setNpemSupportState: PnpemControlEnableDisable = null,
            queryStandardCapabilities: PnpemControlQueryStandardCapabilities = null,
            setStandardControl: PnpemControlSetStandardControl = null,
            queryNpemControl: PnpemControlQueryControl = null,
        ): NpemControlInterface =
            NpemControlInterface(
                size = size,
                version = version,
                contextCtorArg = context,
                interfaceReference = interfaceReference,
                interfaceDereference = interfaceDereference,
                setNpemSupportState = setNpemSupportState,
                queryStandardCapabilities = queryStandardCapabilities,
                setStandardControl = setStandardControl,
                queryNpemControl = queryNpemControl,
            )
    }
}

public data class NtTib32(
    public var exceptionList: UInt = 0u,
    public var stackBase: UInt = 0u,
    public var stackLimit: UInt = 0u,
    public var subSystemTib: UInt = 0u,
    public var anonymous: NtTib320 = NtTib320(),
    public var arbitraryUserPointer: UInt = 0u,
    public var selfRef: UInt = 0u,
)

public data class NtTib320(
    public var fiberData: UInt = 0u,
    public var version: UInt = 0u,
)

public data class ObjectHandleInformation(
    public var handleAttributes: UInt = 0u,
    public var grantedAccess: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ObjectHandleInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ObjectHandleInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ObjectHandleInformation =
                    ObjectHandleInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ObjectHandleInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.handleAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.grantedAccess)
                }
            }
    }
}

public class ObCallbackRegistration internal constructor(
    public var version: UShort,
    public var operationRegistrationCount: UShort,
    public var altitude: UnicodeString,
    registrationContextCtorArg: MutPtr,
    operationRegistrationCtorArg: MutPtr,
) {
    public var registrationContext: MutPtr = registrationContextCtorArg
        internal set

    public var operationRegistration: MutPtr = operationRegistrationCtorArg
        internal set

    public constructor() : this(
        version = 0u,
        operationRegistrationCount = 0u,
        altitude = UnicodeString(),
        registrationContextCtorArg = MutPtr(0L),
        operationRegistrationCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.version

    public operator fun component2(): UShort = this.operationRegistrationCount

    public operator fun component3(): UnicodeString = this.altitude

    public operator fun component4(): MutPtr = this.registrationContext

    public operator fun component5(): MutPtr = this.operationRegistration

    public fun copy(version: UShort = this.version, operationRegistrationCount: UShort = this.operationRegistrationCount, altitude: UnicodeString = this.altitude, registrationContext: MutPtr = this.registrationContext, operationRegistration: MutPtr = this.operationRegistration): ObCallbackRegistration = ObCallbackRegistration(version = version, operationRegistrationCount = operationRegistrationCount, altitude = altitude, registrationContextCtorArg = registrationContext, operationRegistrationCtorArg = operationRegistration)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ObCallbackRegistration) return false
        if (this.version != other.version) return false
        if (this.operationRegistrationCount != other.operationRegistrationCount) return false
        if (this.altitude != other.altitude) return false
        if (this.registrationContext != other.registrationContext) return false
        if (this.operationRegistration != other.operationRegistration) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.operationRegistrationCount.hashCode()
        result = 31 * result + this.altitude.hashCode()
        result = 31 * result + this.registrationContext.hashCode()
        result = 31 * result + this.operationRegistration.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version: UShort = 0u,
            operationRegistrationCount: UShort = 0u,
            altitude: UnicodeString = UnicodeString(),
            registrationContext: MutPtr = MutPtr(0L),
            operationRegistration: MutPtr = MutPtr(0L),
        ): ObCallbackRegistration =
            ObCallbackRegistration(
                version = version,
                operationRegistrationCount = operationRegistrationCount,
                altitude = altitude,
                registrationContextCtorArg = registrationContext,
                operationRegistrationCtorArg = operationRegistration,
            )
    }
}

public class ObOperationRegistration internal constructor(
    objectTypeCtorArg: MutPtr,
    public var operations: UInt,
    public var preOperation: PobPreOperationCallback,
    public var postOperation: PobPostOperationCallback,
) {
    public var objectType: MutPtr = objectTypeCtorArg
        internal set

    public constructor() : this(
        objectTypeCtorArg = MutPtr(0L),
        operations = 0u,
        preOperation = null,
        postOperation = null,
    )

    public operator fun component1(): MutPtr = this.objectType

    public operator fun component2(): UInt = this.operations

    public operator fun component3(): PobPreOperationCallback = this.preOperation

    public operator fun component4(): PobPostOperationCallback = this.postOperation

    public fun copy(objectType: MutPtr = this.objectType, operations: UInt = this.operations, preOperation: PobPreOperationCallback = this.preOperation, postOperation: PobPostOperationCallback = this.postOperation): ObOperationRegistration = ObOperationRegistration(objectTypeCtorArg = objectType, operations = operations, preOperation = preOperation, postOperation = postOperation)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ObOperationRegistration) return false
        if (this.objectType != other.objectType) return false
        if (this.operations != other.operations) return false
        if (this.preOperation != other.preOperation) return false
        if (this.postOperation != other.postOperation) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.objectType.hashCode()
        result = 31 * result + this.operations.hashCode()
        result = 31 * result + this.preOperation.hashCode()
        result = 31 * result + this.postOperation.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            objectType: MutPtr = MutPtr(0L),
            operations: UInt = 0u,
            preOperation: PobPreOperationCallback = null,
            postOperation: PobPostOperationCallback = null,
        ): ObOperationRegistration =
            ObOperationRegistration(
                objectTypeCtorArg = objectType,
                operations = operations,
                preOperation = preOperation,
                postOperation = postOperation,
            )
    }
}

public data class ObPostCreateHandleInformation(
    public var grantedAccess: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ObPostCreateHandleInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ObPostCreateHandleInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ObPostCreateHandleInformation =
                    ObPostCreateHandleInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ObPostCreateHandleInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.grantedAccess)
                }
            }
    }
}

public data class ObPostDuplicateHandleInformation(
    public var grantedAccess: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ObPostDuplicateHandleInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ObPostDuplicateHandleInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ObPostDuplicateHandleInformation =
                    ObPostDuplicateHandleInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ObPostDuplicateHandleInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.grantedAccess)
                }
            }
    }
}

public class ObPostOperationInformation internal constructor(
    public var operation: UInt,
    public var anonymous: ObPostOperationInformation0,
    objCtorArg: MutPtr,
    public var objectType: PobjectType,
    callContextCtorArg: MutPtr,
    public var returnStatus: Ntstatus,
    parametersCtorArg: MutPtr,
) {
    public var obj: MutPtr = objCtorArg
        internal set

    public var callContext: MutPtr = callContextCtorArg
        internal set

    public var parameters: MutPtr = parametersCtorArg
        internal set

    public constructor() : this(
        operation = 0u,
        anonymous = ObPostOperationInformation0(),
        objCtorArg = MutPtr(0L),
        objectType = 0L,
        callContextCtorArg = MutPtr(0L),
        returnStatus = 0,
        parametersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.operation

    public operator fun component2(): ObPostOperationInformation0 = this.anonymous

    public operator fun component3(): MutPtr = this.obj

    public operator fun component4(): PobjectType = this.objectType

    public operator fun component5(): MutPtr = this.callContext

    public operator fun component6(): Ntstatus = this.returnStatus

    public operator fun component7(): MutPtr = this.parameters

    public fun copy(operation: UInt = this.operation, anonymous: ObPostOperationInformation0 = this.anonymous, obj: MutPtr = this.obj, objectType: PobjectType = this.objectType, callContext: MutPtr = this.callContext, returnStatus: Ntstatus = this.returnStatus, parameters: MutPtr = this.parameters): ObPostOperationInformation = ObPostOperationInformation(operation = operation, anonymous = anonymous, objCtorArg = obj, objectType = objectType, callContextCtorArg = callContext, returnStatus = returnStatus, parametersCtorArg = parameters)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ObPostOperationInformation) return false
        if (this.operation != other.operation) return false
        if (this.anonymous != other.anonymous) return false
        if (this.obj != other.obj) return false
        if (this.objectType != other.objectType) return false
        if (this.callContext != other.callContext) return false
        if (this.returnStatus != other.returnStatus) return false
        if (this.parameters != other.parameters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.operation.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.obj.hashCode()
        result = 31 * result + this.objectType.hashCode()
        result = 31 * result + this.callContext.hashCode()
        result = 31 * result + this.returnStatus.hashCode()
        result = 31 * result + this.parameters.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            operation: UInt = 0u,
            anonymous: ObPostOperationInformation0 = ObPostOperationInformation0(),
            obj: MutPtr = MutPtr(0L),
            objectType: PobjectType = 0L,
            callContext: MutPtr = MutPtr(0L),
            returnStatus: Ntstatus = 0,
            parameters: MutPtr = MutPtr(0L),
        ): ObPostOperationInformation =
            ObPostOperationInformation(
                operation = operation,
                anonymous = anonymous,
                objCtorArg = obj,
                objectType = objectType,
                callContextCtorArg = callContext,
                returnStatus = returnStatus,
                parametersCtorArg = parameters,
            )
    }
}

public data class ObPostOperationInformation0(
    public var flags: UInt = 0u,
    public var anonymous: ObPostOperationInformation00 = ObPostOperationInformation00(),
)

public data class ObPostOperationInformation00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ObPostOperationInformation00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ObPostOperationInformation00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ObPostOperationInformation00 =
                    ObPostOperationInformation00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ObPostOperationInformation00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ObPostOperationParameters(
    public var createHandleInformation: ObPostCreateHandleInformation = ObPostCreateHandleInformation(),
    public var duplicateHandleInformation: ObPostDuplicateHandleInformation = ObPostDuplicateHandleInformation(),
)

public data class ObPreCreateHandleInformation(
    public var desiredAccess: UInt = 0u,
    public var originalDesiredAccess: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ObPreCreateHandleInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ObPreCreateHandleInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ObPreCreateHandleInformation =
                    ObPreCreateHandleInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ObPreCreateHandleInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.desiredAccess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.originalDesiredAccess)
                }
            }
    }
}

public class ObPreDuplicateHandleInformation internal constructor(
    public var desiredAccess: UInt,
    public var originalDesiredAccess: UInt,
    sourceProcessCtorArg: MutPtr,
    targetProcessCtorArg: MutPtr,
) {
    public var sourceProcess: MutPtr = sourceProcessCtorArg
        internal set

    public var targetProcess: MutPtr = targetProcessCtorArg
        internal set

    public constructor() : this(
        desiredAccess = 0u,
        originalDesiredAccess = 0u,
        sourceProcessCtorArg = MutPtr(0L),
        targetProcessCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.desiredAccess

    public operator fun component2(): UInt = this.originalDesiredAccess

    public operator fun component3(): MutPtr = this.sourceProcess

    public operator fun component4(): MutPtr = this.targetProcess

    public fun copy(desiredAccess: UInt = this.desiredAccess, originalDesiredAccess: UInt = this.originalDesiredAccess, sourceProcess: MutPtr = this.sourceProcess, targetProcess: MutPtr = this.targetProcess): ObPreDuplicateHandleInformation = ObPreDuplicateHandleInformation(desiredAccess = desiredAccess, originalDesiredAccess = originalDesiredAccess, sourceProcessCtorArg = sourceProcess, targetProcessCtorArg = targetProcess)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ObPreDuplicateHandleInformation) return false
        if (this.desiredAccess != other.desiredAccess) return false
        if (this.originalDesiredAccess != other.originalDesiredAccess) return false
        if (this.sourceProcess != other.sourceProcess) return false
        if (this.targetProcess != other.targetProcess) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.desiredAccess.hashCode()
        result = 31 * result + this.originalDesiredAccess.hashCode()
        result = 31 * result + this.sourceProcess.hashCode()
        result = 31 * result + this.targetProcess.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ObPreDuplicateHandleInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ObPreDuplicateHandleInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): ObPreDuplicateHandleInformation =
                    ObPreDuplicateHandleInformation(
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
                override fun writeNative(addr: Long, value: ObPreDuplicateHandleInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.desiredAccess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.originalDesiredAccess)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.sourceProcess)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.targetProcess)
                }
            }

        public operator fun invoke(
            desiredAccess: UInt = 0u,
            originalDesiredAccess: UInt = 0u,
            sourceProcess: MutPtr = MutPtr(0L),
            targetProcess: MutPtr = MutPtr(0L),
        ): ObPreDuplicateHandleInformation =
            ObPreDuplicateHandleInformation(
                desiredAccess = desiredAccess,
                originalDesiredAccess = originalDesiredAccess,
                sourceProcessCtorArg = sourceProcess,
                targetProcessCtorArg = targetProcess,
            )
    }
}

public class ObPreOperationInformation internal constructor(
    public var operation: UInt,
    public var anonymous: ObPreOperationInformation0,
    objCtorArg: MutPtr,
    public var objectType: PobjectType,
    callContextCtorArg: MutPtr,
    parametersCtorArg: MutPtr,
) {
    public var obj: MutPtr = objCtorArg
        internal set

    public var callContext: MutPtr = callContextCtorArg
        internal set

    public var parameters: MutPtr = parametersCtorArg
        internal set

    public constructor() : this(
        operation = 0u,
        anonymous = ObPreOperationInformation0(),
        objCtorArg = MutPtr(0L),
        objectType = 0L,
        callContextCtorArg = MutPtr(0L),
        parametersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.operation

    public operator fun component2(): ObPreOperationInformation0 = this.anonymous

    public operator fun component3(): MutPtr = this.obj

    public operator fun component4(): PobjectType = this.objectType

    public operator fun component5(): MutPtr = this.callContext

    public operator fun component6(): MutPtr = this.parameters

    public fun copy(operation: UInt = this.operation, anonymous: ObPreOperationInformation0 = this.anonymous, obj: MutPtr = this.obj, objectType: PobjectType = this.objectType, callContext: MutPtr = this.callContext, parameters: MutPtr = this.parameters): ObPreOperationInformation = ObPreOperationInformation(operation = operation, anonymous = anonymous, objCtorArg = obj, objectType = objectType, callContextCtorArg = callContext, parametersCtorArg = parameters)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ObPreOperationInformation) return false
        if (this.operation != other.operation) return false
        if (this.anonymous != other.anonymous) return false
        if (this.obj != other.obj) return false
        if (this.objectType != other.objectType) return false
        if (this.callContext != other.callContext) return false
        if (this.parameters != other.parameters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.operation.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.obj.hashCode()
        result = 31 * result + this.objectType.hashCode()
        result = 31 * result + this.callContext.hashCode()
        result = 31 * result + this.parameters.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            operation: UInt = 0u,
            anonymous: ObPreOperationInformation0 = ObPreOperationInformation0(),
            obj: MutPtr = MutPtr(0L),
            objectType: PobjectType = 0L,
            callContext: MutPtr = MutPtr(0L),
            parameters: MutPtr = MutPtr(0L),
        ): ObPreOperationInformation =
            ObPreOperationInformation(
                operation = operation,
                anonymous = anonymous,
                objCtorArg = obj,
                objectType = objectType,
                callContextCtorArg = callContext,
                parametersCtorArg = parameters,
            )
    }
}

public data class ObPreOperationInformation0(
    public var flags: UInt = 0u,
    public var anonymous: ObPreOperationInformation00 = ObPreOperationInformation00(),
)

public data class ObPreOperationInformation00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ObPreOperationInformation00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ObPreOperationInformation00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ObPreOperationInformation00 =
                    ObPreOperationInformation00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ObPreOperationInformation00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ObPreOperationParameters(
    public var createHandleInformation: ObPreCreateHandleInformation = ObPreCreateHandleInformation(),
    public var duplicateHandleInformation: ObPreDuplicateHandleInformation = ObPreDuplicateHandleInformation(),
)

public data class PagePriorityInformation(
    public var pagePriority: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PagePriorityInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PagePriorityInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PagePriorityInformation =
                    PagePriorityInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PagePriorityInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.pagePriority)
                }
            }
    }
}

public class Pcibusdata internal constructor(
    public var tag: UInt,
    public var version: UInt,
    public var readConfig: PciReadWriteConfig,
    public var writeConfig: PciReadWriteConfig,
    public var pin2Line: PciPin2Line,
    public var line2Pin: PciLine2Pin,
    public var parentSlot: PciSlotNumber,
    reservedCtorArg: List<MutPtr>,
) {
    public var reserved: List<MutPtr> = reservedCtorArg
        internal set

    public constructor() : this(
        tag = 0u,
        version = 0u,
        readConfig = null,
        writeConfig = null,
        pin2Line = null,
        line2Pin = null,
        parentSlot = PciSlotNumber(),
        reservedCtorArg = List(4) { MutPtr(0L) },
    )

    public operator fun component1(): UInt = this.tag

    public operator fun component2(): UInt = this.version

    public operator fun component3(): PciReadWriteConfig = this.readConfig

    public operator fun component4(): PciReadWriteConfig = this.writeConfig

    public operator fun component5(): PciPin2Line = this.pin2Line

    public operator fun component6(): PciLine2Pin = this.line2Pin

    public operator fun component7(): PciSlotNumber = this.parentSlot

    public operator fun component8(): List<MutPtr> = this.reserved

    public fun copy(tag: UInt = this.tag, version: UInt = this.version, readConfig: PciReadWriteConfig = this.readConfig, writeConfig: PciReadWriteConfig = this.writeConfig, pin2Line: PciPin2Line = this.pin2Line, line2Pin: PciLine2Pin = this.line2Pin, parentSlot: PciSlotNumber = this.parentSlot, reserved: List<MutPtr> = this.reserved): Pcibusdata = Pcibusdata(tag = tag, version = version, readConfig = readConfig, writeConfig = writeConfig, pin2Line = pin2Line, line2Pin = line2Pin, parentSlot = parentSlot, reservedCtorArg = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Pcibusdata) return false
        if (this.tag != other.tag) return false
        if (this.version != other.version) return false
        if (this.readConfig != other.readConfig) return false
        if (this.writeConfig != other.writeConfig) return false
        if (this.pin2Line != other.pin2Line) return false
        if (this.line2Pin != other.line2Pin) return false
        if (this.parentSlot != other.parentSlot) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tag.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.readConfig.hashCode()
        result = 31 * result + this.writeConfig.hashCode()
        result = 31 * result + this.pin2Line.hashCode()
        result = 31 * result + this.line2Pin.hashCode()
        result = 31 * result + this.parentSlot.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            tag: UInt = 0u,
            version: UInt = 0u,
            readConfig: PciReadWriteConfig = null,
            writeConfig: PciReadWriteConfig = null,
            pin2Line: PciPin2Line = null,
            line2Pin: PciLine2Pin = null,
            parentSlot: PciSlotNumber = PciSlotNumber(),
            reserved: List<MutPtr> = List(4) { MutPtr(0L) },
        ): Pcibusdata =
            Pcibusdata(
                tag = tag,
                version = version,
                readConfig = readConfig,
                writeConfig = writeConfig,
                pin2Line = pin2Line,
                line2Pin = line2Pin,
                parentSlot = parentSlot,
                reservedCtorArg = reserved,
            )
    }
}

public data class PcixBridgeCapability(
    public var header: PciCapabilitiesHeader = PciCapabilitiesHeader(),
    public var secondaryStatus: PcixBridgeCapability0 = PcixBridgeCapability0(),
    public var bridgeStatus: PcixBridgeCapability1 = PcixBridgeCapability1(),
    public var upstreamSplitTransactionCapacity: UShort = 0u,
    public var upstreamSplitTransactionLimit: UShort = 0u,
    public var downstreamSplitTransactionCapacity: UShort = 0u,
    public var downstreamSplitTransactionLimit: UShort = 0u,
    public var eccControlStatus: PcixBridgeCapability2 = PcixBridgeCapability2(),
    public var eccFirstAddress: UInt = 0u,
    public var eccSecondAddress: UInt = 0u,
    public var eccAttribute: UInt = 0u,
)

public data class PcixBridgeCapability1(
    public var anonymous: PcixBridgeCapability10 = PcixBridgeCapability10(),
    public var asULONG: UInt = 0u,
)

public data class PcixBridgeCapability10(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PcixBridgeCapability10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PcixBridgeCapability10> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PcixBridgeCapability10 =
                    PcixBridgeCapability10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PcixBridgeCapability10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PcixBridgeCapability2(
    public var anonymous: PcixBridgeCapability20 = PcixBridgeCapability20(),
    public var asULONG: UInt = 0u,
)

public data class PcixBridgeCapability20(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PcixBridgeCapability20> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PcixBridgeCapability20> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PcixBridgeCapability20 =
                    PcixBridgeCapability20(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PcixBridgeCapability20) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PcixBridgeCapability0(
    public var anonymous: PcixBridgeCapability00 = PcixBridgeCapability00(),
    public var asUSHORT: UShort = 0u,
)

public data class PcixBridgeCapability00(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PcixBridgeCapability00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PcixBridgeCapability00> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PcixBridgeCapability00 =
                    PcixBridgeCapability00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PcixBridgeCapability00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciAdvancedFeaturesCapability(
    public var header: PciCapabilitiesHeader = PciCapabilitiesHeader(),
    public var length: UByte = 0u,
    public var capabilities: PciAdvancedFeaturesCapability0 = PciAdvancedFeaturesCapability0(),
    public var control: PciAdvancedFeaturesCapability1 = PciAdvancedFeaturesCapability1(),
    public var status: PciAdvancedFeaturesCapability2 = PciAdvancedFeaturesCapability2(),
)

public data class PciAdvancedFeaturesCapability0(
    public var anonymous: PciAdvancedFeaturesCapability00 = PciAdvancedFeaturesCapability00(),
    public var asUCHAR: UByte = 0u,
)

public data class PciAdvancedFeaturesCapability00(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciAdvancedFeaturesCapability00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciAdvancedFeaturesCapability00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): PciAdvancedFeaturesCapability00 =
                    PciAdvancedFeaturesCapability00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciAdvancedFeaturesCapability00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciAdvancedFeaturesCapability1(
    public var anonymous: PciAdvancedFeaturesCapability10 = PciAdvancedFeaturesCapability10(),
    public var asUCHAR: UByte = 0u,
)

public data class PciAdvancedFeaturesCapability10(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciAdvancedFeaturesCapability10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciAdvancedFeaturesCapability10> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): PciAdvancedFeaturesCapability10 =
                    PciAdvancedFeaturesCapability10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciAdvancedFeaturesCapability10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciAdvancedFeaturesCapability2(
    public var anonymous: PciAdvancedFeaturesCapability20 = PciAdvancedFeaturesCapability20(),
    public var asUCHAR: UByte = 0u,
)

public data class PciAdvancedFeaturesCapability20(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciAdvancedFeaturesCapability20> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciAdvancedFeaturesCapability20> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): PciAdvancedFeaturesCapability20 =
                    PciAdvancedFeaturesCapability20(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciAdvancedFeaturesCapability20) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciAgpAperturePageSize(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciAgpAperturePageSize> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciAgpAperturePageSize> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciAgpAperturePageSize =
                    PciAgpAperturePageSize(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciAgpAperturePageSize) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciAgpCapability(
    public var header: PciCapabilitiesHeader = PciCapabilitiesHeader(),
    public var bitfield: UShort = 0u,
    public var aGPStatus: PciAgpCapability0 = PciAgpCapability0(),
    public var aGPCommand: PciAgpCapability1 = PciAgpCapability1(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciAgpCapability> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciAgpCapability> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): PciAgpCapability =
                    PciAgpCapability(
                        (PciCapabilitiesHeader.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (PciAgpCapability0.typeLayout()).readNative(addr + 4L),
                        (PciAgpCapability1.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PciAgpCapability) {
                    (PciCapabilitiesHeader.typeLayout()).writeNative(addr, value.header)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.bitfield)
                    (PciAgpCapability0.typeLayout()).writeNative(addr + 4L, value.aGPStatus)
                    (PciAgpCapability1.typeLayout()).writeNative(addr + 8L, value.aGPCommand)
                }
            }
    }
}

public data class PciAgpCapability1(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciAgpCapability1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciAgpCapability1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciAgpCapability1 =
                    PciAgpCapability1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciAgpCapability1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciAgpCapability0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciAgpCapability0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciAgpCapability0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciAgpCapability0 =
                    PciAgpCapability0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciAgpCapability0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciAgpControl(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciAgpControl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciAgpControl> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciAgpControl =
                    PciAgpControl(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciAgpControl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciAgpExtendedCapability(
    public var isochStatus: PciAgpIsochStatus = PciAgpIsochStatus(),
    public var agpControl: PciAgpControl = PciAgpControl(),
    public var apertureSize: UShort = 0u,
    public var aperturePageSize: PciAgpAperturePageSize = PciAgpAperturePageSize(),
    public var gartLow: UInt = 0u,
    public var gartHigh: UInt = 0u,
    public var isochCommand: PciAgpIsochCommand = PciAgpIsochCommand(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciAgpExtendedCapability> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciAgpExtendedCapability> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): PciAgpExtendedCapability =
                    PciAgpExtendedCapability(
                        (PciAgpIsochStatus.typeLayout()).readNative(addr),
                        (PciAgpControl.typeLayout()).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (PciAgpAperturePageSize.typeLayout()).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (PciAgpIsochCommand.typeLayout()).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: PciAgpExtendedCapability) {
                    (PciAgpIsochStatus.typeLayout()).writeNative(addr, value.isochStatus)
                    (PciAgpControl.typeLayout()).writeNative(addr + 4L, value.agpControl)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.apertureSize)
                    (PciAgpAperturePageSize.typeLayout()).writeNative(addr + 10L, value.aperturePageSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.gartLow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.gartHigh)
                    (PciAgpIsochCommand.typeLayout()).writeNative(addr + 20L, value.isochCommand)
                }
            }
    }
}

public data class PciAgpIsochCommand(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciAgpIsochCommand> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciAgpIsochCommand> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciAgpIsochCommand =
                    PciAgpIsochCommand(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciAgpIsochCommand) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciAgpIsochStatus(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciAgpIsochStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciAgpIsochStatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciAgpIsochStatus =
                    PciAgpIsochStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciAgpIsochStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class PciAtsInterface internal constructor(
    public var size: UShort,
    public var version: UShort,
    contextCtorArg: MutPtr,
    public var interfaceReference: PinterfaceReference,
    public var interfaceDereference: PinterfaceDereference,
    public var setAddressTranslationServices: PpciSetAts,
    public var invalidateQueueDepth: UByte,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        version = 0u,
        contextCtorArg = MutPtr(0L),
        interfaceReference = null,
        interfaceDereference = null,
        setAddressTranslationServices = null,
        invalidateQueueDepth = 0u,
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): UShort = this.version

    public operator fun component3(): MutPtr = this.context

    public operator fun component4(): PinterfaceReference = this.interfaceReference

    public operator fun component5(): PinterfaceDereference = this.interfaceDereference

    public operator fun component6(): PpciSetAts = this.setAddressTranslationServices

    public operator fun component7(): UByte = this.invalidateQueueDepth

    public fun copy(size: UShort = this.size, version: UShort = this.version, context: MutPtr = this.context, interfaceReference: PinterfaceReference = this.interfaceReference, interfaceDereference: PinterfaceDereference = this.interfaceDereference, setAddressTranslationServices: PpciSetAts = this.setAddressTranslationServices, invalidateQueueDepth: UByte = this.invalidateQueueDepth): PciAtsInterface = PciAtsInterface(size = size, version = version, contextCtorArg = context, interfaceReference = interfaceReference, interfaceDereference = interfaceDereference, setAddressTranslationServices = setAddressTranslationServices, invalidateQueueDepth = invalidateQueueDepth)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PciAtsInterface) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.context != other.context) return false
        if (this.interfaceReference != other.interfaceReference) return false
        if (this.interfaceDereference != other.interfaceDereference) return false
        if (this.setAddressTranslationServices != other.setAddressTranslationServices) return false
        if (this.invalidateQueueDepth != other.invalidateQueueDepth) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.interfaceReference.hashCode()
        result = 31 * result + this.interfaceDereference.hashCode()
        result = 31 * result + this.setAddressTranslationServices.hashCode()
        result = 31 * result + this.invalidateQueueDepth.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UShort = 0u,
            version: UShort = 0u,
            context: MutPtr = MutPtr(0L),
            interfaceReference: PinterfaceReference = null,
            interfaceDereference: PinterfaceDereference = null,
            setAddressTranslationServices: PpciSetAts = null,
            invalidateQueueDepth: UByte = 0u,
        ): PciAtsInterface =
            PciAtsInterface(
                size = size,
                version = version,
                contextCtorArg = context,
                interfaceReference = interfaceReference,
                interfaceDereference = interfaceDereference,
                setAddressTranslationServices = setAddressTranslationServices,
                invalidateQueueDepth = invalidateQueueDepth,
            )
    }
}

public class PciBusInterfaceStandard internal constructor(
    public var size: UShort,
    public var version: UShort,
    contextCtorArg: MutPtr,
    public var interfaceReference: PinterfaceReference,
    public var interfaceDereference: PinterfaceDereference,
    public var readConfig: PpciReadWriteConfig,
    public var writeConfig: PpciReadWriteConfig,
    public var pinToLine: PpciPinToLine,
    public var lineToPin: PpciLineToPin,
    public var rootBusCapability: PpciRootBusCapability,
    public var expressWakeControl: PpciExpressWakeControl,
    public var prepareMultistageResume: PpciPrepareMultistageResume,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        version = 0u,
        contextCtorArg = MutPtr(0L),
        interfaceReference = null,
        interfaceDereference = null,
        readConfig = null,
        writeConfig = null,
        pinToLine = null,
        lineToPin = null,
        rootBusCapability = null,
        expressWakeControl = null,
        prepareMultistageResume = null,
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): UShort = this.version

    public operator fun component3(): MutPtr = this.context

    public operator fun component4(): PinterfaceReference = this.interfaceReference

    public operator fun component5(): PinterfaceDereference = this.interfaceDereference

    public operator fun component6(): PpciReadWriteConfig = this.readConfig

    public operator fun component7(): PpciReadWriteConfig = this.writeConfig

    public operator fun component8(): PpciPinToLine = this.pinToLine

    public operator fun component9(): PpciLineToPin = this.lineToPin

    public operator fun component10(): PpciRootBusCapability = this.rootBusCapability

    public operator fun component11(): PpciExpressWakeControl = this.expressWakeControl

    public operator fun component12(): PpciPrepareMultistageResume = this.prepareMultistageResume

    public fun copy(size: UShort = this.size, version: UShort = this.version, context: MutPtr = this.context, interfaceReference: PinterfaceReference = this.interfaceReference, interfaceDereference: PinterfaceDereference = this.interfaceDereference, readConfig: PpciReadWriteConfig = this.readConfig, writeConfig: PpciReadWriteConfig = this.writeConfig, pinToLine: PpciPinToLine = this.pinToLine, lineToPin: PpciLineToPin = this.lineToPin, rootBusCapability: PpciRootBusCapability = this.rootBusCapability, expressWakeControl: PpciExpressWakeControl = this.expressWakeControl, prepareMultistageResume: PpciPrepareMultistageResume = this.prepareMultistageResume): PciBusInterfaceStandard = PciBusInterfaceStandard(size = size, version = version, contextCtorArg = context, interfaceReference = interfaceReference, interfaceDereference = interfaceDereference, readConfig = readConfig, writeConfig = writeConfig, pinToLine = pinToLine, lineToPin = lineToPin, rootBusCapability = rootBusCapability, expressWakeControl = expressWakeControl, prepareMultistageResume = prepareMultistageResume)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PciBusInterfaceStandard) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.context != other.context) return false
        if (this.interfaceReference != other.interfaceReference) return false
        if (this.interfaceDereference != other.interfaceDereference) return false
        if (this.readConfig != other.readConfig) return false
        if (this.writeConfig != other.writeConfig) return false
        if (this.pinToLine != other.pinToLine) return false
        if (this.lineToPin != other.lineToPin) return false
        if (this.rootBusCapability != other.rootBusCapability) return false
        if (this.expressWakeControl != other.expressWakeControl) return false
        if (this.prepareMultistageResume != other.prepareMultistageResume) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.interfaceReference.hashCode()
        result = 31 * result + this.interfaceDereference.hashCode()
        result = 31 * result + this.readConfig.hashCode()
        result = 31 * result + this.writeConfig.hashCode()
        result = 31 * result + this.pinToLine.hashCode()
        result = 31 * result + this.lineToPin.hashCode()
        result = 31 * result + this.rootBusCapability.hashCode()
        result = 31 * result + this.expressWakeControl.hashCode()
        result = 31 * result + this.prepareMultistageResume.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UShort = 0u,
            version: UShort = 0u,
            context: MutPtr = MutPtr(0L),
            interfaceReference: PinterfaceReference = null,
            interfaceDereference: PinterfaceDereference = null,
            readConfig: PpciReadWriteConfig = null,
            writeConfig: PpciReadWriteConfig = null,
            pinToLine: PpciPinToLine = null,
            lineToPin: PpciLineToPin = null,
            rootBusCapability: PpciRootBusCapability = null,
            expressWakeControl: PpciExpressWakeControl = null,
            prepareMultistageResume: PpciPrepareMultistageResume = null,
        ): PciBusInterfaceStandard =
            PciBusInterfaceStandard(
                size = size,
                version = version,
                contextCtorArg = context,
                interfaceReference = interfaceReference,
                interfaceDereference = interfaceDereference,
                readConfig = readConfig,
                writeConfig = writeConfig,
                pinToLine = pinToLine,
                lineToPin = lineToPin,
                rootBusCapability = rootBusCapability,
                expressWakeControl = expressWakeControl,
                prepareMultistageResume = prepareMultistageResume,
            )
    }
}

public data class PciCapabilitiesHeader(
    public var capabilityID: UByte = 0u,
    public var next: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciCapabilitiesHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciCapabilitiesHeader> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciCapabilitiesHeader =
                    PciCapabilitiesHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: PciCapabilitiesHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.capabilityID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.next)
                }
            }
    }
}

public data class PciCommonConfig(
    public var base: PciCommonHeader = PciCommonHeader(),
    public var deviceSpecific: UByteArray = UByteArray(192),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PciCommonConfig) return false
        if (this.base != other.base) return false
        if (!this.deviceSpecific.contentEquals(other.deviceSpecific)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.base.hashCode()
        result = 31 * result + this.deviceSpecific.contentHashCode()
        return result
    }
}

public data class PciCommonHeader(
    public var vendorID: UShort = 0u,
    public var deviceID: UShort = 0u,
    public var command: UShort = 0u,
    public var status: UShort = 0u,
    public var revisionID: UByte = 0u,
    public var progIf: UByte = 0u,
    public var subClass: UByte = 0u,
    public var baseClass: UByte = 0u,
    public var cacheLineSize: UByte = 0u,
    public var latencyTimer: UByte = 0u,
    public var headerType: UByte = 0u,
    public var bist: UByte = 0u,
    public var u: PciCommonHeader0 = PciCommonHeader0(),
)

public data class PciCommonHeader0(
    public var type0: PciCommonHeader00 = PciCommonHeader00(),
    public var type1: PciCommonHeader01 = PciCommonHeader01(),
    public var type2: PciCommonHeader02 = PciCommonHeader02(),
)

public data class PciCommonHeader00(
    public var baseAddresses: UIntArray = UIntArray(6),
    public var cis: UInt = 0u,
    public var subVendorID: UShort = 0u,
    public var subSystemID: UShort = 0u,
    public var rOMBaseAddress: UInt = 0u,
    public var capabilitiesPtr: UByte = 0u,
    public var reserved1: UByteArray = UByteArray(3),
    public var reserved2: UInt = 0u,
    public var interruptLine: UByte = 0u,
    public var interruptPin: UByte = 0u,
    public var minimumGrant: UByte = 0u,
    public var maximumLatency: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PciCommonHeader00) return false
        if (!this.baseAddresses.contentEquals(other.baseAddresses)) return false
        if (this.cis != other.cis) return false
        if (this.subVendorID != other.subVendorID) return false
        if (this.subSystemID != other.subSystemID) return false
        if (this.rOMBaseAddress != other.rOMBaseAddress) return false
        if (this.capabilitiesPtr != other.capabilitiesPtr) return false
        if (!this.reserved1.contentEquals(other.reserved1)) return false
        if (this.reserved2 != other.reserved2) return false
        if (this.interruptLine != other.interruptLine) return false
        if (this.interruptPin != other.interruptPin) return false
        if (this.minimumGrant != other.minimumGrant) return false
        if (this.maximumLatency != other.maximumLatency) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.baseAddresses.contentHashCode()
        result = 31 * result + this.cis.hashCode()
        result = 31 * result + this.subVendorID.hashCode()
        result = 31 * result + this.subSystemID.hashCode()
        result = 31 * result + this.rOMBaseAddress.hashCode()
        result = 31 * result + this.capabilitiesPtr.hashCode()
        result = 31 * result + this.reserved1.contentHashCode()
        result = 31 * result + this.reserved2.hashCode()
        result = 31 * result + this.interruptLine.hashCode()
        result = 31 * result + this.interruptPin.hashCode()
        result = 31 * result + this.minimumGrant.hashCode()
        result = 31 * result + this.maximumLatency.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciCommonHeader00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciCommonHeader00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): PciCommonHeader00 =
                    PciCommonHeader00(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (6).toInt())
                        ).readNative(addr).toUIntArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 30L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 36L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 37L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 45L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 46L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 47L),
                    )
                override fun writeNative(addr: Long, value: PciCommonHeader00) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (6).toInt())
                    ).writeNative(addr, value.baseAddresses.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cis)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 28L, value.subVendorID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 30L, value.subSystemID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.rOMBaseAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 36L, value.capabilitiesPtr)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 37L, value.reserved1.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.reserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 44L, value.interruptLine)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 45L, value.interruptPin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 46L, value.minimumGrant)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 47L, value.maximumLatency)
                }
            }
    }
}

public class PciCommonHeader01(
    public var baseAddresses: UIntArray = UIntArray(2),
    public var primaryBus: UByte = 0u,
    public var secondaryBus: UByte = 0u,
    public var subordinateBus: UByte = 0u,
    public var secondaryLatency: UByte = 0u,
    public var iOBase: UByte = 0u,
    public var iOLimit: UByte = 0u,
    public var secondaryStatus: UShort = 0u,
    public var memoryBase: UShort = 0u,
    public var memoryLimit: UShort = 0u,
    public var prefetchBase: UShort = 0u,
    public var prefetchLimit: UShort = 0u,
    public var prefetchBaseUpper32: UInt = 0u,
    public var prefetchLimitUpper32: UInt = 0u,
    public var iOBaseUpper16: UShort = 0u,
    public var iOLimitUpper16: UShort = 0u,
    public var capabilitiesPtr: UByte = 0u,
    public var reserved1: UByteArray = UByteArray(3),
    public var rOMBaseAddress: UInt = 0u,
    public var interruptLine: UByte = 0u,
    public var interruptPin: UByte = 0u,
    public var bridgeControl: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciCommonHeader01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciCommonHeader01> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): PciCommonHeader01 =
                    PciCommonHeader01(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                        ).readNative(addr).toUIntArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 11L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 13L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 34L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 36L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 37L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 45L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 46L),
                    )
                override fun writeNative(addr: Long, value: PciCommonHeader01) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                    ).writeNative(addr, value.baseAddresses.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.primaryBus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.secondaryBus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 10L, value.subordinateBus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 11L, value.secondaryLatency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.iOBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 13L, value.iOLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.secondaryStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.memoryBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.memoryLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.prefetchBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 22L, value.prefetchLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.prefetchBaseUpper32)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.prefetchLimitUpper32)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 32L, value.iOBaseUpper16)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 34L, value.iOLimitUpper16)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 36L, value.capabilitiesPtr)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 37L, value.reserved1.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.rOMBaseAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 44L, value.interruptLine)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 45L, value.interruptPin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 46L, value.bridgeControl)
                }
            }
    }
}

public data class PciCommonHeader02(
    public var socketRegistersBaseAddress: UInt = 0u,
    public var capabilitiesPtr: UByte = 0u,
    public var reserved: UByte = 0u,
    public var secondaryStatus: UShort = 0u,
    public var primaryBus: UByte = 0u,
    public var secondaryBus: UByte = 0u,
    public var subordinateBus: UByte = 0u,
    public var secondaryLatency: UByte = 0u,
    public var range: List<PciCommonHeader020> = List(4) { PciCommonHeader020() },
    public var interruptLine: UByte = 0u,
    public var interruptPin: UByte = 0u,
    public var bridgeControl: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciCommonHeader02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciCommonHeader02> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): PciCommonHeader02 =
                    PciCommonHeader02(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 11L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(PciCommonHeader020.typeLayout(), (4).toInt())
                        ).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 45L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 46L),
                    )
                override fun writeNative(addr: Long, value: PciCommonHeader02) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.socketRegistersBaseAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.capabilitiesPtr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.secondaryStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.primaryBus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.secondaryBus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 10L, value.subordinateBus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 11L, value.secondaryLatency)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(PciCommonHeader020.typeLayout(), (4).toInt())
                    ).writeNative(addr + 12L, value.range)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 44L, value.interruptLine)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 45L, value.interruptPin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 46L, value.bridgeControl)
                }
            }
    }
}

public data class PciCommonHeader020(
    public var base: UInt = 0u,
    public var limit: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciCommonHeader020> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciCommonHeader020> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PciCommonHeader020 =
                    PciCommonHeader020(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PciCommonHeader020) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.base)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.limit)
                }
            }
    }
}

public data class PciDebuggingDeviceInUse(
    public var segment: UShort = 0u,
    public var bus: UInt = 0u,
    public var slot: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciDebuggingDeviceInUse> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciDebuggingDeviceInUse> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): PciDebuggingDeviceInUse =
                    PciDebuggingDeviceInUse(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PciDebuggingDeviceInUse) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.segment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.slot)
                }
            }
    }
}

public data class PciDevicePresenceParameters(
    public var size: UInt = 0u,
    public var flags: UInt = 0u,
    public var vendorID: UShort = 0u,
    public var deviceID: UShort = 0u,
    public var revisionID: UByte = 0u,
    public var subVendorID: UShort = 0u,
    public var subSystemID: UShort = 0u,
    public var baseClass: UByte = 0u,
    public var subClass: UByte = 0u,
    public var progIf: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciDevicePresenceParameters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciDevicePresenceParameters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): PciDevicePresenceParameters =
                    PciDevicePresenceParameters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 19L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: PciDevicePresenceParameters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.vendorID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.deviceID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.revisionID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.subVendorID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.subSystemID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 18L, value.baseClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 19L, value.subClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 20L, value.progIf)
                }
            }
    }
}

public class PciDevicePresentInterface internal constructor(
    public var size: UShort,
    public var version: UShort,
    contextCtorArg: MutPtr,
    public var interfaceReference: PinterfaceReference,
    public var interfaceDereference: PinterfaceDereference,
    public var isDevicePresent: PpciIsDevicePresent,
    public var isDevicePresentEx: PpciIsDevicePresentEx,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        version = 0u,
        contextCtorArg = MutPtr(0L),
        interfaceReference = null,
        interfaceDereference = null,
        isDevicePresent = null,
        isDevicePresentEx = null,
    )

    public operator fun component1(): UShort = this.size

    public operator fun component2(): UShort = this.version

    public operator fun component3(): MutPtr = this.context

    public operator fun component4(): PinterfaceReference = this.interfaceReference

    public operator fun component5(): PinterfaceDereference = this.interfaceDereference

    public operator fun component6(): PpciIsDevicePresent = this.isDevicePresent

    public operator fun component7(): PpciIsDevicePresentEx = this.isDevicePresentEx

    public fun copy(size: UShort = this.size, version: UShort = this.version, context: MutPtr = this.context, interfaceReference: PinterfaceReference = this.interfaceReference, interfaceDereference: PinterfaceDereference = this.interfaceDereference, isDevicePresent: PpciIsDevicePresent = this.isDevicePresent, isDevicePresentEx: PpciIsDevicePresentEx = this.isDevicePresentEx): PciDevicePresentInterface = PciDevicePresentInterface(size = size, version = version, contextCtorArg = context, interfaceReference = interfaceReference, interfaceDereference = interfaceDereference, isDevicePresent = isDevicePresent, isDevicePresentEx = isDevicePresentEx)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PciDevicePresentInterface) return false
        if (this.size != other.size) return false
        if (this.version != other.version) return false
        if (this.context != other.context) return false
        if (this.interfaceReference != other.interfaceReference) return false
        if (this.interfaceDereference != other.interfaceDereference) return false
        if (this.isDevicePresent != other.isDevicePresent) return false
        if (this.isDevicePresentEx != other.isDevicePresentEx) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.interfaceReference.hashCode()
        result = 31 * result + this.interfaceDereference.hashCode()
        result = 31 * result + this.isDevicePresent.hashCode()
        result = 31 * result + this.isDevicePresentEx.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: UShort = 0u,
            version: UShort = 0u,
            context: MutPtr = MutPtr(0L),
            interfaceReference: PinterfaceReference = null,
            interfaceDereference: PinterfaceDereference = null,
            isDevicePresent: PpciIsDevicePresent = null,
            isDevicePresentEx: PpciIsDevicePresentEx = null,
        ): PciDevicePresentInterface =
            PciDevicePresentInterface(
                size = size,
                version = version,
                contextCtorArg = context,
                interfaceReference = interfaceReference,
                interfaceDereference = interfaceDereference,
                isDevicePresent = isDevicePresent,
                isDevicePresentEx = isDevicePresentEx,
            )
    }
}

public data class PciExpressAcsCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var capability: PciExpressAcsCapabilityRegister = PciExpressAcsCapabilityRegister(),
    public var control: PciExpressAcsControl = PciExpressAcsControl(),
    public var egressControl: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PciExpressAcsCapability) return false
        if (this.header != other.header) return false
        if (this.capability != other.capability) return false
        if (this.control != other.control) return false
        if (!this.egressControl.contentEquals(other.egressControl)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.capability.hashCode()
        result = 31 * result + this.control.hashCode()
        result = 31 * result + this.egressControl.contentHashCode()
        return result
    }
}

public data class PciExpressAcsCapabilityRegister(
    public var anonymous: PciExpressAcsCapabilityRegister0 = PciExpressAcsCapabilityRegister0(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressAcsCapabilityRegister0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressAcsCapabilityRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressAcsCapabilityRegister0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressAcsCapabilityRegister0 =
                    PciExpressAcsCapabilityRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressAcsCapabilityRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressAcsControl(
    public var anonymous: PciExpressAcsControl0 = PciExpressAcsControl0(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressAcsControl0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressAcsControl0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressAcsControl0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressAcsControl0 =
                    PciExpressAcsControl0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressAcsControl0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressAerCapabilities(
    public var anonymous: PciExpressAerCapabilities0 = PciExpressAerCapabilities0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressAerCapabilities0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressAerCapabilities0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressAerCapabilities0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressAerCapabilities0 =
                    PciExpressAerCapabilities0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressAerCapabilities0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressAerCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var uncorrectableErrorStatus: PciExpressUncorrectableErrorStatus = PciExpressUncorrectableErrorStatus(),
    public var uncorrectableErrorMask: PciExpressUncorrectableErrorMask = PciExpressUncorrectableErrorMask(),
    public var uncorrectableErrorSeverity: PciExpressUncorrectableErrorSeverity = PciExpressUncorrectableErrorSeverity(),
    public var correctableErrorStatus: PciExpressCorrectableErrorStatus = PciExpressCorrectableErrorStatus(),
    public var correctableErrorMask: PciExpressCorrectableErrorMask = PciExpressCorrectableErrorMask(),
    public var capabilitiesAndControl: PciExpressAerCapabilities = PciExpressAerCapabilities(),
    public var headerLog: UIntArray = UIntArray(4),
    public var secUncorrectableErrorStatus: PciExpressSecUncorrectableErrorStatus = PciExpressSecUncorrectableErrorStatus(),
    public var secUncorrectableErrorMask: PciExpressSecUncorrectableErrorMask = PciExpressSecUncorrectableErrorMask(),
    public var secUncorrectableErrorSeverity: PciExpressSecUncorrectableErrorSeverity = PciExpressSecUncorrectableErrorSeverity(),
    public var secCapabilitiesAndControl: PciExpressSecAerCapabilities = PciExpressSecAerCapabilities(),
    public var secHeaderLog: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PciExpressAerCapability) return false
        if (this.header != other.header) return false
        if (this.uncorrectableErrorStatus != other.uncorrectableErrorStatus) return false
        if (this.uncorrectableErrorMask != other.uncorrectableErrorMask) return false
        if (this.uncorrectableErrorSeverity != other.uncorrectableErrorSeverity) return false
        if (this.correctableErrorStatus != other.correctableErrorStatus) return false
        if (this.correctableErrorMask != other.correctableErrorMask) return false
        if (this.capabilitiesAndControl != other.capabilitiesAndControl) return false
        if (!this.headerLog.contentEquals(other.headerLog)) return false
        if (this.secUncorrectableErrorStatus != other.secUncorrectableErrorStatus) return false
        if (this.secUncorrectableErrorMask != other.secUncorrectableErrorMask) return false
        if (this.secUncorrectableErrorSeverity != other.secUncorrectableErrorSeverity) return false
        if (this.secCapabilitiesAndControl != other.secCapabilitiesAndControl) return false
        if (!this.secHeaderLog.contentEquals(other.secHeaderLog)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uncorrectableErrorStatus.hashCode()
        result = 31 * result + this.uncorrectableErrorMask.hashCode()
        result = 31 * result + this.uncorrectableErrorSeverity.hashCode()
        result = 31 * result + this.correctableErrorStatus.hashCode()
        result = 31 * result + this.correctableErrorMask.hashCode()
        result = 31 * result + this.capabilitiesAndControl.hashCode()
        result = 31 * result + this.headerLog.contentHashCode()
        result = 31 * result + this.secUncorrectableErrorStatus.hashCode()
        result = 31 * result + this.secUncorrectableErrorMask.hashCode()
        result = 31 * result + this.secUncorrectableErrorSeverity.hashCode()
        result = 31 * result + this.secCapabilitiesAndControl.hashCode()
        result = 31 * result + this.secHeaderLog.contentHashCode()
        return result
    }
}

public data class PciExpressAriCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var capability: PciExpressAriCapabilityRegister = PciExpressAriCapabilityRegister(),
    public var control: PciExpressAriControlRegister = PciExpressAriControlRegister(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressAriCapability> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressAriCapability> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PciExpressAriCapability =
                    PciExpressAriCapability(
                        (PciExpressEnhancedCapabilityHeader.typeLayout()).readNative(addr),
                        (PciExpressAriCapabilityRegister.typeLayout()).readNative(addr + 4L),
                        (PciExpressAriControlRegister.typeLayout()).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: PciExpressAriCapability) {
                    (PciExpressEnhancedCapabilityHeader.typeLayout()).writeNative(addr, value.header)
                    (PciExpressAriCapabilityRegister.typeLayout()).writeNative(addr + 4L, value.capability)
                    (PciExpressAriControlRegister.typeLayout()).writeNative(addr + 6L, value.control)
                }
            }
    }
}

public data class PciExpressAriCapabilityRegister(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressAriCapabilityRegister> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressAriCapabilityRegister> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressAriCapabilityRegister =
                    PciExpressAriCapabilityRegister(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressAriCapabilityRegister) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressAriControlRegister(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressAriControlRegister> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressAriControlRegister> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressAriControlRegister =
                    PciExpressAriControlRegister(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressAriControlRegister) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressAtsCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var capability: PciExpressAtsCapabilityRegister = PciExpressAtsCapabilityRegister(),
    public var control: PciExpressAtsControlRegister = PciExpressAtsControlRegister(),
)

public data class PciExpressAtsCapabilityRegister(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressAtsCapabilityRegister> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressAtsCapabilityRegister> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressAtsCapabilityRegister =
                    PciExpressAtsCapabilityRegister(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressAtsCapabilityRegister) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressAtsControlRegister(
    public var anonymous: PciExpressAtsControlRegister0 = PciExpressAtsControlRegister0(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressAtsControlRegister0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressAtsControlRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressAtsControlRegister0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressAtsControlRegister0 =
                    PciExpressAtsControlRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressAtsControlRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressBridgeAerCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var uncorrectableErrorStatus: PciExpressUncorrectableErrorStatus = PciExpressUncorrectableErrorStatus(),
    public var uncorrectableErrorMask: PciExpressUncorrectableErrorMask = PciExpressUncorrectableErrorMask(),
    public var uncorrectableErrorSeverity: PciExpressUncorrectableErrorSeverity = PciExpressUncorrectableErrorSeverity(),
    public var correctableErrorStatus: PciExpressCorrectableErrorStatus = PciExpressCorrectableErrorStatus(),
    public var correctableErrorMask: PciExpressCorrectableErrorMask = PciExpressCorrectableErrorMask(),
    public var capabilitiesAndControl: PciExpressAerCapabilities = PciExpressAerCapabilities(),
    public var headerLog: UIntArray = UIntArray(4),
    public var secUncorrectableErrorStatus: PciExpressSecUncorrectableErrorStatus = PciExpressSecUncorrectableErrorStatus(),
    public var secUncorrectableErrorMask: PciExpressSecUncorrectableErrorMask = PciExpressSecUncorrectableErrorMask(),
    public var secUncorrectableErrorSeverity: PciExpressSecUncorrectableErrorSeverity = PciExpressSecUncorrectableErrorSeverity(),
    public var secCapabilitiesAndControl: PciExpressSecAerCapabilities = PciExpressSecAerCapabilities(),
    public var secHeaderLog: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PciExpressBridgeAerCapability) return false
        if (this.header != other.header) return false
        if (this.uncorrectableErrorStatus != other.uncorrectableErrorStatus) return false
        if (this.uncorrectableErrorMask != other.uncorrectableErrorMask) return false
        if (this.uncorrectableErrorSeverity != other.uncorrectableErrorSeverity) return false
        if (this.correctableErrorStatus != other.correctableErrorStatus) return false
        if (this.correctableErrorMask != other.correctableErrorMask) return false
        if (this.capabilitiesAndControl != other.capabilitiesAndControl) return false
        if (!this.headerLog.contentEquals(other.headerLog)) return false
        if (this.secUncorrectableErrorStatus != other.secUncorrectableErrorStatus) return false
        if (this.secUncorrectableErrorMask != other.secUncorrectableErrorMask) return false
        if (this.secUncorrectableErrorSeverity != other.secUncorrectableErrorSeverity) return false
        if (this.secCapabilitiesAndControl != other.secCapabilitiesAndControl) return false
        if (!this.secHeaderLog.contentEquals(other.secHeaderLog)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.uncorrectableErrorStatus.hashCode()
        result = 31 * result + this.uncorrectableErrorMask.hashCode()
        result = 31 * result + this.uncorrectableErrorSeverity.hashCode()
        result = 31 * result + this.correctableErrorStatus.hashCode()
        result = 31 * result + this.correctableErrorMask.hashCode()
        result = 31 * result + this.capabilitiesAndControl.hashCode()
        result = 31 * result + this.headerLog.contentHashCode()
        result = 31 * result + this.secUncorrectableErrorStatus.hashCode()
        result = 31 * result + this.secUncorrectableErrorMask.hashCode()
        result = 31 * result + this.secUncorrectableErrorSeverity.hashCode()
        result = 31 * result + this.secCapabilitiesAndControl.hashCode()
        result = 31 * result + this.secHeaderLog.contentHashCode()
        return result
    }
}

public data class PciExpressCapabilitiesRegister(
    public var anonymous: PciExpressCapabilitiesRegister0 = PciExpressCapabilitiesRegister0(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressCapabilitiesRegister0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressCapabilitiesRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressCapabilitiesRegister0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressCapabilitiesRegister0 =
                    PciExpressCapabilitiesRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressCapabilitiesRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class PciExpressCapability(
    public var header: PciCapabilitiesHeader = PciCapabilitiesHeader(),
    public var expressCapabilities: PciExpressCapabilitiesRegister = PciExpressCapabilitiesRegister(),
    public var deviceCapabilities: PciExpressDeviceCapabilitiesRegister = PciExpressDeviceCapabilitiesRegister(),
    public var deviceControl: PciExpressDeviceControlRegister = PciExpressDeviceControlRegister(),
    public var deviceStatus: PciExpressDeviceStatusRegister = PciExpressDeviceStatusRegister(),
    public var linkCapabilities: PciExpressLinkCapabilitiesRegister = PciExpressLinkCapabilitiesRegister(),
    public var linkControl: PciExpressLinkControlRegister = PciExpressLinkControlRegister(),
    public var linkStatus: PciExpressLinkStatusRegister = PciExpressLinkStatusRegister(),
    public var slotCapabilities: PciExpressSlotCapabilitiesRegister = PciExpressSlotCapabilitiesRegister(),
    public var slotControl: PciExpressSlotControlRegister = PciExpressSlotControlRegister(),
    public var slotStatus: PciExpressSlotStatusRegister = PciExpressSlotStatusRegister(),
    public var rootControl: PciExpressRootControlRegister = PciExpressRootControlRegister(),
    public var rootCapabilities: PciExpressRootCapabilitiesRegister = PciExpressRootCapabilitiesRegister(),
    public var rootStatus: PciExpressRootStatusRegister = PciExpressRootStatusRegister(),
    public var deviceCapabilities2: PciExpressDeviceCapabilities2Register = PciExpressDeviceCapabilities2Register(),
    public var deviceControl2: PciExpressDeviceControl2Register = PciExpressDeviceControl2Register(),
    public var deviceStatus2: PciExpressDeviceStatus2Register = PciExpressDeviceStatus2Register(),
    public var linkCapabilities2: PciExpressLinkCapabilities2Register = PciExpressLinkCapabilities2Register(),
    public var linkControl2: PciExpressLinkControl2Register = PciExpressLinkControl2Register(),
    public var linkStatus2: PciExpressLinkStatus2Register = PciExpressLinkStatus2Register(),
)

public data class PciExpressCorrectableErrorMask(
    public var anonymous: PciExpressCorrectableErrorMask0 = PciExpressCorrectableErrorMask0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressCorrectableErrorMask0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressCorrectableErrorMask0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressCorrectableErrorMask0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressCorrectableErrorMask0 =
                    PciExpressCorrectableErrorMask0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressCorrectableErrorMask0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressCorrectableErrorStatus(
    public var anonymous: PciExpressCorrectableErrorStatus0 = PciExpressCorrectableErrorStatus0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressCorrectableErrorStatus0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressCorrectableErrorStatus0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressCorrectableErrorStatus0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressCorrectableErrorStatus0 =
                    PciExpressCorrectableErrorStatus0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressCorrectableErrorStatus0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressCxlDvsecCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var dvsecHeader1: PciExpressDesignatedVendorSpecificHeader1 = PciExpressDesignatedVendorSpecificHeader1(),
    public var dvsecHeader2: PciExpressDesignatedVendorSpecificHeader2 = PciExpressDesignatedVendorSpecificHeader2(),
    public var reserved: UByteArray = UByteArray(46),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PciExpressCxlDvsecCapability) return false
        if (this.header != other.header) return false
        if (this.dvsecHeader1 != other.dvsecHeader1) return false
        if (this.dvsecHeader2 != other.dvsecHeader2) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.dvsecHeader1.hashCode()
        result = 31 * result + this.dvsecHeader2.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class PciExpressCxlDvsecCapabilityRegisterV11(
    public var anonymous: PciExpressCxlDvsecCapabilityRegisterV110 = PciExpressCxlDvsecCapabilityRegisterV110(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressCxlDvsecCapabilityRegisterV110(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressCxlDvsecCapabilityRegisterV110> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressCxlDvsecCapabilityRegisterV110> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressCxlDvsecCapabilityRegisterV110 =
                    PciExpressCxlDvsecCapabilityRegisterV110(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressCxlDvsecCapabilityRegisterV110) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class PciExpressCxlDvsecCapabilityV11(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var dvsecHeader1: PciExpressDesignatedVendorSpecificHeader1 = PciExpressDesignatedVendorSpecificHeader1(),
    public var dvsecHeader2: PciExpressDesignatedVendorSpecificHeader2 = PciExpressDesignatedVendorSpecificHeader2(),
    public var capability: PciExpressCxlDvsecCapabilityRegisterV11 = PciExpressCxlDvsecCapabilityRegisterV11(),
    public var control: PciExpressCxlDvsecControlRegister = PciExpressCxlDvsecControlRegister(),
    public var status: PciExpressCxlDvsecStatusRegister = PciExpressCxlDvsecStatusRegister(),
    public var control2: UShort = 0u,
    public var status2: UShort = 0u,
    public var lock: PciExpressCxlDvsecLockRegister = PciExpressCxlDvsecLockRegister(),
    public var reserved: UShort = 0u,
    public var range1SizeHigh: PciExpressCxlDvsecRangeSizeHighRegister = PciExpressCxlDvsecRangeSizeHighRegister(),
    public var range1SizeLow: PciExpressCxlDvsecRangeSizeLowRegisterV11 = PciExpressCxlDvsecRangeSizeLowRegisterV11(),
    public var range1BaseHigh: PciExpressCxlDvsecRangeBaseHighRegister = PciExpressCxlDvsecRangeBaseHighRegister(),
    public var range1BaseLow: PciExpressCxlDvsecRangeBaseLowRegister = PciExpressCxlDvsecRangeBaseLowRegister(),
    public var range2SizeHigh: PciExpressCxlDvsecRangeSizeHighRegister = PciExpressCxlDvsecRangeSizeHighRegister(),
    public var range2SizeLow: PciExpressCxlDvsecRangeSizeLowRegisterV11 = PciExpressCxlDvsecRangeSizeLowRegisterV11(),
    public var range2BaseHigh: PciExpressCxlDvsecRangeBaseHighRegister = PciExpressCxlDvsecRangeBaseHighRegister(),
    public var range2BaseLow: PciExpressCxlDvsecRangeBaseLowRegister = PciExpressCxlDvsecRangeBaseLowRegister(),
)

public data class PciExpressCxlDvsecControlRegister(
    public var anonymous: PciExpressCxlDvsecControlRegister0 = PciExpressCxlDvsecControlRegister0(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressCxlDvsecControlRegister0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressCxlDvsecControlRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressCxlDvsecControlRegister0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressCxlDvsecControlRegister0 =
                    PciExpressCxlDvsecControlRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressCxlDvsecControlRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressCxlDvsecLockRegister(
    public var anonymous: PciExpressCxlDvsecLockRegister0 = PciExpressCxlDvsecLockRegister0(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressCxlDvsecLockRegister0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressCxlDvsecLockRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressCxlDvsecLockRegister0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressCxlDvsecLockRegister0 =
                    PciExpressCxlDvsecLockRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressCxlDvsecLockRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressCxlDvsecRangeBaseHighRegister(
    public var memBaseHigh: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressCxlDvsecRangeBaseHighRegister> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressCxlDvsecRangeBaseHighRegister> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressCxlDvsecRangeBaseHighRegister =
                    PciExpressCxlDvsecRangeBaseHighRegister(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressCxlDvsecRangeBaseHighRegister) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.memBaseHigh)
                }
            }
    }
}

public data class PciExpressCxlDvsecRangeBaseLowRegister(
    public var anonymous: PciExpressCxlDvsecRangeBaseLowRegister0 = PciExpressCxlDvsecRangeBaseLowRegister0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressCxlDvsecRangeBaseLowRegister0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressCxlDvsecRangeBaseLowRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressCxlDvsecRangeBaseLowRegister0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressCxlDvsecRangeBaseLowRegister0 =
                    PciExpressCxlDvsecRangeBaseLowRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressCxlDvsecRangeBaseLowRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressCxlDvsecRangeSizeHighRegister(
    public var memSizeHigh: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressCxlDvsecRangeSizeHighRegister> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressCxlDvsecRangeSizeHighRegister> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressCxlDvsecRangeSizeHighRegister =
                    PciExpressCxlDvsecRangeSizeHighRegister(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressCxlDvsecRangeSizeHighRegister) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.memSizeHigh)
                }
            }
    }
}

public data class PciExpressCxlDvsecRangeSizeLowRegisterV11(
    public var anonymous: PciExpressCxlDvsecRangeSizeLowRegisterV110 = PciExpressCxlDvsecRangeSizeLowRegisterV110(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressCxlDvsecRangeSizeLowRegisterV110(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressCxlDvsecRangeSizeLowRegisterV110> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressCxlDvsecRangeSizeLowRegisterV110> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressCxlDvsecRangeSizeLowRegisterV110 =
                    PciExpressCxlDvsecRangeSizeLowRegisterV110(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressCxlDvsecRangeSizeLowRegisterV110) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressCxlDvsecStatusRegister(
    public var anonymous: PciExpressCxlDvsecStatusRegister0 = PciExpressCxlDvsecStatusRegister0(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressCxlDvsecStatusRegister0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressCxlDvsecStatusRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressCxlDvsecStatusRegister0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressCxlDvsecStatusRegister0 =
                    PciExpressCxlDvsecStatusRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressCxlDvsecStatusRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressDesignatedVendorSpecificCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var dvsecHeader1: PciExpressDesignatedVendorSpecificHeader1 = PciExpressDesignatedVendorSpecificHeader1(),
    public var dvsecHeader2: PciExpressDesignatedVendorSpecificHeader2 = PciExpressDesignatedVendorSpecificHeader2(),
    public var dvsecRegisters: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PciExpressDesignatedVendorSpecificCapability) return false
        if (this.header != other.header) return false
        if (this.dvsecHeader1 != other.dvsecHeader1) return false
        if (this.dvsecHeader2 != other.dvsecHeader2) return false
        if (!this.dvsecRegisters.contentEquals(other.dvsecRegisters)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.dvsecHeader1.hashCode()
        result = 31 * result + this.dvsecHeader2.hashCode()
        result = 31 * result + this.dvsecRegisters.contentHashCode()
        return result
    }
}

public data class PciExpressDesignatedVendorSpecificHeader1(
    public var anonymous: PciExpressDesignatedVendorSpecificHeader10 = PciExpressDesignatedVendorSpecificHeader10(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressDesignatedVendorSpecificHeader10(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDesignatedVendorSpecificHeader10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDesignatedVendorSpecificHeader10> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressDesignatedVendorSpecificHeader10 =
                    PciExpressDesignatedVendorSpecificHeader10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressDesignatedVendorSpecificHeader10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressDesignatedVendorSpecificHeader2(
    public var anonymous: PciExpressDesignatedVendorSpecificHeader20 = PciExpressDesignatedVendorSpecificHeader20(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressDesignatedVendorSpecificHeader20(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDesignatedVendorSpecificHeader20> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDesignatedVendorSpecificHeader20> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressDesignatedVendorSpecificHeader20 =
                    PciExpressDesignatedVendorSpecificHeader20(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressDesignatedVendorSpecificHeader20) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressDeviceCapabilities2Register(
    public var anonymous: PciExpressDeviceCapabilities2Register0 = PciExpressDeviceCapabilities2Register0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressDeviceCapabilities2Register0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDeviceCapabilities2Register0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDeviceCapabilities2Register0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressDeviceCapabilities2Register0 =
                    PciExpressDeviceCapabilities2Register0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressDeviceCapabilities2Register0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressDeviceCapabilitiesRegister(
    public var anonymous: PciExpressDeviceCapabilitiesRegister0 = PciExpressDeviceCapabilitiesRegister0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressDeviceCapabilitiesRegister0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDeviceCapabilitiesRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDeviceCapabilitiesRegister0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressDeviceCapabilitiesRegister0 =
                    PciExpressDeviceCapabilitiesRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressDeviceCapabilitiesRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressDeviceControl2Register(
    public var anonymous: PciExpressDeviceControl2Register0 = PciExpressDeviceControl2Register0(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressDeviceControl2Register0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDeviceControl2Register0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDeviceControl2Register0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressDeviceControl2Register0 =
                    PciExpressDeviceControl2Register0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressDeviceControl2Register0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressDeviceControlRegister(
    public var anonymous1: PciExpressDeviceControlRegister0 = PciExpressDeviceControlRegister0(),
    public var anonymous2: PciExpressDeviceControlRegister1 = PciExpressDeviceControlRegister1(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressDeviceControlRegister0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDeviceControlRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDeviceControlRegister0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressDeviceControlRegister0 =
                    PciExpressDeviceControlRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressDeviceControlRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressDeviceControlRegister1(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDeviceControlRegister1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDeviceControlRegister1> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressDeviceControlRegister1 =
                    PciExpressDeviceControlRegister1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressDeviceControlRegister1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressDeviceStatus2Register(
    public var anonymous: PciExpressDeviceStatus2Register0 = PciExpressDeviceStatus2Register0(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressDeviceStatus2Register0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDeviceStatus2Register0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDeviceStatus2Register0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressDeviceStatus2Register0 =
                    PciExpressDeviceStatus2Register0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressDeviceStatus2Register0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressDeviceStatusRegister(
    public var anonymous: PciExpressDeviceStatusRegister0 = PciExpressDeviceStatusRegister0(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressDeviceStatusRegister0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDeviceStatusRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDeviceStatusRegister0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressDeviceStatusRegister0 =
                    PciExpressDeviceStatusRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressDeviceStatusRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressDpcCapability(
    public var header: PciExpressEnhancedCapabilityHeader = PciExpressEnhancedCapabilityHeader(),
    public var dpcCapabilities: PciExpressDpcCapsRegister = PciExpressDpcCapsRegister(),
    public var dpcControl: PciExpressDpcControlRegister = PciExpressDpcControlRegister(),
    public var dpcStatus: PciExpressDpcStatusRegister = PciExpressDpcStatusRegister(),
    public var dpcErrSrcId: PciExpressDpcErrorSourceId = PciExpressDpcErrorSourceId(),
    public var rpPioStatus: PciExpressDpcRpPioStatusRegister = PciExpressDpcRpPioStatusRegister(),
    public var rpPioMask: PciExpressDpcRpPioMaskRegister = PciExpressDpcRpPioMaskRegister(),
    public var rpPioSeverity: PciExpressDpcRpPioSeverityRegister = PciExpressDpcRpPioSeverityRegister(),
    public var rpPioSysError: PciExpressDpcRpPioSyserrRegister = PciExpressDpcRpPioSyserrRegister(),
    public var rpPioException: PciExpressDpcRpPioExceptionRegister = PciExpressDpcRpPioExceptionRegister(),
    public var rpPioHeaderLog: PciExpressDpcRpPioHeaderlogRegister = PciExpressDpcRpPioHeaderlogRegister(),
    public var rpPioImpSpecLog: PciExpressDpcRpPioImpspeclogRegister = PciExpressDpcRpPioImpspeclogRegister(),
    public var rpPioPrefixLog: PciExpressDpcRpPioTlpprefixlogRegister = PciExpressDpcRpPioTlpprefixlogRegister(),
)

public data class PciExpressDpcCapsRegister(
    public var anonymous: PciExpressDpcCapsRegister0 = PciExpressDpcCapsRegister0(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressDpcCapsRegister0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDpcCapsRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDpcCapsRegister0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressDpcCapsRegister0 =
                    PciExpressDpcCapsRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressDpcCapsRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressDpcControlRegister(
    public var anonymous: PciExpressDpcControlRegister0 = PciExpressDpcControlRegister0(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressDpcControlRegister0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDpcControlRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDpcControlRegister0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressDpcControlRegister0 =
                    PciExpressDpcControlRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressDpcControlRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressDpcErrorSourceId(
    public var anonymous: PciExpressDpcErrorSourceId0 = PciExpressDpcErrorSourceId0(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressDpcErrorSourceId0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDpcErrorSourceId0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDpcErrorSourceId0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressDpcErrorSourceId0 =
                    PciExpressDpcErrorSourceId0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressDpcErrorSourceId0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressDpcRpPioExceptionRegister(
    public var anonymous: PciExpressDpcRpPioExceptionRegister0 = PciExpressDpcRpPioExceptionRegister0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressDpcRpPioExceptionRegister0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDpcRpPioExceptionRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDpcRpPioExceptionRegister0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressDpcRpPioExceptionRegister0 =
                    PciExpressDpcRpPioExceptionRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressDpcRpPioExceptionRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressDpcRpPioHeaderlogRegister(
    public var pioHeaderLogRegister: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PciExpressDpcRpPioHeaderlogRegister) return false
        if (!this.pioHeaderLogRegister.contentEquals(other.pioHeaderLogRegister)) return false
        return true
    }

    override fun hashCode(): Int = this.pioHeaderLogRegister.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDpcRpPioHeaderlogRegister> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDpcRpPioHeaderlogRegister> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PciExpressDpcRpPioHeaderlogRegister =
                    PciExpressDpcRpPioHeaderlogRegister(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: PciExpressDpcRpPioHeaderlogRegister) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr, value.pioHeaderLogRegister.toList())
                }
            }
    }
}

public data class PciExpressDpcRpPioImpspeclogRegister(
    public var pioImpSpecLog: UInt = 0u,
)

public data class PciExpressDpcRpPioMaskRegister(
    public var anonymous: PciExpressDpcRpPioMaskRegister0 = PciExpressDpcRpPioMaskRegister0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressDpcRpPioMaskRegister0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDpcRpPioMaskRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDpcRpPioMaskRegister0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressDpcRpPioMaskRegister0 =
                    PciExpressDpcRpPioMaskRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressDpcRpPioMaskRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressDpcRpPioSeverityRegister(
    public var anonymous: PciExpressDpcRpPioSeverityRegister0 = PciExpressDpcRpPioSeverityRegister0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressDpcRpPioSeverityRegister0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDpcRpPioSeverityRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDpcRpPioSeverityRegister0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressDpcRpPioSeverityRegister0 =
                    PciExpressDpcRpPioSeverityRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressDpcRpPioSeverityRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressDpcRpPioStatusRegister(
    public var anonymous: PciExpressDpcRpPioStatusRegister0 = PciExpressDpcRpPioStatusRegister0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressDpcRpPioStatusRegister0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDpcRpPioStatusRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDpcRpPioStatusRegister0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressDpcRpPioStatusRegister0 =
                    PciExpressDpcRpPioStatusRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressDpcRpPioStatusRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressDpcRpPioSyserrRegister(
    public var anonymous: PciExpressDpcRpPioSyserrRegister0 = PciExpressDpcRpPioSyserrRegister0(),
    public var asULONG: UInt = 0u,
)

public data class PciExpressDpcRpPioSyserrRegister0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDpcRpPioSyserrRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDpcRpPioSyserrRegister0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressDpcRpPioSyserrRegister0 =
                    PciExpressDpcRpPioSyserrRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressDpcRpPioSyserrRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressDpcRpPioTlpprefixlogRegister(
    public var pioTlpPrefixLogRegister: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PciExpressDpcRpPioTlpprefixlogRegister) return false
        if (!this.pioTlpPrefixLogRegister.contentEquals(other.pioTlpPrefixLogRegister)) return false
        return true
    }

    override fun hashCode(): Int = this.pioTlpPrefixLogRegister.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDpcRpPioTlpprefixlogRegister> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDpcRpPioTlpprefixlogRegister> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PciExpressDpcRpPioTlpprefixlogRegister =
                    PciExpressDpcRpPioTlpprefixlogRegister(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: PciExpressDpcRpPioTlpprefixlogRegister) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr, value.pioTlpPrefixLogRegister.toList())
                }
            }
    }
}

public data class PciExpressDpcStatusRegister(
    public var anonymous: PciExpressDpcStatusRegister0 = PciExpressDpcStatusRegister0(),
    public var asUSHORT: UShort = 0u,
)

public data class PciExpressDpcStatusRegister0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDpcStatusRegister0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressDpcStatusRegister0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): PciExpressDpcStatusRegister0 =
                    PciExpressDpcStatusRegister0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PciExpressDpcStatusRegister0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PciExpressEnhancedCapabilityHeader(
    public var capabilityID: UShort = 0u,
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressEnhancedCapabilityHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PciExpressEnhancedCapabilityHeader> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PciExpressEnhancedCapabilityHeader =
                    PciExpressEnhancedCapabilityHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: PciExpressEnhancedCapabilityHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.capabilityID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.bitfield)
                }
            }
    }
}

public data class PciExpressErrorSourceId(
    public var anonymous: PciExpressErrorSourceId0 = PciExpressErrorSourceId0(),
    public var asULONG: UInt = 0u,
)
