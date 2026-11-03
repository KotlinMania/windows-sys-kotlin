@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public data class BlackInformation(public var fBlackOnly: BOOL = 0, public var blackWeight: Float = 0.0f)

public data class CMYKCOLOR(
    public var cyan: UShort = 0u,
    public var magenta: UShort = 0u,
    public var yellow: UShort = 0u,
    public var black: UShort = 0u,
)

public data class COLOR(
    public var gray: GRAYCOLOR = GRAYCOLOR(),
    public var rgb: RGBCOLOR = RGBCOLOR(),
    public var cmyk: CMYKCOLOR = CMYKCOLOR(),
    public var XYZ: XYZCOLOR = XYZCOLOR(),
    public var Yxy: YxyCOLOR = YxyCOLOR(),
    public var Lab: LabCOLOR = LabCOLOR(),
    public var gen3ch: GENERIC3CHANNEL = GENERIC3CHANNEL(),
    public var named: NAMEDCOLOR = NAMEDCOLOR(),
    public var hifi: HiFiCOLOR = HiFiCOLOR(),
    public var Anonymous: COLOR_0 = COLOR_0(),
)

public data class COLOR_0(public var reserved1: UInt = 0u, public var reserved2: Long = 0L)

public class COLORMATCHSETUPA(
    public var dwSize: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hwndOwner: Foundation.HWND = Foundation.HWND(),
    public var pSourceName: PCSTR = 0L,
    public var pDisplayName: PCSTR = 0L,
    public var pPrinterName: PCSTR = 0L,
    public var dwRenderIntent: UInt = 0u,
    public var dwProofingIntent: UInt = 0u,
    public var pMonitorProfile: PSTR = 0L,
    public var ccMonitorProfile: UInt = 0u,
    public var pPrinterProfile: PSTR = 0L,
    public var ccPrinterProfile: UInt = 0u,
    public var pTargetProfile: PSTR = 0L,
    public var ccTargetProfile: UInt = 0u,
    public var lpfnHook: WindowsAndMessaging.DLGPROC = WindowsAndMessaging.DLGPROC(),
    public var lParam: Foundation.LPARAM = Foundation.LPARAM(),
    public var lpfnApplyCallback: PCMSCALLBACKA = null,
    public var lParamApplyCallback: Foundation.LPARAM = Foundation.LPARAM(),
)

public class COLORMATCHSETUPW(
    public var dwSize: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hwndOwner: Foundation.HWND = Foundation.HWND(),
    public var pSourceName: PCWSTR = 0L,
    public var pDisplayName: PCWSTR = 0L,
    public var pPrinterName: PCWSTR = 0L,
    public var dwRenderIntent: UInt = 0u,
    public var dwProofingIntent: UInt = 0u,
    public var pMonitorProfile: PWSTR = 0L,
    public var ccMonitorProfile: UInt = 0u,
    public var pPrinterProfile: PWSTR = 0L,
    public var ccPrinterProfile: UInt = 0u,
    public var pTargetProfile: PWSTR = 0L,
    public var ccTargetProfile: UInt = 0u,
    public var lpfnHook: WindowsAndMessaging.DLGPROC = WindowsAndMessaging.DLGPROC(),
    public var lParam: Foundation.LPARAM = Foundation.LPARAM(),
    public var lpfnApplyCallback: PCMSCALLBACKW = null,
    public var lParamApplyCallback: Foundation.LPARAM = Foundation.LPARAM(),
)

public data class EMRCREATECOLORSPACE(
    public var emr: Graphics.Gdi.EMR = Graphics.Gdi.EMR(),
    public var ihCS: UInt = 0u,
    public var lcs: LOGCOLORSPACEA = LOGCOLORSPACEA(),
)

