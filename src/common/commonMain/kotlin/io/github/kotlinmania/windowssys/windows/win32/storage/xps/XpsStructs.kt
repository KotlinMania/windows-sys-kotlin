package io.github.kotlinmania.windowssys.windows.win32.storage.xps

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point

public class Docinfoa internal constructor(
    public var cbSize: Int,
    lpszDocNameCtorArg: Pcstr,
    lpszOutputCtorArg: Pcstr,
    lpszDatatypeCtorArg: Pcstr,
    public var fwType: UInt,
) {
    public var lpszDocName: Pcstr = lpszDocNameCtorArg
        internal set

    public var lpszOutput: Pcstr = lpszOutputCtorArg
        internal set

    public var lpszDatatype: Pcstr = lpszDatatypeCtorArg
        internal set

    public constructor() : this(
        cbSize = 0,
        lpszDocNameCtorArg = ConstPtr(0L),
        lpszOutputCtorArg = ConstPtr(0L),
        lpszDatatypeCtorArg = ConstPtr(0L),
        fwType = 0u,
    )

    public operator fun component1(): Int = this.cbSize

    public operator fun component2(): Pcstr = this.lpszDocName

    public operator fun component3(): Pcstr = this.lpszOutput

    public operator fun component4(): Pcstr = this.lpszDatatype

    public operator fun component5(): UInt = this.fwType

    public fun copy(cbSize: Int = this.cbSize, lpszDocName: Pcstr = this.lpszDocName, lpszOutput: Pcstr = this.lpszOutput, lpszDatatype: Pcstr = this.lpszDatatype, fwType: UInt = this.fwType): Docinfoa = Docinfoa(cbSize = cbSize, lpszDocNameCtorArg = lpszDocName, lpszOutputCtorArg = lpszOutput, lpszDatatypeCtorArg = lpszDatatype, fwType = fwType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Docinfoa) return false
        if (this.cbSize != other.cbSize) return false
        if (this.lpszDocName != other.lpszDocName) return false
        if (this.lpszOutput != other.lpszOutput) return false
        if (this.lpszDatatype != other.lpszDatatype) return false
        if (this.fwType != other.fwType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.lpszDocName.hashCode()
        result = 31 * result + this.lpszOutput.hashCode()
        result = 31 * result + this.lpszDatatype.hashCode()
        result = 31 * result + this.fwType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: Int = 0,
            lpszDocName: Pcstr = ConstPtr(0L),
            lpszOutput: Pcstr = ConstPtr(0L),
            lpszDatatype: Pcstr = ConstPtr(0L),
            fwType: UInt = 0u,
        ): Docinfoa =
            Docinfoa(
                cbSize = cbSize,
                lpszDocNameCtorArg = lpszDocName,
                lpszOutputCtorArg = lpszOutput,
                lpszDatatypeCtorArg = lpszDatatype,
                fwType = fwType,
            )
    }
}

public class Docinfow internal constructor(
    public var cbSize: Int,
    lpszDocNameCtorArg: Pcwstr,
    lpszOutputCtorArg: Pcwstr,
    lpszDatatypeCtorArg: Pcwstr,
    public var fwType: UInt,
) {
    public var lpszDocName: Pcwstr = lpszDocNameCtorArg
        internal set

    public var lpszOutput: Pcwstr = lpszOutputCtorArg
        internal set

    public var lpszDatatype: Pcwstr = lpszDatatypeCtorArg
        internal set

    public constructor() : this(
        cbSize = 0,
        lpszDocNameCtorArg = ConstPtr(0L),
        lpszOutputCtorArg = ConstPtr(0L),
        lpszDatatypeCtorArg = ConstPtr(0L),
        fwType = 0u,
    )

    public operator fun component1(): Int = this.cbSize

    public operator fun component2(): Pcwstr = this.lpszDocName

    public operator fun component3(): Pcwstr = this.lpszOutput

    public operator fun component4(): Pcwstr = this.lpszDatatype

    public operator fun component5(): UInt = this.fwType

    public fun copy(cbSize: Int = this.cbSize, lpszDocName: Pcwstr = this.lpszDocName, lpszOutput: Pcwstr = this.lpszOutput, lpszDatatype: Pcwstr = this.lpszDatatype, fwType: UInt = this.fwType): Docinfow = Docinfow(cbSize = cbSize, lpszDocNameCtorArg = lpszDocName, lpszOutputCtorArg = lpszOutput, lpszDatatypeCtorArg = lpszDatatype, fwType = fwType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Docinfow) return false
        if (this.cbSize != other.cbSize) return false
        if (this.lpszDocName != other.lpszDocName) return false
        if (this.lpszOutput != other.lpszOutput) return false
        if (this.lpszDatatype != other.lpszDatatype) return false
        if (this.fwType != other.fwType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cbSize.hashCode()
        result = 31 * result + this.lpszDocName.hashCode()
        result = 31 * result + this.lpszOutput.hashCode()
        result = 31 * result + this.lpszDatatype.hashCode()
        result = 31 * result + this.fwType.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            cbSize: Int = 0,
            lpszDocName: Pcwstr = ConstPtr(0L),
            lpszOutput: Pcwstr = ConstPtr(0L),
            lpszDatatype: Pcwstr = ConstPtr(0L),
            fwType: UInt = 0u,
        ): Docinfow =
            Docinfow(
                cbSize = cbSize,
                lpszDocNameCtorArg = lpszDocName,
                lpszOutputCtorArg = lpszOutput,
                lpszDatatypeCtorArg = lpszDatatype,
                fwType = fwType,
            )
    }
}

