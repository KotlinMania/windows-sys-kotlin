@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.devices.display

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Luid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Pointl
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rectl
import io.github.kotlinmania.windowssys.windows.win32.foundation.Size
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Blendfunction
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Devmodew
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.DisplayconfigColorEncoding
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Logfontw
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Panose
import io.github.kotlinmania.windowssys.windows.win32.system.console.CharInfo
import io.github.kotlinmania.windowssys.windows.win32.system.console.Coord

public data class Adapter(
    public var adapterName: UShortArray = UShortArray(128),
    public var numSources: Int = 0,
    public var sources: List<Sources> = List(1) { Sources() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Adapter) return false
        if (!this.adapterName.contentEquals(other.adapterName)) return false
        if (this.numSources != other.numSources) return false
        if (this.sources != other.sources) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.adapterName.contentHashCode()
        result = 31 * result + this.numSources.hashCode()
        result = 31 * result + this.sources.hashCode()
        return result
    }
}

public data class Adapters(public var numAdapters: Int = 0, public var adapter: List<Adapter> = List(1) { Adapter() })

public data class BacklightReductionGammaRamp(
    public var r: UShortArray = UShortArray(256),
    public var g: UShortArray = UShortArray(256),
    public var b: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BacklightReductionGammaRamp) return false
        if (!this.r.contentEquals(other.r)) return false
        if (!this.g.contentEquals(other.g)) return false
        if (!this.b.contentEquals(other.b)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.r.contentHashCode()
        result = 31 * result + this.g.contentHashCode()
        result = 31 * result + this.b.contentHashCode()
        return result
    }
}

public data class BankPosition(public var readBankPosition: UInt = 0u, public var writeBankPosition: UInt = 0u)

public data class Blendobj(public var blendFunction: Blendfunction = Blendfunction())

public data class BrightnessLevel(public var count: UByte = 0u, public var level: UByteArray = UByteArray(103)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BrightnessLevel) return false
        if (this.count != other.count) return false
        if (!this.level.contentEquals(other.level)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.count.hashCode()
        result = 31 * result + this.level.contentHashCode()
        return result
    }
}

public data class BrightnessNitRange(
    public var minLevelInMillinit: UInt = 0u,
    public var maxLevelInMillinit: UInt = 0u,
    public var stepSizeInMillinit: UInt = 0u,
)

public data class BrightnessNitRanges(
    public var normalRangeCount: UInt = 0u,
    public var rangeCount: UInt = 0u,
    public var preferredMaximumBrightness: UInt = 0u,
    public var supportedRanges: List<BrightnessNitRange> = List(16) { BrightnessNitRange() },
)

public data class Brushobj(
    public var iSolidColor: UInt = 0u,
    public var pvRbrush: COpaquePointer? = null,
    public var flColorType: UInt = 0u,
)

public data class CdddxgkRedirbitmappresentinfo(
    public var numDirtyRects: UInt = 0u,
    public var dirtyRect: Rect? = null,
    public var numContexts: UInt = 0u,
    public var hContext: List<COpaquePointer> = List(65) { COpaquePointer(0L) },
    public var bDoNotSynchronizeWithDxContent: Boolean = false,
)

public data class CharImageInfo(public var charInfo: CharInfo = CharInfo(), public var fontImageInfo: FontImageInfo = FontImageInfo())

public data class ChromaticityCoordinate(public var x: Float = 0.0f, public var y: Float = 0.0f)

public data class Ciechroma(public var x: Int = 0, public var y: Int = 0)

public data class Clipline(
    public var ptfxA: Pointfix = Pointfix(),
    public var ptfxB: Pointfix = Pointfix(),
    public var lStyleState: Int = 0,
    public var c: UInt = 0u,
    public var arun: List<Run> = List(1) { Run() },
)

public data class Clipobj(
    public var iUniq: UInt = 0u,
    public var rclBounds: Rectl = Rectl(),
    public var iDComplexity: UByte = 0u,
    public var iFComplexity: UByte = 0u,
    public var iMode: UByte = 0u,
    public var fjOptions: UByte = 0u,
)

public data class Colorinfo(
    public var red: Ciechroma = Ciechroma(),
    public var green: Ciechroma = Ciechroma(),
    public var blue: Ciechroma = Ciechroma(),
    public var cyan: Ciechroma = Ciechroma(),
    public var magenta: Ciechroma = Ciechroma(),
    public var yellow: Ciechroma = Ciechroma(),
    public var alignmentWhite: Ciechroma = Ciechroma(),
    public var redGamma: Int = 0,
    public var greenGamma: Int = 0,
    public var blueGamma: Int = 0,
    public var magentaInCyanDye: Int = 0,
    public var yellowInCyanDye: Int = 0,
    public var cyanInMagentaDye: Int = 0,
    public var yellowInMagentaDye: Int = 0,
    public var cyanInYellowDye: Int = 0,
    public var magentaInYellowDye: Int = 0,
)

public data class ColorspaceTransform(public var type: ColorspaceTransformType = 0, public var data: ColorspaceTransform0 = ColorspaceTransform0())

public data class ColorspaceTransform0(
    public var rgb256x3x16: GammaRampRgb256x3x16 = GammaRampRgb256x3x16(),
    public var dxgi1: GammaRampDxgi1 = GammaRampDxgi1(),
    public var t3x4: ColorspaceTransform3x4 = ColorspaceTransform3x4(),
    public var matrixV2: ColorspaceTransformMatrixV2 = ColorspaceTransformMatrixV2(),
)

public data class ColorspaceTransform1dlutCap(public var numberOfLUTEntries: UInt = 0u, public var dataCap: ColorspaceTransformDataCap = ColorspaceTransformDataCap())

public data class ColorspaceTransform3x4(
    public var colorMatrix3x4: FloatArray = FloatArray(12),
    public var scalarMultiplier: Float = 0.0f,
    public var lookupTable1D: List<GammaRampRgb> = List(4096) { GammaRampRgb() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ColorspaceTransform3x4) return false
        if (!this.colorMatrix3x4.contentEquals(other.colorMatrix3x4)) return false
        if (this.scalarMultiplier != other.scalarMultiplier) return false
        if (this.lookupTable1D != other.lookupTable1D) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.colorMatrix3x4.contentHashCode()
        result = 31 * result + this.scalarMultiplier.hashCode()
        result = 31 * result + this.lookupTable1D.hashCode()
        return result
    }
}

public data class ColorspaceTransformDataCap(
    public var dataType: ColorspaceTransformDataType = 0,
    public var anonymous: ColorspaceTransformDataCap0 = ColorspaceTransformDataCap0(),
    public var numericRangeMin: Float = 0.0f,
    public var numericRangeMax: Float = 0.0f,
)

public data class ColorspaceTransformDataCap0(
    public var anonymous1: ColorspaceTransformDataCap00 = ColorspaceTransformDataCap00(),
    public var anonymous2: ColorspaceTransformDataCap01 = ColorspaceTransformDataCap01(),
    public var value: UInt = 0u,
)

public data class ColorspaceTransformDataCap00(public var bitfield: UInt = 0u)

public data class ColorspaceTransformDataCap01(public var bitfield: UInt = 0u)

public data class ColorspaceTransformMatrixCap(public var anonymous: ColorspaceTransformMatrixCap0 = ColorspaceTransformMatrixCap0(), public var dataCap: ColorspaceTransformDataCap = ColorspaceTransformDataCap())

public data class ColorspaceTransformMatrixCap0(public var anonymous: ColorspaceTransformMatrixCap00 = ColorspaceTransformMatrixCap00(), public var value: UInt = 0u)

public data class ColorspaceTransformMatrixCap00(public var bitfield: UInt = 0u)

