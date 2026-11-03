@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.devices.display

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PWSTR

public data class Adapter(
    public var AdapterName: UShortArray = UShortArray(128),
    public var numSources: Int = 0,
    public var sources: List<Sources> = List(1) { Sources() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Adapter) return false
        if (!this.AdapterName.contentEquals(other.AdapterName)) return false
        if (this.numSources != other.numSources) return false
        if (this.sources != other.sources) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.AdapterName.contentHashCode()
        result = 31 * result + this.numSources.hashCode()
        result = 31 * result + this.sources.hashCode()
        return result
    }
}

public data class Adapters(public var numAdapters: Int = 0, public var adapter: List<Adapter> = List(1) { Adapter() })

public data class BACKLIGHT_REDUCTION_GAMMA_RAMP(
    public var R: UShortArray = UShortArray(256),
    public var G: UShortArray = UShortArray(256),
    public var B: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BACKLIGHT_REDUCTION_GAMMA_RAMP) return false
        if (!this.R.contentEquals(other.R)) return false
        if (!this.G.contentEquals(other.G)) return false
        if (!this.B.contentEquals(other.B)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.R.contentHashCode()
        result = 31 * result + this.G.contentHashCode()
        result = 31 * result + this.B.contentHashCode()
        return result
    }
}

public data class BANK_POSITION(public var ReadBankPosition: UInt = 0u, public var WriteBankPosition: UInt = 0u)

public data class BLENDOBJ(public var BlendFunction: Graphics.Gdi.BLENDFUNCTION = Graphics.Gdi.BLENDFUNCTION())

public data class BRIGHTNESS_LEVEL(public var Count: UByte = 0u, public var Level: UByteArray = UByteArray(103)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BRIGHTNESS_LEVEL) return false
        if (this.Count != other.Count) return false
        if (!this.Level.contentEquals(other.Level)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Count.hashCode()
        result = 31 * result + this.Level.contentHashCode()
        return result
    }
}

public data class BRIGHTNESS_NIT_RANGE(
    public var MinLevelInMillinit: UInt = 0u,
    public var MaxLevelInMillinit: UInt = 0u,
    public var StepSizeInMillinit: UInt = 0u,
)

public data class BRIGHTNESS_NIT_RANGES(
    public var NormalRangeCount: UInt = 0u,
    public var RangeCount: UInt = 0u,
    public var PreferredMaximumBrightness: UInt = 0u,
    public var SupportedRanges: List<BRIGHTNESS_NIT_RANGE> = List(16) { BRIGHTNESS_NIT_RANGE() },
)

public data class BRUSHOBJ(
    public var iSolidColor: UInt = 0u,
    public var pvRbrush: Long = 0L,
    public var flColorType: UInt = 0u,
)

public data class CDDDXGK_REDIRBITMAPPRESENTINFO(
    public var NumDirtyRects: UInt = 0u,
    public var DirtyRect: Long = 0L,
    public var NumContexts: UInt = 0u,
    public var hContext: List<Foundation.HANDLE> = List(65) { Foundation.HANDLE() },
    public var bDoNotSynchronizeWithDxContent: Boolean = false,
)

public data class CHAR_IMAGE_INFO(public var CharInfo: System.Console.CHAR_INFO = System.Console.CHAR_INFO(), public var FontImageInfo: FONT_IMAGE_INFO = FONT_IMAGE_INFO())

public data class CHROMATICITY_COORDINATE(public var x: Float = 0.0f, public var y: Float = 0.0f)

public data class CIECHROMA(
    public var x: Int = 0,
    public var y: Int = 0,
    public var Y: Int = 0,
)

public data class CLIPLINE(
    public var ptfxA: POINTFIX = POINTFIX(),
    public var ptfxB: POINTFIX = POINTFIX(),
    public var lStyleState: Int = 0,
    public var c: UInt = 0u,
    public var arun: List<RUN> = List(1) { RUN() },
)

public data class CLIPOBJ(
    public var iUniq: UInt = 0u,
    public var rclBounds: Foundation.RECTL = Foundation.RECTL(),
    public var iDComplexity: UByte = 0u,
    public var iFComplexity: UByte = 0u,
    public var iMode: UByte = 0u,
    public var fjOptions: UByte = 0u,
)

public data class COLORINFO(
    public var Red: CIECHROMA = CIECHROMA(),
    public var Green: CIECHROMA = CIECHROMA(),
    public var Blue: CIECHROMA = CIECHROMA(),
    public var Cyan: CIECHROMA = CIECHROMA(),
    public var Magenta: CIECHROMA = CIECHROMA(),
    public var Yellow: CIECHROMA = CIECHROMA(),
    public var AlignmentWhite: CIECHROMA = CIECHROMA(),
    public var RedGamma: Int = 0,
    public var GreenGamma: Int = 0,
    public var BlueGamma: Int = 0,
    public var MagentaInCyanDye: Int = 0,
    public var YellowInCyanDye: Int = 0,
    public var CyanInMagentaDye: Int = 0,
    public var YellowInMagentaDye: Int = 0,
    public var CyanInYellowDye: Int = 0,
    public var MagentaInYellowDye: Int = 0,
)

public data class COLORSPACE_TRANSFORM(public var Type: COLORSPACE_TRANSFORM_TYPE = 0, public var Data: COLORSPACE_TRANSFORM_0 = COLORSPACE_TRANSFORM_0())

public data class COLORSPACE_TRANSFORM_0(
    public var Rgb256x3x16: GAMMA_RAMP_RGB256x3x16 = GAMMA_RAMP_RGB256x3x16(),
    public var Dxgi1: GAMMA_RAMP_DXGI_1 = GAMMA_RAMP_DXGI_1(),
    public var T3x4: COLORSPACE_TRANSFORM_3x4 = COLORSPACE_TRANSFORM_3x4(),
    public var MatrixV2: COLORSPACE_TRANSFORM_MATRIX_V2 = COLORSPACE_TRANSFORM_MATRIX_V2(),
)

public data class COLORSPACE_TRANSFORM_1DLUT_CAP(public var NumberOfLUTEntries: UInt = 0u, public var DataCap: COLORSPACE_TRANSFORM_DATA_CAP = COLORSPACE_TRANSFORM_DATA_CAP())

public data class COLORSPACE_TRANSFORM_3x4(
    public var ColorMatrix3x4: FloatArray = FloatArray(12),
    public var ScalarMultiplier: Float = 0.0f,
    public var LookupTable1D: List<GAMMA_RAMP_RGB> = List(4096) { GAMMA_RAMP_RGB() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is COLORSPACE_TRANSFORM_3x4) return false
        if (!this.ColorMatrix3x4.contentEquals(other.ColorMatrix3x4)) return false
        if (this.ScalarMultiplier != other.ScalarMultiplier) return false
        if (this.LookupTable1D != other.LookupTable1D) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ColorMatrix3x4.contentHashCode()
        result = 31 * result + this.ScalarMultiplier.hashCode()
        result = 31 * result + this.LookupTable1D.hashCode()
        return result
    }
}

public data class COLORSPACE_TRANSFORM_DATA_CAP(
    public var DataType: COLORSPACE_TRANSFORM_DATA_TYPE = 0,
    public var Anonymous: COLORSPACE_TRANSFORM_DATA_CAP_0 = COLORSPACE_TRANSFORM_DATA_CAP_0(),
    public var NumericRangeMin: Float = 0.0f,
    public var NumericRangeMax: Float = 0.0f,
)

public data class COLORSPACE_TRANSFORM_DATA_CAP_0(
    public var Anonymous1: COLORSPACE_TRANSFORM_DATA_CAP_0_0 = COLORSPACE_TRANSFORM_DATA_CAP_0_0(),
    public var Anonymous2: COLORSPACE_TRANSFORM_DATA_CAP_0_1 = COLORSPACE_TRANSFORM_DATA_CAP_0_1(),
    public var Value: UInt = 0u,
)

public data class COLORSPACE_TRANSFORM_DATA_CAP_0_0(public var _bitfield: UInt = 0u)

public data class COLORSPACE_TRANSFORM_DATA_CAP_0_1(public var _bitfield: UInt = 0u)

public data class COLORSPACE_TRANSFORM_MATRIX_CAP(public var Anonymous: COLORSPACE_TRANSFORM_MATRIX_CAP_0 = COLORSPACE_TRANSFORM_MATRIX_CAP_0(), public var DataCap: COLORSPACE_TRANSFORM_DATA_CAP = COLORSPACE_TRANSFORM_DATA_CAP())

public data class COLORSPACE_TRANSFORM_MATRIX_CAP_0(public var Anonymous: COLORSPACE_TRANSFORM_MATRIX_CAP_0_0 = COLORSPACE_TRANSFORM_MATRIX_CAP_0_0(), public var Value: UInt = 0u)

