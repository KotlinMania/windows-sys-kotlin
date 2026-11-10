package io.github.kotlinmania.windowssys.windows.win32.devices.display

import io.github.kotlinmania.windowssys.U128
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.s
import io.github.kotlinmania.windowssys.core.w
import io.github.kotlinmania.windowssys.windows.win32.foundation.Devpropkey

public val AR_DISABLED: ArState = 1

public val AR_DOCKED: ArState = 64

public val AR_ENABLED: ArState = 0

public val AR_LAPTOP: ArState = 128

public val AR_MULTIMON: ArState = 8

public val AR_NOSENSOR: ArState = 16

public val AR_NOT_SUPPORTED: ArState = 32

public val AR_REMOTESESSION: ArState = 4

public val AR_SUPPRESSED: ArState = 2

public val BITMAP_ARRAY_BYTE: UInt = 3u

public val BITMAP_BITS_BYTE_ALIGN: UInt = 8u

public val BITMAP_BITS_PIXEL: UInt = 1u

public val BITMAP_BITS_WORD_ALIGN: UInt = 16u

public val BITMAP_PLANES: UInt = 1u

public val BMF_16BPP: Int = 4

public val BMF_1BPP: Int = 1

public val BMF_24BPP: Int = 5

public val BMF_32BPP: Int = 6

public val BMF_4BPP: Int = 2

public val BMF_4RLE: Int = 7

public val BMF_8BPP: Int = 3

public val BMF_8RLE: Int = 8

public val BMF_ACC_NOTIFY: UInt = 32768u

public val BMF_DONTCACHE: UInt = 4u

public val BMF_JPEG: Int = 9

public val BMF_KMSECTION: UInt = 16u

public val BMF_NOTSYSMEM: UInt = 32u

public val BMF_NOZEROINIT: UInt = 2u

public val BMF_PNG: Int = 10

public val BMF_RESERVED: UInt = 15872u

public val BMF_RMT_ENTER: UInt = 16384u

public val BMF_TEMP_ALPHA: UInt = 256u

public val BMF_TOPDOWN: UInt = 1u

public val BMF_UMPDMEM: UInt = 128u

public val BMF_USERMEM: UInt = 8u

public val BMF_WINDOW_BLT: UInt = 64u

public val BRIGHTNESS_INTERFACE_VERSION_1: BrightnessInterfaceVersion = 1

public val BRIGHTNESS_INTERFACE_VERSION_2: BrightnessInterfaceVersion = 2

public val BRIGHTNESS_INTERFACE_VERSION_3: BrightnessInterfaceVersion = 3

public val BRIGHTNESS_MAX_LEVEL_COUNT: UInt = 103u

public val BRIGHTNESS_MAX_NIT_RANGE_COUNT: UInt = 16u

public val BR_CMYKCOLOR: UInt = 4u

public val BR_DEVICE_ICM: UInt = 1u

public val BR_HOST_ICM: UInt = 2u

public val BR_ORIGCOLOR: UInt = 8u

public val BACKLIGHT_OPTIMIZATION_DESKTOP: BacklightOptimizationLevel = 1

public val BACKLIGHT_OPTIMIZATION_DIMMED: BacklightOptimizationLevel = 3

public val BACKLIGHT_OPTIMIZATION_DISABLE: BacklightOptimizationLevel = 0

public val BACKLIGHT_OPTIMIZATION_DYNAMIC: BacklightOptimizationLevel = 2

public val BACKLIGHT_OPTIMIZATION_EDR: BacklightOptimizationLevel = 4

public val BLACK_SCREEN_DIAGNOSTICS_DATA: BlackScreenDiagnosticsCalloutParam = 1

public val BLACK_SCREEN_DISPLAY_RECOVERY: BlackScreenDiagnosticsCalloutParam = 2

public val CDBEX_CROSSADAPTER: UInt = 8u

public val CDBEX_DXINTEROP: UInt = 2u

public val CDBEX_NTSHAREDSURFACEHANDLE: UInt = 4u

public val CDBEX_REDIRECTION: UInt = 1u

public val CDBEX_REUSE: UInt = 16u

public val CD_ANY: Int = 4

public val CD_LEFTDOWN: Int = 1

public val CD_LEFTUP: Int = 3

public val CD_LEFTWARDS: Int = 1

public val CD_RIGHTDOWN: Int = 0

public val CD_RIGHTUP: Int = 2

public val CD_UPWARDS: Int = 2

public val CHAR_TYPE_LEADING: UInt = 2u

public val CHAR_TYPE_SBCS: UInt = 0u

public val CHAR_TYPE_TRAILING: UInt = 3u

public val COLORSPACE_TRANSFORM_DATA_TYPE_FIXED_POINT: ColorspaceTransformDataType = 0

public val COLORSPACE_TRANSFORM_DATA_TYPE_FLOAT: ColorspaceTransformDataType = 1

public val COLORSPACE_TRANSFORM_TYPE_DEFAULT: ColorspaceTransformType = 1

public val COLORSPACE_TRANSFORM_TYPE_DXGI_1: ColorspaceTransformType = 3

public val COLORSPACE_TRANSFORM_TYPE_MATRIX_3X4: ColorspaceTransformType = 4

public val COLORSPACE_TRANSFORM_TYPE_MATRIX_V2: ColorspaceTransformType = 5

public val COLORSPACE_TRANSFORM_TYPE_RGB256X3X16: ColorspaceTransformType = 2

public val COLORSPACE_TRANSFORM_TYPE_UNINITIALIZED: ColorspaceTransformType = 0

public val COLORSPACE_TRANSFORM_VERSION_1: ColorspaceTransformTargetCapsVersion = 1

public val COLORSPACE_TRANSFORM_VERSION_DEFAULT: ColorspaceTransformTargetCapsVersion = 0

public val COLORSPACE_TRANSFORM_VERSION_NOT_SUPPORTED: ColorspaceTransformTargetCapsVersion = 0

public val CT_RECTANGLES: Int = 0

public val COLOR_SPACE_TRANSFORM_STAGE_CONTROL_BYPASS: ColorspaceTransformStageControl = 2

public val COLOR_SPACE_TRANSFORM_STAGE_CONTROL_ENABLE: ColorspaceTransformStageControl = 1

public val COLOR_SPACE_TRANSFORM_STAGE_CONTROL_NO_CHANGE: ColorspaceTransformStageControl = 0

public val DCR_DRIVER: UInt = 1u

public val DCR_HALFTONE: UInt = 2u

public val DCR_SOLID: UInt = 0u

public val DCT_DEFAULT: DsiControlTransmissionMode = 0

public val DCT_FORCE_HIGH_PERFORMANCE: DsiControlTransmissionMode = 2

public val DCT_FORCE_LOW_POWER: DsiControlTransmissionMode = 1

public val DC_COMPLEX: UInt = 3u

public val DC_RECT: UInt = 1u

public val DC_TRIVIAL: UInt = 0u

public val DDI_DRIVER_VERSION_NT4: UInt = 131072u

public val DDI_DRIVER_VERSION_NT5: UInt = 196608u

public val DDI_DRIVER_VERSION_NT5_01: UInt = 196864u

public val DDI_DRIVER_VERSION_NT5_01_SP1: UInt = 196865u

public val DDI_DRIVER_VERSION_SP3: UInt = 131075u

public val DDI_ERROR: UInt = 4294967295u

public val DD_FULLSCREEN_VIDEO_DEVICE_NAME: Pcwstr = w("\\Device\\FSVideo")

public val DEVHTADJF_ADDITIVE_DEVICE: UInt = 2u

public val DEVHTADJF_COLOR_DEVICE: UInt = 1u

public val DEVPKEY_DEVICE_ACTIVITY_ID: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xc50a3f10aa5c4247uL, 0xb830d6a6f8eaa310uL)), pid = 4u)

public val DEVPKEY_DEVICE_ADAPTER_LUID: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xc50a3f10aa5c4247uL, 0xb830d6a6f8eaa310uL)), pid = 3u)

public val DEVPKEY_DEVICE_TERMINAL_LUID: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xc50a3f10aa5c4247uL, 0xb830d6a6f8eaa310uL)), pid = 2u)

public val DEVPKEY_INDIRECT_DISPLAY: Devpropkey = Devpropkey(fmtid = Guid.fromU128(U128(0xc50a3f10aa5c4247uL, 0xb830d6a6f8eaa310uL)), pid = 1u)

public val DISPLAYCONFIG_DEVICE_INFO_GET_ADAPTER_NAME: DisplayconfigDeviceInfoType = 4

public val DISPLAYCONFIG_DEVICE_INFO_GET_ADVANCED_COLOR_INFO: DisplayconfigDeviceInfoType = 9

public val DISPLAYCONFIG_DEVICE_INFO_GET_MONITOR_SPECIALIZATION: DisplayconfigDeviceInfoType = 12

public val DISPLAYCONFIG_DEVICE_INFO_GET_SDR_WHITE_LEVEL: DisplayconfigDeviceInfoType = 11

public val DISPLAYCONFIG_DEVICE_INFO_GET_SOURCE_NAME: DisplayconfigDeviceInfoType = 1

public val DISPLAYCONFIG_DEVICE_INFO_GET_SUPPORT_VIRTUAL_RESOLUTION: DisplayconfigDeviceInfoType = 7