public data class ColorspaceTransformMatrixV2(
    public var stageControlLookupTable1DDegamma: ColorspaceTransformStageControl = 0,
    public var lookupTable1DDegamma: List<GammaRampRgb> = List(4096) { GammaRampRgb() },
    public var stageControlColorMatrix3x3: ColorspaceTransformStageControl = 0,
    public var colorMatrix3x3: FloatArray = FloatArray(9),
    public var stageControlLookupTable1DRegamma: ColorspaceTransformStageControl = 0,
    public var lookupTable1DRegamma: List<GammaRampRgb> = List(4096) { GammaRampRgb() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ColorspaceTransformMatrixV2) return false
        if (this.stageControlLookupTable1DDegamma != other.stageControlLookupTable1DDegamma) return false
        if (this.lookupTable1DDegamma != other.lookupTable1DDegamma) return false
        if (this.stageControlColorMatrix3x3 != other.stageControlColorMatrix3x3) return false
        if (!this.colorMatrix3x3.contentEquals(other.colorMatrix3x3)) return false
        if (this.stageControlLookupTable1DRegamma != other.stageControlLookupTable1DRegamma) return false
        if (this.lookupTable1DRegamma != other.lookupTable1DRegamma) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.stageControlLookupTable1DDegamma.hashCode()
        result = 31 * result + this.lookupTable1DDegamma.hashCode()
        result = 31 * result + this.stageControlColorMatrix3x3.hashCode()
        result = 31 * result + this.colorMatrix3x3.contentHashCode()
        result = 31 * result + this.stageControlLookupTable1DRegamma.hashCode()
        result = 31 * result + this.lookupTable1DRegamma.hashCode()
        return result
    }
}

public data class ColorspaceTransformSetInput(
    public var outputWireColorSpaceExpected: OutputWireColorSpaceType = 0,
    public var outputWireFormatExpected: OutputWireFormat = OutputWireFormat(),
    public var colorSpaceTransform: ColorspaceTransform = ColorspaceTransform(),
)

public data class ColorspaceTransformTargetCaps(
    public var version: ColorspaceTransformTargetCapsVersion = 0,
    public var lookupTable1DDegammaCap: ColorspaceTransform1dlutCap = ColorspaceTransform1dlutCap(),
    public var colorMatrix3x3Cap: ColorspaceTransformMatrixCap = ColorspaceTransformMatrixCap(),
    public var lookupTable1DRegammaCap: ColorspaceTransform1dlutCap = ColorspaceTransform1dlutCap(),
)

public data class Devhtadjdata(
    public var deviceFlags: UInt = 0u,
    public var deviceXDPI: UInt = 0u,
    public var deviceYDPI: UInt = 0u,
    public var pDefHTInfo: Devhtinfo? = null,
    public var pAdjHTInfo: Devhtinfo? = null,
)

public data class Devhtinfo(
    public var hTFlags: UInt = 0u,
    public var hTPatternSize: UInt = 0u,
    public var devPelsDPI: UInt = 0u,
    public var colorInfo: Colorinfo = Colorinfo(),
)

public data class Devinfo(
    public var flGraphicsCaps: UInt = 0u,
    public var lfDefaultFont: Logfontw = Logfontw(),
    public var lfAnsiVarFont: Logfontw = Logfontw(),
    public var lfAnsiFixFont: Logfontw = Logfontw(),
    public var cFonts: UInt = 0u,
    public var iDitherFormat: UInt = 0u,
    public var cxDither: UShort = 0u,
    public var cyDither: UShort = 0u,
    public var hpalDefault: Hpalette = null,
    public var flGraphicsCaps2: UInt = 0u,
)

public data class Displayconfig2dregion(public var cx: UInt = 0u, public var cy: UInt = 0u)

public data class DisplayconfigAdapterName(public var header: DisplayconfigDeviceInfoHeader = DisplayconfigDeviceInfoHeader(), public var adapterDevicePath: UShortArray = UShortArray(128)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DisplayconfigAdapterName) return false
        if (this.header != other.header) return false
        if (!this.adapterDevicePath.contentEquals(other.adapterDevicePath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.adapterDevicePath.contentHashCode()
        return result
    }
}

public data class DisplayconfigDesktopImageInfo(
    public var pathSourceSize: Pointl = Pointl(),
    public var desktopImageRegion: Rectl = Rectl(),
    public var desktopImageClip: Rectl = Rectl(),
)

public data class DisplayconfigDeviceInfoHeader(
    public var type: DisplayconfigDeviceInfoType = 0,
    public var size: UInt = 0u,
    public var adapterId: Luid = Luid(),
    public var id: UInt = 0u,
)

public data class DisplayconfigGetAdvancedColorInfo(
    public var header: DisplayconfigDeviceInfoHeader = DisplayconfigDeviceInfoHeader(),
    public var anonymous: DisplayconfigGetAdvancedColorInfo0 = DisplayconfigGetAdvancedColorInfo0(),
    public var colorEncoding: DisplayconfigColorEncoding = 0,
    public var bitsPerColorChannel: UInt = 0u,
)

public data class DisplayconfigGetAdvancedColorInfo0(public var anonymous: DisplayconfigGetAdvancedColorInfo00 = DisplayconfigGetAdvancedColorInfo00(), public var value: UInt = 0u)

public data class DisplayconfigGetAdvancedColorInfo00(public var bitfield: UInt = 0u)

public data class DisplayconfigGetMonitorSpecialization(public var header: DisplayconfigDeviceInfoHeader = DisplayconfigDeviceInfoHeader(), public var anonymous: DisplayconfigGetMonitorSpecialization0 = DisplayconfigGetMonitorSpecialization0())

public data class DisplayconfigGetMonitorSpecialization0(public var anonymous: DisplayconfigGetMonitorSpecialization00 = DisplayconfigGetMonitorSpecialization00(), public var value: UInt = 0u)

public data class DisplayconfigGetMonitorSpecialization00(public var bitfield: UInt = 0u)

public data class DisplayconfigModeInfo(
    public var infoType: DisplayconfigModeInfoType = 0,
    public var id: UInt = 0u,
    public var adapterId: Luid = Luid(),
    public var anonymous: DisplayconfigModeInfo0 = DisplayconfigModeInfo0(),
)

public data class DisplayconfigModeInfo0(
    public var targetMode: DisplayconfigTargetMode = DisplayconfigTargetMode(),
    public var sourceMode: DisplayconfigSourceMode = DisplayconfigSourceMode(),
    public var desktopImageInfo: DisplayconfigDesktopImageInfo = DisplayconfigDesktopImageInfo(),
)

public data class DisplayconfigPathInfo(
    public var sourceInfo: DisplayconfigPathSourceInfo = DisplayconfigPathSourceInfo(),
    public var targetInfo: DisplayconfigPathTargetInfo = DisplayconfigPathTargetInfo(),
    public var flags: UInt = 0u,
)

public data class DisplayconfigPathSourceInfo(
    public var adapterId: Luid = Luid(),
    public var id: UInt = 0u,
    public var anonymous: DisplayconfigPathSourceInfo0 = DisplayconfigPathSourceInfo0(),
    public var statusFlags: UInt = 0u,
)

public data class DisplayconfigPathSourceInfo0(public var modeInfoIdx: UInt = 0u, public var anonymous: DisplayconfigPathSourceInfo00 = DisplayconfigPathSourceInfo00())

public data class DisplayconfigPathSourceInfo00(public var bitfield: UInt = 0u)

public data class DisplayconfigPathTargetInfo(
    public var adapterId: Luid = Luid(),
    public var id: UInt = 0u,
    public var anonymous: DisplayconfigPathTargetInfo0 = DisplayconfigPathTargetInfo0(),
    public var outputTechnology: DisplayconfigVideoOutputTechnology = 0,
    public var rotation: DisplayconfigRotation = 0,
    public var scaling: DisplayconfigScaling = 0,
    public var refreshRate: DisplayconfigRational = DisplayconfigRational(),
    public var scanLineOrdering: DisplayconfigScanlineOrdering = 0,
    public var targetAvailable: Bool = 0,
    public var statusFlags: UInt = 0u,
)

public data class DisplayconfigPathTargetInfo0(public var modeInfoIdx: UInt = 0u, public var anonymous: DisplayconfigPathTargetInfo00 = DisplayconfigPathTargetInfo00())

public data class DisplayconfigPathTargetInfo00(public var bitfield: UInt = 0u)

public data class DisplayconfigRational(public var numerator: UInt = 0u, public var denominator: UInt = 0u)

public data class DisplayconfigSdrWhiteLevel(public var header: DisplayconfigDeviceInfoHeader = DisplayconfigDeviceInfoHeader(), public var sDRWhiteLevel: UInt = 0u)

public data class DisplayconfigSetAdvancedColorState(public var header: DisplayconfigDeviceInfoHeader = DisplayconfigDeviceInfoHeader(), public var anonymous: DisplayconfigSetAdvancedColorState0 = DisplayconfigSetAdvancedColorState0())

public data class DisplayconfigSetAdvancedColorState0(public var anonymous: DisplayconfigSetAdvancedColorState00 = DisplayconfigSetAdvancedColorState00(), public var value: UInt = 0u)

