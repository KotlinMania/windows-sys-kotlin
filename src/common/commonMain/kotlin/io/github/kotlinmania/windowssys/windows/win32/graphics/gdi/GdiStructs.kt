@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.graphics.gdi

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.COLORREF
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINT
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINTL
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINTS
import io.github.kotlinmania.windowssys.windows.win32.foundation.RECT
import io.github.kotlinmania.windowssys.windows.win32.foundation.RECTL
import io.github.kotlinmania.windowssys.windows.win32.foundation.SIZE

public data class ABC(
    public var abcA: Int = 0,
    public var abcB: UInt = 0u,
    public var abcC: Int = 0,
)

public data class ABCFLOAT(
    public var abcfA: Float = 0.0f,
    public var abcfB: Float = 0.0f,
    public var abcfC: Float = 0.0f,
)

public data class ABORTPATH(public var emr: EMR = EMR())

public data class AXESLISTA(
    public var axlReserved: UInt = 0u,
    public var axlNumAxes: UInt = 0u,
    public var axlAxisInfo: List<AXISINFOA> = List(16) { AXISINFOA() },
)

public data class AXESLISTW(
    public var axlReserved: UInt = 0u,
    public var axlNumAxes: UInt = 0u,
    public var axlAxisInfo: List<AXISINFOW> = List(16) { AXISINFOW() },
)

public data class AXISINFOA(
    public var axMinValue: Int = 0,
    public var axMaxValue: Int = 0,
    public var axAxisName: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AXISINFOA) return false
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
}

public data class AXISINFOW(
    public var axMinValue: Int = 0,
    public var axMaxValue: Int = 0,
    public var axAxisName: UShortArray = UShortArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AXISINFOW) return false
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
}

public data class BITMAP(
    public var bmType: Int = 0,
    public var bmWidth: Int = 0,
    public var bmHeight: Int = 0,
    public var bmWidthBytes: Int = 0,
    public var bmPlanes: UShort = 0u,
    public var bmBitsPixel: UShort = 0u,
    public var bmBits: Long = 0L,
)

public data class BITMAPCOREHEADER(
    public var bcSize: UInt = 0u,
    public var bcWidth: UShort = 0u,
    public var bcHeight: UShort = 0u,
    public var bcPlanes: UShort = 0u,
    public var bcBitCount: UShort = 0u,
)

public data class BITMAPCOREINFO(public var bmciHeader: BITMAPCOREHEADER = BITMAPCOREHEADER(), public var bmciColors: List<RGBTRIPLE> = List(1) { RGBTRIPLE() })

public data class BITMAPFILEHEADER(
    public var bfType: UShort = 0u,
    public var bfSize: UInt = 0u,
    public var bfReserved1: UShort = 0u,
    public var bfReserved2: UShort = 0u,
    public var bfOffBits: UInt = 0u,
)

public data class BITMAPINFO(public var bmiHeader: BITMAPINFOHEADER = BITMAPINFOHEADER(), public var bmiColors: List<RGBQUAD> = List(1) { RGBQUAD() })

public data class BITMAPINFOHEADER(
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
)

public class BITMAPV4HEADER(
    public var bV4Size: UInt = 0u,
    public var bV4Width: Int = 0,
    public var bV4Height: Int = 0,
    public var bV4Planes: UShort = 0u,
    public var bV4BitCount: UShort = 0u,
    public var bV4V4Compression: BI_COMPRESSION = 0u,
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
    public var bV4Endpoints: CIEXYZTRIPLE = CIEXYZTRIPLE(),
    public var bV4GammaRed: UInt = 0u,
    public var bV4GammaGreen: UInt = 0u,
    public var bV4GammaBlue: UInt = 0u,
)

public class BITMAPV5HEADER(
    public var bV5Size: UInt = 0u,
    public var bV5Width: Int = 0,
    public var bV5Height: Int = 0,
    public var bV5Planes: UShort = 0u,
    public var bV5BitCount: UShort = 0u,
    public var bV5Compression: BI_COMPRESSION = 0u,
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
    public var bV5Endpoints: CIEXYZTRIPLE = CIEXYZTRIPLE(),
    public var bV5GammaRed: UInt = 0u,
    public var bV5GammaGreen: UInt = 0u,
    public var bV5GammaBlue: UInt = 0u,
    public var bV5Intent: UInt = 0u,
    public var bV5ProfileData: UInt = 0u,
    public var bV5ProfileSize: UInt = 0u,
    public var bV5Reserved: UInt = 0u,
)

public data class BLENDFUNCTION(
    public var BlendOp: UByte = 0u,
    public var BlendFlags: UByte = 0u,
    public var SourceConstantAlpha: UByte = 0u,
    public var AlphaFormat: UByte = 0u,
)

public data class CIEXYZ(
    public var ciexyzX: Int = 0,
    public var ciexyzY: Int = 0,
    public var ciexyzZ: Int = 0,
)

public data class CIEXYZTRIPLE(
    public var ciexyzRed: CIEXYZ = CIEXYZ(),
    public var ciexyzGreen: CIEXYZ = CIEXYZ(),
    public var ciexyzBlue: CIEXYZ = CIEXYZ(),
)

public data class COLORADJUSTMENT(
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
)

public data class DESIGNVECTOR(
    public var dvReserved: UInt = 0u,
    public var dvNumAxes: UInt = 0u,
    public var dvValues: IntArray = IntArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DESIGNVECTOR) return false
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
}

