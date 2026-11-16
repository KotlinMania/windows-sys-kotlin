package io.github.kotlinmania.windowssys.windows.win32.graphics.gdi

public val ABORTDOC: UInt = 2u

public val ABSOLUTE: UInt = 1u

public val AC_SRC_ALPHA: UInt = 1u

public val AC_SRC_OVER: UInt = 0u

public val AD_CLOCKWISE: ArcDirection = 2

public val AD_COUNTERCLOCKWISE: ArcDirection = 1

public val ALTERNATE: CreatePolygonRgnMode = 1

public val ANSI_CHARSET: FontCharset = 0u.toUByte()

public val ANSI_FIXED_FONT: GetStockObjectFlags = 11

public val ANSI_VAR_FONT: GetStockObjectFlags = 12

public val ANTIALIASED_QUALITY: FontQuality = 4u.toUByte()

public val ARABIC_CHARSET: FontCharset = 178u.toUByte()

public val ASPECTX: GetDeviceCapsIndex = 40u

public val ASPECTXY: GetDeviceCapsIndex = 44u

public val ASPECTY: GetDeviceCapsIndex = 42u

public val ASPECT_FILTERING: UInt = 1u

public val BALTIC_CHARSET: FontCharset = 186u.toUByte()

public val BANDINFO: UInt = 24u

public val BDR_INNER: DrawedgeFlags = 12u

public val BDR_OUTER: DrawedgeFlags = 3u

public val BDR_RAISED: DrawedgeFlags = 5u

public val BDR_RAISEDINNER: DrawedgeFlags = 4u

public val BDR_RAISEDOUTER: DrawedgeFlags = 1u

public val BDR_SUNKEN: DrawedgeFlags = 10u

public val BDR_SUNKENINNER: DrawedgeFlags = 8u

public val BDR_SUNKENOUTER: DrawedgeFlags = 2u

public val BEGIN_PATH: UInt = 4096u

public val BF_ADJUST: DrawEdgeFlags = 8192u

public val BF_BOTTOM: DrawEdgeFlags = 8u

public val BF_BOTTOMLEFT: DrawEdgeFlags = 9u

public val BF_BOTTOMRIGHT: DrawEdgeFlags = 12u

public val BF_DIAGONAL: DrawEdgeFlags = 16u

public val BF_DIAGONAL_ENDBOTTOMLEFT: DrawEdgeFlags = 25u

public val BF_DIAGONAL_ENDBOTTOMRIGHT: DrawEdgeFlags = 28u

public val BF_DIAGONAL_ENDTOPLEFT: DrawEdgeFlags = 19u

public val BF_DIAGONAL_ENDTOPRIGHT: DrawEdgeFlags = 22u

public val BF_FLAT: DrawEdgeFlags = 16384u

public val BF_LEFT: DrawEdgeFlags = 1u

public val BF_MIDDLE: DrawEdgeFlags = 2048u

public val BF_MONO: DrawEdgeFlags = 32768u

public val BF_RECT: DrawEdgeFlags = 15u

public val BF_RIGHT: DrawEdgeFlags = 4u

public val BF_SOFT: DrawEdgeFlags = 4096u

public val BF_TOP: DrawEdgeFlags = 2u

public val BF_TOPLEFT: DrawEdgeFlags = 3u

public val BF_TOPRIGHT: DrawEdgeFlags = 6u

public val BITSPIXEL: GetDeviceCapsIndex = 12u

public val BI_BITFIELDS: BiCompression = 3u

public val BI_JPEG: BiCompression = 4u

public val BI_PNG: BiCompression = 5u

public val BI_RGB: BiCompression = 0u

public val BI_RLE4: BiCompression = 2u

public val BI_RLE8: BiCompression = 1u

public val BKMODE_LAST: UInt = 2u

public val BLACKNESS: RopCode = 66u

public val BLACKONWHITE: StretchBltMode = 1

public val BLACK_BRUSH: GetStockObjectFlags = 4

public val BLACK_PEN: GetStockObjectFlags = 7

public val BLTALIGNMENT: GetDeviceCapsIndex = 119u

public val BS_DIBPATTERN: BrushStyle = 5u

public val BS_DIBPATTERN8X8: BrushStyle = 8u

public val BS_DIBPATTERNPT: BrushStyle = 6u

public val BS_HATCHED: BrushStyle = 2u

public val BS_HOLLOW: BrushStyle = 1u

public val BS_INDEXED: BrushStyle = 4u

public val BS_MONOPATTERN: BrushStyle = 9u

public val BS_NULL: BrushStyle = 1u

public val BS_PATTERN: BrushStyle = 3u

public val BS_PATTERN8X8: BrushStyle = 7u

public val BS_SOLID: BrushStyle = 0u

public val CAPTUREBLT: RopCode = 1073741824u

public val CA_LOG_FILTER: UInt = 2u

public val CA_NEGATIVE: UInt = 1u

public val CBM_INIT: Int = 4

public val CCHFORMNAME: UInt = 32u

public val CC_CHORD: UInt = 4u

public val CC_CIRCLES: UInt = 1u

public val CC_ELLIPSES: UInt = 8u

public val CC_INTERIORS: UInt = 128u

public val CC_NONE: UInt = 0u

public val CC_PIE: UInt = 2u

public val CC_ROUNDRECT: UInt = 256u

public val CC_STYLED: UInt = 32u

public val CC_WIDE: UInt = 16u

public val CC_WIDESTYLED: UInt = 64u

public val CDS_DISABLE_UNSAFE_MODES: CdsType = 512u

public val CDS_ENABLE_UNSAFE_MODES: CdsType = 256u

public val CDS_FULLSCREEN: CdsType = 4u

public val CDS_GLOBAL: CdsType = 8u

public val CDS_NORESET: CdsType = 268435456u

public val CDS_RESET: CdsType = 1073741824u

public val CDS_RESET_EX: CdsType = 536870912u

public val CDS_SET_PRIMARY: CdsType = 16u

public val CDS_TEST: CdsType = 2u

public val CDS_UPDATEREGISTRY: CdsType = 1u

public val CDS_VIDEOPARAMETERS: CdsType = 32u

public val CHARSET_DEFAULT: UInt = 1u

public val CHARSET_GLYPHIDX: UInt = 3u

public val CHARSET_SYMBOL: EmbedFontCharset = 2u

public val CHARSET_UNICODE: EmbedFontCharset = 1u

public val CHECKJPEGFORMAT: UInt = 4119u

public val CHECKPNGFORMAT: UInt = 4120u

public val CHINESEBIG5_CHARSET: FontCharset = 136u.toUByte()

public val CLEARTYPE_NATURAL_QUALITY: UInt = 6u

public val CLEARTYPE_QUALITY: FontQuality = 5u.toUByte()

public val CLIPCAPS: GetDeviceCapsIndex = 36u

public val CLIP_CHARACTER_PRECIS: FontClipPrecision = 1u.toUByte()

public val CLIP_DEFAULT_PRECIS: FontClipPrecision = 0u.toUByte()

public val CLIP_DFA_DISABLE: FontClipPrecision = 64u.toUByte()

public val CLIP_DFA_OVERRIDE: FontClipPrecision = 64u.toUByte()

public val CLIP_EMBEDDED: FontClipPrecision = 128u.toUByte()

public val CLIP_LH_ANGLES: FontClipPrecision = 16u.toUByte()

public val CLIP_MASK: FontClipPrecision = 15u.toUByte()

public val CLIP_STROKE_PRECIS: FontClipPrecision = 2u.toUByte()

public val CLIP_TO_PATH: UInt = 4097u

public val CLIP_TT_ALWAYS: FontClipPrecision = 32u.toUByte()

public val CLOSECHANNEL: UInt = 4112u

public val CLR_INVALID: UInt = 4294967295u

public val CM_CMYK_COLOR: UInt = 4u

public val CM_DEVICE_ICM: UInt = 1u

public val CM_GAMMA_RAMP: UInt = 2u

public val CM_IN_GAMUT: UInt = 0u

public val CM_NONE: UInt = 0u

public val CM_OUT_OF_GAMUT: UInt = 255u

public val COLORMATCHTOTARGET_EMBEDED: UInt = 1u

public val COLORMGMTCAPS: GetDeviceCapsIndex = 121u

public val COLORONCOLOR: StretchBltMode = 3

public val COLORRES: GetDeviceCapsIndex = 108u

public val COLOR_3DDKSHADOW: SysColorIndex = 21

public val COLOR_3DFACE: SysColorIndex = 15

public val COLOR_3DHIGHLIGHT: SysColorIndex = 20

public val COLOR_3DHILIGHT: SysColorIndex = 20

public val COLOR_3DLIGHT: SysColorIndex = 22

public val COLOR_3DSHADOW: SysColorIndex = 16

public val COLOR_ACTIVEBORDER: SysColorIndex = 10

public val COLOR_ACTIVECAPTION: SysColorIndex = 2

public val COLOR_APPWORKSPACE: SysColorIndex = 12

public val COLOR_BACKGROUND: SysColorIndex = 1

public val COLOR_BTNFACE: SysColorIndex = 15

public val COLOR_BTNHIGHLIGHT: SysColorIndex = 20

public val COLOR_BTNHILIGHT: SysColorIndex = 20

public val COLOR_BTNSHADOW: SysColorIndex = 16

public val COLOR_BTNTEXT: SysColorIndex = 18

public val COLOR_CAPTIONTEXT: SysColorIndex = 9

public val COLOR_DESKTOP: SysColorIndex = 1

public val COLOR_GRADIENTACTIVECAPTION: SysColorIndex = 27

public val COLOR_GRADIENTINACTIVECAPTION: SysColorIndex = 28

public val COLOR_GRAYTEXT: SysColorIndex = 17

public val COLOR_HIGHLIGHT: SysColorIndex = 13

public val COLOR_HIGHLIGHTTEXT: SysColorIndex = 14

public val COLOR_HOTLIGHT: SysColorIndex = 26

public val COLOR_INACTIVEBORDER: SysColorIndex = 11

public val COLOR_INACTIVECAPTION: SysColorIndex = 3

public val COLOR_INACTIVECAPTIONTEXT: SysColorIndex = 19

public val COLOR_INFOBK: SysColorIndex = 24

public val COLOR_INFOTEXT: SysColorIndex = 23

public val COLOR_MENU: SysColorIndex = 4

public val COLOR_MENUBAR: SysColorIndex = 30

public val COLOR_MENUHILIGHT: SysColorIndex = 29

public val COLOR_MENUTEXT: SysColorIndex = 7

public val COLOR_SCROLLBAR: SysColorIndex = 0

public val COLOR_WINDOW: SysColorIndex = 5

public val COLOR_WINDOWFRAME: SysColorIndex = 6

public val COLOR_WINDOWTEXT: SysColorIndex = 8

public val COMPLEXREGION: GdiRegionType = 3

public val CP_NONE: UInt = 0u

public val CP_RECTANGLE: UInt = 1u

public val CP_REGION: UInt = 2u

public val CREATECOLORSPACE_EMBEDED: UInt = 1u

public val CURVECAPS: GetDeviceCapsIndex = 28u

public val DCBA_FACEDOWNCENTER: UInt = 257u

public val DCBA_FACEDOWNLEFT: UInt = 258u

public val DCBA_FACEDOWNNONE: UInt = 256u

public val DCBA_FACEDOWNRIGHT: UInt = 259u

public val DCBA_FACEUPCENTER: UInt = 1u

public val DCBA_FACEUPLEFT: UInt = 2u

public val DCBA_FACEUPNONE: UInt = 0u

public val DCBA_FACEUPRIGHT: UInt = 3u

public val DCB_ACCUMULATE: SetBoundsRectFlags = 2u

public val DCB_DISABLE: SetBoundsRectFlags = 8u

public val DCB_ENABLE: SetBoundsRectFlags = 4u

public val DCB_RESET: SetBoundsRectFlags = 1u

public val DCTT_BITMAP: Int = 1

public val DCTT_DOWNLOAD: Int = 2

public val DCTT_DOWNLOAD_OUTLINE: Int = 8

public val DCTT_SUBDEV: Int = 4

public val DCX_CACHE: GetDcxFlags = 2u

public val DCX_CLIPCHILDREN: GetDcxFlags = 8u

public val DCX_CLIPSIBLINGS: GetDcxFlags = 16u

public val DCX_EXCLUDERGN: GetDcxFlags = 64u

public val DCX_INTERSECTRGN: GetDcxFlags = 128u

public val DCX_INTERSECTUPDATE: GetDcxFlags = 512u

public val DCX_LOCKWINDOWUPDATE: GetDcxFlags = 1024u

public val DCX_NORESETATTRS: GetDcxFlags = 4u

public val DCX_PARENTCLIP: GetDcxFlags = 32u