public data class DisplayconfigSetAdvancedColorState00(public var bitfield: UInt = 0u)

public data class DisplayconfigSetMonitorSpecialization(
    public var header: DisplayconfigDeviceInfoHeader = DisplayconfigDeviceInfoHeader(),
    public var anonymous: DisplayconfigSetMonitorSpecialization0 = DisplayconfigSetMonitorSpecialization0(),
    public var specializationType: Guid = Guid(),
    public var specializationSubType: Guid = Guid(),
    public var specializationApplicationName: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DisplayconfigSetMonitorSpecialization) return false
        if (this.header != other.header) return false
        if (this.anonymous != other.anonymous) return false
        if (this.specializationType != other.specializationType) return false
        if (this.specializationSubType != other.specializationSubType) return false
        if (!this.specializationApplicationName.contentEquals(other.specializationApplicationName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.anonymous.hashCode()
        result = 31 * result + this.specializationType.hashCode()
        result = 31 * result + this.specializationSubType.hashCode()
        result = 31 * result + this.specializationApplicationName.contentHashCode()
        return result
    }
}

public data class DisplayconfigSetMonitorSpecialization0(public var anonymous: DisplayconfigSetMonitorSpecialization00 = DisplayconfigSetMonitorSpecialization00(), public var value: UInt = 0u)

public data class DisplayconfigSetMonitorSpecialization00(public var bitfield: UInt = 0u)

public data class DisplayconfigSetTargetPersistence(public var header: DisplayconfigDeviceInfoHeader = DisplayconfigDeviceInfoHeader(), public var anonymous: DisplayconfigSetTargetPersistence0 = DisplayconfigSetTargetPersistence0())

public data class DisplayconfigSetTargetPersistence0(public var anonymous: DisplayconfigSetTargetPersistence00 = DisplayconfigSetTargetPersistence00(), public var value: UInt = 0u)

public data class DisplayconfigSetTargetPersistence00(public var bitfield: UInt = 0u)

public data class DisplayconfigSourceDeviceName(public var header: DisplayconfigDeviceInfoHeader = DisplayconfigDeviceInfoHeader(), public var viewGdiDeviceName: UShortArray = UShortArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DisplayconfigSourceDeviceName) return false
        if (this.header != other.header) return false
        if (!this.viewGdiDeviceName.contentEquals(other.viewGdiDeviceName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.viewGdiDeviceName.contentHashCode()
        return result
    }
}

public data class DisplayconfigSourceMode(
    public var width: UInt = 0u,
    public var height: UInt = 0u,
    public var pixelFormat: DisplayconfigPixelformat = 0,
    public var position: Pointl = Pointl(),
)

public data class DisplayconfigSupportVirtualResolution(public var header: DisplayconfigDeviceInfoHeader = DisplayconfigDeviceInfoHeader(), public var anonymous: DisplayconfigSupportVirtualResolution0 = DisplayconfigSupportVirtualResolution0())

public data class DisplayconfigSupportVirtualResolution0(public var anonymous: DisplayconfigSupportVirtualResolution00 = DisplayconfigSupportVirtualResolution00(), public var value: UInt = 0u)

public data class DisplayconfigSupportVirtualResolution00(public var bitfield: UInt = 0u)

public data class DisplayconfigTargetBaseType(public var header: DisplayconfigDeviceInfoHeader = DisplayconfigDeviceInfoHeader(), public var baseOutputTechnology: DisplayconfigVideoOutputTechnology = 0)

public data class DisplayconfigTargetDeviceName(
    public var header: DisplayconfigDeviceInfoHeader = DisplayconfigDeviceInfoHeader(),
    public var flags: DisplayconfigTargetDeviceNameFlags = DisplayconfigTargetDeviceNameFlags(),
    public var outputTechnology: DisplayconfigVideoOutputTechnology = 0,
    public var edidManufactureId: UShort = 0u,
    public var edidProductCodeId: UShort = 0u,
    public var connectorInstance: UInt = 0u,
    public var monitorFriendlyDeviceName: UShortArray = UShortArray(64),
    public var monitorDevicePath: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DisplayconfigTargetDeviceName) return false
        if (this.header != other.header) return false
        if (this.flags != other.flags) return false
        if (this.outputTechnology != other.outputTechnology) return false
        if (this.edidManufactureId != other.edidManufactureId) return false
        if (this.edidProductCodeId != other.edidProductCodeId) return false
        if (this.connectorInstance != other.connectorInstance) return false
        if (!this.monitorFriendlyDeviceName.contentEquals(other.monitorFriendlyDeviceName)) return false
        if (!this.monitorDevicePath.contentEquals(other.monitorDevicePath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.outputTechnology.hashCode()
        result = 31 * result + this.edidManufactureId.hashCode()
        result = 31 * result + this.edidProductCodeId.hashCode()
        result = 31 * result + this.connectorInstance.hashCode()
        result = 31 * result + this.monitorFriendlyDeviceName.contentHashCode()
        result = 31 * result + this.monitorDevicePath.contentHashCode()
        return result
    }
}

public data class DisplayconfigTargetDeviceNameFlags(public var anonymous: DisplayconfigTargetDeviceNameFlags0 = DisplayconfigTargetDeviceNameFlags0())

public data class DisplayconfigTargetDeviceNameFlags0(public var anonymous: DisplayconfigTargetDeviceNameFlags00 = DisplayconfigTargetDeviceNameFlags00(), public var value: UInt = 0u)

public data class DisplayconfigTargetDeviceNameFlags00(public var bitfield: UInt = 0u)

public data class DisplayconfigTargetMode(public var targetVideoSignalInfo: DisplayconfigVideoSignalInfo = DisplayconfigVideoSignalInfo())

public data class DisplayconfigTargetPreferredMode(
    public var header: DisplayconfigDeviceInfoHeader = DisplayconfigDeviceInfoHeader(),
    public var width: UInt = 0u,
    public var height: UInt = 0u,
    public var targetMode: DisplayconfigTargetMode = DisplayconfigTargetMode(),
)

public data class DisplayconfigVideoSignalInfo(
    public var pixelRate: ULong = 0uL,
    public var hSyncFreq: DisplayconfigRational = DisplayconfigRational(),
    public var vSyncFreq: DisplayconfigRational = DisplayconfigRational(),
    public var activeSize: Displayconfig2dregion = Displayconfig2dregion(),
    public var totalSize: Displayconfig2dregion = Displayconfig2dregion(),
    public var anonymous: DisplayconfigVideoSignalInfo0 = DisplayconfigVideoSignalInfo0(),
    public var scanLineOrdering: DisplayconfigScanlineOrdering = 0,
)

public data class DisplayconfigVideoSignalInfo0(public var additionalSignalInfo: DisplayconfigVideoSignalInfo00 = DisplayconfigVideoSignalInfo00(), public var videoStandard: UInt = 0u)

public data class DisplayconfigVideoSignalInfo00(public var bitfield: UInt = 0u)

public data class DisplayBrightness(
    public var ucDisplayPolicy: UByte = 0u,
    public var ucACBrightness: UByte = 0u,
    public var ucDCBrightness: UByte = 0u,
)

public data class DrhApibitmapdata(public var pso: Surfobj? = null, public var b: Bool = 0)

public data class Driverobj(
    public var pvObj: COpaquePointer? = null,
    public var pFreeProc: Freeobjproc = null,
    public var hdev: Hdev = null,
    public var dhpdev: Dhpdev = null,
)

public data class Drvenabledata(
    public var iDriverVersion: UInt = 0u,
    public var c: UInt = 0u,
    public var pdrvfn: Drvfn? = null,
)

public data class Drvfn(public var iFunc: UInt = 0u, public var pfn: Pfn = null)

public data class DxgkWin32kParamData(
    public var pathsArray: COpaquePointer? = null,
    public var modesArray: COpaquePointer? = null,
    public var numPathArrayElements: UInt = 0u,
    public var numModeArrayElements: UInt = 0u,
    public var sDCFlags: UInt = 0u,
)

public data class DisplayMode(public var deviceName: UShortArray = UShortArray(32), public var devMode: Devmodew = Devmodew()) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DisplayMode) return false
        if (!this.deviceName.contentEquals(other.deviceName)) return false
        if (this.devMode != other.devMode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.deviceName.contentHashCode()
        result = 31 * result + this.devMode.hashCode()
        return result
    }
}

public data class DisplayModes(public var numDisplayModes: Int = 0, public var displayMode: List<DisplayMode> = List(1) { DisplayMode() })

