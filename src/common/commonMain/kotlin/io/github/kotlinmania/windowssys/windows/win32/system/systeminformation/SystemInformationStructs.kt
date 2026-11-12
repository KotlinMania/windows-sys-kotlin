@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.systeminformation

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public data class CacheDescriptor(
    public var level: UByte = 0u,
    public var associativity: UByte = 0u,
    public var lineSize: UShort = 0u,
    public var size: UInt = 0u,
    public var type: ProcessorCacheType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CacheDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CacheDescriptor> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): CacheDescriptor =
                    CacheDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CacheDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.level)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.associativity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.lineSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.type)
                }
            }
    }
}

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

public data class CacheRelationship0(
    public var groupMask: GroupAffinity = GroupAffinity(),
    public var groupMasks: List<GroupAffinity> = List(1) { GroupAffinity() },
)

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GroupAffinity> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GroupAffinity> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): GroupAffinity =
                    GroupAffinity(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (3).toInt())
                        ).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: GroupAffinity) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.mask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.group)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (3).toInt())
                    ).writeNative(addr + 10L, value.reserved)
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GroupRelationship> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GroupRelationship> {
                override val sizeBytes: Long = 72L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): GroupRelationship =
                    GroupRelationship(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                        ).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(ProcessorGroupInfo.typeLayout(), (1).toInt())
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: GroupRelationship) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.maximumGroupCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.activeGroupCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                    ).writeNative(addr + 4L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(ProcessorGroupInfo.typeLayout(), (1).toInt())
                    ).writeNative(addr + 24L, value.groupInfo)
                }
            }
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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Memorystatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Memorystatus> {
                override val sizeBytes: Long = 56L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Memorystatus =
                    Memorystatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: Memorystatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMemoryLoad)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.dwTotalPhys)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.dwAvailPhys)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.dwTotalPageFile)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 32L, value.dwAvailPageFile)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 40L, value.dwTotalVirtual)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 48L, value.dwAvailVirtual)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Memorystatusex> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Memorystatusex> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Memorystatusex =
                    Memorystatusex(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: Memorystatusex) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMemoryLoad)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.ullTotalPhys)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.ullAvailPhys)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.ullTotalPageFile)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.ullAvailPageFile)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.ullTotalVirtual)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.ullAvailVirtual)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.ullAvailExtendedVirtual)
                }
            }
    }
}

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

public data class NumaNodeRelationship0(
    public var groupMask: GroupAffinity = GroupAffinity(),
    public var groupMasks: List<GroupAffinity> = List(1) { GroupAffinity() },
)

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Osversioninfoa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Osversioninfoa> {
                override val sizeBytes: Long = 148L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Osversioninfoa =
                    Osversioninfoa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                        ).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Osversioninfoa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwOSVersionInfoSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMajorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwMinorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwBuildNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwPlatformId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                    ).writeNative(addr + 20L, value.szCSDVersion)
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Osversioninfoexa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Osversioninfoexa> {
                override val sizeBytes: Long = 156L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Osversioninfoexa =
                    Osversioninfoexa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                        ).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 148L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 150L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 154L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 155L),
                    )
                override fun writeNative(addr: Long, value: Osversioninfoexa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwOSVersionInfoSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMajorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwMinorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwBuildNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwPlatformId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                    ).writeNative(addr + 20L, value.szCSDVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 148L, value.wServicePackMajor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 150L, value.wServicePackMinor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 152L, value.wSuiteMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 154L, value.wProductType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 155L, value.wReserved)
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Osversioninfoexw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Osversioninfoexw> {
                override val sizeBytes: Long = 284L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Osversioninfoexw =
                    Osversioninfoexw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                        ).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 276L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 278L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 280L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 282L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 283L),
                    )
                override fun writeNative(addr: Long, value: Osversioninfoexw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwOSVersionInfoSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMajorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwMinorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwBuildNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwPlatformId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                    ).writeNative(addr + 20L, value.szCSDVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 276L, value.wServicePackMajor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 278L, value.wServicePackMinor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 280L, value.wSuiteMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 282L, value.wProductType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 283L, value.wReserved)
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Osversioninfow> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Osversioninfow> {
                override val sizeBytes: Long = 276L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Osversioninfow =
                    Osversioninfow(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                        ).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Osversioninfow) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwOSVersionInfoSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMajorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwMinorVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwBuildNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwPlatformId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                    ).writeNative(addr + 20L, value.szCSDVersion)
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessorGroupInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessorGroupInfo> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ProcessorGroupInfo =
                    ProcessorGroupInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (38).toInt())
                        ).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: ProcessorGroupInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.maximumProcessorCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.activeProcessorCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (38).toInt())
                    ).writeNative(addr + 2L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 40L, value.activeProcessorMask)
                }
            }
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessorRelationship> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessorRelationship> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ProcessorRelationship =
                    ProcessorRelationship(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                        ).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 22L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(GroupAffinity.typeLayout(), (1).toInt())
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: ProcessorRelationship) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.efficiencyClass)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                    ).writeNative(addr + 2L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 22L, value.groupCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(GroupAffinity.typeLayout(), (1).toInt())
                    ).writeNative(addr + 24L, value.groupMask)
                }
            }
    }
}