public val DCX_VALIDATE: GetDcxFlags = 2097152u

public val DCX_WINDOW: GetDcxFlags = 1u

public val DC_ACTIVE: DrawCaptionFlags = 1u

public val DC_BINADJUST: UInt = 19u

public val DC_BRUSH: GetStockObjectFlags = 18

public val DC_BUTTONS: DrawCaptionFlags = 4096u

public val DC_DATATYPE_PRODUCED: UInt = 21u

public val DC_EMF_COMPLIANT: UInt = 20u

public val DC_GRADIENT: DrawCaptionFlags = 32u

public val DC_ICON: DrawCaptionFlags = 4u

public val DC_INBUTTON: DrawCaptionFlags = 16u

public val DC_MANUFACTURER: UInt = 23u

public val DC_MODEL: UInt = 24u

public val DC_PEN: GetStockObjectFlags = 19

public val DC_SMALLCAP: DrawCaptionFlags = 2u

public val DC_TEXT: DrawCaptionFlags = 8u

public val DEFAULT_CHARSET: FontCharset = 1u.toUByte()

public val DEFAULT_GUI_FONT: GetStockObjectFlags = 17

public val DEFAULT_PALETTE: GetStockObjectFlags = 15

public val DEFAULT_PITCH: FontPitch = 0u.toUByte()

public val DEFAULT_QUALITY: FontQuality = 0u.toUByte()

public val DESKTOPHORZRES: GetDeviceCapsIndex = 118u

public val DESKTOPVERTRES: GetDeviceCapsIndex = 117u

public val DEVICEDATA: UInt = 19u

public val DEVICE_DEFAULT_FONT: GetStockObjectFlags = 14

public val DEVICE_FONTTYPE: UInt = 2u

public val DFCS_ADJUSTRECT: DfcsState = 8192u

public val DFCS_BUTTON3STATE: DfcsState = 8u

public val DFCS_BUTTONCHECK: DfcsState = 0u

public val DFCS_BUTTONPUSH: DfcsState = 16u

public val DFCS_BUTTONRADIO: DfcsState = 4u

public val DFCS_BUTTONRADIOIMAGE: DfcsState = 1u

public val DFCS_BUTTONRADIOMASK: DfcsState = 2u

public val DFCS_CAPTIONCLOSE: DfcsState = 0u

public val DFCS_CAPTIONHELP: DfcsState = 4u

public val DFCS_CAPTIONMAX: DfcsState = 2u

public val DFCS_CAPTIONMIN: DfcsState = 1u

public val DFCS_CAPTIONRESTORE: DfcsState = 3u

public val DFCS_CHECKED: DfcsState = 1024u

public val DFCS_FLAT: DfcsState = 16384u

public val DFCS_HOT: DfcsState = 4096u

public val DFCS_INACTIVE: DfcsState = 256u

public val DFCS_MENUARROW: DfcsState = 0u

public val DFCS_MENUARROWRIGHT: DfcsState = 4u

public val DFCS_MENUBULLET: DfcsState = 2u

public val DFCS_MENUCHECK: DfcsState = 1u

public val DFCS_MONO: DfcsState = 32768u

public val DFCS_PUSHED: DfcsState = 512u

public val DFCS_SCROLLCOMBOBOX: DfcsState = 5u

public val DFCS_SCROLLDOWN: DfcsState = 1u

public val DFCS_SCROLLLEFT: DfcsState = 2u

public val DFCS_SCROLLRIGHT: DfcsState = 3u

public val DFCS_SCROLLSIZEGRIP: DfcsState = 8u

public val DFCS_SCROLLSIZEGRIPRIGHT: DfcsState = 16u

public val DFCS_SCROLLUP: DfcsState = 0u

public val DFCS_TRANSPARENT: DfcsState = 2048u

public val DFC_BUTTON: DfcType = 4u

public val DFC_CAPTION: DfcType = 1u

public val DFC_MENU: DfcType = 2u

public val DFC_POPUPMENU: DfcType = 5u

public val DFC_SCROLL: DfcType = 3u

public val DIB_PAL_COLORS: DibUsage = 1u

public val DIB_RGB_COLORS: DibUsage = 0u

public val DISPLAYCONFIG_COLOR_ENCODING_INTENSITY: DisplayconfigColorEncoding = 4

public val DISPLAYCONFIG_COLOR_ENCODING_RGB: DisplayconfigColorEncoding = 0

public val DISPLAYCONFIG_COLOR_ENCODING_YCBCR420: DisplayconfigColorEncoding = 3

public val DISPLAYCONFIG_COLOR_ENCODING_YCBCR422: DisplayconfigColorEncoding = 2

public val DISPLAYCONFIG_COLOR_ENCODING_YCBCR444: DisplayconfigColorEncoding = 1

public val DISPLAYCONFIG_MAXPATH: UInt = 1024u

public val DISPLAYCONFIG_PATH_ACTIVE: UInt = 1u

public val DISPLAYCONFIG_PATH_CLONE_GROUP_INVALID: UInt = 65535u

public val DISPLAYCONFIG_PATH_DESKTOP_IMAGE_IDX_INVALID: UInt = 65535u

public val DISPLAYCONFIG_PATH_MODE_IDX_INVALID: UInt = 4294967295u

public val DISPLAYCONFIG_PATH_PREFERRED_UNSCALED: UInt = 4u

public val DISPLAYCONFIG_PATH_SOURCE_MODE_IDX_INVALID: UInt = 65535u

public val DISPLAYCONFIG_PATH_SUPPORT_VIRTUAL_MODE: UInt = 8u

public val DISPLAYCONFIG_PATH_TARGET_MODE_IDX_INVALID: UInt = 65535u

public val DISPLAYCONFIG_PATH_VALID_FLAGS: UInt = 29u

public val DISPLAYCONFIG_SOURCE_IN_USE: UInt = 1u

public val DISPLAYCONFIG_TARGET_FORCED_AVAILABILITY_BOOT: UInt = 4u

public val DISPLAYCONFIG_TARGET_FORCED_AVAILABILITY_PATH: UInt = 8u

public val DISPLAYCONFIG_TARGET_FORCED_AVAILABILITY_SYSTEM: UInt = 16u

public val DISPLAYCONFIG_TARGET_FORCIBLE: UInt = 2u

public val DISPLAYCONFIG_TARGET_IN_USE: UInt = 1u

public val DISPLAYCONFIG_TARGET_IS_HMD: UInt = 32u

public val DISPLAY_DEVICE_ACC_DRIVER: DisplayDeviceStateFlags = 64u

public val DISPLAY_DEVICE_ACTIVE: DisplayDeviceStateFlags = 1u

public val DISPLAY_DEVICE_ATTACHED: DisplayDeviceStateFlags = 2u

public val DISPLAY_DEVICE_ATTACHED_TO_DESKTOP: DisplayDeviceStateFlags = 1u

public val DISPLAY_DEVICE_DISCONNECT: DisplayDeviceStateFlags = 33554432u

public val DISPLAY_DEVICE_MIRRORING_DRIVER: DisplayDeviceStateFlags = 8u

public val DISPLAY_DEVICE_MODESPRUNED: DisplayDeviceStateFlags = 134217728u

public val DISPLAY_DEVICE_MULTI_DRIVER: DisplayDeviceStateFlags = 2u

public val DISPLAY_DEVICE_PRIMARY_DEVICE: DisplayDeviceStateFlags = 4u

public val DISPLAY_DEVICE_RDPUDD: DisplayDeviceStateFlags = 16777216u

public val DISPLAY_DEVICE_REMOTE: DisplayDeviceStateFlags = 67108864u

public val DISPLAY_DEVICE_REMOVABLE: DisplayDeviceStateFlags = 32u

public val DISPLAY_DEVICE_TS_COMPATIBLE: DisplayDeviceStateFlags = 2097152u

public val DISPLAY_DEVICE_UNSAFE_MODES_ON: DisplayDeviceStateFlags = 524288u

public val DISPLAY_DEVICE_VGA_COMPATIBLE: DisplayDeviceStateFlags = 16u

public val DISP_CHANGE_BADDUALVIEW: DispChange = -6

public val DISP_CHANGE_BADFLAGS: DispChange = -4

public val DISP_CHANGE_BADMODE: DispChange = -2

public val DISP_CHANGE_BADPARAM: DispChange = -5

public val DISP_CHANGE_FAILED: DispChange = -1

public val DISP_CHANGE_NOTUPDATED: DispChange = -3

public val DISP_CHANGE_RESTART: DispChange = 1

public val DISP_CHANGE_SUCCESSFUL: DispChange = 0

public val DI_APPBANDING: UInt = 1u

public val DI_ROPS_READ_DESTINATION: UInt = 2u

public val DKGRAY_BRUSH: GetStockObjectFlags = 3

public val DMBIN_AUTO: UInt = 7u

public val DMBIN_CASSETTE: UInt = 14u

public val DMBIN_ENVELOPE: UInt = 5u

public val DMBIN_ENVMANUAL: UInt = 6u

public val DMBIN_FORMSOURCE: UInt = 15u

public val DMBIN_LARGECAPACITY: UInt = 11u

public val DMBIN_LARGEFMT: UInt = 10u

public val DMBIN_LAST: UInt = 15u

public val DMBIN_LOWER: UInt = 2u

public val DMBIN_MANUAL: UInt = 4u

public val DMBIN_MIDDLE: UInt = 3u

public val DMBIN_ONLYONE: UInt = 1u

public val DMBIN_SMALLFMT: UInt = 9u

public val DMBIN_TRACTOR: UInt = 8u

public val DMBIN_UPPER: UInt = 1u

public val DMBIN_USER: UInt = 256u

public val DMCOLLATE_FALSE: DevmodeCollate = 0

public val DMCOLLATE_TRUE: DevmodeCollate = 1

public val DMCOLOR_COLOR: DevmodeColor = 2

public val DMCOLOR_MONOCHROME: DevmodeColor = 1

public val DMDFO_CENTER: DevmodeDisplayFixedOutput = 2u

public val DMDFO_DEFAULT: DevmodeDisplayFixedOutput = 0u

public val DMDFO_STRETCH: DevmodeDisplayFixedOutput = 1u

public val DMDISPLAYFLAGS_TEXTMODE: UInt = 4u

public val DMDITHER_COARSE: UInt = 2u

public val DMDITHER_ERRORDIFFUSION: UInt = 5u

public val DMDITHER_FINE: UInt = 3u

public val DMDITHER_GRAYSCALE: UInt = 10u

public val DMDITHER_LINEART: UInt = 4u

public val DMDITHER_NONE: UInt = 1u

public val DMDITHER_RESERVED6: UInt = 6u

public val DMDITHER_RESERVED7: UInt = 7u

public val DMDITHER_RESERVED8: UInt = 8u

public val DMDITHER_RESERVED9: UInt = 9u

public val DMDITHER_USER: UInt = 256u

public val DMDO_180: DevmodeDisplayOrientation = 2u

public val DMDO_270: DevmodeDisplayOrientation = 3u

public val DMDO_90: DevmodeDisplayOrientation = 1u

public val DMDO_DEFAULT: DevmodeDisplayOrientation = 0u

public val DMDUP_HORIZONTAL: DevmodeDuplex = 3

public val DMDUP_SIMPLEX: DevmodeDuplex = 1

public val DMDUP_VERTICAL: DevmodeDuplex = 2

public val DMICMMETHOD_DEVICE: UInt = 4u

public val DMICMMETHOD_DRIVER: UInt = 3u

public val DMICMMETHOD_NONE: UInt = 1u

public val DMICMMETHOD_SYSTEM: UInt = 2u

public val DMICMMETHOD_USER: UInt = 256u

public val DMICM_ABS_COLORIMETRIC: UInt = 4u

public val DMICM_COLORIMETRIC: UInt = 3u

public val DMICM_CONTRAST: UInt = 2u

public val DMICM_SATURATE: UInt = 1u

public val DMICM_USER: UInt = 256u

public val DMMEDIA_GLOSSY: UInt = 3u

public val DMMEDIA_STANDARD: UInt = 1u

public val DMMEDIA_TRANSPARENCY: UInt = 2u

public val DMMEDIA_USER: UInt = 256u

public val DMNUP_ONEUP: UInt = 2u

public val DMNUP_SYSTEM: UInt = 1u

public val DMORIENT_LANDSCAPE: UInt = 2u

public val DMORIENT_PORTRAIT: UInt = 1u

public val DMPAPER_10X11: UInt = 45u

public val DMPAPER_10X14: UInt = 16u

public val DMPAPER_11X17: UInt = 17u

public val DMPAPER_12X11: UInt = 90u

public val DMPAPER_15X11: UInt = 46u

public val DMPAPER_9X11: UInt = 44u

public val DMPAPER_A2: UInt = 66u

