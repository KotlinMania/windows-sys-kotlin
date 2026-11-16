@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rectl

public data class D3dkmtOutputduplpresentflags(
    public var anonymous: D3dkmtOutputduplpresentflags0 = D3dkmtOutputduplpresentflags0(),
)

public data class D3dkmtOutputduplpresentflags0(
    public var anonymous: D3dkmtOutputduplpresentflags00 = D3dkmtOutputduplpresentflags00(),
    public var value: UInt = 0u,
)

public data class D3dkmtOutputduplpresentflags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtOutputduplpresentflags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtOutputduplpresentflags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtOutputduplpresentflags00 =
                    D3dkmtOutputduplpresentflags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtOutputduplpresentflags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class D3dkmtOutputduplpresenttohwqueue internal constructor(
    public var hSource: UInt,
    public var vidPnSourceId: UInt,
    public var broadcastHwQueueCount: UInt,
    hHwQueuesCtorArg: MutPtr,
    public var presentRegions: D3dkmtPresentRgns,
    public var flags: D3dkmtOutputduplpresentflags,
    public var hIndirectHwQueue: UInt,
) {
    public var hHwQueues: MutPtr = hHwQueuesCtorArg
        internal set

    public constructor() : this(
        hSource = 0u,
        vidPnSourceId = 0u,
        broadcastHwQueueCount = 0u,
        hHwQueuesCtorArg = MutPtr(0L),
        presentRegions = D3dkmtPresentRgns(),
        flags = D3dkmtOutputduplpresentflags(),
        hIndirectHwQueue = 0u,
    )

    public operator fun component1(): UInt = this.hSource

    public operator fun component2(): UInt = this.vidPnSourceId

    public operator fun component3(): UInt = this.broadcastHwQueueCount

    public operator fun component4(): MutPtr = this.hHwQueues

    public operator fun component5(): D3dkmtPresentRgns = this.presentRegions

    public operator fun component6(): D3dkmtOutputduplpresentflags = this.flags

    public operator fun component7(): UInt = this.hIndirectHwQueue

    public fun copy(hSource: UInt = this.hSource, vidPnSourceId: UInt = this.vidPnSourceId, broadcastHwQueueCount: UInt = this.broadcastHwQueueCount, hHwQueues: MutPtr = this.hHwQueues, presentRegions: D3dkmtPresentRgns = this.presentRegions, flags: D3dkmtOutputduplpresentflags = this.flags, hIndirectHwQueue: UInt = this.hIndirectHwQueue): D3dkmtOutputduplpresenttohwqueue = D3dkmtOutputduplpresenttohwqueue(hSource = hSource, vidPnSourceId = vidPnSourceId, broadcastHwQueueCount = broadcastHwQueueCount, hHwQueuesCtorArg = hHwQueues, presentRegions = presentRegions, flags = flags, hIndirectHwQueue = hIndirectHwQueue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtOutputduplpresenttohwqueue) return false
        if (this.hSource != other.hSource) return false
        if (this.vidPnSourceId != other.vidPnSourceId) return false
        if (this.broadcastHwQueueCount != other.broadcastHwQueueCount) return false
        if (this.hHwQueues != other.hHwQueues) return false
        if (this.presentRegions != other.presentRegions) return false
        if (this.flags != other.flags) return false
        if (this.hIndirectHwQueue != other.hIndirectHwQueue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hSource.hashCode()
        result = 31 * result + this.vidPnSourceId.hashCode()
        result = 31 * result + this.broadcastHwQueueCount.hashCode()
        result = 31 * result + this.hHwQueues.hashCode()
        result = 31 * result + this.presentRegions.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.hIndirectHwQueue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hSource: UInt = 0u,
            vidPnSourceId: UInt = 0u,
            broadcastHwQueueCount: UInt = 0u,
            hHwQueues: MutPtr = MutPtr(0L),
            presentRegions: D3dkmtPresentRgns = D3dkmtPresentRgns(),
            flags: D3dkmtOutputduplpresentflags = D3dkmtOutputduplpresentflags(),
            hIndirectHwQueue: UInt = 0u,
        ): D3dkmtOutputduplpresenttohwqueue =
            D3dkmtOutputduplpresenttohwqueue(
                hSource = hSource,
                vidPnSourceId = vidPnSourceId,
                broadcastHwQueueCount = broadcastHwQueueCount,
                hHwQueuesCtorArg = hHwQueues,
                presentRegions = presentRegions,
                flags = flags,
                hIndirectHwQueue = hIndirectHwQueue,
            )
    }
}

public data class D3dkmtOutputduplFrameinfo(
    public var lastPresentTime: Long = 0L,
    public var lastMouseUpdateTime: Long = 0L,
    public var accumulatedFrames: UInt = 0u,
    public var rectsCoalesced: Bool = 0,
    public var protectedContentMaskedOut: Bool = 0,
    public var pointerPosition: D3dkmtOutputduplPointerPosition = D3dkmtOutputduplPointerPosition(),
    public var totalMetadataBufferSize: UInt = 0u,
    public var pointerShapeBufferSize: UInt = 0u,
)

public data class D3dkmtOutputduplGetFrameinfo(
    public var hAdapter: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var frameInfo: D3dkmtOutputduplFrameinfo = D3dkmtOutputduplFrameinfo(),
)

public class D3dkmtOutputduplGetPointerShapeData internal constructor(
    public var hAdapter: UInt,
    public var vidPnSourceId: UInt,
    public var bufferSizeSupplied: UInt,
    pShapeBufferCtorArg: MutPtr,
    public var bufferSizeRequired: UInt,
    public var shapeInfo: D3dkmtOutduplPointerShapeInfo,
) {
    public var pShapeBuffer: MutPtr = pShapeBufferCtorArg
        internal set

    public constructor() : this(
        hAdapter = 0u,
        vidPnSourceId = 0u,
        bufferSizeSupplied = 0u,
        pShapeBufferCtorArg = MutPtr(0L),
        bufferSizeRequired = 0u,
        shapeInfo = D3dkmtOutduplPointerShapeInfo(),
    )

    public operator fun component1(): UInt = this.hAdapter

    public operator fun component2(): UInt = this.vidPnSourceId

    public operator fun component3(): UInt = this.bufferSizeSupplied

    public operator fun component4(): MutPtr = this.pShapeBuffer

    public operator fun component5(): UInt = this.bufferSizeRequired

    public operator fun component6(): D3dkmtOutduplPointerShapeInfo = this.shapeInfo

    public fun copy(hAdapter: UInt = this.hAdapter, vidPnSourceId: UInt = this.vidPnSourceId, bufferSizeSupplied: UInt = this.bufferSizeSupplied, pShapeBuffer: MutPtr = this.pShapeBuffer, bufferSizeRequired: UInt = this.bufferSizeRequired, shapeInfo: D3dkmtOutduplPointerShapeInfo = this.shapeInfo): D3dkmtOutputduplGetPointerShapeData = D3dkmtOutputduplGetPointerShapeData(hAdapter = hAdapter, vidPnSourceId = vidPnSourceId, bufferSizeSupplied = bufferSizeSupplied, pShapeBufferCtorArg = pShapeBuffer, bufferSizeRequired = bufferSizeRequired, shapeInfo = shapeInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtOutputduplGetPointerShapeData) return false
        if (this.hAdapter != other.hAdapter) return false
        if (this.vidPnSourceId != other.vidPnSourceId) return false
        if (this.bufferSizeSupplied != other.bufferSizeSupplied) return false
        if (this.pShapeBuffer != other.pShapeBuffer) return false
        if (this.bufferSizeRequired != other.bufferSizeRequired) return false
        if (this.shapeInfo != other.shapeInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hAdapter.hashCode()
        result = 31 * result + this.vidPnSourceId.hashCode()
        result = 31 * result + this.bufferSizeSupplied.hashCode()
        result = 31 * result + this.pShapeBuffer.hashCode()
        result = 31 * result + this.bufferSizeRequired.hashCode()
        result = 31 * result + this.shapeInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hAdapter: UInt = 0u,
            vidPnSourceId: UInt = 0u,
            bufferSizeSupplied: UInt = 0u,
            pShapeBuffer: MutPtr = MutPtr(0L),
            bufferSizeRequired: UInt = 0u,
            shapeInfo: D3dkmtOutduplPointerShapeInfo = D3dkmtOutduplPointerShapeInfo(),
        ): D3dkmtOutputduplGetPointerShapeData =
            D3dkmtOutputduplGetPointerShapeData(
                hAdapter = hAdapter,
                vidPnSourceId = vidPnSourceId,
                bufferSizeSupplied = bufferSizeSupplied,
                pShapeBufferCtorArg = pShapeBuffer,
                bufferSizeRequired = bufferSizeRequired,
                shapeInfo = shapeInfo,
            )
    }
}

public class D3dkmtOutputduplKeyedmutex internal constructor(
    hSharedSurfaceNtCtorArg: Handle,
) {
    public var hSharedSurfaceNt: Handle = hSharedSurfaceNtCtorArg
        internal set

    public constructor() : this(
        hSharedSurfaceNtCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.hSharedSurfaceNt

    public fun copy(hSharedSurfaceNt: Handle = this.hSharedSurfaceNt): D3dkmtOutputduplKeyedmutex = D3dkmtOutputduplKeyedmutex(hSharedSurfaceNtCtorArg = hSharedSurfaceNt)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtOutputduplKeyedmutex) return false
        if (this.hSharedSurfaceNt != other.hSharedSurfaceNt) return false
        return true
    }

    override fun hashCode(): Int = this.hSharedSurfaceNt.hashCode()

    public companion object {
        public operator fun invoke(
            hSharedSurfaceNt: Handle = MutPtr(0L),
        ): D3dkmtOutputduplKeyedmutex =
            D3dkmtOutputduplKeyedmutex(
                hSharedSurfaceNtCtorArg = hSharedSurfaceNt,
            )
    }
}

public class D3dkmtOutputduplMetadata internal constructor(
    public var hAdapter: UInt,
    public var vidPnSourceId: UInt,
    public var type: D3dkmtOutputduplMetadatatype,
    public var bufferSizeSupplied: UInt,
    pBufferCtorArg: MutPtr,
    public var bufferSizeRequired: UInt,
) {
    public var pBuffer: MutPtr = pBufferCtorArg
        internal set

    public constructor() : this(
        hAdapter = 0u,
        vidPnSourceId = 0u,
        type = 0,
        bufferSizeSupplied = 0u,
        pBufferCtorArg = MutPtr(0L),
        bufferSizeRequired = 0u,
    )

    public operator fun component1(): UInt = this.hAdapter

    public operator fun component2(): UInt = this.vidPnSourceId

    public operator fun component3(): D3dkmtOutputduplMetadatatype = this.type

    public operator fun component4(): UInt = this.bufferSizeSupplied

    public operator fun component5(): MutPtr = this.pBuffer

    public operator fun component6(): UInt = this.bufferSizeRequired

    public fun copy(hAdapter: UInt = this.hAdapter, vidPnSourceId: UInt = this.vidPnSourceId, type: D3dkmtOutputduplMetadatatype = this.type, bufferSizeSupplied: UInt = this.bufferSizeSupplied, pBuffer: MutPtr = this.pBuffer, bufferSizeRequired: UInt = this.bufferSizeRequired): D3dkmtOutputduplMetadata = D3dkmtOutputduplMetadata(hAdapter = hAdapter, vidPnSourceId = vidPnSourceId, type = type, bufferSizeSupplied = bufferSizeSupplied, pBufferCtorArg = pBuffer, bufferSizeRequired = bufferSizeRequired)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtOutputduplMetadata) return false
        if (this.hAdapter != other.hAdapter) return false
        if (this.vidPnSourceId != other.vidPnSourceId) return false
        if (this.type != other.type) return false
        if (this.bufferSizeSupplied != other.bufferSizeSupplied) return false
        if (this.pBuffer != other.pBuffer) return false
        if (this.bufferSizeRequired != other.bufferSizeRequired) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hAdapter.hashCode()
        result = 31 * result + this.vidPnSourceId.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.bufferSizeSupplied.hashCode()
        result = 31 * result + this.pBuffer.hashCode()
        result = 31 * result + this.bufferSizeRequired.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtOutputduplMetadata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtOutputduplMetadata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): D3dkmtOutputduplMetadata =
                    D3dkmtOutputduplMetadata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtOutputduplMetadata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAdapter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vidPnSourceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.bufferSizeSupplied)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pBuffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.bufferSizeRequired)
                }
            }

        public operator fun invoke(
            hAdapter: UInt = 0u,
            vidPnSourceId: UInt = 0u,
            type: D3dkmtOutputduplMetadatatype = 0,
            bufferSizeSupplied: UInt = 0u,
            pBuffer: MutPtr = MutPtr(0L),
            bufferSizeRequired: UInt = 0u,
        ): D3dkmtOutputduplMetadata =
            D3dkmtOutputduplMetadata(
                hAdapter = hAdapter,
                vidPnSourceId = vidPnSourceId,
                type = type,
                bufferSizeSupplied = bufferSizeSupplied,
                pBufferCtorArg = pBuffer,
                bufferSizeRequired = bufferSizeRequired,
            )
    }
}

public data class D3dkmtOutputduplPointerPosition(
    public var position: Point = Point(),
    public var visible: Bool = 0,
)

public data class D3dkmtOutputduplReleaseFrame(
    public var hAdapter: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var nextKeyMutexIdx: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtOutputduplReleaseFrame> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtOutputduplReleaseFrame> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): D3dkmtOutputduplReleaseFrame =
                    D3dkmtOutputduplReleaseFrame(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtOutputduplReleaseFrame) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAdapter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vidPnSourceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nextKeyMutexIdx)
                }
            }
    }
}

public data class D3dkmtOutputduplSnapshot(
    public var size: UInt = 0u,
    public var sessionProcessCount: UInt = 0u,
    public var sessionActiveConnectionsCount: UInt = 0u,
    public var numVidPnSources: UInt = 0u,
    public var numOutputDuplContexts: UInt = 0u,
    public var padding: UInt = 0u,
    public var outputDuplDebugInfos: List<OutputduplContextDebugInfo> = List(1) { OutputduplContextDebugInfo() },
)

public data class D3dkmtPageTableLevelDesc(
    public var indexBitCount: UInt = 0u,
    public var indexMask: ULong = 0uL,
    public var indexShift: ULong = 0uL,
    public var lowerLevelsMask: ULong = 0uL,
    public var entryCoverageInPages: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtPageTableLevelDesc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtPageTableLevelDesc> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): D3dkmtPageTableLevelDesc =
                    D3dkmtPageTableLevelDesc(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtPageTableLevelDesc) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.indexBitCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.indexMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.indexShift)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.lowerLevelsMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.entryCoverageInPages)
                }
            }
    }
}

public data class D3dkmtPanelfitterSupport(
    public var supported: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtPanelfitterSupport> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtPanelfitterSupport> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtPanelfitterSupport =
                    D3dkmtPanelfitterSupport(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtPanelfitterSupport) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.supported)
                }
            }
    }
}

public data class D3dkmtParavirtualization(
    public var secureContainer: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtParavirtualization> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtParavirtualization> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): D3dkmtParavirtualization =
                    D3dkmtParavirtualization(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtParavirtualization) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.secureContainer)
                }
            }
    }
}

public data class D3dkmtPhysicalAdapterCount(
    public var count: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtPhysicalAdapterCount> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtPhysicalAdapterCount> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtPhysicalAdapterCount =
                    D3dkmtPhysicalAdapterCount(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtPhysicalAdapterCount) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.count)
                }
            }
    }
}

public class D3dkmtPindirectflipresources internal constructor(
    public var hDevice: UInt,
    public var resourceCount: UInt,
    pResourceListCtorArg: MutPtr,
) {
    public var pResourceList: MutPtr = pResourceListCtorArg
        internal set

    public constructor() : this(
        hDevice = 0u,
        resourceCount = 0u,
        pResourceListCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.hDevice

    public operator fun component2(): UInt = this.resourceCount

    public operator fun component3(): MutPtr = this.pResourceList

    public fun copy(hDevice: UInt = this.hDevice, resourceCount: UInt = this.resourceCount, pResourceList: MutPtr = this.pResourceList): D3dkmtPindirectflipresources = D3dkmtPindirectflipresources(hDevice = hDevice, resourceCount = resourceCount, pResourceListCtorArg = pResourceList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtPindirectflipresources) return false
        if (this.hDevice != other.hDevice) return false
        if (this.resourceCount != other.resourceCount) return false
        if (this.pResourceList != other.pResourceList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDevice.hashCode()
        result = 31 * result + this.resourceCount.hashCode()
        result = 31 * result + this.pResourceList.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtPindirectflipresources> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtPindirectflipresources> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): D3dkmtPindirectflipresources =
                    D3dkmtPindirectflipresources(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtPindirectflipresources) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hDevice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.resourceCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pResourceList)
                }
            }

        public operator fun invoke(
            hDevice: UInt = 0u,
            resourceCount: UInt = 0u,
            pResourceList: MutPtr = MutPtr(0L),
        ): D3dkmtPindirectflipresources =
            D3dkmtPindirectflipresources(
                hDevice = hDevice,
                resourceCount = resourceCount,
                pResourceListCtorArg = pResourceList,
            )
    }
}

public data class D3dkmtPlaneSpecificInputFlags(
    public var anonymous: D3dkmtPlaneSpecificInputFlags0 = D3dkmtPlaneSpecificInputFlags0(),
)

public data class D3dkmtPlaneSpecificInputFlags0(
    public var anonymous: D3dkmtPlaneSpecificInputFlags00 = D3dkmtPlaneSpecificInputFlags00(),
    public var value: UInt = 0u,
)

public data class D3dkmtPlaneSpecificInputFlags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtPlaneSpecificInputFlags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtPlaneSpecificInputFlags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtPlaneSpecificInputFlags00 =
                    D3dkmtPlaneSpecificInputFlags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtPlaneSpecificInputFlags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtPlaneSpecificOutputFlags(
    public var anonymous: D3dkmtPlaneSpecificOutputFlags0 = D3dkmtPlaneSpecificOutputFlags0(),
)

public data class D3dkmtPlaneSpecificOutputFlags0(
    public var anonymous: D3dkmtPlaneSpecificOutputFlags00 = D3dkmtPlaneSpecificOutputFlags00(),
    public var value: UInt = 0u,
)

public data class D3dkmtPlaneSpecificOutputFlags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtPlaneSpecificOutputFlags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtPlaneSpecificOutputFlags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtPlaneSpecificOutputFlags00 =
                    D3dkmtPlaneSpecificOutputFlags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtPlaneSpecificOutputFlags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtPolldisplaychildren(
    public var hAdapter: UInt = 0u,
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtPolldisplaychildren> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtPolldisplaychildren> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtPolldisplaychildren =
                    D3dkmtPolldisplaychildren(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtPolldisplaychildren) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAdapter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bitfield)
                }
            }
    }
}

public class D3dkmtPresent internal constructor(
    public var anonymous1: D3dkmtPresent0,
    hWindowCtorArg: Hwnd,
    public var vidPnSourceId: UInt,
    public var hSource: UInt,
    public var hDestination: UInt,
    public var color: UInt,
    public var dstRect: Rect,
    public var srcRect: Rect,
    public var subRectCnt: UInt,
    pSrcSubRectsCtorArg: ConstPtr,
    public var presentCount: UInt,
    public var flipInterval: D3dddiFlipintervalType,
    public var flags: D3dkmtPresentflags,
    public var broadcastContextCount: UInt,
    public var broadcastContext: UIntArray,
    presentLimitSemaphoreCtorArg: Handle,
    public var presentHistoryToken: D3dkmtPresenthistorytoken,
    pPresentRegionsCtorArg: MutPtr,
    public var anonymous2: D3dkmtPresent1,
    public var duration: UInt,
    broadcastSrcAllocationCtorArg: MutPtr,
    broadcastDstAllocationCtorArg: MutPtr,
    public var privateDriverDataSize: UInt,
    pPrivateDriverDataCtorArg: MutPtr,
    public var bOptimizeForComposition: Boolean,
) {
    public var hWindow: Hwnd = hWindowCtorArg
        internal set

    public var pSrcSubRects: ConstPtr = pSrcSubRectsCtorArg
        internal set

    public var presentLimitSemaphore: Handle = presentLimitSemaphoreCtorArg
        internal set

    public var pPresentRegions: MutPtr = pPresentRegionsCtorArg
        internal set

    public var broadcastSrcAllocation: MutPtr = broadcastSrcAllocationCtorArg
        internal set

    public var broadcastDstAllocation: MutPtr = broadcastDstAllocationCtorArg
        internal set

    public var pPrivateDriverData: MutPtr = pPrivateDriverDataCtorArg
        internal set

    public constructor() : this(
        anonymous1 = D3dkmtPresent0(),
        hWindowCtorArg = MutPtr(0L),
        vidPnSourceId = 0u,
        hSource = 0u,
        hDestination = 0u,
        color = 0u,
        dstRect = Rect(),
        srcRect = Rect(),
        subRectCnt = 0u,
        pSrcSubRectsCtorArg = ConstPtr(0L),
        presentCount = 0u,
        flipInterval = 0,
        flags = D3dkmtPresentflags(),
        broadcastContextCount = 0u,
        broadcastContext = UIntArray(64),
        presentLimitSemaphoreCtorArg = MutPtr(0L),
        presentHistoryToken = D3dkmtPresenthistorytoken(),
        pPresentRegionsCtorArg = MutPtr(0L),
        anonymous2 = D3dkmtPresent1(),
        duration = 0u,
        broadcastSrcAllocationCtorArg = MutPtr(0L),
        broadcastDstAllocationCtorArg = MutPtr(0L),
        privateDriverDataSize = 0u,
        pPrivateDriverDataCtorArg = MutPtr(0L),
        bOptimizeForComposition = false,
    )

    public companion object {
        public operator fun invoke(
            anonymous1: D3dkmtPresent0 = D3dkmtPresent0(),
            hWindow: Hwnd = MutPtr(0L),
            vidPnSourceId: UInt = 0u,
            hSource: UInt = 0u,
            hDestination: UInt = 0u,
            color: UInt = 0u,
            dstRect: Rect = Rect(),
            srcRect: Rect = Rect(),
            subRectCnt: UInt = 0u,
            pSrcSubRects: ConstPtr = ConstPtr(0L),
            presentCount: UInt = 0u,
            flipInterval: D3dddiFlipintervalType = 0,
            flags: D3dkmtPresentflags = D3dkmtPresentflags(),
            broadcastContextCount: UInt = 0u,
            broadcastContext: UIntArray = UIntArray(64),
            presentLimitSemaphore: Handle = MutPtr(0L),
            presentHistoryToken: D3dkmtPresenthistorytoken = D3dkmtPresenthistorytoken(),
            pPresentRegions: MutPtr = MutPtr(0L),
            anonymous2: D3dkmtPresent1 = D3dkmtPresent1(),
            duration: UInt = 0u,
            broadcastSrcAllocation: MutPtr = MutPtr(0L),
            broadcastDstAllocation: MutPtr = MutPtr(0L),
            privateDriverDataSize: UInt = 0u,
            pPrivateDriverData: MutPtr = MutPtr(0L),
            bOptimizeForComposition: Boolean = false,
        ): D3dkmtPresent =
            D3dkmtPresent(
                anonymous1 = anonymous1,
                hWindowCtorArg = hWindow,
                vidPnSourceId = vidPnSourceId,
                hSource = hSource,
                hDestination = hDestination,
                color = color,
                dstRect = dstRect,
                srcRect = srcRect,
                subRectCnt = subRectCnt,
                pSrcSubRectsCtorArg = pSrcSubRects,
                presentCount = presentCount,
                flipInterval = flipInterval,
                flags = flags,
                broadcastContextCount = broadcastContextCount,
                broadcastContext = broadcastContext,
                presentLimitSemaphoreCtorArg = presentLimitSemaphore,
                presentHistoryToken = presentHistoryToken,
                pPresentRegionsCtorArg = pPresentRegions,
                anonymous2 = anonymous2,
                duration = duration,
                broadcastSrcAllocationCtorArg = broadcastSrcAllocation,
                broadcastDstAllocationCtorArg = broadcastDstAllocation,
                privateDriverDataSize = privateDriverDataSize,
                pPrivateDriverDataCtorArg = pPrivateDriverData,
                bOptimizeForComposition = bOptimizeForComposition,
            )
    }
}

public data class D3dkmtPresent0(
    public var hDevice: UInt = 0u,
    public var hContext: UInt = 0u,
)

public data class D3dkmtPresent1(
    public var hAdapter: UInt = 0u,
    public var hIndirectContext: UInt = 0u,
)

public data class D3dkmtPresentflags(
    public var anonymous: D3dkmtPresentflags0 = D3dkmtPresentflags0(),
)

public data class D3dkmtPresentflags0(
    public var anonymous: D3dkmtPresentflags00 = D3dkmtPresentflags00(),
    public var value: UInt = 0u,
)

public data class D3dkmtPresentflags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtPresentflags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtPresentflags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtPresentflags00 =
                    D3dkmtPresentflags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtPresentflags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtPresenthistorytoken(
    public var model: D3dkmtPresentModel = 0,
    public var tokenSize: UInt = 0u,
    public var compositionBindingId: ULong = 0uL,
    public var token: D3dkmtPresenthistorytoken0 = D3dkmtPresenthistorytoken0(),
)

public data class D3dkmtPresenthistorytoken0(
    public var flip: D3dkmtFlipmodelPresenthistorytoken = D3dkmtFlipmodelPresenthistorytoken(),
    public var blt: D3dkmtBltmodelPresenthistorytoken = D3dkmtBltmodelPresenthistorytoken(),
    public var vistaBlt: ULong = 0uL,
    public var gdi: D3dkmtGdimodelPresenthistorytoken = D3dkmtGdimodelPresenthistorytoken(),
    public var fence: D3dkmtFencePresenthistorytoken = D3dkmtFencePresenthistorytoken(),
    public var gdiSysMem: D3dkmtGdimodelSysmemPresenthistorytoken = D3dkmtGdimodelSysmemPresenthistorytoken(),
    public var composition: D3dkmtCompositionPresenthistorytoken = D3dkmtCompositionPresenthistorytoken(),
    public var flipManager: D3dkmtFlipmanagerPresenthistorytoken = D3dkmtFlipmanagerPresenthistorytoken(),
    public var surfaceComplete: D3dkmtSurfacecompletePresenthistorytoken = D3dkmtSurfacecompletePresenthistorytoken(),
)

public class D3dkmtPresentMultiplaneOverlay internal constructor(
    public var anonymous: D3dkmtPresentMultiplaneOverlay0,
    public var broadcastContextCount: UInt,
    public var broadcastContext: UIntArray,
    public var vidPnSourceId: UInt,
    public var presentCount: UInt,
    public var flipInterval: D3dddiFlipintervalType,
    public var flags: D3dkmtPresentflags,
    public var presentPlaneCount: UInt,
    pPresentPlanesCtorArg: MutPtr,
    public var duration: UInt,
) {
    public var pPresentPlanes: MutPtr = pPresentPlanesCtorArg
        internal set

    public constructor() : this(
        anonymous = D3dkmtPresentMultiplaneOverlay0(),
        broadcastContextCount = 0u,
        broadcastContext = UIntArray(64),
        vidPnSourceId = 0u,
        presentCount = 0u,
        flipInterval = 0,
        flags = D3dkmtPresentflags(),
        presentPlaneCount = 0u,
        pPresentPlanesCtorArg = MutPtr(0L),
        duration = 0u,
    )

    public operator fun component1(): D3dkmtPresentMultiplaneOverlay0 = this.anonymous

    public operator fun component2(): UInt = this.broadcastContextCount

    public operator fun component3(): UIntArray = this.broadcastContext

    public operator fun component4(): UInt = this.vidPnSourceId

    public operator fun component5(): UInt = this.presentCount

    public operator fun component6(): D3dddiFlipintervalType = this.flipInterval

    public operator fun component7(): D3dkmtPresentflags = this.flags

    public operator fun component8(): UInt = this.presentPlaneCount

    public operator fun component9(): MutPtr = this.pPresentPlanes

    public operator fun component10(): UInt = this.duration

    public fun copy(anonymous: D3dkmtPresentMultiplaneOverlay0 = this.anonymous, broadcastContextCount: UInt = this.broadcastContextCount, broadcastContext: UIntArray = this.broadcastContext, vidPnSourceId: UInt = this.vidPnSourceId, presentCount: UInt = this.presentCount, flipInterval: D3dddiFlipintervalType = this.flipInterval, flags: D3dkmtPresentflags = this.flags, presentPlaneCount: UInt = this.presentPlaneCount, pPresentPlanes: MutPtr = this.pPresentPlanes, duration: UInt = this.duration): D3dkmtPresentMultiplaneOverlay = D3dkmtPresentMultiplaneOverlay(anonymous = anonymous, broadcastContextCount = broadcastContextCount, broadcastContext = broadcastContext, vidPnSourceId = vidPnSourceId, presentCount = presentCount, flipInterval = flipInterval, flags = flags, presentPlaneCount = presentPlaneCount, pPresentPlanesCtorArg = pPresentPlanes, duration = duration)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtPresentMultiplaneOverlay) return false
        if (this.anonymous != other.anonymous) return false
        if (this.broadcastContextCount != other.broadcastContextCount) return false
        if (!this.broadcastContext.contentEquals(other.broadcastContext)) return false
        if (this.vidPnSourceId != other.vidPnSourceId) return false
        if (this.presentCount != other.presentCount) return false
        if (this.flipInterval != other.flipInterval) return false
        if (this.flags != other.flags) return false
        if (this.presentPlaneCount != other.presentPlaneCount) return false
        if (this.pPresentPlanes != other.pPresentPlanes) return false
        if (this.duration != other.duration) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.broadcastContextCount.hashCode()
        result = 31 * result + this.broadcastContext.contentHashCode()
        result = 31 * result + this.vidPnSourceId.hashCode()
        result = 31 * result + this.presentCount.hashCode()
        result = 31 * result + this.flipInterval.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.presentPlaneCount.hashCode()
        result = 31 * result + this.pPresentPlanes.hashCode()
        result = 31 * result + this.duration.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: D3dkmtPresentMultiplaneOverlay0 = D3dkmtPresentMultiplaneOverlay0(),
            broadcastContextCount: UInt = 0u,
            broadcastContext: UIntArray = UIntArray(64),
            vidPnSourceId: UInt = 0u,
            presentCount: UInt = 0u,
            flipInterval: D3dddiFlipintervalType = 0,
            flags: D3dkmtPresentflags = D3dkmtPresentflags(),
            presentPlaneCount: UInt = 0u,
            pPresentPlanes: MutPtr = MutPtr(0L),
            duration: UInt = 0u,
        ): D3dkmtPresentMultiplaneOverlay =
            D3dkmtPresentMultiplaneOverlay(
                anonymous = anonymous,
                broadcastContextCount = broadcastContextCount,
                broadcastContext = broadcastContext,
                vidPnSourceId = vidPnSourceId,
                presentCount = presentCount,
                flipInterval = flipInterval,
                flags = flags,
                presentPlaneCount = presentPlaneCount,
                pPresentPlanesCtorArg = pPresentPlanes,
                duration = duration,
            )
    }
}

public data class D3dkmtPresentMultiplaneOverlay0(
    public var hDevice: UInt = 0u,
    public var hContext: UInt = 0u,
)

