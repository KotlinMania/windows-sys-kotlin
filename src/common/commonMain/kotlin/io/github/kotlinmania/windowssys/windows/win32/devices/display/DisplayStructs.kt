@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.display

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Pointl
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rectl
import io.github.kotlinmania.windowssys.windows.win32.foundation.Size
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Blendfunction
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Devmodew
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.DisplayconfigColorEncoding
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Logfontw
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Panose
import io.github.kotlinmania.windowssys.windows.win32.system.console.CharInfo
import io.github.kotlinmania.windowssys.windows.win32.system.console.Coord

public data class Adapter(
    public var adapterName: UShortArray = UShortArray(128),
    public var numSources: Int = 0,
    public var sources: List<Sources> = List(1) { Sources() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Adapter) return false
        if (!this.adapterName.contentEquals(other.adapterName)) return false
        if (this.numSources != other.numSources) return false
        if (this.sources != other.sources) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.adapterName.contentHashCode()
        result = 31 * result + this.numSources.hashCode()
        result = 31 * result + this.sources.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Adapter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Adapter> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 272L
                override fun readNative(addr: Long): Adapter =
                    Adapter(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                        ).readNative(addr).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 256L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Sources.typeLayout(), (1).toInt())
                        ).readNative(addr + 260L),
                    )
                override fun writeNative(addr: Long, value: Adapter) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                    ).writeNative(addr, value.adapterName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 256L, value.numSources)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Sources.typeLayout(), (1).toInt())
                    ).writeNative(addr + 260L, value.sources)
                }
            }
    }
}

public data class Adapters(
    public var numAdapters: Int = 0,
    public var adapter: List<Adapter> = List(1) { Adapter() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Adapters> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Adapters> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 276L
                override fun readNative(addr: Long): Adapters =
                    Adapters(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Adapter.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Adapters) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.numAdapters)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Adapter.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.adapter)
                }
            }
    }
}

public data class BacklightReductionGammaRamp(
    public var r: UShortArray = UShortArray(256),
    public var g: UShortArray = UShortArray(256),
    public var b: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BacklightReductionGammaRamp) return false
        if (!this.r.contentEquals(other.r)) return false
        if (!this.g.contentEquals(other.g)) return false
        if (!this.b.contentEquals(other.b)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.r.contentHashCode()
        result = 31 * result + this.g.contentHashCode()
        result = 31 * result + this.b.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BacklightReductionGammaRamp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BacklightReductionGammaRamp> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 1536L
                override fun readNative(addr: Long): BacklightReductionGammaRamp =
                    BacklightReductionGammaRamp(
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
                override fun writeNative(addr: Long, value: BacklightReductionGammaRamp) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr, value.r.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 512L, value.g.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (256).toInt())
                    ).writeNative(addr + 1024L, value.b.toList())
                }
            }
    }
}

public data class BankPosition(
    public var readBankPosition: UInt = 0u,
    public var writeBankPosition: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BankPosition> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BankPosition> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): BankPosition =
                    BankPosition(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: BankPosition) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.readBankPosition)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.writeBankPosition)
                }
            }
    }
}

public data class Blendobj(
    public var blendFunction: Blendfunction = Blendfunction(),
)

public data class BrightnessLevel(
    public var count: UByte = 0u,
    public var level: UByteArray = UByteArray(103),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BrightnessLevel) return false
        if (this.count != other.count) return false
        if (!this.level.contentEquals(other.level)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.count.hashCode()
        result = 31 * result + this.level.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BrightnessLevel> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BrightnessLevel> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 104L
                override fun readNative(addr: Long): BrightnessLevel =
                    BrightnessLevel(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (103).toInt())
                        ).readNative(addr + 1L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: BrightnessLevel) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (103).toInt())
                    ).writeNative(addr + 1L, value.level.toList())
                }
            }
    }
}

public data class BrightnessNitRange(
    public var minLevelInMillinit: UInt = 0u,
    public var maxLevelInMillinit: UInt = 0u,
    public var stepSizeInMillinit: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BrightnessNitRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BrightnessNitRange> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): BrightnessNitRange =
                    BrightnessNitRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: BrightnessNitRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.minLevelInMillinit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxLevelInMillinit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.stepSizeInMillinit)
                }
            }
    }
}

public data class BrightnessNitRanges(
    public var normalRangeCount: UInt = 0u,
    public var rangeCount: UInt = 0u,
    public var preferredMaximumBrightness: UInt = 0u,
    public var supportedRanges: List<BrightnessNitRange> = List(16) { BrightnessNitRange() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BrightnessNitRanges> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BrightnessNitRanges> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 204L
                override fun readNative(addr: Long): BrightnessNitRanges =
                    BrightnessNitRanges(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(BrightnessNitRange.typeLayout(), (16).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: BrightnessNitRanges) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.normalRangeCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.rangeCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.preferredMaximumBrightness)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(BrightnessNitRange.typeLayout(), (16).toInt())
                    ).writeNative(addr + 12L, value.supportedRanges)
                }
            }
    }
}

public class Brushobj internal constructor(
    public var iSolidColor: UInt,
    pvRbrushCtorArg: MutPtr,
    public var flColorType: UInt,
) {
    public var pvRbrush: MutPtr = pvRbrushCtorArg
        internal set

    public constructor() : this(
        iSolidColor = 0u,
        pvRbrushCtorArg = MutPtr(0L),
        flColorType = 0u,
    )

    public operator fun component1(): UInt = this.iSolidColor

    public operator fun component2(): MutPtr = this.pvRbrush

    public operator fun component3(): UInt = this.flColorType

    public fun copy(iSolidColor: UInt = this.iSolidColor, pvRbrush: MutPtr = this.pvRbrush, flColorType: UInt = this.flColorType): Brushobj = Brushobj(iSolidColor = iSolidColor, pvRbrushCtorArg = pvRbrush, flColorType = flColorType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Brushobj) return false
        if (this.iSolidColor != other.iSolidColor) return false
        if (this.pvRbrush != other.pvRbrush) return false
        if (this.flColorType != other.flColorType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.iSolidColor.hashCode()
        result = 31 * result + this.pvRbrush.hashCode()
        result = 31 * result + this.flColorType.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Brushobj> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Brushobj> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Brushobj =
                    Brushobj(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Brushobj) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.iSolidColor)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pvRbrush)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.flColorType)
                }
            }

        public operator fun invoke(
            iSolidColor: UInt = 0u,
            pvRbrush: MutPtr = MutPtr(0L),
            flColorType: UInt = 0u,
        ): Brushobj =
            Brushobj(
                iSolidColor = iSolidColor,
                pvRbrushCtorArg = pvRbrush,
                flColorType = flColorType,
            )
    }
}

public class CdddxgkRedirbitmappresentinfo internal constructor(
    public var numDirtyRects: UInt,
    dirtyRectCtorArg: MutPtr,
    public var numContexts: UInt,
    hContextCtorArg: List<Handle>,
    public var bDoNotSynchronizeWithDxContent: Boolean,
) {
    public var dirtyRect: MutPtr = dirtyRectCtorArg
        internal set

    public var hContext: List<Handle> = hContextCtorArg
        internal set

    public constructor() : this(
        numDirtyRects = 0u,
        dirtyRectCtorArg = MutPtr(0L),
        numContexts = 0u,
        hContextCtorArg = List(65) { MutPtr(0L) },
        bDoNotSynchronizeWithDxContent = false,
    )

    public operator fun component1(): UInt = this.numDirtyRects

    public operator fun component2(): MutPtr = this.dirtyRect

    public operator fun component3(): UInt = this.numContexts

    public operator fun component4(): List<Handle> = this.hContext

    public operator fun component5(): Boolean = this.bDoNotSynchronizeWithDxContent

    public fun copy(numDirtyRects: UInt = this.numDirtyRects, dirtyRect: MutPtr = this.dirtyRect, numContexts: UInt = this.numContexts, hContext: List<Handle> = this.hContext, bDoNotSynchronizeWithDxContent: Boolean = this.bDoNotSynchronizeWithDxContent): CdddxgkRedirbitmappresentinfo = CdddxgkRedirbitmappresentinfo(numDirtyRects = numDirtyRects, dirtyRectCtorArg = dirtyRect, numContexts = numContexts, hContextCtorArg = hContext, bDoNotSynchronizeWithDxContent = bDoNotSynchronizeWithDxContent)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CdddxgkRedirbitmappresentinfo) return false
        if (this.numDirtyRects != other.numDirtyRects) return false
        if (this.dirtyRect != other.dirtyRect) return false
        if (this.numContexts != other.numContexts) return false
        if (this.hContext != other.hContext) return false
        if (this.bDoNotSynchronizeWithDxContent != other.bDoNotSynchronizeWithDxContent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numDirtyRects.hashCode()
        result = 31 * result + this.dirtyRect.hashCode()
        result = 31 * result + this.numContexts.hashCode()
        result = 31 * result + this.hContext.hashCode()
        result = 31 * result + this.bDoNotSynchronizeWithDxContent.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            numDirtyRects: UInt = 0u,
            dirtyRect: MutPtr = MutPtr(0L),
            numContexts: UInt = 0u,
            hContext: List<Handle> = List(65) { MutPtr(0L) },
            bDoNotSynchronizeWithDxContent: Boolean = false,
        ): CdddxgkRedirbitmappresentinfo =
            CdddxgkRedirbitmappresentinfo(
                numDirtyRects = numDirtyRects,
                dirtyRectCtorArg = dirtyRect,
                numContexts = numContexts,
                hContextCtorArg = hContext,
                bDoNotSynchronizeWithDxContent = bDoNotSynchronizeWithDxContent,
            )
    }
}

public data class CharImageInfo(
    public var charInfo: CharInfo = CharInfo(),
    public var fontImageInfo: FontImageInfo = FontImageInfo(),
)

public data class ChromaticityCoordinate(
    public var x: Float = 0.0f,
    public var y: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChromaticityCoordinate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ChromaticityCoordinate> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ChromaticityCoordinate =
                    ChromaticityCoordinate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ChromaticityCoordinate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.y)
                }
            }
    }
}

public data class Ciechroma(
    public var x: Int = 0,
    public var y: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ciechroma> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ciechroma> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Ciechroma =
                    Ciechroma(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ciechroma) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.y)
                }
            }
    }
}

public data class Clipline(
    public var ptfxA: Pointfix = Pointfix(),
    public var ptfxB: Pointfix = Pointfix(),
    public var lStyleState: Int = 0,
    public var c: UInt = 0u,
    public var arun: List<Run> = List(1) { Run() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Clipline> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Clipline> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Clipline =
                    Clipline(
                        (Pointfix.typeLayout()).readNative(addr),
                        (Pointfix.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Run.typeLayout(), (1).toInt())
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Clipline) {
                    (Pointfix.typeLayout()).writeNative(addr, value.ptfxA)
                    (Pointfix.typeLayout()).writeNative(addr + 8L, value.ptfxB)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.lStyleState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.c)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Run.typeLayout(), (1).toInt())
                    ).writeNative(addr + 24L, value.arun)
                }
            }
    }
}

public data class Clipobj(
    public var iUniq: UInt = 0u,
    public var rclBounds: Rectl = Rectl(),
    public var iDComplexity: UByte = 0u,
    public var iFComplexity: UByte = 0u,
    public var iMode: UByte = 0u,
    public var fjOptions: UByte = 0u,
)

public data class Colorinfo(
    public var red: Ciechroma = Ciechroma(),
    public var green: Ciechroma = Ciechroma(),
    public var blue: Ciechroma = Ciechroma(),
    public var cyan: Ciechroma = Ciechroma(),
    public var magenta: Ciechroma = Ciechroma(),
    public var yellow: Ciechroma = Ciechroma(),
    public var alignmentWhite: Ciechroma = Ciechroma(),
    public var redGamma: Int = 0,
    public var greenGamma: Int = 0,
    public var blueGamma: Int = 0,
    public var magentaInCyanDye: Int = 0,
    public var yellowInCyanDye: Int = 0,
    public var cyanInMagentaDye: Int = 0,
    public var yellowInMagentaDye: Int = 0,
    public var cyanInYellowDye: Int = 0,
    public var magentaInYellowDye: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Colorinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Colorinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 92L
                override fun readNative(addr: Long): Colorinfo =
                    Colorinfo(
                        (Ciechroma.typeLayout()).readNative(addr),
                        (Ciechroma.typeLayout()).readNative(addr + 8L),
                        (Ciechroma.typeLayout()).readNative(addr + 16L),
                        (Ciechroma.typeLayout()).readNative(addr + 24L),
                        (Ciechroma.typeLayout()).readNative(addr + 32L),
                        (Ciechroma.typeLayout()).readNative(addr + 40L),
                        (Ciechroma.typeLayout()).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 88L),
                    )
                override fun writeNative(addr: Long, value: Colorinfo) {
                    (Ciechroma.typeLayout()).writeNative(addr, value.red)
                    (Ciechroma.typeLayout()).writeNative(addr + 8L, value.green)
                    (Ciechroma.typeLayout()).writeNative(addr + 16L, value.blue)
                    (Ciechroma.typeLayout()).writeNative(addr + 24L, value.cyan)
                    (Ciechroma.typeLayout()).writeNative(addr + 32L, value.magenta)
                    (Ciechroma.typeLayout()).writeNative(addr + 40L, value.yellow)
                    (Ciechroma.typeLayout()).writeNative(addr + 48L, value.alignmentWhite)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.redGamma)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 60L, value.greenGamma)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 64L, value.blueGamma)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 68L, value.magentaInCyanDye)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 72L, value.yellowInCyanDye)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 76L, value.cyanInMagentaDye)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 80L, value.yellowInMagentaDye)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 84L, value.cyanInYellowDye)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 88L, value.magentaInYellowDye)
                }
            }
    }
}

public data class ColorspaceTransform(
    public var type: ColorspaceTransformType = 0,
    public var data: ColorspaceTransform0 = ColorspaceTransform0(),
)

public data class ColorspaceTransform0(
    public var rgb256x3x16: GammaRampRgb256x3x16 = GammaRampRgb256x3x16(),
    public var dxgi1: GammaRampDxgi1 = GammaRampDxgi1(),
    public var t3x4: ColorspaceTransform3x4 = ColorspaceTransform3x4(),
    public var matrixV2: ColorspaceTransformMatrixV2 = ColorspaceTransformMatrixV2(),
)

public data class ColorspaceTransform1dlutCap(
    public var numberOfLUTEntries: UInt = 0u,
    public var dataCap: ColorspaceTransformDataCap = ColorspaceTransformDataCap(),
)

public data class ColorspaceTransform3x4(
    public var colorMatrix3x4: FloatArray = FloatArray(12),
    public var scalarMultiplier: Float = 0.0f,
    public var lookupTable1D: List<GammaRampRgb> = List(4096) { GammaRampRgb() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ColorspaceTransform3x4) return false
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
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ColorspaceTransform3x4> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ColorspaceTransform3x4> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 49204L
                override fun readNative(addr: Long): ColorspaceTransform3x4 =
                    ColorspaceTransform3x4(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32, (12).toInt())
                        ).readNative(addr).toFloatArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(GammaRampRgb.typeLayout(), (4096).toInt())
                        ).readNative(addr + 52L),
                    )
                override fun writeNative(addr: Long, value: ColorspaceTransform3x4) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32, (12).toInt())
                    ).writeNative(addr, value.colorMatrix3x4.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 48L, value.scalarMultiplier)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(GammaRampRgb.typeLayout(), (4096).toInt())
                    ).writeNative(addr + 52L, value.lookupTable1D)
                }
            }
    }
}

public data class ColorspaceTransformDataCap(
    public var dataType: ColorspaceTransformDataType = 0,
    public var anonymous: ColorspaceTransformDataCap0 = ColorspaceTransformDataCap0(),
    public var numericRangeMin: Float = 0.0f,
    public var numericRangeMax: Float = 0.0f,
)

public data class ColorspaceTransformDataCap0(
    public var anonymous1: ColorspaceTransformDataCap00 = ColorspaceTransformDataCap00(),
    public var anonymous2: ColorspaceTransformDataCap01 = ColorspaceTransformDataCap01(),
    public var value: UInt = 0u,
)

public data class ColorspaceTransformDataCap00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ColorspaceTransformDataCap00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ColorspaceTransformDataCap00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ColorspaceTransformDataCap00 =
                    ColorspaceTransformDataCap00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ColorspaceTransformDataCap00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ColorspaceTransformDataCap01(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ColorspaceTransformDataCap01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ColorspaceTransformDataCap01> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ColorspaceTransformDataCap01 =
                    ColorspaceTransformDataCap01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ColorspaceTransformDataCap01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ColorspaceTransformMatrixCap(
    public var anonymous: ColorspaceTransformMatrixCap0 = ColorspaceTransformMatrixCap0(),
    public var dataCap: ColorspaceTransformDataCap = ColorspaceTransformDataCap(),
)

public data class ColorspaceTransformMatrixCap0(
    public var anonymous: ColorspaceTransformMatrixCap00 = ColorspaceTransformMatrixCap00(),
    public var value: UInt = 0u,
)

public data class ColorspaceTransformMatrixCap00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ColorspaceTransformMatrixCap00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ColorspaceTransformMatrixCap00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ColorspaceTransformMatrixCap00 =
                    ColorspaceTransformMatrixCap00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ColorspaceTransformMatrixCap00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class ColorspaceTransformMatrixV2(
    public var stageControlLookupTable1DDegamma: ColorspaceTransformStageControl = 0,
    public var lookupTable1DDegamma: List<GammaRampRgb> = List(4096) { GammaRampRgb() },
    public var stageControlColorMatrix3x3: ColorspaceTransformStageControl = 0,
    public var colorMatrix3x3: FloatArray = FloatArray(9),
    public var stageControlLookupTable1DRegamma: ColorspaceTransformStageControl = 0,
    public var lookupTable1DRegamma: List<GammaRampRgb> = List(4096) { GammaRampRgb() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ColorspaceTransformMatrixV2) return false
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
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ColorspaceTransformMatrixV2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ColorspaceTransformMatrixV2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 98352L
                override fun readNative(addr: Long): ColorspaceTransformMatrixV2 =
                    ColorspaceTransformMatrixV2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(GammaRampRgb.typeLayout(), (4096).toInt())
                        ).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 49156L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32, (9).toInt())
                        ).readNative(addr + 49160L).toFloatArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 49196L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(GammaRampRgb.typeLayout(), (4096).toInt())
                        ).readNative(addr + 49200L),
                    )
                override fun writeNative(addr: Long, value: ColorspaceTransformMatrixV2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.stageControlLookupTable1DDegamma)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(GammaRampRgb.typeLayout(), (4096).toInt())
                    ).writeNative(addr + 4L, value.lookupTable1DDegamma)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 49156L, value.stageControlColorMatrix3x3)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32, (9).toInt())
                    ).writeNative(addr + 49160L, value.colorMatrix3x3.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 49196L, value.stageControlLookupTable1DRegamma)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(GammaRampRgb.typeLayout(), (4096).toInt())
                    ).writeNative(addr + 49200L, value.lookupTable1DRegamma)
                }
            }
    }
}

public data class ColorspaceTransformSetInput(
    public var outputWireColorSpaceExpected: OutputWireColorSpaceType = 0,
    public var outputWireFormatExpected: OutputWireFormat = OutputWireFormat(),
    public var colorSpaceTransform: ColorspaceTransform = ColorspaceTransform(),
)

public data class ColorspaceTransformTargetCaps(
    public var version: ColorspaceTransformTargetCapsVersion = 0,
    public var lookupTable1DDegammaCap: ColorspaceTransform1dlutCap = ColorspaceTransform1dlutCap(),
    public var colorMatrix3x3Cap: ColorspaceTransformMatrixCap = ColorspaceTransformMatrixCap(),
    public var lookupTable1DRegammaCap: ColorspaceTransform1dlutCap = ColorspaceTransform1dlutCap(),
)

public class Devhtadjdata internal constructor(
    public var deviceFlags: UInt,
    public var deviceXDPI: UInt,
    public var deviceYDPI: UInt,
    pDefHTInfoCtorArg: MutPtr,
    pAdjHTInfoCtorArg: MutPtr,
) {
    public var pDefHTInfo: MutPtr = pDefHTInfoCtorArg
        internal set

    public var pAdjHTInfo: MutPtr = pAdjHTInfoCtorArg
        internal set

    public constructor() : this(
        deviceFlags = 0u,
        deviceXDPI = 0u,
        deviceYDPI = 0u,
        pDefHTInfoCtorArg = MutPtr(0L),
        pAdjHTInfoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.deviceFlags

    public operator fun component2(): UInt = this.deviceXDPI

    public operator fun component3(): UInt = this.deviceYDPI

    public operator fun component4(): MutPtr = this.pDefHTInfo

    public operator fun component5(): MutPtr = this.pAdjHTInfo

    public fun copy(deviceFlags: UInt = this.deviceFlags, deviceXDPI: UInt = this.deviceXDPI, deviceYDPI: UInt = this.deviceYDPI, pDefHTInfo: MutPtr = this.pDefHTInfo, pAdjHTInfo: MutPtr = this.pAdjHTInfo): Devhtadjdata = Devhtadjdata(deviceFlags = deviceFlags, deviceXDPI = deviceXDPI, deviceYDPI = deviceYDPI, pDefHTInfoCtorArg = pDefHTInfo, pAdjHTInfoCtorArg = pAdjHTInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Devhtadjdata) return false
        if (this.deviceFlags != other.deviceFlags) return false
        if (this.deviceXDPI != other.deviceXDPI) return false
        if (this.deviceYDPI != other.deviceYDPI) return false
        if (this.pDefHTInfo != other.pDefHTInfo) return false
        if (this.pAdjHTInfo != other.pAdjHTInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.deviceFlags.hashCode()
        result = 31 * result + this.deviceXDPI.hashCode()
        result = 31 * result + this.deviceYDPI.hashCode()
        result = 31 * result + this.pDefHTInfo.hashCode()
        result = 31 * result + this.pAdjHTInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Devhtadjdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Devhtadjdata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Devhtadjdata =
                    Devhtadjdata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Devhtadjdata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.deviceFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.deviceXDPI)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.deviceYDPI)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pDefHTInfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.pAdjHTInfo)
                }
            }

        public operator fun invoke(
            deviceFlags: UInt = 0u,
            deviceXDPI: UInt = 0u,
            deviceYDPI: UInt = 0u,
            pDefHTInfo: MutPtr = MutPtr(0L),
            pAdjHTInfo: MutPtr = MutPtr(0L),
        ): Devhtadjdata =
            Devhtadjdata(
                deviceFlags = deviceFlags,
                deviceXDPI = deviceXDPI,
                deviceYDPI = deviceYDPI,
                pDefHTInfoCtorArg = pDefHTInfo,
                pAdjHTInfoCtorArg = pAdjHTInfo,
            )
    }
}

