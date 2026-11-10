@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.memory

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public data class CfgCallTargetInfo(
    public var offset: Int = 0,
    public var flags: Int = 0,
)

public data class HeapSummary(
    public var cb: UInt = 0u,
    public var cbAllocated: Int = 0,
    public var cbCommitted: Int = 0,
    public var cbReserved: Int = 0,
    public var cbMaxReserve: Int = 0,
)

public data class MemoryBasicInformation(
    public var baseAddress: COpaquePointer? = null,
    public var allocationBase: COpaquePointer? = null,
    public var allocationProtect: PageProtectionFlags = 0u,
    public var partitionId: UShort = 0u,
    public var regionSize: Int = 0,
    public var state: VirtualAllocationType = 0u,
    public var protect: PageProtectionFlags = 0u,
    public var type: PageType = 0u,
)

public data class MemoryBasicInformation32(
    public var baseAddress: UInt = 0u,
    public var allocationBase: UInt = 0u,
    public var allocationProtect: PageProtectionFlags = 0u,
    public var regionSize: UInt = 0u,
    public var state: VirtualAllocationType = 0u,
    public var protect: PageProtectionFlags = 0u,
    public var type: PageType = 0u,
)

public data class MemoryBasicInformation64(
    public var baseAddress: ULong = 0uL,
    public var allocationBase: ULong = 0uL,
    public var allocationProtect: PageProtectionFlags = 0u,
    public var alignment1: UInt = 0u,
    public var regionSize: ULong = 0uL,
    public var state: VirtualAllocationType = 0u,
    public var protect: PageProtectionFlags = 0u,
    public var type: PageType = 0u,
    public var alignment2: UInt = 0u,
)

public data class MemoryMappedViewAddress(
    public var value: COpaquePointer? = null,
)

public data class MemoryPartitionDedicatedMemoryAttribute(
    public var type: MemDedicatedAttributeType = 0,
    public var reserved: UInt = 0u,
    public var value: ULong = 0uL,
)

public data class MemoryPartitionDedicatedMemoryInformation(
    public var nextEntryOffset: UInt = 0u,
    public var sizeOfInformation: UInt = 0u,
    public var flags: UInt = 0u,
    public var attributesOffset: UInt = 0u,
    public var attributeCount: UInt = 0u,
    public var reserved: UInt = 0u,
    public var typeId: ULong = 0uL,
)

public data class MemAddressRequirements(
    public var lowestStartingAddress: COpaquePointer? = null,
    public var highestEndingAddress: COpaquePointer? = null,
    public var alignment: Int = 0,
)

public data class MemExtendedParameter(
    public var anonymous1: MemExtendedParameter0 = MemExtendedParameter0(),
    public var anonymous2: MemExtendedParameter1 = MemExtendedParameter1(),
)

public data class MemExtendedParameter0(
    public var bitfield: ULong = 0uL,
)

public data class MemExtendedParameter1(
    public var uLong64: ULong = 0uL,
    public var pointer: COpaquePointer? = null,
    public var size: Int = 0,
    public var handle: Handle = null,
    public var uLong: UInt = 0u,
)

public data class ProcessHeapEntry(
    public var lpData: COpaquePointer? = null,
    public var cbData: UInt = 0u,
    public var cbOverhead: UByte = 0u,
    public var iRegionIndex: UByte = 0u,
    public var wFlags: UShort = 0u,
    public var anonymous: ProcessHeapEntry0 = ProcessHeapEntry0(),
)

public data class ProcessHeapEntry0(
    public var block: ProcessHeapEntry00 = ProcessHeapEntry00(),
    public var region: ProcessHeapEntry01 = ProcessHeapEntry01(),
)

public data class ProcessHeapEntry00(
    public var hMem: Handle = null,
    public var dwReserved: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcessHeapEntry00) return false
        if (this.hMem != other.hMem) return false
        if (!this.dwReserved.contentEquals(other.dwReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hMem.hashCode()
        result = 31 * result + this.dwReserved.contentHashCode()
        return result
    }
}

public data class ProcessHeapEntry01(
    public var dwCommittedSize: UInt = 0u,
    public var dwUnCommittedSize: UInt = 0u,
    public var lpFirstBlock: COpaquePointer? = null,
    public var lpLastBlock: COpaquePointer? = null,
)

public class Win32MemoryPartitionInformation(
    public var flags: UInt = 0u,
    public var numaNode: UInt = 0u,
    public var channel: UInt = 0u,
    public var numberOfNumaNodes: UInt = 0u,
    public var residentAvailablePages: ULong = 0uL,
    public var committedPages: ULong = 0uL,
    public var commitLimit: ULong = 0uL,
    public var peakCommitment: ULong = 0uL,
    public var totalNumberOfPages: ULong = 0uL,
    public var availablePages: ULong = 0uL,
    public var zeroPages: ULong = 0uL,
    public var freePages: ULong = 0uL,
    public var standbyPages: ULong = 0uL,
    public var reserved: ULongArray = ULongArray(16),
    public var maximumCommitLimit: ULong = 0uL,
    public var reserved2: ULong = 0uL,
    public var partitionId: UInt = 0u,
)

public data class Win32MemoryRangeEntry(
    public var virtualAddress: COpaquePointer? = null,
    public var numberOfBytes: Int = 0,
)

public data class Win32MemoryRegionInformation(
    public var allocationBase: COpaquePointer? = null,
    public var allocationProtect: UInt = 0u,
    public var anonymous: Win32MemoryRegionInformation0 = Win32MemoryRegionInformation0(),
    public var regionSize: Int = 0,
    public var commitSize: Int = 0,
)

public data class Win32MemoryRegionInformation0(
    public var flags: UInt = 0u,
    public var anonymous: Win32MemoryRegionInformation00 = Win32MemoryRegionInformation00(),
)

public data class Win32MemoryRegionInformation00(
    public var bitfield: UInt = 0u,
)
