@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rectl

public class D3dddiargCreateresource internal constructor(
    public var format: D3dddiformat,
    public var pool: D3dddiPool,
    public var multisampleType: D3dddimultisampleType,
    public var multisampleQuality: UInt,
    pSurfListCtorArg: ConstPtr<D3dddiSurfaceinfo>,
    public var surfCount: UInt,
    public var mipLevels: UInt,
    public var fvf: UInt,
    public var vidPnSourceId: UInt,
    public var refreshRate: D3dddiRational,
    hResourceCtorArg: Handle,
    public var flags: D3dddiResourceflags,
    public var rotation: D3dddiRotation,
) {
    public var pSurfList: ConstPtr<D3dddiSurfaceinfo> = pSurfListCtorArg
        internal set

    public var hResource: Handle = hResourceCtorArg
        internal set

    public constructor() : this(
        format = 0u,
        pool = 0,
        multisampleType = 0,
        multisampleQuality = 0u,
        pSurfListCtorArg = ConstPtr(0L),
        surfCount = 0u,
        mipLevels = 0u,
        fvf = 0u,
        vidPnSourceId = 0u,
        refreshRate = D3dddiRational(),
        hResourceCtorArg = MutPtr(0L),
        flags = D3dddiResourceflags(),
        rotation = 0,
    )

    public operator fun component1(): D3dddiformat = this.format

    public operator fun component2(): D3dddiPool = this.pool

    public operator fun component3(): D3dddimultisampleType = this.multisampleType

    public operator fun component4(): UInt = this.multisampleQuality

    public operator fun component5(): ConstPtr<D3dddiSurfaceinfo> = this.pSurfList

    public operator fun component6(): UInt = this.surfCount

    public operator fun component7(): UInt = this.mipLevels

    public operator fun component8(): UInt = this.fvf

    public operator fun component9(): UInt = this.vidPnSourceId

    public operator fun component10(): D3dddiRational = this.refreshRate

    public operator fun component11(): Handle = this.hResource

    public operator fun component12(): D3dddiResourceflags = this.flags

    public operator fun component13(): D3dddiRotation = this.rotation

    public fun copy(format: D3dddiformat = this.format, pool: D3dddiPool = this.pool, multisampleType: D3dddimultisampleType = this.multisampleType, multisampleQuality: UInt = this.multisampleQuality, pSurfList: ConstPtr<D3dddiSurfaceinfo> = this.pSurfList, surfCount: UInt = this.surfCount, mipLevels: UInt = this.mipLevels, fvf: UInt = this.fvf, vidPnSourceId: UInt = this.vidPnSourceId, refreshRate: D3dddiRational = this.refreshRate, hResource: Handle = this.hResource, flags: D3dddiResourceflags = this.flags, rotation: D3dddiRotation = this.rotation): D3dddiargCreateresource = D3dddiargCreateresource(format = format, pool = pool, multisampleType = multisampleType, multisampleQuality = multisampleQuality, pSurfListCtorArg = pSurfList, surfCount = surfCount, mipLevels = mipLevels, fvf = fvf, vidPnSourceId = vidPnSourceId, refreshRate = refreshRate, hResourceCtorArg = hResource, flags = flags, rotation = rotation)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiargCreateresource) return false
        if (this.format != other.format) return false
        if (this.pool != other.pool) return false
        if (this.multisampleType != other.multisampleType) return false
        if (this.multisampleQuality != other.multisampleQuality) return false
        if (this.pSurfList != other.pSurfList) return false
        if (this.surfCount != other.surfCount) return false
        if (this.mipLevels != other.mipLevels) return false
        if (this.fvf != other.fvf) return false
        if (this.vidPnSourceId != other.vidPnSourceId) return false
        if (this.refreshRate != other.refreshRate) return false
        if (this.hResource != other.hResource) return false
        if (this.flags != other.flags) return false
        if (this.rotation != other.rotation) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.format.hashCode()
        result = 31 * result + this.pool.hashCode()
        result = 31 * result + this.multisampleType.hashCode()
        result = 31 * result + this.multisampleQuality.hashCode()
        result = 31 * result + this.pSurfList.hashCode()
        result = 31 * result + this.surfCount.hashCode()
        result = 31 * result + this.mipLevels.hashCode()
        result = 31 * result + this.fvf.hashCode()
        result = 31 * result + this.vidPnSourceId.hashCode()
        result = 31 * result + this.refreshRate.hashCode()
        result = 31 * result + this.hResource.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.rotation.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            format: D3dddiformat = 0u,
            pool: D3dddiPool = 0,
            multisampleType: D3dddimultisampleType = 0,
            multisampleQuality: UInt = 0u,
            pSurfList: ConstPtr<D3dddiSurfaceinfo> = ConstPtr(0L),
            surfCount: UInt = 0u,
            mipLevels: UInt = 0u,
            fvf: UInt = 0u,
            vidPnSourceId: UInt = 0u,
            refreshRate: D3dddiRational = D3dddiRational(),
            hResource: Handle = MutPtr(0L),
            flags: D3dddiResourceflags = D3dddiResourceflags(),
            rotation: D3dddiRotation = 0,
        ): D3dddiargCreateresource =
            D3dddiargCreateresource(
                format = format,
                pool = pool,
                multisampleType = multisampleType,
                multisampleQuality = multisampleQuality,
                pSurfListCtorArg = pSurfList,
                surfCount = surfCount,
                mipLevels = mipLevels,
                fvf = fvf,
                vidPnSourceId = vidPnSourceId,
                refreshRate = refreshRate,
                hResourceCtorArg = hResource,
                flags = flags,
                rotation = rotation,
            )
    }
}

public class D3dddiargCreateresource2 internal constructor(
    public var format: D3dddiformat,
    public var pool: D3dddiPool,
    public var multisampleType: D3dddimultisampleType,
    public var multisampleQuality: UInt,
    pSurfListCtorArg: ConstPtr<D3dddiSurfaceinfo>,
    public var surfCount: UInt,
    public var mipLevels: UInt,
    public var fvf: UInt,
    public var vidPnSourceId: UInt,
    public var refreshRate: D3dddiRational,
    hResourceCtorArg: Handle,
    public var flags: D3dddiResourceflags,
    public var rotation: D3dddiRotation,
    public var flags2: D3dddiResourceflags2,
) {
    public var pSurfList: ConstPtr<D3dddiSurfaceinfo> = pSurfListCtorArg
        internal set

    public var hResource: Handle = hResourceCtorArg
        internal set

    public constructor() : this(
        format = 0u,
        pool = 0,
        multisampleType = 0,
        multisampleQuality = 0u,
        pSurfListCtorArg = ConstPtr(0L),
        surfCount = 0u,
        mipLevels = 0u,
        fvf = 0u,
        vidPnSourceId = 0u,
        refreshRate = D3dddiRational(),
        hResourceCtorArg = MutPtr(0L),
        flags = D3dddiResourceflags(),
        rotation = 0,
        flags2 = D3dddiResourceflags2(),
    )

    public operator fun component1(): D3dddiformat = this.format

    public operator fun component2(): D3dddiPool = this.pool

    public operator fun component3(): D3dddimultisampleType = this.multisampleType

    public operator fun component4(): UInt = this.multisampleQuality

    public operator fun component5(): ConstPtr<D3dddiSurfaceinfo> = this.pSurfList

    public operator fun component6(): UInt = this.surfCount

    public operator fun component7(): UInt = this.mipLevels

    public operator fun component8(): UInt = this.fvf

    public operator fun component9(): UInt = this.vidPnSourceId

    public operator fun component10(): D3dddiRational = this.refreshRate

    public operator fun component11(): Handle = this.hResource

    public operator fun component12(): D3dddiResourceflags = this.flags

    public operator fun component13(): D3dddiRotation = this.rotation

    public operator fun component14(): D3dddiResourceflags2 = this.flags2

    public fun copy(format: D3dddiformat = this.format, pool: D3dddiPool = this.pool, multisampleType: D3dddimultisampleType = this.multisampleType, multisampleQuality: UInt = this.multisampleQuality, pSurfList: ConstPtr<D3dddiSurfaceinfo> = this.pSurfList, surfCount: UInt = this.surfCount, mipLevels: UInt = this.mipLevels, fvf: UInt = this.fvf, vidPnSourceId: UInt = this.vidPnSourceId, refreshRate: D3dddiRational = this.refreshRate, hResource: Handle = this.hResource, flags: D3dddiResourceflags = this.flags, rotation: D3dddiRotation = this.rotation, flags2: D3dddiResourceflags2 = this.flags2): D3dddiargCreateresource2 = D3dddiargCreateresource2(format = format, pool = pool, multisampleType = multisampleType, multisampleQuality = multisampleQuality, pSurfListCtorArg = pSurfList, surfCount = surfCount, mipLevels = mipLevels, fvf = fvf, vidPnSourceId = vidPnSourceId, refreshRate = refreshRate, hResourceCtorArg = hResource, flags = flags, rotation = rotation, flags2 = flags2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiargCreateresource2) return false
        if (this.format != other.format) return false
        if (this.pool != other.pool) return false
        if (this.multisampleType != other.multisampleType) return false
        if (this.multisampleQuality != other.multisampleQuality) return false
        if (this.pSurfList != other.pSurfList) return false
        if (this.surfCount != other.surfCount) return false
        if (this.mipLevels != other.mipLevels) return false
        if (this.fvf != other.fvf) return false
        if (this.vidPnSourceId != other.vidPnSourceId) return false
        if (this.refreshRate != other.refreshRate) return false
        if (this.hResource != other.hResource) return false
        if (this.flags != other.flags) return false
        if (this.rotation != other.rotation) return false
        if (this.flags2 != other.flags2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.format.hashCode()
        result = 31 * result + this.pool.hashCode()
        result = 31 * result + this.multisampleType.hashCode()
        result = 31 * result + this.multisampleQuality.hashCode()
        result = 31 * result + this.pSurfList.hashCode()
        result = 31 * result + this.surfCount.hashCode()
        result = 31 * result + this.mipLevels.hashCode()
        result = 31 * result + this.fvf.hashCode()
        result = 31 * result + this.vidPnSourceId.hashCode()
        result = 31 * result + this.refreshRate.hashCode()
        result = 31 * result + this.hResource.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.rotation.hashCode()
        result = 31 * result + this.flags2.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            format: D3dddiformat = 0u,
            pool: D3dddiPool = 0,
            multisampleType: D3dddimultisampleType = 0,
            multisampleQuality: UInt = 0u,
            pSurfList: ConstPtr<D3dddiSurfaceinfo> = ConstPtr(0L),
            surfCount: UInt = 0u,
            mipLevels: UInt = 0u,
            fvf: UInt = 0u,
            vidPnSourceId: UInt = 0u,
            refreshRate: D3dddiRational = D3dddiRational(),
            hResource: Handle = MutPtr(0L),
            flags: D3dddiResourceflags = D3dddiResourceflags(),
            rotation: D3dddiRotation = 0,
            flags2: D3dddiResourceflags2 = D3dddiResourceflags2(),
        ): D3dddiargCreateresource2 =
            D3dddiargCreateresource2(
                format = format,
                pool = pool,
                multisampleType = multisampleType,
                multisampleQuality = multisampleQuality,
                pSurfListCtorArg = pSurfList,
                surfCount = surfCount,
                mipLevels = mipLevels,
                fvf = fvf,
                vidPnSourceId = vidPnSourceId,
                refreshRate = refreshRate,
                hResourceCtorArg = hResource,
                flags = flags,
                rotation = rotation,
                flags2 = flags2,
            )
    }
}

public data class D3dddicbDestroyallocation2flags(
    public var anonymous: D3dddicbDestroyallocation2flags0 = D3dddicbDestroyallocation2flags0(),
)

public data class D3dddicbDestroyallocation2flags0(
    public var anonymous: D3dddicbDestroyallocation2flags00 = D3dddicbDestroyallocation2flags00(),
    public var value: UInt = 0u,
)

public data class D3dddicbDestroyallocation2flags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddicbDestroyallocation2flags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddicbDestroyallocation2flags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dddicbDestroyallocation2flags00 =
                    D3dddicbDestroyallocation2flags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dddicbDestroyallocation2flags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dddicbLock2flags(
    public var anonymous: D3dddicbLock2flags0 = D3dddicbLock2flags0(),
)

public data class D3dddicbLock2flags0(
    public var anonymous: D3dddicbLock2flags00 = D3dddicbLock2flags00(),
    public var value: UInt = 0u,
)

public data class D3dddicbLock2flags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddicbLock2flags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddicbLock2flags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dddicbLock2flags00 =
                    D3dddicbLock2flags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dddicbLock2flags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dddicbLockflags(
    public var anonymous: D3dddicbLockflags0 = D3dddicbLockflags0(),
)

public data class D3dddicbLockflags0(
    public var anonymous: D3dddicbLockflags00 = D3dddicbLockflags00(),
    public var value: UInt = 0u,
)

public data class D3dddicbLockflags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddicbLockflags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddicbLockflags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dddicbLockflags00 =
                    D3dddicbLockflags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dddicbLockflags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dddicbSignalflags(
    public var anonymous: D3dddicbSignalflags0 = D3dddicbSignalflags0(),
)

public data class D3dddicbSignalflags0(
    public var anonymous: D3dddicbSignalflags00 = D3dddicbSignalflags00(),
    public var value: UInt = 0u,
)

public data class D3dddicbSignalflags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddicbSignalflags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddicbSignalflags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dddicbSignalflags00 =
                    D3dddicbSignalflags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dddicbSignalflags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dddigpuvirtualaddressProtectionType(
    public var anonymous: D3dddigpuvirtualaddressProtectionType0 = D3dddigpuvirtualaddressProtectionType0(),
)

public data class D3dddigpuvirtualaddressProtectionType0(
    public var anonymous: D3dddigpuvirtualaddressProtectionType00 = D3dddigpuvirtualaddressProtectionType00(),
    public var value: ULong = 0uL,
)

public data class D3dddigpuvirtualaddressProtectionType00(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddigpuvirtualaddressProtectionType00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddigpuvirtualaddressProtectionType00> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dddigpuvirtualaddressProtectionType00 =
                    D3dddigpuvirtualaddressProtectionType00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dddigpuvirtualaddressProtectionType00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dddirect(
    public var left: Int = 0,
    public var top: Int = 0,
    public var right: Int = 0,
    public var bottom: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddirect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddirect> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): D3dddirect =
                    D3dddirect(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: D3dddirect) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.left)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.top)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.right)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.bottom)
                }
            }
    }
}

public class D3dddiAllocationinfo internal constructor(
    public var hAllocation: UInt,
    pSystemMemCtorArg: ConstPtr<CVoid>,
    pPrivateDriverDataCtorArg: MutPtr<CVoid>,
    public var privateDriverDataSize: UInt,
    public var vidPnSourceId: UInt,
    public var flags: D3dddiAllocationinfo0,
) {
    public var pSystemMem: ConstPtr<CVoid> = pSystemMemCtorArg
        internal set

    public var pPrivateDriverData: MutPtr<CVoid> = pPrivateDriverDataCtorArg
        internal set

    public constructor() : this(
        hAllocation = 0u,
        pSystemMemCtorArg = ConstPtr(0L),
        pPrivateDriverDataCtorArg = MutPtr(0L),
        privateDriverDataSize = 0u,
        vidPnSourceId = 0u,
        flags = D3dddiAllocationinfo0(),
    )

    public operator fun component1(): UInt = this.hAllocation

    public operator fun component2(): ConstPtr<CVoid> = this.pSystemMem

    public operator fun component3(): MutPtr<CVoid> = this.pPrivateDriverData

    public operator fun component4(): UInt = this.privateDriverDataSize

    public operator fun component5(): UInt = this.vidPnSourceId

    public operator fun component6(): D3dddiAllocationinfo0 = this.flags

    public fun copy(hAllocation: UInt = this.hAllocation, pSystemMem: ConstPtr<CVoid> = this.pSystemMem, pPrivateDriverData: MutPtr<CVoid> = this.pPrivateDriverData, privateDriverDataSize: UInt = this.privateDriverDataSize, vidPnSourceId: UInt = this.vidPnSourceId, flags: D3dddiAllocationinfo0 = this.flags): D3dddiAllocationinfo = D3dddiAllocationinfo(hAllocation = hAllocation, pSystemMemCtorArg = pSystemMem, pPrivateDriverDataCtorArg = pPrivateDriverData, privateDriverDataSize = privateDriverDataSize, vidPnSourceId = vidPnSourceId, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiAllocationinfo) return false
        if (this.hAllocation != other.hAllocation) return false
        if (this.pSystemMem != other.pSystemMem) return false
        if (this.pPrivateDriverData != other.pPrivateDriverData) return false
        if (this.privateDriverDataSize != other.privateDriverDataSize) return false
        if (this.vidPnSourceId != other.vidPnSourceId) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hAllocation.hashCode()
        result = 31 * result + this.pSystemMem.hashCode()
        result = 31 * result + this.pPrivateDriverData.hashCode()
        result = 31 * result + this.privateDriverDataSize.hashCode()
        result = 31 * result + this.vidPnSourceId.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hAllocation: UInt = 0u,
            pSystemMem: ConstPtr<CVoid> = ConstPtr(0L),
            pPrivateDriverData: MutPtr<CVoid> = MutPtr(0L),
            privateDriverDataSize: UInt = 0u,
            vidPnSourceId: UInt = 0u,
            flags: D3dddiAllocationinfo0 = D3dddiAllocationinfo0(),
        ): D3dddiAllocationinfo =
            D3dddiAllocationinfo(
                hAllocation = hAllocation,
                pSystemMemCtorArg = pSystemMem,
                pPrivateDriverDataCtorArg = pPrivateDriverData,
                privateDriverDataSize = privateDriverDataSize,
                vidPnSourceId = vidPnSourceId,
                flags = flags,
            )
    }
}

public data class D3dddiAllocationinfo0(
    public var anonymous: D3dddiAllocationinfo00 = D3dddiAllocationinfo00(),
    public var value: UInt = 0u,
)

