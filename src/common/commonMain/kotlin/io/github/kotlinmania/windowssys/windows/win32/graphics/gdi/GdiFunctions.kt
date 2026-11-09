package io.github.kotlinmania.windowssys.windows.win32.graphics.gdi

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.COLORREF
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HGLOBAL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.foundation.LPARAM
import io.github.kotlinmania.windowssys.windows.win32.foundation.POINT
import io.github.kotlinmania.windowssys.windows.win32.foundation.WPARAM

public expect fun AbortPath(hdc: HDC): BOOL

public expect fun AddFontMemResourceEx(pfileview: Long, cjsize: UInt, pvresrved: Long, pnumfonts: Long): HANDLE

public expect fun AddFontResourceA(param0: PCSTR): Int

public expect fun AddFontResourceExA(name: PCSTR, fl: FONT_RESOURCE_CHARACTERISTICS, res: Long): Int

public expect fun AddFontResourceExW(name: PCWSTR, fl: FONT_RESOURCE_CHARACTERISTICS, res: Long): Int

public expect fun AddFontResourceW(param0: PCWSTR): Int

public expect fun AlphaBlend(hdcdest: HDC, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: HDC, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, ftn: BLENDFUNCTION): BOOL

public expect fun AngleArc(hdc: HDC, x: Int, y: Int, r: UInt, startangle: Float, sweepangle: Float): BOOL

public expect fun AnimatePalette(hpal: HPALETTE, istartindex: UInt, centries: UInt, ppe: Long): BOOL

public expect fun Arc(hdc: HDC, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): BOOL

public expect fun ArcTo(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): BOOL

public expect fun BeginPaint(hwnd: HWND, lppaint: Long): HDC

public expect fun BeginPath(hdc: HDC): BOOL

public expect fun BitBlt(hdc: HDC, x: Int, y: Int, cx: Int, cy: Int, hdcsrc: HDC, x1: Int, y1: Int, rop: ROP_CODE): BOOL

public expect fun CancelDC(hdc: HDC): BOOL

public expect fun ChangeDisplaySettingsA(lpdevmode: Long, dwflags: CDS_TYPE): DISP_CHANGE

public expect fun ChangeDisplaySettingsExA(lpszdevicename: PCSTR, lpdevmode: Long, hwnd: HWND, dwflags: CDS_TYPE, lparam: Long): DISP_CHANGE

public expect fun ChangeDisplaySettingsExW(lpszdevicename: PCWSTR, lpdevmode: Long, hwnd: HWND, dwflags: CDS_TYPE, lparam: Long): DISP_CHANGE

public expect fun ChangeDisplaySettingsW(lpdevmode: Long, dwflags: CDS_TYPE): DISP_CHANGE

public expect fun Chord(hdc: HDC, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): BOOL

public expect fun ClientToScreen(hwnd: HWND, lppoint: Long): BOOL

public expect fun CloseEnhMetaFile(hdc: HDC): HENHMETAFILE

public expect fun CloseFigure(hdc: HDC): BOOL

public expect fun CloseMetaFile(hdc: HDC): HMETAFILE

public expect fun CombineRgn(hrgndst: HRGN, hrgnsrc1: HRGN, hrgnsrc2: HRGN, imode: RGN_COMBINE_MODE): GDI_REGION_TYPE

public expect fun CombineTransform(lpxfout: Long, lpxf1: Long, lpxf2: Long): BOOL

public expect fun CopyEnhMetaFileA(henh: HENHMETAFILE, lpfilename: PCSTR): HENHMETAFILE

public expect fun CopyEnhMetaFileW(henh: HENHMETAFILE, lpfilename: PCWSTR): HENHMETAFILE

public expect fun CopyMetaFileA(param0: HMETAFILE, param1: PCSTR): HMETAFILE

public expect fun CopyMetaFileW(param0: HMETAFILE, param1: PCWSTR): HMETAFILE

public expect fun CopyRect(lprcdst: Long, lprcsrc: Long): BOOL

public expect fun CreateBitmap(nwidth: Int, nheight: Int, nplanes: UInt, nbitcount: UInt, lpbits: Long): HBITMAP

public expect fun CreateBitmapIndirect(pbm: Long): HBITMAP

public expect fun CreateBrushIndirect(plbrush: Long): HBRUSH

public expect fun CreateCompatibleBitmap(hdc: HDC, cx: Int, cy: Int): HBITMAP

public expect fun CreateCompatibleDC(hdc: HDC): HDC

public expect fun CreateDCA(pwszdriver: PCSTR, pwszdevice: PCSTR, pszport: PCSTR, pdm: Long): HDC

public expect fun CreateDCW(pwszdriver: PCWSTR, pwszdevice: PCWSTR, pszport: PCWSTR, pdm: Long): HDC

public expect fun CreateDIBPatternBrush(h: HGLOBAL, iusage: DIB_USAGE): HBRUSH

public expect fun CreateDIBPatternBrushPt(lppackeddib: Long, iusage: DIB_USAGE): HBRUSH

public expect fun CreateDIBSection(hdc: HDC, pbmi: Long, usage: DIB_USAGE, ppvbits: Long, hsection: HANDLE, offset: UInt): HBITMAP

public expect fun CreateDIBitmap(hdc: HDC, pbmih: Long, flinit: UInt, pjbits: Long, pbmi: Long, iusage: DIB_USAGE): HBITMAP

public expect fun CreateDiscardableBitmap(hdc: HDC, cx: Int, cy: Int): HBITMAP

public expect fun CreateEllipticRgn(x1: Int, y1: Int, x2: Int, y2: Int): HRGN

public expect fun CreateEllipticRgnIndirect(lprect: Long): HRGN

public expect fun CreateEnhMetaFileA(hdc: HDC, lpfilename: PCSTR, lprc: Long, lpdesc: PCSTR): HDC

public expect fun CreateEnhMetaFileW(hdc: HDC, lpfilename: PCWSTR, lprc: Long, lpdesc: PCWSTR): HDC

