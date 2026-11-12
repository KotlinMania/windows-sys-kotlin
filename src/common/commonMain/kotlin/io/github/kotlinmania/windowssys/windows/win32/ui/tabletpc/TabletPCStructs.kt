@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.tabletpc

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Colorref
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.system.Variant
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Nmhdr

public data class CharacterRange(
    public var wcLow: UShort = 0u,
    public var cChars: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CharacterRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CharacterRange> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): CharacterRange =
                    CharacterRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: CharacterRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wcLow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.cChars)
                }
            }
    }
}

public class DynamicRendererCachedData internal constructor(
    public var strokeId: Int,
    dynamicRendererCtorArg: MutPtr<CVoid>,
) {
    public var dynamicRenderer: MutPtr<CVoid> = dynamicRendererCtorArg
        internal set

    public constructor() : this(
        strokeId = 0,
        dynamicRendererCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.strokeId

    public operator fun component2(): MutPtr<CVoid> = this.dynamicRenderer

    public fun copy(strokeId: Int = this.strokeId, dynamicRenderer: MutPtr<CVoid> = this.dynamicRenderer): DynamicRendererCachedData = DynamicRendererCachedData(strokeId = strokeId, dynamicRendererCtorArg = dynamicRenderer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DynamicRendererCachedData) return false
        if (this.strokeId != other.strokeId) return false
        if (this.dynamicRenderer != other.dynamicRenderer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.strokeId.hashCode()
        result = 31 * result + this.dynamicRenderer.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DynamicRendererCachedData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DynamicRendererCachedData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): DynamicRendererCachedData =
                    DynamicRendererCachedData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DynamicRendererCachedData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.strokeId)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.dynamicRenderer)
                }
            }

        public operator fun invoke(
            strokeId: Int = 0,
            dynamicRenderer: MutPtr<CVoid> = MutPtr(0L),
        ): DynamicRendererCachedData =
            DynamicRendererCachedData(
                strokeId = strokeId,
                dynamicRendererCtorArg = dynamicRenderer,
            )
    }
}

public data class FlickData(
    public var bitfield: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FlickData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FlickData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): FlickData =
                    FlickData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FlickData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class FlickPoint(
    public var bitfield: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FlickPoint> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FlickPoint> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): FlickPoint =
                    FlickPoint(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FlickPoint) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.bitfield)
                }
            }
    }
}

public data class GestureData(
    public var gestureId: Int = 0,
    public var recoConfidence: Int = 0,
    public var strokeCount: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GestureData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GestureData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): GestureData =
                    GestureData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: GestureData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.gestureId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.recoConfidence)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.strokeCount)
                }
            }
    }
}

public class IecGestureinfo internal constructor(
    public var nmhdr: Nmhdr,
    cursorCtorArg: MutPtr<CVoid>,
    strokesCtorArg: MutPtr<CVoid>,
    public var gestures: Variant.Variant,
) {
    public var cursor: MutPtr<CVoid> = cursorCtorArg
        internal set

    public var strokes: MutPtr<CVoid> = strokesCtorArg
        internal set

    public constructor() : this(
        nmhdr = Nmhdr(),
        cursorCtorArg = MutPtr(0L),
        strokesCtorArg = MutPtr(0L),
        gestures = Variant.Variant(),
    )

    public operator fun component1(): Nmhdr = this.nmhdr

    public operator fun component2(): MutPtr<CVoid> = this.cursor

    public operator fun component3(): MutPtr<CVoid> = this.strokes

    public operator fun component4(): Variant.Variant = this.gestures

    public fun copy(nmhdr: Nmhdr = this.nmhdr, cursor: MutPtr<CVoid> = this.cursor, strokes: MutPtr<CVoid> = this.strokes, gestures: Variant.Variant = this.gestures): IecGestureinfo = IecGestureinfo(nmhdr = nmhdr, cursorCtorArg = cursor, strokesCtorArg = strokes, gestures = gestures)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IecGestureinfo) return false
        if (this.nmhdr != other.nmhdr) return false
        if (this.cursor != other.cursor) return false
        if (this.strokes != other.strokes) return false
        if (this.gestures != other.gestures) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nmhdr.hashCode()
        result = 31 * result + this.cursor.hashCode()
        result = 31 * result + this.strokes.hashCode()
        result = 31 * result + this.gestures.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nmhdr: Nmhdr = Nmhdr(),
            cursor: MutPtr<CVoid> = MutPtr(0L),
            strokes: MutPtr<CVoid> = MutPtr(0L),
            gestures: Variant.Variant = Variant.Variant(),
        ): IecGestureinfo =
            IecGestureinfo(
                nmhdr = nmhdr,
                cursorCtorArg = cursor,
                strokesCtorArg = strokes,
                gestures = gestures,
            )
    }
}