public data class D3dddiAllocationinfo00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiAllocationinfo00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiAllocationinfo00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dddiAllocationinfo00 =
                    D3dddiAllocationinfo00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dddiAllocationinfo00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class D3dddiAllocationinfo2 internal constructor(
    public var hAllocation: UInt,
    public var anonymous1: D3dddiAllocationinfo20,
    pPrivateDriverDataCtorArg: MutPtr<CVoid>,
    public var privateDriverDataSize: UInt,
    public var vidPnSourceId: UInt,
    public var flags: D3dddiAllocationinfo21,
    public var gpuVirtualAddress: ULong,
    public var anonymous2: D3dddiAllocationinfo22,
    public var reserved: IntArray,
) {
    public var pPrivateDriverData: MutPtr<CVoid> = pPrivateDriverDataCtorArg
        internal set

    public constructor() : this(
        hAllocation = 0u,
        anonymous1 = D3dddiAllocationinfo20(),
        pPrivateDriverDataCtorArg = MutPtr(0L),
        privateDriverDataSize = 0u,
        vidPnSourceId = 0u,
        flags = D3dddiAllocationinfo21(),
        gpuVirtualAddress = 0uL,
        anonymous2 = D3dddiAllocationinfo22(),
        reserved = IntArray(5),
    )

    public operator fun component1(): UInt = this.hAllocation

    public operator fun component2(): D3dddiAllocationinfo20 = this.anonymous1

    public operator fun component3(): MutPtr<CVoid> = this.pPrivateDriverData

    public operator fun component4(): UInt = this.privateDriverDataSize

    public operator fun component5(): UInt = this.vidPnSourceId

    public operator fun component6(): D3dddiAllocationinfo21 = this.flags

    public operator fun component7(): ULong = this.gpuVirtualAddress

    public operator fun component8(): D3dddiAllocationinfo22 = this.anonymous2

    public operator fun component9(): IntArray = this.reserved

    public fun copy(hAllocation: UInt = this.hAllocation, anonymous1: D3dddiAllocationinfo20 = this.anonymous1, pPrivateDriverData: MutPtr<CVoid> = this.pPrivateDriverData, privateDriverDataSize: UInt = this.privateDriverDataSize, vidPnSourceId: UInt = this.vidPnSourceId, flags: D3dddiAllocationinfo21 = this.flags, gpuVirtualAddress: ULong = this.gpuVirtualAddress, anonymous2: D3dddiAllocationinfo22 = this.anonymous2, reserved: IntArray = this.reserved): D3dddiAllocationinfo2 = D3dddiAllocationinfo2(hAllocation = hAllocation, anonymous1 = anonymous1, pPrivateDriverDataCtorArg = pPrivateDriverData, privateDriverDataSize = privateDriverDataSize, vidPnSourceId = vidPnSourceId, flags = flags, gpuVirtualAddress = gpuVirtualAddress, anonymous2 = anonymous2, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiAllocationinfo2) return false
        if (this.hAllocation != other.hAllocation) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.pPrivateDriverData != other.pPrivateDriverData) return false
        if (this.privateDriverDataSize != other.privateDriverDataSize) return false
        if (this.vidPnSourceId != other.vidPnSourceId) return false
        if (this.flags != other.flags) return false
        if (this.gpuVirtualAddress != other.gpuVirtualAddress) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hAllocation.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.pPrivateDriverData.hashCode()
        result = 31 * result + this.privateDriverDataSize.hashCode()
        result = 31 * result + this.vidPnSourceId.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.gpuVirtualAddress.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hAllocation: UInt = 0u,
            anonymous1: D3dddiAllocationinfo20 = D3dddiAllocationinfo20(),
            pPrivateDriverData: MutPtr<CVoid> = MutPtr(0L),
            privateDriverDataSize: UInt = 0u,
            vidPnSourceId: UInt = 0u,
            flags: D3dddiAllocationinfo21 = D3dddiAllocationinfo21(),
            gpuVirtualAddress: ULong = 0uL,
            anonymous2: D3dddiAllocationinfo22 = D3dddiAllocationinfo22(),
            reserved: IntArray = IntArray(5),
        ): D3dddiAllocationinfo2 =
            D3dddiAllocationinfo2(
                hAllocation = hAllocation,
                anonymous1 = anonymous1,
                pPrivateDriverDataCtorArg = pPrivateDriverData,
                privateDriverDataSize = privateDriverDataSize,
                vidPnSourceId = vidPnSourceId,
                flags = flags,
                gpuVirtualAddress = gpuVirtualAddress,
                anonymous2 = anonymous2,
                reserved = reserved,
            )
    }
}

public class D3dddiAllocationinfo20 internal constructor(
    hSectionCtorArg: Handle,
    pSystemMemCtorArg: ConstPtr<CVoid>,
) {
    public var hSection: Handle = hSectionCtorArg
        internal set

    public var pSystemMem: ConstPtr<CVoid> = pSystemMemCtorArg
        internal set

    public constructor() : this(
        hSectionCtorArg = MutPtr(0L),
        pSystemMemCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Handle = this.hSection

    public operator fun component2(): ConstPtr<CVoid> = this.pSystemMem

    public fun copy(hSection: Handle = this.hSection, pSystemMem: ConstPtr<CVoid> = this.pSystemMem): D3dddiAllocationinfo20 = D3dddiAllocationinfo20(hSectionCtorArg = hSection, pSystemMemCtorArg = pSystemMem)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiAllocationinfo20) return false
        if (this.hSection != other.hSection) return false
        if (this.pSystemMem != other.pSystemMem) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hSection.hashCode()
        result = 31 * result + this.pSystemMem.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hSection: Handle = MutPtr(0L),
            pSystemMem: ConstPtr<CVoid> = ConstPtr(0L),
        ): D3dddiAllocationinfo20 =
            D3dddiAllocationinfo20(
                hSectionCtorArg = hSection,
                pSystemMemCtorArg = pSystemMem,
            )
    }
}

public data class D3dddiAllocationinfo22(
    public var priority: UInt = 0u,
    public var unused: Int = 0,
)

public data class D3dddiAllocationinfo21(
    public var anonymous: D3dddiAllocationinfo210 = D3dddiAllocationinfo210(),
    public var value: UInt = 0u,
)

public data class D3dddiAllocationinfo210(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiAllocationinfo210> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiAllocationinfo210> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dddiAllocationinfo210 =
                    D3dddiAllocationinfo210(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dddiAllocationinfo210) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dddiAllocationlist(
    public var hAllocation: UInt = 0u,
    public var anonymous: D3dddiAllocationlist0 = D3dddiAllocationlist0(),
)

public data class D3dddiAllocationlist0(
    public var anonymous: D3dddiAllocationlist00 = D3dddiAllocationlist00(),
    public var value: UInt = 0u,
)

public data class D3dddiAllocationlist00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiAllocationlist00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiAllocationlist00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dddiAllocationlist00 =
                    D3dddiAllocationlist00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dddiAllocationlist00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dddiCreatecontextflags(
    public var anonymous: D3dddiCreatecontextflags0 = D3dddiCreatecontextflags0(),
)

public data class D3dddiCreatecontextflags0(
    public var anonymous: D3dddiCreatecontextflags00 = D3dddiCreatecontextflags00(),
    public var value: UInt = 0u,
)

public data class D3dddiCreatecontextflags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiCreatecontextflags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiCreatecontextflags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dddiCreatecontextflags00 =
                    D3dddiCreatecontextflags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dddiCreatecontextflags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dddiCreatehwcontextflags(
    public var anonymous: D3dddiCreatehwcontextflags0 = D3dddiCreatehwcontextflags0(),
)

public data class D3dddiCreatehwcontextflags0(
    public var anonymous: D3dddiCreatehwcontextflags00 = D3dddiCreatehwcontextflags00(),
    public var value: UInt = 0u,
)

public data class D3dddiCreatehwcontextflags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiCreatehwcontextflags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiCreatehwcontextflags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dddiCreatehwcontextflags00 =
                    D3dddiCreatehwcontextflags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dddiCreatehwcontextflags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dddiCreatehwqueueflags(
    public var anonymous: D3dddiCreatehwqueueflags0 = D3dddiCreatehwqueueflags0(),
)

public data class D3dddiCreatehwqueueflags0(
    public var anonymous: D3dddiCreatehwqueueflags00 = D3dddiCreatehwqueueflags00(),
    public var value: UInt = 0u,
)

public data class D3dddiCreatehwqueueflags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiCreatehwqueueflags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiCreatehwqueueflags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dddiCreatehwqueueflags00 =
                    D3dddiCreatehwqueueflags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dddiCreatehwqueueflags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class D3dddiCreatenativefenceinfo internal constructor(
    public var initialFenceValue: ULong,
    pPrivateDriverDataCtorArg: MutPtr<CVoid>,
    public var privateDriverDataSize: UInt,
    public var engineAffinity: UInt,
    public var flags: D3dddiSynchronizationobjectFlags,
    public var hSyncObject: UInt,
    public var nativeFenceMapping: D3dddiNativefencemapping,
) {
    public var pPrivateDriverData: MutPtr<CVoid> = pPrivateDriverDataCtorArg
        internal set

    public constructor() : this(
        initialFenceValue = 0uL,
        pPrivateDriverDataCtorArg = MutPtr(0L),
        privateDriverDataSize = 0u,
        engineAffinity = 0u,
        flags = D3dddiSynchronizationobjectFlags(),
        hSyncObject = 0u,
        nativeFenceMapping = D3dddiNativefencemapping(),
    )

    public operator fun component1(): ULong = this.initialFenceValue

    public operator fun component2(): MutPtr<CVoid> = this.pPrivateDriverData

    public operator fun component3(): UInt = this.privateDriverDataSize

    public operator fun component4(): UInt = this.engineAffinity

    public operator fun component5(): D3dddiSynchronizationobjectFlags = this.flags

    public operator fun component6(): UInt = this.hSyncObject

    public operator fun component7(): D3dddiNativefencemapping = this.nativeFenceMapping

    public fun copy(initialFenceValue: ULong = this.initialFenceValue, pPrivateDriverData: MutPtr<CVoid> = this.pPrivateDriverData, privateDriverDataSize: UInt = this.privateDriverDataSize, engineAffinity: UInt = this.engineAffinity, flags: D3dddiSynchronizationobjectFlags = this.flags, hSyncObject: UInt = this.hSyncObject, nativeFenceMapping: D3dddiNativefencemapping = this.nativeFenceMapping): D3dddiCreatenativefenceinfo = D3dddiCreatenativefenceinfo(initialFenceValue = initialFenceValue, pPrivateDriverDataCtorArg = pPrivateDriverData, privateDriverDataSize = privateDriverDataSize, engineAffinity = engineAffinity, flags = flags, hSyncObject = hSyncObject, nativeFenceMapping = nativeFenceMapping)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiCreatenativefenceinfo) return false
        if (this.initialFenceValue != other.initialFenceValue) return false
        if (this.pPrivateDriverData != other.pPrivateDriverData) return false
        if (this.privateDriverDataSize != other.privateDriverDataSize) return false
        if (this.engineAffinity != other.engineAffinity) return false
        if (this.flags != other.flags) return false
        if (this.hSyncObject != other.hSyncObject) return false
        if (this.nativeFenceMapping != other.nativeFenceMapping) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.initialFenceValue.hashCode()
        result = 31 * result + this.pPrivateDriverData.hashCode()
        result = 31 * result + this.privateDriverDataSize.hashCode()
        result = 31 * result + this.engineAffinity.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.hSyncObject.hashCode()
        result = 31 * result + this.nativeFenceMapping.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            initialFenceValue: ULong = 0uL,
            pPrivateDriverData: MutPtr<CVoid> = MutPtr(0L),
            privateDriverDataSize: UInt = 0u,
            engineAffinity: UInt = 0u,
            flags: D3dddiSynchronizationobjectFlags = D3dddiSynchronizationobjectFlags(),
            hSyncObject: UInt = 0u,
            nativeFenceMapping: D3dddiNativefencemapping = D3dddiNativefencemapping(),
        ): D3dddiCreatenativefenceinfo =
            D3dddiCreatenativefenceinfo(
                initialFenceValue = initialFenceValue,
                pPrivateDriverDataCtorArg = pPrivateDriverData,
                privateDriverDataSize = privateDriverDataSize,
                engineAffinity = engineAffinity,
                flags = flags,
                hSyncObject = hSyncObject,
                nativeFenceMapping = nativeFenceMapping,
            )
    }
}

public data class D3dddiDestroypagingqueue(
    public var hPagingQueue: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiDestroypagingqueue> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiDestroypagingqueue> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dddiDestroypagingqueue =
                    D3dddiDestroypagingqueue(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dddiDestroypagingqueue) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hPagingQueue)
                }
            }
    }
}

public data class D3dddiDriverescapeCpueventusage(
    public var escapeType: D3dddiDriverescapetype = 0,
    public var hSyncObject: UInt = 0u,
    public var hKmdCpuEvent: ULong = 0uL,
    public var usage: UIntArray = UIntArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiDriverescapeCpueventusage) return false
        if (this.escapeType != other.escapeType) return false
        if (this.hSyncObject != other.hSyncObject) return false
        if (this.hKmdCpuEvent != other.hKmdCpuEvent) return false
        if (!this.usage.contentEquals(other.usage)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.escapeType.hashCode()
        result = 31 * result + this.hSyncObject.hashCode()
        result = 31 * result + this.hKmdCpuEvent.hashCode()
        result = 31 * result + this.usage.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiDriverescapeCpueventusage> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiDriverescapeCpueventusage> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): D3dddiDriverescapeCpueventusage =
                    D3dddiDriverescapeCpueventusage(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (8).toInt())
                        ).readNative(addr + 16L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: D3dddiDriverescapeCpueventusage) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.escapeType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hSyncObject)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.hKmdCpuEvent)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (8).toInt())
                    ).writeNative(addr + 16L, value.usage.toList())
                }
            }
    }
}

public data class D3dddiDriverescapeTranslateallocationehandle(
    public var escapeType: D3dddiDriverescapetype = 0,
    public var hAllocation: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiDriverescapeTranslateallocationehandle> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiDriverescapeTranslateallocationehandle> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dddiDriverescapeTranslateallocationehandle =
                    D3dddiDriverescapeTranslateallocationehandle(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dddiDriverescapeTranslateallocationehandle) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.escapeType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hAllocation)
                }
            }
    }
}

public data class D3dddiDriverescapeTranslateresourcehandle(
    public var escapeType: D3dddiDriverescapetype = 0,
    public var hResource: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiDriverescapeTranslateresourcehandle> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiDriverescapeTranslateresourcehandle> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dddiDriverescapeTranslateresourcehandle =
                    D3dddiDriverescapeTranslateresourcehandle(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dddiDriverescapeTranslateresourcehandle) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.escapeType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hResource)
                }
            }
    }
}

public data class D3dddiDxgiRgb(
    public var red: Float = 0.0f,
    public var green: Float = 0.0f,
    public var blue: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiDxgiRgb> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiDxgiRgb> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): D3dddiDxgiRgb =
                    D3dddiDxgiRgb(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dddiDxgiRgb) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.red)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.green)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.blue)
                }
            }
    }
}

public data class D3dddiEscapeflags(
    public var anonymous: D3dddiEscapeflags0 = D3dddiEscapeflags0(),
)

public data class D3dddiEscapeflags0(
    public var anonymous: D3dddiEscapeflags00 = D3dddiEscapeflags00(),
    public var value: UInt = 0u,
)

public data class D3dddiEscapeflags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiEscapeflags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiEscapeflags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dddiEscapeflags00 =
                    D3dddiEscapeflags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dddiEscapeflags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dddiEvictFlags(
    public var anonymous: D3dddiEvictFlags0 = D3dddiEvictFlags0(),
)

public data class D3dddiEvictFlags0(
    public var anonymous: D3dddiEvictFlags00 = D3dddiEvictFlags00(),
    public var value: UInt = 0u,
)

public data class D3dddiEvictFlags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiEvictFlags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiEvictFlags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dddiEvictFlags00 =
                    D3dddiEvictFlags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dddiEvictFlags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dddiGammaRampDxgi1(
    public var scale: D3dddiDxgiRgb = D3dddiDxgiRgb(),
    public var offset: D3dddiDxgiRgb = D3dddiDxgiRgb(),
    public var gammaCurve: List<D3dddiDxgiRgb> = List(1025) { D3dddiDxgiRgb() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiGammaRampDxgi1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiGammaRampDxgi1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12324L
                override fun readNative(addr: Long): D3dddiGammaRampDxgi1 =
                    D3dddiGammaRampDxgi1(
                        (D3dddiDxgiRgb.typeLayout()).readNative(addr),
                        (D3dddiDxgiRgb.typeLayout()).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(D3dddiDxgiRgb.typeLayout(), (1025).toInt())
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: D3dddiGammaRampDxgi1) {
                    (D3dddiDxgiRgb.typeLayout()).writeNative(addr, value.scale)
                    (D3dddiDxgiRgb.typeLayout()).writeNative(addr + 12L, value.offset)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(D3dddiDxgiRgb.typeLayout(), (1025).toInt())
                    ).writeNative(addr + 24L, value.gammaCurve)
                }
            }
    }
}

public data class D3dddiGammaRampRgb256x3x16(
    public var red: UShortArray = UShortArray(256),
    public var green: UShortArray = UShortArray(256),
    public var blue: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiGammaRampRgb256x3x16) return false
        if (!this.red.contentEquals(other.red)) return false
        if (!this.green.contentEquals(other.green)) return false
        if (!this.blue.contentEquals(other.blue)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.red.contentHashCode()
        result = 31 * result + this.green.contentHashCode()
        result = 31 * result + this.blue.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiGammaRampRgb256x3x16> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiGammaRampRgb256x3x16> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 1536L
                override fun readNative(addr: Long): D3dddiGammaRampRgb256x3x16 =
                    D3dddiGammaRampRgb256x3x16(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 512L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                        ).readNative(addr + 1024L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: D3dddiGammaRampRgb256x3x16) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr, value.red.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 512L, value.green.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 1024L, value.blue.toList())
                }
            }
    }
}

public class D3dddiGetresourcepresentprivatedriverdata internal constructor(
    public var hResource: UInt,
    public var privateDriverDataSize: UInt,
    pPrivateDriverDataCtorArg: MutPtr<CVoid>,
) {
    public var pPrivateDriverData: MutPtr<CVoid> = pPrivateDriverDataCtorArg
        internal set

    public constructor() : this(
        hResource = 0u,
        privateDriverDataSize = 0u,
        pPrivateDriverDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.hResource

    public operator fun component2(): UInt = this.privateDriverDataSize

    public operator fun component3(): MutPtr<CVoid> = this.pPrivateDriverData

    public fun copy(hResource: UInt = this.hResource, privateDriverDataSize: UInt = this.privateDriverDataSize, pPrivateDriverData: MutPtr<CVoid> = this.pPrivateDriverData): D3dddiGetresourcepresentprivatedriverdata = D3dddiGetresourcepresentprivatedriverdata(hResource = hResource, privateDriverDataSize = privateDriverDataSize, pPrivateDriverDataCtorArg = pPrivateDriverData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiGetresourcepresentprivatedriverdata) return false
        if (this.hResource != other.hResource) return false
        if (this.privateDriverDataSize != other.privateDriverDataSize) return false
        if (this.pPrivateDriverData != other.pPrivateDriverData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hResource.hashCode()
        result = 31 * result + this.privateDriverDataSize.hashCode()
        result = 31 * result + this.pPrivateDriverData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiGetresourcepresentprivatedriverdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiGetresourcepresentprivatedriverdata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): D3dddiGetresourcepresentprivatedriverdata =
                    D3dddiGetresourcepresentprivatedriverdata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dddiGetresourcepresentprivatedriverdata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hResource)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.privateDriverDataSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.pPrivateDriverData)
                }
            }

        public operator fun invoke(
            hResource: UInt = 0u,
            privateDriverDataSize: UInt = 0u,
            pPrivateDriverData: MutPtr<CVoid> = MutPtr(0L),
        ): D3dddiGetresourcepresentprivatedriverdata =
            D3dddiGetresourcepresentprivatedriverdata(
                hResource = hResource,
                privateDriverDataSize = privateDriverDataSize,
                pPrivateDriverDataCtorArg = pPrivateDriverData,
            )
    }
}

