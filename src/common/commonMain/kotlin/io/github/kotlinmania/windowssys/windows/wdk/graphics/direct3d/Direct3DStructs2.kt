@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc

public data class D3dkmtAdapterVerifierOption(
    public var type: D3dkmtAdapterVerifierOptionType = 0,
    public var mode: D3dkmtVerifierOptionMode = 0,
    public var data: D3dkmtAdapterVerifierOptionData = D3dkmtAdapterVerifierOptionData(),
)

public data class D3dkmtAdapterVerifierOptionData(
    public var vidMmFlags: D3dkmtAdapterVerifierVidmmFlags = D3dkmtAdapterVerifierVidmmFlags(),
    public var vidMmTrimInterval: D3dkmtAdapterVerifierVidmmTrimInterval = D3dkmtAdapterVerifierVidmmTrimInterval(),
)

public data class D3dkmtAdapterVerifierVidmmFlags(
    public var anonymous: D3dkmtAdapterVerifierVidmmFlags0 = D3dkmtAdapterVerifierVidmmFlags0(),
    public var value: UInt = 0u,
)

public data class D3dkmtAdapterVerifierVidmmFlags0(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtAdapterVerifierVidmmFlags0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtAdapterVerifierVidmmFlags0> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtAdapterVerifierVidmmFlags0 =
                    D3dkmtAdapterVerifierVidmmFlags0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtAdapterVerifierVidmmFlags0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtAdapterVerifierVidmmTrimInterval(
    public var minimumTrimInterval: ULong = 0uL,
    public var maximumTrimInterval: ULong = 0uL,
    public var idleTrimInterval: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtAdapterVerifierVidmmTrimInterval> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtAdapterVerifierVidmmTrimInterval> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): D3dkmtAdapterVerifierVidmmTrimInterval =
                    D3dkmtAdapterVerifierVidmmTrimInterval(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtAdapterVerifierVidmmTrimInterval) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.minimumTrimInterval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.maximumTrimInterval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.idleTrimInterval)
                }
            }
    }
}

public data class D3dkmtAdjustfullscreengamma(
    public var hAdapter: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var scale: D3dddiDxgiRgb = D3dddiDxgiRgb(),
    public var offset: D3dddiDxgiRgb = D3dddiDxgiRgb(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtAdjustfullscreengamma> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtAdjustfullscreengamma> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): D3dkmtAdjustfullscreengamma =
                    D3dkmtAdjustfullscreengamma(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (D3dddiDxgiRgb.typeLayout()).readNative(addr + 8L),
                        (D3dddiDxgiRgb.typeLayout()).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtAdjustfullscreengamma) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAdapter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vidPnSourceId)
                    (D3dddiDxgiRgb.typeLayout()).writeNative(addr + 8L, value.scale)
                    (D3dddiDxgiRgb.typeLayout()).writeNative(addr + 20L, value.offset)
                }
            }
    }
}

public data class D3dkmtAuxiliarypresentinfo(
    public var size: UInt = 0u,
    public var type: D3dkmtAuxiliarypresentinfoType = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtAuxiliarypresentinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtAuxiliarypresentinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtAuxiliarypresentinfo =
                    D3dkmtAuxiliarypresentinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtAuxiliarypresentinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.type)
                }
            }
    }
}

public data class D3dkmtBddfallbackCtl(
    public var forceBddHeadlessNextFallback: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtBddfallbackCtl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtBddfallbackCtl> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): D3dkmtBddfallbackCtl =
                    D3dkmtBddfallbackCtl(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtBddfallbackCtl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.forceBddHeadlessNextFallback)
                }
            }
    }
}

public data class D3dkmtBlocklistInfo(
    public var size: UInt = 0u,
    public var blockList: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtBlocklistInfo) return false
        if (this.size != other.size) return false
        if (!this.blockList.contentEquals(other.blockList)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.blockList.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtBlocklistInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtBlocklistInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtBlocklistInfo =
                    D3dkmtBlocklistInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: D3dkmtBlocklistInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 4L, value.blockList.toList())
                }
            }
    }
}

public data class D3dkmtBltmodelPresenthistorytoken(
    public var hLogicalSurface: ULong = 0uL,
    public var hPhysicalSurface: ULong = 0uL,
    public var eventId: ULong = 0uL,
    public var dirtyRegions: D3dkmtDirtyregions = D3dkmtDirtyregions(),
)

public data class D3dkmtBrightnessInfo(
    public var type: D3dkmtBrightnessInfoType = 0,
    public var childUid: UInt = 0u,
    public var anonymous: D3dkmtBrightnessInfo0 = D3dkmtBrightnessInfo0(),
)

public data class D3dkmtBrightnessInfo0(
    public var possibleLevels: D3dkmtBrightnessPossibleLevels = D3dkmtBrightnessPossibleLevels(),
    public var brightness: UByte = 0u,
    public var brightnessCaps: DxgkBrightnessCaps = DxgkBrightnessCaps(),
    public var brightnessState: DxgkBrightnessState = DxgkBrightnessState(),
    public var optimizationLevel: DxgkBacklightOptimizationLevel = 0,
    public var reductionInfo: DxgkBacklightInfo = DxgkBacklightInfo(),
    public var verboseLogging: Boolean = false,
    public var nitRanges: DxgkBrightnessGetNitRangesOut = DxgkBrightnessGetNitRangesOut(),
    public var getBrightnessMillinits: DxgkBrightnessGetOut = DxgkBrightnessGetOut(),
    public var setBrightnessMillinits: DxgkBrightnessSetIn = DxgkBrightnessSetIn(),
)

public data class D3dkmtBrightnessPossibleLevels(
    public var levelCount: UByte = 0u,
    public var brightnessLevels: UByteArray = UByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtBrightnessPossibleLevels) return false
        if (this.levelCount != other.levelCount) return false
        if (!this.brightnessLevels.contentEquals(other.brightnessLevels)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.levelCount.hashCode()
        result = 31 * result + this.brightnessLevels.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtBrightnessPossibleLevels> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtBrightnessPossibleLevels> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 257L
                override fun readNative(addr: Long): D3dkmtBrightnessPossibleLevels =
                    D3dkmtBrightnessPossibleLevels(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                        ).readNative(addr + 1L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: D3dkmtBrightnessPossibleLevels) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.levelCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                    ).writeNative(addr + 1L, value.brightnessLevels.toList())
                }
            }
    }
}

public class D3dkmtBudgetchangenotification internal constructor(
    contextCtorArg: MutPtr,
    public var budget: ULong,
) {
    public var context: MutPtr = contextCtorArg
        internal set

    public constructor() : this(
        contextCtorArg = MutPtr(0L),
        budget = 0uL,
    )

    public operator fun component1(): MutPtr = this.context

    public operator fun component2(): ULong = this.budget

    public fun copy(context: MutPtr = this.context, budget: ULong = this.budget): D3dkmtBudgetchangenotification = D3dkmtBudgetchangenotification(contextCtorArg = context, budget = budget)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtBudgetchangenotification) return false
        if (this.context != other.context) return false
        if (this.budget != other.budget) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.context.hashCode()
        result = 31 * result + this.budget.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtBudgetchangenotification> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtBudgetchangenotification> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): D3dkmtBudgetchangenotification =
                    D3dkmtBudgetchangenotification(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtBudgetchangenotification) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.context)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.budget)
                }
            }

        public operator fun invoke(
            context: MutPtr = MutPtr(0L),
            budget: ULong = 0uL,
        ): D3dkmtBudgetchangenotification =
            D3dkmtBudgetchangenotification(
                contextCtorArg = context,
                budget = budget,
            )
    }
}

public data class D3dkmtCancelPresents(
    public var cbSize: UInt = 0u,
    public var hDevice: UInt = 0u,
    public var flags: D3dkmtCancelPresentsFlags = D3dkmtCancelPresentsFlags(),
    public var operation: D3dkmtCancelPresentsOperation = 0,
    public var cancelFromPresentId: ULong = 0uL,
    public var compSurfaceLuid: Luid = Luid(),
    public var bindId: ULong = 0uL,
)

public data class D3dkmtCancelPresentsFlags(
    public var anonymous: D3dkmtCancelPresentsFlags0 = D3dkmtCancelPresentsFlags0(),
)

public data class D3dkmtCancelPresentsFlags0(
    public var reprogramInterrupt: D3dkmtCancelPresentsFlags00 = D3dkmtCancelPresentsFlags00(),
    public var value: UInt = 0u,
)

public data class D3dkmtCancelPresentsFlags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCancelPresentsFlags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCancelPresentsFlags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtCancelPresentsFlags00 =
                    D3dkmtCancelPresentsFlags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtCancelPresentsFlags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class D3dkmtChangesurfacepointer internal constructor(
    hDCCtorArg: Hdc,
    hBitmapCtorArg: Handle,
    pSurfacePointerCtorArg: MutPtr,
    public var width: UInt,
    public var height: UInt,
    public var pitch: UInt,
) {
    public var hDC: Hdc = hDCCtorArg
        internal set

    public var hBitmap: Handle = hBitmapCtorArg
        internal set

    public var pSurfacePointer: MutPtr = pSurfacePointerCtorArg
        internal set

    public constructor() : this(
        hDCCtorArg = MutPtr(0L),
        hBitmapCtorArg = MutPtr(0L),
        pSurfacePointerCtorArg = MutPtr(0L),
        width = 0u,
        height = 0u,
        pitch = 0u,
    )

    public operator fun component1(): Hdc = this.hDC

    public operator fun component2(): Handle = this.hBitmap

    public operator fun component3(): MutPtr = this.pSurfacePointer

    public operator fun component4(): UInt = this.width

    public operator fun component5(): UInt = this.height

    public operator fun component6(): UInt = this.pitch

    public fun copy(hDC: Hdc = this.hDC, hBitmap: Handle = this.hBitmap, pSurfacePointer: MutPtr = this.pSurfacePointer, width: UInt = this.width, height: UInt = this.height, pitch: UInt = this.pitch): D3dkmtChangesurfacepointer = D3dkmtChangesurfacepointer(hDCCtorArg = hDC, hBitmapCtorArg = hBitmap, pSurfacePointerCtorArg = pSurfacePointer, width = width, height = height, pitch = pitch)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtChangesurfacepointer) return false
        if (this.hDC != other.hDC) return false
        if (this.hBitmap != other.hBitmap) return false
        if (this.pSurfacePointer != other.pSurfacePointer) return false
        if (this.width != other.width) return false
        if (this.height != other.height) return false
        if (this.pitch != other.pitch) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDC.hashCode()
        result = 31 * result + this.hBitmap.hashCode()
        result = 31 * result + this.pSurfacePointer.hashCode()
        result = 31 * result + this.width.hashCode()
        result = 31 * result + this.height.hashCode()
        result = 31 * result + this.pitch.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hDC: Hdc = MutPtr(0L),
            hBitmap: Handle = MutPtr(0L),
            pSurfacePointer: MutPtr = MutPtr(0L),
            width: UInt = 0u,
            height: UInt = 0u,
            pitch: UInt = 0u,
        ): D3dkmtChangesurfacepointer =
            D3dkmtChangesurfacepointer(
                hDCCtorArg = hDC,
                hBitmapCtorArg = hBitmap,
                pSurfacePointerCtorArg = pSurfacePointer,
                width = width,
                height = height,
                pitch = pitch,
            )
    }
}

public class D3dkmtChangevideomemoryreservation internal constructor(
    hProcessCtorArg: Handle,
    public var hAdapter: UInt,
    public var memorySegmentGroup: D3dkmtMemorySegmentGroup,
    public var reservation: ULong,
    public var physicalAdapterIndex: UInt,
) {
    public var hProcess: Handle = hProcessCtorArg
        internal set

    public constructor() : this(
        hProcessCtorArg = MutPtr(0L),
        hAdapter = 0u,
        memorySegmentGroup = 0,
        reservation = 0uL,
        physicalAdapterIndex = 0u,
    )

    public operator fun component1(): Handle = this.hProcess

    public operator fun component2(): UInt = this.hAdapter

    public operator fun component3(): D3dkmtMemorySegmentGroup = this.memorySegmentGroup

    public operator fun component4(): ULong = this.reservation

    public operator fun component5(): UInt = this.physicalAdapterIndex

    public fun copy(hProcess: Handle = this.hProcess, hAdapter: UInt = this.hAdapter, memorySegmentGroup: D3dkmtMemorySegmentGroup = this.memorySegmentGroup, reservation: ULong = this.reservation, physicalAdapterIndex: UInt = this.physicalAdapterIndex): D3dkmtChangevideomemoryreservation = D3dkmtChangevideomemoryreservation(hProcessCtorArg = hProcess, hAdapter = hAdapter, memorySegmentGroup = memorySegmentGroup, reservation = reservation, physicalAdapterIndex = physicalAdapterIndex)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtChangevideomemoryreservation) return false
        if (this.hProcess != other.hProcess) return false
        if (this.hAdapter != other.hAdapter) return false
        if (this.memorySegmentGroup != other.memorySegmentGroup) return false
        if (this.reservation != other.reservation) return false
        if (this.physicalAdapterIndex != other.physicalAdapterIndex) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hProcess.hashCode()
        result = 31 * result + this.hAdapter.hashCode()
        result = 31 * result + this.memorySegmentGroup.hashCode()
        result = 31 * result + this.reservation.hashCode()
        result = 31 * result + this.physicalAdapterIndex.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hProcess: Handle = MutPtr(0L),
            hAdapter: UInt = 0u,
            memorySegmentGroup: D3dkmtMemorySegmentGroup = 0,
            reservation: ULong = 0uL,
            physicalAdapterIndex: UInt = 0u,
        ): D3dkmtChangevideomemoryreservation =
            D3dkmtChangevideomemoryreservation(
                hProcessCtorArg = hProcess,
                hAdapter = hAdapter,
                memorySegmentGroup = memorySegmentGroup,
                reservation = reservation,
                physicalAdapterIndex = physicalAdapterIndex,
            )
    }
}

public data class D3dkmtCheckmonitorpowerstate(
    public var hAdapter: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCheckmonitorpowerstate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCheckmonitorpowerstate> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtCheckmonitorpowerstate =
                    D3dkmtCheckmonitorpowerstate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtCheckmonitorpowerstate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAdapter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vidPnSourceId)
                }
            }
    }
}

public class D3dkmtCheckmultiplaneoverlaysupport internal constructor(
    public var hDevice: UInt,
    public var planeCount: UInt,
    pOverlayPlanesCtorArg: MutPtr,
    public var supported: Bool,
    public var returnInfo: D3dkmtCheckMultiplaneOverlaySupportReturnInfo,
) {
    public var pOverlayPlanes: MutPtr = pOverlayPlanesCtorArg
        internal set

    public constructor() : this(
        hDevice = 0u,
        planeCount = 0u,
        pOverlayPlanesCtorArg = MutPtr(0L),
        supported = 0,
        returnInfo = D3dkmtCheckMultiplaneOverlaySupportReturnInfo(),
    )

    public operator fun component1(): UInt = this.hDevice

    public operator fun component2(): UInt = this.planeCount

    public operator fun component3(): MutPtr = this.pOverlayPlanes

    public operator fun component4(): Bool = this.supported

    public operator fun component5(): D3dkmtCheckMultiplaneOverlaySupportReturnInfo = this.returnInfo

    public fun copy(hDevice: UInt = this.hDevice, planeCount: UInt = this.planeCount, pOverlayPlanes: MutPtr = this.pOverlayPlanes, supported: Bool = this.supported, returnInfo: D3dkmtCheckMultiplaneOverlaySupportReturnInfo = this.returnInfo): D3dkmtCheckmultiplaneoverlaysupport = D3dkmtCheckmultiplaneoverlaysupport(hDevice = hDevice, planeCount = planeCount, pOverlayPlanesCtorArg = pOverlayPlanes, supported = supported, returnInfo = returnInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtCheckmultiplaneoverlaysupport) return false
        if (this.hDevice != other.hDevice) return false
        if (this.planeCount != other.planeCount) return false
        if (this.pOverlayPlanes != other.pOverlayPlanes) return false
        if (this.supported != other.supported) return false
        if (this.returnInfo != other.returnInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDevice.hashCode()
        result = 31 * result + this.planeCount.hashCode()
        result = 31 * result + this.pOverlayPlanes.hashCode()
        result = 31 * result + this.supported.hashCode()
        result = 31 * result + this.returnInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hDevice: UInt = 0u,
            planeCount: UInt = 0u,
            pOverlayPlanes: MutPtr = MutPtr(0L),
            supported: Bool = 0,
            returnInfo: D3dkmtCheckMultiplaneOverlaySupportReturnInfo = D3dkmtCheckMultiplaneOverlaySupportReturnInfo(),
        ): D3dkmtCheckmultiplaneoverlaysupport =
            D3dkmtCheckmultiplaneoverlaysupport(
                hDevice = hDevice,
                planeCount = planeCount,
                pOverlayPlanesCtorArg = pOverlayPlanes,
                supported = supported,
                returnInfo = returnInfo,
            )
    }
}

public class D3dkmtCheckmultiplaneoverlaysupport2 internal constructor(
    public var hAdapter: UInt,
    public var hDevice: UInt,
    public var planeCount: UInt,
    pOverlayPlanesCtorArg: MutPtr,
    public var supported: Bool,
    public var returnInfo: D3dkmtCheckMultiplaneOverlaySupportReturnInfo,
) {
    public var pOverlayPlanes: MutPtr = pOverlayPlanesCtorArg
        internal set

    public constructor() : this(
        hAdapter = 0u,
        hDevice = 0u,
        planeCount = 0u,
        pOverlayPlanesCtorArg = MutPtr(0L),
        supported = 0,
        returnInfo = D3dkmtCheckMultiplaneOverlaySupportReturnInfo(),
    )

    public operator fun component1(): UInt = this.hAdapter

    public operator fun component2(): UInt = this.hDevice

    public operator fun component3(): UInt = this.planeCount

    public operator fun component4(): MutPtr = this.pOverlayPlanes

    public operator fun component5(): Bool = this.supported

    public operator fun component6(): D3dkmtCheckMultiplaneOverlaySupportReturnInfo = this.returnInfo

    public fun copy(hAdapter: UInt = this.hAdapter, hDevice: UInt = this.hDevice, planeCount: UInt = this.planeCount, pOverlayPlanes: MutPtr = this.pOverlayPlanes, supported: Bool = this.supported, returnInfo: D3dkmtCheckMultiplaneOverlaySupportReturnInfo = this.returnInfo): D3dkmtCheckmultiplaneoverlaysupport2 = D3dkmtCheckmultiplaneoverlaysupport2(hAdapter = hAdapter, hDevice = hDevice, planeCount = planeCount, pOverlayPlanesCtorArg = pOverlayPlanes, supported = supported, returnInfo = returnInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtCheckmultiplaneoverlaysupport2) return false
        if (this.hAdapter != other.hAdapter) return false
        if (this.hDevice != other.hDevice) return false
        if (this.planeCount != other.planeCount) return false
        if (this.pOverlayPlanes != other.pOverlayPlanes) return false
        if (this.supported != other.supported) return false
        if (this.returnInfo != other.returnInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hAdapter.hashCode()
        result = 31 * result + this.hDevice.hashCode()
        result = 31 * result + this.planeCount.hashCode()
        result = 31 * result + this.pOverlayPlanes.hashCode()
        result = 31 * result + this.supported.hashCode()
        result = 31 * result + this.returnInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hAdapter: UInt = 0u,
            hDevice: UInt = 0u,
            planeCount: UInt = 0u,
            pOverlayPlanes: MutPtr = MutPtr(0L),
            supported: Bool = 0,
            returnInfo: D3dkmtCheckMultiplaneOverlaySupportReturnInfo = D3dkmtCheckMultiplaneOverlaySupportReturnInfo(),
        ): D3dkmtCheckmultiplaneoverlaysupport2 =
            D3dkmtCheckmultiplaneoverlaysupport2(
                hAdapter = hAdapter,
                hDevice = hDevice,
                planeCount = planeCount,
                pOverlayPlanesCtorArg = pOverlayPlanes,
                supported = supported,
                returnInfo = returnInfo,
            )
    }
}

public class D3dkmtCheckmultiplaneoverlaysupport3 internal constructor(
    public var hAdapter: UInt,
    public var hDevice: UInt,
    public var planeCount: UInt,
    ppOverlayPlanesCtorArg: MutPtr,
    public var postCompositionCount: UInt,
    ppPostCompositionCtorArg: MutPtr,
    public var supported: Bool,
    public var returnInfo: D3dkmtCheckMultiplaneOverlaySupportReturnInfo,
) {
    public var ppOverlayPlanes: MutPtr = ppOverlayPlanesCtorArg
        internal set

    public var ppPostComposition: MutPtr = ppPostCompositionCtorArg
        internal set

    public constructor() : this(
        hAdapter = 0u,
        hDevice = 0u,
        planeCount = 0u,
        ppOverlayPlanesCtorArg = MutPtr(0L),
        postCompositionCount = 0u,
        ppPostCompositionCtorArg = MutPtr(0L),
        supported = 0,
        returnInfo = D3dkmtCheckMultiplaneOverlaySupportReturnInfo(),
    )

    public operator fun component1(): UInt = this.hAdapter

    public operator fun component2(): UInt = this.hDevice

    public operator fun component3(): UInt = this.planeCount

    public operator fun component4(): MutPtr = this.ppOverlayPlanes

    public operator fun component5(): UInt = this.postCompositionCount

    public operator fun component6(): MutPtr = this.ppPostComposition

    public operator fun component7(): Bool = this.supported

    public operator fun component8(): D3dkmtCheckMultiplaneOverlaySupportReturnInfo = this.returnInfo

    public fun copy(hAdapter: UInt = this.hAdapter, hDevice: UInt = this.hDevice, planeCount: UInt = this.planeCount, ppOverlayPlanes: MutPtr = this.ppOverlayPlanes, postCompositionCount: UInt = this.postCompositionCount, ppPostComposition: MutPtr = this.ppPostComposition, supported: Bool = this.supported, returnInfo: D3dkmtCheckMultiplaneOverlaySupportReturnInfo = this.returnInfo): D3dkmtCheckmultiplaneoverlaysupport3 = D3dkmtCheckmultiplaneoverlaysupport3(hAdapter = hAdapter, hDevice = hDevice, planeCount = planeCount, ppOverlayPlanesCtorArg = ppOverlayPlanes, postCompositionCount = postCompositionCount, ppPostCompositionCtorArg = ppPostComposition, supported = supported, returnInfo = returnInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtCheckmultiplaneoverlaysupport3) return false
        if (this.hAdapter != other.hAdapter) return false
        if (this.hDevice != other.hDevice) return false
        if (this.planeCount != other.planeCount) return false
        if (this.ppOverlayPlanes != other.ppOverlayPlanes) return false
        if (this.postCompositionCount != other.postCompositionCount) return false
        if (this.ppPostComposition != other.ppPostComposition) return false
        if (this.supported != other.supported) return false
        if (this.returnInfo != other.returnInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hAdapter.hashCode()
        result = 31 * result + this.hDevice.hashCode()
        result = 31 * result + this.planeCount.hashCode()
        result = 31 * result + this.ppOverlayPlanes.hashCode()
        result = 31 * result + this.postCompositionCount.hashCode()
        result = 31 * result + this.ppPostComposition.hashCode()
        result = 31 * result + this.supported.hashCode()
        result = 31 * result + this.returnInfo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hAdapter: UInt = 0u,
            hDevice: UInt = 0u,
            planeCount: UInt = 0u,
            ppOverlayPlanes: MutPtr = MutPtr(0L),
            postCompositionCount: UInt = 0u,
            ppPostComposition: MutPtr = MutPtr(0L),
            supported: Bool = 0,
            returnInfo: D3dkmtCheckMultiplaneOverlaySupportReturnInfo = D3dkmtCheckMultiplaneOverlaySupportReturnInfo(),
        ): D3dkmtCheckmultiplaneoverlaysupport3 =
            D3dkmtCheckmultiplaneoverlaysupport3(
                hAdapter = hAdapter,
                hDevice = hDevice,
                planeCount = planeCount,
                ppOverlayPlanesCtorArg = ppOverlayPlanes,
                postCompositionCount = postCompositionCount,
                ppPostCompositionCtorArg = ppPostComposition,
                supported = supported,
                returnInfo = returnInfo,
            )
    }
}

public class D3dkmtCheckocclusion internal constructor(
    hWindowCtorArg: Hwnd,
) {
    public var hWindow: Hwnd = hWindowCtorArg
        internal set

    public constructor() : this(
        hWindowCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Hwnd = this.hWindow

    public fun copy(hWindow: Hwnd = this.hWindow): D3dkmtCheckocclusion = D3dkmtCheckocclusion(hWindowCtorArg = hWindow)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtCheckocclusion) return false
        if (this.hWindow != other.hWindow) return false
        return true
    }

    override fun hashCode(): Int = this.hWindow.hashCode()

    public companion object {
        public operator fun invoke(
            hWindow: Hwnd = MutPtr(0L),
        ): D3dkmtCheckocclusion =
            D3dkmtCheckocclusion(
                hWindowCtorArg = hWindow,
            )
    }
}

public data class D3dkmtChecksharedresourceaccess(
    public var hResource: UInt = 0u,
    public var clientPid: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtChecksharedresourceaccess> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtChecksharedresourceaccess> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtChecksharedresourceaccess =
                    D3dkmtChecksharedresourceaccess(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtChecksharedresourceaccess) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hResource)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.clientPid)
                }
            }
    }
}

public data class D3dkmtCheckvidpnexclusiveownership(
    public var hAdapter: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCheckvidpnexclusiveownership> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCheckvidpnexclusiveownership> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtCheckvidpnexclusiveownership =
                    D3dkmtCheckvidpnexclusiveownership(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtCheckvidpnexclusiveownership) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAdapter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vidPnSourceId)
                }
            }
    }
}

public data class D3dkmtCheckMultiplaneOverlayPlane(
    public var hResource: UInt = 0u,
    public var compSurfaceLuid: Luid = Luid(),
    public var vidPnSourceId: UInt = 0u,
    public var planeAttributes: D3dkmtMultiplaneOverlayAttributes = D3dkmtMultiplaneOverlayAttributes(),
)

public data class D3dkmtCheckMultiplaneOverlayPlane2(
    public var layerIndex: UInt = 0u,
    public var hResource: UInt = 0u,
    public var compSurfaceLuid: Luid = Luid(),
    public var vidPnSourceId: UInt = 0u,
    public var planeAttributes: D3dkmtMultiplaneOverlayAttributes2 = D3dkmtMultiplaneOverlayAttributes2(),
)

public class D3dkmtCheckMultiplaneOverlayPlane3 internal constructor(
    public var layerIndex: UInt,
    public var hResource: UInt,
    public var compSurfaceLuid: Luid,
    public var vidPnSourceId: UInt,
    pPlaneAttributesCtorArg: MutPtr,
) {
    public var pPlaneAttributes: MutPtr = pPlaneAttributesCtorArg
        internal set

    public constructor() : this(
        layerIndex = 0u,
        hResource = 0u,
        compSurfaceLuid = Luid(),
        vidPnSourceId = 0u,
        pPlaneAttributesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.layerIndex

    public operator fun component2(): UInt = this.hResource

    public operator fun component3(): Luid = this.compSurfaceLuid

    public operator fun component4(): UInt = this.vidPnSourceId

    public operator fun component5(): MutPtr = this.pPlaneAttributes

    public fun copy(layerIndex: UInt = this.layerIndex, hResource: UInt = this.hResource, compSurfaceLuid: Luid = this.compSurfaceLuid, vidPnSourceId: UInt = this.vidPnSourceId, pPlaneAttributes: MutPtr = this.pPlaneAttributes): D3dkmtCheckMultiplaneOverlayPlane3 = D3dkmtCheckMultiplaneOverlayPlane3(layerIndex = layerIndex, hResource = hResource, compSurfaceLuid = compSurfaceLuid, vidPnSourceId = vidPnSourceId, pPlaneAttributesCtorArg = pPlaneAttributes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtCheckMultiplaneOverlayPlane3) return false
        if (this.layerIndex != other.layerIndex) return false
        if (this.hResource != other.hResource) return false
        if (this.compSurfaceLuid != other.compSurfaceLuid) return false
        if (this.vidPnSourceId != other.vidPnSourceId) return false
        if (this.pPlaneAttributes != other.pPlaneAttributes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.layerIndex.hashCode()
        result = 31 * result + this.hResource.hashCode()
        result = 31 * result + this.compSurfaceLuid.hashCode()
        result = 31 * result + this.vidPnSourceId.hashCode()
        result = 31 * result + this.pPlaneAttributes.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            layerIndex: UInt = 0u,
            hResource: UInt = 0u,
            compSurfaceLuid: Luid = Luid(),
            vidPnSourceId: UInt = 0u,
            pPlaneAttributes: MutPtr = MutPtr(0L),
        ): D3dkmtCheckMultiplaneOverlayPlane3 =
            D3dkmtCheckMultiplaneOverlayPlane3(
                layerIndex = layerIndex,
                hResource = hResource,
                compSurfaceLuid = compSurfaceLuid,
                vidPnSourceId = vidPnSourceId,
                pPlaneAttributesCtorArg = pPlaneAttributes,
            )
    }
}

public data class D3dkmtCheckMultiplaneOverlaySupportReturnInfo(
    public var anonymous: D3dkmtCheckMultiplaneOverlaySupportReturnInfo0 = D3dkmtCheckMultiplaneOverlaySupportReturnInfo0(),
)

public data class D3dkmtCheckMultiplaneOverlaySupportReturnInfo0(
    public var anonymous: D3dkmtCheckMultiplaneOverlaySupportReturnInfo00 = D3dkmtCheckMultiplaneOverlaySupportReturnInfo00(),
    public var value: UInt = 0u,
)

public data class D3dkmtCheckMultiplaneOverlaySupportReturnInfo00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCheckMultiplaneOverlaySupportReturnInfo00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCheckMultiplaneOverlaySupportReturnInfo00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtCheckMultiplaneOverlaySupportReturnInfo00 =
                    D3dkmtCheckMultiplaneOverlaySupportReturnInfo00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtCheckMultiplaneOverlaySupportReturnInfo00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtCloseadapter(
    public var hAdapter: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCloseadapter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCloseadapter> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtCloseadapter =
                    D3dkmtCloseadapter(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtCloseadapter) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAdapter)
                }
            }
    }
}

public data class D3dkmtCompositionPresenthistorytoken(
    public var hPrivateData: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCompositionPresenthistorytoken> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCompositionPresenthistorytoken> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtCompositionPresenthistorytoken =
                    D3dkmtCompositionPresenthistorytoken(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtCompositionPresenthistorytoken) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.hPrivateData)
                }
            }
    }
}

public class D3dkmtConfiguresharedresource internal constructor(
    public var hDevice: UInt,
    public var hResource: UInt,
    public var isDwm: Boolean,
    hProcessCtorArg: Handle,
    public var allowAccess: Boolean,
) {
    public var hProcess: Handle = hProcessCtorArg
        internal set

    public constructor() : this(
        hDevice = 0u,
        hResource = 0u,
        isDwm = false,
        hProcessCtorArg = MutPtr(0L),
        allowAccess = false,
    )

    public operator fun component1(): UInt = this.hDevice

    public operator fun component2(): UInt = this.hResource

    public operator fun component3(): Boolean = this.isDwm

    public operator fun component4(): Handle = this.hProcess

    public operator fun component5(): Boolean = this.allowAccess

    public fun copy(hDevice: UInt = this.hDevice, hResource: UInt = this.hResource, isDwm: Boolean = this.isDwm, hProcess: Handle = this.hProcess, allowAccess: Boolean = this.allowAccess): D3dkmtConfiguresharedresource = D3dkmtConfiguresharedresource(hDevice = hDevice, hResource = hResource, isDwm = isDwm, hProcessCtorArg = hProcess, allowAccess = allowAccess)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtConfiguresharedresource) return false
        if (this.hDevice != other.hDevice) return false
        if (this.hResource != other.hResource) return false
        if (this.isDwm != other.isDwm) return false
        if (this.hProcess != other.hProcess) return false
        if (this.allowAccess != other.allowAccess) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDevice.hashCode()
        result = 31 * result + this.hResource.hashCode()
        result = 31 * result + this.isDwm.hashCode()
        result = 31 * result + this.hProcess.hashCode()
        result = 31 * result + this.allowAccess.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hDevice: UInt = 0u,
            hResource: UInt = 0u,
            isDwm: Boolean = false,
            hProcess: Handle = MutPtr(0L),
            allowAccess: Boolean = false,
        ): D3dkmtConfiguresharedresource =
            D3dkmtConfiguresharedresource(
                hDevice = hDevice,
                hResource = hResource,
                isDwm = isDwm,
                hProcessCtorArg = hProcess,
                allowAccess = allowAccess,
            )
    }
}

