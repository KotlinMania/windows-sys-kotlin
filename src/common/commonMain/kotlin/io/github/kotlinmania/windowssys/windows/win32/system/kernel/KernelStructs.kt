@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.kernel

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pstr

public class Cstring internal constructor(
    public var length: UShort,
    public var maximumLength: UShort,
    bufferCtorArg: Pcstr,
) {
    public var buffer: Pcstr = bufferCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        maximumLength = 0u,
        bufferCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UShort = this.length

    public operator fun component2(): UShort = this.maximumLength

    public operator fun component3(): Pcstr = this.buffer

    public fun copy(length: UShort = this.length, maximumLength: UShort = this.maximumLength, buffer: Pcstr = this.buffer): Cstring = Cstring(length = length, maximumLength = maximumLength, bufferCtorArg = buffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Cstring) return false
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
            buffer: Pcstr = ConstPtr(0L),
        ): Cstring =
            Cstring(
                length = length,
                maximumLength = maximumLength,
                bufferCtorArg = buffer,
            )
    }
}

public class ExceptionRegistrationRecord internal constructor(
    nextCtorArg: MutPtr,
    public var handler: ExceptionRoutine,
) {
    public var next: MutPtr = nextCtorArg
        internal set

    public constructor() : this(
        nextCtorArg = MutPtr(0L),
        handler = null,
    )

    public operator fun component1(): MutPtr = this.next

    public operator fun component2(): ExceptionRoutine = this.handler

    public fun copy(next: MutPtr = this.next, handler: ExceptionRoutine = this.handler): ExceptionRegistrationRecord = ExceptionRegistrationRecord(nextCtorArg = next, handler = handler)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ExceptionRegistrationRecord) return false
        if (this.next != other.next) return false
        if (this.handler != other.handler) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.next.hashCode()
        result = 31 * result + this.handler.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            next: MutPtr = MutPtr(0L),
            handler: ExceptionRoutine = null,
        ): ExceptionRegistrationRecord =
            ExceptionRegistrationRecord(
                nextCtorArg = next,
                handler = handler,
            )
    }
}

public data class FloatingSaveArea(
    public var controlWord: UInt = 0u,
    public var statusWord: UInt = 0u,
    public var tagWord: UInt = 0u,
    public var errorOffset: UInt = 0u,
    public var errorSelector: UInt = 0u,
    public var dataOffset: UInt = 0u,
    public var dataSelector: UInt = 0u,
    public var registerArea: UByteArray = UByteArray(80),
    public var cr0NpxState: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FloatingSaveArea) return false
        if (this.controlWord != other.controlWord) return false
        if (this.statusWord != other.statusWord) return false
        if (this.tagWord != other.tagWord) return false
        if (this.errorOffset != other.errorOffset) return false
        if (this.errorSelector != other.errorSelector) return false
        if (this.dataOffset != other.dataOffset) return false
        if (this.dataSelector != other.dataSelector) return false
        if (!this.registerArea.contentEquals(other.registerArea)) return false
        if (this.cr0NpxState != other.cr0NpxState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.controlWord.hashCode()
        result = 31 * result + this.statusWord.hashCode()
        result = 31 * result + this.tagWord.hashCode()
        result = 31 * result + this.errorOffset.hashCode()
        result = 31 * result + this.errorSelector.hashCode()
        result = 31 * result + this.dataOffset.hashCode()
        result = 31 * result + this.dataSelector.hashCode()
        result = 31 * result + this.registerArea.contentHashCode()
        result = 31 * result + this.cr0NpxState.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FloatingSaveArea> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FloatingSaveArea> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 112L
                override fun readNative(addr: Long): FloatingSaveArea =
                    FloatingSaveArea(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (80).toInt())
                        ).readNative(addr + 28L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 108L),
                    )
                override fun writeNative(addr: Long, value: FloatingSaveArea) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.controlWord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.statusWord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.tagWord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.errorOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.errorSelector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dataOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dataSelector)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (80).toInt())
                    ).writeNative(addr + 28L, value.registerArea.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.cr0NpxState)
                }
            }
    }
}

