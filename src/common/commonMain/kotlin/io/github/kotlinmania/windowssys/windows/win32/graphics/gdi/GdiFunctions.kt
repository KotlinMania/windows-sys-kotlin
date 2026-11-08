package io.github.kotlinmania.windowssys.windows.win32.graphics.gdi

import io.github.kotlinmania.windowssys.Win32DynamicFfi
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

public fun interface FnCallback {
    public operator fun invoke(param0: ULong): Long
}

public fun interface FnCallback1 {
    public operator fun invoke(param0: Long, param1: ULong): Long
}

public fun interface FnCallback2 {
    public operator fun invoke(param0: Long)
}

public fun interface FnCallback3 {
    public operator fun invoke(hdc: HDC, ldata: LPARAM, wdata: WPARAM, cx: Int, cy: Int): BOOL
}

public fun interface FnCallback4 {
    public operator fun invoke(param0: HMONITOR, param1: HDC, param2: Long, param3: LPARAM): BOOL
}

public fun interface FnCallback5 {
    public operator fun invoke(hdc: HDC, lpht: Long, lpmr: Long, nhandles: Int, data: LPARAM): Int
}

public fun interface FnCallback6 {
    public operator fun invoke(param0: Long, param1: Long, param2: UInt, param3: LPARAM): Int
}

public fun interface FnCallback7 {
    public operator fun invoke(param0: Long, param1: LPARAM): Int
}

public fun interface FnCallback8 {
    public operator fun invoke(param0: HDC, param1: LPARAM, param2: Int): BOOL
}

public fun interface FnCallback9 {
    public operator fun invoke(param0: Int, param1: Int, param2: LPARAM)
}

public fun interface FnCallback10 {
    public operator fun invoke(param0: Long, param1: Long, param2: UInt): UInt
}

public fun AbortPath(hdc: HDC): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "AbortPath", longArrayOf(hdc)).toInt()
}

public fun AddFontMemResourceEx(pfileview: Long, cjsize: UInt, pvresrved: Long, pnumfonts: Long): HANDLE {
    return Win32DynamicFfi.invoke("gdi32.dll", "AddFontMemResourceEx", longArrayOf(pfileview, cjsize.toLong(), pvresrved, pnumfonts))
}

public fun AddFontResourceA(param0: PCSTR): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "AddFontResourceA", longArrayOf(param0)).toInt()
}

public fun AddFontResourceExA(name: PCSTR, fl: FONT_RESOURCE_CHARACTERISTICS, res: Long): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "AddFontResourceExA", longArrayOf(name, fl.toLong(), res)).toInt()
}

public fun AddFontResourceExW(name: PCWSTR, fl: FONT_RESOURCE_CHARACTERISTICS, res: Long): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "AddFontResourceExW", longArrayOf(name, fl.toLong(), res)).toInt()
}

public fun AddFontResourceW(param0: PCWSTR): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "AddFontResourceW", longArrayOf(param0)).toInt()
}

public fun AlphaBlend(hdcdest: HDC, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: HDC, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, ftn: BLENDFUNCTION): BOOL {
    return Win32DynamicFfi.invoke("msimg32.dll", "AlphaBlend", longArrayOf(hdcdest, xorigindest.toLong(), yorigindest.toLong(), wdest.toLong(), hdest.toLong(), hdcsrc, xoriginsrc.toLong(), yoriginsrc.toLong(), wsrc.toLong(), hsrc.toLong(), ((ftn.BlendOp.toLong() and 0xFFL) or ((ftn.BlendFlags.toLong() and 0xFFL) shl 8) or ((ftn.SourceConstantAlpha.toLong() and 0xFFL) shl 16) or ((ftn.AlphaFormat.toLong() and 0xFFL) shl 24)))).toInt()
}

public fun AngleArc(hdc: HDC, x: Int, y: Int, r: UInt, startangle: Float, sweepangle: Float): BOOL {
    return Win32DynamicFfi.invokeFp("gdi32.dll", "AngleArc", 1280, false, longArrayOf(hdc, x.toLong(), y.toLong(), r.toLong(), (startangle.toRawBits().toLong() and 0xFFFF_FFFFL), (sweepangle.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun AnimatePalette(hpal: HPALETTE, istartindex: UInt, centries: UInt, ppe: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "AnimatePalette", longArrayOf(hpal, istartindex.toLong(), centries.toLong(), ppe)).toInt()
}

public fun Arc(hdc: HDC, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "Arc", longArrayOf(hdc, x1.toLong(), y1.toLong(), x2.toLong(), y2.toLong(), x3.toLong(), y3.toLong(), x4.toLong(), y4.toLong())).toInt()
}

public fun ArcTo(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "ArcTo", longArrayOf(hdc, left.toLong(), top.toLong(), right.toLong(), bottom.toLong(), xr1.toLong(), yr1.toLong(), xr2.toLong(), yr2.toLong())).toInt()
}

public fun BeginPaint(hwnd: HWND, lppaint: Long): HDC {
    return Win32DynamicFfi.invoke("user32.dll", "BeginPaint", longArrayOf(hwnd, lppaint))
}

public fun BeginPath(hdc: HDC): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "BeginPath", longArrayOf(hdc)).toInt()
}

public fun BitBlt(hdc: HDC, x: Int, y: Int, cx: Int, cy: Int, hdcsrc: HDC, x1: Int, y1: Int, rop: ROP_CODE): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "BitBlt", longArrayOf(hdc, x.toLong(), y.toLong(), cx.toLong(), cy.toLong(), hdcsrc, x1.toLong(), y1.toLong(), rop.toLong())).toInt()
}

public fun CancelDC(hdc: HDC): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "CancelDC", longArrayOf(hdc)).toInt()
}

public fun ChangeDisplaySettingsA(lpdevmode: Long, dwflags: CDS_TYPE): DISP_CHANGE {
    return Win32DynamicFfi.invoke("user32.dll", "ChangeDisplaySettingsA", longArrayOf(lpdevmode, dwflags.toLong())).toInt()
}

public fun ChangeDisplaySettingsExA(lpszdevicename: PCSTR, lpdevmode: Long, hwnd: HWND, dwflags: CDS_TYPE, lparam: Long): DISP_CHANGE {
    return Win32DynamicFfi.invoke("user32.dll", "ChangeDisplaySettingsExA", longArrayOf(lpszdevicename, lpdevmode, hwnd, dwflags.toLong(), lparam)).toInt()
}

public fun ChangeDisplaySettingsExW(lpszdevicename: PCWSTR, lpdevmode: Long, hwnd: HWND, dwflags: CDS_TYPE, lparam: Long): DISP_CHANGE {
    return Win32DynamicFfi.invoke("user32.dll", "ChangeDisplaySettingsExW", longArrayOf(lpszdevicename, lpdevmode, hwnd, dwflags.toLong(), lparam)).toInt()
}

public fun ChangeDisplaySettingsW(lpdevmode: Long, dwflags: CDS_TYPE): DISP_CHANGE {
    return Win32DynamicFfi.invoke("user32.dll", "ChangeDisplaySettingsW", longArrayOf(lpdevmode, dwflags.toLong())).toInt()
}

public fun Chord(hdc: HDC, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "Chord", longArrayOf(hdc, x1.toLong(), y1.toLong(), x2.toLong(), y2.toLong(), x3.toLong(), y3.toLong(), x4.toLong(), y4.toLong())).toInt()
}

public fun ClientToScreen(hwnd: HWND, lppoint: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "ClientToScreen", longArrayOf(hwnd, lppoint)).toInt()
}

public fun CloseEnhMetaFile(hdc: HDC): HENHMETAFILE {
    return Win32DynamicFfi.invoke("gdi32.dll", "CloseEnhMetaFile", longArrayOf(hdc))
}

public fun CloseFigure(hdc: HDC): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "CloseFigure", longArrayOf(hdc)).toInt()
}

public fun CloseMetaFile(hdc: HDC): HMETAFILE {
    return Win32DynamicFfi.invoke("gdi32.dll", "CloseMetaFile", longArrayOf(hdc))
}

public fun CombineRgn(hrgndst: HRGN, hrgnsrc1: HRGN, hrgnsrc2: HRGN, imode: RGN_COMBINE_MODE): GDI_REGION_TYPE {
    return Win32DynamicFfi.invoke("gdi32.dll", "CombineRgn", longArrayOf(hrgndst, hrgnsrc1, hrgnsrc2, imode.toLong())).toInt()
}

public fun CombineTransform(lpxfout: Long, lpxf1: Long, lpxf2: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "CombineTransform", longArrayOf(lpxfout, lpxf1, lpxf2)).toInt()
}

public fun CopyEnhMetaFileA(henh: HENHMETAFILE, lpfilename: PCSTR): HENHMETAFILE {
    return Win32DynamicFfi.invoke("gdi32.dll", "CopyEnhMetaFileA", longArrayOf(henh, lpfilename))
}

public fun CopyEnhMetaFileW(henh: HENHMETAFILE, lpfilename: PCWSTR): HENHMETAFILE {
    return Win32DynamicFfi.invoke("gdi32.dll", "CopyEnhMetaFileW", longArrayOf(henh, lpfilename))
}

public fun CopyMetaFileA(param0: HMETAFILE, param1: PCSTR): HMETAFILE {
    return Win32DynamicFfi.invoke("gdi32.dll", "CopyMetaFileA", longArrayOf(param0, param1))
}

public fun CopyMetaFileW(param0: HMETAFILE, param1: PCWSTR): HMETAFILE {
    return Win32DynamicFfi.invoke("gdi32.dll", "CopyMetaFileW", longArrayOf(param0, param1))
}

public fun CopyRect(lprcdst: Long, lprcsrc: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "CopyRect", longArrayOf(lprcdst, lprcsrc)).toInt()
}

public fun CreateBitmap(nwidth: Int, nheight: Int, nplanes: UInt, nbitcount: UInt, lpbits: Long): HBITMAP {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateBitmap", longArrayOf(nwidth.toLong(), nheight.toLong(), nplanes.toLong(), nbitcount.toLong(), lpbits))
}

public fun CreateBitmapIndirect(pbm: Long): HBITMAP {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateBitmapIndirect", longArrayOf(pbm))
}

public fun CreateBrushIndirect(plbrush: Long): HBRUSH {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateBrushIndirect", longArrayOf(plbrush))
}

public fun CreateCompatibleBitmap(hdc: HDC, cx: Int, cy: Int): HBITMAP {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateCompatibleBitmap", longArrayOf(hdc, cx.toLong(), cy.toLong()))
}

public fun CreateCompatibleDC(hdc: HDC): HDC {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateCompatibleDC", longArrayOf(hdc))
}

public fun CreateDCA(pwszdriver: PCSTR, pwszdevice: PCSTR, pszport: PCSTR, pdm: Long): HDC {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateDCA", longArrayOf(pwszdriver, pwszdevice, pszport, pdm))
}

public fun CreateDCW(pwszdriver: PCWSTR, pwszdevice: PCWSTR, pszport: PCWSTR, pdm: Long): HDC {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateDCW", longArrayOf(pwszdriver, pwszdevice, pszport, pdm))
}

public fun CreateDIBPatternBrush(h: HGLOBAL, iusage: DIB_USAGE): HBRUSH {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateDIBPatternBrush", longArrayOf(h, iusage.toLong()))
}

public fun CreateDIBPatternBrushPt(lppackeddib: Long, iusage: DIB_USAGE): HBRUSH {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateDIBPatternBrushPt", longArrayOf(lppackeddib, iusage.toLong()))
}

public fun CreateDIBSection(hdc: HDC, pbmi: Long, usage: DIB_USAGE, ppvbits: Long, hsection: HANDLE, offset: UInt): HBITMAP {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateDIBSection", longArrayOf(hdc, pbmi, usage.toLong(), ppvbits, hsection, offset.toLong()))
}

public fun CreateDIBitmap(hdc: HDC, pbmih: Long, flinit: UInt, pjbits: Long, pbmi: Long, iusage: DIB_USAGE): HBITMAP {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateDIBitmap", longArrayOf(hdc, pbmih, flinit.toLong(), pjbits, pbmi, iusage.toLong()))
}