public data class COLORSPACE_TRANSFORM_MATRIX_CAP_0_0(public var _bitfield: UInt = 0u)

public data class COLORSPACE_TRANSFORM_MATRIX_V2(
    public var StageControlLookupTable1DDegamma: COLORSPACE_TRANSFORM_STAGE_CONTROL = 0,
    public var LookupTable1DDegamma: List<GAMMA_RAMP_RGB> = List(4096) { GAMMA_RAMP_RGB() },
    public var StageControlColorMatrix3x3: COLORSPACE_TRANSFORM_STAGE_CONTROL = 0,
    public var ColorMatrix3x3: FloatArray = FloatArray(9),
    public var StageControlLookupTable1DRegamma: COLORSPACE_TRANSFORM_STAGE_CONTROL = 0,
    public var LookupTable1DRegamma: List<GAMMA_RAMP_RGB> = List(4096) { GAMMA_RAMP_RGB() },
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is COLORSPACE_TRANSFORM_MATRIX_V2) return false
        if (this.StageControlLookupTable1DDegamma != other.StageControlLookupTable1DDegamma) return false
        if (this.LookupTable1DDegamma != other.LookupTable1DDegamma) return false
        if (this.StageControlColorMatrix3x3 != other.StageControlColorMatrix3x3) return false
        if (!this.ColorMatrix3x3.contentEquals(other.ColorMatrix3x3)) return false
        if (this.StageControlLookupTable1DRegamma != other.StageControlLookupTable1DRegamma) return false
        if (this.LookupTable1DRegamma != other.LookupTable1DRegamma) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.StageControlLookupTable1DDegamma.hashCode()
        result = 31 * result + this.LookupTable1DDegamma.hashCode()
        result = 31 * result + this.StageControlColorMatrix3x3.hashCode()
        result = 31 * result + this.ColorMatrix3x3.contentHashCode()
        result = 31 * result + this.StageControlLookupTable1DRegamma.hashCode()
        result = 31 * result + this.LookupTable1DRegamma.hashCode()
        return result
    }
}

public data class COLORSPACE_TRANSFORM_SET_INPUT(
    public var OutputWireColorSpaceExpected: OUTPUT_WIRE_COLOR_SPACE_TYPE = 0,
    public var OutputWireFormatExpected: OUTPUT_WIRE_FORMAT = OUTPUT_WIRE_FORMAT(),
    public var ColorSpaceTransform: COLORSPACE_TRANSFORM = COLORSPACE_TRANSFORM(),
)

public data class COLORSPACE_TRANSFORM_TARGET_CAPS(
    public var Version: COLORSPACE_TRANSFORM_TARGET_CAPS_VERSION = 0,
    public var LookupTable1DDegammaCap: COLORSPACE_TRANSFORM_1DLUT_CAP = COLORSPACE_TRANSFORM_1DLUT_CAP(),
    public var ColorMatrix3x3Cap: COLORSPACE_TRANSFORM_MATRIX_CAP = COLORSPACE_TRANSFORM_MATRIX_CAP(),
    public var LookupTable1DRegammaCap: COLORSPACE_TRANSFORM_1DLUT_CAP = COLORSPACE_TRANSFORM_1DLUT_CAP(),
)

public data class DEVHTADJDATA(
    public var DeviceFlags: UInt = 0u,
    public var DeviceXDPI: UInt = 0u,
    public var DeviceYDPI: UInt = 0u,
    public var pDefHTInfo: Long = 0L,
    public var pAdjHTInfo: Long = 0L,
)

public data class DEVHTINFO(
    public var HTFlags: UInt = 0u,
    public var HTPatternSize: UInt = 0u,
    public var DevPelsDPI: UInt = 0u,
    public var ColorInfo: COLORINFO = COLORINFO(),
)

public data class DEVINFO(
    public var flGraphicsCaps: UInt = 0u,
    public var lfDefaultFont: Graphics.Gdi.LOGFONTW = Graphics.Gdi.LOGFONTW(),
    public var lfAnsiVarFont: Graphics.Gdi.LOGFONTW = Graphics.Gdi.LOGFONTW(),
    public var lfAnsiFixFont: Graphics.Gdi.LOGFONTW = Graphics.Gdi.LOGFONTW(),
    public var cFonts: UInt = 0u,
    public var iDitherFormat: UInt = 0u,
    public var cxDither: UShort = 0u,
    public var cyDither: UShort = 0u,
    public var hpalDefault: Graphics.Gdi.HPALETTE = Graphics.Gdi.HPALETTE(),
    public var flGraphicsCaps2: UInt = 0u,
)

public data class DISPLAYCONFIG_2DREGION(public var cx: UInt = 0u, public var cy: UInt = 0u)

public data class DISPLAYCONFIG_ADAPTER_NAME(public var header: DISPLAYCONFIG_DEVICE_INFO_HEADER = DISPLAYCONFIG_DEVICE_INFO_HEADER(), public var adapterDevicePath: UShortArray = UShortArray(128)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DISPLAYCONFIG_ADAPTER_NAME) return false
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

public data class DISPLAYCONFIG_DESKTOP_IMAGE_INFO(
    public var PathSourceSize: Foundation.POINTL = Foundation.POINTL(),
    public var DesktopImageRegion: Foundation.RECTL = Foundation.RECTL(),
    public var DesktopImageClip: Foundation.RECTL = Foundation.RECTL(),
)

public data class DISPLAYCONFIG_DEVICE_INFO_HEADER(
    public var type: DISPLAYCONFIG_DEVICE_INFO_TYPE = 0,
    public var size: UInt = 0u,
    public var adapterId: Foundation.LUID = Foundation.LUID(),
    public var id: UInt = 0u,
)

public data class DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO(
    public var header: DISPLAYCONFIG_DEVICE_INFO_HEADER = DISPLAYCONFIG_DEVICE_INFO_HEADER(),
    public var Anonymous: DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO_0 = DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO_0(),
    public var colorEncoding: Graphics.Gdi.DISPLAYCONFIG_COLOR_ENCODING = Graphics.Gdi.DISPLAYCONFIG_COLOR_ENCODING(),
    public var bitsPerColorChannel: UInt = 0u,
)

public data class DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO_0(public var Anonymous: DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO_0_0 = DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO_0_0(), public var value: UInt = 0u)

public data class DISPLAYCONFIG_GET_ADVANCED_COLOR_INFO_0_0(public var _bitfield: UInt = 0u)

public data class DISPLAYCONFIG_GET_MONITOR_SPECIALIZATION(public var header: DISPLAYCONFIG_DEVICE_INFO_HEADER = DISPLAYCONFIG_DEVICE_INFO_HEADER(), public var Anonymous: DISPLAYCONFIG_GET_MONITOR_SPECIALIZATION_0 = DISPLAYCONFIG_GET_MONITOR_SPECIALIZATION_0())

public data class DISPLAYCONFIG_GET_MONITOR_SPECIALIZATION_0(public var Anonymous: DISPLAYCONFIG_GET_MONITOR_SPECIALIZATION_0_0 = DISPLAYCONFIG_GET_MONITOR_SPECIALIZATION_0_0(), public var value: UInt = 0u)

public data class DISPLAYCONFIG_GET_MONITOR_SPECIALIZATION_0_0(public var _bitfield: UInt = 0u)

public data class DISPLAYCONFIG_MODE_INFO(
    public var infoType: DISPLAYCONFIG_MODE_INFO_TYPE = 0,
    public var id: UInt = 0u,
    public var adapterId: Foundation.LUID = Foundation.LUID(),
    public var Anonymous: DISPLAYCONFIG_MODE_INFO_0 = DISPLAYCONFIG_MODE_INFO_0(),
)

public data class DISPLAYCONFIG_MODE_INFO_0(
    public var targetMode: DISPLAYCONFIG_TARGET_MODE = DISPLAYCONFIG_TARGET_MODE(),
    public var sourceMode: DISPLAYCONFIG_SOURCE_MODE = DISPLAYCONFIG_SOURCE_MODE(),
    public var desktopImageInfo: DISPLAYCONFIG_DESKTOP_IMAGE_INFO = DISPLAYCONFIG_DESKTOP_IMAGE_INFO(),
)

public data class DISPLAYCONFIG_PATH_INFO(
    public var sourceInfo: DISPLAYCONFIG_PATH_SOURCE_INFO = DISPLAYCONFIG_PATH_SOURCE_INFO(),
    public var targetInfo: DISPLAYCONFIG_PATH_TARGET_INFO = DISPLAYCONFIG_PATH_TARGET_INFO(),
    public var flags: UInt = 0u,
)

public data class DISPLAYCONFIG_PATH_SOURCE_INFO(
    public var adapterId: Foundation.LUID = Foundation.LUID(),
    public var id: UInt = 0u,
    public var Anonymous: DISPLAYCONFIG_PATH_SOURCE_INFO_0 = DISPLAYCONFIG_PATH_SOURCE_INFO_0(),
    public var statusFlags: UInt = 0u,
)

