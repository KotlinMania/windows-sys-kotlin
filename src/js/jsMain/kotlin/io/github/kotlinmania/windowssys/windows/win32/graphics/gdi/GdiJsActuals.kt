@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val windowsWin32GraphicsGdiNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun abortPath(hdc: Hdc): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiAbortPath(hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addFontMemResourceEx(pfileview: ConstPtr, cjsize: UInt, pvresrved: ConstPtr, pnumfonts: ConstPtr): Handle =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiAddFontMemResourceEx(pfileview.rawAddress.toString(), cjsize.toInt(), pvresrved.rawAddress.toString(), pnumfonts.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addFontResourceA(param0: Pcstr): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiAddFontResourceA(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addFontResourceExA(name: Pcstr, fl: FontResourceCharacteristics, res: ConstPtr): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiAddFontResourceExA(name.rawAddress.toString(), fl.toInt(), res.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addFontResourceExW(name: Pcwstr, fl: FontResourceCharacteristics, res: ConstPtr): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiAddFontResourceExW(name.rawAddress.toString(), fl.toInt(), res.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addFontResourceW(param0: Pcwstr): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiAddFontResourceW(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alphaBlend(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, ftn: Blendfunction): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun angleArc(hdc: Hdc, x: Int, y: Int, r: UInt, startangle: Float, sweepangle: Float): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiAngleArc(hdc.rawAddress.toString(), x, y, r.toInt(), startangle.toDouble(), sweepangle.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun animatePalette(hpal: Hpalette, istartindex: UInt, centries: UInt, ppe: ConstPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiAnimatePalette(hpal.rawAddress.toString(), istartindex.toInt(), centries.toInt(), ppe.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc(hdc: Hdc, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiArc(hdc.rawAddress.toString(), x1, y1, x2, y2, x3, y3, x4, y4) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arcTo(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiArcTo(hdc.rawAddress.toString(), left, top, right, bottom, xr1, yr1, xr2, yr2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun beginPaint(hwnd: Hwnd, lppaint: MutPtr): Hdc =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiBeginPaint(hwnd.rawAddress.toString(), lppaint.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun beginPath(hdc: Hdc): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiBeginPath(hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bitBlt(hdc: Hdc, x: Int, y: Int, cx: Int, cy: Int, hdcsrc: Hdc, x1: Int, y1: Int, rop: RopCode): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiBitBlt(hdc.rawAddress.toString(), x, y, cx, cy, hdcsrc.rawAddress.toString(), x1, y1, rop.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelDC(hdc: Hdc): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCancelDC(hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeDisplaySettingsA(lpdevmode: ConstPtr, dwflags: CdsType): DispChange =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiChangeDisplaySettingsA(lpdevmode.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeDisplaySettingsExA(lpszdevicename: Pcstr, lpdevmode: ConstPtr, hwnd: Hwnd, dwflags: CdsType, lparam: ConstPtr): DispChange =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiChangeDisplaySettingsExA(lpszdevicename.rawAddress.toString(), lpdevmode.rawAddress.toString(), hwnd.rawAddress.toString(), dwflags.toInt(), lparam.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeDisplaySettingsExW(lpszdevicename: Pcwstr, lpdevmode: ConstPtr, hwnd: Hwnd, dwflags: CdsType, lparam: ConstPtr): DispChange =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiChangeDisplaySettingsExW(lpszdevicename.rawAddress.toString(), lpdevmode.rawAddress.toString(), hwnd.rawAddress.toString(), dwflags.toInt(), lparam.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeDisplaySettingsW(lpdevmode: ConstPtr, dwflags: CdsType): DispChange =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiChangeDisplaySettingsW(lpdevmode.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chord(hdc: Hdc, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiChord(hdc.rawAddress.toString(), x1, y1, x2, y2, x3, y3, x4, y4) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clientToScreen(hwnd: Hwnd, lppoint: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiClientToScreen(hwnd.rawAddress.toString(), lppoint.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeEnhMetaFile(hdc: Hdc): Henhmetafile =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCloseEnhMetaFile(hdc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeFigure(hdc: Hdc): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCloseFigure(hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeMetaFile(hdc: Hdc): Hmetafile =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCloseMetaFile(hdc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun combineRgn(hrgndst: Hrgn, hrgnsrc1: Hrgn, hrgnsrc2: Hrgn, imode: RgnCombineMode): GdiRegionType =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCombineRgn(hrgndst.rawAddress.toString(), hrgnsrc1.rawAddress.toString(), hrgnsrc2.rawAddress.toString(), imode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun combineTransform(lpxfout: MutPtr, lpxf1: ConstPtr, lpxf2: ConstPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCombineTransform(lpxfout.rawAddress.toString(), lpxf1.rawAddress.toString(), lpxf2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyEnhMetaFileA(henh: Henhmetafile, lpfilename: Pcstr): Henhmetafile =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCopyEnhMetaFileA(henh.rawAddress.toString(), lpfilename.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyEnhMetaFileW(henh: Henhmetafile, lpfilename: Pcwstr): Henhmetafile =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCopyEnhMetaFileW(henh.rawAddress.toString(), lpfilename.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyMetaFileA(param0: Hmetafile, param1: Pcstr): Hmetafile =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCopyMetaFileA(param0.rawAddress.toString(), param1.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyMetaFileW(param0: Hmetafile, param1: Pcwstr): Hmetafile =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCopyMetaFileW(param0.rawAddress.toString(), param1.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyRect(lprcdst: MutPtr, lprcsrc: ConstPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCopyRect(lprcdst.rawAddress.toString(), lprcsrc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createBitmap(nwidth: Int, nheight: Int, nplanes: UInt, nbitcount: UInt, lpbits: ConstPtr): Hbitmap =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateBitmap(nwidth, nheight, nplanes.toInt(), nbitcount.toInt(), lpbits.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createBitmapIndirect(pbm: ConstPtr): Hbitmap =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateBitmapIndirect(pbm.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createBrushIndirect(plbrush: ConstPtr): Hbrush =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateBrushIndirect(plbrush.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createCompatibleBitmap(hdc: Hdc, cx: Int, cy: Int): Hbitmap =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateCompatibleBitmap(hdc.rawAddress.toString(), cx, cy) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createCompatibleDC(hdc: Hdc): Hdc =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateCompatibleDC(hdc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDCA(pwszdriver: Pcstr, pwszdevice: Pcstr, pszport: Pcstr, pdm: ConstPtr): Hdc =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateDCA(pwszdriver.rawAddress.toString(), pwszdevice.rawAddress.toString(), pszport.rawAddress.toString(), pdm.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDCW(pwszdriver: Pcwstr, pwszdevice: Pcwstr, pszport: Pcwstr, pdm: ConstPtr): Hdc =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateDCW(pwszdriver.rawAddress.toString(), pwszdevice.rawAddress.toString(), pszport.rawAddress.toString(), pdm.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDIBPatternBrush(h: Hglobal, iusage: DibUsage): Hbrush =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateDIBPatternBrush(h.rawAddress.toString(), iusage.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDIBPatternBrushPt(lppackeddib: ConstPtr, iusage: DibUsage): Hbrush =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateDIBPatternBrushPt(lppackeddib.rawAddress.toString(), iusage.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDIBSection(hdc: Hdc, pbmi: ConstPtr, usage: DibUsage, ppvbits: MutPtr, hsection: Handle, offset: UInt): Hbitmap =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateDIBSection(hdc.rawAddress.toString(), pbmi.rawAddress.toString(), usage.toInt(), ppvbits.rawAddress.toString(), hsection.rawAddress.toString(), offset.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDIBitmap(hdc: Hdc, pbmih: ConstPtr, flinit: UInt, pjbits: ConstPtr, pbmi: ConstPtr, iusage: DibUsage): Hbitmap =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateDIBitmap(hdc.rawAddress.toString(), pbmih.rawAddress.toString(), flinit.toInt(), pjbits.rawAddress.toString(), pbmi.rawAddress.toString(), iusage.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDiscardableBitmap(hdc: Hdc, cx: Int, cy: Int): Hbitmap =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateDiscardableBitmap(hdc.rawAddress.toString(), cx, cy) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEllipticRgn(x1: Int, y1: Int, x2: Int, y2: Int): Hrgn =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateEllipticRgn(x1, y1, x2, y2) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEllipticRgnIndirect(lprect: ConstPtr): Hrgn =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateEllipticRgnIndirect(lprect.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEnhMetaFileA(hdc: Hdc, lpfilename: Pcstr, lprc: ConstPtr, lpdesc: Pcstr): Hdc =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateEnhMetaFileA(hdc.rawAddress.toString(), lpfilename.rawAddress.toString(), lprc.rawAddress.toString(), lpdesc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEnhMetaFileW(hdc: Hdc, lpfilename: Pcwstr, lprc: ConstPtr, lpdesc: Pcwstr): Hdc =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateEnhMetaFileW(hdc.rawAddress.toString(), lpfilename.rawAddress.toString(), lprc.rawAddress.toString(), lpdesc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFontA(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: UInt, bunderline: UInt, bstrikeout: UInt, icharset: UInt, ioutprecision: UInt, iclipprecision: UInt, iquality: UInt, ipitchandfamily: UInt, pszfacename: Pcstr): Hfont =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateFontA(cheight, cwidth, cescapement, corientation, cweight, bitalic.toInt(), bunderline.toInt(), bstrikeout.toInt(), icharset.toInt(), ioutprecision.toInt(), iclipprecision.toInt(), iquality.toInt(), ipitchandfamily.toInt(), pszfacename.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFontIndirectA(lplf: ConstPtr): Hfont =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateFontIndirectA(lplf.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFontIndirectExA(param0: ConstPtr): Hfont =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateFontIndirectExA(param0.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFontIndirectExW(param0: ConstPtr): Hfont =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateFontIndirectExW(param0.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFontIndirectW(lplf: ConstPtr): Hfont =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateFontIndirectW(lplf.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFontPackage(puchsrcbuffer: ConstPtr, ulsrcbuffersize: UInt, ppuchfontpackagebuffer: MutPtr, pulfontpackagebuffersize: MutPtr, pulbyteswritten: MutPtr, usflag: UShort, usttcindex: UShort, ussubsetformat: UShort, ussubsetlanguage: UShort, ussubsetplatform: CreateFontPackageSubsetPlatform, ussubsetencoding: CreateFontPackageSubsetEncoding, pussubsetkeeplist: ConstPtr, ussubsetlistcount: UShort, lpfnallocate: CfpAllocproc, lpfnreallocate: CfpReallocproc, lpfnfree: CfpFreeproc, lpvreserved: MutPtr): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateFontPackage(puchsrcbuffer.rawAddress.toString(), ulsrcbuffersize.toInt(), ppuchfontpackagebuffer.rawAddress.toString(), pulfontpackagebuffersize.rawAddress.toString(), pulbyteswritten.rawAddress.toString(), usflag.toInt(), usttcindex.toInt(), ussubsetformat.toInt(), ussubsetlanguage.toInt(), ussubsetplatform.toInt(), ussubsetencoding.toInt(), pussubsetkeeplist.rawAddress.toString(), ussubsetlistcount.toInt(), 0L.toString(), 0L.toString(), 0L.toString(), lpvreserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFontW(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: UInt, bunderline: UInt, bstrikeout: UInt, icharset: UInt, ioutprecision: UInt, iclipprecision: UInt, iquality: UInt, ipitchandfamily: UInt, pszfacename: Pcwstr): Hfont =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateFontW(cheight, cwidth, cescapement, corientation, cweight, bitalic.toInt(), bunderline.toInt(), bstrikeout.toInt(), icharset.toInt(), ioutprecision.toInt(), iclipprecision.toInt(), iquality.toInt(), ipitchandfamily.toInt(), pszfacename.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createHalftonePalette(hdc: Hdc): Hpalette =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateHalftonePalette(hdc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createHatchBrush(ihatch: HatchBrushStyle, color: Colorref): Hbrush =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateHatchBrush(ihatch, color.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createICA(pszdriver: Pcstr, pszdevice: Pcstr, pszport: Pcstr, pdm: ConstPtr): Hdc =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateICA(pszdriver.rawAddress.toString(), pszdevice.rawAddress.toString(), pszport.rawAddress.toString(), pdm.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createICW(pszdriver: Pcwstr, pszdevice: Pcwstr, pszport: Pcwstr, pdm: ConstPtr): Hdc =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateICW(pszdriver.rawAddress.toString(), pszdevice.rawAddress.toString(), pszport.rawAddress.toString(), pdm.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMetaFileA(pszfile: Pcstr): Hdc =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateMetaFileA(pszfile.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMetaFileW(pszfile: Pcwstr): Hdc =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateMetaFileW(pszfile.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPalette(plpal: ConstPtr): Hpalette =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreatePalette(plpal.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPatternBrush(hbm: Hbitmap): Hbrush =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreatePatternBrush(hbm.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPen(istyle: PenStyle, cwidth: Int, color: Colorref): Hpen =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreatePen(istyle, cwidth, color.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPenIndirect(plpen: ConstPtr): Hpen =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreatePenIndirect(plpen.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPolyPolygonRgn(pptl: ConstPtr, pc: ConstPtr, cpoly: Int, imode: CreatePolygonRgnMode): Hrgn =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreatePolyPolygonRgn(pptl.rawAddress.toString(), pc.rawAddress.toString(), cpoly, imode) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPolygonRgn(pptl: ConstPtr, cpoint: Int, imode: CreatePolygonRgnMode): Hrgn =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreatePolygonRgn(pptl.rawAddress.toString(), cpoint, imode) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createRectRgn(x1: Int, y1: Int, x2: Int, y2: Int): Hrgn =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateRectRgn(x1, y1, x2, y2) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createRectRgnIndirect(lprect: ConstPtr): Hrgn =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateRectRgnIndirect(lprect.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createRoundRectRgn(x1: Int, y1: Int, x2: Int, y2: Int, w: Int, h: Int): Hrgn =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateRoundRectRgn(x1, y1, x2, y2, w, h) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createScalableFontResourceA(fdwhidden: UInt, lpszfont: Pcstr, lpszfile: Pcstr, lpszpath: Pcstr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateScalableFontResourceA(fdwhidden.toInt(), lpszfont.rawAddress.toString(), lpszfile.rawAddress.toString(), lpszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createScalableFontResourceW(fdwhidden: UInt, lpszfont: Pcwstr, lpszfile: Pcwstr, lpszpath: Pcwstr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateScalableFontResourceW(fdwhidden.toInt(), lpszfont.rawAddress.toString(), lpszfile.rawAddress.toString(), lpszpath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSolidBrush(color: Colorref): Hbrush =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiCreateSolidBrush(color.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dPtoLP(hdc: Hdc, lppt: MutPtr, c: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiDPtoLP(hdc.rawAddress.toString(), lppt.rawAddress.toString(), c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteDC(hdc: Hdc): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiDeleteDC(hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteEnhMetaFile(hmf: Henhmetafile): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiDeleteEnhMetaFile(hmf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteMetaFile(hmf: Hmetafile): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiDeleteMetaFile(hmf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteObject(ho: Hgdiobj): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiDeleteObject(ho.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawAnimatedRects(hwnd: Hwnd, idani: Int, lprcfrom: ConstPtr, lprcto: ConstPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiDrawAnimatedRects(hwnd.rawAddress.toString(), idani, lprcfrom.rawAddress.toString(), lprcto.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawCaption(hwnd: Hwnd, hdc: Hdc, lprect: ConstPtr, flags: DrawCaptionFlags): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiDrawCaption(hwnd.rawAddress.toString(), hdc.rawAddress.toString(), lprect.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawEdge(hdc: Hdc, qrc: MutPtr, edge: DrawedgeFlags, grfflags: DrawEdgeFlags): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiDrawEdge(hdc.rawAddress.toString(), qrc.rawAddress.toString(), edge.toInt(), grfflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawEscape(hdc: Hdc, iescape: Int, cjin: Int, lpin: Pcstr): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiDrawEscape(hdc.rawAddress.toString(), iescape, cjin, lpin.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawFocusRect(hdc: Hdc, lprc: ConstPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiDrawFocusRect(hdc.rawAddress.toString(), lprc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawFrameControl(param0: Hdc, param1: MutPtr, param2: DfcType, param3: DfcsState): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiDrawFrameControl(param0.rawAddress.toString(), param1.rawAddress.toString(), param2.toInt(), param3.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawStateA(hdc: Hdc, hbrfore: Hbrush, qfncallback: Drawstateproc, ldata: Lparam, wdata: Wparam, x: Int, y: Int, cx: Int, cy: Int, uflags: DrawstateFlags): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiDrawStateA(hdc.rawAddress.toString(), hbrfore.rawAddress.toString(), 0L.toString(), ldata.toString(), wdata.toString(), x, y, cx, cy, uflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawStateW(hdc: Hdc, hbrfore: Hbrush, qfncallback: Drawstateproc, ldata: Lparam, wdata: Wparam, x: Int, y: Int, cx: Int, cy: Int, uflags: DrawstateFlags): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiDrawStateW(hdc.rawAddress.toString(), hbrfore.rawAddress.toString(), 0L.toString(), ldata.toString(), wdata.toString(), x, y, cx, cy, uflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawTextA(hdc: Hdc, lpchtext: Pcstr, cchtext: Int, lprc: MutPtr, format: DrawTextFormat): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiDrawTextA(hdc.rawAddress.toString(), lpchtext.rawAddress.toString(), cchtext, lprc.rawAddress.toString(), format.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawTextExA(hdc: Hdc, lpchtext: Pstr, cchtext: Int, lprc: MutPtr, format: DrawTextFormat, lpdtp: ConstPtr): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiDrawTextExA(hdc.rawAddress.toString(), lpchtext.rawAddress.toString(), cchtext, lprc.rawAddress.toString(), format.toInt(), lpdtp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawTextExW(hdc: Hdc, lpchtext: Pwstr, cchtext: Int, lprc: MutPtr, format: DrawTextFormat, lpdtp: ConstPtr): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiDrawTextExW(hdc.rawAddress.toString(), lpchtext.rawAddress.toString(), cchtext, lprc.rawAddress.toString(), format.toInt(), lpdtp.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawTextW(hdc: Hdc, lpchtext: Pcwstr, cchtext: Int, lprc: MutPtr, format: DrawTextFormat): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiDrawTextW(hdc.rawAddress.toString(), lpchtext.rawAddress.toString(), cchtext, lprc.rawAddress.toString(), format.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ellipse(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiEllipse(hdc.rawAddress.toString(), left, top, right, bottom) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endPaint(hwnd: Hwnd, lppaint: ConstPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiEndPaint(hwnd.rawAddress.toString(), lppaint.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endPath(hdc: Hdc): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiEndPath(hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDisplayDevicesA(lpdevice: Pcstr, idevnum: UInt, lpdisplaydevice: MutPtr, dwflags: UInt): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiEnumDisplayDevicesA(lpdevice.rawAddress.toString(), idevnum.toInt(), lpdisplaydevice.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDisplayDevicesW(lpdevice: Pcwstr, idevnum: UInt, lpdisplaydevice: MutPtr, dwflags: UInt): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiEnumDisplayDevicesW(lpdevice.rawAddress.toString(), idevnum.toInt(), lpdisplaydevice.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDisplayMonitors(hdc: Hdc, lprcclip: ConstPtr, lpfnenum: Monitorenumproc, dwdata: Lparam): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiEnumDisplayMonitors(hdc.rawAddress.toString(), lprcclip.rawAddress.toString(), 0L.toString(), dwdata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDisplaySettingsA(lpszdevicename: Pcstr, imodenum: EnumDisplaySettingsMode, lpdevmode: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiEnumDisplaySettingsA(lpszdevicename.rawAddress.toString(), imodenum.toInt(), lpdevmode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDisplaySettingsExA(lpszdevicename: Pcstr, imodenum: EnumDisplaySettingsMode, lpdevmode: MutPtr, dwflags: EnumDisplaySettingsFlags): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiEnumDisplaySettingsExA(lpszdevicename.rawAddress.toString(), imodenum.toInt(), lpdevmode.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDisplaySettingsExW(lpszdevicename: Pcwstr, imodenum: EnumDisplaySettingsMode, lpdevmode: MutPtr, dwflags: EnumDisplaySettingsFlags): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiEnumDisplaySettingsExW(lpszdevicename.rawAddress.toString(), imodenum.toInt(), lpdevmode.rawAddress.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDisplaySettingsW(lpszdevicename: Pcwstr, imodenum: EnumDisplaySettingsMode, lpdevmode: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiEnumDisplaySettingsW(lpszdevicename.rawAddress.toString(), imodenum.toInt(), lpdevmode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumEnhMetaFile(hdc: Hdc, hmf: Henhmetafile, proc: Enhmfenumproc, param3: ConstPtr, lprect: ConstPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiEnumEnhMetaFile(hdc.rawAddress.toString(), hmf.rawAddress.toString(), 0L.toString(), param3.rawAddress.toString(), lprect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumFontFamiliesA(hdc: Hdc, lplogfont: Pcstr, lpproc: Fontenumproca, lparam: Lparam): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiEnumFontFamiliesA(hdc.rawAddress.toString(), lplogfont.rawAddress.toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumFontFamiliesExA(hdc: Hdc, lplogfont: ConstPtr, lpproc: Fontenumproca, lparam: Lparam, dwflags: UInt): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiEnumFontFamiliesExA(hdc.rawAddress.toString(), lplogfont.rawAddress.toString(), 0L.toString(), lparam.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumFontFamiliesExW(hdc: Hdc, lplogfont: ConstPtr, lpproc: Fontenumprocw, lparam: Lparam, dwflags: UInt): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiEnumFontFamiliesExW(hdc.rawAddress.toString(), lplogfont.rawAddress.toString(), 0L.toString(), lparam.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumFontFamiliesW(hdc: Hdc, lplogfont: Pcwstr, lpproc: Fontenumprocw, lparam: Lparam): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiEnumFontFamiliesW(hdc.rawAddress.toString(), lplogfont.rawAddress.toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumFontsA(hdc: Hdc, lplogfont: Pcstr, lpproc: Fontenumproca, lparam: Lparam): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiEnumFontsA(hdc.rawAddress.toString(), lplogfont.rawAddress.toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumFontsW(hdc: Hdc, lplogfont: Pcwstr, lpproc: Fontenumprocw, lparam: Lparam): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiEnumFontsW(hdc.rawAddress.toString(), lplogfont.rawAddress.toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumMetaFile(hdc: Hdc, hmf: Hmetafile, proc: Mfenumproc, param3: Lparam): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiEnumMetaFile(hdc.rawAddress.toString(), hmf.rawAddress.toString(), 0L.toString(), param3.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumObjects(hdc: Hdc, ntype: ObjType, lpfunc: Gobjenumproc, lparam: Lparam): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiEnumObjects(hdc.rawAddress.toString(), ntype, 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun equalRect(lprc1: ConstPtr, lprc2: ConstPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiEqualRect(lprc1.rawAddress.toString(), lprc2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun equalRgn(hrgn1: Hrgn, hrgn2: Hrgn): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiEqualRgn(hrgn1.rawAddress.toString(), hrgn2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun excludeClipRect(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): GdiRegionType =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiExcludeClipRect(hdc.rawAddress.toString(), left, top, right, bottom) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun excludeUpdateRgn(hdc: Hdc, hwnd: Hwnd): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiExcludeUpdateRgn(hdc.rawAddress.toString(), hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extCreatePen(ipenstyle: UInt, cwidth: UInt, plbrush: ConstPtr, cstyle: UInt, pstyle: ConstPtr): Hpen =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiExtCreatePen(ipenstyle.toInt(), cwidth.toInt(), plbrush.rawAddress.toString(), cstyle.toInt(), pstyle.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extCreateRegion(lpx: ConstPtr, ncount: UInt, lpdata: ConstPtr): Hrgn =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiExtCreateRegion(lpx.rawAddress.toString(), ncount.toInt(), lpdata.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extFloodFill(hdc: Hdc, x: Int, y: Int, color: Colorref, type: ExtFloodFillType): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiExtFloodFill(hdc.rawAddress.toString(), x, y, color.toInt(), type.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extSelectClipRgn(hdc: Hdc, hrgn: Hrgn, mode: RgnCombineMode): GdiRegionType =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiExtSelectClipRgn(hdc.rawAddress.toString(), hrgn.rawAddress.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extTextOutA(hdc: Hdc, x: Int, y: Int, options: EtoOptions, lprect: ConstPtr, lpstring: Pcstr, c: UInt, lpdx: ConstPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiExtTextOutA(hdc.rawAddress.toString(), x, y, options.toInt(), lprect.rawAddress.toString(), lpstring.rawAddress.toString(), c.toInt(), lpdx.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extTextOutW(hdc: Hdc, x: Int, y: Int, options: EtoOptions, lprect: ConstPtr, lpstring: Pcwstr, c: UInt, lpdx: ConstPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiExtTextOutW(hdc.rawAddress.toString(), x, y, options.toInt(), lprect.rawAddress.toString(), lpstring.rawAddress.toString(), c.toInt(), lpdx.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fillPath(hdc: Hdc): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiFillPath(hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fillRect(hdc: Hdc, lprc: ConstPtr, hbr: Hbrush): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiFillRect(hdc.rawAddress.toString(), lprc.rawAddress.toString(), hbr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fillRgn(hdc: Hdc, hrgn: Hrgn, hbr: Hbrush): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiFillRgn(hdc.rawAddress.toString(), hrgn.rawAddress.toString(), hbr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fixBrushOrgEx(hdc: Hdc, x: Int, y: Int, ptl: ConstPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiFixBrushOrgEx(hdc.rawAddress.toString(), x, y, ptl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flattenPath(hdc: Hdc): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiFlattenPath(hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun floodFill(hdc: Hdc, x: Int, y: Int, color: Colorref): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiFloodFill(hdc.rawAddress.toString(), x, y, color.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun frameRect(hdc: Hdc, lprc: ConstPtr, hbr: Hbrush): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiFrameRect(hdc.rawAddress.toString(), lprc.rawAddress.toString(), hbr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun frameRgn(hdc: Hdc, hrgn: Hrgn, hbr: Hbrush, w: Int, h: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiFrameRgn(hdc.rawAddress.toString(), hrgn.rawAddress.toString(), hbr.rawAddress.toString(), w, h) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiAlphaBlend(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, ftn: Blendfunction): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiComment(hdc: Hdc, nsize: UInt, lpdata: ConstPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGdiComment(hdc.rawAddress.toString(), nsize.toInt(), lpdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiFlush(): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGdiFlush() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiGetBatchLimit(): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGdiGetBatchLimit() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiGradientFill(hdc: Hdc, pvertex: ConstPtr, nvertex: UInt, pmesh: ConstPtr, ncount: UInt, ulmode: GradientFill): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGdiGradientFill(hdc.rawAddress.toString(), pvertex.rawAddress.toString(), nvertex.toInt(), pmesh.rawAddress.toString(), ncount.toInt(), ulmode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiSetBatchLimit(dw: UInt): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGdiSetBatchLimit(dw.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiTransparentBlt(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: UInt): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGdiTransparentBlt(hdcdest.rawAddress.toString(), xorigindest, yorigindest, wdest, hdest, hdcsrc.rawAddress.toString(), xoriginsrc, yoriginsrc, wsrc, hsrc, crtransparent.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getArcDirection(hdc: Hdc): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetArcDirection(hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAspectRatioFilterEx(hdc: Hdc, lpsize: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetAspectRatioFilterEx(hdc.rawAddress.toString(), lpsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBitmapBits(hbit: Hbitmap, cb: Int, lpvbits: MutPtr): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetBitmapBits(hbit.rawAddress.toString(), cb, lpvbits.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBitmapDimensionEx(hbit: Hbitmap, lpsize: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetBitmapDimensionEx(hbit.rawAddress.toString(), lpsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBkColor(hdc: Hdc): Colorref =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetBkColor(hdc.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBkMode(hdc: Hdc): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetBkMode(hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBoundsRect(hdc: Hdc, lprect: MutPtr, flags: UInt): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetBoundsRect(hdc.rawAddress.toString(), lprect.rawAddress.toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBrushOrgEx(hdc: Hdc, lppt: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetBrushOrgEx(hdc.rawAddress.toString(), lppt.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharABCWidthsA(hdc: Hdc, wfirst: UInt, wlast: UInt, lpabc: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetCharABCWidthsA(hdc.rawAddress.toString(), wfirst.toInt(), wlast.toInt(), lpabc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharABCWidthsFloatA(hdc: Hdc, ifirst: UInt, ilast: UInt, lpabc: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetCharABCWidthsFloatA(hdc.rawAddress.toString(), ifirst.toInt(), ilast.toInt(), lpabc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharABCWidthsFloatW(hdc: Hdc, ifirst: UInt, ilast: UInt, lpabc: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetCharABCWidthsFloatW(hdc.rawAddress.toString(), ifirst.toInt(), ilast.toInt(), lpabc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharABCWidthsI(hdc: Hdc, gifirst: UInt, cgi: UInt, pgi: ConstPtr, pabc: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetCharABCWidthsI(hdc.rawAddress.toString(), gifirst.toInt(), cgi.toInt(), pgi.rawAddress.toString(), pabc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharABCWidthsW(hdc: Hdc, wfirst: UInt, wlast: UInt, lpabc: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetCharABCWidthsW(hdc.rawAddress.toString(), wfirst.toInt(), wlast.toInt(), lpabc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharWidth32A(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetCharWidth32A(hdc.rawAddress.toString(), ifirst.toInt(), ilast.toInt(), lpbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharWidth32W(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetCharWidth32W(hdc.rawAddress.toString(), ifirst.toInt(), ilast.toInt(), lpbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharWidthA(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetCharWidthA(hdc.rawAddress.toString(), ifirst.toInt(), ilast.toInt(), lpbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharWidthFloatA(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetCharWidthFloatA(hdc.rawAddress.toString(), ifirst.toInt(), ilast.toInt(), lpbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharWidthFloatW(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetCharWidthFloatW(hdc.rawAddress.toString(), ifirst.toInt(), ilast.toInt(), lpbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharWidthI(hdc: Hdc, gifirst: UInt, cgi: UInt, pgi: ConstPtr, piwidths: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetCharWidthI(hdc.rawAddress.toString(), gifirst.toInt(), cgi.toInt(), pgi.rawAddress.toString(), piwidths.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharWidthW(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetCharWidthW(hdc.rawAddress.toString(), ifirst.toInt(), ilast.toInt(), lpbuffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharacterPlacementA(hdc: Hdc, lpstring: Pcstr, ncount: Int, nmexextent: Int, lpresults: MutPtr, dwflags: GetCharacterPlacementFlags): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetCharacterPlacementA(hdc.rawAddress.toString(), lpstring.rawAddress.toString(), ncount, nmexextent, lpresults.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharacterPlacementW(hdc: Hdc, lpstring: Pcwstr, ncount: Int, nmexextent: Int, lpresults: MutPtr, dwflags: GetCharacterPlacementFlags): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetCharacterPlacementW(hdc.rawAddress.toString(), lpstring.rawAddress.toString(), ncount, nmexextent, lpresults.rawAddress.toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClipBox(hdc: Hdc, lprect: MutPtr): GdiRegionType =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetClipBox(hdc.rawAddress.toString(), lprect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClipRgn(hdc: Hdc, hrgn: Hrgn): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetClipRgn(hdc.rawAddress.toString(), hrgn.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getColorAdjustment(hdc: Hdc, lpca: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetColorAdjustment(hdc.rawAddress.toString(), lpca.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentObject(hdc: Hdc, type: UInt): Hgdiobj =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetCurrentObject(hdc.rawAddress.toString(), type.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPositionEx(hdc: Hdc, lppt: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetCurrentPositionEx(hdc.rawAddress.toString(), lppt.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDC(hwnd: Hwnd): Hdc =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetDC(hwnd.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDCBrushColor(hdc: Hdc): Colorref =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetDCBrushColor(hdc.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDCEx(hwnd: Hwnd, hrgnclip: Hrgn, flags: GetDcxFlags): Hdc =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetDCEx(hwnd.rawAddress.toString(), hrgnclip.rawAddress.toString(), flags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDCOrgEx(hdc: Hdc, lppt: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetDCOrgEx(hdc.rawAddress.toString(), lppt.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDCPenColor(hdc: Hdc): Colorref =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetDCPenColor(hdc.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDIBColorTable(hdc: Hdc, istart: UInt, centries: UInt, prgbq: MutPtr): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetDIBColorTable(hdc.rawAddress.toString(), istart.toInt(), centries.toInt(), prgbq.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDIBits(hdc: Hdc, hbm: Hbitmap, start: UInt, clines: UInt, lpvbits: MutPtr, lpbmi: MutPtr, usage: DibUsage): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetDIBits(hdc.rawAddress.toString(), hbm.rawAddress.toString(), start.toInt(), clines.toInt(), lpvbits.rawAddress.toString(), lpbmi.rawAddress.toString(), usage.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeviceCaps(hdc: Hdc, index: Int): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetDeviceCaps(hdc.rawAddress.toString(), index) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnhMetaFileA(lpname: Pcstr): Henhmetafile =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetEnhMetaFileA(lpname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnhMetaFileBits(hemf: Henhmetafile, nsize: UInt, lpdata: MutPtr): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetEnhMetaFileBits(hemf.rawAddress.toString(), nsize.toInt(), lpdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnhMetaFileDescriptionA(hemf: Henhmetafile, cchbuffer: UInt, lpdescription: Pstr): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetEnhMetaFileDescriptionA(hemf.rawAddress.toString(), cchbuffer.toInt(), lpdescription.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnhMetaFileDescriptionW(hemf: Henhmetafile, cchbuffer: UInt, lpdescription: Pwstr): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetEnhMetaFileDescriptionW(hemf.rawAddress.toString(), cchbuffer.toInt(), lpdescription.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnhMetaFileHeader(hemf: Henhmetafile, nsize: UInt, lpenhmetaheader: MutPtr): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetEnhMetaFileHeader(hemf.rawAddress.toString(), nsize.toInt(), lpenhmetaheader.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnhMetaFilePaletteEntries(hemf: Henhmetafile, nnumentries: UInt, lppaletteentries: MutPtr): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetEnhMetaFilePaletteEntries(hemf.rawAddress.toString(), nnumentries.toInt(), lppaletteentries.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnhMetaFileW(lpname: Pcwstr): Henhmetafile =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetEnhMetaFileW(lpname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFontData(hdc: Hdc, dwtable: UInt, dwoffset: UInt, pvbuffer: MutPtr, cjbuffer: UInt): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetFontData(hdc.rawAddress.toString(), dwtable.toInt(), dwoffset.toInt(), pvbuffer.rawAddress.toString(), cjbuffer.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFontLanguageInfo(hdc: Hdc): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetFontLanguageInfo(hdc.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFontUnicodeRanges(hdc: Hdc, lpgs: MutPtr): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetFontUnicodeRanges(hdc.rawAddress.toString(), lpgs.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGlyphIndicesA(hdc: Hdc, lpstr: Pcstr, c: Int, pgi: MutPtr, fl: UInt): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetGlyphIndicesA(hdc.rawAddress.toString(), lpstr.rawAddress.toString(), c, pgi.rawAddress.toString(), fl.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGlyphIndicesW(hdc: Hdc, lpstr: Pcwstr, c: Int, pgi: MutPtr, fl: UInt): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetGlyphIndicesW(hdc.rawAddress.toString(), lpstr.rawAddress.toString(), c, pgi.rawAddress.toString(), fl.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGlyphOutlineA(hdc: Hdc, uchar: UInt, fuformat: GetGlyphOutlineFormat, lpgm: MutPtr, cjbuffer: UInt, pvbuffer: MutPtr, lpmat2: ConstPtr): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetGlyphOutlineA(hdc.rawAddress.toString(), uchar.toInt(), fuformat.toInt(), lpgm.rawAddress.toString(), cjbuffer.toInt(), pvbuffer.rawAddress.toString(), lpmat2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGlyphOutlineW(hdc: Hdc, uchar: UInt, fuformat: GetGlyphOutlineFormat, lpgm: MutPtr, cjbuffer: UInt, pvbuffer: MutPtr, lpmat2: ConstPtr): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetGlyphOutlineW(hdc.rawAddress.toString(), uchar.toInt(), fuformat.toInt(), lpgm.rawAddress.toString(), cjbuffer.toInt(), pvbuffer.rawAddress.toString(), lpmat2.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGraphicsMode(hdc: Hdc): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetGraphicsMode(hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKerningPairsA(hdc: Hdc, npairs: UInt, lpkernpair: MutPtr): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetKerningPairsA(hdc.rawAddress.toString(), npairs.toInt(), lpkernpair.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKerningPairsW(hdc: Hdc, npairs: UInt, lpkernpair: MutPtr): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetKerningPairsW(hdc.rawAddress.toString(), npairs.toInt(), lpkernpair.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLayout(hdc: Hdc): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetLayout(hdc.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMapMode(hdc: Hdc): HdcMapMode =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetMapMode(hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMetaFileA(lpname: Pcstr): Hmetafile =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetMetaFileA(lpname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMetaFileBitsEx(hmf: Hmetafile, cbbuffer: UInt, lpdata: MutPtr): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetMetaFileBitsEx(hmf.rawAddress.toString(), cbbuffer.toInt(), lpdata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMetaFileW(lpname: Pcwstr): Hmetafile =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetMetaFileW(lpname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMetaRgn(hdc: Hdc, hrgn: Hrgn): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetMetaRgn(hdc.rawAddress.toString(), hrgn.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMiterLimit(hdc: Hdc, plimit: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetMiterLimit(hdc.rawAddress.toString(), plimit.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMonitorInfoA(hmonitor: Hmonitor, lpmi: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetMonitorInfoA(hmonitor.rawAddress.toString(), lpmi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMonitorInfoW(hmonitor: Hmonitor, lpmi: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetMonitorInfoW(hmonitor.rawAddress.toString(), lpmi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNearestColor(hdc: Hdc, color: Colorref): Colorref =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetNearestColor(hdc.rawAddress.toString(), color.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNearestPaletteIndex(h: Hpalette, color: Colorref): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetNearestPaletteIndex(h.rawAddress.toString(), color.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getObjectA(h: Hgdiobj, c: Int, pv: MutPtr): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetObjectA(h.rawAddress.toString(), c, pv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getObjectType(h: Hgdiobj): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetObjectType(h.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getObjectW(h: Hgdiobj, c: Int, pv: MutPtr): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetObjectW(h.rawAddress.toString(), c, pv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOutlineTextMetricsA(hdc: Hdc, cjcopy: UInt, potm: MutPtr): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetOutlineTextMetricsA(hdc.rawAddress.toString(), cjcopy.toInt(), potm.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOutlineTextMetricsW(hdc: Hdc, cjcopy: UInt, potm: MutPtr): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetOutlineTextMetricsW(hdc.rawAddress.toString(), cjcopy.toInt(), potm.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPaletteEntries(hpal: Hpalette, istart: UInt, centries: UInt, ppalentries: MutPtr): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetPaletteEntries(hpal.rawAddress.toString(), istart.toInt(), centries.toInt(), ppalentries.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPath(hdc: Hdc, apt: MutPtr, aj: MutPtr, cpt: Int): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetPath(hdc.rawAddress.toString(), apt.rawAddress.toString(), aj.rawAddress.toString(), cpt) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPixel(hdc: Hdc, x: Int, y: Int): Colorref =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetPixel(hdc.rawAddress.toString(), x, y) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPolyFillMode(hdc: Hdc): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetPolyFillMode(hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getROP2(hdc: Hdc): R2Mode =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetROP2(hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRandomRgn(hdc: Hdc, hrgn: Hrgn, i: Int): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetRandomRgn(hdc.rawAddress.toString(), hrgn.rawAddress.toString(), i) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRasterizerCaps(lpraststat: MutPtr, cjbytes: UInt): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetRasterizerCaps(lpraststat.rawAddress.toString(), cjbytes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRegionData(hrgn: Hrgn, ncount: UInt, lprgndata: MutPtr): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetRegionData(hrgn.rawAddress.toString(), ncount.toInt(), lprgndata.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRgnBox(hrgn: Hrgn, lprc: MutPtr): GdiRegionType =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetRgnBox(hrgn.rawAddress.toString(), lprc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStockObject(i: GetStockObjectFlags): Hgdiobj =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetStockObject(i) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStretchBltMode(hdc: Hdc): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetStretchBltMode(hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSysColor(nindex: SysColorIndex): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetSysColor(nindex) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSysColorBrush(nindex: SysColorIndex): Hbrush =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetSysColorBrush(nindex) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemPaletteEntries(hdc: Hdc, istart: UInt, centries: UInt, ppalentries: MutPtr): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetSystemPaletteEntries(hdc.rawAddress.toString(), istart.toInt(), centries.toInt(), ppalentries.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemPaletteUse(hdc: Hdc): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetSystemPaletteUse(hdc.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTabbedTextExtentA(hdc: Hdc, lpstring: Pcstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: ConstPtr): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetTabbedTextExtentA(hdc.rawAddress.toString(), lpstring.rawAddress.toString(), chcount, ntabpositions, lpntabstoppositions.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTabbedTextExtentW(hdc: Hdc, lpstring: Pcwstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: ConstPtr): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetTabbedTextExtentW(hdc.rawAddress.toString(), lpstring.rawAddress.toString(), chcount, ntabpositions, lpntabstoppositions.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextAlign(hdc: Hdc): TextAlignOptions =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetTextAlign(hdc.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextCharacterExtra(hdc: Hdc): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetTextCharacterExtra(hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextColor(hdc: Hdc): Colorref =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetTextColor(hdc.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextExtentExPointA(hdc: Hdc, lpszstring: Pcstr, cchstring: Int, nmaxextent: Int, lpnfit: MutPtr, lpndx: MutPtr, lpsize: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetTextExtentExPointA(hdc.rawAddress.toString(), lpszstring.rawAddress.toString(), cchstring, nmaxextent, lpnfit.rawAddress.toString(), lpndx.rawAddress.toString(), lpsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextExtentExPointI(hdc: Hdc, lpwszstring: ConstPtr, cwchstring: Int, nmaxextent: Int, lpnfit: MutPtr, lpndx: MutPtr, lpsize: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetTextExtentExPointI(hdc.rawAddress.toString(), lpwszstring.rawAddress.toString(), cwchstring, nmaxextent, lpnfit.rawAddress.toString(), lpndx.rawAddress.toString(), lpsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextExtentExPointW(hdc: Hdc, lpszstring: Pcwstr, cchstring: Int, nmaxextent: Int, lpnfit: MutPtr, lpndx: MutPtr, lpsize: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetTextExtentExPointW(hdc.rawAddress.toString(), lpszstring.rawAddress.toString(), cchstring, nmaxextent, lpnfit.rawAddress.toString(), lpndx.rawAddress.toString(), lpsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextExtentPoint32A(hdc: Hdc, lpstring: Pcstr, c: Int, psizl: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetTextExtentPoint32A(hdc.rawAddress.toString(), lpstring.rawAddress.toString(), c, psizl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextExtentPoint32W(hdc: Hdc, lpstring: Pcwstr, c: Int, psizl: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetTextExtentPoint32W(hdc.rawAddress.toString(), lpstring.rawAddress.toString(), c, psizl.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextExtentPointA(hdc: Hdc, lpstring: Pcstr, c: Int, lpsz: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetTextExtentPointA(hdc.rawAddress.toString(), lpstring.rawAddress.toString(), c, lpsz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextExtentPointI(hdc: Hdc, pgiin: ConstPtr, cgi: Int, psize: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetTextExtentPointI(hdc.rawAddress.toString(), pgiin.rawAddress.toString(), cgi, psize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextExtentPointW(hdc: Hdc, lpstring: Pcwstr, c: Int, lpsz: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetTextExtentPointW(hdc.rawAddress.toString(), lpstring.rawAddress.toString(), c, lpsz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextFaceA(hdc: Hdc, c: Int, lpname: Pstr): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetTextFaceA(hdc.rawAddress.toString(), c, lpname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextFaceW(hdc: Hdc, c: Int, lpname: Pwstr): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetTextFaceW(hdc.rawAddress.toString(), c, lpname.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextMetricsA(hdc: Hdc, lptm: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetTextMetricsA(hdc.rawAddress.toString(), lptm.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextMetricsW(hdc: Hdc, lptm: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetTextMetricsW(hdc.rawAddress.toString(), lptm.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUpdateRect(hwnd: Hwnd, lprect: MutPtr, berase: Bool): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetUpdateRect(hwnd.rawAddress.toString(), lprect.rawAddress.toString(), berase) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUpdateRgn(hwnd: Hwnd, hrgn: Hrgn, berase: Bool): GdiRegionType =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetUpdateRgn(hwnd.rawAddress.toString(), hrgn.rawAddress.toString(), berase) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getViewportExtEx(hdc: Hdc, lpsize: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetViewportExtEx(hdc.rawAddress.toString(), lpsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getViewportOrgEx(hdc: Hdc, lppoint: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetViewportOrgEx(hdc.rawAddress.toString(), lppoint.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWinMetaFileBits(hemf: Henhmetafile, cbdata16: UInt, pdata16: MutPtr, imapmode: Int, hdcref: Hdc): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetWinMetaFileBits(hemf.rawAddress.toString(), cbdata16.toInt(), pdata16.rawAddress.toString(), imapmode, hdcref.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowDC(hwnd: Hwnd): Hdc =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetWindowDC(hwnd.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowExtEx(hdc: Hdc, lpsize: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetWindowExtEx(hdc.rawAddress.toString(), lpsize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowOrgEx(hdc: Hdc, lppoint: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetWindowOrgEx(hdc.rawAddress.toString(), lppoint.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowRgn(hwnd: Hwnd, hrgn: Hrgn): GdiRegionType =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetWindowRgn(hwnd.rawAddress.toString(), hrgn.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowRgnBox(hwnd: Hwnd, lprc: MutPtr): GdiRegionType =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetWindowRgnBox(hwnd.rawAddress.toString(), lprc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWorldTransform(hdc: Hdc, lpxf: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGetWorldTransform(hdc.rawAddress.toString(), lpxf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gradientFill(hdc: Hdc, pvertex: ConstPtr, nvertex: UInt, pmesh: ConstPtr, nmesh: UInt, ulmode: GradientFill): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGradientFill(hdc.rawAddress.toString(), pvertex.rawAddress.toString(), nvertex.toInt(), pmesh.rawAddress.toString(), nmesh.toInt(), ulmode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun grayStringA(hdc: Hdc, hbrush: Hbrush, lpoutputfunc: Graystringproc, lpdata: Lparam, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGrayStringA(hdc.rawAddress.toString(), hbrush.rawAddress.toString(), 0L.toString(), lpdata.toString(), ncount, x, y, nwidth, nheight) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun grayStringW(hdc: Hdc, hbrush: Hbrush, lpoutputfunc: Graystringproc, lpdata: Lparam, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiGrayStringW(hdc.rawAddress.toString(), hbrush.rawAddress.toString(), 0L.toString(), lpdata.toString(), ncount, x, y, nwidth, nheight) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inflateRect(lprc: MutPtr, dx: Int, dy: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiInflateRect(lprc.rawAddress.toString(), dx, dy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun intersectClipRect(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): GdiRegionType =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiIntersectClipRect(hdc.rawAddress.toString(), left, top, right, bottom) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun intersectRect(lprcdst: MutPtr, lprcsrc1: ConstPtr, lprcsrc2: ConstPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiIntersectRect(lprcdst.rawAddress.toString(), lprcsrc1.rawAddress.toString(), lprcsrc2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun invalidateRect(hwnd: Hwnd, lprect: ConstPtr, berase: Bool): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiInvalidateRect(hwnd.rawAddress.toString(), lprect.rawAddress.toString(), berase) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun invalidateRgn(hwnd: Hwnd, hrgn: Hrgn, berase: Bool): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiInvalidateRgn(hwnd.rawAddress.toString(), hrgn.rawAddress.toString(), berase) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun invertRect(hdc: Hdc, lprc: ConstPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiInvertRect(hdc.rawAddress.toString(), lprc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun invertRgn(hdc: Hdc, hrgn: Hrgn): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiInvertRgn(hdc.rawAddress.toString(), hrgn.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isRectEmpty(lprc: ConstPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiIsRectEmpty(lprc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lPtoDP(hdc: Hdc, lppt: MutPtr, c: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiLPtoDP(hdc.rawAddress.toString(), lppt.rawAddress.toString(), c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineDDA(xstart: Int, ystart: Int, xend: Int, yend: Int, lpproc: Lineddaproc, data: Lparam): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiLineDDA(xstart, ystart, xend, yend, 0L.toString(), data.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineTo(hdc: Hdc, x: Int, y: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiLineTo(hdc.rawAddress.toString(), x, y) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadBitmapA(hinstance: Hinstance, lpbitmapname: Pcstr): Hbitmap =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiLoadBitmapA(hinstance.rawAddress.toString(), lpbitmapname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadBitmapW(hinstance: Hinstance, lpbitmapname: Pcwstr): Hbitmap =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiLoadBitmapW(hinstance.rawAddress.toString(), lpbitmapname.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lockWindowUpdate(hwndlock: Hwnd): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiLockWindowUpdate(hwndlock.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapWindowPoints(hwndfrom: Hwnd, hwndto: Hwnd, lppoints: MutPtr, cpoints: UInt): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiMapWindowPoints(hwndfrom.rawAddress.toString(), hwndto.rawAddress.toString(), lppoints.rawAddress.toString(), cpoints.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun maskBlt(hdcdest: Hdc, xdest: Int, ydest: Int, width: Int, height: Int, hdcsrc: Hdc, xsrc: Int, ysrc: Int, hbmmask: Hbitmap, xmask: Int, ymask: Int, rop: UInt): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiMaskBlt(hdcdest.rawAddress.toString(), xdest, ydest, width, height, hdcsrc.rawAddress.toString(), xsrc, ysrc, hbmmask.rawAddress.toString(), xmask, ymask, rop.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mergeFontPackage(puchmergefontbuffer: ConstPtr, ulmergefontbuffersize: UInt, puchfontpackagebuffer: ConstPtr, ulfontpackagebuffersize: UInt, ppuchdestbuffer: MutPtr, puldestbuffersize: MutPtr, pulbyteswritten: MutPtr, usmode: UShort, lpfnallocate: CfpAllocproc, lpfnreallocate: CfpReallocproc, lpfnfree: CfpFreeproc, lpvreserved: MutPtr): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiMergeFontPackage(puchmergefontbuffer.rawAddress.toString(), ulmergefontbuffersize.toInt(), puchfontpackagebuffer.rawAddress.toString(), ulfontpackagebuffersize.toInt(), ppuchdestbuffer.rawAddress.toString(), puldestbuffersize.rawAddress.toString(), pulbyteswritten.rawAddress.toString(), usmode.toInt(), 0L.toString(), 0L.toString(), 0L.toString(), lpvreserved.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun modifyWorldTransform(hdc: Hdc, lpxf: ConstPtr, mode: ModifyWorldTransformMode): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiModifyWorldTransform(hdc.rawAddress.toString(), lpxf.rawAddress.toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun monitorFromPoint(pt: Point, dwflags: MonitorFromFlags): Hmonitor =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun monitorFromRect(lprc: ConstPtr, dwflags: MonitorFromFlags): Hmonitor =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiMonitorFromRect(lprc.rawAddress.toString(), dwflags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun monitorFromWindow(hwnd: Hwnd, dwflags: MonitorFromFlags): Hmonitor =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiMonitorFromWindow(hwnd.rawAddress.toString(), dwflags.toInt()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveToEx(hdc: Hdc, x: Int, y: Int, lppt: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiMoveToEx(hdc.rawAddress.toString(), x, y, lppt.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offsetClipRgn(hdc: Hdc, x: Int, y: Int): GdiRegionType =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiOffsetClipRgn(hdc.rawAddress.toString(), x, y) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offsetRect(lprc: MutPtr, dx: Int, dy: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiOffsetRect(lprc.rawAddress.toString(), dx, dy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offsetRgn(hrgn: Hrgn, x: Int, y: Int): GdiRegionType =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiOffsetRgn(hrgn.rawAddress.toString(), x, y) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offsetViewportOrgEx(hdc: Hdc, x: Int, y: Int, lppt: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiOffsetViewportOrgEx(hdc.rawAddress.toString(), x, y, lppt.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offsetWindowOrgEx(hdc: Hdc, x: Int, y: Int, lppt: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiOffsetWindowOrgEx(hdc.rawAddress.toString(), x, y, lppt.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun paintDesktop(hdc: Hdc): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiPaintDesktop(hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun paintRgn(hdc: Hdc, hrgn: Hrgn): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiPaintRgn(hdc.rawAddress.toString(), hrgn.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun patBlt(hdc: Hdc, x: Int, y: Int, w: Int, h: Int, rop: RopCode): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiPatBlt(hdc.rawAddress.toString(), x, y, w, h, rop.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathToRegion(hdc: Hdc): Hrgn =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiPathToRegion(hdc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pie(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiPie(hdc.rawAddress.toString(), left, top, right, bottom, xr1, yr1, xr2, yr2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun playEnhMetaFile(hdc: Hdc, hmf: Henhmetafile, lprect: ConstPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiPlayEnhMetaFile(hdc.rawAddress.toString(), hmf.rawAddress.toString(), lprect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun playEnhMetaFileRecord(hdc: Hdc, pht: ConstPtr, pmr: ConstPtr, cht: UInt): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiPlayEnhMetaFileRecord(hdc.rawAddress.toString(), pht.rawAddress.toString(), pmr.rawAddress.toString(), cht.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun playMetaFile(hdc: Hdc, hmf: Hmetafile): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiPlayMetaFile(hdc.rawAddress.toString(), hmf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun playMetaFileRecord(hdc: Hdc, lphandletable: ConstPtr, lpmr: ConstPtr, noobjs: UInt): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiPlayMetaFileRecord(hdc.rawAddress.toString(), lphandletable.rawAddress.toString(), lpmr.rawAddress.toString(), noobjs.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun plgBlt(hdcdest: Hdc, lppoint: ConstPtr, hdcsrc: Hdc, xsrc: Int, ysrc: Int, width: Int, height: Int, hbmmask: Hbitmap, xmask: Int, ymask: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiPlgBlt(hdcdest.rawAddress.toString(), lppoint.rawAddress.toString(), hdcsrc.rawAddress.toString(), xsrc, ysrc, width, height, hbmmask.rawAddress.toString(), xmask, ymask) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun polyBezier(hdc: Hdc, apt: ConstPtr, cpt: UInt): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiPolyBezier(hdc.rawAddress.toString(), apt.rawAddress.toString(), cpt.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun polyBezierTo(hdc: Hdc, apt: ConstPtr, cpt: UInt): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiPolyBezierTo(hdc.rawAddress.toString(), apt.rawAddress.toString(), cpt.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun polyDraw(hdc: Hdc, apt: ConstPtr, aj: ConstPtr, cpt: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiPolyDraw(hdc.rawAddress.toString(), apt.rawAddress.toString(), aj.rawAddress.toString(), cpt) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun polyPolygon(hdc: Hdc, apt: ConstPtr, asz: ConstPtr, csz: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiPolyPolygon(hdc.rawAddress.toString(), apt.rawAddress.toString(), asz.rawAddress.toString(), csz) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun polyPolyline(hdc: Hdc, apt: ConstPtr, asz: ConstPtr, csz: UInt): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiPolyPolyline(hdc.rawAddress.toString(), apt.rawAddress.toString(), asz.rawAddress.toString(), csz.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun polyTextOutA(hdc: Hdc, ppt: ConstPtr, nstrings: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiPolyTextOutA(hdc.rawAddress.toString(), ppt.rawAddress.toString(), nstrings) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun polyTextOutW(hdc: Hdc, ppt: ConstPtr, nstrings: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiPolyTextOutW(hdc.rawAddress.toString(), ppt.rawAddress.toString(), nstrings) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun polygon(hdc: Hdc, apt: ConstPtr, cpt: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiPolygon(hdc.rawAddress.toString(), apt.rawAddress.toString(), cpt) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun polyline(hdc: Hdc, apt: ConstPtr, cpt: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiPolyline(hdc.rawAddress.toString(), apt.rawAddress.toString(), cpt) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun polylineTo(hdc: Hdc, apt: ConstPtr, cpt: UInt): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiPolylineTo(hdc.rawAddress.toString(), apt.rawAddress.toString(), cpt.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptInRect(lprc: ConstPtr, pt: Point): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptInRegion(hrgn: Hrgn, x: Int, y: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiPtInRegion(hrgn.rawAddress.toString(), x, y) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptVisible(hdc: Hdc, x: Int, y: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiPtVisible(hdc.rawAddress.toString(), x, y) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realizePalette(hdc: Hdc): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiRealizePalette(hdc.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rectInRegion(hrgn: Hrgn, lprect: ConstPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiRectInRegion(hrgn.rawAddress.toString(), lprect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rectVisible(hdc: Hdc, lprect: ConstPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiRectVisible(hdc.rawAddress.toString(), lprect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rectangle(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiRectangle(hdc.rawAddress.toString(), left, top, right, bottom) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun redrawWindow(hwnd: Hwnd, lprcupdate: ConstPtr, hrgnupdate: Hrgn, flags: RedrawWindowFlags): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiRedrawWindow(hwnd.rawAddress.toString(), lprcupdate.rawAddress.toString(), hrgnupdate.rawAddress.toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseDC(hwnd: Hwnd, hdc: Hdc): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiReleaseDC(hwnd.rawAddress.toString(), hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeFontMemResourceEx(h: Handle): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiRemoveFontMemResourceEx(h.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeFontResourceA(lpfilename: Pcstr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiRemoveFontResourceA(lpfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeFontResourceExA(name: Pcstr, fl: UInt, pdv: ConstPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiRemoveFontResourceExA(name.rawAddress.toString(), fl.toInt(), pdv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeFontResourceExW(name: Pcwstr, fl: UInt, pdv: ConstPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiRemoveFontResourceExW(name.rawAddress.toString(), fl.toInt(), pdv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeFontResourceW(lpfilename: Pcwstr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiRemoveFontResourceW(lpfilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resetDCA(hdc: Hdc, lpdm: ConstPtr): Hdc =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiResetDCA(hdc.rawAddress.toString(), lpdm.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resetDCW(hdc: Hdc, lpdm: ConstPtr): Hdc =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiResetDCW(hdc.rawAddress.toString(), lpdm.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resizePalette(hpal: Hpalette, n: UInt): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiResizePalette(hpal.rawAddress.toString(), n.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun restoreDC(hdc: Hdc, nsaveddc: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiRestoreDC(hdc.rawAddress.toString(), nsaveddc) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun roundRect(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int, width: Int, height: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiRoundRect(hdc.rawAddress.toString(), left, top, right, bottom, width, height) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saveDC(hdc: Hdc): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSaveDC(hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scaleViewportExtEx(hdc: Hdc, xn: Int, dx: Int, yn: Int, yd: Int, lpsz: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiScaleViewportExtEx(hdc.rawAddress.toString(), xn, dx, yn, yd, lpsz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scaleWindowExtEx(hdc: Hdc, xn: Int, xd: Int, yn: Int, yd: Int, lpsz: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiScaleWindowExtEx(hdc.rawAddress.toString(), xn, xd, yn, yd, lpsz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun screenToClient(hwnd: Hwnd, lppoint: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiScreenToClient(hwnd.rawAddress.toString(), lppoint.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun selectClipPath(hdc: Hdc, mode: RgnCombineMode): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSelectClipPath(hdc.rawAddress.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun selectClipRgn(hdc: Hdc, hrgn: Hrgn): GdiRegionType =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSelectClipRgn(hdc.rawAddress.toString(), hrgn.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun selectObject(hdc: Hdc, h: Hgdiobj): Hgdiobj =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSelectObject(hdc.rawAddress.toString(), h.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun selectPalette(hdc: Hdc, hpal: Hpalette, bforcebkgd: Bool): Hpalette =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSelectPalette(hdc.rawAddress.toString(), hpal.rawAddress.toString(), bforcebkgd) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setArcDirection(hdc: Hdc, dir: ArcDirection): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetArcDirection(hdc.rawAddress.toString(), dir) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setBitmapBits(hbm: Hbitmap, cb: UInt, pvbits: ConstPtr): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetBitmapBits(hbm.rawAddress.toString(), cb.toInt(), pvbits.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setBitmapDimensionEx(hbm: Hbitmap, w: Int, h: Int, lpsz: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetBitmapDimensionEx(hbm.rawAddress.toString(), w, h, lpsz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setBkColor(hdc: Hdc, color: Colorref): Colorref =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetBkColor(hdc.rawAddress.toString(), color.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setBkMode(hdc: Hdc, mode: Int): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetBkMode(hdc.rawAddress.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setBoundsRect(hdc: Hdc, lprect: ConstPtr, flags: SetBoundsRectFlags): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetBoundsRect(hdc.rawAddress.toString(), lprect.rawAddress.toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setBrushOrgEx(hdc: Hdc, x: Int, y: Int, lppt: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetBrushOrgEx(hdc.rawAddress.toString(), x, y, lppt.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setColorAdjustment(hdc: Hdc, lpca: ConstPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetColorAdjustment(hdc.rawAddress.toString(), lpca.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDCBrushColor(hdc: Hdc, color: Colorref): Colorref =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetDCBrushColor(hdc.rawAddress.toString(), color.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDCPenColor(hdc: Hdc, color: Colorref): Colorref =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetDCPenColor(hdc.rawAddress.toString(), color.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDIBColorTable(hdc: Hdc, istart: UInt, centries: UInt, prgbq: ConstPtr): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetDIBColorTable(hdc.rawAddress.toString(), istart.toInt(), centries.toInt(), prgbq.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDIBits(hdc: Hdc, hbm: Hbitmap, start: UInt, clines: UInt, lpbits: ConstPtr, lpbmi: ConstPtr, coloruse: DibUsage): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetDIBits(hdc.rawAddress.toString(), hbm.rawAddress.toString(), start.toInt(), clines.toInt(), lpbits.rawAddress.toString(), lpbmi.rawAddress.toString(), coloruse.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDIBitsToDevice(hdc: Hdc, xdest: Int, ydest: Int, w: UInt, h: UInt, xsrc: Int, ysrc: Int, startscan: UInt, clines: UInt, lpvbits: ConstPtr, lpbmi: ConstPtr, coloruse: DibUsage): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetDIBitsToDevice(hdc.rawAddress.toString(), xdest, ydest, w.toInt(), h.toInt(), xsrc, ysrc, startscan.toInt(), clines.toInt(), lpvbits.rawAddress.toString(), lpbmi.rawAddress.toString(), coloruse.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEnhMetaFileBits(nsize: UInt, pb: ConstPtr): Henhmetafile =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetEnhMetaFileBits(nsize.toInt(), pb.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setGraphicsMode(hdc: Hdc, imode: GraphicsMode): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetGraphicsMode(hdc.rawAddress.toString(), imode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setLayout(hdc: Hdc, l: DcLayout): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetLayout(hdc.rawAddress.toString(), l.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMapMode(hdc: Hdc, imode: HdcMapMode): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetMapMode(hdc.rawAddress.toString(), imode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMapperFlags(hdc: Hdc, flags: UInt): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetMapperFlags(hdc.rawAddress.toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMetaFileBitsEx(cbbuffer: UInt, lpdata: ConstPtr): Hmetafile =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetMetaFileBitsEx(cbbuffer.toInt(), lpdata.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMetaRgn(hdc: Hdc): GdiRegionType =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetMetaRgn(hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMiterLimit(hdc: Hdc, limit: Float, old: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetMiterLimit(hdc.rawAddress.toString(), limit.toDouble(), old.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPaletteEntries(hpal: Hpalette, istart: UInt, centries: UInt, ppalentries: ConstPtr): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetPaletteEntries(hpal.rawAddress.toString(), istart.toInt(), centries.toInt(), ppalentries.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPixel(hdc: Hdc, x: Int, y: Int, color: Colorref): Colorref =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetPixel(hdc.rawAddress.toString(), x, y, color.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPixelV(hdc: Hdc, x: Int, y: Int, color: Colorref): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetPixelV(hdc.rawAddress.toString(), x, y, color.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPolyFillMode(hdc: Hdc, mode: CreatePolygonRgnMode): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetPolyFillMode(hdc.rawAddress.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setROP2(hdc: Hdc, rop2: R2Mode): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetROP2(hdc.rawAddress.toString(), rop2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setRect(lprc: MutPtr, xleft: Int, ytop: Int, xright: Int, ybottom: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetRect(lprc.rawAddress.toString(), xleft, ytop, xright, ybottom) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setRectEmpty(lprc: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetRectEmpty(lprc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setRectRgn(hrgn: Hrgn, left: Int, top: Int, right: Int, bottom: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetRectRgn(hrgn.rawAddress.toString(), left, top, right, bottom) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setStretchBltMode(hdc: Hdc, mode: StretchBltMode): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetStretchBltMode(hdc.rawAddress.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSysColors(celements: Int, lpaelements: ConstPtr, lpargbvalues: ConstPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetSysColors(celements, lpaelements.rawAddress.toString(), lpargbvalues.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSystemPaletteUse(hdc: Hdc, use: SystemPaletteUse): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetSystemPaletteUse(hdc.rawAddress.toString(), use.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTextAlign(hdc: Hdc, align: TextAlignOptions): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetTextAlign(hdc.rawAddress.toString(), align.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTextCharacterExtra(hdc: Hdc, extra: Int): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetTextCharacterExtra(hdc.rawAddress.toString(), extra) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTextColor(hdc: Hdc, color: Colorref): Colorref =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetTextColor(hdc.rawAddress.toString(), color.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTextJustification(hdc: Hdc, extra: Int, count: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetTextJustification(hdc.rawAddress.toString(), extra, count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setViewportExtEx(hdc: Hdc, x: Int, y: Int, lpsz: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetViewportExtEx(hdc.rawAddress.toString(), x, y, lpsz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setViewportOrgEx(hdc: Hdc, x: Int, y: Int, lppt: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetViewportOrgEx(hdc.rawAddress.toString(), x, y, lppt.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowExtEx(hdc: Hdc, x: Int, y: Int, lpsz: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetWindowExtEx(hdc.rawAddress.toString(), x, y, lpsz.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowOrgEx(hdc: Hdc, x: Int, y: Int, lppt: MutPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetWindowOrgEx(hdc.rawAddress.toString(), x, y, lppt.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowRgn(hwnd: Hwnd, hrgn: Hrgn, bredraw: Bool): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetWindowRgn(hwnd.rawAddress.toString(), hrgn.rawAddress.toString(), bredraw) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWorldTransform(hdc: Hdc, lpxf: ConstPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSetWorldTransform(hdc.rawAddress.toString(), lpxf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stretchBlt(hdcdest: Hdc, xdest: Int, ydest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xsrc: Int, ysrc: Int, wsrc: Int, hsrc: Int, rop: RopCode): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiStretchBlt(hdcdest.rawAddress.toString(), xdest, ydest, wdest, hdest, hdcsrc.rawAddress.toString(), xsrc, ysrc, wsrc, hsrc, rop.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stretchDIBits(hdc: Hdc, xdest: Int, ydest: Int, destwidth: Int, destheight: Int, xsrc: Int, ysrc: Int, srcwidth: Int, srcheight: Int, lpbits: ConstPtr, lpbmi: ConstPtr, iusage: DibUsage, rop: RopCode): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiStretchDIBits(hdc.rawAddress.toString(), xdest, ydest, destwidth, destheight, xsrc, ysrc, srcwidth, srcheight, lpbits.rawAddress.toString(), lpbmi.rawAddress.toString(), iusage.toInt(), rop.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strokeAndFillPath(hdc: Hdc): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiStrokeAndFillPath(hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strokePath(hdc: Hdc): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiStrokePath(hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun subtractRect(lprcdst: MutPtr, lprcsrc1: ConstPtr, lprcsrc2: ConstPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiSubtractRect(lprcdst.rawAddress.toString(), lprcsrc1.rawAddress.toString(), lprcsrc2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTCharToUnicode(hdc: Hdc, puccharcodes: ConstPtr, ulcharcodesize: UInt, pusshortcodes: MutPtr, ulshortcodesize: UInt, ulflags: UInt): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiTTCharToUnicode(hdc.rawAddress.toString(), puccharcodes.rawAddress.toString(), ulcharcodesize.toInt(), pusshortcodes.rawAddress.toString(), ulshortcodesize.toInt(), ulflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTDeleteEmbeddedFont(hfontreference: Handle, ulflags: UInt, pulstatus: MutPtr): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiTTDeleteEmbeddedFont(hfontreference.rawAddress.toString(), ulflags.toInt(), pulstatus.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTEmbedFont(hdc: Hdc, ulflags: TtembedFlags, ulcharset: EmbedFontCharset, pulprivstatus: MutPtr, pulstatus: MutPtr, lpfnwritetostream: Writeembedproc, lpvwritestream: ConstPtr, puscharcodeset: ConstPtr, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: ConstPtr): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiTTEmbedFont(hdc.rawAddress.toString(), ulflags.toInt(), ulcharset.toInt(), pulprivstatus.rawAddress.toString(), pulstatus.rawAddress.toString(), 0L.toString(), lpvwritestream.rawAddress.toString(), puscharcodeset.rawAddress.toString(), uscharcodecount.toInt(), uslanguage.toInt(), pttembedinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTEmbedFontEx(hdc: Hdc, ulflags: TtembedFlags, ulcharset: EmbedFontCharset, pulprivstatus: MutPtr, pulstatus: MutPtr, lpfnwritetostream: Writeembedproc, lpvwritestream: ConstPtr, pulcharcodeset: ConstPtr, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: ConstPtr): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiTTEmbedFontEx(hdc.rawAddress.toString(), ulflags.toInt(), ulcharset.toInt(), pulprivstatus.rawAddress.toString(), pulstatus.rawAddress.toString(), 0L.toString(), lpvwritestream.rawAddress.toString(), pulcharcodeset.rawAddress.toString(), uscharcodecount.toInt(), uslanguage.toInt(), pttembedinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTEmbedFontFromFileA(hdc: Hdc, szfontfilename: Pcstr, usttcindex: UShort, ulflags: TtembedFlags, ulcharset: EmbedFontCharset, pulprivstatus: MutPtr, pulstatus: MutPtr, lpfnwritetostream: Writeembedproc, lpvwritestream: ConstPtr, puscharcodeset: ConstPtr, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: ConstPtr): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiTTEmbedFontFromFileA(hdc.rawAddress.toString(), szfontfilename.rawAddress.toString(), usttcindex.toInt(), ulflags.toInt(), ulcharset.toInt(), pulprivstatus.rawAddress.toString(), pulstatus.rawAddress.toString(), 0L.toString(), lpvwritestream.rawAddress.toString(), puscharcodeset.rawAddress.toString(), uscharcodecount.toInt(), uslanguage.toInt(), pttembedinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTEnableEmbeddingForFacename(lpszfacename: Pcstr, benable: Bool): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiTTEnableEmbeddingForFacename(lpszfacename.rawAddress.toString(), benable) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTGetEmbeddedFontInfo(ulflags: TtembedFlags, pulprivstatus: MutPtr, ulprivs: FontLicensePrivs, pulstatus: MutPtr, lpfnreadfromstream: Readembedproc, lpvreadstream: ConstPtr, pttloadinfo: ConstPtr): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiTTGetEmbeddedFontInfo(ulflags.toInt(), pulprivstatus.rawAddress.toString(), ulprivs.toInt(), pulstatus.rawAddress.toString(), 0L.toString(), lpvreadstream.rawAddress.toString(), pttloadinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTGetEmbeddingType(hdc: Hdc, pulembedtype: MutPtr): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiTTGetEmbeddingType(hdc.rawAddress.toString(), pulembedtype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTGetNewFontName(phfontreference: ConstPtr, wzwinfamilyname: Pwstr, cchmaxwinname: Int, szmacfamilyname: Pstr, cchmaxmacname: Int): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiTTGetNewFontName(phfontreference.rawAddress.toString(), wzwinfamilyname.rawAddress.toString(), cchmaxwinname, szmacfamilyname.rawAddress.toString(), cchmaxmacname) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTIsEmbeddingEnabled(hdc: Hdc, pbenabled: MutPtr): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiTTIsEmbeddingEnabled(hdc.rawAddress.toString(), pbenabled.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTIsEmbeddingEnabledForFacename(lpszfacename: Pcstr, pbenabled: MutPtr): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiTTIsEmbeddingEnabledForFacename(lpszfacename.rawAddress.toString(), pbenabled.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTLoadEmbeddedFont(phfontreference: MutPtr, ulflags: UInt, pulprivstatus: MutPtr, ulprivs: FontLicensePrivs, pulstatus: MutPtr, lpfnreadfromstream: Readembedproc, lpvreadstream: ConstPtr, szwinfamilyname: Pcwstr, szmacfamilyname: Pcstr, pttloadinfo: ConstPtr): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiTTLoadEmbeddedFont(phfontreference.rawAddress.toString(), ulflags.toInt(), pulprivstatus.rawAddress.toString(), ulprivs.toInt(), pulstatus.rawAddress.toString(), 0L.toString(), lpvreadstream.rawAddress.toString(), szwinfamilyname.rawAddress.toString(), szmacfamilyname.rawAddress.toString(), pttloadinfo.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTRunValidationTests(hdc: Hdc, ptestparam: ConstPtr): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiTTRunValidationTests(hdc.rawAddress.toString(), ptestparam.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTRunValidationTestsEx(hdc: Hdc, ptestparam: ConstPtr): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiTTRunValidationTestsEx(hdc.rawAddress.toString(), ptestparam.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tabbedTextOutA(hdc: Hdc, x: Int, y: Int, lpstring: Pcstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: ConstPtr, ntaborigin: Int): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiTabbedTextOutA(hdc.rawAddress.toString(), x, y, lpstring.rawAddress.toString(), chcount, ntabpositions, lpntabstoppositions.rawAddress.toString(), ntaborigin) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tabbedTextOutW(hdc: Hdc, x: Int, y: Int, lpstring: Pcwstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: ConstPtr, ntaborigin: Int): Int =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiTabbedTextOutW(hdc.rawAddress.toString(), x, y, lpstring.rawAddress.toString(), chcount, ntabpositions, lpntabstoppositions.rawAddress.toString(), ntaborigin) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textOutA(hdc: Hdc, x: Int, y: Int, lpstring: Pcstr, c: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiTextOutA(hdc.rawAddress.toString(), x, y, lpstring.rawAddress.toString(), c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textOutW(hdc: Hdc, x: Int, y: Int, lpstring: Pcwstr, c: Int): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiTextOutW(hdc.rawAddress.toString(), x, y, lpstring.rawAddress.toString(), c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun transparentBlt(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: UInt): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiTransparentBlt(hdcdest.rawAddress.toString(), xorigindest, yorigindest, wdest, hdest, hdcsrc.rawAddress.toString(), xoriginsrc, yoriginsrc, wsrc, hsrc, crtransparent.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unionRect(lprcdst: MutPtr, lprcsrc1: ConstPtr, lprcsrc2: ConstPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiUnionRect(lprcdst.rawAddress.toString(), lprcsrc1.rawAddress.toString(), lprcsrc2.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unrealizeObject(h: Hgdiobj): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiUnrealizeObject(h.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateColors(hdc: Hdc): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiUpdateColors(hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateWindow(hwnd: Hwnd): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiUpdateWindow(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun validateRect(hwnd: Hwnd, lprect: ConstPtr): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiValidateRect(hwnd.rawAddress.toString(), lprect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun validateRgn(hwnd: Hwnd, hrgn: Hrgn): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiValidateRgn(hwnd.rawAddress.toString(), hrgn.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun widenPath(hdc: Hdc): Bool =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiWidenPath(hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun windowFromDC(hdc: Hdc): Hwnd =
    if (windowsWin32GraphicsGdiNapiAddon != null) MutPtr((windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiWindowFromDC(hdc.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglSwapMultipleBuffers(param0: UInt, param1: ConstPtr): UInt =
    if (windowsWin32GraphicsGdiNapiAddon != null) (windowsWin32GraphicsGdiNapiAddon.windowssysWindowsWin32GraphicsGdiWglSwapMultipleBuffers(param0.toInt(), param1.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
