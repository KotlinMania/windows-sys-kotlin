@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.gdi

import io.github.kotlinmania.windowssys.COpaquePointer
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
)

public data class Abcfloat(
    public var abcfA: Float = 0.0f,
    public var abcfB: Float = 0.0f,
    public var abcfC: Float = 0.0f,
)

public data class Abortpath(
    public var emr: Emr = Emr(),
)

public data class Axeslista(
    public var axlReserved: UInt = 0u,
    public var axlNumAxes: UInt = 0u,
    public var axlAxisInfo: List<Axisinfoa> = List(16) { Axisinfoa() },
)

public data class Axeslistw(
    public var axlReserved: UInt = 0u,
    public var axlNumAxes: UInt = 0u,
    public var axlAxisInfo: List<Axisinfow> = List(16) { Axisinfow() },
)

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
}

public data class Bitmap(
    public var bmType: Int = 0,
    public var bmWidth: Int = 0,
    public var bmHeight: Int = 0,
    public var bmWidthBytes: Int = 0,
    public var bmPlanes: UShort = 0u,
    public var bmBitsPixel: UShort = 0u,
    public var bmBits: COpaquePointer? = null,
)

public data class Bitmapcoreheader(
    public var bcSize: UInt = 0u,
    public var bcWidth: UShort = 0u,
    public var bcHeight: UShort = 0u,
    public var bcPlanes: UShort = 0u,
    public var bcBitCount: UShort = 0u,
)

public data class Bitmapcoreinfo(
    public var bmciHeader: Bitmapcoreheader = Bitmapcoreheader(),
    public var bmciColors: List<Rgbtriple> = List(1) { Rgbtriple() },
)

public data class Bitmapfileheader(
    public var bfType: UShort = 0u,
    public var bfSize: UInt = 0u,
    public var bfReserved1: UShort = 0u,
    public var bfReserved2: UShort = 0u,
    public var bfOffBits: UInt = 0u,
)

public data class Bitmapinfo(
    public var bmiHeader: Bitmapinfoheader = Bitmapinfoheader(),
    public var bmiColors: List<Rgbquad> = List(1) { Rgbquad() },
)

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
)

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
)

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
)

public data class Blendfunction(
    public var blendOp: UByte = 0u,
    public var blendFlags: UByte = 0u,
    public var sourceConstantAlpha: UByte = 0u,
    public var alphaFormat: UByte = 0u,
)

public data class Ciexyz(
    public var ciexyzX: Int = 0,
    public var ciexyzY: Int = 0,
    public var ciexyzZ: Int = 0,
)

public data class Ciexyztriple(
    public var ciexyzRed: Ciexyz = Ciexyz(),
    public var ciexyzGreen: Ciexyz = Ciexyz(),
    public var ciexyzBlue: Ciexyz = Ciexyz(),
)

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
)

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
)

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
)

public data class Devmodew01(
    public var dmPosition: Pointl = Pointl(),
    public var dmDisplayOrientation: DevmodeDisplayOrientation = 0u,
    public var dmDisplayFixedOutput: DevmodeDisplayFixedOutput = 0u,
)

public data class Devmodew1(
    public var dmDisplayFlags: UInt = 0u,
    public var dmNup: UInt = 0u,
)

public data class Dibsection(
    public var dsBm: Bitmap = Bitmap(),
    public var dsBmih: Bitmapinfoheader = Bitmapinfoheader(),
    public var dsBitfields: UIntArray = UIntArray(3),
    public var dshSection: Handle = null,
    public var dsOffset: UInt = 0u,
) {
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
}

public data class Drawtextparams(
    public var cbSize: UInt = 0u,
    public var iTabLength: Int = 0,
    public var iLeftMargin: Int = 0,
    public var iRightMargin: Int = 0,
    public var uiLengthDrawn: UInt = 0u,
)

public data class Emr(
    public var iType: EnhancedMetafileRecordType = 0u,
    public var nSize: UInt = 0u,
)

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
)

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
}

public data class Emrcreatebrushindirect(
    public var emr: Emr = Emr(),
    public var ihBrush: UInt = 0u,
    public var lb: Logbrush32 = Logbrush32(),
)