public expect fun CreateFontA(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: UInt, bunderline: UInt, bstrikeout: UInt, icharset: UInt, ioutprecision: UInt, iclipprecision: UInt, iquality: UInt, ipitchandfamily: UInt, pszfacename: PCSTR): HFONT

public expect fun CreateFontIndirectA(lplf: Long): HFONT

public expect fun CreateFontIndirectExA(param0: Long): HFONT

public expect fun CreateFontIndirectExW(param0: Long): HFONT

public expect fun CreateFontIndirectW(lplf: Long): HFONT

public expect fun CreateFontPackage(puchsrcbuffer: Long, ulsrcbuffersize: UInt, ppuchfontpackagebuffer: Long, pulfontpackagebuffersize: Long, pulbyteswritten: Long, usflag: UShort, usttcindex: UShort, ussubsetformat: UShort, ussubsetlanguage: UShort, ussubsetplatform: CREATE_FONT_PACKAGE_SUBSET_PLATFORM, ussubsetencoding: CREATE_FONT_PACKAGE_SUBSET_ENCODING, pussubsetkeeplist: Long, ussubsetlistcount: UShort, lpfnallocate: CFP_ALLOCPROC, lpfnreallocate: CFP_REALLOCPROC, lpfnfree: CFP_FREEPROC, lpvreserved: Long): UInt

public expect fun CreateFontW(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: UInt, bunderline: UInt, bstrikeout: UInt, icharset: UInt, ioutprecision: UInt, iclipprecision: UInt, iquality: UInt, ipitchandfamily: UInt, pszfacename: PCWSTR): HFONT

public expect fun CreateHalftonePalette(hdc: HDC): HPALETTE

public expect fun CreateHatchBrush(ihatch: HATCH_BRUSH_STYLE, color: COLORREF): HBRUSH

public expect fun CreateICA(pszdriver: PCSTR, pszdevice: PCSTR, pszport: PCSTR, pdm: Long): HDC

public expect fun CreateICW(pszdriver: PCWSTR, pszdevice: PCWSTR, pszport: PCWSTR, pdm: Long): HDC

public expect fun CreateMetaFileA(pszfile: PCSTR): HDC

public expect fun CreateMetaFileW(pszfile: PCWSTR): HDC

public expect fun CreatePalette(plpal: Long): HPALETTE

public expect fun CreatePatternBrush(hbm: HBITMAP): HBRUSH

public expect fun CreatePen(istyle: PEN_STYLE, cwidth: Int, color: COLORREF): HPEN

public expect fun CreatePenIndirect(plpen: Long): HPEN

public expect fun CreatePolyPolygonRgn(pptl: Long, pc: Long, cpoly: Int, imode: CREATE_POLYGON_RGN_MODE): HRGN

public expect fun CreatePolygonRgn(pptl: Long, cpoint: Int, imode: CREATE_POLYGON_RGN_MODE): HRGN

public expect fun CreateRectRgn(x1: Int, y1: Int, x2: Int, y2: Int): HRGN

public expect fun CreateRectRgnIndirect(lprect: Long): HRGN

public expect fun CreateRoundRectRgn(x1: Int, y1: Int, x2: Int, y2: Int, w: Int, h: Int): HRGN

public expect fun CreateScalableFontResourceA(fdwhidden: UInt, lpszfont: PCSTR, lpszfile: PCSTR, lpszpath: PCSTR): BOOL

public expect fun CreateScalableFontResourceW(fdwhidden: UInt, lpszfont: PCWSTR, lpszfile: PCWSTR, lpszpath: PCWSTR): BOOL

public expect fun CreateSolidBrush(color: COLORREF): HBRUSH

public expect fun DPtoLP(hdc: HDC, lppt: Long, c: Int): BOOL

public expect fun DeleteDC(hdc: HDC): BOOL

public expect fun DeleteEnhMetaFile(hmf: HENHMETAFILE): BOOL

public expect fun DeleteMetaFile(hmf: HMETAFILE): BOOL

public expect fun DeleteObject(ho: HGDIOBJ): BOOL

public expect fun DrawAnimatedRects(hwnd: HWND, idani: Int, lprcfrom: Long, lprcto: Long): BOOL

public expect fun DrawCaption(hwnd: HWND, hdc: HDC, lprect: Long, flags: DRAW_CAPTION_FLAGS): BOOL

public expect fun DrawEdge(hdc: HDC, qrc: Long, edge: DRAWEDGE_FLAGS, grfflags: DRAW_EDGE_FLAGS): BOOL

public expect fun DrawEscape(hdc: HDC, iescape: Int, cjin: Int, lpin: PCSTR): Int

public expect fun DrawFocusRect(hdc: HDC, lprc: Long): BOOL

public expect fun DrawFrameControl(param0: HDC, param1: Long, param2: DFC_TYPE, param3: DFCS_STATE): BOOL

public expect fun DrawStateA(hdc: HDC, hbrfore: HBRUSH, qfncallback: DRAWSTATEPROC, ldata: LPARAM, wdata: WPARAM, x: Int, y: Int, cx: Int, cy: Int, uflags: DRAWSTATE_FLAGS): BOOL

public expect fun DrawStateW(hdc: HDC, hbrfore: HBRUSH, qfncallback: DRAWSTATEPROC, ldata: LPARAM, wdata: WPARAM, x: Int, y: Int, cx: Int, cy: Int, uflags: DRAWSTATE_FLAGS): BOOL

public expect fun DrawTextA(hdc: HDC, lpchtext: PCSTR, cchtext: Int, lprc: Long, format: DRAW_TEXT_FORMAT): Int

public expect fun DrawTextExA(hdc: HDC, lpchtext: PSTR, cchtext: Int, lprc: Long, format: DRAW_TEXT_FORMAT, lpdtp: Long): Int

public expect fun DrawTextExW(hdc: HDC, lpchtext: PWSTR, cchtext: Int, lprc: Long, format: DRAW_TEXT_FORMAT, lpdtp: Long): Int

public expect fun DrawTextW(hdc: HDC, lpchtext: PCWSTR, cchtext: Int, lprc: Long, format: DRAW_TEXT_FORMAT): Int