public class IecRecognitionresultinfo internal constructor(
    public var nmhdr: Nmhdr,
    recognitionResultCtorArg: MutPtr<CVoid>,
) {
    public var recognitionResult: MutPtr<CVoid> = recognitionResultCtorArg
        internal set

    public constructor() : this(
        nmhdr = Nmhdr(),
        recognitionResultCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Nmhdr = this.nmhdr

    public operator fun component2(): MutPtr<CVoid> = this.recognitionResult

    public fun copy(nmhdr: Nmhdr = this.nmhdr, recognitionResult: MutPtr<CVoid> = this.recognitionResult): IecRecognitionresultinfo = IecRecognitionresultinfo(nmhdr = nmhdr, recognitionResultCtorArg = recognitionResult)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IecRecognitionresultinfo) return false
        if (this.nmhdr != other.nmhdr) return false
        if (this.recognitionResult != other.recognitionResult) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nmhdr.hashCode()
        result = 31 * result + this.recognitionResult.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nmhdr: Nmhdr = Nmhdr(),
            recognitionResult: MutPtr<CVoid> = MutPtr(0L),
        ): IecRecognitionresultinfo =
            IecRecognitionresultinfo(
                nmhdr = nmhdr,
                recognitionResultCtorArg = recognitionResult,
            )
    }
}

public class IecStrokeinfo internal constructor(
    public var nmhdr: Nmhdr,
    cursorCtorArg: MutPtr<CVoid>,
    strokeCtorArg: MutPtr<CVoid>,
) {
    public var cursor: MutPtr<CVoid> = cursorCtorArg
        internal set

    public var stroke: MutPtr<CVoid> = strokeCtorArg
        internal set

    public constructor() : this(
        nmhdr = Nmhdr(),
        cursorCtorArg = MutPtr(0L),
        strokeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Nmhdr = this.nmhdr

    public operator fun component2(): MutPtr<CVoid> = this.cursor

    public operator fun component3(): MutPtr<CVoid> = this.stroke

    public fun copy(nmhdr: Nmhdr = this.nmhdr, cursor: MutPtr<CVoid> = this.cursor, stroke: MutPtr<CVoid> = this.stroke): IecStrokeinfo = IecStrokeinfo(nmhdr = nmhdr, cursorCtorArg = cursor, strokeCtorArg = stroke)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IecStrokeinfo) return false
        if (this.nmhdr != other.nmhdr) return false
        if (this.cursor != other.cursor) return false
        if (this.stroke != other.stroke) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nmhdr.hashCode()
        result = 31 * result + this.cursor.hashCode()
        result = 31 * result + this.stroke.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nmhdr: Nmhdr = Nmhdr(),
            cursor: MutPtr<CVoid> = MutPtr(0L),
            stroke: MutPtr<CVoid> = MutPtr(0L),
        ): IecStrokeinfo =
            IecStrokeinfo(
                nmhdr = nmhdr,
                cursorCtorArg = cursor,
                strokeCtorArg = stroke,
            )
    }
}

