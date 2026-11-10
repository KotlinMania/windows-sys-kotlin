@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.systeminformation

import io.github.kotlinmania.windowssys.COpaquePointer

public data class CacheDescriptor(
    public var level: UByte = 0u,
    public var associativity: UByte = 0u,
    public var lineSize: UShort = 0u,
    public var size: UInt = 0u,
    public var type: ProcessorCacheType = 0,
)

public data class CacheRelationship(
    public var level: UByte = 0u,
    public var associativity: UByte = 0u,
    public var lineSize: UShort = 0u,
    public var cacheSize: UInt = 0u,
    public var type: ProcessorCacheType = 0,
    public var reserved: UByteArray = UByteArray(18),
    public var groupCount: UShort = 0u,
    public var anonymous: CacheRelationship0 = CacheRelationship0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CacheRelationship) return false
        if (this.level != other.level) return false
        if (this.associativity != other.associativity) return false
        if (this.lineSize != other.lineSize) return false
        if (this.cacheSize != other.cacheSize) return false
        if (this.type != other.type) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.groupCount != other.groupCount) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.level.hashCode()
        result = 31 * result + this.associativity.hashCode()
        result = 31 * result + this.lineSize.hashCode()
        result = 31 * result + this.cacheSize.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.groupCount.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class CacheRelationship0(public var groupMask: GroupAffinity = GroupAffinity(), public var groupMasks: List<GroupAffinity> = List(1) { GroupAffinity() })

public data class GroupAffinity(
    public var mask: Int = 0,
    public var group: UShort = 0u,
    public var reserved: UShortArray = UShortArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GroupAffinity) return false
        if (this.mask != other.mask) return false
        if (this.group != other.group) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mask.hashCode()
        result = 31 * result + this.group.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class GroupRelationship(
    public var maximumGroupCount: UShort = 0u,
    public var activeGroupCount: UShort = 0u,
    public var reserved: UByteArray = UByteArray(20),
    public var groupInfo: List<ProcessorGroupInfo> = List(1) { ProcessorGroupInfo() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GroupRelationship) return false
        if (this.maximumGroupCount != other.maximumGroupCount) return false
        if (this.activeGroupCount != other.activeGroupCount) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.groupInfo != other.groupInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.maximumGroupCount.hashCode()
        result = 31 * result + this.activeGroupCount.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.groupInfo.hashCode()
        return result
    }
}

public data class Memorystatus(
    public var dwLength: UInt = 0u,
    public var dwMemoryLoad: UInt = 0u,
    public var dwTotalPhys: Int = 0,
    public var dwAvailPhys: Int = 0,
    public var dwTotalPageFile: Int = 0,
    public var dwAvailPageFile: Int = 0,
    public var dwTotalVirtual: Int = 0,
    public var dwAvailVirtual: Int = 0,
)

public data class Memorystatusex(
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

public data class NumaNodeRelationship(
    public var nodeNumber: UInt = 0u,
    public var reserved: UByteArray = UByteArray(18),
    public var groupCount: UShort = 0u,
    public var anonymous: NumaNodeRelationship0 = NumaNodeRelationship0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NumaNodeRelationship) return false
        if (this.nodeNumber != other.nodeNumber) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.groupCount != other.groupCount) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nodeNumber.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.groupCount.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class NumaNodeRelationship0(public var groupMask: GroupAffinity = GroupAffinity(), public var groupMasks: List<GroupAffinity> = List(1) { GroupAffinity() })

public data class Osversioninfoa(
    public var dwOSVersionInfoSize: UInt = 0u,
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
    public var dwBuildNumber: UInt = 0u,
    public var dwPlatformId: UInt = 0u,
    public var szCSDVersion: ByteArray = ByteArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Osversioninfoa) return false
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

public data class Osversioninfoexa(
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
        if (other !is Osversioninfoexa) return false
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

public data class Osversioninfoexw(
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
        if (other !is Osversioninfoexw) return false
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

public data class Osversioninfow(
    public var dwOSVersionInfoSize: UInt = 0u,
    public var dwMajorVersion: UInt = 0u,
    public var dwMinorVersion: UInt = 0u,
    public var dwBuildNumber: UInt = 0u,
    public var dwPlatformId: UInt = 0u,
    public var szCSDVersion: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Osversioninfow) return false
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

public data class ProcessorGroupInfo(
    public var maximumProcessorCount: UByte = 0u,
    public var activeProcessorCount: UByte = 0u,
    public var reserved: UByteArray = UByteArray(38),
    public var activeProcessorMask: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcessorGroupInfo) return false
        if (this.maximumProcessorCount != other.maximumProcessorCount) return false
        if (this.activeProcessorCount != other.activeProcessorCount) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.activeProcessorMask != other.activeProcessorMask) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.maximumProcessorCount.hashCode()
        result = 31 * result + this.activeProcessorCount.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.activeProcessorMask.hashCode()
        return result
    }
}

