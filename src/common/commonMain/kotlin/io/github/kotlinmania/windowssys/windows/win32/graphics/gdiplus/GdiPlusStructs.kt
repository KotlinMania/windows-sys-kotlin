@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rectl
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Metaheader

public data class BitmapData(
    public var width: UInt = 0u,
    public var height: UInt = 0u,
    public var stride: Int = 0,
    public var pixelFormat: Int = 0,
    public var scan0: COpaquePointer? = null,
    public var reserved: Int = 0,
)

public data class Blur(
    public var base: Effect = Effect(),
)

public data class BlurParams(
    public var radius: Float = 0.0f,
    public var expandEdge: Bool = 0,
)

public data class BrightnessContrast(
    public var base: Effect = Effect(),
)

public data class BrightnessContrastParams(
    public var brightnessLevel: Int = 0,
    public var contrastLevel: Int = 0,
)

public data class CharacterRange(
    public var first: Int = 0,
    public var length: Int = 0,
)

public data class Color(
    public var argb: UInt = 0u,
) {
    public companion object {
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
)

public data class ColorBalanceParams(
    public var cyanRed: Int = 0,
    public var magentaGreen: Int = 0,
    public var yellowBlue: Int = 0,
)

public data class ColorCurve(
    public var base: Effect = Effect(),
)

public data class ColorCurveParams(
    public var adjustment: CurveAdjustments = 0,
    public var channel: CurveChannel = 0,
    public var adjustValue: Int = 0,
)

public data class ColorLUT(
    public var base: Effect = Effect(),
)

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
}

public data class ColorMap(
    public var oldColor: Color = Color(),
    public var newColor: Color = Color(),
)

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
}

public data class ColorMatrixEffect(
    public var base: Effect = Effect(),
)

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
    public var szlDevice: io.github.kotlinmania.windowssys.windows.win32.foundation.Size = io.github.kotlinmania.windowssys.windows.win32.foundation.Size(),
    public var szlMillimeters: io.github.kotlinmania.windowssys.windows.win32.foundation.Size = io.github.kotlinmania.windowssys.windows.win32.foundation.Size(),
)

public data class Effect(
    public var lpVtbl: COpaquePointer? = null,
    public var nativeEffect: Int? = null,
    public var auxDataSize: Int = 0,
    public var auxData: COpaquePointer? = null,
    public var useAuxData: Bool = 0,
)

public data class EncoderParameter(
    public var guid: Guid = Guid(),
    public var numberOfValues: UInt = 0u,
    public var type: UInt = 0u,
    public var value: COpaquePointer? = null,
)

public data class EncoderParameters(
    public var count: UInt = 0u,
    public var parameter: List<EncoderParameter> = List(1) { EncoderParameter() },
)

public data class GdiplusStartupInput(
    public var gdiplusVersion: UInt = 0u,
    public var debugEventCallback: Int = 0,
    public var suppressBackgroundThread: Bool = 0,
    public var suppressExternalCodecs: Bool = 0,
)

public data class GdiplusStartupInputEx(
    public var base: GdiplusStartupInput = GdiplusStartupInput(),
    public var startupParameters: Int = 0,
)

public data class GdiplusStartupOutput(
    public var notificationHook: Int = 0,
    public var notificationUnhook: Int = 0,
)

public data class GpAdjustableArrowCap(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
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
}

public data class GpBrush(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
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
}

public data class GpCustomLineCap(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
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
}

public data class GpFontCollection(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
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
}

public data class GpGraphics(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
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
}

public data class GpImage(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
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
}

public data class GpInstalledFontCollection(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
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
}

public data class GpMetafile(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
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
}

public data class GpPathGradient(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
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
}

public data class GpPen(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
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
}

public data class GpRegion(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
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
}

public data class GpStringFormat(
    public var value: UByte = 0u,
) {
    public var field0: UByte
        get() = value
        set(v) {
            value = v
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
}

public data class HueSaturationLightness(
    public var base: Effect = Effect(),
)

public data class HueSaturationLightnessParams(
    public var hueLevel: Int = 0,
    public var saturationLevel: Int = 0,
    public var lightnessLevel: Int = 0,
)

public data class ImageCodecInfo(
    public var clsid: Guid = Guid(),
    public var formatID: Guid = Guid(),
    public var codecName: Pcwstr = null,
    public var dllName: Pcwstr = null,
    public var formatDescription: Pcwstr = null,
    public var filenameExtension: Pcwstr = null,
    public var mimeType: Pcwstr = null,
    public var flags: UInt = 0u,
    public var version: UInt = 0u,
    public var sigCount: UInt = 0u,
    public var sigSize: UInt = 0u,
    public var sigPattern: COpaquePointer? = null,
    public var sigMask: COpaquePointer? = null,
)

public data class ImageItemData(
    public var size: UInt = 0u,
    public var position: UInt = 0u,
    public var desc: COpaquePointer? = null,
    public var descSize: UInt = 0u,
    public var data: COpaquePointer? = null,
    public var dataSize: UInt = 0u,
    public var cookie: UInt = 0u,
)

public data class Levels(
    public var base: Effect = Effect(),
)

public data class LevelsParams(
    public var highlight: Int = 0,
    public var midtone: Int = 0,
    public var shadow: Int = 0,
)

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
)

public data class Point(
    public var x: Int = 0,
    public var y: Int = 0,
)

public data class PointF(
    public var x: Float = 0.0f,
    public var y: Float = 0.0f,
)

public data class PropertyItem(
    public var id: UInt = 0u,
    public var length: UInt = 0u,
    public var type: UShort = 0u,
    public var value: COpaquePointer? = null,
)

public data class Rect(
    public var x: Int = 0,
    public var y: Int = 0,
    public var width: Int = 0,
    public var height: Int = 0,
)

public data class RectF(
    public var x: Float = 0.0f,
    public var y: Float = 0.0f,
    public var width: Float = 0.0f,
    public var height: Float = 0.0f,
)

public data class RedEyeCorrection(
    public var base: Effect = Effect(),
)

public data class RedEyeCorrectionParams(
    public var numberOfAreas: UInt = 0u,
    public var areas: io.github.kotlinmania.windowssys.windows.win32.foundation.Rect? = null,
)

public data class Sharpen(
    public var base: Effect = Effect(),
)

public data class SharpenParams(
    public var radius: Float = 0.0f,
    public var amount: Float = 0.0f,
)

public data class Size(
    public var width: Int = 0,
    public var height: Int = 0,
)

public data class SizeF(
    public var width: Float = 0.0f,
    public var height: Float = 0.0f,
)

public data class Tint(
    public var base: Effect = Effect(),
)

public data class TintParams(
    public var hue: Int = 0,
    public var amount: Int = 0,
)

public data class WmfPlaceableFileHeader(
    public var key: UInt = 0u,
    public var hmf: Short = 0,
    public var boundingBox: PWMFRect16 = PWMFRect16(),
    public var inch: Short = 0,
    public var reserved: UInt = 0u,
    public var checksum: Short = 0,
)
