@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

public actual fun AbortPath(hdc: HDC): BOOL =
    0

public actual fun AddFontMemResourceEx(pfileview: Long, cjsize: UInt, pvresrved: Long, pnumfonts: Long): HANDLE =
    0L

public actual fun AddFontResourceA(param0: PCSTR): Int =
    0

public actual fun AddFontResourceExA(name: PCSTR, fl: FONT_RESOURCE_CHARACTERISTICS, res: Long): Int =
    0

public actual fun AddFontResourceExW(name: PCWSTR, fl: FONT_RESOURCE_CHARACTERISTICS, res: Long): Int =
    0

public actual fun AddFontResourceW(param0: PCWSTR): Int =
    0

public actual fun AlphaBlend(hdcdest: HDC, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: HDC, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, ftn: BLENDFUNCTION): BOOL =
    0

public actual fun AngleArc(hdc: HDC, x: Int, y: Int, r: UInt, startangle: Float, sweepangle: Float): BOOL =
    0

public actual fun AnimatePalette(hpal: HPALETTE, istartindex: UInt, centries: UInt, ppe: Long): BOOL =
    0

public actual fun Arc(hdc: HDC, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): BOOL =
    0

public actual fun ArcTo(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): BOOL =
    0

public actual fun BeginPaint(hwnd: HWND, lppaint: Long): HDC =
    0L

public actual fun BeginPath(hdc: HDC): BOOL =
    0

public actual fun BitBlt(hdc: HDC, x: Int, y: Int, cx: Int, cy: Int, hdcsrc: HDC, x1: Int, y1: Int, rop: ROP_CODE): BOOL =
    0

public actual fun CancelDC(hdc: HDC): BOOL =
    0

public actual fun ChangeDisplaySettingsA(lpdevmode: Long, dwflags: CDS_TYPE): DISP_CHANGE =
    0

public actual fun ChangeDisplaySettingsExA(lpszdevicename: PCSTR, lpdevmode: Long, hwnd: HWND, dwflags: CDS_TYPE, lparam: Long): DISP_CHANGE =
    0

public actual fun ChangeDisplaySettingsExW(lpszdevicename: PCWSTR, lpdevmode: Long, hwnd: HWND, dwflags: CDS_TYPE, lparam: Long): DISP_CHANGE =
    0

public actual fun ChangeDisplaySettingsW(lpdevmode: Long, dwflags: CDS_TYPE): DISP_CHANGE =
    0

public actual fun Chord(hdc: HDC, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): BOOL =
    0

public actual fun ClientToScreen(hwnd: HWND, lppoint: Long): BOOL =
    0

public actual fun CloseEnhMetaFile(hdc: HDC): HENHMETAFILE =
    0L

public actual fun CloseFigure(hdc: HDC): BOOL =
    0

public actual fun CloseMetaFile(hdc: HDC): HMETAFILE =
    0L

public actual fun CombineRgn(hrgndst: HRGN, hrgnsrc1: HRGN, hrgnsrc2: HRGN, imode: RGN_COMBINE_MODE): GDI_REGION_TYPE =
    0

public actual fun CombineTransform(lpxfout: Long, lpxf1: Long, lpxf2: Long): BOOL =
    0

public actual fun CopyEnhMetaFileA(henh: HENHMETAFILE, lpfilename: PCSTR): HENHMETAFILE =
    0L

public actual fun CopyEnhMetaFileW(henh: HENHMETAFILE, lpfilename: PCWSTR): HENHMETAFILE =
    0L

public actual fun CopyMetaFileA(param0: HMETAFILE, param1: PCSTR): HMETAFILE =
    0L

public actual fun CopyMetaFileW(param0: HMETAFILE, param1: PCWSTR): HMETAFILE =
    0L

public actual fun CopyRect(lprcdst: Long, lprcsrc: Long): BOOL =
    0

public actual fun CreateBitmap(nwidth: Int, nheight: Int, nplanes: UInt, nbitcount: UInt, lpbits: Long): HBITMAP =
    0L

public actual fun CreateBitmapIndirect(pbm: Long): HBITMAP =
    0L

public actual fun CreateBrushIndirect(plbrush: Long): HBRUSH =
    0L

public actual fun CreateCompatibleBitmap(hdc: HDC, cx: Int, cy: Int): HBITMAP =
    0L

public actual fun CreateCompatibleDC(hdc: HDC): HDC =
    0L

public actual fun CreateDCA(pwszdriver: PCSTR, pwszdevice: PCSTR, pszport: PCSTR, pdm: Long): HDC =
    0L

public actual fun CreateDCW(pwszdriver: PCWSTR, pwszdevice: PCWSTR, pszport: PCWSTR, pdm: Long): HDC =
    0L

public actual fun CreateDIBPatternBrush(h: HGLOBAL, iusage: DIB_USAGE): HBRUSH =
    0L

public actual fun CreateDIBPatternBrushPt(lppackeddib: Long, iusage: DIB_USAGE): HBRUSH =
    0L

public actual fun CreateDIBSection(hdc: HDC, pbmi: Long, usage: DIB_USAGE, ppvbits: Long, hsection: HANDLE, offset: UInt): HBITMAP =
    0L

public actual fun CreateDIBitmap(hdc: HDC, pbmih: Long, flinit: UInt, pjbits: Long, pbmi: Long, iusage: DIB_USAGE): HBITMAP =
    0L

public actual fun CreateDiscardableBitmap(hdc: HDC, cx: Int, cy: Int): HBITMAP =
    0L

public actual fun CreateEllipticRgn(x1: Int, y1: Int, x2: Int, y2: Int): HRGN =
    0L

public actual fun CreateEllipticRgnIndirect(lprect: Long): HRGN =
    0L

public actual fun CreateEnhMetaFileA(hdc: HDC, lpfilename: PCSTR, lprc: Long, lpdesc: PCSTR): HDC =
    0L

public actual fun CreateEnhMetaFileW(hdc: HDC, lpfilename: PCWSTR, lprc: Long, lpdesc: PCWSTR): HDC =
    0L

public actual fun CreateFontA(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: UInt, bunderline: UInt, bstrikeout: UInt, icharset: UInt, ioutprecision: UInt, iclipprecision: UInt, iquality: UInt, ipitchandfamily: UInt, pszfacename: PCSTR): HFONT =
    0L

public actual fun CreateFontIndirectA(lplf: Long): HFONT =
    0L

public actual fun CreateFontIndirectExA(param0: Long): HFONT =
    0L