public class DEVMODEA(
    public var dmDeviceName: UByteArray = UByteArray(32),
    public var dmSpecVersion: UShort = 0u,
    public var dmDriverVersion: UShort = 0u,
    public var dmSize: UShort = 0u,
    public var dmDriverExtra: UShort = 0u,
    public var dmFields: DEVMODE_FIELD_FLAGS = 0u,
    public var Anonymous1: DEVMODEA_0 = DEVMODEA_0(),
    public var dmColor: DEVMODE_COLOR = 0,
    public var dmDuplex: DEVMODE_DUPLEX = 0,
    public var dmYResolution: Short = 0,
    public var dmTTOption: DEVMODE_TRUETYPE_OPTION = 0,
    public var dmCollate: DEVMODE_COLLATE = 0,
    public var dmFormName: UByteArray = UByteArray(32),
    public var dmLogPixels: UShort = 0u,
    public var dmBitsPerPel: UInt = 0u,
    public var dmPelsWidth: UInt = 0u,
    public var dmPelsHeight: UInt = 0u,
    public var Anonymous2: DEVMODEA_1 = DEVMODEA_1(),
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

public data class DEVMODEA_0(public var Anonymous1: DEVMODEA_0_0 = DEVMODEA_0_0(), public var Anonymous2: DEVMODEA_0_1 = DEVMODEA_0_1())

public data class DEVMODEA_0_0(
    public var dmOrientation: Short = 0,
    public var dmPaperSize: Short = 0,
    public var dmPaperLength: Short = 0,
    public var dmPaperWidth: Short = 0,
    public var dmScale: Short = 0,
    public var dmCopies: Short = 0,
    public var dmDefaultSource: Short = 0,
    public var dmPrintQuality: Short = 0,
)

public data class DEVMODEA_0_1(
    public var dmPosition: POINTL = POINTL(),
    public var dmDisplayOrientation: DEVMODE_DISPLAY_ORIENTATION = 0u,
    public var dmDisplayFixedOutput: DEVMODE_DISPLAY_FIXED_OUTPUT = 0u,
)

public data class DEVMODEA_1(public var dmDisplayFlags: UInt = 0u, public var dmNup: UInt = 0u)

public class DEVMODEW(
    public var dmDeviceName: UShortArray = UShortArray(32),
    public var dmSpecVersion: UShort = 0u,
    public var dmDriverVersion: UShort = 0u,
    public var dmSize: UShort = 0u,
    public var dmDriverExtra: UShort = 0u,
    public var dmFields: DEVMODE_FIELD_FLAGS = 0u,
    public var Anonymous1: DEVMODEW_0 = DEVMODEW_0(),
    public var dmColor: DEVMODE_COLOR = 0,
    public var dmDuplex: DEVMODE_DUPLEX = 0,
    public var dmYResolution: Short = 0,
    public var dmTTOption: DEVMODE_TRUETYPE_OPTION = 0,
    public var dmCollate: DEVMODE_COLLATE = 0,
    public var dmFormName: UShortArray = UShortArray(32),
    public var dmLogPixels: UShort = 0u,
    public var dmBitsPerPel: UInt = 0u,
    public var dmPelsWidth: UInt = 0u,
    public var dmPelsHeight: UInt = 0u,
    public var Anonymous2: DEVMODEW_1 = DEVMODEW_1(),
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

public data class DEVMODEW_0(public var Anonymous1: DEVMODEW_0_0 = DEVMODEW_0_0(), public var Anonymous2: DEVMODEW_0_1 = DEVMODEW_0_1())

public data class DEVMODEW_0_0(
    public var dmOrientation: Short = 0,
    public var dmPaperSize: Short = 0,
    public var dmPaperLength: Short = 0,
    public var dmPaperWidth: Short = 0,
    public var dmScale: Short = 0,
    public var dmCopies: Short = 0,
    public var dmDefaultSource: Short = 0,
    public var dmPrintQuality: Short = 0,
)

public data class DEVMODEW_0_1(
    public var dmPosition: POINTL = POINTL(),
    public var dmDisplayOrientation: DEVMODE_DISPLAY_ORIENTATION = 0u,
    public var dmDisplayFixedOutput: DEVMODE_DISPLAY_FIXED_OUTPUT = 0u,
)

public data class DEVMODEW_1(public var dmDisplayFlags: UInt = 0u, public var dmNup: UInt = 0u)

public data class DIBSECTION(
    public var dsBm: BITMAP = BITMAP(),
    public var dsBmih: BITMAPINFOHEADER = BITMAPINFOHEADER(),
    public var dsBitfields: UIntArray = UIntArray(3),
    public var dshSection: HANDLE = 0L,
    public var dsOffset: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DIBSECTION) return false
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
}

public data class DISPLAY_DEVICEA(
    public var cb: UInt = 0u,
    public var DeviceName: ByteArray = ByteArray(32),
    public var DeviceString: ByteArray = ByteArray(128),
    public var StateFlags: DISPLAY_DEVICE_STATE_FLAGS = 0u,
    public var DeviceID: ByteArray = ByteArray(128),
    public var DeviceKey: ByteArray = ByteArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DISPLAY_DEVICEA) return false
        if (this.cb != other.cb) return false
        if (!this.DeviceName.contentEquals(other.DeviceName)) return false
        if (!this.DeviceString.contentEquals(other.DeviceString)) return false
        if (this.StateFlags != other.StateFlags) return false
        if (!this.DeviceID.contentEquals(other.DeviceID)) return false
        if (!this.DeviceKey.contentEquals(other.DeviceKey)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cb.hashCode()
        result = 31 * result + this.DeviceName.contentHashCode()
        result = 31 * result + this.DeviceString.contentHashCode()
        result = 31 * result + this.StateFlags.hashCode()
        result = 31 * result + this.DeviceID.contentHashCode()
        result = 31 * result + this.DeviceKey.contentHashCode()
        return result
    }
}

public data class DISPLAY_DEVICEW(
    public var cb: UInt = 0u,
    public var DeviceName: UShortArray = UShortArray(32),
    public var DeviceString: UShortArray = UShortArray(128),
    public var StateFlags: DISPLAY_DEVICE_STATE_FLAGS = 0u,
    public var DeviceID: UShortArray = UShortArray(128),
    public var DeviceKey: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DISPLAY_DEVICEW) return false
        if (this.cb != other.cb) return false
        if (!this.DeviceName.contentEquals(other.DeviceName)) return false
        if (!this.DeviceString.contentEquals(other.DeviceString)) return false
        if (this.StateFlags != other.StateFlags) return false
        if (!this.DeviceID.contentEquals(other.DeviceID)) return false
        if (!this.DeviceKey.contentEquals(other.DeviceKey)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cb.hashCode()
        result = 31 * result + this.DeviceName.contentHashCode()
        result = 31 * result + this.DeviceString.contentHashCode()
        result = 31 * result + this.StateFlags.hashCode()
        result = 31 * result + this.DeviceID.contentHashCode()
        result = 31 * result + this.DeviceKey.contentHashCode()
        return result
    }
}

public data class DRAWTEXTPARAMS(
    public var cbSize: UInt = 0u,
    public var iTabLength: Int = 0,
    public var iLeftMargin: Int = 0,
    public var iRightMargin: Int = 0,
    public var uiLengthDrawn: UInt = 0u,
)

public data class EMR(public var iType: ENHANCED_METAFILE_RECORD_TYPE = 0u, public var nSize: UInt = 0u)

public class EMRALPHABLEND(
    public var emr: EMR = EMR(),
    public var rclBounds: RECTL = RECTL(),
    public var xDest: Int = 0,
    public var yDest: Int = 0,
    public var cxDest: Int = 0,
    public var cyDest: Int = 0,
    public var dwRop: UInt = 0u,
    public var xSrc: Int = 0,
    public var ySrc: Int = 0,
    public var xformSrc: XFORM = XFORM(),
    public var crBkColorSrc: COLORREF = 0u,
    public var iUsageSrc: UInt = 0u,
    public var offBmiSrc: UInt = 0u,
    public var cbBmiSrc: UInt = 0u,
    public var offBitsSrc: UInt = 0u,
    public var cbBitsSrc: UInt = 0u,
    public var cxSrc: Int = 0,
    public var cySrc: Int = 0,
)

