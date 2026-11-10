@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.ui.colorsystem

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Ciexyz
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Ciexyztriple
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Emr
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Dlgproc

public data class BlackInformation(public var fBlackOnly: Bool = 0, public var blackWeight: Float = 0.0f)

public data class Cmykcolor(
    public var cyan: UShort = 0u,
    public var magenta: UShort = 0u,
    public var yellow: UShort = 0u,
    public var black: UShort = 0u,
)

public data class Color(
    public var gray: Graycolor = Graycolor(),
    public var rgb: Rgbcolor = Rgbcolor(),
    public var cmyk: Cmykcolor = Cmykcolor(),
    public var xyz: Xyzcolor = Xyzcolor(),
    public var yxy: YxyCOLOR = YxyCOLOR(),
    public var lab: LabCOLOR = LabCOLOR(),
    public var gen3ch: Generic3channel = Generic3channel(),
    public var named: Namedcolor = Namedcolor(),
    public var hifi: HiFiCOLOR = HiFiCOLOR(),
    public var anonymous: Color0 = Color0(),
)

public data class Color0(public var reserved1: UInt = 0u, public var reserved2: COpaquePointer? = null)

public class Colormatchsetupa(
    public var dwSize: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var pSourceName: Pcstr = null,
    public var pDisplayName: Pcstr = null,
    public var pPrinterName: Pcstr = null,
    public var dwRenderIntent: UInt = 0u,
    public var dwProofingIntent: UInt = 0u,
    public var pMonitorProfile: Pstr = null,
    public var ccMonitorProfile: UInt = 0u,
    public var pPrinterProfile: Pstr = null,
    public var ccPrinterProfile: UInt = 0u,
    public var pTargetProfile: Pstr = null,
    public var ccTargetProfile: UInt = 0u,
    public var lpfnHook: Dlgproc = null,
    public var lParam: Lparam = 0L,
    public var lpfnApplyCallback: Pcmscallbacka = null,
    public var lParamApplyCallback: Lparam = 0L,
)

public class Colormatchsetupw(
    public var dwSize: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var hwndOwner: Hwnd = null,
    public var pSourceName: Pcwstr = null,
    public var pDisplayName: Pcwstr = null,
    public var pPrinterName: Pcwstr = null,
    public var dwRenderIntent: UInt = 0u,
    public var dwProofingIntent: UInt = 0u,
    public var pMonitorProfile: Pwstr = null,
    public var ccMonitorProfile: UInt = 0u,
    public var pPrinterProfile: Pwstr = null,
    public var ccPrinterProfile: UInt = 0u,
    public var pTargetProfile: Pwstr = null,
    public var ccTargetProfile: UInt = 0u,
    public var lpfnHook: Dlgproc = null,
    public var lParam: Lparam = 0L,
    public var lpfnApplyCallback: Pcmscallbackw = null,
    public var lParamApplyCallback: Lparam = 0L,
)

public data class Emrcreatecolorspace(
    public var emr: Emr = Emr(),
    public var ihCS: UInt = 0u,
    public var lcs: Logcolorspacea = Logcolorspacea(),
)