public data class Devhtinfo(
    public var hTFlags: UInt = 0u,
    public var hTPatternSize: UInt = 0u,
    public var devPelsDPI: UInt = 0u,
    public var colorInfo: Colorinfo = Colorinfo(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Devhtinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Devhtinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 104L
                override fun readNative(addr: Long): Devhtinfo =
                    Devhtinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (Colorinfo.typeLayout()).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Devhtinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hTFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hTPatternSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.devPelsDPI)
                    (Colorinfo.typeLayout()).writeNative(addr + 12L, value.colorInfo)
                }
            }
    }
}

public class Devinfo internal constructor(
    public var flGraphicsCaps: UInt,
    public var lfDefaultFont: Logfontw,
    public var lfAnsiVarFont: Logfontw,
    public var lfAnsiFixFont: Logfontw,
    public var cFonts: UInt,
    public var iDitherFormat: UInt,
    public var cxDither: UShort,
    public var cyDither: UShort,
    hpalDefaultCtorArg: Hpalette,
    public var flGraphicsCaps2: UInt,
) {
    public var hpalDefault: Hpalette = hpalDefaultCtorArg
        internal set

    public constructor() : this(
        flGraphicsCaps = 0u,
        lfDefaultFont = Logfontw(),
        lfAnsiVarFont = Logfontw(),
        lfAnsiFixFont = Logfontw(),
        cFonts = 0u,
        iDitherFormat = 0u,
        cxDither = 0u,
        cyDither = 0u,
        hpalDefaultCtorArg = MutPtr(0L),
        flGraphicsCaps2 = 0u,
    )

    public operator fun component1(): UInt = this.flGraphicsCaps

    public operator fun component2(): Logfontw = this.lfDefaultFont

    public operator fun component3(): Logfontw = this.lfAnsiVarFont

    public operator fun component4(): Logfontw = this.lfAnsiFixFont

    public operator fun component5(): UInt = this.cFonts

    public operator fun component6(): UInt = this.iDitherFormat

    public operator fun component7(): UShort = this.cxDither

    public operator fun component8(): UShort = this.cyDither

    public operator fun component9(): Hpalette = this.hpalDefault

    public operator fun component10(): UInt = this.flGraphicsCaps2

    public fun copy(flGraphicsCaps: UInt = this.flGraphicsCaps, lfDefaultFont: Logfontw = this.lfDefaultFont, lfAnsiVarFont: Logfontw = this.lfAnsiVarFont, lfAnsiFixFont: Logfontw = this.lfAnsiFixFont, cFonts: UInt = this.cFonts, iDitherFormat: UInt = this.iDitherFormat, cxDither: UShort = this.cxDither, cyDither: UShort = this.cyDither, hpalDefault: Hpalette = this.hpalDefault, flGraphicsCaps2: UInt = this.flGraphicsCaps2): Devinfo = Devinfo(flGraphicsCaps = flGraphicsCaps, lfDefaultFont = lfDefaultFont, lfAnsiVarFont = lfAnsiVarFont, lfAnsiFixFont = lfAnsiFixFont, cFonts = cFonts, iDitherFormat = iDitherFormat, cxDither = cxDither, cyDither = cyDither, hpalDefaultCtorArg = hpalDefault, flGraphicsCaps2 = flGraphicsCaps2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Devinfo) return false
        if (this.flGraphicsCaps != other.flGraphicsCaps) return false
        if (this.lfDefaultFont != other.lfDefaultFont) return false
        if (this.lfAnsiVarFont != other.lfAnsiVarFont) return false
        if (this.lfAnsiFixFont != other.lfAnsiFixFont) return false
        if (this.cFonts != other.cFonts) return false
        if (this.iDitherFormat != other.iDitherFormat) return false
        if (this.cxDither != other.cxDither) return false
        if (this.cyDither != other.cyDither) return false
        if (this.hpalDefault != other.hpalDefault) return false
        if (this.flGraphicsCaps2 != other.flGraphicsCaps2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flGraphicsCaps.hashCode()
        result = 31 * result + this.lfDefaultFont.hashCode()
        result = 31 * result + this.lfAnsiVarFont.hashCode()
        result = 31 * result + this.lfAnsiFixFont.hashCode()
        result = 31 * result + this.cFonts.hashCode()
        result = 31 * result + this.iDitherFormat.hashCode()
        result = 31 * result + this.cxDither.hashCode()
        result = 31 * result + this.cyDither.hashCode()
        result = 31 * result + this.hpalDefault.hashCode()
        result = 31 * result + this.flGraphicsCaps2.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flGraphicsCaps: UInt = 0u,
            lfDefaultFont: Logfontw = Logfontw(),
            lfAnsiVarFont: Logfontw = Logfontw(),
            lfAnsiFixFont: Logfontw = Logfontw(),
            cFonts: UInt = 0u,
            iDitherFormat: UInt = 0u,
            cxDither: UShort = 0u,
            cyDither: UShort = 0u,
            hpalDefault: Hpalette = MutPtr(0L),
            flGraphicsCaps2: UInt = 0u,
        ): Devinfo =
            Devinfo(
                flGraphicsCaps = flGraphicsCaps,
                lfDefaultFont = lfDefaultFont,
                lfAnsiVarFont = lfAnsiVarFont,
                lfAnsiFixFont = lfAnsiFixFont,
                cFonts = cFonts,
                iDitherFormat = iDitherFormat,
                cxDither = cxDither,
                cyDither = cyDither,
                hpalDefaultCtorArg = hpalDefault,
                flGraphicsCaps2 = flGraphicsCaps2,
            )
    }
}

public data class Displayconfig2dregion(
    public var cx: UInt = 0u,
    public var cy: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Displayconfig2dregion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Displayconfig2dregion> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Displayconfig2dregion =
                    Displayconfig2dregion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Displayconfig2dregion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cy)
                }
            }
    }
}

public data class DisplayconfigAdapterName(
    public var header: DisplayconfigDeviceInfoHeader = DisplayconfigDeviceInfoHeader(),
    public var adapterDevicePath: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DisplayconfigAdapterName) return false
        if (this.header != other.header) return false
        if (!this.adapterDevicePath.contentEquals(other.adapterDevicePath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.adapterDevicePath.contentHashCode()
        return result
    }
}

public data class DisplayconfigDesktopImageInfo(
    public var pathSourceSize: Pointl = Pointl(),
    public var desktopImageRegion: Rectl = Rectl(),
    public var desktopImageClip: Rectl = Rectl(),
)

public data class DisplayconfigDeviceInfoHeader(
    public var type: DisplayconfigDeviceInfoType = 0,
    public var size: UInt = 0u,
    public var adapterId: Luid = Luid(),
    public var id: UInt = 0u,
)

public data class DisplayconfigGetAdvancedColorInfo(
    public var header: DisplayconfigDeviceInfoHeader = DisplayconfigDeviceInfoHeader(),
    public var anonymous: DisplayconfigGetAdvancedColorInfo0 = DisplayconfigGetAdvancedColorInfo0(),
    public var colorEncoding: DisplayconfigColorEncoding = 0,
    public var bitsPerColorChannel: UInt = 0u,
)

public data class DisplayconfigGetAdvancedColorInfo0(
    public var anonymous: DisplayconfigGetAdvancedColorInfo00 = DisplayconfigGetAdvancedColorInfo00(),
    public var value: UInt = 0u,
)

public data class DisplayconfigGetAdvancedColorInfo00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayconfigGetAdvancedColorInfo00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayconfigGetAdvancedColorInfo00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DisplayconfigGetAdvancedColorInfo00 =
                    DisplayconfigGetAdvancedColorInfo00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DisplayconfigGetAdvancedColorInfo00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DisplayconfigGetMonitorSpecialization(
    public var header: DisplayconfigDeviceInfoHeader = DisplayconfigDeviceInfoHeader(),
    public var anonymous: DisplayconfigGetMonitorSpecialization0 = DisplayconfigGetMonitorSpecialization0(),
)

public data class DisplayconfigGetMonitorSpecialization0(
    public var anonymous: DisplayconfigGetMonitorSpecialization00 = DisplayconfigGetMonitorSpecialization00(),
    public var value: UInt = 0u,
)

public data class DisplayconfigGetMonitorSpecialization00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayconfigGetMonitorSpecialization00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayconfigGetMonitorSpecialization00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DisplayconfigGetMonitorSpecialization00 =
                    DisplayconfigGetMonitorSpecialization00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DisplayconfigGetMonitorSpecialization00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DisplayconfigModeInfo(
    public var infoType: DisplayconfigModeInfoType = 0,
    public var id: UInt = 0u,
    public var adapterId: Luid = Luid(),
    public var anonymous: DisplayconfigModeInfo0 = DisplayconfigModeInfo0(),
)

public data class DisplayconfigModeInfo0(
    public var targetMode: DisplayconfigTargetMode = DisplayconfigTargetMode(),
    public var sourceMode: DisplayconfigSourceMode = DisplayconfigSourceMode(),
    public var desktopImageInfo: DisplayconfigDesktopImageInfo = DisplayconfigDesktopImageInfo(),
)

public data class DisplayconfigPathInfo(
    public var sourceInfo: DisplayconfigPathSourceInfo = DisplayconfigPathSourceInfo(),
    public var targetInfo: DisplayconfigPathTargetInfo = DisplayconfigPathTargetInfo(),
    public var flags: UInt = 0u,
)

public data class DisplayconfigPathSourceInfo(
    public var adapterId: Luid = Luid(),
    public var id: UInt = 0u,
    public var anonymous: DisplayconfigPathSourceInfo0 = DisplayconfigPathSourceInfo0(),
    public var statusFlags: UInt = 0u,
)

public data class DisplayconfigPathSourceInfo0(
    public var modeInfoIdx: UInt = 0u,
    public var anonymous: DisplayconfigPathSourceInfo00 = DisplayconfigPathSourceInfo00(),
)

public data class DisplayconfigPathSourceInfo00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayconfigPathSourceInfo00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayconfigPathSourceInfo00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DisplayconfigPathSourceInfo00 =
                    DisplayconfigPathSourceInfo00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DisplayconfigPathSourceInfo00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DisplayconfigPathTargetInfo(
    public var adapterId: Luid = Luid(),
    public var id: UInt = 0u,
    public var anonymous: DisplayconfigPathTargetInfo0 = DisplayconfigPathTargetInfo0(),
    public var outputTechnology: DisplayconfigVideoOutputTechnology = 0,
    public var rotation: DisplayconfigRotation = 0,
    public var scaling: DisplayconfigScaling = 0,
    public var refreshRate: DisplayconfigRational = DisplayconfigRational(),
    public var scanLineOrdering: DisplayconfigScanlineOrdering = 0,
    public var targetAvailable: Bool = 0,
    public var statusFlags: UInt = 0u,
)

public data class DisplayconfigPathTargetInfo0(
    public var modeInfoIdx: UInt = 0u,
    public var anonymous: DisplayconfigPathTargetInfo00 = DisplayconfigPathTargetInfo00(),
)

public data class DisplayconfigPathTargetInfo00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayconfigPathTargetInfo00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayconfigPathTargetInfo00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DisplayconfigPathTargetInfo00 =
                    DisplayconfigPathTargetInfo00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DisplayconfigPathTargetInfo00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DisplayconfigRational(
    public var numerator: UInt = 0u,
    public var denominator: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayconfigRational> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayconfigRational> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DisplayconfigRational =
                    DisplayconfigRational(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DisplayconfigRational) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numerator)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.denominator)
                }
            }
    }
}

public data class DisplayconfigSdrWhiteLevel(
    public var header: DisplayconfigDeviceInfoHeader = DisplayconfigDeviceInfoHeader(),
    public var sDRWhiteLevel: UInt = 0u,
)

public data class DisplayconfigSetAdvancedColorState(
    public var header: DisplayconfigDeviceInfoHeader = DisplayconfigDeviceInfoHeader(),
    public var anonymous: DisplayconfigSetAdvancedColorState0 = DisplayconfigSetAdvancedColorState0(),
)

public data class DisplayconfigSetAdvancedColorState0(
    public var anonymous: DisplayconfigSetAdvancedColorState00 = DisplayconfigSetAdvancedColorState00(),
    public var value: UInt = 0u,
)

public data class DisplayconfigSetAdvancedColorState00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayconfigSetAdvancedColorState00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayconfigSetAdvancedColorState00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DisplayconfigSetAdvancedColorState00 =
                    DisplayconfigSetAdvancedColorState00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DisplayconfigSetAdvancedColorState00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DisplayconfigSetMonitorSpecialization(
    public var header: DisplayconfigDeviceInfoHeader = DisplayconfigDeviceInfoHeader(),
    public var anonymous: DisplayconfigSetMonitorSpecialization0 = DisplayconfigSetMonitorSpecialization0(),
    public var specializationType: Guid = Guid(),
    public var specializationSubType: Guid = Guid(),
    public var specializationApplicationName: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DisplayconfigSetMonitorSpecialization) return false
        if (this.header != other.header) return false
        if (this.anonymous != other.anonymous) return false
        if (this.specializationType != other.specializationType) return false
        if (this.specializationSubType != other.specializationSubType) return false
        if (!this.specializationApplicationName.contentEquals(other.specializationApplicationName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.specializationType.hashCode()
        result = 31 * result + this.specializationSubType.hashCode()
        result = 31 * result + this.specializationApplicationName.contentHashCode()
        return result
    }
}

public data class DisplayconfigSetMonitorSpecialization0(
    public var anonymous: DisplayconfigSetMonitorSpecialization00 = DisplayconfigSetMonitorSpecialization00(),
    public var value: UInt = 0u,
)

public data class DisplayconfigSetMonitorSpecialization00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayconfigSetMonitorSpecialization00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayconfigSetMonitorSpecialization00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DisplayconfigSetMonitorSpecialization00 =
                    DisplayconfigSetMonitorSpecialization00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DisplayconfigSetMonitorSpecialization00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DisplayconfigSetTargetPersistence(
    public var header: DisplayconfigDeviceInfoHeader = DisplayconfigDeviceInfoHeader(),
    public var anonymous: DisplayconfigSetTargetPersistence0 = DisplayconfigSetTargetPersistence0(),
)

public data class DisplayconfigSetTargetPersistence0(
    public var anonymous: DisplayconfigSetTargetPersistence00 = DisplayconfigSetTargetPersistence00(),
    public var value: UInt = 0u,
)

public data class DisplayconfigSetTargetPersistence00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayconfigSetTargetPersistence00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayconfigSetTargetPersistence00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DisplayconfigSetTargetPersistence00 =
                    DisplayconfigSetTargetPersistence00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DisplayconfigSetTargetPersistence00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DisplayconfigSourceDeviceName(
    public var header: DisplayconfigDeviceInfoHeader = DisplayconfigDeviceInfoHeader(),
    public var viewGdiDeviceName: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DisplayconfigSourceDeviceName) return false
        if (this.header != other.header) return false
        if (!this.viewGdiDeviceName.contentEquals(other.viewGdiDeviceName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.viewGdiDeviceName.contentHashCode()
        return result
    }
}

public data class DisplayconfigSourceMode(
    public var width: UInt = 0u,
    public var height: UInt = 0u,
    public var pixelFormat: DisplayconfigPixelformat = 0,
    public var position: Pointl = Pointl(),
)

public data class DisplayconfigSupportVirtualResolution(
    public var header: DisplayconfigDeviceInfoHeader = DisplayconfigDeviceInfoHeader(),
    public var anonymous: DisplayconfigSupportVirtualResolution0 = DisplayconfigSupportVirtualResolution0(),
)

public data class DisplayconfigSupportVirtualResolution0(
    public var anonymous: DisplayconfigSupportVirtualResolution00 = DisplayconfigSupportVirtualResolution00(),
    public var value: UInt = 0u,
)

public data class DisplayconfigSupportVirtualResolution00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayconfigSupportVirtualResolution00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayconfigSupportVirtualResolution00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DisplayconfigSupportVirtualResolution00 =
                    DisplayconfigSupportVirtualResolution00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DisplayconfigSupportVirtualResolution00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DisplayconfigTargetBaseType(
    public var header: DisplayconfigDeviceInfoHeader = DisplayconfigDeviceInfoHeader(),
    public var baseOutputTechnology: DisplayconfigVideoOutputTechnology = 0,
)

public data class DisplayconfigTargetDeviceName(
    public var header: DisplayconfigDeviceInfoHeader = DisplayconfigDeviceInfoHeader(),
    public var flags: DisplayconfigTargetDeviceNameFlags = DisplayconfigTargetDeviceNameFlags(),
    public var outputTechnology: DisplayconfigVideoOutputTechnology = 0,
    public var edidManufactureId: UShort = 0u,
    public var edidProductCodeId: UShort = 0u,
    public var connectorInstance: UInt = 0u,
    public var monitorFriendlyDeviceName: UShortArray = UShortArray(64),
    public var monitorDevicePath: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DisplayconfigTargetDeviceName) return false
        if (this.header != other.header) return false
        if (this.flags != other.flags) return false
        if (this.outputTechnology != other.outputTechnology) return false
        if (this.edidManufactureId != other.edidManufactureId) return false
        if (this.edidProductCodeId != other.edidProductCodeId) return false
        if (this.connectorInstance != other.connectorInstance) return false
        if (!this.monitorFriendlyDeviceName.contentEquals(other.monitorFriendlyDeviceName)) return false
        if (!this.monitorDevicePath.contentEquals(other.monitorDevicePath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.outputTechnology.hashCode()
        result = 31 * result + this.edidManufactureId.hashCode()
        result = 31 * result + this.edidProductCodeId.hashCode()
        result = 31 * result + this.connectorInstance.hashCode()
        result = 31 * result + this.monitorFriendlyDeviceName.contentHashCode()
        result = 31 * result + this.monitorDevicePath.contentHashCode()
        return result
    }
}

public data class DisplayconfigTargetDeviceNameFlags(
    public var anonymous: DisplayconfigTargetDeviceNameFlags0 = DisplayconfigTargetDeviceNameFlags0(),
)

public data class DisplayconfigTargetDeviceNameFlags0(
    public var anonymous: DisplayconfigTargetDeviceNameFlags00 = DisplayconfigTargetDeviceNameFlags00(),
    public var value: UInt = 0u,
)

public data class DisplayconfigTargetDeviceNameFlags00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayconfigTargetDeviceNameFlags00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayconfigTargetDeviceNameFlags00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DisplayconfigTargetDeviceNameFlags00 =
                    DisplayconfigTargetDeviceNameFlags00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DisplayconfigTargetDeviceNameFlags00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DisplayconfigTargetMode(
    public var targetVideoSignalInfo: DisplayconfigVideoSignalInfo = DisplayconfigVideoSignalInfo(),
)

public data class DisplayconfigTargetPreferredMode(
    public var header: DisplayconfigDeviceInfoHeader = DisplayconfigDeviceInfoHeader(),
    public var width: UInt = 0u,
    public var height: UInt = 0u,
    public var targetMode: DisplayconfigTargetMode = DisplayconfigTargetMode(),
)

public data class DisplayconfigVideoSignalInfo(
    public var pixelRate: ULong = 0uL,
    public var hSyncFreq: DisplayconfigRational = DisplayconfigRational(),
    public var vSyncFreq: DisplayconfigRational = DisplayconfigRational(),
    public var activeSize: Displayconfig2dregion = Displayconfig2dregion(),
    public var totalSize: Displayconfig2dregion = Displayconfig2dregion(),
    public var anonymous: DisplayconfigVideoSignalInfo0 = DisplayconfigVideoSignalInfo0(),
    public var scanLineOrdering: DisplayconfigScanlineOrdering = 0,
)

public data class DisplayconfigVideoSignalInfo0(
    public var additionalSignalInfo: DisplayconfigVideoSignalInfo00 = DisplayconfigVideoSignalInfo00(),
    public var videoStandard: UInt = 0u,
)

public data class DisplayconfigVideoSignalInfo00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayconfigVideoSignalInfo00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayconfigVideoSignalInfo00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): DisplayconfigVideoSignalInfo00 =
                    DisplayconfigVideoSignalInfo00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: DisplayconfigVideoSignalInfo00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class DisplayBrightness(
    public var ucDisplayPolicy: UByte = 0u,
    public var ucACBrightness: UByte = 0u,
    public var ucDCBrightness: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayBrightness> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayBrightness> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 3L
                override fun readNative(addr: Long): DisplayBrightness =
                    DisplayBrightness(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: DisplayBrightness) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.ucDisplayPolicy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.ucACBrightness)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.ucDCBrightness)
                }
            }
    }
}

public class DrhApibitmapdata internal constructor(
    psoCtorArg: MutPtr,
    public var b: Bool,
) {
    public var pso: MutPtr = psoCtorArg
        internal set

    public constructor() : this(
        psoCtorArg = MutPtr(0L),
        b = 0,
    )

    public operator fun component1(): MutPtr = this.pso

    public operator fun component2(): Bool = this.b

    public fun copy(pso: MutPtr = this.pso, b: Bool = this.b): DrhApibitmapdata = DrhApibitmapdata(psoCtorArg = pso, b = b)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DrhApibitmapdata) return false
        if (this.pso != other.pso) return false
        if (this.b != other.b) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pso.hashCode()
        result = 31 * result + this.b.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrhApibitmapdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DrhApibitmapdata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DrhApibitmapdata =
                    DrhApibitmapdata(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DrhApibitmapdata) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.pso)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.b)
                }
            }

        public operator fun invoke(
            pso: MutPtr = MutPtr(0L),
            b: Bool = 0,
        ): DrhApibitmapdata =
            DrhApibitmapdata(
                psoCtorArg = pso,
                b = b,
            )
    }
}