public data class D3dkmtConnectDoorbell(
    public var hHwQueue: UInt = 0u,
    public var flags: D3dkmtConnectDoorbellFlags = D3dkmtConnectDoorbellFlags(),
)

public data class D3dkmtConnectDoorbellFlags(
    public var anonymous: D3dkmtConnectDoorbellFlags0 = D3dkmtConnectDoorbellFlags0(),
)

public data class D3dkmtConnectDoorbellFlags0(
    public var anonymous: D3dkmtConnectDoorbellFlags00 = D3dkmtConnectDoorbellFlags00(),
    public var value: UInt = 0u,
)

public data class D3dkmtConnectDoorbellFlags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtConnectDoorbellFlags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtConnectDoorbellFlags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtConnectDoorbellFlags00 =
                    D3dkmtConnectDoorbellFlags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtConnectDoorbellFlags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtCpdrivername(
    public var contentProtectionFileName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtCpdrivername) return false
        if (!this.contentProtectionFileName.contentEquals(other.contentProtectionFileName)) return false
        return true
    }

    override fun hashCode(): Int = this.contentProtectionFileName.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCpdrivername> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCpdrivername> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 520L
                override fun readNative(addr: Long): D3dkmtCpdrivername =
                    D3dkmtCpdrivername(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: D3dkmtCpdrivername) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr, value.contentProtectionFileName.toList())
                }
            }
    }
}

public class D3dkmtCreateallocation internal constructor(
    public var hDevice: UInt,
    public var hResource: UInt,
    public var hGlobalShare: UInt,
    pPrivateRuntimeDataCtorArg: ConstPtr,
    public var privateRuntimeDataSize: UInt,
    public var anonymous1: D3dkmtCreateallocation0,
    public var privateDriverDataSize: UInt,
    public var numAllocations: UInt,
    public var anonymous2: D3dkmtCreateallocation1,
    public var flags: D3dkmtCreateallocationflags,
    hPrivateRuntimeResourceHandleCtorArg: Handle,
) {
    public var pPrivateRuntimeData: ConstPtr = pPrivateRuntimeDataCtorArg
        internal set

    public var hPrivateRuntimeResourceHandle: Handle = hPrivateRuntimeResourceHandleCtorArg
        internal set

    public constructor() : this(
        hDevice = 0u,
        hResource = 0u,
        hGlobalShare = 0u,
        pPrivateRuntimeDataCtorArg = ConstPtr(0L),
        privateRuntimeDataSize = 0u,
        anonymous1 = D3dkmtCreateallocation0(),
        privateDriverDataSize = 0u,
        numAllocations = 0u,
        anonymous2 = D3dkmtCreateallocation1(),
        flags = D3dkmtCreateallocationflags(),
        hPrivateRuntimeResourceHandleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.hDevice

    public operator fun component2(): UInt = this.hResource

    public operator fun component3(): UInt = this.hGlobalShare

    public operator fun component4(): ConstPtr = this.pPrivateRuntimeData

    public operator fun component5(): UInt = this.privateRuntimeDataSize

    public operator fun component6(): D3dkmtCreateallocation0 = this.anonymous1

    public operator fun component7(): UInt = this.privateDriverDataSize

    public operator fun component8(): UInt = this.numAllocations

    public operator fun component9(): D3dkmtCreateallocation1 = this.anonymous2

    public operator fun component10(): D3dkmtCreateallocationflags = this.flags

    public operator fun component11(): Handle = this.hPrivateRuntimeResourceHandle

    public fun copy(hDevice: UInt = this.hDevice, hResource: UInt = this.hResource, hGlobalShare: UInt = this.hGlobalShare, pPrivateRuntimeData: ConstPtr = this.pPrivateRuntimeData, privateRuntimeDataSize: UInt = this.privateRuntimeDataSize, anonymous1: D3dkmtCreateallocation0 = this.anonymous1, privateDriverDataSize: UInt = this.privateDriverDataSize, numAllocations: UInt = this.numAllocations, anonymous2: D3dkmtCreateallocation1 = this.anonymous2, flags: D3dkmtCreateallocationflags = this.flags, hPrivateRuntimeResourceHandle: Handle = this.hPrivateRuntimeResourceHandle): D3dkmtCreateallocation = D3dkmtCreateallocation(hDevice = hDevice, hResource = hResource, hGlobalShare = hGlobalShare, pPrivateRuntimeDataCtorArg = pPrivateRuntimeData, privateRuntimeDataSize = privateRuntimeDataSize, anonymous1 = anonymous1, privateDriverDataSize = privateDriverDataSize, numAllocations = numAllocations, anonymous2 = anonymous2, flags = flags, hPrivateRuntimeResourceHandleCtorArg = hPrivateRuntimeResourceHandle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtCreateallocation) return false
        if (this.hDevice != other.hDevice) return false
        if (this.hResource != other.hResource) return false
        if (this.hGlobalShare != other.hGlobalShare) return false
        if (this.pPrivateRuntimeData != other.pPrivateRuntimeData) return false
        if (this.privateRuntimeDataSize != other.privateRuntimeDataSize) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.privateDriverDataSize != other.privateDriverDataSize) return false
        if (this.numAllocations != other.numAllocations) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.flags != other.flags) return false
        if (this.hPrivateRuntimeResourceHandle != other.hPrivateRuntimeResourceHandle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDevice.hashCode()
        result = 31 * result + this.hResource.hashCode()
        result = 31 * result + this.hGlobalShare.hashCode()
        result = 31 * result + this.pPrivateRuntimeData.hashCode()
        result = 31 * result + this.privateRuntimeDataSize.hashCode()
        result = 31 * result + this.anonymous1.hashCode()
        result = 31 * result + this.privateDriverDataSize.hashCode()
        result = 31 * result + this.numAllocations.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.hPrivateRuntimeResourceHandle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hDevice: UInt = 0u,
            hResource: UInt = 0u,
            hGlobalShare: UInt = 0u,
            pPrivateRuntimeData: ConstPtr = ConstPtr(0L),
            privateRuntimeDataSize: UInt = 0u,
            anonymous1: D3dkmtCreateallocation0 = D3dkmtCreateallocation0(),
            privateDriverDataSize: UInt = 0u,
            numAllocations: UInt = 0u,
            anonymous2: D3dkmtCreateallocation1 = D3dkmtCreateallocation1(),
            flags: D3dkmtCreateallocationflags = D3dkmtCreateallocationflags(),
            hPrivateRuntimeResourceHandle: Handle = MutPtr(0L),
        ): D3dkmtCreateallocation =
            D3dkmtCreateallocation(
                hDevice = hDevice,
                hResource = hResource,
                hGlobalShare = hGlobalShare,
                pPrivateRuntimeDataCtorArg = pPrivateRuntimeData,
                privateRuntimeDataSize = privateRuntimeDataSize,
                anonymous1 = anonymous1,
                privateDriverDataSize = privateDriverDataSize,
                numAllocations = numAllocations,
                anonymous2 = anonymous2,
                flags = flags,
                hPrivateRuntimeResourceHandleCtorArg = hPrivateRuntimeResourceHandle,
            )
    }
}

public class D3dkmtCreateallocation0 internal constructor(
    pStandardAllocationCtorArg: MutPtr,
    pPrivateDriverDataCtorArg: ConstPtr,
) {
    public var pStandardAllocation: MutPtr = pStandardAllocationCtorArg
        internal set

    public var pPrivateDriverData: ConstPtr = pPrivateDriverDataCtorArg
        internal set

    public constructor() : this(
        pStandardAllocationCtorArg = MutPtr(0L),
        pPrivateDriverDataCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): MutPtr = this.pStandardAllocation

    public operator fun component2(): ConstPtr = this.pPrivateDriverData

    public fun copy(pStandardAllocation: MutPtr = this.pStandardAllocation, pPrivateDriverData: ConstPtr = this.pPrivateDriverData): D3dkmtCreateallocation0 = D3dkmtCreateallocation0(pStandardAllocationCtorArg = pStandardAllocation, pPrivateDriverDataCtorArg = pPrivateDriverData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtCreateallocation0) return false
        if (this.pStandardAllocation != other.pStandardAllocation) return false
        if (this.pPrivateDriverData != other.pPrivateDriverData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pStandardAllocation.hashCode()
        result = 31 * result + this.pPrivateDriverData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pStandardAllocation: MutPtr = MutPtr(0L),
            pPrivateDriverData: ConstPtr = ConstPtr(0L),
        ): D3dkmtCreateallocation0 =
            D3dkmtCreateallocation0(
                pStandardAllocationCtorArg = pStandardAllocation,
                pPrivateDriverDataCtorArg = pPrivateDriverData,
            )
    }
}

public class D3dkmtCreateallocation1 internal constructor(
    pAllocationInfoCtorArg: MutPtr,
    pAllocationInfo2CtorArg: MutPtr,
) {
    public var pAllocationInfo: MutPtr = pAllocationInfoCtorArg
        internal set

    public var pAllocationInfo2: MutPtr = pAllocationInfo2CtorArg
        internal set

    public constructor() : this(
        pAllocationInfoCtorArg = MutPtr(0L),
        pAllocationInfo2CtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.pAllocationInfo

    public operator fun component2(): MutPtr = this.pAllocationInfo2

    public fun copy(pAllocationInfo: MutPtr = this.pAllocationInfo, pAllocationInfo2: MutPtr = this.pAllocationInfo2): D3dkmtCreateallocation1 = D3dkmtCreateallocation1(pAllocationInfoCtorArg = pAllocationInfo, pAllocationInfo2CtorArg = pAllocationInfo2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtCreateallocation1) return false
        if (this.pAllocationInfo != other.pAllocationInfo) return false
        if (this.pAllocationInfo2 != other.pAllocationInfo2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pAllocationInfo.hashCode()
        result = 31 * result + this.pAllocationInfo2.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pAllocationInfo: MutPtr = MutPtr(0L),
            pAllocationInfo2: MutPtr = MutPtr(0L),
        ): D3dkmtCreateallocation1 =
            D3dkmtCreateallocation1(
                pAllocationInfoCtorArg = pAllocationInfo,
                pAllocationInfo2CtorArg = pAllocationInfo2,
            )
    }
}

public data class D3dkmtCreateallocationflags(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCreateallocationflags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCreateallocationflags> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtCreateallocationflags =
                    D3dkmtCreateallocationflags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtCreateallocationflags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class D3dkmtCreatecontext internal constructor(
    public var hDevice: UInt,
    public var nodeOrdinal: UInt,
    public var engineAffinity: UInt,
    public var flags: D3dddiCreatecontextflags,
    pPrivateDriverDataCtorArg: MutPtr,
    public var privateDriverDataSize: UInt,
    public var clientHint: D3dkmtClienthint,
    public var hContext: UInt,
    pCommandBufferCtorArg: MutPtr,
    public var commandBufferSize: UInt,
    pAllocationListCtorArg: MutPtr,
    public var allocationListSize: UInt,
    pPatchLocationListCtorArg: MutPtr,
    public var patchLocationListSize: UInt,
    public var commandBuffer: ULong,
) {
    public var pPrivateDriverData: MutPtr = pPrivateDriverDataCtorArg
        internal set

    public var pCommandBuffer: MutPtr = pCommandBufferCtorArg
        internal set

    public var pAllocationList: MutPtr = pAllocationListCtorArg
        internal set

    public var pPatchLocationList: MutPtr = pPatchLocationListCtorArg
        internal set

    public constructor() : this(
        hDevice = 0u,
        nodeOrdinal = 0u,
        engineAffinity = 0u,
        flags = D3dddiCreatecontextflags(),
        pPrivateDriverDataCtorArg = MutPtr(0L),
        privateDriverDataSize = 0u,
        clientHint = 0,
        hContext = 0u,
        pCommandBufferCtorArg = MutPtr(0L),
        commandBufferSize = 0u,
        pAllocationListCtorArg = MutPtr(0L),
        allocationListSize = 0u,
        pPatchLocationListCtorArg = MutPtr(0L),
        patchLocationListSize = 0u,
        commandBuffer = 0uL,
    )

    public operator fun component1(): UInt = this.hDevice

    public operator fun component2(): UInt = this.nodeOrdinal

    public operator fun component3(): UInt = this.engineAffinity

    public operator fun component4(): D3dddiCreatecontextflags = this.flags

    public operator fun component5(): MutPtr = this.pPrivateDriverData

    public operator fun component6(): UInt = this.privateDriverDataSize

    public operator fun component7(): D3dkmtClienthint = this.clientHint

    public operator fun component8(): UInt = this.hContext

    public operator fun component9(): MutPtr = this.pCommandBuffer

    public operator fun component10(): UInt = this.commandBufferSize

    public operator fun component11(): MutPtr = this.pAllocationList

    public operator fun component12(): UInt = this.allocationListSize

    public operator fun component13(): MutPtr = this.pPatchLocationList

    public operator fun component14(): UInt = this.patchLocationListSize

    public operator fun component15(): ULong = this.commandBuffer

    public fun copy(hDevice: UInt = this.hDevice, nodeOrdinal: UInt = this.nodeOrdinal, engineAffinity: UInt = this.engineAffinity, flags: D3dddiCreatecontextflags = this.flags, pPrivateDriverData: MutPtr = this.pPrivateDriverData, privateDriverDataSize: UInt = this.privateDriverDataSize, clientHint: D3dkmtClienthint = this.clientHint, hContext: UInt = this.hContext, pCommandBuffer: MutPtr = this.pCommandBuffer, commandBufferSize: UInt = this.commandBufferSize, pAllocationList: MutPtr = this.pAllocationList, allocationListSize: UInt = this.allocationListSize, pPatchLocationList: MutPtr = this.pPatchLocationList, patchLocationListSize: UInt = this.patchLocationListSize, commandBuffer: ULong = this.commandBuffer): D3dkmtCreatecontext = D3dkmtCreatecontext(hDevice = hDevice, nodeOrdinal = nodeOrdinal, engineAffinity = engineAffinity, flags = flags, pPrivateDriverDataCtorArg = pPrivateDriverData, privateDriverDataSize = privateDriverDataSize, clientHint = clientHint, hContext = hContext, pCommandBufferCtorArg = pCommandBuffer, commandBufferSize = commandBufferSize, pAllocationListCtorArg = pAllocationList, allocationListSize = allocationListSize, pPatchLocationListCtorArg = pPatchLocationList, patchLocationListSize = patchLocationListSize, commandBuffer = commandBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtCreatecontext) return false
        if (this.hDevice != other.hDevice) return false
        if (this.nodeOrdinal != other.nodeOrdinal) return false
        if (this.engineAffinity != other.engineAffinity) return false
        if (this.flags != other.flags) return false
        if (this.pPrivateDriverData != other.pPrivateDriverData) return false
        if (this.privateDriverDataSize != other.privateDriverDataSize) return false
        if (this.clientHint != other.clientHint) return false
        if (this.hContext != other.hContext) return false
        if (this.pCommandBuffer != other.pCommandBuffer) return false
        if (this.commandBufferSize != other.commandBufferSize) return false
        if (this.pAllocationList != other.pAllocationList) return false
        if (this.allocationListSize != other.allocationListSize) return false
        if (this.pPatchLocationList != other.pPatchLocationList) return false
        if (this.patchLocationListSize != other.patchLocationListSize) return false
        if (this.commandBuffer != other.commandBuffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDevice.hashCode()
        result = 31 * result + this.nodeOrdinal.hashCode()
        result = 31 * result + this.engineAffinity.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.pPrivateDriverData.hashCode()
        result = 31 * result + this.privateDriverDataSize.hashCode()
        result = 31 * result + this.clientHint.hashCode()
        result = 31 * result + this.hContext.hashCode()
        result = 31 * result + this.pCommandBuffer.hashCode()
        result = 31 * result + this.commandBufferSize.hashCode()
        result = 31 * result + this.pAllocationList.hashCode()
        result = 31 * result + this.allocationListSize.hashCode()
        result = 31 * result + this.pPatchLocationList.hashCode()
        result = 31 * result + this.patchLocationListSize.hashCode()
        result = 31 * result + this.commandBuffer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hDevice: UInt = 0u,
            nodeOrdinal: UInt = 0u,
            engineAffinity: UInt = 0u,
            flags: D3dddiCreatecontextflags = D3dddiCreatecontextflags(),
            pPrivateDriverData: MutPtr = MutPtr(0L),
            privateDriverDataSize: UInt = 0u,
            clientHint: D3dkmtClienthint = 0,
            hContext: UInt = 0u,
            pCommandBuffer: MutPtr = MutPtr(0L),
            commandBufferSize: UInt = 0u,
            pAllocationList: MutPtr = MutPtr(0L),
            allocationListSize: UInt = 0u,
            pPatchLocationList: MutPtr = MutPtr(0L),
            patchLocationListSize: UInt = 0u,
            commandBuffer: ULong = 0uL,
        ): D3dkmtCreatecontext =
            D3dkmtCreatecontext(
                hDevice = hDevice,
                nodeOrdinal = nodeOrdinal,
                engineAffinity = engineAffinity,
                flags = flags,
                pPrivateDriverDataCtorArg = pPrivateDriverData,
                privateDriverDataSize = privateDriverDataSize,
                clientHint = clientHint,
                hContext = hContext,
                pCommandBufferCtorArg = pCommandBuffer,
                commandBufferSize = commandBufferSize,
                pAllocationListCtorArg = pAllocationList,
                allocationListSize = allocationListSize,
                pPatchLocationListCtorArg = pPatchLocationList,
                patchLocationListSize = patchLocationListSize,
                commandBuffer = commandBuffer,
            )
    }
}

public class D3dkmtCreatecontextvirtual internal constructor(
    public var hDevice: UInt,
    public var nodeOrdinal: UInt,
    public var engineAffinity: UInt,
    public var flags: D3dddiCreatecontextflags,
    pPrivateDriverDataCtorArg: MutPtr,
    public var privateDriverDataSize: UInt,
    public var clientHint: D3dkmtClienthint,
    public var hContext: UInt,
) {
    public var pPrivateDriverData: MutPtr = pPrivateDriverDataCtorArg
        internal set

    public constructor() : this(
        hDevice = 0u,
        nodeOrdinal = 0u,
        engineAffinity = 0u,
        flags = D3dddiCreatecontextflags(),
        pPrivateDriverDataCtorArg = MutPtr(0L),
        privateDriverDataSize = 0u,
        clientHint = 0,
        hContext = 0u,
    )

    public operator fun component1(): UInt = this.hDevice

    public operator fun component2(): UInt = this.nodeOrdinal

    public operator fun component3(): UInt = this.engineAffinity

    public operator fun component4(): D3dddiCreatecontextflags = this.flags

    public operator fun component5(): MutPtr = this.pPrivateDriverData

    public operator fun component6(): UInt = this.privateDriverDataSize

    public operator fun component7(): D3dkmtClienthint = this.clientHint

    public operator fun component8(): UInt = this.hContext

    public fun copy(hDevice: UInt = this.hDevice, nodeOrdinal: UInt = this.nodeOrdinal, engineAffinity: UInt = this.engineAffinity, flags: D3dddiCreatecontextflags = this.flags, pPrivateDriverData: MutPtr = this.pPrivateDriverData, privateDriverDataSize: UInt = this.privateDriverDataSize, clientHint: D3dkmtClienthint = this.clientHint, hContext: UInt = this.hContext): D3dkmtCreatecontextvirtual = D3dkmtCreatecontextvirtual(hDevice = hDevice, nodeOrdinal = nodeOrdinal, engineAffinity = engineAffinity, flags = flags, pPrivateDriverDataCtorArg = pPrivateDriverData, privateDriverDataSize = privateDriverDataSize, clientHint = clientHint, hContext = hContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtCreatecontextvirtual) return false
        if (this.hDevice != other.hDevice) return false
        if (this.nodeOrdinal != other.nodeOrdinal) return false
        if (this.engineAffinity != other.engineAffinity) return false
        if (this.flags != other.flags) return false
        if (this.pPrivateDriverData != other.pPrivateDriverData) return false
        if (this.privateDriverDataSize != other.privateDriverDataSize) return false
        if (this.clientHint != other.clientHint) return false
        if (this.hContext != other.hContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDevice.hashCode()
        result = 31 * result + this.nodeOrdinal.hashCode()
        result = 31 * result + this.engineAffinity.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.pPrivateDriverData.hashCode()
        result = 31 * result + this.privateDriverDataSize.hashCode()
        result = 31 * result + this.clientHint.hashCode()
        result = 31 * result + this.hContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hDevice: UInt = 0u,
            nodeOrdinal: UInt = 0u,
            engineAffinity: UInt = 0u,
            flags: D3dddiCreatecontextflags = D3dddiCreatecontextflags(),
            pPrivateDriverData: MutPtr = MutPtr(0L),
            privateDriverDataSize: UInt = 0u,
            clientHint: D3dkmtClienthint = 0,
            hContext: UInt = 0u,
        ): D3dkmtCreatecontextvirtual =
            D3dkmtCreatecontextvirtual(
                hDevice = hDevice,
                nodeOrdinal = nodeOrdinal,
                engineAffinity = engineAffinity,
                flags = flags,
                pPrivateDriverDataCtorArg = pPrivateDriverData,
                privateDriverDataSize = privateDriverDataSize,
                clientHint = clientHint,
                hContext = hContext,
            )
    }
}

public class D3dkmtCreatedcfrommemory internal constructor(
    pMemoryCtorArg: MutPtr,
    public var format: D3dddiformat,
    public var width: UInt,
    public var height: UInt,
    public var pitch: UInt,
    hDeviceDcCtorArg: Hdc,
    pColorTableCtorArg: MutPtr,
    hDcCtorArg: Hdc,
    hBitmapCtorArg: Handle,
) {
    public var pMemory: MutPtr = pMemoryCtorArg
        internal set

    public var hDeviceDc: Hdc = hDeviceDcCtorArg
        internal set

    public var pColorTable: MutPtr = pColorTableCtorArg
        internal set

    public var hDc: Hdc = hDcCtorArg
        internal set

    public var hBitmap: Handle = hBitmapCtorArg
        internal set

    public constructor() : this(
        pMemoryCtorArg = MutPtr(0L),
        format = 0u,
        width = 0u,
        height = 0u,
        pitch = 0u,
        hDeviceDcCtorArg = MutPtr(0L),
        pColorTableCtorArg = MutPtr(0L),
        hDcCtorArg = MutPtr(0L),
        hBitmapCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.pMemory

    public operator fun component2(): D3dddiformat = this.format

    public operator fun component3(): UInt = this.width

    public operator fun component4(): UInt = this.height

    public operator fun component5(): UInt = this.pitch

    public operator fun component6(): Hdc = this.hDeviceDc

    public operator fun component7(): MutPtr = this.pColorTable

    public operator fun component8(): Hdc = this.hDc

    public operator fun component9(): Handle = this.hBitmap

    public fun copy(pMemory: MutPtr = this.pMemory, format: D3dddiformat = this.format, width: UInt = this.width, height: UInt = this.height, pitch: UInt = this.pitch, hDeviceDc: Hdc = this.hDeviceDc, pColorTable: MutPtr = this.pColorTable, hDc: Hdc = this.hDc, hBitmap: Handle = this.hBitmap): D3dkmtCreatedcfrommemory = D3dkmtCreatedcfrommemory(pMemoryCtorArg = pMemory, format = format, width = width, height = height, pitch = pitch, hDeviceDcCtorArg = hDeviceDc, pColorTableCtorArg = pColorTable, hDcCtorArg = hDc, hBitmapCtorArg = hBitmap)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtCreatedcfrommemory) return false
        if (this.pMemory != other.pMemory) return false
        if (this.format != other.format) return false
        if (this.width != other.width) return false
        if (this.height != other.height) return false
        if (this.pitch != other.pitch) return false
        if (this.hDeviceDc != other.hDeviceDc) return false
        if (this.pColorTable != other.pColorTable) return false
        if (this.hDc != other.hDc) return false
        if (this.hBitmap != other.hBitmap) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pMemory.hashCode()
        result = 31 * result + this.format.hashCode()
        result = 31 * result + this.width.hashCode()
        result = 31 * result + this.height.hashCode()
        result = 31 * result + this.pitch.hashCode()
        result = 31 * result + this.hDeviceDc.hashCode()
        result = 31 * result + this.pColorTable.hashCode()
        result = 31 * result + this.hDc.hashCode()
        result = 31 * result + this.hBitmap.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pMemory: MutPtr = MutPtr(0L),
            format: D3dddiformat = 0u,
            width: UInt = 0u,
            height: UInt = 0u,
            pitch: UInt = 0u,
            hDeviceDc: Hdc = MutPtr(0L),
            pColorTable: MutPtr = MutPtr(0L),
            hDc: Hdc = MutPtr(0L),
            hBitmap: Handle = MutPtr(0L),
        ): D3dkmtCreatedcfrommemory =
            D3dkmtCreatedcfrommemory(
                pMemoryCtorArg = pMemory,
                format = format,
                width = width,
                height = height,
                pitch = pitch,
                hDeviceDcCtorArg = hDeviceDc,
                pColorTableCtorArg = pColorTable,
                hDcCtorArg = hDc,
                hBitmapCtorArg = hBitmap,
            )
    }
}

public class D3dkmtCreatedevice internal constructor(
    public var anonymous: D3dkmtCreatedevice0,
    public var flags: D3dkmtCreatedeviceflags,
    public var hDevice: UInt,
    pCommandBufferCtorArg: MutPtr,
    public var commandBufferSize: UInt,
    pAllocationListCtorArg: MutPtr,
    public var allocationListSize: UInt,
    pPatchLocationListCtorArg: MutPtr,
    public var patchLocationListSize: UInt,
) {
    public var pCommandBuffer: MutPtr = pCommandBufferCtorArg
        internal set

    public var pAllocationList: MutPtr = pAllocationListCtorArg
        internal set

    public var pPatchLocationList: MutPtr = pPatchLocationListCtorArg
        internal set

    public constructor() : this(
        anonymous = D3dkmtCreatedevice0(),
        flags = D3dkmtCreatedeviceflags(),
        hDevice = 0u,
        pCommandBufferCtorArg = MutPtr(0L),
        commandBufferSize = 0u,
        pAllocationListCtorArg = MutPtr(0L),
        allocationListSize = 0u,
        pPatchLocationListCtorArg = MutPtr(0L),
        patchLocationListSize = 0u,
    )

    public operator fun component1(): D3dkmtCreatedevice0 = this.anonymous

    public operator fun component2(): D3dkmtCreatedeviceflags = this.flags

    public operator fun component3(): UInt = this.hDevice

    public operator fun component4(): MutPtr = this.pCommandBuffer

    public operator fun component5(): UInt = this.commandBufferSize

    public operator fun component6(): MutPtr = this.pAllocationList

    public operator fun component7(): UInt = this.allocationListSize

    public operator fun component8(): MutPtr = this.pPatchLocationList

    public operator fun component9(): UInt = this.patchLocationListSize

    public fun copy(anonymous: D3dkmtCreatedevice0 = this.anonymous, flags: D3dkmtCreatedeviceflags = this.flags, hDevice: UInt = this.hDevice, pCommandBuffer: MutPtr = this.pCommandBuffer, commandBufferSize: UInt = this.commandBufferSize, pAllocationList: MutPtr = this.pAllocationList, allocationListSize: UInt = this.allocationListSize, pPatchLocationList: MutPtr = this.pPatchLocationList, patchLocationListSize: UInt = this.patchLocationListSize): D3dkmtCreatedevice = D3dkmtCreatedevice(anonymous = anonymous, flags = flags, hDevice = hDevice, pCommandBufferCtorArg = pCommandBuffer, commandBufferSize = commandBufferSize, pAllocationListCtorArg = pAllocationList, allocationListSize = allocationListSize, pPatchLocationListCtorArg = pPatchLocationList, patchLocationListSize = patchLocationListSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtCreatedevice) return false
        if (this.anonymous != other.anonymous) return false
        if (this.flags != other.flags) return false
        if (this.hDevice != other.hDevice) return false
        if (this.pCommandBuffer != other.pCommandBuffer) return false
        if (this.commandBufferSize != other.commandBufferSize) return false
        if (this.pAllocationList != other.pAllocationList) return false
        if (this.allocationListSize != other.allocationListSize) return false
        if (this.pPatchLocationList != other.pPatchLocationList) return false
        if (this.patchLocationListSize != other.patchLocationListSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.hDevice.hashCode()
        result = 31 * result + this.pCommandBuffer.hashCode()
        result = 31 * result + this.commandBufferSize.hashCode()
        result = 31 * result + this.pAllocationList.hashCode()
        result = 31 * result + this.allocationListSize.hashCode()
        result = 31 * result + this.pPatchLocationList.hashCode()
        result = 31 * result + this.patchLocationListSize.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            anonymous: D3dkmtCreatedevice0 = D3dkmtCreatedevice0(),
            flags: D3dkmtCreatedeviceflags = D3dkmtCreatedeviceflags(),
            hDevice: UInt = 0u,
            pCommandBuffer: MutPtr = MutPtr(0L),
            commandBufferSize: UInt = 0u,
            pAllocationList: MutPtr = MutPtr(0L),
            allocationListSize: UInt = 0u,
            pPatchLocationList: MutPtr = MutPtr(0L),
            patchLocationListSize: UInt = 0u,
        ): D3dkmtCreatedevice =
            D3dkmtCreatedevice(
                anonymous = anonymous,
                flags = flags,
                hDevice = hDevice,
                pCommandBufferCtorArg = pCommandBuffer,
                commandBufferSize = commandBufferSize,
                pAllocationListCtorArg = pAllocationList,
                allocationListSize = allocationListSize,
                pPatchLocationListCtorArg = pPatchLocationList,
                patchLocationListSize = patchLocationListSize,
            )
    }
}

public class D3dkmtCreatedevice0 internal constructor(
    public var hAdapter: UInt,
    pAdapterCtorArg: MutPtr,
) {
    public var pAdapter: MutPtr = pAdapterCtorArg
        internal set

    public constructor() : this(
        hAdapter = 0u,
        pAdapterCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.hAdapter

    public operator fun component2(): MutPtr = this.pAdapter

    public fun copy(hAdapter: UInt = this.hAdapter, pAdapter: MutPtr = this.pAdapter): D3dkmtCreatedevice0 = D3dkmtCreatedevice0(hAdapter = hAdapter, pAdapterCtorArg = pAdapter)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtCreatedevice0) return false
        if (this.hAdapter != other.hAdapter) return false
        if (this.pAdapter != other.pAdapter) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hAdapter.hashCode()
        result = 31 * result + this.pAdapter.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hAdapter: UInt = 0u,
            pAdapter: MutPtr = MutPtr(0L),
        ): D3dkmtCreatedevice0 =
            D3dkmtCreatedevice0(
                hAdapter = hAdapter,
                pAdapterCtorArg = pAdapter,
            )
    }
}

public data class D3dkmtCreatedeviceflags(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCreatedeviceflags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCreatedeviceflags> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtCreatedeviceflags =
                    D3dkmtCreatedeviceflags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtCreatedeviceflags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class D3dkmtCreatehwcontext internal constructor(
    public var hDevice: UInt,
    public var nodeOrdinal: UInt,
    public var engineAffinity: UInt,
    public var flags: D3dddiCreatehwcontextflags,
    public var privateDriverDataSize: UInt,
    pPrivateDriverDataCtorArg: MutPtr,
    public var hHwContext: UInt,
) {
    public var pPrivateDriverData: MutPtr = pPrivateDriverDataCtorArg
        internal set

    public constructor() : this(
        hDevice = 0u,
        nodeOrdinal = 0u,
        engineAffinity = 0u,
        flags = D3dddiCreatehwcontextflags(),
        privateDriverDataSize = 0u,
        pPrivateDriverDataCtorArg = MutPtr(0L),
        hHwContext = 0u,
    )

    public operator fun component1(): UInt = this.hDevice

    public operator fun component2(): UInt = this.nodeOrdinal

    public operator fun component3(): UInt = this.engineAffinity

    public operator fun component4(): D3dddiCreatehwcontextflags = this.flags

    public operator fun component5(): UInt = this.privateDriverDataSize

    public operator fun component6(): MutPtr = this.pPrivateDriverData

    public operator fun component7(): UInt = this.hHwContext

    public fun copy(hDevice: UInt = this.hDevice, nodeOrdinal: UInt = this.nodeOrdinal, engineAffinity: UInt = this.engineAffinity, flags: D3dddiCreatehwcontextflags = this.flags, privateDriverDataSize: UInt = this.privateDriverDataSize, pPrivateDriverData: MutPtr = this.pPrivateDriverData, hHwContext: UInt = this.hHwContext): D3dkmtCreatehwcontext = D3dkmtCreatehwcontext(hDevice = hDevice, nodeOrdinal = nodeOrdinal, engineAffinity = engineAffinity, flags = flags, privateDriverDataSize = privateDriverDataSize, pPrivateDriverDataCtorArg = pPrivateDriverData, hHwContext = hHwContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtCreatehwcontext) return false
        if (this.hDevice != other.hDevice) return false
        if (this.nodeOrdinal != other.nodeOrdinal) return false
        if (this.engineAffinity != other.engineAffinity) return false
        if (this.flags != other.flags) return false
        if (this.privateDriverDataSize != other.privateDriverDataSize) return false
        if (this.pPrivateDriverData != other.pPrivateDriverData) return false
        if (this.hHwContext != other.hHwContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDevice.hashCode()
        result = 31 * result + this.nodeOrdinal.hashCode()
        result = 31 * result + this.engineAffinity.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.privateDriverDataSize.hashCode()
        result = 31 * result + this.pPrivateDriverData.hashCode()
        result = 31 * result + this.hHwContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hDevice: UInt = 0u,
            nodeOrdinal: UInt = 0u,
            engineAffinity: UInt = 0u,
            flags: D3dddiCreatehwcontextflags = D3dddiCreatehwcontextflags(),
            privateDriverDataSize: UInt = 0u,
            pPrivateDriverData: MutPtr = MutPtr(0L),
            hHwContext: UInt = 0u,
        ): D3dkmtCreatehwcontext =
            D3dkmtCreatehwcontext(
                hDevice = hDevice,
                nodeOrdinal = nodeOrdinal,
                engineAffinity = engineAffinity,
                flags = flags,
                privateDriverDataSize = privateDriverDataSize,
                pPrivateDriverDataCtorArg = pPrivateDriverData,
                hHwContext = hHwContext,
            )
    }
}

