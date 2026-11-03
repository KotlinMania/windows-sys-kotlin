@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.systeminformation

public data class CACHE_DESCRIPTOR(
    public var Level: UByte = 0u,
    public var Associativity: UByte = 0u,
    public var LineSize: UShort = 0u,
    public var Size: UInt = 0u,
    public var Type: PROCESSOR_CACHE_TYPE = 0,
)

public data class CACHE_RELATIONSHIP(
    public var Level: UByte = 0u,
    public var Associativity: UByte = 0u,
    public var LineSize: UShort = 0u,
    public var CacheSize: UInt = 0u,
    public var Type: PROCESSOR_CACHE_TYPE = 0,
    public var Reserved: UByteArray = UByteArray(18),
    public var GroupCount: UShort = 0u,
    public var Anonymous: CACHE_RELATIONSHIP_0 = CACHE_RELATIONSHIP_0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CACHE_RELATIONSHIP) return false
        if (this.Level != other.Level) return false
        if (this.Associativity != other.Associativity) return false
        if (this.LineSize != other.LineSize) return false
        if (this.CacheSize != other.CacheSize) return false
        if (this.Type != other.Type) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.GroupCount != other.GroupCount) return false
        if (this.Anonymous != other.Anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Level.hashCode()
        result = 31 * result + this.Associativity.hashCode()
        result = 31 * result + this.LineSize.hashCode()
        result = 31 * result + this.CacheSize.hashCode()
        result = 31 * result + this.Type.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.GroupCount.hashCode()
        result = 31 * result + this.Anonymous.hashCode()
        return result
    }
}

public data class CACHE_RELATIONSHIP_0(public var GroupMask: GROUP_AFFINITY = GROUP_AFFINITY(), public var GroupMasks: List<GROUP_AFFINITY> = List(1) { GROUP_AFFINITY() })

public data class GROUP_AFFINITY(
    public var Mask: ULong = 0uL,
    public var Group: UShort = 0u,
    public var Reserved: UShortArray = UShortArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GROUP_AFFINITY) return false
        if (this.Mask != other.Mask) return false
        if (this.Group != other.Group) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Mask.hashCode()
        result = 31 * result + this.Group.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class GROUP_RELATIONSHIP(
    public var MaximumGroupCount: UShort = 0u,
    public var ActiveGroupCount: UShort = 0u,
    public var Reserved: UByteArray = UByteArray(20),
    public var GroupInfo: List<PROCESSOR_GROUP_INFO> = List(1) { PROCESSOR_GROUP_INFO() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GROUP_RELATIONSHIP) return false
        if (this.MaximumGroupCount != other.MaximumGroupCount) return false
        if (this.ActiveGroupCount != other.ActiveGroupCount) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.GroupInfo != other.GroupInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MaximumGroupCount.hashCode()
        result = 31 * result + this.ActiveGroupCount.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.GroupInfo.hashCode()
        return result
    }
}

public data class MEMORYSTATUS(
    public var dwLength: UInt = 0u,
    public var dwMemoryLoad: UInt = 0u,
    public var dwTotalPhys: ULong = 0uL,
    public var dwAvailPhys: ULong = 0uL,
    public var dwTotalPageFile: ULong = 0uL,
    public var dwAvailPageFile: ULong = 0uL,
    public var dwTotalVirtual: ULong = 0uL,
    public var dwAvailVirtual: ULong = 0uL,
)

public data class MEMORYSTATUSEX(
    public var dwLength: UInt = 0u,
    public var dwMemoryLoad: UInt = 0u,
    public var ullTotalPhys: ULong = 0uL,
    public var ullAvailPhys: ULong = 0uL,
    public var ullTotalPageFile: ULong = 0uL,
    public var ullAvailPageFile: ULong = 0uL,
    public var ullTotalVirtual: ULong = 0uL,
    public var ullAvailVirtual: ULong = 0uL,
    public var ullAvailExtendedVirtual: ULong = 0uL,
)

public data class NUMA_NODE_RELATIONSHIP(
    public var NodeNumber: UInt = 0u,
    public var Reserved: UByteArray = UByteArray(18),
    public var GroupCount: UShort = 0u,
    public var Anonymous: NUMA_NODE_RELATIONSHIP_0 = NUMA_NODE_RELATIONSHIP_0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NUMA_NODE_RELATIONSHIP) return false
        if (this.NodeNumber != other.NodeNumber) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.GroupCount != other.GroupCount) return false
        if (this.Anonymous != other.Anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NodeNumber.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.GroupCount.hashCode()
        result = 31 * result + this.Anonymous.hashCode()
        return result
    }
}