public data class DISPLAYCONFIG_PATH_SOURCE_INFO_0(public var modeInfoIdx: UInt = 0u, public var Anonymous: DISPLAYCONFIG_PATH_SOURCE_INFO_0_0 = DISPLAYCONFIG_PATH_SOURCE_INFO_0_0())

public data class DISPLAYCONFIG_PATH_SOURCE_INFO_0_0(public var _bitfield: UInt = 0u)

public data class DISPLAYCONFIG_PATH_TARGET_INFO(
    public var adapterId: Foundation.LUID = Foundation.LUID(),
    public var id: UInt = 0u,
    public var Anonymous: DISPLAYCONFIG_PATH_TARGET_INFO_0 = DISPLAYCONFIG_PATH_TARGET_INFO_0(),
    public var outputTechnology: DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY = 0,
    public var rotation: DISPLAYCONFIG_ROTATION = 0,
    public var scaling: DISPLAYCONFIG_SCALING = 0,
    public var refreshRate: DISPLAYCONFIG_RATIONAL = DISPLAYCONFIG_RATIONAL(),
    public var scanLineOrdering: DISPLAYCONFIG_SCANLINE_ORDERING = 0,
    public var targetAvailable: BOOL = 0,
    public var statusFlags: UInt = 0u,
)

public data class DISPLAYCONFIG_PATH_TARGET_INFO_0(public var modeInfoIdx: UInt = 0u, public var Anonymous: DISPLAYCONFIG_PATH_TARGET_INFO_0_0 = DISPLAYCONFIG_PATH_TARGET_INFO_0_0())

public data class DISPLAYCONFIG_PATH_TARGET_INFO_0_0(public var _bitfield: UInt = 0u)

public data class DISPLAYCONFIG_RATIONAL(public var Numerator: UInt = 0u, public var Denominator: UInt = 0u)

public data class DISPLAYCONFIG_SDR_WHITE_LEVEL(public var header: DISPLAYCONFIG_DEVICE_INFO_HEADER = DISPLAYCONFIG_DEVICE_INFO_HEADER(), public var SDRWhiteLevel: UInt = 0u)

public data class DISPLAYCONFIG_SET_ADVANCED_COLOR_STATE(public var header: DISPLAYCONFIG_DEVICE_INFO_HEADER = DISPLAYCONFIG_DEVICE_INFO_HEADER(), public var Anonymous: DISPLAYCONFIG_SET_ADVANCED_COLOR_STATE_0 = DISPLAYCONFIG_SET_ADVANCED_COLOR_STATE_0())

public data class DISPLAYCONFIG_SET_ADVANCED_COLOR_STATE_0(public var Anonymous: DISPLAYCONFIG_SET_ADVANCED_COLOR_STATE_0_0 = DISPLAYCONFIG_SET_ADVANCED_COLOR_STATE_0_0(), public var value: UInt = 0u)

public data class DISPLAYCONFIG_SET_ADVANCED_COLOR_STATE_0_0(public var _bitfield: UInt = 0u)

public data class DISPLAYCONFIG_SET_MONITOR_SPECIALIZATION(
    public var header: DISPLAYCONFIG_DEVICE_INFO_HEADER = DISPLAYCONFIG_DEVICE_INFO_HEADER(),
    public var Anonymous: DISPLAYCONFIG_SET_MONITOR_SPECIALIZATION_0 = DISPLAYCONFIG_SET_MONITOR_SPECIALIZATION_0(),
    public var specializationType: GUID = GUID(),
    public var specializationSubType: GUID = GUID(),
    public var specializationApplicationName: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DISPLAYCONFIG_SET_MONITOR_SPECIALIZATION) return false
        if (this.header != other.header) return false
        if (this.Anonymous != other.Anonymous) return false
        if (this.specializationType != other.specializationType) return false
        if (this.specializationSubType != other.specializationSubType) return false
        if (!this.specializationApplicationName.contentEquals(other.specializationApplicationName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.header.hashCode()
        result = 31 * result + this.Anonymous.hashCode()
        result = 31 * result + this.specializationType.hashCode()
        result = 31 * result + this.specializationSubType.hashCode()
        result = 31 * result + this.specializationApplicationName.contentHashCode()
        return result
    }
}

public data class DISPLAYCONFIG_SET_MONITOR_SPECIALIZATION_0(public var Anonymous: DISPLAYCONFIG_SET_MONITOR_SPECIALIZATION_0_0 = DISPLAYCONFIG_SET_MONITOR_SPECIALIZATION_0_0(), public var value: UInt = 0u)

public data class DISPLAYCONFIG_SET_MONITOR_SPECIALIZATION_0_0(public var _bitfield: UInt = 0u)

public data class DISPLAYCONFIG_SET_TARGET_PERSISTENCE(public var header: DISPLAYCONFIG_DEVICE_INFO_HEADER = DISPLAYCONFIG_DEVICE_INFO_HEADER(), public var Anonymous: DISPLAYCONFIG_SET_TARGET_PERSISTENCE_0 = DISPLAYCONFIG_SET_TARGET_PERSISTENCE_0())

public data class DISPLAYCONFIG_SET_TARGET_PERSISTENCE_0(public var Anonymous: DISPLAYCONFIG_SET_TARGET_PERSISTENCE_0_0 = DISPLAYCONFIG_SET_TARGET_PERSISTENCE_0_0(), public var value: UInt = 0u)

public data class DISPLAYCONFIG_SET_TARGET_PERSISTENCE_0_0(public var _bitfield: UInt = 0u)

public data class DISPLAYCONFIG_SOURCE_DEVICE_NAME(public var header: DISPLAYCONFIG_DEVICE_INFO_HEADER = DISPLAYCONFIG_DEVICE_INFO_HEADER(), public var viewGdiDeviceName: UShortArray = UShortArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DISPLAYCONFIG_SOURCE_DEVICE_NAME) return false
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

public data class DISPLAYCONFIG_SOURCE_MODE(
    public var width: UInt = 0u,
    public var height: UInt = 0u,
    public var pixelFormat: DISPLAYCONFIG_PIXELFORMAT = 0,
    public var position: Foundation.POINTL = Foundation.POINTL(),
)

public data class DISPLAYCONFIG_SUPPORT_VIRTUAL_RESOLUTION(public var header: DISPLAYCONFIG_DEVICE_INFO_HEADER = DISPLAYCONFIG_DEVICE_INFO_HEADER(), public var Anonymous: DISPLAYCONFIG_SUPPORT_VIRTUAL_RESOLUTION_0 = DISPLAYCONFIG_SUPPORT_VIRTUAL_RESOLUTION_0())

public data class DISPLAYCONFIG_SUPPORT_VIRTUAL_RESOLUTION_0(public var Anonymous: DISPLAYCONFIG_SUPPORT_VIRTUAL_RESOLUTION_0_0 = DISPLAYCONFIG_SUPPORT_VIRTUAL_RESOLUTION_0_0(), public var value: UInt = 0u)

public data class DISPLAYCONFIG_SUPPORT_VIRTUAL_RESOLUTION_0_0(public var _bitfield: UInt = 0u)

public data class DISPLAYCONFIG_TARGET_BASE_TYPE(public var header: DISPLAYCONFIG_DEVICE_INFO_HEADER = DISPLAYCONFIG_DEVICE_INFO_HEADER(), public var baseOutputTechnology: DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY = 0)

public data class DISPLAYCONFIG_TARGET_DEVICE_NAME(
    public var header: DISPLAYCONFIG_DEVICE_INFO_HEADER = DISPLAYCONFIG_DEVICE_INFO_HEADER(),
    public var flags: DISPLAYCONFIG_TARGET_DEVICE_NAME_FLAGS = DISPLAYCONFIG_TARGET_DEVICE_NAME_FLAGS(),
    public var outputTechnology: DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY = 0,
    public var edidManufactureId: UShort = 0u,
    public var edidProductCodeId: UShort = 0u,
    public var connectorInstance: UInt = 0u,
    public var monitorFriendlyDeviceName: UShortArray = UShortArray(64),
    public var monitorDevicePath: UShortArray = UShortArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DISPLAYCONFIG_TARGET_DEVICE_NAME) return false
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

public data class DISPLAYCONFIG_TARGET_DEVICE_NAME_FLAGS(public var Anonymous: DISPLAYCONFIG_TARGET_DEVICE_NAME_FLAGS_0 = DISPLAYCONFIG_TARGET_DEVICE_NAME_FLAGS_0())