public class D3dkmtCreatehwqueue internal constructor(
    public var hHwContext: UInt,
    public var flags: D3dddiCreatehwqueueflags,
    public var privateDriverDataSize: UInt,
    pPrivateDriverDataCtorArg: MutPtr,
    public var hHwQueue: UInt,
    public var hHwQueueProgressFence: UInt,
    hwQueueProgressFenceCPUVirtualAddressCtorArg: MutPtr,
    public var hwQueueProgressFenceGPUVirtualAddress: ULong,
) {
    public var pPrivateDriverData: MutPtr = pPrivateDriverDataCtorArg
        internal set

    public var hwQueueProgressFenceCPUVirtualAddress: MutPtr = hwQueueProgressFenceCPUVirtualAddressCtorArg
        internal set

    public constructor() : this(
        hHwContext = 0u,
        flags = D3dddiCreatehwqueueflags(),
        privateDriverDataSize = 0u,
        pPrivateDriverDataCtorArg = MutPtr(0L),
        hHwQueue = 0u,
        hHwQueueProgressFence = 0u,
        hwQueueProgressFenceCPUVirtualAddressCtorArg = MutPtr(0L),
        hwQueueProgressFenceGPUVirtualAddress = 0uL,
    )

    public operator fun component1(): UInt = this.hHwContext

    public operator fun component2(): D3dddiCreatehwqueueflags = this.flags

    public operator fun component3(): UInt = this.privateDriverDataSize

    public operator fun component4(): MutPtr = this.pPrivateDriverData

    public operator fun component5(): UInt = this.hHwQueue

    public operator fun component6(): UInt = this.hHwQueueProgressFence

    public operator fun component7(): MutPtr = this.hwQueueProgressFenceCPUVirtualAddress

    public operator fun component8(): ULong = this.hwQueueProgressFenceGPUVirtualAddress

    public fun copy(hHwContext: UInt = this.hHwContext, flags: D3dddiCreatehwqueueflags = this.flags, privateDriverDataSize: UInt = this.privateDriverDataSize, pPrivateDriverData: MutPtr = this.pPrivateDriverData, hHwQueue: UInt = this.hHwQueue, hHwQueueProgressFence: UInt = this.hHwQueueProgressFence, hwQueueProgressFenceCPUVirtualAddress: MutPtr = this.hwQueueProgressFenceCPUVirtualAddress, hwQueueProgressFenceGPUVirtualAddress: ULong = this.hwQueueProgressFenceGPUVirtualAddress): D3dkmtCreatehwqueue = D3dkmtCreatehwqueue(hHwContext = hHwContext, flags = flags, privateDriverDataSize = privateDriverDataSize, pPrivateDriverDataCtorArg = pPrivateDriverData, hHwQueue = hHwQueue, hHwQueueProgressFence = hHwQueueProgressFence, hwQueueProgressFenceCPUVirtualAddressCtorArg = hwQueueProgressFenceCPUVirtualAddress, hwQueueProgressFenceGPUVirtualAddress = hwQueueProgressFenceGPUVirtualAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtCreatehwqueue) return false
        if (this.hHwContext != other.hHwContext) return false
        if (this.flags != other.flags) return false
        if (this.privateDriverDataSize != other.privateDriverDataSize) return false
        if (this.pPrivateDriverData != other.pPrivateDriverData) return false
        if (this.hHwQueue != other.hHwQueue) return false
        if (this.hHwQueueProgressFence != other.hHwQueueProgressFence) return false
        if (this.hwQueueProgressFenceCPUVirtualAddress != other.hwQueueProgressFenceCPUVirtualAddress) return false
        if (this.hwQueueProgressFenceGPUVirtualAddress != other.hwQueueProgressFenceGPUVirtualAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hHwContext.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.privateDriverDataSize.hashCode()
        result = 31 * result + this.pPrivateDriverData.hashCode()
        result = 31 * result + this.hHwQueue.hashCode()
        result = 31 * result + this.hHwQueueProgressFence.hashCode()
        result = 31 * result + this.hwQueueProgressFenceCPUVirtualAddress.hashCode()
        result = 31 * result + this.hwQueueProgressFenceGPUVirtualAddress.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hHwContext: UInt = 0u,
            flags: D3dddiCreatehwqueueflags = D3dddiCreatehwqueueflags(),
            privateDriverDataSize: UInt = 0u,
            pPrivateDriverData: MutPtr = MutPtr(0L),
            hHwQueue: UInt = 0u,
            hHwQueueProgressFence: UInt = 0u,
            hwQueueProgressFenceCPUVirtualAddress: MutPtr = MutPtr(0L),
            hwQueueProgressFenceGPUVirtualAddress: ULong = 0uL,
        ): D3dkmtCreatehwqueue =
            D3dkmtCreatehwqueue(
                hHwContext = hHwContext,
                flags = flags,
                privateDriverDataSize = privateDriverDataSize,
                pPrivateDriverDataCtorArg = pPrivateDriverData,
                hHwQueue = hHwQueue,
                hHwQueueProgressFence = hHwQueueProgressFence,
                hwQueueProgressFenceCPUVirtualAddressCtorArg = hwQueueProgressFenceCPUVirtualAddress,
                hwQueueProgressFenceGPUVirtualAddress = hwQueueProgressFenceGPUVirtualAddress,
            )
    }
}

public data class D3dkmtCreatekeyedmutex(
    public var initialValue: ULong = 0uL,
    public var hSharedHandle: UInt = 0u,
    public var hKeyedMutex: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCreatekeyedmutex> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCreatekeyedmutex> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): D3dkmtCreatekeyedmutex =
                    D3dkmtCreatekeyedmutex(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtCreatekeyedmutex) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.initialValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.hSharedHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.hKeyedMutex)
                }
            }
    }
}

public class D3dkmtCreatekeyedmutex2 internal constructor(
    public var initialValue: ULong,
    public var hSharedHandle: UInt,
    public var hKeyedMutex: UInt,
    pPrivateRuntimeDataCtorArg: MutPtr,
    public var privateRuntimeDataSize: UInt,
    public var flags: D3dkmtCreatekeyedmutex2Flags,
) {
    public var pPrivateRuntimeData: MutPtr = pPrivateRuntimeDataCtorArg
        internal set

    public constructor() : this(
        initialValue = 0uL,
        hSharedHandle = 0u,
        hKeyedMutex = 0u,
        pPrivateRuntimeDataCtorArg = MutPtr(0L),
        privateRuntimeDataSize = 0u,
        flags = D3dkmtCreatekeyedmutex2Flags(),
    )

    public operator fun component1(): ULong = this.initialValue

    public operator fun component2(): UInt = this.hSharedHandle

    public operator fun component3(): UInt = this.hKeyedMutex

    public operator fun component4(): MutPtr = this.pPrivateRuntimeData

    public operator fun component5(): UInt = this.privateRuntimeDataSize

    public operator fun component6(): D3dkmtCreatekeyedmutex2Flags = this.flags

    public fun copy(initialValue: ULong = this.initialValue, hSharedHandle: UInt = this.hSharedHandle, hKeyedMutex: UInt = this.hKeyedMutex, pPrivateRuntimeData: MutPtr = this.pPrivateRuntimeData, privateRuntimeDataSize: UInt = this.privateRuntimeDataSize, flags: D3dkmtCreatekeyedmutex2Flags = this.flags): D3dkmtCreatekeyedmutex2 = D3dkmtCreatekeyedmutex2(initialValue = initialValue, hSharedHandle = hSharedHandle, hKeyedMutex = hKeyedMutex, pPrivateRuntimeDataCtorArg = pPrivateRuntimeData, privateRuntimeDataSize = privateRuntimeDataSize, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtCreatekeyedmutex2) return false
        if (this.initialValue != other.initialValue) return false
        if (this.hSharedHandle != other.hSharedHandle) return false
        if (this.hKeyedMutex != other.hKeyedMutex) return false
        if (this.pPrivateRuntimeData != other.pPrivateRuntimeData) return false
        if (this.privateRuntimeDataSize != other.privateRuntimeDataSize) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.initialValue.hashCode()
        result = 31 * result + this.hSharedHandle.hashCode()
        result = 31 * result + this.hKeyedMutex.hashCode()
        result = 31 * result + this.pPrivateRuntimeData.hashCode()
        result = 31 * result + this.privateRuntimeDataSize.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            initialValue: ULong = 0uL,
            hSharedHandle: UInt = 0u,
            hKeyedMutex: UInt = 0u,
            pPrivateRuntimeData: MutPtr = MutPtr(0L),
            privateRuntimeDataSize: UInt = 0u,
            flags: D3dkmtCreatekeyedmutex2Flags = D3dkmtCreatekeyedmutex2Flags(),
        ): D3dkmtCreatekeyedmutex2 =
            D3dkmtCreatekeyedmutex2(
                initialValue = initialValue,
                hSharedHandle = hSharedHandle,
                hKeyedMutex = hKeyedMutex,
                pPrivateRuntimeDataCtorArg = pPrivateRuntimeData,
                privateRuntimeDataSize = privateRuntimeDataSize,
                flags = flags,
            )
    }
}

public data class D3dkmtCreatekeyedmutex2Flags(
    public var anonymous: D3dkmtCreatekeyedmutex2Flags0 = D3dkmtCreatekeyedmutex2Flags0(),
)

public data class D3dkmtCreatekeyedmutex2Flags0(
    public var anonymous: D3dkmtCreatekeyedmutex2Flags00 = D3dkmtCreatekeyedmutex2Flags00(),
    public var value: UInt = 0u,
)

public data class D3dkmtCreatekeyedmutex2Flags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCreatekeyedmutex2Flags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCreatekeyedmutex2Flags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtCreatekeyedmutex2Flags00 =
                    D3dkmtCreatekeyedmutex2Flags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtCreatekeyedmutex2Flags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtCreatenativefence(
    public var hDevice: UInt = 0u,
    public var info: D3dddiCreatenativefenceinfo = D3dddiCreatenativefenceinfo(),
)

public data class D3dkmtCreateoverlay(
    public var vidPnSourceId: UInt = 0u,
    public var hDevice: UInt = 0u,
    public var overlayInfo: D3dddiKerneloverlayinfo = D3dddiKerneloverlayinfo(),
    public var hOverlay: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCreateoverlay> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCreateoverlay> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): D3dkmtCreateoverlay =
                    D3dkmtCreateoverlay(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (D3dddiKerneloverlayinfo.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtCreateoverlay) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.vidPnSourceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hDevice)
                    (D3dddiKerneloverlayinfo.typeLayout()).writeNative(addr + 8L, value.overlayInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.hOverlay)
                }
            }
    }
}

public class D3dkmtCreatepagingqueue internal constructor(
    public var hDevice: UInt,
    public var priority: D3dddiPagingqueuePriority,
    public var hPagingQueue: UInt,
    public var hSyncObject: UInt,
    fenceValueCPUVirtualAddressCtorArg: MutPtr,
    public var physicalAdapterIndex: UInt,
) {
    public var fenceValueCPUVirtualAddress: MutPtr = fenceValueCPUVirtualAddressCtorArg
        internal set

    public constructor() : this(
        hDevice = 0u,
        priority = 0,
        hPagingQueue = 0u,
        hSyncObject = 0u,
        fenceValueCPUVirtualAddressCtorArg = MutPtr(0L),
        physicalAdapterIndex = 0u,
    )

    public operator fun component1(): UInt = this.hDevice

    public operator fun component2(): D3dddiPagingqueuePriority = this.priority

    public operator fun component3(): UInt = this.hPagingQueue

    public operator fun component4(): UInt = this.hSyncObject

    public operator fun component5(): MutPtr = this.fenceValueCPUVirtualAddress

    public operator fun component6(): UInt = this.physicalAdapterIndex

    public fun copy(hDevice: UInt = this.hDevice, priority: D3dddiPagingqueuePriority = this.priority, hPagingQueue: UInt = this.hPagingQueue, hSyncObject: UInt = this.hSyncObject, fenceValueCPUVirtualAddress: MutPtr = this.fenceValueCPUVirtualAddress, physicalAdapterIndex: UInt = this.physicalAdapterIndex): D3dkmtCreatepagingqueue = D3dkmtCreatepagingqueue(hDevice = hDevice, priority = priority, hPagingQueue = hPagingQueue, hSyncObject = hSyncObject, fenceValueCPUVirtualAddressCtorArg = fenceValueCPUVirtualAddress, physicalAdapterIndex = physicalAdapterIndex)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtCreatepagingqueue) return false
        if (this.hDevice != other.hDevice) return false
        if (this.priority != other.priority) return false
        if (this.hPagingQueue != other.hPagingQueue) return false
        if (this.hSyncObject != other.hSyncObject) return false
        if (this.fenceValueCPUVirtualAddress != other.fenceValueCPUVirtualAddress) return false
        if (this.physicalAdapterIndex != other.physicalAdapterIndex) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDevice.hashCode()
        result = 31 * result + this.priority.hashCode()
        result = 31 * result + this.hPagingQueue.hashCode()
        result = 31 * result + this.hSyncObject.hashCode()
        result = 31 * result + this.fenceValueCPUVirtualAddress.hashCode()
        result = 31 * result + this.physicalAdapterIndex.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCreatepagingqueue> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCreatepagingqueue> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): D3dkmtCreatepagingqueue =
                    D3dkmtCreatepagingqueue(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtCreatepagingqueue) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hDevice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.priority)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.hPagingQueue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.hSyncObject)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.fenceValueCPUVirtualAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.physicalAdapterIndex)
                }
            }

        public operator fun invoke(
            hDevice: UInt = 0u,
            priority: D3dddiPagingqueuePriority = 0,
            hPagingQueue: UInt = 0u,
            hSyncObject: UInt = 0u,
            fenceValueCPUVirtualAddress: MutPtr = MutPtr(0L),
            physicalAdapterIndex: UInt = 0u,
        ): D3dkmtCreatepagingqueue =
            D3dkmtCreatepagingqueue(
                hDevice = hDevice,
                priority = priority,
                hPagingQueue = hPagingQueue,
                hSyncObject = hSyncObject,
                fenceValueCPUVirtualAddressCtorArg = fenceValueCPUVirtualAddress,
                physicalAdapterIndex = physicalAdapterIndex,
            )
    }
}

public class D3dkmtCreateprotectedsession internal constructor(
    public var hDevice: UInt,
    public var hSyncObject: UInt,
    pPrivateDriverDataCtorArg: ConstPtr,
    public var privateDriverDataSize: UInt,
    pPrivateRuntimeDataCtorArg: ConstPtr,
    public var privateRuntimeDataSize: UInt,
    public var hHandle: UInt,
) {
    public var pPrivateDriverData: ConstPtr = pPrivateDriverDataCtorArg
        internal set

    public var pPrivateRuntimeData: ConstPtr = pPrivateRuntimeDataCtorArg
        internal set

    public constructor() : this(
        hDevice = 0u,
        hSyncObject = 0u,
        pPrivateDriverDataCtorArg = ConstPtr(0L),
        privateDriverDataSize = 0u,
        pPrivateRuntimeDataCtorArg = ConstPtr(0L),
        privateRuntimeDataSize = 0u,
        hHandle = 0u,
    )

    public operator fun component1(): UInt = this.hDevice

    public operator fun component2(): UInt = this.hSyncObject

    public operator fun component3(): ConstPtr = this.pPrivateDriverData

    public operator fun component4(): UInt = this.privateDriverDataSize

    public operator fun component5(): ConstPtr = this.pPrivateRuntimeData

    public operator fun component6(): UInt = this.privateRuntimeDataSize

    public operator fun component7(): UInt = this.hHandle

    public fun copy(hDevice: UInt = this.hDevice, hSyncObject: UInt = this.hSyncObject, pPrivateDriverData: ConstPtr = this.pPrivateDriverData, privateDriverDataSize: UInt = this.privateDriverDataSize, pPrivateRuntimeData: ConstPtr = this.pPrivateRuntimeData, privateRuntimeDataSize: UInt = this.privateRuntimeDataSize, hHandle: UInt = this.hHandle): D3dkmtCreateprotectedsession = D3dkmtCreateprotectedsession(hDevice = hDevice, hSyncObject = hSyncObject, pPrivateDriverDataCtorArg = pPrivateDriverData, privateDriverDataSize = privateDriverDataSize, pPrivateRuntimeDataCtorArg = pPrivateRuntimeData, privateRuntimeDataSize = privateRuntimeDataSize, hHandle = hHandle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtCreateprotectedsession) return false
        if (this.hDevice != other.hDevice) return false
        if (this.hSyncObject != other.hSyncObject) return false
        if (this.pPrivateDriverData != other.pPrivateDriverData) return false
        if (this.privateDriverDataSize != other.privateDriverDataSize) return false
        if (this.pPrivateRuntimeData != other.pPrivateRuntimeData) return false
        if (this.privateRuntimeDataSize != other.privateRuntimeDataSize) return false
        if (this.hHandle != other.hHandle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDevice.hashCode()
        result = 31 * result + this.hSyncObject.hashCode()
        result = 31 * result + this.pPrivateDriverData.hashCode()
        result = 31 * result + this.privateDriverDataSize.hashCode()
        result = 31 * result + this.pPrivateRuntimeData.hashCode()
        result = 31 * result + this.privateRuntimeDataSize.hashCode()
        result = 31 * result + this.hHandle.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCreateprotectedsession> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCreateprotectedsession> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): D3dkmtCreateprotectedsession =
                    D3dkmtCreateprotectedsession(
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtCreateprotectedsession) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hDevice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hSyncObject)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr + 8L, value.pPrivateDriverData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.privateDriverDataSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr + 24L, value.pPrivateRuntimeData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.privateRuntimeDataSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.hHandle)
                }
            }

        public operator fun invoke(
            hDevice: UInt = 0u,
            hSyncObject: UInt = 0u,
            pPrivateDriverData: ConstPtr = ConstPtr(0L),
            privateDriverDataSize: UInt = 0u,
            pPrivateRuntimeData: ConstPtr = ConstPtr(0L),
            privateRuntimeDataSize: UInt = 0u,
            hHandle: UInt = 0u,
        ): D3dkmtCreateprotectedsession =
            D3dkmtCreateprotectedsession(
                hDevice = hDevice,
                hSyncObject = hSyncObject,
                pPrivateDriverDataCtorArg = pPrivateDriverData,
                privateDriverDataSize = privateDriverDataSize,
                pPrivateRuntimeDataCtorArg = pPrivateRuntimeData,
                privateRuntimeDataSize = privateRuntimeDataSize,
                hHandle = hHandle,
            )
    }
}

public data class D3dkmtCreatestandardallocation(
    public var type: D3dkmtStandardallocationtype = 0,
    public var anonymous: D3dkmtCreatestandardallocation0 = D3dkmtCreatestandardallocation0(),
    public var flags: D3dkmtCreatestandardallocationflags = D3dkmtCreatestandardallocationflags(),
)

public data class D3dkmtCreatestandardallocation0(
    public var existingHeapData: D3dkmtStandardallocationExistingheap = D3dkmtStandardallocationExistingheap(),
)

public data class D3dkmtCreatestandardallocationflags(
    public var anonymous: D3dkmtCreatestandardallocationflags0 = D3dkmtCreatestandardallocationflags0(),
)

public data class D3dkmtCreatestandardallocationflags0(
    public var anonymous: D3dkmtCreatestandardallocationflags00 = D3dkmtCreatestandardallocationflags00(),
    public var value: UInt = 0u,
)

public data class D3dkmtCreatestandardallocationflags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCreatestandardallocationflags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCreatestandardallocationflags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtCreatestandardallocationflags00 =
                    D3dkmtCreatestandardallocationflags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtCreatestandardallocationflags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtCreatesyncfile(
    public var hDevice: UInt = 0u,
    public var hMonitoredFence: UInt = 0u,
    public var fenceValue: ULong = 0uL,
    public var hSyncFile: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCreatesyncfile> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCreatesyncfile> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): D3dkmtCreatesyncfile =
                    D3dkmtCreatesyncfile(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtCreatesyncfile) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hDevice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hMonitoredFence)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.fenceValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.hSyncFile)
                }
            }
    }
}

public data class D3dkmtCreatesynchronizationobject(
    public var hDevice: UInt = 0u,
    public var info: D3dddiSynchronizationobjectinfo = D3dddiSynchronizationobjectinfo(),
    public var hSyncObject: UInt = 0u,
)

public data class D3dkmtCreatesynchronizationobject2(
    public var hDevice: UInt = 0u,
    public var info: D3dddiSynchronizationobjectinfo2 = D3dddiSynchronizationobjectinfo2(),
    public var hSyncObject: UInt = 0u,
)

public class D3dkmtCreateDoorbell internal constructor(
    public var hHwQueue: UInt,
    public var hRingBuffer: UInt,
    public var hRingBufferControl: UInt,
    public var flags: D3dkmtCreateDoorbellFlags,
    public var privateDriverDataSize: UInt,
    privateDriverDataCtorArg: MutPtr,
    doorbellCPUVirtualAddressCtorArg: MutPtr,
    doorbellSecondaryCPUVirtualAddressCtorArg: MutPtr,
    doorbellStatusCPUVirtualAddressCtorArg: MutPtr,
) {
    public var privateDriverData: MutPtr = privateDriverDataCtorArg
        internal set

    public var doorbellCPUVirtualAddress: MutPtr = doorbellCPUVirtualAddressCtorArg
        internal set

    public var doorbellSecondaryCPUVirtualAddress: MutPtr = doorbellSecondaryCPUVirtualAddressCtorArg
        internal set

    public var doorbellStatusCPUVirtualAddress: MutPtr = doorbellStatusCPUVirtualAddressCtorArg
        internal set

    public constructor() : this(
        hHwQueue = 0u,
        hRingBuffer = 0u,
        hRingBufferControl = 0u,
        flags = D3dkmtCreateDoorbellFlags(),
        privateDriverDataSize = 0u,
        privateDriverDataCtorArg = MutPtr(0L),
        doorbellCPUVirtualAddressCtorArg = MutPtr(0L),
        doorbellSecondaryCPUVirtualAddressCtorArg = MutPtr(0L),
        doorbellStatusCPUVirtualAddressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.hHwQueue

    public operator fun component2(): UInt = this.hRingBuffer

    public operator fun component3(): UInt = this.hRingBufferControl

    public operator fun component4(): D3dkmtCreateDoorbellFlags = this.flags

    public operator fun component5(): UInt = this.privateDriverDataSize

    public operator fun component6(): MutPtr = this.privateDriverData

    public operator fun component7(): MutPtr = this.doorbellCPUVirtualAddress

    public operator fun component8(): MutPtr = this.doorbellSecondaryCPUVirtualAddress

    public operator fun component9(): MutPtr = this.doorbellStatusCPUVirtualAddress

    public fun copy(hHwQueue: UInt = this.hHwQueue, hRingBuffer: UInt = this.hRingBuffer, hRingBufferControl: UInt = this.hRingBufferControl, flags: D3dkmtCreateDoorbellFlags = this.flags, privateDriverDataSize: UInt = this.privateDriverDataSize, privateDriverData: MutPtr = this.privateDriverData, doorbellCPUVirtualAddress: MutPtr = this.doorbellCPUVirtualAddress, doorbellSecondaryCPUVirtualAddress: MutPtr = this.doorbellSecondaryCPUVirtualAddress, doorbellStatusCPUVirtualAddress: MutPtr = this.doorbellStatusCPUVirtualAddress): D3dkmtCreateDoorbell = D3dkmtCreateDoorbell(hHwQueue = hHwQueue, hRingBuffer = hRingBuffer, hRingBufferControl = hRingBufferControl, flags = flags, privateDriverDataSize = privateDriverDataSize, privateDriverDataCtorArg = privateDriverData, doorbellCPUVirtualAddressCtorArg = doorbellCPUVirtualAddress, doorbellSecondaryCPUVirtualAddressCtorArg = doorbellSecondaryCPUVirtualAddress, doorbellStatusCPUVirtualAddressCtorArg = doorbellStatusCPUVirtualAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtCreateDoorbell) return false
        if (this.hHwQueue != other.hHwQueue) return false
        if (this.hRingBuffer != other.hRingBuffer) return false
        if (this.hRingBufferControl != other.hRingBufferControl) return false
        if (this.flags != other.flags) return false
        if (this.privateDriverDataSize != other.privateDriverDataSize) return false
        if (this.privateDriverData != other.privateDriverData) return false
        if (this.doorbellCPUVirtualAddress != other.doorbellCPUVirtualAddress) return false
        if (this.doorbellSecondaryCPUVirtualAddress != other.doorbellSecondaryCPUVirtualAddress) return false
        if (this.doorbellStatusCPUVirtualAddress != other.doorbellStatusCPUVirtualAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hHwQueue.hashCode()
        result = 31 * result + this.hRingBuffer.hashCode()
        result = 31 * result + this.hRingBufferControl.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.privateDriverDataSize.hashCode()
        result = 31 * result + this.privateDriverData.hashCode()
        result = 31 * result + this.doorbellCPUVirtualAddress.hashCode()
        result = 31 * result + this.doorbellSecondaryCPUVirtualAddress.hashCode()
        result = 31 * result + this.doorbellStatusCPUVirtualAddress.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hHwQueue: UInt = 0u,
            hRingBuffer: UInt = 0u,
            hRingBufferControl: UInt = 0u,
            flags: D3dkmtCreateDoorbellFlags = D3dkmtCreateDoorbellFlags(),
            privateDriverDataSize: UInt = 0u,
            privateDriverData: MutPtr = MutPtr(0L),
            doorbellCPUVirtualAddress: MutPtr = MutPtr(0L),
            doorbellSecondaryCPUVirtualAddress: MutPtr = MutPtr(0L),
            doorbellStatusCPUVirtualAddress: MutPtr = MutPtr(0L),
        ): D3dkmtCreateDoorbell =
            D3dkmtCreateDoorbell(
                hHwQueue = hHwQueue,
                hRingBuffer = hRingBuffer,
                hRingBufferControl = hRingBufferControl,
                flags = flags,
                privateDriverDataSize = privateDriverDataSize,
                privateDriverDataCtorArg = privateDriverData,
                doorbellCPUVirtualAddressCtorArg = doorbellCPUVirtualAddress,
                doorbellSecondaryCPUVirtualAddressCtorArg = doorbellSecondaryCPUVirtualAddress,
                doorbellStatusCPUVirtualAddressCtorArg = doorbellStatusCPUVirtualAddress,
            )
    }
}

public data class D3dkmtCreateDoorbellFlags(
    public var anonymous: D3dkmtCreateDoorbellFlags0 = D3dkmtCreateDoorbellFlags0(),
)

public data class D3dkmtCreateDoorbellFlags0(
    public var anonymous: D3dkmtCreateDoorbellFlags00 = D3dkmtCreateDoorbellFlags00(),
    public var value: UInt = 0u,
)

public data class D3dkmtCreateDoorbellFlags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCreateDoorbellFlags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCreateDoorbellFlags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtCreateDoorbellFlags00 =
                    D3dkmtCreateDoorbellFlags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtCreateDoorbellFlags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtCreateOutputdupl(
    public var hAdapter: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var keyedMutexCount: UInt = 0u,
    public var requiredKeyedMutexCount: UInt = 0u,
    public var keyedMutexs: List<D3dkmtOutputduplKeyedmutex> = List(3) { D3dkmtOutputduplKeyedmutex() },
    public var flags: D3dkmtOutputduplcreationflags = D3dkmtOutputduplcreationflags(),
)

public data class D3dkmtCrossadapterresourceSupport(
    public var supportTier: D3dkmtCrossadapterresourceSupportTier = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCrossadapterresourceSupport> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCrossadapterresourceSupport> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtCrossadapterresourceSupport =
                    D3dkmtCrossadapterresourceSupport(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtCrossadapterresourceSupport) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.supportTier)
                }
            }
    }
}

public data class D3dkmtCurrentdisplaymode(
    public var vidPnSourceId: UInt = 0u,
    public var displayMode: D3dkmtDisplaymode = D3dkmtDisplaymode(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCurrentdisplaymode> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtCurrentdisplaymode> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): D3dkmtCurrentdisplaymode =
                    D3dkmtCurrentdisplaymode(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (D3dkmtDisplaymode.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtCurrentdisplaymode) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.vidPnSourceId)
                    (D3dkmtDisplaymode.typeLayout()).writeNative(addr + 4L, value.displayMode)
                }
            }
    }
}

public data class D3dkmtDebugSnapshotEscape(
    public var length: UInt = 0u,
    public var buffer: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtDebugSnapshotEscape) return false
        if (this.length != other.length) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.buffer.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDebugSnapshotEscape> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDebugSnapshotEscape> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtDebugSnapshotEscape =
                    D3dkmtDebugSnapshotEscape(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: D3dkmtDebugSnapshotEscape) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.buffer.toList())
                }
            }
    }
}

public class D3dkmtDestroyallocation internal constructor(
    public var hDevice: UInt,
    public var hResource: UInt,
    phAllocationListCtorArg: ConstPtr,
    public var allocationCount: UInt,
) {
    public var phAllocationList: ConstPtr = phAllocationListCtorArg
        internal set

    public constructor() : this(
        hDevice = 0u,
        hResource = 0u,
        phAllocationListCtorArg = ConstPtr(0L),
        allocationCount = 0u,
    )

    public operator fun component1(): UInt = this.hDevice

    public operator fun component2(): UInt = this.hResource

    public operator fun component3(): ConstPtr = this.phAllocationList

    public operator fun component4(): UInt = this.allocationCount

    public fun copy(hDevice: UInt = this.hDevice, hResource: UInt = this.hResource, phAllocationList: ConstPtr = this.phAllocationList, allocationCount: UInt = this.allocationCount): D3dkmtDestroyallocation = D3dkmtDestroyallocation(hDevice = hDevice, hResource = hResource, phAllocationListCtorArg = phAllocationList, allocationCount = allocationCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtDestroyallocation) return false
        if (this.hDevice != other.hDevice) return false
        if (this.hResource != other.hResource) return false
        if (this.phAllocationList != other.phAllocationList) return false
        if (this.allocationCount != other.allocationCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDevice.hashCode()
        result = 31 * result + this.hResource.hashCode()
        result = 31 * result + this.phAllocationList.hashCode()
        result = 31 * result + this.allocationCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDestroyallocation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDestroyallocation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): D3dkmtDestroyallocation =
                    D3dkmtDestroyallocation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtDestroyallocation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hDevice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hResource)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr + 8L, value.phAllocationList)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.allocationCount)
                }
            }

        public operator fun invoke(
            hDevice: UInt = 0u,
            hResource: UInt = 0u,
            phAllocationList: ConstPtr = ConstPtr(0L),
            allocationCount: UInt = 0u,
        ): D3dkmtDestroyallocation =
            D3dkmtDestroyallocation(
                hDevice = hDevice,
                hResource = hResource,
                phAllocationListCtorArg = phAllocationList,
                allocationCount = allocationCount,
            )
    }
}