public val DISPLAYCONFIG_DEVICE_INFO_GET_TARGET_BASE_TYPE: DisplayconfigDeviceInfoType = 6

public val DISPLAYCONFIG_DEVICE_INFO_GET_TARGET_NAME: DisplayconfigDeviceInfoType = 2

public val DISPLAYCONFIG_DEVICE_INFO_GET_TARGET_PREFERRED_MODE: DisplayconfigDeviceInfoType = 3

public val DISPLAYCONFIG_DEVICE_INFO_SET_ADVANCED_COLOR_STATE: DisplayconfigDeviceInfoType = 10

public val DISPLAYCONFIG_DEVICE_INFO_SET_MONITOR_SPECIALIZATION: DisplayconfigDeviceInfoType = 13

public val DISPLAYCONFIG_DEVICE_INFO_SET_SUPPORT_VIRTUAL_RESOLUTION: DisplayconfigDeviceInfoType = 8

public val DISPLAYCONFIG_DEVICE_INFO_SET_TARGET_PERSISTENCE: DisplayconfigDeviceInfoType = 5

public val DISPLAYCONFIG_MODE_INFO_TYPE_DESKTOP_IMAGE: DisplayconfigModeInfoType = 3

public val DISPLAYCONFIG_MODE_INFO_TYPE_SOURCE: DisplayconfigModeInfoType = 1

public val DISPLAYCONFIG_MODE_INFO_TYPE_TARGET: DisplayconfigModeInfoType = 2

public val DISPLAYCONFIG_OUTPUT_TECHNOLOGY_COMPONENT_VIDEO: DisplayconfigVideoOutputTechnology = 3

public val DISPLAYCONFIG_OUTPUT_TECHNOLOGY_COMPOSITE_VIDEO: DisplayconfigVideoOutputTechnology = 2

public val DISPLAYCONFIG_OUTPUT_TECHNOLOGY_DISPLAYPORT_EMBEDDED: DisplayconfigVideoOutputTechnology = 11

public val DISPLAYCONFIG_OUTPUT_TECHNOLOGY_DISPLAYPORT_EXTERNAL: DisplayconfigVideoOutputTechnology = 10

public val DISPLAYCONFIG_OUTPUT_TECHNOLOGY_DISPLAYPORT_USB_TUNNEL: DisplayconfigVideoOutputTechnology = 18

public val DISPLAYCONFIG_OUTPUT_TECHNOLOGY_DVI: DisplayconfigVideoOutputTechnology = 4

public val DISPLAYCONFIG_OUTPUT_TECHNOLOGY_D_JPN: DisplayconfigVideoOutputTechnology = 8

public val DISPLAYCONFIG_OUTPUT_TECHNOLOGY_HD15: DisplayconfigVideoOutputTechnology = 0

public val DISPLAYCONFIG_OUTPUT_TECHNOLOGY_HDMI: DisplayconfigVideoOutputTechnology = 5

public val DISPLAYCONFIG_OUTPUT_TECHNOLOGY_INDIRECT_VIRTUAL: DisplayconfigVideoOutputTechnology = 17

public val DISPLAYCONFIG_OUTPUT_TECHNOLOGY_INDIRECT_WIRED: DisplayconfigVideoOutputTechnology = 16

public val DISPLAYCONFIG_OUTPUT_TECHNOLOGY_INTERNAL: DisplayconfigVideoOutputTechnology = -2147483648.toInt()

public val DISPLAYCONFIG_OUTPUT_TECHNOLOGY_LVDS: DisplayconfigVideoOutputTechnology = 6

public val DISPLAYCONFIG_OUTPUT_TECHNOLOGY_MIRACAST: DisplayconfigVideoOutputTechnology = 15

public val DISPLAYCONFIG_OUTPUT_TECHNOLOGY_OTHER: DisplayconfigVideoOutputTechnology = -1

public val DISPLAYCONFIG_OUTPUT_TECHNOLOGY_SDI: DisplayconfigVideoOutputTechnology = 9

public val DISPLAYCONFIG_OUTPUT_TECHNOLOGY_SDTVDONGLE: DisplayconfigVideoOutputTechnology = 14

public val DISPLAYCONFIG_OUTPUT_TECHNOLOGY_SVIDEO: DisplayconfigVideoOutputTechnology = 1

public val DISPLAYCONFIG_OUTPUT_TECHNOLOGY_UDI_EMBEDDED: DisplayconfigVideoOutputTechnology = 13

public val DISPLAYCONFIG_OUTPUT_TECHNOLOGY_UDI_EXTERNAL: DisplayconfigVideoOutputTechnology = 12

public val DISPLAYCONFIG_PIXELFORMAT_16BPP: DisplayconfigPixelformat = 2

public val DISPLAYCONFIG_PIXELFORMAT_24BPP: DisplayconfigPixelformat = 3

public val DISPLAYCONFIG_PIXELFORMAT_32BPP: DisplayconfigPixelformat = 4

public val DISPLAYCONFIG_PIXELFORMAT_8BPP: DisplayconfigPixelformat = 1

public val DISPLAYCONFIG_PIXELFORMAT_NONGDI: DisplayconfigPixelformat = 5

public val DISPLAYCONFIG_ROTATION_IDENTITY: DisplayconfigRotation = 1

public val DISPLAYCONFIG_ROTATION_ROTATE180: DisplayconfigRotation = 3

public val DISPLAYCONFIG_ROTATION_ROTATE270: DisplayconfigRotation = 4

public val DISPLAYCONFIG_ROTATION_ROTATE90: DisplayconfigRotation = 2

public val DISPLAYCONFIG_SCALING_ASPECTRATIOCENTEREDMAX: DisplayconfigScaling = 4

public val DISPLAYCONFIG_SCALING_CENTERED: DisplayconfigScaling = 2

public val DISPLAYCONFIG_SCALING_CUSTOM: DisplayconfigScaling = 5

public val DISPLAYCONFIG_SCALING_IDENTITY: DisplayconfigScaling = 1

public val DISPLAYCONFIG_SCALING_PREFERRED: DisplayconfigScaling = 128

public val DISPLAYCONFIG_SCALING_STRETCHED: DisplayconfigScaling = 3

public val DISPLAYCONFIG_SCANLINE_ORDERING_INTERLACED: DisplayconfigScanlineOrdering = 2

public val DISPLAYCONFIG_SCANLINE_ORDERING_INTERLACED_LOWERFIELDFIRST: DisplayconfigScanlineOrdering = 3

public val DISPLAYCONFIG_SCANLINE_ORDERING_INTERLACED_UPPERFIELDFIRST: DisplayconfigScanlineOrdering = 2

public val DISPLAYCONFIG_SCANLINE_ORDERING_PROGRESSIVE: DisplayconfigScanlineOrdering = 1

public val DISPLAYCONFIG_SCANLINE_ORDERING_UNSPECIFIED: DisplayconfigScanlineOrdering = 0

public val DISPLAYCONFIG_TOPOLOGY_CLONE: DisplayconfigTopologyId = 2

public val DISPLAYCONFIG_TOPOLOGY_EXTEND: DisplayconfigTopologyId = 4

public val DISPLAYCONFIG_TOPOLOGY_EXTERNAL: DisplayconfigTopologyId = 8

public val DISPLAYCONFIG_TOPOLOGY_INTERNAL: DisplayconfigTopologyId = 1

public val DISPLAYPOLICY_AC: UInt = 1u

public val DISPLAYPOLICY_DC: UInt = 2u

public val DM_DEFAULT: UInt = 1u

public val DM_MONOCHROME: UInt = 2u

public val DN_ACCELERATION_LEVEL: UInt = 1u

public val DN_ASSOCIATE_WINDOW: UInt = 5u

public val DN_COMPOSITION_CHANGED: UInt = 6u

public val DN_DEVICE_ORIGIN: UInt = 2u

public val DN_DRAWING_BEGIN: UInt = 4u

public val DN_DRAWING_BEGIN_APIBITMAP: UInt = 7u

public val DN_SLEEP_MODE: UInt = 3u

public val DN_SURFOBJ_DESTRUCTION: UInt = 8u

public val DRD_ERROR: UInt = 1u

public val DRD_SUCCESS: UInt = 0u

public val DRH_APIBITMAP: UInt = 1u

public val DRVQUERY_USERMODE: UInt = 1u

public val DSI_CHECKSUM_ERROR_CORRECTED: UInt = 256u

public val DSI_CHECKSUM_ERROR_NOT_CORRECTED: UInt = 512u

public val DSI_CONTENTION_DETECTED: UInt = 128u

public val DSI_DSI_DATA_TYPE_NOT_RECOGNIZED: UInt = 2048u

public val DSI_DSI_PROTOCOL_VIOLATION: UInt = 32768u

public val DSI_DSI_VC_ID_INVALID: UInt = 4096u

public val DSI_EOT_SYNC_ERROR: UInt = 4u

public val DSI_ESCAPE_MODE_ENTRY_COMMAND_ERROR: UInt = 8u

public val DSI_FALSE_CONTROL_ERROR: UInt = 64u

public val DSI_INVALID_PACKET_INDEX: UInt = 255u

public val DSI_INVALID_TRANSMISSION_LENGTH: UInt = 8192u

public val DSI_LONG_PACKET_PAYLOAD_CHECKSUM_ERROR: UInt = 1024u