public expect fun Ellipse(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int): BOOL

public expect fun EndPaint(hwnd: HWND, lppaint: Long): BOOL

public expect fun EndPath(hdc: HDC): BOOL

public expect fun EnumDisplayDevicesA(lpdevice: PCSTR, idevnum: UInt, lpdisplaydevice: Long, dwflags: UInt): BOOL

public expect fun EnumDisplayDevicesW(lpdevice: PCWSTR, idevnum: UInt, lpdisplaydevice: Long, dwflags: UInt): BOOL

public expect fun EnumDisplayMonitors(hdc: HDC, lprcclip: Long, lpfnenum: MONITORENUMPROC, dwdata: LPARAM): BOOL

public expect fun EnumDisplaySettingsA(lpszdevicename: PCSTR, imodenum: ENUM_DISPLAY_SETTINGS_MODE, lpdevmode: Long): BOOL

public expect fun EnumDisplaySettingsExA(lpszdevicename: PCSTR, imodenum: ENUM_DISPLAY_SETTINGS_MODE, lpdevmode: Long, dwflags: ENUM_DISPLAY_SETTINGS_FLAGS): BOOL

public expect fun EnumDisplaySettingsExW(lpszdevicename: PCWSTR, imodenum: ENUM_DISPLAY_SETTINGS_MODE, lpdevmode: Long, dwflags: ENUM_DISPLAY_SETTINGS_FLAGS): BOOL

public expect fun EnumDisplaySettingsW(lpszdevicename: PCWSTR, imodenum: ENUM_DISPLAY_SETTINGS_MODE, lpdevmode: Long): BOOL

public expect fun EnumEnhMetaFile(hdc: HDC, hmf: HENHMETAFILE, proc: ENHMFENUMPROC, param3: Long, lprect: Long): BOOL

public expect fun EnumFontFamiliesA(hdc: HDC, lplogfont: PCSTR, lpproc: FONTENUMPROCA, lparam: LPARAM): Int

public expect fun EnumFontFamiliesExA(hdc: HDC, lplogfont: Long, lpproc: FONTENUMPROCA, lparam: LPARAM, dwflags: UInt): Int

public expect fun EnumFontFamiliesExW(hdc: HDC, lplogfont: Long, lpproc: FONTENUMPROCW, lparam: LPARAM, dwflags: UInt): Int

public expect fun EnumFontFamiliesW(hdc: HDC, lplogfont: PCWSTR, lpproc: FONTENUMPROCW, lparam: LPARAM): Int

public expect fun EnumFontsA(hdc: HDC, lplogfont: PCSTR, lpproc: FONTENUMPROCA, lparam: LPARAM): Int

public expect fun EnumFontsW(hdc: HDC, lplogfont: PCWSTR, lpproc: FONTENUMPROCW, lparam: LPARAM): Int

public expect fun EnumMetaFile(hdc: HDC, hmf: HMETAFILE, proc: MFENUMPROC, param3: LPARAM): BOOL

public expect fun EnumObjects(hdc: HDC, ntype: OBJ_TYPE, lpfunc: GOBJENUMPROC, lparam: LPARAM): Int

public expect fun EqualRect(lprc1: Long, lprc2: Long): BOOL

public expect fun EqualRgn(hrgn1: HRGN, hrgn2: HRGN): BOOL

public expect fun ExcludeClipRect(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int): GDI_REGION_TYPE

public expect fun ExcludeUpdateRgn(hdc: HDC, hwnd: HWND): Int

public expect fun ExtCreatePen(ipenstyle: UInt, cwidth: UInt, plbrush: Long, cstyle: UInt, pstyle: Long): HPEN

public expect fun ExtCreateRegion(lpx: Long, ncount: UInt, lpdata: Long): HRGN

public expect fun ExtFloodFill(hdc: HDC, x: Int, y: Int, color: COLORREF, type: EXT_FLOOD_FILL_TYPE): BOOL

public expect fun ExtSelectClipRgn(hdc: HDC, hrgn: HRGN, mode: RGN_COMBINE_MODE): GDI_REGION_TYPE

public expect fun ExtTextOutA(hdc: HDC, x: Int, y: Int, options: ETO_OPTIONS, lprect: Long, lpstring: PCSTR, c: UInt, lpdx: Long): BOOL

public expect fun ExtTextOutW(hdc: HDC, x: Int, y: Int, options: ETO_OPTIONS, lprect: Long, lpstring: PCWSTR, c: UInt, lpdx: Long): BOOL

public expect fun FillPath(hdc: HDC): BOOL

public expect fun FillRect(hdc: HDC, lprc: Long, hbr: HBRUSH): Int

public expect fun FillRgn(hdc: HDC, hrgn: HRGN, hbr: HBRUSH): BOOL

public expect fun FixBrushOrgEx(hdc: HDC, x: Int, y: Int, ptl: Long): BOOL

public expect fun FlattenPath(hdc: HDC): BOOL

public expect fun FloodFill(hdc: HDC, x: Int, y: Int, color: COLORREF): BOOL

public expect fun FrameRect(hdc: HDC, lprc: Long, hbr: HBRUSH): Int

public expect fun FrameRgn(hdc: HDC, hrgn: HRGN, hbr: HBRUSH, w: Int, h: Int): BOOL

public expect fun GdiAlphaBlend(hdcdest: HDC, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: HDC, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, ftn: BLENDFUNCTION): BOOL

public expect fun GdiComment(hdc: HDC, nsize: UInt, lpdata: Long): BOOL

public expect fun GdiFlush(): BOOL

public expect fun GdiGetBatchLimit(): UInt

public expect fun GdiGradientFill(hdc: HDC, pvertex: Long, nvertex: UInt, pmesh: Long, ncount: UInt, ulmode: GRADIENT_FILL): BOOL

public expect fun GdiSetBatchLimit(dw: UInt): UInt

public expect fun GdiTransparentBlt(hdcdest: HDC, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: HDC, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: UInt): BOOL

public expect fun GetArcDirection(hdc: HDC): Int

