@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.gdi

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Colorref
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Pointl
import io.github.kotlinmania.windowssys.windows.win32.foundation.Points
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rectl
import io.github.kotlinmania.windowssys.windows.win32.foundation.Size

public data class Abc(
    public var abcA: Int = 0,
    public var abcB: UInt = 0u,
    public var abcC: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Abc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Abc> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Abc =
                    Abc(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Abc) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.abcA)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.abcB)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.abcC)
                }
            }
    }
}

public data class Abcfloat(
    public var abcfA: Float = 0.0f,
    public var abcfB: Float = 0.0f,
    public var abcfC: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Abcfloat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Abcfloat> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Abcfloat =
                    Abcfloat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Abcfloat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.abcfA)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.abcfB)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.abcfC)
                }
            }
    }
}

public data class Abortpath(
    public var emr: Emr = Emr(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Abortpath> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Abortpath> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Abortpath =
                    Abortpath(
                        (Emr.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Abortpath) {
                    (Emr.typeLayout()).writeNative(addr, value.emr)
                }
            }
    }
}

public data class Axeslista(
    public var axlReserved: UInt = 0u,
    public var axlNumAxes: UInt = 0u,
    public var axlAxisInfo: List<Axisinfoa> = List(16) { Axisinfoa() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Axeslista> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Axeslista> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 392L
                override fun readNative(addr: Long): Axeslista =
                    Axeslista(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Axisinfoa.typeLayout(), (16).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Axeslista) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.axlReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.axlNumAxes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Axisinfoa.typeLayout(), (16).toInt())
                    ).writeNative(addr + 8L, value.axlAxisInfo)
                }
            }
    }
}

public data class Axeslistw(
    public var axlReserved: UInt = 0u,
    public var axlNumAxes: UInt = 0u,
    public var axlAxisInfo: List<Axisinfow> = List(16) { Axisinfow() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Axeslistw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Axeslistw> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 648L
                override fun readNative(addr: Long): Axeslistw =
                    Axeslistw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Axisinfow.typeLayout(), (16).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Axeslistw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.axlReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.axlNumAxes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Axisinfow.typeLayout(), (16).toInt())
                    ).writeNative(addr + 8L, value.axlAxisInfo)
                }
            }
    }
}

public data class Axisinfoa(
    public var axMinValue: Int = 0,
    public var axMaxValue: Int = 0,
    public var axAxisName: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Axisinfoa) return false
        if (this.axMinValue != other.axMinValue) return false
        if (this.axMaxValue != other.axMaxValue) return false
        if (!this.axAxisName.contentEquals(other.axAxisName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.axMinValue.hashCode()
        result = 31 * result + this.axMaxValue.hashCode()
        result = 31 * result + this.axAxisName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Axisinfoa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Axisinfoa> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Axisinfoa =
                    Axisinfoa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Axisinfoa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.axMinValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.axMaxValue)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 8L, value.axAxisName.toList())
                }
            }
    }
}

public data class Axisinfow(
    public var axMinValue: Int = 0,
    public var axMaxValue: Int = 0,
    public var axAxisName: UShortArray = UShortArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Axisinfow) return false
        if (this.axMinValue != other.axMinValue) return false
        if (this.axMaxValue != other.axMaxValue) return false
        if (!this.axAxisName.contentEquals(other.axAxisName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.axMinValue.hashCode()
        result = 31 * result + this.axMaxValue.hashCode()
        result = 31 * result + this.axAxisName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Axisinfow> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Axisinfow> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): Axisinfow =
                    Axisinfow(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Axisinfow) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.axMinValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.axMaxValue)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                    ).writeNative(addr + 8L, value.axAxisName.toList())
                }
            }
    }
}

public class Bitmap internal constructor(
    public var bmType: Int,
    public var bmWidth: Int,
    public var bmHeight: Int,
    public var bmWidthBytes: Int,
    public var bmPlanes: UShort,
    public var bmBitsPixel: UShort,
    bmBitsCtorArg: MutPtr<CVoid>,
) {
    public var bmBits: MutPtr<CVoid> = bmBitsCtorArg
        internal set

    public constructor() : this(
        bmType = 0,
        bmWidth = 0,
        bmHeight = 0,
        bmWidthBytes = 0,
        bmPlanes = 0u,
        bmBitsPixel = 0u,
        bmBitsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.bmType

    public operator fun component2(): Int = this.bmWidth

    public operator fun component3(): Int = this.bmHeight

    public operator fun component4(): Int = this.bmWidthBytes

    public operator fun component5(): UShort = this.bmPlanes

    public operator fun component6(): UShort = this.bmBitsPixel

    public operator fun component7(): MutPtr<CVoid> = this.bmBits

    public fun copy(bmType: Int = this.bmType, bmWidth: Int = this.bmWidth, bmHeight: Int = this.bmHeight, bmWidthBytes: Int = this.bmWidthBytes, bmPlanes: UShort = this.bmPlanes, bmBitsPixel: UShort = this.bmBitsPixel, bmBits: MutPtr<CVoid> = this.bmBits): Bitmap = Bitmap(bmType = bmType, bmWidth = bmWidth, bmHeight = bmHeight, bmWidthBytes = bmWidthBytes, bmPlanes = bmPlanes, bmBitsPixel = bmBitsPixel, bmBitsCtorArg = bmBits)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Bitmap) return false
        if (this.bmType != other.bmType) return false
        if (this.bmWidth != other.bmWidth) return false
        if (this.bmHeight != other.bmHeight) return false
        if (this.bmWidthBytes != other.bmWidthBytes) return false
        if (this.bmPlanes != other.bmPlanes) return false
        if (this.bmBitsPixel != other.bmBitsPixel) return false
        if (this.bmBits != other.bmBits) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bmType.hashCode()
        result = 31 * result + this.bmWidth.hashCode()
        result = 31 * result + this.bmHeight.hashCode()
        result = 31 * result + this.bmWidthBytes.hashCode()
        result = 31 * result + this.bmPlanes.hashCode()
        result = 31 * result + this.bmBitsPixel.hashCode()
        result = 31 * result + this.bmBits.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Bitmap> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Bitmap> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Bitmap =
                    Bitmap(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Bitmap) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.bmType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.bmWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.bmHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.bmWidthBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.bmPlanes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.bmBitsPixel)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.bmBits)
                }
            }

        public operator fun invoke(
            bmType: Int = 0,
            bmWidth: Int = 0,
            bmHeight: Int = 0,
            bmWidthBytes: Int = 0,
            bmPlanes: UShort = 0u,
            bmBitsPixel: UShort = 0u,
            bmBits: MutPtr<CVoid> = MutPtr(0L),
        ): Bitmap =
            Bitmap(
                bmType = bmType,
                bmWidth = bmWidth,
                bmHeight = bmHeight,
                bmWidthBytes = bmWidthBytes,
                bmPlanes = bmPlanes,
                bmBitsPixel = bmBitsPixel,
                bmBitsCtorArg = bmBits,
            )
    }
}

public data class Bitmapcoreheader(
    public var bcSize: UInt = 0u,
    public var bcWidth: UShort = 0u,
    public var bcHeight: UShort = 0u,
    public var bcPlanes: UShort = 0u,
    public var bcBitCount: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Bitmapcoreheader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Bitmapcoreheader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Bitmapcoreheader =
                    Bitmapcoreheader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: Bitmapcoreheader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bcSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.bcWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.bcHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.bcPlanes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.bcBitCount)
                }
            }
    }
}

public data class Bitmapcoreinfo(
    public var bmciHeader: Bitmapcoreheader = Bitmapcoreheader(),
    public var bmciColors: List<Rgbtriple> = List(1) { Rgbtriple() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Bitmapcoreinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Bitmapcoreinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Bitmapcoreinfo =
                    Bitmapcoreinfo(
                        (Bitmapcoreheader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Rgbtriple.typeLayout(), (1).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Bitmapcoreinfo) {
                    (Bitmapcoreheader.typeLayout()).writeNative(addr, value.bmciHeader)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Rgbtriple.typeLayout(), (1).toInt())
                    ).writeNative(addr + 12L, value.bmciColors)
                }
            }
    }
}

public data class Bitmapfileheader(
    public var bfType: UShort = 0u,
    public var bfSize: UInt = 0u,
    public var bfReserved1: UShort = 0u,
    public var bfReserved2: UShort = 0u,
    public var bfOffBits: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Bitmapfileheader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Bitmapfileheader> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 14L
                override fun readNative(addr: Long): Bitmapfileheader =
                    Bitmapfileheader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: Bitmapfileheader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bfType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 2L, value.bfSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.bfReserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.bfReserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 10L, value.bfOffBits)
                }
            }
    }
}

public data class Bitmapinfo(
    public var bmiHeader: Bitmapinfoheader = Bitmapinfoheader(),
    public var bmiColors: List<Rgbquad> = List(1) { Rgbquad() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Bitmapinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Bitmapinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 44L
                override fun readNative(addr: Long): Bitmapinfo =
                    Bitmapinfo(
                        (Bitmapinfoheader.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Rgbquad.typeLayout(), (1).toInt())
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: Bitmapinfo) {
                    (Bitmapinfoheader.typeLayout()).writeNative(addr, value.bmiHeader)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Rgbquad.typeLayout(), (1).toInt())
                    ).writeNative(addr + 40L, value.bmiColors)
                }
            }
    }
}

public data class Bitmapinfoheader(
    public var biSize: UInt = 0u,
    public var biWidth: Int = 0,
    public var biHeight: Int = 0,
    public var biPlanes: UShort = 0u,
    public var biBitCount: UShort = 0u,
    public var biCompression: UInt = 0u,
    public var biSizeImage: UInt = 0u,
    public var biXPelsPerMeter: Int = 0,
    public var biYPelsPerMeter: Int = 0,
    public var biClrUsed: UInt = 0u,
    public var biClrImportant: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Bitmapinfoheader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Bitmapinfoheader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): Bitmapinfoheader =
                    Bitmapinfoheader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: Bitmapinfoheader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.biSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.biWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.biHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.biPlanes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.biBitCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.biCompression)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.biSizeImage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.biXPelsPerMeter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.biYPelsPerMeter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.biClrUsed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.biClrImportant)
                }
            }
    }
}

public class Bitmapv4header(
    public var bV4Size: UInt = 0u,
    public var bV4Width: Int = 0,
    public var bV4Height: Int = 0,
    public var bV4Planes: UShort = 0u,
    public var bV4BitCount: UShort = 0u,
    public var bV4V4Compression: BiCompression = 0u,
    public var bV4SizeImage: UInt = 0u,
    public var bV4XPelsPerMeter: Int = 0,
    public var bV4YPelsPerMeter: Int = 0,
    public var bV4ClrUsed: UInt = 0u,
    public var bV4ClrImportant: UInt = 0u,
    public var bV4RedMask: UInt = 0u,
    public var bV4GreenMask: UInt = 0u,
    public var bV4BlueMask: UInt = 0u,
    public var bV4AlphaMask: UInt = 0u,
    public var bV4CSType: UInt = 0u,
    public var bV4Endpoints: Ciexyztriple = Ciexyztriple(),
    public var bV4GammaRed: UInt = 0u,
    public var bV4GammaGreen: UInt = 0u,
    public var bV4GammaBlue: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Bitmapv4header> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Bitmapv4header> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 108L
                override fun readNative(addr: Long): Bitmapv4header =
                    Bitmapv4header(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (Ciexyztriple.typeLayout()).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 100L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 104L),
                    )
                override fun writeNative(addr: Long, value: Bitmapv4header) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bV4Size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.bV4Width)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.bV4Height)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.bV4Planes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.bV4BitCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.bV4V4Compression)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.bV4SizeImage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.bV4XPelsPerMeter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.bV4YPelsPerMeter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.bV4ClrUsed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.bV4ClrImportant)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.bV4RedMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.bV4GreenMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.bV4BlueMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.bV4AlphaMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.bV4CSType)
                    (Ciexyztriple.typeLayout()).writeNative(addr + 60L, value.bV4Endpoints)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 96L, value.bV4GammaRed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 100L, value.bV4GammaGreen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 104L, value.bV4GammaBlue)
                }
            }
    }
}

public class Bitmapv5header(
    public var bV5Size: UInt = 0u,
    public var bV5Width: Int = 0,
    public var bV5Height: Int = 0,
    public var bV5Planes: UShort = 0u,
    public var bV5BitCount: UShort = 0u,
    public var bV5Compression: BiCompression = 0u,
    public var bV5SizeImage: UInt = 0u,
    public var bV5XPelsPerMeter: Int = 0,
    public var bV5YPelsPerMeter: Int = 0,
    public var bV5ClrUsed: UInt = 0u,
    public var bV5ClrImportant: UInt = 0u,
    public var bV5RedMask: UInt = 0u,
    public var bV5GreenMask: UInt = 0u,
    public var bV5BlueMask: UInt = 0u,
    public var bV5AlphaMask: UInt = 0u,
    public var bV5CSType: UInt = 0u,
    public var bV5Endpoints: Ciexyztriple = Ciexyztriple(),
    public var bV5GammaRed: UInt = 0u,
    public var bV5GammaGreen: UInt = 0u,
    public var bV5GammaBlue: UInt = 0u,
    public var bV5Intent: UInt = 0u,
    public var bV5ProfileData: UInt = 0u,
    public var bV5ProfileSize: UInt = 0u,
    public var bV5Reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Bitmapv5header> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Bitmapv5header> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 124L
                override fun readNative(addr: Long): Bitmapv5header =
                    Bitmapv5header(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (Ciexyztriple.typeLayout()).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 100L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 108L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 116L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 120L),
                    )
                override fun writeNative(addr: Long, value: Bitmapv5header) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bV5Size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.bV5Width)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.bV5Height)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.bV5Planes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.bV5BitCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.bV5Compression)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.bV5SizeImage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.bV5XPelsPerMeter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.bV5YPelsPerMeter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.bV5ClrUsed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.bV5ClrImportant)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.bV5RedMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.bV5GreenMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.bV5BlueMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.bV5AlphaMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.bV5CSType)
                    (Ciexyztriple.typeLayout()).writeNative(addr + 60L, value.bV5Endpoints)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 96L, value.bV5GammaRed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 100L, value.bV5GammaGreen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 104L, value.bV5GammaBlue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.bV5Intent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 112L, value.bV5ProfileData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 116L, value.bV5ProfileSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 120L, value.bV5Reserved)
                }
            }
    }
}

public data class Blendfunction(
    public var blendOp: UByte = 0u,
    public var blendFlags: UByte = 0u,
    public var sourceConstantAlpha: UByte = 0u,
    public var alphaFormat: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Blendfunction> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Blendfunction> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Blendfunction =
                    Blendfunction(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: Blendfunction) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.blendOp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.blendFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.sourceConstantAlpha)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.alphaFormat)
                }
            }
    }
}

public data class Ciexyz(
    public var ciexyzX: Int = 0,
    public var ciexyzY: Int = 0,
    public var ciexyzZ: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ciexyz> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ciexyz> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Ciexyz =
                    Ciexyz(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Ciexyz) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.ciexyzX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.ciexyzY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.ciexyzZ)
                }
            }
    }
}

public data class Ciexyztriple(
    public var ciexyzRed: Ciexyz = Ciexyz(),
    public var ciexyzGreen: Ciexyz = Ciexyz(),
    public var ciexyzBlue: Ciexyz = Ciexyz(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ciexyztriple> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ciexyztriple> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): Ciexyztriple =
                    Ciexyztriple(
                        (Ciexyz.typeLayout()).readNative(addr),
                        (Ciexyz.typeLayout()).readNative(addr + 12L),
                        (Ciexyz.typeLayout()).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Ciexyztriple) {
                    (Ciexyz.typeLayout()).writeNative(addr, value.ciexyzRed)
                    (Ciexyz.typeLayout()).writeNative(addr + 12L, value.ciexyzGreen)
                    (Ciexyz.typeLayout()).writeNative(addr + 24L, value.ciexyzBlue)
                }
            }
    }
}

public data class Coloradjustment(
    public var caSize: UShort = 0u,
    public var caFlags: UShort = 0u,
    public var caIlluminantIndex: UShort = 0u,
    public var caRedGamma: UShort = 0u,
    public var caGreenGamma: UShort = 0u,
    public var caBlueGamma: UShort = 0u,
    public var caReferenceBlack: UShort = 0u,
    public var caReferenceWhite: UShort = 0u,
    public var caContrast: Short = 0,
    public var caBrightness: Short = 0,
    public var caColorfulness: Short = 0,
    public var caRedGreenTint: Short = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Coloradjustment> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Coloradjustment> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Coloradjustment =
                    Coloradjustment(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 22L),
                    )
                override fun writeNative(addr: Long, value: Coloradjustment) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.caSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.caFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.caIlluminantIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.caRedGamma)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.caGreenGamma)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.caBlueGamma)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.caReferenceBlack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.caReferenceWhite)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 16L, value.caContrast)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 18L, value.caBrightness)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 20L, value.caColorfulness)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 22L, value.caRedGreenTint)
                }
            }
    }
}

public data class Designvector(
    public var dvReserved: UInt = 0u,
    public var dvNumAxes: UInt = 0u,
    public var dvValues: IntArray = IntArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Designvector) return false
        if (this.dvReserved != other.dvReserved) return false
        if (this.dvNumAxes != other.dvNumAxes) return false
        if (!this.dvValues.contentEquals(other.dvValues)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dvReserved.hashCode()
        result = 31 * result + this.dvNumAxes.hashCode()
        result = 31 * result + this.dvValues.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Designvector> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Designvector> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): Designvector =
                    Designvector(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (16).toInt())
                        ).readNative(addr + 8L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: Designvector) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dvReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dvNumAxes)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (16).toInt())
                    ).writeNative(addr + 8L, value.dvValues.toList())
                }
            }
    }
}

public class Devmodea(
    public var dmDeviceName: UByteArray = UByteArray(32),
    public var dmSpecVersion: UShort = 0u,
    public var dmDriverVersion: UShort = 0u,
    public var dmSize: UShort = 0u,
    public var dmDriverExtra: UShort = 0u,
    public var dmFields: DevmodeFieldFlags = 0u,
    public var anonymous1: Devmodea0 = Devmodea0(),
    public var dmColor: DevmodeColor = 0,
    public var dmDuplex: DevmodeDuplex = 0,
    public var dmYResolution: Short = 0,
    public var dmTTOption: DevmodeTruetypeOption = 0,
    public var dmCollate: DevmodeCollate = 0,
    public var dmFormName: UByteArray = UByteArray(32),
    public var dmLogPixels: UShort = 0u,
    public var dmBitsPerPel: UInt = 0u,
    public var dmPelsWidth: UInt = 0u,
    public var dmPelsHeight: UInt = 0u,
    public var anonymous2: Devmodea1 = Devmodea1(),
    public var dmDisplayFrequency: UInt = 0u,
    public var dmICMMethod: UInt = 0u,
    public var dmICMIntent: UInt = 0u,
    public var dmMediaType: UInt = 0u,
    public var dmDitherType: UInt = 0u,
    public var dmReserved1: UInt = 0u,
    public var dmReserved2: UInt = 0u,
    public var dmPanningWidth: UInt = 0u,
    public var dmPanningHeight: UInt = 0u,
)