public val DSI_LOW_POWER_TRANSMIT_SYNC_ERROR: UInt = 16u

public val DSI_PACKET_EMBEDDED_PAYLOAD_SIZE: UInt = 8u

public val DSI_PERIPHERAL_TIMEOUT_ERROR: UInt = 32u

public val DSI_SOT_ERROR: UInt = 1u

public val DSI_SOT_SYNC_ERROR: UInt = 2u

public val DSS_FLUSH_EVENT: UInt = 2u

public val DSS_RESERVED: UInt = 4u

public val DSS_RESERVED1: UInt = 8u

public val DSS_RESERVED2: UInt = 16u

public val DSS_TIMER_EVENT: UInt = 1u

public val DXGK_WIN32K_PARAM_FLAG_DISABLEVIEW: UInt = 4u

public val DXGK_WIN32K_PARAM_FLAG_MODESWITCH: UInt = 2u

public val DXGK_WIN32K_PARAM_FLAG_UPDATEREGISTRY: UInt = 1u

public val ECS_REDRAW: UInt = 2u

public val ECS_TEARDOWN: UInt = 1u

public val ED_ABORTDOC: UInt = 1u

public val EHN_ERROR: UInt = 1u

public val EHN_RESTORED: UInt = 0u

public val ENDCAP_BUTT: Int = 2

public val ENDCAP_ROUND: Int = 0

public val ENDCAP_SQUARE: Int = 1

public val ENG_FNT_CACHE_READ_FAULT: UInt = 1u

public val ENG_FNT_CACHE_WRITE_FAULT: UInt = 2u

public val ENG_NUMBER_OF_PROCESSORS: EngSystemAttribute = 2

public val ENG_OPTIMUM_AVAILABLE_SYSTEM_MEMORY: EngSystemAttribute = 4

public val ENG_OPTIMUM_AVAILABLE_USER_MEMORY: EngSystemAttribute = 3

public val ENG_PROCESSOR_FEATURE: EngSystemAttribute = 1

public val FC_COMPLEX: UInt = 3u

public val FC_RECT: UInt = 1u

public val FC_RECT4: UInt = 2u

public val FDM_TYPE_BM_SIDE_CONST: UInt = 1u

public val FDM_TYPE_CHAR_INC_EQUAL_BM_BASE: UInt = 4u

public val FDM_TYPE_CONST_BEARINGS: UInt = 16u

public val FDM_TYPE_MAXEXT_EQUAL_BM_SIDE: UInt = 2u

public val FDM_TYPE_ZERO_BEARINGS: UInt = 8u

public val FD_ERROR: UInt = 4294967295u

public val FD_NEGATIVE_FONT: Int = 1

public val FF_IGNORED_SIGNATURE: UInt = 2u

public val FF_SIGNATURE_VERIFIED: UInt = 1u

public val FL_NONPAGED_MEMORY: UInt = 2u

public val FL_NON_SESSION: UInt = 4u

public val FL_ZERO_MEMORY: UInt = 1u

public val FM_EDITABLE_EMBED: UInt = 8u

public val FM_INFO_16BPP: UInt = 256u

public val FM_INFO_1BPP: UInt = 32u

public val FM_INFO_24BPP: UInt = 512u

public val FM_INFO_32BPP: UInt = 1024u

public val FM_INFO_4BPP: UInt = 64u

public val FM_INFO_8BPP: UInt = 128u

public val FM_INFO_90DEGREE_ROTATIONS: UInt = 2097152u

public val FM_INFO_ANISOTROPIC_SCALING_ONLY: UInt = 33554432u

public val FM_INFO_ARB_XFORMS: UInt = 16u

public val FM_INFO_CONSTANT_WIDTH: UInt = 4096u

public val FM_INFO_DBCS_FIXED_PITCH: UInt = 268435456u

public val FM_INFO_DO_NOT_ENUMERATE: UInt = 8388608u

public val FM_INFO_DSIG: UInt = 262144u

public val FM_INFO_FAMILY_EQUIV: UInt = 134217728u

public val FM_INFO_IGNORE_TC_RA_ABLE: UInt = 1073741824u

public val FM_INFO_INTEGER_WIDTH: UInt = 2048u

public val FM_INFO_INTEGRAL_SCALING: UInt = 1048576u

public val FM_INFO_ISOTROPIC_SCALING_ONLY: UInt = 16777216u

public val FM_INFO_NONNEGATIVE_AC: UInt = 536870912u

public val FM_INFO_NOT_CONTIGUOUS: UInt = 8192u

public val FM_INFO_OPTICALLY_FIXED_PITCH: UInt = 4194304u

public val FM_INFO_RETURNS_BITMAPS: UInt = 131072u

public val FM_INFO_RETURNS_OUTLINES: UInt = 32768u

public val FM_INFO_RETURNS_STROKES: UInt = 65536u

public val FM_INFO_RIGHT_HANDED: UInt = 524288u

public val FM_INFO_TECH_BITMAP: UInt = 2u

public val FM_INFO_TECH_CFF: UInt = 67108864u

public val FM_INFO_TECH_MM: UInt = 16384u

public val FM_INFO_TECH_OUTLINE_NOT_TRUETYPE: UInt = 8u

public val FM_INFO_TECH_STROKE: UInt = 4u

public val FM_INFO_TECH_TRUETYPE: UInt = 1u

public val FM_INFO_TECH_TYPE1: UInt = 2147483648u

public val FM_NO_EMBEDDING: UInt = 2u

public val FM_PANOSE_CULTURE_LATIN: UInt = 0u

public val FM_READONLY_EMBED: UInt = 4u

public val FM_SEL_BOLD: UInt = 32u

public val FM_SEL_ITALIC: UInt = 1u

public val FM_SEL_NEGATIVE: UInt = 4u

public val FM_SEL_OUTLINED: UInt = 8u

public val FM_SEL_REGULAR: UInt = 64u

public val FM_SEL_STRIKEOUT: UInt = 16u

public val FM_SEL_UNDERSCORE: UInt = 2u

public val FM_TYPE_LICENSED: UInt = 2u

public val FM_VERSION_NUMBER: UInt = 0u

public val FO_ATTR_MODE_ROTATE: UInt = 1u

public val FO_CFF: UInt = 1048576u

public val FO_CLEARTYPENATURAL_X: UInt = 1073741824u

public val FO_CLEARTYPE_X: UInt = 268435456u

public val FO_CLEARTYPE_Y: UInt = 536870912u

public val FO_DBCS_FONT: UInt = 16777216u

public val FO_DEVICE_FONT: Int = 1

public val FO_EM_HEIGHT: UInt = 32768u

public val FO_GLYPHBITS: Int = 1

public val FO_GRAY16: UInt = 65536u

public val FO_HGLYPHS: Int = 0

public val FO_MULTIPLEMASTER: UInt = 4194304u

public val FO_NOCLEARTYPE: UInt = 33554432u

public val FO_NOGRAY16: UInt = 131072u

public val FO_NOHINTS: UInt = 262144u

public val FO_NO_CHOICE: UInt = 524288u

public val FO_OUTLINE_CAPABLE: Int = 2

public val FO_PATHOBJ: Int = 2

public val FO_POSTSCRIPT: UInt = 2097152u

public val FO_SIM_BOLD: UInt = 8192u

public val FO_SIM_ITALIC: UInt = 16384u

public val FO_VERT_FACE: UInt = 8388608u

public val FP_ALTERNATEMODE: Int = 1

public val FP_WINDINGMODE: Int = 2

public val GCAPS2_ACC_DRIVER: UInt = 32768u

public val GCAPS2_ALPHACURSOR: UInt = 32u

public val GCAPS2_BITMAPEXREUSE: UInt = 65536u

public val GCAPS2_CHANGEGAMMARAMP: UInt = 16u

public val GCAPS2_CLEARTYPE: UInt = 16384u

public val GCAPS2_EXCLUDELAYERED: UInt = 2048u

public val GCAPS2_ICD_MULTIMON: UInt = 256u

public val GCAPS2_INCLUDEAPIBITMAPS: UInt = 4096u

public val GCAPS2_JPEGSRC: UInt = 1u

public val GCAPS2_MOUSETRAILS: UInt = 512u

public val GCAPS2_PNGSRC: UInt = 8u

public val GCAPS2_REMOTEDRIVER: UInt = 1024u

public val GCAPS2_RESERVED1: UInt = 1024u

public val GCAPS2_SHOWHIDDENPOINTER: UInt = 8192u

public val GCAPS2_SYNCFLUSH: UInt = 64u

public val GCAPS2_SYNCTIMER: UInt = 128u

public val GCAPS2_XXXX: UInt = 2u

public val GCAPS_ALTERNATEFILL: UInt = 4u

public val GCAPS_ARBRUSHOPAQUE: UInt = 32768u

public val GCAPS_ARBRUSHTEXT: UInt = 268435456u

public val GCAPS_ASYNCCHANGE: UInt = 2048u

public val GCAPS_ASYNCMOVE: UInt = 4096u

public val GCAPS_BEZIERS: UInt = 1u

public val GCAPS_CMYKCOLOR: UInt = 67108864u

public val GCAPS_COLOR_DITHER: UInt = 32u

public val GCAPS_DIRECTDRAW: UInt = 16384u

public val GCAPS_DITHERONREALIZE: UInt = 2097152u