public class D3dkmtPresentMultiplaneOverlay2 internal constructor(
    public var hAdapter: UInt,
    public var anonymous: D3dkmtPresentMultiplaneOverlay20,
    public var broadcastContextCount: UInt,
    public var broadcastContext: UIntArray,
    public var vidPnSourceId: UInt,
    public var presentCount: UInt,
    public var flipInterval: D3dddiFlipintervalType,
    public var flags: D3dkmtPresentflags,
    public var presentPlaneCount: UInt,
    pPresentPlanesCtorArg: MutPtr,
    public var duration: UInt,
) {
    public var pPresentPlanes: MutPtr = pPresentPlanesCtorArg
        internal set

    public constructor() : this(
        hAdapter = 0u,
        anonymous = D3dkmtPresentMultiplaneOverlay20(),
        broadcastContextCount = 0u,
        broadcastContext = UIntArray(64),
        vidPnSourceId = 0u,
        presentCount = 0u,
        flipInterval = 0,
        flags = D3dkmtPresentflags(),
        presentPlaneCount = 0u,
        pPresentPlanesCtorArg = MutPtr(0L),
        duration = 0u,
    )

    public operator fun component1(): UInt = this.hAdapter

    public operator fun component2(): D3dkmtPresentMultiplaneOverlay20 = this.anonymous

    public operator fun component3(): UInt = this.broadcastContextCount

    public operator fun component4(): UIntArray = this.broadcastContext

    public operator fun component5(): UInt = this.vidPnSourceId

    public operator fun component6(): UInt = this.presentCount

    public operator fun component7(): D3dddiFlipintervalType = this.flipInterval

    public operator fun component8(): D3dkmtPresentflags = this.flags

    public operator fun component9(): UInt = this.presentPlaneCount

    public operator fun component10(): MutPtr = this.pPresentPlanes

    public operator fun component11(): UInt = this.duration

    public fun copy(hAdapter: UInt = this.hAdapter, anonymous: D3dkmtPresentMultiplaneOverlay20 = this.anonymous, broadcastContextCount: UInt = this.broadcastContextCount, broadcastContext: UIntArray = this.broadcastContext, vidPnSourceId: UInt = this.vidPnSourceId, presentCount: UInt = this.presentCount, flipInterval: D3dddiFlipintervalType = this.flipInterval, flags: D3dkmtPresentflags = this.flags, presentPlaneCount: UInt = this.presentPlaneCount, pPresentPlanes: MutPtr = this.pPresentPlanes, duration: UInt = this.duration): D3dkmtPresentMultiplaneOverlay2 = D3dkmtPresentMultiplaneOverlay2(hAdapter = hAdapter, anonymous = anonymous, broadcastContextCount = broadcastContextCount, broadcastContext = broadcastContext, vidPnSourceId = vidPnSourceId, presentCount = presentCount, flipInterval = flipInterval, flags = flags, presentPlaneCount = presentPlaneCount, pPresentPlanesCtorArg = pPresentPlanes, duration = duration)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtPresentMultiplaneOverlay2) return false
        if (this.hAdapter != other.hAdapter) return false
        if (this.anonymous != other.anonymous) return false
        if (this.broadcastContextCount != other.broadcastContextCount) return false
        if (!this.broadcastContext.contentEquals(other.broadcastContext)) return false
        if (this.vidPnSourceId != other.vidPnSourceId) return false
        if (this.presentCount != other.presentCount) return false
        if (this.flipInterval != other.flipInterval) return false
        if (this.flags != other.flags) return false
        if (this.presentPlaneCount != other.presentPlaneCount) return false
        if (this.pPresentPlanes != other.pPresentPlanes) return false
        if (this.duration != other.duration) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hAdapter.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.broadcastContextCount.hashCode()
        result = 31 * result + this.broadcastContext.contentHashCode()
        result = 31 * result + this.vidPnSourceId.hashCode()
        result = 31 * result + this.presentCount.hashCode()
        result = 31 * result + this.flipInterval.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.presentPlaneCount.hashCode()
        result = 31 * result + this.pPresentPlanes.hashCode()
        result = 31 * result + this.duration.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hAdapter: UInt = 0u,
            anonymous: D3dkmtPresentMultiplaneOverlay20 = D3dkmtPresentMultiplaneOverlay20(),
            broadcastContextCount: UInt = 0u,
            broadcastContext: UIntArray = UIntArray(64),
            vidPnSourceId: UInt = 0u,
            presentCount: UInt = 0u,
            flipInterval: D3dddiFlipintervalType = 0,
            flags: D3dkmtPresentflags = D3dkmtPresentflags(),
            presentPlaneCount: UInt = 0u,
            pPresentPlanes: MutPtr = MutPtr(0L),
            duration: UInt = 0u,
        ): D3dkmtPresentMultiplaneOverlay2 =
            D3dkmtPresentMultiplaneOverlay2(
                hAdapter = hAdapter,
                anonymous = anonymous,
                broadcastContextCount = broadcastContextCount,
                broadcastContext = broadcastContext,
                vidPnSourceId = vidPnSourceId,
                presentCount = presentCount,
                flipInterval = flipInterval,
                flags = flags,
                presentPlaneCount = presentPlaneCount,
                pPresentPlanesCtorArg = pPresentPlanes,
                duration = duration,
            )
    }
}

public data class D3dkmtPresentMultiplaneOverlay20(
    public var hDevice: UInt = 0u,
    public var hContext: UInt = 0u,
)

public class D3dkmtPresentMultiplaneOverlay3 internal constructor(
    public var hAdapter: UInt,
    public var contextCount: UInt,
    pContextListCtorArg: MutPtr,
    public var vidPnSourceId: UInt,
    public var presentCount: UInt,
    public var flags: D3dkmtPresentMultiplaneOverlayFlags,
    public var presentPlaneCount: UInt,
    ppPresentPlanesCtorArg: MutPtr,
    pPostCompositionCtorArg: MutPtr,
    public var duration: UInt,
    public var hDRMetaDataType: D3dddiHdrMetadataType,
    public var hDRMetaDataSize: UInt,
    pHDRMetaDataCtorArg: ConstPtr,
    public var boostRefreshRateMultiplier: UInt,
) {
    public var pContextList: MutPtr = pContextListCtorArg
        internal set

    public var ppPresentPlanes: MutPtr = ppPresentPlanesCtorArg
        internal set

    public var pPostComposition: MutPtr = pPostCompositionCtorArg
        internal set

    public var pHDRMetaData: ConstPtr = pHDRMetaDataCtorArg
        internal set

    public constructor() : this(
        hAdapter = 0u,
        contextCount = 0u,
        pContextListCtorArg = MutPtr(0L),
        vidPnSourceId = 0u,
        presentCount = 0u,
        flags = D3dkmtPresentMultiplaneOverlayFlags(),
        presentPlaneCount = 0u,
        ppPresentPlanesCtorArg = MutPtr(0L),
        pPostCompositionCtorArg = MutPtr(0L),
        duration = 0u,
        hDRMetaDataType = 0,
        hDRMetaDataSize = 0u,
        pHDRMetaDataCtorArg = ConstPtr(0L),
        boostRefreshRateMultiplier = 0u,
    )

    public operator fun component1(): UInt = this.hAdapter

    public operator fun component2(): UInt = this.contextCount

    public operator fun component3(): MutPtr = this.pContextList

    public operator fun component4(): UInt = this.vidPnSourceId

    public operator fun component5(): UInt = this.presentCount

    public operator fun component6(): D3dkmtPresentMultiplaneOverlayFlags = this.flags

    public operator fun component7(): UInt = this.presentPlaneCount

    public operator fun component8(): MutPtr = this.ppPresentPlanes

    public operator fun component9(): MutPtr = this.pPostComposition

    public operator fun component10(): UInt = this.duration

    public operator fun component11(): D3dddiHdrMetadataType = this.hDRMetaDataType

    public operator fun component12(): UInt = this.hDRMetaDataSize

    public operator fun component13(): ConstPtr = this.pHDRMetaData

    public operator fun component14(): UInt = this.boostRefreshRateMultiplier

    public fun copy(hAdapter: UInt = this.hAdapter, contextCount: UInt = this.contextCount, pContextList: MutPtr = this.pContextList, vidPnSourceId: UInt = this.vidPnSourceId, presentCount: UInt = this.presentCount, flags: D3dkmtPresentMultiplaneOverlayFlags = this.flags, presentPlaneCount: UInt = this.presentPlaneCount, ppPresentPlanes: MutPtr = this.ppPresentPlanes, pPostComposition: MutPtr = this.pPostComposition, duration: UInt = this.duration, hDRMetaDataType: D3dddiHdrMetadataType = this.hDRMetaDataType, hDRMetaDataSize: UInt = this.hDRMetaDataSize, pHDRMetaData: ConstPtr = this.pHDRMetaData, boostRefreshRateMultiplier: UInt = this.boostRefreshRateMultiplier): D3dkmtPresentMultiplaneOverlay3 = D3dkmtPresentMultiplaneOverlay3(hAdapter = hAdapter, contextCount = contextCount, pContextListCtorArg = pContextList, vidPnSourceId = vidPnSourceId, presentCount = presentCount, flags = flags, presentPlaneCount = presentPlaneCount, ppPresentPlanesCtorArg = ppPresentPlanes, pPostCompositionCtorArg = pPostComposition, duration = duration, hDRMetaDataType = hDRMetaDataType, hDRMetaDataSize = hDRMetaDataSize, pHDRMetaDataCtorArg = pHDRMetaData, boostRefreshRateMultiplier = boostRefreshRateMultiplier)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtPresentMultiplaneOverlay3) return false
        if (this.hAdapter != other.hAdapter) return false
        if (this.contextCount != other.contextCount) return false
        if (this.pContextList != other.pContextList) return false
        if (this.vidPnSourceId != other.vidPnSourceId) return false
        if (this.presentCount != other.presentCount) return false
        if (this.flags != other.flags) return false
        if (this.presentPlaneCount != other.presentPlaneCount) return false
        if (this.ppPresentPlanes != other.ppPresentPlanes) return false
        if (this.pPostComposition != other.pPostComposition) return false
        if (this.duration != other.duration) return false
        if (this.hDRMetaDataType != other.hDRMetaDataType) return false
        if (this.hDRMetaDataSize != other.hDRMetaDataSize) return false
        if (this.pHDRMetaData != other.pHDRMetaData) return false
        if (this.boostRefreshRateMultiplier != other.boostRefreshRateMultiplier) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hAdapter.hashCode()
        result = 31 * result + this.contextCount.hashCode()
        result = 31 * result + this.pContextList.hashCode()
        result = 31 * result + this.vidPnSourceId.hashCode()
        result = 31 * result + this.presentCount.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.presentPlaneCount.hashCode()
        result = 31 * result + this.ppPresentPlanes.hashCode()
        result = 31 * result + this.pPostComposition.hashCode()
        result = 31 * result + this.duration.hashCode()
        result = 31 * result + this.hDRMetaDataType.hashCode()
        result = 31 * result + this.hDRMetaDataSize.hashCode()
        result = 31 * result + this.pHDRMetaData.hashCode()
        result = 31 * result + this.boostRefreshRateMultiplier.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hAdapter: UInt = 0u,
            contextCount: UInt = 0u,
            pContextList: MutPtr = MutPtr(0L),
            vidPnSourceId: UInt = 0u,
            presentCount: UInt = 0u,
            flags: D3dkmtPresentMultiplaneOverlayFlags = D3dkmtPresentMultiplaneOverlayFlags(),
            presentPlaneCount: UInt = 0u,
            ppPresentPlanes: MutPtr = MutPtr(0L),
            pPostComposition: MutPtr = MutPtr(0L),
            duration: UInt = 0u,
            hDRMetaDataType: D3dddiHdrMetadataType = 0,
            hDRMetaDataSize: UInt = 0u,
            pHDRMetaData: ConstPtr = ConstPtr(0L),
            boostRefreshRateMultiplier: UInt = 0u,
        ): D3dkmtPresentMultiplaneOverlay3 =
            D3dkmtPresentMultiplaneOverlay3(
                hAdapter = hAdapter,
                contextCount = contextCount,
                pContextListCtorArg = pContextList,
                vidPnSourceId = vidPnSourceId,
                presentCount = presentCount,
                flags = flags,
                presentPlaneCount = presentPlaneCount,
                ppPresentPlanesCtorArg = ppPresentPlanes,
                pPostCompositionCtorArg = pPostComposition,
                duration = duration,
                hDRMetaDataType = hDRMetaDataType,
                hDRMetaDataSize = hDRMetaDataSize,
                pHDRMetaDataCtorArg = pHDRMetaData,
                boostRefreshRateMultiplier = boostRefreshRateMultiplier,
            )
    }
}

public data class D3dkmtPresentMultiplaneOverlayFlags(
    public var anonymous: D3dkmtPresentMultiplaneOverlayFlags0 = D3dkmtPresentMultiplaneOverlayFlags0(),
)

public data class D3dkmtPresentMultiplaneOverlayFlags0(
    public var anonymous: D3dkmtPresentMultiplaneOverlayFlags00 = D3dkmtPresentMultiplaneOverlayFlags00(),
    public var value: UInt = 0u,
)

public data class D3dkmtPresentMultiplaneOverlayFlags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtPresentMultiplaneOverlayFlags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtPresentMultiplaneOverlayFlags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtPresentMultiplaneOverlayFlags00 =
                    D3dkmtPresentMultiplaneOverlayFlags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtPresentMultiplaneOverlayFlags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class D3dkmtPresentRedirected internal constructor(
    public var hSyncObj: UInt,
    public var hDevice: UInt,
    public var waitedFenceValue: ULong,
    public var presentHistoryToken: D3dkmtPresenthistorytoken,
    public var flags: D3dkmtPresentRedirectedFlags,
    public var hSource: UInt,
    public var privateDriverDataSize: UInt,
    pPrivateDriverDataCtorArg: MutPtr,
) {
    public var pPrivateDriverData: MutPtr = pPrivateDriverDataCtorArg
        internal set

    public constructor() : this(
        hSyncObj = 0u,
        hDevice = 0u,
        waitedFenceValue = 0uL,
        presentHistoryToken = D3dkmtPresenthistorytoken(),
        flags = D3dkmtPresentRedirectedFlags(),
        hSource = 0u,
        privateDriverDataSize = 0u,
        pPrivateDriverDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.hSyncObj

    public operator fun component2(): UInt = this.hDevice

    public operator fun component3(): ULong = this.waitedFenceValue

    public operator fun component4(): D3dkmtPresenthistorytoken = this.presentHistoryToken

    public operator fun component5(): D3dkmtPresentRedirectedFlags = this.flags

    public operator fun component6(): UInt = this.hSource

    public operator fun component7(): UInt = this.privateDriverDataSize

    public operator fun component8(): MutPtr = this.pPrivateDriverData

    public fun copy(hSyncObj: UInt = this.hSyncObj, hDevice: UInt = this.hDevice, waitedFenceValue: ULong = this.waitedFenceValue, presentHistoryToken: D3dkmtPresenthistorytoken = this.presentHistoryToken, flags: D3dkmtPresentRedirectedFlags = this.flags, hSource: UInt = this.hSource, privateDriverDataSize: UInt = this.privateDriverDataSize, pPrivateDriverData: MutPtr = this.pPrivateDriverData): D3dkmtPresentRedirected = D3dkmtPresentRedirected(hSyncObj = hSyncObj, hDevice = hDevice, waitedFenceValue = waitedFenceValue, presentHistoryToken = presentHistoryToken, flags = flags, hSource = hSource, privateDriverDataSize = privateDriverDataSize, pPrivateDriverDataCtorArg = pPrivateDriverData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtPresentRedirected) return false
        if (this.hSyncObj != other.hSyncObj) return false
        if (this.hDevice != other.hDevice) return false
        if (this.waitedFenceValue != other.waitedFenceValue) return false
        if (this.presentHistoryToken != other.presentHistoryToken) return false
        if (this.flags != other.flags) return false
        if (this.hSource != other.hSource) return false
        if (this.privateDriverDataSize != other.privateDriverDataSize) return false
        if (this.pPrivateDriverData != other.pPrivateDriverData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hSyncObj.hashCode()
        result = 31 * result + this.hDevice.hashCode()
        result = 31 * result + this.waitedFenceValue.hashCode()
        result = 31 * result + this.presentHistoryToken.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.hSource.hashCode()
        result = 31 * result + this.privateDriverDataSize.hashCode()
        result = 31 * result + this.pPrivateDriverData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hSyncObj: UInt = 0u,
            hDevice: UInt = 0u,
            waitedFenceValue: ULong = 0uL,
            presentHistoryToken: D3dkmtPresenthistorytoken = D3dkmtPresenthistorytoken(),
            flags: D3dkmtPresentRedirectedFlags = D3dkmtPresentRedirectedFlags(),
            hSource: UInt = 0u,
            privateDriverDataSize: UInt = 0u,
            pPrivateDriverData: MutPtr = MutPtr(0L),
        ): D3dkmtPresentRedirected =
            D3dkmtPresentRedirected(
                hSyncObj = hSyncObj,
                hDevice = hDevice,
                waitedFenceValue = waitedFenceValue,
                presentHistoryToken = presentHistoryToken,
                flags = flags,
                hSource = hSource,
                privateDriverDataSize = privateDriverDataSize,
                pPrivateDriverDataCtorArg = pPrivateDriverData,
            )
    }
}

public data class D3dkmtPresentRedirectedFlags(
    public var anonymous: D3dkmtPresentRedirectedFlags0 = D3dkmtPresentRedirectedFlags0(),
)

public data class D3dkmtPresentRedirectedFlags0(
    public var anonymous: D3dkmtPresentRedirectedFlags00 = D3dkmtPresentRedirectedFlags00(),
    public var value: UInt = 0u,
)

public data class D3dkmtPresentRedirectedFlags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtPresentRedirectedFlags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtPresentRedirectedFlags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtPresentRedirectedFlags00 =
                    D3dkmtPresentRedirectedFlags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtPresentRedirectedFlags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class D3dkmtPresentRgns internal constructor(
    public var dirtyRectCount: UInt,
    pDirtyRectsCtorArg: ConstPtr,
    public var moveRectCount: UInt,
    pMoveRectsCtorArg: ConstPtr,
) {
    public var pDirtyRects: ConstPtr = pDirtyRectsCtorArg
        internal set

    public var pMoveRects: ConstPtr = pMoveRectsCtorArg
        internal set

    public constructor() : this(
        dirtyRectCount = 0u,
        pDirtyRectsCtorArg = ConstPtr(0L),
        moveRectCount = 0u,
        pMoveRectsCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.dirtyRectCount

    public operator fun component2(): ConstPtr = this.pDirtyRects

    public operator fun component3(): UInt = this.moveRectCount

    public operator fun component4(): ConstPtr = this.pMoveRects

    public fun copy(dirtyRectCount: UInt = this.dirtyRectCount, pDirtyRects: ConstPtr = this.pDirtyRects, moveRectCount: UInt = this.moveRectCount, pMoveRects: ConstPtr = this.pMoveRects): D3dkmtPresentRgns = D3dkmtPresentRgns(dirtyRectCount = dirtyRectCount, pDirtyRectsCtorArg = pDirtyRects, moveRectCount = moveRectCount, pMoveRectsCtorArg = pMoveRects)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtPresentRgns) return false
        if (this.dirtyRectCount != other.dirtyRectCount) return false
        if (this.pDirtyRects != other.pDirtyRects) return false
        if (this.moveRectCount != other.moveRectCount) return false
        if (this.pMoveRects != other.pMoveRects) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dirtyRectCount.hashCode()
        result = 31 * result + this.pDirtyRects.hashCode()
        result = 31 * result + this.moveRectCount.hashCode()
        result = 31 * result + this.pMoveRects.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtPresentRgns> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtPresentRgns> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): D3dkmtPresentRgns =
                    D3dkmtPresentRgns(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtPresentRgns) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dirtyRectCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr + 8L, value.pDirtyRects)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.moveRectCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr + 24L, value.pMoveRects)
                }
            }

        public operator fun invoke(
            dirtyRectCount: UInt = 0u,
            pDirtyRects: ConstPtr = ConstPtr(0L),
            moveRectCount: UInt = 0u,
            pMoveRects: ConstPtr = ConstPtr(0L),
        ): D3dkmtPresentRgns =
            D3dkmtPresentRgns(
                dirtyRectCount = dirtyRectCount,
                pDirtyRectsCtorArg = pDirtyRects,
                moveRectCount = moveRectCount,
                pMoveRectsCtorArg = pMoveRects,
            )
    }
}

public data class D3dkmtPresentStats(
    public var presentCount: UInt = 0u,
    public var presentRefreshCount: UInt = 0u,
    public var syncRefreshCount: UInt = 0u,
    public var syncQPCTime: Long = 0L,
    public var syncGPUTime: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtPresentStats> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtPresentStats> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): D3dkmtPresentStats =
                    D3dkmtPresentStats(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtPresentStats) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.presentCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.presentRefreshCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.syncRefreshCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.syncQPCTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.syncGPUTime)
                }
            }
    }
}

public data class D3dkmtPresentStatsDwm(
    public var presentCount: UInt = 0u,
    public var presentRefreshCount: UInt = 0u,
    public var presentQPCTime: Long = 0L,
    public var syncRefreshCount: UInt = 0u,
    public var syncQPCTime: Long = 0L,
    public var customPresentDuration: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtPresentStatsDwm> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtPresentStatsDwm> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): D3dkmtPresentStatsDwm =
                    D3dkmtPresentStatsDwm(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtPresentStatsDwm) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.presentCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.presentRefreshCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.presentQPCTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.syncRefreshCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.syncQPCTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.customPresentDuration)
                }
            }
    }
}

public data class D3dkmtPresentStatsDwm2(
    public var cbSize: UInt = 0u,
    public var presentCount: UInt = 0u,
    public var presentRefreshCount: UInt = 0u,
    public var presentQPCTime: Long = 0L,
    public var syncRefreshCount: UInt = 0u,
    public var syncQPCTime: Long = 0L,
    public var customPresentDuration: UInt = 0u,
    public var virtualSyncRefreshCount: UInt = 0u,
    public var virtualSyncQPCTime: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtPresentStatsDwm2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtPresentStatsDwm2> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): D3dkmtPresentStatsDwm2 =
                    D3dkmtPresentStatsDwm2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtPresentStatsDwm2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.presentCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.presentRefreshCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.presentQPCTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.syncRefreshCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.syncQPCTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.customPresentDuration)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.virtualSyncRefreshCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.virtualSyncQPCTime)
                }
            }
    }
}

public class D3dkmtProcessVerifierOption internal constructor(
    hProcessCtorArg: Handle,
    public var type: D3dkmtProcessVerifierOptionType,
    public var mode: D3dkmtVerifierOptionMode,
    public var data: D3dkmtProcessVerifierOptionData,
) {
    public var hProcess: Handle = hProcessCtorArg
        internal set

    public constructor() : this(
        hProcessCtorArg = MutPtr(0L),
        type = 0,
        mode = 0,
        data = D3dkmtProcessVerifierOptionData(),
    )

    public operator fun component1(): Handle = this.hProcess

    public operator fun component2(): D3dkmtProcessVerifierOptionType = this.type

    public operator fun component3(): D3dkmtVerifierOptionMode = this.mode

    public operator fun component4(): D3dkmtProcessVerifierOptionData = this.data

    public fun copy(hProcess: Handle = this.hProcess, type: D3dkmtProcessVerifierOptionType = this.type, mode: D3dkmtVerifierOptionMode = this.mode, data: D3dkmtProcessVerifierOptionData = this.data): D3dkmtProcessVerifierOption = D3dkmtProcessVerifierOption(hProcessCtorArg = hProcess, type = type, mode = mode, data = data)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtProcessVerifierOption) return false
        if (this.hProcess != other.hProcess) return false
        if (this.type != other.type) return false
        if (this.mode != other.mode) return false
        if (this.data != other.data) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hProcess.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.mode.hashCode()
        result = 31 * result + this.data.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hProcess: Handle = MutPtr(0L),
            type: D3dkmtProcessVerifierOptionType = 0,
            mode: D3dkmtVerifierOptionMode = 0,
            data: D3dkmtProcessVerifierOptionData = D3dkmtProcessVerifierOptionData(),
        ): D3dkmtProcessVerifierOption =
            D3dkmtProcessVerifierOption(
                hProcessCtorArg = hProcess,
                type = type,
                mode = mode,
                data = data,
            )
    }
}

public data class D3dkmtProcessVerifierOptionData(
    public var vidMmFlags: D3dkmtProcessVerifierVidmmFlags = D3dkmtProcessVerifierVidmmFlags(),
    public var vidMmRestrictBudget: D3dkmtProcessVerifierVidmmRestrictBudget = D3dkmtProcessVerifierVidmmRestrictBudget(),
)

public data class D3dkmtProcessVerifierVidmmFlags(
    public var anonymous: D3dkmtProcessVerifierVidmmFlags0 = D3dkmtProcessVerifierVidmmFlags0(),
    public var value: UInt = 0u,
)

public data class D3dkmtProcessVerifierVidmmFlags0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtProcessVerifierVidmmFlags0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtProcessVerifierVidmmFlags0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtProcessVerifierVidmmFlags0 =
                    D3dkmtProcessVerifierVidmmFlags0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtProcessVerifierVidmmFlags0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtProcessVerifierVidmmRestrictBudget(
    public var localBudget: ULong = 0uL,
    public var nonLocalBudget: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtProcessVerifierVidmmRestrictBudget> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtProcessVerifierVidmmRestrictBudget> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): D3dkmtProcessVerifierVidmmRestrictBudget =
                    D3dkmtProcessVerifierVidmmRestrictBudget(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtProcessVerifierVidmmRestrictBudget) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.localBudget)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.nonLocalBudget)
                }
            }
    }
}

public class D3dkmtQueryadapterinfo internal constructor(
    public var hAdapter: UInt,
    public var type: Kmtqueryadapterinfotype,
    pPrivateDriverDataCtorArg: MutPtr,
    public var privateDriverDataSize: UInt,
) {
    public var pPrivateDriverData: MutPtr = pPrivateDriverDataCtorArg
        internal set

    public constructor() : this(
        hAdapter = 0u,
        type = 0,
        pPrivateDriverDataCtorArg = MutPtr(0L),
        privateDriverDataSize = 0u,
    )

    public operator fun component1(): UInt = this.hAdapter

    public operator fun component2(): Kmtqueryadapterinfotype = this.type

    public operator fun component3(): MutPtr = this.pPrivateDriverData

    public operator fun component4(): UInt = this.privateDriverDataSize

    public fun copy(hAdapter: UInt = this.hAdapter, type: Kmtqueryadapterinfotype = this.type, pPrivateDriverData: MutPtr = this.pPrivateDriverData, privateDriverDataSize: UInt = this.privateDriverDataSize): D3dkmtQueryadapterinfo = D3dkmtQueryadapterinfo(hAdapter = hAdapter, type = type, pPrivateDriverDataCtorArg = pPrivateDriverData, privateDriverDataSize = privateDriverDataSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQueryadapterinfo) return false
        if (this.hAdapter != other.hAdapter) return false
        if (this.type != other.type) return false
        if (this.pPrivateDriverData != other.pPrivateDriverData) return false
        if (this.privateDriverDataSize != other.privateDriverDataSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hAdapter.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.pPrivateDriverData.hashCode()
        result = 31 * result + this.privateDriverDataSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQueryadapterinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQueryadapterinfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): D3dkmtQueryadapterinfo =
                    D3dkmtQueryadapterinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQueryadapterinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAdapter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.type)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pPrivateDriverData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.privateDriverDataSize)
                }
            }

        public operator fun invoke(
            hAdapter: UInt = 0u,
            type: Kmtqueryadapterinfotype = 0,
            pPrivateDriverData: MutPtr = MutPtr(0L),
            privateDriverDataSize: UInt = 0u,
        ): D3dkmtQueryadapterinfo =
            D3dkmtQueryadapterinfo(
                hAdapter = hAdapter,
                type = type,
                pPrivateDriverDataCtorArg = pPrivateDriverData,
                privateDriverDataSize = privateDriverDataSize,
            )
    }
}

public class D3dkmtQueryallocationresidency internal constructor(
    public var hDevice: UInt,
    public var hResource: UInt,
    phAllocationListCtorArg: ConstPtr,
    public var allocationCount: UInt,
    pResidencyStatusCtorArg: MutPtr,
) {
    public var phAllocationList: ConstPtr = phAllocationListCtorArg
        internal set

    public var pResidencyStatus: MutPtr = pResidencyStatusCtorArg
        internal set

    public constructor() : this(
        hDevice = 0u,
        hResource = 0u,
        phAllocationListCtorArg = ConstPtr(0L),
        allocationCount = 0u,
        pResidencyStatusCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.hDevice

    public operator fun component2(): UInt = this.hResource

    public operator fun component3(): ConstPtr = this.phAllocationList

    public operator fun component4(): UInt = this.allocationCount

    public operator fun component5(): MutPtr = this.pResidencyStatus

    public fun copy(hDevice: UInt = this.hDevice, hResource: UInt = this.hResource, phAllocationList: ConstPtr = this.phAllocationList, allocationCount: UInt = this.allocationCount, pResidencyStatus: MutPtr = this.pResidencyStatus): D3dkmtQueryallocationresidency = D3dkmtQueryallocationresidency(hDevice = hDevice, hResource = hResource, phAllocationListCtorArg = phAllocationList, allocationCount = allocationCount, pResidencyStatusCtorArg = pResidencyStatus)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQueryallocationresidency) return false
        if (this.hDevice != other.hDevice) return false
        if (this.hResource != other.hResource) return false
        if (this.phAllocationList != other.phAllocationList) return false
        if (this.allocationCount != other.allocationCount) return false
        if (this.pResidencyStatus != other.pResidencyStatus) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDevice.hashCode()
        result = 31 * result + this.hResource.hashCode()
        result = 31 * result + this.phAllocationList.hashCode()
        result = 31 * result + this.allocationCount.hashCode()
        result = 31 * result + this.pResidencyStatus.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQueryallocationresidency> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQueryallocationresidency> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): D3dkmtQueryallocationresidency =
                    D3dkmtQueryallocationresidency(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQueryallocationresidency) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hDevice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hResource)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr + 8L, value.phAllocationList)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.allocationCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.pResidencyStatus)
                }
            }

        public operator fun invoke(
            hDevice: UInt = 0u,
            hResource: UInt = 0u,
            phAllocationList: ConstPtr = ConstPtr(0L),
            allocationCount: UInt = 0u,
            pResidencyStatus: MutPtr = MutPtr(0L),
        ): D3dkmtQueryallocationresidency =
            D3dkmtQueryallocationresidency(
                hDevice = hDevice,
                hResource = hResource,
                phAllocationListCtorArg = phAllocationList,
                allocationCount = allocationCount,
                pResidencyStatusCtorArg = pResidencyStatus,
            )
    }
}

public data class D3dkmtQueryclockcalibration(
    public var hAdapter: UInt = 0u,
    public var nodeOrdinal: UInt = 0u,
    public var physicalAdapterIndex: UInt = 0u,
    public var clockData: DxgkGpuclockdata = DxgkGpuclockdata(),
)

public data class D3dkmtQueryfseblock(
    public var adapterLuid: Luid = Luid(),
    public var hAdapter: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var flags: D3dkmtQueryfseblockflags = D3dkmtQueryfseblockflags(),
)

public data class D3dkmtQueryfseblockflags(
    public var anonymous: D3dkmtQueryfseblockflags0 = D3dkmtQueryfseblockflags0(),
    public var value: UInt = 0u,
)

public data class D3dkmtQueryfseblockflags0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQueryfseblockflags0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQueryfseblockflags0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtQueryfseblockflags0 =
                    D3dkmtQueryfseblockflags0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQueryfseblockflags0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class D3dkmtQueryprocessofferinfo internal constructor(
    public var cbSize: UInt,
    hProcessCtorArg: Handle,
    public var decommitUniqueness: ULong,
    public var decommittableBytes: ULong,
) {
    public var hProcess: Handle = hProcessCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        hProcessCtorArg = MutPtr(0L),
        decommitUniqueness = 0uL,
        decommittableBytes = 0uL,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Handle = this.hProcess

    public operator fun component3(): ULong = this.decommitUniqueness

    public operator fun component4(): ULong = this.decommittableBytes

    public fun copy(cbSize: UInt = this.cbSize, hProcess: Handle = this.hProcess, decommitUniqueness: ULong = this.decommitUniqueness, decommittableBytes: ULong = this.decommittableBytes): D3dkmtQueryprocessofferinfo = D3dkmtQueryprocessofferinfo(cbSize = cbSize, hProcessCtorArg = hProcess, decommitUniqueness = decommitUniqueness, decommittableBytes = decommittableBytes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQueryprocessofferinfo) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hProcess != other.hProcess) return false
        if (this.decommitUniqueness != other.decommitUniqueness) return false
        if (this.decommittableBytes != other.decommittableBytes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hProcess.hashCode()
        result = 31 * result + this.decommitUniqueness.hashCode()
        result = 31 * result + this.decommittableBytes.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            hProcess: Handle = MutPtr(0L),
            decommitUniqueness: ULong = 0uL,
            decommittableBytes: ULong = 0uL,
        ): D3dkmtQueryprocessofferinfo =
            D3dkmtQueryprocessofferinfo(
                cbSize = cbSize,
                hProcessCtorArg = hProcess,
                decommitUniqueness = decommitUniqueness,
                decommittableBytes = decommittableBytes,
            )
    }
}

