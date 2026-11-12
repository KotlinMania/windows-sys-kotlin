@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.vhd

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

public data class ApplySnapshotVhdsetParameters(
    public var version: ApplySnapshotVhdsetVersion = 0,
    public var anonymous: ApplySnapshotVhdsetParameters0 = ApplySnapshotVhdsetParameters0(),
)

public data class ApplySnapshotVhdsetParameters0(
    public var version1: ApplySnapshotVhdsetParameters00 = ApplySnapshotVhdsetParameters00(),
)

public data class ApplySnapshotVhdsetParameters00(
    public var snapshotId: Guid = Guid(),
    public var leafSnapshotId: Guid = Guid(),
)

public data class AttachVirtualDiskParameters(
    public var version: AttachVirtualDiskVersion = 0,
    public var anonymous: AttachVirtualDiskParameters0 = AttachVirtualDiskParameters0(),
)

public data class AttachVirtualDiskParameters0(
    public var version1: AttachVirtualDiskParameters00 = AttachVirtualDiskParameters00(),
    public var version2: AttachVirtualDiskParameters01 = AttachVirtualDiskParameters01(),
)

public data class AttachVirtualDiskParameters00(
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AttachVirtualDiskParameters00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AttachVirtualDiskParameters00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): AttachVirtualDiskParameters00 =
                    AttachVirtualDiskParameters00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: AttachVirtualDiskParameters00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.reserved)
                }
            }
    }
}

public data class AttachVirtualDiskParameters01(
    public var restrictedOffset: ULong = 0uL,
    public var restrictedLength: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AttachVirtualDiskParameters01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AttachVirtualDiskParameters01> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): AttachVirtualDiskParameters01 =
                    AttachVirtualDiskParameters01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: AttachVirtualDiskParameters01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.restrictedOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.restrictedLength)
                }
            }
    }
}

public data class CompactVirtualDiskParameters(
    public var version: CompactVirtualDiskVersion = 0,
    public var anonymous: CompactVirtualDiskParameters0 = CompactVirtualDiskParameters0(),
)

public data class CompactVirtualDiskParameters0(
    public var version1: CompactVirtualDiskParameters00 = CompactVirtualDiskParameters00(),
)

public data class CompactVirtualDiskParameters00(
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CompactVirtualDiskParameters00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CompactVirtualDiskParameters00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): CompactVirtualDiskParameters00 =
                    CompactVirtualDiskParameters00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: CompactVirtualDiskParameters00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.reserved)
                }
            }
    }
}

public data class CreateVirtualDiskParameters(
    public var version: CreateVirtualDiskVersion = 0,
    public var anonymous: CreateVirtualDiskParameters0 = CreateVirtualDiskParameters0(),
)

public data class CreateVirtualDiskParameters0(
    public var version1: CreateVirtualDiskParameters00 = CreateVirtualDiskParameters00(),
    public var version2: CreateVirtualDiskParameters01 = CreateVirtualDiskParameters01(),
    public var version3: CreateVirtualDiskParameters02 = CreateVirtualDiskParameters02(),
    public var version4: CreateVirtualDiskParameters03 = CreateVirtualDiskParameters03(),
)

public class CreateVirtualDiskParameters00 internal constructor(
    public var uniqueId: Guid,
    public var maximumSize: ULong,
    public var blockSizeInBytes: UInt,
    public var sectorSizeInBytes: UInt,
    parentPathCtorArg: Pcwstr,
    sourcePathCtorArg: Pcwstr,
) {
    public var parentPath: Pcwstr = parentPathCtorArg
        internal set

    public var sourcePath: Pcwstr = sourcePathCtorArg
        internal set

    public constructor() : this(
        uniqueId = Guid(),
        maximumSize = 0uL,
        blockSizeInBytes = 0u,
        sectorSizeInBytes = 0u,
        parentPathCtorArg = ConstPtr(0L),
        sourcePathCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Guid = this.uniqueId

    public operator fun component2(): ULong = this.maximumSize

    public operator fun component3(): UInt = this.blockSizeInBytes

    public operator fun component4(): UInt = this.sectorSizeInBytes

    public operator fun component5(): Pcwstr = this.parentPath

    public operator fun component6(): Pcwstr = this.sourcePath

    public fun copy(uniqueId: Guid = this.uniqueId, maximumSize: ULong = this.maximumSize, blockSizeInBytes: UInt = this.blockSizeInBytes, sectorSizeInBytes: UInt = this.sectorSizeInBytes, parentPath: Pcwstr = this.parentPath, sourcePath: Pcwstr = this.sourcePath): CreateVirtualDiskParameters00 = CreateVirtualDiskParameters00(uniqueId = uniqueId, maximumSize = maximumSize, blockSizeInBytes = blockSizeInBytes, sectorSizeInBytes = sectorSizeInBytes, parentPathCtorArg = parentPath, sourcePathCtorArg = sourcePath)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CreateVirtualDiskParameters00) return false
        if (this.uniqueId != other.uniqueId) return false
        if (this.maximumSize != other.maximumSize) return false
        if (this.blockSizeInBytes != other.blockSizeInBytes) return false
        if (this.sectorSizeInBytes != other.sectorSizeInBytes) return false
        if (this.parentPath != other.parentPath) return false
        if (this.sourcePath != other.sourcePath) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uniqueId.hashCode()
        result = 31 * result + this.maximumSize.hashCode()
        result = 31 * result + this.blockSizeInBytes.hashCode()
        result = 31 * result + this.sectorSizeInBytes.hashCode()
        result = 31 * result + this.parentPath.hashCode()
        result = 31 * result + this.sourcePath.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            uniqueId: Guid = Guid(),
            maximumSize: ULong = 0uL,
            blockSizeInBytes: UInt = 0u,
            sectorSizeInBytes: UInt = 0u,
            parentPath: Pcwstr = ConstPtr(0L),
            sourcePath: Pcwstr = ConstPtr(0L),
        ): CreateVirtualDiskParameters00 =
            CreateVirtualDiskParameters00(
                uniqueId = uniqueId,
                maximumSize = maximumSize,
                blockSizeInBytes = blockSizeInBytes,
                sectorSizeInBytes = sectorSizeInBytes,
                parentPathCtorArg = parentPath,
                sourcePathCtorArg = sourcePath,
            )
    }
}