public val GCAPS_DONTJOURNAL: UInt = 8192u

public val GCAPS_FONT_RASTERIZER: UInt = 1073741824u

public val GCAPS_FORCEDITHER: UInt = 8388608u

public val GCAPS_GEOMETRICWIDE: UInt = 2u

public val GCAPS_GRAY16: UInt = 16777216u

public val GCAPS_HALFTONE: UInt = 16u

public val GCAPS_HIGHRESTEXT: UInt = 262144u

public val GCAPS_HORIZSTRIKE: UInt = 64u

public val GCAPS_ICM: UInt = 33554432u

public val GCAPS_LAYERED: UInt = 134217728u

public val GCAPS_MONO_DITHER: UInt = 1024u

public val GCAPS_NO64BITMEMACCESS: UInt = 4194304u

public val GCAPS_NUP: UInt = 2147483648u

public val GCAPS_OPAQUERECT: UInt = 256u

public val GCAPS_PALMANAGED: UInt = 524288u

public val GCAPS_PANNING: UInt = 65536u

public val GCAPS_SCREENPRECISION: UInt = 536870912u

public val GCAPS_VECTORFONT: UInt = 512u

public val GCAPS_VERTSTRIKE: UInt = 128u

public val GCAPS_WINDINGFILL: UInt = 8u

public val GDI_DRIVER_VERSION: UInt = 16384u

public val GETCONNECTEDIDS_SOURCE: UInt = 1u

public val GETCONNECTEDIDS_TARGET: UInt = 0u

public val GS_16BIT_HANDLES: UInt = 4u

public val GS_8BIT_HANDLES: UInt = 2u

public val GS_UNICODE_HANDLES: UInt = 1u

public val GUID_DEVINTERFACE_DISPLAY_ADAPTER: Guid = Guid.fromU128(U128(0x5b45201df2f24f3buL, 0x85bb30ff1f953599uL))

public val GUID_DEVINTERFACE_MONITOR: Guid = Guid.fromU128(U128(0xe6f07b5fee974a90uL, 0xb07633f57bf4eaa7uL))

public val GUID_DEVINTERFACE_VIDEO_OUTPUT_ARRIVAL: Guid = Guid.fromU128(U128(0x1ad9e4f0f88d4360uL, 0xbab94c2d55e564cduL))

public val GUID_DISPLAY_DEVICE_ARRIVAL: Guid = Guid.fromU128(U128(0x1ca05180a699450auL, 0x9a0cde4fbe3ddd89uL))

public val GUID_MONITOR_OVERRIDE_PSEUDO_SPECIALIZED: Guid = Guid.fromU128(U128(0xf196c02ff86f4f9auL, 0xaa15e9cebdfe3b96uL))

public val GX_GENERAL: Int = 3

public val GX_IDENTITY: Int = 0

public val GX_OFFSET: Int = 1

public val GX_SCALE: Int = 2

public val HOOK_ALPHABLEND: UInt = 65536u

public val HOOK_BITBLT: UInt = 1u

public val HOOK_COPYBITS: UInt = 1024u

public val HOOK_FILLPATH: UInt = 64u

public val HOOK_FLAGS: UInt = 243199u

public val HOOK_GRADIENTFILL: UInt = 131072u

public val HOOK_LINETO: UInt = 256u

public val HOOK_MOVEPANNING: UInt = 2048u

public val HOOK_PAINT: UInt = 16u

public val HOOK_PLGBLT: UInt = 4u

public val HOOK_STRETCHBLT: UInt = 2u

public val HOOK_STRETCHBLTROP: UInt = 8192u

public val HOOK_STROKEANDFILLPATH: UInt = 128u

public val HOOK_STROKEPATH: UInt = 32u

public val HOOK_SYNCHRONIZE: UInt = 4096u

public val HOOK_SYNCHRONIZEACCESS: UInt = 16384u

public val HOOK_TEXTOUT: UInt = 8u

public val HOOK_TRANSPARENTBLT: UInt = 32768u

public val HOST_DSI_BAD_TRANSMISSION_MODE: UInt = 4096u

public val HOST_DSI_DEVICE_NOT_READY: UInt = 1u

public val HOST_DSI_DEVICE_RESET: UInt = 4u

public val HOST_DSI_DRIVER_REJECTED_PACKET: UInt = 1024u

public val HOST_DSI_INTERFACE_RESET: UInt = 2u

public val HOST_DSI_INVALID_TRANSMISSION: UInt = 256u

public val HOST_DSI_OS_REJECTED_PACKET: UInt = 512u

public val HOST_DSI_TRANSMISSION_CANCELLED: UInt = 16u

public val HOST_DSI_TRANSMISSION_DROPPED: UInt = 32u

public val HOST_DSI_TRANSMISSION_TIMEOUT: UInt = 64u

public val HS_DDI_MAX: UInt = 6u

public val HT_FLAG_8BPP_CMY332_MASK: UInt = 4278190080u

public val HT_FLAG_ADDITIVE_PRIMS: UInt = 4u

public val HT_FLAG_DO_DEVCLR_XFORM: UInt = 128u

public val HT_FLAG_HAS_BLACK_DYE: UInt = 2u

public val HT_FLAG_INK_ABSORPTION_IDX0: UInt = 0u

public val HT_FLAG_INK_ABSORPTION_IDX1: UInt = 32u

public val HT_FLAG_INK_ABSORPTION_IDX2: UInt = 64u

public val HT_FLAG_INK_ABSORPTION_IDX3: UInt = 96u

public val HT_FLAG_INK_ABSORPTION_INDICES: UInt = 96u

public val HT_FLAG_INK_HIGH_ABSORPTION: UInt = 16u

public val HT_FLAG_INVERT_8BPP_BITMASK_IDX: UInt = 1024u

public val HT_FLAG_LOWER_INK_ABSORPTION: UInt = 64u

public val HT_FLAG_LOWEST_INK_ABSORPTION: UInt = 96u

public val HT_FLAG_LOW_INK_ABSORPTION: UInt = 32u

public val HT_FLAG_NORMAL_INK_ABSORPTION: UInt = 0u

public val HT_FLAG_OUTPUT_CMY: UInt = 256u

public val HT_FLAG_PRINT_DRAFT_MODE: UInt = 512u

public val HT_FLAG_SQUARE_DEVICE_PEL: UInt = 1u

public val HT_FLAG_USE_8BPP_BITMASK: UInt = 8u

public val HT_FORMAT_16BPP: UInt = 5u

public val HT_FORMAT_1BPP: UInt = 0u

public val HT_FORMAT_24BPP: UInt = 6u

public val HT_FORMAT_32BPP: UInt = 7u

public val HT_FORMAT_4BPP: UInt = 2u

public val HT_FORMAT_4BPP_IRGB: UInt = 3u

public val HT_FORMAT_8BPP: UInt = 4u

public val HT_PATSIZE_10X10: UInt = 8u

public val HT_PATSIZE_10X10_M: UInt = 9u

public val HT_PATSIZE_12X12: UInt = 10u

public val HT_PATSIZE_12X12_M: UInt = 11u

public val HT_PATSIZE_14X14: UInt = 12u

public val HT_PATSIZE_14X14_M: UInt = 13u

public val HT_PATSIZE_16X16: UInt = 14u

public val HT_PATSIZE_16X16_M: UInt = 15u

public val HT_PATSIZE_2X2: UInt = 0u

public val HT_PATSIZE_2X2_M: UInt = 1u

public val HT_PATSIZE_4X4: UInt = 2u

public val HT_PATSIZE_4X4_M: UInt = 3u

public val HT_PATSIZE_6X6: UInt = 4u

public val HT_PATSIZE_6X6_M: UInt = 5u

public val HT_PATSIZE_8X8: UInt = 6u

public val HT_PATSIZE_8X8_M: UInt = 7u

public val HT_PATSIZE_DEFAULT: UInt = 17u

public val HT_PATSIZE_MAX_INDEX: UInt = 18u

public val HT_PATSIZE_SUPERCELL: UInt = 16u

public val HT_PATSIZE_SUPERCELL_M: UInt = 17u

public val HT_PATSIZE_USER: UInt = 18u

public val HT_USERPAT_CX_MAX: UInt = 256u

public val HT_USERPAT_CX_MIN: UInt = 4u

public val HT_USERPAT_CY_MAX: UInt = 256u

public val HT_USERPAT_CY_MIN: UInt = 4u

public val IGRF_RGB_256BYTES: UInt = 0u

public val IGRF_RGB_256WORDS: UInt = 1u

public val INDEX_DRV_ACCUMULATE_D3D_DIRTY_RECT: Int = 98

public val INDEX_DRV_ALPHA_BLEND: Int = 71

public val INDEX_DRV_ASSERT_MODE: Int = 5

public val INDEX_DRV_ASSOCIATE_SHARED_SURFACE: Int = 96

public val INDEX_DRV_BIT_BLT: Int = 18

public val INDEX_DRV_COMPLETE_PDEV: Int = 1

public val INDEX_DRV_COPY_BITS: Int = 19

public val INDEX_DRV_CREATE_DEVICE_BITMAP: Int = 10

public val INDEX_DRV_CREATE_DEVICE_BITMAP_EX: Int = 94

public val INDEX_DRV_DELETE_DEVICE_BITMAP: Int = 11