public data class EMRCREATECOLORSPACEW(
    public var emr: Graphics.Gdi.EMR = Graphics.Gdi.EMR(),
    public var ihCS: UInt = 0u,
    public var lcs: LOGCOLORSPACEW = LOGCOLORSPACEW(),
    public var dwFlags: UInt = 0u,
    public var cbData: UInt = 0u,
    public var Data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is EMRCREATECOLORSPACEW) return false
        if (this.emr != other.emr) return false
        if (this.ihCS != other.ihCS) return false
        if (this.lcs != other.lcs) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.cbData != other.cbData) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.emr.hashCode()
        result = 31 * result + this.ihCS.hashCode()
        result = 31 * result + this.lcs.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public class ENUMTYPEA(
    public var dwSize: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwFields: UInt = 0u,
    public var pDeviceName: PCSTR = 0L,
    public var dwMediaType: UInt = 0u,
    public var dwDitheringMode: UInt = 0u,
    public var dwResolution: UIntArray = UIntArray(2),
    public var dwCMMType: UInt = 0u,
    public var dwClass: UInt = 0u,
    public var dwDataColorSpace: UInt = 0u,
    public var dwConnectionSpace: UInt = 0u,
    public var dwSignature: UInt = 0u,
    public var dwPlatform: UInt = 0u,
    public var dwProfileFlags: UInt = 0u,
    public var dwManufacturer: UInt = 0u,
    public var dwModel: UInt = 0u,
    public var dwAttributes: UIntArray = UIntArray(2),
    public var dwRenderingIntent: UInt = 0u,
    public var dwCreator: UInt = 0u,
    public var dwDeviceClass: UInt = 0u,
)

public class ENUMTYPEW(
    public var dwSize: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwFields: UInt = 0u,
    public var pDeviceName: PCWSTR = 0L,
    public var dwMediaType: UInt = 0u,
    public var dwDitheringMode: UInt = 0u,
    public var dwResolution: UIntArray = UIntArray(2),
    public var dwCMMType: UInt = 0u,
    public var dwClass: UInt = 0u,
    public var dwDataColorSpace: UInt = 0u,
    public var dwConnectionSpace: UInt = 0u,
    public var dwSignature: UInt = 0u,
    public var dwPlatform: UInt = 0u,
    public var dwProfileFlags: UInt = 0u,
    public var dwManufacturer: UInt = 0u,
    public var dwModel: UInt = 0u,
    public var dwAttributes: UIntArray = UIntArray(2),
    public var dwRenderingIntent: UInt = 0u,
    public var dwCreator: UInt = 0u,
    public var dwDeviceClass: UInt = 0u,
)

public data class GENERIC3CHANNEL(
    public var ch1: UShort = 0u,
    public var ch2: UShort = 0u,
    public var ch3: UShort = 0u,
)

public data class GRAYCOLOR(public var gray: UShort = 0u)

public data class GamutBoundaryDescription(
    public var pPrimaries: Long = 0L,
    public var cNeutralSamples: UInt = 0u,
    public var pNeutralSamples: Long = 0L,
    public var pReferenceShell: Long = 0L,
    public var pPlausibleShell: Long = 0L,
    public var pPossibleShell: Long = 0L,
)

public data class GamutShell(
    public var JMin: Float = 0.0f,
    public var JMax: Float = 0.0f,
    public var cVertices: UInt = 0u,
    public var cTriangles: UInt = 0u,
    public var pVertices: Long = 0L,
    public var pTriangles: Long = 0L,
)

public data class GamutShellTriangle(public var aVertexIndex: UIntArray = UIntArray(3)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GamutShellTriangle) return false
        if (!this.aVertexIndex.contentEquals(other.aVertexIndex)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.aVertexIndex.contentHashCode()
    }
}

public data class HiFiCOLOR(public var channel: UByteArray = UByteArray(8)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HiFiCOLOR) return false
        if (!this.channel.contentEquals(other.channel)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.channel.contentHashCode()
    }
}

public data class JChColorF(
    public var J: Float = 0.0f,
    public var C: Float = 0.0f,
    public var h: Float = 0.0f,
)

public data class JabColorF(
    public var J: Float = 0.0f,
    public var a: Float = 0.0f,
    public var b: Float = 0.0f,
)

