@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.RECTL
import io.github.kotlinmania.windowssys.windows.win32.foundation.SIZE
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.METAHEADER

public data class BitmapData(
    public var Width: UInt = 0u,
    public var Height: UInt = 0u,
    public var Stride: Int = 0,
    public var PixelFormat: Int = 0,
    public var Scan0: Long = 0L,
    public var Reserved: ULong = 0uL,
)

public data class Blur(public var Base: Effect = Effect())

public data class BlurParams(public var radius: Float = 0.0f, public var expandEdge: BOOL = 0)

public data class BrightnessContrast(public var Base: Effect = Effect())

public data class BrightnessContrastParams(public var brightnessLevel: Int = 0, public var contrastLevel: Int = 0)

public data class CharacterRange(public var First: Int = 0, public var Length: Int = 0)

public data class Color(public var Argb: UInt = 0u) {
    public companion object {
        public val AliceBlue: Int = -984833

        public val AntiqueWhite: Int = -332841

        public val Aqua: Int = -16711681

        public val Aquamarine: Int = -8388652

        public val Azure: Int = -983041

        public val Beige: Int = -657956

        public val Bisque: Int = -6972

        public val Black: Int = -16777216

        public val BlanchedAlmond: Int = -5171

        public val Blue: Int = -16776961

        public val BlueViolet: Int = -7722014

        public val Brown: Int = -5952982

        public val BurlyWood: Int = -2180985

        public val CadetBlue: Int = -10510688

        public val Chartreuse: Int = -8388864

        public val Chocolate: Int = -2987746

        public val Coral: Int = -32944

        public val CornflowerBlue: Int = -10185235

        public val Cornsilk: Int = -1828

        public val Crimson: Int = -2354116

        public val Cyan: Int = -16711681

        public val DarkBlue: Int = -16777077

        public val DarkCyan: Int = -16741493

        public val DarkGoldenrod: Int = -4684277

        public val DarkGray: Int = -5658199

        public val DarkGreen: Int = -16751616

        public val DarkKhaki: Int = -4343957

        public val DarkMagenta: Int = -7667573

        public val DarkOliveGreen: Int = -11179217

        public val DarkOrange: Int = -29696

        public val DarkOrchid: Int = -6737204

        public val DarkRed: Int = -7667712

        public val DarkSalmon: Int = -1468806

        public val DarkSeaGreen: Int = -7357301

        public val DarkSlateBlue: Int = -12042869

        public val DarkSlateGray: Int = -13676721

        public val DarkTurquoise: Int = -16724271

        public val DarkViolet: Int = -7077677

        public val DeepPink: Int = -60269

        public val DeepSkyBlue: Int = -16728065

        public val DimGray: Int = -9868951

        public val DodgerBlue: Int = -14774017

        public val Firebrick: Int = -5103070

        public val FloralWhite: Int = -1296

        public val ForestGreen: Int = -14513374

        public val Fuchsia: Int = -65281

        public val Gainsboro: Int = -2302756

        public val GhostWhite: Int = -460545

        public val Gold: Int = -10496

        public val Goldenrod: Int = -2448096

        public val Gray: Int = -8355712

        public val Green: Int = -16744448

        public val GreenYellow: Int = -5374161

        public val Honeydew: Int = -983056

        public val HotPink: Int = -38476

        public val IndianRed: Int = -3318692

        public val Indigo: Int = -11861886

        public val Ivory: Int = -16

        public val Khaki: Int = -989556

        public val Lavender: Int = -1644806

        public val LavenderBlush: Int = -3851

        public val LawnGreen: Int = -8586240

        public val LemonChiffon: Int = -1331

        public val LightBlue: Int = -5383962

        public val LightCoral: Int = -1015680

        public val LightCyan: Int = -2031617

        public val LightGoldenrodYellow: Int = -329006

        public val LightGray: Int = -2894893

        public val LightGreen: Int = -7278960

        public val LightPink: Int = -18751

        public val LightSalmon: Int = -24454

        public val LightSeaGreen: Int = -14634326

        public val LightSkyBlue: Int = -7876870

        public val LightSlateGray: Int = -8943463

        public val LightSteelBlue: Int = -5192482

        public val LightYellow: Int = -32

        public val Lime: Int = -16711936

        public val LimeGreen: Int = -13447886

        public val Linen: Int = -331546

        public val Magenta: Int = -65281

        public val Maroon: Int = -8388608

        public val MediumAquamarine: Int = -10039894

        public val MediumBlue: Int = -16777011

        public val MediumOrchid: Int = -4565549

        public val MediumPurple: Int = -7114533

        public val MediumSeaGreen: Int = -12799119

        public val MediumSlateBlue: Int = -8689426

        public val MediumSpringGreen: Int = -16713062

        public val MediumTurquoise: Int = -12004916

        public val MediumVioletRed: Int = -3730043

        public val MidnightBlue: Int = -15132304

        public val MintCream: Int = -655366

        public val MistyRose: Int = -6943

        public val Moccasin: Int = -6987

        public val NavajoWhite: Int = -8531

        public val Navy: Int = -16777088

        public val OldLace: Int = -133658

        public val Olive: Int = -8355840

        public val OliveDrab: Int = -9728477

        public val Orange: Int = -23296

        public val OrangeRed: Int = -47872

        public val Orchid: Int = -2461482

        public val PaleGoldenrod: Int = -1120086

        public val PaleGreen: Int = -6751336

        public val PaleTurquoise: Int = -5247250

        public val PaleVioletRed: Int = -2396013

        public val PapayaWhip: Int = -4139

        public val PeachPuff: Int = -9543

        public val Peru: Int = -3308225

        public val Pink: Int = -16181

        public val Plum: Int = -2252579

        public val PowderBlue: Int = -5185306

        public val Purple: Int = -8388480

        public val Red: Int = -65536

        public val RosyBrown: Int = -4419697

        public val RoyalBlue: Int = -12490271

        public val SaddleBrown: Int = -7650029

        public val Salmon: Int = -360334

        public val SandyBrown: Int = -744352

        public val SeaGreen: Int = -13726889

        public val SeaShell: Int = -2578

        public val Sienna: Int = -6270419

        public val Silver: Int = -4144960

        public val SkyBlue: Int = -7876885

        public val SlateBlue: Int = -9807155

        public val SlateGray: Int = -9404272

        public val Snow: Int = -1286

        public val SpringGreen: Int = -16711809

        public val SteelBlue: Int = -12156236

        public val Tan: Int = -2968436

        public val Teal: Int = -16744320

        public val Thistle: Int = -2572328

        public val Tomato: Int = -40121

        public val Transparent: Int = 16777215

        public val Turquoise: Int = -12525360

        public val Violet: Int = -1146130

        public val Wheat: Int = -663885

        public val White: Int = -1

        public val WhiteSmoke: Int = -657931

        public val Yellow: Int = -256

        public val YellowGreen: Int = -6632142

        public val AlphaShift: Int = 24

        public val RedShift: Int = 16

        public val GreenShift: Int = 8

        public val BlueShift: Int = 0

        public val AlphaMask: Int = -16777216

        public val RedMask: Int = 16711680

        public val GreenMask: Int = 65280

        public val BlueMask: Int = 255
    }
}