public class CreateVirtualDiskParameters01 internal constructor(
    public var uniqueId: Guid,
    public var maximumSize: ULong,
    public var blockSizeInBytes: UInt,
    public var sectorSizeInBytes: UInt,
    public var physicalSectorSizeInBytes: UInt,
    parentPathCtorArg: Pcwstr,
    sourcePathCtorArg: Pcwstr,
    public var openFlags: OpenVirtualDiskFlag,
    public var parentVirtualStorageType: VirtualStorageType,
    public var sourceVirtualStorageType: VirtualStorageType,
    public var resiliencyGuid: Guid,
) {
    public var parentPath: Pcwstr = parentPathCtorArg
        internal set

    public var sourcePath: Pcwstr = sourcePathCtorArg
        internal set

    public constructor() : this(
        uniqueId = Guid(),
        maximumSize = 0uL,
        blockSizeInBytes = 0u,
        sectorSizeInBytes = 0u,
        physicalSectorSizeInBytes = 0u,
        parentPathCtorArg = ConstPtr(0L),
        sourcePathCtorArg = ConstPtr(0L),
        openFlags = 0,
        parentVirtualStorageType = VirtualStorageType(),
        sourceVirtualStorageType = VirtualStorageType(),
        resiliencyGuid = Guid(),
    )

    public operator fun component1(): Guid = this.uniqueId

    public operator fun component2(): ULong = this.maximumSize

    public operator fun component3(): UInt = this.blockSizeInBytes

    public operator fun component4(): UInt = this.sectorSizeInBytes

    public operator fun component5(): UInt = this.physicalSectorSizeInBytes

    public operator fun component6(): Pcwstr = this.parentPath

    public operator fun component7(): Pcwstr = this.sourcePath

    public operator fun component8(): OpenVirtualDiskFlag = this.openFlags

    public operator fun component9(): VirtualStorageType = this.parentVirtualStorageType

    public operator fun component10(): VirtualStorageType = this.sourceVirtualStorageType

    public operator fun component11(): Guid = this.resiliencyGuid

    public fun copy(uniqueId: Guid = this.uniqueId, maximumSize: ULong = this.maximumSize, blockSizeInBytes: UInt = this.blockSizeInBytes, sectorSizeInBytes: UInt = this.sectorSizeInBytes, physicalSectorSizeInBytes: UInt = this.physicalSectorSizeInBytes, parentPath: Pcwstr = this.parentPath, sourcePath: Pcwstr = this.sourcePath, openFlags: OpenVirtualDiskFlag = this.openFlags, parentVirtualStorageType: VirtualStorageType = this.parentVirtualStorageType, sourceVirtualStorageType: VirtualStorageType = this.sourceVirtualStorageType, resiliencyGuid: Guid = this.resiliencyGuid): CreateVirtualDiskParameters01 = CreateVirtualDiskParameters01(uniqueId = uniqueId, maximumSize = maximumSize, blockSizeInBytes = blockSizeInBytes, sectorSizeInBytes = sectorSizeInBytes, physicalSectorSizeInBytes = physicalSectorSizeInBytes, parentPathCtorArg = parentPath, sourcePathCtorArg = sourcePath, openFlags = openFlags, parentVirtualStorageType = parentVirtualStorageType, sourceVirtualStorageType = sourceVirtualStorageType, resiliencyGuid = resiliencyGuid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CreateVirtualDiskParameters01) return false
        if (this.uniqueId != other.uniqueId) return false
        if (this.maximumSize != other.maximumSize) return false
        if (this.blockSizeInBytes != other.blockSizeInBytes) return false
        if (this.sectorSizeInBytes != other.sectorSizeInBytes) return false
        if (this.physicalSectorSizeInBytes != other.physicalSectorSizeInBytes) return false
        if (this.parentPath != other.parentPath) return false
        if (this.sourcePath != other.sourcePath) return false
        if (this.openFlags != other.openFlags) return false
        if (this.parentVirtualStorageType != other.parentVirtualStorageType) return false
        if (this.sourceVirtualStorageType != other.sourceVirtualStorageType) return false
        if (this.resiliencyGuid != other.resiliencyGuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uniqueId.hashCode()
        result = 31 * result + this.maximumSize.hashCode()
        result = 31 * result + this.blockSizeInBytes.hashCode()
        result = 31 * result + this.sectorSizeInBytes.hashCode()
        result = 31 * result + this.physicalSectorSizeInBytes.hashCode()
        result = 31 * result + this.parentPath.hashCode()
        result = 31 * result + this.sourcePath.hashCode()
        result = 31 * result + this.openFlags.hashCode()
        result = 31 * result + this.parentVirtualStorageType.hashCode()
        result = 31 * result + this.sourceVirtualStorageType.hashCode()
        result = 31 * result + this.resiliencyGuid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            uniqueId: Guid = Guid(),
            maximumSize: ULong = 0uL,
            blockSizeInBytes: UInt = 0u,
            sectorSizeInBytes: UInt = 0u,
            physicalSectorSizeInBytes: UInt = 0u,
            parentPath: Pcwstr = ConstPtr(0L),
            sourcePath: Pcwstr = ConstPtr(0L),
            openFlags: OpenVirtualDiskFlag = 0,
            parentVirtualStorageType: VirtualStorageType = VirtualStorageType(),
            sourceVirtualStorageType: VirtualStorageType = VirtualStorageType(),
            resiliencyGuid: Guid = Guid(),
        ): CreateVirtualDiskParameters01 =
            CreateVirtualDiskParameters01(
                uniqueId = uniqueId,
                maximumSize = maximumSize,
                blockSizeInBytes = blockSizeInBytes,
                sectorSizeInBytes = sectorSizeInBytes,
                physicalSectorSizeInBytes = physicalSectorSizeInBytes,
                parentPathCtorArg = parentPath,
                sourcePathCtorArg = sourcePath,
                openFlags = openFlags,
                parentVirtualStorageType = parentVirtualStorageType,
                sourceVirtualStorageType = sourceVirtualStorageType,
                resiliencyGuid = resiliencyGuid,
            )
    }
}