public val DMPAPER_A3: UInt = 8u

public val DMPAPER_A3_EXTRA: UInt = 63u

public val DMPAPER_A3_EXTRA_TRANSVERSE: UInt = 68u

public val DMPAPER_A3_ROTATED: UInt = 76u

public val DMPAPER_A3_TRANSVERSE: UInt = 67u

public val DMPAPER_A4: UInt = 9u

public val DMPAPER_A4SMALL: UInt = 10u

public val DMPAPER_A4_EXTRA: UInt = 53u

public val DMPAPER_A4_PLUS: UInt = 60u

public val DMPAPER_A4_ROTATED: UInt = 77u

public val DMPAPER_A4_TRANSVERSE: UInt = 55u

public val DMPAPER_A5: UInt = 11u

public val DMPAPER_A5_EXTRA: UInt = 64u

public val DMPAPER_A5_ROTATED: UInt = 78u

public val DMPAPER_A5_TRANSVERSE: UInt = 61u

public val DMPAPER_A6: UInt = 70u

public val DMPAPER_A6_ROTATED: UInt = 83u

public val DMPAPER_A_PLUS: UInt = 57u

public val DMPAPER_B4: UInt = 12u

public val DMPAPER_B4_JIS_ROTATED: UInt = 79u

public val DMPAPER_B5: UInt = 13u

public val DMPAPER_B5_EXTRA: UInt = 65u

public val DMPAPER_B5_JIS_ROTATED: UInt = 80u

public val DMPAPER_B5_TRANSVERSE: UInt = 62u

public val DMPAPER_B6_JIS: UInt = 88u

public val DMPAPER_B6_JIS_ROTATED: UInt = 89u

public val DMPAPER_B_PLUS: UInt = 58u

public val DMPAPER_CSHEET: UInt = 24u

public val DMPAPER_DBL_JAPANESE_POSTCARD: UInt = 69u

public val DMPAPER_DBL_JAPANESE_POSTCARD_ROTATED: UInt = 82u

public val DMPAPER_DSHEET: UInt = 25u

public val DMPAPER_ENV_10: UInt = 20u

public val DMPAPER_ENV_11: UInt = 21u

public val DMPAPER_ENV_12: UInt = 22u

public val DMPAPER_ENV_14: UInt = 23u

public val DMPAPER_ENV_9: UInt = 19u

public val DMPAPER_ENV_B4: UInt = 33u

public val DMPAPER_ENV_B5: UInt = 34u

public val DMPAPER_ENV_B6: UInt = 35u

public val DMPAPER_ENV_C3: UInt = 29u

public val DMPAPER_ENV_C4: UInt = 30u

public val DMPAPER_ENV_C5: UInt = 28u

public val DMPAPER_ENV_C6: UInt = 31u

public val DMPAPER_ENV_C65: UInt = 32u

public val DMPAPER_ENV_DL: UInt = 27u

public val DMPAPER_ENV_INVITE: UInt = 47u

public val DMPAPER_ENV_ITALY: UInt = 36u

public val DMPAPER_ENV_MONARCH: UInt = 37u

public val DMPAPER_ENV_PERSONAL: UInt = 38u

public val DMPAPER_ESHEET: UInt = 26u

public val DMPAPER_EXECUTIVE: UInt = 7u

public val DMPAPER_FANFOLD_LGL_GERMAN: UInt = 41u

public val DMPAPER_FANFOLD_STD_GERMAN: UInt = 40u

public val DMPAPER_FANFOLD_US: UInt = 39u

public val DMPAPER_FOLIO: UInt = 14u

public val DMPAPER_ISO_B4: UInt = 42u

public val DMPAPER_JAPANESE_POSTCARD: UInt = 43u

public val DMPAPER_JAPANESE_POSTCARD_ROTATED: UInt = 81u

public val DMPAPER_JENV_CHOU3: UInt = 73u

public val DMPAPER_JENV_CHOU3_ROTATED: UInt = 86u

public val DMPAPER_JENV_CHOU4: UInt = 74u

public val DMPAPER_JENV_CHOU4_ROTATED: UInt = 87u

public val DMPAPER_JENV_KAKU2: UInt = 71u

public val DMPAPER_JENV_KAKU2_ROTATED: UInt = 84u

public val DMPAPER_JENV_KAKU3: UInt = 72u

public val DMPAPER_JENV_KAKU3_ROTATED: UInt = 85u

public val DMPAPER_JENV_YOU4: UInt = 91u

public val DMPAPER_JENV_YOU4_ROTATED: UInt = 92u

public val DMPAPER_LAST: UInt = 118u

public val DMPAPER_LEDGER: UInt = 4u

public val DMPAPER_LEGAL: UInt = 5u

public val DMPAPER_LEGAL_EXTRA: UInt = 51u

public val DMPAPER_LETTER: UInt = 1u

public val DMPAPER_LETTERSMALL: UInt = 2u

public val DMPAPER_LETTER_EXTRA: UInt = 50u

public val DMPAPER_LETTER_EXTRA_TRANSVERSE: UInt = 56u

public val DMPAPER_LETTER_PLUS: UInt = 59u

public val DMPAPER_LETTER_ROTATED: UInt = 75u

public val DMPAPER_LETTER_TRANSVERSE: UInt = 54u

public val DMPAPER_NOTE: UInt = 18u

public val DMPAPER_P16K: UInt = 93u

public val DMPAPER_P16K_ROTATED: UInt = 106u

public val DMPAPER_P32K: UInt = 94u

public val DMPAPER_P32KBIG: UInt = 95u

public val DMPAPER_P32KBIG_ROTATED: UInt = 108u

public val DMPAPER_P32K_ROTATED: UInt = 107u

public val DMPAPER_PENV_1: UInt = 96u

public val DMPAPER_PENV_10: UInt = 105u

public val DMPAPER_PENV_10_ROTATED: UInt = 118u

public val DMPAPER_PENV_1_ROTATED: UInt = 109u

public val DMPAPER_PENV_2: UInt = 97u

public val DMPAPER_PENV_2_ROTATED: UInt = 110u

public val DMPAPER_PENV_3: UInt = 98u

public val DMPAPER_PENV_3_ROTATED: UInt = 111u

public val DMPAPER_PENV_4: UInt = 99u

public val DMPAPER_PENV_4_ROTATED: UInt = 112u

public val DMPAPER_PENV_5: UInt = 100u

public val DMPAPER_PENV_5_ROTATED: UInt = 113u

public val DMPAPER_PENV_6: UInt = 101u

public val DMPAPER_PENV_6_ROTATED: UInt = 114u

public val DMPAPER_PENV_7: UInt = 102u

public val DMPAPER_PENV_7_ROTATED: UInt = 115u

public val DMPAPER_PENV_8: UInt = 103u

public val DMPAPER_PENV_8_ROTATED: UInt = 116u

public val DMPAPER_PENV_9: UInt = 104u

public val DMPAPER_PENV_9_ROTATED: UInt = 117u

public val DMPAPER_QUARTO: UInt = 15u

public val DMPAPER_RESERVED_48: UInt = 48u

public val DMPAPER_RESERVED_49: UInt = 49u

public val DMPAPER_STATEMENT: UInt = 6u

public val DMPAPER_TABLOID: UInt = 3u

public val DMPAPER_TABLOID_EXTRA: UInt = 52u

public val DMPAPER_USER: UInt = 256u

public val DMRES_DRAFT: Int = -1

public val DMRES_HIGH: Int = -4

public val DMRES_LOW: Int = -2

public val DMRES_MEDIUM: Int = -3

public val DMTT_BITMAP: DevmodeTruetypeOption = 1

public val DMTT_DOWNLOAD: DevmodeTruetypeOption = 2

public val DMTT_DOWNLOAD_OUTLINE: DevmodeTruetypeOption = 4

public val DMTT_SUBDEV: DevmodeTruetypeOption = 3

public val DM_BITSPERPEL: DevmodeFieldFlags = 262144u

public val DM_COLLATE: DevmodeFieldFlags = 32768u

public val DM_COLOR: DevmodeFieldFlags = 2048u

public val DM_COPIES: DevmodeFieldFlags = 256u

public val DM_COPY: DevmodeFieldFlags = 2u

public val DM_DEFAULTSOURCE: DevmodeFieldFlags = 512u

public val DM_DISPLAYFIXEDOUTPUT: DevmodeFieldFlags = 536870912u

public val DM_DISPLAYFLAGS: DevmodeFieldFlags = 2097152u

public val DM_DISPLAYFREQUENCY: DevmodeFieldFlags = 4194304u

public val DM_DISPLAYORIENTATION: DevmodeFieldFlags = 128u

public val DM_DITHERTYPE: DevmodeFieldFlags = 67108864u

public val DM_DUPLEX: DevmodeFieldFlags = 4096u

public val DM_FORMNAME: DevmodeFieldFlags = 65536u

public val DM_ICMINTENT: DevmodeFieldFlags = 16777216u

public val DM_ICMMETHOD: DevmodeFieldFlags = 8388608u

public val DM_INTERLACED: DevmodeFieldFlags = 2u

public val DM_IN_BUFFER: DevmodeFieldFlags = 8u

public val DM_IN_PROMPT: DevmodeFieldFlags = 4u

public val DM_LOGPIXELS: DevmodeFieldFlags = 131072u

public val DM_MEDIATYPE: DevmodeFieldFlags = 33554432u

public val DM_MODIFY: DevmodeFieldFlags = 8u

public val DM_NUP: DevmodeFieldFlags = 64u

public val DM_ORIENTATION: DevmodeFieldFlags = 1u

public val DM_OUT_BUFFER: DevmodeFieldFlags = 2u

public val DM_OUT_DEFAULT: DevmodeFieldFlags = 1u

public val DM_PANNINGHEIGHT: DevmodeFieldFlags = 268435456u

public val DM_PANNINGWIDTH: DevmodeFieldFlags = 134217728u

public val DM_PAPERLENGTH: DevmodeFieldFlags = 4u

public val DM_PAPERSIZE: DevmodeFieldFlags = 2u

public val DM_PAPERWIDTH: DevmodeFieldFlags = 8u

public val DM_PELSHEIGHT: DevmodeFieldFlags = 1048576u

public val DM_PELSWIDTH: DevmodeFieldFlags = 524288u

public val DM_POSITION: DevmodeFieldFlags = 32u

public val DM_PRINTQUALITY: DevmodeFieldFlags = 1024u

public val DM_PROMPT: DevmodeFieldFlags = 4u

public val DM_SCALE: DevmodeFieldFlags = 16u

public val DM_SPECVERSION: DevmodeFieldFlags = 1025u

public val DM_TTOPTION: DevmodeFieldFlags = 16384u

public val DM_UPDATE: DevmodeFieldFlags = 1u

public val DM_YRESOLUTION: DevmodeFieldFlags = 8192u

public val DOWNLOADFACE: UInt = 514u

public val DOWNLOADHEADER: UInt = 4111u

public val DRAFTMODE: UInt = 7u

public val DRAFT_QUALITY: FontQuality = 1u.toUByte()

public val DRAWPATTERNRECT: UInt = 25u

public val DRIVERVERSION: GetDeviceCapsIndex = 0u

public val DSS_DISABLED: DrawstateFlags = 32u

public val DSS_HIDEPREFIX: DrawstateFlags = 512u

public val DSS_MONO: DrawstateFlags = 128u

public val DSS_NORMAL: DrawstateFlags = 0u

public val DSS_PREFIXONLY: DrawstateFlags = 1024u

public val DSS_RIGHT: DrawstateFlags = 32768u

public val DSS_UNION: DrawstateFlags = 16u

public val DSTINVERT: RopCode = 5570569u

public val DST_BITMAP: DrawstateFlags = 4u

public val DST_COMPLEX: DrawstateFlags = 0u

public val DST_ICON: DrawstateFlags = 3u

public val DST_PREFIXTEXT: DrawstateFlags = 2u

public val DST_TEXT: DrawstateFlags = 1u

public val DT_BOTTOM: DrawTextFormat = 8u

public val DT_CALCRECT: DrawTextFormat = 1024u

public val DT_CENTER: DrawTextFormat = 1u

public val DT_CHARSTREAM: UInt = 4u

public val DT_DISPFILE: UInt = 6u

public val DT_EDITCONTROL: DrawTextFormat = 8192u

public val DT_END_ELLIPSIS: DrawTextFormat = 32768u

public val DT_EXPANDTABS: DrawTextFormat = 64u

public val DT_EXTERNALLEADING: DrawTextFormat = 512u

public val DT_HIDEPREFIX: DrawTextFormat = 1048576u

public val DT_INTERNAL: DrawTextFormat = 4096u

public val DT_LEFT: DrawTextFormat = 0u

public val DT_METAFILE: UInt = 5u