public class D3dkmtDestroyallocation2 internal constructor(
    public var hDevice: UInt,
    public var hResource: UInt,
    phAllocationListCtorArg: ConstPtr,
    public var allocationCount: UInt,
    public var flags: D3dddicbDestroyallocation2flags,
) {
    public var phAllocationList: ConstPtr = phAllocationListCtorArg
        internal set

    public constructor() : this(
        hDevice = 0u,
        hResource = 0u,
        phAllocationListCtorArg = ConstPtr(0L),
        allocationCount = 0u,
        flags = D3dddicbDestroyallocation2flags(),
    )

    public operator fun component1(): UInt = this.hDevice

    public operator fun component2(): UInt = this.hResource

    public operator fun component3(): ConstPtr = this.phAllocationList

    public operator fun component4(): UInt = this.allocationCount

    public operator fun component5(): D3dddicbDestroyallocation2flags = this.flags

    public fun copy(hDevice: UInt = this.hDevice, hResource: UInt = this.hResource, phAllocationList: ConstPtr = this.phAllocationList, allocationCount: UInt = this.allocationCount, flags: D3dddicbDestroyallocation2flags = this.flags): D3dkmtDestroyallocation2 = D3dkmtDestroyallocation2(hDevice = hDevice, hResource = hResource, phAllocationListCtorArg = phAllocationList, allocationCount = allocationCount, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtDestroyallocation2) return false
        if (this.hDevice != other.hDevice) return false
        if (this.hResource != other.hResource) return false
        if (this.phAllocationList != other.phAllocationList) return false
        if (this.allocationCount != other.allocationCount) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDevice.hashCode()
        result = 31 * result + this.hResource.hashCode()
        result = 31 * result + this.phAllocationList.hashCode()
        result = 31 * result + this.allocationCount.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hDevice: UInt = 0u,
            hResource: UInt = 0u,
            phAllocationList: ConstPtr = ConstPtr(0L),
            allocationCount: UInt = 0u,
            flags: D3dddicbDestroyallocation2flags = D3dddicbDestroyallocation2flags(),
        ): D3dkmtDestroyallocation2 =
            D3dkmtDestroyallocation2(
                hDevice = hDevice,
                hResource = hResource,
                phAllocationListCtorArg = phAllocationList,
                allocationCount = allocationCount,
                flags = flags,
            )
    }
}

public data class D3dkmtDestroycontext(
    public var hContext: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDestroycontext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDestroycontext> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtDestroycontext =
                    D3dkmtDestroycontext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtDestroycontext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hContext)
                }
            }
    }
}

public class D3dkmtDestroydcfrommemory internal constructor(
    hDcCtorArg: Hdc,
    hBitmapCtorArg: Handle,
) {
    public var hDc: Hdc = hDcCtorArg
        internal set

    public var hBitmap: Handle = hBitmapCtorArg
        internal set

    public constructor() : this(
        hDcCtorArg = MutPtr(0L),
        hBitmapCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Hdc = this.hDc

    public operator fun component2(): Handle = this.hBitmap

    public fun copy(hDc: Hdc = this.hDc, hBitmap: Handle = this.hBitmap): D3dkmtDestroydcfrommemory = D3dkmtDestroydcfrommemory(hDcCtorArg = hDc, hBitmapCtorArg = hBitmap)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtDestroydcfrommemory) return false
        if (this.hDc != other.hDc) return false
        if (this.hBitmap != other.hBitmap) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDc.hashCode()
        result = 31 * result + this.hBitmap.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hDc: Hdc = MutPtr(0L),
            hBitmap: Handle = MutPtr(0L),
        ): D3dkmtDestroydcfrommemory =
            D3dkmtDestroydcfrommemory(
                hDcCtorArg = hDc,
                hBitmapCtorArg = hBitmap,
            )
    }
}

public data class D3dkmtDestroydevice(
    public var hDevice: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDestroydevice> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDestroydevice> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtDestroydevice =
                    D3dkmtDestroydevice(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtDestroydevice) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hDevice)
                }
            }
    }
}

public data class D3dkmtDestroyhwcontext(
    public var hHwContext: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDestroyhwcontext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDestroyhwcontext> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtDestroyhwcontext =
                    D3dkmtDestroyhwcontext(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtDestroyhwcontext) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hHwContext)
                }
            }
    }
}

public data class D3dkmtDestroyhwqueue(
    public var hHwQueue: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDestroyhwqueue> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDestroyhwqueue> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtDestroyhwqueue =
                    D3dkmtDestroyhwqueue(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtDestroyhwqueue) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hHwQueue)
                }
            }
    }
}

public data class D3dkmtDestroykeyedmutex(
    public var hKeyedMutex: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDestroykeyedmutex> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDestroykeyedmutex> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtDestroykeyedmutex =
                    D3dkmtDestroykeyedmutex(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtDestroykeyedmutex) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hKeyedMutex)
                }
            }
    }
}

public data class D3dkmtDestroyoverlay(
    public var hDevice: UInt = 0u,
    public var hOverlay: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDestroyoverlay> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDestroyoverlay> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtDestroyoverlay =
                    D3dkmtDestroyoverlay(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtDestroyoverlay) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hDevice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hOverlay)
                }
            }
    }
}

public data class D3dkmtDestroyprotectedsession(
    public var hHandle: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDestroyprotectedsession> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDestroyprotectedsession> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtDestroyprotectedsession =
                    D3dkmtDestroyprotectedsession(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtDestroyprotectedsession) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hHandle)
                }
            }
    }
}

public data class D3dkmtDestroysynchronizationobject(
    public var hSyncObject: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDestroysynchronizationobject> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDestroysynchronizationobject> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtDestroysynchronizationobject =
                    D3dkmtDestroysynchronizationobject(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtDestroysynchronizationobject) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hSyncObject)
                }
            }
    }
}

public data class D3dkmtDestroyDoorbell(
    public var hHwQueue: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDestroyDoorbell> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDestroyDoorbell> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtDestroyDoorbell =
                    D3dkmtDestroyDoorbell(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtDestroyDoorbell) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hHwQueue)
                }
            }
    }
}

public data class D3dkmtDestroyOutputdupl(
    public var hAdapter: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var bDestroyAllContexts: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDestroyOutputdupl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDestroyOutputdupl> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): D3dkmtDestroyOutputdupl =
                    D3dkmtDestroyOutputdupl(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtDestroyOutputdupl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAdapter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vidPnSourceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.bDestroyAllContexts)
                }
            }
    }
}

public data class D3dkmtDevicepagefaultState(
    public var faultedPrimitiveAPISequenceNumber: ULong = 0uL,
    public var faultedPipelineStage: DxgkRenderPipelineStage = 0,
    public var faultedBindTableEntry: UInt = 0u,
    public var pageFaultFlags: DxgkPageFaultFlags = 0,
    public var faultErrorCode: DxgkFaultErrorCode = DxgkFaultErrorCode(),
    public var faultedVirtualAddress: ULong = 0uL,
)

public data class D3dkmtDevicepresentQueueState(
    public var vidPnSourceId: UInt = 0u,
    public var bQueuedPresentLimitReached: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDevicepresentQueueState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDevicepresentQueueState> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtDevicepresentQueueState =
                    D3dkmtDevicepresentQueueState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtDevicepresentQueueState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.vidPnSourceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.bQueuedPresentLimitReached)
                }
            }
    }
}

public data class D3dkmtDevicepresentState(
    public var vidPnSourceId: UInt = 0u,
    public var presentStats: D3dkmtPresentStats = D3dkmtPresentStats(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDevicepresentState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDevicepresentState> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): D3dkmtDevicepresentState =
                    D3dkmtDevicepresentState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (D3dkmtPresentStats.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtDevicepresentState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.vidPnSourceId)
                    (D3dkmtPresentStats.typeLayout()).writeNative(addr + 8L, value.presentStats)
                }
            }
    }
}

public data class D3dkmtDevicepresentStateDwm(
    public var vidPnSourceId: UInt = 0u,
    public var presentStatsDWM: D3dkmtPresentStatsDwm = D3dkmtPresentStatsDwm(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDevicepresentStateDwm> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDevicepresentStateDwm> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): D3dkmtDevicepresentStateDwm =
                    D3dkmtDevicepresentStateDwm(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (D3dkmtPresentStatsDwm.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtDevicepresentStateDwm) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.vidPnSourceId)
                    (D3dkmtPresentStatsDwm.typeLayout()).writeNative(addr + 8L, value.presentStatsDWM)
                }
            }
    }
}

public data class D3dkmtDeviceresetState(
    public var anonymous: D3dkmtDeviceresetState0 = D3dkmtDeviceresetState0(),
)

public data class D3dkmtDeviceresetState0(
    public var anonymous: D3dkmtDeviceresetState00 = D3dkmtDeviceresetState00(),
    public var value: UInt = 0u,
)

public data class D3dkmtDeviceresetState00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDeviceresetState00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDeviceresetState00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtDeviceresetState00 =
                    D3dkmtDeviceresetState00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtDeviceresetState00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtDeviceEscape(
    public var type: D3dkmtDeviceescapeType = 0,
    public var anonymous: D3dkmtDeviceEscape0 = D3dkmtDeviceEscape0(),
)

public data class D3dkmtDeviceEscape0(
    public var vidPnFromAllocation: D3dkmtDeviceEscape00 = D3dkmtDeviceEscape00(),
)

public data class D3dkmtDeviceEscape00(
    public var hPrimaryAllocation: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDeviceEscape00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDeviceEscape00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtDeviceEscape00 =
                    D3dkmtDeviceEscape00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtDeviceEscape00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hPrimaryAllocation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vidPnSourceId)
                }
            }
    }
}

public data class D3dkmtDeviceIds(
    public var vendorID: UInt = 0u,
    public var deviceID: UInt = 0u,
    public var subVendorID: UInt = 0u,
    public var subSystemID: UInt = 0u,
    public var revisionID: UInt = 0u,
    public var busType: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDeviceIds> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDeviceIds> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): D3dkmtDeviceIds =
                    D3dkmtDeviceIds(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtDeviceIds) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.vendorID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.deviceID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.subVendorID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.subSystemID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.revisionID)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.busType)
                }
            }
    }
}

public data class D3dkmtDirectflipSupport(
    public var supported: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDirectflipSupport> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDirectflipSupport> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtDirectflipSupport =
                    D3dkmtDirectflipSupport(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtDirectflipSupport) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.supported)
                }
            }
    }
}

public data class D3dkmtDirtyregions(
    public var numRects: UInt = 0u,
    public var rects: List<Rect> = List(16) { Rect() },
)

public data class D3dkmtDisplaymode(
    public var width: UInt = 0u,
    public var height: UInt = 0u,
    public var format: D3dddiformat = 0u,
    public var integerRefreshRate: UInt = 0u,
    public var refreshRate: D3dddiRational = D3dddiRational(),
    public var scanLineOrdering: D3dddiVideoSignalScanlineOrdering = 0,
    public var displayOrientation: D3dddiRotation = 0,
    public var displayFixedOutput: UInt = 0u,
    public var flags: D3dkmdtDisplaymodeFlags = D3dkmdtDisplaymodeFlags(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDisplaymode> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDisplaymode> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 44L
                override fun readNative(addr: Long): D3dkmtDisplaymode =
                    D3dkmtDisplaymode(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (D3dddiRational.typeLayout()).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (D3dkmdtDisplaymodeFlags.typeLayout()).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtDisplaymode) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.width)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.height)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.format)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.integerRefreshRate)
                    (D3dddiRational.typeLayout()).writeNative(addr + 16L, value.refreshRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.scanLineOrdering)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.displayOrientation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.displayFixedOutput)
                    (D3dkmdtDisplaymodeFlags.typeLayout()).writeNative(addr + 36L, value.flags)
                }
            }
    }
}

public data class D3dkmtDisplaymodelist(
    public var vidPnSourceId: UInt = 0u,
    public var modeCount: UInt = 0u,
    public var pModeList: List<D3dkmtDisplaymode> = List(1) { D3dkmtDisplaymode() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDisplaymodelist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDisplaymodelist> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 52L
                override fun readNative(addr: Long): D3dkmtDisplaymodelist =
                    D3dkmtDisplaymodelist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(D3dkmtDisplaymode.typeLayout(), (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtDisplaymodelist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.vidPnSourceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.modeCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(D3dkmtDisplaymode.typeLayout(), (1).toInt())
                    ).writeNative(addr + 8L, value.pModeList)
                }
            }
    }
}

public data class D3dkmtDisplayCaps(
    public var anonymous: D3dkmtDisplayCaps0 = D3dkmtDisplayCaps0(),
)

public data class D3dkmtDisplayCaps0(
    public var anonymous: D3dkmtDisplayCaps00 = D3dkmtDisplayCaps00(),
    public var value: ULong = 0uL,
)

public data class D3dkmtDisplayCaps00(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDisplayCaps00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDisplayCaps00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtDisplayCaps00 =
                    D3dkmtDisplayCaps00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtDisplayCaps00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtDisplayUmdFilenameinfo(
    public var version: KmtDisplayUmdVersion = 0,
    public var umdFileName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtDisplayUmdFilenameinfo) return false
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
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDisplayUmdFilenameinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDisplayUmdFilenameinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 524L
                override fun readNative(addr: Long): D3dkmtDisplayUmdFilenameinfo =
                    D3dkmtDisplayUmdFilenameinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: D3dkmtDisplayUmdFilenameinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.version)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 4L, value.umdFileName.toList())
                }
            }
    }
}

public data class D3dkmtDlistDriverName(
    public var dListFileName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtDlistDriverName) return false
        if (!this.dListFileName.contentEquals(other.dListFileName)) return false
        return true
    }

    override fun hashCode(): Int = this.dListFileName.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDlistDriverName> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDlistDriverName> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 520L
                override fun readNative(addr: Long): D3dkmtDlistDriverName =
                    D3dkmtDlistDriverName(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: D3dkmtDlistDriverName) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr, value.dListFileName.toList())
                }
            }
    }
}

public data class D3dkmtDmmEscape(
    public var type: D3dkmtDmmescapetype = 0,
    public var providedBufferSize: Int = 0,
    public var minRequiredBufferSize: Int = 0,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtDmmEscape) return false
        if (this.type != other.type) return false
        if (this.providedBufferSize != other.providedBufferSize) return false
        if (this.minRequiredBufferSize != other.minRequiredBufferSize) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.providedBufferSize.hashCode()
        result = 31 * result + this.minRequiredBufferSize.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDmmEscape> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDmmEscape> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): D3dkmtDmmEscape =
                    D3dkmtDmmEscape(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 24L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: D3dkmtDmmEscape) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.providedBufferSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.minRequiredBufferSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 24L, value.data.toList())
                }
            }
    }
}

public data class D3dkmtDodSetDirtyrectMode(
    public var bForceFullScreenDirty: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDodSetDirtyrectMode> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDodSetDirtyrectMode> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtDodSetDirtyrectMode =
                    D3dkmtDodSetDirtyrectMode(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtDodSetDirtyrectMode) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.bForceFullScreenDirty)
                }
            }
    }
}

public data class D3dkmtDrivercapsExt(
    public var anonymous: D3dkmtDrivercapsExt0 = D3dkmtDrivercapsExt0(),
)

public data class D3dkmtDrivercapsExt0(
    public var anonymous: D3dkmtDrivercapsExt00 = D3dkmtDrivercapsExt00(),
    public var value: UInt = 0u,
)

public data class D3dkmtDrivercapsExt00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDrivercapsExt00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDrivercapsExt00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtDrivercapsExt00 =
                    D3dkmtDrivercapsExt00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtDrivercapsExt00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtDriverDescription(
    public var driverDescription: UShortArray = UShortArray(4096),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtDriverDescription) return false
        if (!this.driverDescription.contentEquals(other.driverDescription)) return false
        return true
    }

    override fun hashCode(): Int = this.driverDescription.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDriverDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtDriverDescription> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8192L
                override fun readNative(addr: Long): D3dkmtDriverDescription =
                    D3dkmtDriverDescription(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (4096).toInt())
                        ).readNative(addr).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: D3dkmtDriverDescription) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (4096).toInt())
                    ).writeNative(addr, value.driverDescription.toList())
                }
            }
    }
}

public data class D3dkmtEnumadapters(
    public var numAdapters: UInt = 0u,
    public var adapters: List<D3dkmtAdapterinfo> = List(16) { D3dkmtAdapterinfo() },
)

public class D3dkmtEnumadapters2 internal constructor(
    public var numAdapters: UInt,
    pAdaptersCtorArg: MutPtr,
) {
    public var pAdapters: MutPtr = pAdaptersCtorArg
        internal set

    public constructor() : this(
        numAdapters = 0u,
        pAdaptersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numAdapters

    public operator fun component2(): MutPtr = this.pAdapters

    public fun copy(numAdapters: UInt = this.numAdapters, pAdapters: MutPtr = this.pAdapters): D3dkmtEnumadapters2 = D3dkmtEnumadapters2(numAdapters = numAdapters, pAdaptersCtorArg = pAdapters)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtEnumadapters2) return false
        if (this.numAdapters != other.numAdapters) return false
        if (this.pAdapters != other.pAdapters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numAdapters.hashCode()
        result = 31 * result + this.pAdapters.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtEnumadapters2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtEnumadapters2> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): D3dkmtEnumadapters2 =
                    D3dkmtEnumadapters2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtEnumadapters2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numAdapters)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pAdapters)
                }
            }

        public operator fun invoke(
            numAdapters: UInt = 0u,
            pAdapters: MutPtr = MutPtr(0L),
        ): D3dkmtEnumadapters2 =
            D3dkmtEnumadapters2(
                numAdapters = numAdapters,
                pAdaptersCtorArg = pAdapters,
            )
    }
}

public class D3dkmtEnumadapters3 internal constructor(
    public var filter: D3dkmtEnumadaptersFilter,
    public var numAdapters: UInt,
    pAdaptersCtorArg: MutPtr,
) {
    public var pAdapters: MutPtr = pAdaptersCtorArg
        internal set

    public constructor() : this(
        filter = D3dkmtEnumadaptersFilter(),
        numAdapters = 0u,
        pAdaptersCtorArg = MutPtr(0L),
    )

    public operator fun component1(): D3dkmtEnumadaptersFilter = this.filter

    public operator fun component2(): UInt = this.numAdapters

    public operator fun component3(): MutPtr = this.pAdapters

    public fun copy(filter: D3dkmtEnumadaptersFilter = this.filter, numAdapters: UInt = this.numAdapters, pAdapters: MutPtr = this.pAdapters): D3dkmtEnumadapters3 = D3dkmtEnumadapters3(filter = filter, numAdapters = numAdapters, pAdaptersCtorArg = pAdapters)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtEnumadapters3) return false
        if (this.filter != other.filter) return false
        if (this.numAdapters != other.numAdapters) return false
        if (this.pAdapters != other.pAdapters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.filter.hashCode()
        result = 31 * result + this.numAdapters.hashCode()
        result = 31 * result + this.pAdapters.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            filter: D3dkmtEnumadaptersFilter = D3dkmtEnumadaptersFilter(),
            numAdapters: UInt = 0u,
            pAdapters: MutPtr = MutPtr(0L),
        ): D3dkmtEnumadapters3 =
            D3dkmtEnumadapters3(
                filter = filter,
                numAdapters = numAdapters,
                pAdaptersCtorArg = pAdapters,
            )
    }
}

public data class D3dkmtEnumadaptersFilter(
    public var anonymous: D3dkmtEnumadaptersFilter0 = D3dkmtEnumadaptersFilter0(),
    public var value: ULong = 0uL,
)

public data class D3dkmtEnumadaptersFilter0(
    public var bitfield: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtEnumadaptersFilter0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtEnumadaptersFilter0> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtEnumadaptersFilter0 =
                    D3dkmtEnumadaptersFilter0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtEnumadaptersFilter0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class D3dkmtEscape internal constructor(
    public var hAdapter: UInt,
    public var hDevice: UInt,
    public var type: D3dkmtEscapetype,
    public var flags: D3dddiEscapeflags,
    pPrivateDriverDataCtorArg: MutPtr,
    public var privateDriverDataSize: UInt,
    public var hContext: UInt,
) {
    public var pPrivateDriverData: MutPtr = pPrivateDriverDataCtorArg
        internal set

    public constructor() : this(
        hAdapter = 0u,
        hDevice = 0u,
        type = 0,
        flags = D3dddiEscapeflags(),
        pPrivateDriverDataCtorArg = MutPtr(0L),
        privateDriverDataSize = 0u,
        hContext = 0u,
    )

    public operator fun component1(): UInt = this.hAdapter

    public operator fun component2(): UInt = this.hDevice

    public operator fun component3(): D3dkmtEscapetype = this.type

    public operator fun component4(): D3dddiEscapeflags = this.flags

    public operator fun component5(): MutPtr = this.pPrivateDriverData

    public operator fun component6(): UInt = this.privateDriverDataSize

    public operator fun component7(): UInt = this.hContext

    public fun copy(hAdapter: UInt = this.hAdapter, hDevice: UInt = this.hDevice, type: D3dkmtEscapetype = this.type, flags: D3dddiEscapeflags = this.flags, pPrivateDriverData: MutPtr = this.pPrivateDriverData, privateDriverDataSize: UInt = this.privateDriverDataSize, hContext: UInt = this.hContext): D3dkmtEscape = D3dkmtEscape(hAdapter = hAdapter, hDevice = hDevice, type = type, flags = flags, pPrivateDriverDataCtorArg = pPrivateDriverData, privateDriverDataSize = privateDriverDataSize, hContext = hContext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtEscape) return false
        if (this.hAdapter != other.hAdapter) return false
        if (this.hDevice != other.hDevice) return false
        if (this.type != other.type) return false
        if (this.flags != other.flags) return false
        if (this.pPrivateDriverData != other.pPrivateDriverData) return false
        if (this.privateDriverDataSize != other.privateDriverDataSize) return false
        if (this.hContext != other.hContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hAdapter.hashCode()
        result = 31 * result + this.hDevice.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.pPrivateDriverData.hashCode()
        result = 31 * result + this.privateDriverDataSize.hashCode()
        result = 31 * result + this.hContext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hAdapter: UInt = 0u,
            hDevice: UInt = 0u,
            type: D3dkmtEscapetype = 0,
            flags: D3dddiEscapeflags = D3dddiEscapeflags(),
            pPrivateDriverData: MutPtr = MutPtr(0L),
            privateDriverDataSize: UInt = 0u,
            hContext: UInt = 0u,
        ): D3dkmtEscape =
            D3dkmtEscape(
                hAdapter = hAdapter,
                hDevice = hDevice,
                type = type,
                flags = flags,
                pPrivateDriverDataCtorArg = pPrivateDriverData,
                privateDriverDataSize = privateDriverDataSize,
                hContext = hContext,
            )
    }
}

public data class D3dkmtEscapeVirtualRefreshRate(
    public var type: D3dkmtEscapeVirtualRefreshRateType = 0,
    public var vidPnSourceId: UInt = 0u,
    public var processBoostEligible: Boolean = false,
    public var vSyncMultiplier: UInt = 0u,
    public var baseDesktopDuration: UInt = 0u,
    public var reserved: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtEscapeVirtualRefreshRate) return false
        if (this.type != other.type) return false
        if (this.vidPnSourceId != other.vidPnSourceId) return false
        if (this.processBoostEligible != other.processBoostEligible) return false
        if (this.vSyncMultiplier != other.vSyncMultiplier) return false
        if (this.baseDesktopDuration != other.baseDesktopDuration) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.vidPnSourceId.hashCode()
        result = 31 * result + this.processBoostEligible.hashCode()
        result = 31 * result + this.vSyncMultiplier.hashCode()
        result = 31 * result + this.baseDesktopDuration.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtEscapeVirtualRefreshRate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtEscapeVirtualRefreshRate> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): D3dkmtEscapeVirtualRefreshRate =
                    D3dkmtEscapeVirtualRefreshRate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 20L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: D3dkmtEscapeVirtualRefreshRate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.type)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vidPnSourceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.processBoostEligible)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.vSyncMultiplier)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.baseDesktopDuration)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 20L, value.reserved.toList())
                }
            }
    }
}

public class D3dkmtEvict internal constructor(
    public var hDevice: UInt,
    public var numAllocations: UInt,
    allocationListCtorArg: ConstPtr,
    public var flags: D3dddiEvictFlags,
    public var numBytesToTrim: ULong,
) {
    public var allocationList: ConstPtr = allocationListCtorArg
        internal set

    public constructor() : this(
        hDevice = 0u,
        numAllocations = 0u,
        allocationListCtorArg = ConstPtr(0L),
        flags = D3dddiEvictFlags(),
        numBytesToTrim = 0uL,
    )

    public operator fun component1(): UInt = this.hDevice

    public operator fun component2(): UInt = this.numAllocations

    public operator fun component3(): ConstPtr = this.allocationList

    public operator fun component4(): D3dddiEvictFlags = this.flags

    public operator fun component5(): ULong = this.numBytesToTrim

    public fun copy(hDevice: UInt = this.hDevice, numAllocations: UInt = this.numAllocations, allocationList: ConstPtr = this.allocationList, flags: D3dddiEvictFlags = this.flags, numBytesToTrim: ULong = this.numBytesToTrim): D3dkmtEvict = D3dkmtEvict(hDevice = hDevice, numAllocations = numAllocations, allocationListCtorArg = allocationList, flags = flags, numBytesToTrim = numBytesToTrim)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtEvict) return false
        if (this.hDevice != other.hDevice) return false
        if (this.numAllocations != other.numAllocations) return false
        if (this.allocationList != other.allocationList) return false
        if (this.flags != other.flags) return false
        if (this.numBytesToTrim != other.numBytesToTrim) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDevice.hashCode()
        result = 31 * result + this.numAllocations.hashCode()
        result = 31 * result + this.allocationList.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.numBytesToTrim.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hDevice: UInt = 0u,
            numAllocations: UInt = 0u,
            allocationList: ConstPtr = ConstPtr(0L),
            flags: D3dddiEvictFlags = D3dddiEvictFlags(),
            numBytesToTrim: ULong = 0uL,
        ): D3dkmtEvict =
            D3dkmtEvict(
                hDevice = hDevice,
                numAllocations = numAllocations,
                allocationListCtorArg = allocationList,
                flags = flags,
                numBytesToTrim = numBytesToTrim,
            )
    }
}

public data class D3dkmtEvictionCriteria(
    public var minimumSize: ULong = 0uL,
    public var maximumSize: ULong = 0uL,
    public var anonymous: D3dkmtEvictionCriteria0 = D3dkmtEvictionCriteria0(),
)

public data class D3dkmtEvictionCriteria0(
    public var anonymous: D3dkmtEvictionCriteria00 = D3dkmtEvictionCriteria00(),
)

public data class D3dkmtEvictionCriteria00(
    public var flags: D3dkmtEvictionCriteria000 = D3dkmtEvictionCriteria000(),
    public var value: UInt = 0u,
)

public data class D3dkmtEvictionCriteria000(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtEvictionCriteria000> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtEvictionCriteria000> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtEvictionCriteria000 =
                    D3dkmtEvictionCriteria000(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtEvictionCriteria000) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtFencePresenthistorytoken(
    public var key: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtFencePresenthistorytoken> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtFencePresenthistorytoken> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtFencePresenthistorytoken =
                    D3dkmtFencePresenthistorytoken(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtFencePresenthistorytoken) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.key)
                }
            }
    }
}

public data class D3dkmtFlipinfoflags(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtFlipinfoflags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtFlipinfoflags> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtFlipinfoflags =
                    D3dkmtFlipinfoflags(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtFlipinfoflags) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtFlipmanagerAuxiliarypresentinfo(
    public var auxiliaryPresentInfo: D3dkmtAuxiliarypresentinfo = D3dkmtAuxiliarypresentinfo(),
    public var flipManagerTracingId: UInt = 0u,
    public var customDurationChanged: Bool = 0,
    public var flipAdapterLuid: Luid = Luid(),
    public var vidPnSourceId: UInt = 0u,
    public var independentFlipStage: D3dkmtFlipmodelIndependentFlipStage = 0,
    public var flipCompletedQpc: ULong = 0uL,
    public var hwPresentDurationQpc: UInt = 0u,
    public var wasCanceled: Bool = 0,
    public var convertedToNonIFlip: Bool = 0,
)

public data class D3dkmtFlipmanagerPresenthistorytoken(
    public var hPrivateData: ULong = 0uL,
    public var presentAtQpc: ULong = 0uL,
    public var flags: D3dkmtFlipmanagerPresenthistorytoken0 = D3dkmtFlipmanagerPresenthistorytoken0(),
)

public data class D3dkmtFlipmanagerPresenthistorytoken0(
    public var anonymous: D3dkmtFlipmanagerPresenthistorytoken00 = D3dkmtFlipmanagerPresenthistorytoken00(),
    public var value: UInt = 0u,
)

public data class D3dkmtFlipmanagerPresenthistorytoken00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtFlipmanagerPresenthistorytoken00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtFlipmanagerPresenthistorytoken00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtFlipmanagerPresenthistorytoken00 =
                    D3dkmtFlipmanagerPresenthistorytoken00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtFlipmanagerPresenthistorytoken00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class D3dkmtFlipmodelPresenthistorytoken(
    public var fenceValue: ULong = 0uL,
    public var hLogicalSurface: ULong = 0uL,
    public var dxgContext: Int = 0,
    public var vidPnSourceId: UInt = 0u,
    public var swapChainIndex: UInt = 0u,
    public var presentLimitSemaphoreId: ULong = 0uL,
    public var flipInterval: D3dddiFlipintervalType = 0,
    public var flags: D3dkmtFlipmodelPresenthistorytokenflags = D3dkmtFlipmodelPresenthistorytokenflags(),
    public var hCompSurf: Long = 0L,
    public var compSurfLuid: Luid = Luid(),
    public var confirmationCookie: ULong = 0uL,
    public var compositionSyncKey: ULong = 0uL,
    public var remainingTokens: UInt = 0u,
    public var scrollRect: Rect = Rect(),
    public var scrollOffset: Point = Point(),
    public var presentCount: UInt = 0u,
    public var revealColor: FloatArray = FloatArray(4),
    public var rotation: D3dddiRotation = 0,
    public var anonymous: D3dkmtFlipmodelPresenthistorytoken0 = D3dkmtFlipmodelPresenthistorytoken0(),
    public var inkCookie: UInt = 0u,
    public var sourceRect: Rect = Rect(),
    public var destWidth: UInt = 0u,
    public var destHeight: UInt = 0u,
    public var targetRect: Rect = Rect(),
    public var transform: FloatArray = FloatArray(6),
    public var customDuration: UInt = 0u,
    public var customDurationFlipInterval: D3dddiFlipintervalType = 0,
    public var planeIndex: UInt = 0u,
    public var colorSpace: D3dddiColorSpaceType = 0,
    public var dirtyRegions: D3dkmtDirtyregions = D3dkmtDirtyregions(),
)

public data class D3dkmtFlipmodelPresenthistorytoken0(
    public var scatterBlts: D3dkmtScatterblts = D3dkmtScatterblts(),
    public var anonymous: D3dkmtFlipmodelPresenthistorytoken00 = D3dkmtFlipmodelPresenthistorytoken00(),
)

public class D3dkmtFlipmodelPresenthistorytoken00 internal constructor(
    hSyncObjectCtorArg: Handle,
    public var hDRMetaDataType: D3dddiHdrMetadataType,
    public var anonymous: D3dkmtFlipmodelPresenthistorytoken000,
) {
    public var hSyncObject: Handle = hSyncObjectCtorArg
        internal set

    public constructor() : this(
        hSyncObjectCtorArg = MutPtr(0L),
        hDRMetaDataType = 0,
        anonymous = D3dkmtFlipmodelPresenthistorytoken000(),
    )

    public operator fun component1(): Handle = this.hSyncObject

    public operator fun component2(): D3dddiHdrMetadataType = this.hDRMetaDataType

    public operator fun component3(): D3dkmtFlipmodelPresenthistorytoken000 = this.anonymous

    public fun copy(hSyncObject: Handle = this.hSyncObject, hDRMetaDataType: D3dddiHdrMetadataType = this.hDRMetaDataType, anonymous: D3dkmtFlipmodelPresenthistorytoken000 = this.anonymous): D3dkmtFlipmodelPresenthistorytoken00 = D3dkmtFlipmodelPresenthistorytoken00(hSyncObjectCtorArg = hSyncObject, hDRMetaDataType = hDRMetaDataType, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtFlipmodelPresenthistorytoken00) return false
        if (this.hSyncObject != other.hSyncObject) return false
        if (this.hDRMetaDataType != other.hDRMetaDataType) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hSyncObject.hashCode()
        result = 31 * result + this.hDRMetaDataType.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hSyncObject: Handle = MutPtr(0L),
            hDRMetaDataType: D3dddiHdrMetadataType = 0,
            anonymous: D3dkmtFlipmodelPresenthistorytoken000 = D3dkmtFlipmodelPresenthistorytoken000(),
        ): D3dkmtFlipmodelPresenthistorytoken00 =
            D3dkmtFlipmodelPresenthistorytoken00(
                hSyncObjectCtorArg = hSyncObject,
                hDRMetaDataType = hDRMetaDataType,
                anonymous = anonymous,
            )
    }
}

