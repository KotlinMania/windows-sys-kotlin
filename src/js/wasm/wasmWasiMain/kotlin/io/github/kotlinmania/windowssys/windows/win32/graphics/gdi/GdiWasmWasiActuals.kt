@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

public actual fun abortPath(hdc: Hdc): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun addFontMemResourceEx(pfileview: COpaquePointer?, cjsize: UInt, pvresrved: COpaquePointer?, pnumfonts: COpaquePointer?): Handle =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun addFontResourceA(param0: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun addFontResourceExA(name: Pcstr, fl: FontResourceCharacteristics, res: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun addFontResourceExW(name: Pcwstr, fl: FontResourceCharacteristics, res: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun addFontResourceW(param0: Pcwstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun alphaBlend(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, ftn: Blendfunction): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun angleArc(hdc: Hdc, x: Int, y: Int, r: UInt, startangle: Float, sweepangle: Float): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun animatePalette(hpal: Hpalette, istartindex: UInt, centries: UInt, ppe: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun arc(hdc: Hdc, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun arcTo(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun beginPaint(hwnd: Hwnd, lppaint: COpaquePointer?): Hdc =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun beginPath(hdc: Hdc): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bitBlt(hdc: Hdc, x: Int, y: Int, cx: Int, cy: Int, hdcsrc: Hdc, x1: Int, y1: Int, rop: RopCode): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun cancelDC(hdc: Hdc): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun changeDisplaySettingsA(lpdevmode: COpaquePointer?, dwflags: CdsType): DispChange =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun changeDisplaySettingsExA(lpszdevicename: Pcstr, lpdevmode: COpaquePointer?, hwnd: Hwnd, dwflags: CdsType, lparam: COpaquePointer?): DispChange =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun changeDisplaySettingsExW(lpszdevicename: Pcwstr, lpdevmode: COpaquePointer?, hwnd: Hwnd, dwflags: CdsType, lparam: COpaquePointer?): DispChange =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun changeDisplaySettingsW(lpdevmode: COpaquePointer?, dwflags: CdsType): DispChange =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun chord(hdc: Hdc, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clientToScreen(hwnd: Hwnd, lppoint: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun closeEnhMetaFile(hdc: Hdc): Henhmetafile =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun closeFigure(hdc: Hdc): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun closeMetaFile(hdc: Hdc): Hmetafile =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun combineRgn(hrgndst: Hrgn, hrgnsrc1: Hrgn, hrgnsrc2: Hrgn, imode: RgnCombineMode): GdiRegionType =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun combineTransform(lpxfout: COpaquePointer?, lpxf1: COpaquePointer?, lpxf2: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun copyEnhMetaFileA(henh: Henhmetafile, lpfilename: Pcstr): Henhmetafile =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun copyEnhMetaFileW(henh: Henhmetafile, lpfilename: Pcwstr): Henhmetafile =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun copyMetaFileA(param0: Hmetafile, param1: Pcstr): Hmetafile =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun copyMetaFileW(param0: Hmetafile, param1: Pcwstr): Hmetafile =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun copyRect(lprcdst: COpaquePointer?, lprcsrc: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createBitmap(nwidth: Int, nheight: Int, nplanes: UInt, nbitcount: UInt, lpbits: COpaquePointer?): Hbitmap =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createBitmapIndirect(pbm: COpaquePointer?): Hbitmap =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createBrushIndirect(plbrush: COpaquePointer?): Hbrush =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createCompatibleBitmap(hdc: Hdc, cx: Int, cy: Int): Hbitmap =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createCompatibleDC(hdc: Hdc): Hdc =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createDCA(pwszdriver: Pcstr, pwszdevice: Pcstr, pszport: Pcstr, pdm: COpaquePointer?): Hdc =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createDCW(pwszdriver: Pcwstr, pwszdevice: Pcwstr, pszport: Pcwstr, pdm: COpaquePointer?): Hdc =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createDIBPatternBrush(h: Hglobal, iusage: DibUsage): Hbrush =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createDIBPatternBrushPt(lppackeddib: COpaquePointer?, iusage: DibUsage): Hbrush =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createDIBSection(hdc: Hdc, pbmi: COpaquePointer?, usage: DibUsage, ppvbits: COpaquePointer?, hsection: Handle, offset: UInt): Hbitmap =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createDIBitmap(hdc: Hdc, pbmih: COpaquePointer?, flinit: UInt, pjbits: COpaquePointer?, pbmi: COpaquePointer?, iusage: DibUsage): Hbitmap =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createDiscardableBitmap(hdc: Hdc, cx: Int, cy: Int): Hbitmap =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createEllipticRgn(x1: Int, y1: Int, x2: Int, y2: Int): Hrgn =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createEllipticRgnIndirect(lprect: COpaquePointer?): Hrgn =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createEnhMetaFileA(hdc: Hdc, lpfilename: Pcstr, lprc: COpaquePointer?, lpdesc: Pcstr): Hdc =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createEnhMetaFileW(hdc: Hdc, lpfilename: Pcwstr, lprc: COpaquePointer?, lpdesc: Pcwstr): Hdc =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createFontA(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: UInt, bunderline: UInt, bstrikeout: UInt, icharset: UInt, ioutprecision: UInt, iclipprecision: UInt, iquality: UInt, ipitchandfamily: UInt, pszfacename: Pcstr): Hfont =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createFontIndirectA(lplf: COpaquePointer?): Hfont =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createFontIndirectExA(param0: COpaquePointer?): Hfont =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createFontIndirectExW(param0: COpaquePointer?): Hfont =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createFontIndirectW(lplf: COpaquePointer?): Hfont =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createFontPackage(puchsrcbuffer: COpaquePointer?, ulsrcbuffersize: UInt, ppuchfontpackagebuffer: COpaquePointer?, pulfontpackagebuffersize: COpaquePointer?, pulbyteswritten: COpaquePointer?, usflag: UShort, usttcindex: UShort, ussubsetformat: UShort, ussubsetlanguage: UShort, ussubsetplatform: CreateFontPackageSubsetPlatform, ussubsetencoding: CreateFontPackageSubsetEncoding, pussubsetkeeplist: COpaquePointer?, ussubsetlistcount: UShort, lpfnallocate: CfpAllocproc, lpfnreallocate: CfpReallocproc, lpfnfree: CfpFreeproc, lpvreserved: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createFontW(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: UInt, bunderline: UInt, bstrikeout: UInt, icharset: UInt, ioutprecision: UInt, iclipprecision: UInt, iquality: UInt, ipitchandfamily: UInt, pszfacename: Pcwstr): Hfont =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createHalftonePalette(hdc: Hdc): Hpalette =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createHatchBrush(ihatch: HatchBrushStyle, color: Colorref): Hbrush =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createICA(pszdriver: Pcstr, pszdevice: Pcstr, pszport: Pcstr, pdm: COpaquePointer?): Hdc =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createICW(pszdriver: Pcwstr, pszdevice: Pcwstr, pszport: Pcwstr, pdm: COpaquePointer?): Hdc =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createMetaFileA(pszfile: Pcstr): Hdc =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createMetaFileW(pszfile: Pcwstr): Hdc =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createPalette(plpal: COpaquePointer?): Hpalette =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createPatternBrush(hbm: Hbitmap): Hbrush =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createPen(istyle: PenStyle, cwidth: Int, color: Colorref): Hpen =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createPenIndirect(plpen: COpaquePointer?): Hpen =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createPolyPolygonRgn(pptl: COpaquePointer?, pc: COpaquePointer?, cpoly: Int, imode: CreatePolygonRgnMode): Hrgn =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createPolygonRgn(pptl: COpaquePointer?, cpoint: Int, imode: CreatePolygonRgnMode): Hrgn =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createRectRgn(x1: Int, y1: Int, x2: Int, y2: Int): Hrgn =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createRectRgnIndirect(lprect: COpaquePointer?): Hrgn =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createRoundRectRgn(x1: Int, y1: Int, x2: Int, y2: Int, w: Int, h: Int): Hrgn =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createScalableFontResourceA(fdwhidden: UInt, lpszfont: Pcstr, lpszfile: Pcstr, lpszpath: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createScalableFontResourceW(fdwhidden: UInt, lpszfont: Pcwstr, lpszfile: Pcwstr, lpszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun createSolidBrush(color: Colorref): Hbrush =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dPtoLP(hdc: Hdc, lppt: COpaquePointer?, c: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun deleteDC(hdc: Hdc): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun deleteEnhMetaFile(hmf: Henhmetafile): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun deleteMetaFile(hmf: Hmetafile): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun deleteObject(ho: Hgdiobj): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drawAnimatedRects(hwnd: Hwnd, idani: Int, lprcfrom: COpaquePointer?, lprcto: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drawCaption(hwnd: Hwnd, hdc: Hdc, lprect: COpaquePointer?, flags: DrawCaptionFlags): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drawEdge(hdc: Hdc, qrc: COpaquePointer?, edge: DrawedgeFlags, grfflags: DrawEdgeFlags): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drawEscape(hdc: Hdc, iescape: Int, cjin: Int, lpin: Pcstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drawFocusRect(hdc: Hdc, lprc: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drawFrameControl(param0: Hdc, param1: COpaquePointer?, param2: DfcType, param3: DfcsState): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drawStateA(hdc: Hdc, hbrfore: Hbrush, qfncallback: Drawstateproc, ldata: Lparam, wdata: Wparam, x: Int, y: Int, cx: Int, cy: Int, uflags: DrawstateFlags): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drawStateW(hdc: Hdc, hbrfore: Hbrush, qfncallback: Drawstateproc, ldata: Lparam, wdata: Wparam, x: Int, y: Int, cx: Int, cy: Int, uflags: DrawstateFlags): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drawTextA(hdc: Hdc, lpchtext: Pcstr, cchtext: Int, lprc: COpaquePointer?, format: DrawTextFormat): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drawTextExA(hdc: Hdc, lpchtext: Pstr, cchtext: Int, lprc: COpaquePointer?, format: DrawTextFormat, lpdtp: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drawTextExW(hdc: Hdc, lpchtext: Pwstr, cchtext: Int, lprc: COpaquePointer?, format: DrawTextFormat, lpdtp: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun drawTextW(hdc: Hdc, lpchtext: Pcwstr, cchtext: Int, lprc: COpaquePointer?, format: DrawTextFormat): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ellipse(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun endPaint(hwnd: Hwnd, lppaint: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun endPath(hdc: Hdc): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumDisplayDevicesA(lpdevice: Pcstr, idevnum: UInt, lpdisplaydevice: COpaquePointer?, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumDisplayDevicesW(lpdevice: Pcwstr, idevnum: UInt, lpdisplaydevice: COpaquePointer?, dwflags: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumDisplayMonitors(hdc: Hdc, lprcclip: COpaquePointer?, lpfnenum: Monitorenumproc, dwdata: Lparam): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumDisplaySettingsA(lpszdevicename: Pcstr, imodenum: EnumDisplaySettingsMode, lpdevmode: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumDisplaySettingsExA(lpszdevicename: Pcstr, imodenum: EnumDisplaySettingsMode, lpdevmode: COpaquePointer?, dwflags: EnumDisplaySettingsFlags): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumDisplaySettingsExW(lpszdevicename: Pcwstr, imodenum: EnumDisplaySettingsMode, lpdevmode: COpaquePointer?, dwflags: EnumDisplaySettingsFlags): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumDisplaySettingsW(lpszdevicename: Pcwstr, imodenum: EnumDisplaySettingsMode, lpdevmode: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumEnhMetaFile(hdc: Hdc, hmf: Henhmetafile, proc: Enhmfenumproc, param3: COpaquePointer?, lprect: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumFontFamiliesA(hdc: Hdc, lplogfont: Pcstr, lpproc: Fontenumproca, lparam: Lparam): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumFontFamiliesExA(hdc: Hdc, lplogfont: COpaquePointer?, lpproc: Fontenumproca, lparam: Lparam, dwflags: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumFontFamiliesExW(hdc: Hdc, lplogfont: COpaquePointer?, lpproc: Fontenumprocw, lparam: Lparam, dwflags: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumFontFamiliesW(hdc: Hdc, lplogfont: Pcwstr, lpproc: Fontenumprocw, lparam: Lparam): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumFontsA(hdc: Hdc, lplogfont: Pcstr, lpproc: Fontenumproca, lparam: Lparam): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumFontsW(hdc: Hdc, lplogfont: Pcwstr, lpproc: Fontenumprocw, lparam: Lparam): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumMetaFile(hdc: Hdc, hmf: Hmetafile, proc: Mfenumproc, param3: Lparam): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enumObjects(hdc: Hdc, ntype: ObjType, lpfunc: Gobjenumproc, lparam: Lparam): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun equalRect(lprc1: COpaquePointer?, lprc2: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun equalRgn(hrgn1: Hrgn, hrgn2: Hrgn): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun excludeClipRect(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): GdiRegionType =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun excludeUpdateRgn(hdc: Hdc, hwnd: Hwnd): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun extCreatePen(ipenstyle: UInt, cwidth: UInt, plbrush: COpaquePointer?, cstyle: UInt, pstyle: COpaquePointer?): Hpen =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun extCreateRegion(lpx: COpaquePointer?, ncount: UInt, lpdata: COpaquePointer?): Hrgn =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun extFloodFill(hdc: Hdc, x: Int, y: Int, color: Colorref, type: ExtFloodFillType): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun extSelectClipRgn(hdc: Hdc, hrgn: Hrgn, mode: RgnCombineMode): GdiRegionType =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun extTextOutA(hdc: Hdc, x: Int, y: Int, options: EtoOptions, lprect: COpaquePointer?, lpstring: Pcstr, c: UInt, lpdx: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun extTextOutW(hdc: Hdc, x: Int, y: Int, options: EtoOptions, lprect: COpaquePointer?, lpstring: Pcwstr, c: UInt, lpdx: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fillPath(hdc: Hdc): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fillRect(hdc: Hdc, lprc: COpaquePointer?, hbr: Hbrush): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fillRgn(hdc: Hdc, hrgn: Hrgn, hbr: Hbrush): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun fixBrushOrgEx(hdc: Hdc, x: Int, y: Int, ptl: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun flattenPath(hdc: Hdc): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun floodFill(hdc: Hdc, x: Int, y: Int, color: Colorref): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun frameRect(hdc: Hdc, lprc: COpaquePointer?, hbr: Hbrush): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun frameRgn(hdc: Hdc, hrgn: Hrgn, hbr: Hbrush, w: Int, h: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdiAlphaBlend(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, ftn: Blendfunction): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdiComment(hdc: Hdc, nsize: UInt, lpdata: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdiFlush(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdiGetBatchLimit(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdiGradientFill(hdc: Hdc, pvertex: COpaquePointer?, nvertex: UInt, pmesh: COpaquePointer?, ncount: UInt, ulmode: GradientFill): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdiSetBatchLimit(dw: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdiTransparentBlt(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getArcDirection(hdc: Hdc): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getAspectRatioFilterEx(hdc: Hdc, lpsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getBitmapBits(hbit: Hbitmap, cb: Int, lpvbits: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getBitmapDimensionEx(hbit: Hbitmap, lpsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getBkColor(hdc: Hdc): Colorref =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getBkMode(hdc: Hdc): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getBoundsRect(hdc: Hdc, lprect: COpaquePointer?, flags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getBrushOrgEx(hdc: Hdc, lppt: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCharABCWidthsA(hdc: Hdc, wfirst: UInt, wlast: UInt, lpabc: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCharABCWidthsFloatA(hdc: Hdc, ifirst: UInt, ilast: UInt, lpabc: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCharABCWidthsFloatW(hdc: Hdc, ifirst: UInt, ilast: UInt, lpabc: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCharABCWidthsI(hdc: Hdc, gifirst: UInt, cgi: UInt, pgi: COpaquePointer?, pabc: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCharABCWidthsW(hdc: Hdc, wfirst: UInt, wlast: UInt, lpabc: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCharWidth32A(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCharWidth32W(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCharWidthA(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCharWidthFloatA(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCharWidthFloatW(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCharWidthI(hdc: Hdc, gifirst: UInt, cgi: UInt, pgi: COpaquePointer?, piwidths: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCharWidthW(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCharacterPlacementA(hdc: Hdc, lpstring: Pcstr, ncount: Int, nmexextent: Int, lpresults: COpaquePointer?, dwflags: GetCharacterPlacementFlags): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCharacterPlacementW(hdc: Hdc, lpstring: Pcwstr, ncount: Int, nmexextent: Int, lpresults: COpaquePointer?, dwflags: GetCharacterPlacementFlags): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getClipBox(hdc: Hdc, lprect: COpaquePointer?): GdiRegionType =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getClipRgn(hdc: Hdc, hrgn: Hrgn): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getColorAdjustment(hdc: Hdc, lpca: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCurrentObject(hdc: Hdc, type: UInt): Hgdiobj =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getCurrentPositionEx(hdc: Hdc, lppt: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDC(hwnd: Hwnd): Hdc =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDCBrushColor(hdc: Hdc): Colorref =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDCEx(hwnd: Hwnd, hrgnclip: Hrgn, flags: GetDcxFlags): Hdc =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDCOrgEx(hdc: Hdc, lppt: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDCPenColor(hdc: Hdc): Colorref =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDIBColorTable(hdc: Hdc, istart: UInt, centries: UInt, prgbq: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDIBits(hdc: Hdc, hbm: Hbitmap, start: UInt, clines: UInt, lpvbits: COpaquePointer?, lpbmi: COpaquePointer?, usage: DibUsage): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDeviceCaps(hdc: Hdc, index: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getEnhMetaFileA(lpname: Pcstr): Henhmetafile =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getEnhMetaFileBits(hemf: Henhmetafile, nsize: UInt, lpdata: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getEnhMetaFileDescriptionA(hemf: Henhmetafile, cchbuffer: UInt, lpdescription: Pstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getEnhMetaFileDescriptionW(hemf: Henhmetafile, cchbuffer: UInt, lpdescription: Pwstr): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getEnhMetaFileHeader(hemf: Henhmetafile, nsize: UInt, lpenhmetaheader: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getEnhMetaFilePaletteEntries(hemf: Henhmetafile, nnumentries: UInt, lppaletteentries: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getEnhMetaFileW(lpname: Pcwstr): Henhmetafile =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getFontData(hdc: Hdc, dwtable: UInt, dwoffset: UInt, pvbuffer: COpaquePointer?, cjbuffer: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getFontLanguageInfo(hdc: Hdc): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getFontUnicodeRanges(hdc: Hdc, lpgs: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getGlyphIndicesA(hdc: Hdc, lpstr: Pcstr, c: Int, pgi: COpaquePointer?, fl: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getGlyphIndicesW(hdc: Hdc, lpstr: Pcwstr, c: Int, pgi: COpaquePointer?, fl: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getGlyphOutlineA(hdc: Hdc, uchar: UInt, fuformat: GetGlyphOutlineFormat, lpgm: COpaquePointer?, cjbuffer: UInt, pvbuffer: COpaquePointer?, lpmat2: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getGlyphOutlineW(hdc: Hdc, uchar: UInt, fuformat: GetGlyphOutlineFormat, lpgm: COpaquePointer?, cjbuffer: UInt, pvbuffer: COpaquePointer?, lpmat2: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getGraphicsMode(hdc: Hdc): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getKerningPairsA(hdc: Hdc, npairs: UInt, lpkernpair: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getKerningPairsW(hdc: Hdc, npairs: UInt, lpkernpair: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getLayout(hdc: Hdc): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMapMode(hdc: Hdc): HdcMapMode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMetaFileA(lpname: Pcstr): Hmetafile =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMetaFileBitsEx(hmf: Hmetafile, cbbuffer: UInt, lpdata: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMetaFileW(lpname: Pcwstr): Hmetafile =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMetaRgn(hdc: Hdc, hrgn: Hrgn): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMiterLimit(hdc: Hdc, plimit: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMonitorInfoA(hmonitor: Hmonitor, lpmi: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getMonitorInfoW(hmonitor: Hmonitor, lpmi: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getNearestColor(hdc: Hdc, color: Colorref): Colorref =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getNearestPaletteIndex(h: Hpalette, color: Colorref): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getObjectA(h: Hgdiobj, c: Int, pv: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getObjectType(h: Hgdiobj): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getObjectW(h: Hgdiobj, c: Int, pv: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getOutlineTextMetricsA(hdc: Hdc, cjcopy: UInt, potm: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getOutlineTextMetricsW(hdc: Hdc, cjcopy: UInt, potm: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPaletteEntries(hpal: Hpalette, istart: UInt, centries: UInt, ppalentries: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPath(hdc: Hdc, apt: COpaquePointer?, aj: COpaquePointer?, cpt: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPixel(hdc: Hdc, x: Int, y: Int): Colorref =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getPolyFillMode(hdc: Hdc): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getROP2(hdc: Hdc): R2Mode =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getRandomRgn(hdc: Hdc, hrgn: Hrgn, i: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getRasterizerCaps(lpraststat: COpaquePointer?, cjbytes: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getRegionData(hrgn: Hrgn, ncount: UInt, lprgndata: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getRgnBox(hrgn: Hrgn, lprc: COpaquePointer?): GdiRegionType =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getStockObject(i: GetStockObjectFlags): Hgdiobj =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getStretchBltMode(hdc: Hdc): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getSysColor(nindex: SysColorIndex): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getSysColorBrush(nindex: SysColorIndex): Hbrush =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getSystemPaletteEntries(hdc: Hdc, istart: UInt, centries: UInt, ppalentries: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getSystemPaletteUse(hdc: Hdc): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getTabbedTextExtentA(hdc: Hdc, lpstring: Pcstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getTabbedTextExtentW(hdc: Hdc, lpstring: Pcwstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getTextAlign(hdc: Hdc): TextAlignOptions =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getTextCharacterExtra(hdc: Hdc): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getTextColor(hdc: Hdc): Colorref =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getTextExtentExPointA(hdc: Hdc, lpszstring: Pcstr, cchstring: Int, nmaxextent: Int, lpnfit: COpaquePointer?, lpndx: COpaquePointer?, lpsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getTextExtentExPointI(hdc: Hdc, lpwszstring: COpaquePointer?, cwchstring: Int, nmaxextent: Int, lpnfit: COpaquePointer?, lpndx: COpaquePointer?, lpsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getTextExtentExPointW(hdc: Hdc, lpszstring: Pcwstr, cchstring: Int, nmaxextent: Int, lpnfit: COpaquePointer?, lpndx: COpaquePointer?, lpsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getTextExtentPoint32A(hdc: Hdc, lpstring: Pcstr, c: Int, psizl: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getTextExtentPoint32W(hdc: Hdc, lpstring: Pcwstr, c: Int, psizl: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getTextExtentPointA(hdc: Hdc, lpstring: Pcstr, c: Int, lpsz: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getTextExtentPointI(hdc: Hdc, pgiin: COpaquePointer?, cgi: Int, psize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getTextExtentPointW(hdc: Hdc, lpstring: Pcwstr, c: Int, lpsz: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getTextFaceA(hdc: Hdc, c: Int, lpname: Pstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getTextFaceW(hdc: Hdc, c: Int, lpname: Pwstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getTextMetricsA(hdc: Hdc, lptm: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getTextMetricsW(hdc: Hdc, lptm: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getUpdateRect(hwnd: Hwnd, lprect: COpaquePointer?, berase: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getUpdateRgn(hwnd: Hwnd, hrgn: Hrgn, berase: Bool): GdiRegionType =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getViewportExtEx(hdc: Hdc, lpsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getViewportOrgEx(hdc: Hdc, lppoint: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getWinMetaFileBits(hemf: Henhmetafile, cbdata16: UInt, pdata16: COpaquePointer?, imapmode: Int, hdcref: Hdc): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getWindowDC(hwnd: Hwnd): Hdc =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getWindowExtEx(hdc: Hdc, lpsize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getWindowOrgEx(hdc: Hdc, lppoint: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getWindowRgn(hwnd: Hwnd, hrgn: Hrgn): GdiRegionType =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getWindowRgnBox(hwnd: Hwnd, lprc: COpaquePointer?): GdiRegionType =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getWorldTransform(hdc: Hdc, lpxf: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gradientFill(hdc: Hdc, pvertex: COpaquePointer?, nvertex: UInt, pmesh: COpaquePointer?, nmesh: UInt, ulmode: GradientFill): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun grayStringA(hdc: Hdc, hbrush: Hbrush, lpoutputfunc: Graystringproc, lpdata: Lparam, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun grayStringW(hdc: Hdc, hbrush: Hbrush, lpoutputfunc: Graystringproc, lpdata: Lparam, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun inflateRect(lprc: COpaquePointer?, dx: Int, dy: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun intersectClipRect(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): GdiRegionType =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun intersectRect(lprcdst: COpaquePointer?, lprcsrc1: COpaquePointer?, lprcsrc2: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun invalidateRect(hwnd: Hwnd, lprect: COpaquePointer?, berase: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun invalidateRgn(hwnd: Hwnd, hrgn: Hrgn, berase: Bool): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun invertRect(hdc: Hdc, lprc: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun invertRgn(hdc: Hdc, hrgn: Hrgn): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isRectEmpty(lprc: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lPtoDP(hdc: Hdc, lppt: COpaquePointer?, c: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineDDA(xstart: Int, ystart: Int, xend: Int, yend: Int, lpproc: Lineddaproc, data: Lparam): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lineTo(hdc: Hdc, x: Int, y: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadBitmapA(hinstance: Hinstance, lpbitmapname: Pcstr): Hbitmap =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loadBitmapW(hinstance: Hinstance, lpbitmapname: Pcwstr): Hbitmap =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lockWindowUpdate(hwndlock: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mapWindowPoints(hwndfrom: Hwnd, hwndto: Hwnd, lppoints: COpaquePointer?, cpoints: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun maskBlt(hdcdest: Hdc, xdest: Int, ydest: Int, width: Int, height: Int, hdcsrc: Hdc, xsrc: Int, ysrc: Int, hbmmask: Hbitmap, xmask: Int, ymask: Int, rop: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mergeFontPackage(puchmergefontbuffer: COpaquePointer?, ulmergefontbuffersize: UInt, puchfontpackagebuffer: COpaquePointer?, ulfontpackagebuffersize: UInt, ppuchdestbuffer: COpaquePointer?, puldestbuffersize: COpaquePointer?, pulbyteswritten: COpaquePointer?, usmode: UShort, lpfnallocate: CfpAllocproc, lpfnreallocate: CfpReallocproc, lpfnfree: CfpFreeproc, lpvreserved: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun modifyWorldTransform(hdc: Hdc, lpxf: COpaquePointer?, mode: ModifyWorldTransformMode): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun monitorFromPoint(pt: Point, dwflags: MonitorFromFlags): Hmonitor =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun monitorFromRect(lprc: COpaquePointer?, dwflags: MonitorFromFlags): Hmonitor =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun monitorFromWindow(hwnd: Hwnd, dwflags: MonitorFromFlags): Hmonitor =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun moveToEx(hdc: Hdc, x: Int, y: Int, lppt: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun offsetClipRgn(hdc: Hdc, x: Int, y: Int): GdiRegionType =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun offsetRect(lprc: COpaquePointer?, dx: Int, dy: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun offsetRgn(hrgn: Hrgn, x: Int, y: Int): GdiRegionType =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun offsetViewportOrgEx(hdc: Hdc, x: Int, y: Int, lppt: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun offsetWindowOrgEx(hdc: Hdc, x: Int, y: Int, lppt: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun paintDesktop(hdc: Hdc): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun paintRgn(hdc: Hdc, hrgn: Hrgn): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun patBlt(hdc: Hdc, x: Int, y: Int, w: Int, h: Int, rop: RopCode): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pathToRegion(hdc: Hdc): Hrgn =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pie(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun playEnhMetaFile(hdc: Hdc, hmf: Henhmetafile, lprect: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun playEnhMetaFileRecord(hdc: Hdc, pht: COpaquePointer?, pmr: COpaquePointer?, cht: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun playMetaFile(hdc: Hdc, hmf: Hmetafile): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun playMetaFileRecord(hdc: Hdc, lphandletable: COpaquePointer?, lpmr: COpaquePointer?, noobjs: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun plgBlt(hdcdest: Hdc, lppoint: COpaquePointer?, hdcsrc: Hdc, xsrc: Int, ysrc: Int, width: Int, height: Int, hbmmask: Hbitmap, xmask: Int, ymask: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun polyBezier(hdc: Hdc, apt: COpaquePointer?, cpt: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun polyBezierTo(hdc: Hdc, apt: COpaquePointer?, cpt: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun polyDraw(hdc: Hdc, apt: COpaquePointer?, aj: COpaquePointer?, cpt: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun polyPolygon(hdc: Hdc, apt: COpaquePointer?, asz: COpaquePointer?, csz: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun polyPolyline(hdc: Hdc, apt: COpaquePointer?, asz: COpaquePointer?, csz: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun polyTextOutA(hdc: Hdc, ppt: COpaquePointer?, nstrings: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun polyTextOutW(hdc: Hdc, ppt: COpaquePointer?, nstrings: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun polygon(hdc: Hdc, apt: COpaquePointer?, cpt: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun polyline(hdc: Hdc, apt: COpaquePointer?, cpt: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun polylineTo(hdc: Hdc, apt: COpaquePointer?, cpt: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ptInRect(lprc: COpaquePointer?, pt: Point): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ptInRegion(hrgn: Hrgn, x: Int, y: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ptVisible(hdc: Hdc, x: Int, y: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun realizePalette(hdc: Hdc): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rectInRegion(hrgn: Hrgn, lprect: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rectVisible(hdc: Hdc, lprect: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rectangle(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun redrawWindow(hwnd: Hwnd, lprcupdate: COpaquePointer?, hrgnupdate: Hrgn, flags: RedrawWindowFlags): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun releaseDC(hwnd: Hwnd, hdc: Hdc): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun removeFontMemResourceEx(h: Handle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun removeFontResourceA(lpfilename: Pcstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun removeFontResourceExA(name: Pcstr, fl: UInt, pdv: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun removeFontResourceExW(name: Pcwstr, fl: UInt, pdv: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun removeFontResourceW(lpfilename: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun resetDCA(hdc: Hdc, lpdm: COpaquePointer?): Hdc =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun resetDCW(hdc: Hdc, lpdm: COpaquePointer?): Hdc =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun resizePalette(hpal: Hpalette, n: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun restoreDC(hdc: Hdc, nsaveddc: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun roundRect(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int, width: Int, height: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun saveDC(hdc: Hdc): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scaleViewportExtEx(hdc: Hdc, xn: Int, dx: Int, yn: Int, yd: Int, lpsz: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun scaleWindowExtEx(hdc: Hdc, xn: Int, xd: Int, yn: Int, yd: Int, lpsz: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun screenToClient(hwnd: Hwnd, lppoint: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun selectClipPath(hdc: Hdc, mode: RgnCombineMode): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun selectClipRgn(hdc: Hdc, hrgn: Hrgn): GdiRegionType =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun selectObject(hdc: Hdc, h: Hgdiobj): Hgdiobj =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun selectPalette(hdc: Hdc, hpal: Hpalette, bforcebkgd: Bool): Hpalette =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setArcDirection(hdc: Hdc, dir: ArcDirection): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setBitmapBits(hbm: Hbitmap, cb: UInt, pvbits: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setBitmapDimensionEx(hbm: Hbitmap, w: Int, h: Int, lpsz: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setBkColor(hdc: Hdc, color: Colorref): Colorref =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setBkMode(hdc: Hdc, mode: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setBoundsRect(hdc: Hdc, lprect: COpaquePointer?, flags: SetBoundsRectFlags): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setBrushOrgEx(hdc: Hdc, x: Int, y: Int, lppt: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setColorAdjustment(hdc: Hdc, lpca: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setDCBrushColor(hdc: Hdc, color: Colorref): Colorref =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setDCPenColor(hdc: Hdc, color: Colorref): Colorref =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setDIBColorTable(hdc: Hdc, istart: UInt, centries: UInt, prgbq: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setDIBits(hdc: Hdc, hbm: Hbitmap, start: UInt, clines: UInt, lpbits: COpaquePointer?, lpbmi: COpaquePointer?, coloruse: DibUsage): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setDIBitsToDevice(hdc: Hdc, xdest: Int, ydest: Int, w: UInt, h: UInt, xsrc: Int, ysrc: Int, startscan: UInt, clines: UInt, lpvbits: COpaquePointer?, lpbmi: COpaquePointer?, coloruse: DibUsage): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setEnhMetaFileBits(nsize: UInt, pb: COpaquePointer?): Henhmetafile =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setGraphicsMode(hdc: Hdc, imode: GraphicsMode): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setLayout(hdc: Hdc, l: DcLayout): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setMapMode(hdc: Hdc, imode: HdcMapMode): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setMapperFlags(hdc: Hdc, flags: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setMetaFileBitsEx(cbbuffer: UInt, lpdata: COpaquePointer?): Hmetafile =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setMetaRgn(hdc: Hdc): GdiRegionType =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setMiterLimit(hdc: Hdc, limit: Float, old: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setPaletteEntries(hpal: Hpalette, istart: UInt, centries: UInt, ppalentries: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setPixel(hdc: Hdc, x: Int, y: Int, color: Colorref): Colorref =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setPixelV(hdc: Hdc, x: Int, y: Int, color: Colorref): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setPolyFillMode(hdc: Hdc, mode: CreatePolygonRgnMode): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setROP2(hdc: Hdc, rop2: R2Mode): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setRect(lprc: COpaquePointer?, xleft: Int, ytop: Int, xright: Int, ybottom: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setRectEmpty(lprc: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setRectRgn(hrgn: Hrgn, left: Int, top: Int, right: Int, bottom: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setStretchBltMode(hdc: Hdc, mode: StretchBltMode): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setSysColors(celements: Int, lpaelements: COpaquePointer?, lpargbvalues: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setSystemPaletteUse(hdc: Hdc, use: SystemPaletteUse): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setTextAlign(hdc: Hdc, align: TextAlignOptions): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setTextCharacterExtra(hdc: Hdc, extra: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setTextColor(hdc: Hdc, color: Colorref): Colorref =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setTextJustification(hdc: Hdc, extra: Int, count: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setViewportExtEx(hdc: Hdc, x: Int, y: Int, lpsz: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setViewportOrgEx(hdc: Hdc, x: Int, y: Int, lppt: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setWindowExtEx(hdc: Hdc, x: Int, y: Int, lpsz: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setWindowOrgEx(hdc: Hdc, x: Int, y: Int, lppt: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setWindowRgn(hwnd: Hwnd, hrgn: Hrgn, bredraw: Bool): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setWorldTransform(hdc: Hdc, lpxf: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun stretchBlt(hdcdest: Hdc, xdest: Int, ydest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xsrc: Int, ysrc: Int, wsrc: Int, hsrc: Int, rop: RopCode): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun stretchDIBits(hdc: Hdc, xdest: Int, ydest: Int, destwidth: Int, destheight: Int, xsrc: Int, ysrc: Int, srcwidth: Int, srcheight: Int, lpbits: COpaquePointer?, lpbmi: COpaquePointer?, iusage: DibUsage, rop: RopCode): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strokeAndFillPath(hdc: Hdc): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strokePath(hdc: Hdc): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun subtractRect(lprcdst: COpaquePointer?, lprcsrc1: COpaquePointer?, lprcsrc2: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tTCharToUnicode(hdc: Hdc, puccharcodes: COpaquePointer?, ulcharcodesize: UInt, pusshortcodes: COpaquePointer?, ulshortcodesize: UInt, ulflags: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tTDeleteEmbeddedFont(hfontreference: Handle, ulflags: UInt, pulstatus: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tTEmbedFont(hdc: Hdc, ulflags: TtembedFlags, ulcharset: EmbedFontCharset, pulprivstatus: COpaquePointer?, pulstatus: COpaquePointer?, lpfnwritetostream: Writeembedproc, lpvwritestream: COpaquePointer?, puscharcodeset: COpaquePointer?, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tTEmbedFontEx(hdc: Hdc, ulflags: TtembedFlags, ulcharset: EmbedFontCharset, pulprivstatus: COpaquePointer?, pulstatus: COpaquePointer?, lpfnwritetostream: Writeembedproc, lpvwritestream: COpaquePointer?, pulcharcodeset: COpaquePointer?, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tTEmbedFontFromFileA(hdc: Hdc, szfontfilename: Pcstr, usttcindex: UShort, ulflags: TtembedFlags, ulcharset: EmbedFontCharset, pulprivstatus: COpaquePointer?, pulstatus: COpaquePointer?, lpfnwritetostream: Writeembedproc, lpvwritestream: COpaquePointer?, puscharcodeset: COpaquePointer?, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tTEnableEmbeddingForFacename(lpszfacename: Pcstr, benable: Bool): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tTGetEmbeddedFontInfo(ulflags: TtembedFlags, pulprivstatus: COpaquePointer?, ulprivs: FontLicensePrivs, pulstatus: COpaquePointer?, lpfnreadfromstream: Readembedproc, lpvreadstream: COpaquePointer?, pttloadinfo: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tTGetEmbeddingType(hdc: Hdc, pulembedtype: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tTGetNewFontName(phfontreference: COpaquePointer?, wzwinfamilyname: Pwstr, cchmaxwinname: Int, szmacfamilyname: Pstr, cchmaxmacname: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tTIsEmbeddingEnabled(hdc: Hdc, pbenabled: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tTIsEmbeddingEnabledForFacename(lpszfacename: Pcstr, pbenabled: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tTLoadEmbeddedFont(phfontreference: COpaquePointer?, ulflags: UInt, pulprivstatus: COpaquePointer?, ulprivs: FontLicensePrivs, pulstatus: COpaquePointer?, lpfnreadfromstream: Readembedproc, lpvreadstream: COpaquePointer?, szwinfamilyname: Pcwstr, szmacfamilyname: Pcstr, pttloadinfo: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tTRunValidationTests(hdc: Hdc, ptestparam: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tTRunValidationTestsEx(hdc: Hdc, ptestparam: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tabbedTextOutA(hdc: Hdc, x: Int, y: Int, lpstring: Pcstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: COpaquePointer?, ntaborigin: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tabbedTextOutW(hdc: Hdc, x: Int, y: Int, lpstring: Pcwstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: COpaquePointer?, ntaborigin: Int): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun textOutA(hdc: Hdc, x: Int, y: Int, lpstring: Pcstr, c: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun textOutW(hdc: Hdc, x: Int, y: Int, lpstring: Pcwstr, c: Int): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun transparentBlt(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unionRect(lprcdst: COpaquePointer?, lprcsrc1: COpaquePointer?, lprcsrc2: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unrealizeObject(h: Hgdiobj): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun updateColors(hdc: Hdc): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun updateWindow(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun validateRect(hwnd: Hwnd, lprect: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun validateRgn(hwnd: Hwnd, hrgn: Hrgn): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun widenPath(hdc: Hdc): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun windowFromDC(hdc: Hdc): Hwnd =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wglSwapMultipleBuffers(param0: UInt, param1: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
