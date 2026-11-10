@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun abortPath(hdc: Hdc): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_abortPath(hdc?.value?.toCPointer<ByteVar>())

public actual fun addFontMemResourceEx(pfileview: COpaquePointer?, cjsize: UInt, pvresrved: COpaquePointer?, pnumfonts: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_addFontMemResourceEx(pfileview?.value?.toCPointer<ByteVar>(), cjsize, pvresrved?.value?.toCPointer<ByteVar>(), pnumfonts?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun addFontResourceA(param0: Pcstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_addFontResourceA(param0?.value?.toCPointer<ByteVar>())

public actual fun addFontResourceExA(name: Pcstr, fl: FontResourceCharacteristics, res: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_addFontResourceExA(name?.value?.toCPointer<ByteVar>(), fl, res?.value?.toCPointer<ByteVar>())

public actual fun addFontResourceExW(name: Pcwstr, fl: FontResourceCharacteristics, res: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_addFontResourceExW(name?.value?.toCPointer<ByteVar>(), fl, res?.value?.toCPointer<ByteVar>())

public actual fun addFontResourceW(param0: Pcwstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_addFontResourceW(param0?.value?.toCPointer<ByteVar>())

public actual fun alphaBlend(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, ftn: Blendfunction): Bool =
    0

public actual fun angleArc(hdc: Hdc, x: Int, y: Int, r: UInt, startangle: Float, sweepangle: Float): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_angleArc(hdc?.value?.toCPointer<ByteVar>(), x, y, r, startangle, sweepangle)

public actual fun animatePalette(hpal: Hpalette, istartindex: UInt, centries: UInt, ppe: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_animatePalette(hpal?.value?.toCPointer<ByteVar>(), istartindex, centries, ppe?.value?.toCPointer<ByteVar>())

public actual fun arc(hdc: Hdc, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_arc(hdc?.value?.toCPointer<ByteVar>(), x1, y1, x2, y2, x3, y3, x4, y4)

public actual fun arcTo(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_arcTo(hdc?.value?.toCPointer<ByteVar>(), left, top, right, bottom, xr1, yr1, xr2, yr2)

public actual fun beginPaint(hwnd: Hwnd, lppaint: COpaquePointer?): Hdc =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_beginPaint(hwnd?.value?.toCPointer<ByteVar>(), lppaint?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun beginPath(hdc: Hdc): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_beginPath(hdc?.value?.toCPointer<ByteVar>())

public actual fun bitBlt(hdc: Hdc, x: Int, y: Int, cx: Int, cy: Int, hdcsrc: Hdc, x1: Int, y1: Int, rop: RopCode): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_bitBlt(hdc?.value?.toCPointer<ByteVar>(), x, y, cx, cy, hdcsrc?.value?.toCPointer<ByteVar>(), x1, y1, rop)

public actual fun cancelDC(hdc: Hdc): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_cancelDC(hdc?.value?.toCPointer<ByteVar>())

public actual fun changeDisplaySettingsA(lpdevmode: COpaquePointer?, dwflags: CdsType): DispChange =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_changeDisplaySettingsA(lpdevmode?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun changeDisplaySettingsExA(lpszdevicename: Pcstr, lpdevmode: COpaquePointer?, hwnd: Hwnd, dwflags: CdsType, lparam: COpaquePointer?): DispChange =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_changeDisplaySettingsExA(lpszdevicename?.value?.toCPointer<ByteVar>(), lpdevmode?.value?.toCPointer<ByteVar>(), hwnd?.value?.toCPointer<ByteVar>(), dwflags, lparam?.value?.toCPointer<ByteVar>())

public actual fun changeDisplaySettingsExW(lpszdevicename: Pcwstr, lpdevmode: COpaquePointer?, hwnd: Hwnd, dwflags: CdsType, lparam: COpaquePointer?): DispChange =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_changeDisplaySettingsExW(lpszdevicename?.value?.toCPointer<ByteVar>(), lpdevmode?.value?.toCPointer<ByteVar>(), hwnd?.value?.toCPointer<ByteVar>(), dwflags, lparam?.value?.toCPointer<ByteVar>())

public actual fun changeDisplaySettingsW(lpdevmode: COpaquePointer?, dwflags: CdsType): DispChange =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_changeDisplaySettingsW(lpdevmode?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun chord(hdc: Hdc, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_chord(hdc?.value?.toCPointer<ByteVar>(), x1, y1, x2, y2, x3, y3, x4, y4)

public actual fun clientToScreen(hwnd: Hwnd, lppoint: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_clientToScreen(hwnd?.value?.toCPointer<ByteVar>(), lppoint?.value?.toCPointer<ByteVar>())

public actual fun closeEnhMetaFile(hdc: Hdc): Henhmetafile =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_closeEnhMetaFile(hdc?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun closeFigure(hdc: Hdc): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_closeFigure(hdc?.value?.toCPointer<ByteVar>())

public actual fun closeMetaFile(hdc: Hdc): Hmetafile =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_closeMetaFile(hdc?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun combineRgn(hrgndst: Hrgn, hrgnsrc1: Hrgn, hrgnsrc2: Hrgn, imode: RgnCombineMode): GdiRegionType =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_combineRgn(hrgndst?.value?.toCPointer<ByteVar>(), hrgnsrc1?.value?.toCPointer<ByteVar>(), hrgnsrc2?.value?.toCPointer<ByteVar>(), imode)

public actual fun combineTransform(lpxfout: COpaquePointer?, lpxf1: COpaquePointer?, lpxf2: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_combineTransform(lpxfout?.value?.toCPointer<ByteVar>(), lpxf1?.value?.toCPointer<ByteVar>(), lpxf2?.value?.toCPointer<ByteVar>())

public actual fun copyEnhMetaFileA(henh: Henhmetafile, lpfilename: Pcstr): Henhmetafile =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_copyEnhMetaFileA(henh?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun copyEnhMetaFileW(henh: Henhmetafile, lpfilename: Pcwstr): Henhmetafile =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_copyEnhMetaFileW(henh?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun copyMetaFileA(param0: Hmetafile, param1: Pcstr): Hmetafile =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_copyMetaFileA(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun copyMetaFileW(param0: Hmetafile, param1: Pcwstr): Hmetafile =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_copyMetaFileW(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun copyRect(lprcdst: COpaquePointer?, lprcsrc: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_copyRect(lprcdst?.value?.toCPointer<ByteVar>(), lprcsrc?.value?.toCPointer<ByteVar>())

public actual fun createBitmap(nwidth: Int, nheight: Int, nplanes: UInt, nbitcount: UInt, lpbits: COpaquePointer?): Hbitmap =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createBitmap(nwidth, nheight, nplanes, nbitcount, lpbits?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createBitmapIndirect(pbm: COpaquePointer?): Hbitmap =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createBitmapIndirect(pbm?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createBrushIndirect(plbrush: COpaquePointer?): Hbrush =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createBrushIndirect(plbrush?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createCompatibleBitmap(hdc: Hdc, cx: Int, cy: Int): Hbitmap =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createCompatibleBitmap(hdc?.value?.toCPointer<ByteVar>(), cx, cy)?.let { COpaquePointer(it.toLong()) }

public actual fun createCompatibleDC(hdc: Hdc): Hdc =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createCompatibleDC(hdc?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createDCA(pwszdriver: Pcstr, pwszdevice: Pcstr, pszport: Pcstr, pdm: COpaquePointer?): Hdc =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createDCA(pwszdriver?.value?.toCPointer<ByteVar>(), pwszdevice?.value?.toCPointer<ByteVar>(), pszport?.value?.toCPointer<ByteVar>(), pdm?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createDCW(pwszdriver: Pcwstr, pwszdevice: Pcwstr, pszport: Pcwstr, pdm: COpaquePointer?): Hdc =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createDCW(pwszdriver?.value?.toCPointer<ByteVar>(), pwszdevice?.value?.toCPointer<ByteVar>(), pszport?.value?.toCPointer<ByteVar>(), pdm?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createDIBPatternBrush(h: Hglobal, iusage: DibUsage): Hbrush =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createDIBPatternBrush(h?.value?.toCPointer<ByteVar>(), iusage)?.let { COpaquePointer(it.toLong()) }

public actual fun createDIBPatternBrushPt(lppackeddib: COpaquePointer?, iusage: DibUsage): Hbrush =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createDIBPatternBrushPt(lppackeddib?.value?.toCPointer<ByteVar>(), iusage)?.let { COpaquePointer(it.toLong()) }

public actual fun createDIBSection(hdc: Hdc, pbmi: COpaquePointer?, usage: DibUsage, ppvbits: COpaquePointer?, hsection: Handle, offset: UInt): Hbitmap =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createDIBSection(hdc?.value?.toCPointer<ByteVar>(), pbmi?.value?.toCPointer<ByteVar>(), usage, ppvbits?.value?.toCPointer<ByteVar>(), hsection?.value?.toCPointer<ByteVar>(), offset)?.let { COpaquePointer(it.toLong()) }

public actual fun createDIBitmap(hdc: Hdc, pbmih: COpaquePointer?, flinit: UInt, pjbits: COpaquePointer?, pbmi: COpaquePointer?, iusage: DibUsage): Hbitmap =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createDIBitmap(hdc?.value?.toCPointer<ByteVar>(), pbmih?.value?.toCPointer<ByteVar>(), flinit, pjbits?.value?.toCPointer<ByteVar>(), pbmi?.value?.toCPointer<ByteVar>(), iusage)?.let { COpaquePointer(it.toLong()) }

public actual fun createDiscardableBitmap(hdc: Hdc, cx: Int, cy: Int): Hbitmap =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createDiscardableBitmap(hdc?.value?.toCPointer<ByteVar>(), cx, cy)?.let { COpaquePointer(it.toLong()) }

public actual fun createEllipticRgn(x1: Int, y1: Int, x2: Int, y2: Int): Hrgn =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createEllipticRgn(x1, y1, x2, y2)?.let { COpaquePointer(it.toLong()) }

public actual fun createEllipticRgnIndirect(lprect: COpaquePointer?): Hrgn =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createEllipticRgnIndirect(lprect?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createEnhMetaFileA(hdc: Hdc, lpfilename: Pcstr, lprc: COpaquePointer?, lpdesc: Pcstr): Hdc =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createEnhMetaFileA(hdc?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>(), lprc?.value?.toCPointer<ByteVar>(), lpdesc?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createEnhMetaFileW(hdc: Hdc, lpfilename: Pcwstr, lprc: COpaquePointer?, lpdesc: Pcwstr): Hdc =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createEnhMetaFileW(hdc?.value?.toCPointer<ByteVar>(), lpfilename?.value?.toCPointer<ByteVar>(), lprc?.value?.toCPointer<ByteVar>(), lpdesc?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createFontA(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: UInt, bunderline: UInt, bstrikeout: UInt, icharset: UInt, ioutprecision: UInt, iclipprecision: UInt, iquality: UInt, ipitchandfamily: UInt, pszfacename: Pcstr): Hfont =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createFontA(cheight, cwidth, cescapement, corientation, cweight, bitalic, bunderline, bstrikeout, icharset, ioutprecision, iclipprecision, iquality, ipitchandfamily, pszfacename?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createFontIndirectA(lplf: COpaquePointer?): Hfont =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createFontIndirectA(lplf?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createFontIndirectExA(param0: COpaquePointer?): Hfont =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createFontIndirectExA(param0?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createFontIndirectExW(param0: COpaquePointer?): Hfont =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createFontIndirectExW(param0?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createFontIndirectW(lplf: COpaquePointer?): Hfont =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createFontIndirectW(lplf?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createFontPackage(puchsrcbuffer: COpaquePointer?, ulsrcbuffersize: UInt, ppuchfontpackagebuffer: COpaquePointer?, pulfontpackagebuffersize: COpaquePointer?, pulbyteswritten: COpaquePointer?, usflag: UShort, usttcindex: UShort, ussubsetformat: UShort, ussubsetlanguage: UShort, ussubsetplatform: CreateFontPackageSubsetPlatform, ussubsetencoding: CreateFontPackageSubsetEncoding, pussubsetkeeplist: COpaquePointer?, ussubsetlistcount: UShort, lpfnallocate: CfpAllocproc, lpfnreallocate: CfpReallocproc, lpfnfree: CfpFreeproc, lpvreserved: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createFontPackage(puchsrcbuffer?.value?.toCPointer<ByteVar>(), ulsrcbuffersize, ppuchfontpackagebuffer?.value?.toCPointer<ByteVar>(), pulfontpackagebuffersize?.value?.toCPointer<ByteVar>(), pulbyteswritten?.value?.toCPointer<ByteVar>(), usflag, usttcindex, ussubsetformat, ussubsetlanguage, ussubsetplatform, ussubsetencoding, pussubsetkeeplist?.value?.toCPointer<ByteVar>(), ussubsetlistcount, 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpvreserved?.value?.toCPointer<ByteVar>())

public actual fun createFontW(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: UInt, bunderline: UInt, bstrikeout: UInt, icharset: UInt, ioutprecision: UInt, iclipprecision: UInt, iquality: UInt, ipitchandfamily: UInt, pszfacename: Pcwstr): Hfont =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createFontW(cheight, cwidth, cescapement, corientation, cweight, bitalic, bunderline, bstrikeout, icharset, ioutprecision, iclipprecision, iquality, ipitchandfamily, pszfacename?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createHalftonePalette(hdc: Hdc): Hpalette =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createHalftonePalette(hdc?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createHatchBrush(ihatch: HatchBrushStyle, color: Colorref): Hbrush =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createHatchBrush(ihatch, color)?.let { COpaquePointer(it.toLong()) }

public actual fun createICA(pszdriver: Pcstr, pszdevice: Pcstr, pszport: Pcstr, pdm: COpaquePointer?): Hdc =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createICA(pszdriver?.value?.toCPointer<ByteVar>(), pszdevice?.value?.toCPointer<ByteVar>(), pszport?.value?.toCPointer<ByteVar>(), pdm?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createICW(pszdriver: Pcwstr, pszdevice: Pcwstr, pszport: Pcwstr, pdm: COpaquePointer?): Hdc =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createICW(pszdriver?.value?.toCPointer<ByteVar>(), pszdevice?.value?.toCPointer<ByteVar>(), pszport?.value?.toCPointer<ByteVar>(), pdm?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createMetaFileA(pszfile: Pcstr): Hdc =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createMetaFileA(pszfile?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createMetaFileW(pszfile: Pcwstr): Hdc =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createMetaFileW(pszfile?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createPalette(plpal: COpaquePointer?): Hpalette =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createPalette(plpal?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createPatternBrush(hbm: Hbitmap): Hbrush =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createPatternBrush(hbm?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createPen(istyle: PenStyle, cwidth: Int, color: Colorref): Hpen =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createPen(istyle, cwidth, color)?.let { COpaquePointer(it.toLong()) }

public actual fun createPenIndirect(plpen: COpaquePointer?): Hpen =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createPenIndirect(plpen?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createPolyPolygonRgn(pptl: COpaquePointer?, pc: COpaquePointer?, cpoly: Int, imode: CreatePolygonRgnMode): Hrgn =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createPolyPolygonRgn(pptl?.value?.toCPointer<ByteVar>(), pc?.value?.toCPointer<ByteVar>(), cpoly, imode)?.let { COpaquePointer(it.toLong()) }

public actual fun createPolygonRgn(pptl: COpaquePointer?, cpoint: Int, imode: CreatePolygonRgnMode): Hrgn =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createPolygonRgn(pptl?.value?.toCPointer<ByteVar>(), cpoint, imode)?.let { COpaquePointer(it.toLong()) }

public actual fun createRectRgn(x1: Int, y1: Int, x2: Int, y2: Int): Hrgn =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createRectRgn(x1, y1, x2, y2)?.let { COpaquePointer(it.toLong()) }

public actual fun createRectRgnIndirect(lprect: COpaquePointer?): Hrgn =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createRectRgnIndirect(lprect?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun createRoundRectRgn(x1: Int, y1: Int, x2: Int, y2: Int, w: Int, h: Int): Hrgn =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createRoundRectRgn(x1, y1, x2, y2, w, h)?.let { COpaquePointer(it.toLong()) }

public actual fun createScalableFontResourceA(fdwhidden: UInt, lpszfont: Pcstr, lpszfile: Pcstr, lpszpath: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createScalableFontResourceA(fdwhidden, lpszfont?.value?.toCPointer<ByteVar>(), lpszfile?.value?.toCPointer<ByteVar>(), lpszpath?.value?.toCPointer<ByteVar>())

public actual fun createScalableFontResourceW(fdwhidden: UInt, lpszfont: Pcwstr, lpszfile: Pcwstr, lpszpath: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createScalableFontResourceW(fdwhidden, lpszfont?.value?.toCPointer<ByteVar>(), lpszfile?.value?.toCPointer<ByteVar>(), lpszpath?.value?.toCPointer<ByteVar>())

public actual fun createSolidBrush(color: Colorref): Hbrush =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_createSolidBrush(color)?.let { COpaquePointer(it.toLong()) }

public actual fun dPtoLP(hdc: Hdc, lppt: COpaquePointer?, c: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_dPtoLP(hdc?.value?.toCPointer<ByteVar>(), lppt?.value?.toCPointer<ByteVar>(), c)

public actual fun deleteDC(hdc: Hdc): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_deleteDC(hdc?.value?.toCPointer<ByteVar>())

public actual fun deleteEnhMetaFile(hmf: Henhmetafile): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_deleteEnhMetaFile(hmf?.value?.toCPointer<ByteVar>())

public actual fun deleteMetaFile(hmf: Hmetafile): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_deleteMetaFile(hmf?.value?.toCPointer<ByteVar>())

public actual fun deleteObject(ho: Hgdiobj): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_deleteObject(ho?.value?.toCPointer<ByteVar>())

public actual fun drawAnimatedRects(hwnd: Hwnd, idani: Int, lprcfrom: COpaquePointer?, lprcto: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_drawAnimatedRects(hwnd?.value?.toCPointer<ByteVar>(), idani, lprcfrom?.value?.toCPointer<ByteVar>(), lprcto?.value?.toCPointer<ByteVar>())

public actual fun drawCaption(hwnd: Hwnd, hdc: Hdc, lprect: COpaquePointer?, flags: DrawCaptionFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_drawCaption(hwnd?.value?.toCPointer<ByteVar>(), hdc?.value?.toCPointer<ByteVar>(), lprect?.value?.toCPointer<ByteVar>(), flags)

public actual fun drawEdge(hdc: Hdc, qrc: COpaquePointer?, edge: DrawedgeFlags, grfflags: DrawEdgeFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_drawEdge(hdc?.value?.toCPointer<ByteVar>(), qrc?.value?.toCPointer<ByteVar>(), edge, grfflags)

public actual fun drawEscape(hdc: Hdc, iescape: Int, cjin: Int, lpin: Pcstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_drawEscape(hdc?.value?.toCPointer<ByteVar>(), iescape, cjin, lpin?.value?.toCPointer<ByteVar>())

public actual fun drawFocusRect(hdc: Hdc, lprc: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_drawFocusRect(hdc?.value?.toCPointer<ByteVar>(), lprc?.value?.toCPointer<ByteVar>())

public actual fun drawFrameControl(param0: Hdc, param1: COpaquePointer?, param2: DfcType, param3: DfcsState): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_drawFrameControl(param0?.value?.toCPointer<ByteVar>(), param1?.value?.toCPointer<ByteVar>(), param2, param3)

public actual fun drawStateA(hdc: Hdc, hbrfore: Hbrush, qfncallback: Drawstateproc, ldata: Lparam, wdata: Wparam, x: Int, y: Int, cx: Int, cy: Int, uflags: DrawstateFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_drawStateA(hdc?.value?.toCPointer<ByteVar>(), hbrfore?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), ldata, wdata, x, y, cx, cy, uflags)

public actual fun drawStateW(hdc: Hdc, hbrfore: Hbrush, qfncallback: Drawstateproc, ldata: Lparam, wdata: Wparam, x: Int, y: Int, cx: Int, cy: Int, uflags: DrawstateFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_drawStateW(hdc?.value?.toCPointer<ByteVar>(), hbrfore?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), ldata, wdata, x, y, cx, cy, uflags)

public actual fun drawTextA(hdc: Hdc, lpchtext: Pcstr, cchtext: Int, lprc: COpaquePointer?, format: DrawTextFormat): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_drawTextA(hdc?.value?.toCPointer<ByteVar>(), lpchtext?.value?.toCPointer<ByteVar>(), cchtext, lprc?.value?.toCPointer<ByteVar>(), format)

public actual fun drawTextExA(hdc: Hdc, lpchtext: Pstr, cchtext: Int, lprc: COpaquePointer?, format: DrawTextFormat, lpdtp: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_drawTextExA(hdc?.value?.toCPointer<ByteVar>(), lpchtext?.value?.toCPointer<ByteVar>(), cchtext, lprc?.value?.toCPointer<ByteVar>(), format, lpdtp?.value?.toCPointer<ByteVar>())

public actual fun drawTextExW(hdc: Hdc, lpchtext: Pwstr, cchtext: Int, lprc: COpaquePointer?, format: DrawTextFormat, lpdtp: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_drawTextExW(hdc?.value?.toCPointer<ByteVar>(), lpchtext?.value?.toCPointer<ByteVar>(), cchtext, lprc?.value?.toCPointer<ByteVar>(), format, lpdtp?.value?.toCPointer<ByteVar>())

public actual fun drawTextW(hdc: Hdc, lpchtext: Pcwstr, cchtext: Int, lprc: COpaquePointer?, format: DrawTextFormat): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_drawTextW(hdc?.value?.toCPointer<ByteVar>(), lpchtext?.value?.toCPointer<ByteVar>(), cchtext, lprc?.value?.toCPointer<ByteVar>(), format)

public actual fun ellipse(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_ellipse(hdc?.value?.toCPointer<ByteVar>(), left, top, right, bottom)

public actual fun endPaint(hwnd: Hwnd, lppaint: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_endPaint(hwnd?.value?.toCPointer<ByteVar>(), lppaint?.value?.toCPointer<ByteVar>())

public actual fun endPath(hdc: Hdc): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_endPath(hdc?.value?.toCPointer<ByteVar>())

public actual fun enumDisplayDevicesA(lpdevice: Pcstr, idevnum: UInt, lpdisplaydevice: COpaquePointer?, dwflags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_enumDisplayDevicesA(lpdevice?.value?.toCPointer<ByteVar>(), idevnum, lpdisplaydevice?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun enumDisplayDevicesW(lpdevice: Pcwstr, idevnum: UInt, lpdisplaydevice: COpaquePointer?, dwflags: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_enumDisplayDevicesW(lpdevice?.value?.toCPointer<ByteVar>(), idevnum, lpdisplaydevice?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun enumDisplayMonitors(hdc: Hdc, lprcclip: COpaquePointer?, lpfnenum: Monitorenumproc, dwdata: Lparam): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_enumDisplayMonitors(hdc?.value?.toCPointer<ByteVar>(), lprcclip?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), dwdata)

public actual fun enumDisplaySettingsA(lpszdevicename: Pcstr, imodenum: EnumDisplaySettingsMode, lpdevmode: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_enumDisplaySettingsA(lpszdevicename?.value?.toCPointer<ByteVar>(), imodenum, lpdevmode?.value?.toCPointer<ByteVar>())

public actual fun enumDisplaySettingsExA(lpszdevicename: Pcstr, imodenum: EnumDisplaySettingsMode, lpdevmode: COpaquePointer?, dwflags: EnumDisplaySettingsFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_enumDisplaySettingsExA(lpszdevicename?.value?.toCPointer<ByteVar>(), imodenum, lpdevmode?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun enumDisplaySettingsExW(lpszdevicename: Pcwstr, imodenum: EnumDisplaySettingsMode, lpdevmode: COpaquePointer?, dwflags: EnumDisplaySettingsFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_enumDisplaySettingsExW(lpszdevicename?.value?.toCPointer<ByteVar>(), imodenum, lpdevmode?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun enumDisplaySettingsW(lpszdevicename: Pcwstr, imodenum: EnumDisplaySettingsMode, lpdevmode: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_enumDisplaySettingsW(lpszdevicename?.value?.toCPointer<ByteVar>(), imodenum, lpdevmode?.value?.toCPointer<ByteVar>())

public actual fun enumEnhMetaFile(hdc: Hdc, hmf: Henhmetafile, proc: Enhmfenumproc, param3: COpaquePointer?, lprect: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_enumEnhMetaFile(hdc?.value?.toCPointer<ByteVar>(), hmf?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), param3?.value?.toCPointer<ByteVar>(), lprect?.value?.toCPointer<ByteVar>())

public actual fun enumFontFamiliesA(hdc: Hdc, lplogfont: Pcstr, lpproc: Fontenumproca, lparam: Lparam): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_enumFontFamiliesA(hdc?.value?.toCPointer<ByteVar>(), lplogfont?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam)

public actual fun enumFontFamiliesExA(hdc: Hdc, lplogfont: COpaquePointer?, lpproc: Fontenumproca, lparam: Lparam, dwflags: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_enumFontFamiliesExA(hdc?.value?.toCPointer<ByteVar>(), lplogfont?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam, dwflags)

public actual fun enumFontFamiliesExW(hdc: Hdc, lplogfont: COpaquePointer?, lpproc: Fontenumprocw, lparam: Lparam, dwflags: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_enumFontFamiliesExW(hdc?.value?.toCPointer<ByteVar>(), lplogfont?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam, dwflags)

public actual fun enumFontFamiliesW(hdc: Hdc, lplogfont: Pcwstr, lpproc: Fontenumprocw, lparam: Lparam): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_enumFontFamiliesW(hdc?.value?.toCPointer<ByteVar>(), lplogfont?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam)

public actual fun enumFontsA(hdc: Hdc, lplogfont: Pcstr, lpproc: Fontenumproca, lparam: Lparam): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_enumFontsA(hdc?.value?.toCPointer<ByteVar>(), lplogfont?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam)

public actual fun enumFontsW(hdc: Hdc, lplogfont: Pcwstr, lpproc: Fontenumprocw, lparam: Lparam): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_enumFontsW(hdc?.value?.toCPointer<ByteVar>(), lplogfont?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lparam)

public actual fun enumMetaFile(hdc: Hdc, hmf: Hmetafile, proc: Mfenumproc, param3: Lparam): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_enumMetaFile(hdc?.value?.toCPointer<ByteVar>(), hmf?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), param3)

public actual fun enumObjects(hdc: Hdc, ntype: ObjType, lpfunc: Gobjenumproc, lparam: Lparam): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_enumObjects(hdc?.value?.toCPointer<ByteVar>(), ntype, 0L.toCPointer<ByteVar>(), lparam)

public actual fun equalRect(lprc1: COpaquePointer?, lprc2: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_equalRect(lprc1?.value?.toCPointer<ByteVar>(), lprc2?.value?.toCPointer<ByteVar>())

public actual fun equalRgn(hrgn1: Hrgn, hrgn2: Hrgn): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_equalRgn(hrgn1?.value?.toCPointer<ByteVar>(), hrgn2?.value?.toCPointer<ByteVar>())

public actual fun excludeClipRect(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): GdiRegionType =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_excludeClipRect(hdc?.value?.toCPointer<ByteVar>(), left, top, right, bottom)

public actual fun excludeUpdateRgn(hdc: Hdc, hwnd: Hwnd): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_excludeUpdateRgn(hdc?.value?.toCPointer<ByteVar>(), hwnd?.value?.toCPointer<ByteVar>())

public actual fun extCreatePen(ipenstyle: UInt, cwidth: UInt, plbrush: COpaquePointer?, cstyle: UInt, pstyle: COpaquePointer?): Hpen =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_extCreatePen(ipenstyle, cwidth, plbrush?.value?.toCPointer<ByteVar>(), cstyle, pstyle?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun extCreateRegion(lpx: COpaquePointer?, ncount: UInt, lpdata: COpaquePointer?): Hrgn =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_extCreateRegion(lpx?.value?.toCPointer<ByteVar>(), ncount, lpdata?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun extFloodFill(hdc: Hdc, x: Int, y: Int, color: Colorref, type: ExtFloodFillType): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_extFloodFill(hdc?.value?.toCPointer<ByteVar>(), x, y, color, type)

public actual fun extSelectClipRgn(hdc: Hdc, hrgn: Hrgn, mode: RgnCombineMode): GdiRegionType =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_extSelectClipRgn(hdc?.value?.toCPointer<ByteVar>(), hrgn?.value?.toCPointer<ByteVar>(), mode)

public actual fun extTextOutA(hdc: Hdc, x: Int, y: Int, options: EtoOptions, lprect: COpaquePointer?, lpstring: Pcstr, c: UInt, lpdx: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_extTextOutA(hdc?.value?.toCPointer<ByteVar>(), x, y, options, lprect?.value?.toCPointer<ByteVar>(), lpstring?.value?.toCPointer<ByteVar>(), c, lpdx?.value?.toCPointer<ByteVar>())

public actual fun extTextOutW(hdc: Hdc, x: Int, y: Int, options: EtoOptions, lprect: COpaquePointer?, lpstring: Pcwstr, c: UInt, lpdx: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_extTextOutW(hdc?.value?.toCPointer<ByteVar>(), x, y, options, lprect?.value?.toCPointer<ByteVar>(), lpstring?.value?.toCPointer<ByteVar>(), c, lpdx?.value?.toCPointer<ByteVar>())

public actual fun fillPath(hdc: Hdc): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_fillPath(hdc?.value?.toCPointer<ByteVar>())

public actual fun fillRect(hdc: Hdc, lprc: COpaquePointer?, hbr: Hbrush): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_fillRect(hdc?.value?.toCPointer<ByteVar>(), lprc?.value?.toCPointer<ByteVar>(), hbr?.value?.toCPointer<ByteVar>())

public actual fun fillRgn(hdc: Hdc, hrgn: Hrgn, hbr: Hbrush): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_fillRgn(hdc?.value?.toCPointer<ByteVar>(), hrgn?.value?.toCPointer<ByteVar>(), hbr?.value?.toCPointer<ByteVar>())

public actual fun fixBrushOrgEx(hdc: Hdc, x: Int, y: Int, ptl: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_fixBrushOrgEx(hdc?.value?.toCPointer<ByteVar>(), x, y, ptl?.value?.toCPointer<ByteVar>())

public actual fun flattenPath(hdc: Hdc): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_flattenPath(hdc?.value?.toCPointer<ByteVar>())

public actual fun floodFill(hdc: Hdc, x: Int, y: Int, color: Colorref): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_floodFill(hdc?.value?.toCPointer<ByteVar>(), x, y, color)

public actual fun frameRect(hdc: Hdc, lprc: COpaquePointer?, hbr: Hbrush): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_frameRect(hdc?.value?.toCPointer<ByteVar>(), lprc?.value?.toCPointer<ByteVar>(), hbr?.value?.toCPointer<ByteVar>())

public actual fun frameRgn(hdc: Hdc, hrgn: Hrgn, hbr: Hbrush, w: Int, h: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_frameRgn(hdc?.value?.toCPointer<ByteVar>(), hrgn?.value?.toCPointer<ByteVar>(), hbr?.value?.toCPointer<ByteVar>(), w, h)

public actual fun gdiAlphaBlend(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, ftn: Blendfunction): Bool =
    0

public actual fun gdiComment(hdc: Hdc, nsize: UInt, lpdata: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_gdiComment(hdc?.value?.toCPointer<ByteVar>(), nsize, lpdata?.value?.toCPointer<ByteVar>())

public actual fun gdiFlush(): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_gdiFlush()

public actual fun gdiGetBatchLimit(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_gdiGetBatchLimit()

public actual fun gdiGradientFill(hdc: Hdc, pvertex: COpaquePointer?, nvertex: UInt, pmesh: COpaquePointer?, ncount: UInt, ulmode: GradientFill): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_gdiGradientFill(hdc?.value?.toCPointer<ByteVar>(), pvertex?.value?.toCPointer<ByteVar>(), nvertex, pmesh?.value?.toCPointer<ByteVar>(), ncount, ulmode)

public actual fun gdiSetBatchLimit(dw: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_gdiSetBatchLimit(dw)

public actual fun gdiTransparentBlt(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_gdiTransparentBlt(hdcdest?.value?.toCPointer<ByteVar>(), xorigindest, yorigindest, wdest, hdest, hdcsrc?.value?.toCPointer<ByteVar>(), xoriginsrc, yoriginsrc, wsrc, hsrc, crtransparent)

public actual fun getArcDirection(hdc: Hdc): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getArcDirection(hdc?.value?.toCPointer<ByteVar>())

public actual fun getAspectRatioFilterEx(hdc: Hdc, lpsize: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getAspectRatioFilterEx(hdc?.value?.toCPointer<ByteVar>(), lpsize?.value?.toCPointer<ByteVar>())

public actual fun getBitmapBits(hbit: Hbitmap, cb: Int, lpvbits: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getBitmapBits(hbit?.value?.toCPointer<ByteVar>(), cb, lpvbits?.value?.toCPointer<ByteVar>())

public actual fun getBitmapDimensionEx(hbit: Hbitmap, lpsize: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getBitmapDimensionEx(hbit?.value?.toCPointer<ByteVar>(), lpsize?.value?.toCPointer<ByteVar>())

public actual fun getBkColor(hdc: Hdc): Colorref =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getBkColor(hdc?.value?.toCPointer<ByteVar>())

public actual fun getBkMode(hdc: Hdc): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getBkMode(hdc?.value?.toCPointer<ByteVar>())

public actual fun getBoundsRect(hdc: Hdc, lprect: COpaquePointer?, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getBoundsRect(hdc?.value?.toCPointer<ByteVar>(), lprect?.value?.toCPointer<ByteVar>(), flags)

public actual fun getBrushOrgEx(hdc: Hdc, lppt: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getBrushOrgEx(hdc?.value?.toCPointer<ByteVar>(), lppt?.value?.toCPointer<ByteVar>())

public actual fun getCharABCWidthsA(hdc: Hdc, wfirst: UInt, wlast: UInt, lpabc: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getCharABCWidthsA(hdc?.value?.toCPointer<ByteVar>(), wfirst, wlast, lpabc?.value?.toCPointer<ByteVar>())

public actual fun getCharABCWidthsFloatA(hdc: Hdc, ifirst: UInt, ilast: UInt, lpabc: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getCharABCWidthsFloatA(hdc?.value?.toCPointer<ByteVar>(), ifirst, ilast, lpabc?.value?.toCPointer<ByteVar>())

public actual fun getCharABCWidthsFloatW(hdc: Hdc, ifirst: UInt, ilast: UInt, lpabc: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getCharABCWidthsFloatW(hdc?.value?.toCPointer<ByteVar>(), ifirst, ilast, lpabc?.value?.toCPointer<ByteVar>())

public actual fun getCharABCWidthsI(hdc: Hdc, gifirst: UInt, cgi: UInt, pgi: COpaquePointer?, pabc: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getCharABCWidthsI(hdc?.value?.toCPointer<ByteVar>(), gifirst, cgi, pgi?.value?.toCPointer<ByteVar>(), pabc?.value?.toCPointer<ByteVar>())

public actual fun getCharABCWidthsW(hdc: Hdc, wfirst: UInt, wlast: UInt, lpabc: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getCharABCWidthsW(hdc?.value?.toCPointer<ByteVar>(), wfirst, wlast, lpabc?.value?.toCPointer<ByteVar>())

public actual fun getCharWidth32A(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getCharWidth32A(hdc?.value?.toCPointer<ByteVar>(), ifirst, ilast, lpbuffer?.value?.toCPointer<ByteVar>())

public actual fun getCharWidth32W(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getCharWidth32W(hdc?.value?.toCPointer<ByteVar>(), ifirst, ilast, lpbuffer?.value?.toCPointer<ByteVar>())

public actual fun getCharWidthA(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getCharWidthA(hdc?.value?.toCPointer<ByteVar>(), ifirst, ilast, lpbuffer?.value?.toCPointer<ByteVar>())

public actual fun getCharWidthFloatA(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getCharWidthFloatA(hdc?.value?.toCPointer<ByteVar>(), ifirst, ilast, lpbuffer?.value?.toCPointer<ByteVar>())

public actual fun getCharWidthFloatW(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getCharWidthFloatW(hdc?.value?.toCPointer<ByteVar>(), ifirst, ilast, lpbuffer?.value?.toCPointer<ByteVar>())

public actual fun getCharWidthI(hdc: Hdc, gifirst: UInt, cgi: UInt, pgi: COpaquePointer?, piwidths: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getCharWidthI(hdc?.value?.toCPointer<ByteVar>(), gifirst, cgi, pgi?.value?.toCPointer<ByteVar>(), piwidths?.value?.toCPointer<ByteVar>())

public actual fun getCharWidthW(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getCharWidthW(hdc?.value?.toCPointer<ByteVar>(), ifirst, ilast, lpbuffer?.value?.toCPointer<ByteVar>())

public actual fun getCharacterPlacementA(hdc: Hdc, lpstring: Pcstr, ncount: Int, nmexextent: Int, lpresults: COpaquePointer?, dwflags: GetCharacterPlacementFlags): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getCharacterPlacementA(hdc?.value?.toCPointer<ByteVar>(), lpstring?.value?.toCPointer<ByteVar>(), ncount, nmexextent, lpresults?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun getCharacterPlacementW(hdc: Hdc, lpstring: Pcwstr, ncount: Int, nmexextent: Int, lpresults: COpaquePointer?, dwflags: GetCharacterPlacementFlags): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getCharacterPlacementW(hdc?.value?.toCPointer<ByteVar>(), lpstring?.value?.toCPointer<ByteVar>(), ncount, nmexextent, lpresults?.value?.toCPointer<ByteVar>(), dwflags)

public actual fun getClipBox(hdc: Hdc, lprect: COpaquePointer?): GdiRegionType =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getClipBox(hdc?.value?.toCPointer<ByteVar>(), lprect?.value?.toCPointer<ByteVar>())

public actual fun getClipRgn(hdc: Hdc, hrgn: Hrgn): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getClipRgn(hdc?.value?.toCPointer<ByteVar>(), hrgn?.value?.toCPointer<ByteVar>())

public actual fun getColorAdjustment(hdc: Hdc, lpca: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getColorAdjustment(hdc?.value?.toCPointer<ByteVar>(), lpca?.value?.toCPointer<ByteVar>())

public actual fun getCurrentObject(hdc: Hdc, type: UInt): Hgdiobj =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getCurrentObject(hdc?.value?.toCPointer<ByteVar>(), type)?.let { COpaquePointer(it.toLong()) }

public actual fun getCurrentPositionEx(hdc: Hdc, lppt: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getCurrentPositionEx(hdc?.value?.toCPointer<ByteVar>(), lppt?.value?.toCPointer<ByteVar>())

public actual fun getDC(hwnd: Hwnd): Hdc =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getDC(hwnd?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getDCBrushColor(hdc: Hdc): Colorref =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getDCBrushColor(hdc?.value?.toCPointer<ByteVar>())

public actual fun getDCEx(hwnd: Hwnd, hrgnclip: Hrgn, flags: GetDcxFlags): Hdc =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getDCEx(hwnd?.value?.toCPointer<ByteVar>(), hrgnclip?.value?.toCPointer<ByteVar>(), flags)?.let { COpaquePointer(it.toLong()) }

public actual fun getDCOrgEx(hdc: Hdc, lppt: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getDCOrgEx(hdc?.value?.toCPointer<ByteVar>(), lppt?.value?.toCPointer<ByteVar>())

public actual fun getDCPenColor(hdc: Hdc): Colorref =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getDCPenColor(hdc?.value?.toCPointer<ByteVar>())

public actual fun getDIBColorTable(hdc: Hdc, istart: UInt, centries: UInt, prgbq: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getDIBColorTable(hdc?.value?.toCPointer<ByteVar>(), istart, centries, prgbq?.value?.toCPointer<ByteVar>())

public actual fun getDIBits(hdc: Hdc, hbm: Hbitmap, start: UInt, clines: UInt, lpvbits: COpaquePointer?, lpbmi: COpaquePointer?, usage: DibUsage): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getDIBits(hdc?.value?.toCPointer<ByteVar>(), hbm?.value?.toCPointer<ByteVar>(), start, clines, lpvbits?.value?.toCPointer<ByteVar>(), lpbmi?.value?.toCPointer<ByteVar>(), usage)

public actual fun getDeviceCaps(hdc: Hdc, index: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getDeviceCaps(hdc?.value?.toCPointer<ByteVar>(), index)

public actual fun getEnhMetaFileA(lpname: Pcstr): Henhmetafile =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getEnhMetaFileA(lpname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getEnhMetaFileBits(hemf: Henhmetafile, nsize: UInt, lpdata: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getEnhMetaFileBits(hemf?.value?.toCPointer<ByteVar>(), nsize, lpdata?.value?.toCPointer<ByteVar>())

public actual fun getEnhMetaFileDescriptionA(hemf: Henhmetafile, cchbuffer: UInt, lpdescription: Pstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getEnhMetaFileDescriptionA(hemf?.value?.toCPointer<ByteVar>(), cchbuffer, lpdescription?.value?.toCPointer<ByteVar>())

public actual fun getEnhMetaFileDescriptionW(hemf: Henhmetafile, cchbuffer: UInt, lpdescription: Pwstr): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getEnhMetaFileDescriptionW(hemf?.value?.toCPointer<ByteVar>(), cchbuffer, lpdescription?.value?.toCPointer<ByteVar>())

public actual fun getEnhMetaFileHeader(hemf: Henhmetafile, nsize: UInt, lpenhmetaheader: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getEnhMetaFileHeader(hemf?.value?.toCPointer<ByteVar>(), nsize, lpenhmetaheader?.value?.toCPointer<ByteVar>())

public actual fun getEnhMetaFilePaletteEntries(hemf: Henhmetafile, nnumentries: UInt, lppaletteentries: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getEnhMetaFilePaletteEntries(hemf?.value?.toCPointer<ByteVar>(), nnumentries, lppaletteentries?.value?.toCPointer<ByteVar>())

public actual fun getEnhMetaFileW(lpname: Pcwstr): Henhmetafile =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getEnhMetaFileW(lpname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getFontData(hdc: Hdc, dwtable: UInt, dwoffset: UInt, pvbuffer: COpaquePointer?, cjbuffer: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getFontData(hdc?.value?.toCPointer<ByteVar>(), dwtable, dwoffset, pvbuffer?.value?.toCPointer<ByteVar>(), cjbuffer)

public actual fun getFontLanguageInfo(hdc: Hdc): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getFontLanguageInfo(hdc?.value?.toCPointer<ByteVar>())

public actual fun getFontUnicodeRanges(hdc: Hdc, lpgs: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getFontUnicodeRanges(hdc?.value?.toCPointer<ByteVar>(), lpgs?.value?.toCPointer<ByteVar>())

public actual fun getGlyphIndicesA(hdc: Hdc, lpstr: Pcstr, c: Int, pgi: COpaquePointer?, fl: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getGlyphIndicesA(hdc?.value?.toCPointer<ByteVar>(), lpstr?.value?.toCPointer<ByteVar>(), c, pgi?.value?.toCPointer<ByteVar>(), fl)

public actual fun getGlyphIndicesW(hdc: Hdc, lpstr: Pcwstr, c: Int, pgi: COpaquePointer?, fl: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getGlyphIndicesW(hdc?.value?.toCPointer<ByteVar>(), lpstr?.value?.toCPointer<ByteVar>(), c, pgi?.value?.toCPointer<ByteVar>(), fl)

public actual fun getGlyphOutlineA(hdc: Hdc, uchar: UInt, fuformat: GetGlyphOutlineFormat, lpgm: COpaquePointer?, cjbuffer: UInt, pvbuffer: COpaquePointer?, lpmat2: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getGlyphOutlineA(hdc?.value?.toCPointer<ByteVar>(), uchar, fuformat, lpgm?.value?.toCPointer<ByteVar>(), cjbuffer, pvbuffer?.value?.toCPointer<ByteVar>(), lpmat2?.value?.toCPointer<ByteVar>())

public actual fun getGlyphOutlineW(hdc: Hdc, uchar: UInt, fuformat: GetGlyphOutlineFormat, lpgm: COpaquePointer?, cjbuffer: UInt, pvbuffer: COpaquePointer?, lpmat2: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getGlyphOutlineW(hdc?.value?.toCPointer<ByteVar>(), uchar, fuformat, lpgm?.value?.toCPointer<ByteVar>(), cjbuffer, pvbuffer?.value?.toCPointer<ByteVar>(), lpmat2?.value?.toCPointer<ByteVar>())

public actual fun getGraphicsMode(hdc: Hdc): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getGraphicsMode(hdc?.value?.toCPointer<ByteVar>())

public actual fun getKerningPairsA(hdc: Hdc, npairs: UInt, lpkernpair: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getKerningPairsA(hdc?.value?.toCPointer<ByteVar>(), npairs, lpkernpair?.value?.toCPointer<ByteVar>())

public actual fun getKerningPairsW(hdc: Hdc, npairs: UInt, lpkernpair: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getKerningPairsW(hdc?.value?.toCPointer<ByteVar>(), npairs, lpkernpair?.value?.toCPointer<ByteVar>())

public actual fun getLayout(hdc: Hdc): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getLayout(hdc?.value?.toCPointer<ByteVar>())

public actual fun getMapMode(hdc: Hdc): HdcMapMode =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getMapMode(hdc?.value?.toCPointer<ByteVar>())

public actual fun getMetaFileA(lpname: Pcstr): Hmetafile =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getMetaFileA(lpname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getMetaFileBitsEx(hmf: Hmetafile, cbbuffer: UInt, lpdata: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getMetaFileBitsEx(hmf?.value?.toCPointer<ByteVar>(), cbbuffer, lpdata?.value?.toCPointer<ByteVar>())

public actual fun getMetaFileW(lpname: Pcwstr): Hmetafile =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getMetaFileW(lpname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getMetaRgn(hdc: Hdc, hrgn: Hrgn): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getMetaRgn(hdc?.value?.toCPointer<ByteVar>(), hrgn?.value?.toCPointer<ByteVar>())

public actual fun getMiterLimit(hdc: Hdc, plimit: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getMiterLimit(hdc?.value?.toCPointer<ByteVar>(), plimit?.value?.toCPointer<ByteVar>())

public actual fun getMonitorInfoA(hmonitor: Hmonitor, lpmi: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getMonitorInfoA(hmonitor?.value?.toCPointer<ByteVar>(), lpmi?.value?.toCPointer<ByteVar>())

public actual fun getMonitorInfoW(hmonitor: Hmonitor, lpmi: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getMonitorInfoW(hmonitor?.value?.toCPointer<ByteVar>(), lpmi?.value?.toCPointer<ByteVar>())

public actual fun getNearestColor(hdc: Hdc, color: Colorref): Colorref =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getNearestColor(hdc?.value?.toCPointer<ByteVar>(), color)

public actual fun getNearestPaletteIndex(h: Hpalette, color: Colorref): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getNearestPaletteIndex(h?.value?.toCPointer<ByteVar>(), color)

public actual fun getObjectA(h: Hgdiobj, c: Int, pv: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getObjectA(h?.value?.toCPointer<ByteVar>(), c, pv?.value?.toCPointer<ByteVar>())

public actual fun getObjectType(h: Hgdiobj): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getObjectType(h?.value?.toCPointer<ByteVar>())

public actual fun getObjectW(h: Hgdiobj, c: Int, pv: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getObjectW(h?.value?.toCPointer<ByteVar>(), c, pv?.value?.toCPointer<ByteVar>())

public actual fun getOutlineTextMetricsA(hdc: Hdc, cjcopy: UInt, potm: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getOutlineTextMetricsA(hdc?.value?.toCPointer<ByteVar>(), cjcopy, potm?.value?.toCPointer<ByteVar>())

public actual fun getOutlineTextMetricsW(hdc: Hdc, cjcopy: UInt, potm: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getOutlineTextMetricsW(hdc?.value?.toCPointer<ByteVar>(), cjcopy, potm?.value?.toCPointer<ByteVar>())

public actual fun getPaletteEntries(hpal: Hpalette, istart: UInt, centries: UInt, ppalentries: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getPaletteEntries(hpal?.value?.toCPointer<ByteVar>(), istart, centries, ppalentries?.value?.toCPointer<ByteVar>())

public actual fun getPath(hdc: Hdc, apt: COpaquePointer?, aj: COpaquePointer?, cpt: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getPath(hdc?.value?.toCPointer<ByteVar>(), apt?.value?.toCPointer<ByteVar>(), aj?.value?.toCPointer<ByteVar>(), cpt)

public actual fun getPixel(hdc: Hdc, x: Int, y: Int): Colorref =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getPixel(hdc?.value?.toCPointer<ByteVar>(), x, y)

public actual fun getPolyFillMode(hdc: Hdc): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getPolyFillMode(hdc?.value?.toCPointer<ByteVar>())

public actual fun getROP2(hdc: Hdc): R2Mode =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getROP2(hdc?.value?.toCPointer<ByteVar>())

public actual fun getRandomRgn(hdc: Hdc, hrgn: Hrgn, i: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getRandomRgn(hdc?.value?.toCPointer<ByteVar>(), hrgn?.value?.toCPointer<ByteVar>(), i)

public actual fun getRasterizerCaps(lpraststat: COpaquePointer?, cjbytes: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getRasterizerCaps(lpraststat?.value?.toCPointer<ByteVar>(), cjbytes)

public actual fun getRegionData(hrgn: Hrgn, ncount: UInt, lprgndata: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getRegionData(hrgn?.value?.toCPointer<ByteVar>(), ncount, lprgndata?.value?.toCPointer<ByteVar>())

public actual fun getRgnBox(hrgn: Hrgn, lprc: COpaquePointer?): GdiRegionType =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getRgnBox(hrgn?.value?.toCPointer<ByteVar>(), lprc?.value?.toCPointer<ByteVar>())

public actual fun getStockObject(i: GetStockObjectFlags): Hgdiobj =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getStockObject(i)?.let { COpaquePointer(it.toLong()) }

public actual fun getStretchBltMode(hdc: Hdc): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getStretchBltMode(hdc?.value?.toCPointer<ByteVar>())

public actual fun getSysColor(nindex: SysColorIndex): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getSysColor(nindex)

public actual fun getSysColorBrush(nindex: SysColorIndex): Hbrush =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getSysColorBrush(nindex)?.let { COpaquePointer(it.toLong()) }

public actual fun getSystemPaletteEntries(hdc: Hdc, istart: UInt, centries: UInt, ppalentries: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getSystemPaletteEntries(hdc?.value?.toCPointer<ByteVar>(), istart, centries, ppalentries?.value?.toCPointer<ByteVar>())

public actual fun getSystemPaletteUse(hdc: Hdc): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getSystemPaletteUse(hdc?.value?.toCPointer<ByteVar>())

public actual fun getTabbedTextExtentA(hdc: Hdc, lpstring: Pcstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getTabbedTextExtentA(hdc?.value?.toCPointer<ByteVar>(), lpstring?.value?.toCPointer<ByteVar>(), chcount, ntabpositions, lpntabstoppositions?.value?.toCPointer<ByteVar>())

public actual fun getTabbedTextExtentW(hdc: Hdc, lpstring: Pcwstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getTabbedTextExtentW(hdc?.value?.toCPointer<ByteVar>(), lpstring?.value?.toCPointer<ByteVar>(), chcount, ntabpositions, lpntabstoppositions?.value?.toCPointer<ByteVar>())

public actual fun getTextAlign(hdc: Hdc): TextAlignOptions =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getTextAlign(hdc?.value?.toCPointer<ByteVar>())

public actual fun getTextCharacterExtra(hdc: Hdc): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getTextCharacterExtra(hdc?.value?.toCPointer<ByteVar>())

public actual fun getTextColor(hdc: Hdc): Colorref =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getTextColor(hdc?.value?.toCPointer<ByteVar>())

public actual fun getTextExtentExPointA(hdc: Hdc, lpszstring: Pcstr, cchstring: Int, nmaxextent: Int, lpnfit: COpaquePointer?, lpndx: COpaquePointer?, lpsize: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getTextExtentExPointA(hdc?.value?.toCPointer<ByteVar>(), lpszstring?.value?.toCPointer<ByteVar>(), cchstring, nmaxextent, lpnfit?.value?.toCPointer<ByteVar>(), lpndx?.value?.toCPointer<ByteVar>(), lpsize?.value?.toCPointer<ByteVar>())

public actual fun getTextExtentExPointI(hdc: Hdc, lpwszstring: COpaquePointer?, cwchstring: Int, nmaxextent: Int, lpnfit: COpaquePointer?, lpndx: COpaquePointer?, lpsize: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getTextExtentExPointI(hdc?.value?.toCPointer<ByteVar>(), lpwszstring?.value?.toCPointer<ByteVar>(), cwchstring, nmaxextent, lpnfit?.value?.toCPointer<ByteVar>(), lpndx?.value?.toCPointer<ByteVar>(), lpsize?.value?.toCPointer<ByteVar>())

public actual fun getTextExtentExPointW(hdc: Hdc, lpszstring: Pcwstr, cchstring: Int, nmaxextent: Int, lpnfit: COpaquePointer?, lpndx: COpaquePointer?, lpsize: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getTextExtentExPointW(hdc?.value?.toCPointer<ByteVar>(), lpszstring?.value?.toCPointer<ByteVar>(), cchstring, nmaxextent, lpnfit?.value?.toCPointer<ByteVar>(), lpndx?.value?.toCPointer<ByteVar>(), lpsize?.value?.toCPointer<ByteVar>())

public actual fun getTextExtentPoint32A(hdc: Hdc, lpstring: Pcstr, c: Int, psizl: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getTextExtentPoint32A(hdc?.value?.toCPointer<ByteVar>(), lpstring?.value?.toCPointer<ByteVar>(), c, psizl?.value?.toCPointer<ByteVar>())

public actual fun getTextExtentPoint32W(hdc: Hdc, lpstring: Pcwstr, c: Int, psizl: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getTextExtentPoint32W(hdc?.value?.toCPointer<ByteVar>(), lpstring?.value?.toCPointer<ByteVar>(), c, psizl?.value?.toCPointer<ByteVar>())

public actual fun getTextExtentPointA(hdc: Hdc, lpstring: Pcstr, c: Int, lpsz: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getTextExtentPointA(hdc?.value?.toCPointer<ByteVar>(), lpstring?.value?.toCPointer<ByteVar>(), c, lpsz?.value?.toCPointer<ByteVar>())

public actual fun getTextExtentPointI(hdc: Hdc, pgiin: COpaquePointer?, cgi: Int, psize: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getTextExtentPointI(hdc?.value?.toCPointer<ByteVar>(), pgiin?.value?.toCPointer<ByteVar>(), cgi, psize?.value?.toCPointer<ByteVar>())

public actual fun getTextExtentPointW(hdc: Hdc, lpstring: Pcwstr, c: Int, lpsz: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getTextExtentPointW(hdc?.value?.toCPointer<ByteVar>(), lpstring?.value?.toCPointer<ByteVar>(), c, lpsz?.value?.toCPointer<ByteVar>())

public actual fun getTextFaceA(hdc: Hdc, c: Int, lpname: Pstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getTextFaceA(hdc?.value?.toCPointer<ByteVar>(), c, lpname?.value?.toCPointer<ByteVar>())

public actual fun getTextFaceW(hdc: Hdc, c: Int, lpname: Pwstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getTextFaceW(hdc?.value?.toCPointer<ByteVar>(), c, lpname?.value?.toCPointer<ByteVar>())

public actual fun getTextMetricsA(hdc: Hdc, lptm: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getTextMetricsA(hdc?.value?.toCPointer<ByteVar>(), lptm?.value?.toCPointer<ByteVar>())

public actual fun getTextMetricsW(hdc: Hdc, lptm: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getTextMetricsW(hdc?.value?.toCPointer<ByteVar>(), lptm?.value?.toCPointer<ByteVar>())

public actual fun getUpdateRect(hwnd: Hwnd, lprect: COpaquePointer?, berase: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getUpdateRect(hwnd?.value?.toCPointer<ByteVar>(), lprect?.value?.toCPointer<ByteVar>(), berase)

public actual fun getUpdateRgn(hwnd: Hwnd, hrgn: Hrgn, berase: Bool): GdiRegionType =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getUpdateRgn(hwnd?.value?.toCPointer<ByteVar>(), hrgn?.value?.toCPointer<ByteVar>(), berase)

public actual fun getViewportExtEx(hdc: Hdc, lpsize: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getViewportExtEx(hdc?.value?.toCPointer<ByteVar>(), lpsize?.value?.toCPointer<ByteVar>())

public actual fun getViewportOrgEx(hdc: Hdc, lppoint: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getViewportOrgEx(hdc?.value?.toCPointer<ByteVar>(), lppoint?.value?.toCPointer<ByteVar>())

public actual fun getWinMetaFileBits(hemf: Henhmetafile, cbdata16: UInt, pdata16: COpaquePointer?, imapmode: Int, hdcref: Hdc): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getWinMetaFileBits(hemf?.value?.toCPointer<ByteVar>(), cbdata16, pdata16?.value?.toCPointer<ByteVar>(), imapmode, hdcref?.value?.toCPointer<ByteVar>())

public actual fun getWindowDC(hwnd: Hwnd): Hdc =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getWindowDC(hwnd?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getWindowExtEx(hdc: Hdc, lpsize: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getWindowExtEx(hdc?.value?.toCPointer<ByteVar>(), lpsize?.value?.toCPointer<ByteVar>())

public actual fun getWindowOrgEx(hdc: Hdc, lppoint: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getWindowOrgEx(hdc?.value?.toCPointer<ByteVar>(), lppoint?.value?.toCPointer<ByteVar>())

public actual fun getWindowRgn(hwnd: Hwnd, hrgn: Hrgn): GdiRegionType =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getWindowRgn(hwnd?.value?.toCPointer<ByteVar>(), hrgn?.value?.toCPointer<ByteVar>())

public actual fun getWindowRgnBox(hwnd: Hwnd, lprc: COpaquePointer?): GdiRegionType =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getWindowRgnBox(hwnd?.value?.toCPointer<ByteVar>(), lprc?.value?.toCPointer<ByteVar>())

public actual fun getWorldTransform(hdc: Hdc, lpxf: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_getWorldTransform(hdc?.value?.toCPointer<ByteVar>(), lpxf?.value?.toCPointer<ByteVar>())

public actual fun gradientFill(hdc: Hdc, pvertex: COpaquePointer?, nvertex: UInt, pmesh: COpaquePointer?, nmesh: UInt, ulmode: GradientFill): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_gradientFill(hdc?.value?.toCPointer<ByteVar>(), pvertex?.value?.toCPointer<ByteVar>(), nvertex, pmesh?.value?.toCPointer<ByteVar>(), nmesh, ulmode)

public actual fun grayStringA(hdc: Hdc, hbrush: Hbrush, lpoutputfunc: Graystringproc, lpdata: Lparam, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_grayStringA(hdc?.value?.toCPointer<ByteVar>(), hbrush?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpdata, ncount, x, y, nwidth, nheight)

public actual fun grayStringW(hdc: Hdc, hbrush: Hbrush, lpoutputfunc: Graystringproc, lpdata: Lparam, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_grayStringW(hdc?.value?.toCPointer<ByteVar>(), hbrush?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpdata, ncount, x, y, nwidth, nheight)

public actual fun inflateRect(lprc: COpaquePointer?, dx: Int, dy: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_inflateRect(lprc?.value?.toCPointer<ByteVar>(), dx, dy)

public actual fun intersectClipRect(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): GdiRegionType =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_intersectClipRect(hdc?.value?.toCPointer<ByteVar>(), left, top, right, bottom)

public actual fun intersectRect(lprcdst: COpaquePointer?, lprcsrc1: COpaquePointer?, lprcsrc2: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_intersectRect(lprcdst?.value?.toCPointer<ByteVar>(), lprcsrc1?.value?.toCPointer<ByteVar>(), lprcsrc2?.value?.toCPointer<ByteVar>())

public actual fun invalidateRect(hwnd: Hwnd, lprect: COpaquePointer?, berase: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_invalidateRect(hwnd?.value?.toCPointer<ByteVar>(), lprect?.value?.toCPointer<ByteVar>(), berase)

public actual fun invalidateRgn(hwnd: Hwnd, hrgn: Hrgn, berase: Bool): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_invalidateRgn(hwnd?.value?.toCPointer<ByteVar>(), hrgn?.value?.toCPointer<ByteVar>(), berase)

public actual fun invertRect(hdc: Hdc, lprc: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_invertRect(hdc?.value?.toCPointer<ByteVar>(), lprc?.value?.toCPointer<ByteVar>())

public actual fun invertRgn(hdc: Hdc, hrgn: Hrgn): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_invertRgn(hdc?.value?.toCPointer<ByteVar>(), hrgn?.value?.toCPointer<ByteVar>())

public actual fun isRectEmpty(lprc: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_isRectEmpty(lprc?.value?.toCPointer<ByteVar>())

public actual fun lPtoDP(hdc: Hdc, lppt: COpaquePointer?, c: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_lPtoDP(hdc?.value?.toCPointer<ByteVar>(), lppt?.value?.toCPointer<ByteVar>(), c)

public actual fun lineDDA(xstart: Int, ystart: Int, xend: Int, yend: Int, lpproc: Lineddaproc, data: Lparam): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_lineDDA(xstart, ystart, xend, yend, 0L.toCPointer<ByteVar>(), data)

public actual fun lineTo(hdc: Hdc, x: Int, y: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_lineTo(hdc?.value?.toCPointer<ByteVar>(), x, y)

public actual fun loadBitmapA(hinstance: Hinstance, lpbitmapname: Pcstr): Hbitmap =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_loadBitmapA(hinstance?.value?.toCPointer<ByteVar>(), lpbitmapname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun loadBitmapW(hinstance: Hinstance, lpbitmapname: Pcwstr): Hbitmap =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_loadBitmapW(hinstance?.value?.toCPointer<ByteVar>(), lpbitmapname?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lockWindowUpdate(hwndlock: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_lockWindowUpdate(hwndlock?.value?.toCPointer<ByteVar>())

public actual fun mapWindowPoints(hwndfrom: Hwnd, hwndto: Hwnd, lppoints: COpaquePointer?, cpoints: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_mapWindowPoints(hwndfrom?.value?.toCPointer<ByteVar>(), hwndto?.value?.toCPointer<ByteVar>(), lppoints?.value?.toCPointer<ByteVar>(), cpoints)

public actual fun maskBlt(hdcdest: Hdc, xdest: Int, ydest: Int, width: Int, height: Int, hdcsrc: Hdc, xsrc: Int, ysrc: Int, hbmmask: Hbitmap, xmask: Int, ymask: Int, rop: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_maskBlt(hdcdest?.value?.toCPointer<ByteVar>(), xdest, ydest, width, height, hdcsrc?.value?.toCPointer<ByteVar>(), xsrc, ysrc, hbmmask?.value?.toCPointer<ByteVar>(), xmask, ymask, rop)

public actual fun mergeFontPackage(puchmergefontbuffer: COpaquePointer?, ulmergefontbuffersize: UInt, puchfontpackagebuffer: COpaquePointer?, ulfontpackagebuffersize: UInt, ppuchdestbuffer: COpaquePointer?, puldestbuffersize: COpaquePointer?, pulbyteswritten: COpaquePointer?, usmode: UShort, lpfnallocate: CfpAllocproc, lpfnreallocate: CfpReallocproc, lpfnfree: CfpFreeproc, lpvreserved: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_mergeFontPackage(puchmergefontbuffer?.value?.toCPointer<ByteVar>(), ulmergefontbuffersize, puchfontpackagebuffer?.value?.toCPointer<ByteVar>(), ulfontpackagebuffersize, ppuchdestbuffer?.value?.toCPointer<ByteVar>(), puldestbuffersize?.value?.toCPointer<ByteVar>(), pulbyteswritten?.value?.toCPointer<ByteVar>(), usmode, 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpvreserved?.value?.toCPointer<ByteVar>())

public actual fun modifyWorldTransform(hdc: Hdc, lpxf: COpaquePointer?, mode: ModifyWorldTransformMode): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_modifyWorldTransform(hdc?.value?.toCPointer<ByteVar>(), lpxf?.value?.toCPointer<ByteVar>(), mode)

public actual fun monitorFromPoint(pt: Point, dwflags: MonitorFromFlags): Hmonitor =
    null

public actual fun monitorFromRect(lprc: COpaquePointer?, dwflags: MonitorFromFlags): Hmonitor =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_monitorFromRect(lprc?.value?.toCPointer<ByteVar>(), dwflags)?.let { COpaquePointer(it.toLong()) }

public actual fun monitorFromWindow(hwnd: Hwnd, dwflags: MonitorFromFlags): Hmonitor =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_monitorFromWindow(hwnd?.value?.toCPointer<ByteVar>(), dwflags)?.let { COpaquePointer(it.toLong()) }

public actual fun moveToEx(hdc: Hdc, x: Int, y: Int, lppt: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_moveToEx(hdc?.value?.toCPointer<ByteVar>(), x, y, lppt?.value?.toCPointer<ByteVar>())

public actual fun offsetClipRgn(hdc: Hdc, x: Int, y: Int): GdiRegionType =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_offsetClipRgn(hdc?.value?.toCPointer<ByteVar>(), x, y)

public actual fun offsetRect(lprc: COpaquePointer?, dx: Int, dy: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_offsetRect(lprc?.value?.toCPointer<ByteVar>(), dx, dy)

public actual fun offsetRgn(hrgn: Hrgn, x: Int, y: Int): GdiRegionType =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_offsetRgn(hrgn?.value?.toCPointer<ByteVar>(), x, y)

public actual fun offsetViewportOrgEx(hdc: Hdc, x: Int, y: Int, lppt: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_offsetViewportOrgEx(hdc?.value?.toCPointer<ByteVar>(), x, y, lppt?.value?.toCPointer<ByteVar>())

public actual fun offsetWindowOrgEx(hdc: Hdc, x: Int, y: Int, lppt: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_offsetWindowOrgEx(hdc?.value?.toCPointer<ByteVar>(), x, y, lppt?.value?.toCPointer<ByteVar>())

public actual fun paintDesktop(hdc: Hdc): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_paintDesktop(hdc?.value?.toCPointer<ByteVar>())

public actual fun paintRgn(hdc: Hdc, hrgn: Hrgn): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_paintRgn(hdc?.value?.toCPointer<ByteVar>(), hrgn?.value?.toCPointer<ByteVar>())

public actual fun patBlt(hdc: Hdc, x: Int, y: Int, w: Int, h: Int, rop: RopCode): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_patBlt(hdc?.value?.toCPointer<ByteVar>(), x, y, w, h, rop)

public actual fun pathToRegion(hdc: Hdc): Hrgn =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_pathToRegion(hdc?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pie(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_pie(hdc?.value?.toCPointer<ByteVar>(), left, top, right, bottom, xr1, yr1, xr2, yr2)

public actual fun playEnhMetaFile(hdc: Hdc, hmf: Henhmetafile, lprect: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_playEnhMetaFile(hdc?.value?.toCPointer<ByteVar>(), hmf?.value?.toCPointer<ByteVar>(), lprect?.value?.toCPointer<ByteVar>())

public actual fun playEnhMetaFileRecord(hdc: Hdc, pht: COpaquePointer?, pmr: COpaquePointer?, cht: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_playEnhMetaFileRecord(hdc?.value?.toCPointer<ByteVar>(), pht?.value?.toCPointer<ByteVar>(), pmr?.value?.toCPointer<ByteVar>(), cht)

public actual fun playMetaFile(hdc: Hdc, hmf: Hmetafile): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_playMetaFile(hdc?.value?.toCPointer<ByteVar>(), hmf?.value?.toCPointer<ByteVar>())

public actual fun playMetaFileRecord(hdc: Hdc, lphandletable: COpaquePointer?, lpmr: COpaquePointer?, noobjs: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_playMetaFileRecord(hdc?.value?.toCPointer<ByteVar>(), lphandletable?.value?.toCPointer<ByteVar>(), lpmr?.value?.toCPointer<ByteVar>(), noobjs)

public actual fun plgBlt(hdcdest: Hdc, lppoint: COpaquePointer?, hdcsrc: Hdc, xsrc: Int, ysrc: Int, width: Int, height: Int, hbmmask: Hbitmap, xmask: Int, ymask: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_plgBlt(hdcdest?.value?.toCPointer<ByteVar>(), lppoint?.value?.toCPointer<ByteVar>(), hdcsrc?.value?.toCPointer<ByteVar>(), xsrc, ysrc, width, height, hbmmask?.value?.toCPointer<ByteVar>(), xmask, ymask)

public actual fun polyBezier(hdc: Hdc, apt: COpaquePointer?, cpt: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_polyBezier(hdc?.value?.toCPointer<ByteVar>(), apt?.value?.toCPointer<ByteVar>(), cpt)

public actual fun polyBezierTo(hdc: Hdc, apt: COpaquePointer?, cpt: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_polyBezierTo(hdc?.value?.toCPointer<ByteVar>(), apt?.value?.toCPointer<ByteVar>(), cpt)

public actual fun polyDraw(hdc: Hdc, apt: COpaquePointer?, aj: COpaquePointer?, cpt: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_polyDraw(hdc?.value?.toCPointer<ByteVar>(), apt?.value?.toCPointer<ByteVar>(), aj?.value?.toCPointer<ByteVar>(), cpt)

public actual fun polyPolygon(hdc: Hdc, apt: COpaquePointer?, asz: COpaquePointer?, csz: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_polyPolygon(hdc?.value?.toCPointer<ByteVar>(), apt?.value?.toCPointer<ByteVar>(), asz?.value?.toCPointer<ByteVar>(), csz)

public actual fun polyPolyline(hdc: Hdc, apt: COpaquePointer?, asz: COpaquePointer?, csz: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_polyPolyline(hdc?.value?.toCPointer<ByteVar>(), apt?.value?.toCPointer<ByteVar>(), asz?.value?.toCPointer<ByteVar>(), csz)

public actual fun polyTextOutA(hdc: Hdc, ppt: COpaquePointer?, nstrings: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_polyTextOutA(hdc?.value?.toCPointer<ByteVar>(), ppt?.value?.toCPointer<ByteVar>(), nstrings)

public actual fun polyTextOutW(hdc: Hdc, ppt: COpaquePointer?, nstrings: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_polyTextOutW(hdc?.value?.toCPointer<ByteVar>(), ppt?.value?.toCPointer<ByteVar>(), nstrings)

public actual fun polygon(hdc: Hdc, apt: COpaquePointer?, cpt: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_polygon(hdc?.value?.toCPointer<ByteVar>(), apt?.value?.toCPointer<ByteVar>(), cpt)

public actual fun polyline(hdc: Hdc, apt: COpaquePointer?, cpt: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_polyline(hdc?.value?.toCPointer<ByteVar>(), apt?.value?.toCPointer<ByteVar>(), cpt)

public actual fun polylineTo(hdc: Hdc, apt: COpaquePointer?, cpt: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_polylineTo(hdc?.value?.toCPointer<ByteVar>(), apt?.value?.toCPointer<ByteVar>(), cpt)

public actual fun ptInRect(lprc: COpaquePointer?, pt: Point): Bool =
    0

public actual fun ptInRegion(hrgn: Hrgn, x: Int, y: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_ptInRegion(hrgn?.value?.toCPointer<ByteVar>(), x, y)

public actual fun ptVisible(hdc: Hdc, x: Int, y: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_ptVisible(hdc?.value?.toCPointer<ByteVar>(), x, y)

public actual fun realizePalette(hdc: Hdc): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_realizePalette(hdc?.value?.toCPointer<ByteVar>())

public actual fun rectInRegion(hrgn: Hrgn, lprect: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_rectInRegion(hrgn?.value?.toCPointer<ByteVar>(), lprect?.value?.toCPointer<ByteVar>())

public actual fun rectVisible(hdc: Hdc, lprect: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_rectVisible(hdc?.value?.toCPointer<ByteVar>(), lprect?.value?.toCPointer<ByteVar>())

public actual fun rectangle(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_rectangle(hdc?.value?.toCPointer<ByteVar>(), left, top, right, bottom)

public actual fun redrawWindow(hwnd: Hwnd, lprcupdate: COpaquePointer?, hrgnupdate: Hrgn, flags: RedrawWindowFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_redrawWindow(hwnd?.value?.toCPointer<ByteVar>(), lprcupdate?.value?.toCPointer<ByteVar>(), hrgnupdate?.value?.toCPointer<ByteVar>(), flags)

public actual fun releaseDC(hwnd: Hwnd, hdc: Hdc): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_releaseDC(hwnd?.value?.toCPointer<ByteVar>(), hdc?.value?.toCPointer<ByteVar>())

public actual fun removeFontMemResourceEx(h: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_removeFontMemResourceEx(h?.value?.toCPointer<ByteVar>())

public actual fun removeFontResourceA(lpfilename: Pcstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_removeFontResourceA(lpfilename?.value?.toCPointer<ByteVar>())

public actual fun removeFontResourceExA(name: Pcstr, fl: UInt, pdv: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_removeFontResourceExA(name?.value?.toCPointer<ByteVar>(), fl, pdv?.value?.toCPointer<ByteVar>())

public actual fun removeFontResourceExW(name: Pcwstr, fl: UInt, pdv: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_removeFontResourceExW(name?.value?.toCPointer<ByteVar>(), fl, pdv?.value?.toCPointer<ByteVar>())

public actual fun removeFontResourceW(lpfilename: Pcwstr): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_removeFontResourceW(lpfilename?.value?.toCPointer<ByteVar>())

public actual fun resetDCA(hdc: Hdc, lpdm: COpaquePointer?): Hdc =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_resetDCA(hdc?.value?.toCPointer<ByteVar>(), lpdm?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun resetDCW(hdc: Hdc, lpdm: COpaquePointer?): Hdc =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_resetDCW(hdc?.value?.toCPointer<ByteVar>(), lpdm?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun resizePalette(hpal: Hpalette, n: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_resizePalette(hpal?.value?.toCPointer<ByteVar>(), n)

public actual fun restoreDC(hdc: Hdc, nsaveddc: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_restoreDC(hdc?.value?.toCPointer<ByteVar>(), nsaveddc)

public actual fun roundRect(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int, width: Int, height: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_roundRect(hdc?.value?.toCPointer<ByteVar>(), left, top, right, bottom, width, height)

public actual fun saveDC(hdc: Hdc): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_saveDC(hdc?.value?.toCPointer<ByteVar>())

public actual fun scaleViewportExtEx(hdc: Hdc, xn: Int, dx: Int, yn: Int, yd: Int, lpsz: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_scaleViewportExtEx(hdc?.value?.toCPointer<ByteVar>(), xn, dx, yn, yd, lpsz?.value?.toCPointer<ByteVar>())

public actual fun scaleWindowExtEx(hdc: Hdc, xn: Int, xd: Int, yn: Int, yd: Int, lpsz: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_scaleWindowExtEx(hdc?.value?.toCPointer<ByteVar>(), xn, xd, yn, yd, lpsz?.value?.toCPointer<ByteVar>())

public actual fun screenToClient(hwnd: Hwnd, lppoint: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_screenToClient(hwnd?.value?.toCPointer<ByteVar>(), lppoint?.value?.toCPointer<ByteVar>())

public actual fun selectClipPath(hdc: Hdc, mode: RgnCombineMode): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_selectClipPath(hdc?.value?.toCPointer<ByteVar>(), mode)

public actual fun selectClipRgn(hdc: Hdc, hrgn: Hrgn): GdiRegionType =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_selectClipRgn(hdc?.value?.toCPointer<ByteVar>(), hrgn?.value?.toCPointer<ByteVar>())

public actual fun selectObject(hdc: Hdc, h: Hgdiobj): Hgdiobj =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_selectObject(hdc?.value?.toCPointer<ByteVar>(), h?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun selectPalette(hdc: Hdc, hpal: Hpalette, bforcebkgd: Bool): Hpalette =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_selectPalette(hdc?.value?.toCPointer<ByteVar>(), hpal?.value?.toCPointer<ByteVar>(), bforcebkgd)?.let { COpaquePointer(it.toLong()) }

public actual fun setArcDirection(hdc: Hdc, dir: ArcDirection): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setArcDirection(hdc?.value?.toCPointer<ByteVar>(), dir)

public actual fun setBitmapBits(hbm: Hbitmap, cb: UInt, pvbits: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setBitmapBits(hbm?.value?.toCPointer<ByteVar>(), cb, pvbits?.value?.toCPointer<ByteVar>())

public actual fun setBitmapDimensionEx(hbm: Hbitmap, w: Int, h: Int, lpsz: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setBitmapDimensionEx(hbm?.value?.toCPointer<ByteVar>(), w, h, lpsz?.value?.toCPointer<ByteVar>())

public actual fun setBkColor(hdc: Hdc, color: Colorref): Colorref =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setBkColor(hdc?.value?.toCPointer<ByteVar>(), color)

public actual fun setBkMode(hdc: Hdc, mode: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setBkMode(hdc?.value?.toCPointer<ByteVar>(), mode)

public actual fun setBoundsRect(hdc: Hdc, lprect: COpaquePointer?, flags: SetBoundsRectFlags): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setBoundsRect(hdc?.value?.toCPointer<ByteVar>(), lprect?.value?.toCPointer<ByteVar>(), flags)

public actual fun setBrushOrgEx(hdc: Hdc, x: Int, y: Int, lppt: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setBrushOrgEx(hdc?.value?.toCPointer<ByteVar>(), x, y, lppt?.value?.toCPointer<ByteVar>())

public actual fun setColorAdjustment(hdc: Hdc, lpca: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setColorAdjustment(hdc?.value?.toCPointer<ByteVar>(), lpca?.value?.toCPointer<ByteVar>())

public actual fun setDCBrushColor(hdc: Hdc, color: Colorref): Colorref =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setDCBrushColor(hdc?.value?.toCPointer<ByteVar>(), color)

public actual fun setDCPenColor(hdc: Hdc, color: Colorref): Colorref =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setDCPenColor(hdc?.value?.toCPointer<ByteVar>(), color)

public actual fun setDIBColorTable(hdc: Hdc, istart: UInt, centries: UInt, prgbq: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setDIBColorTable(hdc?.value?.toCPointer<ByteVar>(), istart, centries, prgbq?.value?.toCPointer<ByteVar>())

public actual fun setDIBits(hdc: Hdc, hbm: Hbitmap, start: UInt, clines: UInt, lpbits: COpaquePointer?, lpbmi: COpaquePointer?, coloruse: DibUsage): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setDIBits(hdc?.value?.toCPointer<ByteVar>(), hbm?.value?.toCPointer<ByteVar>(), start, clines, lpbits?.value?.toCPointer<ByteVar>(), lpbmi?.value?.toCPointer<ByteVar>(), coloruse)

public actual fun setDIBitsToDevice(hdc: Hdc, xdest: Int, ydest: Int, w: UInt, h: UInt, xsrc: Int, ysrc: Int, startscan: UInt, clines: UInt, lpvbits: COpaquePointer?, lpbmi: COpaquePointer?, coloruse: DibUsage): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setDIBitsToDevice(hdc?.value?.toCPointer<ByteVar>(), xdest, ydest, w, h, xsrc, ysrc, startscan, clines, lpvbits?.value?.toCPointer<ByteVar>(), lpbmi?.value?.toCPointer<ByteVar>(), coloruse)

public actual fun setEnhMetaFileBits(nsize: UInt, pb: COpaquePointer?): Henhmetafile =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setEnhMetaFileBits(nsize, pb?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setGraphicsMode(hdc: Hdc, imode: GraphicsMode): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setGraphicsMode(hdc?.value?.toCPointer<ByteVar>(), imode)

public actual fun setLayout(hdc: Hdc, l: DcLayout): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setLayout(hdc?.value?.toCPointer<ByteVar>(), l)

public actual fun setMapMode(hdc: Hdc, imode: HdcMapMode): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setMapMode(hdc?.value?.toCPointer<ByteVar>(), imode)

public actual fun setMapperFlags(hdc: Hdc, flags: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setMapperFlags(hdc?.value?.toCPointer<ByteVar>(), flags)

public actual fun setMetaFileBitsEx(cbbuffer: UInt, lpdata: COpaquePointer?): Hmetafile =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setMetaFileBitsEx(cbbuffer, lpdata?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setMetaRgn(hdc: Hdc): GdiRegionType =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setMetaRgn(hdc?.value?.toCPointer<ByteVar>())

public actual fun setMiterLimit(hdc: Hdc, limit: Float, old: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setMiterLimit(hdc?.value?.toCPointer<ByteVar>(), limit, old?.value?.toCPointer<ByteVar>())

public actual fun setPaletteEntries(hpal: Hpalette, istart: UInt, centries: UInt, ppalentries: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setPaletteEntries(hpal?.value?.toCPointer<ByteVar>(), istart, centries, ppalentries?.value?.toCPointer<ByteVar>())

public actual fun setPixel(hdc: Hdc, x: Int, y: Int, color: Colorref): Colorref =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setPixel(hdc?.value?.toCPointer<ByteVar>(), x, y, color)

public actual fun setPixelV(hdc: Hdc, x: Int, y: Int, color: Colorref): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setPixelV(hdc?.value?.toCPointer<ByteVar>(), x, y, color)

public actual fun setPolyFillMode(hdc: Hdc, mode: CreatePolygonRgnMode): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setPolyFillMode(hdc?.value?.toCPointer<ByteVar>(), mode)

public actual fun setROP2(hdc: Hdc, rop2: R2Mode): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setROP2(hdc?.value?.toCPointer<ByteVar>(), rop2)

public actual fun setRect(lprc: COpaquePointer?, xleft: Int, ytop: Int, xright: Int, ybottom: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setRect(lprc?.value?.toCPointer<ByteVar>(), xleft, ytop, xright, ybottom)

public actual fun setRectEmpty(lprc: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setRectEmpty(lprc?.value?.toCPointer<ByteVar>())

public actual fun setRectRgn(hrgn: Hrgn, left: Int, top: Int, right: Int, bottom: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setRectRgn(hrgn?.value?.toCPointer<ByteVar>(), left, top, right, bottom)

public actual fun setStretchBltMode(hdc: Hdc, mode: StretchBltMode): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setStretchBltMode(hdc?.value?.toCPointer<ByteVar>(), mode)

public actual fun setSysColors(celements: Int, lpaelements: COpaquePointer?, lpargbvalues: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setSysColors(celements, lpaelements?.value?.toCPointer<ByteVar>(), lpargbvalues?.value?.toCPointer<ByteVar>())

public actual fun setSystemPaletteUse(hdc: Hdc, use: SystemPaletteUse): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setSystemPaletteUse(hdc?.value?.toCPointer<ByteVar>(), use)

public actual fun setTextAlign(hdc: Hdc, align: TextAlignOptions): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setTextAlign(hdc?.value?.toCPointer<ByteVar>(), align)

public actual fun setTextCharacterExtra(hdc: Hdc, extra: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setTextCharacterExtra(hdc?.value?.toCPointer<ByteVar>(), extra)

public actual fun setTextColor(hdc: Hdc, color: Colorref): Colorref =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setTextColor(hdc?.value?.toCPointer<ByteVar>(), color)

public actual fun setTextJustification(hdc: Hdc, extra: Int, count: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setTextJustification(hdc?.value?.toCPointer<ByteVar>(), extra, count)

public actual fun setViewportExtEx(hdc: Hdc, x: Int, y: Int, lpsz: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setViewportExtEx(hdc?.value?.toCPointer<ByteVar>(), x, y, lpsz?.value?.toCPointer<ByteVar>())

public actual fun setViewportOrgEx(hdc: Hdc, x: Int, y: Int, lppt: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setViewportOrgEx(hdc?.value?.toCPointer<ByteVar>(), x, y, lppt?.value?.toCPointer<ByteVar>())

public actual fun setWindowExtEx(hdc: Hdc, x: Int, y: Int, lpsz: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setWindowExtEx(hdc?.value?.toCPointer<ByteVar>(), x, y, lpsz?.value?.toCPointer<ByteVar>())

public actual fun setWindowOrgEx(hdc: Hdc, x: Int, y: Int, lppt: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setWindowOrgEx(hdc?.value?.toCPointer<ByteVar>(), x, y, lppt?.value?.toCPointer<ByteVar>())

public actual fun setWindowRgn(hwnd: Hwnd, hrgn: Hrgn, bredraw: Bool): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setWindowRgn(hwnd?.value?.toCPointer<ByteVar>(), hrgn?.value?.toCPointer<ByteVar>(), bredraw)

public actual fun setWorldTransform(hdc: Hdc, lpxf: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_setWorldTransform(hdc?.value?.toCPointer<ByteVar>(), lpxf?.value?.toCPointer<ByteVar>())

public actual fun stretchBlt(hdcdest: Hdc, xdest: Int, ydest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xsrc: Int, ysrc: Int, wsrc: Int, hsrc: Int, rop: RopCode): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_stretchBlt(hdcdest?.value?.toCPointer<ByteVar>(), xdest, ydest, wdest, hdest, hdcsrc?.value?.toCPointer<ByteVar>(), xsrc, ysrc, wsrc, hsrc, rop)

public actual fun stretchDIBits(hdc: Hdc, xdest: Int, ydest: Int, destwidth: Int, destheight: Int, xsrc: Int, ysrc: Int, srcwidth: Int, srcheight: Int, lpbits: COpaquePointer?, lpbmi: COpaquePointer?, iusage: DibUsage, rop: RopCode): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_stretchDIBits(hdc?.value?.toCPointer<ByteVar>(), xdest, ydest, destwidth, destheight, xsrc, ysrc, srcwidth, srcheight, lpbits?.value?.toCPointer<ByteVar>(), lpbmi?.value?.toCPointer<ByteVar>(), iusage, rop)

public actual fun strokeAndFillPath(hdc: Hdc): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_strokeAndFillPath(hdc?.value?.toCPointer<ByteVar>())

public actual fun strokePath(hdc: Hdc): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_strokePath(hdc?.value?.toCPointer<ByteVar>())

public actual fun subtractRect(lprcdst: COpaquePointer?, lprcsrc1: COpaquePointer?, lprcsrc2: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_subtractRect(lprcdst?.value?.toCPointer<ByteVar>(), lprcsrc1?.value?.toCPointer<ByteVar>(), lprcsrc2?.value?.toCPointer<ByteVar>())

public actual fun tTCharToUnicode(hdc: Hdc, puccharcodes: COpaquePointer?, ulcharcodesize: UInt, pusshortcodes: COpaquePointer?, ulshortcodesize: UInt, ulflags: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_tTCharToUnicode(hdc?.value?.toCPointer<ByteVar>(), puccharcodes?.value?.toCPointer<ByteVar>(), ulcharcodesize, pusshortcodes?.value?.toCPointer<ByteVar>(), ulshortcodesize, ulflags)

public actual fun tTDeleteEmbeddedFont(hfontreference: Handle, ulflags: UInt, pulstatus: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_tTDeleteEmbeddedFont(hfontreference?.value?.toCPointer<ByteVar>(), ulflags, pulstatus?.value?.toCPointer<ByteVar>())

public actual fun tTEmbedFont(hdc: Hdc, ulflags: TtembedFlags, ulcharset: EmbedFontCharset, pulprivstatus: COpaquePointer?, pulstatus: COpaquePointer?, lpfnwritetostream: Writeembedproc, lpvwritestream: COpaquePointer?, puscharcodeset: COpaquePointer?, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_tTEmbedFont(hdc?.value?.toCPointer<ByteVar>(), ulflags, ulcharset, pulprivstatus?.value?.toCPointer<ByteVar>(), pulstatus?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpvwritestream?.value?.toCPointer<ByteVar>(), puscharcodeset?.value?.toCPointer<ByteVar>(), uscharcodecount, uslanguage, pttembedinfo?.value?.toCPointer<ByteVar>())

public actual fun tTEmbedFontEx(hdc: Hdc, ulflags: TtembedFlags, ulcharset: EmbedFontCharset, pulprivstatus: COpaquePointer?, pulstatus: COpaquePointer?, lpfnwritetostream: Writeembedproc, lpvwritestream: COpaquePointer?, pulcharcodeset: COpaquePointer?, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_tTEmbedFontEx(hdc?.value?.toCPointer<ByteVar>(), ulflags, ulcharset, pulprivstatus?.value?.toCPointer<ByteVar>(), pulstatus?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpvwritestream?.value?.toCPointer<ByteVar>(), pulcharcodeset?.value?.toCPointer<ByteVar>(), uscharcodecount, uslanguage, pttembedinfo?.value?.toCPointer<ByteVar>())

public actual fun tTEmbedFontFromFileA(hdc: Hdc, szfontfilename: Pcstr, usttcindex: UShort, ulflags: TtembedFlags, ulcharset: EmbedFontCharset, pulprivstatus: COpaquePointer?, pulstatus: COpaquePointer?, lpfnwritetostream: Writeembedproc, lpvwritestream: COpaquePointer?, puscharcodeset: COpaquePointer?, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_tTEmbedFontFromFileA(hdc?.value?.toCPointer<ByteVar>(), szfontfilename?.value?.toCPointer<ByteVar>(), usttcindex, ulflags, ulcharset, pulprivstatus?.value?.toCPointer<ByteVar>(), pulstatus?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpvwritestream?.value?.toCPointer<ByteVar>(), puscharcodeset?.value?.toCPointer<ByteVar>(), uscharcodecount, uslanguage, pttembedinfo?.value?.toCPointer<ByteVar>())

public actual fun tTEnableEmbeddingForFacename(lpszfacename: Pcstr, benable: Bool): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_tTEnableEmbeddingForFacename(lpszfacename?.value?.toCPointer<ByteVar>(), benable)

public actual fun tTGetEmbeddedFontInfo(ulflags: TtembedFlags, pulprivstatus: COpaquePointer?, ulprivs: FontLicensePrivs, pulstatus: COpaquePointer?, lpfnreadfromstream: Readembedproc, lpvreadstream: COpaquePointer?, pttloadinfo: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_tTGetEmbeddedFontInfo(ulflags, pulprivstatus?.value?.toCPointer<ByteVar>(), ulprivs, pulstatus?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpvreadstream?.value?.toCPointer<ByteVar>(), pttloadinfo?.value?.toCPointer<ByteVar>())

public actual fun tTGetEmbeddingType(hdc: Hdc, pulembedtype: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_tTGetEmbeddingType(hdc?.value?.toCPointer<ByteVar>(), pulembedtype?.value?.toCPointer<ByteVar>())

public actual fun tTGetNewFontName(phfontreference: COpaquePointer?, wzwinfamilyname: Pwstr, cchmaxwinname: Int, szmacfamilyname: Pstr, cchmaxmacname: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_tTGetNewFontName(phfontreference?.value?.toCPointer<ByteVar>(), wzwinfamilyname?.value?.toCPointer<ByteVar>(), cchmaxwinname, szmacfamilyname?.value?.toCPointer<ByteVar>(), cchmaxmacname)

public actual fun tTIsEmbeddingEnabled(hdc: Hdc, pbenabled: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_tTIsEmbeddingEnabled(hdc?.value?.toCPointer<ByteVar>(), pbenabled?.value?.toCPointer<ByteVar>())

public actual fun tTIsEmbeddingEnabledForFacename(lpszfacename: Pcstr, pbenabled: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_tTIsEmbeddingEnabledForFacename(lpszfacename?.value?.toCPointer<ByteVar>(), pbenabled?.value?.toCPointer<ByteVar>())

public actual fun tTLoadEmbeddedFont(phfontreference: COpaquePointer?, ulflags: UInt, pulprivstatus: COpaquePointer?, ulprivs: FontLicensePrivs, pulstatus: COpaquePointer?, lpfnreadfromstream: Readembedproc, lpvreadstream: COpaquePointer?, szwinfamilyname: Pcwstr, szmacfamilyname: Pcstr, pttloadinfo: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_tTLoadEmbeddedFont(phfontreference?.value?.toCPointer<ByteVar>(), ulflags, pulprivstatus?.value?.toCPointer<ByteVar>(), ulprivs, pulstatus?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), lpvreadstream?.value?.toCPointer<ByteVar>(), szwinfamilyname?.value?.toCPointer<ByteVar>(), szmacfamilyname?.value?.toCPointer<ByteVar>(), pttloadinfo?.value?.toCPointer<ByteVar>())

public actual fun tTRunValidationTests(hdc: Hdc, ptestparam: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_tTRunValidationTests(hdc?.value?.toCPointer<ByteVar>(), ptestparam?.value?.toCPointer<ByteVar>())

public actual fun tTRunValidationTestsEx(hdc: Hdc, ptestparam: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_tTRunValidationTestsEx(hdc?.value?.toCPointer<ByteVar>(), ptestparam?.value?.toCPointer<ByteVar>())

public actual fun tabbedTextOutA(hdc: Hdc, x: Int, y: Int, lpstring: Pcstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: COpaquePointer?, ntaborigin: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_tabbedTextOutA(hdc?.value?.toCPointer<ByteVar>(), x, y, lpstring?.value?.toCPointer<ByteVar>(), chcount, ntabpositions, lpntabstoppositions?.value?.toCPointer<ByteVar>(), ntaborigin)

public actual fun tabbedTextOutW(hdc: Hdc, x: Int, y: Int, lpstring: Pcwstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: COpaquePointer?, ntaborigin: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_tabbedTextOutW(hdc?.value?.toCPointer<ByteVar>(), x, y, lpstring?.value?.toCPointer<ByteVar>(), chcount, ntabpositions, lpntabstoppositions?.value?.toCPointer<ByteVar>(), ntaborigin)

public actual fun textOutA(hdc: Hdc, x: Int, y: Int, lpstring: Pcstr, c: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_textOutA(hdc?.value?.toCPointer<ByteVar>(), x, y, lpstring?.value?.toCPointer<ByteVar>(), c)

public actual fun textOutW(hdc: Hdc, x: Int, y: Int, lpstring: Pcwstr, c: Int): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_textOutW(hdc?.value?.toCPointer<ByteVar>(), x, y, lpstring?.value?.toCPointer<ByteVar>(), c)

public actual fun transparentBlt(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_transparentBlt(hdcdest?.value?.toCPointer<ByteVar>(), xorigindest, yorigindest, wdest, hdest, hdcsrc?.value?.toCPointer<ByteVar>(), xoriginsrc, yoriginsrc, wsrc, hsrc, crtransparent)

public actual fun unionRect(lprcdst: COpaquePointer?, lprcsrc1: COpaquePointer?, lprcsrc2: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_unionRect(lprcdst?.value?.toCPointer<ByteVar>(), lprcsrc1?.value?.toCPointer<ByteVar>(), lprcsrc2?.value?.toCPointer<ByteVar>())

public actual fun unrealizeObject(h: Hgdiobj): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_unrealizeObject(h?.value?.toCPointer<ByteVar>())

public actual fun updateColors(hdc: Hdc): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_updateColors(hdc?.value?.toCPointer<ByteVar>())

public actual fun updateWindow(hwnd: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_updateWindow(hwnd?.value?.toCPointer<ByteVar>())

public actual fun validateRect(hwnd: Hwnd, lprect: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_validateRect(hwnd?.value?.toCPointer<ByteVar>(), lprect?.value?.toCPointer<ByteVar>())

public actual fun validateRgn(hwnd: Hwnd, hrgn: Hrgn): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_validateRgn(hwnd?.value?.toCPointer<ByteVar>(), hrgn?.value?.toCPointer<ByteVar>())

public actual fun widenPath(hdc: Hdc): Bool =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_widenPath(hdc?.value?.toCPointer<ByteVar>())

public actual fun windowFromDC(hdc: Hdc): Hwnd =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_windowFromDC(hdc?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun wglSwapMultipleBuffers(param0: UInt, param1: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.cinterop.windowssys_windows_win32_graphics_gdi_wglSwapMultipleBuffers(param0, param1?.value?.toCPointer<ByteVar>())