public data class D3dddiHdrMetadataHdr10(
    public var redPrimary: UShortArray = UShortArray(2),
    public var greenPrimary: UShortArray = UShortArray(2),
    public var bluePrimary: UShortArray = UShortArray(2),
    public var whitePoint: UShortArray = UShortArray(2),
    public var maxMasteringLuminance: UInt = 0u,
    public var minMasteringLuminance: UInt = 0u,
    public var maxContentLightLevel: UShort = 0u,
    public var maxFrameAverageLightLevel: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiHdrMetadataHdr10) return false
        if (!this.redPrimary.contentEquals(other.redPrimary)) return false
        if (!this.greenPrimary.contentEquals(other.greenPrimary)) return false
        if (!this.bluePrimary.contentEquals(other.bluePrimary)) return false
        if (!this.whitePoint.contentEquals(other.whitePoint)) return false
        if (this.maxMasteringLuminance != other.maxMasteringLuminance) return false
        if (this.minMasteringLuminance != other.minMasteringLuminance) return false
        if (this.maxContentLightLevel != other.maxContentLightLevel) return false
        if (this.maxFrameAverageLightLevel != other.maxFrameAverageLightLevel) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.redPrimary.contentHashCode()
        result = 31 * result + this.greenPrimary.contentHashCode()
        result = 31 * result + this.bluePrimary.contentHashCode()
        result = 31 * result + this.whitePoint.contentHashCode()
        result = 31 * result + this.maxMasteringLuminance.hashCode()
        result = 31 * result + this.minMasteringLuminance.hashCode()
        result = 31 * result + this.maxContentLightLevel.hashCode()
        result = 31 * result + this.maxFrameAverageLightLevel.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiHdrMetadataHdr10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiHdrMetadataHdr10> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): D3dddiHdrMetadataHdr10 =
                    D3dddiHdrMetadataHdr10(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (2).toInt())
                        ).readNative(addr).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (2).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (2).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (2).toInt())
                        ).readNative(addr + 12L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 26L),
                    )
                override fun writeNative(addr: Long, value: D3dddiHdrMetadataHdr10) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (2).toInt())
                    ).writeNative(addr, value.redPrimary.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (2).toInt())
                    ).writeNative(addr + 4L, value.greenPrimary.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (2).toInt())
                    ).writeNative(addr + 8L, value.bluePrimary.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (2).toInt())
                    ).writeNative(addr + 12L, value.whitePoint.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.maxMasteringLuminance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.minMasteringLuminance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.maxContentLightLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 26L, value.maxFrameAverageLightLevel)
                }
            }
    }
}

public data class D3dddiHdrMetadataHdr10plus(
    public var data: UByteArray = UByteArray(72),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiHdrMetadataHdr10plus) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int = this.data.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiHdrMetadataHdr10plus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiHdrMetadataHdr10plus> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): D3dddiHdrMetadataHdr10plus =
                    D3dddiHdrMetadataHdr10plus(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (72).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: D3dddiHdrMetadataHdr10plus) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (72).toInt())
                    ).writeNative(addr, value.data.toList())
                }
            }
    }
}

public class D3dddiKerneloverlayinfo internal constructor(
    public var hAllocation: UInt,
    public var dstRect: D3dddirect,
    public var srcRect: D3dddirect,
    pPrivateDriverDataCtorArg: MutPtr<CVoid>,
    public var privateDriverDataSize: UInt,
) {
    public var pPrivateDriverData: MutPtr<CVoid> = pPrivateDriverDataCtorArg
        internal set

    public constructor() : this(
        hAllocation = 0u,
        dstRect = D3dddirect(),
        srcRect = D3dddirect(),
        pPrivateDriverDataCtorArg = MutPtr(0L),
        privateDriverDataSize = 0u,
    )

    public operator fun component1(): UInt = this.hAllocation

    public operator fun component2(): D3dddirect = this.dstRect

    public operator fun component3(): D3dddirect = this.srcRect

    public operator fun component4(): MutPtr<CVoid> = this.pPrivateDriverData

    public operator fun component5(): UInt = this.privateDriverDataSize

    public fun copy(hAllocation: UInt = this.hAllocation, dstRect: D3dddirect = this.dstRect, srcRect: D3dddirect = this.srcRect, pPrivateDriverData: MutPtr<CVoid> = this.pPrivateDriverData, privateDriverDataSize: UInt = this.privateDriverDataSize): D3dddiKerneloverlayinfo = D3dddiKerneloverlayinfo(hAllocation = hAllocation, dstRect = dstRect, srcRect = srcRect, pPrivateDriverDataCtorArg = pPrivateDriverData, privateDriverDataSize = privateDriverDataSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiKerneloverlayinfo) return false
        if (this.hAllocation != other.hAllocation) return false
        if (this.dstRect != other.dstRect) return false
        if (this.srcRect != other.srcRect) return false
        if (this.pPrivateDriverData != other.pPrivateDriverData) return false
        if (this.privateDriverDataSize != other.privateDriverDataSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hAllocation.hashCode()
        result = 31 * result + this.dstRect.hashCode()
        result = 31 * result + this.srcRect.hashCode()
        result = 31 * result + this.pPrivateDriverData.hashCode()
        result = 31 * result + this.privateDriverDataSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiKerneloverlayinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiKerneloverlayinfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): D3dddiKerneloverlayinfo =
                    D3dddiKerneloverlayinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (D3dddirect.typeLayout()).readNative(addr + 4L),
                        (D3dddirect.typeLayout()).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: D3dddiKerneloverlayinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAllocation)
                    (D3dddirect.typeLayout()).writeNative(addr + 4L, value.dstRect)
                    (D3dddirect.typeLayout()).writeNative(addr + 20L, value.srcRect)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.pPrivateDriverData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.privateDriverDataSize)
                }
            }

        public operator fun invoke(
            hAllocation: UInt = 0u,
            dstRect: D3dddirect = D3dddirect(),
            srcRect: D3dddirect = D3dddirect(),
            pPrivateDriverData: MutPtr<CVoid> = MutPtr(0L),
            privateDriverDataSize: UInt = 0u,
        ): D3dddiKerneloverlayinfo =
            D3dddiKerneloverlayinfo(
                hAllocation = hAllocation,
                dstRect = dstRect,
                srcRect = srcRect,
                pPrivateDriverDataCtorArg = pPrivateDriverData,
                privateDriverDataSize = privateDriverDataSize,
            )
    }
}

public class D3dddiMakeresident internal constructor(
    public var hPagingQueue: UInt,
    public var numAllocations: UInt,
    allocationListCtorArg: ConstPtr<UInt>,
    priorityListCtorArg: ConstPtr<UInt>,
    public var flags: D3dddiMakeresidentFlags,
    public var pagingFenceValue: ULong,
    public var numBytesToTrim: ULong,
) {
    public var allocationList: ConstPtr<UInt> = allocationListCtorArg
        internal set

    public var priorityList: ConstPtr<UInt> = priorityListCtorArg
        internal set

    public constructor() : this(
        hPagingQueue = 0u,
        numAllocations = 0u,
        allocationListCtorArg = ConstPtr(0L),
        priorityListCtorArg = ConstPtr(0L),
        flags = D3dddiMakeresidentFlags(),
        pagingFenceValue = 0uL,
        numBytesToTrim = 0uL,
    )

    public operator fun component1(): UInt = this.hPagingQueue

    public operator fun component2(): UInt = this.numAllocations

    public operator fun component3(): ConstPtr<UInt> = this.allocationList

    public operator fun component4(): ConstPtr<UInt> = this.priorityList

    public operator fun component5(): D3dddiMakeresidentFlags = this.flags

    public operator fun component6(): ULong = this.pagingFenceValue

    public operator fun component7(): ULong = this.numBytesToTrim

    public fun copy(hPagingQueue: UInt = this.hPagingQueue, numAllocations: UInt = this.numAllocations, allocationList: ConstPtr<UInt> = this.allocationList, priorityList: ConstPtr<UInt> = this.priorityList, flags: D3dddiMakeresidentFlags = this.flags, pagingFenceValue: ULong = this.pagingFenceValue, numBytesToTrim: ULong = this.numBytesToTrim): D3dddiMakeresident = D3dddiMakeresident(hPagingQueue = hPagingQueue, numAllocations = numAllocations, allocationListCtorArg = allocationList, priorityListCtorArg = priorityList, flags = flags, pagingFenceValue = pagingFenceValue, numBytesToTrim = numBytesToTrim)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiMakeresident) return false
        if (this.hPagingQueue != other.hPagingQueue) return false
        if (this.numAllocations != other.numAllocations) return false
        if (this.allocationList != other.allocationList) return false
        if (this.priorityList != other.priorityList) return false
        if (this.flags != other.flags) return false
        if (this.pagingFenceValue != other.pagingFenceValue) return false
        if (this.numBytesToTrim != other.numBytesToTrim) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hPagingQueue.hashCode()
        result = 31 * result + this.numAllocations.hashCode()
        result = 31 * result + this.allocationList.hashCode()
        result = 31 * result + this.priorityList.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.pagingFenceValue.hashCode()
        result = 31 * result + this.numBytesToTrim.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hPagingQueue: UInt = 0u,
            numAllocations: UInt = 0u,
            allocationList: ConstPtr<UInt> = ConstPtr(0L),
            priorityList: ConstPtr<UInt> = ConstPtr(0L),
            flags: D3dddiMakeresidentFlags = D3dddiMakeresidentFlags(),
            pagingFenceValue: ULong = 0uL,
            numBytesToTrim: ULong = 0uL,
        ): D3dddiMakeresident =
            D3dddiMakeresident(
                hPagingQueue = hPagingQueue,
                numAllocations = numAllocations,
                allocationListCtorArg = allocationList,
                priorityListCtorArg = priorityList,
                flags = flags,
                pagingFenceValue = pagingFenceValue,
                numBytesToTrim = numBytesToTrim,
            )
    }
}

public data class D3dddiMakeresidentFlags(
    public var anonymous: D3dddiMakeresidentFlags0 = D3dddiMakeresidentFlags0(),
)

public data class D3dddiMakeresidentFlags0(
    public var anonymous: D3dddiMakeresidentFlags00 = D3dddiMakeresidentFlags00(),
    public var value: UInt = 0u,
)

public data class D3dddiMakeresidentFlags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiMakeresidentFlags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiMakeresidentFlags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dddiMakeresidentFlags00 =
                    D3dddiMakeresidentFlags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dddiMakeresidentFlags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dddiMapgpuvirtualaddress(
    public var hPagingQueue: UInt = 0u,
    public var baseAddress: ULong = 0uL,
    public var minimumAddress: ULong = 0uL,
    public var maximumAddress: ULong = 0uL,
    public var hAllocation: UInt = 0u,
    public var offsetInPages: ULong = 0uL,
    public var sizeInPages: ULong = 0uL,
    public var protection: D3dddigpuvirtualaddressProtectionType = D3dddigpuvirtualaddressProtectionType(),
    public var driverProtection: ULong = 0uL,
    public var reserved0: UInt = 0u,
    public var reserved1: ULong = 0uL,
    public var virtualAddress: ULong = 0uL,
    public var pagingFenceValue: ULong = 0uL,
)

public data class D3dddiMultisamplingmethod(
    public var numSamples: UInt = 0u,
    public var numQualityLevels: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiMultisamplingmethod> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiMultisamplingmethod> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dddiMultisamplingmethod =
                    D3dddiMultisamplingmethod(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dddiMultisamplingmethod) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numSamples)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numQualityLevels)
                }
            }
    }
}

public class D3dddiNativefencemapping internal constructor(
    currentValueCpuVaCtorArg: MutPtr<CVoid>,
    public var currentValueGpuVa: ULong,
    public var monitoredValueGpuVa: ULong,
) {
    public var currentValueCpuVa: MutPtr<CVoid> = currentValueCpuVaCtorArg
        internal set

    public constructor() : this(
        currentValueCpuVaCtorArg = MutPtr(0L),
        currentValueGpuVa = 0uL,
        monitoredValueGpuVa = 0uL,
    )

    public operator fun component1(): MutPtr<CVoid> = this.currentValueCpuVa

    public operator fun component2(): ULong = this.currentValueGpuVa

    public operator fun component3(): ULong = this.monitoredValueGpuVa

    public fun copy(currentValueCpuVa: MutPtr<CVoid> = this.currentValueCpuVa, currentValueGpuVa: ULong = this.currentValueGpuVa, monitoredValueGpuVa: ULong = this.monitoredValueGpuVa): D3dddiNativefencemapping = D3dddiNativefencemapping(currentValueCpuVaCtorArg = currentValueCpuVa, currentValueGpuVa = currentValueGpuVa, monitoredValueGpuVa = monitoredValueGpuVa)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiNativefencemapping) return false
        if (this.currentValueCpuVa != other.currentValueCpuVa) return false
        if (this.currentValueGpuVa != other.currentValueGpuVa) return false
        if (this.monitoredValueGpuVa != other.monitoredValueGpuVa) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.currentValueCpuVa.hashCode()
        result = 31 * result + this.currentValueGpuVa.hashCode()
        result = 31 * result + this.monitoredValueGpuVa.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiNativefencemapping> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiNativefencemapping> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): D3dddiNativefencemapping =
                    D3dddiNativefencemapping(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: D3dddiNativefencemapping) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.currentValueCpuVa)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.currentValueGpuVa)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.monitoredValueGpuVa)
                }
            }

        public operator fun invoke(
            currentValueCpuVa: MutPtr<CVoid> = MutPtr(0L),
            currentValueGpuVa: ULong = 0uL,
            monitoredValueGpuVa: ULong = 0uL,
        ): D3dddiNativefencemapping =
            D3dddiNativefencemapping(
                currentValueCpuVaCtorArg = currentValueCpuVa,
                currentValueGpuVa = currentValueGpuVa,
                monitoredValueGpuVa = monitoredValueGpuVa,
            )
    }
}

public data class D3dddiOfferFlags(
    public var anonymous: D3dddiOfferFlags0 = D3dddiOfferFlags0(),
)

public data class D3dddiOfferFlags0(
    public var anonymous: D3dddiOfferFlags00 = D3dddiOfferFlags00(),
    public var value: UInt = 0u,
)

public data class D3dddiOfferFlags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiOfferFlags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiOfferFlags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dddiOfferFlags00 =
                    D3dddiOfferFlags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dddiOfferFlags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class D3dddiOpenallocationinfo internal constructor(
    public var hAllocation: UInt,
    pPrivateDriverDataCtorArg: ConstPtr<CVoid>,
    public var privateDriverDataSize: UInt,
) {
    public var pPrivateDriverData: ConstPtr<CVoid> = pPrivateDriverDataCtorArg
        internal set

    public constructor() : this(
        hAllocation = 0u,
        pPrivateDriverDataCtorArg = ConstPtr(0L),
        privateDriverDataSize = 0u,
    )

    public operator fun component1(): UInt = this.hAllocation

    public operator fun component2(): ConstPtr<CVoid> = this.pPrivateDriverData

    public operator fun component3(): UInt = this.privateDriverDataSize

    public fun copy(hAllocation: UInt = this.hAllocation, pPrivateDriverData: ConstPtr<CVoid> = this.pPrivateDriverData, privateDriverDataSize: UInt = this.privateDriverDataSize): D3dddiOpenallocationinfo = D3dddiOpenallocationinfo(hAllocation = hAllocation, pPrivateDriverDataCtorArg = pPrivateDriverData, privateDriverDataSize = privateDriverDataSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiOpenallocationinfo) return false
        if (this.hAllocation != other.hAllocation) return false
        if (this.pPrivateDriverData != other.pPrivateDriverData) return false
        if (this.privateDriverDataSize != other.privateDriverDataSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hAllocation.hashCode()
        result = 31 * result + this.pPrivateDriverData.hashCode()
        result = 31 * result + this.privateDriverDataSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiOpenallocationinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiOpenallocationinfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): D3dddiOpenallocationinfo =
                    D3dddiOpenallocationinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: D3dddiOpenallocationinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAllocation)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.pPrivateDriverData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.privateDriverDataSize)
                }
            }

        public operator fun invoke(
            hAllocation: UInt = 0u,
            pPrivateDriverData: ConstPtr<CVoid> = ConstPtr(0L),
            privateDriverDataSize: UInt = 0u,
        ): D3dddiOpenallocationinfo =
            D3dddiOpenallocationinfo(
                hAllocation = hAllocation,
                pPrivateDriverDataCtorArg = pPrivateDriverData,
                privateDriverDataSize = privateDriverDataSize,
            )
    }
}

public class D3dddiOpenallocationinfo2 internal constructor(
    public var hAllocation: UInt,
    pPrivateDriverDataCtorArg: ConstPtr<CVoid>,
    public var privateDriverDataSize: UInt,
    public var gpuVirtualAddress: ULong,
    public var reserved: IntArray,
) {
    public var pPrivateDriverData: ConstPtr<CVoid> = pPrivateDriverDataCtorArg
        internal set

    public constructor() : this(
        hAllocation = 0u,
        pPrivateDriverDataCtorArg = ConstPtr(0L),
        privateDriverDataSize = 0u,
        gpuVirtualAddress = 0uL,
        reserved = IntArray(6),
    )

    public operator fun component1(): UInt = this.hAllocation

    public operator fun component2(): ConstPtr<CVoid> = this.pPrivateDriverData

    public operator fun component3(): UInt = this.privateDriverDataSize

    public operator fun component4(): ULong = this.gpuVirtualAddress

    public operator fun component5(): IntArray = this.reserved

    public fun copy(hAllocation: UInt = this.hAllocation, pPrivateDriverData: ConstPtr<CVoid> = this.pPrivateDriverData, privateDriverDataSize: UInt = this.privateDriverDataSize, gpuVirtualAddress: ULong = this.gpuVirtualAddress, reserved: IntArray = this.reserved): D3dddiOpenallocationinfo2 = D3dddiOpenallocationinfo2(hAllocation = hAllocation, pPrivateDriverDataCtorArg = pPrivateDriverData, privateDriverDataSize = privateDriverDataSize, gpuVirtualAddress = gpuVirtualAddress, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiOpenallocationinfo2) return false
        if (this.hAllocation != other.hAllocation) return false
        if (this.pPrivateDriverData != other.pPrivateDriverData) return false
        if (this.privateDriverDataSize != other.privateDriverDataSize) return false
        if (this.gpuVirtualAddress != other.gpuVirtualAddress) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hAllocation.hashCode()
        result = 31 * result + this.pPrivateDriverData.hashCode()
        result = 31 * result + this.privateDriverDataSize.hashCode()
        result = 31 * result + this.gpuVirtualAddress.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiOpenallocationinfo2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiOpenallocationinfo2> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): D3dddiOpenallocationinfo2 =
                    D3dddiOpenallocationinfo2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (6).toInt())
                        ).readNative(addr + 32L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: D3dddiOpenallocationinfo2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAllocation)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.pPrivateDriverData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.privateDriverDataSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.gpuVirtualAddress)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (6).toInt())
                    ).writeNative(addr + 32L, value.reserved.toList())
                }
            }

        public operator fun invoke(
            hAllocation: UInt = 0u,
            pPrivateDriverData: ConstPtr<CVoid> = ConstPtr(0L),
            privateDriverDataSize: UInt = 0u,
            gpuVirtualAddress: ULong = 0uL,
            reserved: IntArray = IntArray(6),
        ): D3dddiOpenallocationinfo2 =
            D3dddiOpenallocationinfo2(
                hAllocation = hAllocation,
                pPrivateDriverDataCtorArg = pPrivateDriverData,
                privateDriverDataSize = privateDriverDataSize,
                gpuVirtualAddress = gpuVirtualAddress,
                reserved = reserved,
            )
    }
}

public data class D3dddiPatchlocationlist(
    public var allocationIndex: UInt = 0u,
    public var anonymous: D3dddiPatchlocationlist0 = D3dddiPatchlocationlist0(),
    public var driverId: UInt = 0u,
    public var allocationOffset: UInt = 0u,
    public var patchOffset: UInt = 0u,
    public var splitOffset: UInt = 0u,
)

public data class D3dddiPatchlocationlist0(
    public var anonymous: D3dddiPatchlocationlist00 = D3dddiPatchlocationlist00(),
    public var value: UInt = 0u,
)

public data class D3dddiPatchlocationlist00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiPatchlocationlist00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiPatchlocationlist00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dddiPatchlocationlist00 =
                    D3dddiPatchlocationlist00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dddiPatchlocationlist00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dddiQueryregistryFlags(
    public var anonymous: D3dddiQueryregistryFlags0 = D3dddiQueryregistryFlags0(),
)

