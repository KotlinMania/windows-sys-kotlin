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

private object WindowsWin32GraphicsGdiJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_abortPath(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_addFontMemResourceEx(pfileview: Long, cjsize: Int, pvresrved: Long, pnumfonts: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_addFontResourceA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_addFontResourceExA(name: Long, fl: Int, res: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_addFontResourceExW(name: Long, fl: Int, res: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_addFontResourceW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_angleArc(hdc: Long, x: Int, y: Int, r: Int, startangle: Float, sweepangle: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_animatePalette(hpal: Long, istartindex: Int, centries: Int, ppe: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_arc(hdc: Long, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_arcTo(hdc: Long, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_beginPaint(hwnd: Long, lppaint: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_beginPath(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_bitBlt(hdc: Long, x: Int, y: Int, cx: Int, cy: Int, hdcsrc: Long, x1: Int, y1: Int, rop: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_cancelDC(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_changeDisplaySettingsA(lpdevmode: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_changeDisplaySettingsExA(lpszdevicename: Long, lpdevmode: Long, hwnd: Long, dwflags: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_changeDisplaySettingsExW(lpszdevicename: Long, lpdevmode: Long, hwnd: Long, dwflags: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_changeDisplaySettingsW(lpdevmode: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_chord(hdc: Long, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_clientToScreen(hwnd: Long, lppoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_closeEnhMetaFile(hdc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_closeFigure(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_closeMetaFile(hdc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_combineRgn(hrgndst: Long, hrgnsrc1: Long, hrgnsrc2: Long, imode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_combineTransform(lpxfout: Long, lpxf1: Long, lpxf2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_copyEnhMetaFileA(henh: Long, lpfilename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_copyEnhMetaFileW(henh: Long, lpfilename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_copyMetaFileA(param0: Long, param1: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_copyMetaFileW(param0: Long, param1: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_copyRect(lprcdst: Long, lprcsrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createBitmap(nwidth: Int, nheight: Int, nplanes: Int, nbitcount: Int, lpbits: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createBitmapIndirect(pbm: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createBrushIndirect(plbrush: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createCompatibleBitmap(hdc: Long, cx: Int, cy: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createCompatibleDC(hdc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createDCA(pwszdriver: Long, pwszdevice: Long, pszport: Long, pdm: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createDCW(pwszdriver: Long, pwszdevice: Long, pszport: Long, pdm: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createDIBPatternBrush(h: Long, iusage: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createDIBPatternBrushPt(lppackeddib: Long, iusage: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createDIBSection(hdc: Long, pbmi: Long, usage: Int, ppvbits: Long, hsection: Long, offset: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createDIBitmap(hdc: Long, pbmih: Long, flinit: Int, pjbits: Long, pbmi: Long, iusage: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createDiscardableBitmap(hdc: Long, cx: Int, cy: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createEllipticRgn(x1: Int, y1: Int, x2: Int, y2: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createEllipticRgnIndirect(lprect: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createEnhMetaFileA(hdc: Long, lpfilename: Long, lprc: Long, lpdesc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createEnhMetaFileW(hdc: Long, lpfilename: Long, lprc: Long, lpdesc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createFontA(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: Int, bunderline: Int, bstrikeout: Int, icharset: Int, ioutprecision: Int, iclipprecision: Int, iquality: Int, ipitchandfamily: Int, pszfacename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createFontIndirectA(lplf: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createFontIndirectExA(param0: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createFontIndirectExW(param0: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createFontIndirectW(lplf: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createFontPackage(puchsrcbuffer: Long, ulsrcbuffersize: Int, ppuchfontpackagebuffer: Long, pulfontpackagebuffersize: Long, pulbyteswritten: Long, usflag: Short, usttcindex: Short, ussubsetformat: Short, ussubsetlanguage: Short, ussubsetplatform: Short, ussubsetencoding: Short, pussubsetkeeplist: Long, ussubsetlistcount: Short, lpfnallocate: Long, lpfnreallocate: Long, lpfnfree: Long, lpvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createFontW(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: Int, bunderline: Int, bstrikeout: Int, icharset: Int, ioutprecision: Int, iclipprecision: Int, iquality: Int, ipitchandfamily: Int, pszfacename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createHalftonePalette(hdc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createHatchBrush(ihatch: Int, color: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createICA(pszdriver: Long, pszdevice: Long, pszport: Long, pdm: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createICW(pszdriver: Long, pszdevice: Long, pszport: Long, pdm: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createMetaFileA(pszfile: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createMetaFileW(pszfile: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createPalette(plpal: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createPatternBrush(hbm: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createPen(istyle: Int, cwidth: Int, color: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createPenIndirect(plpen: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createPolyPolygonRgn(pptl: Long, pc: Long, cpoly: Int, imode: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createPolygonRgn(pptl: Long, cpoint: Int, imode: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createRectRgn(x1: Int, y1: Int, x2: Int, y2: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createRectRgnIndirect(lprect: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createRoundRectRgn(x1: Int, y1: Int, x2: Int, y2: Int, w: Int, h: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createScalableFontResourceA(fdwhidden: Int, lpszfont: Long, lpszfile: Long, lpszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createScalableFontResourceW(fdwhidden: Int, lpszfont: Long, lpszfile: Long, lpszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_createSolidBrush(color: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_dPtoLP(hdc: Long, lppt: Long, c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_deleteDC(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_deleteEnhMetaFile(hmf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_deleteMetaFile(hmf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_deleteObject(ho: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_drawAnimatedRects(hwnd: Long, idani: Int, lprcfrom: Long, lprcto: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_drawCaption(hwnd: Long, hdc: Long, lprect: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_drawEdge(hdc: Long, qrc: Long, edge: Int, grfflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_drawEscape(hdc: Long, iescape: Int, cjin: Int, lpin: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_drawFocusRect(hdc: Long, lprc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_drawFrameControl(param0: Long, param1: Long, param2: Int, param3: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_drawStateA(hdc: Long, hbrfore: Long, qfncallback: Long, ldata: Long, wdata: Long, x: Int, y: Int, cx: Int, cy: Int, uflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_drawStateW(hdc: Long, hbrfore: Long, qfncallback: Long, ldata: Long, wdata: Long, x: Int, y: Int, cx: Int, cy: Int, uflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_drawTextA(hdc: Long, lpchtext: Long, cchtext: Int, lprc: Long, format: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_drawTextExA(hdc: Long, lpchtext: Long, cchtext: Int, lprc: Long, format: Int, lpdtp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_drawTextExW(hdc: Long, lpchtext: Long, cchtext: Int, lprc: Long, format: Int, lpdtp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_drawTextW(hdc: Long, lpchtext: Long, cchtext: Int, lprc: Long, format: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_ellipse(hdc: Long, left: Int, top: Int, right: Int, bottom: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_endPaint(hwnd: Long, lppaint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_endPath(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_enumDisplayDevicesA(lpdevice: Long, idevnum: Int, lpdisplaydevice: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_enumDisplayDevicesW(lpdevice: Long, idevnum: Int, lpdisplaydevice: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_enumDisplayMonitors(hdc: Long, lprcclip: Long, lpfnenum: Long, dwdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_enumDisplaySettingsA(lpszdevicename: Long, imodenum: Int, lpdevmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_enumDisplaySettingsExA(lpszdevicename: Long, imodenum: Int, lpdevmode: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_enumDisplaySettingsExW(lpszdevicename: Long, imodenum: Int, lpdevmode: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_enumDisplaySettingsW(lpszdevicename: Long, imodenum: Int, lpdevmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_enumEnhMetaFile(hdc: Long, hmf: Long, proc: Long, param3: Long, lprect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_enumFontFamiliesA(hdc: Long, lplogfont: Long, lpproc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_enumFontFamiliesExA(hdc: Long, lplogfont: Long, lpproc: Long, lparam: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_enumFontFamiliesExW(hdc: Long, lplogfont: Long, lpproc: Long, lparam: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_enumFontFamiliesW(hdc: Long, lplogfont: Long, lpproc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_enumFontsA(hdc: Long, lplogfont: Long, lpproc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_enumFontsW(hdc: Long, lplogfont: Long, lpproc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_enumMetaFile(hdc: Long, hmf: Long, proc: Long, param3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_enumObjects(hdc: Long, ntype: Int, lpfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_equalRect(lprc1: Long, lprc2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_equalRgn(hrgn1: Long, hrgn2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_excludeClipRect(hdc: Long, left: Int, top: Int, right: Int, bottom: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_excludeUpdateRgn(hdc: Long, hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_extCreatePen(ipenstyle: Int, cwidth: Int, plbrush: Long, cstyle: Int, pstyle: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_extCreateRegion(lpx: Long, ncount: Int, lpdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_extFloodFill(hdc: Long, x: Int, y: Int, color: Int, type: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_extSelectClipRgn(hdc: Long, hrgn: Long, mode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_extTextOutA(hdc: Long, x: Int, y: Int, options: Int, lprect: Long, lpstring: Long, c: Int, lpdx: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_extTextOutW(hdc: Long, x: Int, y: Int, options: Int, lprect: Long, lpstring: Long, c: Int, lpdx: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_fillPath(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_fillRect(hdc: Long, lprc: Long, hbr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_fillRgn(hdc: Long, hrgn: Long, hbr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_fixBrushOrgEx(hdc: Long, x: Int, y: Int, ptl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_flattenPath(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_floodFill(hdc: Long, x: Int, y: Int, color: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_frameRect(hdc: Long, lprc: Long, hbr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_frameRgn(hdc: Long, hrgn: Long, hbr: Long, w: Int, h: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_gdiComment(hdc: Long, nsize: Int, lpdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_gdiFlush(): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_gdiGetBatchLimit(): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_gdiGradientFill(hdc: Long, pvertex: Long, nvertex: Int, pmesh: Long, ncount: Int, ulmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_gdiSetBatchLimit(dw: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_gdiTransparentBlt(hdcdest: Long, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Long, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getArcDirection(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getAspectRatioFilterEx(hdc: Long, lpsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getBitmapBits(hbit: Long, cb: Int, lpvbits: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getBitmapDimensionEx(hbit: Long, lpsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getBkColor(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getBkMode(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getBoundsRect(hdc: Long, lprect: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getBrushOrgEx(hdc: Long, lppt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getCharABCWidthsA(hdc: Long, wfirst: Int, wlast: Int, lpabc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getCharABCWidthsFloatA(hdc: Long, ifirst: Int, ilast: Int, lpabc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getCharABCWidthsFloatW(hdc: Long, ifirst: Int, ilast: Int, lpabc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getCharABCWidthsI(hdc: Long, gifirst: Int, cgi: Int, pgi: Long, pabc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getCharABCWidthsW(hdc: Long, wfirst: Int, wlast: Int, lpabc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getCharWidth32A(hdc: Long, ifirst: Int, ilast: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getCharWidth32W(hdc: Long, ifirst: Int, ilast: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getCharWidthA(hdc: Long, ifirst: Int, ilast: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getCharWidthFloatA(hdc: Long, ifirst: Int, ilast: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getCharWidthFloatW(hdc: Long, ifirst: Int, ilast: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getCharWidthI(hdc: Long, gifirst: Int, cgi: Int, pgi: Long, piwidths: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getCharWidthW(hdc: Long, ifirst: Int, ilast: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getCharacterPlacementA(hdc: Long, lpstring: Long, ncount: Int, nmexextent: Int, lpresults: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getCharacterPlacementW(hdc: Long, lpstring: Long, ncount: Int, nmexextent: Int, lpresults: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getClipBox(hdc: Long, lprect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getClipRgn(hdc: Long, hrgn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getColorAdjustment(hdc: Long, lpca: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getCurrentObject(hdc: Long, type: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getCurrentPositionEx(hdc: Long, lppt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getDC(hwnd: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getDCBrushColor(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getDCEx(hwnd: Long, hrgnclip: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getDCOrgEx(hdc: Long, lppt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getDCPenColor(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getDIBColorTable(hdc: Long, istart: Int, centries: Int, prgbq: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getDIBits(hdc: Long, hbm: Long, start: Int, clines: Int, lpvbits: Long, lpbmi: Long, usage: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getDeviceCaps(hdc: Long, index: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getEnhMetaFileA(lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getEnhMetaFileBits(hemf: Long, nsize: Int, lpdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getEnhMetaFileDescriptionA(hemf: Long, cchbuffer: Int, lpdescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getEnhMetaFileDescriptionW(hemf: Long, cchbuffer: Int, lpdescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getEnhMetaFileHeader(hemf: Long, nsize: Int, lpenhmetaheader: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getEnhMetaFilePaletteEntries(hemf: Long, nnumentries: Int, lppaletteentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getEnhMetaFileW(lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getFontData(hdc: Long, dwtable: Int, dwoffset: Int, pvbuffer: Long, cjbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getFontLanguageInfo(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getFontUnicodeRanges(hdc: Long, lpgs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getGlyphIndicesA(hdc: Long, lpstr: Long, c: Int, pgi: Long, fl: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getGlyphIndicesW(hdc: Long, lpstr: Long, c: Int, pgi: Long, fl: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getGlyphOutlineA(hdc: Long, uchar: Int, fuformat: Int, lpgm: Long, cjbuffer: Int, pvbuffer: Long, lpmat2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getGlyphOutlineW(hdc: Long, uchar: Int, fuformat: Int, lpgm: Long, cjbuffer: Int, pvbuffer: Long, lpmat2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getGraphicsMode(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getKerningPairsA(hdc: Long, npairs: Int, lpkernpair: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getKerningPairsW(hdc: Long, npairs: Int, lpkernpair: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getLayout(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getMapMode(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getMetaFileA(lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getMetaFileBitsEx(hmf: Long, cbbuffer: Int, lpdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getMetaFileW(lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getMetaRgn(hdc: Long, hrgn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getMiterLimit(hdc: Long, plimit: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getMonitorInfoA(hmonitor: Long, lpmi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getMonitorInfoW(hmonitor: Long, lpmi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getNearestColor(hdc: Long, color: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getNearestPaletteIndex(h: Long, color: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getObjectA(h: Long, c: Int, pv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getObjectType(h: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getObjectW(h: Long, c: Int, pv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getOutlineTextMetricsA(hdc: Long, cjcopy: Int, potm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getOutlineTextMetricsW(hdc: Long, cjcopy: Int, potm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getPaletteEntries(hpal: Long, istart: Int, centries: Int, ppalentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getPath(hdc: Long, apt: Long, aj: Long, cpt: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getPixel(hdc: Long, x: Int, y: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getPolyFillMode(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getROP2(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getRandomRgn(hdc: Long, hrgn: Long, i: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getRasterizerCaps(lpraststat: Long, cjbytes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getRegionData(hrgn: Long, ncount: Int, lprgndata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getRgnBox(hrgn: Long, lprc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getStockObject(i: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getStretchBltMode(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getSysColor(nindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getSysColorBrush(nindex: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getSystemPaletteEntries(hdc: Long, istart: Int, centries: Int, ppalentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getSystemPaletteUse(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getTabbedTextExtentA(hdc: Long, lpstring: Long, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getTabbedTextExtentW(hdc: Long, lpstring: Long, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getTextAlign(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getTextCharacterExtra(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getTextColor(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getTextExtentExPointA(hdc: Long, lpszstring: Long, cchstring: Int, nmaxextent: Int, lpnfit: Long, lpndx: Long, lpsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getTextExtentExPointI(hdc: Long, lpwszstring: Long, cwchstring: Int, nmaxextent: Int, lpnfit: Long, lpndx: Long, lpsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getTextExtentExPointW(hdc: Long, lpszstring: Long, cchstring: Int, nmaxextent: Int, lpnfit: Long, lpndx: Long, lpsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getTextExtentPoint32A(hdc: Long, lpstring: Long, c: Int, psizl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getTextExtentPoint32W(hdc: Long, lpstring: Long, c: Int, psizl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getTextExtentPointA(hdc: Long, lpstring: Long, c: Int, lpsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getTextExtentPointI(hdc: Long, pgiin: Long, cgi: Int, psize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getTextExtentPointW(hdc: Long, lpstring: Long, c: Int, lpsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getTextFaceA(hdc: Long, c: Int, lpname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getTextFaceW(hdc: Long, c: Int, lpname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getTextMetricsA(hdc: Long, lptm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getTextMetricsW(hdc: Long, lptm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getUpdateRect(hwnd: Long, lprect: Long, berase: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getUpdateRgn(hwnd: Long, hrgn: Long, berase: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getViewportExtEx(hdc: Long, lpsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getViewportOrgEx(hdc: Long, lppoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getWinMetaFileBits(hemf: Long, cbdata16: Int, pdata16: Long, imapmode: Int, hdcref: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getWindowDC(hwnd: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getWindowExtEx(hdc: Long, lpsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getWindowOrgEx(hdc: Long, lppoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getWindowRgn(hwnd: Long, hrgn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getWindowRgnBox(hwnd: Long, lprc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_getWorldTransform(hdc: Long, lpxf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_gradientFill(hdc: Long, pvertex: Long, nvertex: Int, pmesh: Long, nmesh: Int, ulmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_grayStringA(hdc: Long, hbrush: Long, lpoutputfunc: Long, lpdata: Long, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_grayStringW(hdc: Long, hbrush: Long, lpoutputfunc: Long, lpdata: Long, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_inflateRect(lprc: Long, dx: Int, dy: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_intersectClipRect(hdc: Long, left: Int, top: Int, right: Int, bottom: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_intersectRect(lprcdst: Long, lprcsrc1: Long, lprcsrc2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_invalidateRect(hwnd: Long, lprect: Long, berase: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_invalidateRgn(hwnd: Long, hrgn: Long, berase: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_invertRect(hdc: Long, lprc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_invertRgn(hdc: Long, hrgn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_isRectEmpty(lprc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_lPtoDP(hdc: Long, lppt: Long, c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_lineDDA(xstart: Int, ystart: Int, xend: Int, yend: Int, lpproc: Long, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_lineTo(hdc: Long, x: Int, y: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_loadBitmapA(hinstance: Long, lpbitmapname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_loadBitmapW(hinstance: Long, lpbitmapname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_lockWindowUpdate(hwndlock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_mapWindowPoints(hwndfrom: Long, hwndto: Long, lppoints: Long, cpoints: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_maskBlt(hdcdest: Long, xdest: Int, ydest: Int, width: Int, height: Int, hdcsrc: Long, xsrc: Int, ysrc: Int, hbmmask: Long, xmask: Int, ymask: Int, rop: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_mergeFontPackage(puchmergefontbuffer: Long, ulmergefontbuffersize: Int, puchfontpackagebuffer: Long, ulfontpackagebuffersize: Int, ppuchdestbuffer: Long, puldestbuffersize: Long, pulbyteswritten: Long, usmode: Short, lpfnallocate: Long, lpfnreallocate: Long, lpfnfree: Long, lpvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_modifyWorldTransform(hdc: Long, lpxf: Long, mode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_monitorFromRect(lprc: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_monitorFromWindow(hwnd: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_moveToEx(hdc: Long, x: Int, y: Int, lppt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_offsetClipRgn(hdc: Long, x: Int, y: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_offsetRect(lprc: Long, dx: Int, dy: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_offsetRgn(hrgn: Long, x: Int, y: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_offsetViewportOrgEx(hdc: Long, x: Int, y: Int, lppt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_offsetWindowOrgEx(hdc: Long, x: Int, y: Int, lppt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_paintDesktop(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_paintRgn(hdc: Long, hrgn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_patBlt(hdc: Long, x: Int, y: Int, w: Int, h: Int, rop: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_pathToRegion(hdc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_pie(hdc: Long, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_playEnhMetaFile(hdc: Long, hmf: Long, lprect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_playEnhMetaFileRecord(hdc: Long, pht: Long, pmr: Long, cht: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_playMetaFile(hdc: Long, hmf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_playMetaFileRecord(hdc: Long, lphandletable: Long, lpmr: Long, noobjs: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_plgBlt(hdcdest: Long, lppoint: Long, hdcsrc: Long, xsrc: Int, ysrc: Int, width: Int, height: Int, hbmmask: Long, xmask: Int, ymask: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_polyBezier(hdc: Long, apt: Long, cpt: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_polyBezierTo(hdc: Long, apt: Long, cpt: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_polyDraw(hdc: Long, apt: Long, aj: Long, cpt: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_polyPolygon(hdc: Long, apt: Long, asz: Long, csz: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_polyPolyline(hdc: Long, apt: Long, asz: Long, csz: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_polyTextOutA(hdc: Long, ppt: Long, nstrings: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_polyTextOutW(hdc: Long, ppt: Long, nstrings: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_polygon(hdc: Long, apt: Long, cpt: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_polyline(hdc: Long, apt: Long, cpt: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_polylineTo(hdc: Long, apt: Long, cpt: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_ptInRegion(hrgn: Long, x: Int, y: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_ptVisible(hdc: Long, x: Int, y: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_realizePalette(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_rectInRegion(hrgn: Long, lprect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_rectVisible(hdc: Long, lprect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_rectangle(hdc: Long, left: Int, top: Int, right: Int, bottom: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_redrawWindow(hwnd: Long, lprcupdate: Long, hrgnupdate: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_releaseDC(hwnd: Long, hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_removeFontMemResourceEx(h: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_removeFontResourceA(lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_removeFontResourceExA(name: Long, fl: Int, pdv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_removeFontResourceExW(name: Long, fl: Int, pdv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_removeFontResourceW(lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_resetDCA(hdc: Long, lpdm: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_resetDCW(hdc: Long, lpdm: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_resizePalette(hpal: Long, n: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_restoreDC(hdc: Long, nsaveddc: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_roundRect(hdc: Long, left: Int, top: Int, right: Int, bottom: Int, width: Int, height: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_saveDC(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_scaleViewportExtEx(hdc: Long, xn: Int, dx: Int, yn: Int, yd: Int, lpsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_scaleWindowExtEx(hdc: Long, xn: Int, xd: Int, yn: Int, yd: Int, lpsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_screenToClient(hwnd: Long, lppoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_selectClipPath(hdc: Long, mode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_selectClipRgn(hdc: Long, hrgn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_selectObject(hdc: Long, h: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_selectPalette(hdc: Long, hpal: Long, bforcebkgd: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setArcDirection(hdc: Long, dir: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setBitmapBits(hbm: Long, cb: Int, pvbits: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setBitmapDimensionEx(hbm: Long, w: Int, h: Int, lpsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setBkColor(hdc: Long, color: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setBkMode(hdc: Long, mode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setBoundsRect(hdc: Long, lprect: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setBrushOrgEx(hdc: Long, x: Int, y: Int, lppt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setColorAdjustment(hdc: Long, lpca: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setDCBrushColor(hdc: Long, color: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setDCPenColor(hdc: Long, color: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setDIBColorTable(hdc: Long, istart: Int, centries: Int, prgbq: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setDIBits(hdc: Long, hbm: Long, start: Int, clines: Int, lpbits: Long, lpbmi: Long, coloruse: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setDIBitsToDevice(hdc: Long, xdest: Int, ydest: Int, w: Int, h: Int, xsrc: Int, ysrc: Int, startscan: Int, clines: Int, lpvbits: Long, lpbmi: Long, coloruse: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setEnhMetaFileBits(nsize: Int, pb: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setGraphicsMode(hdc: Long, imode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setLayout(hdc: Long, l: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setMapMode(hdc: Long, imode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setMapperFlags(hdc: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setMetaFileBitsEx(cbbuffer: Int, lpdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setMetaRgn(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setMiterLimit(hdc: Long, limit: Float, old: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setPaletteEntries(hpal: Long, istart: Int, centries: Int, ppalentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setPixel(hdc: Long, x: Int, y: Int, color: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setPixelV(hdc: Long, x: Int, y: Int, color: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setPolyFillMode(hdc: Long, mode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setROP2(hdc: Long, rop2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setRect(lprc: Long, xleft: Int, ytop: Int, xright: Int, ybottom: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setRectEmpty(lprc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setRectRgn(hrgn: Long, left: Int, top: Int, right: Int, bottom: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setStretchBltMode(hdc: Long, mode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setSysColors(celements: Int, lpaelements: Long, lpargbvalues: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setSystemPaletteUse(hdc: Long, use: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setTextAlign(hdc: Long, align: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setTextCharacterExtra(hdc: Long, extra: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setTextColor(hdc: Long, color: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setTextJustification(hdc: Long, extra: Int, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setViewportExtEx(hdc: Long, x: Int, y: Int, lpsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setViewportOrgEx(hdc: Long, x: Int, y: Int, lppt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setWindowExtEx(hdc: Long, x: Int, y: Int, lpsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setWindowOrgEx(hdc: Long, x: Int, y: Int, lppt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setWindowRgn(hwnd: Long, hrgn: Long, bredraw: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_setWorldTransform(hdc: Long, lpxf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_stretchBlt(hdcdest: Long, xdest: Int, ydest: Int, wdest: Int, hdest: Int, hdcsrc: Long, xsrc: Int, ysrc: Int, wsrc: Int, hsrc: Int, rop: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_stretchDIBits(hdc: Long, xdest: Int, ydest: Int, destwidth: Int, destheight: Int, xsrc: Int, ysrc: Int, srcwidth: Int, srcheight: Int, lpbits: Long, lpbmi: Long, iusage: Int, rop: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_strokeAndFillPath(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_strokePath(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_subtractRect(lprcdst: Long, lprcsrc1: Long, lprcsrc2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_tTCharToUnicode(hdc: Long, puccharcodes: Long, ulcharcodesize: Int, pusshortcodes: Long, ulshortcodesize: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_tTDeleteEmbeddedFont(hfontreference: Long, ulflags: Int, pulstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_tTEmbedFont(hdc: Long, ulflags: Int, ulcharset: Int, pulprivstatus: Long, pulstatus: Long, lpfnwritetostream: Long, lpvwritestream: Long, puscharcodeset: Long, uscharcodecount: Short, uslanguage: Short, pttembedinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_tTEmbedFontEx(hdc: Long, ulflags: Int, ulcharset: Int, pulprivstatus: Long, pulstatus: Long, lpfnwritetostream: Long, lpvwritestream: Long, pulcharcodeset: Long, uscharcodecount: Short, uslanguage: Short, pttembedinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_tTEmbedFontFromFileA(hdc: Long, szfontfilename: Long, usttcindex: Short, ulflags: Int, ulcharset: Int, pulprivstatus: Long, pulstatus: Long, lpfnwritetostream: Long, lpvwritestream: Long, puscharcodeset: Long, uscharcodecount: Short, uslanguage: Short, pttembedinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_tTEnableEmbeddingForFacename(lpszfacename: Long, benable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_tTGetEmbeddedFontInfo(ulflags: Int, pulprivstatus: Long, ulprivs: Int, pulstatus: Long, lpfnreadfromstream: Long, lpvreadstream: Long, pttloadinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_tTGetEmbeddingType(hdc: Long, pulembedtype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_tTGetNewFontName(phfontreference: Long, wzwinfamilyname: Long, cchmaxwinname: Int, szmacfamilyname: Long, cchmaxmacname: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_tTIsEmbeddingEnabled(hdc: Long, pbenabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_tTIsEmbeddingEnabledForFacename(lpszfacename: Long, pbenabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_tTLoadEmbeddedFont(phfontreference: Long, ulflags: Int, pulprivstatus: Long, ulprivs: Int, pulstatus: Long, lpfnreadfromstream: Long, lpvreadstream: Long, szwinfamilyname: Long, szmacfamilyname: Long, pttloadinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_tTRunValidationTests(hdc: Long, ptestparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_tTRunValidationTestsEx(hdc: Long, ptestparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_tabbedTextOutA(hdc: Long, x: Int, y: Int, lpstring: Long, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long, ntaborigin: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_tabbedTextOutW(hdc: Long, x: Int, y: Int, lpstring: Long, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long, ntaborigin: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_textOutA(hdc: Long, x: Int, y: Int, lpstring: Long, c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_textOutW(hdc: Long, x: Int, y: Int, lpstring: Long, c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_transparentBlt(hdcdest: Long, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Long, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_unionRect(lprcdst: Long, lprcsrc1: Long, lprcsrc2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_unrealizeObject(h: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_updateColors(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_updateWindow(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_validateRect(hwnd: Long, lprect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_validateRgn(hwnd: Long, hrgn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_widenPath(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_windowFromDC(hdc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_wglSwapMultipleBuffers(param0: Int, param1: Long): Int
}

public actual fun abortPath(hdc: Hdc): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_abortPath((hdc?.value ?: 0L))

public actual fun addFontMemResourceEx(pfileview: COpaquePointer?, cjsize: UInt, pvresrved: COpaquePointer?, pnumfonts: COpaquePointer?): Handle =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_addFontMemResourceEx((pfileview?.value ?: 0L), cjsize.toInt(), (pvresrved?.value ?: 0L), (pnumfonts?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun addFontResourceA(param0: Pcstr): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_addFontResourceA((param0?.value ?: 0L))

public actual fun addFontResourceExA(name: Pcstr, fl: FontResourceCharacteristics, res: COpaquePointer?): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_addFontResourceExA((name?.value ?: 0L), fl.toInt(), (res?.value ?: 0L))

public actual fun addFontResourceExW(name: Pcwstr, fl: FontResourceCharacteristics, res: COpaquePointer?): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_addFontResourceExW((name?.value ?: 0L), fl.toInt(), (res?.value ?: 0L))

public actual fun addFontResourceW(param0: Pcwstr): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_addFontResourceW((param0?.value ?: 0L))

public actual fun alphaBlend(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, ftn: Blendfunction): Bool =
    0

public actual fun angleArc(hdc: Hdc, x: Int, y: Int, r: UInt, startangle: Float, sweepangle: Float): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_angleArc((hdc?.value ?: 0L), x, y, r.toInt(), startangle, sweepangle)

public actual fun animatePalette(hpal: Hpalette, istartindex: UInt, centries: UInt, ppe: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_animatePalette((hpal?.value ?: 0L), istartindex.toInt(), centries.toInt(), (ppe?.value ?: 0L))

public actual fun arc(hdc: Hdc, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_arc((hdc?.value ?: 0L), x1, y1, x2, y2, x3, y3, x4, y4)

public actual fun arcTo(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_arcTo((hdc?.value ?: 0L), left, top, right, bottom, xr1, yr1, xr2, yr2)

public actual fun beginPaint(hwnd: Hwnd, lppaint: COpaquePointer?): Hdc =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_beginPaint((hwnd?.value ?: 0L), (lppaint?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun beginPath(hdc: Hdc): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_beginPath((hdc?.value ?: 0L))

public actual fun bitBlt(hdc: Hdc, x: Int, y: Int, cx: Int, cy: Int, hdcsrc: Hdc, x1: Int, y1: Int, rop: RopCode): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_bitBlt((hdc?.value ?: 0L), x, y, cx, cy, (hdcsrc?.value ?: 0L), x1, y1, rop.toInt())

public actual fun cancelDC(hdc: Hdc): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_cancelDC((hdc?.value ?: 0L))

public actual fun changeDisplaySettingsA(lpdevmode: COpaquePointer?, dwflags: CdsType): DispChange =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_changeDisplaySettingsA((lpdevmode?.value ?: 0L), dwflags.toInt())

public actual fun changeDisplaySettingsExA(lpszdevicename: Pcstr, lpdevmode: COpaquePointer?, hwnd: Hwnd, dwflags: CdsType, lparam: COpaquePointer?): DispChange =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_changeDisplaySettingsExA((lpszdevicename?.value ?: 0L), (lpdevmode?.value ?: 0L), (hwnd?.value ?: 0L), dwflags.toInt(), (lparam?.value ?: 0L))

public actual fun changeDisplaySettingsExW(lpszdevicename: Pcwstr, lpdevmode: COpaquePointer?, hwnd: Hwnd, dwflags: CdsType, lparam: COpaquePointer?): DispChange =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_changeDisplaySettingsExW((lpszdevicename?.value ?: 0L), (lpdevmode?.value ?: 0L), (hwnd?.value ?: 0L), dwflags.toInt(), (lparam?.value ?: 0L))

public actual fun changeDisplaySettingsW(lpdevmode: COpaquePointer?, dwflags: CdsType): DispChange =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_changeDisplaySettingsW((lpdevmode?.value ?: 0L), dwflags.toInt())

public actual fun chord(hdc: Hdc, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_chord((hdc?.value ?: 0L), x1, y1, x2, y2, x3, y3, x4, y4)

public actual fun clientToScreen(hwnd: Hwnd, lppoint: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_clientToScreen((hwnd?.value ?: 0L), (lppoint?.value ?: 0L))

public actual fun closeEnhMetaFile(hdc: Hdc): Henhmetafile =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_closeEnhMetaFile((hdc?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun closeFigure(hdc: Hdc): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_closeFigure((hdc?.value ?: 0L))

public actual fun closeMetaFile(hdc: Hdc): Hmetafile =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_closeMetaFile((hdc?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun combineRgn(hrgndst: Hrgn, hrgnsrc1: Hrgn, hrgnsrc2: Hrgn, imode: RgnCombineMode): GdiRegionType =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_combineRgn((hrgndst?.value ?: 0L), (hrgnsrc1?.value ?: 0L), (hrgnsrc2?.value ?: 0L), imode)

public actual fun combineTransform(lpxfout: COpaquePointer?, lpxf1: COpaquePointer?, lpxf2: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_combineTransform((lpxfout?.value ?: 0L), (lpxf1?.value ?: 0L), (lpxf2?.value ?: 0L))

public actual fun copyEnhMetaFileA(henh: Henhmetafile, lpfilename: Pcstr): Henhmetafile =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_copyEnhMetaFileA((henh?.value ?: 0L), (lpfilename?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun copyEnhMetaFileW(henh: Henhmetafile, lpfilename: Pcwstr): Henhmetafile =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_copyEnhMetaFileW((henh?.value ?: 0L), (lpfilename?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun copyMetaFileA(param0: Hmetafile, param1: Pcstr): Hmetafile =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_copyMetaFileA((param0?.value ?: 0L), (param1?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun copyMetaFileW(param0: Hmetafile, param1: Pcwstr): Hmetafile =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_copyMetaFileW((param0?.value ?: 0L), (param1?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun copyRect(lprcdst: COpaquePointer?, lprcsrc: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_copyRect((lprcdst?.value ?: 0L), (lprcsrc?.value ?: 0L))

public actual fun createBitmap(nwidth: Int, nheight: Int, nplanes: UInt, nbitcount: UInt, lpbits: COpaquePointer?): Hbitmap =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createBitmap(nwidth, nheight, nplanes.toInt(), nbitcount.toInt(), (lpbits?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createBitmapIndirect(pbm: COpaquePointer?): Hbitmap =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createBitmapIndirect((pbm?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createBrushIndirect(plbrush: COpaquePointer?): Hbrush =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createBrushIndirect((plbrush?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createCompatibleBitmap(hdc: Hdc, cx: Int, cy: Int): Hbitmap =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createCompatibleBitmap((hdc?.value ?: 0L), cx, cy).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createCompatibleDC(hdc: Hdc): Hdc =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createCompatibleDC((hdc?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createDCA(pwszdriver: Pcstr, pwszdevice: Pcstr, pszport: Pcstr, pdm: COpaquePointer?): Hdc =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createDCA((pwszdriver?.value ?: 0L), (pwszdevice?.value ?: 0L), (pszport?.value ?: 0L), (pdm?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createDCW(pwszdriver: Pcwstr, pwszdevice: Pcwstr, pszport: Pcwstr, pdm: COpaquePointer?): Hdc =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createDCW((pwszdriver?.value ?: 0L), (pwszdevice?.value ?: 0L), (pszport?.value ?: 0L), (pdm?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createDIBPatternBrush(h: Hglobal, iusage: DibUsage): Hbrush =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createDIBPatternBrush((h?.value ?: 0L), iusage.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createDIBPatternBrushPt(lppackeddib: COpaquePointer?, iusage: DibUsage): Hbrush =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createDIBPatternBrushPt((lppackeddib?.value ?: 0L), iusage.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createDIBSection(hdc: Hdc, pbmi: COpaquePointer?, usage: DibUsage, ppvbits: COpaquePointer?, hsection: Handle, offset: UInt): Hbitmap =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createDIBSection((hdc?.value ?: 0L), (pbmi?.value ?: 0L), usage.toInt(), (ppvbits?.value ?: 0L), (hsection?.value ?: 0L), offset.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createDIBitmap(hdc: Hdc, pbmih: COpaquePointer?, flinit: UInt, pjbits: COpaquePointer?, pbmi: COpaquePointer?, iusage: DibUsage): Hbitmap =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createDIBitmap((hdc?.value ?: 0L), (pbmih?.value ?: 0L), flinit.toInt(), (pjbits?.value ?: 0L), (pbmi?.value ?: 0L), iusage.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createDiscardableBitmap(hdc: Hdc, cx: Int, cy: Int): Hbitmap =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createDiscardableBitmap((hdc?.value ?: 0L), cx, cy).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createEllipticRgn(x1: Int, y1: Int, x2: Int, y2: Int): Hrgn =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createEllipticRgn(x1, y1, x2, y2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createEllipticRgnIndirect(lprect: COpaquePointer?): Hrgn =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createEllipticRgnIndirect((lprect?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createEnhMetaFileA(hdc: Hdc, lpfilename: Pcstr, lprc: COpaquePointer?, lpdesc: Pcstr): Hdc =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createEnhMetaFileA((hdc?.value ?: 0L), (lpfilename?.value ?: 0L), (lprc?.value ?: 0L), (lpdesc?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createEnhMetaFileW(hdc: Hdc, lpfilename: Pcwstr, lprc: COpaquePointer?, lpdesc: Pcwstr): Hdc =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createEnhMetaFileW((hdc?.value ?: 0L), (lpfilename?.value ?: 0L), (lprc?.value ?: 0L), (lpdesc?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createFontA(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: UInt, bunderline: UInt, bstrikeout: UInt, icharset: UInt, ioutprecision: UInt, iclipprecision: UInt, iquality: UInt, ipitchandfamily: UInt, pszfacename: Pcstr): Hfont =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createFontA(cheight, cwidth, cescapement, corientation, cweight, bitalic.toInt(), bunderline.toInt(), bstrikeout.toInt(), icharset.toInt(), ioutprecision.toInt(), iclipprecision.toInt(), iquality.toInt(), ipitchandfamily.toInt(), (pszfacename?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createFontIndirectA(lplf: COpaquePointer?): Hfont =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createFontIndirectA((lplf?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createFontIndirectExA(param0: COpaquePointer?): Hfont =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createFontIndirectExA((param0?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createFontIndirectExW(param0: COpaquePointer?): Hfont =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createFontIndirectExW((param0?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createFontIndirectW(lplf: COpaquePointer?): Hfont =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createFontIndirectW((lplf?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createFontPackage(puchsrcbuffer: COpaquePointer?, ulsrcbuffersize: UInt, ppuchfontpackagebuffer: COpaquePointer?, pulfontpackagebuffersize: COpaquePointer?, pulbyteswritten: COpaquePointer?, usflag: UShort, usttcindex: UShort, ussubsetformat: UShort, ussubsetlanguage: UShort, ussubsetplatform: CreateFontPackageSubsetPlatform, ussubsetencoding: CreateFontPackageSubsetEncoding, pussubsetkeeplist: COpaquePointer?, ussubsetlistcount: UShort, lpfnallocate: CfpAllocproc, lpfnreallocate: CfpReallocproc, lpfnfree: CfpFreeproc, lpvreserved: COpaquePointer?): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createFontPackage((puchsrcbuffer?.value ?: 0L), ulsrcbuffersize.toInt(), (ppuchfontpackagebuffer?.value ?: 0L), (pulfontpackagebuffersize?.value ?: 0L), (pulbyteswritten?.value ?: 0L), usflag.toShort(), usttcindex.toShort(), ussubsetformat.toShort(), ussubsetlanguage.toShort(), ussubsetplatform, ussubsetencoding, (pussubsetkeeplist?.value ?: 0L), ussubsetlistcount.toShort(), 0L, 0L, 0L, (lpvreserved?.value ?: 0L)).toUInt()

public actual fun createFontW(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: UInt, bunderline: UInt, bstrikeout: UInt, icharset: UInt, ioutprecision: UInt, iclipprecision: UInt, iquality: UInt, ipitchandfamily: UInt, pszfacename: Pcwstr): Hfont =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createFontW(cheight, cwidth, cescapement, corientation, cweight, bitalic.toInt(), bunderline.toInt(), bstrikeout.toInt(), icharset.toInt(), ioutprecision.toInt(), iclipprecision.toInt(), iquality.toInt(), ipitchandfamily.toInt(), (pszfacename?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createHalftonePalette(hdc: Hdc): Hpalette =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createHalftonePalette((hdc?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createHatchBrush(ihatch: HatchBrushStyle, color: Colorref): Hbrush =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createHatchBrush(ihatch, color.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createICA(pszdriver: Pcstr, pszdevice: Pcstr, pszport: Pcstr, pdm: COpaquePointer?): Hdc =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createICA((pszdriver?.value ?: 0L), (pszdevice?.value ?: 0L), (pszport?.value ?: 0L), (pdm?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createICW(pszdriver: Pcwstr, pszdevice: Pcwstr, pszport: Pcwstr, pdm: COpaquePointer?): Hdc =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createICW((pszdriver?.value ?: 0L), (pszdevice?.value ?: 0L), (pszport?.value ?: 0L), (pdm?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createMetaFileA(pszfile: Pcstr): Hdc =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createMetaFileA((pszfile?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createMetaFileW(pszfile: Pcwstr): Hdc =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createMetaFileW((pszfile?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createPalette(plpal: COpaquePointer?): Hpalette =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createPalette((plpal?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createPatternBrush(hbm: Hbitmap): Hbrush =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createPatternBrush((hbm?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createPen(istyle: PenStyle, cwidth: Int, color: Colorref): Hpen =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createPen(istyle, cwidth, color.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createPenIndirect(plpen: COpaquePointer?): Hpen =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createPenIndirect((plpen?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createPolyPolygonRgn(pptl: COpaquePointer?, pc: COpaquePointer?, cpoly: Int, imode: CreatePolygonRgnMode): Hrgn =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createPolyPolygonRgn((pptl?.value ?: 0L), (pc?.value ?: 0L), cpoly, imode).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createPolygonRgn(pptl: COpaquePointer?, cpoint: Int, imode: CreatePolygonRgnMode): Hrgn =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createPolygonRgn((pptl?.value ?: 0L), cpoint, imode).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createRectRgn(x1: Int, y1: Int, x2: Int, y2: Int): Hrgn =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createRectRgn(x1, y1, x2, y2).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createRectRgnIndirect(lprect: COpaquePointer?): Hrgn =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createRectRgnIndirect((lprect?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createRoundRectRgn(x1: Int, y1: Int, x2: Int, y2: Int, w: Int, h: Int): Hrgn =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createRoundRectRgn(x1, y1, x2, y2, w, h).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun createScalableFontResourceA(fdwhidden: UInt, lpszfont: Pcstr, lpszfile: Pcstr, lpszpath: Pcstr): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createScalableFontResourceA(fdwhidden.toInt(), (lpszfont?.value ?: 0L), (lpszfile?.value ?: 0L), (lpszpath?.value ?: 0L))

public actual fun createScalableFontResourceW(fdwhidden: UInt, lpszfont: Pcwstr, lpszfile: Pcwstr, lpszpath: Pcwstr): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createScalableFontResourceW(fdwhidden.toInt(), (lpszfont?.value ?: 0L), (lpszfile?.value ?: 0L), (lpszpath?.value ?: 0L))

public actual fun createSolidBrush(color: Colorref): Hbrush =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_createSolidBrush(color.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dPtoLP(hdc: Hdc, lppt: COpaquePointer?, c: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_dPtoLP((hdc?.value ?: 0L), (lppt?.value ?: 0L), c)

public actual fun deleteDC(hdc: Hdc): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_deleteDC((hdc?.value ?: 0L))

public actual fun deleteEnhMetaFile(hmf: Henhmetafile): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_deleteEnhMetaFile((hmf?.value ?: 0L))

public actual fun deleteMetaFile(hmf: Hmetafile): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_deleteMetaFile((hmf?.value ?: 0L))

public actual fun deleteObject(ho: Hgdiobj): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_deleteObject((ho?.value ?: 0L))

public actual fun drawAnimatedRects(hwnd: Hwnd, idani: Int, lprcfrom: COpaquePointer?, lprcto: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_drawAnimatedRects((hwnd?.value ?: 0L), idani, (lprcfrom?.value ?: 0L), (lprcto?.value ?: 0L))

public actual fun drawCaption(hwnd: Hwnd, hdc: Hdc, lprect: COpaquePointer?, flags: DrawCaptionFlags): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_drawCaption((hwnd?.value ?: 0L), (hdc?.value ?: 0L), (lprect?.value ?: 0L), flags.toInt())

public actual fun drawEdge(hdc: Hdc, qrc: COpaquePointer?, edge: DrawedgeFlags, grfflags: DrawEdgeFlags): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_drawEdge((hdc?.value ?: 0L), (qrc?.value ?: 0L), edge.toInt(), grfflags.toInt())

public actual fun drawEscape(hdc: Hdc, iescape: Int, cjin: Int, lpin: Pcstr): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_drawEscape((hdc?.value ?: 0L), iescape, cjin, (lpin?.value ?: 0L))

public actual fun drawFocusRect(hdc: Hdc, lprc: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_drawFocusRect((hdc?.value ?: 0L), (lprc?.value ?: 0L))

public actual fun drawFrameControl(param0: Hdc, param1: COpaquePointer?, param2: DfcType, param3: DfcsState): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_drawFrameControl((param0?.value ?: 0L), (param1?.value ?: 0L), param2.toInt(), param3.toInt())

public actual fun drawStateA(hdc: Hdc, hbrfore: Hbrush, qfncallback: Drawstateproc, ldata: Lparam, wdata: Wparam, x: Int, y: Int, cx: Int, cy: Int, uflags: DrawstateFlags): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_drawStateA((hdc?.value ?: 0L), (hbrfore?.value ?: 0L), 0L, ldata, wdata.toLong(), x, y, cx, cy, uflags.toInt())

public actual fun drawStateW(hdc: Hdc, hbrfore: Hbrush, qfncallback: Drawstateproc, ldata: Lparam, wdata: Wparam, x: Int, y: Int, cx: Int, cy: Int, uflags: DrawstateFlags): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_drawStateW((hdc?.value ?: 0L), (hbrfore?.value ?: 0L), 0L, ldata, wdata.toLong(), x, y, cx, cy, uflags.toInt())

public actual fun drawTextA(hdc: Hdc, lpchtext: Pcstr, cchtext: Int, lprc: COpaquePointer?, format: DrawTextFormat): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_drawTextA((hdc?.value ?: 0L), (lpchtext?.value ?: 0L), cchtext, (lprc?.value ?: 0L), format.toInt())

public actual fun drawTextExA(hdc: Hdc, lpchtext: Pstr, cchtext: Int, lprc: COpaquePointer?, format: DrawTextFormat, lpdtp: COpaquePointer?): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_drawTextExA((hdc?.value ?: 0L), (lpchtext?.value ?: 0L), cchtext, (lprc?.value ?: 0L), format.toInt(), (lpdtp?.value ?: 0L))

public actual fun drawTextExW(hdc: Hdc, lpchtext: Pwstr, cchtext: Int, lprc: COpaquePointer?, format: DrawTextFormat, lpdtp: COpaquePointer?): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_drawTextExW((hdc?.value ?: 0L), (lpchtext?.value ?: 0L), cchtext, (lprc?.value ?: 0L), format.toInt(), (lpdtp?.value ?: 0L))

public actual fun drawTextW(hdc: Hdc, lpchtext: Pcwstr, cchtext: Int, lprc: COpaquePointer?, format: DrawTextFormat): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_drawTextW((hdc?.value ?: 0L), (lpchtext?.value ?: 0L), cchtext, (lprc?.value ?: 0L), format.toInt())

public actual fun ellipse(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_ellipse((hdc?.value ?: 0L), left, top, right, bottom)

public actual fun endPaint(hwnd: Hwnd, lppaint: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_endPaint((hwnd?.value ?: 0L), (lppaint?.value ?: 0L))

public actual fun endPath(hdc: Hdc): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_endPath((hdc?.value ?: 0L))

public actual fun enumDisplayDevicesA(lpdevice: Pcstr, idevnum: UInt, lpdisplaydevice: COpaquePointer?, dwflags: UInt): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_enumDisplayDevicesA((lpdevice?.value ?: 0L), idevnum.toInt(), (lpdisplaydevice?.value ?: 0L), dwflags.toInt())

public actual fun enumDisplayDevicesW(lpdevice: Pcwstr, idevnum: UInt, lpdisplaydevice: COpaquePointer?, dwflags: UInt): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_enumDisplayDevicesW((lpdevice?.value ?: 0L), idevnum.toInt(), (lpdisplaydevice?.value ?: 0L), dwflags.toInt())

public actual fun enumDisplayMonitors(hdc: Hdc, lprcclip: COpaquePointer?, lpfnenum: Monitorenumproc, dwdata: Lparam): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_enumDisplayMonitors((hdc?.value ?: 0L), (lprcclip?.value ?: 0L), 0L, dwdata)

public actual fun enumDisplaySettingsA(lpszdevicename: Pcstr, imodenum: EnumDisplaySettingsMode, lpdevmode: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_enumDisplaySettingsA((lpszdevicename?.value ?: 0L), imodenum.toInt(), (lpdevmode?.value ?: 0L))

public actual fun enumDisplaySettingsExA(lpszdevicename: Pcstr, imodenum: EnumDisplaySettingsMode, lpdevmode: COpaquePointer?, dwflags: EnumDisplaySettingsFlags): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_enumDisplaySettingsExA((lpszdevicename?.value ?: 0L), imodenum.toInt(), (lpdevmode?.value ?: 0L), dwflags.toInt())

public actual fun enumDisplaySettingsExW(lpszdevicename: Pcwstr, imodenum: EnumDisplaySettingsMode, lpdevmode: COpaquePointer?, dwflags: EnumDisplaySettingsFlags): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_enumDisplaySettingsExW((lpszdevicename?.value ?: 0L), imodenum.toInt(), (lpdevmode?.value ?: 0L), dwflags.toInt())

public actual fun enumDisplaySettingsW(lpszdevicename: Pcwstr, imodenum: EnumDisplaySettingsMode, lpdevmode: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_enumDisplaySettingsW((lpszdevicename?.value ?: 0L), imodenum.toInt(), (lpdevmode?.value ?: 0L))

public actual fun enumEnhMetaFile(hdc: Hdc, hmf: Henhmetafile, proc: Enhmfenumproc, param3: COpaquePointer?, lprect: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_enumEnhMetaFile((hdc?.value ?: 0L), (hmf?.value ?: 0L), 0L, (param3?.value ?: 0L), (lprect?.value ?: 0L))

public actual fun enumFontFamiliesA(hdc: Hdc, lplogfont: Pcstr, lpproc: Fontenumproca, lparam: Lparam): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_enumFontFamiliesA((hdc?.value ?: 0L), (lplogfont?.value ?: 0L), 0L, lparam)

public actual fun enumFontFamiliesExA(hdc: Hdc, lplogfont: COpaquePointer?, lpproc: Fontenumproca, lparam: Lparam, dwflags: UInt): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_enumFontFamiliesExA((hdc?.value ?: 0L), (lplogfont?.value ?: 0L), 0L, lparam, dwflags.toInt())

public actual fun enumFontFamiliesExW(hdc: Hdc, lplogfont: COpaquePointer?, lpproc: Fontenumprocw, lparam: Lparam, dwflags: UInt): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_enumFontFamiliesExW((hdc?.value ?: 0L), (lplogfont?.value ?: 0L), 0L, lparam, dwflags.toInt())

public actual fun enumFontFamiliesW(hdc: Hdc, lplogfont: Pcwstr, lpproc: Fontenumprocw, lparam: Lparam): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_enumFontFamiliesW((hdc?.value ?: 0L), (lplogfont?.value ?: 0L), 0L, lparam)

public actual fun enumFontsA(hdc: Hdc, lplogfont: Pcstr, lpproc: Fontenumproca, lparam: Lparam): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_enumFontsA((hdc?.value ?: 0L), (lplogfont?.value ?: 0L), 0L, lparam)

public actual fun enumFontsW(hdc: Hdc, lplogfont: Pcwstr, lpproc: Fontenumprocw, lparam: Lparam): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_enumFontsW((hdc?.value ?: 0L), (lplogfont?.value ?: 0L), 0L, lparam)

public actual fun enumMetaFile(hdc: Hdc, hmf: Hmetafile, proc: Mfenumproc, param3: Lparam): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_enumMetaFile((hdc?.value ?: 0L), (hmf?.value ?: 0L), 0L, param3)

public actual fun enumObjects(hdc: Hdc, ntype: ObjType, lpfunc: Gobjenumproc, lparam: Lparam): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_enumObjects((hdc?.value ?: 0L), ntype, 0L, lparam)

public actual fun equalRect(lprc1: COpaquePointer?, lprc2: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_equalRect((lprc1?.value ?: 0L), (lprc2?.value ?: 0L))

public actual fun equalRgn(hrgn1: Hrgn, hrgn2: Hrgn): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_equalRgn((hrgn1?.value ?: 0L), (hrgn2?.value ?: 0L))

public actual fun excludeClipRect(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): GdiRegionType =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_excludeClipRect((hdc?.value ?: 0L), left, top, right, bottom)

public actual fun excludeUpdateRgn(hdc: Hdc, hwnd: Hwnd): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_excludeUpdateRgn((hdc?.value ?: 0L), (hwnd?.value ?: 0L))

public actual fun extCreatePen(ipenstyle: UInt, cwidth: UInt, plbrush: COpaquePointer?, cstyle: UInt, pstyle: COpaquePointer?): Hpen =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_extCreatePen(ipenstyle.toInt(), cwidth.toInt(), (plbrush?.value ?: 0L), cstyle.toInt(), (pstyle?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun extCreateRegion(lpx: COpaquePointer?, ncount: UInt, lpdata: COpaquePointer?): Hrgn =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_extCreateRegion((lpx?.value ?: 0L), ncount.toInt(), (lpdata?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun extFloodFill(hdc: Hdc, x: Int, y: Int, color: Colorref, type: ExtFloodFillType): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_extFloodFill((hdc?.value ?: 0L), x, y, color.toInt(), type.toInt())

public actual fun extSelectClipRgn(hdc: Hdc, hrgn: Hrgn, mode: RgnCombineMode): GdiRegionType =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_extSelectClipRgn((hdc?.value ?: 0L), (hrgn?.value ?: 0L), mode)

public actual fun extTextOutA(hdc: Hdc, x: Int, y: Int, options: EtoOptions, lprect: COpaquePointer?, lpstring: Pcstr, c: UInt, lpdx: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_extTextOutA((hdc?.value ?: 0L), x, y, options.toInt(), (lprect?.value ?: 0L), (lpstring?.value ?: 0L), c.toInt(), (lpdx?.value ?: 0L))

public actual fun extTextOutW(hdc: Hdc, x: Int, y: Int, options: EtoOptions, lprect: COpaquePointer?, lpstring: Pcwstr, c: UInt, lpdx: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_extTextOutW((hdc?.value ?: 0L), x, y, options.toInt(), (lprect?.value ?: 0L), (lpstring?.value ?: 0L), c.toInt(), (lpdx?.value ?: 0L))

public actual fun fillPath(hdc: Hdc): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_fillPath((hdc?.value ?: 0L))

public actual fun fillRect(hdc: Hdc, lprc: COpaquePointer?, hbr: Hbrush): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_fillRect((hdc?.value ?: 0L), (lprc?.value ?: 0L), (hbr?.value ?: 0L))

public actual fun fillRgn(hdc: Hdc, hrgn: Hrgn, hbr: Hbrush): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_fillRgn((hdc?.value ?: 0L), (hrgn?.value ?: 0L), (hbr?.value ?: 0L))

public actual fun fixBrushOrgEx(hdc: Hdc, x: Int, y: Int, ptl: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_fixBrushOrgEx((hdc?.value ?: 0L), x, y, (ptl?.value ?: 0L))

public actual fun flattenPath(hdc: Hdc): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_flattenPath((hdc?.value ?: 0L))

public actual fun floodFill(hdc: Hdc, x: Int, y: Int, color: Colorref): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_floodFill((hdc?.value ?: 0L), x, y, color.toInt())

public actual fun frameRect(hdc: Hdc, lprc: COpaquePointer?, hbr: Hbrush): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_frameRect((hdc?.value ?: 0L), (lprc?.value ?: 0L), (hbr?.value ?: 0L))

public actual fun frameRgn(hdc: Hdc, hrgn: Hrgn, hbr: Hbrush, w: Int, h: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_frameRgn((hdc?.value ?: 0L), (hrgn?.value ?: 0L), (hbr?.value ?: 0L), w, h)

public actual fun gdiAlphaBlend(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, ftn: Blendfunction): Bool =
    0

public actual fun gdiComment(hdc: Hdc, nsize: UInt, lpdata: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_gdiComment((hdc?.value ?: 0L), nsize.toInt(), (lpdata?.value ?: 0L))

public actual fun gdiFlush(): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_gdiFlush()

public actual fun gdiGetBatchLimit(): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_gdiGetBatchLimit().toUInt()

public actual fun gdiGradientFill(hdc: Hdc, pvertex: COpaquePointer?, nvertex: UInt, pmesh: COpaquePointer?, ncount: UInt, ulmode: GradientFill): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_gdiGradientFill((hdc?.value ?: 0L), (pvertex?.value ?: 0L), nvertex.toInt(), (pmesh?.value ?: 0L), ncount.toInt(), ulmode.toInt())

public actual fun gdiSetBatchLimit(dw: UInt): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_gdiSetBatchLimit(dw.toInt()).toUInt()

public actual fun gdiTransparentBlt(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: UInt): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_gdiTransparentBlt((hdcdest?.value ?: 0L), xorigindest, yorigindest, wdest, hdest, (hdcsrc?.value ?: 0L), xoriginsrc, yoriginsrc, wsrc, hsrc, crtransparent.toInt())

public actual fun getArcDirection(hdc: Hdc): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getArcDirection((hdc?.value ?: 0L))

public actual fun getAspectRatioFilterEx(hdc: Hdc, lpsize: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getAspectRatioFilterEx((hdc?.value ?: 0L), (lpsize?.value ?: 0L))

public actual fun getBitmapBits(hbit: Hbitmap, cb: Int, lpvbits: COpaquePointer?): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getBitmapBits((hbit?.value ?: 0L), cb, (lpvbits?.value ?: 0L))

public actual fun getBitmapDimensionEx(hbit: Hbitmap, lpsize: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getBitmapDimensionEx((hbit?.value ?: 0L), (lpsize?.value ?: 0L))

public actual fun getBkColor(hdc: Hdc): Colorref =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getBkColor((hdc?.value ?: 0L)).toUInt()

public actual fun getBkMode(hdc: Hdc): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getBkMode((hdc?.value ?: 0L))

public actual fun getBoundsRect(hdc: Hdc, lprect: COpaquePointer?, flags: UInt): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getBoundsRect((hdc?.value ?: 0L), (lprect?.value ?: 0L), flags.toInt()).toUInt()

public actual fun getBrushOrgEx(hdc: Hdc, lppt: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getBrushOrgEx((hdc?.value ?: 0L), (lppt?.value ?: 0L))

public actual fun getCharABCWidthsA(hdc: Hdc, wfirst: UInt, wlast: UInt, lpabc: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getCharABCWidthsA((hdc?.value ?: 0L), wfirst.toInt(), wlast.toInt(), (lpabc?.value ?: 0L))

public actual fun getCharABCWidthsFloatA(hdc: Hdc, ifirst: UInt, ilast: UInt, lpabc: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getCharABCWidthsFloatA((hdc?.value ?: 0L), ifirst.toInt(), ilast.toInt(), (lpabc?.value ?: 0L))

public actual fun getCharABCWidthsFloatW(hdc: Hdc, ifirst: UInt, ilast: UInt, lpabc: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getCharABCWidthsFloatW((hdc?.value ?: 0L), ifirst.toInt(), ilast.toInt(), (lpabc?.value ?: 0L))

public actual fun getCharABCWidthsI(hdc: Hdc, gifirst: UInt, cgi: UInt, pgi: COpaquePointer?, pabc: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getCharABCWidthsI((hdc?.value ?: 0L), gifirst.toInt(), cgi.toInt(), (pgi?.value ?: 0L), (pabc?.value ?: 0L))

public actual fun getCharABCWidthsW(hdc: Hdc, wfirst: UInt, wlast: UInt, lpabc: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getCharABCWidthsW((hdc?.value ?: 0L), wfirst.toInt(), wlast.toInt(), (lpabc?.value ?: 0L))

public actual fun getCharWidth32A(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getCharWidth32A((hdc?.value ?: 0L), ifirst.toInt(), ilast.toInt(), (lpbuffer?.value ?: 0L))

public actual fun getCharWidth32W(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getCharWidth32W((hdc?.value ?: 0L), ifirst.toInt(), ilast.toInt(), (lpbuffer?.value ?: 0L))

public actual fun getCharWidthA(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getCharWidthA((hdc?.value ?: 0L), ifirst.toInt(), ilast.toInt(), (lpbuffer?.value ?: 0L))

public actual fun getCharWidthFloatA(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getCharWidthFloatA((hdc?.value ?: 0L), ifirst.toInt(), ilast.toInt(), (lpbuffer?.value ?: 0L))

public actual fun getCharWidthFloatW(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getCharWidthFloatW((hdc?.value ?: 0L), ifirst.toInt(), ilast.toInt(), (lpbuffer?.value ?: 0L))

public actual fun getCharWidthI(hdc: Hdc, gifirst: UInt, cgi: UInt, pgi: COpaquePointer?, piwidths: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getCharWidthI((hdc?.value ?: 0L), gifirst.toInt(), cgi.toInt(), (pgi?.value ?: 0L), (piwidths?.value ?: 0L))

public actual fun getCharWidthW(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getCharWidthW((hdc?.value ?: 0L), ifirst.toInt(), ilast.toInt(), (lpbuffer?.value ?: 0L))

public actual fun getCharacterPlacementA(hdc: Hdc, lpstring: Pcstr, ncount: Int, nmexextent: Int, lpresults: COpaquePointer?, dwflags: GetCharacterPlacementFlags): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getCharacterPlacementA((hdc?.value ?: 0L), (lpstring?.value ?: 0L), ncount, nmexextent, (lpresults?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun getCharacterPlacementW(hdc: Hdc, lpstring: Pcwstr, ncount: Int, nmexextent: Int, lpresults: COpaquePointer?, dwflags: GetCharacterPlacementFlags): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getCharacterPlacementW((hdc?.value ?: 0L), (lpstring?.value ?: 0L), ncount, nmexextent, (lpresults?.value ?: 0L), dwflags.toInt()).toUInt()

public actual fun getClipBox(hdc: Hdc, lprect: COpaquePointer?): GdiRegionType =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getClipBox((hdc?.value ?: 0L), (lprect?.value ?: 0L))

public actual fun getClipRgn(hdc: Hdc, hrgn: Hrgn): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getClipRgn((hdc?.value ?: 0L), (hrgn?.value ?: 0L))

public actual fun getColorAdjustment(hdc: Hdc, lpca: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getColorAdjustment((hdc?.value ?: 0L), (lpca?.value ?: 0L))

public actual fun getCurrentObject(hdc: Hdc, type: UInt): Hgdiobj =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getCurrentObject((hdc?.value ?: 0L), type.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getCurrentPositionEx(hdc: Hdc, lppt: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getCurrentPositionEx((hdc?.value ?: 0L), (lppt?.value ?: 0L))

public actual fun getDC(hwnd: Hwnd): Hdc =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getDC((hwnd?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getDCBrushColor(hdc: Hdc): Colorref =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getDCBrushColor((hdc?.value ?: 0L)).toUInt()

public actual fun getDCEx(hwnd: Hwnd, hrgnclip: Hrgn, flags: GetDcxFlags): Hdc =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getDCEx((hwnd?.value ?: 0L), (hrgnclip?.value ?: 0L), flags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getDCOrgEx(hdc: Hdc, lppt: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getDCOrgEx((hdc?.value ?: 0L), (lppt?.value ?: 0L))

public actual fun getDCPenColor(hdc: Hdc): Colorref =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getDCPenColor((hdc?.value ?: 0L)).toUInt()

public actual fun getDIBColorTable(hdc: Hdc, istart: UInt, centries: UInt, prgbq: COpaquePointer?): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getDIBColorTable((hdc?.value ?: 0L), istart.toInt(), centries.toInt(), (prgbq?.value ?: 0L)).toUInt()

public actual fun getDIBits(hdc: Hdc, hbm: Hbitmap, start: UInt, clines: UInt, lpvbits: COpaquePointer?, lpbmi: COpaquePointer?, usage: DibUsage): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getDIBits((hdc?.value ?: 0L), (hbm?.value ?: 0L), start.toInt(), clines.toInt(), (lpvbits?.value ?: 0L), (lpbmi?.value ?: 0L), usage.toInt())

public actual fun getDeviceCaps(hdc: Hdc, index: Int): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getDeviceCaps((hdc?.value ?: 0L), index)

public actual fun getEnhMetaFileA(lpname: Pcstr): Henhmetafile =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getEnhMetaFileA((lpname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getEnhMetaFileBits(hemf: Henhmetafile, nsize: UInt, lpdata: COpaquePointer?): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getEnhMetaFileBits((hemf?.value ?: 0L), nsize.toInt(), (lpdata?.value ?: 0L)).toUInt()

public actual fun getEnhMetaFileDescriptionA(hemf: Henhmetafile, cchbuffer: UInt, lpdescription: Pstr): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getEnhMetaFileDescriptionA((hemf?.value ?: 0L), cchbuffer.toInt(), (lpdescription?.value ?: 0L)).toUInt()

public actual fun getEnhMetaFileDescriptionW(hemf: Henhmetafile, cchbuffer: UInt, lpdescription: Pwstr): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getEnhMetaFileDescriptionW((hemf?.value ?: 0L), cchbuffer.toInt(), (lpdescription?.value ?: 0L)).toUInt()

public actual fun getEnhMetaFileHeader(hemf: Henhmetafile, nsize: UInt, lpenhmetaheader: COpaquePointer?): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getEnhMetaFileHeader((hemf?.value ?: 0L), nsize.toInt(), (lpenhmetaheader?.value ?: 0L)).toUInt()

public actual fun getEnhMetaFilePaletteEntries(hemf: Henhmetafile, nnumentries: UInt, lppaletteentries: COpaquePointer?): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getEnhMetaFilePaletteEntries((hemf?.value ?: 0L), nnumentries.toInt(), (lppaletteentries?.value ?: 0L)).toUInt()

public actual fun getEnhMetaFileW(lpname: Pcwstr): Henhmetafile =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getEnhMetaFileW((lpname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getFontData(hdc: Hdc, dwtable: UInt, dwoffset: UInt, pvbuffer: COpaquePointer?, cjbuffer: UInt): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getFontData((hdc?.value ?: 0L), dwtable.toInt(), dwoffset.toInt(), (pvbuffer?.value ?: 0L), cjbuffer.toInt()).toUInt()

public actual fun getFontLanguageInfo(hdc: Hdc): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getFontLanguageInfo((hdc?.value ?: 0L)).toUInt()

public actual fun getFontUnicodeRanges(hdc: Hdc, lpgs: COpaquePointer?): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getFontUnicodeRanges((hdc?.value ?: 0L), (lpgs?.value ?: 0L)).toUInt()

public actual fun getGlyphIndicesA(hdc: Hdc, lpstr: Pcstr, c: Int, pgi: COpaquePointer?, fl: UInt): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getGlyphIndicesA((hdc?.value ?: 0L), (lpstr?.value ?: 0L), c, (pgi?.value ?: 0L), fl.toInt()).toUInt()

public actual fun getGlyphIndicesW(hdc: Hdc, lpstr: Pcwstr, c: Int, pgi: COpaquePointer?, fl: UInt): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getGlyphIndicesW((hdc?.value ?: 0L), (lpstr?.value ?: 0L), c, (pgi?.value ?: 0L), fl.toInt()).toUInt()

public actual fun getGlyphOutlineA(hdc: Hdc, uchar: UInt, fuformat: GetGlyphOutlineFormat, lpgm: COpaquePointer?, cjbuffer: UInt, pvbuffer: COpaquePointer?, lpmat2: COpaquePointer?): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getGlyphOutlineA((hdc?.value ?: 0L), uchar.toInt(), fuformat.toInt(), (lpgm?.value ?: 0L), cjbuffer.toInt(), (pvbuffer?.value ?: 0L), (lpmat2?.value ?: 0L)).toUInt()

public actual fun getGlyphOutlineW(hdc: Hdc, uchar: UInt, fuformat: GetGlyphOutlineFormat, lpgm: COpaquePointer?, cjbuffer: UInt, pvbuffer: COpaquePointer?, lpmat2: COpaquePointer?): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getGlyphOutlineW((hdc?.value ?: 0L), uchar.toInt(), fuformat.toInt(), (lpgm?.value ?: 0L), cjbuffer.toInt(), (pvbuffer?.value ?: 0L), (lpmat2?.value ?: 0L)).toUInt()

public actual fun getGraphicsMode(hdc: Hdc): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getGraphicsMode((hdc?.value ?: 0L))

public actual fun getKerningPairsA(hdc: Hdc, npairs: UInt, lpkernpair: COpaquePointer?): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getKerningPairsA((hdc?.value ?: 0L), npairs.toInt(), (lpkernpair?.value ?: 0L)).toUInt()

public actual fun getKerningPairsW(hdc: Hdc, npairs: UInt, lpkernpair: COpaquePointer?): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getKerningPairsW((hdc?.value ?: 0L), npairs.toInt(), (lpkernpair?.value ?: 0L)).toUInt()

public actual fun getLayout(hdc: Hdc): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getLayout((hdc?.value ?: 0L)).toUInt()

public actual fun getMapMode(hdc: Hdc): HdcMapMode =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getMapMode((hdc?.value ?: 0L))

public actual fun getMetaFileA(lpname: Pcstr): Hmetafile =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getMetaFileA((lpname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getMetaFileBitsEx(hmf: Hmetafile, cbbuffer: UInt, lpdata: COpaquePointer?): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getMetaFileBitsEx((hmf?.value ?: 0L), cbbuffer.toInt(), (lpdata?.value ?: 0L)).toUInt()

public actual fun getMetaFileW(lpname: Pcwstr): Hmetafile =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getMetaFileW((lpname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getMetaRgn(hdc: Hdc, hrgn: Hrgn): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getMetaRgn((hdc?.value ?: 0L), (hrgn?.value ?: 0L))

public actual fun getMiterLimit(hdc: Hdc, plimit: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getMiterLimit((hdc?.value ?: 0L), (plimit?.value ?: 0L))

public actual fun getMonitorInfoA(hmonitor: Hmonitor, lpmi: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getMonitorInfoA((hmonitor?.value ?: 0L), (lpmi?.value ?: 0L))

public actual fun getMonitorInfoW(hmonitor: Hmonitor, lpmi: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getMonitorInfoW((hmonitor?.value ?: 0L), (lpmi?.value ?: 0L))

public actual fun getNearestColor(hdc: Hdc, color: Colorref): Colorref =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getNearestColor((hdc?.value ?: 0L), color.toInt()).toUInt()

public actual fun getNearestPaletteIndex(h: Hpalette, color: Colorref): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getNearestPaletteIndex((h?.value ?: 0L), color.toInt()).toUInt()

public actual fun getObjectA(h: Hgdiobj, c: Int, pv: COpaquePointer?): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getObjectA((h?.value ?: 0L), c, (pv?.value ?: 0L))

public actual fun getObjectType(h: Hgdiobj): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getObjectType((h?.value ?: 0L)).toUInt()

public actual fun getObjectW(h: Hgdiobj, c: Int, pv: COpaquePointer?): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getObjectW((h?.value ?: 0L), c, (pv?.value ?: 0L))

public actual fun getOutlineTextMetricsA(hdc: Hdc, cjcopy: UInt, potm: COpaquePointer?): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getOutlineTextMetricsA((hdc?.value ?: 0L), cjcopy.toInt(), (potm?.value ?: 0L)).toUInt()

public actual fun getOutlineTextMetricsW(hdc: Hdc, cjcopy: UInt, potm: COpaquePointer?): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getOutlineTextMetricsW((hdc?.value ?: 0L), cjcopy.toInt(), (potm?.value ?: 0L)).toUInt()

public actual fun getPaletteEntries(hpal: Hpalette, istart: UInt, centries: UInt, ppalentries: COpaquePointer?): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getPaletteEntries((hpal?.value ?: 0L), istart.toInt(), centries.toInt(), (ppalentries?.value ?: 0L)).toUInt()

public actual fun getPath(hdc: Hdc, apt: COpaquePointer?, aj: COpaquePointer?, cpt: Int): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getPath((hdc?.value ?: 0L), (apt?.value ?: 0L), (aj?.value ?: 0L), cpt)

public actual fun getPixel(hdc: Hdc, x: Int, y: Int): Colorref =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getPixel((hdc?.value ?: 0L), x, y).toUInt()

public actual fun getPolyFillMode(hdc: Hdc): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getPolyFillMode((hdc?.value ?: 0L))

public actual fun getROP2(hdc: Hdc): R2Mode =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getROP2((hdc?.value ?: 0L))

public actual fun getRandomRgn(hdc: Hdc, hrgn: Hrgn, i: Int): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getRandomRgn((hdc?.value ?: 0L), (hrgn?.value ?: 0L), i)

public actual fun getRasterizerCaps(lpraststat: COpaquePointer?, cjbytes: UInt): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getRasterizerCaps((lpraststat?.value ?: 0L), cjbytes.toInt())

public actual fun getRegionData(hrgn: Hrgn, ncount: UInt, lprgndata: COpaquePointer?): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getRegionData((hrgn?.value ?: 0L), ncount.toInt(), (lprgndata?.value ?: 0L)).toUInt()

public actual fun getRgnBox(hrgn: Hrgn, lprc: COpaquePointer?): GdiRegionType =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getRgnBox((hrgn?.value ?: 0L), (lprc?.value ?: 0L))

public actual fun getStockObject(i: GetStockObjectFlags): Hgdiobj =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getStockObject(i).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getStretchBltMode(hdc: Hdc): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getStretchBltMode((hdc?.value ?: 0L))

public actual fun getSysColor(nindex: SysColorIndex): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getSysColor(nindex).toUInt()

public actual fun getSysColorBrush(nindex: SysColorIndex): Hbrush =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getSysColorBrush(nindex).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getSystemPaletteEntries(hdc: Hdc, istart: UInt, centries: UInt, ppalentries: COpaquePointer?): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getSystemPaletteEntries((hdc?.value ?: 0L), istart.toInt(), centries.toInt(), (ppalentries?.value ?: 0L)).toUInt()

public actual fun getSystemPaletteUse(hdc: Hdc): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getSystemPaletteUse((hdc?.value ?: 0L)).toUInt()

public actual fun getTabbedTextExtentA(hdc: Hdc, lpstring: Pcstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: COpaquePointer?): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getTabbedTextExtentA((hdc?.value ?: 0L), (lpstring?.value ?: 0L), chcount, ntabpositions, (lpntabstoppositions?.value ?: 0L)).toUInt()

public actual fun getTabbedTextExtentW(hdc: Hdc, lpstring: Pcwstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: COpaquePointer?): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getTabbedTextExtentW((hdc?.value ?: 0L), (lpstring?.value ?: 0L), chcount, ntabpositions, (lpntabstoppositions?.value ?: 0L)).toUInt()

public actual fun getTextAlign(hdc: Hdc): TextAlignOptions =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getTextAlign((hdc?.value ?: 0L)).toUInt()

public actual fun getTextCharacterExtra(hdc: Hdc): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getTextCharacterExtra((hdc?.value ?: 0L))

public actual fun getTextColor(hdc: Hdc): Colorref =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getTextColor((hdc?.value ?: 0L)).toUInt()

public actual fun getTextExtentExPointA(hdc: Hdc, lpszstring: Pcstr, cchstring: Int, nmaxextent: Int, lpnfit: COpaquePointer?, lpndx: COpaquePointer?, lpsize: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getTextExtentExPointA((hdc?.value ?: 0L), (lpszstring?.value ?: 0L), cchstring, nmaxextent, (lpnfit?.value ?: 0L), (lpndx?.value ?: 0L), (lpsize?.value ?: 0L))

public actual fun getTextExtentExPointI(hdc: Hdc, lpwszstring: COpaquePointer?, cwchstring: Int, nmaxextent: Int, lpnfit: COpaquePointer?, lpndx: COpaquePointer?, lpsize: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getTextExtentExPointI((hdc?.value ?: 0L), (lpwszstring?.value ?: 0L), cwchstring, nmaxextent, (lpnfit?.value ?: 0L), (lpndx?.value ?: 0L), (lpsize?.value ?: 0L))

public actual fun getTextExtentExPointW(hdc: Hdc, lpszstring: Pcwstr, cchstring: Int, nmaxextent: Int, lpnfit: COpaquePointer?, lpndx: COpaquePointer?, lpsize: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getTextExtentExPointW((hdc?.value ?: 0L), (lpszstring?.value ?: 0L), cchstring, nmaxextent, (lpnfit?.value ?: 0L), (lpndx?.value ?: 0L), (lpsize?.value ?: 0L))

public actual fun getTextExtentPoint32A(hdc: Hdc, lpstring: Pcstr, c: Int, psizl: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getTextExtentPoint32A((hdc?.value ?: 0L), (lpstring?.value ?: 0L), c, (psizl?.value ?: 0L))

public actual fun getTextExtentPoint32W(hdc: Hdc, lpstring: Pcwstr, c: Int, psizl: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getTextExtentPoint32W((hdc?.value ?: 0L), (lpstring?.value ?: 0L), c, (psizl?.value ?: 0L))

public actual fun getTextExtentPointA(hdc: Hdc, lpstring: Pcstr, c: Int, lpsz: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getTextExtentPointA((hdc?.value ?: 0L), (lpstring?.value ?: 0L), c, (lpsz?.value ?: 0L))

public actual fun getTextExtentPointI(hdc: Hdc, pgiin: COpaquePointer?, cgi: Int, psize: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getTextExtentPointI((hdc?.value ?: 0L), (pgiin?.value ?: 0L), cgi, (psize?.value ?: 0L))

public actual fun getTextExtentPointW(hdc: Hdc, lpstring: Pcwstr, c: Int, lpsz: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getTextExtentPointW((hdc?.value ?: 0L), (lpstring?.value ?: 0L), c, (lpsz?.value ?: 0L))

public actual fun getTextFaceA(hdc: Hdc, c: Int, lpname: Pstr): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getTextFaceA((hdc?.value ?: 0L), c, (lpname?.value ?: 0L))

public actual fun getTextFaceW(hdc: Hdc, c: Int, lpname: Pwstr): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getTextFaceW((hdc?.value ?: 0L), c, (lpname?.value ?: 0L))

public actual fun getTextMetricsA(hdc: Hdc, lptm: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getTextMetricsA((hdc?.value ?: 0L), (lptm?.value ?: 0L))

public actual fun getTextMetricsW(hdc: Hdc, lptm: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getTextMetricsW((hdc?.value ?: 0L), (lptm?.value ?: 0L))

public actual fun getUpdateRect(hwnd: Hwnd, lprect: COpaquePointer?, berase: Bool): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getUpdateRect((hwnd?.value ?: 0L), (lprect?.value ?: 0L), berase)

public actual fun getUpdateRgn(hwnd: Hwnd, hrgn: Hrgn, berase: Bool): GdiRegionType =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getUpdateRgn((hwnd?.value ?: 0L), (hrgn?.value ?: 0L), berase)

public actual fun getViewportExtEx(hdc: Hdc, lpsize: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getViewportExtEx((hdc?.value ?: 0L), (lpsize?.value ?: 0L))

public actual fun getViewportOrgEx(hdc: Hdc, lppoint: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getViewportOrgEx((hdc?.value ?: 0L), (lppoint?.value ?: 0L))

public actual fun getWinMetaFileBits(hemf: Henhmetafile, cbdata16: UInt, pdata16: COpaquePointer?, imapmode: Int, hdcref: Hdc): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getWinMetaFileBits((hemf?.value ?: 0L), cbdata16.toInt(), (pdata16?.value ?: 0L), imapmode, (hdcref?.value ?: 0L)).toUInt()

public actual fun getWindowDC(hwnd: Hwnd): Hdc =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getWindowDC((hwnd?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getWindowExtEx(hdc: Hdc, lpsize: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getWindowExtEx((hdc?.value ?: 0L), (lpsize?.value ?: 0L))

public actual fun getWindowOrgEx(hdc: Hdc, lppoint: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getWindowOrgEx((hdc?.value ?: 0L), (lppoint?.value ?: 0L))

public actual fun getWindowRgn(hwnd: Hwnd, hrgn: Hrgn): GdiRegionType =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getWindowRgn((hwnd?.value ?: 0L), (hrgn?.value ?: 0L))

public actual fun getWindowRgnBox(hwnd: Hwnd, lprc: COpaquePointer?): GdiRegionType =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getWindowRgnBox((hwnd?.value ?: 0L), (lprc?.value ?: 0L))

public actual fun getWorldTransform(hdc: Hdc, lpxf: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_getWorldTransform((hdc?.value ?: 0L), (lpxf?.value ?: 0L))

public actual fun gradientFill(hdc: Hdc, pvertex: COpaquePointer?, nvertex: UInt, pmesh: COpaquePointer?, nmesh: UInt, ulmode: GradientFill): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_gradientFill((hdc?.value ?: 0L), (pvertex?.value ?: 0L), nvertex.toInt(), (pmesh?.value ?: 0L), nmesh.toInt(), ulmode.toInt())

public actual fun grayStringA(hdc: Hdc, hbrush: Hbrush, lpoutputfunc: Graystringproc, lpdata: Lparam, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_grayStringA((hdc?.value ?: 0L), (hbrush?.value ?: 0L), 0L, lpdata, ncount, x, y, nwidth, nheight)

public actual fun grayStringW(hdc: Hdc, hbrush: Hbrush, lpoutputfunc: Graystringproc, lpdata: Lparam, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_grayStringW((hdc?.value ?: 0L), (hbrush?.value ?: 0L), 0L, lpdata, ncount, x, y, nwidth, nheight)

public actual fun inflateRect(lprc: COpaquePointer?, dx: Int, dy: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_inflateRect((lprc?.value ?: 0L), dx, dy)

public actual fun intersectClipRect(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): GdiRegionType =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_intersectClipRect((hdc?.value ?: 0L), left, top, right, bottom)

public actual fun intersectRect(lprcdst: COpaquePointer?, lprcsrc1: COpaquePointer?, lprcsrc2: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_intersectRect((lprcdst?.value ?: 0L), (lprcsrc1?.value ?: 0L), (lprcsrc2?.value ?: 0L))

public actual fun invalidateRect(hwnd: Hwnd, lprect: COpaquePointer?, berase: Bool): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_invalidateRect((hwnd?.value ?: 0L), (lprect?.value ?: 0L), berase)

public actual fun invalidateRgn(hwnd: Hwnd, hrgn: Hrgn, berase: Bool): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_invalidateRgn((hwnd?.value ?: 0L), (hrgn?.value ?: 0L), berase)

public actual fun invertRect(hdc: Hdc, lprc: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_invertRect((hdc?.value ?: 0L), (lprc?.value ?: 0L))

public actual fun invertRgn(hdc: Hdc, hrgn: Hrgn): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_invertRgn((hdc?.value ?: 0L), (hrgn?.value ?: 0L))

public actual fun isRectEmpty(lprc: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_isRectEmpty((lprc?.value ?: 0L))

public actual fun lPtoDP(hdc: Hdc, lppt: COpaquePointer?, c: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_lPtoDP((hdc?.value ?: 0L), (lppt?.value ?: 0L), c)

public actual fun lineDDA(xstart: Int, ystart: Int, xend: Int, yend: Int, lpproc: Lineddaproc, data: Lparam): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_lineDDA(xstart, ystart, xend, yend, 0L, data)

public actual fun lineTo(hdc: Hdc, x: Int, y: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_lineTo((hdc?.value ?: 0L), x, y)

public actual fun loadBitmapA(hinstance: Hinstance, lpbitmapname: Pcstr): Hbitmap =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_loadBitmapA((hinstance?.value ?: 0L), (lpbitmapname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun loadBitmapW(hinstance: Hinstance, lpbitmapname: Pcwstr): Hbitmap =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_loadBitmapW((hinstance?.value ?: 0L), (lpbitmapname?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lockWindowUpdate(hwndlock: Hwnd): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_lockWindowUpdate((hwndlock?.value ?: 0L))

public actual fun mapWindowPoints(hwndfrom: Hwnd, hwndto: Hwnd, lppoints: COpaquePointer?, cpoints: UInt): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_mapWindowPoints((hwndfrom?.value ?: 0L), (hwndto?.value ?: 0L), (lppoints?.value ?: 0L), cpoints.toInt())

public actual fun maskBlt(hdcdest: Hdc, xdest: Int, ydest: Int, width: Int, height: Int, hdcsrc: Hdc, xsrc: Int, ysrc: Int, hbmmask: Hbitmap, xmask: Int, ymask: Int, rop: UInt): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_maskBlt((hdcdest?.value ?: 0L), xdest, ydest, width, height, (hdcsrc?.value ?: 0L), xsrc, ysrc, (hbmmask?.value ?: 0L), xmask, ymask, rop.toInt())

public actual fun mergeFontPackage(puchmergefontbuffer: COpaquePointer?, ulmergefontbuffersize: UInt, puchfontpackagebuffer: COpaquePointer?, ulfontpackagebuffersize: UInt, ppuchdestbuffer: COpaquePointer?, puldestbuffersize: COpaquePointer?, pulbyteswritten: COpaquePointer?, usmode: UShort, lpfnallocate: CfpAllocproc, lpfnreallocate: CfpReallocproc, lpfnfree: CfpFreeproc, lpvreserved: COpaquePointer?): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_mergeFontPackage((puchmergefontbuffer?.value ?: 0L), ulmergefontbuffersize.toInt(), (puchfontpackagebuffer?.value ?: 0L), ulfontpackagebuffersize.toInt(), (ppuchdestbuffer?.value ?: 0L), (puldestbuffersize?.value ?: 0L), (pulbyteswritten?.value ?: 0L), usmode.toShort(), 0L, 0L, 0L, (lpvreserved?.value ?: 0L)).toUInt()

public actual fun modifyWorldTransform(hdc: Hdc, lpxf: COpaquePointer?, mode: ModifyWorldTransformMode): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_modifyWorldTransform((hdc?.value ?: 0L), (lpxf?.value ?: 0L), mode.toInt())

public actual fun monitorFromPoint(pt: Point, dwflags: MonitorFromFlags): Hmonitor =
    null

public actual fun monitorFromRect(lprc: COpaquePointer?, dwflags: MonitorFromFlags): Hmonitor =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_monitorFromRect((lprc?.value ?: 0L), dwflags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun monitorFromWindow(hwnd: Hwnd, dwflags: MonitorFromFlags): Hmonitor =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_monitorFromWindow((hwnd?.value ?: 0L), dwflags.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun moveToEx(hdc: Hdc, x: Int, y: Int, lppt: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_moveToEx((hdc?.value ?: 0L), x, y, (lppt?.value ?: 0L))

public actual fun offsetClipRgn(hdc: Hdc, x: Int, y: Int): GdiRegionType =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_offsetClipRgn((hdc?.value ?: 0L), x, y)

public actual fun offsetRect(lprc: COpaquePointer?, dx: Int, dy: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_offsetRect((lprc?.value ?: 0L), dx, dy)

public actual fun offsetRgn(hrgn: Hrgn, x: Int, y: Int): GdiRegionType =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_offsetRgn((hrgn?.value ?: 0L), x, y)

public actual fun offsetViewportOrgEx(hdc: Hdc, x: Int, y: Int, lppt: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_offsetViewportOrgEx((hdc?.value ?: 0L), x, y, (lppt?.value ?: 0L))

public actual fun offsetWindowOrgEx(hdc: Hdc, x: Int, y: Int, lppt: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_offsetWindowOrgEx((hdc?.value ?: 0L), x, y, (lppt?.value ?: 0L))

public actual fun paintDesktop(hdc: Hdc): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_paintDesktop((hdc?.value ?: 0L))

public actual fun paintRgn(hdc: Hdc, hrgn: Hrgn): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_paintRgn((hdc?.value ?: 0L), (hrgn?.value ?: 0L))

public actual fun patBlt(hdc: Hdc, x: Int, y: Int, w: Int, h: Int, rop: RopCode): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_patBlt((hdc?.value ?: 0L), x, y, w, h, rop.toInt())

public actual fun pathToRegion(hdc: Hdc): Hrgn =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_pathToRegion((hdc?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pie(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_pie((hdc?.value ?: 0L), left, top, right, bottom, xr1, yr1, xr2, yr2)

public actual fun playEnhMetaFile(hdc: Hdc, hmf: Henhmetafile, lprect: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_playEnhMetaFile((hdc?.value ?: 0L), (hmf?.value ?: 0L), (lprect?.value ?: 0L))

public actual fun playEnhMetaFileRecord(hdc: Hdc, pht: COpaquePointer?, pmr: COpaquePointer?, cht: UInt): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_playEnhMetaFileRecord((hdc?.value ?: 0L), (pht?.value ?: 0L), (pmr?.value ?: 0L), cht.toInt())

public actual fun playMetaFile(hdc: Hdc, hmf: Hmetafile): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_playMetaFile((hdc?.value ?: 0L), (hmf?.value ?: 0L))

public actual fun playMetaFileRecord(hdc: Hdc, lphandletable: COpaquePointer?, lpmr: COpaquePointer?, noobjs: UInt): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_playMetaFileRecord((hdc?.value ?: 0L), (lphandletable?.value ?: 0L), (lpmr?.value ?: 0L), noobjs.toInt())

public actual fun plgBlt(hdcdest: Hdc, lppoint: COpaquePointer?, hdcsrc: Hdc, xsrc: Int, ysrc: Int, width: Int, height: Int, hbmmask: Hbitmap, xmask: Int, ymask: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_plgBlt((hdcdest?.value ?: 0L), (lppoint?.value ?: 0L), (hdcsrc?.value ?: 0L), xsrc, ysrc, width, height, (hbmmask?.value ?: 0L), xmask, ymask)

public actual fun polyBezier(hdc: Hdc, apt: COpaquePointer?, cpt: UInt): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_polyBezier((hdc?.value ?: 0L), (apt?.value ?: 0L), cpt.toInt())

public actual fun polyBezierTo(hdc: Hdc, apt: COpaquePointer?, cpt: UInt): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_polyBezierTo((hdc?.value ?: 0L), (apt?.value ?: 0L), cpt.toInt())

public actual fun polyDraw(hdc: Hdc, apt: COpaquePointer?, aj: COpaquePointer?, cpt: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_polyDraw((hdc?.value ?: 0L), (apt?.value ?: 0L), (aj?.value ?: 0L), cpt)

public actual fun polyPolygon(hdc: Hdc, apt: COpaquePointer?, asz: COpaquePointer?, csz: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_polyPolygon((hdc?.value ?: 0L), (apt?.value ?: 0L), (asz?.value ?: 0L), csz)

public actual fun polyPolyline(hdc: Hdc, apt: COpaquePointer?, asz: COpaquePointer?, csz: UInt): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_polyPolyline((hdc?.value ?: 0L), (apt?.value ?: 0L), (asz?.value ?: 0L), csz.toInt())

public actual fun polyTextOutA(hdc: Hdc, ppt: COpaquePointer?, nstrings: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_polyTextOutA((hdc?.value ?: 0L), (ppt?.value ?: 0L), nstrings)

public actual fun polyTextOutW(hdc: Hdc, ppt: COpaquePointer?, nstrings: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_polyTextOutW((hdc?.value ?: 0L), (ppt?.value ?: 0L), nstrings)

public actual fun polygon(hdc: Hdc, apt: COpaquePointer?, cpt: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_polygon((hdc?.value ?: 0L), (apt?.value ?: 0L), cpt)

public actual fun polyline(hdc: Hdc, apt: COpaquePointer?, cpt: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_polyline((hdc?.value ?: 0L), (apt?.value ?: 0L), cpt)

public actual fun polylineTo(hdc: Hdc, apt: COpaquePointer?, cpt: UInt): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_polylineTo((hdc?.value ?: 0L), (apt?.value ?: 0L), cpt.toInt())

public actual fun ptInRect(lprc: COpaquePointer?, pt: Point): Bool =
    0

public actual fun ptInRegion(hrgn: Hrgn, x: Int, y: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_ptInRegion((hrgn?.value ?: 0L), x, y)

public actual fun ptVisible(hdc: Hdc, x: Int, y: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_ptVisible((hdc?.value ?: 0L), x, y)

public actual fun realizePalette(hdc: Hdc): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_realizePalette((hdc?.value ?: 0L)).toUInt()

public actual fun rectInRegion(hrgn: Hrgn, lprect: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_rectInRegion((hrgn?.value ?: 0L), (lprect?.value ?: 0L))

public actual fun rectVisible(hdc: Hdc, lprect: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_rectVisible((hdc?.value ?: 0L), (lprect?.value ?: 0L))

public actual fun rectangle(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_rectangle((hdc?.value ?: 0L), left, top, right, bottom)

public actual fun redrawWindow(hwnd: Hwnd, lprcupdate: COpaquePointer?, hrgnupdate: Hrgn, flags: RedrawWindowFlags): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_redrawWindow((hwnd?.value ?: 0L), (lprcupdate?.value ?: 0L), (hrgnupdate?.value ?: 0L), flags.toInt())

public actual fun releaseDC(hwnd: Hwnd, hdc: Hdc): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_releaseDC((hwnd?.value ?: 0L), (hdc?.value ?: 0L))

public actual fun removeFontMemResourceEx(h: Handle): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_removeFontMemResourceEx((h?.value ?: 0L))

public actual fun removeFontResourceA(lpfilename: Pcstr): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_removeFontResourceA((lpfilename?.value ?: 0L))

public actual fun removeFontResourceExA(name: Pcstr, fl: UInt, pdv: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_removeFontResourceExA((name?.value ?: 0L), fl.toInt(), (pdv?.value ?: 0L))

public actual fun removeFontResourceExW(name: Pcwstr, fl: UInt, pdv: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_removeFontResourceExW((name?.value ?: 0L), fl.toInt(), (pdv?.value ?: 0L))

public actual fun removeFontResourceW(lpfilename: Pcwstr): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_removeFontResourceW((lpfilename?.value ?: 0L))

public actual fun resetDCA(hdc: Hdc, lpdm: COpaquePointer?): Hdc =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_resetDCA((hdc?.value ?: 0L), (lpdm?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun resetDCW(hdc: Hdc, lpdm: COpaquePointer?): Hdc =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_resetDCW((hdc?.value ?: 0L), (lpdm?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun resizePalette(hpal: Hpalette, n: UInt): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_resizePalette((hpal?.value ?: 0L), n.toInt())

public actual fun restoreDC(hdc: Hdc, nsaveddc: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_restoreDC((hdc?.value ?: 0L), nsaveddc)

public actual fun roundRect(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int, width: Int, height: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_roundRect((hdc?.value ?: 0L), left, top, right, bottom, width, height)

public actual fun saveDC(hdc: Hdc): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_saveDC((hdc?.value ?: 0L))

public actual fun scaleViewportExtEx(hdc: Hdc, xn: Int, dx: Int, yn: Int, yd: Int, lpsz: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_scaleViewportExtEx((hdc?.value ?: 0L), xn, dx, yn, yd, (lpsz?.value ?: 0L))

public actual fun scaleWindowExtEx(hdc: Hdc, xn: Int, xd: Int, yn: Int, yd: Int, lpsz: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_scaleWindowExtEx((hdc?.value ?: 0L), xn, xd, yn, yd, (lpsz?.value ?: 0L))

public actual fun screenToClient(hwnd: Hwnd, lppoint: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_screenToClient((hwnd?.value ?: 0L), (lppoint?.value ?: 0L))

public actual fun selectClipPath(hdc: Hdc, mode: RgnCombineMode): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_selectClipPath((hdc?.value ?: 0L), mode)

public actual fun selectClipRgn(hdc: Hdc, hrgn: Hrgn): GdiRegionType =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_selectClipRgn((hdc?.value ?: 0L), (hrgn?.value ?: 0L))

public actual fun selectObject(hdc: Hdc, h: Hgdiobj): Hgdiobj =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_selectObject((hdc?.value ?: 0L), (h?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun selectPalette(hdc: Hdc, hpal: Hpalette, bforcebkgd: Bool): Hpalette =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_selectPalette((hdc?.value ?: 0L), (hpal?.value ?: 0L), bforcebkgd).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setArcDirection(hdc: Hdc, dir: ArcDirection): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setArcDirection((hdc?.value ?: 0L), dir)

public actual fun setBitmapBits(hbm: Hbitmap, cb: UInt, pvbits: COpaquePointer?): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setBitmapBits((hbm?.value ?: 0L), cb.toInt(), (pvbits?.value ?: 0L))

public actual fun setBitmapDimensionEx(hbm: Hbitmap, w: Int, h: Int, lpsz: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setBitmapDimensionEx((hbm?.value ?: 0L), w, h, (lpsz?.value ?: 0L))

public actual fun setBkColor(hdc: Hdc, color: Colorref): Colorref =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setBkColor((hdc?.value ?: 0L), color.toInt()).toUInt()

public actual fun setBkMode(hdc: Hdc, mode: Int): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setBkMode((hdc?.value ?: 0L), mode)

public actual fun setBoundsRect(hdc: Hdc, lprect: COpaquePointer?, flags: SetBoundsRectFlags): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setBoundsRect((hdc?.value ?: 0L), (lprect?.value ?: 0L), flags.toInt()).toUInt()

public actual fun setBrushOrgEx(hdc: Hdc, x: Int, y: Int, lppt: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setBrushOrgEx((hdc?.value ?: 0L), x, y, (lppt?.value ?: 0L))

public actual fun setColorAdjustment(hdc: Hdc, lpca: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setColorAdjustment((hdc?.value ?: 0L), (lpca?.value ?: 0L))

public actual fun setDCBrushColor(hdc: Hdc, color: Colorref): Colorref =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setDCBrushColor((hdc?.value ?: 0L), color.toInt()).toUInt()

public actual fun setDCPenColor(hdc: Hdc, color: Colorref): Colorref =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setDCPenColor((hdc?.value ?: 0L), color.toInt()).toUInt()

public actual fun setDIBColorTable(hdc: Hdc, istart: UInt, centries: UInt, prgbq: COpaquePointer?): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setDIBColorTable((hdc?.value ?: 0L), istart.toInt(), centries.toInt(), (prgbq?.value ?: 0L)).toUInt()

public actual fun setDIBits(hdc: Hdc, hbm: Hbitmap, start: UInt, clines: UInt, lpbits: COpaquePointer?, lpbmi: COpaquePointer?, coloruse: DibUsage): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setDIBits((hdc?.value ?: 0L), (hbm?.value ?: 0L), start.toInt(), clines.toInt(), (lpbits?.value ?: 0L), (lpbmi?.value ?: 0L), coloruse.toInt())

public actual fun setDIBitsToDevice(hdc: Hdc, xdest: Int, ydest: Int, w: UInt, h: UInt, xsrc: Int, ysrc: Int, startscan: UInt, clines: UInt, lpvbits: COpaquePointer?, lpbmi: COpaquePointer?, coloruse: DibUsage): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setDIBitsToDevice((hdc?.value ?: 0L), xdest, ydest, w.toInt(), h.toInt(), xsrc, ysrc, startscan.toInt(), clines.toInt(), (lpvbits?.value ?: 0L), (lpbmi?.value ?: 0L), coloruse.toInt())

public actual fun setEnhMetaFileBits(nsize: UInt, pb: COpaquePointer?): Henhmetafile =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setEnhMetaFileBits(nsize.toInt(), (pb?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setGraphicsMode(hdc: Hdc, imode: GraphicsMode): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setGraphicsMode((hdc?.value ?: 0L), imode)

public actual fun setLayout(hdc: Hdc, l: DcLayout): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setLayout((hdc?.value ?: 0L), l.toInt()).toUInt()

public actual fun setMapMode(hdc: Hdc, imode: HdcMapMode): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setMapMode((hdc?.value ?: 0L), imode)

public actual fun setMapperFlags(hdc: Hdc, flags: UInt): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setMapperFlags((hdc?.value ?: 0L), flags.toInt()).toUInt()

public actual fun setMetaFileBitsEx(cbbuffer: UInt, lpdata: COpaquePointer?): Hmetafile =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setMetaFileBitsEx(cbbuffer.toInt(), (lpdata?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setMetaRgn(hdc: Hdc): GdiRegionType =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setMetaRgn((hdc?.value ?: 0L))

public actual fun setMiterLimit(hdc: Hdc, limit: Float, old: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setMiterLimit((hdc?.value ?: 0L), limit, (old?.value ?: 0L))

public actual fun setPaletteEntries(hpal: Hpalette, istart: UInt, centries: UInt, ppalentries: COpaquePointer?): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setPaletteEntries((hpal?.value ?: 0L), istart.toInt(), centries.toInt(), (ppalentries?.value ?: 0L)).toUInt()

public actual fun setPixel(hdc: Hdc, x: Int, y: Int, color: Colorref): Colorref =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setPixel((hdc?.value ?: 0L), x, y, color.toInt()).toUInt()

public actual fun setPixelV(hdc: Hdc, x: Int, y: Int, color: Colorref): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setPixelV((hdc?.value ?: 0L), x, y, color.toInt())

public actual fun setPolyFillMode(hdc: Hdc, mode: CreatePolygonRgnMode): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setPolyFillMode((hdc?.value ?: 0L), mode)

public actual fun setROP2(hdc: Hdc, rop2: R2Mode): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setROP2((hdc?.value ?: 0L), rop2)

public actual fun setRect(lprc: COpaquePointer?, xleft: Int, ytop: Int, xright: Int, ybottom: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setRect((lprc?.value ?: 0L), xleft, ytop, xright, ybottom)

public actual fun setRectEmpty(lprc: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setRectEmpty((lprc?.value ?: 0L))

public actual fun setRectRgn(hrgn: Hrgn, left: Int, top: Int, right: Int, bottom: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setRectRgn((hrgn?.value ?: 0L), left, top, right, bottom)

public actual fun setStretchBltMode(hdc: Hdc, mode: StretchBltMode): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setStretchBltMode((hdc?.value ?: 0L), mode)

public actual fun setSysColors(celements: Int, lpaelements: COpaquePointer?, lpargbvalues: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setSysColors(celements, (lpaelements?.value ?: 0L), (lpargbvalues?.value ?: 0L))

public actual fun setSystemPaletteUse(hdc: Hdc, use: SystemPaletteUse): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setSystemPaletteUse((hdc?.value ?: 0L), use.toInt()).toUInt()

public actual fun setTextAlign(hdc: Hdc, align: TextAlignOptions): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setTextAlign((hdc?.value ?: 0L), align.toInt()).toUInt()

public actual fun setTextCharacterExtra(hdc: Hdc, extra: Int): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setTextCharacterExtra((hdc?.value ?: 0L), extra)

public actual fun setTextColor(hdc: Hdc, color: Colorref): Colorref =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setTextColor((hdc?.value ?: 0L), color.toInt()).toUInt()

public actual fun setTextJustification(hdc: Hdc, extra: Int, count: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setTextJustification((hdc?.value ?: 0L), extra, count)

public actual fun setViewportExtEx(hdc: Hdc, x: Int, y: Int, lpsz: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setViewportExtEx((hdc?.value ?: 0L), x, y, (lpsz?.value ?: 0L))

public actual fun setViewportOrgEx(hdc: Hdc, x: Int, y: Int, lppt: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setViewportOrgEx((hdc?.value ?: 0L), x, y, (lppt?.value ?: 0L))

public actual fun setWindowExtEx(hdc: Hdc, x: Int, y: Int, lpsz: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setWindowExtEx((hdc?.value ?: 0L), x, y, (lpsz?.value ?: 0L))

public actual fun setWindowOrgEx(hdc: Hdc, x: Int, y: Int, lppt: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setWindowOrgEx((hdc?.value ?: 0L), x, y, (lppt?.value ?: 0L))

public actual fun setWindowRgn(hwnd: Hwnd, hrgn: Hrgn, bredraw: Bool): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setWindowRgn((hwnd?.value ?: 0L), (hrgn?.value ?: 0L), bredraw)

public actual fun setWorldTransform(hdc: Hdc, lpxf: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_setWorldTransform((hdc?.value ?: 0L), (lpxf?.value ?: 0L))

public actual fun stretchBlt(hdcdest: Hdc, xdest: Int, ydest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xsrc: Int, ysrc: Int, wsrc: Int, hsrc: Int, rop: RopCode): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_stretchBlt((hdcdest?.value ?: 0L), xdest, ydest, wdest, hdest, (hdcsrc?.value ?: 0L), xsrc, ysrc, wsrc, hsrc, rop.toInt())

public actual fun stretchDIBits(hdc: Hdc, xdest: Int, ydest: Int, destwidth: Int, destheight: Int, xsrc: Int, ysrc: Int, srcwidth: Int, srcheight: Int, lpbits: COpaquePointer?, lpbmi: COpaquePointer?, iusage: DibUsage, rop: RopCode): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_stretchDIBits((hdc?.value ?: 0L), xdest, ydest, destwidth, destheight, xsrc, ysrc, srcwidth, srcheight, (lpbits?.value ?: 0L), (lpbmi?.value ?: 0L), iusage.toInt(), rop.toInt())

public actual fun strokeAndFillPath(hdc: Hdc): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_strokeAndFillPath((hdc?.value ?: 0L))

public actual fun strokePath(hdc: Hdc): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_strokePath((hdc?.value ?: 0L))

public actual fun subtractRect(lprcdst: COpaquePointer?, lprcsrc1: COpaquePointer?, lprcsrc2: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_subtractRect((lprcdst?.value ?: 0L), (lprcsrc1?.value ?: 0L), (lprcsrc2?.value ?: 0L))

public actual fun tTCharToUnicode(hdc: Hdc, puccharcodes: COpaquePointer?, ulcharcodesize: UInt, pusshortcodes: COpaquePointer?, ulshortcodesize: UInt, ulflags: UInt): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_tTCharToUnicode((hdc?.value ?: 0L), (puccharcodes?.value ?: 0L), ulcharcodesize.toInt(), (pusshortcodes?.value ?: 0L), ulshortcodesize.toInt(), ulflags.toInt())

public actual fun tTDeleteEmbeddedFont(hfontreference: Handle, ulflags: UInt, pulstatus: COpaquePointer?): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_tTDeleteEmbeddedFont((hfontreference?.value ?: 0L), ulflags.toInt(), (pulstatus?.value ?: 0L))

public actual fun tTEmbedFont(hdc: Hdc, ulflags: TtembedFlags, ulcharset: EmbedFontCharset, pulprivstatus: COpaquePointer?, pulstatus: COpaquePointer?, lpfnwritetostream: Writeembedproc, lpvwritestream: COpaquePointer?, puscharcodeset: COpaquePointer?, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: COpaquePointer?): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_tTEmbedFont((hdc?.value ?: 0L), ulflags.toInt(), ulcharset.toInt(), (pulprivstatus?.value ?: 0L), (pulstatus?.value ?: 0L), 0L, (lpvwritestream?.value ?: 0L), (puscharcodeset?.value ?: 0L), uscharcodecount.toShort(), uslanguage.toShort(), (pttembedinfo?.value ?: 0L))

public actual fun tTEmbedFontEx(hdc: Hdc, ulflags: TtembedFlags, ulcharset: EmbedFontCharset, pulprivstatus: COpaquePointer?, pulstatus: COpaquePointer?, lpfnwritetostream: Writeembedproc, lpvwritestream: COpaquePointer?, pulcharcodeset: COpaquePointer?, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: COpaquePointer?): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_tTEmbedFontEx((hdc?.value ?: 0L), ulflags.toInt(), ulcharset.toInt(), (pulprivstatus?.value ?: 0L), (pulstatus?.value ?: 0L), 0L, (lpvwritestream?.value ?: 0L), (pulcharcodeset?.value ?: 0L), uscharcodecount.toShort(), uslanguage.toShort(), (pttembedinfo?.value ?: 0L))

public actual fun tTEmbedFontFromFileA(hdc: Hdc, szfontfilename: Pcstr, usttcindex: UShort, ulflags: TtembedFlags, ulcharset: EmbedFontCharset, pulprivstatus: COpaquePointer?, pulstatus: COpaquePointer?, lpfnwritetostream: Writeembedproc, lpvwritestream: COpaquePointer?, puscharcodeset: COpaquePointer?, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: COpaquePointer?): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_tTEmbedFontFromFileA((hdc?.value ?: 0L), (szfontfilename?.value ?: 0L), usttcindex.toShort(), ulflags.toInt(), ulcharset.toInt(), (pulprivstatus?.value ?: 0L), (pulstatus?.value ?: 0L), 0L, (lpvwritestream?.value ?: 0L), (puscharcodeset?.value ?: 0L), uscharcodecount.toShort(), uslanguage.toShort(), (pttembedinfo?.value ?: 0L))

public actual fun tTEnableEmbeddingForFacename(lpszfacename: Pcstr, benable: Bool): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_tTEnableEmbeddingForFacename((lpszfacename?.value ?: 0L), benable)

public actual fun tTGetEmbeddedFontInfo(ulflags: TtembedFlags, pulprivstatus: COpaquePointer?, ulprivs: FontLicensePrivs, pulstatus: COpaquePointer?, lpfnreadfromstream: Readembedproc, lpvreadstream: COpaquePointer?, pttloadinfo: COpaquePointer?): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_tTGetEmbeddedFontInfo(ulflags.toInt(), (pulprivstatus?.value ?: 0L), ulprivs.toInt(), (pulstatus?.value ?: 0L), 0L, (lpvreadstream?.value ?: 0L), (pttloadinfo?.value ?: 0L))

public actual fun tTGetEmbeddingType(hdc: Hdc, pulembedtype: COpaquePointer?): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_tTGetEmbeddingType((hdc?.value ?: 0L), (pulembedtype?.value ?: 0L))

public actual fun tTGetNewFontName(phfontreference: COpaquePointer?, wzwinfamilyname: Pwstr, cchmaxwinname: Int, szmacfamilyname: Pstr, cchmaxmacname: Int): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_tTGetNewFontName((phfontreference?.value ?: 0L), (wzwinfamilyname?.value ?: 0L), cchmaxwinname, (szmacfamilyname?.value ?: 0L), cchmaxmacname)

public actual fun tTIsEmbeddingEnabled(hdc: Hdc, pbenabled: COpaquePointer?): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_tTIsEmbeddingEnabled((hdc?.value ?: 0L), (pbenabled?.value ?: 0L))

public actual fun tTIsEmbeddingEnabledForFacename(lpszfacename: Pcstr, pbenabled: COpaquePointer?): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_tTIsEmbeddingEnabledForFacename((lpszfacename?.value ?: 0L), (pbenabled?.value ?: 0L))

public actual fun tTLoadEmbeddedFont(phfontreference: COpaquePointer?, ulflags: UInt, pulprivstatus: COpaquePointer?, ulprivs: FontLicensePrivs, pulstatus: COpaquePointer?, lpfnreadfromstream: Readembedproc, lpvreadstream: COpaquePointer?, szwinfamilyname: Pcwstr, szmacfamilyname: Pcstr, pttloadinfo: COpaquePointer?): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_tTLoadEmbeddedFont((phfontreference?.value ?: 0L), ulflags.toInt(), (pulprivstatus?.value ?: 0L), ulprivs.toInt(), (pulstatus?.value ?: 0L), 0L, (lpvreadstream?.value ?: 0L), (szwinfamilyname?.value ?: 0L), (szmacfamilyname?.value ?: 0L), (pttloadinfo?.value ?: 0L))

public actual fun tTRunValidationTests(hdc: Hdc, ptestparam: COpaquePointer?): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_tTRunValidationTests((hdc?.value ?: 0L), (ptestparam?.value ?: 0L))

public actual fun tTRunValidationTestsEx(hdc: Hdc, ptestparam: COpaquePointer?): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_tTRunValidationTestsEx((hdc?.value ?: 0L), (ptestparam?.value ?: 0L))

public actual fun tabbedTextOutA(hdc: Hdc, x: Int, y: Int, lpstring: Pcstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: COpaquePointer?, ntaborigin: Int): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_tabbedTextOutA((hdc?.value ?: 0L), x, y, (lpstring?.value ?: 0L), chcount, ntabpositions, (lpntabstoppositions?.value ?: 0L), ntaborigin)

public actual fun tabbedTextOutW(hdc: Hdc, x: Int, y: Int, lpstring: Pcwstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: COpaquePointer?, ntaborigin: Int): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_tabbedTextOutW((hdc?.value ?: 0L), x, y, (lpstring?.value ?: 0L), chcount, ntabpositions, (lpntabstoppositions?.value ?: 0L), ntaborigin)

public actual fun textOutA(hdc: Hdc, x: Int, y: Int, lpstring: Pcstr, c: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_textOutA((hdc?.value ?: 0L), x, y, (lpstring?.value ?: 0L), c)

public actual fun textOutW(hdc: Hdc, x: Int, y: Int, lpstring: Pcwstr, c: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_textOutW((hdc?.value ?: 0L), x, y, (lpstring?.value ?: 0L), c)

public actual fun transparentBlt(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: UInt): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_transparentBlt((hdcdest?.value ?: 0L), xorigindest, yorigindest, wdest, hdest, (hdcsrc?.value ?: 0L), xoriginsrc, yoriginsrc, wsrc, hsrc, crtransparent.toInt())

public actual fun unionRect(lprcdst: COpaquePointer?, lprcsrc1: COpaquePointer?, lprcsrc2: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_unionRect((lprcdst?.value ?: 0L), (lprcsrc1?.value ?: 0L), (lprcsrc2?.value ?: 0L))

public actual fun unrealizeObject(h: Hgdiobj): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_unrealizeObject((h?.value ?: 0L))

public actual fun updateColors(hdc: Hdc): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_updateColors((hdc?.value ?: 0L))

public actual fun updateWindow(hwnd: Hwnd): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_updateWindow((hwnd?.value ?: 0L))

public actual fun validateRect(hwnd: Hwnd, lprect: COpaquePointer?): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_validateRect((hwnd?.value ?: 0L), (lprect?.value ?: 0L))

public actual fun validateRgn(hwnd: Hwnd, hrgn: Hrgn): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_validateRgn((hwnd?.value ?: 0L), (hrgn?.value ?: 0L))

public actual fun widenPath(hdc: Hdc): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_widenPath((hdc?.value ?: 0L))

public actual fun windowFromDC(hdc: Hdc): Hwnd =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_windowFromDC((hdc?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun wglSwapMultipleBuffers(param0: UInt, param1: COpaquePointer?): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_wglSwapMultipleBuffers(param0.toInt(), (param1?.value ?: 0L)).toUInt()