public fun CreateDiscardableBitmap(hdc: HDC, cx: Int, cy: Int): HBITMAP {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateDiscardableBitmap", longArrayOf(hdc, cx.toLong(), cy.toLong()))
}

public fun CreateEllipticRgn(x1: Int, y1: Int, x2: Int, y2: Int): HRGN {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateEllipticRgn", longArrayOf(x1.toLong(), y1.toLong(), x2.toLong(), y2.toLong()))
}

public fun CreateEllipticRgnIndirect(lprect: Long): HRGN {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateEllipticRgnIndirect", longArrayOf(lprect))
}

public fun CreateEnhMetaFileA(hdc: HDC, lpfilename: PCSTR, lprc: Long, lpdesc: PCSTR): HDC {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateEnhMetaFileA", longArrayOf(hdc, lpfilename, lprc, lpdesc))
}

public fun CreateEnhMetaFileW(hdc: HDC, lpfilename: PCWSTR, lprc: Long, lpdesc: PCWSTR): HDC {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateEnhMetaFileW", longArrayOf(hdc, lpfilename, lprc, lpdesc))
}

public fun CreateFontA(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: UInt, bunderline: UInt, bstrikeout: UInt, icharset: UInt, ioutprecision: UInt, iclipprecision: UInt, iquality: UInt, ipitchandfamily: UInt, pszfacename: PCSTR): HFONT {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateFontA", longArrayOf(cheight.toLong(), cwidth.toLong(), cescapement.toLong(), corientation.toLong(), cweight.toLong(), bitalic.toLong(), bunderline.toLong(), bstrikeout.toLong(), icharset.toLong(), ioutprecision.toLong(), iclipprecision.toLong(), iquality.toLong(), ipitchandfamily.toLong(), pszfacename))
}

public fun CreateFontIndirectA(lplf: Long): HFONT {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateFontIndirectA", longArrayOf(lplf))
}

public fun CreateFontIndirectExA(param0: Long): HFONT {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateFontIndirectExA", longArrayOf(param0))
}

public fun CreateFontIndirectExW(param0: Long): HFONT {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateFontIndirectExW", longArrayOf(param0))
}

public fun CreateFontIndirectW(lplf: Long): HFONT {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateFontIndirectW", longArrayOf(lplf))
}

public fun CreateFontPackage(puchsrcbuffer: Long, ulsrcbuffersize: UInt, ppuchfontpackagebuffer: Long, pulfontpackagebuffersize: Long, pulbyteswritten: Long, usflag: UShort, usttcindex: UShort, ussubsetformat: UShort, ussubsetlanguage: UShort, ussubsetplatform: CREATE_FONT_PACKAGE_SUBSET_PLATFORM, ussubsetencoding: CREATE_FONT_PACKAGE_SUBSET_ENCODING, pussubsetkeeplist: Long, ussubsetlistcount: UShort, lpfnallocate: CFP_ALLOCPROC, lpfnreallocate: CFP_REALLOCPROC, lpfnfree: CFP_FREEPROC, lpvreserved: Long): UInt {
    return Win32DynamicFfi.invoke("fontsub.dll", "CreateFontPackage", longArrayOf(puchsrcbuffer, ulsrcbuffersize.toLong(), ppuchfontpackagebuffer, pulfontpackagebuffersize, pulbyteswritten, usflag.toLong(), usttcindex.toLong(), ussubsetformat.toLong(), ussubsetlanguage.toLong(), ussubsetplatform.toLong(), ussubsetencoding.toLong(), pussubsetkeeplist, ussubsetlistcount.toLong(), Win32DynamicFfi.objectSlot(lpfnallocate), Win32DynamicFfi.objectSlot(lpfnreallocate), Win32DynamicFfi.objectSlot(lpfnfree), lpvreserved)).toUInt()
}

public fun CreateFontW(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: UInt, bunderline: UInt, bstrikeout: UInt, icharset: UInt, ioutprecision: UInt, iclipprecision: UInt, iquality: UInt, ipitchandfamily: UInt, pszfacename: PCWSTR): HFONT {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateFontW", longArrayOf(cheight.toLong(), cwidth.toLong(), cescapement.toLong(), corientation.toLong(), cweight.toLong(), bitalic.toLong(), bunderline.toLong(), bstrikeout.toLong(), icharset.toLong(), ioutprecision.toLong(), iclipprecision.toLong(), iquality.toLong(), ipitchandfamily.toLong(), pszfacename))
}

public fun CreateHalftonePalette(hdc: HDC): HPALETTE {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateHalftonePalette", longArrayOf(hdc))
}

public fun CreateHatchBrush(ihatch: HATCH_BRUSH_STYLE, color: COLORREF): HBRUSH {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateHatchBrush", longArrayOf(ihatch.toLong(), color.toLong()))
}

public fun CreateICA(pszdriver: PCSTR, pszdevice: PCSTR, pszport: PCSTR, pdm: Long): HDC {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateICA", longArrayOf(pszdriver, pszdevice, pszport, pdm))
}

public fun CreateICW(pszdriver: PCWSTR, pszdevice: PCWSTR, pszport: PCWSTR, pdm: Long): HDC {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateICW", longArrayOf(pszdriver, pszdevice, pszport, pdm))
}

public fun CreateMetaFileA(pszfile: PCSTR): HDC {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateMetaFileA", longArrayOf(pszfile))
}

public fun CreateMetaFileW(pszfile: PCWSTR): HDC {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateMetaFileW", longArrayOf(pszfile))
}

public fun CreatePalette(plpal: Long): HPALETTE {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreatePalette", longArrayOf(plpal))
}

public fun CreatePatternBrush(hbm: HBITMAP): HBRUSH {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreatePatternBrush", longArrayOf(hbm))
}

public fun CreatePen(istyle: PEN_STYLE, cwidth: Int, color: COLORREF): HPEN {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreatePen", longArrayOf(istyle.toLong(), cwidth.toLong(), color.toLong()))
}

public fun CreatePenIndirect(plpen: Long): HPEN {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreatePenIndirect", longArrayOf(plpen))
}

public fun CreatePolyPolygonRgn(pptl: Long, pc: Long, cpoly: Int, imode: CREATE_POLYGON_RGN_MODE): HRGN {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreatePolyPolygonRgn", longArrayOf(pptl, pc, cpoly.toLong(), imode.toLong()))
}

public fun CreatePolygonRgn(pptl: Long, cpoint: Int, imode: CREATE_POLYGON_RGN_MODE): HRGN {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreatePolygonRgn", longArrayOf(pptl, cpoint.toLong(), imode.toLong()))
}

public fun CreateRectRgn(x1: Int, y1: Int, x2: Int, y2: Int): HRGN {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateRectRgn", longArrayOf(x1.toLong(), y1.toLong(), x2.toLong(), y2.toLong()))
}

public fun CreateRectRgnIndirect(lprect: Long): HRGN {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateRectRgnIndirect", longArrayOf(lprect))
}

public fun CreateRoundRectRgn(x1: Int, y1: Int, x2: Int, y2: Int, w: Int, h: Int): HRGN {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateRoundRectRgn", longArrayOf(x1.toLong(), y1.toLong(), x2.toLong(), y2.toLong(), w.toLong(), h.toLong()))
}

public fun CreateScalableFontResourceA(fdwhidden: UInt, lpszfont: PCSTR, lpszfile: PCSTR, lpszpath: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateScalableFontResourceA", longArrayOf(fdwhidden.toLong(), lpszfont, lpszfile, lpszpath)).toInt()
}

public fun CreateScalableFontResourceW(fdwhidden: UInt, lpszfont: PCWSTR, lpszfile: PCWSTR, lpszpath: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateScalableFontResourceW", longArrayOf(fdwhidden.toLong(), lpszfont, lpszfile, lpszpath)).toInt()
}

public fun CreateSolidBrush(color: COLORREF): HBRUSH {
    return Win32DynamicFfi.invoke("gdi32.dll", "CreateSolidBrush", longArrayOf(color.toLong()))
}

public fun DPtoLP(hdc: HDC, lppt: Long, c: Int): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "DPtoLP", longArrayOf(hdc, lppt, c.toLong())).toInt()
}

public fun DeleteDC(hdc: HDC): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "DeleteDC", longArrayOf(hdc)).toInt()
}

public fun DeleteEnhMetaFile(hmf: HENHMETAFILE): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "DeleteEnhMetaFile", longArrayOf(hmf)).toInt()
}

public fun DeleteMetaFile(hmf: HMETAFILE): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "DeleteMetaFile", longArrayOf(hmf)).toInt()
}

public fun DeleteObject(ho: HGDIOBJ): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "DeleteObject", longArrayOf(ho)).toInt()
}

public fun DrawAnimatedRects(hwnd: HWND, idani: Int, lprcfrom: Long, lprcto: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DrawAnimatedRects", longArrayOf(hwnd, idani.toLong(), lprcfrom, lprcto)).toInt()
}

public fun DrawCaption(hwnd: HWND, hdc: HDC, lprect: Long, flags: DRAW_CAPTION_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DrawCaption", longArrayOf(hwnd, hdc, lprect, flags.toLong())).toInt()
}

public fun DrawEdge(hdc: HDC, qrc: Long, edge: DRAWEDGE_FLAGS, grfflags: DRAW_EDGE_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DrawEdge", longArrayOf(hdc, qrc, edge.toLong(), grfflags.toLong())).toInt()
}

public fun DrawEscape(hdc: HDC, iescape: Int, cjin: Int, lpin: PCSTR): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "DrawEscape", longArrayOf(hdc, iescape.toLong(), cjin.toLong(), lpin)).toInt()
}

public fun DrawFocusRect(hdc: HDC, lprc: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DrawFocusRect", longArrayOf(hdc, lprc)).toInt()
}

public fun DrawFrameControl(param0: HDC, param1: Long, param2: DFC_TYPE, param3: DFCS_STATE): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DrawFrameControl", longArrayOf(param0, param1, param2.toLong(), param3.toLong())).toInt()
}

public fun DrawStateA(hdc: HDC, hbrfore: HBRUSH, qfncallback: DRAWSTATEPROC, ldata: LPARAM, wdata: WPARAM, x: Int, y: Int, cx: Int, cy: Int, uflags: DRAWSTATE_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DrawStateA", longArrayOf(hdc, hbrfore, Win32DynamicFfi.objectSlot(qfncallback), ldata, wdata.toLong(), x.toLong(), y.toLong(), cx.toLong(), cy.toLong(), uflags.toLong())).toInt()
}

public fun DrawStateW(hdc: HDC, hbrfore: HBRUSH, qfncallback: DRAWSTATEPROC, ldata: LPARAM, wdata: WPARAM, x: Int, y: Int, cx: Int, cy: Int, uflags: DRAWSTATE_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "DrawStateW", longArrayOf(hdc, hbrfore, Win32DynamicFfi.objectSlot(qfncallback), ldata, wdata.toLong(), x.toLong(), y.toLong(), cx.toLong(), cy.toLong(), uflags.toLong())).toInt()
}

public fun DrawTextA(hdc: HDC, lpchtext: PCSTR, cchtext: Int, lprc: Long, format: DRAW_TEXT_FORMAT): Int {
    return Win32DynamicFfi.invoke("user32.dll", "DrawTextA", longArrayOf(hdc, lpchtext, cchtext.toLong(), lprc, format.toLong())).toInt()
}

public fun DrawTextExA(hdc: HDC, lpchtext: PSTR, cchtext: Int, lprc: Long, format: DRAW_TEXT_FORMAT, lpdtp: Long): Int {
    return Win32DynamicFfi.invoke("user32.dll", "DrawTextExA", longArrayOf(hdc, lpchtext, cchtext.toLong(), lprc, format.toLong(), lpdtp)).toInt()
}