public data class Devmodea0(
    public var anonymous1: Devmodea00 = Devmodea00(),
    public var anonymous2: Devmodea01 = Devmodea01(),
)

public data class Devmodea00(
    public var dmOrientation: Short = 0,
    public var dmPaperSize: Short = 0,
    public var dmPaperLength: Short = 0,
    public var dmPaperWidth: Short = 0,
    public var dmScale: Short = 0,
    public var dmCopies: Short = 0,
    public var dmDefaultSource: Short = 0,
    public var dmPrintQuality: Short = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Devmodea00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Devmodea00> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Devmodea00 =
                    Devmodea00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 14L),
                    )
                override fun writeNative(addr: Long, value: Devmodea00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.dmOrientation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.dmPaperSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 4L, value.dmPaperLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 6L, value.dmPaperWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 8L, value.dmScale)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 10L, value.dmCopies)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 12L, value.dmDefaultSource)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 14L, value.dmPrintQuality)
                }
            }
    }
}

public data class Devmodea01(
    public var dmPosition: Pointl = Pointl(),
    public var dmDisplayOrientation: DevmodeDisplayOrientation = 0u,
    public var dmDisplayFixedOutput: DevmodeDisplayFixedOutput = 0u,
)

public data class Devmodea1(
    public var dmDisplayFlags: UInt = 0u,
    public var dmNup: UInt = 0u,
)

public class Devmodew(
    public var dmDeviceName: UShortArray = UShortArray(32),
    public var dmSpecVersion: UShort = 0u,
    public var dmDriverVersion: UShort = 0u,
    public var dmSize: UShort = 0u,
    public var dmDriverExtra: UShort = 0u,
    public var dmFields: DevmodeFieldFlags = 0u,
    public var anonymous1: Devmodew0 = Devmodew0(),
    public var dmColor: DevmodeColor = 0,
    public var dmDuplex: DevmodeDuplex = 0,
    public var dmYResolution: Short = 0,
    public var dmTTOption: DevmodeTruetypeOption = 0,
    public var dmCollate: DevmodeCollate = 0,
    public var dmFormName: UShortArray = UShortArray(32),
    public var dmLogPixels: UShort = 0u,
    public var dmBitsPerPel: UInt = 0u,
    public var dmPelsWidth: UInt = 0u,
    public var dmPelsHeight: UInt = 0u,
    public var anonymous2: Devmodew1 = Devmodew1(),
    public var dmDisplayFrequency: UInt = 0u,
    public var dmICMMethod: UInt = 0u,
    public var dmICMIntent: UInt = 0u,
    public var dmMediaType: UInt = 0u,
    public var dmDitherType: UInt = 0u,
    public var dmReserved1: UInt = 0u,
    public var dmReserved2: UInt = 0u,
    public var dmPanningWidth: UInt = 0u,
    public var dmPanningHeight: UInt = 0u,
)

public data class Devmodew0(
    public var anonymous1: Devmodew00 = Devmodew00(),
    public var anonymous2: Devmodew01 = Devmodew01(),
)

public data class Devmodew00(
    public var dmOrientation: Short = 0,
    public var dmPaperSize: Short = 0,
    public var dmPaperLength: Short = 0,
    public var dmPaperWidth: Short = 0,
    public var dmScale: Short = 0,
    public var dmCopies: Short = 0,
    public var dmDefaultSource: Short = 0,
    public var dmPrintQuality: Short = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Devmodew00> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Devmodew00> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Devmodew00 =
                    Devmodew00(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 14L),
                    )
                override fun writeNative(addr: Long, value: Devmodew00) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.dmOrientation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.dmPaperSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 4L, value.dmPaperLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 6L, value.dmPaperWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 8L, value.dmScale)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 10L, value.dmCopies)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 12L, value.dmDefaultSource)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 14L, value.dmPrintQuality)
                }
            }
    }
}

public data class Devmodew01(
    public var dmPosition: Pointl = Pointl(),
    public var dmDisplayOrientation: DevmodeDisplayOrientation = 0u,
    public var dmDisplayFixedOutput: DevmodeDisplayFixedOutput = 0u,
)

public data class Devmodew1(
    public var dmDisplayFlags: UInt = 0u,
    public var dmNup: UInt = 0u,
)

public class Dibsection internal constructor(
    public var dsBm: Bitmap,
    public var dsBmih: Bitmapinfoheader,
    public var dsBitfields: UIntArray,
    dshSectionCtorArg: Handle,
    public var dsOffset: UInt,
) {
    public var dshSection: Handle = dshSectionCtorArg
        internal set

    public constructor() : this(
        dsBm = Bitmap(),
        dsBmih = Bitmapinfoheader(),
        dsBitfields = UIntArray(3),
        dshSectionCtorArg = MutPtr(0L),
        dsOffset = 0u,
    )

    public operator fun component1(): Bitmap = this.dsBm

    public operator fun component2(): Bitmapinfoheader = this.dsBmih

    public operator fun component3(): UIntArray = this.dsBitfields

    public operator fun component4(): Handle = this.dshSection

    public operator fun component5(): UInt = this.dsOffset

    public fun copy(dsBm: Bitmap = this.dsBm, dsBmih: Bitmapinfoheader = this.dsBmih, dsBitfields: UIntArray = this.dsBitfields, dshSection: Handle = this.dshSection, dsOffset: UInt = this.dsOffset): Dibsection = Dibsection(dsBm = dsBm, dsBmih = dsBmih, dsBitfields = dsBitfields, dshSectionCtorArg = dshSection, dsOffset = dsOffset)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dibsection) return false
        if (this.dsBm != other.dsBm) return false
        if (this.dsBmih != other.dsBmih) return false
        if (!this.dsBitfields.contentEquals(other.dsBitfields)) return false
        if (this.dshSection != other.dshSection) return false
        if (this.dsOffset != other.dsOffset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dsBm.hashCode()
        result = 31 * result + this.dsBmih.hashCode()
        result = 31 * result + this.dsBitfields.contentHashCode()
        result = 31 * result + this.dshSection.hashCode()
        result = 31 * result + this.dsOffset.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dsBm: Bitmap = Bitmap(),
            dsBmih: Bitmapinfoheader = Bitmapinfoheader(),
            dsBitfields: UIntArray = UIntArray(3),
            dshSection: Handle = MutPtr(0L),
            dsOffset: UInt = 0u,
        ): Dibsection =
            Dibsection(
                dsBm = dsBm,
                dsBmih = dsBmih,
                dsBitfields = dsBitfields,
                dshSectionCtorArg = dshSection,
                dsOffset = dsOffset,
            )
    }
}

public data class DisplayDevicea(
    public var cb: UInt = 0u,
    public var deviceName: ByteArray = ByteArray(32),
    public var deviceString: ByteArray = ByteArray(128),
    public var stateFlags: DisplayDeviceStateFlags = 0u,
    public var deviceID: ByteArray = ByteArray(128),
    public var deviceKey: ByteArray = ByteArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DisplayDevicea) return false
        if (this.cb != other.cb) return false
        if (!this.deviceName.contentEquals(other.deviceName)) return false
        if (!this.deviceString.contentEquals(other.deviceString)) return false
        if (this.stateFlags != other.stateFlags) return false
        if (!this.deviceID.contentEquals(other.deviceID)) return false
        if (!this.deviceKey.contentEquals(other.deviceKey)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cb.hashCode()
        result = 31 * result + this.deviceName.contentHashCode()
        result = 31 * result + this.deviceString.contentHashCode()
        result = 31 * result + this.stateFlags.hashCode()
        result = 31 * result + this.deviceID.contentHashCode()
        result = 31 * result + this.deviceKey.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayDevicea> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayDevicea> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 424L
                override fun readNative(addr: Long): DisplayDevicea =
                    DisplayDevicea(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                        ).readNative(addr + 4L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                        ).readNative(addr + 36L).toByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 164L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                        ).readNative(addr + 168L).toByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                        ).readNative(addr + 296L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: DisplayDevicea) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cb)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                    ).writeNative(addr + 4L, value.deviceName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                    ).writeNative(addr + 36L, value.deviceString.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 164L, value.stateFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                    ).writeNative(addr + 168L, value.deviceID.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (128).toInt())
                    ).writeNative(addr + 296L, value.deviceKey.toList())
                }
            }
    }
}

public data class DisplayDevicew(
    public var cb: UInt = 0u,
    public var deviceName: UShortArray = UShortArray(32),
    public var deviceString: UShortArray = UShortArray(128),
    public var stateFlags: DisplayDeviceStateFlags = 0u,
    public var deviceID: UShortArray = UShortArray(128),
    public var deviceKey: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DisplayDevicew) return false
        if (this.cb != other.cb) return false
        if (!this.deviceName.contentEquals(other.deviceName)) return false
        if (!this.deviceString.contentEquals(other.deviceString)) return false
        if (this.stateFlags != other.stateFlags) return false
        if (!this.deviceID.contentEquals(other.deviceID)) return false
        if (!this.deviceKey.contentEquals(other.deviceKey)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cb.hashCode()
        result = 31 * result + this.deviceName.contentHashCode()
        result = 31 * result + this.deviceString.contentHashCode()
        result = 31 * result + this.stateFlags.hashCode()
        result = 31 * result + this.deviceID.contentHashCode()
        result = 31 * result + this.deviceKey.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayDevicew> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DisplayDevicew> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 840L
                override fun readNative(addr: Long): DisplayDevicew =
                    DisplayDevicew(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 4L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                        ).readNative(addr + 68L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 324L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                        ).readNative(addr + 328L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                        ).readNative(addr + 584L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: DisplayDevicew) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cb)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 4L, value.deviceName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                    ).writeNative(addr + 68L, value.deviceString.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 324L, value.stateFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                    ).writeNative(addr + 328L, value.deviceID.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (128).toInt())
                    ).writeNative(addr + 584L, value.deviceKey.toList())
                }
            }
    }
}

public data class Drawtextparams(
    public var cbSize: UInt = 0u,
    public var iTabLength: Int = 0,
    public var iLeftMargin: Int = 0,
    public var iRightMargin: Int = 0,
    public var uiLengthDrawn: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Drawtextparams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Drawtextparams> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): Drawtextparams =
                    Drawtextparams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Drawtextparams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.iTabLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.iLeftMargin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.iRightMargin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.uiLengthDrawn)
                }
            }
    }
}

public data class Emr(
    public var iType: EnhancedMetafileRecordType = 0u,
    public var nSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Emr =
                    Emr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Emr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.iType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nSize)
                }
            }
    }
}

public class Emralphablend(
    public var emr: Emr = Emr(),
    public var rclBounds: Rectl = Rectl(),
    public var xDest: Int = 0,
    public var yDest: Int = 0,
    public var cxDest: Int = 0,
    public var cyDest: Int = 0,
    public var dwRop: UInt = 0u,
    public var xSrc: Int = 0,
    public var ySrc: Int = 0,
    public var xformSrc: Xform = Xform(),
    public var crBkColorSrc: Colorref = 0u,
    public var iUsageSrc: UInt = 0u,
    public var offBmiSrc: UInt = 0u,
    public var cbBmiSrc: UInt = 0u,
    public var offBitsSrc: UInt = 0u,
    public var cbBitsSrc: UInt = 0u,
    public var cxSrc: Int = 0,
    public var cySrc: Int = 0,
)

public data class Emranglearc(
    public var emr: Emr = Emr(),
    public var ptlCenter: Pointl = Pointl(),
    public var nRadius: UInt = 0u,
    public var eStartAngle: Float = 0.0f,
    public var eSweepAngle: Float = 0.0f,
)

public data class Emrarc(
    public var emr: Emr = Emr(),
    public var rclBox: Rectl = Rectl(),
    public var ptlStart: Pointl = Pointl(),
    public var ptlEnd: Pointl = Pointl(),
)

public data class Emrbitblt(
    public var emr: Emr = Emr(),
    public var rclBounds: Rectl = Rectl(),
    public var xDest: Int = 0,
    public var yDest: Int = 0,
    public var cxDest: Int = 0,
    public var cyDest: Int = 0,
    public var dwRop: UInt = 0u,
    public var xSrc: Int = 0,
    public var ySrc: Int = 0,
    public var xformSrc: Xform = Xform(),
    public var crBkColorSrc: Colorref = 0u,
    public var iUsageSrc: UInt = 0u,
    public var offBmiSrc: UInt = 0u,
    public var cbBmiSrc: UInt = 0u,
    public var offBitsSrc: UInt = 0u,
    public var cbBitsSrc: UInt = 0u,
)

public data class Emrcolorcorrectpalette(
    public var emr: Emr = Emr(),
    public var ihPalette: UInt = 0u,
    public var nFirstEntry: UInt = 0u,
    public var nPalEntries: UInt = 0u,
    public var nReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrcolorcorrectpalette> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrcolorcorrectpalette> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Emrcolorcorrectpalette =
                    Emrcolorcorrectpalette(
                        (Emr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Emrcolorcorrectpalette) {
                    (Emr.typeLayout()).writeNative(addr, value.emr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ihPalette)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.nFirstEntry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.nPalEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.nReserved)
                }
            }
    }
}

public data class Emrcolormatchtotarget(
    public var emr: Emr = Emr(),
    public var dwAction: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var cbName: UInt = 0u,
    public var cbData: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Emrcolormatchtotarget) return false
        if (this.emr != other.emr) return false
        if (this.dwAction != other.dwAction) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.cbName != other.cbName) return false
        if (this.cbData != other.cbData) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.emr.hashCode()
        result = 31 * result + this.dwAction.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.cbName.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrcolormatchtotarget> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrcolormatchtotarget> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): Emrcolormatchtotarget =
                    Emrcolormatchtotarget(
                        (Emr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 24L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Emrcolormatchtotarget) {
                    (Emr.typeLayout()).writeNative(addr, value.emr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwAction)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cbData)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 24L, value.data.toList())
                }
            }
    }
}

public data class Emrcreatebrushindirect(
    public var emr: Emr = Emr(),
    public var ihBrush: UInt = 0u,
    public var lb: Logbrush32 = Logbrush32(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrcreatebrushindirect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrcreatebrushindirect> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Emrcreatebrushindirect =
                    Emrcreatebrushindirect(
                        (Emr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (Logbrush32.typeLayout()).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Emrcreatebrushindirect) {
                    (Emr.typeLayout()).writeNative(addr, value.emr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ihBrush)
                    (Logbrush32.typeLayout()).writeNative(addr + 12L, value.lb)
                }
            }
    }
}

public data class Emrcreatedibpatternbrushpt(
    public var emr: Emr = Emr(),
    public var ihBrush: UInt = 0u,
    public var iUsage: UInt = 0u,
    public var offBmi: UInt = 0u,
    public var cbBmi: UInt = 0u,
    public var offBits: UInt = 0u,
    public var cbBits: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrcreatedibpatternbrushpt> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrcreatedibpatternbrushpt> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Emrcreatedibpatternbrushpt =
                    Emrcreatedibpatternbrushpt(
                        (Emr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: Emrcreatedibpatternbrushpt) {
                    (Emr.typeLayout()).writeNative(addr, value.emr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ihBrush)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.iUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.offBmi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cbBmi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.offBits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.cbBits)
                }
            }
    }
}

public data class Emrcreatemonobrush(
    public var emr: Emr = Emr(),
    public var ihBrush: UInt = 0u,
    public var iUsage: UInt = 0u,
    public var offBmi: UInt = 0u,
    public var cbBmi: UInt = 0u,
    public var offBits: UInt = 0u,
    public var cbBits: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrcreatemonobrush> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrcreatemonobrush> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Emrcreatemonobrush =
                    Emrcreatemonobrush(
                        (Emr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: Emrcreatemonobrush) {
                    (Emr.typeLayout()).writeNative(addr, value.emr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ihBrush)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.iUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.offBmi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.cbBmi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.offBits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.cbBits)
                }
            }
    }
}

public data class Emrcreatepalette(
    public var emr: Emr = Emr(),
    public var ihPal: UInt = 0u,
    public var lgpl: Logpalette = Logpalette(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrcreatepalette> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrcreatepalette> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): Emrcreatepalette =
                    Emrcreatepalette(
                        (Emr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (Logpalette.typeLayout()).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Emrcreatepalette) {
                    (Emr.typeLayout()).writeNative(addr, value.emr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ihPal)
                    (Logpalette.typeLayout()).writeNative(addr + 12L, value.lgpl)
                }
            }
    }
}

public data class Emrcreatepen(
    public var emr: Emr = Emr(),
    public var ihPen: UInt = 0u,
    public var lopn: Logpen = Logpen(),
)

public data class Emrellipse(
    public var emr: Emr = Emr(),
    public var rclBox: Rectl = Rectl(),
)

public data class Emreof(
    public var emr: Emr = Emr(),
    public var nPalEntries: UInt = 0u,
    public var offPalEntries: UInt = 0u,
    public var nSizeLast: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emreof> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emreof> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): Emreof =
                    Emreof(
                        (Emr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Emreof) {
                    (Emr.typeLayout()).writeNative(addr, value.emr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nPalEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.offPalEntries)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.nSizeLast)
                }
            }
    }
}

public data class Emrexcludecliprect(
    public var emr: Emr = Emr(),
    public var rclClip: Rectl = Rectl(),
)

public data class Emrextcreatefontindirectw(
    public var emr: Emr = Emr(),
    public var ihFont: UInt = 0u,
    public var elfw: Extlogfontw = Extlogfontw(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrextcreatefontindirectw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrextcreatefontindirectw> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 332L
                override fun readNative(addr: Long): Emrextcreatefontindirectw =
                    Emrextcreatefontindirectw(
                        (Emr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (Extlogfontw.typeLayout()).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Emrextcreatefontindirectw) {
                    (Emr.typeLayout()).writeNative(addr, value.emr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ihFont)
                    (Extlogfontw.typeLayout()).writeNative(addr + 12L, value.elfw)
                }
            }
    }
}