public data class D3dddiQueryregistryFlags0(
    public var anonymous: D3dddiQueryregistryFlags00 = D3dddiQueryregistryFlags00(),
    public var value: UInt = 0u,
)

public data class D3dddiQueryregistryFlags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiQueryregistryFlags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiQueryregistryFlags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dddiQueryregistryFlags00 =
                    D3dddiQueryregistryFlags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dddiQueryregistryFlags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dddiQueryregistryInfo(
    public var queryType: D3dddiQueryregistryType = 0,
    public var queryFlags: D3dddiQueryregistryFlags = D3dddiQueryregistryFlags(),
    public var valueName: UShortArray = UShortArray(260),
    public var valueType: UInt = 0u,
    public var physicalAdapterIndex: UInt = 0u,
    public var outputValueSize: UInt = 0u,
    public var status: D3dddiQueryregistryStatus = 0,
    public var anonymous: D3dddiQueryregistryInfo0 = D3dddiQueryregistryInfo0(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiQueryregistryInfo) return false
        if (this.queryType != other.queryType) return false
        if (this.queryFlags != other.queryFlags) return false
        if (!this.valueName.contentEquals(other.valueName)) return false
        if (this.valueType != other.valueType) return false
        if (this.physicalAdapterIndex != other.physicalAdapterIndex) return false
        if (this.outputValueSize != other.outputValueSize) return false
        if (this.status != other.status) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.queryType.hashCode()
        result = 31 * result + this.queryFlags.hashCode()
        result = 31 * result + this.valueName.contentHashCode()
        result = 31 * result + this.valueType.hashCode()
        result = 31 * result + this.physicalAdapterIndex.hashCode()
        result = 31 * result + this.outputValueSize.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class D3dddiQueryregistryInfo0(
    public var outputDword: UInt = 0u,
    public var outputQword: ULong = 0uL,
    public var outputString: UShortArray = UShortArray(1),
    public var outputBinary: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiQueryregistryInfo0) return false
        if (this.outputDword != other.outputDword) return false
        if (this.outputQword != other.outputQword) return false
        if (!this.outputString.contentEquals(other.outputString)) return false
        if (!this.outputBinary.contentEquals(other.outputBinary)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.outputDword.hashCode()
        result = 31 * result + this.outputQword.hashCode()
        result = 31 * result + this.outputString.contentHashCode()
        result = 31 * result + this.outputBinary.contentHashCode()
        return result
    }
}

public data class D3dddiRational(
    public var numerator: UInt = 0u,
    public var denominator: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiRational> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiRational> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dddiRational =
                    D3dddiRational(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dddiRational) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numerator)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.denominator)
                }
            }
    }
}

public data class D3dddiReservegpuvirtualaddress(
    public var anonymous1: D3dddiReservegpuvirtualaddress0 = D3dddiReservegpuvirtualaddress0(),
    public var baseAddress: ULong = 0uL,
    public var minimumAddress: ULong = 0uL,
    public var maximumAddress: ULong = 0uL,
    public var size: ULong = 0uL,
    public var anonymous2: D3dddiReservegpuvirtualaddress1 = D3dddiReservegpuvirtualaddress1(),
    public var anonymous3: D3dddiReservegpuvirtualaddress2 = D3dddiReservegpuvirtualaddress2(),
    public var virtualAddress: ULong = 0uL,
    public var anonymous4: D3dddiReservegpuvirtualaddress3 = D3dddiReservegpuvirtualaddress3(),
)

public data class D3dddiReservegpuvirtualaddress0(
    public var hPagingQueue: UInt = 0u,
    public var hAdapter: UInt = 0u,
)

public data class D3dddiReservegpuvirtualaddress1(
    public var reservationType: D3dddigpuvirtualaddressReservationType = 0,
    public var reserved0: UInt = 0u,
)

public data class D3dddiReservegpuvirtualaddress2(
    public var driverProtection: ULong = 0uL,
    public var reserved1: ULong = 0uL,
)

public data class D3dddiReservegpuvirtualaddress3(
    public var pagingFenceValue: ULong = 0uL,
    public var reserved2: ULong = 0uL,
)

public data class D3dddiResourceflags(
    public var anonymous: D3dddiResourceflags0 = D3dddiResourceflags0(),
)

public data class D3dddiResourceflags0(
    public var anonymous: D3dddiResourceflags00 = D3dddiResourceflags00(),
    public var value: UInt = 0u,
)

public data class D3dddiResourceflags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiResourceflags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiResourceflags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dddiResourceflags00 =
                    D3dddiResourceflags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dddiResourceflags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dddiResourceflags2(
    public var anonymous: D3dddiResourceflags20 = D3dddiResourceflags20(),
)

public data class D3dddiResourceflags20(
    public var anonymous: D3dddiResourceflags200 = D3dddiResourceflags200(),
    public var value: UInt = 0u,
)

public data class D3dddiResourceflags200(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiResourceflags200> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiResourceflags200> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dddiResourceflags200 =
                    D3dddiResourceflags200(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dddiResourceflags200) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dddiSegmentpreference(
    public var anonymous: D3dddiSegmentpreference0 = D3dddiSegmentpreference0(),
)

public data class D3dddiSegmentpreference0(
    public var anonymous: D3dddiSegmentpreference00 = D3dddiSegmentpreference00(),
    public var value: UInt = 0u,
)

public data class D3dddiSegmentpreference00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiSegmentpreference00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiSegmentpreference00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dddiSegmentpreference00 =
                    D3dddiSegmentpreference00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dddiSegmentpreference00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class D3dddiSurfaceinfo internal constructor(
    public var width: UInt,
    public var height: UInt,
    public var depth: UInt,
    pSysMemCtorArg: ConstPtr<CVoid>,
    public var sysMemPitch: UInt,
    public var sysMemSlicePitch: UInt,
) {
    public var pSysMem: ConstPtr<CVoid> = pSysMemCtorArg
        internal set

    public constructor() : this(
        width = 0u,
        height = 0u,
        depth = 0u,
        pSysMemCtorArg = ConstPtr(0L),
        sysMemPitch = 0u,
        sysMemSlicePitch = 0u,
    )

    public operator fun component1(): UInt = this.width

    public operator fun component2(): UInt = this.height

    public operator fun component3(): UInt = this.depth

    public operator fun component4(): ConstPtr<CVoid> = this.pSysMem

    public operator fun component5(): UInt = this.sysMemPitch

    public operator fun component6(): UInt = this.sysMemSlicePitch

    public fun copy(width: UInt = this.width, height: UInt = this.height, depth: UInt = this.depth, pSysMem: ConstPtr<CVoid> = this.pSysMem, sysMemPitch: UInt = this.sysMemPitch, sysMemSlicePitch: UInt = this.sysMemSlicePitch): D3dddiSurfaceinfo = D3dddiSurfaceinfo(width = width, height = height, depth = depth, pSysMemCtorArg = pSysMem, sysMemPitch = sysMemPitch, sysMemSlicePitch = sysMemSlicePitch)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiSurfaceinfo) return false
        if (this.width != other.width) return false
        if (this.height != other.height) return false
        if (this.depth != other.depth) return false
        if (this.pSysMem != other.pSysMem) return false
        if (this.sysMemPitch != other.sysMemPitch) return false
        if (this.sysMemSlicePitch != other.sysMemSlicePitch) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.width.hashCode()
        result = 31 * result + this.height.hashCode()
        result = 31 * result + this.depth.hashCode()
        result = 31 * result + this.pSysMem.hashCode()
        result = 31 * result + this.sysMemPitch.hashCode()
        result = 31 * result + this.sysMemSlicePitch.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiSurfaceinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiSurfaceinfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): D3dddiSurfaceinfo =
                    D3dddiSurfaceinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: D3dddiSurfaceinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.width)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.height)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.depth)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.pSysMem)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.sysMemPitch)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.sysMemSlicePitch)
                }
            }

        public operator fun invoke(
            width: UInt = 0u,
            height: UInt = 0u,
            depth: UInt = 0u,
            pSysMem: ConstPtr<CVoid> = ConstPtr(0L),
            sysMemPitch: UInt = 0u,
            sysMemSlicePitch: UInt = 0u,
        ): D3dddiSurfaceinfo =
            D3dddiSurfaceinfo(
                width = width,
                height = height,
                depth = depth,
                pSysMemCtorArg = pSysMem,
                sysMemPitch = sysMemPitch,
                sysMemSlicePitch = sysMemSlicePitch,
            )
    }
}

public data class D3dddiSynchronizationobjectinfo(
    public var type: D3dddiSynchronizationobjectType = 0,
    public var anonymous: D3dddiSynchronizationobjectinfo0 = D3dddiSynchronizationobjectinfo0(),
)

public data class D3dddiSynchronizationobjectinfo0(
    public var synchronizationMutex: D3dddiSynchronizationobjectinfo00 = D3dddiSynchronizationobjectinfo00(),
    public var semaphore: D3dddiSynchronizationobjectinfo01 = D3dddiSynchronizationobjectinfo01(),
    public var reserved: D3dddiSynchronizationobjectinfo02 = D3dddiSynchronizationobjectinfo02(),
)

public data class D3dddiSynchronizationobjectinfo02(
    public var reserved: UIntArray = UIntArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiSynchronizationobjectinfo02) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int = this.reserved.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiSynchronizationobjectinfo02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiSynchronizationobjectinfo02> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): D3dddiSynchronizationobjectinfo02 =
                    D3dddiSynchronizationobjectinfo02(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (16).toInt())
                        ).readNative(addr).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: D3dddiSynchronizationobjectinfo02) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (16).toInt())
                    ).writeNative(addr, value.reserved.toList())
                }
            }
    }
}

public data class D3dddiSynchronizationobjectinfo01(
    public var maxCount: UInt = 0u,
    public var initialCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiSynchronizationobjectinfo01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiSynchronizationobjectinfo01> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dddiSynchronizationobjectinfo01 =
                    D3dddiSynchronizationobjectinfo01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dddiSynchronizationobjectinfo01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.maxCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.initialCount)
                }
            }
    }
}

public data class D3dddiSynchronizationobjectinfo00(
    public var initialState: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiSynchronizationobjectinfo00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiSynchronizationobjectinfo00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dddiSynchronizationobjectinfo00 =
                    D3dddiSynchronizationobjectinfo00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dddiSynchronizationobjectinfo00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.initialState)
                }
            }
    }
}

public data class D3dddiSynchronizationobjectinfo2(
    public var type: D3dddiSynchronizationobjectType = 0,
    public var flags: D3dddiSynchronizationobjectFlags = D3dddiSynchronizationobjectFlags(),
    public var anonymous: D3dddiSynchronizationobjectinfo20 = D3dddiSynchronizationobjectinfo20(),
    public var sharedHandle: UInt = 0u,
)

public data class D3dddiSynchronizationobjectinfo20(
    public var synchronizationMutex: D3dddiSynchronizationobjectinfo200 = D3dddiSynchronizationobjectinfo200(),
    public var semaphore: D3dddiSynchronizationobjectinfo201 = D3dddiSynchronizationobjectinfo201(),
    public var fence: D3dddiSynchronizationobjectinfo202 = D3dddiSynchronizationobjectinfo202(),
    public var cPUNotification: D3dddiSynchronizationobjectinfo203 = D3dddiSynchronizationobjectinfo203(),
    public var monitoredFence: D3dddiSynchronizationobjectinfo204 = D3dddiSynchronizationobjectinfo204(),
    public var periodicMonitoredFence: D3dddiSynchronizationobjectinfo205 = D3dddiSynchronizationobjectinfo205(),
    public var reserved: D3dddiSynchronizationobjectinfo206 = D3dddiSynchronizationobjectinfo206(),
)

public class D3dddiSynchronizationobjectinfo203 internal constructor(
    eventCtorArg: Handle,
) {
    public var event: Handle = eventCtorArg
        internal set

    public constructor() : this(
        eventCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.event

    public fun copy(event: Handle = this.event): D3dddiSynchronizationobjectinfo203 = D3dddiSynchronizationobjectinfo203(eventCtorArg = event)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiSynchronizationobjectinfo203) return false
        if (this.event != other.event) return false
        return true
    }

    override fun hashCode(): Int = this.event.hashCode()

    public companion object {
        public operator fun invoke(
            event: Handle = MutPtr(0L),
        ): D3dddiSynchronizationobjectinfo203 =
            D3dddiSynchronizationobjectinfo203(
                eventCtorArg = event,
            )
    }
}

public data class D3dddiSynchronizationobjectinfo202(
    public var fenceValue: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiSynchronizationobjectinfo202> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiSynchronizationobjectinfo202> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dddiSynchronizationobjectinfo202 =
                    D3dddiSynchronizationobjectinfo202(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dddiSynchronizationobjectinfo202) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.fenceValue)
                }
            }
    }
}

public class D3dddiSynchronizationobjectinfo204 internal constructor(
    public var initialFenceValue: ULong,
    fenceValueCPUVirtualAddressCtorArg: MutPtr<CVoid>,
    public var fenceValueGPUVirtualAddress: ULong,
    public var engineAffinity: UInt,
    public var padding: UInt,
) {
    public var fenceValueCPUVirtualAddress: MutPtr<CVoid> = fenceValueCPUVirtualAddressCtorArg
        internal set

    public constructor() : this(
        initialFenceValue = 0uL,
        fenceValueCPUVirtualAddressCtorArg = MutPtr(0L),
        fenceValueGPUVirtualAddress = 0uL,
        engineAffinity = 0u,
        padding = 0u,
    )

    public operator fun component1(): ULong = this.initialFenceValue

    public operator fun component2(): MutPtr<CVoid> = this.fenceValueCPUVirtualAddress

    public operator fun component3(): ULong = this.fenceValueGPUVirtualAddress

    public operator fun component4(): UInt = this.engineAffinity

    public operator fun component5(): UInt = this.padding

    public fun copy(initialFenceValue: ULong = this.initialFenceValue, fenceValueCPUVirtualAddress: MutPtr<CVoid> = this.fenceValueCPUVirtualAddress, fenceValueGPUVirtualAddress: ULong = this.fenceValueGPUVirtualAddress, engineAffinity: UInt = this.engineAffinity, padding: UInt = this.padding): D3dddiSynchronizationobjectinfo204 = D3dddiSynchronizationobjectinfo204(initialFenceValue = initialFenceValue, fenceValueCPUVirtualAddressCtorArg = fenceValueCPUVirtualAddress, fenceValueGPUVirtualAddress = fenceValueGPUVirtualAddress, engineAffinity = engineAffinity, padding = padding)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiSynchronizationobjectinfo204) return false
        if (this.initialFenceValue != other.initialFenceValue) return false
        if (this.fenceValueCPUVirtualAddress != other.fenceValueCPUVirtualAddress) return false
        if (this.fenceValueGPUVirtualAddress != other.fenceValueGPUVirtualAddress) return false
        if (this.engineAffinity != other.engineAffinity) return false
        if (this.padding != other.padding) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.initialFenceValue.hashCode()
        result = 31 * result + this.fenceValueCPUVirtualAddress.hashCode()
        result = 31 * result + this.fenceValueGPUVirtualAddress.hashCode()
        result = 31 * result + this.engineAffinity.hashCode()
        result = 31 * result + this.padding.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiSynchronizationobjectinfo204> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiSynchronizationobjectinfo204> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): D3dddiSynchronizationobjectinfo204 =
                    D3dddiSynchronizationobjectinfo204(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: D3dddiSynchronizationobjectinfo204) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.initialFenceValue)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.fenceValueCPUVirtualAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.fenceValueGPUVirtualAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.engineAffinity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.padding)
                }
            }

        public operator fun invoke(
            initialFenceValue: ULong = 0uL,
            fenceValueCPUVirtualAddress: MutPtr<CVoid> = MutPtr(0L),
            fenceValueGPUVirtualAddress: ULong = 0uL,
            engineAffinity: UInt = 0u,
            padding: UInt = 0u,
        ): D3dddiSynchronizationobjectinfo204 =
            D3dddiSynchronizationobjectinfo204(
                initialFenceValue = initialFenceValue,
                fenceValueCPUVirtualAddressCtorArg = fenceValueCPUVirtualAddress,
                fenceValueGPUVirtualAddress = fenceValueGPUVirtualAddress,
                engineAffinity = engineAffinity,
                padding = padding,
            )
    }
}

public class D3dddiSynchronizationobjectinfo205 internal constructor(
    public var hAdapter: UInt,
    public var vidPnTargetId: UInt,
    public var time: ULong,
    fenceValueCPUVirtualAddressCtorArg: MutPtr<CVoid>,
    public var fenceValueGPUVirtualAddress: ULong,
    public var engineAffinity: UInt,
    public var padding: UInt,
) {
    public var fenceValueCPUVirtualAddress: MutPtr<CVoid> = fenceValueCPUVirtualAddressCtorArg
        internal set

    public constructor() : this(
        hAdapter = 0u,
        vidPnTargetId = 0u,
        time = 0uL,
        fenceValueCPUVirtualAddressCtorArg = MutPtr(0L),
        fenceValueGPUVirtualAddress = 0uL,
        engineAffinity = 0u,
        padding = 0u,
    )

    public operator fun component1(): UInt = this.hAdapter

    public operator fun component2(): UInt = this.vidPnTargetId

    public operator fun component3(): ULong = this.time

    public operator fun component4(): MutPtr<CVoid> = this.fenceValueCPUVirtualAddress

    public operator fun component5(): ULong = this.fenceValueGPUVirtualAddress

    public operator fun component6(): UInt = this.engineAffinity

    public operator fun component7(): UInt = this.padding

    public fun copy(hAdapter: UInt = this.hAdapter, vidPnTargetId: UInt = this.vidPnTargetId, time: ULong = this.time, fenceValueCPUVirtualAddress: MutPtr<CVoid> = this.fenceValueCPUVirtualAddress, fenceValueGPUVirtualAddress: ULong = this.fenceValueGPUVirtualAddress, engineAffinity: UInt = this.engineAffinity, padding: UInt = this.padding): D3dddiSynchronizationobjectinfo205 = D3dddiSynchronizationobjectinfo205(hAdapter = hAdapter, vidPnTargetId = vidPnTargetId, time = time, fenceValueCPUVirtualAddressCtorArg = fenceValueCPUVirtualAddress, fenceValueGPUVirtualAddress = fenceValueGPUVirtualAddress, engineAffinity = engineAffinity, padding = padding)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiSynchronizationobjectinfo205) return false
        if (this.hAdapter != other.hAdapter) return false
        if (this.vidPnTargetId != other.vidPnTargetId) return false
        if (this.time != other.time) return false
        if (this.fenceValueCPUVirtualAddress != other.fenceValueCPUVirtualAddress) return false
        if (this.fenceValueGPUVirtualAddress != other.fenceValueGPUVirtualAddress) return false
        if (this.engineAffinity != other.engineAffinity) return false
        if (this.padding != other.padding) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hAdapter.hashCode()
        result = 31 * result + this.vidPnTargetId.hashCode()
        result = 31 * result + this.time.hashCode()
        result = 31 * result + this.fenceValueCPUVirtualAddress.hashCode()
        result = 31 * result + this.fenceValueGPUVirtualAddress.hashCode()
        result = 31 * result + this.engineAffinity.hashCode()
        result = 31 * result + this.padding.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiSynchronizationobjectinfo205> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiSynchronizationobjectinfo205> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): D3dddiSynchronizationobjectinfo205 =
                    D3dddiSynchronizationobjectinfo205(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: D3dddiSynchronizationobjectinfo205) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAdapter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vidPnTargetId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.time)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.fenceValueCPUVirtualAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.fenceValueGPUVirtualAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.engineAffinity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.padding)
                }
            }

        public operator fun invoke(
            hAdapter: UInt = 0u,
            vidPnTargetId: UInt = 0u,
            time: ULong = 0uL,
            fenceValueCPUVirtualAddress: MutPtr<CVoid> = MutPtr(0L),
            fenceValueGPUVirtualAddress: ULong = 0uL,
            engineAffinity: UInt = 0u,
            padding: UInt = 0u,
        ): D3dddiSynchronizationobjectinfo205 =
            D3dddiSynchronizationobjectinfo205(
                hAdapter = hAdapter,
                vidPnTargetId = vidPnTargetId,
                time = time,
                fenceValueCPUVirtualAddressCtorArg = fenceValueCPUVirtualAddress,
                fenceValueGPUVirtualAddress = fenceValueGPUVirtualAddress,
                engineAffinity = engineAffinity,
                padding = padding,
            )
    }
}

