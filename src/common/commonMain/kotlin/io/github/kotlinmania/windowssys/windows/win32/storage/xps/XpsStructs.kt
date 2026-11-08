package io.github.kotlinmania.windowssys.windows.win32.storage.xps

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINT

public data class DOCINFOA(
    public var cbSize: Int = 0,
    public var lpszDocName: PCSTR = 0L,
    public var lpszOutput: PCSTR = 0L,
    public var lpszDatatype: PCSTR = 0L,
    public var fwType: UInt = 0u,
)

public data class DOCINFOW(
    public var cbSize: Int = 0,
    public var lpszDocName: PCWSTR = 0L,
    public var lpszOutput: PCWSTR = 0L,
    public var lpszDatatype: PCWSTR = 0L,
    public var fwType: UInt = 0u,
)

public data class DRAWPATRECT(
    public var ptPosition: POINT = POINT(),
    public var ptSize: POINT = POINT(),
    public var wStyle: UShort = 0u,
    public var wPattern: UShort = 0u,
)

public data class PSFEATURE_CUSTPAPER(
    public var lOrientation: Int = 0,
    public var lWidth: Int = 0,
    public var lHeight: Int = 0,
    public var lWidthOffset: Int = 0,
    public var lHeightOffset: Int = 0,
)

public data class PSFEATURE_OUTPUT(public var bPageIndependent: BOOL = 0, public var bSetPageDevice: BOOL = 0)

public data class PSINJECTDATA(
    public var DataBytes: UInt = 0u,
    public var InjectionPoint: PSINJECT_POINT = 0u,
    public var PageNumber: UShort = 0u,
)

public data class XPS_COLOR(public var colorType: XPS_COLOR_TYPE = 0, public var value: XPS_COLOR_0 = XPS_COLOR_0())

public data class XPS_COLOR_0(
    public var sRGB: XPS_COLOR_0_0 = XPS_COLOR_0_0(),
    public var scRGB: XPS_COLOR_0_1 = XPS_COLOR_0_1(),
    public var context: XPS_COLOR_0_2 = XPS_COLOR_0_2(),
)

public data class XPS_COLOR_0_2(public var channelCount: UByte = 0u, public var channels: FloatArray = FloatArray(9)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is XPS_COLOR_0_2) return false
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

public data class XPS_COLOR_0_0(
    public var alpha: UByte = 0u,
    public var red: UByte = 0u,
    public var green: UByte = 0u,
    public var blue: UByte = 0u,
)

public data class XPS_COLOR_0_1(
    public var alpha: Float = 0.0f,
    public var red: Float = 0.0f,
    public var green: Float = 0.0f,
    public var blue: Float = 0.0f,
)

public data class XPS_DASH(public var length: Float = 0.0f, public var gap: Float = 0.0f)

public data class XPS_GLYPH_INDEX(
    public var index: Int = 0,
    public var advanceWidth: Float = 0.0f,
    public var horizontalOffset: Float = 0.0f,
    public var verticalOffset: Float = 0.0f,
)

public data class XPS_GLYPH_MAPPING(
    public var unicodeStringStart: UInt = 0u,
    public var unicodeStringLength: UShort = 0u,
    public var glyphIndicesStart: UInt = 0u,
    public var glyphIndicesLength: UShort = 0u,
)

public data class XPS_MATRIX(
    public var m11: Float = 0.0f,
    public var m12: Float = 0.0f,
    public var m21: Float = 0.0f,
    public var m22: Float = 0.0f,
    public var m31: Float = 0.0f,
    public var m32: Float = 0.0f,
)

public data class XPS_POINT(public var x: Float = 0.0f, public var y: Float = 0.0f)

public data class XPS_RECT(
    public var x: Float = 0.0f,
    public var y: Float = 0.0f,
    public var width: Float = 0.0f,
    public var height: Float = 0.0f,
)

public data class XPS_SIZE(public var width: Float = 0.0f, public var height: Float = 0.0f)