public data class EMRANGLEARC(
    public var emr: EMR = EMR(),
    public var ptlCenter: POINTL = POINTL(),
    public var nRadius: UInt = 0u,
    public var eStartAngle: Float = 0.0f,
    public var eSweepAngle: Float = 0.0f,
)

public data class EMRARC(
    public var emr: EMR = EMR(),
    public var rclBox: RECTL = RECTL(),
    public var ptlStart: POINTL = POINTL(),
    public var ptlEnd: POINTL = POINTL(),
)

public data class EMRBITBLT(
    public var emr: EMR = EMR(),
    public var rclBounds: RECTL = RECTL(),
    public var xDest: Int = 0,
    public var yDest: Int = 0,
    public var cxDest: Int = 0,
    public var cyDest: Int = 0,
    public var dwRop: UInt = 0u,
    public var xSrc: Int = 0,
    public var ySrc: Int = 0,
    public var xformSrc: XFORM = XFORM(),
    public var crBkColorSrc: COLORREF = 0u,
    public var iUsageSrc: UInt = 0u,
    public var offBmiSrc: UInt = 0u,
    public var cbBmiSrc: UInt = 0u,
    public var offBitsSrc: UInt = 0u,
    public var cbBitsSrc: UInt = 0u,
)

public data class EMRCOLORCORRECTPALETTE(
    public var emr: EMR = EMR(),
    public var ihPalette: UInt = 0u,
    public var nFirstEntry: UInt = 0u,
    public var nPalEntries: UInt = 0u,
    public var nReserved: UInt = 0u,
)

public data class EMRCOLORMATCHTOTARGET(
    public var emr: EMR = EMR(),
    public var dwAction: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var cbName: UInt = 0u,
    public var cbData: UInt = 0u,
    public var Data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EMRCOLORMATCHTOTARGET) return false
        if (this.emr != other.emr) return false
        if (this.dwAction != other.dwAction) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.cbName != other.cbName) return false
        if (this.cbData != other.cbData) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.emr.hashCode()
        result = 31 * result + this.dwAction.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.cbName.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class EMRCREATEBRUSHINDIRECT(
    public var emr: EMR = EMR(),
    public var ihBrush: UInt = 0u,
    public var lb: LOGBRUSH32 = LOGBRUSH32(),
)

public data class EMRCREATEDIBPATTERNBRUSHPT(
    public var emr: EMR = EMR(),
    public var ihBrush: UInt = 0u,
    public var iUsage: UInt = 0u,
    public var offBmi: UInt = 0u,
    public var cbBmi: UInt = 0u,
    public var offBits: UInt = 0u,
    public var cbBits: UInt = 0u,
)

public data class EMRCREATEMONOBRUSH(
    public var emr: EMR = EMR(),
    public var ihBrush: UInt = 0u,
    public var iUsage: UInt = 0u,
    public var offBmi: UInt = 0u,
    public var cbBmi: UInt = 0u,
    public var offBits: UInt = 0u,
    public var cbBits: UInt = 0u,
)

public data class EMRCREATEPALETTE(
    public var emr: EMR = EMR(),
    public var ihPal: UInt = 0u,
    public var lgpl: LOGPALETTE = LOGPALETTE(),
)

public data class EMRCREATEPEN(
    public var emr: EMR = EMR(),
    public var ihPen: UInt = 0u,
    public var lopn: LOGPEN = LOGPEN(),
)

public data class EMRELLIPSE(public var emr: EMR = EMR(), public var rclBox: RECTL = RECTL())

public data class EMREOF(
    public var emr: EMR = EMR(),
    public var nPalEntries: UInt = 0u,
    public var offPalEntries: UInt = 0u,
    public var nSizeLast: UInt = 0u,
)

public data class EMREXCLUDECLIPRECT(public var emr: EMR = EMR(), public var rclClip: RECTL = RECTL())

public data class EMREXTCREATEFONTINDIRECTW(
    public var emr: EMR = EMR(),
    public var ihFont: UInt = 0u,
    public var elfw: EXTLOGFONTW = EXTLOGFONTW(),
)

public data class EMREXTCREATEPEN(
    public var emr: EMR = EMR(),
    public var ihPen: UInt = 0u,
    public var offBmi: UInt = 0u,
    public var cbBmi: UInt = 0u,
    public var offBits: UInt = 0u,
    public var cbBits: UInt = 0u,
    public var elp: EXTLOGPEN32 = EXTLOGPEN32(),
)

public data class EMREXTESCAPE(
    public var emr: EMR = EMR(),
    public var iEscape: Int = 0,
    public var cbEscData: Int = 0,
    public var EscData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EMREXTESCAPE) return false
        if (this.emr != other.emr) return false
        if (this.iEscape != other.iEscape) return false
        if (this.cbEscData != other.cbEscData) return false
        if (!this.EscData.contentEquals(other.EscData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.emr.hashCode()
        result = 31 * result + this.iEscape.hashCode()
        result = 31 * result + this.cbEscData.hashCode()
        result = 31 * result + this.EscData.contentHashCode()
        return result
    }
}

public data class EMREXTFLOODFILL(
    public var emr: EMR = EMR(),
    public var ptlStart: POINTL = POINTL(),
    public var crColor: COLORREF = 0u,
    public var iMode: UInt = 0u,
)

public data class EMREXTSELECTCLIPRGN(
    public var emr: EMR = EMR(),
    public var cbRgnData: UInt = 0u,
    public var iMode: UInt = 0u,
    public var RgnData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EMREXTSELECTCLIPRGN) return false
        if (this.emr != other.emr) return false
        if (this.cbRgnData != other.cbRgnData) return false
        if (this.iMode != other.iMode) return false
        if (!this.RgnData.contentEquals(other.RgnData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.emr.hashCode()
        result = 31 * result + this.cbRgnData.hashCode()
        result = 31 * result + this.iMode.hashCode()
        result = 31 * result + this.RgnData.contentHashCode()
        return result
    }
}

public data class EMREXTTEXTOUTA(
    public var emr: EMR = EMR(),
    public var rclBounds: RECTL = RECTL(),
    public var iGraphicsMode: UInt = 0u,
    public var exScale: Float = 0.0f,
    public var eyScale: Float = 0.0f,
    public var emrtext: EMRTEXT = EMRTEXT(),
)

public data class EMRFILLPATH(public var emr: EMR = EMR(), public var rclBounds: RECTL = RECTL())