public data class D3dkmtFlipmodelPresenthistorytoken000(
    public var hDRMetaDataHDR10: D3dddiHdrMetadataHdr10 = D3dddiHdrMetadataHdr10(),
    public var hDRMetaDataHDR10Plus: D3dddiHdrMetadataHdr10plus = D3dddiHdrMetadataHdr10plus(),
)

public data class D3dkmtFlipmodelPresenthistorytokenflags(
    public var anonymous: D3dkmtFlipmodelPresenthistorytokenflags0 = D3dkmtFlipmodelPresenthistorytokenflags0(),
)

public data class D3dkmtFlipmodelPresenthistorytokenflags0(
    public var anonymous: D3dkmtFlipmodelPresenthistorytokenflags00 = D3dkmtFlipmodelPresenthistorytokenflags00(),
    public var value: UInt = 0u,
)

public data class D3dkmtFlipmodelPresenthistorytokenflags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtFlipmodelPresenthistorytokenflags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtFlipmodelPresenthistorytokenflags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtFlipmodelPresenthistorytokenflags00 =
                    D3dkmtFlipmodelPresenthistorytokenflags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtFlipmodelPresenthistorytokenflags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class D3dkmtFlipoverlay internal constructor(
    public var hDevice: UInt,
    public var hOverlay: UInt,
    public var hSource: UInt,
    pPrivateDriverDataCtorArg: MutPtr,
    public var privateDriverDataSize: UInt,
) {
    public var pPrivateDriverData: MutPtr = pPrivateDriverDataCtorArg
        internal set

    public constructor() : this(
        hDevice = 0u,
        hOverlay = 0u,
        hSource = 0u,
        pPrivateDriverDataCtorArg = MutPtr(0L),
        privateDriverDataSize = 0u,
    )

    public operator fun component1(): UInt = this.hDevice

    public operator fun component2(): UInt = this.hOverlay

    public operator fun component3(): UInt = this.hSource

    public operator fun component4(): MutPtr = this.pPrivateDriverData

    public operator fun component5(): UInt = this.privateDriverDataSize

    public fun copy(hDevice: UInt = this.hDevice, hOverlay: UInt = this.hOverlay, hSource: UInt = this.hSource, pPrivateDriverData: MutPtr = this.pPrivateDriverData, privateDriverDataSize: UInt = this.privateDriverDataSize): D3dkmtFlipoverlay = D3dkmtFlipoverlay(hDevice = hDevice, hOverlay = hOverlay, hSource = hSource, pPrivateDriverDataCtorArg = pPrivateDriverData, privateDriverDataSize = privateDriverDataSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtFlipoverlay) return false
        if (this.hDevice != other.hDevice) return false
        if (this.hOverlay != other.hOverlay) return false
        if (this.hSource != other.hSource) return false
        if (this.pPrivateDriverData != other.pPrivateDriverData) return false
        if (this.privateDriverDataSize != other.privateDriverDataSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDevice.hashCode()
        result = 31 * result + this.hOverlay.hashCode()
        result = 31 * result + this.hSource.hashCode()
        result = 31 * result + this.pPrivateDriverData.hashCode()
        result = 31 * result + this.privateDriverDataSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtFlipoverlay> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtFlipoverlay> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): D3dkmtFlipoverlay =
                    D3dkmtFlipoverlay(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtFlipoverlay) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hDevice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hOverlay)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.hSource)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pPrivateDriverData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.privateDriverDataSize)
                }
            }

        public operator fun invoke(
            hDevice: UInt = 0u,
            hOverlay: UInt = 0u,
            hSource: UInt = 0u,
            pPrivateDriverData: MutPtr = MutPtr(0L),
            privateDriverDataSize: UInt = 0u,
        ): D3dkmtFlipoverlay =
            D3dkmtFlipoverlay(
                hDevice = hDevice,
                hOverlay = hOverlay,
                hSource = hSource,
                pPrivateDriverDataCtorArg = pPrivateDriverData,
                privateDriverDataSize = privateDriverDataSize,
            )
    }
}

public data class D3dkmtFlipqueueinfo(
    public var maxHardwareFlipQueueLength: UInt = 0u,
    public var maxSoftwareFlipQueueLength: UInt = 0u,
    public var flipFlags: D3dkmtFlipinfoflags = D3dkmtFlipinfoflags(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtFlipqueueinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtFlipqueueinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): D3dkmtFlipqueueinfo =
                    D3dkmtFlipqueueinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (D3dkmtFlipinfoflags.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtFlipqueueinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.maxHardwareFlipQueueLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxSoftwareFlipQueueLength)
                    (D3dkmtFlipinfoflags.typeLayout()).writeNative(addr + 8L, value.flipFlags)
                }
            }
    }
}

public data class D3dkmtFlushheaptransitions(
    public var hAdapter: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtFlushheaptransitions> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtFlushheaptransitions> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtFlushheaptransitions =
                    D3dkmtFlushheaptransitions(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtFlushheaptransitions) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAdapter)
                }
            }
    }
}

public data class D3dkmtFreegpuvirtualaddress(
    public var hAdapter: UInt = 0u,
    public var baseAddress: ULong = 0uL,
    public var size: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtFreegpuvirtualaddress> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtFreegpuvirtualaddress> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): D3dkmtFreegpuvirtualaddress =
                    D3dkmtFreegpuvirtualaddress(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtFreegpuvirtualaddress) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAdapter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.baseAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.size)
                }
            }
    }
}

public data class D3dkmtGdimodelPresenthistorytoken(
    public var hLogicalSurface: ULong = 0uL,
    public var hPhysicalSurface: ULong = 0uL,
    public var scrollRect: Rect = Rect(),
    public var scrollOffset: Point = Point(),
    public var dirtyRegions: D3dkmtDirtyregions = D3dkmtDirtyregions(),
)

public data class D3dkmtGdimodelSysmemPresenthistorytoken(
    public var hlsurf: ULong = 0uL,
    public var dwDirtyFlags: UInt = 0u,
    public var uiCookie: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGdimodelSysmemPresenthistorytoken> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGdimodelSysmemPresenthistorytoken> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): D3dkmtGdimodelSysmemPresenthistorytoken =
                    D3dkmtGdimodelSysmemPresenthistorytoken(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtGdimodelSysmemPresenthistorytoken) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.hlsurf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwDirtyFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.uiCookie)
                }
            }
    }
}

public class D3dkmtGetallocationpriority internal constructor(
    public var hDevice: UInt,
    public var hResource: UInt,
    phAllocationListCtorArg: ConstPtr,
    public var allocationCount: UInt,
    pPrioritiesCtorArg: MutPtr,
) {
    public var phAllocationList: ConstPtr = phAllocationListCtorArg
        internal set

    public var pPriorities: MutPtr = pPrioritiesCtorArg
        internal set

    public constructor() : this(
        hDevice = 0u,
        hResource = 0u,
        phAllocationListCtorArg = ConstPtr(0L),
        allocationCount = 0u,
        pPrioritiesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.hDevice

    public operator fun component2(): UInt = this.hResource

    public operator fun component3(): ConstPtr = this.phAllocationList

    public operator fun component4(): UInt = this.allocationCount

    public operator fun component5(): MutPtr = this.pPriorities

    public fun copy(hDevice: UInt = this.hDevice, hResource: UInt = this.hResource, phAllocationList: ConstPtr = this.phAllocationList, allocationCount: UInt = this.allocationCount, pPriorities: MutPtr = this.pPriorities): D3dkmtGetallocationpriority = D3dkmtGetallocationpriority(hDevice = hDevice, hResource = hResource, phAllocationListCtorArg = phAllocationList, allocationCount = allocationCount, pPrioritiesCtorArg = pPriorities)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtGetallocationpriority) return false
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
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGetallocationpriority> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGetallocationpriority> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): D3dkmtGetallocationpriority =
                    D3dkmtGetallocationpriority(
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
                override fun writeNative(addr: Long, value: D3dkmtGetallocationpriority) {
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
                    ).writeNative(addr + 24L, value.pPriorities)
                }
            }

        public operator fun invoke(
            hDevice: UInt = 0u,
            hResource: UInt = 0u,
            phAllocationList: ConstPtr = ConstPtr(0L),
            allocationCount: UInt = 0u,
            pPriorities: MutPtr = MutPtr(0L),
        ): D3dkmtGetallocationpriority =
            D3dkmtGetallocationpriority(
                hDevice = hDevice,
                hResource = hResource,
                phAllocationListCtorArg = phAllocationList,
                allocationCount = allocationCount,
                pPrioritiesCtorArg = pPriorities,
            )
    }
}

public data class D3dkmtGetcontextinprocessschedulingpriority(
    public var hContext: UInt = 0u,
    public var priority: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGetcontextinprocessschedulingpriority> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGetcontextinprocessschedulingpriority> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtGetcontextinprocessschedulingpriority =
                    D3dkmtGetcontextinprocessschedulingpriority(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtGetcontextinprocessschedulingpriority) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.priority)
                }
            }
    }
}

public data class D3dkmtGetcontextschedulingpriority(
    public var hContext: UInt = 0u,
    public var priority: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGetcontextschedulingpriority> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGetcontextschedulingpriority> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtGetcontextschedulingpriority =
                    D3dkmtGetcontextschedulingpriority(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtGetcontextschedulingpriority) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.priority)
                }
            }
    }
}

public data class D3dkmtGetdevicestate(
    public var hDevice: UInt = 0u,
    public var stateType: D3dkmtDevicestateType = 0,
    public var anonymous: D3dkmtGetdevicestate0 = D3dkmtGetdevicestate0(),
)

public data class D3dkmtGetdevicestate0(
    public var executionState: D3dkmtDeviceexecutionState = 0,
    public var presentState: D3dkmtDevicepresentState = D3dkmtDevicepresentState(),
    public var resetState: D3dkmtDeviceresetState = D3dkmtDeviceresetState(),
    public var presentStateDWM: D3dkmtDevicepresentStateDwm = D3dkmtDevicepresentStateDwm(),
    public var pageFaultState: D3dkmtDevicepagefaultState = D3dkmtDevicepagefaultState(),
    public var presentQueueState: D3dkmtDevicepresentQueueState = D3dkmtDevicepresentQueueState(),
)

public class D3dkmtGetdisplaymodelist internal constructor(
    public var hAdapter: UInt,
    public var vidPnSourceId: UInt,
    pModeListCtorArg: MutPtr,
    public var modeCount: UInt,
) {
    public var pModeList: MutPtr = pModeListCtorArg
        internal set

    public constructor() : this(
        hAdapter = 0u,
        vidPnSourceId = 0u,
        pModeListCtorArg = MutPtr(0L),
        modeCount = 0u,
    )

    public operator fun component1(): UInt = this.hAdapter

    public operator fun component2(): UInt = this.vidPnSourceId

    public operator fun component3(): MutPtr = this.pModeList

    public operator fun component4(): UInt = this.modeCount

    public fun copy(hAdapter: UInt = this.hAdapter, vidPnSourceId: UInt = this.vidPnSourceId, pModeList: MutPtr = this.pModeList, modeCount: UInt = this.modeCount): D3dkmtGetdisplaymodelist = D3dkmtGetdisplaymodelist(hAdapter = hAdapter, vidPnSourceId = vidPnSourceId, pModeListCtorArg = pModeList, modeCount = modeCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtGetdisplaymodelist) return false
        if (this.hAdapter != other.hAdapter) return false
        if (this.vidPnSourceId != other.vidPnSourceId) return false
        if (this.pModeList != other.pModeList) return false
        if (this.modeCount != other.modeCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hAdapter.hashCode()
        result = 31 * result + this.vidPnSourceId.hashCode()
        result = 31 * result + this.pModeList.hashCode()
        result = 31 * result + this.modeCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGetdisplaymodelist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGetdisplaymodelist> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): D3dkmtGetdisplaymodelist =
                    D3dkmtGetdisplaymodelist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtGetdisplaymodelist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAdapter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vidPnSourceId)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pModeList)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.modeCount)
                }
            }

        public operator fun invoke(
            hAdapter: UInt = 0u,
            vidPnSourceId: UInt = 0u,
            pModeList: MutPtr = MutPtr(0L),
            modeCount: UInt = 0u,
        ): D3dkmtGetdisplaymodelist =
            D3dkmtGetdisplaymodelist(
                hAdapter = hAdapter,
                vidPnSourceId = vidPnSourceId,
                pModeListCtorArg = pModeList,
                modeCount = modeCount,
            )
    }
}

public class D3dkmtGetmultisamplemethodlist internal constructor(
    public var hAdapter: UInt,
    public var vidPnSourceId: UInt,
    public var width: UInt,
    public var height: UInt,
    public var format: D3dddiformat,
    pMethodListCtorArg: MutPtr,
    public var methodCount: UInt,
) {
    public var pMethodList: MutPtr = pMethodListCtorArg
        internal set

    public constructor() : this(
        hAdapter = 0u,
        vidPnSourceId = 0u,
        width = 0u,
        height = 0u,
        format = 0u,
        pMethodListCtorArg = MutPtr(0L),
        methodCount = 0u,
    )

    public operator fun component1(): UInt = this.hAdapter

    public operator fun component2(): UInt = this.vidPnSourceId

    public operator fun component3(): UInt = this.width

    public operator fun component4(): UInt = this.height

    public operator fun component5(): D3dddiformat = this.format

    public operator fun component6(): MutPtr = this.pMethodList

    public operator fun component7(): UInt = this.methodCount

    public fun copy(hAdapter: UInt = this.hAdapter, vidPnSourceId: UInt = this.vidPnSourceId, width: UInt = this.width, height: UInt = this.height, format: D3dddiformat = this.format, pMethodList: MutPtr = this.pMethodList, methodCount: UInt = this.methodCount): D3dkmtGetmultisamplemethodlist = D3dkmtGetmultisamplemethodlist(hAdapter = hAdapter, vidPnSourceId = vidPnSourceId, width = width, height = height, format = format, pMethodListCtorArg = pMethodList, methodCount = methodCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtGetmultisamplemethodlist) return false
        if (this.hAdapter != other.hAdapter) return false
        if (this.vidPnSourceId != other.vidPnSourceId) return false
        if (this.width != other.width) return false
        if (this.height != other.height) return false
        if (this.format != other.format) return false
        if (this.pMethodList != other.pMethodList) return false
        if (this.methodCount != other.methodCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hAdapter.hashCode()
        result = 31 * result + this.vidPnSourceId.hashCode()
        result = 31 * result + this.width.hashCode()
        result = 31 * result + this.height.hashCode()
        result = 31 * result + this.format.hashCode()
        result = 31 * result + this.pMethodList.hashCode()
        result = 31 * result + this.methodCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGetmultisamplemethodlist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGetmultisamplemethodlist> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): D3dkmtGetmultisamplemethodlist =
                    D3dkmtGetmultisamplemethodlist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtGetmultisamplemethodlist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAdapter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vidPnSourceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.width)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.height)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.format)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.pMethodList)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.methodCount)
                }
            }

        public operator fun invoke(
            hAdapter: UInt = 0u,
            vidPnSourceId: UInt = 0u,
            width: UInt = 0u,
            height: UInt = 0u,
            format: D3dddiformat = 0u,
            pMethodList: MutPtr = MutPtr(0L),
            methodCount: UInt = 0u,
        ): D3dkmtGetmultisamplemethodlist =
            D3dkmtGetmultisamplemethodlist(
                hAdapter = hAdapter,
                vidPnSourceId = vidPnSourceId,
                width = width,
                height = height,
                format = format,
                pMethodListCtorArg = pMethodList,
                methodCount = methodCount,
            )
    }
}

public data class D3dkmtGetoverlaystate(
    public var hDevice: UInt = 0u,
    public var hOverlay: UInt = 0u,
    public var overlayEnabled: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGetoverlaystate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGetoverlaystate> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): D3dkmtGetoverlaystate =
                    D3dkmtGetoverlaystate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtGetoverlaystate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hDevice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hOverlay)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.overlayEnabled)
                }
            }
    }
}

public class D3dkmtGetpresenthistory internal constructor(
    public var hAdapter: UInt,
    public var providedSize: UInt,
    public var writtenSize: UInt,
    pTokensCtorArg: MutPtr,
    public var numTokens: UInt,
) {
    public var pTokens: MutPtr = pTokensCtorArg
        internal set

    public constructor() : this(
        hAdapter = 0u,
        providedSize = 0u,
        writtenSize = 0u,
        pTokensCtorArg = MutPtr(0L),
        numTokens = 0u,
    )

    public operator fun component1(): UInt = this.hAdapter

    public operator fun component2(): UInt = this.providedSize

    public operator fun component3(): UInt = this.writtenSize

    public operator fun component4(): MutPtr = this.pTokens

    public operator fun component5(): UInt = this.numTokens

    public fun copy(hAdapter: UInt = this.hAdapter, providedSize: UInt = this.providedSize, writtenSize: UInt = this.writtenSize, pTokens: MutPtr = this.pTokens, numTokens: UInt = this.numTokens): D3dkmtGetpresenthistory = D3dkmtGetpresenthistory(hAdapter = hAdapter, providedSize = providedSize, writtenSize = writtenSize, pTokensCtorArg = pTokens, numTokens = numTokens)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtGetpresenthistory) return false
        if (this.hAdapter != other.hAdapter) return false
        if (this.providedSize != other.providedSize) return false
        if (this.writtenSize != other.writtenSize) return false
        if (this.pTokens != other.pTokens) return false
        if (this.numTokens != other.numTokens) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hAdapter.hashCode()
        result = 31 * result + this.providedSize.hashCode()
        result = 31 * result + this.writtenSize.hashCode()
        result = 31 * result + this.pTokens.hashCode()
        result = 31 * result + this.numTokens.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGetpresenthistory> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGetpresenthistory> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): D3dkmtGetpresenthistory =
                    D3dkmtGetpresenthistory(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtGetpresenthistory) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAdapter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.providedSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.writtenSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pTokens)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.numTokens)
                }
            }

        public operator fun invoke(
            hAdapter: UInt = 0u,
            providedSize: UInt = 0u,
            writtenSize: UInt = 0u,
            pTokens: MutPtr = MutPtr(0L),
            numTokens: UInt = 0u,
        ): D3dkmtGetpresenthistory =
            D3dkmtGetpresenthistory(
                hAdapter = hAdapter,
                providedSize = providedSize,
                writtenSize = writtenSize,
                pTokensCtorArg = pTokens,
                numTokens = numTokens,
            )
    }
}

public class D3dkmtGetprocessdeviceremovalsupport internal constructor(
    hProcessCtorArg: Handle,
    public var adapterLuid: Luid,
    public var support: Boolean,
) {
    public var hProcess: Handle = hProcessCtorArg
        internal set

    public constructor() : this(
        hProcessCtorArg = MutPtr(0L),
        adapterLuid = Luid(),
        support = false,
    )

    public operator fun component1(): Handle = this.hProcess

    public operator fun component2(): Luid = this.adapterLuid

    public operator fun component3(): Boolean = this.support

    public fun copy(hProcess: Handle = this.hProcess, adapterLuid: Luid = this.adapterLuid, support: Boolean = this.support): D3dkmtGetprocessdeviceremovalsupport = D3dkmtGetprocessdeviceremovalsupport(hProcessCtorArg = hProcess, adapterLuid = adapterLuid, support = support)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtGetprocessdeviceremovalsupport) return false
        if (this.hProcess != other.hProcess) return false
        if (this.adapterLuid != other.adapterLuid) return false
        if (this.support != other.support) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hProcess.hashCode()
        result = 31 * result + this.adapterLuid.hashCode()
        result = 31 * result + this.support.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hProcess: Handle = MutPtr(0L),
            adapterLuid: Luid = Luid(),
            support: Boolean = false,
        ): D3dkmtGetprocessdeviceremovalsupport =
            D3dkmtGetprocessdeviceremovalsupport(
                hProcessCtorArg = hProcess,
                adapterLuid = adapterLuid,
                support = support,
            )
    }
}

public class D3dkmtGetruntimedata internal constructor(
    public var hAdapter: UInt,
    public var hGlobalShare: UInt,
    pRuntimeDataCtorArg: MutPtr,
    public var runtimeDataSize: UInt,
) {
    public var pRuntimeData: MutPtr = pRuntimeDataCtorArg
        internal set

    public constructor() : this(
        hAdapter = 0u,
        hGlobalShare = 0u,
        pRuntimeDataCtorArg = MutPtr(0L),
        runtimeDataSize = 0u,
    )

    public operator fun component1(): UInt = this.hAdapter

    public operator fun component2(): UInt = this.hGlobalShare

    public operator fun component3(): MutPtr = this.pRuntimeData

    public operator fun component4(): UInt = this.runtimeDataSize

    public fun copy(hAdapter: UInt = this.hAdapter, hGlobalShare: UInt = this.hGlobalShare, pRuntimeData: MutPtr = this.pRuntimeData, runtimeDataSize: UInt = this.runtimeDataSize): D3dkmtGetruntimedata = D3dkmtGetruntimedata(hAdapter = hAdapter, hGlobalShare = hGlobalShare, pRuntimeDataCtorArg = pRuntimeData, runtimeDataSize = runtimeDataSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtGetruntimedata) return false
        if (this.hAdapter != other.hAdapter) return false
        if (this.hGlobalShare != other.hGlobalShare) return false
        if (this.pRuntimeData != other.pRuntimeData) return false
        if (this.runtimeDataSize != other.runtimeDataSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hAdapter.hashCode()
        result = 31 * result + this.hGlobalShare.hashCode()
        result = 31 * result + this.pRuntimeData.hashCode()
        result = 31 * result + this.runtimeDataSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGetruntimedata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGetruntimedata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): D3dkmtGetruntimedata =
                    D3dkmtGetruntimedata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtGetruntimedata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAdapter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hGlobalShare)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pRuntimeData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.runtimeDataSize)
                }
            }

        public operator fun invoke(
            hAdapter: UInt = 0u,
            hGlobalShare: UInt = 0u,
            pRuntimeData: MutPtr = MutPtr(0L),
            runtimeDataSize: UInt = 0u,
        ): D3dkmtGetruntimedata =
            D3dkmtGetruntimedata(
                hAdapter = hAdapter,
                hGlobalShare = hGlobalShare,
                pRuntimeDataCtorArg = pRuntimeData,
                runtimeDataSize = runtimeDataSize,
            )
    }
}

public data class D3dkmtGetscanline(
    public var hAdapter: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var inVerticalBlank: Boolean = false,
    public var scanLine: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGetscanline> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGetscanline> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): D3dkmtGetscanline =
                    D3dkmtGetscanline(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtGetscanline) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAdapter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vidPnSourceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.inVerticalBlank)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.scanLine)
                }
            }
    }
}

public data class D3dkmtGetsharedprimaryhandle(
    public var hAdapter: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var hSharedPrimary: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGetsharedprimaryhandle> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGetsharedprimaryhandle> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): D3dkmtGetsharedprimaryhandle =
                    D3dkmtGetsharedprimaryhandle(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtGetsharedprimaryhandle) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAdapter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vidPnSourceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.hSharedPrimary)
                }
            }
    }
}

public class D3dkmtGetsharedresourceadapterluid internal constructor(
    public var hGlobalShare: UInt,
    hNtHandleCtorArg: Handle,
    public var adapterLuid: Luid,
) {
    public var hNtHandle: Handle = hNtHandleCtorArg
        internal set

    public constructor() : this(
        hGlobalShare = 0u,
        hNtHandleCtorArg = MutPtr(0L),
        adapterLuid = Luid(),
    )

    public operator fun component1(): UInt = this.hGlobalShare

    public operator fun component2(): Handle = this.hNtHandle

    public operator fun component3(): Luid = this.adapterLuid

    public fun copy(hGlobalShare: UInt = this.hGlobalShare, hNtHandle: Handle = this.hNtHandle, adapterLuid: Luid = this.adapterLuid): D3dkmtGetsharedresourceadapterluid = D3dkmtGetsharedresourceadapterluid(hGlobalShare = hGlobalShare, hNtHandleCtorArg = hNtHandle, adapterLuid = adapterLuid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtGetsharedresourceadapterluid) return false
        if (this.hGlobalShare != other.hGlobalShare) return false
        if (this.hNtHandle != other.hNtHandle) return false
        if (this.adapterLuid != other.adapterLuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hGlobalShare.hashCode()
        result = 31 * result + this.hNtHandle.hashCode()
        result = 31 * result + this.adapterLuid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hGlobalShare: UInt = 0u,
            hNtHandle: Handle = MutPtr(0L),
            adapterLuid: Luid = Luid(),
        ): D3dkmtGetsharedresourceadapterluid =
            D3dkmtGetsharedresourceadapterluid(
                hGlobalShare = hGlobalShare,
                hNtHandleCtorArg = hNtHandle,
                adapterLuid = adapterLuid,
            )
    }
}

public class D3dkmtGetverticalblankevent internal constructor(
    public var hAdapter: UInt,
    public var hDevice: UInt,
    public var vidPnSourceId: UInt,
    phEventCtorArg: MutPtr,
) {
    public var phEvent: MutPtr = phEventCtorArg
        internal set

    public constructor() : this(
        hAdapter = 0u,
        hDevice = 0u,
        vidPnSourceId = 0u,
        phEventCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.hAdapter

    public operator fun component2(): UInt = this.hDevice

    public operator fun component3(): UInt = this.vidPnSourceId

    public operator fun component4(): MutPtr = this.phEvent

    public fun copy(hAdapter: UInt = this.hAdapter, hDevice: UInt = this.hDevice, vidPnSourceId: UInt = this.vidPnSourceId, phEvent: MutPtr = this.phEvent): D3dkmtGetverticalblankevent = D3dkmtGetverticalblankevent(hAdapter = hAdapter, hDevice = hDevice, vidPnSourceId = vidPnSourceId, phEventCtorArg = phEvent)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtGetverticalblankevent) return false
        if (this.hAdapter != other.hAdapter) return false
        if (this.hDevice != other.hDevice) return false
        if (this.vidPnSourceId != other.vidPnSourceId) return false
        if (this.phEvent != other.phEvent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hAdapter.hashCode()
        result = 31 * result + this.hDevice.hashCode()
        result = 31 * result + this.vidPnSourceId.hashCode()
        result = 31 * result + this.phEvent.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGetverticalblankevent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGetverticalblankevent> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): D3dkmtGetverticalblankevent =
                    D3dkmtGetverticalblankevent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtGetverticalblankevent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAdapter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hDevice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.vidPnSourceId)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.phEvent)
                }
            }

        public operator fun invoke(
            hAdapter: UInt = 0u,
            hDevice: UInt = 0u,
            vidPnSourceId: UInt = 0u,
            phEvent: MutPtr = MutPtr(0L),
        ): D3dkmtGetverticalblankevent =
            D3dkmtGetverticalblankevent(
                hAdapter = hAdapter,
                hDevice = hDevice,
                vidPnSourceId = vidPnSourceId,
                phEventCtorArg = phEvent,
            )
    }
}

public data class D3dkmtGetDeviceVidpnOwnershipInfo(
    public var hDevice: UInt = 0u,
    public var bFailedDwmAcquireVidPn: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGetDeviceVidpnOwnershipInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGetDeviceVidpnOwnershipInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtGetDeviceVidpnOwnershipInfo =
                    D3dkmtGetDeviceVidpnOwnershipInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtGetDeviceVidpnOwnershipInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hDevice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 4L, value.bFailedDwmAcquireVidPn)
                }
            }
    }
}

public data class D3dkmtGetGpummuCaps(
    public var physicalAdapterIndex: UInt = 0u,
    public var gpuMmuCaps: DxgkEscapeGpummucaps = DxgkEscapeGpummucaps(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGetGpummuCaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGetGpummuCaps> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 264L
                override fun readNative(addr: Long): D3dkmtGetGpummuCaps =
                    D3dkmtGetGpummuCaps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (DxgkEscapeGpummucaps.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtGetGpummuCaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.physicalAdapterIndex)
                    (DxgkEscapeGpummucaps.typeLayout()).writeNative(addr + 8L, value.gpuMmuCaps)
                }
            }
    }
}

public data class D3dkmtGetMultiplaneOverlayCaps(
    public var hAdapter: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var maxPlanes: UInt = 0u,
    public var maxRGBPlanes: UInt = 0u,
    public var maxYUVPlanes: UInt = 0u,
    public var overlayCaps: D3dkmtMultiplaneOverlayCaps = D3dkmtMultiplaneOverlayCaps(),
    public var maxStretchFactor: Float = 0.0f,
    public var maxShrinkFactor: Float = 0.0f,
)

public data class D3dkmtGetPostCompositionCaps(
    public var hAdapter: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var maxStretchFactor: Float = 0.0f,
    public var maxShrinkFactor: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGetPostCompositionCaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGetPostCompositionCaps> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): D3dkmtGetPostCompositionCaps =
                    D3dkmtGetPostCompositionCaps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtGetPostCompositionCaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAdapter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vidPnSourceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.maxStretchFactor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 12L, value.maxShrinkFactor)
                }
            }
    }
}

public data class D3dkmtGetPte(
    public var physicalAdapterIndex: UInt = 0u,
    public var pageTableLevel: UInt = 0u,
    public var pageTableIndex: UIntArray = UIntArray(6),
    public var b64KBPte: Boolean = false,
    public var numPtes: UInt = 0u,
    public var pte: List<DxgkPte> = List(64) { DxgkPte() },
    public var numValidEntries: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtGetPte) return false
        if (this.physicalAdapterIndex != other.physicalAdapterIndex) return false
        if (this.pageTableLevel != other.pageTableLevel) return false
        if (!this.pageTableIndex.contentEquals(other.pageTableIndex)) return false
        if (this.b64KBPte != other.b64KBPte) return false
        if (this.numPtes != other.numPtes) return false
        if (this.pte != other.pte) return false
        if (this.numValidEntries != other.numValidEntries) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.physicalAdapterIndex.hashCode()
        result = 31 * result + this.pageTableLevel.hashCode()
        result = 31 * result + this.pageTableIndex.contentHashCode()
        result = 31 * result + this.b64KBPte.hashCode()
        result = 31 * result + this.numPtes.hashCode()
        result = 31 * result + this.pte.hashCode()
        result = 31 * result + this.numValidEntries.hashCode()
        return result
    }
}

public data class D3dkmtGetSegmentCaps(
    public var physicalAdapterIndex: UInt = 0u,
    public var numSegments: UInt = 0u,
    public var segmentCaps: List<D3dkmtSegmentCaps> = List(32) { D3dkmtSegmentCaps() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGetSegmentCaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGetSegmentCaps> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 776L
                override fun readNative(addr: Long): D3dkmtGetSegmentCaps =
                    D3dkmtGetSegmentCaps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(D3dkmtSegmentCaps.typeLayout(), (32).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtGetSegmentCaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.physicalAdapterIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numSegments)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(D3dkmtSegmentCaps.typeLayout(), (32).toInt())
                    ).writeNative(addr + 8L, value.segmentCaps)
                }
            }
    }
}

public data class D3dkmtGpummuCaps(
    public var flags: D3dkmtGpummuCaps0 = D3dkmtGpummuCaps0(),
    public var virtualAddressBitCount: UInt = 0u,
)

public data class D3dkmtGpummuCaps0(
    public var anonymous: D3dkmtGpummuCaps00 = D3dkmtGpummuCaps00(),
    public var value: UInt = 0u,
)

public data class D3dkmtGpummuCaps00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGpummuCaps00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGpummuCaps00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtGpummuCaps00 =
                    D3dkmtGpummuCaps00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtGpummuCaps00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtGpuversion(
    public var physicalAdapterIndex: UInt = 0u,
    public var biosVersion: UShortArray = UShortArray(32),
    public var gpuArchitecture: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtGpuversion) return false
        if (this.physicalAdapterIndex != other.physicalAdapterIndex) return false
        if (!this.biosVersion.contentEquals(other.biosVersion)) return false
        if (!this.gpuArchitecture.contentEquals(other.gpuArchitecture)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.physicalAdapterIndex.hashCode()
        result = 31 * result + this.biosVersion.contentHashCode()
        result = 31 * result + this.gpuArchitecture.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGpuversion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtGpuversion> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 132L
                override fun readNative(addr: Long): D3dkmtGpuversion =
                    D3dkmtGpuversion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 68L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: D3dkmtGpuversion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.physicalAdapterIndex)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 4L, value.biosVersion.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 68L, value.gpuArchitecture.toList())
                }
            }
    }
}

public data class D3dkmtHistoryBufferStatus(
    public var enabled: Boolean = false,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtHistoryBufferStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtHistoryBufferStatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtHistoryBufferStatus =
                    D3dkmtHistoryBufferStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtHistoryBufferStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.enabled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.reserved)
                }
            }
    }
}

public data class D3dkmtHwdrmSupport(
    public var supported: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtHwdrmSupport> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtHwdrmSupport> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): D3dkmtHwdrmSupport =
                    D3dkmtHwdrmSupport(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtHwdrmSupport) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.supported)
                }
            }
    }
}