public fun DrawTextExW(hdc: HDC, lpchtext: PWSTR, cchtext: Int, lprc: Long, format: DRAW_TEXT_FORMAT, lpdtp: Long): Int {
    return Win32DynamicFfi.invoke("user32.dll", "DrawTextExW", longArrayOf(hdc, lpchtext, cchtext.toLong(), lprc, format.toLong(), lpdtp)).toInt()
}

public fun DrawTextW(hdc: HDC, lpchtext: PCWSTR, cchtext: Int, lprc: Long, format: DRAW_TEXT_FORMAT): Int {
    return Win32DynamicFfi.invoke("user32.dll", "DrawTextW", longArrayOf(hdc, lpchtext, cchtext.toLong(), lprc, format.toLong())).toInt()
}

public fun Ellipse(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "Ellipse", longArrayOf(hdc, left.toLong(), top.toLong(), right.toLong(), bottom.toLong())).toInt()
}

public fun EndPaint(hwnd: HWND, lppaint: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "EndPaint", longArrayOf(hwnd, lppaint)).toInt()
}

public fun EndPath(hdc: HDC): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "EndPath", longArrayOf(hdc)).toInt()
}

public fun EnumDisplayDevicesA(lpdevice: PCSTR, idevnum: UInt, lpdisplaydevice: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "EnumDisplayDevicesA", longArrayOf(lpdevice, idevnum.toLong(), lpdisplaydevice, dwflags.toLong())).toInt()
}

public fun EnumDisplayDevicesW(lpdevice: PCWSTR, idevnum: UInt, lpdisplaydevice: Long, dwflags: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "EnumDisplayDevicesW", longArrayOf(lpdevice, idevnum.toLong(), lpdisplaydevice, dwflags.toLong())).toInt()
}

public fun EnumDisplayMonitors(hdc: HDC, lprcclip: Long, lpfnenum: MONITORENUMPROC, dwdata: LPARAM): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "EnumDisplayMonitors", longArrayOf(hdc, lprcclip, Win32DynamicFfi.objectSlot(lpfnenum), dwdata)).toInt()
}

public fun EnumDisplaySettingsA(lpszdevicename: PCSTR, imodenum: ENUM_DISPLAY_SETTINGS_MODE, lpdevmode: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "EnumDisplaySettingsA", longArrayOf(lpszdevicename, imodenum.toLong(), lpdevmode)).toInt()
}

public fun EnumDisplaySettingsExA(lpszdevicename: PCSTR, imodenum: ENUM_DISPLAY_SETTINGS_MODE, lpdevmode: Long, dwflags: ENUM_DISPLAY_SETTINGS_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "EnumDisplaySettingsExA", longArrayOf(lpszdevicename, imodenum.toLong(), lpdevmode, dwflags.toLong())).toInt()
}

public fun EnumDisplaySettingsExW(lpszdevicename: PCWSTR, imodenum: ENUM_DISPLAY_SETTINGS_MODE, lpdevmode: Long, dwflags: ENUM_DISPLAY_SETTINGS_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "EnumDisplaySettingsExW", longArrayOf(lpszdevicename, imodenum.toLong(), lpdevmode, dwflags.toLong())).toInt()
}

public fun EnumDisplaySettingsW(lpszdevicename: PCWSTR, imodenum: ENUM_DISPLAY_SETTINGS_MODE, lpdevmode: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "EnumDisplaySettingsW", longArrayOf(lpszdevicename, imodenum.toLong(), lpdevmode)).toInt()
}

public fun EnumEnhMetaFile(hdc: HDC, hmf: HENHMETAFILE, proc: ENHMFENUMPROC, param3: Long, lprect: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "EnumEnhMetaFile", longArrayOf(hdc, hmf, Win32DynamicFfi.objectSlot(proc), param3, lprect)).toInt()
}

public fun EnumFontFamiliesA(hdc: HDC, lplogfont: PCSTR, lpproc: FONTENUMPROCA, lparam: LPARAM): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "EnumFontFamiliesA", longArrayOf(hdc, lplogfont, Win32DynamicFfi.objectSlot(lpproc), lparam)).toInt()
}

public fun EnumFontFamiliesExA(hdc: HDC, lplogfont: Long, lpproc: FONTENUMPROCA, lparam: LPARAM, dwflags: UInt): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "EnumFontFamiliesExA", longArrayOf(hdc, lplogfont, Win32DynamicFfi.objectSlot(lpproc), lparam, dwflags.toLong())).toInt()
}

public fun EnumFontFamiliesExW(hdc: HDC, lplogfont: Long, lpproc: FONTENUMPROCW, lparam: LPARAM, dwflags: UInt): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "EnumFontFamiliesExW", longArrayOf(hdc, lplogfont, Win32DynamicFfi.objectSlot(lpproc), lparam, dwflags.toLong())).toInt()
}

public fun EnumFontFamiliesW(hdc: HDC, lplogfont: PCWSTR, lpproc: FONTENUMPROCW, lparam: LPARAM): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "EnumFontFamiliesW", longArrayOf(hdc, lplogfont, Win32DynamicFfi.objectSlot(lpproc), lparam)).toInt()
}

public fun EnumFontsA(hdc: HDC, lplogfont: PCSTR, lpproc: FONTENUMPROCA, lparam: LPARAM): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "EnumFontsA", longArrayOf(hdc, lplogfont, Win32DynamicFfi.objectSlot(lpproc), lparam)).toInt()
}

public fun EnumFontsW(hdc: HDC, lplogfont: PCWSTR, lpproc: FONTENUMPROCW, lparam: LPARAM): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "EnumFontsW", longArrayOf(hdc, lplogfont, Win32DynamicFfi.objectSlot(lpproc), lparam)).toInt()
}

public fun EnumMetaFile(hdc: HDC, hmf: HMETAFILE, proc: MFENUMPROC, param3: LPARAM): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "EnumMetaFile", longArrayOf(hdc, hmf, Win32DynamicFfi.objectSlot(proc), param3)).toInt()
}

public fun EnumObjects(hdc: HDC, ntype: OBJ_TYPE, lpfunc: GOBJENUMPROC, lparam: LPARAM): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "EnumObjects", longArrayOf(hdc, ntype.toLong(), Win32DynamicFfi.objectSlot(lpfunc), lparam)).toInt()
}

public fun EqualRect(lprc1: Long, lprc2: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "EqualRect", longArrayOf(lprc1, lprc2)).toInt()
}

public fun EqualRgn(hrgn1: HRGN, hrgn2: HRGN): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "EqualRgn", longArrayOf(hrgn1, hrgn2)).toInt()
}

public fun ExcludeClipRect(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int): GDI_REGION_TYPE {
    return Win32DynamicFfi.invoke("gdi32.dll", "ExcludeClipRect", longArrayOf(hdc, left.toLong(), top.toLong(), right.toLong(), bottom.toLong())).toInt()
}

public fun ExcludeUpdateRgn(hdc: HDC, hwnd: HWND): Int {
    return Win32DynamicFfi.invoke("user32.dll", "ExcludeUpdateRgn", longArrayOf(hdc, hwnd)).toInt()
}

public fun ExtCreatePen(ipenstyle: UInt, cwidth: UInt, plbrush: Long, cstyle: UInt, pstyle: Long): HPEN {
    return Win32DynamicFfi.invoke("gdi32.dll", "ExtCreatePen", longArrayOf(ipenstyle.toLong(), cwidth.toLong(), plbrush, cstyle.toLong(), pstyle))
}

public fun ExtCreateRegion(lpx: Long, ncount: UInt, lpdata: Long): HRGN {
    return Win32DynamicFfi.invoke("gdi32.dll", "ExtCreateRegion", longArrayOf(lpx, ncount.toLong(), lpdata))
}

public fun ExtFloodFill(hdc: HDC, x: Int, y: Int, color: COLORREF, type: EXT_FLOOD_FILL_TYPE): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "ExtFloodFill", longArrayOf(hdc, x.toLong(), y.toLong(), color.toLong(), type.toLong())).toInt()
}

public fun ExtSelectClipRgn(hdc: HDC, hrgn: HRGN, mode: RGN_COMBINE_MODE): GDI_REGION_TYPE {
    return Win32DynamicFfi.invoke("gdi32.dll", "ExtSelectClipRgn", longArrayOf(hdc, hrgn, mode.toLong())).toInt()
}

public fun ExtTextOutA(hdc: HDC, x: Int, y: Int, options: ETO_OPTIONS, lprect: Long, lpstring: PCSTR, c: UInt, lpdx: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "ExtTextOutA", longArrayOf(hdc, x.toLong(), y.toLong(), options.toLong(), lprect, lpstring, c.toLong(), lpdx)).toInt()
}

public fun ExtTextOutW(hdc: HDC, x: Int, y: Int, options: ETO_OPTIONS, lprect: Long, lpstring: PCWSTR, c: UInt, lpdx: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "ExtTextOutW", longArrayOf(hdc, x.toLong(), y.toLong(), options.toLong(), lprect, lpstring, c.toLong(), lpdx)).toInt()
}

public fun FillPath(hdc: HDC): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "FillPath", longArrayOf(hdc)).toInt()
}

public fun FillRect(hdc: HDC, lprc: Long, hbr: HBRUSH): Int {
    return Win32DynamicFfi.invoke("user32.dll", "FillRect", longArrayOf(hdc, lprc, hbr)).toInt()
}

public fun FillRgn(hdc: HDC, hrgn: HRGN, hbr: HBRUSH): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "FillRgn", longArrayOf(hdc, hrgn, hbr)).toInt()
}

public fun FixBrushOrgEx(hdc: HDC, x: Int, y: Int, ptl: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "FixBrushOrgEx", longArrayOf(hdc, x.toLong(), y.toLong(), ptl)).toInt()
}

public fun FlattenPath(hdc: HDC): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "FlattenPath", longArrayOf(hdc)).toInt()
}

public fun FloodFill(hdc: HDC, x: Int, y: Int, color: COLORREF): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "FloodFill", longArrayOf(hdc, x.toLong(), y.toLong(), color.toLong())).toInt()
}

public fun FrameRect(hdc: HDC, lprc: Long, hbr: HBRUSH): Int {
    return Win32DynamicFfi.invoke("user32.dll", "FrameRect", longArrayOf(hdc, lprc, hbr)).toInt()
}

public fun FrameRgn(hdc: HDC, hrgn: HRGN, hbr: HBRUSH, w: Int, h: Int): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "FrameRgn", longArrayOf(hdc, hrgn, hbr, w.toLong(), h.toLong())).toInt()
}

public fun GdiAlphaBlend(hdcdest: HDC, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: HDC, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, ftn: BLENDFUNCTION): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GdiAlphaBlend", longArrayOf(hdcdest, xorigindest.toLong(), yorigindest.toLong(), wdest.toLong(), hdest.toLong(), hdcsrc, xoriginsrc.toLong(), yoriginsrc.toLong(), wsrc.toLong(), hsrc.toLong(), ((ftn.BlendOp.toLong() and 0xFFL) or ((ftn.BlendFlags.toLong() and 0xFFL) shl 8) or ((ftn.SourceConstantAlpha.toLong() and 0xFFL) shl 16) or ((ftn.AlphaFormat.toLong() and 0xFFL) shl 24)))).toInt()
}

public fun GdiComment(hdc: HDC, nsize: UInt, lpdata: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GdiComment", longArrayOf(hdc, nsize.toLong(), lpdata)).toInt()
}

public fun GdiFlush(): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GdiFlush", longArrayOf()).toInt()
}

public fun GdiGetBatchLimit(): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "GdiGetBatchLimit", longArrayOf()).toUInt()
}

public fun GdiGradientFill(hdc: HDC, pvertex: Long, nvertex: UInt, pmesh: Long, ncount: UInt, ulmode: GRADIENT_FILL): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GdiGradientFill", longArrayOf(hdc, pvertex, nvertex.toLong(), pmesh, ncount.toLong(), ulmode.toLong())).toInt()
}

public fun GdiSetBatchLimit(dw: UInt): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "GdiSetBatchLimit", longArrayOf(dw.toLong())).toUInt()
}