public data class EMRFILLRGN(
    public var emr: EMR = EMR(),
    public var rclBounds: RECTL = RECTL(),
    public var cbRgnData: UInt = 0u,
    public var ihBrush: UInt = 0u,
    public var RgnData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EMRFILLRGN) return false
        if (this.emr != other.emr) return false
        if (this.rclBounds != other.rclBounds) return false
        if (this.cbRgnData != other.cbRgnData) return false
        if (this.ihBrush != other.ihBrush) return false
        if (!this.RgnData.contentEquals(other.RgnData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.emr.hashCode()
        result = 31 * result + this.rclBounds.hashCode()
        result = 31 * result + this.cbRgnData.hashCode()
        result = 31 * result + this.ihBrush.hashCode()
        result = 31 * result + this.RgnData.contentHashCode()
        return result
    }
}

public data class EMRFORMAT(
    public var dSignature: UInt = 0u,
    public var nVersion: UInt = 0u,
    public var cbData: UInt = 0u,
    public var offData: UInt = 0u,
)

public data class EMRFRAMERGN(
    public var emr: EMR = EMR(),
    public var rclBounds: RECTL = RECTL(),
    public var cbRgnData: UInt = 0u,
    public var ihBrush: UInt = 0u,
    public var szlStroke: SIZE = SIZE(),
    public var RgnData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EMRFRAMERGN) return false
        if (this.emr != other.emr) return false
        if (this.rclBounds != other.rclBounds) return false
        if (this.cbRgnData != other.cbRgnData) return false
        if (this.ihBrush != other.ihBrush) return false
        if (this.szlStroke != other.szlStroke) return false
        if (!this.RgnData.contentEquals(other.RgnData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.emr.hashCode()
        result = 31 * result + this.rclBounds.hashCode()
        result = 31 * result + this.cbRgnData.hashCode()
        result = 31 * result + this.ihBrush.hashCode()
        result = 31 * result + this.szlStroke.hashCode()
        result = 31 * result + this.RgnData.contentHashCode()
        return result
    }
}

public data class EMRGDICOMMENT(
    public var emr: EMR = EMR(),
    public var cbData: UInt = 0u,
    public var Data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EMRGDICOMMENT) return false
        if (this.emr != other.emr) return false
        if (this.cbData != other.cbData) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.emr.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class EMRGLSBOUNDEDRECORD(
    public var emr: EMR = EMR(),
    public var rclBounds: RECTL = RECTL(),
    public var cbData: UInt = 0u,
    public var Data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EMRGLSBOUNDEDRECORD) return false
        if (this.emr != other.emr) return false
        if (this.rclBounds != other.rclBounds) return false
        if (this.cbData != other.cbData) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.emr.hashCode()
        result = 31 * result + this.rclBounds.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class EMRGLSRECORD(
    public var emr: EMR = EMR(),
    public var cbData: UInt = 0u,
    public var Data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EMRGLSRECORD) return false
        if (this.emr != other.emr) return false
        if (this.cbData != other.cbData) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.emr.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class EMRGRADIENTFILL(
    public var emr: EMR = EMR(),
    public var rclBounds: RECTL = RECTL(),
    public var nVer: UInt = 0u,
    public var nTri: UInt = 0u,
    public var ulMode: GRADIENT_FILL = 0u,
    public var Ver: List<TRIVERTEX> = List(1) { TRIVERTEX() },
)

public data class EMRINVERTRGN(
    public var emr: EMR = EMR(),
    public var rclBounds: RECTL = RECTL(),
    public var cbRgnData: UInt = 0u,
    public var RgnData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EMRINVERTRGN) return false
        if (this.emr != other.emr) return false
        if (this.rclBounds != other.rclBounds) return false
        if (this.cbRgnData != other.cbRgnData) return false
        if (!this.RgnData.contentEquals(other.RgnData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.emr.hashCode()
        result = 31 * result + this.rclBounds.hashCode()
        result = 31 * result + this.cbRgnData.hashCode()
        result = 31 * result + this.RgnData.contentHashCode()
        return result
    }
}

public data class EMRLINETO(public var emr: EMR = EMR(), public var ptl: POINTL = POINTL())