public data class Emfinfo(
    public var nSize: UInt = 0u,
    public var hdc: Hdc = null,
    public var pvEMF: COpaquePointer? = null,
    public var pvCurrentRecord: COpaquePointer? = null,
)

public data class Engsafesemaphore(public var hsem: Hsemaphore = null, public var lCount: Int = 0)

public data class EngEvent(public var pKEvent: COpaquePointer? = null, public var fFlags: UInt = 0u)

public data class EngTimeFields(
    public var usYear: UShort = 0u,
    public var usMonth: UShort = 0u,
    public var usDay: UShort = 0u,
    public var usHour: UShort = 0u,
    public var usMinute: UShort = 0u,
    public var usSecond: UShort = 0u,
    public var usMilliseconds: UShort = 0u,
    public var usWeekday: UShort = 0u,
)

public data class Enumrects(public var c: UInt = 0u, public var arcl: List<Rectl> = List(1) { Rectl() })

public class FdDevicemetrics(
    public var flRealizedType: UInt = 0u,
    public var pteBase: Pointe = Pointe(),
    public var pteSide: Pointe = Pointe(),
    public var lD: Int = 0,
    public var fxMaxAscender: Int = 0,
    public var fxMaxDescender: Int = 0,
    public var ptlUnderline1: Pointl = Pointl(),
    public var ptlStrikeOut: Pointl = Pointl(),
    public var ptlULThickness: Pointl = Pointl(),
    public var ptlSOThickness: Pointl = Pointl(),
    public var cxMax: UInt = 0u,
    public var cyMax: UInt = 0u,
    public var cjGlyphMax: UInt = 0u,
    public var fdxQuantized: FdXform = FdXform(),
    public var lNonLinearExtLeading: Int = 0,
    public var lNonLinearIntLeading: Int = 0,
    public var lNonLinearMaxCharWidth: Int = 0,
    public var lNonLinearAvgCharWidth: Int = 0,
    public var lMinA: Int = 0,
    public var lMinC: Int = 0,
    public var lMinD: Int = 0,
    public var alReserved: IntArray = IntArray(1),
)

public data class FdGlyphattr(
    public var cjThis: UInt = 0u,
    public var cGlyphs: UInt = 0u,
    public var iMode: UInt = 0u,
    public var aGlyphAttr: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FdGlyphattr) return false
        if (this.cjThis != other.cjThis) return false
        if (this.cGlyphs != other.cGlyphs) return false
        if (this.iMode != other.iMode) return false
        if (!this.aGlyphAttr.contentEquals(other.aGlyphAttr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cjThis.hashCode()
        result = 31 * result + this.cGlyphs.hashCode()
        result = 31 * result + this.iMode.hashCode()
        result = 31 * result + this.aGlyphAttr.contentHashCode()
        return result
    }
}

public data class FdGlyphset(
    public var cjThis: UInt = 0u,
    public var flAccel: UInt = 0u,
    public var cGlyphsSupported: UInt = 0u,
    public var cRuns: UInt = 0u,
    public var awcrun: List<Wcrun> = List(1) { Wcrun() },
)

public data class FdKerningpair(
    public var wcFirst: UShort = 0u,
    public var wcSecond: UShort = 0u,
    public var fwdKern: Short = 0,
)

public data class FdLigature(
    public var culThis: UInt = 0u,
    public var ulType: UInt = 0u,
    public var cLigatures: UInt = 0u,
    public var alig: List<Ligature> = List(1) { Ligature() },
)

public data class FdXform(
    public var eXX: Float = 0.0f,
    public var eXY: Float = 0.0f,
    public var eYX: Float = 0.0f,
    public var eYY: Float = 0.0f,
)

public data class FloatobjXform(
    public var eM11: Float = 0.0f,
    public var eM12: Float = 0.0f,
    public var eM21: Float = 0.0f,
    public var eM22: Float = 0.0f,
    public var eDx: Float = 0.0f,
    public var eDy: Float = 0.0f,
)

public data class FloatLong(public var e: Float = 0.0f, public var l: Int = 0)

public data class Fontdiff(
    public var jReserved1: UByte = 0u,
    public var jReserved2: UByte = 0u,
    public var jReserved3: UByte = 0u,
    public var bWeight: UByte = 0u,
    public var usWinWeight: UShort = 0u,
    public var fsSelection: UShort = 0u,
    public var fwdAveCharWidth: Short = 0,
    public var fwdMaxCharInc: Short = 0,
    public var ptlCaret: Pointl = Pointl(),
)

public data class Fontinfo(
    public var cjThis: UInt = 0u,
    public var flCaps: UInt = 0u,
    public var cGlyphsSupported: UInt = 0u,
    public var cjMaxGlyph1: UInt = 0u,
    public var cjMaxGlyph4: UInt = 0u,
    public var cjMaxGlyph8: UInt = 0u,
    public var cjMaxGlyph32: UInt = 0u,
)

public data class Fontobj(
    public var iUniq: UInt = 0u,
    public var iFace: UInt = 0u,
    public var cxMax: UInt = 0u,
    public var flFontType: UInt = 0u,
    public var iTTUniq: Int = 0,
    public var iFile: Int = 0,
    public var sizLogResPpi: Size = Size(),
    public var ulStyleSize: UInt = 0u,
    public var pvConsumer: COpaquePointer? = null,
    public var pvProducer: COpaquePointer? = null,
)

public data class Fontsim(
    public var dpBold: Int = 0,
    public var dpItalic: Int = 0,
    public var dpBoldItalic: Int = 0,
)

public data class FontImageInfo(public var fontSize: Coord = Coord(), public var imageBits: COpaquePointer? = null)

public data class FscntlScreenInfo(
    public var position: Coord = Coord(),
    public var screenSize: Coord = Coord(),
    public var nNumberOfChars: UInt = 0u,
)

public data class FsvideoCopyFrameBuffer(public var srcScreen: FscntlScreenInfo = FscntlScreenInfo(), public var destScreen: FscntlScreenInfo = FscntlScreenInfo())

public data class FsvideoCursorPosition(public var coord: VideoCursorPosition = VideoCursorPosition(), public var dwType: UInt = 0u)

public data class FsvideoModeInformation(public var videoMode: VideoModeInformation = VideoModeInformation(), public var videoMemory: VideoMemoryInformation = VideoMemoryInformation())

public data class FsvideoReverseMousePointer(public var screen: FscntlScreenInfo = FscntlScreenInfo(), public var dwType: UInt = 0u)

public data class FsvideoScreenInformation(public var screenSize: Coord = Coord(), public var fontSize: Coord = Coord())

public data class FsvideoWriteToFrameBuffer(public var srcBuffer: CharImageInfo? = null, public var destScreen: FscntlScreenInfo = FscntlScreenInfo())

public data class Gammaramp(
    public var red: UShortArray = UShortArray(256),
    public var green: UShortArray = UShortArray(256),
    public var blue: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Gammaramp) return false
        if (!this.red.contentEquals(other.red)) return false
        if (!this.green.contentEquals(other.green)) return false
        if (!this.blue.contentEquals(other.blue)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.red.contentHashCode()
        result = 31 * result + this.green.contentHashCode()
        result = 31 * result + this.blue.contentHashCode()
        return result
    }
}

public data class GammaRampDxgi1(
    public var scale: GammaRampRgb = GammaRampRgb(),
    public var offset: GammaRampRgb = GammaRampRgb(),
    public var gammaCurve: List<GammaRampRgb> = List(1025) { GammaRampRgb() },
)

public data class GammaRampRgb(
    public var red: Float = 0.0f,
    public var green: Float = 0.0f,
    public var blue: Float = 0.0f,
)

public data class GammaRampRgb256x3x16(
    public var red: UShortArray = UShortArray(256),
    public var green: UShortArray = UShortArray(256),
    public var blue: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GammaRampRgb256x3x16) return false
        if (!this.red.contentEquals(other.red)) return false
        if (!this.green.contentEquals(other.green)) return false
        if (!this.blue.contentEquals(other.blue)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.red.contentHashCode()
        result = 31 * result + this.green.contentHashCode()
        result = 31 * result + this.blue.contentHashCode()
        return result
    }
}