public actual fun CreateFontIndirectExW(param0: Long): HFONT =
    0L

public actual fun CreateFontIndirectW(lplf: Long): HFONT =
    0L

public actual fun CreateFontPackage(puchsrcbuffer: Long, ulsrcbuffersize: UInt, ppuchfontpackagebuffer: Long, pulfontpackagebuffersize: Long, pulbyteswritten: Long, usflag: UShort, usttcindex: UShort, ussubsetformat: UShort, ussubsetlanguage: UShort, ussubsetplatform: CREATE_FONT_PACKAGE_SUBSET_PLATFORM, ussubsetencoding: CREATE_FONT_PACKAGE_SUBSET_ENCODING, pussubsetkeeplist: Long, ussubsetlistcount: UShort, lpfnallocate: CFP_ALLOCPROC, lpfnreallocate: CFP_REALLOCPROC, lpfnfree: CFP_FREEPROC, lpvreserved: Long): UInt =
    0u

public actual fun CreateFontW(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: UInt, bunderline: UInt, bstrikeout: UInt, icharset: UInt, ioutprecision: UInt, iclipprecision: UInt, iquality: UInt, ipitchandfamily: UInt, pszfacename: PCWSTR): HFONT =
    0L

public actual fun CreateHalftonePalette(hdc: HDC): HPALETTE =
    0L

public actual fun CreateHatchBrush(ihatch: HATCH_BRUSH_STYLE, color: COLORREF): HBRUSH =
    0L

public actual fun CreateICA(pszdriver: PCSTR, pszdevice: PCSTR, pszport: PCSTR, pdm: Long): HDC =
    0L

public actual fun CreateICW(pszdriver: PCWSTR, pszdevice: PCWSTR, pszport: PCWSTR, pdm: Long): HDC =
    0L

public actual fun CreateMetaFileA(pszfile: PCSTR): HDC =
    0L

public actual fun CreateMetaFileW(pszfile: PCWSTR): HDC =
    0L

public actual fun CreatePalette(plpal: Long): HPALETTE =
    0L

public actual fun CreatePatternBrush(hbm: HBITMAP): HBRUSH =
    0L

public actual fun CreatePen(istyle: PEN_STYLE, cwidth: Int, color: COLORREF): HPEN =
    0L

public actual fun CreatePenIndirect(plpen: Long): HPEN =
    0L

public actual fun CreatePolyPolygonRgn(pptl: Long, pc: Long, cpoly: Int, imode: CREATE_POLYGON_RGN_MODE): HRGN =
    0L

public actual fun CreatePolygonRgn(pptl: Long, cpoint: Int, imode: CREATE_POLYGON_RGN_MODE): HRGN =
    0L

public actual fun CreateRectRgn(x1: Int, y1: Int, x2: Int, y2: Int): HRGN =
    0L

public actual fun CreateRectRgnIndirect(lprect: Long): HRGN =
    0L

public actual fun CreateRoundRectRgn(x1: Int, y1: Int, x2: Int, y2: Int, w: Int, h: Int): HRGN =
    0L

public actual fun CreateScalableFontResourceA(fdwhidden: UInt, lpszfont: PCSTR, lpszfile: PCSTR, lpszpath: PCSTR): BOOL =
    0

public actual fun CreateScalableFontResourceW(fdwhidden: UInt, lpszfont: PCWSTR, lpszfile: PCWSTR, lpszpath: PCWSTR): BOOL =
    0

public actual fun CreateSolidBrush(color: COLORREF): HBRUSH =
    0L

public actual fun DPtoLP(hdc: HDC, lppt: Long, c: Int): BOOL =
    0

public actual fun DeleteDC(hdc: HDC): BOOL =
    0

public actual fun DeleteEnhMetaFile(hmf: HENHMETAFILE): BOOL =
    0

public actual fun DeleteMetaFile(hmf: HMETAFILE): BOOL =
    0

public actual fun DeleteObject(ho: HGDIOBJ): BOOL =
    0

public actual fun DrawAnimatedRects(hwnd: HWND, idani: Int, lprcfrom: Long, lprcto: Long): BOOL =
    0

public actual fun DrawCaption(hwnd: HWND, hdc: HDC, lprect: Long, flags: DRAW_CAPTION_FLAGS): BOOL =
    0

public actual fun DrawEdge(hdc: HDC, qrc: Long, edge: DRAWEDGE_FLAGS, grfflags: DRAW_EDGE_FLAGS): BOOL =
    0

public actual fun DrawEscape(hdc: HDC, iescape: Int, cjin: Int, lpin: PCSTR): Int =
    0

public actual fun DrawFocusRect(hdc: HDC, lprc: Long): BOOL =
    0

public actual fun DrawFrameControl(param0: HDC, param1: Long, param2: DFC_TYPE, param3: DFCS_STATE): BOOL =
    0

public actual fun DrawStateA(hdc: HDC, hbrfore: HBRUSH, qfncallback: DRAWSTATEPROC, ldata: LPARAM, wdata: WPARAM, x: Int, y: Int, cx: Int, cy: Int, uflags: DRAWSTATE_FLAGS): BOOL =
    0

public actual fun DrawStateW(hdc: HDC, hbrfore: HBRUSH, qfncallback: DRAWSTATEPROC, ldata: LPARAM, wdata: WPARAM, x: Int, y: Int, cx: Int, cy: Int, uflags: DRAWSTATE_FLAGS): BOOL =
    0

public actual fun DrawTextA(hdc: HDC, lpchtext: PCSTR, cchtext: Int, lprc: Long, format: DRAW_TEXT_FORMAT): Int =
    0

public actual fun DrawTextExA(hdc: HDC, lpchtext: PSTR, cchtext: Int, lprc: Long, format: DRAW_TEXT_FORMAT, lpdtp: Long): Int =
    0

public actual fun DrawTextExW(hdc: HDC, lpchtext: PWSTR, cchtext: Int, lprc: Long, format: DRAW_TEXT_FORMAT, lpdtp: Long): Int =
    0

public actual fun DrawTextW(hdc: HDC, lpchtext: PCWSTR, cchtext: Int, lprc: Long, format: DRAW_TEXT_FORMAT): Int =
    0

public actual fun Ellipse(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int): BOOL =
    0

public actual fun EndPaint(hwnd: HWND, lppaint: Long): BOOL =
    0

public actual fun EndPath(hdc: HDC): BOOL =
    0

public actual fun EnumDisplayDevicesA(lpdevice: PCSTR, idevnum: UInt, lpdisplaydevice: Long, dwflags: UInt): BOOL =
    0