public data class D3dddiSynchronizationobjectinfo206(
    public var reserved: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dddiSynchronizationobjectinfo206) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int = this.reserved.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiSynchronizationobjectinfo206> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiSynchronizationobjectinfo206> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): D3dddiSynchronizationobjectinfo206 =
                    D3dddiSynchronizationobjectinfo206(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (8).toInt())
                        ).readNative(addr).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: D3dddiSynchronizationobjectinfo206) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (8).toInt())
                    ).writeNative(addr, value.reserved.toList())
                }
            }
    }
}

public data class D3dddiSynchronizationobjectinfo201(
    public var maxCount: UInt = 0u,
    public var initialCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiSynchronizationobjectinfo201> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiSynchronizationobjectinfo201> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dddiSynchronizationobjectinfo201 =
                    D3dddiSynchronizationobjectinfo201(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dddiSynchronizationobjectinfo201) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.maxCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.initialCount)
                }
            }
    }
}

public data class D3dddiSynchronizationobjectinfo200(
    public var initialState: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiSynchronizationobjectinfo200> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiSynchronizationobjectinfo200> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dddiSynchronizationobjectinfo200 =
                    D3dddiSynchronizationobjectinfo200(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dddiSynchronizationobjectinfo200) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.initialState)
                }
            }
    }
}

public data class D3dddiSynchronizationobjectFlags(
    public var anonymous: D3dddiSynchronizationobjectFlags0 = D3dddiSynchronizationobjectFlags0(),
)

public data class D3dddiSynchronizationobjectFlags0(
    public var anonymous: D3dddiSynchronizationobjectFlags00 = D3dddiSynchronizationobjectFlags00(),
    public var value: UInt = 0u,
)

public data class D3dddiSynchronizationobjectFlags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiSynchronizationobjectFlags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiSynchronizationobjectFlags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dddiSynchronizationobjectFlags00 =
                    D3dddiSynchronizationobjectFlags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dddiSynchronizationobjectFlags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dddiTrimresidencysetFlags(
    public var anonymous: D3dddiTrimresidencysetFlags0 = D3dddiTrimresidencysetFlags0(),
)

public data class D3dddiTrimresidencysetFlags0(
    public var anonymous: D3dddiTrimresidencysetFlags00 = D3dddiTrimresidencysetFlags00(),
    public var value: UInt = 0u,
)

public data class D3dddiTrimresidencysetFlags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiTrimresidencysetFlags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiTrimresidencysetFlags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dddiTrimresidencysetFlags00 =
                    D3dddiTrimresidencysetFlags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dddiTrimresidencysetFlags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dddiUpdateallocproperty(
    public var hPagingQueue: UInt = 0u,
    public var hAllocation: UInt = 0u,
    public var supportedSegmentSet: UInt = 0u,
    public var preferredSegment: D3dddiSegmentpreference = D3dddiSegmentpreference(),
    public var flags: D3dddiUpdateallocpropertyFlags = D3dddiUpdateallocpropertyFlags(),
    public var pagingFenceValue: ULong = 0uL,
    public var anonymous: D3dddiUpdateallocproperty0 = D3dddiUpdateallocproperty0(),
)

public data class D3dddiUpdateallocproperty0(
    public var anonymous: D3dddiUpdateallocproperty00 = D3dddiUpdateallocproperty00(),
    public var propertyMaskValue: UInt = 0u,
)

public data class D3dddiUpdateallocproperty00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiUpdateallocproperty00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiUpdateallocproperty00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dddiUpdateallocproperty00 =
                    D3dddiUpdateallocproperty00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dddiUpdateallocproperty00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dddiUpdateallocpropertyFlags(
    public var anonymous: D3dddiUpdateallocpropertyFlags0 = D3dddiUpdateallocpropertyFlags0(),
)

public data class D3dddiUpdateallocpropertyFlags0(
    public var anonymous: D3dddiUpdateallocpropertyFlags00 = D3dddiUpdateallocpropertyFlags00(),
    public var value: UInt = 0u,
)

public data class D3dddiUpdateallocpropertyFlags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiUpdateallocpropertyFlags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiUpdateallocpropertyFlags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dddiUpdateallocpropertyFlags00 =
                    D3dddiUpdateallocpropertyFlags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dddiUpdateallocpropertyFlags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dddiUpdategpuvirtualaddressOperation(
    public var operationType: D3dddiUpdategpuvirtualaddressOperationType = 0,
    public var anonymous: D3dddiUpdategpuvirtualaddressOperation0 = D3dddiUpdategpuvirtualaddressOperation0(),
)

public data class D3dddiUpdategpuvirtualaddressOperation0(
    public var map: D3dddiUpdategpuvirtualaddressOperation00 = D3dddiUpdategpuvirtualaddressOperation00(),
    public var mapProtect: D3dddiUpdategpuvirtualaddressOperation01 = D3dddiUpdategpuvirtualaddressOperation01(),
    public var unmap: D3dddiUpdategpuvirtualaddressOperation02 = D3dddiUpdategpuvirtualaddressOperation02(),
    public var copy: D3dddiUpdategpuvirtualaddressOperation03 = D3dddiUpdategpuvirtualaddressOperation03(),
)

public data class D3dddiUpdategpuvirtualaddressOperation03(
    public var sourceAddress: ULong = 0uL,
    public var sizeInBytes: ULong = 0uL,
    public var destAddress: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiUpdategpuvirtualaddressOperation03> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiUpdategpuvirtualaddressOperation03> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): D3dddiUpdategpuvirtualaddressOperation03 =
                    D3dddiUpdategpuvirtualaddressOperation03(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: D3dddiUpdategpuvirtualaddressOperation03) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.sourceAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.sizeInBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.destAddress)
                }
            }
    }
}

public data class D3dddiUpdategpuvirtualaddressOperation01(
    public var baseAddress: ULong = 0uL,
    public var sizeInBytes: ULong = 0uL,
    public var hAllocation: UInt = 0u,
    public var allocationOffsetInBytes: ULong = 0uL,
    public var allocationSizeInBytes: ULong = 0uL,
    public var protection: D3dddigpuvirtualaddressProtectionType = D3dddigpuvirtualaddressProtectionType(),
    public var driverProtection: ULong = 0uL,
)

public data class D3dddiUpdategpuvirtualaddressOperation00(
    public var baseAddress: ULong = 0uL,
    public var sizeInBytes: ULong = 0uL,
    public var hAllocation: UInt = 0u,
    public var allocationOffsetInBytes: ULong = 0uL,
    public var allocationSizeInBytes: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiUpdategpuvirtualaddressOperation00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiUpdategpuvirtualaddressOperation00> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): D3dddiUpdategpuvirtualaddressOperation00 =
                    D3dddiUpdategpuvirtualaddressOperation00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: D3dddiUpdategpuvirtualaddressOperation00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.baseAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.sizeInBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.hAllocation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.allocationOffsetInBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.allocationSizeInBytes)
                }
            }
    }
}

public data class D3dddiUpdategpuvirtualaddressOperation02(
    public var baseAddress: ULong = 0uL,
    public var sizeInBytes: ULong = 0uL,
    public var protection: D3dddigpuvirtualaddressProtectionType = D3dddigpuvirtualaddressProtectionType(),
)

public data class D3dddiWaitforsynchronizationobjectfromcpuFlags(
    public var anonymous: D3dddiWaitforsynchronizationobjectfromcpuFlags0 = D3dddiWaitforsynchronizationobjectfromcpuFlags0(),
)

public data class D3dddiWaitforsynchronizationobjectfromcpuFlags0(
    public var anonymous: D3dddiWaitforsynchronizationobjectfromcpuFlags00 = D3dddiWaitforsynchronizationobjectfromcpuFlags00(),
    public var value: UInt = 0u,
)

public data class D3dddiWaitforsynchronizationobjectfromcpuFlags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiWaitforsynchronizationobjectfromcpuFlags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dddiWaitforsynchronizationobjectfromcpuFlags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dddiWaitforsynchronizationobjectfromcpuFlags00 =
                    D3dddiWaitforsynchronizationobjectfromcpuFlags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dddiWaitforsynchronizationobjectfromcpuFlags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dgpuPhysicalAddress(
    public var segmentId: UInt = 0u,
    public var padding: UInt = 0u,
    public var segmentOffset: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dgpuPhysicalAddress> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dgpuPhysicalAddress> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): D3dgpuPhysicalAddress =
                    D3dgpuPhysicalAddress(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dgpuPhysicalAddress) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.segmentId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.padding)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.segmentOffset)
                }
            }
    }
}

public data class D3dhalClippedtrianglefan(
    public var firstVertexOffset: UInt = 0u,
    public var dwEdgeFlags: UInt = 0u,
    public var primitiveCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalClippedtrianglefan> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalClippedtrianglefan> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): D3dhalClippedtrianglefan =
                    D3dhalClippedtrianglefan(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dhalClippedtrianglefan) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.firstVertexOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwEdgeFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.primitiveCount)
                }
            }
    }
}

public data class D3dhalContextdestroyalldata(
    public var dwPID: UInt = 0u,
    public var ddrval: Hresult = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalContextdestroyalldata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalContextdestroyalldata> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dhalContextdestroyalldata =
                    D3dhalContextdestroyalldata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dhalContextdestroyalldata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwPID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.ddrval)
                }
            }
    }
}

public data class D3dhalContextdestroydata(
    public var dwhContext: Int = 0,
    public var ddrval: Hresult = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalContextdestroydata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalContextdestroydata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): D3dhalContextdestroydata =
                    D3dhalContextdestroydata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dhalContextdestroydata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwhContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.ddrval)
                }
            }
    }
}

public class D3dhalD3ddx6extendedcaps(
    public var dwSize: UInt = 0u,
    public var dwMinTextureWidth: UInt = 0u,
    public var dwMaxTextureWidth: UInt = 0u,
    public var dwMinTextureHeight: UInt = 0u,
    public var dwMaxTextureHeight: UInt = 0u,
    public var dwMinStippleWidth: UInt = 0u,
    public var dwMaxStippleWidth: UInt = 0u,
    public var dwMinStippleHeight: UInt = 0u,
    public var dwMaxStippleHeight: UInt = 0u,
    public var dwMaxTextureRepeat: UInt = 0u,
    public var dwMaxTextureAspectRatio: UInt = 0u,
    public var dwMaxAnisotropy: UInt = 0u,
    public var dvGuardBandLeft: Float = 0.0f,
    public var dvGuardBandTop: Float = 0.0f,
    public var dvGuardBandRight: Float = 0.0f,
    public var dvGuardBandBottom: Float = 0.0f,
    public var dvExtentsAdjust: Float = 0.0f,
    public var dwStencilCaps: UInt = 0u,
    public var dwFVFCaps: UInt = 0u,
    public var dwTextureOpCaps: UInt = 0u,
    public var wMaxTextureBlendStages: UShort = 0u,
    public var wMaxSimultaneousTextures: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalD3ddx6extendedcaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalD3ddx6extendedcaps> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 84L
                override fun readNative(addr: Long): D3dhalD3ddx6extendedcaps =
                    D3dhalD3ddx6extendedcaps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 82L),
                    )
                override fun writeNative(addr: Long, value: D3dhalD3ddx6extendedcaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMinTextureWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwMaxTextureWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwMinTextureHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwMaxTextureHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwMinStippleWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwMaxStippleWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwMinStippleHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwMaxStippleHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwMaxTextureRepeat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwMaxTextureAspectRatio)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwMaxAnisotropy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 48L, value.dvGuardBandLeft)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 52L, value.dvGuardBandTop)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 56L, value.dvGuardBandRight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 60L, value.dvGuardBandBottom)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 64L, value.dvExtentsAdjust)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.dwStencilCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.dwFVFCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.dwTextureOpCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 80L, value.wMaxTextureBlendStages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 82L, value.wMaxSimultaneousTextures)
                }
            }
    }
}

public class D3dhalD3dextendedcaps(
    public var dwSize: UInt = 0u,
    public var dwMinTextureWidth: UInt = 0u,
    public var dwMaxTextureWidth: UInt = 0u,
    public var dwMinTextureHeight: UInt = 0u,
    public var dwMaxTextureHeight: UInt = 0u,
    public var dwMinStippleWidth: UInt = 0u,
    public var dwMaxStippleWidth: UInt = 0u,
    public var dwMinStippleHeight: UInt = 0u,
    public var dwMaxStippleHeight: UInt = 0u,
    public var dwMaxTextureRepeat: UInt = 0u,
    public var dwMaxTextureAspectRatio: UInt = 0u,
    public var dwMaxAnisotropy: UInt = 0u,
    public var dvGuardBandLeft: Float = 0.0f,
    public var dvGuardBandTop: Float = 0.0f,
    public var dvGuardBandRight: Float = 0.0f,
    public var dvGuardBandBottom: Float = 0.0f,
    public var dvExtentsAdjust: Float = 0.0f,
    public var dwStencilCaps: UInt = 0u,
    public var dwFVFCaps: UInt = 0u,
    public var dwTextureOpCaps: UInt = 0u,
    public var wMaxTextureBlendStages: UShort = 0u,
    public var wMaxSimultaneousTextures: UShort = 0u,
    public var dwMaxActiveLights: UInt = 0u,
    public var dvMaxVertexW: Float = 0.0f,
    public var wMaxUserClipPlanes: UShort = 0u,
    public var wMaxVertexBlendMatrices: UShort = 0u,
    public var dwVertexProcessingCaps: UInt = 0u,
    public var dwReserved1: UInt = 0u,
    public var dwReserved2: UInt = 0u,
    public var dwReserved3: UInt = 0u,
    public var dwReserved4: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalD3dextendedcaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalD3dextendedcaps> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 116L
                override fun readNative(addr: Long): D3dhalD3dextendedcaps =
                    D3dhalD3dextendedcaps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 82L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 94L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 100L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 108L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 112L),
                    )
                override fun writeNative(addr: Long, value: D3dhalD3dextendedcaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwMinTextureWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwMaxTextureWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwMinTextureHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwMaxTextureHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dwMinStippleWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwMaxStippleWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dwMinStippleHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dwMaxStippleHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dwMaxTextureRepeat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dwMaxTextureAspectRatio)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dwMaxAnisotropy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 48L, value.dvGuardBandLeft)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 52L, value.dvGuardBandTop)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 56L, value.dvGuardBandRight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 60L, value.dvGuardBandBottom)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 64L, value.dvExtentsAdjust)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.dwStencilCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.dwFVFCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.dwTextureOpCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 80L, value.wMaxTextureBlendStages)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 82L, value.wMaxSimultaneousTextures)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.dwMaxActiveLights)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 88L, value.dvMaxVertexW)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 92L, value.wMaxUserClipPlanes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 94L, value.wMaxVertexBlendMatrices)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 96L, value.dwVertexProcessingCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 100L, value.dwReserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 104L, value.dwReserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.dwReserved3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 112L, value.dwReserved4)
                }
            }
    }
}

public data class D3dhalDp2adddirtyrect(
    public var dwSurface: UInt = 0u,
    public var rDirtyArea: Rectl = Rectl(),
)

public data class D3dhalDp2blt(
    public var dwSource: UInt = 0u,
    public var rSource: Rectl = Rectl(),
    public var dwSourceMipLevel: UInt = 0u,
    public var dwDest: UInt = 0u,
    public var rDest: Rectl = Rectl(),
    public var dwDestMipLevel: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class D3dhalDp2clear(
    public var dwFlags: UInt = 0u,
    public var dwFillColor: UInt = 0u,
    public var dvFillDepth: Float = 0.0f,
    public var dwFillStencil: UInt = 0u,
    public var rects: List<Rect> = List(1) { Rect() },
)

public data class D3dhalDp2colorfill(
    public var dwSurface: UInt = 0u,
    public var rRect: Rectl = Rectl(),
    public var color: UInt = 0u,
)

public data class D3dhalDp2command(
    public var bCommand: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var anonymous: D3dhalDp2command0 = D3dhalDp2command0(),
)

public data class D3dhalDp2command0(
    public var wPrimitiveCount: UShort = 0u,
    public var wStateCount: UShort = 0u,
)

public data class D3dhalDp2createlight(
    public var dwIndex: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2createlight> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2createlight> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dhalDp2createlight =
                    D3dhalDp2createlight(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2createlight) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwIndex)
                }
            }
    }
}

public data class D3dhalDp2createpixelshader(
    public var dwHandle: UInt = 0u,
    public var dwCodeSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2createpixelshader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2createpixelshader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dhalDp2createpixelshader =
                    D3dhalDp2createpixelshader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2createpixelshader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwCodeSize)
                }
            }
    }
}

public data class D3dhalDp2createvertexshader(
    public var dwHandle: UInt = 0u,
    public var dwDeclSize: UInt = 0u,
    public var dwCodeSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2createvertexshader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2createvertexshader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): D3dhalDp2createvertexshader =
                    D3dhalDp2createvertexshader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2createvertexshader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwDeclSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwCodeSize)
                }
            }
    }
}

public data class D3dhalDp2createvertexshaderdecl(
    public var dwHandle: UInt = 0u,
    public var dwNumVertexElements: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2createvertexshaderdecl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2createvertexshaderdecl> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dhalDp2createvertexshaderdecl =
                    D3dhalDp2createvertexshaderdecl(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2createvertexshaderdecl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwNumVertexElements)
                }
            }
    }
}

public data class D3dhalDp2createvertexshaderfunc(
    public var dwHandle: UInt = 0u,
    public var dwSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2createvertexshaderfunc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2createvertexshaderfunc> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dhalDp2createvertexshaderfunc =
                    D3dhalDp2createvertexshaderfunc(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2createvertexshaderfunc) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwSize)
                }
            }
    }
}

public data class D3dhalDp2deletequery(
    public var dwQueryID: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2deletequery> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2deletequery> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dhalDp2deletequery =
                    D3dhalDp2deletequery(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2deletequery) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwQueryID)
                }
            }
    }
}

public data class D3dhalDp2drawrectpatch(
    public var handle: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2drawrectpatch> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2drawrectpatch> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dhalDp2drawrectpatch =
                    D3dhalDp2drawrectpatch(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2drawrectpatch) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.handle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                }
            }
    }
}

public data class D3dhalDp2drawtripatch(
    public var handle: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2drawtripatch> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2drawtripatch> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dhalDp2drawtripatch =
                    D3dhalDp2drawtripatch(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2drawtripatch) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.handle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flags)
                }
            }
    }
}

public data class D3dhalDp2ext(
    public var dwExtToken: UInt = 0u,
    public var dwSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2ext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2ext> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dhalDp2ext =
                    D3dhalDp2ext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2ext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwExtToken)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwSize)
                }
            }
    }
}

public data class D3dhalDp2indexedlinelist(
    public var wV1: UShort = 0u,
    public var wV2: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2indexedlinelist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2indexedlinelist> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dhalDp2indexedlinelist =
                    D3dhalDp2indexedlinelist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2indexedlinelist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wV1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wV2)
                }
            }
    }
}