public expect fun GetAspectRatioFilterEx(hdc: HDC, lpsize: Long): BOOL

public expect fun GetBitmapBits(hbit: HBITMAP, cb: Int, lpvbits: Long): Int

public expect fun GetBitmapDimensionEx(hbit: HBITMAP, lpsize: Long): BOOL

public expect fun GetBkColor(hdc: HDC): COLORREF

public expect fun GetBkMode(hdc: HDC): Int

public expect fun GetBoundsRect(hdc: HDC, lprect: Long, flags: UInt): UInt

public expect fun GetBrushOrgEx(hdc: HDC, lppt: Long): BOOL

public expect fun GetCharABCWidthsA(hdc: HDC, wfirst: UInt, wlast: UInt, lpabc: Long): BOOL

public expect fun GetCharABCWidthsFloatA(hdc: HDC, ifirst: UInt, ilast: UInt, lpabc: Long): BOOL

public expect fun GetCharABCWidthsFloatW(hdc: HDC, ifirst: UInt, ilast: UInt, lpabc: Long): BOOL

public expect fun GetCharABCWidthsI(hdc: HDC, gifirst: UInt, cgi: UInt, pgi: Long, pabc: Long): BOOL

public expect fun GetCharABCWidthsW(hdc: HDC, wfirst: UInt, wlast: UInt, lpabc: Long): BOOL