public class CreateVirtualDiskParameters02 internal constructor(
    public var uniqueId: Guid,
    public var maximumSize: ULong,
    public var blockSizeInBytes: UInt,
    public var sectorSizeInBytes: UInt,
    public var physicalSectorSizeInBytes: UInt,
    parentPathCtorArg: Pcwstr,
    sourcePathCtorArg: Pcwstr,
    public var openFlags: OpenVirtualDiskFlag,
    public var parentVirtualStorageType: VirtualStorageType,
    public var sourceVirtualStorageType: VirtualStorageType,
    public var resiliencyGuid: Guid,
    sourceLimitPathCtorArg: Pcwstr,
    public var backingStorageType: VirtualStorageType,
) {
    public var parentPath: Pcwstr = parentPathCtorArg
        internal set

    public var sourcePath: Pcwstr = sourcePathCtorArg
        internal set

    public var sourceLimitPath: Pcwstr = sourceLimitPathCtorArg
        internal set

    public constructor() : this(
        uniqueId = Guid(),
        maximumSize = 0uL,
        blockSizeInBytes = 0u,
        sectorSizeInBytes = 0u,
        physicalSectorSizeInBytes = 0u,
        parentPathCtorArg = ConstPtr(0L),
        sourcePathCtorArg = ConstPtr(0L),
        openFlags = 0,
        parentVirtualStorageType = VirtualStorageType(),
        sourceVirtualStorageType = VirtualStorageType(),
        resiliencyGuid = Guid(),
        sourceLimitPathCtorArg = ConstPtr(0L),
        backingStorageType = VirtualStorageType(),
    )

    public operator fun component1(): Guid = this.uniqueId

    public operator fun component2(): ULong = this.maximumSize

    public operator fun component3(): UInt = this.blockSizeInBytes

    public operator fun component4(): UInt = this.sectorSizeInBytes

    public operator fun component5(): UInt = this.physicalSectorSizeInBytes

    public operator fun component6(): Pcwstr = this.parentPath

    public operator fun component7(): Pcwstr = this.sourcePath

    public operator fun component8(): OpenVirtualDiskFlag = this.openFlags

    public operator fun component9(): VirtualStorageType = this.parentVirtualStorageType

    public operator fun component10(): VirtualStorageType = this.sourceVirtualStorageType

    public operator fun component11(): Guid = this.resiliencyGuid

    public operator fun component12(): Pcwstr = this.sourceLimitPath

    public operator fun component13(): VirtualStorageType = this.backingStorageType

    public fun copy(uniqueId: Guid = this.uniqueId, maximumSize: ULong = this.maximumSize, blockSizeInBytes: UInt = this.blockSizeInBytes, sectorSizeInBytes: UInt = this.sectorSizeInBytes, physicalSectorSizeInBytes: UInt = this.physicalSectorSizeInBytes, parentPath: Pcwstr = this.parentPath, sourcePath: Pcwstr = this.sourcePath, openFlags: OpenVirtualDiskFlag = this.openFlags, parentVirtualStorageType: VirtualStorageType = this.parentVirtualStorageType, sourceVirtualStorageType: VirtualStorageType = this.sourceVirtualStorageType, resiliencyGuid: Guid = this.resiliencyGuid, sourceLimitPath: Pcwstr = this.sourceLimitPath, backingStorageType: VirtualStorageType = this.backingStorageType): CreateVirtualDiskParameters02 = CreateVirtualDiskParameters02(uniqueId = uniqueId, maximumSize = maximumSize, blockSizeInBytes = blockSizeInBytes, sectorSizeInBytes = sectorSizeInBytes, physicalSectorSizeInBytes = physicalSectorSizeInBytes, parentPathCtorArg = parentPath, sourcePathCtorArg = sourcePath, openFlags = openFlags, parentVirtualStorageType = parentVirtualStorageType, sourceVirtualStorageType = sourceVirtualStorageType, resiliencyGuid = resiliencyGuid, sourceLimitPathCtorArg = sourceLimitPath, backingStorageType = backingStorageType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CreateVirtualDiskParameters02) return false
        if (this.uniqueId != other.uniqueId) return false
        if (this.maximumSize != other.maximumSize) return false
        if (this.blockSizeInBytes != other.blockSizeInBytes) return false
        if (this.sectorSizeInBytes != other.sectorSizeInBytes) return false
        if (this.physicalSectorSizeInBytes != other.physicalSectorSizeInBytes) return false
        if (this.parentPath != other.parentPath) return false
        if (this.sourcePath != other.sourcePath) return false
        if (this.openFlags != other.openFlags) return false
        if (this.parentVirtualStorageType != other.parentVirtualStorageType) return false
        if (this.sourceVirtualStorageType != other.sourceVirtualStorageType) return false
        if (this.resiliencyGuid != other.resiliencyGuid) return false
        if (this.sourceLimitPath != other.sourceLimitPath) return false
        if (this.backingStorageType != other.backingStorageType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uniqueId.hashCode()
        result = 31 * result + this.maximumSize.hashCode()
        result = 31 * result + this.blockSizeInBytes.hashCode()
        result = 31 * result + this.sectorSizeInBytes.hashCode()
        result = 31 * result + this.physicalSectorSizeInBytes.hashCode()
        result = 31 * result + this.parentPath.hashCode()
        result = 31 * result + this.sourcePath.hashCode()
        result = 31 * result + this.openFlags.hashCode()
        result = 31 * result + this.parentVirtualStorageType.hashCode()
        result = 31 * result + this.sourceVirtualStorageType.hashCode()
        result = 31 * result + this.resiliencyGuid.hashCode()
        result = 31 * result + this.sourceLimitPath.hashCode()
        result = 31 * result + this.backingStorageType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            uniqueId: Guid = Guid(),
            maximumSize: ULong = 0uL,
            blockSizeInBytes: UInt = 0u,
            sectorSizeInBytes: UInt = 0u,
            physicalSectorSizeInBytes: UInt = 0u,
            parentPath: Pcwstr = ConstPtr(0L),
            sourcePath: Pcwstr = ConstPtr(0L),
            openFlags: OpenVirtualDiskFlag = 0,
            parentVirtualStorageType: VirtualStorageType = VirtualStorageType(),
            sourceVirtualStorageType: VirtualStorageType = VirtualStorageType(),
            resiliencyGuid: Guid = Guid(),
            sourceLimitPath: Pcwstr = ConstPtr(0L),
            backingStorageType: VirtualStorageType = VirtualStorageType(),
        ): CreateVirtualDiskParameters02 =
            CreateVirtualDiskParameters02(
                uniqueId = uniqueId,
                maximumSize = maximumSize,
                blockSizeInBytes = blockSizeInBytes,
                sectorSizeInBytes = sectorSizeInBytes,
                physicalSectorSizeInBytes = physicalSectorSizeInBytes,
                parentPathCtorArg = parentPath,
                sourcePathCtorArg = sourcePath,
                openFlags = openFlags,
                parentVirtualStorageType = parentVirtualStorageType,
                sourceVirtualStorageType = sourceVirtualStorageType,
                resiliencyGuid = resiliencyGuid,
                sourceLimitPathCtorArg = sourceLimitPath,
                backingStorageType = backingStorageType,
            )
    }
}

