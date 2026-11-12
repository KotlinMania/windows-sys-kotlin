@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.applicationverifier

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public data class AvrfBacktraceInformation(
    public var depth: UInt = 0u,
    public var index: UInt = 0u,
    public var returnAddresses: ULongArray = ULongArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AvrfBacktraceInformation) return false
        if (this.depth != other.depth) return false
        if (this.index != other.index) return false
        if (!this.returnAddresses.contentEquals(other.returnAddresses)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.depth.hashCode()
        result = 31 * result + this.index.hashCode()
        result = 31 * result + this.returnAddresses.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AvrfBacktraceInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AvrfBacktraceInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 264L
                override fun readNative(addr: Long): AvrfBacktraceInformation =
                    AvrfBacktraceInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (32).toInt())
                        ).readNative(addr + 8L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: AvrfBacktraceInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.depth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.index)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (32).toInt())
                    ).writeNative(addr + 8L, value.returnAddresses.toList())
                }
            }
    }
}

public data class AvrfHandleOperation(
    public var handle: ULong = 0uL,
    public var processId: UInt = 0u,
    public var threadId: UInt = 0u,
    public var operationType: UInt = 0u,
    public var spare0: UInt = 0u,
    public var backTraceInformation: AvrfBacktraceInformation = AvrfBacktraceInformation(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AvrfHandleOperation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AvrfHandleOperation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 288L
                override fun readNative(addr: Long): AvrfHandleOperation =
                    AvrfHandleOperation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (AvrfBacktraceInformation.typeLayout()).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: AvrfHandleOperation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.handle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.processId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.threadId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.operationType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.spare0)
                    (AvrfBacktraceInformation.typeLayout()).writeNative(addr + 24L, value.backTraceInformation)
                }
            }
    }
}

public class AvrfHeapAllocation internal constructor(
    public var heapHandle: ULong,
    public var userAllocation: ULong,
    public var userAllocationSize: ULong,
    public var allocation: ULong,
    public var allocationSize: ULong,
    public var userAllocationState: UInt,
    public var heapState: UInt,
    public var heapContext: ULong,
    backTraceInformationCtorArg: MutPtr,
) {
    public var backTraceInformation: MutPtr = backTraceInformationCtorArg
        internal set

    public constructor() : this(
        heapHandle = 0uL,
        userAllocation = 0uL,
        userAllocationSize = 0uL,
        allocation = 0uL,
        allocationSize = 0uL,
        userAllocationState = 0u,
        heapState = 0u,
        heapContext = 0uL,
        backTraceInformationCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ULong = this.heapHandle

    public operator fun component2(): ULong = this.userAllocation

    public operator fun component3(): ULong = this.userAllocationSize

    public operator fun component4(): ULong = this.allocation

    public operator fun component5(): ULong = this.allocationSize

    public operator fun component6(): UInt = this.userAllocationState

    public operator fun component7(): UInt = this.heapState

    public operator fun component8(): ULong = this.heapContext

    public operator fun component9(): MutPtr = this.backTraceInformation

    public fun copy(heapHandle: ULong = this.heapHandle, userAllocation: ULong = this.userAllocation, userAllocationSize: ULong = this.userAllocationSize, allocation: ULong = this.allocation, allocationSize: ULong = this.allocationSize, userAllocationState: UInt = this.userAllocationState, heapState: UInt = this.heapState, heapContext: ULong = this.heapContext, backTraceInformation: MutPtr = this.backTraceInformation): AvrfHeapAllocation = AvrfHeapAllocation(heapHandle = heapHandle, userAllocation = userAllocation, userAllocationSize = userAllocationSize, allocation = allocation, allocationSize = allocationSize, userAllocationState = userAllocationState, heapState = heapState, heapContext = heapContext, backTraceInformationCtorArg = backTraceInformation)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AvrfHeapAllocation) return false
        if (this.heapHandle != other.heapHandle) return false
        if (this.userAllocation != other.userAllocation) return false
        if (this.userAllocationSize != other.userAllocationSize) return false
        if (this.allocation != other.allocation) return false
        if (this.allocationSize != other.allocationSize) return false
        if (this.userAllocationState != other.userAllocationState) return false
        if (this.heapState != other.heapState) return false
        if (this.heapContext != other.heapContext) return false
        if (this.backTraceInformation != other.backTraceInformation) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.heapHandle.hashCode()
        result = 31 * result + this.userAllocation.hashCode()
        result = 31 * result + this.userAllocationSize.hashCode()
        result = 31 * result + this.allocation.hashCode()
        result = 31 * result + this.allocationSize.hashCode()
        result = 31 * result + this.userAllocationState.hashCode()
        result = 31 * result + this.heapState.hashCode()
        result = 31 * result + this.heapContext.hashCode()
        result = 31 * result + this.backTraceInformation.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AvrfHeapAllocation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AvrfHeapAllocation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): AvrfHeapAllocation =
                    AvrfHeapAllocation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: AvrfHeapAllocation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.heapHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.userAllocation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.userAllocationSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.allocation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.allocationSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.userAllocationState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.heapState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.heapContext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 56L, value.backTraceInformation)
                }
            }

        public operator fun invoke(
            heapHandle: ULong = 0uL,
            userAllocation: ULong = 0uL,
            userAllocationSize: ULong = 0uL,
            allocation: ULong = 0uL,
            allocationSize: ULong = 0uL,
            userAllocationState: UInt = 0u,
            heapState: UInt = 0u,
            heapContext: ULong = 0uL,
            backTraceInformation: MutPtr = MutPtr(0L),
        ): AvrfHeapAllocation =
            AvrfHeapAllocation(
                heapHandle = heapHandle,
                userAllocation = userAllocation,
                userAllocationSize = userAllocationSize,
                allocation = allocation,
                allocationSize = allocationSize,
                userAllocationState = userAllocationState,
                heapState = heapState,
                heapContext = heapContext,
                backTraceInformationCtorArg = backTraceInformation,
            )
    }
}