public data class NUMA_NODE_RELATIONSHIP_0(public var GroupMask: GROUP_AFFINITY = GROUP_AFFINITY(), public var GroupMasks: List<GROUP_AFFINITY> = List(1) { GROUP_AFFINITY() })

public data class OSVERSIONINFOA(
    public var dwOSVersionInfoSize: UInt = 0u,
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
    public var dwBuildNumber: UInt = 0u,
    public var dwPlatformId: UInt = 0u,
    public var szCSDVersion: ByteArray = ByteArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OSVERSIONINFOA) return false
        if (this.dwOSVersionInfoSize != other.dwOSVersionInfoSize) return false
        if (this.dwMajorVersion != other.dwMajorVersion) return false
        if (this.dwMinorVersion != other.dwMinorVersion) return false
        if (this.dwBuildNumber != other.dwBuildNumber) return false
        if (this.dwPlatformId != other.dwPlatformId) return false
        if (!this.szCSDVersion.contentEquals(other.szCSDVersion)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwOSVersionInfoSize.hashCode()
        result = 31 * result + this.dwMajorVersion.hashCode()
        result = 31 * result + this.dwMinorVersion.hashCode()
        result = 31 * result + this.dwBuildNumber.hashCode()
        result = 31 * result + this.dwPlatformId.hashCode()
        result = 31 * result + this.szCSDVersion.contentHashCode()
        return result
    }
}

public data class OSVERSIONINFOEXA(
    public var dwOSVersionInfoSize: UInt = 0u,
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
    public var dwBuildNumber: UInt = 0u,
    public var dwPlatformId: UInt = 0u,
    public var szCSDVersion: ByteArray = ByteArray(128),
    public var wServicePackMajor: UShort = 0u,
    public var wServicePackMinor: UShort = 0u,
    public var wSuiteMask: UShort = 0u,
    public var wProductType: UByte = 0u,
    public var wReserved: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OSVERSIONINFOEXA) return false
        if (this.dwOSVersionInfoSize != other.dwOSVersionInfoSize) return false
        if (this.dwMajorVersion != other.dwMajorVersion) return false
        if (this.dwMinorVersion != other.dwMinorVersion) return false
        if (this.dwBuildNumber != other.dwBuildNumber) return false
        if (this.dwPlatformId != other.dwPlatformId) return false
        if (!this.szCSDVersion.contentEquals(other.szCSDVersion)) return false
        if (this.wServicePackMajor != other.wServicePackMajor) return false
        if (this.wServicePackMinor != other.wServicePackMinor) return false
        if (this.wSuiteMask != other.wSuiteMask) return false
        if (this.wProductType != other.wProductType) return false
        if (this.wReserved != other.wReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwOSVersionInfoSize.hashCode()
        result = 31 * result + this.dwMajorVersion.hashCode()
        result = 31 * result + this.dwMinorVersion.hashCode()
        result = 31 * result + this.dwBuildNumber.hashCode()
        result = 31 * result + this.dwPlatformId.hashCode()
        result = 31 * result + this.szCSDVersion.contentHashCode()
        result = 31 * result + this.wServicePackMajor.hashCode()
        result = 31 * result + this.wServicePackMinor.hashCode()
        result = 31 * result + this.wSuiteMask.hashCode()
        result = 31 * result + this.wProductType.hashCode()
        result = 31 * result + this.wReserved.hashCode()
        return result
    }
}

public data class OSVERSIONINFOEXW(
    public var dwOSVersionInfoSize: UInt = 0u,
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
    public var dwBuildNumber: UInt = 0u,
    public var dwPlatformId: UInt = 0u,
    public var szCSDVersion: UShortArray = UShortArray(128),
    public var wServicePackMajor: UShort = 0u,
    public var wServicePackMinor: UShort = 0u,
    public var wSuiteMask: UShort = 0u,
    public var wProductType: UByte = 0u,
    public var wReserved: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OSVERSIONINFOEXW) return false
        if (this.dwOSVersionInfoSize != other.dwOSVersionInfoSize) return false
        if (this.dwMajorVersion != other.dwMajorVersion) return false
        if (this.dwMinorVersion != other.dwMinorVersion) return false
        if (this.dwBuildNumber != other.dwBuildNumber) return false
        if (this.dwPlatformId != other.dwPlatformId) return false
        if (!this.szCSDVersion.contentEquals(other.szCSDVersion)) return false
        if (this.wServicePackMajor != other.wServicePackMajor) return false
        if (this.wServicePackMinor != other.wServicePackMinor) return false
        if (this.wSuiteMask != other.wSuiteMask) return false
        if (this.wProductType != other.wProductType) return false
        if (this.wReserved != other.wReserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwOSVersionInfoSize.hashCode()
        result = 31 * result + this.dwMajorVersion.hashCode()
        result = 31 * result + this.dwMinorVersion.hashCode()
        result = 31 * result + this.dwBuildNumber.hashCode()
        result = 31 * result + this.dwPlatformId.hashCode()
        result = 31 * result + this.szCSDVersion.contentHashCode()
        result = 31 * result + this.wServicePackMajor.hashCode()
        result = 31 * result + this.wServicePackMinor.hashCode()
        result = 31 * result + this.wSuiteMask.hashCode()
        result = 31 * result + this.wProductType.hashCode()
        result = 31 * result + this.wReserved.hashCode()
        return result
    }
}