public data class DISPLAYCONFIG_TARGET_DEVICE_NAME_FLAGS_0(public var Anonymous: DISPLAYCONFIG_TARGET_DEVICE_NAME_FLAGS_0_0 = DISPLAYCONFIG_TARGET_DEVICE_NAME_FLAGS_0_0(), public var value: UInt = 0u)

public data class DISPLAYCONFIG_TARGET_DEVICE_NAME_FLAGS_0_0(public var _bitfield: UInt = 0u)

public data class DISPLAYCONFIG_TARGET_MODE(public var targetVideoSignalInfo: DISPLAYCONFIG_VIDEO_SIGNAL_INFO = DISPLAYCONFIG_VIDEO_SIGNAL_INFO())

public data class DISPLAYCONFIG_TARGET_PREFERRED_MODE(
    public var header: DISPLAYCONFIG_DEVICE_INFO_HEADER = DISPLAYCONFIG_DEVICE_INFO_HEADER(),
    public var width: UInt = 0u,
    public var height: UInt = 0u,
    public var targetMode: DISPLAYCONFIG_TARGET_MODE = DISPLAYCONFIG_TARGET_MODE(),
)

public data class DISPLAYCONFIG_VIDEO_SIGNAL_INFO(
    public var pixelRate: ULong = 0uL,
    public var hSyncFreq: DISPLAYCONFIG_RATIONAL = DISPLAYCONFIG_RATIONAL(),
    public var vSyncFreq: DISPLAYCONFIG_RATIONAL = DISPLAYCONFIG_RATIONAL(),
    public var activeSize: DISPLAYCONFIG_2DREGION = DISPLAYCONFIG_2DREGION(),
    public var totalSize: DISPLAYCONFIG_2DREGION = DISPLAYCONFIG_2DREGION(),
    public var Anonymous: DISPLAYCONFIG_VIDEO_SIGNAL_INFO_0 = DISPLAYCONFIG_VIDEO_SIGNAL_INFO_0(),
    public var scanLineOrdering: DISPLAYCONFIG_SCANLINE_ORDERING = 0,
)

public data class DISPLAYCONFIG_VIDEO_SIGNAL_INFO_0(public var AdditionalSignalInfo: DISPLAYCONFIG_VIDEO_SIGNAL_INFO_0_0 = DISPLAYCONFIG_VIDEO_SIGNAL_INFO_0_0(), public var videoStandard: UInt = 0u)

public data class DISPLAYCONFIG_VIDEO_SIGNAL_INFO_0_0(public var _bitfield: UInt = 0u)

public data class DISPLAY_BRIGHTNESS(
    public var ucDisplayPolicy: UByte = 0u,
    public var ucACBrightness: UByte = 0u,
    public var ucDCBrightness: UByte = 0u,
)

public data class DRH_APIBITMAPDATA(public var pso: Long = 0L, public var b: BOOL = 0)

public data class DRIVEROBJ(
    public var pvObj: Long = 0L,
    public var pFreeProc: FREEOBJPROC = null,
    public var hdev: HDEV = 0L,
    public var dhpdev: DHPDEV = 0L,
)

public data class DRVENABLEDATA(
    public var iDriverVersion: UInt = 0u,
    public var c: UInt = 0u,
    public var pdrvfn: Long = 0L,
)

public data class DRVFN(public var iFunc: UInt = 0u, public var pfn: PFN = null)

public data class DXGK_WIN32K_PARAM_DATA(
    public var PathsArray: Long = 0L,
    public var ModesArray: Long = 0L,
    public var NumPathArrayElements: UInt = 0u,
    public var NumModeArrayElements: UInt = 0u,
    public var SDCFlags: UInt = 0u,
)

public data class DisplayMode(public var DeviceName: UShortArray = UShortArray(32), public var devMode: Graphics.Gdi.DEVMODEW = Graphics.Gdi.DEVMODEW()) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DisplayMode) return false
        if (!this.DeviceName.contentEquals(other.DeviceName)) return false
        if (this.devMode != other.devMode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.DeviceName.contentHashCode()
        result = 31 * result + this.devMode.hashCode()
        return result
    }
}

public data class DisplayModes(public var numDisplayModes: Int = 0, public var displayMode: List<DisplayMode> = List(1) { DisplayMode() })

public data class EMFINFO(
    public var nSize: UInt = 0u,
    public var hdc: Graphics.Gdi.HDC = Graphics.Gdi.HDC(),
    public var pvEMF: Long = 0L,
    public var pvCurrentRecord: Long = 0L,
)

public data class ENGSAFESEMAPHORE(public var hsem: HSEMAPHORE = 0L, public var lCount: Int = 0)

public data class ENG_EVENT(public var pKEvent: Long = 0L, public var fFlags: UInt = 0u)

public data class ENG_TIME_FIELDS(
    public var usYear: UShort = 0u,
    public var usMonth: UShort = 0u,
    public var usDay: UShort = 0u,
    public var usHour: UShort = 0u,
    public var usMinute: UShort = 0u,
    public var usSecond: UShort = 0u,
    public var usMilliseconds: UShort = 0u,
    public var usWeekday: UShort = 0u,
)

public data class ENUMRECTS(public var c: UInt = 0u, public var arcl: List<Foundation.RECTL> = List(1) { Foundation.RECTL() })

public class FD_DEVICEMETRICS(
    public var flRealizedType: UInt = 0u,
    public var pteBase: POINTE = POINTE(),
    public var pteSide: POINTE = POINTE(),
    public var lD: Int = 0,
    public var fxMaxAscender: Int = 0,
    public var fxMaxDescender: Int = 0,
    public var ptlUnderline1: Foundation.POINTL = Foundation.POINTL(),
    public var ptlStrikeOut: Foundation.POINTL = Foundation.POINTL(),
    public var ptlULThickness: Foundation.POINTL = Foundation.POINTL(),
    public var ptlSOThickness: Foundation.POINTL = Foundation.POINTL(),
    public var cxMax: UInt = 0u,
    public var cyMax: UInt = 0u,
    public var cjGlyphMax: UInt = 0u,
    public var fdxQuantized: FD_XFORM = FD_XFORM(),
    public var lNonLinearExtLeading: Int = 0,
    public var lNonLinearIntLeading: Int = 0,
    public var lNonLinearMaxCharWidth: Int = 0,
    public var lNonLinearAvgCharWidth: Int = 0,
    public var lMinA: Int = 0,
    public var lMinC: Int = 0,
    public var lMinD: Int = 0,
    public var alReserved: IntArray = IntArray(1),
)

public data class FD_GLYPHATTR(
    public var cjThis: UInt = 0u,
    public var cGlyphs: UInt = 0u,
    public var iMode: UInt = 0u,
    public var aGlyphAttr: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FD_GLYPHATTR) return false
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

public data class FD_GLYPHSET(
    public var cjThis: UInt = 0u,
    public var flAccel: UInt = 0u,
    public var cGlyphsSupported: UInt = 0u,
    public var cRuns: UInt = 0u,
    public var awcrun: List<WCRUN> = List(1) { WCRUN() },
)

public data class FD_KERNINGPAIR(
    public var wcFirst: UShort = 0u,
    public var wcSecond: UShort = 0u,
    public var fwdKern: Short = 0,
)

public data class FD_LIGATURE(
    public var culThis: UInt = 0u,
    public var ulType: UInt = 0u,
    public var cLigatures: UInt = 0u,
    public var alig: List<LIGATURE> = List(1) { LIGATURE() },
)

public data class FD_XFORM(
    public var eXX: Float = 0.0f,
    public var eXY: Float = 0.0f,
    public var eYX: Float = 0.0f,
    public var eYY: Float = 0.0f,
)

public data class FLOATOBJ_XFORM(
    public var eM11: Float = 0.0f,
    public var eM12: Float = 0.0f,
    public var eM21: Float = 0.0f,
    public var eM22: Float = 0.0f,
    public var eDx: Float = 0.0f,
    public var eDy: Float = 0.0f,
)

public data class FLOAT_LONG(public var e: Float = 0.0f, public var l: Int = 0)

public data class FONTDIFF(
    public var jReserved1: UByte = 0u,
    public var jReserved2: UByte = 0u,
    public var jReserved3: UByte = 0u,
    public var bWeight: UByte = 0u,
    public var usWinWeight: UShort = 0u,
    public var fsSelection: UShort = 0u,
    public var fwdAveCharWidth: Short = 0,
    public var fwdMaxCharInc: Short = 0,
    public var ptlCaret: Foundation.POINTL = Foundation.POINTL(),
)

public data class FONTINFO(
    public var cjThis: UInt = 0u,
    public var flCaps: UInt = 0u,
    public var cGlyphsSupported: UInt = 0u,
    public var cjMaxGlyph1: UInt = 0u,
    public var cjMaxGlyph4: UInt = 0u,
    public var cjMaxGlyph8: UInt = 0u,
    public var cjMaxGlyph32: UInt = 0u,
)