public val DT_MODIFYSTRING: DrawTextFormat = 65536u

public val DT_NOCLIP: DrawTextFormat = 256u

public val DT_NOFULLWIDTHCHARBREAK: DrawTextFormat = 524288u

public val DT_NOPREFIX: DrawTextFormat = 2048u

public val DT_PATH_ELLIPSIS: DrawTextFormat = 16384u

public val DT_PLOTTER: UInt = 0u

public val DT_PREFIXONLY: DrawTextFormat = 2097152u

public val DT_RASCAMERA: UInt = 3u

public val DT_RASDISPLAY: UInt = 1u

public val DT_RASPRINTER: UInt = 2u

public val DT_RIGHT: DrawTextFormat = 2u

public val DT_RTLREADING: DrawTextFormat = 131072u

public val DT_SINGLELINE: DrawTextFormat = 32u

public val DT_TABSTOP: DrawTextFormat = 128u

public val DT_TOP: DrawTextFormat = 0u

public val DT_VCENTER: DrawTextFormat = 4u

public val DT_WORDBREAK: DrawTextFormat = 16u

public val DT_WORD_ELLIPSIS: DrawTextFormat = 262144u

public val EASTEUROPE_CHARSET: FontCharset = 238u.toUByte()

public val EDGE_BUMP: DrawedgeFlags = 9u

public val EDGE_ETCHED: DrawedgeFlags = 6u

public val EDGE_RAISED: DrawedgeFlags = 5u

public val EDGE_SUNKEN: DrawedgeFlags = 10u

public val EDS_RAWMODE: EnumDisplaySettingsFlags = 2u

public val EDS_ROTATEDMODE: EnumDisplaySettingsFlags = 4u

public val ELF_CULTURE_LATIN: UInt = 0u

public val ELF_VENDOR_SIZE: UInt = 4u

public val ELF_VERSION: UInt = 0u

public val EMBED_EDITABLE: EmbeddedFontPrivStatus = 2u

public val EMBED_INSTALLABLE: EmbeddedFontPrivStatus = 3u

public val EMBED_NOEMBEDDING: EmbeddedFontPrivStatus = 4u

public val EMBED_PREVIEWPRINT: EmbeddedFontPrivStatus = 1u

public val EMR_ABORTPATH: EnhancedMetafileRecordType = 68u

public val EMR_ALPHABLEND: EnhancedMetafileRecordType = 114u

public val EMR_ANGLEARC: EnhancedMetafileRecordType = 41u

public val EMR_ARC: EnhancedMetafileRecordType = 45u

public val EMR_ARCTO: EnhancedMetafileRecordType = 55u

public val EMR_BEGINPATH: EnhancedMetafileRecordType = 59u

public val EMR_BITBLT: EnhancedMetafileRecordType = 76u

public val EMR_CHORD: EnhancedMetafileRecordType = 46u

public val EMR_CLOSEFIGURE: EnhancedMetafileRecordType = 61u

public val EMR_COLORCORRECTPALETTE: EnhancedMetafileRecordType = 111u

public val EMR_COLORMATCHTOTARGETW: EnhancedMetafileRecordType = 121u

public val EMR_CREATEBRUSHINDIRECT: EnhancedMetafileRecordType = 39u

public val EMR_CREATECOLORSPACE: EnhancedMetafileRecordType = 99u

public val EMR_CREATECOLORSPACEW: EnhancedMetafileRecordType = 122u

public val EMR_CREATEDIBPATTERNBRUSHPT: EnhancedMetafileRecordType = 94u

public val EMR_CREATEMONOBRUSH: EnhancedMetafileRecordType = 93u

public val EMR_CREATEPALETTE: EnhancedMetafileRecordType = 49u

public val EMR_CREATEPEN: EnhancedMetafileRecordType = 38u

public val EMR_DELETECOLORSPACE: EnhancedMetafileRecordType = 101u

public val EMR_DELETEOBJECT: EnhancedMetafileRecordType = 40u

public val EMR_ELLIPSE: EnhancedMetafileRecordType = 42u

public val EMR_ENDPATH: EnhancedMetafileRecordType = 60u

public val EMR_EOF: EnhancedMetafileRecordType = 14u

public val EMR_EXCLUDECLIPRECT: EnhancedMetafileRecordType = 29u

public val EMR_EXTCREATEFONTINDIRECTW: EnhancedMetafileRecordType = 82u

public val EMR_EXTCREATEPEN: EnhancedMetafileRecordType = 95u

public val EMR_EXTFLOODFILL: EnhancedMetafileRecordType = 53u

public val EMR_EXTSELECTCLIPRGN: EnhancedMetafileRecordType = 75u

public val EMR_EXTTEXTOUTA: EnhancedMetafileRecordType = 83u

public val EMR_EXTTEXTOUTW: EnhancedMetafileRecordType = 84u

public val EMR_FILLPATH: EnhancedMetafileRecordType = 62u

public val EMR_FILLRGN: EnhancedMetafileRecordType = 71u

public val EMR_FLATTENPATH: EnhancedMetafileRecordType = 65u

public val EMR_FRAMERGN: EnhancedMetafileRecordType = 72u

public val EMR_GDICOMMENT: EnhancedMetafileRecordType = 70u

public val EMR_GLSBOUNDEDRECORD: EnhancedMetafileRecordType = 103u

public val EMR_GLSRECORD: EnhancedMetafileRecordType = 102u

public val EMR_GRADIENTFILL: EnhancedMetafileRecordType = 118u

public val EMR_HEADER: EnhancedMetafileRecordType = 1u

public val EMR_INTERSECTCLIPRECT: EnhancedMetafileRecordType = 30u

public val EMR_INVERTRGN: EnhancedMetafileRecordType = 73u

public val EMR_LINETO: EnhancedMetafileRecordType = 54u

public val EMR_MASKBLT: EnhancedMetafileRecordType = 78u

public val EMR_MAX: EnhancedMetafileRecordType = 122u

public val EMR_MIN: EnhancedMetafileRecordType = 1u

public val EMR_MODIFYWORLDTRANSFORM: EnhancedMetafileRecordType = 36u

public val EMR_MOVETOEX: EnhancedMetafileRecordType = 27u

public val EMR_OFFSETCLIPRGN: EnhancedMetafileRecordType = 26u

public val EMR_PAINTRGN: EnhancedMetafileRecordType = 74u

public val EMR_PIE: EnhancedMetafileRecordType = 47u

public val EMR_PIXELFORMAT: EnhancedMetafileRecordType = 104u

public val EMR_PLGBLT: EnhancedMetafileRecordType = 79u

public val EMR_POLYBEZIER: EnhancedMetafileRecordType = 2u

public val EMR_POLYBEZIER16: EnhancedMetafileRecordType = 85u

public val EMR_POLYBEZIERTO: EnhancedMetafileRecordType = 5u

public val EMR_POLYBEZIERTO16: EnhancedMetafileRecordType = 88u

public val EMR_POLYDRAW: EnhancedMetafileRecordType = 56u

public val EMR_POLYDRAW16: EnhancedMetafileRecordType = 92u

public val EMR_POLYGON: EnhancedMetafileRecordType = 3u

public val EMR_POLYGON16: EnhancedMetafileRecordType = 86u

public val EMR_POLYLINE: EnhancedMetafileRecordType = 4u

public val EMR_POLYLINE16: EnhancedMetafileRecordType = 87u

public val EMR_POLYLINETO: EnhancedMetafileRecordType = 6u

public val EMR_POLYLINETO16: EnhancedMetafileRecordType = 89u

public val EMR_POLYPOLYGON: EnhancedMetafileRecordType = 8u

public val EMR_POLYPOLYGON16: EnhancedMetafileRecordType = 91u

public val EMR_POLYPOLYLINE: EnhancedMetafileRecordType = 7u

public val EMR_POLYPOLYLINE16: EnhancedMetafileRecordType = 90u

public val EMR_POLYTEXTOUTA: EnhancedMetafileRecordType = 96u

public val EMR_POLYTEXTOUTW: EnhancedMetafileRecordType = 97u

public val EMR_REALIZEPALETTE: EnhancedMetafileRecordType = 52u

public val EMR_RECTANGLE: EnhancedMetafileRecordType = 43u

public val EMR_RESERVED_105: EnhancedMetafileRecordType = 105u

public val EMR_RESERVED_106: EnhancedMetafileRecordType = 106u

public val EMR_RESERVED_107: EnhancedMetafileRecordType = 107u

public val EMR_RESERVED_108: EnhancedMetafileRecordType = 108u

public val EMR_RESERVED_109: EnhancedMetafileRecordType = 109u

public val EMR_RESERVED_110: EnhancedMetafileRecordType = 110u

public val EMR_RESERVED_117: EnhancedMetafileRecordType = 117u

public val EMR_RESERVED_119: EnhancedMetafileRecordType = 119u

public val EMR_RESERVED_120: EnhancedMetafileRecordType = 120u

public val EMR_RESIZEPALETTE: EnhancedMetafileRecordType = 51u

public val EMR_RESTOREDC: EnhancedMetafileRecordType = 34u

public val EMR_ROUNDRECT: EnhancedMetafileRecordType = 44u

public val EMR_SAVEDC: EnhancedMetafileRecordType = 33u

public val EMR_SCALEVIEWPORTEXTEX: EnhancedMetafileRecordType = 31u

public val EMR_SCALEWINDOWEXTEX: EnhancedMetafileRecordType = 32u

public val EMR_SELECTCLIPPATH: EnhancedMetafileRecordType = 67u

public val EMR_SELECTOBJECT: EnhancedMetafileRecordType = 37u

public val EMR_SELECTPALETTE: EnhancedMetafileRecordType = 48u

public val EMR_SETARCDIRECTION: EnhancedMetafileRecordType = 57u

public val EMR_SETBKCOLOR: EnhancedMetafileRecordType = 25u

public val EMR_SETBKMODE: EnhancedMetafileRecordType = 18u

public val EMR_SETBRUSHORGEX: EnhancedMetafileRecordType = 13u

public val EMR_SETCOLORADJUSTMENT: EnhancedMetafileRecordType = 23u

public val EMR_SETCOLORSPACE: EnhancedMetafileRecordType = 100u

public val EMR_SETDIBITSTODEVICE: EnhancedMetafileRecordType = 80u

public val EMR_SETICMMODE: EnhancedMetafileRecordType = 98u

public val EMR_SETICMPROFILEA: EnhancedMetafileRecordType = 112u

public val EMR_SETICMPROFILEW: EnhancedMetafileRecordType = 113u

public val EMR_SETLAYOUT: EnhancedMetafileRecordType = 115u

public val EMR_SETMAPMODE: EnhancedMetafileRecordType = 17u

public val EMR_SETMAPPERFLAGS: EnhancedMetafileRecordType = 16u

public val EMR_SETMETARGN: EnhancedMetafileRecordType = 28u

public val EMR_SETMITERLIMIT: EnhancedMetafileRecordType = 58u

public val EMR_SETPALETTEENTRIES: EnhancedMetafileRecordType = 50u

public val EMR_SETPIXELV: EnhancedMetafileRecordType = 15u

public val EMR_SETPOLYFILLMODE: EnhancedMetafileRecordType = 19u

public val EMR_SETROP2: EnhancedMetafileRecordType = 20u

public val EMR_SETSTRETCHBLTMODE: EnhancedMetafileRecordType = 21u

public val EMR_SETTEXTALIGN: EnhancedMetafileRecordType = 22u

public val EMR_SETTEXTCOLOR: EnhancedMetafileRecordType = 24u

public val EMR_SETVIEWPORTEXTEX: EnhancedMetafileRecordType = 11u

public val EMR_SETVIEWPORTORGEX: EnhancedMetafileRecordType = 12u

public val EMR_SETWINDOWEXTEX: EnhancedMetafileRecordType = 9u

public val EMR_SETWINDOWORGEX: EnhancedMetafileRecordType = 10u

public val EMR_SETWORLDTRANSFORM: EnhancedMetafileRecordType = 35u

public val EMR_STRETCHBLT: EnhancedMetafileRecordType = 77u

public val EMR_STRETCHDIBITS: EnhancedMetafileRecordType = 81u

public val EMR_STROKEANDFILLPATH: EnhancedMetafileRecordType = 63u

public val EMR_STROKEPATH: EnhancedMetafileRecordType = 64u

public val EMR_TRANSPARENTBLT: EnhancedMetafileRecordType = 116u

public val EMR_WIDENPATH: EnhancedMetafileRecordType = 66u

public val ENABLEDUPLEX: UInt = 28u

public val ENABLEPAIRKERNING: UInt = 769u

public val ENABLERELATIVEWIDTHS: UInt = 768u

public val ENCAPSULATED_POSTSCRIPT: UInt = 4116u

public val ENDDOC: UInt = 11u