public class D3dkmtQueryprotectedsessioninfofromnthandle internal constructor(
    hNtHandleCtorArg: Handle,
    pPrivateDriverDataCtorArg: ConstPtr,
    public var privateDriverDataSize: UInt,
    pPrivateRuntimeDataCtorArg: ConstPtr,
    public var privateRuntimeDataSize: UInt,
) {
    public var hNtHandle: Handle = hNtHandleCtorArg
        internal set

    public var pPrivateDriverData: ConstPtr = pPrivateDriverDataCtorArg
        internal set

    public var pPrivateRuntimeData: ConstPtr = pPrivateRuntimeDataCtorArg
        internal set

    public constructor() : this(
        hNtHandleCtorArg = MutPtr(0L),
        pPrivateDriverDataCtorArg = ConstPtr(0L),
        privateDriverDataSize = 0u,
        pPrivateRuntimeDataCtorArg = ConstPtr(0L),
        privateRuntimeDataSize = 0u,
    )

    public operator fun component1(): Handle = this.hNtHandle

    public operator fun component2(): ConstPtr = this.pPrivateDriverData

    public operator fun component3(): UInt = this.privateDriverDataSize

    public operator fun component4(): ConstPtr = this.pPrivateRuntimeData

    public operator fun component5(): UInt = this.privateRuntimeDataSize

    public fun copy(hNtHandle: Handle = this.hNtHandle, pPrivateDriverData: ConstPtr = this.pPrivateDriverData, privateDriverDataSize: UInt = this.privateDriverDataSize, pPrivateRuntimeData: ConstPtr = this.pPrivateRuntimeData, privateRuntimeDataSize: UInt = this.privateRuntimeDataSize): D3dkmtQueryprotectedsessioninfofromnthandle = D3dkmtQueryprotectedsessioninfofromnthandle(hNtHandleCtorArg = hNtHandle, pPrivateDriverDataCtorArg = pPrivateDriverData, privateDriverDataSize = privateDriverDataSize, pPrivateRuntimeDataCtorArg = pPrivateRuntimeData, privateRuntimeDataSize = privateRuntimeDataSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQueryprotectedsessioninfofromnthandle) return false
        if (this.hNtHandle != other.hNtHandle) return false
        if (this.pPrivateDriverData != other.pPrivateDriverData) return false
        if (this.privateDriverDataSize != other.privateDriverDataSize) return false
        if (this.pPrivateRuntimeData != other.pPrivateRuntimeData) return false
        if (this.privateRuntimeDataSize != other.privateRuntimeDataSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hNtHandle.hashCode()
        result = 31 * result + this.pPrivateDriverData.hashCode()
        result = 31 * result + this.privateDriverDataSize.hashCode()
        result = 31 * result + this.pPrivateRuntimeData.hashCode()
        result = 31 * result + this.privateRuntimeDataSize.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hNtHandle: Handle = MutPtr(0L),
            pPrivateDriverData: ConstPtr = ConstPtr(0L),
            privateDriverDataSize: UInt = 0u,
            pPrivateRuntimeData: ConstPtr = ConstPtr(0L),
            privateRuntimeDataSize: UInt = 0u,
        ): D3dkmtQueryprotectedsessioninfofromnthandle =
            D3dkmtQueryprotectedsessioninfofromnthandle(
                hNtHandleCtorArg = hNtHandle,
                pPrivateDriverDataCtorArg = pPrivateDriverData,
                privateDriverDataSize = privateDriverDataSize,
                pPrivateRuntimeDataCtorArg = pPrivateRuntimeData,
                privateRuntimeDataSize = privateRuntimeDataSize,
            )
    }
}

public data class D3dkmtQueryprotectedsessionstatus(
    public var hHandle: UInt = 0u,
    public var status: D3dkmtProtectedSessionStatus = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQueryprotectedsessionstatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQueryprotectedsessionstatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtQueryprotectedsessionstatus =
                    D3dkmtQueryprotectedsessionstatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQueryprotectedsessionstatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.status)
                }
            }
    }
}

public data class D3dkmtQueryremotevidpnsourcefromgdidisplayname(
    public var deviceName: UShortArray = UShortArray(32),
    public var vidPnSourceId: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQueryremotevidpnsourcefromgdidisplayname) return false
        if (!this.deviceName.contentEquals(other.deviceName)) return false
        if (this.vidPnSourceId != other.vidPnSourceId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.deviceName.contentHashCode()
        result = 31 * result + this.vidPnSourceId.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQueryremotevidpnsourcefromgdidisplayname> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQueryremotevidpnsourcefromgdidisplayname> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 68L
                override fun readNative(addr: Long): D3dkmtQueryremotevidpnsourcefromgdidisplayname =
                    D3dkmtQueryremotevidpnsourcefromgdidisplayname(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQueryremotevidpnsourcefromgdidisplayname) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr, value.deviceName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.vidPnSourceId)
                }
            }
    }
}

public class D3dkmtQueryresourceinfo internal constructor(
    public var hDevice: UInt,
    public var hGlobalShare: UInt,
    pPrivateRuntimeDataCtorArg: MutPtr,
    public var privateRuntimeDataSize: UInt,
    public var totalPrivateDriverDataSize: UInt,
    public var resourcePrivateDriverDataSize: UInt,
    public var numAllocations: UInt,
) {
    public var pPrivateRuntimeData: MutPtr = pPrivateRuntimeDataCtorArg
        internal set

    public constructor() : this(
        hDevice = 0u,
        hGlobalShare = 0u,
        pPrivateRuntimeDataCtorArg = MutPtr(0L),
        privateRuntimeDataSize = 0u,
        totalPrivateDriverDataSize = 0u,
        resourcePrivateDriverDataSize = 0u,
        numAllocations = 0u,
    )

    public operator fun component1(): UInt = this.hDevice

    public operator fun component2(): UInt = this.hGlobalShare

    public operator fun component3(): MutPtr = this.pPrivateRuntimeData

    public operator fun component4(): UInt = this.privateRuntimeDataSize

    public operator fun component5(): UInt = this.totalPrivateDriverDataSize

    public operator fun component6(): UInt = this.resourcePrivateDriverDataSize

    public operator fun component7(): UInt = this.numAllocations

    public fun copy(hDevice: UInt = this.hDevice, hGlobalShare: UInt = this.hGlobalShare, pPrivateRuntimeData: MutPtr = this.pPrivateRuntimeData, privateRuntimeDataSize: UInt = this.privateRuntimeDataSize, totalPrivateDriverDataSize: UInt = this.totalPrivateDriverDataSize, resourcePrivateDriverDataSize: UInt = this.resourcePrivateDriverDataSize, numAllocations: UInt = this.numAllocations): D3dkmtQueryresourceinfo = D3dkmtQueryresourceinfo(hDevice = hDevice, hGlobalShare = hGlobalShare, pPrivateRuntimeDataCtorArg = pPrivateRuntimeData, privateRuntimeDataSize = privateRuntimeDataSize, totalPrivateDriverDataSize = totalPrivateDriverDataSize, resourcePrivateDriverDataSize = resourcePrivateDriverDataSize, numAllocations = numAllocations)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQueryresourceinfo) return false
        if (this.hDevice != other.hDevice) return false
        if (this.hGlobalShare != other.hGlobalShare) return false
        if (this.pPrivateRuntimeData != other.pPrivateRuntimeData) return false
        if (this.privateRuntimeDataSize != other.privateRuntimeDataSize) return false
        if (this.totalPrivateDriverDataSize != other.totalPrivateDriverDataSize) return false
        if (this.resourcePrivateDriverDataSize != other.resourcePrivateDriverDataSize) return false
        if (this.numAllocations != other.numAllocations) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDevice.hashCode()
        result = 31 * result + this.hGlobalShare.hashCode()
        result = 31 * result + this.pPrivateRuntimeData.hashCode()
        result = 31 * result + this.privateRuntimeDataSize.hashCode()
        result = 31 * result + this.totalPrivateDriverDataSize.hashCode()
        result = 31 * result + this.resourcePrivateDriverDataSize.hashCode()
        result = 31 * result + this.numAllocations.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQueryresourceinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQueryresourceinfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): D3dkmtQueryresourceinfo =
                    D3dkmtQueryresourceinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQueryresourceinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hDevice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hGlobalShare)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pPrivateRuntimeData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.privateRuntimeDataSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.totalPrivateDriverDataSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.resourcePrivateDriverDataSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.numAllocations)
                }
            }

        public operator fun invoke(
            hDevice: UInt = 0u,
            hGlobalShare: UInt = 0u,
            pPrivateRuntimeData: MutPtr = MutPtr(0L),
            privateRuntimeDataSize: UInt = 0u,
            totalPrivateDriverDataSize: UInt = 0u,
            resourcePrivateDriverDataSize: UInt = 0u,
            numAllocations: UInt = 0u,
        ): D3dkmtQueryresourceinfo =
            D3dkmtQueryresourceinfo(
                hDevice = hDevice,
                hGlobalShare = hGlobalShare,
                pPrivateRuntimeDataCtorArg = pPrivateRuntimeData,
                privateRuntimeDataSize = privateRuntimeDataSize,
                totalPrivateDriverDataSize = totalPrivateDriverDataSize,
                resourcePrivateDriverDataSize = resourcePrivateDriverDataSize,
                numAllocations = numAllocations,
            )
    }
}

public class D3dkmtQueryresourceinfofromnthandle internal constructor(
    public var hDevice: UInt,
    hNtHandleCtorArg: Handle,
    pPrivateRuntimeDataCtorArg: MutPtr,
    public var privateRuntimeDataSize: UInt,
    public var totalPrivateDriverDataSize: UInt,
    public var resourcePrivateDriverDataSize: UInt,
    public var numAllocations: UInt,
) {
    public var hNtHandle: Handle = hNtHandleCtorArg
        internal set

    public var pPrivateRuntimeData: MutPtr = pPrivateRuntimeDataCtorArg
        internal set

    public constructor() : this(
        hDevice = 0u,
        hNtHandleCtorArg = MutPtr(0L),
        pPrivateRuntimeDataCtorArg = MutPtr(0L),
        privateRuntimeDataSize = 0u,
        totalPrivateDriverDataSize = 0u,
        resourcePrivateDriverDataSize = 0u,
        numAllocations = 0u,
    )

    public operator fun component1(): UInt = this.hDevice

    public operator fun component2(): Handle = this.hNtHandle

    public operator fun component3(): MutPtr = this.pPrivateRuntimeData

    public operator fun component4(): UInt = this.privateRuntimeDataSize

    public operator fun component5(): UInt = this.totalPrivateDriverDataSize

    public operator fun component6(): UInt = this.resourcePrivateDriverDataSize

    public operator fun component7(): UInt = this.numAllocations

    public fun copy(hDevice: UInt = this.hDevice, hNtHandle: Handle = this.hNtHandle, pPrivateRuntimeData: MutPtr = this.pPrivateRuntimeData, privateRuntimeDataSize: UInt = this.privateRuntimeDataSize, totalPrivateDriverDataSize: UInt = this.totalPrivateDriverDataSize, resourcePrivateDriverDataSize: UInt = this.resourcePrivateDriverDataSize, numAllocations: UInt = this.numAllocations): D3dkmtQueryresourceinfofromnthandle = D3dkmtQueryresourceinfofromnthandle(hDevice = hDevice, hNtHandleCtorArg = hNtHandle, pPrivateRuntimeDataCtorArg = pPrivateRuntimeData, privateRuntimeDataSize = privateRuntimeDataSize, totalPrivateDriverDataSize = totalPrivateDriverDataSize, resourcePrivateDriverDataSize = resourcePrivateDriverDataSize, numAllocations = numAllocations)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQueryresourceinfofromnthandle) return false
        if (this.hDevice != other.hDevice) return false
        if (this.hNtHandle != other.hNtHandle) return false
        if (this.pPrivateRuntimeData != other.pPrivateRuntimeData) return false
        if (this.privateRuntimeDataSize != other.privateRuntimeDataSize) return false
        if (this.totalPrivateDriverDataSize != other.totalPrivateDriverDataSize) return false
        if (this.resourcePrivateDriverDataSize != other.resourcePrivateDriverDataSize) return false
        if (this.numAllocations != other.numAllocations) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDevice.hashCode()
        result = 31 * result + this.hNtHandle.hashCode()
        result = 31 * result + this.pPrivateRuntimeData.hashCode()
        result = 31 * result + this.privateRuntimeDataSize.hashCode()
        result = 31 * result + this.totalPrivateDriverDataSize.hashCode()
        result = 31 * result + this.resourcePrivateDriverDataSize.hashCode()
        result = 31 * result + this.numAllocations.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hDevice: UInt = 0u,
            hNtHandle: Handle = MutPtr(0L),
            pPrivateRuntimeData: MutPtr = MutPtr(0L),
            privateRuntimeDataSize: UInt = 0u,
            totalPrivateDriverDataSize: UInt = 0u,
            resourcePrivateDriverDataSize: UInt = 0u,
            numAllocations: UInt = 0u,
        ): D3dkmtQueryresourceinfofromnthandle =
            D3dkmtQueryresourceinfofromnthandle(
                hDevice = hDevice,
                hNtHandleCtorArg = hNtHandle,
                pPrivateRuntimeDataCtorArg = pPrivateRuntimeData,
                privateRuntimeDataSize = privateRuntimeDataSize,
                totalPrivateDriverDataSize = totalPrivateDriverDataSize,
                resourcePrivateDriverDataSize = resourcePrivateDriverDataSize,
                numAllocations = numAllocations,
            )
    }
}

public class D3dkmtQuerystatistics internal constructor(
    public var type: D3dkmtQuerystatisticsType,
    public var adapterLuid: Luid,
    hProcessCtorArg: Handle,
    public var queryResult: D3dkmtQuerystatisticsResult,
    public var anonymous: D3dkmtQuerystatistics0,
) {
    public var hProcess: Handle = hProcessCtorArg
        internal set

    public constructor() : this(
        type = 0,
        adapterLuid = Luid(),
        hProcessCtorArg = MutPtr(0L),
        queryResult = D3dkmtQuerystatisticsResult(),
        anonymous = D3dkmtQuerystatistics0(),
    )

    public operator fun component1(): D3dkmtQuerystatisticsType = this.type

    public operator fun component2(): Luid = this.adapterLuid

    public operator fun component3(): Handle = this.hProcess

    public operator fun component4(): D3dkmtQuerystatisticsResult = this.queryResult

    public operator fun component5(): D3dkmtQuerystatistics0 = this.anonymous

    public fun copy(type: D3dkmtQuerystatisticsType = this.type, adapterLuid: Luid = this.adapterLuid, hProcess: Handle = this.hProcess, queryResult: D3dkmtQuerystatisticsResult = this.queryResult, anonymous: D3dkmtQuerystatistics0 = this.anonymous): D3dkmtQuerystatistics = D3dkmtQuerystatistics(type = type, adapterLuid = adapterLuid, hProcessCtorArg = hProcess, queryResult = queryResult, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQuerystatistics) return false
        if (this.type != other.type) return false
        if (this.adapterLuid != other.adapterLuid) return false
        if (this.hProcess != other.hProcess) return false
        if (this.queryResult != other.queryResult) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.adapterLuid.hashCode()
        result = 31 * result + this.hProcess.hashCode()
        result = 31 * result + this.queryResult.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            type: D3dkmtQuerystatisticsType = 0,
            adapterLuid: Luid = Luid(),
            hProcess: Handle = MutPtr(0L),
            queryResult: D3dkmtQuerystatisticsResult = D3dkmtQuerystatisticsResult(),
            anonymous: D3dkmtQuerystatistics0 = D3dkmtQuerystatistics0(),
        ): D3dkmtQuerystatistics =
            D3dkmtQuerystatistics(
                type = type,
                adapterLuid = adapterLuid,
                hProcessCtorArg = hProcess,
                queryResult = queryResult,
                anonymous = anonymous,
            )
    }
}

public class D3dkmtQuerystatistics0(
    public var querySegment: D3dkmtQuerystatisticsQuerySegment = D3dkmtQuerystatisticsQuerySegment(),
    public var queryProcessSegment: D3dkmtQuerystatisticsQuerySegment = D3dkmtQuerystatisticsQuerySegment(),
    public var queryProcessSegmentGroup: D3dkmtMemorySegmentGroup = 0,
    public var queryNode: D3dkmtQuerystatisticsQueryNode = D3dkmtQuerystatisticsQueryNode(),
    public var queryProcessNode: D3dkmtQuerystatisticsQueryNode = D3dkmtQuerystatisticsQueryNode(),
    public var queryVidPnSource: D3dkmtQuerystatisticsQueryVidpnsource = D3dkmtQuerystatisticsQueryVidpnsource(),
    public var queryProcessVidPnSource: D3dkmtQuerystatisticsQueryVidpnsource = D3dkmtQuerystatisticsQueryVidpnsource(),
    public var queryPhysAdapter: D3dkmtQuerystatisticsQueryPhysicalAdapter = D3dkmtQuerystatisticsQueryPhysicalAdapter(),
    public var queryAdapter2: D3dkmtQuerystatisticsQueryAdapter2 = D3dkmtQuerystatisticsQueryAdapter2(),
    public var querySegment2: D3dkmtQuerystatisticsQuerySegment2 = D3dkmtQuerystatisticsQuerySegment2(),
    public var queryProcessAdapter2: D3dkmtQuerystatisticsQueryAdapter2 = D3dkmtQuerystatisticsQueryAdapter2(),
    public var queryProcessSegment2: D3dkmtQuerystatisticsQuerySegment2 = D3dkmtQuerystatisticsQuerySegment2(),
    public var queryProcessSegmentGroup2: D3dkmtQuerystatisticsQueryProcessSegmentGroup2 = D3dkmtQuerystatisticsQueryProcessSegmentGroup2(),
    public var querySegmentUsage: D3dkmtQuerystatisticsQuerySegmentUsage = D3dkmtQuerystatisticsQuerySegmentUsage(),
    public var querySegmentGroupUsage: D3dkmtQuerystatisticsQuerySegmentGroupUsage = D3dkmtQuerystatisticsQuerySegmentGroupUsage(),
    public var queryNode2: D3dkmtQuerystatisticsQueryNode2 = D3dkmtQuerystatisticsQueryNode2(),
    public var queryProcessNode2: D3dkmtQuerystatisticsQueryNode2 = D3dkmtQuerystatisticsQueryNode2(),
)

public class D3dkmtQuerystatisticsAdapterInformation(
    public var nbSegments: UInt = 0u,
    public var nodeCount: UInt = 0u,
    public var vidPnSourceCount: UInt = 0u,
    public var vSyncEnabled: UInt = 0u,
    public var tdrDetectedCount: UInt = 0u,
    public var zeroLengthDmaBuffers: Long = 0L,
    public var restartedPeriod: ULong = 0uL,
    public var referenceDmaBuffer: D3dkmtQuerystatsticsReferenceDmaBuffer = D3dkmtQuerystatsticsReferenceDmaBuffer(),
    public var renaming: D3dkmtQuerystatsticsRenaming = D3dkmtQuerystatsticsRenaming(),
    public var preparation: D3dkmtQuerystatsticsPrepration = D3dkmtQuerystatsticsPrepration(),
    public var pagingFault: D3dkmtQuerystatsticsPagingFault = D3dkmtQuerystatsticsPagingFault(),
    public var pagingTransfer: D3dkmtQuerystatsticsPagingTransfer = D3dkmtQuerystatsticsPagingTransfer(),
    public var swizzlingRange: D3dkmtQuerystatsticsSwizzlingRange = D3dkmtQuerystatsticsSwizzlingRange(),
    public var locks: D3dkmtQuerystatsticsLocks = D3dkmtQuerystatsticsLocks(),
    public var allocations: D3dkmtQuerystatsticsAllocations = D3dkmtQuerystatsticsAllocations(),
    public var terminations: D3dkmtQuerystatsticsTerminations = D3dkmtQuerystatsticsTerminations(),
    public var flags: D3dkmtQuerystatisticsAdapterInformationFlags = D3dkmtQuerystatisticsAdapterInformationFlags(),
    public var reserved: ULongArray = ULongArray(7),
)

public data class D3dkmtQuerystatisticsAdapterInformationFlags(
    public var anonymous: D3dkmtQuerystatisticsAdapterInformationFlags0 = D3dkmtQuerystatisticsAdapterInformationFlags0(),
)

public data class D3dkmtQuerystatisticsAdapterInformationFlags0(
    public var anonymous: D3dkmtQuerystatisticsAdapterInformationFlags00 = D3dkmtQuerystatisticsAdapterInformationFlags00(),
    public var value: ULong = 0uL,
)

public data class D3dkmtQuerystatisticsAdapterInformationFlags00(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsAdapterInformationFlags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsAdapterInformationFlags00> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsAdapterInformationFlags00 =
                    D3dkmtQuerystatisticsAdapterInformationFlags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsAdapterInformationFlags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtQuerystatisticsCommitmentData(
    public var totalBytesEvictedFromProcess: ULong = 0uL,
    public var bytesBySegmentPreference: ULongArray = ULongArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQuerystatisticsCommitmentData) return false
        if (this.totalBytesEvictedFromProcess != other.totalBytesEvictedFromProcess) return false
        if (!this.bytesBySegmentPreference.contentEquals(other.bytesBySegmentPreference)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.totalBytesEvictedFromProcess.hashCode()
        result = 31 * result + this.bytesBySegmentPreference.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsCommitmentData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsCommitmentData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsCommitmentData =
                    D3dkmtQuerystatisticsCommitmentData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (5).toInt())
                        ).readNative(addr + 8L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsCommitmentData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.totalBytesEvictedFromProcess)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (5).toInt())
                    ).writeNative(addr + 8L, value.bytesBySegmentPreference.toList())
                }
            }
    }
}

public data class D3dkmtQuerystatisticsCounter(
    public var count: UInt = 0u,
    public var bytes: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsCounter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsCounter> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsCounter =
                    D3dkmtQuerystatisticsCounter(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsCounter) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.count)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.bytes)
                }
            }
    }
}

public data class D3dkmtQuerystatisticsDmaBuffer(
    public var size: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var allocationListBytes: UInt = 0u,
    public var patchLocationListBytes: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsDmaBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsDmaBuffer> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsDmaBuffer =
                    D3dkmtQuerystatisticsDmaBuffer(
                        (D3dkmtQuerystatisticsCounter.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsDmaBuffer) {
                    (D3dkmtQuerystatisticsCounter.typeLayout()).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.allocationListBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.patchLocationListBytes)
                }
            }
    }
}

public data class D3dkmtQuerystatisticsDmaPacketTypeInformation(
    public var packetSubmited: UInt = 0u,
    public var packetCompleted: UInt = 0u,
    public var packetPreempted: UInt = 0u,
    public var packetFaulted: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsDmaPacketTypeInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsDmaPacketTypeInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsDmaPacketTypeInformation =
                    D3dkmtQuerystatisticsDmaPacketTypeInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsDmaPacketTypeInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.packetSubmited)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.packetCompleted)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.packetPreempted)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.packetFaulted)
                }
            }
    }
}

public data class D3dkmtQuerystatisticsMemory(
    public var totalBytesEvicted: ULong = 0uL,
    public var allocsCommitted: UInt = 0u,
    public var allocsResident: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsMemory> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsMemory> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsMemory =
                    D3dkmtQuerystatisticsMemory(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsMemory) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.totalBytesEvicted)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.allocsCommitted)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.allocsResident)
                }
            }
    }
}

public data class D3dkmtQuerystatisticsMemoryUsage(
    public var allocatedBytes: ULong = 0uL,
    public var freeBytes: ULong = 0uL,
    public var zeroBytes: ULong = 0uL,
    public var modifiedBytes: ULong = 0uL,
    public var standbyBytes: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsMemoryUsage> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsMemoryUsage> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsMemoryUsage =
                    D3dkmtQuerystatisticsMemoryUsage(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsMemoryUsage) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.allocatedBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.freeBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.zeroBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.modifiedBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.standbyBytes)
                }
            }
    }
}

public data class D3dkmtQuerystatisticsNodeInformation(
    public var globalInformation: D3dkmtQuerystatisticsProcessNodeInformation = D3dkmtQuerystatisticsProcessNodeInformation(),
    public var systemInformation: D3dkmtQuerystatisticsProcessNodeInformation = D3dkmtQuerystatisticsProcessNodeInformation(),
    public var nodePerfData: D3dkmtNodePerfdata = D3dkmtNodePerfdata(),
    public var reserved: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQuerystatisticsNodeInformation) return false
        if (this.globalInformation != other.globalInformation) return false
        if (this.systemInformation != other.systemInformation) return false
        if (this.nodePerfData != other.nodePerfData) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.globalInformation.hashCode()
        result = 31 * result + this.systemInformation.hashCode()
        result = 31 * result + this.nodePerfData.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsNodeInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsNodeInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 616L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsNodeInformation =
                    D3dkmtQuerystatisticsNodeInformation(
                        (D3dkmtQuerystatisticsProcessNodeInformation.typeLayout()).readNative(addr),
                        (D3dkmtQuerystatisticsProcessNodeInformation.typeLayout()).readNative(addr + 272L),
                        (D3dkmtNodePerfdata.typeLayout()).readNative(addr + 544L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                        ).readNative(addr + 600L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsNodeInformation) {
                    (D3dkmtQuerystatisticsProcessNodeInformation.typeLayout()).writeNative(addr, value.globalInformation)
                    (D3dkmtQuerystatisticsProcessNodeInformation.typeLayout()).writeNative(addr + 272L, value.systemInformation)
                    (D3dkmtNodePerfdata.typeLayout()).writeNative(addr + 544L, value.nodePerfData)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                    ).writeNative(addr + 600L, value.reserved.toList())
                }
            }
    }
}

public data class D3dkmtQuerystatisticsPacketInformation(
    public var queuePacket: List<D3dkmtQuerystatisticsQueuePacketTypeInformation> = List(8) { D3dkmtQuerystatisticsQueuePacketTypeInformation() },
    public var dmaPacket: List<D3dkmtQuerystatisticsDmaPacketTypeInformation> = List(4) { D3dkmtQuerystatisticsDmaPacketTypeInformation() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsPacketInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsPacketInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 128L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsPacketInformation =
                    D3dkmtQuerystatisticsPacketInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(D3dkmtQuerystatisticsQueuePacketTypeInformation.typeLayout(), (8).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(D3dkmtQuerystatisticsDmaPacketTypeInformation.typeLayout(), (4).toInt())
                        ).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsPacketInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(D3dkmtQuerystatisticsQueuePacketTypeInformation.typeLayout(), (8).toInt())
                    ).writeNative(addr, value.queuePacket)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(D3dkmtQuerystatisticsDmaPacketTypeInformation.typeLayout(), (4).toInt())
                    ).writeNative(addr + 64L, value.dmaPacket)
                }
            }
    }
}

public data class D3dkmtQuerystatisticsPhysicalAdapterInformation(
    public var adapterPerfData: D3dkmtAdapterPerfdata = D3dkmtAdapterPerfdata(),
    public var adapterPerfDataCaps: D3dkmtAdapterPerfdatacaps = D3dkmtAdapterPerfdatacaps(),
    public var gpuVersion: D3dkmtGpuversion = D3dkmtGpuversion(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsPhysicalAdapterInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsPhysicalAdapterInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 240L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsPhysicalAdapterInformation =
                    D3dkmtQuerystatisticsPhysicalAdapterInformation(
                        (D3dkmtAdapterPerfdata.typeLayout()).readNative(addr),
                        (D3dkmtAdapterPerfdatacaps.typeLayout()).readNative(addr + 64L),
                        (D3dkmtGpuversion.typeLayout()).readNative(addr + 104L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsPhysicalAdapterInformation) {
                    (D3dkmtAdapterPerfdata.typeLayout()).writeNative(addr, value.adapterPerfData)
                    (D3dkmtAdapterPerfdatacaps.typeLayout()).writeNative(addr + 64L, value.adapterPerfDataCaps)
                    (D3dkmtGpuversion.typeLayout()).writeNative(addr + 104L, value.gpuVersion)
                }
            }
    }
}

public data class D3dkmtQuerystatisticsPolicy(
    public var preferApertureForRead: ULongArray = ULongArray(5),
    public var preferAperture: ULongArray = ULongArray(5),
    public var memResetOnPaging: ULong = 0uL,
    public var removePagesFromWorkingSetOnPaging: ULong = 0uL,
    public var migrationEnabled: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQuerystatisticsPolicy) return false
        if (!this.preferApertureForRead.contentEquals(other.preferApertureForRead)) return false
        if (!this.preferAperture.contentEquals(other.preferAperture)) return false
        if (this.memResetOnPaging != other.memResetOnPaging) return false
        if (this.removePagesFromWorkingSetOnPaging != other.removePagesFromWorkingSetOnPaging) return false
        if (this.migrationEnabled != other.migrationEnabled) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.preferApertureForRead.contentHashCode()
        result = 31 * result + this.preferAperture.contentHashCode()
        result = 31 * result + this.memResetOnPaging.hashCode()
        result = 31 * result + this.removePagesFromWorkingSetOnPaging.hashCode()
        result = 31 * result + this.migrationEnabled.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsPolicy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsPolicy> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 104L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsPolicy =
                    D3dkmtQuerystatisticsPolicy(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (5).toInt())
                        ).readNative(addr).toULongArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (5).toInt())
                        ).readNative(addr + 40L).toULongArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsPolicy) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (5).toInt())
                    ).writeNative(addr, value.preferApertureForRead.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (5).toInt())
                    ).writeNative(addr + 40L, value.preferAperture.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.memResetOnPaging)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.removePagesFromWorkingSetOnPaging)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.migrationEnabled)
                }
            }
    }
}

public data class D3dkmtQuerystatisticsPreemptionInformation(
    public var preemptionCounter: UIntArray = UIntArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQuerystatisticsPreemptionInformation) return false
        if (!this.preemptionCounter.contentEquals(other.preemptionCounter)) return false
        return true
    }

    override fun hashCode(): Int = this.preemptionCounter.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsPreemptionInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsPreemptionInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsPreemptionInformation =
                    D3dkmtQuerystatisticsPreemptionInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (16).toInt())
                        ).readNative(addr).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsPreemptionInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (16).toInt())
                    ).writeNative(addr, value.preemptionCounter.toList())
                }
            }
    }
}

public data class D3dkmtQuerystatisticsProcessAdapterInformation(
    public var nbSegments: UInt = 0u,
    public var nodeCount: UInt = 0u,
    public var vidPnSourceCount: UInt = 0u,
    public var virtualMemoryUsage: UInt = 0u,
    public var dmaBuffer: D3dkmtQuerystatisticsDmaBuffer = D3dkmtQuerystatisticsDmaBuffer(),
    public var commitmentData: D3dkmtQuerystatisticsCommitmentData = D3dkmtQuerystatisticsCommitmentData(),
    public var policy: D3dkmtQuerystatisticsPolicy = D3dkmtQuerystatisticsPolicy(),
    public var processInterferenceCounters: D3dkmtQuerystatisticsProcessInterferenceCounters = D3dkmtQuerystatisticsProcessInterferenceCounters(),
    public var clientHint: D3dkmtClienthint = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsProcessAdapterInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsProcessAdapterInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 272L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsProcessAdapterInformation =
                    D3dkmtQuerystatisticsProcessAdapterInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (D3dkmtQuerystatisticsDmaBuffer.typeLayout()).readNative(addr + 16L),
                        (D3dkmtQuerystatisticsCommitmentData.typeLayout()).readNative(addr + 40L),
                        (D3dkmtQuerystatisticsPolicy.typeLayout()).readNative(addr + 88L),
                        (D3dkmtQuerystatisticsProcessInterferenceCounters.typeLayout()).readNative(addr + 192L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 264L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsProcessAdapterInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nbSegments)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nodeCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.vidPnSourceCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.virtualMemoryUsage)
                    (D3dkmtQuerystatisticsDmaBuffer.typeLayout()).writeNative(addr + 16L, value.dmaBuffer)
                    (D3dkmtQuerystatisticsCommitmentData.typeLayout()).writeNative(addr + 40L, value.commitmentData)
                    (D3dkmtQuerystatisticsPolicy.typeLayout()).writeNative(addr + 88L, value.policy)
                    (D3dkmtQuerystatisticsProcessInterferenceCounters.typeLayout()).writeNative(addr + 192L, value.processInterferenceCounters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 264L, value.clientHint)
                }
            }
    }
}

public data class D3dkmtQuerystatisticsProcessInformation(
    public var nodeCount: UInt = 0u,
    public var vidPnSourceCount: UInt = 0u,
    public var systemMemory: D3dkmtQuerystatisticsSystemMemory = D3dkmtQuerystatisticsSystemMemory(),
    public var reserved: ULongArray = ULongArray(7),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQuerystatisticsProcessInformation) return false
        if (this.nodeCount != other.nodeCount) return false
        if (this.vidPnSourceCount != other.vidPnSourceCount) return false
        if (this.systemMemory != other.systemMemory) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nodeCount.hashCode()
        result = 31 * result + this.vidPnSourceCount.hashCode()
        result = 31 * result + this.systemMemory.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsProcessInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsProcessInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 144L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsProcessInformation =
                    D3dkmtQuerystatisticsProcessInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (D3dkmtQuerystatisticsSystemMemory.typeLayout()).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (7).toInt())
                        ).readNative(addr + 88L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsProcessInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nodeCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vidPnSourceCount)
                    (D3dkmtQuerystatisticsSystemMemory.typeLayout()).writeNative(addr + 8L, value.systemMemory)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (7).toInt())
                    ).writeNative(addr + 88L, value.reserved.toList())
                }
            }
    }
}

public data class D3dkmtQuerystatisticsProcessInterferenceCounters(
    public var interferenceCount: ULongArray = ULongArray(9),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQuerystatisticsProcessInterferenceCounters) return false
        if (!this.interferenceCount.contentEquals(other.interferenceCount)) return false
        return true
    }

    override fun hashCode(): Int = this.interferenceCount.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsProcessInterferenceCounters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsProcessInterferenceCounters> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsProcessInterferenceCounters =
                    D3dkmtQuerystatisticsProcessInterferenceCounters(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (9).toInt())
                        ).readNative(addr).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsProcessInterferenceCounters) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (9).toInt())
                    ).writeNative(addr, value.interferenceCount.toList())
                }
            }
    }
}