public expect fun GetCharWidth32A(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL

public expect fun GetCharWidth32W(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL

public expect fun GetCharWidthA(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL

public expect fun GetCharWidthFloatA(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL

public expect fun GetCharWidthFloatW(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL

public expect fun GetCharWidthI(hdc: HDC, gifirst: UInt, cgi: UInt, pgi: Long, piwidths: Long): BOOL

public expect fun GetCharWidthW(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL

public expect fun GetCharacterPlacementA(hdc: HDC, lpstring: PCSTR, ncount: Int, nmexextent: Int, lpresults: Long, dwflags: GET_CHARACTER_PLACEMENT_FLAGS): UInt

public expect fun GetCharacterPlacementW(hdc: HDC, lpstring: PCWSTR, ncount: Int, nmexextent: Int, lpresults: Long, dwflags: GET_CHARACTER_PLACEMENT_FLAGS): UInt

public expect fun GetClipBox(hdc: HDC, lprect: Long): GDI_REGION_TYPE

public expect fun GetClipRgn(hdc: HDC, hrgn: HRGN): Int

public expect fun GetColorAdjustment(hdc: HDC, lpca: Long): BOOL

public expect fun GetCurrentObject(hdc: HDC, type: UInt): HGDIOBJ

public expect fun GetCurrentPositionEx(hdc: HDC, lppt: Long): BOOL

public expect fun GetDC(hwnd: HWND): HDC

public expect fun GetDCBrushColor(hdc: HDC): COLORREF

public expect fun GetDCEx(hwnd: HWND, hrgnclip: HRGN, flags: GET_DCX_FLAGS): HDC

public expect fun GetDCOrgEx(hdc: HDC, lppt: Long): BOOL

public expect fun GetDCPenColor(hdc: HDC): COLORREF

public expect fun GetDIBColorTable(hdc: HDC, istart: UInt, centries: UInt, prgbq: Long): UInt

public expect fun GetDIBits(hdc: HDC, hbm: HBITMAP, start: UInt, clines: UInt, lpvbits: Long, lpbmi: Long, usage: DIB_USAGE): Int

public expect fun GetDeviceCaps(hdc: HDC, index: Int): Int

public expect fun GetEnhMetaFileA(lpname: PCSTR): HENHMETAFILE

public expect fun GetEnhMetaFileBits(hemf: HENHMETAFILE, nsize: UInt, lpdata: Long): UInt

public expect fun GetEnhMetaFileDescriptionA(hemf: HENHMETAFILE, cchbuffer: UInt, lpdescription: PSTR): UInt

public expect fun GetEnhMetaFileDescriptionW(hemf: HENHMETAFILE, cchbuffer: UInt, lpdescription: PWSTR): UInt

public expect fun GetEnhMetaFileHeader(hemf: HENHMETAFILE, nsize: UInt, lpenhmetaheader: Long): UInt

public expect fun GetEnhMetaFilePaletteEntries(hemf: HENHMETAFILE, nnumentries: UInt, lppaletteentries: Long): UInt

public expect fun GetEnhMetaFileW(lpname: PCWSTR): HENHMETAFILE

public expect fun GetFontData(hdc: HDC, dwtable: UInt, dwoffset: UInt, pvbuffer: Long, cjbuffer: UInt): UInt

public expect fun GetFontLanguageInfo(hdc: HDC): UInt

public expect fun GetFontUnicodeRanges(hdc: HDC, lpgs: Long): UInt

public expect fun GetGlyphIndicesA(hdc: HDC, lpstr: PCSTR, c: Int, pgi: Long, fl: UInt): UInt

public expect fun GetGlyphIndicesW(hdc: HDC, lpstr: PCWSTR, c: Int, pgi: Long, fl: UInt): UInt

public expect fun GetGlyphOutlineA(hdc: HDC, uchar: UInt, fuformat: GET_GLYPH_OUTLINE_FORMAT, lpgm: Long, cjbuffer: UInt, pvbuffer: Long, lpmat2: Long): UInt

public expect fun GetGlyphOutlineW(hdc: HDC, uchar: UInt, fuformat: GET_GLYPH_OUTLINE_FORMAT, lpgm: Long, cjbuffer: UInt, pvbuffer: Long, lpmat2: Long): UInt

public expect fun GetGraphicsMode(hdc: HDC): Int

public expect fun GetKerningPairsA(hdc: HDC, npairs: UInt, lpkernpair: Long): UInt

public expect fun GetKerningPairsW(hdc: HDC, npairs: UInt, lpkernpair: Long): UInt

public expect fun GetLayout(hdc: HDC): UInt

public expect fun GetMapMode(hdc: HDC): HDC_MAP_MODE

public expect fun GetMetaFileA(lpname: PCSTR): HMETAFILE

public expect fun GetMetaFileBitsEx(hmf: HMETAFILE, cbbuffer: UInt, lpdata: Long): UInt

public expect fun GetMetaFileW(lpname: PCWSTR): HMETAFILE

public expect fun GetMetaRgn(hdc: HDC, hrgn: HRGN): Int

public expect fun GetMiterLimit(hdc: HDC, plimit: Long): BOOL

public expect fun GetMonitorInfoA(hmonitor: HMONITOR, lpmi: Long): BOOL

public expect fun GetMonitorInfoW(hmonitor: HMONITOR, lpmi: Long): BOOL

public expect fun GetNearestColor(hdc: HDC, color: COLORREF): COLORREF

public expect fun GetNearestPaletteIndex(h: HPALETTE, color: COLORREF): UInt

public expect fun GetObjectA(h: HGDIOBJ, c: Int, pv: Long): Int

public expect fun GetObjectType(h: HGDIOBJ): UInt

public expect fun GetObjectW(h: HGDIOBJ, c: Int, pv: Long): Int

public expect fun GetOutlineTextMetricsA(hdc: HDC, cjcopy: UInt, potm: Long): UInt

public expect fun GetOutlineTextMetricsW(hdc: HDC, cjcopy: UInt, potm: Long): UInt

public expect fun GetPaletteEntries(hpal: HPALETTE, istart: UInt, centries: UInt, ppalentries: Long): UInt

public expect fun GetPath(hdc: HDC, apt: Long, aj: Long, cpt: Int): Int

public expect fun GetPixel(hdc: HDC, x: Int, y: Int): COLORREF

public expect fun GetPolyFillMode(hdc: HDC): Int

public expect fun GetROP2(hdc: HDC): R2_MODE

public expect fun GetRandomRgn(hdc: HDC, hrgn: HRGN, i: Int): Int

public expect fun GetRasterizerCaps(lpraststat: Long, cjbytes: UInt): BOOL

public expect fun GetRegionData(hrgn: HRGN, ncount: UInt, lprgndata: Long): UInt

public expect fun GetRgnBox(hrgn: HRGN, lprc: Long): GDI_REGION_TYPE

public expect fun GetStockObject(i: GET_STOCK_OBJECT_FLAGS): HGDIOBJ

public expect fun GetStretchBltMode(hdc: HDC): Int

public expect fun GetSysColor(nindex: SYS_COLOR_INDEX): UInt

public expect fun GetSysColorBrush(nindex: SYS_COLOR_INDEX): HBRUSH

public expect fun GetSystemPaletteEntries(hdc: HDC, istart: UInt, centries: UInt, ppalentries: Long): UInt

public expect fun GetSystemPaletteUse(hdc: HDC): UInt

public expect fun GetTabbedTextExtentA(hdc: HDC, lpstring: PCSTR, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long): UInt

public expect fun GetTabbedTextExtentW(hdc: HDC, lpstring: PCWSTR, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long): UInt

public expect fun GetTextAlign(hdc: HDC): TEXT_ALIGN_OPTIONS

public expect fun GetTextCharacterExtra(hdc: HDC): Int

public expect fun GetTextColor(hdc: HDC): COLORREF

public expect fun GetTextExtentExPointA(hdc: HDC, lpszstring: PCSTR, cchstring: Int, nmaxextent: Int, lpnfit: Long, lpndx: Long, lpsize: Long): BOOL

public expect fun GetTextExtentExPointI(hdc: HDC, lpwszstring: Long, cwchstring: Int, nmaxextent: Int, lpnfit: Long, lpndx: Long, lpsize: Long): BOOL

public expect fun GetTextExtentExPointW(hdc: HDC, lpszstring: PCWSTR, cchstring: Int, nmaxextent: Int, lpnfit: Long, lpndx: Long, lpsize: Long): BOOL

public expect fun GetTextExtentPoint32A(hdc: HDC, lpstring: PCSTR, c: Int, psizl: Long): BOOL

public expect fun GetTextExtentPoint32W(hdc: HDC, lpstring: PCWSTR, c: Int, psizl: Long): BOOL

public expect fun GetTextExtentPointA(hdc: HDC, lpstring: PCSTR, c: Int, lpsz: Long): BOOL

public expect fun GetTextExtentPointI(hdc: HDC, pgiin: Long, cgi: Int, psize: Long): BOOL

public expect fun GetTextExtentPointW(hdc: HDC, lpstring: PCWSTR, c: Int, lpsz: Long): BOOL

public expect fun GetTextFaceA(hdc: HDC, c: Int, lpname: PSTR): Int

public expect fun GetTextFaceW(hdc: HDC, c: Int, lpname: PWSTR): Int

public expect fun GetTextMetricsA(hdc: HDC, lptm: Long): BOOL

public expect fun GetTextMetricsW(hdc: HDC, lptm: Long): BOOL

public expect fun GetUpdateRect(hwnd: HWND, lprect: Long, berase: BOOL): BOOL

public expect fun GetUpdateRgn(hwnd: HWND, hrgn: HRGN, berase: BOOL): GDI_REGION_TYPE

public expect fun GetViewportExtEx(hdc: HDC, lpsize: Long): BOOL

public expect fun GetViewportOrgEx(hdc: HDC, lppoint: Long): BOOL

public expect fun GetWinMetaFileBits(hemf: HENHMETAFILE, cbdata16: UInt, pdata16: Long, imapmode: Int, hdcref: HDC): UInt

public expect fun GetWindowDC(hwnd: HWND): HDC

public expect fun GetWindowExtEx(hdc: HDC, lpsize: Long): BOOL

public expect fun GetWindowOrgEx(hdc: HDC, lppoint: Long): BOOL

public expect fun GetWindowRgn(hwnd: HWND, hrgn: HRGN): GDI_REGION_TYPE

public expect fun GetWindowRgnBox(hwnd: HWND, lprc: Long): GDI_REGION_TYPE

public expect fun GetWorldTransform(hdc: HDC, lpxf: Long): BOOL

public expect fun GradientFill(hdc: HDC, pvertex: Long, nvertex: UInt, pmesh: Long, nmesh: UInt, ulmode: GRADIENT_FILL): BOOL

public expect fun GrayStringA(hdc: HDC, hbrush: HBRUSH, lpoutputfunc: GRAYSTRINGPROC, lpdata: LPARAM, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): BOOL

public expect fun GrayStringW(hdc: HDC, hbrush: HBRUSH, lpoutputfunc: GRAYSTRINGPROC, lpdata: LPARAM, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): BOOL

public expect fun InflateRect(lprc: Long, dx: Int, dy: Int): BOOL

public expect fun IntersectClipRect(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int): GDI_REGION_TYPE

public expect fun IntersectRect(lprcdst: Long, lprcsrc1: Long, lprcsrc2: Long): BOOL

public expect fun InvalidateRect(hwnd: HWND, lprect: Long, berase: BOOL): BOOL

public expect fun InvalidateRgn(hwnd: HWND, hrgn: HRGN, berase: BOOL): BOOL

public expect fun InvertRect(hdc: HDC, lprc: Long): BOOL

public expect fun InvertRgn(hdc: HDC, hrgn: HRGN): BOOL

public expect fun IsRectEmpty(lprc: Long): BOOL

public expect fun LPtoDP(hdc: HDC, lppt: Long, c: Int): BOOL

public expect fun LineDDA(xstart: Int, ystart: Int, xend: Int, yend: Int, lpproc: LINEDDAPROC, data: LPARAM): BOOL

public expect fun LineTo(hdc: HDC, x: Int, y: Int): BOOL

public expect fun LoadBitmapA(hinstance: HINSTANCE, lpbitmapname: PCSTR): HBITMAP

public expect fun LoadBitmapW(hinstance: HINSTANCE, lpbitmapname: PCWSTR): HBITMAP

public expect fun LockWindowUpdate(hwndlock: HWND): BOOL

public expect fun MapWindowPoints(hwndfrom: HWND, hwndto: HWND, lppoints: Long, cpoints: UInt): Int

public expect fun MaskBlt(hdcdest: HDC, xdest: Int, ydest: Int, width: Int, height: Int, hdcsrc: HDC, xsrc: Int, ysrc: Int, hbmmask: HBITMAP, xmask: Int, ymask: Int, rop: UInt): BOOL

public expect fun MergeFontPackage(puchmergefontbuffer: Long, ulmergefontbuffersize: UInt, puchfontpackagebuffer: Long, ulfontpackagebuffersize: UInt, ppuchdestbuffer: Long, puldestbuffersize: Long, pulbyteswritten: Long, usmode: UShort, lpfnallocate: CFP_ALLOCPROC, lpfnreallocate: CFP_REALLOCPROC, lpfnfree: CFP_FREEPROC, lpvreserved: Long): UInt

public expect fun ModifyWorldTransform(hdc: HDC, lpxf: Long, mode: MODIFY_WORLD_TRANSFORM_MODE): BOOL

public expect fun MonitorFromPoint(pt: POINT, dwflags: MONITOR_FROM_FLAGS): HMONITOR

public expect fun MonitorFromRect(lprc: Long, dwflags: MONITOR_FROM_FLAGS): HMONITOR

public expect fun MonitorFromWindow(hwnd: HWND, dwflags: MONITOR_FROM_FLAGS): HMONITOR

public expect fun MoveToEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL

public expect fun OffsetClipRgn(hdc: HDC, x: Int, y: Int): GDI_REGION_TYPE

public expect fun OffsetRect(lprc: Long, dx: Int, dy: Int): BOOL

public expect fun OffsetRgn(hrgn: HRGN, x: Int, y: Int): GDI_REGION_TYPE

public expect fun OffsetViewportOrgEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL

public expect fun OffsetWindowOrgEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL

public expect fun PaintDesktop(hdc: HDC): BOOL

public expect fun PaintRgn(hdc: HDC, hrgn: HRGN): BOOL

public expect fun PatBlt(hdc: HDC, x: Int, y: Int, w: Int, h: Int, rop: ROP_CODE): BOOL

public expect fun PathToRegion(hdc: HDC): HRGN

public expect fun Pie(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): BOOL

public expect fun PlayEnhMetaFile(hdc: HDC, hmf: HENHMETAFILE, lprect: Long): BOOL

public expect fun PlayEnhMetaFileRecord(hdc: HDC, pht: Long, pmr: Long, cht: UInt): BOOL

public expect fun PlayMetaFile(hdc: HDC, hmf: HMETAFILE): BOOL

public expect fun PlayMetaFileRecord(hdc: HDC, lphandletable: Long, lpmr: Long, noobjs: UInt): BOOL

public expect fun PlgBlt(hdcdest: HDC, lppoint: Long, hdcsrc: HDC, xsrc: Int, ysrc: Int, width: Int, height: Int, hbmmask: HBITMAP, xmask: Int, ymask: Int): BOOL

public expect fun PolyBezier(hdc: HDC, apt: Long, cpt: UInt): BOOL

public expect fun PolyBezierTo(hdc: HDC, apt: Long, cpt: UInt): BOOL

public expect fun PolyDraw(hdc: HDC, apt: Long, aj: Long, cpt: Int): BOOL

public expect fun PolyPolygon(hdc: HDC, apt: Long, asz: Long, csz: Int): BOOL

public expect fun PolyPolyline(hdc: HDC, apt: Long, asz: Long, csz: UInt): BOOL

public expect fun PolyTextOutA(hdc: HDC, ppt: Long, nstrings: Int): BOOL

public expect fun PolyTextOutW(hdc: HDC, ppt: Long, nstrings: Int): BOOL

public expect fun Polygon(hdc: HDC, apt: Long, cpt: Int): BOOL

public expect fun Polyline(hdc: HDC, apt: Long, cpt: Int): BOOL

public expect fun PolylineTo(hdc: HDC, apt: Long, cpt: UInt): BOOL

public expect fun PtInRect(lprc: Long, pt: POINT): BOOL

public expect fun PtInRegion(hrgn: HRGN, x: Int, y: Int): BOOL

public expect fun PtVisible(hdc: HDC, x: Int, y: Int): BOOL

public expect fun RealizePalette(hdc: HDC): UInt

public expect fun RectInRegion(hrgn: HRGN, lprect: Long): BOOL

public expect fun RectVisible(hdc: HDC, lprect: Long): BOOL

public expect fun Rectangle(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int): BOOL

public expect fun RedrawWindow(hwnd: HWND, lprcupdate: Long, hrgnupdate: HRGN, flags: REDRAW_WINDOW_FLAGS): BOOL

public expect fun ReleaseDC(hwnd: HWND, hdc: HDC): Int

public expect fun RemoveFontMemResourceEx(h: HANDLE): BOOL

public expect fun RemoveFontResourceA(lpfilename: PCSTR): BOOL

public expect fun RemoveFontResourceExA(name: PCSTR, fl: UInt, pdv: Long): BOOL

public expect fun RemoveFontResourceExW(name: PCWSTR, fl: UInt, pdv: Long): BOOL

public expect fun RemoveFontResourceW(lpfilename: PCWSTR): BOOL

public expect fun ResetDCA(hdc: HDC, lpdm: Long): HDC

public expect fun ResetDCW(hdc: HDC, lpdm: Long): HDC

public expect fun ResizePalette(hpal: HPALETTE, n: UInt): BOOL

public expect fun RestoreDC(hdc: HDC, nsaveddc: Int): BOOL

public expect fun RoundRect(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int, width: Int, height: Int): BOOL

public expect fun SaveDC(hdc: HDC): Int

public expect fun ScaleViewportExtEx(hdc: HDC, xn: Int, dx: Int, yn: Int, yd: Int, lpsz: Long): BOOL

public expect fun ScaleWindowExtEx(hdc: HDC, xn: Int, xd: Int, yn: Int, yd: Int, lpsz: Long): BOOL

public expect fun ScreenToClient(hwnd: HWND, lppoint: Long): BOOL

public expect fun SelectClipPath(hdc: HDC, mode: RGN_COMBINE_MODE): BOOL

public expect fun SelectClipRgn(hdc: HDC, hrgn: HRGN): GDI_REGION_TYPE

public expect fun SelectObject(hdc: HDC, h: HGDIOBJ): HGDIOBJ

public expect fun SelectPalette(hdc: HDC, hpal: HPALETTE, bforcebkgd: BOOL): HPALETTE

public expect fun SetArcDirection(hdc: HDC, dir: ARC_DIRECTION): Int

public expect fun SetBitmapBits(hbm: HBITMAP, cb: UInt, pvbits: Long): Int

public expect fun SetBitmapDimensionEx(hbm: HBITMAP, w: Int, h: Int, lpsz: Long): BOOL

public expect fun SetBkColor(hdc: HDC, color: COLORREF): COLORREF

public expect fun SetBkMode(hdc: HDC, mode: Int): Int

public expect fun SetBoundsRect(hdc: HDC, lprect: Long, flags: SET_BOUNDS_RECT_FLAGS): UInt

public expect fun SetBrushOrgEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL

public expect fun SetColorAdjustment(hdc: HDC, lpca: Long): BOOL

public expect fun SetDCBrushColor(hdc: HDC, color: COLORREF): COLORREF

public expect fun SetDCPenColor(hdc: HDC, color: COLORREF): COLORREF

public expect fun SetDIBColorTable(hdc: HDC, istart: UInt, centries: UInt, prgbq: Long): UInt

public expect fun SetDIBits(hdc: HDC, hbm: HBITMAP, start: UInt, clines: UInt, lpbits: Long, lpbmi: Long, coloruse: DIB_USAGE): Int

public expect fun SetDIBitsToDevice(hdc: HDC, xdest: Int, ydest: Int, w: UInt, h: UInt, xsrc: Int, ysrc: Int, startscan: UInt, clines: UInt, lpvbits: Long, lpbmi: Long, coloruse: DIB_USAGE): Int

public expect fun SetEnhMetaFileBits(nsize: UInt, pb: Long): HENHMETAFILE

public expect fun SetGraphicsMode(hdc: HDC, imode: GRAPHICS_MODE): Int

public expect fun SetLayout(hdc: HDC, l: DC_LAYOUT): UInt

public expect fun SetMapMode(hdc: HDC, imode: HDC_MAP_MODE): Int

public expect fun SetMapperFlags(hdc: HDC, flags: UInt): UInt

public expect fun SetMetaFileBitsEx(cbbuffer: UInt, lpdata: Long): HMETAFILE

public expect fun SetMetaRgn(hdc: HDC): GDI_REGION_TYPE

public expect fun SetMiterLimit(hdc: HDC, limit: Float, old: Long): BOOL

public expect fun SetPaletteEntries(hpal: HPALETTE, istart: UInt, centries: UInt, ppalentries: Long): UInt

public expect fun SetPixel(hdc: HDC, x: Int, y: Int, color: COLORREF): COLORREF

public expect fun SetPixelV(hdc: HDC, x: Int, y: Int, color: COLORREF): BOOL

public expect fun SetPolyFillMode(hdc: HDC, mode: CREATE_POLYGON_RGN_MODE): Int

public expect fun SetROP2(hdc: HDC, rop2: R2_MODE): Int

public expect fun SetRect(lprc: Long, xleft: Int, ytop: Int, xright: Int, ybottom: Int): BOOL

public expect fun SetRectEmpty(lprc: Long): BOOL

public expect fun SetRectRgn(hrgn: HRGN, left: Int, top: Int, right: Int, bottom: Int): BOOL

public expect fun SetStretchBltMode(hdc: HDC, mode: STRETCH_BLT_MODE): Int

public expect fun SetSysColors(celements: Int, lpaelements: Long, lpargbvalues: Long): BOOL

public expect fun SetSystemPaletteUse(hdc: HDC, use: SYSTEM_PALETTE_USE): UInt

public expect fun SetTextAlign(hdc: HDC, align: TEXT_ALIGN_OPTIONS): UInt

public expect fun SetTextCharacterExtra(hdc: HDC, extra: Int): Int

public expect fun SetTextColor(hdc: HDC, color: COLORREF): COLORREF

public expect fun SetTextJustification(hdc: HDC, extra: Int, count: Int): BOOL

public expect fun SetViewportExtEx(hdc: HDC, x: Int, y: Int, lpsz: Long): BOOL

public expect fun SetViewportOrgEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL

public expect fun SetWindowExtEx(hdc: HDC, x: Int, y: Int, lpsz: Long): BOOL

public expect fun SetWindowOrgEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL

public expect fun SetWindowRgn(hwnd: HWND, hrgn: HRGN, bredraw: BOOL): Int

public expect fun SetWorldTransform(hdc: HDC, lpxf: Long): BOOL

public expect fun StretchBlt(hdcdest: HDC, xdest: Int, ydest: Int, wdest: Int, hdest: Int, hdcsrc: HDC, xsrc: Int, ysrc: Int, wsrc: Int, hsrc: Int, rop: ROP_CODE): BOOL

public expect fun StretchDIBits(hdc: HDC, xdest: Int, ydest: Int, destwidth: Int, destheight: Int, xsrc: Int, ysrc: Int, srcwidth: Int, srcheight: Int, lpbits: Long, lpbmi: Long, iusage: DIB_USAGE, rop: ROP_CODE): Int

public expect fun StrokeAndFillPath(hdc: HDC): BOOL

public expect fun StrokePath(hdc: HDC): BOOL

public expect fun SubtractRect(lprcdst: Long, lprcsrc1: Long, lprcsrc2: Long): BOOL

public expect fun TTCharToUnicode(hdc: HDC, puccharcodes: Long, ulcharcodesize: UInt, pusshortcodes: Long, ulshortcodesize: UInt, ulflags: UInt): Int

public expect fun TTDeleteEmbeddedFont(hfontreference: HANDLE, ulflags: UInt, pulstatus: Long): Int

public expect fun TTEmbedFont(hdc: HDC, ulflags: TTEMBED_FLAGS, ulcharset: EMBED_FONT_CHARSET, pulprivstatus: Long, pulstatus: Long, lpfnwritetostream: WRITEEMBEDPROC, lpvwritestream: Long, puscharcodeset: Long, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: Long): Int

public expect fun TTEmbedFontEx(hdc: HDC, ulflags: TTEMBED_FLAGS, ulcharset: EMBED_FONT_CHARSET, pulprivstatus: Long, pulstatus: Long, lpfnwritetostream: WRITEEMBEDPROC, lpvwritestream: Long, pulcharcodeset: Long, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: Long): Int

public expect fun TTEmbedFontFromFileA(hdc: HDC, szfontfilename: PCSTR, usttcindex: UShort, ulflags: TTEMBED_FLAGS, ulcharset: EMBED_FONT_CHARSET, pulprivstatus: Long, pulstatus: Long, lpfnwritetostream: WRITEEMBEDPROC, lpvwritestream: Long, puscharcodeset: Long, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: Long): Int

public expect fun TTEnableEmbeddingForFacename(lpszfacename: PCSTR, benable: BOOL): Int

public expect fun TTGetEmbeddedFontInfo(ulflags: TTEMBED_FLAGS, pulprivstatus: Long, ulprivs: FONT_LICENSE_PRIVS, pulstatus: Long, lpfnreadfromstream: READEMBEDPROC, lpvreadstream: Long, pttloadinfo: Long): Int

public expect fun TTGetEmbeddingType(hdc: HDC, pulembedtype: Long): Int

public expect fun TTGetNewFontName(phfontreference: Long, wzwinfamilyname: PWSTR, cchmaxwinname: Int, szmacfamilyname: PSTR, cchmaxmacname: Int): Int

public expect fun TTIsEmbeddingEnabled(hdc: HDC, pbenabled: Long): Int

public expect fun TTIsEmbeddingEnabledForFacename(lpszfacename: PCSTR, pbenabled: Long): Int

public expect fun TTLoadEmbeddedFont(phfontreference: Long, ulflags: UInt, pulprivstatus: Long, ulprivs: FONT_LICENSE_PRIVS, pulstatus: Long, lpfnreadfromstream: READEMBEDPROC, lpvreadstream: Long, szwinfamilyname: PCWSTR, szmacfamilyname: PCSTR, pttloadinfo: Long): Int

public expect fun TTRunValidationTests(hdc: HDC, ptestparam: Long): Int

public expect fun TTRunValidationTestsEx(hdc: HDC, ptestparam: Long): Int

public expect fun TabbedTextOutA(hdc: HDC, x: Int, y: Int, lpstring: PCSTR, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long, ntaborigin: Int): Int

public expect fun TabbedTextOutW(hdc: HDC, x: Int, y: Int, lpstring: PCWSTR, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long, ntaborigin: Int): Int

public expect fun TextOutA(hdc: HDC, x: Int, y: Int, lpstring: PCSTR, c: Int): BOOL

public expect fun TextOutW(hdc: HDC, x: Int, y: Int, lpstring: PCWSTR, c: Int): BOOL

public expect fun TransparentBlt(hdcdest: HDC, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: HDC, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: UInt): BOOL

public expect fun UnionRect(lprcdst: Long, lprcsrc1: Long, lprcsrc2: Long): BOOL

public expect fun UnrealizeObject(h: HGDIOBJ): BOOL

public expect fun UpdateColors(hdc: HDC): BOOL

public expect fun UpdateWindow(hwnd: HWND): BOOL

public expect fun ValidateRect(hwnd: HWND, lprect: Long): BOOL

public expect fun ValidateRgn(hwnd: HWND, hrgn: HRGN): BOOL

public expect fun WidenPath(hdc: HDC): BOOL

public expect fun WindowFromDC(hdc: HDC): HWND

public expect fun wglSwapMultipleBuffers(param0: UInt, param1: Long): UInt