public class Gdiinfo(
    public var ulVersion: UInt = 0u,
    public var ulTechnology: UInt = 0u,
    public var ulHorzSize: UInt = 0u,
    public var ulVertSize: UInt = 0u,
    public var ulHorzRes: UInt = 0u,
    public var ulVertRes: UInt = 0u,
    public var cBitsPixel: UInt = 0u,
    public var cPlanes: UInt = 0u,
    public var ulNumColors: UInt = 0u,
    public var flRaster: UInt = 0u,
    public var ulLogPixelsX: UInt = 0u,
    public var ulLogPixelsY: UInt = 0u,
    public var flTextCaps: UInt = 0u,
    public var ulDACRed: UInt = 0u,
    public var ulDACGreen: UInt = 0u,
    public var ulDACBlue: UInt = 0u,
    public var ulAspectX: UInt = 0u,
    public var ulAspectY: UInt = 0u,
    public var ulAspectXY: UInt = 0u,
    public var xStyleStep: Int = 0,
    public var yStyleStep: Int = 0,
    public var denStyleStep: Int = 0,
    public var ptlPhysOffset: Pointl = Pointl(),
    public var szlPhysSize: Size = Size(),
    public var ulNumPalReg: UInt = 0u,
    public var ciDevice: Colorinfo = Colorinfo(),
    public var ulDevicePelsDPI: UInt = 0u,
    public var ulPrimaryOrder: UInt = 0u,
    public var ulHTPatternSize: UInt = 0u,
    public var ulHTOutputFormat: UInt = 0u,
    public var flHTFlags: UInt = 0u,
    public var ulVRefresh: UInt = 0u,
    public var ulBltAlignment: UInt = 0u,
    public var ulPanningHorzRes: UInt = 0u,
    public var ulPanningVertRes: UInt = 0u,
    public var xPanningAlignment: UInt = 0u,
    public var yPanningAlignment: UInt = 0u,
    public var cxHTPat: UInt = 0u,
    public var cyHTPat: UInt = 0u,
    public var pHTPatA: COpaquePointer? = null,
    public var pHTPatB: COpaquePointer? = null,
    public var pHTPatC: COpaquePointer? = null,
    public var flShadeBlend: UInt = 0u,
    public var ulPhysicalPixelCharacteristics: UInt = 0u,
    public var ulPhysicalPixelGamma: UInt = 0u,
)

public data class Glyphbits(
    public var ptlOrigin: Pointl = Pointl(),
    public var sizlBitmap: Size = Size(),
    public var aj: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Glyphbits) return false
        if (this.ptlOrigin != other.ptlOrigin) return false
        if (this.sizlBitmap != other.sizlBitmap) return false
        if (!this.aj.contentEquals(other.aj)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ptlOrigin.hashCode()
        result = 31 * result + this.sizlBitmap.hashCode()
        result = 31 * result + this.aj.contentHashCode()
        return result
    }
}

public data class Glyphdata(
    public var gdf: Glyphdef = Glyphdef(),
    public var hg: UInt = 0u,
    public var fxD: Int = 0,
    public var fxA: Int = 0,
    public var fxAB: Int = 0,
    public var fxInkTop: Int = 0,
    public var fxInkBottom: Int = 0,
    public var rclInk: Rectl = Rectl(),
    public var ptqD: Pointqf = Pointqf(),
)

public data class Glyphdef(public var pgb: Glyphbits? = null, public var ppo: Pathobj? = null)

public data class Glyphpos(
    public var hg: UInt = 0u,
    public var pgdf: Glyphdef? = null,
    public var ptl: Pointl = Pointl(),
)

public data class Ifiextra(
    public var ulIdentifier: UInt = 0u,
    public var dpFontSig: Int = 0,
    public var cig: UInt = 0u,
    public var dpDesignVector: Int = 0,
    public var dpAxesInfoW: Int = 0,
    public var aulReserved: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ifiextra) return false
        if (this.ulIdentifier != other.ulIdentifier) return false
        if (this.dpFontSig != other.dpFontSig) return false
        if (this.cig != other.cig) return false
        if (this.dpDesignVector != other.dpDesignVector) return false
        if (this.dpAxesInfoW != other.dpAxesInfoW) return false
        if (!this.aulReserved.contentEquals(other.aulReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulIdentifier.hashCode()
        result = 31 * result + this.dpFontSig.hashCode()
        result = 31 * result + this.cig.hashCode()
        result = 31 * result + this.dpDesignVector.hashCode()
        result = 31 * result + this.dpAxesInfoW.hashCode()
        result = 31 * result + this.aulReserved.contentHashCode()
        return result
    }
}

public class Ifimetrics(
    public var cjThis: UInt = 0u,
    public var cjIfiExtra: UInt = 0u,
    public var dpwszFamilyName: Int = 0,
    public var dpwszStyleName: Int = 0,
    public var dpwszFaceName: Int = 0,
    public var dpwszUniqueName: Int = 0,
    public var dpFontSim: Int = 0,
    public var lEmbedId: Int = 0,
    public var lItalicAngle: Int = 0,
    public var lCharBias: Int = 0,
    public var dpCharSets: Int = 0,
    public var jWinCharSet: UByte = 0u,
    public var jWinPitchAndFamily: UByte = 0u,
    public var usWinWeight: UShort = 0u,
    public var flInfo: UInt = 0u,
    public var fsSelection: UShort = 0u,
    public var fsType: UShort = 0u,
    public var fwdUnitsPerEm: Short = 0,
    public var fwdLowestPPEm: Short = 0,
    public var fwdWinAscender: Short = 0,
    public var fwdWinDescender: Short = 0,
    public var fwdMacAscender: Short = 0,
    public var fwdMacDescender: Short = 0,
    public var fwdMacLineGap: Short = 0,
    public var fwdTypoAscender: Short = 0,
    public var fwdTypoDescender: Short = 0,
    public var fwdTypoLineGap: Short = 0,
    public var fwdAveCharWidth: Short = 0,
    public var fwdMaxCharInc: Short = 0,
    public var fwdCapHeight: Short = 0,
    public var fwdXHeight: Short = 0,
    public var fwdSubscriptXSize: Short = 0,
    public var fwdSubscriptYSize: Short = 0,
    public var fwdSubscriptXOffset: Short = 0,
    public var fwdSubscriptYOffset: Short = 0,
    public var fwdSuperscriptXSize: Short = 0,
    public var fwdSuperscriptYSize: Short = 0,
    public var fwdSuperscriptXOffset: Short = 0,
    public var fwdSuperscriptYOffset: Short = 0,
    public var fwdUnderscoreSize: Short = 0,
    public var fwdUnderscorePosition: Short = 0,
    public var fwdStrikeoutSize: Short = 0,
    public var fwdStrikeoutPosition: Short = 0,
    public var chFirstChar: UByte = 0u,
    public var chLastChar: UByte = 0u,
    public var chDefaultChar: UByte = 0u,
    public var chBreakChar: UByte = 0u,
    public var wcFirstChar: UShort = 0u,
    public var wcLastChar: UShort = 0u,
    public var wcDefaultChar: UShort = 0u,
    public var wcBreakChar: UShort = 0u,
    public var ptlBaseline: Pointl = Pointl(),
    public var ptlAspect: Pointl = Pointl(),
    public var ptlCaret: Pointl = Pointl(),
    public var rclFontBox: Rectl = Rectl(),
    public var achVendId: UByteArray = UByteArray(4),
    public var cKerningPairs: UInt = 0u,
    public var ulPanoseCulture: UInt = 0u,
    public var panose: Panose = Panose(),
    public var align: COpaquePointer? = null,
)

public data class IndirectDisplayInfo(
    public var displayAdapterLuid: Luid = Luid(),
    public var flags: UInt = 0u,
    public var numMonitors: UInt = 0u,
    public var displayAdapterTargetBase: UInt = 0u,
)

public data class Ligature(
    public var culSize: UInt = 0u,
    public var pwsz: Pwstr = null,
    public var chglyph: UInt = 0u,
    public var ahglyph: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ligature) return false
        if (this.culSize != other.culSize) return false
        if (this.pwsz != other.pwsz) return false
        if (this.chglyph != other.chglyph) return false
        if (!this.ahglyph.contentEquals(other.ahglyph)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.culSize.hashCode()
        result = 31 * result + this.pwsz.hashCode()
        result = 31 * result + this.chglyph.hashCode()
        result = 31 * result + this.ahglyph.contentHashCode()
        return result
    }
}

public data class Lineattrs(
    public var fl: UInt = 0u,
    public var iJoin: UInt = 0u,
    public var iEndCap: UInt = 0u,
    public var elWidth: FloatLong = FloatLong(),
    public var eMiterLimit: Float = 0.0f,
    public var cstyle: UInt = 0u,
    public var pstyle: FloatLong? = null,
    public var elStyleState: FloatLong = FloatLong(),
)

public data class McTimingReport(
    public var dwHorizontalFrequencyInHZ: UInt = 0u,
    public var dwVerticalFrequencyInHZ: UInt = 0u,
    public var bTimingStatusByte: UByte = 0u,
)

public class MipiDsiCaps(
    public var dSITypeMajor: UByte = 0u,
    public var dSITypeMinor: UByte = 0u,
    public var specVersionMajor: UByte = 0u,
    public var specVersionMinor: UByte = 0u,
    public var specVersionPatch: UByte = 0u,
    public var targetMaximumReturnPacketSize: UShort = 0u,
    public var resultCodeFlags: UByte = 0u,
    public var resultCodeStatus: UByte = 0u,
    public var revision: UByte = 0u,
    public var level: UByte = 0u,
    public var deviceClassHi: UByte = 0u,
    public var deviceClassLo: UByte = 0u,
    public var manufacturerHi: UByte = 0u,
    public var manufacturerLo: UByte = 0u,
    public var productHi: UByte = 0u,
    public var productLo: UByte = 0u,
    public var lengthHi: UByte = 0u,
    public var lengthLo: UByte = 0u,
)

public data class MipiDsiPacket(
    public var anonymous1: MipiDsiPacket0 = MipiDsiPacket0(),
    public var anonymous2: MipiDsiPacket1 = MipiDsiPacket1(),
    public var eccFiller: UByte = 0u,
    public var payload: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MipiDsiPacket) return false
        if (this.anonymous1 != other.anonymous1) return false
        if (this.anonymous2 != other.anonymous2) return false
        if (this.eccFiller != other.eccFiller) return false
        if (!this.payload.contentEquals(other.payload)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.anonymous1.hashCode()
        result = 31 * result + this.anonymous2.hashCode()
        result = 31 * result + this.eccFiller.hashCode()
        result = 31 * result + this.payload.contentHashCode()
        return result
    }
}

public data class MipiDsiPacket0(public var dataId: UByte = 0u, public var anonymous: MipiDsiPacket00 = MipiDsiPacket00())

public data class MipiDsiPacket00(public var bitfield: UByte = 0u)

public data class MipiDsiPacket1(public var anonymous: MipiDsiPacket10 = MipiDsiPacket10(), public var longWriteWordCount: UShort = 0u)

public data class MipiDsiPacket10(public var data0: UByte = 0u, public var data1: UByte = 0u)

public data class MipiDsiReset(public var flags: UInt = 0u, public var anonymous: MipiDsiReset0 = MipiDsiReset0())

public data class MipiDsiReset0(public var anonymous: MipiDsiReset00 = MipiDsiReset00(), public var results: UInt = 0u)

public data class MipiDsiReset00(public var bitfield: UInt = 0u)

public data class MipiDsiTransmission(
    public var totalBufferSize: UInt = 0u,
    public var packetCount: UByte = 0u,
    public var failedPacket: UByte = 0u,
    public var anonymous: MipiDsiTransmission0 = MipiDsiTransmission0(),
    public var readWordCount: UShort = 0u,
    public var finalCommandExtraPayload: UShort = 0u,
    public var mipiErrors: UShort = 0u,
    public var hostErrors: UShort = 0u,
    public var packets: List<MipiDsiPacket> = List(1) { MipiDsiPacket() },
)

public data class MipiDsiTransmission0(public var bitfield: UShort = 0u)

public data class OutputWireFormat(public var colorEncoding: OutputColorEncoding = 0, public var bitsPerPixel: UInt = 0u)

public data class Palobj(public var ulReserved: UInt = 0u)

public data class PanelBrightnessSensorData(
    public var anonymous: PanelBrightnessSensorData0 = PanelBrightnessSensorData0(),
    public var alsReading: Float = 0.0f,
    public var chromaticityCoordinate: ChromaticityCoordinate = ChromaticityCoordinate(),
    public var colorTemperature: Float = 0.0f,
)

public data class PanelBrightnessSensorData0(public var anonymous: PanelBrightnessSensorData00 = PanelBrightnessSensorData00(), public var value: UInt = 0u)

public data class PanelBrightnessSensorData00(public var bitfield: UInt = 0u)

public data class PanelGetBacklightReduction(
    public var backlightUsersetting: UShort = 0u,
    public var backlightEffective: UShort = 0u,
    public var gammaRamp: BacklightReductionGammaRamp = BacklightReductionGammaRamp(),
)

public data class PanelGetBrightness(public var version: BrightnessInterfaceVersion = 0, public var anonymous: PanelGetBrightness0 = PanelGetBrightness0())

public data class PanelGetBrightness0(public var level: UByte = 0u, public var anonymous: PanelGetBrightness00 = PanelGetBrightness00())

public data class PanelGetBrightness00(public var currentInMillinits: UInt = 0u, public var targetInMillinits: UInt = 0u)

public data class PanelQueryBrightnessCaps(public var version: BrightnessInterfaceVersion = 0, public var anonymous: PanelQueryBrightnessCaps0 = PanelQueryBrightnessCaps0())

public data class PanelQueryBrightnessCaps0(public var anonymous: PanelQueryBrightnessCaps00 = PanelQueryBrightnessCaps00(), public var value: UInt = 0u)

public data class PanelQueryBrightnessCaps00(public var bitfield: UInt = 0u)

public data class PanelQueryBrightnessRanges(public var version: BrightnessInterfaceVersion = 0, public var anonymous: PanelQueryBrightnessRanges0 = PanelQueryBrightnessRanges0())

public data class PanelQueryBrightnessRanges0(public var brightnessLevel: BrightnessLevel = BrightnessLevel(), public var nitRanges: BrightnessNitRanges = BrightnessNitRanges())

public data class PanelSetBacklightOptimization(public var level: BacklightOptimizationLevel = 0)

public data class PanelSetBrightness(public var version: BrightnessInterfaceVersion = 0, public var anonymous: PanelSetBrightness0 = PanelSetBrightness0())

public data class PanelSetBrightness0(public var level: UByte = 0u, public var anonymous: PanelSetBrightness00 = PanelSetBrightness00())

public data class PanelSetBrightness00(
    public var millinits: UInt = 0u,
    public var transitionTimeInMs: UInt = 0u,
    public var sensorData: PanelBrightnessSensorData = PanelBrightnessSensorData(),
)

public data class PanelSetBrightnessState(public var anonymous: PanelSetBrightnessState0 = PanelSetBrightnessState0())

public data class PanelSetBrightnessState0(public var anonymous: PanelSetBrightnessState00 = PanelSetBrightnessState00(), public var value: UInt = 0u)

public data class PanelSetBrightnessState00(public var bitfield: UInt = 0u)

public data class Pathdata(
    public var flags: UInt = 0u,
    public var count: UInt = 0u,
    public var pptfx: Pointfix? = null,
)

public data class Pathobj(public var fl: UInt = 0u, public var cCurves: UInt = 0u)

public data class Perbandinfo(
    public var bRepeatThisBand: Bool = 0,
    public var szlBand: Size = Size(),
    public var ulHorzRes: UInt = 0u,
    public var ulVertRes: UInt = 0u,
)

public data class PhysicalMonitor(public var hPhysicalMonitor: Handle = null, public var szPhysicalMonitorDescription: UShortArray = UShortArray(128)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PhysicalMonitor) return false
        if (this.hPhysicalMonitor != other.hPhysicalMonitor) return false
        if (!this.szPhysicalMonitorDescription.contentEquals(other.szPhysicalMonitorDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hPhysicalMonitor.hashCode()
        result = 31 * result + this.szPhysicalMonitorDescription.contentHashCode()
        return result
    }
}

public data class Pointe(public var x: Float = 0.0f, public var y: Float = 0.0f)

public data class Pointfix(public var x: Int = 0, public var y: Int = 0)

public data class Pointqf(public var x: Long = 0L, public var y: Long = 0L)

public data class Rectfx(
    public var xLeft: Int = 0,
    public var yTop: Int = 0,
    public var xRight: Int = 0,
    public var yBottom: Int = 0,
)

public data class Run(public var iStart: Int = 0, public var iStop: Int = 0)

public data class SetActiveColorProfileName(public var colorProfileName: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SetActiveColorProfileName) return false
        if (!this.colorProfileName.contentEquals(other.colorProfileName)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.colorProfileName.contentHashCode()
    }
}