public data class D3dkmtQuerystatisticsProcessNodeInformation(
    public var runningTime: Long = 0L,
    public var contextSwitch: UInt = 0u,
    public var preemptionStatistics: D3dkmtQuerystatisticsPreemptionInformation = D3dkmtQuerystatisticsPreemptionInformation(),
    public var packetStatistics: D3dkmtQuerystatisticsPacketInformation = D3dkmtQuerystatisticsPacketInformation(),
    public var reserved: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQuerystatisticsProcessNodeInformation) return false
        if (this.runningTime != other.runningTime) return false
        if (this.contextSwitch != other.contextSwitch) return false
        if (this.preemptionStatistics != other.preemptionStatistics) return false
        if (this.packetStatistics != other.packetStatistics) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.runningTime.hashCode()
        result = 31 * result + this.contextSwitch.hashCode()
        result = 31 * result + this.preemptionStatistics.hashCode()
        result = 31 * result + this.packetStatistics.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsProcessNodeInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsProcessNodeInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 272L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsProcessNodeInformation =
                    D3dkmtQuerystatisticsProcessNodeInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (D3dkmtQuerystatisticsPreemptionInformation.typeLayout()).readNative(addr + 12L),
                        (D3dkmtQuerystatisticsPacketInformation.typeLayout()).readNative(addr + 76L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (8).toInt())
                        ).readNative(addr + 208L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsProcessNodeInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.runningTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.contextSwitch)
                    (D3dkmtQuerystatisticsPreemptionInformation.typeLayout()).writeNative(addr + 12L, value.preemptionStatistics)
                    (D3dkmtQuerystatisticsPacketInformation.typeLayout()).writeNative(addr + 76L, value.packetStatistics)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (8).toInt())
                    ).writeNative(addr + 208L, value.reserved.toList())
                }
            }
    }
}

public data class D3dkmtQuerystatisticsProcessSegmentGroupInformation(
    public var budget: ULong = 0uL,
    public var requested: ULong = 0uL,
    public var usage: ULong = 0uL,
    public var demoted: ULongArray = ULongArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQuerystatisticsProcessSegmentGroupInformation) return false
        if (this.budget != other.budget) return false
        if (this.requested != other.requested) return false
        if (this.usage != other.usage) return false
        if (!this.demoted.contentEquals(other.demoted)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.budget.hashCode()
        result = 31 * result + this.requested.hashCode()
        result = 31 * result + this.usage.hashCode()
        result = 31 * result + this.demoted.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsProcessSegmentGroupInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsProcessSegmentGroupInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsProcessSegmentGroupInformation =
                    D3dkmtQuerystatisticsProcessSegmentGroupInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (5).toInt())
                        ).readNative(addr + 24L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsProcessSegmentGroupInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.budget)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.requested)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.usage)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (5).toInt())
                    ).writeNative(addr + 24L, value.demoted.toList())
                }
            }
    }
}

public data class D3dkmtQuerystatisticsProcessSegmentInformation(
    public var bytesCommitted: ULong = 0uL,
    public var maximumWorkingSet: ULong = 0uL,
    public var minimumWorkingSet: ULong = 0uL,
    public var nbReferencedAllocationEvictedInPeriod: UInt = 0u,
    public var padding: UInt = 0u,
    public var videoMemory: D3dkmtQuerystatisticsVideoMemory = D3dkmtQuerystatisticsVideoMemory(),
    public var policy: D3dkmtQuerystatisticsProcessSegmentPolicy = D3dkmtQuerystatisticsProcessSegmentPolicy(),
    public var reserved: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQuerystatisticsProcessSegmentInformation) return false
        if (this.bytesCommitted != other.bytesCommitted) return false
        if (this.maximumWorkingSet != other.maximumWorkingSet) return false
        if (this.minimumWorkingSet != other.minimumWorkingSet) return false
        if (this.nbReferencedAllocationEvictedInPeriod != other.nbReferencedAllocationEvictedInPeriod) return false
        if (this.padding != other.padding) return false
        if (this.videoMemory != other.videoMemory) return false
        if (this.policy != other.policy) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bytesCommitted.hashCode()
        result = 31 * result + this.maximumWorkingSet.hashCode()
        result = 31 * result + this.minimumWorkingSet.hashCode()
        result = 31 * result + this.nbReferencedAllocationEvictedInPeriod.hashCode()
        result = 31 * result + this.padding.hashCode()
        result = 31 * result + this.videoMemory.hashCode()
        result = 31 * result + this.policy.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsProcessSegmentInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsProcessSegmentInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 216L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsProcessSegmentInformation =
                    D3dkmtQuerystatisticsProcessSegmentInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (D3dkmtQuerystatisticsVideoMemory.typeLayout()).readNative(addr + 32L),
                        (D3dkmtQuerystatisticsProcessSegmentPolicy.typeLayout()).readNative(addr + 144L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (8).toInt())
                        ).readNative(addr + 152L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsProcessSegmentInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bytesCommitted)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.maximumWorkingSet)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.minimumWorkingSet)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.nbReferencedAllocationEvictedInPeriod)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.padding)
                    (D3dkmtQuerystatisticsVideoMemory.typeLayout()).writeNative(addr + 32L, value.videoMemory)
                    (D3dkmtQuerystatisticsProcessSegmentPolicy.typeLayout()).writeNative(addr + 144L, value.policy)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (8).toInt())
                    ).writeNative(addr + 152L, value.reserved.toList())
                }
            }
    }
}

public data class D3dkmtQuerystatisticsProcessSegmentPolicy(
    public var useMRU: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsProcessSegmentPolicy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsProcessSegmentPolicy> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsProcessSegmentPolicy =
                    D3dkmtQuerystatisticsProcessSegmentPolicy(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsProcessSegmentPolicy) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.useMRU)
                }
            }
    }
}

public data class D3dkmtQuerystatisticsProcessVidpnsourceInformation(
    public var frame: UInt = 0u,
    public var cancelledFrame: UInt = 0u,
    public var queuedPresent: UInt = 0u,
    public var padding: UInt = 0u,
    public var isVSyncEnabled: ULong = 0uL,
    public var vSyncOnTotalTimeMs: ULong = 0uL,
    public var vSyncOffKeepPhaseTotalTimeMs: ULong = 0uL,
    public var vSyncOffNoPhaseTotalTimeMs: ULong = 0uL,
    public var reserved: ULongArray = ULongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQuerystatisticsProcessVidpnsourceInformation) return false
        if (this.frame != other.frame) return false
        if (this.cancelledFrame != other.cancelledFrame) return false
        if (this.queuedPresent != other.queuedPresent) return false
        if (this.padding != other.padding) return false
        if (this.isVSyncEnabled != other.isVSyncEnabled) return false
        if (this.vSyncOnTotalTimeMs != other.vSyncOnTotalTimeMs) return false
        if (this.vSyncOffKeepPhaseTotalTimeMs != other.vSyncOffKeepPhaseTotalTimeMs) return false
        if (this.vSyncOffNoPhaseTotalTimeMs != other.vSyncOffNoPhaseTotalTimeMs) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.frame.hashCode()
        result = 31 * result + this.cancelledFrame.hashCode()
        result = 31 * result + this.queuedPresent.hashCode()
        result = 31 * result + this.padding.hashCode()
        result = 31 * result + this.isVSyncEnabled.hashCode()
        result = 31 * result + this.vSyncOnTotalTimeMs.hashCode()
        result = 31 * result + this.vSyncOffKeepPhaseTotalTimeMs.hashCode()
        result = 31 * result + this.vSyncOffNoPhaseTotalTimeMs.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsProcessVidpnsourceInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsProcessVidpnsourceInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsProcessVidpnsourceInformation =
                    D3dkmtQuerystatisticsProcessVidpnsourceInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                        ).readNative(addr + 48L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsProcessVidpnsourceInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.frame)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cancelledFrame)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.queuedPresent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.padding)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.isVSyncEnabled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.vSyncOnTotalTimeMs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.vSyncOffKeepPhaseTotalTimeMs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.vSyncOffNoPhaseTotalTimeMs)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                    ).writeNative(addr + 48L, value.reserved.toList())
                }
            }
    }
}

public data class D3dkmtQuerystatisticsQueryAdapter2(
    public var physicalAdapterIndex: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsQueryAdapter2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsQueryAdapter2> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsQueryAdapter2 =
                    D3dkmtQuerystatisticsQueryAdapter2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsQueryAdapter2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.physicalAdapterIndex)
                }
            }
    }
}

public data class D3dkmtQuerystatisticsQueryAdapterInformation2(
    public var physicalAdapterIndex: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsQueryAdapterInformation2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsQueryAdapterInformation2> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsQueryAdapterInformation2 =
                    D3dkmtQuerystatisticsQueryAdapterInformation2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsQueryAdapterInformation2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.physicalAdapterIndex)
                }
            }
    }
}

public data class D3dkmtQuerystatisticsQueryNode(
    public var nodeId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsQueryNode> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsQueryNode> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsQueryNode =
                    D3dkmtQuerystatisticsQueryNode(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsQueryNode) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nodeId)
                }
            }
    }
}

public data class D3dkmtQuerystatisticsQueryNode2(
    public var physicalAdapterIndex: UShort = 0u,
    public var nodeOrdinal: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsQueryNode2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsQueryNode2> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsQueryNode2 =
                    D3dkmtQuerystatisticsQueryNode2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsQueryNode2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.physicalAdapterIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.nodeOrdinal)
                }
            }
    }
}

public data class D3dkmtQuerystatisticsQueryPhysicalAdapter(
    public var physicalAdapterIndex: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsQueryPhysicalAdapter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsQueryPhysicalAdapter> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsQueryPhysicalAdapter =
                    D3dkmtQuerystatisticsQueryPhysicalAdapter(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsQueryPhysicalAdapter) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.physicalAdapterIndex)
                }
            }
    }
}

public data class D3dkmtQuerystatisticsQueryProcessSegmentGroup2(
    public var physicalAdapterIndex: UShort = 0u,
    public var segmentGroup: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsQueryProcessSegmentGroup2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsQueryProcessSegmentGroup2> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsQueryProcessSegmentGroup2 =
                    D3dkmtQuerystatisticsQueryProcessSegmentGroup2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsQueryProcessSegmentGroup2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.physicalAdapterIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.segmentGroup)
                }
            }
    }
}

public data class D3dkmtQuerystatisticsQuerySegment(
    public var segmentId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsQuerySegment> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsQuerySegment> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsQuerySegment =
                    D3dkmtQuerystatisticsQuerySegment(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsQuerySegment) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.segmentId)
                }
            }
    }
}

public data class D3dkmtQuerystatisticsQuerySegment2(
    public var physicalAdapterIndex: UShort = 0u,
    public var segmentId: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsQuerySegment2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsQuerySegment2> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsQuerySegment2 =
                    D3dkmtQuerystatisticsQuerySegment2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsQuerySegment2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.physicalAdapterIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.segmentId)
                }
            }
    }
}

public data class D3dkmtQuerystatisticsQuerySegmentGroupUsage(
    public var physicalAdapterIndex: UShort = 0u,
    public var segmentGroup: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsQuerySegmentGroupUsage> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsQuerySegmentGroupUsage> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsQuerySegmentGroupUsage =
                    D3dkmtQuerystatisticsQuerySegmentGroupUsage(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsQuerySegmentGroupUsage) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.physicalAdapterIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.segmentGroup)
                }
            }
    }
}

public data class D3dkmtQuerystatisticsQuerySegmentUsage(
    public var physicalAdapterIndex: UShort = 0u,
    public var segmentId: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsQuerySegmentUsage> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsQuerySegmentUsage> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsQuerySegmentUsage =
                    D3dkmtQuerystatisticsQuerySegmentUsage(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsQuerySegmentUsage) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.physicalAdapterIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.segmentId)
                }
            }
    }
}

public data class D3dkmtQuerystatisticsQueryVidpnsource(
    public var vidPnSourceId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsQueryVidpnsource> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsQueryVidpnsource> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsQueryVidpnsource =
                    D3dkmtQuerystatisticsQueryVidpnsource(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsQueryVidpnsource) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.vidPnSourceId)
                }
            }
    }
}

public data class D3dkmtQuerystatisticsQueuePacketTypeInformation(
    public var packetSubmited: UInt = 0u,
    public var packetCompleted: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsQueuePacketTypeInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsQueuePacketTypeInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsQueuePacketTypeInformation =
                    D3dkmtQuerystatisticsQueuePacketTypeInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsQueuePacketTypeInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.packetSubmited)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.packetCompleted)
                }
            }
    }
}

public data class D3dkmtQuerystatisticsResult(
    public var adapterInformation: D3dkmtQuerystatisticsAdapterInformation = D3dkmtQuerystatisticsAdapterInformation(),
    public var physAdapterInformation: D3dkmtQuerystatisticsPhysicalAdapterInformation = D3dkmtQuerystatisticsPhysicalAdapterInformation(),
    public var segmentInformation: D3dkmtQuerystatisticsSegmentInformation = D3dkmtQuerystatisticsSegmentInformation(),
    public var nodeInformation: D3dkmtQuerystatisticsNodeInformation = D3dkmtQuerystatisticsNodeInformation(),
    public var vidPnSourceInformation: D3dkmtQuerystatisticsVidpnsourceInformation = D3dkmtQuerystatisticsVidpnsourceInformation(),
    public var processInformation: D3dkmtQuerystatisticsProcessInformation = D3dkmtQuerystatisticsProcessInformation(),
    public var processAdapterInformation: D3dkmtQuerystatisticsProcessAdapterInformation = D3dkmtQuerystatisticsProcessAdapterInformation(),
    public var processSegmentInformation: D3dkmtQuerystatisticsProcessSegmentInformation = D3dkmtQuerystatisticsProcessSegmentInformation(),
    public var processNodeInformation: D3dkmtQuerystatisticsProcessNodeInformation = D3dkmtQuerystatisticsProcessNodeInformation(),
    public var processVidPnSourceInformation: D3dkmtQuerystatisticsProcessVidpnsourceInformation = D3dkmtQuerystatisticsProcessVidpnsourceInformation(),
    public var processSegmentGroupInformation: D3dkmtQuerystatisticsProcessSegmentGroupInformation = D3dkmtQuerystatisticsProcessSegmentGroupInformation(),
    public var segmentUsageInformation: D3dkmtQuerystatisticsMemoryUsage = D3dkmtQuerystatisticsMemoryUsage(),
    public var segmentGroupUsageInformation: D3dkmtQuerystatisticsMemoryUsage = D3dkmtQuerystatisticsMemoryUsage(),
)

public data class D3dkmtQuerystatisticsSegmentInformation(
    public var commitLimit: ULong = 0uL,
    public var bytesCommitted: ULong = 0uL,
    public var bytesResident: ULong = 0uL,
    public var memory: D3dkmtQuerystatisticsMemory = D3dkmtQuerystatisticsMemory(),
    public var aperture: UInt = 0u,
    public var totalBytesEvictedByPriority: ULongArray = ULongArray(5),
    public var systemMemoryEndAddress: ULong = 0uL,
    public var powerFlags: D3dkmtQuerystatisticsSegmentInformation0 = D3dkmtQuerystatisticsSegmentInformation0(),
    public var segmentProperties: D3dkmtQuerystatisticsSegmentInformation1 = D3dkmtQuerystatisticsSegmentInformation1(),
    public var reserved: ULongArray = ULongArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQuerystatisticsSegmentInformation) return false
        if (this.commitLimit != other.commitLimit) return false
        if (this.bytesCommitted != other.bytesCommitted) return false
        if (this.bytesResident != other.bytesResident) return false
        if (this.memory != other.memory) return false
        if (this.aperture != other.aperture) return false
        if (!this.totalBytesEvictedByPriority.contentEquals(other.totalBytesEvictedByPriority)) return false
        if (this.systemMemoryEndAddress != other.systemMemoryEndAddress) return false
        if (this.powerFlags != other.powerFlags) return false
        if (this.segmentProperties != other.segmentProperties) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.commitLimit.hashCode()
        result = 31 * result + this.bytesCommitted.hashCode()
        result = 31 * result + this.bytesResident.hashCode()
        result = 31 * result + this.memory.hashCode()
        result = 31 * result + this.aperture.hashCode()
        result = 31 * result + this.totalBytesEvictedByPriority.contentHashCode()
        result = 31 * result + this.systemMemoryEndAddress.hashCode()
        result = 31 * result + this.powerFlags.hashCode()
        result = 31 * result + this.segmentProperties.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsSegmentInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsSegmentInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 152L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsSegmentInformation =
                    D3dkmtQuerystatisticsSegmentInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (D3dkmtQuerystatisticsMemory.typeLayout()).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (5).toInt())
                        ).readNative(addr + 48L).toULongArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (D3dkmtQuerystatisticsSegmentInformation0.typeLayout()).readNative(addr + 96L),
                        (D3dkmtQuerystatisticsSegmentInformation1.typeLayout()).readNative(addr + 104L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (5).toInt())
                        ).readNative(addr + 112L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsSegmentInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.commitLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.bytesCommitted)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.bytesResident)
                    (D3dkmtQuerystatisticsMemory.typeLayout()).writeNative(addr + 24L, value.memory)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.aperture)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (5).toInt())
                    ).writeNative(addr + 48L, value.totalBytesEvictedByPriority.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.systemMemoryEndAddress)
                    (D3dkmtQuerystatisticsSegmentInformation0.typeLayout()).writeNative(addr + 96L, value.powerFlags)
                    (D3dkmtQuerystatisticsSegmentInformation1.typeLayout()).writeNative(addr + 104L, value.segmentProperties)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (5).toInt())
                    ).writeNative(addr + 112L, value.reserved.toList())
                }
            }
    }
}

public data class D3dkmtQuerystatisticsSegmentInformation0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsSegmentInformation0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsSegmentInformation0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsSegmentInformation0 =
                    D3dkmtQuerystatisticsSegmentInformation0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsSegmentInformation0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtQuerystatisticsSegmentInformation1(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsSegmentInformation1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsSegmentInformation1> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsSegmentInformation1 =
                    D3dkmtQuerystatisticsSegmentInformation1(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsSegmentInformation1) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtQuerystatisticsSystemMemory(
    public var bytesAllocated: ULong = 0uL,
    public var bytesReserved: ULong = 0uL,
    public var smallAllocationBlocks: UInt = 0u,
    public var largeAllocationBlocks: UInt = 0u,
    public var writeCombinedBytesAllocated: ULong = 0uL,
    public var writeCombinedBytesReserved: ULong = 0uL,
    public var cachedBytesAllocated: ULong = 0uL,
    public var cachedBytesReserved: ULong = 0uL,
    public var sectionBytesAllocated: ULong = 0uL,
    public var sectionBytesReserved: ULong = 0uL,
    public var bytesZeroed: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsSystemMemory> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsSystemMemory> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsSystemMemory =
                    D3dkmtQuerystatisticsSystemMemory(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsSystemMemory) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bytesAllocated)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.bytesReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.smallAllocationBlocks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.largeAllocationBlocks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.writeCombinedBytesAllocated)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.writeCombinedBytesReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.cachedBytesAllocated)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.cachedBytesReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.sectionBytesAllocated)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.sectionBytesReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.bytesZeroed)
                }
            }
    }
}

public data class D3dkmtQuerystatisticsVideoMemory(
    public var allocsCommitted: UInt = 0u,
    public var allocsResidentInP: List<D3dkmtQuerystatisticsCounter> = List(5) { D3dkmtQuerystatisticsCounter() },
    public var allocsResidentInNonPreferred: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var totalBytesEvictedDueToPreparation: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsVideoMemory> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsVideoMemory> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 112L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsVideoMemory =
                    D3dkmtQuerystatisticsVideoMemory(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(D3dkmtQuerystatisticsCounter.typeLayout(), (5).toInt())
                        ).readNative(addr + 8L),
                        (D3dkmtQuerystatisticsCounter.typeLayout()).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsVideoMemory) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.allocsCommitted)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(D3dkmtQuerystatisticsCounter.typeLayout(), (5).toInt())
                    ).writeNative(addr + 8L, value.allocsResidentInP)
                    (D3dkmtQuerystatisticsCounter.typeLayout()).writeNative(addr + 88L, value.allocsResidentInNonPreferred)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.totalBytesEvictedDueToPreparation)
                }
            }
    }
}

public data class D3dkmtQuerystatisticsVidpnsourceInformation(
    public var globalInformation: D3dkmtQuerystatisticsProcessVidpnsourceInformation = D3dkmtQuerystatisticsProcessVidpnsourceInformation(),
    public var systemInformation: D3dkmtQuerystatisticsProcessVidpnsourceInformation = D3dkmtQuerystatisticsProcessVidpnsourceInformation(),
    public var reserved: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQuerystatisticsVidpnsourceInformation) return false
        if (this.globalInformation != other.globalInformation) return false
        if (this.systemInformation != other.systemInformation) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.globalInformation.hashCode()
        result = 31 * result + this.systemInformation.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsVidpnsourceInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatisticsVidpnsourceInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 224L
                override fun readNative(addr: Long): D3dkmtQuerystatisticsVidpnsourceInformation =
                    D3dkmtQuerystatisticsVidpnsourceInformation(
                        (D3dkmtQuerystatisticsProcessVidpnsourceInformation.typeLayout()).readNative(addr),
                        (D3dkmtQuerystatisticsProcessVidpnsourceInformation.typeLayout()).readNative(addr + 80L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (8).toInt())
                        ).readNative(addr + 160L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatisticsVidpnsourceInformation) {
                    (D3dkmtQuerystatisticsProcessVidpnsourceInformation.typeLayout()).writeNative(addr, value.globalInformation)
                    (D3dkmtQuerystatisticsProcessVidpnsourceInformation.typeLayout()).writeNative(addr + 80L, value.systemInformation)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (8).toInt())
                    ).writeNative(addr + 160L, value.reserved.toList())
                }
            }
    }
}

public data class D3dkmtQuerystatsticsAllocations(
    public var created: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var destroyed: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var opened: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var closed: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var migratedSuccess: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var migratedFail: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var migratedAbandoned: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatsticsAllocations> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatsticsAllocations> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 112L
                override fun readNative(addr: Long): D3dkmtQuerystatsticsAllocations =
                    D3dkmtQuerystatsticsAllocations(
                        (D3dkmtQuerystatisticsCounter.typeLayout()).readNative(addr),
                        (D3dkmtQuerystatisticsCounter.typeLayout()).readNative(addr + 16L),
                        (D3dkmtQuerystatisticsCounter.typeLayout()).readNative(addr + 32L),
                        (D3dkmtQuerystatisticsCounter.typeLayout()).readNative(addr + 48L),
                        (D3dkmtQuerystatisticsCounter.typeLayout()).readNative(addr + 64L),
                        (D3dkmtQuerystatisticsCounter.typeLayout()).readNative(addr + 80L),
                        (D3dkmtQuerystatisticsCounter.typeLayout()).readNative(addr + 96L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatsticsAllocations) {
                    (D3dkmtQuerystatisticsCounter.typeLayout()).writeNative(addr, value.created)
                    (D3dkmtQuerystatisticsCounter.typeLayout()).writeNative(addr + 16L, value.destroyed)
                    (D3dkmtQuerystatisticsCounter.typeLayout()).writeNative(addr + 32L, value.opened)
                    (D3dkmtQuerystatisticsCounter.typeLayout()).writeNative(addr + 48L, value.closed)
                    (D3dkmtQuerystatisticsCounter.typeLayout()).writeNative(addr + 64L, value.migratedSuccess)
                    (D3dkmtQuerystatisticsCounter.typeLayout()).writeNative(addr + 80L, value.migratedFail)
                    (D3dkmtQuerystatisticsCounter.typeLayout()).writeNative(addr + 96L, value.migratedAbandoned)
                }
            }
    }
}

public data class D3dkmtQuerystatsticsLocks(
    public var nbLocks: UInt = 0u,
    public var nbLocksWaitFlag: UInt = 0u,
    public var nbLocksDiscardFlag: UInt = 0u,
    public var nbLocksNoOverwrite: UInt = 0u,
    public var nbLocksNoReadSync: UInt = 0u,
    public var nbLocksLinearization: UInt = 0u,
    public var nbComplexLocks: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatsticsLocks> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatsticsLocks> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): D3dkmtQuerystatsticsLocks =
                    D3dkmtQuerystatsticsLocks(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatsticsLocks) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nbLocks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nbLocksWaitFlag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nbLocksDiscardFlag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.nbLocksNoOverwrite)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.nbLocksNoReadSync)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.nbLocksLinearization)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.nbComplexLocks)
                }
            }
    }
}

public class D3dkmtQuerystatsticsPagingFault(
    public var faults: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var faultsFirstTimeAccess: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var faultsReclaimed: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var faultsMigration: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var faultsIncorrectResource: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var faultsLostContent: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var faultsEvicted: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var allocationsMemReset: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var allocationsUnresetSuccess: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var allocationsUnresetFail: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var allocationsUnresetSuccessRead: UInt = 0u,
    public var allocationsUnresetFailRead: UInt = 0u,
    public var evictions: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var evictionsDueToPreparation: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var evictionsDueToLock: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var evictionsDueToClose: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var evictionsDueToPurge: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var evictionsDueToSuspendCPUAccess: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatsticsPagingFault> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatsticsPagingFault> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 264L
                override fun readNative(addr: Long): D3dkmtQuerystatsticsPagingFault =
                    D3dkmtQuerystatsticsPagingFault(
                        (D3dkmtQuerystatisticsCounter.typeLayout()).readNative(addr),
                        (D3dkmtQuerystatisticsCounter.typeLayout()).readNative(addr + 16L),
                        (D3dkmtQuerystatisticsCounter.typeLayout()).readNative(addr + 32L),
                        (D3dkmtQuerystatisticsCounter.typeLayout()).readNative(addr + 48L),
                        (D3dkmtQuerystatisticsCounter.typeLayout()).readNative(addr + 64L),
                        (D3dkmtQuerystatisticsCounter.typeLayout()).readNative(addr + 80L),
                        (D3dkmtQuerystatisticsCounter.typeLayout()).readNative(addr + 96L),
                        (D3dkmtQuerystatisticsCounter.typeLayout()).readNative(addr + 112L),
                        (D3dkmtQuerystatisticsCounter.typeLayout()).readNative(addr + 128L),
                        (D3dkmtQuerystatisticsCounter.typeLayout()).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 164L),
                        (D3dkmtQuerystatisticsCounter.typeLayout()).readNative(addr + 168L),
                        (D3dkmtQuerystatisticsCounter.typeLayout()).readNative(addr + 184L),
                        (D3dkmtQuerystatisticsCounter.typeLayout()).readNative(addr + 200L),
                        (D3dkmtQuerystatisticsCounter.typeLayout()).readNative(addr + 216L),
                        (D3dkmtQuerystatisticsCounter.typeLayout()).readNative(addr + 232L),
                        (D3dkmtQuerystatisticsCounter.typeLayout()).readNative(addr + 248L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatsticsPagingFault) {
                    (D3dkmtQuerystatisticsCounter.typeLayout()).writeNative(addr, value.faults)
                    (D3dkmtQuerystatisticsCounter.typeLayout()).writeNative(addr + 16L, value.faultsFirstTimeAccess)
                    (D3dkmtQuerystatisticsCounter.typeLayout()).writeNative(addr + 32L, value.faultsReclaimed)
                    (D3dkmtQuerystatisticsCounter.typeLayout()).writeNative(addr + 48L, value.faultsMigration)
                    (D3dkmtQuerystatisticsCounter.typeLayout()).writeNative(addr + 64L, value.faultsIncorrectResource)
                    (D3dkmtQuerystatisticsCounter.typeLayout()).writeNative(addr + 80L, value.faultsLostContent)
                    (D3dkmtQuerystatisticsCounter.typeLayout()).writeNative(addr + 96L, value.faultsEvicted)
                    (D3dkmtQuerystatisticsCounter.typeLayout()).writeNative(addr + 112L, value.allocationsMemReset)
                    (D3dkmtQuerystatisticsCounter.typeLayout()).writeNative(addr + 128L, value.allocationsUnresetSuccess)
                    (D3dkmtQuerystatisticsCounter.typeLayout()).writeNative(addr + 144L, value.allocationsUnresetFail)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 160L, value.allocationsUnresetSuccessRead)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 164L, value.allocationsUnresetFailRead)
                    (D3dkmtQuerystatisticsCounter.typeLayout()).writeNative(addr + 168L, value.evictions)
                    (D3dkmtQuerystatisticsCounter.typeLayout()).writeNative(addr + 184L, value.evictionsDueToPreparation)
                    (D3dkmtQuerystatisticsCounter.typeLayout()).writeNative(addr + 200L, value.evictionsDueToLock)
                    (D3dkmtQuerystatisticsCounter.typeLayout()).writeNative(addr + 216L, value.evictionsDueToClose)
                    (D3dkmtQuerystatisticsCounter.typeLayout()).writeNative(addr + 232L, value.evictionsDueToPurge)
                    (D3dkmtQuerystatisticsCounter.typeLayout()).writeNative(addr + 248L, value.evictionsDueToSuspendCPUAccess)
                }
            }
    }
}

public data class D3dkmtQuerystatsticsPagingTransfer(
    public var bytesFilled: ULong = 0uL,
    public var bytesDiscarded: ULong = 0uL,
    public var bytesMappedIntoAperture: ULong = 0uL,
    public var bytesUnmappedFromAperture: ULong = 0uL,
    public var bytesTransferredFromMdlToMemory: ULong = 0uL,
    public var bytesTransferredFromMemoryToMdl: ULong = 0uL,
    public var bytesTransferredFromApertureToMemory: ULong = 0uL,
    public var bytesTransferredFromMemoryToAperture: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatsticsPagingTransfer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatsticsPagingTransfer> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): D3dkmtQuerystatsticsPagingTransfer =
                    D3dkmtQuerystatsticsPagingTransfer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatsticsPagingTransfer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bytesFilled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.bytesDiscarded)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.bytesMappedIntoAperture)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.bytesUnmappedFromAperture)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.bytesTransferredFromMdlToMemory)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.bytesTransferredFromMemoryToMdl)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.bytesTransferredFromApertureToMemory)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.bytesTransferredFromMemoryToAperture)
                }
            }
    }
}

public data class D3dkmtQuerystatsticsPrepration(
    public var broadcastStall: UInt = 0u,
    public var nbDMAPrepared: UInt = 0u,
    public var nbDMAPreparedLongPath: UInt = 0u,
    public var immediateHighestPreparationPass: UInt = 0u,
    public var allocationsTrimmed: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatsticsPrepration> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatsticsPrepration> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): D3dkmtQuerystatsticsPrepration =
                    D3dkmtQuerystatsticsPrepration(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (D3dkmtQuerystatisticsCounter.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatsticsPrepration) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.broadcastStall)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nbDMAPrepared)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nbDMAPreparedLongPath)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.immediateHighestPreparationPass)
                    (D3dkmtQuerystatisticsCounter.typeLayout()).writeNative(addr + 16L, value.allocationsTrimmed)
                }
            }
    }
}

public data class D3dkmtQuerystatsticsReferenceDmaBuffer(
    public var nbCall: UInt = 0u,
    public var nbAllocationsReferenced: UInt = 0u,
    public var maxNbAllocationsReferenced: UInt = 0u,
    public var nbNULLReference: UInt = 0u,
    public var nbWriteReference: UInt = 0u,
    public var nbRenamedAllocationsReferenced: UInt = 0u,
    public var nbIterationSearchingRenamedAllocation: UInt = 0u,
    public var nbLockedAllocationReferenced: UInt = 0u,
    public var nbAllocationWithValidPrepatchingInfoReferenced: UInt = 0u,
    public var nbAllocationWithInvalidPrepatchingInfoReferenced: UInt = 0u,
    public var nbDMABufferSuccessfullyPrePatched: UInt = 0u,
    public var nbPrimariesReferencesOverflow: UInt = 0u,
    public var nbAllocationWithNonPreferredResources: UInt = 0u,
    public var nbAllocationInsertedInMigrationTable: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatsticsReferenceDmaBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatsticsReferenceDmaBuffer> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): D3dkmtQuerystatsticsReferenceDmaBuffer =
                    D3dkmtQuerystatsticsReferenceDmaBuffer(
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatsticsReferenceDmaBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nbCall)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nbAllocationsReferenced)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.maxNbAllocationsReferenced)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.nbNULLReference)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.nbWriteReference)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.nbRenamedAllocationsReferenced)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.nbIterationSearchingRenamedAllocation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.nbLockedAllocationReferenced)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.nbAllocationWithValidPrepatchingInfoReferenced)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.nbAllocationWithInvalidPrepatchingInfoReferenced)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.nbDMABufferSuccessfullyPrePatched)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.nbPrimariesReferencesOverflow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.nbAllocationWithNonPreferredResources)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.nbAllocationInsertedInMigrationTable)
                }
            }
    }
}

public data class D3dkmtQuerystatsticsRenaming(
    public var nbAllocationsRenamed: UInt = 0u,
    public var nbAllocationsShrinked: UInt = 0u,
    public var nbRenamedBuffer: UInt = 0u,
    public var maxRenamingListLength: UInt = 0u,
    public var nbFailuresDueToRenamingLimit: UInt = 0u,
    public var nbFailuresDueToCreateAllocation: UInt = 0u,
    public var nbFailuresDueToOpenAllocation: UInt = 0u,
    public var nbFailuresDueToLowResource: UInt = 0u,
    public var nbFailuresDueToNonRetiredLimit: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatsticsRenaming> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatsticsRenaming> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): D3dkmtQuerystatsticsRenaming =
                    D3dkmtQuerystatsticsRenaming(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatsticsRenaming) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nbAllocationsRenamed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nbAllocationsShrinked)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nbRenamedBuffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.maxRenamingListLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.nbFailuresDueToRenamingLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.nbFailuresDueToCreateAllocation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.nbFailuresDueToOpenAllocation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.nbFailuresDueToLowResource)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.nbFailuresDueToNonRetiredLimit)
                }
            }
    }
}