public val INDEX_DRV_DELETE_DEVICE_BITMAP_EX: Int = 95

public val INDEX_DRV_DERIVE_SURFACE: Int = 85

public val INDEX_DRV_DESCRIBE_PIXEL_FORMAT: Int = 55

public val INDEX_DRV_DESTROY_FONT: Int = 43

public val INDEX_DRV_DISABLE_DIRECT_DRAW: Int = 61

public val INDEX_DRV_DISABLE_DRIVER: Int = 8

public val INDEX_DRV_DISABLE_PDEV: Int = 2

public val INDEX_DRV_DISABLE_SURFACE: Int = 4

public val INDEX_DRV_DITHER_COLOR: Int = 13

public val INDEX_DRV_DRAW_ESCAPE: Int = 25

public val INDEX_DRV_ENABLE_DIRECT_DRAW: Int = 60

public val INDEX_DRV_ENABLE_PDEV: Int = 0

public val INDEX_DRV_ENABLE_SURFACE: Int = 3

public val INDEX_DRV_END_DOC: Int = 34

public val INDEX_DRV_END_DX_INTEROP: Int = 100

public val INDEX_DRV_ESCAPE: Int = 24

public val INDEX_DRV_FILL_PATH: Int = 15

public val INDEX_DRV_FONT_MANAGEMENT: Int = 47

public val INDEX_DRV_FREE: Int = 42

public val INDEX_DRV_GET_DIRECT_DRAW_INFO: Int = 59

public val INDEX_DRV_GET_GLYPH_MODE: Int = 37

public val INDEX_DRV_GET_MODES: Int = 41

public val INDEX_DRV_GET_SYNTHESIZED_FONT_FILES: Int = 73

public val INDEX_DRV_GET_TRUE_TYPE_FILE: Int = 50

public val INDEX_DRV_GRADIENT_FILL: Int = 68

public val INDEX_DRV_ICM_CHECK_BITMAP_BITS: Int = 66

public val INDEX_DRV_ICM_CREATE_COLOR_TRANSFORM: Int = 64

public val INDEX_DRV_ICM_DELETE_COLOR_TRANSFORM: Int = 65

public val INDEX_DRV_ICM_SET_DEVICE_GAMMA_RAMP: Int = 67

public val INDEX_DRV_LINE_TO: Int = 31

public val INDEX_DRV_LOAD_FONT_FILE: Int = 45

public val INDEX_DRV_LOCK_DISPLAY_AREA: Int = 101

public val INDEX_DRV_MOVE_PANNING: Int = 52

public val INDEX_DRV_MOVE_POINTER: Int = 30

public val INDEX_DRV_NEXT_BAND: Int = 58

public val INDEX_DRV_NOTIFY: Int = 87

public val INDEX_DRV_OFFSET: Int = 6

public val INDEX_DRV_PAINT: Int = 17

public val INDEX_DRV_PLG_BLT: Int = 70

public val INDEX_DRV_QUERY_ADVANCE_WIDTHS: Int = 53

public val INDEX_DRV_QUERY_DEVICE_SUPPORT: Int = 76

public val INDEX_DRV_QUERY_FONT: Int = 26

public val INDEX_DRV_QUERY_FONT_CAPS: Int = 44

public val INDEX_DRV_QUERY_FONT_DATA: Int = 28

public val INDEX_DRV_QUERY_FONT_FILE: Int = 51

public val INDEX_DRV_QUERY_FONT_TREE: Int = 27

public val INDEX_DRV_QUERY_GLYPH_ATTRS: Int = 86

public val INDEX_DRV_QUERY_PER_BAND_INFO: Int = 75

public val INDEX_DRV_QUERY_SPOOL_TYPE: Int = 62

public val INDEX_DRV_QUERY_TRUE_TYPE_OUTLINE: Int = 49

public val INDEX_DRV_QUERY_TRUE_TYPE_TABLE: Int = 48

public val INDEX_DRV_REALIZE_BRUSH: Int = 12

public val INDEX_DRV_RENDER_HINT: Int = 93

public val INDEX_DRV_RESERVED1: Int = 77

public val INDEX_DRV_RESERVED10: Int = 91

public val INDEX_DRV_RESERVED11: Int = 92

public val INDEX_DRV_RESERVED2: Int = 78

public val INDEX_DRV_RESERVED3: Int = 79

public val INDEX_DRV_RESERVED4: Int = 80

public val INDEX_DRV_RESERVED5: Int = 81

public val INDEX_DRV_RESERVED6: Int = 82

public val INDEX_DRV_RESERVED7: Int = 83

public val INDEX_DRV_RESERVED8: Int = 84

public val INDEX_DRV_RESERVED9: Int = 90

public val INDEX_DRV_RESET_DEVICE: Int = 89

public val INDEX_DRV_RESET_PDEV: Int = 7

public val INDEX_DRV_SAVE_SCREEN_BITS: Int = 40

public val INDEX_DRV_SEND_PAGE: Int = 32

public val INDEX_DRV_SET_PALETTE: Int = 22

public val INDEX_DRV_SET_PIXEL_FORMAT: Int = 54

public val INDEX_DRV_SET_POINTER_SHAPE: Int = 29

public val INDEX_DRV_START_BANDING: Int = 57

public val INDEX_DRV_START_DOC: Int = 35

public val INDEX_DRV_START_DX_INTEROP: Int = 99

public val INDEX_DRV_START_PAGE: Int = 33

public val INDEX_DRV_STRETCH_BLT: Int = 20

public val INDEX_DRV_STRETCH_BLT_ROP: Int = 69

public val INDEX_DRV_STROKE_AND_FILL_PATH: Int = 16

public val INDEX_DRV_STROKE_PATH: Int = 14

public val INDEX_DRV_SURFACE_COMPLETE: Int = 103

public val INDEX_DRV_SWAP_BUFFERS: Int = 56

public val INDEX_DRV_SYNCHRONIZE: Int = 38

public val INDEX_DRV_SYNCHRONIZE_REDIRECTION_BITMAPS: Int = 97

public val INDEX_DRV_SYNCHRONIZE_SURFACE: Int = 88

public val INDEX_DRV_SYNTHESIZE_FONT: Int = 72

public val INDEX_DRV_TEXT_OUT: Int = 23

public val INDEX_DRV_TRANSPARENT_BLT: Int = 74

public val INDEX_DRV_UNLOAD_FONT_FILE: Int = 46

public val INDEX_DRV_UNLOCK_DISPLAY_AREA: Int = 102

public val INDEX_LAST: Int = 89

public val INDIRECT_DISPLAY_INFO_FLAGS_CREATED_IDDCX_ADAPTER: UInt = 1u

public val IOCTL_COLORSPACE_TRANSFORM_QUERY_TARGET_CAPS: UInt = 2297856u

public val IOCTL_COLORSPACE_TRANSFORM_SET: UInt = 2297860u

public val IOCTL_FSVIDEO_COPY_FRAME_BUFFER: UInt = 3409920u

public val IOCTL_FSVIDEO_REVERSE_MOUSE_POINTER: UInt = 3409928u

public val IOCTL_FSVIDEO_SET_CURRENT_MODE: UInt = 3409932u

public val IOCTL_FSVIDEO_SET_CURSOR_POSITION: UInt = 3409940u

public val IOCTL_FSVIDEO_SET_SCREEN_INFORMATION: UInt = 3409936u

public val IOCTL_FSVIDEO_WRITE_TO_FRAME_BUFFER: UInt = 3409924u

public val IOCTL_MIPI_DSI_QUERY_CAPS: UInt = 2298880u

public val IOCTL_MIPI_DSI_RESET: UInt = 2298888u

public val IOCTL_MIPI_DSI_TRANSMISSION: UInt = 2298884u

public val IOCTL_PANEL_GET_BACKLIGHT_REDUCTION: UInt = 2296856u

public val IOCTL_PANEL_GET_BRIGHTNESS: UInt = 2296840u

public val IOCTL_PANEL_GET_MANUFACTURING_MODE: UInt = 2296860u

public val IOCTL_PANEL_QUERY_BRIGHTNESS_CAPS: UInt = 2296832u

public val IOCTL_PANEL_QUERY_BRIGHTNESS_RANGES: UInt = 2296836u

public val IOCTL_PANEL_SET_BACKLIGHT_OPTIMIZATION: UInt = 2296852u

public val IOCTL_PANEL_SET_BRIGHTNESS: UInt = 2296844u

public val IOCTL_PANEL_SET_BRIGHTNESS_STATE: UInt = 2296848u

public val IOCTL_SET_ACTIVE_COLOR_PROFILE_NAME: UInt = 2297864u

public val IOCTL_VIDEO_DISABLE_CURSOR: UInt = 2294820u

public val IOCTL_VIDEO_DISABLE_POINTER: UInt = 2294844u

public val IOCTL_VIDEO_DISABLE_VDM: UInt = 2293764u

public val IOCTL_VIDEO_ENABLE_CURSOR: UInt = 2294816u

public val IOCTL_VIDEO_ENABLE_POINTER: UInt = 2294840u

public val IOCTL_VIDEO_ENABLE_VDM: UInt = 2293760u

public val IOCTL_VIDEO_ENUM_MONITOR_PDO: UInt = 2293784u

public val IOCTL_VIDEO_FREE_PUBLIC_ACCESS_RANGES: UInt = 2294884u