public data class Drawpatrect(
    public var ptPosition: Point = Point(),
    public var ptSize: Point = Point(),
    public var wStyle: UShort = 0u,
    public var wPattern: UShort = 0u,
)

public data class PsfeatureCustpaper(
    public var lOrientation: Int = 0,
    public var lWidth: Int = 0,
    public var lHeight: Int = 0,
    public var lWidthOffset: Int = 0,
    public var lHeightOffset: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PsfeatureCustpaper> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PsfeatureCustpaper> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): PsfeatureCustpaper =
                    PsfeatureCustpaper(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: PsfeatureCustpaper) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.lOrientation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.lWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.lHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.lWidthOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.lHeightOffset)
                }
            }
    }
}

public data class PsfeatureOutput(
    public var bPageIndependent: Bool = 0,
    public var bSetPageDevice: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PsfeatureOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PsfeatureOutput> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PsfeatureOutput =
                    PsfeatureOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PsfeatureOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.bPageIndependent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.bSetPageDevice)
                }
            }
    }
}

public data class Psinjectdata(
    public var dataBytes: UInt = 0u,
    public var injectionPoint: PsinjectPoint = 0u,
    public var pageNumber: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Psinjectdata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Psinjectdata> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Psinjectdata =
                    Psinjectdata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: Psinjectdata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dataBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.injectionPoint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.pageNumber)
                }
            }
    }
}

public data class XpsColor(
    public var colorType: XpsColorType = 0,
    public var value: XpsColor0 = XpsColor0(),
)

public data class XpsColor0(
    public var sRGB: XpsColor00 = XpsColor00(),
    public var scRGB: XpsColor01 = XpsColor01(),
    public var context: XpsColor02 = XpsColor02(),
)

public data class XpsColor02(
    public var channelCount: UByte = 0u,
    public var channels: FloatArray = FloatArray(9),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is XpsColor02) return false
        if (this.channelCount != other.channelCount) return false
        if (!this.channels.contentEquals(other.channels)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.channelCount.hashCode()
        result = 31 * result + this.channels.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XpsColor02> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XpsColor02> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): XpsColor02 =
                    XpsColor02(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32, (9).toInt())
                        ).readNative(addr + 4L).toFloatArray(),
                    )
                override fun writeNative(addr: Long, value: XpsColor02) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.channelCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32, (9).toInt())
                    ).writeNative(addr + 4L, value.channels.toList())
                }
            }
    }
}

public data class XpsColor00(
    public var alpha: UByte = 0u,
    public var red: UByte = 0u,
    public var green: UByte = 0u,
    public var blue: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XpsColor00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XpsColor00> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): XpsColor00 =
                    XpsColor00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: XpsColor00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.alpha)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.red)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.green)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.blue)
                }
            }
    }
}

public data class XpsColor01(
    public var alpha: Float = 0.0f,
    public var red: Float = 0.0f,
    public var green: Float = 0.0f,
    public var blue: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XpsColor01> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XpsColor01> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): XpsColor01 =
                    XpsColor01(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: XpsColor01) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.alpha)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.red)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.green)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 12L, value.blue)
                }
            }
    }
}

public data class XpsDash(
    public var length: Float = 0.0f,
    public var gap: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XpsDash> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XpsDash> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): XpsDash =
                    XpsDash(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: XpsDash) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.gap)
                }
            }
    }
}

public data class XpsGlyphIndex(
    public var index: Int = 0,
    public var advanceWidth: Float = 0.0f,
    public var horizontalOffset: Float = 0.0f,
    public var verticalOffset: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XpsGlyphIndex> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XpsGlyphIndex> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): XpsGlyphIndex =
                    XpsGlyphIndex(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: XpsGlyphIndex) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.index)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.advanceWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.horizontalOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 12L, value.verticalOffset)
                }
            }
    }
}

public data class XpsGlyphMapping(
    public var unicodeStringStart: UInt = 0u,
    public var unicodeStringLength: UShort = 0u,
    public var glyphIndicesStart: UInt = 0u,
    public var glyphIndicesLength: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XpsGlyphMapping> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XpsGlyphMapping> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): XpsGlyphMapping =
                    XpsGlyphMapping(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: XpsGlyphMapping) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.unicodeStringStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.unicodeStringLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.glyphIndicesStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.glyphIndicesLength)
                }
            }
    }
}

public data class XpsMatrix(
    public var m11: Float = 0.0f,
    public var m12: Float = 0.0f,
    public var m21: Float = 0.0f,
    public var m22: Float = 0.0f,
    public var m31: Float = 0.0f,
    public var m32: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XpsMatrix> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XpsMatrix> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): XpsMatrix =
                    XpsMatrix(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: XpsMatrix) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.m11)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.m12)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.m21)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 12L, value.m22)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 16L, value.m31)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 20L, value.m32)
                }
            }
    }
}

public data class XpsPoint(
    public var x: Float = 0.0f,
    public var y: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XpsPoint> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XpsPoint> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): XpsPoint =
                    XpsPoint(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: XpsPoint) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.y)
                }
            }
    }
}

public data class XpsRect(
    public var x: Float = 0.0f,
    public var y: Float = 0.0f,
    public var width: Float = 0.0f,
    public var height: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XpsRect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XpsRect> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): XpsRect =
                    XpsRect(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: XpsRect) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.y)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.width)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 12L, value.height)
                }
            }
    }
}

public data class XpsSize(
    public var width: Float = 0.0f,
    public var height: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XpsSize> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XpsSize> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): XpsSize =
                    XpsSize(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: XpsSize) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.width)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.height)
                }
            }
    }
}