public data class Emrcreatecolorspacew(
    public var emr: Emr = Emr(),
    public var ihCS: UInt = 0u,
    public var lcs: Logcolorspacew = Logcolorspacew(),
    public var dwFlags: UInt = 0u,
    public var cbData: UInt = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Emrcreatecolorspacew) return false
        if (this.emr != other.emr) return false
        if (this.ihCS != other.ihCS) return false
        if (this.lcs != other.lcs) return false
        if (this.dwFlags != other.dwFlags) return false
        if (this.cbData != other.cbData) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.emr.hashCode()
        result = 31 * result + this.ihCS.hashCode()
        result = 31 * result + this.lcs.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.cbData.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public class Enumtypea(
    public var dwSize: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwFields: UInt = 0u,
    public var pDeviceName: Pcstr = null,
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

public class Enumtypew(
    public var dwSize: UInt = 0u,
    public var dwVersion: UInt = 0u,
    public var dwFields: UInt = 0u,
    public var pDeviceName: Pcwstr = null,
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

public data class Generic3channel(
    public var ch1: UShort = 0u,
    public var ch2: UShort = 0u,
    public var ch3: UShort = 0u,
)

public data class Graycolor(public var gray: UShort = 0u)

public data class GamutBoundaryDescription(
    public var pPrimaries: PrimaryJabColors? = null,
    public var cNeutralSamples: UInt = 0u,
    public var pNeutralSamples: JabColorF? = null,
    public var pReferenceShell: GamutShell? = null,
    public var pPlausibleShell: GamutShell? = null,
    public var pPossibleShell: GamutShell? = null,
)

public data class GamutShell(
    public var jMin: Float = 0.0f,
    public var jMax: Float = 0.0f,
    public var cVertices: UInt = 0u,
    public var cTriangles: UInt = 0u,
    public var pVertices: JabColorF? = null,
    public var pTriangles: GamutShellTriangle? = null,
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
    public var j: Float = 0.0f,
    public var c: Float = 0.0f,
    public var h: Float = 0.0f,
)

public data class JabColorF(
    public var j: Float = 0.0f,
    public var a: Float = 0.0f,
    public var b: Float = 0.0f,
)

public data class Logcolorspacea(
    public var lcsSignature: UInt = 0u,
    public var lcsVersion: UInt = 0u,
    public var lcsSize: UInt = 0u,
    public var lcsCSType: Lcscstype = 0,
    public var lcsIntent: Int = 0,
    public var lcsEndpoints: Ciexyztriple = Ciexyztriple(),
    public var lcsGammaRed: UInt = 0u,
    public var lcsGammaGreen: UInt = 0u,
    public var lcsGammaBlue: UInt = 0u,
    public var lcsFilename: ByteArray = ByteArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Logcolorspacea) return false
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

public data class Logcolorspacew(
    public var lcsSignature: UInt = 0u,
    public var lcsVersion: UInt = 0u,
    public var lcsSize: UInt = 0u,
    public var lcsCSType: Lcscstype = 0,
    public var lcsIntent: Int = 0,
    public var lcsEndpoints: Ciexyztriple = Ciexyztriple(),
    public var lcsGammaRed: UInt = 0u,
    public var lcsGammaGreen: UInt = 0u,
    public var lcsGammaBlue: UInt = 0u,
    public var lcsFilename: UShortArray = UShortArray(260),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Logcolorspacew) return false
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
    public var l: UShort = 0u,
    public var a: UShort = 0u,
    public var b: UShort = 0u,
)

public data class Namedcolor(public var dwIndex: UInt = 0u)

public data class NamedProfileInfo(
    public var dwFlags: UInt = 0u,
    public var dwCount: UInt = 0u,
    public var dwCountDevCoordinates: UInt = 0u,
    public var szPrefix: ByteArray = ByteArray(32),
    public var szSuffix: ByteArray = ByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NamedProfileInfo) return false
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

public data class Profile(
    public var dwType: UInt = 0u,
    public var pProfileData: COpaquePointer? = null,
    public var cbDataSize: UInt = 0u,
)

public class Profileheader(
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
    public var phIlluminant: Ciexyz = Ciexyz(),
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

public data class Rgbcolor(
    public var red: UShort = 0u,
    public var green: UShort = 0u,
    public var blue: UShort = 0u,
)

public data class WcsDeviceMhc2Capabilities(
    public var size: UInt = 0u,
    public var supportsMhc2: Bool = 0,
    public var regammaLutEntryCount: UInt = 0u,
    public var cscXyzMatrixRows: UInt = 0u,
    public var cscXyzMatrixColumns: UInt = 0u,
)

public data class WcsDeviceVcgtCapabilities(public var size: UInt = 0u, public var supportsVcgt: Bool = 0)

public data class Xyzcolor(
    public var x: UShort = 0u,
    public var y: UShort = 0u,
    public var z: UShort = 0u,
)

public data class XYZColorF(
    public var x: Float = 0.0f,
    public var y: Float = 0.0f,
    public var z: Float = 0.0f,
)

public data class YxyCOLOR(public var y: UShort = 0u, public var x: UShort = 0u)
