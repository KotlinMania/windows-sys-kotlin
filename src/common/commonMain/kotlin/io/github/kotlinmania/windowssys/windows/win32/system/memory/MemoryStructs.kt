@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.memory

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public data class CFG_CALL_TARGET_INFO(public var Offset: ULong = 0uL, public var Flags: ULong = 0uL)

public data class HEAP_SUMMARY(
    public var cb: UInt = 0u,
    public var cbAllocated: ULong = 0uL,
    public var cbCommitted: ULong = 0uL,
    public var cbReserved: ULong = 0uL,
    public var cbMaxReserve: ULong = 0uL,
)

public data class MEMORY_BASIC_INFORMATION(
    public var BaseAddress: Long = 0L,
    public var AllocationBase: Long = 0L,
    public var AllocationProtect: PAGE_PROTECTION_FLAGS = 0u,
    public var PartitionId: UShort = 0u,
    public var RegionSize: ULong = 0uL,
    public var State: VIRTUAL_ALLOCATION_TYPE = 0u,
    public var Protect: PAGE_PROTECTION_FLAGS = 0u,
    public var Type: PAGE_TYPE = 0u,
)

public data class MEMORY_BASIC_INFORMATION32(
    public var BaseAddress: UInt = 0u,
    public var AllocationBase: UInt = 0u,
    public var AllocationProtect: PAGE_PROTECTION_FLAGS = 0u,
    public var RegionSize: UInt = 0u,
    public var State: VIRTUAL_ALLOCATION_TYPE = 0u,
    public var Protect: PAGE_PROTECTION_FLAGS = 0u,
    public var Type: PAGE_TYPE = 0u,
)

public data class MEMORY_BASIC_INFORMATION64(
    public var BaseAddress: ULong = 0uL,
    public var AllocationBase: ULong = 0uL,
    public var AllocationProtect: PAGE_PROTECTION_FLAGS = 0u,
    public var __alignment1: UInt = 0u,
    public var RegionSize: ULong = 0uL,
    public var State: VIRTUAL_ALLOCATION_TYPE = 0u,
    public var Protect: PAGE_PROTECTION_FLAGS = 0u,
    public var Type: PAGE_TYPE = 0u,
    public var __alignment2: UInt = 0u,
)

public data class MEMORY_MAPPED_VIEW_ADDRESS(public var Value: Long = 0L)

public data class MEMORY_PARTITION_DEDICATED_MEMORY_ATTRIBUTE(
    public var Type: MEM_DEDICATED_ATTRIBUTE_TYPE = 0,
    public var Reserved: UInt = 0u,
    public var Value: ULong = 0uL,
)

public data class MEMORY_PARTITION_DEDICATED_MEMORY_INFORMATION(
    public var NextEntryOffset: UInt = 0u,
    public var SizeOfInformation: UInt = 0u,
    public var Flags: UInt = 0u,
    public var AttributesOffset: UInt = 0u,
    public var AttributeCount: UInt = 0u,
    public var Reserved: UInt = 0u,
    public var TypeId: ULong = 0uL,
)

public data class MEM_ADDRESS_REQUIREMENTS(
    public var LowestStartingAddress: Long = 0L,
    public var HighestEndingAddress: Long = 0L,
    public var Alignment: ULong = 0uL,
)

public data class MEM_EXTENDED_PARAMETER(public var Anonymous1: MEM_EXTENDED_PARAMETER_0 = MEM_EXTENDED_PARAMETER_0(), public var Anonymous2: MEM_EXTENDED_PARAMETER_1 = MEM_EXTENDED_PARAMETER_1())

public data class MEM_EXTENDED_PARAMETER_0(public var _bitfield: ULong = 0uL)

public data class MEM_EXTENDED_PARAMETER_1(
    public var ULong64: ULong = 0uL,
    public var Pointer: Long = 0L,
    public var Size: ULong = 0uL,
    public var Handle: HANDLE = 0L,
    public var ULong: UInt = 0u,
)

public data class PROCESS_HEAP_ENTRY(
    public var lpData: Long = 0L,
    public var cbData: UInt = 0u,
    public var cbOverhead: UByte = 0u,
    public var iRegionIndex: UByte = 0u,
    public var wFlags: UShort = 0u,
    public var Anonymous: PROCESS_HEAP_ENTRY_0 = PROCESS_HEAP_ENTRY_0(),
)

public data class PROCESS_HEAP_ENTRY_0(public var Block: PROCESS_HEAP_ENTRY_0_0 = PROCESS_HEAP_ENTRY_0_0(), public var Region: PROCESS_HEAP_ENTRY_0_1 = PROCESS_HEAP_ENTRY_0_1())

public data class PROCESS_HEAP_ENTRY_0_0(public var hMem: HANDLE = 0L, public var dwReserved: UIntArray = UIntArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PROCESS_HEAP_ENTRY_0_0) return false
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

public data class PROCESS_HEAP_ENTRY_0_1(
    public var dwCommittedSize: UInt = 0u,
    public var dwUnCommittedSize: UInt = 0u,
    public var lpFirstBlock: Long = 0L,
    public var lpLastBlock: Long = 0L,
)

public class WIN32_MEMORY_PARTITION_INFORMATION(
    public var Flags: UInt = 0u,
    public var NumaNode: UInt = 0u,
    public var Channel: UInt = 0u,
    public var NumberOfNumaNodes: UInt = 0u,
    public var ResidentAvailablePages: ULong = 0uL,
    public var CommittedPages: ULong = 0uL,
    public var CommitLimit: ULong = 0uL,
    public var PeakCommitment: ULong = 0uL,
    public var TotalNumberOfPages: ULong = 0uL,
    public var AvailablePages: ULong = 0uL,
    public var ZeroPages: ULong = 0uL,
    public var FreePages: ULong = 0uL,
    public var StandbyPages: ULong = 0uL,
    public var Reserved: ULongArray = ULongArray(16),
    public var MaximumCommitLimit: ULong = 0uL,
    public var Reserved2: ULong = 0uL,
    public var PartitionId: UInt = 0u,
)

public data class WIN32_MEMORY_RANGE_ENTRY(public var VirtualAddress: Long = 0L, public var NumberOfBytes: ULong = 0uL)

public data class WIN32_MEMORY_REGION_INFORMATION(
    public var AllocationBase: Long = 0L,
    public var AllocationProtect: UInt = 0u,
    public var Anonymous: WIN32_MEMORY_REGION_INFORMATION_0 = WIN32_MEMORY_REGION_INFORMATION_0(),
    public var RegionSize: ULong = 0uL,
    public var CommitSize: ULong = 0uL,
)

public data class WIN32_MEMORY_REGION_INFORMATION_0(public var Flags: UInt = 0u, public var Anonymous: WIN32_MEMORY_REGION_INFORMATION_0_0 = WIN32_MEMORY_REGION_INFORMATION_0_0())

public data class WIN32_MEMORY_REGION_INFORMATION_0_0(public var _bitfield: UInt = 0u)