public data class ColorBalance(public var Base: Effect = Effect())

public data class ColorBalanceParams(
    public var cyanRed: Int = 0,
    public var magentaGreen: Int = 0,
    public var yellowBlue: Int = 0,
)

public data class ColorCurve(public var Base: Effect = Effect())

public data class ColorCurveParams(
    public var adjustment: CurveAdjustments = 0,
    public var channel: CurveChannel = 0,
    public var adjustValue: Int = 0,
)

public data class ColorLUT(public var Base: Effect = Effect())

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

public data class ColorMap(public var oldColor: Color = Color(), public var newColor: Color = Color())

public data class ColorMatrix(public var m: FloatArray = FloatArray(25)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ColorMatrix) return false
        if (!this.m.contentEquals(other.m)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.m.contentHashCode()
    }
}

public data class ColorMatrixEffect(public var Base: Effect = Effect())

public data class ColorPalette(
    public var Flags: UInt = 0u,
    public var Count: UInt = 0u,
    public var Entries: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ColorPalette) return false
        if (this.Flags != other.Flags) return false
        if (this.Count != other.Count) return false
        if (!this.Entries.contentEquals(other.Entries)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Flags.hashCode()
        result = 31 * result + this.Count.hashCode()
        result = 31 * result + this.Entries.contentHashCode()
        return result
    }
}