public data class Strobj(
    public var cGlyphs: UInt = 0u,
    public var flAccel: UInt = 0u,
    public var ulCharInc: UInt = 0u,
    public var rclBkGround: Rectl = Rectl(),
    public var pgp: Glyphpos? = null,
    public var pwszOrg: Pwstr = null,
)

public data class Surfobj(
    public var dhsurf: Dhsurf = null,
    public var hsurf: Hsurf = null,
    public var dhpdev: Dhpdev = null,
    public var hdev: Hdev = null,
    public var sizlBitmap: Size = Size(),
    public var cjBits: UInt = 0u,
    public var pvBits: COpaquePointer? = null,
    public var pvScan0: COpaquePointer? = null,
    public var lDelta: Int = 0,
    public var iUniq: UInt = 0u,
    public var iBitmapFormat: UInt = 0u,
    public var iType: UShort = 0u,
    public var fjBitmap: UShort = 0u,
)

public data class Sources(
    public var sourceId: UInt = 0u,
    public var numTargets: Int = 0,
    public var aTargets: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sources) return false
        if (this.sourceId != other.sourceId) return false
        if (this.numTargets != other.numTargets) return false
        if (!this.aTargets.contentEquals(other.aTargets)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sourceId.hashCode()
        result = 31 * result + this.numTargets.hashCode()
        result = 31 * result + this.aTargets.contentHashCode()
        return result
    }
}

public data class Type1Font(
    public var hPFM: Handle = null,
    public var hPFB: Handle = null,
    public var ulIdentifier: UInt = 0u,
)

public data class VgaChar(public var char: Byte = 0, public var attributes: Byte = 0)

public class Videoparameters(
    public var guid: Guid = Guid(),
    public var dwOffset: UInt = 0u,
    public var dwCommand: UInt = 0u,
    public var dwFlags: UInt = 0u,
    public var dwMode: UInt = 0u,
    public var dwTVStandard: UInt = 0u,
    public var dwAvailableModes: UInt = 0u,
    public var dwAvailableTVStandard: UInt = 0u,
    public var dwFlickerFilter: UInt = 0u,
    public var dwOverScanX: UInt = 0u,
    public var dwOverScanY: UInt = 0u,
    public var dwMaxUnscaledX: UInt = 0u,
    public var dwMaxUnscaledY: UInt = 0u,
    public var dwPositionX: UInt = 0u,
    public var dwPositionY: UInt = 0u,
    public var dwBrightness: UInt = 0u,
    public var dwContrast: UInt = 0u,
    public var dwCPType: UInt = 0u,
    public var dwCPCommand: UInt = 0u,
    public var dwCPStandard: UInt = 0u,
    public var dwCPKey: UInt = 0u,
    public var bCpApstriggerBits: UInt = 0u,
    public var bOEMCopyProtection: UByteArray = UByteArray(256),
)

public data class VideoBankSelect(
    public var length: UInt = 0u,
    public var size: UInt = 0u,
    public var bankingFlags: UInt = 0u,
    public var bankingType: UInt = 0u,
    public var planarHCBankingType: UInt = 0u,
    public var bitmapWidthInBytes: UInt = 0u,
    public var bitmapSize: UInt = 0u,
    public var granularity: UInt = 0u,
    public var planarHCGranularity: UInt = 0u,
    public var codeOffset: UInt = 0u,
    public var planarHCBankCodeOffset: UInt = 0u,
    public var planarHCEnableCodeOffset: UInt = 0u,
    public var planarHCDisableCodeOffset: UInt = 0u,
)

public data class VideoBrightnessPolicy(
    public var defaultToBiosPolicy: Boolean = false,
    public var levelCount: UByte = 0u,
    public var level: List<VideoBrightnessPolicy0> = List(1) { VideoBrightnessPolicy0() },
)

public data class VideoBrightnessPolicy0(public var batteryLevel: UByte = 0u, public var brightness: UByte = 0u)

public data class VideoClut(
    public var numEntries: UShort = 0u,
    public var firstEntry: UShort = 0u,
    public var lookupTable: List<VideoClut0> = List(1) { VideoClut0() },
)

public data class VideoClut0(public var rgbArray: VideoClutdata = VideoClutdata(), public var rgbLong: UInt = 0u)

public data class VideoClutdata(
    public var red: UByte = 0u,
    public var green: UByte = 0u,
    public var blue: UByte = 0u,
    public var unused: UByte = 0u,
)

public class VideoColorCapabilities(
    public var length: UInt = 0u,
    public var attributeFlags: UInt = 0u,
    public var redPhosphoreDecay: Int = 0,
    public var greenPhosphoreDecay: Int = 0,
    public var bluePhosphoreDecay: Int = 0,
    public var whiteChromaticityX: Int = 0,
    public var whiteChromaticityY: Int = 0,
    public var redChromaticityX: Int = 0,
    public var redChromaticityY: Int = 0,
    public var greenChromaticityX: Int = 0,
    public var greenChromaticityY: Int = 0,
    public var blueChromaticityX: Int = 0,
    public var blueChromaticityY: Int = 0,
    public var whiteGamma: Int = 0,
    public var redGamma: Int = 0,
    public var greenGamma: Int = 0,
    public var blueGamma: Int = 0,
)

public data class VideoColorLutData(
    public var length: UInt = 0u,
    public var lutDataFormat: UInt = 0u,
    public var lutData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VideoColorLutData) return false
        if (this.length != other.length) return false
        if (this.lutDataFormat != other.lutDataFormat) return false
        if (!this.lutData.contentEquals(other.lutData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.lutDataFormat.hashCode()
        result = 31 * result + this.lutData.contentHashCode()
        return result
    }
}

public data class VideoCursorAttributes(
    public var width: UShort = 0u,
    public var height: UShort = 0u,
    public var column: Short = 0,
    public var row: Short = 0,
    public var rate: UByte = 0u,
    public var enable: UByte = 0u,
)

public data class VideoCursorPosition(public var column: Short = 0, public var row: Short = 0)

public data class VideoDeviceSessionStatus(public var bEnable: UInt = 0u, public var bSuccess: UInt = 0u)

public data class VideoHardwareState(public var stateHeader: VideoHardwareStateHeader? = null, public var stateLength: UInt = 0u)

public class VideoHardwareStateHeader(
    public var length: UInt = 0u,
    public var portValue: UByteArray = UByteArray(48),
    public var attribIndexDataState: UInt = 0u,
    public var basicSequencerOffset: UInt = 0u,
    public var basicCrtContOffset: UInt = 0u,
    public var basicGraphContOffset: UInt = 0u,
    public var basicAttribContOffset: UInt = 0u,
    public var basicDacOffset: UInt = 0u,
    public var basicLatchesOffset: UInt = 0u,
    public var extendedSequencerOffset: UInt = 0u,
    public var extendedCrtContOffset: UInt = 0u,
    public var extendedGraphContOffset: UInt = 0u,
    public var extendedAttribContOffset: UInt = 0u,
    public var extendedDacOffset: UInt = 0u,
    public var extendedValidatorStateOffset: UInt = 0u,
    public var extendedMiscDataOffset: UInt = 0u,
    public var planeLength: UInt = 0u,
    public var plane1Offset: UInt = 0u,
    public var plane2Offset: UInt = 0u,
    public var plane3Offset: UInt = 0u,
    public var plane4Offset: UInt = 0u,
    public var vGAStateFlags: UInt = 0u,
    public var dIBOffset: UInt = 0u,
    public var dIBBitsPerPixel: UInt = 0u,
    public var dIBXResolution: UInt = 0u,
    public var dIBYResolution: UInt = 0u,
    public var dIBXlatOffset: UInt = 0u,
    public var dIBXlatLength: UInt = 0u,
    public var vesaInfoOffset: UInt = 0u,
    public var frameBufferData: COpaquePointer? = null,
)

public data class VideoLoadFontInformation(
    public var widthInPixels: UShort = 0u,
    public var heightInPixels: UShort = 0u,
    public var fontSize: UInt = 0u,
    public var font: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VideoLoadFontInformation) return false
        if (this.widthInPixels != other.widthInPixels) return false
        if (this.heightInPixels != other.heightInPixels) return false
        if (this.fontSize != other.fontSize) return false
        if (!this.font.contentEquals(other.font)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.widthInPixels.hashCode()
        result = 31 * result + this.heightInPixels.hashCode()
        result = 31 * result + this.fontSize.hashCode()
        result = 31 * result + this.font.contentHashCode()
        return result
    }
}