public class Driverobj internal constructor(
    pvObjCtorArg: MutPtr,
    public var pFreeProc: Freeobjproc,
    hdevCtorArg: Hdev,
    dhpdevCtorArg: Dhpdev,
) {
    public var pvObj: MutPtr = pvObjCtorArg
        internal set

    public var hdev: Hdev = hdevCtorArg
        internal set

    public var dhpdev: Dhpdev = dhpdevCtorArg
        internal set

    public constructor() : this(
        pvObjCtorArg = MutPtr(0L),
        pFreeProc = null,
        hdevCtorArg = MutPtr(0L),
        dhpdevCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.pvObj

    public operator fun component2(): Freeobjproc = this.pFreeProc

    public operator fun component3(): Hdev = this.hdev

    public operator fun component4(): Dhpdev = this.dhpdev

    public fun copy(pvObj: MutPtr = this.pvObj, pFreeProc: Freeobjproc = this.pFreeProc, hdev: Hdev = this.hdev, dhpdev: Dhpdev = this.dhpdev): Driverobj = Driverobj(pvObjCtorArg = pvObj, pFreeProc = pFreeProc, hdevCtorArg = hdev, dhpdevCtorArg = dhpdev)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Driverobj) return false
        if (this.pvObj != other.pvObj) return false
        if (this.pFreeProc != other.pFreeProc) return false
        if (this.hdev != other.hdev) return false
        if (this.dhpdev != other.dhpdev) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pvObj.hashCode()
        result = 31 * result + this.pFreeProc.hashCode()
        result = 31 * result + this.hdev.hashCode()
        result = 31 * result + this.dhpdev.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pvObj: MutPtr = MutPtr(0L),
            pFreeProc: Freeobjproc = null,
            hdev: Hdev = MutPtr(0L),
            dhpdev: Dhpdev = MutPtr(0L),
        ): Driverobj =
            Driverobj(
                pvObjCtorArg = pvObj,
                pFreeProc = pFreeProc,
                hdevCtorArg = hdev,
                dhpdevCtorArg = dhpdev,
            )
    }
}

public class Drvenabledata internal constructor(
    public var iDriverVersion: UInt,
    public var c: UInt,
    pdrvfnCtorArg: MutPtr,
) {
    public var pdrvfn: MutPtr = pdrvfnCtorArg
        internal set

    public constructor() : this(
        iDriverVersion = 0u,
        c = 0u,
        pdrvfnCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.iDriverVersion

    public operator fun component2(): UInt = this.c

    public operator fun component3(): MutPtr = this.pdrvfn

    public fun copy(iDriverVersion: UInt = this.iDriverVersion, c: UInt = this.c, pdrvfn: MutPtr = this.pdrvfn): Drvenabledata = Drvenabledata(iDriverVersion = iDriverVersion, c = c, pdrvfnCtorArg = pdrvfn)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Drvenabledata) return false
        if (this.iDriverVersion != other.iDriverVersion) return false
        if (this.c != other.c) return false
        if (this.pdrvfn != other.pdrvfn) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.iDriverVersion.hashCode()
        result = 31 * result + this.c.hashCode()
        result = 31 * result + this.pdrvfn.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Drvenabledata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Drvenabledata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Drvenabledata =
                    Drvenabledata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Drvenabledata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.iDriverVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.c)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pdrvfn)
                }
            }

        public operator fun invoke(
            iDriverVersion: UInt = 0u,
            c: UInt = 0u,
            pdrvfn: MutPtr = MutPtr(0L),
        ): Drvenabledata =
            Drvenabledata(
                iDriverVersion = iDriverVersion,
                c = c,
                pdrvfnCtorArg = pdrvfn,
            )
    }
}

public data class Drvfn(
    public var iFunc: UInt = 0u,
    public var pfn: Pfn = null,
)

public class DxgkWin32kParamData internal constructor(
    pathsArrayCtorArg: MutPtr,
    modesArrayCtorArg: MutPtr,
    public var numPathArrayElements: UInt,
    public var numModeArrayElements: UInt,
    public var sDCFlags: UInt,
) {
    public var pathsArray: MutPtr = pathsArrayCtorArg
        internal set

    public var modesArray: MutPtr = modesArrayCtorArg
        internal set

    public constructor() : this(
        pathsArrayCtorArg = MutPtr(0L),
        modesArrayCtorArg = MutPtr(0L),
        numPathArrayElements = 0u,
        numModeArrayElements = 0u,
        sDCFlags = 0u,
    )

    public operator fun component1(): MutPtr = this.pathsArray

    public operator fun component2(): MutPtr = this.modesArray

    public operator fun component3(): UInt = this.numPathArrayElements

    public operator fun component4(): UInt = this.numModeArrayElements

    public operator fun component5(): UInt = this.sDCFlags

    public fun copy(pathsArray: MutPtr = this.pathsArray, modesArray: MutPtr = this.modesArray, numPathArrayElements: UInt = this.numPathArrayElements, numModeArrayElements: UInt = this.numModeArrayElements, sDCFlags: UInt = this.sDCFlags): DxgkWin32kParamData = DxgkWin32kParamData(pathsArrayCtorArg = pathsArray, modesArrayCtorArg = modesArray, numPathArrayElements = numPathArrayElements, numModeArrayElements = numModeArrayElements, sDCFlags = sDCFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DxgkWin32kParamData) return false
        if (this.pathsArray != other.pathsArray) return false
        if (this.modesArray != other.modesArray) return false
        if (this.numPathArrayElements != other.numPathArrayElements) return false
        if (this.numModeArrayElements != other.numModeArrayElements) return false
        if (this.sDCFlags != other.sDCFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pathsArray.hashCode()
        result = 31 * result + this.modesArray.hashCode()
        result = 31 * result + this.numPathArrayElements.hashCode()
        result = 31 * result + this.numModeArrayElements.hashCode()
        result = 31 * result + this.sDCFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkWin32kParamData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DxgkWin32kParamData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): DxgkWin32kParamData =
                    DxgkWin32kParamData(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: DxgkWin32kParamData) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.pathsArray)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.modesArray)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.numPathArrayElements)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.numModeArrayElements)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.sDCFlags)
                }
            }

        public operator fun invoke(
            pathsArray: MutPtr = MutPtr(0L),
            modesArray: MutPtr = MutPtr(0L),
            numPathArrayElements: UInt = 0u,
            numModeArrayElements: UInt = 0u,
            sDCFlags: UInt = 0u,
        ): DxgkWin32kParamData =
            DxgkWin32kParamData(
                pathsArrayCtorArg = pathsArray,
                modesArrayCtorArg = modesArray,
                numPathArrayElements = numPathArrayElements,
                numModeArrayElements = numModeArrayElements,
                sDCFlags = sDCFlags,
            )
    }
}

public data class DisplayMode(
    public var deviceName: UShortArray = UShortArray(32),
    public var devMode: Devmodew = Devmodew(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DisplayMode) return false
        if (!this.deviceName.contentEquals(other.deviceName)) return false
        if (this.devMode != other.devMode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.deviceName.contentHashCode()
        result = 31 * result + this.devMode.hashCode()
        return result
    }
}

public data class DisplayModes(
    public var numDisplayModes: Int = 0,
    public var displayMode: List<DisplayMode> = List(1) { DisplayMode() },
)

public class Emfinfo internal constructor(
    public var nSize: UInt,
    hdcCtorArg: Hdc,
    pvEMFCtorArg: MutPtr,
    pvCurrentRecordCtorArg: MutPtr,
) {
    public var hdc: Hdc = hdcCtorArg
        internal set

    public var pvEMF: MutPtr = pvEMFCtorArg
        internal set

    public var pvCurrentRecord: MutPtr = pvCurrentRecordCtorArg
        internal set

    public constructor() : this(
        nSize = 0u,
        hdcCtorArg = MutPtr(0L),
        pvEMFCtorArg = MutPtr(0L),
        pvCurrentRecordCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.nSize

    public operator fun component2(): Hdc = this.hdc

    public operator fun component3(): MutPtr = this.pvEMF

    public operator fun component4(): MutPtr = this.pvCurrentRecord

    public fun copy(nSize: UInt = this.nSize, hdc: Hdc = this.hdc, pvEMF: MutPtr = this.pvEMF, pvCurrentRecord: MutPtr = this.pvCurrentRecord): Emfinfo = Emfinfo(nSize = nSize, hdcCtorArg = hdc, pvEMFCtorArg = pvEMF, pvCurrentRecordCtorArg = pvCurrentRecord)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Emfinfo) return false
        if (this.nSize != other.nSize) return false
        if (this.hdc != other.hdc) return false
        if (this.pvEMF != other.pvEMF) return false
        if (this.pvCurrentRecord != other.pvCurrentRecord) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nSize.hashCode()
        result = 31 * result + this.hdc.hashCode()
        result = 31 * result + this.pvEMF.hashCode()
        result = 31 * result + this.pvCurrentRecord.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nSize: UInt = 0u,
            hdc: Hdc = MutPtr(0L),
            pvEMF: MutPtr = MutPtr(0L),
            pvCurrentRecord: MutPtr = MutPtr(0L),
        ): Emfinfo =
            Emfinfo(
                nSize = nSize,
                hdcCtorArg = hdc,
                pvEMFCtorArg = pvEMF,
                pvCurrentRecordCtorArg = pvCurrentRecord,
            )
    }
}

public class Engsafesemaphore internal constructor(
    hsemCtorArg: Hsemaphore,
    public var lCount: Int,
) {
    public var hsem: Hsemaphore = hsemCtorArg
        internal set

    public constructor() : this(
        hsemCtorArg = MutPtr(0L),
        lCount = 0,
    )

    public operator fun component1(): Hsemaphore = this.hsem

    public operator fun component2(): Int = this.lCount

    public fun copy(hsem: Hsemaphore = this.hsem, lCount: Int = this.lCount): Engsafesemaphore = Engsafesemaphore(hsemCtorArg = hsem, lCount = lCount)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Engsafesemaphore) return false
        if (this.hsem != other.hsem) return false
        if (this.lCount != other.lCount) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hsem.hashCode()
        result = 31 * result + this.lCount.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Engsafesemaphore> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Engsafesemaphore> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Engsafesemaphore =
                    Engsafesemaphore(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Engsafesemaphore) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.hsem)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.lCount)
                }
            }

        public operator fun invoke(
            hsem: Hsemaphore = MutPtr(0L),
            lCount: Int = 0,
        ): Engsafesemaphore =
            Engsafesemaphore(
                hsemCtorArg = hsem,
                lCount = lCount,
            )
    }
}

public class EngEvent internal constructor(
    pKEventCtorArg: MutPtr,
    public var fFlags: UInt,
) {
    public var pKEvent: MutPtr = pKEventCtorArg
        internal set

    public constructor() : this(
        pKEventCtorArg = MutPtr(0L),
        fFlags = 0u,
    )

    public operator fun component1(): MutPtr = this.pKEvent

    public operator fun component2(): UInt = this.fFlags

    public fun copy(pKEvent: MutPtr = this.pKEvent, fFlags: UInt = this.fFlags): EngEvent = EngEvent(pKEventCtorArg = pKEvent, fFlags = fFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EngEvent) return false
        if (this.pKEvent != other.pKEvent) return false
        if (this.fFlags != other.fFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pKEvent.hashCode()
        result = 31 * result + this.fFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EngEvent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EngEvent> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): EngEvent =
                    EngEvent(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: EngEvent) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.pKEvent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.fFlags)
                }
            }

        public operator fun invoke(
            pKEvent: MutPtr = MutPtr(0L),
            fFlags: UInt = 0u,
        ): EngEvent =
            EngEvent(
                pKEventCtorArg = pKEvent,
                fFlags = fFlags,
            )
    }
}

public data class EngTimeFields(
    public var usYear: UShort = 0u,
    public var usMonth: UShort = 0u,
    public var usDay: UShort = 0u,
    public var usHour: UShort = 0u,
    public var usMinute: UShort = 0u,
    public var usSecond: UShort = 0u,
    public var usMilliseconds: UShort = 0u,
    public var usWeekday: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EngTimeFields> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EngTimeFields> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): EngTimeFields =
                    EngTimeFields(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                    )
                override fun writeNative(addr: Long, value: EngTimeFields) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.usYear)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.usMonth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.usDay)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.usHour)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.usMinute)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.usSecond)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.usMilliseconds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.usWeekday)
                }
            }
    }
}

public data class Enumrects(
    public var c: UInt = 0u,
    public var arcl: List<Rectl> = List(1) { Rectl() },
)

public class FdDevicemetrics(
    public var flRealizedType: UInt = 0u,
    public var pteBase: Pointe = Pointe(),
    public var pteSide: Pointe = Pointe(),
    public var lD: Int = 0,
    public var fxMaxAscender: Int = 0,
    public var fxMaxDescender: Int = 0,
    public var ptlUnderline1: Pointl = Pointl(),
    public var ptlStrikeOut: Pointl = Pointl(),
    public var ptlULThickness: Pointl = Pointl(),
    public var ptlSOThickness: Pointl = Pointl(),
    public var cxMax: UInt = 0u,
    public var cyMax: UInt = 0u,
    public var cjGlyphMax: UInt = 0u,
    public var fdxQuantized: FdXform = FdXform(),
    public var lNonLinearExtLeading: Int = 0,
    public var lNonLinearIntLeading: Int = 0,
    public var lNonLinearMaxCharWidth: Int = 0,
    public var lNonLinearAvgCharWidth: Int = 0,
    public var lMinA: Int = 0,
    public var lMinC: Int = 0,
    public var lMinD: Int = 0,
    public var alReserved: IntArray = IntArray(1),
)

public data class FdGlyphattr(
    public var cjThis: UInt = 0u,
    public var cGlyphs: UInt = 0u,
    public var iMode: UInt = 0u,
    public var aGlyphAttr: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FdGlyphattr) return false
        if (this.cjThis != other.cjThis) return false
        if (this.cGlyphs != other.cGlyphs) return false
        if (this.iMode != other.iMode) return false
        if (!this.aGlyphAttr.contentEquals(other.aGlyphAttr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cjThis.hashCode()
        result = 31 * result + this.cGlyphs.hashCode()
        result = 31 * result + this.iMode.hashCode()
        result = 31 * result + this.aGlyphAttr.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FdGlyphattr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FdGlyphattr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): FdGlyphattr =
                    FdGlyphattr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: FdGlyphattr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cjThis)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cGlyphs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.iMode)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.aGlyphAttr.toList())
                }
            }
    }
}

public data class FdGlyphset(
    public var cjThis: UInt = 0u,
    public var flAccel: UInt = 0u,
    public var cGlyphsSupported: UInt = 0u,
    public var cRuns: UInt = 0u,
    public var awcrun: List<Wcrun> = List(1) { Wcrun() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FdGlyphset> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FdGlyphset> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): FdGlyphset =
                    FdGlyphset(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Wcrun.typeLayout(), (1).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: FdGlyphset) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cjThis)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flAccel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cGlyphsSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cRuns)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Wcrun.typeLayout(), (1).toInt())
                    ).writeNative(addr + 16L, value.awcrun)
                }
            }
    }
}

public data class FdKerningpair(
    public var wcFirst: UShort = 0u,
    public var wcSecond: UShort = 0u,
    public var fwdKern: Short = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FdKerningpair> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FdKerningpair> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): FdKerningpair =
                    FdKerningpair(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: FdKerningpair) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wcFirst)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wcSecond)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 4L, value.fwdKern)
                }
            }
    }
}

public data class FdLigature(
    public var culThis: UInt = 0u,
    public var ulType: UInt = 0u,
    public var cLigatures: UInt = 0u,
    public var alig: List<Ligature> = List(1) { Ligature() },
)

public data class FdXform(
    public var eXX: Float = 0.0f,
    public var eXY: Float = 0.0f,
    public var eYX: Float = 0.0f,
    public var eYY: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FdXform> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FdXform> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): FdXform =
                    FdXform(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: FdXform) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.eXX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.eXY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.eYX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 12L, value.eYY)
                }
            }
    }
}

public data class FloatobjXform(
    public var eM11: Float = 0.0f,
    public var eM12: Float = 0.0f,
    public var eM21: Float = 0.0f,
    public var eM22: Float = 0.0f,
    public var eDx: Float = 0.0f,
    public var eDy: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FloatobjXform> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FloatobjXform> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): FloatobjXform =
                    FloatobjXform(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: FloatobjXform) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.eM11)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.eM12)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.eM21)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 12L, value.eM22)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 16L, value.eDx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 20L, value.eDy)
                }
            }
    }
}

public data class FloatLong(
    public var e: Float = 0.0f,
    public var l: Int = 0,
)

public data class Fontdiff(
    public var jReserved1: UByte = 0u,
    public var jReserved2: UByte = 0u,
    public var jReserved3: UByte = 0u,
    public var bWeight: UByte = 0u,
    public var usWinWeight: UShort = 0u,
    public var fsSelection: UShort = 0u,
    public var fwdAveCharWidth: Short = 0,
    public var fwdMaxCharInc: Short = 0,
    public var ptlCaret: Pointl = Pointl(),
)

public data class Fontinfo(
    public var cjThis: UInt = 0u,
    public var flCaps: UInt = 0u,
    public var cGlyphsSupported: UInt = 0u,
    public var cjMaxGlyph1: UInt = 0u,
    public var cjMaxGlyph4: UInt = 0u,
    public var cjMaxGlyph8: UInt = 0u,
    public var cjMaxGlyph32: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Fontinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Fontinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): Fontinfo =
                    Fontinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Fontinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cjThis)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flCaps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cGlyphsSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cjMaxGlyph1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cjMaxGlyph4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cjMaxGlyph8)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cjMaxGlyph32)
                }
            }
    }
}

public class Fontobj internal constructor(
    public var iUniq: UInt,
    public var iFace: UInt,
    public var cxMax: UInt,
    public var flFontType: UInt,
    public var iTTUniq: Int,
    public var iFile: Int,
    public var sizLogResPpi: Size,
    public var ulStyleSize: UInt,
    pvConsumerCtorArg: MutPtr,
    pvProducerCtorArg: MutPtr,
) {
    public var pvConsumer: MutPtr = pvConsumerCtorArg
        internal set

    public var pvProducer: MutPtr = pvProducerCtorArg
        internal set

    public constructor() : this(
        iUniq = 0u,
        iFace = 0u,
        cxMax = 0u,
        flFontType = 0u,
        iTTUniq = 0,
        iFile = 0,
        sizLogResPpi = Size(),
        ulStyleSize = 0u,
        pvConsumerCtorArg = MutPtr(0L),
        pvProducerCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.iUniq

    public operator fun component2(): UInt = this.iFace

    public operator fun component3(): UInt = this.cxMax

    public operator fun component4(): UInt = this.flFontType

    public operator fun component5(): Int = this.iTTUniq

    public operator fun component6(): Int = this.iFile

    public operator fun component7(): Size = this.sizLogResPpi

    public operator fun component8(): UInt = this.ulStyleSize

    public operator fun component9(): MutPtr = this.pvConsumer

    public operator fun component10(): MutPtr = this.pvProducer

    public fun copy(iUniq: UInt = this.iUniq, iFace: UInt = this.iFace, cxMax: UInt = this.cxMax, flFontType: UInt = this.flFontType, iTTUniq: Int = this.iTTUniq, iFile: Int = this.iFile, sizLogResPpi: Size = this.sizLogResPpi, ulStyleSize: UInt = this.ulStyleSize, pvConsumer: MutPtr = this.pvConsumer, pvProducer: MutPtr = this.pvProducer): Fontobj = Fontobj(iUniq = iUniq, iFace = iFace, cxMax = cxMax, flFontType = flFontType, iTTUniq = iTTUniq, iFile = iFile, sizLogResPpi = sizLogResPpi, ulStyleSize = ulStyleSize, pvConsumerCtorArg = pvConsumer, pvProducerCtorArg = pvProducer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Fontobj) return false
        if (this.iUniq != other.iUniq) return false
        if (this.iFace != other.iFace) return false
        if (this.cxMax != other.cxMax) return false
        if (this.flFontType != other.flFontType) return false
        if (this.iTTUniq != other.iTTUniq) return false
        if (this.iFile != other.iFile) return false
        if (this.sizLogResPpi != other.sizLogResPpi) return false
        if (this.ulStyleSize != other.ulStyleSize) return false
        if (this.pvConsumer != other.pvConsumer) return false
        if (this.pvProducer != other.pvProducer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.iUniq.hashCode()
        result = 31 * result + this.iFace.hashCode()
        result = 31 * result + this.cxMax.hashCode()
        result = 31 * result + this.flFontType.hashCode()
        result = 31 * result + this.iTTUniq.hashCode()
        result = 31 * result + this.iFile.hashCode()
        result = 31 * result + this.sizLogResPpi.hashCode()
        result = 31 * result + this.ulStyleSize.hashCode()
        result = 31 * result + this.pvConsumer.hashCode()
        result = 31 * result + this.pvProducer.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            iUniq: UInt = 0u,
            iFace: UInt = 0u,
            cxMax: UInt = 0u,
            flFontType: UInt = 0u,
            iTTUniq: Int = 0,
            iFile: Int = 0,
            sizLogResPpi: Size = Size(),
            ulStyleSize: UInt = 0u,
            pvConsumer: MutPtr = MutPtr(0L),
            pvProducer: MutPtr = MutPtr(0L),
        ): Fontobj =
            Fontobj(
                iUniq = iUniq,
                iFace = iFace,
                cxMax = cxMax,
                flFontType = flFontType,
                iTTUniq = iTTUniq,
                iFile = iFile,
                sizLogResPpi = sizLogResPpi,
                ulStyleSize = ulStyleSize,
                pvConsumerCtorArg = pvConsumer,
                pvProducerCtorArg = pvProducer,
            )
    }
}

