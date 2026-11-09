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

private object WindowsWin32GraphicsGdiJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_AbortPath(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_AddFontMemResourceEx(pfileview: Long, cjsize: Int, pvresrved: Long, pnumfonts: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_AddFontResourceA(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_AddFontResourceExA(name: Long, fl: Int, res: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_AddFontResourceExW(name: Long, fl: Int, res: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_AddFontResourceW(param0: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_AngleArc(hdc: Long, x: Int, y: Int, r: Int, startangle: Float, sweepangle: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_AnimatePalette(hpal: Long, istartindex: Int, centries: Int, ppe: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_Arc(hdc: Long, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_ArcTo(hdc: Long, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_BeginPaint(hwnd: Long, lppaint: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_BeginPath(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_BitBlt(hdc: Long, x: Int, y: Int, cx: Int, cy: Int, hdcsrc: Long, x1: Int, y1: Int, rop: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CancelDC(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_ChangeDisplaySettingsA(lpdevmode: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_ChangeDisplaySettingsExA(lpszdevicename: Long, lpdevmode: Long, hwnd: Long, dwflags: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_ChangeDisplaySettingsExW(lpszdevicename: Long, lpdevmode: Long, hwnd: Long, dwflags: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_ChangeDisplaySettingsW(lpdevmode: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_Chord(hdc: Long, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_ClientToScreen(hwnd: Long, lppoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CloseEnhMetaFile(hdc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CloseFigure(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CloseMetaFile(hdc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CombineRgn(hrgndst: Long, hrgnsrc1: Long, hrgnsrc2: Long, imode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CombineTransform(lpxfout: Long, lpxf1: Long, lpxf2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CopyEnhMetaFileA(henh: Long, lpfilename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CopyEnhMetaFileW(henh: Long, lpfilename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CopyMetaFileA(param0: Long, param1: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CopyMetaFileW(param0: Long, param1: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CopyRect(lprcdst: Long, lprcsrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateBitmap(nwidth: Int, nheight: Int, nplanes: Int, nbitcount: Int, lpbits: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateBitmapIndirect(pbm: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateBrushIndirect(plbrush: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateCompatibleBitmap(hdc: Long, cx: Int, cy: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateCompatibleDC(hdc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateDCA(pwszdriver: Long, pwszdevice: Long, pszport: Long, pdm: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateDCW(pwszdriver: Long, pwszdevice: Long, pszport: Long, pdm: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateDIBPatternBrush(h: Long, iusage: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateDIBPatternBrushPt(lppackeddib: Long, iusage: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateDIBSection(hdc: Long, pbmi: Long, usage: Int, ppvbits: Long, hsection: Long, offset: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateDIBitmap(hdc: Long, pbmih: Long, flinit: Int, pjbits: Long, pbmi: Long, iusage: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateDiscardableBitmap(hdc: Long, cx: Int, cy: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateEllipticRgn(x1: Int, y1: Int, x2: Int, y2: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateEllipticRgnIndirect(lprect: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateEnhMetaFileA(hdc: Long, lpfilename: Long, lprc: Long, lpdesc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateEnhMetaFileW(hdc: Long, lpfilename: Long, lprc: Long, lpdesc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateFontA(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: Int, bunderline: Int, bstrikeout: Int, icharset: Int, ioutprecision: Int, iclipprecision: Int, iquality: Int, ipitchandfamily: Int, pszfacename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateFontIndirectA(lplf: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateFontIndirectExA(param0: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateFontIndirectExW(param0: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateFontIndirectW(lplf: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateFontPackage(puchsrcbuffer: Long, ulsrcbuffersize: Int, ppuchfontpackagebuffer: Long, pulfontpackagebuffersize: Long, pulbyteswritten: Long, usflag: Short, usttcindex: Short, ussubsetformat: Short, ussubsetlanguage: Short, ussubsetplatform: Short, ussubsetencoding: Short, pussubsetkeeplist: Long, ussubsetlistcount: Short, lpfnallocate: Long, lpfnreallocate: Long, lpfnfree: Long, lpvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateFontW(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: Int, bunderline: Int, bstrikeout: Int, icharset: Int, ioutprecision: Int, iclipprecision: Int, iquality: Int, ipitchandfamily: Int, pszfacename: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateHalftonePalette(hdc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateHatchBrush(ihatch: Int, color: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateICA(pszdriver: Long, pszdevice: Long, pszport: Long, pdm: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateICW(pszdriver: Long, pszdevice: Long, pszport: Long, pdm: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateMetaFileA(pszfile: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateMetaFileW(pszfile: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreatePalette(plpal: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreatePatternBrush(hbm: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreatePen(istyle: Int, cwidth: Int, color: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreatePenIndirect(plpen: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreatePolyPolygonRgn(pptl: Long, pc: Long, cpoly: Int, imode: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreatePolygonRgn(pptl: Long, cpoint: Int, imode: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateRectRgn(x1: Int, y1: Int, x2: Int, y2: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateRectRgnIndirect(lprect: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateRoundRectRgn(x1: Int, y1: Int, x2: Int, y2: Int, w: Int, h: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateScalableFontResourceA(fdwhidden: Int, lpszfont: Long, lpszfile: Long, lpszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateScalableFontResourceW(fdwhidden: Int, lpszfont: Long, lpszfile: Long, lpszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_CreateSolidBrush(color: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_DPtoLP(hdc: Long, lppt: Long, c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_DeleteDC(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_DeleteEnhMetaFile(hmf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_DeleteMetaFile(hmf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_DeleteObject(ho: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_DrawAnimatedRects(hwnd: Long, idani: Int, lprcfrom: Long, lprcto: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_DrawCaption(hwnd: Long, hdc: Long, lprect: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_DrawEdge(hdc: Long, qrc: Long, edge: Int, grfflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_DrawEscape(hdc: Long, iescape: Int, cjin: Int, lpin: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_DrawFocusRect(hdc: Long, lprc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_DrawFrameControl(param0: Long, param1: Long, param2: Int, param3: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_DrawStateA(hdc: Long, hbrfore: Long, qfncallback: Long, ldata: Long, wdata: Long, x: Int, y: Int, cx: Int, cy: Int, uflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_DrawStateW(hdc: Long, hbrfore: Long, qfncallback: Long, ldata: Long, wdata: Long, x: Int, y: Int, cx: Int, cy: Int, uflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_DrawTextA(hdc: Long, lpchtext: Long, cchtext: Int, lprc: Long, format: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_DrawTextExA(hdc: Long, lpchtext: Long, cchtext: Int, lprc: Long, format: Int, lpdtp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_DrawTextExW(hdc: Long, lpchtext: Long, cchtext: Int, lprc: Long, format: Int, lpdtp: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_DrawTextW(hdc: Long, lpchtext: Long, cchtext: Int, lprc: Long, format: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_Ellipse(hdc: Long, left: Int, top: Int, right: Int, bottom: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_EndPaint(hwnd: Long, lppaint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_EndPath(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_EnumDisplayDevicesA(lpdevice: Long, idevnum: Int, lpdisplaydevice: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_EnumDisplayDevicesW(lpdevice: Long, idevnum: Int, lpdisplaydevice: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_EnumDisplayMonitors(hdc: Long, lprcclip: Long, lpfnenum: Long, dwdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_EnumDisplaySettingsA(lpszdevicename: Long, imodenum: Int, lpdevmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_EnumDisplaySettingsExA(lpszdevicename: Long, imodenum: Int, lpdevmode: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_EnumDisplaySettingsExW(lpszdevicename: Long, imodenum: Int, lpdevmode: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_EnumDisplaySettingsW(lpszdevicename: Long, imodenum: Int, lpdevmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_EnumEnhMetaFile(hdc: Long, hmf: Long, proc: Long, param3: Long, lprect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_EnumFontFamiliesA(hdc: Long, lplogfont: Long, lpproc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_EnumFontFamiliesExA(hdc: Long, lplogfont: Long, lpproc: Long, lparam: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_EnumFontFamiliesExW(hdc: Long, lplogfont: Long, lpproc: Long, lparam: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_EnumFontFamiliesW(hdc: Long, lplogfont: Long, lpproc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_EnumFontsA(hdc: Long, lplogfont: Long, lpproc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_EnumFontsW(hdc: Long, lplogfont: Long, lpproc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_EnumMetaFile(hdc: Long, hmf: Long, proc: Long, param3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_EnumObjects(hdc: Long, ntype: Int, lpfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_EqualRect(lprc1: Long, lprc2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_EqualRgn(hrgn1: Long, hrgn2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_ExcludeClipRect(hdc: Long, left: Int, top: Int, right: Int, bottom: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_ExcludeUpdateRgn(hdc: Long, hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_ExtCreatePen(ipenstyle: Int, cwidth: Int, plbrush: Long, cstyle: Int, pstyle: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_ExtCreateRegion(lpx: Long, ncount: Int, lpdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_ExtFloodFill(hdc: Long, x: Int, y: Int, color: Int, type: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_ExtSelectClipRgn(hdc: Long, hrgn: Long, mode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_ExtTextOutA(hdc: Long, x: Int, y: Int, options: Int, lprect: Long, lpstring: Long, c: Int, lpdx: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_ExtTextOutW(hdc: Long, x: Int, y: Int, options: Int, lprect: Long, lpstring: Long, c: Int, lpdx: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_FillPath(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_FillRect(hdc: Long, lprc: Long, hbr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_FillRgn(hdc: Long, hrgn: Long, hbr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_FixBrushOrgEx(hdc: Long, x: Int, y: Int, ptl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_FlattenPath(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_FloodFill(hdc: Long, x: Int, y: Int, color: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_FrameRect(hdc: Long, lprc: Long, hbr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_FrameRgn(hdc: Long, hrgn: Long, hbr: Long, w: Int, h: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GdiComment(hdc: Long, nsize: Int, lpdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GdiFlush(): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GdiGetBatchLimit(): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GdiGradientFill(hdc: Long, pvertex: Long, nvertex: Int, pmesh: Long, ncount: Int, ulmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GdiSetBatchLimit(dw: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GdiTransparentBlt(hdcdest: Long, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Long, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetArcDirection(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetAspectRatioFilterEx(hdc: Long, lpsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetBitmapBits(hbit: Long, cb: Int, lpvbits: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetBitmapDimensionEx(hbit: Long, lpsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetBkColor(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetBkMode(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetBoundsRect(hdc: Long, lprect: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetBrushOrgEx(hdc: Long, lppt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetCharABCWidthsA(hdc: Long, wfirst: Int, wlast: Int, lpabc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetCharABCWidthsFloatA(hdc: Long, ifirst: Int, ilast: Int, lpabc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetCharABCWidthsFloatW(hdc: Long, ifirst: Int, ilast: Int, lpabc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetCharABCWidthsI(hdc: Long, gifirst: Int, cgi: Int, pgi: Long, pabc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetCharABCWidthsW(hdc: Long, wfirst: Int, wlast: Int, lpabc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetCharWidth32A(hdc: Long, ifirst: Int, ilast: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetCharWidth32W(hdc: Long, ifirst: Int, ilast: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetCharWidthA(hdc: Long, ifirst: Int, ilast: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetCharWidthFloatA(hdc: Long, ifirst: Int, ilast: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetCharWidthFloatW(hdc: Long, ifirst: Int, ilast: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetCharWidthI(hdc: Long, gifirst: Int, cgi: Int, pgi: Long, piwidths: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetCharWidthW(hdc: Long, ifirst: Int, ilast: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetCharacterPlacementA(hdc: Long, lpstring: Long, ncount: Int, nmexextent: Int, lpresults: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetCharacterPlacementW(hdc: Long, lpstring: Long, ncount: Int, nmexextent: Int, lpresults: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetClipBox(hdc: Long, lprect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetClipRgn(hdc: Long, hrgn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetColorAdjustment(hdc: Long, lpca: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetCurrentObject(hdc: Long, type: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetCurrentPositionEx(hdc: Long, lppt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetDC(hwnd: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetDCBrushColor(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetDCEx(hwnd: Long, hrgnclip: Long, flags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetDCOrgEx(hdc: Long, lppt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetDCPenColor(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetDIBColorTable(hdc: Long, istart: Int, centries: Int, prgbq: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetDIBits(hdc: Long, hbm: Long, start: Int, clines: Int, lpvbits: Long, lpbmi: Long, usage: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetDeviceCaps(hdc: Long, index: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetEnhMetaFileA(lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetEnhMetaFileBits(hemf: Long, nsize: Int, lpdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetEnhMetaFileDescriptionA(hemf: Long, cchbuffer: Int, lpdescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetEnhMetaFileDescriptionW(hemf: Long, cchbuffer: Int, lpdescription: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetEnhMetaFileHeader(hemf: Long, nsize: Int, lpenhmetaheader: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetEnhMetaFilePaletteEntries(hemf: Long, nnumentries: Int, lppaletteentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetEnhMetaFileW(lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetFontData(hdc: Long, dwtable: Int, dwoffset: Int, pvbuffer: Long, cjbuffer: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetFontLanguageInfo(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetFontUnicodeRanges(hdc: Long, lpgs: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetGlyphIndicesA(hdc: Long, lpstr: Long, c: Int, pgi: Long, fl: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetGlyphIndicesW(hdc: Long, lpstr: Long, c: Int, pgi: Long, fl: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetGlyphOutlineA(hdc: Long, uchar: Int, fuformat: Int, lpgm: Long, cjbuffer: Int, pvbuffer: Long, lpmat2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetGlyphOutlineW(hdc: Long, uchar: Int, fuformat: Int, lpgm: Long, cjbuffer: Int, pvbuffer: Long, lpmat2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetGraphicsMode(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetKerningPairsA(hdc: Long, npairs: Int, lpkernpair: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetKerningPairsW(hdc: Long, npairs: Int, lpkernpair: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetLayout(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetMapMode(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetMetaFileA(lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetMetaFileBitsEx(hmf: Long, cbbuffer: Int, lpdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetMetaFileW(lpname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetMetaRgn(hdc: Long, hrgn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetMiterLimit(hdc: Long, plimit: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetMonitorInfoA(hmonitor: Long, lpmi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetMonitorInfoW(hmonitor: Long, lpmi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetNearestColor(hdc: Long, color: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetNearestPaletteIndex(h: Long, color: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetObjectA(h: Long, c: Int, pv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetObjectType(h: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetObjectW(h: Long, c: Int, pv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetOutlineTextMetricsA(hdc: Long, cjcopy: Int, potm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetOutlineTextMetricsW(hdc: Long, cjcopy: Int, potm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetPaletteEntries(hpal: Long, istart: Int, centries: Int, ppalentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetPath(hdc: Long, apt: Long, aj: Long, cpt: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetPixel(hdc: Long, x: Int, y: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetPolyFillMode(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetROP2(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetRandomRgn(hdc: Long, hrgn: Long, i: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetRasterizerCaps(lpraststat: Long, cjbytes: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetRegionData(hrgn: Long, ncount: Int, lprgndata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetRgnBox(hrgn: Long, lprc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetStockObject(i: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetStretchBltMode(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetSysColor(nindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetSysColorBrush(nindex: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetSystemPaletteEntries(hdc: Long, istart: Int, centries: Int, ppalentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetSystemPaletteUse(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetTabbedTextExtentA(hdc: Long, lpstring: Long, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetTabbedTextExtentW(hdc: Long, lpstring: Long, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetTextAlign(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetTextCharacterExtra(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetTextColor(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetTextExtentExPointA(hdc: Long, lpszstring: Long, cchstring: Int, nmaxextent: Int, lpnfit: Long, lpndx: Long, lpsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetTextExtentExPointI(hdc: Long, lpwszstring: Long, cwchstring: Int, nmaxextent: Int, lpnfit: Long, lpndx: Long, lpsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetTextExtentExPointW(hdc: Long, lpszstring: Long, cchstring: Int, nmaxextent: Int, lpnfit: Long, lpndx: Long, lpsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetTextExtentPoint32A(hdc: Long, lpstring: Long, c: Int, psizl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetTextExtentPoint32W(hdc: Long, lpstring: Long, c: Int, psizl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetTextExtentPointA(hdc: Long, lpstring: Long, c: Int, lpsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetTextExtentPointI(hdc: Long, pgiin: Long, cgi: Int, psize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetTextExtentPointW(hdc: Long, lpstring: Long, c: Int, lpsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetTextFaceA(hdc: Long, c: Int, lpname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetTextFaceW(hdc: Long, c: Int, lpname: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetTextMetricsA(hdc: Long, lptm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetTextMetricsW(hdc: Long, lptm: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetUpdateRect(hwnd: Long, lprect: Long, berase: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetUpdateRgn(hwnd: Long, hrgn: Long, berase: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetViewportExtEx(hdc: Long, lpsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetViewportOrgEx(hdc: Long, lppoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetWinMetaFileBits(hemf: Long, cbdata16: Int, pdata16: Long, imapmode: Int, hdcref: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetWindowDC(hwnd: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetWindowExtEx(hdc: Long, lpsize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetWindowOrgEx(hdc: Long, lppoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetWindowRgn(hwnd: Long, hrgn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetWindowRgnBox(hwnd: Long, lprc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GetWorldTransform(hdc: Long, lpxf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GradientFill(hdc: Long, pvertex: Long, nvertex: Int, pmesh: Long, nmesh: Int, ulmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GrayStringA(hdc: Long, hbrush: Long, lpoutputfunc: Long, lpdata: Long, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_GrayStringW(hdc: Long, hbrush: Long, lpoutputfunc: Long, lpdata: Long, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_InflateRect(lprc: Long, dx: Int, dy: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_IntersectClipRect(hdc: Long, left: Int, top: Int, right: Int, bottom: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_IntersectRect(lprcdst: Long, lprcsrc1: Long, lprcsrc2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_InvalidateRect(hwnd: Long, lprect: Long, berase: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_InvalidateRgn(hwnd: Long, hrgn: Long, berase: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_InvertRect(hdc: Long, lprc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_InvertRgn(hdc: Long, hrgn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_IsRectEmpty(lprc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_LPtoDP(hdc: Long, lppt: Long, c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_LineDDA(xstart: Int, ystart: Int, xend: Int, yend: Int, lpproc: Long, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_LineTo(hdc: Long, x: Int, y: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_LoadBitmapA(hinstance: Long, lpbitmapname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_LoadBitmapW(hinstance: Long, lpbitmapname: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_LockWindowUpdate(hwndlock: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_MapWindowPoints(hwndfrom: Long, hwndto: Long, lppoints: Long, cpoints: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_MaskBlt(hdcdest: Long, xdest: Int, ydest: Int, width: Int, height: Int, hdcsrc: Long, xsrc: Int, ysrc: Int, hbmmask: Long, xmask: Int, ymask: Int, rop: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_MergeFontPackage(puchmergefontbuffer: Long, ulmergefontbuffersize: Int, puchfontpackagebuffer: Long, ulfontpackagebuffersize: Int, ppuchdestbuffer: Long, puldestbuffersize: Long, pulbyteswritten: Long, usmode: Short, lpfnallocate: Long, lpfnreallocate: Long, lpfnfree: Long, lpvreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_ModifyWorldTransform(hdc: Long, lpxf: Long, mode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_MonitorFromRect(lprc: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_MonitorFromWindow(hwnd: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_MoveToEx(hdc: Long, x: Int, y: Int, lppt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_OffsetClipRgn(hdc: Long, x: Int, y: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_OffsetRect(lprc: Long, dx: Int, dy: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_OffsetRgn(hrgn: Long, x: Int, y: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_OffsetViewportOrgEx(hdc: Long, x: Int, y: Int, lppt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_OffsetWindowOrgEx(hdc: Long, x: Int, y: Int, lppt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_PaintDesktop(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_PaintRgn(hdc: Long, hrgn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_PatBlt(hdc: Long, x: Int, y: Int, w: Int, h: Int, rop: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_PathToRegion(hdc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_Pie(hdc: Long, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_PlayEnhMetaFile(hdc: Long, hmf: Long, lprect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_PlayEnhMetaFileRecord(hdc: Long, pht: Long, pmr: Long, cht: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_PlayMetaFile(hdc: Long, hmf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_PlayMetaFileRecord(hdc: Long, lphandletable: Long, lpmr: Long, noobjs: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_PlgBlt(hdcdest: Long, lppoint: Long, hdcsrc: Long, xsrc: Int, ysrc: Int, width: Int, height: Int, hbmmask: Long, xmask: Int, ymask: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_PolyBezier(hdc: Long, apt: Long, cpt: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_PolyBezierTo(hdc: Long, apt: Long, cpt: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_PolyDraw(hdc: Long, apt: Long, aj: Long, cpt: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_PolyPolygon(hdc: Long, apt: Long, asz: Long, csz: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_PolyPolyline(hdc: Long, apt: Long, asz: Long, csz: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_PolyTextOutA(hdc: Long, ppt: Long, nstrings: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_PolyTextOutW(hdc: Long, ppt: Long, nstrings: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_Polygon(hdc: Long, apt: Long, cpt: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_Polyline(hdc: Long, apt: Long, cpt: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_PolylineTo(hdc: Long, apt: Long, cpt: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_PtInRegion(hrgn: Long, x: Int, y: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_PtVisible(hdc: Long, x: Int, y: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_RealizePalette(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_RectInRegion(hrgn: Long, lprect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_RectVisible(hdc: Long, lprect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_Rectangle(hdc: Long, left: Int, top: Int, right: Int, bottom: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_RedrawWindow(hwnd: Long, lprcupdate: Long, hrgnupdate: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_ReleaseDC(hwnd: Long, hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_RemoveFontMemResourceEx(h: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_RemoveFontResourceA(lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_RemoveFontResourceExA(name: Long, fl: Int, pdv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_RemoveFontResourceExW(name: Long, fl: Int, pdv: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_RemoveFontResourceW(lpfilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_ResetDCA(hdc: Long, lpdm: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_ResetDCW(hdc: Long, lpdm: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_ResizePalette(hpal: Long, n: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_RestoreDC(hdc: Long, nsaveddc: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_RoundRect(hdc: Long, left: Int, top: Int, right: Int, bottom: Int, width: Int, height: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SaveDC(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_ScaleViewportExtEx(hdc: Long, xn: Int, dx: Int, yn: Int, yd: Int, lpsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_ScaleWindowExtEx(hdc: Long, xn: Int, xd: Int, yn: Int, yd: Int, lpsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_ScreenToClient(hwnd: Long, lppoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SelectClipPath(hdc: Long, mode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SelectClipRgn(hdc: Long, hrgn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SelectObject(hdc: Long, h: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SelectPalette(hdc: Long, hpal: Long, bforcebkgd: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetArcDirection(hdc: Long, dir: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetBitmapBits(hbm: Long, cb: Int, pvbits: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetBitmapDimensionEx(hbm: Long, w: Int, h: Int, lpsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetBkColor(hdc: Long, color: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetBkMode(hdc: Long, mode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetBoundsRect(hdc: Long, lprect: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetBrushOrgEx(hdc: Long, x: Int, y: Int, lppt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetColorAdjustment(hdc: Long, lpca: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetDCBrushColor(hdc: Long, color: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetDCPenColor(hdc: Long, color: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetDIBColorTable(hdc: Long, istart: Int, centries: Int, prgbq: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetDIBits(hdc: Long, hbm: Long, start: Int, clines: Int, lpbits: Long, lpbmi: Long, coloruse: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetDIBitsToDevice(hdc: Long, xdest: Int, ydest: Int, w: Int, h: Int, xsrc: Int, ysrc: Int, startscan: Int, clines: Int, lpvbits: Long, lpbmi: Long, coloruse: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetEnhMetaFileBits(nsize: Int, pb: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetGraphicsMode(hdc: Long, imode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetLayout(hdc: Long, l: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetMapMode(hdc: Long, imode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetMapperFlags(hdc: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetMetaFileBitsEx(cbbuffer: Int, lpdata: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetMetaRgn(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetMiterLimit(hdc: Long, limit: Float, old: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetPaletteEntries(hpal: Long, istart: Int, centries: Int, ppalentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetPixel(hdc: Long, x: Int, y: Int, color: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetPixelV(hdc: Long, x: Int, y: Int, color: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetPolyFillMode(hdc: Long, mode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetROP2(hdc: Long, rop2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetRect(lprc: Long, xleft: Int, ytop: Int, xright: Int, ybottom: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetRectEmpty(lprc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetRectRgn(hrgn: Long, left: Int, top: Int, right: Int, bottom: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetStretchBltMode(hdc: Long, mode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetSysColors(celements: Int, lpaelements: Long, lpargbvalues: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetSystemPaletteUse(hdc: Long, use: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetTextAlign(hdc: Long, align: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetTextCharacterExtra(hdc: Long, extra: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetTextColor(hdc: Long, color: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetTextJustification(hdc: Long, extra: Int, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetViewportExtEx(hdc: Long, x: Int, y: Int, lpsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetViewportOrgEx(hdc: Long, x: Int, y: Int, lppt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetWindowExtEx(hdc: Long, x: Int, y: Int, lpsz: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetWindowOrgEx(hdc: Long, x: Int, y: Int, lppt: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetWindowRgn(hwnd: Long, hrgn: Long, bredraw: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SetWorldTransform(hdc: Long, lpxf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_StretchBlt(hdcdest: Long, xdest: Int, ydest: Int, wdest: Int, hdest: Int, hdcsrc: Long, xsrc: Int, ysrc: Int, wsrc: Int, hsrc: Int, rop: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_StretchDIBits(hdc: Long, xdest: Int, ydest: Int, destwidth: Int, destheight: Int, xsrc: Int, ysrc: Int, srcwidth: Int, srcheight: Int, lpbits: Long, lpbmi: Long, iusage: Int, rop: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_StrokeAndFillPath(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_StrokePath(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_SubtractRect(lprcdst: Long, lprcsrc1: Long, lprcsrc2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_TTCharToUnicode(hdc: Long, puccharcodes: Long, ulcharcodesize: Int, pusshortcodes: Long, ulshortcodesize: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_TTDeleteEmbeddedFont(hfontreference: Long, ulflags: Int, pulstatus: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_TTEmbedFont(hdc: Long, ulflags: Int, ulcharset: Int, pulprivstatus: Long, pulstatus: Long, lpfnwritetostream: Long, lpvwritestream: Long, puscharcodeset: Long, uscharcodecount: Short, uslanguage: Short, pttembedinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_TTEmbedFontEx(hdc: Long, ulflags: Int, ulcharset: Int, pulprivstatus: Long, pulstatus: Long, lpfnwritetostream: Long, lpvwritestream: Long, pulcharcodeset: Long, uscharcodecount: Short, uslanguage: Short, pttembedinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_TTEmbedFontFromFileA(hdc: Long, szfontfilename: Long, usttcindex: Short, ulflags: Int, ulcharset: Int, pulprivstatus: Long, pulstatus: Long, lpfnwritetostream: Long, lpvwritestream: Long, puscharcodeset: Long, uscharcodecount: Short, uslanguage: Short, pttembedinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_TTEnableEmbeddingForFacename(lpszfacename: Long, benable: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_TTGetEmbeddedFontInfo(ulflags: Int, pulprivstatus: Long, ulprivs: Int, pulstatus: Long, lpfnreadfromstream: Long, lpvreadstream: Long, pttloadinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_TTGetEmbeddingType(hdc: Long, pulembedtype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_TTGetNewFontName(phfontreference: Long, wzwinfamilyname: Long, cchmaxwinname: Int, szmacfamilyname: Long, cchmaxmacname: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_TTIsEmbeddingEnabled(hdc: Long, pbenabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_TTIsEmbeddingEnabledForFacename(lpszfacename: Long, pbenabled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_TTLoadEmbeddedFont(phfontreference: Long, ulflags: Int, pulprivstatus: Long, ulprivs: Int, pulstatus: Long, lpfnreadfromstream: Long, lpvreadstream: Long, szwinfamilyname: Long, szmacfamilyname: Long, pttloadinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_TTRunValidationTests(hdc: Long, ptestparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_TTRunValidationTestsEx(hdc: Long, ptestparam: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_TabbedTextOutA(hdc: Long, x: Int, y: Int, lpstring: Long, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long, ntaborigin: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_TabbedTextOutW(hdc: Long, x: Int, y: Int, lpstring: Long, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long, ntaborigin: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_TextOutA(hdc: Long, x: Int, y: Int, lpstring: Long, c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_TextOutW(hdc: Long, x: Int, y: Int, lpstring: Long, c: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_TransparentBlt(hdcdest: Long, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Long, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_UnionRect(lprcdst: Long, lprcsrc1: Long, lprcsrc2: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_UnrealizeObject(h: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_UpdateColors(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_UpdateWindow(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_ValidateRect(hwnd: Long, lprect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_ValidateRgn(hwnd: Long, hrgn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_WidenPath(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_WindowFromDC(hdc: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdi_wglSwapMultipleBuffers(param0: Int, param1: Long): Int
}

public actual fun AbortPath(hdc: HDC): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_AbortPath(hdc)

public actual fun AddFontMemResourceEx(pfileview: Long, cjsize: UInt, pvresrved: Long, pnumfonts: Long): HANDLE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_AddFontMemResourceEx(pfileview, cjsize.toInt(), pvresrved, pnumfonts)

public actual fun AddFontResourceA(param0: PCSTR): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_AddFontResourceA(param0)

public actual fun AddFontResourceExA(name: PCSTR, fl: FONT_RESOURCE_CHARACTERISTICS, res: Long): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_AddFontResourceExA(name, fl.toInt(), res)

public actual fun AddFontResourceExW(name: PCWSTR, fl: FONT_RESOURCE_CHARACTERISTICS, res: Long): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_AddFontResourceExW(name, fl.toInt(), res)

public actual fun AddFontResourceW(param0: PCWSTR): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_AddFontResourceW(param0)

public actual fun AlphaBlend(hdcdest: HDC, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: HDC, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, ftn: BLENDFUNCTION): BOOL =
    0

public actual fun AngleArc(hdc: HDC, x: Int, y: Int, r: UInt, startangle: Float, sweepangle: Float): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_AngleArc(hdc, x, y, r.toInt(), startangle, sweepangle)

public actual fun AnimatePalette(hpal: HPALETTE, istartindex: UInt, centries: UInt, ppe: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_AnimatePalette(hpal, istartindex.toInt(), centries.toInt(), ppe)

public actual fun Arc(hdc: HDC, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_Arc(hdc, x1, y1, x2, y2, x3, y3, x4, y4)

public actual fun ArcTo(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_ArcTo(hdc, left, top, right, bottom, xr1, yr1, xr2, yr2)

public actual fun BeginPaint(hwnd: HWND, lppaint: Long): HDC =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_BeginPaint(hwnd, lppaint)

public actual fun BeginPath(hdc: HDC): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_BeginPath(hdc)

public actual fun BitBlt(hdc: HDC, x: Int, y: Int, cx: Int, cy: Int, hdcsrc: HDC, x1: Int, y1: Int, rop: ROP_CODE): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_BitBlt(hdc, x, y, cx, cy, hdcsrc, x1, y1, rop.toInt())

public actual fun CancelDC(hdc: HDC): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CancelDC(hdc)

public actual fun ChangeDisplaySettingsA(lpdevmode: Long, dwflags: CDS_TYPE): DISP_CHANGE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_ChangeDisplaySettingsA(lpdevmode, dwflags.toInt())

public actual fun ChangeDisplaySettingsExA(lpszdevicename: PCSTR, lpdevmode: Long, hwnd: HWND, dwflags: CDS_TYPE, lparam: Long): DISP_CHANGE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_ChangeDisplaySettingsExA(lpszdevicename, lpdevmode, hwnd, dwflags.toInt(), lparam)

public actual fun ChangeDisplaySettingsExW(lpszdevicename: PCWSTR, lpdevmode: Long, hwnd: HWND, dwflags: CDS_TYPE, lparam: Long): DISP_CHANGE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_ChangeDisplaySettingsExW(lpszdevicename, lpdevmode, hwnd, dwflags.toInt(), lparam)

public actual fun ChangeDisplaySettingsW(lpdevmode: Long, dwflags: CDS_TYPE): DISP_CHANGE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_ChangeDisplaySettingsW(lpdevmode, dwflags.toInt())

public actual fun Chord(hdc: HDC, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_Chord(hdc, x1, y1, x2, y2, x3, y3, x4, y4)

public actual fun ClientToScreen(hwnd: HWND, lppoint: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_ClientToScreen(hwnd, lppoint)

public actual fun CloseEnhMetaFile(hdc: HDC): HENHMETAFILE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CloseEnhMetaFile(hdc)

public actual fun CloseFigure(hdc: HDC): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CloseFigure(hdc)

public actual fun CloseMetaFile(hdc: HDC): HMETAFILE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CloseMetaFile(hdc)

public actual fun CombineRgn(hrgndst: HRGN, hrgnsrc1: HRGN, hrgnsrc2: HRGN, imode: RGN_COMBINE_MODE): GDI_REGION_TYPE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CombineRgn(hrgndst, hrgnsrc1, hrgnsrc2, imode)

public actual fun CombineTransform(lpxfout: Long, lpxf1: Long, lpxf2: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CombineTransform(lpxfout, lpxf1, lpxf2)

public actual fun CopyEnhMetaFileA(henh: HENHMETAFILE, lpfilename: PCSTR): HENHMETAFILE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CopyEnhMetaFileA(henh, lpfilename)

public actual fun CopyEnhMetaFileW(henh: HENHMETAFILE, lpfilename: PCWSTR): HENHMETAFILE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CopyEnhMetaFileW(henh, lpfilename)

public actual fun CopyMetaFileA(param0: HMETAFILE, param1: PCSTR): HMETAFILE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CopyMetaFileA(param0, param1)

public actual fun CopyMetaFileW(param0: HMETAFILE, param1: PCWSTR): HMETAFILE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CopyMetaFileW(param0, param1)

public actual fun CopyRect(lprcdst: Long, lprcsrc: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CopyRect(lprcdst, lprcsrc)

public actual fun CreateBitmap(nwidth: Int, nheight: Int, nplanes: UInt, nbitcount: UInt, lpbits: Long): HBITMAP =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateBitmap(nwidth, nheight, nplanes.toInt(), nbitcount.toInt(), lpbits)

public actual fun CreateBitmapIndirect(pbm: Long): HBITMAP =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateBitmapIndirect(pbm)

public actual fun CreateBrushIndirect(plbrush: Long): HBRUSH =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateBrushIndirect(plbrush)

public actual fun CreateCompatibleBitmap(hdc: HDC, cx: Int, cy: Int): HBITMAP =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateCompatibleBitmap(hdc, cx, cy)

public actual fun CreateCompatibleDC(hdc: HDC): HDC =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateCompatibleDC(hdc)

public actual fun CreateDCA(pwszdriver: PCSTR, pwszdevice: PCSTR, pszport: PCSTR, pdm: Long): HDC =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateDCA(pwszdriver, pwszdevice, pszport, pdm)

public actual fun CreateDCW(pwszdriver: PCWSTR, pwszdevice: PCWSTR, pszport: PCWSTR, pdm: Long): HDC =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateDCW(pwszdriver, pwszdevice, pszport, pdm)

public actual fun CreateDIBPatternBrush(h: HGLOBAL, iusage: DIB_USAGE): HBRUSH =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateDIBPatternBrush(h, iusage.toInt())

public actual fun CreateDIBPatternBrushPt(lppackeddib: Long, iusage: DIB_USAGE): HBRUSH =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateDIBPatternBrushPt(lppackeddib, iusage.toInt())

public actual fun CreateDIBSection(hdc: HDC, pbmi: Long, usage: DIB_USAGE, ppvbits: Long, hsection: HANDLE, offset: UInt): HBITMAP =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateDIBSection(hdc, pbmi, usage.toInt(), ppvbits, hsection, offset.toInt())

public actual fun CreateDIBitmap(hdc: HDC, pbmih: Long, flinit: UInt, pjbits: Long, pbmi: Long, iusage: DIB_USAGE): HBITMAP =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateDIBitmap(hdc, pbmih, flinit.toInt(), pjbits, pbmi, iusage.toInt())

public actual fun CreateDiscardableBitmap(hdc: HDC, cx: Int, cy: Int): HBITMAP =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateDiscardableBitmap(hdc, cx, cy)

public actual fun CreateEllipticRgn(x1: Int, y1: Int, x2: Int, y2: Int): HRGN =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateEllipticRgn(x1, y1, x2, y2)

public actual fun CreateEllipticRgnIndirect(lprect: Long): HRGN =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateEllipticRgnIndirect(lprect)

public actual fun CreateEnhMetaFileA(hdc: HDC, lpfilename: PCSTR, lprc: Long, lpdesc: PCSTR): HDC =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateEnhMetaFileA(hdc, lpfilename, lprc, lpdesc)

public actual fun CreateEnhMetaFileW(hdc: HDC, lpfilename: PCWSTR, lprc: Long, lpdesc: PCWSTR): HDC =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateEnhMetaFileW(hdc, lpfilename, lprc, lpdesc)

public actual fun CreateFontA(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: UInt, bunderline: UInt, bstrikeout: UInt, icharset: UInt, ioutprecision: UInt, iclipprecision: UInt, iquality: UInt, ipitchandfamily: UInt, pszfacename: PCSTR): HFONT =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateFontA(cheight, cwidth, cescapement, corientation, cweight, bitalic.toInt(), bunderline.toInt(), bstrikeout.toInt(), icharset.toInt(), ioutprecision.toInt(), iclipprecision.toInt(), iquality.toInt(), ipitchandfamily.toInt(), pszfacename)

public actual fun CreateFontIndirectA(lplf: Long): HFONT =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateFontIndirectA(lplf)

public actual fun CreateFontIndirectExA(param0: Long): HFONT =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateFontIndirectExA(param0)

public actual fun CreateFontIndirectExW(param0: Long): HFONT =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateFontIndirectExW(param0)

public actual fun CreateFontIndirectW(lplf: Long): HFONT =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateFontIndirectW(lplf)

public actual fun CreateFontPackage(puchsrcbuffer: Long, ulsrcbuffersize: UInt, ppuchfontpackagebuffer: Long, pulfontpackagebuffersize: Long, pulbyteswritten: Long, usflag: UShort, usttcindex: UShort, ussubsetformat: UShort, ussubsetlanguage: UShort, ussubsetplatform: CREATE_FONT_PACKAGE_SUBSET_PLATFORM, ussubsetencoding: CREATE_FONT_PACKAGE_SUBSET_ENCODING, pussubsetkeeplist: Long, ussubsetlistcount: UShort, lpfnallocate: CFP_ALLOCPROC, lpfnreallocate: CFP_REALLOCPROC, lpfnfree: CFP_FREEPROC, lpvreserved: Long): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateFontPackage(puchsrcbuffer, ulsrcbuffersize.toInt(), ppuchfontpackagebuffer, pulfontpackagebuffersize, pulbyteswritten, usflag.toShort(), usttcindex.toShort(), ussubsetformat.toShort(), ussubsetlanguage.toShort(), ussubsetplatform, ussubsetencoding, pussubsetkeeplist, ussubsetlistcount.toShort(), lpfnallocate.toLong(), lpfnreallocate.toLong(), lpfnfree.toLong(), lpvreserved).toUInt()

public actual fun CreateFontW(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: UInt, bunderline: UInt, bstrikeout: UInt, icharset: UInt, ioutprecision: UInt, iclipprecision: UInt, iquality: UInt, ipitchandfamily: UInt, pszfacename: PCWSTR): HFONT =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateFontW(cheight, cwidth, cescapement, corientation, cweight, bitalic.toInt(), bunderline.toInt(), bstrikeout.toInt(), icharset.toInt(), ioutprecision.toInt(), iclipprecision.toInt(), iquality.toInt(), ipitchandfamily.toInt(), pszfacename)

public actual fun CreateHalftonePalette(hdc: HDC): HPALETTE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateHalftonePalette(hdc)

public actual fun CreateHatchBrush(ihatch: HATCH_BRUSH_STYLE, color: COLORREF): HBRUSH =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateHatchBrush(ihatch, color.toInt())

public actual fun CreateICA(pszdriver: PCSTR, pszdevice: PCSTR, pszport: PCSTR, pdm: Long): HDC =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateICA(pszdriver, pszdevice, pszport, pdm)

public actual fun CreateICW(pszdriver: PCWSTR, pszdevice: PCWSTR, pszport: PCWSTR, pdm: Long): HDC =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateICW(pszdriver, pszdevice, pszport, pdm)

public actual fun CreateMetaFileA(pszfile: PCSTR): HDC =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateMetaFileA(pszfile)

public actual fun CreateMetaFileW(pszfile: PCWSTR): HDC =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateMetaFileW(pszfile)

public actual fun CreatePalette(plpal: Long): HPALETTE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreatePalette(plpal)

public actual fun CreatePatternBrush(hbm: HBITMAP): HBRUSH =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreatePatternBrush(hbm)

public actual fun CreatePen(istyle: PEN_STYLE, cwidth: Int, color: COLORREF): HPEN =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreatePen(istyle, cwidth, color.toInt())

public actual fun CreatePenIndirect(plpen: Long): HPEN =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreatePenIndirect(plpen)

public actual fun CreatePolyPolygonRgn(pptl: Long, pc: Long, cpoly: Int, imode: CREATE_POLYGON_RGN_MODE): HRGN =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreatePolyPolygonRgn(pptl, pc, cpoly, imode)

public actual fun CreatePolygonRgn(pptl: Long, cpoint: Int, imode: CREATE_POLYGON_RGN_MODE): HRGN =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreatePolygonRgn(pptl, cpoint, imode)

public actual fun CreateRectRgn(x1: Int, y1: Int, x2: Int, y2: Int): HRGN =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateRectRgn(x1, y1, x2, y2)

public actual fun CreateRectRgnIndirect(lprect: Long): HRGN =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateRectRgnIndirect(lprect)

public actual fun CreateRoundRectRgn(x1: Int, y1: Int, x2: Int, y2: Int, w: Int, h: Int): HRGN =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateRoundRectRgn(x1, y1, x2, y2, w, h)

public actual fun CreateScalableFontResourceA(fdwhidden: UInt, lpszfont: PCSTR, lpszfile: PCSTR, lpszpath: PCSTR): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateScalableFontResourceA(fdwhidden.toInt(), lpszfont, lpszfile, lpszpath)

public actual fun CreateScalableFontResourceW(fdwhidden: UInt, lpszfont: PCWSTR, lpszfile: PCWSTR, lpszpath: PCWSTR): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateScalableFontResourceW(fdwhidden.toInt(), lpszfont, lpszfile, lpszpath)

public actual fun CreateSolidBrush(color: COLORREF): HBRUSH =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_CreateSolidBrush(color.toInt())

public actual fun DPtoLP(hdc: HDC, lppt: Long, c: Int): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_DPtoLP(hdc, lppt, c)

public actual fun DeleteDC(hdc: HDC): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_DeleteDC(hdc)

public actual fun DeleteEnhMetaFile(hmf: HENHMETAFILE): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_DeleteEnhMetaFile(hmf)

public actual fun DeleteMetaFile(hmf: HMETAFILE): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_DeleteMetaFile(hmf)

public actual fun DeleteObject(ho: HGDIOBJ): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_DeleteObject(ho)

public actual fun DrawAnimatedRects(hwnd: HWND, idani: Int, lprcfrom: Long, lprcto: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_DrawAnimatedRects(hwnd, idani, lprcfrom, lprcto)

public actual fun DrawCaption(hwnd: HWND, hdc: HDC, lprect: Long, flags: DRAW_CAPTION_FLAGS): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_DrawCaption(hwnd, hdc, lprect, flags.toInt())

public actual fun DrawEdge(hdc: HDC, qrc: Long, edge: DRAWEDGE_FLAGS, grfflags: DRAW_EDGE_FLAGS): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_DrawEdge(hdc, qrc, edge.toInt(), grfflags.toInt())

public actual fun DrawEscape(hdc: HDC, iescape: Int, cjin: Int, lpin: PCSTR): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_DrawEscape(hdc, iescape, cjin, lpin)

public actual fun DrawFocusRect(hdc: HDC, lprc: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_DrawFocusRect(hdc, lprc)

public actual fun DrawFrameControl(param0: HDC, param1: Long, param2: DFC_TYPE, param3: DFCS_STATE): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_DrawFrameControl(param0, param1, param2.toInt(), param3.toInt())

public actual fun DrawStateA(hdc: HDC, hbrfore: HBRUSH, qfncallback: DRAWSTATEPROC, ldata: LPARAM, wdata: WPARAM, x: Int, y: Int, cx: Int, cy: Int, uflags: DRAWSTATE_FLAGS): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_DrawStateA(hdc, hbrfore, qfncallback.toLong(), ldata, wdata.toLong(), x, y, cx, cy, uflags.toInt())

public actual fun DrawStateW(hdc: HDC, hbrfore: HBRUSH, qfncallback: DRAWSTATEPROC, ldata: LPARAM, wdata: WPARAM, x: Int, y: Int, cx: Int, cy: Int, uflags: DRAWSTATE_FLAGS): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_DrawStateW(hdc, hbrfore, qfncallback.toLong(), ldata, wdata.toLong(), x, y, cx, cy, uflags.toInt())

public actual fun DrawTextA(hdc: HDC, lpchtext: PCSTR, cchtext: Int, lprc: Long, format: DRAW_TEXT_FORMAT): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_DrawTextA(hdc, lpchtext, cchtext, lprc, format.toInt())

public actual fun DrawTextExA(hdc: HDC, lpchtext: PSTR, cchtext: Int, lprc: Long, format: DRAW_TEXT_FORMAT, lpdtp: Long): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_DrawTextExA(hdc, lpchtext, cchtext, lprc, format.toInt(), lpdtp)

public actual fun DrawTextExW(hdc: HDC, lpchtext: PWSTR, cchtext: Int, lprc: Long, format: DRAW_TEXT_FORMAT, lpdtp: Long): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_DrawTextExW(hdc, lpchtext, cchtext, lprc, format.toInt(), lpdtp)

public actual fun DrawTextW(hdc: HDC, lpchtext: PCWSTR, cchtext: Int, lprc: Long, format: DRAW_TEXT_FORMAT): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_DrawTextW(hdc, lpchtext, cchtext, lprc, format.toInt())

public actual fun Ellipse(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_Ellipse(hdc, left, top, right, bottom)

public actual fun EndPaint(hwnd: HWND, lppaint: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_EndPaint(hwnd, lppaint)

public actual fun EndPath(hdc: HDC): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_EndPath(hdc)

public actual fun EnumDisplayDevicesA(lpdevice: PCSTR, idevnum: UInt, lpdisplaydevice: Long, dwflags: UInt): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_EnumDisplayDevicesA(lpdevice, idevnum.toInt(), lpdisplaydevice, dwflags.toInt())

public actual fun EnumDisplayDevicesW(lpdevice: PCWSTR, idevnum: UInt, lpdisplaydevice: Long, dwflags: UInt): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_EnumDisplayDevicesW(lpdevice, idevnum.toInt(), lpdisplaydevice, dwflags.toInt())

public actual fun EnumDisplayMonitors(hdc: HDC, lprcclip: Long, lpfnenum: MONITORENUMPROC, dwdata: LPARAM): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_EnumDisplayMonitors(hdc, lprcclip, lpfnenum.toLong(), dwdata)

public actual fun EnumDisplaySettingsA(lpszdevicename: PCSTR, imodenum: ENUM_DISPLAY_SETTINGS_MODE, lpdevmode: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_EnumDisplaySettingsA(lpszdevicename, imodenum.toInt(), lpdevmode)

public actual fun EnumDisplaySettingsExA(lpszdevicename: PCSTR, imodenum: ENUM_DISPLAY_SETTINGS_MODE, lpdevmode: Long, dwflags: ENUM_DISPLAY_SETTINGS_FLAGS): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_EnumDisplaySettingsExA(lpszdevicename, imodenum.toInt(), lpdevmode, dwflags.toInt())

public actual fun EnumDisplaySettingsExW(lpszdevicename: PCWSTR, imodenum: ENUM_DISPLAY_SETTINGS_MODE, lpdevmode: Long, dwflags: ENUM_DISPLAY_SETTINGS_FLAGS): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_EnumDisplaySettingsExW(lpszdevicename, imodenum.toInt(), lpdevmode, dwflags.toInt())

public actual fun EnumDisplaySettingsW(lpszdevicename: PCWSTR, imodenum: ENUM_DISPLAY_SETTINGS_MODE, lpdevmode: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_EnumDisplaySettingsW(lpszdevicename, imodenum.toInt(), lpdevmode)

public actual fun EnumEnhMetaFile(hdc: HDC, hmf: HENHMETAFILE, proc: ENHMFENUMPROC, param3: Long, lprect: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_EnumEnhMetaFile(hdc, hmf, proc.toLong(), param3, lprect)

public actual fun EnumFontFamiliesA(hdc: HDC, lplogfont: PCSTR, lpproc: FONTENUMPROCA, lparam: LPARAM): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_EnumFontFamiliesA(hdc, lplogfont, lpproc.toLong(), lparam)

public actual fun EnumFontFamiliesExA(hdc: HDC, lplogfont: Long, lpproc: FONTENUMPROCA, lparam: LPARAM, dwflags: UInt): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_EnumFontFamiliesExA(hdc, lplogfont, lpproc.toLong(), lparam, dwflags.toInt())

public actual fun EnumFontFamiliesExW(hdc: HDC, lplogfont: Long, lpproc: FONTENUMPROCW, lparam: LPARAM, dwflags: UInt): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_EnumFontFamiliesExW(hdc, lplogfont, lpproc.toLong(), lparam, dwflags.toInt())

public actual fun EnumFontFamiliesW(hdc: HDC, lplogfont: PCWSTR, lpproc: FONTENUMPROCW, lparam: LPARAM): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_EnumFontFamiliesW(hdc, lplogfont, lpproc.toLong(), lparam)

public actual fun EnumFontsA(hdc: HDC, lplogfont: PCSTR, lpproc: FONTENUMPROCA, lparam: LPARAM): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_EnumFontsA(hdc, lplogfont, lpproc.toLong(), lparam)

public actual fun EnumFontsW(hdc: HDC, lplogfont: PCWSTR, lpproc: FONTENUMPROCW, lparam: LPARAM): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_EnumFontsW(hdc, lplogfont, lpproc.toLong(), lparam)

public actual fun EnumMetaFile(hdc: HDC, hmf: HMETAFILE, proc: MFENUMPROC, param3: LPARAM): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_EnumMetaFile(hdc, hmf, proc.toLong(), param3)

public actual fun EnumObjects(hdc: HDC, ntype: OBJ_TYPE, lpfunc: GOBJENUMPROC, lparam: LPARAM): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_EnumObjects(hdc, ntype, lpfunc.toLong(), lparam)

public actual fun EqualRect(lprc1: Long, lprc2: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_EqualRect(lprc1, lprc2)

public actual fun EqualRgn(hrgn1: HRGN, hrgn2: HRGN): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_EqualRgn(hrgn1, hrgn2)

public actual fun ExcludeClipRect(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int): GDI_REGION_TYPE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_ExcludeClipRect(hdc, left, top, right, bottom)

public actual fun ExcludeUpdateRgn(hdc: HDC, hwnd: HWND): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_ExcludeUpdateRgn(hdc, hwnd)

public actual fun ExtCreatePen(ipenstyle: UInt, cwidth: UInt, plbrush: Long, cstyle: UInt, pstyle: Long): HPEN =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_ExtCreatePen(ipenstyle.toInt(), cwidth.toInt(), plbrush, cstyle.toInt(), pstyle)

public actual fun ExtCreateRegion(lpx: Long, ncount: UInt, lpdata: Long): HRGN =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_ExtCreateRegion(lpx, ncount.toInt(), lpdata)

public actual fun ExtFloodFill(hdc: HDC, x: Int, y: Int, color: COLORREF, type: EXT_FLOOD_FILL_TYPE): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_ExtFloodFill(hdc, x, y, color.toInt(), type.toInt())

public actual fun ExtSelectClipRgn(hdc: HDC, hrgn: HRGN, mode: RGN_COMBINE_MODE): GDI_REGION_TYPE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_ExtSelectClipRgn(hdc, hrgn, mode)

public actual fun ExtTextOutA(hdc: HDC, x: Int, y: Int, options: ETO_OPTIONS, lprect: Long, lpstring: PCSTR, c: UInt, lpdx: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_ExtTextOutA(hdc, x, y, options.toInt(), lprect, lpstring, c.toInt(), lpdx)

public actual fun ExtTextOutW(hdc: HDC, x: Int, y: Int, options: ETO_OPTIONS, lprect: Long, lpstring: PCWSTR, c: UInt, lpdx: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_ExtTextOutW(hdc, x, y, options.toInt(), lprect, lpstring, c.toInt(), lpdx)

public actual fun FillPath(hdc: HDC): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_FillPath(hdc)

public actual fun FillRect(hdc: HDC, lprc: Long, hbr: HBRUSH): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_FillRect(hdc, lprc, hbr)

public actual fun FillRgn(hdc: HDC, hrgn: HRGN, hbr: HBRUSH): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_FillRgn(hdc, hrgn, hbr)

public actual fun FixBrushOrgEx(hdc: HDC, x: Int, y: Int, ptl: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_FixBrushOrgEx(hdc, x, y, ptl)

public actual fun FlattenPath(hdc: HDC): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_FlattenPath(hdc)

public actual fun FloodFill(hdc: HDC, x: Int, y: Int, color: COLORREF): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_FloodFill(hdc, x, y, color.toInt())

public actual fun FrameRect(hdc: HDC, lprc: Long, hbr: HBRUSH): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_FrameRect(hdc, lprc, hbr)

public actual fun FrameRgn(hdc: HDC, hrgn: HRGN, hbr: HBRUSH, w: Int, h: Int): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_FrameRgn(hdc, hrgn, hbr, w, h)

public actual fun GdiAlphaBlend(hdcdest: HDC, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: HDC, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, ftn: BLENDFUNCTION): BOOL =
    0

public actual fun GdiComment(hdc: HDC, nsize: UInt, lpdata: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GdiComment(hdc, nsize.toInt(), lpdata)

public actual fun GdiFlush(): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GdiFlush()

public actual fun GdiGetBatchLimit(): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GdiGetBatchLimit().toUInt()

public actual fun GdiGradientFill(hdc: HDC, pvertex: Long, nvertex: UInt, pmesh: Long, ncount: UInt, ulmode: GRADIENT_FILL): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GdiGradientFill(hdc, pvertex, nvertex.toInt(), pmesh, ncount.toInt(), ulmode.toInt())

public actual fun GdiSetBatchLimit(dw: UInt): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GdiSetBatchLimit(dw.toInt()).toUInt()

public actual fun GdiTransparentBlt(hdcdest: HDC, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: HDC, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: UInt): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GdiTransparentBlt(hdcdest, xorigindest, yorigindest, wdest, hdest, hdcsrc, xoriginsrc, yoriginsrc, wsrc, hsrc, crtransparent.toInt())

public actual fun GetArcDirection(hdc: HDC): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetArcDirection(hdc)

public actual fun GetAspectRatioFilterEx(hdc: HDC, lpsize: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetAspectRatioFilterEx(hdc, lpsize)

public actual fun GetBitmapBits(hbit: HBITMAP, cb: Int, lpvbits: Long): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetBitmapBits(hbit, cb, lpvbits)

public actual fun GetBitmapDimensionEx(hbit: HBITMAP, lpsize: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetBitmapDimensionEx(hbit, lpsize)

public actual fun GetBkColor(hdc: HDC): COLORREF =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetBkColor(hdc).toUInt()

public actual fun GetBkMode(hdc: HDC): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetBkMode(hdc)

public actual fun GetBoundsRect(hdc: HDC, lprect: Long, flags: UInt): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetBoundsRect(hdc, lprect, flags.toInt()).toUInt()

public actual fun GetBrushOrgEx(hdc: HDC, lppt: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetBrushOrgEx(hdc, lppt)

public actual fun GetCharABCWidthsA(hdc: HDC, wfirst: UInt, wlast: UInt, lpabc: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetCharABCWidthsA(hdc, wfirst.toInt(), wlast.toInt(), lpabc)

public actual fun GetCharABCWidthsFloatA(hdc: HDC, ifirst: UInt, ilast: UInt, lpabc: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetCharABCWidthsFloatA(hdc, ifirst.toInt(), ilast.toInt(), lpabc)

public actual fun GetCharABCWidthsFloatW(hdc: HDC, ifirst: UInt, ilast: UInt, lpabc: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetCharABCWidthsFloatW(hdc, ifirst.toInt(), ilast.toInt(), lpabc)

public actual fun GetCharABCWidthsI(hdc: HDC, gifirst: UInt, cgi: UInt, pgi: Long, pabc: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetCharABCWidthsI(hdc, gifirst.toInt(), cgi.toInt(), pgi, pabc)

public actual fun GetCharABCWidthsW(hdc: HDC, wfirst: UInt, wlast: UInt, lpabc: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetCharABCWidthsW(hdc, wfirst.toInt(), wlast.toInt(), lpabc)

public actual fun GetCharWidth32A(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetCharWidth32A(hdc, ifirst.toInt(), ilast.toInt(), lpbuffer)

public actual fun GetCharWidth32W(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetCharWidth32W(hdc, ifirst.toInt(), ilast.toInt(), lpbuffer)

public actual fun GetCharWidthA(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetCharWidthA(hdc, ifirst.toInt(), ilast.toInt(), lpbuffer)

public actual fun GetCharWidthFloatA(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetCharWidthFloatA(hdc, ifirst.toInt(), ilast.toInt(), lpbuffer)

public actual fun GetCharWidthFloatW(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetCharWidthFloatW(hdc, ifirst.toInt(), ilast.toInt(), lpbuffer)

public actual fun GetCharWidthI(hdc: HDC, gifirst: UInt, cgi: UInt, pgi: Long, piwidths: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetCharWidthI(hdc, gifirst.toInt(), cgi.toInt(), pgi, piwidths)

public actual fun GetCharWidthW(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetCharWidthW(hdc, ifirst.toInt(), ilast.toInt(), lpbuffer)

public actual fun GetCharacterPlacementA(hdc: HDC, lpstring: PCSTR, ncount: Int, nmexextent: Int, lpresults: Long, dwflags: GET_CHARACTER_PLACEMENT_FLAGS): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetCharacterPlacementA(hdc, lpstring, ncount, nmexextent, lpresults, dwflags.toInt()).toUInt()

public actual fun GetCharacterPlacementW(hdc: HDC, lpstring: PCWSTR, ncount: Int, nmexextent: Int, lpresults: Long, dwflags: GET_CHARACTER_PLACEMENT_FLAGS): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetCharacterPlacementW(hdc, lpstring, ncount, nmexextent, lpresults, dwflags.toInt()).toUInt()

public actual fun GetClipBox(hdc: HDC, lprect: Long): GDI_REGION_TYPE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetClipBox(hdc, lprect)

public actual fun GetClipRgn(hdc: HDC, hrgn: HRGN): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetClipRgn(hdc, hrgn)

public actual fun GetColorAdjustment(hdc: HDC, lpca: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetColorAdjustment(hdc, lpca)

public actual fun GetCurrentObject(hdc: HDC, type: UInt): HGDIOBJ =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetCurrentObject(hdc, type.toInt())

public actual fun GetCurrentPositionEx(hdc: HDC, lppt: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetCurrentPositionEx(hdc, lppt)

public actual fun GetDC(hwnd: HWND): HDC =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetDC(hwnd)

public actual fun GetDCBrushColor(hdc: HDC): COLORREF =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetDCBrushColor(hdc).toUInt()

public actual fun GetDCEx(hwnd: HWND, hrgnclip: HRGN, flags: GET_DCX_FLAGS): HDC =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetDCEx(hwnd, hrgnclip, flags.toInt())

public actual fun GetDCOrgEx(hdc: HDC, lppt: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetDCOrgEx(hdc, lppt)

public actual fun GetDCPenColor(hdc: HDC): COLORREF =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetDCPenColor(hdc).toUInt()

public actual fun GetDIBColorTable(hdc: HDC, istart: UInt, centries: UInt, prgbq: Long): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetDIBColorTable(hdc, istart.toInt(), centries.toInt(), prgbq).toUInt()

public actual fun GetDIBits(hdc: HDC, hbm: HBITMAP, start: UInt, clines: UInt, lpvbits: Long, lpbmi: Long, usage: DIB_USAGE): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetDIBits(hdc, hbm, start.toInt(), clines.toInt(), lpvbits, lpbmi, usage.toInt())

public actual fun GetDeviceCaps(hdc: HDC, index: Int): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetDeviceCaps(hdc, index)

public actual fun GetEnhMetaFileA(lpname: PCSTR): HENHMETAFILE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetEnhMetaFileA(lpname)

public actual fun GetEnhMetaFileBits(hemf: HENHMETAFILE, nsize: UInt, lpdata: Long): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetEnhMetaFileBits(hemf, nsize.toInt(), lpdata).toUInt()

public actual fun GetEnhMetaFileDescriptionA(hemf: HENHMETAFILE, cchbuffer: UInt, lpdescription: PSTR): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetEnhMetaFileDescriptionA(hemf, cchbuffer.toInt(), lpdescription).toUInt()

public actual fun GetEnhMetaFileDescriptionW(hemf: HENHMETAFILE, cchbuffer: UInt, lpdescription: PWSTR): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetEnhMetaFileDescriptionW(hemf, cchbuffer.toInt(), lpdescription).toUInt()

public actual fun GetEnhMetaFileHeader(hemf: HENHMETAFILE, nsize: UInt, lpenhmetaheader: Long): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetEnhMetaFileHeader(hemf, nsize.toInt(), lpenhmetaheader).toUInt()

public actual fun GetEnhMetaFilePaletteEntries(hemf: HENHMETAFILE, nnumentries: UInt, lppaletteentries: Long): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetEnhMetaFilePaletteEntries(hemf, nnumentries.toInt(), lppaletteentries).toUInt()

public actual fun GetEnhMetaFileW(lpname: PCWSTR): HENHMETAFILE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetEnhMetaFileW(lpname)

public actual fun GetFontData(hdc: HDC, dwtable: UInt, dwoffset: UInt, pvbuffer: Long, cjbuffer: UInt): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetFontData(hdc, dwtable.toInt(), dwoffset.toInt(), pvbuffer, cjbuffer.toInt()).toUInt()

public actual fun GetFontLanguageInfo(hdc: HDC): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetFontLanguageInfo(hdc).toUInt()

public actual fun GetFontUnicodeRanges(hdc: HDC, lpgs: Long): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetFontUnicodeRanges(hdc, lpgs).toUInt()

public actual fun GetGlyphIndicesA(hdc: HDC, lpstr: PCSTR, c: Int, pgi: Long, fl: UInt): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetGlyphIndicesA(hdc, lpstr, c, pgi, fl.toInt()).toUInt()

public actual fun GetGlyphIndicesW(hdc: HDC, lpstr: PCWSTR, c: Int, pgi: Long, fl: UInt): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetGlyphIndicesW(hdc, lpstr, c, pgi, fl.toInt()).toUInt()

public actual fun GetGlyphOutlineA(hdc: HDC, uchar: UInt, fuformat: GET_GLYPH_OUTLINE_FORMAT, lpgm: Long, cjbuffer: UInt, pvbuffer: Long, lpmat2: Long): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetGlyphOutlineA(hdc, uchar.toInt(), fuformat.toInt(), lpgm, cjbuffer.toInt(), pvbuffer, lpmat2).toUInt()

public actual fun GetGlyphOutlineW(hdc: HDC, uchar: UInt, fuformat: GET_GLYPH_OUTLINE_FORMAT, lpgm: Long, cjbuffer: UInt, pvbuffer: Long, lpmat2: Long): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetGlyphOutlineW(hdc, uchar.toInt(), fuformat.toInt(), lpgm, cjbuffer.toInt(), pvbuffer, lpmat2).toUInt()

public actual fun GetGraphicsMode(hdc: HDC): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetGraphicsMode(hdc)

public actual fun GetKerningPairsA(hdc: HDC, npairs: UInt, lpkernpair: Long): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetKerningPairsA(hdc, npairs.toInt(), lpkernpair).toUInt()

public actual fun GetKerningPairsW(hdc: HDC, npairs: UInt, lpkernpair: Long): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetKerningPairsW(hdc, npairs.toInt(), lpkernpair).toUInt()

public actual fun GetLayout(hdc: HDC): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetLayout(hdc).toUInt()

public actual fun GetMapMode(hdc: HDC): HDC_MAP_MODE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetMapMode(hdc)

public actual fun GetMetaFileA(lpname: PCSTR): HMETAFILE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetMetaFileA(lpname)

public actual fun GetMetaFileBitsEx(hmf: HMETAFILE, cbbuffer: UInt, lpdata: Long): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetMetaFileBitsEx(hmf, cbbuffer.toInt(), lpdata).toUInt()

public actual fun GetMetaFileW(lpname: PCWSTR): HMETAFILE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetMetaFileW(lpname)

public actual fun GetMetaRgn(hdc: HDC, hrgn: HRGN): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetMetaRgn(hdc, hrgn)

public actual fun GetMiterLimit(hdc: HDC, plimit: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetMiterLimit(hdc, plimit)

public actual fun GetMonitorInfoA(hmonitor: HMONITOR, lpmi: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetMonitorInfoA(hmonitor, lpmi)

public actual fun GetMonitorInfoW(hmonitor: HMONITOR, lpmi: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetMonitorInfoW(hmonitor, lpmi)

public actual fun GetNearestColor(hdc: HDC, color: COLORREF): COLORREF =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetNearestColor(hdc, color.toInt()).toUInt()

public actual fun GetNearestPaletteIndex(h: HPALETTE, color: COLORREF): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetNearestPaletteIndex(h, color.toInt()).toUInt()

public actual fun GetObjectA(h: HGDIOBJ, c: Int, pv: Long): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetObjectA(h, c, pv)

public actual fun GetObjectType(h: HGDIOBJ): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetObjectType(h).toUInt()

public actual fun GetObjectW(h: HGDIOBJ, c: Int, pv: Long): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetObjectW(h, c, pv)

public actual fun GetOutlineTextMetricsA(hdc: HDC, cjcopy: UInt, potm: Long): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetOutlineTextMetricsA(hdc, cjcopy.toInt(), potm).toUInt()

public actual fun GetOutlineTextMetricsW(hdc: HDC, cjcopy: UInt, potm: Long): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetOutlineTextMetricsW(hdc, cjcopy.toInt(), potm).toUInt()

public actual fun GetPaletteEntries(hpal: HPALETTE, istart: UInt, centries: UInt, ppalentries: Long): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetPaletteEntries(hpal, istart.toInt(), centries.toInt(), ppalentries).toUInt()

public actual fun GetPath(hdc: HDC, apt: Long, aj: Long, cpt: Int): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetPath(hdc, apt, aj, cpt)

public actual fun GetPixel(hdc: HDC, x: Int, y: Int): COLORREF =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetPixel(hdc, x, y).toUInt()

public actual fun GetPolyFillMode(hdc: HDC): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetPolyFillMode(hdc)

public actual fun GetROP2(hdc: HDC): R2_MODE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetROP2(hdc)

public actual fun GetRandomRgn(hdc: HDC, hrgn: HRGN, i: Int): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetRandomRgn(hdc, hrgn, i)

public actual fun GetRasterizerCaps(lpraststat: Long, cjbytes: UInt): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetRasterizerCaps(lpraststat, cjbytes.toInt())

public actual fun GetRegionData(hrgn: HRGN, ncount: UInt, lprgndata: Long): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetRegionData(hrgn, ncount.toInt(), lprgndata).toUInt()

public actual fun GetRgnBox(hrgn: HRGN, lprc: Long): GDI_REGION_TYPE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetRgnBox(hrgn, lprc)

public actual fun GetStockObject(i: GET_STOCK_OBJECT_FLAGS): HGDIOBJ =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetStockObject(i)

public actual fun GetStretchBltMode(hdc: HDC): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetStretchBltMode(hdc)

public actual fun GetSysColor(nindex: SYS_COLOR_INDEX): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetSysColor(nindex).toUInt()

public actual fun GetSysColorBrush(nindex: SYS_COLOR_INDEX): HBRUSH =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetSysColorBrush(nindex)

public actual fun GetSystemPaletteEntries(hdc: HDC, istart: UInt, centries: UInt, ppalentries: Long): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetSystemPaletteEntries(hdc, istart.toInt(), centries.toInt(), ppalentries).toUInt()

public actual fun GetSystemPaletteUse(hdc: HDC): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetSystemPaletteUse(hdc).toUInt()

public actual fun GetTabbedTextExtentA(hdc: HDC, lpstring: PCSTR, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetTabbedTextExtentA(hdc, lpstring, chcount, ntabpositions, lpntabstoppositions).toUInt()

public actual fun GetTabbedTextExtentW(hdc: HDC, lpstring: PCWSTR, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetTabbedTextExtentW(hdc, lpstring, chcount, ntabpositions, lpntabstoppositions).toUInt()

public actual fun GetTextAlign(hdc: HDC): TEXT_ALIGN_OPTIONS =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetTextAlign(hdc).toUInt()

public actual fun GetTextCharacterExtra(hdc: HDC): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetTextCharacterExtra(hdc)

public actual fun GetTextColor(hdc: HDC): COLORREF =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetTextColor(hdc).toUInt()

public actual fun GetTextExtentExPointA(hdc: HDC, lpszstring: PCSTR, cchstring: Int, nmaxextent: Int, lpnfit: Long, lpndx: Long, lpsize: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetTextExtentExPointA(hdc, lpszstring, cchstring, nmaxextent, lpnfit, lpndx, lpsize)

public actual fun GetTextExtentExPointI(hdc: HDC, lpwszstring: Long, cwchstring: Int, nmaxextent: Int, lpnfit: Long, lpndx: Long, lpsize: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetTextExtentExPointI(hdc, lpwszstring, cwchstring, nmaxextent, lpnfit, lpndx, lpsize)

public actual fun GetTextExtentExPointW(hdc: HDC, lpszstring: PCWSTR, cchstring: Int, nmaxextent: Int, lpnfit: Long, lpndx: Long, lpsize: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetTextExtentExPointW(hdc, lpszstring, cchstring, nmaxextent, lpnfit, lpndx, lpsize)

public actual fun GetTextExtentPoint32A(hdc: HDC, lpstring: PCSTR, c: Int, psizl: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetTextExtentPoint32A(hdc, lpstring, c, psizl)

public actual fun GetTextExtentPoint32W(hdc: HDC, lpstring: PCWSTR, c: Int, psizl: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetTextExtentPoint32W(hdc, lpstring, c, psizl)

public actual fun GetTextExtentPointA(hdc: HDC, lpstring: PCSTR, c: Int, lpsz: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetTextExtentPointA(hdc, lpstring, c, lpsz)

public actual fun GetTextExtentPointI(hdc: HDC, pgiin: Long, cgi: Int, psize: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetTextExtentPointI(hdc, pgiin, cgi, psize)

public actual fun GetTextExtentPointW(hdc: HDC, lpstring: PCWSTR, c: Int, lpsz: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetTextExtentPointW(hdc, lpstring, c, lpsz)

public actual fun GetTextFaceA(hdc: HDC, c: Int, lpname: PSTR): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetTextFaceA(hdc, c, lpname)

public actual fun GetTextFaceW(hdc: HDC, c: Int, lpname: PWSTR): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetTextFaceW(hdc, c, lpname)

public actual fun GetTextMetricsA(hdc: HDC, lptm: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetTextMetricsA(hdc, lptm)

public actual fun GetTextMetricsW(hdc: HDC, lptm: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetTextMetricsW(hdc, lptm)

public actual fun GetUpdateRect(hwnd: HWND, lprect: Long, berase: BOOL): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetUpdateRect(hwnd, lprect, berase)

public actual fun GetUpdateRgn(hwnd: HWND, hrgn: HRGN, berase: BOOL): GDI_REGION_TYPE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetUpdateRgn(hwnd, hrgn, berase)

public actual fun GetViewportExtEx(hdc: HDC, lpsize: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetViewportExtEx(hdc, lpsize)

public actual fun GetViewportOrgEx(hdc: HDC, lppoint: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetViewportOrgEx(hdc, lppoint)

public actual fun GetWinMetaFileBits(hemf: HENHMETAFILE, cbdata16: UInt, pdata16: Long, imapmode: Int, hdcref: HDC): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetWinMetaFileBits(hemf, cbdata16.toInt(), pdata16, imapmode, hdcref).toUInt()

public actual fun GetWindowDC(hwnd: HWND): HDC =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetWindowDC(hwnd)

public actual fun GetWindowExtEx(hdc: HDC, lpsize: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetWindowExtEx(hdc, lpsize)

public actual fun GetWindowOrgEx(hdc: HDC, lppoint: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetWindowOrgEx(hdc, lppoint)

public actual fun GetWindowRgn(hwnd: HWND, hrgn: HRGN): GDI_REGION_TYPE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetWindowRgn(hwnd, hrgn)

public actual fun GetWindowRgnBox(hwnd: HWND, lprc: Long): GDI_REGION_TYPE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetWindowRgnBox(hwnd, lprc)

public actual fun GetWorldTransform(hdc: HDC, lpxf: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GetWorldTransform(hdc, lpxf)

public actual fun GradientFill(hdc: HDC, pvertex: Long, nvertex: UInt, pmesh: Long, nmesh: UInt, ulmode: GRADIENT_FILL): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GradientFill(hdc, pvertex, nvertex.toInt(), pmesh, nmesh.toInt(), ulmode.toInt())

public actual fun GrayStringA(hdc: HDC, hbrush: HBRUSH, lpoutputfunc: GRAYSTRINGPROC, lpdata: LPARAM, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GrayStringA(hdc, hbrush, lpoutputfunc.toLong(), lpdata, ncount, x, y, nwidth, nheight)

public actual fun GrayStringW(hdc: HDC, hbrush: HBRUSH, lpoutputfunc: GRAYSTRINGPROC, lpdata: LPARAM, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_GrayStringW(hdc, hbrush, lpoutputfunc.toLong(), lpdata, ncount, x, y, nwidth, nheight)

public actual fun InflateRect(lprc: Long, dx: Int, dy: Int): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_InflateRect(lprc, dx, dy)

public actual fun IntersectClipRect(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int): GDI_REGION_TYPE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_IntersectClipRect(hdc, left, top, right, bottom)

public actual fun IntersectRect(lprcdst: Long, lprcsrc1: Long, lprcsrc2: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_IntersectRect(lprcdst, lprcsrc1, lprcsrc2)

public actual fun InvalidateRect(hwnd: HWND, lprect: Long, berase: BOOL): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_InvalidateRect(hwnd, lprect, berase)

public actual fun InvalidateRgn(hwnd: HWND, hrgn: HRGN, berase: BOOL): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_InvalidateRgn(hwnd, hrgn, berase)

public actual fun InvertRect(hdc: HDC, lprc: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_InvertRect(hdc, lprc)

public actual fun InvertRgn(hdc: HDC, hrgn: HRGN): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_InvertRgn(hdc, hrgn)

public actual fun IsRectEmpty(lprc: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_IsRectEmpty(lprc)

public actual fun LPtoDP(hdc: HDC, lppt: Long, c: Int): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_LPtoDP(hdc, lppt, c)

public actual fun LineDDA(xstart: Int, ystart: Int, xend: Int, yend: Int, lpproc: LINEDDAPROC, data: LPARAM): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_LineDDA(xstart, ystart, xend, yend, lpproc.toLong(), data)

public actual fun LineTo(hdc: HDC, x: Int, y: Int): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_LineTo(hdc, x, y)

public actual fun LoadBitmapA(hinstance: HINSTANCE, lpbitmapname: PCSTR): HBITMAP =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_LoadBitmapA(hinstance, lpbitmapname)

public actual fun LoadBitmapW(hinstance: HINSTANCE, lpbitmapname: PCWSTR): HBITMAP =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_LoadBitmapW(hinstance, lpbitmapname)

public actual fun LockWindowUpdate(hwndlock: HWND): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_LockWindowUpdate(hwndlock)

public actual fun MapWindowPoints(hwndfrom: HWND, hwndto: HWND, lppoints: Long, cpoints: UInt): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_MapWindowPoints(hwndfrom, hwndto, lppoints, cpoints.toInt())

public actual fun MaskBlt(hdcdest: HDC, xdest: Int, ydest: Int, width: Int, height: Int, hdcsrc: HDC, xsrc: Int, ysrc: Int, hbmmask: HBITMAP, xmask: Int, ymask: Int, rop: UInt): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_MaskBlt(hdcdest, xdest, ydest, width, height, hdcsrc, xsrc, ysrc, hbmmask, xmask, ymask, rop.toInt())

public actual fun MergeFontPackage(puchmergefontbuffer: Long, ulmergefontbuffersize: UInt, puchfontpackagebuffer: Long, ulfontpackagebuffersize: UInt, ppuchdestbuffer: Long, puldestbuffersize: Long, pulbyteswritten: Long, usmode: UShort, lpfnallocate: CFP_ALLOCPROC, lpfnreallocate: CFP_REALLOCPROC, lpfnfree: CFP_FREEPROC, lpvreserved: Long): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_MergeFontPackage(puchmergefontbuffer, ulmergefontbuffersize.toInt(), puchfontpackagebuffer, ulfontpackagebuffersize.toInt(), ppuchdestbuffer, puldestbuffersize, pulbyteswritten, usmode.toShort(), lpfnallocate.toLong(), lpfnreallocate.toLong(), lpfnfree.toLong(), lpvreserved).toUInt()

public actual fun ModifyWorldTransform(hdc: HDC, lpxf: Long, mode: MODIFY_WORLD_TRANSFORM_MODE): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_ModifyWorldTransform(hdc, lpxf, mode.toInt())

public actual fun MonitorFromPoint(pt: POINT, dwflags: MONITOR_FROM_FLAGS): HMONITOR =
    0L

public actual fun MonitorFromRect(lprc: Long, dwflags: MONITOR_FROM_FLAGS): HMONITOR =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_MonitorFromRect(lprc, dwflags.toInt())

public actual fun MonitorFromWindow(hwnd: HWND, dwflags: MONITOR_FROM_FLAGS): HMONITOR =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_MonitorFromWindow(hwnd, dwflags.toInt())

public actual fun MoveToEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_MoveToEx(hdc, x, y, lppt)

public actual fun OffsetClipRgn(hdc: HDC, x: Int, y: Int): GDI_REGION_TYPE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_OffsetClipRgn(hdc, x, y)

public actual fun OffsetRect(lprc: Long, dx: Int, dy: Int): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_OffsetRect(lprc, dx, dy)

public actual fun OffsetRgn(hrgn: HRGN, x: Int, y: Int): GDI_REGION_TYPE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_OffsetRgn(hrgn, x, y)

public actual fun OffsetViewportOrgEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_OffsetViewportOrgEx(hdc, x, y, lppt)

public actual fun OffsetWindowOrgEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_OffsetWindowOrgEx(hdc, x, y, lppt)

public actual fun PaintDesktop(hdc: HDC): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_PaintDesktop(hdc)

public actual fun PaintRgn(hdc: HDC, hrgn: HRGN): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_PaintRgn(hdc, hrgn)

public actual fun PatBlt(hdc: HDC, x: Int, y: Int, w: Int, h: Int, rop: ROP_CODE): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_PatBlt(hdc, x, y, w, h, rop.toInt())

public actual fun PathToRegion(hdc: HDC): HRGN =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_PathToRegion(hdc)

public actual fun Pie(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_Pie(hdc, left, top, right, bottom, xr1, yr1, xr2, yr2)

public actual fun PlayEnhMetaFile(hdc: HDC, hmf: HENHMETAFILE, lprect: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_PlayEnhMetaFile(hdc, hmf, lprect)

public actual fun PlayEnhMetaFileRecord(hdc: HDC, pht: Long, pmr: Long, cht: UInt): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_PlayEnhMetaFileRecord(hdc, pht, pmr, cht.toInt())

public actual fun PlayMetaFile(hdc: HDC, hmf: HMETAFILE): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_PlayMetaFile(hdc, hmf)

public actual fun PlayMetaFileRecord(hdc: HDC, lphandletable: Long, lpmr: Long, noobjs: UInt): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_PlayMetaFileRecord(hdc, lphandletable, lpmr, noobjs.toInt())

public actual fun PlgBlt(hdcdest: HDC, lppoint: Long, hdcsrc: HDC, xsrc: Int, ysrc: Int, width: Int, height: Int, hbmmask: HBITMAP, xmask: Int, ymask: Int): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_PlgBlt(hdcdest, lppoint, hdcsrc, xsrc, ysrc, width, height, hbmmask, xmask, ymask)

public actual fun PolyBezier(hdc: HDC, apt: Long, cpt: UInt): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_PolyBezier(hdc, apt, cpt.toInt())

public actual fun PolyBezierTo(hdc: HDC, apt: Long, cpt: UInt): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_PolyBezierTo(hdc, apt, cpt.toInt())

public actual fun PolyDraw(hdc: HDC, apt: Long, aj: Long, cpt: Int): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_PolyDraw(hdc, apt, aj, cpt)

public actual fun PolyPolygon(hdc: HDC, apt: Long, asz: Long, csz: Int): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_PolyPolygon(hdc, apt, asz, csz)

public actual fun PolyPolyline(hdc: HDC, apt: Long, asz: Long, csz: UInt): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_PolyPolyline(hdc, apt, asz, csz.toInt())

public actual fun PolyTextOutA(hdc: HDC, ppt: Long, nstrings: Int): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_PolyTextOutA(hdc, ppt, nstrings)

public actual fun PolyTextOutW(hdc: HDC, ppt: Long, nstrings: Int): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_PolyTextOutW(hdc, ppt, nstrings)

public actual fun Polygon(hdc: HDC, apt: Long, cpt: Int): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_Polygon(hdc, apt, cpt)

public actual fun Polyline(hdc: HDC, apt: Long, cpt: Int): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_Polyline(hdc, apt, cpt)

public actual fun PolylineTo(hdc: HDC, apt: Long, cpt: UInt): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_PolylineTo(hdc, apt, cpt.toInt())

public actual fun PtInRect(lprc: Long, pt: POINT): BOOL =
    0

public actual fun PtInRegion(hrgn: HRGN, x: Int, y: Int): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_PtInRegion(hrgn, x, y)

public actual fun PtVisible(hdc: HDC, x: Int, y: Int): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_PtVisible(hdc, x, y)

public actual fun RealizePalette(hdc: HDC): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_RealizePalette(hdc).toUInt()

public actual fun RectInRegion(hrgn: HRGN, lprect: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_RectInRegion(hrgn, lprect)

public actual fun RectVisible(hdc: HDC, lprect: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_RectVisible(hdc, lprect)

public actual fun Rectangle(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_Rectangle(hdc, left, top, right, bottom)

public actual fun RedrawWindow(hwnd: HWND, lprcupdate: Long, hrgnupdate: HRGN, flags: REDRAW_WINDOW_FLAGS): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_RedrawWindow(hwnd, lprcupdate, hrgnupdate, flags.toInt())

public actual fun ReleaseDC(hwnd: HWND, hdc: HDC): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_ReleaseDC(hwnd, hdc)

public actual fun RemoveFontMemResourceEx(h: HANDLE): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_RemoveFontMemResourceEx(h)

public actual fun RemoveFontResourceA(lpfilename: PCSTR): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_RemoveFontResourceA(lpfilename)

public actual fun RemoveFontResourceExA(name: PCSTR, fl: UInt, pdv: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_RemoveFontResourceExA(name, fl.toInt(), pdv)

public actual fun RemoveFontResourceExW(name: PCWSTR, fl: UInt, pdv: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_RemoveFontResourceExW(name, fl.toInt(), pdv)

public actual fun RemoveFontResourceW(lpfilename: PCWSTR): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_RemoveFontResourceW(lpfilename)

public actual fun ResetDCA(hdc: HDC, lpdm: Long): HDC =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_ResetDCA(hdc, lpdm)

public actual fun ResetDCW(hdc: HDC, lpdm: Long): HDC =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_ResetDCW(hdc, lpdm)

public actual fun ResizePalette(hpal: HPALETTE, n: UInt): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_ResizePalette(hpal, n.toInt())

public actual fun RestoreDC(hdc: HDC, nsaveddc: Int): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_RestoreDC(hdc, nsaveddc)

public actual fun RoundRect(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int, width: Int, height: Int): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_RoundRect(hdc, left, top, right, bottom, width, height)

public actual fun SaveDC(hdc: HDC): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SaveDC(hdc)

public actual fun ScaleViewportExtEx(hdc: HDC, xn: Int, dx: Int, yn: Int, yd: Int, lpsz: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_ScaleViewportExtEx(hdc, xn, dx, yn, yd, lpsz)

public actual fun ScaleWindowExtEx(hdc: HDC, xn: Int, xd: Int, yn: Int, yd: Int, lpsz: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_ScaleWindowExtEx(hdc, xn, xd, yn, yd, lpsz)

public actual fun ScreenToClient(hwnd: HWND, lppoint: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_ScreenToClient(hwnd, lppoint)

public actual fun SelectClipPath(hdc: HDC, mode: RGN_COMBINE_MODE): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SelectClipPath(hdc, mode)

public actual fun SelectClipRgn(hdc: HDC, hrgn: HRGN): GDI_REGION_TYPE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SelectClipRgn(hdc, hrgn)

public actual fun SelectObject(hdc: HDC, h: HGDIOBJ): HGDIOBJ =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SelectObject(hdc, h)

public actual fun SelectPalette(hdc: HDC, hpal: HPALETTE, bforcebkgd: BOOL): HPALETTE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SelectPalette(hdc, hpal, bforcebkgd)

public actual fun SetArcDirection(hdc: HDC, dir: ARC_DIRECTION): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetArcDirection(hdc, dir)

public actual fun SetBitmapBits(hbm: HBITMAP, cb: UInt, pvbits: Long): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetBitmapBits(hbm, cb.toInt(), pvbits)

public actual fun SetBitmapDimensionEx(hbm: HBITMAP, w: Int, h: Int, lpsz: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetBitmapDimensionEx(hbm, w, h, lpsz)

public actual fun SetBkColor(hdc: HDC, color: COLORREF): COLORREF =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetBkColor(hdc, color.toInt()).toUInt()

public actual fun SetBkMode(hdc: HDC, mode: Int): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetBkMode(hdc, mode)

public actual fun SetBoundsRect(hdc: HDC, lprect: Long, flags: SET_BOUNDS_RECT_FLAGS): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetBoundsRect(hdc, lprect, flags.toInt()).toUInt()

public actual fun SetBrushOrgEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetBrushOrgEx(hdc, x, y, lppt)

public actual fun SetColorAdjustment(hdc: HDC, lpca: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetColorAdjustment(hdc, lpca)

public actual fun SetDCBrushColor(hdc: HDC, color: COLORREF): COLORREF =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetDCBrushColor(hdc, color.toInt()).toUInt()

public actual fun SetDCPenColor(hdc: HDC, color: COLORREF): COLORREF =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetDCPenColor(hdc, color.toInt()).toUInt()

public actual fun SetDIBColorTable(hdc: HDC, istart: UInt, centries: UInt, prgbq: Long): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetDIBColorTable(hdc, istart.toInt(), centries.toInt(), prgbq).toUInt()

public actual fun SetDIBits(hdc: HDC, hbm: HBITMAP, start: UInt, clines: UInt, lpbits: Long, lpbmi: Long, coloruse: DIB_USAGE): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetDIBits(hdc, hbm, start.toInt(), clines.toInt(), lpbits, lpbmi, coloruse.toInt())

public actual fun SetDIBitsToDevice(hdc: HDC, xdest: Int, ydest: Int, w: UInt, h: UInt, xsrc: Int, ysrc: Int, startscan: UInt, clines: UInt, lpvbits: Long, lpbmi: Long, coloruse: DIB_USAGE): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetDIBitsToDevice(hdc, xdest, ydest, w.toInt(), h.toInt(), xsrc, ysrc, startscan.toInt(), clines.toInt(), lpvbits, lpbmi, coloruse.toInt())

public actual fun SetEnhMetaFileBits(nsize: UInt, pb: Long): HENHMETAFILE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetEnhMetaFileBits(nsize.toInt(), pb)

public actual fun SetGraphicsMode(hdc: HDC, imode: GRAPHICS_MODE): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetGraphicsMode(hdc, imode)

public actual fun SetLayout(hdc: HDC, l: DC_LAYOUT): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetLayout(hdc, l.toInt()).toUInt()

public actual fun SetMapMode(hdc: HDC, imode: HDC_MAP_MODE): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetMapMode(hdc, imode)

public actual fun SetMapperFlags(hdc: HDC, flags: UInt): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetMapperFlags(hdc, flags.toInt()).toUInt()

public actual fun SetMetaFileBitsEx(cbbuffer: UInt, lpdata: Long): HMETAFILE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetMetaFileBitsEx(cbbuffer.toInt(), lpdata)

public actual fun SetMetaRgn(hdc: HDC): GDI_REGION_TYPE =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetMetaRgn(hdc)

public actual fun SetMiterLimit(hdc: HDC, limit: Float, old: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetMiterLimit(hdc, limit, old)

public actual fun SetPaletteEntries(hpal: HPALETTE, istart: UInt, centries: UInt, ppalentries: Long): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetPaletteEntries(hpal, istart.toInt(), centries.toInt(), ppalentries).toUInt()

public actual fun SetPixel(hdc: HDC, x: Int, y: Int, color: COLORREF): COLORREF =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetPixel(hdc, x, y, color.toInt()).toUInt()

public actual fun SetPixelV(hdc: HDC, x: Int, y: Int, color: COLORREF): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetPixelV(hdc, x, y, color.toInt())

public actual fun SetPolyFillMode(hdc: HDC, mode: CREATE_POLYGON_RGN_MODE): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetPolyFillMode(hdc, mode)

public actual fun SetROP2(hdc: HDC, rop2: R2_MODE): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetROP2(hdc, rop2)

public actual fun SetRect(lprc: Long, xleft: Int, ytop: Int, xright: Int, ybottom: Int): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetRect(lprc, xleft, ytop, xright, ybottom)

public actual fun SetRectEmpty(lprc: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetRectEmpty(lprc)

public actual fun SetRectRgn(hrgn: HRGN, left: Int, top: Int, right: Int, bottom: Int): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetRectRgn(hrgn, left, top, right, bottom)

public actual fun SetStretchBltMode(hdc: HDC, mode: STRETCH_BLT_MODE): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetStretchBltMode(hdc, mode)

public actual fun SetSysColors(celements: Int, lpaelements: Long, lpargbvalues: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetSysColors(celements, lpaelements, lpargbvalues)

public actual fun SetSystemPaletteUse(hdc: HDC, use: SYSTEM_PALETTE_USE): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetSystemPaletteUse(hdc, use.toInt()).toUInt()

public actual fun SetTextAlign(hdc: HDC, align: TEXT_ALIGN_OPTIONS): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetTextAlign(hdc, align.toInt()).toUInt()

public actual fun SetTextCharacterExtra(hdc: HDC, extra: Int): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetTextCharacterExtra(hdc, extra)

public actual fun SetTextColor(hdc: HDC, color: COLORREF): COLORREF =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetTextColor(hdc, color.toInt()).toUInt()

public actual fun SetTextJustification(hdc: HDC, extra: Int, count: Int): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetTextJustification(hdc, extra, count)

public actual fun SetViewportExtEx(hdc: HDC, x: Int, y: Int, lpsz: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetViewportExtEx(hdc, x, y, lpsz)

public actual fun SetViewportOrgEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetViewportOrgEx(hdc, x, y, lppt)

public actual fun SetWindowExtEx(hdc: HDC, x: Int, y: Int, lpsz: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetWindowExtEx(hdc, x, y, lpsz)

public actual fun SetWindowOrgEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetWindowOrgEx(hdc, x, y, lppt)

public actual fun SetWindowRgn(hwnd: HWND, hrgn: HRGN, bredraw: BOOL): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetWindowRgn(hwnd, hrgn, bredraw)

public actual fun SetWorldTransform(hdc: HDC, lpxf: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SetWorldTransform(hdc, lpxf)

public actual fun StretchBlt(hdcdest: HDC, xdest: Int, ydest: Int, wdest: Int, hdest: Int, hdcsrc: HDC, xsrc: Int, ysrc: Int, wsrc: Int, hsrc: Int, rop: ROP_CODE): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_StretchBlt(hdcdest, xdest, ydest, wdest, hdest, hdcsrc, xsrc, ysrc, wsrc, hsrc, rop.toInt())

public actual fun StretchDIBits(hdc: HDC, xdest: Int, ydest: Int, destwidth: Int, destheight: Int, xsrc: Int, ysrc: Int, srcwidth: Int, srcheight: Int, lpbits: Long, lpbmi: Long, iusage: DIB_USAGE, rop: ROP_CODE): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_StretchDIBits(hdc, xdest, ydest, destwidth, destheight, xsrc, ysrc, srcwidth, srcheight, lpbits, lpbmi, iusage.toInt(), rop.toInt())

public actual fun StrokeAndFillPath(hdc: HDC): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_StrokeAndFillPath(hdc)

public actual fun StrokePath(hdc: HDC): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_StrokePath(hdc)

public actual fun SubtractRect(lprcdst: Long, lprcsrc1: Long, lprcsrc2: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_SubtractRect(lprcdst, lprcsrc1, lprcsrc2)

public actual fun TTCharToUnicode(hdc: HDC, puccharcodes: Long, ulcharcodesize: UInt, pusshortcodes: Long, ulshortcodesize: UInt, ulflags: UInt): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_TTCharToUnicode(hdc, puccharcodes, ulcharcodesize.toInt(), pusshortcodes, ulshortcodesize.toInt(), ulflags.toInt())

public actual fun TTDeleteEmbeddedFont(hfontreference: HANDLE, ulflags: UInt, pulstatus: Long): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_TTDeleteEmbeddedFont(hfontreference, ulflags.toInt(), pulstatus)

public actual fun TTEmbedFont(hdc: HDC, ulflags: TTEMBED_FLAGS, ulcharset: EMBED_FONT_CHARSET, pulprivstatus: Long, pulstatus: Long, lpfnwritetostream: WRITEEMBEDPROC, lpvwritestream: Long, puscharcodeset: Long, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: Long): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_TTEmbedFont(hdc, ulflags.toInt(), ulcharset.toInt(), pulprivstatus, pulstatus, lpfnwritetostream.toLong(), lpvwritestream, puscharcodeset, uscharcodecount.toShort(), uslanguage.toShort(), pttembedinfo)

public actual fun TTEmbedFontEx(hdc: HDC, ulflags: TTEMBED_FLAGS, ulcharset: EMBED_FONT_CHARSET, pulprivstatus: Long, pulstatus: Long, lpfnwritetostream: WRITEEMBEDPROC, lpvwritestream: Long, pulcharcodeset: Long, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: Long): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_TTEmbedFontEx(hdc, ulflags.toInt(), ulcharset.toInt(), pulprivstatus, pulstatus, lpfnwritetostream.toLong(), lpvwritestream, pulcharcodeset, uscharcodecount.toShort(), uslanguage.toShort(), pttembedinfo)

public actual fun TTEmbedFontFromFileA(hdc: HDC, szfontfilename: PCSTR, usttcindex: UShort, ulflags: TTEMBED_FLAGS, ulcharset: EMBED_FONT_CHARSET, pulprivstatus: Long, pulstatus: Long, lpfnwritetostream: WRITEEMBEDPROC, lpvwritestream: Long, puscharcodeset: Long, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: Long): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_TTEmbedFontFromFileA(hdc, szfontfilename, usttcindex.toShort(), ulflags.toInt(), ulcharset.toInt(), pulprivstatus, pulstatus, lpfnwritetostream.toLong(), lpvwritestream, puscharcodeset, uscharcodecount.toShort(), uslanguage.toShort(), pttembedinfo)

public actual fun TTEnableEmbeddingForFacename(lpszfacename: PCSTR, benable: BOOL): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_TTEnableEmbeddingForFacename(lpszfacename, benable)

public actual fun TTGetEmbeddedFontInfo(ulflags: TTEMBED_FLAGS, pulprivstatus: Long, ulprivs: FONT_LICENSE_PRIVS, pulstatus: Long, lpfnreadfromstream: READEMBEDPROC, lpvreadstream: Long, pttloadinfo: Long): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_TTGetEmbeddedFontInfo(ulflags.toInt(), pulprivstatus, ulprivs.toInt(), pulstatus, lpfnreadfromstream.toLong(), lpvreadstream, pttloadinfo)

public actual fun TTGetEmbeddingType(hdc: HDC, pulembedtype: Long): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_TTGetEmbeddingType(hdc, pulembedtype)

public actual fun TTGetNewFontName(phfontreference: Long, wzwinfamilyname: PWSTR, cchmaxwinname: Int, szmacfamilyname: PSTR, cchmaxmacname: Int): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_TTGetNewFontName(phfontreference, wzwinfamilyname, cchmaxwinname, szmacfamilyname, cchmaxmacname)

public actual fun TTIsEmbeddingEnabled(hdc: HDC, pbenabled: Long): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_TTIsEmbeddingEnabled(hdc, pbenabled)

public actual fun TTIsEmbeddingEnabledForFacename(lpszfacename: PCSTR, pbenabled: Long): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_TTIsEmbeddingEnabledForFacename(lpszfacename, pbenabled)

public actual fun TTLoadEmbeddedFont(phfontreference: Long, ulflags: UInt, pulprivstatus: Long, ulprivs: FONT_LICENSE_PRIVS, pulstatus: Long, lpfnreadfromstream: READEMBEDPROC, lpvreadstream: Long, szwinfamilyname: PCWSTR, szmacfamilyname: PCSTR, pttloadinfo: Long): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_TTLoadEmbeddedFont(phfontreference, ulflags.toInt(), pulprivstatus, ulprivs.toInt(), pulstatus, lpfnreadfromstream.toLong(), lpvreadstream, szwinfamilyname, szmacfamilyname, pttloadinfo)

public actual fun TTRunValidationTests(hdc: HDC, ptestparam: Long): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_TTRunValidationTests(hdc, ptestparam)

public actual fun TTRunValidationTestsEx(hdc: HDC, ptestparam: Long): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_TTRunValidationTestsEx(hdc, ptestparam)

public actual fun TabbedTextOutA(hdc: HDC, x: Int, y: Int, lpstring: PCSTR, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long, ntaborigin: Int): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_TabbedTextOutA(hdc, x, y, lpstring, chcount, ntabpositions, lpntabstoppositions, ntaborigin)

public actual fun TabbedTextOutW(hdc: HDC, x: Int, y: Int, lpstring: PCWSTR, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long, ntaborigin: Int): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_TabbedTextOutW(hdc, x, y, lpstring, chcount, ntabpositions, lpntabstoppositions, ntaborigin)

public actual fun TextOutA(hdc: HDC, x: Int, y: Int, lpstring: PCSTR, c: Int): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_TextOutA(hdc, x, y, lpstring, c)

public actual fun TextOutW(hdc: HDC, x: Int, y: Int, lpstring: PCWSTR, c: Int): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_TextOutW(hdc, x, y, lpstring, c)

public actual fun TransparentBlt(hdcdest: HDC, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: HDC, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: UInt): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_TransparentBlt(hdcdest, xorigindest, yorigindest, wdest, hdest, hdcsrc, xoriginsrc, yoriginsrc, wsrc, hsrc, crtransparent.toInt())

public actual fun UnionRect(lprcdst: Long, lprcsrc1: Long, lprcsrc2: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_UnionRect(lprcdst, lprcsrc1, lprcsrc2)

public actual fun UnrealizeObject(h: HGDIOBJ): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_UnrealizeObject(h)

public actual fun UpdateColors(hdc: HDC): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_UpdateColors(hdc)

public actual fun UpdateWindow(hwnd: HWND): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_UpdateWindow(hwnd)

public actual fun ValidateRect(hwnd: HWND, lprect: Long): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_ValidateRect(hwnd, lprect)

public actual fun ValidateRgn(hwnd: HWND, hrgn: HRGN): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_ValidateRgn(hwnd, hrgn)

public actual fun WidenPath(hdc: HDC): BOOL =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_WidenPath(hdc)

public actual fun WindowFromDC(hdc: HDC): HWND =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_WindowFromDC(hdc)

public actual fun wglSwapMultipleBuffers(param0: UInt, param1: Long): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssys_windows_win32_graphics_gdi_wglSwapMultipleBuffers(param0.toInt(), param1).toUInt()
