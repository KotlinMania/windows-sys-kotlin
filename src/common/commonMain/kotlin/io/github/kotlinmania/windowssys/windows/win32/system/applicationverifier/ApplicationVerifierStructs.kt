@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.applicationverifier

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
}

public data class AvrfHandleOperation(
    public var handle: ULong = 0uL,
    public var processId: UInt = 0u,
    public var threadId: UInt = 0u,
    public var operationType: UInt = 0u,
    public var spare0: UInt = 0u,
    public var backTraceInformation: AvrfBacktraceInformation = AvrfBacktraceInformation(),
)

public data class AvrfHeapAllocation(
    public var heapHandle: ULong = 0uL,
    public var userAllocation: ULong = 0uL,
    public var userAllocationSize: ULong = 0uL,
    public var allocation: ULong = 0uL,
    public var allocationSize: ULong = 0uL,
    public var userAllocationState: UInt = 0u,
    public var heapState: UInt = 0u,
    public var heapContext: ULong = 0uL,
    public var backTraceInformation: AvrfBacktraceInformation? = null,
)