public val END_PATH: UInt = 4098u

public val ENHMETA_SIGNATURE: UInt = 1179469088u

public val ENHMETA_STOCK_OBJECT: UInt = 2147483648u

public val ENUMPAPERBINS: UInt = 31u

public val ENUMPAPERMETRICS: UInt = 34u

public val ENUM_CURRENT_SETTINGS: EnumDisplaySettingsMode = 4294967295u

public val ENUM_REGISTRY_SETTINGS: EnumDisplaySettingsMode = 4294967294u

public val EPSPRINTING: UInt = 33u

public val EPS_SIGNATURE: UInt = 1179865157u

public val ERROR: Int = 0

public val ERR_FORMAT: UInt = 1006u

public val ERR_GENERIC: UInt = 1000u

public val ERR_INVALID_BASE: UInt = 1085u

public val ERR_INVALID_CMAP: UInt = 1060u

public val ERR_INVALID_DELTA_FORMAT: UInt = 1013u

public val ERR_INVALID_EBLC: UInt = 1086u

public val ERR_INVALID_GDEF: UInt = 1083u

public val ERR_INVALID_GLYF: UInt = 1061u

public val ERR_INVALID_GPOS: UInt = 1082u

public val ERR_INVALID_GSUB: UInt = 1081u

public val ERR_INVALID_HDMX: UInt = 1089u

public val ERR_INVALID_HEAD: UInt = 1062u

public val ERR_INVALID_HHEA: UInt = 1063u

public val ERR_INVALID_HHEA_OR_VHEA: UInt = 1072u

public val ERR_INVALID_HMTX: UInt = 1064u

public val ERR_INVALID_HMTX_OR_VMTX: UInt = 1073u

public val ERR_INVALID_JSTF: UInt = 1084u

public val ERR_INVALID_LOCA: UInt = 1065u

public val ERR_INVALID_LTSH: UInt = 1087u

public val ERR_INVALID_MAXP: UInt = 1066u

public val ERR_INVALID_MERGE_CHECKSUMS: UInt = 1011u

public val ERR_INVALID_MERGE_FORMATS: UInt = 1010u

public val ERR_INVALID_MERGE_NUMGLYPHS: UInt = 1012u

public val ERR_INVALID_NAME: UInt = 1067u

public val ERR_INVALID_OS2: UInt = 1069u

public val ERR_INVALID_POST: UInt = 1068u

public val ERR_INVALID_TTC_INDEX: UInt = 1015u

public val ERR_INVALID_TTO: UInt = 1080u

public val ERR_INVALID_VDMX: UInt = 1088u

public val ERR_INVALID_VHEA: UInt = 1070u

public val ERR_INVALID_VMTX: UInt = 1071u

public val ERR_MEM: UInt = 1005u

public val ERR_MISSING_CMAP: UInt = 1030u

public val ERR_MISSING_EBDT: UInt = 1044u

public val ERR_MISSING_GLYF: UInt = 1031u

public val ERR_MISSING_HEAD: UInt = 1032u

public val ERR_MISSING_HHEA: UInt = 1033u

public val ERR_MISSING_HHEA_OR_VHEA: UInt = 1042u

public val ERR_MISSING_HMTX: UInt = 1034u

public val ERR_MISSING_HMTX_OR_VMTX: UInt = 1043u

public val ERR_MISSING_LOCA: UInt = 1035u

public val ERR_MISSING_MAXP: UInt = 1036u

public val ERR_MISSING_NAME: UInt = 1037u

public val ERR_MISSING_OS2: UInt = 1039u

public val ERR_MISSING_POST: UInt = 1038u

public val ERR_MISSING_VHEA: UInt = 1040u

public val ERR_MISSING_VMTX: UInt = 1041u

public val ERR_NOT_TTC: UInt = 1014u

public val ERR_NO_GLYPHS: UInt = 1009u

public val ERR_PARAMETER0: UInt = 1100u

public val ERR_PARAMETER1: UInt = 1101u

public val ERR_PARAMETER10: UInt = 1110u

public val ERR_PARAMETER11: UInt = 1111u

public val ERR_PARAMETER12: UInt = 1112u

public val ERR_PARAMETER13: UInt = 1113u

public val ERR_PARAMETER14: UInt = 1114u

public val ERR_PARAMETER15: UInt = 1115u

public val ERR_PARAMETER16: UInt = 1116u

public val ERR_PARAMETER2: UInt = 1102u

public val ERR_PARAMETER3: UInt = 1103u

public val ERR_PARAMETER4: UInt = 1104u

public val ERR_PARAMETER5: UInt = 1105u

public val ERR_PARAMETER6: UInt = 1106u

public val ERR_PARAMETER7: UInt = 1107u

public val ERR_PARAMETER8: UInt = 1108u

public val ERR_PARAMETER9: UInt = 1109u

public val ERR_READCONTROL: UInt = 1003u

public val ERR_READOUTOFBOUNDS: UInt = 1001u

public val ERR_VERSION: UInt = 1008u

public val ERR_WOULD_GROW: UInt = 1007u

public val ERR_WRITECONTROL: UInt = 1004u

public val ERR_WRITEOUTOFBOUNDS: UInt = 1002u

public val ETO_CLIPPED: EtoOptions = 4u

public val ETO_GLYPH_INDEX: EtoOptions = 16u

public val ETO_IGNORELANGUAGE: EtoOptions = 4096u

public val ETO_NUMERICSLATIN: EtoOptions = 2048u

public val ETO_NUMERICSLOCAL: EtoOptions = 1024u

public val ETO_OPAQUE: EtoOptions = 2u

public val ETO_PDY: EtoOptions = 8192u

public val ETO_REVERSE_INDEX_MAP: EtoOptions = 65536u

public val ETO_RTLREADING: EtoOptions = 128u

public val EXTTEXTOUT: UInt = 512u

public val EXT_DEVICE_CAPS: UInt = 4099u

public val E_ADDFONTFAILED: Int = 512

public val E_API_NOTIMPL: Int = 1

public val E_CHARCODECOUNTINVALID: Int = 2

public val E_CHARCODESETINVALID: Int = 3

public val E_CHARSETINVALID: Int = 21

public val E_COULDNTCREATETEMPFILE: Int = 513

public val E_DEVICETRUETYPEFONT: Int = 4

public val E_ERRORACCESSINGEXCLUDELIST: Int = 274

public val E_ERRORACCESSINGFACENAME: Int = 13

public val E_ERRORACCESSINGFONTDATA: Int = 12

public val E_ERRORCOMPRESSINGFONTDATA: Int = 256

public val E_ERRORCONVERTINGCHARS: Int = 18

public val E_ERRORCREATINGFONTFILE: Int = 269

public val E_ERRORDECOMPRESSINGFONTDATA: Int = 273

public val E_ERROREXPANDINGFONTDATA: Int = 519

public val E_ERRORGETTINGDC: Int = 520

public val E_ERRORREADINGFONTDATA: Int = 267

public val E_ERRORUNICODECONVERSION: Int = 17

public val E_EXCEPTION: Int = 19

public val E_EXCEPTIONINCOMPRESSION: Int = 522

public val E_EXCEPTIONINDECOMPRESSION: Int = 521

public val E_FACENAMEINVALID: Int = 275

public val E_FILE_NOT_FOUND: Int = 23

public val E_FLAGSINVALID: Int = 268

public val E_FONTALREADYEXISTS: Int = 270

public val E_FONTDATAINVALID: Int = 258

public val E_FONTFAMILYNAMENOTINFULL: Int = 285

public val E_FONTFILECREATEFAILED: Int = 515

public val E_FONTFILENOTFOUND: Int = 517

public val E_FONTINSTALLFAILED: Int = 272

public val E_FONTNAMEALREADYEXISTS: Int = 271

public val E_FONTNOTEMBEDDABLE: Int = 260

public val E_FONTREFERENCEINVALID: Int = 8

public val E_FONTVARIATIONSIMULATED: Int = 283

public val E_HDCINVALID: Int = 6

public val E_INPUTPARAMINVALID: Int = 25

public val E_NAMECHANGEFAILED: Int = 259

public val E_NOFREEMEMORY: Int = 7

public val E_NONE: Int = 0

public val E_NOOS2: Int = 265

public val E_NOTATRUETYPEFONT: Int = 10

public val E_PBENABLEDINVALID: Int = 280

public val E_PERMISSIONSINVALID: Int = 279

public val E_PRIVSINVALID: Int = 261

public val E_PRIVSTATUSINVALID: Int = 278

public val E_READFROMSTREAMFAILED: Int = 263

public val E_RESERVEDPARAMNOTNULL: Int = 20

public val E_RESOURCEFILECREATEFAILED: Int = 518

public val E_SAVETOSTREAMFAILED: Int = 264

public val E_STATUSINVALID: Int = 277

public val E_STREAMINVALID: Int = 276

public val E_SUBSETTINGEXCEPTION: Int = 281

public val E_SUBSETTINGFAILED: Int = 262

public val E_SUBSTRING_TEST_FAIL: Int = 282

public val E_T2NOFREEMEMORY: Int = 266

public val E_TTC_INDEX_OUT_OF_RANGE: Int = 24

public val E_WINDOWSAPI: Int = 516

public val FEATURESETTING_CUSTPAPER: UInt = 3u

public val FEATURESETTING_MIRROR: UInt = 4u

public val FEATURESETTING_NEGATIVE: UInt = 5u

public val FEATURESETTING_NUP: UInt = 0u

public val FEATURESETTING_OUTPUT: UInt = 1u

public val FEATURESETTING_PRIVATE_BEGIN: UInt = 4096u

public val FEATURESETTING_PRIVATE_END: UInt = 8191u

public val FEATURESETTING_PROTOCOL: UInt = 6u

public val FEATURESETTING_PSLEVEL: UInt = 2u

public val FF_DECORATIVE: FontFamily = 80u.toUByte()

public val FF_DONTCARE: FontFamily = 0u.toUByte()

public val FF_MODERN: FontFamily = 48u.toUByte()

public val FF_ROMAN: FontFamily = 16u.toUByte()

public val FF_SCRIPT: FontFamily = 64u.toUByte()

public val FF_SWISS: FontFamily = 32u.toUByte()

public val FIXED_PITCH: FontPitch = 1u.toUByte()

public val FLI_GLYPHS: Int = 262144

public val FLI_MASK: UInt = 4155u

public val FLOODFILLBORDER: ExtFloodFillType = 0u

public val FLOODFILLSURFACE: ExtFloodFillType = 1u

public val FLUSHOUTPUT: UInt = 6u

public val FONTMAPPER_MAX: UInt = 10u

public val FR_NOT_ENUM: FontResourceCharacteristics = 32u

public val FR_PRIVATE: FontResourceCharacteristics = 16u

public val FS_ARABIC: Int = 64

public val FS_BALTIC: Int = 128

public val FS_CHINESESIMP: Int = 262144

public val FS_CHINESETRAD: Int = 1048576

public val FS_CYRILLIC: Int = 4

public val FS_GREEK: Int = 8

public val FS_HEBREW: Int = 32

public val FS_JISJAPAN: Int = 131072

public val FS_JOHAB: Int = 2097152

public val FS_LATIN1: Int = 1

public val FS_LATIN2: Int = 2

public val FS_SYMBOL: Int = -2147483648.toInt()

public val FS_THAI: Int = 65536

public val FS_TURKISH: Int = 16

public val FS_VIETNAMESE: Int = 256

public val FS_WANSUNG: Int = 524288

public val FW_BLACK: FontWeight = 900u

public val FW_BOLD: FontWeight = 700u

public val FW_DEMIBOLD: FontWeight = 600u

public val FW_DONTCARE: FontWeight = 0u

public val FW_EXTRABOLD: FontWeight = 800u

public val FW_EXTRALIGHT: FontWeight = 200u

public val FW_HEAVY: FontWeight = 900u

public val FW_LIGHT: FontWeight = 300u

public val FW_MEDIUM: FontWeight = 500u

public val FW_NORMAL: FontWeight = 400u

public val FW_REGULAR: FontWeight = 400u

public val FW_SEMIBOLD: FontWeight = 600u

public val FW_THIN: FontWeight = 100u

public val FW_ULTRABOLD: FontWeight = 800u

public val FW_ULTRALIGHT: FontWeight = 200u

public val GB2312_CHARSET: FontCharset = 134u.toUByte()

public val GCPCLASS_ARABIC: UInt = 2u

public val GCPCLASS_HEBREW: UInt = 2u

public val GCPCLASS_LATIN: UInt = 1u

public val GCPCLASS_LATINNUMBER: UInt = 5u

public val GCPCLASS_LATINNUMERICSEPARATOR: UInt = 7u

public val GCPCLASS_LATINNUMERICTERMINATOR: UInt = 6u

