package io.github.kotlinmania.windowssys.windows.win32.graphics.gdi

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR

public typealias ARC_DIRECTION = Int

public typealias BACKGROUND_MODE = UInt

public typealias BI_COMPRESSION = UInt

public typealias BRUSH_STYLE = UInt

public typealias CDS_TYPE = UInt

public fun interface CFP_ALLOCPROCFn {
    public operator fun invoke(param0: ULong): Long
}

public typealias CFP_ALLOCPROC = CFP_ALLOCPROCFn?

public fun interface CFP_FREEPROCFn {
    public operator fun invoke(param0: Long)
}

public typealias CFP_FREEPROC = CFP_FREEPROCFn?

public fun interface CFP_REALLOCPROCFn {
    public operator fun invoke(param0: Long, param1: ULong): Long
}

public typealias CFP_REALLOCPROC = CFP_REALLOCPROCFn?

public typealias CREATE_FONT_PACKAGE_SUBSET_ENCODING = Short

public typealias CREATE_FONT_PACKAGE_SUBSET_PLATFORM = Short

public typealias CREATE_POLYGON_RGN_MODE = Int

public typealias DC_LAYOUT = UInt

public typealias DEVMODE_COLLATE = Short

public typealias DEVMODE_COLOR = Short

public typealias DEVMODE_DISPLAY_FIXED_OUTPUT = UInt

public typealias DEVMODE_DISPLAY_ORIENTATION = UInt

public typealias DEVMODE_DUPLEX = Short

public typealias DEVMODE_FIELD_FLAGS = UInt

public typealias DEVMODE_TRUETYPE_OPTION = Short

public typealias DFCS_STATE = UInt

public typealias DFC_TYPE = UInt

public typealias DIB_USAGE = UInt

public typealias DISPLAYCONFIG_COLOR_ENCODING = Int

public typealias DISPLAY_DEVICE_STATE_FLAGS = UInt

public typealias DISP_CHANGE = Int

public typealias DRAWEDGE_FLAGS = UInt

public fun interface DRAWSTATEPROCFn {
    public operator fun invoke(hdc: HDC, ldata: Foundation.LPARAM, wdata: Foundation.WPARAM, cx: Int, cy: Int): BOOL
}

public typealias DRAWSTATEPROC = DRAWSTATEPROCFn?

public typealias DRAWSTATE_FLAGS = UInt

public typealias DRAW_CAPTION_FLAGS = UInt

public typealias DRAW_EDGE_FLAGS = UInt

public typealias DRAW_TEXT_FORMAT = UInt

public typealias EMBEDDED_FONT_PRIV_STATUS = UInt

public typealias EMBED_FONT_CHARSET = UInt

public typealias ENHANCED_METAFILE_RECORD_TYPE = UInt

public fun interface ENHMFENUMPROCFn {
    public operator fun invoke(hdc: HDC, lpht: Long, lpmr: Long, nhandles: Int, data: Foundation.LPARAM): Int
}

public typealias ENHMFENUMPROC = ENHMFENUMPROCFn?

public typealias ENUM_DISPLAY_SETTINGS_FLAGS = UInt

public typealias ENUM_DISPLAY_SETTINGS_MODE = UInt

public typealias ETO_OPTIONS = UInt

public typealias EXT_FLOOD_FILL_TYPE = UInt

public fun interface FONTENUMPROCAFn {
    public operator fun invoke(param0: Long, param1: Long, param2: UInt, param3: Foundation.LPARAM): Int
}

public typealias FONTENUMPROCA = FONTENUMPROCAFn?

public fun interface FONTENUMPROCWFn {
    public operator fun invoke(param0: Long, param1: Long, param2: UInt, param3: Foundation.LPARAM): Int
}

public typealias FONTENUMPROCW = FONTENUMPROCWFn?

public typealias FONT_CHARSET = UByte

public typealias FONT_CLIP_PRECISION = UByte

public typealias FONT_FAMILY = UByte

public typealias FONT_LICENSE_PRIVS = UInt

public typealias FONT_OUTPUT_PRECISION = UByte

public typealias FONT_PITCH = UByte

public typealias FONT_QUALITY = UByte

public typealias FONT_RESOURCE_CHARACTERISTICS = UInt

public typealias FONT_WEIGHT = UInt

public typealias GDI_REGION_TYPE = Int

public typealias GET_CHARACTER_PLACEMENT_FLAGS = UInt

public typealias GET_DCX_FLAGS = UInt