public data class Fontsim(
    public var dpBold: Int = 0,
    public var dpItalic: Int = 0,
    public var dpBoldItalic: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Fontsim> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Fontsim> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Fontsim =
                    Fontsim(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Fontsim) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.dpBold)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.dpItalic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.dpBoldItalic)
                }
            }
    }
}

public class FontImageInfo internal constructor(
    public var fontSize: Coord,
    imageBitsCtorArg: MutPtr,
) {
    public var imageBits: MutPtr = imageBitsCtorArg
        internal set

    public constructor() : this(
        fontSize = Coord(),
        imageBitsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Coord = this.fontSize

    public operator fun component2(): MutPtr = this.imageBits

    public fun copy(fontSize: Coord = this.fontSize, imageBits: MutPtr = this.imageBits): FontImageInfo = FontImageInfo(fontSize = fontSize, imageBitsCtorArg = imageBits)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FontImageInfo) return false
        if (this.fontSize != other.fontSize) return false
        if (this.imageBits != other.imageBits) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fontSize.hashCode()
        result = 31 * result + this.imageBits.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fontSize: Coord = Coord(),
            imageBits: MutPtr = MutPtr(0L),
        ): FontImageInfo =
            FontImageInfo(
                fontSize = fontSize,
                imageBitsCtorArg = imageBits,
            )
    }
}

public data class FscntlScreenInfo(
    public var position: Coord = Coord(),
    public var screenSize: Coord = Coord(),
    public var nNumberOfChars: UInt = 0u,
)

public data class FsvideoCopyFrameBuffer(
    public var srcScreen: FscntlScreenInfo = FscntlScreenInfo(),
    public var destScreen: FscntlScreenInfo = FscntlScreenInfo(),
)

public data class FsvideoCursorPosition(
    public var coord: VideoCursorPosition = VideoCursorPosition(),
    public var dwType: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsvideoCursorPosition> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsvideoCursorPosition> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): FsvideoCursorPosition =
                    FsvideoCursorPosition(
                        (VideoCursorPosition.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: FsvideoCursorPosition) {
                    (VideoCursorPosition.typeLayout()).writeNative(addr, value.coord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwType)
                }
            }
    }
}

public data class FsvideoModeInformation(
    public var videoMode: VideoModeInformation = VideoModeInformation(),
    public var videoMemory: VideoMemoryInformation = VideoMemoryInformation(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsvideoModeInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FsvideoModeInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 112L
                override fun readNative(addr: Long): FsvideoModeInformation =
                    FsvideoModeInformation(
                        (VideoModeInformation.typeLayout()).readNative(addr),
                        (VideoMemoryInformation.typeLayout()).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: FsvideoModeInformation) {
                    (VideoModeInformation.typeLayout()).writeNative(addr, value.videoMode)
                    (VideoMemoryInformation.typeLayout()).writeNative(addr + 80L, value.videoMemory)
                }
            }
    }
}

public data class FsvideoReverseMousePointer(
    public var screen: FscntlScreenInfo = FscntlScreenInfo(),
    public var dwType: UInt = 0u,
)

public data class FsvideoScreenInformation(
    public var screenSize: Coord = Coord(),
    public var fontSize: Coord = Coord(),
)

public class FsvideoWriteToFrameBuffer internal constructor(
    srcBufferCtorArg: MutPtr,
    public var destScreen: FscntlScreenInfo,
) {
    public var srcBuffer: MutPtr = srcBufferCtorArg
        internal set

    public constructor() : this(
        srcBufferCtorArg = MutPtr(0L),
        destScreen = FscntlScreenInfo(),
    )

    public operator fun component1(): MutPtr = this.srcBuffer

    public operator fun component2(): FscntlScreenInfo = this.destScreen

    public fun copy(srcBuffer: MutPtr = this.srcBuffer, destScreen: FscntlScreenInfo = this.destScreen): FsvideoWriteToFrameBuffer = FsvideoWriteToFrameBuffer(srcBufferCtorArg = srcBuffer, destScreen = destScreen)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FsvideoWriteToFrameBuffer) return false
        if (this.srcBuffer != other.srcBuffer) return false
        if (this.destScreen != other.destScreen) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.srcBuffer.hashCode()
        result = 31 * result + this.destScreen.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            srcBuffer: MutPtr = MutPtr(0L),
            destScreen: FscntlScreenInfo = FscntlScreenInfo(),
        ): FsvideoWriteToFrameBuffer =
            FsvideoWriteToFrameBuffer(
                srcBufferCtorArg = srcBuffer,
                destScreen = destScreen,
            )
    }
}

public data class Gammaramp(
    public var red: UShortArray = UShortArray(256),
    public var green: UShortArray = UShortArray(256),
    public var blue: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Gammaramp) return false
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
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Gammaramp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Gammaramp> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 1536L
                override fun readNative(addr: Long): Gammaramp =
                    Gammaramp(
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
                override fun writeNative(addr: Long, value: Gammaramp) {
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

public data class GammaRampDxgi1(
    public var scale: GammaRampRgb = GammaRampRgb(),
    public var offset: GammaRampRgb = GammaRampRgb(),
    public var gammaCurve: List<GammaRampRgb> = List(1025) { GammaRampRgb() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GammaRampDxgi1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GammaRampDxgi1> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12324L
                override fun readNative(addr: Long): GammaRampDxgi1 =
                    GammaRampDxgi1(
                        (GammaRampRgb.typeLayout()).readNative(addr),
                        (GammaRampRgb.typeLayout()).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(GammaRampRgb.typeLayout(), (1025).toInt())
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: GammaRampDxgi1) {
                    (GammaRampRgb.typeLayout()).writeNative(addr, value.scale)
                    (GammaRampRgb.typeLayout()).writeNative(addr + 12L, value.offset)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(GammaRampRgb.typeLayout(), (1025).toInt())
                    ).writeNative(addr + 24L, value.gammaCurve)
                }
            }
    }
}

public data class GammaRampRgb(
    public var red: Float = 0.0f,
    public var green: Float = 0.0f,
    public var blue: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GammaRampRgb> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GammaRampRgb> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): GammaRampRgb =
                    GammaRampRgb(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: GammaRampRgb) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.red)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.green)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.blue)
                }
            }
    }
}

public data class GammaRampRgb256x3x16(
    public var red: UShortArray = UShortArray(256),
    public var green: UShortArray = UShortArray(256),
    public var blue: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GammaRampRgb256x3x16) return false
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
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GammaRampRgb256x3x16> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GammaRampRgb256x3x16> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 1536L
                override fun readNative(addr: Long): GammaRampRgb256x3x16 =
                    GammaRampRgb256x3x16(
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
                override fun writeNative(addr: Long, value: GammaRampRgb256x3x16) {
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

public class Gdiinfo internal constructor(
    public var ulVersion: UInt,
    public var ulTechnology: UInt,
    public var ulHorzSize: UInt,
    public var ulVertSize: UInt,
    public var ulHorzRes: UInt,
    public var ulVertRes: UInt,
    public var cBitsPixel: UInt,
    public var cPlanes: UInt,
    public var ulNumColors: UInt,
    public var flRaster: UInt,
    public var ulLogPixelsX: UInt,
    public var ulLogPixelsY: UInt,
    public var flTextCaps: UInt,
    public var ulDACRed: UInt,
    public var ulDACGreen: UInt,
    public var ulDACBlue: UInt,
    public var ulAspectX: UInt,
    public var ulAspectY: UInt,
    public var ulAspectXY: UInt,
    public var xStyleStep: Int,
    public var yStyleStep: Int,
    public var denStyleStep: Int,
    public var ptlPhysOffset: Pointl,
    public var szlPhysSize: Size,
    public var ulNumPalReg: UInt,
    public var ciDevice: Colorinfo,
    public var ulDevicePelsDPI: UInt,
    public var ulPrimaryOrder: UInt,
    public var ulHTPatternSize: UInt,
    public var ulHTOutputFormat: UInt,
    public var flHTFlags: UInt,
    public var ulVRefresh: UInt,
    public var ulBltAlignment: UInt,
    public var ulPanningHorzRes: UInt,
    public var ulPanningVertRes: UInt,
    public var xPanningAlignment: UInt,
    public var yPanningAlignment: UInt,
    public var cxHTPat: UInt,
    public var cyHTPat: UInt,
    pHTPatACtorArg: MutPtr,
    pHTPatBCtorArg: MutPtr,
    pHTPatCCtorArg: MutPtr,
    public var flShadeBlend: UInt,
    public var ulPhysicalPixelCharacteristics: UInt,
    public var ulPhysicalPixelGamma: UInt,
) {
    public var pHTPatA: MutPtr = pHTPatACtorArg
        internal set

    public var pHTPatB: MutPtr = pHTPatBCtorArg
        internal set

    public var pHTPatC: MutPtr = pHTPatCCtorArg
        internal set

    public constructor() : this(
        ulVersion = 0u,
        ulTechnology = 0u,
        ulHorzSize = 0u,
        ulVertSize = 0u,
        ulHorzRes = 0u,
        ulVertRes = 0u,
        cBitsPixel = 0u,
        cPlanes = 0u,
        ulNumColors = 0u,
        flRaster = 0u,
        ulLogPixelsX = 0u,
        ulLogPixelsY = 0u,
        flTextCaps = 0u,
        ulDACRed = 0u,
        ulDACGreen = 0u,
        ulDACBlue = 0u,
        ulAspectX = 0u,
        ulAspectY = 0u,
        ulAspectXY = 0u,
        xStyleStep = 0,
        yStyleStep = 0,
        denStyleStep = 0,
        ptlPhysOffset = Pointl(),
        szlPhysSize = Size(),
        ulNumPalReg = 0u,
        ciDevice = Colorinfo(),
        ulDevicePelsDPI = 0u,
        ulPrimaryOrder = 0u,
        ulHTPatternSize = 0u,
        ulHTOutputFormat = 0u,
        flHTFlags = 0u,
        ulVRefresh = 0u,
        ulBltAlignment = 0u,
        ulPanningHorzRes = 0u,
        ulPanningVertRes = 0u,
        xPanningAlignment = 0u,
        yPanningAlignment = 0u,
        cxHTPat = 0u,
        cyHTPat = 0u,
        pHTPatACtorArg = MutPtr(0L),
        pHTPatBCtorArg = MutPtr(0L),
        pHTPatCCtorArg = MutPtr(0L),
        flShadeBlend = 0u,
        ulPhysicalPixelCharacteristics = 0u,
        ulPhysicalPixelGamma = 0u,
    )

    public companion object {
        public operator fun invoke(
            ulVersion: UInt = 0u,
            ulTechnology: UInt = 0u,
            ulHorzSize: UInt = 0u,
            ulVertSize: UInt = 0u,
            ulHorzRes: UInt = 0u,
            ulVertRes: UInt = 0u,
            cBitsPixel: UInt = 0u,
            cPlanes: UInt = 0u,
            ulNumColors: UInt = 0u,
            flRaster: UInt = 0u,
            ulLogPixelsX: UInt = 0u,
            ulLogPixelsY: UInt = 0u,
            flTextCaps: UInt = 0u,
            ulDACRed: UInt = 0u,
            ulDACGreen: UInt = 0u,
            ulDACBlue: UInt = 0u,
            ulAspectX: UInt = 0u,
            ulAspectY: UInt = 0u,
            ulAspectXY: UInt = 0u,
            xStyleStep: Int = 0,
            yStyleStep: Int = 0,
            denStyleStep: Int = 0,
            ptlPhysOffset: Pointl = Pointl(),
            szlPhysSize: Size = Size(),
            ulNumPalReg: UInt = 0u,
            ciDevice: Colorinfo = Colorinfo(),
            ulDevicePelsDPI: UInt = 0u,
            ulPrimaryOrder: UInt = 0u,
            ulHTPatternSize: UInt = 0u,
            ulHTOutputFormat: UInt = 0u,
            flHTFlags: UInt = 0u,
            ulVRefresh: UInt = 0u,
            ulBltAlignment: UInt = 0u,
            ulPanningHorzRes: UInt = 0u,
            ulPanningVertRes: UInt = 0u,
            xPanningAlignment: UInt = 0u,
            yPanningAlignment: UInt = 0u,
            cxHTPat: UInt = 0u,
            cyHTPat: UInt = 0u,
            pHTPatA: MutPtr = MutPtr(0L),
            pHTPatB: MutPtr = MutPtr(0L),
            pHTPatC: MutPtr = MutPtr(0L),
            flShadeBlend: UInt = 0u,
            ulPhysicalPixelCharacteristics: UInt = 0u,
            ulPhysicalPixelGamma: UInt = 0u,
        ): Gdiinfo =
            Gdiinfo(
                ulVersion = ulVersion,
                ulTechnology = ulTechnology,
                ulHorzSize = ulHorzSize,
                ulVertSize = ulVertSize,
                ulHorzRes = ulHorzRes,
                ulVertRes = ulVertRes,
                cBitsPixel = cBitsPixel,
                cPlanes = cPlanes,
                ulNumColors = ulNumColors,
                flRaster = flRaster,
                ulLogPixelsX = ulLogPixelsX,
                ulLogPixelsY = ulLogPixelsY,
                flTextCaps = flTextCaps,
                ulDACRed = ulDACRed,
                ulDACGreen = ulDACGreen,
                ulDACBlue = ulDACBlue,
                ulAspectX = ulAspectX,
                ulAspectY = ulAspectY,
                ulAspectXY = ulAspectXY,
                xStyleStep = xStyleStep,
                yStyleStep = yStyleStep,
                denStyleStep = denStyleStep,
                ptlPhysOffset = ptlPhysOffset,
                szlPhysSize = szlPhysSize,
                ulNumPalReg = ulNumPalReg,
                ciDevice = ciDevice,
                ulDevicePelsDPI = ulDevicePelsDPI,
                ulPrimaryOrder = ulPrimaryOrder,
                ulHTPatternSize = ulHTPatternSize,
                ulHTOutputFormat = ulHTOutputFormat,
                flHTFlags = flHTFlags,
                ulVRefresh = ulVRefresh,
                ulBltAlignment = ulBltAlignment,
                ulPanningHorzRes = ulPanningHorzRes,
                ulPanningVertRes = ulPanningVertRes,
                xPanningAlignment = xPanningAlignment,
                yPanningAlignment = yPanningAlignment,
                cxHTPat = cxHTPat,
                cyHTPat = cyHTPat,
                pHTPatACtorArg = pHTPatA,
                pHTPatBCtorArg = pHTPatB,
                pHTPatCCtorArg = pHTPatC,
                flShadeBlend = flShadeBlend,
                ulPhysicalPixelCharacteristics = ulPhysicalPixelCharacteristics,
                ulPhysicalPixelGamma = ulPhysicalPixelGamma,
            )
    }
}

public data class Glyphbits(
    public var ptlOrigin: Pointl = Pointl(),
    public var sizlBitmap: Size = Size(),
    public var aj: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Glyphbits) return false
        if (this.ptlOrigin != other.ptlOrigin) return false
        if (this.sizlBitmap != other.sizlBitmap) return false
        if (!this.aj.contentEquals(other.aj)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ptlOrigin.hashCode()
        result = 31 * result + this.sizlBitmap.hashCode()
        result = 31 * result + this.aj.contentHashCode()
        return result
    }
}

public data class Glyphdata(
    public var gdf: Glyphdef = Glyphdef(),
    public var hg: UInt = 0u,
    public var fxD: Int = 0,
    public var fxA: Int = 0,
    public var fxAB: Int = 0,
    public var fxInkTop: Int = 0,
    public var fxInkBottom: Int = 0,
    public var rclInk: Rectl = Rectl(),
    public var ptqD: Pointqf = Pointqf(),
)

public class Glyphdef internal constructor(
    pgbCtorArg: MutPtr,
    ppoCtorArg: MutPtr,
) {
    public var pgb: MutPtr = pgbCtorArg
        internal set

    public var ppo: MutPtr = ppoCtorArg
        internal set

    public constructor() : this(
        pgbCtorArg = MutPtr(0L),
        ppoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.pgb

    public operator fun component2(): MutPtr = this.ppo

    public fun copy(pgb: MutPtr = this.pgb, ppo: MutPtr = this.ppo): Glyphdef = Glyphdef(pgbCtorArg = pgb, ppoCtorArg = ppo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Glyphdef) return false
        if (this.pgb != other.pgb) return false
        if (this.ppo != other.ppo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pgb.hashCode()
        result = 31 * result + this.ppo.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pgb: MutPtr = MutPtr(0L),
            ppo: MutPtr = MutPtr(0L),
        ): Glyphdef =
            Glyphdef(
                pgbCtorArg = pgb,
                ppoCtorArg = ppo,
            )
    }
}

public class Glyphpos internal constructor(
    public var hg: UInt,
    pgdfCtorArg: MutPtr,
    public var ptl: Pointl,
) {
    public var pgdf: MutPtr = pgdfCtorArg
        internal set

    public constructor() : this(
        hg = 0u,
        pgdfCtorArg = MutPtr(0L),
        ptl = Pointl(),
    )

    public operator fun component1(): UInt = this.hg

    public operator fun component2(): MutPtr = this.pgdf

    public operator fun component3(): Pointl = this.ptl

    public fun copy(hg: UInt = this.hg, pgdf: MutPtr = this.pgdf, ptl: Pointl = this.ptl): Glyphpos = Glyphpos(hg = hg, pgdfCtorArg = pgdf, ptl = ptl)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Glyphpos) return false
        if (this.hg != other.hg) return false
        if (this.pgdf != other.pgdf) return false
        if (this.ptl != other.ptl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hg.hashCode()
        result = 31 * result + this.pgdf.hashCode()
        result = 31 * result + this.ptl.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hg: UInt = 0u,
            pgdf: MutPtr = MutPtr(0L),
            ptl: Pointl = Pointl(),
        ): Glyphpos =
            Glyphpos(
                hg = hg,
                pgdfCtorArg = pgdf,
                ptl = ptl,
            )
    }
}

public data class Ifiextra(
    public var ulIdentifier: UInt = 0u,
    public var dpFontSig: Int = 0,
    public var cig: UInt = 0u,
    public var dpDesignVector: Int = 0,
    public var dpAxesInfoW: Int = 0,
    public var aulReserved: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ifiextra) return false
        if (this.ulIdentifier != other.ulIdentifier) return false
        if (this.dpFontSig != other.dpFontSig) return false
        if (this.cig != other.cig) return false
        if (this.dpDesignVector != other.dpDesignVector) return false
        if (this.dpAxesInfoW != other.dpAxesInfoW) return false
        if (!this.aulReserved.contentEquals(other.aulReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulIdentifier.hashCode()
        result = 31 * result + this.dpFontSig.hashCode()
        result = 31 * result + this.cig.hashCode()
        result = 31 * result + this.dpDesignVector.hashCode()
        result = 31 * result + this.dpAxesInfoW.hashCode()
        result = 31 * result + this.aulReserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ifiextra> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ifiextra> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Ifiextra =
                    Ifiextra(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 20L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: Ifiextra) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulIdentifier)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.dpFontSig)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cig)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.dpDesignVector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.dpAxesInfoW)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 20L, value.aulReserved.toList())
                }
            }
    }
}