public class CreateVirtualDiskParameters03 internal constructor(
    public var uniqueId: Guid,
    public var maximumSize: ULong,
    public var blockSizeInBytes: UInt,
    public var sectorSizeInBytes: UInt,
    public var physicalSectorSizeInBytes: UInt,
    parentPathCtorArg: Pcwstr,
    sourcePathCtorArg: Pcwstr,
    public var openFlags: OpenVirtualDiskFlag,
    public var parentVirtualStorageType: VirtualStorageType,
    public var sourceVirtualStorageType: VirtualStorageType,
    public var resiliencyGuid: Guid,
    sourceLimitPathCtorArg: Pcwstr,
    public var backingStorageType: VirtualStorageType,
    public var pmemAddressAbstractionType: Guid,
    public var dataAlignment: ULong,
) {
    public var parentPath: Pcwstr = parentPathCtorArg
        internal set

    public var sourcePath: Pcwstr = sourcePathCtorArg
        internal set

    public var sourceLimitPath: Pcwstr = sourceLimitPathCtorArg
        internal set

    public constructor() : this(
        uniqueId = Guid(),
        maximumSize = 0uL,
        blockSizeInBytes = 0u,
        sectorSizeInBytes = 0u,
        physicalSectorSizeInBytes = 0u,
        parentPathCtorArg = ConstPtr(0L),
        sourcePathCtorArg = ConstPtr(0L),
        openFlags = 0,
        parentVirtualStorageType = VirtualStorageType(),
        sourceVirtualStorageType = VirtualStorageType(),
        resiliencyGuid = Guid(),
        sourceLimitPathCtorArg = ConstPtr(0L),
        backingStorageType = VirtualStorageType(),
        pmemAddressAbstractionType = Guid(),
        dataAlignment = 0uL,
    )

    public operator fun component1(): Guid = this.uniqueId

    public operator fun component2(): ULong = this.maximumSize

    public operator fun component3(): UInt = this.blockSizeInBytes

    public operator fun component4(): UInt = this.sectorSizeInBytes

    public operator fun component5(): UInt = this.physicalSectorSizeInBytes

    public operator fun component6(): Pcwstr = this.parentPath

    public operator fun component7(): Pcwstr = this.sourcePath

    public operator fun component8(): OpenVirtualDiskFlag = this.openFlags

    public operator fun component9(): VirtualStorageType = this.parentVirtualStorageType

    public operator fun component10(): VirtualStorageType = this.sourceVirtualStorageType

    public operator fun component11(): Guid = this.resiliencyGuid

    public operator fun component12(): Pcwstr = this.sourceLimitPath

    public operator fun component13(): VirtualStorageType = this.backingStorageType

    public operator fun component14(): Guid = this.pmemAddressAbstractionType

    public operator fun component15(): ULong = this.dataAlignment

    public fun copy(uniqueId: Guid = this.uniqueId, maximumSize: ULong = this.maximumSize, blockSizeInBytes: UInt = this.blockSizeInBytes, sectorSizeInBytes: UInt = this.sectorSizeInBytes, physicalSectorSizeInBytes: UInt = this.physicalSectorSizeInBytes, parentPath: Pcwstr = this.parentPath, sourcePath: Pcwstr = this.sourcePath, openFlags: OpenVirtualDiskFlag = this.openFlags, parentVirtualStorageType: VirtualStorageType = this.parentVirtualStorageType, sourceVirtualStorageType: VirtualStorageType = this.sourceVirtualStorageType, resiliencyGuid: Guid = this.resiliencyGuid, sourceLimitPath: Pcwstr = this.sourceLimitPath, backingStorageType: VirtualStorageType = this.backingStorageType, pmemAddressAbstractionType: Guid = this.pmemAddressAbstractionType, dataAlignment: ULong = this.dataAlignment): CreateVirtualDiskParameters03 = CreateVirtualDiskParameters03(uniqueId = uniqueId, maximumSize = maximumSize, blockSizeInBytes = blockSizeInBytes, sectorSizeInBytes = sectorSizeInBytes, physicalSectorSizeInBytes = physicalSectorSizeInBytes, parentPathCtorArg = parentPath, sourcePathCtorArg = sourcePath, openFlags = openFlags, parentVirtualStorageType = parentVirtualStorageType, sourceVirtualStorageType = sourceVirtualStorageType, resiliencyGuid = resiliencyGuid, sourceLimitPathCtorArg = sourceLimitPath, backingStorageType = backingStorageType, pmemAddressAbstractionType = pmemAddressAbstractionType, dataAlignment = dataAlignment)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CreateVirtualDiskParameters03) return false
        if (this.uniqueId != other.uniqueId) return false
        if (this.maximumSize != other.maximumSize) return false
        if (this.blockSizeInBytes != other.blockSizeInBytes) return false
        if (this.sectorSizeInBytes != other.sectorSizeInBytes) return false
        if (this.physicalSectorSizeInBytes != other.physicalSectorSizeInBytes) return false
        if (this.parentPath != other.parentPath) return false
        if (this.sourcePath != other.sourcePath) return false
        if (this.openFlags != other.openFlags) return false
        if (this.parentVirtualStorageType != other.parentVirtualStorageType) return false
        if (this.sourceVirtualStorageType != other.sourceVirtualStorageType) return false
        if (this.resiliencyGuid != other.resiliencyGuid) return false
        if (this.sourceLimitPath != other.sourceLimitPath) return false
        if (this.backingStorageType != other.backingStorageType) return false
        if (this.pmemAddressAbstractionType != other.pmemAddressAbstractionType) return false
        if (this.dataAlignment != other.dataAlignment) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uniqueId.hashCode()
        result = 31 * result + this.maximumSize.hashCode()
        result = 31 * result + this.blockSizeInBytes.hashCode()
        result = 31 * result + this.sectorSizeInBytes.hashCode()
        result = 31 * result + this.physicalSectorSizeInBytes.hashCode()
        result = 31 * result + this.parentPath.hashCode()
        result = 31 * result + this.sourcePath.hashCode()
        result = 31 * result + this.openFlags.hashCode()
        result = 31 * result + this.parentVirtualStorageType.hashCode()
        result = 31 * result + this.sourceVirtualStorageType.hashCode()
        result = 31 * result + this.resiliencyGuid.hashCode()
        result = 31 * result + this.sourceLimitPath.hashCode()
        result = 31 * result + this.backingStorageType.hashCode()
        result = 31 * result + this.pmemAddressAbstractionType.hashCode()
        result = 31 * result + this.dataAlignment.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            uniqueId: Guid = Guid(),
            maximumSize: ULong = 0uL,
            blockSizeInBytes: UInt = 0u,
            sectorSizeInBytes: UInt = 0u,
            physicalSectorSizeInBytes: UInt = 0u,
            parentPath: Pcwstr = ConstPtr(0L),
            sourcePath: Pcwstr = ConstPtr(0L),
            openFlags: OpenVirtualDiskFlag = 0,
            parentVirtualStorageType: VirtualStorageType = VirtualStorageType(),
            sourceVirtualStorageType: VirtualStorageType = VirtualStorageType(),
            resiliencyGuid: Guid = Guid(),
            sourceLimitPath: Pcwstr = ConstPtr(0L),
            backingStorageType: VirtualStorageType = VirtualStorageType(),
            pmemAddressAbstractionType: Guid = Guid(),
            dataAlignment: ULong = 0uL,
        ): CreateVirtualDiskParameters03 =
            CreateVirtualDiskParameters03(
                uniqueId = uniqueId,
                maximumSize = maximumSize,
                blockSizeInBytes = blockSizeInBytes,
                sectorSizeInBytes = sectorSizeInBytes,
                physicalSectorSizeInBytes = physicalSectorSizeInBytes,
                parentPathCtorArg = parentPath,
                sourcePathCtorArg = sourcePath,
                openFlags = openFlags,
                parentVirtualStorageType = parentVirtualStorageType,
                sourceVirtualStorageType = sourceVirtualStorageType,
                resiliencyGuid = resiliencyGuid,
                sourceLimitPathCtorArg = sourceLimitPath,
                backingStorageType = backingStorageType,
                pmemAddressAbstractionType = pmemAddressAbstractionType,
                dataAlignment = dataAlignment,
            )
    }
}

public data class DeleteSnapshotVhdsetParameters(
    public var version: DeleteSnapshotVhdsetVersion = 0,
    public var anonymous: DeleteSnapshotVhdsetParameters0 = DeleteSnapshotVhdsetParameters0(),
)

public data class DeleteSnapshotVhdsetParameters0(
    public var version1: DeleteSnapshotVhdsetParameters00 = DeleteSnapshotVhdsetParameters00(),
)

public data class DeleteSnapshotVhdsetParameters00(
    public var snapshotId: Guid = Guid(),
)

public data class ExpandVirtualDiskParameters(
    public var version: ExpandVirtualDiskVersion = 0,
    public var anonymous: ExpandVirtualDiskParameters0 = ExpandVirtualDiskParameters0(),
)

public data class ExpandVirtualDiskParameters0(
    public var version1: ExpandVirtualDiskParameters00 = ExpandVirtualDiskParameters00(),
)

public data class ExpandVirtualDiskParameters00(
    public var newSize: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExpandVirtualDiskParameters00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExpandVirtualDiskParameters00> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ExpandVirtualDiskParameters00 =
                    ExpandVirtualDiskParameters00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ExpandVirtualDiskParameters00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.newSize)
                }
            }
    }
}

public data class ForkVirtualDiskParameters(
    public var version: ForkVirtualDiskVersion = 0,
    public var anonymous: ForkVirtualDiskParameters0 = ForkVirtualDiskParameters0(),
)

public data class ForkVirtualDiskParameters0(
    public var version1: ForkVirtualDiskParameters00 = ForkVirtualDiskParameters00(),
)

public class ForkVirtualDiskParameters00 internal constructor(
    forkedVirtualDiskPathCtorArg: Pcwstr,
) {
    public var forkedVirtualDiskPath: Pcwstr = forkedVirtualDiskPathCtorArg
        internal set

    public constructor() : this(
        forkedVirtualDiskPathCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.forkedVirtualDiskPath

    public fun copy(forkedVirtualDiskPath: Pcwstr = this.forkedVirtualDiskPath): ForkVirtualDiskParameters00 = ForkVirtualDiskParameters00(forkedVirtualDiskPathCtorArg = forkedVirtualDiskPath)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ForkVirtualDiskParameters00) return false
        if (this.forkedVirtualDiskPath != other.forkedVirtualDiskPath) return false
        return true
    }

    override fun hashCode(): Int = this.forkedVirtualDiskPath.hashCode()

    public companion object {
        public operator fun invoke(
            forkedVirtualDiskPath: Pcwstr = ConstPtr(0L),
        ): ForkVirtualDiskParameters00 =
            ForkVirtualDiskParameters00(
                forkedVirtualDiskPathCtorArg = forkedVirtualDiskPath,
            )
    }
}

public data class GetVirtualDiskInfo(
    public var version: GetVirtualDiskInfoVersion = 0,
    public var anonymous: GetVirtualDiskInfo0 = GetVirtualDiskInfo0(),
)

public data class GetVirtualDiskInfo0(
    public var size: GetVirtualDiskInfo00 = GetVirtualDiskInfo00(),
    public var identifier: Guid = Guid(),
    public var parentLocation: GetVirtualDiskInfo01 = GetVirtualDiskInfo01(),
    public var parentIdentifier: Guid = Guid(),
    public var parentTimestamp: UInt = 0u,
    public var virtualStorageType: VirtualStorageType = VirtualStorageType(),
    public var providerSubtype: UInt = 0u,
    public var is4kAligned: Bool = 0,
    public var isLoaded: Bool = 0,
    public var physicalDisk: GetVirtualDiskInfo02 = GetVirtualDiskInfo02(),
    public var vhdPhysicalSectorSize: UInt = 0u,
    public var smallestSafeVirtualSize: ULong = 0uL,
    public var fragmentationPercentage: UInt = 0u,
    public var virtualDiskId: Guid = Guid(),
    public var changeTrackingState: GetVirtualDiskInfo03 = GetVirtualDiskInfo03(),
)