public fun GdiTransparentBlt(hdcdest: HDC, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: HDC, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: UInt): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GdiTransparentBlt", longArrayOf(hdcdest, xorigindest.toLong(), yorigindest.toLong(), wdest.toLong(), hdest.toLong(), hdcsrc, xoriginsrc.toLong(), yoriginsrc.toLong(), wsrc.toLong(), hsrc.toLong(), crtransparent.toLong())).toInt()
}

public fun GetArcDirection(hdc: HDC): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetArcDirection", longArrayOf(hdc)).toInt()
}

public fun GetAspectRatioFilterEx(hdc: HDC, lpsize: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetAspectRatioFilterEx", longArrayOf(hdc, lpsize)).toInt()
}

public fun GetBitmapBits(hbit: HBITMAP, cb: Int, lpvbits: Long): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetBitmapBits", longArrayOf(hbit, cb.toLong(), lpvbits)).toInt()
}

public fun GetBitmapDimensionEx(hbit: HBITMAP, lpsize: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetBitmapDimensionEx", longArrayOf(hbit, lpsize)).toInt()
}

public fun GetBkColor(hdc: HDC): COLORREF {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetBkColor", longArrayOf(hdc)).toUInt()
}

public fun GetBkMode(hdc: HDC): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetBkMode", longArrayOf(hdc)).toInt()
}

public fun GetBoundsRect(hdc: HDC, lprect: Long, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetBoundsRect", longArrayOf(hdc, lprect, flags.toLong())).toUInt()
}

public fun GetBrushOrgEx(hdc: HDC, lppt: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetBrushOrgEx", longArrayOf(hdc, lppt)).toInt()
}

public fun GetCharABCWidthsA(hdc: HDC, wfirst: UInt, wlast: UInt, lpabc: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetCharABCWidthsA", longArrayOf(hdc, wfirst.toLong(), wlast.toLong(), lpabc)).toInt()
}

public fun GetCharABCWidthsFloatA(hdc: HDC, ifirst: UInt, ilast: UInt, lpabc: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetCharABCWidthsFloatA", longArrayOf(hdc, ifirst.toLong(), ilast.toLong(), lpabc)).toInt()
}

public fun GetCharABCWidthsFloatW(hdc: HDC, ifirst: UInt, ilast: UInt, lpabc: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetCharABCWidthsFloatW", longArrayOf(hdc, ifirst.toLong(), ilast.toLong(), lpabc)).toInt()
}

public fun GetCharABCWidthsI(hdc: HDC, gifirst: UInt, cgi: UInt, pgi: Long, pabc: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetCharABCWidthsI", longArrayOf(hdc, gifirst.toLong(), cgi.toLong(), pgi, pabc)).toInt()
}

public fun GetCharABCWidthsW(hdc: HDC, wfirst: UInt, wlast: UInt, lpabc: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetCharABCWidthsW", longArrayOf(hdc, wfirst.toLong(), wlast.toLong(), lpabc)).toInt()
}

public fun GetCharWidth32A(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetCharWidth32A", longArrayOf(hdc, ifirst.toLong(), ilast.toLong(), lpbuffer)).toInt()
}

public fun GetCharWidth32W(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetCharWidth32W", longArrayOf(hdc, ifirst.toLong(), ilast.toLong(), lpbuffer)).toInt()
}

public fun GetCharWidthA(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetCharWidthA", longArrayOf(hdc, ifirst.toLong(), ilast.toLong(), lpbuffer)).toInt()
}

public fun GetCharWidthFloatA(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetCharWidthFloatA", longArrayOf(hdc, ifirst.toLong(), ilast.toLong(), lpbuffer)).toInt()
}

public fun GetCharWidthFloatW(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetCharWidthFloatW", longArrayOf(hdc, ifirst.toLong(), ilast.toLong(), lpbuffer)).toInt()
}

public fun GetCharWidthI(hdc: HDC, gifirst: UInt, cgi: UInt, pgi: Long, piwidths: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetCharWidthI", longArrayOf(hdc, gifirst.toLong(), cgi.toLong(), pgi, piwidths)).toInt()
}

public fun GetCharWidthW(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetCharWidthW", longArrayOf(hdc, ifirst.toLong(), ilast.toLong(), lpbuffer)).toInt()
}

public fun GetCharacterPlacementA(hdc: HDC, lpstring: PCSTR, ncount: Int, nmexextent: Int, lpresults: Long, dwflags: GET_CHARACTER_PLACEMENT_FLAGS): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetCharacterPlacementA", longArrayOf(hdc, lpstring, ncount.toLong(), nmexextent.toLong(), lpresults, dwflags.toLong())).toUInt()
}

public fun GetCharacterPlacementW(hdc: HDC, lpstring: PCWSTR, ncount: Int, nmexextent: Int, lpresults: Long, dwflags: GET_CHARACTER_PLACEMENT_FLAGS): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetCharacterPlacementW", longArrayOf(hdc, lpstring, ncount.toLong(), nmexextent.toLong(), lpresults, dwflags.toLong())).toUInt()
}

public fun GetClipBox(hdc: HDC, lprect: Long): GDI_REGION_TYPE {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetClipBox", longArrayOf(hdc, lprect)).toInt()
}

public fun GetClipRgn(hdc: HDC, hrgn: HRGN): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetClipRgn", longArrayOf(hdc, hrgn)).toInt()
}

public fun GetColorAdjustment(hdc: HDC, lpca: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetColorAdjustment", longArrayOf(hdc, lpca)).toInt()
}

public fun GetCurrentObject(hdc: HDC, type: UInt): HGDIOBJ {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetCurrentObject", longArrayOf(hdc, type.toLong()))
}

public fun GetCurrentPositionEx(hdc: HDC, lppt: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetCurrentPositionEx", longArrayOf(hdc, lppt)).toInt()
}

public fun GetDC(hwnd: HWND): HDC {
    return Win32DynamicFfi.invoke("user32.dll", "GetDC", longArrayOf(hwnd))
}

public fun GetDCBrushColor(hdc: HDC): COLORREF {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetDCBrushColor", longArrayOf(hdc)).toUInt()
}

public fun GetDCEx(hwnd: HWND, hrgnclip: HRGN, flags: GET_DCX_FLAGS): HDC {
    return Win32DynamicFfi.invoke("user32.dll", "GetDCEx", longArrayOf(hwnd, hrgnclip, flags.toLong()))
}

public fun GetDCOrgEx(hdc: HDC, lppt: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetDCOrgEx", longArrayOf(hdc, lppt)).toInt()
}

public fun GetDCPenColor(hdc: HDC): COLORREF {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetDCPenColor", longArrayOf(hdc)).toUInt()
}

public fun GetDIBColorTable(hdc: HDC, istart: UInt, centries: UInt, prgbq: Long): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetDIBColorTable", longArrayOf(hdc, istart.toLong(), centries.toLong(), prgbq)).toUInt()
}

public fun GetDIBits(hdc: HDC, hbm: HBITMAP, start: UInt, clines: UInt, lpvbits: Long, lpbmi: Long, usage: DIB_USAGE): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetDIBits", longArrayOf(hdc, hbm, start.toLong(), clines.toLong(), lpvbits, lpbmi, usage.toLong())).toInt()
}

public fun GetDeviceCaps(hdc: HDC, index: Int): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetDeviceCaps", longArrayOf(hdc, index.toLong())).toInt()
}

public fun GetEnhMetaFileA(lpname: PCSTR): HENHMETAFILE {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetEnhMetaFileA", longArrayOf(lpname))
}

public fun GetEnhMetaFileBits(hemf: HENHMETAFILE, nsize: UInt, lpdata: Long): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetEnhMetaFileBits", longArrayOf(hemf, nsize.toLong(), lpdata)).toUInt()
}

public fun GetEnhMetaFileDescriptionA(hemf: HENHMETAFILE, cchbuffer: UInt, lpdescription: PSTR): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetEnhMetaFileDescriptionA", longArrayOf(hemf, cchbuffer.toLong(), lpdescription)).toUInt()
}

public fun GetEnhMetaFileDescriptionW(hemf: HENHMETAFILE, cchbuffer: UInt, lpdescription: PWSTR): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetEnhMetaFileDescriptionW", longArrayOf(hemf, cchbuffer.toLong(), lpdescription)).toUInt()
}

public fun GetEnhMetaFileHeader(hemf: HENHMETAFILE, nsize: UInt, lpenhmetaheader: Long): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetEnhMetaFileHeader", longArrayOf(hemf, nsize.toLong(), lpenhmetaheader)).toUInt()
}

public fun GetEnhMetaFilePaletteEntries(hemf: HENHMETAFILE, nnumentries: UInt, lppaletteentries: Long): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetEnhMetaFilePaletteEntries", longArrayOf(hemf, nnumentries.toLong(), lppaletteentries)).toUInt()
}

public fun GetEnhMetaFileW(lpname: PCWSTR): HENHMETAFILE {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetEnhMetaFileW", longArrayOf(lpname))
}

public fun GetFontData(hdc: HDC, dwtable: UInt, dwoffset: UInt, pvbuffer: Long, cjbuffer: UInt): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetFontData", longArrayOf(hdc, dwtable.toLong(), dwoffset.toLong(), pvbuffer, cjbuffer.toLong())).toUInt()
}

public fun GetFontLanguageInfo(hdc: HDC): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetFontLanguageInfo", longArrayOf(hdc)).toUInt()
}

public fun GetFontUnicodeRanges(hdc: HDC, lpgs: Long): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetFontUnicodeRanges", longArrayOf(hdc, lpgs)).toUInt()
}

public fun GetGlyphIndicesA(hdc: HDC, lpstr: PCSTR, c: Int, pgi: Long, fl: UInt): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetGlyphIndicesA", longArrayOf(hdc, lpstr, c.toLong(), pgi, fl.toLong())).toUInt()
}

public fun GetGlyphIndicesW(hdc: HDC, lpstr: PCWSTR, c: Int, pgi: Long, fl: UInt): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetGlyphIndicesW", longArrayOf(hdc, lpstr, c.toLong(), pgi, fl.toLong())).toUInt()
}

public fun GetGlyphOutlineA(hdc: HDC, uchar: UInt, fuformat: GET_GLYPH_OUTLINE_FORMAT, lpgm: Long, cjbuffer: UInt, pvbuffer: Long, lpmat2: Long): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetGlyphOutlineA", longArrayOf(hdc, uchar.toLong(), fuformat.toLong(), lpgm, cjbuffer.toLong(), pvbuffer, lpmat2)).toUInt()
}

public fun GetGlyphOutlineW(hdc: HDC, uchar: UInt, fuformat: GET_GLYPH_OUTLINE_FORMAT, lpgm: Long, cjbuffer: UInt, pvbuffer: Long, lpmat2: Long): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetGlyphOutlineW", longArrayOf(hdc, uchar.toLong(), fuformat.toLong(), lpgm, cjbuffer.toLong(), pvbuffer, lpmat2)).toUInt()
}

public fun GetGraphicsMode(hdc: HDC): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetGraphicsMode", longArrayOf(hdc)).toInt()
}

public fun GetKerningPairsA(hdc: HDC, npairs: UInt, lpkernpair: Long): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetKerningPairsA", longArrayOf(hdc, npairs.toLong(), lpkernpair)).toUInt()
}

public fun GetKerningPairsW(hdc: HDC, npairs: UInt, lpkernpair: Long): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetKerningPairsW", longArrayOf(hdc, npairs.toLong(), lpkernpair)).toUInt()
}

public fun GetLayout(hdc: HDC): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetLayout", longArrayOf(hdc)).toUInt()
}

public fun GetMapMode(hdc: HDC): HDC_MAP_MODE {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetMapMode", longArrayOf(hdc)).toInt()
}

public fun GetMetaFileA(lpname: PCSTR): HMETAFILE {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetMetaFileA", longArrayOf(lpname))
}

public fun GetMetaFileBitsEx(hmf: HMETAFILE, cbbuffer: UInt, lpdata: Long): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetMetaFileBitsEx", longArrayOf(hmf, cbbuffer.toLong(), lpdata)).toUInt()
}

