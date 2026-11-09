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

private val _windowsWin32GraphicsGdiNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun AbortPath(hdc: HDC): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_AbortPath(hdc.toString()) as Int) else 0

public actual fun AddFontMemResourceEx(pfileview: Long, cjsize: UInt, pvresrved: Long, pnumfonts: Long): HANDLE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_AddFontMemResourceEx(pfileview.toString(), cjsize.toInt(), pvresrved.toString(), pnumfonts.toString()) as String).toLong() else 0L

public actual fun AddFontResourceA(param0: PCSTR): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_AddFontResourceA(param0.toString()) as Int) else 0

public actual fun AddFontResourceExA(name: PCSTR, fl: FONT_RESOURCE_CHARACTERISTICS, res: Long): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_AddFontResourceExA(name.toString(), fl.toInt(), res.toString()) as Int) else 0

public actual fun AddFontResourceExW(name: PCWSTR, fl: FONT_RESOURCE_CHARACTERISTICS, res: Long): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_AddFontResourceExW(name.toString(), fl.toInt(), res.toString()) as Int) else 0

public actual fun AddFontResourceW(param0: PCWSTR): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_AddFontResourceW(param0.toString()) as Int) else 0

public actual fun AlphaBlend(hdcdest: HDC, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: HDC, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, ftn: BLENDFUNCTION): BOOL =
    0

public actual fun AngleArc(hdc: HDC, x: Int, y: Int, r: UInt, startangle: Float, sweepangle: Float): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_AngleArc(hdc.toString(), x, y, r.toInt(), startangle.toDouble(), sweepangle.toDouble()) as Int) else 0

public actual fun AnimatePalette(hpal: HPALETTE, istartindex: UInt, centries: UInt, ppe: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_AnimatePalette(hpal.toString(), istartindex.toInt(), centries.toInt(), ppe.toString()) as Int) else 0

public actual fun Arc(hdc: HDC, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_Arc(hdc.toString(), x1, y1, x2, y2, x3, y3, x4, y4) as Int) else 0

public actual fun ArcTo(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_ArcTo(hdc.toString(), left, top, right, bottom, xr1, yr1, xr2, yr2) as Int) else 0

public actual fun BeginPaint(hwnd: HWND, lppaint: Long): HDC =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_BeginPaint(hwnd.toString(), lppaint.toString()) as String).toLong() else 0L

public actual fun BeginPath(hdc: HDC): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_BeginPath(hdc.toString()) as Int) else 0

public actual fun BitBlt(hdc: HDC, x: Int, y: Int, cx: Int, cy: Int, hdcsrc: HDC, x1: Int, y1: Int, rop: ROP_CODE): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_BitBlt(hdc.toString(), x, y, cx, cy, hdcsrc.toString(), x1, y1, rop.toInt()) as Int) else 0

public actual fun CancelDC(hdc: HDC): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CancelDC(hdc.toString()) as Int) else 0

public actual fun ChangeDisplaySettingsA(lpdevmode: Long, dwflags: CDS_TYPE): DISP_CHANGE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_ChangeDisplaySettingsA(lpdevmode.toString(), dwflags.toInt()) as Int) else 0

public actual fun ChangeDisplaySettingsExA(lpszdevicename: PCSTR, lpdevmode: Long, hwnd: HWND, dwflags: CDS_TYPE, lparam: Long): DISP_CHANGE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_ChangeDisplaySettingsExA(lpszdevicename.toString(), lpdevmode.toString(), hwnd.toString(), dwflags.toInt(), lparam.toString()) as Int) else 0

public actual fun ChangeDisplaySettingsExW(lpszdevicename: PCWSTR, lpdevmode: Long, hwnd: HWND, dwflags: CDS_TYPE, lparam: Long): DISP_CHANGE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_ChangeDisplaySettingsExW(lpszdevicename.toString(), lpdevmode.toString(), hwnd.toString(), dwflags.toInt(), lparam.toString()) as Int) else 0

public actual fun ChangeDisplaySettingsW(lpdevmode: Long, dwflags: CDS_TYPE): DISP_CHANGE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_ChangeDisplaySettingsW(lpdevmode.toString(), dwflags.toInt()) as Int) else 0

public actual fun Chord(hdc: HDC, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_Chord(hdc.toString(), x1, y1, x2, y2, x3, y3, x4, y4) as Int) else 0

public actual fun ClientToScreen(hwnd: HWND, lppoint: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_ClientToScreen(hwnd.toString(), lppoint.toString()) as Int) else 0

public actual fun CloseEnhMetaFile(hdc: HDC): HENHMETAFILE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CloseEnhMetaFile(hdc.toString()) as String).toLong() else 0L

public actual fun CloseFigure(hdc: HDC): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CloseFigure(hdc.toString()) as Int) else 0

public actual fun CloseMetaFile(hdc: HDC): HMETAFILE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CloseMetaFile(hdc.toString()) as String).toLong() else 0L

public actual fun CombineRgn(hrgndst: HRGN, hrgnsrc1: HRGN, hrgnsrc2: HRGN, imode: RGN_COMBINE_MODE): GDI_REGION_TYPE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CombineRgn(hrgndst.toString(), hrgnsrc1.toString(), hrgnsrc2.toString(), imode) as Int) else 0

public actual fun CombineTransform(lpxfout: Long, lpxf1: Long, lpxf2: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CombineTransform(lpxfout.toString(), lpxf1.toString(), lpxf2.toString()) as Int) else 0

public actual fun CopyEnhMetaFileA(henh: HENHMETAFILE, lpfilename: PCSTR): HENHMETAFILE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CopyEnhMetaFileA(henh.toString(), lpfilename.toString()) as String).toLong() else 0L

public actual fun CopyEnhMetaFileW(henh: HENHMETAFILE, lpfilename: PCWSTR): HENHMETAFILE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CopyEnhMetaFileW(henh.toString(), lpfilename.toString()) as String).toLong() else 0L

public actual fun CopyMetaFileA(param0: HMETAFILE, param1: PCSTR): HMETAFILE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CopyMetaFileA(param0.toString(), param1.toString()) as String).toLong() else 0L

public actual fun CopyMetaFileW(param0: HMETAFILE, param1: PCWSTR): HMETAFILE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CopyMetaFileW(param0.toString(), param1.toString()) as String).toLong() else 0L

public actual fun CopyRect(lprcdst: Long, lprcsrc: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CopyRect(lprcdst.toString(), lprcsrc.toString()) as Int) else 0

public actual fun CreateBitmap(nwidth: Int, nheight: Int, nplanes: UInt, nbitcount: UInt, lpbits: Long): HBITMAP =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateBitmap(nwidth, nheight, nplanes.toInt(), nbitcount.toInt(), lpbits.toString()) as String).toLong() else 0L

public actual fun CreateBitmapIndirect(pbm: Long): HBITMAP =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateBitmapIndirect(pbm.toString()) as String).toLong() else 0L

public actual fun CreateBrushIndirect(plbrush: Long): HBRUSH =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateBrushIndirect(plbrush.toString()) as String).toLong() else 0L

public actual fun CreateCompatibleBitmap(hdc: HDC, cx: Int, cy: Int): HBITMAP =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateCompatibleBitmap(hdc.toString(), cx, cy) as String).toLong() else 0L

public actual fun CreateCompatibleDC(hdc: HDC): HDC =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateCompatibleDC(hdc.toString()) as String).toLong() else 0L

public actual fun CreateDCA(pwszdriver: PCSTR, pwszdevice: PCSTR, pszport: PCSTR, pdm: Long): HDC =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateDCA(pwszdriver.toString(), pwszdevice.toString(), pszport.toString(), pdm.toString()) as String).toLong() else 0L

public actual fun CreateDCW(pwszdriver: PCWSTR, pwszdevice: PCWSTR, pszport: PCWSTR, pdm: Long): HDC =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateDCW(pwszdriver.toString(), pwszdevice.toString(), pszport.toString(), pdm.toString()) as String).toLong() else 0L

public actual fun CreateDIBPatternBrush(h: HGLOBAL, iusage: DIB_USAGE): HBRUSH =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateDIBPatternBrush(h.toString(), iusage.toInt()) as String).toLong() else 0L

public actual fun CreateDIBPatternBrushPt(lppackeddib: Long, iusage: DIB_USAGE): HBRUSH =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateDIBPatternBrushPt(lppackeddib.toString(), iusage.toInt()) as String).toLong() else 0L

public actual fun CreateDIBSection(hdc: HDC, pbmi: Long, usage: DIB_USAGE, ppvbits: Long, hsection: HANDLE, offset: UInt): HBITMAP =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateDIBSection(hdc.toString(), pbmi.toString(), usage.toInt(), ppvbits.toString(), hsection.toString(), offset.toInt()) as String).toLong() else 0L

public actual fun CreateDIBitmap(hdc: HDC, pbmih: Long, flinit: UInt, pjbits: Long, pbmi: Long, iusage: DIB_USAGE): HBITMAP =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateDIBitmap(hdc.toString(), pbmih.toString(), flinit.toInt(), pjbits.toString(), pbmi.toString(), iusage.toInt()) as String).toLong() else 0L

public actual fun CreateDiscardableBitmap(hdc: HDC, cx: Int, cy: Int): HBITMAP =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateDiscardableBitmap(hdc.toString(), cx, cy) as String).toLong() else 0L

public actual fun CreateEllipticRgn(x1: Int, y1: Int, x2: Int, y2: Int): HRGN =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateEllipticRgn(x1, y1, x2, y2) as String).toLong() else 0L

public actual fun CreateEllipticRgnIndirect(lprect: Long): HRGN =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateEllipticRgnIndirect(lprect.toString()) as String).toLong() else 0L

public actual fun CreateEnhMetaFileA(hdc: HDC, lpfilename: PCSTR, lprc: Long, lpdesc: PCSTR): HDC =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateEnhMetaFileA(hdc.toString(), lpfilename.toString(), lprc.toString(), lpdesc.toString()) as String).toLong() else 0L

public actual fun CreateEnhMetaFileW(hdc: HDC, lpfilename: PCWSTR, lprc: Long, lpdesc: PCWSTR): HDC =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateEnhMetaFileW(hdc.toString(), lpfilename.toString(), lprc.toString(), lpdesc.toString()) as String).toLong() else 0L

public actual fun CreateFontA(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: UInt, bunderline: UInt, bstrikeout: UInt, icharset: UInt, ioutprecision: UInt, iclipprecision: UInt, iquality: UInt, ipitchandfamily: UInt, pszfacename: PCSTR): HFONT =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateFontA(cheight, cwidth, cescapement, corientation, cweight, bitalic.toInt(), bunderline.toInt(), bstrikeout.toInt(), icharset.toInt(), ioutprecision.toInt(), iclipprecision.toInt(), iquality.toInt(), ipitchandfamily.toInt(), pszfacename.toString()) as String).toLong() else 0L

public actual fun CreateFontIndirectA(lplf: Long): HFONT =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateFontIndirectA(lplf.toString()) as String).toLong() else 0L

public actual fun CreateFontIndirectExA(param0: Long): HFONT =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateFontIndirectExA(param0.toString()) as String).toLong() else 0L

public actual fun CreateFontIndirectExW(param0: Long): HFONT =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateFontIndirectExW(param0.toString()) as String).toLong() else 0L

public actual fun CreateFontIndirectW(lplf: Long): HFONT =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateFontIndirectW(lplf.toString()) as String).toLong() else 0L

public actual fun CreateFontPackage(puchsrcbuffer: Long, ulsrcbuffersize: UInt, ppuchfontpackagebuffer: Long, pulfontpackagebuffersize: Long, pulbyteswritten: Long, usflag: UShort, usttcindex: UShort, ussubsetformat: UShort, ussubsetlanguage: UShort, ussubsetplatform: CREATE_FONT_PACKAGE_SUBSET_PLATFORM, ussubsetencoding: CREATE_FONT_PACKAGE_SUBSET_ENCODING, pussubsetkeeplist: Long, ussubsetlistcount: UShort, lpfnallocate: CFP_ALLOCPROC, lpfnreallocate: CFP_REALLOCPROC, lpfnfree: CFP_FREEPROC, lpvreserved: Long): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateFontPackage(puchsrcbuffer.toString(), ulsrcbuffersize.toInt(), ppuchfontpackagebuffer.toString(), pulfontpackagebuffersize.toString(), pulbyteswritten.toString(), usflag.toInt(), usttcindex.toInt(), ussubsetformat.toInt(), ussubsetlanguage.toInt(), ussubsetplatform.toInt(), ussubsetencoding.toInt(), pussubsetkeeplist.toString(), ussubsetlistcount.toInt(), lpfnallocate.toLong().toString(), lpfnreallocate.toLong().toString(), lpfnfree.toLong().toString(), lpvreserved.toString()) as Int).toUInt() else 0u

public actual fun CreateFontW(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: UInt, bunderline: UInt, bstrikeout: UInt, icharset: UInt, ioutprecision: UInt, iclipprecision: UInt, iquality: UInt, ipitchandfamily: UInt, pszfacename: PCWSTR): HFONT =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateFontW(cheight, cwidth, cescapement, corientation, cweight, bitalic.toInt(), bunderline.toInt(), bstrikeout.toInt(), icharset.toInt(), ioutprecision.toInt(), iclipprecision.toInt(), iquality.toInt(), ipitchandfamily.toInt(), pszfacename.toString()) as String).toLong() else 0L

public actual fun CreateHalftonePalette(hdc: HDC): HPALETTE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateHalftonePalette(hdc.toString()) as String).toLong() else 0L

public actual fun CreateHatchBrush(ihatch: HATCH_BRUSH_STYLE, color: COLORREF): HBRUSH =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateHatchBrush(ihatch, color.toInt()) as String).toLong() else 0L

public actual fun CreateICA(pszdriver: PCSTR, pszdevice: PCSTR, pszport: PCSTR, pdm: Long): HDC =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateICA(pszdriver.toString(), pszdevice.toString(), pszport.toString(), pdm.toString()) as String).toLong() else 0L

public actual fun CreateICW(pszdriver: PCWSTR, pszdevice: PCWSTR, pszport: PCWSTR, pdm: Long): HDC =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateICW(pszdriver.toString(), pszdevice.toString(), pszport.toString(), pdm.toString()) as String).toLong() else 0L

public actual fun CreateMetaFileA(pszfile: PCSTR): HDC =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateMetaFileA(pszfile.toString()) as String).toLong() else 0L

public actual fun CreateMetaFileW(pszfile: PCWSTR): HDC =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateMetaFileW(pszfile.toString()) as String).toLong() else 0L

public actual fun CreatePalette(plpal: Long): HPALETTE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreatePalette(plpal.toString()) as String).toLong() else 0L

public actual fun CreatePatternBrush(hbm: HBITMAP): HBRUSH =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreatePatternBrush(hbm.toString()) as String).toLong() else 0L

public actual fun CreatePen(istyle: PEN_STYLE, cwidth: Int, color: COLORREF): HPEN =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreatePen(istyle, cwidth, color.toInt()) as String).toLong() else 0L

public actual fun CreatePenIndirect(plpen: Long): HPEN =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreatePenIndirect(plpen.toString()) as String).toLong() else 0L

public actual fun CreatePolyPolygonRgn(pptl: Long, pc: Long, cpoly: Int, imode: CREATE_POLYGON_RGN_MODE): HRGN =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreatePolyPolygonRgn(pptl.toString(), pc.toString(), cpoly, imode) as String).toLong() else 0L

public actual fun CreatePolygonRgn(pptl: Long, cpoint: Int, imode: CREATE_POLYGON_RGN_MODE): HRGN =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreatePolygonRgn(pptl.toString(), cpoint, imode) as String).toLong() else 0L

public actual fun CreateRectRgn(x1: Int, y1: Int, x2: Int, y2: Int): HRGN =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateRectRgn(x1, y1, x2, y2) as String).toLong() else 0L

public actual fun CreateRectRgnIndirect(lprect: Long): HRGN =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateRectRgnIndirect(lprect.toString()) as String).toLong() else 0L

public actual fun CreateRoundRectRgn(x1: Int, y1: Int, x2: Int, y2: Int, w: Int, h: Int): HRGN =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateRoundRectRgn(x1, y1, x2, y2, w, h) as String).toLong() else 0L

public actual fun CreateScalableFontResourceA(fdwhidden: UInt, lpszfont: PCSTR, lpszfile: PCSTR, lpszpath: PCSTR): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateScalableFontResourceA(fdwhidden.toInt(), lpszfont.toString(), lpszfile.toString(), lpszpath.toString()) as Int) else 0

public actual fun CreateScalableFontResourceW(fdwhidden: UInt, lpszfont: PCWSTR, lpszfile: PCWSTR, lpszpath: PCWSTR): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateScalableFontResourceW(fdwhidden.toInt(), lpszfont.toString(), lpszfile.toString(), lpszpath.toString()) as Int) else 0

public actual fun CreateSolidBrush(color: COLORREF): HBRUSH =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_CreateSolidBrush(color.toInt()) as String).toLong() else 0L

public actual fun DPtoLP(hdc: HDC, lppt: Long, c: Int): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_DPtoLP(hdc.toString(), lppt.toString(), c) as Int) else 0

public actual fun DeleteDC(hdc: HDC): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_DeleteDC(hdc.toString()) as Int) else 0

public actual fun DeleteEnhMetaFile(hmf: HENHMETAFILE): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_DeleteEnhMetaFile(hmf.toString()) as Int) else 0

public actual fun DeleteMetaFile(hmf: HMETAFILE): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_DeleteMetaFile(hmf.toString()) as Int) else 0

public actual fun DeleteObject(ho: HGDIOBJ): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_DeleteObject(ho.toString()) as Int) else 0

public actual fun DrawAnimatedRects(hwnd: HWND, idani: Int, lprcfrom: Long, lprcto: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_DrawAnimatedRects(hwnd.toString(), idani, lprcfrom.toString(), lprcto.toString()) as Int) else 0

public actual fun DrawCaption(hwnd: HWND, hdc: HDC, lprect: Long, flags: DRAW_CAPTION_FLAGS): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_DrawCaption(hwnd.toString(), hdc.toString(), lprect.toString(), flags.toInt()) as Int) else 0

public actual fun DrawEdge(hdc: HDC, qrc: Long, edge: DRAWEDGE_FLAGS, grfflags: DRAW_EDGE_FLAGS): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_DrawEdge(hdc.toString(), qrc.toString(), edge.toInt(), grfflags.toInt()) as Int) else 0

public actual fun DrawEscape(hdc: HDC, iescape: Int, cjin: Int, lpin: PCSTR): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_DrawEscape(hdc.toString(), iescape, cjin, lpin.toString()) as Int) else 0

public actual fun DrawFocusRect(hdc: HDC, lprc: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_DrawFocusRect(hdc.toString(), lprc.toString()) as Int) else 0

public actual fun DrawFrameControl(param0: HDC, param1: Long, param2: DFC_TYPE, param3: DFCS_STATE): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_DrawFrameControl(param0.toString(), param1.toString(), param2.toInt(), param3.toInt()) as Int) else 0

public actual fun DrawStateA(hdc: HDC, hbrfore: HBRUSH, qfncallback: DRAWSTATEPROC, ldata: LPARAM, wdata: WPARAM, x: Int, y: Int, cx: Int, cy: Int, uflags: DRAWSTATE_FLAGS): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_DrawStateA(hdc.toString(), hbrfore.toString(), qfncallback.toLong().toString(), ldata.toString(), wdata.toString(), x, y, cx, cy, uflags.toInt()) as Int) else 0

public actual fun DrawStateW(hdc: HDC, hbrfore: HBRUSH, qfncallback: DRAWSTATEPROC, ldata: LPARAM, wdata: WPARAM, x: Int, y: Int, cx: Int, cy: Int, uflags: DRAWSTATE_FLAGS): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_DrawStateW(hdc.toString(), hbrfore.toString(), qfncallback.toLong().toString(), ldata.toString(), wdata.toString(), x, y, cx, cy, uflags.toInt()) as Int) else 0

public actual fun DrawTextA(hdc: HDC, lpchtext: PCSTR, cchtext: Int, lprc: Long, format: DRAW_TEXT_FORMAT): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_DrawTextA(hdc.toString(), lpchtext.toString(), cchtext, lprc.toString(), format.toInt()) as Int) else 0

public actual fun DrawTextExA(hdc: HDC, lpchtext: PSTR, cchtext: Int, lprc: Long, format: DRAW_TEXT_FORMAT, lpdtp: Long): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_DrawTextExA(hdc.toString(), lpchtext.toString(), cchtext, lprc.toString(), format.toInt(), lpdtp.toString()) as Int) else 0

public actual fun DrawTextExW(hdc: HDC, lpchtext: PWSTR, cchtext: Int, lprc: Long, format: DRAW_TEXT_FORMAT, lpdtp: Long): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_DrawTextExW(hdc.toString(), lpchtext.toString(), cchtext, lprc.toString(), format.toInt(), lpdtp.toString()) as Int) else 0

public actual fun DrawTextW(hdc: HDC, lpchtext: PCWSTR, cchtext: Int, lprc: Long, format: DRAW_TEXT_FORMAT): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_DrawTextW(hdc.toString(), lpchtext.toString(), cchtext, lprc.toString(), format.toInt()) as Int) else 0

public actual fun Ellipse(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_Ellipse(hdc.toString(), left, top, right, bottom) as Int) else 0

public actual fun EndPaint(hwnd: HWND, lppaint: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_EndPaint(hwnd.toString(), lppaint.toString()) as Int) else 0

public actual fun EndPath(hdc: HDC): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_EndPath(hdc.toString()) as Int) else 0

public actual fun EnumDisplayDevicesA(lpdevice: PCSTR, idevnum: UInt, lpdisplaydevice: Long, dwflags: UInt): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_EnumDisplayDevicesA(lpdevice.toString(), idevnum.toInt(), lpdisplaydevice.toString(), dwflags.toInt()) as Int) else 0

public actual fun EnumDisplayDevicesW(lpdevice: PCWSTR, idevnum: UInt, lpdisplaydevice: Long, dwflags: UInt): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_EnumDisplayDevicesW(lpdevice.toString(), idevnum.toInt(), lpdisplaydevice.toString(), dwflags.toInt()) as Int) else 0

public actual fun EnumDisplayMonitors(hdc: HDC, lprcclip: Long, lpfnenum: MONITORENUMPROC, dwdata: LPARAM): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_EnumDisplayMonitors(hdc.toString(), lprcclip.toString(), lpfnenum.toLong().toString(), dwdata.toString()) as Int) else 0

public actual fun EnumDisplaySettingsA(lpszdevicename: PCSTR, imodenum: ENUM_DISPLAY_SETTINGS_MODE, lpdevmode: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_EnumDisplaySettingsA(lpszdevicename.toString(), imodenum.toInt(), lpdevmode.toString()) as Int) else 0

public actual fun EnumDisplaySettingsExA(lpszdevicename: PCSTR, imodenum: ENUM_DISPLAY_SETTINGS_MODE, lpdevmode: Long, dwflags: ENUM_DISPLAY_SETTINGS_FLAGS): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_EnumDisplaySettingsExA(lpszdevicename.toString(), imodenum.toInt(), lpdevmode.toString(), dwflags.toInt()) as Int) else 0

public actual fun EnumDisplaySettingsExW(lpszdevicename: PCWSTR, imodenum: ENUM_DISPLAY_SETTINGS_MODE, lpdevmode: Long, dwflags: ENUM_DISPLAY_SETTINGS_FLAGS): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_EnumDisplaySettingsExW(lpszdevicename.toString(), imodenum.toInt(), lpdevmode.toString(), dwflags.toInt()) as Int) else 0

public actual fun EnumDisplaySettingsW(lpszdevicename: PCWSTR, imodenum: ENUM_DISPLAY_SETTINGS_MODE, lpdevmode: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_EnumDisplaySettingsW(lpszdevicename.toString(), imodenum.toInt(), lpdevmode.toString()) as Int) else 0

public actual fun EnumEnhMetaFile(hdc: HDC, hmf: HENHMETAFILE, proc: ENHMFENUMPROC, param3: Long, lprect: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_EnumEnhMetaFile(hdc.toString(), hmf.toString(), proc.toLong().toString(), param3.toString(), lprect.toString()) as Int) else 0

public actual fun EnumFontFamiliesA(hdc: HDC, lplogfont: PCSTR, lpproc: FONTENUMPROCA, lparam: LPARAM): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_EnumFontFamiliesA(hdc.toString(), lplogfont.toString(), lpproc.toLong().toString(), lparam.toString()) as Int) else 0

public actual fun EnumFontFamiliesExA(hdc: HDC, lplogfont: Long, lpproc: FONTENUMPROCA, lparam: LPARAM, dwflags: UInt): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_EnumFontFamiliesExA(hdc.toString(), lplogfont.toString(), lpproc.toLong().toString(), lparam.toString(), dwflags.toInt()) as Int) else 0

public actual fun EnumFontFamiliesExW(hdc: HDC, lplogfont: Long, lpproc: FONTENUMPROCW, lparam: LPARAM, dwflags: UInt): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_EnumFontFamiliesExW(hdc.toString(), lplogfont.toString(), lpproc.toLong().toString(), lparam.toString(), dwflags.toInt()) as Int) else 0

public actual fun EnumFontFamiliesW(hdc: HDC, lplogfont: PCWSTR, lpproc: FONTENUMPROCW, lparam: LPARAM): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_EnumFontFamiliesW(hdc.toString(), lplogfont.toString(), lpproc.toLong().toString(), lparam.toString()) as Int) else 0

public actual fun EnumFontsA(hdc: HDC, lplogfont: PCSTR, lpproc: FONTENUMPROCA, lparam: LPARAM): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_EnumFontsA(hdc.toString(), lplogfont.toString(), lpproc.toLong().toString(), lparam.toString()) as Int) else 0

public actual fun EnumFontsW(hdc: HDC, lplogfont: PCWSTR, lpproc: FONTENUMPROCW, lparam: LPARAM): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_EnumFontsW(hdc.toString(), lplogfont.toString(), lpproc.toLong().toString(), lparam.toString()) as Int) else 0

public actual fun EnumMetaFile(hdc: HDC, hmf: HMETAFILE, proc: MFENUMPROC, param3: LPARAM): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_EnumMetaFile(hdc.toString(), hmf.toString(), proc.toLong().toString(), param3.toString()) as Int) else 0

public actual fun EnumObjects(hdc: HDC, ntype: OBJ_TYPE, lpfunc: GOBJENUMPROC, lparam: LPARAM): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_EnumObjects(hdc.toString(), ntype, lpfunc.toLong().toString(), lparam.toString()) as Int) else 0

public actual fun EqualRect(lprc1: Long, lprc2: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_EqualRect(lprc1.toString(), lprc2.toString()) as Int) else 0

public actual fun EqualRgn(hrgn1: HRGN, hrgn2: HRGN): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_EqualRgn(hrgn1.toString(), hrgn2.toString()) as Int) else 0

public actual fun ExcludeClipRect(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int): GDI_REGION_TYPE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_ExcludeClipRect(hdc.toString(), left, top, right, bottom) as Int) else 0

public actual fun ExcludeUpdateRgn(hdc: HDC, hwnd: HWND): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_ExcludeUpdateRgn(hdc.toString(), hwnd.toString()) as Int) else 0

public actual fun ExtCreatePen(ipenstyle: UInt, cwidth: UInt, plbrush: Long, cstyle: UInt, pstyle: Long): HPEN =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_ExtCreatePen(ipenstyle.toInt(), cwidth.toInt(), plbrush.toString(), cstyle.toInt(), pstyle.toString()) as String).toLong() else 0L

public actual fun ExtCreateRegion(lpx: Long, ncount: UInt, lpdata: Long): HRGN =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_ExtCreateRegion(lpx.toString(), ncount.toInt(), lpdata.toString()) as String).toLong() else 0L

public actual fun ExtFloodFill(hdc: HDC, x: Int, y: Int, color: COLORREF, type: EXT_FLOOD_FILL_TYPE): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_ExtFloodFill(hdc.toString(), x, y, color.toInt(), type.toInt()) as Int) else 0

public actual fun ExtSelectClipRgn(hdc: HDC, hrgn: HRGN, mode: RGN_COMBINE_MODE): GDI_REGION_TYPE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_ExtSelectClipRgn(hdc.toString(), hrgn.toString(), mode) as Int) else 0

public actual fun ExtTextOutA(hdc: HDC, x: Int, y: Int, options: ETO_OPTIONS, lprect: Long, lpstring: PCSTR, c: UInt, lpdx: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_ExtTextOutA(hdc.toString(), x, y, options.toInt(), lprect.toString(), lpstring.toString(), c.toInt(), lpdx.toString()) as Int) else 0

public actual fun ExtTextOutW(hdc: HDC, x: Int, y: Int, options: ETO_OPTIONS, lprect: Long, lpstring: PCWSTR, c: UInt, lpdx: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_ExtTextOutW(hdc.toString(), x, y, options.toInt(), lprect.toString(), lpstring.toString(), c.toInt(), lpdx.toString()) as Int) else 0

public actual fun FillPath(hdc: HDC): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_FillPath(hdc.toString()) as Int) else 0

public actual fun FillRect(hdc: HDC, lprc: Long, hbr: HBRUSH): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_FillRect(hdc.toString(), lprc.toString(), hbr.toString()) as Int) else 0

public actual fun FillRgn(hdc: HDC, hrgn: HRGN, hbr: HBRUSH): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_FillRgn(hdc.toString(), hrgn.toString(), hbr.toString()) as Int) else 0

public actual fun FixBrushOrgEx(hdc: HDC, x: Int, y: Int, ptl: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_FixBrushOrgEx(hdc.toString(), x, y, ptl.toString()) as Int) else 0

public actual fun FlattenPath(hdc: HDC): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_FlattenPath(hdc.toString()) as Int) else 0

public actual fun FloodFill(hdc: HDC, x: Int, y: Int, color: COLORREF): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_FloodFill(hdc.toString(), x, y, color.toInt()) as Int) else 0

public actual fun FrameRect(hdc: HDC, lprc: Long, hbr: HBRUSH): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_FrameRect(hdc.toString(), lprc.toString(), hbr.toString()) as Int) else 0

public actual fun FrameRgn(hdc: HDC, hrgn: HRGN, hbr: HBRUSH, w: Int, h: Int): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_FrameRgn(hdc.toString(), hrgn.toString(), hbr.toString(), w, h) as Int) else 0

public actual fun GdiAlphaBlend(hdcdest: HDC, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: HDC, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, ftn: BLENDFUNCTION): BOOL =
    0

public actual fun GdiComment(hdc: HDC, nsize: UInt, lpdata: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GdiComment(hdc.toString(), nsize.toInt(), lpdata.toString()) as Int) else 0

public actual fun GdiFlush(): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GdiFlush() as Int) else 0

public actual fun GdiGetBatchLimit(): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GdiGetBatchLimit() as Int).toUInt() else 0u

public actual fun GdiGradientFill(hdc: HDC, pvertex: Long, nvertex: UInt, pmesh: Long, ncount: UInt, ulmode: GRADIENT_FILL): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GdiGradientFill(hdc.toString(), pvertex.toString(), nvertex.toInt(), pmesh.toString(), ncount.toInt(), ulmode.toInt()) as Int) else 0

public actual fun GdiSetBatchLimit(dw: UInt): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GdiSetBatchLimit(dw.toInt()) as Int).toUInt() else 0u

public actual fun GdiTransparentBlt(hdcdest: HDC, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: HDC, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: UInt): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GdiTransparentBlt(hdcdest.toString(), xorigindest, yorigindest, wdest, hdest, hdcsrc.toString(), xoriginsrc, yoriginsrc, wsrc, hsrc, crtransparent.toInt()) as Int) else 0

public actual fun GetArcDirection(hdc: HDC): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetArcDirection(hdc.toString()) as Int) else 0

public actual fun GetAspectRatioFilterEx(hdc: HDC, lpsize: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetAspectRatioFilterEx(hdc.toString(), lpsize.toString()) as Int) else 0

public actual fun GetBitmapBits(hbit: HBITMAP, cb: Int, lpvbits: Long): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetBitmapBits(hbit.toString(), cb, lpvbits.toString()) as Int) else 0

public actual fun GetBitmapDimensionEx(hbit: HBITMAP, lpsize: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetBitmapDimensionEx(hbit.toString(), lpsize.toString()) as Int) else 0

public actual fun GetBkColor(hdc: HDC): COLORREF =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetBkColor(hdc.toString()) as Int).toUInt() else 0u

public actual fun GetBkMode(hdc: HDC): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetBkMode(hdc.toString()) as Int) else 0

public actual fun GetBoundsRect(hdc: HDC, lprect: Long, flags: UInt): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetBoundsRect(hdc.toString(), lprect.toString(), flags.toInt()) as Int).toUInt() else 0u

public actual fun GetBrushOrgEx(hdc: HDC, lppt: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetBrushOrgEx(hdc.toString(), lppt.toString()) as Int) else 0

public actual fun GetCharABCWidthsA(hdc: HDC, wfirst: UInt, wlast: UInt, lpabc: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetCharABCWidthsA(hdc.toString(), wfirst.toInt(), wlast.toInt(), lpabc.toString()) as Int) else 0

public actual fun GetCharABCWidthsFloatA(hdc: HDC, ifirst: UInt, ilast: UInt, lpabc: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetCharABCWidthsFloatA(hdc.toString(), ifirst.toInt(), ilast.toInt(), lpabc.toString()) as Int) else 0

public actual fun GetCharABCWidthsFloatW(hdc: HDC, ifirst: UInt, ilast: UInt, lpabc: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetCharABCWidthsFloatW(hdc.toString(), ifirst.toInt(), ilast.toInt(), lpabc.toString()) as Int) else 0

public actual fun GetCharABCWidthsI(hdc: HDC, gifirst: UInt, cgi: UInt, pgi: Long, pabc: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetCharABCWidthsI(hdc.toString(), gifirst.toInt(), cgi.toInt(), pgi.toString(), pabc.toString()) as Int) else 0

public actual fun GetCharABCWidthsW(hdc: HDC, wfirst: UInt, wlast: UInt, lpabc: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetCharABCWidthsW(hdc.toString(), wfirst.toInt(), wlast.toInt(), lpabc.toString()) as Int) else 0

public actual fun GetCharWidth32A(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetCharWidth32A(hdc.toString(), ifirst.toInt(), ilast.toInt(), lpbuffer.toString()) as Int) else 0

public actual fun GetCharWidth32W(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetCharWidth32W(hdc.toString(), ifirst.toInt(), ilast.toInt(), lpbuffer.toString()) as Int) else 0

public actual fun GetCharWidthA(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetCharWidthA(hdc.toString(), ifirst.toInt(), ilast.toInt(), lpbuffer.toString()) as Int) else 0

public actual fun GetCharWidthFloatA(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetCharWidthFloatA(hdc.toString(), ifirst.toInt(), ilast.toInt(), lpbuffer.toString()) as Int) else 0

public actual fun GetCharWidthFloatW(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetCharWidthFloatW(hdc.toString(), ifirst.toInt(), ilast.toInt(), lpbuffer.toString()) as Int) else 0

public actual fun GetCharWidthI(hdc: HDC, gifirst: UInt, cgi: UInt, pgi: Long, piwidths: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetCharWidthI(hdc.toString(), gifirst.toInt(), cgi.toInt(), pgi.toString(), piwidths.toString()) as Int) else 0

public actual fun GetCharWidthW(hdc: HDC, ifirst: UInt, ilast: UInt, lpbuffer: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetCharWidthW(hdc.toString(), ifirst.toInt(), ilast.toInt(), lpbuffer.toString()) as Int) else 0

public actual fun GetCharacterPlacementA(hdc: HDC, lpstring: PCSTR, ncount: Int, nmexextent: Int, lpresults: Long, dwflags: GET_CHARACTER_PLACEMENT_FLAGS): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetCharacterPlacementA(hdc.toString(), lpstring.toString(), ncount, nmexextent, lpresults.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun GetCharacterPlacementW(hdc: HDC, lpstring: PCWSTR, ncount: Int, nmexextent: Int, lpresults: Long, dwflags: GET_CHARACTER_PLACEMENT_FLAGS): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetCharacterPlacementW(hdc.toString(), lpstring.toString(), ncount, nmexextent, lpresults.toString(), dwflags.toInt()) as Int).toUInt() else 0u

public actual fun GetClipBox(hdc: HDC, lprect: Long): GDI_REGION_TYPE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetClipBox(hdc.toString(), lprect.toString()) as Int) else 0

public actual fun GetClipRgn(hdc: HDC, hrgn: HRGN): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetClipRgn(hdc.toString(), hrgn.toString()) as Int) else 0

public actual fun GetColorAdjustment(hdc: HDC, lpca: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetColorAdjustment(hdc.toString(), lpca.toString()) as Int) else 0

public actual fun GetCurrentObject(hdc: HDC, type: UInt): HGDIOBJ =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetCurrentObject(hdc.toString(), type.toInt()) as String).toLong() else 0L

public actual fun GetCurrentPositionEx(hdc: HDC, lppt: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetCurrentPositionEx(hdc.toString(), lppt.toString()) as Int) else 0

public actual fun GetDC(hwnd: HWND): HDC =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetDC(hwnd.toString()) as String).toLong() else 0L

public actual fun GetDCBrushColor(hdc: HDC): COLORREF =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetDCBrushColor(hdc.toString()) as Int).toUInt() else 0u

public actual fun GetDCEx(hwnd: HWND, hrgnclip: HRGN, flags: GET_DCX_FLAGS): HDC =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetDCEx(hwnd.toString(), hrgnclip.toString(), flags.toInt()) as String).toLong() else 0L

public actual fun GetDCOrgEx(hdc: HDC, lppt: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetDCOrgEx(hdc.toString(), lppt.toString()) as Int) else 0

public actual fun GetDCPenColor(hdc: HDC): COLORREF =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetDCPenColor(hdc.toString()) as Int).toUInt() else 0u

public actual fun GetDIBColorTable(hdc: HDC, istart: UInt, centries: UInt, prgbq: Long): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetDIBColorTable(hdc.toString(), istart.toInt(), centries.toInt(), prgbq.toString()) as Int).toUInt() else 0u

public actual fun GetDIBits(hdc: HDC, hbm: HBITMAP, start: UInt, clines: UInt, lpvbits: Long, lpbmi: Long, usage: DIB_USAGE): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetDIBits(hdc.toString(), hbm.toString(), start.toInt(), clines.toInt(), lpvbits.toString(), lpbmi.toString(), usage.toInt()) as Int) else 0

public actual fun GetDeviceCaps(hdc: HDC, index: Int): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetDeviceCaps(hdc.toString(), index) as Int) else 0

public actual fun GetEnhMetaFileA(lpname: PCSTR): HENHMETAFILE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetEnhMetaFileA(lpname.toString()) as String).toLong() else 0L

public actual fun GetEnhMetaFileBits(hemf: HENHMETAFILE, nsize: UInt, lpdata: Long): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetEnhMetaFileBits(hemf.toString(), nsize.toInt(), lpdata.toString()) as Int).toUInt() else 0u

public actual fun GetEnhMetaFileDescriptionA(hemf: HENHMETAFILE, cchbuffer: UInt, lpdescription: PSTR): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetEnhMetaFileDescriptionA(hemf.toString(), cchbuffer.toInt(), lpdescription.toString()) as Int).toUInt() else 0u

public actual fun GetEnhMetaFileDescriptionW(hemf: HENHMETAFILE, cchbuffer: UInt, lpdescription: PWSTR): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetEnhMetaFileDescriptionW(hemf.toString(), cchbuffer.toInt(), lpdescription.toString()) as Int).toUInt() else 0u

public actual fun GetEnhMetaFileHeader(hemf: HENHMETAFILE, nsize: UInt, lpenhmetaheader: Long): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetEnhMetaFileHeader(hemf.toString(), nsize.toInt(), lpenhmetaheader.toString()) as Int).toUInt() else 0u

public actual fun GetEnhMetaFilePaletteEntries(hemf: HENHMETAFILE, nnumentries: UInt, lppaletteentries: Long): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetEnhMetaFilePaletteEntries(hemf.toString(), nnumentries.toInt(), lppaletteentries.toString()) as Int).toUInt() else 0u

public actual fun GetEnhMetaFileW(lpname: PCWSTR): HENHMETAFILE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetEnhMetaFileW(lpname.toString()) as String).toLong() else 0L

public actual fun GetFontData(hdc: HDC, dwtable: UInt, dwoffset: UInt, pvbuffer: Long, cjbuffer: UInt): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetFontData(hdc.toString(), dwtable.toInt(), dwoffset.toInt(), pvbuffer.toString(), cjbuffer.toInt()) as Int).toUInt() else 0u

public actual fun GetFontLanguageInfo(hdc: HDC): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetFontLanguageInfo(hdc.toString()) as Int).toUInt() else 0u

public actual fun GetFontUnicodeRanges(hdc: HDC, lpgs: Long): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetFontUnicodeRanges(hdc.toString(), lpgs.toString()) as Int).toUInt() else 0u

public actual fun GetGlyphIndicesA(hdc: HDC, lpstr: PCSTR, c: Int, pgi: Long, fl: UInt): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetGlyphIndicesA(hdc.toString(), lpstr.toString(), c, pgi.toString(), fl.toInt()) as Int).toUInt() else 0u

public actual fun GetGlyphIndicesW(hdc: HDC, lpstr: PCWSTR, c: Int, pgi: Long, fl: UInt): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetGlyphIndicesW(hdc.toString(), lpstr.toString(), c, pgi.toString(), fl.toInt()) as Int).toUInt() else 0u

public actual fun GetGlyphOutlineA(hdc: HDC, uchar: UInt, fuformat: GET_GLYPH_OUTLINE_FORMAT, lpgm: Long, cjbuffer: UInt, pvbuffer: Long, lpmat2: Long): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetGlyphOutlineA(hdc.toString(), uchar.toInt(), fuformat.toInt(), lpgm.toString(), cjbuffer.toInt(), pvbuffer.toString(), lpmat2.toString()) as Int).toUInt() else 0u

public actual fun GetGlyphOutlineW(hdc: HDC, uchar: UInt, fuformat: GET_GLYPH_OUTLINE_FORMAT, lpgm: Long, cjbuffer: UInt, pvbuffer: Long, lpmat2: Long): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetGlyphOutlineW(hdc.toString(), uchar.toInt(), fuformat.toInt(), lpgm.toString(), cjbuffer.toInt(), pvbuffer.toString(), lpmat2.toString()) as Int).toUInt() else 0u

public actual fun GetGraphicsMode(hdc: HDC): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetGraphicsMode(hdc.toString()) as Int) else 0

public actual fun GetKerningPairsA(hdc: HDC, npairs: UInt, lpkernpair: Long): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetKerningPairsA(hdc.toString(), npairs.toInt(), lpkernpair.toString()) as Int).toUInt() else 0u

public actual fun GetKerningPairsW(hdc: HDC, npairs: UInt, lpkernpair: Long): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetKerningPairsW(hdc.toString(), npairs.toInt(), lpkernpair.toString()) as Int).toUInt() else 0u

public actual fun GetLayout(hdc: HDC): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetLayout(hdc.toString()) as Int).toUInt() else 0u

public actual fun GetMapMode(hdc: HDC): HDC_MAP_MODE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetMapMode(hdc.toString()) as Int) else 0

public actual fun GetMetaFileA(lpname: PCSTR): HMETAFILE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetMetaFileA(lpname.toString()) as String).toLong() else 0L

public actual fun GetMetaFileBitsEx(hmf: HMETAFILE, cbbuffer: UInt, lpdata: Long): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetMetaFileBitsEx(hmf.toString(), cbbuffer.toInt(), lpdata.toString()) as Int).toUInt() else 0u

public actual fun GetMetaFileW(lpname: PCWSTR): HMETAFILE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetMetaFileW(lpname.toString()) as String).toLong() else 0L

public actual fun GetMetaRgn(hdc: HDC, hrgn: HRGN): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetMetaRgn(hdc.toString(), hrgn.toString()) as Int) else 0

public actual fun GetMiterLimit(hdc: HDC, plimit: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetMiterLimit(hdc.toString(), plimit.toString()) as Int) else 0

public actual fun GetMonitorInfoA(hmonitor: HMONITOR, lpmi: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetMonitorInfoA(hmonitor.toString(), lpmi.toString()) as Int) else 0

public actual fun GetMonitorInfoW(hmonitor: HMONITOR, lpmi: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetMonitorInfoW(hmonitor.toString(), lpmi.toString()) as Int) else 0

public actual fun GetNearestColor(hdc: HDC, color: COLORREF): COLORREF =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetNearestColor(hdc.toString(), color.toInt()) as Int).toUInt() else 0u

public actual fun GetNearestPaletteIndex(h: HPALETTE, color: COLORREF): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetNearestPaletteIndex(h.toString(), color.toInt()) as Int).toUInt() else 0u

public actual fun GetObjectA(h: HGDIOBJ, c: Int, pv: Long): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetObjectA(h.toString(), c, pv.toString()) as Int) else 0

public actual fun GetObjectType(h: HGDIOBJ): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetObjectType(h.toString()) as Int).toUInt() else 0u

public actual fun GetObjectW(h: HGDIOBJ, c: Int, pv: Long): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetObjectW(h.toString(), c, pv.toString()) as Int) else 0

public actual fun GetOutlineTextMetricsA(hdc: HDC, cjcopy: UInt, potm: Long): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetOutlineTextMetricsA(hdc.toString(), cjcopy.toInt(), potm.toString()) as Int).toUInt() else 0u

public actual fun GetOutlineTextMetricsW(hdc: HDC, cjcopy: UInt, potm: Long): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetOutlineTextMetricsW(hdc.toString(), cjcopy.toInt(), potm.toString()) as Int).toUInt() else 0u

public actual fun GetPaletteEntries(hpal: HPALETTE, istart: UInt, centries: UInt, ppalentries: Long): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetPaletteEntries(hpal.toString(), istart.toInt(), centries.toInt(), ppalentries.toString()) as Int).toUInt() else 0u

public actual fun GetPath(hdc: HDC, apt: Long, aj: Long, cpt: Int): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetPath(hdc.toString(), apt.toString(), aj.toString(), cpt) as Int) else 0

public actual fun GetPixel(hdc: HDC, x: Int, y: Int): COLORREF =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetPixel(hdc.toString(), x, y) as Int).toUInt() else 0u

public actual fun GetPolyFillMode(hdc: HDC): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetPolyFillMode(hdc.toString()) as Int) else 0

public actual fun GetROP2(hdc: HDC): R2_MODE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetROP2(hdc.toString()) as Int) else 0

public actual fun GetRandomRgn(hdc: HDC, hrgn: HRGN, i: Int): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetRandomRgn(hdc.toString(), hrgn.toString(), i) as Int) else 0

public actual fun GetRasterizerCaps(lpraststat: Long, cjbytes: UInt): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetRasterizerCaps(lpraststat.toString(), cjbytes.toInt()) as Int) else 0

public actual fun GetRegionData(hrgn: HRGN, ncount: UInt, lprgndata: Long): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetRegionData(hrgn.toString(), ncount.toInt(), lprgndata.toString()) as Int).toUInt() else 0u

public actual fun GetRgnBox(hrgn: HRGN, lprc: Long): GDI_REGION_TYPE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetRgnBox(hrgn.toString(), lprc.toString()) as Int) else 0

public actual fun GetStockObject(i: GET_STOCK_OBJECT_FLAGS): HGDIOBJ =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetStockObject(i) as String).toLong() else 0L

public actual fun GetStretchBltMode(hdc: HDC): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetStretchBltMode(hdc.toString()) as Int) else 0

public actual fun GetSysColor(nindex: SYS_COLOR_INDEX): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetSysColor(nindex) as Int).toUInt() else 0u

public actual fun GetSysColorBrush(nindex: SYS_COLOR_INDEX): HBRUSH =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetSysColorBrush(nindex) as String).toLong() else 0L

public actual fun GetSystemPaletteEntries(hdc: HDC, istart: UInt, centries: UInt, ppalentries: Long): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetSystemPaletteEntries(hdc.toString(), istart.toInt(), centries.toInt(), ppalentries.toString()) as Int).toUInt() else 0u

public actual fun GetSystemPaletteUse(hdc: HDC): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetSystemPaletteUse(hdc.toString()) as Int).toUInt() else 0u

public actual fun GetTabbedTextExtentA(hdc: HDC, lpstring: PCSTR, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetTabbedTextExtentA(hdc.toString(), lpstring.toString(), chcount, ntabpositions, lpntabstoppositions.toString()) as Int).toUInt() else 0u

public actual fun GetTabbedTextExtentW(hdc: HDC, lpstring: PCWSTR, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetTabbedTextExtentW(hdc.toString(), lpstring.toString(), chcount, ntabpositions, lpntabstoppositions.toString()) as Int).toUInt() else 0u

public actual fun GetTextAlign(hdc: HDC): TEXT_ALIGN_OPTIONS =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetTextAlign(hdc.toString()) as Int).toUInt() else 0u

public actual fun GetTextCharacterExtra(hdc: HDC): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetTextCharacterExtra(hdc.toString()) as Int) else 0

public actual fun GetTextColor(hdc: HDC): COLORREF =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetTextColor(hdc.toString()) as Int).toUInt() else 0u

public actual fun GetTextExtentExPointA(hdc: HDC, lpszstring: PCSTR, cchstring: Int, nmaxextent: Int, lpnfit: Long, lpndx: Long, lpsize: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetTextExtentExPointA(hdc.toString(), lpszstring.toString(), cchstring, nmaxextent, lpnfit.toString(), lpndx.toString(), lpsize.toString()) as Int) else 0

public actual fun GetTextExtentExPointI(hdc: HDC, lpwszstring: Long, cwchstring: Int, nmaxextent: Int, lpnfit: Long, lpndx: Long, lpsize: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetTextExtentExPointI(hdc.toString(), lpwszstring.toString(), cwchstring, nmaxextent, lpnfit.toString(), lpndx.toString(), lpsize.toString()) as Int) else 0

public actual fun GetTextExtentExPointW(hdc: HDC, lpszstring: PCWSTR, cchstring: Int, nmaxextent: Int, lpnfit: Long, lpndx: Long, lpsize: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetTextExtentExPointW(hdc.toString(), lpszstring.toString(), cchstring, nmaxextent, lpnfit.toString(), lpndx.toString(), lpsize.toString()) as Int) else 0

public actual fun GetTextExtentPoint32A(hdc: HDC, lpstring: PCSTR, c: Int, psizl: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetTextExtentPoint32A(hdc.toString(), lpstring.toString(), c, psizl.toString()) as Int) else 0

public actual fun GetTextExtentPoint32W(hdc: HDC, lpstring: PCWSTR, c: Int, psizl: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetTextExtentPoint32W(hdc.toString(), lpstring.toString(), c, psizl.toString()) as Int) else 0

public actual fun GetTextExtentPointA(hdc: HDC, lpstring: PCSTR, c: Int, lpsz: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetTextExtentPointA(hdc.toString(), lpstring.toString(), c, lpsz.toString()) as Int) else 0

public actual fun GetTextExtentPointI(hdc: HDC, pgiin: Long, cgi: Int, psize: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetTextExtentPointI(hdc.toString(), pgiin.toString(), cgi, psize.toString()) as Int) else 0

public actual fun GetTextExtentPointW(hdc: HDC, lpstring: PCWSTR, c: Int, lpsz: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetTextExtentPointW(hdc.toString(), lpstring.toString(), c, lpsz.toString()) as Int) else 0

public actual fun GetTextFaceA(hdc: HDC, c: Int, lpname: PSTR): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetTextFaceA(hdc.toString(), c, lpname.toString()) as Int) else 0

public actual fun GetTextFaceW(hdc: HDC, c: Int, lpname: PWSTR): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetTextFaceW(hdc.toString(), c, lpname.toString()) as Int) else 0

public actual fun GetTextMetricsA(hdc: HDC, lptm: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetTextMetricsA(hdc.toString(), lptm.toString()) as Int) else 0

public actual fun GetTextMetricsW(hdc: HDC, lptm: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetTextMetricsW(hdc.toString(), lptm.toString()) as Int) else 0

public actual fun GetUpdateRect(hwnd: HWND, lprect: Long, berase: BOOL): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetUpdateRect(hwnd.toString(), lprect.toString(), berase) as Int) else 0

public actual fun GetUpdateRgn(hwnd: HWND, hrgn: HRGN, berase: BOOL): GDI_REGION_TYPE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetUpdateRgn(hwnd.toString(), hrgn.toString(), berase) as Int) else 0

public actual fun GetViewportExtEx(hdc: HDC, lpsize: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetViewportExtEx(hdc.toString(), lpsize.toString()) as Int) else 0

public actual fun GetViewportOrgEx(hdc: HDC, lppoint: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetViewportOrgEx(hdc.toString(), lppoint.toString()) as Int) else 0

public actual fun GetWinMetaFileBits(hemf: HENHMETAFILE, cbdata16: UInt, pdata16: Long, imapmode: Int, hdcref: HDC): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetWinMetaFileBits(hemf.toString(), cbdata16.toInt(), pdata16.toString(), imapmode, hdcref.toString()) as Int).toUInt() else 0u

public actual fun GetWindowDC(hwnd: HWND): HDC =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetWindowDC(hwnd.toString()) as String).toLong() else 0L

public actual fun GetWindowExtEx(hdc: HDC, lpsize: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetWindowExtEx(hdc.toString(), lpsize.toString()) as Int) else 0

public actual fun GetWindowOrgEx(hdc: HDC, lppoint: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetWindowOrgEx(hdc.toString(), lppoint.toString()) as Int) else 0

public actual fun GetWindowRgn(hwnd: HWND, hrgn: HRGN): GDI_REGION_TYPE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetWindowRgn(hwnd.toString(), hrgn.toString()) as Int) else 0

public actual fun GetWindowRgnBox(hwnd: HWND, lprc: Long): GDI_REGION_TYPE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetWindowRgnBox(hwnd.toString(), lprc.toString()) as Int) else 0

public actual fun GetWorldTransform(hdc: HDC, lpxf: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GetWorldTransform(hdc.toString(), lpxf.toString()) as Int) else 0

public actual fun GradientFill(hdc: HDC, pvertex: Long, nvertex: UInt, pmesh: Long, nmesh: UInt, ulmode: GRADIENT_FILL): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GradientFill(hdc.toString(), pvertex.toString(), nvertex.toInt(), pmesh.toString(), nmesh.toInt(), ulmode.toInt()) as Int) else 0

public actual fun GrayStringA(hdc: HDC, hbrush: HBRUSH, lpoutputfunc: GRAYSTRINGPROC, lpdata: LPARAM, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GrayStringA(hdc.toString(), hbrush.toString(), lpoutputfunc.toLong().toString(), lpdata.toString(), ncount, x, y, nwidth, nheight) as Int) else 0

public actual fun GrayStringW(hdc: HDC, hbrush: HBRUSH, lpoutputfunc: GRAYSTRINGPROC, lpdata: LPARAM, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_GrayStringW(hdc.toString(), hbrush.toString(), lpoutputfunc.toLong().toString(), lpdata.toString(), ncount, x, y, nwidth, nheight) as Int) else 0

public actual fun InflateRect(lprc: Long, dx: Int, dy: Int): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_InflateRect(lprc.toString(), dx, dy) as Int) else 0

public actual fun IntersectClipRect(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int): GDI_REGION_TYPE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_IntersectClipRect(hdc.toString(), left, top, right, bottom) as Int) else 0

public actual fun IntersectRect(lprcdst: Long, lprcsrc1: Long, lprcsrc2: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_IntersectRect(lprcdst.toString(), lprcsrc1.toString(), lprcsrc2.toString()) as Int) else 0

public actual fun InvalidateRect(hwnd: HWND, lprect: Long, berase: BOOL): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_InvalidateRect(hwnd.toString(), lprect.toString(), berase) as Int) else 0

public actual fun InvalidateRgn(hwnd: HWND, hrgn: HRGN, berase: BOOL): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_InvalidateRgn(hwnd.toString(), hrgn.toString(), berase) as Int) else 0

public actual fun InvertRect(hdc: HDC, lprc: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_InvertRect(hdc.toString(), lprc.toString()) as Int) else 0

public actual fun InvertRgn(hdc: HDC, hrgn: HRGN): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_InvertRgn(hdc.toString(), hrgn.toString()) as Int) else 0

public actual fun IsRectEmpty(lprc: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_IsRectEmpty(lprc.toString()) as Int) else 0

public actual fun LPtoDP(hdc: HDC, lppt: Long, c: Int): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_LPtoDP(hdc.toString(), lppt.toString(), c) as Int) else 0

public actual fun LineDDA(xstart: Int, ystart: Int, xend: Int, yend: Int, lpproc: LINEDDAPROC, data: LPARAM): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_LineDDA(xstart, ystart, xend, yend, lpproc.toLong().toString(), data.toString()) as Int) else 0

public actual fun LineTo(hdc: HDC, x: Int, y: Int): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_LineTo(hdc.toString(), x, y) as Int) else 0

public actual fun LoadBitmapA(hinstance: HINSTANCE, lpbitmapname: PCSTR): HBITMAP =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_LoadBitmapA(hinstance.toString(), lpbitmapname.toString()) as String).toLong() else 0L

public actual fun LoadBitmapW(hinstance: HINSTANCE, lpbitmapname: PCWSTR): HBITMAP =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_LoadBitmapW(hinstance.toString(), lpbitmapname.toString()) as String).toLong() else 0L

public actual fun LockWindowUpdate(hwndlock: HWND): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_LockWindowUpdate(hwndlock.toString()) as Int) else 0

public actual fun MapWindowPoints(hwndfrom: HWND, hwndto: HWND, lppoints: Long, cpoints: UInt): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_MapWindowPoints(hwndfrom.toString(), hwndto.toString(), lppoints.toString(), cpoints.toInt()) as Int) else 0

public actual fun MaskBlt(hdcdest: HDC, xdest: Int, ydest: Int, width: Int, height: Int, hdcsrc: HDC, xsrc: Int, ysrc: Int, hbmmask: HBITMAP, xmask: Int, ymask: Int, rop: UInt): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_MaskBlt(hdcdest.toString(), xdest, ydest, width, height, hdcsrc.toString(), xsrc, ysrc, hbmmask.toString(), xmask, ymask, rop.toInt()) as Int) else 0

public actual fun MergeFontPackage(puchmergefontbuffer: Long, ulmergefontbuffersize: UInt, puchfontpackagebuffer: Long, ulfontpackagebuffersize: UInt, ppuchdestbuffer: Long, puldestbuffersize: Long, pulbyteswritten: Long, usmode: UShort, lpfnallocate: CFP_ALLOCPROC, lpfnreallocate: CFP_REALLOCPROC, lpfnfree: CFP_FREEPROC, lpvreserved: Long): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_MergeFontPackage(puchmergefontbuffer.toString(), ulmergefontbuffersize.toInt(), puchfontpackagebuffer.toString(), ulfontpackagebuffersize.toInt(), ppuchdestbuffer.toString(), puldestbuffersize.toString(), pulbyteswritten.toString(), usmode.toInt(), lpfnallocate.toLong().toString(), lpfnreallocate.toLong().toString(), lpfnfree.toLong().toString(), lpvreserved.toString()) as Int).toUInt() else 0u

public actual fun ModifyWorldTransform(hdc: HDC, lpxf: Long, mode: MODIFY_WORLD_TRANSFORM_MODE): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_ModifyWorldTransform(hdc.toString(), lpxf.toString(), mode.toInt()) as Int) else 0

public actual fun MonitorFromPoint(pt: POINT, dwflags: MONITOR_FROM_FLAGS): HMONITOR =
    0L

public actual fun MonitorFromRect(lprc: Long, dwflags: MONITOR_FROM_FLAGS): HMONITOR =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_MonitorFromRect(lprc.toString(), dwflags.toInt()) as String).toLong() else 0L

public actual fun MonitorFromWindow(hwnd: HWND, dwflags: MONITOR_FROM_FLAGS): HMONITOR =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_MonitorFromWindow(hwnd.toString(), dwflags.toInt()) as String).toLong() else 0L

public actual fun MoveToEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_MoveToEx(hdc.toString(), x, y, lppt.toString()) as Int) else 0

public actual fun OffsetClipRgn(hdc: HDC, x: Int, y: Int): GDI_REGION_TYPE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_OffsetClipRgn(hdc.toString(), x, y) as Int) else 0

public actual fun OffsetRect(lprc: Long, dx: Int, dy: Int): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_OffsetRect(lprc.toString(), dx, dy) as Int) else 0

public actual fun OffsetRgn(hrgn: HRGN, x: Int, y: Int): GDI_REGION_TYPE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_OffsetRgn(hrgn.toString(), x, y) as Int) else 0

public actual fun OffsetViewportOrgEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_OffsetViewportOrgEx(hdc.toString(), x, y, lppt.toString()) as Int) else 0

public actual fun OffsetWindowOrgEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_OffsetWindowOrgEx(hdc.toString(), x, y, lppt.toString()) as Int) else 0

public actual fun PaintDesktop(hdc: HDC): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_PaintDesktop(hdc.toString()) as Int) else 0

public actual fun PaintRgn(hdc: HDC, hrgn: HRGN): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_PaintRgn(hdc.toString(), hrgn.toString()) as Int) else 0

public actual fun PatBlt(hdc: HDC, x: Int, y: Int, w: Int, h: Int, rop: ROP_CODE): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_PatBlt(hdc.toString(), x, y, w, h, rop.toInt()) as Int) else 0

public actual fun PathToRegion(hdc: HDC): HRGN =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_PathToRegion(hdc.toString()) as String).toLong() else 0L

public actual fun Pie(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_Pie(hdc.toString(), left, top, right, bottom, xr1, yr1, xr2, yr2) as Int) else 0

public actual fun PlayEnhMetaFile(hdc: HDC, hmf: HENHMETAFILE, lprect: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_PlayEnhMetaFile(hdc.toString(), hmf.toString(), lprect.toString()) as Int) else 0

public actual fun PlayEnhMetaFileRecord(hdc: HDC, pht: Long, pmr: Long, cht: UInt): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_PlayEnhMetaFileRecord(hdc.toString(), pht.toString(), pmr.toString(), cht.toInt()) as Int) else 0

public actual fun PlayMetaFile(hdc: HDC, hmf: HMETAFILE): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_PlayMetaFile(hdc.toString(), hmf.toString()) as Int) else 0

public actual fun PlayMetaFileRecord(hdc: HDC, lphandletable: Long, lpmr: Long, noobjs: UInt): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_PlayMetaFileRecord(hdc.toString(), lphandletable.toString(), lpmr.toString(), noobjs.toInt()) as Int) else 0

public actual fun PlgBlt(hdcdest: HDC, lppoint: Long, hdcsrc: HDC, xsrc: Int, ysrc: Int, width: Int, height: Int, hbmmask: HBITMAP, xmask: Int, ymask: Int): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_PlgBlt(hdcdest.toString(), lppoint.toString(), hdcsrc.toString(), xsrc, ysrc, width, height, hbmmask.toString(), xmask, ymask) as Int) else 0

public actual fun PolyBezier(hdc: HDC, apt: Long, cpt: UInt): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_PolyBezier(hdc.toString(), apt.toString(), cpt.toInt()) as Int) else 0

public actual fun PolyBezierTo(hdc: HDC, apt: Long, cpt: UInt): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_PolyBezierTo(hdc.toString(), apt.toString(), cpt.toInt()) as Int) else 0

public actual fun PolyDraw(hdc: HDC, apt: Long, aj: Long, cpt: Int): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_PolyDraw(hdc.toString(), apt.toString(), aj.toString(), cpt) as Int) else 0

public actual fun PolyPolygon(hdc: HDC, apt: Long, asz: Long, csz: Int): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_PolyPolygon(hdc.toString(), apt.toString(), asz.toString(), csz) as Int) else 0

public actual fun PolyPolyline(hdc: HDC, apt: Long, asz: Long, csz: UInt): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_PolyPolyline(hdc.toString(), apt.toString(), asz.toString(), csz.toInt()) as Int) else 0

public actual fun PolyTextOutA(hdc: HDC, ppt: Long, nstrings: Int): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_PolyTextOutA(hdc.toString(), ppt.toString(), nstrings) as Int) else 0

public actual fun PolyTextOutW(hdc: HDC, ppt: Long, nstrings: Int): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_PolyTextOutW(hdc.toString(), ppt.toString(), nstrings) as Int) else 0

public actual fun Polygon(hdc: HDC, apt: Long, cpt: Int): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_Polygon(hdc.toString(), apt.toString(), cpt) as Int) else 0

public actual fun Polyline(hdc: HDC, apt: Long, cpt: Int): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_Polyline(hdc.toString(), apt.toString(), cpt) as Int) else 0

public actual fun PolylineTo(hdc: HDC, apt: Long, cpt: UInt): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_PolylineTo(hdc.toString(), apt.toString(), cpt.toInt()) as Int) else 0

public actual fun PtInRect(lprc: Long, pt: POINT): BOOL =
    0

public actual fun PtInRegion(hrgn: HRGN, x: Int, y: Int): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_PtInRegion(hrgn.toString(), x, y) as Int) else 0

public actual fun PtVisible(hdc: HDC, x: Int, y: Int): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_PtVisible(hdc.toString(), x, y) as Int) else 0

public actual fun RealizePalette(hdc: HDC): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_RealizePalette(hdc.toString()) as Int).toUInt() else 0u

public actual fun RectInRegion(hrgn: HRGN, lprect: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_RectInRegion(hrgn.toString(), lprect.toString()) as Int) else 0

public actual fun RectVisible(hdc: HDC, lprect: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_RectVisible(hdc.toString(), lprect.toString()) as Int) else 0

public actual fun Rectangle(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_Rectangle(hdc.toString(), left, top, right, bottom) as Int) else 0

public actual fun RedrawWindow(hwnd: HWND, lprcupdate: Long, hrgnupdate: HRGN, flags: REDRAW_WINDOW_FLAGS): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_RedrawWindow(hwnd.toString(), lprcupdate.toString(), hrgnupdate.toString(), flags.toInt()) as Int) else 0

public actual fun ReleaseDC(hwnd: HWND, hdc: HDC): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_ReleaseDC(hwnd.toString(), hdc.toString()) as Int) else 0

public actual fun RemoveFontMemResourceEx(h: HANDLE): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_RemoveFontMemResourceEx(h.toString()) as Int) else 0

public actual fun RemoveFontResourceA(lpfilename: PCSTR): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_RemoveFontResourceA(lpfilename.toString()) as Int) else 0

public actual fun RemoveFontResourceExA(name: PCSTR, fl: UInt, pdv: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_RemoveFontResourceExA(name.toString(), fl.toInt(), pdv.toString()) as Int) else 0

public actual fun RemoveFontResourceExW(name: PCWSTR, fl: UInt, pdv: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_RemoveFontResourceExW(name.toString(), fl.toInt(), pdv.toString()) as Int) else 0

public actual fun RemoveFontResourceW(lpfilename: PCWSTR): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_RemoveFontResourceW(lpfilename.toString()) as Int) else 0

public actual fun ResetDCA(hdc: HDC, lpdm: Long): HDC =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_ResetDCA(hdc.toString(), lpdm.toString()) as String).toLong() else 0L

public actual fun ResetDCW(hdc: HDC, lpdm: Long): HDC =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_ResetDCW(hdc.toString(), lpdm.toString()) as String).toLong() else 0L

public actual fun ResizePalette(hpal: HPALETTE, n: UInt): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_ResizePalette(hpal.toString(), n.toInt()) as Int) else 0

public actual fun RestoreDC(hdc: HDC, nsaveddc: Int): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_RestoreDC(hdc.toString(), nsaveddc) as Int) else 0

public actual fun RoundRect(hdc: HDC, left: Int, top: Int, right: Int, bottom: Int, width: Int, height: Int): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_RoundRect(hdc.toString(), left, top, right, bottom, width, height) as Int) else 0

public actual fun SaveDC(hdc: HDC): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SaveDC(hdc.toString()) as Int) else 0

public actual fun ScaleViewportExtEx(hdc: HDC, xn: Int, dx: Int, yn: Int, yd: Int, lpsz: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_ScaleViewportExtEx(hdc.toString(), xn, dx, yn, yd, lpsz.toString()) as Int) else 0

public actual fun ScaleWindowExtEx(hdc: HDC, xn: Int, xd: Int, yn: Int, yd: Int, lpsz: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_ScaleWindowExtEx(hdc.toString(), xn, xd, yn, yd, lpsz.toString()) as Int) else 0

public actual fun ScreenToClient(hwnd: HWND, lppoint: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_ScreenToClient(hwnd.toString(), lppoint.toString()) as Int) else 0

public actual fun SelectClipPath(hdc: HDC, mode: RGN_COMBINE_MODE): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SelectClipPath(hdc.toString(), mode) as Int) else 0

public actual fun SelectClipRgn(hdc: HDC, hrgn: HRGN): GDI_REGION_TYPE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SelectClipRgn(hdc.toString(), hrgn.toString()) as Int) else 0

public actual fun SelectObject(hdc: HDC, h: HGDIOBJ): HGDIOBJ =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SelectObject(hdc.toString(), h.toString()) as String).toLong() else 0L

public actual fun SelectPalette(hdc: HDC, hpal: HPALETTE, bforcebkgd: BOOL): HPALETTE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SelectPalette(hdc.toString(), hpal.toString(), bforcebkgd) as String).toLong() else 0L

public actual fun SetArcDirection(hdc: HDC, dir: ARC_DIRECTION): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetArcDirection(hdc.toString(), dir) as Int) else 0

public actual fun SetBitmapBits(hbm: HBITMAP, cb: UInt, pvbits: Long): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetBitmapBits(hbm.toString(), cb.toInt(), pvbits.toString()) as Int) else 0

public actual fun SetBitmapDimensionEx(hbm: HBITMAP, w: Int, h: Int, lpsz: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetBitmapDimensionEx(hbm.toString(), w, h, lpsz.toString()) as Int) else 0

public actual fun SetBkColor(hdc: HDC, color: COLORREF): COLORREF =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetBkColor(hdc.toString(), color.toInt()) as Int).toUInt() else 0u

public actual fun SetBkMode(hdc: HDC, mode: Int): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetBkMode(hdc.toString(), mode) as Int) else 0

public actual fun SetBoundsRect(hdc: HDC, lprect: Long, flags: SET_BOUNDS_RECT_FLAGS): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetBoundsRect(hdc.toString(), lprect.toString(), flags.toInt()) as Int).toUInt() else 0u

public actual fun SetBrushOrgEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetBrushOrgEx(hdc.toString(), x, y, lppt.toString()) as Int) else 0

public actual fun SetColorAdjustment(hdc: HDC, lpca: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetColorAdjustment(hdc.toString(), lpca.toString()) as Int) else 0

public actual fun SetDCBrushColor(hdc: HDC, color: COLORREF): COLORREF =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetDCBrushColor(hdc.toString(), color.toInt()) as Int).toUInt() else 0u

public actual fun SetDCPenColor(hdc: HDC, color: COLORREF): COLORREF =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetDCPenColor(hdc.toString(), color.toInt()) as Int).toUInt() else 0u

public actual fun SetDIBColorTable(hdc: HDC, istart: UInt, centries: UInt, prgbq: Long): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetDIBColorTable(hdc.toString(), istart.toInt(), centries.toInt(), prgbq.toString()) as Int).toUInt() else 0u

public actual fun SetDIBits(hdc: HDC, hbm: HBITMAP, start: UInt, clines: UInt, lpbits: Long, lpbmi: Long, coloruse: DIB_USAGE): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetDIBits(hdc.toString(), hbm.toString(), start.toInt(), clines.toInt(), lpbits.toString(), lpbmi.toString(), coloruse.toInt()) as Int) else 0

public actual fun SetDIBitsToDevice(hdc: HDC, xdest: Int, ydest: Int, w: UInt, h: UInt, xsrc: Int, ysrc: Int, startscan: UInt, clines: UInt, lpvbits: Long, lpbmi: Long, coloruse: DIB_USAGE): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetDIBitsToDevice(hdc.toString(), xdest, ydest, w.toInt(), h.toInt(), xsrc, ysrc, startscan.toInt(), clines.toInt(), lpvbits.toString(), lpbmi.toString(), coloruse.toInt()) as Int) else 0

public actual fun SetEnhMetaFileBits(nsize: UInt, pb: Long): HENHMETAFILE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetEnhMetaFileBits(nsize.toInt(), pb.toString()) as String).toLong() else 0L

public actual fun SetGraphicsMode(hdc: HDC, imode: GRAPHICS_MODE): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetGraphicsMode(hdc.toString(), imode) as Int) else 0

public actual fun SetLayout(hdc: HDC, l: DC_LAYOUT): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetLayout(hdc.toString(), l.toInt()) as Int).toUInt() else 0u

public actual fun SetMapMode(hdc: HDC, imode: HDC_MAP_MODE): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetMapMode(hdc.toString(), imode) as Int) else 0

public actual fun SetMapperFlags(hdc: HDC, flags: UInt): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetMapperFlags(hdc.toString(), flags.toInt()) as Int).toUInt() else 0u

public actual fun SetMetaFileBitsEx(cbbuffer: UInt, lpdata: Long): HMETAFILE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetMetaFileBitsEx(cbbuffer.toInt(), lpdata.toString()) as String).toLong() else 0L

public actual fun SetMetaRgn(hdc: HDC): GDI_REGION_TYPE =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetMetaRgn(hdc.toString()) as Int) else 0

public actual fun SetMiterLimit(hdc: HDC, limit: Float, old: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetMiterLimit(hdc.toString(), limit.toDouble(), old.toString()) as Int) else 0

public actual fun SetPaletteEntries(hpal: HPALETTE, istart: UInt, centries: UInt, ppalentries: Long): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetPaletteEntries(hpal.toString(), istart.toInt(), centries.toInt(), ppalentries.toString()) as Int).toUInt() else 0u

public actual fun SetPixel(hdc: HDC, x: Int, y: Int, color: COLORREF): COLORREF =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetPixel(hdc.toString(), x, y, color.toInt()) as Int).toUInt() else 0u

public actual fun SetPixelV(hdc: HDC, x: Int, y: Int, color: COLORREF): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetPixelV(hdc.toString(), x, y, color.toInt()) as Int) else 0

public actual fun SetPolyFillMode(hdc: HDC, mode: CREATE_POLYGON_RGN_MODE): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetPolyFillMode(hdc.toString(), mode) as Int) else 0

public actual fun SetROP2(hdc: HDC, rop2: R2_MODE): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetROP2(hdc.toString(), rop2) as Int) else 0

public actual fun SetRect(lprc: Long, xleft: Int, ytop: Int, xright: Int, ybottom: Int): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetRect(lprc.toString(), xleft, ytop, xright, ybottom) as Int) else 0

public actual fun SetRectEmpty(lprc: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetRectEmpty(lprc.toString()) as Int) else 0

public actual fun SetRectRgn(hrgn: HRGN, left: Int, top: Int, right: Int, bottom: Int): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetRectRgn(hrgn.toString(), left, top, right, bottom) as Int) else 0

public actual fun SetStretchBltMode(hdc: HDC, mode: STRETCH_BLT_MODE): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetStretchBltMode(hdc.toString(), mode) as Int) else 0

public actual fun SetSysColors(celements: Int, lpaelements: Long, lpargbvalues: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetSysColors(celements, lpaelements.toString(), lpargbvalues.toString()) as Int) else 0

public actual fun SetSystemPaletteUse(hdc: HDC, use: SYSTEM_PALETTE_USE): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetSystemPaletteUse(hdc.toString(), use.toInt()) as Int).toUInt() else 0u

public actual fun SetTextAlign(hdc: HDC, align: TEXT_ALIGN_OPTIONS): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetTextAlign(hdc.toString(), align.toInt()) as Int).toUInt() else 0u

public actual fun SetTextCharacterExtra(hdc: HDC, extra: Int): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetTextCharacterExtra(hdc.toString(), extra) as Int) else 0

public actual fun SetTextColor(hdc: HDC, color: COLORREF): COLORREF =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetTextColor(hdc.toString(), color.toInt()) as Int).toUInt() else 0u

public actual fun SetTextJustification(hdc: HDC, extra: Int, count: Int): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetTextJustification(hdc.toString(), extra, count) as Int) else 0

public actual fun SetViewportExtEx(hdc: HDC, x: Int, y: Int, lpsz: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetViewportExtEx(hdc.toString(), x, y, lpsz.toString()) as Int) else 0

public actual fun SetViewportOrgEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetViewportOrgEx(hdc.toString(), x, y, lppt.toString()) as Int) else 0

public actual fun SetWindowExtEx(hdc: HDC, x: Int, y: Int, lpsz: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetWindowExtEx(hdc.toString(), x, y, lpsz.toString()) as Int) else 0

public actual fun SetWindowOrgEx(hdc: HDC, x: Int, y: Int, lppt: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetWindowOrgEx(hdc.toString(), x, y, lppt.toString()) as Int) else 0

public actual fun SetWindowRgn(hwnd: HWND, hrgn: HRGN, bredraw: BOOL): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetWindowRgn(hwnd.toString(), hrgn.toString(), bredraw) as Int) else 0

public actual fun SetWorldTransform(hdc: HDC, lpxf: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SetWorldTransform(hdc.toString(), lpxf.toString()) as Int) else 0

public actual fun StretchBlt(hdcdest: HDC, xdest: Int, ydest: Int, wdest: Int, hdest: Int, hdcsrc: HDC, xsrc: Int, ysrc: Int, wsrc: Int, hsrc: Int, rop: ROP_CODE): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_StretchBlt(hdcdest.toString(), xdest, ydest, wdest, hdest, hdcsrc.toString(), xsrc, ysrc, wsrc, hsrc, rop.toInt()) as Int) else 0

public actual fun StretchDIBits(hdc: HDC, xdest: Int, ydest: Int, destwidth: Int, destheight: Int, xsrc: Int, ysrc: Int, srcwidth: Int, srcheight: Int, lpbits: Long, lpbmi: Long, iusage: DIB_USAGE, rop: ROP_CODE): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_StretchDIBits(hdc.toString(), xdest, ydest, destwidth, destheight, xsrc, ysrc, srcwidth, srcheight, lpbits.toString(), lpbmi.toString(), iusage.toInt(), rop.toInt()) as Int) else 0

public actual fun StrokeAndFillPath(hdc: HDC): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_StrokeAndFillPath(hdc.toString()) as Int) else 0

public actual fun StrokePath(hdc: HDC): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_StrokePath(hdc.toString()) as Int) else 0

public actual fun SubtractRect(lprcdst: Long, lprcsrc1: Long, lprcsrc2: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_SubtractRect(lprcdst.toString(), lprcsrc1.toString(), lprcsrc2.toString()) as Int) else 0

public actual fun TTCharToUnicode(hdc: HDC, puccharcodes: Long, ulcharcodesize: UInt, pusshortcodes: Long, ulshortcodesize: UInt, ulflags: UInt): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_TTCharToUnicode(hdc.toString(), puccharcodes.toString(), ulcharcodesize.toInt(), pusshortcodes.toString(), ulshortcodesize.toInt(), ulflags.toInt()) as Int) else 0

public actual fun TTDeleteEmbeddedFont(hfontreference: HANDLE, ulflags: UInt, pulstatus: Long): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_TTDeleteEmbeddedFont(hfontreference.toString(), ulflags.toInt(), pulstatus.toString()) as Int) else 0

public actual fun TTEmbedFont(hdc: HDC, ulflags: TTEMBED_FLAGS, ulcharset: EMBED_FONT_CHARSET, pulprivstatus: Long, pulstatus: Long, lpfnwritetostream: WRITEEMBEDPROC, lpvwritestream: Long, puscharcodeset: Long, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: Long): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_TTEmbedFont(hdc.toString(), ulflags.toInt(), ulcharset.toInt(), pulprivstatus.toString(), pulstatus.toString(), lpfnwritetostream.toLong().toString(), lpvwritestream.toString(), puscharcodeset.toString(), uscharcodecount.toInt(), uslanguage.toInt(), pttembedinfo.toString()) as Int) else 0

public actual fun TTEmbedFontEx(hdc: HDC, ulflags: TTEMBED_FLAGS, ulcharset: EMBED_FONT_CHARSET, pulprivstatus: Long, pulstatus: Long, lpfnwritetostream: WRITEEMBEDPROC, lpvwritestream: Long, pulcharcodeset: Long, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: Long): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_TTEmbedFontEx(hdc.toString(), ulflags.toInt(), ulcharset.toInt(), pulprivstatus.toString(), pulstatus.toString(), lpfnwritetostream.toLong().toString(), lpvwritestream.toString(), pulcharcodeset.toString(), uscharcodecount.toInt(), uslanguage.toInt(), pttembedinfo.toString()) as Int) else 0

public actual fun TTEmbedFontFromFileA(hdc: HDC, szfontfilename: PCSTR, usttcindex: UShort, ulflags: TTEMBED_FLAGS, ulcharset: EMBED_FONT_CHARSET, pulprivstatus: Long, pulstatus: Long, lpfnwritetostream: WRITEEMBEDPROC, lpvwritestream: Long, puscharcodeset: Long, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: Long): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_TTEmbedFontFromFileA(hdc.toString(), szfontfilename.toString(), usttcindex.toInt(), ulflags.toInt(), ulcharset.toInt(), pulprivstatus.toString(), pulstatus.toString(), lpfnwritetostream.toLong().toString(), lpvwritestream.toString(), puscharcodeset.toString(), uscharcodecount.toInt(), uslanguage.toInt(), pttembedinfo.toString()) as Int) else 0

public actual fun TTEnableEmbeddingForFacename(lpszfacename: PCSTR, benable: BOOL): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_TTEnableEmbeddingForFacename(lpszfacename.toString(), benable) as Int) else 0

public actual fun TTGetEmbeddedFontInfo(ulflags: TTEMBED_FLAGS, pulprivstatus: Long, ulprivs: FONT_LICENSE_PRIVS, pulstatus: Long, lpfnreadfromstream: READEMBEDPROC, lpvreadstream: Long, pttloadinfo: Long): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_TTGetEmbeddedFontInfo(ulflags.toInt(), pulprivstatus.toString(), ulprivs.toInt(), pulstatus.toString(), lpfnreadfromstream.toLong().toString(), lpvreadstream.toString(), pttloadinfo.toString()) as Int) else 0

public actual fun TTGetEmbeddingType(hdc: HDC, pulembedtype: Long): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_TTGetEmbeddingType(hdc.toString(), pulembedtype.toString()) as Int) else 0

public actual fun TTGetNewFontName(phfontreference: Long, wzwinfamilyname: PWSTR, cchmaxwinname: Int, szmacfamilyname: PSTR, cchmaxmacname: Int): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_TTGetNewFontName(phfontreference.toString(), wzwinfamilyname.toString(), cchmaxwinname, szmacfamilyname.toString(), cchmaxmacname) as Int) else 0

public actual fun TTIsEmbeddingEnabled(hdc: HDC, pbenabled: Long): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_TTIsEmbeddingEnabled(hdc.toString(), pbenabled.toString()) as Int) else 0

public actual fun TTIsEmbeddingEnabledForFacename(lpszfacename: PCSTR, pbenabled: Long): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_TTIsEmbeddingEnabledForFacename(lpszfacename.toString(), pbenabled.toString()) as Int) else 0

public actual fun TTLoadEmbeddedFont(phfontreference: Long, ulflags: UInt, pulprivstatus: Long, ulprivs: FONT_LICENSE_PRIVS, pulstatus: Long, lpfnreadfromstream: READEMBEDPROC, lpvreadstream: Long, szwinfamilyname: PCWSTR, szmacfamilyname: PCSTR, pttloadinfo: Long): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_TTLoadEmbeddedFont(phfontreference.toString(), ulflags.toInt(), pulprivstatus.toString(), ulprivs.toInt(), pulstatus.toString(), lpfnreadfromstream.toLong().toString(), lpvreadstream.toString(), szwinfamilyname.toString(), szmacfamilyname.toString(), pttloadinfo.toString()) as Int) else 0

public actual fun TTRunValidationTests(hdc: HDC, ptestparam: Long): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_TTRunValidationTests(hdc.toString(), ptestparam.toString()) as Int) else 0

public actual fun TTRunValidationTestsEx(hdc: HDC, ptestparam: Long): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_TTRunValidationTestsEx(hdc.toString(), ptestparam.toString()) as Int) else 0

public actual fun TabbedTextOutA(hdc: HDC, x: Int, y: Int, lpstring: PCSTR, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long, ntaborigin: Int): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_TabbedTextOutA(hdc.toString(), x, y, lpstring.toString(), chcount, ntabpositions, lpntabstoppositions.toString(), ntaborigin) as Int) else 0

public actual fun TabbedTextOutW(hdc: HDC, x: Int, y: Int, lpstring: PCWSTR, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long, ntaborigin: Int): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_TabbedTextOutW(hdc.toString(), x, y, lpstring.toString(), chcount, ntabpositions, lpntabstoppositions.toString(), ntaborigin) as Int) else 0

public actual fun TextOutA(hdc: HDC, x: Int, y: Int, lpstring: PCSTR, c: Int): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_TextOutA(hdc.toString(), x, y, lpstring.toString(), c) as Int) else 0

public actual fun TextOutW(hdc: HDC, x: Int, y: Int, lpstring: PCWSTR, c: Int): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_TextOutW(hdc.toString(), x, y, lpstring.toString(), c) as Int) else 0

public actual fun TransparentBlt(hdcdest: HDC, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: HDC, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: UInt): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_TransparentBlt(hdcdest.toString(), xorigindest, yorigindest, wdest, hdest, hdcsrc.toString(), xoriginsrc, yoriginsrc, wsrc, hsrc, crtransparent.toInt()) as Int) else 0

public actual fun UnionRect(lprcdst: Long, lprcsrc1: Long, lprcsrc2: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_UnionRect(lprcdst.toString(), lprcsrc1.toString(), lprcsrc2.toString()) as Int) else 0

public actual fun UnrealizeObject(h: HGDIOBJ): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_UnrealizeObject(h.toString()) as Int) else 0

public actual fun UpdateColors(hdc: HDC): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_UpdateColors(hdc.toString()) as Int) else 0

public actual fun UpdateWindow(hwnd: HWND): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_UpdateWindow(hwnd.toString()) as Int) else 0

public actual fun ValidateRect(hwnd: HWND, lprect: Long): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_ValidateRect(hwnd.toString(), lprect.toString()) as Int) else 0

public actual fun ValidateRgn(hwnd: HWND, hrgn: HRGN): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_ValidateRgn(hwnd.toString(), hrgn.toString()) as Int) else 0

public actual fun WidenPath(hdc: HDC): BOOL =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_WidenPath(hdc.toString()) as Int) else 0

public actual fun WindowFromDC(hdc: HDC): HWND =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_WindowFromDC(hdc.toString()) as String).toLong() else 0L

public actual fun wglSwapMultipleBuffers(param0: UInt, param1: Long): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_wglSwapMultipleBuffers(param0.toInt(), param1.toString()) as Int).toUInt() else 0u
