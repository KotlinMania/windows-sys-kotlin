package io.github.kotlinmania.windowssys.windows.win32.storage.xps

import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point

public data class Docinfoa(
    public var cbSize: Int = 0,
    public var lpszDocName: Pcstr = null,
    public var lpszOutput: Pcstr = null,
    public var lpszDatatype: Pcstr = null,
    public var fwType: UInt = 0u,
)

public data class Docinfow(
    public var cbSize: Int = 0,
    public var lpszDocName: Pcwstr = null,
    public var lpszOutput: Pcwstr = null,
    public var lpszDatatype: Pcwstr = null,
    public var fwType: UInt = 0u,
)

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
)

public data class PsfeatureOutput(public var bPageIndependent: Bool = 0, public var bSetPageDevice: Bool = 0)

public data class Psinjectdata(
    public var dataBytes: UInt = 0u,
    public var injectionPoint: PsinjectPoint = 0u,
    public var pageNumber: UShort = 0u,
)

public data class XpsColor(public var colorType: XpsColorType = 0, public var value: XpsColor0 = XpsColor0())

public data class XpsColor0(
    public var sRGB: XpsColor00 = XpsColor00(),
    public var scRGB: XpsColor01 = XpsColor01(),
    public var context: XpsColor02 = XpsColor02(),
)

public data class XpsColor02(public var channelCount: UByte = 0u, public var channels: FloatArray = FloatArray(9)) {
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
}

public data class XpsColor00(
    public var alpha: UByte = 0u,
    public var red: UByte = 0u,
    public var green: UByte = 0u,
    public var blue: UByte = 0u,
)

public data class XpsColor01(
    public var alpha: Float = 0.0f,
    public var red: Float = 0.0f,
    public var green: Float = 0.0f,
    public var blue: Float = 0.0f,
)

public data class XpsDash(public var length: Float = 0.0f, public var gap: Float = 0.0f)

public data class XpsGlyphIndex(
    public var index: Int = 0,
    public var advanceWidth: Float = 0.0f,
    public var horizontalOffset: Float = 0.0f,
    public var verticalOffset: Float = 0.0f,
)

public data class XpsGlyphMapping(
    public var unicodeStringStart: UInt = 0u,
    public var unicodeStringLength: UShort = 0u,
    public var glyphIndicesStart: UInt = 0u,
    public var glyphIndicesLength: UShort = 0u,
)

public data class XpsMatrix(
    public var m11: Float = 0.0f,
    public var m12: Float = 0.0f,
    public var m21: Float = 0.0f,
    public var m22: Float = 0.0f,
    public var m31: Float = 0.0f,
    public var m32: Float = 0.0f,
)

public data class XpsPoint(public var x: Float = 0.0f, public var y: Float = 0.0f)

public data class XpsRect(
    public var x: Float = 0.0f,
    public var y: Float = 0.0f,
    public var width: Float = 0.0f,
    public var height: Float = 0.0f,
)

public data class XpsSize(public var width: Float = 0.0f, public var height: Float = 0.0f)
