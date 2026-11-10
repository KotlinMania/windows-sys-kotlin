package io.github.kotlinmania.windowssys.windows.win32.graphics.gdi

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Colorref
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam

public expect fun abortPath(hdc: Hdc): Bool

public expect fun addFontMemResourceEx(pfileview: COpaquePointer?, cjsize: UInt, pvresrved: COpaquePointer?, pnumfonts: COpaquePointer?): Handle

public expect fun addFontResourceA(param0: Pcstr): Int

public expect fun addFontResourceExA(name: Pcstr, fl: FontResourceCharacteristics, res: COpaquePointer?): Int

public expect fun addFontResourceExW(name: Pcwstr, fl: FontResourceCharacteristics, res: COpaquePointer?): Int

public expect fun addFontResourceW(param0: Pcwstr): Int

public expect fun alphaBlend(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, ftn: Blendfunction): Bool

public expect fun angleArc(hdc: Hdc, x: Int, y: Int, r: UInt, startangle: Float, sweepangle: Float): Bool

public expect fun animatePalette(hpal: Hpalette, istartindex: UInt, centries: UInt, ppe: COpaquePointer?): Bool

public expect fun arc(hdc: Hdc, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Bool

public expect fun arcTo(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): Bool

public expect fun beginPaint(hwnd: Hwnd, lppaint: COpaquePointer?): Hdc

public expect fun beginPath(hdc: Hdc): Bool

public expect fun bitBlt(hdc: Hdc, x: Int, y: Int, cx: Int, cy: Int, hdcsrc: Hdc, x1: Int, y1: Int, rop: RopCode): Bool

public expect fun cancelDC(hdc: Hdc): Bool

public expect fun changeDisplaySettingsA(lpdevmode: COpaquePointer?, dwflags: CdsType): DispChange

public expect fun changeDisplaySettingsExA(lpszdevicename: Pcstr, lpdevmode: COpaquePointer?, hwnd: Hwnd, dwflags: CdsType, lparam: COpaquePointer?): DispChange

public expect fun changeDisplaySettingsExW(lpszdevicename: Pcwstr, lpdevmode: COpaquePointer?, hwnd: Hwnd, dwflags: CdsType, lparam: COpaquePointer?): DispChange

public expect fun changeDisplaySettingsW(lpdevmode: COpaquePointer?, dwflags: CdsType): DispChange

public expect fun chord(hdc: Hdc, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Bool

public expect fun clientToScreen(hwnd: Hwnd, lppoint: COpaquePointer?): Bool

public expect fun closeEnhMetaFile(hdc: Hdc): Henhmetafile

public expect fun closeFigure(hdc: Hdc): Bool

public expect fun closeMetaFile(hdc: Hdc): Hmetafile

public expect fun combineRgn(hrgndst: Hrgn, hrgnsrc1: Hrgn, hrgnsrc2: Hrgn, imode: RgnCombineMode): GdiRegionType

public expect fun combineTransform(lpxfout: COpaquePointer?, lpxf1: COpaquePointer?, lpxf2: COpaquePointer?): Bool

public expect fun copyEnhMetaFileA(henh: Henhmetafile, lpfilename: Pcstr): Henhmetafile

public expect fun copyEnhMetaFileW(henh: Henhmetafile, lpfilename: Pcwstr): Henhmetafile

public expect fun copyMetaFileA(param0: Hmetafile, param1: Pcstr): Hmetafile

public expect fun copyMetaFileW(param0: Hmetafile, param1: Pcwstr): Hmetafile

public expect fun copyRect(lprcdst: COpaquePointer?, lprcsrc: COpaquePointer?): Bool

public expect fun createBitmap(nwidth: Int, nheight: Int, nplanes: UInt, nbitcount: UInt, lpbits: COpaquePointer?): Hbitmap

public expect fun createBitmapIndirect(pbm: COpaquePointer?): Hbitmap

public expect fun createBrushIndirect(plbrush: COpaquePointer?): Hbrush

public expect fun createCompatibleBitmap(hdc: Hdc, cx: Int, cy: Int): Hbitmap

public expect fun createCompatibleDC(hdc: Hdc): Hdc

public expect fun createDCA(pwszdriver: Pcstr, pwszdevice: Pcstr, pszport: Pcstr, pdm: COpaquePointer?): Hdc

public expect fun createDCW(pwszdriver: Pcwstr, pwszdevice: Pcwstr, pszport: Pcwstr, pdm: COpaquePointer?): Hdc

public expect fun createDIBPatternBrush(h: Hglobal, iusage: DibUsage): Hbrush

public expect fun createDIBPatternBrushPt(lppackeddib: COpaquePointer?, iusage: DibUsage): Hbrush

public expect fun createDIBSection(hdc: Hdc, pbmi: COpaquePointer?, usage: DibUsage, ppvbits: COpaquePointer?, hsection: Handle, offset: UInt): Hbitmap

public expect fun createDIBitmap(hdc: Hdc, pbmih: COpaquePointer?, flinit: UInt, pjbits: COpaquePointer?, pbmi: COpaquePointer?, iusage: DibUsage): Hbitmap

public expect fun createDiscardableBitmap(hdc: Hdc, cx: Int, cy: Int): Hbitmap

public expect fun createEllipticRgn(x1: Int, y1: Int, x2: Int, y2: Int): Hrgn

public expect fun createEllipticRgnIndirect(lprect: COpaquePointer?): Hrgn

public expect fun createEnhMetaFileA(hdc: Hdc, lpfilename: Pcstr, lprc: COpaquePointer?, lpdesc: Pcstr): Hdc

public expect fun createEnhMetaFileW(hdc: Hdc, lpfilename: Pcwstr, lprc: COpaquePointer?, lpdesc: Pcwstr): Hdc

public expect fun createFontA(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: UInt, bunderline: UInt, bstrikeout: UInt, icharset: UInt, ioutprecision: UInt, iclipprecision: UInt, iquality: UInt, ipitchandfamily: UInt, pszfacename: Pcstr): Hfont

public expect fun createFontIndirectA(lplf: COpaquePointer?): Hfont

public expect fun createFontIndirectExA(param0: COpaquePointer?): Hfont

public expect fun createFontIndirectExW(param0: COpaquePointer?): Hfont

public expect fun createFontIndirectW(lplf: COpaquePointer?): Hfont

public expect fun createFontPackage(puchsrcbuffer: COpaquePointer?, ulsrcbuffersize: UInt, ppuchfontpackagebuffer: COpaquePointer?, pulfontpackagebuffersize: COpaquePointer?, pulbyteswritten: COpaquePointer?, usflag: UShort, usttcindex: UShort, ussubsetformat: UShort, ussubsetlanguage: UShort, ussubsetplatform: CreateFontPackageSubsetPlatform, ussubsetencoding: CreateFontPackageSubsetEncoding, pussubsetkeeplist: COpaquePointer?, ussubsetlistcount: UShort, lpfnallocate: CfpAllocproc, lpfnreallocate: CfpReallocproc, lpfnfree: CfpFreeproc, lpvreserved: COpaquePointer?): UInt

public expect fun createFontW(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: UInt, bunderline: UInt, bstrikeout: UInt, icharset: UInt, ioutprecision: UInt, iclipprecision: UInt, iquality: UInt, ipitchandfamily: UInt, pszfacename: Pcwstr): Hfont

public expect fun createHalftonePalette(hdc: Hdc): Hpalette

public expect fun createHatchBrush(ihatch: HatchBrushStyle, color: Colorref): Hbrush

public expect fun createICA(pszdriver: Pcstr, pszdevice: Pcstr, pszport: Pcstr, pdm: COpaquePointer?): Hdc

public expect fun createICW(pszdriver: Pcwstr, pszdevice: Pcwstr, pszport: Pcwstr, pdm: COpaquePointer?): Hdc

public expect fun createMetaFileA(pszfile: Pcstr): Hdc

public expect fun createMetaFileW(pszfile: Pcwstr): Hdc

public expect fun createPalette(plpal: COpaquePointer?): Hpalette

public expect fun createPatternBrush(hbm: Hbitmap): Hbrush

public expect fun createPen(istyle: PenStyle, cwidth: Int, color: Colorref): Hpen

public expect fun createPenIndirect(plpen: COpaquePointer?): Hpen

public expect fun createPolyPolygonRgn(pptl: COpaquePointer?, pc: COpaquePointer?, cpoly: Int, imode: CreatePolygonRgnMode): Hrgn

public expect fun createPolygonRgn(pptl: COpaquePointer?, cpoint: Int, imode: CreatePolygonRgnMode): Hrgn

public expect fun createRectRgn(x1: Int, y1: Int, x2: Int, y2: Int): Hrgn

public expect fun createRectRgnIndirect(lprect: COpaquePointer?): Hrgn

public expect fun createRoundRectRgn(x1: Int, y1: Int, x2: Int, y2: Int, w: Int, h: Int): Hrgn

public expect fun createScalableFontResourceA(fdwhidden: UInt, lpszfont: Pcstr, lpszfile: Pcstr, lpszpath: Pcstr): Bool

public expect fun createScalableFontResourceW(fdwhidden: UInt, lpszfont: Pcwstr, lpszfile: Pcwstr, lpszpath: Pcwstr): Bool

public expect fun createSolidBrush(color: Colorref): Hbrush

public expect fun dPtoLP(hdc: Hdc, lppt: COpaquePointer?, c: Int): Bool

public expect fun deleteDC(hdc: Hdc): Bool

public expect fun deleteEnhMetaFile(hmf: Henhmetafile): Bool

public expect fun deleteMetaFile(hmf: Hmetafile): Bool

public expect fun deleteObject(ho: Hgdiobj): Bool

public expect fun drawAnimatedRects(hwnd: Hwnd, idani: Int, lprcfrom: COpaquePointer?, lprcto: COpaquePointer?): Bool

public expect fun drawCaption(hwnd: Hwnd, hdc: Hdc, lprect: COpaquePointer?, flags: DrawCaptionFlags): Bool

public expect fun drawEdge(hdc: Hdc, qrc: COpaquePointer?, edge: DrawedgeFlags, grfflags: DrawEdgeFlags): Bool

public expect fun drawEscape(hdc: Hdc, iescape: Int, cjin: Int, lpin: Pcstr): Int

public expect fun drawFocusRect(hdc: Hdc, lprc: COpaquePointer?): Bool

public expect fun drawFrameControl(param0: Hdc, param1: COpaquePointer?, param2: DfcType, param3: DfcsState): Bool

public expect fun drawStateA(hdc: Hdc, hbrfore: Hbrush, qfncallback: Drawstateproc, ldata: Lparam, wdata: Wparam, x: Int, y: Int, cx: Int, cy: Int, uflags: DrawstateFlags): Bool

public expect fun drawStateW(hdc: Hdc, hbrfore: Hbrush, qfncallback: Drawstateproc, ldata: Lparam, wdata: Wparam, x: Int, y: Int, cx: Int, cy: Int, uflags: DrawstateFlags): Bool

public expect fun drawTextA(hdc: Hdc, lpchtext: Pcstr, cchtext: Int, lprc: COpaquePointer?, format: DrawTextFormat): Int

public expect fun drawTextExA(hdc: Hdc, lpchtext: Pstr, cchtext: Int, lprc: COpaquePointer?, format: DrawTextFormat, lpdtp: COpaquePointer?): Int

public expect fun drawTextExW(hdc: Hdc, lpchtext: Pwstr, cchtext: Int, lprc: COpaquePointer?, format: DrawTextFormat, lpdtp: COpaquePointer?): Int

public expect fun drawTextW(hdc: Hdc, lpchtext: Pcwstr, cchtext: Int, lprc: COpaquePointer?, format: DrawTextFormat): Int

public expect fun ellipse(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): Bool

public expect fun endPaint(hwnd: Hwnd, lppaint: COpaquePointer?): Bool

public expect fun endPath(hdc: Hdc): Bool

public expect fun enumDisplayDevicesA(lpdevice: Pcstr, idevnum: UInt, lpdisplaydevice: COpaquePointer?, dwflags: UInt): Bool

public expect fun enumDisplayDevicesW(lpdevice: Pcwstr, idevnum: UInt, lpdisplaydevice: COpaquePointer?, dwflags: UInt): Bool

public expect fun enumDisplayMonitors(hdc: Hdc, lprcclip: COpaquePointer?, lpfnenum: Monitorenumproc, dwdata: Lparam): Bool

public expect fun enumDisplaySettingsA(lpszdevicename: Pcstr, imodenum: EnumDisplaySettingsMode, lpdevmode: COpaquePointer?): Bool

public expect fun enumDisplaySettingsExA(lpszdevicename: Pcstr, imodenum: EnumDisplaySettingsMode, lpdevmode: COpaquePointer?, dwflags: EnumDisplaySettingsFlags): Bool

public expect fun enumDisplaySettingsExW(lpszdevicename: Pcwstr, imodenum: EnumDisplaySettingsMode, lpdevmode: COpaquePointer?, dwflags: EnumDisplaySettingsFlags): Bool

public expect fun enumDisplaySettingsW(lpszdevicename: Pcwstr, imodenum: EnumDisplaySettingsMode, lpdevmode: COpaquePointer?): Bool

public expect fun enumEnhMetaFile(hdc: Hdc, hmf: Henhmetafile, proc: Enhmfenumproc, param3: COpaquePointer?, lprect: COpaquePointer?): Bool

public expect fun enumFontFamiliesA(hdc: Hdc, lplogfont: Pcstr, lpproc: Fontenumproca, lparam: Lparam): Int

public expect fun enumFontFamiliesExA(hdc: Hdc, lplogfont: COpaquePointer?, lpproc: Fontenumproca, lparam: Lparam, dwflags: UInt): Int

public expect fun enumFontFamiliesExW(hdc: Hdc, lplogfont: COpaquePointer?, lpproc: Fontenumprocw, lparam: Lparam, dwflags: UInt): Int

public expect fun enumFontFamiliesW(hdc: Hdc, lplogfont: Pcwstr, lpproc: Fontenumprocw, lparam: Lparam): Int

public expect fun enumFontsA(hdc: Hdc, lplogfont: Pcstr, lpproc: Fontenumproca, lparam: Lparam): Int

public expect fun enumFontsW(hdc: Hdc, lplogfont: Pcwstr, lpproc: Fontenumprocw, lparam: Lparam): Int

public expect fun enumMetaFile(hdc: Hdc, hmf: Hmetafile, proc: Mfenumproc, param3: Lparam): Bool

public expect fun enumObjects(hdc: Hdc, ntype: ObjType, lpfunc: Gobjenumproc, lparam: Lparam): Int

public expect fun equalRect(lprc1: COpaquePointer?, lprc2: COpaquePointer?): Bool

public expect fun equalRgn(hrgn1: Hrgn, hrgn2: Hrgn): Bool

public expect fun excludeClipRect(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): GdiRegionType

public expect fun excludeUpdateRgn(hdc: Hdc, hwnd: Hwnd): Int

public expect fun extCreatePen(ipenstyle: UInt, cwidth: UInt, plbrush: COpaquePointer?, cstyle: UInt, pstyle: COpaquePointer?): Hpen

public expect fun extCreateRegion(lpx: COpaquePointer?, ncount: UInt, lpdata: COpaquePointer?): Hrgn

public expect fun extFloodFill(hdc: Hdc, x: Int, y: Int, color: Colorref, type: ExtFloodFillType): Bool

public expect fun extSelectClipRgn(hdc: Hdc, hrgn: Hrgn, mode: RgnCombineMode): GdiRegionType

public expect fun extTextOutA(hdc: Hdc, x: Int, y: Int, options: EtoOptions, lprect: COpaquePointer?, lpstring: Pcstr, c: UInt, lpdx: COpaquePointer?): Bool

public expect fun extTextOutW(hdc: Hdc, x: Int, y: Int, options: EtoOptions, lprect: COpaquePointer?, lpstring: Pcwstr, c: UInt, lpdx: COpaquePointer?): Bool

public expect fun fillPath(hdc: Hdc): Bool

public expect fun fillRect(hdc: Hdc, lprc: COpaquePointer?, hbr: Hbrush): Int

public expect fun fillRgn(hdc: Hdc, hrgn: Hrgn, hbr: Hbrush): Bool

public expect fun fixBrushOrgEx(hdc: Hdc, x: Int, y: Int, ptl: COpaquePointer?): Bool

public expect fun flattenPath(hdc: Hdc): Bool

public expect fun floodFill(hdc: Hdc, x: Int, y: Int, color: Colorref): Bool

public expect fun frameRect(hdc: Hdc, lprc: COpaquePointer?, hbr: Hbrush): Int

public expect fun frameRgn(hdc: Hdc, hrgn: Hrgn, hbr: Hbrush, w: Int, h: Int): Bool

public expect fun gdiAlphaBlend(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, ftn: Blendfunction): Bool

public expect fun gdiComment(hdc: Hdc, nsize: UInt, lpdata: COpaquePointer?): Bool

public expect fun gdiFlush(): Bool

public expect fun gdiGetBatchLimit(): UInt

public expect fun gdiGradientFill(hdc: Hdc, pvertex: COpaquePointer?, nvertex: UInt, pmesh: COpaquePointer?, ncount: UInt, ulmode: GradientFill): Bool

public expect fun gdiSetBatchLimit(dw: UInt): UInt

public expect fun gdiTransparentBlt(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: UInt): Bool

public expect fun getArcDirection(hdc: Hdc): Int

public expect fun getAspectRatioFilterEx(hdc: Hdc, lpsize: COpaquePointer?): Bool

public expect fun getBitmapBits(hbit: Hbitmap, cb: Int, lpvbits: COpaquePointer?): Int

public expect fun getBitmapDimensionEx(hbit: Hbitmap, lpsize: COpaquePointer?): Bool

public expect fun getBkColor(hdc: Hdc): Colorref

public expect fun getBkMode(hdc: Hdc): Int

public expect fun getBoundsRect(hdc: Hdc, lprect: COpaquePointer?, flags: UInt): UInt

public expect fun getBrushOrgEx(hdc: Hdc, lppt: COpaquePointer?): Bool

public expect fun getCharABCWidthsA(hdc: Hdc, wfirst: UInt, wlast: UInt, lpabc: COpaquePointer?): Bool

public expect fun getCharABCWidthsFloatA(hdc: Hdc, ifirst: UInt, ilast: UInt, lpabc: COpaquePointer?): Bool

public expect fun getCharABCWidthsFloatW(hdc: Hdc, ifirst: UInt, ilast: UInt, lpabc: COpaquePointer?): Bool

public expect fun getCharABCWidthsI(hdc: Hdc, gifirst: UInt, cgi: UInt, pgi: COpaquePointer?, pabc: COpaquePointer?): Bool

public expect fun getCharABCWidthsW(hdc: Hdc, wfirst: UInt, wlast: UInt, lpabc: COpaquePointer?): Bool

public expect fun getCharWidth32A(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: COpaquePointer?): Bool

public expect fun getCharWidth32W(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: COpaquePointer?): Bool

public expect fun getCharWidthA(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: COpaquePointer?): Bool

public expect fun getCharWidthFloatA(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: COpaquePointer?): Bool

public expect fun getCharWidthFloatW(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: COpaquePointer?): Bool

public expect fun getCharWidthI(hdc: Hdc, gifirst: UInt, cgi: UInt, pgi: COpaquePointer?, piwidths: COpaquePointer?): Bool

public expect fun getCharWidthW(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: COpaquePointer?): Bool

public expect fun getCharacterPlacementA(hdc: Hdc, lpstring: Pcstr, ncount: Int, nmexextent: Int, lpresults: COpaquePointer?, dwflags: GetCharacterPlacementFlags): UInt

public expect fun getCharacterPlacementW(hdc: Hdc, lpstring: Pcwstr, ncount: Int, nmexextent: Int, lpresults: COpaquePointer?, dwflags: GetCharacterPlacementFlags): UInt

public expect fun getClipBox(hdc: Hdc, lprect: COpaquePointer?): GdiRegionType

public expect fun getClipRgn(hdc: Hdc, hrgn: Hrgn): Int

public expect fun getColorAdjustment(hdc: Hdc, lpca: COpaquePointer?): Bool

public expect fun getCurrentObject(hdc: Hdc, type: UInt): Hgdiobj

public expect fun getCurrentPositionEx(hdc: Hdc, lppt: COpaquePointer?): Bool

public expect fun getDC(hwnd: Hwnd): Hdc

public expect fun getDCBrushColor(hdc: Hdc): Colorref

public expect fun getDCEx(hwnd: Hwnd, hrgnclip: Hrgn, flags: GetDcxFlags): Hdc

public expect fun getDCOrgEx(hdc: Hdc, lppt: COpaquePointer?): Bool

public expect fun getDCPenColor(hdc: Hdc): Colorref

public expect fun getDIBColorTable(hdc: Hdc, istart: UInt, centries: UInt, prgbq: COpaquePointer?): UInt

public expect fun getDIBits(hdc: Hdc, hbm: Hbitmap, start: UInt, clines: UInt, lpvbits: COpaquePointer?, lpbmi: COpaquePointer?, usage: DibUsage): Int

public expect fun getDeviceCaps(hdc: Hdc, index: Int): Int

public expect fun getEnhMetaFileA(lpname: Pcstr): Henhmetafile

public expect fun getEnhMetaFileBits(hemf: Henhmetafile, nsize: UInt, lpdata: COpaquePointer?): UInt

public expect fun getEnhMetaFileDescriptionA(hemf: Henhmetafile, cchbuffer: UInt, lpdescription: Pstr): UInt

public expect fun getEnhMetaFileDescriptionW(hemf: Henhmetafile, cchbuffer: UInt, lpdescription: Pwstr): UInt

public expect fun getEnhMetaFileHeader(hemf: Henhmetafile, nsize: UInt, lpenhmetaheader: COpaquePointer?): UInt

public expect fun getEnhMetaFilePaletteEntries(hemf: Henhmetafile, nnumentries: UInt, lppaletteentries: COpaquePointer?): UInt

public expect fun getEnhMetaFileW(lpname: Pcwstr): Henhmetafile

public expect fun getFontData(hdc: Hdc, dwtable: UInt, dwoffset: UInt, pvbuffer: COpaquePointer?, cjbuffer: UInt): UInt

public expect fun getFontLanguageInfo(hdc: Hdc): UInt

public expect fun getFontUnicodeRanges(hdc: Hdc, lpgs: COpaquePointer?): UInt

public expect fun getGlyphIndicesA(hdc: Hdc, lpstr: Pcstr, c: Int, pgi: COpaquePointer?, fl: UInt): UInt

public expect fun getGlyphIndicesW(hdc: Hdc, lpstr: Pcwstr, c: Int, pgi: COpaquePointer?, fl: UInt): UInt

public expect fun getGlyphOutlineA(hdc: Hdc, uchar: UInt, fuformat: GetGlyphOutlineFormat, lpgm: COpaquePointer?, cjbuffer: UInt, pvbuffer: COpaquePointer?, lpmat2: COpaquePointer?): UInt

public expect fun getGlyphOutlineW(hdc: Hdc, uchar: UInt, fuformat: GetGlyphOutlineFormat, lpgm: COpaquePointer?, cjbuffer: UInt, pvbuffer: COpaquePointer?, lpmat2: COpaquePointer?): UInt

public expect fun getGraphicsMode(hdc: Hdc): Int

public expect fun getKerningPairsA(hdc: Hdc, npairs: UInt, lpkernpair: COpaquePointer?): UInt

public expect fun getKerningPairsW(hdc: Hdc, npairs: UInt, lpkernpair: COpaquePointer?): UInt

public expect fun getLayout(hdc: Hdc): UInt

public expect fun getMapMode(hdc: Hdc): HdcMapMode

public expect fun getMetaFileA(lpname: Pcstr): Hmetafile

public expect fun getMetaFileBitsEx(hmf: Hmetafile, cbbuffer: UInt, lpdata: COpaquePointer?): UInt

public expect fun getMetaFileW(lpname: Pcwstr): Hmetafile

public expect fun getMetaRgn(hdc: Hdc, hrgn: Hrgn): Int

public expect fun getMiterLimit(hdc: Hdc, plimit: COpaquePointer?): Bool

public expect fun getMonitorInfoA(hmonitor: Hmonitor, lpmi: COpaquePointer?): Bool

public expect fun getMonitorInfoW(hmonitor: Hmonitor, lpmi: COpaquePointer?): Bool

public expect fun getNearestColor(hdc: Hdc, color: Colorref): Colorref

public expect fun getNearestPaletteIndex(h: Hpalette, color: Colorref): UInt

public expect fun getObjectA(h: Hgdiobj, c: Int, pv: COpaquePointer?): Int

public expect fun getObjectType(h: Hgdiobj): UInt

public expect fun getObjectW(h: Hgdiobj, c: Int, pv: COpaquePointer?): Int

public expect fun getOutlineTextMetricsA(hdc: Hdc, cjcopy: UInt, potm: COpaquePointer?): UInt

public expect fun getOutlineTextMetricsW(hdc: Hdc, cjcopy: UInt, potm: COpaquePointer?): UInt

public expect fun getPaletteEntries(hpal: Hpalette, istart: UInt, centries: UInt, ppalentries: COpaquePointer?): UInt

public expect fun getPath(hdc: Hdc, apt: COpaquePointer?, aj: COpaquePointer?, cpt: Int): Int

public expect fun getPixel(hdc: Hdc, x: Int, y: Int): Colorref

public expect fun getPolyFillMode(hdc: Hdc): Int

public expect fun getROP2(hdc: Hdc): R2Mode

public expect fun getRandomRgn(hdc: Hdc, hrgn: Hrgn, i: Int): Int

public expect fun getRasterizerCaps(lpraststat: COpaquePointer?, cjbytes: UInt): Bool

public expect fun getRegionData(hrgn: Hrgn, ncount: UInt, lprgndata: COpaquePointer?): UInt

public expect fun getRgnBox(hrgn: Hrgn, lprc: COpaquePointer?): GdiRegionType

public expect fun getStockObject(i: GetStockObjectFlags): Hgdiobj

public expect fun getStretchBltMode(hdc: Hdc): Int

public expect fun getSysColor(nindex: SysColorIndex): UInt

public expect fun getSysColorBrush(nindex: SysColorIndex): Hbrush

public expect fun getSystemPaletteEntries(hdc: Hdc, istart: UInt, centries: UInt, ppalentries: COpaquePointer?): UInt

public expect fun getSystemPaletteUse(hdc: Hdc): UInt

public expect fun getTabbedTextExtentA(hdc: Hdc, lpstring: Pcstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: COpaquePointer?): UInt

public expect fun getTabbedTextExtentW(hdc: Hdc, lpstring: Pcwstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: COpaquePointer?): UInt

public expect fun getTextAlign(hdc: Hdc): TextAlignOptions

public expect fun getTextCharacterExtra(hdc: Hdc): Int

public expect fun getTextColor(hdc: Hdc): Colorref

public expect fun getTextExtentExPointA(hdc: Hdc, lpszstring: Pcstr, cchstring: Int, nmaxextent: Int, lpnfit: COpaquePointer?, lpndx: COpaquePointer?, lpsize: COpaquePointer?): Bool

public expect fun getTextExtentExPointI(hdc: Hdc, lpwszstring: COpaquePointer?, cwchstring: Int, nmaxextent: Int, lpnfit: COpaquePointer?, lpndx: COpaquePointer?, lpsize: COpaquePointer?): Bool

public expect fun getTextExtentExPointW(hdc: Hdc, lpszstring: Pcwstr, cchstring: Int, nmaxextent: Int, lpnfit: COpaquePointer?, lpndx: COpaquePointer?, lpsize: COpaquePointer?): Bool

public expect fun getTextExtentPoint32A(hdc: Hdc, lpstring: Pcstr, c: Int, psizl: COpaquePointer?): Bool

public expect fun getTextExtentPoint32W(hdc: Hdc, lpstring: Pcwstr, c: Int, psizl: COpaquePointer?): Bool

public expect fun getTextExtentPointA(hdc: Hdc, lpstring: Pcstr, c: Int, lpsz: COpaquePointer?): Bool

public expect fun getTextExtentPointI(hdc: Hdc, pgiin: COpaquePointer?, cgi: Int, psize: COpaquePointer?): Bool

public expect fun getTextExtentPointW(hdc: Hdc, lpstring: Pcwstr, c: Int, lpsz: COpaquePointer?): Bool

public expect fun getTextFaceA(hdc: Hdc, c: Int, lpname: Pstr): Int

public expect fun getTextFaceW(hdc: Hdc, c: Int, lpname: Pwstr): Int

public expect fun getTextMetricsA(hdc: Hdc, lptm: COpaquePointer?): Bool

public expect fun getTextMetricsW(hdc: Hdc, lptm: COpaquePointer?): Bool

public expect fun getUpdateRect(hwnd: Hwnd, lprect: COpaquePointer?, berase: Bool): Bool

public expect fun getUpdateRgn(hwnd: Hwnd, hrgn: Hrgn, berase: Bool): GdiRegionType

public expect fun getViewportExtEx(hdc: Hdc, lpsize: COpaquePointer?): Bool

public expect fun getViewportOrgEx(hdc: Hdc, lppoint: COpaquePointer?): Bool

public expect fun getWinMetaFileBits(hemf: Henhmetafile, cbdata16: UInt, pdata16: COpaquePointer?, imapmode: Int, hdcref: Hdc): UInt

public expect fun getWindowDC(hwnd: Hwnd): Hdc

public expect fun getWindowExtEx(hdc: Hdc, lpsize: COpaquePointer?): Bool

public expect fun getWindowOrgEx(hdc: Hdc, lppoint: COpaquePointer?): Bool

public expect fun getWindowRgn(hwnd: Hwnd, hrgn: Hrgn): GdiRegionType

public expect fun getWindowRgnBox(hwnd: Hwnd, lprc: COpaquePointer?): GdiRegionType

public expect fun getWorldTransform(hdc: Hdc, lpxf: COpaquePointer?): Bool

public expect fun gradientFill(hdc: Hdc, pvertex: COpaquePointer?, nvertex: UInt, pmesh: COpaquePointer?, nmesh: UInt, ulmode: GradientFill): Bool

public expect fun grayStringA(hdc: Hdc, hbrush: Hbrush, lpoutputfunc: Graystringproc, lpdata: Lparam, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): Bool

public expect fun grayStringW(hdc: Hdc, hbrush: Hbrush, lpoutputfunc: Graystringproc, lpdata: Lparam, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): Bool

public expect fun inflateRect(lprc: COpaquePointer?, dx: Int, dy: Int): Bool

public expect fun intersectClipRect(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): GdiRegionType

public expect fun intersectRect(lprcdst: COpaquePointer?, lprcsrc1: COpaquePointer?, lprcsrc2: COpaquePointer?): Bool

public expect fun invalidateRect(hwnd: Hwnd, lprect: COpaquePointer?, berase: Bool): Bool

public expect fun invalidateRgn(hwnd: Hwnd, hrgn: Hrgn, berase: Bool): Bool

public expect fun invertRect(hdc: Hdc, lprc: COpaquePointer?): Bool

public expect fun invertRgn(hdc: Hdc, hrgn: Hrgn): Bool

public expect fun isRectEmpty(lprc: COpaquePointer?): Bool

public expect fun lPtoDP(hdc: Hdc, lppt: COpaquePointer?, c: Int): Bool

public expect fun lineDDA(xstart: Int, ystart: Int, xend: Int, yend: Int, lpproc: Lineddaproc, data: Lparam): Bool

public expect fun lineTo(hdc: Hdc, x: Int, y: Int): Bool

public expect fun loadBitmapA(hinstance: Hinstance, lpbitmapname: Pcstr): Hbitmap

public expect fun loadBitmapW(hinstance: Hinstance, lpbitmapname: Pcwstr): Hbitmap

public expect fun lockWindowUpdate(hwndlock: Hwnd): Bool

public expect fun mapWindowPoints(hwndfrom: Hwnd, hwndto: Hwnd, lppoints: COpaquePointer?, cpoints: UInt): Int

public expect fun maskBlt(hdcdest: Hdc, xdest: Int, ydest: Int, width: Int, height: Int, hdcsrc: Hdc, xsrc: Int, ysrc: Int, hbmmask: Hbitmap, xmask: Int, ymask: Int, rop: UInt): Bool

public expect fun mergeFontPackage(puchmergefontbuffer: COpaquePointer?, ulmergefontbuffersize: UInt, puchfontpackagebuffer: COpaquePointer?, ulfontpackagebuffersize: UInt, ppuchdestbuffer: COpaquePointer?, puldestbuffersize: COpaquePointer?, pulbyteswritten: COpaquePointer?, usmode: UShort, lpfnallocate: CfpAllocproc, lpfnreallocate: CfpReallocproc, lpfnfree: CfpFreeproc, lpvreserved: COpaquePointer?): UInt

public expect fun modifyWorldTransform(hdc: Hdc, lpxf: COpaquePointer?, mode: ModifyWorldTransformMode): Bool

public expect fun monitorFromPoint(pt: Point, dwflags: MonitorFromFlags): Hmonitor

public expect fun monitorFromRect(lprc: COpaquePointer?, dwflags: MonitorFromFlags): Hmonitor

public expect fun monitorFromWindow(hwnd: Hwnd, dwflags: MonitorFromFlags): Hmonitor

public expect fun moveToEx(hdc: Hdc, x: Int, y: Int, lppt: COpaquePointer?): Bool

public expect fun offsetClipRgn(hdc: Hdc, x: Int, y: Int): GdiRegionType

public expect fun offsetRect(lprc: COpaquePointer?, dx: Int, dy: Int): Bool

public expect fun offsetRgn(hrgn: Hrgn, x: Int, y: Int): GdiRegionType

public expect fun offsetViewportOrgEx(hdc: Hdc, x: Int, y: Int, lppt: COpaquePointer?): Bool

public expect fun offsetWindowOrgEx(hdc: Hdc, x: Int, y: Int, lppt: COpaquePointer?): Bool

public expect fun paintDesktop(hdc: Hdc): Bool

public expect fun paintRgn(hdc: Hdc, hrgn: Hrgn): Bool

public expect fun patBlt(hdc: Hdc, x: Int, y: Int, w: Int, h: Int, rop: RopCode): Bool

public expect fun pathToRegion(hdc: Hdc): Hrgn

public expect fun pie(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): Bool

public expect fun playEnhMetaFile(hdc: Hdc, hmf: Henhmetafile, lprect: COpaquePointer?): Bool

public expect fun playEnhMetaFileRecord(hdc: Hdc, pht: COpaquePointer?, pmr: COpaquePointer?, cht: UInt): Bool

public expect fun playMetaFile(hdc: Hdc, hmf: Hmetafile): Bool

public expect fun playMetaFileRecord(hdc: Hdc, lphandletable: COpaquePointer?, lpmr: COpaquePointer?, noobjs: UInt): Bool

public expect fun plgBlt(hdcdest: Hdc, lppoint: COpaquePointer?, hdcsrc: Hdc, xsrc: Int, ysrc: Int, width: Int, height: Int, hbmmask: Hbitmap, xmask: Int, ymask: Int): Bool

public expect fun polyBezier(hdc: Hdc, apt: COpaquePointer?, cpt: UInt): Bool

public expect fun polyBezierTo(hdc: Hdc, apt: COpaquePointer?, cpt: UInt): Bool

public expect fun polyDraw(hdc: Hdc, apt: COpaquePointer?, aj: COpaquePointer?, cpt: Int): Bool

public expect fun polyPolygon(hdc: Hdc, apt: COpaquePointer?, asz: COpaquePointer?, csz: Int): Bool

public expect fun polyPolyline(hdc: Hdc, apt: COpaquePointer?, asz: COpaquePointer?, csz: UInt): Bool

public expect fun polyTextOutA(hdc: Hdc, ppt: COpaquePointer?, nstrings: Int): Bool

public expect fun polyTextOutW(hdc: Hdc, ppt: COpaquePointer?, nstrings: Int): Bool

public expect fun polygon(hdc: Hdc, apt: COpaquePointer?, cpt: Int): Bool

public expect fun polyline(hdc: Hdc, apt: COpaquePointer?, cpt: Int): Bool

public expect fun polylineTo(hdc: Hdc, apt: COpaquePointer?, cpt: UInt): Bool

public expect fun ptInRect(lprc: COpaquePointer?, pt: Point): Bool

public expect fun ptInRegion(hrgn: Hrgn, x: Int, y: Int): Bool

public expect fun ptVisible(hdc: Hdc, x: Int, y: Int): Bool

public expect fun realizePalette(hdc: Hdc): UInt

public expect fun rectInRegion(hrgn: Hrgn, lprect: COpaquePointer?): Bool

public expect fun rectVisible(hdc: Hdc, lprect: COpaquePointer?): Bool

public expect fun rectangle(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): Bool

public expect fun redrawWindow(hwnd: Hwnd, lprcupdate: COpaquePointer?, hrgnupdate: Hrgn, flags: RedrawWindowFlags): Bool

public expect fun releaseDC(hwnd: Hwnd, hdc: Hdc): Int

public expect fun removeFontMemResourceEx(h: Handle): Bool

public expect fun removeFontResourceA(lpfilename: Pcstr): Bool

public expect fun removeFontResourceExA(name: Pcstr, fl: UInt, pdv: COpaquePointer?): Bool

public expect fun removeFontResourceExW(name: Pcwstr, fl: UInt, pdv: COpaquePointer?): Bool

public expect fun removeFontResourceW(lpfilename: Pcwstr): Bool

public expect fun resetDCA(hdc: Hdc, lpdm: COpaquePointer?): Hdc

public expect fun resetDCW(hdc: Hdc, lpdm: COpaquePointer?): Hdc

public expect fun resizePalette(hpal: Hpalette, n: UInt): Bool

public expect fun restoreDC(hdc: Hdc, nsaveddc: Int): Bool

public expect fun roundRect(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int, width: Int, height: Int): Bool

public expect fun saveDC(hdc: Hdc): Int

public expect fun scaleViewportExtEx(hdc: Hdc, xn: Int, dx: Int, yn: Int, yd: Int, lpsz: COpaquePointer?): Bool

public expect fun scaleWindowExtEx(hdc: Hdc, xn: Int, xd: Int, yn: Int, yd: Int, lpsz: COpaquePointer?): Bool

public expect fun screenToClient(hwnd: Hwnd, lppoint: COpaquePointer?): Bool

public expect fun selectClipPath(hdc: Hdc, mode: RgnCombineMode): Bool

public expect fun selectClipRgn(hdc: Hdc, hrgn: Hrgn): GdiRegionType

public expect fun selectObject(hdc: Hdc, h: Hgdiobj): Hgdiobj

public expect fun selectPalette(hdc: Hdc, hpal: Hpalette, bforcebkgd: Bool): Hpalette

public expect fun setArcDirection(hdc: Hdc, dir: ArcDirection): Int

public expect fun setBitmapBits(hbm: Hbitmap, cb: UInt, pvbits: COpaquePointer?): Int

public expect fun setBitmapDimensionEx(hbm: Hbitmap, w: Int, h: Int, lpsz: COpaquePointer?): Bool

public expect fun setBkColor(hdc: Hdc, color: Colorref): Colorref

public expect fun setBkMode(hdc: Hdc, mode: Int): Int

public expect fun setBoundsRect(hdc: Hdc, lprect: COpaquePointer?, flags: SetBoundsRectFlags): UInt

public expect fun setBrushOrgEx(hdc: Hdc, x: Int, y: Int, lppt: COpaquePointer?): Bool

public expect fun setColorAdjustment(hdc: Hdc, lpca: COpaquePointer?): Bool

public expect fun setDCBrushColor(hdc: Hdc, color: Colorref): Colorref

public expect fun setDCPenColor(hdc: Hdc, color: Colorref): Colorref

public expect fun setDIBColorTable(hdc: Hdc, istart: UInt, centries: UInt, prgbq: COpaquePointer?): UInt

public expect fun setDIBits(hdc: Hdc, hbm: Hbitmap, start: UInt, clines: UInt, lpbits: COpaquePointer?, lpbmi: COpaquePointer?, coloruse: DibUsage): Int

public expect fun setDIBitsToDevice(hdc: Hdc, xdest: Int, ydest: Int, w: UInt, h: UInt, xsrc: Int, ysrc: Int, startscan: UInt, clines: UInt, lpvbits: COpaquePointer?, lpbmi: COpaquePointer?, coloruse: DibUsage): Int

public expect fun setEnhMetaFileBits(nsize: UInt, pb: COpaquePointer?): Henhmetafile

public expect fun setGraphicsMode(hdc: Hdc, imode: GraphicsMode): Int

public expect fun setLayout(hdc: Hdc, l: DcLayout): UInt

public expect fun setMapMode(hdc: Hdc, imode: HdcMapMode): Int

public expect fun setMapperFlags(hdc: Hdc, flags: UInt): UInt

public expect fun setMetaFileBitsEx(cbbuffer: UInt, lpdata: COpaquePointer?): Hmetafile

public expect fun setMetaRgn(hdc: Hdc): GdiRegionType

public expect fun setMiterLimit(hdc: Hdc, limit: Float, old: COpaquePointer?): Bool

public expect fun setPaletteEntries(hpal: Hpalette, istart: UInt, centries: UInt, ppalentries: COpaquePointer?): UInt

public expect fun setPixel(hdc: Hdc, x: Int, y: Int, color: Colorref): Colorref

public expect fun setPixelV(hdc: Hdc, x: Int, y: Int, color: Colorref): Bool

public expect fun setPolyFillMode(hdc: Hdc, mode: CreatePolygonRgnMode): Int

public expect fun setROP2(hdc: Hdc, rop2: R2Mode): Int

public expect fun setRect(lprc: COpaquePointer?, xleft: Int, ytop: Int, xright: Int, ybottom: Int): Bool

public expect fun setRectEmpty(lprc: COpaquePointer?): Bool

public expect fun setRectRgn(hrgn: Hrgn, left: Int, top: Int, right: Int, bottom: Int): Bool

public expect fun setStretchBltMode(hdc: Hdc, mode: StretchBltMode): Int

public expect fun setSysColors(celements: Int, lpaelements: COpaquePointer?, lpargbvalues: COpaquePointer?): Bool

public expect fun setSystemPaletteUse(hdc: Hdc, use: SystemPaletteUse): UInt

public expect fun setTextAlign(hdc: Hdc, align: TextAlignOptions): UInt

public expect fun setTextCharacterExtra(hdc: Hdc, extra: Int): Int

public expect fun setTextColor(hdc: Hdc, color: Colorref): Colorref

public expect fun setTextJustification(hdc: Hdc, extra: Int, count: Int): Bool

public expect fun setViewportExtEx(hdc: Hdc, x: Int, y: Int, lpsz: COpaquePointer?): Bool

public expect fun setViewportOrgEx(hdc: Hdc, x: Int, y: Int, lppt: COpaquePointer?): Bool

public expect fun setWindowExtEx(hdc: Hdc, x: Int, y: Int, lpsz: COpaquePointer?): Bool

public expect fun setWindowOrgEx(hdc: Hdc, x: Int, y: Int, lppt: COpaquePointer?): Bool

public expect fun setWindowRgn(hwnd: Hwnd, hrgn: Hrgn, bredraw: Bool): Int

public expect fun setWorldTransform(hdc: Hdc, lpxf: COpaquePointer?): Bool

public expect fun stretchBlt(hdcdest: Hdc, xdest: Int, ydest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xsrc: Int, ysrc: Int, wsrc: Int, hsrc: Int, rop: RopCode): Bool

public expect fun stretchDIBits(hdc: Hdc, xdest: Int, ydest: Int, destwidth: Int, destheight: Int, xsrc: Int, ysrc: Int, srcwidth: Int, srcheight: Int, lpbits: COpaquePointer?, lpbmi: COpaquePointer?, iusage: DibUsage, rop: RopCode): Int

public expect fun strokeAndFillPath(hdc: Hdc): Bool

public expect fun strokePath(hdc: Hdc): Bool

public expect fun subtractRect(lprcdst: COpaquePointer?, lprcsrc1: COpaquePointer?, lprcsrc2: COpaquePointer?): Bool

public expect fun tTCharToUnicode(hdc: Hdc, puccharcodes: COpaquePointer?, ulcharcodesize: UInt, pusshortcodes: COpaquePointer?, ulshortcodesize: UInt, ulflags: UInt): Int

public expect fun tTDeleteEmbeddedFont(hfontreference: Handle, ulflags: UInt, pulstatus: COpaquePointer?): Int

public expect fun tTEmbedFont(hdc: Hdc, ulflags: TtembedFlags, ulcharset: EmbedFontCharset, pulprivstatus: COpaquePointer?, pulstatus: COpaquePointer?, lpfnwritetostream: Writeembedproc, lpvwritestream: COpaquePointer?, puscharcodeset: COpaquePointer?, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: COpaquePointer?): Int

public expect fun tTEmbedFontEx(hdc: Hdc, ulflags: TtembedFlags, ulcharset: EmbedFontCharset, pulprivstatus: COpaquePointer?, pulstatus: COpaquePointer?, lpfnwritetostream: Writeembedproc, lpvwritestream: COpaquePointer?, pulcharcodeset: COpaquePointer?, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: COpaquePointer?): Int

public expect fun tTEmbedFontFromFileA(hdc: Hdc, szfontfilename: Pcstr, usttcindex: UShort, ulflags: TtembedFlags, ulcharset: EmbedFontCharset, pulprivstatus: COpaquePointer?, pulstatus: COpaquePointer?, lpfnwritetostream: Writeembedproc, lpvwritestream: COpaquePointer?, puscharcodeset: COpaquePointer?, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: COpaquePointer?): Int

public expect fun tTEnableEmbeddingForFacename(lpszfacename: Pcstr, benable: Bool): Int

public expect fun tTGetEmbeddedFontInfo(ulflags: TtembedFlags, pulprivstatus: COpaquePointer?, ulprivs: FontLicensePrivs, pulstatus: COpaquePointer?, lpfnreadfromstream: Readembedproc, lpvreadstream: COpaquePointer?, pttloadinfo: COpaquePointer?): Int

public expect fun tTGetEmbeddingType(hdc: Hdc, pulembedtype: COpaquePointer?): Int

public expect fun tTGetNewFontName(phfontreference: COpaquePointer?, wzwinfamilyname: Pwstr, cchmaxwinname: Int, szmacfamilyname: Pstr, cchmaxmacname: Int): Int

public expect fun tTIsEmbeddingEnabled(hdc: Hdc, pbenabled: COpaquePointer?): Int

public expect fun tTIsEmbeddingEnabledForFacename(lpszfacename: Pcstr, pbenabled: COpaquePointer?): Int

public expect fun tTLoadEmbeddedFont(phfontreference: COpaquePointer?, ulflags: UInt, pulprivstatus: COpaquePointer?, ulprivs: FontLicensePrivs, pulstatus: COpaquePointer?, lpfnreadfromstream: Readembedproc, lpvreadstream: COpaquePointer?, szwinfamilyname: Pcwstr, szmacfamilyname: Pcstr, pttloadinfo: COpaquePointer?): Int

public expect fun tTRunValidationTests(hdc: Hdc, ptestparam: COpaquePointer?): Int

public expect fun tTRunValidationTestsEx(hdc: Hdc, ptestparam: COpaquePointer?): Int

public expect fun tabbedTextOutA(hdc: Hdc, x: Int, y: Int, lpstring: Pcstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: COpaquePointer?, ntaborigin: Int): Int

public expect fun tabbedTextOutW(hdc: Hdc, x: Int, y: Int, lpstring: Pcwstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: COpaquePointer?, ntaborigin: Int): Int

public expect fun textOutA(hdc: Hdc, x: Int, y: Int, lpstring: Pcstr, c: Int): Bool

public expect fun textOutW(hdc: Hdc, x: Int, y: Int, lpstring: Pcwstr, c: Int): Bool

public expect fun transparentBlt(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: UInt): Bool

public expect fun unionRect(lprcdst: COpaquePointer?, lprcsrc1: COpaquePointer?, lprcsrc2: COpaquePointer?): Bool

public expect fun unrealizeObject(h: Hgdiobj): Bool

public expect fun updateColors(hdc: Hdc): Bool

public expect fun updateWindow(hwnd: Hwnd): Bool

public expect fun validateRect(hwnd: Hwnd, lprect: COpaquePointer?): Bool

public expect fun validateRgn(hwnd: Hwnd, hrgn: Hrgn): Bool

public expect fun widenPath(hdc: Hdc): Bool

public expect fun windowFromDC(hdc: Hdc): Hwnd

public expect fun wglSwapMultipleBuffers(param0: UInt, param1: COpaquePointer?): UInt