public data class D3dkmtQuerystatsticsSwizzlingRange(
    public var nbRangesAcquired: UInt = 0u,
    public var nbRangesReleased: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatsticsSwizzlingRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatsticsSwizzlingRange> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtQuerystatsticsSwizzlingRange =
                    D3dkmtQuerystatsticsSwizzlingRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatsticsSwizzlingRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nbRangesAcquired)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nbRangesReleased)
                }
            }
    }
}

public data class D3dkmtQuerystatsticsTerminations(
    public var terminatedShared: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var terminatedNonShared: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var destroyedShared: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
    public var destroyedNonShared: D3dkmtQuerystatisticsCounter = D3dkmtQuerystatisticsCounter(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatsticsTerminations> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQuerystatsticsTerminations> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): D3dkmtQuerystatsticsTerminations =
                    D3dkmtQuerystatsticsTerminations(
                        (D3dkmtQuerystatisticsCounter.typeLayout()).readNative(addr),
                        (D3dkmtQuerystatisticsCounter.typeLayout()).readNative(addr + 16L),
                        (D3dkmtQuerystatisticsCounter.typeLayout()).readNative(addr + 32L),
                        (D3dkmtQuerystatisticsCounter.typeLayout()).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQuerystatsticsTerminations) {
                    (D3dkmtQuerystatisticsCounter.typeLayout()).writeNative(addr, value.terminatedShared)
                    (D3dkmtQuerystatisticsCounter.typeLayout()).writeNative(addr + 16L, value.terminatedNonShared)
                    (D3dkmtQuerystatisticsCounter.typeLayout()).writeNative(addr + 32L, value.destroyedShared)
                    (D3dkmtQuerystatisticsCounter.typeLayout()).writeNative(addr + 48L, value.destroyedNonShared)
                }
            }
    }
}

public class D3dkmtQueryvideomemoryinfo internal constructor(
    hProcessCtorArg: Handle,
    public var hAdapter: UInt,
    public var memorySegmentGroup: D3dkmtMemorySegmentGroup,
    public var budget: ULong,
    public var currentUsage: ULong,
    public var currentReservation: ULong,
    public var availableForReservation: ULong,
    public var physicalAdapterIndex: UInt,
) {
    public var hProcess: Handle = hProcessCtorArg
        internal set

    public constructor() : this(
        hProcessCtorArg = MutPtr(0L),
        hAdapter = 0u,
        memorySegmentGroup = 0,
        budget = 0uL,
        currentUsage = 0uL,
        currentReservation = 0uL,
        availableForReservation = 0uL,
        physicalAdapterIndex = 0u,
    )

    public operator fun component1(): Handle = this.hProcess

    public operator fun component2(): UInt = this.hAdapter

    public operator fun component3(): D3dkmtMemorySegmentGroup = this.memorySegmentGroup

    public operator fun component4(): ULong = this.budget

    public operator fun component5(): ULong = this.currentUsage

    public operator fun component6(): ULong = this.currentReservation

    public operator fun component7(): ULong = this.availableForReservation

    public operator fun component8(): UInt = this.physicalAdapterIndex

    public fun copy(hProcess: Handle = this.hProcess, hAdapter: UInt = this.hAdapter, memorySegmentGroup: D3dkmtMemorySegmentGroup = this.memorySegmentGroup, budget: ULong = this.budget, currentUsage: ULong = this.currentUsage, currentReservation: ULong = this.currentReservation, availableForReservation: ULong = this.availableForReservation, physicalAdapterIndex: UInt = this.physicalAdapterIndex): D3dkmtQueryvideomemoryinfo = D3dkmtQueryvideomemoryinfo(hProcessCtorArg = hProcess, hAdapter = hAdapter, memorySegmentGroup = memorySegmentGroup, budget = budget, currentUsage = currentUsage, currentReservation = currentReservation, availableForReservation = availableForReservation, physicalAdapterIndex = physicalAdapterIndex)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQueryvideomemoryinfo) return false
        if (this.hProcess != other.hProcess) return false
        if (this.hAdapter != other.hAdapter) return false
        if (this.memorySegmentGroup != other.memorySegmentGroup) return false
        if (this.budget != other.budget) return false
        if (this.currentUsage != other.currentUsage) return false
        if (this.currentReservation != other.currentReservation) return false
        if (this.availableForReservation != other.availableForReservation) return false
        if (this.physicalAdapterIndex != other.physicalAdapterIndex) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hProcess.hashCode()
        result = 31 * result + this.hAdapter.hashCode()
        result = 31 * result + this.memorySegmentGroup.hashCode()
        result = 31 * result + this.budget.hashCode()
        result = 31 * result + this.currentUsage.hashCode()
        result = 31 * result + this.currentReservation.hashCode()
        result = 31 * result + this.availableForReservation.hashCode()
        result = 31 * result + this.physicalAdapterIndex.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hProcess: Handle = MutPtr(0L),
            hAdapter: UInt = 0u,
            memorySegmentGroup: D3dkmtMemorySegmentGroup = 0,
            budget: ULong = 0uL,
            currentUsage: ULong = 0uL,
            currentReservation: ULong = 0uL,
            availableForReservation: ULong = 0uL,
            physicalAdapterIndex: UInt = 0u,
        ): D3dkmtQueryvideomemoryinfo =
            D3dkmtQueryvideomemoryinfo(
                hProcessCtorArg = hProcess,
                hAdapter = hAdapter,
                memorySegmentGroup = memorySegmentGroup,
                budget = budget,
                currentUsage = currentUsage,
                currentReservation = currentReservation,
                availableForReservation = availableForReservation,
                physicalAdapterIndex = physicalAdapterIndex,
            )
    }
}

public class D3dkmtQueryvidpnexclusiveownership internal constructor(
    hProcessCtorArg: Handle,
    hWindowCtorArg: Hwnd,
    public var vidPnSourceId: UInt,
    public var adapterLuid: Luid,
    public var ownerType: D3dkmtVidpnsourceownerType,
) {
    public var hProcess: Handle = hProcessCtorArg
        internal set

    public var hWindow: Hwnd = hWindowCtorArg
        internal set

    public constructor() : this(
        hProcessCtorArg = MutPtr(0L),
        hWindowCtorArg = MutPtr(0L),
        vidPnSourceId = 0u,
        adapterLuid = Luid(),
        ownerType = 0,
    )

    public operator fun component1(): Handle = this.hProcess

    public operator fun component2(): Hwnd = this.hWindow

    public operator fun component3(): UInt = this.vidPnSourceId

    public operator fun component4(): Luid = this.adapterLuid

    public operator fun component5(): D3dkmtVidpnsourceownerType = this.ownerType

    public fun copy(hProcess: Handle = this.hProcess, hWindow: Hwnd = this.hWindow, vidPnSourceId: UInt = this.vidPnSourceId, adapterLuid: Luid = this.adapterLuid, ownerType: D3dkmtVidpnsourceownerType = this.ownerType): D3dkmtQueryvidpnexclusiveownership = D3dkmtQueryvidpnexclusiveownership(hProcessCtorArg = hProcess, hWindowCtorArg = hWindow, vidPnSourceId = vidPnSourceId, adapterLuid = adapterLuid, ownerType = ownerType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQueryvidpnexclusiveownership) return false
        if (this.hProcess != other.hProcess) return false
        if (this.hWindow != other.hWindow) return false
        if (this.vidPnSourceId != other.vidPnSourceId) return false
        if (this.adapterLuid != other.adapterLuid) return false
        if (this.ownerType != other.ownerType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hProcess.hashCode()
        result = 31 * result + this.hWindow.hashCode()
        result = 31 * result + this.vidPnSourceId.hashCode()
        result = 31 * result + this.adapterLuid.hashCode()
        result = 31 * result + this.ownerType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hProcess: Handle = MutPtr(0L),
            hWindow: Hwnd = MutPtr(0L),
            vidPnSourceId: UInt = 0u,
            adapterLuid: Luid = Luid(),
            ownerType: D3dkmtVidpnsourceownerType = 0,
        ): D3dkmtQueryvidpnexclusiveownership =
            D3dkmtQueryvidpnexclusiveownership(
                hProcessCtorArg = hProcess,
                hWindowCtorArg = hWindow,
                vidPnSourceId = vidPnSourceId,
                adapterLuid = adapterLuid,
                ownerType = ownerType,
            )
    }
}

public data class D3dkmtQueryAdapterUniqueGuid(
    public var adapterUniqueGUID: UShortArray = UShortArray(40),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQueryAdapterUniqueGuid) return false
        if (!this.adapterUniqueGUID.contentEquals(other.adapterUniqueGUID)) return false
        return true
    }

    override fun hashCode(): Int = this.adapterUniqueGUID.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQueryAdapterUniqueGuid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQueryAdapterUniqueGuid> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): D3dkmtQueryAdapterUniqueGuid =
                    D3dkmtQueryAdapterUniqueGuid(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (40).toInt())
                        ).readNative(addr).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQueryAdapterUniqueGuid) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (40).toInt())
                    ).writeNative(addr, value.adapterUniqueGUID.toList())
                }
            }
    }
}

public data class D3dkmtQueryDeviceIds(
    public var physicalAdapterIndex: UInt = 0u,
    public var deviceIds: D3dkmtDeviceIds = D3dkmtDeviceIds(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQueryDeviceIds> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQueryDeviceIds> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): D3dkmtQueryDeviceIds =
                    D3dkmtQueryDeviceIds(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (D3dkmtDeviceIds.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQueryDeviceIds) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.physicalAdapterIndex)
                    (D3dkmtDeviceIds.typeLayout()).writeNative(addr + 4L, value.deviceIds)
                }
            }
    }
}

public data class D3dkmtQueryGpummuCaps(
    public var physicalAdapterIndex: UInt = 0u,
    public var caps: D3dkmtGpummuCaps = D3dkmtGpummuCaps(),
)

public data class D3dkmtQueryMiracastDriverType(
    public var miracastDriverType: D3dkmtMiracastDriverType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQueryMiracastDriverType> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQueryMiracastDriverType> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtQueryMiracastDriverType =
                    D3dkmtQueryMiracastDriverType(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQueryMiracastDriverType) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.miracastDriverType)
                }
            }
    }
}

public class D3dkmtQueryPhysicalAdapterPnpKey internal constructor(
    public var physicalAdapterIndex: UInt,
    public var pnPKeyType: D3dkmtPnpKeyType,
    pDestCtorArg: Pwstr,
    pCchDestCtorArg: MutPtr,
) {
    public var pDest: Pwstr = pDestCtorArg
        internal set

    public var pCchDest: MutPtr = pCchDestCtorArg
        internal set

    public constructor() : this(
        physicalAdapterIndex = 0u,
        pnPKeyType = 0,
        pDestCtorArg = MutPtr(0L),
        pCchDestCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.physicalAdapterIndex

    public operator fun component2(): D3dkmtPnpKeyType = this.pnPKeyType

    public operator fun component3(): Pwstr = this.pDest

    public operator fun component4(): MutPtr = this.pCchDest

    public fun copy(physicalAdapterIndex: UInt = this.physicalAdapterIndex, pnPKeyType: D3dkmtPnpKeyType = this.pnPKeyType, pDest: Pwstr = this.pDest, pCchDest: MutPtr = this.pCchDest): D3dkmtQueryPhysicalAdapterPnpKey = D3dkmtQueryPhysicalAdapterPnpKey(physicalAdapterIndex = physicalAdapterIndex, pnPKeyType = pnPKeyType, pDestCtorArg = pDest, pCchDestCtorArg = pCchDest)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtQueryPhysicalAdapterPnpKey) return false
        if (this.physicalAdapterIndex != other.physicalAdapterIndex) return false
        if (this.pnPKeyType != other.pnPKeyType) return false
        if (this.pDest != other.pDest) return false
        if (this.pCchDest != other.pCchDest) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.physicalAdapterIndex.hashCode()
        result = 31 * result + this.pnPKeyType.hashCode()
        result = 31 * result + this.pDest.hashCode()
        result = 31 * result + this.pCchDest.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            physicalAdapterIndex: UInt = 0u,
            pnPKeyType: D3dkmtPnpKeyType = 0,
            pDest: Pwstr = MutPtr(0L),
            pCchDest: MutPtr = MutPtr(0L),
        ): D3dkmtQueryPhysicalAdapterPnpKey =
            D3dkmtQueryPhysicalAdapterPnpKey(
                physicalAdapterIndex = physicalAdapterIndex,
                pnPKeyType = pnPKeyType,
                pDestCtorArg = pDest,
                pCchDestCtorArg = pCchDest,
            )
    }
}

public data class D3dkmtQueryScanoutCaps(
    public var vidPnSourceId: UInt = 0u,
    public var caps: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQueryScanoutCaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtQueryScanoutCaps> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtQueryScanoutCaps =
                    D3dkmtQueryScanoutCaps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtQueryScanoutCaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.vidPnSourceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.caps)
                }
            }
    }
}

public class D3dkmtReclaimallocations internal constructor(
    public var hDevice: UInt,
    pResourcesCtorArg: MutPtr,
    handleListCtorArg: ConstPtr,
    pDiscardedCtorArg: MutPtr,
    public var numAllocations: UInt,
) {
    public var pResources: MutPtr = pResourcesCtorArg
        internal set

    public var handleList: ConstPtr = handleListCtorArg
        internal set

    public var pDiscarded: MutPtr = pDiscardedCtorArg
        internal set

    public constructor() : this(
        hDevice = 0u,
        pResourcesCtorArg = MutPtr(0L),
        handleListCtorArg = ConstPtr(0L),
        pDiscardedCtorArg = MutPtr(0L),
        numAllocations = 0u,
    )

    public operator fun component1(): UInt = this.hDevice

    public operator fun component2(): MutPtr = this.pResources

    public operator fun component3(): ConstPtr = this.handleList

    public operator fun component4(): MutPtr = this.pDiscarded

    public operator fun component5(): UInt = this.numAllocations

    public fun copy(hDevice: UInt = this.hDevice, pResources: MutPtr = this.pResources, handleList: ConstPtr = this.handleList, pDiscarded: MutPtr = this.pDiscarded, numAllocations: UInt = this.numAllocations): D3dkmtReclaimallocations = D3dkmtReclaimallocations(hDevice = hDevice, pResourcesCtorArg = pResources, handleListCtorArg = handleList, pDiscardedCtorArg = pDiscarded, numAllocations = numAllocations)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtReclaimallocations) return false
        if (this.hDevice != other.hDevice) return false
        if (this.pResources != other.pResources) return false
        if (this.handleList != other.handleList) return false
        if (this.pDiscarded != other.pDiscarded) return false
        if (this.numAllocations != other.numAllocations) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDevice.hashCode()
        result = 31 * result + this.pResources.hashCode()
        result = 31 * result + this.handleList.hashCode()
        result = 31 * result + this.pDiscarded.hashCode()
        result = 31 * result + this.numAllocations.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtReclaimallocations> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtReclaimallocations> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): D3dkmtReclaimallocations =
                    D3dkmtReclaimallocations(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtReclaimallocations) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hDevice)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pResources)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr + 16L, value.handleList)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.pDiscarded)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.numAllocations)
                }
            }

        public operator fun invoke(
            hDevice: UInt = 0u,
            pResources: MutPtr = MutPtr(0L),
            handleList: ConstPtr = ConstPtr(0L),
            pDiscarded: MutPtr = MutPtr(0L),
            numAllocations: UInt = 0u,
        ): D3dkmtReclaimallocations =
            D3dkmtReclaimallocations(
                hDevice = hDevice,
                pResourcesCtorArg = pResources,
                handleListCtorArg = handleList,
                pDiscardedCtorArg = pDiscarded,
                numAllocations = numAllocations,
            )
    }
}

public class D3dkmtReclaimallocations2 internal constructor(
    public var hPagingQueue: UInt,
    public var numAllocations: UInt,
    pResourcesCtorArg: MutPtr,
    handleListCtorArg: ConstPtr,
    public var anonymous: D3dkmtReclaimallocations20,
    public var pagingFenceValue: ULong,
) {
    public var pResources: MutPtr = pResourcesCtorArg
        internal set

    public var handleList: ConstPtr = handleListCtorArg
        internal set

    public constructor() : this(
        hPagingQueue = 0u,
        numAllocations = 0u,
        pResourcesCtorArg = MutPtr(0L),
        handleListCtorArg = ConstPtr(0L),
        anonymous = D3dkmtReclaimallocations20(),
        pagingFenceValue = 0uL,
    )

    public operator fun component1(): UInt = this.hPagingQueue

    public operator fun component2(): UInt = this.numAllocations

    public operator fun component3(): MutPtr = this.pResources

    public operator fun component4(): ConstPtr = this.handleList

    public operator fun component5(): D3dkmtReclaimallocations20 = this.anonymous

    public operator fun component6(): ULong = this.pagingFenceValue

    public fun copy(hPagingQueue: UInt = this.hPagingQueue, numAllocations: UInt = this.numAllocations, pResources: MutPtr = this.pResources, handleList: ConstPtr = this.handleList, anonymous: D3dkmtReclaimallocations20 = this.anonymous, pagingFenceValue: ULong = this.pagingFenceValue): D3dkmtReclaimallocations2 = D3dkmtReclaimallocations2(hPagingQueue = hPagingQueue, numAllocations = numAllocations, pResourcesCtorArg = pResources, handleListCtorArg = handleList, anonymous = anonymous, pagingFenceValue = pagingFenceValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtReclaimallocations2) return false
        if (this.hPagingQueue != other.hPagingQueue) return false
        if (this.numAllocations != other.numAllocations) return false
        if (this.pResources != other.pResources) return false
        if (this.handleList != other.handleList) return false
        if (this.anonymous != other.anonymous) return false
        if (this.pagingFenceValue != other.pagingFenceValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hPagingQueue.hashCode()
        result = 31 * result + this.numAllocations.hashCode()
        result = 31 * result + this.pResources.hashCode()
        result = 31 * result + this.handleList.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.pagingFenceValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hPagingQueue: UInt = 0u,
            numAllocations: UInt = 0u,
            pResources: MutPtr = MutPtr(0L),
            handleList: ConstPtr = ConstPtr(0L),
            anonymous: D3dkmtReclaimallocations20 = D3dkmtReclaimallocations20(),
            pagingFenceValue: ULong = 0uL,
        ): D3dkmtReclaimallocations2 =
            D3dkmtReclaimallocations2(
                hPagingQueue = hPagingQueue,
                numAllocations = numAllocations,
                pResourcesCtorArg = pResources,
                handleListCtorArg = handleList,
                anonymous = anonymous,
                pagingFenceValue = pagingFenceValue,
            )
    }
}

public class D3dkmtReclaimallocations20 internal constructor(
    pDiscardedCtorArg: MutPtr,
    pResultsCtorArg: MutPtr,
) {
    public var pDiscarded: MutPtr = pDiscardedCtorArg
        internal set

    public var pResults: MutPtr = pResultsCtorArg
        internal set

    public constructor() : this(
        pDiscardedCtorArg = MutPtr(0L),
        pResultsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.pDiscarded

    public operator fun component2(): MutPtr = this.pResults

    public fun copy(pDiscarded: MutPtr = this.pDiscarded, pResults: MutPtr = this.pResults): D3dkmtReclaimallocations20 = D3dkmtReclaimallocations20(pDiscardedCtorArg = pDiscarded, pResultsCtorArg = pResults)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtReclaimallocations20) return false
        if (this.pDiscarded != other.pDiscarded) return false
        if (this.pResults != other.pResults) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pDiscarded.hashCode()
        result = 31 * result + this.pResults.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pDiscarded: MutPtr = MutPtr(0L),
            pResults: MutPtr = MutPtr(0L),
        ): D3dkmtReclaimallocations20 =
            D3dkmtReclaimallocations20(
                pDiscardedCtorArg = pDiscarded,
                pResultsCtorArg = pResults,
            )
    }
}

public class D3dkmtRegisterbudgetchangenotification internal constructor(
    public var hDevice: UInt,
    public var callback: Pfnd3dkmtBudgetchangenotificationcallback,
    contextCtorArg: MutPtr,
    handleCtorArg: MutPtr,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public var handle: MutPtr = handleCtorArg
        internal set

    public constructor() : this(
        hDevice = 0u,
        callback = null,
        contextCtorArg = MutPtr(0L),
        handleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.hDevice

    public operator fun component2(): Pfnd3dkmtBudgetchangenotificationcallback = this.callback

    public operator fun component3(): MutPtr = this.context

    public operator fun component4(): MutPtr = this.handle

    public fun copy(hDevice: UInt = this.hDevice, callback: Pfnd3dkmtBudgetchangenotificationcallback = this.callback, context: MutPtr = this.context, handle: MutPtr = this.handle): D3dkmtRegisterbudgetchangenotification = D3dkmtRegisterbudgetchangenotification(hDevice = hDevice, callback = callback, contextCtorArg = context, handleCtorArg = handle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtRegisterbudgetchangenotification) return false
        if (this.hDevice != other.hDevice) return false
        if (this.callback != other.callback) return false
        if (this.context != other.context) return false
        if (this.handle != other.handle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDevice.hashCode()
        result = 31 * result + this.callback.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.handle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hDevice: UInt = 0u,
            callback: Pfnd3dkmtBudgetchangenotificationcallback = null,
            context: MutPtr = MutPtr(0L),
            handle: MutPtr = MutPtr(0L),
        ): D3dkmtRegisterbudgetchangenotification =
            D3dkmtRegisterbudgetchangenotification(
                hDevice = hDevice,
                callback = callback,
                contextCtorArg = context,
                handleCtorArg = handle,
            )
    }
}

public class D3dkmtRegistertrimnotification internal constructor(
    public var adapterLuid: Luid,
    public var hDevice: UInt,
    public var callback: Pfnd3dkmtTrimnotificationcallback,
    contextCtorArg: MutPtr,
    handleCtorArg: MutPtr,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public var handle: MutPtr = handleCtorArg
        internal set

    public constructor() : this(
        adapterLuid = Luid(),
        hDevice = 0u,
        callback = null,
        contextCtorArg = MutPtr(0L),
        handleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Luid = this.adapterLuid

    public operator fun component2(): UInt = this.hDevice

    public operator fun component3(): Pfnd3dkmtTrimnotificationcallback = this.callback

    public operator fun component4(): MutPtr = this.context

    public operator fun component5(): MutPtr = this.handle

    public fun copy(adapterLuid: Luid = this.adapterLuid, hDevice: UInt = this.hDevice, callback: Pfnd3dkmtTrimnotificationcallback = this.callback, context: MutPtr = this.context, handle: MutPtr = this.handle): D3dkmtRegistertrimnotification = D3dkmtRegistertrimnotification(adapterLuid = adapterLuid, hDevice = hDevice, callback = callback, contextCtorArg = context, handleCtorArg = handle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtRegistertrimnotification) return false
        if (this.adapterLuid != other.adapterLuid) return false
        if (this.hDevice != other.hDevice) return false
        if (this.callback != other.callback) return false
        if (this.context != other.context) return false
        if (this.handle != other.handle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.adapterLuid.hashCode()
        result = 31 * result + this.hDevice.hashCode()
        result = 31 * result + this.callback.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.handle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            adapterLuid: Luid = Luid(),
            hDevice: UInt = 0u,
            callback: Pfnd3dkmtTrimnotificationcallback = null,
            context: MutPtr = MutPtr(0L),
            handle: MutPtr = MutPtr(0L),
        ): D3dkmtRegistertrimnotification =
            D3dkmtRegistertrimnotification(
                adapterLuid = adapterLuid,
                hDevice = hDevice,
                callback = callback,
                contextCtorArg = context,
                handleCtorArg = handle,
            )
    }
}

public data class D3dkmtReleasekeyedmutex(
    public var hKeyedMutex: UInt = 0u,
    public var key: ULong = 0uL,
    public var fenceValue: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtReleasekeyedmutex> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtReleasekeyedmutex> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): D3dkmtReleasekeyedmutex =
                    D3dkmtReleasekeyedmutex(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtReleasekeyedmutex) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hKeyedMutex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.key)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.fenceValue)
                }
            }
    }
}

public class D3dkmtReleasekeyedmutex2 internal constructor(
    public var hKeyedMutex: UInt,
    public var key: ULong,
    public var fenceValue: ULong,
    pPrivateRuntimeDataCtorArg: MutPtr,
    public var privateRuntimeDataSize: UInt,
) {
    public var pPrivateRuntimeData: MutPtr = pPrivateRuntimeDataCtorArg
        internal set

    public constructor() : this(
        hKeyedMutex = 0u,
        key = 0uL,
        fenceValue = 0uL,
        pPrivateRuntimeDataCtorArg = MutPtr(0L),
        privateRuntimeDataSize = 0u,
    )

    public operator fun component1(): UInt = this.hKeyedMutex

    public operator fun component2(): ULong = this.key

    public operator fun component3(): ULong = this.fenceValue

    public operator fun component4(): MutPtr = this.pPrivateRuntimeData

    public operator fun component5(): UInt = this.privateRuntimeDataSize

    public fun copy(hKeyedMutex: UInt = this.hKeyedMutex, key: ULong = this.key, fenceValue: ULong = this.fenceValue, pPrivateRuntimeData: MutPtr = this.pPrivateRuntimeData, privateRuntimeDataSize: UInt = this.privateRuntimeDataSize): D3dkmtReleasekeyedmutex2 = D3dkmtReleasekeyedmutex2(hKeyedMutex = hKeyedMutex, key = key, fenceValue = fenceValue, pPrivateRuntimeDataCtorArg = pPrivateRuntimeData, privateRuntimeDataSize = privateRuntimeDataSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtReleasekeyedmutex2) return false
        if (this.hKeyedMutex != other.hKeyedMutex) return false
        if (this.key != other.key) return false
        if (this.fenceValue != other.fenceValue) return false
        if (this.pPrivateRuntimeData != other.pPrivateRuntimeData) return false
        if (this.privateRuntimeDataSize != other.privateRuntimeDataSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hKeyedMutex.hashCode()
        result = 31 * result + this.key.hashCode()
        result = 31 * result + this.fenceValue.hashCode()
        result = 31 * result + this.pPrivateRuntimeData.hashCode()
        result = 31 * result + this.privateRuntimeDataSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtReleasekeyedmutex2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtReleasekeyedmutex2> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): D3dkmtReleasekeyedmutex2 =
                    D3dkmtReleasekeyedmutex2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtReleasekeyedmutex2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hKeyedMutex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.key)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.fenceValue)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.pPrivateRuntimeData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.privateRuntimeDataSize)
                }
            }

        public operator fun invoke(
            hKeyedMutex: UInt = 0u,
            key: ULong = 0uL,
            fenceValue: ULong = 0uL,
            pPrivateRuntimeData: MutPtr = MutPtr(0L),
            privateRuntimeDataSize: UInt = 0u,
        ): D3dkmtReleasekeyedmutex2 =
            D3dkmtReleasekeyedmutex2(
                hKeyedMutex = hKeyedMutex,
                key = key,
                fenceValue = fenceValue,
                pPrivateRuntimeDataCtorArg = pPrivateRuntimeData,
                privateRuntimeDataSize = privateRuntimeDataSize,
            )
    }
}

public class D3dkmtRender internal constructor(
    public var anonymous: D3dkmtRender0,
    public var commandOffset: UInt,
    public var commandLength: UInt,
    public var allocationCount: UInt,
    public var patchLocationCount: UInt,
    pNewCommandBufferCtorArg: MutPtr,
    public var newCommandBufferSize: UInt,
    pNewAllocationListCtorArg: MutPtr,
    public var newAllocationListSize: UInt,
    pNewPatchLocationListCtorArg: MutPtr,
    public var newPatchLocationListSize: UInt,
    public var flags: D3dkmtRenderflags,
    public var presentHistoryToken: ULong,
    public var broadcastContextCount: UInt,
    public var broadcastContext: UIntArray,
    public var queuedBufferCount: UInt,
    public var newCommandBuffer: ULong,
    pPrivateDriverDataCtorArg: MutPtr,
    public var privateDriverDataSize: UInt,
) {
    public var pNewCommandBuffer: MutPtr = pNewCommandBufferCtorArg
        internal set

    public var pNewAllocationList: MutPtr = pNewAllocationListCtorArg
        internal set

    public var pNewPatchLocationList: MutPtr = pNewPatchLocationListCtorArg
        internal set

    public var pPrivateDriverData: MutPtr = pPrivateDriverDataCtorArg
        internal set

    public constructor() : this(
        anonymous = D3dkmtRender0(),
        commandOffset = 0u,
        commandLength = 0u,
        allocationCount = 0u,
        patchLocationCount = 0u,
        pNewCommandBufferCtorArg = MutPtr(0L),
        newCommandBufferSize = 0u,
        pNewAllocationListCtorArg = MutPtr(0L),
        newAllocationListSize = 0u,
        pNewPatchLocationListCtorArg = MutPtr(0L),
        newPatchLocationListSize = 0u,
        flags = D3dkmtRenderflags(),
        presentHistoryToken = 0uL,
        broadcastContextCount = 0u,
        broadcastContext = UIntArray(64),
        queuedBufferCount = 0u,
        newCommandBuffer = 0uL,
        pPrivateDriverDataCtorArg = MutPtr(0L),
        privateDriverDataSize = 0u,
    )

    public companion object {
        public operator fun invoke(
            anonymous: D3dkmtRender0 = D3dkmtRender0(),
            commandOffset: UInt = 0u,
            commandLength: UInt = 0u,
            allocationCount: UInt = 0u,
            patchLocationCount: UInt = 0u,
            pNewCommandBuffer: MutPtr = MutPtr(0L),
            newCommandBufferSize: UInt = 0u,
            pNewAllocationList: MutPtr = MutPtr(0L),
            newAllocationListSize: UInt = 0u,
            pNewPatchLocationList: MutPtr = MutPtr(0L),
            newPatchLocationListSize: UInt = 0u,
            flags: D3dkmtRenderflags = D3dkmtRenderflags(),
            presentHistoryToken: ULong = 0uL,
            broadcastContextCount: UInt = 0u,
            broadcastContext: UIntArray = UIntArray(64),
            queuedBufferCount: UInt = 0u,
            newCommandBuffer: ULong = 0uL,
            pPrivateDriverData: MutPtr = MutPtr(0L),
            privateDriverDataSize: UInt = 0u,
        ): D3dkmtRender =
            D3dkmtRender(
                anonymous = anonymous,
                commandOffset = commandOffset,
                commandLength = commandLength,
                allocationCount = allocationCount,
                patchLocationCount = patchLocationCount,
                pNewCommandBufferCtorArg = pNewCommandBuffer,
                newCommandBufferSize = newCommandBufferSize,
                pNewAllocationListCtorArg = pNewAllocationList,
                newAllocationListSize = newAllocationListSize,
                pNewPatchLocationListCtorArg = pNewPatchLocationList,
                newPatchLocationListSize = newPatchLocationListSize,
                flags = flags,
                presentHistoryToken = presentHistoryToken,
                broadcastContextCount = broadcastContextCount,
                broadcastContext = broadcastContext,
                queuedBufferCount = queuedBufferCount,
                newCommandBuffer = newCommandBuffer,
                pPrivateDriverDataCtorArg = pPrivateDriverData,
                privateDriverDataSize = privateDriverDataSize,
            )
    }
}

public data class D3dkmtRender0(
    public var hDevice: UInt = 0u,
    public var hContext: UInt = 0u,
)

public data class D3dkmtRenderflags(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtRenderflags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtRenderflags> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtRenderflags =
                    D3dkmtRenderflags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtRenderflags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtRequestMachineCrashEscape(
    public var param1: Int = 0,
    public var param2: Int = 0,
    public var param3: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtRequestMachineCrashEscape> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtRequestMachineCrashEscape> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): D3dkmtRequestMachineCrashEscape =
                    D3dkmtRequestMachineCrashEscape(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtRequestMachineCrashEscape) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.param1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.param2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.param3)
                }
            }
    }
}

public data class D3dkmtScatterblt(
    public var hLogicalSurfaceDestination: ULong = 0uL,
    public var hDestinationCompSurfDWM: Long = 0L,
    public var destinationCompositionBindingId: ULong = 0uL,
    public var sourceRect: Rect = Rect(),
    public var destinationOffset: Point = Point(),
)

public data class D3dkmtScatterblts(
    public var numBlts: UInt = 0u,
    public var blts: List<D3dkmtScatterblt> = List(12) { D3dkmtScatterblt() },
)

