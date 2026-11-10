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

private val _windowsWin32GraphicsGdiNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun abortPath(hdc: Hdc): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_abortPath((hdc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addFontMemResourceEx(pfileview: COpaquePointer?, cjsize: UInt, pvresrved: COpaquePointer?, pnumfonts: COpaquePointer?): Handle =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_addFontMemResourceEx((pfileview?.value ?: 0L).toString(), cjsize.toInt(), (pvresrved?.value ?: 0L).toString(), (pnumfonts?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addFontResourceA(param0: Pcstr): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_addFontResourceA((param0?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addFontResourceExA(name: Pcstr, fl: FontResourceCharacteristics, res: COpaquePointer?): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_addFontResourceExA((name?.value ?: 0L).toString(), fl.toInt(), (res?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addFontResourceExW(name: Pcwstr, fl: FontResourceCharacteristics, res: COpaquePointer?): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_addFontResourceExW((name?.value ?: 0L).toString(), fl.toInt(), (res?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun addFontResourceW(param0: Pcwstr): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_addFontResourceW((param0?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun alphaBlend(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, ftn: Blendfunction): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun angleArc(hdc: Hdc, x: Int, y: Int, r: UInt, startangle: Float, sweepangle: Float): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_angleArc((hdc?.value ?: 0L).toString(), x, y, r.toInt(), startangle.toDouble(), sweepangle.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun animatePalette(hpal: Hpalette, istartindex: UInt, centries: UInt, ppe: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_animatePalette((hpal?.value ?: 0L).toString(), istartindex.toInt(), centries.toInt(), (ppe?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arc(hdc: Hdc, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_arc((hdc?.value ?: 0L).toString(), x1, y1, x2, y2, x3, y3, x4, y4) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun arcTo(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_arcTo((hdc?.value ?: 0L).toString(), left, top, right, bottom, xr1, yr1, xr2, yr2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun beginPaint(hwnd: Hwnd, lppaint: COpaquePointer?): Hdc =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_beginPaint((hwnd?.value ?: 0L).toString(), (lppaint?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun beginPath(hdc: Hdc): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_beginPath((hdc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun bitBlt(hdc: Hdc, x: Int, y: Int, cx: Int, cy: Int, hdcsrc: Hdc, x1: Int, y1: Int, rop: RopCode): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_bitBlt((hdc?.value ?: 0L).toString(), x, y, cx, cy, (hdcsrc?.value ?: 0L).toString(), x1, y1, rop.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun cancelDC(hdc: Hdc): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_cancelDC((hdc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeDisplaySettingsA(lpdevmode: COpaquePointer?, dwflags: CdsType): DispChange =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_changeDisplaySettingsA((lpdevmode?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeDisplaySettingsExA(lpszdevicename: Pcstr, lpdevmode: COpaquePointer?, hwnd: Hwnd, dwflags: CdsType, lparam: COpaquePointer?): DispChange =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_changeDisplaySettingsExA((lpszdevicename?.value ?: 0L).toString(), (lpdevmode?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString(), dwflags.toInt(), (lparam?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeDisplaySettingsExW(lpszdevicename: Pcwstr, lpdevmode: COpaquePointer?, hwnd: Hwnd, dwflags: CdsType, lparam: COpaquePointer?): DispChange =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_changeDisplaySettingsExW((lpszdevicename?.value ?: 0L).toString(), (lpdevmode?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString(), dwflags.toInt(), (lparam?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun changeDisplaySettingsW(lpdevmode: COpaquePointer?, dwflags: CdsType): DispChange =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_changeDisplaySettingsW((lpdevmode?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun chord(hdc: Hdc, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_chord((hdc?.value ?: 0L).toString(), x1, y1, x2, y2, x3, y3, x4, y4) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun clientToScreen(hwnd: Hwnd, lppoint: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_clientToScreen((hwnd?.value ?: 0L).toString(), (lppoint?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeEnhMetaFile(hdc: Hdc): Henhmetafile =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_closeEnhMetaFile((hdc?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeFigure(hdc: Hdc): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_closeFigure((hdc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun closeMetaFile(hdc: Hdc): Hmetafile =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_closeMetaFile((hdc?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun combineRgn(hrgndst: Hrgn, hrgnsrc1: Hrgn, hrgnsrc2: Hrgn, imode: RgnCombineMode): GdiRegionType =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_combineRgn((hrgndst?.value ?: 0L).toString(), (hrgnsrc1?.value ?: 0L).toString(), (hrgnsrc2?.value ?: 0L).toString(), imode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun combineTransform(lpxfout: COpaquePointer?, lpxf1: COpaquePointer?, lpxf2: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_combineTransform((lpxfout?.value ?: 0L).toString(), (lpxf1?.value ?: 0L).toString(), (lpxf2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyEnhMetaFileA(henh: Henhmetafile, lpfilename: Pcstr): Henhmetafile =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_copyEnhMetaFileA((henh?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyEnhMetaFileW(henh: Henhmetafile, lpfilename: Pcwstr): Henhmetafile =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_copyEnhMetaFileW((henh?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyMetaFileA(param0: Hmetafile, param1: Pcstr): Hmetafile =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_copyMetaFileA((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyMetaFileW(param0: Hmetafile, param1: Pcwstr): Hmetafile =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_copyMetaFileW((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun copyRect(lprcdst: COpaquePointer?, lprcsrc: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_copyRect((lprcdst?.value ?: 0L).toString(), (lprcsrc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createBitmap(nwidth: Int, nheight: Int, nplanes: UInt, nbitcount: UInt, lpbits: COpaquePointer?): Hbitmap =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createBitmap(nwidth, nheight, nplanes.toInt(), nbitcount.toInt(), (lpbits?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createBitmapIndirect(pbm: COpaquePointer?): Hbitmap =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createBitmapIndirect((pbm?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createBrushIndirect(plbrush: COpaquePointer?): Hbrush =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createBrushIndirect((plbrush?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createCompatibleBitmap(hdc: Hdc, cx: Int, cy: Int): Hbitmap =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createCompatibleBitmap((hdc?.value ?: 0L).toString(), cx, cy) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createCompatibleDC(hdc: Hdc): Hdc =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createCompatibleDC((hdc?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDCA(pwszdriver: Pcstr, pwszdevice: Pcstr, pszport: Pcstr, pdm: COpaquePointer?): Hdc =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createDCA((pwszdriver?.value ?: 0L).toString(), (pwszdevice?.value ?: 0L).toString(), (pszport?.value ?: 0L).toString(), (pdm?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDCW(pwszdriver: Pcwstr, pwszdevice: Pcwstr, pszport: Pcwstr, pdm: COpaquePointer?): Hdc =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createDCW((pwszdriver?.value ?: 0L).toString(), (pwszdevice?.value ?: 0L).toString(), (pszport?.value ?: 0L).toString(), (pdm?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDIBPatternBrush(h: Hglobal, iusage: DibUsage): Hbrush =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createDIBPatternBrush((h?.value ?: 0L).toString(), iusage.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDIBPatternBrushPt(lppackeddib: COpaquePointer?, iusage: DibUsage): Hbrush =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createDIBPatternBrushPt((lppackeddib?.value ?: 0L).toString(), iusage.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDIBSection(hdc: Hdc, pbmi: COpaquePointer?, usage: DibUsage, ppvbits: COpaquePointer?, hsection: Handle, offset: UInt): Hbitmap =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createDIBSection((hdc?.value ?: 0L).toString(), (pbmi?.value ?: 0L).toString(), usage.toInt(), (ppvbits?.value ?: 0L).toString(), (hsection?.value ?: 0L).toString(), offset.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDIBitmap(hdc: Hdc, pbmih: COpaquePointer?, flinit: UInt, pjbits: COpaquePointer?, pbmi: COpaquePointer?, iusage: DibUsage): Hbitmap =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createDIBitmap((hdc?.value ?: 0L).toString(), (pbmih?.value ?: 0L).toString(), flinit.toInt(), (pjbits?.value ?: 0L).toString(), (pbmi?.value ?: 0L).toString(), iusage.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createDiscardableBitmap(hdc: Hdc, cx: Int, cy: Int): Hbitmap =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createDiscardableBitmap((hdc?.value ?: 0L).toString(), cx, cy) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEllipticRgn(x1: Int, y1: Int, x2: Int, y2: Int): Hrgn =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createEllipticRgn(x1, y1, x2, y2) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEllipticRgnIndirect(lprect: COpaquePointer?): Hrgn =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createEllipticRgnIndirect((lprect?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEnhMetaFileA(hdc: Hdc, lpfilename: Pcstr, lprc: COpaquePointer?, lpdesc: Pcstr): Hdc =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createEnhMetaFileA((hdc?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString(), (lprc?.value ?: 0L).toString(), (lpdesc?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createEnhMetaFileW(hdc: Hdc, lpfilename: Pcwstr, lprc: COpaquePointer?, lpdesc: Pcwstr): Hdc =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createEnhMetaFileW((hdc?.value ?: 0L).toString(), (lpfilename?.value ?: 0L).toString(), (lprc?.value ?: 0L).toString(), (lpdesc?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFontA(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: UInt, bunderline: UInt, bstrikeout: UInt, icharset: UInt, ioutprecision: UInt, iclipprecision: UInt, iquality: UInt, ipitchandfamily: UInt, pszfacename: Pcstr): Hfont =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createFontA(cheight, cwidth, cescapement, corientation, cweight, bitalic.toInt(), bunderline.toInt(), bstrikeout.toInt(), icharset.toInt(), ioutprecision.toInt(), iclipprecision.toInt(), iquality.toInt(), ipitchandfamily.toInt(), (pszfacename?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFontIndirectA(lplf: COpaquePointer?): Hfont =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createFontIndirectA((lplf?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFontIndirectExA(param0: COpaquePointer?): Hfont =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createFontIndirectExA((param0?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFontIndirectExW(param0: COpaquePointer?): Hfont =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createFontIndirectExW((param0?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFontIndirectW(lplf: COpaquePointer?): Hfont =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createFontIndirectW((lplf?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFontPackage(puchsrcbuffer: COpaquePointer?, ulsrcbuffersize: UInt, ppuchfontpackagebuffer: COpaquePointer?, pulfontpackagebuffersize: COpaquePointer?, pulbyteswritten: COpaquePointer?, usflag: UShort, usttcindex: UShort, ussubsetformat: UShort, ussubsetlanguage: UShort, ussubsetplatform: CreateFontPackageSubsetPlatform, ussubsetencoding: CreateFontPackageSubsetEncoding, pussubsetkeeplist: COpaquePointer?, ussubsetlistcount: UShort, lpfnallocate: CfpAllocproc, lpfnreallocate: CfpReallocproc, lpfnfree: CfpFreeproc, lpvreserved: COpaquePointer?): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createFontPackage((puchsrcbuffer?.value ?: 0L).toString(), ulsrcbuffersize.toInt(), (ppuchfontpackagebuffer?.value ?: 0L).toString(), (pulfontpackagebuffersize?.value ?: 0L).toString(), (pulbyteswritten?.value ?: 0L).toString(), usflag.toInt(), usttcindex.toInt(), ussubsetformat.toInt(), ussubsetlanguage.toInt(), ussubsetplatform.toInt(), ussubsetencoding.toInt(), (pussubsetkeeplist?.value ?: 0L).toString(), ussubsetlistcount.toInt(), 0L.toString(), 0L.toString(), 0L.toString(), (lpvreserved?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createFontW(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: UInt, bunderline: UInt, bstrikeout: UInt, icharset: UInt, ioutprecision: UInt, iclipprecision: UInt, iquality: UInt, ipitchandfamily: UInt, pszfacename: Pcwstr): Hfont =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createFontW(cheight, cwidth, cescapement, corientation, cweight, bitalic.toInt(), bunderline.toInt(), bstrikeout.toInt(), icharset.toInt(), ioutprecision.toInt(), iclipprecision.toInt(), iquality.toInt(), ipitchandfamily.toInt(), (pszfacename?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createHalftonePalette(hdc: Hdc): Hpalette =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createHalftonePalette((hdc?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createHatchBrush(ihatch: HatchBrushStyle, color: Colorref): Hbrush =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createHatchBrush(ihatch, color.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createICA(pszdriver: Pcstr, pszdevice: Pcstr, pszport: Pcstr, pdm: COpaquePointer?): Hdc =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createICA((pszdriver?.value ?: 0L).toString(), (pszdevice?.value ?: 0L).toString(), (pszport?.value ?: 0L).toString(), (pdm?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createICW(pszdriver: Pcwstr, pszdevice: Pcwstr, pszport: Pcwstr, pdm: COpaquePointer?): Hdc =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createICW((pszdriver?.value ?: 0L).toString(), (pszdevice?.value ?: 0L).toString(), (pszport?.value ?: 0L).toString(), (pdm?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMetaFileA(pszfile: Pcstr): Hdc =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createMetaFileA((pszfile?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createMetaFileW(pszfile: Pcwstr): Hdc =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createMetaFileW((pszfile?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPalette(plpal: COpaquePointer?): Hpalette =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createPalette((plpal?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPatternBrush(hbm: Hbitmap): Hbrush =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createPatternBrush((hbm?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPen(istyle: PenStyle, cwidth: Int, color: Colorref): Hpen =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createPen(istyle, cwidth, color.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPenIndirect(plpen: COpaquePointer?): Hpen =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createPenIndirect((plpen?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPolyPolygonRgn(pptl: COpaquePointer?, pc: COpaquePointer?, cpoly: Int, imode: CreatePolygonRgnMode): Hrgn =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createPolyPolygonRgn((pptl?.value ?: 0L).toString(), (pc?.value ?: 0L).toString(), cpoly, imode) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createPolygonRgn(pptl: COpaquePointer?, cpoint: Int, imode: CreatePolygonRgnMode): Hrgn =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createPolygonRgn((pptl?.value ?: 0L).toString(), cpoint, imode) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createRectRgn(x1: Int, y1: Int, x2: Int, y2: Int): Hrgn =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createRectRgn(x1, y1, x2, y2) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createRectRgnIndirect(lprect: COpaquePointer?): Hrgn =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createRectRgnIndirect((lprect?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createRoundRectRgn(x1: Int, y1: Int, x2: Int, y2: Int, w: Int, h: Int): Hrgn =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createRoundRectRgn(x1, y1, x2, y2, w, h) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createScalableFontResourceA(fdwhidden: UInt, lpszfont: Pcstr, lpszfile: Pcstr, lpszpath: Pcstr): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createScalableFontResourceA(fdwhidden.toInt(), (lpszfont?.value ?: 0L).toString(), (lpszfile?.value ?: 0L).toString(), (lpszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createScalableFontResourceW(fdwhidden: UInt, lpszfont: Pcwstr, lpszfile: Pcwstr, lpszpath: Pcwstr): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createScalableFontResourceW(fdwhidden.toInt(), (lpszfont?.value ?: 0L).toString(), (lpszfile?.value ?: 0L).toString(), (lpszpath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun createSolidBrush(color: Colorref): Hbrush =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_createSolidBrush(color.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun dPtoLP(hdc: Hdc, lppt: COpaquePointer?, c: Int): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_dPtoLP((hdc?.value ?: 0L).toString(), (lppt?.value ?: 0L).toString(), c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteDC(hdc: Hdc): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_deleteDC((hdc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteEnhMetaFile(hmf: Henhmetafile): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_deleteEnhMetaFile((hmf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteMetaFile(hmf: Hmetafile): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_deleteMetaFile((hmf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deleteObject(ho: Hgdiobj): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_deleteObject((ho?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawAnimatedRects(hwnd: Hwnd, idani: Int, lprcfrom: COpaquePointer?, lprcto: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_drawAnimatedRects((hwnd?.value ?: 0L).toString(), idani, (lprcfrom?.value ?: 0L).toString(), (lprcto?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawCaption(hwnd: Hwnd, hdc: Hdc, lprect: COpaquePointer?, flags: DrawCaptionFlags): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_drawCaption((hwnd?.value ?: 0L).toString(), (hdc?.value ?: 0L).toString(), (lprect?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawEdge(hdc: Hdc, qrc: COpaquePointer?, edge: DrawedgeFlags, grfflags: DrawEdgeFlags): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_drawEdge((hdc?.value ?: 0L).toString(), (qrc?.value ?: 0L).toString(), edge.toInt(), grfflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawEscape(hdc: Hdc, iescape: Int, cjin: Int, lpin: Pcstr): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_drawEscape((hdc?.value ?: 0L).toString(), iescape, cjin, (lpin?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawFocusRect(hdc: Hdc, lprc: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_drawFocusRect((hdc?.value ?: 0L).toString(), (lprc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawFrameControl(param0: Hdc, param1: COpaquePointer?, param2: DfcType, param3: DfcsState): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_drawFrameControl((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), param2.toInt(), param3.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawStateA(hdc: Hdc, hbrfore: Hbrush, qfncallback: Drawstateproc, ldata: Lparam, wdata: Wparam, x: Int, y: Int, cx: Int, cy: Int, uflags: DrawstateFlags): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_drawStateA((hdc?.value ?: 0L).toString(), (hbrfore?.value ?: 0L).toString(), 0L.toString(), ldata.toString(), wdata.toString(), x, y, cx, cy, uflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawStateW(hdc: Hdc, hbrfore: Hbrush, qfncallback: Drawstateproc, ldata: Lparam, wdata: Wparam, x: Int, y: Int, cx: Int, cy: Int, uflags: DrawstateFlags): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_drawStateW((hdc?.value ?: 0L).toString(), (hbrfore?.value ?: 0L).toString(), 0L.toString(), ldata.toString(), wdata.toString(), x, y, cx, cy, uflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawTextA(hdc: Hdc, lpchtext: Pcstr, cchtext: Int, lprc: COpaquePointer?, format: DrawTextFormat): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_drawTextA((hdc?.value ?: 0L).toString(), (lpchtext?.value ?: 0L).toString(), cchtext, (lprc?.value ?: 0L).toString(), format.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawTextExA(hdc: Hdc, lpchtext: Pstr, cchtext: Int, lprc: COpaquePointer?, format: DrawTextFormat, lpdtp: COpaquePointer?): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_drawTextExA((hdc?.value ?: 0L).toString(), (lpchtext?.value ?: 0L).toString(), cchtext, (lprc?.value ?: 0L).toString(), format.toInt(), (lpdtp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawTextExW(hdc: Hdc, lpchtext: Pwstr, cchtext: Int, lprc: COpaquePointer?, format: DrawTextFormat, lpdtp: COpaquePointer?): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_drawTextExW((hdc?.value ?: 0L).toString(), (lpchtext?.value ?: 0L).toString(), cchtext, (lprc?.value ?: 0L).toString(), format.toInt(), (lpdtp?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun drawTextW(hdc: Hdc, lpchtext: Pcwstr, cchtext: Int, lprc: COpaquePointer?, format: DrawTextFormat): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_drawTextW((hdc?.value ?: 0L).toString(), (lpchtext?.value ?: 0L).toString(), cchtext, (lprc?.value ?: 0L).toString(), format.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ellipse(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_ellipse((hdc?.value ?: 0L).toString(), left, top, right, bottom) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endPaint(hwnd: Hwnd, lppaint: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_endPaint((hwnd?.value ?: 0L).toString(), (lppaint?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endPath(hdc: Hdc): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_endPath((hdc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDisplayDevicesA(lpdevice: Pcstr, idevnum: UInt, lpdisplaydevice: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_enumDisplayDevicesA((lpdevice?.value ?: 0L).toString(), idevnum.toInt(), (lpdisplaydevice?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDisplayDevicesW(lpdevice: Pcwstr, idevnum: UInt, lpdisplaydevice: COpaquePointer?, dwflags: UInt): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_enumDisplayDevicesW((lpdevice?.value ?: 0L).toString(), idevnum.toInt(), (lpdisplaydevice?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDisplayMonitors(hdc: Hdc, lprcclip: COpaquePointer?, lpfnenum: Monitorenumproc, dwdata: Lparam): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_enumDisplayMonitors((hdc?.value ?: 0L).toString(), (lprcclip?.value ?: 0L).toString(), 0L.toString(), dwdata.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDisplaySettingsA(lpszdevicename: Pcstr, imodenum: EnumDisplaySettingsMode, lpdevmode: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_enumDisplaySettingsA((lpszdevicename?.value ?: 0L).toString(), imodenum.toInt(), (lpdevmode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDisplaySettingsExA(lpszdevicename: Pcstr, imodenum: EnumDisplaySettingsMode, lpdevmode: COpaquePointer?, dwflags: EnumDisplaySettingsFlags): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_enumDisplaySettingsExA((lpszdevicename?.value ?: 0L).toString(), imodenum.toInt(), (lpdevmode?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDisplaySettingsExW(lpszdevicename: Pcwstr, imodenum: EnumDisplaySettingsMode, lpdevmode: COpaquePointer?, dwflags: EnumDisplaySettingsFlags): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_enumDisplaySettingsExW((lpszdevicename?.value ?: 0L).toString(), imodenum.toInt(), (lpdevmode?.value ?: 0L).toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumDisplaySettingsW(lpszdevicename: Pcwstr, imodenum: EnumDisplaySettingsMode, lpdevmode: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_enumDisplaySettingsW((lpszdevicename?.value ?: 0L).toString(), imodenum.toInt(), (lpdevmode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumEnhMetaFile(hdc: Hdc, hmf: Henhmetafile, proc: Enhmfenumproc, param3: COpaquePointer?, lprect: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_enumEnhMetaFile((hdc?.value ?: 0L).toString(), (hmf?.value ?: 0L).toString(), 0L.toString(), (param3?.value ?: 0L).toString(), (lprect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumFontFamiliesA(hdc: Hdc, lplogfont: Pcstr, lpproc: Fontenumproca, lparam: Lparam): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_enumFontFamiliesA((hdc?.value ?: 0L).toString(), (lplogfont?.value ?: 0L).toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumFontFamiliesExA(hdc: Hdc, lplogfont: COpaquePointer?, lpproc: Fontenumproca, lparam: Lparam, dwflags: UInt): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_enumFontFamiliesExA((hdc?.value ?: 0L).toString(), (lplogfont?.value ?: 0L).toString(), 0L.toString(), lparam.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumFontFamiliesExW(hdc: Hdc, lplogfont: COpaquePointer?, lpproc: Fontenumprocw, lparam: Lparam, dwflags: UInt): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_enumFontFamiliesExW((hdc?.value ?: 0L).toString(), (lplogfont?.value ?: 0L).toString(), 0L.toString(), lparam.toString(), dwflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumFontFamiliesW(hdc: Hdc, lplogfont: Pcwstr, lpproc: Fontenumprocw, lparam: Lparam): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_enumFontFamiliesW((hdc?.value ?: 0L).toString(), (lplogfont?.value ?: 0L).toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumFontsA(hdc: Hdc, lplogfont: Pcstr, lpproc: Fontenumproca, lparam: Lparam): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_enumFontsA((hdc?.value ?: 0L).toString(), (lplogfont?.value ?: 0L).toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumFontsW(hdc: Hdc, lplogfont: Pcwstr, lpproc: Fontenumprocw, lparam: Lparam): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_enumFontsW((hdc?.value ?: 0L).toString(), (lplogfont?.value ?: 0L).toString(), 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumMetaFile(hdc: Hdc, hmf: Hmetafile, proc: Mfenumproc, param3: Lparam): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_enumMetaFile((hdc?.value ?: 0L).toString(), (hmf?.value ?: 0L).toString(), 0L.toString(), param3.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enumObjects(hdc: Hdc, ntype: ObjType, lpfunc: Gobjenumproc, lparam: Lparam): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_enumObjects((hdc?.value ?: 0L).toString(), ntype, 0L.toString(), lparam.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun equalRect(lprc1: COpaquePointer?, lprc2: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_equalRect((lprc1?.value ?: 0L).toString(), (lprc2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun equalRgn(hrgn1: Hrgn, hrgn2: Hrgn): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_equalRgn((hrgn1?.value ?: 0L).toString(), (hrgn2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun excludeClipRect(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): GdiRegionType =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_excludeClipRect((hdc?.value ?: 0L).toString(), left, top, right, bottom) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun excludeUpdateRgn(hdc: Hdc, hwnd: Hwnd): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_excludeUpdateRgn((hdc?.value ?: 0L).toString(), (hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extCreatePen(ipenstyle: UInt, cwidth: UInt, plbrush: COpaquePointer?, cstyle: UInt, pstyle: COpaquePointer?): Hpen =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_extCreatePen(ipenstyle.toInt(), cwidth.toInt(), (plbrush?.value ?: 0L).toString(), cstyle.toInt(), (pstyle?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extCreateRegion(lpx: COpaquePointer?, ncount: UInt, lpdata: COpaquePointer?): Hrgn =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_extCreateRegion((lpx?.value ?: 0L).toString(), ncount.toInt(), (lpdata?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extFloodFill(hdc: Hdc, x: Int, y: Int, color: Colorref, type: ExtFloodFillType): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_extFloodFill((hdc?.value ?: 0L).toString(), x, y, color.toInt(), type.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extSelectClipRgn(hdc: Hdc, hrgn: Hrgn, mode: RgnCombineMode): GdiRegionType =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_extSelectClipRgn((hdc?.value ?: 0L).toString(), (hrgn?.value ?: 0L).toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extTextOutA(hdc: Hdc, x: Int, y: Int, options: EtoOptions, lprect: COpaquePointer?, lpstring: Pcstr, c: UInt, lpdx: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_extTextOutA((hdc?.value ?: 0L).toString(), x, y, options.toInt(), (lprect?.value ?: 0L).toString(), (lpstring?.value ?: 0L).toString(), c.toInt(), (lpdx?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extTextOutW(hdc: Hdc, x: Int, y: Int, options: EtoOptions, lprect: COpaquePointer?, lpstring: Pcwstr, c: UInt, lpdx: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_extTextOutW((hdc?.value ?: 0L).toString(), x, y, options.toInt(), (lprect?.value ?: 0L).toString(), (lpstring?.value ?: 0L).toString(), c.toInt(), (lpdx?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fillPath(hdc: Hdc): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_fillPath((hdc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fillRect(hdc: Hdc, lprc: COpaquePointer?, hbr: Hbrush): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_fillRect((hdc?.value ?: 0L).toString(), (lprc?.value ?: 0L).toString(), (hbr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fillRgn(hdc: Hdc, hrgn: Hrgn, hbr: Hbrush): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_fillRgn((hdc?.value ?: 0L).toString(), (hrgn?.value ?: 0L).toString(), (hbr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun fixBrushOrgEx(hdc: Hdc, x: Int, y: Int, ptl: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_fixBrushOrgEx((hdc?.value ?: 0L).toString(), x, y, (ptl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun flattenPath(hdc: Hdc): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_flattenPath((hdc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun floodFill(hdc: Hdc, x: Int, y: Int, color: Colorref): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_floodFill((hdc?.value ?: 0L).toString(), x, y, color.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun frameRect(hdc: Hdc, lprc: COpaquePointer?, hbr: Hbrush): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_frameRect((hdc?.value ?: 0L).toString(), (lprc?.value ?: 0L).toString(), (hbr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun frameRgn(hdc: Hdc, hrgn: Hrgn, hbr: Hbrush, w: Int, h: Int): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_frameRgn((hdc?.value ?: 0L).toString(), (hrgn?.value ?: 0L).toString(), (hbr?.value ?: 0L).toString(), w, h) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiAlphaBlend(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, ftn: Blendfunction): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiComment(hdc: Hdc, nsize: UInt, lpdata: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_gdiComment((hdc?.value ?: 0L).toString(), nsize.toInt(), (lpdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiFlush(): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_gdiFlush() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiGetBatchLimit(): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_gdiGetBatchLimit() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiGradientFill(hdc: Hdc, pvertex: COpaquePointer?, nvertex: UInt, pmesh: COpaquePointer?, ncount: UInt, ulmode: GradientFill): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_gdiGradientFill((hdc?.value ?: 0L).toString(), (pvertex?.value ?: 0L).toString(), nvertex.toInt(), (pmesh?.value ?: 0L).toString(), ncount.toInt(), ulmode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiSetBatchLimit(dw: UInt): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_gdiSetBatchLimit(dw.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiTransparentBlt(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: UInt): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_gdiTransparentBlt((hdcdest?.value ?: 0L).toString(), xorigindest, yorigindest, wdest, hdest, (hdcsrc?.value ?: 0L).toString(), xoriginsrc, yoriginsrc, wsrc, hsrc, crtransparent.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getArcDirection(hdc: Hdc): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getArcDirection((hdc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAspectRatioFilterEx(hdc: Hdc, lpsize: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getAspectRatioFilterEx((hdc?.value ?: 0L).toString(), (lpsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBitmapBits(hbit: Hbitmap, cb: Int, lpvbits: COpaquePointer?): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getBitmapBits((hbit?.value ?: 0L).toString(), cb, (lpvbits?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBitmapDimensionEx(hbit: Hbitmap, lpsize: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getBitmapDimensionEx((hbit?.value ?: 0L).toString(), (lpsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBkColor(hdc: Hdc): Colorref =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getBkColor((hdc?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBkMode(hdc: Hdc): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getBkMode((hdc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBoundsRect(hdc: Hdc, lprect: COpaquePointer?, flags: UInt): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getBoundsRect((hdc?.value ?: 0L).toString(), (lprect?.value ?: 0L).toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getBrushOrgEx(hdc: Hdc, lppt: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getBrushOrgEx((hdc?.value ?: 0L).toString(), (lppt?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharABCWidthsA(hdc: Hdc, wfirst: UInt, wlast: UInt, lpabc: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getCharABCWidthsA((hdc?.value ?: 0L).toString(), wfirst.toInt(), wlast.toInt(), (lpabc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharABCWidthsFloatA(hdc: Hdc, ifirst: UInt, ilast: UInt, lpabc: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getCharABCWidthsFloatA((hdc?.value ?: 0L).toString(), ifirst.toInt(), ilast.toInt(), (lpabc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharABCWidthsFloatW(hdc: Hdc, ifirst: UInt, ilast: UInt, lpabc: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getCharABCWidthsFloatW((hdc?.value ?: 0L).toString(), ifirst.toInt(), ilast.toInt(), (lpabc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharABCWidthsI(hdc: Hdc, gifirst: UInt, cgi: UInt, pgi: COpaquePointer?, pabc: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getCharABCWidthsI((hdc?.value ?: 0L).toString(), gifirst.toInt(), cgi.toInt(), (pgi?.value ?: 0L).toString(), (pabc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharABCWidthsW(hdc: Hdc, wfirst: UInt, wlast: UInt, lpabc: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getCharABCWidthsW((hdc?.value ?: 0L).toString(), wfirst.toInt(), wlast.toInt(), (lpabc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharWidth32A(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getCharWidth32A((hdc?.value ?: 0L).toString(), ifirst.toInt(), ilast.toInt(), (lpbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharWidth32W(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getCharWidth32W((hdc?.value ?: 0L).toString(), ifirst.toInt(), ilast.toInt(), (lpbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharWidthA(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getCharWidthA((hdc?.value ?: 0L).toString(), ifirst.toInt(), ilast.toInt(), (lpbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharWidthFloatA(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getCharWidthFloatA((hdc?.value ?: 0L).toString(), ifirst.toInt(), ilast.toInt(), (lpbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharWidthFloatW(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getCharWidthFloatW((hdc?.value ?: 0L).toString(), ifirst.toInt(), ilast.toInt(), (lpbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharWidthI(hdc: Hdc, gifirst: UInt, cgi: UInt, pgi: COpaquePointer?, piwidths: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getCharWidthI((hdc?.value ?: 0L).toString(), gifirst.toInt(), cgi.toInt(), (pgi?.value ?: 0L).toString(), (piwidths?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharWidthW(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getCharWidthW((hdc?.value ?: 0L).toString(), ifirst.toInt(), ilast.toInt(), (lpbuffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharacterPlacementA(hdc: Hdc, lpstring: Pcstr, ncount: Int, nmexextent: Int, lpresults: COpaquePointer?, dwflags: GetCharacterPlacementFlags): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getCharacterPlacementA((hdc?.value ?: 0L).toString(), (lpstring?.value ?: 0L).toString(), ncount, nmexextent, (lpresults?.value ?: 0L).toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCharacterPlacementW(hdc: Hdc, lpstring: Pcwstr, ncount: Int, nmexextent: Int, lpresults: COpaquePointer?, dwflags: GetCharacterPlacementFlags): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getCharacterPlacementW((hdc?.value ?: 0L).toString(), (lpstring?.value ?: 0L).toString(), ncount, nmexextent, (lpresults?.value ?: 0L).toString(), dwflags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClipBox(hdc: Hdc, lprect: COpaquePointer?): GdiRegionType =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getClipBox((hdc?.value ?: 0L).toString(), (lprect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getClipRgn(hdc: Hdc, hrgn: Hrgn): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getClipRgn((hdc?.value ?: 0L).toString(), (hrgn?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getColorAdjustment(hdc: Hdc, lpca: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getColorAdjustment((hdc?.value ?: 0L).toString(), (lpca?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentObject(hdc: Hdc, type: UInt): Hgdiobj =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getCurrentObject((hdc?.value ?: 0L).toString(), type.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getCurrentPositionEx(hdc: Hdc, lppt: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getCurrentPositionEx((hdc?.value ?: 0L).toString(), (lppt?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDC(hwnd: Hwnd): Hdc =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getDC((hwnd?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDCBrushColor(hdc: Hdc): Colorref =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getDCBrushColor((hdc?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDCEx(hwnd: Hwnd, hrgnclip: Hrgn, flags: GetDcxFlags): Hdc =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getDCEx((hwnd?.value ?: 0L).toString(), (hrgnclip?.value ?: 0L).toString(), flags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDCOrgEx(hdc: Hdc, lppt: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getDCOrgEx((hdc?.value ?: 0L).toString(), (lppt?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDCPenColor(hdc: Hdc): Colorref =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getDCPenColor((hdc?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDIBColorTable(hdc: Hdc, istart: UInt, centries: UInt, prgbq: COpaquePointer?): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getDIBColorTable((hdc?.value ?: 0L).toString(), istart.toInt(), centries.toInt(), (prgbq?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDIBits(hdc: Hdc, hbm: Hbitmap, start: UInt, clines: UInt, lpvbits: COpaquePointer?, lpbmi: COpaquePointer?, usage: DibUsage): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getDIBits((hdc?.value ?: 0L).toString(), (hbm?.value ?: 0L).toString(), start.toInt(), clines.toInt(), (lpvbits?.value ?: 0L).toString(), (lpbmi?.value ?: 0L).toString(), usage.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDeviceCaps(hdc: Hdc, index: Int): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getDeviceCaps((hdc?.value ?: 0L).toString(), index) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnhMetaFileA(lpname: Pcstr): Henhmetafile =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getEnhMetaFileA((lpname?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnhMetaFileBits(hemf: Henhmetafile, nsize: UInt, lpdata: COpaquePointer?): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getEnhMetaFileBits((hemf?.value ?: 0L).toString(), nsize.toInt(), (lpdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnhMetaFileDescriptionA(hemf: Henhmetafile, cchbuffer: UInt, lpdescription: Pstr): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getEnhMetaFileDescriptionA((hemf?.value ?: 0L).toString(), cchbuffer.toInt(), (lpdescription?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnhMetaFileDescriptionW(hemf: Henhmetafile, cchbuffer: UInt, lpdescription: Pwstr): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getEnhMetaFileDescriptionW((hemf?.value ?: 0L).toString(), cchbuffer.toInt(), (lpdescription?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnhMetaFileHeader(hemf: Henhmetafile, nsize: UInt, lpenhmetaheader: COpaquePointer?): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getEnhMetaFileHeader((hemf?.value ?: 0L).toString(), nsize.toInt(), (lpenhmetaheader?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnhMetaFilePaletteEntries(hemf: Henhmetafile, nnumentries: UInt, lppaletteentries: COpaquePointer?): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getEnhMetaFilePaletteEntries((hemf?.value ?: 0L).toString(), nnumentries.toInt(), (lppaletteentries?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getEnhMetaFileW(lpname: Pcwstr): Henhmetafile =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getEnhMetaFileW((lpname?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFontData(hdc: Hdc, dwtable: UInt, dwoffset: UInt, pvbuffer: COpaquePointer?, cjbuffer: UInt): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getFontData((hdc?.value ?: 0L).toString(), dwtable.toInt(), dwoffset.toInt(), (pvbuffer?.value ?: 0L).toString(), cjbuffer.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFontLanguageInfo(hdc: Hdc): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getFontLanguageInfo((hdc?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getFontUnicodeRanges(hdc: Hdc, lpgs: COpaquePointer?): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getFontUnicodeRanges((hdc?.value ?: 0L).toString(), (lpgs?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGlyphIndicesA(hdc: Hdc, lpstr: Pcstr, c: Int, pgi: COpaquePointer?, fl: UInt): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getGlyphIndicesA((hdc?.value ?: 0L).toString(), (lpstr?.value ?: 0L).toString(), c, (pgi?.value ?: 0L).toString(), fl.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGlyphIndicesW(hdc: Hdc, lpstr: Pcwstr, c: Int, pgi: COpaquePointer?, fl: UInt): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getGlyphIndicesW((hdc?.value ?: 0L).toString(), (lpstr?.value ?: 0L).toString(), c, (pgi?.value ?: 0L).toString(), fl.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGlyphOutlineA(hdc: Hdc, uchar: UInt, fuformat: GetGlyphOutlineFormat, lpgm: COpaquePointer?, cjbuffer: UInt, pvbuffer: COpaquePointer?, lpmat2: COpaquePointer?): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getGlyphOutlineA((hdc?.value ?: 0L).toString(), uchar.toInt(), fuformat.toInt(), (lpgm?.value ?: 0L).toString(), cjbuffer.toInt(), (pvbuffer?.value ?: 0L).toString(), (lpmat2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGlyphOutlineW(hdc: Hdc, uchar: UInt, fuformat: GetGlyphOutlineFormat, lpgm: COpaquePointer?, cjbuffer: UInt, pvbuffer: COpaquePointer?, lpmat2: COpaquePointer?): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getGlyphOutlineW((hdc?.value ?: 0L).toString(), uchar.toInt(), fuformat.toInt(), (lpgm?.value ?: 0L).toString(), cjbuffer.toInt(), (pvbuffer?.value ?: 0L).toString(), (lpmat2?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getGraphicsMode(hdc: Hdc): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getGraphicsMode((hdc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKerningPairsA(hdc: Hdc, npairs: UInt, lpkernpair: COpaquePointer?): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getKerningPairsA((hdc?.value ?: 0L).toString(), npairs.toInt(), (lpkernpair?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getKerningPairsW(hdc: Hdc, npairs: UInt, lpkernpair: COpaquePointer?): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getKerningPairsW((hdc?.value ?: 0L).toString(), npairs.toInt(), (lpkernpair?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getLayout(hdc: Hdc): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getLayout((hdc?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMapMode(hdc: Hdc): HdcMapMode =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getMapMode((hdc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMetaFileA(lpname: Pcstr): Hmetafile =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getMetaFileA((lpname?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMetaFileBitsEx(hmf: Hmetafile, cbbuffer: UInt, lpdata: COpaquePointer?): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getMetaFileBitsEx((hmf?.value ?: 0L).toString(), cbbuffer.toInt(), (lpdata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMetaFileW(lpname: Pcwstr): Hmetafile =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getMetaFileW((lpname?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMetaRgn(hdc: Hdc, hrgn: Hrgn): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getMetaRgn((hdc?.value ?: 0L).toString(), (hrgn?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMiterLimit(hdc: Hdc, plimit: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getMiterLimit((hdc?.value ?: 0L).toString(), (plimit?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMonitorInfoA(hmonitor: Hmonitor, lpmi: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getMonitorInfoA((hmonitor?.value ?: 0L).toString(), (lpmi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getMonitorInfoW(hmonitor: Hmonitor, lpmi: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getMonitorInfoW((hmonitor?.value ?: 0L).toString(), (lpmi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNearestColor(hdc: Hdc, color: Colorref): Colorref =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getNearestColor((hdc?.value ?: 0L).toString(), color.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getNearestPaletteIndex(h: Hpalette, color: Colorref): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getNearestPaletteIndex((h?.value ?: 0L).toString(), color.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getObjectA(h: Hgdiobj, c: Int, pv: COpaquePointer?): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getObjectA((h?.value ?: 0L).toString(), c, (pv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getObjectType(h: Hgdiobj): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getObjectType((h?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getObjectW(h: Hgdiobj, c: Int, pv: COpaquePointer?): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getObjectW((h?.value ?: 0L).toString(), c, (pv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOutlineTextMetricsA(hdc: Hdc, cjcopy: UInt, potm: COpaquePointer?): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getOutlineTextMetricsA((hdc?.value ?: 0L).toString(), cjcopy.toInt(), (potm?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getOutlineTextMetricsW(hdc: Hdc, cjcopy: UInt, potm: COpaquePointer?): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getOutlineTextMetricsW((hdc?.value ?: 0L).toString(), cjcopy.toInt(), (potm?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPaletteEntries(hpal: Hpalette, istart: UInt, centries: UInt, ppalentries: COpaquePointer?): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getPaletteEntries((hpal?.value ?: 0L).toString(), istart.toInt(), centries.toInt(), (ppalentries?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPath(hdc: Hdc, apt: COpaquePointer?, aj: COpaquePointer?, cpt: Int): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getPath((hdc?.value ?: 0L).toString(), (apt?.value ?: 0L).toString(), (aj?.value ?: 0L).toString(), cpt) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPixel(hdc: Hdc, x: Int, y: Int): Colorref =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getPixel((hdc?.value ?: 0L).toString(), x, y) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getPolyFillMode(hdc: Hdc): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getPolyFillMode((hdc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getROP2(hdc: Hdc): R2Mode =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getROP2((hdc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRandomRgn(hdc: Hdc, hrgn: Hrgn, i: Int): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getRandomRgn((hdc?.value ?: 0L).toString(), (hrgn?.value ?: 0L).toString(), i) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRasterizerCaps(lpraststat: COpaquePointer?, cjbytes: UInt): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getRasterizerCaps((lpraststat?.value ?: 0L).toString(), cjbytes.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRegionData(hrgn: Hrgn, ncount: UInt, lprgndata: COpaquePointer?): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getRegionData((hrgn?.value ?: 0L).toString(), ncount.toInt(), (lprgndata?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getRgnBox(hrgn: Hrgn, lprc: COpaquePointer?): GdiRegionType =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getRgnBox((hrgn?.value ?: 0L).toString(), (lprc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStockObject(i: GetStockObjectFlags): Hgdiobj =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getStockObject(i) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getStretchBltMode(hdc: Hdc): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getStretchBltMode((hdc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSysColor(nindex: SysColorIndex): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getSysColor(nindex) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSysColorBrush(nindex: SysColorIndex): Hbrush =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getSysColorBrush(nindex) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemPaletteEntries(hdc: Hdc, istart: UInt, centries: UInt, ppalentries: COpaquePointer?): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getSystemPaletteEntries((hdc?.value ?: 0L).toString(), istart.toInt(), centries.toInt(), (ppalentries?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemPaletteUse(hdc: Hdc): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getSystemPaletteUse((hdc?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTabbedTextExtentA(hdc: Hdc, lpstring: Pcstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: COpaquePointer?): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getTabbedTextExtentA((hdc?.value ?: 0L).toString(), (lpstring?.value ?: 0L).toString(), chcount, ntabpositions, (lpntabstoppositions?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTabbedTextExtentW(hdc: Hdc, lpstring: Pcwstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: COpaquePointer?): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getTabbedTextExtentW((hdc?.value ?: 0L).toString(), (lpstring?.value ?: 0L).toString(), chcount, ntabpositions, (lpntabstoppositions?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextAlign(hdc: Hdc): TextAlignOptions =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getTextAlign((hdc?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextCharacterExtra(hdc: Hdc): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getTextCharacterExtra((hdc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextColor(hdc: Hdc): Colorref =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getTextColor((hdc?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextExtentExPointA(hdc: Hdc, lpszstring: Pcstr, cchstring: Int, nmaxextent: Int, lpnfit: COpaquePointer?, lpndx: COpaquePointer?, lpsize: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getTextExtentExPointA((hdc?.value ?: 0L).toString(), (lpszstring?.value ?: 0L).toString(), cchstring, nmaxextent, (lpnfit?.value ?: 0L).toString(), (lpndx?.value ?: 0L).toString(), (lpsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextExtentExPointI(hdc: Hdc, lpwszstring: COpaquePointer?, cwchstring: Int, nmaxextent: Int, lpnfit: COpaquePointer?, lpndx: COpaquePointer?, lpsize: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getTextExtentExPointI((hdc?.value ?: 0L).toString(), (lpwszstring?.value ?: 0L).toString(), cwchstring, nmaxextent, (lpnfit?.value ?: 0L).toString(), (lpndx?.value ?: 0L).toString(), (lpsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextExtentExPointW(hdc: Hdc, lpszstring: Pcwstr, cchstring: Int, nmaxextent: Int, lpnfit: COpaquePointer?, lpndx: COpaquePointer?, lpsize: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getTextExtentExPointW((hdc?.value ?: 0L).toString(), (lpszstring?.value ?: 0L).toString(), cchstring, nmaxextent, (lpnfit?.value ?: 0L).toString(), (lpndx?.value ?: 0L).toString(), (lpsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextExtentPoint32A(hdc: Hdc, lpstring: Pcstr, c: Int, psizl: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getTextExtentPoint32A((hdc?.value ?: 0L).toString(), (lpstring?.value ?: 0L).toString(), c, (psizl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextExtentPoint32W(hdc: Hdc, lpstring: Pcwstr, c: Int, psizl: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getTextExtentPoint32W((hdc?.value ?: 0L).toString(), (lpstring?.value ?: 0L).toString(), c, (psizl?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextExtentPointA(hdc: Hdc, lpstring: Pcstr, c: Int, lpsz: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getTextExtentPointA((hdc?.value ?: 0L).toString(), (lpstring?.value ?: 0L).toString(), c, (lpsz?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextExtentPointI(hdc: Hdc, pgiin: COpaquePointer?, cgi: Int, psize: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getTextExtentPointI((hdc?.value ?: 0L).toString(), (pgiin?.value ?: 0L).toString(), cgi, (psize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextExtentPointW(hdc: Hdc, lpstring: Pcwstr, c: Int, lpsz: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getTextExtentPointW((hdc?.value ?: 0L).toString(), (lpstring?.value ?: 0L).toString(), c, (lpsz?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextFaceA(hdc: Hdc, c: Int, lpname: Pstr): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getTextFaceA((hdc?.value ?: 0L).toString(), c, (lpname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextFaceW(hdc: Hdc, c: Int, lpname: Pwstr): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getTextFaceW((hdc?.value ?: 0L).toString(), c, (lpname?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextMetricsA(hdc: Hdc, lptm: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getTextMetricsA((hdc?.value ?: 0L).toString(), (lptm?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getTextMetricsW(hdc: Hdc, lptm: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getTextMetricsW((hdc?.value ?: 0L).toString(), (lptm?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUpdateRect(hwnd: Hwnd, lprect: COpaquePointer?, berase: Bool): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getUpdateRect((hwnd?.value ?: 0L).toString(), (lprect?.value ?: 0L).toString(), berase) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getUpdateRgn(hwnd: Hwnd, hrgn: Hrgn, berase: Bool): GdiRegionType =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getUpdateRgn((hwnd?.value ?: 0L).toString(), (hrgn?.value ?: 0L).toString(), berase) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getViewportExtEx(hdc: Hdc, lpsize: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getViewportExtEx((hdc?.value ?: 0L).toString(), (lpsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getViewportOrgEx(hdc: Hdc, lppoint: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getViewportOrgEx((hdc?.value ?: 0L).toString(), (lppoint?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWinMetaFileBits(hemf: Henhmetafile, cbdata16: UInt, pdata16: COpaquePointer?, imapmode: Int, hdcref: Hdc): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getWinMetaFileBits((hemf?.value ?: 0L).toString(), cbdata16.toInt(), (pdata16?.value ?: 0L).toString(), imapmode, (hdcref?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowDC(hwnd: Hwnd): Hdc =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getWindowDC((hwnd?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowExtEx(hdc: Hdc, lpsize: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getWindowExtEx((hdc?.value ?: 0L).toString(), (lpsize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowOrgEx(hdc: Hdc, lppoint: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getWindowOrgEx((hdc?.value ?: 0L).toString(), (lppoint?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowRgn(hwnd: Hwnd, hrgn: Hrgn): GdiRegionType =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getWindowRgn((hwnd?.value ?: 0L).toString(), (hrgn?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowRgnBox(hwnd: Hwnd, lprc: COpaquePointer?): GdiRegionType =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getWindowRgnBox((hwnd?.value ?: 0L).toString(), (lprc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWorldTransform(hdc: Hdc, lpxf: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_getWorldTransform((hdc?.value ?: 0L).toString(), (lpxf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gradientFill(hdc: Hdc, pvertex: COpaquePointer?, nvertex: UInt, pmesh: COpaquePointer?, nmesh: UInt, ulmode: GradientFill): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_gradientFill((hdc?.value ?: 0L).toString(), (pvertex?.value ?: 0L).toString(), nvertex.toInt(), (pmesh?.value ?: 0L).toString(), nmesh.toInt(), ulmode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun grayStringA(hdc: Hdc, hbrush: Hbrush, lpoutputfunc: Graystringproc, lpdata: Lparam, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_grayStringA((hdc?.value ?: 0L).toString(), (hbrush?.value ?: 0L).toString(), 0L.toString(), lpdata.toString(), ncount, x, y, nwidth, nheight) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun grayStringW(hdc: Hdc, hbrush: Hbrush, lpoutputfunc: Graystringproc, lpdata: Lparam, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_grayStringW((hdc?.value ?: 0L).toString(), (hbrush?.value ?: 0L).toString(), 0L.toString(), lpdata.toString(), ncount, x, y, nwidth, nheight) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun inflateRect(lprc: COpaquePointer?, dx: Int, dy: Int): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_inflateRect((lprc?.value ?: 0L).toString(), dx, dy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun intersectClipRect(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): GdiRegionType =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_intersectClipRect((hdc?.value ?: 0L).toString(), left, top, right, bottom) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun intersectRect(lprcdst: COpaquePointer?, lprcsrc1: COpaquePointer?, lprcsrc2: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_intersectRect((lprcdst?.value ?: 0L).toString(), (lprcsrc1?.value ?: 0L).toString(), (lprcsrc2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun invalidateRect(hwnd: Hwnd, lprect: COpaquePointer?, berase: Bool): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_invalidateRect((hwnd?.value ?: 0L).toString(), (lprect?.value ?: 0L).toString(), berase) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun invalidateRgn(hwnd: Hwnd, hrgn: Hrgn, berase: Bool): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_invalidateRgn((hwnd?.value ?: 0L).toString(), (hrgn?.value ?: 0L).toString(), berase) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun invertRect(hdc: Hdc, lprc: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_invertRect((hdc?.value ?: 0L).toString(), (lprc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun invertRgn(hdc: Hdc, hrgn: Hrgn): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_invertRgn((hdc?.value ?: 0L).toString(), (hrgn?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isRectEmpty(lprc: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_isRectEmpty((lprc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lPtoDP(hdc: Hdc, lppt: COpaquePointer?, c: Int): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_lPtoDP((hdc?.value ?: 0L).toString(), (lppt?.value ?: 0L).toString(), c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineDDA(xstart: Int, ystart: Int, xend: Int, yend: Int, lpproc: Lineddaproc, data: Lparam): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_lineDDA(xstart, ystart, xend, yend, 0L.toString(), data.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lineTo(hdc: Hdc, x: Int, y: Int): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_lineTo((hdc?.value ?: 0L).toString(), x, y) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadBitmapA(hinstance: Hinstance, lpbitmapname: Pcstr): Hbitmap =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_loadBitmapA((hinstance?.value ?: 0L).toString(), (lpbitmapname?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun loadBitmapW(hinstance: Hinstance, lpbitmapname: Pcwstr): Hbitmap =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_loadBitmapW((hinstance?.value ?: 0L).toString(), (lpbitmapname?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun lockWindowUpdate(hwndlock: Hwnd): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_lockWindowUpdate((hwndlock?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapWindowPoints(hwndfrom: Hwnd, hwndto: Hwnd, lppoints: COpaquePointer?, cpoints: UInt): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_mapWindowPoints((hwndfrom?.value ?: 0L).toString(), (hwndto?.value ?: 0L).toString(), (lppoints?.value ?: 0L).toString(), cpoints.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun maskBlt(hdcdest: Hdc, xdest: Int, ydest: Int, width: Int, height: Int, hdcsrc: Hdc, xsrc: Int, ysrc: Int, hbmmask: Hbitmap, xmask: Int, ymask: Int, rop: UInt): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_maskBlt((hdcdest?.value ?: 0L).toString(), xdest, ydest, width, height, (hdcsrc?.value ?: 0L).toString(), xsrc, ysrc, (hbmmask?.value ?: 0L).toString(), xmask, ymask, rop.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mergeFontPackage(puchmergefontbuffer: COpaquePointer?, ulmergefontbuffersize: UInt, puchfontpackagebuffer: COpaquePointer?, ulfontpackagebuffersize: UInt, ppuchdestbuffer: COpaquePointer?, puldestbuffersize: COpaquePointer?, pulbyteswritten: COpaquePointer?, usmode: UShort, lpfnallocate: CfpAllocproc, lpfnreallocate: CfpReallocproc, lpfnfree: CfpFreeproc, lpvreserved: COpaquePointer?): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_mergeFontPackage((puchmergefontbuffer?.value ?: 0L).toString(), ulmergefontbuffersize.toInt(), (puchfontpackagebuffer?.value ?: 0L).toString(), ulfontpackagebuffersize.toInt(), (ppuchdestbuffer?.value ?: 0L).toString(), (puldestbuffersize?.value ?: 0L).toString(), (pulbyteswritten?.value ?: 0L).toString(), usmode.toInt(), 0L.toString(), 0L.toString(), 0L.toString(), (lpvreserved?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun modifyWorldTransform(hdc: Hdc, lpxf: COpaquePointer?, mode: ModifyWorldTransformMode): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_modifyWorldTransform((hdc?.value ?: 0L).toString(), (lpxf?.value ?: 0L).toString(), mode.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun monitorFromPoint(pt: Point, dwflags: MonitorFromFlags): Hmonitor =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun monitorFromRect(lprc: COpaquePointer?, dwflags: MonitorFromFlags): Hmonitor =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_monitorFromRect((lprc?.value ?: 0L).toString(), dwflags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun monitorFromWindow(hwnd: Hwnd, dwflags: MonitorFromFlags): Hmonitor =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_monitorFromWindow((hwnd?.value ?: 0L).toString(), dwflags.toInt()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun moveToEx(hdc: Hdc, x: Int, y: Int, lppt: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_moveToEx((hdc?.value ?: 0L).toString(), x, y, (lppt?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offsetClipRgn(hdc: Hdc, x: Int, y: Int): GdiRegionType =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_offsetClipRgn((hdc?.value ?: 0L).toString(), x, y) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offsetRect(lprc: COpaquePointer?, dx: Int, dy: Int): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_offsetRect((lprc?.value ?: 0L).toString(), dx, dy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offsetRgn(hrgn: Hrgn, x: Int, y: Int): GdiRegionType =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_offsetRgn((hrgn?.value ?: 0L).toString(), x, y) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offsetViewportOrgEx(hdc: Hdc, x: Int, y: Int, lppt: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_offsetViewportOrgEx((hdc?.value ?: 0L).toString(), x, y, (lppt?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun offsetWindowOrgEx(hdc: Hdc, x: Int, y: Int, lppt: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_offsetWindowOrgEx((hdc?.value ?: 0L).toString(), x, y, (lppt?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun paintDesktop(hdc: Hdc): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_paintDesktop((hdc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun paintRgn(hdc: Hdc, hrgn: Hrgn): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_paintRgn((hdc?.value ?: 0L).toString(), (hrgn?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun patBlt(hdc: Hdc, x: Int, y: Int, w: Int, h: Int, rop: RopCode): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_patBlt((hdc?.value ?: 0L).toString(), x, y, w, h, rop.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pathToRegion(hdc: Hdc): Hrgn =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_pathToRegion((hdc?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun pie(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_pie((hdc?.value ?: 0L).toString(), left, top, right, bottom, xr1, yr1, xr2, yr2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun playEnhMetaFile(hdc: Hdc, hmf: Henhmetafile, lprect: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_playEnhMetaFile((hdc?.value ?: 0L).toString(), (hmf?.value ?: 0L).toString(), (lprect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun playEnhMetaFileRecord(hdc: Hdc, pht: COpaquePointer?, pmr: COpaquePointer?, cht: UInt): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_playEnhMetaFileRecord((hdc?.value ?: 0L).toString(), (pht?.value ?: 0L).toString(), (pmr?.value ?: 0L).toString(), cht.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun playMetaFile(hdc: Hdc, hmf: Hmetafile): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_playMetaFile((hdc?.value ?: 0L).toString(), (hmf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun playMetaFileRecord(hdc: Hdc, lphandletable: COpaquePointer?, lpmr: COpaquePointer?, noobjs: UInt): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_playMetaFileRecord((hdc?.value ?: 0L).toString(), (lphandletable?.value ?: 0L).toString(), (lpmr?.value ?: 0L).toString(), noobjs.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun plgBlt(hdcdest: Hdc, lppoint: COpaquePointer?, hdcsrc: Hdc, xsrc: Int, ysrc: Int, width: Int, height: Int, hbmmask: Hbitmap, xmask: Int, ymask: Int): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_plgBlt((hdcdest?.value ?: 0L).toString(), (lppoint?.value ?: 0L).toString(), (hdcsrc?.value ?: 0L).toString(), xsrc, ysrc, width, height, (hbmmask?.value ?: 0L).toString(), xmask, ymask) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun polyBezier(hdc: Hdc, apt: COpaquePointer?, cpt: UInt): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_polyBezier((hdc?.value ?: 0L).toString(), (apt?.value ?: 0L).toString(), cpt.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun polyBezierTo(hdc: Hdc, apt: COpaquePointer?, cpt: UInt): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_polyBezierTo((hdc?.value ?: 0L).toString(), (apt?.value ?: 0L).toString(), cpt.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun polyDraw(hdc: Hdc, apt: COpaquePointer?, aj: COpaquePointer?, cpt: Int): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_polyDraw((hdc?.value ?: 0L).toString(), (apt?.value ?: 0L).toString(), (aj?.value ?: 0L).toString(), cpt) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun polyPolygon(hdc: Hdc, apt: COpaquePointer?, asz: COpaquePointer?, csz: Int): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_polyPolygon((hdc?.value ?: 0L).toString(), (apt?.value ?: 0L).toString(), (asz?.value ?: 0L).toString(), csz) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun polyPolyline(hdc: Hdc, apt: COpaquePointer?, asz: COpaquePointer?, csz: UInt): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_polyPolyline((hdc?.value ?: 0L).toString(), (apt?.value ?: 0L).toString(), (asz?.value ?: 0L).toString(), csz.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun polyTextOutA(hdc: Hdc, ppt: COpaquePointer?, nstrings: Int): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_polyTextOutA((hdc?.value ?: 0L).toString(), (ppt?.value ?: 0L).toString(), nstrings) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun polyTextOutW(hdc: Hdc, ppt: COpaquePointer?, nstrings: Int): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_polyTextOutW((hdc?.value ?: 0L).toString(), (ppt?.value ?: 0L).toString(), nstrings) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun polygon(hdc: Hdc, apt: COpaquePointer?, cpt: Int): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_polygon((hdc?.value ?: 0L).toString(), (apt?.value ?: 0L).toString(), cpt) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun polyline(hdc: Hdc, apt: COpaquePointer?, cpt: Int): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_polyline((hdc?.value ?: 0L).toString(), (apt?.value ?: 0L).toString(), cpt) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun polylineTo(hdc: Hdc, apt: COpaquePointer?, cpt: UInt): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_polylineTo((hdc?.value ?: 0L).toString(), (apt?.value ?: 0L).toString(), cpt.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptInRect(lprc: COpaquePointer?, pt: Point): Bool =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptInRegion(hrgn: Hrgn, x: Int, y: Int): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_ptInRegion((hrgn?.value ?: 0L).toString(), x, y) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ptVisible(hdc: Hdc, x: Int, y: Int): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_ptVisible((hdc?.value ?: 0L).toString(), x, y) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun realizePalette(hdc: Hdc): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_realizePalette((hdc?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rectInRegion(hrgn: Hrgn, lprect: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_rectInRegion((hrgn?.value ?: 0L).toString(), (lprect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rectVisible(hdc: Hdc, lprect: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_rectVisible((hdc?.value ?: 0L).toString(), (lprect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rectangle(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_rectangle((hdc?.value ?: 0L).toString(), left, top, right, bottom) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun redrawWindow(hwnd: Hwnd, lprcupdate: COpaquePointer?, hrgnupdate: Hrgn, flags: RedrawWindowFlags): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_redrawWindow((hwnd?.value ?: 0L).toString(), (lprcupdate?.value ?: 0L).toString(), (hrgnupdate?.value ?: 0L).toString(), flags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun releaseDC(hwnd: Hwnd, hdc: Hdc): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_releaseDC((hwnd?.value ?: 0L).toString(), (hdc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeFontMemResourceEx(h: Handle): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_removeFontMemResourceEx((h?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeFontResourceA(lpfilename: Pcstr): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_removeFontResourceA((lpfilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeFontResourceExA(name: Pcstr, fl: UInt, pdv: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_removeFontResourceExA((name?.value ?: 0L).toString(), fl.toInt(), (pdv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeFontResourceExW(name: Pcwstr, fl: UInt, pdv: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_removeFontResourceExW((name?.value ?: 0L).toString(), fl.toInt(), (pdv?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun removeFontResourceW(lpfilename: Pcwstr): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_removeFontResourceW((lpfilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resetDCA(hdc: Hdc, lpdm: COpaquePointer?): Hdc =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_resetDCA((hdc?.value ?: 0L).toString(), (lpdm?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resetDCW(hdc: Hdc, lpdm: COpaquePointer?): Hdc =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_resetDCW((hdc?.value ?: 0L).toString(), (lpdm?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun resizePalette(hpal: Hpalette, n: UInt): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_resizePalette((hpal?.value ?: 0L).toString(), n.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun restoreDC(hdc: Hdc, nsaveddc: Int): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_restoreDC((hdc?.value ?: 0L).toString(), nsaveddc) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun roundRect(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int, width: Int, height: Int): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_roundRect((hdc?.value ?: 0L).toString(), left, top, right, bottom, width, height) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun saveDC(hdc: Hdc): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_saveDC((hdc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scaleViewportExtEx(hdc: Hdc, xn: Int, dx: Int, yn: Int, yd: Int, lpsz: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_scaleViewportExtEx((hdc?.value ?: 0L).toString(), xn, dx, yn, yd, (lpsz?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun scaleWindowExtEx(hdc: Hdc, xn: Int, xd: Int, yn: Int, yd: Int, lpsz: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_scaleWindowExtEx((hdc?.value ?: 0L).toString(), xn, xd, yn, yd, (lpsz?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun screenToClient(hwnd: Hwnd, lppoint: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_screenToClient((hwnd?.value ?: 0L).toString(), (lppoint?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun selectClipPath(hdc: Hdc, mode: RgnCombineMode): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_selectClipPath((hdc?.value ?: 0L).toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun selectClipRgn(hdc: Hdc, hrgn: Hrgn): GdiRegionType =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_selectClipRgn((hdc?.value ?: 0L).toString(), (hrgn?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun selectObject(hdc: Hdc, h: Hgdiobj): Hgdiobj =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_selectObject((hdc?.value ?: 0L).toString(), (h?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun selectPalette(hdc: Hdc, hpal: Hpalette, bforcebkgd: Bool): Hpalette =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_selectPalette((hdc?.value ?: 0L).toString(), (hpal?.value ?: 0L).toString(), bforcebkgd) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setArcDirection(hdc: Hdc, dir: ArcDirection): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setArcDirection((hdc?.value ?: 0L).toString(), dir) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setBitmapBits(hbm: Hbitmap, cb: UInt, pvbits: COpaquePointer?): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setBitmapBits((hbm?.value ?: 0L).toString(), cb.toInt(), (pvbits?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setBitmapDimensionEx(hbm: Hbitmap, w: Int, h: Int, lpsz: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setBitmapDimensionEx((hbm?.value ?: 0L).toString(), w, h, (lpsz?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setBkColor(hdc: Hdc, color: Colorref): Colorref =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setBkColor((hdc?.value ?: 0L).toString(), color.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setBkMode(hdc: Hdc, mode: Int): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setBkMode((hdc?.value ?: 0L).toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setBoundsRect(hdc: Hdc, lprect: COpaquePointer?, flags: SetBoundsRectFlags): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setBoundsRect((hdc?.value ?: 0L).toString(), (lprect?.value ?: 0L).toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setBrushOrgEx(hdc: Hdc, x: Int, y: Int, lppt: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setBrushOrgEx((hdc?.value ?: 0L).toString(), x, y, (lppt?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setColorAdjustment(hdc: Hdc, lpca: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setColorAdjustment((hdc?.value ?: 0L).toString(), (lpca?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDCBrushColor(hdc: Hdc, color: Colorref): Colorref =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setDCBrushColor((hdc?.value ?: 0L).toString(), color.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDCPenColor(hdc: Hdc, color: Colorref): Colorref =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setDCPenColor((hdc?.value ?: 0L).toString(), color.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDIBColorTable(hdc: Hdc, istart: UInt, centries: UInt, prgbq: COpaquePointer?): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setDIBColorTable((hdc?.value ?: 0L).toString(), istart.toInt(), centries.toInt(), (prgbq?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDIBits(hdc: Hdc, hbm: Hbitmap, start: UInt, clines: UInt, lpbits: COpaquePointer?, lpbmi: COpaquePointer?, coloruse: DibUsage): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setDIBits((hdc?.value ?: 0L).toString(), (hbm?.value ?: 0L).toString(), start.toInt(), clines.toInt(), (lpbits?.value ?: 0L).toString(), (lpbmi?.value ?: 0L).toString(), coloruse.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDIBitsToDevice(hdc: Hdc, xdest: Int, ydest: Int, w: UInt, h: UInt, xsrc: Int, ysrc: Int, startscan: UInt, clines: UInt, lpvbits: COpaquePointer?, lpbmi: COpaquePointer?, coloruse: DibUsage): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setDIBitsToDevice((hdc?.value ?: 0L).toString(), xdest, ydest, w.toInt(), h.toInt(), xsrc, ysrc, startscan.toInt(), clines.toInt(), (lpvbits?.value ?: 0L).toString(), (lpbmi?.value ?: 0L).toString(), coloruse.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setEnhMetaFileBits(nsize: UInt, pb: COpaquePointer?): Henhmetafile =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setEnhMetaFileBits(nsize.toInt(), (pb?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setGraphicsMode(hdc: Hdc, imode: GraphicsMode): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setGraphicsMode((hdc?.value ?: 0L).toString(), imode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setLayout(hdc: Hdc, l: DcLayout): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setLayout((hdc?.value ?: 0L).toString(), l.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMapMode(hdc: Hdc, imode: HdcMapMode): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setMapMode((hdc?.value ?: 0L).toString(), imode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMapperFlags(hdc: Hdc, flags: UInt): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setMapperFlags((hdc?.value ?: 0L).toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMetaFileBitsEx(cbbuffer: UInt, lpdata: COpaquePointer?): Hmetafile =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setMetaFileBitsEx(cbbuffer.toInt(), (lpdata?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMetaRgn(hdc: Hdc): GdiRegionType =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setMetaRgn((hdc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setMiterLimit(hdc: Hdc, limit: Float, old: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setMiterLimit((hdc?.value ?: 0L).toString(), limit.toDouble(), (old?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPaletteEntries(hpal: Hpalette, istart: UInt, centries: UInt, ppalentries: COpaquePointer?): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setPaletteEntries((hpal?.value ?: 0L).toString(), istart.toInt(), centries.toInt(), (ppalentries?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPixel(hdc: Hdc, x: Int, y: Int, color: Colorref): Colorref =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setPixel((hdc?.value ?: 0L).toString(), x, y, color.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPixelV(hdc: Hdc, x: Int, y: Int, color: Colorref): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setPixelV((hdc?.value ?: 0L).toString(), x, y, color.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setPolyFillMode(hdc: Hdc, mode: CreatePolygonRgnMode): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setPolyFillMode((hdc?.value ?: 0L).toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setROP2(hdc: Hdc, rop2: R2Mode): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setROP2((hdc?.value ?: 0L).toString(), rop2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setRect(lprc: COpaquePointer?, xleft: Int, ytop: Int, xright: Int, ybottom: Int): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setRect((lprc?.value ?: 0L).toString(), xleft, ytop, xright, ybottom) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setRectEmpty(lprc: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setRectEmpty((lprc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setRectRgn(hrgn: Hrgn, left: Int, top: Int, right: Int, bottom: Int): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setRectRgn((hrgn?.value ?: 0L).toString(), left, top, right, bottom) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setStretchBltMode(hdc: Hdc, mode: StretchBltMode): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setStretchBltMode((hdc?.value ?: 0L).toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSysColors(celements: Int, lpaelements: COpaquePointer?, lpargbvalues: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setSysColors(celements, (lpaelements?.value ?: 0L).toString(), (lpargbvalues?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setSystemPaletteUse(hdc: Hdc, use: SystemPaletteUse): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setSystemPaletteUse((hdc?.value ?: 0L).toString(), use.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTextAlign(hdc: Hdc, align: TextAlignOptions): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setTextAlign((hdc?.value ?: 0L).toString(), align.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTextCharacterExtra(hdc: Hdc, extra: Int): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setTextCharacterExtra((hdc?.value ?: 0L).toString(), extra) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTextColor(hdc: Hdc, color: Colorref): Colorref =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setTextColor((hdc?.value ?: 0L).toString(), color.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setTextJustification(hdc: Hdc, extra: Int, count: Int): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setTextJustification((hdc?.value ?: 0L).toString(), extra, count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setViewportExtEx(hdc: Hdc, x: Int, y: Int, lpsz: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setViewportExtEx((hdc?.value ?: 0L).toString(), x, y, (lpsz?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setViewportOrgEx(hdc: Hdc, x: Int, y: Int, lppt: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setViewportOrgEx((hdc?.value ?: 0L).toString(), x, y, (lppt?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowExtEx(hdc: Hdc, x: Int, y: Int, lpsz: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setWindowExtEx((hdc?.value ?: 0L).toString(), x, y, (lpsz?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowOrgEx(hdc: Hdc, x: Int, y: Int, lppt: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setWindowOrgEx((hdc?.value ?: 0L).toString(), x, y, (lppt?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWindowRgn(hwnd: Hwnd, hrgn: Hrgn, bredraw: Bool): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setWindowRgn((hwnd?.value ?: 0L).toString(), (hrgn?.value ?: 0L).toString(), bredraw) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setWorldTransform(hdc: Hdc, lpxf: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_setWorldTransform((hdc?.value ?: 0L).toString(), (lpxf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stretchBlt(hdcdest: Hdc, xdest: Int, ydest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xsrc: Int, ysrc: Int, wsrc: Int, hsrc: Int, rop: RopCode): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_stretchBlt((hdcdest?.value ?: 0L).toString(), xdest, ydest, wdest, hdest, (hdcsrc?.value ?: 0L).toString(), xsrc, ysrc, wsrc, hsrc, rop.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun stretchDIBits(hdc: Hdc, xdest: Int, ydest: Int, destwidth: Int, destheight: Int, xsrc: Int, ysrc: Int, srcwidth: Int, srcheight: Int, lpbits: COpaquePointer?, lpbmi: COpaquePointer?, iusage: DibUsage, rop: RopCode): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_stretchDIBits((hdc?.value ?: 0L).toString(), xdest, ydest, destwidth, destheight, xsrc, ysrc, srcwidth, srcheight, (lpbits?.value ?: 0L).toString(), (lpbmi?.value ?: 0L).toString(), iusage.toInt(), rop.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strokeAndFillPath(hdc: Hdc): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_strokeAndFillPath((hdc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun strokePath(hdc: Hdc): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_strokePath((hdc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun subtractRect(lprcdst: COpaquePointer?, lprcsrc1: COpaquePointer?, lprcsrc2: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_subtractRect((lprcdst?.value ?: 0L).toString(), (lprcsrc1?.value ?: 0L).toString(), (lprcsrc2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTCharToUnicode(hdc: Hdc, puccharcodes: COpaquePointer?, ulcharcodesize: UInt, pusshortcodes: COpaquePointer?, ulshortcodesize: UInt, ulflags: UInt): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_tTCharToUnicode((hdc?.value ?: 0L).toString(), (puccharcodes?.value ?: 0L).toString(), ulcharcodesize.toInt(), (pusshortcodes?.value ?: 0L).toString(), ulshortcodesize.toInt(), ulflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTDeleteEmbeddedFont(hfontreference: Handle, ulflags: UInt, pulstatus: COpaquePointer?): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_tTDeleteEmbeddedFont((hfontreference?.value ?: 0L).toString(), ulflags.toInt(), (pulstatus?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTEmbedFont(hdc: Hdc, ulflags: TtembedFlags, ulcharset: EmbedFontCharset, pulprivstatus: COpaquePointer?, pulstatus: COpaquePointer?, lpfnwritetostream: Writeembedproc, lpvwritestream: COpaquePointer?, puscharcodeset: COpaquePointer?, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: COpaquePointer?): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_tTEmbedFont((hdc?.value ?: 0L).toString(), ulflags.toInt(), ulcharset.toInt(), (pulprivstatus?.value ?: 0L).toString(), (pulstatus?.value ?: 0L).toString(), 0L.toString(), (lpvwritestream?.value ?: 0L).toString(), (puscharcodeset?.value ?: 0L).toString(), uscharcodecount.toInt(), uslanguage.toInt(), (pttembedinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTEmbedFontEx(hdc: Hdc, ulflags: TtembedFlags, ulcharset: EmbedFontCharset, pulprivstatus: COpaquePointer?, pulstatus: COpaquePointer?, lpfnwritetostream: Writeembedproc, lpvwritestream: COpaquePointer?, pulcharcodeset: COpaquePointer?, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: COpaquePointer?): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_tTEmbedFontEx((hdc?.value ?: 0L).toString(), ulflags.toInt(), ulcharset.toInt(), (pulprivstatus?.value ?: 0L).toString(), (pulstatus?.value ?: 0L).toString(), 0L.toString(), (lpvwritestream?.value ?: 0L).toString(), (pulcharcodeset?.value ?: 0L).toString(), uscharcodecount.toInt(), uslanguage.toInt(), (pttembedinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTEmbedFontFromFileA(hdc: Hdc, szfontfilename: Pcstr, usttcindex: UShort, ulflags: TtembedFlags, ulcharset: EmbedFontCharset, pulprivstatus: COpaquePointer?, pulstatus: COpaquePointer?, lpfnwritetostream: Writeembedproc, lpvwritestream: COpaquePointer?, puscharcodeset: COpaquePointer?, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: COpaquePointer?): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_tTEmbedFontFromFileA((hdc?.value ?: 0L).toString(), (szfontfilename?.value ?: 0L).toString(), usttcindex.toInt(), ulflags.toInt(), ulcharset.toInt(), (pulprivstatus?.value ?: 0L).toString(), (pulstatus?.value ?: 0L).toString(), 0L.toString(), (lpvwritestream?.value ?: 0L).toString(), (puscharcodeset?.value ?: 0L).toString(), uscharcodecount.toInt(), uslanguage.toInt(), (pttembedinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTEnableEmbeddingForFacename(lpszfacename: Pcstr, benable: Bool): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_tTEnableEmbeddingForFacename((lpszfacename?.value ?: 0L).toString(), benable) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTGetEmbeddedFontInfo(ulflags: TtembedFlags, pulprivstatus: COpaquePointer?, ulprivs: FontLicensePrivs, pulstatus: COpaquePointer?, lpfnreadfromstream: Readembedproc, lpvreadstream: COpaquePointer?, pttloadinfo: COpaquePointer?): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_tTGetEmbeddedFontInfo(ulflags.toInt(), (pulprivstatus?.value ?: 0L).toString(), ulprivs.toInt(), (pulstatus?.value ?: 0L).toString(), 0L.toString(), (lpvreadstream?.value ?: 0L).toString(), (pttloadinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTGetEmbeddingType(hdc: Hdc, pulembedtype: COpaquePointer?): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_tTGetEmbeddingType((hdc?.value ?: 0L).toString(), (pulembedtype?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTGetNewFontName(phfontreference: COpaquePointer?, wzwinfamilyname: Pwstr, cchmaxwinname: Int, szmacfamilyname: Pstr, cchmaxmacname: Int): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_tTGetNewFontName((phfontreference?.value ?: 0L).toString(), (wzwinfamilyname?.value ?: 0L).toString(), cchmaxwinname, (szmacfamilyname?.value ?: 0L).toString(), cchmaxmacname) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTIsEmbeddingEnabled(hdc: Hdc, pbenabled: COpaquePointer?): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_tTIsEmbeddingEnabled((hdc?.value ?: 0L).toString(), (pbenabled?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTIsEmbeddingEnabledForFacename(lpszfacename: Pcstr, pbenabled: COpaquePointer?): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_tTIsEmbeddingEnabledForFacename((lpszfacename?.value ?: 0L).toString(), (pbenabled?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTLoadEmbeddedFont(phfontreference: COpaquePointer?, ulflags: UInt, pulprivstatus: COpaquePointer?, ulprivs: FontLicensePrivs, pulstatus: COpaquePointer?, lpfnreadfromstream: Readembedproc, lpvreadstream: COpaquePointer?, szwinfamilyname: Pcwstr, szmacfamilyname: Pcstr, pttloadinfo: COpaquePointer?): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_tTLoadEmbeddedFont((phfontreference?.value ?: 0L).toString(), ulflags.toInt(), (pulprivstatus?.value ?: 0L).toString(), ulprivs.toInt(), (pulstatus?.value ?: 0L).toString(), 0L.toString(), (lpvreadstream?.value ?: 0L).toString(), (szwinfamilyname?.value ?: 0L).toString(), (szmacfamilyname?.value ?: 0L).toString(), (pttloadinfo?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTRunValidationTests(hdc: Hdc, ptestparam: COpaquePointer?): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_tTRunValidationTests((hdc?.value ?: 0L).toString(), (ptestparam?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tTRunValidationTestsEx(hdc: Hdc, ptestparam: COpaquePointer?): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_tTRunValidationTestsEx((hdc?.value ?: 0L).toString(), (ptestparam?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tabbedTextOutA(hdc: Hdc, x: Int, y: Int, lpstring: Pcstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: COpaquePointer?, ntaborigin: Int): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_tabbedTextOutA((hdc?.value ?: 0L).toString(), x, y, (lpstring?.value ?: 0L).toString(), chcount, ntabpositions, (lpntabstoppositions?.value ?: 0L).toString(), ntaborigin) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun tabbedTextOutW(hdc: Hdc, x: Int, y: Int, lpstring: Pcwstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: COpaquePointer?, ntaborigin: Int): Int =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_tabbedTextOutW((hdc?.value ?: 0L).toString(), x, y, (lpstring?.value ?: 0L).toString(), chcount, ntabpositions, (lpntabstoppositions?.value ?: 0L).toString(), ntaborigin) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textOutA(hdc: Hdc, x: Int, y: Int, lpstring: Pcstr, c: Int): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_textOutA((hdc?.value ?: 0L).toString(), x, y, (lpstring?.value ?: 0L).toString(), c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun textOutW(hdc: Hdc, x: Int, y: Int, lpstring: Pcwstr, c: Int): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_textOutW((hdc?.value ?: 0L).toString(), x, y, (lpstring?.value ?: 0L).toString(), c) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun transparentBlt(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: UInt): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_transparentBlt((hdcdest?.value ?: 0L).toString(), xorigindest, yorigindest, wdest, hdest, (hdcsrc?.value ?: 0L).toString(), xoriginsrc, yoriginsrc, wsrc, hsrc, crtransparent.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unionRect(lprcdst: COpaquePointer?, lprcsrc1: COpaquePointer?, lprcsrc2: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_unionRect((lprcdst?.value ?: 0L).toString(), (lprcsrc1?.value ?: 0L).toString(), (lprcsrc2?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun unrealizeObject(h: Hgdiobj): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_unrealizeObject((h?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateColors(hdc: Hdc): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_updateColors((hdc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun updateWindow(hwnd: Hwnd): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_updateWindow((hwnd?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun validateRect(hwnd: Hwnd, lprect: COpaquePointer?): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_validateRect((hwnd?.value ?: 0L).toString(), (lprect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun validateRgn(hwnd: Hwnd, hrgn: Hrgn): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_validateRgn((hwnd?.value ?: 0L).toString(), (hrgn?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun widenPath(hdc: Hdc): Bool =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_widenPath((hdc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun windowFromDC(hdc: Hdc): Hwnd =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_windowFromDC((hdc?.value ?: 0L).toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun wglSwapMultipleBuffers(param0: UInt, param1: COpaquePointer?): UInt =
    if (_windowsWin32GraphicsGdiNapiAddon != null) (_windowsWin32GraphicsGdiNapiAddon.windowssys_windows_win32_graphics_gdi_wglSwapMultipleBuffers(param0.toInt(), (param1?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
