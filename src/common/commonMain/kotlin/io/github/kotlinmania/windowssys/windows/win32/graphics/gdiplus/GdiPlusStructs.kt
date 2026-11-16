@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rectl
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Metaheader

public class BitmapData internal constructor(
    public var width: UInt,
    public var height: UInt,
    public var stride: Int,
    public var pixelFormat: Int,
    scan0CtorArg: MutPtr,
    public var reserved: Int,
) {
    public var scan0: MutPtr = scan0CtorArg
        internal set

    public constructor() : this(
        width = 0u,
        height = 0u,
        stride = 0,
        pixelFormat = 0,
        scan0CtorArg = MutPtr(0L),
        reserved = 0,
    )

    public operator fun component1(): UInt = this.width

    public operator fun component2(): UInt = this.height

    public operator fun component3(): Int = this.stride

    public operator fun component4(): Int = this.pixelFormat

    public operator fun component5(): MutPtr = this.scan0

    public operator fun component6(): Int = this.reserved

    public fun copy(width: UInt = this.width, height: UInt = this.height, stride: Int = this.stride, pixelFormat: Int = this.pixelFormat, scan0: MutPtr = this.scan0, reserved: Int = this.reserved): BitmapData = BitmapData(width = width, height = height, stride = stride, pixelFormat = pixelFormat, scan0CtorArg = scan0, reserved = reserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BitmapData) return false
        if (this.width != other.width) return false
        if (this.height != other.height) return false
        if (this.stride != other.stride) return false
        if (this.pixelFormat != other.pixelFormat) return false
        if (this.scan0 != other.scan0) return false
        if (this.reserved != other.reserved) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.width.hashCode()
        result = 31 * result + this.height.hashCode()
        result = 31 * result + this.stride.hashCode()
        result = 31 * result + this.pixelFormat.hashCode()
        result = 31 * result + this.scan0.hashCode()
        result = 31 * result + this.reserved.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BitmapData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BitmapData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): BitmapData =
                    BitmapData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: BitmapData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.width)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.height)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.stride)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.pixelFormat)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.scan0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.reserved)
                }
            }

        public operator fun invoke(
            width: UInt = 0u,
            height: UInt = 0u,
            stride: Int = 0,
            pixelFormat: Int = 0,
            scan0: MutPtr = MutPtr(0L),
            reserved: Int = 0,
        ): BitmapData =
            BitmapData(
                width = width,
                height = height,
                stride = stride,
                pixelFormat = pixelFormat,
                scan0CtorArg = scan0,
                reserved = reserved,
            )
    }
}

public data class Blur(
    public var base: Effect = Effect(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Blur> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Blur> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): Blur =
                    Blur(
                        (Effect.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Blur) {
                    (Effect.typeLayout()).writeNative(addr, value.base)
                }
            }
    }
}

public data class BlurParams(
    public var radius: Float = 0.0f,
    public var expandEdge: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BlurParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BlurParams> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): BlurParams =
                    BlurParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: BlurParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.radius)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.expandEdge)
                }
            }
    }
}

public data class BrightnessContrast(
    public var base: Effect = Effect(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BrightnessContrast> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BrightnessContrast> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): BrightnessContrast =
                    BrightnessContrast(
                        (Effect.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: BrightnessContrast) {
                    (Effect.typeLayout()).writeNative(addr, value.base)
                }
            }
    }
}

public data class BrightnessContrastParams(
    public var brightnessLevel: Int = 0,
    public var contrastLevel: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BrightnessContrastParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BrightnessContrastParams> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): BrightnessContrastParams =
                    BrightnessContrastParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: BrightnessContrastParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.brightnessLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.contrastLevel)
                }
            }
    }
}

public data class CharacterRange(
    public var first: Int = 0,
    public var length: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CharacterRange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CharacterRange> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): CharacterRange =
                    CharacterRange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: CharacterRange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.first)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.length)
                }
            }
    }
}