public data class ENHMETAHEADER3(
    public var iType: UInt = 0u,
    public var nSize: UInt = 0u,
    public var rclBounds: RECTL = RECTL(),
    public var rclFrame: RECTL = RECTL(),
    public var dSignature: UInt = 0u,
    public var nVersion: UInt = 0u,
    public var nBytes: UInt = 0u,
    public var nRecords: UInt = 0u,
    public var nHandles: UShort = 0u,
    public var sReserved: UShort = 0u,
    public var nDescription: UInt = 0u,
    public var offDescription: UInt = 0u,
    public var nPalEntries: UInt = 0u,
    public var szlDevice: SIZE = SIZE(),
    public var szlMillimeters: SIZE = SIZE(),
)

public data class Effect(
    public var lpVtbl: Long = 0L,
    public var nativeEffect: Long = 0L,
    public var auxDataSize: Int = 0,
    public var auxData: Long = 0L,
    public var useAuxData: BOOL = 0,
)

public data class EncoderParameter(
    public var Guid: GUID = GUID(),
    public var NumberOfValues: UInt = 0u,
    public var Type: UInt = 0u,
    public var Value: Long = 0L,
)

public data class EncoderParameters(public var Count: UInt = 0u, public var Parameter: List<EncoderParameter> = List(1) { EncoderParameter() })

public data class GdiplusStartupInput(
    public var GdiplusVersion: UInt = 0u,
    public var DebugEventCallback: Long = 0L,
    public var SuppressBackgroundThread: BOOL = 0,
    public var SuppressExternalCodecs: BOOL = 0,
)

public data class GdiplusStartupInputEx(public var Base: GdiplusStartupInput = GdiplusStartupInput(), public var StartupParameters: Int = 0)

public data class GdiplusStartupOutput(public var NotificationHook: Long = 0L, public var NotificationUnhook: Long = 0L)

public data class GpAdjustableArrowCap(public var value: UByte = 0u) {
    public var field0: UByte
        get() = value
        set(v) { value = v }
}

public data class GpBitmap(public var value: UByte = 0u) {
    public var field0: UByte
        get() = value
        set(v) { value = v }
}

public data class GpBrush(public var value: UByte = 0u) {
    public var field0: UByte
        get() = value
        set(v) { value = v }
}

public data class GpCachedBitmap(public var value: UByte = 0u) {
    public var field0: UByte
        get() = value
        set(v) { value = v }
}

public data class GpCustomLineCap(public var value: UByte = 0u) {
    public var field0: UByte
        get() = value
        set(v) { value = v }
}

public data class GpFont(public var value: UByte = 0u) {
    public var field0: UByte
        get() = value
        set(v) { value = v }
}

public data class GpFontCollection(public var value: UByte = 0u) {
    public var field0: UByte
        get() = value
        set(v) { value = v }
}

public data class GpFontFamily(public var value: UByte = 0u) {
    public var field0: UByte
        get() = value
        set(v) { value = v }
}

public data class GpGraphics(public var value: UByte = 0u) {
    public var field0: UByte
        get() = value
        set(v) { value = v }
}

public data class GpHatch(public var value: UByte = 0u) {
    public var field0: UByte
        get() = value
        set(v) { value = v }
}

public data class GpImage(public var value: UByte = 0u) {
    public var field0: UByte
        get() = value
        set(v) { value = v }
}

public data class GpImageAttributes(public var value: UByte = 0u) {
    public var field0: UByte
        get() = value
        set(v) { value = v }
}

public data class GpInstalledFontCollection(public var value: UByte = 0u) {
    public var field0: UByte
        get() = value
        set(v) { value = v }
}

public data class GpLineGradient(public var value: UByte = 0u) {
    public var field0: UByte
        get() = value
        set(v) { value = v }
}

public data class GpMetafile(public var value: UByte = 0u) {
    public var field0: UByte
        get() = value
        set(v) { value = v }
}

public data class GpPath(public var value: UByte = 0u) {
    public var field0: UByte
        get() = value
        set(v) { value = v }
}

public data class GpPathGradient(public var value: UByte = 0u) {
    public var field0: UByte
        get() = value
        set(v) { value = v }
}

public data class GpPathIterator(public var value: UByte = 0u) {
    public var field0: UByte
        get() = value
        set(v) { value = v }
}

public data class GpPen(public var value: UByte = 0u) {
    public var field0: UByte
        get() = value
        set(v) { value = v }
}

public data class GpPrivateFontCollection(public var value: UByte = 0u) {
    public var field0: UByte
        get() = value
        set(v) { value = v }
}

public data class GpRegion(public var value: UByte = 0u) {
    public var field0: UByte
        get() = value
        set(v) { value = v }
}