public data class VideoLutRgb256words(
    public var red: UShortArray = UShortArray(256),
    public var green: UShortArray = UShortArray(256),
    public var blue: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VideoLutRgb256words) return false
        if (!this.red.contentEquals(other.red)) return false
        if (!this.green.contentEquals(other.green)) return false
        if (!this.blue.contentEquals(other.blue)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.red.contentHashCode()
        result = 31 * result + this.green.contentHashCode()
        result = 31 * result + this.blue.contentHashCode()
        return result
    }
}

public data class VideoMemory(public var requestedVirtualAddress: COpaquePointer? = null)

public data class VideoMemoryInformation(
    public var videoRamBase: COpaquePointer? = null,
    public var videoRamLength: UInt = 0u,
    public var frameBufferBase: COpaquePointer? = null,
    public var frameBufferLength: UInt = 0u,
)

public data class VideoMode(public var requestedMode: UInt = 0u)

public class VideoModeInformation(
    public var length: UInt = 0u,
    public var modeIndex: UInt = 0u,
    public var visScreenWidth: UInt = 0u,
    public var visScreenHeight: UInt = 0u,
    public var screenStride: UInt = 0u,
    public var numberOfPlanes: UInt = 0u,
    public var bitsPerPlane: UInt = 0u,
    public var frequency: UInt = 0u,
    public var xMillimeter: UInt = 0u,
    public var yMillimeter: UInt = 0u,
    public var numberRedBits: UInt = 0u,
    public var numberGreenBits: UInt = 0u,
    public var numberBlueBits: UInt = 0u,
    public var redMask: UInt = 0u,
    public var greenMask: UInt = 0u,
    public var blueMask: UInt = 0u,
    public var attributeFlags: UInt = 0u,
    public var videoMemoryBitmapWidth: UInt = 0u,
    public var videoMemoryBitmapHeight: UInt = 0u,
    public var driverSpecificAttributeFlags: UInt = 0u,
)

public data class VideoMonitorDescriptor(public var descriptorSize: UInt = 0u, public var descriptor: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VideoMonitorDescriptor) return false
        if (this.descriptorSize != other.descriptorSize) return false
        if (!this.descriptor.contentEquals(other.descriptor)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.descriptorSize.hashCode()
        result = 31 * result + this.descriptor.contentHashCode()
        return result
    }
}

public data class VideoNumModes(public var numModes: UInt = 0u, public var modeInformationLength: UInt = 0u)

public data class VideoPaletteData(
    public var numEntries: UShort = 0u,
    public var firstEntry: UShort = 0u,
    public var colors: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VideoPaletteData) return false
        if (this.numEntries != other.numEntries) return false
        if (this.firstEntry != other.firstEntry) return false
        if (!this.colors.contentEquals(other.colors)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.numEntries.hashCode()
        result = 31 * result + this.firstEntry.hashCode()
        result = 31 * result + this.colors.contentHashCode()
        return result
    }
}

public class VideoPerformanceCounter(
    public var nbOfAllocationEvicted: ULongArray = ULongArray(10),
    public var nbOfAllocationMarked: ULongArray = ULongArray(10),
    public var nbOfAllocationRestored: ULongArray = ULongArray(10),
    public var kBytesEvicted: ULongArray = ULongArray(10),
    public var kBytesMarked: ULongArray = ULongArray(10),
    public var kBytesRestored: ULongArray = ULongArray(10),
    public var nbProcessCommited: ULong = 0uL,
    public var nbAllocationCommited: ULong = 0uL,
    public var nbAllocationMarked: ULong = 0uL,
    public var kBytesAllocated: ULong = 0uL,
    public var kBytesAvailable: ULong = 0uL,
    public var kBytesCurMarked: ULong = 0uL,
    public var reference: ULong = 0uL,
    public var unreference: ULong = 0uL,
    public var trueReference: ULong = 0uL,
    public var nbOfPageIn: ULong = 0uL,
    public var kBytesPageIn: ULong = 0uL,
    public var nbOfPageOut: ULong = 0uL,
    public var kBytesPageOut: ULong = 0uL,
    public var nbOfRotateOut: ULong = 0uL,
    public var kBytesRotateOut: ULong = 0uL,
)

public data class VideoPointerAttributes(
    public var flags: UInt = 0u,
    public var width: UInt = 0u,
    public var height: UInt = 0u,
    public var widthInBytes: UInt = 0u,
    public var enable: UInt = 0u,
    public var column: Short = 0,
    public var row: Short = 0,
    public var pixels: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VideoPointerAttributes) return false
        if (this.flags != other.flags) return false
        if (this.width != other.width) return false
        if (this.height != other.height) return false
        if (this.widthInBytes != other.widthInBytes) return false
        if (this.enable != other.enable) return false
        if (this.column != other.column) return false
        if (this.row != other.row) return false
        if (!this.pixels.contentEquals(other.pixels)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.width.hashCode()
        result = 31 * result + this.height.hashCode()
        result = 31 * result + this.widthInBytes.hashCode()
        result = 31 * result + this.enable.hashCode()
        result = 31 * result + this.column.hashCode()
        result = 31 * result + this.row.hashCode()
        result = 31 * result + this.pixels.contentHashCode()
        return result
    }
}

public data class VideoPointerCapabilities(
    public var flags: UInt = 0u,
    public var maxWidth: UInt = 0u,
    public var maxHeight: UInt = 0u,
    public var hWPtrBitmapStart: UInt = 0u,
    public var hWPtrBitmapEnd: UInt = 0u,
)

public data class VideoPointerPosition(public var column: Short = 0, public var row: Short = 0)

public data class VideoPowerManagement(
    public var length: UInt = 0u,
    public var dPMSVersion: UInt = 0u,
    public var powerState: UInt = 0u,
)

public data class VideoPublicAccessRanges(
    public var inIoSpace: UInt = 0u,
    public var mappedInIoSpace: UInt = 0u,
    public var virtualAddress: COpaquePointer? = null,
)

public data class VideoQueryPerformanceCounter(public var bufferSize: UInt = 0u, public var buffer: VideoPerformanceCounter? = null)

public data class VideoRegisterVdm(public var minimumStateSize: UInt = 0u)

public data class VideoShareMemory(
    public var processHandle: Handle = null,
    public var viewOffset: UInt = 0u,
    public var viewSize: UInt = 0u,
    public var requestedVirtualAddress: COpaquePointer? = null,
)

public data class VideoShareMemoryInformation(
    public var sharedViewOffset: UInt = 0u,
    public var sharedViewSize: UInt = 0u,
    public var virtualAddress: COpaquePointer? = null,
)

public data class VideoVdm(public var processHandle: Handle = null)

public data class VideoWin32kCallbacks(
    public var physDisp: COpaquePointer? = null,
    public var callout: PvideoWin32kCallout = null,
    public var bACPI: UInt = 0u,
    public var pPhysDeviceObject: Handle = null,
    public var dualviewFlags: UInt = 0u,
)

public data class VideoWin32kCallbacksParams(
    public var calloutType: VideoWin32kCallbacksParamsType = 0,
    public var physDisp: COpaquePointer? = null,
    public var param: Int = 0,
    public var status: Int = 0,
    public var lockUserSession: Boolean = false,
    public var isPostDevice: Boolean = false,
    public var surpriseRemoval: Boolean = false,
    public var waitForQueueReady: Boolean = false,
)

public data class Wcrun(
    public var wcLow: UShort = 0u,
    public var cGlyphs: UShort = 0u,
    public var phg: UInt? = null,
)

public data class Wndobj(
    public var coClient: Clipobj = Clipobj(),
    public var pvConsumer: COpaquePointer? = null,
    public var rclClient: Rectl = Rectl(),
    public var psoOwner: Surfobj? = null,
)

public data class Xforml(
    public var eM11: Float = 0.0f,
    public var eM12: Float = 0.0f,
    public var eM21: Float = 0.0f,
    public var eM22: Float = 0.0f,
    public var eDx: Float = 0.0f,
    public var eDy: Float = 0.0f,
)

public data class Xformobj(public var ulReserved: UInt = 0u)

public data class Xlateobj(
    public var iUniq: UInt = 0u,
    public var flXlate: UInt = 0u,
    public var iSrcType: UShort = 0u,
    public var iDstType: UShort = 0u,
    public var cEntries: UInt = 0u,
    public var pulXlate: UInt? = null,
)