public data class FONTOBJ(
    public var iUniq: UInt = 0u,
    public var iFace: UInt = 0u,
    public var cxMax: UInt = 0u,
    public var flFontType: UInt = 0u,
    public var iTTUniq: ULong = 0uL,
    public var iFile: ULong = 0uL,
    public var sizLogResPpi: Foundation.SIZE = Foundation.SIZE(),
    public var ulStyleSize: UInt = 0u,
    public var pvConsumer: Long = 0L,
    public var pvProducer: Long = 0L,
)

public data class FONTSIM(
    public var dpBold: Int = 0,
    public var dpItalic: Int = 0,
    public var dpBoldItalic: Int = 0,
)

public data class FONT_IMAGE_INFO(public var FontSize: System.Console.COORD = System.Console.COORD(), public var ImageBits: Long = 0L)

public data class FSCNTL_SCREEN_INFO(
    public var Position: System.Console.COORD = System.Console.COORD(),
    public var ScreenSize: System.Console.COORD = System.Console.COORD(),
    public var nNumberOfChars: UInt = 0u,
)

public data class FSVIDEO_COPY_FRAME_BUFFER(public var SrcScreen: FSCNTL_SCREEN_INFO = FSCNTL_SCREEN_INFO(), public var DestScreen: FSCNTL_SCREEN_INFO = FSCNTL_SCREEN_INFO())

public data class FSVIDEO_CURSOR_POSITION(public var Coord: VIDEO_CURSOR_POSITION = VIDEO_CURSOR_POSITION(), public var dwType: UInt = 0u)

public data class FSVIDEO_MODE_INFORMATION(public var VideoMode: VIDEO_MODE_INFORMATION = VIDEO_MODE_INFORMATION(), public var VideoMemory: VIDEO_MEMORY_INFORMATION = VIDEO_MEMORY_INFORMATION())

public data class FSVIDEO_REVERSE_MOUSE_POINTER(public var Screen: FSCNTL_SCREEN_INFO = FSCNTL_SCREEN_INFO(), public var dwType: UInt = 0u)

public data class FSVIDEO_SCREEN_INFORMATION(public var ScreenSize: System.Console.COORD = System.Console.COORD(), public var FontSize: System.Console.COORD = System.Console.COORD())

public data class FSVIDEO_WRITE_TO_FRAME_BUFFER(public var SrcBuffer: Long = 0L, public var DestScreen: FSCNTL_SCREEN_INFO = FSCNTL_SCREEN_INFO())

public data class GAMMARAMP(
    public var Red: UShortArray = UShortArray(256),
    public var Green: UShortArray = UShortArray(256),
    public var Blue: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GAMMARAMP) return false
        if (!this.Red.contentEquals(other.Red)) return false
        if (!this.Green.contentEquals(other.Green)) return false
        if (!this.Blue.contentEquals(other.Blue)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Red.contentHashCode()
        result = 31 * result + this.Green.contentHashCode()
        result = 31 * result + this.Blue.contentHashCode()
        return result
    }
}

public data class GAMMA_RAMP_DXGI_1(
    public var Scale: GAMMA_RAMP_RGB = GAMMA_RAMP_RGB(),
    public var Offset: GAMMA_RAMP_RGB = GAMMA_RAMP_RGB(),
    public var GammaCurve: List<GAMMA_RAMP_RGB> = List(1025) { GAMMA_RAMP_RGB() },
)

public data class GAMMA_RAMP_RGB(
    public var Red: Float = 0.0f,
    public var Green: Float = 0.0f,
    public var Blue: Float = 0.0f,
)

public data class GAMMA_RAMP_RGB256x3x16(
    public var Red: UShortArray = UShortArray(256),
    public var Green: UShortArray = UShortArray(256),
    public var Blue: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GAMMA_RAMP_RGB256x3x16) return false
        if (!this.Red.contentEquals(other.Red)) return false
        if (!this.Green.contentEquals(other.Green)) return false
        if (!this.Blue.contentEquals(other.Blue)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Red.contentHashCode()
        result = 31 * result + this.Green.contentHashCode()
        result = 31 * result + this.Blue.contentHashCode()
        return result
    }
}

public class GDIINFO(
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
    public var ptlPhysOffset: Foundation.POINTL = Foundation.POINTL(),
    public var szlPhysSize: Foundation.SIZE = Foundation.SIZE(),
    public var ulNumPalReg: UInt = 0u,
    public var ciDevice: COLORINFO = COLORINFO(),
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
    public var pHTPatA: Long = 0L,
    public var pHTPatB: Long = 0L,
    public var pHTPatC: Long = 0L,
    public var flShadeBlend: UInt = 0u,
    public var ulPhysicalPixelCharacteristics: UInt = 0u,
    public var ulPhysicalPixelGamma: UInt = 0u,
)

public data class GLYPHBITS(
    public var ptlOrigin: Foundation.POINTL = Foundation.POINTL(),
    public var sizlBitmap: Foundation.SIZE = Foundation.SIZE(),
    public var aj: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GLYPHBITS) return false
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

public data class GLYPHDATA(
    public var gdf: GLYPHDEF = GLYPHDEF(),
    public var hg: UInt = 0u,
    public var fxD: Int = 0,
    public var fxA: Int = 0,
    public var fxAB: Int = 0,
    public var fxInkTop: Int = 0,
    public var fxInkBottom: Int = 0,
    public var rclInk: Foundation.RECTL = Foundation.RECTL(),
    public var ptqD: POINTQF = POINTQF(),
)

public data class GLYPHDEF(public var pgb: Long = 0L, public var ppo: Long = 0L)

public data class GLYPHPOS(
    public var hg: UInt = 0u,
    public var pgdf: Long = 0L,
    public var ptl: Foundation.POINTL = Foundation.POINTL(),
)

public data class IFIEXTRA(
    public var ulIdentifier: UInt = 0u,
    public var dpFontSig: Int = 0,
    public var cig: UInt = 0u,
    public var dpDesignVector: Int = 0,
    public var dpAxesInfoW: Int = 0,
    public var aulReserved: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IFIEXTRA) return false
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

public class IFIMETRICS(
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
    public var ptlBaseline: Foundation.POINTL = Foundation.POINTL(),
    public var ptlAspect: Foundation.POINTL = Foundation.POINTL(),
    public var ptlCaret: Foundation.POINTL = Foundation.POINTL(),
    public var rclFontBox: Foundation.RECTL = Foundation.RECTL(),
    public var achVendId: UByteArray = UByteArray(4),
    public var cKerningPairs: UInt = 0u,
    public var ulPanoseCulture: UInt = 0u,
    public var panose: Graphics.Gdi.PANOSE = Graphics.Gdi.PANOSE(),
    public var Align: Long = 0L,
)

public data class INDIRECT_DISPLAY_INFO(
    public var DisplayAdapterLuid: Foundation.LUID = Foundation.LUID(),
    public var Flags: UInt = 0u,
    public var NumMonitors: UInt = 0u,
    public var DisplayAdapterTargetBase: UInt = 0u,
)

public data class LIGATURE(
    public var culSize: UInt = 0u,
    public var pwsz: PWSTR = 0L,
    public var chglyph: UInt = 0u,
    public var ahglyph: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LIGATURE) return false
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

public data class LINEATTRS(
    public var fl: UInt = 0u,
    public var iJoin: UInt = 0u,
    public var iEndCap: UInt = 0u,
    public var elWidth: FLOAT_LONG = FLOAT_LONG(),
    public var eMiterLimit: Float = 0.0f,
    public var cstyle: UInt = 0u,
    public var pstyle: Long = 0L,
    public var elStyleState: FLOAT_LONG = FLOAT_LONG(),
)

public data class MC_TIMING_REPORT(
    public var dwHorizontalFrequencyInHZ: UInt = 0u,
    public var dwVerticalFrequencyInHZ: UInt = 0u,
    public var bTimingStatusByte: UByte = 0u,
)

public class MIPI_DSI_CAPS(
    public var DSITypeMajor: UByte = 0u,
    public var DSITypeMinor: UByte = 0u,
    public var SpecVersionMajor: UByte = 0u,
    public var SpecVersionMinor: UByte = 0u,
    public var SpecVersionPatch: UByte = 0u,
    public var TargetMaximumReturnPacketSize: UShort = 0u,
    public var ResultCodeFlags: UByte = 0u,
    public var ResultCodeStatus: UByte = 0u,
    public var Revision: UByte = 0u,
    public var Level: UByte = 0u,
    public var DeviceClassHi: UByte = 0u,
    public var DeviceClassLo: UByte = 0u,
    public var ManufacturerHi: UByte = 0u,
    public var ManufacturerLo: UByte = 0u,
    public var ProductHi: UByte = 0u,
    public var ProductLo: UByte = 0u,
    public var LengthHi: UByte = 0u,
    public var LengthLo: UByte = 0u,
)