public val IOCTL_VIDEO_GET_BANK_SELECT_CODE: UInt = 2294868u

public val IOCTL_VIDEO_GET_CHILD_STATE: UInt = 2294912u

public val IOCTL_VIDEO_GET_OUTPUT_DEVICE_POWER_STATE: UInt = 2293776u

public val IOCTL_VIDEO_GET_POWER_MANAGEMENT: UInt = 2294896u

public val IOCTL_VIDEO_HANDLE_VIDEOPARAMETERS: UInt = 2293792u

public val IOCTL_VIDEO_INIT_WIN32K_CALLBACKS: UInt = 2293788u

public val IOCTL_VIDEO_IS_VGA_DEVICE: UInt = 2293796u

public val IOCTL_VIDEO_LOAD_AND_SET_FONT: UInt = 2294804u

public val IOCTL_VIDEO_MAP_VIDEO_MEMORY: UInt = 2294872u

public val IOCTL_VIDEO_MONITOR_DEVICE: UInt = 2293780u

public val IOCTL_VIDEO_PREPARE_FOR_EARECOVERY: UInt = 2293804u

public val IOCTL_VIDEO_QUERY_AVAIL_MODES: UInt = 2294784u

public val IOCTL_VIDEO_QUERY_COLOR_CAPABILITIES: UInt = 2294888u

public val IOCTL_VIDEO_QUERY_CURRENT_MODE: UInt = 2294792u

public val IOCTL_VIDEO_QUERY_CURSOR_ATTR: UInt = 2294828u

public val IOCTL_VIDEO_QUERY_CURSOR_POSITION: UInt = 2294836u

public val IOCTL_VIDEO_QUERY_DISPLAY_BRIGHTNESS: UInt = 2294936u

public val IOCTL_VIDEO_QUERY_NUM_AVAIL_MODES: UInt = 2294788u

public val IOCTL_VIDEO_QUERY_POINTER_ATTR: UInt = 2294852u

public val IOCTL_VIDEO_QUERY_POINTER_CAPABILITIES: UInt = 2294864u

public val IOCTL_VIDEO_QUERY_POINTER_POSITION: UInt = 2294860u

public val IOCTL_VIDEO_QUERY_PUBLIC_ACCESS_RANGES: UInt = 2294880u

public val IOCTL_VIDEO_QUERY_SUPPORTED_BRIGHTNESS: UInt = 2294932u

public val IOCTL_VIDEO_REGISTER_VDM: UInt = 2293768u

public val IOCTL_VIDEO_RESET_DEVICE: UInt = 2294800u

public val IOCTL_VIDEO_RESTORE_HARDWARE_STATE: UInt = 2294276u

public val IOCTL_VIDEO_SAVE_HARDWARE_STATE: UInt = 2294272u

public val IOCTL_VIDEO_SET_BANK_POSITION: UInt = 2294928u

public val IOCTL_VIDEO_SET_CHILD_STATE_CONFIGURATION: UInt = 2294920u

public val IOCTL_VIDEO_SET_COLOR_LUT_DATA: UInt = 2294908u

public val IOCTL_VIDEO_SET_COLOR_REGISTERS: UInt = 2294812u

public val IOCTL_VIDEO_SET_CURRENT_MODE: UInt = 2294796u

public val IOCTL_VIDEO_SET_CURSOR_ATTR: UInt = 2294824u

public val IOCTL_VIDEO_SET_CURSOR_POSITION: UInt = 2294832u

public val IOCTL_VIDEO_SET_DISPLAY_BRIGHTNESS: UInt = 2294940u

public val IOCTL_VIDEO_SET_OUTPUT_DEVICE_POWER_STATE: UInt = 2293772u

public val IOCTL_VIDEO_SET_PALETTE_REGISTERS: UInt = 2294808u

public val IOCTL_VIDEO_SET_POINTER_ATTR: UInt = 2294848u

public val IOCTL_VIDEO_SET_POINTER_POSITION: UInt = 2294856u

public val IOCTL_VIDEO_SET_POWER_MANAGEMENT: UInt = 2294892u

public val IOCTL_VIDEO_SHARE_VIDEO_MEMORY: UInt = 2294900u

public val IOCTL_VIDEO_SWITCH_DUALVIEW: UInt = 2294924u

public val IOCTL_VIDEO_UNMAP_VIDEO_MEMORY: UInt = 2294876u

public val IOCTL_VIDEO_UNSHARE_VIDEO_MEMORY: UInt = 2294904u

public val IOCTL_VIDEO_USE_DEVICE_IN_SESSION: UInt = 2293800u

public val IOCTL_VIDEO_VALIDATE_CHILD_STATE_CONFIGURATION: UInt = 2294916u

public val JOIN_BEVEL: Int = 1

public val JOIN_MITER: Int = 2

public val JOIN_ROUND: Int = 0

public val LA_ALTERNATE: UInt = 2u

public val LA_GEOMETRIC: UInt = 1u

public val LA_STARTGAP: UInt = 4u

public val LA_STYLED: UInt = 8u

public val MAXCHARSETS: UInt = 16u

public val MAX_PACKET_COUNT: UInt = 128u

public val MC_APERTURE_GRILL_CATHODE_RAY_TUBE: McDisplayTechnologyType = 1

public val MC_BLUE_DRIVE: McDriveType = 2

public val MC_BLUE_GAIN: McGainType = 2

public val MC_CAPS_BRIGHTNESS: UInt = 2u

public val MC_CAPS_COLOR_TEMPERATURE: UInt = 8u

public val MC_CAPS_CONTRAST: UInt = 4u

public val MC_CAPS_DEGAUSS: UInt = 64u

public val MC_CAPS_DISPLAY_AREA_POSITION: UInt = 128u

public val MC_CAPS_DISPLAY_AREA_SIZE: UInt = 256u

public val MC_CAPS_MONITOR_TECHNOLOGY_TYPE: UInt = 1u

public val MC_CAPS_NONE: UInt = 0u

public val MC_CAPS_RED_GREEN_BLUE_DRIVE: UInt = 32u

public val MC_CAPS_RED_GREEN_BLUE_GAIN: UInt = 16u

public val MC_CAPS_RESTORE_FACTORY_COLOR_DEFAULTS: UInt = 2048u

public val MC_CAPS_RESTORE_FACTORY_DEFAULTS: UInt = 1024u

public val MC_COLOR_TEMPERATURE_10000K: McColorTemperature = 7

public val MC_COLOR_TEMPERATURE_11500K: McColorTemperature = 8

public val MC_COLOR_TEMPERATURE_4000K: McColorTemperature = 1

public val MC_COLOR_TEMPERATURE_5000K: McColorTemperature = 2

public val MC_COLOR_TEMPERATURE_6500K: McColorTemperature = 3

public val MC_COLOR_TEMPERATURE_7500K: McColorTemperature = 4

public val MC_COLOR_TEMPERATURE_8200K: McColorTemperature = 5

public val MC_COLOR_TEMPERATURE_9300K: McColorTemperature = 6

public val MC_COLOR_TEMPERATURE_UNKNOWN: McColorTemperature = 0

public val MC_ELECTROLUMINESCENT: McDisplayTechnologyType = 6

public val MC_FIELD_EMISSION_DEVICE: McDisplayTechnologyType = 8

public val MC_GREEN_DRIVE: McDriveType = 1

public val MC_GREEN_GAIN: McGainType = 1

public val MC_HEIGHT: McSizeType = 1

public val MC_HORIZONTAL_POSITION: McPositionType = 0

public val MC_LIQUID_CRYSTAL_ON_SILICON: McDisplayTechnologyType = 3

public val MC_MICROELECTROMECHANICAL: McDisplayTechnologyType = 7

public val MC_MOMENTARY: McVcpCodeType = 0

public val MC_ORGANIC_LIGHT_EMITTING_DIODE: McDisplayTechnologyType = 5

public val MC_PLASMA: McDisplayTechnologyType = 4

public val MC_RED_DRIVE: McDriveType = 0

public val MC_RED_GAIN: McGainType = 0

public val MC_RESTORE_FACTORY_DEFAULTS_ENABLES_MONITOR_SETTINGS: UInt = 4096u

public val MC_SET_PARAMETER: McVcpCodeType = 1

public val MC_SHADOW_MASK_CATHODE_RAY_TUBE: McDisplayTechnologyType = 0

public val MC_SUPPORTED_COLOR_TEMPERATURE_10000K: UInt = 64u

public val MC_SUPPORTED_COLOR_TEMPERATURE_11500K: UInt = 128u

public val MC_SUPPORTED_COLOR_TEMPERATURE_4000K: UInt = 1u

public val MC_SUPPORTED_COLOR_TEMPERATURE_5000K: UInt = 2u

public val MC_SUPPORTED_COLOR_TEMPERATURE_6500K: UInt = 4u

public val MC_SUPPORTED_COLOR_TEMPERATURE_7500K: UInt = 8u

public val MC_SUPPORTED_COLOR_TEMPERATURE_8200K: UInt = 16u

public val MC_SUPPORTED_COLOR_TEMPERATURE_9300K: UInt = 32u

public val MC_SUPPORTED_COLOR_TEMPERATURE_NONE: UInt = 0u

public val MC_THIN_FILM_TRANSISTOR: McDisplayTechnologyType = 2

