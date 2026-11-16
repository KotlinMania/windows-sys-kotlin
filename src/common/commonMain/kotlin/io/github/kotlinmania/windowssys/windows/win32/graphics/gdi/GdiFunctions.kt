package io.github.kotlinmania.windowssys.windows.win32.graphics.gdi

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

public expect fun addFontMemResourceEx(pfileview: ConstPtr, cjsize: UInt, pvresrved: ConstPtr, pnumfonts: ConstPtr): Handle

public expect fun addFontResourceA(param0: Pcstr): Int

public expect fun addFontResourceExA(name: Pcstr, fl: FontResourceCharacteristics, res: ConstPtr): Int

public expect fun addFontResourceExW(name: Pcwstr, fl: FontResourceCharacteristics, res: ConstPtr): Int

public expect fun addFontResourceW(param0: Pcwstr): Int

public expect fun alphaBlend(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, ftn: Blendfunction): Bool

public expect fun angleArc(hdc: Hdc, x: Int, y: Int, r: UInt, startangle: Float, sweepangle: Float): Bool

public expect fun animatePalette(hpal: Hpalette, istartindex: UInt, centries: UInt, ppe: ConstPtr): Bool

public expect fun arc(hdc: Hdc, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Bool

public expect fun arcTo(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): Bool

public expect fun beginPaint(hwnd: Hwnd, lppaint: MutPtr): Hdc

public expect fun beginPath(hdc: Hdc): Bool

public expect fun bitBlt(hdc: Hdc, x: Int, y: Int, cx: Int, cy: Int, hdcsrc: Hdc, x1: Int, y1: Int, rop: RopCode): Bool

public expect fun cancelDC(hdc: Hdc): Bool

public expect fun changeDisplaySettingsA(lpdevmode: ConstPtr, dwflags: CdsType): DispChange

public expect fun changeDisplaySettingsExA(lpszdevicename: Pcstr, lpdevmode: ConstPtr, hwnd: Hwnd, dwflags: CdsType, lparam: ConstPtr): DispChange

public expect fun changeDisplaySettingsExW(lpszdevicename: Pcwstr, lpdevmode: ConstPtr, hwnd: Hwnd, dwflags: CdsType, lparam: ConstPtr): DispChange

public expect fun changeDisplaySettingsW(lpdevmode: ConstPtr, dwflags: CdsType): DispChange

public expect fun chord(hdc: Hdc, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Bool

public expect fun clientToScreen(hwnd: Hwnd, lppoint: MutPtr): Bool

public expect fun closeEnhMetaFile(hdc: Hdc): Henhmetafile

public expect fun closeFigure(hdc: Hdc): Bool

public expect fun closeMetaFile(hdc: Hdc): Hmetafile

public expect fun combineRgn(hrgndst: Hrgn, hrgnsrc1: Hrgn, hrgnsrc2: Hrgn, imode: RgnCombineMode): GdiRegionType

public expect fun combineTransform(lpxfout: MutPtr, lpxf1: ConstPtr, lpxf2: ConstPtr): Bool

public expect fun copyEnhMetaFileA(henh: Henhmetafile, lpfilename: Pcstr): Henhmetafile

public expect fun copyEnhMetaFileW(henh: Henhmetafile, lpfilename: Pcwstr): Henhmetafile

public expect fun copyMetaFileA(param0: Hmetafile, param1: Pcstr): Hmetafile

public expect fun copyMetaFileW(param0: Hmetafile, param1: Pcwstr): Hmetafile

public expect fun copyRect(lprcdst: MutPtr, lprcsrc: ConstPtr): Bool

public expect fun createBitmap(nwidth: Int, nheight: Int, nplanes: UInt, nbitcount: UInt, lpbits: ConstPtr): Hbitmap

public expect fun createBitmapIndirect(pbm: ConstPtr): Hbitmap

public expect fun createBrushIndirect(plbrush: ConstPtr): Hbrush

public expect fun createCompatibleBitmap(hdc: Hdc, cx: Int, cy: Int): Hbitmap

public expect fun createCompatibleDC(hdc: Hdc): Hdc

public expect fun createDCA(pwszdriver: Pcstr, pwszdevice: Pcstr, pszport: Pcstr, pdm: ConstPtr): Hdc

public expect fun createDCW(pwszdriver: Pcwstr, pwszdevice: Pcwstr, pszport: Pcwstr, pdm: ConstPtr): Hdc

public expect fun createDIBPatternBrush(h: Hglobal, iusage: DibUsage): Hbrush

public expect fun createDIBPatternBrushPt(lppackeddib: ConstPtr, iusage: DibUsage): Hbrush

public expect fun createDIBSection(hdc: Hdc, pbmi: ConstPtr, usage: DibUsage, ppvbits: MutPtr, hsection: Handle, offset: UInt): Hbitmap

public expect fun createDIBitmap(hdc: Hdc, pbmih: ConstPtr, flinit: UInt, pjbits: ConstPtr, pbmi: ConstPtr, iusage: DibUsage): Hbitmap

public expect fun createDiscardableBitmap(hdc: Hdc, cx: Int, cy: Int): Hbitmap

public expect fun createEllipticRgn(x1: Int, y1: Int, x2: Int, y2: Int): Hrgn

public expect fun createEllipticRgnIndirect(lprect: ConstPtr): Hrgn

public expect fun createEnhMetaFileA(hdc: Hdc, lpfilename: Pcstr, lprc: ConstPtr, lpdesc: Pcstr): Hdc

public expect fun createEnhMetaFileW(hdc: Hdc, lpfilename: Pcwstr, lprc: ConstPtr, lpdesc: Pcwstr): Hdc

public expect fun createFontA(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: UInt, bunderline: UInt, bstrikeout: UInt, icharset: UInt, ioutprecision: UInt, iclipprecision: UInt, iquality: UInt, ipitchandfamily: UInt, pszfacename: Pcstr): Hfont

public expect fun createFontIndirectA(lplf: ConstPtr): Hfont

public expect fun createFontIndirectExA(param0: ConstPtr): Hfont

public expect fun createFontIndirectExW(param0: ConstPtr): Hfont

public expect fun createFontIndirectW(lplf: ConstPtr): Hfont

public expect fun createFontPackage(puchsrcbuffer: ConstPtr, ulsrcbuffersize: UInt, ppuchfontpackagebuffer: MutPtr, pulfontpackagebuffersize: MutPtr, pulbyteswritten: MutPtr, usflag: UShort, usttcindex: UShort, ussubsetformat: UShort, ussubsetlanguage: UShort, ussubsetplatform: CreateFontPackageSubsetPlatform, ussubsetencoding: CreateFontPackageSubsetEncoding, pussubsetkeeplist: ConstPtr, ussubsetlistcount: UShort, lpfnallocate: CfpAllocproc, lpfnreallocate: CfpReallocproc, lpfnfree: CfpFreeproc, lpvreserved: MutPtr): UInt

public expect fun createFontW(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: UInt, bunderline: UInt, bstrikeout: UInt, icharset: UInt, ioutprecision: UInt, iclipprecision: UInt, iquality: UInt, ipitchandfamily: UInt, pszfacename: Pcwstr): Hfont

public expect fun createHalftonePalette(hdc: Hdc): Hpalette

public expect fun createHatchBrush(ihatch: HatchBrushStyle, color: Colorref): Hbrush

public expect fun createICA(pszdriver: Pcstr, pszdevice: Pcstr, pszport: Pcstr, pdm: ConstPtr): Hdc

public expect fun createICW(pszdriver: Pcwstr, pszdevice: Pcwstr, pszport: Pcwstr, pdm: ConstPtr): Hdc

public expect fun createMetaFileA(pszfile: Pcstr): Hdc

public expect fun createMetaFileW(pszfile: Pcwstr): Hdc

public expect fun createPalette(plpal: ConstPtr): Hpalette

public expect fun createPatternBrush(hbm: Hbitmap): Hbrush

public expect fun createPen(istyle: PenStyle, cwidth: Int, color: Colorref): Hpen

public expect fun createPenIndirect(plpen: ConstPtr): Hpen

public expect fun createPolyPolygonRgn(pptl: ConstPtr, pc: ConstPtr, cpoly: Int, imode: CreatePolygonRgnMode): Hrgn

public expect fun createPolygonRgn(pptl: ConstPtr, cpoint: Int, imode: CreatePolygonRgnMode): Hrgn

public expect fun createRectRgn(x1: Int, y1: Int, x2: Int, y2: Int): Hrgn

public expect fun createRectRgnIndirect(lprect: ConstPtr): Hrgn

public expect fun createRoundRectRgn(x1: Int, y1: Int, x2: Int, y2: Int, w: Int, h: Int): Hrgn

public expect fun createScalableFontResourceA(fdwhidden: UInt, lpszfont: Pcstr, lpszfile: Pcstr, lpszpath: Pcstr): Bool

public expect fun createScalableFontResourceW(fdwhidden: UInt, lpszfont: Pcwstr, lpszfile: Pcwstr, lpszpath: Pcwstr): Bool

public expect fun createSolidBrush(color: Colorref): Hbrush

public expect fun dPtoLP(hdc: Hdc, lppt: MutPtr, c: Int): Bool

public expect fun deleteDC(hdc: Hdc): Bool

public expect fun deleteEnhMetaFile(hmf: Henhmetafile): Bool

public expect fun deleteMetaFile(hmf: Hmetafile): Bool

public expect fun deleteObject(ho: Hgdiobj): Bool

public expect fun drawAnimatedRects(hwnd: Hwnd, idani: Int, lprcfrom: ConstPtr, lprcto: ConstPtr): Bool

public expect fun drawCaption(hwnd: Hwnd, hdc: Hdc, lprect: ConstPtr, flags: DrawCaptionFlags): Bool

public expect fun drawEdge(hdc: Hdc, qrc: MutPtr, edge: DrawedgeFlags, grfflags: DrawEdgeFlags): Bool

public expect fun drawEscape(hdc: Hdc, iescape: Int, cjin: Int, lpin: Pcstr): Int

public expect fun drawFocusRect(hdc: Hdc, lprc: ConstPtr): Bool

public expect fun drawFrameControl(param0: Hdc, param1: MutPtr, param2: DfcType, param3: DfcsState): Bool

public expect fun drawStateA(hdc: Hdc, hbrfore: Hbrush, qfncallback: Drawstateproc, ldata: Lparam, wdata: Wparam, x: Int, y: Int, cx: Int, cy: Int, uflags: DrawstateFlags): Bool

public expect fun drawStateW(hdc: Hdc, hbrfore: Hbrush, qfncallback: Drawstateproc, ldata: Lparam, wdata: Wparam, x: Int, y: Int, cx: Int, cy: Int, uflags: DrawstateFlags): Bool

public expect fun drawTextA(hdc: Hdc, lpchtext: Pcstr, cchtext: Int, lprc: MutPtr, format: DrawTextFormat): Int

public expect fun drawTextExA(hdc: Hdc, lpchtext: Pstr, cchtext: Int, lprc: MutPtr, format: DrawTextFormat, lpdtp: ConstPtr): Int

public expect fun drawTextExW(hdc: Hdc, lpchtext: Pwstr, cchtext: Int, lprc: MutPtr, format: DrawTextFormat, lpdtp: ConstPtr): Int

public expect fun drawTextW(hdc: Hdc, lpchtext: Pcwstr, cchtext: Int, lprc: MutPtr, format: DrawTextFormat): Int

public expect fun ellipse(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): Bool

public expect fun endPaint(hwnd: Hwnd, lppaint: ConstPtr): Bool

public expect fun endPath(hdc: Hdc): Bool

public expect fun enumDisplayDevicesA(lpdevice: Pcstr, idevnum: UInt, lpdisplaydevice: MutPtr, dwflags: UInt): Bool

public expect fun enumDisplayDevicesW(lpdevice: Pcwstr, idevnum: UInt, lpdisplaydevice: MutPtr, dwflags: UInt): Bool

public expect fun enumDisplayMonitors(hdc: Hdc, lprcclip: ConstPtr, lpfnenum: Monitorenumproc, dwdata: Lparam): Bool

public expect fun enumDisplaySettingsA(lpszdevicename: Pcstr, imodenum: EnumDisplaySettingsMode, lpdevmode: MutPtr): Bool

public expect fun enumDisplaySettingsExA(lpszdevicename: Pcstr, imodenum: EnumDisplaySettingsMode, lpdevmode: MutPtr, dwflags: EnumDisplaySettingsFlags): Bool

public expect fun enumDisplaySettingsExW(lpszdevicename: Pcwstr, imodenum: EnumDisplaySettingsMode, lpdevmode: MutPtr, dwflags: EnumDisplaySettingsFlags): Bool

public expect fun enumDisplaySettingsW(lpszdevicename: Pcwstr, imodenum: EnumDisplaySettingsMode, lpdevmode: MutPtr): Bool

public expect fun enumEnhMetaFile(hdc: Hdc, hmf: Henhmetafile, proc: Enhmfenumproc, param3: ConstPtr, lprect: ConstPtr): Bool

public expect fun enumFontFamiliesA(hdc: Hdc, lplogfont: Pcstr, lpproc: Fontenumproca, lparam: Lparam): Int

public expect fun enumFontFamiliesExA(hdc: Hdc, lplogfont: ConstPtr, lpproc: Fontenumproca, lparam: Lparam, dwflags: UInt): Int

public expect fun enumFontFamiliesExW(hdc: Hdc, lplogfont: ConstPtr, lpproc: Fontenumprocw, lparam: Lparam, dwflags: UInt): Int

public expect fun enumFontFamiliesW(hdc: Hdc, lplogfont: Pcwstr, lpproc: Fontenumprocw, lparam: Lparam): Int

public expect fun enumFontsA(hdc: Hdc, lplogfont: Pcstr, lpproc: Fontenumproca, lparam: Lparam): Int

public expect fun enumFontsW(hdc: Hdc, lplogfont: Pcwstr, lpproc: Fontenumprocw, lparam: Lparam): Int

public expect fun enumMetaFile(hdc: Hdc, hmf: Hmetafile, proc: Mfenumproc, param3: Lparam): Bool

public expect fun enumObjects(hdc: Hdc, ntype: ObjType, lpfunc: Gobjenumproc, lparam: Lparam): Int

public expect fun equalRect(lprc1: ConstPtr, lprc2: ConstPtr): Bool

public expect fun equalRgn(hrgn1: Hrgn, hrgn2: Hrgn): Bool

public expect fun excludeClipRect(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): GdiRegionType

public expect fun excludeUpdateRgn(hdc: Hdc, hwnd: Hwnd): Int

public expect fun extCreatePen(ipenstyle: UInt, cwidth: UInt, plbrush: ConstPtr, cstyle: UInt, pstyle: ConstPtr): Hpen

public expect fun extCreateRegion(lpx: ConstPtr, ncount: UInt, lpdata: ConstPtr): Hrgn

public expect fun extFloodFill(hdc: Hdc, x: Int, y: Int, color: Colorref, type: ExtFloodFillType): Bool

public expect fun extSelectClipRgn(hdc: Hdc, hrgn: Hrgn, mode: RgnCombineMode): GdiRegionType

public expect fun extTextOutA(hdc: Hdc, x: Int, y: Int, options: EtoOptions, lprect: ConstPtr, lpstring: Pcstr, c: UInt, lpdx: ConstPtr): Bool

public expect fun extTextOutW(hdc: Hdc, x: Int, y: Int, options: EtoOptions, lprect: ConstPtr, lpstring: Pcwstr, c: UInt, lpdx: ConstPtr): Bool

public expect fun fillPath(hdc: Hdc): Bool

public expect fun fillRect(hdc: Hdc, lprc: ConstPtr, hbr: Hbrush): Int

public expect fun fillRgn(hdc: Hdc, hrgn: Hrgn, hbr: Hbrush): Bool

public expect fun fixBrushOrgEx(hdc: Hdc, x: Int, y: Int, ptl: ConstPtr): Bool

public expect fun flattenPath(hdc: Hdc): Bool

public expect fun floodFill(hdc: Hdc, x: Int, y: Int, color: Colorref): Bool

public expect fun frameRect(hdc: Hdc, lprc: ConstPtr, hbr: Hbrush): Int

public expect fun frameRgn(hdc: Hdc, hrgn: Hrgn, hbr: Hbrush, w: Int, h: Int): Bool

public expect fun gdiAlphaBlend(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, ftn: Blendfunction): Bool

public expect fun gdiComment(hdc: Hdc, nsize: UInt, lpdata: ConstPtr): Bool

public expect fun gdiFlush(): Bool

public expect fun gdiGetBatchLimit(): UInt

public expect fun gdiGradientFill(hdc: Hdc, pvertex: ConstPtr, nvertex: UInt, pmesh: ConstPtr, ncount: UInt, ulmode: GradientFill): Bool

public expect fun gdiSetBatchLimit(dw: UInt): UInt

public expect fun gdiTransparentBlt(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: UInt): Bool

public expect fun getArcDirection(hdc: Hdc): Int

public expect fun getAspectRatioFilterEx(hdc: Hdc, lpsize: MutPtr): Bool

public expect fun getBitmapBits(hbit: Hbitmap, cb: Int, lpvbits: MutPtr): Int

public expect fun getBitmapDimensionEx(hbit: Hbitmap, lpsize: MutPtr): Bool

public expect fun getBkColor(hdc: Hdc): Colorref

public expect fun getBkMode(hdc: Hdc): Int

public expect fun getBoundsRect(hdc: Hdc, lprect: MutPtr, flags: UInt): UInt

public expect fun getBrushOrgEx(hdc: Hdc, lppt: MutPtr): Bool

public expect fun getCharABCWidthsA(hdc: Hdc, wfirst: UInt, wlast: UInt, lpabc: MutPtr): Bool

public expect fun getCharABCWidthsFloatA(hdc: Hdc, ifirst: UInt, ilast: UInt, lpabc: MutPtr): Bool

public expect fun getCharABCWidthsFloatW(hdc: Hdc, ifirst: UInt, ilast: UInt, lpabc: MutPtr): Bool

public expect fun getCharABCWidthsI(hdc: Hdc, gifirst: UInt, cgi: UInt, pgi: ConstPtr, pabc: MutPtr): Bool

public expect fun getCharABCWidthsW(hdc: Hdc, wfirst: UInt, wlast: UInt, lpabc: MutPtr): Bool

public expect fun getCharWidth32A(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: MutPtr): Bool

public expect fun getCharWidth32W(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: MutPtr): Bool

public expect fun getCharWidthA(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: MutPtr): Bool

public expect fun getCharWidthFloatA(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: MutPtr): Bool

public expect fun getCharWidthFloatW(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: MutPtr): Bool

public expect fun getCharWidthI(hdc: Hdc, gifirst: UInt, cgi: UInt, pgi: ConstPtr, piwidths: MutPtr): Bool

public expect fun getCharWidthW(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: MutPtr): Bool

public expect fun getCharacterPlacementA(hdc: Hdc, lpstring: Pcstr, ncount: Int, nmexextent: Int, lpresults: MutPtr, dwflags: GetCharacterPlacementFlags): UInt

public expect fun getCharacterPlacementW(hdc: Hdc, lpstring: Pcwstr, ncount: Int, nmexextent: Int, lpresults: MutPtr, dwflags: GetCharacterPlacementFlags): UInt

public expect fun getClipBox(hdc: Hdc, lprect: MutPtr): GdiRegionType

public expect fun getClipRgn(hdc: Hdc, hrgn: Hrgn): Int

public expect fun getColorAdjustment(hdc: Hdc, lpca: MutPtr): Bool

public expect fun getCurrentObject(hdc: Hdc, type: UInt): Hgdiobj

public expect fun getCurrentPositionEx(hdc: Hdc, lppt: MutPtr): Bool

public expect fun getDC(hwnd: Hwnd): Hdc

public expect fun getDCBrushColor(hdc: Hdc): Colorref

public expect fun getDCEx(hwnd: Hwnd, hrgnclip: Hrgn, flags: GetDcxFlags): Hdc

public expect fun getDCOrgEx(hdc: Hdc, lppt: MutPtr): Bool

public expect fun getDCPenColor(hdc: Hdc): Colorref

public expect fun getDIBColorTable(hdc: Hdc, istart: UInt, centries: UInt, prgbq: MutPtr): UInt

public expect fun getDIBits(hdc: Hdc, hbm: Hbitmap, start: UInt, clines: UInt, lpvbits: MutPtr, lpbmi: MutPtr, usage: DibUsage): Int

public expect fun getDeviceCaps(hdc: Hdc, index: Int): Int

public expect fun getEnhMetaFileA(lpname: Pcstr): Henhmetafile

public expect fun getEnhMetaFileBits(hemf: Henhmetafile, nsize: UInt, lpdata: MutPtr): UInt

public expect fun getEnhMetaFileDescriptionA(hemf: Henhmetafile, cchbuffer: UInt, lpdescription: Pstr): UInt

public expect fun getEnhMetaFileDescriptionW(hemf: Henhmetafile, cchbuffer: UInt, lpdescription: Pwstr): UInt

public expect fun getEnhMetaFileHeader(hemf: Henhmetafile, nsize: UInt, lpenhmetaheader: MutPtr): UInt

public expect fun getEnhMetaFilePaletteEntries(hemf: Henhmetafile, nnumentries: UInt, lppaletteentries: MutPtr): UInt

public expect fun getEnhMetaFileW(lpname: Pcwstr): Henhmetafile

public expect fun getFontData(hdc: Hdc, dwtable: UInt, dwoffset: UInt, pvbuffer: MutPtr, cjbuffer: UInt): UInt

public expect fun getFontLanguageInfo(hdc: Hdc): UInt

public expect fun getFontUnicodeRanges(hdc: Hdc, lpgs: MutPtr): UInt

public expect fun getGlyphIndicesA(hdc: Hdc, lpstr: Pcstr, c: Int, pgi: MutPtr, fl: UInt): UInt

public expect fun getGlyphIndicesW(hdc: Hdc, lpstr: Pcwstr, c: Int, pgi: MutPtr, fl: UInt): UInt

public expect fun getGlyphOutlineA(hdc: Hdc, uchar: UInt, fuformat: GetGlyphOutlineFormat, lpgm: MutPtr, cjbuffer: UInt, pvbuffer: MutPtr, lpmat2: ConstPtr): UInt

public expect fun getGlyphOutlineW(hdc: Hdc, uchar: UInt, fuformat: GetGlyphOutlineFormat, lpgm: MutPtr, cjbuffer: UInt, pvbuffer: MutPtr, lpmat2: ConstPtr): UInt

public expect fun getGraphicsMode(hdc: Hdc): Int

public expect fun getKerningPairsA(hdc: Hdc, npairs: UInt, lpkernpair: MutPtr): UInt

public expect fun getKerningPairsW(hdc: Hdc, npairs: UInt, lpkernpair: MutPtr): UInt

public expect fun getLayout(hdc: Hdc): UInt

public expect fun getMapMode(hdc: Hdc): HdcMapMode

public expect fun getMetaFileA(lpname: Pcstr): Hmetafile

public expect fun getMetaFileBitsEx(hmf: Hmetafile, cbbuffer: UInt, lpdata: MutPtr): UInt

public expect fun getMetaFileW(lpname: Pcwstr): Hmetafile

public expect fun getMetaRgn(hdc: Hdc, hrgn: Hrgn): Int

public expect fun getMiterLimit(hdc: Hdc, plimit: MutPtr): Bool

public expect fun getMonitorInfoA(hmonitor: Hmonitor, lpmi: MutPtr): Bool

public expect fun getMonitorInfoW(hmonitor: Hmonitor, lpmi: MutPtr): Bool

public expect fun getNearestColor(hdc: Hdc, color: Colorref): Colorref

public expect fun getNearestPaletteIndex(h: Hpalette, color: Colorref): UInt

public expect fun getObjectA(h: Hgdiobj, c: Int, pv: MutPtr): Int

public expect fun getObjectType(h: Hgdiobj): UInt

public expect fun getObjectW(h: Hgdiobj, c: Int, pv: MutPtr): Int

public expect fun getOutlineTextMetricsA(hdc: Hdc, cjcopy: UInt, potm: MutPtr): UInt

public expect fun getOutlineTextMetricsW(hdc: Hdc, cjcopy: UInt, potm: MutPtr): UInt

public expect fun getPaletteEntries(hpal: Hpalette, istart: UInt, centries: UInt, ppalentries: MutPtr): UInt

public expect fun getPath(hdc: Hdc, apt: MutPtr, aj: MutPtr, cpt: Int): Int

public expect fun getPixel(hdc: Hdc, x: Int, y: Int): Colorref

public expect fun getPolyFillMode(hdc: Hdc): Int

public expect fun getROP2(hdc: Hdc): R2Mode

public expect fun getRandomRgn(hdc: Hdc, hrgn: Hrgn, i: Int): Int

public expect fun getRasterizerCaps(lpraststat: MutPtr, cjbytes: UInt): Bool

public expect fun getRegionData(hrgn: Hrgn, ncount: UInt, lprgndata: MutPtr): UInt

public expect fun getRgnBox(hrgn: Hrgn, lprc: MutPtr): GdiRegionType

public expect fun getStockObject(i: GetStockObjectFlags): Hgdiobj

public expect fun getStretchBltMode(hdc: Hdc): Int

public expect fun getSysColor(nindex: SysColorIndex): UInt

public expect fun getSysColorBrush(nindex: SysColorIndex): Hbrush

public expect fun getSystemPaletteEntries(hdc: Hdc, istart: UInt, centries: UInt, ppalentries: MutPtr): UInt

public expect fun getSystemPaletteUse(hdc: Hdc): UInt

public expect fun getTabbedTextExtentA(hdc: Hdc, lpstring: Pcstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: ConstPtr): UInt

public expect fun getTabbedTextExtentW(hdc: Hdc, lpstring: Pcwstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: ConstPtr): UInt

public expect fun getTextAlign(hdc: Hdc): TextAlignOptions

public expect fun getTextCharacterExtra(hdc: Hdc): Int

public expect fun getTextColor(hdc: Hdc): Colorref

public expect fun getTextExtentExPointA(hdc: Hdc, lpszstring: Pcstr, cchstring: Int, nmaxextent: Int, lpnfit: MutPtr, lpndx: MutPtr, lpsize: MutPtr): Bool

public expect fun getTextExtentExPointI(hdc: Hdc, lpwszstring: ConstPtr, cwchstring: Int, nmaxextent: Int, lpnfit: MutPtr, lpndx: MutPtr, lpsize: MutPtr): Bool

public expect fun getTextExtentExPointW(hdc: Hdc, lpszstring: Pcwstr, cchstring: Int, nmaxextent: Int, lpnfit: MutPtr, lpndx: MutPtr, lpsize: MutPtr): Bool

public expect fun getTextExtentPoint32A(hdc: Hdc, lpstring: Pcstr, c: Int, psizl: MutPtr): Bool

public expect fun getTextExtentPoint32W(hdc: Hdc, lpstring: Pcwstr, c: Int, psizl: MutPtr): Bool

public expect fun getTextExtentPointA(hdc: Hdc, lpstring: Pcstr, c: Int, lpsz: MutPtr): Bool

public expect fun getTextExtentPointI(hdc: Hdc, pgiin: ConstPtr, cgi: Int, psize: MutPtr): Bool

public expect fun getTextExtentPointW(hdc: Hdc, lpstring: Pcwstr, c: Int, lpsz: MutPtr): Bool

public expect fun getTextFaceA(hdc: Hdc, c: Int, lpname: Pstr): Int

public expect fun getTextFaceW(hdc: Hdc, c: Int, lpname: Pwstr): Int

public expect fun getTextMetricsA(hdc: Hdc, lptm: MutPtr): Bool

public expect fun getTextMetricsW(hdc: Hdc, lptm: MutPtr): Bool

public expect fun getUpdateRect(hwnd: Hwnd, lprect: MutPtr, berase: Bool): Bool

public expect fun getUpdateRgn(hwnd: Hwnd, hrgn: Hrgn, berase: Bool): GdiRegionType

public expect fun getViewportExtEx(hdc: Hdc, lpsize: MutPtr): Bool

public expect fun getViewportOrgEx(hdc: Hdc, lppoint: MutPtr): Bool

public expect fun getWinMetaFileBits(hemf: Henhmetafile, cbdata16: UInt, pdata16: MutPtr, imapmode: Int, hdcref: Hdc): UInt

public expect fun getWindowDC(hwnd: Hwnd): Hdc

public expect fun getWindowExtEx(hdc: Hdc, lpsize: MutPtr): Bool

public expect fun getWindowOrgEx(hdc: Hdc, lppoint: MutPtr): Bool

public expect fun getWindowRgn(hwnd: Hwnd, hrgn: Hrgn): GdiRegionType

public expect fun getWindowRgnBox(hwnd: Hwnd, lprc: MutPtr): GdiRegionType

public expect fun getWorldTransform(hdc: Hdc, lpxf: MutPtr): Bool

public expect fun gradientFill(hdc: Hdc, pvertex: ConstPtr, nvertex: UInt, pmesh: ConstPtr, nmesh: UInt, ulmode: GradientFill): Bool

public expect fun grayStringA(hdc: Hdc, hbrush: Hbrush, lpoutputfunc: Graystringproc, lpdata: Lparam, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): Bool

public expect fun grayStringW(hdc: Hdc, hbrush: Hbrush, lpoutputfunc: Graystringproc, lpdata: Lparam, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): Bool

public expect fun inflateRect(lprc: MutPtr, dx: Int, dy: Int): Bool

public expect fun intersectClipRect(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): GdiRegionType

public expect fun intersectRect(lprcdst: MutPtr, lprcsrc1: ConstPtr, lprcsrc2: ConstPtr): Bool

public expect fun invalidateRect(hwnd: Hwnd, lprect: ConstPtr, berase: Bool): Bool

public expect fun invalidateRgn(hwnd: Hwnd, hrgn: Hrgn, berase: Bool): Bool

public expect fun invertRect(hdc: Hdc, lprc: ConstPtr): Bool

public expect fun invertRgn(hdc: Hdc, hrgn: Hrgn): Bool

public expect fun isRectEmpty(lprc: ConstPtr): Bool

public expect fun lPtoDP(hdc: Hdc, lppt: MutPtr, c: Int): Bool

public expect fun lineDDA(xstart: Int, ystart: Int, xend: Int, yend: Int, lpproc: Lineddaproc, data: Lparam): Bool

public expect fun lineTo(hdc: Hdc, x: Int, y: Int): Bool

public expect fun loadBitmapA(hinstance: Hinstance, lpbitmapname: Pcstr): Hbitmap

public expect fun loadBitmapW(hinstance: Hinstance, lpbitmapname: Pcwstr): Hbitmap

public expect fun lockWindowUpdate(hwndlock: Hwnd): Bool

public expect fun mapWindowPoints(hwndfrom: Hwnd, hwndto: Hwnd, lppoints: MutPtr, cpoints: UInt): Int

public expect fun maskBlt(hdcdest: Hdc, xdest: Int, ydest: Int, width: Int, height: Int, hdcsrc: Hdc, xsrc: Int, ysrc: Int, hbmmask: Hbitmap, xmask: Int, ymask: Int, rop: UInt): Bool

public expect fun mergeFontPackage(puchmergefontbuffer: ConstPtr, ulmergefontbuffersize: UInt, puchfontpackagebuffer: ConstPtr, ulfontpackagebuffersize: UInt, ppuchdestbuffer: MutPtr, puldestbuffersize: MutPtr, pulbyteswritten: MutPtr, usmode: UShort, lpfnallocate: CfpAllocproc, lpfnreallocate: CfpReallocproc, lpfnfree: CfpFreeproc, lpvreserved: MutPtr): UInt

public expect fun modifyWorldTransform(hdc: Hdc, lpxf: ConstPtr, mode: ModifyWorldTransformMode): Bool

public expect fun monitorFromPoint(pt: Point, dwflags: MonitorFromFlags): Hmonitor

public expect fun monitorFromRect(lprc: ConstPtr, dwflags: MonitorFromFlags): Hmonitor

public expect fun monitorFromWindow(hwnd: Hwnd, dwflags: MonitorFromFlags): Hmonitor

public expect fun moveToEx(hdc: Hdc, x: Int, y: Int, lppt: MutPtr): Bool

public expect fun offsetClipRgn(hdc: Hdc, x: Int, y: Int): GdiRegionType

public expect fun offsetRect(lprc: MutPtr, dx: Int, dy: Int): Bool

public expect fun offsetRgn(hrgn: Hrgn, x: Int, y: Int): GdiRegionType

public expect fun offsetViewportOrgEx(hdc: Hdc, x: Int, y: Int, lppt: MutPtr): Bool

public expect fun offsetWindowOrgEx(hdc: Hdc, x: Int, y: Int, lppt: MutPtr): Bool

public expect fun paintDesktop(hdc: Hdc): Bool

public expect fun paintRgn(hdc: Hdc, hrgn: Hrgn): Bool

public expect fun patBlt(hdc: Hdc, x: Int, y: Int, w: Int, h: Int, rop: RopCode): Bool

public expect fun pathToRegion(hdc: Hdc): Hrgn

public expect fun pie(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): Bool

public expect fun playEnhMetaFile(hdc: Hdc, hmf: Henhmetafile, lprect: ConstPtr): Bool

public expect fun playEnhMetaFileRecord(hdc: Hdc, pht: ConstPtr, pmr: ConstPtr, cht: UInt): Bool

public expect fun playMetaFile(hdc: Hdc, hmf: Hmetafile): Bool

public expect fun playMetaFileRecord(hdc: Hdc, lphandletable: ConstPtr, lpmr: ConstPtr, noobjs: UInt): Bool

public expect fun plgBlt(hdcdest: Hdc, lppoint: ConstPtr, hdcsrc: Hdc, xsrc: Int, ysrc: Int, width: Int, height: Int, hbmmask: Hbitmap, xmask: Int, ymask: Int): Bool

public expect fun polyBezier(hdc: Hdc, apt: ConstPtr, cpt: UInt): Bool

public expect fun polyBezierTo(hdc: Hdc, apt: ConstPtr, cpt: UInt): Bool

public expect fun polyDraw(hdc: Hdc, apt: ConstPtr, aj: ConstPtr, cpt: Int): Bool

public expect fun polyPolygon(hdc: Hdc, apt: ConstPtr, asz: ConstPtr, csz: Int): Bool

public expect fun polyPolyline(hdc: Hdc, apt: ConstPtr, asz: ConstPtr, csz: UInt): Bool

public expect fun polyTextOutA(hdc: Hdc, ppt: ConstPtr, nstrings: Int): Bool

public expect fun polyTextOutW(hdc: Hdc, ppt: ConstPtr, nstrings: Int): Bool

public expect fun polygon(hdc: Hdc, apt: ConstPtr, cpt: Int): Bool

public expect fun polyline(hdc: Hdc, apt: ConstPtr, cpt: Int): Bool

public expect fun polylineTo(hdc: Hdc, apt: ConstPtr, cpt: UInt): Bool

public expect fun ptInRect(lprc: ConstPtr, pt: Point): Bool

public expect fun ptInRegion(hrgn: Hrgn, x: Int, y: Int): Bool

public expect fun ptVisible(hdc: Hdc, x: Int, y: Int): Bool

public expect fun realizePalette(hdc: Hdc): UInt

public expect fun rectInRegion(hrgn: Hrgn, lprect: ConstPtr): Bool

public expect fun rectVisible(hdc: Hdc, lprect: ConstPtr): Bool

public expect fun rectangle(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): Bool

public expect fun redrawWindow(hwnd: Hwnd, lprcupdate: ConstPtr, hrgnupdate: Hrgn, flags: RedrawWindowFlags): Bool

public expect fun releaseDC(hwnd: Hwnd, hdc: Hdc): Int

public expect fun removeFontMemResourceEx(h: Handle): Bool

public expect fun removeFontResourceA(lpfilename: Pcstr): Bool

public expect fun removeFontResourceExA(name: Pcstr, fl: UInt, pdv: ConstPtr): Bool

public expect fun removeFontResourceExW(name: Pcwstr, fl: UInt, pdv: ConstPtr): Bool

public expect fun removeFontResourceW(lpfilename: Pcwstr): Bool

public expect fun resetDCA(hdc: Hdc, lpdm: ConstPtr): Hdc

public expect fun resetDCW(hdc: Hdc, lpdm: ConstPtr): Hdc

public expect fun resizePalette(hpal: Hpalette, n: UInt): Bool

public expect fun restoreDC(hdc: Hdc, nsaveddc: Int): Bool

public expect fun roundRect(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int, width: Int, height: Int): Bool

public expect fun saveDC(hdc: Hdc): Int

public expect fun scaleViewportExtEx(hdc: Hdc, xn: Int, dx: Int, yn: Int, yd: Int, lpsz: MutPtr): Bool

public expect fun scaleWindowExtEx(hdc: Hdc, xn: Int, xd: Int, yn: Int, yd: Int, lpsz: MutPtr): Bool

public expect fun screenToClient(hwnd: Hwnd, lppoint: MutPtr): Bool

public expect fun selectClipPath(hdc: Hdc, mode: RgnCombineMode): Bool

public expect fun selectClipRgn(hdc: Hdc, hrgn: Hrgn): GdiRegionType

public expect fun selectObject(hdc: Hdc, h: Hgdiobj): Hgdiobj

public expect fun selectPalette(hdc: Hdc, hpal: Hpalette, bforcebkgd: Bool): Hpalette

public expect fun setArcDirection(hdc: Hdc, dir: ArcDirection): Int

public expect fun setBitmapBits(hbm: Hbitmap, cb: UInt, pvbits: ConstPtr): Int

public expect fun setBitmapDimensionEx(hbm: Hbitmap, w: Int, h: Int, lpsz: MutPtr): Bool

public expect fun setBkColor(hdc: Hdc, color: Colorref): Colorref

public expect fun setBkMode(hdc: Hdc, mode: Int): Int

public expect fun setBoundsRect(hdc: Hdc, lprect: ConstPtr, flags: SetBoundsRectFlags): UInt

public expect fun setBrushOrgEx(hdc: Hdc, x: Int, y: Int, lppt: MutPtr): Bool

public expect fun setColorAdjustment(hdc: Hdc, lpca: ConstPtr): Bool

public expect fun setDCBrushColor(hdc: Hdc, color: Colorref): Colorref

public expect fun setDCPenColor(hdc: Hdc, color: Colorref): Colorref

public expect fun setDIBColorTable(hdc: Hdc, istart: UInt, centries: UInt, prgbq: ConstPtr): UInt

public expect fun setDIBits(hdc: Hdc, hbm: Hbitmap, start: UInt, clines: UInt, lpbits: ConstPtr, lpbmi: ConstPtr, coloruse: DibUsage): Int

public expect fun setDIBitsToDevice(hdc: Hdc, xdest: Int, ydest: Int, w: UInt, h: UInt, xsrc: Int, ysrc: Int, startscan: UInt, clines: UInt, lpvbits: ConstPtr, lpbmi: ConstPtr, coloruse: DibUsage): Int

public expect fun setEnhMetaFileBits(nsize: UInt, pb: ConstPtr): Henhmetafile

public expect fun setGraphicsMode(hdc: Hdc, imode: GraphicsMode): Int

public expect fun setLayout(hdc: Hdc, l: DcLayout): UInt

public expect fun setMapMode(hdc: Hdc, imode: HdcMapMode): Int

public expect fun setMapperFlags(hdc: Hdc, flags: UInt): UInt

public expect fun setMetaFileBitsEx(cbbuffer: UInt, lpdata: ConstPtr): Hmetafile

public expect fun setMetaRgn(hdc: Hdc): GdiRegionType

public expect fun setMiterLimit(hdc: Hdc, limit: Float, old: MutPtr): Bool

public expect fun setPaletteEntries(hpal: Hpalette, istart: UInt, centries: UInt, ppalentries: ConstPtr): UInt

public expect fun setPixel(hdc: Hdc, x: Int, y: Int, color: Colorref): Colorref

public expect fun setPixelV(hdc: Hdc, x: Int, y: Int, color: Colorref): Bool

public expect fun setPolyFillMode(hdc: Hdc, mode: CreatePolygonRgnMode): Int

public expect fun setROP2(hdc: Hdc, rop2: R2Mode): Int

public expect fun setRect(lprc: MutPtr, xleft: Int, ytop: Int, xright: Int, ybottom: Int): Bool

public expect fun setRectEmpty(lprc: MutPtr): Bool

public expect fun setRectRgn(hrgn: Hrgn, left: Int, top: Int, right: Int, bottom: Int): Bool

public expect fun setStretchBltMode(hdc: Hdc, mode: StretchBltMode): Int

public expect fun setSysColors(celements: Int, lpaelements: ConstPtr, lpargbvalues: ConstPtr): Bool

public expect fun setSystemPaletteUse(hdc: Hdc, use: SystemPaletteUse): UInt

public expect fun setTextAlign(hdc: Hdc, align: TextAlignOptions): UInt

public expect fun setTextCharacterExtra(hdc: Hdc, extra: Int): Int

public expect fun setTextColor(hdc: Hdc, color: Colorref): Colorref

public expect fun setTextJustification(hdc: Hdc, extra: Int, count: Int): Bool

public expect fun setViewportExtEx(hdc: Hdc, x: Int, y: Int, lpsz: MutPtr): Bool

public expect fun setViewportOrgEx(hdc: Hdc, x: Int, y: Int, lppt: MutPtr): Bool

public expect fun setWindowExtEx(hdc: Hdc, x: Int, y: Int, lpsz: MutPtr): Bool

public expect fun setWindowOrgEx(hdc: Hdc, x: Int, y: Int, lppt: MutPtr): Bool

public expect fun setWindowRgn(hwnd: Hwnd, hrgn: Hrgn, bredraw: Bool): Int

public expect fun setWorldTransform(hdc: Hdc, lpxf: ConstPtr): Bool

public expect fun stretchBlt(hdcdest: Hdc, xdest: Int, ydest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xsrc: Int, ysrc: Int, wsrc: Int, hsrc: Int, rop: RopCode): Bool

public expect fun stretchDIBits(hdc: Hdc, xdest: Int, ydest: Int, destwidth: Int, destheight: Int, xsrc: Int, ysrc: Int, srcwidth: Int, srcheight: Int, lpbits: ConstPtr, lpbmi: ConstPtr, iusage: DibUsage, rop: RopCode): Int

public expect fun strokeAndFillPath(hdc: Hdc): Bool

public expect fun strokePath(hdc: Hdc): Bool

public expect fun subtractRect(lprcdst: MutPtr, lprcsrc1: ConstPtr, lprcsrc2: ConstPtr): Bool

public expect fun tTCharToUnicode(hdc: Hdc, puccharcodes: ConstPtr, ulcharcodesize: UInt, pusshortcodes: MutPtr, ulshortcodesize: UInt, ulflags: UInt): Int

public expect fun tTDeleteEmbeddedFont(hfontreference: Handle, ulflags: UInt, pulstatus: MutPtr): Int

public expect fun tTEmbedFont(hdc: Hdc, ulflags: TtembedFlags, ulcharset: EmbedFontCharset, pulprivstatus: MutPtr, pulstatus: MutPtr, lpfnwritetostream: Writeembedproc, lpvwritestream: ConstPtr, puscharcodeset: ConstPtr, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: ConstPtr): Int

public expect fun tTEmbedFontEx(hdc: Hdc, ulflags: TtembedFlags, ulcharset: EmbedFontCharset, pulprivstatus: MutPtr, pulstatus: MutPtr, lpfnwritetostream: Writeembedproc, lpvwritestream: ConstPtr, pulcharcodeset: ConstPtr, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: ConstPtr): Int

public expect fun tTEmbedFontFromFileA(hdc: Hdc, szfontfilename: Pcstr, usttcindex: UShort, ulflags: TtembedFlags, ulcharset: EmbedFontCharset, pulprivstatus: MutPtr, pulstatus: MutPtr, lpfnwritetostream: Writeembedproc, lpvwritestream: ConstPtr, puscharcodeset: ConstPtr, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: ConstPtr): Int

public expect fun tTEnableEmbeddingForFacename(lpszfacename: Pcstr, benable: Bool): Int

public expect fun tTGetEmbeddedFontInfo(ulflags: TtembedFlags, pulprivstatus: MutPtr, ulprivs: FontLicensePrivs, pulstatus: MutPtr, lpfnreadfromstream: Readembedproc, lpvreadstream: ConstPtr, pttloadinfo: ConstPtr): Int

public expect fun tTGetEmbeddingType(hdc: Hdc, pulembedtype: MutPtr): Int

public expect fun tTGetNewFontName(phfontreference: ConstPtr, wzwinfamilyname: Pwstr, cchmaxwinname: Int, szmacfamilyname: Pstr, cchmaxmacname: Int): Int

public expect fun tTIsEmbeddingEnabled(hdc: Hdc, pbenabled: MutPtr): Int

public expect fun tTIsEmbeddingEnabledForFacename(lpszfacename: Pcstr, pbenabled: MutPtr): Int

public expect fun tTLoadEmbeddedFont(phfontreference: MutPtr, ulflags: UInt, pulprivstatus: MutPtr, ulprivs: FontLicensePrivs, pulstatus: MutPtr, lpfnreadfromstream: Readembedproc, lpvreadstream: ConstPtr, szwinfamilyname: Pcwstr, szmacfamilyname: Pcstr, pttloadinfo: ConstPtr): Int

public expect fun tTRunValidationTests(hdc: Hdc, ptestparam: ConstPtr): Int

public expect fun tTRunValidationTestsEx(hdc: Hdc, ptestparam: ConstPtr): Int

public expect fun tabbedTextOutA(hdc: Hdc, x: Int, y: Int, lpstring: Pcstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: ConstPtr, ntaborigin: Int): Int

public expect fun tabbedTextOutW(hdc: Hdc, x: Int, y: Int, lpstring: Pcwstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: ConstPtr, ntaborigin: Int): Int

public expect fun textOutA(hdc: Hdc, x: Int, y: Int, lpstring: Pcstr, c: Int): Bool

public expect fun textOutW(hdc: Hdc, x: Int, y: Int, lpstring: Pcwstr, c: Int): Bool

public expect fun transparentBlt(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: UInt): Bool

public expect fun unionRect(lprcdst: MutPtr, lprcsrc1: ConstPtr, lprcsrc2: ConstPtr): Bool

public expect fun unrealizeObject(h: Hgdiobj): Bool

public expect fun updateColors(hdc: Hdc): Bool

public expect fun updateWindow(hwnd: Hwnd): Bool

public expect fun validateRect(hwnd: Hwnd, lprect: ConstPtr): Bool

public expect fun validateRgn(hwnd: Hwnd, hrgn: Hrgn): Bool

public expect fun widenPath(hdc: Hdc): Bool

public expect fun windowFromDC(hdc: Hdc): Hwnd

public expect fun wglSwapMultipleBuffers(param0: UInt, param1: ConstPtr): UInt