public data class MIPI_DSI_PACKET(
    public var Anonymous1: MIPI_DSI_PACKET_0 = MIPI_DSI_PACKET_0(),
    public var Anonymous2: MIPI_DSI_PACKET_1 = MIPI_DSI_PACKET_1(),
    public var EccFiller: UByte = 0u,
    public var Payload: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MIPI_DSI_PACKET) return false
        if (this.Anonymous1 != other.Anonymous1) return false
        if (this.Anonymous2 != other.Anonymous2) return false
        if (this.EccFiller != other.EccFiller) return false
        if (!this.Payload.contentEquals(other.Payload)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Anonymous1.hashCode()
        result = 31 * result + this.Anonymous2.hashCode()
        result = 31 * result + this.EccFiller.hashCode()
        result = 31 * result + this.Payload.contentHashCode()
        return result
    }
}

public data class MIPI_DSI_PACKET_0(public var DataId: UByte = 0u, public var Anonymous: MIPI_DSI_PACKET_0_0 = MIPI_DSI_PACKET_0_0())

public data class MIPI_DSI_PACKET_0_0(public var _bitfield: UByte = 0u)

public data class MIPI_DSI_PACKET_1(public var Anonymous: MIPI_DSI_PACKET_1_0 = MIPI_DSI_PACKET_1_0(), public var LongWriteWordCount: UShort = 0u)

public data class MIPI_DSI_PACKET_1_0(public var Data0: UByte = 0u, public var Data1: UByte = 0u)

public data class MIPI_DSI_RESET(public var Flags: UInt = 0u, public var Anonymous: MIPI_DSI_RESET_0 = MIPI_DSI_RESET_0())

public data class MIPI_DSI_RESET_0(public var Anonymous: MIPI_DSI_RESET_0_0 = MIPI_DSI_RESET_0_0(), public var Results: UInt = 0u)

public data class MIPI_DSI_RESET_0_0(public var _bitfield: UInt = 0u)

public data class MIPI_DSI_TRANSMISSION(
    public var TotalBufferSize: UInt = 0u,
    public var PacketCount: UByte = 0u,
    public var FailedPacket: UByte = 0u,
    public var Anonymous: MIPI_DSI_TRANSMISSION_0 = MIPI_DSI_TRANSMISSION_0(),
    public var ReadWordCount: UShort = 0u,
    public var FinalCommandExtraPayload: UShort = 0u,
    public var MipiErrors: UShort = 0u,
    public var HostErrors: UShort = 0u,
    public var Packets: List<MIPI_DSI_PACKET> = List(1) { MIPI_DSI_PACKET() },
)

public data class MIPI_DSI_TRANSMISSION_0(public var _bitfield: UShort = 0u)

public data class OUTPUT_WIRE_FORMAT(public var ColorEncoding: OUTPUT_COLOR_ENCODING = 0, public var BitsPerPixel: UInt = 0u)

public data class PALOBJ(public var ulReserved: UInt = 0u)

public data class PANEL_BRIGHTNESS_SENSOR_DATA(
    public var Anonymous: PANEL_BRIGHTNESS_SENSOR_DATA_0 = PANEL_BRIGHTNESS_SENSOR_DATA_0(),
    public var AlsReading: Float = 0.0f,
    public var ChromaticityCoordinate: CHROMATICITY_COORDINATE = CHROMATICITY_COORDINATE(),
    public var ColorTemperature: Float = 0.0f,
)

public data class PANEL_BRIGHTNESS_SENSOR_DATA_0(public var Anonymous: PANEL_BRIGHTNESS_SENSOR_DATA_0_0 = PANEL_BRIGHTNESS_SENSOR_DATA_0_0(), public var Value: UInt = 0u)

public data class PANEL_BRIGHTNESS_SENSOR_DATA_0_0(public var _bitfield: UInt = 0u)

public data class PANEL_GET_BACKLIGHT_REDUCTION(
    public var BacklightUsersetting: UShort = 0u,
    public var BacklightEffective: UShort = 0u,
    public var GammaRamp: BACKLIGHT_REDUCTION_GAMMA_RAMP = BACKLIGHT_REDUCTION_GAMMA_RAMP(),
)

public data class PANEL_GET_BRIGHTNESS(public var Version: BRIGHTNESS_INTERFACE_VERSION = 0, public var Anonymous: PANEL_GET_BRIGHTNESS_0 = PANEL_GET_BRIGHTNESS_0())

public data class PANEL_GET_BRIGHTNESS_0(public var Level: UByte = 0u, public var Anonymous: PANEL_GET_BRIGHTNESS_0_0 = PANEL_GET_BRIGHTNESS_0_0())

public data class PANEL_GET_BRIGHTNESS_0_0(public var CurrentInMillinits: UInt = 0u, public var TargetInMillinits: UInt = 0u)

public data class PANEL_QUERY_BRIGHTNESS_CAPS(public var Version: BRIGHTNESS_INTERFACE_VERSION = 0, public var Anonymous: PANEL_QUERY_BRIGHTNESS_CAPS_0 = PANEL_QUERY_BRIGHTNESS_CAPS_0())

public data class PANEL_QUERY_BRIGHTNESS_CAPS_0(public var Anonymous: PANEL_QUERY_BRIGHTNESS_CAPS_0_0 = PANEL_QUERY_BRIGHTNESS_CAPS_0_0(), public var Value: UInt = 0u)

public data class PANEL_QUERY_BRIGHTNESS_CAPS_0_0(public var _bitfield: UInt = 0u)

public data class PANEL_QUERY_BRIGHTNESS_RANGES(public var Version: BRIGHTNESS_INTERFACE_VERSION = 0, public var Anonymous: PANEL_QUERY_BRIGHTNESS_RANGES_0 = PANEL_QUERY_BRIGHTNESS_RANGES_0())

public data class PANEL_QUERY_BRIGHTNESS_RANGES_0(public var BrightnessLevel: BRIGHTNESS_LEVEL = BRIGHTNESS_LEVEL(), public var NitRanges: BRIGHTNESS_NIT_RANGES = BRIGHTNESS_NIT_RANGES())

public data class PANEL_SET_BACKLIGHT_OPTIMIZATION(public var Level: BACKLIGHT_OPTIMIZATION_LEVEL = 0)

public data class PANEL_SET_BRIGHTNESS(public var Version: BRIGHTNESS_INTERFACE_VERSION = 0, public var Anonymous: PANEL_SET_BRIGHTNESS_0 = PANEL_SET_BRIGHTNESS_0())

public data class PANEL_SET_BRIGHTNESS_0(public var Level: UByte = 0u, public var Anonymous: PANEL_SET_BRIGHTNESS_0_0 = PANEL_SET_BRIGHTNESS_0_0())

public data class PANEL_SET_BRIGHTNESS_0_0(
    public var Millinits: UInt = 0u,
    public var TransitionTimeInMs: UInt = 0u,
    public var SensorData: PANEL_BRIGHTNESS_SENSOR_DATA = PANEL_BRIGHTNESS_SENSOR_DATA(),
)

public data class PANEL_SET_BRIGHTNESS_STATE(public var Anonymous: PANEL_SET_BRIGHTNESS_STATE_0 = PANEL_SET_BRIGHTNESS_STATE_0())

public data class PANEL_SET_BRIGHTNESS_STATE_0(public var Anonymous: PANEL_SET_BRIGHTNESS_STATE_0_0 = PANEL_SET_BRIGHTNESS_STATE_0_0(), public var Value: UInt = 0u)

public data class PANEL_SET_BRIGHTNESS_STATE_0_0(public var _bitfield: UInt = 0u)

public data class PATHDATA(
    public var flags: UInt = 0u,
    public var count: UInt = 0u,
    public var pptfx: Long = 0L,
)

public data class PATHOBJ(public var fl: UInt = 0u, public var cCurves: UInt = 0u)

public data class PERBANDINFO(
    public var bRepeatThisBand: BOOL = 0,
    public var szlBand: Foundation.SIZE = Foundation.SIZE(),
    public var ulHorzRes: UInt = 0u,
    public var ulVertRes: UInt = 0u,
)

public data class PHYSICAL_MONITOR(public var hPhysicalMonitor: Foundation.HANDLE = Foundation.HANDLE(), public var szPhysicalMonitorDescription: UShortArray = UShortArray(128)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PHYSICAL_MONITOR) return false
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

public data class POINTE(public var x: Float = 0.0f, public var y: Float = 0.0f)

public data class POINTFIX(public var x: Int = 0, public var y: Int = 0)

public data class POINTQF(public var x: Long = 0L, public var y: Long = 0L)

public data class RECTFX(
    public var xLeft: Int = 0,
    public var yTop: Int = 0,
    public var xRight: Int = 0,
    public var yBottom: Int = 0,
)