public data class SystemCpuSetInformation(
    public var size: UInt = 0u,
    public var type: CpuSetInformationType = 0,
    public var anonymous: SystemCpuSetInformation0 = SystemCpuSetInformation0(),
)

public data class SystemCpuSetInformation0(
    public var cpuSet: SystemCpuSetInformation00 = SystemCpuSetInformation00(),
)

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

public data class SystemCpuSetInformation000(
    public var allFlags: UByte = 0u,
    public var anonymous: SystemCpuSetInformation0000 = SystemCpuSetInformation0000(),
)

public data class SystemCpuSetInformation0000(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemCpuSetInformation0000> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemCpuSetInformation0000> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): SystemCpuSetInformation0000 =
                    SystemCpuSetInformation0000(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SystemCpuSetInformation0000) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class SystemCpuSetInformation001(
    public var reserved: UInt = 0u,
    public var schedulingClass: UByte = 0u,
)

public class SystemInfo internal constructor(
    public var anonymous: SystemInfo0,
    public var dwPageSize: UInt,
    lpMinimumApplicationAddressCtorArg: MutPtr<CVoid>,
    lpMaximumApplicationAddressCtorArg: MutPtr<CVoid>,
    public var dwActiveProcessorMask: Int,
    public var dwNumberOfProcessors: UInt,
    public var dwProcessorType: UInt,
    public var dwAllocationGranularity: UInt,
    public var wProcessorLevel: UShort,
    public var wProcessorRevision: UShort,
) {
    public var lpMinimumApplicationAddress: MutPtr<CVoid> = lpMinimumApplicationAddressCtorArg
        internal set

    public var lpMaximumApplicationAddress: MutPtr<CVoid> = lpMaximumApplicationAddressCtorArg
        internal set

    public constructor() : this(
        anonymous = SystemInfo0(),
        dwPageSize = 0u,
        lpMinimumApplicationAddressCtorArg = MutPtr(0L),
        lpMaximumApplicationAddressCtorArg = MutPtr(0L),
        dwActiveProcessorMask = 0,
        dwNumberOfProcessors = 0u,
        dwProcessorType = 0u,
        dwAllocationGranularity = 0u,
        wProcessorLevel = 0u,
        wProcessorRevision = 0u,
    )

    public operator fun component1(): SystemInfo0 = this.anonymous

    public operator fun component2(): UInt = this.dwPageSize

    public operator fun component3(): MutPtr<CVoid> = this.lpMinimumApplicationAddress

    public operator fun component4(): MutPtr<CVoid> = this.lpMaximumApplicationAddress

    public operator fun component5(): Int = this.dwActiveProcessorMask

    public operator fun component6(): UInt = this.dwNumberOfProcessors

    public operator fun component7(): UInt = this.dwProcessorType

    public operator fun component8(): UInt = this.dwAllocationGranularity

    public operator fun component9(): UShort = this.wProcessorLevel

    public operator fun component10(): UShort = this.wProcessorRevision

    public fun copy(anonymous: SystemInfo0 = this.anonymous, dwPageSize: UInt = this.dwPageSize, lpMinimumApplicationAddress: MutPtr<CVoid> = this.lpMinimumApplicationAddress, lpMaximumApplicationAddress: MutPtr<CVoid> = this.lpMaximumApplicationAddress, dwActiveProcessorMask: Int = this.dwActiveProcessorMask, dwNumberOfProcessors: UInt = this.dwNumberOfProcessors, dwProcessorType: UInt = this.dwProcessorType, dwAllocationGranularity: UInt = this.dwAllocationGranularity, wProcessorLevel: UShort = this.wProcessorLevel, wProcessorRevision: UShort = this.wProcessorRevision): SystemInfo = SystemInfo(anonymous = anonymous, dwPageSize = dwPageSize, lpMinimumApplicationAddressCtorArg = lpMinimumApplicationAddress, lpMaximumApplicationAddressCtorArg = lpMaximumApplicationAddress, dwActiveProcessorMask = dwActiveProcessorMask, dwNumberOfProcessors = dwNumberOfProcessors, dwProcessorType = dwProcessorType, dwAllocationGranularity = dwAllocationGranularity, wProcessorLevel = wProcessorLevel, wProcessorRevision = wProcessorRevision)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SystemInfo) return false
        if (this.anonymous != other.anonymous) return false
        if (this.dwPageSize != other.dwPageSize) return false
        if (this.lpMinimumApplicationAddress != other.lpMinimumApplicationAddress) return false
        if (this.lpMaximumApplicationAddress != other.lpMaximumApplicationAddress) return false
        if (this.dwActiveProcessorMask != other.dwActiveProcessorMask) return false
        if (this.dwNumberOfProcessors != other.dwNumberOfProcessors) return false
        if (this.dwProcessorType != other.dwProcessorType) return false
        if (this.dwAllocationGranularity != other.dwAllocationGranularity) return false
        if (this.wProcessorLevel != other.wProcessorLevel) return false
        if (this.wProcessorRevision != other.wProcessorRevision) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.dwPageSize.hashCode()
        result = 31 * result + this.lpMinimumApplicationAddress.hashCode()
        result = 31 * result + this.lpMaximumApplicationAddress.hashCode()
        result = 31 * result + this.dwActiveProcessorMask.hashCode()
        result = 31 * result + this.dwNumberOfProcessors.hashCode()
        result = 31 * result + this.dwProcessorType.hashCode()
        result = 31 * result + this.dwAllocationGranularity.hashCode()
        result = 31 * result + this.wProcessorLevel.hashCode()
        result = 31 * result + this.wProcessorRevision.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: SystemInfo0 = SystemInfo0(),
            dwPageSize: UInt = 0u,
            lpMinimumApplicationAddress: MutPtr<CVoid> = MutPtr(0L),
            lpMaximumApplicationAddress: MutPtr<CVoid> = MutPtr(0L),
            dwActiveProcessorMask: Int = 0,
            dwNumberOfProcessors: UInt = 0u,
            dwProcessorType: UInt = 0u,
            dwAllocationGranularity: UInt = 0u,
            wProcessorLevel: UShort = 0u,
            wProcessorRevision: UShort = 0u,
        ): SystemInfo =
            SystemInfo(
                anonymous = anonymous,
                dwPageSize = dwPageSize,
                lpMinimumApplicationAddressCtorArg = lpMinimumApplicationAddress,
                lpMaximumApplicationAddressCtorArg = lpMaximumApplicationAddress,
                dwActiveProcessorMask = dwActiveProcessorMask,
                dwNumberOfProcessors = dwNumberOfProcessors,
                dwProcessorType = dwProcessorType,
                dwAllocationGranularity = dwAllocationGranularity,
                wProcessorLevel = wProcessorLevel,
                wProcessorRevision = wProcessorRevision,
            )
    }
}