public data class Color(
    public var argb: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Color> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Color> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Color =
                    Color(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Color) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.argb)
                }
            }

        public val ALICE_BLUE: Int = -984833

        public val ANTIQUE_WHITE: Int = -332841

        public val AQUA: Int = -16711681

        public val AQUAMARINE: Int = -8388652

        public val AZURE: Int = -983041

        public val BEIGE: Int = -657956

        public val BISQUE: Int = -6972

        public val BLACK: Int = -16777216

        public val BLANCHED_ALMOND: Int = -5171

        public val BLUE: Int = -16776961

        public val BLUE_VIOLET: Int = -7722014

        public val BROWN: Int = -5952982

        public val BURLY_WOOD: Int = -2180985

        public val CADET_BLUE: Int = -10510688

        public val CHARTREUSE: Int = -8388864

        public val CHOCOLATE: Int = -2987746

        public val CORAL: Int = -32944

        public val CORNFLOWER_BLUE: Int = -10185235

        public val CORNSILK: Int = -1828

        public val CRIMSON: Int = -2354116

        public val CYAN: Int = -16711681

        public val DARK_BLUE: Int = -16777077

        public val DARK_CYAN: Int = -16741493

        public val DARK_GOLDENROD: Int = -4684277

        public val DARK_GRAY: Int = -5658199

        public val DARK_GREEN: Int = -16751616

        public val DARK_KHAKI: Int = -4343957

        public val DARK_MAGENTA: Int = -7667573

        public val DARK_OLIVE_GREEN: Int = -11179217

        public val DARK_ORANGE: Int = -29696

        public val DARK_ORCHID: Int = -6737204

        public val DARK_RED: Int = -7667712

        public val DARK_SALMON: Int = -1468806

        public val DARK_SEA_GREEN: Int = -7357301

        public val DARK_SLATE_BLUE: Int = -12042869

        public val DARK_SLATE_GRAY: Int = -13676721

        public val DARK_TURQUOISE: Int = -16724271

        public val DARK_VIOLET: Int = -7077677

        public val DEEP_PINK: Int = -60269

        public val DEEP_SKY_BLUE: Int = -16728065

        public val DIM_GRAY: Int = -9868951

        public val DODGER_BLUE: Int = -14774017

        public val FIREBRICK: Int = -5103070

        public val FLORAL_WHITE: Int = -1296

        public val FOREST_GREEN: Int = -14513374

        public val FUCHSIA: Int = -65281

        public val GAINSBORO: Int = -2302756

        public val GHOST_WHITE: Int = -460545

        public val GOLD: Int = -10496

        public val GOLDENROD: Int = -2448096

        public val GRAY: Int = -8355712

        public val GREEN: Int = -16744448

        public val GREEN_YELLOW: Int = -5374161

        public val HONEYDEW: Int = -983056

        public val HOT_PINK: Int = -38476

        public val INDIAN_RED: Int = -3318692

        public val INDIGO: Int = -11861886

        public val IVORY: Int = -16

        public val KHAKI: Int = -989556

        public val LAVENDER: Int = -1644806

        public val LAVENDER_BLUSH: Int = -3851

        public val LAWN_GREEN: Int = -8586240

        public val LEMON_CHIFFON: Int = -1331

        public val LIGHT_BLUE: Int = -5383962

        public val LIGHT_CORAL: Int = -1015680

        public val LIGHT_CYAN: Int = -2031617

        public val LIGHT_GOLDENROD_YELLOW: Int = -329006

        public val LIGHT_GRAY: Int = -2894893

        public val LIGHT_GREEN: Int = -7278960

        public val LIGHT_PINK: Int = -18751

        public val LIGHT_SALMON: Int = -24454

        public val LIGHT_SEA_GREEN: Int = -14634326

        public val LIGHT_SKY_BLUE: Int = -7876870

        public val LIGHT_SLATE_GRAY: Int = -8943463

        public val LIGHT_STEEL_BLUE: Int = -5192482

        public val LIGHT_YELLOW: Int = -32

        public val LIME: Int = -16711936

        public val LIME_GREEN: Int = -13447886

        public val LINEN: Int = -331546

        public val MAGENTA: Int = -65281

        public val MAROON: Int = -8388608

        public val MEDIUM_AQUAMARINE: Int = -10039894

        public val MEDIUM_BLUE: Int = -16777011

        public val MEDIUM_ORCHID: Int = -4565549

        public val MEDIUM_PURPLE: Int = -7114533

        public val MEDIUM_SEA_GREEN: Int = -12799119

        public val MEDIUM_SLATE_BLUE: Int = -8689426

        public val MEDIUM_SPRING_GREEN: Int = -16713062

        public val MEDIUM_TURQUOISE: Int = -12004916

        public val MEDIUM_VIOLET_RED: Int = -3730043

        public val MIDNIGHT_BLUE: Int = -15132304

        public val MINT_CREAM: Int = -655366

        public val MISTY_ROSE: Int = -6943

        public val MOCCASIN: Int = -6987

        public val NAVAJO_WHITE: Int = -8531

        public val NAVY: Int = -16777088

        public val OLD_LACE: Int = -133658

        public val OLIVE: Int = -8355840

        public val OLIVE_DRAB: Int = -9728477

        public val ORANGE: Int = -23296

        public val ORANGE_RED: Int = -47872

        public val ORCHID: Int = -2461482

        public val PALE_GOLDENROD: Int = -1120086

        public val PALE_GREEN: Int = -6751336

        public val PALE_TURQUOISE: Int = -5247250

        public val PALE_VIOLET_RED: Int = -2396013

        public val PAPAYA_WHIP: Int = -4139

        public val PEACH_PUFF: Int = -9543

        public val PERU: Int = -3308225

        public val PINK: Int = -16181

        public val PLUM: Int = -2252579

        public val POWDER_BLUE: Int = -5185306

        public val PURPLE: Int = -8388480

        public val RED: Int = -65536

        public val ROSY_BROWN: Int = -4419697

        public val ROYAL_BLUE: Int = -12490271

        public val SADDLE_BROWN: Int = -7650029

        public val SALMON: Int = -360334

        public val SANDY_BROWN: Int = -744352

        public val SEA_GREEN: Int = -13726889

        public val SEA_SHELL: Int = -2578

        public val SIENNA: Int = -6270419

        public val SILVER: Int = -4144960

        public val SKY_BLUE: Int = -7876885

        public val SLATE_BLUE: Int = -9807155

        public val SLATE_GRAY: Int = -9404272

        public val SNOW: Int = -1286

        public val SPRING_GREEN: Int = -16711809

        public val STEEL_BLUE: Int = -12156236

        public val TAN: Int = -2968436

        public val TEAL: Int = -16744320

        public val THISTLE: Int = -2572328

        public val TOMATO: Int = -40121

        public val TRANSPARENT: Int = 16777215

        public val TURQUOISE: Int = -12525360

        public val VIOLET: Int = -1146130

        public val WHEAT: Int = -663885

        public val WHITE: Int = -1

        public val WHITE_SMOKE: Int = -657931

        public val YELLOW: Int = -256

        public val YELLOW_GREEN: Int = -6632142

        public val ALPHA_SHIFT: Int = 24

        public val RED_SHIFT: Int = 16

        public val GREEN_SHIFT: Int = 8

        public val BLUE_SHIFT: Int = 0

        public val ALPHA_MASK: Int = -16777216

        public val RED_MASK: Int = 16711680

        public val GREEN_MASK: Int = 65280

        public val BLUE_MASK: Int = 255
    }
}