public val GCPCLASS_LOCALNUMBER: UInt = 4u

public val GCPCLASS_NEUTRAL: UInt = 3u

public val GCPCLASS_NUMERICSEPARATOR: UInt = 8u

public val GCPCLASS_POSTBOUNDLTR: UInt = 32u

public val GCPCLASS_POSTBOUNDRTL: UInt = 16u

public val GCPCLASS_PREBOUNDLTR: UInt = 128u

public val GCPCLASS_PREBOUNDRTL: UInt = 64u

public val GCPGLYPH_LINKAFTER: UInt = 16384u

public val GCPGLYPH_LINKBEFORE: UInt = 32768u

public val GCP_CLASSIN: GetCharacterPlacementFlags = 524288u

public val GCP_DBCS: UInt = 1u

public val GCP_DIACRITIC: GetCharacterPlacementFlags = 256u

public val GCP_DISPLAYZWG: GetCharacterPlacementFlags = 4194304u

public val GCP_ERROR: UInt = 32768u

public val GCP_GLYPHSHAPE: GetCharacterPlacementFlags = 16u

public val GCP_JUSTIFY: GetCharacterPlacementFlags = 65536u

public val GCP_JUSTIFYIN: Int = 2097152

public val GCP_KASHIDA: GetCharacterPlacementFlags = 1024u

public val GCP_LIGATE: GetCharacterPlacementFlags = 32u

public val GCP_MAXEXTENT: GetCharacterPlacementFlags = 1048576u

public val GCP_NEUTRALOVERRIDE: GetCharacterPlacementFlags = 33554432u

public val GCP_NUMERICOVERRIDE: GetCharacterPlacementFlags = 16777216u

public val GCP_NUMERICSLATIN: GetCharacterPlacementFlags = 67108864u

public val GCP_NUMERICSLOCAL: GetCharacterPlacementFlags = 134217728u

public val GCP_REORDER: GetCharacterPlacementFlags = 2u

public val GCP_SYMSWAPOFF: GetCharacterPlacementFlags = 8388608u

public val GCP_USEKERNING: GetCharacterPlacementFlags = 8u

public val GDICOMMENT_BEGINGROUP: UInt = 2u

public val GDICOMMENT_ENDGROUP: UInt = 3u

public val GDICOMMENT_IDENTIFIER: UInt = 1128875079u

public val GDICOMMENT_MULTIFORMATS: UInt = 1073741828u

public val GDICOMMENT_UNICODE_END: UInt = 128u

public val GDICOMMENT_UNICODE_STRING: UInt = 64u

public val GDICOMMENT_WINDOWS_METAFILE: UInt = 2147483649u

public val GDIPLUS_TS_QUERYVER: UInt = 4122u

public val GDIPLUS_TS_RECORD: UInt = 4123u

public val GDIREGISTERDDRAWPACKETVERSION: UInt = 1u

public val GDI_ERROR: Int = -1

public val GETCOLORTABLE: UInt = 5u

public val GETDEVICEUNITS: UInt = 42u

public val GETEXTENDEDTEXTMETRICS: UInt = 256u

public val GETEXTENTTABLE: UInt = 257u

public val GETFACENAME: UInt = 513u

public val GETPAIRKERNTABLE: UInt = 258u

public val GETPENWIDTH: UInt = 16u

public val GETPHYSPAGESIZE: UInt = 12u

public val GETPRINTINGOFFSET: UInt = 13u

public val GETSCALINGFACTOR: UInt = 14u

public val GETSETPAPERBINS: UInt = 29u

public val GETSETPAPERMETRICS: UInt = 35u

public val GETSETPRINTORIENT: UInt = 30u

public val GETSETSCREENPARAMS: UInt = 3072u

public val GETTECHNOLGY: UInt = 20u

public val GETTECHNOLOGY: UInt = 20u

public val GETTRACKKERNTABLE: UInt = 259u

public val GETVECTORBRUSHSIZE: UInt = 27u

public val GETVECTORPENSIZE: UInt = 26u

public val GET_PS_FEATURESETTING: UInt = 4121u

public val GGI_MARK_NONEXISTING_GLYPHS: UInt = 1u

public val GGO_BEZIER: GetGlyphOutlineFormat = 3u

public val GGO_BITMAP: GetGlyphOutlineFormat = 1u

public val GGO_GLYPH_INDEX: GetGlyphOutlineFormat = 128u

public val GGO_GRAY2_BITMAP: GetGlyphOutlineFormat = 4u

public val GGO_GRAY4_BITMAP: GetGlyphOutlineFormat = 5u

public val GGO_GRAY8_BITMAP: GetGlyphOutlineFormat = 6u

public val GGO_METRICS: GetGlyphOutlineFormat = 0u

public val GGO_NATIVE: GetGlyphOutlineFormat = 2u

public val GGO_UNHINTED: GetGlyphOutlineFormat = 256u

public val GM_ADVANCED: GraphicsMode = 2

public val GM_COMPATIBLE: GraphicsMode = 1

public val GM_LAST: UInt = 2u

public val GRADIENT_FILL_OP_FLAG: UInt = 255u

public val GRADIENT_FILL_RECT_H: GradientFill = 0u

public val GRADIENT_FILL_RECT_V: GradientFill = 1u

public val GRADIENT_FILL_TRIANGLE: GradientFill = 2u

public val GRAY_BRUSH: GetStockObjectFlags = 2

public val GREEK_CHARSET: FontCharset = 161u.toUByte()

public val GS_8BIT_INDICES: UInt = 1u

public val HALFTONE: StretchBltMode = 4

public val HANGEUL_CHARSET: FontCharset = 129u.toUByte()

public val HANGUL_CHARSET: FontCharset = 129u.toUByte()

public val HEBREW_CHARSET: FontCharset = 177u.toUByte()

public val HOLLOW_BRUSH: GetStockObjectFlags = 5

public val HORZRES: GetDeviceCapsIndex = 8u

public val HORZSIZE: GetDeviceCapsIndex = 4u

public val HS_API_MAX: UInt = 12u

public val HS_BDIAGONAL: HatchBrushStyle = 3

public val HS_CROSS: HatchBrushStyle = 4

public val HS_DIAGCROSS: HatchBrushStyle = 5

public val HS_FDIAGONAL: HatchBrushStyle = 2

public val HS_HORIZONTAL: HatchBrushStyle = 0

public val HS_VERTICAL: HatchBrushStyle = 1

public val ILLUMINANT_A: UInt = 1u

public val ILLUMINANT_B: UInt = 2u

public val ILLUMINANT_C: UInt = 3u

public val ILLUMINANT_D50: UInt = 4u

public val ILLUMINANT_D55: UInt = 5u

public val ILLUMINANT_D65: UInt = 6u

public val ILLUMINANT_D75: UInt = 7u

public val ILLUMINANT_DAYLIGHT: UInt = 3u

public val ILLUMINANT_DEVICE_DEFAULT: UInt = 0u

public val ILLUMINANT_F2: UInt = 8u

public val ILLUMINANT_FLUORESCENT: UInt = 8u

public val ILLUMINANT_MAX_INDEX: UInt = 8u

public val ILLUMINANT_NTSC: UInt = 3u

public val ILLUMINANT_TUNGSTEN: UInt = 1u

public val JOHAB_CHARSET: FontCharset = 130u.toUByte()

public val LAYOUT_BITMAPORIENTATIONPRESERVED: DcLayout = 8u

public val LAYOUT_BTT: UInt = 2u

public val LAYOUT_RTL: DcLayout = 1u

public val LAYOUT_VBH: UInt = 4u

public val LCS_GM_ABS_COLORIMETRIC: Int = 8

public val LCS_GM_BUSINESS: Int = 1

public val LCS_GM_GRAPHICS: Int = 2

public val LCS_GM_IMAGES: Int = 4

public val LC_INTERIORS: UInt = 128u

public val LC_MARKER: UInt = 4u

public val LC_NONE: UInt = 0u

public val LC_POLYLINE: UInt = 2u

public val LC_POLYMARKER: UInt = 8u

public val LC_STYLED: UInt = 32u

public val LC_WIDE: UInt = 16u

public val LC_WIDESTYLED: UInt = 64u

public val LF_FACESIZE: UInt = 32u

public val LF_FULLFACESIZE: UInt = 64u

public val LICENSE_DEFAULT: FontLicensePrivs = 0u

public val LICENSE_EDITABLE: FontLicensePrivs = 8u

public val LICENSE_INSTALLABLE: FontLicensePrivs = 0u

public val LICENSE_NOEMBEDDING: FontLicensePrivs = 2u

public val LICENSE_PREVIEWPRINT: FontLicensePrivs = 4u

public val LINECAPS: GetDeviceCapsIndex = 30u

public val LOGPIXELSX: GetDeviceCapsIndex = 88u

public val LOGPIXELSY: GetDeviceCapsIndex = 90u

public val LPD_DOUBLEBUFFER: UInt = 1u

public val LPD_SHARE_ACCUM: UInt = 256u

public val LPD_SHARE_DEPTH: UInt = 64u

public val LPD_SHARE_STENCIL: UInt = 128u

public val LPD_STEREO: UInt = 2u

public val LPD_SUPPORT_GDI: UInt = 16u

public val LPD_SUPPORT_OPENGL: UInt = 32u

public val LPD_SWAP_COPY: UInt = 1024u

public val LPD_SWAP_EXCHANGE: UInt = 512u

public val LPD_TRANSPARENT: UInt = 4096u

public val LPD_TYPE_COLORINDEX: UInt = 1u

public val LPD_TYPE_RGBA: UInt = 0u

public val LTGRAY_BRUSH: GetStockObjectFlags = 1

public val MAC_CHARSET: FontCharset = 77u.toUByte()

public val MAXSTRETCHBLTMODE: UInt = 4u

public val MERGECOPY: RopCode = 12583114u

public val MERGEPAINT: RopCode = 12255782u

public val METAFILE_DRIVER: UInt = 2049u

public val META_ANIMATEPALETTE: UInt = 1078u

public val META_ARC: UInt = 2071u

public val META_BITBLT: UInt = 2338u

public val META_CHORD: UInt = 2096u

public val META_CREATEBRUSHINDIRECT: UInt = 764u

public val META_CREATEFONTINDIRECT: UInt = 763u

public val META_CREATEPALETTE: UInt = 247u

public val META_CREATEPATTERNBRUSH: UInt = 505u

public val META_CREATEPENINDIRECT: UInt = 762u

public val META_CREATEREGION: UInt = 1791u

public val META_DELETEOBJECT: UInt = 496u

public val META_DIBBITBLT: UInt = 2368u

public val META_DIBCREATEPATTERNBRUSH: UInt = 322u

public val META_DIBSTRETCHBLT: UInt = 2881u

public val META_ELLIPSE: UInt = 1048u

public val META_ESCAPE: UInt = 1574u

public val META_EXCLUDECLIPRECT: UInt = 1045u

public val META_EXTFLOODFILL: UInt = 1352u

public val META_EXTTEXTOUT: UInt = 2610u

public val META_FILLREGION: UInt = 552u

public val META_FLOODFILL: UInt = 1049u

public val META_FRAMEREGION: UInt = 1065u

public val META_INTERSECTCLIPRECT: UInt = 1046u

public val META_INVERTREGION: UInt = 298u

public val META_LINETO: UInt = 531u

public val META_MOVETO: UInt = 532u

public val META_OFFSETCLIPRGN: UInt = 544u

public val META_OFFSETVIEWPORTORG: UInt = 529u

public val META_OFFSETWINDOWORG: UInt = 527u

public val META_PAINTREGION: UInt = 299u

public val META_PATBLT: UInt = 1565u

public val META_PIE: UInt = 2074u

public val META_POLYGON: UInt = 804u

public val META_POLYLINE: UInt = 805u

public val META_POLYPOLYGON: UInt = 1336u

public val META_REALIZEPALETTE: UInt = 53u

public val META_RECTANGLE: UInt = 1051u

public val META_RESIZEPALETTE: UInt = 313u

public val META_RESTOREDC: UInt = 295u

public val META_ROUNDRECT: UInt = 1564u

public val META_SAVEDC: UInt = 30u

public val META_SCALEVIEWPORTEXT: UInt = 1042u

public val META_SCALEWINDOWEXT: UInt = 1040u

public val META_SELECTCLIPREGION: UInt = 300u

public val META_SELECTOBJECT: UInt = 301u

public val META_SELECTPALETTE: UInt = 564u

public val META_SETBKCOLOR: UInt = 513u

public val META_SETBKMODE: UInt = 258u

public val META_SETDIBTODEV: UInt = 3379u

public val META_SETLAYOUT: UInt = 329u

public val META_SETMAPMODE: UInt = 259u

public val META_SETMAPPERFLAGS: UInt = 561u