public class ListEntry internal constructor(
    flinkCtorArg: MutPtr,
    blinkCtorArg: MutPtr,
) {
    public var flink: MutPtr = flinkCtorArg
        internal set

    public var blink: MutPtr = blinkCtorArg
        internal set

    public constructor() : this(
        flinkCtorArg = MutPtr(0L),
        blinkCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.flink

    public operator fun component2(): MutPtr = this.blink

    public fun copy(flink: MutPtr = this.flink, blink: MutPtr = this.blink): ListEntry = ListEntry(flinkCtorArg = flink, blinkCtorArg = blink)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ListEntry) return false
        if (this.flink != other.flink) return false
        if (this.blink != other.blink) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flink.hashCode()
        result = 31 * result + this.blink.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ListEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ListEntry> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ListEntry =
                    ListEntry(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ListEntry) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.flink)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.blink)
                }
            }

        public operator fun invoke(
            flink: MutPtr = MutPtr(0L),
            blink: MutPtr = MutPtr(0L),
        ): ListEntry =
            ListEntry(
                flinkCtorArg = flink,
                blinkCtorArg = blink,
            )
    }
}

public data class ListEntry32(
    public var flink: UInt = 0u,
    public var blink: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ListEntry32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ListEntry32> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ListEntry32 =
                    ListEntry32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ListEntry32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flink)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.blink)
                }
            }
    }
}

public data class ListEntry64(
    public var flink: ULong = 0uL,
    public var blink: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ListEntry64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ListEntry64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): ListEntry64 =
                    ListEntry64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ListEntry64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.flink)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.blink)
                }
            }
    }
}

public class NtTib internal constructor(
    exceptionListCtorArg: MutPtr,
    stackBaseCtorArg: MutPtr,
    stackLimitCtorArg: MutPtr,
    subSystemTibCtorArg: MutPtr,
    public var anonymous: NtTib0,
    arbitraryUserPointerCtorArg: MutPtr,
    selfRefCtorArg: MutPtr,
) {
    public var exceptionList: MutPtr = exceptionListCtorArg
        internal set

    public var stackBase: MutPtr = stackBaseCtorArg
        internal set

    public var stackLimit: MutPtr = stackLimitCtorArg
        internal set

    public var subSystemTib: MutPtr = subSystemTibCtorArg
        internal set

    public var arbitraryUserPointer: MutPtr = arbitraryUserPointerCtorArg
        internal set

    public var selfRef: MutPtr = selfRefCtorArg
        internal set

    public constructor() : this(
        exceptionListCtorArg = MutPtr(0L),
        stackBaseCtorArg = MutPtr(0L),
        stackLimitCtorArg = MutPtr(0L),
        subSystemTibCtorArg = MutPtr(0L),
        anonymous = NtTib0(),
        arbitraryUserPointerCtorArg = MutPtr(0L),
        selfRefCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.exceptionList

    public operator fun component2(): MutPtr = this.stackBase

    public operator fun component3(): MutPtr = this.stackLimit

    public operator fun component4(): MutPtr = this.subSystemTib

    public operator fun component5(): NtTib0 = this.anonymous

    public operator fun component6(): MutPtr = this.arbitraryUserPointer

    public operator fun component7(): MutPtr = this.selfRef

    public fun copy(exceptionList: MutPtr = this.exceptionList, stackBase: MutPtr = this.stackBase, stackLimit: MutPtr = this.stackLimit, subSystemTib: MutPtr = this.subSystemTib, anonymous: NtTib0 = this.anonymous, arbitraryUserPointer: MutPtr = this.arbitraryUserPointer, selfRef: MutPtr = this.selfRef): NtTib = NtTib(exceptionListCtorArg = exceptionList, stackBaseCtorArg = stackBase, stackLimitCtorArg = stackLimit, subSystemTibCtorArg = subSystemTib, anonymous = anonymous, arbitraryUserPointerCtorArg = arbitraryUserPointer, selfRefCtorArg = selfRef)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtTib) return false
        if (this.exceptionList != other.exceptionList) return false
        if (this.stackBase != other.stackBase) return false
        if (this.stackLimit != other.stackLimit) return false
        if (this.subSystemTib != other.subSystemTib) return false
        if (this.anonymous != other.anonymous) return false
        if (this.arbitraryUserPointer != other.arbitraryUserPointer) return false
        if (this.selfRef != other.selfRef) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.exceptionList.hashCode()
        result = 31 * result + this.stackBase.hashCode()
        result = 31 * result + this.stackLimit.hashCode()
        result = 31 * result + this.subSystemTib.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.arbitraryUserPointer.hashCode()
        result = 31 * result + this.selfRef.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            exceptionList: MutPtr = MutPtr(0L),
            stackBase: MutPtr = MutPtr(0L),
            stackLimit: MutPtr = MutPtr(0L),
            subSystemTib: MutPtr = MutPtr(0L),
            anonymous: NtTib0 = NtTib0(),
            arbitraryUserPointer: MutPtr = MutPtr(0L),
            selfRef: MutPtr = MutPtr(0L),
        ): NtTib =
            NtTib(
                exceptionListCtorArg = exceptionList,
                stackBaseCtorArg = stackBase,
                stackLimitCtorArg = stackLimit,
                subSystemTibCtorArg = subSystemTib,
                anonymous = anonymous,
                arbitraryUserPointerCtorArg = arbitraryUserPointer,
                selfRefCtorArg = selfRef,
            )
    }
}