public class Ifimetrics internal constructor(
    public var cjThis: UInt,
    public var cjIfiExtra: UInt,
    public var dpwszFamilyName: Int,
    public var dpwszStyleName: Int,
    public var dpwszFaceName: Int,
    public var dpwszUniqueName: Int,
    public var dpFontSim: Int,
    public var lEmbedId: Int,
    public var lItalicAngle: Int,
    public var lCharBias: Int,
    public var dpCharSets: Int,
    public var jWinCharSet: UByte,
    public var jWinPitchAndFamily: UByte,
    public var usWinWeight: UShort,
    public var flInfo: UInt,
    public var fsSelection: UShort,
    public var fsType: UShort,
    public var fwdUnitsPerEm: Short,
    public var fwdLowestPPEm: Short,
    public var fwdWinAscender: Short,
    public var fwdWinDescender: Short,
    public var fwdMacAscender: Short,
    public var fwdMacDescender: Short,
    public var fwdMacLineGap: Short,
    public var fwdTypoAscender: Short,
    public var fwdTypoDescender: Short,
    public var fwdTypoLineGap: Short,
    public var fwdAveCharWidth: Short,
    public var fwdMaxCharInc: Short,
    public var fwdCapHeight: Short,
    public var fwdXHeight: Short,
    public var fwdSubscriptXSize: Short,
    public var fwdSubscriptYSize: Short,
    public var fwdSubscriptXOffset: Short,
    public var fwdSubscriptYOffset: Short,
    public var fwdSuperscriptXSize: Short,
    public var fwdSuperscriptYSize: Short,
    public var fwdSuperscriptXOffset: Short,
    public var fwdSuperscriptYOffset: Short,
    public var fwdUnderscoreSize: Short,
    public var fwdUnderscorePosition: Short,
    public var fwdStrikeoutSize: Short,
    public var fwdStrikeoutPosition: Short,
    public var chFirstChar: UByte,
    public var chLastChar: UByte,
    public var chDefaultChar: UByte,
    public var chBreakChar: UByte,
    public var wcFirstChar: UShort,
    public var wcLastChar: UShort,
    public var wcDefaultChar: UShort,
    public var wcBreakChar: UShort,
    public var ptlBaseline: Pointl,
    public var ptlAspect: Pointl,
    public var ptlCaret: Pointl,
    public var rclFontBox: Rectl,
    public var achVendId: UByteArray,
    public var cKerningPairs: UInt,
    public var ulPanoseCulture: UInt,
    public var panose: Panose,
    alignCtorArg: MutPtr,
) {
    public var align: MutPtr = alignCtorArg
        internal set

    public constructor() : this(
        cjThis = 0u,
        cjIfiExtra = 0u,
        dpwszFamilyName = 0,
        dpwszStyleName = 0,
        dpwszFaceName = 0,
        dpwszUniqueName = 0,
        dpFontSim = 0,
        lEmbedId = 0,
        lItalicAngle = 0,
        lCharBias = 0,
        dpCharSets = 0,
        jWinCharSet = 0u,
        jWinPitchAndFamily = 0u,
        usWinWeight = 0u,
        flInfo = 0u,
        fsSelection = 0u,
        fsType = 0u,
        fwdUnitsPerEm = 0,
        fwdLowestPPEm = 0,
        fwdWinAscender = 0,
        fwdWinDescender = 0,
        fwdMacAscender = 0,
        fwdMacDescender = 0,
        fwdMacLineGap = 0,
        fwdTypoAscender = 0,
        fwdTypoDescender = 0,
        fwdTypoLineGap = 0,
        fwdAveCharWidth = 0,
        fwdMaxCharInc = 0,
        fwdCapHeight = 0,
        fwdXHeight = 0,
        fwdSubscriptXSize = 0,
        fwdSubscriptYSize = 0,
        fwdSubscriptXOffset = 0,
        fwdSubscriptYOffset = 0,
        fwdSuperscriptXSize = 0,
        fwdSuperscriptYSize = 0,
        fwdSuperscriptXOffset = 0,
        fwdSuperscriptYOffset = 0,
        fwdUnderscoreSize = 0,
        fwdUnderscorePosition = 0,
        fwdStrikeoutSize = 0,
        fwdStrikeoutPosition = 0,
        chFirstChar = 0u,
        chLastChar = 0u,
        chDefaultChar = 0u,
        chBreakChar = 0u,
        wcFirstChar = 0u,
        wcLastChar = 0u,
        wcDefaultChar = 0u,
        wcBreakChar = 0u,
        ptlBaseline = Pointl(),
        ptlAspect = Pointl(),
        ptlCaret = Pointl(),
        rclFontBox = Rectl(),
        achVendId = UByteArray(4),
        cKerningPairs = 0u,
        ulPanoseCulture = 0u,
        panose = Panose(),
        alignCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            cjThis: UInt = 0u,
            cjIfiExtra: UInt = 0u,
            dpwszFamilyName: Int = 0,
            dpwszStyleName: Int = 0,
            dpwszFaceName: Int = 0,
            dpwszUniqueName: Int = 0,
            dpFontSim: Int = 0,
            lEmbedId: Int = 0,
            lItalicAngle: Int = 0,
            lCharBias: Int = 0,
            dpCharSets: Int = 0,
            jWinCharSet: UByte = 0u,
            jWinPitchAndFamily: UByte = 0u,
            usWinWeight: UShort = 0u,
            flInfo: UInt = 0u,
            fsSelection: UShort = 0u,
            fsType: UShort = 0u,
            fwdUnitsPerEm: Short = 0,
            fwdLowestPPEm: Short = 0,
            fwdWinAscender: Short = 0,
            fwdWinDescender: Short = 0,
            fwdMacAscender: Short = 0,
            fwdMacDescender: Short = 0,
            fwdMacLineGap: Short = 0,
            fwdTypoAscender: Short = 0,
            fwdTypoDescender: Short = 0,
            fwdTypoLineGap: Short = 0,
            fwdAveCharWidth: Short = 0,
            fwdMaxCharInc: Short = 0,
            fwdCapHeight: Short = 0,
            fwdXHeight: Short = 0,
            fwdSubscriptXSize: Short = 0,
            fwdSubscriptYSize: Short = 0,
            fwdSubscriptXOffset: Short = 0,
            fwdSubscriptYOffset: Short = 0,
            fwdSuperscriptXSize: Short = 0,
            fwdSuperscriptYSize: Short = 0,
            fwdSuperscriptXOffset: Short = 0,
            fwdSuperscriptYOffset: Short = 0,
            fwdUnderscoreSize: Short = 0,
            fwdUnderscorePosition: Short = 0,
            fwdStrikeoutSize: Short = 0,
            fwdStrikeoutPosition: Short = 0,
            chFirstChar: UByte = 0u,
            chLastChar: UByte = 0u,
            chDefaultChar: UByte = 0u,
            chBreakChar: UByte = 0u,
            wcFirstChar: UShort = 0u,
            wcLastChar: UShort = 0u,
            wcDefaultChar: UShort = 0u,
            wcBreakChar: UShort = 0u,
            ptlBaseline: Pointl = Pointl(),
            ptlAspect: Pointl = Pointl(),
            ptlCaret: Pointl = Pointl(),
            rclFontBox: Rectl = Rectl(),
            achVendId: UByteArray = UByteArray(4),
            cKerningPairs: UInt = 0u,
            ulPanoseCulture: UInt = 0u,
            panose: Panose = Panose(),
            align: MutPtr = MutPtr(0L),
        ): Ifimetrics =
            Ifimetrics(
                cjThis = cjThis,
                cjIfiExtra = cjIfiExtra,
                dpwszFamilyName = dpwszFamilyName,
                dpwszStyleName = dpwszStyleName,
                dpwszFaceName = dpwszFaceName,
                dpwszUniqueName = dpwszUniqueName,
                dpFontSim = dpFontSim,
                lEmbedId = lEmbedId,
                lItalicAngle = lItalicAngle,
                lCharBias = lCharBias,
                dpCharSets = dpCharSets,
                jWinCharSet = jWinCharSet,
                jWinPitchAndFamily = jWinPitchAndFamily,
                usWinWeight = usWinWeight,
                flInfo = flInfo,
                fsSelection = fsSelection,
                fsType = fsType,
                fwdUnitsPerEm = fwdUnitsPerEm,
                fwdLowestPPEm = fwdLowestPPEm,
                fwdWinAscender = fwdWinAscender,
                fwdWinDescender = fwdWinDescender,
                fwdMacAscender = fwdMacAscender,
                fwdMacDescender = fwdMacDescender,
                fwdMacLineGap = fwdMacLineGap,
                fwdTypoAscender = fwdTypoAscender,
                fwdTypoDescender = fwdTypoDescender,
                fwdTypoLineGap = fwdTypoLineGap,
                fwdAveCharWidth = fwdAveCharWidth,
                fwdMaxCharInc = fwdMaxCharInc,
                fwdCapHeight = fwdCapHeight,
                fwdXHeight = fwdXHeight,
                fwdSubscriptXSize = fwdSubscriptXSize,
                fwdSubscriptYSize = fwdSubscriptYSize,
                fwdSubscriptXOffset = fwdSubscriptXOffset,
                fwdSubscriptYOffset = fwdSubscriptYOffset,
                fwdSuperscriptXSize = fwdSuperscriptXSize,
                fwdSuperscriptYSize = fwdSuperscriptYSize,
                fwdSuperscriptXOffset = fwdSuperscriptXOffset,
                fwdSuperscriptYOffset = fwdSuperscriptYOffset,
                fwdUnderscoreSize = fwdUnderscoreSize,
                fwdUnderscorePosition = fwdUnderscorePosition,
                fwdStrikeoutSize = fwdStrikeoutSize,
                fwdStrikeoutPosition = fwdStrikeoutPosition,
                chFirstChar = chFirstChar,
                chLastChar = chLastChar,
                chDefaultChar = chDefaultChar,
                chBreakChar = chBreakChar,
                wcFirstChar = wcFirstChar,
                wcLastChar = wcLastChar,
                wcDefaultChar = wcDefaultChar,
                wcBreakChar = wcBreakChar,
                ptlBaseline = ptlBaseline,
                ptlAspect = ptlAspect,
                ptlCaret = ptlCaret,
                rclFontBox = rclFontBox,
                achVendId = achVendId,
                cKerningPairs = cKerningPairs,
                ulPanoseCulture = ulPanoseCulture,
                panose = panose,
                alignCtorArg = align,
            )
    }
}

public data class IndirectDisplayInfo(
    public var displayAdapterLuid: Luid = Luid(),
    public var flags: UInt = 0u,
    public var numMonitors: UInt = 0u,
    public var displayAdapterTargetBase: UInt = 0u,
)

public class Ligature internal constructor(
    public var culSize: UInt,
    pwszCtorArg: Pwstr,
    public var chglyph: UInt,
    public var ahglyph: UIntArray,
) {
    public var pwsz: Pwstr = pwszCtorArg
        internal set

    public constructor() : this(
        culSize = 0u,
        pwszCtorArg = MutPtr(0L),
        chglyph = 0u,
        ahglyph = UIntArray(1),
    )

    public operator fun component1(): UInt = this.culSize

    public operator fun component2(): Pwstr = this.pwsz

    public operator fun component3(): UInt = this.chglyph

    public operator fun component4(): UIntArray = this.ahglyph

    public fun copy(culSize: UInt = this.culSize, pwsz: Pwstr = this.pwsz, chglyph: UInt = this.chglyph, ahglyph: UIntArray = this.ahglyph): Ligature = Ligature(culSize = culSize, pwszCtorArg = pwsz, chglyph = chglyph, ahglyph = ahglyph)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ligature) return false
        if (this.culSize != other.culSize) return false
        if (this.pwsz != other.pwsz) return false
        if (this.chglyph != other.chglyph) return false
        if (!this.ahglyph.contentEquals(other.ahglyph)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.culSize.hashCode()
        result = 31 * result + this.pwsz.hashCode()
        result = 31 * result + this.chglyph.hashCode()
        result = 31 * result + this.ahglyph.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            culSize: UInt = 0u,
            pwsz: Pwstr = MutPtr(0L),
            chglyph: UInt = 0u,
            ahglyph: UIntArray = UIntArray(1),
        ): Ligature =
            Ligature(
                culSize = culSize,
                pwszCtorArg = pwsz,
                chglyph = chglyph,
                ahglyph = ahglyph,
            )
    }
}

public class Lineattrs internal constructor(
    public var fl: UInt,
    public var iJoin: UInt,
    public var iEndCap: UInt,
    public var elWidth: FloatLong,
    public var eMiterLimit: Float,
    public var cstyle: UInt,
    pstyleCtorArg: MutPtr,
    public var elStyleState: FloatLong,
) {
    public var pstyle: MutPtr = pstyleCtorArg
        internal set

    public constructor() : this(
        fl = 0u,
        iJoin = 0u,
        iEndCap = 0u,
        elWidth = FloatLong(),
        eMiterLimit = 0.0f,
        cstyle = 0u,
        pstyleCtorArg = MutPtr(0L),
        elStyleState = FloatLong(),
    )

    public operator fun component1(): UInt = this.fl

    public operator fun component2(): UInt = this.iJoin

    public operator fun component3(): UInt = this.iEndCap

    public operator fun component4(): FloatLong = this.elWidth

    public operator fun component5(): Float = this.eMiterLimit

    public operator fun component6(): UInt = this.cstyle

    public operator fun component7(): MutPtr = this.pstyle

    public operator fun component8(): FloatLong = this.elStyleState

    public fun copy(fl: UInt = this.fl, iJoin: UInt = this.iJoin, iEndCap: UInt = this.iEndCap, elWidth: FloatLong = this.elWidth, eMiterLimit: Float = this.eMiterLimit, cstyle: UInt = this.cstyle, pstyle: MutPtr = this.pstyle, elStyleState: FloatLong = this.elStyleState): Lineattrs = Lineattrs(fl = fl, iJoin = iJoin, iEndCap = iEndCap, elWidth = elWidth, eMiterLimit = eMiterLimit, cstyle = cstyle, pstyleCtorArg = pstyle, elStyleState = elStyleState)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Lineattrs) return false
        if (this.fl != other.fl) return false
        if (this.iJoin != other.iJoin) return false
        if (this.iEndCap != other.iEndCap) return false
        if (this.elWidth != other.elWidth) return false
        if (this.eMiterLimit != other.eMiterLimit) return false
        if (this.cstyle != other.cstyle) return false
        if (this.pstyle != other.pstyle) return false
        if (this.elStyleState != other.elStyleState) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fl.hashCode()
        result = 31 * result + this.iJoin.hashCode()
        result = 31 * result + this.iEndCap.hashCode()
        result = 31 * result + this.elWidth.hashCode()
        result = 31 * result + this.eMiterLimit.hashCode()
        result = 31 * result + this.cstyle.hashCode()
        result = 31 * result + this.pstyle.hashCode()
        result = 31 * result + this.elStyleState.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fl: UInt = 0u,
            iJoin: UInt = 0u,
            iEndCap: UInt = 0u,
            elWidth: FloatLong = FloatLong(),
            eMiterLimit: Float = 0.0f,
            cstyle: UInt = 0u,
            pstyle: MutPtr = MutPtr(0L),
            elStyleState: FloatLong = FloatLong(),
        ): Lineattrs =
            Lineattrs(
                fl = fl,
                iJoin = iJoin,
                iEndCap = iEndCap,
                elWidth = elWidth,
                eMiterLimit = eMiterLimit,
                cstyle = cstyle,
                pstyleCtorArg = pstyle,
                elStyleState = elStyleState,
            )
    }
}

public data class McTimingReport(
    public var dwHorizontalFrequencyInHZ: UInt = 0u,
    public var dwVerticalFrequencyInHZ: UInt = 0u,
    public var bTimingStatusByte: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<McTimingReport> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<McTimingReport> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 9L
                override fun readNative(addr: Long): McTimingReport =
                    McTimingReport(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: McTimingReport) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwHorizontalFrequencyInHZ)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwVerticalFrequencyInHZ)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.bTimingStatusByte)
                }
            }
    }
}

public class MipiDsiCaps(
    public var dSITypeMajor: UByte = 0u,
    public var dSITypeMinor: UByte = 0u,
    public var specVersionMajor: UByte = 0u,
    public var specVersionMinor: UByte = 0u,
    public var specVersionPatch: UByte = 0u,
    public var targetMaximumReturnPacketSize: UShort = 0u,
    public var resultCodeFlags: UByte = 0u,
    public var resultCodeStatus: UByte = 0u,
    public var revision: UByte = 0u,
    public var level: UByte = 0u,
    public var deviceClassHi: UByte = 0u,
    public var deviceClassLo: UByte = 0u,
    public var manufacturerHi: UByte = 0u,
    public var manufacturerLo: UByte = 0u,
    public var productHi: UByte = 0u,
    public var productLo: UByte = 0u,
    public var lengthHi: UByte = 0u,
    public var lengthLo: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MipiDsiCaps> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MipiDsiCaps> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): MipiDsiCaps =
                    MipiDsiCaps(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 11L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 13L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 15L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 17L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 19L),
                    )
                override fun writeNative(addr: Long, value: MipiDsiCaps) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.dSITypeMajor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.dSITypeMinor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.specVersionMajor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.specVersionMinor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.specVersionPatch)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.targetMaximumReturnPacketSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.resultCodeFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.resultCodeStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 10L, value.revision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 11L, value.level)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.deviceClassHi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 13L, value.deviceClassLo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 14L, value.manufacturerHi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 15L, value.manufacturerLo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.productHi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 17L, value.productLo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 18L, value.lengthHi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 19L, value.lengthLo)
                }
            }
    }
}

public data class MipiDsiPacket(
    public var anonymous1: MipiDsiPacket0 = MipiDsiPacket0(),
    public var anonymous2: MipiDsiPacket1 = MipiDsiPacket1(),
    public var eccFiller: UByte = 0u,
    public var payload: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MipiDsiPacket) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.eccFiller != other.eccFiller) return false
        if (!this.payload.contentEquals(other.payload)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous1.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.eccFiller.hashCode()
        result = 31 * result + this.payload.contentHashCode()
        return result
    }
}

public data class MipiDsiPacket0(
    public var dataId: UByte = 0u,
    public var anonymous: MipiDsiPacket00 = MipiDsiPacket00(),
)

public data class MipiDsiPacket00(
    public var bitfield: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MipiDsiPacket00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MipiDsiPacket00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): MipiDsiPacket00 =
                    MipiDsiPacket00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MipiDsiPacket00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class MipiDsiPacket1(
    public var anonymous: MipiDsiPacket10 = MipiDsiPacket10(),
    public var longWriteWordCount: UShort = 0u,
)

public data class MipiDsiPacket10(
    public var data0: UByte = 0u,
    public var data1: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MipiDsiPacket10> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MipiDsiPacket10> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): MipiDsiPacket10 =
                    MipiDsiPacket10(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: MipiDsiPacket10) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.data0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.data1)
                }
            }
    }
}

public data class MipiDsiReset(
    public var flags: UInt = 0u,
    public var anonymous: MipiDsiReset0 = MipiDsiReset0(),
)

public data class MipiDsiReset0(
    public var anonymous: MipiDsiReset00 = MipiDsiReset00(),
    public var results: UInt = 0u,
)

public data class MipiDsiReset00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MipiDsiReset00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MipiDsiReset00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): MipiDsiReset00 =
                    MipiDsiReset00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MipiDsiReset00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class MipiDsiTransmission(
    public var totalBufferSize: UInt = 0u,
    public var packetCount: UByte = 0u,
    public var failedPacket: UByte = 0u,
    public var anonymous: MipiDsiTransmission0 = MipiDsiTransmission0(),
    public var readWordCount: UShort = 0u,
    public var finalCommandExtraPayload: UShort = 0u,
    public var mipiErrors: UShort = 0u,
    public var hostErrors: UShort = 0u,
    public var packets: List<MipiDsiPacket> = List(1) { MipiDsiPacket() },
)

public data class MipiDsiTransmission0(
    public var bitfield: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MipiDsiTransmission0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MipiDsiTransmission0> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): MipiDsiTransmission0 =
                    MipiDsiTransmission0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MipiDsiTransmission0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class OutputWireFormat(
    public var colorEncoding: OutputColorEncoding = 0,
    public var bitsPerPixel: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<OutputWireFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<OutputWireFormat> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): OutputWireFormat =
                    OutputWireFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: OutputWireFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.colorEncoding)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bitsPerPixel)
                }
            }
    }
}

public data class Palobj(
    public var ulReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Palobj> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Palobj> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Palobj =
                    Palobj(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Palobj) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulReserved)
                }
            }
    }
}

public data class PanelBrightnessSensorData(
    public var anonymous: PanelBrightnessSensorData0 = PanelBrightnessSensorData0(),
    public var alsReading: Float = 0.0f,
    public var chromaticityCoordinate: ChromaticityCoordinate = ChromaticityCoordinate(),
    public var colorTemperature: Float = 0.0f,
)

public data class PanelBrightnessSensorData0(
    public var anonymous: PanelBrightnessSensorData00 = PanelBrightnessSensorData00(),
    public var value: UInt = 0u,
)

public data class PanelBrightnessSensorData00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PanelBrightnessSensorData00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PanelBrightnessSensorData00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PanelBrightnessSensorData00 =
                    PanelBrightnessSensorData00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PanelBrightnessSensorData00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PanelGetBacklightReduction(
    public var backlightUsersetting: UShort = 0u,
    public var backlightEffective: UShort = 0u,
    public var gammaRamp: BacklightReductionGammaRamp = BacklightReductionGammaRamp(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PanelGetBacklightReduction> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PanelGetBacklightReduction> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 1540L
                override fun readNative(addr: Long): PanelGetBacklightReduction =
                    PanelGetBacklightReduction(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (BacklightReductionGammaRamp.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PanelGetBacklightReduction) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.backlightUsersetting)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.backlightEffective)
                    (BacklightReductionGammaRamp.typeLayout()).writeNative(addr + 4L, value.gammaRamp)
                }
            }
    }
}

public data class PanelGetBrightness(
    public var version: BrightnessInterfaceVersion = 0,
    public var anonymous: PanelGetBrightness0 = PanelGetBrightness0(),
)

public data class PanelGetBrightness0(
    public var level: UByte = 0u,
    public var anonymous: PanelGetBrightness00 = PanelGetBrightness00(),
)

public data class PanelGetBrightness00(
    public var currentInMillinits: UInt = 0u,
    public var targetInMillinits: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PanelGetBrightness00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PanelGetBrightness00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PanelGetBrightness00 =
                    PanelGetBrightness00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PanelGetBrightness00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.currentInMillinits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.targetInMillinits)
                }
            }
    }
}

public data class PanelQueryBrightnessCaps(
    public var version: BrightnessInterfaceVersion = 0,
    public var anonymous: PanelQueryBrightnessCaps0 = PanelQueryBrightnessCaps0(),
)

public data class PanelQueryBrightnessCaps0(
    public var anonymous: PanelQueryBrightnessCaps00 = PanelQueryBrightnessCaps00(),
    public var value: UInt = 0u,
)

public data class PanelQueryBrightnessCaps00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PanelQueryBrightnessCaps00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PanelQueryBrightnessCaps00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PanelQueryBrightnessCaps00 =
                    PanelQueryBrightnessCaps00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PanelQueryBrightnessCaps00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class PanelQueryBrightnessRanges(
    public var version: BrightnessInterfaceVersion = 0,
    public var anonymous: PanelQueryBrightnessRanges0 = PanelQueryBrightnessRanges0(),
)

public data class PanelQueryBrightnessRanges0(
    public var brightnessLevel: BrightnessLevel = BrightnessLevel(),
    public var nitRanges: BrightnessNitRanges = BrightnessNitRanges(),
)

public data class PanelSetBacklightOptimization(
    public var level: BacklightOptimizationLevel = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PanelSetBacklightOptimization> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PanelSetBacklightOptimization> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PanelSetBacklightOptimization =
                    PanelSetBacklightOptimization(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PanelSetBacklightOptimization) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.level)
                }
            }
    }
}

public data class PanelSetBrightness(
    public var version: BrightnessInterfaceVersion = 0,
    public var anonymous: PanelSetBrightness0 = PanelSetBrightness0(),
)

public data class PanelSetBrightness0(
    public var level: UByte = 0u,
    public var anonymous: PanelSetBrightness00 = PanelSetBrightness00(),
)

public data class PanelSetBrightness00(
    public var millinits: UInt = 0u,
    public var transitionTimeInMs: UInt = 0u,
    public var sensorData: PanelBrightnessSensorData = PanelBrightnessSensorData(),
)

public data class PanelSetBrightnessState(
    public var anonymous: PanelSetBrightnessState0 = PanelSetBrightnessState0(),
)