public val MC_VERTICAL_POSITION: McPositionType = 1

public val MC_WIDTH: McSizeType = 0

public val MS_CDDDEVICEBITMAP: UInt = 4u

public val MS_NOTSYSTEMMEMORY: UInt = 1u

public val MS_REUSEDDEVICEBITMAP: UInt = 8u

public val MS_SHAREDACCESS: UInt = 2u

public val NUM_VIDEO_BANK_TYPES: VideoBankType = 4

public val OC_BANK_CLIP: UInt = 1u

public val OPENGL_CMD: UInt = 4352u

public val OPENGL_GETINFO: UInt = 4353u

public val ORIENTATION_PREFERENCE_LANDSCAPE: OrientationPreference = 1

public val ORIENTATION_PREFERENCE_LANDSCAPE_FLIPPED: OrientationPreference = 4

public val ORIENTATION_PREFERENCE_NONE: OrientationPreference = 0

public val ORIENTATION_PREFERENCE_PORTRAIT: OrientationPreference = 2

public val ORIENTATION_PREFERENCE_PORTRAIT_FLIPPED: OrientationPreference = 8

public val OUTPUT_COLOR_ENCODING_INTENSITY: OutputColorEncoding = 4

public val OUTPUT_COLOR_ENCODING_RGB: OutputColorEncoding = 0

public val OUTPUT_COLOR_ENCODING_YCBCR420: OutputColorEncoding = 3

public val OUTPUT_COLOR_ENCODING_YCBCR422: OutputColorEncoding = 2

public val OUTPUT_COLOR_ENCODING_YCBCR444: OutputColorEncoding = 1

public val OUTPUT_WIRE_COLOR_SPACE_G2084_P2020: OutputWireColorSpaceType = 12

public val OUTPUT_WIRE_COLOR_SPACE_G2084_P2020_DVLL: OutputWireColorSpaceType = 33

public val OUTPUT_WIRE_COLOR_SPACE_G2084_P2020_HDR10PLUS: OutputWireColorSpaceType = 32

public val OUTPUT_WIRE_COLOR_SPACE_G22_P2020: OutputWireColorSpaceType = 31

public val OUTPUT_WIRE_COLOR_SPACE_G22_P709: OutputWireColorSpaceType = 0

public val OUTPUT_WIRE_COLOR_SPACE_G22_P709_WCG: OutputWireColorSpaceType = 30

public val OUTPUT_WIRE_COLOR_SPACE_RESERVED: OutputWireColorSpaceType = 4

public val PAL_BGR: UInt = 8u

public val PAL_BITFIELDS: UInt = 2u

public val PAL_CMYK: UInt = 16u

public val PAL_INDEXED: UInt = 1u

public val PAL_RGB: UInt = 4u

public val PD_BEGINSUBPATH: UInt = 1u

public val PD_BEZIERS: UInt = 16u

public val PD_CLOSEFIGURE: UInt = 8u

public val PD_ENDSUBPATH: UInt = 2u

public val PD_RESETSTYLE: UInt = 4u

public val PHYSICAL_MONITOR_DESCRIPTION_SIZE: UInt = 128u

public val PLANAR_HC: UInt = 1u

public val PO_ALL_INTEGERS: UInt = 4u

public val PO_BEZIERS: UInt = 1u

public val PO_ELLIPSE: UInt = 2u

public val PO_ENUM_AS_INTEGERS: UInt = 8u

public val PO_WIDENED: UInt = 16u

public val PPC_BGR_ORDER_HORIZONTAL_STRIPES: UInt = 5u

public val PPC_BGR_ORDER_VERTICAL_STRIPES: UInt = 3u

public val PPC_DEFAULT: UInt = 0u

public val PPC_RGB_ORDER_HORIZONTAL_STRIPES: UInt = 4u

public val PPC_RGB_ORDER_VERTICAL_STRIPES: UInt = 2u

public val PPC_UNDEFINED: UInt = 1u

public val PPG_DEFAULT: UInt = 0u

public val PPG_SRGB: UInt = 1u

public val PRIMARY_ORDER_ABC: UInt = 0u

public val PRIMARY_ORDER_ACB: UInt = 1u

public val PRIMARY_ORDER_BAC: UInt = 2u

public val PRIMARY_ORDER_BCA: UInt = 3u

public val PRIMARY_ORDER_CAB: UInt = 5u

public val PRIMARY_ORDER_CBA: UInt = 4u

public val QAW_GETEASYWIDTHS: UInt = 1u

public val QAW_GETWIDTHS: UInt = 0u

public val QC_1BIT: UInt = 2u

public val QC_4BIT: UInt = 4u

public val QC_OUTLINES: UInt = 1u

public val QDA_ACCELERATION_LEVEL: EngDeviceAttribute = 1

public val QDA_RESERVED: EngDeviceAttribute = 0

public val QDC_ALL_PATHS: QueryDisplayConfigFlags = 1u

public val QDC_DATABASE_CURRENT: QueryDisplayConfigFlags = 4u

public val QDC_INCLUDE_HMD: QueryDisplayConfigFlags = 32u

public val QDC_ONLY_ACTIVE_PATHS: QueryDisplayConfigFlags = 2u

public val QDC_VIRTUAL_MODE_AWARE: QueryDisplayConfigFlags = 16u

public val QDC_VIRTUAL_REFRESH_RATE_AWARE: QueryDisplayConfigFlags = 64u

public val QDS_CHECKJPEGFORMAT: UInt = 0u

public val QDS_CHECKPNGFORMAT: UInt = 1u

public val QFD_GLYPHANDBITMAP: Int = 1

public val QFD_GLYPHANDOUTLINE: Int = 2

public val QFD_MAXEXTENTS: Int = 3

public val QFD_TT_GLYPHANDBITMAP: Int = 4

public val QFD_TT_GRAY1_BITMAP: Int = 5

public val QFD_TT_GRAY2_BITMAP: Int = 6

public val QFD_TT_GRAY4_BITMAP: Int = 8

public val QFD_TT_GRAY8_BITMAP: Int = 9

public val QFD_TT_MONO_BITMAP: Int = 5

public val QFF_DESCRIPTION: Int = 1

public val QFF_NUMFACES: Int = 2

public val QFT_GLYPHSET: Int = 3

public val QFT_KERNPAIRS: Int = 2

public val QFT_LIGATURES: Int = 1

public val QSA_3DNOW: UInt = 16384u

public val QSA_MMX: UInt = 256u

public val QSA_SSE: UInt = 8192u

public val QSA_SSE1: UInt = 8192u

public val QSA_SSE2: UInt = 65536u

public val QSA_SSE3: UInt = 524288u

public val RB_DITHERCOLOR: Int = -2147483648.toInt()

public val SDC_ALLOW_CHANGES: SetDisplayConfigFlags = 1024u

public val SDC_ALLOW_PATH_ORDER_CHANGES: SetDisplayConfigFlags = 8192u

public val SDC_APPLY: SetDisplayConfigFlags = 128u

public val SDC_FORCE_MODE_ENUMERATION: SetDisplayConfigFlags = 4096u

public val SDC_NO_OPTIMIZATION: SetDisplayConfigFlags = 256u

public val SDC_PATH_PERSIST_IF_REQUIRED: SetDisplayConfigFlags = 2048u

public val SDC_SAVE_TO_DATABASE: SetDisplayConfigFlags = 512u

public val SDC_TOPOLOGY_CLONE: SetDisplayConfigFlags = 2u

public val SDC_TOPOLOGY_EXTEND: SetDisplayConfigFlags = 4u

public val SDC_TOPOLOGY_EXTERNAL: SetDisplayConfigFlags = 8u

public val SDC_TOPOLOGY_INTERNAL: SetDisplayConfigFlags = 1u

public val SDC_TOPOLOGY_SUPPLIED: SetDisplayConfigFlags = 16u

public val SDC_USE_DATABASE_CURRENT: SetDisplayConfigFlags = 15u

public val SDC_USE_SUPPLIED_DISPLAY_CONFIG: SetDisplayConfigFlags = 32u

public val SDC_VALIDATE: SetDisplayConfigFlags = 64u

public val SDC_VIRTUAL_MODE_AWARE: SetDisplayConfigFlags = 32768u

public val SDC_VIRTUAL_REFRESH_RATE_AWARE: SetDisplayConfigFlags = 131072u

public val SETCONFIGURATION_STATUS_ADDITIONAL: UInt = 1u

public val SETCONFIGURATION_STATUS_APPLIED: UInt = 0u

public val SETCONFIGURATION_STATUS_OVERRIDDEN: UInt = 2u

public val SGI_EXTRASPACE: UInt = 0u

public val SO_BREAK_EXTRA: UInt = 4096u

public val SO_CHARACTER_EXTRA: UInt = 2048u

public val SO_CHAR_INC_EQUAL_BM_BASE: UInt = 32u

public val SO_DO_NOT_SUBSTITUTE_DEVICE_FONT: UInt = 128u

public val SO_DXDY: UInt = 1024u

public val SO_ESC_NOT_ORIENT: UInt = 512u

public val SO_FLAG_DEFAULT_PLACEMENT: UInt = 1u

public val SO_GLYPHINDEX_TEXTOUT: UInt = 256u

public val SO_HORIZONTAL: UInt = 2u

public val SO_MAXEXT_EQUAL_BM_SIDE: UInt = 64u