public data class OSVERSIONINFOW(
    public var dwOSVersionInfoSize: UInt = 0u,
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
    public var dwBuildNumber: UInt = 0u,
    public var dwPlatformId: UInt = 0u,
    public var szCSDVersion: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OSVERSIONINFOW) return false
        if (this.dwOSVersionInfoSize != other.dwOSVersionInfoSize) return false
        if (this.dwMajorVersion != other.dwMajorVersion) return false
        if (this.dwMinorVersion != other.dwMinorVersion) return false
        if (this.dwBuildNumber != other.dwBuildNumber) return false
        if (this.dwPlatformId != other.dwPlatformId) return false
        if (!this.szCSDVersion.contentEquals(other.szCSDVersion)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwOSVersionInfoSize.hashCode()
        result = 31 * result + this.dwMajorVersion.hashCode()
        result = 31 * result + this.dwMinorVersion.hashCode()
        result = 31 * result + this.dwBuildNumber.hashCode()
        result = 31 * result + this.dwPlatformId.hashCode()
        result = 31 * result + this.szCSDVersion.contentHashCode()
        return result
    }
}

public data class PROCESSOR_GROUP_INFO(
    public var MaximumProcessorCount: UByte = 0u,
    public var ActiveProcessorCount: UByte = 0u,
    public var Reserved: UByteArray = UByteArray(38),
    public var ActiveProcessorMask: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PROCESSOR_GROUP_INFO) return false
        if (this.MaximumProcessorCount != other.MaximumProcessorCount) return false
        if (this.ActiveProcessorCount != other.ActiveProcessorCount) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.ActiveProcessorMask != other.ActiveProcessorMask) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MaximumProcessorCount.hashCode()
        result = 31 * result + this.ActiveProcessorCount.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.ActiveProcessorMask.hashCode()
        return result
    }
}

public data class PROCESSOR_RELATIONSHIP(
    public var Flags: UByte = 0u,
    public var EfficiencyClass: UByte = 0u,
    public var Reserved: UByteArray = UByteArray(20),
    public var GroupCount: UShort = 0u,
    public var GroupMask: List<GROUP_AFFINITY> = List(1) { GROUP_AFFINITY() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PROCESSOR_RELATIONSHIP) return false
        if (this.Flags != other.Flags) return false
        if (this.EfficiencyClass != other.EfficiencyClass) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        if (this.GroupCount != other.GroupCount) return false
        if (this.GroupMask != other.GroupMask) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Flags.hashCode()
        result = 31 * result + this.EfficiencyClass.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        result = 31 * result + this.GroupCount.hashCode()
        result = 31 * result + this.GroupMask.hashCode()
        return result
    }
}

public data class SYSTEM_CPU_SET_INFORMATION(
    public var Size: UInt = 0u,
    public var Type: CPU_SET_INFORMATION_TYPE = 0,
    public var Anonymous: SYSTEM_CPU_SET_INFORMATION_0 = SYSTEM_CPU_SET_INFORMATION_0(),
)

public data class SYSTEM_CPU_SET_INFORMATION_0(public var CpuSet: SYSTEM_CPU_SET_INFORMATION_0_0 = SYSTEM_CPU_SET_INFORMATION_0_0())

public data class SYSTEM_CPU_SET_INFORMATION_0_0(
    public var Id: UInt = 0u,
    public var Group: UShort = 0u,
    public var LogicalProcessorIndex: UByte = 0u,
    public var CoreIndex: UByte = 0u,
    public var LastLevelCacheIndex: UByte = 0u,
    public var NumaNodeIndex: UByte = 0u,
    public var EfficiencyClass: UByte = 0u,
    public var Anonymous1: SYSTEM_CPU_SET_INFORMATION_0_0_0 = SYSTEM_CPU_SET_INFORMATION_0_0_0(),
    public var Anonymous2: SYSTEM_CPU_SET_INFORMATION_0_0_1 = SYSTEM_CPU_SET_INFORMATION_0_0_1(),
    public var AllocationTag: ULong = 0uL,
)