public data class D3dkmtHybridDlistDllSupport(
    public var supported: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtHybridDlistDllSupport> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtHybridDlistDllSupport> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtHybridDlistDllSupport =
                    D3dkmtHybridDlistDllSupport(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtHybridDlistDllSupport) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.supported)
                }
            }
    }
}

public data class D3dkmtHybridList(
    public var state: D3dkmtGpuPreferenceQueryState = 0,
    public var adapterLuid: Luid = Luid(),
    public var bUserPreferenceQuery: Bool = 0,
    public var queryType: D3dkmtGpuPreferenceQueryType = 0,
)

public data class D3dkmtIndependentflipSecondarySupport(
    public var supported: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtIndependentflipSecondarySupport> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtIndependentflipSecondarySupport> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtIndependentflipSecondarySupport =
                    D3dkmtIndependentflipSecondarySupport(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtIndependentflipSecondarySupport) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.supported)
                }
            }
    }
}

public data class D3dkmtIndependentflipSupport(
    public var supported: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtIndependentflipSupport> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtIndependentflipSupport> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtIndependentflipSupport =
                    D3dkmtIndependentflipSupport(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtIndependentflipSupport) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.supported)
                }
            }
    }
}

public class D3dkmtInvalidateactivevidpn internal constructor(
    public var hAdapter: UInt,
    pPrivateDriverDataCtorArg: MutPtr,
    public var privateDriverDataSize: UInt,
) {
    public var pPrivateDriverData: MutPtr = pPrivateDriverDataCtorArg
        internal set

    public constructor() : this(
        hAdapter = 0u,
        pPrivateDriverDataCtorArg = MutPtr(0L),
        privateDriverDataSize = 0u,
    )

    public operator fun component1(): UInt = this.hAdapter

    public operator fun component2(): MutPtr = this.pPrivateDriverData

    public operator fun component3(): UInt = this.privateDriverDataSize

    public fun copy(hAdapter: UInt = this.hAdapter, pPrivateDriverData: MutPtr = this.pPrivateDriverData, privateDriverDataSize: UInt = this.privateDriverDataSize): D3dkmtInvalidateactivevidpn = D3dkmtInvalidateactivevidpn(hAdapter = hAdapter, pPrivateDriverDataCtorArg = pPrivateDriverData, privateDriverDataSize = privateDriverDataSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtInvalidateactivevidpn) return false
        if (this.hAdapter != other.hAdapter) return false
        if (this.pPrivateDriverData != other.pPrivateDriverData) return false
        if (this.privateDriverDataSize != other.privateDriverDataSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hAdapter.hashCode()
        result = 31 * result + this.pPrivateDriverData.hashCode()
        result = 31 * result + this.privateDriverDataSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtInvalidateactivevidpn> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtInvalidateactivevidpn> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): D3dkmtInvalidateactivevidpn =
                    D3dkmtInvalidateactivevidpn(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtInvalidateactivevidpn) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hAdapter)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pPrivateDriverData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.privateDriverDataSize)
                }
            }

        public operator fun invoke(
            hAdapter: UInt = 0u,
            pPrivateDriverData: MutPtr = MutPtr(0L),
            privateDriverDataSize: UInt = 0u,
        ): D3dkmtInvalidateactivevidpn =
            D3dkmtInvalidateactivevidpn(
                hAdapter = hAdapter,
                pPrivateDriverDataCtorArg = pPrivateDriverData,
                privateDriverDataSize = privateDriverDataSize,
            )
    }
}

public data class D3dkmtInvalidatecache(
    public var hDevice: UInt = 0u,
    public var hAllocation: UInt = 0u,
    public var offset: Int = 0,
    public var length: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtInvalidatecache> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtInvalidatecache> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): D3dkmtInvalidatecache =
                    D3dkmtInvalidatecache(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtInvalidatecache) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hDevice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hAllocation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.length)
                }
            }
    }
}

public data class D3dkmtIsbaddriverforhwprotectiondisabled(
    public var disabled: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtIsbaddriverforhwprotectiondisabled> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtIsbaddriverforhwprotectiondisabled> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtIsbaddriverforhwprotectiondisabled =
                    D3dkmtIsbaddriverforhwprotectiondisabled(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtIsbaddriverforhwprotectiondisabled) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.disabled)
                }
            }
    }
}

public data class D3dkmtKmdDriverVersion(
    public var driverVersion: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtKmdDriverVersion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtKmdDriverVersion> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtKmdDriverVersion =
                    D3dkmtKmdDriverVersion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtKmdDriverVersion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.driverVersion)
                }
            }
    }
}

public class D3dkmtLock internal constructor(
    public var hDevice: UInt,
    public var hAllocation: UInt,
    public var privateDriverData: UInt,
    public var numPages: UInt,
    pPagesCtorArg: ConstPtr,
    pDataCtorArg: MutPtr,
    public var flags: D3dddicbLockflags,
    public var gpuVirtualAddress: ULong,
) {
    public var pPages: ConstPtr = pPagesCtorArg
        internal set

    public var pData: MutPtr = pDataCtorArg
        internal set

    public constructor() : this(
        hDevice = 0u,
        hAllocation = 0u,
        privateDriverData = 0u,
        numPages = 0u,
        pPagesCtorArg = ConstPtr(0L),
        pDataCtorArg = MutPtr(0L),
        flags = D3dddicbLockflags(),
        gpuVirtualAddress = 0uL,
    )

    public operator fun component1(): UInt = this.hDevice

    public operator fun component2(): UInt = this.hAllocation

    public operator fun component3(): UInt = this.privateDriverData

    public operator fun component4(): UInt = this.numPages

    public operator fun component5(): ConstPtr = this.pPages

    public operator fun component6(): MutPtr = this.pData

    public operator fun component7(): D3dddicbLockflags = this.flags

    public operator fun component8(): ULong = this.gpuVirtualAddress

    public fun copy(hDevice: UInt = this.hDevice, hAllocation: UInt = this.hAllocation, privateDriverData: UInt = this.privateDriverData, numPages: UInt = this.numPages, pPages: ConstPtr = this.pPages, pData: MutPtr = this.pData, flags: D3dddicbLockflags = this.flags, gpuVirtualAddress: ULong = this.gpuVirtualAddress): D3dkmtLock = D3dkmtLock(hDevice = hDevice, hAllocation = hAllocation, privateDriverData = privateDriverData, numPages = numPages, pPagesCtorArg = pPages, pDataCtorArg = pData, flags = flags, gpuVirtualAddress = gpuVirtualAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtLock) return false
        if (this.hDevice != other.hDevice) return false
        if (this.hAllocation != other.hAllocation) return false
        if (this.privateDriverData != other.privateDriverData) return false
        if (this.numPages != other.numPages) return false
        if (this.pPages != other.pPages) return false
        if (this.pData != other.pData) return false
        if (this.flags != other.flags) return false
        if (this.gpuVirtualAddress != other.gpuVirtualAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDevice.hashCode()
        result = 31 * result + this.hAllocation.hashCode()
        result = 31 * result + this.privateDriverData.hashCode()
        result = 31 * result + this.numPages.hashCode()
        result = 31 * result + this.pPages.hashCode()
        result = 31 * result + this.pData.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.gpuVirtualAddress.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hDevice: UInt = 0u,
            hAllocation: UInt = 0u,
            privateDriverData: UInt = 0u,
            numPages: UInt = 0u,
            pPages: ConstPtr = ConstPtr(0L),
            pData: MutPtr = MutPtr(0L),
            flags: D3dddicbLockflags = D3dddicbLockflags(),
            gpuVirtualAddress: ULong = 0uL,
        ): D3dkmtLock =
            D3dkmtLock(
                hDevice = hDevice,
                hAllocation = hAllocation,
                privateDriverData = privateDriverData,
                numPages = numPages,
                pPagesCtorArg = pPages,
                pDataCtorArg = pData,
                flags = flags,
                gpuVirtualAddress = gpuVirtualAddress,
            )
    }
}

public class D3dkmtLock2 internal constructor(
    public var hDevice: UInt,
    public var hAllocation: UInt,
    public var flags: D3dddicbLock2flags,
    pDataCtorArg: MutPtr,
) {
    public var pData: MutPtr = pDataCtorArg
        internal set

    public constructor() : this(
        hDevice = 0u,
        hAllocation = 0u,
        flags = D3dddicbLock2flags(),
        pDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.hDevice

    public operator fun component2(): UInt = this.hAllocation

    public operator fun component3(): D3dddicbLock2flags = this.flags

    public operator fun component4(): MutPtr = this.pData

    public fun copy(hDevice: UInt = this.hDevice, hAllocation: UInt = this.hAllocation, flags: D3dddicbLock2flags = this.flags, pData: MutPtr = this.pData): D3dkmtLock2 = D3dkmtLock2(hDevice = hDevice, hAllocation = hAllocation, flags = flags, pDataCtorArg = pData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtLock2) return false
        if (this.hDevice != other.hDevice) return false
        if (this.hAllocation != other.hAllocation) return false
        if (this.flags != other.flags) return false
        if (this.pData != other.pData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDevice.hashCode()
        result = 31 * result + this.hAllocation.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.pData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hDevice: UInt = 0u,
            hAllocation: UInt = 0u,
            flags: D3dddicbLock2flags = D3dddicbLock2flags(),
            pData: MutPtr = MutPtr(0L),
        ): D3dkmtLock2 =
            D3dkmtLock2(
                hDevice = hDevice,
                hAllocation = hAllocation,
                flags = flags,
                pDataCtorArg = pData,
            )
    }
}

public data class D3dkmtMarkdeviceaserror(
    public var hDevice: UInt = 0u,
    public var reason: D3dkmtDeviceErrorReason = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtMarkdeviceaserror> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtMarkdeviceaserror> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtMarkdeviceaserror =
                    D3dkmtMarkdeviceaserror(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtMarkdeviceaserror) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hDevice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.reason)
                }
            }
    }
}

public data class D3dkmtMiracastcompaniondrivername(
    public var miracastCompanionDriverName: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtMiracastcompaniondrivername) return false
        if (!this.miracastCompanionDriverName.contentEquals(other.miracastCompanionDriverName)) return false
        return true
    }

    override fun hashCode(): Int = this.miracastCompanionDriverName.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtMiracastcompaniondrivername> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtMiracastcompaniondrivername> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 520L
                override fun readNative(addr: Long): D3dkmtMiracastcompaniondrivername =
                    D3dkmtMiracastcompaniondrivername(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: D3dkmtMiracastcompaniondrivername) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr, value.miracastCompanionDriverName.toList())
                }
            }
    }
}

public data class D3dkmtMiracastChunkData(
    public var chunkInfo: DxgkMiracastChunkInfo = DxgkMiracastChunkInfo(),
    public var privateDriverDataSize: UInt = 0u,
    public var privateDriverData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtMiracastChunkData) return false
        if (this.chunkInfo != other.chunkInfo) return false
        if (this.privateDriverDataSize != other.privateDriverDataSize) return false
        if (!this.privateDriverData.contentEquals(other.privateDriverData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.chunkInfo.hashCode()
        result = 31 * result + this.privateDriverDataSize.hashCode()
        result = 31 * result + this.privateDriverData.contentHashCode()
        return result
    }
}

public data class D3dkmtMiracastDisplayDeviceCaps(
    public var hdcpSupported: Boolean = false,
    public var defaultControlPort: UInt = 0u,
    public var usesIhvSolution: Boolean = false,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtMiracastDisplayDeviceCaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtMiracastDisplayDeviceCaps> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): D3dkmtMiracastDisplayDeviceCaps =
                    D3dkmtMiracastDisplayDeviceCaps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtMiracastDisplayDeviceCaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.hdcpSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.defaultControlPort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 8L, value.usesIhvSolution)
                }
            }
    }
}

public data class D3dkmtMiracastDisplayDeviceStatus(
    public var state: D3dkmtMiracastDisplayDeviceState = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtMiracastDisplayDeviceStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtMiracastDisplayDeviceStatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtMiracastDisplayDeviceStatus =
                    D3dkmtMiracastDisplayDeviceStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtMiracastDisplayDeviceStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.state)
                }
            }
    }
}

public data class D3dkmtMiracastDisplayStopSessions(
    public var adapterLuid: Luid = Luid(),
    public var targetId: UInt = 0u,
    public var stopReason: UInt = 0u,
)

public data class D3dkmtMoveRect(
    public var sourcePoint: Point = Point(),
    public var destRect: Rect = Rect(),
)

public data class D3dkmtMpo3ddiSupport(
    public var supported: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtMpo3ddiSupport> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtMpo3ddiSupport> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtMpo3ddiSupport =
                    D3dkmtMpo3ddiSupport(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtMpo3ddiSupport) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.supported)
                }
            }
    }
}

public data class D3dkmtMpokernelcapsSupport(
    public var supported: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtMpokernelcapsSupport> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtMpokernelcapsSupport> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtMpokernelcapsSupport =
                    D3dkmtMpokernelcapsSupport(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtMpokernelcapsSupport) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.supported)
                }
            }
    }
}

public data class D3dkmtMultiplaneoverlayDecodeSupport(
    public var supported: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtMultiplaneoverlayDecodeSupport> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtMultiplaneoverlayDecodeSupport> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtMultiplaneoverlayDecodeSupport =
                    D3dkmtMultiplaneoverlayDecodeSupport(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtMultiplaneoverlayDecodeSupport) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.supported)
                }
            }
    }
}

public data class D3dkmtMultiplaneoverlayHudSupport(
    public var vidPnSourceId: UInt = 0u,
    public var update: Bool = 0,
    public var kernelSupported: Bool = 0,
    public var hudSupported: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtMultiplaneoverlayHudSupport> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtMultiplaneoverlayHudSupport> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): D3dkmtMultiplaneoverlayHudSupport =
                    D3dkmtMultiplaneoverlayHudSupport(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtMultiplaneoverlayHudSupport) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.vidPnSourceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.update)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.kernelSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.hudSupported)
                }
            }
    }
}

public data class D3dkmtMultiplaneoverlaySecondarySupport(
    public var supported: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtMultiplaneoverlaySecondarySupport> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtMultiplaneoverlaySecondarySupport> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtMultiplaneoverlaySecondarySupport =
                    D3dkmtMultiplaneoverlaySecondarySupport(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtMultiplaneoverlaySecondarySupport) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.supported)
                }
            }
    }
}

public data class D3dkmtMultiplaneoverlayStretchSupport(
    public var vidPnSourceId: UInt = 0u,
    public var update: Bool = 0,
    public var supported: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtMultiplaneoverlayStretchSupport> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtMultiplaneoverlayStretchSupport> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): D3dkmtMultiplaneoverlayStretchSupport =
                    D3dkmtMultiplaneoverlayStretchSupport(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtMultiplaneoverlayStretchSupport) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.vidPnSourceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.update)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.supported)
                }
            }
    }
}

public data class D3dkmtMultiplaneoverlaySupport(
    public var supported: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtMultiplaneoverlaySupport> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtMultiplaneoverlaySupport> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtMultiplaneoverlaySupport =
                    D3dkmtMultiplaneoverlaySupport(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtMultiplaneoverlaySupport) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.supported)
                }
            }
    }
}

public data class D3dkmtMultiplaneOverlay(
    public var layerIndex: UInt = 0u,
    public var enabled: Bool = 0,
    public var hAllocation: UInt = 0u,
    public var planeAttributes: D3dkmtMultiplaneOverlayAttributes = D3dkmtMultiplaneOverlayAttributes(),
)

public data class D3dkmtMultiplaneOverlay2(
    public var layerIndex: UInt = 0u,
    public var enabled: Bool = 0,
    public var hAllocation: UInt = 0u,
    public var planeAttributes: D3dkmtMultiplaneOverlayAttributes2 = D3dkmtMultiplaneOverlayAttributes2(),
)

public class D3dkmtMultiplaneOverlay3 internal constructor(
    public var layerIndex: UInt,
    public var inputFlags: D3dkmtPlaneSpecificInputFlags,
    public var flipInterval: D3dddiFlipintervalType,
    public var maxImmediateFlipLine: UInt,
    public var allocationCount: UInt,
    pAllocationListCtorArg: MutPtr,
    public var driverPrivateDataSize: UInt,
    pDriverPrivateDataCtorArg: MutPtr,
    pPlaneAttributesCtorArg: ConstPtr,
    public var hFlipToFence: UInt,
    public var hFlipAwayFence: UInt,
    public var flipToFenceValue: ULong,
    public var flipAwayFenceValue: ULong,
) {
    public var pAllocationList: MutPtr = pAllocationListCtorArg
        internal set

    public var pDriverPrivateData: MutPtr = pDriverPrivateDataCtorArg
        internal set

    public var pPlaneAttributes: ConstPtr = pPlaneAttributesCtorArg
        internal set

    public constructor() : this(
        layerIndex = 0u,
        inputFlags = D3dkmtPlaneSpecificInputFlags(),
        flipInterval = 0,
        maxImmediateFlipLine = 0u,
        allocationCount = 0u,
        pAllocationListCtorArg = MutPtr(0L),
        driverPrivateDataSize = 0u,
        pDriverPrivateDataCtorArg = MutPtr(0L),
        pPlaneAttributesCtorArg = ConstPtr(0L),
        hFlipToFence = 0u,
        hFlipAwayFence = 0u,
        flipToFenceValue = 0uL,
        flipAwayFenceValue = 0uL,
    )

    public operator fun component1(): UInt = this.layerIndex

    public operator fun component2(): D3dkmtPlaneSpecificInputFlags = this.inputFlags

    public operator fun component3(): D3dddiFlipintervalType = this.flipInterval

    public operator fun component4(): UInt = this.maxImmediateFlipLine

    public operator fun component5(): UInt = this.allocationCount

    public operator fun component6(): MutPtr = this.pAllocationList

    public operator fun component7(): UInt = this.driverPrivateDataSize

    public operator fun component8(): MutPtr = this.pDriverPrivateData

    public operator fun component9(): ConstPtr = this.pPlaneAttributes

    public operator fun component10(): UInt = this.hFlipToFence

    public operator fun component11(): UInt = this.hFlipAwayFence

    public operator fun component12(): ULong = this.flipToFenceValue

    public operator fun component13(): ULong = this.flipAwayFenceValue

    public fun copy(layerIndex: UInt = this.layerIndex, inputFlags: D3dkmtPlaneSpecificInputFlags = this.inputFlags, flipInterval: D3dddiFlipintervalType = this.flipInterval, maxImmediateFlipLine: UInt = this.maxImmediateFlipLine, allocationCount: UInt = this.allocationCount, pAllocationList: MutPtr = this.pAllocationList, driverPrivateDataSize: UInt = this.driverPrivateDataSize, pDriverPrivateData: MutPtr = this.pDriverPrivateData, pPlaneAttributes: ConstPtr = this.pPlaneAttributes, hFlipToFence: UInt = this.hFlipToFence, hFlipAwayFence: UInt = this.hFlipAwayFence, flipToFenceValue: ULong = this.flipToFenceValue, flipAwayFenceValue: ULong = this.flipAwayFenceValue): D3dkmtMultiplaneOverlay3 = D3dkmtMultiplaneOverlay3(layerIndex = layerIndex, inputFlags = inputFlags, flipInterval = flipInterval, maxImmediateFlipLine = maxImmediateFlipLine, allocationCount = allocationCount, pAllocationListCtorArg = pAllocationList, driverPrivateDataSize = driverPrivateDataSize, pDriverPrivateDataCtorArg = pDriverPrivateData, pPlaneAttributesCtorArg = pPlaneAttributes, hFlipToFence = hFlipToFence, hFlipAwayFence = hFlipAwayFence, flipToFenceValue = flipToFenceValue, flipAwayFenceValue = flipAwayFenceValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtMultiplaneOverlay3) return false
        if (this.layerIndex != other.layerIndex) return false
        if (this.inputFlags != other.inputFlags) return false
        if (this.flipInterval != other.flipInterval) return false
        if (this.maxImmediateFlipLine != other.maxImmediateFlipLine) return false
        if (this.allocationCount != other.allocationCount) return false
        if (this.pAllocationList != other.pAllocationList) return false
        if (this.driverPrivateDataSize != other.driverPrivateDataSize) return false
        if (this.pDriverPrivateData != other.pDriverPrivateData) return false
        if (this.pPlaneAttributes != other.pPlaneAttributes) return false
        if (this.hFlipToFence != other.hFlipToFence) return false
        if (this.hFlipAwayFence != other.hFlipAwayFence) return false
        if (this.flipToFenceValue != other.flipToFenceValue) return false
        if (this.flipAwayFenceValue != other.flipAwayFenceValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.layerIndex.hashCode()
        result = 31 * result + this.inputFlags.hashCode()
        result = 31 * result + this.flipInterval.hashCode()
        result = 31 * result + this.maxImmediateFlipLine.hashCode()
        result = 31 * result + this.allocationCount.hashCode()
        result = 31 * result + this.pAllocationList.hashCode()
        result = 31 * result + this.driverPrivateDataSize.hashCode()
        result = 31 * result + this.pDriverPrivateData.hashCode()
        result = 31 * result + this.pPlaneAttributes.hashCode()
        result = 31 * result + this.hFlipToFence.hashCode()
        result = 31 * result + this.hFlipAwayFence.hashCode()
        result = 31 * result + this.flipToFenceValue.hashCode()
        result = 31 * result + this.flipAwayFenceValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            layerIndex: UInt = 0u,
            inputFlags: D3dkmtPlaneSpecificInputFlags = D3dkmtPlaneSpecificInputFlags(),
            flipInterval: D3dddiFlipintervalType = 0,
            maxImmediateFlipLine: UInt = 0u,
            allocationCount: UInt = 0u,
            pAllocationList: MutPtr = MutPtr(0L),
            driverPrivateDataSize: UInt = 0u,
            pDriverPrivateData: MutPtr = MutPtr(0L),
            pPlaneAttributes: ConstPtr = ConstPtr(0L),
            hFlipToFence: UInt = 0u,
            hFlipAwayFence: UInt = 0u,
            flipToFenceValue: ULong = 0uL,
            flipAwayFenceValue: ULong = 0uL,
        ): D3dkmtMultiplaneOverlay3 =
            D3dkmtMultiplaneOverlay3(
                layerIndex = layerIndex,
                inputFlags = inputFlags,
                flipInterval = flipInterval,
                maxImmediateFlipLine = maxImmediateFlipLine,
                allocationCount = allocationCount,
                pAllocationListCtorArg = pAllocationList,
                driverPrivateDataSize = driverPrivateDataSize,
                pDriverPrivateDataCtorArg = pDriverPrivateData,
                pPlaneAttributesCtorArg = pPlaneAttributes,
                hFlipToFence = hFlipToFence,
                hFlipAwayFence = hFlipAwayFence,
                flipToFenceValue = flipToFenceValue,
                flipAwayFenceValue = flipAwayFenceValue,
            )
    }
}

public class D3dkmtMultiplaneOverlayAttributes internal constructor(
    public var flags: UInt,
    public var srcRect: Rect,
    public var dstRect: Rect,
    public var clipRect: Rect,
    public var rotation: D3dddiRotation,
    public var blend: D3dkmtMultiplaneOverlayBlend,
    public var dirtyRectCount: UInt,
    pDirtyRectsCtorArg: MutPtr,
    public var videoFrameFormat: D3dkmtMultiplaneOverlayVideoFrameFormat,
    public var yCbCrFlags: UInt,
    public var stereoFormat: D3dkmtMultiplaneOverlayStereoFormat,
    public var stereoLeftViewFrame0: Bool,
    public var stereoBaseViewFrame0: Bool,
    public var stereoFlipMode: DxgkmtMultiplaneOverlayStereoFlipMode,
    public var stretchQuality: DxgkmtMultiplaneOverlayStretchQuality,
) {
    public var pDirtyRects: MutPtr = pDirtyRectsCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        srcRect = Rect(),
        dstRect = Rect(),
        clipRect = Rect(),
        rotation = 0,
        blend = 0,
        dirtyRectCount = 0u,
        pDirtyRectsCtorArg = MutPtr(0L),
        videoFrameFormat = 0,
        yCbCrFlags = 0u,
        stereoFormat = 0,
        stereoLeftViewFrame0 = 0,
        stereoBaseViewFrame0 = 0,
        stereoFlipMode = 0,
        stretchQuality = 0,
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): Rect = this.srcRect

    public operator fun component3(): Rect = this.dstRect

    public operator fun component4(): Rect = this.clipRect

    public operator fun component5(): D3dddiRotation = this.rotation

    public operator fun component6(): D3dkmtMultiplaneOverlayBlend = this.blend

    public operator fun component7(): UInt = this.dirtyRectCount

    public operator fun component8(): MutPtr = this.pDirtyRects

    public operator fun component9(): D3dkmtMultiplaneOverlayVideoFrameFormat = this.videoFrameFormat

    public operator fun component10(): UInt = this.yCbCrFlags

    public operator fun component11(): D3dkmtMultiplaneOverlayStereoFormat = this.stereoFormat

    public operator fun component12(): Bool = this.stereoLeftViewFrame0

    public operator fun component13(): Bool = this.stereoBaseViewFrame0

    public operator fun component14(): DxgkmtMultiplaneOverlayStereoFlipMode = this.stereoFlipMode

    public operator fun component15(): DxgkmtMultiplaneOverlayStretchQuality = this.stretchQuality

    public fun copy(flags: UInt = this.flags, srcRect: Rect = this.srcRect, dstRect: Rect = this.dstRect, clipRect: Rect = this.clipRect, rotation: D3dddiRotation = this.rotation, blend: D3dkmtMultiplaneOverlayBlend = this.blend, dirtyRectCount: UInt = this.dirtyRectCount, pDirtyRects: MutPtr = this.pDirtyRects, videoFrameFormat: D3dkmtMultiplaneOverlayVideoFrameFormat = this.videoFrameFormat, yCbCrFlags: UInt = this.yCbCrFlags, stereoFormat: D3dkmtMultiplaneOverlayStereoFormat = this.stereoFormat, stereoLeftViewFrame0: Bool = this.stereoLeftViewFrame0, stereoBaseViewFrame0: Bool = this.stereoBaseViewFrame0, stereoFlipMode: DxgkmtMultiplaneOverlayStereoFlipMode = this.stereoFlipMode, stretchQuality: DxgkmtMultiplaneOverlayStretchQuality = this.stretchQuality): D3dkmtMultiplaneOverlayAttributes = D3dkmtMultiplaneOverlayAttributes(flags = flags, srcRect = srcRect, dstRect = dstRect, clipRect = clipRect, rotation = rotation, blend = blend, dirtyRectCount = dirtyRectCount, pDirtyRectsCtorArg = pDirtyRects, videoFrameFormat = videoFrameFormat, yCbCrFlags = yCbCrFlags, stereoFormat = stereoFormat, stereoLeftViewFrame0 = stereoLeftViewFrame0, stereoBaseViewFrame0 = stereoBaseViewFrame0, stereoFlipMode = stereoFlipMode, stretchQuality = stretchQuality)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtMultiplaneOverlayAttributes) return false
        if (this.flags != other.flags) return false
        if (this.srcRect != other.srcRect) return false
        if (this.dstRect != other.dstRect) return false
        if (this.clipRect != other.clipRect) return false
        if (this.rotation != other.rotation) return false
        if (this.blend != other.blend) return false
        if (this.dirtyRectCount != other.dirtyRectCount) return false
        if (this.pDirtyRects != other.pDirtyRects) return false
        if (this.videoFrameFormat != other.videoFrameFormat) return false
        if (this.yCbCrFlags != other.yCbCrFlags) return false
        if (this.stereoFormat != other.stereoFormat) return false
        if (this.stereoLeftViewFrame0 != other.stereoLeftViewFrame0) return false
        if (this.stereoBaseViewFrame0 != other.stereoBaseViewFrame0) return false
        if (this.stereoFlipMode != other.stereoFlipMode) return false
        if (this.stretchQuality != other.stretchQuality) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.srcRect.hashCode()
        result = 31 * result + this.dstRect.hashCode()
        result = 31 * result + this.clipRect.hashCode()
        result = 31 * result + this.rotation.hashCode()
        result = 31 * result + this.blend.hashCode()
        result = 31 * result + this.dirtyRectCount.hashCode()
        result = 31 * result + this.pDirtyRects.hashCode()
        result = 31 * result + this.videoFrameFormat.hashCode()
        result = 31 * result + this.yCbCrFlags.hashCode()
        result = 31 * result + this.stereoFormat.hashCode()
        result = 31 * result + this.stereoLeftViewFrame0.hashCode()
        result = 31 * result + this.stereoBaseViewFrame0.hashCode()
        result = 31 * result + this.stereoFlipMode.hashCode()
        result = 31 * result + this.stretchQuality.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: UInt = 0u,
            srcRect: Rect = Rect(),
            dstRect: Rect = Rect(),
            clipRect: Rect = Rect(),
            rotation: D3dddiRotation = 0,
            blend: D3dkmtMultiplaneOverlayBlend = 0,
            dirtyRectCount: UInt = 0u,
            pDirtyRects: MutPtr = MutPtr(0L),
            videoFrameFormat: D3dkmtMultiplaneOverlayVideoFrameFormat = 0,
            yCbCrFlags: UInt = 0u,
            stereoFormat: D3dkmtMultiplaneOverlayStereoFormat = 0,
            stereoLeftViewFrame0: Bool = 0,
            stereoBaseViewFrame0: Bool = 0,
            stereoFlipMode: DxgkmtMultiplaneOverlayStereoFlipMode = 0,
            stretchQuality: DxgkmtMultiplaneOverlayStretchQuality = 0,
        ): D3dkmtMultiplaneOverlayAttributes =
            D3dkmtMultiplaneOverlayAttributes(
                flags = flags,
                srcRect = srcRect,
                dstRect = dstRect,
                clipRect = clipRect,
                rotation = rotation,
                blend = blend,
                dirtyRectCount = dirtyRectCount,
                pDirtyRectsCtorArg = pDirtyRects,
                videoFrameFormat = videoFrameFormat,
                yCbCrFlags = yCbCrFlags,
                stereoFormat = stereoFormat,
                stereoLeftViewFrame0 = stereoLeftViewFrame0,
                stereoBaseViewFrame0 = stereoBaseViewFrame0,
                stereoFlipMode = stereoFlipMode,
                stretchQuality = stretchQuality,
            )
    }
}