public class NtTib0 internal constructor(
    fiberDataCtorArg: MutPtr,
    public var version: UInt,
) {
    public var fiberData: MutPtr = fiberDataCtorArg
        internal set

    public constructor() : this(
        fiberDataCtorArg = MutPtr(0L),
        version = 0u,
    )

    public operator fun component1(): MutPtr = this.fiberData

    public operator fun component2(): UInt = this.version

    public fun copy(fiberData: MutPtr = this.fiberData, version: UInt = this.version): NtTib0 = NtTib0(fiberDataCtorArg = fiberData, version = version)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtTib0) return false
        if (this.fiberData != other.fiberData) return false
        if (this.version != other.version) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fiberData.hashCode()
        result = 31 * result + this.version.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fiberData: MutPtr = MutPtr(0L),
            version: UInt = 0u,
        ): NtTib0 =
            NtTib0(
                fiberDataCtorArg = fiberData,
                version = version,
            )
    }
}

public data class Objectid(
    public var lineage: Guid = Guid(),
    public var uniquifier: UInt = 0u,
)

public data class ProcessorNumber(
    public var group: UShort = 0u,
    public var number: UByte = 0u,
    public var reserved: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessorNumber> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessorNumber> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ProcessorNumber =
                    ProcessorNumber(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: ProcessorNumber) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.group)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.number)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.reserved)
                }
            }
    }
}

public data class Quad(
    public var anonymous: Quad0 = Quad0(),
)

public data class Quad0(
    public var useThisFieldToCopy: Long = 0L,
    public var doNotUseThisField: Double = 0.0,
)

public data class RtlBalancedNode(
    public var anonymous1: RtlBalancedNode0 = RtlBalancedNode0(),
    public var anonymous2: RtlBalancedNode1 = RtlBalancedNode1(),
)

public class RtlBalancedNode0 internal constructor(
    childrenCtorArg: List<MutPtr>,
    public var anonymous: RtlBalancedNode00,
) {
    public var children: List<MutPtr> = childrenCtorArg
        internal set

    public constructor() : this(
        childrenCtorArg = List(2) { MutPtr(0L) },
        anonymous = RtlBalancedNode00(),
    )

    public operator fun component1(): List<MutPtr> = this.children

    public operator fun component2(): RtlBalancedNode00 = this.anonymous

    public fun copy(children: List<MutPtr> = this.children, anonymous: RtlBalancedNode00 = this.anonymous): RtlBalancedNode0 = RtlBalancedNode0(childrenCtorArg = children, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtlBalancedNode0) return false
        if (this.children != other.children) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.children.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            children: List<MutPtr> = List(2) { MutPtr(0L) },
            anonymous: RtlBalancedNode00 = RtlBalancedNode00(),
        ): RtlBalancedNode0 =
            RtlBalancedNode0(
                childrenCtorArg = children,
                anonymous = anonymous,
            )
    }
}

public class RtlBalancedNode00 internal constructor(
    leftCtorArg: MutPtr,
    rightCtorArg: MutPtr,
) {
    public var left: MutPtr = leftCtorArg
        internal set

    public var right: MutPtr = rightCtorArg
        internal set

    public constructor() : this(
        leftCtorArg = MutPtr(0L),
        rightCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.left

    public operator fun component2(): MutPtr = this.right

    public fun copy(left: MutPtr = this.left, right: MutPtr = this.right): RtlBalancedNode00 = RtlBalancedNode00(leftCtorArg = left, rightCtorArg = right)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtlBalancedNode00) return false
        if (this.left != other.left) return false
        if (this.right != other.right) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.left.hashCode()
        result = 31 * result + this.right.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtlBalancedNode00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtlBalancedNode00> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): RtlBalancedNode00 =
                    RtlBalancedNode00(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: RtlBalancedNode00) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.left)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.right)
                }
            }

        public operator fun invoke(
            left: MutPtr = MutPtr(0L),
            right: MutPtr = MutPtr(0L),
        ): RtlBalancedNode00 =
            RtlBalancedNode00(
                leftCtorArg = left,
                rightCtorArg = right,
            )
    }
}