public data class D3dkmtSegmentgroupsizeinfo(
    public var physicalAdapterIndex: UInt = 0u,
    public var legacyInfo: D3dkmtSegmentsizeinfo = D3dkmtSegmentsizeinfo(),
    public var localMemory: ULong = 0uL,
    public var nonLocalMemory: ULong = 0uL,
    public var nonBudgetMemory: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSegmentgroupsizeinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSegmentgroupsizeinfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): D3dkmtSegmentgroupsizeinfo =
                    D3dkmtSegmentgroupsizeinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (D3dkmtSegmentsizeinfo.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtSegmentgroupsizeinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.physicalAdapterIndex)
                    (D3dkmtSegmentsizeinfo.typeLayout()).writeNative(addr + 8L, value.legacyInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.localMemory)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.nonLocalMemory)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.nonBudgetMemory)
                }
            }
    }
}

public data class D3dkmtSegmentsizeinfo(
    public var dedicatedVideoMemorySize: ULong = 0uL,
    public var dedicatedSystemMemorySize: ULong = 0uL,
    public var sharedSystemMemorySize: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSegmentsizeinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSegmentsizeinfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): D3dkmtSegmentsizeinfo =
                    D3dkmtSegmentsizeinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtSegmentsizeinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.dedicatedVideoMemorySize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.dedicatedSystemMemorySize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.sharedSystemMemorySize)
                }
            }
    }
}

public data class D3dkmtSegmentCaps(
    public var size: ULong = 0uL,
    public var pageSize: UInt = 0u,
    public var segmentId: UInt = 0u,
    public var bAperture: Boolean = false,
    public var bReservedSysMem: Boolean = false,
    public var budgetGroup: D3dkmtMemorySegmentGroup = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSegmentCaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSegmentCaps> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): D3dkmtSegmentCaps =
                    D3dkmtSegmentCaps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 17L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtSegmentCaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.pageSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.segmentId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 16L, value.bAperture)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 17L, value.bReservedSysMem)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.budgetGroup)
                }
            }
    }
}

public class D3dkmtSetallocationpriority internal constructor(
    public var hDevice: UInt,
    public var hResource: UInt,
    phAllocationListCtorArg: ConstPtr,
    public var allocationCount: UInt,
    pPrioritiesCtorArg: ConstPtr,
) {
    public var phAllocationList: ConstPtr = phAllocationListCtorArg
        internal set

    public var pPriorities: ConstPtr = pPrioritiesCtorArg
        internal set

    public constructor() : this(
        hDevice = 0u,
        hResource = 0u,
        phAllocationListCtorArg = ConstPtr(0L),
        allocationCount = 0u,
        pPrioritiesCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.hDevice

    public operator fun component2(): UInt = this.hResource

    public operator fun component3(): ConstPtr = this.phAllocationList

    public operator fun component4(): UInt = this.allocationCount

    public operator fun component5(): ConstPtr = this.pPriorities

    public fun copy(hDevice: UInt = this.hDevice, hResource: UInt = this.hResource, phAllocationList: ConstPtr = this.phAllocationList, allocationCount: UInt = this.allocationCount, pPriorities: ConstPtr = this.pPriorities): D3dkmtSetallocationpriority = D3dkmtSetallocationpriority(hDevice = hDevice, hResource = hResource, phAllocationListCtorArg = phAllocationList, allocationCount = allocationCount, pPrioritiesCtorArg = pPriorities)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtSetallocationpriority) return false
        if (this.hDevice != other.hDevice) return false
        if (this.hResource != other.hResource) return false
        if (this.phAllocationList != other.phAllocationList) return false
        if (this.allocationCount != other.allocationCount) return false
        if (this.pPriorities != other.pPriorities) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDevice.hashCode()
        result = 31 * result + this.hResource.hashCode()
        result = 31 * result + this.phAllocationList.hashCode()
        result = 31 * result + this.allocationCount.hashCode()
        result = 31 * result + this.pPriorities.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSetallocationpriority> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSetallocationpriority> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): D3dkmtSetallocationpriority =
                    D3dkmtSetallocationpriority(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtSetallocationpriority) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hDevice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hResource)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr + 8L, value.phAllocationList)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.allocationCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr + 24L, value.pPriorities)
                }
            }

        public operator fun invoke(
            hDevice: UInt = 0u,
            hResource: UInt = 0u,
            phAllocationList: ConstPtr = ConstPtr(0L),
            allocationCount: UInt = 0u,
            pPriorities: ConstPtr = ConstPtr(0L),
        ): D3dkmtSetallocationpriority =
            D3dkmtSetallocationpriority(
                hDevice = hDevice,
                hResource = hResource,
                phAllocationListCtorArg = phAllocationList,
                allocationCount = allocationCount,
                pPrioritiesCtorArg = pPriorities,
            )
    }
}

public data class D3dkmtSetcontextinprocessschedulingpriority(
    public var hContext: UInt = 0u,
    public var priority: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSetcontextinprocessschedulingpriority> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSetcontextinprocessschedulingpriority> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtSetcontextinprocessschedulingpriority =
                    D3dkmtSetcontextinprocessschedulingpriority(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtSetcontextinprocessschedulingpriority) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.priority)
                }
            }
    }
}

public data class D3dkmtSetcontextschedulingpriority(
    public var hContext: UInt = 0u,
    public var priority: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSetcontextschedulingpriority> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSetcontextschedulingpriority> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtSetcontextschedulingpriority =
                    D3dkmtSetcontextschedulingpriority(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtSetcontextschedulingpriority) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.priority)
                }
            }
    }
}

public data class D3dkmtSetdisplaymode(
    public var hDevice: UInt = 0u,
    public var hPrimaryAllocation: UInt = 0u,
    public var scanLineOrdering: D3dddiVideoSignalScanlineOrdering = 0,
    public var displayOrientation: D3dddiRotation = 0,
    public var privateDriverFormatAttribute: UInt = 0u,
    public var flags: D3dkmtSetdisplaymodeFlags = D3dkmtSetdisplaymodeFlags(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSetdisplaymode> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSetdisplaymode> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): D3dkmtSetdisplaymode =
                    D3dkmtSetdisplaymode(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (D3dkmtSetdisplaymodeFlags.typeLayout()).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtSetdisplaymode) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hDevice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hPrimaryAllocation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.scanLineOrdering)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.displayOrientation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.privateDriverFormatAttribute)
                    (D3dkmtSetdisplaymodeFlags.typeLayout()).writeNative(addr + 20L, value.flags)
                }
            }
    }
}

public data class D3dkmtSetdisplaymodeFlags(
    public var bitfield1: UByte = 0u,
    public var bitfield2: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSetdisplaymodeFlags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSetdisplaymodeFlags> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtSetdisplaymodeFlags =
                    D3dkmtSetdisplaymodeFlags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtSetdisplaymodeFlags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bitfield2)
                }
            }
    }
}

public data class D3dkmtSetdisplayprivatedriverformat(
    public var hDevice: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var privateDriverFormatAttribute: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSetdisplayprivatedriverformat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSetdisplayprivatedriverformat> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): D3dkmtSetdisplayprivatedriverformat =
                    D3dkmtSetdisplayprivatedriverformat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtSetdisplayprivatedriverformat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hDevice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vidPnSourceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.privateDriverFormatAttribute)
                }
            }
    }
}

public data class D3dkmtSetfseblock(
    public var adapterLuid: Luid = Luid(),
    public var hAdapter: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var flags: D3dkmtSetfseblockflags = D3dkmtSetfseblockflags(),
)

public data class D3dkmtSetfseblockflags(
    public var anonymous: D3dkmtSetfseblockflags0 = D3dkmtSetfseblockflags0(),
    public var value: UInt = 0u,
)

public data class D3dkmtSetfseblockflags0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSetfseblockflags0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSetfseblockflags0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtSetfseblockflags0 =
                    D3dkmtSetfseblockflags0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtSetfseblockflags0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtSetgammaramp(
    public var hDevice: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var type: D3dddiGammarampType = 0,
    public var anonymous: D3dkmtSetgammaramp0 = D3dkmtSetgammaramp0(),
    public var size: UInt = 0u,
)

public class D3dkmtSetgammaramp0 internal constructor(
    pGammaRampRgb256x3x16CtorArg: MutPtr,
    pGammaRampDXGI1CtorArg: MutPtr,
) {
    public var pGammaRampRgb256x3x16: MutPtr = pGammaRampRgb256x3x16CtorArg
        internal set

    public var pGammaRampDXGI1: MutPtr = pGammaRampDXGI1CtorArg
        internal set

    public constructor() : this(
        pGammaRampRgb256x3x16CtorArg = MutPtr(0L),
        pGammaRampDXGI1CtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.pGammaRampRgb256x3x16

    public operator fun component2(): MutPtr = this.pGammaRampDXGI1

    public fun copy(pGammaRampRgb256x3x16: MutPtr = this.pGammaRampRgb256x3x16, pGammaRampDXGI1: MutPtr = this.pGammaRampDXGI1): D3dkmtSetgammaramp0 = D3dkmtSetgammaramp0(pGammaRampRgb256x3x16CtorArg = pGammaRampRgb256x3x16, pGammaRampDXGI1CtorArg = pGammaRampDXGI1)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtSetgammaramp0) return false
        if (this.pGammaRampRgb256x3x16 != other.pGammaRampRgb256x3x16) return false
        if (this.pGammaRampDXGI1 != other.pGammaRampDXGI1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pGammaRampRgb256x3x16.hashCode()
        result = 31 * result + this.pGammaRampDXGI1.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pGammaRampRgb256x3x16: MutPtr = MutPtr(0L),
            pGammaRampDXGI1: MutPtr = MutPtr(0L),
        ): D3dkmtSetgammaramp0 =
            D3dkmtSetgammaramp0(
                pGammaRampRgb256x3x16CtorArg = pGammaRampRgb256x3x16,
                pGammaRampDXGI1CtorArg = pGammaRampDXGI1,
            )
    }
}

public data class D3dkmtSethwprotectionteardownrecovery(
    public var hAdapter: UInt = 0u,
    public var recovered: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSethwprotectionteardownrecovery> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSethwprotectionteardownrecovery> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtSethwprotectionteardownrecovery =
                    D3dkmtSethwprotectionteardownrecovery(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtSethwprotectionteardownrecovery) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAdapter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.recovered)
                }
            }
    }
}

public data class D3dkmtSetqueuedlimit(
    public var hDevice: UInt = 0u,
    public var type: D3dkmtQueuedlimitType = 0,
    public var anonymous: D3dkmtSetqueuedlimit0 = D3dkmtSetqueuedlimit0(),
)

public data class D3dkmtSetqueuedlimit0(
    public var queuedPresentLimit: UInt = 0u,
    public var anonymous: D3dkmtSetqueuedlimit00 = D3dkmtSetqueuedlimit00(),
)

public data class D3dkmtSetqueuedlimit00(
    public var vidPnSourceId: UInt = 0u,
    public var queuedPendingFlipLimit: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSetqueuedlimit00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSetqueuedlimit00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtSetqueuedlimit00 =
                    D3dkmtSetqueuedlimit00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtSetqueuedlimit00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.vidPnSourceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.queuedPendingFlipLimit)
                }
            }
    }
}

public data class D3dkmtSetstablepowerstate(
    public var hAdapter: UInt = 0u,
    public var enabled: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSetstablepowerstate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSetstablepowerstate> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtSetstablepowerstate =
                    D3dkmtSetstablepowerstate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtSetstablepowerstate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAdapter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.enabled)
                }
            }
    }
}

public data class D3dkmtSetsyncrefreshcountwaittarget(
    public var hAdapter: UInt = 0u,
    public var hDevice: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var targetSyncRefreshCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSetsyncrefreshcountwaittarget> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSetsyncrefreshcountwaittarget> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): D3dkmtSetsyncrefreshcountwaittarget =
                    D3dkmtSetsyncrefreshcountwaittarget(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtSetsyncrefreshcountwaittarget) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAdapter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hDevice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.vidPnSourceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.targetSyncRefreshCount)
                }
            }
    }
}

public data class D3dkmtSetvidpnsourcehwprotection(
    public var hAdapter: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var hwProtected: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSetvidpnsourcehwprotection> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSetvidpnsourcehwprotection> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): D3dkmtSetvidpnsourcehwprotection =
                    D3dkmtSetvidpnsourcehwprotection(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtSetvidpnsourcehwprotection) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAdapter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vidPnSourceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.hwProtected)
                }
            }
    }
}

public class D3dkmtSetvidpnsourceowner internal constructor(
    public var hDevice: UInt,
    pTypeCtorArg: ConstPtr,
    pVidPnSourceIdCtorArg: ConstPtr,
    public var vidPnSourceCount: UInt,
) {
    public var pType: ConstPtr = pTypeCtorArg
        internal set

    public var pVidPnSourceId: ConstPtr = pVidPnSourceIdCtorArg
        internal set

    public constructor() : this(
        hDevice = 0u,
        pTypeCtorArg = ConstPtr(0L),
        pVidPnSourceIdCtorArg = ConstPtr(0L),
        vidPnSourceCount = 0u,
    )

    public operator fun component1(): UInt = this.hDevice

    public operator fun component2(): ConstPtr = this.pType

    public operator fun component3(): ConstPtr = this.pVidPnSourceId

    public operator fun component4(): UInt = this.vidPnSourceCount

    public fun copy(hDevice: UInt = this.hDevice, pType: ConstPtr = this.pType, pVidPnSourceId: ConstPtr = this.pVidPnSourceId, vidPnSourceCount: UInt = this.vidPnSourceCount): D3dkmtSetvidpnsourceowner = D3dkmtSetvidpnsourceowner(hDevice = hDevice, pTypeCtorArg = pType, pVidPnSourceIdCtorArg = pVidPnSourceId, vidPnSourceCount = vidPnSourceCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtSetvidpnsourceowner) return false
        if (this.hDevice != other.hDevice) return false
        if (this.pType != other.pType) return false
        if (this.pVidPnSourceId != other.pVidPnSourceId) return false
        if (this.vidPnSourceCount != other.vidPnSourceCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDevice.hashCode()
        result = 31 * result + this.pType.hashCode()
        result = 31 * result + this.pVidPnSourceId.hashCode()
        result = 31 * result + this.vidPnSourceCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSetvidpnsourceowner> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSetvidpnsourceowner> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): D3dkmtSetvidpnsourceowner =
                    D3dkmtSetvidpnsourceowner(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtSetvidpnsourceowner) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hDevice)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr + 8L, value.pType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr + 16L, value.pVidPnSourceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.vidPnSourceCount)
                }
            }

        public operator fun invoke(
            hDevice: UInt = 0u,
            pType: ConstPtr = ConstPtr(0L),
            pVidPnSourceId: ConstPtr = ConstPtr(0L),
            vidPnSourceCount: UInt = 0u,
        ): D3dkmtSetvidpnsourceowner =
            D3dkmtSetvidpnsourceowner(
                hDevice = hDevice,
                pTypeCtorArg = pType,
                pVidPnSourceIdCtorArg = pVidPnSourceId,
                vidPnSourceCount = vidPnSourceCount,
            )
    }
}

public data class D3dkmtSetvidpnsourceowner1(
    public var version0: D3dkmtSetvidpnsourceowner = D3dkmtSetvidpnsourceowner(),
    public var flags: D3dkmtVidpnsourceownerFlags = D3dkmtVidpnsourceownerFlags(),
)

public class D3dkmtSetvidpnsourceowner2 internal constructor(
    public var version1: D3dkmtSetvidpnsourceowner1,
    pVidPnSourceNtHandlesCtorArg: ConstPtr,
) {
    public var pVidPnSourceNtHandles: ConstPtr = pVidPnSourceNtHandlesCtorArg
        internal set

    public constructor() : this(
        version1 = D3dkmtSetvidpnsourceowner1(),
        pVidPnSourceNtHandlesCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): D3dkmtSetvidpnsourceowner1 = this.version1

    public operator fun component2(): ConstPtr = this.pVidPnSourceNtHandles

    public fun copy(version1: D3dkmtSetvidpnsourceowner1 = this.version1, pVidPnSourceNtHandles: ConstPtr = this.pVidPnSourceNtHandles): D3dkmtSetvidpnsourceowner2 = D3dkmtSetvidpnsourceowner2(version1 = version1, pVidPnSourceNtHandlesCtorArg = pVidPnSourceNtHandles)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtSetvidpnsourceowner2) return false
        if (this.version1 != other.version1) return false
        if (this.pVidPnSourceNtHandles != other.pVidPnSourceNtHandles) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version1.hashCode()
        result = 31 * result + this.pVidPnSourceNtHandles.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            version1: D3dkmtSetvidpnsourceowner1 = D3dkmtSetvidpnsourceowner1(),
            pVidPnSourceNtHandles: ConstPtr = ConstPtr(0L),
        ): D3dkmtSetvidpnsourceowner2 =
            D3dkmtSetvidpnsourceowner2(
                version1 = version1,
                pVidPnSourceNtHandlesCtorArg = pVidPnSourceNtHandles,
            )
    }
}

public data class D3dkmtSetColorspaceTransform(
    public var adapterLuid: Luid = Luid(),
    public var vidPnTargetId: UInt = 0u,
    public var type: D3dddiGammarampType = 0,
    public var size: UInt = 0u,
    public var anonymous: D3dkmtSetColorspaceTransform0 = D3dkmtSetColorspaceTransform0(),
)

public class D3dkmtSetColorspaceTransform0 internal constructor(
    pColorSpaceTransformCtorArg: MutPtr,
) {
    public var pColorSpaceTransform: MutPtr = pColorSpaceTransformCtorArg
        internal set

    public constructor() : this(
        pColorSpaceTransformCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.pColorSpaceTransform

    public fun copy(pColorSpaceTransform: MutPtr = this.pColorSpaceTransform): D3dkmtSetColorspaceTransform0 = D3dkmtSetColorspaceTransform0(pColorSpaceTransformCtorArg = pColorSpaceTransform)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtSetColorspaceTransform0) return false
        if (this.pColorSpaceTransform != other.pColorSpaceTransform) return false
        return true
    }

    override fun hashCode(): Int = this.pColorSpaceTransform.hashCode()

    public companion object {
        public operator fun invoke(
            pColorSpaceTransform: MutPtr = MutPtr(0L),
        ): D3dkmtSetColorspaceTransform0 =
            D3dkmtSetColorspaceTransform0(
                pColorSpaceTransformCtorArg = pColorSpaceTransform,
            )
    }
}

public data class D3dkmtSharedprimarylocknotification(
    public var adapterLuid: Luid = Luid(),
    public var vidPnSourceId: UInt = 0u,
    public var lockRect: Rectl = Rectl(),
)

public data class D3dkmtSharedprimaryunlocknotification(
    public var adapterLuid: Luid = Luid(),
    public var vidPnSourceId: UInt = 0u,
)

public data class D3dkmtShareobjectwithhost(
    public var hDevice: UInt = 0u,
    public var hObject: UInt = 0u,
    public var reserved: ULong = 0uL,
    public var hVailProcessNtHandle: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtShareobjectwithhost> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtShareobjectwithhost> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): D3dkmtShareobjectwithhost =
                    D3dkmtShareobjectwithhost(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtShareobjectwithhost) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hDevice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hObject)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.hVailProcessNtHandle)
                }
            }
    }
}

public data class D3dkmtSignalsynchronizationobject(
    public var hContext: UInt = 0u,
    public var objectCount: UInt = 0u,
    public var objectHandleArray: UIntArray = UIntArray(32),
    public var flags: D3dddicbSignalflags = D3dddicbSignalflags(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtSignalsynchronizationobject) return false
        if (this.hContext != other.hContext) return false
        if (this.objectCount != other.objectCount) return false
        if (!this.objectHandleArray.contentEquals(other.objectHandleArray)) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hContext.hashCode()
        result = 31 * result + this.objectCount.hashCode()
        result = 31 * result + this.objectHandleArray.contentHashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }
}

public data class D3dkmtSignalsynchronizationobject2(
    public var hContext: UInt = 0u,
    public var objectCount: UInt = 0u,
    public var objectHandleArray: UIntArray = UIntArray(32),
    public var flags: D3dddicbSignalflags = D3dddicbSignalflags(),
    public var broadcastContextCount: UInt = 0u,
    public var broadcastContext: UIntArray = UIntArray(64),
    public var anonymous: D3dkmtSignalsynchronizationobject20 = D3dkmtSignalsynchronizationobject20(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtSignalsynchronizationobject2) return false
        if (this.hContext != other.hContext) return false
        if (this.objectCount != other.objectCount) return false
        if (!this.objectHandleArray.contentEquals(other.objectHandleArray)) return false
        if (this.flags != other.flags) return false
        if (this.broadcastContextCount != other.broadcastContextCount) return false
        if (!this.broadcastContext.contentEquals(other.broadcastContext)) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hContext.hashCode()
        result = 31 * result + this.objectCount.hashCode()
        result = 31 * result + this.objectHandleArray.contentHashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.broadcastContextCount.hashCode()
        result = 31 * result + this.broadcastContext.contentHashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public class D3dkmtSignalsynchronizationobject20 internal constructor(
    public var fence: D3dkmtSignalsynchronizationobject200,
    cpuEventHandleCtorArg: Handle,
    public var reserved: ULongArray,
) {
    public var cpuEventHandle: Handle = cpuEventHandleCtorArg
        internal set

    public constructor() : this(
        fence = D3dkmtSignalsynchronizationobject200(),
        cpuEventHandleCtorArg = MutPtr(0L),
        reserved = ULongArray(8),
    )

    public operator fun component1(): D3dkmtSignalsynchronizationobject200 = this.fence

    public operator fun component2(): Handle = this.cpuEventHandle

    public operator fun component3(): ULongArray = this.reserved

    public fun copy(fence: D3dkmtSignalsynchronizationobject200 = this.fence, cpuEventHandle: Handle = this.cpuEventHandle, reserved: ULongArray = this.reserved): D3dkmtSignalsynchronizationobject20 = D3dkmtSignalsynchronizationobject20(fence = fence, cpuEventHandleCtorArg = cpuEventHandle, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtSignalsynchronizationobject20) return false
        if (this.fence != other.fence) return false
        if (this.cpuEventHandle != other.cpuEventHandle) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fence.hashCode()
        result = 31 * result + this.cpuEventHandle.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fence: D3dkmtSignalsynchronizationobject200 = D3dkmtSignalsynchronizationobject200(),
            cpuEventHandle: Handle = MutPtr(0L),
            reserved: ULongArray = ULongArray(8),
        ): D3dkmtSignalsynchronizationobject20 =
            D3dkmtSignalsynchronizationobject20(
                fence = fence,
                cpuEventHandleCtorArg = cpuEventHandle,
                reserved = reserved,
            )
    }
}

public data class D3dkmtSignalsynchronizationobject200(
    public var fenceValue: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSignalsynchronizationobject200> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSignalsynchronizationobject200> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtSignalsynchronizationobject200 =
                    D3dkmtSignalsynchronizationobject200(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtSignalsynchronizationobject200) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.fenceValue)
                }
            }
    }
}

public class D3dkmtSignalsynchronizationobjectfromcpu internal constructor(
    public var hDevice: UInt,
    public var objectCount: UInt,
    objectHandleArrayCtorArg: ConstPtr,
    fenceValueArrayCtorArg: ConstPtr,
    public var flags: D3dddicbSignalflags,
) {
    public var objectHandleArray: ConstPtr = objectHandleArrayCtorArg
        internal set

    public var fenceValueArray: ConstPtr = fenceValueArrayCtorArg
        internal set

    public constructor() : this(
        hDevice = 0u,
        objectCount = 0u,
        objectHandleArrayCtorArg = ConstPtr(0L),
        fenceValueArrayCtorArg = ConstPtr(0L),
        flags = D3dddicbSignalflags(),
    )

    public operator fun component1(): UInt = this.hDevice

    public operator fun component2(): UInt = this.objectCount

    public operator fun component3(): ConstPtr = this.objectHandleArray

    public operator fun component4(): ConstPtr = this.fenceValueArray

    public operator fun component5(): D3dddicbSignalflags = this.flags

    public fun copy(hDevice: UInt = this.hDevice, objectCount: UInt = this.objectCount, objectHandleArray: ConstPtr = this.objectHandleArray, fenceValueArray: ConstPtr = this.fenceValueArray, flags: D3dddicbSignalflags = this.flags): D3dkmtSignalsynchronizationobjectfromcpu = D3dkmtSignalsynchronizationobjectfromcpu(hDevice = hDevice, objectCount = objectCount, objectHandleArrayCtorArg = objectHandleArray, fenceValueArrayCtorArg = fenceValueArray, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtSignalsynchronizationobjectfromcpu) return false
        if (this.hDevice != other.hDevice) return false
        if (this.objectCount != other.objectCount) return false
        if (this.objectHandleArray != other.objectHandleArray) return false
        if (this.fenceValueArray != other.fenceValueArray) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDevice.hashCode()
        result = 31 * result + this.objectCount.hashCode()
        result = 31 * result + this.objectHandleArray.hashCode()
        result = 31 * result + this.fenceValueArray.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hDevice: UInt = 0u,
            objectCount: UInt = 0u,
            objectHandleArray: ConstPtr = ConstPtr(0L),
            fenceValueArray: ConstPtr = ConstPtr(0L),
            flags: D3dddicbSignalflags = D3dddicbSignalflags(),
        ): D3dkmtSignalsynchronizationobjectfromcpu =
            D3dkmtSignalsynchronizationobjectfromcpu(
                hDevice = hDevice,
                objectCount = objectCount,
                objectHandleArrayCtorArg = objectHandleArray,
                fenceValueArrayCtorArg = fenceValueArray,
                flags = flags,
            )
    }
}

public class D3dkmtSignalsynchronizationobjectfromgpu internal constructor(
    public var hContext: UInt,
    public var objectCount: UInt,
    objectHandleArrayCtorArg: ConstPtr,
    public var anonymous: D3dkmtSignalsynchronizationobjectfromgpu0,
) {
    public var objectHandleArray: ConstPtr = objectHandleArrayCtorArg
        internal set

    public constructor() : this(
        hContext = 0u,
        objectCount = 0u,
        objectHandleArrayCtorArg = ConstPtr(0L),
        anonymous = D3dkmtSignalsynchronizationobjectfromgpu0(),
    )

    public operator fun component1(): UInt = this.hContext

    public operator fun component2(): UInt = this.objectCount

    public operator fun component3(): ConstPtr = this.objectHandleArray

    public operator fun component4(): D3dkmtSignalsynchronizationobjectfromgpu0 = this.anonymous

    public fun copy(hContext: UInt = this.hContext, objectCount: UInt = this.objectCount, objectHandleArray: ConstPtr = this.objectHandleArray, anonymous: D3dkmtSignalsynchronizationobjectfromgpu0 = this.anonymous): D3dkmtSignalsynchronizationobjectfromgpu = D3dkmtSignalsynchronizationobjectfromgpu(hContext = hContext, objectCount = objectCount, objectHandleArrayCtorArg = objectHandleArray, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtSignalsynchronizationobjectfromgpu) return false
        if (this.hContext != other.hContext) return false
        if (this.objectCount != other.objectCount) return false
        if (this.objectHandleArray != other.objectHandleArray) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hContext.hashCode()
        result = 31 * result + this.objectCount.hashCode()
        result = 31 * result + this.objectHandleArray.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hContext: UInt = 0u,
            objectCount: UInt = 0u,
            objectHandleArray: ConstPtr = ConstPtr(0L),
            anonymous: D3dkmtSignalsynchronizationobjectfromgpu0 = D3dkmtSignalsynchronizationobjectfromgpu0(),
        ): D3dkmtSignalsynchronizationobjectfromgpu =
            D3dkmtSignalsynchronizationobjectfromgpu(
                hContext = hContext,
                objectCount = objectCount,
                objectHandleArrayCtorArg = objectHandleArray,
                anonymous = anonymous,
            )
    }
}

public class D3dkmtSignalsynchronizationobjectfromgpu0 internal constructor(
    monitoredFenceValueArrayCtorArg: ConstPtr,
    public var reserved: ULongArray,
) {
    public var monitoredFenceValueArray: ConstPtr = monitoredFenceValueArrayCtorArg
        internal set

    public constructor() : this(
        monitoredFenceValueArrayCtorArg = ConstPtr(0L),
        reserved = ULongArray(8),
    )

    public operator fun component1(): ConstPtr = this.monitoredFenceValueArray

    public operator fun component2(): ULongArray = this.reserved

    public fun copy(monitoredFenceValueArray: ConstPtr = this.monitoredFenceValueArray, reserved: ULongArray = this.reserved): D3dkmtSignalsynchronizationobjectfromgpu0 = D3dkmtSignalsynchronizationobjectfromgpu0(monitoredFenceValueArrayCtorArg = monitoredFenceValueArray, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtSignalsynchronizationobjectfromgpu0) return false
        if (this.monitoredFenceValueArray != other.monitoredFenceValueArray) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.monitoredFenceValueArray.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            monitoredFenceValueArray: ConstPtr = ConstPtr(0L),
            reserved: ULongArray = ULongArray(8),
        ): D3dkmtSignalsynchronizationobjectfromgpu0 =
            D3dkmtSignalsynchronizationobjectfromgpu0(
                monitoredFenceValueArrayCtorArg = monitoredFenceValueArray,
                reserved = reserved,
            )
    }
}

public class D3dkmtSignalsynchronizationobjectfromgpu2 internal constructor(
    public var objectCount: UInt,
    objectHandleArrayCtorArg: ConstPtr,
    public var flags: D3dddicbSignalflags,
    public var broadcastContextCount: UInt,
    broadcastContextArrayCtorArg: ConstPtr,
    public var anonymous: D3dkmtSignalsynchronizationobjectfromgpu20,
) {
    public var objectHandleArray: ConstPtr = objectHandleArrayCtorArg
        internal set

    public var broadcastContextArray: ConstPtr = broadcastContextArrayCtorArg
        internal set

    public constructor() : this(
        objectCount = 0u,
        objectHandleArrayCtorArg = ConstPtr(0L),
        flags = D3dddicbSignalflags(),
        broadcastContextCount = 0u,
        broadcastContextArrayCtorArg = ConstPtr(0L),
        anonymous = D3dkmtSignalsynchronizationobjectfromgpu20(),
    )

    public operator fun component1(): UInt = this.objectCount

    public operator fun component2(): ConstPtr = this.objectHandleArray

    public operator fun component3(): D3dddicbSignalflags = this.flags

    public operator fun component4(): UInt = this.broadcastContextCount

    public operator fun component5(): ConstPtr = this.broadcastContextArray

    public operator fun component6(): D3dkmtSignalsynchronizationobjectfromgpu20 = this.anonymous

    public fun copy(objectCount: UInt = this.objectCount, objectHandleArray: ConstPtr = this.objectHandleArray, flags: D3dddicbSignalflags = this.flags, broadcastContextCount: UInt = this.broadcastContextCount, broadcastContextArray: ConstPtr = this.broadcastContextArray, anonymous: D3dkmtSignalsynchronizationobjectfromgpu20 = this.anonymous): D3dkmtSignalsynchronizationobjectfromgpu2 = D3dkmtSignalsynchronizationobjectfromgpu2(objectCount = objectCount, objectHandleArrayCtorArg = objectHandleArray, flags = flags, broadcastContextCount = broadcastContextCount, broadcastContextArrayCtorArg = broadcastContextArray, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtSignalsynchronizationobjectfromgpu2) return false
        if (this.objectCount != other.objectCount) return false
        if (this.objectHandleArray != other.objectHandleArray) return false
        if (this.flags != other.flags) return false
        if (this.broadcastContextCount != other.broadcastContextCount) return false
        if (this.broadcastContextArray != other.broadcastContextArray) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.objectCount.hashCode()
        result = 31 * result + this.objectHandleArray.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.broadcastContextCount.hashCode()
        result = 31 * result + this.broadcastContextArray.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            objectCount: UInt = 0u,
            objectHandleArray: ConstPtr = ConstPtr(0L),
            flags: D3dddicbSignalflags = D3dddicbSignalflags(),
            broadcastContextCount: UInt = 0u,
            broadcastContextArray: ConstPtr = ConstPtr(0L),
            anonymous: D3dkmtSignalsynchronizationobjectfromgpu20 = D3dkmtSignalsynchronizationobjectfromgpu20(),
        ): D3dkmtSignalsynchronizationobjectfromgpu2 =
            D3dkmtSignalsynchronizationobjectfromgpu2(
                objectCount = objectCount,
                objectHandleArrayCtorArg = objectHandleArray,
                flags = flags,
                broadcastContextCount = broadcastContextCount,
                broadcastContextArrayCtorArg = broadcastContextArray,
                anonymous = anonymous,
            )
    }
}

