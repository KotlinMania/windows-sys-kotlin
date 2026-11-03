@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.applicationverifier

public data class AVRF_BACKTRACE_INFORMATION(
    public var Depth: UInt = 0u,
    public var Index: UInt = 0u,
    public var ReturnAddresses: ULongArray = ULongArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AVRF_BACKTRACE_INFORMATION) return false
        if (this.Depth != other.Depth) return false
        if (this.Index != other.Index) return false
        if (!this.ReturnAddresses.contentEquals(other.ReturnAddresses)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Depth.hashCode()
        result = 31 * result + this.Index.hashCode()
        result = 31 * result + this.ReturnAddresses.contentHashCode()
        return result
    }
}

public data class AVRF_HANDLE_OPERATION(
    public var Handle: ULong = 0uL,
    public var ProcessId: UInt = 0u,
    public var ThreadId: UInt = 0u,
    public var OperationType: UInt = 0u,
    public var Spare0: UInt = 0u,
    public var BackTraceInformation: AVRF_BACKTRACE_INFORMATION = AVRF_BACKTRACE_INFORMATION(),
)

public data class AVRF_HEAP_ALLOCATION(
    public var HeapHandle: ULong = 0uL,
    public var UserAllocation: ULong = 0uL,
    public var UserAllocationSize: ULong = 0uL,
    public var Allocation: ULong = 0uL,
    public var AllocationSize: ULong = 0uL,
    public var UserAllocationState: UInt = 0u,
    public var HeapState: UInt = 0u,
    public var HeapContext: ULong = 0uL,
    public var BackTraceInformation: Long = 0L,
)