public val SO_REVERSED: UInt = 8u

public val SO_VERTICAL: UInt = 4u

public val SO_ZERO_BEARINGS: UInt = 16u

public val SPS_ACCEPT_EXCLUDE: UInt = 3u

public val SPS_ACCEPT_NOEXCLUDE: UInt = 2u

public val SPS_ACCEPT_SYNCHRONOUS: UInt = 4u

public val SPS_ALPHA: Int = 16

public val SPS_ANIMATESTART: Int = 4

public val SPS_ANIMATEUPDATE: Int = 8

public val SPS_ASYNCCHANGE: Int = 2

public val SPS_CHANGE: Int = 1

public val SPS_DECLINE: UInt = 1u

public val SPS_ERROR: UInt = 0u

public val SPS_FLAGSMASK: Int = 255

public val SPS_FREQMASK: Int = 1044480

public val SPS_LENGTHMASK: Int = 3840

public val SPS_RESERVED: Int = 32

public val SPS_RESERVED1: Int = 64

public val SS_FREE: UInt = 2u

public val SS_RESTORE: UInt = 1u

public val SS_SAVE: UInt = 0u

public val STYPE_BITMAP: Int = 0

public val STYPE_DEVBITMAP: Int = 3

public val S_INIT: UInt = 2u

public val TC_PATHOBJ: UInt = 2u

public val TC_RECTANGLES: UInt = 0u

public val TTO_METRICS_ONLY: UInt = 1u

public val TTO_QUBICS: UInt = 2u

public val TTO_UNHINTED: UInt = 4u

public val VIDEO_COLOR_LUT_DATA_FORMAT_PRIVATEFORMAT: UInt = 2147483648u

public val VIDEO_COLOR_LUT_DATA_FORMAT_RGB256WORDS: UInt = 1u

public val VIDEO_DEVICE_COLOR: UInt = 1u

public val VIDEO_DEVICE_NAME: Pcstr = s("DISPLAY%d")

public val VIDEO_DUALVIEW_PRIMARY: UInt = 2147483648u

public val VIDEO_DUALVIEW_REMOVABLE: UInt = 1u

public val VIDEO_DUALVIEW_SECONDARY: UInt = 1073741824u

public val VIDEO_DUALVIEW_WDDM_VGA: UInt = 536870912u

public val VIDEO_MAX_REASON: UInt = 9u

public val VIDEO_MODE_ANIMATE_START: UInt = 8u

public val VIDEO_MODE_ANIMATE_UPDATE: UInt = 16u

public val VIDEO_MODE_ASYNC_POINTER: UInt = 1u

public val VIDEO_MODE_BANKED: UInt = 128u

public val VIDEO_MODE_COLOR: UInt = 1u

public val VIDEO_MODE_COLOR_POINTER: UInt = 4u

public val VIDEO_MODE_GRAPHICS: UInt = 2u

public val VIDEO_MODE_INTERLACED: UInt = 16u

public val VIDEO_MODE_LINEAR: UInt = 256u

public val VIDEO_MODE_MANAGED_PALETTE: UInt = 8u

public val VIDEO_MODE_MAP_MEM_LINEAR: UInt = 1073741824u

public val VIDEO_MODE_MONO_POINTER: UInt = 2u

public val VIDEO_MODE_NO_64_BIT_ACCESS: UInt = 64u

public val VIDEO_MODE_NO_OFF_SCREEN: UInt = 32u

public val VIDEO_MODE_NO_ZERO_MEMORY: UInt = 2147483648u

public val VIDEO_MODE_PALETTE_DRIVEN: UInt = 4u

public val VIDEO_OPTIONAL_GAMMET_TABLE: UInt = 2u

public val VIDEO_REASON_ALLOCATION: UInt = 6u

public val VIDEO_REASON_CONFIGURATION: UInt = 9u

public val VIDEO_REASON_FAILED_ROTATION: UInt = 5u

public val VIDEO_REASON_LOCK: UInt = 5u

public val VIDEO_REASON_NONE: UInt = 0u

public val VIDEO_REASON_POLICY1: UInt = 1u

public val VIDEO_REASON_POLICY2: UInt = 2u

public val VIDEO_REASON_POLICY3: UInt = 3u

public val VIDEO_REASON_POLICY4: UInt = 4u

public val VIDEO_REASON_SCRATCH: UInt = 8u

public val VIDEO_STATE_NON_STANDARD_VGA: UInt = 1u

public val VIDEO_STATE_PACKED_CHAIN4_MODE: UInt = 4u

public val VIDEO_STATE_UNEMULATED_VGA_STATE: UInt = 2u

public val VIDEO_BANKED1R1W: VideoBankType = 2

public val VIDEO_BANKED1RW: VideoBankType = 1

public val VIDEO_BANKED2RW: VideoBankType = 3

public val VIDEO_BLACK_SCREEN_DIAGNOSTICS: VideoWin32kCallbacksParamsType = 16

public val VIDEO_DESKTOP_DUPLICATION_CHANGE: VideoWin32kCallbacksParamsType = 15

public val VIDEO_DISABLE_MULTI_PLANE_OVERLAY: VideoWin32kCallbacksParamsType = 14

public val VIDEO_DXGK_DISPLAY_SWITCH_CALLOUT: VideoWin32kCallbacksParamsType = 8

public val VIDEO_DXGK_FIND_ADAPTER_TDR_CALLOUT: VideoWin32kCallbacksParamsType = 10

public val VIDEO_DXGK_HARDWARE_PROTECTION_TEARDOWN: VideoWin32kCallbacksParamsType = 11

public val VIDEO_ENUM_CHILD_PDO_NOTIFY_CALLOUT: VideoWin32kCallbacksParamsType = 3

public val VIDEO_FIND_ADAPTER_CALLOUT: VideoWin32kCallbacksParamsType = 4

public val VIDEO_NOT_BANKED: VideoBankType = 0

public val VIDEO_PNP_NOTIFY_CALLOUT: VideoWin32kCallbacksParamsType = 7

public val VIDEO_POWER_HIBERNATE: VideoPowerState = 5

public val VIDEO_POWER_MAXIMUM: VideoPowerState = 7

public val VIDEO_POWER_NOTIFY_CALLOUT: VideoWin32kCallbacksParamsType = 1

public val VIDEO_POWER_OFF: VideoPowerState = 4

public val VIDEO_POWER_ON: VideoPowerState = 1

public val VIDEO_POWER_SHUTDOWN: VideoPowerState = 6

public val VIDEO_POWER_STAND_BY: VideoPowerState = 2

public val VIDEO_POWER_SUSPEND: VideoPowerState = 3

public val VIDEO_POWER_UNSPECIFIED: VideoPowerState = 0

public val VIDEO_REPAINT_DESKTOP: VideoWin32kCallbacksParamsType = 12

public val VIDEO_UPDATE_CURSOR: VideoWin32kCallbacksParamsType = 13

public val WINDDI_MAXSETPALETTECOLORINDEX: UInt = 255u

public val WINDDI_MAXSETPALETTECOLORS: UInt = 256u

public val WINDDI_MAX_BROADCAST_CONTEXT: UInt = 64u

public val WNDOBJ_SETUP: UInt = 4354u

public val WOC_CHANGED: UInt = 16u

public val WOC_DELETE: UInt = 32u

public val WOC_DRAWN: UInt = 64u

public val WOC_RGN_CLIENT: UInt = 2u

public val WOC_RGN_CLIENT_DELTA: UInt = 1u

public val WOC_RGN_SPRITE: UInt = 512u

public val WOC_RGN_SURFACE: UInt = 8u

public val WOC_RGN_SURFACE_DELTA: UInt = 4u

public val WOC_SPRITE_NO_OVERLAP: UInt = 256u

public val WOC_SPRITE_OVERLAP: UInt = 128u

public val WO_DRAW_NOTIFY: UInt = 64u

public val WO_RGN_CLIENT: UInt = 2u

public val WO_RGN_CLIENT_DELTA: UInt = 1u

public val WO_RGN_DESKTOP_COORD: UInt = 256u

public val WO_RGN_SPRITE: UInt = 512u

public val WO_RGN_SURFACE: UInt = 8u

public val WO_RGN_SURFACE_DELTA: UInt = 4u

public val WO_RGN_UPDATE_ALL: UInt = 16u

public val WO_RGN_WINDOW: UInt = 32u

public val WO_SPRITE_NOTIFY: UInt = 128u

public val WVIDEO_DEVICE_NAME: Pcwstr = w("DISPLAY%d")

public val XF_INV_FXTOL: Int = 3

public val XF_INV_LTOL: Int = 1

public val XF_LTOFX: Int = 2

public val XF_LTOL: Int = 0

public val XO_DESTBITFIELDS: UInt = 5u

public val XO_DESTDCPALETTE: UInt = 3u

public val XO_DESTPALETTE: UInt = 2u

public val XO_DEVICE_ICM: UInt = 16u

public val XO_FROM_CMYK: UInt = 8u

public val XO_HOST_ICM: UInt = 32u

public val XO_SRCBITFIELDS: UInt = 4u

public val XO_SRCPALETTE: UInt = 1u

public val XO_TABLE: UInt = 2u

public val XO_TO_MONO: UInt = 4u

public val XO_TRIVIAL: UInt = 1u