public data class ColorBalance(
    public var base: Effect = Effect(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ColorBalance> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ColorBalance> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): ColorBalance =
                    ColorBalance(
                        (Effect.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ColorBalance) {
                    (Effect.typeLayout()).writeNative(addr, value.base)
                }
            }
    }
}

public data class ColorBalanceParams(
    public var cyanRed: Int = 0,
    public var magentaGreen: Int = 0,
    public var yellowBlue: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ColorBalanceParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ColorBalanceParams> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ColorBalanceParams =
                    ColorBalanceParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ColorBalanceParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.cyanRed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.magentaGreen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.yellowBlue)
                }
            }
    }
}

public data class ColorCurve(
    public var base: Effect = Effect(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ColorCurve> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ColorCurve> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): ColorCurve =
                    ColorCurve(
                        (Effect.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ColorCurve) {
                    (Effect.typeLayout()).writeNative(addr, value.base)
                }
            }
    }
}

public data class ColorCurveParams(
    public var adjustment: CurveAdjustments = 0,
    public var channel: CurveChannel = 0,
    public var adjustValue: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ColorCurveParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ColorCurveParams> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ColorCurveParams =
                    ColorCurveParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ColorCurveParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.adjustment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.channel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.adjustValue)
                }
            }
    }
}

public data class ColorLUT(
    public var base: Effect = Effect(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ColorLUT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ColorLUT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): ColorLUT =
                    ColorLUT(
                        (Effect.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ColorLUT) {
                    (Effect.typeLayout()).writeNative(addr, value.base)
                }
            }
    }
}

public data class ColorLUTParams(
    public var lutB: UByteArray = UByteArray(256),
    public var lutG: UByteArray = UByteArray(256),
    public var lutR: UByteArray = UByteArray(256),
    public var lutA: UByteArray = UByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ColorLUTParams) return false
        if (!this.lutB.contentEquals(other.lutB)) return false
        if (!this.lutG.contentEquals(other.lutG)) return false
        if (!this.lutR.contentEquals(other.lutR)) return false
        if (!this.lutA.contentEquals(other.lutA)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lutB.contentHashCode()
        result = 31 * result + this.lutG.contentHashCode()
        result = 31 * result + this.lutR.contentHashCode()
        result = 31 * result + this.lutA.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ColorLUTParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ColorLUTParams> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1024L
                override fun readNative(addr: Long): ColorLUTParams =
                    ColorLUTParams(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                        ).readNative(addr).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                        ).readNative(addr + 256L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                        ).readNative(addr + 512L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                        ).readNative(addr + 768L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: ColorLUTParams) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                    ).writeNative(addr, value.lutB.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                    ).writeNative(addr + 256L, value.lutG.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                    ).writeNative(addr + 512L, value.lutR.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                    ).writeNative(addr + 768L, value.lutA.toList())
                }
            }
    }
}

public data class ColorMap(
    public var oldColor: Color = Color(),
    public var newColor: Color = Color(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ColorMap> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ColorMap> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ColorMap =
                    ColorMap(
                        (Color.typeLayout()).readNative(addr),
                        (Color.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ColorMap) {
                    (Color.typeLayout()).writeNative(addr, value.oldColor)
                    (Color.typeLayout()).writeNative(addr + 4L, value.newColor)
                }
            }
    }
}

public data class ColorMatrix(
    public var m: FloatArray = FloatArray(25),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ColorMatrix) return false
        if (!this.m.contentEquals(other.m)) return false
        return true
    }

    override fun hashCode(): Int = this.m.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ColorMatrix> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ColorMatrix> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 100L
                override fun readNative(addr: Long): ColorMatrix =
                    ColorMatrix(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32, (25).toInt())
                        ).readNative(addr).toFloatArray(),
                    )
                override fun writeNative(addr: Long, value: ColorMatrix) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32, (25).toInt())
                    ).writeNative(addr, value.m.toList())
                }
            }
    }
}

public data class ColorMatrixEffect(
    public var base: Effect = Effect(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ColorMatrixEffect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ColorMatrixEffect> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): ColorMatrixEffect =
                    ColorMatrixEffect(
                        (Effect.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ColorMatrixEffect) {
                    (Effect.typeLayout()).writeNative(addr, value.base)
                }
            }
    }
}

public data class ColorPalette(
    public var flags: UInt = 0u,
    public var count: UInt = 0u,
    public var entries: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ColorPalette) return false
        if (this.flags != other.flags) return false
        if (this.count != other.count) return false
        if (!this.entries.contentEquals(other.entries)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.count.hashCode()
        result = 31 * result + this.entries.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ColorPalette> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ColorPalette> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): ColorPalette =
                    ColorPalette(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 8L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: ColorPalette) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 8L, value.entries.toList())
                }
            }
    }
}