public typealias GET_DEVICE_CAPS_INDEX = UInt

public typealias GET_GLYPH_OUTLINE_FORMAT = UInt

public typealias GET_STOCK_OBJECT_FLAGS = Int

public fun interface GOBJENUMPROCFn {
    public operator fun invoke(param0: Long, param1: Foundation.LPARAM): Int
}

public typealias GOBJENUMPROC = GOBJENUMPROCFn?

public typealias GRADIENT_FILL = UInt

public typealias GRAPHICS_MODE = Int

public fun interface GRAYSTRINGPROCFn {
    public operator fun invoke(param0: HDC, param1: Foundation.LPARAM, param2: Int): BOOL
}

public typealias GRAYSTRINGPROC = GRAYSTRINGPROCFn?

public typealias HATCH_BRUSH_STYLE = Int

public typealias HBITMAP = Long

public typealias HBRUSH = Long

public typealias HDC = Long

public typealias HDC_MAP_MODE = Int

public typealias HENHMETAFILE = Long

public typealias HFONT = Long

public typealias HGDIOBJ = Long

public typealias HMETAFILE = Long

public typealias HMONITOR = Long

public typealias HPALETTE = Long

public typealias HPEN = Long

public typealias HRGN = Long

public fun interface LINEDDAPROCFn {
    public operator fun invoke(param0: Int, param1: Int, param2: Foundation.LPARAM)
}

public typealias LINEDDAPROC = LINEDDAPROCFn?

public fun interface LPFNDEVCAPSFn {
    public operator fun invoke(param0: PCSTR, param1: PCSTR, param2: UInt, param3: PCSTR, param4: Long): UInt
}

public typealias LPFNDEVCAPS = LPFNDEVCAPSFn?

public fun interface LPFNDEVMODEFn {
    public operator fun invoke(param0: Foundation.HWND, param1: Foundation.HMODULE, param2: Long, param3: PCSTR, param4: PCSTR, param5: Long, param6: PCSTR, param7: UInt): UInt
}

public typealias LPFNDEVMODE = LPFNDEVMODEFn?

public fun interface MFENUMPROCFn {
    public operator fun invoke(hdc: HDC, lpht: Long, lpmr: Long, nobj: Int, param4: Foundation.LPARAM): Int
}

public typealias MFENUMPROC = MFENUMPROCFn?

public typealias MODIFY_WORLD_TRANSFORM_MODE = UInt

public fun interface MONITORENUMPROCFn {
    public operator fun invoke(param0: HMONITOR, param1: HDC, param2: Long, param3: Foundation.LPARAM): BOOL
}

public typealias MONITORENUMPROC = MONITORENUMPROCFn?

public typealias MONITOR_FROM_FLAGS = UInt

public typealias OBJ_TYPE = Int

public typealias PAN_ARM_STYLE = UByte

public typealias PAN_CONTRAST = UByte

public typealias PAN_FAMILY_TYPE = UByte

public typealias PAN_LETT_FORM = UByte

public typealias PAN_MIDLINE = UByte

public typealias PAN_PROPORTION = UByte

public typealias PAN_SERIF_STYLE = UByte

public typealias PAN_STROKE_VARIATION = UByte

public typealias PAN_WEIGHT = UByte

public typealias PAN_XHEIGHT = UByte

public typealias PEN_STYLE = Int

public typealias R2_MODE = Int

public fun interface READEMBEDPROCFn {
    public operator fun invoke(param0: Long, param1: Long, param2: UInt): UInt
}

public typealias READEMBEDPROC = READEMBEDPROCFn?

public typealias REDRAW_WINDOW_FLAGS = UInt

public typealias RGN_COMBINE_MODE = Int

public typealias ROP_CODE = UInt

public typealias SET_BOUNDS_RECT_FLAGS = UInt

public typealias STRETCH_BLT_MODE = Int

public typealias SYSTEM_PALETTE_USE = UInt

public typealias SYS_COLOR_INDEX = Int

public typealias TEXT_ALIGN_OPTIONS = UInt

public typealias TMPF_FLAGS = UByte

public typealias TTEMBED_FLAGS = UInt

public typealias TTLOAD_EMBEDDED_FONT_STATUS = UInt

public fun interface WRITEEMBEDPROCFn {
    public operator fun invoke(param0: Long, param1: Long, param2: UInt): UInt
}

public typealias WRITEEMBEDPROC = WRITEEMBEDPROCFn?