public data class Emrextcreatepen(
    public var emr: Emr = Emr(),
    public var ihPen: UInt = 0u,
    public var offBmi: UInt = 0u,
    public var cbBmi: UInt = 0u,
    public var offBits: UInt = 0u,
    public var cbBits: UInt = 0u,
    public var elp: Extlogpen32 = Extlogpen32(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrextcreatepen> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrextcreatepen> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): Emrextcreatepen =
                    Emrextcreatepen(
                        (Emr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (Extlogpen32.typeLayout()).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: Emrextcreatepen) {
                    (Emr.typeLayout()).writeNative(addr, value.emr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ihPen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.offBmi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbBmi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.offBits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.cbBits)
                    (Extlogpen32.typeLayout()).writeNative(addr + 28L, value.elp)
                }
            }
    }
}

public data class Emrextescape(
    public var emr: Emr = Emr(),
    public var iEscape: Int = 0,
    public var cbEscData: Int = 0,
    public var escData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Emrextescape) return false
        if (this.emr != other.emr) return false
        if (this.iEscape != other.iEscape) return false
        if (this.cbEscData != other.cbEscData) return false
        if (!this.escData.contentEquals(other.escData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.emr.hashCode()
        result = 31 * result + this.iEscape.hashCode()
        result = 31 * result + this.cbEscData.hashCode()
        result = 31 * result + this.escData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrextescape> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrextescape> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): Emrextescape =
                    Emrextescape(
                        (Emr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Emrextescape) {
                    (Emr.typeLayout()).writeNative(addr, value.emr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.iEscape)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.cbEscData)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 16L, value.escData.toList())
                }
            }
    }
}

public data class Emrextfloodfill(
    public var emr: Emr = Emr(),
    public var ptlStart: Pointl = Pointl(),
    public var crColor: Colorref = 0u,
    public var iMode: UInt = 0u,
)

public data class Emrextselectcliprgn(
    public var emr: Emr = Emr(),
    public var cbRgnData: UInt = 0u,
    public var iMode: UInt = 0u,
    public var rgnData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Emrextselectcliprgn) return false
        if (this.emr != other.emr) return false
        if (this.cbRgnData != other.cbRgnData) return false
        if (this.iMode != other.iMode) return false
        if (!this.rgnData.contentEquals(other.rgnData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.emr.hashCode()
        result = 31 * result + this.cbRgnData.hashCode()
        result = 31 * result + this.iMode.hashCode()
        result = 31 * result + this.rgnData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrextselectcliprgn> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrextselectcliprgn> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): Emrextselectcliprgn =
                    Emrextselectcliprgn(
                        (Emr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Emrextselectcliprgn) {
                    (Emr.typeLayout()).writeNative(addr, value.emr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbRgnData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.iMode)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 16L, value.rgnData.toList())
                }
            }
    }
}

public data class Emrexttextouta(
    public var emr: Emr = Emr(),
    public var rclBounds: Rectl = Rectl(),
    public var iGraphicsMode: UInt = 0u,
    public var exScale: Float = 0.0f,
    public var eyScale: Float = 0.0f,
    public var emrtext: Emrtext = Emrtext(),
)

public data class Emrfillpath(
    public var emr: Emr = Emr(),
    public var rclBounds: Rectl = Rectl(),
)

public data class Emrfillrgn(
    public var emr: Emr = Emr(),
    public var rclBounds: Rectl = Rectl(),
    public var cbRgnData: UInt = 0u,
    public var ihBrush: UInt = 0u,
    public var rgnData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Emrfillrgn) return false
        if (this.emr != other.emr) return false
        if (this.rclBounds != other.rclBounds) return false
        if (this.cbRgnData != other.cbRgnData) return false
        if (this.ihBrush != other.ihBrush) return false
        if (!this.rgnData.contentEquals(other.rgnData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.emr.hashCode()
        result = 31 * result + this.rclBounds.hashCode()
        result = 31 * result + this.cbRgnData.hashCode()
        result = 31 * result + this.ihBrush.hashCode()
        result = 31 * result + this.rgnData.contentHashCode()
        return result
    }
}

public data class Emrformat(
    public var dSignature: UInt = 0u,
    public var nVersion: UInt = 0u,
    public var cbData: UInt = 0u,
    public var offData: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrformat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrformat> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Emrformat =
                    Emrformat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Emrformat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dSignature)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.offData)
                }
            }
    }
}

public data class Emrframergn(
    public var emr: Emr = Emr(),
    public var rclBounds: Rectl = Rectl(),
    public var cbRgnData: UInt = 0u,
    public var ihBrush: UInt = 0u,
    public var szlStroke: Size = Size(),
    public var rgnData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Emrframergn) return false
        if (this.emr != other.emr) return false
        if (this.rclBounds != other.rclBounds) return false
        if (this.cbRgnData != other.cbRgnData) return false
        if (this.ihBrush != other.ihBrush) return false
        if (this.szlStroke != other.szlStroke) return false
        if (!this.rgnData.contentEquals(other.rgnData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.emr.hashCode()
        result = 31 * result + this.rclBounds.hashCode()
        result = 31 * result + this.cbRgnData.hashCode()
        result = 31 * result + this.ihBrush.hashCode()
        result = 31 * result + this.szlStroke.hashCode()
        result = 31 * result + this.rgnData.contentHashCode()
        return result
    }
}

public data class Emrgdicomment(
    public var emr: Emr = Emr(),
    public var cbData: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Emrgdicomment) return false
        if (this.emr != other.emr) return false
        if (this.cbData != other.cbData) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.emr.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrgdicomment> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrgdicomment> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Emrgdicomment =
                    Emrgdicomment(
                        (Emr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Emrgdicomment) {
                    (Emr.typeLayout()).writeNative(addr, value.emr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbData)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.data.toList())
                }
            }
    }
}

public data class Emrglsboundedrecord(
    public var emr: Emr = Emr(),
    public var rclBounds: Rectl = Rectl(),
    public var cbData: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Emrglsboundedrecord) return false
        if (this.emr != other.emr) return false
        if (this.rclBounds != other.rclBounds) return false
        if (this.cbData != other.cbData) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.emr.hashCode()
        result = 31 * result + this.rclBounds.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class Emrglsrecord(
    public var emr: Emr = Emr(),
    public var cbData: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Emrglsrecord) return false
        if (this.emr != other.emr) return false
        if (this.cbData != other.cbData) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.emr.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrglsrecord> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrglsrecord> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Emrglsrecord =
                    Emrglsrecord(
                        (Emr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Emrglsrecord) {
                    (Emr.typeLayout()).writeNative(addr, value.emr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cbData)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.data.toList())
                }
            }
    }
}

public data class Emrgradientfill(
    public var emr: Emr = Emr(),
    public var rclBounds: Rectl = Rectl(),
    public var nVer: UInt = 0u,
    public var nTri: UInt = 0u,
    public var ulMode: GradientFill = 0u,
    public var ver: List<Trivertex> = List(1) { Trivertex() },
)

public data class Emrinvertrgn(
    public var emr: Emr = Emr(),
    public var rclBounds: Rectl = Rectl(),
    public var cbRgnData: UInt = 0u,
    public var rgnData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Emrinvertrgn) return false
        if (this.emr != other.emr) return false
        if (this.rclBounds != other.rclBounds) return false
        if (this.cbRgnData != other.cbRgnData) return false
        if (!this.rgnData.contentEquals(other.rgnData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.emr.hashCode()
        result = 31 * result + this.rclBounds.hashCode()
        result = 31 * result + this.cbRgnData.hashCode()
        result = 31 * result + this.rgnData.contentHashCode()
        return result
    }
}

public data class Emrlineto(
    public var emr: Emr = Emr(),
    public var ptl: Pointl = Pointl(),
)

public class Emrmaskblt(
    public var emr: Emr = Emr(),
    public var rclBounds: Rectl = Rectl(),
    public var xDest: Int = 0,
    public var yDest: Int = 0,
    public var cxDest: Int = 0,
    public var cyDest: Int = 0,
    public var dwRop: UInt = 0u,
    public var xSrc: Int = 0,
    public var ySrc: Int = 0,
    public var xformSrc: Xform = Xform(),
    public var crBkColorSrc: Colorref = 0u,
    public var iUsageSrc: UInt = 0u,
    public var offBmiSrc: UInt = 0u,
    public var cbBmiSrc: UInt = 0u,
    public var offBitsSrc: UInt = 0u,
    public var cbBitsSrc: UInt = 0u,
    public var xMask: Int = 0,
    public var yMask: Int = 0,
    public var iUsageMask: UInt = 0u,
    public var offBmiMask: UInt = 0u,
    public var cbBmiMask: UInt = 0u,
    public var offBitsMask: UInt = 0u,
    public var cbBitsMask: UInt = 0u,
)

public data class Emrmodifyworldtransform(
    public var emr: Emr = Emr(),
    public var xform: Xform = Xform(),
    public var iMode: ModifyWorldTransformMode = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrmodifyworldtransform> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrmodifyworldtransform> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): Emrmodifyworldtransform =
                    Emrmodifyworldtransform(
                        (Emr.typeLayout()).readNative(addr),
                        (Xform.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: Emrmodifyworldtransform) {
                    (Emr.typeLayout()).writeNative(addr, value.emr)
                    (Xform.typeLayout()).writeNative(addr + 8L, value.xform)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.iMode)
                }
            }
    }
}

public data class Emrnamedescape(
    public var emr: Emr = Emr(),
    public var iEscape: Int = 0,
    public var cbDriver: Int = 0,
    public var cbEscData: Int = 0,
    public var escData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Emrnamedescape) return false
        if (this.emr != other.emr) return false
        if (this.iEscape != other.iEscape) return false
        if (this.cbDriver != other.cbDriver) return false
        if (this.cbEscData != other.cbEscData) return false
        if (!this.escData.contentEquals(other.escData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.emr.hashCode()
        result = 31 * result + this.iEscape.hashCode()
        result = 31 * result + this.cbDriver.hashCode()
        result = 31 * result + this.cbEscData.hashCode()
        result = 31 * result + this.escData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrnamedescape> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrnamedescape> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Emrnamedescape =
                    Emrnamedescape(
                        (Emr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 20L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Emrnamedescape) {
                    (Emr.typeLayout()).writeNative(addr, value.emr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.iEscape)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.cbDriver)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.cbEscData)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 20L, value.escData.toList())
                }
            }
    }
}

public data class Emroffsetcliprgn(
    public var emr: Emr = Emr(),
    public var ptlOffset: Pointl = Pointl(),
)

public class Emrplgblt(
    public var emr: Emr = Emr(),
    public var rclBounds: Rectl = Rectl(),
    public var aptlDest: List<Pointl> = List(3) { Pointl() },
    public var xSrc: Int = 0,
    public var ySrc: Int = 0,
    public var cxSrc: Int = 0,
    public var cySrc: Int = 0,
    public var xformSrc: Xform = Xform(),
    public var crBkColorSrc: Colorref = 0u,
    public var iUsageSrc: UInt = 0u,
    public var offBmiSrc: UInt = 0u,
    public var cbBmiSrc: UInt = 0u,
    public var offBitsSrc: UInt = 0u,
    public var cbBitsSrc: UInt = 0u,
    public var xMask: Int = 0,
    public var yMask: Int = 0,
    public var iUsageMask: UInt = 0u,
    public var offBmiMask: UInt = 0u,
    public var cbBmiMask: UInt = 0u,
    public var offBitsMask: UInt = 0u,
    public var cbBitsMask: UInt = 0u,
)

public data class Emrpolydraw(
    public var emr: Emr = Emr(),
    public var rclBounds: Rectl = Rectl(),
    public var cptl: UInt = 0u,
    public var aptl: List<Pointl> = List(1) { Pointl() },
    public var abTypes: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Emrpolydraw) return false
        if (this.emr != other.emr) return false
        if (this.rclBounds != other.rclBounds) return false
        if (this.cptl != other.cptl) return false
        if (this.aptl != other.aptl) return false
        if (!this.abTypes.contentEquals(other.abTypes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.emr.hashCode()
        result = 31 * result + this.rclBounds.hashCode()
        result = 31 * result + this.cptl.hashCode()
        result = 31 * result + this.aptl.hashCode()
        result = 31 * result + this.abTypes.contentHashCode()
        return result
    }
}

public data class Emrpolydraw16(
    public var emr: Emr = Emr(),
    public var rclBounds: Rectl = Rectl(),
    public var cpts: UInt = 0u,
    public var apts: List<Points> = List(1) { Points() },
    public var abTypes: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Emrpolydraw16) return false
        if (this.emr != other.emr) return false
        if (this.rclBounds != other.rclBounds) return false
        if (this.cpts != other.cpts) return false
        if (this.apts != other.apts) return false
        if (!this.abTypes.contentEquals(other.abTypes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.emr.hashCode()
        result = 31 * result + this.rclBounds.hashCode()
        result = 31 * result + this.cpts.hashCode()
        result = 31 * result + this.apts.hashCode()
        result = 31 * result + this.abTypes.contentHashCode()
        return result
    }
}

public data class Emrpolyline(
    public var emr: Emr = Emr(),
    public var rclBounds: Rectl = Rectl(),
    public var cptl: UInt = 0u,
    public var aptl: List<Pointl> = List(1) { Pointl() },
)

public data class Emrpolyline16(
    public var emr: Emr = Emr(),
    public var rclBounds: Rectl = Rectl(),
    public var cpts: UInt = 0u,
    public var apts: List<Points> = List(1) { Points() },
)

public data class Emrpolypolyline(
    public var emr: Emr = Emr(),
    public var rclBounds: Rectl = Rectl(),
    public var nPolys: UInt = 0u,
    public var cptl: UInt = 0u,
    public var aPolyCounts: UIntArray = UIntArray(1),
    public var aptl: List<Pointl> = List(1) { Pointl() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Emrpolypolyline) return false
        if (this.emr != other.emr) return false
        if (this.rclBounds != other.rclBounds) return false
        if (this.nPolys != other.nPolys) return false
        if (this.cptl != other.cptl) return false
        if (!this.aPolyCounts.contentEquals(other.aPolyCounts)) return false
        if (this.aptl != other.aptl) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.emr.hashCode()
        result = 31 * result + this.rclBounds.hashCode()
        result = 31 * result + this.nPolys.hashCode()
        result = 31 * result + this.cptl.hashCode()
        result = 31 * result + this.aPolyCounts.contentHashCode()
        result = 31 * result + this.aptl.hashCode()
        return result
    }
}

public data class Emrpolypolyline16(
    public var emr: Emr = Emr(),
    public var rclBounds: Rectl = Rectl(),
    public var nPolys: UInt = 0u,
    public var cpts: UInt = 0u,
    public var aPolyCounts: UIntArray = UIntArray(1),
    public var apts: List<Points> = List(1) { Points() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Emrpolypolyline16) return false
        if (this.emr != other.emr) return false
        if (this.rclBounds != other.rclBounds) return false
        if (this.nPolys != other.nPolys) return false
        if (this.cpts != other.cpts) return false
        if (!this.aPolyCounts.contentEquals(other.aPolyCounts)) return false
        if (this.apts != other.apts) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.emr.hashCode()
        result = 31 * result + this.rclBounds.hashCode()
        result = 31 * result + this.nPolys.hashCode()
        result = 31 * result + this.cpts.hashCode()
        result = 31 * result + this.aPolyCounts.contentHashCode()
        result = 31 * result + this.apts.hashCode()
        return result
    }
}

public data class Emrpolytextouta(
    public var emr: Emr = Emr(),
    public var rclBounds: Rectl = Rectl(),
    public var iGraphicsMode: UInt = 0u,
    public var exScale: Float = 0.0f,
    public var eyScale: Float = 0.0f,
    public var cStrings: Int = 0,
    public var aemrtext: List<Emrtext> = List(1) { Emrtext() },
)

public data class Emrresizepalette(
    public var emr: Emr = Emr(),
    public var ihPal: UInt = 0u,
    public var cEntries: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrresizepalette> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrresizepalette> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Emrresizepalette =
                    Emrresizepalette(
                        (Emr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Emrresizepalette) {
                    (Emr.typeLayout()).writeNative(addr, value.emr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ihPal)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cEntries)
                }
            }
    }
}

public data class Emrrestoredc(
    public var emr: Emr = Emr(),
    public var iRelative: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrrestoredc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrrestoredc> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Emrrestoredc =
                    Emrrestoredc(
                        (Emr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Emrrestoredc) {
                    (Emr.typeLayout()).writeNative(addr, value.emr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.iRelative)
                }
            }
    }
}

public data class Emrroundrect(
    public var emr: Emr = Emr(),
    public var rclBox: Rectl = Rectl(),
    public var szlCorner: Size = Size(),
)

public data class Emrscaleviewportextex(
    public var emr: Emr = Emr(),
    public var xNum: Int = 0,
    public var xDenom: Int = 0,
    public var yNum: Int = 0,
    public var yDenom: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrscaleviewportextex> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrscaleviewportextex> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Emrscaleviewportextex =
                    Emrscaleviewportextex(
                        (Emr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Emrscaleviewportextex) {
                    (Emr.typeLayout()).writeNative(addr, value.emr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.xNum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.xDenom)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.yNum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.yDenom)
                }
            }
    }
}

public data class Emrselectclippath(
    public var emr: Emr = Emr(),
    public var iMode: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrselectclippath> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrselectclippath> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Emrselectclippath =
                    Emrselectclippath(
                        (Emr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Emrselectclippath) {
                    (Emr.typeLayout()).writeNative(addr, value.emr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.iMode)
                }
            }
    }
}

public data class Emrselectobject(
    public var emr: Emr = Emr(),
    public var ihObject: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrselectobject> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrselectobject> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Emrselectobject =
                    Emrselectobject(
                        (Emr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Emrselectobject) {
                    (Emr.typeLayout()).writeNative(addr, value.emr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ihObject)
                }
            }
    }
}

public data class Emrselectpalette(
    public var emr: Emr = Emr(),
    public var ihPal: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrselectpalette> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrselectpalette> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Emrselectpalette =
                    Emrselectpalette(
                        (Emr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Emrselectpalette) {
                    (Emr.typeLayout()).writeNative(addr, value.emr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ihPal)
                }
            }
    }
}

public data class Emrsetarcdirection(
    public var emr: Emr = Emr(),
    public var iArcDirection: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrsetarcdirection> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrsetarcdirection> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Emrsetarcdirection =
                    Emrsetarcdirection(
                        (Emr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Emrsetarcdirection) {
                    (Emr.typeLayout()).writeNative(addr, value.emr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.iArcDirection)
                }
            }
    }
}