public data class ProcessorRelationship(
    public var flags: UByte = 0u,
    public var efficiencyClass: UByte = 0u,
    public var reserved: UByteArray = UByteArray(20),
    public var groupCount: UShort = 0u,
    public var groupMask: List<GroupAffinity> = List(1) { GroupAffinity() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcessorRelationship) return false
        if (this.flags != other.flags) return false
        if (this.efficiencyClass != other.efficiencyClass) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.groupCount != other.groupCount) return false
        if (this.groupMask != other.groupMask) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.efficiencyClass.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.groupCount.hashCode()
        result = 31 * result + this.groupMask.hashCode()
        return result
    }
}

public data class SystemCpuSetInformation(
    public var size: UInt = 0u,
    public var type: CpuSetInformationType = 0,
    public var anonymous: SystemCpuSetInformation0 = SystemCpuSetInformation0(),
)

public data class SystemCpuSetInformation0(public var cpuSet: SystemCpuSetInformation00 = SystemCpuSetInformation00())

public data class SystemCpuSetInformation00(
    public var id: UInt = 0u,
    public var group: UShort = 0u,
    public var logicalProcessorIndex: UByte = 0u,
    public var coreIndex: UByte = 0u,
    public var lastLevelCacheIndex: UByte = 0u,
    public var numaNodeIndex: UByte = 0u,
    public var efficiencyClass: UByte = 0u,
    public var anonymous1: SystemCpuSetInformation000 = SystemCpuSetInformation000(),
    public var anonymous2: SystemCpuSetInformation001 = SystemCpuSetInformation001(),
    public var allocationTag: ULong = 0uL,
)

public data class SystemCpuSetInformation000(public var allFlags: UByte = 0u, public var anonymous: SystemCpuSetInformation0000 = SystemCpuSetInformation0000())

public data class SystemCpuSetInformation0000(public var bitfield: UByte = 0u)

public data class SystemCpuSetInformation001(public var reserved: UInt = 0u, public var schedulingClass: UByte = 0u)

public data class SystemInfo(
    public var anonymous: SystemInfo0 = SystemInfo0(),
    public var dwPageSize: UInt = 0u,
    public var lpMinimumApplicationAddress: COpaquePointer? = null,
    public var lpMaximumApplicationAddress: COpaquePointer? = null,
    public var dwActiveProcessorMask: Int = 0,
    public var dwNumberOfProcessors: UInt = 0u,
    public var dwProcessorType: UInt = 0u,
    public var dwAllocationGranularity: UInt = 0u,
    public var wProcessorLevel: UShort = 0u,
    public var wProcessorRevision: UShort = 0u,
)

public data class SystemInfo0(public var dwOemId: UInt = 0u, public var anonymous: SystemInfo00 = SystemInfo00())

public data class SystemInfo00(public var wProcessorArchitecture: ProcessorArchitecture = 0u, public var wReserved: UShort = 0u)

public data class SystemLogicalProcessorInformation(
    public var processorMask: Int = 0,
    public var relationship: LogicalProcessorRelationship = 0,
    public var anonymous: SystemLogicalProcessorInformation0 = SystemLogicalProcessorInformation0(),
)

public data class SystemLogicalProcessorInformation0(
    public var processorCore: SystemLogicalProcessorInformation00 = SystemLogicalProcessorInformation00(),
    public var numaNode: SystemLogicalProcessorInformation01 = SystemLogicalProcessorInformation01(),
    public var cache: CacheDescriptor = CacheDescriptor(),
    public var reserved: ULongArray = ULongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SystemLogicalProcessorInformation0) return false
        if (this.processorCore != other.processorCore) return false
        if (this.numaNode != other.numaNode) return false
        if (this.cache != other.cache) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.processorCore.hashCode()
        result = 31 * result + this.numaNode.hashCode()
        result = 31 * result + this.cache.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class SystemLogicalProcessorInformation01(public var nodeNumber: UInt = 0u)

public data class SystemLogicalProcessorInformation00(public var flags: UByte = 0u)

public data class SystemLogicalProcessorInformationEx(
    public var relationship: LogicalProcessorRelationship = 0,
    public var size: UInt = 0u,
    public var anonymous: SystemLogicalProcessorInformationEx0 = SystemLogicalProcessorInformationEx0(),
)

public data class SystemLogicalProcessorInformationEx0(
    public var processor: ProcessorRelationship = ProcessorRelationship(),
    public var numaNode: NumaNodeRelationship = NumaNodeRelationship(),
    public var cache: CacheRelationship = CacheRelationship(),
    public var group: GroupRelationship = GroupRelationship(),
)

public data class SystemPoolZeroingInformation(public var poolZeroingSupportPresent: Boolean = false)

public data class SystemProcessorCycleTimeInformation(public var cycleTime: ULong = 0uL)

public data class SystemSupportedProcessorArchitecturesInformation(public var bitfield: UInt = 0u)