public data class D3dhalDp2indexedlinestrip(
    public var wV: UShortArray = UShortArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dhalDp2indexedlinestrip) return false
        if (!this.wV.contentEquals(other.wV)) return false
        return true
    }

    override fun hashCode(): Int = this.wV.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2indexedlinestrip> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2indexedlinestrip> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dhalDp2indexedlinestrip =
                    D3dhalDp2indexedlinestrip(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (2).toInt())
                        ).readNative(addr).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2indexedlinestrip) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (2).toInt())
                    ).writeNative(addr, value.wV.toList())
                }
            }
    }
}

public data class D3dhalDp2indexedtrianglefan(
    public var wV: UShortArray = UShortArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dhalDp2indexedtrianglefan) return false
        if (!this.wV.contentEquals(other.wV)) return false
        return true
    }

    override fun hashCode(): Int = this.wV.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2indexedtrianglefan> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2indexedtrianglefan> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): D3dhalDp2indexedtrianglefan =
                    D3dhalDp2indexedtrianglefan(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (3).toInt())
                        ).readNative(addr).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2indexedtrianglefan) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (3).toInt())
                    ).writeNative(addr, value.wV.toList())
                }
            }
    }
}

public data class D3dhalDp2indexedtrianglelist(
    public var wV1: UShort = 0u,
    public var wV2: UShort = 0u,
    public var wV3: UShort = 0u,
    public var wFlags: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2indexedtrianglelist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2indexedtrianglelist> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dhalDp2indexedtrianglelist =
                    D3dhalDp2indexedtrianglelist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2indexedtrianglelist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wV1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wV2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wV3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.wFlags)
                }
            }
    }
}

public data class D3dhalDp2indexedtrianglelist2(
    public var wV1: UShort = 0u,
    public var wV2: UShort = 0u,
    public var wV3: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2indexedtrianglelist2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2indexedtrianglelist2> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): D3dhalDp2indexedtrianglelist2 =
                    D3dhalDp2indexedtrianglelist2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2indexedtrianglelist2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wV1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wV2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wV3)
                }
            }
    }
}

public data class D3dhalDp2indexedtrianglestrip(
    public var wV: UShortArray = UShortArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dhalDp2indexedtrianglestrip) return false
        if (!this.wV.contentEquals(other.wV)) return false
        return true
    }

    override fun hashCode(): Int = this.wV.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2indexedtrianglestrip> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2indexedtrianglestrip> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): D3dhalDp2indexedtrianglestrip =
                    D3dhalDp2indexedtrianglestrip(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (3).toInt())
                        ).readNative(addr).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2indexedtrianglestrip) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (3).toInt())
                    ).writeNative(addr, value.wV.toList())
                }
            }
    }
}

public data class D3dhalDp2issuequery(
    public var dwQueryID: UInt = 0u,
    public var dwFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2issuequery> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2issuequery> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dhalDp2issuequery =
                    D3dhalDp2issuequery(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2issuequery) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwQueryID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwFlags)
                }
            }
    }
}

public data class D3dhalDp2linelist(
    public var wVStart: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2linelist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2linelist> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): D3dhalDp2linelist =
                    D3dhalDp2linelist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2linelist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wVStart)
                }
            }
    }
}

public data class D3dhalDp2linestrip(
    public var wVStart: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2linestrip> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2linestrip> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): D3dhalDp2linestrip =
                    D3dhalDp2linestrip(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2linestrip) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wVStart)
                }
            }
    }
}

public data class D3dhalDp2pixelshader(
    public var dwHandle: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2pixelshader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2pixelshader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dhalDp2pixelshader =
                    D3dhalDp2pixelshader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2pixelshader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwHandle)
                }
            }
    }
}

public data class D3dhalDp2points(
    public var wCount: UShort = 0u,
    public var wVStart: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2points> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2points> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dhalDp2points =
                    D3dhalDp2points(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2points) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wVStart)
                }
            }
    }
}

public data class D3dhalDp2response(
    public var bCommand: UByte = 0u,
    public var bReserved: UByte = 0u,
    public var wStateCount: UShort = 0u,
    public var dwTotalSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2response> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2response> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dhalDp2response =
                    D3dhalDp2response(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2response) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bCommand)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wStateCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwTotalSize)
                }
            }
    }
}

public data class D3dhalDp2responsequery(
    public var dwQueryID: UInt = 0u,
    public var dwSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2responsequery> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2responsequery> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dhalDp2responsequery =
                    D3dhalDp2responsequery(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2responsequery) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwQueryID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwSize)
                }
            }
    }
}

public data class D3dhalDp2setclipplane(
    public var dwIndex: UInt = 0u,
    public var plane: FloatArray = FloatArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dhalDp2setclipplane) return false
        if (this.dwIndex != other.dwIndex) return false
        if (!this.plane.contentEquals(other.plane)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwIndex.hashCode()
        result = 31 * result + this.plane.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2setclipplane> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2setclipplane> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): D3dhalDp2setclipplane =
                    D3dhalDp2setclipplane(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32, (4).toInt())
                        ).readNative(addr + 4L).toFloatArray(),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2setclipplane) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwIndex)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32, (4).toInt())
                    ).writeNative(addr + 4L, value.plane.toList())
                }
            }
    }
}

public data class D3dhalDp2setconvolutionkernelmono(
    public var dwWidth: UInt = 0u,
    public var dwHeight: UInt = 0u,
    public var dwFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2setconvolutionkernelmono> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2setconvolutionkernelmono> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): D3dhalDp2setconvolutionkernelmono =
                    D3dhalDp2setconvolutionkernelmono(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2setconvolutionkernelmono) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFlags)
                }
            }
    }
}

public data class D3dhalDp2setdepthstencil(
    public var hZBuffer: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2setdepthstencil> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2setdepthstencil> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dhalDp2setdepthstencil =
                    D3dhalDp2setdepthstencil(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2setdepthstencil) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hZBuffer)
                }
            }
    }
}

public data class D3dhalDp2setindices(
    public var dwVBHandle: UInt = 0u,
    public var dwStride: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2setindices> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2setindices> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dhalDp2setindices =
                    D3dhalDp2setindices(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2setindices) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwVBHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwStride)
                }
            }
    }
}

public data class D3dhalDp2setlight(
    public var dwIndex: UInt = 0u,
    public var dwDataType: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2setlight> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2setlight> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dhalDp2setlight =
                    D3dhalDp2setlight(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2setlight) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwDataType)
                }
            }
    }
}

public data class D3dhalDp2setpalette(
    public var dwPaletteHandle: UInt = 0u,
    public var dwPaletteFlags: UInt = 0u,
    public var dwSurfaceHandle: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2setpalette> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2setpalette> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): D3dhalDp2setpalette =
                    D3dhalDp2setpalette(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2setpalette) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwPaletteHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwPaletteFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwSurfaceHandle)
                }
            }
    }
}

public data class D3dhalDp2setpixelshaderconst(
    public var dwRegister: UInt = 0u,
    public var dwCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2setpixelshaderconst> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2setpixelshaderconst> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dhalDp2setpixelshaderconst =
                    D3dhalDp2setpixelshaderconst(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2setpixelshaderconst) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwRegister)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwCount)
                }
            }
    }
}

public data class D3dhalDp2setpriority(
    public var dwDDSurface: UInt = 0u,
    public var dwPriority: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2setpriority> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2setpriority> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dhalDp2setpriority =
                    D3dhalDp2setpriority(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2setpriority) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwDDSurface)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwPriority)
                }
            }
    }
}

public data class D3dhalDp2setrendertarget(
    public var hRenderTarget: UInt = 0u,
    public var hZBuffer: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2setrendertarget> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2setrendertarget> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dhalDp2setrendertarget =
                    D3dhalDp2setrendertarget(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2setrendertarget) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hRenderTarget)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hZBuffer)
                }
            }
    }
}

public data class D3dhalDp2setrendertarget2(
    public var rTIndex: UInt = 0u,
    public var hRenderTarget: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2setrendertarget2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2setrendertarget2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dhalDp2setrendertarget2 =
                    D3dhalDp2setrendertarget2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2setrendertarget2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.rTIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hRenderTarget)
                }
            }
    }
}

public data class D3dhalDp2setstreamsource(
    public var dwStream: UInt = 0u,
    public var dwVBHandle: UInt = 0u,
    public var dwStride: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2setstreamsource> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2setstreamsource> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): D3dhalDp2setstreamsource =
                    D3dhalDp2setstreamsource(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2setstreamsource) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwStream)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwVBHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwStride)
                }
            }
    }
}

public data class D3dhalDp2setstreamsource2(
    public var dwStream: UInt = 0u,
    public var dwVBHandle: UInt = 0u,
    public var dwOffset: UInt = 0u,
    public var dwStride: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2setstreamsource2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2setstreamsource2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): D3dhalDp2setstreamsource2 =
                    D3dhalDp2setstreamsource2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2setstreamsource2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwStream)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwVBHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwStride)
                }
            }
    }
}

public data class D3dhalDp2setstreamsourcefreq(
    public var dwStream: UInt = 0u,
    public var dwDivider: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2setstreamsourcefreq> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2setstreamsourcefreq> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dhalDp2setstreamsourcefreq =
                    D3dhalDp2setstreamsourcefreq(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2setstreamsourcefreq) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwStream)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwDivider)
                }
            }
    }
}

public data class D3dhalDp2setstreamsourceum(
    public var dwStream: UInt = 0u,
    public var dwStride: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2setstreamsourceum> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2setstreamsourceum> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dhalDp2setstreamsourceum =
                    D3dhalDp2setstreamsourceum(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2setstreamsourceum) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwStream)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwStride)
                }
            }
    }
}

public data class D3dhalDp2settexlod(
    public var dwDDSurface: UInt = 0u,
    public var dwLOD: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2settexlod> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2settexlod> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dhalDp2settexlod =
                    D3dhalDp2settexlod(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2settexlod) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwDDSurface)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwLOD)
                }
            }
    }
}

public data class D3dhalDp2setvertexshaderconst(
    public var dwRegister: UInt = 0u,
    public var dwCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2setvertexshaderconst> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2setvertexshaderconst> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dhalDp2setvertexshaderconst =
                    D3dhalDp2setvertexshaderconst(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2setvertexshaderconst) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwRegister)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwCount)
                }
            }
    }
}

public data class D3dhalDp2startvertex(
    public var wVStart: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2startvertex> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2startvertex> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): D3dhalDp2startvertex =
                    D3dhalDp2startvertex(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2startvertex) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wVStart)
                }
            }
    }
}

public data class D3dhalDp2surfaceblt(
    public var dwSource: UInt = 0u,
    public var rSource: Rectl = Rectl(),
    public var dwSourceMipLevel: UInt = 0u,
    public var dwDest: UInt = 0u,
    public var rDest: Rectl = Rectl(),
    public var dwDestMipLevel: UInt = 0u,
    public var flags: UInt = 0u,
)

public data class D3dhalDp2texblt(
    public var dwDDDestSurface: UInt = 0u,
    public var dwDDSrcSurface: UInt = 0u,
    public var pDest: Point = Point(),
    public var rSrc: Rectl = Rectl(),
    public var dwFlags: UInt = 0u,
)

public data class D3dhalDp2texturestagestate(
    public var wStage: UShort = 0u,
    public var tSState: UShort = 0u,
    public var dwValue: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2texturestagestate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2texturestagestate> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dhalDp2texturestagestate =
                    D3dhalDp2texturestagestate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2texturestagestate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wStage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.tSState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwValue)
                }
            }
    }
}

public data class D3dhalDp2trianglefan(
    public var wVStart: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2trianglefan> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2trianglefan> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): D3dhalDp2trianglefan =
                    D3dhalDp2trianglefan(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2trianglefan) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wVStart)
                }
            }
    }
}

public data class D3dhalDp2trianglefanImm(
    public var dwEdgeFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2trianglefanImm> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2trianglefanImm> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dhalDp2trianglefanImm =
                    D3dhalDp2trianglefanImm(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2trianglefanImm) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwEdgeFlags)
                }
            }
    }
}

public data class D3dhalDp2trianglelist(
    public var wVStart: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2trianglelist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2trianglelist> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): D3dhalDp2trianglelist =
                    D3dhalDp2trianglelist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2trianglelist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wVStart)
                }
            }
    }
}

public data class D3dhalDp2trianglestrip(
    public var wVStart: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2trianglestrip> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2trianglestrip> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): D3dhalDp2trianglestrip =
                    D3dhalDp2trianglestrip(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2trianglestrip) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wVStart)
                }
            }
    }
}

public data class D3dhalDp2updatepalette(
    public var dwPaletteHandle: UInt = 0u,
    public var wStartIndex: UShort = 0u,
    public var wNumEntries: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2updatepalette> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2updatepalette> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dhalDp2updatepalette =
                    D3dhalDp2updatepalette(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2updatepalette) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwPaletteHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wStartIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.wNumEntries)
                }
            }
    }
}

public data class D3dhalDp2vertexshader(
    public var dwHandle: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2vertexshader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2vertexshader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dhalDp2vertexshader =
                    D3dhalDp2vertexshader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2vertexshader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwHandle)
                }
            }
    }
}

public data class D3dhalDp2viewportinfo(
    public var dwX: UInt = 0u,
    public var dwY: UInt = 0u,
    public var dwWidth: UInt = 0u,
    public var dwHeight: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2viewportinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2viewportinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): D3dhalDp2viewportinfo =
                    D3dhalDp2viewportinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2viewportinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwHeight)
                }
            }
    }
}

public data class D3dhalDp2winfo(
    public var dvWNear: Float = 0.0f,
    public var dvWFar: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2winfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2winfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dhalDp2winfo =
                    D3dhalDp2winfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2winfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.dvWNear)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.dvWFar)
                }
            }
    }
}

public data class D3dhalDp2zrange(
    public var dvMinZ: Float = 0.0f,
    public var dvMaxZ: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2zrange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDp2zrange> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dhalDp2zrange =
                    D3dhalDp2zrange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDp2zrange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.dvMinZ)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.dvMaxZ)
                }
            }
    }
}

public data class D3dhalDrawprimcounts(
    public var wNumStateChanges: UShort = 0u,
    public var wPrimitiveType: UShort = 0u,
    public var wVertexType: UShort = 0u,
    public var wNumVertices: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDrawprimcounts> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDrawprimcounts> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dhalDrawprimcounts =
                    D3dhalDrawprimcounts(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDrawprimcounts) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wNumStateChanges)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wPrimitiveType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wVertexType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.wNumVertices)
                }
            }
    }
}

public class D3dhalDrawprimitivesdata internal constructor(
    public var dwhContext: Int,
    public var dwFlags: UInt,
    lpvDataCtorArg: MutPtr<CVoid>,
    public var dwFVFControl: UInt,
    public var ddrval: Hresult,
) {
    public var lpvData: MutPtr<CVoid> = lpvDataCtorArg
        internal set

    public constructor() : this(
        dwhContext = 0,
        dwFlags = 0u,
        lpvDataCtorArg = MutPtr(0L),
        dwFVFControl = 0u,
        ddrval = 0,
    )

    public operator fun component1(): Int = this.dwhContext

    public operator fun component2(): UInt = this.dwFlags

    public operator fun component3(): MutPtr<CVoid> = this.lpvData

    public operator fun component4(): UInt = this.dwFVFControl

    public operator fun component5(): Hresult = this.ddrval

    public fun copy(dwhContext: Int = this.dwhContext, dwFlags: UInt = this.dwFlags, lpvData: MutPtr<CVoid> = this.lpvData, dwFVFControl: UInt = this.dwFVFControl, ddrval: Hresult = this.ddrval): D3dhalDrawprimitivesdata = D3dhalDrawprimitivesdata(dwhContext = dwhContext, dwFlags = dwFlags, lpvDataCtorArg = lpvData, dwFVFControl = dwFVFControl, ddrval = ddrval)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dhalDrawprimitivesdata) return false
        if (this.dwhContext != other.dwhContext) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.lpvData != other.lpvData) return false
        if (this.dwFVFControl != other.dwFVFControl) return false
        if (this.ddrval != other.ddrval) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwhContext.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.lpvData.hashCode()
        result = 31 * result + this.dwFVFControl.hashCode()
        result = 31 * result + this.ddrval.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDrawprimitivesdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalDrawprimitivesdata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): D3dhalDrawprimitivesdata =
                    D3dhalDrawprimitivesdata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: D3dhalDrawprimitivesdata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwhContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.lpvData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwFVFControl)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.ddrval)
                }
            }

        public operator fun invoke(
            dwhContext: Int = 0,
            dwFlags: UInt = 0u,
            lpvData: MutPtr<CVoid> = MutPtr(0L),
            dwFVFControl: UInt = 0u,
            ddrval: Hresult = 0,
        ): D3dhalDrawprimitivesdata =
            D3dhalDrawprimitivesdata(
                dwhContext = dwhContext,
                dwFlags = dwFlags,
                lpvDataCtorArg = lpvData,
                dwFVFControl = dwFVFControl,
                ddrval = ddrval,
            )
    }
}

public data class D3dhalScenecapturedata(
    public var dwhContext: Int = 0,
    public var dwFlag: UInt = 0u,
    public var ddrval: Hresult = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalScenecapturedata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalScenecapturedata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): D3dhalScenecapturedata =
                    D3dhalScenecapturedata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: D3dhalScenecapturedata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwhContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFlag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.ddrval)
                }
            }
    }
}

public data class D3dhalTexturedestroydata(
    public var dwhContext: Int = 0,
    public var dwHandle: UInt = 0u,
    public var ddrval: Hresult = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalTexturedestroydata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalTexturedestroydata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): D3dhalTexturedestroydata =
                    D3dhalTexturedestroydata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: D3dhalTexturedestroydata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwhContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.ddrval)
                }
            }
    }
}

public data class D3dhalTexturegetsurfdata(
    public var dwhContext: Int = 0,
    public var lpDDS: Int = 0,
    public var dwHandle: UInt = 0u,
    public var ddrval: Hresult = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalTexturegetsurfdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalTexturegetsurfdata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): D3dhalTexturegetsurfdata =
                    D3dhalTexturegetsurfdata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: D3dhalTexturegetsurfdata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwhContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.lpDDS)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.ddrval)
                }
            }
    }
}

public data class D3dhalTextureswapdata(
    public var dwhContext: Int = 0,
    public var dwHandle1: UInt = 0u,
    public var dwHandle2: UInt = 0u,
    public var ddrval: Hresult = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalTextureswapdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalTextureswapdata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): D3dhalTextureswapdata =
                    D3dhalTextureswapdata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: D3dhalTextureswapdata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwhContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwHandle1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwHandle2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.ddrval)
                }
            }
    }
}

public data class D3dhalValidatetexturestagestatedata(
    public var dwhContext: Int = 0,
    public var dwFlags: UInt = 0u,
    public var dwReserved: Int = 0,
    public var dwNumPasses: UInt = 0u,
    public var ddrval: Hresult = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalValidatetexturestagestatedata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dhalValidatetexturestagestatedata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): D3dhalValidatetexturestagestatedata =
                    D3dhalValidatetexturestagestatedata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: D3dhalValidatetexturestagestatedata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.dwhContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.dwReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dwNumPasses)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.ddrval)
                }
            }
    }
}

public data class D3dkmdt2dregion(
    public var cx: UInt = 0u,
    public var cy: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdt2dregion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdt2dregion> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmdt2dregion =
                    D3dkmdt2dregion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmdt2dregion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cy)
                }
            }
    }
}

