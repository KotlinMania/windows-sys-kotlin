@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Henhmetafile
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hmetafile
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hrgn
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon

private val _windowsWin32GraphicsGdiplusNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun gdipAddPathArc(path: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAddPathArc((path?.value ?: 0L).toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), startangle.toDouble(), sweepangle.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathArcI(path: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAddPathArcI((path?.value ?: 0L).toString(), x, y, width, height, startangle.toDouble(), sweepangle.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathBezier(path: COpaquePointer?, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAddPathBezier((path?.value ?: 0L).toString(), x1.toDouble(), y1.toDouble(), x2.toDouble(), y2.toDouble(), x3.toDouble(), y3.toDouble(), x4.toDouble(), y4.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathBezierI(path: COpaquePointer?, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAddPathBezierI((path?.value ?: 0L).toString(), x1, y1, x2, y2, x3, y3, x4, y4) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathBeziers(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAddPathBeziers((path?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathBeziersI(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAddPathBeziersI((path?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathClosedCurve(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAddPathClosedCurve((path?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathClosedCurve2(path: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAddPathClosedCurve2((path?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathClosedCurve2I(path: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAddPathClosedCurve2I((path?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathClosedCurveI(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAddPathClosedCurveI((path?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathCurve(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAddPathCurve((path?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathCurve2(path: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAddPathCurve2((path?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathCurve2I(path: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAddPathCurve2I((path?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathCurve3(path: COpaquePointer?, points: COpaquePointer?, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAddPathCurve3((path?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count, offset, numberofsegments, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathCurve3I(path: COpaquePointer?, points: COpaquePointer?, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAddPathCurve3I((path?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count, offset, numberofsegments, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathCurveI(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAddPathCurveI((path?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathEllipse(path: COpaquePointer?, x: Float, y: Float, width: Float, height: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAddPathEllipse((path?.value ?: 0L).toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathEllipseI(path: COpaquePointer?, x: Int, y: Int, width: Int, height: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAddPathEllipseI((path?.value ?: 0L).toString(), x, y, width, height) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathLine(path: COpaquePointer?, x1: Float, y1: Float, x2: Float, y2: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAddPathLine((path?.value ?: 0L).toString(), x1.toDouble(), y1.toDouble(), x2.toDouble(), y2.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathLine2(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAddPathLine2((path?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathLine2I(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAddPathLine2I((path?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathLineI(path: COpaquePointer?, x1: Int, y1: Int, x2: Int, y2: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAddPathLineI((path?.value ?: 0L).toString(), x1, y1, x2, y2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathPath(path: COpaquePointer?, addingpath: COpaquePointer?, connect: Bool): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAddPathPath((path?.value ?: 0L).toString(), (addingpath?.value ?: 0L).toString(), connect) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathPie(path: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAddPathPie((path?.value ?: 0L).toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), startangle.toDouble(), sweepangle.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathPieI(path: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAddPathPieI((path?.value ?: 0L).toString(), x, y, width, height, startangle.toDouble(), sweepangle.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathPolygon(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAddPathPolygon((path?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathPolygonI(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAddPathPolygonI((path?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathRectangle(path: COpaquePointer?, x: Float, y: Float, width: Float, height: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAddPathRectangle((path?.value ?: 0L).toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathRectangleI(path: COpaquePointer?, x: Int, y: Int, width: Int, height: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAddPathRectangleI((path?.value ?: 0L).toString(), x, y, width, height) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathRectangles(path: COpaquePointer?, rects: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAddPathRectangles((path?.value ?: 0L).toString(), (rects?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathRectanglesI(path: COpaquePointer?, rects: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAddPathRectanglesI((path?.value ?: 0L).toString(), (rects?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathString(path: COpaquePointer?, string: Pcwstr, length: Int, family: COpaquePointer?, style: Int, emsize: Float, layoutrect: COpaquePointer?, format: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAddPathString((path?.value ?: 0L).toString(), (string?.value ?: 0L).toString(), length, (family?.value ?: 0L).toString(), style, emsize.toDouble(), (layoutrect?.value ?: 0L).toString(), (format?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathStringI(path: COpaquePointer?, string: Pcwstr, length: Int, family: COpaquePointer?, style: Int, emsize: Float, layoutrect: COpaquePointer?, format: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAddPathStringI((path?.value ?: 0L).toString(), (string?.value ?: 0L).toString(), length, (family?.value ?: 0L).toString(), style, emsize.toDouble(), (layoutrect?.value ?: 0L).toString(), (format?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAlloc(size: ULong): COpaquePointer? =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipAlloc(size.toString()) as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBeginContainer(graphics: COpaquePointer?, dstrect: COpaquePointer?, srcrect: COpaquePointer?, unit: Unit, state: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipBeginContainer((graphics?.value ?: 0L).toString(), (dstrect?.value ?: 0L).toString(), (srcrect?.value ?: 0L).toString(), unit, (state?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBeginContainer2(graphics: COpaquePointer?, state: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipBeginContainer2((graphics?.value ?: 0L).toString(), (state?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBeginContainerI(graphics: COpaquePointer?, dstrect: COpaquePointer?, srcrect: COpaquePointer?, unit: Unit, state: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipBeginContainerI((graphics?.value ?: 0L).toString(), (dstrect?.value ?: 0L).toString(), (srcrect?.value ?: 0L).toString(), unit, (state?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapApplyEffect(bitmap: COpaquePointer?, effect: COpaquePointer?, roi: COpaquePointer?, useauxdata: Bool, auxdata: COpaquePointer?, auxdatasize: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipBitmapApplyEffect((bitmap?.value ?: 0L).toString(), (effect?.value ?: 0L).toString(), (roi?.value ?: 0L).toString(), useauxdata, (auxdata?.value ?: 0L).toString(), (auxdatasize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapConvertFormat(pinputbitmap: COpaquePointer?, format: Int, dithertype: DitherType, palettetype: PaletteType, palette: COpaquePointer?, alphathresholdpercent: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipBitmapConvertFormat((pinputbitmap?.value ?: 0L).toString(), format, dithertype, palettetype, (palette?.value ?: 0L).toString(), alphathresholdpercent.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapCreateApplyEffect(inputbitmaps: COpaquePointer?, numinputs: Int, effect: COpaquePointer?, roi: COpaquePointer?, outputrect: COpaquePointer?, outputbitmap: COpaquePointer?, useauxdata: Bool, auxdata: COpaquePointer?, auxdatasize: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipBitmapCreateApplyEffect((inputbitmaps?.value ?: 0L).toString(), numinputs, (effect?.value ?: 0L).toString(), (roi?.value ?: 0L).toString(), (outputrect?.value ?: 0L).toString(), (outputbitmap?.value ?: 0L).toString(), useauxdata, (auxdata?.value ?: 0L).toString(), (auxdatasize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapGetHistogram(bitmap: COpaquePointer?, format: HistogramFormat, numberofentries: UInt, channel0: COpaquePointer?, channel1: COpaquePointer?, channel2: COpaquePointer?, channel3: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipBitmapGetHistogram((bitmap?.value ?: 0L).toString(), format, numberofentries.toInt(), (channel0?.value ?: 0L).toString(), (channel1?.value ?: 0L).toString(), (channel2?.value ?: 0L).toString(), (channel3?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapGetHistogramSize(format: HistogramFormat, numberofentries: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipBitmapGetHistogramSize(format, (numberofentries?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapGetPixel(bitmap: COpaquePointer?, x: Int, y: Int, color: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipBitmapGetPixel((bitmap?.value ?: 0L).toString(), x, y, (color?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapLockBits(bitmap: COpaquePointer?, rect: COpaquePointer?, flags: UInt, format: Int, lockedbitmapdata: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipBitmapLockBits((bitmap?.value ?: 0L).toString(), (rect?.value ?: 0L).toString(), flags.toInt(), format, (lockedbitmapdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapSetPixel(bitmap: COpaquePointer?, x: Int, y: Int, color: UInt): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipBitmapSetPixel((bitmap?.value ?: 0L).toString(), x, y, color.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapSetResolution(bitmap: COpaquePointer?, xdpi: Float, ydpi: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipBitmapSetResolution((bitmap?.value ?: 0L).toString(), xdpi.toDouble(), ydpi.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapUnlockBits(bitmap: COpaquePointer?, lockedbitmapdata: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipBitmapUnlockBits((bitmap?.value ?: 0L).toString(), (lockedbitmapdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipClearPathMarkers(path: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipClearPathMarkers((path?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneBitmapArea(x: Float, y: Float, width: Float, height: Float, format: Int, srcbitmap: COpaquePointer?, dstbitmap: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCloneBitmapArea(x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), format, (srcbitmap?.value ?: 0L).toString(), (dstbitmap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneBitmapAreaI(x: Int, y: Int, width: Int, height: Int, format: Int, srcbitmap: COpaquePointer?, dstbitmap: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCloneBitmapAreaI(x, y, width, height, format, (srcbitmap?.value ?: 0L).toString(), (dstbitmap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneBrush(brush: COpaquePointer?, clonebrush: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCloneBrush((brush?.value ?: 0L).toString(), (clonebrush?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneCustomLineCap(customcap: COpaquePointer?, clonedcap: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCloneCustomLineCap((customcap?.value ?: 0L).toString(), (clonedcap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneFont(font: COpaquePointer?, clonefont: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCloneFont((font?.value ?: 0L).toString(), (clonefont?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneFontFamily(fontfamily: COpaquePointer?, clonedfontfamily: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCloneFontFamily((fontfamily?.value ?: 0L).toString(), (clonedfontfamily?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneImage(image: COpaquePointer?, cloneimage: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCloneImage((image?.value ?: 0L).toString(), (cloneimage?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneImageAttributes(imageattr: COpaquePointer?, cloneimageattr: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCloneImageAttributes((imageattr?.value ?: 0L).toString(), (cloneimageattr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneMatrix(matrix: COpaquePointer?, clonematrix: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCloneMatrix((matrix?.value ?: 0L).toString(), (clonematrix?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipClonePath(path: COpaquePointer?, clonepath: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipClonePath((path?.value ?: 0L).toString(), (clonepath?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipClonePen(pen: COpaquePointer?, clonepen: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipClonePen((pen?.value ?: 0L).toString(), (clonepen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneRegion(region: COpaquePointer?, cloneregion: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCloneRegion((region?.value ?: 0L).toString(), (cloneregion?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneStringFormat(format: COpaquePointer?, newformat: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCloneStringFormat((format?.value ?: 0L).toString(), (newformat?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipClosePathFigure(path: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipClosePathFigure((path?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipClosePathFigures(path: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipClosePathFigures((path?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCombineRegionPath(region: COpaquePointer?, path: COpaquePointer?, combinemode: CombineMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCombineRegionPath((region?.value ?: 0L).toString(), (path?.value ?: 0L).toString(), combinemode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCombineRegionRect(region: COpaquePointer?, rect: COpaquePointer?, combinemode: CombineMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCombineRegionRect((region?.value ?: 0L).toString(), (rect?.value ?: 0L).toString(), combinemode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCombineRegionRectI(region: COpaquePointer?, rect: COpaquePointer?, combinemode: CombineMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCombineRegionRectI((region?.value ?: 0L).toString(), (rect?.value ?: 0L).toString(), combinemode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCombineRegionRegion(region: COpaquePointer?, region2: COpaquePointer?, combinemode: CombineMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCombineRegionRegion((region?.value ?: 0L).toString(), (region2?.value ?: 0L).toString(), combinemode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipComment(graphics: COpaquePointer?, sizedata: UInt, data: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipComment((graphics?.value ?: 0L).toString(), sizedata.toInt(), (data?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipConvertToEmfPlus(refgraphics: COpaquePointer?, metafile: COpaquePointer?, conversionfailureflag: COpaquePointer?, emftype: EmfType, description: Pcwstr, outMetafile: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipConvertToEmfPlus((refgraphics?.value ?: 0L).toString(), (metafile?.value ?: 0L).toString(), (conversionfailureflag?.value ?: 0L).toString(), emftype, (description?.value ?: 0L).toString(), (outMetafile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipConvertToEmfPlusToFile(refgraphics: COpaquePointer?, metafile: COpaquePointer?, conversionfailureflag: COpaquePointer?, filename: Pcwstr, emftype: EmfType, description: Pcwstr, outMetafile: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipConvertToEmfPlusToFile((refgraphics?.value ?: 0L).toString(), (metafile?.value ?: 0L).toString(), (conversionfailureflag?.value ?: 0L).toString(), (filename?.value ?: 0L).toString(), emftype, (description?.value ?: 0L).toString(), (outMetafile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipConvertToEmfPlusToStream(refgraphics: COpaquePointer?, metafile: COpaquePointer?, conversionfailureflag: COpaquePointer?, stream: COpaquePointer?, emftype: EmfType, description: Pcwstr, outMetafile: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipConvertToEmfPlusToStream((refgraphics?.value ?: 0L).toString(), (metafile?.value ?: 0L).toString(), (conversionfailureflag?.value ?: 0L).toString(), (stream?.value ?: 0L).toString(), emftype, (description?.value ?: 0L).toString(), (outMetafile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateAdjustableArrowCap(height: Float, width: Float, isfilled: Bool, cap: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateAdjustableArrowCap(height.toDouble(), width.toDouble(), isfilled, (cap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromFile(filename: Pcwstr, bitmap: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateBitmapFromFile((filename?.value ?: 0L).toString(), (bitmap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromFileICM(filename: Pcwstr, bitmap: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateBitmapFromFileICM((filename?.value ?: 0L).toString(), (bitmap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromGdiDib(gdibitmapinfo: COpaquePointer?, gdibitmapdata: COpaquePointer?, bitmap: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateBitmapFromGdiDib((gdibitmapinfo?.value ?: 0L).toString(), (gdibitmapdata?.value ?: 0L).toString(), (bitmap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromGraphics(width: Int, height: Int, target: COpaquePointer?, bitmap: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateBitmapFromGraphics(width, height, (target?.value ?: 0L).toString(), (bitmap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromHBITMAP(hbm: Hbitmap, hpal: Hpalette, bitmap: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateBitmapFromHBITMAP((hbm?.value ?: 0L).toString(), (hpal?.value ?: 0L).toString(), (bitmap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromHICON(hicon: Hicon, bitmap: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateBitmapFromHICON((hicon?.value ?: 0L).toString(), (bitmap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromResource(hinstance: Hinstance, lpbitmapname: Pcwstr, bitmap: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateBitmapFromResource((hinstance?.value ?: 0L).toString(), (lpbitmapname?.value ?: 0L).toString(), (bitmap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromScan0(width: Int, height: Int, stride: Int, format: Int, scan0: COpaquePointer?, bitmap: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateBitmapFromScan0(width, height, stride, format, (scan0?.value ?: 0L).toString(), (bitmap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromStream(stream: COpaquePointer?, bitmap: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateBitmapFromStream((stream?.value ?: 0L).toString(), (bitmap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromStreamICM(stream: COpaquePointer?, bitmap: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateBitmapFromStreamICM((stream?.value ?: 0L).toString(), (bitmap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateCachedBitmap(bitmap: COpaquePointer?, graphics: COpaquePointer?, cachedbitmap: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateCachedBitmap((bitmap?.value ?: 0L).toString(), (graphics?.value ?: 0L).toString(), (cachedbitmap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateCustomLineCap(fillpath: COpaquePointer?, strokepath: COpaquePointer?, basecap: LineCap, baseinset: Float, customcap: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateCustomLineCap((fillpath?.value ?: 0L).toString(), (strokepath?.value ?: 0L).toString(), basecap, baseinset.toDouble(), (customcap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateEffect(guid: Guid, effect: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFont(fontfamily: COpaquePointer?, emsize: Float, style: Int, unit: Unit, font: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateFont((fontfamily?.value ?: 0L).toString(), emsize.toDouble(), style, unit, (font?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFontFamilyFromName(name: Pcwstr, fontcollection: COpaquePointer?, fontfamily: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateFontFamilyFromName((name?.value ?: 0L).toString(), (fontcollection?.value ?: 0L).toString(), (fontfamily?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFontFromDC(hdc: Hdc, font: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateFontFromDC((hdc?.value ?: 0L).toString(), (font?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFontFromLogfontA(hdc: Hdc, logfont: COpaquePointer?, font: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateFontFromLogfontA((hdc?.value ?: 0L).toString(), (logfont?.value ?: 0L).toString(), (font?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFontFromLogfontW(hdc: Hdc, logfont: COpaquePointer?, font: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateFontFromLogfontW((hdc?.value ?: 0L).toString(), (logfont?.value ?: 0L).toString(), (font?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFromHDC(hdc: Hdc, graphics: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateFromHDC((hdc?.value ?: 0L).toString(), (graphics?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFromHDC2(hdc: Hdc, hdevice: Handle, graphics: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateFromHDC2((hdc?.value ?: 0L).toString(), (hdevice?.value ?: 0L).toString(), (graphics?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFromHWND(hwnd: Hwnd, graphics: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateFromHWND((hwnd?.value ?: 0L).toString(), (graphics?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFromHWNDICM(hwnd: Hwnd, graphics: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateFromHWNDICM((hwnd?.value ?: 0L).toString(), (graphics?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateHBITMAPFromBitmap(bitmap: COpaquePointer?, hbmreturn: COpaquePointer?, background: UInt): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateHBITMAPFromBitmap((bitmap?.value ?: 0L).toString(), (hbmreturn?.value ?: 0L).toString(), background.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateHICONFromBitmap(bitmap: COpaquePointer?, hbmreturn: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateHICONFromBitmap((bitmap?.value ?: 0L).toString(), (hbmreturn?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateHalftonePalette(): Hpalette =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateHalftonePalette() as String).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateHatchBrush(hatchstyle: HatchStyle, forecol: UInt, backcol: UInt, brush: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateHatchBrush(hatchstyle, forecol.toInt(), backcol.toInt(), (brush?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateImageAttributes(imageattr: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateImageAttributes((imageattr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateLineBrush(point1: COpaquePointer?, point2: COpaquePointer?, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateLineBrush((point1?.value ?: 0L).toString(), (point2?.value ?: 0L).toString(), color1.toInt(), color2.toInt(), wrapmode, (linegradient?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateLineBrushFromRect(rect: COpaquePointer?, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateLineBrushFromRect((rect?.value ?: 0L).toString(), color1.toInt(), color2.toInt(), mode, wrapmode, (linegradient?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateLineBrushFromRectI(rect: COpaquePointer?, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateLineBrushFromRectI((rect?.value ?: 0L).toString(), color1.toInt(), color2.toInt(), mode, wrapmode, (linegradient?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateLineBrushFromRectWithAngle(rect: COpaquePointer?, color1: UInt, color2: UInt, angle: Float, isanglescalable: Bool, wrapmode: WrapMode, linegradient: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateLineBrushFromRectWithAngle((rect?.value ?: 0L).toString(), color1.toInt(), color2.toInt(), angle.toDouble(), isanglescalable, wrapmode, (linegradient?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateLineBrushFromRectWithAngleI(rect: COpaquePointer?, color1: UInt, color2: UInt, angle: Float, isanglescalable: Bool, wrapmode: WrapMode, linegradient: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateLineBrushFromRectWithAngleI((rect?.value ?: 0L).toString(), color1.toInt(), color2.toInt(), angle.toDouble(), isanglescalable, wrapmode, (linegradient?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateLineBrushI(point1: COpaquePointer?, point2: COpaquePointer?, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateLineBrushI((point1?.value ?: 0L).toString(), (point2?.value ?: 0L).toString(), color1.toInt(), color2.toInt(), wrapmode, (linegradient?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMatrix(matrix: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateMatrix((matrix?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMatrix2(m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float, matrix: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateMatrix2(m11.toDouble(), m12.toDouble(), m21.toDouble(), m22.toDouble(), dx.toDouble(), dy.toDouble(), (matrix?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMatrix3(rect: COpaquePointer?, dstplg: COpaquePointer?, matrix: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateMatrix3((rect?.value ?: 0L).toString(), (dstplg?.value ?: 0L).toString(), (matrix?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMatrix3I(rect: COpaquePointer?, dstplg: COpaquePointer?, matrix: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateMatrix3I((rect?.value ?: 0L).toString(), (dstplg?.value ?: 0L).toString(), (matrix?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMetafileFromEmf(hemf: Henhmetafile, deleteemf: Bool, metafile: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateMetafileFromEmf((hemf?.value ?: 0L).toString(), deleteemf, (metafile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMetafileFromFile(file: Pcwstr, metafile: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateMetafileFromFile((file?.value ?: 0L).toString(), (metafile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMetafileFromStream(stream: COpaquePointer?, metafile: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateMetafileFromStream((stream?.value ?: 0L).toString(), (metafile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMetafileFromWmf(hwmf: Hmetafile, deletewmf: Bool, wmfplaceablefileheader: COpaquePointer?, metafile: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateMetafileFromWmf((hwmf?.value ?: 0L).toString(), deletewmf, (wmfplaceablefileheader?.value ?: 0L).toString(), (metafile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMetafileFromWmfFile(file: Pcwstr, wmfplaceablefileheader: COpaquePointer?, metafile: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateMetafileFromWmfFile((file?.value ?: 0L).toString(), (wmfplaceablefileheader?.value ?: 0L).toString(), (metafile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePath(brushmode: FillMode, path: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreatePath(brushmode, (path?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePath2(param0: COpaquePointer?, param1: COpaquePointer?, param2: Int, param3: FillMode, path: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreatePath2((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), param2, param3, (path?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePath2I(param0: COpaquePointer?, param1: COpaquePointer?, param2: Int, param3: FillMode, path: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreatePath2I((param0?.value ?: 0L).toString(), (param1?.value ?: 0L).toString(), param2, param3, (path?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePathGradient(points: COpaquePointer?, count: Int, wrapmode: WrapMode, polygradient: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreatePathGradient((points?.value ?: 0L).toString(), count, wrapmode, (polygradient?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePathGradientFromPath(path: COpaquePointer?, polygradient: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreatePathGradientFromPath((path?.value ?: 0L).toString(), (polygradient?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePathGradientI(points: COpaquePointer?, count: Int, wrapmode: WrapMode, polygradient: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreatePathGradientI((points?.value ?: 0L).toString(), count, wrapmode, (polygradient?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePathIter(iterator: COpaquePointer?, path: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreatePathIter((iterator?.value ?: 0L).toString(), (path?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePen1(color: UInt, width: Float, unit: Unit, pen: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreatePen1(color.toInt(), width.toDouble(), unit, (pen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePen2(brush: COpaquePointer?, width: Float, unit: Unit, pen: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreatePen2((brush?.value ?: 0L).toString(), width.toDouble(), unit, (pen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateRegion(region: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateRegion((region?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateRegionHrgn(hrgn: Hrgn, region: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateRegionHrgn((hrgn?.value ?: 0L).toString(), (region?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateRegionPath(path: COpaquePointer?, region: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateRegionPath((path?.value ?: 0L).toString(), (region?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateRegionRect(rect: COpaquePointer?, region: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateRegionRect((rect?.value ?: 0L).toString(), (region?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateRegionRectI(rect: COpaquePointer?, region: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateRegionRectI((rect?.value ?: 0L).toString(), (region?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateRegionRgnData(regiondata: COpaquePointer?, size: Int, region: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateRegionRgnData((regiondata?.value ?: 0L).toString(), size, (region?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateSolidFill(color: UInt, brush: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateSolidFill(color.toInt(), (brush?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateStreamOnFile(filename: Pcwstr, access: UInt, stream: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateStreamOnFile((filename?.value ?: 0L).toString(), access.toInt(), (stream?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateStringFormat(formatattributes: Int, language: UShort, format: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateStringFormat(formatattributes, language.toInt(), (format?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateTexture(image: COpaquePointer?, wrapmode: WrapMode, texture: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateTexture((image?.value ?: 0L).toString(), wrapmode, (texture?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateTexture2(image: COpaquePointer?, wrapmode: WrapMode, x: Float, y: Float, width: Float, height: Float, texture: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateTexture2((image?.value ?: 0L).toString(), wrapmode, x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), (texture?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateTexture2I(image: COpaquePointer?, wrapmode: WrapMode, x: Int, y: Int, width: Int, height: Int, texture: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateTexture2I((image?.value ?: 0L).toString(), wrapmode, x, y, width, height, (texture?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateTextureIA(image: COpaquePointer?, imageattributes: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, texture: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateTextureIA((image?.value ?: 0L).toString(), (imageattributes?.value ?: 0L).toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), (texture?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateTextureIAI(image: COpaquePointer?, imageattributes: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, texture: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipCreateTextureIAI((image?.value ?: 0L).toString(), (imageattributes?.value ?: 0L).toString(), x, y, width, height, (texture?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteBrush(brush: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDeleteBrush((brush?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteCachedBitmap(cachedbitmap: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDeleteCachedBitmap((cachedbitmap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteCustomLineCap(customcap: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDeleteCustomLineCap((customcap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteEffect(effect: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDeleteEffect((effect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteFont(font: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDeleteFont((font?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteFontFamily(fontfamily: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDeleteFontFamily((fontfamily?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteGraphics(graphics: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDeleteGraphics((graphics?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteMatrix(matrix: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDeleteMatrix((matrix?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeletePath(path: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDeletePath((path?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeletePathIter(iterator: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDeletePathIter((iterator?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeletePen(pen: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDeletePen((pen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeletePrivateFontCollection(fontcollection: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDeletePrivateFontCollection((fontcollection?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteRegion(region: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDeleteRegion((region?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteStringFormat(format: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDeleteStringFormat((format?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDisposeImage(image: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDisposeImage((image?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDisposeImageAttributes(imageattr: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDisposeImageAttributes((imageattr?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawArc(graphics: COpaquePointer?, pen: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawArc((graphics?.value ?: 0L).toString(), (pen?.value ?: 0L).toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), startangle.toDouble(), sweepangle.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawArcI(graphics: COpaquePointer?, pen: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawArcI((graphics?.value ?: 0L).toString(), (pen?.value ?: 0L).toString(), x, y, width, height, startangle.toDouble(), sweepangle.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawBezier(graphics: COpaquePointer?, pen: COpaquePointer?, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawBezier((graphics?.value ?: 0L).toString(), (pen?.value ?: 0L).toString(), x1.toDouble(), y1.toDouble(), x2.toDouble(), y2.toDouble(), x3.toDouble(), y3.toDouble(), x4.toDouble(), y4.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawBezierI(graphics: COpaquePointer?, pen: COpaquePointer?, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawBezierI((graphics?.value ?: 0L).toString(), (pen?.value ?: 0L).toString(), x1, y1, x2, y2, x3, y3, x4, y4) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawBeziers(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawBeziers((graphics?.value ?: 0L).toString(), (pen?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawBeziersI(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawBeziersI((graphics?.value ?: 0L).toString(), (pen?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawCachedBitmap(graphics: COpaquePointer?, cachedbitmap: COpaquePointer?, x: Int, y: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawCachedBitmap((graphics?.value ?: 0L).toString(), (cachedbitmap?.value ?: 0L).toString(), x, y) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawClosedCurve(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawClosedCurve((graphics?.value ?: 0L).toString(), (pen?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawClosedCurve2(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawClosedCurve2((graphics?.value ?: 0L).toString(), (pen?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawClosedCurve2I(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawClosedCurve2I((graphics?.value ?: 0L).toString(), (pen?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawClosedCurveI(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawClosedCurveI((graphics?.value ?: 0L).toString(), (pen?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawCurve(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawCurve((graphics?.value ?: 0L).toString(), (pen?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawCurve2(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawCurve2((graphics?.value ?: 0L).toString(), (pen?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawCurve2I(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawCurve2I((graphics?.value ?: 0L).toString(), (pen?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawCurve3(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawCurve3((graphics?.value ?: 0L).toString(), (pen?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count, offset, numberofsegments, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawCurve3I(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawCurve3I((graphics?.value ?: 0L).toString(), (pen?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count, offset, numberofsegments, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawCurveI(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawCurveI((graphics?.value ?: 0L).toString(), (pen?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawDriverString(graphics: COpaquePointer?, text: COpaquePointer?, length: Int, font: COpaquePointer?, brush: COpaquePointer?, positions: COpaquePointer?, flags: Int, matrix: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawDriverString((graphics?.value ?: 0L).toString(), (text?.value ?: 0L).toString(), length, (font?.value ?: 0L).toString(), (brush?.value ?: 0L).toString(), (positions?.value ?: 0L).toString(), flags, (matrix?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawEllipse(graphics: COpaquePointer?, pen: COpaquePointer?, x: Float, y: Float, width: Float, height: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawEllipse((graphics?.value ?: 0L).toString(), (pen?.value ?: 0L).toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawEllipseI(graphics: COpaquePointer?, pen: COpaquePointer?, x: Int, y: Int, width: Int, height: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawEllipseI((graphics?.value ?: 0L).toString(), (pen?.value ?: 0L).toString(), x, y, width, height) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImage(graphics: COpaquePointer?, image: COpaquePointer?, x: Float, y: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawImage((graphics?.value ?: 0L).toString(), (image?.value ?: 0L).toString(), x.toDouble(), y.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImageFX(graphics: COpaquePointer?, image: COpaquePointer?, source: COpaquePointer?, xform: COpaquePointer?, effect: COpaquePointer?, imageattributes: COpaquePointer?, srcunit: Unit): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawImageFX((graphics?.value ?: 0L).toString(), (image?.value ?: 0L).toString(), (source?.value ?: 0L).toString(), (xform?.value ?: 0L).toString(), (effect?.value ?: 0L).toString(), (imageattributes?.value ?: 0L).toString(), srcunit) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImageI(graphics: COpaquePointer?, image: COpaquePointer?, x: Int, y: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawImageI((graphics?.value ?: 0L).toString(), (image?.value ?: 0L).toString(), x, y) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImagePointRect(graphics: COpaquePointer?, image: COpaquePointer?, x: Float, y: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawImagePointRect((graphics?.value ?: 0L).toString(), (image?.value ?: 0L).toString(), x.toDouble(), y.toDouble(), srcx.toDouble(), srcy.toDouble(), srcwidth.toDouble(), srcheight.toDouble(), srcunit) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImagePointRectI(graphics: COpaquePointer?, image: COpaquePointer?, x: Int, y: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawImagePointRectI((graphics?.value ?: 0L).toString(), (image?.value ?: 0L).toString(), x, y, srcx, srcy, srcwidth, srcheight, srcunit) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImagePoints(graphics: COpaquePointer?, image: COpaquePointer?, dstpoints: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawImagePoints((graphics?.value ?: 0L).toString(), (image?.value ?: 0L).toString(), (dstpoints?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImagePointsI(graphics: COpaquePointer?, image: COpaquePointer?, dstpoints: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawImagePointsI((graphics?.value ?: 0L).toString(), (image?.value ?: 0L).toString(), (dstpoints?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImagePointsRect(graphics: COpaquePointer?, image: COpaquePointer?, points: COpaquePointer?, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawImagePointsRect((graphics?.value ?: 0L).toString(), (image?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count, srcx.toDouble(), srcy.toDouble(), srcwidth.toDouble(), srcheight.toDouble(), srcunit, (imageattributes?.value ?: 0L).toString(), callback.toString(), (callbackdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImagePointsRectI(graphics: COpaquePointer?, image: COpaquePointer?, points: COpaquePointer?, count: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawImagePointsRectI((graphics?.value ?: 0L).toString(), (image?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count, srcx, srcy, srcwidth, srcheight, srcunit, (imageattributes?.value ?: 0L).toString(), callback.toString(), (callbackdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImageRect(graphics: COpaquePointer?, image: COpaquePointer?, x: Float, y: Float, width: Float, height: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawImageRect((graphics?.value ?: 0L).toString(), (image?.value ?: 0L).toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImageRectI(graphics: COpaquePointer?, image: COpaquePointer?, x: Int, y: Int, width: Int, height: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawImageRectI((graphics?.value ?: 0L).toString(), (image?.value ?: 0L).toString(), x, y, width, height) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImageRectRect(graphics: COpaquePointer?, image: COpaquePointer?, dstx: Float, dsty: Float, dstwidth: Float, dstheight: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawImageRectRect((graphics?.value ?: 0L).toString(), (image?.value ?: 0L).toString(), dstx.toDouble(), dsty.toDouble(), dstwidth.toDouble(), dstheight.toDouble(), srcx.toDouble(), srcy.toDouble(), srcwidth.toDouble(), srcheight.toDouble(), srcunit, (imageattributes?.value ?: 0L).toString(), callback.toString(), (callbackdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImageRectRectI(graphics: COpaquePointer?, image: COpaquePointer?, dstx: Int, dsty: Int, dstwidth: Int, dstheight: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawImageRectRectI((graphics?.value ?: 0L).toString(), (image?.value ?: 0L).toString(), dstx, dsty, dstwidth, dstheight, srcx, srcy, srcwidth, srcheight, srcunit, (imageattributes?.value ?: 0L).toString(), callback.toString(), (callbackdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawLine(graphics: COpaquePointer?, pen: COpaquePointer?, x1: Float, y1: Float, x2: Float, y2: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawLine((graphics?.value ?: 0L).toString(), (pen?.value ?: 0L).toString(), x1.toDouble(), y1.toDouble(), x2.toDouble(), y2.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawLineI(graphics: COpaquePointer?, pen: COpaquePointer?, x1: Int, y1: Int, x2: Int, y2: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawLineI((graphics?.value ?: 0L).toString(), (pen?.value ?: 0L).toString(), x1, y1, x2, y2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawLines(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawLines((graphics?.value ?: 0L).toString(), (pen?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawLinesI(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawLinesI((graphics?.value ?: 0L).toString(), (pen?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawPath(graphics: COpaquePointer?, pen: COpaquePointer?, path: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawPath((graphics?.value ?: 0L).toString(), (pen?.value ?: 0L).toString(), (path?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawPie(graphics: COpaquePointer?, pen: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawPie((graphics?.value ?: 0L).toString(), (pen?.value ?: 0L).toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), startangle.toDouble(), sweepangle.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawPieI(graphics: COpaquePointer?, pen: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawPieI((graphics?.value ?: 0L).toString(), (pen?.value ?: 0L).toString(), x, y, width, height, startangle.toDouble(), sweepangle.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawPolygon(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawPolygon((graphics?.value ?: 0L).toString(), (pen?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawPolygonI(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawPolygonI((graphics?.value ?: 0L).toString(), (pen?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawRectangle(graphics: COpaquePointer?, pen: COpaquePointer?, x: Float, y: Float, width: Float, height: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawRectangle((graphics?.value ?: 0L).toString(), (pen?.value ?: 0L).toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawRectangleI(graphics: COpaquePointer?, pen: COpaquePointer?, x: Int, y: Int, width: Int, height: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawRectangleI((graphics?.value ?: 0L).toString(), (pen?.value ?: 0L).toString(), x, y, width, height) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawRectangles(graphics: COpaquePointer?, pen: COpaquePointer?, rects: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawRectangles((graphics?.value ?: 0L).toString(), (pen?.value ?: 0L).toString(), (rects?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawRectanglesI(graphics: COpaquePointer?, pen: COpaquePointer?, rects: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawRectanglesI((graphics?.value ?: 0L).toString(), (pen?.value ?: 0L).toString(), (rects?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawString(graphics: COpaquePointer?, string: Pcwstr, length: Int, font: COpaquePointer?, layoutrect: COpaquePointer?, stringformat: COpaquePointer?, brush: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipDrawString((graphics?.value ?: 0L).toString(), (string?.value ?: 0L).toString(), length, (font?.value ?: 0L).toString(), (layoutrect?.value ?: 0L).toString(), (stringformat?.value ?: 0L).toString(), (brush?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEmfToWmfBits(hemf: Henhmetafile, cbdata16: UInt, pdata16: COpaquePointer?, imapmode: Int, eflags: Int): UInt =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipEmfToWmfBits((hemf?.value ?: 0L).toString(), cbdata16.toInt(), (pdata16?.value ?: 0L).toString(), imapmode, eflags) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEndContainer(graphics: COpaquePointer?, state: UInt): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipEndContainer((graphics?.value ?: 0L).toString(), state.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileDestPoint(graphics: COpaquePointer?, metafile: COpaquePointer?, destpoint: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileDestPoint((graphics?.value ?: 0L).toString(), (metafile?.value ?: 0L).toString(), (destpoint?.value ?: 0L).toString(), callback.toString(), (callbackdata?.value ?: 0L).toString(), (imageattributes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileDestPointI(graphics: COpaquePointer?, metafile: COpaquePointer?, destpoint: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileDestPointI((graphics?.value ?: 0L).toString(), (metafile?.value ?: 0L).toString(), (destpoint?.value ?: 0L).toString(), callback.toString(), (callbackdata?.value ?: 0L).toString(), (imageattributes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileDestPoints(graphics: COpaquePointer?, metafile: COpaquePointer?, destpoints: COpaquePointer?, count: Int, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileDestPoints((graphics?.value ?: 0L).toString(), (metafile?.value ?: 0L).toString(), (destpoints?.value ?: 0L).toString(), count, callback.toString(), (callbackdata?.value ?: 0L).toString(), (imageattributes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileDestPointsI(graphics: COpaquePointer?, metafile: COpaquePointer?, destpoints: COpaquePointer?, count: Int, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileDestPointsI((graphics?.value ?: 0L).toString(), (metafile?.value ?: 0L).toString(), (destpoints?.value ?: 0L).toString(), count, callback.toString(), (callbackdata?.value ?: 0L).toString(), (imageattributes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileDestRect(graphics: COpaquePointer?, metafile: COpaquePointer?, destrect: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileDestRect((graphics?.value ?: 0L).toString(), (metafile?.value ?: 0L).toString(), (destrect?.value ?: 0L).toString(), callback.toString(), (callbackdata?.value ?: 0L).toString(), (imageattributes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileDestRectI(graphics: COpaquePointer?, metafile: COpaquePointer?, destrect: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileDestRectI((graphics?.value ?: 0L).toString(), (metafile?.value ?: 0L).toString(), (destrect?.value ?: 0L).toString(), callback.toString(), (callbackdata?.value ?: 0L).toString(), (imageattributes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileSrcRectDestPoint(graphics: COpaquePointer?, metafile: COpaquePointer?, destpoint: COpaquePointer?, srcrect: COpaquePointer?, srcunit: Unit, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileSrcRectDestPoint((graphics?.value ?: 0L).toString(), (metafile?.value ?: 0L).toString(), (destpoint?.value ?: 0L).toString(), (srcrect?.value ?: 0L).toString(), srcunit, callback.toString(), (callbackdata?.value ?: 0L).toString(), (imageattributes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileSrcRectDestPointI(graphics: COpaquePointer?, metafile: COpaquePointer?, destpoint: COpaquePointer?, srcrect: COpaquePointer?, srcunit: Unit, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileSrcRectDestPointI((graphics?.value ?: 0L).toString(), (metafile?.value ?: 0L).toString(), (destpoint?.value ?: 0L).toString(), (srcrect?.value ?: 0L).toString(), srcunit, callback.toString(), (callbackdata?.value ?: 0L).toString(), (imageattributes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileSrcRectDestPoints(graphics: COpaquePointer?, metafile: COpaquePointer?, destpoints: COpaquePointer?, count: Int, srcrect: COpaquePointer?, srcunit: Unit, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileSrcRectDestPoints((graphics?.value ?: 0L).toString(), (metafile?.value ?: 0L).toString(), (destpoints?.value ?: 0L).toString(), count, (srcrect?.value ?: 0L).toString(), srcunit, callback.toString(), (callbackdata?.value ?: 0L).toString(), (imageattributes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileSrcRectDestPointsI(graphics: COpaquePointer?, metafile: COpaquePointer?, destpoints: COpaquePointer?, count: Int, srcrect: COpaquePointer?, srcunit: Unit, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileSrcRectDestPointsI((graphics?.value ?: 0L).toString(), (metafile?.value ?: 0L).toString(), (destpoints?.value ?: 0L).toString(), count, (srcrect?.value ?: 0L).toString(), srcunit, callback.toString(), (callbackdata?.value ?: 0L).toString(), (imageattributes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileSrcRectDestRect(graphics: COpaquePointer?, metafile: COpaquePointer?, destrect: COpaquePointer?, srcrect: COpaquePointer?, srcunit: Unit, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileSrcRectDestRect((graphics?.value ?: 0L).toString(), (metafile?.value ?: 0L).toString(), (destrect?.value ?: 0L).toString(), (srcrect?.value ?: 0L).toString(), srcunit, callback.toString(), (callbackdata?.value ?: 0L).toString(), (imageattributes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileSrcRectDestRectI(graphics: COpaquePointer?, metafile: COpaquePointer?, destrect: COpaquePointer?, srcrect: COpaquePointer?, srcunit: Unit, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileSrcRectDestRectI((graphics?.value ?: 0L).toString(), (metafile?.value ?: 0L).toString(), (destrect?.value ?: 0L).toString(), (srcrect?.value ?: 0L).toString(), srcunit, callback.toString(), (callbackdata?.value ?: 0L).toString(), (imageattributes?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillClosedCurve(graphics: COpaquePointer?, brush: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipFillClosedCurve((graphics?.value ?: 0L).toString(), (brush?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillClosedCurve2(graphics: COpaquePointer?, brush: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float, fillmode: FillMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipFillClosedCurve2((graphics?.value ?: 0L).toString(), (brush?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count, tension.toDouble(), fillmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillClosedCurve2I(graphics: COpaquePointer?, brush: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float, fillmode: FillMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipFillClosedCurve2I((graphics?.value ?: 0L).toString(), (brush?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count, tension.toDouble(), fillmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillClosedCurveI(graphics: COpaquePointer?, brush: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipFillClosedCurveI((graphics?.value ?: 0L).toString(), (brush?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillEllipse(graphics: COpaquePointer?, brush: COpaquePointer?, x: Float, y: Float, width: Float, height: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipFillEllipse((graphics?.value ?: 0L).toString(), (brush?.value ?: 0L).toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillEllipseI(graphics: COpaquePointer?, brush: COpaquePointer?, x: Int, y: Int, width: Int, height: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipFillEllipseI((graphics?.value ?: 0L).toString(), (brush?.value ?: 0L).toString(), x, y, width, height) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillPath(graphics: COpaquePointer?, brush: COpaquePointer?, path: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipFillPath((graphics?.value ?: 0L).toString(), (brush?.value ?: 0L).toString(), (path?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillPie(graphics: COpaquePointer?, brush: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipFillPie((graphics?.value ?: 0L).toString(), (brush?.value ?: 0L).toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), startangle.toDouble(), sweepangle.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillPieI(graphics: COpaquePointer?, brush: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipFillPieI((graphics?.value ?: 0L).toString(), (brush?.value ?: 0L).toString(), x, y, width, height, startangle.toDouble(), sweepangle.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillPolygon(graphics: COpaquePointer?, brush: COpaquePointer?, points: COpaquePointer?, count: Int, fillmode: FillMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipFillPolygon((graphics?.value ?: 0L).toString(), (brush?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count, fillmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillPolygon2(graphics: COpaquePointer?, brush: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipFillPolygon2((graphics?.value ?: 0L).toString(), (brush?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillPolygon2I(graphics: COpaquePointer?, brush: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipFillPolygon2I((graphics?.value ?: 0L).toString(), (brush?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillPolygonI(graphics: COpaquePointer?, brush: COpaquePointer?, points: COpaquePointer?, count: Int, fillmode: FillMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipFillPolygonI((graphics?.value ?: 0L).toString(), (brush?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count, fillmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillRectangle(graphics: COpaquePointer?, brush: COpaquePointer?, x: Float, y: Float, width: Float, height: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipFillRectangle((graphics?.value ?: 0L).toString(), (brush?.value ?: 0L).toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillRectangleI(graphics: COpaquePointer?, brush: COpaquePointer?, x: Int, y: Int, width: Int, height: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipFillRectangleI((graphics?.value ?: 0L).toString(), (brush?.value ?: 0L).toString(), x, y, width, height) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillRectangles(graphics: COpaquePointer?, brush: COpaquePointer?, rects: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipFillRectangles((graphics?.value ?: 0L).toString(), (brush?.value ?: 0L).toString(), (rects?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillRectanglesI(graphics: COpaquePointer?, brush: COpaquePointer?, rects: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipFillRectanglesI((graphics?.value ?: 0L).toString(), (brush?.value ?: 0L).toString(), (rects?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillRegion(graphics: COpaquePointer?, brush: COpaquePointer?, region: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipFillRegion((graphics?.value ?: 0L).toString(), (brush?.value ?: 0L).toString(), (region?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFindFirstImageItem(image: COpaquePointer?, item: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipFindFirstImageItem((image?.value ?: 0L).toString(), (item?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFindNextImageItem(image: COpaquePointer?, item: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipFindNextImageItem((image?.value ?: 0L).toString(), (item?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFlattenPath(path: COpaquePointer?, matrix: COpaquePointer?, flatness: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipFlattenPath((path?.value ?: 0L).toString(), (matrix?.value ?: 0L).toString(), flatness.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFlush(graphics: COpaquePointer?, intention: FlushIntention): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipFlush((graphics?.value ?: 0L).toString(), intention) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFree(ptr: COpaquePointer?) {
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) {
        _windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipFree((ptr?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gdipGetAdjustableArrowCapFillState(cap: COpaquePointer?, fillstate: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetAdjustableArrowCapFillState((cap?.value ?: 0L).toString(), (fillstate?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetAdjustableArrowCapHeight(cap: COpaquePointer?, height: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetAdjustableArrowCapHeight((cap?.value ?: 0L).toString(), (height?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetAdjustableArrowCapMiddleInset(cap: COpaquePointer?, middleinset: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetAdjustableArrowCapMiddleInset((cap?.value ?: 0L).toString(), (middleinset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetAdjustableArrowCapWidth(cap: COpaquePointer?, width: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetAdjustableArrowCapWidth((cap?.value ?: 0L).toString(), (width?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetAllPropertyItems(image: COpaquePointer?, totalbuffersize: UInt, numproperties: UInt, allitems: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetAllPropertyItems((image?.value ?: 0L).toString(), totalbuffersize.toInt(), numproperties.toInt(), (allitems?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetBrushType(brush: COpaquePointer?, type: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetBrushType((brush?.value ?: 0L).toString(), (type?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCellAscent(family: COpaquePointer?, style: Int, cellascent: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetCellAscent((family?.value ?: 0L).toString(), style, (cellascent?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCellDescent(family: COpaquePointer?, style: Int, celldescent: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetCellDescent((family?.value ?: 0L).toString(), style, (celldescent?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetClip(graphics: COpaquePointer?, region: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetClip((graphics?.value ?: 0L).toString(), (region?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetClipBounds(graphics: COpaquePointer?, rect: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetClipBounds((graphics?.value ?: 0L).toString(), (rect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetClipBoundsI(graphics: COpaquePointer?, rect: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetClipBoundsI((graphics?.value ?: 0L).toString(), (rect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCompositingMode(graphics: COpaquePointer?, compositingmode: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetCompositingMode((graphics?.value ?: 0L).toString(), (compositingmode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCompositingQuality(graphics: COpaquePointer?, compositingquality: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetCompositingQuality((graphics?.value ?: 0L).toString(), (compositingquality?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCustomLineCapBaseCap(customcap: COpaquePointer?, basecap: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetCustomLineCapBaseCap((customcap?.value ?: 0L).toString(), (basecap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCustomLineCapBaseInset(customcap: COpaquePointer?, inset: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetCustomLineCapBaseInset((customcap?.value ?: 0L).toString(), (inset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCustomLineCapStrokeCaps(customcap: COpaquePointer?, startcap: COpaquePointer?, endcap: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetCustomLineCapStrokeCaps((customcap?.value ?: 0L).toString(), (startcap?.value ?: 0L).toString(), (endcap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCustomLineCapStrokeJoin(customcap: COpaquePointer?, linejoin: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetCustomLineCapStrokeJoin((customcap?.value ?: 0L).toString(), (linejoin?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCustomLineCapType(customcap: COpaquePointer?, captype: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetCustomLineCapType((customcap?.value ?: 0L).toString(), (captype?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCustomLineCapWidthScale(customcap: COpaquePointer?, widthscale: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetCustomLineCapWidthScale((customcap?.value ?: 0L).toString(), (widthscale?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetDC(graphics: COpaquePointer?, hdc: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetDC((graphics?.value ?: 0L).toString(), (hdc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetDpiX(graphics: COpaquePointer?, dpi: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetDpiX((graphics?.value ?: 0L).toString(), (dpi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetDpiY(graphics: COpaquePointer?, dpi: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetDpiY((graphics?.value ?: 0L).toString(), (dpi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetEffectParameterSize(effect: COpaquePointer?, size: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetEffectParameterSize((effect?.value ?: 0L).toString(), (size?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetEffectParameters(effect: COpaquePointer?, size: COpaquePointer?, params: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetEffectParameters((effect?.value ?: 0L).toString(), (size?.value ?: 0L).toString(), (params?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetEmHeight(family: COpaquePointer?, style: Int, emheight: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetEmHeight((family?.value ?: 0L).toString(), style, (emheight?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetEncoderParameterList(image: COpaquePointer?, clsidencoder: COpaquePointer?, size: UInt, buffer: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetEncoderParameterList((image?.value ?: 0L).toString(), (clsidencoder?.value ?: 0L).toString(), size.toInt(), (buffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetEncoderParameterListSize(image: COpaquePointer?, clsidencoder: COpaquePointer?, size: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetEncoderParameterListSize((image?.value ?: 0L).toString(), (clsidencoder?.value ?: 0L).toString(), (size?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFamily(font: COpaquePointer?, family: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetFamily((font?.value ?: 0L).toString(), (family?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFamilyName(family: COpaquePointer?, name: Pwstr, language: UShort): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetFamilyName((family?.value ?: 0L).toString(), (name?.value ?: 0L).toString(), language.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFontCollectionFamilyCount(fontcollection: COpaquePointer?, numfound: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetFontCollectionFamilyCount((fontcollection?.value ?: 0L).toString(), (numfound?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFontCollectionFamilyList(fontcollection: COpaquePointer?, numsought: Int, gpfamilies: COpaquePointer?, numfound: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetFontCollectionFamilyList((fontcollection?.value ?: 0L).toString(), numsought, (gpfamilies?.value ?: 0L).toString(), (numfound?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFontHeight(font: COpaquePointer?, graphics: COpaquePointer?, height: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetFontHeight((font?.value ?: 0L).toString(), (graphics?.value ?: 0L).toString(), (height?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFontHeightGivenDPI(font: COpaquePointer?, dpi: Float, height: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetFontHeightGivenDPI((font?.value ?: 0L).toString(), dpi.toDouble(), (height?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFontSize(font: COpaquePointer?, size: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetFontSize((font?.value ?: 0L).toString(), (size?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFontStyle(font: COpaquePointer?, style: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetFontStyle((font?.value ?: 0L).toString(), (style?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFontUnit(font: COpaquePointer?, unit: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetFontUnit((font?.value ?: 0L).toString(), (unit?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetGenericFontFamilyMonospace(nativefamily: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetGenericFontFamilyMonospace((nativefamily?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetGenericFontFamilySansSerif(nativefamily: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetGenericFontFamilySansSerif((nativefamily?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetGenericFontFamilySerif(nativefamily: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetGenericFontFamilySerif((nativefamily?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetHatchBackgroundColor(brush: COpaquePointer?, backcol: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetHatchBackgroundColor((brush?.value ?: 0L).toString(), (backcol?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetHatchForegroundColor(brush: COpaquePointer?, forecol: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetHatchForegroundColor((brush?.value ?: 0L).toString(), (forecol?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetHatchStyle(brush: COpaquePointer?, hatchstyle: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetHatchStyle((brush?.value ?: 0L).toString(), (hatchstyle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetHemfFromMetafile(metafile: COpaquePointer?, hemf: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetHemfFromMetafile((metafile?.value ?: 0L).toString(), (hemf?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageAttributesAdjustedPalette(imageattr: COpaquePointer?, colorpalette: COpaquePointer?, coloradjusttype: ColorAdjustType): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetImageAttributesAdjustedPalette((imageattr?.value ?: 0L).toString(), (colorpalette?.value ?: 0L).toString(), coloradjusttype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageBounds(image: COpaquePointer?, srcrect: COpaquePointer?, srcunit: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetImageBounds((image?.value ?: 0L).toString(), (srcrect?.value ?: 0L).toString(), (srcunit?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageDecoders(numdecoders: UInt, size: UInt, decoders: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetImageDecoders(numdecoders.toInt(), size.toInt(), (decoders?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageDecodersSize(numdecoders: COpaquePointer?, size: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetImageDecodersSize((numdecoders?.value ?: 0L).toString(), (size?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageDimension(image: COpaquePointer?, width: COpaquePointer?, height: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetImageDimension((image?.value ?: 0L).toString(), (width?.value ?: 0L).toString(), (height?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageEncoders(numencoders: UInt, size: UInt, encoders: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetImageEncoders(numencoders.toInt(), size.toInt(), (encoders?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageEncodersSize(numencoders: COpaquePointer?, size: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetImageEncodersSize((numencoders?.value ?: 0L).toString(), (size?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageFlags(image: COpaquePointer?, flags: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetImageFlags((image?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageGraphicsContext(image: COpaquePointer?, graphics: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetImageGraphicsContext((image?.value ?: 0L).toString(), (graphics?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageHeight(image: COpaquePointer?, height: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetImageHeight((image?.value ?: 0L).toString(), (height?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageHorizontalResolution(image: COpaquePointer?, resolution: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetImageHorizontalResolution((image?.value ?: 0L).toString(), (resolution?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageItemData(image: COpaquePointer?, item: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetImageItemData((image?.value ?: 0L).toString(), (item?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImagePalette(image: COpaquePointer?, palette: COpaquePointer?, size: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetImagePalette((image?.value ?: 0L).toString(), (palette?.value ?: 0L).toString(), size) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImagePaletteSize(image: COpaquePointer?, size: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetImagePaletteSize((image?.value ?: 0L).toString(), (size?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImagePixelFormat(image: COpaquePointer?, format: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetImagePixelFormat((image?.value ?: 0L).toString(), (format?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageRawFormat(image: COpaquePointer?, format: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetImageRawFormat((image?.value ?: 0L).toString(), (format?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageThumbnail(image: COpaquePointer?, thumbwidth: UInt, thumbheight: UInt, thumbimage: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetImageThumbnail((image?.value ?: 0L).toString(), thumbwidth.toInt(), thumbheight.toInt(), (thumbimage?.value ?: 0L).toString(), callback.toString(), (callbackdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageType(image: COpaquePointer?, type: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetImageType((image?.value ?: 0L).toString(), (type?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageVerticalResolution(image: COpaquePointer?, resolution: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetImageVerticalResolution((image?.value ?: 0L).toString(), (resolution?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageWidth(image: COpaquePointer?, width: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetImageWidth((image?.value ?: 0L).toString(), (width?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetInterpolationMode(graphics: COpaquePointer?, interpolationmode: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetInterpolationMode((graphics?.value ?: 0L).toString(), (interpolationmode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineBlend(brush: COpaquePointer?, blend: COpaquePointer?, positions: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetLineBlend((brush?.value ?: 0L).toString(), (blend?.value ?: 0L).toString(), (positions?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineBlendCount(brush: COpaquePointer?, count: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetLineBlendCount((brush?.value ?: 0L).toString(), (count?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineColors(brush: COpaquePointer?, colors: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetLineColors((brush?.value ?: 0L).toString(), (colors?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineGammaCorrection(brush: COpaquePointer?, usegammacorrection: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetLineGammaCorrection((brush?.value ?: 0L).toString(), (usegammacorrection?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLinePresetBlend(brush: COpaquePointer?, blend: COpaquePointer?, positions: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetLinePresetBlend((brush?.value ?: 0L).toString(), (blend?.value ?: 0L).toString(), (positions?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLinePresetBlendCount(brush: COpaquePointer?, count: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetLinePresetBlendCount((brush?.value ?: 0L).toString(), (count?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineRect(brush: COpaquePointer?, rect: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetLineRect((brush?.value ?: 0L).toString(), (rect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineRectI(brush: COpaquePointer?, rect: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetLineRectI((brush?.value ?: 0L).toString(), (rect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineSpacing(family: COpaquePointer?, style: Int, linespacing: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetLineSpacing((family?.value ?: 0L).toString(), style, (linespacing?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineTransform(brush: COpaquePointer?, matrix: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetLineTransform((brush?.value ?: 0L).toString(), (matrix?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineWrapMode(brush: COpaquePointer?, wrapmode: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetLineWrapMode((brush?.value ?: 0L).toString(), (wrapmode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLogFontA(font: COpaquePointer?, graphics: COpaquePointer?, logfonta: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetLogFontA((font?.value ?: 0L).toString(), (graphics?.value ?: 0L).toString(), (logfonta?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLogFontW(font: COpaquePointer?, graphics: COpaquePointer?, logfontw: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetLogFontW((font?.value ?: 0L).toString(), (graphics?.value ?: 0L).toString(), (logfontw?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetMatrixElements(matrix: COpaquePointer?, matrixout: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetMatrixElements((matrix?.value ?: 0L).toString(), (matrixout?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetMetafileDownLevelRasterizationLimit(metafile: COpaquePointer?, metafilerasterizationlimitdpi: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetMetafileDownLevelRasterizationLimit((metafile?.value ?: 0L).toString(), (metafilerasterizationlimitdpi?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetMetafileHeaderFromEmf(hemf: Henhmetafile, header: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetMetafileHeaderFromEmf((hemf?.value ?: 0L).toString(), (header?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetMetafileHeaderFromFile(filename: Pcwstr, header: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetMetafileHeaderFromFile((filename?.value ?: 0L).toString(), (header?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetMetafileHeaderFromMetafile(metafile: COpaquePointer?, header: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetMetafileHeaderFromMetafile((metafile?.value ?: 0L).toString(), (header?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetMetafileHeaderFromStream(stream: COpaquePointer?, header: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetMetafileHeaderFromStream((stream?.value ?: 0L).toString(), (header?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetMetafileHeaderFromWmf(hwmf: Hmetafile, wmfplaceablefileheader: COpaquePointer?, header: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetMetafileHeaderFromWmf((hwmf?.value ?: 0L).toString(), (wmfplaceablefileheader?.value ?: 0L).toString(), (header?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetNearestColor(graphics: COpaquePointer?, argb: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetNearestColor((graphics?.value ?: 0L).toString(), (argb?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPageScale(graphics: COpaquePointer?, scale: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPageScale((graphics?.value ?: 0L).toString(), (scale?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPageUnit(graphics: COpaquePointer?, unit: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPageUnit((graphics?.value ?: 0L).toString(), (unit?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathData(path: COpaquePointer?, pathdata: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPathData((path?.value ?: 0L).toString(), (pathdata?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathFillMode(path: COpaquePointer?, fillmode: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPathFillMode((path?.value ?: 0L).toString(), (fillmode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientBlend(brush: COpaquePointer?, blend: COpaquePointer?, positions: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientBlend((brush?.value ?: 0L).toString(), (blend?.value ?: 0L).toString(), (positions?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientBlendCount(brush: COpaquePointer?, count: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientBlendCount((brush?.value ?: 0L).toString(), (count?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientCenterColor(brush: COpaquePointer?, colors: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientCenterColor((brush?.value ?: 0L).toString(), (colors?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientCenterPoint(brush: COpaquePointer?, points: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientCenterPoint((brush?.value ?: 0L).toString(), (points?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientCenterPointI(brush: COpaquePointer?, points: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientCenterPointI((brush?.value ?: 0L).toString(), (points?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientFocusScales(brush: COpaquePointer?, xscale: COpaquePointer?, yscale: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientFocusScales((brush?.value ?: 0L).toString(), (xscale?.value ?: 0L).toString(), (yscale?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientGammaCorrection(brush: COpaquePointer?, usegammacorrection: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientGammaCorrection((brush?.value ?: 0L).toString(), (usegammacorrection?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientPath(brush: COpaquePointer?, path: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientPath((brush?.value ?: 0L).toString(), (path?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientPointCount(brush: COpaquePointer?, count: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientPointCount((brush?.value ?: 0L).toString(), (count?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientPresetBlend(brush: COpaquePointer?, blend: COpaquePointer?, positions: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientPresetBlend((brush?.value ?: 0L).toString(), (blend?.value ?: 0L).toString(), (positions?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientPresetBlendCount(brush: COpaquePointer?, count: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientPresetBlendCount((brush?.value ?: 0L).toString(), (count?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientRect(brush: COpaquePointer?, rect: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientRect((brush?.value ?: 0L).toString(), (rect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientRectI(brush: COpaquePointer?, rect: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientRectI((brush?.value ?: 0L).toString(), (rect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientSurroundColorCount(brush: COpaquePointer?, count: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientSurroundColorCount((brush?.value ?: 0L).toString(), (count?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientSurroundColorsWithCount(brush: COpaquePointer?, color: COpaquePointer?, count: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientSurroundColorsWithCount((brush?.value ?: 0L).toString(), (color?.value ?: 0L).toString(), (count?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientTransform(brush: COpaquePointer?, matrix: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientTransform((brush?.value ?: 0L).toString(), (matrix?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientWrapMode(brush: COpaquePointer?, wrapmode: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientWrapMode((brush?.value ?: 0L).toString(), (wrapmode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathLastPoint(path: COpaquePointer?, lastpoint: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPathLastPoint((path?.value ?: 0L).toString(), (lastpoint?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathPoints(param0: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPathPoints((param0?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathPointsI(param0: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPathPointsI((param0?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathTypes(path: COpaquePointer?, types: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPathTypes((path?.value ?: 0L).toString(), (types?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathWorldBounds(path: COpaquePointer?, bounds: COpaquePointer?, matrix: COpaquePointer?, pen: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPathWorldBounds((path?.value ?: 0L).toString(), (bounds?.value ?: 0L).toString(), (matrix?.value ?: 0L).toString(), (pen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathWorldBoundsI(path: COpaquePointer?, bounds: COpaquePointer?, matrix: COpaquePointer?, pen: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPathWorldBoundsI((path?.value ?: 0L).toString(), (bounds?.value ?: 0L).toString(), (matrix?.value ?: 0L).toString(), (pen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenBrushFill(pen: COpaquePointer?, brush: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPenBrushFill((pen?.value ?: 0L).toString(), (brush?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenColor(pen: COpaquePointer?, argb: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPenColor((pen?.value ?: 0L).toString(), (argb?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenCompoundArray(pen: COpaquePointer?, dash: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPenCompoundArray((pen?.value ?: 0L).toString(), (dash?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenCompoundCount(pen: COpaquePointer?, count: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPenCompoundCount((pen?.value ?: 0L).toString(), (count?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenCustomEndCap(pen: COpaquePointer?, customcap: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPenCustomEndCap((pen?.value ?: 0L).toString(), (customcap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenCustomStartCap(pen: COpaquePointer?, customcap: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPenCustomStartCap((pen?.value ?: 0L).toString(), (customcap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenDashArray(pen: COpaquePointer?, dash: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPenDashArray((pen?.value ?: 0L).toString(), (dash?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenDashCap197819(pen: COpaquePointer?, dashcap: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPenDashCap197819((pen?.value ?: 0L).toString(), (dashcap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenDashCount(pen: COpaquePointer?, count: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPenDashCount((pen?.value ?: 0L).toString(), (count?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenDashOffset(pen: COpaquePointer?, offset: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPenDashOffset((pen?.value ?: 0L).toString(), (offset?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenDashStyle(pen: COpaquePointer?, dashstyle: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPenDashStyle((pen?.value ?: 0L).toString(), (dashstyle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenEndCap(pen: COpaquePointer?, endcap: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPenEndCap((pen?.value ?: 0L).toString(), (endcap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenFillType(pen: COpaquePointer?, type: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPenFillType((pen?.value ?: 0L).toString(), (type?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenLineJoin(pen: COpaquePointer?, linejoin: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPenLineJoin((pen?.value ?: 0L).toString(), (linejoin?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenMiterLimit(pen: COpaquePointer?, miterlimit: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPenMiterLimit((pen?.value ?: 0L).toString(), (miterlimit?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenMode(pen: COpaquePointer?, penmode: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPenMode((pen?.value ?: 0L).toString(), (penmode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenStartCap(pen: COpaquePointer?, startcap: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPenStartCap((pen?.value ?: 0L).toString(), (startcap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenTransform(pen: COpaquePointer?, matrix: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPenTransform((pen?.value ?: 0L).toString(), (matrix?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenUnit(pen: COpaquePointer?, unit: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPenUnit((pen?.value ?: 0L).toString(), (unit?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenWidth(pen: COpaquePointer?, width: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPenWidth((pen?.value ?: 0L).toString(), (width?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPixelOffsetMode(graphics: COpaquePointer?, pixeloffsetmode: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPixelOffsetMode((graphics?.value ?: 0L).toString(), (pixeloffsetmode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPointCount(path: COpaquePointer?, count: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPointCount((path?.value ?: 0L).toString(), (count?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPropertyCount(image: COpaquePointer?, numofproperty: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPropertyCount((image?.value ?: 0L).toString(), (numofproperty?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPropertyIdList(image: COpaquePointer?, numofproperty: UInt, list: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPropertyIdList((image?.value ?: 0L).toString(), numofproperty.toInt(), (list?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPropertyItem(image: COpaquePointer?, propid: UInt, propsize: UInt, buffer: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPropertyItem((image?.value ?: 0L).toString(), propid.toInt(), propsize.toInt(), (buffer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPropertyItemSize(image: COpaquePointer?, propid: UInt, size: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPropertyItemSize((image?.value ?: 0L).toString(), propid.toInt(), (size?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPropertySize(image: COpaquePointer?, totalbuffersize: COpaquePointer?, numproperties: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetPropertySize((image?.value ?: 0L).toString(), (totalbuffersize?.value ?: 0L).toString(), (numproperties?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRegionBounds(region: COpaquePointer?, graphics: COpaquePointer?, rect: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetRegionBounds((region?.value ?: 0L).toString(), (graphics?.value ?: 0L).toString(), (rect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRegionBoundsI(region: COpaquePointer?, graphics: COpaquePointer?, rect: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetRegionBoundsI((region?.value ?: 0L).toString(), (graphics?.value ?: 0L).toString(), (rect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRegionData(region: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt, sizefilled: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetRegionData((region?.value ?: 0L).toString(), (buffer?.value ?: 0L).toString(), buffersize.toInt(), (sizefilled?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRegionDataSize(region: COpaquePointer?, buffersize: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetRegionDataSize((region?.value ?: 0L).toString(), (buffersize?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRegionHRgn(region: COpaquePointer?, graphics: COpaquePointer?, hrgn: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetRegionHRgn((region?.value ?: 0L).toString(), (graphics?.value ?: 0L).toString(), (hrgn?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRegionScans(region: COpaquePointer?, rects: COpaquePointer?, count: COpaquePointer?, matrix: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetRegionScans((region?.value ?: 0L).toString(), (rects?.value ?: 0L).toString(), (count?.value ?: 0L).toString(), (matrix?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRegionScansCount(region: COpaquePointer?, count: COpaquePointer?, matrix: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetRegionScansCount((region?.value ?: 0L).toString(), (count?.value ?: 0L).toString(), (matrix?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRegionScansI(region: COpaquePointer?, rects: COpaquePointer?, count: COpaquePointer?, matrix: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetRegionScansI((region?.value ?: 0L).toString(), (rects?.value ?: 0L).toString(), (count?.value ?: 0L).toString(), (matrix?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRenderingOrigin(graphics: COpaquePointer?, x: COpaquePointer?, y: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetRenderingOrigin((graphics?.value ?: 0L).toString(), (x?.value ?: 0L).toString(), (y?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetSmoothingMode(graphics: COpaquePointer?, smoothingmode: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetSmoothingMode((graphics?.value ?: 0L).toString(), (smoothingmode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetSolidFillColor(brush: COpaquePointer?, color: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetSolidFillColor((brush?.value ?: 0L).toString(), (color?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatAlign(format: COpaquePointer?, align: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetStringFormatAlign((format?.value ?: 0L).toString(), (align?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatDigitSubstitution(format: COpaquePointer?, language: COpaquePointer?, substitute: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetStringFormatDigitSubstitution((format?.value ?: 0L).toString(), (language?.value ?: 0L).toString(), (substitute?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatFlags(format: COpaquePointer?, flags: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetStringFormatFlags((format?.value ?: 0L).toString(), (flags?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatHotkeyPrefix(format: COpaquePointer?, hotkeyprefix: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetStringFormatHotkeyPrefix((format?.value ?: 0L).toString(), (hotkeyprefix?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatLineAlign(format: COpaquePointer?, align: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetStringFormatLineAlign((format?.value ?: 0L).toString(), (align?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatMeasurableCharacterRangeCount(format: COpaquePointer?, count: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetStringFormatMeasurableCharacterRangeCount((format?.value ?: 0L).toString(), (count?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatTabStopCount(format: COpaquePointer?, count: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetStringFormatTabStopCount((format?.value ?: 0L).toString(), (count?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatTabStops(format: COpaquePointer?, count: Int, firsttaboffset: COpaquePointer?, tabstops: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetStringFormatTabStops((format?.value ?: 0L).toString(), count, (firsttaboffset?.value ?: 0L).toString(), (tabstops?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatTrimming(format: COpaquePointer?, trimming: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetStringFormatTrimming((format?.value ?: 0L).toString(), (trimming?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetTextContrast(graphics: COpaquePointer?, contrast: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetTextContrast((graphics?.value ?: 0L).toString(), (contrast?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetTextRenderingHint(graphics: COpaquePointer?, mode: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetTextRenderingHint((graphics?.value ?: 0L).toString(), (mode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetTextureImage(brush: COpaquePointer?, image: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetTextureImage((brush?.value ?: 0L).toString(), (image?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetTextureTransform(brush: COpaquePointer?, matrix: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetTextureTransform((brush?.value ?: 0L).toString(), (matrix?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetTextureWrapMode(brush: COpaquePointer?, wrapmode: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetTextureWrapMode((brush?.value ?: 0L).toString(), (wrapmode?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetVisibleClipBounds(graphics: COpaquePointer?, rect: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetVisibleClipBounds((graphics?.value ?: 0L).toString(), (rect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetVisibleClipBoundsI(graphics: COpaquePointer?, rect: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetVisibleClipBoundsI((graphics?.value ?: 0L).toString(), (rect?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetWorldTransform(graphics: COpaquePointer?, matrix: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGetWorldTransform((graphics?.value ?: 0L).toString(), (matrix?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGraphicsClear(graphics: COpaquePointer?, color: UInt): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGraphicsClear((graphics?.value ?: 0L).toString(), color.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGraphicsSetAbort(pgraphics: COpaquePointer?, piabort: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipGraphicsSetAbort((pgraphics?.value ?: 0L).toString(), (piabort?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipImageForceValidation(image: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipImageForceValidation((image?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipImageGetFrameCount(image: COpaquePointer?, dimensionid: COpaquePointer?, count: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipImageGetFrameCount((image?.value ?: 0L).toString(), (dimensionid?.value ?: 0L).toString(), (count?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipImageGetFrameDimensionsCount(image: COpaquePointer?, count: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipImageGetFrameDimensionsCount((image?.value ?: 0L).toString(), (count?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipImageGetFrameDimensionsList(image: COpaquePointer?, dimensionids: COpaquePointer?, count: UInt): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipImageGetFrameDimensionsList((image?.value ?: 0L).toString(), (dimensionids?.value ?: 0L).toString(), count.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipImageRotateFlip(image: COpaquePointer?, rftype: RotateFlipType): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipImageRotateFlip((image?.value ?: 0L).toString(), rftype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipImageSelectActiveFrame(image: COpaquePointer?, dimensionid: COpaquePointer?, frameindex: UInt): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipImageSelectActiveFrame((image?.value ?: 0L).toString(), (dimensionid?.value ?: 0L).toString(), frameindex.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipImageSetAbort(pimage: COpaquePointer?, piabort: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipImageSetAbort((pimage?.value ?: 0L).toString(), (piabort?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipInitializePalette(palette: COpaquePointer?, palettetype: PaletteType, optimalcolors: Int, usetransparentcolor: Bool, bitmap: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipInitializePalette((palette?.value ?: 0L).toString(), palettetype, optimalcolors, usetransparentcolor, (bitmap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipInvertMatrix(matrix: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipInvertMatrix((matrix?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsClipEmpty(graphics: COpaquePointer?, result: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipIsClipEmpty((graphics?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsEmptyRegion(region: COpaquePointer?, graphics: COpaquePointer?, result: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipIsEmptyRegion((region?.value ?: 0L).toString(), (graphics?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsEqualRegion(region: COpaquePointer?, region2: COpaquePointer?, graphics: COpaquePointer?, result: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipIsEqualRegion((region?.value ?: 0L).toString(), (region2?.value ?: 0L).toString(), (graphics?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsInfiniteRegion(region: COpaquePointer?, graphics: COpaquePointer?, result: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipIsInfiniteRegion((region?.value ?: 0L).toString(), (graphics?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsMatrixEqual(matrix: COpaquePointer?, matrix2: COpaquePointer?, result: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipIsMatrixEqual((matrix?.value ?: 0L).toString(), (matrix2?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsMatrixIdentity(matrix: COpaquePointer?, result: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipIsMatrixIdentity((matrix?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsMatrixInvertible(matrix: COpaquePointer?, result: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipIsMatrixInvertible((matrix?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsOutlineVisiblePathPoint(path: COpaquePointer?, x: Float, y: Float, pen: COpaquePointer?, graphics: COpaquePointer?, result: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipIsOutlineVisiblePathPoint((path?.value ?: 0L).toString(), x.toDouble(), y.toDouble(), (pen?.value ?: 0L).toString(), (graphics?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsOutlineVisiblePathPointI(path: COpaquePointer?, x: Int, y: Int, pen: COpaquePointer?, graphics: COpaquePointer?, result: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipIsOutlineVisiblePathPointI((path?.value ?: 0L).toString(), x, y, (pen?.value ?: 0L).toString(), (graphics?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsStyleAvailable(family: COpaquePointer?, style: Int, isstyleavailable: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipIsStyleAvailable((family?.value ?: 0L).toString(), style, (isstyleavailable?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisibleClipEmpty(graphics: COpaquePointer?, result: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipIsVisibleClipEmpty((graphics?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisiblePathPoint(path: COpaquePointer?, x: Float, y: Float, graphics: COpaquePointer?, result: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipIsVisiblePathPoint((path?.value ?: 0L).toString(), x.toDouble(), y.toDouble(), (graphics?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisiblePathPointI(path: COpaquePointer?, x: Int, y: Int, graphics: COpaquePointer?, result: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipIsVisiblePathPointI((path?.value ?: 0L).toString(), x, y, (graphics?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisiblePoint(graphics: COpaquePointer?, x: Float, y: Float, result: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipIsVisiblePoint((graphics?.value ?: 0L).toString(), x.toDouble(), y.toDouble(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisiblePointI(graphics: COpaquePointer?, x: Int, y: Int, result: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipIsVisiblePointI((graphics?.value ?: 0L).toString(), x, y, (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisibleRect(graphics: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, result: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipIsVisibleRect((graphics?.value ?: 0L).toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisibleRectI(graphics: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, result: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipIsVisibleRectI((graphics?.value ?: 0L).toString(), x, y, width, height, (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisibleRegionPoint(region: COpaquePointer?, x: Float, y: Float, graphics: COpaquePointer?, result: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipIsVisibleRegionPoint((region?.value ?: 0L).toString(), x.toDouble(), y.toDouble(), (graphics?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisibleRegionPointI(region: COpaquePointer?, x: Int, y: Int, graphics: COpaquePointer?, result: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipIsVisibleRegionPointI((region?.value ?: 0L).toString(), x, y, (graphics?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisibleRegionRect(region: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, graphics: COpaquePointer?, result: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipIsVisibleRegionRect((region?.value ?: 0L).toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), (graphics?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisibleRegionRectI(region: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, graphics: COpaquePointer?, result: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipIsVisibleRegionRectI((region?.value ?: 0L).toString(), x, y, width, height, (graphics?.value ?: 0L).toString(), (result?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipLoadImageFromFile(filename: Pcwstr, image: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipLoadImageFromFile((filename?.value ?: 0L).toString(), (image?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipLoadImageFromFileICM(filename: Pcwstr, image: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipLoadImageFromFileICM((filename?.value ?: 0L).toString(), (image?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipLoadImageFromStream(stream: COpaquePointer?, image: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipLoadImageFromStream((stream?.value ?: 0L).toString(), (image?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipLoadImageFromStreamICM(stream: COpaquePointer?, image: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipLoadImageFromStreamICM((stream?.value ?: 0L).toString(), (image?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMeasureCharacterRanges(graphics: COpaquePointer?, string: Pcwstr, length: Int, font: COpaquePointer?, layoutrect: COpaquePointer?, stringformat: COpaquePointer?, regioncount: Int, regions: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipMeasureCharacterRanges((graphics?.value ?: 0L).toString(), (string?.value ?: 0L).toString(), length, (font?.value ?: 0L).toString(), (layoutrect?.value ?: 0L).toString(), (stringformat?.value ?: 0L).toString(), regioncount, (regions?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMeasureDriverString(graphics: COpaquePointer?, text: COpaquePointer?, length: Int, font: COpaquePointer?, positions: COpaquePointer?, flags: Int, matrix: COpaquePointer?, boundingbox: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipMeasureDriverString((graphics?.value ?: 0L).toString(), (text?.value ?: 0L).toString(), length, (font?.value ?: 0L).toString(), (positions?.value ?: 0L).toString(), flags, (matrix?.value ?: 0L).toString(), (boundingbox?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMeasureString(graphics: COpaquePointer?, string: Pcwstr, length: Int, font: COpaquePointer?, layoutrect: COpaquePointer?, stringformat: COpaquePointer?, boundingbox: COpaquePointer?, codepointsfitted: COpaquePointer?, linesfilled: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipMeasureString((graphics?.value ?: 0L).toString(), (string?.value ?: 0L).toString(), length, (font?.value ?: 0L).toString(), (layoutrect?.value ?: 0L).toString(), (stringformat?.value ?: 0L).toString(), (boundingbox?.value ?: 0L).toString(), (codepointsfitted?.value ?: 0L).toString(), (linesfilled?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMultiplyLineTransform(brush: COpaquePointer?, matrix: COpaquePointer?, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipMultiplyLineTransform((brush?.value ?: 0L).toString(), (matrix?.value ?: 0L).toString(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMultiplyMatrix(matrix: COpaquePointer?, matrix2: COpaquePointer?, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipMultiplyMatrix((matrix?.value ?: 0L).toString(), (matrix2?.value ?: 0L).toString(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMultiplyPathGradientTransform(brush: COpaquePointer?, matrix: COpaquePointer?, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipMultiplyPathGradientTransform((brush?.value ?: 0L).toString(), (matrix?.value ?: 0L).toString(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMultiplyPenTransform(pen: COpaquePointer?, matrix: COpaquePointer?, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipMultiplyPenTransform((pen?.value ?: 0L).toString(), (matrix?.value ?: 0L).toString(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMultiplyTextureTransform(brush: COpaquePointer?, matrix: COpaquePointer?, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipMultiplyTextureTransform((brush?.value ?: 0L).toString(), (matrix?.value ?: 0L).toString(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMultiplyWorldTransform(graphics: COpaquePointer?, matrix: COpaquePointer?, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipMultiplyWorldTransform((graphics?.value ?: 0L).toString(), (matrix?.value ?: 0L).toString(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipNewInstalledFontCollection(fontcollection: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipNewInstalledFontCollection((fontcollection?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipNewPrivateFontCollection(fontcollection: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipNewPrivateFontCollection((fontcollection?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterCopyData(iterator: COpaquePointer?, resultcount: COpaquePointer?, points: COpaquePointer?, types: COpaquePointer?, startindex: Int, endindex: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipPathIterCopyData((iterator?.value ?: 0L).toString(), (resultcount?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), (types?.value ?: 0L).toString(), startindex, endindex) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterEnumerate(iterator: COpaquePointer?, resultcount: COpaquePointer?, points: COpaquePointer?, types: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipPathIterEnumerate((iterator?.value ?: 0L).toString(), (resultcount?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), (types?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterGetCount(iterator: COpaquePointer?, count: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipPathIterGetCount((iterator?.value ?: 0L).toString(), (count?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterGetSubpathCount(iterator: COpaquePointer?, count: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipPathIterGetSubpathCount((iterator?.value ?: 0L).toString(), (count?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterHasCurve(iterator: COpaquePointer?, hascurve: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipPathIterHasCurve((iterator?.value ?: 0L).toString(), (hascurve?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterIsValid(iterator: COpaquePointer?, valid: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipPathIterIsValid((iterator?.value ?: 0L).toString(), (valid?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterNextMarker(iterator: COpaquePointer?, resultcount: COpaquePointer?, startindex: COpaquePointer?, endindex: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipPathIterNextMarker((iterator?.value ?: 0L).toString(), (resultcount?.value ?: 0L).toString(), (startindex?.value ?: 0L).toString(), (endindex?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterNextMarkerPath(iterator: COpaquePointer?, resultcount: COpaquePointer?, path: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipPathIterNextMarkerPath((iterator?.value ?: 0L).toString(), (resultcount?.value ?: 0L).toString(), (path?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterNextPathType(iterator: COpaquePointer?, resultcount: COpaquePointer?, pathtype: COpaquePointer?, startindex: COpaquePointer?, endindex: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipPathIterNextPathType((iterator?.value ?: 0L).toString(), (resultcount?.value ?: 0L).toString(), (pathtype?.value ?: 0L).toString(), (startindex?.value ?: 0L).toString(), (endindex?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterNextSubpath(iterator: COpaquePointer?, resultcount: COpaquePointer?, startindex: COpaquePointer?, endindex: COpaquePointer?, isclosed: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipPathIterNextSubpath((iterator?.value ?: 0L).toString(), (resultcount?.value ?: 0L).toString(), (startindex?.value ?: 0L).toString(), (endindex?.value ?: 0L).toString(), (isclosed?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterNextSubpathPath(iterator: COpaquePointer?, resultcount: COpaquePointer?, path: COpaquePointer?, isclosed: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipPathIterNextSubpathPath((iterator?.value ?: 0L).toString(), (resultcount?.value ?: 0L).toString(), (path?.value ?: 0L).toString(), (isclosed?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterRewind(iterator: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipPathIterRewind((iterator?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPlayMetafileRecord(metafile: COpaquePointer?, recordtype: EmfPlusRecordType, flags: UInt, datasize: UInt, data: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipPlayMetafileRecord((metafile?.value ?: 0L).toString(), recordtype, flags.toInt(), datasize.toInt(), (data?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPrivateAddFontFile(fontcollection: COpaquePointer?, filename: Pcwstr): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipPrivateAddFontFile((fontcollection?.value ?: 0L).toString(), (filename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPrivateAddMemoryFont(fontcollection: COpaquePointer?, memory: COpaquePointer?, length: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipPrivateAddMemoryFont((fontcollection?.value ?: 0L).toString(), (memory?.value ?: 0L).toString(), length) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRecordMetafile(referencehdc: Hdc, type: EmfType, framerect: COpaquePointer?, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipRecordMetafile((referencehdc?.value ?: 0L).toString(), type, (framerect?.value ?: 0L).toString(), frameunit, (description?.value ?: 0L).toString(), (metafile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRecordMetafileFileName(filename: Pcwstr, referencehdc: Hdc, type: EmfType, framerect: COpaquePointer?, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipRecordMetafileFileName((filename?.value ?: 0L).toString(), (referencehdc?.value ?: 0L).toString(), type, (framerect?.value ?: 0L).toString(), frameunit, (description?.value ?: 0L).toString(), (metafile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRecordMetafileFileNameI(filename: Pcwstr, referencehdc: Hdc, type: EmfType, framerect: COpaquePointer?, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipRecordMetafileFileNameI((filename?.value ?: 0L).toString(), (referencehdc?.value ?: 0L).toString(), type, (framerect?.value ?: 0L).toString(), frameunit, (description?.value ?: 0L).toString(), (metafile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRecordMetafileI(referencehdc: Hdc, type: EmfType, framerect: COpaquePointer?, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipRecordMetafileI((referencehdc?.value ?: 0L).toString(), type, (framerect?.value ?: 0L).toString(), frameunit, (description?.value ?: 0L).toString(), (metafile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRecordMetafileStream(stream: COpaquePointer?, referencehdc: Hdc, type: EmfType, framerect: COpaquePointer?, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipRecordMetafileStream((stream?.value ?: 0L).toString(), (referencehdc?.value ?: 0L).toString(), type, (framerect?.value ?: 0L).toString(), frameunit, (description?.value ?: 0L).toString(), (metafile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRecordMetafileStreamI(stream: COpaquePointer?, referencehdc: Hdc, type: EmfType, framerect: COpaquePointer?, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipRecordMetafileStreamI((stream?.value ?: 0L).toString(), (referencehdc?.value ?: 0L).toString(), type, (framerect?.value ?: 0L).toString(), frameunit, (description?.value ?: 0L).toString(), (metafile?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipReleaseDC(graphics: COpaquePointer?, hdc: Hdc): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipReleaseDC((graphics?.value ?: 0L).toString(), (hdc?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRemovePropertyItem(image: COpaquePointer?, propid: UInt): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipRemovePropertyItem((image?.value ?: 0L).toString(), propid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetClip(graphics: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipResetClip((graphics?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetImageAttributes(imageattr: COpaquePointer?, type: ColorAdjustType): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipResetImageAttributes((imageattr?.value ?: 0L).toString(), type) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetLineTransform(brush: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipResetLineTransform((brush?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetPageTransform(graphics: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipResetPageTransform((graphics?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetPath(path: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipResetPath((path?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetPathGradientTransform(brush: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipResetPathGradientTransform((brush?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetPenTransform(pen: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipResetPenTransform((pen?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetTextureTransform(brush: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipResetTextureTransform((brush?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetWorldTransform(graphics: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipResetWorldTransform((graphics?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRestoreGraphics(graphics: COpaquePointer?, state: UInt): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipRestoreGraphics((graphics?.value ?: 0L).toString(), state.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipReversePath(path: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipReversePath((path?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRotateLineTransform(brush: COpaquePointer?, angle: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipRotateLineTransform((brush?.value ?: 0L).toString(), angle.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRotateMatrix(matrix: COpaquePointer?, angle: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipRotateMatrix((matrix?.value ?: 0L).toString(), angle.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRotatePathGradientTransform(brush: COpaquePointer?, angle: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipRotatePathGradientTransform((brush?.value ?: 0L).toString(), angle.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRotatePenTransform(pen: COpaquePointer?, angle: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipRotatePenTransform((pen?.value ?: 0L).toString(), angle.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRotateTextureTransform(brush: COpaquePointer?, angle: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipRotateTextureTransform((brush?.value ?: 0L).toString(), angle.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRotateWorldTransform(graphics: COpaquePointer?, angle: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipRotateWorldTransform((graphics?.value ?: 0L).toString(), angle.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSaveAdd(image: COpaquePointer?, encoderparams: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSaveAdd((image?.value ?: 0L).toString(), (encoderparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSaveAddImage(image: COpaquePointer?, newimage: COpaquePointer?, encoderparams: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSaveAddImage((image?.value ?: 0L).toString(), (newimage?.value ?: 0L).toString(), (encoderparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSaveGraphics(graphics: COpaquePointer?, state: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSaveGraphics((graphics?.value ?: 0L).toString(), (state?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSaveImageToFile(image: COpaquePointer?, filename: Pcwstr, clsidencoder: COpaquePointer?, encoderparams: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSaveImageToFile((image?.value ?: 0L).toString(), (filename?.value ?: 0L).toString(), (clsidencoder?.value ?: 0L).toString(), (encoderparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSaveImageToStream(image: COpaquePointer?, stream: COpaquePointer?, clsidencoder: COpaquePointer?, encoderparams: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSaveImageToStream((image?.value ?: 0L).toString(), (stream?.value ?: 0L).toString(), (clsidencoder?.value ?: 0L).toString(), (encoderparams?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipScaleLineTransform(brush: COpaquePointer?, sx: Float, sy: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipScaleLineTransform((brush?.value ?: 0L).toString(), sx.toDouble(), sy.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipScaleMatrix(matrix: COpaquePointer?, scalex: Float, scaley: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipScaleMatrix((matrix?.value ?: 0L).toString(), scalex.toDouble(), scaley.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipScalePathGradientTransform(brush: COpaquePointer?, sx: Float, sy: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipScalePathGradientTransform((brush?.value ?: 0L).toString(), sx.toDouble(), sy.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipScalePenTransform(pen: COpaquePointer?, sx: Float, sy: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipScalePenTransform((pen?.value ?: 0L).toString(), sx.toDouble(), sy.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipScaleTextureTransform(brush: COpaquePointer?, sx: Float, sy: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipScaleTextureTransform((brush?.value ?: 0L).toString(), sx.toDouble(), sy.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipScaleWorldTransform(graphics: COpaquePointer?, sx: Float, sy: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipScaleWorldTransform((graphics?.value ?: 0L).toString(), sx.toDouble(), sy.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetAdjustableArrowCapFillState(cap: COpaquePointer?, fillstate: Bool): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetAdjustableArrowCapFillState((cap?.value ?: 0L).toString(), fillstate) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetAdjustableArrowCapHeight(cap: COpaquePointer?, height: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetAdjustableArrowCapHeight((cap?.value ?: 0L).toString(), height.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetAdjustableArrowCapMiddleInset(cap: COpaquePointer?, middleinset: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetAdjustableArrowCapMiddleInset((cap?.value ?: 0L).toString(), middleinset.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetAdjustableArrowCapWidth(cap: COpaquePointer?, width: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetAdjustableArrowCapWidth((cap?.value ?: 0L).toString(), width.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetClipGraphics(graphics: COpaquePointer?, srcgraphics: COpaquePointer?, combinemode: CombineMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetClipGraphics((graphics?.value ?: 0L).toString(), (srcgraphics?.value ?: 0L).toString(), combinemode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetClipHrgn(graphics: COpaquePointer?, hrgn: Hrgn, combinemode: CombineMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetClipHrgn((graphics?.value ?: 0L).toString(), (hrgn?.value ?: 0L).toString(), combinemode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetClipPath(graphics: COpaquePointer?, path: COpaquePointer?, combinemode: CombineMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetClipPath((graphics?.value ?: 0L).toString(), (path?.value ?: 0L).toString(), combinemode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetClipRect(graphics: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, combinemode: CombineMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetClipRect((graphics?.value ?: 0L).toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), combinemode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetClipRectI(graphics: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, combinemode: CombineMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetClipRectI((graphics?.value ?: 0L).toString(), x, y, width, height, combinemode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetClipRegion(graphics: COpaquePointer?, region: COpaquePointer?, combinemode: CombineMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetClipRegion((graphics?.value ?: 0L).toString(), (region?.value ?: 0L).toString(), combinemode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetCompositingMode(graphics: COpaquePointer?, compositingmode: CompositingMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetCompositingMode((graphics?.value ?: 0L).toString(), compositingmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetCompositingQuality(graphics: COpaquePointer?, compositingquality: CompositingQuality): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetCompositingQuality((graphics?.value ?: 0L).toString(), compositingquality) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetCustomLineCapBaseCap(customcap: COpaquePointer?, basecap: LineCap): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetCustomLineCapBaseCap((customcap?.value ?: 0L).toString(), basecap) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetCustomLineCapBaseInset(customcap: COpaquePointer?, inset: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetCustomLineCapBaseInset((customcap?.value ?: 0L).toString(), inset.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetCustomLineCapStrokeCaps(customcap: COpaquePointer?, startcap: LineCap, endcap: LineCap): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetCustomLineCapStrokeCaps((customcap?.value ?: 0L).toString(), startcap, endcap) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetCustomLineCapStrokeJoin(customcap: COpaquePointer?, linejoin: LineJoin): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetCustomLineCapStrokeJoin((customcap?.value ?: 0L).toString(), linejoin) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetCustomLineCapWidthScale(customcap: COpaquePointer?, widthscale: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetCustomLineCapWidthScale((customcap?.value ?: 0L).toString(), widthscale.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetEffectParameters(effect: COpaquePointer?, params: COpaquePointer?, size: UInt): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetEffectParameters((effect?.value ?: 0L).toString(), (params?.value ?: 0L).toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetEmpty(region: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetEmpty((region?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesCachedBackground(imageattr: COpaquePointer?, enableflag: Bool): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetImageAttributesCachedBackground((imageattr?.value ?: 0L).toString(), enableflag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesColorKeys(imageattr: COpaquePointer?, type: ColorAdjustType, enableflag: Bool, colorlow: UInt, colorhigh: UInt): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetImageAttributesColorKeys((imageattr?.value ?: 0L).toString(), type, enableflag, colorlow.toInt(), colorhigh.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesColorMatrix(imageattr: COpaquePointer?, type: ColorAdjustType, enableflag: Bool, colormatrix: COpaquePointer?, graymatrix: COpaquePointer?, flags: ColorMatrixFlags): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetImageAttributesColorMatrix((imageattr?.value ?: 0L).toString(), type, enableflag, (colormatrix?.value ?: 0L).toString(), (graymatrix?.value ?: 0L).toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesGamma(imageattr: COpaquePointer?, type: ColorAdjustType, enableflag: Bool, gamma: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetImageAttributesGamma((imageattr?.value ?: 0L).toString(), type, enableflag, gamma.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesNoOp(imageattr: COpaquePointer?, type: ColorAdjustType, enableflag: Bool): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetImageAttributesNoOp((imageattr?.value ?: 0L).toString(), type, enableflag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesOutputChannel(imageattr: COpaquePointer?, type: ColorAdjustType, enableflag: Bool, channelflags: ColorChannelFlags): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetImageAttributesOutputChannel((imageattr?.value ?: 0L).toString(), type, enableflag, channelflags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesOutputChannelColorProfile(imageattr: COpaquePointer?, type: ColorAdjustType, enableflag: Bool, colorprofilefilename: Pcwstr): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetImageAttributesOutputChannelColorProfile((imageattr?.value ?: 0L).toString(), type, enableflag, (colorprofilefilename?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesRemapTable(imageattr: COpaquePointer?, type: ColorAdjustType, enableflag: Bool, mapsize: UInt, map: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetImageAttributesRemapTable((imageattr?.value ?: 0L).toString(), type, enableflag, mapsize.toInt(), (map?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesThreshold(imageattr: COpaquePointer?, type: ColorAdjustType, enableflag: Bool, threshold: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetImageAttributesThreshold((imageattr?.value ?: 0L).toString(), type, enableflag, threshold.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesToIdentity(imageattr: COpaquePointer?, type: ColorAdjustType): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetImageAttributesToIdentity((imageattr?.value ?: 0L).toString(), type) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesWrapMode(imageattr: COpaquePointer?, wrap: WrapMode, argb: UInt, clamp: Bool): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetImageAttributesWrapMode((imageattr?.value ?: 0L).toString(), wrap, argb.toInt(), clamp) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImagePalette(image: COpaquePointer?, palette: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetImagePalette((image?.value ?: 0L).toString(), (palette?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetInfinite(region: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetInfinite((region?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetInterpolationMode(graphics: COpaquePointer?, interpolationmode: InterpolationMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetInterpolationMode((graphics?.value ?: 0L).toString(), interpolationmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetLineBlend(brush: COpaquePointer?, blend: COpaquePointer?, positions: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetLineBlend((brush?.value ?: 0L).toString(), (blend?.value ?: 0L).toString(), (positions?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetLineColors(brush: COpaquePointer?, color1: UInt, color2: UInt): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetLineColors((brush?.value ?: 0L).toString(), color1.toInt(), color2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetLineGammaCorrection(brush: COpaquePointer?, usegammacorrection: Bool): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetLineGammaCorrection((brush?.value ?: 0L).toString(), usegammacorrection) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetLineLinearBlend(brush: COpaquePointer?, focus: Float, scale: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetLineLinearBlend((brush?.value ?: 0L).toString(), focus.toDouble(), scale.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetLinePresetBlend(brush: COpaquePointer?, blend: COpaquePointer?, positions: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetLinePresetBlend((brush?.value ?: 0L).toString(), (blend?.value ?: 0L).toString(), (positions?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetLineSigmaBlend(brush: COpaquePointer?, focus: Float, scale: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetLineSigmaBlend((brush?.value ?: 0L).toString(), focus.toDouble(), scale.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetLineTransform(brush: COpaquePointer?, matrix: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetLineTransform((brush?.value ?: 0L).toString(), (matrix?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetLineWrapMode(brush: COpaquePointer?, wrapmode: WrapMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetLineWrapMode((brush?.value ?: 0L).toString(), wrapmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetMatrixElements(matrix: COpaquePointer?, m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetMatrixElements((matrix?.value ?: 0L).toString(), m11.toDouble(), m12.toDouble(), m21.toDouble(), m22.toDouble(), dx.toDouble(), dy.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetMetafileDownLevelRasterizationLimit(metafile: COpaquePointer?, metafilerasterizationlimitdpi: UInt): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetMetafileDownLevelRasterizationLimit((metafile?.value ?: 0L).toString(), metafilerasterizationlimitdpi.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPageScale(graphics: COpaquePointer?, scale: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPageScale((graphics?.value ?: 0L).toString(), scale.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPageUnit(graphics: COpaquePointer?, unit: Unit): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPageUnit((graphics?.value ?: 0L).toString(), unit) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathFillMode(path: COpaquePointer?, fillmode: FillMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPathFillMode((path?.value ?: 0L).toString(), fillmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientBlend(brush: COpaquePointer?, blend: COpaquePointer?, positions: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientBlend((brush?.value ?: 0L).toString(), (blend?.value ?: 0L).toString(), (positions?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientCenterColor(brush: COpaquePointer?, colors: UInt): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientCenterColor((brush?.value ?: 0L).toString(), colors.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientCenterPoint(brush: COpaquePointer?, points: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientCenterPoint((brush?.value ?: 0L).toString(), (points?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientCenterPointI(brush: COpaquePointer?, points: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientCenterPointI((brush?.value ?: 0L).toString(), (points?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientFocusScales(brush: COpaquePointer?, xscale: Float, yscale: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientFocusScales((brush?.value ?: 0L).toString(), xscale.toDouble(), yscale.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientGammaCorrection(brush: COpaquePointer?, usegammacorrection: Bool): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientGammaCorrection((brush?.value ?: 0L).toString(), usegammacorrection) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientLinearBlend(brush: COpaquePointer?, focus: Float, scale: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientLinearBlend((brush?.value ?: 0L).toString(), focus.toDouble(), scale.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientPath(brush: COpaquePointer?, path: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientPath((brush?.value ?: 0L).toString(), (path?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientPresetBlend(brush: COpaquePointer?, blend: COpaquePointer?, positions: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientPresetBlend((brush?.value ?: 0L).toString(), (blend?.value ?: 0L).toString(), (positions?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientSigmaBlend(brush: COpaquePointer?, focus: Float, scale: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientSigmaBlend((brush?.value ?: 0L).toString(), focus.toDouble(), scale.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientSurroundColorsWithCount(brush: COpaquePointer?, color: COpaquePointer?, count: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientSurroundColorsWithCount((brush?.value ?: 0L).toString(), (color?.value ?: 0L).toString(), (count?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientTransform(brush: COpaquePointer?, matrix: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientTransform((brush?.value ?: 0L).toString(), (matrix?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientWrapMode(brush: COpaquePointer?, wrapmode: WrapMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientWrapMode((brush?.value ?: 0L).toString(), wrapmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathMarker(path: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPathMarker((path?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenBrushFill(pen: COpaquePointer?, brush: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPenBrushFill((pen?.value ?: 0L).toString(), (brush?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenColor(pen: COpaquePointer?, argb: UInt): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPenColor((pen?.value ?: 0L).toString(), argb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenCompoundArray(pen: COpaquePointer?, dash: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPenCompoundArray((pen?.value ?: 0L).toString(), (dash?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenCustomEndCap(pen: COpaquePointer?, customcap: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPenCustomEndCap((pen?.value ?: 0L).toString(), (customcap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenCustomStartCap(pen: COpaquePointer?, customcap: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPenCustomStartCap((pen?.value ?: 0L).toString(), (customcap?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenDashArray(pen: COpaquePointer?, dash: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPenDashArray((pen?.value ?: 0L).toString(), (dash?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenDashCap197819(pen: COpaquePointer?, dashcap: DashCap): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPenDashCap197819((pen?.value ?: 0L).toString(), dashcap) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenDashOffset(pen: COpaquePointer?, offset: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPenDashOffset((pen?.value ?: 0L).toString(), offset.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenDashStyle(pen: COpaquePointer?, dashstyle: DashStyle): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPenDashStyle((pen?.value ?: 0L).toString(), dashstyle) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenEndCap(pen: COpaquePointer?, endcap: LineCap): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPenEndCap((pen?.value ?: 0L).toString(), endcap) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenLineCap197819(pen: COpaquePointer?, startcap: LineCap, endcap: LineCap, dashcap: DashCap): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPenLineCap197819((pen?.value ?: 0L).toString(), startcap, endcap, dashcap) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenLineJoin(pen: COpaquePointer?, linejoin: LineJoin): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPenLineJoin((pen?.value ?: 0L).toString(), linejoin) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenMiterLimit(pen: COpaquePointer?, miterlimit: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPenMiterLimit((pen?.value ?: 0L).toString(), miterlimit.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenMode(pen: COpaquePointer?, penmode: PenAlignment): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPenMode((pen?.value ?: 0L).toString(), penmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenStartCap(pen: COpaquePointer?, startcap: LineCap): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPenStartCap((pen?.value ?: 0L).toString(), startcap) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenTransform(pen: COpaquePointer?, matrix: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPenTransform((pen?.value ?: 0L).toString(), (matrix?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenUnit(pen: COpaquePointer?, unit: Unit): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPenUnit((pen?.value ?: 0L).toString(), unit) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenWidth(pen: COpaquePointer?, width: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPenWidth((pen?.value ?: 0L).toString(), width.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPixelOffsetMode(graphics: COpaquePointer?, pixeloffsetmode: PixelOffsetMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPixelOffsetMode((graphics?.value ?: 0L).toString(), pixeloffsetmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPropertyItem(image: COpaquePointer?, item: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetPropertyItem((image?.value ?: 0L).toString(), (item?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetRenderingOrigin(graphics: COpaquePointer?, x: Int, y: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetRenderingOrigin((graphics?.value ?: 0L).toString(), x, y) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetSmoothingMode(graphics: COpaquePointer?, smoothingmode: SmoothingMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetSmoothingMode((graphics?.value ?: 0L).toString(), smoothingmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetSolidFillColor(brush: COpaquePointer?, color: UInt): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetSolidFillColor((brush?.value ?: 0L).toString(), color.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetStringFormatAlign(format: COpaquePointer?, align: StringAlignment): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetStringFormatAlign((format?.value ?: 0L).toString(), align) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetStringFormatDigitSubstitution(format: COpaquePointer?, language: UShort, substitute: StringDigitSubstitute): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetStringFormatDigitSubstitution((format?.value ?: 0L).toString(), language.toInt(), substitute) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetStringFormatFlags(format: COpaquePointer?, flags: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetStringFormatFlags((format?.value ?: 0L).toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetStringFormatHotkeyPrefix(format: COpaquePointer?, hotkeyprefix: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetStringFormatHotkeyPrefix((format?.value ?: 0L).toString(), hotkeyprefix) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetStringFormatLineAlign(format: COpaquePointer?, align: StringAlignment): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetStringFormatLineAlign((format?.value ?: 0L).toString(), align) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetStringFormatMeasurableCharacterRanges(format: COpaquePointer?, rangecount: Int, ranges: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetStringFormatMeasurableCharacterRanges((format?.value ?: 0L).toString(), rangecount, (ranges?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetStringFormatTabStops(format: COpaquePointer?, firsttaboffset: Float, count: Int, tabstops: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetStringFormatTabStops((format?.value ?: 0L).toString(), firsttaboffset.toDouble(), count, (tabstops?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetStringFormatTrimming(format: COpaquePointer?, trimming: StringTrimming): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetStringFormatTrimming((format?.value ?: 0L).toString(), trimming) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetTextContrast(graphics: COpaquePointer?, contrast: UInt): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetTextContrast((graphics?.value ?: 0L).toString(), contrast.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetTextRenderingHint(graphics: COpaquePointer?, mode: TextRenderingHint): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetTextRenderingHint((graphics?.value ?: 0L).toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetTextureTransform(brush: COpaquePointer?, matrix: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetTextureTransform((brush?.value ?: 0L).toString(), (matrix?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetTextureWrapMode(brush: COpaquePointer?, wrapmode: WrapMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetTextureWrapMode((brush?.value ?: 0L).toString(), wrapmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetWorldTransform(graphics: COpaquePointer?, matrix: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipSetWorldTransform((graphics?.value ?: 0L).toString(), (matrix?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipShearMatrix(matrix: COpaquePointer?, shearx: Float, sheary: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipShearMatrix((matrix?.value ?: 0L).toString(), shearx.toDouble(), sheary.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipStartPathFigure(path: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipStartPathFigure((path?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipStringFormatGetGenericDefault(format: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipStringFormatGetGenericDefault((format?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipStringFormatGetGenericTypographic(format: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipStringFormatGetGenericTypographic((format?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTestControl(control: GpTestControlEnum, param1: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipTestControl(control, (param1?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTransformMatrixPoints(matrix: COpaquePointer?, pts: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipTransformMatrixPoints((matrix?.value ?: 0L).toString(), (pts?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTransformMatrixPointsI(matrix: COpaquePointer?, pts: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipTransformMatrixPointsI((matrix?.value ?: 0L).toString(), (pts?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTransformPath(path: COpaquePointer?, matrix: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipTransformPath((path?.value ?: 0L).toString(), (matrix?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTransformPoints(graphics: COpaquePointer?, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipTransformPoints((graphics?.value ?: 0L).toString(), destspace, srcspace, (points?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTransformPointsI(graphics: COpaquePointer?, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipTransformPointsI((graphics?.value ?: 0L).toString(), destspace, srcspace, (points?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTransformRegion(region: COpaquePointer?, matrix: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipTransformRegion((region?.value ?: 0L).toString(), (matrix?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslateClip(graphics: COpaquePointer?, dx: Float, dy: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipTranslateClip((graphics?.value ?: 0L).toString(), dx.toDouble(), dy.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslateClipI(graphics: COpaquePointer?, dx: Int, dy: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipTranslateClipI((graphics?.value ?: 0L).toString(), dx, dy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslateLineTransform(brush: COpaquePointer?, dx: Float, dy: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipTranslateLineTransform((brush?.value ?: 0L).toString(), dx.toDouble(), dy.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslateMatrix(matrix: COpaquePointer?, offsetx: Float, offsety: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipTranslateMatrix((matrix?.value ?: 0L).toString(), offsetx.toDouble(), offsety.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslatePathGradientTransform(brush: COpaquePointer?, dx: Float, dy: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipTranslatePathGradientTransform((brush?.value ?: 0L).toString(), dx.toDouble(), dy.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslatePenTransform(pen: COpaquePointer?, dx: Float, dy: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipTranslatePenTransform((pen?.value ?: 0L).toString(), dx.toDouble(), dy.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslateRegion(region: COpaquePointer?, dx: Float, dy: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipTranslateRegion((region?.value ?: 0L).toString(), dx.toDouble(), dy.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslateRegionI(region: COpaquePointer?, dx: Int, dy: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipTranslateRegionI((region?.value ?: 0L).toString(), dx, dy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslateTextureTransform(brush: COpaquePointer?, dx: Float, dy: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipTranslateTextureTransform((brush?.value ?: 0L).toString(), dx.toDouble(), dy.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslateWorldTransform(graphics: COpaquePointer?, dx: Float, dy: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipTranslateWorldTransform((graphics?.value ?: 0L).toString(), dx.toDouble(), dy.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipVectorTransformMatrixPoints(matrix: COpaquePointer?, pts: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipVectorTransformMatrixPoints((matrix?.value ?: 0L).toString(), (pts?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipVectorTransformMatrixPointsI(matrix: COpaquePointer?, pts: COpaquePointer?, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipVectorTransformMatrixPointsI((matrix?.value ?: 0L).toString(), (pts?.value ?: 0L).toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipWarpPath(path: COpaquePointer?, matrix: COpaquePointer?, points: COpaquePointer?, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, warpmode: WarpMode, flatness: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipWarpPath((path?.value ?: 0L).toString(), (matrix?.value ?: 0L).toString(), (points?.value ?: 0L).toString(), count, srcx.toDouble(), srcy.toDouble(), srcwidth.toDouble(), srcheight.toDouble(), warpmode, flatness.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipWidenPath(nativepath: COpaquePointer?, pen: COpaquePointer?, matrix: COpaquePointer?, flatness: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipWidenPath((nativepath?.value ?: 0L).toString(), (pen?.value ?: 0L).toString(), (matrix?.value ?: 0L).toString(), flatness.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipWindingModeOutline(path: COpaquePointer?, matrix: COpaquePointer?, flatness: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdipWindingModeOutline((path?.value ?: 0L).toString(), (matrix?.value ?: 0L).toString(), flatness.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiplusNotificationHook(token: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdiplusNotificationHook((token?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiplusNotificationUnhook(token: ULong) {
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) {
        _windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdiplusNotificationUnhook(token.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gdiplusShutdown(token: ULong) {
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) {
        _windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdiplusShutdown(token.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gdiplusStartup(token: COpaquePointer?, input: COpaquePointer?, output: COpaquePointer?): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_gdiplusStartup((token?.value ?: 0L).toString(), (input?.value ?: 0L).toString(), (output?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