public data class Emrcreatedibpatternbrushpt(
    public var emr: Emr = Emr(),
    public var ihBrush: UInt = 0u,
    public var iUsage: UInt = 0u,
    public var offBmi: UInt = 0u,
    public var cbBmi: UInt = 0u,
    public var offBits: UInt = 0u,
    public var cbBits: UInt = 0u,
)

public data class Emrcreatemonobrush(
    public var emr: Emr = Emr(),
    public var ihBrush: UInt = 0u,
    public var iUsage: UInt = 0u,
    public var offBmi: UInt = 0u,
    public var cbBmi: UInt = 0u,
    public var offBits: UInt = 0u,
    public var cbBits: UInt = 0u,
)

public data class Emrcreatepalette(
    public var emr: Emr = Emr(),
    public var ihPal: UInt = 0u,
    public var lgpl: Logpalette = Logpalette(),
)

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
)

public data class Emrexcludecliprect(
    public var emr: Emr = Emr(),
    public var rclClip: Rectl = Rectl(),
)

public data class Emrextcreatefontindirectw(
    public var emr: Emr = Emr(),
    public var ihFont: UInt = 0u,
    public var elfw: Extlogfontw = Extlogfontw(),
)

public data class Emrextcreatepen(
    public var emr: Emr = Emr(),
    public var ihPen: UInt = 0u,
    public var offBmi: UInt = 0u,
    public var cbBmi: UInt = 0u,
    public var offBits: UInt = 0u,
    public var cbBits: UInt = 0u,
    public var elp: Extlogpen32 = Extlogpen32(),
)

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
)

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
)

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
)

public data class Emrrestoredc(
    public var emr: Emr = Emr(),
    public var iRelative: Int = 0,
)

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
)

public data class Emrselectclippath(
    public var emr: Emr = Emr(),
    public var iMode: UInt = 0u,
)

public data class Emrselectobject(
    public var emr: Emr = Emr(),
    public var ihObject: UInt = 0u,
)

public data class Emrselectpalette(
    public var emr: Emr = Emr(),
    public var ihPal: UInt = 0u,
)

public data class Emrsetarcdirection(
    public var emr: Emr = Emr(),
    public var iArcDirection: UInt = 0u,
)

public data class Emrsetcoloradjustment(
    public var emr: Emr = Emr(),
    public var colorAdjustment: Coloradjustment = Coloradjustment(),
)

public data class Emrsetcolorspace(
    public var emr: Emr = Emr(),
    public var ihCS: UInt = 0u,
)

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
}

public data class Emrsetmapperflags(
    public var emr: Emr = Emr(),
    public var dwFlags: UInt = 0u,
)

public data class Emrsetmiterlimit(
    public var emr: Emr = Emr(),
    public var eMiterLimit: Float = 0.0f,
)

public data class Emrsetpaletteentries(
    public var emr: Emr = Emr(),
    public var ihPal: UInt = 0u,
    public var iStart: UInt = 0u,
    public var cEntries: UInt = 0u,
    public var aPalEntries: List<Paletteentry> = List(1) { Paletteentry() },
)

public data class Emrsetpixelv(
    public var emr: Emr = Emr(),
    public var ptlPixel: Pointl = Pointl(),
    public var crColor: Colorref = 0u,
)

public data class Emrsettextcolor(
    public var emr: Emr = Emr(),
    public var crColor: Colorref = 0u,
)

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
)

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
}

public data class Enumlogfontexdva(
    public var elfEnumLogfontEx: Enumlogfontexa = Enumlogfontexa(),
    public var elfDesignVector: Designvector = Designvector(),
)

public data class Enumlogfontexdvw(
    public var elfEnumLogfontEx: Enumlogfontexw = Enumlogfontexw(),
    public var elfDesignVector: Designvector = Designvector(),
)

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
}

public data class Fixed(
    public var fract: UShort = 0u,
    public var value: Short = 0,
)

public data class GcpResultsa(
    public var lStructSize: UInt = 0u,
    public var lpOutString: Pstr = null,
    public var lpOrder: UInt? = null,
    public var lpDx: Int? = null,
    public var lpCaretPos: Int? = null,
    public var lpClass: Pstr = null,
    public var lpGlyphs: Pwstr = null,
    public var nGlyphs: UInt = 0u,
    public var nMaxFit: Int = 0,
)

