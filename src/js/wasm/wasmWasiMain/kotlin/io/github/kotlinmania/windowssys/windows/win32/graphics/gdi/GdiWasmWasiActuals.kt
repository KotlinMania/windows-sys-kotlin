@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun abortPath(hdc: Hdc): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiAbortPath")

public actual fun addFontMemResourceEx(pfileview: ConstPtr, cjsize: UInt, pvresrved: ConstPtr, pnumfonts: ConstPtr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiAddFontMemResourceEx")

public actual fun addFontResourceA(param0: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiAddFontResourceA")

public actual fun addFontResourceExA(name: Pcstr, fl: FontResourceCharacteristics, res: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiAddFontResourceExA")

public actual fun addFontResourceExW(name: Pcwstr, fl: FontResourceCharacteristics, res: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiAddFontResourceExW")

public actual fun addFontResourceW(param0: Pcwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiAddFontResourceW")

public actual fun alphaBlend(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, ftn: Blendfunction): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiAlphaBlend")

public actual fun angleArc(hdc: Hdc, x: Int, y: Int, r: UInt, startangle: Float, sweepangle: Float): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiAngleArc")

public actual fun animatePalette(hpal: Hpalette, istartindex: UInt, centries: UInt, ppe: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiAnimatePalette")

public actual fun arc(hdc: Hdc, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiArc")

public actual fun arcTo(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiArcTo")

public actual fun beginPaint(hwnd: Hwnd, lppaint: MutPtr): Hdc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiBeginPaint")

public actual fun beginPath(hdc: Hdc): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiBeginPath")

public actual fun bitBlt(hdc: Hdc, x: Int, y: Int, cx: Int, cy: Int, hdcsrc: Hdc, x1: Int, y1: Int, rop: RopCode): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiBitBlt")

public actual fun cancelDC(hdc: Hdc): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCancelDC")

public actual fun changeDisplaySettingsA(lpdevmode: ConstPtr, dwflags: CdsType): DispChange =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiChangeDisplaySettingsA")

public actual fun changeDisplaySettingsExA(lpszdevicename: Pcstr, lpdevmode: ConstPtr, hwnd: Hwnd, dwflags: CdsType, lparam: ConstPtr): DispChange =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiChangeDisplaySettingsExA")

public actual fun changeDisplaySettingsExW(lpszdevicename: Pcwstr, lpdevmode: ConstPtr, hwnd: Hwnd, dwflags: CdsType, lparam: ConstPtr): DispChange =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiChangeDisplaySettingsExW")

public actual fun changeDisplaySettingsW(lpdevmode: ConstPtr, dwflags: CdsType): DispChange =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiChangeDisplaySettingsW")

public actual fun chord(hdc: Hdc, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiChord")

public actual fun clientToScreen(hwnd: Hwnd, lppoint: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiClientToScreen")

public actual fun closeEnhMetaFile(hdc: Hdc): Henhmetafile =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCloseEnhMetaFile")

public actual fun closeFigure(hdc: Hdc): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCloseFigure")

public actual fun closeMetaFile(hdc: Hdc): Hmetafile =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCloseMetaFile")

public actual fun combineRgn(hrgndst: Hrgn, hrgnsrc1: Hrgn, hrgnsrc2: Hrgn, imode: RgnCombineMode): GdiRegionType =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCombineRgn")

public actual fun combineTransform(lpxfout: MutPtr, lpxf1: ConstPtr, lpxf2: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCombineTransform")

public actual fun copyEnhMetaFileA(henh: Henhmetafile, lpfilename: Pcstr): Henhmetafile =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCopyEnhMetaFileA")

public actual fun copyEnhMetaFileW(henh: Henhmetafile, lpfilename: Pcwstr): Henhmetafile =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCopyEnhMetaFileW")

public actual fun copyMetaFileA(param0: Hmetafile, param1: Pcstr): Hmetafile =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCopyMetaFileA")

public actual fun copyMetaFileW(param0: Hmetafile, param1: Pcwstr): Hmetafile =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCopyMetaFileW")

public actual fun copyRect(lprcdst: MutPtr, lprcsrc: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCopyRect")

public actual fun createBitmap(nwidth: Int, nheight: Int, nplanes: UInt, nbitcount: UInt, lpbits: ConstPtr): Hbitmap =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateBitmap")

public actual fun createBitmapIndirect(pbm: ConstPtr): Hbitmap =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateBitmapIndirect")

public actual fun createBrushIndirect(plbrush: ConstPtr): Hbrush =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateBrushIndirect")

public actual fun createCompatibleBitmap(hdc: Hdc, cx: Int, cy: Int): Hbitmap =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateCompatibleBitmap")

public actual fun createCompatibleDC(hdc: Hdc): Hdc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateCompatibleDC")

public actual fun createDCA(pwszdriver: Pcstr, pwszdevice: Pcstr, pszport: Pcstr, pdm: ConstPtr): Hdc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateDCA")

public actual fun createDCW(pwszdriver: Pcwstr, pwszdevice: Pcwstr, pszport: Pcwstr, pdm: ConstPtr): Hdc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateDCW")

public actual fun createDIBPatternBrush(h: Hglobal, iusage: DibUsage): Hbrush =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateDIBPatternBrush")

public actual fun createDIBPatternBrushPt(lppackeddib: ConstPtr, iusage: DibUsage): Hbrush =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateDIBPatternBrushPt")

public actual fun createDIBSection(hdc: Hdc, pbmi: ConstPtr, usage: DibUsage, ppvbits: MutPtr, hsection: Handle, offset: UInt): Hbitmap =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateDIBSection")

public actual fun createDIBitmap(hdc: Hdc, pbmih: ConstPtr, flinit: UInt, pjbits: ConstPtr, pbmi: ConstPtr, iusage: DibUsage): Hbitmap =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateDIBitmap")

public actual fun createDiscardableBitmap(hdc: Hdc, cx: Int, cy: Int): Hbitmap =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateDiscardableBitmap")

public actual fun createEllipticRgn(x1: Int, y1: Int, x2: Int, y2: Int): Hrgn =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateEllipticRgn")

public actual fun createEllipticRgnIndirect(lprect: ConstPtr): Hrgn =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateEllipticRgnIndirect")

public actual fun createEnhMetaFileA(hdc: Hdc, lpfilename: Pcstr, lprc: ConstPtr, lpdesc: Pcstr): Hdc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateEnhMetaFileA")

public actual fun createEnhMetaFileW(hdc: Hdc, lpfilename: Pcwstr, lprc: ConstPtr, lpdesc: Pcwstr): Hdc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateEnhMetaFileW")

public actual fun createFontA(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: UInt, bunderline: UInt, bstrikeout: UInt, icharset: UInt, ioutprecision: UInt, iclipprecision: UInt, iquality: UInt, ipitchandfamily: UInt, pszfacename: Pcstr): Hfont =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateFontA")

public actual fun createFontIndirectA(lplf: ConstPtr): Hfont =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateFontIndirectA")

public actual fun createFontIndirectExA(param0: ConstPtr): Hfont =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateFontIndirectExA")

public actual fun createFontIndirectExW(param0: ConstPtr): Hfont =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateFontIndirectExW")

public actual fun createFontIndirectW(lplf: ConstPtr): Hfont =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateFontIndirectW")

public actual fun createFontPackage(puchsrcbuffer: ConstPtr, ulsrcbuffersize: UInt, ppuchfontpackagebuffer: MutPtr, pulfontpackagebuffersize: MutPtr, pulbyteswritten: MutPtr, usflag: UShort, usttcindex: UShort, ussubsetformat: UShort, ussubsetlanguage: UShort, ussubsetplatform: CreateFontPackageSubsetPlatform, ussubsetencoding: CreateFontPackageSubsetEncoding, pussubsetkeeplist: ConstPtr, ussubsetlistcount: UShort, lpfnallocate: CfpAllocproc, lpfnreallocate: CfpReallocproc, lpfnfree: CfpFreeproc, lpvreserved: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateFontPackage")

public actual fun createFontW(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: UInt, bunderline: UInt, bstrikeout: UInt, icharset: UInt, ioutprecision: UInt, iclipprecision: UInt, iquality: UInt, ipitchandfamily: UInt, pszfacename: Pcwstr): Hfont =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateFontW")

public actual fun createHalftonePalette(hdc: Hdc): Hpalette =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateHalftonePalette")

public actual fun createHatchBrush(ihatch: HatchBrushStyle, color: Colorref): Hbrush =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateHatchBrush")

public actual fun createICA(pszdriver: Pcstr, pszdevice: Pcstr, pszport: Pcstr, pdm: ConstPtr): Hdc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateICA")

public actual fun createICW(pszdriver: Pcwstr, pszdevice: Pcwstr, pszport: Pcwstr, pdm: ConstPtr): Hdc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateICW")

public actual fun createMetaFileA(pszfile: Pcstr): Hdc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateMetaFileA")

public actual fun createMetaFileW(pszfile: Pcwstr): Hdc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateMetaFileW")

public actual fun createPalette(plpal: ConstPtr): Hpalette =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreatePalette")

public actual fun createPatternBrush(hbm: Hbitmap): Hbrush =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreatePatternBrush")

public actual fun createPen(istyle: PenStyle, cwidth: Int, color: Colorref): Hpen =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreatePen")

public actual fun createPenIndirect(plpen: ConstPtr): Hpen =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreatePenIndirect")

public actual fun createPolyPolygonRgn(pptl: ConstPtr, pc: ConstPtr, cpoly: Int, imode: CreatePolygonRgnMode): Hrgn =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreatePolyPolygonRgn")

public actual fun createPolygonRgn(pptl: ConstPtr, cpoint: Int, imode: CreatePolygonRgnMode): Hrgn =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreatePolygonRgn")

public actual fun createRectRgn(x1: Int, y1: Int, x2: Int, y2: Int): Hrgn =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateRectRgn")

public actual fun createRectRgnIndirect(lprect: ConstPtr): Hrgn =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateRectRgnIndirect")

public actual fun createRoundRectRgn(x1: Int, y1: Int, x2: Int, y2: Int, w: Int, h: Int): Hrgn =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateRoundRectRgn")

public actual fun createScalableFontResourceA(fdwhidden: UInt, lpszfont: Pcstr, lpszfile: Pcstr, lpszpath: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateScalableFontResourceA")

public actual fun createScalableFontResourceW(fdwhidden: UInt, lpszfont: Pcwstr, lpszfile: Pcwstr, lpszpath: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateScalableFontResourceW")

public actual fun createSolidBrush(color: Colorref): Hbrush =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiCreateSolidBrush")

public actual fun dPtoLP(hdc: Hdc, lppt: MutPtr, c: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiDPtoLP")

public actual fun deleteDC(hdc: Hdc): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiDeleteDC")

public actual fun deleteEnhMetaFile(hmf: Henhmetafile): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiDeleteEnhMetaFile")

public actual fun deleteMetaFile(hmf: Hmetafile): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiDeleteMetaFile")

public actual fun deleteObject(ho: Hgdiobj): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiDeleteObject")

public actual fun drawAnimatedRects(hwnd: Hwnd, idani: Int, lprcfrom: ConstPtr, lprcto: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiDrawAnimatedRects")

public actual fun drawCaption(hwnd: Hwnd, hdc: Hdc, lprect: ConstPtr, flags: DrawCaptionFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiDrawCaption")

public actual fun drawEdge(hdc: Hdc, qrc: MutPtr, edge: DrawedgeFlags, grfflags: DrawEdgeFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiDrawEdge")

public actual fun drawEscape(hdc: Hdc, iescape: Int, cjin: Int, lpin: Pcstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiDrawEscape")

public actual fun drawFocusRect(hdc: Hdc, lprc: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiDrawFocusRect")

public actual fun drawFrameControl(param0: Hdc, param1: MutPtr, param2: DfcType, param3: DfcsState): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiDrawFrameControl")

public actual fun drawStateA(hdc: Hdc, hbrfore: Hbrush, qfncallback: Drawstateproc, ldata: Lparam, wdata: Wparam, x: Int, y: Int, cx: Int, cy: Int, uflags: DrawstateFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiDrawStateA")

public actual fun drawStateW(hdc: Hdc, hbrfore: Hbrush, qfncallback: Drawstateproc, ldata: Lparam, wdata: Wparam, x: Int, y: Int, cx: Int, cy: Int, uflags: DrawstateFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiDrawStateW")

public actual fun drawTextA(hdc: Hdc, lpchtext: Pcstr, cchtext: Int, lprc: MutPtr, format: DrawTextFormat): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiDrawTextA")

public actual fun drawTextExA(hdc: Hdc, lpchtext: Pstr, cchtext: Int, lprc: MutPtr, format: DrawTextFormat, lpdtp: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiDrawTextExA")

public actual fun drawTextExW(hdc: Hdc, lpchtext: Pwstr, cchtext: Int, lprc: MutPtr, format: DrawTextFormat, lpdtp: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiDrawTextExW")

public actual fun drawTextW(hdc: Hdc, lpchtext: Pcwstr, cchtext: Int, lprc: MutPtr, format: DrawTextFormat): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiDrawTextW")

public actual fun ellipse(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiEllipse")

public actual fun endPaint(hwnd: Hwnd, lppaint: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiEndPaint")

public actual fun endPath(hdc: Hdc): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiEndPath")

public actual fun enumDisplayDevicesA(lpdevice: Pcstr, idevnum: UInt, lpdisplaydevice: MutPtr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiEnumDisplayDevicesA")

public actual fun enumDisplayDevicesW(lpdevice: Pcwstr, idevnum: UInt, lpdisplaydevice: MutPtr, dwflags: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiEnumDisplayDevicesW")

public actual fun enumDisplayMonitors(hdc: Hdc, lprcclip: ConstPtr, lpfnenum: Monitorenumproc, dwdata: Lparam): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiEnumDisplayMonitors")

public actual fun enumDisplaySettingsA(lpszdevicename: Pcstr, imodenum: EnumDisplaySettingsMode, lpdevmode: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiEnumDisplaySettingsA")

public actual fun enumDisplaySettingsExA(lpszdevicename: Pcstr, imodenum: EnumDisplaySettingsMode, lpdevmode: MutPtr, dwflags: EnumDisplaySettingsFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiEnumDisplaySettingsExA")

public actual fun enumDisplaySettingsExW(lpszdevicename: Pcwstr, imodenum: EnumDisplaySettingsMode, lpdevmode: MutPtr, dwflags: EnumDisplaySettingsFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiEnumDisplaySettingsExW")

public actual fun enumDisplaySettingsW(lpszdevicename: Pcwstr, imodenum: EnumDisplaySettingsMode, lpdevmode: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiEnumDisplaySettingsW")

public actual fun enumEnhMetaFile(hdc: Hdc, hmf: Henhmetafile, proc: Enhmfenumproc, param3: ConstPtr, lprect: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiEnumEnhMetaFile")

public actual fun enumFontFamiliesA(hdc: Hdc, lplogfont: Pcstr, lpproc: Fontenumproca, lparam: Lparam): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiEnumFontFamiliesA")

public actual fun enumFontFamiliesExA(hdc: Hdc, lplogfont: ConstPtr, lpproc: Fontenumproca, lparam: Lparam, dwflags: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiEnumFontFamiliesExA")

public actual fun enumFontFamiliesExW(hdc: Hdc, lplogfont: ConstPtr, lpproc: Fontenumprocw, lparam: Lparam, dwflags: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiEnumFontFamiliesExW")

public actual fun enumFontFamiliesW(hdc: Hdc, lplogfont: Pcwstr, lpproc: Fontenumprocw, lparam: Lparam): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiEnumFontFamiliesW")

public actual fun enumFontsA(hdc: Hdc, lplogfont: Pcstr, lpproc: Fontenumproca, lparam: Lparam): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiEnumFontsA")

public actual fun enumFontsW(hdc: Hdc, lplogfont: Pcwstr, lpproc: Fontenumprocw, lparam: Lparam): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiEnumFontsW")

public actual fun enumMetaFile(hdc: Hdc, hmf: Hmetafile, proc: Mfenumproc, param3: Lparam): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiEnumMetaFile")

public actual fun enumObjects(hdc: Hdc, ntype: ObjType, lpfunc: Gobjenumproc, lparam: Lparam): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiEnumObjects")

public actual fun equalRect(lprc1: ConstPtr, lprc2: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiEqualRect")

public actual fun equalRgn(hrgn1: Hrgn, hrgn2: Hrgn): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiEqualRgn")

public actual fun excludeClipRect(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): GdiRegionType =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiExcludeClipRect")

public actual fun excludeUpdateRgn(hdc: Hdc, hwnd: Hwnd): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiExcludeUpdateRgn")

public actual fun extCreatePen(ipenstyle: UInt, cwidth: UInt, plbrush: ConstPtr, cstyle: UInt, pstyle: ConstPtr): Hpen =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiExtCreatePen")

public actual fun extCreateRegion(lpx: ConstPtr, ncount: UInt, lpdata: ConstPtr): Hrgn =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiExtCreateRegion")

public actual fun extFloodFill(hdc: Hdc, x: Int, y: Int, color: Colorref, type: ExtFloodFillType): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiExtFloodFill")

public actual fun extSelectClipRgn(hdc: Hdc, hrgn: Hrgn, mode: RgnCombineMode): GdiRegionType =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiExtSelectClipRgn")

public actual fun extTextOutA(hdc: Hdc, x: Int, y: Int, options: EtoOptions, lprect: ConstPtr, lpstring: Pcstr, c: UInt, lpdx: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiExtTextOutA")

public actual fun extTextOutW(hdc: Hdc, x: Int, y: Int, options: EtoOptions, lprect: ConstPtr, lpstring: Pcwstr, c: UInt, lpdx: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiExtTextOutW")

public actual fun fillPath(hdc: Hdc): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiFillPath")

public actual fun fillRect(hdc: Hdc, lprc: ConstPtr, hbr: Hbrush): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiFillRect")

public actual fun fillRgn(hdc: Hdc, hrgn: Hrgn, hbr: Hbrush): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiFillRgn")

public actual fun fixBrushOrgEx(hdc: Hdc, x: Int, y: Int, ptl: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiFixBrushOrgEx")

public actual fun flattenPath(hdc: Hdc): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiFlattenPath")

public actual fun floodFill(hdc: Hdc, x: Int, y: Int, color: Colorref): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiFloodFill")

public actual fun frameRect(hdc: Hdc, lprc: ConstPtr, hbr: Hbrush): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiFrameRect")

public actual fun frameRgn(hdc: Hdc, hrgn: Hrgn, hbr: Hbrush, w: Int, h: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiFrameRgn")

public actual fun gdiAlphaBlend(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, ftn: Blendfunction): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGdiAlphaBlend")

public actual fun gdiComment(hdc: Hdc, nsize: UInt, lpdata: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGdiComment")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsGdiGdiFlush")
private external fun wasiWindowssysWindowsWin32GraphicsGdiGdiFlush(): Int

public actual fun gdiFlush(): Bool =
    wasiWindowssysWindowsWin32GraphicsGdiGdiFlush()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsGdiGdiGetBatchLimit")
private external fun wasiWindowssysWindowsWin32GraphicsGdiGdiGetBatchLimit(): Int

public actual fun gdiGetBatchLimit(): UInt =
    wasiWindowssysWindowsWin32GraphicsGdiGdiGetBatchLimit().toUInt()

public actual fun gdiGradientFill(hdc: Hdc, pvertex: ConstPtr, nvertex: UInt, pmesh: ConstPtr, ncount: UInt, ulmode: GradientFill): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGdiGradientFill")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsGdiGdiSetBatchLimit")
private external fun wasiWindowssysWindowsWin32GraphicsGdiGdiSetBatchLimit(dw: Int): Int

public actual fun gdiSetBatchLimit(dw: UInt): UInt =
    wasiWindowssysWindowsWin32GraphicsGdiGdiSetBatchLimit(dw.toInt()).toUInt()

public actual fun gdiTransparentBlt(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGdiTransparentBlt")

public actual fun getArcDirection(hdc: Hdc): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetArcDirection")

public actual fun getAspectRatioFilterEx(hdc: Hdc, lpsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetAspectRatioFilterEx")

public actual fun getBitmapBits(hbit: Hbitmap, cb: Int, lpvbits: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetBitmapBits")

public actual fun getBitmapDimensionEx(hbit: Hbitmap, lpsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetBitmapDimensionEx")

public actual fun getBkColor(hdc: Hdc): Colorref =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetBkColor")

public actual fun getBkMode(hdc: Hdc): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetBkMode")

public actual fun getBoundsRect(hdc: Hdc, lprect: MutPtr, flags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetBoundsRect")

public actual fun getBrushOrgEx(hdc: Hdc, lppt: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetBrushOrgEx")

public actual fun getCharABCWidthsA(hdc: Hdc, wfirst: UInt, wlast: UInt, lpabc: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetCharABCWidthsA")

public actual fun getCharABCWidthsFloatA(hdc: Hdc, ifirst: UInt, ilast: UInt, lpabc: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetCharABCWidthsFloatA")

public actual fun getCharABCWidthsFloatW(hdc: Hdc, ifirst: UInt, ilast: UInt, lpabc: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetCharABCWidthsFloatW")

public actual fun getCharABCWidthsI(hdc: Hdc, gifirst: UInt, cgi: UInt, pgi: ConstPtr, pabc: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetCharABCWidthsI")

public actual fun getCharABCWidthsW(hdc: Hdc, wfirst: UInt, wlast: UInt, lpabc: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetCharABCWidthsW")

public actual fun getCharWidth32A(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetCharWidth32A")

public actual fun getCharWidth32W(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetCharWidth32W")

public actual fun getCharWidthA(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetCharWidthA")

public actual fun getCharWidthFloatA(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetCharWidthFloatA")

public actual fun getCharWidthFloatW(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetCharWidthFloatW")

public actual fun getCharWidthI(hdc: Hdc, gifirst: UInt, cgi: UInt, pgi: ConstPtr, piwidths: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetCharWidthI")

public actual fun getCharWidthW(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetCharWidthW")

public actual fun getCharacterPlacementA(hdc: Hdc, lpstring: Pcstr, ncount: Int, nmexextent: Int, lpresults: MutPtr, dwflags: GetCharacterPlacementFlags): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetCharacterPlacementA")

public actual fun getCharacterPlacementW(hdc: Hdc, lpstring: Pcwstr, ncount: Int, nmexextent: Int, lpresults: MutPtr, dwflags: GetCharacterPlacementFlags): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetCharacterPlacementW")

public actual fun getClipBox(hdc: Hdc, lprect: MutPtr): GdiRegionType =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetClipBox")

public actual fun getClipRgn(hdc: Hdc, hrgn: Hrgn): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetClipRgn")

public actual fun getColorAdjustment(hdc: Hdc, lpca: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetColorAdjustment")

public actual fun getCurrentObject(hdc: Hdc, type: UInt): Hgdiobj =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetCurrentObject")

public actual fun getCurrentPositionEx(hdc: Hdc, lppt: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetCurrentPositionEx")

public actual fun getDC(hwnd: Hwnd): Hdc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetDC")

public actual fun getDCBrushColor(hdc: Hdc): Colorref =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetDCBrushColor")

public actual fun getDCEx(hwnd: Hwnd, hrgnclip: Hrgn, flags: GetDcxFlags): Hdc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetDCEx")

public actual fun getDCOrgEx(hdc: Hdc, lppt: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetDCOrgEx")

public actual fun getDCPenColor(hdc: Hdc): Colorref =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetDCPenColor")

public actual fun getDIBColorTable(hdc: Hdc, istart: UInt, centries: UInt, prgbq: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetDIBColorTable")

public actual fun getDIBits(hdc: Hdc, hbm: Hbitmap, start: UInt, clines: UInt, lpvbits: MutPtr, lpbmi: MutPtr, usage: DibUsage): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetDIBits")

public actual fun getDeviceCaps(hdc: Hdc, index: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetDeviceCaps")

public actual fun getEnhMetaFileA(lpname: Pcstr): Henhmetafile =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetEnhMetaFileA")

public actual fun getEnhMetaFileBits(hemf: Henhmetafile, nsize: UInt, lpdata: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetEnhMetaFileBits")

public actual fun getEnhMetaFileDescriptionA(hemf: Henhmetafile, cchbuffer: UInt, lpdescription: Pstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetEnhMetaFileDescriptionA")

public actual fun getEnhMetaFileDescriptionW(hemf: Henhmetafile, cchbuffer: UInt, lpdescription: Pwstr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetEnhMetaFileDescriptionW")

public actual fun getEnhMetaFileHeader(hemf: Henhmetafile, nsize: UInt, lpenhmetaheader: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetEnhMetaFileHeader")

public actual fun getEnhMetaFilePaletteEntries(hemf: Henhmetafile, nnumentries: UInt, lppaletteentries: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetEnhMetaFilePaletteEntries")

public actual fun getEnhMetaFileW(lpname: Pcwstr): Henhmetafile =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetEnhMetaFileW")

public actual fun getFontData(hdc: Hdc, dwtable: UInt, dwoffset: UInt, pvbuffer: MutPtr, cjbuffer: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetFontData")

public actual fun getFontLanguageInfo(hdc: Hdc): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetFontLanguageInfo")

public actual fun getFontUnicodeRanges(hdc: Hdc, lpgs: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetFontUnicodeRanges")

public actual fun getGlyphIndicesA(hdc: Hdc, lpstr: Pcstr, c: Int, pgi: MutPtr, fl: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetGlyphIndicesA")

public actual fun getGlyphIndicesW(hdc: Hdc, lpstr: Pcwstr, c: Int, pgi: MutPtr, fl: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetGlyphIndicesW")

public actual fun getGlyphOutlineA(hdc: Hdc, uchar: UInt, fuformat: GetGlyphOutlineFormat, lpgm: MutPtr, cjbuffer: UInt, pvbuffer: MutPtr, lpmat2: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetGlyphOutlineA")

public actual fun getGlyphOutlineW(hdc: Hdc, uchar: UInt, fuformat: GetGlyphOutlineFormat, lpgm: MutPtr, cjbuffer: UInt, pvbuffer: MutPtr, lpmat2: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetGlyphOutlineW")

public actual fun getGraphicsMode(hdc: Hdc): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetGraphicsMode")

public actual fun getKerningPairsA(hdc: Hdc, npairs: UInt, lpkernpair: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetKerningPairsA")

public actual fun getKerningPairsW(hdc: Hdc, npairs: UInt, lpkernpair: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetKerningPairsW")

public actual fun getLayout(hdc: Hdc): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetLayout")

public actual fun getMapMode(hdc: Hdc): HdcMapMode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetMapMode")

public actual fun getMetaFileA(lpname: Pcstr): Hmetafile =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetMetaFileA")

public actual fun getMetaFileBitsEx(hmf: Hmetafile, cbbuffer: UInt, lpdata: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetMetaFileBitsEx")

public actual fun getMetaFileW(lpname: Pcwstr): Hmetafile =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetMetaFileW")

public actual fun getMetaRgn(hdc: Hdc, hrgn: Hrgn): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetMetaRgn")

public actual fun getMiterLimit(hdc: Hdc, plimit: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetMiterLimit")

public actual fun getMonitorInfoA(hmonitor: Hmonitor, lpmi: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetMonitorInfoA")

public actual fun getMonitorInfoW(hmonitor: Hmonitor, lpmi: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetMonitorInfoW")

public actual fun getNearestColor(hdc: Hdc, color: Colorref): Colorref =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetNearestColor")

public actual fun getNearestPaletteIndex(h: Hpalette, color: Colorref): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetNearestPaletteIndex")

public actual fun getObjectA(h: Hgdiobj, c: Int, pv: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetObjectA")

public actual fun getObjectType(h: Hgdiobj): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetObjectType")

public actual fun getObjectW(h: Hgdiobj, c: Int, pv: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetObjectW")

public actual fun getOutlineTextMetricsA(hdc: Hdc, cjcopy: UInt, potm: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetOutlineTextMetricsA")

public actual fun getOutlineTextMetricsW(hdc: Hdc, cjcopy: UInt, potm: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetOutlineTextMetricsW")

public actual fun getPaletteEntries(hpal: Hpalette, istart: UInt, centries: UInt, ppalentries: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetPaletteEntries")

public actual fun getPath(hdc: Hdc, apt: MutPtr, aj: MutPtr, cpt: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetPath")

public actual fun getPixel(hdc: Hdc, x: Int, y: Int): Colorref =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetPixel")

public actual fun getPolyFillMode(hdc: Hdc): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetPolyFillMode")

public actual fun getROP2(hdc: Hdc): R2Mode =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetROP2")

public actual fun getRandomRgn(hdc: Hdc, hrgn: Hrgn, i: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetRandomRgn")

public actual fun getRasterizerCaps(lpraststat: MutPtr, cjbytes: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetRasterizerCaps")

public actual fun getRegionData(hrgn: Hrgn, ncount: UInt, lprgndata: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetRegionData")

public actual fun getRgnBox(hrgn: Hrgn, lprc: MutPtr): GdiRegionType =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetRgnBox")

public actual fun getStockObject(i: GetStockObjectFlags): Hgdiobj =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetStockObject")

public actual fun getStretchBltMode(hdc: Hdc): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetStretchBltMode")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsGdiGetSysColor")
private external fun wasiWindowssysWindowsWin32GraphicsGdiGetSysColor(nindex: Int): Int

public actual fun getSysColor(nindex: SysColorIndex): UInt =
    wasiWindowssysWindowsWin32GraphicsGdiGetSysColor(nindex).toUInt()

public actual fun getSysColorBrush(nindex: SysColorIndex): Hbrush =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetSysColorBrush")

public actual fun getSystemPaletteEntries(hdc: Hdc, istart: UInt, centries: UInt, ppalentries: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetSystemPaletteEntries")

public actual fun getSystemPaletteUse(hdc: Hdc): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetSystemPaletteUse")

public actual fun getTabbedTextExtentA(hdc: Hdc, lpstring: Pcstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetTabbedTextExtentA")

public actual fun getTabbedTextExtentW(hdc: Hdc, lpstring: Pcwstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetTabbedTextExtentW")

public actual fun getTextAlign(hdc: Hdc): TextAlignOptions =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetTextAlign")

public actual fun getTextCharacterExtra(hdc: Hdc): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetTextCharacterExtra")

public actual fun getTextColor(hdc: Hdc): Colorref =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetTextColor")

public actual fun getTextExtentExPointA(hdc: Hdc, lpszstring: Pcstr, cchstring: Int, nmaxextent: Int, lpnfit: MutPtr, lpndx: MutPtr, lpsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetTextExtentExPointA")

public actual fun getTextExtentExPointI(hdc: Hdc, lpwszstring: ConstPtr, cwchstring: Int, nmaxextent: Int, lpnfit: MutPtr, lpndx: MutPtr, lpsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetTextExtentExPointI")

public actual fun getTextExtentExPointW(hdc: Hdc, lpszstring: Pcwstr, cchstring: Int, nmaxextent: Int, lpnfit: MutPtr, lpndx: MutPtr, lpsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetTextExtentExPointW")

public actual fun getTextExtentPoint32A(hdc: Hdc, lpstring: Pcstr, c: Int, psizl: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetTextExtentPoint32A")

public actual fun getTextExtentPoint32W(hdc: Hdc, lpstring: Pcwstr, c: Int, psizl: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetTextExtentPoint32W")

public actual fun getTextExtentPointA(hdc: Hdc, lpstring: Pcstr, c: Int, lpsz: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetTextExtentPointA")

public actual fun getTextExtentPointI(hdc: Hdc, pgiin: ConstPtr, cgi: Int, psize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetTextExtentPointI")

public actual fun getTextExtentPointW(hdc: Hdc, lpstring: Pcwstr, c: Int, lpsz: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetTextExtentPointW")

public actual fun getTextFaceA(hdc: Hdc, c: Int, lpname: Pstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetTextFaceA")

public actual fun getTextFaceW(hdc: Hdc, c: Int, lpname: Pwstr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetTextFaceW")

public actual fun getTextMetricsA(hdc: Hdc, lptm: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetTextMetricsA")

public actual fun getTextMetricsW(hdc: Hdc, lptm: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetTextMetricsW")

public actual fun getUpdateRect(hwnd: Hwnd, lprect: MutPtr, berase: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetUpdateRect")

public actual fun getUpdateRgn(hwnd: Hwnd, hrgn: Hrgn, berase: Bool): GdiRegionType =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetUpdateRgn")

public actual fun getViewportExtEx(hdc: Hdc, lpsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetViewportExtEx")

public actual fun getViewportOrgEx(hdc: Hdc, lppoint: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetViewportOrgEx")

public actual fun getWinMetaFileBits(hemf: Henhmetafile, cbdata16: UInt, pdata16: MutPtr, imapmode: Int, hdcref: Hdc): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetWinMetaFileBits")

public actual fun getWindowDC(hwnd: Hwnd): Hdc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetWindowDC")

public actual fun getWindowExtEx(hdc: Hdc, lpsize: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetWindowExtEx")

public actual fun getWindowOrgEx(hdc: Hdc, lppoint: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetWindowOrgEx")

public actual fun getWindowRgn(hwnd: Hwnd, hrgn: Hrgn): GdiRegionType =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetWindowRgn")

public actual fun getWindowRgnBox(hwnd: Hwnd, lprc: MutPtr): GdiRegionType =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetWindowRgnBox")

public actual fun getWorldTransform(hdc: Hdc, lpxf: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGetWorldTransform")

public actual fun gradientFill(hdc: Hdc, pvertex: ConstPtr, nvertex: UInt, pmesh: ConstPtr, nmesh: UInt, ulmode: GradientFill): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGradientFill")

public actual fun grayStringA(hdc: Hdc, hbrush: Hbrush, lpoutputfunc: Graystringproc, lpdata: Lparam, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGrayStringA")

public actual fun grayStringW(hdc: Hdc, hbrush: Hbrush, lpoutputfunc: Graystringproc, lpdata: Lparam, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiGrayStringW")

public actual fun inflateRect(lprc: MutPtr, dx: Int, dy: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiInflateRect")

public actual fun intersectClipRect(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): GdiRegionType =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiIntersectClipRect")

public actual fun intersectRect(lprcdst: MutPtr, lprcsrc1: ConstPtr, lprcsrc2: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiIntersectRect")

public actual fun invalidateRect(hwnd: Hwnd, lprect: ConstPtr, berase: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiInvalidateRect")

public actual fun invalidateRgn(hwnd: Hwnd, hrgn: Hrgn, berase: Bool): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiInvalidateRgn")

public actual fun invertRect(hdc: Hdc, lprc: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiInvertRect")

public actual fun invertRgn(hdc: Hdc, hrgn: Hrgn): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiInvertRgn")

public actual fun isRectEmpty(lprc: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiIsRectEmpty")

public actual fun lPtoDP(hdc: Hdc, lppt: MutPtr, c: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiLPtoDP")

public actual fun lineDDA(xstart: Int, ystart: Int, xend: Int, yend: Int, lpproc: Lineddaproc, data: Lparam): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiLineDDA")

public actual fun lineTo(hdc: Hdc, x: Int, y: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiLineTo")

public actual fun loadBitmapA(hinstance: Hinstance, lpbitmapname: Pcstr): Hbitmap =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiLoadBitmapA")

public actual fun loadBitmapW(hinstance: Hinstance, lpbitmapname: Pcwstr): Hbitmap =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiLoadBitmapW")

public actual fun lockWindowUpdate(hwndlock: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiLockWindowUpdate")

public actual fun mapWindowPoints(hwndfrom: Hwnd, hwndto: Hwnd, lppoints: MutPtr, cpoints: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiMapWindowPoints")

public actual fun maskBlt(hdcdest: Hdc, xdest: Int, ydest: Int, width: Int, height: Int, hdcsrc: Hdc, xsrc: Int, ysrc: Int, hbmmask: Hbitmap, xmask: Int, ymask: Int, rop: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiMaskBlt")

public actual fun mergeFontPackage(puchmergefontbuffer: ConstPtr, ulmergefontbuffersize: UInt, puchfontpackagebuffer: ConstPtr, ulfontpackagebuffersize: UInt, ppuchdestbuffer: MutPtr, puldestbuffersize: MutPtr, pulbyteswritten: MutPtr, usmode: UShort, lpfnallocate: CfpAllocproc, lpfnreallocate: CfpReallocproc, lpfnfree: CfpFreeproc, lpvreserved: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiMergeFontPackage")

public actual fun modifyWorldTransform(hdc: Hdc, lpxf: ConstPtr, mode: ModifyWorldTransformMode): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiModifyWorldTransform")

public actual fun monitorFromPoint(pt: Point, dwflags: MonitorFromFlags): Hmonitor =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiMonitorFromPoint")

public actual fun monitorFromRect(lprc: ConstPtr, dwflags: MonitorFromFlags): Hmonitor =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiMonitorFromRect")

public actual fun monitorFromWindow(hwnd: Hwnd, dwflags: MonitorFromFlags): Hmonitor =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiMonitorFromWindow")

public actual fun moveToEx(hdc: Hdc, x: Int, y: Int, lppt: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiMoveToEx")

public actual fun offsetClipRgn(hdc: Hdc, x: Int, y: Int): GdiRegionType =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiOffsetClipRgn")

public actual fun offsetRect(lprc: MutPtr, dx: Int, dy: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiOffsetRect")

public actual fun offsetRgn(hrgn: Hrgn, x: Int, y: Int): GdiRegionType =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiOffsetRgn")

public actual fun offsetViewportOrgEx(hdc: Hdc, x: Int, y: Int, lppt: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiOffsetViewportOrgEx")

public actual fun offsetWindowOrgEx(hdc: Hdc, x: Int, y: Int, lppt: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiOffsetWindowOrgEx")

public actual fun paintDesktop(hdc: Hdc): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiPaintDesktop")

public actual fun paintRgn(hdc: Hdc, hrgn: Hrgn): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiPaintRgn")

public actual fun patBlt(hdc: Hdc, x: Int, y: Int, w: Int, h: Int, rop: RopCode): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiPatBlt")

public actual fun pathToRegion(hdc: Hdc): Hrgn =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiPathToRegion")

public actual fun pie(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiPie")

public actual fun playEnhMetaFile(hdc: Hdc, hmf: Henhmetafile, lprect: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiPlayEnhMetaFile")

public actual fun playEnhMetaFileRecord(hdc: Hdc, pht: ConstPtr, pmr: ConstPtr, cht: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiPlayEnhMetaFileRecord")

public actual fun playMetaFile(hdc: Hdc, hmf: Hmetafile): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiPlayMetaFile")

public actual fun playMetaFileRecord(hdc: Hdc, lphandletable: ConstPtr, lpmr: ConstPtr, noobjs: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiPlayMetaFileRecord")

public actual fun plgBlt(hdcdest: Hdc, lppoint: ConstPtr, hdcsrc: Hdc, xsrc: Int, ysrc: Int, width: Int, height: Int, hbmmask: Hbitmap, xmask: Int, ymask: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiPlgBlt")

public actual fun polyBezier(hdc: Hdc, apt: ConstPtr, cpt: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiPolyBezier")

public actual fun polyBezierTo(hdc: Hdc, apt: ConstPtr, cpt: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiPolyBezierTo")

public actual fun polyDraw(hdc: Hdc, apt: ConstPtr, aj: ConstPtr, cpt: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiPolyDraw")

public actual fun polyPolygon(hdc: Hdc, apt: ConstPtr, asz: ConstPtr, csz: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiPolyPolygon")

public actual fun polyPolyline(hdc: Hdc, apt: ConstPtr, asz: ConstPtr, csz: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiPolyPolyline")

public actual fun polyTextOutA(hdc: Hdc, ppt: ConstPtr, nstrings: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiPolyTextOutA")

public actual fun polyTextOutW(hdc: Hdc, ppt: ConstPtr, nstrings: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiPolyTextOutW")

public actual fun polygon(hdc: Hdc, apt: ConstPtr, cpt: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiPolygon")

public actual fun polyline(hdc: Hdc, apt: ConstPtr, cpt: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiPolyline")

public actual fun polylineTo(hdc: Hdc, apt: ConstPtr, cpt: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiPolylineTo")

public actual fun ptInRect(lprc: ConstPtr, pt: Point): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiPtInRect")

public actual fun ptInRegion(hrgn: Hrgn, x: Int, y: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiPtInRegion")

public actual fun ptVisible(hdc: Hdc, x: Int, y: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiPtVisible")

public actual fun realizePalette(hdc: Hdc): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiRealizePalette")

public actual fun rectInRegion(hrgn: Hrgn, lprect: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiRectInRegion")

public actual fun rectVisible(hdc: Hdc, lprect: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiRectVisible")

public actual fun rectangle(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiRectangle")

public actual fun redrawWindow(hwnd: Hwnd, lprcupdate: ConstPtr, hrgnupdate: Hrgn, flags: RedrawWindowFlags): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiRedrawWindow")

public actual fun releaseDC(hwnd: Hwnd, hdc: Hdc): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiReleaseDC")

public actual fun removeFontMemResourceEx(h: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiRemoveFontMemResourceEx")

public actual fun removeFontResourceA(lpfilename: Pcstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiRemoveFontResourceA")

public actual fun removeFontResourceExA(name: Pcstr, fl: UInt, pdv: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiRemoveFontResourceExA")

public actual fun removeFontResourceExW(name: Pcwstr, fl: UInt, pdv: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiRemoveFontResourceExW")

public actual fun removeFontResourceW(lpfilename: Pcwstr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiRemoveFontResourceW")

public actual fun resetDCA(hdc: Hdc, lpdm: ConstPtr): Hdc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiResetDCA")

public actual fun resetDCW(hdc: Hdc, lpdm: ConstPtr): Hdc =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiResetDCW")

public actual fun resizePalette(hpal: Hpalette, n: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiResizePalette")

public actual fun restoreDC(hdc: Hdc, nsaveddc: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiRestoreDC")

public actual fun roundRect(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int, width: Int, height: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiRoundRect")

public actual fun saveDC(hdc: Hdc): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSaveDC")

public actual fun scaleViewportExtEx(hdc: Hdc, xn: Int, dx: Int, yn: Int, yd: Int, lpsz: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiScaleViewportExtEx")

public actual fun scaleWindowExtEx(hdc: Hdc, xn: Int, xd: Int, yn: Int, yd: Int, lpsz: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiScaleWindowExtEx")

public actual fun screenToClient(hwnd: Hwnd, lppoint: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiScreenToClient")

public actual fun selectClipPath(hdc: Hdc, mode: RgnCombineMode): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSelectClipPath")

public actual fun selectClipRgn(hdc: Hdc, hrgn: Hrgn): GdiRegionType =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSelectClipRgn")

public actual fun selectObject(hdc: Hdc, h: Hgdiobj): Hgdiobj =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSelectObject")

public actual fun selectPalette(hdc: Hdc, hpal: Hpalette, bforcebkgd: Bool): Hpalette =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSelectPalette")

public actual fun setArcDirection(hdc: Hdc, dir: ArcDirection): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetArcDirection")

public actual fun setBitmapBits(hbm: Hbitmap, cb: UInt, pvbits: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetBitmapBits")

public actual fun setBitmapDimensionEx(hbm: Hbitmap, w: Int, h: Int, lpsz: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetBitmapDimensionEx")

public actual fun setBkColor(hdc: Hdc, color: Colorref): Colorref =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetBkColor")

public actual fun setBkMode(hdc: Hdc, mode: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetBkMode")

public actual fun setBoundsRect(hdc: Hdc, lprect: ConstPtr, flags: SetBoundsRectFlags): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetBoundsRect")

public actual fun setBrushOrgEx(hdc: Hdc, x: Int, y: Int, lppt: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetBrushOrgEx")

public actual fun setColorAdjustment(hdc: Hdc, lpca: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetColorAdjustment")

public actual fun setDCBrushColor(hdc: Hdc, color: Colorref): Colorref =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetDCBrushColor")

public actual fun setDCPenColor(hdc: Hdc, color: Colorref): Colorref =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetDCPenColor")

public actual fun setDIBColorTable(hdc: Hdc, istart: UInt, centries: UInt, prgbq: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetDIBColorTable")

public actual fun setDIBits(hdc: Hdc, hbm: Hbitmap, start: UInt, clines: UInt, lpbits: ConstPtr, lpbmi: ConstPtr, coloruse: DibUsage): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetDIBits")

public actual fun setDIBitsToDevice(hdc: Hdc, xdest: Int, ydest: Int, w: UInt, h: UInt, xsrc: Int, ysrc: Int, startscan: UInt, clines: UInt, lpvbits: ConstPtr, lpbmi: ConstPtr, coloruse: DibUsage): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetDIBitsToDevice")

public actual fun setEnhMetaFileBits(nsize: UInt, pb: ConstPtr): Henhmetafile =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetEnhMetaFileBits")

public actual fun setGraphicsMode(hdc: Hdc, imode: GraphicsMode): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetGraphicsMode")

public actual fun setLayout(hdc: Hdc, l: DcLayout): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetLayout")

public actual fun setMapMode(hdc: Hdc, imode: HdcMapMode): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetMapMode")

public actual fun setMapperFlags(hdc: Hdc, flags: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetMapperFlags")

public actual fun setMetaFileBitsEx(cbbuffer: UInt, lpdata: ConstPtr): Hmetafile =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetMetaFileBitsEx")

public actual fun setMetaRgn(hdc: Hdc): GdiRegionType =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetMetaRgn")

public actual fun setMiterLimit(hdc: Hdc, limit: Float, old: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetMiterLimit")

public actual fun setPaletteEntries(hpal: Hpalette, istart: UInt, centries: UInt, ppalentries: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetPaletteEntries")

public actual fun setPixel(hdc: Hdc, x: Int, y: Int, color: Colorref): Colorref =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetPixel")

public actual fun setPixelV(hdc: Hdc, x: Int, y: Int, color: Colorref): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetPixelV")

public actual fun setPolyFillMode(hdc: Hdc, mode: CreatePolygonRgnMode): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetPolyFillMode")

public actual fun setROP2(hdc: Hdc, rop2: R2Mode): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetROP2")

public actual fun setRect(lprc: MutPtr, xleft: Int, ytop: Int, xright: Int, ybottom: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetRect")

public actual fun setRectEmpty(lprc: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetRectEmpty")

public actual fun setRectRgn(hrgn: Hrgn, left: Int, top: Int, right: Int, bottom: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetRectRgn")

public actual fun setStretchBltMode(hdc: Hdc, mode: StretchBltMode): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetStretchBltMode")

public actual fun setSysColors(celements: Int, lpaelements: ConstPtr, lpargbvalues: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetSysColors")

public actual fun setSystemPaletteUse(hdc: Hdc, use: SystemPaletteUse): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetSystemPaletteUse")

public actual fun setTextAlign(hdc: Hdc, align: TextAlignOptions): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetTextAlign")

public actual fun setTextCharacterExtra(hdc: Hdc, extra: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetTextCharacterExtra")

public actual fun setTextColor(hdc: Hdc, color: Colorref): Colorref =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetTextColor")

public actual fun setTextJustification(hdc: Hdc, extra: Int, count: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetTextJustification")

public actual fun setViewportExtEx(hdc: Hdc, x: Int, y: Int, lpsz: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetViewportExtEx")

public actual fun setViewportOrgEx(hdc: Hdc, x: Int, y: Int, lppt: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetViewportOrgEx")

public actual fun setWindowExtEx(hdc: Hdc, x: Int, y: Int, lpsz: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetWindowExtEx")

public actual fun setWindowOrgEx(hdc: Hdc, x: Int, y: Int, lppt: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetWindowOrgEx")

public actual fun setWindowRgn(hwnd: Hwnd, hrgn: Hrgn, bredraw: Bool): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetWindowRgn")

public actual fun setWorldTransform(hdc: Hdc, lpxf: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSetWorldTransform")

public actual fun stretchBlt(hdcdest: Hdc, xdest: Int, ydest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xsrc: Int, ysrc: Int, wsrc: Int, hsrc: Int, rop: RopCode): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiStretchBlt")

public actual fun stretchDIBits(hdc: Hdc, xdest: Int, ydest: Int, destwidth: Int, destheight: Int, xsrc: Int, ysrc: Int, srcwidth: Int, srcheight: Int, lpbits: ConstPtr, lpbmi: ConstPtr, iusage: DibUsage, rop: RopCode): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiStretchDIBits")

public actual fun strokeAndFillPath(hdc: Hdc): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiStrokeAndFillPath")

public actual fun strokePath(hdc: Hdc): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiStrokePath")

public actual fun subtractRect(lprcdst: MutPtr, lprcsrc1: ConstPtr, lprcsrc2: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiSubtractRect")

public actual fun tTCharToUnicode(hdc: Hdc, puccharcodes: ConstPtr, ulcharcodesize: UInt, pusshortcodes: MutPtr, ulshortcodesize: UInt, ulflags: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiTTCharToUnicode")

public actual fun tTDeleteEmbeddedFont(hfontreference: Handle, ulflags: UInt, pulstatus: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiTTDeleteEmbeddedFont")

public actual fun tTEmbedFont(hdc: Hdc, ulflags: TtembedFlags, ulcharset: EmbedFontCharset, pulprivstatus: MutPtr, pulstatus: MutPtr, lpfnwritetostream: Writeembedproc, lpvwritestream: ConstPtr, puscharcodeset: ConstPtr, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiTTEmbedFont")

public actual fun tTEmbedFontEx(hdc: Hdc, ulflags: TtembedFlags, ulcharset: EmbedFontCharset, pulprivstatus: MutPtr, pulstatus: MutPtr, lpfnwritetostream: Writeembedproc, lpvwritestream: ConstPtr, pulcharcodeset: ConstPtr, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiTTEmbedFontEx")

public actual fun tTEmbedFontFromFileA(hdc: Hdc, szfontfilename: Pcstr, usttcindex: UShort, ulflags: TtembedFlags, ulcharset: EmbedFontCharset, pulprivstatus: MutPtr, pulstatus: MutPtr, lpfnwritetostream: Writeembedproc, lpvwritestream: ConstPtr, puscharcodeset: ConstPtr, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiTTEmbedFontFromFileA")

public actual fun tTEnableEmbeddingForFacename(lpszfacename: Pcstr, benable: Bool): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiTTEnableEmbeddingForFacename")

public actual fun tTGetEmbeddedFontInfo(ulflags: TtembedFlags, pulprivstatus: MutPtr, ulprivs: FontLicensePrivs, pulstatus: MutPtr, lpfnreadfromstream: Readembedproc, lpvreadstream: ConstPtr, pttloadinfo: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiTTGetEmbeddedFontInfo")

public actual fun tTGetEmbeddingType(hdc: Hdc, pulembedtype: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiTTGetEmbeddingType")

public actual fun tTGetNewFontName(phfontreference: ConstPtr, wzwinfamilyname: Pwstr, cchmaxwinname: Int, szmacfamilyname: Pstr, cchmaxmacname: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiTTGetNewFontName")

public actual fun tTIsEmbeddingEnabled(hdc: Hdc, pbenabled: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiTTIsEmbeddingEnabled")

public actual fun tTIsEmbeddingEnabledForFacename(lpszfacename: Pcstr, pbenabled: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiTTIsEmbeddingEnabledForFacename")

public actual fun tTLoadEmbeddedFont(phfontreference: MutPtr, ulflags: UInt, pulprivstatus: MutPtr, ulprivs: FontLicensePrivs, pulstatus: MutPtr, lpfnreadfromstream: Readembedproc, lpvreadstream: ConstPtr, szwinfamilyname: Pcwstr, szmacfamilyname: Pcstr, pttloadinfo: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiTTLoadEmbeddedFont")

public actual fun tTRunValidationTests(hdc: Hdc, ptestparam: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiTTRunValidationTests")

public actual fun tTRunValidationTestsEx(hdc: Hdc, ptestparam: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiTTRunValidationTestsEx")

public actual fun tabbedTextOutA(hdc: Hdc, x: Int, y: Int, lpstring: Pcstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: ConstPtr, ntaborigin: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiTabbedTextOutA")

public actual fun tabbedTextOutW(hdc: Hdc, x: Int, y: Int, lpstring: Pcwstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: ConstPtr, ntaborigin: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiTabbedTextOutW")

public actual fun textOutA(hdc: Hdc, x: Int, y: Int, lpstring: Pcstr, c: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiTextOutA")

public actual fun textOutW(hdc: Hdc, x: Int, y: Int, lpstring: Pcwstr, c: Int): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiTextOutW")

public actual fun transparentBlt(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiTransparentBlt")

public actual fun unionRect(lprcdst: MutPtr, lprcsrc1: ConstPtr, lprcsrc2: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiUnionRect")

public actual fun unrealizeObject(h: Hgdiobj): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiUnrealizeObject")

public actual fun updateColors(hdc: Hdc): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiUpdateColors")

public actual fun updateWindow(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiUpdateWindow")

public actual fun validateRect(hwnd: Hwnd, lprect: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiValidateRect")

public actual fun validateRgn(hwnd: Hwnd, hrgn: Hrgn): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiValidateRgn")

public actual fun widenPath(hdc: Hdc): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiWidenPath")

public actual fun windowFromDC(hdc: Hdc): Hwnd =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiWindowFromDC")

public actual fun wglSwapMultipleBuffers(param0: UInt, param1: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiWglSwapMultipleBuffers")
