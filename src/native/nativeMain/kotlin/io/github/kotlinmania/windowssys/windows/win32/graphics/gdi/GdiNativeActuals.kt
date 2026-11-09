@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun AbortPath(hdc: HDC): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_AbortPath(hdc.toCPointer<ByteVar>())

public actual fun AddFontMemResourceEx(pfileview: Long, cjsize: UInt, pvresrved: Long, pnumfonts: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_AddFontMemResourceEx(pfileview.toCPointer<ByteVar>(), cjsize, pvresrved.toCPointer<ByteVar>(), pnumfonts.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun AddFontResourceA(param0: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_AddFontResourceA(param0.toCPointer<ByteVar>())

public actual fun AddFontResourceExA(name: PCSTR, fl: FONT_RESOURCE_CHARACTERISTICS, res: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_AddFontResourceExA(name.toCPointer<ByteVar>(), fl, res.toCPointer<ByteVar>())

public actual fun AddFontResourceExW(name: PCWSTR, fl: FONT_RESOURCE_CHARACTERISTICS, res: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_AddFontResourceExW(name.toCPointer<ByteVar>(), fl, res.toCPointer<ByteVar>())

public actual fun AddFontResourceW(param0: PCWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_AddFontResourceW(param0.toCPointer<ByteVar>())

public actual fun AlphaBlend(hdcdest: HDC, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: HDC, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, ftn: BLENDFUNCTION): BOOL =
    0

public actual fun AngleArc(hdc: HDC, x: Int, y: Int, r: UInt, startangle: Float, sweepangle: Float): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_AngleArc(hdc.toCPointer<ByteVar>(), x, y, r, startangle, sweepangle)

public actual fun AnimatePalette(hpal: HPALETTE, istartindex: UInt, centries: UInt, ppe: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_AnimatePalette(hpal.toCPointer<ByteVar>(), istartindex, centries, ppe.toCPointer<ByteVar>())

public actual fun Arc(hdc: HDC, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_Arc(hdc.toCPointer<ByteVar>(), x1, y1, x2, y2, x3, y3, x4, y4)

public actual fun ArcTo(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_ArcTo(hdc.toCPointer<ByteVar>(), left, top, right, bottom, xr1, yr1, xr2, yr2)

public actual fun BeginPaint(hwnd: HWND, lppaint: Long): HDC =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_BeginPaint(hwnd.toCPointer<ByteVar>(), lppaint.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun BeginPath(hdc: HDC): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_BeginPath(hdc.toCPointer<ByteVar>())

public actual fun BitBlt(hdc: HDC, x: Int, y: Int, cx: Int, cy: Int, hdcsrc: HDC, x1: Int, y1: Int, rop: ROP_CODE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_BitBlt(hdc.toCPointer<ByteVar>(), x, y, cx, cy, hdcsrc.toCPointer<ByteVar>(), x1, y1, rop)

public actual fun CancelDC(hdc: HDC): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CancelDC(hdc.toCPointer<ByteVar>())

public actual fun ChangeDisplaySettingsA(lpdevmode: Long, dwflags: CDS_TYPE): DISP_CHANGE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_ChangeDisplaySettingsA(lpdevmode.toCPointer<ByteVar>(), dwflags)

public actual fun ChangeDisplaySettingsExA(lpszdevicename: PCSTR, lpdevmode: Long, hwnd: HWND, dwflags: CDS_TYPE, lparam: Long): DISP_CHANGE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_ChangeDisplaySettingsExA(lpszdevicename.toCPointer<ByteVar>(), lpdevmode.toCPointer<ByteVar>(), hwnd.toCPointer<ByteVar>(), dwflags, lparam.toCPointer<ByteVar>())

public actual fun ChangeDisplaySettingsExW(lpszdevicename: PCWSTR, lpdevmode: Long, hwnd: HWND, dwflags: CDS_TYPE, lparam: Long): DISP_CHANGE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_ChangeDisplaySettingsExW(lpszdevicename.toCPointer<ByteVar>(), lpdevmode.toCPointer<ByteVar>(), hwnd.toCPointer<ByteVar>(), dwflags, lparam.toCPointer<ByteVar>())

public actual fun ChangeDisplaySettingsW(lpdevmode: Long, dwflags: CDS_TYPE): DISP_CHANGE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_ChangeDisplaySettingsW(lpdevmode.toCPointer<ByteVar>(), dwflags)

public actual fun Chord(hdc: HDC, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_Chord(hdc.toCPointer<ByteVar>(), x1, y1, x2, y2, x3, y3, x4, y4)

public actual fun ClientToScreen(hwnd: HWND, lppoint: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_ClientToScreen(hwnd.toCPointer<ByteVar>(), lppoint.toCPointer<ByteVar>())

public actual fun CloseEnhMetaFile(hdc: HDC): HENHMETAFILE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CloseEnhMetaFile(hdc.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CloseFigure(hdc: HDC): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CloseFigure(hdc.toCPointer<ByteVar>())

public actual fun CloseMetaFile(hdc: HDC): HMETAFILE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CloseMetaFile(hdc.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CombineRgn(hrgndst: HRGN, hrgnsrc1: HRGN, hrgnsrc2: HRGN, imode: RGN_COMBINE_MODE): GDI_REGION_TYPE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CombineRgn(hrgndst.toCPointer<ByteVar>(), hrgnsrc1.toCPointer<ByteVar>(), hrgnsrc2.toCPointer<ByteVar>(), imode)

public actual fun CombineTransform(lpxfout: Long, lpxf1: Long, lpxf2: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CombineTransform(lpxfout.toCPointer<ByteVar>(), lpxf1.toCPointer<ByteVar>(), lpxf2.toCPointer<ByteVar>())

public actual fun CopyEnhMetaFileA(henh: HENHMETAFILE, lpfilename: PCSTR): HENHMETAFILE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CopyEnhMetaFileA(henh.toCPointer<ByteVar>(), lpfilename.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CopyEnhMetaFileW(henh: HENHMETAFILE, lpfilename: PCWSTR): HENHMETAFILE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CopyEnhMetaFileW(henh.toCPointer<ByteVar>(), lpfilename.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CopyMetaFileA(param0: HMETAFILE, param1: PCSTR): HMETAFILE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CopyMetaFileA(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CopyMetaFileW(param0: HMETAFILE, param1: PCWSTR): HMETAFILE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CopyMetaFileW(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CopyRect(lprcdst: Long, lprcsrc: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CopyRect(lprcdst.toCPointer<ByteVar>(), lprcsrc.toCPointer<ByteVar>())

public actual fun CreateBitmap(nwidth: Int, nheight: Int, nplanes: UInt, nbitcount: UInt, lpbits: Long): HBITMAP =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateBitmap(nwidth, nheight, nplanes, nbitcount, lpbits.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateBitmapIndirect(pbm: Long): HBITMAP =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateBitmapIndirect(pbm.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateBrushIndirect(plbrush: Long): HBRUSH =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateBrushIndirect(plbrush.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateCompatibleBitmap(hdc: HDC, cx: Int, cy: Int): HBITMAP =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateCompatibleBitmap(hdc.toCPointer<ByteVar>(), cx, cy)?.toLong() ?: 0L

public actual fun CreateCompatibleDC(hdc: HDC): HDC =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateCompatibleDC(hdc.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateDCA(pwszdriver: PCSTR, pwszdevice: PCSTR, pszport: PCSTR, pdm: Long): HDC =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateDCA(pwszdriver.toCPointer<ByteVar>(), pwszdevice.toCPointer<ByteVar>(), pszport.toCPointer<ByteVar>(), pdm.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateDCW(pwszdriver: PCWSTR, pwszdevice: PCWSTR, pszport: PCWSTR, pdm: Long): HDC =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateDCW(pwszdriver.toCPointer<ByteVar>(), pwszdevice.toCPointer<ByteVar>(), pszport.toCPointer<ByteVar>(), pdm.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateDIBPatternBrush(h: HGLOBAL, iusage: DIB_USAGE): HBRUSH =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateDIBPatternBrush(h.toCPointer<ByteVar>(), iusage)?.toLong() ?: 0L

public actual fun CreateDIBPatternBrushPt(lppackeddib: Long, iusage: DIB_USAGE): HBRUSH =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateDIBPatternBrushPt(lppackeddib.toCPointer<ByteVar>(), iusage)?.toLong() ?: 0L

public actual fun CreateDIBSection(hdc: HDC, pbmi: Long, usage: DIB_USAGE, ppvbits: Long, hsection: HANDLE, offset: UInt): HBITMAP =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateDIBSection(hdc.toCPointer<ByteVar>(), pbmi.toCPointer<ByteVar>(), usage, ppvbits.toCPointer<ByteVar>(), hsection.toCPointer<ByteVar>(), offset)?.toLong() ?: 0L

public actual fun CreateDIBitmap(hdc: HDC, pbmih: Long, flinit: UInt, pjbits: Long, pbmi: Long, iusage: DIB_USAGE): HBITMAP =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateDIBitmap(hdc.toCPointer<ByteVar>(), pbmih.toCPointer<ByteVar>(), flinit, pjbits.toCPointer<ByteVar>(), pbmi.toCPointer<ByteVar>(), iusage)?.toLong() ?: 0L

public actual fun CreateDiscardableBitmap(hdc: HDC, cx: Int, cy: Int): HBITMAP =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateDiscardableBitmap(hdc.toCPointer<ByteVar>(), cx, cy)?.toLong() ?: 0L

public actual fun CreateEllipticRgn(x1: Int, y1: Int, x2: Int, y2: Int): HRGN =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateEllipticRgn(x1, y1, x2, y2)?.toLong() ?: 0L

public actual fun CreateEllipticRgnIndirect(lprect: Long): HRGN =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateEllipticRgnIndirect(lprect.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateEnhMetaFileA(hdc: HDC, lpfilename: PCSTR, lprc: Long, lpdesc: PCSTR): HDC =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateEnhMetaFileA(hdc.toCPointer<ByteVar>(), lpfilename.toCPointer<ByteVar>(), lprc.toCPointer<ByteVar>(), lpdesc.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateEnhMetaFileW(hdc: HDC, lpfilename: PCWSTR, lprc: Long, lpdesc: PCWSTR): HDC =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateEnhMetaFileW(hdc.toCPointer<ByteVar>(), lpfilename.toCPointer<ByteVar>(), lprc.toCPointer<ByteVar>(), lpdesc.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateFontA(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: UInt, bunderline: UInt, bstrikeout: UInt, icharset: UInt, ioutprecision: UInt, iclipprecision: UInt, iquality: UInt, ipitchandfamily: UInt, pszfacename: PCSTR): HFONT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateFontA(cheight, cwidth, cescapement, corientation, cweight, bitalic, bunderline, bstrikeout, icharset, ioutprecision, iclipprecision, iquality, ipitchandfamily, pszfacename.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateFontIndirectA(lplf: Long): HFONT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateFontIndirectA(lplf.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateFontIndirectExA(param0: Long): HFONT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateFontIndirectExA(param0.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateFontIndirectExW(param0: Long): HFONT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateFontIndirectExW(param0.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateFontIndirectW(lplf: Long): HFONT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateFontIndirectW(lplf.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateFontPackage(puchsrcbuffer: Long, ulsrcbuffersize: UInt, ppuchfontpackagebuffer: Long, pulfontpackagebuffersize: Long, pulbyteswritten: Long, usflag: UShort, usttcindex: UShort, ussubsetformat: UShort, ussubsetlanguage: UShort, ussubsetplatform: CREATE_FONT_PACKAGE_SUBSET_PLATFORM, ussubsetencoding: CREATE_FONT_PACKAGE_SUBSET_ENCODING, pussubsetkeeplist: Long, ussubsetlistcount: UShort, lpfnallocate: CFP_ALLOCPROC, lpfnreallocate: CFP_REALLOCPROC, lpfnfree: CFP_FREEPROC, lpvreserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateFontPackage(puchsrcbuffer.toCPointer<ByteVar>(), ulsrcbuffersize, ppuchfontpackagebuffer.toCPointer<ByteVar>(), pulfontpackagebuffersize.toCPointer<ByteVar>(), pulbyteswritten.toCPointer<ByteVar>(), usflag, usttcindex, ussubsetformat, ussubsetlanguage, ussubsetplatform, ussubsetencoding, pussubsetkeeplist.toCPointer<ByteVar>(), ussubsetlistcount, lpfnallocate.toLong().toCPointer<ByteVar>(), lpfnreallocate.toLong().toCPointer<ByteVar>(), lpfnfree.toLong().toCPointer<ByteVar>(), lpvreserved.toCPointer<ByteVar>())

public actual fun CreateFontW(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: UInt, bunderline: UInt, bstrikeout: UInt, icharset: UInt, ioutprecision: UInt, iclipprecision: UInt, iquality: UInt, ipitchandfamily: UInt, pszfacename: PCWSTR): HFONT =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateFontW(cheight, cwidth, cescapement, corientation, cweight, bitalic, bunderline, bstrikeout, icharset, ioutprecision, iclipprecision, iquality, ipitchandfamily, pszfacename.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateHalftonePalette(hdc: HDC): HPALETTE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateHalftonePalette(hdc.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateHatchBrush(ihatch: HATCH_BRUSH_STYLE, color: COLORREF): HBRUSH =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateHatchBrush(ihatch, color)?.toLong() ?: 0L

public actual fun CreateICA(pszdriver: PCSTR, pszdevice: PCSTR, pszport: PCSTR, pdm: Long): HDC =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateICA(pszdriver.toCPointer<ByteVar>(), pszdevice.toCPointer<ByteVar>(), pszport.toCPointer<ByteVar>(), pdm.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateICW(pszdriver: PCWSTR, pszdevice: PCWSTR, pszport: PCWSTR, pdm: Long): HDC =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateICW(pszdriver.toCPointer<ByteVar>(), pszdevice.toCPointer<ByteVar>(), pszport.toCPointer<ByteVar>(), pdm.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateMetaFileA(pszfile: PCSTR): HDC =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateMetaFileA(pszfile.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateMetaFileW(pszfile: PCWSTR): HDC =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateMetaFileW(pszfile.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreatePalette(plpal: Long): HPALETTE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreatePalette(plpal.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreatePatternBrush(hbm: HBITMAP): HBRUSH =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreatePatternBrush(hbm.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreatePen(istyle: PEN_STYLE, cwidth: Int, color: COLORREF): HPEN =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreatePen(istyle, cwidth, color)?.toLong() ?: 0L

public actual fun CreatePenIndirect(plpen: Long): HPEN =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreatePenIndirect(plpen.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreatePolyPolygonRgn(pptl: Long, pc: Long, cpoly: Int, imode: CREATE_POLYGON_RGN_MODE): HRGN =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreatePolyPolygonRgn(pptl.toCPointer<ByteVar>(), pc.toCPointer<ByteVar>(), cpoly, imode)?.toLong() ?: 0L

public actual fun CreatePolygonRgn(pptl: Long, cpoint: Int, imode: CREATE_POLYGON_RGN_MODE): HRGN =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreatePolygonRgn(pptl.toCPointer<ByteVar>(), cpoint, imode)?.toLong() ?: 0L

public actual fun CreateRectRgn(x1: Int, y1: Int, x2: Int, y2: Int): HRGN =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateRectRgn(x1, y1, x2, y2)?.toLong() ?: 0L

public actual fun CreateRectRgnIndirect(lprect: Long): HRGN =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateRectRgnIndirect(lprect.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CreateRoundRectRgn(x1: Int, y1: Int, x2: Int, y2: Int, w: Int, h: Int): HRGN =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateRoundRectRgn(x1, y1, x2, y2, w, h)?.toLong() ?: 0L

public actual fun CreateScalableFontResourceA(fdwhidden: UInt, lpszfont: PCSTR, lpszfile: PCSTR, lpszpath: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateScalableFontResourceA(fdwhidden, lpszfont.toCPointer<ByteVar>(), lpszfile.toCPointer<ByteVar>(), lpszpath.toCPointer<ByteVar>())

public actual fun CreateScalableFontResourceW(fdwhidden: UInt, lpszfont: PCWSTR, lpszfile: PCWSTR, lpszpath: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateScalableFontResourceW(fdwhidden, lpszfont.toCPointer<ByteVar>(), lpszfile.toCPointer<ByteVar>(), lpszpath.toCPointer<ByteVar>())

public actual fun CreateSolidBrush(color: COLORREF): HBRUSH =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_CreateSolidBrush(color)?.toLong() ?: 0L

public actual fun DPtoLP(hdc: HDC, lppt: Long, c: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_DPtoLP(hdc.toCPointer<ByteVar>(), lppt.toCPointer<ByteVar>(), c)

public actual fun DeleteDC(hdc: HDC): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_DeleteDC(hdc.toCPointer<ByteVar>())

public actual fun DeleteEnhMetaFile(hmf: HENHMETAFILE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_DeleteEnhMetaFile(hmf.toCPointer<ByteVar>())

public actual fun DeleteMetaFile(hmf: HMETAFILE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_DeleteMetaFile(hmf.toCPointer<ByteVar>())

public actual fun DeleteObject(ho: HGDIOBJ): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_DeleteObject(ho.toCPointer<ByteVar>())

public actual fun DrawAnimatedRects(hwnd: HWND, idani: Int, lprcfrom: Long, lprcto: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_DrawAnimatedRects(hwnd.toCPointer<ByteVar>(), idani, lprcfrom.toCPointer<ByteVar>(), lprcto.toCPointer<ByteVar>())

public actual fun DrawCaption(hwnd: HWND, hdc: HDC, lprect: Long, flags: DRAW_CAPTION_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_DrawCaption(hwnd.toCPointer<ByteVar>(), hdc.toCPointer<ByteVar>(), lprect.toCPointer<ByteVar>(), flags)

public actual fun DrawEdge(hdc: HDC, qrc: Long, edge: DRAWEDGE_FLAGS, grfflags: DRAW_EDGE_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_DrawEdge(hdc.toCPointer<ByteVar>(), qrc.toCPointer<ByteVar>(), edge, grfflags)

public actual fun DrawEscape(hdc: HDC, iescape: Int, cjin: Int, lpin: PCSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_DrawEscape(hdc.toCPointer<ByteVar>(), iescape, cjin, lpin.toCPointer<ByteVar>())

public actual fun DrawFocusRect(hdc: HDC, lprc: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_DrawFocusRect(hdc.toCPointer<ByteVar>(), lprc.toCPointer<ByteVar>())

public actual fun DrawFrameControl(param0: HDC, param1: Long, param2: DFC_TYPE, param3: DFCS_STATE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_DrawFrameControl(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2, param3)

public actual fun DrawStateA(hdc: HDC, hbrfore: HBRUSH, qfncallback: DRAWSTATEPROC, ldata: LPARAM, wdata: WPARAM, x: Int, y: Int, cx: Int, cy: Int, uflags: DRAWSTATE_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_DrawStateA(hdc.toCPointer<ByteVar>(), hbrfore.toCPointer<ByteVar>(), qfncallback.toLong().toCPointer<ByteVar>(), ldata, wdata, x, y, cx, cy, uflags)

public actual fun DrawStateW(hdc: HDC, hbrfore: HBRUSH, qfncallback: DRAWSTATEPROC, ldata: LPARAM, wdata: WPARAM, x: Int, y: Int, cx: Int, cy: Int, uflags: DRAWSTATE_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_DrawStateW(hdc.toCPointer<ByteVar>(), hbrfore.toCPointer<ByteVar>(), qfncallback.toLong().toCPointer<ByteVar>(), ldata, wdata, x, y, cx, cy, uflags)

public actual fun DrawTextA(hdc: HDC, lpchtext: PCSTR, cchtext: Int, lprc: Long, format: DRAW_TEXT_FORMAT): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_DrawTextA(hdc.toCPointer<ByteVar>(), lpchtext.toCPointer<ByteVar>(), cchtext, lprc.toCPointer<ByteVar>(), format)

public actual fun DrawTextExA(hdc: HDC, lpchtext: PSTR, cchtext: Int, lprc: Long, format: DRAW_TEXT_FORMAT, lpdtp: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_DrawTextExA(hdc.toCPointer<ByteVar>(), lpchtext.toCPointer<ByteVar>(), cchtext, lprc.toCPointer<ByteVar>(), format, lpdtp.toCPointer<ByteVar>())

public actual fun DrawTextExW(hdc: HDC, lpchtext: PWSTR, cchtext: Int, lprc: Long, format: DRAW_TEXT_FORMAT, lpdtp: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_DrawTextExW(hdc.toCPointer<ByteVar>(), lpchtext.toCPointer<ByteVar>(), cchtext, lprc.toCPointer<ByteVar>(), format, lpdtp.toCPointer<ByteVar>())

public actual fun DrawTextW(hdc: HDC, lpchtext: PCWSTR, cchtext: Int, lprc: Long, format: DRAW_TEXT_FORMAT): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_DrawTextW(hdc.toCPointer<ByteVar>(), lpchtext.toCPointer<ByteVar>(), cchtext, lprc.toCPointer<ByteVar>(), format)

public actual fun Ellipse(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_Ellipse(hdc.toCPointer<ByteVar>(), left, top, right, bottom)

public actual fun EndPaint(hwnd: HWND, lppaint: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_EndPaint(hwnd.toCPointer<ByteVar>(), lppaint.toCPointer<ByteVar>())

public actual fun EndPath(hdc: HDC): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_EndPath(hdc.toCPointer<ByteVar>())

public actual fun EnumDisplayDevicesA(lpdevice: PCSTR, idevnum: UInt, lpdisplaydevice: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_EnumDisplayDevicesA(lpdevice.toCPointer<ByteVar>(), idevnum, lpdisplaydevice.toCPointer<ByteVar>(), dwflags)

public actual fun EnumDisplayDevicesW(lpdevice: PCWSTR, idevnum: UInt, lpdisplaydevice: Long, dwflags: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_EnumDisplayDevicesW(lpdevice.toCPointer<ByteVar>(), idevnum, lpdisplaydevice.toCPointer<ByteVar>(), dwflags)

public actual fun EnumDisplayMonitors(hdc: HDC, lprcclip: Long, lpfnenum: MONITORENUMPROC, dwdata: LPARAM): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_EnumDisplayMonitors(hdc.toCPointer<ByteVar>(), lprcclip.toCPointer<ByteVar>(), lpfnenum.toLong().toCPointer<ByteVar>(), dwdata)

public actual fun EnumDisplaySettingsA(lpszdevicename: PCSTR, imodenum: ENUM_DISPLAY_SETTINGS_MODE, lpdevmode: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_EnumDisplaySettingsA(lpszdevicename.toCPointer<ByteVar>(), imodenum, lpdevmode.toCPointer<ByteVar>())

public actual fun EnumDisplaySettingsExA(lpszdevicename: PCSTR, imodenum: ENUM_DISPLAY_SETTINGS_MODE, lpdevmode: Long, dwflags: ENUM_DISPLAY_SETTINGS_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_EnumDisplaySettingsExA(lpszdevicename.toCPointer<ByteVar>(), imodenum, lpdevmode.toCPointer<ByteVar>(), dwflags)

public actual fun EnumDisplaySettingsExW(lpszdevicename: PCWSTR, imodenum: ENUM_DISPLAY_SETTINGS_MODE, lpdevmode: Long, dwflags: ENUM_DISPLAY_SETTINGS_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_EnumDisplaySettingsExW(lpszdevicename.toCPointer<ByteVar>(), imodenum, lpdevmode.toCPointer<ByteVar>(), dwflags)

public actual fun EnumDisplaySettingsW(lpszdevicename: PCWSTR, imodenum: ENUM_DISPLAY_SETTINGS_MODE, lpdevmode: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_EnumDisplaySettingsW(lpszdevicename.toCPointer<ByteVar>(), imodenum, lpdevmode.toCPointer<ByteVar>())

public actual fun EnumEnhMetaFile(hdc: HDC, hmf: HENHMETAFILE, proc: ENHMFENUMPROC, param3: Long, lprect: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_EnumEnhMetaFile(hdc.toCPointer<ByteVar>(), hmf.toCPointer<ByteVar>(), proc.toLong().toCPointer<ByteVar>(), param3.toCPointer<ByteVar>(), lprect.toCPointer<ByteVar>())

public actual fun EnumFontFamiliesA(hdc: HDC, lplogfont: PCSTR, lpproc: FONTENUMPROCA, lparam: LPARAM): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_EnumFontFamiliesA(hdc.toCPointer<ByteVar>(), lplogfont.toCPointer<ByteVar>(), lpproc.toLong().toCPointer<ByteVar>(), lparam)

public actual fun EnumFontFamiliesExA(hdc: HDC, lplogfont: Long, lpproc: FONTENUMPROCA, lparam: LPARAM, dwflags: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_EnumFontFamiliesExA(hdc.toCPointer<ByteVar>(), lplogfont.toCPointer<ByteVar>(), lpproc.toLong().toCPointer<ByteVar>(), lparam, dwflags)

public actual fun EnumFontFamiliesExW(hdc: HDC, lplogfont: Long, lpproc: FONTENUMPROCW, lparam: LPARAM, dwflags: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_EnumFontFamiliesExW(hdc.toCPointer<ByteVar>(), lplogfont.toCPointer<ByteVar>(), lpproc.toLong().toCPointer<ByteVar>(), lparam, dwflags)

public actual fun EnumFontFamiliesW(hdc: HDC, lplogfont: PCWSTR, lpproc: FONTENUMPROCW, lparam: LPARAM): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_EnumFontFamiliesW(hdc.toCPointer<ByteVar>(), lplogfont.toCPointer<ByteVar>(), lpproc.toLong().toCPointer<ByteVar>(), lparam)

public actual fun EnumFontsA(hdc: HDC, lplogfont: PCSTR, lpproc: FONTENUMPROCA, lparam: LPARAM): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_EnumFontsA(hdc.toCPointer<ByteVar>(), lplogfont.toCPointer<ByteVar>(), lpproc.toLong().toCPointer<ByteVar>(), lparam)

public actual fun EnumFontsW(hdc: HDC, lplogfont: PCWSTR, lpproc: FONTENUMPROCW, lparam: LPARAM): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_EnumFontsW(hdc.toCPointer<ByteVar>(), lplogfont.toCPointer<ByteVar>(), lpproc.toLong().toCPointer<ByteVar>(), lparam)

public actual fun EnumMetaFile(hdc: HDC, hmf: HMETAFILE, proc: MFENUMPROC, param3: LPARAM): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_EnumMetaFile(hdc.toCPointer<ByteVar>(), hmf.toCPointer<ByteVar>(), proc.toLong().toCPointer<ByteVar>(), param3)

public actual fun EnumObjects(hdc: HDC, ntype: OBJ_TYPE, lpfunc: GOBJENUMPROC, lparam: LPARAM): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_EnumObjects(hdc.toCPointer<ByteVar>(), ntype, lpfunc.toLong().toCPointer<ByteVar>(), lparam)

public actual fun EqualRect(lprc1: Long, lprc2: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_EqualRect(lprc1.toCPointer<ByteVar>(), lprc2.toCPointer<ByteVar>())

public actual fun EqualRgn(hrgn1: HRGN, hrgn2: HRGN): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_EqualRgn(hrgn1.toCPointer<ByteVar>(), hrgn2.toCPointer<ByteVar>())

public actual fun ExcludeClipRect(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int): GDI_REGION_TYPE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_ExcludeClipRect(hdc.toCPointer<ByteVar>(), left, top, right, bottom)

public actual fun ExcludeUpdateRgn(hdc: HDC, hwnd: HWND): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_ExcludeUpdateRgn(hdc.toCPointer<ByteVar>(), hwnd.toCPointer<ByteVar>())

public actual fun ExtCreatePen(ipenstyle: UInt, cwidth: UInt, plbrush: Long, cstyle: UInt, pstyle: Long): HPEN =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_ExtCreatePen(ipenstyle, cwidth, plbrush.toCPointer<ByteVar>(), cstyle, pstyle.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ExtCreateRegion(lpx: Long, ncount: UInt, lpdata: Long): HRGN =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_ExtCreateRegion(lpx.toCPointer<ByteVar>(), ncount, lpdata.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ExtFloodFill(hdc: HDC, x: Int, y: Int, color: COLORREF, type: EXT_FLOOD_FILL_TYPE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_ExtFloodFill(hdc.toCPointer<ByteVar>(), x, y, color, type)

public actual fun ExtSelectClipRgn(hdc: HDC, hrgn: HRGN, mode: RGN_COMBINE_MODE): GDI_REGION_TYPE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_ExtSelectClipRgn(hdc.toCPointer<ByteVar>(), hrgn.toCPointer<ByteVar>(), mode)

public actual fun ExtTextOutA(hdc: HDC, x: Int, y: Int, options: ETO_OPTIONS, lprect: Long, lpstring: PCSTR, c: UInt, lpdx: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_ExtTextOutA(hdc.toCPointer<ByteVar>(), x, y, options, lprect.toCPointer<ByteVar>(), lpstring.toCPointer<ByteVar>(), c, lpdx.toCPointer<ByteVar>())

public actual fun ExtTextOutW(hdc: HDC, x: Int, y: Int, options: ETO_OPTIONS, lprect: Long, lpstring: PCWSTR, c: UInt, lpdx: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_ExtTextOutW(hdc.toCPointer<ByteVar>(), x, y, options, lprect.toCPointer<ByteVar>(), lpstring.toCPointer<ByteVar>(), c, lpdx.toCPointer<ByteVar>())

public actual fun FillPath(hdc: HDC): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_FillPath(hdc.toCPointer<ByteVar>())

public actual fun FillRect(hdc: HDC, lprc: Long, hbr: HBRUSH): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_FillRect(hdc.toCPointer<ByteVar>(), lprc.toCPointer<ByteVar>(), hbr.toCPointer<ByteVar>())

public actual fun FillRgn(hdc: HDC, hrgn: HRGN, hbr: HBRUSH): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_FillRgn(hdc.toCPointer<ByteVar>(), hrgn.toCPointer<ByteVar>(), hbr.toCPointer<ByteVar>())

public actual fun FixBrushOrgEx(hdc: HDC, x: Int, y: Int, ptl: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_FixBrushOrgEx(hdc.toCPointer<ByteVar>(), x, y, ptl.toCPointer<ByteVar>())

public actual fun FlattenPath(hdc: HDC): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_FlattenPath(hdc.toCPointer<ByteVar>())

public actual fun FloodFill(hdc: HDC, x: Int, y: Int, color: COLORREF): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_FloodFill(hdc.toCPointer<ByteVar>(), x, y, color)

public actual fun FrameRect(hdc: HDC, lprc: Long, hbr: HBRUSH): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_FrameRect(hdc.toCPointer<ByteVar>(), lprc.toCPointer<ByteVar>(), hbr.toCPointer<ByteVar>())

public actual fun FrameRgn(hdc: HDC, hrgn: HRGN, hbr: HBRUSH, w: Int, h: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_FrameRgn(hdc.toCPointer<ByteVar>(), hrgn.toCPointer<ByteVar>(), hbr.toCPointer<ByteVar>(), w, h)

public actual fun GdiAlphaBlend(hdcdest: HDC, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: HDC, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, ftn: BLENDFUNCTION): BOOL =
    0

public actual fun GdiComment(hdc: HDC, nsize: UInt, lpdata: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GdiComment(hdc.toCPointer<ByteVar>(), nsize, lpdata.toCPointer<ByteVar>())

public actual fun GdiFlush(): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GdiFlush()

public actual fun GdiGetBatchLimit(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GdiGetBatchLimit()

public actual fun GdiGradientFill(hdc: HDC, pvertex: Long, nvertex: UInt, pmesh: Long, ncount: UInt, ulmode: GRADIENT_FILL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GdiGradientFill(hdc.toCPointer<ByteVar>(), pvertex.toCPointer<ByteVar>(), nvertex, pmesh.toCPointer<ByteVar>(), ncount, ulmode)

public actual fun GdiSetBatchLimit(dw: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GdiSetBatchLimit(dw)

public actual fun GdiTransparentBlt(hdcdest: HDC, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: HDC, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GdiTransparentBlt(hdcdest.toCPointer<ByteVar>(), xorigindest, yorigindest, wdest, hdest, hdcsrc.toCPointer<ByteVar>(), xoriginsrc, yoriginsrc, wsrc, hsrc, crtransparent)

public actual fun GetArcDirection(hdc: HDC): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetArcDirection(hdc.toCPointer<ByteVar>())

public actual fun GetAspectRatioFilterEx(hdc: HDC, lpsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetAspectRatioFilterEx(hdc.toCPointer<ByteVar>(), lpsize.toCPointer<ByteVar>())

public actual fun GetBitmapBits(hbit: HBITMAP, cb: Int, lpvbits: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetBitmapBits(hbit.toCPointer<ByteVar>(), cb, lpvbits.toCPointer<ByteVar>())

public actual fun GetBitmapDimensionEx(hbit: HBITMAP, lpsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetBitmapDimensionEx(hbit.toCPointer<ByteVar>(), lpsize.toCPointer<ByteVar>())

public actual fun GetBkColor(hdc: HDC): COLORREF =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetBkColor(hdc.toCPointer<ByteVar>())

public actual fun GetBkMode(hdc: HDC): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetBkMode(hdc.toCPointer<ByteVar>())

public actual fun GetBoundsRect(hdc: HDC, lprect: Long, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetBoundsRect(hdc.toCPointer<ByteVar>(), lprect.toCPointer<ByteVar>(), flags)

public actual fun GetBrushOrgEx(hdc: HDC, lppt: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetBrushOrgEx(hdc.toCPointer<ByteVar>(), lppt.toCPointer<ByteVar>())

public actual fun GetCharABCWidthsA(hdc: HDC, wfirst: UInt, wlast: UInt, lpabc: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetCharABCWidthsA(hdc.toCPointer<ByteVar>(), wfirst, wlast, lpabc.toCPointer<ByteVar>())

public actual fun GetCharABCWidthsFloatA(hdc: HDC, ifirst: UInt, ilast: UInt, lpabc: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetCharABCWidthsFloatA(hdc.toCPointer<ByteVar>(), ifirst, ilast, lpabc.toCPointer<ByteVar>())

public actual fun GetCharABCWidthsFloatW(hdc: HDC, ifirst: UInt, ilast: UInt, lpabc: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetCharABCWidthsFloatW(hdc.toCPointer<ByteVar>(), ifirst, ilast, lpabc.toCPointer<ByteVar>())

public actual fun GetCharABCWidthsI(hdc: HDC, gifirst: UInt, cgi: UInt, pgi: Long, pabc: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetCharABCWidthsI(hdc.toCPointer<ByteVar>(), gifirst, cgi, pgi.toCPointer<ByteVar>(), pabc.toCPointer<ByteVar>())

public actual fun GetCharABCWidthsW(hdc: HDC, wfirst: UInt, wlast: UInt, lpabc: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetCharABCWidthsW(hdc.toCPointer<ByteVar>(), wfirst, wlast, lpabc.toCPointer<ByteVar>())

public actual fun GetCharWidth32A(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetCharWidth32A(hdc.toCPointer<ByteVar>(), ifirst, ilast, lpbuffer.toCPointer<ByteVar>())

public actual fun GetCharWidth32W(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetCharWidth32W(hdc.toCPointer<ByteVar>(), ifirst, ilast, lpbuffer.toCPointer<ByteVar>())

public actual fun GetCharWidthA(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetCharWidthA(hdc.toCPointer<ByteVar>(), ifirst, ilast, lpbuffer.toCPointer<ByteVar>())

public actual fun GetCharWidthFloatA(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetCharWidthFloatA(hdc.toCPointer<ByteVar>(), ifirst, ilast, lpbuffer.toCPointer<ByteVar>())

public actual fun GetCharWidthFloatW(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetCharWidthFloatW(hdc.toCPointer<ByteVar>(), ifirst, ilast, lpbuffer.toCPointer<ByteVar>())

public actual fun GetCharWidthI(hdc: HDC, gifirst: UInt, cgi: UInt, pgi: Long, piwidths: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetCharWidthI(hdc.toCPointer<ByteVar>(), gifirst, cgi, pgi.toCPointer<ByteVar>(), piwidths.toCPointer<ByteVar>())

public actual fun GetCharWidthW(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetCharWidthW(hdc.toCPointer<ByteVar>(), ifirst, ilast, lpbuffer.toCPointer<ByteVar>())

public actual fun GetCharacterPlacementA(hdc: HDC, lpstring: PCSTR, ncount: Int, nmexextent: Int, lpresults: Long, dwflags: GET_CHARACTER_PLACEMENT_FLAGS): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetCharacterPlacementA(hdc.toCPointer<ByteVar>(), lpstring.toCPointer<ByteVar>(), ncount, nmexextent, lpresults.toCPointer<ByteVar>(), dwflags)

public actual fun GetCharacterPlacementW(hdc: HDC, lpstring: PCWSTR, ncount: Int, nmexextent: Int, lpresults: Long, dwflags: GET_CHARACTER_PLACEMENT_FLAGS): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetCharacterPlacementW(hdc.toCPointer<ByteVar>(), lpstring.toCPointer<ByteVar>(), ncount, nmexextent, lpresults.toCPointer<ByteVar>(), dwflags)

public actual fun GetClipBox(hdc: HDC, lprect: Long): GDI_REGION_TYPE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetClipBox(hdc.toCPointer<ByteVar>(), lprect.toCPointer<ByteVar>())

public actual fun GetClipRgn(hdc: HDC, hrgn: HRGN): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetClipRgn(hdc.toCPointer<ByteVar>(), hrgn.toCPointer<ByteVar>())

public actual fun GetColorAdjustment(hdc: HDC, lpca: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetColorAdjustment(hdc.toCPointer<ByteVar>(), lpca.toCPointer<ByteVar>())

public actual fun GetCurrentObject(hdc: HDC, type: UInt): HGDIOBJ =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetCurrentObject(hdc.toCPointer<ByteVar>(), type)?.toLong() ?: 0L

public actual fun GetCurrentPositionEx(hdc: HDC, lppt: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetCurrentPositionEx(hdc.toCPointer<ByteVar>(), lppt.toCPointer<ByteVar>())

public actual fun GetDC(hwnd: HWND): HDC =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetDC(hwnd.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun GetDCBrushColor(hdc: HDC): COLORREF =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetDCBrushColor(hdc.toCPointer<ByteVar>())

public actual fun GetDCEx(hwnd: HWND, hrgnclip: HRGN, flags: GET_DCX_FLAGS): HDC =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetDCEx(hwnd.toCPointer<ByteVar>(), hrgnclip.toCPointer<ByteVar>(), flags)?.toLong() ?: 0L

public actual fun GetDCOrgEx(hdc: HDC, lppt: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetDCOrgEx(hdc.toCPointer<ByteVar>(), lppt.toCPointer<ByteVar>())

public actual fun GetDCPenColor(hdc: HDC): COLORREF =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetDCPenColor(hdc.toCPointer<ByteVar>())

public actual fun GetDIBColorTable(hdc: HDC, istart: UInt, centries: UInt, prgbq: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetDIBColorTable(hdc.toCPointer<ByteVar>(), istart, centries, prgbq.toCPointer<ByteVar>())

public actual fun GetDIBits(hdc: HDC, hbm: HBITMAP, start: UInt, clines: UInt, lpvbits: Long, lpbmi: Long, usage: DIB_USAGE): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetDIBits(hdc.toCPointer<ByteVar>(), hbm.toCPointer<ByteVar>(), start, clines, lpvbits.toCPointer<ByteVar>(), lpbmi.toCPointer<ByteVar>(), usage)

public actual fun GetDeviceCaps(hdc: HDC, index: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetDeviceCaps(hdc.toCPointer<ByteVar>(), index)

public actual fun GetEnhMetaFileA(lpname: PCSTR): HENHMETAFILE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetEnhMetaFileA(lpname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun GetEnhMetaFileBits(hemf: HENHMETAFILE, nsize: UInt, lpdata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetEnhMetaFileBits(hemf.toCPointer<ByteVar>(), nsize, lpdata.toCPointer<ByteVar>())

public actual fun GetEnhMetaFileDescriptionA(hemf: HENHMETAFILE, cchbuffer: UInt, lpdescription: PSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetEnhMetaFileDescriptionA(hemf.toCPointer<ByteVar>(), cchbuffer, lpdescription.toCPointer<ByteVar>())

public actual fun GetEnhMetaFileDescriptionW(hemf: HENHMETAFILE, cchbuffer: UInt, lpdescription: PWSTR): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetEnhMetaFileDescriptionW(hemf.toCPointer<ByteVar>(), cchbuffer, lpdescription.toCPointer<ByteVar>())

public actual fun GetEnhMetaFileHeader(hemf: HENHMETAFILE, nsize: UInt, lpenhmetaheader: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetEnhMetaFileHeader(hemf.toCPointer<ByteVar>(), nsize, lpenhmetaheader.toCPointer<ByteVar>())

public actual fun GetEnhMetaFilePaletteEntries(hemf: HENHMETAFILE, nnumentries: UInt, lppaletteentries: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetEnhMetaFilePaletteEntries(hemf.toCPointer<ByteVar>(), nnumentries, lppaletteentries.toCPointer<ByteVar>())

public actual fun GetEnhMetaFileW(lpname: PCWSTR): HENHMETAFILE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetEnhMetaFileW(lpname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun GetFontData(hdc: HDC, dwtable: UInt, dwoffset: UInt, pvbuffer: Long, cjbuffer: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetFontData(hdc.toCPointer<ByteVar>(), dwtable, dwoffset, pvbuffer.toCPointer<ByteVar>(), cjbuffer)

public actual fun GetFontLanguageInfo(hdc: HDC): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetFontLanguageInfo(hdc.toCPointer<ByteVar>())

public actual fun GetFontUnicodeRanges(hdc: HDC, lpgs: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetFontUnicodeRanges(hdc.toCPointer<ByteVar>(), lpgs.toCPointer<ByteVar>())

public actual fun GetGlyphIndicesA(hdc: HDC, lpstr: PCSTR, c: Int, pgi: Long, fl: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetGlyphIndicesA(hdc.toCPointer<ByteVar>(), lpstr.toCPointer<ByteVar>(), c, pgi.toCPointer<ByteVar>(), fl)

public actual fun GetGlyphIndicesW(hdc: HDC, lpstr: PCWSTR, c: Int, pgi: Long, fl: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetGlyphIndicesW(hdc.toCPointer<ByteVar>(), lpstr.toCPointer<ByteVar>(), c, pgi.toCPointer<ByteVar>(), fl)

public actual fun GetGlyphOutlineA(hdc: HDC, uchar: UInt, fuformat: GET_GLYPH_OUTLINE_FORMAT, lpgm: Long, cjbuffer: UInt, pvbuffer: Long, lpmat2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetGlyphOutlineA(hdc.toCPointer<ByteVar>(), uchar, fuformat, lpgm.toCPointer<ByteVar>(), cjbuffer, pvbuffer.toCPointer<ByteVar>(), lpmat2.toCPointer<ByteVar>())

public actual fun GetGlyphOutlineW(hdc: HDC, uchar: UInt, fuformat: GET_GLYPH_OUTLINE_FORMAT, lpgm: Long, cjbuffer: UInt, pvbuffer: Long, lpmat2: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetGlyphOutlineW(hdc.toCPointer<ByteVar>(), uchar, fuformat, lpgm.toCPointer<ByteVar>(), cjbuffer, pvbuffer.toCPointer<ByteVar>(), lpmat2.toCPointer<ByteVar>())

public actual fun GetGraphicsMode(hdc: HDC): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetGraphicsMode(hdc.toCPointer<ByteVar>())

public actual fun GetKerningPairsA(hdc: HDC, npairs: UInt, lpkernpair: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetKerningPairsA(hdc.toCPointer<ByteVar>(), npairs, lpkernpair.toCPointer<ByteVar>())

public actual fun GetKerningPairsW(hdc: HDC, npairs: UInt, lpkernpair: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetKerningPairsW(hdc.toCPointer<ByteVar>(), npairs, lpkernpair.toCPointer<ByteVar>())

public actual fun GetLayout(hdc: HDC): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetLayout(hdc.toCPointer<ByteVar>())

public actual fun GetMapMode(hdc: HDC): HDC_MAP_MODE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetMapMode(hdc.toCPointer<ByteVar>())

public actual fun GetMetaFileA(lpname: PCSTR): HMETAFILE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetMetaFileA(lpname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun GetMetaFileBitsEx(hmf: HMETAFILE, cbbuffer: UInt, lpdata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetMetaFileBitsEx(hmf.toCPointer<ByteVar>(), cbbuffer, lpdata.toCPointer<ByteVar>())

public actual fun GetMetaFileW(lpname: PCWSTR): HMETAFILE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetMetaFileW(lpname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun GetMetaRgn(hdc: HDC, hrgn: HRGN): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetMetaRgn(hdc.toCPointer<ByteVar>(), hrgn.toCPointer<ByteVar>())

public actual fun GetMiterLimit(hdc: HDC, plimit: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetMiterLimit(hdc.toCPointer<ByteVar>(), plimit.toCPointer<ByteVar>())

public actual fun GetMonitorInfoA(hmonitor: HMONITOR, lpmi: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetMonitorInfoA(hmonitor.toCPointer<ByteVar>(), lpmi.toCPointer<ByteVar>())

public actual fun GetMonitorInfoW(hmonitor: HMONITOR, lpmi: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetMonitorInfoW(hmonitor.toCPointer<ByteVar>(), lpmi.toCPointer<ByteVar>())

public actual fun GetNearestColor(hdc: HDC, color: COLORREF): COLORREF =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetNearestColor(hdc.toCPointer<ByteVar>(), color)

public actual fun GetNearestPaletteIndex(h: HPALETTE, color: COLORREF): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetNearestPaletteIndex(h.toCPointer<ByteVar>(), color)

public actual fun GetObjectA(h: HGDIOBJ, c: Int, pv: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetObjectA(h.toCPointer<ByteVar>(), c, pv.toCPointer<ByteVar>())

public actual fun GetObjectType(h: HGDIOBJ): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetObjectType(h.toCPointer<ByteVar>())

public actual fun GetObjectW(h: HGDIOBJ, c: Int, pv: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetObjectW(h.toCPointer<ByteVar>(), c, pv.toCPointer<ByteVar>())

public actual fun GetOutlineTextMetricsA(hdc: HDC, cjcopy: UInt, potm: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetOutlineTextMetricsA(hdc.toCPointer<ByteVar>(), cjcopy, potm.toCPointer<ByteVar>())

public actual fun GetOutlineTextMetricsW(hdc: HDC, cjcopy: UInt, potm: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetOutlineTextMetricsW(hdc.toCPointer<ByteVar>(), cjcopy, potm.toCPointer<ByteVar>())

public actual fun GetPaletteEntries(hpal: HPALETTE, istart: UInt, centries: UInt, ppalentries: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetPaletteEntries(hpal.toCPointer<ByteVar>(), istart, centries, ppalentries.toCPointer<ByteVar>())

public actual fun GetPath(hdc: HDC, apt: Long, aj: Long, cpt: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetPath(hdc.toCPointer<ByteVar>(), apt.toCPointer<ByteVar>(), aj.toCPointer<ByteVar>(), cpt)

public actual fun GetPixel(hdc: HDC, x: Int, y: Int): COLORREF =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetPixel(hdc.toCPointer<ByteVar>(), x, y)

public actual fun GetPolyFillMode(hdc: HDC): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetPolyFillMode(hdc.toCPointer<ByteVar>())

public actual fun GetROP2(hdc: HDC): R2_MODE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetROP2(hdc.toCPointer<ByteVar>())

public actual fun GetRandomRgn(hdc: HDC, hrgn: HRGN, i: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetRandomRgn(hdc.toCPointer<ByteVar>(), hrgn.toCPointer<ByteVar>(), i)

public actual fun GetRasterizerCaps(lpraststat: Long, cjbytes: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetRasterizerCaps(lpraststat.toCPointer<ByteVar>(), cjbytes)

public actual fun GetRegionData(hrgn: HRGN, ncount: UInt, lprgndata: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetRegionData(hrgn.toCPointer<ByteVar>(), ncount, lprgndata.toCPointer<ByteVar>())

public actual fun GetRgnBox(hrgn: HRGN, lprc: Long): GDI_REGION_TYPE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetRgnBox(hrgn.toCPointer<ByteVar>(), lprc.toCPointer<ByteVar>())

public actual fun GetStockObject(i: GET_STOCK_OBJECT_FLAGS): HGDIOBJ =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetStockObject(i)?.toLong() ?: 0L

public actual fun GetStretchBltMode(hdc: HDC): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetStretchBltMode(hdc.toCPointer<ByteVar>())

public actual fun GetSysColor(nindex: SYS_COLOR_INDEX): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetSysColor(nindex)

public actual fun GetSysColorBrush(nindex: SYS_COLOR_INDEX): HBRUSH =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetSysColorBrush(nindex)?.toLong() ?: 0L

public actual fun GetSystemPaletteEntries(hdc: HDC, istart: UInt, centries: UInt, ppalentries: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetSystemPaletteEntries(hdc.toCPointer<ByteVar>(), istart, centries, ppalentries.toCPointer<ByteVar>())

public actual fun GetSystemPaletteUse(hdc: HDC): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetSystemPaletteUse(hdc.toCPointer<ByteVar>())

public actual fun GetTabbedTextExtentA(hdc: HDC, lpstring: PCSTR, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetTabbedTextExtentA(hdc.toCPointer<ByteVar>(), lpstring.toCPointer<ByteVar>(), chcount, ntabpositions, lpntabstoppositions.toCPointer<ByteVar>())

public actual fun GetTabbedTextExtentW(hdc: HDC, lpstring: PCWSTR, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetTabbedTextExtentW(hdc.toCPointer<ByteVar>(), lpstring.toCPointer<ByteVar>(), chcount, ntabpositions, lpntabstoppositions.toCPointer<ByteVar>())

public actual fun GetTextAlign(hdc: HDC): TEXT_ALIGN_OPTIONS =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetTextAlign(hdc.toCPointer<ByteVar>())

public actual fun GetTextCharacterExtra(hdc: HDC): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetTextCharacterExtra(hdc.toCPointer<ByteVar>())

public actual fun GetTextColor(hdc: HDC): COLORREF =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetTextColor(hdc.toCPointer<ByteVar>())

public actual fun GetTextExtentExPointA(hdc: HDC, lpszstring: PCSTR, cchstring: Int, nmaxextent: Int, lpnfit: Long, lpndx: Long, lpsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetTextExtentExPointA(hdc.toCPointer<ByteVar>(), lpszstring.toCPointer<ByteVar>(), cchstring, nmaxextent, lpnfit.toCPointer<ByteVar>(), lpndx.toCPointer<ByteVar>(), lpsize.toCPointer<ByteVar>())

public actual fun GetTextExtentExPointI(hdc: HDC, lpwszstring: Long, cwchstring: Int, nmaxextent: Int, lpnfit: Long, lpndx: Long, lpsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetTextExtentExPointI(hdc.toCPointer<ByteVar>(), lpwszstring.toCPointer<ByteVar>(), cwchstring, nmaxextent, lpnfit.toCPointer<ByteVar>(), lpndx.toCPointer<ByteVar>(), lpsize.toCPointer<ByteVar>())

public actual fun GetTextExtentExPointW(hdc: HDC, lpszstring: PCWSTR, cchstring: Int, nmaxextent: Int, lpnfit: Long, lpndx: Long, lpsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetTextExtentExPointW(hdc.toCPointer<ByteVar>(), lpszstring.toCPointer<ByteVar>(), cchstring, nmaxextent, lpnfit.toCPointer<ByteVar>(), lpndx.toCPointer<ByteVar>(), lpsize.toCPointer<ByteVar>())

public actual fun GetTextExtentPoint32A(hdc: HDC, lpstring: PCSTR, c: Int, psizl: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetTextExtentPoint32A(hdc.toCPointer<ByteVar>(), lpstring.toCPointer<ByteVar>(), c, psizl.toCPointer<ByteVar>())

public actual fun GetTextExtentPoint32W(hdc: HDC, lpstring: PCWSTR, c: Int, psizl: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetTextExtentPoint32W(hdc.toCPointer<ByteVar>(), lpstring.toCPointer<ByteVar>(), c, psizl.toCPointer<ByteVar>())

public actual fun GetTextExtentPointA(hdc: HDC, lpstring: PCSTR, c: Int, lpsz: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetTextExtentPointA(hdc.toCPointer<ByteVar>(), lpstring.toCPointer<ByteVar>(), c, lpsz.toCPointer<ByteVar>())

public actual fun GetTextExtentPointI(hdc: HDC, pgiin: Long, cgi: Int, psize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetTextExtentPointI(hdc.toCPointer<ByteVar>(), pgiin.toCPointer<ByteVar>(), cgi, psize.toCPointer<ByteVar>())

public actual fun GetTextExtentPointW(hdc: HDC, lpstring: PCWSTR, c: Int, lpsz: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetTextExtentPointW(hdc.toCPointer<ByteVar>(), lpstring.toCPointer<ByteVar>(), c, lpsz.toCPointer<ByteVar>())

public actual fun GetTextFaceA(hdc: HDC, c: Int, lpname: PSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetTextFaceA(hdc.toCPointer<ByteVar>(), c, lpname.toCPointer<ByteVar>())

public actual fun GetTextFaceW(hdc: HDC, c: Int, lpname: PWSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetTextFaceW(hdc.toCPointer<ByteVar>(), c, lpname.toCPointer<ByteVar>())

public actual fun GetTextMetricsA(hdc: HDC, lptm: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetTextMetricsA(hdc.toCPointer<ByteVar>(), lptm.toCPointer<ByteVar>())

public actual fun GetTextMetricsW(hdc: HDC, lptm: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetTextMetricsW(hdc.toCPointer<ByteVar>(), lptm.toCPointer<ByteVar>())

public actual fun GetUpdateRect(hwnd: HWND, lprect: Long, berase: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetUpdateRect(hwnd.toCPointer<ByteVar>(), lprect.toCPointer<ByteVar>(), berase)

public actual fun GetUpdateRgn(hwnd: HWND, hrgn: HRGN, berase: BOOL): GDI_REGION_TYPE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetUpdateRgn(hwnd.toCPointer<ByteVar>(), hrgn.toCPointer<ByteVar>(), berase)

public actual fun GetViewportExtEx(hdc: HDC, lpsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetViewportExtEx(hdc.toCPointer<ByteVar>(), lpsize.toCPointer<ByteVar>())

public actual fun GetViewportOrgEx(hdc: HDC, lppoint: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetViewportOrgEx(hdc.toCPointer<ByteVar>(), lppoint.toCPointer<ByteVar>())

public actual fun GetWinMetaFileBits(hemf: HENHMETAFILE, cbdata16: UInt, pdata16: Long, imapmode: Int, hdcref: HDC): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetWinMetaFileBits(hemf.toCPointer<ByteVar>(), cbdata16, pdata16.toCPointer<ByteVar>(), imapmode, hdcref.toCPointer<ByteVar>())

public actual fun GetWindowDC(hwnd: HWND): HDC =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetWindowDC(hwnd.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun GetWindowExtEx(hdc: HDC, lpsize: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetWindowExtEx(hdc.toCPointer<ByteVar>(), lpsize.toCPointer<ByteVar>())

public actual fun GetWindowOrgEx(hdc: HDC, lppoint: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetWindowOrgEx(hdc.toCPointer<ByteVar>(), lppoint.toCPointer<ByteVar>())

public actual fun GetWindowRgn(hwnd: HWND, hrgn: HRGN): GDI_REGION_TYPE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetWindowRgn(hwnd.toCPointer<ByteVar>(), hrgn.toCPointer<ByteVar>())

public actual fun GetWindowRgnBox(hwnd: HWND, lprc: Long): GDI_REGION_TYPE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetWindowRgnBox(hwnd.toCPointer<ByteVar>(), lprc.toCPointer<ByteVar>())

public actual fun GetWorldTransform(hdc: HDC, lpxf: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GetWorldTransform(hdc.toCPointer<ByteVar>(), lpxf.toCPointer<ByteVar>())

public actual fun GradientFill(hdc: HDC, pvertex: Long, nvertex: UInt, pmesh: Long, nmesh: UInt, ulmode: GRADIENT_FILL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GradientFill(hdc.toCPointer<ByteVar>(), pvertex.toCPointer<ByteVar>(), nvertex, pmesh.toCPointer<ByteVar>(), nmesh, ulmode)

public actual fun GrayStringA(hdc: HDC, hbrush: HBRUSH, lpoutputfunc: GRAYSTRINGPROC, lpdata: LPARAM, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GrayStringA(hdc.toCPointer<ByteVar>(), hbrush.toCPointer<ByteVar>(), lpoutputfunc.toLong().toCPointer<ByteVar>(), lpdata, ncount, x, y, nwidth, nheight)

public actual fun GrayStringW(hdc: HDC, hbrush: HBRUSH, lpoutputfunc: GRAYSTRINGPROC, lpdata: LPARAM, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_GrayStringW(hdc.toCPointer<ByteVar>(), hbrush.toCPointer<ByteVar>(), lpoutputfunc.toLong().toCPointer<ByteVar>(), lpdata, ncount, x, y, nwidth, nheight)

public actual fun InflateRect(lprc: Long, dx: Int, dy: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_InflateRect(lprc.toCPointer<ByteVar>(), dx, dy)

public actual fun IntersectClipRect(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int): GDI_REGION_TYPE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_IntersectClipRect(hdc.toCPointer<ByteVar>(), left, top, right, bottom)

public actual fun IntersectRect(lprcdst: Long, lprcsrc1: Long, lprcsrc2: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_IntersectRect(lprcdst.toCPointer<ByteVar>(), lprcsrc1.toCPointer<ByteVar>(), lprcsrc2.toCPointer<ByteVar>())

public actual fun InvalidateRect(hwnd: HWND, lprect: Long, berase: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_InvalidateRect(hwnd.toCPointer<ByteVar>(), lprect.toCPointer<ByteVar>(), berase)

public actual fun InvalidateRgn(hwnd: HWND, hrgn: HRGN, berase: BOOL): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_InvalidateRgn(hwnd.toCPointer<ByteVar>(), hrgn.toCPointer<ByteVar>(), berase)

public actual fun InvertRect(hdc: HDC, lprc: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_InvertRect(hdc.toCPointer<ByteVar>(), lprc.toCPointer<ByteVar>())

public actual fun InvertRgn(hdc: HDC, hrgn: HRGN): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_InvertRgn(hdc.toCPointer<ByteVar>(), hrgn.toCPointer<ByteVar>())

public actual fun IsRectEmpty(lprc: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_IsRectEmpty(lprc.toCPointer<ByteVar>())

public actual fun LPtoDP(hdc: HDC, lppt: Long, c: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_LPtoDP(hdc.toCPointer<ByteVar>(), lppt.toCPointer<ByteVar>(), c)

public actual fun LineDDA(xstart: Int, ystart: Int, xend: Int, yend: Int, lpproc: LINEDDAPROC, data: LPARAM): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_LineDDA(xstart, ystart, xend, yend, lpproc.toLong().toCPointer<ByteVar>(), data)

public actual fun LineTo(hdc: HDC, x: Int, y: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_LineTo(hdc.toCPointer<ByteVar>(), x, y)

public actual fun LoadBitmapA(hinstance: HINSTANCE, lpbitmapname: PCSTR): HBITMAP =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_LoadBitmapA(hinstance.toCPointer<ByteVar>(), lpbitmapname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun LoadBitmapW(hinstance: HINSTANCE, lpbitmapname: PCWSTR): HBITMAP =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_LoadBitmapW(hinstance.toCPointer<ByteVar>(), lpbitmapname.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun LockWindowUpdate(hwndlock: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_LockWindowUpdate(hwndlock.toCPointer<ByteVar>())

public actual fun MapWindowPoints(hwndfrom: HWND, hwndto: HWND, lppoints: Long, cpoints: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_MapWindowPoints(hwndfrom.toCPointer<ByteVar>(), hwndto.toCPointer<ByteVar>(), lppoints.toCPointer<ByteVar>(), cpoints)

public actual fun MaskBlt(hdcdest: HDC, xdest: Int, ydest: Int, width: Int, height: Int, hdcsrc: HDC, xsrc: Int, ysrc: Int, hbmmask: HBITMAP, xmask: Int, ymask: Int, rop: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_MaskBlt(hdcdest.toCPointer<ByteVar>(), xdest, ydest, width, height, hdcsrc.toCPointer<ByteVar>(), xsrc, ysrc, hbmmask.toCPointer<ByteVar>(), xmask, ymask, rop)

public actual fun MergeFontPackage(puchmergefontbuffer: Long, ulmergefontbuffersize: UInt, puchfontpackagebuffer: Long, ulfontpackagebuffersize: UInt, ppuchdestbuffer: Long, puldestbuffersize: Long, pulbyteswritten: Long, usmode: UShort, lpfnallocate: CFP_ALLOCPROC, lpfnreallocate: CFP_REALLOCPROC, lpfnfree: CFP_FREEPROC, lpvreserved: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_MergeFontPackage(puchmergefontbuffer.toCPointer<ByteVar>(), ulmergefontbuffersize, puchfontpackagebuffer.toCPointer<ByteVar>(), ulfontpackagebuffersize, ppuchdestbuffer.toCPointer<ByteVar>(), puldestbuffersize.toCPointer<ByteVar>(), pulbyteswritten.toCPointer<ByteVar>(), usmode, lpfnallocate.toLong().toCPointer<ByteVar>(), lpfnreallocate.toLong().toCPointer<ByteVar>(), lpfnfree.toLong().toCPointer<ByteVar>(), lpvreserved.toCPointer<ByteVar>())

public actual fun ModifyWorldTransform(hdc: HDC, lpxf: Long, mode: MODIFY_WORLD_TRANSFORM_MODE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_ModifyWorldTransform(hdc.toCPointer<ByteVar>(), lpxf.toCPointer<ByteVar>(), mode)

public actual fun MonitorFromPoint(pt: POINT, dwflags: MONITOR_FROM_FLAGS): HMONITOR =
    0L

public actual fun MonitorFromRect(lprc: Long, dwflags: MONITOR_FROM_FLAGS): HMONITOR =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_MonitorFromRect(lprc.toCPointer<ByteVar>(), dwflags)?.toLong() ?: 0L

public actual fun MonitorFromWindow(hwnd: HWND, dwflags: MONITOR_FROM_FLAGS): HMONITOR =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_MonitorFromWindow(hwnd.toCPointer<ByteVar>(), dwflags)?.toLong() ?: 0L

public actual fun MoveToEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_MoveToEx(hdc.toCPointer<ByteVar>(), x, y, lppt.toCPointer<ByteVar>())

public actual fun OffsetClipRgn(hdc: HDC, x: Int, y: Int): GDI_REGION_TYPE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_OffsetClipRgn(hdc.toCPointer<ByteVar>(), x, y)

public actual fun OffsetRect(lprc: Long, dx: Int, dy: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_OffsetRect(lprc.toCPointer<ByteVar>(), dx, dy)

public actual fun OffsetRgn(hrgn: HRGN, x: Int, y: Int): GDI_REGION_TYPE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_OffsetRgn(hrgn.toCPointer<ByteVar>(), x, y)

public actual fun OffsetViewportOrgEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_OffsetViewportOrgEx(hdc.toCPointer<ByteVar>(), x, y, lppt.toCPointer<ByteVar>())

public actual fun OffsetWindowOrgEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_OffsetWindowOrgEx(hdc.toCPointer<ByteVar>(), x, y, lppt.toCPointer<ByteVar>())

public actual fun PaintDesktop(hdc: HDC): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_PaintDesktop(hdc.toCPointer<ByteVar>())

public actual fun PaintRgn(hdc: HDC, hrgn: HRGN): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_PaintRgn(hdc.toCPointer<ByteVar>(), hrgn.toCPointer<ByteVar>())

public actual fun PatBlt(hdc: HDC, x: Int, y: Int, w: Int, h: Int, rop: ROP_CODE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_PatBlt(hdc.toCPointer<ByteVar>(), x, y, w, h, rop)

public actual fun PathToRegion(hdc: HDC): HRGN =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_PathToRegion(hdc.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun Pie(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_Pie(hdc.toCPointer<ByteVar>(), left, top, right, bottom, xr1, yr1, xr2, yr2)

public actual fun PlayEnhMetaFile(hdc: HDC, hmf: HENHMETAFILE, lprect: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_PlayEnhMetaFile(hdc.toCPointer<ByteVar>(), hmf.toCPointer<ByteVar>(), lprect.toCPointer<ByteVar>())

public actual fun PlayEnhMetaFileRecord(hdc: HDC, pht: Long, pmr: Long, cht: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_PlayEnhMetaFileRecord(hdc.toCPointer<ByteVar>(), pht.toCPointer<ByteVar>(), pmr.toCPointer<ByteVar>(), cht)

public actual fun PlayMetaFile(hdc: HDC, hmf: HMETAFILE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_PlayMetaFile(hdc.toCPointer<ByteVar>(), hmf.toCPointer<ByteVar>())

public actual fun PlayMetaFileRecord(hdc: HDC, lphandletable: Long, lpmr: Long, noobjs: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_PlayMetaFileRecord(hdc.toCPointer<ByteVar>(), lphandletable.toCPointer<ByteVar>(), lpmr.toCPointer<ByteVar>(), noobjs)

public actual fun PlgBlt(hdcdest: HDC, lppoint: Long, hdcsrc: HDC, xsrc: Int, ysrc: Int, width: Int, height: Int, hbmmask: HBITMAP, xmask: Int, ymask: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_PlgBlt(hdcdest.toCPointer<ByteVar>(), lppoint.toCPointer<ByteVar>(), hdcsrc.toCPointer<ByteVar>(), xsrc, ysrc, width, height, hbmmask.toCPointer<ByteVar>(), xmask, ymask)

public actual fun PolyBezier(hdc: HDC, apt: Long, cpt: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_PolyBezier(hdc.toCPointer<ByteVar>(), apt.toCPointer<ByteVar>(), cpt)

public actual fun PolyBezierTo(hdc: HDC, apt: Long, cpt: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_PolyBezierTo(hdc.toCPointer<ByteVar>(), apt.toCPointer<ByteVar>(), cpt)

public actual fun PolyDraw(hdc: HDC, apt: Long, aj: Long, cpt: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_PolyDraw(hdc.toCPointer<ByteVar>(), apt.toCPointer<ByteVar>(), aj.toCPointer<ByteVar>(), cpt)

public actual fun PolyPolygon(hdc: HDC, apt: Long, asz: Long, csz: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_PolyPolygon(hdc.toCPointer<ByteVar>(), apt.toCPointer<ByteVar>(), asz.toCPointer<ByteVar>(), csz)

public actual fun PolyPolyline(hdc: HDC, apt: Long, asz: Long, csz: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_PolyPolyline(hdc.toCPointer<ByteVar>(), apt.toCPointer<ByteVar>(), asz.toCPointer<ByteVar>(), csz)

public actual fun PolyTextOutA(hdc: HDC, ppt: Long, nstrings: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_PolyTextOutA(hdc.toCPointer<ByteVar>(), ppt.toCPointer<ByteVar>(), nstrings)

public actual fun PolyTextOutW(hdc: HDC, ppt: Long, nstrings: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_PolyTextOutW(hdc.toCPointer<ByteVar>(), ppt.toCPointer<ByteVar>(), nstrings)

public actual fun Polygon(hdc: HDC, apt: Long, cpt: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_Polygon(hdc.toCPointer<ByteVar>(), apt.toCPointer<ByteVar>(), cpt)

public actual fun Polyline(hdc: HDC, apt: Long, cpt: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_Polyline(hdc.toCPointer<ByteVar>(), apt.toCPointer<ByteVar>(), cpt)

public actual fun PolylineTo(hdc: HDC, apt: Long, cpt: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_PolylineTo(hdc.toCPointer<ByteVar>(), apt.toCPointer<ByteVar>(), cpt)

public actual fun PtInRect(lprc: Long, pt: POINT): BOOL =
    0

public actual fun PtInRegion(hrgn: HRGN, x: Int, y: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_PtInRegion(hrgn.toCPointer<ByteVar>(), x, y)

public actual fun PtVisible(hdc: HDC, x: Int, y: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_PtVisible(hdc.toCPointer<ByteVar>(), x, y)

public actual fun RealizePalette(hdc: HDC): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_RealizePalette(hdc.toCPointer<ByteVar>())

public actual fun RectInRegion(hrgn: HRGN, lprect: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_RectInRegion(hrgn.toCPointer<ByteVar>(), lprect.toCPointer<ByteVar>())

public actual fun RectVisible(hdc: HDC, lprect: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_RectVisible(hdc.toCPointer<ByteVar>(), lprect.toCPointer<ByteVar>())

public actual fun Rectangle(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_Rectangle(hdc.toCPointer<ByteVar>(), left, top, right, bottom)

public actual fun RedrawWindow(hwnd: HWND, lprcupdate: Long, hrgnupdate: HRGN, flags: REDRAW_WINDOW_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_RedrawWindow(hwnd.toCPointer<ByteVar>(), lprcupdate.toCPointer<ByteVar>(), hrgnupdate.toCPointer<ByteVar>(), flags)

public actual fun ReleaseDC(hwnd: HWND, hdc: HDC): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_ReleaseDC(hwnd.toCPointer<ByteVar>(), hdc.toCPointer<ByteVar>())

public actual fun RemoveFontMemResourceEx(h: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_RemoveFontMemResourceEx(h.toCPointer<ByteVar>())

public actual fun RemoveFontResourceA(lpfilename: PCSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_RemoveFontResourceA(lpfilename.toCPointer<ByteVar>())

public actual fun RemoveFontResourceExA(name: PCSTR, fl: UInt, pdv: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_RemoveFontResourceExA(name.toCPointer<ByteVar>(), fl, pdv.toCPointer<ByteVar>())

public actual fun RemoveFontResourceExW(name: PCWSTR, fl: UInt, pdv: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_RemoveFontResourceExW(name.toCPointer<ByteVar>(), fl, pdv.toCPointer<ByteVar>())

public actual fun RemoveFontResourceW(lpfilename: PCWSTR): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_RemoveFontResourceW(lpfilename.toCPointer<ByteVar>())

public actual fun ResetDCA(hdc: HDC, lpdm: Long): HDC =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_ResetDCA(hdc.toCPointer<ByteVar>(), lpdm.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ResetDCW(hdc: HDC, lpdm: Long): HDC =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_ResetDCW(hdc.toCPointer<ByteVar>(), lpdm.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun ResizePalette(hpal: HPALETTE, n: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_ResizePalette(hpal.toCPointer<ByteVar>(), n)

public actual fun RestoreDC(hdc: HDC, nsaveddc: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_RestoreDC(hdc.toCPointer<ByteVar>(), nsaveddc)

public actual fun RoundRect(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int, width: Int, height: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_RoundRect(hdc.toCPointer<ByteVar>(), left, top, right, bottom, width, height)

public actual fun SaveDC(hdc: HDC): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SaveDC(hdc.toCPointer<ByteVar>())

public actual fun ScaleViewportExtEx(hdc: HDC, xn: Int, dx: Int, yn: Int, yd: Int, lpsz: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_ScaleViewportExtEx(hdc.toCPointer<ByteVar>(), xn, dx, yn, yd, lpsz.toCPointer<ByteVar>())

public actual fun ScaleWindowExtEx(hdc: HDC, xn: Int, xd: Int, yn: Int, yd: Int, lpsz: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_ScaleWindowExtEx(hdc.toCPointer<ByteVar>(), xn, xd, yn, yd, lpsz.toCPointer<ByteVar>())

public actual fun ScreenToClient(hwnd: HWND, lppoint: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_ScreenToClient(hwnd.toCPointer<ByteVar>(), lppoint.toCPointer<ByteVar>())

public actual fun SelectClipPath(hdc: HDC, mode: RGN_COMBINE_MODE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SelectClipPath(hdc.toCPointer<ByteVar>(), mode)

public actual fun SelectClipRgn(hdc: HDC, hrgn: HRGN): GDI_REGION_TYPE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SelectClipRgn(hdc.toCPointer<ByteVar>(), hrgn.toCPointer<ByteVar>())

public actual fun SelectObject(hdc: HDC, h: HGDIOBJ): HGDIOBJ =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SelectObject(hdc.toCPointer<ByteVar>(), h.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SelectPalette(hdc: HDC, hpal: HPALETTE, bforcebkgd: BOOL): HPALETTE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SelectPalette(hdc.toCPointer<ByteVar>(), hpal.toCPointer<ByteVar>(), bforcebkgd)?.toLong() ?: 0L

public actual fun SetArcDirection(hdc: HDC, dir: ARC_DIRECTION): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetArcDirection(hdc.toCPointer<ByteVar>(), dir)

public actual fun SetBitmapBits(hbm: HBITMAP, cb: UInt, pvbits: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetBitmapBits(hbm.toCPointer<ByteVar>(), cb, pvbits.toCPointer<ByteVar>())

public actual fun SetBitmapDimensionEx(hbm: HBITMAP, w: Int, h: Int, lpsz: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetBitmapDimensionEx(hbm.toCPointer<ByteVar>(), w, h, lpsz.toCPointer<ByteVar>())

public actual fun SetBkColor(hdc: HDC, color: COLORREF): COLORREF =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetBkColor(hdc.toCPointer<ByteVar>(), color)

public actual fun SetBkMode(hdc: HDC, mode: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetBkMode(hdc.toCPointer<ByteVar>(), mode)

public actual fun SetBoundsRect(hdc: HDC, lprect: Long, flags: SET_BOUNDS_RECT_FLAGS): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetBoundsRect(hdc.toCPointer<ByteVar>(), lprect.toCPointer<ByteVar>(), flags)

public actual fun SetBrushOrgEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetBrushOrgEx(hdc.toCPointer<ByteVar>(), x, y, lppt.toCPointer<ByteVar>())

public actual fun SetColorAdjustment(hdc: HDC, lpca: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetColorAdjustment(hdc.toCPointer<ByteVar>(), lpca.toCPointer<ByteVar>())

public actual fun SetDCBrushColor(hdc: HDC, color: COLORREF): COLORREF =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetDCBrushColor(hdc.toCPointer<ByteVar>(), color)

public actual fun SetDCPenColor(hdc: HDC, color: COLORREF): COLORREF =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetDCPenColor(hdc.toCPointer<ByteVar>(), color)

public actual fun SetDIBColorTable(hdc: HDC, istart: UInt, centries: UInt, prgbq: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetDIBColorTable(hdc.toCPointer<ByteVar>(), istart, centries, prgbq.toCPointer<ByteVar>())

public actual fun SetDIBits(hdc: HDC, hbm: HBITMAP, start: UInt, clines: UInt, lpbits: Long, lpbmi: Long, coloruse: DIB_USAGE): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetDIBits(hdc.toCPointer<ByteVar>(), hbm.toCPointer<ByteVar>(), start, clines, lpbits.toCPointer<ByteVar>(), lpbmi.toCPointer<ByteVar>(), coloruse)

public actual fun SetDIBitsToDevice(hdc: HDC, xdest: Int, ydest: Int, w: UInt, h: UInt, xsrc: Int, ysrc: Int, startscan: UInt, clines: UInt, lpvbits: Long, lpbmi: Long, coloruse: DIB_USAGE): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetDIBitsToDevice(hdc.toCPointer<ByteVar>(), xdest, ydest, w, h, xsrc, ysrc, startscan, clines, lpvbits.toCPointer<ByteVar>(), lpbmi.toCPointer<ByteVar>(), coloruse)

public actual fun SetEnhMetaFileBits(nsize: UInt, pb: Long): HENHMETAFILE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetEnhMetaFileBits(nsize, pb.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SetGraphicsMode(hdc: HDC, imode: GRAPHICS_MODE): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetGraphicsMode(hdc.toCPointer<ByteVar>(), imode)

public actual fun SetLayout(hdc: HDC, l: DC_LAYOUT): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetLayout(hdc.toCPointer<ByteVar>(), l)

public actual fun SetMapMode(hdc: HDC, imode: HDC_MAP_MODE): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetMapMode(hdc.toCPointer<ByteVar>(), imode)

public actual fun SetMapperFlags(hdc: HDC, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetMapperFlags(hdc.toCPointer<ByteVar>(), flags)

public actual fun SetMetaFileBitsEx(cbbuffer: UInt, lpdata: Long): HMETAFILE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetMetaFileBitsEx(cbbuffer, lpdata.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SetMetaRgn(hdc: HDC): GDI_REGION_TYPE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetMetaRgn(hdc.toCPointer<ByteVar>())

public actual fun SetMiterLimit(hdc: HDC, limit: Float, old: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetMiterLimit(hdc.toCPointer<ByteVar>(), limit, old.toCPointer<ByteVar>())

public actual fun SetPaletteEntries(hpal: HPALETTE, istart: UInt, centries: UInt, ppalentries: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetPaletteEntries(hpal.toCPointer<ByteVar>(), istart, centries, ppalentries.toCPointer<ByteVar>())

public actual fun SetPixel(hdc: HDC, x: Int, y: Int, color: COLORREF): COLORREF =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetPixel(hdc.toCPointer<ByteVar>(), x, y, color)

public actual fun SetPixelV(hdc: HDC, x: Int, y: Int, color: COLORREF): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetPixelV(hdc.toCPointer<ByteVar>(), x, y, color)

public actual fun SetPolyFillMode(hdc: HDC, mode: CREATE_POLYGON_RGN_MODE): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetPolyFillMode(hdc.toCPointer<ByteVar>(), mode)

public actual fun SetROP2(hdc: HDC, rop2: R2_MODE): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetROP2(hdc.toCPointer<ByteVar>(), rop2)

public actual fun SetRect(lprc: Long, xleft: Int, ytop: Int, xright: Int, ybottom: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetRect(lprc.toCPointer<ByteVar>(), xleft, ytop, xright, ybottom)

public actual fun SetRectEmpty(lprc: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetRectEmpty(lprc.toCPointer<ByteVar>())

public actual fun SetRectRgn(hrgn: HRGN, left: Int, top: Int, right: Int, bottom: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetRectRgn(hrgn.toCPointer<ByteVar>(), left, top, right, bottom)

public actual fun SetStretchBltMode(hdc: HDC, mode: STRETCH_BLT_MODE): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetStretchBltMode(hdc.toCPointer<ByteVar>(), mode)

public actual fun SetSysColors(celements: Int, lpaelements: Long, lpargbvalues: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetSysColors(celements, lpaelements.toCPointer<ByteVar>(), lpargbvalues.toCPointer<ByteVar>())

public actual fun SetSystemPaletteUse(hdc: HDC, use: SYSTEM_PALETTE_USE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetSystemPaletteUse(hdc.toCPointer<ByteVar>(), use)

public actual fun SetTextAlign(hdc: HDC, align: TEXT_ALIGN_OPTIONS): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetTextAlign(hdc.toCPointer<ByteVar>(), align)

public actual fun SetTextCharacterExtra(hdc: HDC, extra: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetTextCharacterExtra(hdc.toCPointer<ByteVar>(), extra)

public actual fun SetTextColor(hdc: HDC, color: COLORREF): COLORREF =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetTextColor(hdc.toCPointer<ByteVar>(), color)

public actual fun SetTextJustification(hdc: HDC, extra: Int, count: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetTextJustification(hdc.toCPointer<ByteVar>(), extra, count)

public actual fun SetViewportExtEx(hdc: HDC, x: Int, y: Int, lpsz: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetViewportExtEx(hdc.toCPointer<ByteVar>(), x, y, lpsz.toCPointer<ByteVar>())

public actual fun SetViewportOrgEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetViewportOrgEx(hdc.toCPointer<ByteVar>(), x, y, lppt.toCPointer<ByteVar>())

public actual fun SetWindowExtEx(hdc: HDC, x: Int, y: Int, lpsz: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetWindowExtEx(hdc.toCPointer<ByteVar>(), x, y, lpsz.toCPointer<ByteVar>())

public actual fun SetWindowOrgEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetWindowOrgEx(hdc.toCPointer<ByteVar>(), x, y, lppt.toCPointer<ByteVar>())

public actual fun SetWindowRgn(hwnd: HWND, hrgn: HRGN, bredraw: BOOL): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetWindowRgn(hwnd.toCPointer<ByteVar>(), hrgn.toCPointer<ByteVar>(), bredraw)

public actual fun SetWorldTransform(hdc: HDC, lpxf: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SetWorldTransform(hdc.toCPointer<ByteVar>(), lpxf.toCPointer<ByteVar>())

public actual fun StretchBlt(hdcdest: HDC, xdest: Int, ydest: Int, wdest: Int, hdest: Int, hdcsrc: HDC, xsrc: Int, ysrc: Int, wsrc: Int, hsrc: Int, rop: ROP_CODE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_StretchBlt(hdcdest.toCPointer<ByteVar>(), xdest, ydest, wdest, hdest, hdcsrc.toCPointer<ByteVar>(), xsrc, ysrc, wsrc, hsrc, rop)

public actual fun StretchDIBits(hdc: HDC, xdest: Int, ydest: Int, destwidth: Int, destheight: Int, xsrc: Int, ysrc: Int, srcwidth: Int, srcheight: Int, lpbits: Long, lpbmi: Long, iusage: DIB_USAGE, rop: ROP_CODE): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_StretchDIBits(hdc.toCPointer<ByteVar>(), xdest, ydest, destwidth, destheight, xsrc, ysrc, srcwidth, srcheight, lpbits.toCPointer<ByteVar>(), lpbmi.toCPointer<ByteVar>(), iusage, rop)

public actual fun StrokeAndFillPath(hdc: HDC): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_StrokeAndFillPath(hdc.toCPointer<ByteVar>())

public actual fun StrokePath(hdc: HDC): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_StrokePath(hdc.toCPointer<ByteVar>())

public actual fun SubtractRect(lprcdst: Long, lprcsrc1: Long, lprcsrc2: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_SubtractRect(lprcdst.toCPointer<ByteVar>(), lprcsrc1.toCPointer<ByteVar>(), lprcsrc2.toCPointer<ByteVar>())

public actual fun TTCharToUnicode(hdc: HDC, puccharcodes: Long, ulcharcodesize: UInt, pusshortcodes: Long, ulshortcodesize: UInt, ulflags: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_TTCharToUnicode(hdc.toCPointer<ByteVar>(), puccharcodes.toCPointer<ByteVar>(), ulcharcodesize, pusshortcodes.toCPointer<ByteVar>(), ulshortcodesize, ulflags)

public actual fun TTDeleteEmbeddedFont(hfontreference: HANDLE, ulflags: UInt, pulstatus: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_TTDeleteEmbeddedFont(hfontreference.toCPointer<ByteVar>(), ulflags, pulstatus.toCPointer<ByteVar>())

public actual fun TTEmbedFont(hdc: HDC, ulflags: TTEMBED_FLAGS, ulcharset: EMBED_FONT_CHARSET, pulprivstatus: Long, pulstatus: Long, lpfnwritetostream: WRITEEMBEDPROC, lpvwritestream: Long, puscharcodeset: Long, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_TTEmbedFont(hdc.toCPointer<ByteVar>(), ulflags, ulcharset, pulprivstatus.toCPointer<ByteVar>(), pulstatus.toCPointer<ByteVar>(), lpfnwritetostream.toLong().toCPointer<ByteVar>(), lpvwritestream.toCPointer<ByteVar>(), puscharcodeset.toCPointer<ByteVar>(), uscharcodecount, uslanguage, pttembedinfo.toCPointer<ByteVar>())

public actual fun TTEmbedFontEx(hdc: HDC, ulflags: TTEMBED_FLAGS, ulcharset: EMBED_FONT_CHARSET, pulprivstatus: Long, pulstatus: Long, lpfnwritetostream: WRITEEMBEDPROC, lpvwritestream: Long, pulcharcodeset: Long, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_TTEmbedFontEx(hdc.toCPointer<ByteVar>(), ulflags, ulcharset, pulprivstatus.toCPointer<ByteVar>(), pulstatus.toCPointer<ByteVar>(), lpfnwritetostream.toLong().toCPointer<ByteVar>(), lpvwritestream.toCPointer<ByteVar>(), pulcharcodeset.toCPointer<ByteVar>(), uscharcodecount, uslanguage, pttembedinfo.toCPointer<ByteVar>())

public actual fun TTEmbedFontFromFileA(hdc: HDC, szfontfilename: PCSTR, usttcindex: UShort, ulflags: TTEMBED_FLAGS, ulcharset: EMBED_FONT_CHARSET, pulprivstatus: Long, pulstatus: Long, lpfnwritetostream: WRITEEMBEDPROC, lpvwritestream: Long, puscharcodeset: Long, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_TTEmbedFontFromFileA(hdc.toCPointer<ByteVar>(), szfontfilename.toCPointer<ByteVar>(), usttcindex, ulflags, ulcharset, pulprivstatus.toCPointer<ByteVar>(), pulstatus.toCPointer<ByteVar>(), lpfnwritetostream.toLong().toCPointer<ByteVar>(), lpvwritestream.toCPointer<ByteVar>(), puscharcodeset.toCPointer<ByteVar>(), uscharcodecount, uslanguage, pttembedinfo.toCPointer<ByteVar>())

public actual fun TTEnableEmbeddingForFacename(lpszfacename: PCSTR, benable: BOOL): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_TTEnableEmbeddingForFacename(lpszfacename.toCPointer<ByteVar>(), benable)

public actual fun TTGetEmbeddedFontInfo(ulflags: TTEMBED_FLAGS, pulprivstatus: Long, ulprivs: FONT_LICENSE_PRIVS, pulstatus: Long, lpfnreadfromstream: READEMBEDPROC, lpvreadstream: Long, pttloadinfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_TTGetEmbeddedFontInfo(ulflags, pulprivstatus.toCPointer<ByteVar>(), ulprivs, pulstatus.toCPointer<ByteVar>(), lpfnreadfromstream.toLong().toCPointer<ByteVar>(), lpvreadstream.toCPointer<ByteVar>(), pttloadinfo.toCPointer<ByteVar>())

public actual fun TTGetEmbeddingType(hdc: HDC, pulembedtype: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_TTGetEmbeddingType(hdc.toCPointer<ByteVar>(), pulembedtype.toCPointer<ByteVar>())

public actual fun TTGetNewFontName(phfontreference: Long, wzwinfamilyname: PWSTR, cchmaxwinname: Int, szmacfamilyname: PSTR, cchmaxmacname: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_TTGetNewFontName(phfontreference.toCPointer<ByteVar>(), wzwinfamilyname.toCPointer<ByteVar>(), cchmaxwinname, szmacfamilyname.toCPointer<ByteVar>(), cchmaxmacname)

public actual fun TTIsEmbeddingEnabled(hdc: HDC, pbenabled: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_TTIsEmbeddingEnabled(hdc.toCPointer<ByteVar>(), pbenabled.toCPointer<ByteVar>())

public actual fun TTIsEmbeddingEnabledForFacename(lpszfacename: PCSTR, pbenabled: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_TTIsEmbeddingEnabledForFacename(lpszfacename.toCPointer<ByteVar>(), pbenabled.toCPointer<ByteVar>())

public actual fun TTLoadEmbeddedFont(phfontreference: Long, ulflags: UInt, pulprivstatus: Long, ulprivs: FONT_LICENSE_PRIVS, pulstatus: Long, lpfnreadfromstream: READEMBEDPROC, lpvreadstream: Long, szwinfamilyname: PCWSTR, szmacfamilyname: PCSTR, pttloadinfo: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_TTLoadEmbeddedFont(phfontreference.toCPointer<ByteVar>(), ulflags, pulprivstatus.toCPointer<ByteVar>(), ulprivs, pulstatus.toCPointer<ByteVar>(), lpfnreadfromstream.toLong().toCPointer<ByteVar>(), lpvreadstream.toCPointer<ByteVar>(), szwinfamilyname.toCPointer<ByteVar>(), szmacfamilyname.toCPointer<ByteVar>(), pttloadinfo.toCPointer<ByteVar>())

public actual fun TTRunValidationTests(hdc: HDC, ptestparam: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_TTRunValidationTests(hdc.toCPointer<ByteVar>(), ptestparam.toCPointer<ByteVar>())

public actual fun TTRunValidationTestsEx(hdc: HDC, ptestparam: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_TTRunValidationTestsEx(hdc.toCPointer<ByteVar>(), ptestparam.toCPointer<ByteVar>())

public actual fun TabbedTextOutA(hdc: HDC, x: Int, y: Int, lpstring: PCSTR, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long, ntaborigin: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_TabbedTextOutA(hdc.toCPointer<ByteVar>(), x, y, lpstring.toCPointer<ByteVar>(), chcount, ntabpositions, lpntabstoppositions.toCPointer<ByteVar>(), ntaborigin)

public actual fun TabbedTextOutW(hdc: HDC, x: Int, y: Int, lpstring: PCWSTR, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long, ntaborigin: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_TabbedTextOutW(hdc.toCPointer<ByteVar>(), x, y, lpstring.toCPointer<ByteVar>(), chcount, ntabpositions, lpntabstoppositions.toCPointer<ByteVar>(), ntaborigin)

public actual fun TextOutA(hdc: HDC, x: Int, y: Int, lpstring: PCSTR, c: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_TextOutA(hdc.toCPointer<ByteVar>(), x, y, lpstring.toCPointer<ByteVar>(), c)

public actual fun TextOutW(hdc: HDC, x: Int, y: Int, lpstring: PCWSTR, c: Int): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_TextOutW(hdc.toCPointer<ByteVar>(), x, y, lpstring.toCPointer<ByteVar>(), c)

public actual fun TransparentBlt(hdcdest: HDC, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: HDC, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_TransparentBlt(hdcdest.toCPointer<ByteVar>(), xorigindest, yorigindest, wdest, hdest, hdcsrc.toCPointer<ByteVar>(), xoriginsrc, yoriginsrc, wsrc, hsrc, crtransparent)

public actual fun UnionRect(lprcdst: Long, lprcsrc1: Long, lprcsrc2: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_UnionRect(lprcdst.toCPointer<ByteVar>(), lprcsrc1.toCPointer<ByteVar>(), lprcsrc2.toCPointer<ByteVar>())

public actual fun UnrealizeObject(h: HGDIOBJ): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_UnrealizeObject(h.toCPointer<ByteVar>())

public actual fun UpdateColors(hdc: HDC): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_UpdateColors(hdc.toCPointer<ByteVar>())

public actual fun UpdateWindow(hwnd: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_UpdateWindow(hwnd.toCPointer<ByteVar>())

public actual fun ValidateRect(hwnd: HWND, lprect: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_ValidateRect(hwnd.toCPointer<ByteVar>(), lprect.toCPointer<ByteVar>())

public actual fun ValidateRgn(hwnd: HWND, hrgn: HRGN): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_ValidateRgn(hwnd.toCPointer<ByteVar>(), hrgn.toCPointer<ByteVar>())

public actual fun WidenPath(hdc: HDC): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_WidenPath(hdc.toCPointer<ByteVar>())

public actual fun WindowFromDC(hdc: HDC): HWND =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_WindowFromDC(hdc.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun wglSwapMultipleBuffers(param0: UInt, param1: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_wglSwapMultipleBuffers(param0, param1.toCPointer<ByteVar>())