public actual fun EnumDisplayDevicesW(lpdevice: PCWSTR, idevnum: UInt, lpdisplaydevice: Long, dwflags: UInt): BOOL =
    0

public actual fun EnumDisplayMonitors(hdc: HDC, lprcclip: Long, lpfnenum: MONITORENUMPROC, dwdata: LPARAM): BOOL =
    0

public actual fun EnumDisplaySettingsA(lpszdevicename: PCSTR, imodenum: ENUM_DISPLAY_SETTINGS_MODE, lpdevmode: Long): BOOL =
    0

public actual fun EnumDisplaySettingsExA(lpszdevicename: PCSTR, imodenum: ENUM_DISPLAY_SETTINGS_MODE, lpdevmode: Long, dwflags: ENUM_DISPLAY_SETTINGS_FLAGS): BOOL =
    0

public actual fun EnumDisplaySettingsExW(lpszdevicename: PCWSTR, imodenum: ENUM_DISPLAY_SETTINGS_MODE, lpdevmode: Long, dwflags: ENUM_DISPLAY_SETTINGS_FLAGS): BOOL =
    0

public actual fun EnumDisplaySettingsW(lpszdevicename: PCWSTR, imodenum: ENUM_DISPLAY_SETTINGS_MODE, lpdevmode: Long): BOOL =
    0

public actual fun EnumEnhMetaFile(hdc: HDC, hmf: HENHMETAFILE, proc: ENHMFENUMPROC, param3: Long, lprect: Long): BOOL =
    0

public actual fun EnumFontFamiliesA(hdc: HDC, lplogfont: PCSTR, lpproc: FONTENUMPROCA, lparam: LPARAM): Int =
    0

public actual fun EnumFontFamiliesExA(hdc: HDC, lplogfont: Long, lpproc: FONTENUMPROCA, lparam: LPARAM, dwflags: UInt): Int =
    0

public actual fun EnumFontFamiliesExW(hdc: HDC, lplogfont: Long, lpproc: FONTENUMPROCW, lparam: LPARAM, dwflags: UInt): Int =
    0

public actual fun EnumFontFamiliesW(hdc: HDC, lplogfont: PCWSTR, lpproc: FONTENUMPROCW, lparam: LPARAM): Int =
    0

public actual fun EnumFontsA(hdc: HDC, lplogfont: PCSTR, lpproc: FONTENUMPROCA, lparam: LPARAM): Int =
    0

public actual fun EnumFontsW(hdc: HDC, lplogfont: PCWSTR, lpproc: FONTENUMPROCW, lparam: LPARAM): Int =
    0

public actual fun EnumMetaFile(hdc: HDC, hmf: HMETAFILE, proc: MFENUMPROC, param3: LPARAM): BOOL =
    0

public actual fun EnumObjects(hdc: HDC, ntype: OBJ_TYPE, lpfunc: GOBJENUMPROC, lparam: LPARAM): Int =
    0

public actual fun EqualRect(lprc1: Long, lprc2: Long): BOOL =
    0

public actual fun EqualRgn(hrgn1: HRGN, hrgn2: HRGN): BOOL =
    0

public actual fun ExcludeClipRect(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int): GDI_REGION_TYPE =
    0

public actual fun ExcludeUpdateRgn(hdc: HDC, hwnd: HWND): Int =
    0

public actual fun ExtCreatePen(ipenstyle: UInt, cwidth: UInt, plbrush: Long, cstyle: UInt, pstyle: Long): HPEN =
    0L

public actual fun ExtCreateRegion(lpx: Long, ncount: UInt, lpdata: Long): HRGN =
    0L

public actual fun ExtFloodFill(hdc: HDC, x: Int, y: Int, color: COLORREF, type: EXT_FLOOD_FILL_TYPE): BOOL =
    0

public actual fun ExtSelectClipRgn(hdc: HDC, hrgn: HRGN, mode: RGN_COMBINE_MODE): GDI_REGION_TYPE =
    0

public actual fun ExtTextOutA(hdc: HDC, x: Int, y: Int, options: ETO_OPTIONS, lprect: Long, lpstring: PCSTR, c: UInt, lpdx: Long): BOOL =
    0

public actual fun ExtTextOutW(hdc: HDC, x: Int, y: Int, options: ETO_OPTIONS, lprect: Long, lpstring: PCWSTR, c: UInt, lpdx: Long): BOOL =
    0

public actual fun FillPath(hdc: HDC): BOOL =
    0

public actual fun FillRect(hdc: HDC, lprc: Long, hbr: HBRUSH): Int =
    0

public actual fun FillRgn(hdc: HDC, hrgn: HRGN, hbr: HBRUSH): BOOL =
    0

public actual fun FixBrushOrgEx(hdc: HDC, x: Int, y: Int, ptl: Long): BOOL =
    0

public actual fun FlattenPath(hdc: HDC): BOOL =
    0

public actual fun FloodFill(hdc: HDC, x: Int, y: Int, color: COLORREF): BOOL =
    0

public actual fun FrameRect(hdc: HDC, lprc: Long, hbr: HBRUSH): Int =
    0

public actual fun FrameRgn(hdc: HDC, hrgn: HRGN, hbr: HBRUSH, w: Int, h: Int): BOOL =
    0

public actual fun GdiAlphaBlend(hdcdest: HDC, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: HDC, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, ftn: BLENDFUNCTION): BOOL =
    0

public actual fun GdiComment(hdc: HDC, nsize: UInt, lpdata: Long): BOOL =
    0

public actual fun GdiFlush(): BOOL =
    0

public actual fun GdiGetBatchLimit(): UInt =
    0u

public actual fun GdiGradientFill(hdc: HDC, pvertex: Long, nvertex: UInt, pmesh: Long, ncount: UInt, ulmode: GRADIENT_FILL): BOOL =
    0

public actual fun GdiSetBatchLimit(dw: UInt): UInt =
    0u

public actual fun GdiTransparentBlt(hdcdest: HDC, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: HDC, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: UInt): BOOL =
    0

public actual fun GetArcDirection(hdc: HDC): Int =
    0

public actual fun GetAspectRatioFilterEx(hdc: HDC, lpsize: Long): BOOL =
    0

public actual fun GetBitmapBits(hbit: HBITMAP, cb: Int, lpvbits: Long): Int =
    0

public actual fun GetBitmapDimensionEx(hbit: HBITMAP, lpsize: Long): BOOL =
    0

public actual fun GetBkColor(hdc: HDC): COLORREF =
    0u