public data class RtlBalancedNode1(
    public var bitfield: UByte = 0u,
    public var parentValue: Int = 0,
)

public class SingleListEntry internal constructor(
    nextCtorArg: MutPtr,
) {
    public var next: MutPtr = nextCtorArg
        internal set

    public constructor() : this(
        nextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.next

    public fun copy(next: MutPtr = this.next): SingleListEntry = SingleListEntry(nextCtorArg = next)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SingleListEntry) return false
        if (this.next != other.next) return false
        return true
    }

    override fun hashCode(): Int = this.next.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SingleListEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SingleListEntry> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SingleListEntry =
                    SingleListEntry(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SingleListEntry) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.next)
                }
            }

        public operator fun invoke(
            next: MutPtr = MutPtr(0L),
        ): SingleListEntry =
            SingleListEntry(
                nextCtorArg = next,
            )
    }
}

public data class SingleListEntry32(
    public var next: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SingleListEntry32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SingleListEntry32> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): SingleListEntry32 =
                    SingleListEntry32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SingleListEntry32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.next)
                }
            }
    }
}

public class SlistEntry internal constructor(
    nextCtorArg: MutPtr,
) {
    public var next: MutPtr = nextCtorArg
        internal set

    public constructor() : this(
        nextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.next

    public fun copy(next: MutPtr = this.next): SlistEntry = SlistEntry(nextCtorArg = next)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SlistEntry) return false
        if (this.next != other.next) return false
        return true
    }

    override fun hashCode(): Int = this.next.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SlistEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SlistEntry> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SlistEntry =
                    SlistEntry(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SlistEntry) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.next)
                }
            }

        public operator fun invoke(
            next: MutPtr = MutPtr(0L),
        ): SlistEntry =
            SlistEntry(
                nextCtorArg = next,
            )
    }
}

public data class SlistHeader(
    public var anonymous: SlistHeader0 = SlistHeader0(),
    public var headerX64: SlistHeader1 = SlistHeader1(),
)

public data class SlistHeader0(
    public var alignment: ULong = 0uL,
    public var region: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SlistHeader0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SlistHeader0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SlistHeader0 =
                    SlistHeader0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SlistHeader0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.alignment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.region)
                }
            }
    }
}

public data class SlistHeader1(
    public var bitfield1: ULong = 0uL,
    public var bitfield2: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SlistHeader1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SlistHeader1> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SlistHeader1 =
                    SlistHeader1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SlistHeader1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.bitfield2)
                }
            }
    }
}

public class String internal constructor(
    public var length: UShort,
    public var maximumLength: UShort,
    bufferCtorArg: Pstr,
) {
    public var buffer: Pstr = bufferCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        maximumLength = 0u,
        bufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.length

    public operator fun component2(): UShort = this.maximumLength

    public operator fun component3(): Pstr = this.buffer

    public fun copy(length: UShort = this.length, maximumLength: UShort = this.maximumLength, buffer: Pstr = this.buffer): String = String(length = length, maximumLength = maximumLength, bufferCtorArg = buffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is String) return false
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
            buffer: Pstr = MutPtr(0L),
        ): String =
            String(
                length = length,
                maximumLength = maximumLength,
                bufferCtorArg = buffer,
            )
    }
}

public data class String32(
    public var length: UShort = 0u,
    public var maximumLength: UShort = 0u,
    public var buffer: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<String32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<String32> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): String32 =
                    String32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: String32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.maximumLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.buffer)
                }
            }
    }
}

public data class String64(
    public var length: UShort = 0u,
    public var maximumLength: UShort = 0u,
    public var buffer: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<String64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<String64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): String64 =
                    String64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: String64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.maximumLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.buffer)
                }
            }
    }
}

public data class WnfStateName(
    public var data: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is WnfStateName) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int = this.data.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WnfStateName> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WnfStateName> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): WnfStateName =
                    WnfStateName(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                        ).readNative(addr).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: WnfStateName) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                    ).writeNative(addr, value.data.toList())
                }
            }
    }
}