public data class PanelSetBrightnessState0(
    public var anonymous: PanelSetBrightnessState00 = PanelSetBrightnessState00(),
    public var value: UInt = 0u,
)

public data class PanelSetBrightnessState00(
    public var bitfield: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PanelSetBrightnessState00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PanelSetBrightnessState00> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PanelSetBrightnessState00 =
                    PanelSetBrightnessState00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PanelSetBrightnessState00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public class Pathdata internal constructor(
    public var flags: UInt,
    public var count: UInt,
    pptfxCtorArg: MutPtr,
) {
    public var pptfx: MutPtr = pptfxCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        count = 0u,
        pptfxCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): UInt = this.count

    public operator fun component3(): MutPtr = this.pptfx

    public fun copy(flags: UInt = this.flags, count: UInt = this.count, pptfx: MutPtr = this.pptfx): Pathdata = Pathdata(flags = flags, count = count, pptfxCtorArg = pptfx)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Pathdata) return false
        if (this.flags != other.flags) return false
        if (this.count != other.count) return false
        if (this.pptfx != other.pptfx) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.count.hashCode()
        result = 31 * result + this.pptfx.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pathdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pathdata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Pathdata =
                    Pathdata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Pathdata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pptfx)
                }
            }

        public operator fun invoke(
            flags: UInt = 0u,
            count: UInt = 0u,
            pptfx: MutPtr = MutPtr(0L),
        ): Pathdata =
            Pathdata(
                flags = flags,
                count = count,
                pptfxCtorArg = pptfx,
            )
    }
}

public data class Pathobj(
    public var fl: UInt = 0u,
    public var cCurves: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pathobj> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pathobj> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Pathobj =
                    Pathobj(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Pathobj) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.fl)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cCurves)
                }
            }
    }
}

public data class Perbandinfo(
    public var bRepeatThisBand: Bool = 0,
    public var szlBand: Size = Size(),
    public var ulHorzRes: UInt = 0u,
    public var ulVertRes: UInt = 0u,
)

public class PhysicalMonitor internal constructor(
    hPhysicalMonitorCtorArg: Handle,
    public var szPhysicalMonitorDescription: UShortArray,
) {
    public var hPhysicalMonitor: Handle = hPhysicalMonitorCtorArg
        internal set

    public constructor() : this(
        hPhysicalMonitorCtorArg = MutPtr(0L),
        szPhysicalMonitorDescription = UShortArray(128),
    )

    public operator fun component1(): Handle = this.hPhysicalMonitor

    public operator fun component2(): UShortArray = this.szPhysicalMonitorDescription

    public fun copy(hPhysicalMonitor: Handle = this.hPhysicalMonitor, szPhysicalMonitorDescription: UShortArray = this.szPhysicalMonitorDescription): PhysicalMonitor = PhysicalMonitor(hPhysicalMonitorCtorArg = hPhysicalMonitor, szPhysicalMonitorDescription = szPhysicalMonitorDescription)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PhysicalMonitor) return false
        if (this.hPhysicalMonitor != other.hPhysicalMonitor) return false
        if (!this.szPhysicalMonitorDescription.contentEquals(other.szPhysicalMonitorDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hPhysicalMonitor.hashCode()
        result = 31 * result + this.szPhysicalMonitorDescription.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hPhysicalMonitor: Handle = MutPtr(0L),
            szPhysicalMonitorDescription: UShortArray = UShortArray(128),
        ): PhysicalMonitor =
            PhysicalMonitor(
                hPhysicalMonitorCtorArg = hPhysicalMonitor,
                szPhysicalMonitorDescription = szPhysicalMonitorDescription,
            )
    }
}

public data class Pointe(
    public var x: Float = 0.0f,
    public var y: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pointe> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pointe> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Pointe =
                    Pointe(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Pointe) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.y)
                }
            }
    }
}

public data class Pointfix(
    public var x: Int = 0,
    public var y: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pointfix> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pointfix> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Pointfix =
                    Pointfix(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Pointfix) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.y)
                }
            }
    }
}

public data class Pointqf(
    public var x: Long = 0L,
    public var y: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pointqf> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pointqf> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Pointqf =
                    Pointqf(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Pointqf) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.y)
                }
            }
    }
}

public data class Rectfx(
    public var xLeft: Int = 0,
    public var yTop: Int = 0,
    public var xRight: Int = 0,
    public var yBottom: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rectfx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rectfx> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Rectfx =
                    Rectfx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Rectfx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.xLeft)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.yTop)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.xRight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.yBottom)
                }
            }
    }
}

public data class Run(
    public var iStart: Int = 0,
    public var iStop: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Run> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Run> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Run =
                    Run(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Run) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.iStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.iStop)
                }
            }
    }
}

public data class SetActiveColorProfileName(
    public var colorProfileName: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SetActiveColorProfileName) return false
        if (!this.colorProfileName.contentEquals(other.colorProfileName)) return false
        return true
    }

    override fun hashCode(): Int = this.colorProfileName.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SetActiveColorProfileName> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SetActiveColorProfileName> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): SetActiveColorProfileName =
                    SetActiveColorProfileName(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: SetActiveColorProfileName) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr, value.colorProfileName.toList())
                }
            }
    }
}

public class Strobj internal constructor(
    public var cGlyphs: UInt,
    public var flAccel: UInt,
    public var ulCharInc: UInt,
    public var rclBkGround: Rectl,
    pgpCtorArg: MutPtr,
    pwszOrgCtorArg: Pwstr,
) {
    public var pgp: MutPtr = pgpCtorArg
        internal set

    public var pwszOrg: Pwstr = pwszOrgCtorArg
        internal set

    public constructor() : this(
        cGlyphs = 0u,
        flAccel = 0u,
        ulCharInc = 0u,
        rclBkGround = Rectl(),
        pgpCtorArg = MutPtr(0L),
        pwszOrgCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cGlyphs

    public operator fun component2(): UInt = this.flAccel

    public operator fun component3(): UInt = this.ulCharInc

    public operator fun component4(): Rectl = this.rclBkGround

    public operator fun component5(): MutPtr = this.pgp

    public operator fun component6(): Pwstr = this.pwszOrg

    public fun copy(cGlyphs: UInt = this.cGlyphs, flAccel: UInt = this.flAccel, ulCharInc: UInt = this.ulCharInc, rclBkGround: Rectl = this.rclBkGround, pgp: MutPtr = this.pgp, pwszOrg: Pwstr = this.pwszOrg): Strobj = Strobj(cGlyphs = cGlyphs, flAccel = flAccel, ulCharInc = ulCharInc, rclBkGround = rclBkGround, pgpCtorArg = pgp, pwszOrgCtorArg = pwszOrg)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Strobj) return false
        if (this.cGlyphs != other.cGlyphs) return false
        if (this.flAccel != other.flAccel) return false
        if (this.ulCharInc != other.ulCharInc) return false
        if (this.rclBkGround != other.rclBkGround) return false
        if (this.pgp != other.pgp) return false
        if (this.pwszOrg != other.pwszOrg) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cGlyphs.hashCode()
        result = 31 * result + this.flAccel.hashCode()
        result = 31 * result + this.ulCharInc.hashCode()
        result = 31 * result + this.rclBkGround.hashCode()
        result = 31 * result + this.pgp.hashCode()
        result = 31 * result + this.pwszOrg.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cGlyphs: UInt = 0u,
            flAccel: UInt = 0u,
            ulCharInc: UInt = 0u,
            rclBkGround: Rectl = Rectl(),
            pgp: MutPtr = MutPtr(0L),
            pwszOrg: Pwstr = MutPtr(0L),
        ): Strobj =
            Strobj(
                cGlyphs = cGlyphs,
                flAccel = flAccel,
                ulCharInc = ulCharInc,
                rclBkGround = rclBkGround,
                pgpCtorArg = pgp,
                pwszOrgCtorArg = pwszOrg,
            )
    }
}

public class Surfobj internal constructor(
    dhsurfCtorArg: Dhsurf,
    hsurfCtorArg: Hsurf,
    dhpdevCtorArg: Dhpdev,
    hdevCtorArg: Hdev,
    public var sizlBitmap: Size,
    public var cjBits: UInt,
    pvBitsCtorArg: MutPtr,
    pvScan0CtorArg: MutPtr,
    public var lDelta: Int,
    public var iUniq: UInt,
    public var iBitmapFormat: UInt,
    public var iType: UShort,
    public var fjBitmap: UShort,
) {
    public var dhsurf: Dhsurf = dhsurfCtorArg
        internal set

    public var hsurf: Hsurf = hsurfCtorArg
        internal set

    public var dhpdev: Dhpdev = dhpdevCtorArg
        internal set

    public var hdev: Hdev = hdevCtorArg
        internal set

    public var pvBits: MutPtr = pvBitsCtorArg
        internal set

    public var pvScan0: MutPtr = pvScan0CtorArg
        internal set

    public constructor() : this(
        dhsurfCtorArg = MutPtr(0L),
        hsurfCtorArg = MutPtr(0L),
        dhpdevCtorArg = MutPtr(0L),
        hdevCtorArg = MutPtr(0L),
        sizlBitmap = Size(),
        cjBits = 0u,
        pvBitsCtorArg = MutPtr(0L),
        pvScan0CtorArg = MutPtr(0L),
        lDelta = 0,
        iUniq = 0u,
        iBitmapFormat = 0u,
        iType = 0u,
        fjBitmap = 0u,
    )

    public operator fun component1(): Dhsurf = this.dhsurf

    public operator fun component2(): Hsurf = this.hsurf

    public operator fun component3(): Dhpdev = this.dhpdev

    public operator fun component4(): Hdev = this.hdev

    public operator fun component5(): Size = this.sizlBitmap

    public operator fun component6(): UInt = this.cjBits

    public operator fun component7(): MutPtr = this.pvBits

    public operator fun component8(): MutPtr = this.pvScan0

    public operator fun component9(): Int = this.lDelta

    public operator fun component10(): UInt = this.iUniq

    public operator fun component11(): UInt = this.iBitmapFormat

    public operator fun component12(): UShort = this.iType

    public operator fun component13(): UShort = this.fjBitmap

    public fun copy(dhsurf: Dhsurf = this.dhsurf, hsurf: Hsurf = this.hsurf, dhpdev: Dhpdev = this.dhpdev, hdev: Hdev = this.hdev, sizlBitmap: Size = this.sizlBitmap, cjBits: UInt = this.cjBits, pvBits: MutPtr = this.pvBits, pvScan0: MutPtr = this.pvScan0, lDelta: Int = this.lDelta, iUniq: UInt = this.iUniq, iBitmapFormat: UInt = this.iBitmapFormat, iType: UShort = this.iType, fjBitmap: UShort = this.fjBitmap): Surfobj = Surfobj(dhsurfCtorArg = dhsurf, hsurfCtorArg = hsurf, dhpdevCtorArg = dhpdev, hdevCtorArg = hdev, sizlBitmap = sizlBitmap, cjBits = cjBits, pvBitsCtorArg = pvBits, pvScan0CtorArg = pvScan0, lDelta = lDelta, iUniq = iUniq, iBitmapFormat = iBitmapFormat, iType = iType, fjBitmap = fjBitmap)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Surfobj) return false
        if (this.dhsurf != other.dhsurf) return false
        if (this.hsurf != other.hsurf) return false
        if (this.dhpdev != other.dhpdev) return false
        if (this.hdev != other.hdev) return false
        if (this.sizlBitmap != other.sizlBitmap) return false
        if (this.cjBits != other.cjBits) return false
        if (this.pvBits != other.pvBits) return false
        if (this.pvScan0 != other.pvScan0) return false
        if (this.lDelta != other.lDelta) return false
        if (this.iUniq != other.iUniq) return false
        if (this.iBitmapFormat != other.iBitmapFormat) return false
        if (this.iType != other.iType) return false
        if (this.fjBitmap != other.fjBitmap) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dhsurf.hashCode()
        result = 31 * result + this.hsurf.hashCode()
        result = 31 * result + this.dhpdev.hashCode()
        result = 31 * result + this.hdev.hashCode()
        result = 31 * result + this.sizlBitmap.hashCode()
        result = 31 * result + this.cjBits.hashCode()
        result = 31 * result + this.pvBits.hashCode()
        result = 31 * result + this.pvScan0.hashCode()
        result = 31 * result + this.lDelta.hashCode()
        result = 31 * result + this.iUniq.hashCode()
        result = 31 * result + this.iBitmapFormat.hashCode()
        result = 31 * result + this.iType.hashCode()
        result = 31 * result + this.fjBitmap.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dhsurf: Dhsurf = MutPtr(0L),
            hsurf: Hsurf = MutPtr(0L),
            dhpdev: Dhpdev = MutPtr(0L),
            hdev: Hdev = MutPtr(0L),
            sizlBitmap: Size = Size(),
            cjBits: UInt = 0u,
            pvBits: MutPtr = MutPtr(0L),
            pvScan0: MutPtr = MutPtr(0L),
            lDelta: Int = 0,
            iUniq: UInt = 0u,
            iBitmapFormat: UInt = 0u,
            iType: UShort = 0u,
            fjBitmap: UShort = 0u,
        ): Surfobj =
            Surfobj(
                dhsurfCtorArg = dhsurf,
                hsurfCtorArg = hsurf,
                dhpdevCtorArg = dhpdev,
                hdevCtorArg = hdev,
                sizlBitmap = sizlBitmap,
                cjBits = cjBits,
                pvBitsCtorArg = pvBits,
                pvScan0CtorArg = pvScan0,
                lDelta = lDelta,
                iUniq = iUniq,
                iBitmapFormat = iBitmapFormat,
                iType = iType,
                fjBitmap = fjBitmap,
            )
    }
}

public data class Sources(
    public var sourceId: UInt = 0u,
    public var numTargets: Int = 0,
    public var aTargets: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sources) return false
        if (this.sourceId != other.sourceId) return false
        if (this.numTargets != other.numTargets) return false
        if (!this.aTargets.contentEquals(other.aTargets)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sourceId.hashCode()
        result = 31 * result + this.numTargets.hashCode()
        result = 31 * result + this.aTargets.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sources> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sources> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Sources =
                    Sources(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 8L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: Sources) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sourceId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.numTargets)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 8L, value.aTargets.toList())
                }
            }
    }
}

public class Type1Font internal constructor(
    hPFMCtorArg: Handle,
    hPFBCtorArg: Handle,
    public var ulIdentifier: UInt,
) {
    public var hPFM: Handle = hPFMCtorArg
        internal set

    public var hPFB: Handle = hPFBCtorArg
        internal set

    public constructor() : this(
        hPFMCtorArg = MutPtr(0L),
        hPFBCtorArg = MutPtr(0L),
        ulIdentifier = 0u,
    )

    public operator fun component1(): Handle = this.hPFM

    public operator fun component2(): Handle = this.hPFB

    public operator fun component3(): UInt = this.ulIdentifier

    public fun copy(hPFM: Handle = this.hPFM, hPFB: Handle = this.hPFB, ulIdentifier: UInt = this.ulIdentifier): Type1Font = Type1Font(hPFMCtorArg = hPFM, hPFBCtorArg = hPFB, ulIdentifier = ulIdentifier)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Type1Font) return false
        if (this.hPFM != other.hPFM) return false
        if (this.hPFB != other.hPFB) return false
        if (this.ulIdentifier != other.ulIdentifier) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hPFM.hashCode()
        result = 31 * result + this.hPFB.hashCode()
        result = 31 * result + this.ulIdentifier.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hPFM: Handle = MutPtr(0L),
            hPFB: Handle = MutPtr(0L),
            ulIdentifier: UInt = 0u,
        ): Type1Font =
            Type1Font(
                hPFMCtorArg = hPFM,
                hPFBCtorArg = hPFB,
                ulIdentifier = ulIdentifier,
            )
    }
}

public data class VgaChar(
    public var char: Byte = 0,
    public var attributes: Byte = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VgaChar> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VgaChar> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): VgaChar =
                    VgaChar(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: VgaChar) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr, value.char)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 1L, value.attributes)
                }
            }
    }
}

public class Videoparameters(
    public var guid: Guid = Guid(),
    public var dwOffset: UInt = 0u,
    public var dwCommand: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwMode: UInt = 0u,
    public var dwTVStandard: UInt = 0u,
    public var dwAvailableModes: UInt = 0u,
    public var dwAvailableTVStandard: UInt = 0u,
    public var dwFlickerFilter: UInt = 0u,
    public var dwOverScanX: UInt = 0u,
    public var dwOverScanY: UInt = 0u,
    public var dwMaxUnscaledX: UInt = 0u,
    public var dwMaxUnscaledY: UInt = 0u,
    public var dwPositionX: UInt = 0u,
    public var dwPositionY: UInt = 0u,
    public var dwBrightness: UInt = 0u,
    public var dwContrast: UInt = 0u,
    public var dwCPType: UInt = 0u,
    public var dwCPCommand: UInt = 0u,
    public var dwCPStandard: UInt = 0u,
    public var dwCPKey: UInt = 0u,
    public var bCpApstriggerBits: UInt = 0u,
    public var bOEMCopyProtection: UByteArray = UByteArray(256),
)

public data class VideoBankSelect(
    public var length: UInt = 0u,
    public var size: UInt = 0u,
    public var bankingFlags: UInt = 0u,
    public var bankingType: UInt = 0u,
    public var planarHCBankingType: UInt = 0u,
    public var bitmapWidthInBytes: UInt = 0u,
    public var bitmapSize: UInt = 0u,
    public var granularity: UInt = 0u,
    public var planarHCGranularity: UInt = 0u,
    public var codeOffset: UInt = 0u,
    public var planarHCBankCodeOffset: UInt = 0u,
    public var planarHCEnableCodeOffset: UInt = 0u,
    public var planarHCDisableCodeOffset: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoBankSelect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoBankSelect> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 52L
                override fun readNative(addr: Long): VideoBankSelect =
                    VideoBankSelect(
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
                    )
                override fun writeNative(addr: Long, value: VideoBankSelect) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.bankingFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.bankingType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.planarHCBankingType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.bitmapWidthInBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.bitmapSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.granularity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.planarHCGranularity)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.codeOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.planarHCBankCodeOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.planarHCEnableCodeOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.planarHCDisableCodeOffset)
                }
            }
    }
}

public data class VideoBrightnessPolicy(
    public var defaultToBiosPolicy: Boolean = false,
    public var levelCount: UByte = 0u,
    public var level: List<VideoBrightnessPolicy0> = List(1) { VideoBrightnessPolicy0() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoBrightnessPolicy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoBrightnessPolicy> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): VideoBrightnessPolicy =
                    VideoBrightnessPolicy(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(VideoBrightnessPolicy0.typeLayout(), (1).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: VideoBrightnessPolicy) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr, value.defaultToBiosPolicy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.levelCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(VideoBrightnessPolicy0.typeLayout(), (1).toInt())
                    ).writeNative(addr + 2L, value.level)
                }
            }
    }
}

public data class VideoBrightnessPolicy0(
    public var batteryLevel: UByte = 0u,
    public var brightness: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoBrightnessPolicy0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoBrightnessPolicy0> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 2L
                override fun readNative(addr: Long): VideoBrightnessPolicy0 =
                    VideoBrightnessPolicy0(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                    )
                override fun writeNative(addr: Long, value: VideoBrightnessPolicy0) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.batteryLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.brightness)
                }
            }
    }
}

public data class VideoClut(
    public var numEntries: UShort = 0u,
    public var firstEntry: UShort = 0u,
    public var lookupTable: List<VideoClut0> = List(1) { VideoClut0() },
)

public data class VideoClut0(
    public var rgbArray: VideoClutdata = VideoClutdata(),
    public var rgbLong: UInt = 0u,
)

public data class VideoClutdata(
    public var red: UByte = 0u,
    public var green: UByte = 0u,
    public var blue: UByte = 0u,
    public var unused: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoClutdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoClutdata> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): VideoClutdata =
                    VideoClutdata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: VideoClutdata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.red)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.green)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.blue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.unused)
                }
            }
    }
}

public class VideoColorCapabilities(
    public var length: UInt = 0u,
    public var attributeFlags: UInt = 0u,
    public var redPhosphoreDecay: Int = 0,
    public var greenPhosphoreDecay: Int = 0,
    public var bluePhosphoreDecay: Int = 0,
    public var whiteChromaticityX: Int = 0,
    public var whiteChromaticityY: Int = 0,
    public var redChromaticityX: Int = 0,
    public var redChromaticityY: Int = 0,
    public var greenChromaticityX: Int = 0,
    public var greenChromaticityY: Int = 0,
    public var blueChromaticityX: Int = 0,
    public var blueChromaticityY: Int = 0,
    public var whiteGamma: Int = 0,
    public var redGamma: Int = 0,
    public var greenGamma: Int = 0,
    public var blueGamma: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoColorCapabilities> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoColorCapabilities> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 68L
                override fun readNative(addr: Long): VideoColorCapabilities =
                    VideoColorCapabilities(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: VideoColorCapabilities) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.attributeFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.redPhosphoreDecay)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.greenPhosphoreDecay)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.bluePhosphoreDecay)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.whiteChromaticityX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.whiteChromaticityY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.redChromaticityX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.redChromaticityY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.greenChromaticityX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.greenChromaticityY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 44L, value.blueChromaticityX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.blueChromaticityY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 52L, value.whiteGamma)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.redGamma)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 60L, value.greenGamma)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 64L, value.blueGamma)
                }
            }
    }
}

public data class VideoColorLutData(
    public var length: UInt = 0u,
    public var lutDataFormat: UInt = 0u,
    public var lutData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VideoColorLutData) return false
        if (this.length != other.length) return false
        if (this.lutDataFormat != other.lutDataFormat) return false
        if (!this.lutData.contentEquals(other.lutData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.lutDataFormat.hashCode()
        result = 31 * result + this.lutData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoColorLutData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoColorLutData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): VideoColorLutData =
                    VideoColorLutData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: VideoColorLutData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.lutDataFormat)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.lutData.toList())
                }
            }
    }
}