public data class Enhmetaheader3(
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
    public var szlDevice: io.github.kotlinmania.windowssys.windows.win32.foundation.Size =
        io.github.kotlinmania.windowssys.windows.win32.foundation
            .Size(),
    public var szlMillimeters: io.github.kotlinmania.windowssys.windows.win32.foundation.Size =
        io.github.kotlinmania.windowssys.windows.win32.foundation
            .Size(),
)

public class Effect internal constructor(
    lpVtblCtorArg: MutPtr,
    nativeEffectCtorArg: MutPtr,
    public var auxDataSize: Int,
    auxDataCtorArg: MutPtr,
    public var useAuxData: Bool,
) {
    public var lpVtbl: MutPtr = lpVtblCtorArg
        internal set

    public var nativeEffect: MutPtr = nativeEffectCtorArg
        internal set

    public var auxData: MutPtr = auxDataCtorArg
        internal set

    public constructor() : this(
        lpVtblCtorArg = MutPtr(0L),
        nativeEffectCtorArg = MutPtr(0L),
        auxDataSize = 0,
        auxDataCtorArg = MutPtr(0L),
        useAuxData = 0,
    )

    public operator fun component1(): MutPtr = this.lpVtbl

    public operator fun component2(): MutPtr = this.nativeEffect

    public operator fun component3(): Int = this.auxDataSize

    public operator fun component4(): MutPtr = this.auxData

    public operator fun component5(): Bool = this.useAuxData

    public fun copy(lpVtbl: MutPtr = this.lpVtbl, nativeEffect: MutPtr = this.nativeEffect, auxDataSize: Int = this.auxDataSize, auxData: MutPtr = this.auxData, useAuxData: Bool = this.useAuxData): Effect = Effect(lpVtblCtorArg = lpVtbl, nativeEffectCtorArg = nativeEffect, auxDataSize = auxDataSize, auxDataCtorArg = auxData, useAuxData = useAuxData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Effect) return false
        if (this.lpVtbl != other.lpVtbl) return false
        if (this.nativeEffect != other.nativeEffect) return false
        if (this.auxDataSize != other.auxDataSize) return false
        if (this.auxData != other.auxData) return false
        if (this.useAuxData != other.useAuxData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lpVtbl.hashCode()
        result = 31 * result + this.nativeEffect.hashCode()
        result = 31 * result + this.auxDataSize.hashCode()
        result = 31 * result + this.auxData.hashCode()
        result = 31 * result + this.useAuxData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Effect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Effect> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): Effect =
                    Effect(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: Effect) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.lpVtbl)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.nativeEffect)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.auxDataSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.auxData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.useAuxData)
                }
            }

        public operator fun invoke(
            lpVtbl: MutPtr = MutPtr(0L),
            nativeEffect: MutPtr = MutPtr(0L),
            auxDataSize: Int = 0,
            auxData: MutPtr = MutPtr(0L),
            useAuxData: Bool = 0,
        ): Effect =
            Effect(
                lpVtblCtorArg = lpVtbl,
                nativeEffectCtorArg = nativeEffect,
                auxDataSize = auxDataSize,
                auxDataCtorArg = auxData,
                useAuxData = useAuxData,
            )
    }
}

public class EncoderParameter internal constructor(
    public var guid: Guid,
    public var numberOfValues: UInt,
    public var type: UInt,
    valueCtorArg: MutPtr,
) {
    public var value: MutPtr = valueCtorArg
        internal set

    public constructor() : this(
        guid = Guid(),
        numberOfValues = 0u,
        type = 0u,
        valueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Guid = this.guid

    public operator fun component2(): UInt = this.numberOfValues

    public operator fun component3(): UInt = this.type

    public operator fun component4(): MutPtr = this.value

    public fun copy(guid: Guid = this.guid, numberOfValues: UInt = this.numberOfValues, type: UInt = this.type, value: MutPtr = this.value): EncoderParameter = EncoderParameter(guid = guid, numberOfValues = numberOfValues, type = type, valueCtorArg = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EncoderParameter) return false
        if (this.guid != other.guid) return false
        if (this.numberOfValues != other.numberOfValues) return false
        if (this.type != other.type) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.guid.hashCode()
        result = 31 * result + this.numberOfValues.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            guid: Guid = Guid(),
            numberOfValues: UInt = 0u,
            type: UInt = 0u,
            value: MutPtr = MutPtr(0L),
        ): EncoderParameter =
            EncoderParameter(
                guid = guid,
                numberOfValues = numberOfValues,
                type = type,
                valueCtorArg = value,
            )
    }
}

public data class EncoderParameters(
    public var count: UInt = 0u,
    public var parameter: List<EncoderParameter> = List(1) { EncoderParameter() },
)

public data class GdiplusStartupInput(
    public var gdiplusVersion: UInt = 0u,
    public var debugEventCallback: Int = 0,
    public var suppressBackgroundThread: Bool = 0,
    public var suppressExternalCodecs: Bool = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GdiplusStartupInput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GdiplusStartupInput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): GdiplusStartupInput =
                    GdiplusStartupInput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: GdiplusStartupInput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.gdiplusVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.debugEventCallback)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.suppressBackgroundThread)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.suppressExternalCodecs)
                }
            }
    }
}