public data class Inkmetric(
    public var iHeight: Int = 0,
    public var iFontAscent: Int = 0,
    public var iFontDescent: Int = 0,
    public var dwFlags: UInt = 0u,
    public var color: Colorref = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Inkmetric> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Inkmetric> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): Inkmetric =
                    Inkmetric(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Inkmetric) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.iHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.iFontAscent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.iFontDescent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.color)
                }
            }
    }
}

public data class InkRecoGuide(
    public var rectWritingBox: Rect = Rect(),
    public var rectDrawnBox: Rect = Rect(),
    public var cRows: Int = 0,
    public var cColumns: Int = 0,
    public var midline: Int = 0,
)

public data class LatticeMetrics(
    public var lsBaseline: LineSegment = LineSegment(),
    public var iMidlineOffset: Short = 0,
)

public data class LineSegment(
    public var ptA: Point = Point(),
    public var ptB: Point = Point(),
)

public class PacketDescription internal constructor(
    public var cbPacketSize: UInt,
    public var cPacketProperties: UInt,
    pPacketPropertiesCtorArg: MutPtr<PacketProperty>,
    public var cButtons: UInt,
    pguidButtonsCtorArg: MutPtr<Guid>,
) {
    public var pPacketProperties: MutPtr<PacketProperty> = pPacketPropertiesCtorArg
        internal set

    public var pguidButtons: MutPtr<Guid> = pguidButtonsCtorArg
        internal set

    public constructor() : this(
        cbPacketSize = 0u,
        cPacketProperties = 0u,
        pPacketPropertiesCtorArg = MutPtr(0L),
        cButtons = 0u,
        pguidButtonsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cbPacketSize

    public operator fun component2(): UInt = this.cPacketProperties

    public operator fun component3(): MutPtr<PacketProperty> = this.pPacketProperties

    public operator fun component4(): UInt = this.cButtons

    public operator fun component5(): MutPtr<Guid> = this.pguidButtons

    public fun copy(cbPacketSize: UInt = this.cbPacketSize, cPacketProperties: UInt = this.cPacketProperties, pPacketProperties: MutPtr<PacketProperty> = this.pPacketProperties, cButtons: UInt = this.cButtons, pguidButtons: MutPtr<Guid> = this.pguidButtons): PacketDescription = PacketDescription(cbPacketSize = cbPacketSize, cPacketProperties = cPacketProperties, pPacketPropertiesCtorArg = pPacketProperties, cButtons = cButtons, pguidButtonsCtorArg = pguidButtons)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PacketDescription) return false
        if (this.cbPacketSize != other.cbPacketSize) return false
        if (this.cPacketProperties != other.cPacketProperties) return false
        if (this.pPacketProperties != other.pPacketProperties) return false
        if (this.cButtons != other.cButtons) return false
        if (this.pguidButtons != other.pguidButtons) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbPacketSize.hashCode()
        result = 31 * result + this.cPacketProperties.hashCode()
        result = 31 * result + this.pPacketProperties.hashCode()
        result = 31 * result + this.cButtons.hashCode()
        result = 31 * result + this.pguidButtons.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PacketDescription> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PacketDescription> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): PacketDescription =
                    PacketDescription(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<PacketProperty>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Guid>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: PacketDescription) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbPacketSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cPacketProperties)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<PacketProperty>(64)
                    ).writeNative(addr + 8L, value.pPacketProperties)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cButtons)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Guid>(64)
                    ).writeNative(addr + 24L, value.pguidButtons)
                }
            }

        public operator fun invoke(
            cbPacketSize: UInt = 0u,
            cPacketProperties: UInt = 0u,
            pPacketProperties: MutPtr<PacketProperty> = MutPtr(0L),
            cButtons: UInt = 0u,
            pguidButtons: MutPtr<Guid> = MutPtr(0L),
        ): PacketDescription =
            PacketDescription(
                cbPacketSize = cbPacketSize,
                cPacketProperties = cPacketProperties,
                pPacketPropertiesCtorArg = pPacketProperties,
                cButtons = cButtons,
                pguidButtonsCtorArg = pguidButtons,
            )
    }
}