public data class VideoCursorAttributes(
    public var width: UShort = 0u,
    public var height: UShort = 0u,
    public var column: Short = 0,
    public var row: Short = 0,
    public var rate: UByte = 0u,
    public var enable: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoCursorAttributes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoCursorAttributes> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 10L
                override fun readNative(addr: Long): VideoCursorAttributes =
                    VideoCursorAttributes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                    )
                override fun writeNative(addr: Long, value: VideoCursorAttributes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.width)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.height)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 4L, value.column)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 6L, value.row)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.rate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.enable)
                }
            }
    }
}

public data class VideoCursorPosition(
    public var column: Short = 0,
    public var row: Short = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoCursorPosition> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoCursorPosition> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): VideoCursorPosition =
                    VideoCursorPosition(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: VideoCursorPosition) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.column)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.row)
                }
            }
    }
}

public data class VideoDeviceSessionStatus(
    public var bEnable: UInt = 0u,
    public var bSuccess: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoDeviceSessionStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoDeviceSessionStatus> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): VideoDeviceSessionStatus =
                    VideoDeviceSessionStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: VideoDeviceSessionStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bEnable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.bSuccess)
                }
            }
    }
}

public class VideoHardwareState internal constructor(
    stateHeaderCtorArg: MutPtr,
    public var stateLength: UInt,
) {
    public var stateHeader: MutPtr = stateHeaderCtorArg
        internal set

    public constructor() : this(
        stateHeaderCtorArg = MutPtr(0L),
        stateLength = 0u,
    )

    public operator fun component1(): MutPtr = this.stateHeader

    public operator fun component2(): UInt = this.stateLength

    public fun copy(stateHeader: MutPtr = this.stateHeader, stateLength: UInt = this.stateLength): VideoHardwareState = VideoHardwareState(stateHeaderCtorArg = stateHeader, stateLength = stateLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VideoHardwareState) return false
        if (this.stateHeader != other.stateHeader) return false
        if (this.stateLength != other.stateLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.stateHeader.hashCode()
        result = 31 * result + this.stateLength.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoHardwareState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoHardwareState> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): VideoHardwareState =
                    VideoHardwareState(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: VideoHardwareState) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.stateHeader)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.stateLength)
                }
            }

        public operator fun invoke(
            stateHeader: MutPtr = MutPtr(0L),
            stateLength: UInt = 0u,
        ): VideoHardwareState =
            VideoHardwareState(
                stateHeaderCtorArg = stateHeader,
                stateLength = stateLength,
            )
    }
}

public class VideoHardwareStateHeader internal constructor(
    public var length: UInt,
    public var portValue: UByteArray,
    public var attribIndexDataState: UInt,
    public var basicSequencerOffset: UInt,
    public var basicCrtContOffset: UInt,
    public var basicGraphContOffset: UInt,
    public var basicAttribContOffset: UInt,
    public var basicDacOffset: UInt,
    public var basicLatchesOffset: UInt,
    public var extendedSequencerOffset: UInt,
    public var extendedCrtContOffset: UInt,
    public var extendedGraphContOffset: UInt,
    public var extendedAttribContOffset: UInt,
    public var extendedDacOffset: UInt,
    public var extendedValidatorStateOffset: UInt,
    public var extendedMiscDataOffset: UInt,
    public var planeLength: UInt,
    public var plane1Offset: UInt,
    public var plane2Offset: UInt,
    public var plane3Offset: UInt,
    public var plane4Offset: UInt,
    public var vGAStateFlags: UInt,
    public var dIBOffset: UInt,
    public var dIBBitsPerPixel: UInt,
    public var dIBXResolution: UInt,
    public var dIBYResolution: UInt,
    public var dIBXlatOffset: UInt,
    public var dIBXlatLength: UInt,
    public var vesaInfoOffset: UInt,
    frameBufferDataCtorArg: MutPtr,
) {
    public var frameBufferData: MutPtr = frameBufferDataCtorArg
        internal set

    public constructor() : this(
        length = 0u,
        portValue = UByteArray(48),
        attribIndexDataState = 0u,
        basicSequencerOffset = 0u,
        basicCrtContOffset = 0u,
        basicGraphContOffset = 0u,
        basicAttribContOffset = 0u,
        basicDacOffset = 0u,
        basicLatchesOffset = 0u,
        extendedSequencerOffset = 0u,
        extendedCrtContOffset = 0u,
        extendedGraphContOffset = 0u,
        extendedAttribContOffset = 0u,
        extendedDacOffset = 0u,
        extendedValidatorStateOffset = 0u,
        extendedMiscDataOffset = 0u,
        planeLength = 0u,
        plane1Offset = 0u,
        plane2Offset = 0u,
        plane3Offset = 0u,
        plane4Offset = 0u,
        vGAStateFlags = 0u,
        dIBOffset = 0u,
        dIBBitsPerPixel = 0u,
        dIBXResolution = 0u,
        dIBYResolution = 0u,
        dIBXlatOffset = 0u,
        dIBXlatLength = 0u,
        vesaInfoOffset = 0u,
        frameBufferDataCtorArg = MutPtr(0L),
    )

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoHardwareStateHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoHardwareStateHeader> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 168L
                override fun readNative(addr: Long): VideoHardwareStateHeader =
                    VideoHardwareStateHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (48).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 100L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 108L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 116L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 124L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 140L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 148L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 156L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 160L),
                    )
                override fun writeNative(addr: Long, value: VideoHardwareStateHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (48).toInt())
                    ).writeNative(addr + 4L, value.portValue.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.attribIndexDataState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.basicSequencerOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.basicCrtContOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.basicGraphContOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.basicAttribContOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.basicDacOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.basicLatchesOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.extendedSequencerOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.extendedCrtContOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.extendedGraphContOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.extendedAttribContOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 96L, value.extendedDacOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 100L, value.extendedValidatorStateOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 104L, value.extendedMiscDataOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.planeLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 112L, value.plane1Offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 116L, value.plane2Offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 120L, value.plane3Offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 124L, value.plane4Offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.vGAStateFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 132L, value.dIBOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.dIBBitsPerPixel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 140L, value.dIBXResolution)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 144L, value.dIBYResolution)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 148L, value.dIBXlatOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 152L, value.dIBXlatLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 156L, value.vesaInfoOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 160L, value.frameBufferData)
                }
            }

        public operator fun invoke(
            length: UInt = 0u,
            portValue: UByteArray = UByteArray(48),
            attribIndexDataState: UInt = 0u,
            basicSequencerOffset: UInt = 0u,
            basicCrtContOffset: UInt = 0u,
            basicGraphContOffset: UInt = 0u,
            basicAttribContOffset: UInt = 0u,
            basicDacOffset: UInt = 0u,
            basicLatchesOffset: UInt = 0u,
            extendedSequencerOffset: UInt = 0u,
            extendedCrtContOffset: UInt = 0u,
            extendedGraphContOffset: UInt = 0u,
            extendedAttribContOffset: UInt = 0u,
            extendedDacOffset: UInt = 0u,
            extendedValidatorStateOffset: UInt = 0u,
            extendedMiscDataOffset: UInt = 0u,
            planeLength: UInt = 0u,
            plane1Offset: UInt = 0u,
            plane2Offset: UInt = 0u,
            plane3Offset: UInt = 0u,
            plane4Offset: UInt = 0u,
            vGAStateFlags: UInt = 0u,
            dIBOffset: UInt = 0u,
            dIBBitsPerPixel: UInt = 0u,
            dIBXResolution: UInt = 0u,
            dIBYResolution: UInt = 0u,
            dIBXlatOffset: UInt = 0u,
            dIBXlatLength: UInt = 0u,
            vesaInfoOffset: UInt = 0u,
            frameBufferData: MutPtr = MutPtr(0L),
        ): VideoHardwareStateHeader =
            VideoHardwareStateHeader(
                length = length,
                portValue = portValue,
                attribIndexDataState = attribIndexDataState,
                basicSequencerOffset = basicSequencerOffset,
                basicCrtContOffset = basicCrtContOffset,
                basicGraphContOffset = basicGraphContOffset,
                basicAttribContOffset = basicAttribContOffset,
                basicDacOffset = basicDacOffset,
                basicLatchesOffset = basicLatchesOffset,
                extendedSequencerOffset = extendedSequencerOffset,
                extendedCrtContOffset = extendedCrtContOffset,
                extendedGraphContOffset = extendedGraphContOffset,
                extendedAttribContOffset = extendedAttribContOffset,
                extendedDacOffset = extendedDacOffset,
                extendedValidatorStateOffset = extendedValidatorStateOffset,
                extendedMiscDataOffset = extendedMiscDataOffset,
                planeLength = planeLength,
                plane1Offset = plane1Offset,
                plane2Offset = plane2Offset,
                plane3Offset = plane3Offset,
                plane4Offset = plane4Offset,
                vGAStateFlags = vGAStateFlags,
                dIBOffset = dIBOffset,
                dIBBitsPerPixel = dIBBitsPerPixel,
                dIBXResolution = dIBXResolution,
                dIBYResolution = dIBYResolution,
                dIBXlatOffset = dIBXlatOffset,
                dIBXlatLength = dIBXlatLength,
                vesaInfoOffset = vesaInfoOffset,
                frameBufferDataCtorArg = frameBufferData,
            )
    }
}

public data class VideoLoadFontInformation(
    public var widthInPixels: UShort = 0u,
    public var heightInPixels: UShort = 0u,
    public var fontSize: UInt = 0u,
    public var font: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VideoLoadFontInformation) return false
        if (this.widthInPixels != other.widthInPixels) return false
        if (this.heightInPixels != other.heightInPixels) return false
        if (this.fontSize != other.fontSize) return false
        if (!this.font.contentEquals(other.font)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.widthInPixels.hashCode()
        result = 31 * result + this.heightInPixels.hashCode()
        result = 31 * result + this.fontSize.hashCode()
        result = 31 * result + this.font.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoLoadFontInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoLoadFontInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): VideoLoadFontInformation =
                    VideoLoadFontInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: VideoLoadFontInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.widthInPixels)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.heightInPixels)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.fontSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.font.toList())
                }
            }
    }
}

public data class VideoLutRgb256words(
    public var red: UShortArray = UShortArray(256),
    public var green: UShortArray = UShortArray(256),
    public var blue: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VideoLutRgb256words) return false
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
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoLutRgb256words> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoLutRgb256words> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 1536L
                override fun readNative(addr: Long): VideoLutRgb256words =
                    VideoLutRgb256words(
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
                override fun writeNative(addr: Long, value: VideoLutRgb256words) {
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

public class VideoMemory internal constructor(
    requestedVirtualAddressCtorArg: MutPtr,
) {
    public var requestedVirtualAddress: MutPtr = requestedVirtualAddressCtorArg
        internal set

    public constructor() : this(
        requestedVirtualAddressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.requestedVirtualAddress

    public fun copy(requestedVirtualAddress: MutPtr = this.requestedVirtualAddress): VideoMemory = VideoMemory(requestedVirtualAddressCtorArg = requestedVirtualAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VideoMemory) return false
        if (this.requestedVirtualAddress != other.requestedVirtualAddress) return false
        return true
    }

    override fun hashCode(): Int = this.requestedVirtualAddress.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoMemory> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoMemory> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): VideoMemory =
                    VideoMemory(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: VideoMemory) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.requestedVirtualAddress)
                }
            }

        public operator fun invoke(
            requestedVirtualAddress: MutPtr = MutPtr(0L),
        ): VideoMemory =
            VideoMemory(
                requestedVirtualAddressCtorArg = requestedVirtualAddress,
            )
    }
}

public class VideoMemoryInformation internal constructor(
    videoRamBaseCtorArg: MutPtr,
    public var videoRamLength: UInt,
    frameBufferBaseCtorArg: MutPtr,
    public var frameBufferLength: UInt,
) {
    public var videoRamBase: MutPtr = videoRamBaseCtorArg
        internal set

    public var frameBufferBase: MutPtr = frameBufferBaseCtorArg
        internal set

    public constructor() : this(
        videoRamBaseCtorArg = MutPtr(0L),
        videoRamLength = 0u,
        frameBufferBaseCtorArg = MutPtr(0L),
        frameBufferLength = 0u,
    )

    public operator fun component1(): MutPtr = this.videoRamBase

    public operator fun component2(): UInt = this.videoRamLength

    public operator fun component3(): MutPtr = this.frameBufferBase

    public operator fun component4(): UInt = this.frameBufferLength

    public fun copy(videoRamBase: MutPtr = this.videoRamBase, videoRamLength: UInt = this.videoRamLength, frameBufferBase: MutPtr = this.frameBufferBase, frameBufferLength: UInt = this.frameBufferLength): VideoMemoryInformation = VideoMemoryInformation(videoRamBaseCtorArg = videoRamBase, videoRamLength = videoRamLength, frameBufferBaseCtorArg = frameBufferBase, frameBufferLength = frameBufferLength)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VideoMemoryInformation) return false
        if (this.videoRamBase != other.videoRamBase) return false
        if (this.videoRamLength != other.videoRamLength) return false
        if (this.frameBufferBase != other.frameBufferBase) return false
        if (this.frameBufferLength != other.frameBufferLength) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.videoRamBase.hashCode()
        result = 31 * result + this.videoRamLength.hashCode()
        result = 31 * result + this.frameBufferBase.hashCode()
        result = 31 * result + this.frameBufferLength.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoMemoryInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoMemoryInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): VideoMemoryInformation =
                    VideoMemoryInformation(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: VideoMemoryInformation) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.videoRamBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.videoRamLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.frameBufferBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.frameBufferLength)
                }
            }

        public operator fun invoke(
            videoRamBase: MutPtr = MutPtr(0L),
            videoRamLength: UInt = 0u,
            frameBufferBase: MutPtr = MutPtr(0L),
            frameBufferLength: UInt = 0u,
        ): VideoMemoryInformation =
            VideoMemoryInformation(
                videoRamBaseCtorArg = videoRamBase,
                videoRamLength = videoRamLength,
                frameBufferBaseCtorArg = frameBufferBase,
                frameBufferLength = frameBufferLength,
            )
    }
}

public data class VideoMode(
    public var requestedMode: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoMode> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoMode> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): VideoMode =
                    VideoMode(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: VideoMode) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.requestedMode)
                }
            }
    }
}

public class VideoModeInformation(
    public var length: UInt = 0u,
    public var modeIndex: UInt = 0u,
    public var visScreenWidth: UInt = 0u,
    public var visScreenHeight: UInt = 0u,
    public var screenStride: UInt = 0u,
    public var numberOfPlanes: UInt = 0u,
    public var bitsPerPlane: UInt = 0u,
    public var frequency: UInt = 0u,
    public var xMillimeter: UInt = 0u,
    public var yMillimeter: UInt = 0u,
    public var numberRedBits: UInt = 0u,
    public var numberGreenBits: UInt = 0u,
    public var numberBlueBits: UInt = 0u,
    public var redMask: UInt = 0u,
    public var greenMask: UInt = 0u,
    public var blueMask: UInt = 0u,
    public var attributeFlags: UInt = 0u,
    public var videoMemoryBitmapWidth: UInt = 0u,
    public var videoMemoryBitmapHeight: UInt = 0u,
    public var driverSpecificAttributeFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoModeInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoModeInformation> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): VideoModeInformation =
                    VideoModeInformation(
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                    )
                override fun writeNative(addr: Long, value: VideoModeInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.modeIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.visScreenWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.visScreenHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.screenStride)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.numberOfPlanes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.bitsPerPlane)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.frequency)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.xMillimeter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.yMillimeter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.numberRedBits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.numberGreenBits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.numberBlueBits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.redMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.greenMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.blueMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.attributeFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.videoMemoryBitmapWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.videoMemoryBitmapHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.driverSpecificAttributeFlags)
                }
            }
    }
}

public data class VideoMonitorDescriptor(
    public var descriptorSize: UInt = 0u,
    public var descriptor: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VideoMonitorDescriptor) return false
        if (this.descriptorSize != other.descriptorSize) return false
        if (!this.descriptor.contentEquals(other.descriptor)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.descriptorSize.hashCode()
        result = 31 * result + this.descriptor.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoMonitorDescriptor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoMonitorDescriptor> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): VideoMonitorDescriptor =
                    VideoMonitorDescriptor(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: VideoMonitorDescriptor) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.descriptorSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 4L, value.descriptor.toList())
                }
            }
    }
}

public data class VideoNumModes(
    public var numModes: UInt = 0u,
    public var modeInformationLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoNumModes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoNumModes> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): VideoNumModes =
                    VideoNumModes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: VideoNumModes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numModes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.modeInformationLength)
                }
            }
    }
}

public data class VideoPaletteData(
    public var numEntries: UShort = 0u,
    public var firstEntry: UShort = 0u,
    public var colors: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VideoPaletteData) return false
        if (this.numEntries != other.numEntries) return false
        if (this.firstEntry != other.firstEntry) return false
        if (!this.colors.contentEquals(other.colors)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numEntries.hashCode()
        result = 31 * result + this.firstEntry.hashCode()
        result = 31 * result + this.colors.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoPaletteData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoPaletteData> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): VideoPaletteData =
                    VideoPaletteData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: VideoPaletteData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.numEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.firstEntry)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 4L, value.colors.toList())
                }
            }
    }
}

public class VideoPerformanceCounter(
    public var nbOfAllocationEvicted: ULongArray = ULongArray(10),
    public var nbOfAllocationMarked: ULongArray = ULongArray(10),
    public var nbOfAllocationRestored: ULongArray = ULongArray(10),
    public var kBytesEvicted: ULongArray = ULongArray(10),
    public var kBytesMarked: ULongArray = ULongArray(10),
    public var kBytesRestored: ULongArray = ULongArray(10),
    public var nbProcessCommited: ULong = 0uL,
    public var nbAllocationCommited: ULong = 0uL,
    public var nbAllocationMarked: ULong = 0uL,
    public var kBytesAllocated: ULong = 0uL,
    public var kBytesAvailable: ULong = 0uL,
    public var kBytesCurMarked: ULong = 0uL,
    public var reference: ULong = 0uL,
    public var unreference: ULong = 0uL,
    public var trueReference: ULong = 0uL,
    public var nbOfPageIn: ULong = 0uL,
    public var kBytesPageIn: ULong = 0uL,
    public var nbOfPageOut: ULong = 0uL,
    public var kBytesPageOut: ULong = 0uL,
    public var nbOfRotateOut: ULong = 0uL,
    public var kBytesRotateOut: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoPerformanceCounter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoPerformanceCounter> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 600L
                override fun readNative(addr: Long): VideoPerformanceCounter =
                    VideoPerformanceCounter(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (10).toInt())
                        ).readNative(addr).toULongArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (10).toInt())
                        ).readNative(addr + 80L).toULongArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (10).toInt())
                        ).readNative(addr + 160L).toULongArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (10).toInt())
                        ).readNative(addr + 240L).toULongArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (10).toInt())
                        ).readNative(addr + 320L).toULongArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (10).toInt())
                        ).readNative(addr + 400L).toULongArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 480L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 488L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 496L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 504L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 512L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 520L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 528L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 536L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 544L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 552L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 560L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 568L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 576L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 584L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 592L),
                    )
                override fun writeNative(addr: Long, value: VideoPerformanceCounter) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (10).toInt())
                    ).writeNative(addr, value.nbOfAllocationEvicted.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (10).toInt())
                    ).writeNative(addr + 80L, value.nbOfAllocationMarked.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (10).toInt())
                    ).writeNative(addr + 160L, value.nbOfAllocationRestored.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (10).toInt())
                    ).writeNative(addr + 240L, value.kBytesEvicted.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (10).toInt())
                    ).writeNative(addr + 320L, value.kBytesMarked.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (10).toInt())
                    ).writeNative(addr + 400L, value.kBytesRestored.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 480L, value.nbProcessCommited)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 488L, value.nbAllocationCommited)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 496L, value.nbAllocationMarked)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 504L, value.kBytesAllocated)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 512L, value.kBytesAvailable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 520L, value.kBytesCurMarked)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 528L, value.reference)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 536L, value.unreference)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 544L, value.trueReference)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 552L, value.nbOfPageIn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 560L, value.kBytesPageIn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 568L, value.nbOfPageOut)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 576L, value.kBytesPageOut)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 584L, value.nbOfRotateOut)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 592L, value.kBytesRotateOut)
                }
            }
    }
}

public data class VideoPointerAttributes(
    public var flags: UInt = 0u,
    public var width: UInt = 0u,
    public var height: UInt = 0u,
    public var widthInBytes: UInt = 0u,
    public var enable: UInt = 0u,
    public var column: Short = 0,
    public var row: Short = 0,
    public var pixels: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VideoPointerAttributes) return false
        if (this.flags != other.flags) return false
        if (this.width != other.width) return false
        if (this.height != other.height) return false
        if (this.widthInBytes != other.widthInBytes) return false
        if (this.enable != other.enable) return false
        if (this.column != other.column) return false
        if (this.row != other.row) return false
        if (!this.pixels.contentEquals(other.pixels)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.width.hashCode()
        result = 31 * result + this.height.hashCode()
        result = 31 * result + this.widthInBytes.hashCode()
        result = 31 * result + this.enable.hashCode()
        result = 31 * result + this.column.hashCode()
        result = 31 * result + this.row.hashCode()
        result = 31 * result + this.pixels.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoPointerAttributes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoPointerAttributes> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): VideoPointerAttributes =
                    VideoPointerAttributes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 22L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 24L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: VideoPointerAttributes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.width)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.height)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.widthInBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.enable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 20L, value.column)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 22L, value.row)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 24L, value.pixels.toList())
                }
            }
    }
}

public data class VideoPointerCapabilities(
    public var flags: UInt = 0u,
    public var maxWidth: UInt = 0u,
    public var maxHeight: UInt = 0u,
    public var hWPtrBitmapStart: UInt = 0u,
    public var hWPtrBitmapEnd: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoPointerCapabilities> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoPointerCapabilities> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): VideoPointerCapabilities =
                    VideoPointerCapabilities(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: VideoPointerCapabilities) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.maxHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.hWPtrBitmapStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.hWPtrBitmapEnd)
                }
            }
    }
}