public data class D3dkmdt3x4ColorspaceTransform(
    public var colorMatrix3x4: FloatArray = FloatArray(12),
    public var scalarMultiplier: Float = 0.0f,
    public var lookupTable1D: List<D3dddiDxgiRgb> = List(4096) { D3dddiDxgiRgb() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmdt3x4ColorspaceTransform) return false
        if (!this.colorMatrix3x4.contentEquals(other.colorMatrix3x4)) return false
        if (this.scalarMultiplier != other.scalarMultiplier) return false
        if (this.lookupTable1D != other.lookupTable1D) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.colorMatrix3x4.contentHashCode()
        result = 31 * result + this.scalarMultiplier.hashCode()
        result = 31 * result + this.lookupTable1D.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdt3x4ColorspaceTransform> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdt3x4ColorspaceTransform> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 49204L
                override fun readNative(addr: Long): D3dkmdt3x4ColorspaceTransform =
                    D3dkmdt3x4ColorspaceTransform(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32, (12).toInt())
                        ).readNative(addr).toFloatArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(D3dddiDxgiRgb.typeLayout(), (4096).toInt())
                        ).readNative(addr + 52L),
                    )
                override fun writeNative(addr: Long, value: D3dkmdt3x4ColorspaceTransform) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32, (12).toInt())
                    ).writeNative(addr, value.colorMatrix3x4.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 48L, value.scalarMultiplier)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(D3dddiDxgiRgb.typeLayout(), (4096).toInt())
                    ).writeNative(addr + 52L, value.lookupTable1D)
                }
            }
    }
}

public data class D3dkmdtColorspaceTransformMatrixV2(
    public var stageControlLookupTable1DDegamma: D3dkmdtColorspaceTransformStageControl = 0,
    public var lookupTable1DDegamma: List<D3dddiDxgiRgb> = List(4096) { D3dddiDxgiRgb() },
    public var stageControlColorMatrix3x3: D3dkmdtColorspaceTransformStageControl = 0,
    public var colorMatrix3x3: FloatArray = FloatArray(9),
    public var stageControlLookupTable1DRegamma: D3dkmdtColorspaceTransformStageControl = 0,
    public var lookupTable1DRegamma: List<D3dddiDxgiRgb> = List(4096) { D3dddiDxgiRgb() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmdtColorspaceTransformMatrixV2) return false
        if (this.stageControlLookupTable1DDegamma != other.stageControlLookupTable1DDegamma) return false
        if (this.lookupTable1DDegamma != other.lookupTable1DDegamma) return false
        if (this.stageControlColorMatrix3x3 != other.stageControlColorMatrix3x3) return false
        if (!this.colorMatrix3x3.contentEquals(other.colorMatrix3x3)) return false
        if (this.stageControlLookupTable1DRegamma != other.stageControlLookupTable1DRegamma) return false
        if (this.lookupTable1DRegamma != other.lookupTable1DRegamma) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.stageControlLookupTable1DDegamma.hashCode()
        result = 31 * result + this.lookupTable1DDegamma.hashCode()
        result = 31 * result + this.stageControlColorMatrix3x3.hashCode()
        result = 31 * result + this.colorMatrix3x3.contentHashCode()
        result = 31 * result + this.stageControlLookupTable1DRegamma.hashCode()
        result = 31 * result + this.lookupTable1DRegamma.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtColorspaceTransformMatrixV2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtColorspaceTransformMatrixV2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 98352L
                override fun readNative(addr: Long): D3dkmdtColorspaceTransformMatrixV2 =
                    D3dkmdtColorspaceTransformMatrixV2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(D3dddiDxgiRgb.typeLayout(), (4096).toInt())
                        ).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 49156L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32, (9).toInt())
                        ).readNative(addr + 49160L).toFloatArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 49196L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(D3dddiDxgiRgb.typeLayout(), (4096).toInt())
                        ).readNative(addr + 49200L),
                    )
                override fun writeNative(addr: Long, value: D3dkmdtColorspaceTransformMatrixV2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.stageControlLookupTable1DDegamma)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(D3dddiDxgiRgb.typeLayout(), (4096).toInt())
                    ).writeNative(addr + 4L, value.lookupTable1DDegamma)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 49156L, value.stageControlColorMatrix3x3)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32, (9).toInt())
                    ).writeNative(addr + 49160L, value.colorMatrix3x3.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 49196L, value.stageControlLookupTable1DRegamma)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(D3dddiDxgiRgb.typeLayout(), (4096).toInt())
                    ).writeNative(addr + 49200L, value.lookupTable1DRegamma)
                }
            }
    }
}

public data class D3dkmdtColorCoeffDynamicRanges(
    public var firstChannel: UInt = 0u,
    public var secondChannel: UInt = 0u,
    public var thirdChannel: UInt = 0u,
    public var fourthChannel: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtColorCoeffDynamicRanges> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtColorCoeffDynamicRanges> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): D3dkmdtColorCoeffDynamicRanges =
                    D3dkmdtColorCoeffDynamicRanges(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: D3dkmdtColorCoeffDynamicRanges) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.firstChannel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.secondChannel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.thirdChannel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.fourthChannel)
                }
            }
    }
}

public data class D3dkmdtDisplaymodeFlags(
    public var bitfield1: UInt = 0u,
    public var bitfield2: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtDisplaymodeFlags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtDisplaymodeFlags> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmdtDisplaymodeFlags =
                    D3dkmdtDisplaymodeFlags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmdtDisplaymodeFlags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bitfield2)
                }
            }
    }
}

public data class D3dkmdtFrequencyRange(
    public var minVSyncFreq: D3dddiRational = D3dddiRational(),
    public var maxVSyncFreq: D3dddiRational = D3dddiRational(),
    public var minHSyncFreq: D3dddiRational = D3dddiRational(),
    public var maxHSyncFreq: D3dddiRational = D3dddiRational(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtFrequencyRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtFrequencyRange> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): D3dkmdtFrequencyRange =
                    D3dkmdtFrequencyRange(
                        (D3dddiRational.typeLayout()).readNative(addr),
                        (D3dddiRational.typeLayout()).readNative(addr + 8L),
                        (D3dddiRational.typeLayout()).readNative(addr + 16L),
                        (D3dddiRational.typeLayout()).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: D3dkmdtFrequencyRange) {
                    (D3dddiRational.typeLayout()).writeNative(addr, value.minVSyncFreq)
                    (D3dddiRational.typeLayout()).writeNative(addr + 8L, value.maxVSyncFreq)
                    (D3dddiRational.typeLayout()).writeNative(addr + 16L, value.minHSyncFreq)
                    (D3dddiRational.typeLayout()).writeNative(addr + 24L, value.maxHSyncFreq)
                }
            }
    }
}

public data class D3dkmdtGammaRamp(
    public var type: D3dddiGammarampType = 0,
    public var dataSize: Int = 0,
    public var data: D3dkmdtGammaRamp0 = D3dkmdtGammaRamp0(),
)

public class D3dkmdtGammaRamp0 internal constructor(
    pRgb256x3x16CtorArg: MutPtr<D3dddiGammaRampRgb256x3x16>,
    pDxgi1CtorArg: MutPtr<D3dddiGammaRampDxgi1>,
    p3x4CtorArg: MutPtr<D3dkmdt3x4ColorspaceTransform>,
    pMatrixV2CtorArg: MutPtr<D3dkmdtColorspaceTransformMatrixV2>,
    pRawCtorArg: MutPtr<CVoid>,
) {
    public var pRgb256x3x16: MutPtr<D3dddiGammaRampRgb256x3x16> = pRgb256x3x16CtorArg
        internal set

    public var pDxgi1: MutPtr<D3dddiGammaRampDxgi1> = pDxgi1CtorArg
        internal set

    public var p3x4: MutPtr<D3dkmdt3x4ColorspaceTransform> = p3x4CtorArg
        internal set

    public var pMatrixV2: MutPtr<D3dkmdtColorspaceTransformMatrixV2> = pMatrixV2CtorArg
        internal set

    public var pRaw: MutPtr<CVoid> = pRawCtorArg
        internal set

    public constructor() : this(
        pRgb256x3x16CtorArg = MutPtr(0L),
        pDxgi1CtorArg = MutPtr(0L),
        p3x4CtorArg = MutPtr(0L),
        pMatrixV2CtorArg = MutPtr(0L),
        pRawCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<D3dddiGammaRampRgb256x3x16> = this.pRgb256x3x16

    public operator fun component2(): MutPtr<D3dddiGammaRampDxgi1> = this.pDxgi1

    public operator fun component3(): MutPtr<D3dkmdt3x4ColorspaceTransform> = this.p3x4

    public operator fun component4(): MutPtr<D3dkmdtColorspaceTransformMatrixV2> = this.pMatrixV2

    public operator fun component5(): MutPtr<CVoid> = this.pRaw

    public fun copy(pRgb256x3x16: MutPtr<D3dddiGammaRampRgb256x3x16> = this.pRgb256x3x16, pDxgi1: MutPtr<D3dddiGammaRampDxgi1> = this.pDxgi1, p3x4: MutPtr<D3dkmdt3x4ColorspaceTransform> = this.p3x4, pMatrixV2: MutPtr<D3dkmdtColorspaceTransformMatrixV2> = this.pMatrixV2, pRaw: MutPtr<CVoid> = this.pRaw): D3dkmdtGammaRamp0 = D3dkmdtGammaRamp0(pRgb256x3x16CtorArg = pRgb256x3x16, pDxgi1CtorArg = pDxgi1, p3x4CtorArg = p3x4, pMatrixV2CtorArg = pMatrixV2, pRawCtorArg = pRaw)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmdtGammaRamp0) return false
        if (this.pRgb256x3x16 != other.pRgb256x3x16) return false
        if (this.pDxgi1 != other.pDxgi1) return false
        if (this.p3x4 != other.p3x4) return false
        if (this.pMatrixV2 != other.pMatrixV2) return false
        if (this.pRaw != other.pRaw) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pRgb256x3x16.hashCode()
        result = 31 * result + this.pDxgi1.hashCode()
        result = 31 * result + this.p3x4.hashCode()
        result = 31 * result + this.pMatrixV2.hashCode()
        result = 31 * result + this.pRaw.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pRgb256x3x16: MutPtr<D3dddiGammaRampRgb256x3x16> = MutPtr(0L),
            pDxgi1: MutPtr<D3dddiGammaRampDxgi1> = MutPtr(0L),
            p3x4: MutPtr<D3dkmdt3x4ColorspaceTransform> = MutPtr(0L),
            pMatrixV2: MutPtr<D3dkmdtColorspaceTransformMatrixV2> = MutPtr(0L),
            pRaw: MutPtr<CVoid> = MutPtr(0L),
        ): D3dkmdtGammaRamp0 =
            D3dkmdtGammaRamp0(
                pRgb256x3x16CtorArg = pRgb256x3x16,
                pDxgi1CtorArg = pDxgi1,
                p3x4CtorArg = p3x4,
                pMatrixV2CtorArg = pMatrixV2,
                pRawCtorArg = pRaw,
            )
    }
}

public data class D3dkmdtGdisurfacedata(
    public var width: UInt = 0u,
    public var height: UInt = 0u,
    public var format: D3dddiformat = 0u,
    public var type: D3dkmdtGdisurfacetype = 0,
    public var flags: D3dkmdtGdisurfaceflags = D3dkmdtGdisurfaceflags(),
    public var pitch: UInt = 0u,
)

public data class D3dkmdtGdisurfaceflags(
    public var anonymous: D3dkmdtGdisurfaceflags0 = D3dkmdtGdisurfaceflags0(),
)

public data class D3dkmdtGdisurfaceflags0(
    public var anonymous: D3dkmdtGdisurfaceflags00 = D3dkmdtGdisurfaceflags00(),
    public var value: UInt = 0u,
)

public data class D3dkmdtGdisurfaceflags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtGdisurfaceflags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtGdisurfaceflags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmdtGdisurfaceflags00 =
                    D3dkmdtGdisurfaceflags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmdtGdisurfaceflags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmdtGraphicsRenderingFormat(
    public var primSurfSize: D3dkmdt2dregion = D3dkmdt2dregion(),
    public var visibleRegionSize: D3dkmdt2dregion = D3dkmdt2dregion(),
    public var stride: UInt = 0u,
    public var pixelFormat: D3dddiformat = 0u,
    public var colorBasis: D3dkmdtColorBasis = 0,
    public var pixelValueAccessMode: D3dkmdtPixelValueAccessMode = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtGraphicsRenderingFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtGraphicsRenderingFormat> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): D3dkmdtGraphicsRenderingFormat =
                    D3dkmdtGraphicsRenderingFormat(
                        (D3dkmdt2dregion.typeLayout()).readNative(addr),
                        (D3dkmdt2dregion.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: D3dkmdtGraphicsRenderingFormat) {
                    (D3dkmdt2dregion.typeLayout()).writeNative(addr, value.primSurfSize)
                    (D3dkmdt2dregion.typeLayout()).writeNative(addr + 8L, value.visibleRegionSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.stride)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.pixelFormat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.colorBasis)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.pixelValueAccessMode)
                }
            }
    }
}

public class D3dkmdtMonitorDescriptor internal constructor(
    public var id: UInt,
    public var type: D3dkmdtMonitorDescriptorType,
    public var dataSize: Int,
    pDataCtorArg: MutPtr<CVoid>,
    public var origin: D3dkmdtMonitorCapabilitiesOrigin,
) {
    public var pData: MutPtr<CVoid> = pDataCtorArg
        internal set

    public constructor() : this(
        id = 0u,
        type = 0,
        dataSize = 0,
        pDataCtorArg = MutPtr(0L),
        origin = 0,
    )

    public operator fun component1(): UInt = this.id

    public operator fun component2(): D3dkmdtMonitorDescriptorType = this.type

    public operator fun component3(): Int = this.dataSize

    public operator fun component4(): MutPtr<CVoid> = this.pData

    public operator fun component5(): D3dkmdtMonitorCapabilitiesOrigin = this.origin

    public fun copy(id: UInt = this.id, type: D3dkmdtMonitorDescriptorType = this.type, dataSize: Int = this.dataSize, pData: MutPtr<CVoid> = this.pData, origin: D3dkmdtMonitorCapabilitiesOrigin = this.origin): D3dkmdtMonitorDescriptor = D3dkmdtMonitorDescriptor(id = id, type = type, dataSize = dataSize, pDataCtorArg = pData, origin = origin)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmdtMonitorDescriptor) return false
        if (this.id != other.id) return false
        if (this.type != other.type) return false
        if (this.dataSize != other.dataSize) return false
        if (this.pData != other.pData) return false
        if (this.origin != other.origin) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.dataSize.hashCode()
        result = 31 * result + this.pData.hashCode()
        result = 31 * result + this.origin.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtMonitorDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtMonitorDescriptor> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): D3dkmdtMonitorDescriptor =
                    D3dkmdtMonitorDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: D3dkmdtMonitorDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.id)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.dataSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.pData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.origin)
                }
            }

        public operator fun invoke(
            id: UInt = 0u,
            type: D3dkmdtMonitorDescriptorType = 0,
            dataSize: Int = 0,
            pData: MutPtr<CVoid> = MutPtr(0L),
            origin: D3dkmdtMonitorCapabilitiesOrigin = 0,
        ): D3dkmdtMonitorDescriptor =
            D3dkmdtMonitorDescriptor(
                id = id,
                type = type,
                dataSize = dataSize,
                pDataCtorArg = pData,
                origin = origin,
            )
    }
}

public data class D3dkmdtMonitorFrequencyRange(
    public var origin: D3dkmdtMonitorCapabilitiesOrigin = 0,
    public var rangeLimits: D3dkmdtFrequencyRange = D3dkmdtFrequencyRange(),
    public var constraintType: D3dkmdtMonitorFrequencyRangeConstraint = 0,
    public var constraint: D3dkmdtMonitorFrequencyRange0 = D3dkmdtMonitorFrequencyRange0(),
)

public data class D3dkmdtMonitorFrequencyRange0(
    public var activeSize: D3dkmdt2dregion = D3dkmdt2dregion(),
    public var maxPixelRate: Int = 0,
)

public data class D3dkmdtMonitorSourceMode(
    public var id: UInt = 0u,
    public var videoSignalInfo: D3dkmdtVideoSignalInfo = D3dkmdtVideoSignalInfo(),
    public var colorBasis: D3dkmdtColorBasis = 0,
    public var colorCoeffDynamicRanges: D3dkmdtColorCoeffDynamicRanges = D3dkmdtColorCoeffDynamicRanges(),
    public var origin: D3dkmdtMonitorCapabilitiesOrigin = 0,
    public var preference: D3dkmdtModePreference = 0,
)

public data class D3dkmdtPalettedata(
    public var red: UByte = 0u,
    public var green: UByte = 0u,
    public var blue: UByte = 0u,
    public var unused: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtPalettedata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtPalettedata> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmdtPalettedata =
                    D3dkmdtPalettedata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: D3dkmdtPalettedata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.red)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.green)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.blue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.unused)
                }
            }
    }
}

public data class D3dkmdtPreemptionCaps(
    public var graphicsPreemptionGranularity: D3dkmdtGraphicsPreemptionGranularity = 0,
    public var computePreemptionGranularity: D3dkmdtComputePreemptionGranularity = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtPreemptionCaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtPreemptionCaps> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmdtPreemptionCaps =
                    D3dkmdtPreemptionCaps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmdtPreemptionCaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.graphicsPreemptionGranularity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.computePreemptionGranularity)
                }
            }
    }
}

public data class D3dkmdtShadowsurfacedata(
    public var width: UInt = 0u,
    public var height: UInt = 0u,
    public var format: D3dddiformat = 0u,
    public var pitch: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtShadowsurfacedata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtShadowsurfacedata> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): D3dkmdtShadowsurfacedata =
                    D3dkmdtShadowsurfacedata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: D3dkmdtShadowsurfacedata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.width)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.height)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.format)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.pitch)
                }
            }
    }
}

public data class D3dkmdtSharedprimarysurfacedata(
    public var width: UInt = 0u,
    public var height: UInt = 0u,
    public var format: D3dddiformat = 0u,
    public var refreshRate: D3dddiRational = D3dddiRational(),
    public var vidPnSourceId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtSharedprimarysurfacedata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtSharedprimarysurfacedata> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): D3dkmdtSharedprimarysurfacedata =
                    D3dkmdtSharedprimarysurfacedata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (D3dddiRational.typeLayout()).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: D3dkmdtSharedprimarysurfacedata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.width)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.height)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.format)
                    (D3dddiRational.typeLayout()).writeNative(addr + 12L, value.refreshRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.vidPnSourceId)
                }
            }
    }
}

public data class D3dkmdtStagingsurfacedata(
    public var width: UInt = 0u,
    public var height: UInt = 0u,
    public var pitch: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtStagingsurfacedata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtStagingsurfacedata> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): D3dkmdtStagingsurfacedata =
                    D3dkmdtStagingsurfacedata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dkmdtStagingsurfacedata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.width)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.height)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.pitch)
                }
            }
    }
}

public data class D3dkmdtVideoPresentSource(
    public var id: UInt = 0u,
    public var dwReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtVideoPresentSource> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtVideoPresentSource> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmdtVideoPresentSource =
                    D3dkmdtVideoPresentSource(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmdtVideoPresentSource) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.id)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwReserved)
                }
            }
    }
}

public data class D3dkmdtVideoPresentTarget(
    public var id: UInt = 0u,
    public var videoOutputTechnology: D3dkmdtVideoOutputTechnology = 0,
    public var videoOutputHpdAwareness: DxgkChildDeviceHpdAwareness = 0,
    public var monitorOrientationAwareness: D3dkmdtMonitorOrientationAwareness = 0,
    public var supportsSdtvModes: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtVideoPresentTarget> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtVideoPresentTarget> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): D3dkmdtVideoPresentTarget =
                    D3dkmdtVideoPresentTarget(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: D3dkmdtVideoPresentTarget) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.id)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.videoOutputTechnology)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.videoOutputHpdAwareness)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.monitorOrientationAwareness)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 16L, value.supportsSdtvModes)
                }
            }
    }
}