public data class GdiplusStartupInputEx(
    public var base: GdiplusStartupInput = GdiplusStartupInput(),
    public var startupParameters: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GdiplusStartupInputEx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GdiplusStartupInputEx> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): GdiplusStartupInputEx =
                    GdiplusStartupInputEx(
                        (GdiplusStartupInput.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: GdiplusStartupInputEx) {
                    (GdiplusStartupInput.typeLayout()).writeNative(addr, value.base)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.startupParameters)
                }
            }
    }
}

public data class GdiplusStartupOutput(
    public var notificationHook: Int = 0,
    public var notificationUnhook: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GdiplusStartupOutput> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GdiplusStartupOutput> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): GdiplusStartupOutput =
                    GdiplusStartupOutput(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: GdiplusStartupOutput) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr, value.notificationHook)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 8L, value.notificationUnhook)
                }
            }
    }
}

public data class GpAdjustableArrowCap(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpAdjustableArrowCap> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpAdjustableArrowCap> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): GpAdjustableArrowCap =
                    GpAdjustableArrowCap(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GpAdjustableArrowCap) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.value)
                }
            }
    }
}

public data class GpBitmap(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpBitmap> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpBitmap> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): GpBitmap =
                    GpBitmap(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GpBitmap) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.value)
                }
            }
    }
}

public data class GpBrush(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpBrush> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpBrush> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): GpBrush =
                    GpBrush(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GpBrush) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.value)
                }
            }
    }
}

public data class GpCachedBitmap(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpCachedBitmap> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpCachedBitmap> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): GpCachedBitmap =
                    GpCachedBitmap(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GpCachedBitmap) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.value)
                }
            }
    }
}

public data class GpCustomLineCap(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpCustomLineCap> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpCustomLineCap> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): GpCustomLineCap =
                    GpCustomLineCap(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GpCustomLineCap) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.value)
                }
            }
    }
}

public data class GpFont(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpFont> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpFont> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): GpFont =
                    GpFont(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GpFont) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.value)
                }
            }
    }
}

public data class GpFontCollection(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpFontCollection> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpFontCollection> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): GpFontCollection =
                    GpFontCollection(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GpFontCollection) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.value)
                }
            }
    }
}

public data class GpFontFamily(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpFontFamily> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpFontFamily> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): GpFontFamily =
                    GpFontFamily(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GpFontFamily) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.value)
                }
            }
    }
}

public data class GpGraphics(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpGraphics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpGraphics> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): GpGraphics =
                    GpGraphics(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GpGraphics) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.value)
                }
            }
    }
}

public data class GpHatch(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpHatch> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpHatch> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): GpHatch =
                    GpHatch(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GpHatch) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.value)
                }
            }
    }
}

public data class GpImage(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpImage> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpImage> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): GpImage =
                    GpImage(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GpImage) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.value)
                }
            }
    }
}

public data class GpImageAttributes(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpImageAttributes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpImageAttributes> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): GpImageAttributes =
                    GpImageAttributes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GpImageAttributes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.value)
                }
            }
    }
}

public data class GpInstalledFontCollection(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpInstalledFontCollection> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpInstalledFontCollection> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): GpInstalledFontCollection =
                    GpInstalledFontCollection(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GpInstalledFontCollection) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.value)
                }
            }
    }
}

public data class GpLineGradient(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpLineGradient> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpLineGradient> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): GpLineGradient =
                    GpLineGradient(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GpLineGradient) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.value)
                }
            }
    }
}

public data class GpMetafile(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpMetafile> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpMetafile> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): GpMetafile =
                    GpMetafile(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GpMetafile) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.value)
                }
            }
    }
}

public data class GpPath(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpPath> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpPath> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): GpPath =
                    GpPath(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GpPath) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.value)
                }
            }
    }
}

public data class GpPathGradient(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpPathGradient> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpPathGradient> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): GpPathGradient =
                    GpPathGradient(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GpPathGradient) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.value)
                }
            }
    }
}

public data class GpPathIterator(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpPathIterator> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpPathIterator> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): GpPathIterator =
                    GpPathIterator(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GpPathIterator) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.value)
                }
            }
    }
}

public data class GpPen(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpPen> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpPen> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): GpPen =
                    GpPen(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GpPen) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.value)
                }
            }
    }
}

public data class GpPrivateFontCollection(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpPrivateFontCollection> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpPrivateFontCollection> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): GpPrivateFontCollection =
                    GpPrivateFontCollection(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GpPrivateFontCollection) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.value)
                }
            }
    }
}

public data class GpRegion(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpRegion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpRegion> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): GpRegion =
                    GpRegion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GpRegion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.value)
                }
            }
    }
}

public data class GpSolidFill(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpSolidFill> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpSolidFill> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): GpSolidFill =
                    GpSolidFill(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GpSolidFill) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.value)
                }
            }
    }
}

public data class GpStringFormat(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpStringFormat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpStringFormat> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): GpStringFormat =
                    GpStringFormat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GpStringFormat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.value)
                }
            }
    }
}

public data class GpTexture(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpTexture> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GpTexture> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1L
                override fun readNative(addr: Long): GpTexture =
                    GpTexture(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GpTexture) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.value)
                }
            }
    }
}

public data class HueSaturationLightness(
    public var base: Effect = Effect(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HueSaturationLightness> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HueSaturationLightness> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): HueSaturationLightness =
                    HueSaturationLightness(
                        (Effect.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: HueSaturationLightness) {
                    (Effect.typeLayout()).writeNative(addr, value.base)
                }
            }
    }
}