public data class PacketProperty(
    public var guid: Guid = Guid(),
    public var propertyMetrics: PropertyMetrics = PropertyMetrics(),
)

public data class PropertyMetrics(
    public var nLogicalMin: Int = 0,
    public var nLogicalMax: Int = 0,
    public var units: PropertyUnits = 0,
    public var fResolution: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PropertyMetrics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PropertyMetrics> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PropertyMetrics =
                    PropertyMetrics(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: PropertyMetrics) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.nLogicalMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.nLogicalMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.units)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 12L, value.fResolution)
                }
            }
    }
}

public data class RecoAttrs(
    public var dwRecoCapabilityFlags: UInt = 0u,
    public var awcVendorName: UShortArray = UShortArray(32),
    public var awcFriendlyName: UShortArray = UShortArray(64),
    public var awLanguageId: UShortArray = UShortArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RecoAttrs) return false
        if (this.dwRecoCapabilityFlags != other.dwRecoCapabilityFlags) return false
        if (!this.awcVendorName.contentEquals(other.awcVendorName)) return false
        if (!this.awcFriendlyName.contentEquals(other.awcFriendlyName)) return false
        if (!this.awLanguageId.contentEquals(other.awLanguageId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwRecoCapabilityFlags.hashCode()
        result = 31 * result + this.awcVendorName.contentHashCode()
        result = 31 * result + this.awcFriendlyName.contentHashCode()
        result = 31 * result + this.awLanguageId.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RecoAttrs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RecoAttrs> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 324L
                override fun readNative(addr: Long): RecoAttrs =
                    RecoAttrs(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 68L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 196L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: RecoAttrs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dwRecoCapabilityFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 4L, value.awcVendorName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 68L, value.awcFriendlyName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 196L, value.awLanguageId.toList())
                }
            }
    }
}

public data class RecoGuide(
    public var xOrigin: Int = 0,
    public var yOrigin: Int = 0,
    public var cxBox: Int = 0,
    public var cyBox: Int = 0,
    public var cxBase: Int = 0,
    public var cyBase: Int = 0,
    public var cHorzBox: Int = 0,
    public var cVertBox: Int = 0,
    public var cyMid: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RecoGuide> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RecoGuide> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): RecoGuide =
                    RecoGuide(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: RecoGuide) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.xOrigin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.yOrigin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.cxBox)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.cyBox)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.cxBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.cyBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.cHorzBox)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.cVertBox)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.cyMid)
                }
            }
    }
}