public data class GetVirtualDiskInfo03(
    public var enabled: Bool = 0,
    public var newerChanges: Bool = 0,
    public var mostRecentId: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GetVirtualDiskInfo03) return false
        if (this.enabled != other.enabled) return false
        if (this.newerChanges != other.newerChanges) return false
        if (!this.mostRecentId.contentEquals(other.mostRecentId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.enabled.hashCode()
        result = 31 * result + this.newerChanges.hashCode()
        result = 31 * result + this.mostRecentId.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GetVirtualDiskInfo03> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GetVirtualDiskInfo03> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): GetVirtualDiskInfo03 =
                    GetVirtualDiskInfo03(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: GetVirtualDiskInfo03) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.enabled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.newerChanges)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 8L, value.mostRecentId.toList())
                }
            }
    }
}

public data class GetVirtualDiskInfo01(
    public var parentResolved: Bool = 0,
    public var parentLocationBuffer: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GetVirtualDiskInfo01) return false
        if (this.parentResolved != other.parentResolved) return false
        if (!this.parentLocationBuffer.contentEquals(other.parentLocationBuffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.parentResolved.hashCode()
        result = 31 * result + this.parentLocationBuffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GetVirtualDiskInfo01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GetVirtualDiskInfo01> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): GetVirtualDiskInfo01 =
                    GetVirtualDiskInfo01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: GetVirtualDiskInfo01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.parentResolved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 4L, value.parentLocationBuffer.toList())
                }
            }
    }
}

public data class GetVirtualDiskInfo02(
    public var logicalSectorSize: UInt = 0u,
    public var physicalSectorSize: UInt = 0u,
    public var isRemote: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GetVirtualDiskInfo02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GetVirtualDiskInfo02> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): GetVirtualDiskInfo02 =
                    GetVirtualDiskInfo02(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: GetVirtualDiskInfo02) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.logicalSectorSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.physicalSectorSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.isRemote)
                }
            }
    }
}

public data class GetVirtualDiskInfo00(
    public var virtualSize: ULong = 0uL,
    public var physicalSize: ULong = 0uL,
    public var blockSize: UInt = 0u,
    public var sectorSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GetVirtualDiskInfo00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GetVirtualDiskInfo00> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): GetVirtualDiskInfo00 =
                    GetVirtualDiskInfo00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: GetVirtualDiskInfo00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.virtualSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.physicalSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.blockSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.sectorSize)
                }
            }
    }
}

public data class MergeVirtualDiskParameters(
    public var version: MergeVirtualDiskVersion = 0,
    public var anonymous: MergeVirtualDiskParameters0 = MergeVirtualDiskParameters0(),
)

public data class MergeVirtualDiskParameters0(
    public var version1: MergeVirtualDiskParameters00 = MergeVirtualDiskParameters00(),
    public var version2: MergeVirtualDiskParameters01 = MergeVirtualDiskParameters01(),
)

public data class MergeVirtualDiskParameters00(
    public var mergeDepth: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MergeVirtualDiskParameters00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MergeVirtualDiskParameters00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): MergeVirtualDiskParameters00 =
                    MergeVirtualDiskParameters00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MergeVirtualDiskParameters00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.mergeDepth)
                }
            }
    }
}

public data class MergeVirtualDiskParameters01(
    public var mergeSourceDepth: UInt = 0u,
    public var mergeTargetDepth: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MergeVirtualDiskParameters01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MergeVirtualDiskParameters01> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): MergeVirtualDiskParameters01 =
                    MergeVirtualDiskParameters01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MergeVirtualDiskParameters01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.mergeSourceDepth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mergeTargetDepth)
                }
            }
    }
}

public data class MirrorVirtualDiskParameters(
    public var version: MirrorVirtualDiskVersion = 0,
    public var anonymous: MirrorVirtualDiskParameters0 = MirrorVirtualDiskParameters0(),
)

public data class MirrorVirtualDiskParameters0(
    public var version1: MirrorVirtualDiskParameters00 = MirrorVirtualDiskParameters00(),
)

public class MirrorVirtualDiskParameters00 internal constructor(
    mirrorVirtualDiskPathCtorArg: Pcwstr,
) {
    public var mirrorVirtualDiskPath: Pcwstr = mirrorVirtualDiskPathCtorArg
        internal set

    public constructor() : this(
        mirrorVirtualDiskPathCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Pcwstr = this.mirrorVirtualDiskPath

    public fun copy(mirrorVirtualDiskPath: Pcwstr = this.mirrorVirtualDiskPath): MirrorVirtualDiskParameters00 = MirrorVirtualDiskParameters00(mirrorVirtualDiskPathCtorArg = mirrorVirtualDiskPath)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MirrorVirtualDiskParameters00) return false
        if (this.mirrorVirtualDiskPath != other.mirrorVirtualDiskPath) return false
        return true
    }

    override fun hashCode(): Int = this.mirrorVirtualDiskPath.hashCode()

    public companion object {
        public operator fun invoke(
            mirrorVirtualDiskPath: Pcwstr = ConstPtr(0L),
        ): MirrorVirtualDiskParameters00 =
            MirrorVirtualDiskParameters00(
                mirrorVirtualDiskPathCtorArg = mirrorVirtualDiskPath,
            )
    }
}

public data class ModifyVhdsetParameters(
    public var version: ModifyVhdsetVersion = 0,
    public var anonymous: ModifyVhdsetParameters0 = ModifyVhdsetParameters0(),
)

public class ModifyVhdsetParameters0 internal constructor(
    public var snapshotPath: ModifyVhdsetParameters00,
    public var snapshotId: Guid,
    defaultFilePathCtorArg: Pcwstr,
) {
    public var defaultFilePath: Pcwstr = defaultFilePathCtorArg
        internal set

    public constructor() : this(
        snapshotPath = ModifyVhdsetParameters00(),
        snapshotId = Guid(),
        defaultFilePathCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): ModifyVhdsetParameters00 = this.snapshotPath

    public operator fun component2(): Guid = this.snapshotId

    public operator fun component3(): Pcwstr = this.defaultFilePath

    public fun copy(snapshotPath: ModifyVhdsetParameters00 = this.snapshotPath, snapshotId: Guid = this.snapshotId, defaultFilePath: Pcwstr = this.defaultFilePath): ModifyVhdsetParameters0 = ModifyVhdsetParameters0(snapshotPath = snapshotPath, snapshotId = snapshotId, defaultFilePathCtorArg = defaultFilePath)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ModifyVhdsetParameters0) return false
        if (this.snapshotPath != other.snapshotPath) return false
        if (this.snapshotId != other.snapshotId) return false
        if (this.defaultFilePath != other.defaultFilePath) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.snapshotPath.hashCode()
        result = 31 * result + this.snapshotId.hashCode()
        result = 31 * result + this.defaultFilePath.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            snapshotPath: ModifyVhdsetParameters00 = ModifyVhdsetParameters00(),
            snapshotId: Guid = Guid(),
            defaultFilePath: Pcwstr = ConstPtr(0L),
        ): ModifyVhdsetParameters0 =
            ModifyVhdsetParameters0(
                snapshotPath = snapshotPath,
                snapshotId = snapshotId,
                defaultFilePathCtorArg = defaultFilePath,
            )
    }
}