public data class HueSaturationLightnessParams(
    public var hueLevel: Int = 0,
    public var saturationLevel: Int = 0,
    public var lightnessLevel: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HueSaturationLightnessParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HueSaturationLightnessParams> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): HueSaturationLightnessParams =
                    HueSaturationLightnessParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: HueSaturationLightnessParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.hueLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.saturationLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.lightnessLevel)
                }
            }
    }
}

public class ImageCodecInfo internal constructor(
    public var clsid: Guid,
    public var formatID: Guid,
    codecNameCtorArg: Pcwstr,
    dllNameCtorArg: Pcwstr,
    formatDescriptionCtorArg: Pcwstr,
    filenameExtensionCtorArg: Pcwstr,
    mimeTypeCtorArg: Pcwstr,
    public var flags: UInt,
    public var version: UInt,
    public var sigCount: UInt,
    public var sigSize: UInt,
    sigPatternCtorArg: ConstPtr,
    sigMaskCtorArg: ConstPtr,
) {
    public var codecName: Pcwstr = codecNameCtorArg
        internal set

    public var dllName: Pcwstr = dllNameCtorArg
        internal set

    public var formatDescription: Pcwstr = formatDescriptionCtorArg
        internal set

    public var filenameExtension: Pcwstr = filenameExtensionCtorArg
        internal set

    public var mimeType: Pcwstr = mimeTypeCtorArg
        internal set

    public var sigPattern: ConstPtr = sigPatternCtorArg
        internal set

    public var sigMask: ConstPtr = sigMaskCtorArg
        internal set

    public constructor() : this(
        clsid = Guid(),
        formatID = Guid(),
        codecNameCtorArg = ConstPtr(0L),
        dllNameCtorArg = ConstPtr(0L),
        formatDescriptionCtorArg = ConstPtr(0L),
        filenameExtensionCtorArg = ConstPtr(0L),
        mimeTypeCtorArg = ConstPtr(0L),
        flags = 0u,
        version = 0u,
        sigCount = 0u,
        sigSize = 0u,
        sigPatternCtorArg = ConstPtr(0L),
        sigMaskCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Guid = this.clsid

    public operator fun component2(): Guid = this.formatID

    public operator fun component3(): Pcwstr = this.codecName

    public operator fun component4(): Pcwstr = this.dllName

    public operator fun component5(): Pcwstr = this.formatDescription

    public operator fun component6(): Pcwstr = this.filenameExtension

    public operator fun component7(): Pcwstr = this.mimeType

    public operator fun component8(): UInt = this.flags

    public operator fun component9(): UInt = this.version

    public operator fun component10(): UInt = this.sigCount

    public operator fun component11(): UInt = this.sigSize

    public operator fun component12(): ConstPtr = this.sigPattern

    public operator fun component13(): ConstPtr = this.sigMask

    public fun copy(clsid: Guid = this.clsid, formatID: Guid = this.formatID, codecName: Pcwstr = this.codecName, dllName: Pcwstr = this.dllName, formatDescription: Pcwstr = this.formatDescription, filenameExtension: Pcwstr = this.filenameExtension, mimeType: Pcwstr = this.mimeType, flags: UInt = this.flags, version: UInt = this.version, sigCount: UInt = this.sigCount, sigSize: UInt = this.sigSize, sigPattern: ConstPtr = this.sigPattern, sigMask: ConstPtr = this.sigMask): ImageCodecInfo = ImageCodecInfo(clsid = clsid, formatID = formatID, codecNameCtorArg = codecName, dllNameCtorArg = dllName, formatDescriptionCtorArg = formatDescription, filenameExtensionCtorArg = filenameExtension, mimeTypeCtorArg = mimeType, flags = flags, version = version, sigCount = sigCount, sigSize = sigSize, sigPatternCtorArg = sigPattern, sigMaskCtorArg = sigMask)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageCodecInfo) return false
        if (this.clsid != other.clsid) return false
        if (this.formatID != other.formatID) return false
        if (this.codecName != other.codecName) return false
        if (this.dllName != other.dllName) return false
        if (this.formatDescription != other.formatDescription) return false
        if (this.filenameExtension != other.filenameExtension) return false
        if (this.mimeType != other.mimeType) return false
        if (this.flags != other.flags) return false
        if (this.version != other.version) return false
        if (this.sigCount != other.sigCount) return false
        if (this.sigSize != other.sigSize) return false
        if (this.sigPattern != other.sigPattern) return false
        if (this.sigMask != other.sigMask) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.clsid.hashCode()
        result = 31 * result + this.formatID.hashCode()
        result = 31 * result + this.codecName.hashCode()
        result = 31 * result + this.dllName.hashCode()
        result = 31 * result + this.formatDescription.hashCode()
        result = 31 * result + this.filenameExtension.hashCode()
        result = 31 * result + this.mimeType.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.sigCount.hashCode()
        result = 31 * result + this.sigSize.hashCode()
        result = 31 * result + this.sigPattern.hashCode()
        result = 31 * result + this.sigMask.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            clsid: Guid = Guid(),
            formatID: Guid = Guid(),
            codecName: Pcwstr = ConstPtr(0L),
            dllName: Pcwstr = ConstPtr(0L),
            formatDescription: Pcwstr = ConstPtr(0L),
            filenameExtension: Pcwstr = ConstPtr(0L),
            mimeType: Pcwstr = ConstPtr(0L),
            flags: UInt = 0u,
            version: UInt = 0u,
            sigCount: UInt = 0u,
            sigSize: UInt = 0u,
            sigPattern: ConstPtr = ConstPtr(0L),
            sigMask: ConstPtr = ConstPtr(0L),
        ): ImageCodecInfo =
            ImageCodecInfo(
                clsid = clsid,
                formatID = formatID,
                codecNameCtorArg = codecName,
                dllNameCtorArg = dllName,
                formatDescriptionCtorArg = formatDescription,
                filenameExtensionCtorArg = filenameExtension,
                mimeTypeCtorArg = mimeType,
                flags = flags,
                version = version,
                sigCount = sigCount,
                sigSize = sigSize,
                sigPatternCtorArg = sigPattern,
                sigMaskCtorArg = sigMask,
            )
    }
}