public data class D3dkmdtVideoSignalInfo(
    public var videoStandard: D3dkmdtVideoSignalStandard = 0,
    public var totalSize: D3dkmdt2dregion = D3dkmdt2dregion(),
    public var activeSize: D3dkmdt2dregion = D3dkmdt2dregion(),
    public var vSyncFreq: D3dddiRational = D3dddiRational(),
    public var hSyncFreq: D3dddiRational = D3dddiRational(),
    public var pixelRate: Int = 0,
    public var anonymous: D3dkmdtVideoSignalInfo0 = D3dkmdtVideoSignalInfo0(),
)

public data class D3dkmdtVideoSignalInfo0(
    public var additionalSignalInfo: D3dkmdtVideoSignalInfo00 = D3dkmdtVideoSignalInfo00(),
    public var scanLineOrdering: D3dddiVideoSignalScanlineOrdering = 0,
)

public data class D3dkmdtVideoSignalInfo00(
    public var bitfield: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtVideoSignalInfo00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtVideoSignalInfo00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmdtVideoSignalInfo00 =
                    D3dkmdtVideoSignalInfo00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmdtVideoSignalInfo00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmdtVidpnHwCapability(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtVidpnHwCapability> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtVidpnHwCapability> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmdtVidpnHwCapability =
                    D3dkmdtVidpnHwCapability(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmdtVidpnHwCapability) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmdtVidpnPresentPath(
    public var vidPnSourceId: UInt = 0u,
    public var vidPnTargetId: UInt = 0u,
    public var importanceOrdinal: D3dkmdtVidpnPresentPathImportance = 0,
    public var contentTransformation: D3dkmdtVidpnPresentPathTransformation = D3dkmdtVidpnPresentPathTransformation(),
    public var visibleFromActiveTLOffset: D3dkmdt2dregion = D3dkmdt2dregion(),
    public var visibleFromActiveBROffset: D3dkmdt2dregion = D3dkmdt2dregion(),
    public var vidPnTargetColorBasis: D3dkmdtColorBasis = 0,
    public var vidPnTargetColorCoeffDynamicRanges: D3dkmdtColorCoeffDynamicRanges = D3dkmdtColorCoeffDynamicRanges(),
    public var content: D3dkmdtVidpnPresentPathContent = 0,
    public var copyProtection: D3dkmdtVidpnPresentPathCopyprotection = D3dkmdtVidpnPresentPathCopyprotection(),
    public var gammaRamp: D3dkmdtGammaRamp = D3dkmdtGammaRamp(),
)

public data class D3dkmdtVidpnPresentPathCopyprotection(
    public var copyProtectionType: D3dkmdtVidpnPresentPathCopyprotectionType = 0,
    public var aPSTriggerBits: UInt = 0u,
    public var oEMCopyProtection: UByteArray = UByteArray(256),
    public var copyProtectionSupport: D3dkmdtVidpnPresentPathCopyprotectionSupport = D3dkmdtVidpnPresentPathCopyprotectionSupport(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmdtVidpnPresentPathCopyprotection) return false
        if (this.copyProtectionType != other.copyProtectionType) return false
        if (this.aPSTriggerBits != other.aPSTriggerBits) return false
        if (!this.oEMCopyProtection.contentEquals(other.oEMCopyProtection)) return false
        if (this.copyProtectionSupport != other.copyProtectionSupport) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.copyProtectionType.hashCode()
        result = 31 * result + this.aPSTriggerBits.hashCode()
        result = 31 * result + this.oEMCopyProtection.contentHashCode()
        result = 31 * result + this.copyProtectionSupport.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtVidpnPresentPathCopyprotection> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtVidpnPresentPathCopyprotection> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 268L
                override fun readNative(addr: Long): D3dkmdtVidpnPresentPathCopyprotection =
                    D3dkmdtVidpnPresentPathCopyprotection(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                        (D3dkmdtVidpnPresentPathCopyprotectionSupport.typeLayout()).readNative(addr + 264L),
                    )
                override fun writeNative(addr: Long, value: D3dkmdtVidpnPresentPathCopyprotection) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.copyProtectionType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.aPSTriggerBits)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                    ).writeNative(addr + 8L, value.oEMCopyProtection.toList())
                    (D3dkmdtVidpnPresentPathCopyprotectionSupport.typeLayout()).writeNative(addr + 264L, value.copyProtectionSupport)
                }
            }
    }
}

public data class D3dkmdtVidpnPresentPathCopyprotectionSupport(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtVidpnPresentPathCopyprotectionSupport> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtVidpnPresentPathCopyprotectionSupport> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmdtVidpnPresentPathCopyprotectionSupport =
                    D3dkmdtVidpnPresentPathCopyprotectionSupport(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmdtVidpnPresentPathCopyprotectionSupport) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmdtVidpnPresentPathRotationSupport(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtVidpnPresentPathRotationSupport> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtVidpnPresentPathRotationSupport> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmdtVidpnPresentPathRotationSupport =
                    D3dkmdtVidpnPresentPathRotationSupport(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmdtVidpnPresentPathRotationSupport) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmdtVidpnPresentPathScalingSupport(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtVidpnPresentPathScalingSupport> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtVidpnPresentPathScalingSupport> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmdtVidpnPresentPathScalingSupport =
                    D3dkmdtVidpnPresentPathScalingSupport(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmdtVidpnPresentPathScalingSupport) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmdtVidpnPresentPathTransformation(
    public var scaling: D3dkmdtVidpnPresentPathScaling = 0,
    public var scalingSupport: D3dkmdtVidpnPresentPathScalingSupport = D3dkmdtVidpnPresentPathScalingSupport(),
    public var rotation: D3dkmdtVidpnPresentPathRotation = 0,
    public var rotationSupport: D3dkmdtVidpnPresentPathRotationSupport = D3dkmdtVidpnPresentPathRotationSupport(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtVidpnPresentPathTransformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtVidpnPresentPathTransformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): D3dkmdtVidpnPresentPathTransformation =
                    D3dkmdtVidpnPresentPathTransformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (D3dkmdtVidpnPresentPathScalingSupport.typeLayout()).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (D3dkmdtVidpnPresentPathRotationSupport.typeLayout()).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: D3dkmdtVidpnPresentPathTransformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.scaling)
                    (D3dkmdtVidpnPresentPathScalingSupport.typeLayout()).writeNative(addr + 4L, value.scalingSupport)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.rotation)
                    (D3dkmdtVidpnPresentPathRotationSupport.typeLayout()).writeNative(addr + 12L, value.rotationSupport)
                }
            }
    }
}

public data class D3dkmdtVidpnSourceMode(
    public var id: UInt = 0u,
    public var type: D3dkmdtVidpnSourceModeType = 0,
    public var format: D3dkmdtVidpnSourceMode0 = D3dkmdtVidpnSourceMode0(),
)

public data class D3dkmdtVidpnSourceMode0(
    public var graphics: D3dkmdtGraphicsRenderingFormat = D3dkmdtGraphicsRenderingFormat(),
    public var text: D3dkmdtTextRenderingFormat = 0,
)

public data class D3dkmdtVidpnTargetMode(
    public var id: UInt = 0u,
    public var videoSignalInfo: D3dkmdtVideoSignalInfo = D3dkmdtVideoSignalInfo(),
    public var anonymous: D3dkmdtVidpnTargetMode0 = D3dkmdtVidpnTargetMode0(),
    public var minimumVSyncFreq: D3dddiRational = D3dddiRational(),
)

public data class D3dkmdtVidpnTargetMode0(
    public var wireFormatAndPreference: D3dkmdtWireFormatAndPreference = D3dkmdtWireFormatAndPreference(),
    public var anonymous: D3dkmdtVidpnTargetMode00 = D3dkmdtVidpnTargetMode00(),
)

public data class D3dkmdtVidpnTargetMode00(
    public var bitfield: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtVidpnTargetMode00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtVidpnTargetMode00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmdtVidpnTargetMode00 =
                    D3dkmdtVidpnTargetMode00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmdtVidpnTargetMode00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmdtVirtualgpusurfacedata(
    public var size: ULong = 0uL,
    public var alignment: UInt = 0u,
    public var driverSegmentId: UInt = 0u,
    public var privateDriverData: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtVirtualgpusurfacedata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtVirtualgpusurfacedata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): D3dkmdtVirtualgpusurfacedata =
                    D3dkmdtVirtualgpusurfacedata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: D3dkmdtVirtualgpusurfacedata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.alignment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.driverSegmentId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.privateDriverData)
                }
            }
    }
}

public data class D3dkmdtWireFormatAndPreference(
    public var anonymous: D3dkmdtWireFormatAndPreference0 = D3dkmdtWireFormatAndPreference0(),
    public var value: UInt = 0u,
)

public data class D3dkmdtWireFormatAndPreference0(
    public var bitfield: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtWireFormatAndPreference0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmdtWireFormatAndPreference0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmdtWireFormatAndPreference0 =
                    D3dkmdtWireFormatAndPreference0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmdtWireFormatAndPreference0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class D3dkmtAcquirekeyedmutex internal constructor(
    public var hKeyedMutex: UInt,
    public var key: ULong,
    pTimeoutCtorArg: MutPtr<Long>,
    public var fenceValue: ULong,
) {
    public var pTimeout: MutPtr<Long> = pTimeoutCtorArg
        internal set

    public constructor() : this(
        hKeyedMutex = 0u,
        key = 0uL,
        pTimeoutCtorArg = MutPtr(0L),
        fenceValue = 0uL,
    )

    public operator fun component1(): UInt = this.hKeyedMutex

    public operator fun component2(): ULong = this.key

    public operator fun component3(): MutPtr<Long> = this.pTimeout

    public operator fun component4(): ULong = this.fenceValue

    public fun copy(hKeyedMutex: UInt = this.hKeyedMutex, key: ULong = this.key, pTimeout: MutPtr<Long> = this.pTimeout, fenceValue: ULong = this.fenceValue): D3dkmtAcquirekeyedmutex = D3dkmtAcquirekeyedmutex(hKeyedMutex = hKeyedMutex, key = key, pTimeoutCtorArg = pTimeout, fenceValue = fenceValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtAcquirekeyedmutex) return false
        if (this.hKeyedMutex != other.hKeyedMutex) return false
        if (this.key != other.key) return false
        if (this.pTimeout != other.pTimeout) return false
        if (this.fenceValue != other.fenceValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hKeyedMutex.hashCode()
        result = 31 * result + this.key.hashCode()
        result = 31 * result + this.pTimeout.hashCode()
        result = 31 * result + this.fenceValue.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtAcquirekeyedmutex> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtAcquirekeyedmutex> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): D3dkmtAcquirekeyedmutex =
                    D3dkmtAcquirekeyedmutex(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Long>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtAcquirekeyedmutex) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hKeyedMutex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.key)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Long>(64)
                    ).writeNative(addr + 16L, value.pTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.fenceValue)
                }
            }

        public operator fun invoke(
            hKeyedMutex: UInt = 0u,
            key: ULong = 0uL,
            pTimeout: MutPtr<Long> = MutPtr(0L),
            fenceValue: ULong = 0uL,
        ): D3dkmtAcquirekeyedmutex =
            D3dkmtAcquirekeyedmutex(
                hKeyedMutex = hKeyedMutex,
                key = key,
                pTimeoutCtorArg = pTimeout,
                fenceValue = fenceValue,
            )
    }
}

public class D3dkmtAcquirekeyedmutex2 internal constructor(
    public var hKeyedMutex: UInt,
    public var key: ULong,
    pTimeoutCtorArg: MutPtr<Long>,
    public var fenceValue: ULong,
    pPrivateRuntimeDataCtorArg: MutPtr<CVoid>,
    public var privateRuntimeDataSize: UInt,
) {
    public var pTimeout: MutPtr<Long> = pTimeoutCtorArg
        internal set

    public var pPrivateRuntimeData: MutPtr<CVoid> = pPrivateRuntimeDataCtorArg
        internal set

    public constructor() : this(
        hKeyedMutex = 0u,
        key = 0uL,
        pTimeoutCtorArg = MutPtr(0L),
        fenceValue = 0uL,
        pPrivateRuntimeDataCtorArg = MutPtr(0L),
        privateRuntimeDataSize = 0u,
    )

    public operator fun component1(): UInt = this.hKeyedMutex

    public operator fun component2(): ULong = this.key

    public operator fun component3(): MutPtr<Long> = this.pTimeout

    public operator fun component4(): ULong = this.fenceValue

    public operator fun component5(): MutPtr<CVoid> = this.pPrivateRuntimeData

    public operator fun component6(): UInt = this.privateRuntimeDataSize

    public fun copy(hKeyedMutex: UInt = this.hKeyedMutex, key: ULong = this.key, pTimeout: MutPtr<Long> = this.pTimeout, fenceValue: ULong = this.fenceValue, pPrivateRuntimeData: MutPtr<CVoid> = this.pPrivateRuntimeData, privateRuntimeDataSize: UInt = this.privateRuntimeDataSize): D3dkmtAcquirekeyedmutex2 = D3dkmtAcquirekeyedmutex2(hKeyedMutex = hKeyedMutex, key = key, pTimeoutCtorArg = pTimeout, fenceValue = fenceValue, pPrivateRuntimeDataCtorArg = pPrivateRuntimeData, privateRuntimeDataSize = privateRuntimeDataSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtAcquirekeyedmutex2) return false
        if (this.hKeyedMutex != other.hKeyedMutex) return false
        if (this.key != other.key) return false
        if (this.pTimeout != other.pTimeout) return false
        if (this.fenceValue != other.fenceValue) return false
        if (this.pPrivateRuntimeData != other.pPrivateRuntimeData) return false
        if (this.privateRuntimeDataSize != other.privateRuntimeDataSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hKeyedMutex.hashCode()
        result = 31 * result + this.key.hashCode()
        result = 31 * result + this.pTimeout.hashCode()
        result = 31 * result + this.fenceValue.hashCode()
        result = 31 * result + this.pPrivateRuntimeData.hashCode()
        result = 31 * result + this.privateRuntimeDataSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtAcquirekeyedmutex2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtAcquirekeyedmutex2> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): D3dkmtAcquirekeyedmutex2 =
                    D3dkmtAcquirekeyedmutex2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Long>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtAcquirekeyedmutex2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hKeyedMutex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.key)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Long>(64)
                    ).writeNative(addr + 16L, value.pTimeout)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.fenceValue)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.pPrivateRuntimeData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.privateRuntimeDataSize)
                }
            }

        public operator fun invoke(
            hKeyedMutex: UInt = 0u,
            key: ULong = 0uL,
            pTimeout: MutPtr<Long> = MutPtr(0L),
            fenceValue: ULong = 0uL,
            pPrivateRuntimeData: MutPtr<CVoid> = MutPtr(0L),
            privateRuntimeDataSize: UInt = 0u,
        ): D3dkmtAcquirekeyedmutex2 =
            D3dkmtAcquirekeyedmutex2(
                hKeyedMutex = hKeyedMutex,
                key = key,
                pTimeoutCtorArg = pTimeout,
                fenceValue = fenceValue,
                pPrivateRuntimeDataCtorArg = pPrivateRuntimeData,
                privateRuntimeDataSize = privateRuntimeDataSize,
            )
    }
}

public data class D3dkmtActivateSpecificDiagEscape(
    public var type: D3dkmtActivateSpecificDiagType = 0,
    public var activate: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtActivateSpecificDiagEscape> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtActivateSpecificDiagEscape> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtActivateSpecificDiagEscape =
                    D3dkmtActivateSpecificDiagEscape(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtActivateSpecificDiagEscape) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.activate)
                }
            }
    }
}

public data class D3dkmtAdapteraddress(
    public var busNumber: UInt = 0u,
    public var deviceNumber: UInt = 0u,
    public var functionNumber: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtAdapteraddress> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtAdapteraddress> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): D3dkmtAdapteraddress =
                    D3dkmtAdapteraddress(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtAdapteraddress) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.busNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.deviceNumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.functionNumber)
                }
            }
    }
}

public data class D3dkmtAdapterinfo(
    public var hAdapter: UInt = 0u,
    public var adapterLuid: Luid = Luid(),
    public var numOfSources: UInt = 0u,
    public var bPrecisePresentRegionsPreferred: Bool = 0,
)

public data class D3dkmtAdapterregistryinfo(
    public var adapterString: UShortArray = UShortArray(260),
    public var biosString: UShortArray = UShortArray(260),
    public var dacType: UShortArray = UShortArray(260),
    public var chipType: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtAdapterregistryinfo) return false
        if (!this.adapterString.contentEquals(other.adapterString)) return false
        if (!this.biosString.contentEquals(other.biosString)) return false
        if (!this.dacType.contentEquals(other.dacType)) return false
        if (!this.chipType.contentEquals(other.chipType)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.adapterString.contentHashCode()
        result = 31 * result + this.biosString.contentHashCode()
        result = 31 * result + this.dacType.contentHashCode()
        result = 31 * result + this.chipType.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtAdapterregistryinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtAdapterregistryinfo> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2080L
                override fun readNative(addr: Long): D3dkmtAdapterregistryinfo =
                    D3dkmtAdapterregistryinfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 520L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 1040L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 1560L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: D3dkmtAdapterregistryinfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr, value.adapterString.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 520L, value.biosString.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 1040L, value.dacType.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 1560L, value.chipType.toList())
                }
            }
    }
}

public data class D3dkmtAdaptertype(
    public var anonymous: D3dkmtAdaptertype0 = D3dkmtAdaptertype0(),
)

public data class D3dkmtAdaptertype0(
    public var anonymous: D3dkmtAdaptertype00 = D3dkmtAdaptertype00(),
    public var value: UInt = 0u,
)

public data class D3dkmtAdaptertype00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtAdaptertype00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtAdaptertype00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtAdaptertype00 =
                    D3dkmtAdaptertype00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtAdaptertype00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtAdapterPerfdata(
    public var physicalAdapterIndex: UInt = 0u,
    public var memoryFrequency: ULong = 0uL,
    public var maxMemoryFrequency: ULong = 0uL,
    public var maxMemoryFrequencyOC: ULong = 0uL,
    public var memoryBandwidth: ULong = 0uL,
    public var pCIEBandwidth: ULong = 0uL,
    public var fanRPM: UInt = 0u,
    public var power: UInt = 0u,
    public var temperature: UInt = 0u,
    public var powerStateOverride: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtAdapterPerfdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtAdapterPerfdata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): D3dkmtAdapterPerfdata =
                    D3dkmtAdapterPerfdata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 60L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtAdapterPerfdata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.physicalAdapterIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.memoryFrequency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.maxMemoryFrequency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.maxMemoryFrequencyOC)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.memoryBandwidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.pCIEBandwidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.fanRPM)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.power)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.temperature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 60L, value.powerStateOverride)
                }
            }
    }
}

public data class D3dkmtAdapterPerfdatacaps(
    public var physicalAdapterIndex: UInt = 0u,
    public var maxMemoryBandwidth: ULong = 0uL,
    public var maxPCIEBandwidth: ULong = 0uL,
    public var maxFanRPM: UInt = 0u,
    public var temperatureMax: UInt = 0u,
    public var temperatureWarning: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtAdapterPerfdatacaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtAdapterPerfdatacaps> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): D3dkmtAdapterPerfdatacaps =
                    D3dkmtAdapterPerfdatacaps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtAdapterPerfdatacaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.physicalAdapterIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.maxMemoryBandwidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.maxPCIEBandwidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.maxFanRPM)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.temperatureMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.temperatureWarning)
                }
            }
    }
}