public class ModifyVhdsetParameters00 internal constructor(
    public var snapshotId: Guid,
    snapshotFilePathCtorArg: Pcwstr,
) {
    public var snapshotFilePath: Pcwstr = snapshotFilePathCtorArg
        internal set

    public constructor() : this(
        snapshotId = Guid(),
        snapshotFilePathCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Guid = this.snapshotId

    public operator fun component2(): Pcwstr = this.snapshotFilePath

    public fun copy(snapshotId: Guid = this.snapshotId, snapshotFilePath: Pcwstr = this.snapshotFilePath): ModifyVhdsetParameters00 = ModifyVhdsetParameters00(snapshotId = snapshotId, snapshotFilePathCtorArg = snapshotFilePath)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ModifyVhdsetParameters00) return false
        if (this.snapshotId != other.snapshotId) return false
        if (this.snapshotFilePath != other.snapshotFilePath) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.snapshotId.hashCode()
        result = 31 * result + this.snapshotFilePath.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            snapshotId: Guid = Guid(),
            snapshotFilePath: Pcwstr = ConstPtr(0L),
        ): ModifyVhdsetParameters00 =
            ModifyVhdsetParameters00(
                snapshotId = snapshotId,
                snapshotFilePathCtorArg = snapshotFilePath,
            )
    }
}

public data class OpenVirtualDiskParameters(
    public var version: OpenVirtualDiskVersion = 0,
    public var anonymous: OpenVirtualDiskParameters0 = OpenVirtualDiskParameters0(),
)

public data class OpenVirtualDiskParameters0(
    public var version1: OpenVirtualDiskParameters00 = OpenVirtualDiskParameters00(),
    public var version2: OpenVirtualDiskParameters01 = OpenVirtualDiskParameters01(),
    public var version3: OpenVirtualDiskParameters02 = OpenVirtualDiskParameters02(),
)

public data class OpenVirtualDiskParameters00(
    public var rWDepth: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<OpenVirtualDiskParameters00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<OpenVirtualDiskParameters00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): OpenVirtualDiskParameters00 =
                    OpenVirtualDiskParameters00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: OpenVirtualDiskParameters00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.rWDepth)
                }
            }
    }
}

public data class OpenVirtualDiskParameters01(
    public var getInfoOnly: Bool = 0,
    public var readOnly: Bool = 0,
    public var resiliencyGuid: Guid = Guid(),
)

public data class OpenVirtualDiskParameters02(
    public var getInfoOnly: Bool = 0,
    public var readOnly: Bool = 0,
    public var resiliencyGuid: Guid = Guid(),
    public var snapshotId: Guid = Guid(),
)

public data class QueryChangesVirtualDiskRange(
    public var byteOffset: ULong = 0uL,
    public var byteLength: ULong = 0uL,
    public var reserved: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QueryChangesVirtualDiskRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QueryChangesVirtualDiskRange> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): QueryChangesVirtualDiskRange =
                    QueryChangesVirtualDiskRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: QueryChangesVirtualDiskRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.byteOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.byteLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.reserved)
                }
            }
    }
}

public data class RawScsiVirtualDiskParameters(
    public var version: RawScsiVirtualDiskVersion = 0,
    public var anonymous: RawScsiVirtualDiskParameters0 = RawScsiVirtualDiskParameters0(),
)

public data class RawScsiVirtualDiskParameters0(
    public var version1: RawScsiVirtualDiskParameters00 = RawScsiVirtualDiskParameters00(),
)

public class RawScsiVirtualDiskParameters00 internal constructor(
    public var rSVDHandle: Bool,
    public var dataIn: UByte,
    public var cdbLength: UByte,
    public var senseInfoLength: UByte,
    public var srbFlags: UInt,
    public var dataTransferLength: UInt,
    dataBufferCtorArg: MutPtr<CVoid>,
    senseInfoCtorArg: MutPtr<UByte>,
    cdbCtorArg: MutPtr<UByte>,
) {
    public var dataBuffer: MutPtr<CVoid> = dataBufferCtorArg
        internal set

    public var senseInfo: MutPtr<UByte> = senseInfoCtorArg
        internal set

    public var cdb: MutPtr<UByte> = cdbCtorArg
        internal set

    public constructor() : this(
        rSVDHandle = 0,
        dataIn = 0u,
        cdbLength = 0u,
        senseInfoLength = 0u,
        srbFlags = 0u,
        dataTransferLength = 0u,
        dataBufferCtorArg = MutPtr(0L),
        senseInfoCtorArg = MutPtr(0L),
        cdbCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Bool = this.rSVDHandle

    public operator fun component2(): UByte = this.dataIn

    public operator fun component3(): UByte = this.cdbLength

    public operator fun component4(): UByte = this.senseInfoLength

    public operator fun component5(): UInt = this.srbFlags

    public operator fun component6(): UInt = this.dataTransferLength

    public operator fun component7(): MutPtr<CVoid> = this.dataBuffer

    public operator fun component8(): MutPtr<UByte> = this.senseInfo

    public operator fun component9(): MutPtr<UByte> = this.cdb

    public fun copy(rSVDHandle: Bool = this.rSVDHandle, dataIn: UByte = this.dataIn, cdbLength: UByte = this.cdbLength, senseInfoLength: UByte = this.senseInfoLength, srbFlags: UInt = this.srbFlags, dataTransferLength: UInt = this.dataTransferLength, dataBuffer: MutPtr<CVoid> = this.dataBuffer, senseInfo: MutPtr<UByte> = this.senseInfo, cdb: MutPtr<UByte> = this.cdb): RawScsiVirtualDiskParameters00 = RawScsiVirtualDiskParameters00(rSVDHandle = rSVDHandle, dataIn = dataIn, cdbLength = cdbLength, senseInfoLength = senseInfoLength, srbFlags = srbFlags, dataTransferLength = dataTransferLength, dataBufferCtorArg = dataBuffer, senseInfoCtorArg = senseInfo, cdbCtorArg = cdb)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RawScsiVirtualDiskParameters00) return false
        if (this.rSVDHandle != other.rSVDHandle) return false
        if (this.dataIn != other.dataIn) return false
        if (this.cdbLength != other.cdbLength) return false
        if (this.senseInfoLength != other.senseInfoLength) return false
        if (this.srbFlags != other.srbFlags) return false
        if (this.dataTransferLength != other.dataTransferLength) return false
        if (this.dataBuffer != other.dataBuffer) return false
        if (this.senseInfo != other.senseInfo) return false
        if (this.cdb != other.cdb) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rSVDHandle.hashCode()
        result = 31 * result + this.dataIn.hashCode()
        result = 31 * result + this.cdbLength.hashCode()
        result = 31 * result + this.senseInfoLength.hashCode()
        result = 31 * result + this.srbFlags.hashCode()
        result = 31 * result + this.dataTransferLength.hashCode()
        result = 31 * result + this.dataBuffer.hashCode()
        result = 31 * result + this.senseInfo.hashCode()
        result = 31 * result + this.cdb.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RawScsiVirtualDiskParameters00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RawScsiVirtualDiskParameters00> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): RawScsiVirtualDiskParameters00 =
                    RawScsiVirtualDiskParameters00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: RawScsiVirtualDiskParameters00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.rSVDHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.dataIn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.cdbLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.senseInfoLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.srbFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dataTransferLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.dataBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 24L, value.senseInfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 32L, value.cdb)
                }
            }

        public operator fun invoke(
            rSVDHandle: Bool = 0,
            dataIn: UByte = 0u,
            cdbLength: UByte = 0u,
            senseInfoLength: UByte = 0u,
            srbFlags: UInt = 0u,
            dataTransferLength: UInt = 0u,
            dataBuffer: MutPtr<CVoid> = MutPtr(0L),
            senseInfo: MutPtr<UByte> = MutPtr(0L),
            cdb: MutPtr<UByte> = MutPtr(0L),
        ): RawScsiVirtualDiskParameters00 =
            RawScsiVirtualDiskParameters00(
                rSVDHandle = rSVDHandle,
                dataIn = dataIn,
                cdbLength = cdbLength,
                senseInfoLength = senseInfoLength,
                srbFlags = srbFlags,
                dataTransferLength = dataTransferLength,
                dataBufferCtorArg = dataBuffer,
                senseInfoCtorArg = senseInfo,
                cdbCtorArg = cdb,
            )
    }
}