public class RecoLattice internal constructor(
    public var ulColumnCount: UInt,
    pLatticeColumnsCtorArg: MutPtr<RecoLatticeColumn>,
    public var ulPropertyCount: UInt,
    pGuidPropertiesCtorArg: MutPtr<Guid>,
    public var ulBestResultColumnCount: UInt,
    pulBestResultColumnsCtorArg: MutPtr<UInt>,
    pulBestResultIndexesCtorArg: MutPtr<UInt>,
) {
    public var pLatticeColumns: MutPtr<RecoLatticeColumn> = pLatticeColumnsCtorArg
        internal set

    public var pGuidProperties: MutPtr<Guid> = pGuidPropertiesCtorArg
        internal set

    public var pulBestResultColumns: MutPtr<UInt> = pulBestResultColumnsCtorArg
        internal set

    public var pulBestResultIndexes: MutPtr<UInt> = pulBestResultIndexesCtorArg
        internal set

    public constructor() : this(
        ulColumnCount = 0u,
        pLatticeColumnsCtorArg = MutPtr(0L),
        ulPropertyCount = 0u,
        pGuidPropertiesCtorArg = MutPtr(0L),
        ulBestResultColumnCount = 0u,
        pulBestResultColumnsCtorArg = MutPtr(0L),
        pulBestResultIndexesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.ulColumnCount

    public operator fun component2(): MutPtr<RecoLatticeColumn> = this.pLatticeColumns

    public operator fun component3(): UInt = this.ulPropertyCount

    public operator fun component4(): MutPtr<Guid> = this.pGuidProperties

    public operator fun component5(): UInt = this.ulBestResultColumnCount

    public operator fun component6(): MutPtr<UInt> = this.pulBestResultColumns

    public operator fun component7(): MutPtr<UInt> = this.pulBestResultIndexes

    public fun copy(ulColumnCount: UInt = this.ulColumnCount, pLatticeColumns: MutPtr<RecoLatticeColumn> = this.pLatticeColumns, ulPropertyCount: UInt = this.ulPropertyCount, pGuidProperties: MutPtr<Guid> = this.pGuidProperties, ulBestResultColumnCount: UInt = this.ulBestResultColumnCount, pulBestResultColumns: MutPtr<UInt> = this.pulBestResultColumns, pulBestResultIndexes: MutPtr<UInt> = this.pulBestResultIndexes): RecoLattice = RecoLattice(ulColumnCount = ulColumnCount, pLatticeColumnsCtorArg = pLatticeColumns, ulPropertyCount = ulPropertyCount, pGuidPropertiesCtorArg = pGuidProperties, ulBestResultColumnCount = ulBestResultColumnCount, pulBestResultColumnsCtorArg = pulBestResultColumns, pulBestResultIndexesCtorArg = pulBestResultIndexes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RecoLattice) return false
        if (this.ulColumnCount != other.ulColumnCount) return false
        if (this.pLatticeColumns != other.pLatticeColumns) return false
        if (this.ulPropertyCount != other.ulPropertyCount) return false
        if (this.pGuidProperties != other.pGuidProperties) return false
        if (this.ulBestResultColumnCount != other.ulBestResultColumnCount) return false
        if (this.pulBestResultColumns != other.pulBestResultColumns) return false
        if (this.pulBestResultIndexes != other.pulBestResultIndexes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulColumnCount.hashCode()
        result = 31 * result + this.pLatticeColumns.hashCode()
        result = 31 * result + this.ulPropertyCount.hashCode()
        result = 31 * result + this.pGuidProperties.hashCode()
        result = 31 * result + this.ulBestResultColumnCount.hashCode()
        result = 31 * result + this.pulBestResultColumns.hashCode()
        result = 31 * result + this.pulBestResultIndexes.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RecoLattice> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RecoLattice> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): RecoLattice =
                    RecoLattice(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<RecoLatticeColumn>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Guid>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: RecoLattice) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulColumnCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<RecoLatticeColumn>(64)
                    ).writeNative(addr + 8L, value.pLatticeColumns)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ulPropertyCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Guid>(64)
                    ).writeNative(addr + 24L, value.pGuidProperties)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.ulBestResultColumnCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 40L, value.pulBestResultColumns)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 48L, value.pulBestResultIndexes)
                }
            }

        public operator fun invoke(
            ulColumnCount: UInt = 0u,
            pLatticeColumns: MutPtr<RecoLatticeColumn> = MutPtr(0L),
            ulPropertyCount: UInt = 0u,
            pGuidProperties: MutPtr<Guid> = MutPtr(0L),
            ulBestResultColumnCount: UInt = 0u,
            pulBestResultColumns: MutPtr<UInt> = MutPtr(0L),
            pulBestResultIndexes: MutPtr<UInt> = MutPtr(0L),
        ): RecoLattice =
            RecoLattice(
                ulColumnCount = ulColumnCount,
                pLatticeColumnsCtorArg = pLatticeColumns,
                ulPropertyCount = ulPropertyCount,
                pGuidPropertiesCtorArg = pGuidProperties,
                ulBestResultColumnCount = ulBestResultColumnCount,
                pulBestResultColumnsCtorArg = pulBestResultColumns,
                pulBestResultIndexesCtorArg = pulBestResultIndexes,
            )
    }
}