public class EMRMASKBLT(
    public var emr: EMR = EMR(),
    public var rclBounds: RECTL = RECTL(),
    public var xDest: Int = 0,
    public var yDest: Int = 0,
    public var cxDest: Int = 0,
    public var cyDest: Int = 0,
    public var dwRop: UInt = 0u,
    public var xSrc: Int = 0,
    public var ySrc: Int = 0,
    public var xformSrc: XFORM = XFORM(),
    public var crBkColorSrc: COLORREF = 0u,
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

public data class EMRMODIFYWORLDTRANSFORM(
    public var emr: EMR = EMR(),
    public var xform: XFORM = XFORM(),
    public var iMode: MODIFY_WORLD_TRANSFORM_MODE = 0u,
)

public data class EMRNAMEDESCAPE(
    public var emr: EMR = EMR(),
    public var iEscape: Int = 0,
    public var cbDriver: Int = 0,
    public var cbEscData: Int = 0,
    public var EscData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EMRNAMEDESCAPE) return false
        if (this.emr != other.emr) return false
        if (this.iEscape != other.iEscape) return false
        if (this.cbDriver != other.cbDriver) return false
        if (this.cbEscData != other.cbEscData) return false
        if (!this.EscData.contentEquals(other.EscData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.emr.hashCode()
        result = 31 * result + this.iEscape.hashCode()
        result = 31 * result + this.cbDriver.hashCode()
        result = 31 * result + this.cbEscData.hashCode()
        result = 31 * result + this.EscData.contentHashCode()
        return result
    }
}

public data class EMROFFSETCLIPRGN(public var emr: EMR = EMR(), public var ptlOffset: POINTL = POINTL())

public class EMRPLGBLT(
    public var emr: EMR = EMR(),
    public var rclBounds: RECTL = RECTL(),
    public var aptlDest: List<POINTL> = List(3) { POINTL() },
    public var xSrc: Int = 0,
    public var ySrc: Int = 0,
    public var cxSrc: Int = 0,
    public var cySrc: Int = 0,
    public var xformSrc: XFORM = XFORM(),
    public var crBkColorSrc: COLORREF = 0u,
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

public data class EMRPOLYDRAW(
    public var emr: EMR = EMR(),
    public var rclBounds: RECTL = RECTL(),
    public var cptl: UInt = 0u,
    public var aptl: List<POINTL> = List(1) { POINTL() },
    public var abTypes: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EMRPOLYDRAW) return false
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

public data class EMRPOLYDRAW16(
    public var emr: EMR = EMR(),
    public var rclBounds: RECTL = RECTL(),
    public var cpts: UInt = 0u,
    public var apts: List<POINTS> = List(1) { POINTS() },
    public var abTypes: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EMRPOLYDRAW16) return false
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

public data class EMRPOLYLINE(
    public var emr: EMR = EMR(),
    public var rclBounds: RECTL = RECTL(),
    public var cptl: UInt = 0u,
    public var aptl: List<POINTL> = List(1) { POINTL() },
)

public data class EMRPOLYLINE16(
    public var emr: EMR = EMR(),
    public var rclBounds: RECTL = RECTL(),
    public var cpts: UInt = 0u,
    public var apts: List<POINTS> = List(1) { POINTS() },
)

public data class EMRPOLYPOLYLINE(
    public var emr: EMR = EMR(),
    public var rclBounds: RECTL = RECTL(),
    public var nPolys: UInt = 0u,
    public var cptl: UInt = 0u,
    public var aPolyCounts: UIntArray = UIntArray(1),
    public var aptl: List<POINTL> = List(1) { POINTL() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EMRPOLYPOLYLINE) return false
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

public data class EMRPOLYPOLYLINE16(
    public var emr: EMR = EMR(),
    public var rclBounds: RECTL = RECTL(),
    public var nPolys: UInt = 0u,
    public var cpts: UInt = 0u,
    public var aPolyCounts: UIntArray = UIntArray(1),
    public var apts: List<POINTS> = List(1) { POINTS() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EMRPOLYPOLYLINE16) return false
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

public data class EMRPOLYTEXTOUTA(
    public var emr: EMR = EMR(),
    public var rclBounds: RECTL = RECTL(),
    public var iGraphicsMode: UInt = 0u,
    public var exScale: Float = 0.0f,
    public var eyScale: Float = 0.0f,
    public var cStrings: Int = 0,
    public var aemrtext: List<EMRTEXT> = List(1) { EMRTEXT() },
)

public data class EMRRESIZEPALETTE(
    public var emr: EMR = EMR(),
    public var ihPal: UInt = 0u,
    public var cEntries: UInt = 0u,
)

public data class EMRRESTOREDC(public var emr: EMR = EMR(), public var iRelative: Int = 0)

public data class EMRROUNDRECT(
    public var emr: EMR = EMR(),
    public var rclBox: RECTL = RECTL(),
    public var szlCorner: SIZE = SIZE(),
)

public data class EMRSCALEVIEWPORTEXTEX(
    public var emr: EMR = EMR(),
    public var xNum: Int = 0,
    public var xDenom: Int = 0,
    public var yNum: Int = 0,
    public var yDenom: Int = 0,
)

public data class EMRSELECTCLIPPATH(public var emr: EMR = EMR(), public var iMode: UInt = 0u)

public data class EMRSELECTOBJECT(public var emr: EMR = EMR(), public var ihObject: UInt = 0u)

public data class EMRSELECTPALETTE(public var emr: EMR = EMR(), public var ihPal: UInt = 0u)

public data class EMRSETARCDIRECTION(public var emr: EMR = EMR(), public var iArcDirection: UInt = 0u)

public data class EMRSETCOLORADJUSTMENT(public var emr: EMR = EMR(), public var ColorAdjustment: COLORADJUSTMENT = COLORADJUSTMENT())

public data class EMRSETCOLORSPACE(public var emr: EMR = EMR(), public var ihCS: UInt = 0u)

public data class EMRSETDIBITSTODEVICE(
    public var emr: EMR = EMR(),
    public var rclBounds: RECTL = RECTL(),
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

public data class EMRSETICMPROFILE(
    public var emr: EMR = EMR(),
    public var dwFlags: UInt = 0u,
    public var cbName: UInt = 0u,
    public var cbData: UInt = 0u,
    public var Data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EMRSETICMPROFILE) return false
        if (this.emr != other.emr) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.cbName != other.cbName) return false
        if (this.cbData != other.cbData) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.emr.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.cbName.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class EMRSETMAPPERFLAGS(public var emr: EMR = EMR(), public var dwFlags: UInt = 0u)

public data class EMRSETMITERLIMIT(public var emr: EMR = EMR(), public var eMiterLimit: Float = 0.0f)

public data class EMRSETPALETTEENTRIES(
    public var emr: EMR = EMR(),
    public var ihPal: UInt = 0u,
    public var iStart: UInt = 0u,
    public var cEntries: UInt = 0u,
    public var aPalEntries: List<PALETTEENTRY> = List(1) { PALETTEENTRY() },
)

public data class EMRSETPIXELV(
    public var emr: EMR = EMR(),
    public var ptlPixel: POINTL = POINTL(),
    public var crColor: COLORREF = 0u,
)

public data class EMRSETTEXTCOLOR(public var emr: EMR = EMR(), public var crColor: COLORREF = 0u)

public data class EMRSETVIEWPORTEXTEX(public var emr: EMR = EMR(), public var szlExtent: SIZE = SIZE())

public data class EMRSETVIEWPORTORGEX(public var emr: EMR = EMR(), public var ptlOrigin: POINTL = POINTL())

public data class EMRSETWORLDTRANSFORM(public var emr: EMR = EMR(), public var xform: XFORM = XFORM())

public class EMRSTRETCHBLT(
    public var emr: EMR = EMR(),
    public var rclBounds: RECTL = RECTL(),
    public var xDest: Int = 0,
    public var yDest: Int = 0,
    public var cxDest: Int = 0,
    public var cyDest: Int = 0,
    public var dwRop: UInt = 0u,
    public var xSrc: Int = 0,
    public var ySrc: Int = 0,
    public var xformSrc: XFORM = XFORM(),
    public var crBkColorSrc: COLORREF = 0u,
    public var iUsageSrc: UInt = 0u,
    public var offBmiSrc: UInt = 0u,
    public var cbBmiSrc: UInt = 0u,
    public var offBitsSrc: UInt = 0u,
    public var cbBitsSrc: UInt = 0u,
    public var cxSrc: Int = 0,
    public var cySrc: Int = 0,
)

public data class EMRSTRETCHDIBITS(
    public var emr: EMR = EMR(),
    public var rclBounds: RECTL = RECTL(),
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

public data class EMRTEXT(
    public var ptlReference: POINTL = POINTL(),
    public var nChars: UInt = 0u,
    public var offString: UInt = 0u,
    public var fOptions: UInt = 0u,
    public var rcl: RECTL = RECTL(),
    public var offDx: UInt = 0u,
)

public class EMRTRANSPARENTBLT(
    public var emr: EMR = EMR(),
    public var rclBounds: RECTL = RECTL(),
    public var xDest: Int = 0,
    public var yDest: Int = 0,
    public var cxDest: Int = 0,
    public var cyDest: Int = 0,
    public var dwRop: UInt = 0u,
    public var xSrc: Int = 0,
    public var ySrc: Int = 0,
    public var xformSrc: XFORM = XFORM(),
    public var crBkColorSrc: COLORREF = 0u,
    public var iUsageSrc: UInt = 0u,
    public var offBmiSrc: UInt = 0u,
    public var cbBmiSrc: UInt = 0u,
    public var offBitsSrc: UInt = 0u,
    public var cbBitsSrc: UInt = 0u,
    public var cxSrc: Int = 0,
    public var cySrc: Int = 0,
)

public class ENHMETAHEADER(
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
    public var cbPixelFormat: UInt = 0u,
    public var offPixelFormat: UInt = 0u,
    public var bOpenGL: UInt = 0u,
    public var szlMicrometers: SIZE = SIZE(),
)

public data class ENHMETARECORD(
    public var iType: ENHANCED_METAFILE_RECORD_TYPE = 0u,
    public var nSize: UInt = 0u,
    public var dParm: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ENHMETARECORD) return false
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
}

public data class ENUMLOGFONTA(
    public var elfLogFont: LOGFONTA = LOGFONTA(),
    public var elfFullName: UByteArray = UByteArray(64),
    public var elfStyle: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ENUMLOGFONTA) return false
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
}

public data class ENUMLOGFONTEXA(
    public var elfLogFont: LOGFONTA = LOGFONTA(),
    public var elfFullName: UByteArray = UByteArray(64),
    public var elfStyle: UByteArray = UByteArray(32),
    public var elfScript: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ENUMLOGFONTEXA) return false
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
}

public data class ENUMLOGFONTEXDVA(public var elfEnumLogfontEx: ENUMLOGFONTEXA = ENUMLOGFONTEXA(), public var elfDesignVector: DESIGNVECTOR = DESIGNVECTOR())

public data class ENUMLOGFONTEXDVW(public var elfEnumLogfontEx: ENUMLOGFONTEXW = ENUMLOGFONTEXW(), public var elfDesignVector: DESIGNVECTOR = DESIGNVECTOR())

public data class ENUMLOGFONTEXW(
    public var elfLogFont: LOGFONTW = LOGFONTW(),
    public var elfFullName: UShortArray = UShortArray(64),
    public var elfStyle: UShortArray = UShortArray(32),
    public var elfScript: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ENUMLOGFONTEXW) return false
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
}

public data class ENUMLOGFONTW(
    public var elfLogFont: LOGFONTW = LOGFONTW(),
    public var elfFullName: UShortArray = UShortArray(64),
    public var elfStyle: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ENUMLOGFONTW) return false
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
}