public data class Emrsetcoloradjustment(
    public var emr: Emr = Emr(),
    public var colorAdjustment: Coloradjustment = Coloradjustment(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrsetcoloradjustment> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrsetcoloradjustment> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Emrsetcoloradjustment =
                    Emrsetcoloradjustment(
                        (Emr.typeLayout()).readNative(addr),
                        (Coloradjustment.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Emrsetcoloradjustment) {
                    (Emr.typeLayout()).writeNative(addr, value.emr)
                    (Coloradjustment.typeLayout()).writeNative(addr + 8L, value.colorAdjustment)
                }
            }
    }
}

public data class Emrsetcolorspace(
    public var emr: Emr = Emr(),
    public var ihCS: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrsetcolorspace> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrsetcolorspace> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Emrsetcolorspace =
                    Emrsetcolorspace(
                        (Emr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Emrsetcolorspace) {
                    (Emr.typeLayout()).writeNative(addr, value.emr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ihCS)
                }
            }
    }
}

public data class Emrsetdibitstodevice(
    public var emr: Emr = Emr(),
    public var rclBounds: Rectl = Rectl(),
    public var xDest: Int = 0,
    public var yDest: Int = 0,
    public var xSrc: Int = 0,
    public var ySrc: Int = 0,
    public var cxSrc: Int = 0,
    public var cySrc: Int = 0,
    public var offBmiSrc: UInt = 0u,
    public var cbBmiSrc: UInt = 0u,
    public var offBitsSrc: UInt = 0u,
    public var cbBitsSrc: UInt = 0u,
    public var iUsageSrc: UInt = 0u,
    public var iStartScan: UInt = 0u,
    public var cScans: UInt = 0u,
)

public data class Emrseticmprofile(
    public var emr: Emr = Emr(),
    public var dwFlags: UInt = 0u,
    public var cbName: UInt = 0u,
    public var cbData: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Emrseticmprofile) return false
        if (this.emr != other.emr) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.cbName != other.cbName) return false
        if (this.cbData != other.cbData) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.emr.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.cbName.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrseticmprofile> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrseticmprofile> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Emrseticmprofile =
                    Emrseticmprofile(
                        (Emr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 20L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Emrseticmprofile) {
                    (Emr.typeLayout()).writeNative(addr, value.emr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cbName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cbData)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 20L, value.data.toList())
                }
            }
    }
}

public data class Emrsetmapperflags(
    public var emr: Emr = Emr(),
    public var dwFlags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrsetmapperflags> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrsetmapperflags> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Emrsetmapperflags =
                    Emrsetmapperflags(
                        (Emr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Emrsetmapperflags) {
                    (Emr.typeLayout()).writeNative(addr, value.emr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dwFlags)
                }
            }
    }
}

public data class Emrsetmiterlimit(
    public var emr: Emr = Emr(),
    public var eMiterLimit: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrsetmiterlimit> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrsetmiterlimit> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Emrsetmiterlimit =
                    Emrsetmiterlimit(
                        (Emr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Emrsetmiterlimit) {
                    (Emr.typeLayout()).writeNative(addr, value.emr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.eMiterLimit)
                }
            }
    }
}

public data class Emrsetpaletteentries(
    public var emr: Emr = Emr(),
    public var ihPal: UInt = 0u,
    public var iStart: UInt = 0u,
    public var cEntries: UInt = 0u,
    public var aPalEntries: List<Paletteentry> = List(1) { Paletteentry() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrsetpaletteentries> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrsetpaletteentries> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Emrsetpaletteentries =
                    Emrsetpaletteentries(
                        (Emr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Paletteentry.typeLayout(), (1).toInt())
                        ).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Emrsetpaletteentries) {
                    (Emr.typeLayout()).writeNative(addr, value.emr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ihPal)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.iStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.cEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Paletteentry.typeLayout(), (1).toInt())
                    ).writeNative(addr + 20L, value.aPalEntries)
                }
            }
    }
}

public data class Emrsetpixelv(
    public var emr: Emr = Emr(),
    public var ptlPixel: Pointl = Pointl(),
    public var crColor: Colorref = 0u,
)

public data class Emrsettextcolor(
    public var emr: Emr = Emr(),
    public var crColor: Colorref = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrsettextcolor> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrsettextcolor> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Emrsettextcolor =
                    Emrsettextcolor(
                        (Emr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Emrsettextcolor) {
                    (Emr.typeLayout()).writeNative(addr, value.emr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.crColor)
                }
            }
    }
}

public data class Emrsetviewportextex(
    public var emr: Emr = Emr(),
    public var szlExtent: Size = Size(),
)

public data class Emrsetviewportorgex(
    public var emr: Emr = Emr(),
    public var ptlOrigin: Pointl = Pointl(),
)

public data class Emrsetworldtransform(
    public var emr: Emr = Emr(),
    public var xform: Xform = Xform(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrsetworldtransform> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Emrsetworldtransform> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Emrsetworldtransform =
                    Emrsetworldtransform(
                        (Emr.typeLayout()).readNative(addr),
                        (Xform.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Emrsetworldtransform) {
                    (Emr.typeLayout()).writeNative(addr, value.emr)
                    (Xform.typeLayout()).writeNative(addr + 8L, value.xform)
                }
            }
    }
}

public class Emrstretchblt(
    public var emr: Emr = Emr(),
    public var rclBounds: Rectl = Rectl(),
    public var xDest: Int = 0,
    public var yDest: Int = 0,
    public var cxDest: Int = 0,
    public var cyDest: Int = 0,
    public var dwRop: UInt = 0u,
    public var xSrc: Int = 0,
    public var ySrc: Int = 0,
    public var xformSrc: Xform = Xform(),
    public var crBkColorSrc: Colorref = 0u,
    public var iUsageSrc: UInt = 0u,
    public var offBmiSrc: UInt = 0u,
    public var cbBmiSrc: UInt = 0u,
    public var offBitsSrc: UInt = 0u,
    public var cbBitsSrc: UInt = 0u,
    public var cxSrc: Int = 0,
    public var cySrc: Int = 0,
)

public data class Emrstretchdibits(
    public var emr: Emr = Emr(),
    public var rclBounds: Rectl = Rectl(),
    public var xDest: Int = 0,
    public var yDest: Int = 0,
    public var xSrc: Int = 0,
    public var ySrc: Int = 0,
    public var cxSrc: Int = 0,
    public var cySrc: Int = 0,
    public var offBmiSrc: UInt = 0u,
    public var cbBmiSrc: UInt = 0u,
    public var offBitsSrc: UInt = 0u,
    public var cbBitsSrc: UInt = 0u,
    public var iUsageSrc: UInt = 0u,
    public var dwRop: UInt = 0u,
    public var cxDest: Int = 0,
    public var cyDest: Int = 0,
)

public data class Emrtext(
    public var ptlReference: Pointl = Pointl(),
    public var nChars: UInt = 0u,
    public var offString: UInt = 0u,
    public var fOptions: UInt = 0u,
    public var rcl: Rectl = Rectl(),
    public var offDx: UInt = 0u,
)

public class Emrtransparentblt(
    public var emr: Emr = Emr(),
    public var rclBounds: Rectl = Rectl(),
    public var xDest: Int = 0,
    public var yDest: Int = 0,
    public var cxDest: Int = 0,
    public var cyDest: Int = 0,
    public var dwRop: UInt = 0u,
    public var xSrc: Int = 0,
    public var ySrc: Int = 0,
    public var xformSrc: Xform = Xform(),
    public var crBkColorSrc: Colorref = 0u,
    public var iUsageSrc: UInt = 0u,
    public var offBmiSrc: UInt = 0u,
    public var cbBmiSrc: UInt = 0u,
    public var offBitsSrc: UInt = 0u,
    public var cbBitsSrc: UInt = 0u,
    public var cxSrc: Int = 0,
    public var cySrc: Int = 0,
)

public class Enhmetaheader(
    public var iType: UInt = 0u,
    public var nSize: UInt = 0u,
    public var rclBounds: Rectl = Rectl(),
    public var rclFrame: Rectl = Rectl(),
    public var dSignature: UInt = 0u,
    public var nVersion: UInt = 0u,
    public var nBytes: UInt = 0u,
    public var nRecords: UInt = 0u,
    public var nHandles: UShort = 0u,
    public var sReserved: UShort = 0u,
    public var nDescription: UInt = 0u,
    public var offDescription: UInt = 0u,
    public var nPalEntries: UInt = 0u,
    public var szlDevice: Size = Size(),
    public var szlMillimeters: Size = Size(),
    public var cbPixelFormat: UInt = 0u,
    public var offPixelFormat: UInt = 0u,
    public var bOpenGL: UInt = 0u,
    public var szlMicrometers: Size = Size(),
)

public data class Enhmetarecord(
    public var iType: EnhancedMetafileRecordType = 0u,
    public var nSize: UInt = 0u,
    public var dParm: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Enhmetarecord) return false
        if (this.iType != other.iType) return false
        if (this.nSize != other.nSize) return false
        if (!this.dParm.contentEquals(other.dParm)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.iType.hashCode()
        result = 31 * result + this.nSize.hashCode()
        result = 31 * result + this.dParm.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Enhmetarecord> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Enhmetarecord> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Enhmetarecord =
                    Enhmetarecord(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 8L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: Enhmetarecord) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.iType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 8L, value.dParm.toList())
                }
            }
    }
}

public data class Enumlogfonta(
    public var elfLogFont: Logfonta = Logfonta(),
    public var elfFullName: UByteArray = UByteArray(64),
    public var elfStyle: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Enumlogfonta) return false
        if (this.elfLogFont != other.elfLogFont) return false
        if (!this.elfFullName.contentEquals(other.elfFullName)) return false
        if (!this.elfStyle.contentEquals(other.elfStyle)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.elfLogFont.hashCode()
        result = 31 * result + this.elfFullName.contentHashCode()
        result = 31 * result + this.elfStyle.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Enumlogfonta> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Enumlogfonta> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 156L
                override fun readNative(addr: Long): Enumlogfonta =
                    Enumlogfonta(
                        (Logfonta.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                        ).readNative(addr + 60L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 124L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Enumlogfonta) {
                    (Logfonta.typeLayout()).writeNative(addr, value.elfLogFont)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                    ).writeNative(addr + 60L, value.elfFullName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 124L, value.elfStyle.toList())
                }
            }
    }
}

public data class Enumlogfontexa(
    public var elfLogFont: Logfonta = Logfonta(),
    public var elfFullName: UByteArray = UByteArray(64),
    public var elfStyle: UByteArray = UByteArray(32),
    public var elfScript: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Enumlogfontexa) return false
        if (this.elfLogFont != other.elfLogFont) return false
        if (!this.elfFullName.contentEquals(other.elfFullName)) return false
        if (!this.elfStyle.contentEquals(other.elfStyle)) return false
        if (!this.elfScript.contentEquals(other.elfScript)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.elfLogFont.hashCode()
        result = 31 * result + this.elfFullName.contentHashCode()
        result = 31 * result + this.elfStyle.contentHashCode()
        result = 31 * result + this.elfScript.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Enumlogfontexa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Enumlogfontexa> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 188L
                override fun readNative(addr: Long): Enumlogfontexa =
                    Enumlogfontexa(
                        (Logfonta.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                        ).readNative(addr + 60L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 124L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 156L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Enumlogfontexa) {
                    (Logfonta.typeLayout()).writeNative(addr, value.elfLogFont)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                    ).writeNative(addr + 60L, value.elfFullName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 124L, value.elfStyle.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 156L, value.elfScript.toList())
                }
            }
    }
}

public data class Enumlogfontexdva(
    public var elfEnumLogfontEx: Enumlogfontexa = Enumlogfontexa(),
    public var elfDesignVector: Designvector = Designvector(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Enumlogfontexdva> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Enumlogfontexdva> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 260L
                override fun readNative(addr: Long): Enumlogfontexdva =
                    Enumlogfontexdva(
                        (Enumlogfontexa.typeLayout()).readNative(addr),
                        (Designvector.typeLayout()).readNative(addr + 188L),
                    )
                override fun writeNative(addr: Long, value: Enumlogfontexdva) {
                    (Enumlogfontexa.typeLayout()).writeNative(addr, value.elfEnumLogfontEx)
                    (Designvector.typeLayout()).writeNative(addr + 188L, value.elfDesignVector)
                }
            }
    }
}

public data class Enumlogfontexdvw(
    public var elfEnumLogfontEx: Enumlogfontexw = Enumlogfontexw(),
    public var elfDesignVector: Designvector = Designvector(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Enumlogfontexdvw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Enumlogfontexdvw> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 420L
                override fun readNative(addr: Long): Enumlogfontexdvw =
                    Enumlogfontexdvw(
                        (Enumlogfontexw.typeLayout()).readNative(addr),
                        (Designvector.typeLayout()).readNative(addr + 348L),
                    )
                override fun writeNative(addr: Long, value: Enumlogfontexdvw) {
                    (Enumlogfontexw.typeLayout()).writeNative(addr, value.elfEnumLogfontEx)
                    (Designvector.typeLayout()).writeNative(addr + 348L, value.elfDesignVector)
                }
            }
    }
}

public data class Enumlogfontexw(
    public var elfLogFont: Logfontw = Logfontw(),
    public var elfFullName: UShortArray = UShortArray(64),
    public var elfStyle: UShortArray = UShortArray(32),
    public var elfScript: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Enumlogfontexw) return false
        if (this.elfLogFont != other.elfLogFont) return false
        if (!this.elfFullName.contentEquals(other.elfFullName)) return false
        if (!this.elfStyle.contentEquals(other.elfStyle)) return false
        if (!this.elfScript.contentEquals(other.elfScript)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.elfLogFont.hashCode()
        result = 31 * result + this.elfFullName.contentHashCode()
        result = 31 * result + this.elfStyle.contentHashCode()
        result = 31 * result + this.elfScript.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Enumlogfontexw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Enumlogfontexw> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 348L
                override fun readNative(addr: Long): Enumlogfontexw =
                    Enumlogfontexw(
                        (Logfontw.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 92L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 220L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 284L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Enumlogfontexw) {
                    (Logfontw.typeLayout()).writeNative(addr, value.elfLogFont)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 92L, value.elfFullName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 220L, value.elfStyle.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 284L, value.elfScript.toList())
                }
            }
    }
}

public data class Enumlogfontw(
    public var elfLogFont: Logfontw = Logfontw(),
    public var elfFullName: UShortArray = UShortArray(64),
    public var elfStyle: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Enumlogfontw) return false
        if (this.elfLogFont != other.elfLogFont) return false
        if (!this.elfFullName.contentEquals(other.elfFullName)) return false
        if (!this.elfStyle.contentEquals(other.elfStyle)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.elfLogFont.hashCode()
        result = 31 * result + this.elfFullName.contentHashCode()
        result = 31 * result + this.elfStyle.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Enumlogfontw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Enumlogfontw> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 284L
                override fun readNative(addr: Long): Enumlogfontw =
                    Enumlogfontw(
                        (Logfontw.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 92L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 220L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Enumlogfontw) {
                    (Logfontw.typeLayout()).writeNative(addr, value.elfLogFont)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 92L, value.elfFullName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 220L, value.elfStyle.toList())
                }
            }
    }
}

public data class Extlogfonta(
    public var elfLogFont: Logfonta = Logfonta(),
    public var elfFullName: UByteArray = UByteArray(64),
    public var elfStyle: UByteArray = UByteArray(32),
    public var elfVersion: UInt = 0u,
    public var elfStyleSize: UInt = 0u,
    public var elfMatch: UInt = 0u,
    public var elfReserved: UInt = 0u,
    public var elfVendorId: UByteArray = UByteArray(4),
    public var elfCulture: UInt = 0u,
    public var elfPanose: Panose = Panose(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Extlogfonta) return false
        if (this.elfLogFont != other.elfLogFont) return false
        if (!this.elfFullName.contentEquals(other.elfFullName)) return false
        if (!this.elfStyle.contentEquals(other.elfStyle)) return false
        if (this.elfVersion != other.elfVersion) return false
        if (this.elfStyleSize != other.elfStyleSize) return false
        if (this.elfMatch != other.elfMatch) return false
        if (this.elfReserved != other.elfReserved) return false
        if (!this.elfVendorId.contentEquals(other.elfVendorId)) return false
        if (this.elfCulture != other.elfCulture) return false
        if (this.elfPanose != other.elfPanose) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.elfLogFont.hashCode()
        result = 31 * result + this.elfFullName.contentHashCode()
        result = 31 * result + this.elfStyle.contentHashCode()
        result = 31 * result + this.elfVersion.hashCode()
        result = 31 * result + this.elfStyleSize.hashCode()
        result = 31 * result + this.elfMatch.hashCode()
        result = 31 * result + this.elfReserved.hashCode()
        result = 31 * result + this.elfVendorId.contentHashCode()
        result = 31 * result + this.elfCulture.hashCode()
        result = 31 * result + this.elfPanose.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Extlogfonta> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Extlogfonta> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 192L
                override fun readNative(addr: Long): Extlogfonta =
                    Extlogfonta(
                        (Logfonta.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                        ).readNative(addr + 60L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 124L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 156L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 164L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 168L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 172L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 176L),
                        (Panose.typeLayout()).readNative(addr + 180L),
                    )
                override fun writeNative(addr: Long, value: Extlogfonta) {
                    (Logfonta.typeLayout()).writeNative(addr, value.elfLogFont)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                    ).writeNative(addr + 60L, value.elfFullName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 124L, value.elfStyle.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 156L, value.elfVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 160L, value.elfStyleSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 164L, value.elfMatch)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 168L, value.elfReserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 172L, value.elfVendorId.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 176L, value.elfCulture)
                    (Panose.typeLayout()).writeNative(addr + 180L, value.elfPanose)
                }
            }
    }
}