public fun GetMetaFileW(lpname: PCWSTR): HMETAFILE {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetMetaFileW", longArrayOf(lpname))
}

public fun GetMetaRgn(hdc: HDC, hrgn: HRGN): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetMetaRgn", longArrayOf(hdc, hrgn)).toInt()
}

public fun GetMiterLimit(hdc: HDC, plimit: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetMiterLimit", longArrayOf(hdc, plimit)).toInt()
}

public fun GetMonitorInfoA(hmonitor: HMONITOR, lpmi: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetMonitorInfoA", longArrayOf(hmonitor, lpmi)).toInt()
}

public fun GetMonitorInfoW(hmonitor: HMONITOR, lpmi: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetMonitorInfoW", longArrayOf(hmonitor, lpmi)).toInt()
}

public fun GetNearestColor(hdc: HDC, color: COLORREF): COLORREF {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetNearestColor", longArrayOf(hdc, color.toLong())).toUInt()
}

public fun GetNearestPaletteIndex(h: HPALETTE, color: COLORREF): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetNearestPaletteIndex", longArrayOf(h, color.toLong())).toUInt()
}

public fun GetObjectA(h: HGDIOBJ, c: Int, pv: Long): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetObjectA", longArrayOf(h, c.toLong(), pv)).toInt()
}

public fun GetObjectType(h: HGDIOBJ): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetObjectType", longArrayOf(h)).toUInt()
}

public fun GetObjectW(h: HGDIOBJ, c: Int, pv: Long): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetObjectW", longArrayOf(h, c.toLong(), pv)).toInt()
}

public fun GetOutlineTextMetricsA(hdc: HDC, cjcopy: UInt, potm: Long): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetOutlineTextMetricsA", longArrayOf(hdc, cjcopy.toLong(), potm)).toUInt()
}

public fun GetOutlineTextMetricsW(hdc: HDC, cjcopy: UInt, potm: Long): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetOutlineTextMetricsW", longArrayOf(hdc, cjcopy.toLong(), potm)).toUInt()
}

public fun GetPaletteEntries(hpal: HPALETTE, istart: UInt, centries: UInt, ppalentries: Long): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetPaletteEntries", longArrayOf(hpal, istart.toLong(), centries.toLong(), ppalentries)).toUInt()
}

public fun GetPath(hdc: HDC, apt: Long, aj: Long, cpt: Int): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetPath", longArrayOf(hdc, apt, aj, cpt.toLong())).toInt()
}

public fun GetPixel(hdc: HDC, x: Int, y: Int): COLORREF {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetPixel", longArrayOf(hdc, x.toLong(), y.toLong())).toUInt()
}

public fun GetPolyFillMode(hdc: HDC): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetPolyFillMode", longArrayOf(hdc)).toInt()
}

public fun GetROP2(hdc: HDC): R2_MODE {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetROP2", longArrayOf(hdc)).toInt()
}

public fun GetRandomRgn(hdc: HDC, hrgn: HRGN, i: Int): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetRandomRgn", longArrayOf(hdc, hrgn, i.toLong())).toInt()
}

public fun GetRasterizerCaps(lpraststat: Long, cjbytes: UInt): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetRasterizerCaps", longArrayOf(lpraststat, cjbytes.toLong())).toInt()
}

public fun GetRegionData(hrgn: HRGN, ncount: UInt, lprgndata: Long): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetRegionData", longArrayOf(hrgn, ncount.toLong(), lprgndata)).toUInt()
}

public fun GetRgnBox(hrgn: HRGN, lprc: Long): GDI_REGION_TYPE {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetRgnBox", longArrayOf(hrgn, lprc)).toInt()
}

public fun GetStockObject(i: GET_STOCK_OBJECT_FLAGS): HGDIOBJ {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetStockObject", longArrayOf(i.toLong()))
}

public fun GetStretchBltMode(hdc: HDC): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetStretchBltMode", longArrayOf(hdc)).toInt()
}

public fun GetSysColor(nindex: SYS_COLOR_INDEX): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetSysColor", longArrayOf(nindex.toLong())).toUInt()
}

public fun GetSysColorBrush(nindex: SYS_COLOR_INDEX): HBRUSH {
    return Win32DynamicFfi.invoke("user32.dll", "GetSysColorBrush", longArrayOf(nindex.toLong()))
}

public fun GetSystemPaletteEntries(hdc: HDC, istart: UInt, centries: UInt, ppalentries: Long): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetSystemPaletteEntries", longArrayOf(hdc, istart.toLong(), centries.toLong(), ppalentries)).toUInt()
}

public fun GetSystemPaletteUse(hdc: HDC): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetSystemPaletteUse", longArrayOf(hdc)).toUInt()
}

public fun GetTabbedTextExtentA(hdc: HDC, lpstring: PCSTR, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetTabbedTextExtentA", longArrayOf(hdc, lpstring, chcount.toLong(), ntabpositions.toLong(), lpntabstoppositions)).toUInt()
}

public fun GetTabbedTextExtentW(hdc: HDC, lpstring: PCWSTR, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetTabbedTextExtentW", longArrayOf(hdc, lpstring, chcount.toLong(), ntabpositions.toLong(), lpntabstoppositions)).toUInt()
}

public fun GetTextAlign(hdc: HDC): TEXT_ALIGN_OPTIONS {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetTextAlign", longArrayOf(hdc)).toUInt()
}

public fun GetTextCharacterExtra(hdc: HDC): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetTextCharacterExtra", longArrayOf(hdc)).toInt()
}

public fun GetTextColor(hdc: HDC): COLORREF {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetTextColor", longArrayOf(hdc)).toUInt()
}

public fun GetTextExtentExPointA(hdc: HDC, lpszstring: PCSTR, cchstring: Int, nmaxextent: Int, lpnfit: Long, lpndx: Long, lpsize: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetTextExtentExPointA", longArrayOf(hdc, lpszstring, cchstring.toLong(), nmaxextent.toLong(), lpnfit, lpndx, lpsize)).toInt()
}

public fun GetTextExtentExPointI(hdc: HDC, lpwszstring: Long, cwchstring: Int, nmaxextent: Int, lpnfit: Long, lpndx: Long, lpsize: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetTextExtentExPointI", longArrayOf(hdc, lpwszstring, cwchstring.toLong(), nmaxextent.toLong(), lpnfit, lpndx, lpsize)).toInt()
}

public fun GetTextExtentExPointW(hdc: HDC, lpszstring: PCWSTR, cchstring: Int, nmaxextent: Int, lpnfit: Long, lpndx: Long, lpsize: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetTextExtentExPointW", longArrayOf(hdc, lpszstring, cchstring.toLong(), nmaxextent.toLong(), lpnfit, lpndx, lpsize)).toInt()
}

public fun GetTextExtentPoint32A(hdc: HDC, lpstring: PCSTR, c: Int, psizl: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetTextExtentPoint32A", longArrayOf(hdc, lpstring, c.toLong(), psizl)).toInt()
}

public fun GetTextExtentPoint32W(hdc: HDC, lpstring: PCWSTR, c: Int, psizl: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetTextExtentPoint32W", longArrayOf(hdc, lpstring, c.toLong(), psizl)).toInt()
}

public fun GetTextExtentPointA(hdc: HDC, lpstring: PCSTR, c: Int, lpsz: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetTextExtentPointA", longArrayOf(hdc, lpstring, c.toLong(), lpsz)).toInt()
}

public fun GetTextExtentPointI(hdc: HDC, pgiin: Long, cgi: Int, psize: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetTextExtentPointI", longArrayOf(hdc, pgiin, cgi.toLong(), psize)).toInt()
}

public fun GetTextExtentPointW(hdc: HDC, lpstring: PCWSTR, c: Int, lpsz: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetTextExtentPointW", longArrayOf(hdc, lpstring, c.toLong(), lpsz)).toInt()
}

public fun GetTextFaceA(hdc: HDC, c: Int, lpname: PSTR): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetTextFaceA", longArrayOf(hdc, c.toLong(), lpname)).toInt()
}

public fun GetTextFaceW(hdc: HDC, c: Int, lpname: PWSTR): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetTextFaceW", longArrayOf(hdc, c.toLong(), lpname)).toInt()
}

public fun GetTextMetricsA(hdc: HDC, lptm: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetTextMetricsA", longArrayOf(hdc, lptm)).toInt()
}

public fun GetTextMetricsW(hdc: HDC, lptm: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetTextMetricsW", longArrayOf(hdc, lptm)).toInt()
}

public fun GetUpdateRect(hwnd: HWND, lprect: Long, berase: BOOL): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GetUpdateRect", longArrayOf(hwnd, lprect, berase.toLong())).toInt()
}

public fun GetUpdateRgn(hwnd: HWND, hrgn: HRGN, berase: BOOL): GDI_REGION_TYPE {
    return Win32DynamicFfi.invoke("user32.dll", "GetUpdateRgn", longArrayOf(hwnd, hrgn, berase.toLong())).toInt()
}

public fun GetViewportExtEx(hdc: HDC, lpsize: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetViewportExtEx", longArrayOf(hdc, lpsize)).toInt()
}

public fun GetViewportOrgEx(hdc: HDC, lppoint: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetViewportOrgEx", longArrayOf(hdc, lppoint)).toInt()
}

public fun GetWinMetaFileBits(hemf: HENHMETAFILE, cbdata16: UInt, pdata16: Long, imapmode: Int, hdcref: HDC): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetWinMetaFileBits", longArrayOf(hemf, cbdata16.toLong(), pdata16, imapmode.toLong(), hdcref)).toUInt()
}

public fun GetWindowDC(hwnd: HWND): HDC {
    return Win32DynamicFfi.invoke("user32.dll", "GetWindowDC", longArrayOf(hwnd))
}

public fun GetWindowExtEx(hdc: HDC, lpsize: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetWindowExtEx", longArrayOf(hdc, lpsize)).toInt()
}

public fun GetWindowOrgEx(hdc: HDC, lppoint: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetWindowOrgEx", longArrayOf(hdc, lppoint)).toInt()
}

public fun GetWindowRgn(hwnd: HWND, hrgn: HRGN): GDI_REGION_TYPE {
    return Win32DynamicFfi.invoke("user32.dll", "GetWindowRgn", longArrayOf(hwnd, hrgn)).toInt()
}

public fun GetWindowRgnBox(hwnd: HWND, lprc: Long): GDI_REGION_TYPE {
    return Win32DynamicFfi.invoke("user32.dll", "GetWindowRgnBox", longArrayOf(hwnd, lprc)).toInt()
}

public fun GetWorldTransform(hdc: HDC, lpxf: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "GetWorldTransform", longArrayOf(hdc, lpxf)).toInt()
}

public fun GradientFill(hdc: HDC, pvertex: Long, nvertex: UInt, pmesh: Long, nmesh: UInt, ulmode: GRADIENT_FILL): BOOL {
    return Win32DynamicFfi.invoke("msimg32.dll", "GradientFill", longArrayOf(hdc, pvertex, nvertex.toLong(), pmesh, nmesh.toLong(), ulmode.toLong())).toInt()
}

public fun GrayStringA(hdc: HDC, hbrush: HBRUSH, lpoutputfunc: GRAYSTRINGPROC, lpdata: LPARAM, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GrayStringA", longArrayOf(hdc, hbrush, Win32DynamicFfi.objectSlot(lpoutputfunc), lpdata, ncount.toLong(), x.toLong(), y.toLong(), nwidth.toLong(), nheight.toLong())).toInt()
}

public fun GrayStringW(hdc: HDC, hbrush: HBRUSH, lpoutputfunc: GRAYSTRINGPROC, lpdata: LPARAM, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "GrayStringW", longArrayOf(hdc, hbrush, Win32DynamicFfi.objectSlot(lpoutputfunc), lpdata, ncount.toLong(), x.toLong(), y.toLong(), nwidth.toLong(), nheight.toLong())).toInt()
}

public fun InflateRect(lprc: Long, dx: Int, dy: Int): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "InflateRect", longArrayOf(lprc, dx.toLong(), dy.toLong())).toInt()
}