public data class SYSTEM_CPU_SET_INFORMATION_0_0_0(public var AllFlags: UByte = 0u, public var Anonymous: SYSTEM_CPU_SET_INFORMATION_0_0_0_0 = SYSTEM_CPU_SET_INFORMATION_0_0_0_0())

public data class SYSTEM_CPU_SET_INFORMATION_0_0_0_0(public var _bitfield: UByte = 0u)

public data class SYSTEM_CPU_SET_INFORMATION_0_0_1(public var Reserved: UInt = 0u, public var SchedulingClass: UByte = 0u)

public data class SYSTEM_INFO(
    public var Anonymous: SYSTEM_INFO_0 = SYSTEM_INFO_0(),
    public var dwPageSize: UInt = 0u,
    public var lpMinimumApplicationAddress: Long = 0L,
    public var lpMaximumApplicationAddress: Long = 0L,
    public var dwActiveProcessorMask: ULong = 0uL,
    public var dwNumberOfProcessors: UInt = 0u,
    public var dwProcessorType: UInt = 0u,
    public var dwAllocationGranularity: UInt = 0u,
    public var wProcessorLevel: UShort = 0u,
    public var wProcessorRevision: UShort = 0u,
)

public data class SYSTEM_INFO_0(public var dwOemId: UInt = 0u, public var Anonymous: SYSTEM_INFO_0_0 = SYSTEM_INFO_0_0())

public data class SYSTEM_INFO_0_0(public var wProcessorArchitecture: PROCESSOR_ARCHITECTURE = 0u, public var wReserved: UShort = 0u)

public data class SYSTEM_LOGICAL_PROCESSOR_INFORMATION(
    public var ProcessorMask: ULong = 0uL,
    public var Relationship: LOGICAL_PROCESSOR_RELATIONSHIP = 0,
    public var Anonymous: SYSTEM_LOGICAL_PROCESSOR_INFORMATION_0 = SYSTEM_LOGICAL_PROCESSOR_INFORMATION_0(),
)

public data class SYSTEM_LOGICAL_PROCESSOR_INFORMATION_0(
    public var ProcessorCore: SYSTEM_LOGICAL_PROCESSOR_INFORMATION_0_0 = SYSTEM_LOGICAL_PROCESSOR_INFORMATION_0_0(),
    public var NumaNode: SYSTEM_LOGICAL_PROCESSOR_INFORMATION_0_1 = SYSTEM_LOGICAL_PROCESSOR_INFORMATION_0_1(),
    public var Cache: CACHE_DESCRIPTOR = CACHE_DESCRIPTOR(),
    public var Reserved: ULongArray = ULongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SYSTEM_LOGICAL_PROCESSOR_INFORMATION_0) return false
        if (this.ProcessorCore != other.ProcessorCore) return false
        if (this.NumaNode != other.NumaNode) return false
        if (this.Cache != other.Cache) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ProcessorCore.hashCode()
        result = 31 * result + this.NumaNode.hashCode()
        result = 31 * result + this.Cache.hashCode()
        result = 31 * result + this.Reserved.contentHashCode()
        return result
    }
}

public data class SYSTEM_LOGICAL_PROCESSOR_INFORMATION_0_1(public var NodeNumber: UInt = 0u)

public data class SYSTEM_LOGICAL_PROCESSOR_INFORMATION_0_0(public var Flags: UByte = 0u)

public data class SYSTEM_LOGICAL_PROCESSOR_INFORMATION_EX(
    public var Relationship: LOGICAL_PROCESSOR_RELATIONSHIP = 0,
    public var Size: UInt = 0u,
    public var Anonymous: SYSTEM_LOGICAL_PROCESSOR_INFORMATION_EX_0 = SYSTEM_LOGICAL_PROCESSOR_INFORMATION_EX_0(),
)

public data class SYSTEM_LOGICAL_PROCESSOR_INFORMATION_EX_0(
    public var Processor: PROCESSOR_RELATIONSHIP = PROCESSOR_RELATIONSHIP(),
    public var NumaNode: NUMA_NODE_RELATIONSHIP = NUMA_NODE_RELATIONSHIP(),
    public var Cache: CACHE_RELATIONSHIP = CACHE_RELATIONSHIP(),
    public var Group: GROUP_RELATIONSHIP = GROUP_RELATIONSHIP(),
)

public data class SYSTEM_POOL_ZEROING_INFORMATION(public var PoolZeroingSupportPresent: Boolean = false)

public data class SYSTEM_PROCESSOR_CYCLE_TIME_INFORMATION(public var CycleTime: ULong = 0uL)

public data class SYSTEM_SUPPORTED_PROCESSOR_ARCHITECTURES_INFORMATION(public var _bitfield: UInt = 0u)