public data class Extlogfontw(
    public var elfLogFont: Logfontw = Logfontw(),
    public var elfFullName: UShortArray = UShortArray(64),
    public var elfStyle: UShortArray = UShortArray(32),
    public var elfVersion: UInt = 0u,
    public var elfStyleSize: UInt = 0u,
    public var elfMatch: UInt = 0u,
    public var elfReserved: UInt = 0u,
    public var elfVendorId: UByteArray = UByteArray(4),
    public var elfCulture: UInt = 0u,
    public var elfPanose: Panose = Panose(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Extlogfontw) return false
        if (this.elfLogFont != other.elfLogFont) return false
        if (!this.elfFullName.contentEquals(other.elfFullName)) return false
        if (!this.elfStyle.contentEquals(other.elfStyle)) return false
        if (this.elfVersion != other.elfVersion) return false
        if (this.elfStyleSize != other.elfStyleSize) return false
        if (this.elfMatch != other.elfMatch) return false
        if (this.elfReserved != other.elfReserved) return false
        if (!this.elfVendorId.contentEquals(other.elfVendorId)) return false
        if (this.elfCulture != other.elfCulture) return false
        if (this.elfPanose != other.elfPanose) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.elfLogFont.hashCode()
        result = 31 * result + this.elfFullName.contentHashCode()
        result = 31 * result + this.elfStyle.contentHashCode()
        result = 31 * result + this.elfVersion.hashCode()
        result = 31 * result + this.elfStyleSize.hashCode()
        result = 31 * result + this.elfMatch.hashCode()
        result = 31 * result + this.elfReserved.hashCode()
        result = 31 * result + this.elfVendorId.contentHashCode()
        result = 31 * result + this.elfCulture.hashCode()
        result = 31 * result + this.elfPanose.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Extlogfontw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Extlogfontw> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 320L
                override fun readNative(addr: Long): Extlogfontw =
                    Extlogfontw(
                        (Logfontw.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                        ).readNative(addr + 92L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 220L).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 284L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 288L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 292L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 296L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 300L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 304L),
                        (Panose.typeLayout()).readNative(addr + 308L),
                    )
                override fun writeNative(addr: Long, value: Extlogfontw) {
                    (Logfontw.typeLayout()).writeNative(addr, value.elfLogFont)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (64).toInt())
                    ).writeNative(addr + 92L, value.elfFullName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 220L, value.elfStyle.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 284L, value.elfVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 288L, value.elfStyleSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 292L, value.elfMatch)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 296L, value.elfReserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 300L, value.elfVendorId.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 304L, value.elfCulture)
                    (Panose.typeLayout()).writeNative(addr + 308L, value.elfPanose)
                }
            }
    }
}

public data class Extlogpen(
    public var elpPenStyle: UInt = 0u,
    public var elpWidth: UInt = 0u,
    public var elpBrushStyle: UInt = 0u,
    public var elpColor: Colorref = 0u,
    public var elpHatch: Int = 0,
    public var elpNumEntries: UInt = 0u,
    public var elpStyleEntry: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Extlogpen) return false
        if (this.elpPenStyle != other.elpPenStyle) return false
        if (this.elpWidth != other.elpWidth) return false
        if (this.elpBrushStyle != other.elpBrushStyle) return false
        if (this.elpColor != other.elpColor) return false
        if (this.elpHatch != other.elpHatch) return false
        if (this.elpNumEntries != other.elpNumEntries) return false
        if (!this.elpStyleEntry.contentEquals(other.elpStyleEntry)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.elpPenStyle.hashCode()
        result = 31 * result + this.elpWidth.hashCode()
        result = 31 * result + this.elpBrushStyle.hashCode()
        result = 31 * result + this.elpColor.hashCode()
        result = 31 * result + this.elpHatch.hashCode()
        result = 31 * result + this.elpNumEntries.hashCode()
        result = 31 * result + this.elpStyleEntry.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Extlogpen> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Extlogpen> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Extlogpen =
                    Extlogpen(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 28L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: Extlogpen) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.elpPenStyle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.elpWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.elpBrushStyle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.elpColor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.elpHatch)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.elpNumEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 28L, value.elpStyleEntry.toList())
                }
            }
    }
}

public data class Extlogpen32(
    public var elpPenStyle: UInt = 0u,
    public var elpWidth: UInt = 0u,
    public var elpBrushStyle: UInt = 0u,
    public var elpColor: Colorref = 0u,
    public var elpHatch: UInt = 0u,
    public var elpNumEntries: UInt = 0u,
    public var elpStyleEntry: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Extlogpen32) return false
        if (this.elpPenStyle != other.elpPenStyle) return false
        if (this.elpWidth != other.elpWidth) return false
        if (this.elpBrushStyle != other.elpBrushStyle) return false
        if (this.elpColor != other.elpColor) return false
        if (this.elpHatch != other.elpHatch) return false
        if (this.elpNumEntries != other.elpNumEntries) return false
        if (!this.elpStyleEntry.contentEquals(other.elpStyleEntry)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.elpPenStyle.hashCode()
        result = 31 * result + this.elpWidth.hashCode()
        result = 31 * result + this.elpBrushStyle.hashCode()
        result = 31 * result + this.elpColor.hashCode()
        result = 31 * result + this.elpHatch.hashCode()
        result = 31 * result + this.elpNumEntries.hashCode()
        result = 31 * result + this.elpStyleEntry.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Extlogpen32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Extlogpen32> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): Extlogpen32 =
                    Extlogpen32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 24L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: Extlogpen32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.elpPenStyle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.elpWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.elpBrushStyle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.elpColor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.elpHatch)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.elpNumEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 24L, value.elpStyleEntry.toList())
                }
            }
    }
}

public data class Fixed(
    public var fract: UShort = 0u,
    public var value: Short = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Fixed> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Fixed> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Fixed =
                    Fixed(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Fixed) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.fract)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.value)
                }
            }
    }
}

public class GcpResultsa internal constructor(
    public var lStructSize: UInt,
    lpOutStringCtorArg: Pstr,
    lpOrderCtorArg: MutPtr<UInt>,
    lpDxCtorArg: MutPtr<Int>,
    lpCaretPosCtorArg: MutPtr<Int>,
    lpClassCtorArg: Pstr,
    lpGlyphsCtorArg: Pwstr,
    public var nGlyphs: UInt,
    public var nMaxFit: Int,
) {
    public var lpOutString: Pstr = lpOutStringCtorArg
        internal set

    public var lpOrder: MutPtr<UInt> = lpOrderCtorArg
        internal set

    public var lpDx: MutPtr<Int> = lpDxCtorArg
        internal set

    public var lpCaretPos: MutPtr<Int> = lpCaretPosCtorArg
        internal set

    public var lpClass: Pstr = lpClassCtorArg
        internal set

    public var lpGlyphs: Pwstr = lpGlyphsCtorArg
        internal set

    public constructor() : this(
        lStructSize = 0u,
        lpOutStringCtorArg = MutPtr(0L),
        lpOrderCtorArg = MutPtr(0L),
        lpDxCtorArg = MutPtr(0L),
        lpCaretPosCtorArg = MutPtr(0L),
        lpClassCtorArg = MutPtr(0L),
        lpGlyphsCtorArg = MutPtr(0L),
        nGlyphs = 0u,
        nMaxFit = 0,
    )

    public operator fun component1(): UInt = this.lStructSize

    public operator fun component2(): Pstr = this.lpOutString

    public operator fun component3(): MutPtr<UInt> = this.lpOrder

    public operator fun component4(): MutPtr<Int> = this.lpDx

    public operator fun component5(): MutPtr<Int> = this.lpCaretPos

    public operator fun component6(): Pstr = this.lpClass

    public operator fun component7(): Pwstr = this.lpGlyphs

    public operator fun component8(): UInt = this.nGlyphs

    public operator fun component9(): Int = this.nMaxFit

    public fun copy(lStructSize: UInt = this.lStructSize, lpOutString: Pstr = this.lpOutString, lpOrder: MutPtr<UInt> = this.lpOrder, lpDx: MutPtr<Int> = this.lpDx, lpCaretPos: MutPtr<Int> = this.lpCaretPos, lpClass: Pstr = this.lpClass, lpGlyphs: Pwstr = this.lpGlyphs, nGlyphs: UInt = this.nGlyphs, nMaxFit: Int = this.nMaxFit): GcpResultsa = GcpResultsa(lStructSize = lStructSize, lpOutStringCtorArg = lpOutString, lpOrderCtorArg = lpOrder, lpDxCtorArg = lpDx, lpCaretPosCtorArg = lpCaretPos, lpClassCtorArg = lpClass, lpGlyphsCtorArg = lpGlyphs, nGlyphs = nGlyphs, nMaxFit = nMaxFit)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GcpResultsa) return false
        if (this.lStructSize != other.lStructSize) return false
        if (this.lpOutString != other.lpOutString) return false
        if (this.lpOrder != other.lpOrder) return false
        if (this.lpDx != other.lpDx) return false
        if (this.lpCaretPos != other.lpCaretPos) return false
        if (this.lpClass != other.lpClass) return false
        if (this.lpGlyphs != other.lpGlyphs) return false
        if (this.nGlyphs != other.nGlyphs) return false
        if (this.nMaxFit != other.nMaxFit) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lStructSize.hashCode()
        result = 31 * result + this.lpOutString.hashCode()
        result = 31 * result + this.lpOrder.hashCode()
        result = 31 * result + this.lpDx.hashCode()
        result = 31 * result + this.lpCaretPos.hashCode()
        result = 31 * result + this.lpClass.hashCode()
        result = 31 * result + this.lpGlyphs.hashCode()
        result = 31 * result + this.nGlyphs.hashCode()
        result = 31 * result + this.nMaxFit.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lStructSize: UInt = 0u,
            lpOutString: Pstr = MutPtr(0L),
            lpOrder: MutPtr<UInt> = MutPtr(0L),
            lpDx: MutPtr<Int> = MutPtr(0L),
            lpCaretPos: MutPtr<Int> = MutPtr(0L),
            lpClass: Pstr = MutPtr(0L),
            lpGlyphs: Pwstr = MutPtr(0L),
            nGlyphs: UInt = 0u,
            nMaxFit: Int = 0,
        ): GcpResultsa =
            GcpResultsa(
                lStructSize = lStructSize,
                lpOutStringCtorArg = lpOutString,
                lpOrderCtorArg = lpOrder,
                lpDxCtorArg = lpDx,
                lpCaretPosCtorArg = lpCaretPos,
                lpClassCtorArg = lpClass,
                lpGlyphsCtorArg = lpGlyphs,
                nGlyphs = nGlyphs,
                nMaxFit = nMaxFit,
            )
    }
}

public class GcpResultsw internal constructor(
    public var lStructSize: UInt,
    lpOutStringCtorArg: Pwstr,
    lpOrderCtorArg: MutPtr<UInt>,
    lpDxCtorArg: MutPtr<Int>,
    lpCaretPosCtorArg: MutPtr<Int>,
    lpClassCtorArg: Pstr,
    lpGlyphsCtorArg: Pwstr,
    public var nGlyphs: UInt,
    public var nMaxFit: Int,
) {
    public var lpOutString: Pwstr = lpOutStringCtorArg
        internal set

    public var lpOrder: MutPtr<UInt> = lpOrderCtorArg
        internal set

    public var lpDx: MutPtr<Int> = lpDxCtorArg
        internal set

    public var lpCaretPos: MutPtr<Int> = lpCaretPosCtorArg
        internal set

    public var lpClass: Pstr = lpClassCtorArg
        internal set

    public var lpGlyphs: Pwstr = lpGlyphsCtorArg
        internal set

    public constructor() : this(
        lStructSize = 0u,
        lpOutStringCtorArg = MutPtr(0L),
        lpOrderCtorArg = MutPtr(0L),
        lpDxCtorArg = MutPtr(0L),
        lpCaretPosCtorArg = MutPtr(0L),
        lpClassCtorArg = MutPtr(0L),
        lpGlyphsCtorArg = MutPtr(0L),
        nGlyphs = 0u,
        nMaxFit = 0,
    )

    public operator fun component1(): UInt = this.lStructSize

    public operator fun component2(): Pwstr = this.lpOutString

    public operator fun component3(): MutPtr<UInt> = this.lpOrder

    public operator fun component4(): MutPtr<Int> = this.lpDx

    public operator fun component5(): MutPtr<Int> = this.lpCaretPos

    public operator fun component6(): Pstr = this.lpClass

    public operator fun component7(): Pwstr = this.lpGlyphs

    public operator fun component8(): UInt = this.nGlyphs

    public operator fun component9(): Int = this.nMaxFit

    public fun copy(lStructSize: UInt = this.lStructSize, lpOutString: Pwstr = this.lpOutString, lpOrder: MutPtr<UInt> = this.lpOrder, lpDx: MutPtr<Int> = this.lpDx, lpCaretPos: MutPtr<Int> = this.lpCaretPos, lpClass: Pstr = this.lpClass, lpGlyphs: Pwstr = this.lpGlyphs, nGlyphs: UInt = this.nGlyphs, nMaxFit: Int = this.nMaxFit): GcpResultsw = GcpResultsw(lStructSize = lStructSize, lpOutStringCtorArg = lpOutString, lpOrderCtorArg = lpOrder, lpDxCtorArg = lpDx, lpCaretPosCtorArg = lpCaretPos, lpClassCtorArg = lpClass, lpGlyphsCtorArg = lpGlyphs, nGlyphs = nGlyphs, nMaxFit = nMaxFit)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GcpResultsw) return false
        if (this.lStructSize != other.lStructSize) return false
        if (this.lpOutString != other.lpOutString) return false
        if (this.lpOrder != other.lpOrder) return false
        if (this.lpDx != other.lpDx) return false
        if (this.lpCaretPos != other.lpCaretPos) return false
        if (this.lpClass != other.lpClass) return false
        if (this.lpGlyphs != other.lpGlyphs) return false
        if (this.nGlyphs != other.nGlyphs) return false
        if (this.nMaxFit != other.nMaxFit) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lStructSize.hashCode()
        result = 31 * result + this.lpOutString.hashCode()
        result = 31 * result + this.lpOrder.hashCode()
        result = 31 * result + this.lpDx.hashCode()
        result = 31 * result + this.lpCaretPos.hashCode()
        result = 31 * result + this.lpClass.hashCode()
        result = 31 * result + this.lpGlyphs.hashCode()
        result = 31 * result + this.nGlyphs.hashCode()
        result = 31 * result + this.nMaxFit.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            lStructSize: UInt = 0u,
            lpOutString: Pwstr = MutPtr(0L),
            lpOrder: MutPtr<UInt> = MutPtr(0L),
            lpDx: MutPtr<Int> = MutPtr(0L),
            lpCaretPos: MutPtr<Int> = MutPtr(0L),
            lpClass: Pstr = MutPtr(0L),
            lpGlyphs: Pwstr = MutPtr(0L),
            nGlyphs: UInt = 0u,
            nMaxFit: Int = 0,
        ): GcpResultsw =
            GcpResultsw(
                lStructSize = lStructSize,
                lpOutStringCtorArg = lpOutString,
                lpOrderCtorArg = lpOrder,
                lpDxCtorArg = lpDx,
                lpCaretPosCtorArg = lpCaretPos,
                lpClassCtorArg = lpClass,
                lpGlyphsCtorArg = lpGlyphs,
                nGlyphs = nGlyphs,
                nMaxFit = nMaxFit,
            )
    }
}

public data class Glyphmetrics(
    public var gmBlackBoxX: UInt = 0u,
    public var gmBlackBoxY: UInt = 0u,
    public var gmptGlyphOrigin: Point = Point(),
    public var gmCellIncX: Short = 0,
    public var gmCellIncY: Short = 0,
)

public data class Glyphset(
    public var cbThis: UInt = 0u,
    public var flAccel: UInt = 0u,
    public var cGlyphsSupported: UInt = 0u,
    public var cRanges: UInt = 0u,
    public var ranges: List<Wcrange> = List(1) { Wcrange() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Glyphset> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Glyphset> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): Glyphset =
                    Glyphset(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Wcrange.typeLayout(), (1).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Glyphset) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cbThis)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.flAccel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cGlyphsSupported)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cRanges)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Wcrange.typeLayout(), (1).toInt())
                    ).writeNative(addr + 16L, value.ranges)
                }
            }
    }
}

public data class GradientRect(
    public var upperLeft: UInt = 0u,
    public var lowerRight: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GradientRect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GradientRect> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): GradientRect =
                    GradientRect(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: GradientRect) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.upperLeft)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.lowerRight)
                }
            }
    }
}

public data class GradientTriangle(
    public var vertex1: UInt = 0u,
    public var vertex2: UInt = 0u,
    public var vertex3: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GradientTriangle> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GradientTriangle> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): GradientTriangle =
                    GradientTriangle(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: GradientTriangle) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.vertex1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vertex2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.vertex3)
                }
            }
    }
}

public class Handletable internal constructor(
    objectHandleCtorArg: List<Hgdiobj>,
) {
    public var objectHandle: List<Hgdiobj> = objectHandleCtorArg
        internal set

    public constructor() : this(
        objectHandleCtorArg = List(1) { MutPtr(0L) },
    )

    public operator fun component1(): List<Hgdiobj> = this.objectHandle

    public fun copy(objectHandle: List<Hgdiobj> = this.objectHandle): Handletable = Handletable(objectHandleCtorArg = objectHandle)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Handletable) return false
        if (this.objectHandle != other.objectHandle) return false
        return true
    }

    override fun hashCode(): Int = this.objectHandle.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Handletable> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Handletable> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Handletable =
                    Handletable(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                        .mutPtrLayout<CVoid>(64),
                                    (1).toInt(),
                                )
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Handletable) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                    .mutPtrLayout<CVoid>(64),
                                (1).toInt(),
                            )
                    ).writeNative(addr, value.objectHandle)
                }
            }

        public operator fun invoke(
            objectHandle: List<Hgdiobj> = List(1) { MutPtr(0L) },
        ): Handletable =
            Handletable(
                objectHandleCtorArg = objectHandle,
            )
    }
}

public data class Kerningpair(
    public var wFirst: UShort = 0u,
    public var wSecond: UShort = 0u,
    public var iKernAmount: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kerningpair> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kerningpair> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Kerningpair =
                    Kerningpair(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Kerningpair) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wFirst)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wSecond)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.iKernAmount)
                }
            }
    }
}

public data class Logbrush(
    public var lbStyle: BrushStyle = 0u,
    public var lbColor: Colorref = 0u,
    public var lbHatch: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Logbrush> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Logbrush> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Logbrush =
                    Logbrush(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Logbrush) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.lbStyle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.lbColor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.lbHatch)
                }
            }
    }
}

public data class Logbrush32(
    public var lbStyle: BrushStyle = 0u,
    public var lbColor: Colorref = 0u,
    public var lbHatch: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Logbrush32> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Logbrush32> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Logbrush32 =
                    Logbrush32(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Logbrush32) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.lbStyle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.lbColor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.lbHatch)
                }
            }
    }
}