public fun IntersectClipRect(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int): GDI_REGION_TYPE {
    return Win32DynamicFfi.invoke("gdi32.dll", "IntersectClipRect", longArrayOf(hdc, left.toLong(), top.toLong(), right.toLong(), bottom.toLong())).toInt()
}

public fun IntersectRect(lprcdst: Long, lprcsrc1: Long, lprcsrc2: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IntersectRect", longArrayOf(lprcdst, lprcsrc1, lprcsrc2)).toInt()
}

public fun InvalidateRect(hwnd: HWND, lprect: Long, berase: BOOL): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "InvalidateRect", longArrayOf(hwnd, lprect, berase.toLong())).toInt()
}

public fun InvalidateRgn(hwnd: HWND, hrgn: HRGN, berase: BOOL): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "InvalidateRgn", longArrayOf(hwnd, hrgn, berase.toLong())).toInt()
}

public fun InvertRect(hdc: HDC, lprc: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "InvertRect", longArrayOf(hdc, lprc)).toInt()
}

public fun InvertRgn(hdc: HDC, hrgn: HRGN): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "InvertRgn", longArrayOf(hdc, hrgn)).toInt()
}

public fun IsRectEmpty(lprc: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IsRectEmpty", longArrayOf(lprc)).toInt()
}

public fun LPtoDP(hdc: HDC, lppt: Long, c: Int): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "LPtoDP", longArrayOf(hdc, lppt, c.toLong())).toInt()
}

public fun LineDDA(xstart: Int, ystart: Int, xend: Int, yend: Int, lpproc: LINEDDAPROC, data: LPARAM): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "LineDDA", longArrayOf(xstart.toLong(), ystart.toLong(), xend.toLong(), yend.toLong(), Win32DynamicFfi.objectSlot(lpproc), data)).toInt()
}

public fun LineTo(hdc: HDC, x: Int, y: Int): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "LineTo", longArrayOf(hdc, x.toLong(), y.toLong())).toInt()
}

public fun LoadBitmapA(hinstance: HINSTANCE, lpbitmapname: PCSTR): HBITMAP {
    return Win32DynamicFfi.invoke("user32.dll", "LoadBitmapA", longArrayOf(hinstance, lpbitmapname))
}

public fun LoadBitmapW(hinstance: HINSTANCE, lpbitmapname: PCWSTR): HBITMAP {
    return Win32DynamicFfi.invoke("user32.dll", "LoadBitmapW", longArrayOf(hinstance, lpbitmapname))
}

public fun LockWindowUpdate(hwndlock: HWND): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "LockWindowUpdate", longArrayOf(hwndlock)).toInt()
}

public fun MapWindowPoints(hwndfrom: HWND, hwndto: HWND, lppoints: Long, cpoints: UInt): Int {
    return Win32DynamicFfi.invoke("user32.dll", "MapWindowPoints", longArrayOf(hwndfrom, hwndto, lppoints, cpoints.toLong())).toInt()
}

public fun MaskBlt(hdcdest: HDC, xdest: Int, ydest: Int, width: Int, height: Int, hdcsrc: HDC, xsrc: Int, ysrc: Int, hbmmask: HBITMAP, xmask: Int, ymask: Int, rop: UInt): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "MaskBlt", longArrayOf(hdcdest, xdest.toLong(), ydest.toLong(), width.toLong(), height.toLong(), hdcsrc, xsrc.toLong(), ysrc.toLong(), hbmmask, xmask.toLong(), ymask.toLong(), rop.toLong())).toInt()
}

public fun MergeFontPackage(puchmergefontbuffer: Long, ulmergefontbuffersize: UInt, puchfontpackagebuffer: Long, ulfontpackagebuffersize: UInt, ppuchdestbuffer: Long, puldestbuffersize: Long, pulbyteswritten: Long, usmode: UShort, lpfnallocate: CFP_ALLOCPROC, lpfnreallocate: CFP_REALLOCPROC, lpfnfree: CFP_FREEPROC, lpvreserved: Long): UInt {
    return Win32DynamicFfi.invoke("fontsub.dll", "MergeFontPackage", longArrayOf(puchmergefontbuffer, ulmergefontbuffersize.toLong(), puchfontpackagebuffer, ulfontpackagebuffersize.toLong(), ppuchdestbuffer, puldestbuffersize, pulbyteswritten, usmode.toLong(), Win32DynamicFfi.objectSlot(lpfnallocate), Win32DynamicFfi.objectSlot(lpfnreallocate), Win32DynamicFfi.objectSlot(lpfnfree), lpvreserved)).toUInt()
}

public fun ModifyWorldTransform(hdc: HDC, lpxf: Long, mode: MODIFY_WORLD_TRANSFORM_MODE): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "ModifyWorldTransform", longArrayOf(hdc, lpxf, mode.toLong())).toInt()
}

public fun MonitorFromPoint(pt: POINT, dwflags: MONITOR_FROM_FLAGS): HMONITOR {
    return Win32DynamicFfi.invoke("user32.dll", "MonitorFromPoint", longArrayOf(((pt.x.toLong() and 0xFFFF_FFFFL) or ((pt.y.toLong() and 0xFFFF_FFFFL) shl 32)), dwflags.toLong()))
}

public fun MonitorFromRect(lprc: Long, dwflags: MONITOR_FROM_FLAGS): HMONITOR {
    return Win32DynamicFfi.invoke("user32.dll", "MonitorFromRect", longArrayOf(lprc, dwflags.toLong()))
}

public fun MonitorFromWindow(hwnd: HWND, dwflags: MONITOR_FROM_FLAGS): HMONITOR {
    return Win32DynamicFfi.invoke("user32.dll", "MonitorFromWindow", longArrayOf(hwnd, dwflags.toLong()))
}

public fun MoveToEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "MoveToEx", longArrayOf(hdc, x.toLong(), y.toLong(), lppt)).toInt()
}

public fun OffsetClipRgn(hdc: HDC, x: Int, y: Int): GDI_REGION_TYPE {
    return Win32DynamicFfi.invoke("gdi32.dll", "OffsetClipRgn", longArrayOf(hdc, x.toLong(), y.toLong())).toInt()
}

public fun OffsetRect(lprc: Long, dx: Int, dy: Int): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "OffsetRect", longArrayOf(lprc, dx.toLong(), dy.toLong())).toInt()
}

public fun OffsetRgn(hrgn: HRGN, x: Int, y: Int): GDI_REGION_TYPE {
    return Win32DynamicFfi.invoke("gdi32.dll", "OffsetRgn", longArrayOf(hrgn, x.toLong(), y.toLong())).toInt()
}

public fun OffsetViewportOrgEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "OffsetViewportOrgEx", longArrayOf(hdc, x.toLong(), y.toLong(), lppt)).toInt()
}

public fun OffsetWindowOrgEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "OffsetWindowOrgEx", longArrayOf(hdc, x.toLong(), y.toLong(), lppt)).toInt()
}

public fun PaintDesktop(hdc: HDC): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "PaintDesktop", longArrayOf(hdc)).toInt()
}

public fun PaintRgn(hdc: HDC, hrgn: HRGN): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "PaintRgn", longArrayOf(hdc, hrgn)).toInt()
}

public fun PatBlt(hdc: HDC, x: Int, y: Int, w: Int, h: Int, rop: ROP_CODE): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "PatBlt", longArrayOf(hdc, x.toLong(), y.toLong(), w.toLong(), h.toLong(), rop.toLong())).toInt()
}

public fun PathToRegion(hdc: HDC): HRGN {
    return Win32DynamicFfi.invoke("gdi32.dll", "PathToRegion", longArrayOf(hdc))
}

public fun Pie(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "Pie", longArrayOf(hdc, left.toLong(), top.toLong(), right.toLong(), bottom.toLong(), xr1.toLong(), yr1.toLong(), xr2.toLong(), yr2.toLong())).toInt()
}

public fun PlayEnhMetaFile(hdc: HDC, hmf: HENHMETAFILE, lprect: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "PlayEnhMetaFile", longArrayOf(hdc, hmf, lprect)).toInt()
}

public fun PlayEnhMetaFileRecord(hdc: HDC, pht: Long, pmr: Long, cht: UInt): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "PlayEnhMetaFileRecord", longArrayOf(hdc, pht, pmr, cht.toLong())).toInt()
}

public fun PlayMetaFile(hdc: HDC, hmf: HMETAFILE): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "PlayMetaFile", longArrayOf(hdc, hmf)).toInt()
}

public fun PlayMetaFileRecord(hdc: HDC, lphandletable: Long, lpmr: Long, noobjs: UInt): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "PlayMetaFileRecord", longArrayOf(hdc, lphandletable, lpmr, noobjs.toLong())).toInt()
}

public fun PlgBlt(hdcdest: HDC, lppoint: Long, hdcsrc: HDC, xsrc: Int, ysrc: Int, width: Int, height: Int, hbmmask: HBITMAP, xmask: Int, ymask: Int): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "PlgBlt", longArrayOf(hdcdest, lppoint, hdcsrc, xsrc.toLong(), ysrc.toLong(), width.toLong(), height.toLong(), hbmmask, xmask.toLong(), ymask.toLong())).toInt()
}

public fun PolyBezier(hdc: HDC, apt: Long, cpt: UInt): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "PolyBezier", longArrayOf(hdc, apt, cpt.toLong())).toInt()
}

public fun PolyBezierTo(hdc: HDC, apt: Long, cpt: UInt): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "PolyBezierTo", longArrayOf(hdc, apt, cpt.toLong())).toInt()
}

public fun PolyDraw(hdc: HDC, apt: Long, aj: Long, cpt: Int): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "PolyDraw", longArrayOf(hdc, apt, aj, cpt.toLong())).toInt()
}

public fun PolyPolygon(hdc: HDC, apt: Long, asz: Long, csz: Int): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "PolyPolygon", longArrayOf(hdc, apt, asz, csz.toLong())).toInt()
}

public fun PolyPolyline(hdc: HDC, apt: Long, asz: Long, csz: UInt): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "PolyPolyline", longArrayOf(hdc, apt, asz, csz.toLong())).toInt()
}

public fun PolyTextOutA(hdc: HDC, ppt: Long, nstrings: Int): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "PolyTextOutA", longArrayOf(hdc, ppt, nstrings.toLong())).toInt()
}

public fun PolyTextOutW(hdc: HDC, ppt: Long, nstrings: Int): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "PolyTextOutW", longArrayOf(hdc, ppt, nstrings.toLong())).toInt()
}

public fun Polygon(hdc: HDC, apt: Long, cpt: Int): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "Polygon", longArrayOf(hdc, apt, cpt.toLong())).toInt()
}

public fun Polyline(hdc: HDC, apt: Long, cpt: Int): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "Polyline", longArrayOf(hdc, apt, cpt.toLong())).toInt()
}

public fun PolylineTo(hdc: HDC, apt: Long, cpt: UInt): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "PolylineTo", longArrayOf(hdc, apt, cpt.toLong())).toInt()
}

public fun PtInRect(lprc: Long, pt: POINT): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "PtInRect", longArrayOf(lprc, ((pt.x.toLong() and 0xFFFF_FFFFL) or ((pt.y.toLong() and 0xFFFF_FFFFL) shl 32)))).toInt()
}

public fun PtInRegion(hrgn: HRGN, x: Int, y: Int): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "PtInRegion", longArrayOf(hrgn, x.toLong(), y.toLong())).toInt()
}

public fun PtVisible(hdc: HDC, x: Int, y: Int): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "PtVisible", longArrayOf(hdc, x.toLong(), y.toLong())).toInt()
}

public fun RealizePalette(hdc: HDC): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "RealizePalette", longArrayOf(hdc)).toUInt()
}

public fun RectInRegion(hrgn: HRGN, lprect: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "RectInRegion", longArrayOf(hrgn, lprect)).toInt()
}

public fun RectVisible(hdc: HDC, lprect: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "RectVisible", longArrayOf(hdc, lprect)).toInt()
}