public data class EXTLOGFONTA(
    public var elfLogFont: LOGFONTA = LOGFONTA(),
    public var elfFullName: UByteArray = UByteArray(64),
    public var elfStyle: UByteArray = UByteArray(32),
    public var elfVersion: UInt = 0u,
    public var elfStyleSize: UInt = 0u,
    public var elfMatch: UInt = 0u,
    public var elfReserved: UInt = 0u,
    public var elfVendorId: UByteArray = UByteArray(4),
    public var elfCulture: UInt = 0u,
    public var elfPanose: PANOSE = PANOSE(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EXTLOGFONTA) return false
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
}

public data class EXTLOGFONTW(
    public var elfLogFont: LOGFONTW = LOGFONTW(),
    public var elfFullName: UShortArray = UShortArray(64),
    public var elfStyle: UShortArray = UShortArray(32),
    public var elfVersion: UInt = 0u,
    public var elfStyleSize: UInt = 0u,
    public var elfMatch: UInt = 0u,
    public var elfReserved: UInt = 0u,
    public var elfVendorId: UByteArray = UByteArray(4),
    public var elfCulture: UInt = 0u,
    public var elfPanose: PANOSE = PANOSE(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EXTLOGFONTW) return false
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
}

public data class EXTLOGPEN(
    public var elpPenStyle: UInt = 0u,
    public var elpWidth: UInt = 0u,
    public var elpBrushStyle: UInt = 0u,
    public var elpColor: COLORREF = 0u,
    public var elpHatch: ULong = 0uL,
    public var elpNumEntries: UInt = 0u,
    public var elpStyleEntry: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EXTLOGPEN) return false
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
}

public data class EXTLOGPEN32(
    public var elpPenStyle: UInt = 0u,
    public var elpWidth: UInt = 0u,
    public var elpBrushStyle: UInt = 0u,
    public var elpColor: COLORREF = 0u,
    public var elpHatch: UInt = 0u,
    public var elpNumEntries: UInt = 0u,
    public var elpStyleEntry: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EXTLOGPEN32) return false
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
}

public data class FIXED(public var fract: UShort = 0u, public var value: Short = 0)

public data class GCP_RESULTSA(
    public var lStructSize: UInt = 0u,
    public var lpOutString: PSTR = 0L,
    public var lpOrder: Long = 0L,
    public var lpDx: Long = 0L,
    public var lpCaretPos: Long = 0L,
    public var lpClass: PSTR = 0L,
    public var lpGlyphs: PWSTR = 0L,
    public var nGlyphs: UInt = 0u,
    public var nMaxFit: Int = 0,
)

public data class GCP_RESULTSW(
    public var lStructSize: UInt = 0u,
    public var lpOutString: PWSTR = 0L,
    public var lpOrder: Long = 0L,
    public var lpDx: Long = 0L,
    public var lpCaretPos: Long = 0L,
    public var lpClass: PSTR = 0L,
    public var lpGlyphs: PWSTR = 0L,
    public var nGlyphs: UInt = 0u,
    public var nMaxFit: Int = 0,
)

public data class GLYPHMETRICS(
    public var gmBlackBoxX: UInt = 0u,
    public var gmBlackBoxY: UInt = 0u,
    public var gmptGlyphOrigin: POINT = POINT(),
    public var gmCellIncX: Short = 0,
    public var gmCellIncY: Short = 0,
)

public data class GLYPHSET(
    public var cbThis: UInt = 0u,
    public var flAccel: UInt = 0u,
    public var cGlyphsSupported: UInt = 0u,
    public var cRanges: UInt = 0u,
    public var ranges: List<WCRANGE> = List(1) { WCRANGE() },
)

public data class GRADIENT_RECT(public var UpperLeft: UInt = 0u, public var LowerRight: UInt = 0u)

public data class GRADIENT_TRIANGLE(
    public var Vertex1: UInt = 0u,
    public var Vertex2: UInt = 0u,
    public var Vertex3: UInt = 0u,
)

public data class HANDLETABLE(public var objectHandle: LongArray = LongArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HANDLETABLE) return false
        if (!this.objectHandle.contentEquals(other.objectHandle)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.objectHandle.contentHashCode()
    }
}

public data class KERNINGPAIR(
    public var wFirst: UShort = 0u,
    public var wSecond: UShort = 0u,
    public var iKernAmount: Int = 0,
)

public data class LOGBRUSH(
    public var lbStyle: BRUSH_STYLE = 0u,
    public var lbColor: COLORREF = 0u,
    public var lbHatch: ULong = 0uL,
)

public data class LOGBRUSH32(
    public var lbStyle: BRUSH_STYLE = 0u,
    public var lbColor: COLORREF = 0u,
    public var lbHatch: UInt = 0u,
)