public data class LOGCOLORSPACEA(
    public var lcsSignature: UInt = 0u,
    public var lcsVersion: UInt = 0u,
    public var lcsSize: UInt = 0u,
    public var lcsCSType: LCSCSTYPE = 0,
    public var lcsIntent: Int = 0,
    public var lcsEndpoints: Graphics.Gdi.CIEXYZTRIPLE = Graphics.Gdi.CIEXYZTRIPLE(),
    public var lcsGammaRed: UInt = 0u,
    public var lcsGammaGreen: UInt = 0u,
    public var lcsGammaBlue: UInt = 0u,
    public var lcsFilename: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LOGCOLORSPACEA) return false
        if (this.lcsSignature != other.lcsSignature) return false
        if (this.lcsVersion != other.lcsVersion) return false
        if (this.lcsSize != other.lcsSize) return false
        if (this.lcsCSType != other.lcsCSType) return false
        if (this.lcsIntent != other.lcsIntent) return false
        if (this.lcsEndpoints != other.lcsEndpoints) return false
        if (this.lcsGammaRed != other.lcsGammaRed) return false
        if (this.lcsGammaGreen != other.lcsGammaGreen) return false
        if (this.lcsGammaBlue != other.lcsGammaBlue) return false
        if (!this.lcsFilename.contentEquals(other.lcsFilename)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lcsSignature.hashCode()
        result = 31 * result + this.lcsVersion.hashCode()
        result = 31 * result + this.lcsSize.hashCode()
        result = 31 * result + this.lcsCSType.hashCode()
        result = 31 * result + this.lcsIntent.hashCode()
        result = 31 * result + this.lcsEndpoints.hashCode()
        result = 31 * result + this.lcsGammaRed.hashCode()
        result = 31 * result + this.lcsGammaGreen.hashCode()
        result = 31 * result + this.lcsGammaBlue.hashCode()
        result = 31 * result + this.lcsFilename.contentHashCode()
        return result
    }
}

public data class LOGCOLORSPACEW(
    public var lcsSignature: UInt = 0u,
    public var lcsVersion: UInt = 0u,
    public var lcsSize: UInt = 0u,
    public var lcsCSType: LCSCSTYPE = 0,
    public var lcsIntent: Int = 0,
    public var lcsEndpoints: Graphics.Gdi.CIEXYZTRIPLE = Graphics.Gdi.CIEXYZTRIPLE(),
    public var lcsGammaRed: UInt = 0u,
    public var lcsGammaGreen: UInt = 0u,
    public var lcsGammaBlue: UInt = 0u,
    public var lcsFilename: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LOGCOLORSPACEW) return false
        if (this.lcsSignature != other.lcsSignature) return false
        if (this.lcsVersion != other.lcsVersion) return false
        if (this.lcsSize != other.lcsSize) return false
        if (this.lcsCSType != other.lcsCSType) return false
        if (this.lcsIntent != other.lcsIntent) return false
        if (this.lcsEndpoints != other.lcsEndpoints) return false
        if (this.lcsGammaRed != other.lcsGammaRed) return false
        if (this.lcsGammaGreen != other.lcsGammaGreen) return false
        if (this.lcsGammaBlue != other.lcsGammaBlue) return false
        if (!this.lcsFilename.contentEquals(other.lcsFilename)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lcsSignature.hashCode()
        result = 31 * result + this.lcsVersion.hashCode()
        result = 31 * result + this.lcsSize.hashCode()
        result = 31 * result + this.lcsCSType.hashCode()
        result = 31 * result + this.lcsIntent.hashCode()
        result = 31 * result + this.lcsEndpoints.hashCode()
        result = 31 * result + this.lcsGammaRed.hashCode()
        result = 31 * result + this.lcsGammaGreen.hashCode()
        result = 31 * result + this.lcsGammaBlue.hashCode()
        result = 31 * result + this.lcsFilename.contentHashCode()
        return result
    }
}

public data class LabCOLOR(
    public var L: UShort = 0u,
    public var a: UShort = 0u,
    public var b: UShort = 0u,
)

public data class NAMEDCOLOR(public var dwIndex: UInt = 0u)