public data class RUN(public var iStart: Int = 0, public var iStop: Int = 0)

public data class SET_ACTIVE_COLOR_PROFILE_NAME(public var ColorProfileName: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SET_ACTIVE_COLOR_PROFILE_NAME) return false
        if (!this.ColorProfileName.contentEquals(other.ColorProfileName)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.ColorProfileName.contentHashCode()
    }
}

public data class STROBJ(
    public var cGlyphs: UInt = 0u,
    public var flAccel: UInt = 0u,
    public var ulCharInc: UInt = 0u,
    public var rclBkGround: Foundation.RECTL = Foundation.RECTL(),
    public var pgp: Long = 0L,
    public var pwszOrg: PWSTR = 0L,
)

public data class SURFOBJ(
    public var dhsurf: DHSURF = 0L,
    public var hsurf: HSURF = 0L,
    public var dhpdev: DHPDEV = 0L,
    public var hdev: HDEV = 0L,
    public var sizlBitmap: Foundation.SIZE = Foundation.SIZE(),
    public var cjBits: UInt = 0u,
    public var pvBits: Long = 0L,
    public var pvScan0: Long = 0L,
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

public data class TYPE1_FONT(
    public var hPFM: Foundation.HANDLE = Foundation.HANDLE(),
    public var hPFB: Foundation.HANDLE = Foundation.HANDLE(),
    public var ulIdentifier: UInt = 0u,
)

public data class VGA_CHAR(public var Char: Byte = 0, public var Attributes: Byte = 0)

public class VIDEOPARAMETERS(
    public var Guid: GUID = GUID(),
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
    public var bCP_APSTriggerBits: UInt = 0u,
    public var bOEMCopyProtection: UByteArray = UByteArray(256),
)

public data class VIDEO_BANK_SELECT(
    public var Length: UInt = 0u,
    public var Size: UInt = 0u,
    public var BankingFlags: UInt = 0u,
    public var BankingType: UInt = 0u,
    public var PlanarHCBankingType: UInt = 0u,
    public var BitmapWidthInBytes: UInt = 0u,
    public var BitmapSize: UInt = 0u,
    public var Granularity: UInt = 0u,
    public var PlanarHCGranularity: UInt = 0u,
    public var CodeOffset: UInt = 0u,
    public var PlanarHCBankCodeOffset: UInt = 0u,
    public var PlanarHCEnableCodeOffset: UInt = 0u,
    public var PlanarHCDisableCodeOffset: UInt = 0u,
)

public data class VIDEO_BRIGHTNESS_POLICY(
    public var DefaultToBiosPolicy: Boolean = false,
    public var LevelCount: UByte = 0u,
    public var Level: List<VIDEO_BRIGHTNESS_POLICY_0> = List(1) { VIDEO_BRIGHTNESS_POLICY_0() },
)

public data class VIDEO_BRIGHTNESS_POLICY_0(public var BatteryLevel: UByte = 0u, public var Brightness: UByte = 0u)

public data class VIDEO_CLUT(
    public var NumEntries: UShort = 0u,
    public var FirstEntry: UShort = 0u,
    public var LookupTable: List<VIDEO_CLUT_0> = List(1) { VIDEO_CLUT_0() },
)

public data class VIDEO_CLUT_0(public var RgbArray: VIDEO_CLUTDATA = VIDEO_CLUTDATA(), public var RgbLong: UInt = 0u)

public data class VIDEO_CLUTDATA(
    public var Red: UByte = 0u,
    public var Green: UByte = 0u,
    public var Blue: UByte = 0u,
    public var Unused: UByte = 0u,
)

public class VIDEO_COLOR_CAPABILITIES(
    public var Length: UInt = 0u,
    public var AttributeFlags: UInt = 0u,
    public var RedPhosphoreDecay: Int = 0,
    public var GreenPhosphoreDecay: Int = 0,
    public var BluePhosphoreDecay: Int = 0,
    public var WhiteChromaticity_x: Int = 0,
    public var WhiteChromaticity_y: Int = 0,
    public var WhiteChromaticity_Y: Int = 0,
    public var RedChromaticity_x: Int = 0,
    public var RedChromaticity_y: Int = 0,
    public var GreenChromaticity_x: Int = 0,
    public var GreenChromaticity_y: Int = 0,
    public var BlueChromaticity_x: Int = 0,
    public var BlueChromaticity_y: Int = 0,
    public var WhiteGamma: Int = 0,
    public var RedGamma: Int = 0,
    public var GreenGamma: Int = 0,
    public var BlueGamma: Int = 0,
)

public data class VIDEO_COLOR_LUT_DATA(
    public var Length: UInt = 0u,
    public var LutDataFormat: UInt = 0u,
    public var LutData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VIDEO_COLOR_LUT_DATA) return false
        if (this.Length != other.Length) return false
        if (this.LutDataFormat != other.LutDataFormat) return false
        if (!this.LutData.contentEquals(other.LutData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Length.hashCode()
        result = 31 * result + this.LutDataFormat.hashCode()
        result = 31 * result + this.LutData.contentHashCode()
        return result
    }
}

public data class VIDEO_CURSOR_ATTRIBUTES(
    public var Width: UShort = 0u,
    public var Height: UShort = 0u,
    public var Column: Short = 0,
    public var Row: Short = 0,
    public var Rate: UByte = 0u,
    public var Enable: UByte = 0u,
)

public data class VIDEO_CURSOR_POSITION(public var Column: Short = 0, public var Row: Short = 0)

public data class VIDEO_DEVICE_SESSION_STATUS(public var bEnable: UInt = 0u, public var bSuccess: UInt = 0u)

public data class VIDEO_HARDWARE_STATE(public var StateHeader: Long = 0L, public var StateLength: UInt = 0u)

public class VIDEO_HARDWARE_STATE_HEADER(
    public var Length: UInt = 0u,
    public var PortValue: UByteArray = UByteArray(48),
    public var AttribIndexDataState: UInt = 0u,
    public var BasicSequencerOffset: UInt = 0u,
    public var BasicCrtContOffset: UInt = 0u,
    public var BasicGraphContOffset: UInt = 0u,
    public var BasicAttribContOffset: UInt = 0u,
    public var BasicDacOffset: UInt = 0u,
    public var BasicLatchesOffset: UInt = 0u,
    public var ExtendedSequencerOffset: UInt = 0u,
    public var ExtendedCrtContOffset: UInt = 0u,
    public var ExtendedGraphContOffset: UInt = 0u,
    public var ExtendedAttribContOffset: UInt = 0u,
    public var ExtendedDacOffset: UInt = 0u,
    public var ExtendedValidatorStateOffset: UInt = 0u,
    public var ExtendedMiscDataOffset: UInt = 0u,
    public var PlaneLength: UInt = 0u,
    public var Plane1Offset: UInt = 0u,
    public var Plane2Offset: UInt = 0u,
    public var Plane3Offset: UInt = 0u,
    public var Plane4Offset: UInt = 0u,
    public var VGAStateFlags: UInt = 0u,
    public var DIBOffset: UInt = 0u,
    public var DIBBitsPerPixel: UInt = 0u,
    public var DIBXResolution: UInt = 0u,
    public var DIBYResolution: UInt = 0u,
    public var DIBXlatOffset: UInt = 0u,
    public var DIBXlatLength: UInt = 0u,
    public var VesaInfoOffset: UInt = 0u,
    public var FrameBufferData: Long = 0L,
)

public data class VIDEO_LOAD_FONT_INFORMATION(
    public var WidthInPixels: UShort = 0u,
    public var HeightInPixels: UShort = 0u,
    public var FontSize: UInt = 0u,
    public var Font: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VIDEO_LOAD_FONT_INFORMATION) return false
        if (this.WidthInPixels != other.WidthInPixels) return false
        if (this.HeightInPixels != other.HeightInPixels) return false
        if (this.FontSize != other.FontSize) return false
        if (!this.Font.contentEquals(other.Font)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.WidthInPixels.hashCode()
        result = 31 * result + this.HeightInPixels.hashCode()
        result = 31 * result + this.FontSize.hashCode()
        result = 31 * result + this.Font.contentHashCode()
        return result
    }
}

public data class VIDEO_LUT_RGB256WORDS(
    public var Red: UShortArray = UShortArray(256),
    public var Green: UShortArray = UShortArray(256),
    public var Blue: UShortArray = UShortArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VIDEO_LUT_RGB256WORDS) return false
        if (!this.Red.contentEquals(other.Red)) return false
        if (!this.Green.contentEquals(other.Green)) return false
        if (!this.Blue.contentEquals(other.Blue)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Red.contentHashCode()
        result = 31 * result + this.Green.contentHashCode()
        result = 31 * result + this.Blue.contentHashCode()
        return result
    }
}