public class ImageItemData internal constructor(
    public var size: UInt,
    public var position: UInt,
    descCtorArg: MutPtr,
    public var descSize: UInt,
    dataCtorArg: MutPtr,
    public var dataSize: UInt,
    public var cookie: UInt,
) {
    public var desc: MutPtr = descCtorArg
        internal set

    public var data: MutPtr = dataCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        position = 0u,
        descCtorArg = MutPtr(0L),
        descSize = 0u,
        dataCtorArg = MutPtr(0L),
        dataSize = 0u,
        cookie = 0u,
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): UInt = this.position

    public operator fun component3(): MutPtr = this.desc

    public operator fun component4(): UInt = this.descSize

    public operator fun component5(): MutPtr = this.data

    public operator fun component6(): UInt = this.dataSize

    public operator fun component7(): UInt = this.cookie

    public fun copy(size: UInt = this.size, position: UInt = this.position, desc: MutPtr = this.desc, descSize: UInt = this.descSize, data: MutPtr = this.data, dataSize: UInt = this.dataSize, cookie: UInt = this.cookie): ImageItemData = ImageItemData(size = size, position = position, descCtorArg = desc, descSize = descSize, dataCtorArg = data, dataSize = dataSize, cookie = cookie)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageItemData) return false
        if (this.size != other.size) return false
        if (this.position != other.position) return false
        if (this.desc != other.desc) return false
        if (this.descSize != other.descSize) return false
        if (this.data != other.data) return false
        if (this.dataSize != other.dataSize) return false
        if (this.cookie != other.cookie) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.position.hashCode()
        result = 31 * result + this.desc.hashCode()
        result = 31 * result + this.descSize.hashCode()
        result = 31 * result + this.data.hashCode()
        result = 31 * result + this.dataSize.hashCode()
        result = 31 * result + this.cookie.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageItemData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageItemData> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): ImageItemData =
                    ImageItemData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: ImageItemData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.position)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.desc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.descSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dataSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.cookie)
                }
            }

        public operator fun invoke(
            size: UInt = 0u,
            position: UInt = 0u,
            desc: MutPtr = MutPtr(0L),
            descSize: UInt = 0u,
            data: MutPtr = MutPtr(0L),
            dataSize: UInt = 0u,
            cookie: UInt = 0u,
        ): ImageItemData =
            ImageItemData(
                size = size,
                position = position,
                descCtorArg = desc,
                descSize = descSize,
                dataCtorArg = data,
                dataSize = dataSize,
                cookie = cookie,
            )
    }
}

public data class Levels(
    public var base: Effect = Effect(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Levels> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Levels> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): Levels =
                    Levels(
                        (Effect.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Levels) {
                    (Effect.typeLayout()).writeNative(addr, value.base)
                }
            }
    }
}

public data class LevelsParams(
    public var highlight: Int = 0,
    public var midtone: Int = 0,
    public var shadow: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LevelsParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LevelsParams> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): LevelsParams =
                    LevelsParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: LevelsParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.highlight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.midtone)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.shadow)
                }
            }
    }
}

public data class MetafileHeader(
    public var type: MetafileType = 0,
    public var size: UInt = 0u,
    public var version: UInt = 0u,
    public var emfPlusFlags: UInt = 0u,
    public var dpiX: Float = 0.0f,
    public var dpiY: Float = 0.0f,
    public var x: Int = 0,
    public var y: Int = 0,
    public var width: Int = 0,
    public var height: Int = 0,
    public var anonymous: MetafileHeader0 = MetafileHeader0(),
    public var emfPlusHeaderSize: Int = 0,
    public var logicalDpiX: Int = 0,
    public var logicalDpiY: Int = 0,
)

public data class MetafileHeader0(
    public var wmfHeader: Metaheader = Metaheader(),
    public var emfHeader: Enhmetaheader3 = Enhmetaheader3(),
)

public data class PWMFRect16(
    public var left: Short = 0,
    public var top: Short = 0,
    public var right: Short = 0,
    public var bottom: Short = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PWMFRect16> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PWMFRect16> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PWMFRect16 =
                    PWMFRect16(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: PWMFRect16) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.left)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.top)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 4L, value.right)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 6L, value.bottom)
                }
            }
    }
}

public data class Point(
    public var x: Int = 0,
    public var y: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Point> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Point> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Point =
                    Point(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Point) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.y)
                }
            }
    }
}

public data class PointF(
    public var x: Float = 0.0f,
    public var y: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PointF> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PointF> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PointF =
                    PointF(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PointF) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.y)
                }
            }
    }
}