public class D3dkmtSignalsynchronizationobjectfromgpu20 internal constructor(
    public var fenceValue: ULong,
    cpuEventHandleCtorArg: Handle,
    monitoredFenceValueArrayCtorArg: ConstPtr,
    public var reserved: ULongArray,
) {
    public var cpuEventHandle: Handle = cpuEventHandleCtorArg
        internal set

    public var monitoredFenceValueArray: ConstPtr = monitoredFenceValueArrayCtorArg
        internal set

    public constructor() : this(
        fenceValue = 0uL,
        cpuEventHandleCtorArg = MutPtr(0L),
        monitoredFenceValueArrayCtorArg = ConstPtr(0L),
        reserved = ULongArray(8),
    )

    public operator fun component1(): ULong = this.fenceValue

    public operator fun component2(): Handle = this.cpuEventHandle

    public operator fun component3(): ConstPtr = this.monitoredFenceValueArray

    public operator fun component4(): ULongArray = this.reserved

    public fun copy(fenceValue: ULong = this.fenceValue, cpuEventHandle: Handle = this.cpuEventHandle, monitoredFenceValueArray: ConstPtr = this.monitoredFenceValueArray, reserved: ULongArray = this.reserved): D3dkmtSignalsynchronizationobjectfromgpu20 = D3dkmtSignalsynchronizationobjectfromgpu20(fenceValue = fenceValue, cpuEventHandleCtorArg = cpuEventHandle, monitoredFenceValueArrayCtorArg = monitoredFenceValueArray, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtSignalsynchronizationobjectfromgpu20) return false
        if (this.fenceValue != other.fenceValue) return false
        if (this.cpuEventHandle != other.cpuEventHandle) return false
        if (this.monitoredFenceValueArray != other.monitoredFenceValueArray) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fenceValue.hashCode()
        result = 31 * result + this.cpuEventHandle.hashCode()
        result = 31 * result + this.monitoredFenceValueArray.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fenceValue: ULong = 0uL,
            cpuEventHandle: Handle = MutPtr(0L),
            monitoredFenceValueArray: ConstPtr = ConstPtr(0L),
            reserved: ULongArray = ULongArray(8),
        ): D3dkmtSignalsynchronizationobjectfromgpu20 =
            D3dkmtSignalsynchronizationobjectfromgpu20(
                fenceValue = fenceValue,
                cpuEventHandleCtorArg = cpuEventHandle,
                monitoredFenceValueArrayCtorArg = monitoredFenceValueArray,
                reserved = reserved,
            )
    }
}

public data class D3dkmtStandardallocationExistingheap(
    public var size: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtStandardallocationExistingheap> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtStandardallocationExistingheap> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtStandardallocationExistingheap =
                    D3dkmtStandardallocationExistingheap(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtStandardallocationExistingheap) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.size)
                }
            }
    }
}

public class D3dkmtSubmitcommand internal constructor(
    public var commands: ULong,
    public var commandLength: UInt,
    public var flags: D3dkmtSubmitcommandflags,
    public var presentHistoryToken: ULong,
    public var broadcastContextCount: UInt,
    public var broadcastContext: UIntArray,
    pPrivateDriverDataCtorArg: MutPtr,
    public var privateDriverDataSize: UInt,
    public var numPrimaries: UInt,
    public var writtenPrimaries: UIntArray,
    public var numHistoryBuffers: UInt,
    historyBufferArrayCtorArg: MutPtr,
) {
    public var pPrivateDriverData: MutPtr = pPrivateDriverDataCtorArg
        internal set

    public var historyBufferArray: MutPtr = historyBufferArrayCtorArg
        internal set

    public constructor() : this(
        commands = 0uL,
        commandLength = 0u,
        flags = D3dkmtSubmitcommandflags(),
        presentHistoryToken = 0uL,
        broadcastContextCount = 0u,
        broadcastContext = UIntArray(64),
        pPrivateDriverDataCtorArg = MutPtr(0L),
        privateDriverDataSize = 0u,
        numPrimaries = 0u,
        writtenPrimaries = UIntArray(16),
        numHistoryBuffers = 0u,
        historyBufferArrayCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ULong = this.commands

    public operator fun component2(): UInt = this.commandLength

    public operator fun component3(): D3dkmtSubmitcommandflags = this.flags

    public operator fun component4(): ULong = this.presentHistoryToken

    public operator fun component5(): UInt = this.broadcastContextCount

    public operator fun component6(): UIntArray = this.broadcastContext

    public operator fun component7(): MutPtr = this.pPrivateDriverData

    public operator fun component8(): UInt = this.privateDriverDataSize

    public operator fun component9(): UInt = this.numPrimaries

    public operator fun component10(): UIntArray = this.writtenPrimaries

    public operator fun component11(): UInt = this.numHistoryBuffers

    public operator fun component12(): MutPtr = this.historyBufferArray

    public fun copy(commands: ULong = this.commands, commandLength: UInt = this.commandLength, flags: D3dkmtSubmitcommandflags = this.flags, presentHistoryToken: ULong = this.presentHistoryToken, broadcastContextCount: UInt = this.broadcastContextCount, broadcastContext: UIntArray = this.broadcastContext, pPrivateDriverData: MutPtr = this.pPrivateDriverData, privateDriverDataSize: UInt = this.privateDriverDataSize, numPrimaries: UInt = this.numPrimaries, writtenPrimaries: UIntArray = this.writtenPrimaries, numHistoryBuffers: UInt = this.numHistoryBuffers, historyBufferArray: MutPtr = this.historyBufferArray): D3dkmtSubmitcommand = D3dkmtSubmitcommand(commands = commands, commandLength = commandLength, flags = flags, presentHistoryToken = presentHistoryToken, broadcastContextCount = broadcastContextCount, broadcastContext = broadcastContext, pPrivateDriverDataCtorArg = pPrivateDriverData, privateDriverDataSize = privateDriverDataSize, numPrimaries = numPrimaries, writtenPrimaries = writtenPrimaries, numHistoryBuffers = numHistoryBuffers, historyBufferArrayCtorArg = historyBufferArray)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtSubmitcommand) return false
        if (this.commands != other.commands) return false
        if (this.commandLength != other.commandLength) return false
        if (this.flags != other.flags) return false
        if (this.presentHistoryToken != other.presentHistoryToken) return false
        if (this.broadcastContextCount != other.broadcastContextCount) return false
        if (!this.broadcastContext.contentEquals(other.broadcastContext)) return false
        if (this.pPrivateDriverData != other.pPrivateDriverData) return false
        if (this.privateDriverDataSize != other.privateDriverDataSize) return false
        if (this.numPrimaries != other.numPrimaries) return false
        if (!this.writtenPrimaries.contentEquals(other.writtenPrimaries)) return false
        if (this.numHistoryBuffers != other.numHistoryBuffers) return false
        if (this.historyBufferArray != other.historyBufferArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.commands.hashCode()
        result = 31 * result + this.commandLength.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.presentHistoryToken.hashCode()
        result = 31 * result + this.broadcastContextCount.hashCode()
        result = 31 * result + this.broadcastContext.contentHashCode()
        result = 31 * result + this.pPrivateDriverData.hashCode()
        result = 31 * result + this.privateDriverDataSize.hashCode()
        result = 31 * result + this.numPrimaries.hashCode()
        result = 31 * result + this.writtenPrimaries.contentHashCode()
        result = 31 * result + this.numHistoryBuffers.hashCode()
        result = 31 * result + this.historyBufferArray.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSubmitcommand> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSubmitcommand> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 384L
                override fun readNative(addr: Long): D3dkmtSubmitcommand =
                    D3dkmtSubmitcommand(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (D3dkmtSubmitcommandflags.typeLayout()).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (64).toInt())
                        ).readNative(addr + 28L).toUIntArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 288L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 296L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 300L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (16).toInt())
                        ).readNative(addr + 304L).toUIntArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 368L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 376L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtSubmitcommand) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.commands)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.commandLength)
                    (D3dkmtSubmitcommandflags.typeLayout()).writeNative(addr + 12L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.presentHistoryToken)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.broadcastContextCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (64).toInt())
                    ).writeNative(addr + 28L, value.broadcastContext.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 288L, value.pPrivateDriverData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 296L, value.privateDriverDataSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 300L, value.numPrimaries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (16).toInt())
                    ).writeNative(addr + 304L, value.writtenPrimaries.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 368L, value.numHistoryBuffers)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 376L, value.historyBufferArray)
                }
            }

        public operator fun invoke(
            commands: ULong = 0uL,
            commandLength: UInt = 0u,
            flags: D3dkmtSubmitcommandflags = D3dkmtSubmitcommandflags(),
            presentHistoryToken: ULong = 0uL,
            broadcastContextCount: UInt = 0u,
            broadcastContext: UIntArray = UIntArray(64),
            pPrivateDriverData: MutPtr = MutPtr(0L),
            privateDriverDataSize: UInt = 0u,
            numPrimaries: UInt = 0u,
            writtenPrimaries: UIntArray = UIntArray(16),
            numHistoryBuffers: UInt = 0u,
            historyBufferArray: MutPtr = MutPtr(0L),
        ): D3dkmtSubmitcommand =
            D3dkmtSubmitcommand(
                commands = commands,
                commandLength = commandLength,
                flags = flags,
                presentHistoryToken = presentHistoryToken,
                broadcastContextCount = broadcastContextCount,
                broadcastContext = broadcastContext,
                pPrivateDriverDataCtorArg = pPrivateDriverData,
                privateDriverDataSize = privateDriverDataSize,
                numPrimaries = numPrimaries,
                writtenPrimaries = writtenPrimaries,
                numHistoryBuffers = numHistoryBuffers,
                historyBufferArrayCtorArg = historyBufferArray,
            )
    }
}

public data class D3dkmtSubmitcommandflags(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSubmitcommandflags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSubmitcommandflags> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtSubmitcommandflags =
                    D3dkmtSubmitcommandflags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtSubmitcommandflags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class D3dkmtSubmitcommandtohwqueue internal constructor(
    public var hHwQueue: UInt,
    public var hwQueueProgressFenceId: ULong,
    public var commandBuffer: ULong,
    public var commandLength: UInt,
    public var privateDriverDataSize: UInt,
    pPrivateDriverDataCtorArg: MutPtr,
    public var numPrimaries: UInt,
    writtenPrimariesCtorArg: ConstPtr,
) {
    public var pPrivateDriverData: MutPtr = pPrivateDriverDataCtorArg
        internal set

    public var writtenPrimaries: ConstPtr = writtenPrimariesCtorArg
        internal set

    public constructor() : this(
        hHwQueue = 0u,
        hwQueueProgressFenceId = 0uL,
        commandBuffer = 0uL,
        commandLength = 0u,
        privateDriverDataSize = 0u,
        pPrivateDriverDataCtorArg = MutPtr(0L),
        numPrimaries = 0u,
        writtenPrimariesCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.hHwQueue

    public operator fun component2(): ULong = this.hwQueueProgressFenceId

    public operator fun component3(): ULong = this.commandBuffer

    public operator fun component4(): UInt = this.commandLength

    public operator fun component5(): UInt = this.privateDriverDataSize

    public operator fun component6(): MutPtr = this.pPrivateDriverData

    public operator fun component7(): UInt = this.numPrimaries

    public operator fun component8(): ConstPtr = this.writtenPrimaries

    public fun copy(hHwQueue: UInt = this.hHwQueue, hwQueueProgressFenceId: ULong = this.hwQueueProgressFenceId, commandBuffer: ULong = this.commandBuffer, commandLength: UInt = this.commandLength, privateDriverDataSize: UInt = this.privateDriverDataSize, pPrivateDriverData: MutPtr = this.pPrivateDriverData, numPrimaries: UInt = this.numPrimaries, writtenPrimaries: ConstPtr = this.writtenPrimaries): D3dkmtSubmitcommandtohwqueue = D3dkmtSubmitcommandtohwqueue(hHwQueue = hHwQueue, hwQueueProgressFenceId = hwQueueProgressFenceId, commandBuffer = commandBuffer, commandLength = commandLength, privateDriverDataSize = privateDriverDataSize, pPrivateDriverDataCtorArg = pPrivateDriverData, numPrimaries = numPrimaries, writtenPrimariesCtorArg = writtenPrimaries)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtSubmitcommandtohwqueue) return false
        if (this.hHwQueue != other.hHwQueue) return false
        if (this.hwQueueProgressFenceId != other.hwQueueProgressFenceId) return false
        if (this.commandBuffer != other.commandBuffer) return false
        if (this.commandLength != other.commandLength) return false
        if (this.privateDriverDataSize != other.privateDriverDataSize) return false
        if (this.pPrivateDriverData != other.pPrivateDriverData) return false
        if (this.numPrimaries != other.numPrimaries) return false
        if (this.writtenPrimaries != other.writtenPrimaries) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hHwQueue.hashCode()
        result = 31 * result + this.hwQueueProgressFenceId.hashCode()
        result = 31 * result + this.commandBuffer.hashCode()
        result = 31 * result + this.commandLength.hashCode()
        result = 31 * result + this.privateDriverDataSize.hashCode()
        result = 31 * result + this.pPrivateDriverData.hashCode()
        result = 31 * result + this.numPrimaries.hashCode()
        result = 31 * result + this.writtenPrimaries.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSubmitcommandtohwqueue> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSubmitcommandtohwqueue> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): D3dkmtSubmitcommandtohwqueue =
                    D3dkmtSubmitcommandtohwqueue(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtSubmitcommandtohwqueue) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hHwQueue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.hwQueueProgressFenceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.commandBuffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.commandLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.privateDriverDataSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.pPrivateDriverData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.numPrimaries)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr + 48L, value.writtenPrimaries)
                }
            }

        public operator fun invoke(
            hHwQueue: UInt = 0u,
            hwQueueProgressFenceId: ULong = 0uL,
            commandBuffer: ULong = 0uL,
            commandLength: UInt = 0u,
            privateDriverDataSize: UInt = 0u,
            pPrivateDriverData: MutPtr = MutPtr(0L),
            numPrimaries: UInt = 0u,
            writtenPrimaries: ConstPtr = ConstPtr(0L),
        ): D3dkmtSubmitcommandtohwqueue =
            D3dkmtSubmitcommandtohwqueue(
                hHwQueue = hHwQueue,
                hwQueueProgressFenceId = hwQueueProgressFenceId,
                commandBuffer = commandBuffer,
                commandLength = commandLength,
                privateDriverDataSize = privateDriverDataSize,
                pPrivateDriverDataCtorArg = pPrivateDriverData,
                numPrimaries = numPrimaries,
                writtenPrimariesCtorArg = writtenPrimaries,
            )
    }
}

public data class D3dkmtSubmitpresentblttohwqueue(
    public var hHwQueue: UInt = 0u,
    public var hwQueueProgressFenceId: ULong = 0uL,
    public var privatePresentData: D3dkmtPresent = D3dkmtPresent(),
)

public class D3dkmtSubmitpresenttohwqueue internal constructor(
    hHwQueuesCtorArg: MutPtr,
    public var privatePresentData: D3dkmtPresent,
) {
    public var hHwQueues: MutPtr = hHwQueuesCtorArg
        internal set

    public constructor() : this(
        hHwQueuesCtorArg = MutPtr(0L),
        privatePresentData = D3dkmtPresent(),
    )

    public operator fun component1(): MutPtr = this.hHwQueues

    public operator fun component2(): D3dkmtPresent = this.privatePresentData

    public fun copy(hHwQueues: MutPtr = this.hHwQueues, privatePresentData: D3dkmtPresent = this.privatePresentData): D3dkmtSubmitpresenttohwqueue = D3dkmtSubmitpresenttohwqueue(hHwQueuesCtorArg = hHwQueues, privatePresentData = privatePresentData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtSubmitpresenttohwqueue) return false
        if (this.hHwQueues != other.hHwQueues) return false
        if (this.privatePresentData != other.privatePresentData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hHwQueues.hashCode()
        result = 31 * result + this.privatePresentData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hHwQueues: MutPtr = MutPtr(0L),
            privatePresentData: D3dkmtPresent = D3dkmtPresent(),
        ): D3dkmtSubmitpresenttohwqueue =
            D3dkmtSubmitpresenttohwqueue(
                hHwQueuesCtorArg = hHwQueues,
                privatePresentData = privatePresentData,
            )
    }
}

public class D3dkmtSubmitsignalsyncobjectstohwqueue internal constructor(
    public var flags: D3dddicbSignalflags,
    public var broadcastHwQueueCount: UInt,
    broadcastHwQueueArrayCtorArg: ConstPtr,
    public var objectCount: UInt,
    objectHandleArrayCtorArg: ConstPtr,
    fenceValueArrayCtorArg: ConstPtr,
) {
    public var broadcastHwQueueArray: ConstPtr = broadcastHwQueueArrayCtorArg
        internal set

    public var objectHandleArray: ConstPtr = objectHandleArrayCtorArg
        internal set

    public var fenceValueArray: ConstPtr = fenceValueArrayCtorArg
        internal set

    public constructor() : this(
        flags = D3dddicbSignalflags(),
        broadcastHwQueueCount = 0u,
        broadcastHwQueueArrayCtorArg = ConstPtr(0L),
        objectCount = 0u,
        objectHandleArrayCtorArg = ConstPtr(0L),
        fenceValueArrayCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): D3dddicbSignalflags = this.flags

    public operator fun component2(): UInt = this.broadcastHwQueueCount

    public operator fun component3(): ConstPtr = this.broadcastHwQueueArray

    public operator fun component4(): UInt = this.objectCount

    public operator fun component5(): ConstPtr = this.objectHandleArray

    public operator fun component6(): ConstPtr = this.fenceValueArray

    public fun copy(flags: D3dddicbSignalflags = this.flags, broadcastHwQueueCount: UInt = this.broadcastHwQueueCount, broadcastHwQueueArray: ConstPtr = this.broadcastHwQueueArray, objectCount: UInt = this.objectCount, objectHandleArray: ConstPtr = this.objectHandleArray, fenceValueArray: ConstPtr = this.fenceValueArray): D3dkmtSubmitsignalsyncobjectstohwqueue = D3dkmtSubmitsignalsyncobjectstohwqueue(flags = flags, broadcastHwQueueCount = broadcastHwQueueCount, broadcastHwQueueArrayCtorArg = broadcastHwQueueArray, objectCount = objectCount, objectHandleArrayCtorArg = objectHandleArray, fenceValueArrayCtorArg = fenceValueArray)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtSubmitsignalsyncobjectstohwqueue) return false
        if (this.flags != other.flags) return false
        if (this.broadcastHwQueueCount != other.broadcastHwQueueCount) return false
        if (this.broadcastHwQueueArray != other.broadcastHwQueueArray) return false
        if (this.objectCount != other.objectCount) return false
        if (this.objectHandleArray != other.objectHandleArray) return false
        if (this.fenceValueArray != other.fenceValueArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.broadcastHwQueueCount.hashCode()
        result = 31 * result + this.broadcastHwQueueArray.hashCode()
        result = 31 * result + this.objectCount.hashCode()
        result = 31 * result + this.objectHandleArray.hashCode()
        result = 31 * result + this.fenceValueArray.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: D3dddicbSignalflags = D3dddicbSignalflags(),
            broadcastHwQueueCount: UInt = 0u,
            broadcastHwQueueArray: ConstPtr = ConstPtr(0L),
            objectCount: UInt = 0u,
            objectHandleArray: ConstPtr = ConstPtr(0L),
            fenceValueArray: ConstPtr = ConstPtr(0L),
        ): D3dkmtSubmitsignalsyncobjectstohwqueue =
            D3dkmtSubmitsignalsyncobjectstohwqueue(
                flags = flags,
                broadcastHwQueueCount = broadcastHwQueueCount,
                broadcastHwQueueArrayCtorArg = broadcastHwQueueArray,
                objectCount = objectCount,
                objectHandleArrayCtorArg = objectHandleArray,
                fenceValueArrayCtorArg = fenceValueArray,
            )
    }
}

public class D3dkmtSubmitwaitforsyncobjectstohwqueue internal constructor(
    public var hHwQueue: UInt,
    public var objectCount: UInt,
    objectHandleArrayCtorArg: ConstPtr,
    fenceValueArrayCtorArg: ConstPtr,
) {
    public var objectHandleArray: ConstPtr = objectHandleArrayCtorArg
        internal set

    public var fenceValueArray: ConstPtr = fenceValueArrayCtorArg
        internal set

    public constructor() : this(
        hHwQueue = 0u,
        objectCount = 0u,
        objectHandleArrayCtorArg = ConstPtr(0L),
        fenceValueArrayCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.hHwQueue

    public operator fun component2(): UInt = this.objectCount

    public operator fun component3(): ConstPtr = this.objectHandleArray

    public operator fun component4(): ConstPtr = this.fenceValueArray

    public fun copy(hHwQueue: UInt = this.hHwQueue, objectCount: UInt = this.objectCount, objectHandleArray: ConstPtr = this.objectHandleArray, fenceValueArray: ConstPtr = this.fenceValueArray): D3dkmtSubmitwaitforsyncobjectstohwqueue = D3dkmtSubmitwaitforsyncobjectstohwqueue(hHwQueue = hHwQueue, objectCount = objectCount, objectHandleArrayCtorArg = objectHandleArray, fenceValueArrayCtorArg = fenceValueArray)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtSubmitwaitforsyncobjectstohwqueue) return false
        if (this.hHwQueue != other.hHwQueue) return false
        if (this.objectCount != other.objectCount) return false
        if (this.objectHandleArray != other.objectHandleArray) return false
        if (this.fenceValueArray != other.fenceValueArray) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hHwQueue.hashCode()
        result = 31 * result + this.objectCount.hashCode()
        result = 31 * result + this.objectHandleArray.hashCode()
        result = 31 * result + this.fenceValueArray.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSubmitwaitforsyncobjectstohwqueue> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSubmitwaitforsyncobjectstohwqueue> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): D3dkmtSubmitwaitforsyncobjectstohwqueue =
                    D3dkmtSubmitwaitforsyncobjectstohwqueue(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtSubmitwaitforsyncobjectstohwqueue) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hHwQueue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.objectCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr + 8L, value.objectHandleArray)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr + 16L, value.fenceValueArray)
                }
            }

        public operator fun invoke(
            hHwQueue: UInt = 0u,
            objectCount: UInt = 0u,
            objectHandleArray: ConstPtr = ConstPtr(0L),
            fenceValueArray: ConstPtr = ConstPtr(0L),
        ): D3dkmtSubmitwaitforsyncobjectstohwqueue =
            D3dkmtSubmitwaitforsyncobjectstohwqueue(
                hHwQueue = hHwQueue,
                objectCount = objectCount,
                objectHandleArrayCtorArg = objectHandleArray,
                fenceValueArrayCtorArg = fenceValueArray,
            )
    }
}

public data class D3dkmtSurfacecompletePresenthistorytoken(
    public var hLogicalSurface: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSurfacecompletePresenthistorytoken> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtSurfacecompletePresenthistorytoken> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtSurfacecompletePresenthistorytoken =
                    D3dkmtSurfacecompletePresenthistorytoken(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtSurfacecompletePresenthistorytoken) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.hLogicalSurface)
                }
            }
    }
}

public data class D3dkmtTdrdbgctrlEscape(
    public var tdrControl: D3dkmtTdrdbgctrltype = 0,
    public var anonymous: D3dkmtTdrdbgctrlEscape0 = D3dkmtTdrdbgctrlEscape0(),
)

public data class D3dkmtTdrdbgctrlEscape0(
    public var nodeOrdinal: UInt = 0u,
)

public data class D3dkmtTrackedworkloadSupport(
    public var physicalAdapterIndex: UInt = 0u,
    public var engineType: DxgkEngineType = 0,
    public var support: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtTrackedworkloadSupport> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtTrackedworkloadSupport> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): D3dkmtTrackedworkloadSupport =
                    D3dkmtTrackedworkloadSupport(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtTrackedworkloadSupport) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.physicalAdapterIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.engineType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.support)
                }
            }
    }
}

public class D3dkmtTrimnotification internal constructor(
    contextCtorArg: MutPtr,
    public var flags: D3dddiTrimresidencysetFlags,
    public var numBytesToTrim: ULong,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        contextCtorArg = MutPtr(0L),
        flags = D3dddiTrimresidencysetFlags(),
        numBytesToTrim = 0uL,
    )

    public operator fun component1(): MutPtr = this.context

    public operator fun component2(): D3dddiTrimresidencysetFlags = this.flags

    public operator fun component3(): ULong = this.numBytesToTrim

    public fun copy(context: MutPtr = this.context, flags: D3dddiTrimresidencysetFlags = this.flags, numBytesToTrim: ULong = this.numBytesToTrim): D3dkmtTrimnotification = D3dkmtTrimnotification(contextCtorArg = context, flags = flags, numBytesToTrim = numBytesToTrim)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtTrimnotification) return false
        if (this.context != other.context) return false
        if (this.flags != other.flags) return false
        if (this.numBytesToTrim != other.numBytesToTrim) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.context.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.numBytesToTrim.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            context: MutPtr = MutPtr(0L),
            flags: D3dddiTrimresidencysetFlags = D3dddiTrimresidencysetFlags(),
            numBytesToTrim: ULong = 0uL,
        ): D3dkmtTrimnotification =
            D3dkmtTrimnotification(
                contextCtorArg = context,
                flags = flags,
                numBytesToTrim = numBytesToTrim,
            )
    }
}

public class D3dkmtTrimprocesscommitment internal constructor(
    public var cbSize: UInt,
    hProcessCtorArg: Handle,
    public var flags: D3dkmtTrimprocesscommitmentFlags,
    public var decommitRequested: ULong,
    public var numBytesDecommitted: ULong,
) {
    public var hProcess: Handle = hProcessCtorArg
        internal set

    public constructor() : this(
        cbSize = 0u,
        hProcessCtorArg = MutPtr(0L),
        flags = D3dkmtTrimprocesscommitmentFlags(),
        decommitRequested = 0uL,
        numBytesDecommitted = 0uL,
    )

    public operator fun component1(): UInt = this.cbSize

    public operator fun component2(): Handle = this.hProcess

    public operator fun component3(): D3dkmtTrimprocesscommitmentFlags = this.flags

    public operator fun component4(): ULong = this.decommitRequested

    public operator fun component5(): ULong = this.numBytesDecommitted

    public fun copy(cbSize: UInt = this.cbSize, hProcess: Handle = this.hProcess, flags: D3dkmtTrimprocesscommitmentFlags = this.flags, decommitRequested: ULong = this.decommitRequested, numBytesDecommitted: ULong = this.numBytesDecommitted): D3dkmtTrimprocesscommitment = D3dkmtTrimprocesscommitment(cbSize = cbSize, hProcessCtorArg = hProcess, flags = flags, decommitRequested = decommitRequested, numBytesDecommitted = numBytesDecommitted)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtTrimprocesscommitment) return false
        if (this.cbSize != other.cbSize) return false
        if (this.hProcess != other.hProcess) return false
        if (this.flags != other.flags) return false
        if (this.decommitRequested != other.decommitRequested) return false
        if (this.numBytesDecommitted != other.numBytesDecommitted) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.hProcess.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.decommitRequested.hashCode()
        result = 31 * result + this.numBytesDecommitted.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: UInt = 0u,
            hProcess: Handle = MutPtr(0L),
            flags: D3dkmtTrimprocesscommitmentFlags = D3dkmtTrimprocesscommitmentFlags(),
            decommitRequested: ULong = 0uL,
            numBytesDecommitted: ULong = 0uL,
        ): D3dkmtTrimprocesscommitment =
            D3dkmtTrimprocesscommitment(
                cbSize = cbSize,
                hProcessCtorArg = hProcess,
                flags = flags,
                decommitRequested = decommitRequested,
                numBytesDecommitted = numBytesDecommitted,
            )
    }
}

public data class D3dkmtTrimprocesscommitmentFlags(
    public var anonymous: D3dkmtTrimprocesscommitmentFlags0 = D3dkmtTrimprocesscommitmentFlags0(),
    public var value: UInt = 0u,
)

public data class D3dkmtTrimprocesscommitmentFlags0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtTrimprocesscommitmentFlags0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtTrimprocesscommitmentFlags0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtTrimprocesscommitmentFlags0 =
                    D3dkmtTrimprocesscommitmentFlags0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtTrimprocesscommitmentFlags0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtUmdfilenameinfo(
    public var version: Kmtumdversion = 0,
    public var umdFileName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtUmdfilenameinfo) return false
        if (this.version != other.version) return false
        if (!this.umdFileName.contentEquals(other.umdFileName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.umdFileName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtUmdfilenameinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtUmdfilenameinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 524L
                override fun readNative(addr: Long): D3dkmtUmdfilenameinfo =
                    D3dkmtUmdfilenameinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: D3dkmtUmdfilenameinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.version)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 4L, value.umdFileName.toList())
                }
            }
    }
}

public data class D3dkmtUmdDriverVersion(
    public var driverVersion: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtUmdDriverVersion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtUmdDriverVersion> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtUmdDriverVersion =
                    D3dkmtUmdDriverVersion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtUmdDriverVersion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.driverVersion)
                }
            }
    }
}

public class D3dkmtUnlock internal constructor(
    public var hDevice: UInt,
    public var numAllocations: UInt,
    phAllocationsCtorArg: ConstPtr,
) {
    public var phAllocations: ConstPtr = phAllocationsCtorArg
        internal set

    public constructor() : this(
        hDevice = 0u,
        numAllocations = 0u,
        phAllocationsCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): UInt = this.hDevice

    public operator fun component2(): UInt = this.numAllocations

    public operator fun component3(): ConstPtr = this.phAllocations

    public fun copy(hDevice: UInt = this.hDevice, numAllocations: UInt = this.numAllocations, phAllocations: ConstPtr = this.phAllocations): D3dkmtUnlock = D3dkmtUnlock(hDevice = hDevice, numAllocations = numAllocations, phAllocationsCtorArg = phAllocations)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtUnlock) return false
        if (this.hDevice != other.hDevice) return false
        if (this.numAllocations != other.numAllocations) return false
        if (this.phAllocations != other.phAllocations) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDevice.hashCode()
        result = 31 * result + this.numAllocations.hashCode()
        result = 31 * result + this.phAllocations.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtUnlock> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtUnlock> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): D3dkmtUnlock =
                    D3dkmtUnlock(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtUnlock) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hDevice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numAllocations)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr + 8L, value.phAllocations)
                }
            }

        public operator fun invoke(
            hDevice: UInt = 0u,
            numAllocations: UInt = 0u,
            phAllocations: ConstPtr = ConstPtr(0L),
        ): D3dkmtUnlock =
            D3dkmtUnlock(
                hDevice = hDevice,
                numAllocations = numAllocations,
                phAllocationsCtorArg = phAllocations,
            )
    }
}

public data class D3dkmtUnlock2(
    public var hDevice: UInt = 0u,
    public var hAllocation: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtUnlock2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtUnlock2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtUnlock2 =
                    D3dkmtUnlock2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtUnlock2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hDevice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hAllocation)
                }
            }
    }
}

public class D3dkmtUnpindirectflipresources internal constructor(
    public var hDevice: UInt,
    public var resourceCount: UInt,
    pResourceListCtorArg: MutPtr,
) {
    public var pResourceList: MutPtr = pResourceListCtorArg
        internal set

    public constructor() : this(
        hDevice = 0u,
        resourceCount = 0u,
        pResourceListCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.hDevice

    public operator fun component2(): UInt = this.resourceCount

    public operator fun component3(): MutPtr = this.pResourceList

    public fun copy(hDevice: UInt = this.hDevice, resourceCount: UInt = this.resourceCount, pResourceList: MutPtr = this.pResourceList): D3dkmtUnpindirectflipresources = D3dkmtUnpindirectflipresources(hDevice = hDevice, resourceCount = resourceCount, pResourceListCtorArg = pResourceList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtUnpindirectflipresources) return false
        if (this.hDevice != other.hDevice) return false
        if (this.resourceCount != other.resourceCount) return false
        if (this.pResourceList != other.pResourceList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDevice.hashCode()
        result = 31 * result + this.resourceCount.hashCode()
        result = 31 * result + this.pResourceList.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtUnpindirectflipresources> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtUnpindirectflipresources> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): D3dkmtUnpindirectflipresources =
                    D3dkmtUnpindirectflipresources(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtUnpindirectflipresources) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hDevice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.resourceCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pResourceList)
                }
            }

        public operator fun invoke(
            hDevice: UInt = 0u,
            resourceCount: UInt = 0u,
            pResourceList: MutPtr = MutPtr(0L),
        ): D3dkmtUnpindirectflipresources =
            D3dkmtUnpindirectflipresources(
                hDevice = hDevice,
                resourceCount = resourceCount,
                pResourceListCtorArg = pResourceList,
            )
    }
}

public class D3dkmtUnregisterbudgetchangenotification internal constructor(
    handleCtorArg: MutPtr,
) {
    public var handle: MutPtr = handleCtorArg
        internal set

    public constructor() : this(
        handleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.handle

    public fun copy(handle: MutPtr = this.handle): D3dkmtUnregisterbudgetchangenotification = D3dkmtUnregisterbudgetchangenotification(handleCtorArg = handle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtUnregisterbudgetchangenotification) return false
        if (this.handle != other.handle) return false
        return true
    }

    override fun hashCode(): Int = this.handle.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtUnregisterbudgetchangenotification> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtUnregisterbudgetchangenotification> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtUnregisterbudgetchangenotification =
                    D3dkmtUnregisterbudgetchangenotification(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtUnregisterbudgetchangenotification) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.handle)
                }
            }

        public operator fun invoke(
            handle: MutPtr = MutPtr(0L),
        ): D3dkmtUnregisterbudgetchangenotification =
            D3dkmtUnregisterbudgetchangenotification(
                handleCtorArg = handle,
            )
    }
}