public class D3dkmtMultiplaneOverlayAttributes2 internal constructor(
    public var flags: UInt,
    public var srcRect: Rect,
    public var dstRect: Rect,
    public var clipRect: Rect,
    public var rotation: D3dddiRotation,
    public var blend: D3dkmtMultiplaneOverlayBlend,
    public var dirtyRectCount: UInt,
    pDirtyRectsCtorArg: MutPtr,
    public var videoFrameFormat: D3dkmtMultiplaneOverlayVideoFrameFormat,
    public var colorSpace: D3dddiColorSpaceType,
    public var stereoFormat: D3dkmtMultiplaneOverlayStereoFormat,
    public var stereoLeftViewFrame0: Bool,
    public var stereoBaseViewFrame0: Bool,
    public var stereoFlipMode: DxgkmtMultiplaneOverlayStereoFlipMode,
    public var stretchQuality: DxgkmtMultiplaneOverlayStretchQuality,
    public var reserved1: UInt,
) {
    public var pDirtyRects: MutPtr = pDirtyRectsCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        srcRect = Rect(),
        dstRect = Rect(),
        clipRect = Rect(),
        rotation = 0,
        blend = 0,
        dirtyRectCount = 0u,
        pDirtyRectsCtorArg = MutPtr(0L),
        videoFrameFormat = 0,
        colorSpace = 0,
        stereoFormat = 0,
        stereoLeftViewFrame0 = 0,
        stereoBaseViewFrame0 = 0,
        stereoFlipMode = 0,
        stretchQuality = 0,
        reserved1 = 0u,
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): Rect = this.srcRect

    public operator fun component3(): Rect = this.dstRect

    public operator fun component4(): Rect = this.clipRect

    public operator fun component5(): D3dddiRotation = this.rotation

    public operator fun component6(): D3dkmtMultiplaneOverlayBlend = this.blend

    public operator fun component7(): UInt = this.dirtyRectCount

    public operator fun component8(): MutPtr = this.pDirtyRects

    public operator fun component9(): D3dkmtMultiplaneOverlayVideoFrameFormat = this.videoFrameFormat

    public operator fun component10(): D3dddiColorSpaceType = this.colorSpace

    public operator fun component11(): D3dkmtMultiplaneOverlayStereoFormat = this.stereoFormat

    public operator fun component12(): Bool = this.stereoLeftViewFrame0

    public operator fun component13(): Bool = this.stereoBaseViewFrame0

    public operator fun component14(): DxgkmtMultiplaneOverlayStereoFlipMode = this.stereoFlipMode

    public operator fun component15(): DxgkmtMultiplaneOverlayStretchQuality = this.stretchQuality

    public operator fun component16(): UInt = this.reserved1

    public fun copy(flags: UInt = this.flags, srcRect: Rect = this.srcRect, dstRect: Rect = this.dstRect, clipRect: Rect = this.clipRect, rotation: D3dddiRotation = this.rotation, blend: D3dkmtMultiplaneOverlayBlend = this.blend, dirtyRectCount: UInt = this.dirtyRectCount, pDirtyRects: MutPtr = this.pDirtyRects, videoFrameFormat: D3dkmtMultiplaneOverlayVideoFrameFormat = this.videoFrameFormat, colorSpace: D3dddiColorSpaceType = this.colorSpace, stereoFormat: D3dkmtMultiplaneOverlayStereoFormat = this.stereoFormat, stereoLeftViewFrame0: Bool = this.stereoLeftViewFrame0, stereoBaseViewFrame0: Bool = this.stereoBaseViewFrame0, stereoFlipMode: DxgkmtMultiplaneOverlayStereoFlipMode = this.stereoFlipMode, stretchQuality: DxgkmtMultiplaneOverlayStretchQuality = this.stretchQuality, reserved1: UInt = this.reserved1): D3dkmtMultiplaneOverlayAttributes2 = D3dkmtMultiplaneOverlayAttributes2(flags = flags, srcRect = srcRect, dstRect = dstRect, clipRect = clipRect, rotation = rotation, blend = blend, dirtyRectCount = dirtyRectCount, pDirtyRectsCtorArg = pDirtyRects, videoFrameFormat = videoFrameFormat, colorSpace = colorSpace, stereoFormat = stereoFormat, stereoLeftViewFrame0 = stereoLeftViewFrame0, stereoBaseViewFrame0 = stereoBaseViewFrame0, stereoFlipMode = stereoFlipMode, stretchQuality = stretchQuality, reserved1 = reserved1)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtMultiplaneOverlayAttributes2) return false
        if (this.flags != other.flags) return false
        if (this.srcRect != other.srcRect) return false
        if (this.dstRect != other.dstRect) return false
        if (this.clipRect != other.clipRect) return false
        if (this.rotation != other.rotation) return false
        if (this.blend != other.blend) return false
        if (this.dirtyRectCount != other.dirtyRectCount) return false
        if (this.pDirtyRects != other.pDirtyRects) return false
        if (this.videoFrameFormat != other.videoFrameFormat) return false
        if (this.colorSpace != other.colorSpace) return false
        if (this.stereoFormat != other.stereoFormat) return false
        if (this.stereoLeftViewFrame0 != other.stereoLeftViewFrame0) return false
        if (this.stereoBaseViewFrame0 != other.stereoBaseViewFrame0) return false
        if (this.stereoFlipMode != other.stereoFlipMode) return false
        if (this.stretchQuality != other.stretchQuality) return false
        if (this.reserved1 != other.reserved1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.srcRect.hashCode()
        result = 31 * result + this.dstRect.hashCode()
        result = 31 * result + this.clipRect.hashCode()
        result = 31 * result + this.rotation.hashCode()
        result = 31 * result + this.blend.hashCode()
        result = 31 * result + this.dirtyRectCount.hashCode()
        result = 31 * result + this.pDirtyRects.hashCode()
        result = 31 * result + this.videoFrameFormat.hashCode()
        result = 31 * result + this.colorSpace.hashCode()
        result = 31 * result + this.stereoFormat.hashCode()
        result = 31 * result + this.stereoLeftViewFrame0.hashCode()
        result = 31 * result + this.stereoBaseViewFrame0.hashCode()
        result = 31 * result + this.stereoFlipMode.hashCode()
        result = 31 * result + this.stretchQuality.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: UInt = 0u,
            srcRect: Rect = Rect(),
            dstRect: Rect = Rect(),
            clipRect: Rect = Rect(),
            rotation: D3dddiRotation = 0,
            blend: D3dkmtMultiplaneOverlayBlend = 0,
            dirtyRectCount: UInt = 0u,
            pDirtyRects: MutPtr = MutPtr(0L),
            videoFrameFormat: D3dkmtMultiplaneOverlayVideoFrameFormat = 0,
            colorSpace: D3dddiColorSpaceType = 0,
            stereoFormat: D3dkmtMultiplaneOverlayStereoFormat = 0,
            stereoLeftViewFrame0: Bool = 0,
            stereoBaseViewFrame0: Bool = 0,
            stereoFlipMode: DxgkmtMultiplaneOverlayStereoFlipMode = 0,
            stretchQuality: DxgkmtMultiplaneOverlayStretchQuality = 0,
            reserved1: UInt = 0u,
        ): D3dkmtMultiplaneOverlayAttributes2 =
            D3dkmtMultiplaneOverlayAttributes2(
                flags = flags,
                srcRect = srcRect,
                dstRect = dstRect,
                clipRect = clipRect,
                rotation = rotation,
                blend = blend,
                dirtyRectCount = dirtyRectCount,
                pDirtyRectsCtorArg = pDirtyRects,
                videoFrameFormat = videoFrameFormat,
                colorSpace = colorSpace,
                stereoFormat = stereoFormat,
                stereoLeftViewFrame0 = stereoLeftViewFrame0,
                stereoBaseViewFrame0 = stereoBaseViewFrame0,
                stereoFlipMode = stereoFlipMode,
                stretchQuality = stretchQuality,
                reserved1 = reserved1,
            )
    }
}

public class D3dkmtMultiplaneOverlayAttributes3 internal constructor(
    public var flags: UInt,
    public var srcRect: Rect,
    public var dstRect: Rect,
    public var clipRect: Rect,
    public var rotation: D3dddiRotation,
    public var blend: D3dkmtMultiplaneOverlayBlend,
    public var dirtyRectCount: UInt,
    pDirtyRectsCtorArg: MutPtr,
    public var colorSpace: D3dddiColorSpaceType,
    public var stretchQuality: DxgkmtMultiplaneOverlayStretchQuality,
    public var sDRWhiteLevel: UInt,
) {
    public var pDirtyRects: MutPtr = pDirtyRectsCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        srcRect = Rect(),
        dstRect = Rect(),
        clipRect = Rect(),
        rotation = 0,
        blend = 0,
        dirtyRectCount = 0u,
        pDirtyRectsCtorArg = MutPtr(0L),
        colorSpace = 0,
        stretchQuality = 0,
        sDRWhiteLevel = 0u,
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): Rect = this.srcRect

    public operator fun component3(): Rect = this.dstRect

    public operator fun component4(): Rect = this.clipRect

    public operator fun component5(): D3dddiRotation = this.rotation

    public operator fun component6(): D3dkmtMultiplaneOverlayBlend = this.blend

    public operator fun component7(): UInt = this.dirtyRectCount

    public operator fun component8(): MutPtr = this.pDirtyRects

    public operator fun component9(): D3dddiColorSpaceType = this.colorSpace

    public operator fun component10(): DxgkmtMultiplaneOverlayStretchQuality = this.stretchQuality

    public operator fun component11(): UInt = this.sDRWhiteLevel

    public fun copy(flags: UInt = this.flags, srcRect: Rect = this.srcRect, dstRect: Rect = this.dstRect, clipRect: Rect = this.clipRect, rotation: D3dddiRotation = this.rotation, blend: D3dkmtMultiplaneOverlayBlend = this.blend, dirtyRectCount: UInt = this.dirtyRectCount, pDirtyRects: MutPtr = this.pDirtyRects, colorSpace: D3dddiColorSpaceType = this.colorSpace, stretchQuality: DxgkmtMultiplaneOverlayStretchQuality = this.stretchQuality, sDRWhiteLevel: UInt = this.sDRWhiteLevel): D3dkmtMultiplaneOverlayAttributes3 = D3dkmtMultiplaneOverlayAttributes3(flags = flags, srcRect = srcRect, dstRect = dstRect, clipRect = clipRect, rotation = rotation, blend = blend, dirtyRectCount = dirtyRectCount, pDirtyRectsCtorArg = pDirtyRects, colorSpace = colorSpace, stretchQuality = stretchQuality, sDRWhiteLevel = sDRWhiteLevel)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtMultiplaneOverlayAttributes3) return false
        if (this.flags != other.flags) return false
        if (this.srcRect != other.srcRect) return false
        if (this.dstRect != other.dstRect) return false
        if (this.clipRect != other.clipRect) return false
        if (this.rotation != other.rotation) return false
        if (this.blend != other.blend) return false
        if (this.dirtyRectCount != other.dirtyRectCount) return false
        if (this.pDirtyRects != other.pDirtyRects) return false
        if (this.colorSpace != other.colorSpace) return false
        if (this.stretchQuality != other.stretchQuality) return false
        if (this.sDRWhiteLevel != other.sDRWhiteLevel) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.srcRect.hashCode()
        result = 31 * result + this.dstRect.hashCode()
        result = 31 * result + this.clipRect.hashCode()
        result = 31 * result + this.rotation.hashCode()
        result = 31 * result + this.blend.hashCode()
        result = 31 * result + this.dirtyRectCount.hashCode()
        result = 31 * result + this.pDirtyRects.hashCode()
        result = 31 * result + this.colorSpace.hashCode()
        result = 31 * result + this.stretchQuality.hashCode()
        result = 31 * result + this.sDRWhiteLevel.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: UInt = 0u,
            srcRect: Rect = Rect(),
            dstRect: Rect = Rect(),
            clipRect: Rect = Rect(),
            rotation: D3dddiRotation = 0,
            blend: D3dkmtMultiplaneOverlayBlend = 0,
            dirtyRectCount: UInt = 0u,
            pDirtyRects: MutPtr = MutPtr(0L),
            colorSpace: D3dddiColorSpaceType = 0,
            stretchQuality: DxgkmtMultiplaneOverlayStretchQuality = 0,
            sDRWhiteLevel: UInt = 0u,
        ): D3dkmtMultiplaneOverlayAttributes3 =
            D3dkmtMultiplaneOverlayAttributes3(
                flags = flags,
                srcRect = srcRect,
                dstRect = dstRect,
                clipRect = clipRect,
                rotation = rotation,
                blend = blend,
                dirtyRectCount = dirtyRectCount,
                pDirtyRectsCtorArg = pDirtyRects,
                colorSpace = colorSpace,
                stretchQuality = stretchQuality,
                sDRWhiteLevel = sDRWhiteLevel,
            )
    }
}

public data class D3dkmtMultiplaneOverlayCaps(
    public var anonymous: D3dkmtMultiplaneOverlayCaps0 = D3dkmtMultiplaneOverlayCaps0(),
)

public data class D3dkmtMultiplaneOverlayCaps0(
    public var anonymous: D3dkmtMultiplaneOverlayCaps00 = D3dkmtMultiplaneOverlayCaps00(),
    public var value: UInt = 0u,
)

public data class D3dkmtMultiplaneOverlayCaps00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtMultiplaneOverlayCaps00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtMultiplaneOverlayCaps00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtMultiplaneOverlayCaps00 =
                    D3dkmtMultiplaneOverlayCaps00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtMultiplaneOverlayCaps00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtMultiplaneOverlayPostComposition(
    public var flags: D3dkmtMultiplaneOverlayPostCompositionFlags = D3dkmtMultiplaneOverlayPostCompositionFlags(),
    public var srcRect: Rect = Rect(),
    public var dstRect: Rect = Rect(),
    public var rotation: D3dddiRotation = 0,
)

public data class D3dkmtMultiplaneOverlayPostCompositionFlags(
    public var anonymous: D3dkmtMultiplaneOverlayPostCompositionFlags0 = D3dkmtMultiplaneOverlayPostCompositionFlags0(),
)

public data class D3dkmtMultiplaneOverlayPostCompositionFlags0(
    public var anonymous: D3dkmtMultiplaneOverlayPostCompositionFlags00 = D3dkmtMultiplaneOverlayPostCompositionFlags00(),
    public var value: UInt = 0u,
)

public data class D3dkmtMultiplaneOverlayPostCompositionFlags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtMultiplaneOverlayPostCompositionFlags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtMultiplaneOverlayPostCompositionFlags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtMultiplaneOverlayPostCompositionFlags00 =
                    D3dkmtMultiplaneOverlayPostCompositionFlags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtMultiplaneOverlayPostCompositionFlags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtMultiplaneOverlayPostCompositionWithSource(
    public var vidPnSourceId: UInt = 0u,
    public var postComposition: D3dkmtMultiplaneOverlayPostComposition = D3dkmtMultiplaneOverlayPostComposition(),
)

public data class D3dkmtMultisamplemethod(
    public var numSamples: UInt = 0u,
    public var numQualityLevels: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtMultisamplemethod> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtMultisamplemethod> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): D3dkmtMultisamplemethod =
                    D3dkmtMultisamplemethod(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtMultisamplemethod) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numSamples)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numQualityLevels)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.reserved)
                }
            }
    }
}

public data class D3dkmtNodemetadata(
    public var nodeOrdinalAndAdapterIndex: UInt = 0u,
    public var nodeData: DxgkNodemetadata = DxgkNodemetadata(),
)

public data class D3dkmtNodePerfdata(
    public var nodeOrdinal: UInt = 0u,
    public var physicalAdapterIndex: UInt = 0u,
    public var frequency: ULong = 0uL,
    public var maxFrequency: ULong = 0uL,
    public var maxFrequencyOC: ULong = 0uL,
    public var voltage: UInt = 0u,
    public var voltageMax: UInt = 0u,
    public var voltageMaxOC: UInt = 0u,
    public var maxTransitionLatency: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtNodePerfdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtNodePerfdata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): D3dkmtNodePerfdata =
                    D3dkmtNodePerfdata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtNodePerfdata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nodeOrdinal)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.physicalAdapterIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.frequency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.maxFrequency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.maxFrequencyOC)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.voltage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.voltageMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.voltageMaxOC)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.maxTransitionLatency)
                }
            }
    }
}

public data class D3dkmtNotifyWorkSubmission(
    public var hHwQueue: UInt = 0u,
    public var flags: D3dkmtNotifyWorkSubmissionFlags = D3dkmtNotifyWorkSubmissionFlags(),
)

public data class D3dkmtNotifyWorkSubmissionFlags(
    public var anonymous: D3dkmtNotifyWorkSubmissionFlags0 = D3dkmtNotifyWorkSubmissionFlags0(),
)

public data class D3dkmtNotifyWorkSubmissionFlags0(
    public var anonymous: D3dkmtNotifyWorkSubmissionFlags00 = D3dkmtNotifyWorkSubmissionFlags00(),
    public var value: UInt = 0u,
)

public data class D3dkmtNotifyWorkSubmissionFlags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtNotifyWorkSubmissionFlags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtNotifyWorkSubmissionFlags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtNotifyWorkSubmissionFlags00 =
                    D3dkmtNotifyWorkSubmissionFlags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtNotifyWorkSubmissionFlags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class D3dkmtOfferallocations internal constructor(
    public var hDevice: UInt,
    pResourcesCtorArg: MutPtr,
    handleListCtorArg: ConstPtr,
    public var numAllocations: UInt,
    public var priority: D3dkmtOfferPriority,
    public var flags: D3dkmtOfferFlags,
) {
    public var pResources: MutPtr = pResourcesCtorArg
        internal set

    public var handleList: ConstPtr = handleListCtorArg
        internal set

    public constructor() : this(
        hDevice = 0u,
        pResourcesCtorArg = MutPtr(0L),
        handleListCtorArg = ConstPtr(0L),
        numAllocations = 0u,
        priority = 0,
        flags = D3dkmtOfferFlags(),
    )

    public operator fun component1(): UInt = this.hDevice

    public operator fun component2(): MutPtr = this.pResources

    public operator fun component3(): ConstPtr = this.handleList

    public operator fun component4(): UInt = this.numAllocations

    public operator fun component5(): D3dkmtOfferPriority = this.priority

    public operator fun component6(): D3dkmtOfferFlags = this.flags

    public fun copy(hDevice: UInt = this.hDevice, pResources: MutPtr = this.pResources, handleList: ConstPtr = this.handleList, numAllocations: UInt = this.numAllocations, priority: D3dkmtOfferPriority = this.priority, flags: D3dkmtOfferFlags = this.flags): D3dkmtOfferallocations = D3dkmtOfferallocations(hDevice = hDevice, pResourcesCtorArg = pResources, handleListCtorArg = handleList, numAllocations = numAllocations, priority = priority, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtOfferallocations) return false
        if (this.hDevice != other.hDevice) return false
        if (this.pResources != other.pResources) return false
        if (this.handleList != other.handleList) return false
        if (this.numAllocations != other.numAllocations) return false
        if (this.priority != other.priority) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDevice.hashCode()
        result = 31 * result + this.pResources.hashCode()
        result = 31 * result + this.handleList.hashCode()
        result = 31 * result + this.numAllocations.hashCode()
        result = 31 * result + this.priority.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hDevice: UInt = 0u,
            pResources: MutPtr = MutPtr(0L),
            handleList: ConstPtr = ConstPtr(0L),
            numAllocations: UInt = 0u,
            priority: D3dkmtOfferPriority = 0,
            flags: D3dkmtOfferFlags = D3dkmtOfferFlags(),
        ): D3dkmtOfferallocations =
            D3dkmtOfferallocations(
                hDevice = hDevice,
                pResourcesCtorArg = pResources,
                handleListCtorArg = handleList,
                numAllocations = numAllocations,
                priority = priority,
                flags = flags,
            )
    }
}

public data class D3dkmtOfferFlags(
    public var anonymous: D3dkmtOfferFlags0 = D3dkmtOfferFlags0(),
)

public data class D3dkmtOfferFlags0(
    public var anonymous: D3dkmtOfferFlags00 = D3dkmtOfferFlags00(),
    public var value: UInt = 0u,
)

public data class D3dkmtOfferFlags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtOfferFlags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtOfferFlags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtOfferFlags00 =
                    D3dkmtOfferFlags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtOfferFlags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class D3dkmtOpenadapterfromdevicename internal constructor(
    pDeviceNameCtorArg: Pcwstr,
    public var hAdapter: UInt,
    public var adapterLuid: Luid,
) {
    public var pDeviceName: Pcwstr = pDeviceNameCtorArg
        internal set

    public constructor() : this(
        pDeviceNameCtorArg = ConstPtr(0L),
        hAdapter = 0u,
        adapterLuid = Luid(),
    )

    public operator fun component1(): Pcwstr = this.pDeviceName

    public operator fun component2(): UInt = this.hAdapter

    public operator fun component3(): Luid = this.adapterLuid

    public fun copy(pDeviceName: Pcwstr = this.pDeviceName, hAdapter: UInt = this.hAdapter, adapterLuid: Luid = this.adapterLuid): D3dkmtOpenadapterfromdevicename = D3dkmtOpenadapterfromdevicename(pDeviceNameCtorArg = pDeviceName, hAdapter = hAdapter, adapterLuid = adapterLuid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtOpenadapterfromdevicename) return false
        if (this.pDeviceName != other.pDeviceName) return false
        if (this.hAdapter != other.hAdapter) return false
        if (this.adapterLuid != other.adapterLuid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pDeviceName.hashCode()
        result = 31 * result + this.hAdapter.hashCode()
        result = 31 * result + this.adapterLuid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pDeviceName: Pcwstr = ConstPtr(0L),
            hAdapter: UInt = 0u,
            adapterLuid: Luid = Luid(),
        ): D3dkmtOpenadapterfromdevicename =
            D3dkmtOpenadapterfromdevicename(
                pDeviceNameCtorArg = pDeviceName,
                hAdapter = hAdapter,
                adapterLuid = adapterLuid,
            )
    }
}

public data class D3dkmtOpenadapterfromgdidisplayname(
    public var deviceName: UShortArray = UShortArray(32),
    public var hAdapter: UInt = 0u,
    public var adapterLuid: Luid = Luid(),
    public var vidPnSourceId: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtOpenadapterfromgdidisplayname) return false
        if (!this.deviceName.contentEquals(other.deviceName)) return false
        if (this.hAdapter != other.hAdapter) return false
        if (this.adapterLuid != other.adapterLuid) return false
        if (this.vidPnSourceId != other.vidPnSourceId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.deviceName.contentHashCode()
        result = 31 * result + this.hAdapter.hashCode()
        result = 31 * result + this.adapterLuid.hashCode()
        result = 31 * result + this.vidPnSourceId.hashCode()
        return result
    }
}

public class D3dkmtOpenadapterfromhdc internal constructor(
    hDcCtorArg: Hdc,
    public var hAdapter: UInt,
    public var adapterLuid: Luid,
    public var vidPnSourceId: UInt,
) {
    public var hDc: Hdc = hDcCtorArg
        internal set

    public constructor() : this(
        hDcCtorArg = MutPtr(0L),
        hAdapter = 0u,
        adapterLuid = Luid(),
        vidPnSourceId = 0u,
    )

    public operator fun component1(): Hdc = this.hDc

    public operator fun component2(): UInt = this.hAdapter

    public operator fun component3(): Luid = this.adapterLuid

    public operator fun component4(): UInt = this.vidPnSourceId

    public fun copy(hDc: Hdc = this.hDc, hAdapter: UInt = this.hAdapter, adapterLuid: Luid = this.adapterLuid, vidPnSourceId: UInt = this.vidPnSourceId): D3dkmtOpenadapterfromhdc = D3dkmtOpenadapterfromhdc(hDcCtorArg = hDc, hAdapter = hAdapter, adapterLuid = adapterLuid, vidPnSourceId = vidPnSourceId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtOpenadapterfromhdc) return false
        if (this.hDc != other.hDc) return false
        if (this.hAdapter != other.hAdapter) return false
        if (this.adapterLuid != other.adapterLuid) return false
        if (this.vidPnSourceId != other.vidPnSourceId) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDc.hashCode()
        result = 31 * result + this.hAdapter.hashCode()
        result = 31 * result + this.adapterLuid.hashCode()
        result = 31 * result + this.vidPnSourceId.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hDc: Hdc = MutPtr(0L),
            hAdapter: UInt = 0u,
            adapterLuid: Luid = Luid(),
            vidPnSourceId: UInt = 0u,
        ): D3dkmtOpenadapterfromhdc =
            D3dkmtOpenadapterfromhdc(
                hDcCtorArg = hDc,
                hAdapter = hAdapter,
                adapterLuid = adapterLuid,
                vidPnSourceId = vidPnSourceId,
            )
    }
}

public data class D3dkmtOpenadapterfromluid(
    public var adapterLuid: Luid = Luid(),
    public var hAdapter: UInt = 0u,
)

public data class D3dkmtOpenglinfo(
    public var umdOpenGlIcdFileName: UShortArray = UShortArray(260),
    public var version: UInt = 0u,
    public var flags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtOpenglinfo) return false
        if (!this.umdOpenGlIcdFileName.contentEquals(other.umdOpenGlIcdFileName)) return false
        if (this.version != other.version) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.umdOpenGlIcdFileName.contentHashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtOpenglinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtOpenglinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 528L
                override fun readNative(addr: Long): D3dkmtOpenglinfo =
                    D3dkmtOpenglinfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 520L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 524L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtOpenglinfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr, value.umdOpenGlIcdFileName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 520L, value.version)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 524L, value.flags)
                }
            }
    }
}

public data class D3dkmtOpenkeyedmutex(
    public var hSharedHandle: UInt = 0u,
    public var hKeyedMutex: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtOpenkeyedmutex> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtOpenkeyedmutex> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtOpenkeyedmutex =
                    D3dkmtOpenkeyedmutex(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtOpenkeyedmutex) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hSharedHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hKeyedMutex)
                }
            }
    }
}

public class D3dkmtOpenkeyedmutex2 internal constructor(
    public var hSharedHandle: UInt,
    public var hKeyedMutex: UInt,
    pPrivateRuntimeDataCtorArg: MutPtr,
    public var privateRuntimeDataSize: UInt,
) {
    public var pPrivateRuntimeData: MutPtr = pPrivateRuntimeDataCtorArg
        internal set

    public constructor() : this(
        hSharedHandle = 0u,
        hKeyedMutex = 0u,
        pPrivateRuntimeDataCtorArg = MutPtr(0L),
        privateRuntimeDataSize = 0u,
    )

    public operator fun component1(): UInt = this.hSharedHandle

    public operator fun component2(): UInt = this.hKeyedMutex

    public operator fun component3(): MutPtr = this.pPrivateRuntimeData

    public operator fun component4(): UInt = this.privateRuntimeDataSize

    public fun copy(hSharedHandle: UInt = this.hSharedHandle, hKeyedMutex: UInt = this.hKeyedMutex, pPrivateRuntimeData: MutPtr = this.pPrivateRuntimeData, privateRuntimeDataSize: UInt = this.privateRuntimeDataSize): D3dkmtOpenkeyedmutex2 = D3dkmtOpenkeyedmutex2(hSharedHandle = hSharedHandle, hKeyedMutex = hKeyedMutex, pPrivateRuntimeDataCtorArg = pPrivateRuntimeData, privateRuntimeDataSize = privateRuntimeDataSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtOpenkeyedmutex2) return false
        if (this.hSharedHandle != other.hSharedHandle) return false
        if (this.hKeyedMutex != other.hKeyedMutex) return false
        if (this.pPrivateRuntimeData != other.pPrivateRuntimeData) return false
        if (this.privateRuntimeDataSize != other.privateRuntimeDataSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hSharedHandle.hashCode()
        result = 31 * result + this.hKeyedMutex.hashCode()
        result = 31 * result + this.pPrivateRuntimeData.hashCode()
        result = 31 * result + this.privateRuntimeDataSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtOpenkeyedmutex2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtOpenkeyedmutex2> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): D3dkmtOpenkeyedmutex2 =
                    D3dkmtOpenkeyedmutex2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtOpenkeyedmutex2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hSharedHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hKeyedMutex)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pPrivateRuntimeData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.privateRuntimeDataSize)
                }
            }

        public operator fun invoke(
            hSharedHandle: UInt = 0u,
            hKeyedMutex: UInt = 0u,
            pPrivateRuntimeData: MutPtr = MutPtr(0L),
            privateRuntimeDataSize: UInt = 0u,
        ): D3dkmtOpenkeyedmutex2 =
            D3dkmtOpenkeyedmutex2(
                hSharedHandle = hSharedHandle,
                hKeyedMutex = hKeyedMutex,
                pPrivateRuntimeDataCtorArg = pPrivateRuntimeData,
                privateRuntimeDataSize = privateRuntimeDataSize,
            )
    }
}

public class D3dkmtOpenkeyedmutexfromnthandle internal constructor(
    hNtHandleCtorArg: Handle,
    public var hKeyedMutex: UInt,
    pPrivateRuntimeDataCtorArg: MutPtr,
    public var privateRuntimeDataSize: UInt,
) {
    public var hNtHandle: Handle = hNtHandleCtorArg
        internal set

    public var pPrivateRuntimeData: MutPtr = pPrivateRuntimeDataCtorArg
        internal set

    public constructor() : this(
        hNtHandleCtorArg = MutPtr(0L),
        hKeyedMutex = 0u,
        pPrivateRuntimeDataCtorArg = MutPtr(0L),
        privateRuntimeDataSize = 0u,
    )

    public operator fun component1(): Handle = this.hNtHandle

    public operator fun component2(): UInt = this.hKeyedMutex

    public operator fun component3(): MutPtr = this.pPrivateRuntimeData

    public operator fun component4(): UInt = this.privateRuntimeDataSize

    public fun copy(hNtHandle: Handle = this.hNtHandle, hKeyedMutex: UInt = this.hKeyedMutex, pPrivateRuntimeData: MutPtr = this.pPrivateRuntimeData, privateRuntimeDataSize: UInt = this.privateRuntimeDataSize): D3dkmtOpenkeyedmutexfromnthandle = D3dkmtOpenkeyedmutexfromnthandle(hNtHandleCtorArg = hNtHandle, hKeyedMutex = hKeyedMutex, pPrivateRuntimeDataCtorArg = pPrivateRuntimeData, privateRuntimeDataSize = privateRuntimeDataSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtOpenkeyedmutexfromnthandle) return false
        if (this.hNtHandle != other.hNtHandle) return false
        if (this.hKeyedMutex != other.hKeyedMutex) return false
        if (this.pPrivateRuntimeData != other.pPrivateRuntimeData) return false
        if (this.privateRuntimeDataSize != other.privateRuntimeDataSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hNtHandle.hashCode()
        result = 31 * result + this.hKeyedMutex.hashCode()
        result = 31 * result + this.pPrivateRuntimeData.hashCode()
        result = 31 * result + this.privateRuntimeDataSize.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hNtHandle: Handle = MutPtr(0L),
            hKeyedMutex: UInt = 0u,
            pPrivateRuntimeData: MutPtr = MutPtr(0L),
            privateRuntimeDataSize: UInt = 0u,
        ): D3dkmtOpenkeyedmutexfromnthandle =
            D3dkmtOpenkeyedmutexfromnthandle(
                hNtHandleCtorArg = hNtHandle,
                hKeyedMutex = hKeyedMutex,
                pPrivateRuntimeDataCtorArg = pPrivateRuntimeData,
                privateRuntimeDataSize = privateRuntimeDataSize,
            )
    }
}

public class D3dkmtOpennativefencefromnthandle internal constructor(
    hNtHandleCtorArg: Handle,
    public var hDevice: UInt,
    public var engineAffinity: UInt,
    public var flags: D3dddiSynchronizationobjectFlags,
    public var hSyncObject: UInt,
    public var nativeFenceMapping: D3dddiNativefencemapping,
) {
    public var hNtHandle: Handle = hNtHandleCtorArg
        internal set

    public constructor() : this(
        hNtHandleCtorArg = MutPtr(0L),
        hDevice = 0u,
        engineAffinity = 0u,
        flags = D3dddiSynchronizationobjectFlags(),
        hSyncObject = 0u,
        nativeFenceMapping = D3dddiNativefencemapping(),
    )

    public operator fun component1(): Handle = this.hNtHandle

    public operator fun component2(): UInt = this.hDevice

    public operator fun component3(): UInt = this.engineAffinity

    public operator fun component4(): D3dddiSynchronizationobjectFlags = this.flags

    public operator fun component5(): UInt = this.hSyncObject

    public operator fun component6(): D3dddiNativefencemapping = this.nativeFenceMapping

    public fun copy(hNtHandle: Handle = this.hNtHandle, hDevice: UInt = this.hDevice, engineAffinity: UInt = this.engineAffinity, flags: D3dddiSynchronizationobjectFlags = this.flags, hSyncObject: UInt = this.hSyncObject, nativeFenceMapping: D3dddiNativefencemapping = this.nativeFenceMapping): D3dkmtOpennativefencefromnthandle = D3dkmtOpennativefencefromnthandle(hNtHandleCtorArg = hNtHandle, hDevice = hDevice, engineAffinity = engineAffinity, flags = flags, hSyncObject = hSyncObject, nativeFenceMapping = nativeFenceMapping)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtOpennativefencefromnthandle) return false
        if (this.hNtHandle != other.hNtHandle) return false
        if (this.hDevice != other.hDevice) return false
        if (this.engineAffinity != other.engineAffinity) return false
        if (this.flags != other.flags) return false
        if (this.hSyncObject != other.hSyncObject) return false
        if (this.nativeFenceMapping != other.nativeFenceMapping) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hNtHandle.hashCode()
        result = 31 * result + this.hDevice.hashCode()
        result = 31 * result + this.engineAffinity.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.hSyncObject.hashCode()
        result = 31 * result + this.nativeFenceMapping.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hNtHandle: Handle = MutPtr(0L),
            hDevice: UInt = 0u,
            engineAffinity: UInt = 0u,
            flags: D3dddiSynchronizationobjectFlags = D3dddiSynchronizationobjectFlags(),
            hSyncObject: UInt = 0u,
            nativeFenceMapping: D3dddiNativefencemapping = D3dddiNativefencemapping(),
        ): D3dkmtOpennativefencefromnthandle =
            D3dkmtOpennativefencefromnthandle(
                hNtHandleCtorArg = hNtHandle,
                hDevice = hDevice,
                engineAffinity = engineAffinity,
                flags = flags,
                hSyncObject = hSyncObject,
                nativeFenceMapping = nativeFenceMapping,
            )
    }
}