public data class LOGFONTA(
    public var lfHeight: Int = 0,
    public var lfWidth: Int = 0,
    public var lfEscapement: Int = 0,
    public var lfOrientation: Int = 0,
    public var lfWeight: Int = 0,
    public var lfItalic: UByte = 0u,
    public var lfUnderline: UByte = 0u,
    public var lfStrikeOut: UByte = 0u,
    public var lfCharSet: FONT_CHARSET = 0u,
    public var lfOutPrecision: FONT_OUTPUT_PRECISION = 0u,
    public var lfClipPrecision: FONT_CLIP_PRECISION = 0u,
    public var lfQuality: FONT_QUALITY = 0u,
    public var lfPitchAndFamily: UByte = 0u,
    public var lfFaceName: ByteArray = ByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LOGFONTA) return false
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
}

public data class LOGFONTW(
    public var lfHeight: Int = 0,
    public var lfWidth: Int = 0,
    public var lfEscapement: Int = 0,
    public var lfOrientation: Int = 0,
    public var lfWeight: Int = 0,
    public var lfItalic: UByte = 0u,
    public var lfUnderline: UByte = 0u,
    public var lfStrikeOut: UByte = 0u,
    public var lfCharSet: FONT_CHARSET = 0u,
    public var lfOutPrecision: FONT_OUTPUT_PRECISION = 0u,
    public var lfClipPrecision: FONT_CLIP_PRECISION = 0u,
    public var lfQuality: FONT_QUALITY = 0u,
    public var lfPitchAndFamily: UByte = 0u,
    public var lfFaceName: UShortArray = UShortArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LOGFONTW) return false
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
}

public data class LOGPALETTE(
    public var palVersion: UShort = 0u,
    public var palNumEntries: UShort = 0u,
    public var palPalEntry: List<PALETTEENTRY> = List(1) { PALETTEENTRY() },
)

public data class LOGPEN(
    public var lopnStyle: UInt = 0u,
    public var lopnWidth: POINT = POINT(),
    public var lopnColor: COLORREF = 0u,
)

public data class MAT2(
    public var eM11: FIXED = FIXED(),
    public var eM12: FIXED = FIXED(),
    public var eM21: FIXED = FIXED(),
    public var eM22: FIXED = FIXED(),
)

public data class METAHEADER(
    public var mtType: UShort = 0u,
    public var mtHeaderSize: UShort = 0u,
    public var mtVersion: UShort = 0u,
    public var mtSize: UInt = 0u,
    public var mtNoObjects: UShort = 0u,
    public var mtMaxRecord: UInt = 0u,
    public var mtNoParameters: UShort = 0u,
)

public data class METARECORD(
    public var rdSize: UInt = 0u,
    public var rdFunction: UShort = 0u,
    public var rdParm: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is METARECORD) return false
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
}

public data class MONITORINFO(
    public var cbSize: UInt = 0u,
    public var rcMonitor: RECT = RECT(),
    public var rcWork: RECT = RECT(),
    public var dwFlags: UInt = 0u,
)

public data class MONITORINFOEXA(public var monitorInfo: MONITORINFO = MONITORINFO(), public var szDevice: ByteArray = ByteArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MONITORINFOEXA) return false
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

public data class MONITORINFOEXW(public var monitorInfo: MONITORINFO = MONITORINFO(), public var szDevice: UShortArray = UShortArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MONITORINFOEXW) return false
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

public class NEWTEXTMETRICA(
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
    public var tmPitchAndFamily: TMPF_FLAGS = 0u,
    public var tmCharSet: UByte = 0u,
    public var ntmFlags: UInt = 0u,
    public var ntmSizeEM: UInt = 0u,
    public var ntmCellHeight: UInt = 0u,
    public var ntmAvgWidth: UInt = 0u,
)

public class NEWTEXTMETRICW(
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
    public var tmPitchAndFamily: TMPF_FLAGS = 0u,
    public var tmCharSet: UByte = 0u,
    public var ntmFlags: UInt = 0u,
    public var ntmSizeEM: UInt = 0u,
    public var ntmCellHeight: UInt = 0u,
    public var ntmAvgWidth: UInt = 0u,
)

public class OUTLINETEXTMETRICA(
    public var otmSize: UInt = 0u,
    public var otmTextMetrics: TEXTMETRICA = TEXTMETRICA(),
    public var otmFiller: UByte = 0u,
    public var otmPanoseNumber: PANOSE = PANOSE(),
    public var otmfsSelection: UInt = 0u,
    public var otmfsType: UInt = 0u,
    public var otmsCharSlopeRise: Int = 0,
    public var otmsCharSlopeRun: Int = 0,
    public var otmItalicAngle: Int = 0,
    public var otmEMSquare: UInt = 0u,
    public var otmAscent: Int = 0,
    public var otmDescent: Int = 0,
    public var otmLineGap: UInt = 0u,
    public var otmsCapEmHeight: UInt = 0u,
    public var otmsXHeight: UInt = 0u,
    public var otmrcFontBox: RECT = RECT(),
    public var otmMacAscent: Int = 0,
    public var otmMacDescent: Int = 0,
    public var otmMacLineGap: UInt = 0u,
    public var otmusMinimumPPEM: UInt = 0u,
    public var otmptSubscriptSize: POINT = POINT(),
    public var otmptSubscriptOffset: POINT = POINT(),
    public var otmptSuperscriptSize: POINT = POINT(),
    public var otmptSuperscriptOffset: POINT = POINT(),
    public var otmsStrikeoutSize: UInt = 0u,
    public var otmsStrikeoutPosition: Int = 0,
    public var otmsUnderscoreSize: Int = 0,
    public var otmsUnderscorePosition: Int = 0,
    public var otmpFamilyName: PSTR = 0L,
    public var otmpFaceName: PSTR = 0L,
    public var otmpStyleName: PSTR = 0L,
    public var otmpFullName: PSTR = 0L,
)

public class OUTLINETEXTMETRICW(
    public var otmSize: UInt = 0u,
    public var otmTextMetrics: TEXTMETRICW = TEXTMETRICW(),
    public var otmFiller: UByte = 0u,
    public var otmPanoseNumber: PANOSE = PANOSE(),
    public var otmfsSelection: UInt = 0u,
    public var otmfsType: UInt = 0u,
    public var otmsCharSlopeRise: Int = 0,
    public var otmsCharSlopeRun: Int = 0,
    public var otmItalicAngle: Int = 0,
    public var otmEMSquare: UInt = 0u,
    public var otmAscent: Int = 0,
    public var otmDescent: Int = 0,
    public var otmLineGap: UInt = 0u,
    public var otmsCapEmHeight: UInt = 0u,
    public var otmsXHeight: UInt = 0u,
    public var otmrcFontBox: RECT = RECT(),
    public var otmMacAscent: Int = 0,
    public var otmMacDescent: Int = 0,
    public var otmMacLineGap: UInt = 0u,
    public var otmusMinimumPPEM: UInt = 0u,
    public var otmptSubscriptSize: POINT = POINT(),
    public var otmptSubscriptOffset: POINT = POINT(),
    public var otmptSuperscriptSize: POINT = POINT(),
    public var otmptSuperscriptOffset: POINT = POINT(),
    public var otmsStrikeoutSize: UInt = 0u,
    public var otmsStrikeoutPosition: Int = 0,
    public var otmsUnderscoreSize: Int = 0,
    public var otmsUnderscorePosition: Int = 0,
    public var otmpFamilyName: PSTR = 0L,
    public var otmpFaceName: PSTR = 0L,
    public var otmpStyleName: PSTR = 0L,
    public var otmpFullName: PSTR = 0L,
)