public data class RawScsiVirtualDiskResponse(
    public var version: RawScsiVirtualDiskVersion = 0,
    public var anonymous: RawScsiVirtualDiskResponse0 = RawScsiVirtualDiskResponse0(),
)

public data class RawScsiVirtualDiskResponse0(
    public var version1: RawScsiVirtualDiskResponse00 = RawScsiVirtualDiskResponse00(),
)

public data class RawScsiVirtualDiskResponse00(
    public var scsiStatus: UByte = 0u,
    public var senseInfoLength: UByte = 0u,
    public var dataTransferLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RawScsiVirtualDiskResponse00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RawScsiVirtualDiskResponse00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): RawScsiVirtualDiskResponse00 =
                    RawScsiVirtualDiskResponse00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: RawScsiVirtualDiskResponse00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.scsiStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.senseInfoLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dataTransferLength)
                }
            }
    }
}

public data class ResizeVirtualDiskParameters(
    public var version: ResizeVirtualDiskVersion = 0,
    public var anonymous: ResizeVirtualDiskParameters0 = ResizeVirtualDiskParameters0(),
)

public data class ResizeVirtualDiskParameters0(
    public var version1: ResizeVirtualDiskParameters00 = ResizeVirtualDiskParameters00(),
)

public data class ResizeVirtualDiskParameters00(
    public var newSize: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ResizeVirtualDiskParameters00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ResizeVirtualDiskParameters00> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ResizeVirtualDiskParameters00 =
                    ResizeVirtualDiskParameters00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ResizeVirtualDiskParameters00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.newSize)
                }
            }
    }
}

public data class SetVirtualDiskInfo(
    public var version: SetVirtualDiskInfoVersion = 0,
    public var anonymous: SetVirtualDiskInfo0 = SetVirtualDiskInfo0(),
)

public class SetVirtualDiskInfo0 internal constructor(
    parentFilePathCtorArg: Pcwstr,
    public var uniqueIdentifier: Guid,
    public var parentPathWithDepthInfo: SetVirtualDiskInfo00,
    public var vhdPhysicalSectorSize: UInt,
    public var virtualDiskId: Guid,
    public var changeTrackingEnabled: Bool,
    public var parentLocator: SetVirtualDiskInfo01,
) {
    public var parentFilePath: Pcwstr = parentFilePathCtorArg
        internal set

    public constructor() : this(
        parentFilePathCtorArg = ConstPtr(0L),
        uniqueIdentifier = Guid(),
        parentPathWithDepthInfo = SetVirtualDiskInfo00(),
        vhdPhysicalSectorSize = 0u,
        virtualDiskId = Guid(),
        changeTrackingEnabled = 0,
        parentLocator = SetVirtualDiskInfo01(),
    )

    public operator fun component1(): Pcwstr = this.parentFilePath

    public operator fun component2(): Guid = this.uniqueIdentifier

    public operator fun component3(): SetVirtualDiskInfo00 = this.parentPathWithDepthInfo

    public operator fun component4(): UInt = this.vhdPhysicalSectorSize

    public operator fun component5(): Guid = this.virtualDiskId

    public operator fun component6(): Bool = this.changeTrackingEnabled

    public operator fun component7(): SetVirtualDiskInfo01 = this.parentLocator

    public fun copy(parentFilePath: Pcwstr = this.parentFilePath, uniqueIdentifier: Guid = this.uniqueIdentifier, parentPathWithDepthInfo: SetVirtualDiskInfo00 = this.parentPathWithDepthInfo, vhdPhysicalSectorSize: UInt = this.vhdPhysicalSectorSize, virtualDiskId: Guid = this.virtualDiskId, changeTrackingEnabled: Bool = this.changeTrackingEnabled, parentLocator: SetVirtualDiskInfo01 = this.parentLocator): SetVirtualDiskInfo0 = SetVirtualDiskInfo0(parentFilePathCtorArg = parentFilePath, uniqueIdentifier = uniqueIdentifier, parentPathWithDepthInfo = parentPathWithDepthInfo, vhdPhysicalSectorSize = vhdPhysicalSectorSize, virtualDiskId = virtualDiskId, changeTrackingEnabled = changeTrackingEnabled, parentLocator = parentLocator)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SetVirtualDiskInfo0) return false
        if (this.parentFilePath != other.parentFilePath) return false
        if (this.uniqueIdentifier != other.uniqueIdentifier) return false
        if (this.parentPathWithDepthInfo != other.parentPathWithDepthInfo) return false
        if (this.vhdPhysicalSectorSize != other.vhdPhysicalSectorSize) return false
        if (this.virtualDiskId != other.virtualDiskId) return false
        if (this.changeTrackingEnabled != other.changeTrackingEnabled) return false
        if (this.parentLocator != other.parentLocator) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.parentFilePath.hashCode()
        result = 31 * result + this.uniqueIdentifier.hashCode()
        result = 31 * result + this.parentPathWithDepthInfo.hashCode()
        result = 31 * result + this.vhdPhysicalSectorSize.hashCode()
        result = 31 * result + this.virtualDiskId.hashCode()
        result = 31 * result + this.changeTrackingEnabled.hashCode()
        result = 31 * result + this.parentLocator.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            parentFilePath: Pcwstr = ConstPtr(0L),
            uniqueIdentifier: Guid = Guid(),
            parentPathWithDepthInfo: SetVirtualDiskInfo00 = SetVirtualDiskInfo00(),
            vhdPhysicalSectorSize: UInt = 0u,
            virtualDiskId: Guid = Guid(),
            changeTrackingEnabled: Bool = 0,
            parentLocator: SetVirtualDiskInfo01 = SetVirtualDiskInfo01(),
        ): SetVirtualDiskInfo0 =
            SetVirtualDiskInfo0(
                parentFilePathCtorArg = parentFilePath,
                uniqueIdentifier = uniqueIdentifier,
                parentPathWithDepthInfo = parentPathWithDepthInfo,
                vhdPhysicalSectorSize = vhdPhysicalSectorSize,
                virtualDiskId = virtualDiskId,
                changeTrackingEnabled = changeTrackingEnabled,
                parentLocator = parentLocator,
            )
    }
}

public class SetVirtualDiskInfo01 internal constructor(
    public var linkageId: Guid,
    parentFilePathCtorArg: Pcwstr,
) {
    public var parentFilePath: Pcwstr = parentFilePathCtorArg
        internal set

    public constructor() : this(
        linkageId = Guid(),
        parentFilePathCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Guid = this.linkageId

    public operator fun component2(): Pcwstr = this.parentFilePath

    public fun copy(linkageId: Guid = this.linkageId, parentFilePath: Pcwstr = this.parentFilePath): SetVirtualDiskInfo01 = SetVirtualDiskInfo01(linkageId = linkageId, parentFilePathCtorArg = parentFilePath)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SetVirtualDiskInfo01) return false
        if (this.linkageId != other.linkageId) return false
        if (this.parentFilePath != other.parentFilePath) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.linkageId.hashCode()
        result = 31 * result + this.parentFilePath.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            linkageId: Guid = Guid(),
            parentFilePath: Pcwstr = ConstPtr(0L),
        ): SetVirtualDiskInfo01 =
            SetVirtualDiskInfo01(
                linkageId = linkageId,
                parentFilePathCtorArg = parentFilePath,
            )
    }
}