public data class VideoPointerPosition(
    public var column: Short = 0,
    public var row: Short = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoPointerPosition> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoPointerPosition> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): VideoPointerPosition =
                    VideoPointerPosition(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: VideoPointerPosition) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.column)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.row)
                }
            }
    }
}

public data class VideoPowerManagement(
    public var length: UInt = 0u,
    public var dPMSVersion: UInt = 0u,
    public var powerState: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoPowerManagement> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoPowerManagement> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): VideoPowerManagement =
                    VideoPowerManagement(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: VideoPowerManagement) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dPMSVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.powerState)
                }
            }
    }
}

public class VideoPublicAccessRanges internal constructor(
    public var inIoSpace: UInt,
    public var mappedInIoSpace: UInt,
    virtualAddressCtorArg: MutPtr,
) {
    public var virtualAddress: MutPtr = virtualAddressCtorArg
        internal set

    public constructor() : this(
        inIoSpace = 0u,
        mappedInIoSpace = 0u,
        virtualAddressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.inIoSpace

    public operator fun component2(): UInt = this.mappedInIoSpace

    public operator fun component3(): MutPtr = this.virtualAddress

    public fun copy(inIoSpace: UInt = this.inIoSpace, mappedInIoSpace: UInt = this.mappedInIoSpace, virtualAddress: MutPtr = this.virtualAddress): VideoPublicAccessRanges = VideoPublicAccessRanges(inIoSpace = inIoSpace, mappedInIoSpace = mappedInIoSpace, virtualAddressCtorArg = virtualAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VideoPublicAccessRanges) return false
        if (this.inIoSpace != other.inIoSpace) return false
        if (this.mappedInIoSpace != other.mappedInIoSpace) return false
        if (this.virtualAddress != other.virtualAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.inIoSpace.hashCode()
        result = 31 * result + this.mappedInIoSpace.hashCode()
        result = 31 * result + this.virtualAddress.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoPublicAccessRanges> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoPublicAccessRanges> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): VideoPublicAccessRanges =
                    VideoPublicAccessRanges(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: VideoPublicAccessRanges) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.inIoSpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mappedInIoSpace)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.virtualAddress)
                }
            }

        public operator fun invoke(
            inIoSpace: UInt = 0u,
            mappedInIoSpace: UInt = 0u,
            virtualAddress: MutPtr = MutPtr(0L),
        ): VideoPublicAccessRanges =
            VideoPublicAccessRanges(
                inIoSpace = inIoSpace,
                mappedInIoSpace = mappedInIoSpace,
                virtualAddressCtorArg = virtualAddress,
            )
    }
}

public class VideoQueryPerformanceCounter internal constructor(
    public var bufferSize: UInt,
    bufferCtorArg: MutPtr,
) {
    public var buffer: MutPtr = bufferCtorArg
        internal set

    public constructor() : this(
        bufferSize = 0u,
        bufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.bufferSize

    public operator fun component2(): MutPtr = this.buffer

    public fun copy(bufferSize: UInt = this.bufferSize, buffer: MutPtr = this.buffer): VideoQueryPerformanceCounter = VideoQueryPerformanceCounter(bufferSize = bufferSize, bufferCtorArg = buffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VideoQueryPerformanceCounter) return false
        if (this.bufferSize != other.bufferSize) return false
        if (this.buffer != other.buffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bufferSize.hashCode()
        result = 31 * result + this.buffer.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoQueryPerformanceCounter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoQueryPerformanceCounter> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): VideoQueryPerformanceCounter =
                    VideoQueryPerformanceCounter(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: VideoQueryPerformanceCounter) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bufferSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.buffer)
                }
            }

        public operator fun invoke(
            bufferSize: UInt = 0u,
            buffer: MutPtr = MutPtr(0L),
        ): VideoQueryPerformanceCounter =
            VideoQueryPerformanceCounter(
                bufferSize = bufferSize,
                bufferCtorArg = buffer,
            )
    }
}

public data class VideoRegisterVdm(
    public var minimumStateSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoRegisterVdm> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoRegisterVdm> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): VideoRegisterVdm =
                    VideoRegisterVdm(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: VideoRegisterVdm) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.minimumStateSize)
                }
            }
    }
}

public class VideoShareMemory internal constructor(
    processHandleCtorArg: Handle,
    public var viewOffset: UInt,
    public var viewSize: UInt,
    requestedVirtualAddressCtorArg: MutPtr,
) {
    public var processHandle: Handle = processHandleCtorArg
        internal set

    public var requestedVirtualAddress: MutPtr = requestedVirtualAddressCtorArg
        internal set

    public constructor() : this(
        processHandleCtorArg = MutPtr(0L),
        viewOffset = 0u,
        viewSize = 0u,
        requestedVirtualAddressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.processHandle

    public operator fun component2(): UInt = this.viewOffset

    public operator fun component3(): UInt = this.viewSize

    public operator fun component4(): MutPtr = this.requestedVirtualAddress

    public fun copy(processHandle: Handle = this.processHandle, viewOffset: UInt = this.viewOffset, viewSize: UInt = this.viewSize, requestedVirtualAddress: MutPtr = this.requestedVirtualAddress): VideoShareMemory = VideoShareMemory(processHandleCtorArg = processHandle, viewOffset = viewOffset, viewSize = viewSize, requestedVirtualAddressCtorArg = requestedVirtualAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VideoShareMemory) return false
        if (this.processHandle != other.processHandle) return false
        if (this.viewOffset != other.viewOffset) return false
        if (this.viewSize != other.viewSize) return false
        if (this.requestedVirtualAddress != other.requestedVirtualAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.processHandle.hashCode()
        result = 31 * result + this.viewOffset.hashCode()
        result = 31 * result + this.viewSize.hashCode()
        result = 31 * result + this.requestedVirtualAddress.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            processHandle: Handle = MutPtr(0L),
            viewOffset: UInt = 0u,
            viewSize: UInt = 0u,
            requestedVirtualAddress: MutPtr = MutPtr(0L),
        ): VideoShareMemory =
            VideoShareMemory(
                processHandleCtorArg = processHandle,
                viewOffset = viewOffset,
                viewSize = viewSize,
                requestedVirtualAddressCtorArg = requestedVirtualAddress,
            )
    }
}

public class VideoShareMemoryInformation internal constructor(
    public var sharedViewOffset: UInt,
    public var sharedViewSize: UInt,
    virtualAddressCtorArg: MutPtr,
) {
    public var virtualAddress: MutPtr = virtualAddressCtorArg
        internal set

    public constructor() : this(
        sharedViewOffset = 0u,
        sharedViewSize = 0u,
        virtualAddressCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.sharedViewOffset

    public operator fun component2(): UInt = this.sharedViewSize

    public operator fun component3(): MutPtr = this.virtualAddress

    public fun copy(sharedViewOffset: UInt = this.sharedViewOffset, sharedViewSize: UInt = this.sharedViewSize, virtualAddress: MutPtr = this.virtualAddress): VideoShareMemoryInformation = VideoShareMemoryInformation(sharedViewOffset = sharedViewOffset, sharedViewSize = sharedViewSize, virtualAddressCtorArg = virtualAddress)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VideoShareMemoryInformation) return false
        if (this.sharedViewOffset != other.sharedViewOffset) return false
        if (this.sharedViewSize != other.sharedViewSize) return false
        if (this.virtualAddress != other.virtualAddress) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sharedViewOffset.hashCode()
        result = 31 * result + this.sharedViewSize.hashCode()
        result = 31 * result + this.virtualAddress.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoShareMemoryInformation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoShareMemoryInformation> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): VideoShareMemoryInformation =
                    VideoShareMemoryInformation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: VideoShareMemoryInformation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sharedViewOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sharedViewSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.virtualAddress)
                }
            }

        public operator fun invoke(
            sharedViewOffset: UInt = 0u,
            sharedViewSize: UInt = 0u,
            virtualAddress: MutPtr = MutPtr(0L),
        ): VideoShareMemoryInformation =
            VideoShareMemoryInformation(
                sharedViewOffset = sharedViewOffset,
                sharedViewSize = sharedViewSize,
                virtualAddressCtorArg = virtualAddress,
            )
    }
}

public class VideoVdm internal constructor(
    processHandleCtorArg: Handle,
) {
    public var processHandle: Handle = processHandleCtorArg
        internal set

    public constructor() : this(
        processHandleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Handle = this.processHandle

    public fun copy(processHandle: Handle = this.processHandle): VideoVdm = VideoVdm(processHandleCtorArg = processHandle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VideoVdm) return false
        if (this.processHandle != other.processHandle) return false
        return true
    }

    override fun hashCode(): Int = this.processHandle.hashCode()

    public companion object {
        public operator fun invoke(
            processHandle: Handle = MutPtr(0L),
        ): VideoVdm =
            VideoVdm(
                processHandleCtorArg = processHandle,
            )
    }
}

public class VideoWin32kCallbacks internal constructor(
    physDispCtorArg: MutPtr,
    public var callout: PvideoWin32kCallout,
    public var bACPI: UInt,
    pPhysDeviceObjectCtorArg: Handle,
    public var dualviewFlags: UInt,
) {
    public var physDisp: MutPtr = physDispCtorArg
        internal set

    public var pPhysDeviceObject: Handle = pPhysDeviceObjectCtorArg
        internal set

    public constructor() : this(
        physDispCtorArg = MutPtr(0L),
        callout = null,
        bACPI = 0u,
        pPhysDeviceObjectCtorArg = MutPtr(0L),
        dualviewFlags = 0u,
    )

    public operator fun component1(): MutPtr = this.physDisp

    public operator fun component2(): PvideoWin32kCallout = this.callout

    public operator fun component3(): UInt = this.bACPI

    public operator fun component4(): Handle = this.pPhysDeviceObject

    public operator fun component5(): UInt = this.dualviewFlags

    public fun copy(physDisp: MutPtr = this.physDisp, callout: PvideoWin32kCallout = this.callout, bACPI: UInt = this.bACPI, pPhysDeviceObject: Handle = this.pPhysDeviceObject, dualviewFlags: UInt = this.dualviewFlags): VideoWin32kCallbacks = VideoWin32kCallbacks(physDispCtorArg = physDisp, callout = callout, bACPI = bACPI, pPhysDeviceObjectCtorArg = pPhysDeviceObject, dualviewFlags = dualviewFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VideoWin32kCallbacks) return false
        if (this.physDisp != other.physDisp) return false
        if (this.callout != other.callout) return false
        if (this.bACPI != other.bACPI) return false
        if (this.pPhysDeviceObject != other.pPhysDeviceObject) return false
        if (this.dualviewFlags != other.dualviewFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.physDisp.hashCode()
        result = 31 * result + this.callout.hashCode()
        result = 31 * result + this.bACPI.hashCode()
        result = 31 * result + this.pPhysDeviceObject.hashCode()
        result = 31 * result + this.dualviewFlags.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            physDisp: MutPtr = MutPtr(0L),
            callout: PvideoWin32kCallout = null,
            bACPI: UInt = 0u,
            pPhysDeviceObject: Handle = MutPtr(0L),
            dualviewFlags: UInt = 0u,
        ): VideoWin32kCallbacks =
            VideoWin32kCallbacks(
                physDispCtorArg = physDisp,
                callout = callout,
                bACPI = bACPI,
                pPhysDeviceObjectCtorArg = pPhysDeviceObject,
                dualviewFlags = dualviewFlags,
            )
    }
}

public class VideoWin32kCallbacksParams internal constructor(
    public var calloutType: VideoWin32kCallbacksParamsType,
    physDispCtorArg: MutPtr,
    public var param: Int,
    public var status: Int,
    public var lockUserSession: Boolean,
    public var isPostDevice: Boolean,
    public var surpriseRemoval: Boolean,
    public var waitForQueueReady: Boolean,
) {
    public var physDisp: MutPtr = physDispCtorArg
        internal set

    public constructor() : this(
        calloutType = 0,
        physDispCtorArg = MutPtr(0L),
        param = 0,
        status = 0,
        lockUserSession = false,
        isPostDevice = false,
        surpriseRemoval = false,
        waitForQueueReady = false,
    )

    public operator fun component1(): VideoWin32kCallbacksParamsType = this.calloutType

    public operator fun component2(): MutPtr = this.physDisp

    public operator fun component3(): Int = this.param

    public operator fun component4(): Int = this.status

    public operator fun component5(): Boolean = this.lockUserSession

    public operator fun component6(): Boolean = this.isPostDevice

    public operator fun component7(): Boolean = this.surpriseRemoval

    public operator fun component8(): Boolean = this.waitForQueueReady

    public fun copy(calloutType: VideoWin32kCallbacksParamsType = this.calloutType, physDisp: MutPtr = this.physDisp, param: Int = this.param, status: Int = this.status, lockUserSession: Boolean = this.lockUserSession, isPostDevice: Boolean = this.isPostDevice, surpriseRemoval: Boolean = this.surpriseRemoval, waitForQueueReady: Boolean = this.waitForQueueReady): VideoWin32kCallbacksParams = VideoWin32kCallbacksParams(calloutType = calloutType, physDispCtorArg = physDisp, param = param, status = status, lockUserSession = lockUserSession, isPostDevice = isPostDevice, surpriseRemoval = surpriseRemoval, waitForQueueReady = waitForQueueReady)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VideoWin32kCallbacksParams) return false
        if (this.calloutType != other.calloutType) return false
        if (this.physDisp != other.physDisp) return false
        if (this.param != other.param) return false
        if (this.status != other.status) return false
        if (this.lockUserSession != other.lockUserSession) return false
        if (this.isPostDevice != other.isPostDevice) return false
        if (this.surpriseRemoval != other.surpriseRemoval) return false
        if (this.waitForQueueReady != other.waitForQueueReady) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.calloutType.hashCode()
        result = 31 * result + this.physDisp.hashCode()
        result = 31 * result + this.param.hashCode()
        result = 31 * result + this.status.hashCode()
        result = 31 * result + this.lockUserSession.hashCode()
        result = 31 * result + this.isPostDevice.hashCode()
        result = 31 * result + this.surpriseRemoval.hashCode()
        result = 31 * result + this.waitForQueueReady.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoWin32kCallbacksParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VideoWin32kCallbacksParams> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): VideoWin32kCallbacksParams =
                    VideoWin32kCallbacksParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 29L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 30L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).readNative(addr + 31L),
                    )
                override fun writeNative(addr: Long, value: VideoWin32kCallbacksParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.calloutType)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.physDisp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.param)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.status)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 28L, value.lockUserSession)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 29L, value.isPostDevice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 30L, value.surpriseRemoval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.BOOL).writeNative(addr + 31L, value.waitForQueueReady)
                }
            }

        public operator fun invoke(
            calloutType: VideoWin32kCallbacksParamsType = 0,
            physDisp: MutPtr = MutPtr(0L),
            param: Int = 0,
            status: Int = 0,
            lockUserSession: Boolean = false,
            isPostDevice: Boolean = false,
            surpriseRemoval: Boolean = false,
            waitForQueueReady: Boolean = false,
        ): VideoWin32kCallbacksParams =
            VideoWin32kCallbacksParams(
                calloutType = calloutType,
                physDispCtorArg = physDisp,
                param = param,
                status = status,
                lockUserSession = lockUserSession,
                isPostDevice = isPostDevice,
                surpriseRemoval = surpriseRemoval,
                waitForQueueReady = waitForQueueReady,
            )
    }
}

public class Wcrun internal constructor(
    public var wcLow: UShort,
    public var cGlyphs: UShort,
    phgCtorArg: MutPtr,
) {
    public var phg: MutPtr = phgCtorArg
        internal set

    public constructor() : this(
        wcLow = 0u,
        cGlyphs = 0u,
        phgCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.wcLow

    public operator fun component2(): UShort = this.cGlyphs

    public operator fun component3(): MutPtr = this.phg

    public fun copy(wcLow: UShort = this.wcLow, cGlyphs: UShort = this.cGlyphs, phg: MutPtr = this.phg): Wcrun = Wcrun(wcLow = wcLow, cGlyphs = cGlyphs, phgCtorArg = phg)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wcrun) return false
        if (this.wcLow != other.wcLow) return false
        if (this.cGlyphs != other.cGlyphs) return false
        if (this.phg != other.phg) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wcLow.hashCode()
        result = 31 * result + this.cGlyphs.hashCode()
        result = 31 * result + this.phg.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wcrun> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wcrun> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Wcrun =
                    Wcrun(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Wcrun) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wcLow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.cGlyphs)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.phg)
                }
            }

        public operator fun invoke(
            wcLow: UShort = 0u,
            cGlyphs: UShort = 0u,
            phg: MutPtr = MutPtr(0L),
        ): Wcrun =
            Wcrun(
                wcLow = wcLow,
                cGlyphs = cGlyphs,
                phgCtorArg = phg,
            )
    }
}

public class Wndobj internal constructor(
    public var coClient: Clipobj,
    pvConsumerCtorArg: MutPtr,
    public var rclClient: Rectl,
    psoOwnerCtorArg: MutPtr,
) {
    public var pvConsumer: MutPtr = pvConsumerCtorArg
        internal set

    public var psoOwner: MutPtr = psoOwnerCtorArg
        internal set

    public constructor() : this(
        coClient = Clipobj(),
        pvConsumerCtorArg = MutPtr(0L),
        rclClient = Rectl(),
        psoOwnerCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Clipobj = this.coClient

    public operator fun component2(): MutPtr = this.pvConsumer

    public operator fun component3(): Rectl = this.rclClient

    public operator fun component4(): MutPtr = this.psoOwner

    public fun copy(coClient: Clipobj = this.coClient, pvConsumer: MutPtr = this.pvConsumer, rclClient: Rectl = this.rclClient, psoOwner: MutPtr = this.psoOwner): Wndobj = Wndobj(coClient = coClient, pvConsumerCtorArg = pvConsumer, rclClient = rclClient, psoOwnerCtorArg = psoOwner)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wndobj) return false
        if (this.coClient != other.coClient) return false
        if (this.pvConsumer != other.pvConsumer) return false
        if (this.rclClient != other.rclClient) return false
        if (this.psoOwner != other.psoOwner) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.coClient.hashCode()
        result = 31 * result + this.pvConsumer.hashCode()
        result = 31 * result + this.rclClient.hashCode()
        result = 31 * result + this.psoOwner.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            coClient: Clipobj = Clipobj(),
            pvConsumer: MutPtr = MutPtr(0L),
            rclClient: Rectl = Rectl(),
            psoOwner: MutPtr = MutPtr(0L),
        ): Wndobj =
            Wndobj(
                coClient = coClient,
                pvConsumerCtorArg = pvConsumer,
                rclClient = rclClient,
                psoOwnerCtorArg = psoOwner,
            )
    }
}

public data class Xforml(
    public var eM11: Float = 0.0f,
    public var eM12: Float = 0.0f,
    public var eM21: Float = 0.0f,
    public var eM22: Float = 0.0f,
    public var eDx: Float = 0.0f,
    public var eDy: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Xforml> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Xforml> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Xforml =
                    Xforml(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Xforml) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.eM11)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.eM12)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.eM21)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 12L, value.eM22)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 16L, value.eDx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 20L, value.eDy)
                }
            }
    }
}

public data class Xformobj(
    public var ulReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Xformobj> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Xformobj> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Xformobj =
                    Xformobj(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Xformobj) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulReserved)
                }
            }
    }
}

public class Xlateobj internal constructor(
    public var iUniq: UInt,
    public var flXlate: UInt,
    public var iSrcType: UShort,
    public var iDstType: UShort,
    public var cEntries: UInt,
    pulXlateCtorArg: MutPtr,
) {
    public var pulXlate: MutPtr = pulXlateCtorArg
        internal set

    public constructor() : this(
        iUniq = 0u,
        flXlate = 0u,
        iSrcType = 0u,
        iDstType = 0u,
        cEntries = 0u,
        pulXlateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.iUniq

    public operator fun component2(): UInt = this.flXlate

    public operator fun component3(): UShort = this.iSrcType

    public operator fun component4(): UShort = this.iDstType

    public operator fun component5(): UInt = this.cEntries

    public operator fun component6(): MutPtr = this.pulXlate

    public fun copy(iUniq: UInt = this.iUniq, flXlate: UInt = this.flXlate, iSrcType: UShort = this.iSrcType, iDstType: UShort = this.iDstType, cEntries: UInt = this.cEntries, pulXlate: MutPtr = this.pulXlate): Xlateobj = Xlateobj(iUniq = iUniq, flXlate = flXlate, iSrcType = iSrcType, iDstType = iDstType, cEntries = cEntries, pulXlateCtorArg = pulXlate)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Xlateobj) return false
        if (this.iUniq != other.iUniq) return false
        if (this.flXlate != other.flXlate) return false
        if (this.iSrcType != other.iSrcType) return false
        if (this.iDstType != other.iDstType) return false
        if (this.cEntries != other.cEntries) return false
        if (this.pulXlate != other.pulXlate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.iUniq.hashCode()
        result = 31 * result + this.flXlate.hashCode()
        result = 31 * result + this.iSrcType.hashCode()
        result = 31 * result + this.iDstType.hashCode()
        result = 31 * result + this.cEntries.hashCode()
        result = 31 * result + this.pulXlate.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Xlateobj> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Xlateobj> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Xlateobj =
                    Xlateobj(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Xlateobj) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.iUniq)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flXlate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.iSrcType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.iDstType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.pulXlate)
                }
            }

        public operator fun invoke(
            iUniq: UInt = 0u,
            flXlate: UInt = 0u,
            iSrcType: UShort = 0u,
            iDstType: UShort = 0u,
            cEntries: UInt = 0u,
            pulXlate: MutPtr = MutPtr(0L),
        ): Xlateobj =
            Xlateobj(
                iUniq = iUniq,
                flXlate = flXlate,
                iSrcType = iSrcType,
                iDstType = iDstType,
                cEntries = cEntries,
                pulXlateCtorArg = pulXlate,
            )
    }
}