public data class GcpResultsw(
    public var lStructSize: UInt = 0u,
    public var lpOutString: Pwstr = null,
    public var lpOrder: UInt? = null,
    public var lpDx: Int? = null,
    public var lpCaretPos: Int? = null,
    public var lpClass: Pstr = null,
    public var lpGlyphs: Pwstr = null,
    public var nGlyphs: UInt = 0u,
    public var nMaxFit: Int = 0,
)

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
)

public data class GradientRect(
    public var upperLeft: UInt = 0u,
    public var lowerRight: UInt = 0u,
)

public data class GradientTriangle(
    public var vertex1: UInt = 0u,
    public var vertex2: UInt = 0u,
    public var vertex3: UInt = 0u,
)

public data class Handletable(
    public var objectHandle: List<COpaquePointer> = List(1) { COpaquePointer(0L) },
)

public data class Kerningpair(
    public var wFirst: UShort = 0u,
    public var wSecond: UShort = 0u,
    public var iKernAmount: Int = 0,
)

public data class Logbrush(
    public var lbStyle: BrushStyle = 0u,
    public var lbColor: Colorref = 0u,
    public var lbHatch: Int = 0,
)

public data class Logbrush32(
    public var lbStyle: BrushStyle = 0u,
    public var lbColor: Colorref = 0u,
    public var lbHatch: UInt = 0u,
)

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
}

public data class Logpalette(
    public var palVersion: UShort = 0u,
    public var palNumEntries: UShort = 0u,
    public var palPalEntry: List<Paletteentry> = List(1) { Paletteentry() },
)

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
)

public data class Metaheader(
    public var mtType: UShort = 0u,
    public var mtHeaderSize: UShort = 0u,
    public var mtVersion: UShort = 0u,
    public var mtSize: UInt = 0u,
    public var mtNoObjects: UShort = 0u,
    public var mtMaxRecord: UInt = 0u,
    public var mtNoParameters: UShort = 0u,
)

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
)

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
)

public class Outlinetextmetrica(
    public var otmSize: UInt = 0u,
    public var otmTextMetrics: Textmetrica = Textmetrica(),
    public var otmFiller: UByte = 0u,
    public var otmPanoseNumber: Panose = Panose(),
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
    public var otmrcFontBox: Rect = Rect(),
    public var otmMacAscent: Int = 0,
    public var otmMacDescent: Int = 0,
    public var otmMacLineGap: UInt = 0u,
    public var otmusMinimumPPEM: UInt = 0u,
    public var otmptSubscriptSize: Point = Point(),
    public var otmptSubscriptOffset: Point = Point(),
    public var otmptSuperscriptSize: Point = Point(),
    public var otmptSuperscriptOffset: Point = Point(),
    public var otmsStrikeoutSize: UInt = 0u,
    public var otmsStrikeoutPosition: Int = 0,
    public var otmsUnderscoreSize: Int = 0,
    public var otmsUnderscorePosition: Int = 0,
    public var otmpFamilyName: Pstr = null,
    public var otmpFaceName: Pstr = null,
    public var otmpStyleName: Pstr = null,
    public var otmpFullName: Pstr = null,
)

public class Outlinetextmetricw(
    public var otmSize: UInt = 0u,
    public var otmTextMetrics: Textmetricw = Textmetricw(),
    public var otmFiller: UByte = 0u,
    public var otmPanoseNumber: Panose = Panose(),
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
    public var otmrcFontBox: Rect = Rect(),
    public var otmMacAscent: Int = 0,
    public var otmMacDescent: Int = 0,
    public var otmMacLineGap: UInt = 0u,
    public var otmusMinimumPPEM: UInt = 0u,
    public var otmptSubscriptSize: Point = Point(),
    public var otmptSubscriptOffset: Point = Point(),
    public var otmptSuperscriptSize: Point = Point(),
    public var otmptSuperscriptOffset: Point = Point(),
    public var otmsStrikeoutSize: UInt = 0u,
    public var otmsStrikeoutPosition: Int = 0,
    public var otmsUnderscoreSize: Int = 0,
    public var otmsUnderscorePosition: Int = 0,
    public var otmpFamilyName: Pstr = null,
    public var otmpFaceName: Pstr = null,
    public var otmpStyleName: Pstr = null,
    public var otmpFullName: Pstr = null,
)