public class RecoLatticeColumn internal constructor(
    public var key: UInt,
    public var cpProp: RecoLatticeProperties,
    public var cStrokes: UInt,
    pStrokesCtorArg: MutPtr<UInt>,
    public var cLatticeElements: UInt,
    pLatticeElementsCtorArg: MutPtr<RecoLatticeElement>,
) {
    public var pStrokes: MutPtr<UInt> = pStrokesCtorArg
        internal set

    public var pLatticeElements: MutPtr<RecoLatticeElement> = pLatticeElementsCtorArg
        internal set

    public constructor() : this(
        key = 0u,
        cpProp = RecoLatticeProperties(),
        cStrokes = 0u,
        pStrokesCtorArg = MutPtr(0L),
        cLatticeElements = 0u,
        pLatticeElementsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.key

    public operator fun component2(): RecoLatticeProperties = this.cpProp

    public operator fun component3(): UInt = this.cStrokes

    public operator fun component4(): MutPtr<UInt> = this.pStrokes

    public operator fun component5(): UInt = this.cLatticeElements

    public operator fun component6(): MutPtr<RecoLatticeElement> = this.pLatticeElements

    public fun copy(key: UInt = this.key, cpProp: RecoLatticeProperties = this.cpProp, cStrokes: UInt = this.cStrokes, pStrokes: MutPtr<UInt> = this.pStrokes, cLatticeElements: UInt = this.cLatticeElements, pLatticeElements: MutPtr<RecoLatticeElement> = this.pLatticeElements): RecoLatticeColumn = RecoLatticeColumn(key = key, cpProp = cpProp, cStrokes = cStrokes, pStrokesCtorArg = pStrokes, cLatticeElements = cLatticeElements, pLatticeElementsCtorArg = pLatticeElements)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RecoLatticeColumn) return false
        if (this.key != other.key) return false
        if (this.cpProp != other.cpProp) return false
        if (this.cStrokes != other.cStrokes) return false
        if (this.pStrokes != other.pStrokes) return false
        if (this.cLatticeElements != other.cLatticeElements) return false
        if (this.pLatticeElements != other.pLatticeElements) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.key.hashCode()
        result = 31 * result + this.cpProp.hashCode()
        result = 31 * result + this.cStrokes.hashCode()
        result = 31 * result + this.pStrokes.hashCode()
        result = 31 * result + this.cLatticeElements.hashCode()
        result = 31 * result + this.pLatticeElements.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RecoLatticeColumn> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RecoLatticeColumn> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): RecoLatticeColumn =
                    RecoLatticeColumn(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (RecoLatticeProperties.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<RecoLatticeElement>(64)
                        ).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: RecoLatticeColumn) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.key)
                    (RecoLatticeProperties.typeLayout()).writeNative(addr + 8L, value.cpProp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cStrokes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 32L, value.pStrokes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.cLatticeElements)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<RecoLatticeElement>(64)
                    ).writeNative(addr + 48L, value.pLatticeElements)
                }
            }

        public operator fun invoke(
            key: UInt = 0u,
            cpProp: RecoLatticeProperties = RecoLatticeProperties(),
            cStrokes: UInt = 0u,
            pStrokes: MutPtr<UInt> = MutPtr(0L),
            cLatticeElements: UInt = 0u,
            pLatticeElements: MutPtr<RecoLatticeElement> = MutPtr(0L),
        ): RecoLatticeColumn =
            RecoLatticeColumn(
                key = key,
                cpProp = cpProp,
                cStrokes = cStrokes,
                pStrokesCtorArg = pStrokes,
                cLatticeElements = cLatticeElements,
                pLatticeElementsCtorArg = pLatticeElements,
            )
    }
}