public data class Logfonta(
    public var lfHeight: Int = 0,
    public var lfWidth: Int = 0,
    public var lfEscapement: Int = 0,
    public var lfOrientation: Int = 0,
    public var lfWeight: Int = 0,
    public var lfItalic: UByte = 0u,
    public var lfUnderline: UByte = 0u,
    public var lfStrikeOut: UByte = 0u,
    public var lfCharSet: FontCharset = 0u,
    public var lfOutPrecision: FontOutputPrecision = 0u,
    public var lfClipPrecision: FontClipPrecision = 0u,
    public var lfQuality: FontQuality = 0u,
    public var lfPitchAndFamily: UByte = 0u,
    public var lfFaceName: ByteArray = ByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Logfonta) return false
        if (this.lfHeight != other.lfHeight) return false
        if (this.lfWidth != other.lfWidth) return false
        if (this.lfEscapement != other.lfEscapement) return false
        if (this.lfOrientation != other.lfOrientation) return false
        if (this.lfWeight != other.lfWeight) return false
        if (this.lfItalic != other.lfItalic) return false
        if (this.lfUnderline != other.lfUnderline) return false
        if (this.lfStrikeOut != other.lfStrikeOut) return false
        if (this.lfCharSet != other.lfCharSet) return false
        if (this.lfOutPrecision != other.lfOutPrecision) return false
        if (this.lfClipPrecision != other.lfClipPrecision) return false
        if (this.lfQuality != other.lfQuality) return false
        if (this.lfPitchAndFamily != other.lfPitchAndFamily) return false
        if (!this.lfFaceName.contentEquals(other.lfFaceName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lfHeight.hashCode()
        result = 31 * result + this.lfWidth.hashCode()
        result = 31 * result + this.lfEscapement.hashCode()
        result = 31 * result + this.lfOrientation.hashCode()
        result = 31 * result + this.lfWeight.hashCode()
        result = 31 * result + this.lfItalic.hashCode()
        result = 31 * result + this.lfUnderline.hashCode()
        result = 31 * result + this.lfStrikeOut.hashCode()
        result = 31 * result + this.lfCharSet.hashCode()
        result = 31 * result + this.lfOutPrecision.hashCode()
        result = 31 * result + this.lfClipPrecision.hashCode()
        result = 31 * result + this.lfQuality.hashCode()
        result = 31 * result + this.lfPitchAndFamily.hashCode()
        result = 31 * result + this.lfFaceName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Logfonta> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Logfonta> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 60L
                override fun readNative(addr: Long): Logfonta =
                    Logfonta(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 21L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 23L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 25L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 26L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 27L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                        ).readNative(addr + 28L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: Logfonta) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.lfHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.lfWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.lfEscapement)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.lfOrientation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.lfWeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 20L, value.lfItalic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 21L, value.lfUnderline)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 22L, value.lfStrikeOut)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 23L, value.lfCharSet)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 24L, value.lfOutPrecision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 25L, value.lfClipPrecision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 26L, value.lfQuality)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 27L, value.lfPitchAndFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                    ).writeNative(addr + 28L, value.lfFaceName.toList())
                }
            }
    }
}

public data class Logfontw(
    public var lfHeight: Int = 0,
    public var lfWidth: Int = 0,
    public var lfEscapement: Int = 0,
    public var lfOrientation: Int = 0,
    public var lfWeight: Int = 0,
    public var lfItalic: UByte = 0u,
    public var lfUnderline: UByte = 0u,
    public var lfStrikeOut: UByte = 0u,
    public var lfCharSet: FontCharset = 0u,
    public var lfOutPrecision: FontOutputPrecision = 0u,
    public var lfClipPrecision: FontClipPrecision = 0u,
    public var lfQuality: FontQuality = 0u,
    public var lfPitchAndFamily: UByte = 0u,
    public var lfFaceName: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Logfontw) return false
        if (this.lfHeight != other.lfHeight) return false
        if (this.lfWidth != other.lfWidth) return false
        if (this.lfEscapement != other.lfEscapement) return false
        if (this.lfOrientation != other.lfOrientation) return false
        if (this.lfWeight != other.lfWeight) return false
        if (this.lfItalic != other.lfItalic) return false
        if (this.lfUnderline != other.lfUnderline) return false
        if (this.lfStrikeOut != other.lfStrikeOut) return false
        if (this.lfCharSet != other.lfCharSet) return false
        if (this.lfOutPrecision != other.lfOutPrecision) return false
        if (this.lfClipPrecision != other.lfClipPrecision) return false
        if (this.lfQuality != other.lfQuality) return false
        if (this.lfPitchAndFamily != other.lfPitchAndFamily) return false
        if (!this.lfFaceName.contentEquals(other.lfFaceName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lfHeight.hashCode()
        result = 31 * result + this.lfWidth.hashCode()
        result = 31 * result + this.lfEscapement.hashCode()
        result = 31 * result + this.lfOrientation.hashCode()
        result = 31 * result + this.lfWeight.hashCode()
        result = 31 * result + this.lfItalic.hashCode()
        result = 31 * result + this.lfUnderline.hashCode()
        result = 31 * result + this.lfStrikeOut.hashCode()
        result = 31 * result + this.lfCharSet.hashCode()
        result = 31 * result + this.lfOutPrecision.hashCode()
        result = 31 * result + this.lfClipPrecision.hashCode()
        result = 31 * result + this.lfQuality.hashCode()
        result = 31 * result + this.lfPitchAndFamily.hashCode()
        result = 31 * result + this.lfFaceName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Logfontw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Logfontw> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 92L
                override fun readNative(addr: Long): Logfontw =
                    Logfontw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 21L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 23L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 25L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 26L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 27L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                        ).readNative(addr + 28L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Logfontw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.lfHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.lfWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.lfEscapement)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.lfOrientation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.lfWeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 20L, value.lfItalic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 21L, value.lfUnderline)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 22L, value.lfStrikeOut)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 23L, value.lfCharSet)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 24L, value.lfOutPrecision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 25L, value.lfClipPrecision)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 26L, value.lfQuality)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 27L, value.lfPitchAndFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (32).toInt())
                    ).writeNative(addr + 28L, value.lfFaceName.toList())
                }
            }
    }
}

public data class Logpalette(
    public var palVersion: UShort = 0u,
    public var palNumEntries: UShort = 0u,
    public var palPalEntry: List<Paletteentry> = List(1) { Paletteentry() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Logpalette> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Logpalette> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Logpalette =
                    Logpalette(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Paletteentry.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Logpalette) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.palVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.palNumEntries)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Paletteentry.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.palPalEntry)
                }
            }
    }
}

public data class Logpen(
    public var lopnStyle: UInt = 0u,
    public var lopnWidth: Point = Point(),
    public var lopnColor: Colorref = 0u,
)

public data class Mat2(
    public var eM11: Fixed = Fixed(),
    public var eM12: Fixed = Fixed(),
    public var eM21: Fixed = Fixed(),
    public var eM22: Fixed = Fixed(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mat2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mat2> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Mat2 =
                    Mat2(
                        (Fixed.typeLayout()).readNative(addr),
                        (Fixed.typeLayout()).readNative(addr + 4L),
                        (Fixed.typeLayout()).readNative(addr + 8L),
                        (Fixed.typeLayout()).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Mat2) {
                    (Fixed.typeLayout()).writeNative(addr, value.eM11)
                    (Fixed.typeLayout()).writeNative(addr + 4L, value.eM12)
                    (Fixed.typeLayout()).writeNative(addr + 8L, value.eM21)
                    (Fixed.typeLayout()).writeNative(addr + 12L, value.eM22)
                }
            }
    }
}

public data class Metaheader(
    public var mtType: UShort = 0u,
    public var mtHeaderSize: UShort = 0u,
    public var mtVersion: UShort = 0u,
    public var mtSize: UInt = 0u,
    public var mtNoObjects: UShort = 0u,
    public var mtMaxRecord: UInt = 0u,
    public var mtNoParameters: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Metaheader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Metaheader> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 18L
                override fun readNative(addr: Long): Metaheader =
                    Metaheader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Metaheader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.mtType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.mtHeaderSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.mtVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 6L, value.mtSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.mtNoObjects)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.mtMaxRecord)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.mtNoParameters)
                }
            }
    }
}

public data class Metarecord(
    public var rdSize: UInt = 0u,
    public var rdFunction: UShort = 0u,
    public var rdParm: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Metarecord) return false
        if (this.rdSize != other.rdSize) return false
        if (this.rdFunction != other.rdFunction) return false
        if (!this.rdParm.contentEquals(other.rdParm)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rdSize.hashCode()
        result = 31 * result + this.rdFunction.hashCode()
        result = 31 * result + this.rdParm.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Metarecord> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Metarecord> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Metarecord =
                    Metarecord(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 6L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Metarecord) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.rdSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.rdFunction)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 6L, value.rdParm.toList())
                }
            }
    }
}

public data class Monitorinfo(
    public var cbSize: UInt = 0u,
    public var rcMonitor: Rect = Rect(),
    public var rcWork: Rect = Rect(),
    public var dwFlags: UInt = 0u,
)

public data class Monitorinfoexa(
    public var monitorInfo: Monitorinfo = Monitorinfo(),
    public var szDevice: ByteArray = ByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Monitorinfoexa) return false
        if (this.monitorInfo != other.monitorInfo) return false
        if (!this.szDevice.contentEquals(other.szDevice)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.monitorInfo.hashCode()
        result = 31 * result + this.szDevice.contentHashCode()
        return result
    }
}

public data class Monitorinfoexw(
    public var monitorInfo: Monitorinfo = Monitorinfo(),
    public var szDevice: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Monitorinfoexw) return false
        if (this.monitorInfo != other.monitorInfo) return false
        if (!this.szDevice.contentEquals(other.szDevice)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.monitorInfo.hashCode()
        result = 31 * result + this.szDevice.contentHashCode()
        return result
    }
}

public class Newtextmetrica(
    public var tmHeight: Int = 0,
    public var tmAscent: Int = 0,
    public var tmDescent: Int = 0,
    public var tmInternalLeading: Int = 0,
    public var tmExternalLeading: Int = 0,
    public var tmAveCharWidth: Int = 0,
    public var tmMaxCharWidth: Int = 0,
    public var tmWeight: Int = 0,
    public var tmOverhang: Int = 0,
    public var tmDigitizedAspectX: Int = 0,
    public var tmDigitizedAspectY: Int = 0,
    public var tmFirstChar: UByte = 0u,
    public var tmLastChar: UByte = 0u,
    public var tmDefaultChar: UByte = 0u,
    public var tmBreakChar: UByte = 0u,
    public var tmItalic: UByte = 0u,
    public var tmUnderlined: UByte = 0u,
    public var tmStruckOut: UByte = 0u,
    public var tmPitchAndFamily: TmpfFlags = 0u,
    public var tmCharSet: UByte = 0u,
    public var ntmFlags: UInt = 0u,
    public var ntmSizeEM: UInt = 0u,
    public var ntmCellHeight: UInt = 0u,
    public var ntmAvgWidth: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Newtextmetrica> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Newtextmetrica> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): Newtextmetrica =
                    Newtextmetrica(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 45L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 46L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 47L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 49L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 50L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 51L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                    )
                override fun writeNative(addr: Long, value: Newtextmetrica) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.tmHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.tmAscent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.tmDescent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.tmInternalLeading)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.tmExternalLeading)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.tmAveCharWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.tmMaxCharWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.tmWeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.tmOverhang)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.tmDigitizedAspectX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.tmDigitizedAspectY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 44L, value.tmFirstChar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 45L, value.tmLastChar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 46L, value.tmDefaultChar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 47L, value.tmBreakChar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 48L, value.tmItalic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 49L, value.tmUnderlined)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 50L, value.tmStruckOut)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 51L, value.tmPitchAndFamily)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 52L, value.tmCharSet)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.ntmFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.ntmSizeEM)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.ntmCellHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.ntmAvgWidth)
                }
            }
    }
}

public class Newtextmetricw(
    public var tmHeight: Int = 0,
    public var tmAscent: Int = 0,
    public var tmDescent: Int = 0,
    public var tmInternalLeading: Int = 0,
    public var tmExternalLeading: Int = 0,
    public var tmAveCharWidth: Int = 0,
    public var tmMaxCharWidth: Int = 0,
    public var tmWeight: Int = 0,
    public var tmOverhang: Int = 0,
    public var tmDigitizedAspectX: Int = 0,
    public var tmDigitizedAspectY: Int = 0,
    public var tmFirstChar: UShort = 0u,
    public var tmLastChar: UShort = 0u,
    public var tmDefaultChar: UShort = 0u,
    public var tmBreakChar: UShort = 0u,
    public var tmItalic: UByte = 0u,
    public var tmUnderlined: UByte = 0u,
    public var tmStruckOut: UByte = 0u,
    public var tmPitchAndFamily: TmpfFlags = 0u,
    public var tmCharSet: UByte = 0u,
    public var ntmFlags: UInt = 0u,
    public var ntmSizeEM: UInt = 0u,
    public var ntmCellHeight: UInt = 0u,
    public var ntmAvgWidth: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Newtextmetricw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Newtextmetricw> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 76L
                override fun readNative(addr: Long): Newtextmetricw =
                    Newtextmetricw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 46L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 50L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 53L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 54L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 55L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                    )
                override fun writeNative(addr: Long, value: Newtextmetricw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.tmHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.tmAscent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.tmDescent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.tmInternalLeading)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.tmExternalLeading)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.tmAveCharWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.tmMaxCharWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.tmWeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.tmOverhang)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.tmDigitizedAspectX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.tmDigitizedAspectY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 44L, value.tmFirstChar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 46L, value.tmLastChar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 48L, value.tmDefaultChar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 50L, value.tmBreakChar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 52L, value.tmItalic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 53L, value.tmUnderlined)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 54L, value.tmStruckOut)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 55L, value.tmPitchAndFamily)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 56L, value.tmCharSet)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.ntmFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.ntmSizeEM)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.ntmCellHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.ntmAvgWidth)
                }
            }
    }
}

public class Outlinetextmetrica internal constructor(
    public var otmSize: UInt,
    public var otmTextMetrics: Textmetrica,
    public var otmFiller: UByte,
    public var otmPanoseNumber: Panose,
    public var otmfsSelection: UInt,
    public var otmfsType: UInt,
    public var otmsCharSlopeRise: Int,
    public var otmsCharSlopeRun: Int,
    public var otmItalicAngle: Int,
    public var otmEMSquare: UInt,
    public var otmAscent: Int,
    public var otmDescent: Int,
    public var otmLineGap: UInt,
    public var otmsCapEmHeight: UInt,
    public var otmsXHeight: UInt,
    public var otmrcFontBox: Rect,
    public var otmMacAscent: Int,
    public var otmMacDescent: Int,
    public var otmMacLineGap: UInt,
    public var otmusMinimumPPEM: UInt,
    public var otmptSubscriptSize: Point,
    public var otmptSubscriptOffset: Point,
    public var otmptSuperscriptSize: Point,
    public var otmptSuperscriptOffset: Point,
    public var otmsStrikeoutSize: UInt,
    public var otmsStrikeoutPosition: Int,
    public var otmsUnderscoreSize: Int,
    public var otmsUnderscorePosition: Int,
    otmpFamilyNameCtorArg: Pstr,
    otmpFaceNameCtorArg: Pstr,
    otmpStyleNameCtorArg: Pstr,
    otmpFullNameCtorArg: Pstr,
) {
    public var otmpFamilyName: Pstr = otmpFamilyNameCtorArg
        internal set

    public var otmpFaceName: Pstr = otmpFaceNameCtorArg
        internal set

    public var otmpStyleName: Pstr = otmpStyleNameCtorArg
        internal set

    public var otmpFullName: Pstr = otmpFullNameCtorArg
        internal set

    public constructor() : this(
        otmSize = 0u,
        otmTextMetrics = Textmetrica(),
        otmFiller = 0u,
        otmPanoseNumber = Panose(),
        otmfsSelection = 0u,
        otmfsType = 0u,
        otmsCharSlopeRise = 0,
        otmsCharSlopeRun = 0,
        otmItalicAngle = 0,
        otmEMSquare = 0u,
        otmAscent = 0,
        otmDescent = 0,
        otmLineGap = 0u,
        otmsCapEmHeight = 0u,
        otmsXHeight = 0u,
        otmrcFontBox = Rect(),
        otmMacAscent = 0,
        otmMacDescent = 0,
        otmMacLineGap = 0u,
        otmusMinimumPPEM = 0u,
        otmptSubscriptSize = Point(),
        otmptSubscriptOffset = Point(),
        otmptSuperscriptSize = Point(),
        otmptSuperscriptOffset = Point(),
        otmsStrikeoutSize = 0u,
        otmsStrikeoutPosition = 0,
        otmsUnderscoreSize = 0,
        otmsUnderscorePosition = 0,
        otmpFamilyNameCtorArg = MutPtr(0L),
        otmpFaceNameCtorArg = MutPtr(0L),
        otmpStyleNameCtorArg = MutPtr(0L),
        otmpFullNameCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            otmSize: UInt = 0u,
            otmTextMetrics: Textmetrica = Textmetrica(),
            otmFiller: UByte = 0u,
            otmPanoseNumber: Panose = Panose(),
            otmfsSelection: UInt = 0u,
            otmfsType: UInt = 0u,
            otmsCharSlopeRise: Int = 0,
            otmsCharSlopeRun: Int = 0,
            otmItalicAngle: Int = 0,
            otmEMSquare: UInt = 0u,
            otmAscent: Int = 0,
            otmDescent: Int = 0,
            otmLineGap: UInt = 0u,
            otmsCapEmHeight: UInt = 0u,
            otmsXHeight: UInt = 0u,
            otmrcFontBox: Rect = Rect(),
            otmMacAscent: Int = 0,
            otmMacDescent: Int = 0,
            otmMacLineGap: UInt = 0u,
            otmusMinimumPPEM: UInt = 0u,
            otmptSubscriptSize: Point = Point(),
            otmptSubscriptOffset: Point = Point(),
            otmptSuperscriptSize: Point = Point(),
            otmptSuperscriptOffset: Point = Point(),
            otmsStrikeoutSize: UInt = 0u,
            otmsStrikeoutPosition: Int = 0,
            otmsUnderscoreSize: Int = 0,
            otmsUnderscorePosition: Int = 0,
            otmpFamilyName: Pstr = MutPtr(0L),
            otmpFaceName: Pstr = MutPtr(0L),
            otmpStyleName: Pstr = MutPtr(0L),
            otmpFullName: Pstr = MutPtr(0L),
        ): Outlinetextmetrica =
            Outlinetextmetrica(
                otmSize = otmSize,
                otmTextMetrics = otmTextMetrics,
                otmFiller = otmFiller,
                otmPanoseNumber = otmPanoseNumber,
                otmfsSelection = otmfsSelection,
                otmfsType = otmfsType,
                otmsCharSlopeRise = otmsCharSlopeRise,
                otmsCharSlopeRun = otmsCharSlopeRun,
                otmItalicAngle = otmItalicAngle,
                otmEMSquare = otmEMSquare,
                otmAscent = otmAscent,
                otmDescent = otmDescent,
                otmLineGap = otmLineGap,
                otmsCapEmHeight = otmsCapEmHeight,
                otmsXHeight = otmsXHeight,
                otmrcFontBox = otmrcFontBox,
                otmMacAscent = otmMacAscent,
                otmMacDescent = otmMacDescent,
                otmMacLineGap = otmMacLineGap,
                otmusMinimumPPEM = otmusMinimumPPEM,
                otmptSubscriptSize = otmptSubscriptSize,
                otmptSubscriptOffset = otmptSubscriptOffset,
                otmptSuperscriptSize = otmptSuperscriptSize,
                otmptSuperscriptOffset = otmptSuperscriptOffset,
                otmsStrikeoutSize = otmsStrikeoutSize,
                otmsStrikeoutPosition = otmsStrikeoutPosition,
                otmsUnderscoreSize = otmsUnderscoreSize,
                otmsUnderscorePosition = otmsUnderscorePosition,
                otmpFamilyNameCtorArg = otmpFamilyName,
                otmpFaceNameCtorArg = otmpFaceName,
                otmpStyleNameCtorArg = otmpStyleName,
                otmpFullNameCtorArg = otmpFullName,
            )
    }
}