public class D3dkmtUnregistertrimnotification internal constructor(
    handleCtorArg: MutPtr,
    public var callback: Pfnd3dkmtTrimnotificationcallback,
) {
    public var handle: MutPtr = handleCtorArg
        internal set

    public constructor() : this(
        handleCtorArg = MutPtr(0L),
        callback = null,
    )

    public operator fun component1(): MutPtr = this.handle

    public operator fun component2(): Pfnd3dkmtTrimnotificationcallback = this.callback

    public fun copy(handle: MutPtr = this.handle, callback: Pfnd3dkmtTrimnotificationcallback = this.callback): D3dkmtUnregistertrimnotification = D3dkmtUnregistertrimnotification(handleCtorArg = handle, callback = callback)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtUnregistertrimnotification) return false
        if (this.handle != other.handle) return false
        if (this.callback != other.callback) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.handle.hashCode()
        result = 31 * result + this.callback.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            handle: MutPtr = MutPtr(0L),
            callback: Pfnd3dkmtTrimnotificationcallback = null,
        ): D3dkmtUnregistertrimnotification =
            D3dkmtUnregistertrimnotification(
                handleCtorArg = handle,
                callback = callback,
            )
    }
}

public class D3dkmtUpdategpuvirtualaddress internal constructor(
    public var hDevice: UInt,
    public var hContext: UInt,
    public var hFenceObject: UInt,
    public var numOperations: UInt,
    operationsCtorArg: MutPtr,
    public var reserved0: Int,
    public var reserved1: ULong,
    public var fenceValue: ULong,
    public var flags: D3dkmtUpdategpuvirtualaddress0,
) {
    public var operations: MutPtr = operationsCtorArg
        internal set

    public constructor() : this(
        hDevice = 0u,
        hContext = 0u,
        hFenceObject = 0u,
        numOperations = 0u,
        operationsCtorArg = MutPtr(0L),
        reserved0 = 0,
        reserved1 = 0uL,
        fenceValue = 0uL,
        flags = D3dkmtUpdategpuvirtualaddress0(),
    )

    public operator fun component1(): UInt = this.hDevice

    public operator fun component2(): UInt = this.hContext

    public operator fun component3(): UInt = this.hFenceObject

    public operator fun component4(): UInt = this.numOperations

    public operator fun component5(): MutPtr = this.operations

    public operator fun component6(): Int = this.reserved0

    public operator fun component7(): ULong = this.reserved1

    public operator fun component8(): ULong = this.fenceValue

    public operator fun component9(): D3dkmtUpdategpuvirtualaddress0 = this.flags

    public fun copy(hDevice: UInt = this.hDevice, hContext: UInt = this.hContext, hFenceObject: UInt = this.hFenceObject, numOperations: UInt = this.numOperations, operations: MutPtr = this.operations, reserved0: Int = this.reserved0, reserved1: ULong = this.reserved1, fenceValue: ULong = this.fenceValue, flags: D3dkmtUpdategpuvirtualaddress0 = this.flags): D3dkmtUpdategpuvirtualaddress = D3dkmtUpdategpuvirtualaddress(hDevice = hDevice, hContext = hContext, hFenceObject = hFenceObject, numOperations = numOperations, operationsCtorArg = operations, reserved0 = reserved0, reserved1 = reserved1, fenceValue = fenceValue, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtUpdategpuvirtualaddress) return false
        if (this.hDevice != other.hDevice) return false
        if (this.hContext != other.hContext) return false
        if (this.hFenceObject != other.hFenceObject) return false
        if (this.numOperations != other.numOperations) return false
        if (this.operations != other.operations) return false
        if (this.reserved0 != other.reserved0) return false
        if (this.reserved1 != other.reserved1) return false
        if (this.fenceValue != other.fenceValue) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDevice.hashCode()
        result = 31 * result + this.hContext.hashCode()
        result = 31 * result + this.hFenceObject.hashCode()
        result = 31 * result + this.numOperations.hashCode()
        result = 31 * result + this.operations.hashCode()
        result = 31 * result + this.reserved0.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.fenceValue.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hDevice: UInt = 0u,
            hContext: UInt = 0u,
            hFenceObject: UInt = 0u,
            numOperations: UInt = 0u,
            operations: MutPtr = MutPtr(0L),
            reserved0: Int = 0,
            reserved1: ULong = 0uL,
            fenceValue: ULong = 0uL,
            flags: D3dkmtUpdategpuvirtualaddress0 = D3dkmtUpdategpuvirtualaddress0(),
        ): D3dkmtUpdategpuvirtualaddress =
            D3dkmtUpdategpuvirtualaddress(
                hDevice = hDevice,
                hContext = hContext,
                hFenceObject = hFenceObject,
                numOperations = numOperations,
                operationsCtorArg = operations,
                reserved0 = reserved0,
                reserved1 = reserved1,
                fenceValue = fenceValue,
                flags = flags,
            )
    }
}

public data class D3dkmtUpdategpuvirtualaddress0(
    public var anonymous: D3dkmtUpdategpuvirtualaddress00 = D3dkmtUpdategpuvirtualaddress00(),
    public var value: UInt = 0u,
)

public data class D3dkmtUpdategpuvirtualaddress00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtUpdategpuvirtualaddress00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtUpdategpuvirtualaddress00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtUpdategpuvirtualaddress00 =
                    D3dkmtUpdategpuvirtualaddress00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtUpdategpuvirtualaddress00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtUpdateoverlay(
    public var hDevice: UInt = 0u,
    public var hOverlay: UInt = 0u,
    public var overlayInfo: D3dddiKerneloverlayinfo = D3dddiKerneloverlayinfo(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtUpdateoverlay> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtUpdateoverlay> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): D3dkmtUpdateoverlay =
                    D3dkmtUpdateoverlay(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (D3dddiKerneloverlayinfo.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtUpdateoverlay) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hDevice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hOverlay)
                    (D3dddiKerneloverlayinfo.typeLayout()).writeNative(addr + 8L, value.overlayInfo)
                }
            }
    }
}

public data class D3dkmtVadDesc(
    public var vadIndex: UInt = 0u,
    public var vadAddress: ULong = 0uL,
    public var numMappedRanges: UInt = 0u,
    public var vadType: UInt = 0u,
    public var startAddress: ULong = 0uL,
    public var endAddress: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVadDesc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVadDesc> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): D3dkmtVadDesc =
                    D3dkmtVadDesc(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtVadDesc) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.vadIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.vadAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.numMappedRanges)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.vadType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.startAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.endAddress)
                }
            }
    }
}

public data class D3dkmtVaRangeDesc(
    public var vadAddress: ULong = 0uL,
    public var vaRangeIndex: UInt = 0u,
    public var physicalAdapterIndex: UInt = 0u,
    public var startAddress: ULong = 0uL,
    public var endAddress: ULong = 0uL,
    public var driverProtection: ULong = 0uL,
    public var ownerType: UInt = 0u,
    public var pOwner: ULong = 0uL,
    public var ownerOffset: ULong = 0uL,
    public var protection: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVaRangeDesc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVaRangeDesc> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): D3dkmtVaRangeDesc =
                    D3dkmtVaRangeDesc(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtVaRangeDesc) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.vadAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.vaRangeIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.physicalAdapterIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.startAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.endAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.driverProtection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.ownerType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.pOwner)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.ownerOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.protection)
                }
            }
    }
}

public data class D3dkmtVgpuinterfaceid(
    public var virtualGpuIntefaceId: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtVgpuinterfaceid) return false
        if (!this.virtualGpuIntefaceId.contentEquals(other.virtualGpuIntefaceId)) return false
        return true
    }

    override fun hashCode(): Int = this.virtualGpuIntefaceId.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVgpuinterfaceid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVgpuinterfaceid> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 520L
                override fun readNative(addr: Long): D3dkmtVgpuinterfaceid =
                    D3dkmtVgpuinterfaceid(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: D3dkmtVgpuinterfaceid) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr, value.virtualGpuIntefaceId.toList())
                }
            }
    }
}

public data class D3dkmtVidmmEscape(
    public var type: D3dkmtVidmmescapetype = 0,
    public var anonymous: D3dkmtVidmmEscape0 = D3dkmtVidmmEscape0(),
)

public data class D3dkmtVidmmEscape0(
    public var setFault: D3dkmtVidmmEscape00 = D3dkmtVidmmEscape00(),
    public var evict: D3dkmtVidmmEscape01 = D3dkmtVidmmEscape01(),
    public var evictByNtHandle: D3dkmtVidmmEscape02 = D3dkmtVidmmEscape02(),
    public var getVads: D3dkmtVidmmEscape03 = D3dkmtVidmmEscape03(),
    public var setBudget: D3dkmtVidmmEscape04 = D3dkmtVidmmEscape04(),
    public var suspendProcess: D3dkmtVidmmEscape05 = D3dkmtVidmmEscape05(),
    public var resumeProcess: D3dkmtVidmmEscape06 = D3dkmtVidmmEscape06(),
    public var getBudget: D3dkmtVidmmEscape07 = D3dkmtVidmmEscape07(),
    public var setTrimIntervals: D3dkmtVidmmEscape08 = D3dkmtVidmmEscape08(),
    public var evictByCriteria: D3dkmtEvictionCriteria = D3dkmtEvictionCriteria(),
    public var wake: D3dkmtVidmmEscape09 = D3dkmtVidmmEscape09(),
    public var defrag: D3dkmtVidmmEscape010 = D3dkmtVidmmEscape010(),
    public var delayExecution: D3dkmtVidmmEscape011 = D3dkmtVidmmEscape011(),
    public var verifyIntegrity: D3dkmtVidmmEscape012 = D3dkmtVidmmEscape012(),
    public var delayedEvictionConfig: D3dkmtVidmmEscape013 = D3dkmtVidmmEscape013(),
)

public data class D3dkmtVidmmEscape010(
    public var operation: D3dkmtDefragEscapeOperation = 0,
    public var segmentId: UInt = 0u,
    public var totalCommitted: ULong = 0uL,
    public var totalFree: ULong = 0uL,
    public var largestGapBefore: ULong = 0uL,
    public var largestGapAfter: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVidmmEscape010> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVidmmEscape010> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): D3dkmtVidmmEscape010 =
                    D3dkmtVidmmEscape010(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtVidmmEscape010) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.operation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.segmentId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.totalCommitted)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.totalFree)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.largestGapBefore)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.largestGapAfter)
                }
            }
    }
}

public data class D3dkmtVidmmEscape011(
    public var hPagingQueue: UInt = 0u,
    public var physicalAdapterIndex: UInt = 0u,
    public var milliseconds: UInt = 0u,
    public var pagingFenceValue: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVidmmEscape011> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVidmmEscape011> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): D3dkmtVidmmEscape011 =
                    D3dkmtVidmmEscape011(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtVidmmEscape011) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hPagingQueue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.physicalAdapterIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.milliseconds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.pagingFenceValue)
                }
            }
    }
}

public data class D3dkmtVidmmEscape013(
    public var timerValue: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVidmmEscape013> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVidmmEscape013> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtVidmmEscape013 =
                    D3dkmtVidmmEscape013(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtVidmmEscape013) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.timerValue)
                }
            }
    }
}

public data class D3dkmtVidmmEscape02(
    public var ntHandle: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVidmmEscape02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVidmmEscape02> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtVidmmEscape02 =
                    D3dkmtVidmmEscape02(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtVidmmEscape02) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.ntHandle)
                }
            }
    }
}

public class D3dkmtVidmmEscape01 internal constructor(
    public var resourceHandle: UInt,
    public var allocationHandle: UInt,
    hProcessCtorArg: Handle,
) {
    public var hProcess: Handle = hProcessCtorArg
        internal set

    public constructor() : this(
        resourceHandle = 0u,
        allocationHandle = 0u,
        hProcessCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.resourceHandle

    public operator fun component2(): UInt = this.allocationHandle

    public operator fun component3(): Handle = this.hProcess

    public fun copy(resourceHandle: UInt = this.resourceHandle, allocationHandle: UInt = this.allocationHandle, hProcess: Handle = this.hProcess): D3dkmtVidmmEscape01 = D3dkmtVidmmEscape01(resourceHandle = resourceHandle, allocationHandle = allocationHandle, hProcessCtorArg = hProcess)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtVidmmEscape01) return false
        if (this.resourceHandle != other.resourceHandle) return false
        if (this.allocationHandle != other.allocationHandle) return false
        if (this.hProcess != other.hProcess) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.resourceHandle.hashCode()
        result = 31 * result + this.allocationHandle.hashCode()
        result = 31 * result + this.hProcess.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            resourceHandle: UInt = 0u,
            allocationHandle: UInt = 0u,
            hProcess: Handle = MutPtr(0L),
        ): D3dkmtVidmmEscape01 =
            D3dkmtVidmmEscape01(
                resourceHandle = resourceHandle,
                allocationHandle = allocationHandle,
                hProcessCtorArg = hProcess,
            )
    }
}

public data class D3dkmtVidmmEscape07(
    public var numBytesToTrim: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVidmmEscape07> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVidmmEscape07> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtVidmmEscape07 =
                    D3dkmtVidmmEscape07(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtVidmmEscape07) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.numBytesToTrim)
                }
            }
    }
}

public data class D3dkmtVidmmEscape03(
    public var anonymous: D3dkmtVidmmEscape030 = D3dkmtVidmmEscape030(),
    public var command: D3dkmtVadEscapeCommand = 0,
    public var status: Ntstatus = 0,
)

public data class D3dkmtVidmmEscape030(
    public var getNumVads: D3dkmtVidmmEscape0300 = D3dkmtVidmmEscape0300(),
    public var getVad: D3dkmtVadDesc = D3dkmtVadDesc(),
    public var getVadRange: D3dkmtVaRangeDesc = D3dkmtVaRangeDesc(),
    public var getGpuMmuCaps: D3dkmtGetGpummuCaps = D3dkmtGetGpummuCaps(),
    public var getPte: D3dkmtGetPte = D3dkmtGetPte(),
    public var getSegmentCaps: D3dkmtGetSegmentCaps = D3dkmtGetSegmentCaps(),
)

public data class D3dkmtVidmmEscape0300(
    public var numVads: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVidmmEscape0300> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVidmmEscape0300> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtVidmmEscape0300 =
                    D3dkmtVidmmEscape0300(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtVidmmEscape0300) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numVads)
                }
            }
    }
}

public class D3dkmtVidmmEscape06 internal constructor(
    hProcessCtorArg: Handle,
) {
    public var hProcess: Handle = hProcessCtorArg
        internal set

    public constructor() : this(
        hProcessCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.hProcess

    public fun copy(hProcess: Handle = this.hProcess): D3dkmtVidmmEscape06 = D3dkmtVidmmEscape06(hProcessCtorArg = hProcess)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtVidmmEscape06) return false
        if (this.hProcess != other.hProcess) return false
        return true
    }

    override fun hashCode(): Int = this.hProcess.hashCode()

    public companion object {
        public operator fun invoke(
            hProcess: Handle = MutPtr(0L),
        ): D3dkmtVidmmEscape06 =
            D3dkmtVidmmEscape06(
                hProcessCtorArg = hProcess,
            )
    }
}

public data class D3dkmtVidmmEscape04(
    public var localMemoryBudget: ULong = 0uL,
    public var systemMemoryBudget: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVidmmEscape04> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVidmmEscape04> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): D3dkmtVidmmEscape04 =
                    D3dkmtVidmmEscape04(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtVidmmEscape04) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.localMemoryBudget)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.systemMemoryBudget)
                }
            }
    }
}

public data class D3dkmtVidmmEscape00(
    public var anonymous: D3dkmtVidmmEscape000 = D3dkmtVidmmEscape000(),
)

public data class D3dkmtVidmmEscape000(
    public var anonymous: D3dkmtVidmmEscape0000 = D3dkmtVidmmEscape0000(),
    public var value: UInt = 0u,
)

public data class D3dkmtVidmmEscape0000(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVidmmEscape0000> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVidmmEscape0000> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtVidmmEscape0000 =
                    D3dkmtVidmmEscape0000(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtVidmmEscape0000) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtVidmmEscape08(
    public var minTrimInterval: UInt = 0u,
    public var maxTrimInterval: UInt = 0u,
    public var idleTrimInterval: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVidmmEscape08> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVidmmEscape08> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): D3dkmtVidmmEscape08 =
                    D3dkmtVidmmEscape08(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtVidmmEscape08) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.minTrimInterval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxTrimInterval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.idleTrimInterval)
                }
            }
    }
}

public class D3dkmtVidmmEscape05 internal constructor(
    hProcessCtorArg: Handle,
    public var bAllowWakeOnSubmission: Bool,
) {
    public var hProcess: Handle = hProcessCtorArg
        internal set

    public constructor() : this(
        hProcessCtorArg = MutPtr(0L),
        bAllowWakeOnSubmission = 0,
    )

    public operator fun component1(): Handle = this.hProcess

    public operator fun component2(): Bool = this.bAllowWakeOnSubmission

    public fun copy(hProcess: Handle = this.hProcess, bAllowWakeOnSubmission: Bool = this.bAllowWakeOnSubmission): D3dkmtVidmmEscape05 = D3dkmtVidmmEscape05(hProcessCtorArg = hProcess, bAllowWakeOnSubmission = bAllowWakeOnSubmission)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtVidmmEscape05) return false
        if (this.hProcess != other.hProcess) return false
        if (this.bAllowWakeOnSubmission != other.bAllowWakeOnSubmission) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hProcess.hashCode()
        result = 31 * result + this.bAllowWakeOnSubmission.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hProcess: Handle = MutPtr(0L),
            bAllowWakeOnSubmission: Bool = 0,
        ): D3dkmtVidmmEscape05 =
            D3dkmtVidmmEscape05(
                hProcessCtorArg = hProcess,
                bAllowWakeOnSubmission = bAllowWakeOnSubmission,
            )
    }
}

public data class D3dkmtVidmmEscape012(
    public var segmentId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVidmmEscape012> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVidmmEscape012> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtVidmmEscape012 =
                    D3dkmtVidmmEscape012(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtVidmmEscape012) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.segmentId)
                }
            }
    }
}

public data class D3dkmtVidmmEscape09(
    public var bFlush: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVidmmEscape09> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVidmmEscape09> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtVidmmEscape09 =
                    D3dkmtVidmmEscape09(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtVidmmEscape09) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.bFlush)
                }
            }
    }
}

public data class D3dkmtVidpnsourceownerFlags(
    public var anonymous: D3dkmtVidpnsourceownerFlags0 = D3dkmtVidpnsourceownerFlags0(),
)

public data class D3dkmtVidpnsourceownerFlags0(
    public var anonymous: D3dkmtVidpnsourceownerFlags00 = D3dkmtVidpnsourceownerFlags00(),
    public var value: UInt = 0u,
)

public data class D3dkmtVidpnsourceownerFlags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVidpnsourceownerFlags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVidpnsourceownerFlags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtVidpnsourceownerFlags00 =
                    D3dkmtVidpnsourceownerFlags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtVidpnsourceownerFlags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtVidschEscape(
    public var type: D3dkmtVidschescapetype = 0,
    public var anonymous: D3dkmtVidschEscape0 = D3dkmtVidschEscape0(),
    public var virtualRefreshRateControl: D3dkmtEscapeVirtualRefreshRate = D3dkmtEscapeVirtualRefreshRate(),
)

public data class D3dkmtVidschEscape0(
    public var preemptionControl: Bool = 0,
    public var enableContextDelay: Bool = 0,
    public var tdrControl2: D3dkmtVidschEscape00 = D3dkmtVidschEscape00(),
    public var suspendScheduler: Bool = 0,
    public var tdrControl: UInt = 0u,
    public var suspendTime: UInt = 0u,
    public var tdrLimit: D3dkmtVidschEscape01 = D3dkmtVidschEscape01(),
    public var pfnControl: D3dkmtEscapePfnControlCommand = 0,
)

public data class D3dkmtVidschEscape00(
    public var tdrControl: UInt = 0u,
    public var anonymous: D3dkmtVidschEscape000 = D3dkmtVidschEscape000(),
)

public data class D3dkmtVidschEscape000(
    public var nodeOrdinal: UInt = 0u,
)

public data class D3dkmtVidschEscape01(
    public var count: UInt = 0u,
    public var time: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVidschEscape01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVidschEscape01> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtVidschEscape01 =
                    D3dkmtVidschEscape01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtVidschEscape01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.count)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.time)
                }
            }
    }
}

public data class D3dkmtVirtualaddressflags(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVirtualaddressflags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVirtualaddressflags> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtVirtualaddressflags =
                    D3dkmtVirtualaddressflags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtVirtualaddressflags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtVirtualaddressinfo(
    public var virtualAddressFlags: D3dkmtVirtualaddressflags = D3dkmtVirtualaddressflags(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVirtualaddressinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtVirtualaddressinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtVirtualaddressinfo =
                    D3dkmtVirtualaddressinfo(
                        (D3dkmtVirtualaddressflags.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtVirtualaddressinfo) {
                    (D3dkmtVirtualaddressflags.typeLayout()).writeNative(addr, value.virtualAddressFlags)
                }
            }
    }
}

public data class D3dkmtWaitforidle(
    public var hDevice: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtWaitforidle> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtWaitforidle> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtWaitforidle =
                    D3dkmtWaitforidle(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtWaitforidle) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hDevice)
                }
            }
    }
}

public data class D3dkmtWaitforsynchronizationobject(
    public var hContext: UInt = 0u,
    public var objectCount: UInt = 0u,
    public var objectHandleArray: UIntArray = UIntArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtWaitforsynchronizationobject) return false
        if (this.hContext != other.hContext) return false
        if (this.objectCount != other.objectCount) return false
        if (!this.objectHandleArray.contentEquals(other.objectHandleArray)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hContext.hashCode()
        result = 31 * result + this.objectCount.hashCode()
        result = 31 * result + this.objectHandleArray.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtWaitforsynchronizationobject> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtWaitforsynchronizationobject> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 136L
                override fun readNative(addr: Long): D3dkmtWaitforsynchronizationobject =
                    D3dkmtWaitforsynchronizationobject(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (32).toInt())
                        ).readNative(addr + 8L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: D3dkmtWaitforsynchronizationobject) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.objectCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (32).toInt())
                    ).writeNative(addr + 8L, value.objectHandleArray.toList())
                }
            }
    }
}

public data class D3dkmtWaitforsynchronizationobject2(
    public var hContext: UInt = 0u,
    public var objectCount: UInt = 0u,
    public var objectHandleArray: UIntArray = UIntArray(32),
    public var anonymous: D3dkmtWaitforsynchronizationobject20 = D3dkmtWaitforsynchronizationobject20(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtWaitforsynchronizationobject2) return false
        if (this.hContext != other.hContext) return false
        if (this.objectCount != other.objectCount) return false
        if (!this.objectHandleArray.contentEquals(other.objectHandleArray)) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hContext.hashCode()
        result = 31 * result + this.objectCount.hashCode()
        result = 31 * result + this.objectHandleArray.contentHashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }
}

public data class D3dkmtWaitforsynchronizationobject20(
    public var fence: D3dkmtWaitforsynchronizationobject200 = D3dkmtWaitforsynchronizationobject200(),
    public var reserved: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtWaitforsynchronizationobject20) return false
        if (this.fence != other.fence) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fence.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class D3dkmtWaitforsynchronizationobject200(
    public var fenceValue: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtWaitforsynchronizationobject200> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtWaitforsynchronizationobject200> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtWaitforsynchronizationobject200 =
                    D3dkmtWaitforsynchronizationobject200(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtWaitforsynchronizationobject200) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.fenceValue)
                }
            }
    }
}

public class D3dkmtWaitforsynchronizationobjectfromcpu internal constructor(
    public var hDevice: UInt,
    public var objectCount: UInt,
    objectHandleArrayCtorArg: ConstPtr,
    fenceValueArrayCtorArg: ConstPtr,
    hAsyncEventCtorArg: Handle,
    public var flags: D3dddiWaitforsynchronizationobjectfromcpuFlags,
) {
    public var objectHandleArray: ConstPtr = objectHandleArrayCtorArg
        internal set

    public var fenceValueArray: ConstPtr = fenceValueArrayCtorArg
        internal set

    public var hAsyncEvent: Handle = hAsyncEventCtorArg
        internal set

    public constructor() : this(
        hDevice = 0u,
        objectCount = 0u,
        objectHandleArrayCtorArg = ConstPtr(0L),
        fenceValueArrayCtorArg = ConstPtr(0L),
        hAsyncEventCtorArg = MutPtr(0L),
        flags = D3dddiWaitforsynchronizationobjectfromcpuFlags(),
    )

    public operator fun component1(): UInt = this.hDevice

    public operator fun component2(): UInt = this.objectCount

    public operator fun component3(): ConstPtr = this.objectHandleArray

    public operator fun component4(): ConstPtr = this.fenceValueArray

    public operator fun component5(): Handle = this.hAsyncEvent

    public operator fun component6(): D3dddiWaitforsynchronizationobjectfromcpuFlags = this.flags

    public fun copy(hDevice: UInt = this.hDevice, objectCount: UInt = this.objectCount, objectHandleArray: ConstPtr = this.objectHandleArray, fenceValueArray: ConstPtr = this.fenceValueArray, hAsyncEvent: Handle = this.hAsyncEvent, flags: D3dddiWaitforsynchronizationobjectfromcpuFlags = this.flags): D3dkmtWaitforsynchronizationobjectfromcpu = D3dkmtWaitforsynchronizationobjectfromcpu(hDevice = hDevice, objectCount = objectCount, objectHandleArrayCtorArg = objectHandleArray, fenceValueArrayCtorArg = fenceValueArray, hAsyncEventCtorArg = hAsyncEvent, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtWaitforsynchronizationobjectfromcpu) return false
        if (this.hDevice != other.hDevice) return false
        if (this.objectCount != other.objectCount) return false
        if (this.objectHandleArray != other.objectHandleArray) return false
        if (this.fenceValueArray != other.fenceValueArray) return false
        if (this.hAsyncEvent != other.hAsyncEvent) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDevice.hashCode()
        result = 31 * result + this.objectCount.hashCode()
        result = 31 * result + this.objectHandleArray.hashCode()
        result = 31 * result + this.fenceValueArray.hashCode()
        result = 31 * result + this.hAsyncEvent.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hDevice: UInt = 0u,
            objectCount: UInt = 0u,
            objectHandleArray: ConstPtr = ConstPtr(0L),
            fenceValueArray: ConstPtr = ConstPtr(0L),
            hAsyncEvent: Handle = MutPtr(0L),
            flags: D3dddiWaitforsynchronizationobjectfromcpuFlags = D3dddiWaitforsynchronizationobjectfromcpuFlags(),
        ): D3dkmtWaitforsynchronizationobjectfromcpu =
            D3dkmtWaitforsynchronizationobjectfromcpu(
                hDevice = hDevice,
                objectCount = objectCount,
                objectHandleArrayCtorArg = objectHandleArray,
                fenceValueArrayCtorArg = fenceValueArray,
                hAsyncEventCtorArg = hAsyncEvent,
                flags = flags,
            )
    }
}

public class D3dkmtWaitforsynchronizationobjectfromgpu internal constructor(
    public var hContext: UInt,
    public var objectCount: UInt,
    objectHandleArrayCtorArg: ConstPtr,
    public var anonymous: D3dkmtWaitforsynchronizationobjectfromgpu0,
) {
    public var objectHandleArray: ConstPtr = objectHandleArrayCtorArg
        internal set

    public constructor() : this(
        hContext = 0u,
        objectCount = 0u,
        objectHandleArrayCtorArg = ConstPtr(0L),
        anonymous = D3dkmtWaitforsynchronizationobjectfromgpu0(),
    )

    public operator fun component1(): UInt = this.hContext

    public operator fun component2(): UInt = this.objectCount

    public operator fun component3(): ConstPtr = this.objectHandleArray

    public operator fun component4(): D3dkmtWaitforsynchronizationobjectfromgpu0 = this.anonymous

    public fun copy(hContext: UInt = this.hContext, objectCount: UInt = this.objectCount, objectHandleArray: ConstPtr = this.objectHandleArray, anonymous: D3dkmtWaitforsynchronizationobjectfromgpu0 = this.anonymous): D3dkmtWaitforsynchronizationobjectfromgpu = D3dkmtWaitforsynchronizationobjectfromgpu(hContext = hContext, objectCount = objectCount, objectHandleArrayCtorArg = objectHandleArray, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtWaitforsynchronizationobjectfromgpu) return false
        if (this.hContext != other.hContext) return false
        if (this.objectCount != other.objectCount) return false
        if (this.objectHandleArray != other.objectHandleArray) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hContext.hashCode()
        result = 31 * result + this.objectCount.hashCode()
        result = 31 * result + this.objectHandleArray.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hContext: UInt = 0u,
            objectCount: UInt = 0u,
            objectHandleArray: ConstPtr = ConstPtr(0L),
            anonymous: D3dkmtWaitforsynchronizationobjectfromgpu0 = D3dkmtWaitforsynchronizationobjectfromgpu0(),
        ): D3dkmtWaitforsynchronizationobjectfromgpu =
            D3dkmtWaitforsynchronizationobjectfromgpu(
                hContext = hContext,
                objectCount = objectCount,
                objectHandleArrayCtorArg = objectHandleArray,
                anonymous = anonymous,
            )
    }
}

public class D3dkmtWaitforsynchronizationobjectfromgpu0 internal constructor(
    monitoredFenceValueArrayCtorArg: ConstPtr,
    public var fenceValue: ULong,
    public var reserved: ULongArray,
) {
    public var monitoredFenceValueArray: ConstPtr = monitoredFenceValueArrayCtorArg
        internal set

    public constructor() : this(
        monitoredFenceValueArrayCtorArg = ConstPtr(0L),
        fenceValue = 0uL,
        reserved = ULongArray(8),
    )

    public operator fun component1(): ConstPtr = this.monitoredFenceValueArray

    public operator fun component2(): ULong = this.fenceValue

    public operator fun component3(): ULongArray = this.reserved

    public fun copy(monitoredFenceValueArray: ConstPtr = this.monitoredFenceValueArray, fenceValue: ULong = this.fenceValue, reserved: ULongArray = this.reserved): D3dkmtWaitforsynchronizationobjectfromgpu0 = D3dkmtWaitforsynchronizationobjectfromgpu0(monitoredFenceValueArrayCtorArg = monitoredFenceValueArray, fenceValue = fenceValue, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtWaitforsynchronizationobjectfromgpu0) return false
        if (this.monitoredFenceValueArray != other.monitoredFenceValueArray) return false
        if (this.fenceValue != other.fenceValue) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.monitoredFenceValueArray.hashCode()
        result = 31 * result + this.fenceValue.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            monitoredFenceValueArray: ConstPtr = ConstPtr(0L),
            fenceValue: ULong = 0uL,
            reserved: ULongArray = ULongArray(8),
        ): D3dkmtWaitforsynchronizationobjectfromgpu0 =
            D3dkmtWaitforsynchronizationobjectfromgpu0(
                monitoredFenceValueArrayCtorArg = monitoredFenceValueArray,
                fenceValue = fenceValue,
                reserved = reserved,
            )
    }
}

public data class D3dkmtWaitforverticalblankevent(
    public var hAdapter: UInt = 0u,
    public var hDevice: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtWaitforverticalblankevent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtWaitforverticalblankevent> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): D3dkmtWaitforverticalblankevent =
                    D3dkmtWaitforverticalblankevent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtWaitforverticalblankevent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAdapter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hDevice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.vidPnSourceId)
                }
            }
    }
}

public data class D3dkmtWaitforverticalblankevent2(
    public var hAdapter: UInt = 0u,
    public var hDevice: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var numObjects: UInt = 0u,
    public var objectHandleArray: IntArray = IntArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtWaitforverticalblankevent2) return false
        if (this.hAdapter != other.hAdapter) return false
        if (this.hDevice != other.hDevice) return false
        if (this.vidPnSourceId != other.vidPnSourceId) return false
        if (this.numObjects != other.numObjects) return false
        if (!this.objectHandleArray.contentEquals(other.objectHandleArray)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hAdapter.hashCode()
        result = 31 * result + this.hDevice.hashCode()
        result = 31 * result + this.vidPnSourceId.hashCode()
        result = 31 * result + this.numObjects.hashCode()
        result = 31 * result + this.objectHandleArray.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtWaitforverticalblankevent2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtWaitforverticalblankevent2> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): D3dkmtWaitforverticalblankevent2 =
                    D3dkmtWaitforverticalblankevent2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64, (8).toInt())
                        ).readNative(addr + 16L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: D3dkmtWaitforverticalblankevent2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAdapter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hDevice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.vidPnSourceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.numObjects)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64, (8).toInt())
                    ).writeNative(addr + 16L, value.objectHandleArray.toList())
                }
            }
    }
}

public data class D3dkmtWddm12Caps(
    public var preemptionCaps: D3dkmdtPreemptionCaps = D3dkmdtPreemptionCaps(),
    public var anonymous: D3dkmtWddm12Caps0 = D3dkmtWddm12Caps0(),
)

public data class D3dkmtWddm12Caps0(
    public var anonymous: D3dkmtWddm12Caps00 = D3dkmtWddm12Caps00(),
    public var value: UInt = 0u,
)

public data class D3dkmtWddm12Caps00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtWddm12Caps00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtWddm12Caps00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtWddm12Caps00 =
                    D3dkmtWddm12Caps00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtWddm12Caps00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}