public data class GpSolidFill(public var value: UByte = 0u) {
    public var field0: UByte
        get() = value
        set(v) { value = v }
}

public data class GpStringFormat(public var value: UByte = 0u) {
    public var field0: UByte
        get() = value
        set(v) { value = v }
}

public data class GpTexture(public var value: UByte = 0u) {
    public var field0: UByte
        get() = value
        set(v) { value = v }
}

public data class HueSaturationLightness(public var Base: Effect = Effect())

public data class HueSaturationLightnessParams(
    public var hueLevel: Int = 0,
    public var saturationLevel: Int = 0,
    public var lightnessLevel: Int = 0,
)

public data class ImageCodecInfo(
    public var Clsid: GUID = GUID(),
    public var FormatID: GUID = GUID(),
    public var CodecName: PCWSTR = 0L,
    public var DllName: PCWSTR = 0L,
    public var FormatDescription: PCWSTR = 0L,
    public var FilenameExtension: PCWSTR = 0L,
    public var MimeType: PCWSTR = 0L,
    public var Flags: UInt = 0u,
    public var Version: UInt = 0u,
    public var SigCount: UInt = 0u,
    public var SigSize: UInt = 0u,
    public var SigPattern: Long = 0L,
    public var SigMask: Long = 0L,
)

public data class ImageItemData(
    public var Size: UInt = 0u,
    public var Position: UInt = 0u,
    public var Desc: Long = 0L,
    public var DescSize: UInt = 0u,
    public var Data: Long = 0L,
    public var DataSize: UInt = 0u,
    public var Cookie: UInt = 0u,
)

public data class Levels(public var Base: Effect = Effect())

public data class LevelsParams(
    public var highlight: Int = 0,
    public var midtone: Int = 0,
    public var shadow: Int = 0,
)

public data class MetafileHeader(
    public var Type: MetafileType = 0,
    public var Size: UInt = 0u,
    public var Version: UInt = 0u,
    public var EmfPlusFlags: UInt = 0u,
    public var DpiX: Float = 0.0f,
    public var DpiY: Float = 0.0f,
    public var X: Int = 0,
    public var Y: Int = 0,
    public var Width: Int = 0,
    public var Height: Int = 0,
    public var Anonymous: MetafileHeader_0 = MetafileHeader_0(),
    public var EmfPlusHeaderSize: Int = 0,
    public var LogicalDpiX: Int = 0,
    public var LogicalDpiY: Int = 0,
)

public data class MetafileHeader_0(public var WmfHeader: METAHEADER = METAHEADER(), public var EmfHeader: ENHMETAHEADER3 = ENHMETAHEADER3())

public data class PWMFRect16(
    public var Left: Short = 0,
    public var Top: Short = 0,
    public var Right: Short = 0,
    public var Bottom: Short = 0,
)

public data class Point(public var X: Int = 0, public var Y: Int = 0)

public data class PointF(public var X: Float = 0.0f, public var Y: Float = 0.0f)

public data class PropertyItem(
    public var id: UInt = 0u,
    public var length: UInt = 0u,
    public var type: UShort = 0u,
    public var value: Long = 0L,
)

public data class Rect(
    public var X: Int = 0,
    public var Y: Int = 0,
    public var Width: Int = 0,
    public var Height: Int = 0,
)

public data class RectF(
    public var X: Float = 0.0f,
    public var Y: Float = 0.0f,
    public var Width: Float = 0.0f,
    public var Height: Float = 0.0f,
)

public data class RedEyeCorrection(public var Base: Effect = Effect())

public data class RedEyeCorrectionParams(public var numberOfAreas: UInt = 0u, public var areas: Long = 0L)

public data class Sharpen(public var Base: Effect = Effect())

public data class SharpenParams(public var radius: Float = 0.0f, public var amount: Float = 0.0f)

public data class Size(public var Width: Int = 0, public var Height: Int = 0)

public data class SizeF(public var Width: Float = 0.0f, public var Height: Float = 0.0f)

public data class Tint(public var Base: Effect = Effect())

public data class TintParams(public var hue: Int = 0, public var amount: Int = 0)

public data class WmfPlaceableFileHeader(
    public var Key: UInt = 0u,
    public var Hmf: Short = 0,
    public var BoundingBox: PWMFRect16 = PWMFRect16(),
    public var Inch: Short = 0,
    public var Reserved: UInt = 0u,
    public var Checksum: Short = 0,
)