public fun Rectangle(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "Rectangle", longArrayOf(hdc, left.toLong(), top.toLong(), right.toLong(), bottom.toLong())).toInt()
}

public fun RedrawWindow(hwnd: HWND, lprcupdate: Long, hrgnupdate: HRGN, flags: REDRAW_WINDOW_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "RedrawWindow", longArrayOf(hwnd, lprcupdate, hrgnupdate, flags.toLong())).toInt()
}

public fun ReleaseDC(hwnd: HWND, hdc: HDC): Int {
    return Win32DynamicFfi.invoke("user32.dll", "ReleaseDC", longArrayOf(hwnd, hdc)).toInt()
}

public fun RemoveFontMemResourceEx(h: HANDLE): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "RemoveFontMemResourceEx", longArrayOf(h)).toInt()
}

public fun RemoveFontResourceA(lpfilename: PCSTR): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "RemoveFontResourceA", longArrayOf(lpfilename)).toInt()
}

public fun RemoveFontResourceExA(name: PCSTR, fl: UInt, pdv: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "RemoveFontResourceExA", longArrayOf(name, fl.toLong(), pdv)).toInt()
}

public fun RemoveFontResourceExW(name: PCWSTR, fl: UInt, pdv: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "RemoveFontResourceExW", longArrayOf(name, fl.toLong(), pdv)).toInt()
}

public fun RemoveFontResourceW(lpfilename: PCWSTR): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "RemoveFontResourceW", longArrayOf(lpfilename)).toInt()
}

public fun ResetDCA(hdc: HDC, lpdm: Long): HDC {
    return Win32DynamicFfi.invoke("gdi32.dll", "ResetDCA", longArrayOf(hdc, lpdm))
}

public fun ResetDCW(hdc: HDC, lpdm: Long): HDC {
    return Win32DynamicFfi.invoke("gdi32.dll", "ResetDCW", longArrayOf(hdc, lpdm))
}

public fun ResizePalette(hpal: HPALETTE, n: UInt): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "ResizePalette", longArrayOf(hpal, n.toLong())).toInt()
}

public fun RestoreDC(hdc: HDC, nsaveddc: Int): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "RestoreDC", longArrayOf(hdc, nsaveddc.toLong())).toInt()
}

public fun RoundRect(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int, width: Int, height: Int): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "RoundRect", longArrayOf(hdc, left.toLong(), top.toLong(), right.toLong(), bottom.toLong(), width.toLong(), height.toLong())).toInt()
}

public fun SaveDC(hdc: HDC): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "SaveDC", longArrayOf(hdc)).toInt()
}

public fun ScaleViewportExtEx(hdc: HDC, xn: Int, dx: Int, yn: Int, yd: Int, lpsz: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "ScaleViewportExtEx", longArrayOf(hdc, xn.toLong(), dx.toLong(), yn.toLong(), yd.toLong(), lpsz)).toInt()
}

public fun ScaleWindowExtEx(hdc: HDC, xn: Int, xd: Int, yn: Int, yd: Int, lpsz: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "ScaleWindowExtEx", longArrayOf(hdc, xn.toLong(), xd.toLong(), yn.toLong(), yd.toLong(), lpsz)).toInt()
}

public fun ScreenToClient(hwnd: HWND, lppoint: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "ScreenToClient", longArrayOf(hwnd, lppoint)).toInt()
}

public fun SelectClipPath(hdc: HDC, mode: RGN_COMBINE_MODE): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "SelectClipPath", longArrayOf(hdc, mode.toLong())).toInt()
}

public fun SelectClipRgn(hdc: HDC, hrgn: HRGN): GDI_REGION_TYPE {
    return Win32DynamicFfi.invoke("gdi32.dll", "SelectClipRgn", longArrayOf(hdc, hrgn)).toInt()
}

public fun SelectObject(hdc: HDC, h: HGDIOBJ): HGDIOBJ {
    return Win32DynamicFfi.invoke("gdi32.dll", "SelectObject", longArrayOf(hdc, h))
}

public fun SelectPalette(hdc: HDC, hpal: HPALETTE, bforcebkgd: BOOL): HPALETTE {
    return Win32DynamicFfi.invoke("gdi32.dll", "SelectPalette", longArrayOf(hdc, hpal, bforcebkgd.toLong()))
}

public fun SetArcDirection(hdc: HDC, dir: ARC_DIRECTION): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetArcDirection", longArrayOf(hdc, dir.toLong())).toInt()
}

public fun SetBitmapBits(hbm: HBITMAP, cb: UInt, pvbits: Long): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetBitmapBits", longArrayOf(hbm, cb.toLong(), pvbits)).toInt()
}

public fun SetBitmapDimensionEx(hbm: HBITMAP, w: Int, h: Int, lpsz: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetBitmapDimensionEx", longArrayOf(hbm, w.toLong(), h.toLong(), lpsz)).toInt()
}

public fun SetBkColor(hdc: HDC, color: COLORREF): COLORREF {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetBkColor", longArrayOf(hdc, color.toLong())).toUInt()
}

public fun SetBkMode(hdc: HDC, mode: Int): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetBkMode", longArrayOf(hdc, mode.toLong())).toInt()
}

public fun SetBoundsRect(hdc: HDC, lprect: Long, flags: SET_BOUNDS_RECT_FLAGS): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetBoundsRect", longArrayOf(hdc, lprect, flags.toLong())).toUInt()
}

public fun SetBrushOrgEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetBrushOrgEx", longArrayOf(hdc, x.toLong(), y.toLong(), lppt)).toInt()
}

public fun SetColorAdjustment(hdc: HDC, lpca: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetColorAdjustment", longArrayOf(hdc, lpca)).toInt()
}

public fun SetDCBrushColor(hdc: HDC, color: COLORREF): COLORREF {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetDCBrushColor", longArrayOf(hdc, color.toLong())).toUInt()
}

public fun SetDCPenColor(hdc: HDC, color: COLORREF): COLORREF {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetDCPenColor", longArrayOf(hdc, color.toLong())).toUInt()
}

public fun SetDIBColorTable(hdc: HDC, istart: UInt, centries: UInt, prgbq: Long): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetDIBColorTable", longArrayOf(hdc, istart.toLong(), centries.toLong(), prgbq)).toUInt()
}

public fun SetDIBits(hdc: HDC, hbm: HBITMAP, start: UInt, clines: UInt, lpbits: Long, lpbmi: Long, coloruse: DIB_USAGE): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetDIBits", longArrayOf(hdc, hbm, start.toLong(), clines.toLong(), lpbits, lpbmi, coloruse.toLong())).toInt()
}

public fun SetDIBitsToDevice(hdc: HDC, xdest: Int, ydest: Int, w: UInt, h: UInt, xsrc: Int, ysrc: Int, startscan: UInt, clines: UInt, lpvbits: Long, lpbmi: Long, coloruse: DIB_USAGE): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetDIBitsToDevice", longArrayOf(hdc, xdest.toLong(), ydest.toLong(), w.toLong(), h.toLong(), xsrc.toLong(), ysrc.toLong(), startscan.toLong(), clines.toLong(), lpvbits, lpbmi, coloruse.toLong())).toInt()
}

public fun SetEnhMetaFileBits(nsize: UInt, pb: Long): HENHMETAFILE {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetEnhMetaFileBits", longArrayOf(nsize.toLong(), pb))
}

public fun SetGraphicsMode(hdc: HDC, imode: GRAPHICS_MODE): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetGraphicsMode", longArrayOf(hdc, imode.toLong())).toInt()
}

public fun SetLayout(hdc: HDC, l: DC_LAYOUT): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetLayout", longArrayOf(hdc, l.toLong())).toUInt()
}

public fun SetMapMode(hdc: HDC, imode: HDC_MAP_MODE): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetMapMode", longArrayOf(hdc, imode.toLong())).toInt()
}

public fun SetMapperFlags(hdc: HDC, flags: UInt): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetMapperFlags", longArrayOf(hdc, flags.toLong())).toUInt()
}

public fun SetMetaFileBitsEx(cbbuffer: UInt, lpdata: Long): HMETAFILE {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetMetaFileBitsEx", longArrayOf(cbbuffer.toLong(), lpdata))
}

public fun SetMetaRgn(hdc: HDC): GDI_REGION_TYPE {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetMetaRgn", longArrayOf(hdc)).toInt()
}

public fun SetMiterLimit(hdc: HDC, limit: Float, old: Long): BOOL {
    return Win32DynamicFfi.invokeFp("gdi32.dll", "SetMiterLimit", 4, false, longArrayOf(hdc, (limit.toRawBits().toLong() and 0xFFFF_FFFFL), old)).toLong().toInt()
}

public fun SetPaletteEntries(hpal: HPALETTE, istart: UInt, centries: UInt, ppalentries: Long): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetPaletteEntries", longArrayOf(hpal, istart.toLong(), centries.toLong(), ppalentries)).toUInt()
}

public fun SetPixel(hdc: HDC, x: Int, y: Int, color: COLORREF): COLORREF {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetPixel", longArrayOf(hdc, x.toLong(), y.toLong(), color.toLong())).toUInt()
}

public fun SetPixelV(hdc: HDC, x: Int, y: Int, color: COLORREF): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetPixelV", longArrayOf(hdc, x.toLong(), y.toLong(), color.toLong())).toInt()
}

public fun SetPolyFillMode(hdc: HDC, mode: CREATE_POLYGON_RGN_MODE): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetPolyFillMode", longArrayOf(hdc, mode.toLong())).toInt()
}

public fun SetROP2(hdc: HDC, rop2: R2_MODE): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetROP2", longArrayOf(hdc, rop2.toLong())).toInt()
}

public fun SetRect(lprc: Long, xleft: Int, ytop: Int, xright: Int, ybottom: Int): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetRect", longArrayOf(lprc, xleft.toLong(), ytop.toLong(), xright.toLong(), ybottom.toLong())).toInt()
}

public fun SetRectEmpty(lprc: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetRectEmpty", longArrayOf(lprc)).toInt()
}

public fun SetRectRgn(hrgn: HRGN, left: Int, top: Int, right: Int, bottom: Int): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetRectRgn", longArrayOf(hrgn, left.toLong(), top.toLong(), right.toLong(), bottom.toLong())).toInt()
}

public fun SetStretchBltMode(hdc: HDC, mode: STRETCH_BLT_MODE): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetStretchBltMode", longArrayOf(hdc, mode.toLong())).toInt()
}

public fun SetSysColors(celements: Int, lpaelements: Long, lpargbvalues: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetSysColors", longArrayOf(celements.toLong(), lpaelements, lpargbvalues)).toInt()
}

public fun SetSystemPaletteUse(hdc: HDC, use: SYSTEM_PALETTE_USE): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetSystemPaletteUse", longArrayOf(hdc, use.toLong())).toUInt()
}

public fun SetTextAlign(hdc: HDC, align: TEXT_ALIGN_OPTIONS): UInt {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetTextAlign", longArrayOf(hdc, align.toLong())).toUInt()
}

public fun SetTextCharacterExtra(hdc: HDC, extra: Int): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetTextCharacterExtra", longArrayOf(hdc, extra.toLong())).toInt()
}

public fun SetTextColor(hdc: HDC, color: COLORREF): COLORREF {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetTextColor", longArrayOf(hdc, color.toLong())).toUInt()
}

public fun SetTextJustification(hdc: HDC, extra: Int, count: Int): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetTextJustification", longArrayOf(hdc, extra.toLong(), count.toLong())).toInt()
}

public fun SetViewportExtEx(hdc: HDC, x: Int, y: Int, lpsz: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetViewportExtEx", longArrayOf(hdc, x.toLong(), y.toLong(), lpsz)).toInt()
}

public fun SetViewportOrgEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetViewportOrgEx", longArrayOf(hdc, x.toLong(), y.toLong(), lppt)).toInt()
}

public fun SetWindowExtEx(hdc: HDC, x: Int, y: Int, lpsz: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetWindowExtEx", longArrayOf(hdc, x.toLong(), y.toLong(), lpsz)).toInt()
}