public data class SystemInfo0(
    public var dwOemId: UInt = 0u,
    public var anonymous: SystemInfo00 = SystemInfo00(),
)

public data class SystemInfo00(
    public var wProcessorArchitecture: ProcessorArchitecture = 0u,
    public var wReserved: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemInfo00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemInfo00> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): SystemInfo00 =
                    SystemInfo00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: SystemInfo00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wProcessorArchitecture)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wReserved)
                }
            }
    }
}

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

public data class SystemLogicalProcessorInformation01(
    public var nodeNumber: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemLogicalProcessorInformation01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemLogicalProcessorInformation01> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SystemLogicalProcessorInformation01 =
                    SystemLogicalProcessorInformation01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SystemLogicalProcessorInformation01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nodeNumber)
                }
            }
    }
}

public data class SystemLogicalProcessorInformation00(
    public var flags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemLogicalProcessorInformation00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemLogicalProcessorInformation00> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): SystemLogicalProcessorInformation00 =
                    SystemLogicalProcessorInformation00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SystemLogicalProcessorInformation00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.flags)
                }
            }
    }
}

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

public data class SystemPoolZeroingInformation(
    public var poolZeroingSupportPresent: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemPoolZeroingInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemPoolZeroingInformation> {
                override val sizeBytes: Long = 1L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): SystemPoolZeroingInformation =
                    SystemPoolZeroingInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SystemPoolZeroingInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.poolZeroingSupportPresent)
                }
            }
    }
}

public data class SystemProcessorCycleTimeInformation(
    public var cycleTime: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemProcessorCycleTimeInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemProcessorCycleTimeInformation> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SystemProcessorCycleTimeInformation =
                    SystemProcessorCycleTimeInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SystemProcessorCycleTimeInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.cycleTime)
                }
            }
    }
}

public data class SystemSupportedProcessorArchitecturesInformation(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemSupportedProcessorArchitecturesInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemSupportedProcessorArchitecturesInformation> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SystemSupportedProcessorArchitecturesInformation =
                    SystemSupportedProcessorArchitecturesInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SystemSupportedProcessorArchitecturesInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}