public data class VIDEO_MEMORY(public var RequestedVirtualAddress: Long = 0L)

public data class VIDEO_MEMORY_INFORMATION(
    public var VideoRamBase: Long = 0L,
    public var VideoRamLength: UInt = 0u,
    public var FrameBufferBase: Long = 0L,
    public var FrameBufferLength: UInt = 0u,
)

public data class VIDEO_MODE(public var RequestedMode: UInt = 0u)

public class VIDEO_MODE_INFORMATION(
    public var Length: UInt = 0u,
    public var ModeIndex: UInt = 0u,
    public var VisScreenWidth: UInt = 0u,
    public var VisScreenHeight: UInt = 0u,
    public var ScreenStride: UInt = 0u,
    public var NumberOfPlanes: UInt = 0u,
    public var BitsPerPlane: UInt = 0u,
    public var Frequency: UInt = 0u,
    public var XMillimeter: UInt = 0u,
    public var YMillimeter: UInt = 0u,
    public var NumberRedBits: UInt = 0u,
    public var NumberGreenBits: UInt = 0u,
    public var NumberBlueBits: UInt = 0u,
    public var RedMask: UInt = 0u,
    public var GreenMask: UInt = 0u,
    public var BlueMask: UInt = 0u,
    public var AttributeFlags: UInt = 0u,
    public var VideoMemoryBitmapWidth: UInt = 0u,
    public var VideoMemoryBitmapHeight: UInt = 0u,
    public var DriverSpecificAttributeFlags: UInt = 0u,
)

public data class VIDEO_MONITOR_DESCRIPTOR(public var DescriptorSize: UInt = 0u, public var Descriptor: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VIDEO_MONITOR_DESCRIPTOR) return false
        if (this.DescriptorSize != other.DescriptorSize) return false
        if (!this.Descriptor.contentEquals(other.Descriptor)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.DescriptorSize.hashCode()
        result = 31 * result + this.Descriptor.contentHashCode()
        return result
    }
}

public data class VIDEO_NUM_MODES(public var NumModes: UInt = 0u, public var ModeInformationLength: UInt = 0u)

public data class VIDEO_PALETTE_DATA(
    public var NumEntries: UShort = 0u,
    public var FirstEntry: UShort = 0u,
    public var Colors: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VIDEO_PALETTE_DATA) return false
        if (this.NumEntries != other.NumEntries) return false
        if (this.FirstEntry != other.FirstEntry) return false
        if (!this.Colors.contentEquals(other.Colors)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.NumEntries.hashCode()
        result = 31 * result + this.FirstEntry.hashCode()
        result = 31 * result + this.Colors.contentHashCode()
        return result
    }
}

public class VIDEO_PERFORMANCE_COUNTER(
    public var NbOfAllocationEvicted: ULongArray = ULongArray(10),
    public var NbOfAllocationMarked: ULongArray = ULongArray(10),
    public var NbOfAllocationRestored: ULongArray = ULongArray(10),
    public var KBytesEvicted: ULongArray = ULongArray(10),
    public var KBytesMarked: ULongArray = ULongArray(10),
    public var KBytesRestored: ULongArray = ULongArray(10),
    public var NbProcessCommited: ULong = 0uL,
    public var NbAllocationCommited: ULong = 0uL,
    public var NbAllocationMarked: ULong = 0uL,
    public var KBytesAllocated: ULong = 0uL,
    public var KBytesAvailable: ULong = 0uL,
    public var KBytesCurMarked: ULong = 0uL,
    public var Reference: ULong = 0uL,
    public var Unreference: ULong = 0uL,
    public var TrueReference: ULong = 0uL,
    public var NbOfPageIn: ULong = 0uL,
    public var KBytesPageIn: ULong = 0uL,
    public var NbOfPageOut: ULong = 0uL,
    public var KBytesPageOut: ULong = 0uL,
    public var NbOfRotateOut: ULong = 0uL,
    public var KBytesRotateOut: ULong = 0uL,
)

public data class VIDEO_POINTER_ATTRIBUTES(
    public var Flags: UInt = 0u,
    public var Width: UInt = 0u,
    public var Height: UInt = 0u,
    public var WidthInBytes: UInt = 0u,
    public var Enable: UInt = 0u,
    public var Column: Short = 0,
    public var Row: Short = 0,
    public var Pixels: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VIDEO_POINTER_ATTRIBUTES) return false
        if (this.Flags != other.Flags) return false
        if (this.Width != other.Width) return false
        if (this.Height != other.Height) return false
        if (this.WidthInBytes != other.WidthInBytes) return false
        if (this.Enable != other.Enable) return false
        if (this.Column != other.Column) return false
        if (this.Row != other.Row) return false
        if (!this.Pixels.contentEquals(other.Pixels)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Flags.hashCode()
        result = 31 * result + this.Width.hashCode()
        result = 31 * result + this.Height.hashCode()
        result = 31 * result + this.WidthInBytes.hashCode()
        result = 31 * result + this.Enable.hashCode()
        result = 31 * result + this.Column.hashCode()
        result = 31 * result + this.Row.hashCode()
        result = 31 * result + this.Pixels.contentHashCode()
        return result
    }
}

public data class VIDEO_POINTER_CAPABILITIES(
    public var Flags: UInt = 0u,
    public var MaxWidth: UInt = 0u,
    public var MaxHeight: UInt = 0u,
    public var HWPtrBitmapStart: UInt = 0u,
    public var HWPtrBitmapEnd: UInt = 0u,
)

public data class VIDEO_POINTER_POSITION(public var Column: Short = 0, public var Row: Short = 0)

public data class VIDEO_POWER_MANAGEMENT(
    public var Length: UInt = 0u,
    public var DPMSVersion: UInt = 0u,
    public var PowerState: UInt = 0u,
)

public data class VIDEO_PUBLIC_ACCESS_RANGES(
    public var InIoSpace: UInt = 0u,
    public var MappedInIoSpace: UInt = 0u,
    public var VirtualAddress: Long = 0L,
)

public data class VIDEO_QUERY_PERFORMANCE_COUNTER(public var BufferSize: UInt = 0u, public var Buffer: Long = 0L)

public data class VIDEO_REGISTER_VDM(public var MinimumStateSize: UInt = 0u)

public data class VIDEO_SHARE_MEMORY(
    public var ProcessHandle: Foundation.HANDLE = Foundation.HANDLE(),
    public var ViewOffset: UInt = 0u,
    public var ViewSize: UInt = 0u,
    public var RequestedVirtualAddress: Long = 0L,
)

public data class VIDEO_SHARE_MEMORY_INFORMATION(
    public var SharedViewOffset: UInt = 0u,
    public var SharedViewSize: UInt = 0u,
    public var VirtualAddress: Long = 0L,
)

public data class VIDEO_VDM(public var ProcessHandle: Foundation.HANDLE = Foundation.HANDLE())

public data class VIDEO_WIN32K_CALLBACKS(
    public var PhysDisp: Long = 0L,
    public var Callout: PVIDEO_WIN32K_CALLOUT = null,
    public var bACPI: UInt = 0u,
    public var pPhysDeviceObject: Foundation.HANDLE = Foundation.HANDLE(),
    public var DualviewFlags: UInt = 0u,
)

public data class VIDEO_WIN32K_CALLBACKS_PARAMS(
    public var CalloutType: VIDEO_WIN32K_CALLBACKS_PARAMS_TYPE = 0,
    public var PhysDisp: Long = 0L,
    public var Param: ULong = 0uL,
    public var Status: Int = 0,
    public var LockUserSession: Boolean = false,
    public var IsPostDevice: Boolean = false,
    public var SurpriseRemoval: Boolean = false,
    public var WaitForQueueReady: Boolean = false,
)

public data class WCRUN(
    public var wcLow: UShort = 0u,
    public var cGlyphs: UShort = 0u,
    public var phg: Long = 0L,
)

public data class WNDOBJ(
    public var coClient: CLIPOBJ = CLIPOBJ(),
    public var pvConsumer: Long = 0L,
    public var rclClient: Foundation.RECTL = Foundation.RECTL(),
    public var psoOwner: Long = 0L,
)

public data class XFORML(
    public var eM11: Float = 0.0f,
    public var eM12: Float = 0.0f,
    public var eM21: Float = 0.0f,
    public var eM22: Float = 0.0f,
    public var eDx: Float = 0.0f,
    public var eDy: Float = 0.0f,
)

public data class XFORMOBJ(public var ulReserved: UInt = 0u)

public data class XLATEOBJ(
    public var iUniq: UInt = 0u,
    public var flXlate: UInt = 0u,
    public var iSrcType: UShort = 0u,
    public var iDstType: UShort = 0u,
    public var cEntries: UInt = 0u,
    public var pulXlate: Long = 0L,
)