public class PropertyItem internal constructor(
    public var id: UInt,
    public var length: UInt,
    public var type: UShort,
    valueCtorArg: MutPtr,
) {
    public var value: MutPtr = valueCtorArg
        internal set

    public constructor() : this(
        id = 0u,
        length = 0u,
        type = 0u,
        valueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.id

    public operator fun component2(): UInt = this.length

    public operator fun component3(): UShort = this.type

    public operator fun component4(): MutPtr = this.value

    public fun copy(id: UInt = this.id, length: UInt = this.length, type: UShort = this.type, value: MutPtr = this.value): PropertyItem = PropertyItem(id = id, length = length, type = type, valueCtorArg = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PropertyItem) return false
        if (this.id != other.id) return false
        if (this.length != other.length) return false
        if (this.type != other.type) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PropertyItem> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PropertyItem> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): PropertyItem =
                    PropertyItem(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: PropertyItem) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.id)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.length)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.type)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.value)
                }
            }

        public operator fun invoke(
            id: UInt = 0u,
            length: UInt = 0u,
            type: UShort = 0u,
            value: MutPtr = MutPtr(0L),
        ): PropertyItem =
            PropertyItem(
                id = id,
                length = length,
                type = type,
                valueCtorArg = value,
            )
    }
}

public data class Rect(
    public var x: Int = 0,
    public var y: Int = 0,
    public var width: Int = 0,
    public var height: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rect> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Rect =
                    Rect(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Rect) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.y)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.width)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.height)
                }
            }
    }
}

public data class RectF(
    public var x: Float = 0.0f,
    public var y: Float = 0.0f,
    public var width: Float = 0.0f,
    public var height: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RectF> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RectF> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): RectF =
                    RectF(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: RectF) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.y)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.width)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 12L, value.height)
                }
            }
    }
}

public data class RedEyeCorrection(
    public var base: Effect = Effect(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RedEyeCorrection> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RedEyeCorrection> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): RedEyeCorrection =
                    RedEyeCorrection(
                        (Effect.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: RedEyeCorrection) {
                    (Effect.typeLayout()).writeNative(addr, value.base)
                }
            }
    }
}

public class RedEyeCorrectionParams internal constructor(
    public var numberOfAreas: UInt,
    areasCtorArg: MutPtr,
) {
    public var areas: MutPtr = areasCtorArg
        internal set

    public constructor() : this(
        numberOfAreas = 0u,
        areasCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.numberOfAreas

    public operator fun component2(): MutPtr = this.areas

    public fun copy(numberOfAreas: UInt = this.numberOfAreas, areas: MutPtr = this.areas): RedEyeCorrectionParams = RedEyeCorrectionParams(numberOfAreas = numberOfAreas, areasCtorArg = areas)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RedEyeCorrectionParams) return false
        if (this.numberOfAreas != other.numberOfAreas) return false
        if (this.areas != other.areas) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numberOfAreas.hashCode()
        result = 31 * result + this.areas.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RedEyeCorrectionParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RedEyeCorrectionParams> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): RedEyeCorrectionParams =
                    RedEyeCorrectionParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: RedEyeCorrectionParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numberOfAreas)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.areas)
                }
            }

        public operator fun invoke(
            numberOfAreas: UInt = 0u,
            areas: MutPtr = MutPtr(0L),
        ): RedEyeCorrectionParams =
            RedEyeCorrectionParams(
                numberOfAreas = numberOfAreas,
                areasCtorArg = areas,
            )
    }
}

public data class Sharpen(
    public var base: Effect = Effect(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sharpen> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sharpen> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): Sharpen =
                    Sharpen(
                        (Effect.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Sharpen) {
                    (Effect.typeLayout()).writeNative(addr, value.base)
                }
            }
    }
}

public data class SharpenParams(
    public var radius: Float = 0.0f,
    public var amount: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SharpenParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SharpenParams> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SharpenParams =
                    SharpenParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SharpenParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.radius)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.amount)
                }
            }
    }
}

public data class Size(
    public var width: Int = 0,
    public var height: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Size> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Size> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Size =
                    Size(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Size) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.width)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.height)
                }
            }
    }
}

public data class SizeF(
    public var width: Float = 0.0f,
    public var height: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SizeF> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SizeF> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SizeF =
                    SizeF(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SizeF) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.width)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.height)
                }
            }
    }
}

public data class Tint(
    public var base: Effect = Effect(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tint> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tint> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): Tint =
                    Tint(
                        (Effect.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Tint) {
                    (Effect.typeLayout()).writeNative(addr, value.base)
                }
            }
    }
}

public data class TintParams(
    public var hue: Int = 0,
    public var amount: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TintParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TintParams> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): TintParams =
                    TintParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: TintParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.hue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.amount)
                }
            }
    }
}

public data class WmfPlaceableFileHeader(
    public var key: UInt = 0u,
    public var hmf: Short = 0,
    public var boundingBox: PWMFRect16 = PWMFRect16(),
    public var inch: Short = 0,
    public var reserved: UInt = 0u,
    public var checksum: Short = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmfPlaceableFileHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<WmfPlaceableFileHeader> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 22L
                override fun readNative(addr: Long): WmfPlaceableFileHeader =
                    WmfPlaceableFileHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 4L),
                        (PWMFRect16.typeLayout()).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: WmfPlaceableFileHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.key)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 4L, value.hmf)
                    (PWMFRect16.typeLayout()).writeNative(addr + 6L, value.boundingBox)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 14L, value.inch)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 20L, value.checksum)
                }
            }
    }
}