public class SetVirtualDiskInfo00 internal constructor(
    public var childDepth: UInt,
    parentFilePathCtorArg: Pcwstr,
) {
    public var parentFilePath: Pcwstr = parentFilePathCtorArg
        internal set

    public constructor() : this(
        childDepth = 0u,
        parentFilePathCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.childDepth

    public operator fun component2(): Pcwstr = this.parentFilePath

    public fun copy(childDepth: UInt = this.childDepth, parentFilePath: Pcwstr = this.parentFilePath): SetVirtualDiskInfo00 = SetVirtualDiskInfo00(childDepth = childDepth, parentFilePathCtorArg = parentFilePath)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SetVirtualDiskInfo00) return false
        if (this.childDepth != other.childDepth) return false
        if (this.parentFilePath != other.parentFilePath) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.childDepth.hashCode()
        result = 31 * result + this.parentFilePath.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            childDepth: UInt = 0u,
            parentFilePath: Pcwstr = ConstPtr(0L),
        ): SetVirtualDiskInfo00 =
            SetVirtualDiskInfo00(
                childDepth = childDepth,
                parentFilePathCtorArg = parentFilePath,
            )
    }
}

public data class StorageDependencyInfo(
    public var version: StorageDependencyInfoVersion = 0,
    public var numberEntries: UInt = 0u,
    public var anonymous: StorageDependencyInfo0 = StorageDependencyInfo0(),
)

public data class StorageDependencyInfo0(
    public var version1Entries: List<StorageDependencyInfoType1> = List(1) { StorageDependencyInfoType1() },
    public var version2Entries: List<StorageDependencyInfoType2> = List(1) { StorageDependencyInfoType2() },
)

public data class StorageDependencyInfoType1(
    public var dependencyTypeFlags: DependentDiskFlag = 0,
    public var providerSpecificFlags: UInt = 0u,
    public var virtualStorageType: VirtualStorageType = VirtualStorageType(),
)

public class StorageDependencyInfoType2 internal constructor(
    public var dependencyTypeFlags: DependentDiskFlag,
    public var providerSpecificFlags: UInt,
    public var virtualStorageType: VirtualStorageType,
    public var ancestorLevel: UInt,
    dependencyDeviceNameCtorArg: Pwstr,
    hostVolumeNameCtorArg: Pwstr,
    dependentVolumeNameCtorArg: Pwstr,
    dependentVolumeRelativePathCtorArg: Pwstr,
) {
    public var dependencyDeviceName: Pwstr = dependencyDeviceNameCtorArg
        internal set

    public var hostVolumeName: Pwstr = hostVolumeNameCtorArg
        internal set

    public var dependentVolumeName: Pwstr = dependentVolumeNameCtorArg
        internal set

    public var dependentVolumeRelativePath: Pwstr = dependentVolumeRelativePathCtorArg
        internal set

    public constructor() : this(
        dependencyTypeFlags = 0,
        providerSpecificFlags = 0u,
        virtualStorageType = VirtualStorageType(),
        ancestorLevel = 0u,
        dependencyDeviceNameCtorArg = MutPtr(0L),
        hostVolumeNameCtorArg = MutPtr(0L),
        dependentVolumeNameCtorArg = MutPtr(0L),
        dependentVolumeRelativePathCtorArg = MutPtr(0L),
    )

    public operator fun component1(): DependentDiskFlag = this.dependencyTypeFlags

    public operator fun component2(): UInt = this.providerSpecificFlags

    public operator fun component3(): VirtualStorageType = this.virtualStorageType

    public operator fun component4(): UInt = this.ancestorLevel

    public operator fun component5(): Pwstr = this.dependencyDeviceName

    public operator fun component6(): Pwstr = this.hostVolumeName

    public operator fun component7(): Pwstr = this.dependentVolumeName

    public operator fun component8(): Pwstr = this.dependentVolumeRelativePath

    public fun copy(dependencyTypeFlags: DependentDiskFlag = this.dependencyTypeFlags, providerSpecificFlags: UInt = this.providerSpecificFlags, virtualStorageType: VirtualStorageType = this.virtualStorageType, ancestorLevel: UInt = this.ancestorLevel, dependencyDeviceName: Pwstr = this.dependencyDeviceName, hostVolumeName: Pwstr = this.hostVolumeName, dependentVolumeName: Pwstr = this.dependentVolumeName, dependentVolumeRelativePath: Pwstr = this.dependentVolumeRelativePath): StorageDependencyInfoType2 = StorageDependencyInfoType2(dependencyTypeFlags = dependencyTypeFlags, providerSpecificFlags = providerSpecificFlags, virtualStorageType = virtualStorageType, ancestorLevel = ancestorLevel, dependencyDeviceNameCtorArg = dependencyDeviceName, hostVolumeNameCtorArg = hostVolumeName, dependentVolumeNameCtorArg = dependentVolumeName, dependentVolumeRelativePathCtorArg = dependentVolumeRelativePath)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StorageDependencyInfoType2) return false
        if (this.dependencyTypeFlags != other.dependencyTypeFlags) return false
        if (this.providerSpecificFlags != other.providerSpecificFlags) return false
        if (this.virtualStorageType != other.virtualStorageType) return false
        if (this.ancestorLevel != other.ancestorLevel) return false
        if (this.dependencyDeviceName != other.dependencyDeviceName) return false
        if (this.hostVolumeName != other.hostVolumeName) return false
        if (this.dependentVolumeName != other.dependentVolumeName) return false
        if (this.dependentVolumeRelativePath != other.dependentVolumeRelativePath) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dependencyTypeFlags.hashCode()
        result = 31 * result + this.providerSpecificFlags.hashCode()
        result = 31 * result + this.virtualStorageType.hashCode()
        result = 31 * result + this.ancestorLevel.hashCode()
        result = 31 * result + this.dependencyDeviceName.hashCode()
        result = 31 * result + this.hostVolumeName.hashCode()
        result = 31 * result + this.dependentVolumeName.hashCode()
        result = 31 * result + this.dependentVolumeRelativePath.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dependencyTypeFlags: DependentDiskFlag = 0,
            providerSpecificFlags: UInt = 0u,
            virtualStorageType: VirtualStorageType = VirtualStorageType(),
            ancestorLevel: UInt = 0u,
            dependencyDeviceName: Pwstr = MutPtr(0L),
            hostVolumeName: Pwstr = MutPtr(0L),
            dependentVolumeName: Pwstr = MutPtr(0L),
            dependentVolumeRelativePath: Pwstr = MutPtr(0L),
        ): StorageDependencyInfoType2 =
            StorageDependencyInfoType2(
                dependencyTypeFlags = dependencyTypeFlags,
                providerSpecificFlags = providerSpecificFlags,
                virtualStorageType = virtualStorageType,
                ancestorLevel = ancestorLevel,
                dependencyDeviceNameCtorArg = dependencyDeviceName,
                hostVolumeNameCtorArg = hostVolumeName,
                dependentVolumeNameCtorArg = dependentVolumeName,
                dependentVolumeRelativePathCtorArg = dependentVolumeRelativePath,
            )
    }
}

public data class TakeSnapshotVhdsetParameters(
    public var version: TakeSnapshotVhdsetVersion = 0,
    public var anonymous: TakeSnapshotVhdsetParameters0 = TakeSnapshotVhdsetParameters0(),
)

public data class TakeSnapshotVhdsetParameters0(
    public var version1: TakeSnapshotVhdsetParameters00 = TakeSnapshotVhdsetParameters00(),
)

public data class TakeSnapshotVhdsetParameters00(
    public var snapshotId: Guid = Guid(),
)

public data class VirtualDiskProgress(
    public var operationStatus: UInt = 0u,
    public var currentValue: ULong = 0uL,
    public var completionValue: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualDiskProgress> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VirtualDiskProgress> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): VirtualDiskProgress =
                    VirtualDiskProgress(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: VirtualDiskProgress) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.operationStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.currentValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.completionValue)
                }
            }
    }
}

public data class VirtualStorageType(
    public var deviceId: UInt = 0u,
    public var vendorId: Guid = Guid(),
)