public data class NAMED_PROFILE_INFO(
    public var dwFlags: UInt = 0u,
    public var dwCount: UInt = 0u,
    public var dwCountDevCoordinates: UInt = 0u,
    public var szPrefix: ByteArray = ByteArray(32),
    public var szSuffix: ByteArray = ByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NAMED_PROFILE_INFO) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.dwCount != other.dwCount) return false
        if (this.dwCountDevCoordinates != other.dwCountDevCoordinates) return false
        if (!this.szPrefix.contentEquals(other.szPrefix)) return false
        if (!this.szSuffix.contentEquals(other.szSuffix)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwFlags.hashCode()
        result = 31 * result + this.dwCount.hashCode()
        result = 31 * result + this.dwCountDevCoordinates.hashCode()
        result = 31 * result + this.szPrefix.contentHashCode()
        result = 31 * result + this.szSuffix.contentHashCode()
        return result
    }
}

public data class PROFILE(
    public var dwType: UInt = 0u,
    public var pProfileData: Long = 0L,
    public var cbDataSize: UInt = 0u,
)

public class PROFILEHEADER(
    public var phSize: UInt = 0u,
    public var phCMMType: UInt = 0u,
    public var phVersion: UInt = 0u,
    public var phClass: UInt = 0u,
    public var phDataColorSpace: UInt = 0u,
    public var phConnectionSpace: UInt = 0u,
    public var phDateTime: UIntArray = UIntArray(3),
    public var phSignature: UInt = 0u,
    public var phPlatform: UInt = 0u,
    public var phProfileFlags: UInt = 0u,
    public var phManufacturer: UInt = 0u,
    public var phModel: UInt = 0u,
    public var phAttributes: UIntArray = UIntArray(2),
    public var phRenderingIntent: UInt = 0u,
    public var phIlluminant: Graphics.Gdi.CIEXYZ = Graphics.Gdi.CIEXYZ(),
    public var phCreator: UInt = 0u,
    public var phReserved: UByteArray = UByteArray(44),
)

public data class PrimaryJabColors(
    public var red: JabColorF = JabColorF(),
    public var yellow: JabColorF = JabColorF(),
    public var green: JabColorF = JabColorF(),
    public var cyan: JabColorF = JabColorF(),
    public var blue: JabColorF = JabColorF(),
    public var magenta: JabColorF = JabColorF(),
    public var black: JabColorF = JabColorF(),
    public var white: JabColorF = JabColorF(),
)

public data class PrimaryXYZColors(
    public var red: XYZColorF = XYZColorF(),
    public var yellow: XYZColorF = XYZColorF(),
    public var green: XYZColorF = XYZColorF(),
    public var cyan: XYZColorF = XYZColorF(),
    public var blue: XYZColorF = XYZColorF(),
    public var magenta: XYZColorF = XYZColorF(),
    public var black: XYZColorF = XYZColorF(),
    public var white: XYZColorF = XYZColorF(),
)

public data class RGBCOLOR(
    public var red: UShort = 0u,
    public var green: UShort = 0u,
    public var blue: UShort = 0u,
)

public data class WCS_DEVICE_MHC2_CAPABILITIES(
    public var Size: UInt = 0u,
    public var SupportsMhc2: BOOL = 0,
    public var RegammaLutEntryCount: UInt = 0u,
    public var CscXyzMatrixRows: UInt = 0u,
    public var CscXyzMatrixColumns: UInt = 0u,
)

public data class WCS_DEVICE_VCGT_CAPABILITIES(public var Size: UInt = 0u, public var SupportsVcgt: BOOL = 0)

public data class XYZCOLOR(
    public var X: UShort = 0u,
    public var Y: UShort = 0u,
    public var Z: UShort = 0u,
)

public data class XYZColorF(
    public var X: Float = 0.0f,
    public var Y: Float = 0.0f,
    public var Z: Float = 0.0f,
)

public data class YxyCOLOR(
    public var Y: UShort = 0u,
    public var x: UShort = 0u,
    public var y: UShort = 0u,
)