public class RecoLatticeElement internal constructor(
    public var score: Int,
    public var type: UShort,
    pDataCtorArg: MutPtr<UByte>,
    public var ulNextColumn: UInt,
    public var ulStrokeNumber: UInt,
    public var epProp: RecoLatticeProperties,
) {
    public var pData: MutPtr<UByte> = pDataCtorArg
        internal set

    public constructor() : this(
        score = 0,
        type = 0u,
        pDataCtorArg = MutPtr(0L),
        ulNextColumn = 0u,
        ulStrokeNumber = 0u,
        epProp = RecoLatticeProperties(),
    )

    public operator fun component1(): Int = this.score

    public operator fun component2(): UShort = this.type

    public operator fun component3(): MutPtr<UByte> = this.pData

    public operator fun component4(): UInt = this.ulNextColumn

    public operator fun component5(): UInt = this.ulStrokeNumber

    public operator fun component6(): RecoLatticeProperties = this.epProp

    public fun copy(score: Int = this.score, type: UShort = this.type, pData: MutPtr<UByte> = this.pData, ulNextColumn: UInt = this.ulNextColumn, ulStrokeNumber: UInt = this.ulStrokeNumber, epProp: RecoLatticeProperties = this.epProp): RecoLatticeElement = RecoLatticeElement(score = score, type = type, pDataCtorArg = pData, ulNextColumn = ulNextColumn, ulStrokeNumber = ulStrokeNumber, epProp = epProp)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RecoLatticeElement) return false
        if (this.score != other.score) return false
        if (this.type != other.type) return false
        if (this.pData != other.pData) return false
        if (this.ulNextColumn != other.ulNextColumn) return false
        if (this.ulStrokeNumber != other.ulStrokeNumber) return false
        if (this.epProp != other.epProp) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.score.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.pData.hashCode()
        result = 31 * result + this.ulNextColumn.hashCode()
        result = 31 * result + this.ulStrokeNumber.hashCode()
        result = 31 * result + this.epProp.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RecoLatticeElement> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RecoLatticeElement> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): RecoLatticeElement =
                    RecoLatticeElement(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (RecoLatticeProperties.typeLayout()).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: RecoLatticeElement) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.score)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.type)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.pData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ulNextColumn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.ulStrokeNumber)
                    (RecoLatticeProperties.typeLayout()).writeNative(addr + 24L, value.epProp)
                }
            }

        public operator fun invoke(
            score: Int = 0,
            type: UShort = 0u,
            pData: MutPtr<UByte> = MutPtr(0L),
            ulNextColumn: UInt = 0u,
            ulStrokeNumber: UInt = 0u,
            epProp: RecoLatticeProperties = RecoLatticeProperties(),
        ): RecoLatticeElement =
            RecoLatticeElement(
                score = score,
                type = type,
                pDataCtorArg = pData,
                ulNextColumn = ulNextColumn,
                ulStrokeNumber = ulStrokeNumber,
                epProp = epProp,
            )
    }
}