public val META_SETPALENTRIES: UInt = 55u

public val META_SETPIXEL: UInt = 1055u

public val META_SETPOLYFILLMODE: UInt = 262u

public val META_SETRELABS: UInt = 261u

public val META_SETROP2: UInt = 260u

public val META_SETSTRETCHBLTMODE: UInt = 263u

public val META_SETTEXTALIGN: UInt = 302u

public val META_SETTEXTCHAREXTRA: UInt = 264u

public val META_SETTEXTCOLOR: UInt = 521u

public val META_SETTEXTJUSTIFICATION: UInt = 522u

public val META_SETVIEWPORTEXT: UInt = 526u

public val META_SETVIEWPORTORG: UInt = 525u

public val META_SETWINDOWEXT: UInt = 524u

public val META_SETWINDOWORG: UInt = 523u

public val META_STRETCHBLT: UInt = 2851u

public val META_STRETCHDIB: UInt = 3907u

public val META_TEXTOUT: UInt = 1313u

public val MFCOMMENT: UInt = 15u

public val MILCORE_TS_QUERYVER_RESULT_FALSE: UInt = 0u

public val MILCORE_TS_QUERYVER_RESULT_TRUE: UInt = 2147483647u

public val MM_ANISOTROPIC: HdcMapMode = 8

public val MM_HIENGLISH: HdcMapMode = 5

public val MM_HIMETRIC: HdcMapMode = 3

public val MM_ISOTROPIC: HdcMapMode = 7

public val MM_LOENGLISH: HdcMapMode = 4

public val MM_LOMETRIC: HdcMapMode = 2

public val MM_MAX_AXES_NAMELEN: UInt = 16u

public val MM_MAX_NUMAXES: UInt = 16u

public val MM_TEXT: HdcMapMode = 1

public val MM_TWIPS: HdcMapMode = 6

public val MONITOR_DEFAULTTONEAREST: MonitorFromFlags = 2u

public val MONITOR_DEFAULTTONULL: MonitorFromFlags = 0u

public val MONITOR_DEFAULTTOPRIMARY: MonitorFromFlags = 1u

public val MONO_FONT: UInt = 8u

public val MOUSETRAILS: UInt = 39u

public val MWT_IDENTITY: ModifyWorldTransformMode = 1u

public val MWT_LEFTMULTIPLY: ModifyWorldTransformMode = 2u

public val MWT_RIGHTMULTIPLY: ModifyWorldTransformMode = 3u

public val NEWFRAME: UInt = 1u

public val NEWTRANSPARENT: UInt = 3u

public val NEXTBAND: UInt = 3u

public val NOMIRRORBITMAP: RopCode = 2147483648u

public val NONANTIALIASED_QUALITY: FontQuality = 3u.toUByte()

public val NOTSRCCOPY: RopCode = 3342344u

public val NOTSRCERASE: RopCode = 1114278u

public val NTM_BOLD: Int = 32

public val NTM_DSIG: UInt = 2097152u

public val NTM_ITALIC: Int = 1

public val NTM_MULTIPLEMASTER: UInt = 524288u

public val NTM_NONNEGATIVE_AC: UInt = 65536u

public val NTM_PS_OPENTYPE: UInt = 131072u

public val NTM_REGULAR: Int = 64

public val NTM_TT_OPENTYPE: UInt = 262144u

public val NTM_TYPE1: UInt = 1048576u

public val NULLREGION: GdiRegionType = 1

public val NULL_BRUSH: GetStockObjectFlags = 5

public val NULL_PEN: GetStockObjectFlags = 8

public val NUMBRUSHES: GetDeviceCapsIndex = 16u

public val NUMCOLORS: GetDeviceCapsIndex = 24u

public val NUMFONTS: GetDeviceCapsIndex = 22u

public val NUMMARKERS: GetDeviceCapsIndex = 20u

public val NUMPENS: GetDeviceCapsIndex = 18u

public val NUMRESERVED: GetDeviceCapsIndex = 106u

public val OBJ_BITMAP: ObjType = 7

public val OBJ_BRUSH: ObjType = 2

public val OBJ_COLORSPACE: ObjType = 14

public val OBJ_DC: ObjType = 3

public val OBJ_ENHMETADC: ObjType = 12

public val OBJ_ENHMETAFILE: ObjType = 13

public val OBJ_EXTPEN: ObjType = 11

public val OBJ_FONT: ObjType = 6

public val OBJ_MEMDC: ObjType = 10

public val OBJ_METADC: ObjType = 4

public val OBJ_METAFILE: ObjType = 9

public val OBJ_PAL: ObjType = 5

public val OBJ_PEN: ObjType = 1

public val OBJ_REGION: ObjType = 8

public val OEM_CHARSET: FontCharset = 255u.toUByte()

public val OEM_FIXED_FONT: GetStockObjectFlags = 10

public val OPAQUE: BackgroundMode = 2u

public val OPENCHANNEL: UInt = 4110u

public val OUT_CHARACTER_PRECIS: FontOutputPrecision = 2u.toUByte()

public val OUT_DEFAULT_PRECIS: FontOutputPrecision = 0u.toUByte()

public val OUT_DEVICE_PRECIS: FontOutputPrecision = 5u.toUByte()

public val OUT_OUTLINE_PRECIS: FontOutputPrecision = 8u.toUByte()

public val OUT_PS_ONLY_PRECIS: FontOutputPrecision = 10u.toUByte()

public val OUT_RASTER_PRECIS: FontOutputPrecision = 6u.toUByte()

public val OUT_SCREEN_OUTLINE_PRECIS: FontOutputPrecision = 9u.toUByte()

public val OUT_STRING_PRECIS: FontOutputPrecision = 1u.toUByte()

public val OUT_STROKE_PRECIS: FontOutputPrecision = 3u.toUByte()

public val OUT_TT_ONLY_PRECIS: FontOutputPrecision = 7u.toUByte()

public val OUT_TT_PRECIS: FontOutputPrecision = 4u.toUByte()

public val PANOSE_COUNT: UInt = 10u

public val PAN_ANY: UInt = 0u

public val PAN_ARMSTYLE_INDEX: UInt = 6u

public val PAN_ARM_ANY: PanArmStyle = 0u.toUByte()

public val PAN_ARM_NO_FIT: PanArmStyle = 1u.toUByte()

public val PAN_BENT_ARMS_DOUBLE_SERIF: PanArmStyle = 11u.toUByte()

public val PAN_BENT_ARMS_HORZ: PanArmStyle = 7u.toUByte()

public val PAN_BENT_ARMS_SINGLE_SERIF: PanArmStyle = 10u.toUByte()

public val PAN_BENT_ARMS_VERT: PanArmStyle = 9u.toUByte()

public val PAN_BENT_ARMS_WEDGE: PanArmStyle = 8u.toUByte()

public val PAN_CONTRAST_ANY: PanContrast = 0u.toUByte()

public val PAN_CONTRAST_HIGH: PanContrast = 8u.toUByte()

public val PAN_CONTRAST_INDEX: PanContrast = 4u.toUByte()

public val PAN_CONTRAST_LOW: PanContrast = 4u.toUByte()

public val PAN_CONTRAST_MEDIUM: PanContrast = 6u.toUByte()

public val PAN_CONTRAST_MEDIUM_HIGH: PanContrast = 7u.toUByte()

public val PAN_CONTRAST_MEDIUM_LOW: PanContrast = 5u.toUByte()

public val PAN_CONTRAST_NONE: PanContrast = 2u.toUByte()

public val PAN_CONTRAST_NO_FIT: PanContrast = 1u.toUByte()

public val PAN_CONTRAST_VERY_HIGH: PanContrast = 9u.toUByte()

public val PAN_CONTRAST_VERY_LOW: PanContrast = 3u.toUByte()

public val PAN_CULTURE_LATIN: UInt = 0u

public val PAN_FAMILYTYPE_INDEX: UInt = 0u

public val PAN_FAMILY_ANY: PanFamilyType = 0u.toUByte()

public val PAN_FAMILY_DECORATIVE: PanFamilyType = 4u.toUByte()

public val PAN_FAMILY_NO_FIT: PanFamilyType = 1u.toUByte()

public val PAN_FAMILY_PICTORIAL: PanFamilyType = 5u.toUByte()

public val PAN_FAMILY_SCRIPT: PanFamilyType = 3u.toUByte()

public val PAN_FAMILY_TEXT_DISPLAY: PanFamilyType = 2u.toUByte()

public val PAN_LETTERFORM_INDEX: UInt = 7u

public val PAN_LETT_FORM_ANY: PanLettForm = 0u.toUByte()

public val PAN_LETT_FORM_NO_FIT: PanLettForm = 1u.toUByte()

public val PAN_LETT_NORMAL_BOXED: PanLettForm = 4u.toUByte()

public val PAN_LETT_NORMAL_CONTACT: PanLettForm = 2u.toUByte()

public val PAN_LETT_NORMAL_FLATTENED: PanLettForm = 5u.toUByte()

public val PAN_LETT_NORMAL_OFF_CENTER: PanLettForm = 7u.toUByte()

public val PAN_LETT_NORMAL_ROUNDED: PanLettForm = 6u.toUByte()

public val PAN_LETT_NORMAL_SQUARE: PanLettForm = 8u.toUByte()

public val PAN_LETT_NORMAL_WEIGHTED: PanLettForm = 3u.toUByte()

public val PAN_LETT_OBLIQUE_BOXED: PanLettForm = 11u.toUByte()

public val PAN_LETT_OBLIQUE_CONTACT: PanLettForm = 9u.toUByte()

public val PAN_LETT_OBLIQUE_FLATTENED: PanLettForm = 12u.toUByte()

public val PAN_LETT_OBLIQUE_OFF_CENTER: PanLettForm = 14u.toUByte()

public val PAN_LETT_OBLIQUE_ROUNDED: PanLettForm = 13u.toUByte()

public val PAN_LETT_OBLIQUE_SQUARE: PanLettForm = 15u.toUByte()

public val PAN_LETT_OBLIQUE_WEIGHTED: PanLettForm = 10u.toUByte()

public val PAN_MIDLINE_ANY: PanMidline = 0u.toUByte()

public val PAN_MIDLINE_CONSTANT_POINTED: PanMidline = 9u.toUByte()

public val PAN_MIDLINE_CONSTANT_SERIFED: PanMidline = 10u.toUByte()

public val PAN_MIDLINE_CONSTANT_TRIMMED: PanMidline = 8u.toUByte()

public val PAN_MIDLINE_HIGH_POINTED: PanMidline = 6u.toUByte()

public val PAN_MIDLINE_HIGH_SERIFED: PanMidline = 7u.toUByte()

public val PAN_MIDLINE_HIGH_TRIMMED: PanMidline = 5u.toUByte()

public val PAN_MIDLINE_INDEX: PanMidline = 8u.toUByte()

public val PAN_MIDLINE_LOW_POINTED: PanMidline = 12u.toUByte()

public val PAN_MIDLINE_LOW_SERIFED: PanMidline = 13u.toUByte()

public val PAN_MIDLINE_LOW_TRIMMED: PanMidline = 11u.toUByte()

public val PAN_MIDLINE_NO_FIT: PanMidline = 1u.toUByte()

public val PAN_MIDLINE_STANDARD_POINTED: PanMidline = 3u.toUByte()

public val PAN_MIDLINE_STANDARD_SERIFED: PanMidline = 4u.toUByte()

public val PAN_MIDLINE_STANDARD_TRIMMED: PanMidline = 2u.toUByte()

public val PAN_NO_FIT: UInt = 1u

public val PAN_PROPORTION_INDEX: UInt = 3u

public val PAN_PROP_ANY: PanProportion = 0u.toUByte()

public val PAN_PROP_CONDENSED: PanProportion = 6u.toUByte()

public val PAN_PROP_EVEN_WIDTH: PanProportion = 4u.toUByte()

public val PAN_PROP_EXPANDED: PanProportion = 5u.toUByte()

public val PAN_PROP_MODERN: PanProportion = 3u.toUByte()

public val PAN_PROP_MONOSPACED: PanProportion = 9u.toUByte()

public val PAN_PROP_NO_FIT: PanProportion = 1u.toUByte()

public val PAN_PROP_OLD_STYLE: PanProportion = 2u.toUByte()

public val PAN_PROP_VERY_CONDENSED: PanProportion = 8u.toUByte()

public val PAN_PROP_VERY_EXPANDED: PanProportion = 7u.toUByte()

public val PAN_SERIFSTYLE_INDEX: UInt = 1u

public val PAN_SERIF_ANY: PanSerifStyle = 0u.toUByte()

public val PAN_SERIF_BONE: PanSerifStyle = 8u.toUByte()

public val PAN_SERIF_COVE: PanSerifStyle = 2u.toUByte()