public class Outlinetextmetricw internal constructor(
    public var otmSize: UInt,
    public var otmTextMetrics: Textmetricw,
    public var otmFiller: UByte,
    public var otmPanoseNumber: Panose,
    public var otmfsSelection: UInt,
    public var otmfsType: UInt,
    public var otmsCharSlopeRise: Int,
    public var otmsCharSlopeRun: Int,
    public var otmItalicAngle: Int,
    public var otmEMSquare: UInt,
    public var otmAscent: Int,
    public var otmDescent: Int,
    public var otmLineGap: UInt,
    public var otmsCapEmHeight: UInt,
    public var otmsXHeight: UInt,
    public var otmrcFontBox: Rect,
    public var otmMacAscent: Int,
    public var otmMacDescent: Int,
    public var otmMacLineGap: UInt,
    public var otmusMinimumPPEM: UInt,
    public var otmptSubscriptSize: Point,
    public var otmptSubscriptOffset: Point,
    public var otmptSuperscriptSize: Point,
    public var otmptSuperscriptOffset: Point,
    public var otmsStrikeoutSize: UInt,
    public var otmsStrikeoutPosition: Int,
    public var otmsUnderscoreSize: Int,
    public var otmsUnderscorePosition: Int,
    otmpFamilyNameCtorArg: Pstr,
    otmpFaceNameCtorArg: Pstr,
    otmpStyleNameCtorArg: Pstr,
    otmpFullNameCtorArg: Pstr,
) {
    public var otmpFamilyName: Pstr = otmpFamilyNameCtorArg
        internal set

    public var otmpFaceName: Pstr = otmpFaceNameCtorArg
        internal set

    public var otmpStyleName: Pstr = otmpStyleNameCtorArg
        internal set

    public var otmpFullName: Pstr = otmpFullNameCtorArg
        internal set

    public constructor() : this(
        otmSize = 0u,
        otmTextMetrics = Textmetricw(),
        otmFiller = 0u,
        otmPanoseNumber = Panose(),
        otmfsSelection = 0u,
        otmfsType = 0u,
        otmsCharSlopeRise = 0,
        otmsCharSlopeRun = 0,
        otmItalicAngle = 0,
        otmEMSquare = 0u,
        otmAscent = 0,
        otmDescent = 0,
        otmLineGap = 0u,
        otmsCapEmHeight = 0u,
        otmsXHeight = 0u,
        otmrcFontBox = Rect(),
        otmMacAscent = 0,
        otmMacDescent = 0,
        otmMacLineGap = 0u,
        otmusMinimumPPEM = 0u,
        otmptSubscriptSize = Point(),
        otmptSubscriptOffset = Point(),
        otmptSuperscriptSize = Point(),
        otmptSuperscriptOffset = Point(),
        otmsStrikeoutSize = 0u,
        otmsStrikeoutPosition = 0,
        otmsUnderscoreSize = 0,
        otmsUnderscorePosition = 0,
        otmpFamilyNameCtorArg = MutPtr(0L),
        otmpFaceNameCtorArg = MutPtr(0L),
        otmpStyleNameCtorArg = MutPtr(0L),
        otmpFullNameCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            otmSize: UInt = 0u,
            otmTextMetrics: Textmetricw = Textmetricw(),
            otmFiller: UByte = 0u,
            otmPanoseNumber: Panose = Panose(),
            otmfsSelection: UInt = 0u,
            otmfsType: UInt = 0u,
            otmsCharSlopeRise: Int = 0,
            otmsCharSlopeRun: Int = 0,
            otmItalicAngle: Int = 0,
            otmEMSquare: UInt = 0u,
            otmAscent: Int = 0,
            otmDescent: Int = 0,
            otmLineGap: UInt = 0u,
            otmsCapEmHeight: UInt = 0u,
            otmsXHeight: UInt = 0u,
            otmrcFontBox: Rect = Rect(),
            otmMacAscent: Int = 0,
            otmMacDescent: Int = 0,
            otmMacLineGap: UInt = 0u,
            otmusMinimumPPEM: UInt = 0u,
            otmptSubscriptSize: Point = Point(),
            otmptSubscriptOffset: Point = Point(),
            otmptSuperscriptSize: Point = Point(),
            otmptSuperscriptOffset: Point = Point(),
            otmsStrikeoutSize: UInt = 0u,
            otmsStrikeoutPosition: Int = 0,
            otmsUnderscoreSize: Int = 0,
            otmsUnderscorePosition: Int = 0,
            otmpFamilyName: Pstr = MutPtr(0L),
            otmpFaceName: Pstr = MutPtr(0L),
            otmpStyleName: Pstr = MutPtr(0L),
            otmpFullName: Pstr = MutPtr(0L),
        ): Outlinetextmetricw =
            Outlinetextmetricw(
                otmSize = otmSize,
                otmTextMetrics = otmTextMetrics,
                otmFiller = otmFiller,
                otmPanoseNumber = otmPanoseNumber,
                otmfsSelection = otmfsSelection,
                otmfsType = otmfsType,
                otmsCharSlopeRise = otmsCharSlopeRise,
                otmsCharSlopeRun = otmsCharSlopeRun,
                otmItalicAngle = otmItalicAngle,
                otmEMSquare = otmEMSquare,
                otmAscent = otmAscent,
                otmDescent = otmDescent,
                otmLineGap = otmLineGap,
                otmsCapEmHeight = otmsCapEmHeight,
                otmsXHeight = otmsXHeight,
                otmrcFontBox = otmrcFontBox,
                otmMacAscent = otmMacAscent,
                otmMacDescent = otmMacDescent,
                otmMacLineGap = otmMacLineGap,
                otmusMinimumPPEM = otmusMinimumPPEM,
                otmptSubscriptSize = otmptSubscriptSize,
                otmptSubscriptOffset = otmptSubscriptOffset,
                otmptSuperscriptSize = otmptSuperscriptSize,
                otmptSuperscriptOffset = otmptSuperscriptOffset,
                otmsStrikeoutSize = otmsStrikeoutSize,
                otmsStrikeoutPosition = otmsStrikeoutPosition,
                otmsUnderscoreSize = otmsUnderscoreSize,
                otmsUnderscorePosition = otmsUnderscorePosition,
                otmpFamilyNameCtorArg = otmpFamilyName,
                otmpFaceNameCtorArg = otmpFaceName,
                otmpStyleNameCtorArg = otmpStyleName,
                otmpFullNameCtorArg = otmpFullName,
            )
    }
}

public class Paintstruct internal constructor(
    hdcCtorArg: Hdc,
    public var fErase: Bool,
    public var rcPaint: Rect,
    public var fRestore: Bool,
    public var fIncUpdate: Bool,
    public var rgbReserved: UByteArray,
) {
    public var hdc: Hdc = hdcCtorArg
        internal set

    public constructor() : this(
        hdcCtorArg = MutPtr(0L),
        fErase = 0,
        rcPaint = Rect(),
        fRestore = 0,
        fIncUpdate = 0,
        rgbReserved = UByteArray(32),
    )

    public operator fun component1(): Hdc = this.hdc

    public operator fun component2(): Bool = this.fErase

    public operator fun component3(): Rect = this.rcPaint

    public operator fun component4(): Bool = this.fRestore

    public operator fun component5(): Bool = this.fIncUpdate

    public operator fun component6(): UByteArray = this.rgbReserved

    public fun copy(hdc: Hdc = this.hdc, fErase: Bool = this.fErase, rcPaint: Rect = this.rcPaint, fRestore: Bool = this.fRestore, fIncUpdate: Bool = this.fIncUpdate, rgbReserved: UByteArray = this.rgbReserved): Paintstruct = Paintstruct(hdcCtorArg = hdc, fErase = fErase, rcPaint = rcPaint, fRestore = fRestore, fIncUpdate = fIncUpdate, rgbReserved = rgbReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Paintstruct) return false
        if (this.hdc != other.hdc) return false
        if (this.fErase != other.fErase) return false
        if (this.rcPaint != other.rcPaint) return false
        if (this.fRestore != other.fRestore) return false
        if (this.fIncUpdate != other.fIncUpdate) return false
        if (!this.rgbReserved.contentEquals(other.rgbReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdc.hashCode()
        result = 31 * result + this.fErase.hashCode()
        result = 31 * result + this.rcPaint.hashCode()
        result = 31 * result + this.fRestore.hashCode()
        result = 31 * result + this.fIncUpdate.hashCode()
        result = 31 * result + this.rgbReserved.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            hdc: Hdc = MutPtr(0L),
            fErase: Bool = 0,
            rcPaint: Rect = Rect(),
            fRestore: Bool = 0,
            fIncUpdate: Bool = 0,
            rgbReserved: UByteArray = UByteArray(32),
        ): Paintstruct =
            Paintstruct(
                hdcCtorArg = hdc,
                fErase = fErase,
                rcPaint = rcPaint,
                fRestore = fRestore,
                fIncUpdate = fIncUpdate,
                rgbReserved = rgbReserved,
            )
    }
}

public data class Paletteentry(
    public var peRed: UByte = 0u,
    public var peGreen: UByte = 0u,
    public var peBlue: UByte = 0u,
    public var peFlags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Paletteentry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Paletteentry> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Paletteentry =
                    Paletteentry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: Paletteentry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.peRed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.peGreen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.peBlue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.peFlags)
                }
            }
    }
}

public data class Panose(
    public var bFamilyType: PanFamilyType = 0u,
    public var bSerifStyle: PanSerifStyle = 0u,
    public var bWeight: PanWeight = 0u,
    public var bProportion: PanProportion = 0u,
    public var bContrast: PanContrast = 0u,
    public var bStrokeVariation: PanStrokeVariation = 0u,
    public var bArmStyle: PanArmStyle = 0u,
    public var bLetterform: PanLettForm = 0u,
    public var bMidline: PanMidline = 0u,
    public var bXHeight: PanXheight = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Panose> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Panose> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 10L
                override fun readNative(addr: Long): Panose =
                    Panose(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                    )
                override fun writeNative(addr: Long, value: Panose) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.bFamilyType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.bSerifStyle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.bWeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.bProportion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.bContrast)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.bStrokeVariation)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.bArmStyle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.bLetterform)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.bMidline)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.bXHeight)
                }
            }
    }
}

public data class Pelarray(
    public var paXCount: Int = 0,
    public var paYCount: Int = 0,
    public var paXExt: Int = 0,
    public var paYExt: Int = 0,
    public var paRGBs: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pelarray> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pelarray> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): Pelarray =
                    Pelarray(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Pelarray) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.paXCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.paYCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.paXExt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.paYExt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.paRGBs)
                }
            }
    }
}

public data class Pointfx(
    public var x: Fixed = Fixed(),
    public var y: Fixed = Fixed(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pointfx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pointfx> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Pointfx =
                    Pointfx(
                        (Fixed.typeLayout()).readNative(addr),
                        (Fixed.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Pointfx) {
                    (Fixed.typeLayout()).writeNative(addr, value.x)
                    (Fixed.typeLayout()).writeNative(addr + 4L, value.y)
                }
            }
    }
}

public class Polytexta internal constructor(
    public var x: Int,
    public var y: Int,
    public var n: UInt,
    lpstrCtorArg: Pcstr,
    public var uiFlags: UInt,
    public var rcl: Rect,
    pdxCtorArg: MutPtr<Int>,
) {
    public var lpstr: Pcstr = lpstrCtorArg
        internal set

    public var pdx: MutPtr<Int> = pdxCtorArg
        internal set

    public constructor() : this(
        x = 0,
        y = 0,
        n = 0u,
        lpstrCtorArg = ConstPtr(0L),
        uiFlags = 0u,
        rcl = Rect(),
        pdxCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.x

    public operator fun component2(): Int = this.y

    public operator fun component3(): UInt = this.n

    public operator fun component4(): Pcstr = this.lpstr

    public operator fun component5(): UInt = this.uiFlags

    public operator fun component6(): Rect = this.rcl

    public operator fun component7(): MutPtr<Int> = this.pdx

    public fun copy(x: Int = this.x, y: Int = this.y, n: UInt = this.n, lpstr: Pcstr = this.lpstr, uiFlags: UInt = this.uiFlags, rcl: Rect = this.rcl, pdx: MutPtr<Int> = this.pdx): Polytexta = Polytexta(x = x, y = y, n = n, lpstrCtorArg = lpstr, uiFlags = uiFlags, rcl = rcl, pdxCtorArg = pdx)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Polytexta) return false
        if (this.x != other.x) return false
        if (this.y != other.y) return false
        if (this.n != other.n) return false
        if (this.lpstr != other.lpstr) return false
        if (this.uiFlags != other.uiFlags) return false
        if (this.rcl != other.rcl) return false
        if (this.pdx != other.pdx) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.x.hashCode()
        result = 31 * result + this.y.hashCode()
        result = 31 * result + this.n.hashCode()
        result = 31 * result + this.lpstr.hashCode()
        result = 31 * result + this.uiFlags.hashCode()
        result = 31 * result + this.rcl.hashCode()
        result = 31 * result + this.pdx.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            x: Int = 0,
            y: Int = 0,
            n: UInt = 0u,
            lpstr: Pcstr = ConstPtr(0L),
            uiFlags: UInt = 0u,
            rcl: Rect = Rect(),
            pdx: MutPtr<Int> = MutPtr(0L),
        ): Polytexta =
            Polytexta(
                x = x,
                y = y,
                n = n,
                lpstrCtorArg = lpstr,
                uiFlags = uiFlags,
                rcl = rcl,
                pdxCtorArg = pdx,
            )
    }
}

public class Polytextw internal constructor(
    public var x: Int,
    public var y: Int,
    public var n: UInt,
    lpstrCtorArg: Pcwstr,
    public var uiFlags: UInt,
    public var rcl: Rect,
    pdxCtorArg: MutPtr<Int>,
) {
    public var lpstr: Pcwstr = lpstrCtorArg
        internal set

    public var pdx: MutPtr<Int> = pdxCtorArg
        internal set

    public constructor() : this(
        x = 0,
        y = 0,
        n = 0u,
        lpstrCtorArg = ConstPtr(0L),
        uiFlags = 0u,
        rcl = Rect(),
        pdxCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.x

    public operator fun component2(): Int = this.y

    public operator fun component3(): UInt = this.n

    public operator fun component4(): Pcwstr = this.lpstr

    public operator fun component5(): UInt = this.uiFlags

    public operator fun component6(): Rect = this.rcl

    public operator fun component7(): MutPtr<Int> = this.pdx

    public fun copy(x: Int = this.x, y: Int = this.y, n: UInt = this.n, lpstr: Pcwstr = this.lpstr, uiFlags: UInt = this.uiFlags, rcl: Rect = this.rcl, pdx: MutPtr<Int> = this.pdx): Polytextw = Polytextw(x = x, y = y, n = n, lpstrCtorArg = lpstr, uiFlags = uiFlags, rcl = rcl, pdxCtorArg = pdx)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Polytextw) return false
        if (this.x != other.x) return false
        if (this.y != other.y) return false
        if (this.n != other.n) return false
        if (this.lpstr != other.lpstr) return false
        if (this.uiFlags != other.uiFlags) return false
        if (this.rcl != other.rcl) return false
        if (this.pdx != other.pdx) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.x.hashCode()
        result = 31 * result + this.y.hashCode()
        result = 31 * result + this.n.hashCode()
        result = 31 * result + this.lpstr.hashCode()
        result = 31 * result + this.uiFlags.hashCode()
        result = 31 * result + this.rcl.hashCode()
        result = 31 * result + this.pdx.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            x: Int = 0,
            y: Int = 0,
            n: UInt = 0u,
            lpstr: Pcwstr = ConstPtr(0L),
            uiFlags: UInt = 0u,
            rcl: Rect = Rect(),
            pdx: MutPtr<Int> = MutPtr(0L),
        ): Polytextw =
            Polytextw(
                x = x,
                y = y,
                n = n,
                lpstrCtorArg = lpstr,
                uiFlags = uiFlags,
                rcl = rcl,
                pdxCtorArg = pdx,
            )
    }
}

public data class RasterizerStatus(
    public var nSize: Short = 0,
    public var wFlags: Short = 0,
    public var nLanguageID: Short = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RasterizerStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RasterizerStatus> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
                override fun readNative(addr: Long): RasterizerStatus =
                    RasterizerStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: RasterizerStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.nSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.wFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 4L, value.nLanguageID)
                }
            }
    }
}

public data class Rgbquad(
    public var rgbBlue: UByte = 0u,
    public var rgbGreen: UByte = 0u,
    public var rgbRed: UByte = 0u,
    public var rgbReserved: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rgbquad> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rgbquad> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Rgbquad =
                    Rgbquad(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: Rgbquad) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.rgbBlue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.rgbGreen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.rgbRed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.rgbReserved)
                }
            }
    }
}

public data class Rgbtriple(
    public var rgbtBlue: UByte = 0u,
    public var rgbtGreen: UByte = 0u,
    public var rgbtRed: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rgbtriple> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rgbtriple> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 3L
                override fun readNative(addr: Long): Rgbtriple =
                    Rgbtriple(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Rgbtriple) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.rgbtBlue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.rgbtGreen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.rgbtRed)
                }
            }
    }
}