public fun SetWindowOrgEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetWindowOrgEx", longArrayOf(hdc, x.toLong(), y.toLong(), lppt)).toInt()
}

public fun SetWindowRgn(hwnd: HWND, hrgn: HRGN, bredraw: BOOL): Int {
    return Win32DynamicFfi.invoke("user32.dll", "SetWindowRgn", longArrayOf(hwnd, hrgn, bredraw.toLong())).toInt()
}

public fun SetWorldTransform(hdc: HDC, lpxf: Long): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetWorldTransform", longArrayOf(hdc, lpxf)).toInt()
}

public fun StretchBlt(hdcdest: HDC, xdest: Int, ydest: Int, wdest: Int, hdest: Int, hdcsrc: HDC, xsrc: Int, ysrc: Int, wsrc: Int, hsrc: Int, rop: ROP_CODE): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "StretchBlt", longArrayOf(hdcdest, xdest.toLong(), ydest.toLong(), wdest.toLong(), hdest.toLong(), hdcsrc, xsrc.toLong(), ysrc.toLong(), wsrc.toLong(), hsrc.toLong(), rop.toLong())).toInt()
}

public fun StretchDIBits(hdc: HDC, xdest: Int, ydest: Int, destwidth: Int, destheight: Int, xsrc: Int, ysrc: Int, srcwidth: Int, srcheight: Int, lpbits: Long, lpbmi: Long, iusage: DIB_USAGE, rop: ROP_CODE): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "StretchDIBits", longArrayOf(hdc, xdest.toLong(), ydest.toLong(), destwidth.toLong(), destheight.toLong(), xsrc.toLong(), ysrc.toLong(), srcwidth.toLong(), srcheight.toLong(), lpbits, lpbmi, iusage.toLong(), rop.toLong())).toInt()
}

public fun StrokeAndFillPath(hdc: HDC): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "StrokeAndFillPath", longArrayOf(hdc)).toInt()
}

public fun StrokePath(hdc: HDC): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "StrokePath", longArrayOf(hdc)).toInt()
}

public fun SubtractRect(lprcdst: Long, lprcsrc1: Long, lprcsrc2: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SubtractRect", longArrayOf(lprcdst, lprcsrc1, lprcsrc2)).toInt()
}

public fun TTCharToUnicode(hdc: HDC, puccharcodes: Long, ulcharcodesize: UInt, pusshortcodes: Long, ulshortcodesize: UInt, ulflags: UInt): Int {
    return Win32DynamicFfi.invoke("t2embed.dll", "TTCharToUnicode", longArrayOf(hdc, puccharcodes, ulcharcodesize.toLong(), pusshortcodes, ulshortcodesize.toLong(), ulflags.toLong())).toInt()
}

public fun TTDeleteEmbeddedFont(hfontreference: HANDLE, ulflags: UInt, pulstatus: Long): Int {
    return Win32DynamicFfi.invoke("t2embed.dll", "TTDeleteEmbeddedFont", longArrayOf(hfontreference, ulflags.toLong(), pulstatus)).toInt()
}

public fun TTEmbedFont(hdc: HDC, ulflags: TTEMBED_FLAGS, ulcharset: EMBED_FONT_CHARSET, pulprivstatus: Long, pulstatus: Long, lpfnwritetostream: WRITEEMBEDPROC, lpvwritestream: Long, puscharcodeset: Long, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: Long): Int {
    return Win32DynamicFfi.invoke("t2embed.dll", "TTEmbedFont", longArrayOf(hdc, ulflags.toLong(), ulcharset.toLong(), pulprivstatus, pulstatus, Win32DynamicFfi.objectSlot(lpfnwritetostream), lpvwritestream, puscharcodeset, uscharcodecount.toLong(), uslanguage.toLong(), pttembedinfo)).toInt()
}

public fun TTEmbedFontEx(hdc: HDC, ulflags: TTEMBED_FLAGS, ulcharset: EMBED_FONT_CHARSET, pulprivstatus: Long, pulstatus: Long, lpfnwritetostream: WRITEEMBEDPROC, lpvwritestream: Long, pulcharcodeset: Long, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: Long): Int {
    return Win32DynamicFfi.invoke("t2embed.dll", "TTEmbedFontEx", longArrayOf(hdc, ulflags.toLong(), ulcharset.toLong(), pulprivstatus, pulstatus, Win32DynamicFfi.objectSlot(lpfnwritetostream), lpvwritestream, pulcharcodeset, uscharcodecount.toLong(), uslanguage.toLong(), pttembedinfo)).toInt()
}

public fun TTEmbedFontFromFileA(hdc: HDC, szfontfilename: PCSTR, usttcindex: UShort, ulflags: TTEMBED_FLAGS, ulcharset: EMBED_FONT_CHARSET, pulprivstatus: Long, pulstatus: Long, lpfnwritetostream: WRITEEMBEDPROC, lpvwritestream: Long, puscharcodeset: Long, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: Long): Int {
    return Win32DynamicFfi.invoke("t2embed.dll", "TTEmbedFontFromFileA", longArrayOf(hdc, szfontfilename, usttcindex.toLong(), ulflags.toLong(), ulcharset.toLong(), pulprivstatus, pulstatus, Win32DynamicFfi.objectSlot(lpfnwritetostream), lpvwritestream, puscharcodeset, uscharcodecount.toLong(), uslanguage.toLong(), pttembedinfo)).toInt()
}

public fun TTEnableEmbeddingForFacename(lpszfacename: PCSTR, benable: BOOL): Int {
    return Win32DynamicFfi.invoke("t2embed.dll", "TTEnableEmbeddingForFacename", longArrayOf(lpszfacename, benable.toLong())).toInt()
}

public fun TTGetEmbeddedFontInfo(ulflags: TTEMBED_FLAGS, pulprivstatus: Long, ulprivs: FONT_LICENSE_PRIVS, pulstatus: Long, lpfnreadfromstream: READEMBEDPROC, lpvreadstream: Long, pttloadinfo: Long): Int {
    return Win32DynamicFfi.invoke("t2embed.dll", "TTGetEmbeddedFontInfo", longArrayOf(ulflags.toLong(), pulprivstatus, ulprivs.toLong(), pulstatus, Win32DynamicFfi.objectSlot(lpfnreadfromstream), lpvreadstream, pttloadinfo)).toInt()
}

public fun TTGetEmbeddingType(hdc: HDC, pulembedtype: Long): Int {
    return Win32DynamicFfi.invoke("t2embed.dll", "TTGetEmbeddingType", longArrayOf(hdc, pulembedtype)).toInt()
}

public fun TTGetNewFontName(phfontreference: Long, wzwinfamilyname: PWSTR, cchmaxwinname: Int, szmacfamilyname: PSTR, cchmaxmacname: Int): Int {
    return Win32DynamicFfi.invoke("t2embed.dll", "TTGetNewFontName", longArrayOf(phfontreference, wzwinfamilyname, cchmaxwinname.toLong(), szmacfamilyname, cchmaxmacname.toLong())).toInt()
}

public fun TTIsEmbeddingEnabled(hdc: HDC, pbenabled: Long): Int {
    return Win32DynamicFfi.invoke("t2embed.dll", "TTIsEmbeddingEnabled", longArrayOf(hdc, pbenabled)).toInt()
}

public fun TTIsEmbeddingEnabledForFacename(lpszfacename: PCSTR, pbenabled: Long): Int {
    return Win32DynamicFfi.invoke("t2embed.dll", "TTIsEmbeddingEnabledForFacename", longArrayOf(lpszfacename, pbenabled)).toInt()
}

public fun TTLoadEmbeddedFont(phfontreference: Long, ulflags: UInt, pulprivstatus: Long, ulprivs: FONT_LICENSE_PRIVS, pulstatus: Long, lpfnreadfromstream: READEMBEDPROC, lpvreadstream: Long, szwinfamilyname: PCWSTR, szmacfamilyname: PCSTR, pttloadinfo: Long): Int {
    return Win32DynamicFfi.invoke("t2embed.dll", "TTLoadEmbeddedFont", longArrayOf(phfontreference, ulflags.toLong(), pulprivstatus, ulprivs.toLong(), pulstatus, Win32DynamicFfi.objectSlot(lpfnreadfromstream), lpvreadstream, szwinfamilyname, szmacfamilyname, pttloadinfo)).toInt()
}

public fun TTRunValidationTests(hdc: HDC, ptestparam: Long): Int {
    return Win32DynamicFfi.invoke("t2embed.dll", "TTRunValidationTests", longArrayOf(hdc, ptestparam)).toInt()
}

public fun TTRunValidationTestsEx(hdc: HDC, ptestparam: Long): Int {
    return Win32DynamicFfi.invoke("t2embed.dll", "TTRunValidationTestsEx", longArrayOf(hdc, ptestparam)).toInt()
}

public fun TabbedTextOutA(hdc: HDC, x: Int, y: Int, lpstring: PCSTR, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long, ntaborigin: Int): Int {
    return Win32DynamicFfi.invoke("user32.dll", "TabbedTextOutA", longArrayOf(hdc, x.toLong(), y.toLong(), lpstring, chcount.toLong(), ntabpositions.toLong(), lpntabstoppositions, ntaborigin.toLong())).toInt()
}

public fun TabbedTextOutW(hdc: HDC, x: Int, y: Int, lpstring: PCWSTR, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long, ntaborigin: Int): Int {
    return Win32DynamicFfi.invoke("user32.dll", "TabbedTextOutW", longArrayOf(hdc, x.toLong(), y.toLong(), lpstring, chcount.toLong(), ntabpositions.toLong(), lpntabstoppositions, ntaborigin.toLong())).toInt()
}

public fun TextOutA(hdc: HDC, x: Int, y: Int, lpstring: PCSTR, c: Int): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "TextOutA", longArrayOf(hdc, x.toLong(), y.toLong(), lpstring, c.toLong())).toInt()
}

public fun TextOutW(hdc: HDC, x: Int, y: Int, lpstring: PCWSTR, c: Int): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "TextOutW", longArrayOf(hdc, x.toLong(), y.toLong(), lpstring, c.toLong())).toInt()
}

public fun TransparentBlt(hdcdest: HDC, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: HDC, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: UInt): BOOL {
    return Win32DynamicFfi.invoke("msimg32.dll", "TransparentBlt", longArrayOf(hdcdest, xorigindest.toLong(), yorigindest.toLong(), wdest.toLong(), hdest.toLong(), hdcsrc, xoriginsrc.toLong(), yoriginsrc.toLong(), wsrc.toLong(), hsrc.toLong(), crtransparent.toLong())).toInt()
}

public fun UnionRect(lprcdst: Long, lprcsrc1: Long, lprcsrc2: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "UnionRect", longArrayOf(lprcdst, lprcsrc1, lprcsrc2)).toInt()
}

public fun UnrealizeObject(h: HGDIOBJ): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "UnrealizeObject", longArrayOf(h)).toInt()
}

public fun UpdateColors(hdc: HDC): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "UpdateColors", longArrayOf(hdc)).toInt()
}

public fun UpdateWindow(hwnd: HWND): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "UpdateWindow", longArrayOf(hwnd)).toInt()
}

public fun ValidateRect(hwnd: HWND, lprect: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "ValidateRect", longArrayOf(hwnd, lprect)).toInt()
}

public fun ValidateRgn(hwnd: HWND, hrgn: HRGN): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "ValidateRgn", longArrayOf(hwnd, hrgn)).toInt()
}

public fun WidenPath(hdc: HDC): BOOL {
    return Win32DynamicFfi.invoke("gdi32.dll", "WidenPath", longArrayOf(hdc)).toInt()
}

public fun WindowFromDC(hdc: HDC): HWND {
    return Win32DynamicFfi.invoke("user32.dll", "WindowFromDC", longArrayOf(hdc))
}

public fun wglSwapMultipleBuffers(param0: UInt, param1: Long): UInt {
    return Win32DynamicFfi.invoke("opengl32.dll", "wglSwapMultipleBuffers", longArrayOf(param0.toLong(), param1)).toUInt()
}