public actual fun GetBkMode(hdc: HDC): Int =
    0

public actual fun GetBoundsRect(hdc: HDC, lprect: Long, flags: UInt): UInt =
    0u

public actual fun GetBrushOrgEx(hdc: HDC, lppt: Long): BOOL =
    0

public actual fun GetCharABCWidthsA(hdc: HDC, wfirst: UInt, wlast: UInt, lpabc: Long): BOOL =
    0

public actual fun GetCharABCWidthsFloatA(hdc: HDC, ifirst: UInt, ilast: UInt, lpabc: Long): BOOL =
    0

public actual fun GetCharABCWidthsFloatW(hdc: HDC, ifirst: UInt, ilast: UInt, lpabc: Long): BOOL =
    0

public actual fun GetCharABCWidthsI(hdc: HDC, gifirst: UInt, cgi: UInt, pgi: Long, pabc: Long): BOOL =
    0

public actual fun GetCharABCWidthsW(hdc: HDC, wfirst: UInt, wlast: UInt, lpabc: Long): BOOL =
    0

public actual fun GetCharWidth32A(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL =
    0

public actual fun GetCharWidth32W(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL =
    0

public actual fun GetCharWidthA(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL =
    0

public actual fun GetCharWidthFloatA(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL =
    0

public actual fun GetCharWidthFloatW(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL =
    0

public actual fun GetCharWidthI(hdc: HDC, gifirst: UInt, cgi: UInt, pgi: Long, piwidths: Long): BOOL =
    0

public actual fun GetCharWidthW(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL =
    0

public actual fun GetCharacterPlacementA(hdc: HDC, lpstring: PCSTR, ncount: Int, nmexextent: Int, lpresults: Long, dwflags: GET_CHARACTER_PLACEMENT_FLAGS): UInt =
    0u

public actual fun GetCharacterPlacementW(hdc: HDC, lpstring: PCWSTR, ncount: Int, nmexextent: Int, lpresults: Long, dwflags: GET_CHARACTER_PLACEMENT_FLAGS): UInt =
    0u

public actual fun GetClipBox(hdc: HDC, lprect: Long): GDI_REGION_TYPE =
    0

public actual fun GetClipRgn(hdc: HDC, hrgn: HRGN): Int =
    0

public actual fun GetColorAdjustment(hdc: HDC, lpca: Long): BOOL =
    0

public actual fun GetCurrentObject(hdc: HDC, type: UInt): HGDIOBJ =
    0L

public actual fun GetCurrentPositionEx(hdc: HDC, lppt: Long): BOOL =
    0

public actual fun GetDC(hwnd: HWND): HDC =
    0L

public actual fun GetDCBrushColor(hdc: HDC): COLORREF =
    0u

public actual fun GetDCEx(hwnd: HWND, hrgnclip: HRGN, flags: GET_DCX_FLAGS): HDC =
    0L

public actual fun GetDCOrgEx(hdc: HDC, lppt: Long): BOOL =
    0

public actual fun GetDCPenColor(hdc: HDC): COLORREF =
    0u

public actual fun GetDIBColorTable(hdc: HDC, istart: UInt, centries: UInt, prgbq: Long): UInt =
    0u

public actual fun GetDIBits(hdc: HDC, hbm: HBITMAP, start: UInt, clines: UInt, lpvbits: Long, lpbmi: Long, usage: DIB_USAGE): Int =
    0

public actual fun GetDeviceCaps(hdc: HDC, index: Int): Int =
    0

public actual fun GetEnhMetaFileA(lpname: PCSTR): HENHMETAFILE =
    0L

public actual fun GetEnhMetaFileBits(hemf: HENHMETAFILE, nsize: UInt, lpdata: Long): UInt =
    0u

public actual fun GetEnhMetaFileDescriptionA(hemf: HENHMETAFILE, cchbuffer: UInt, lpdescription: PSTR): UInt =
    0u

public actual fun GetEnhMetaFileDescriptionW(hemf: HENHMETAFILE, cchbuffer: UInt, lpdescription: PWSTR): UInt =
    0u

public actual fun GetEnhMetaFileHeader(hemf: HENHMETAFILE, nsize: UInt, lpenhmetaheader: Long): UInt =
    0u

public actual fun GetEnhMetaFilePaletteEntries(hemf: HENHMETAFILE, nnumentries: UInt, lppaletteentries: Long): UInt =
    0u

public actual fun GetEnhMetaFileW(lpname: PCWSTR): HENHMETAFILE =
    0L

public actual fun GetFontData(hdc: HDC, dwtable: UInt, dwoffset: UInt, pvbuffer: Long, cjbuffer: UInt): UInt =
    0u

public actual fun GetFontLanguageInfo(hdc: HDC): UInt =
    0u

public actual fun GetFontUnicodeRanges(hdc: HDC, lpgs: Long): UInt =
    0u

public actual fun GetGlyphIndicesA(hdc: HDC, lpstr: PCSTR, c: Int, pgi: Long, fl: UInt): UInt =
    0u

public actual fun GetGlyphIndicesW(hdc: HDC, lpstr: PCWSTR, c: Int, pgi: Long, fl: UInt): UInt =
    0u

public actual fun GetGlyphOutlineA(hdc: HDC, uchar: UInt, fuformat: GET_GLYPH_OUTLINE_FORMAT, lpgm: Long, cjbuffer: UInt, pvbuffer: Long, lpmat2: Long): UInt =
    0u

public actual fun GetGlyphOutlineW(hdc: HDC, uchar: UInt, fuformat: GET_GLYPH_OUTLINE_FORMAT, lpgm: Long, cjbuffer: UInt, pvbuffer: Long, lpmat2: Long): UInt =
    0u

public actual fun GetGraphicsMode(hdc: HDC): Int =
    0

public actual fun GetKerningPairsA(hdc: HDC, npairs: UInt, lpkernpair: Long): UInt =
    0u

public actual fun GetKerningPairsW(hdc: HDC, npairs: UInt, lpkernpair: Long): UInt =
    0u

public actual fun GetLayout(hdc: HDC): UInt =
    0u

public actual fun GetMapMode(hdc: HDC): HDC_MAP_MODE =
    0

public actual fun GetMetaFileA(lpname: PCSTR): HMETAFILE =
    0L

public actual fun GetMetaFileBitsEx(hmf: HMETAFILE, cbbuffer: UInt, lpdata: Long): UInt =
    0u

public actual fun GetMetaFileW(lpname: PCWSTR): HMETAFILE =
    0L

public actual fun GetMetaRgn(hdc: HDC, hrgn: HRGN): Int =
    0

public actual fun GetMiterLimit(hdc: HDC, plimit: Long): BOOL =
    0

public actual fun GetMonitorInfoA(hmonitor: HMONITOR, lpmi: Long): BOOL =
    0

public actual fun GetMonitorInfoW(hmonitor: HMONITOR, lpmi: Long): BOOL =
    0

public actual fun GetNearestColor(hdc: HDC, color: COLORREF): COLORREF =
    0u

public actual fun GetNearestPaletteIndex(h: HPALETTE, color: COLORREF): UInt =
    0u

public actual fun GetObjectA(h: HGDIOBJ, c: Int, pv: Long): Int =
    0

public actual fun GetObjectType(h: HGDIOBJ): UInt =
    0u

public actual fun GetObjectW(h: HGDIOBJ, c: Int, pv: Long): Int =
    0

public actual fun GetOutlineTextMetricsA(hdc: HDC, cjcopy: UInt, potm: Long): UInt =
    0u

public actual fun GetOutlineTextMetricsW(hdc: HDC, cjcopy: UInt, potm: Long): UInt =
    0u

public actual fun GetPaletteEntries(hpal: HPALETTE, istart: UInt, centries: UInt, ppalentries: Long): UInt =
    0u

public actual fun GetPath(hdc: HDC, apt: Long, aj: Long, cpt: Int): Int =
    0

public actual fun GetPixel(hdc: HDC, x: Int, y: Int): COLORREF =
    0u

public actual fun GetPolyFillMode(hdc: HDC): Int =
    0

public actual fun GetROP2(hdc: HDC): R2_MODE =
    0

public actual fun GetRandomRgn(hdc: HDC, hrgn: HRGN, i: Int): Int =
    0

public actual fun GetRasterizerCaps(lpraststat: Long, cjbytes: UInt): BOOL =
    0

public actual fun GetRegionData(hrgn: HRGN, ncount: UInt, lprgndata: Long): UInt =
    0u

public actual fun GetRgnBox(hrgn: HRGN, lprc: Long): GDI_REGION_TYPE =
    0

public actual fun GetStockObject(i: GET_STOCK_OBJECT_FLAGS): HGDIOBJ =
    0L

public actual fun GetStretchBltMode(hdc: HDC): Int =
    0

public actual fun GetSysColor(nindex: SYS_COLOR_INDEX): UInt =
    0u

public actual fun GetSysColorBrush(nindex: SYS_COLOR_INDEX): HBRUSH =
    0L

public actual fun GetSystemPaletteEntries(hdc: HDC, istart: UInt, centries: UInt, ppalentries: Long): UInt =
    0u

public actual fun GetSystemPaletteUse(hdc: HDC): UInt =
    0u

public actual fun GetTabbedTextExtentA(hdc: HDC, lpstring: PCSTR, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long): UInt =
    0u

public actual fun GetTabbedTextExtentW(hdc: HDC, lpstring: PCWSTR, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long): UInt =
    0u

public actual fun GetTextAlign(hdc: HDC): TEXT_ALIGN_OPTIONS =
    0u

public actual fun GetTextCharacterExtra(hdc: HDC): Int =
    0

public actual fun GetTextColor(hdc: HDC): COLORREF =
    0u

public actual fun GetTextExtentExPointA(hdc: HDC, lpszstring: PCSTR, cchstring: Int, nmaxextent: Int, lpnfit: Long, lpndx: Long, lpsize: Long): BOOL =
    0

public actual fun GetTextExtentExPointI(hdc: HDC, lpwszstring: Long, cwchstring: Int, nmaxextent: Int, lpnfit: Long, lpndx: Long, lpsize: Long): BOOL =
    0

public actual fun GetTextExtentExPointW(hdc: HDC, lpszstring: PCWSTR, cchstring: Int, nmaxextent: Int, lpnfit: Long, lpndx: Long, lpsize: Long): BOOL =
    0

public actual fun GetTextExtentPoint32A(hdc: HDC, lpstring: PCSTR, c: Int, psizl: Long): BOOL =
    0

public actual fun GetTextExtentPoint32W(hdc: HDC, lpstring: PCWSTR, c: Int, psizl: Long): BOOL =
    0

public actual fun GetTextExtentPointA(hdc: HDC, lpstring: PCSTR, c: Int, lpsz: Long): BOOL =
    0

public actual fun GetTextExtentPointI(hdc: HDC, pgiin: Long, cgi: Int, psize: Long): BOOL =
    0

public actual fun GetTextExtentPointW(hdc: HDC, lpstring: PCWSTR, c: Int, lpsz: Long): BOOL =
    0

public actual fun GetTextFaceA(hdc: HDC, c: Int, lpname: PSTR): Int =
    0

public actual fun GetTextFaceW(hdc: HDC, c: Int, lpname: PWSTR): Int =
    0

public actual fun GetTextMetricsA(hdc: HDC, lptm: Long): BOOL =
    0

public actual fun GetTextMetricsW(hdc: HDC, lptm: Long): BOOL =
    0

public actual fun GetUpdateRect(hwnd: HWND, lprect: Long, berase: BOOL): BOOL =
    0

public actual fun GetUpdateRgn(hwnd: HWND, hrgn: HRGN, berase: BOOL): GDI_REGION_TYPE =
    0

public actual fun GetViewportExtEx(hdc: HDC, lpsize: Long): BOOL =
    0

public actual fun GetViewportOrgEx(hdc: HDC, lppoint: Long): BOOL =
    0

public actual fun GetWinMetaFileBits(hemf: HENHMETAFILE, cbdata16: UInt, pdata16: Long, imapmode: Int, hdcref: HDC): UInt =
    0u

public actual fun GetWindowDC(hwnd: HWND): HDC =
    0L

public actual fun GetWindowExtEx(hdc: HDC, lpsize: Long): BOOL =
    0

public actual fun GetWindowOrgEx(hdc: HDC, lppoint: Long): BOOL =
    0

public actual fun GetWindowRgn(hwnd: HWND, hrgn: HRGN): GDI_REGION_TYPE =
    0

public actual fun GetWindowRgnBox(hwnd: HWND, lprc: Long): GDI_REGION_TYPE =
    0

public actual fun GetWorldTransform(hdc: HDC, lpxf: Long): BOOL =
    0

public actual fun GradientFill(hdc: HDC, pvertex: Long, nvertex: UInt, pmesh: Long, nmesh: UInt, ulmode: GRADIENT_FILL): BOOL =
    0

public actual fun GrayStringA(hdc: HDC, hbrush: HBRUSH, lpoutputfunc: GRAYSTRINGPROC, lpdata: LPARAM, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): BOOL =
    0

public actual fun GrayStringW(hdc: HDC, hbrush: HBRUSH, lpoutputfunc: GRAYSTRINGPROC, lpdata: LPARAM, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): BOOL =
    0

public actual fun InflateRect(lprc: Long, dx: Int, dy: Int): BOOL =
    0

public actual fun IntersectClipRect(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int): GDI_REGION_TYPE =
    0

public actual fun IntersectRect(lprcdst: Long, lprcsrc1: Long, lprcsrc2: Long): BOOL =
    0

public actual fun InvalidateRect(hwnd: HWND, lprect: Long, berase: BOOL): BOOL =
    0

public actual fun InvalidateRgn(hwnd: HWND, hrgn: HRGN, berase: BOOL): BOOL =
    0

public actual fun InvertRect(hdc: HDC, lprc: Long): BOOL =
    0

public actual fun InvertRgn(hdc: HDC, hrgn: HRGN): BOOL =
    0

public actual fun IsRectEmpty(lprc: Long): BOOL =
    0

public actual fun LPtoDP(hdc: HDC, lppt: Long, c: Int): BOOL =
    0

public actual fun LineDDA(xstart: Int, ystart: Int, xend: Int, yend: Int, lpproc: LINEDDAPROC, data: LPARAM): BOOL =
    0

public actual fun LineTo(hdc: HDC, x: Int, y: Int): BOOL =
    0

public actual fun LoadBitmapA(hinstance: HINSTANCE, lpbitmapname: PCSTR): HBITMAP =
    0L

public actual fun LoadBitmapW(hinstance: HINSTANCE, lpbitmapname: PCWSTR): HBITMAP =
    0L

public actual fun LockWindowUpdate(hwndlock: HWND): BOOL =
    0

public actual fun MapWindowPoints(hwndfrom: HWND, hwndto: HWND, lppoints: Long, cpoints: UInt): Int =
    0

public actual fun MaskBlt(hdcdest: HDC, xdest: Int, ydest: Int, width: Int, height: Int, hdcsrc: HDC, xsrc: Int, ysrc: Int, hbmmask: HBITMAP, xmask: Int, ymask: Int, rop: UInt): BOOL =
    0

public actual fun MergeFontPackage(puchmergefontbuffer: Long, ulmergefontbuffersize: UInt, puchfontpackagebuffer: Long, ulfontpackagebuffersize: UInt, ppuchdestbuffer: Long, puldestbuffersize: Long, pulbyteswritten: Long, usmode: UShort, lpfnallocate: CFP_ALLOCPROC, lpfnreallocate: CFP_REALLOCPROC, lpfnfree: CFP_FREEPROC, lpvreserved: Long): UInt =
    0u

public actual fun ModifyWorldTransform(hdc: HDC, lpxf: Long, mode: MODIFY_WORLD_TRANSFORM_MODE): BOOL =
    0

public actual fun MonitorFromPoint(pt: POINT, dwflags: MONITOR_FROM_FLAGS): HMONITOR =
    0L

public actual fun MonitorFromRect(lprc: Long, dwflags: MONITOR_FROM_FLAGS): HMONITOR =
    0L

public actual fun MonitorFromWindow(hwnd: HWND, dwflags: MONITOR_FROM_FLAGS): HMONITOR =
    0L

public actual fun MoveToEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL =
    0

public actual fun OffsetClipRgn(hdc: HDC, x: Int, y: Int): GDI_REGION_TYPE =
    0

public actual fun OffsetRect(lprc: Long, dx: Int, dy: Int): BOOL =
    0

public actual fun OffsetRgn(hrgn: HRGN, x: Int, y: Int): GDI_REGION_TYPE =
    0

public actual fun OffsetViewportOrgEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL =
    0

public actual fun OffsetWindowOrgEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL =
    0

public actual fun PaintDesktop(hdc: HDC): BOOL =
    0

public actual fun PaintRgn(hdc: HDC, hrgn: HRGN): BOOL =
    0

public actual fun PatBlt(hdc: HDC, x: Int, y: Int, w: Int, h: Int, rop: ROP_CODE): BOOL =
    0

public actual fun PathToRegion(hdc: HDC): HRGN =
    0L

public actual fun Pie(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): BOOL =
    0

public actual fun PlayEnhMetaFile(hdc: HDC, hmf: HENHMETAFILE, lprect: Long): BOOL =
    0

public actual fun PlayEnhMetaFileRecord(hdc: HDC, pht: Long, pmr: Long, cht: UInt): BOOL =
    0

public actual fun PlayMetaFile(hdc: HDC, hmf: HMETAFILE): BOOL =
    0

public actual fun PlayMetaFileRecord(hdc: HDC, lphandletable: Long, lpmr: Long, noobjs: UInt): BOOL =
    0

public actual fun PlgBlt(hdcdest: HDC, lppoint: Long, hdcsrc: HDC, xsrc: Int, ysrc: Int, width: Int, height: Int, hbmmask: HBITMAP, xmask: Int, ymask: Int): BOOL =
    0

public actual fun PolyBezier(hdc: HDC, apt: Long, cpt: UInt): BOOL =
    0

public actual fun PolyBezierTo(hdc: HDC, apt: Long, cpt: UInt): BOOL =
    0

public actual fun PolyDraw(hdc: HDC, apt: Long, aj: Long, cpt: Int): BOOL =
    0

public actual fun PolyPolygon(hdc: HDC, apt: Long, asz: Long, csz: Int): BOOL =
    0

public actual fun PolyPolyline(hdc: HDC, apt: Long, asz: Long, csz: UInt): BOOL =
    0

public actual fun PolyTextOutA(hdc: HDC, ppt: Long, nstrings: Int): BOOL =
    0

public actual fun PolyTextOutW(hdc: HDC, ppt: Long, nstrings: Int): BOOL =
    0

public actual fun Polygon(hdc: HDC, apt: Long, cpt: Int): BOOL =
    0

public actual fun Polyline(hdc: HDC, apt: Long, cpt: Int): BOOL =
    0

public actual fun PolylineTo(hdc: HDC, apt: Long, cpt: UInt): BOOL =
    0

public actual fun PtInRect(lprc: Long, pt: POINT): BOOL =
    0

public actual fun PtInRegion(hrgn: HRGN, x: Int, y: Int): BOOL =
    0

public actual fun PtVisible(hdc: HDC, x: Int, y: Int): BOOL =
    0

public actual fun RealizePalette(hdc: HDC): UInt =
    0u

public actual fun RectInRegion(hrgn: HRGN, lprect: Long): BOOL =
    0

public actual fun RectVisible(hdc: HDC, lprect: Long): BOOL =
    0

public actual fun Rectangle(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int): BOOL =
    0

public actual fun RedrawWindow(hwnd: HWND, lprcupdate: Long, hrgnupdate: HRGN, flags: REDRAW_WINDOW_FLAGS): BOOL =
    0

public actual fun ReleaseDC(hwnd: HWND, hdc: HDC): Int =
    0

public actual fun RemoveFontMemResourceEx(h: HANDLE): BOOL =
    0

public actual fun RemoveFontResourceA(lpfilename: PCSTR): BOOL =
    0

public actual fun RemoveFontResourceExA(name: PCSTR, fl: UInt, pdv: Long): BOOL =
    0

public actual fun RemoveFontResourceExW(name: PCWSTR, fl: UInt, pdv: Long): BOOL =
    0

public actual fun RemoveFontResourceW(lpfilename: PCWSTR): BOOL =
    0

public actual fun ResetDCA(hdc: HDC, lpdm: Long): HDC =
    0L

public actual fun ResetDCW(hdc: HDC, lpdm: Long): HDC =
    0L

public actual fun ResizePalette(hpal: HPALETTE, n: UInt): BOOL =
    0

public actual fun RestoreDC(hdc: HDC, nsaveddc: Int): BOOL =
    0

public actual fun RoundRect(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int, width: Int, height: Int): BOOL =
    0

public actual fun SaveDC(hdc: HDC): Int =
    0

public actual fun ScaleViewportExtEx(hdc: HDC, xn: Int, dx: Int, yn: Int, yd: Int, lpsz: Long): BOOL =
    0

public actual fun ScaleWindowExtEx(hdc: HDC, xn: Int, xd: Int, yn: Int, yd: Int, lpsz: Long): BOOL =
    0

public actual fun ScreenToClient(hwnd: HWND, lppoint: Long): BOOL =
    0

public actual fun SelectClipPath(hdc: HDC, mode: RGN_COMBINE_MODE): BOOL =
    0

public actual fun SelectClipRgn(hdc: HDC, hrgn: HRGN): GDI_REGION_TYPE =
    0

public actual fun SelectObject(hdc: HDC, h: HGDIOBJ): HGDIOBJ =
    0L

public actual fun SelectPalette(hdc: HDC, hpal: HPALETTE, bforcebkgd: BOOL): HPALETTE =
    0L

public actual fun SetArcDirection(hdc: HDC, dir: ARC_DIRECTION): Int =
    0

public actual fun SetBitmapBits(hbm: HBITMAP, cb: UInt, pvbits: Long): Int =
    0

public actual fun SetBitmapDimensionEx(hbm: HBITMAP, w: Int, h: Int, lpsz: Long): BOOL =
    0

public actual fun SetBkColor(hdc: HDC, color: COLORREF): COLORREF =
    0u

public actual fun SetBkMode(hdc: HDC, mode: Int): Int =
    0

public actual fun SetBoundsRect(hdc: HDC, lprect: Long, flags: SET_BOUNDS_RECT_FLAGS): UInt =
    0u

public actual fun SetBrushOrgEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL =
    0

public actual fun SetColorAdjustment(hdc: HDC, lpca: Long): BOOL =
    0

public actual fun SetDCBrushColor(hdc: HDC, color: COLORREF): COLORREF =
    0u

public actual fun SetDCPenColor(hdc: HDC, color: COLORREF): COLORREF =
    0u

public actual fun SetDIBColorTable(hdc: HDC, istart: UInt, centries: UInt, prgbq: Long): UInt =
    0u

public actual fun SetDIBits(hdc: HDC, hbm: HBITMAP, start: UInt, clines: UInt, lpbits: Long, lpbmi: Long, coloruse: DIB_USAGE): Int =
    0

public actual fun SetDIBitsToDevice(hdc: HDC, xdest: Int, ydest: Int, w: UInt, h: UInt, xsrc: Int, ysrc: Int, startscan: UInt, clines: UInt, lpvbits: Long, lpbmi: Long, coloruse: DIB_USAGE): Int =
    0

public actual fun SetEnhMetaFileBits(nsize: UInt, pb: Long): HENHMETAFILE =
    0L

public actual fun SetGraphicsMode(hdc: HDC, imode: GRAPHICS_MODE): Int =
    0

public actual fun SetLayout(hdc: HDC, l: DC_LAYOUT): UInt =
    0u

public actual fun SetMapMode(hdc: HDC, imode: HDC_MAP_MODE): Int =
    0

public actual fun SetMapperFlags(hdc: HDC, flags: UInt): UInt =
    0u

public actual fun SetMetaFileBitsEx(cbbuffer: UInt, lpdata: Long): HMETAFILE =
    0L

public actual fun SetMetaRgn(hdc: HDC): GDI_REGION_TYPE =
    0

public actual fun SetMiterLimit(hdc: HDC, limit: Float, old: Long): BOOL =
    0

public actual fun SetPaletteEntries(hpal: HPALETTE, istart: UInt, centries: UInt, ppalentries: Long): UInt =
    0u

public actual fun SetPixel(hdc: HDC, x: Int, y: Int, color: COLORREF): COLORREF =
    0u

public actual fun SetPixelV(hdc: HDC, x: Int, y: Int, color: COLORREF): BOOL =
    0

public actual fun SetPolyFillMode(hdc: HDC, mode: CREATE_POLYGON_RGN_MODE): Int =
    0

public actual fun SetROP2(hdc: HDC, rop2: R2_MODE): Int =
    0

public actual fun SetRect(lprc: Long, xleft: Int, ytop: Int, xright: Int, ybottom: Int): BOOL =
    0

public actual fun SetRectEmpty(lprc: Long): BOOL =
    0

public actual fun SetRectRgn(hrgn: HRGN, left: Int, top: Int, right: Int, bottom: Int): BOOL =
    0

public actual fun SetStretchBltMode(hdc: HDC, mode: STRETCH_BLT_MODE): Int =
    0

public actual fun SetSysColors(celements: Int, lpaelements: Long, lpargbvalues: Long): BOOL =
    0

public actual fun SetSystemPaletteUse(hdc: HDC, use: SYSTEM_PALETTE_USE): UInt =
    0u

public actual fun SetTextAlign(hdc: HDC, align: TEXT_ALIGN_OPTIONS): UInt =
    0u

public actual fun SetTextCharacterExtra(hdc: HDC, extra: Int): Int =
    0

public actual fun SetTextColor(hdc: HDC, color: COLORREF): COLORREF =
    0u

public actual fun SetTextJustification(hdc: HDC, extra: Int, count: Int): BOOL =
    0

public actual fun SetViewportExtEx(hdc: HDC, x: Int, y: Int, lpsz: Long): BOOL =
    0

public actual fun SetViewportOrgEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL =
    0

public actual fun SetWindowExtEx(hdc: HDC, x: Int, y: Int, lpsz: Long): BOOL =
    0

public actual fun SetWindowOrgEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL =
    0

public actual fun SetWindowRgn(hwnd: HWND, hrgn: HRGN, bredraw: BOOL): Int =
    0

public actual fun SetWorldTransform(hdc: HDC, lpxf: Long): BOOL =
    0

public actual fun StretchBlt(hdcdest: HDC, xdest: Int, ydest: Int, wdest: Int, hdest: Int, hdcsrc: HDC, xsrc: Int, ysrc: Int, wsrc: Int, hsrc: Int, rop: ROP_CODE): BOOL =
    0

public actual fun StretchDIBits(hdc: HDC, xdest: Int, ydest: Int, destwidth: Int, destheight: Int, xsrc: Int, ysrc: Int, srcwidth: Int, srcheight: Int, lpbits: Long, lpbmi: Long, iusage: DIB_USAGE, rop: ROP_CODE): Int =
    0

public actual fun StrokeAndFillPath(hdc: HDC): BOOL =
    0

public actual fun StrokePath(hdc: HDC): BOOL =
    0

public actual fun SubtractRect(lprcdst: Long, lprcsrc1: Long, lprcsrc2: Long): BOOL =
    0

public actual fun TTCharToUnicode(hdc: HDC, puccharcodes: Long, ulcharcodesize: UInt, pusshortcodes: Long, ulshortcodesize: UInt, ulflags: UInt): Int =
    0

public actual fun TTDeleteEmbeddedFont(hfontreference: HANDLE, ulflags: UInt, pulstatus: Long): Int =
    0

public actual fun TTEmbedFont(hdc: HDC, ulflags: TTEMBED_FLAGS, ulcharset: EMBED_FONT_CHARSET, pulprivstatus: Long, pulstatus: Long, lpfnwritetostream: WRITEEMBEDPROC, lpvwritestream: Long, puscharcodeset: Long, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: Long): Int =
    0

public actual fun TTEmbedFontEx(hdc: HDC, ulflags: TTEMBED_FLAGS, ulcharset: EMBED_FONT_CHARSET, pulprivstatus: Long, pulstatus: Long, lpfnwritetostream: WRITEEMBEDPROC, lpvwritestream: Long, pulcharcodeset: Long, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: Long): Int =
    0

public actual fun TTEmbedFontFromFileA(hdc: HDC, szfontfilename: PCSTR, usttcindex: UShort, ulflags: TTEMBED_FLAGS, ulcharset: EMBED_FONT_CHARSET, pulprivstatus: Long, pulstatus: Long, lpfnwritetostream: WRITEEMBEDPROC, lpvwritestream: Long, puscharcodeset: Long, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: Long): Int =
    0

public actual fun TTEnableEmbeddingForFacename(lpszfacename: PCSTR, benable: BOOL): Int =
    0

public actual fun TTGetEmbeddedFontInfo(ulflags: TTEMBED_FLAGS, pulprivstatus: Long, ulprivs: FONT_LICENSE_PRIVS, pulstatus: Long, lpfnreadfromstream: READEMBEDPROC, lpvreadstream: Long, pttloadinfo: Long): Int =
    0

public actual fun TTGetEmbeddingType(hdc: HDC, pulembedtype: Long): Int =
    0

public actual fun TTGetNewFontName(phfontreference: Long, wzwinfamilyname: PWSTR, cchmaxwinname: Int, szmacfamilyname: PSTR, cchmaxmacname: Int): Int =
    0

public actual fun TTIsEmbeddingEnabled(hdc: HDC, pbenabled: Long): Int =
    0

public actual fun TTIsEmbeddingEnabledForFacename(lpszfacename: PCSTR, pbenabled: Long): Int =
    0

public actual fun TTLoadEmbeddedFont(phfontreference: Long, ulflags: UInt, pulprivstatus: Long, ulprivs: FONT_LICENSE_PRIVS, pulstatus: Long, lpfnreadfromstream: READEMBEDPROC, lpvreadstream: Long, szwinfamilyname: PCWSTR, szmacfamilyname: PCSTR, pttloadinfo: Long): Int =
    0

public actual fun TTRunValidationTests(hdc: HDC, ptestparam: Long): Int =
    0

public actual fun TTRunValidationTestsEx(hdc: HDC, ptestparam: Long): Int =
    0

public actual fun TabbedTextOutA(hdc: HDC, x: Int, y: Int, lpstring: PCSTR, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long, ntaborigin: Int): Int =
    0

public actual fun TabbedTextOutW(hdc: HDC, x: Int, y: Int, lpstring: PCWSTR, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long, ntaborigin: Int): Int =
    0

public actual fun TextOutA(hdc: HDC, x: Int, y: Int, lpstring: PCSTR, c: Int): BOOL =
    0

public actual fun TextOutW(hdc: HDC, x: Int, y: Int, lpstring: PCWSTR, c: Int): BOOL =
    0

public actual fun TransparentBlt(hdcdest: HDC, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: HDC, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: UInt): BOOL =
    0

public actual fun UnionRect(lprcdst: Long, lprcsrc1: Long, lprcsrc2: Long): BOOL =
    0

public actual fun UnrealizeObject(h: HGDIOBJ): BOOL =
    0

public actual fun UpdateColors(hdc: HDC): BOOL =
    0

public actual fun UpdateWindow(hwnd: HWND): BOOL =
    0

public actual fun ValidateRect(hwnd: HWND, lprect: Long): BOOL =
    0

public actual fun ValidateRgn(hwnd: HWND, hrgn: HRGN): BOOL =
    0

public actual fun WidenPath(hdc: HDC): BOOL =
    0

public actual fun WindowFromDC(hdc: HDC): HWND =
    0L

public actual fun wglSwapMultipleBuffers(param0: UInt, param1: Long): UInt =
    0u