public data class Rgndata(
    public var rdh: Rgndataheader = Rgndataheader(),
    public var buffer: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rgndata) return false
        if (this.rdh != other.rdh) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rdh.hashCode()
        result = 31 * result + this.buffer.contentHashCode()
        return result
    }
}

public data class Rgndataheader(
    public var dwSize: UInt = 0u,
    public var iType: UInt = 0u,
    public var nCount: UInt = 0u,
    public var nRgnSize: UInt = 0u,
    public var rcBound: Rect = Rect(),
)

public class Textmetrica(
    public var tmHeight: Int = 0,
    public var tmAscent: Int = 0,
    public var tmDescent: Int = 0,
    public var tmInternalLeading: Int = 0,
    public var tmExternalLeading: Int = 0,
    public var tmAveCharWidth: Int = 0,
    public var tmMaxCharWidth: Int = 0,
    public var tmWeight: Int = 0,
    public var tmOverhang: Int = 0,
    public var tmDigitizedAspectX: Int = 0,
    public var tmDigitizedAspectY: Int = 0,
    public var tmFirstChar: UByte = 0u,
    public var tmLastChar: UByte = 0u,
    public var tmDefaultChar: UByte = 0u,
    public var tmBreakChar: UByte = 0u,
    public var tmItalic: UByte = 0u,
    public var tmUnderlined: UByte = 0u,
    public var tmStruckOut: UByte = 0u,
    public var tmPitchAndFamily: TmpfFlags = 0u,
    public var tmCharSet: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Textmetrica> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Textmetrica> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): Textmetrica =
                    Textmetrica(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 45L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 46L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 47L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 49L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 50L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 51L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 52L),
                    )
                override fun writeNative(addr: Long, value: Textmetrica) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.tmHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.tmAscent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.tmDescent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.tmInternalLeading)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.tmExternalLeading)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.tmAveCharWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.tmMaxCharWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.tmWeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.tmOverhang)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.tmDigitizedAspectX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.tmDigitizedAspectY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 44L, value.tmFirstChar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 45L, value.tmLastChar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 46L, value.tmDefaultChar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 47L, value.tmBreakChar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 48L, value.tmItalic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 49L, value.tmUnderlined)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 50L, value.tmStruckOut)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 51L, value.tmPitchAndFamily)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 52L, value.tmCharSet)
                }
            }
    }
}

public class Textmetricw(
    public var tmHeight: Int = 0,
    public var tmAscent: Int = 0,
    public var tmDescent: Int = 0,
    public var tmInternalLeading: Int = 0,
    public var tmExternalLeading: Int = 0,
    public var tmAveCharWidth: Int = 0,
    public var tmMaxCharWidth: Int = 0,
    public var tmWeight: Int = 0,
    public var tmOverhang: Int = 0,
    public var tmDigitizedAspectX: Int = 0,
    public var tmDigitizedAspectY: Int = 0,
    public var tmFirstChar: UShort = 0u,
    public var tmLastChar: UShort = 0u,
    public var tmDefaultChar: UShort = 0u,
    public var tmBreakChar: UShort = 0u,
    public var tmItalic: UByte = 0u,
    public var tmUnderlined: UByte = 0u,
    public var tmStruckOut: UByte = 0u,
    public var tmPitchAndFamily: TmpfFlags = 0u,
    public var tmCharSet: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Textmetricw> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Textmetricw> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 60L
                override fun readNative(addr: Long): Textmetricw =
                    Textmetricw(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 46L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 50L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 53L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 54L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 55L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: Textmetricw) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.tmHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.tmAscent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.tmDescent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.tmInternalLeading)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.tmExternalLeading)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.tmAveCharWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.tmMaxCharWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.tmWeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.tmOverhang)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.tmDigitizedAspectX)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.tmDigitizedAspectY)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 44L, value.tmFirstChar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 46L, value.tmLastChar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 48L, value.tmDefaultChar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 50L, value.tmBreakChar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 52L, value.tmItalic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 53L, value.tmUnderlined)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 54L, value.tmStruckOut)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 55L, value.tmPitchAndFamily)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 56L, value.tmCharSet)
                }
            }
    }
}

public data class Trivertex(
    public var x: Int = 0,
    public var y: Int = 0,
    public var red: UShort = 0u,
    public var green: UShort = 0u,
    public var blue: UShort = 0u,
    public var alpha: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Trivertex> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Trivertex> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Trivertex =
                    Trivertex(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                    )
                override fun writeNative(addr: Long, value: Trivertex) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.y)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.red)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.green)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.blue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.alpha)
                }
            }
    }
}

public class Ttembedinfo internal constructor(
    public var usStructSize: UShort,
    public var usRootStrSize: UShort,
    pusRootStrCtorArg: MutPtr<UShort>,
) {
    public var pusRootStr: MutPtr<UShort> = pusRootStrCtorArg
        internal set

    public constructor() : this(
        usStructSize = 0u,
        usRootStrSize = 0u,
        pusRootStrCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.usStructSize

    public operator fun component2(): UShort = this.usRootStrSize

    public operator fun component3(): MutPtr<UShort> = this.pusRootStr

    public fun copy(usStructSize: UShort = this.usStructSize, usRootStrSize: UShort = this.usRootStrSize, pusRootStr: MutPtr<UShort> = this.pusRootStr): Ttembedinfo = Ttembedinfo(usStructSize = usStructSize, usRootStrSize = usRootStrSize, pusRootStrCtorArg = pusRootStr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ttembedinfo) return false
        if (this.usStructSize != other.usStructSize) return false
        if (this.usRootStrSize != other.usRootStrSize) return false
        if (this.pusRootStr != other.pusRootStr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.usStructSize.hashCode()
        result = 31 * result + this.usRootStrSize.hashCode()
        result = 31 * result + this.pusRootStr.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ttembedinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ttembedinfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Ttembedinfo =
                    Ttembedinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Ttembedinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.usStructSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.usRootStrSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 8L, value.pusRootStr)
                }
            }

        public operator fun invoke(
            usStructSize: UShort = 0u,
            usRootStrSize: UShort = 0u,
            pusRootStr: MutPtr<UShort> = MutPtr(0L),
        ): Ttembedinfo =
            Ttembedinfo(
                usStructSize = usStructSize,
                usRootStrSize = usRootStrSize,
                pusRootStrCtorArg = pusRootStr,
            )
    }
}

public class Ttloadinfo internal constructor(
    public var usStructSize: UShort,
    public var usRefStrSize: UShort,
    pusRefStrCtorArg: MutPtr<UShort>,
) {
    public var pusRefStr: MutPtr<UShort> = pusRefStrCtorArg
        internal set

    public constructor() : this(
        usStructSize = 0u,
        usRefStrSize = 0u,
        pusRefStrCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UShort = this.usStructSize

    public operator fun component2(): UShort = this.usRefStrSize

    public operator fun component3(): MutPtr<UShort> = this.pusRefStr

    public fun copy(usStructSize: UShort = this.usStructSize, usRefStrSize: UShort = this.usRefStrSize, pusRefStr: MutPtr<UShort> = this.pusRefStr): Ttloadinfo = Ttloadinfo(usStructSize = usStructSize, usRefStrSize = usRefStrSize, pusRefStrCtorArg = pusRefStr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ttloadinfo) return false
        if (this.usStructSize != other.usStructSize) return false
        if (this.usRefStrSize != other.usRefStrSize) return false
        if (this.pusRefStr != other.pusRefStr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.usStructSize.hashCode()
        result = 31 * result + this.usRefStrSize.hashCode()
        result = 31 * result + this.pusRefStr.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ttloadinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ttloadinfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Ttloadinfo =
                    Ttloadinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Ttloadinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.usStructSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.usRefStrSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 8L, value.pusRefStr)
                }
            }

        public operator fun invoke(
            usStructSize: UShort = 0u,
            usRefStrSize: UShort = 0u,
            pusRefStr: MutPtr<UShort> = MutPtr(0L),
        ): Ttloadinfo =
            Ttloadinfo(
                usStructSize = usStructSize,
                usRefStrSize = usRefStrSize,
                pusRefStrCtorArg = pusRefStr,
            )
    }
}

public data class Ttpolycurve(
    public var wType: UShort = 0u,
    public var cpfx: UShort = 0u,
    public var apfx: List<Pointfx> = List(1) { Pointfx() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ttpolycurve> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ttpolycurve> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Ttpolycurve =
                    Ttpolycurve(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(Pointfx.typeLayout(), (1).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Ttpolycurve) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.cpfx)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(Pointfx.typeLayout(), (1).toInt())
                    ).writeNative(addr + 4L, value.apfx)
                }
            }
    }
}

public data class Ttpolygonheader(
    public var cb: UInt = 0u,
    public var dwType: UInt = 0u,
    public var pfxStart: Pointfx = Pointfx(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ttpolygonheader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ttpolygonheader> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Ttpolygonheader =
                    Ttpolygonheader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (Pointfx.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Ttpolygonheader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cb)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dwType)
                    (Pointfx.typeLayout()).writeNative(addr + 8L, value.pfxStart)
                }
            }
    }
}

public class Ttvalidationtestsparams internal constructor(
    public var ulStructSize: UInt,
    public var lTestFromSize: Int,
    public var lTestToSize: Int,
    public var ulCharSet: UInt,
    public var usReserved1: UShort,
    public var usCharCodeCount: UShort,
    pusCharCodeSetCtorArg: MutPtr<UShort>,
) {
    public var pusCharCodeSet: MutPtr<UShort> = pusCharCodeSetCtorArg
        internal set

    public constructor() : this(
        ulStructSize = 0u,
        lTestFromSize = 0,
        lTestToSize = 0,
        ulCharSet = 0u,
        usReserved1 = 0u,
        usCharCodeCount = 0u,
        pusCharCodeSetCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.ulStructSize

    public operator fun component2(): Int = this.lTestFromSize

    public operator fun component3(): Int = this.lTestToSize

    public operator fun component4(): UInt = this.ulCharSet

    public operator fun component5(): UShort = this.usReserved1

    public operator fun component6(): UShort = this.usCharCodeCount

    public operator fun component7(): MutPtr<UShort> = this.pusCharCodeSet

    public fun copy(ulStructSize: UInt = this.ulStructSize, lTestFromSize: Int = this.lTestFromSize, lTestToSize: Int = this.lTestToSize, ulCharSet: UInt = this.ulCharSet, usReserved1: UShort = this.usReserved1, usCharCodeCount: UShort = this.usCharCodeCount, pusCharCodeSet: MutPtr<UShort> = this.pusCharCodeSet): Ttvalidationtestsparams = Ttvalidationtestsparams(ulStructSize = ulStructSize, lTestFromSize = lTestFromSize, lTestToSize = lTestToSize, ulCharSet = ulCharSet, usReserved1 = usReserved1, usCharCodeCount = usCharCodeCount, pusCharCodeSetCtorArg = pusCharCodeSet)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ttvalidationtestsparams) return false
        if (this.ulStructSize != other.ulStructSize) return false
        if (this.lTestFromSize != other.lTestFromSize) return false
        if (this.lTestToSize != other.lTestToSize) return false
        if (this.ulCharSet != other.ulCharSet) return false
        if (this.usReserved1 != other.usReserved1) return false
        if (this.usCharCodeCount != other.usCharCodeCount) return false
        if (this.pusCharCodeSet != other.pusCharCodeSet) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulStructSize.hashCode()
        result = 31 * result + this.lTestFromSize.hashCode()
        result = 31 * result + this.lTestToSize.hashCode()
        result = 31 * result + this.ulCharSet.hashCode()
        result = 31 * result + this.usReserved1.hashCode()
        result = 31 * result + this.usCharCodeCount.hashCode()
        result = 31 * result + this.pusCharCodeSet.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ttvalidationtestsparams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ttvalidationtestsparams> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Ttvalidationtestsparams =
                    Ttvalidationtestsparams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UShort>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Ttvalidationtestsparams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulStructSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.lTestFromSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.lTestToSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.ulCharSet)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.usReserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.usCharCodeCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UShort>(64)
                    ).writeNative(addr + 24L, value.pusCharCodeSet)
                }
            }

        public operator fun invoke(
            ulStructSize: UInt = 0u,
            lTestFromSize: Int = 0,
            lTestToSize: Int = 0,
            ulCharSet: UInt = 0u,
            usReserved1: UShort = 0u,
            usCharCodeCount: UShort = 0u,
            pusCharCodeSet: MutPtr<UShort> = MutPtr(0L),
        ): Ttvalidationtestsparams =
            Ttvalidationtestsparams(
                ulStructSize = ulStructSize,
                lTestFromSize = lTestFromSize,
                lTestToSize = lTestToSize,
                ulCharSet = ulCharSet,
                usReserved1 = usReserved1,
                usCharCodeCount = usCharCodeCount,
                pusCharCodeSetCtorArg = pusCharCodeSet,
            )
    }
}

public class Ttvalidationtestsparamsex internal constructor(
    public var ulStructSize: UInt,
    public var lTestFromSize: Int,
    public var lTestToSize: Int,
    public var ulCharSet: UInt,
    public var usReserved1: UShort,
    public var usCharCodeCount: UShort,
    pulCharCodeSetCtorArg: MutPtr<UInt>,
) {
    public var pulCharCodeSet: MutPtr<UInt> = pulCharCodeSetCtorArg
        internal set

    public constructor() : this(
        ulStructSize = 0u,
        lTestFromSize = 0,
        lTestToSize = 0,
        ulCharSet = 0u,
        usReserved1 = 0u,
        usCharCodeCount = 0u,
        pulCharCodeSetCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.ulStructSize

    public operator fun component2(): Int = this.lTestFromSize

    public operator fun component3(): Int = this.lTestToSize

    public operator fun component4(): UInt = this.ulCharSet

    public operator fun component5(): UShort = this.usReserved1

    public operator fun component6(): UShort = this.usCharCodeCount

    public operator fun component7(): MutPtr<UInt> = this.pulCharCodeSet

    public fun copy(ulStructSize: UInt = this.ulStructSize, lTestFromSize: Int = this.lTestFromSize, lTestToSize: Int = this.lTestToSize, ulCharSet: UInt = this.ulCharSet, usReserved1: UShort = this.usReserved1, usCharCodeCount: UShort = this.usCharCodeCount, pulCharCodeSet: MutPtr<UInt> = this.pulCharCodeSet): Ttvalidationtestsparamsex = Ttvalidationtestsparamsex(ulStructSize = ulStructSize, lTestFromSize = lTestFromSize, lTestToSize = lTestToSize, ulCharSet = ulCharSet, usReserved1 = usReserved1, usCharCodeCount = usCharCodeCount, pulCharCodeSetCtorArg = pulCharCodeSet)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ttvalidationtestsparamsex) return false
        if (this.ulStructSize != other.ulStructSize) return false
        if (this.lTestFromSize != other.lTestFromSize) return false
        if (this.lTestToSize != other.lTestToSize) return false
        if (this.ulCharSet != other.ulCharSet) return false
        if (this.usReserved1 != other.usReserved1) return false
        if (this.usCharCodeCount != other.usCharCodeCount) return false
        if (this.pulCharCodeSet != other.pulCharCodeSet) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulStructSize.hashCode()
        result = 31 * result + this.lTestFromSize.hashCode()
        result = 31 * result + this.lTestToSize.hashCode()
        result = 31 * result + this.ulCharSet.hashCode()
        result = 31 * result + this.usReserved1.hashCode()
        result = 31 * result + this.usCharCodeCount.hashCode()
        result = 31 * result + this.pulCharCodeSet.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ttvalidationtestsparamsex> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ttvalidationtestsparamsex> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Ttvalidationtestsparamsex =
                    Ttvalidationtestsparamsex(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UInt>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Ttvalidationtestsparamsex) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ulStructSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.lTestFromSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.lTestToSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.ulCharSet)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.usReserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.usCharCodeCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UInt>(64)
                    ).writeNative(addr + 24L, value.pulCharCodeSet)
                }
            }

        public operator fun invoke(
            ulStructSize: UInt = 0u,
            lTestFromSize: Int = 0,
            lTestToSize: Int = 0,
            ulCharSet: UInt = 0u,
            usReserved1: UShort = 0u,
            usCharCodeCount: UShort = 0u,
            pulCharCodeSet: MutPtr<UInt> = MutPtr(0L),
        ): Ttvalidationtestsparamsex =
            Ttvalidationtestsparamsex(
                ulStructSize = ulStructSize,
                lTestFromSize = lTestFromSize,
                lTestToSize = lTestToSize,
                ulCharSet = ulCharSet,
                usReserved1 = usReserved1,
                usCharCodeCount = usCharCodeCount,
                pulCharCodeSetCtorArg = pulCharCodeSet,
            )
    }
}

public data class Wcrange(
    public var wcLow: UShort = 0u,
    public var cGlyphs: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wcrange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wcrange> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Wcrange =
                    Wcrange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Wcrange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wcLow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.cGlyphs)
                }
            }
    }
}

public class Wglswap internal constructor(
    hdcCtorArg: Hdc,
    public var uiFlags: UInt,
) {
    public var hdc: Hdc = hdcCtorArg
        internal set

    public constructor() : this(
        hdcCtorArg = MutPtr(0L),
        uiFlags = 0u,
    )

    public operator fun component1(): Hdc = this.hdc

    public operator fun component2(): UInt = this.uiFlags

    public fun copy(hdc: Hdc = this.hdc, uiFlags: UInt = this.uiFlags): Wglswap = Wglswap(hdcCtorArg = hdc, uiFlags = uiFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Wglswap) return false
        if (this.hdc != other.hdc) return false
        if (this.uiFlags != other.uiFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hdc.hashCode()
        result = 31 * result + this.uiFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wglswap> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Wglswap> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Wglswap =
                    Wglswap(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Wglswap) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.hdc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.uiFlags)
                }
            }

        public operator fun invoke(
            hdc: Hdc = MutPtr(0L),
            uiFlags: UInt = 0u,
        ): Wglswap =
            Wglswap(
                hdcCtorArg = hdc,
                uiFlags = uiFlags,
            )
    }
}

public data class Xform(
    public var eM11: Float = 0.0f,
    public var eM12: Float = 0.0f,
    public var eM21: Float = 0.0f,
    public var eM22: Float = 0.0f,
    public var eDx: Float = 0.0f,
    public var eDy: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Xform> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Xform> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Xform =
                    Xform(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Xform) {
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