public data class Paintstruct(
    public var hdc: Hdc = null,
    public var fErase: Bool = 0,
    public var rcPaint: Rect = Rect(),
    public var fRestore: Bool = 0,
    public var fIncUpdate: Bool = 0,
    public var rgbReserved: UByteArray = UByteArray(32),
) {
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
}

public data class Paletteentry(
    public var peRed: UByte = 0u,
    public var peGreen: UByte = 0u,
    public var peBlue: UByte = 0u,
    public var peFlags: UByte = 0u,
)

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
)

public data class Pelarray(
    public var paXCount: Int = 0,
    public var paYCount: Int = 0,
    public var paXExt: Int = 0,
    public var paYExt: Int = 0,
    public var paRGBs: UByte = 0u,
)

public data class Pointfx(
    public var x: Fixed = Fixed(),
    public var y: Fixed = Fixed(),
)

public data class Polytexta(
    public var x: Int = 0,
    public var y: Int = 0,
    public var n: UInt = 0u,
    public var lpstr: Pcstr = null,
    public var uiFlags: UInt = 0u,
    public var rcl: Rect = Rect(),
    public var pdx: Int? = null,
)

public data class Polytextw(
    public var x: Int = 0,
    public var y: Int = 0,
    public var n: UInt = 0u,
    public var lpstr: Pcwstr = null,
    public var uiFlags: UInt = 0u,
    public var rcl: Rect = Rect(),
    public var pdx: Int? = null,
)

public data class RasterizerStatus(
    public var nSize: Short = 0,
    public var wFlags: Short = 0,
    public var nLanguageID: Short = 0,
)

public data class Rgbquad(
    public var rgbBlue: UByte = 0u,
    public var rgbGreen: UByte = 0u,
    public var rgbRed: UByte = 0u,
    public var rgbReserved: UByte = 0u,
)

public data class Rgbtriple(
    public var rgbtBlue: UByte = 0u,
    public var rgbtGreen: UByte = 0u,
    public var rgbtRed: UByte = 0u,
)

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
)

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
)

public data class Trivertex(
    public var x: Int = 0,
    public var y: Int = 0,
    public var red: UShort = 0u,
    public var green: UShort = 0u,
    public var blue: UShort = 0u,
    public var alpha: UShort = 0u,
)

public data class Ttembedinfo(
    public var usStructSize: UShort = 0u,
    public var usRootStrSize: UShort = 0u,
    public var pusRootStr: COpaquePointer? = null,
)

public data class Ttloadinfo(
    public var usStructSize: UShort = 0u,
    public var usRefStrSize: UShort = 0u,
    public var pusRefStr: COpaquePointer? = null,
)

public data class Ttpolycurve(
    public var wType: UShort = 0u,
    public var cpfx: UShort = 0u,
    public var apfx: List<Pointfx> = List(1) { Pointfx() },
)

public data class Ttpolygonheader(
    public var cb: UInt = 0u,
    public var dwType: UInt = 0u,
    public var pfxStart: Pointfx = Pointfx(),
)

public data class Ttvalidationtestsparams(
    public var ulStructSize: UInt = 0u,
    public var lTestFromSize: Int = 0,
    public var lTestToSize: Int = 0,
    public var ulCharSet: UInt = 0u,
    public var usReserved1: UShort = 0u,
    public var usCharCodeCount: UShort = 0u,
    public var pusCharCodeSet: COpaquePointer? = null,
)

public data class Ttvalidationtestsparamsex(
    public var ulStructSize: UInt = 0u,
    public var lTestFromSize: Int = 0,
    public var lTestToSize: Int = 0,
    public var ulCharSet: UInt = 0u,
    public var usReserved1: UShort = 0u,
    public var usCharCodeCount: UShort = 0u,
    public var pulCharCodeSet: UInt? = null,
)

public data class Wcrange(
    public var wcLow: UShort = 0u,
    public var cGlyphs: UShort = 0u,
)

public data class Wglswap(
    public var hdc: Hdc = null,
    public var uiFlags: UInt = 0u,
)

public data class Xform(
    public var eM11: Float = 0.0f,
    public var eM12: Float = 0.0f,
    public var eM21: Float = 0.0f,
    public var eM22: Float = 0.0f,
    public var eDx: Float = 0.0f,
    public var eDy: Float = 0.0f,
)