public class RecoLatticeProperties internal constructor(
    public var cProperties: UInt,
    apPropsCtorArg: MutPtr<MutPtr<RecoLatticeProperty>>,
) {
    public var apProps: MutPtr<MutPtr<RecoLatticeProperty>> = apPropsCtorArg
        internal set

    public constructor() : this(
        cProperties = 0u,
        apPropsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.cProperties

    public operator fun component2(): MutPtr<MutPtr<RecoLatticeProperty>> = this.apProps

    public fun copy(cProperties: UInt = this.cProperties, apProps: MutPtr<MutPtr<RecoLatticeProperty>> = this.apProps): RecoLatticeProperties = RecoLatticeProperties(cProperties = cProperties, apPropsCtorArg = apProps)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RecoLatticeProperties) return false
        if (this.cProperties != other.cProperties) return false
        if (this.apProps != other.apProps) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cProperties.hashCode()
        result = 31 * result + this.apProps.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RecoLatticeProperties> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RecoLatticeProperties> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): RecoLatticeProperties =
                    RecoLatticeProperties(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<RecoLatticeProperty>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: RecoLatticeProperties) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cProperties)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<RecoLatticeProperty>>(64)
                    ).writeNative(addr + 8L, value.apProps)
                }
            }

        public operator fun invoke(
            cProperties: UInt = 0u,
            apProps: MutPtr<MutPtr<RecoLatticeProperty>> = MutPtr(0L),
        ): RecoLatticeProperties =
            RecoLatticeProperties(
                cProperties = cProperties,
                apPropsCtorArg = apProps,
            )
    }
}

public class RecoLatticeProperty internal constructor(
    public var guidProperty: Guid,
    public var cbPropertyValue: UShort,
    pPropertyValueCtorArg: MutPtr<UByte>,
) {
    public var pPropertyValue: MutPtr<UByte> = pPropertyValueCtorArg
        internal set

    public constructor() : this(
        guidProperty = Guid(),
        cbPropertyValue = 0u,
        pPropertyValueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Guid = this.guidProperty

    public operator fun component2(): UShort = this.cbPropertyValue

    public operator fun component3(): MutPtr<UByte> = this.pPropertyValue

    public fun copy(guidProperty: Guid = this.guidProperty, cbPropertyValue: UShort = this.cbPropertyValue, pPropertyValue: MutPtr<UByte> = this.pPropertyValue): RecoLatticeProperty = RecoLatticeProperty(guidProperty = guidProperty, cbPropertyValue = cbPropertyValue, pPropertyValueCtorArg = pPropertyValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RecoLatticeProperty) return false
        if (this.guidProperty != other.guidProperty) return false
        if (this.cbPropertyValue != other.cbPropertyValue) return false
        if (this.pPropertyValue != other.pPropertyValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.guidProperty.hashCode()
        result = 31 * result + this.cbPropertyValue.hashCode()
        result = 31 * result + this.pPropertyValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            guidProperty: Guid = Guid(),
            cbPropertyValue: UShort = 0u,
            pPropertyValue: MutPtr<UByte> = MutPtr(0L),
        ): RecoLatticeProperty =
            RecoLatticeProperty(
                guidProperty = guidProperty,
                cbPropertyValue = cbPropertyValue,
                pPropertyValueCtorArg = pPropertyValue,
            )
    }
}

public data class RecoRange(
    public var iwcBegin: UInt = 0u,
    public var cCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RecoRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RecoRange> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): RecoRange =
                    RecoRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: RecoRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.iwcBegin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cCount)
                }
            }
    }
}

public data class StrokeRange(
    public var iStrokeBegin: UInt = 0u,
    public var iStrokeEnd: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StrokeRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StrokeRange> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): StrokeRange =
                    StrokeRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: StrokeRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.iStrokeBegin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.iStrokeEnd)
                }
            }
    }
}

public data class SystemEventData(
    public var bModifier: UByte = 0u,
    public var wKey: UShort = 0u,
    public var xPos: Int = 0,
    public var yPos: Int = 0,
    public var bCursorMode: UByte = 0u,
    public var dwButtonState: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemEventData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SystemEventData> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): SystemEventData =
                    SystemEventData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: SystemEventData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bModifier)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.xPos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.yPos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.bCursorMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dwButtonState)
                }
            }
    }
}

public data class StylusInfo(
    public var tcid: UInt = 0u,
    public var cid: UInt = 0u,
    public var bIsInvertedCursor: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StylusInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StylusInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): StylusInfo =
                    StylusInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: StylusInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.tcid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.bIsInvertedCursor)
                }
            }
    }
}