public val PAN_SERIF_EXAGGERATED: PanSerifStyle = 9u.toUByte()

public val PAN_SERIF_FLARED: PanSerifStyle = 14u.toUByte()

public val PAN_SERIF_NORMAL_SANS: PanSerifStyle = 11u.toUByte()

public val PAN_SERIF_NO_FIT: PanSerifStyle = 1u.toUByte()

public val PAN_SERIF_OBTUSE_COVE: PanSerifStyle = 3u.toUByte()

public val PAN_SERIF_OBTUSE_SANS: PanSerifStyle = 12u.toUByte()

public val PAN_SERIF_OBTUSE_SQUARE_COVE: PanSerifStyle = 5u.toUByte()

public val PAN_SERIF_PERP_SANS: PanSerifStyle = 13u.toUByte()

public val PAN_SERIF_ROUNDED: PanSerifStyle = 15u.toUByte()

public val PAN_SERIF_SQUARE: PanSerifStyle = 6u.toUByte()

public val PAN_SERIF_SQUARE_COVE: PanSerifStyle = 4u.toUByte()

public val PAN_SERIF_THIN: PanSerifStyle = 7u.toUByte()

public val PAN_SERIF_TRIANGLE: PanSerifStyle = 10u.toUByte()

public val PAN_STRAIGHT_ARMS_DOUBLE_SERIF: PanArmStyle = 6u.toUByte()

public val PAN_STRAIGHT_ARMS_HORZ: PanArmStyle = 2u.toUByte()

public val PAN_STRAIGHT_ARMS_SINGLE_SERIF: PanArmStyle = 5u.toUByte()

public val PAN_STRAIGHT_ARMS_VERT: PanArmStyle = 4u.toUByte()

public val PAN_STRAIGHT_ARMS_WEDGE: PanArmStyle = 3u.toUByte()

public val PAN_STROKEVARIATION_INDEX: UInt = 5u

public val PAN_STROKE_ANY: PanStrokeVariation = 0u.toUByte()

public val PAN_STROKE_GRADUAL_DIAG: PanStrokeVariation = 2u.toUByte()

public val PAN_STROKE_GRADUAL_HORZ: PanStrokeVariation = 5u.toUByte()

public val PAN_STROKE_GRADUAL_TRAN: PanStrokeVariation = 3u.toUByte()

public val PAN_STROKE_GRADUAL_VERT: PanStrokeVariation = 4u.toUByte()

public val PAN_STROKE_INSTANT_VERT: PanStrokeVariation = 8u.toUByte()

public val PAN_STROKE_NO_FIT: PanStrokeVariation = 1u.toUByte()

public val PAN_STROKE_RAPID_HORZ: PanStrokeVariation = 7u.toUByte()

public val PAN_STROKE_RAPID_VERT: PanStrokeVariation = 6u.toUByte()

public val PAN_WEIGHT_ANY: PanWeight = 0u.toUByte()

public val PAN_WEIGHT_BLACK: PanWeight = 10u.toUByte()

public val PAN_WEIGHT_BOLD: PanWeight = 8u.toUByte()

public val PAN_WEIGHT_BOOK: PanWeight = 5u.toUByte()

public val PAN_WEIGHT_DEMI: PanWeight = 7u.toUByte()

public val PAN_WEIGHT_HEAVY: PanWeight = 9u.toUByte()

public val PAN_WEIGHT_INDEX: PanWeight = 2u.toUByte()

public val PAN_WEIGHT_LIGHT: PanWeight = 3u.toUByte()

public val PAN_WEIGHT_MEDIUM: PanWeight = 6u.toUByte()

public val PAN_WEIGHT_NORD: PanWeight = 11u.toUByte()

public val PAN_WEIGHT_NO_FIT: PanWeight = 1u.toUByte()

public val PAN_WEIGHT_THIN: PanWeight = 4u.toUByte()

public val PAN_WEIGHT_VERY_LIGHT: PanWeight = 2u.toUByte()

public val PAN_XHEIGHT_ANY: PanXheight = 0u.toUByte()

public val PAN_XHEIGHT_CONSTANT_LARGE: PanXheight = 4u.toUByte()

public val PAN_XHEIGHT_CONSTANT_SMALL: PanXheight = 2u.toUByte()

public val PAN_XHEIGHT_CONSTANT_STD: PanXheight = 3u.toUByte()

public val PAN_XHEIGHT_DUCKING_LARGE: PanXheight = 7u.toUByte()

public val PAN_XHEIGHT_DUCKING_SMALL: PanXheight = 5u.toUByte()

public val PAN_XHEIGHT_DUCKING_STD: PanXheight = 6u.toUByte()

public val PAN_XHEIGHT_INDEX: PanXheight = 9u.toUByte()

public val PAN_XHEIGHT_NO_FIT: PanXheight = 1u.toUByte()

public val PASSTHROUGH: UInt = 19u

public val PATCOPY: RopCode = 15728673u

public val PATINVERT: RopCode = 5898313u

public val PATPAINT: RopCode = 16452105u

public val PC_EXPLICIT: UInt = 2u

public val PC_INTERIORS: UInt = 128u

public val PC_NOCOLLAPSE: UInt = 4u

public val PC_NONE: UInt = 0u

public val PC_PATHS: UInt = 512u

public val PC_POLYGON: UInt = 1u

public val PC_POLYPOLYGON: UInt = 256u

public val PC_RECTANGLE: UInt = 2u

public val PC_RESERVED: UInt = 1u

public val PC_SCANLINE: UInt = 8u

public val PC_STYLED: UInt = 32u

public val PC_TRAPEZOID: UInt = 4u

public val PC_WIDE: UInt = 16u

public val PC_WIDESTYLED: UInt = 64u

public val PC_WINDPOLYGON: UInt = 4u

public val PDEVICESIZE: GetDeviceCapsIndex = 26u

public val PHYSICALHEIGHT: GetDeviceCapsIndex = 111u

public val PHYSICALOFFSETX: GetDeviceCapsIndex = 112u

public val PHYSICALOFFSETY: GetDeviceCapsIndex = 113u

public val PHYSICALWIDTH: GetDeviceCapsIndex = 110u

public val PLANES: GetDeviceCapsIndex = 14u

public val POLYFILL_LAST: UInt = 2u

public val POLYGONALCAPS: GetDeviceCapsIndex = 32u

public val POSTSCRIPT_DATA: UInt = 37u

public val POSTSCRIPT_IDENTIFY: UInt = 4117u

public val POSTSCRIPT_IGNORE: UInt = 38u

public val POSTSCRIPT_INJECTION: UInt = 4118u

public val POSTSCRIPT_PASSTHROUGH: UInt = 4115u

public val PRINTRATEUNIT_CPS: UInt = 2u

public val PRINTRATEUNIT_IPM: UInt = 4u

public val PRINTRATEUNIT_LPM: UInt = 3u

public val PRINTRATEUNIT_PPM: UInt = 1u

public val PROOF_QUALITY: FontQuality = 2u.toUByte()

public val PR_JOBSTATUS: UInt = 0u

public val PSIDENT_GDICENTRIC: UInt = 0u

public val PSIDENT_PSCENTRIC: UInt = 1u

public val PSINJECT_DLFONT: UInt = 3722304989u

public val PSPROTOCOL_ASCII: UInt = 0u

public val PSPROTOCOL_BCP: UInt = 1u

public val PSPROTOCOL_BINARY: UInt = 3u

public val PSPROTOCOL_TBCP: UInt = 2u

public val PS_ALTERNATE: PenStyle = 8

public val PS_COSMETIC: PenStyle = 0

public val PS_DASH: PenStyle = 1

public val PS_DASHDOT: PenStyle = 3

public val PS_DASHDOTDOT: PenStyle = 4

public val PS_DOT: PenStyle = 2

public val PS_ENDCAP_FLAT: PenStyle = 512

public val PS_ENDCAP_MASK: PenStyle = 3840

public val PS_ENDCAP_ROUND: PenStyle = 0

public val PS_ENDCAP_SQUARE: PenStyle = 256

public val PS_GEOMETRIC: PenStyle = 65536

public val PS_INSIDEFRAME: PenStyle = 6

public val PS_JOIN_BEVEL: PenStyle = 4096

public val PS_JOIN_MASK: PenStyle = 61440

public val PS_JOIN_MITER: PenStyle = 8192

public val PS_JOIN_ROUND: PenStyle = 0

public val PS_NULL: PenStyle = 5

public val PS_SOLID: PenStyle = 0

public val PS_STYLE_MASK: PenStyle = 15

public val PS_TYPE_MASK: PenStyle = 983040

public val PS_USERSTYLE: PenStyle = 7

public val PT_BEZIERTO: UInt = 4u

public val PT_CLOSEFIGURE: UInt = 1u

public val PT_LINETO: UInt = 2u

public val PT_MOVETO: UInt = 6u

public val QDI_DIBTOSCREEN: UInt = 4u

public val QDI_GETDIBITS: UInt = 2u

public val QDI_SETDIBITS: UInt = 1u

public val QDI_STRETCHDIB: UInt = 8u

public val QUERYDIBSUPPORT: UInt = 3073u

public val QUERYESCSUPPORT: UInt = 8u

public val QUERYROPSUPPORT: UInt = 40u

public val R2_BLACK: R2Mode = 1

public val R2_COPYPEN: R2Mode = 13

public val R2_LAST: R2Mode = 16

public val R2_MASKNOTPEN: R2Mode = 3

public val R2_MASKPEN: R2Mode = 9

public val R2_MASKPENNOT: R2Mode = 5

public val R2_MERGENOTPEN: R2Mode = 12

public val R2_MERGEPEN: R2Mode = 15

public val R2_MERGEPENNOT: R2Mode = 14

public val R2_NOP: R2Mode = 11

public val R2_NOT: R2Mode = 6

public val R2_NOTCOPYPEN: R2Mode = 4

public val R2_NOTMASKPEN: R2Mode = 8

public val R2_NOTMERGEPEN: R2Mode = 2

public val R2_NOTXORPEN: R2Mode = 10

public val R2_WHITE: R2Mode = 16

public val R2_XORPEN: R2Mode = 7

public val RASTERCAPS: GetDeviceCapsIndex = 38u

public val RASTER_FONTTYPE: UInt = 1u

public val RC_BANDING: UInt = 2u

public val RC_BIGFONT: UInt = 1024u

public val RC_BITBLT: UInt = 1u

public val RC_BITMAP64: UInt = 8u

public val RC_DEVBITS: UInt = 32768u

public val RC_DIBTODEV: UInt = 512u

public val RC_DI_BITMAP: UInt = 128u

public val RC_FLOODFILL: UInt = 4096u

public val RC_GDI20_OUTPUT: UInt = 16u

public val RC_GDI20_STATE: UInt = 32u

public val RC_OP_DX_OUTPUT: UInt = 16384u

public val RC_PALETTE: UInt = 256u

public val RC_SAVEBITMAP: UInt = 64u

public val RC_SCALING: UInt = 4u

public val RC_STRETCHBLT: UInt = 2048u

public val RC_STRETCHDIB: UInt = 8192u

public val RDH_RECTANGLES: UInt = 1u

public val RDW_ALLCHILDREN: RedrawWindowFlags = 128u

public val RDW_ERASE: RedrawWindowFlags = 4u

public val RDW_ERASENOW: RedrawWindowFlags = 512u

public val RDW_FRAME: RedrawWindowFlags = 1024u

public val RDW_INTERNALPAINT: RedrawWindowFlags = 2u

public val RDW_INVALIDATE: RedrawWindowFlags = 1u

public val RDW_NOCHILDREN: RedrawWindowFlags = 64u

public val RDW_NOERASE: RedrawWindowFlags = 32u

public val RDW_NOFRAME: RedrawWindowFlags = 2048u

public val RDW_NOINTERNALPAINT: RedrawWindowFlags = 16u

public val RDW_UPDATENOW: RedrawWindowFlags = 256u

public val RDW_VALIDATE: RedrawWindowFlags = 8u

public val RELATIVE: UInt = 2u

public val RESTORE_CTM: UInt = 4100u

public val RGN_AND: RgnCombineMode = 1

public val RGN_COPY: RgnCombineMode = 5

public val RGN_DIFF: RgnCombineMode = 4

public val RGN_ERROR: GdiRegionType = 0

public val RGN_MAX: RgnCombineMode = 5

public val RGN_MIN: RgnCombineMode = 1

public val RGN_OR: RgnCombineMode = 2

public val RGN_XOR: RgnCombineMode = 3

public val RUSSIAN_CHARSET: FontCharset = 204u.toUByte()

public val SAVE_CTM: UInt = 4101u

public val SB_CONST_ALPHA: UInt = 1u

public val SB_GRAD_RECT: UInt = 16u

public val SB_GRAD_TRI: UInt = 32u