public class D3dkmtOpennthandlefromname internal constructor(
    public var dwDesiredAccess: UInt,
    pObjAttribCtorArg: MutPtr,
    hNtHandleCtorArg: Handle,
) {
    public var pObjAttrib: MutPtr = pObjAttribCtorArg
        internal set

    public var hNtHandle: Handle = hNtHandleCtorArg
        internal set

    public constructor() : this(
        dwDesiredAccess = 0u,
        pObjAttribCtorArg = MutPtr(0L),
        hNtHandleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwDesiredAccess

    public operator fun component2(): MutPtr = this.pObjAttrib

    public operator fun component3(): Handle = this.hNtHandle

    public fun copy(dwDesiredAccess: UInt = this.dwDesiredAccess, pObjAttrib: MutPtr = this.pObjAttrib, hNtHandle: Handle = this.hNtHandle): D3dkmtOpennthandlefromname = D3dkmtOpennthandlefromname(dwDesiredAccess = dwDesiredAccess, pObjAttribCtorArg = pObjAttrib, hNtHandleCtorArg = hNtHandle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtOpennthandlefromname) return false
        if (this.dwDesiredAccess != other.dwDesiredAccess) return false
        if (this.pObjAttrib != other.pObjAttrib) return false
        if (this.hNtHandle != other.hNtHandle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwDesiredAccess.hashCode()
        result = 31 * result + this.pObjAttrib.hashCode()
        result = 31 * result + this.hNtHandle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwDesiredAccess: UInt = 0u,
            pObjAttrib: MutPtr = MutPtr(0L),
            hNtHandle: Handle = MutPtr(0L),
        ): D3dkmtOpennthandlefromname =
            D3dkmtOpennthandlefromname(
                dwDesiredAccess = dwDesiredAccess,
                pObjAttribCtorArg = pObjAttrib,
                hNtHandleCtorArg = hNtHandle,
            )
    }
}

public class D3dkmtOpenprotectedsessionfromnthandle internal constructor(
    hNtHandleCtorArg: Handle,
    public var hHandle: UInt,
) {
    public var hNtHandle: Handle = hNtHandleCtorArg
        internal set

    public constructor() : this(
        hNtHandleCtorArg = MutPtr(0L),
        hHandle = 0u,
    )

    public operator fun component1(): Handle = this.hNtHandle

    public operator fun component2(): UInt = this.hHandle

    public fun copy(hNtHandle: Handle = this.hNtHandle, hHandle: UInt = this.hHandle): D3dkmtOpenprotectedsessionfromnthandle = D3dkmtOpenprotectedsessionfromnthandle(hNtHandleCtorArg = hNtHandle, hHandle = hHandle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtOpenprotectedsessionfromnthandle) return false
        if (this.hNtHandle != other.hNtHandle) return false
        if (this.hHandle != other.hHandle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hNtHandle.hashCode()
        result = 31 * result + this.hHandle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hNtHandle: Handle = MutPtr(0L),
            hHandle: UInt = 0u,
        ): D3dkmtOpenprotectedsessionfromnthandle =
            D3dkmtOpenprotectedsessionfromnthandle(
                hNtHandleCtorArg = hNtHandle,
                hHandle = hHandle,
            )
    }
}

public class D3dkmtOpenresource internal constructor(
    public var hDevice: UInt,
    public var hGlobalShare: UInt,
    public var numAllocations: UInt,
    public var anonymous: D3dkmtOpenresource0,
    pPrivateRuntimeDataCtorArg: MutPtr,
    public var privateRuntimeDataSize: UInt,
    pResourcePrivateDriverDataCtorArg: MutPtr,
    public var resourcePrivateDriverDataSize: UInt,
    pTotalPrivateDriverDataBufferCtorArg: MutPtr,
    public var totalPrivateDriverDataBufferSize: UInt,
    public var hResource: UInt,
) {
    public var pPrivateRuntimeData: MutPtr = pPrivateRuntimeDataCtorArg
        internal set

    public var pResourcePrivateDriverData: MutPtr = pResourcePrivateDriverDataCtorArg
        internal set

    public var pTotalPrivateDriverDataBuffer: MutPtr = pTotalPrivateDriverDataBufferCtorArg
        internal set

    public constructor() : this(
        hDevice = 0u,
        hGlobalShare = 0u,
        numAllocations = 0u,
        anonymous = D3dkmtOpenresource0(),
        pPrivateRuntimeDataCtorArg = MutPtr(0L),
        privateRuntimeDataSize = 0u,
        pResourcePrivateDriverDataCtorArg = MutPtr(0L),
        resourcePrivateDriverDataSize = 0u,
        pTotalPrivateDriverDataBufferCtorArg = MutPtr(0L),
        totalPrivateDriverDataBufferSize = 0u,
        hResource = 0u,
    )

    public operator fun component1(): UInt = this.hDevice

    public operator fun component2(): UInt = this.hGlobalShare

    public operator fun component3(): UInt = this.numAllocations

    public operator fun component4(): D3dkmtOpenresource0 = this.anonymous

    public operator fun component5(): MutPtr = this.pPrivateRuntimeData

    public operator fun component6(): UInt = this.privateRuntimeDataSize

    public operator fun component7(): MutPtr = this.pResourcePrivateDriverData

    public operator fun component8(): UInt = this.resourcePrivateDriverDataSize

    public operator fun component9(): MutPtr = this.pTotalPrivateDriverDataBuffer

    public operator fun component10(): UInt = this.totalPrivateDriverDataBufferSize

    public operator fun component11(): UInt = this.hResource

    public fun copy(hDevice: UInt = this.hDevice, hGlobalShare: UInt = this.hGlobalShare, numAllocations: UInt = this.numAllocations, anonymous: D3dkmtOpenresource0 = this.anonymous, pPrivateRuntimeData: MutPtr = this.pPrivateRuntimeData, privateRuntimeDataSize: UInt = this.privateRuntimeDataSize, pResourcePrivateDriverData: MutPtr = this.pResourcePrivateDriverData, resourcePrivateDriverDataSize: UInt = this.resourcePrivateDriverDataSize, pTotalPrivateDriverDataBuffer: MutPtr = this.pTotalPrivateDriverDataBuffer, totalPrivateDriverDataBufferSize: UInt = this.totalPrivateDriverDataBufferSize, hResource: UInt = this.hResource): D3dkmtOpenresource = D3dkmtOpenresource(hDevice = hDevice, hGlobalShare = hGlobalShare, numAllocations = numAllocations, anonymous = anonymous, pPrivateRuntimeDataCtorArg = pPrivateRuntimeData, privateRuntimeDataSize = privateRuntimeDataSize, pResourcePrivateDriverDataCtorArg = pResourcePrivateDriverData, resourcePrivateDriverDataSize = resourcePrivateDriverDataSize, pTotalPrivateDriverDataBufferCtorArg = pTotalPrivateDriverDataBuffer, totalPrivateDriverDataBufferSize = totalPrivateDriverDataBufferSize, hResource = hResource)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtOpenresource) return false
        if (this.hDevice != other.hDevice) return false
        if (this.hGlobalShare != other.hGlobalShare) return false
        if (this.numAllocations != other.numAllocations) return false
        if (this.anonymous != other.anonymous) return false
        if (this.pPrivateRuntimeData != other.pPrivateRuntimeData) return false
        if (this.privateRuntimeDataSize != other.privateRuntimeDataSize) return false
        if (this.pResourcePrivateDriverData != other.pResourcePrivateDriverData) return false
        if (this.resourcePrivateDriverDataSize != other.resourcePrivateDriverDataSize) return false
        if (this.pTotalPrivateDriverDataBuffer != other.pTotalPrivateDriverDataBuffer) return false
        if (this.totalPrivateDriverDataBufferSize != other.totalPrivateDriverDataBufferSize) return false
        if (this.hResource != other.hResource) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDevice.hashCode()
        result = 31 * result + this.hGlobalShare.hashCode()
        result = 31 * result + this.numAllocations.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.pPrivateRuntimeData.hashCode()
        result = 31 * result + this.privateRuntimeDataSize.hashCode()
        result = 31 * result + this.pResourcePrivateDriverData.hashCode()
        result = 31 * result + this.resourcePrivateDriverDataSize.hashCode()
        result = 31 * result + this.pTotalPrivateDriverDataBuffer.hashCode()
        result = 31 * result + this.totalPrivateDriverDataBufferSize.hashCode()
        result = 31 * result + this.hResource.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hDevice: UInt = 0u,
            hGlobalShare: UInt = 0u,
            numAllocations: UInt = 0u,
            anonymous: D3dkmtOpenresource0 = D3dkmtOpenresource0(),
            pPrivateRuntimeData: MutPtr = MutPtr(0L),
            privateRuntimeDataSize: UInt = 0u,
            pResourcePrivateDriverData: MutPtr = MutPtr(0L),
            resourcePrivateDriverDataSize: UInt = 0u,
            pTotalPrivateDriverDataBuffer: MutPtr = MutPtr(0L),
            totalPrivateDriverDataBufferSize: UInt = 0u,
            hResource: UInt = 0u,
        ): D3dkmtOpenresource =
            D3dkmtOpenresource(
                hDevice = hDevice,
                hGlobalShare = hGlobalShare,
                numAllocations = numAllocations,
                anonymous = anonymous,
                pPrivateRuntimeDataCtorArg = pPrivateRuntimeData,
                privateRuntimeDataSize = privateRuntimeDataSize,
                pResourcePrivateDriverDataCtorArg = pResourcePrivateDriverData,
                resourcePrivateDriverDataSize = resourcePrivateDriverDataSize,
                pTotalPrivateDriverDataBufferCtorArg = pTotalPrivateDriverDataBuffer,
                totalPrivateDriverDataBufferSize = totalPrivateDriverDataBufferSize,
                hResource = hResource,
            )
    }
}

public class D3dkmtOpenresource0 internal constructor(
    pOpenAllocationInfoCtorArg: MutPtr,
    pOpenAllocationInfo2CtorArg: MutPtr,
) {
    public var pOpenAllocationInfo: MutPtr = pOpenAllocationInfoCtorArg
        internal set

    public var pOpenAllocationInfo2: MutPtr = pOpenAllocationInfo2CtorArg
        internal set

    public constructor() : this(
        pOpenAllocationInfoCtorArg = MutPtr(0L),
        pOpenAllocationInfo2CtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.pOpenAllocationInfo

    public operator fun component2(): MutPtr = this.pOpenAllocationInfo2

    public fun copy(pOpenAllocationInfo: MutPtr = this.pOpenAllocationInfo, pOpenAllocationInfo2: MutPtr = this.pOpenAllocationInfo2): D3dkmtOpenresource0 = D3dkmtOpenresource0(pOpenAllocationInfoCtorArg = pOpenAllocationInfo, pOpenAllocationInfo2CtorArg = pOpenAllocationInfo2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtOpenresource0) return false
        if (this.pOpenAllocationInfo != other.pOpenAllocationInfo) return false
        if (this.pOpenAllocationInfo2 != other.pOpenAllocationInfo2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pOpenAllocationInfo.hashCode()
        result = 31 * result + this.pOpenAllocationInfo2.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pOpenAllocationInfo: MutPtr = MutPtr(0L),
            pOpenAllocationInfo2: MutPtr = MutPtr(0L),
        ): D3dkmtOpenresource0 =
            D3dkmtOpenresource0(
                pOpenAllocationInfoCtorArg = pOpenAllocationInfo,
                pOpenAllocationInfo2CtorArg = pOpenAllocationInfo2,
            )
    }
}

public class D3dkmtOpenresourcefromnthandle internal constructor(
    public var hDevice: UInt,
    hNtHandleCtorArg: Handle,
    public var numAllocations: UInt,
    pOpenAllocationInfo2CtorArg: MutPtr,
    public var privateRuntimeDataSize: UInt,
    pPrivateRuntimeDataCtorArg: MutPtr,
    public var resourcePrivateDriverDataSize: UInt,
    pResourcePrivateDriverDataCtorArg: MutPtr,
    public var totalPrivateDriverDataBufferSize: UInt,
    pTotalPrivateDriverDataBufferCtorArg: MutPtr,
    public var hResource: UInt,
    public var hKeyedMutex: UInt,
    pKeyedMutexPrivateRuntimeDataCtorArg: MutPtr,
    public var keyedMutexPrivateRuntimeDataSize: UInt,
    public var hSyncObject: UInt,
) {
    public var hNtHandle: Handle = hNtHandleCtorArg
        internal set

    public var pOpenAllocationInfo2: MutPtr = pOpenAllocationInfo2CtorArg
        internal set

    public var pPrivateRuntimeData: MutPtr = pPrivateRuntimeDataCtorArg
        internal set

    public var pResourcePrivateDriverData: MutPtr = pResourcePrivateDriverDataCtorArg
        internal set

    public var pTotalPrivateDriverDataBuffer: MutPtr = pTotalPrivateDriverDataBufferCtorArg
        internal set

    public var pKeyedMutexPrivateRuntimeData: MutPtr = pKeyedMutexPrivateRuntimeDataCtorArg
        internal set

    public constructor() : this(
        hDevice = 0u,
        hNtHandleCtorArg = MutPtr(0L),
        numAllocations = 0u,
        pOpenAllocationInfo2CtorArg = MutPtr(0L),
        privateRuntimeDataSize = 0u,
        pPrivateRuntimeDataCtorArg = MutPtr(0L),
        resourcePrivateDriverDataSize = 0u,
        pResourcePrivateDriverDataCtorArg = MutPtr(0L),
        totalPrivateDriverDataBufferSize = 0u,
        pTotalPrivateDriverDataBufferCtorArg = MutPtr(0L),
        hResource = 0u,
        hKeyedMutex = 0u,
        pKeyedMutexPrivateRuntimeDataCtorArg = MutPtr(0L),
        keyedMutexPrivateRuntimeDataSize = 0u,
        hSyncObject = 0u,
    )

    public operator fun component1(): UInt = this.hDevice

    public operator fun component2(): Handle = this.hNtHandle

    public operator fun component3(): UInt = this.numAllocations

    public operator fun component4(): MutPtr = this.pOpenAllocationInfo2

    public operator fun component5(): UInt = this.privateRuntimeDataSize

    public operator fun component6(): MutPtr = this.pPrivateRuntimeData

    public operator fun component7(): UInt = this.resourcePrivateDriverDataSize

    public operator fun component8(): MutPtr = this.pResourcePrivateDriverData

    public operator fun component9(): UInt = this.totalPrivateDriverDataBufferSize

    public operator fun component10(): MutPtr = this.pTotalPrivateDriverDataBuffer

    public operator fun component11(): UInt = this.hResource

    public operator fun component12(): UInt = this.hKeyedMutex

    public operator fun component13(): MutPtr = this.pKeyedMutexPrivateRuntimeData

    public operator fun component14(): UInt = this.keyedMutexPrivateRuntimeDataSize

    public operator fun component15(): UInt = this.hSyncObject

    public fun copy(hDevice: UInt = this.hDevice, hNtHandle: Handle = this.hNtHandle, numAllocations: UInt = this.numAllocations, pOpenAllocationInfo2: MutPtr = this.pOpenAllocationInfo2, privateRuntimeDataSize: UInt = this.privateRuntimeDataSize, pPrivateRuntimeData: MutPtr = this.pPrivateRuntimeData, resourcePrivateDriverDataSize: UInt = this.resourcePrivateDriverDataSize, pResourcePrivateDriverData: MutPtr = this.pResourcePrivateDriverData, totalPrivateDriverDataBufferSize: UInt = this.totalPrivateDriverDataBufferSize, pTotalPrivateDriverDataBuffer: MutPtr = this.pTotalPrivateDriverDataBuffer, hResource: UInt = this.hResource, hKeyedMutex: UInt = this.hKeyedMutex, pKeyedMutexPrivateRuntimeData: MutPtr = this.pKeyedMutexPrivateRuntimeData, keyedMutexPrivateRuntimeDataSize: UInt = this.keyedMutexPrivateRuntimeDataSize, hSyncObject: UInt = this.hSyncObject): D3dkmtOpenresourcefromnthandle = D3dkmtOpenresourcefromnthandle(hDevice = hDevice, hNtHandleCtorArg = hNtHandle, numAllocations = numAllocations, pOpenAllocationInfo2CtorArg = pOpenAllocationInfo2, privateRuntimeDataSize = privateRuntimeDataSize, pPrivateRuntimeDataCtorArg = pPrivateRuntimeData, resourcePrivateDriverDataSize = resourcePrivateDriverDataSize, pResourcePrivateDriverDataCtorArg = pResourcePrivateDriverData, totalPrivateDriverDataBufferSize = totalPrivateDriverDataBufferSize, pTotalPrivateDriverDataBufferCtorArg = pTotalPrivateDriverDataBuffer, hResource = hResource, hKeyedMutex = hKeyedMutex, pKeyedMutexPrivateRuntimeDataCtorArg = pKeyedMutexPrivateRuntimeData, keyedMutexPrivateRuntimeDataSize = keyedMutexPrivateRuntimeDataSize, hSyncObject = hSyncObject)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtOpenresourcefromnthandle) return false
        if (this.hDevice != other.hDevice) return false
        if (this.hNtHandle != other.hNtHandle) return false
        if (this.numAllocations != other.numAllocations) return false
        if (this.pOpenAllocationInfo2 != other.pOpenAllocationInfo2) return false
        if (this.privateRuntimeDataSize != other.privateRuntimeDataSize) return false
        if (this.pPrivateRuntimeData != other.pPrivateRuntimeData) return false
        if (this.resourcePrivateDriverDataSize != other.resourcePrivateDriverDataSize) return false
        if (this.pResourcePrivateDriverData != other.pResourcePrivateDriverData) return false
        if (this.totalPrivateDriverDataBufferSize != other.totalPrivateDriverDataBufferSize) return false
        if (this.pTotalPrivateDriverDataBuffer != other.pTotalPrivateDriverDataBuffer) return false
        if (this.hResource != other.hResource) return false
        if (this.hKeyedMutex != other.hKeyedMutex) return false
        if (this.pKeyedMutexPrivateRuntimeData != other.pKeyedMutexPrivateRuntimeData) return false
        if (this.keyedMutexPrivateRuntimeDataSize != other.keyedMutexPrivateRuntimeDataSize) return false
        if (this.hSyncObject != other.hSyncObject) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hDevice.hashCode()
        result = 31 * result + this.hNtHandle.hashCode()
        result = 31 * result + this.numAllocations.hashCode()
        result = 31 * result + this.pOpenAllocationInfo2.hashCode()
        result = 31 * result + this.privateRuntimeDataSize.hashCode()
        result = 31 * result + this.pPrivateRuntimeData.hashCode()
        result = 31 * result + this.resourcePrivateDriverDataSize.hashCode()
        result = 31 * result + this.pResourcePrivateDriverData.hashCode()
        result = 31 * result + this.totalPrivateDriverDataBufferSize.hashCode()
        result = 31 * result + this.pTotalPrivateDriverDataBuffer.hashCode()
        result = 31 * result + this.hResource.hashCode()
        result = 31 * result + this.hKeyedMutex.hashCode()
        result = 31 * result + this.pKeyedMutexPrivateRuntimeData.hashCode()
        result = 31 * result + this.keyedMutexPrivateRuntimeDataSize.hashCode()
        result = 31 * result + this.hSyncObject.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hDevice: UInt = 0u,
            hNtHandle: Handle = MutPtr(0L),
            numAllocations: UInt = 0u,
            pOpenAllocationInfo2: MutPtr = MutPtr(0L),
            privateRuntimeDataSize: UInt = 0u,
            pPrivateRuntimeData: MutPtr = MutPtr(0L),
            resourcePrivateDriverDataSize: UInt = 0u,
            pResourcePrivateDriverData: MutPtr = MutPtr(0L),
            totalPrivateDriverDataBufferSize: UInt = 0u,
            pTotalPrivateDriverDataBuffer: MutPtr = MutPtr(0L),
            hResource: UInt = 0u,
            hKeyedMutex: UInt = 0u,
            pKeyedMutexPrivateRuntimeData: MutPtr = MutPtr(0L),
            keyedMutexPrivateRuntimeDataSize: UInt = 0u,
            hSyncObject: UInt = 0u,
        ): D3dkmtOpenresourcefromnthandle =
            D3dkmtOpenresourcefromnthandle(
                hDevice = hDevice,
                hNtHandleCtorArg = hNtHandle,
                numAllocations = numAllocations,
                pOpenAllocationInfo2CtorArg = pOpenAllocationInfo2,
                privateRuntimeDataSize = privateRuntimeDataSize,
                pPrivateRuntimeDataCtorArg = pPrivateRuntimeData,
                resourcePrivateDriverDataSize = resourcePrivateDriverDataSize,
                pResourcePrivateDriverDataCtorArg = pResourcePrivateDriverData,
                totalPrivateDriverDataBufferSize = totalPrivateDriverDataBufferSize,
                pTotalPrivateDriverDataBufferCtorArg = pTotalPrivateDriverDataBuffer,
                hResource = hResource,
                hKeyedMutex = hKeyedMutex,
                pKeyedMutexPrivateRuntimeDataCtorArg = pKeyedMutexPrivateRuntimeData,
                keyedMutexPrivateRuntimeDataSize = keyedMutexPrivateRuntimeDataSize,
                hSyncObject = hSyncObject,
            )
    }
}

public data class D3dkmtOpensynchronizationobject(
    public var hSharedHandle: UInt = 0u,
    public var hSyncObject: UInt = 0u,
    public var reserved: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtOpensynchronizationobject) return false
        if (this.hSharedHandle != other.hSharedHandle) return false
        if (this.hSyncObject != other.hSyncObject) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hSharedHandle.hashCode()
        result = 31 * result + this.hSyncObject.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtOpensynchronizationobject> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtOpensynchronizationobject> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): D3dkmtOpensynchronizationobject =
                    D3dkmtOpensynchronizationobject(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (8).toInt())
                        ).readNative(addr + 8L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: D3dkmtOpensynchronizationobject) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hSharedHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hSyncObject)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (8).toInt())
                    ).writeNative(addr + 8L, value.reserved.toList())
                }
            }
    }
}

public class D3dkmtOpensyncobjectfromnthandle internal constructor(
    hNtHandleCtorArg: Handle,
    public var hSyncObject: UInt,
) {
    public var hNtHandle: Handle = hNtHandleCtorArg
        internal set

    public constructor() : this(
        hNtHandleCtorArg = MutPtr(0L),
        hSyncObject = 0u,
    )

    public operator fun component1(): Handle = this.hNtHandle

    public operator fun component2(): UInt = this.hSyncObject

    public fun copy(hNtHandle: Handle = this.hNtHandle, hSyncObject: UInt = this.hSyncObject): D3dkmtOpensyncobjectfromnthandle = D3dkmtOpensyncobjectfromnthandle(hNtHandleCtorArg = hNtHandle, hSyncObject = hSyncObject)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtOpensyncobjectfromnthandle) return false
        if (this.hNtHandle != other.hNtHandle) return false
        if (this.hSyncObject != other.hSyncObject) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hNtHandle.hashCode()
        result = 31 * result + this.hSyncObject.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hNtHandle: Handle = MutPtr(0L),
            hSyncObject: UInt = 0u,
        ): D3dkmtOpensyncobjectfromnthandle =
            D3dkmtOpensyncobjectfromnthandle(
                hNtHandleCtorArg = hNtHandle,
                hSyncObject = hSyncObject,
            )
    }
}

public class D3dkmtOpensyncobjectfromnthandle2 internal constructor(
    hNtHandleCtorArg: Handle,
    public var hDevice: UInt,
    public var flags: D3dddiSynchronizationobjectFlags,
    public var hSyncObject: UInt,
    public var anonymous: D3dkmtOpensyncobjectfromnthandle20,
) {
    public var hNtHandle: Handle = hNtHandleCtorArg
        internal set

    public constructor() : this(
        hNtHandleCtorArg = MutPtr(0L),
        hDevice = 0u,
        flags = D3dddiSynchronizationobjectFlags(),
        hSyncObject = 0u,
        anonymous = D3dkmtOpensyncobjectfromnthandle20(),
    )

    public operator fun component1(): Handle = this.hNtHandle

    public operator fun component2(): UInt = this.hDevice

    public operator fun component3(): D3dddiSynchronizationobjectFlags = this.flags

    public operator fun component4(): UInt = this.hSyncObject

    public operator fun component5(): D3dkmtOpensyncobjectfromnthandle20 = this.anonymous

    public fun copy(hNtHandle: Handle = this.hNtHandle, hDevice: UInt = this.hDevice, flags: D3dddiSynchronizationobjectFlags = this.flags, hSyncObject: UInt = this.hSyncObject, anonymous: D3dkmtOpensyncobjectfromnthandle20 = this.anonymous): D3dkmtOpensyncobjectfromnthandle2 = D3dkmtOpensyncobjectfromnthandle2(hNtHandleCtorArg = hNtHandle, hDevice = hDevice, flags = flags, hSyncObject = hSyncObject, anonymous = anonymous)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtOpensyncobjectfromnthandle2) return false
        if (this.hNtHandle != other.hNtHandle) return false
        if (this.hDevice != other.hDevice) return false
        if (this.flags != other.flags) return false
        if (this.hSyncObject != other.hSyncObject) return false
        if (this.anonymous != other.anonymous) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hNtHandle.hashCode()
        result = 31 * result + this.hDevice.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.hSyncObject.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hNtHandle: Handle = MutPtr(0L),
            hDevice: UInt = 0u,
            flags: D3dddiSynchronizationobjectFlags = D3dddiSynchronizationobjectFlags(),
            hSyncObject: UInt = 0u,
            anonymous: D3dkmtOpensyncobjectfromnthandle20 = D3dkmtOpensyncobjectfromnthandle20(),
        ): D3dkmtOpensyncobjectfromnthandle2 =
            D3dkmtOpensyncobjectfromnthandle2(
                hNtHandleCtorArg = hNtHandle,
                hDevice = hDevice,
                flags = flags,
                hSyncObject = hSyncObject,
                anonymous = anonymous,
            )
    }
}

public data class D3dkmtOpensyncobjectfromnthandle20(
    public var monitoredFence: D3dkmtOpensyncobjectfromnthandle200 = D3dkmtOpensyncobjectfromnthandle200(),
    public var reserved: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtOpensyncobjectfromnthandle20) return false
        if (this.monitoredFence != other.monitoredFence) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.monitoredFence.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public class D3dkmtOpensyncobjectfromnthandle200 internal constructor(
    fenceValueCPUVirtualAddressCtorArg: MutPtr,
    public var fenceValueGPUVirtualAddress: ULong,
    public var engineAffinity: UInt,
) {
    public var fenceValueCPUVirtualAddress: MutPtr = fenceValueCPUVirtualAddressCtorArg
        internal set

    public constructor() : this(
        fenceValueCPUVirtualAddressCtorArg = MutPtr(0L),
        fenceValueGPUVirtualAddress = 0uL,
        engineAffinity = 0u,
    )

    public operator fun component1(): MutPtr = this.fenceValueCPUVirtualAddress

    public operator fun component2(): ULong = this.fenceValueGPUVirtualAddress

    public operator fun component3(): UInt = this.engineAffinity

    public fun copy(fenceValueCPUVirtualAddress: MutPtr = this.fenceValueCPUVirtualAddress, fenceValueGPUVirtualAddress: ULong = this.fenceValueGPUVirtualAddress, engineAffinity: UInt = this.engineAffinity): D3dkmtOpensyncobjectfromnthandle200 = D3dkmtOpensyncobjectfromnthandle200(fenceValueCPUVirtualAddressCtorArg = fenceValueCPUVirtualAddress, fenceValueGPUVirtualAddress = fenceValueGPUVirtualAddress, engineAffinity = engineAffinity)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtOpensyncobjectfromnthandle200) return false
        if (this.fenceValueCPUVirtualAddress != other.fenceValueCPUVirtualAddress) return false
        if (this.fenceValueGPUVirtualAddress != other.fenceValueGPUVirtualAddress) return false
        if (this.engineAffinity != other.engineAffinity) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fenceValueCPUVirtualAddress.hashCode()
        result = 31 * result + this.fenceValueGPUVirtualAddress.hashCode()
        result = 31 * result + this.engineAffinity.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtOpensyncobjectfromnthandle200> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtOpensyncobjectfromnthandle200> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): D3dkmtOpensyncobjectfromnthandle200 =
                    D3dkmtOpensyncobjectfromnthandle200(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtOpensyncobjectfromnthandle200) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.fenceValueCPUVirtualAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.fenceValueGPUVirtualAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.engineAffinity)
                }
            }

        public operator fun invoke(
            fenceValueCPUVirtualAddress: MutPtr = MutPtr(0L),
            fenceValueGPUVirtualAddress: ULong = 0uL,
            engineAffinity: UInt = 0u,
        ): D3dkmtOpensyncobjectfromnthandle200 =
            D3dkmtOpensyncobjectfromnthandle200(
                fenceValueCPUVirtualAddressCtorArg = fenceValueCPUVirtualAddress,
                fenceValueGPUVirtualAddress = fenceValueGPUVirtualAddress,
                engineAffinity = engineAffinity,
            )
    }
}

public class D3dkmtOpensyncobjectnthandlefromname internal constructor(
    public var dwDesiredAccess: UInt,
    pObjAttribCtorArg: MutPtr,
    hNtHandleCtorArg: Handle,
) {
    public var pObjAttrib: MutPtr = pObjAttribCtorArg
        internal set

    public var hNtHandle: Handle = hNtHandleCtorArg
        internal set

    public constructor() : this(
        dwDesiredAccess = 0u,
        pObjAttribCtorArg = MutPtr(0L),
        hNtHandleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.dwDesiredAccess

    public operator fun component2(): MutPtr = this.pObjAttrib

    public operator fun component3(): Handle = this.hNtHandle

    public fun copy(dwDesiredAccess: UInt = this.dwDesiredAccess, pObjAttrib: MutPtr = this.pObjAttrib, hNtHandle: Handle = this.hNtHandle): D3dkmtOpensyncobjectnthandlefromname = D3dkmtOpensyncobjectnthandlefromname(dwDesiredAccess = dwDesiredAccess, pObjAttribCtorArg = pObjAttrib, hNtHandleCtorArg = hNtHandle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtOpensyncobjectnthandlefromname) return false
        if (this.dwDesiredAccess != other.dwDesiredAccess) return false
        if (this.pObjAttrib != other.pObjAttrib) return false
        if (this.hNtHandle != other.hNtHandle) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwDesiredAccess.hashCode()
        result = 31 * result + this.pObjAttrib.hashCode()
        result = 31 * result + this.hNtHandle.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dwDesiredAccess: UInt = 0u,
            pObjAttrib: MutPtr = MutPtr(0L),
            hNtHandle: Handle = MutPtr(0L),
        ): D3dkmtOpensyncobjectnthandlefromname =
            D3dkmtOpensyncobjectnthandlefromname(
                dwDesiredAccess = dwDesiredAccess,
                pObjAttribCtorArg = pObjAttrib,
                hNtHandleCtorArg = hNtHandle,
            )
    }
}

public data class D3dkmtOutduplPointerShapeInfo(
    public var type: D3dkmtOutduplPointerShapeType = 0,
    public var width: UInt = 0u,
    public var height: UInt = 0u,
    public var pitch: UInt = 0u,
    public var hotSpot: Point = Point(),
)

public data class D3dkmtOutputduplcontextscount(
    public var vidPnSourceId: UInt = 0u,
    public var outputDuplicationCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtOutputduplcontextscount> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtOutputduplcontextscount> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): D3dkmtOutputduplcontextscount =
                    D3dkmtOutputduplcontextscount(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: D3dkmtOutputduplcontextscount) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.vidPnSourceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.outputDuplicationCount)
                }
            }
    }
}

public data class D3dkmtOutputduplcreationflags(
    public var anonymous: D3dkmtOutputduplcreationflags0 = D3dkmtOutputduplcreationflags0(),
)

public data class D3dkmtOutputduplcreationflags0(
    public var anonymous: D3dkmtOutputduplcreationflags00 = D3dkmtOutputduplcreationflags00(),
    public var value: UInt = 0u,
)

public data class D3dkmtOutputduplcreationflags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtOutputduplcreationflags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<D3dkmtOutputduplcreationflags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): D3dkmtOutputduplcreationflags00 =
                    D3dkmtOutputduplcreationflags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: D3dkmtOutputduplcreationflags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class D3dkmtOutputduplpresent(
    public var hContext: UInt = 0u,
    public var hSource: UInt = 0u,
    public var vidPnSourceId: UInt = 0u,
    public var broadcastContextCount: UInt = 0u,
    public var broadcastContext: UIntArray = UIntArray(64),
    public var presentRegions: D3dkmtPresentRgns = D3dkmtPresentRgns(),
    public var flags: D3dkmtOutputduplpresentflags = D3dkmtOutputduplpresentflags(),
    public var hIndirectContext: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is D3dkmtOutputduplpresent) return false
        if (this.hContext != other.hContext) return false
        if (this.hSource != other.hSource) return false
        if (this.vidPnSourceId != other.vidPnSourceId) return false
        if (this.broadcastContextCount != other.broadcastContextCount) return false
        if (!this.broadcastContext.contentEquals(other.broadcastContext)) return false
        if (this.presentRegions != other.presentRegions) return false
        if (this.flags != other.flags) return false
        if (this.hIndirectContext != other.hIndirectContext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hContext.hashCode()
        result = 31 * result + this.hSource.hashCode()
        result = 31 * result + this.vidPnSourceId.hashCode()
        result = 31 * result + this.broadcastContextCount.hashCode()
        result = 31 * result + this.broadcastContext.contentHashCode()
        result = 31 * result + this.presentRegions.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.hIndirectContext.hashCode()
        return result
    }
}