public data class PAINTSTRUCT(
    public var hdc: HDC = 0L,
    public var fErase: BOOL = 0,
    public var rcPaint: RECT = RECT(),
    public var fRestore: BOOL = 0,
    public var fIncUpdate: BOOL = 0,
    public var rgbReserved: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PAINTSTRUCT) return false
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
}

public data class PALETTEENTRY(
    public var peRed: UByte = 0u,
    public var peGreen: UByte = 0u,
    public var peBlue: UByte = 0u,
    public var peFlags: UByte = 0u,
)

public data class PANOSE(
    public var bFamilyType: PAN_FAMILY_TYPE = 0u,
    public var bSerifStyle: PAN_SERIF_STYLE = 0u,
    public var bWeight: PAN_WEIGHT = 0u,
    public var bProportion: PAN_PROPORTION = 0u,
    public var bContrast: PAN_CONTRAST = 0u,
    public var bStrokeVariation: PAN_STROKE_VARIATION = 0u,
    public var bArmStyle: PAN_ARM_STYLE = 0u,
    public var bLetterform: PAN_LETT_FORM = 0u,
    public var bMidline: PAN_MIDLINE = 0u,
    public var bXHeight: PAN_XHEIGHT = 0u,
)

public data class PELARRAY(
    public var paXCount: Int = 0,
    public var paYCount: Int = 0,
    public var paXExt: Int = 0,
    public var paYExt: Int = 0,
    public var paRGBs: UByte = 0u,
)

public data class POINTFX(public var x: FIXED = FIXED(), public var y: FIXED = FIXED())

public data class POLYTEXTA(
    public var x: Int = 0,
    public var y: Int = 0,
    public var n: UInt = 0u,
    public var lpstr: PCSTR = 0L,
    public var uiFlags: UInt = 0u,
    public var rcl: RECT = RECT(),
    public var pdx: Long = 0L,
)

public data class POLYTEXTW(
    public var x: Int = 0,
    public var y: Int = 0,
    public var n: UInt = 0u,
    public var lpstr: PCWSTR = 0L,
    public var uiFlags: UInt = 0u,
    public var rcl: RECT = RECT(),
    public var pdx: Long = 0L,
)

public data class RASTERIZER_STATUS(
    public var nSize: Short = 0,
    public var wFlags: Short = 0,
    public var nLanguageID: Short = 0,
)

public data class RGBQUAD(
    public var rgbBlue: UByte = 0u,
    public var rgbGreen: UByte = 0u,
    public var rgbRed: UByte = 0u,
    public var rgbReserved: UByte = 0u,
)

public data class RGBTRIPLE(
    public var rgbtBlue: UByte = 0u,
    public var rgbtGreen: UByte = 0u,
    public var rgbtRed: UByte = 0u,
)

public data class RGNDATA(public var rdh: RGNDATAHEADER = RGNDATAHEADER(), public var Buffer: ByteArray = ByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RGNDATA) return false
        if (this.rdh != other.rdh) return false
        if (!this.Buffer.contentEquals(other.Buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rdh.hashCode()
        result = 31 * result + this.Buffer.contentHashCode()
        return result
    }
}

public data class RGNDATAHEADER(
    public var dwSize: UInt = 0u,
    public var iType: UInt = 0u,
    public var nCount: UInt = 0u,
    public var nRgnSize: UInt = 0u,
    public var rcBound: RECT = RECT(),
)

public class TEXTMETRICA(
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
    public var tmPitchAndFamily: TMPF_FLAGS = 0u,
    public var tmCharSet: UByte = 0u,
)

public class TEXTMETRICW(
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
    public var tmPitchAndFamily: TMPF_FLAGS = 0u,
    public var tmCharSet: UByte = 0u,
)

public data class TRIVERTEX(
    public var x: Int = 0,
    public var y: Int = 0,
    public var Red: UShort = 0u,
    public var Green: UShort = 0u,
    public var Blue: UShort = 0u,
    public var Alpha: UShort = 0u,
)

public data class TTEMBEDINFO(
    public var usStructSize: UShort = 0u,
    public var usRootStrSize: UShort = 0u,
    public var pusRootStr: Long = 0L,
)

public data class TTLOADINFO(
    public var usStructSize: UShort = 0u,
    public var usRefStrSize: UShort = 0u,
    public var pusRefStr: Long = 0L,
)

public data class TTPOLYCURVE(
    public var wType: UShort = 0u,
    public var cpfx: UShort = 0u,
    public var apfx: List<POINTFX> = List(1) { POINTFX() },
)

public data class TTPOLYGONHEADER(
    public var cb: UInt = 0u,
    public var dwType: UInt = 0u,
    public var pfxStart: POINTFX = POINTFX(),
)

public data class TTVALIDATIONTESTSPARAMS(
    public var ulStructSize: UInt = 0u,
    public var lTestFromSize: Int = 0,
    public var lTestToSize: Int = 0,
    public var ulCharSet: UInt = 0u,
    public var usReserved1: UShort = 0u,
    public var usCharCodeCount: UShort = 0u,
    public var pusCharCodeSet: Long = 0L,
)

public data class TTVALIDATIONTESTSPARAMSEX(
    public var ulStructSize: UInt = 0u,
    public var lTestFromSize: Int = 0,
    public var lTestToSize: Int = 0,
    public var ulCharSet: UInt = 0u,
    public var usReserved1: UShort = 0u,
    public var usCharCodeCount: UShort = 0u,
    public var pulCharCodeSet: Long = 0L,
)

public data class WCRANGE(public var wcLow: UShort = 0u, public var cGlyphs: UShort = 0u)

public data class WGLSWAP(public var hdc: HDC = 0L, public var uiFlags: UInt = 0u)

public data class XFORM(
    public var eM11: Float = 0.0f,
    public var eM12: Float = 0.0f,
    public var eM21: Float = 0.0f,
    public var eM22: Float = 0.0f,
    public var eDx: Float = 0.0f,
    public var eDy: Float = 0.0f,
)
