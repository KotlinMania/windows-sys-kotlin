@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Bitmapinfo
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Henhmetafile
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hmetafile
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hrgn
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Logfonta
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Logfontw
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon

private val windowsWin32GraphicsGdiplusNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun gdipAddPathArc(path: MutPtr<GpPath>, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathArc(path.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), startangle.toDouble(), sweepangle.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathArcI(path: MutPtr<GpPath>, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathArcI(path.rawAddress.toString(), x, y, width, height, startangle.toDouble(), sweepangle.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathBezier(path: MutPtr<GpPath>, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathBezier(path.rawAddress.toString(), x1.toDouble(), y1.toDouble(), x2.toDouble(), y2.toDouble(), x3.toDouble(), y3.toDouble(), x4.toDouble(), y4.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathBezierI(path: MutPtr<GpPath>, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathBezierI(path.rawAddress.toString(), x1, y1, x2, y2, x3, y3, x4, y4) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathBeziers(path: MutPtr<GpPath>, points: ConstPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathBeziers(path.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathBeziersI(path: MutPtr<GpPath>, points: ConstPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathBeziersI(path.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathClosedCurve(path: MutPtr<GpPath>, points: ConstPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurve(path.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathClosedCurve2(path: MutPtr<GpPath>, points: ConstPtr<PointF>, count: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurve2(path.rawAddress.toString(), points.rawAddress.toString(), count, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathClosedCurve2I(path: MutPtr<GpPath>, points: ConstPtr<Point>, count: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurve2I(path.rawAddress.toString(), points.rawAddress.toString(), count, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathClosedCurveI(path: MutPtr<GpPath>, points: ConstPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurveI(path.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathCurve(path: MutPtr<GpPath>, points: ConstPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve(path.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathCurve2(path: MutPtr<GpPath>, points: ConstPtr<PointF>, count: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve2(path.rawAddress.toString(), points.rawAddress.toString(), count, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathCurve2I(path: MutPtr<GpPath>, points: ConstPtr<Point>, count: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve2I(path.rawAddress.toString(), points.rawAddress.toString(), count, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathCurve3(path: MutPtr<GpPath>, points: ConstPtr<PointF>, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve3(path.rawAddress.toString(), points.rawAddress.toString(), count, offset, numberofsegments, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathCurve3I(path: MutPtr<GpPath>, points: ConstPtr<Point>, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve3I(path.rawAddress.toString(), points.rawAddress.toString(), count, offset, numberofsegments, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathCurveI(path: MutPtr<GpPath>, points: ConstPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurveI(path.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathEllipse(path: MutPtr<GpPath>, x: Float, y: Float, width: Float, height: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathEllipse(path.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathEllipseI(path: MutPtr<GpPath>, x: Int, y: Int, width: Int, height: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathEllipseI(path.rawAddress.toString(), x, y, width, height) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathLine(path: MutPtr<GpPath>, x1: Float, y1: Float, x2: Float, y2: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathLine(path.rawAddress.toString(), x1.toDouble(), y1.toDouble(), x2.toDouble(), y2.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathLine2(path: MutPtr<GpPath>, points: ConstPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathLine2(path.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathLine2I(path: MutPtr<GpPath>, points: ConstPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathLine2I(path.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathLineI(path: MutPtr<GpPath>, x1: Int, y1: Int, x2: Int, y2: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathLineI(path.rawAddress.toString(), x1, y1, x2, y2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathPath(path: MutPtr<GpPath>, addingpath: ConstPtr<GpPath>, connect: Bool): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathPath(path.rawAddress.toString(), addingpath.rawAddress.toString(), connect) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathPie(path: MutPtr<GpPath>, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathPie(path.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), startangle.toDouble(), sweepangle.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathPieI(path: MutPtr<GpPath>, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathPieI(path.rawAddress.toString(), x, y, width, height, startangle.toDouble(), sweepangle.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathPolygon(path: MutPtr<GpPath>, points: ConstPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathPolygon(path.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathPolygonI(path: MutPtr<GpPath>, points: ConstPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathPolygonI(path.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathRectangle(path: MutPtr<GpPath>, x: Float, y: Float, width: Float, height: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectangle(path.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathRectangleI(path: MutPtr<GpPath>, x: Int, y: Int, width: Int, height: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectangleI(path.rawAddress.toString(), x, y, width, height) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathRectangles(path: MutPtr<GpPath>, rects: ConstPtr<RectF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectangles(path.rawAddress.toString(), rects.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathRectanglesI(path: MutPtr<GpPath>, rects: ConstPtr<Rect>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectanglesI(path.rawAddress.toString(), rects.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathString(path: MutPtr<GpPath>, string: Pcwstr, length: Int, family: ConstPtr<GpFontFamily>, style: Int, emsize: Float, layoutrect: ConstPtr<RectF>, format: ConstPtr<GpStringFormat>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathString(path.rawAddress.toString(), string.rawAddress.toString(), length, family.rawAddress.toString(), style, emsize.toDouble(), layoutrect.rawAddress.toString(), format.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathStringI(path: MutPtr<GpPath>, string: Pcwstr, length: Int, family: ConstPtr<GpFontFamily>, style: Int, emsize: Float, layoutrect: ConstPtr<Rect>, format: ConstPtr<GpStringFormat>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathStringI(path.rawAddress.toString(), string.rawAddress.toString(), length, family.rawAddress.toString(), style, emsize.toDouble(), layoutrect.rawAddress.toString(), format.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAlloc(size: ULong): MutPtr<CVoid> =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) MutPtr((windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAlloc(size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBeginContainer(graphics: MutPtr<GpGraphics>, dstrect: ConstPtr<RectF>, srcrect: ConstPtr<RectF>, unit: Unit, state: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipBeginContainer(graphics.rawAddress.toString(), dstrect.rawAddress.toString(), srcrect.rawAddress.toString(), unit, state.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBeginContainer2(graphics: MutPtr<GpGraphics>, state: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipBeginContainer2(graphics.rawAddress.toString(), state.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBeginContainerI(graphics: MutPtr<GpGraphics>, dstrect: ConstPtr<Rect>, srcrect: ConstPtr<Rect>, unit: Unit, state: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipBeginContainerI(graphics.rawAddress.toString(), dstrect.rawAddress.toString(), srcrect.rawAddress.toString(), unit, state.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapApplyEffect(bitmap: MutPtr<GpBitmap>, effect: MutPtr<CGpEffect>, roi: MutPtr<io.github.kotlinmania.windowssys.windows.win32.foundation.Rect>, useauxdata: Bool, auxdata: MutPtr<MutPtr<CVoid>>, auxdatasize: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipBitmapApplyEffect(bitmap.rawAddress.toString(), effect.rawAddress.toString(), roi.rawAddress.toString(), useauxdata, auxdata.rawAddress.toString(), auxdatasize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapConvertFormat(pinputbitmap: MutPtr<GpBitmap>, format: Int, dithertype: DitherType, palettetype: PaletteType, palette: MutPtr<ColorPalette>, alphathresholdpercent: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipBitmapConvertFormat(pinputbitmap.rawAddress.toString(), format, dithertype, palettetype, palette.rawAddress.toString(), alphathresholdpercent.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapCreateApplyEffect(inputbitmaps: MutPtr<MutPtr<GpBitmap>>, numinputs: Int, effect: MutPtr<CGpEffect>, roi: MutPtr<io.github.kotlinmania.windowssys.windows.win32.foundation.Rect>, outputrect: MutPtr<io.github.kotlinmania.windowssys.windows.win32.foundation.Rect>, outputbitmap: MutPtr<MutPtr<GpBitmap>>, useauxdata: Bool, auxdata: MutPtr<MutPtr<CVoid>>, auxdatasize: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipBitmapCreateApplyEffect(inputbitmaps.rawAddress.toString(), numinputs, effect.rawAddress.toString(), roi.rawAddress.toString(), outputrect.rawAddress.toString(), outputbitmap.rawAddress.toString(), useauxdata, auxdata.rawAddress.toString(), auxdatasize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapGetHistogram(bitmap: MutPtr<GpBitmap>, format: HistogramFormat, numberofentries: UInt, channel0: MutPtr<UInt>, channel1: MutPtr<UInt>, channel2: MutPtr<UInt>, channel3: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipBitmapGetHistogram(bitmap.rawAddress.toString(), format, numberofentries.toInt(), channel0.rawAddress.toString(), channel1.rawAddress.toString(), channel2.rawAddress.toString(), channel3.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapGetHistogramSize(format: HistogramFormat, numberofentries: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipBitmapGetHistogramSize(format, numberofentries.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapGetPixel(bitmap: MutPtr<GpBitmap>, x: Int, y: Int, color: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipBitmapGetPixel(bitmap.rawAddress.toString(), x, y, color.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapLockBits(bitmap: MutPtr<GpBitmap>, rect: ConstPtr<Rect>, flags: UInt, format: Int, lockedbitmapdata: MutPtr<BitmapData>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipBitmapLockBits(bitmap.rawAddress.toString(), rect.rawAddress.toString(), flags.toInt(), format, lockedbitmapdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapSetPixel(bitmap: MutPtr<GpBitmap>, x: Int, y: Int, color: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipBitmapSetPixel(bitmap.rawAddress.toString(), x, y, color.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapSetResolution(bitmap: MutPtr<GpBitmap>, xdpi: Float, ydpi: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipBitmapSetResolution(bitmap.rawAddress.toString(), xdpi.toDouble(), ydpi.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapUnlockBits(bitmap: MutPtr<GpBitmap>, lockedbitmapdata: MutPtr<BitmapData>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipBitmapUnlockBits(bitmap.rawAddress.toString(), lockedbitmapdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipClearPathMarkers(path: MutPtr<GpPath>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipClearPathMarkers(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneBitmapArea(x: Float, y: Float, width: Float, height: Float, format: Int, srcbitmap: MutPtr<GpBitmap>, dstbitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCloneBitmapArea(x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), format, srcbitmap.rawAddress.toString(), dstbitmap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneBitmapAreaI(x: Int, y: Int, width: Int, height: Int, format: Int, srcbitmap: MutPtr<GpBitmap>, dstbitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCloneBitmapAreaI(x, y, width, height, format, srcbitmap.rawAddress.toString(), dstbitmap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneBrush(brush: MutPtr<GpBrush>, clonebrush: MutPtr<MutPtr<GpBrush>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCloneBrush(brush.rawAddress.toString(), clonebrush.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneCustomLineCap(customcap: MutPtr<GpCustomLineCap>, clonedcap: MutPtr<MutPtr<GpCustomLineCap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCloneCustomLineCap(customcap.rawAddress.toString(), clonedcap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneFont(font: MutPtr<GpFont>, clonefont: MutPtr<MutPtr<GpFont>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCloneFont(font.rawAddress.toString(), clonefont.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneFontFamily(fontfamily: MutPtr<GpFontFamily>, clonedfontfamily: MutPtr<MutPtr<GpFontFamily>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCloneFontFamily(fontfamily.rawAddress.toString(), clonedfontfamily.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneImage(image: MutPtr<GpImage>, cloneimage: MutPtr<MutPtr<GpImage>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCloneImage(image.rawAddress.toString(), cloneimage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneImageAttributes(imageattr: ConstPtr<GpImageAttributes>, cloneimageattr: MutPtr<MutPtr<GpImageAttributes>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCloneImageAttributes(imageattr.rawAddress.toString(), cloneimageattr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneMatrix(matrix: MutPtr<Matrix>, clonematrix: MutPtr<MutPtr<Matrix>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCloneMatrix(matrix.rawAddress.toString(), clonematrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipClonePath(path: MutPtr<GpPath>, clonepath: MutPtr<MutPtr<GpPath>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipClonePath(path.rawAddress.toString(), clonepath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipClonePen(pen: MutPtr<GpPen>, clonepen: MutPtr<MutPtr<GpPen>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipClonePen(pen.rawAddress.toString(), clonepen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneRegion(region: MutPtr<GpRegion>, cloneregion: MutPtr<MutPtr<GpRegion>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCloneRegion(region.rawAddress.toString(), cloneregion.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneStringFormat(format: ConstPtr<GpStringFormat>, newformat: MutPtr<MutPtr<GpStringFormat>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCloneStringFormat(format.rawAddress.toString(), newformat.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipClosePathFigure(path: MutPtr<GpPath>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipClosePathFigure(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipClosePathFigures(path: MutPtr<GpPath>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipClosePathFigures(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCombineRegionPath(region: MutPtr<GpRegion>, path: MutPtr<GpPath>, combinemode: CombineMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionPath(region.rawAddress.toString(), path.rawAddress.toString(), combinemode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCombineRegionRect(region: MutPtr<GpRegion>, rect: ConstPtr<RectF>, combinemode: CombineMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionRect(region.rawAddress.toString(), rect.rawAddress.toString(), combinemode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCombineRegionRectI(region: MutPtr<GpRegion>, rect: ConstPtr<Rect>, combinemode: CombineMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionRectI(region.rawAddress.toString(), rect.rawAddress.toString(), combinemode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCombineRegionRegion(region: MutPtr<GpRegion>, region2: MutPtr<GpRegion>, combinemode: CombineMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionRegion(region.rawAddress.toString(), region2.rawAddress.toString(), combinemode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipComment(graphics: MutPtr<GpGraphics>, sizedata: UInt, data: ConstPtr<UByte>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipComment(graphics.rawAddress.toString(), sizedata.toInt(), data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipConvertToEmfPlus(refgraphics: ConstPtr<GpGraphics>, metafile: MutPtr<GpMetafile>, conversionfailureflag: MutPtr<Int>, emftype: EmfType, description: Pcwstr, outMetafile: MutPtr<MutPtr<GpMetafile>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipConvertToEmfPlus(refgraphics.rawAddress.toString(), metafile.rawAddress.toString(), conversionfailureflag.rawAddress.toString(), emftype, description.rawAddress.toString(), outMetafile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipConvertToEmfPlusToFile(refgraphics: ConstPtr<GpGraphics>, metafile: MutPtr<GpMetafile>, conversionfailureflag: MutPtr<Int>, filename: Pcwstr, emftype: EmfType, description: Pcwstr, outMetafile: MutPtr<MutPtr<GpMetafile>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipConvertToEmfPlusToFile(refgraphics.rawAddress.toString(), metafile.rawAddress.toString(), conversionfailureflag.rawAddress.toString(), filename.rawAddress.toString(), emftype, description.rawAddress.toString(), outMetafile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipConvertToEmfPlusToStream(refgraphics: ConstPtr<GpGraphics>, metafile: MutPtr<GpMetafile>, conversionfailureflag: MutPtr<Int>, stream: MutPtr<CVoid>, emftype: EmfType, description: Pcwstr, outMetafile: MutPtr<MutPtr<GpMetafile>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipConvertToEmfPlusToStream(refgraphics.rawAddress.toString(), metafile.rawAddress.toString(), conversionfailureflag.rawAddress.toString(), stream.rawAddress.toString(), emftype, description.rawAddress.toString(), outMetafile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateAdjustableArrowCap(height: Float, width: Float, isfilled: Bool, cap: MutPtr<MutPtr<GpAdjustableArrowCap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateAdjustableArrowCap(height.toDouble(), width.toDouble(), isfilled, cap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromFile(filename: Pcwstr, bitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromFile(filename.rawAddress.toString(), bitmap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromFileICM(filename: Pcwstr, bitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromFileICM(filename.rawAddress.toString(), bitmap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromGdiDib(gdibitmapinfo: ConstPtr<Bitmapinfo>, gdibitmapdata: MutPtr<CVoid>, bitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromGdiDib(gdibitmapinfo.rawAddress.toString(), gdibitmapdata.rawAddress.toString(), bitmap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromGraphics(width: Int, height: Int, target: MutPtr<GpGraphics>, bitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromGraphics(width, height, target.rawAddress.toString(), bitmap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromHBITMAP(hbm: Hbitmap, hpal: Hpalette, bitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromHBITMAP(hbm.rawAddress.toString(), hpal.rawAddress.toString(), bitmap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromHICON(hicon: Hicon, bitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromHICON(hicon.rawAddress.toString(), bitmap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromResource(hinstance: Hinstance, lpbitmapname: Pcwstr, bitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromResource(hinstance.rawAddress.toString(), lpbitmapname.rawAddress.toString(), bitmap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromScan0(width: Int, height: Int, stride: Int, format: Int, scan0: ConstPtr<UByte>, bitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromScan0(width, height, stride, format, scan0.rawAddress.toString(), bitmap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromStream(stream: MutPtr<CVoid>, bitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromStream(stream.rawAddress.toString(), bitmap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromStreamICM(stream: MutPtr<CVoid>, bitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromStreamICM(stream.rawAddress.toString(), bitmap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateCachedBitmap(bitmap: MutPtr<GpBitmap>, graphics: MutPtr<GpGraphics>, cachedbitmap: MutPtr<MutPtr<GpCachedBitmap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateCachedBitmap(bitmap.rawAddress.toString(), graphics.rawAddress.toString(), cachedbitmap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateCustomLineCap(fillpath: MutPtr<GpPath>, strokepath: MutPtr<GpPath>, basecap: LineCap, baseinset: Float, customcap: MutPtr<MutPtr<GpCustomLineCap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateCustomLineCap(fillpath.rawAddress.toString(), strokepath.rawAddress.toString(), basecap, baseinset.toDouble(), customcap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateEffect(guid: Guid, effect: MutPtr<MutPtr<CGpEffect>>): Status =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFont(fontfamily: ConstPtr<GpFontFamily>, emsize: Float, style: Int, unit: Unit, font: MutPtr<MutPtr<GpFont>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateFont(fontfamily.rawAddress.toString(), emsize.toDouble(), style, unit, font.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFontFamilyFromName(name: Pcwstr, fontcollection: MutPtr<GpFontCollection>, fontfamily: MutPtr<MutPtr<GpFontFamily>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFamilyFromName(name.rawAddress.toString(), fontcollection.rawAddress.toString(), fontfamily.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFontFromDC(hdc: Hdc, font: MutPtr<MutPtr<GpFont>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFromDC(hdc.rawAddress.toString(), font.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFontFromLogfontA(hdc: Hdc, logfont: ConstPtr<Logfonta>, font: MutPtr<MutPtr<GpFont>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFromLogfontA(hdc.rawAddress.toString(), logfont.rawAddress.toString(), font.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFontFromLogfontW(hdc: Hdc, logfont: ConstPtr<Logfontw>, font: MutPtr<MutPtr<GpFont>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFromLogfontW(hdc.rawAddress.toString(), logfont.rawAddress.toString(), font.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFromHDC(hdc: Hdc, graphics: MutPtr<MutPtr<GpGraphics>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHDC(hdc.rawAddress.toString(), graphics.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFromHDC2(hdc: Hdc, hdevice: Handle, graphics: MutPtr<MutPtr<GpGraphics>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHDC2(hdc.rawAddress.toString(), hdevice.rawAddress.toString(), graphics.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFromHWND(hwnd: Hwnd, graphics: MutPtr<MutPtr<GpGraphics>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHWND(hwnd.rawAddress.toString(), graphics.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFromHWNDICM(hwnd: Hwnd, graphics: MutPtr<MutPtr<GpGraphics>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHWNDICM(hwnd.rawAddress.toString(), graphics.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateHBITMAPFromBitmap(bitmap: MutPtr<GpBitmap>, hbmreturn: MutPtr<Hbitmap>, background: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateHBITMAPFromBitmap(bitmap.rawAddress.toString(), hbmreturn.rawAddress.toString(), background.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateHICONFromBitmap(bitmap: MutPtr<GpBitmap>, hbmreturn: MutPtr<Hicon>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateHICONFromBitmap(bitmap.rawAddress.toString(), hbmreturn.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateHalftonePalette(): Hpalette =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) MutPtr((windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateHalftonePalette() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateHatchBrush(hatchstyle: HatchStyle, forecol: UInt, backcol: UInt, brush: MutPtr<MutPtr<GpHatch>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateHatchBrush(hatchstyle, forecol.toInt(), backcol.toInt(), brush.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateImageAttributes(imageattr: MutPtr<MutPtr<GpImageAttributes>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateImageAttributes(imageattr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateLineBrush(point1: ConstPtr<PointF>, point2: ConstPtr<PointF>, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: MutPtr<MutPtr<GpLineGradient>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrush(point1.rawAddress.toString(), point2.rawAddress.toString(), color1.toInt(), color2.toInt(), wrapmode, linegradient.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateLineBrushFromRect(rect: ConstPtr<RectF>, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: MutPtr<MutPtr<GpLineGradient>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRect(rect.rawAddress.toString(), color1.toInt(), color2.toInt(), mode, wrapmode, linegradient.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateLineBrushFromRectI(rect: ConstPtr<Rect>, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: MutPtr<MutPtr<GpLineGradient>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRectI(rect.rawAddress.toString(), color1.toInt(), color2.toInt(), mode, wrapmode, linegradient.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateLineBrushFromRectWithAngle(rect: ConstPtr<RectF>, color1: UInt, color2: UInt, angle: Float, isanglescalable: Bool, wrapmode: WrapMode, linegradient: MutPtr<MutPtr<GpLineGradient>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRectWithAngle(rect.rawAddress.toString(), color1.toInt(), color2.toInt(), angle.toDouble(), isanglescalable, wrapmode, linegradient.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateLineBrushFromRectWithAngleI(rect: ConstPtr<Rect>, color1: UInt, color2: UInt, angle: Float, isanglescalable: Bool, wrapmode: WrapMode, linegradient: MutPtr<MutPtr<GpLineGradient>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRectWithAngleI(rect.rawAddress.toString(), color1.toInt(), color2.toInt(), angle.toDouble(), isanglescalable, wrapmode, linegradient.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateLineBrushI(point1: ConstPtr<Point>, point2: ConstPtr<Point>, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: MutPtr<MutPtr<GpLineGradient>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushI(point1.rawAddress.toString(), point2.rawAddress.toString(), color1.toInt(), color2.toInt(), wrapmode, linegradient.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMatrix(matrix: MutPtr<MutPtr<Matrix>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix(matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMatrix2(m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float, matrix: MutPtr<MutPtr<Matrix>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix2(m11.toDouble(), m12.toDouble(), m21.toDouble(), m22.toDouble(), dx.toDouble(), dy.toDouble(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMatrix3(rect: ConstPtr<RectF>, dstplg: ConstPtr<PointF>, matrix: MutPtr<MutPtr<Matrix>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix3(rect.rawAddress.toString(), dstplg.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMatrix3I(rect: ConstPtr<Rect>, dstplg: ConstPtr<Point>, matrix: MutPtr<MutPtr<Matrix>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix3I(rect.rawAddress.toString(), dstplg.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMetafileFromEmf(hemf: Henhmetafile, deleteemf: Bool, metafile: MutPtr<MutPtr<GpMetafile>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromEmf(hemf.rawAddress.toString(), deleteemf, metafile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMetafileFromFile(file: Pcwstr, metafile: MutPtr<MutPtr<GpMetafile>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromFile(file.rawAddress.toString(), metafile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMetafileFromStream(stream: MutPtr<CVoid>, metafile: MutPtr<MutPtr<GpMetafile>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromStream(stream.rawAddress.toString(), metafile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMetafileFromWmf(hwmf: Hmetafile, deletewmf: Bool, wmfplaceablefileheader: ConstPtr<WmfPlaceableFileHeader>, metafile: MutPtr<MutPtr<GpMetafile>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromWmf(hwmf.rawAddress.toString(), deletewmf, wmfplaceablefileheader.rawAddress.toString(), metafile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMetafileFromWmfFile(file: Pcwstr, wmfplaceablefileheader: ConstPtr<WmfPlaceableFileHeader>, metafile: MutPtr<MutPtr<GpMetafile>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromWmfFile(file.rawAddress.toString(), wmfplaceablefileheader.rawAddress.toString(), metafile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePath(brushmode: FillMode, path: MutPtr<MutPtr<GpPath>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreatePath(brushmode, path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePath2(param0: ConstPtr<PointF>, param1: ConstPtr<UByte>, param2: Int, param3: FillMode, path: MutPtr<MutPtr<GpPath>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreatePath2(param0.rawAddress.toString(), param1.rawAddress.toString(), param2, param3, path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePath2I(param0: ConstPtr<Point>, param1: ConstPtr<UByte>, param2: Int, param3: FillMode, path: MutPtr<MutPtr<GpPath>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreatePath2I(param0.rawAddress.toString(), param1.rawAddress.toString(), param2, param3, path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePathGradient(points: ConstPtr<PointF>, count: Int, wrapmode: WrapMode, polygradient: MutPtr<MutPtr<GpPathGradient>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreatePathGradient(points.rawAddress.toString(), count, wrapmode, polygradient.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePathGradientFromPath(path: ConstPtr<GpPath>, polygradient: MutPtr<MutPtr<GpPathGradient>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreatePathGradientFromPath(path.rawAddress.toString(), polygradient.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePathGradientI(points: ConstPtr<Point>, count: Int, wrapmode: WrapMode, polygradient: MutPtr<MutPtr<GpPathGradient>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreatePathGradientI(points.rawAddress.toString(), count, wrapmode, polygradient.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePathIter(iterator: MutPtr<MutPtr<GpPathIterator>>, path: MutPtr<GpPath>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreatePathIter(iterator.rawAddress.toString(), path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePen1(color: UInt, width: Float, unit: Unit, pen: MutPtr<MutPtr<GpPen>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreatePen1(color.toInt(), width.toDouble(), unit, pen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePen2(brush: MutPtr<GpBrush>, width: Float, unit: Unit, pen: MutPtr<MutPtr<GpPen>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreatePen2(brush.rawAddress.toString(), width.toDouble(), unit, pen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateRegion(region: MutPtr<MutPtr<GpRegion>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateRegion(region.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateRegionHrgn(hrgn: Hrgn, region: MutPtr<MutPtr<GpRegion>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionHrgn(hrgn.rawAddress.toString(), region.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateRegionPath(path: MutPtr<GpPath>, region: MutPtr<MutPtr<GpRegion>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionPath(path.rawAddress.toString(), region.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateRegionRect(rect: ConstPtr<RectF>, region: MutPtr<MutPtr<GpRegion>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionRect(rect.rawAddress.toString(), region.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateRegionRectI(rect: ConstPtr<Rect>, region: MutPtr<MutPtr<GpRegion>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionRectI(rect.rawAddress.toString(), region.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateRegionRgnData(regiondata: ConstPtr<UByte>, size: Int, region: MutPtr<MutPtr<GpRegion>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionRgnData(regiondata.rawAddress.toString(), size, region.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateSolidFill(color: UInt, brush: MutPtr<MutPtr<GpSolidFill>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateSolidFill(color.toInt(), brush.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateStreamOnFile(filename: Pcwstr, access: UInt, stream: MutPtr<MutPtr<CVoid>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateStreamOnFile(filename.rawAddress.toString(), access.toInt(), stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateStringFormat(formatattributes: Int, language: UShort, format: MutPtr<MutPtr<GpStringFormat>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateStringFormat(formatattributes, language.toInt(), format.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateTexture(image: MutPtr<GpImage>, wrapmode: WrapMode, texture: MutPtr<MutPtr<GpTexture>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateTexture(image.rawAddress.toString(), wrapmode, texture.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateTexture2(image: MutPtr<GpImage>, wrapmode: WrapMode, x: Float, y: Float, width: Float, height: Float, texture: MutPtr<MutPtr<GpTexture>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateTexture2(image.rawAddress.toString(), wrapmode, x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), texture.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateTexture2I(image: MutPtr<GpImage>, wrapmode: WrapMode, x: Int, y: Int, width: Int, height: Int, texture: MutPtr<MutPtr<GpTexture>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateTexture2I(image.rawAddress.toString(), wrapmode, x, y, width, height, texture.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateTextureIA(image: MutPtr<GpImage>, imageattributes: ConstPtr<GpImageAttributes>, x: Float, y: Float, width: Float, height: Float, texture: MutPtr<MutPtr<GpTexture>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateTextureIA(image.rawAddress.toString(), imageattributes.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), texture.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateTextureIAI(image: MutPtr<GpImage>, imageattributes: ConstPtr<GpImageAttributes>, x: Int, y: Int, width: Int, height: Int, texture: MutPtr<MutPtr<GpTexture>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateTextureIAI(image.rawAddress.toString(), imageattributes.rawAddress.toString(), x, y, width, height, texture.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteBrush(brush: MutPtr<GpBrush>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDeleteBrush(brush.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteCachedBitmap(cachedbitmap: MutPtr<GpCachedBitmap>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDeleteCachedBitmap(cachedbitmap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteCustomLineCap(customcap: MutPtr<GpCustomLineCap>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDeleteCustomLineCap(customcap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteEffect(effect: MutPtr<CGpEffect>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDeleteEffect(effect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteFont(font: MutPtr<GpFont>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDeleteFont(font.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteFontFamily(fontfamily: MutPtr<GpFontFamily>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDeleteFontFamily(fontfamily.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteGraphics(graphics: MutPtr<GpGraphics>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDeleteGraphics(graphics.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteMatrix(matrix: MutPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDeleteMatrix(matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeletePath(path: MutPtr<GpPath>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDeletePath(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeletePathIter(iterator: MutPtr<GpPathIterator>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDeletePathIter(iterator.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeletePen(pen: MutPtr<GpPen>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDeletePen(pen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeletePrivateFontCollection(fontcollection: MutPtr<MutPtr<GpFontCollection>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDeletePrivateFontCollection(fontcollection.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteRegion(region: MutPtr<GpRegion>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDeleteRegion(region.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteStringFormat(format: MutPtr<GpStringFormat>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDeleteStringFormat(format.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDisposeImage(image: MutPtr<GpImage>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDisposeImage(image.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDisposeImageAttributes(imageattr: MutPtr<GpImageAttributes>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDisposeImageAttributes(imageattr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawArc(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawArc(graphics.rawAddress.toString(), pen.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), startangle.toDouble(), sweepangle.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawArcI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawArcI(graphics.rawAddress.toString(), pen.rawAddress.toString(), x, y, width, height, startangle.toDouble(), sweepangle.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawBezier(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawBezier(graphics.rawAddress.toString(), pen.rawAddress.toString(), x1.toDouble(), y1.toDouble(), x2.toDouble(), y2.toDouble(), x3.toDouble(), y3.toDouble(), x4.toDouble(), y4.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawBezierI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawBezierI(graphics.rawAddress.toString(), pen.rawAddress.toString(), x1, y1, x2, y2, x3, y3, x4, y4) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawBeziers(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawBeziers(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawBeziersI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawBeziersI(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawCachedBitmap(graphics: MutPtr<GpGraphics>, cachedbitmap: MutPtr<GpCachedBitmap>, x: Int, y: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawCachedBitmap(graphics.rawAddress.toString(), cachedbitmap.rawAddress.toString(), x, y) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawClosedCurve(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurve(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawClosedCurve2(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<PointF>, count: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurve2(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawClosedCurve2I(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<Point>, count: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurve2I(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawClosedCurveI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurveI(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawCurve(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawCurve2(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<PointF>, count: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve2(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawCurve2I(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<Point>, count: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve2I(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawCurve3(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<PointF>, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve3(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count, offset, numberofsegments, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawCurve3I(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<Point>, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve3I(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count, offset, numberofsegments, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawCurveI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawCurveI(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawDriverString(graphics: MutPtr<GpGraphics>, text: ConstPtr<UShort>, length: Int, font: ConstPtr<GpFont>, brush: ConstPtr<GpBrush>, positions: ConstPtr<PointF>, flags: Int, matrix: ConstPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawDriverString(graphics.rawAddress.toString(), text.rawAddress.toString(), length, font.rawAddress.toString(), brush.rawAddress.toString(), positions.rawAddress.toString(), flags, matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawEllipse(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x: Float, y: Float, width: Float, height: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawEllipse(graphics.rawAddress.toString(), pen.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawEllipseI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x: Int, y: Int, width: Int, height: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawEllipseI(graphics.rawAddress.toString(), pen.rawAddress.toString(), x, y, width, height) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImage(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, x: Float, y: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawImage(graphics.rawAddress.toString(), image.rawAddress.toString(), x.toDouble(), y.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImageFX(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, source: MutPtr<RectF>, xform: MutPtr<Matrix>, effect: MutPtr<CGpEffect>, imageattributes: MutPtr<GpImageAttributes>, srcunit: Unit): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawImageFX(graphics.rawAddress.toString(), image.rawAddress.toString(), source.rawAddress.toString(), xform.rawAddress.toString(), effect.rawAddress.toString(), imageattributes.rawAddress.toString(), srcunit) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImageI(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, x: Int, y: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawImageI(graphics.rawAddress.toString(), image.rawAddress.toString(), x, y) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImagePointRect(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, x: Float, y: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointRect(graphics.rawAddress.toString(), image.rawAddress.toString(), x.toDouble(), y.toDouble(), srcx.toDouble(), srcy.toDouble(), srcwidth.toDouble(), srcheight.toDouble(), srcunit) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImagePointRectI(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, x: Int, y: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointRectI(graphics.rawAddress.toString(), image.rawAddress.toString(), x, y, srcx, srcy, srcwidth, srcheight, srcunit) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImagePoints(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, dstpoints: ConstPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePoints(graphics.rawAddress.toString(), image.rawAddress.toString(), dstpoints.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImagePointsI(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, dstpoints: ConstPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointsI(graphics.rawAddress.toString(), image.rawAddress.toString(), dstpoints.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImagePointsRect(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, points: ConstPtr<PointF>, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: ConstPtr<GpImageAttributes>, callback: Long, callbackdata: MutPtr<CVoid>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointsRect(graphics.rawAddress.toString(), image.rawAddress.toString(), points.rawAddress.toString(), count, srcx.toDouble(), srcy.toDouble(), srcwidth.toDouble(), srcheight.toDouble(), srcunit, imageattributes.rawAddress.toString(), callback.toString(), callbackdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImagePointsRectI(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, points: ConstPtr<Point>, count: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: ConstPtr<GpImageAttributes>, callback: Long, callbackdata: MutPtr<CVoid>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointsRectI(graphics.rawAddress.toString(), image.rawAddress.toString(), points.rawAddress.toString(), count, srcx, srcy, srcwidth, srcheight, srcunit, imageattributes.rawAddress.toString(), callback.toString(), callbackdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImageRect(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, x: Float, y: Float, width: Float, height: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRect(graphics.rawAddress.toString(), image.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImageRectI(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, x: Int, y: Int, width: Int, height: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRectI(graphics.rawAddress.toString(), image.rawAddress.toString(), x, y, width, height) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImageRectRect(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, dstx: Float, dsty: Float, dstwidth: Float, dstheight: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: ConstPtr<GpImageAttributes>, callback: Long, callbackdata: MutPtr<CVoid>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRectRect(graphics.rawAddress.toString(), image.rawAddress.toString(), dstx.toDouble(), dsty.toDouble(), dstwidth.toDouble(), dstheight.toDouble(), srcx.toDouble(), srcy.toDouble(), srcwidth.toDouble(), srcheight.toDouble(), srcunit, imageattributes.rawAddress.toString(), callback.toString(), callbackdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImageRectRectI(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, dstx: Int, dsty: Int, dstwidth: Int, dstheight: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: ConstPtr<GpImageAttributes>, callback: Long, callbackdata: MutPtr<CVoid>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRectRectI(graphics.rawAddress.toString(), image.rawAddress.toString(), dstx, dsty, dstwidth, dstheight, srcx, srcy, srcwidth, srcheight, srcunit, imageattributes.rawAddress.toString(), callback.toString(), callbackdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawLine(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x1: Float, y1: Float, x2: Float, y2: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawLine(graphics.rawAddress.toString(), pen.rawAddress.toString(), x1.toDouble(), y1.toDouble(), x2.toDouble(), y2.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawLineI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x1: Int, y1: Int, x2: Int, y2: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawLineI(graphics.rawAddress.toString(), pen.rawAddress.toString(), x1, y1, x2, y2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawLines(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawLines(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawLinesI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawLinesI(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawPath(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, path: MutPtr<GpPath>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawPath(graphics.rawAddress.toString(), pen.rawAddress.toString(), path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawPie(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawPie(graphics.rawAddress.toString(), pen.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), startangle.toDouble(), sweepangle.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawPieI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawPieI(graphics.rawAddress.toString(), pen.rawAddress.toString(), x, y, width, height, startangle.toDouble(), sweepangle.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawPolygon(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawPolygon(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawPolygonI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawPolygonI(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawRectangle(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x: Float, y: Float, width: Float, height: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawRectangle(graphics.rawAddress.toString(), pen.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawRectangleI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x: Int, y: Int, width: Int, height: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawRectangleI(graphics.rawAddress.toString(), pen.rawAddress.toString(), x, y, width, height) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawRectangles(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, rects: ConstPtr<RectF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawRectangles(graphics.rawAddress.toString(), pen.rawAddress.toString(), rects.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawRectanglesI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, rects: ConstPtr<Rect>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawRectanglesI(graphics.rawAddress.toString(), pen.rawAddress.toString(), rects.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawString(graphics: MutPtr<GpGraphics>, string: Pcwstr, length: Int, font: ConstPtr<GpFont>, layoutrect: ConstPtr<RectF>, stringformat: ConstPtr<GpStringFormat>, brush: ConstPtr<GpBrush>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawString(graphics.rawAddress.toString(), string.rawAddress.toString(), length, font.rawAddress.toString(), layoutrect.rawAddress.toString(), stringformat.rawAddress.toString(), brush.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEmfToWmfBits(hemf: Henhmetafile, cbdata16: UInt, pdata16: MutPtr<UByte>, imapmode: Int, eflags: Int): UInt =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipEmfToWmfBits(hemf.rawAddress.toString(), cbdata16.toInt(), pdata16.rawAddress.toString(), imapmode, eflags) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEndContainer(graphics: MutPtr<GpGraphics>, state: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipEndContainer(graphics.rawAddress.toString(), state.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileDestPoint(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destpoint: ConstPtr<PointF>, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPoint(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destpoint.rawAddress.toString(), callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileDestPointI(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destpoint: ConstPtr<Point>, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPointI(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destpoint.rawAddress.toString(), callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileDestPoints(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destpoints: ConstPtr<PointF>, count: Int, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPoints(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destpoints.rawAddress.toString(), count, callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileDestPointsI(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destpoints: ConstPtr<Point>, count: Int, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPointsI(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destpoints.rawAddress.toString(), count, callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileDestRect(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destrect: ConstPtr<RectF>, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestRect(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destrect.rawAddress.toString(), callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileDestRectI(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destrect: ConstPtr<Rect>, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestRectI(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destrect.rawAddress.toString(), callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileSrcRectDestPoint(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destpoint: ConstPtr<PointF>, srcrect: ConstPtr<RectF>, srcunit: Unit, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPoint(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destpoint.rawAddress.toString(), srcrect.rawAddress.toString(), srcunit, callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileSrcRectDestPointI(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destpoint: ConstPtr<Point>, srcrect: ConstPtr<Rect>, srcunit: Unit, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPointI(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destpoint.rawAddress.toString(), srcrect.rawAddress.toString(), srcunit, callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileSrcRectDestPoints(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destpoints: ConstPtr<PointF>, count: Int, srcrect: ConstPtr<RectF>, srcunit: Unit, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPoints(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destpoints.rawAddress.toString(), count, srcrect.rawAddress.toString(), srcunit, callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileSrcRectDestPointsI(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destpoints: ConstPtr<Point>, count: Int, srcrect: ConstPtr<Rect>, srcunit: Unit, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPointsI(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destpoints.rawAddress.toString(), count, srcrect.rawAddress.toString(), srcunit, callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileSrcRectDestRect(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destrect: ConstPtr<RectF>, srcrect: ConstPtr<RectF>, srcunit: Unit, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestRect(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destrect.rawAddress.toString(), srcrect.rawAddress.toString(), srcunit, callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileSrcRectDestRectI(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destrect: ConstPtr<Rect>, srcrect: ConstPtr<Rect>, srcunit: Unit, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestRectI(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destrect.rawAddress.toString(), srcrect.rawAddress.toString(), srcunit, callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillClosedCurve(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, points: ConstPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurve(graphics.rawAddress.toString(), brush.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillClosedCurve2(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, points: ConstPtr<PointF>, count: Int, tension: Float, fillmode: FillMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurve2(graphics.rawAddress.toString(), brush.rawAddress.toString(), points.rawAddress.toString(), count, tension.toDouble(), fillmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillClosedCurve2I(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, points: ConstPtr<Point>, count: Int, tension: Float, fillmode: FillMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurve2I(graphics.rawAddress.toString(), brush.rawAddress.toString(), points.rawAddress.toString(), count, tension.toDouble(), fillmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillClosedCurveI(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, points: ConstPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurveI(graphics.rawAddress.toString(), brush.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillEllipse(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, x: Float, y: Float, width: Float, height: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillEllipse(graphics.rawAddress.toString(), brush.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillEllipseI(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, x: Int, y: Int, width: Int, height: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillEllipseI(graphics.rawAddress.toString(), brush.rawAddress.toString(), x, y, width, height) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillPath(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, path: MutPtr<GpPath>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillPath(graphics.rawAddress.toString(), brush.rawAddress.toString(), path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillPie(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillPie(graphics.rawAddress.toString(), brush.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), startangle.toDouble(), sweepangle.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillPieI(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillPieI(graphics.rawAddress.toString(), brush.rawAddress.toString(), x, y, width, height, startangle.toDouble(), sweepangle.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillPolygon(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, points: ConstPtr<PointF>, count: Int, fillmode: FillMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillPolygon(graphics.rawAddress.toString(), brush.rawAddress.toString(), points.rawAddress.toString(), count, fillmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillPolygon2(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, points: ConstPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillPolygon2(graphics.rawAddress.toString(), brush.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillPolygon2I(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, points: ConstPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillPolygon2I(graphics.rawAddress.toString(), brush.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillPolygonI(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, points: ConstPtr<Point>, count: Int, fillmode: FillMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillPolygonI(graphics.rawAddress.toString(), brush.rawAddress.toString(), points.rawAddress.toString(), count, fillmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillRectangle(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, x: Float, y: Float, width: Float, height: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillRectangle(graphics.rawAddress.toString(), brush.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillRectangleI(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, x: Int, y: Int, width: Int, height: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillRectangleI(graphics.rawAddress.toString(), brush.rawAddress.toString(), x, y, width, height) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillRectangles(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, rects: ConstPtr<RectF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillRectangles(graphics.rawAddress.toString(), brush.rawAddress.toString(), rects.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillRectanglesI(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, rects: ConstPtr<Rect>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillRectanglesI(graphics.rawAddress.toString(), brush.rawAddress.toString(), rects.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillRegion(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, region: MutPtr<GpRegion>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillRegion(graphics.rawAddress.toString(), brush.rawAddress.toString(), region.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFindFirstImageItem(image: MutPtr<GpImage>, item: MutPtr<ImageItemData>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFindFirstImageItem(image.rawAddress.toString(), item.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFindNextImageItem(image: MutPtr<GpImage>, item: MutPtr<ImageItemData>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFindNextImageItem(image.rawAddress.toString(), item.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFlattenPath(path: MutPtr<GpPath>, matrix: MutPtr<Matrix>, flatness: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFlattenPath(path.rawAddress.toString(), matrix.rawAddress.toString(), flatness.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFlush(graphics: MutPtr<GpGraphics>, intention: FlushIntention): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFlush(graphics.rawAddress.toString(), intention) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFree(ptr: MutPtr<CVoid>) {
    if (windowsWin32GraphicsGdiplusNapiAddon != null) {
        windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFree(ptr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gdipGetAdjustableArrowCapFillState(cap: MutPtr<GpAdjustableArrowCap>, fillstate: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapFillState(cap.rawAddress.toString(), fillstate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetAdjustableArrowCapHeight(cap: MutPtr<GpAdjustableArrowCap>, height: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapHeight(cap.rawAddress.toString(), height.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetAdjustableArrowCapMiddleInset(cap: MutPtr<GpAdjustableArrowCap>, middleinset: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapMiddleInset(cap.rawAddress.toString(), middleinset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetAdjustableArrowCapWidth(cap: MutPtr<GpAdjustableArrowCap>, width: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapWidth(cap.rawAddress.toString(), width.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetAllPropertyItems(image: MutPtr<GpImage>, totalbuffersize: UInt, numproperties: UInt, allitems: MutPtr<PropertyItem>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetAllPropertyItems(image.rawAddress.toString(), totalbuffersize.toInt(), numproperties.toInt(), allitems.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetBrushType(brush: MutPtr<GpBrush>, type: MutPtr<BrushType>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetBrushType(brush.rawAddress.toString(), type.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCellAscent(family: ConstPtr<GpFontFamily>, style: Int, cellascent: MutPtr<UShort>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetCellAscent(family.rawAddress.toString(), style, cellascent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCellDescent(family: ConstPtr<GpFontFamily>, style: Int, celldescent: MutPtr<UShort>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetCellDescent(family.rawAddress.toString(), style, celldescent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetClip(graphics: MutPtr<GpGraphics>, region: MutPtr<GpRegion>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetClip(graphics.rawAddress.toString(), region.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetClipBounds(graphics: MutPtr<GpGraphics>, rect: MutPtr<RectF>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetClipBounds(graphics.rawAddress.toString(), rect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetClipBoundsI(graphics: MutPtr<GpGraphics>, rect: MutPtr<Rect>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetClipBoundsI(graphics.rawAddress.toString(), rect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCompositingMode(graphics: MutPtr<GpGraphics>, compositingmode: MutPtr<CompositingMode>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetCompositingMode(graphics.rawAddress.toString(), compositingmode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCompositingQuality(graphics: MutPtr<GpGraphics>, compositingquality: MutPtr<CompositingQuality>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetCompositingQuality(graphics.rawAddress.toString(), compositingquality.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCustomLineCapBaseCap(customcap: MutPtr<GpCustomLineCap>, basecap: MutPtr<LineCap>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapBaseCap(customcap.rawAddress.toString(), basecap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCustomLineCapBaseInset(customcap: MutPtr<GpCustomLineCap>, inset: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapBaseInset(customcap.rawAddress.toString(), inset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCustomLineCapStrokeCaps(customcap: MutPtr<GpCustomLineCap>, startcap: MutPtr<LineCap>, endcap: MutPtr<LineCap>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapStrokeCaps(customcap.rawAddress.toString(), startcap.rawAddress.toString(), endcap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCustomLineCapStrokeJoin(customcap: MutPtr<GpCustomLineCap>, linejoin: MutPtr<LineJoin>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapStrokeJoin(customcap.rawAddress.toString(), linejoin.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCustomLineCapType(customcap: MutPtr<GpCustomLineCap>, captype: MutPtr<CustomLineCapType>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapType(customcap.rawAddress.toString(), captype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCustomLineCapWidthScale(customcap: MutPtr<GpCustomLineCap>, widthscale: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapWidthScale(customcap.rawAddress.toString(), widthscale.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetDC(graphics: MutPtr<GpGraphics>, hdc: MutPtr<Hdc>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetDC(graphics.rawAddress.toString(), hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetDpiX(graphics: MutPtr<GpGraphics>, dpi: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetDpiX(graphics.rawAddress.toString(), dpi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetDpiY(graphics: MutPtr<GpGraphics>, dpi: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetDpiY(graphics.rawAddress.toString(), dpi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetEffectParameterSize(effect: MutPtr<CGpEffect>, size: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetEffectParameterSize(effect.rawAddress.toString(), size.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetEffectParameters(effect: MutPtr<CGpEffect>, size: MutPtr<UInt>, params: MutPtr<CVoid>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetEffectParameters(effect.rawAddress.toString(), size.rawAddress.toString(), params.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetEmHeight(family: ConstPtr<GpFontFamily>, style: Int, emheight: MutPtr<UShort>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetEmHeight(family.rawAddress.toString(), style, emheight.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetEncoderParameterList(image: MutPtr<GpImage>, clsidencoder: ConstPtr<Guid>, size: UInt, buffer: MutPtr<EncoderParameters>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetEncoderParameterList(image.rawAddress.toString(), clsidencoder.rawAddress.toString(), size.toInt(), buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetEncoderParameterListSize(image: MutPtr<GpImage>, clsidencoder: ConstPtr<Guid>, size: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetEncoderParameterListSize(image.rawAddress.toString(), clsidencoder.rawAddress.toString(), size.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFamily(font: MutPtr<GpFont>, family: MutPtr<MutPtr<GpFontFamily>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetFamily(font.rawAddress.toString(), family.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFamilyName(family: ConstPtr<GpFontFamily>, name: Pwstr, language: UShort): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetFamilyName(family.rawAddress.toString(), name.rawAddress.toString(), language.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFontCollectionFamilyCount(fontcollection: MutPtr<GpFontCollection>, numfound: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetFontCollectionFamilyCount(fontcollection.rawAddress.toString(), numfound.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFontCollectionFamilyList(fontcollection: ConstPtr<GpFontCollection>, numsought: Int, gpfamilies: MutPtr<MutPtr<GpFontFamily>>, numfound: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetFontCollectionFamilyList(fontcollection.rawAddress.toString(), numsought, gpfamilies.rawAddress.toString(), numfound.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFontHeight(font: ConstPtr<GpFont>, graphics: ConstPtr<GpGraphics>, height: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetFontHeight(font.rawAddress.toString(), graphics.rawAddress.toString(), height.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFontHeightGivenDPI(font: ConstPtr<GpFont>, dpi: Float, height: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetFontHeightGivenDPI(font.rawAddress.toString(), dpi.toDouble(), height.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFontSize(font: MutPtr<GpFont>, size: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetFontSize(font.rawAddress.toString(), size.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFontStyle(font: MutPtr<GpFont>, style: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetFontStyle(font.rawAddress.toString(), style.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFontUnit(font: MutPtr<GpFont>, unit: MutPtr<Unit>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetFontUnit(font.rawAddress.toString(), unit.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetGenericFontFamilyMonospace(nativefamily: MutPtr<MutPtr<GpFontFamily>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetGenericFontFamilyMonospace(nativefamily.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetGenericFontFamilySansSerif(nativefamily: MutPtr<MutPtr<GpFontFamily>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetGenericFontFamilySansSerif(nativefamily.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetGenericFontFamilySerif(nativefamily: MutPtr<MutPtr<GpFontFamily>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetGenericFontFamilySerif(nativefamily.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetHatchBackgroundColor(brush: MutPtr<GpHatch>, backcol: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetHatchBackgroundColor(brush.rawAddress.toString(), backcol.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetHatchForegroundColor(brush: MutPtr<GpHatch>, forecol: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetHatchForegroundColor(brush.rawAddress.toString(), forecol.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetHatchStyle(brush: MutPtr<GpHatch>, hatchstyle: MutPtr<HatchStyle>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetHatchStyle(brush.rawAddress.toString(), hatchstyle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetHemfFromMetafile(metafile: MutPtr<GpMetafile>, hemf: MutPtr<Henhmetafile>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetHemfFromMetafile(metafile.rawAddress.toString(), hemf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageAttributesAdjustedPalette(imageattr: MutPtr<GpImageAttributes>, colorpalette: MutPtr<ColorPalette>, coloradjusttype: ColorAdjustType): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageAttributesAdjustedPalette(imageattr.rawAddress.toString(), colorpalette.rawAddress.toString(), coloradjusttype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageBounds(image: MutPtr<GpImage>, srcrect: MutPtr<RectF>, srcunit: MutPtr<Unit>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageBounds(image.rawAddress.toString(), srcrect.rawAddress.toString(), srcunit.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageDecoders(numdecoders: UInt, size: UInt, decoders: MutPtr<ImageCodecInfo>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageDecoders(numdecoders.toInt(), size.toInt(), decoders.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageDecodersSize(numdecoders: MutPtr<UInt>, size: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageDecodersSize(numdecoders.rawAddress.toString(), size.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageDimension(image: MutPtr<GpImage>, width: MutPtr<Float>, height: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageDimension(image.rawAddress.toString(), width.rawAddress.toString(), height.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageEncoders(numencoders: UInt, size: UInt, encoders: MutPtr<ImageCodecInfo>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageEncoders(numencoders.toInt(), size.toInt(), encoders.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageEncodersSize(numencoders: MutPtr<UInt>, size: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageEncodersSize(numencoders.rawAddress.toString(), size.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageFlags(image: MutPtr<GpImage>, flags: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageFlags(image.rawAddress.toString(), flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageGraphicsContext(image: MutPtr<GpImage>, graphics: MutPtr<MutPtr<GpGraphics>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageGraphicsContext(image.rawAddress.toString(), graphics.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageHeight(image: MutPtr<GpImage>, height: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageHeight(image.rawAddress.toString(), height.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageHorizontalResolution(image: MutPtr<GpImage>, resolution: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageHorizontalResolution(image.rawAddress.toString(), resolution.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageItemData(image: MutPtr<GpImage>, item: MutPtr<ImageItemData>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageItemData(image.rawAddress.toString(), item.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImagePalette(image: MutPtr<GpImage>, palette: MutPtr<ColorPalette>, size: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImagePalette(image.rawAddress.toString(), palette.rawAddress.toString(), size) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImagePaletteSize(image: MutPtr<GpImage>, size: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImagePaletteSize(image.rawAddress.toString(), size.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImagePixelFormat(image: MutPtr<GpImage>, format: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImagePixelFormat(image.rawAddress.toString(), format.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageRawFormat(image: MutPtr<GpImage>, format: MutPtr<Guid>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageRawFormat(image.rawAddress.toString(), format.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageThumbnail(image: MutPtr<GpImage>, thumbwidth: UInt, thumbheight: UInt, thumbimage: MutPtr<MutPtr<GpImage>>, callback: Long, callbackdata: MutPtr<CVoid>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageThumbnail(image.rawAddress.toString(), thumbwidth.toInt(), thumbheight.toInt(), thumbimage.rawAddress.toString(), callback.toString(), callbackdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageType(image: MutPtr<GpImage>, type: MutPtr<ImageType>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageType(image.rawAddress.toString(), type.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageVerticalResolution(image: MutPtr<GpImage>, resolution: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageVerticalResolution(image.rawAddress.toString(), resolution.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageWidth(image: MutPtr<GpImage>, width: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageWidth(image.rawAddress.toString(), width.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetInterpolationMode(graphics: MutPtr<GpGraphics>, interpolationmode: MutPtr<InterpolationMode>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetInterpolationMode(graphics.rawAddress.toString(), interpolationmode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineBlend(brush: MutPtr<GpLineGradient>, blend: MutPtr<Float>, positions: MutPtr<Float>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetLineBlend(brush.rawAddress.toString(), blend.rawAddress.toString(), positions.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineBlendCount(brush: MutPtr<GpLineGradient>, count: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetLineBlendCount(brush.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineColors(brush: MutPtr<GpLineGradient>, colors: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetLineColors(brush.rawAddress.toString(), colors.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineGammaCorrection(brush: MutPtr<GpLineGradient>, usegammacorrection: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetLineGammaCorrection(brush.rawAddress.toString(), usegammacorrection.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLinePresetBlend(brush: MutPtr<GpLineGradient>, blend: MutPtr<UInt>, positions: MutPtr<Float>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetLinePresetBlend(brush.rawAddress.toString(), blend.rawAddress.toString(), positions.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLinePresetBlendCount(brush: MutPtr<GpLineGradient>, count: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetLinePresetBlendCount(brush.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineRect(brush: MutPtr<GpLineGradient>, rect: MutPtr<RectF>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetLineRect(brush.rawAddress.toString(), rect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineRectI(brush: MutPtr<GpLineGradient>, rect: MutPtr<Rect>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetLineRectI(brush.rawAddress.toString(), rect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineSpacing(family: ConstPtr<GpFontFamily>, style: Int, linespacing: MutPtr<UShort>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetLineSpacing(family.rawAddress.toString(), style, linespacing.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineTransform(brush: MutPtr<GpLineGradient>, matrix: MutPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetLineTransform(brush.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineWrapMode(brush: MutPtr<GpLineGradient>, wrapmode: MutPtr<WrapMode>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetLineWrapMode(brush.rawAddress.toString(), wrapmode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLogFontA(font: MutPtr<GpFont>, graphics: MutPtr<GpGraphics>, logfonta: MutPtr<Logfonta>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetLogFontA(font.rawAddress.toString(), graphics.rawAddress.toString(), logfonta.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLogFontW(font: MutPtr<GpFont>, graphics: MutPtr<GpGraphics>, logfontw: MutPtr<Logfontw>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetLogFontW(font.rawAddress.toString(), graphics.rawAddress.toString(), logfontw.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetMatrixElements(matrix: ConstPtr<Matrix>, matrixout: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetMatrixElements(matrix.rawAddress.toString(), matrixout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetMetafileDownLevelRasterizationLimit(metafile: ConstPtr<GpMetafile>, metafilerasterizationlimitdpi: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileDownLevelRasterizationLimit(metafile.rawAddress.toString(), metafilerasterizationlimitdpi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetMetafileHeaderFromEmf(hemf: Henhmetafile, header: MutPtr<MetafileHeader>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromEmf(hemf.rawAddress.toString(), header.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetMetafileHeaderFromFile(filename: Pcwstr, header: MutPtr<MetafileHeader>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromFile(filename.rawAddress.toString(), header.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetMetafileHeaderFromMetafile(metafile: MutPtr<GpMetafile>, header: MutPtr<MetafileHeader>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromMetafile(metafile.rawAddress.toString(), header.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetMetafileHeaderFromStream(stream: MutPtr<CVoid>, header: MutPtr<MetafileHeader>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromStream(stream.rawAddress.toString(), header.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetMetafileHeaderFromWmf(hwmf: Hmetafile, wmfplaceablefileheader: ConstPtr<WmfPlaceableFileHeader>, header: MutPtr<MetafileHeader>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromWmf(hwmf.rawAddress.toString(), wmfplaceablefileheader.rawAddress.toString(), header.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetNearestColor(graphics: MutPtr<GpGraphics>, argb: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetNearestColor(graphics.rawAddress.toString(), argb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPageScale(graphics: MutPtr<GpGraphics>, scale: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPageScale(graphics.rawAddress.toString(), scale.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPageUnit(graphics: MutPtr<GpGraphics>, unit: MutPtr<Unit>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPageUnit(graphics.rawAddress.toString(), unit.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathData(path: MutPtr<GpPath>, pathdata: MutPtr<PathData>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathData(path.rawAddress.toString(), pathdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathFillMode(path: MutPtr<GpPath>, fillmode: MutPtr<FillMode>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathFillMode(path.rawAddress.toString(), fillmode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientBlend(brush: MutPtr<GpPathGradient>, blend: MutPtr<Float>, positions: MutPtr<Float>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientBlend(brush.rawAddress.toString(), blend.rawAddress.toString(), positions.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientBlendCount(brush: MutPtr<GpPathGradient>, count: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientBlendCount(brush.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientCenterColor(brush: MutPtr<GpPathGradient>, colors: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientCenterColor(brush.rawAddress.toString(), colors.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientCenterPoint(brush: MutPtr<GpPathGradient>, points: MutPtr<PointF>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientCenterPoint(brush.rawAddress.toString(), points.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientCenterPointI(brush: MutPtr<GpPathGradient>, points: MutPtr<Point>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientCenterPointI(brush.rawAddress.toString(), points.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientFocusScales(brush: MutPtr<GpPathGradient>, xscale: MutPtr<Float>, yscale: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientFocusScales(brush.rawAddress.toString(), xscale.rawAddress.toString(), yscale.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientGammaCorrection(brush: MutPtr<GpPathGradient>, usegammacorrection: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientGammaCorrection(brush.rawAddress.toString(), usegammacorrection.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientPath(brush: MutPtr<GpPathGradient>, path: MutPtr<GpPath>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPath(brush.rawAddress.toString(), path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientPointCount(brush: MutPtr<GpPathGradient>, count: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPointCount(brush.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientPresetBlend(brush: MutPtr<GpPathGradient>, blend: MutPtr<UInt>, positions: MutPtr<Float>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPresetBlend(brush.rawAddress.toString(), blend.rawAddress.toString(), positions.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientPresetBlendCount(brush: MutPtr<GpPathGradient>, count: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPresetBlendCount(brush.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientRect(brush: MutPtr<GpPathGradient>, rect: MutPtr<RectF>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientRect(brush.rawAddress.toString(), rect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientRectI(brush: MutPtr<GpPathGradient>, rect: MutPtr<Rect>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientRectI(brush.rawAddress.toString(), rect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientSurroundColorCount(brush: MutPtr<GpPathGradient>, count: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientSurroundColorCount(brush.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientSurroundColorsWithCount(brush: ConstPtr<GpPathGradient>, color: MutPtr<UInt>, count: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientSurroundColorsWithCount(brush.rawAddress.toString(), color.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientTransform(brush: MutPtr<GpPathGradient>, matrix: MutPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientTransform(brush.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientWrapMode(brush: MutPtr<GpPathGradient>, wrapmode: MutPtr<WrapMode>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientWrapMode(brush.rawAddress.toString(), wrapmode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathLastPoint(path: MutPtr<GpPath>, lastpoint: MutPtr<PointF>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathLastPoint(path.rawAddress.toString(), lastpoint.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathPoints(param0: MutPtr<GpPath>, points: MutPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathPoints(param0.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathPointsI(param0: MutPtr<GpPath>, points: MutPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathPointsI(param0.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathTypes(path: ConstPtr<GpPath>, types: MutPtr<UByte>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathTypes(path.rawAddress.toString(), types.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathWorldBounds(path: MutPtr<GpPath>, bounds: MutPtr<RectF>, matrix: ConstPtr<Matrix>, pen: ConstPtr<GpPen>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathWorldBounds(path.rawAddress.toString(), bounds.rawAddress.toString(), matrix.rawAddress.toString(), pen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathWorldBoundsI(path: MutPtr<GpPath>, bounds: MutPtr<Rect>, matrix: ConstPtr<Matrix>, pen: ConstPtr<GpPen>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathWorldBoundsI(path.rawAddress.toString(), bounds.rawAddress.toString(), matrix.rawAddress.toString(), pen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenBrushFill(pen: MutPtr<GpPen>, brush: MutPtr<MutPtr<GpBrush>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenBrushFill(pen.rawAddress.toString(), brush.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenColor(pen: MutPtr<GpPen>, argb: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenColor(pen.rawAddress.toString(), argb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenCompoundArray(pen: MutPtr<GpPen>, dash: MutPtr<Float>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenCompoundArray(pen.rawAddress.toString(), dash.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenCompoundCount(pen: MutPtr<GpPen>, count: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenCompoundCount(pen.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenCustomEndCap(pen: MutPtr<GpPen>, customcap: MutPtr<MutPtr<GpCustomLineCap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenCustomEndCap(pen.rawAddress.toString(), customcap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenCustomStartCap(pen: MutPtr<GpPen>, customcap: MutPtr<MutPtr<GpCustomLineCap>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenCustomStartCap(pen.rawAddress.toString(), customcap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenDashArray(pen: MutPtr<GpPen>, dash: MutPtr<Float>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashArray(pen.rawAddress.toString(), dash.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenDashCap197819(pen: MutPtr<GpPen>, dashcap: MutPtr<DashCap>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashCap197819(pen.rawAddress.toString(), dashcap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenDashCount(pen: MutPtr<GpPen>, count: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashCount(pen.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenDashOffset(pen: MutPtr<GpPen>, offset: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashOffset(pen.rawAddress.toString(), offset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenDashStyle(pen: MutPtr<GpPen>, dashstyle: MutPtr<DashStyle>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashStyle(pen.rawAddress.toString(), dashstyle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenEndCap(pen: MutPtr<GpPen>, endcap: MutPtr<LineCap>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenEndCap(pen.rawAddress.toString(), endcap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenFillType(pen: MutPtr<GpPen>, type: MutPtr<PenType>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenFillType(pen.rawAddress.toString(), type.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenLineJoin(pen: MutPtr<GpPen>, linejoin: MutPtr<LineJoin>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenLineJoin(pen.rawAddress.toString(), linejoin.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenMiterLimit(pen: MutPtr<GpPen>, miterlimit: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenMiterLimit(pen.rawAddress.toString(), miterlimit.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenMode(pen: MutPtr<GpPen>, penmode: MutPtr<PenAlignment>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenMode(pen.rawAddress.toString(), penmode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenStartCap(pen: MutPtr<GpPen>, startcap: MutPtr<LineCap>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenStartCap(pen.rawAddress.toString(), startcap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenTransform(pen: MutPtr<GpPen>, matrix: MutPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenTransform(pen.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenUnit(pen: MutPtr<GpPen>, unit: MutPtr<Unit>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenUnit(pen.rawAddress.toString(), unit.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenWidth(pen: MutPtr<GpPen>, width: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenWidth(pen.rawAddress.toString(), width.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPixelOffsetMode(graphics: MutPtr<GpGraphics>, pixeloffsetmode: MutPtr<PixelOffsetMode>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPixelOffsetMode(graphics.rawAddress.toString(), pixeloffsetmode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPointCount(path: MutPtr<GpPath>, count: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPointCount(path.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPropertyCount(image: MutPtr<GpImage>, numofproperty: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyCount(image.rawAddress.toString(), numofproperty.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPropertyIdList(image: MutPtr<GpImage>, numofproperty: UInt, list: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyIdList(image.rawAddress.toString(), numofproperty.toInt(), list.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPropertyItem(image: MutPtr<GpImage>, propid: UInt, propsize: UInt, buffer: MutPtr<PropertyItem>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyItem(image.rawAddress.toString(), propid.toInt(), propsize.toInt(), buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPropertyItemSize(image: MutPtr<GpImage>, propid: UInt, size: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyItemSize(image.rawAddress.toString(), propid.toInt(), size.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPropertySize(image: MutPtr<GpImage>, totalbuffersize: MutPtr<UInt>, numproperties: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPropertySize(image.rawAddress.toString(), totalbuffersize.rawAddress.toString(), numproperties.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRegionBounds(region: MutPtr<GpRegion>, graphics: MutPtr<GpGraphics>, rect: MutPtr<RectF>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetRegionBounds(region.rawAddress.toString(), graphics.rawAddress.toString(), rect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRegionBoundsI(region: MutPtr<GpRegion>, graphics: MutPtr<GpGraphics>, rect: MutPtr<Rect>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetRegionBoundsI(region.rawAddress.toString(), graphics.rawAddress.toString(), rect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRegionData(region: MutPtr<GpRegion>, buffer: MutPtr<UByte>, buffersize: UInt, sizefilled: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetRegionData(region.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.toInt(), sizefilled.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRegionDataSize(region: MutPtr<GpRegion>, buffersize: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetRegionDataSize(region.rawAddress.toString(), buffersize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRegionHRgn(region: MutPtr<GpRegion>, graphics: MutPtr<GpGraphics>, hrgn: MutPtr<Hrgn>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetRegionHRgn(region.rawAddress.toString(), graphics.rawAddress.toString(), hrgn.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRegionScans(region: MutPtr<GpRegion>, rects: MutPtr<RectF>, count: MutPtr<Int>, matrix: MutPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetRegionScans(region.rawAddress.toString(), rects.rawAddress.toString(), count.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRegionScansCount(region: MutPtr<GpRegion>, count: MutPtr<UInt>, matrix: MutPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetRegionScansCount(region.rawAddress.toString(), count.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRegionScansI(region: MutPtr<GpRegion>, rects: MutPtr<Rect>, count: MutPtr<Int>, matrix: MutPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetRegionScansI(region.rawAddress.toString(), rects.rawAddress.toString(), count.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRenderingOrigin(graphics: MutPtr<GpGraphics>, x: MutPtr<Int>, y: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetRenderingOrigin(graphics.rawAddress.toString(), x.rawAddress.toString(), y.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetSmoothingMode(graphics: MutPtr<GpGraphics>, smoothingmode: MutPtr<SmoothingMode>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetSmoothingMode(graphics.rawAddress.toString(), smoothingmode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetSolidFillColor(brush: MutPtr<GpSolidFill>, color: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetSolidFillColor(brush.rawAddress.toString(), color.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatAlign(format: ConstPtr<GpStringFormat>, align: MutPtr<StringAlignment>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatAlign(format.rawAddress.toString(), align.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatDigitSubstitution(format: ConstPtr<GpStringFormat>, language: MutPtr<UShort>, substitute: MutPtr<StringDigitSubstitute>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatDigitSubstitution(format.rawAddress.toString(), language.rawAddress.toString(), substitute.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatFlags(format: ConstPtr<GpStringFormat>, flags: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatFlags(format.rawAddress.toString(), flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatHotkeyPrefix(format: ConstPtr<GpStringFormat>, hotkeyprefix: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatHotkeyPrefix(format.rawAddress.toString(), hotkeyprefix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatLineAlign(format: ConstPtr<GpStringFormat>, align: MutPtr<StringAlignment>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatLineAlign(format.rawAddress.toString(), align.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatMeasurableCharacterRangeCount(format: ConstPtr<GpStringFormat>, count: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatMeasurableCharacterRangeCount(format.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatTabStopCount(format: ConstPtr<GpStringFormat>, count: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatTabStopCount(format.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatTabStops(format: ConstPtr<GpStringFormat>, count: Int, firsttaboffset: MutPtr<Float>, tabstops: MutPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatTabStops(format.rawAddress.toString(), count, firsttaboffset.rawAddress.toString(), tabstops.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatTrimming(format: ConstPtr<GpStringFormat>, trimming: MutPtr<StringTrimming>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatTrimming(format.rawAddress.toString(), trimming.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetTextContrast(graphics: MutPtr<GpGraphics>, contrast: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetTextContrast(graphics.rawAddress.toString(), contrast.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetTextRenderingHint(graphics: MutPtr<GpGraphics>, mode: MutPtr<TextRenderingHint>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetTextRenderingHint(graphics.rawAddress.toString(), mode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetTextureImage(brush: MutPtr<GpTexture>, image: MutPtr<MutPtr<GpImage>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetTextureImage(brush.rawAddress.toString(), image.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetTextureTransform(brush: MutPtr<GpTexture>, matrix: MutPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetTextureTransform(brush.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetTextureWrapMode(brush: MutPtr<GpTexture>, wrapmode: MutPtr<WrapMode>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetTextureWrapMode(brush.rawAddress.toString(), wrapmode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetVisibleClipBounds(graphics: MutPtr<GpGraphics>, rect: MutPtr<RectF>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetVisibleClipBounds(graphics.rawAddress.toString(), rect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetVisibleClipBoundsI(graphics: MutPtr<GpGraphics>, rect: MutPtr<Rect>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetVisibleClipBoundsI(graphics.rawAddress.toString(), rect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetWorldTransform(graphics: MutPtr<GpGraphics>, matrix: MutPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetWorldTransform(graphics.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGraphicsClear(graphics: MutPtr<GpGraphics>, color: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGraphicsClear(graphics.rawAddress.toString(), color.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGraphicsSetAbort(pgraphics: MutPtr<GpGraphics>, piabort: MutPtr<CVoid>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGraphicsSetAbort(pgraphics.rawAddress.toString(), piabort.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipImageForceValidation(image: MutPtr<GpImage>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipImageForceValidation(image.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipImageGetFrameCount(image: MutPtr<GpImage>, dimensionid: ConstPtr<Guid>, count: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipImageGetFrameCount(image.rawAddress.toString(), dimensionid.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipImageGetFrameDimensionsCount(image: MutPtr<GpImage>, count: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipImageGetFrameDimensionsCount(image.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipImageGetFrameDimensionsList(image: MutPtr<GpImage>, dimensionids: MutPtr<Guid>, count: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipImageGetFrameDimensionsList(image.rawAddress.toString(), dimensionids.rawAddress.toString(), count.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipImageRotateFlip(image: MutPtr<GpImage>, rftype: RotateFlipType): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipImageRotateFlip(image.rawAddress.toString(), rftype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipImageSelectActiveFrame(image: MutPtr<GpImage>, dimensionid: ConstPtr<Guid>, frameindex: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipImageSelectActiveFrame(image.rawAddress.toString(), dimensionid.rawAddress.toString(), frameindex.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipImageSetAbort(pimage: MutPtr<GpImage>, piabort: MutPtr<CVoid>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipImageSetAbort(pimage.rawAddress.toString(), piabort.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipInitializePalette(palette: MutPtr<ColorPalette>, palettetype: PaletteType, optimalcolors: Int, usetransparentcolor: Bool, bitmap: MutPtr<GpBitmap>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipInitializePalette(palette.rawAddress.toString(), palettetype, optimalcolors, usetransparentcolor, bitmap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipInvertMatrix(matrix: MutPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipInvertMatrix(matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsClipEmpty(graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsClipEmpty(graphics.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsEmptyRegion(region: MutPtr<GpRegion>, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsEmptyRegion(region.rawAddress.toString(), graphics.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsEqualRegion(region: MutPtr<GpRegion>, region2: MutPtr<GpRegion>, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsEqualRegion(region.rawAddress.toString(), region2.rawAddress.toString(), graphics.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsInfiniteRegion(region: MutPtr<GpRegion>, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsInfiniteRegion(region.rawAddress.toString(), graphics.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsMatrixEqual(matrix: ConstPtr<Matrix>, matrix2: ConstPtr<Matrix>, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsMatrixEqual(matrix.rawAddress.toString(), matrix2.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsMatrixIdentity(matrix: ConstPtr<Matrix>, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsMatrixIdentity(matrix.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsMatrixInvertible(matrix: ConstPtr<Matrix>, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsMatrixInvertible(matrix.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsOutlineVisiblePathPoint(path: MutPtr<GpPath>, x: Float, y: Float, pen: MutPtr<GpPen>, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsOutlineVisiblePathPoint(path.rawAddress.toString(), x.toDouble(), y.toDouble(), pen.rawAddress.toString(), graphics.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsOutlineVisiblePathPointI(path: MutPtr<GpPath>, x: Int, y: Int, pen: MutPtr<GpPen>, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsOutlineVisiblePathPointI(path.rawAddress.toString(), x, y, pen.rawAddress.toString(), graphics.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsStyleAvailable(family: ConstPtr<GpFontFamily>, style: Int, isstyleavailable: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsStyleAvailable(family.rawAddress.toString(), style, isstyleavailable.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisibleClipEmpty(graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleClipEmpty(graphics.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisiblePathPoint(path: MutPtr<GpPath>, x: Float, y: Float, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePathPoint(path.rawAddress.toString(), x.toDouble(), y.toDouble(), graphics.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisiblePathPointI(path: MutPtr<GpPath>, x: Int, y: Int, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePathPointI(path.rawAddress.toString(), x, y, graphics.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisiblePoint(graphics: MutPtr<GpGraphics>, x: Float, y: Float, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePoint(graphics.rawAddress.toString(), x.toDouble(), y.toDouble(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisiblePointI(graphics: MutPtr<GpGraphics>, x: Int, y: Int, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePointI(graphics.rawAddress.toString(), x, y, result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisibleRect(graphics: MutPtr<GpGraphics>, x: Float, y: Float, width: Float, height: Float, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRect(graphics.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisibleRectI(graphics: MutPtr<GpGraphics>, x: Int, y: Int, width: Int, height: Int, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRectI(graphics.rawAddress.toString(), x, y, width, height, result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisibleRegionPoint(region: MutPtr<GpRegion>, x: Float, y: Float, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionPoint(region.rawAddress.toString(), x.toDouble(), y.toDouble(), graphics.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisibleRegionPointI(region: MutPtr<GpRegion>, x: Int, y: Int, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionPointI(region.rawAddress.toString(), x, y, graphics.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisibleRegionRect(region: MutPtr<GpRegion>, x: Float, y: Float, width: Float, height: Float, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionRect(region.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), graphics.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisibleRegionRectI(region: MutPtr<GpRegion>, x: Int, y: Int, width: Int, height: Int, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionRectI(region.rawAddress.toString(), x, y, width, height, graphics.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipLoadImageFromFile(filename: Pcwstr, image: MutPtr<MutPtr<GpImage>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromFile(filename.rawAddress.toString(), image.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipLoadImageFromFileICM(filename: Pcwstr, image: MutPtr<MutPtr<GpImage>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromFileICM(filename.rawAddress.toString(), image.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipLoadImageFromStream(stream: MutPtr<CVoid>, image: MutPtr<MutPtr<GpImage>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromStream(stream.rawAddress.toString(), image.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipLoadImageFromStreamICM(stream: MutPtr<CVoid>, image: MutPtr<MutPtr<GpImage>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromStreamICM(stream.rawAddress.toString(), image.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMeasureCharacterRanges(graphics: MutPtr<GpGraphics>, string: Pcwstr, length: Int, font: ConstPtr<GpFont>, layoutrect: ConstPtr<RectF>, stringformat: ConstPtr<GpStringFormat>, regioncount: Int, regions: MutPtr<MutPtr<GpRegion>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipMeasureCharacterRanges(graphics.rawAddress.toString(), string.rawAddress.toString(), length, font.rawAddress.toString(), layoutrect.rawAddress.toString(), stringformat.rawAddress.toString(), regioncount, regions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMeasureDriverString(graphics: MutPtr<GpGraphics>, text: ConstPtr<UShort>, length: Int, font: ConstPtr<GpFont>, positions: ConstPtr<PointF>, flags: Int, matrix: ConstPtr<Matrix>, boundingbox: MutPtr<RectF>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipMeasureDriverString(graphics.rawAddress.toString(), text.rawAddress.toString(), length, font.rawAddress.toString(), positions.rawAddress.toString(), flags, matrix.rawAddress.toString(), boundingbox.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMeasureString(graphics: MutPtr<GpGraphics>, string: Pcwstr, length: Int, font: ConstPtr<GpFont>, layoutrect: ConstPtr<RectF>, stringformat: ConstPtr<GpStringFormat>, boundingbox: MutPtr<RectF>, codepointsfitted: MutPtr<Int>, linesfilled: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipMeasureString(graphics.rawAddress.toString(), string.rawAddress.toString(), length, font.rawAddress.toString(), layoutrect.rawAddress.toString(), stringformat.rawAddress.toString(), boundingbox.rawAddress.toString(), codepointsfitted.rawAddress.toString(), linesfilled.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMultiplyLineTransform(brush: MutPtr<GpLineGradient>, matrix: ConstPtr<Matrix>, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipMultiplyLineTransform(brush.rawAddress.toString(), matrix.rawAddress.toString(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMultiplyMatrix(matrix: MutPtr<Matrix>, matrix2: MutPtr<Matrix>, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipMultiplyMatrix(matrix.rawAddress.toString(), matrix2.rawAddress.toString(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMultiplyPathGradientTransform(brush: MutPtr<GpPathGradient>, matrix: ConstPtr<Matrix>, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipMultiplyPathGradientTransform(brush.rawAddress.toString(), matrix.rawAddress.toString(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMultiplyPenTransform(pen: MutPtr<GpPen>, matrix: ConstPtr<Matrix>, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipMultiplyPenTransform(pen.rawAddress.toString(), matrix.rawAddress.toString(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMultiplyTextureTransform(brush: MutPtr<GpTexture>, matrix: ConstPtr<Matrix>, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipMultiplyTextureTransform(brush.rawAddress.toString(), matrix.rawAddress.toString(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMultiplyWorldTransform(graphics: MutPtr<GpGraphics>, matrix: ConstPtr<Matrix>, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipMultiplyWorldTransform(graphics.rawAddress.toString(), matrix.rawAddress.toString(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipNewInstalledFontCollection(fontcollection: MutPtr<MutPtr<GpFontCollection>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipNewInstalledFontCollection(fontcollection.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipNewPrivateFontCollection(fontcollection: MutPtr<MutPtr<GpFontCollection>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipNewPrivateFontCollection(fontcollection.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterCopyData(iterator: MutPtr<GpPathIterator>, resultcount: MutPtr<Int>, points: MutPtr<PointF>, types: MutPtr<UByte>, startindex: Int, endindex: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipPathIterCopyData(iterator.rawAddress.toString(), resultcount.rawAddress.toString(), points.rawAddress.toString(), types.rawAddress.toString(), startindex, endindex) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterEnumerate(iterator: MutPtr<GpPathIterator>, resultcount: MutPtr<Int>, points: MutPtr<PointF>, types: MutPtr<UByte>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipPathIterEnumerate(iterator.rawAddress.toString(), resultcount.rawAddress.toString(), points.rawAddress.toString(), types.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterGetCount(iterator: MutPtr<GpPathIterator>, count: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipPathIterGetCount(iterator.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterGetSubpathCount(iterator: MutPtr<GpPathIterator>, count: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipPathIterGetSubpathCount(iterator.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterHasCurve(iterator: MutPtr<GpPathIterator>, hascurve: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipPathIterHasCurve(iterator.rawAddress.toString(), hascurve.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterIsValid(iterator: MutPtr<GpPathIterator>, valid: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipPathIterIsValid(iterator.rawAddress.toString(), valid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterNextMarker(iterator: MutPtr<GpPathIterator>, resultcount: MutPtr<Int>, startindex: MutPtr<Int>, endindex: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextMarker(iterator.rawAddress.toString(), resultcount.rawAddress.toString(), startindex.rawAddress.toString(), endindex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterNextMarkerPath(iterator: MutPtr<GpPathIterator>, resultcount: MutPtr<Int>, path: MutPtr<GpPath>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextMarkerPath(iterator.rawAddress.toString(), resultcount.rawAddress.toString(), path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterNextPathType(iterator: MutPtr<GpPathIterator>, resultcount: MutPtr<Int>, pathtype: MutPtr<UByte>, startindex: MutPtr<Int>, endindex: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextPathType(iterator.rawAddress.toString(), resultcount.rawAddress.toString(), pathtype.rawAddress.toString(), startindex.rawAddress.toString(), endindex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterNextSubpath(iterator: MutPtr<GpPathIterator>, resultcount: MutPtr<Int>, startindex: MutPtr<Int>, endindex: MutPtr<Int>, isclosed: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextSubpath(iterator.rawAddress.toString(), resultcount.rawAddress.toString(), startindex.rawAddress.toString(), endindex.rawAddress.toString(), isclosed.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterNextSubpathPath(iterator: MutPtr<GpPathIterator>, resultcount: MutPtr<Int>, path: MutPtr<GpPath>, isclosed: MutPtr<Bool>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextSubpathPath(iterator.rawAddress.toString(), resultcount.rawAddress.toString(), path.rawAddress.toString(), isclosed.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterRewind(iterator: MutPtr<GpPathIterator>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipPathIterRewind(iterator.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPlayMetafileRecord(metafile: ConstPtr<GpMetafile>, recordtype: EmfPlusRecordType, flags: UInt, datasize: UInt, data: ConstPtr<UByte>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipPlayMetafileRecord(metafile.rawAddress.toString(), recordtype, flags.toInt(), datasize.toInt(), data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPrivateAddFontFile(fontcollection: MutPtr<GpFontCollection>, filename: Pcwstr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipPrivateAddFontFile(fontcollection.rawAddress.toString(), filename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPrivateAddMemoryFont(fontcollection: MutPtr<GpFontCollection>, memory: ConstPtr<CVoid>, length: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipPrivateAddMemoryFont(fontcollection.rawAddress.toString(), memory.rawAddress.toString(), length) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRecordMetafile(referencehdc: Hdc, type: EmfType, framerect: ConstPtr<RectF>, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr<MutPtr<GpMetafile>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafile(referencehdc.rawAddress.toString(), type, framerect.rawAddress.toString(), frameunit, description.rawAddress.toString(), metafile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRecordMetafileFileName(filename: Pcwstr, referencehdc: Hdc, type: EmfType, framerect: ConstPtr<RectF>, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr<MutPtr<GpMetafile>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileFileName(filename.rawAddress.toString(), referencehdc.rawAddress.toString(), type, framerect.rawAddress.toString(), frameunit, description.rawAddress.toString(), metafile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRecordMetafileFileNameI(filename: Pcwstr, referencehdc: Hdc, type: EmfType, framerect: ConstPtr<Rect>, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr<MutPtr<GpMetafile>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileFileNameI(filename.rawAddress.toString(), referencehdc.rawAddress.toString(), type, framerect.rawAddress.toString(), frameunit, description.rawAddress.toString(), metafile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRecordMetafileI(referencehdc: Hdc, type: EmfType, framerect: ConstPtr<Rect>, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr<MutPtr<GpMetafile>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileI(referencehdc.rawAddress.toString(), type, framerect.rawAddress.toString(), frameunit, description.rawAddress.toString(), metafile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRecordMetafileStream(stream: MutPtr<CVoid>, referencehdc: Hdc, type: EmfType, framerect: ConstPtr<RectF>, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr<MutPtr<GpMetafile>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileStream(stream.rawAddress.toString(), referencehdc.rawAddress.toString(), type, framerect.rawAddress.toString(), frameunit, description.rawAddress.toString(), metafile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRecordMetafileStreamI(stream: MutPtr<CVoid>, referencehdc: Hdc, type: EmfType, framerect: ConstPtr<Rect>, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr<MutPtr<GpMetafile>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileStreamI(stream.rawAddress.toString(), referencehdc.rawAddress.toString(), type, framerect.rawAddress.toString(), frameunit, description.rawAddress.toString(), metafile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipReleaseDC(graphics: MutPtr<GpGraphics>, hdc: Hdc): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipReleaseDC(graphics.rawAddress.toString(), hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRemovePropertyItem(image: MutPtr<GpImage>, propid: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipRemovePropertyItem(image.rawAddress.toString(), propid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetClip(graphics: MutPtr<GpGraphics>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipResetClip(graphics.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetImageAttributes(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipResetImageAttributes(imageattr.rawAddress.toString(), type) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetLineTransform(brush: MutPtr<GpLineGradient>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipResetLineTransform(brush.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetPageTransform(graphics: MutPtr<GpGraphics>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipResetPageTransform(graphics.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetPath(path: MutPtr<GpPath>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipResetPath(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetPathGradientTransform(brush: MutPtr<GpPathGradient>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipResetPathGradientTransform(brush.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetPenTransform(pen: MutPtr<GpPen>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipResetPenTransform(pen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetTextureTransform(brush: MutPtr<GpTexture>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipResetTextureTransform(brush.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetWorldTransform(graphics: MutPtr<GpGraphics>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipResetWorldTransform(graphics.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRestoreGraphics(graphics: MutPtr<GpGraphics>, state: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipRestoreGraphics(graphics.rawAddress.toString(), state.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipReversePath(path: MutPtr<GpPath>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipReversePath(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRotateLineTransform(brush: MutPtr<GpLineGradient>, angle: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipRotateLineTransform(brush.rawAddress.toString(), angle.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRotateMatrix(matrix: MutPtr<Matrix>, angle: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipRotateMatrix(matrix.rawAddress.toString(), angle.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRotatePathGradientTransform(brush: MutPtr<GpPathGradient>, angle: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipRotatePathGradientTransform(brush.rawAddress.toString(), angle.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRotatePenTransform(pen: MutPtr<GpPen>, angle: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipRotatePenTransform(pen.rawAddress.toString(), angle.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRotateTextureTransform(brush: MutPtr<GpTexture>, angle: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipRotateTextureTransform(brush.rawAddress.toString(), angle.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRotateWorldTransform(graphics: MutPtr<GpGraphics>, angle: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipRotateWorldTransform(graphics.rawAddress.toString(), angle.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSaveAdd(image: MutPtr<GpImage>, encoderparams: ConstPtr<EncoderParameters>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSaveAdd(image.rawAddress.toString(), encoderparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSaveAddImage(image: MutPtr<GpImage>, newimage: MutPtr<GpImage>, encoderparams: ConstPtr<EncoderParameters>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSaveAddImage(image.rawAddress.toString(), newimage.rawAddress.toString(), encoderparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSaveGraphics(graphics: MutPtr<GpGraphics>, state: MutPtr<UInt>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSaveGraphics(graphics.rawAddress.toString(), state.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSaveImageToFile(image: MutPtr<GpImage>, filename: Pcwstr, clsidencoder: ConstPtr<Guid>, encoderparams: ConstPtr<EncoderParameters>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSaveImageToFile(image.rawAddress.toString(), filename.rawAddress.toString(), clsidencoder.rawAddress.toString(), encoderparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSaveImageToStream(image: MutPtr<GpImage>, stream: MutPtr<CVoid>, clsidencoder: ConstPtr<Guid>, encoderparams: ConstPtr<EncoderParameters>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSaveImageToStream(image.rawAddress.toString(), stream.rawAddress.toString(), clsidencoder.rawAddress.toString(), encoderparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipScaleLineTransform(brush: MutPtr<GpLineGradient>, sx: Float, sy: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipScaleLineTransform(brush.rawAddress.toString(), sx.toDouble(), sy.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipScaleMatrix(matrix: MutPtr<Matrix>, scalex: Float, scaley: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipScaleMatrix(matrix.rawAddress.toString(), scalex.toDouble(), scaley.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipScalePathGradientTransform(brush: MutPtr<GpPathGradient>, sx: Float, sy: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipScalePathGradientTransform(brush.rawAddress.toString(), sx.toDouble(), sy.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipScalePenTransform(pen: MutPtr<GpPen>, sx: Float, sy: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipScalePenTransform(pen.rawAddress.toString(), sx.toDouble(), sy.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipScaleTextureTransform(brush: MutPtr<GpTexture>, sx: Float, sy: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipScaleTextureTransform(brush.rawAddress.toString(), sx.toDouble(), sy.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipScaleWorldTransform(graphics: MutPtr<GpGraphics>, sx: Float, sy: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipScaleWorldTransform(graphics.rawAddress.toString(), sx.toDouble(), sy.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetAdjustableArrowCapFillState(cap: MutPtr<GpAdjustableArrowCap>, fillstate: Bool): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapFillState(cap.rawAddress.toString(), fillstate) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetAdjustableArrowCapHeight(cap: MutPtr<GpAdjustableArrowCap>, height: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapHeight(cap.rawAddress.toString(), height.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetAdjustableArrowCapMiddleInset(cap: MutPtr<GpAdjustableArrowCap>, middleinset: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapMiddleInset(cap.rawAddress.toString(), middleinset.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetAdjustableArrowCapWidth(cap: MutPtr<GpAdjustableArrowCap>, width: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapWidth(cap.rawAddress.toString(), width.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetClipGraphics(graphics: MutPtr<GpGraphics>, srcgraphics: MutPtr<GpGraphics>, combinemode: CombineMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetClipGraphics(graphics.rawAddress.toString(), srcgraphics.rawAddress.toString(), combinemode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetClipHrgn(graphics: MutPtr<GpGraphics>, hrgn: Hrgn, combinemode: CombineMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetClipHrgn(graphics.rawAddress.toString(), hrgn.rawAddress.toString(), combinemode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetClipPath(graphics: MutPtr<GpGraphics>, path: MutPtr<GpPath>, combinemode: CombineMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetClipPath(graphics.rawAddress.toString(), path.rawAddress.toString(), combinemode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetClipRect(graphics: MutPtr<GpGraphics>, x: Float, y: Float, width: Float, height: Float, combinemode: CombineMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetClipRect(graphics.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), combinemode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetClipRectI(graphics: MutPtr<GpGraphics>, x: Int, y: Int, width: Int, height: Int, combinemode: CombineMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetClipRectI(graphics.rawAddress.toString(), x, y, width, height, combinemode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetClipRegion(graphics: MutPtr<GpGraphics>, region: MutPtr<GpRegion>, combinemode: CombineMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetClipRegion(graphics.rawAddress.toString(), region.rawAddress.toString(), combinemode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetCompositingMode(graphics: MutPtr<GpGraphics>, compositingmode: CompositingMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetCompositingMode(graphics.rawAddress.toString(), compositingmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetCompositingQuality(graphics: MutPtr<GpGraphics>, compositingquality: CompositingQuality): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetCompositingQuality(graphics.rawAddress.toString(), compositingquality) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetCustomLineCapBaseCap(customcap: MutPtr<GpCustomLineCap>, basecap: LineCap): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapBaseCap(customcap.rawAddress.toString(), basecap) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetCustomLineCapBaseInset(customcap: MutPtr<GpCustomLineCap>, inset: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapBaseInset(customcap.rawAddress.toString(), inset.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetCustomLineCapStrokeCaps(customcap: MutPtr<GpCustomLineCap>, startcap: LineCap, endcap: LineCap): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapStrokeCaps(customcap.rawAddress.toString(), startcap, endcap) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetCustomLineCapStrokeJoin(customcap: MutPtr<GpCustomLineCap>, linejoin: LineJoin): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapStrokeJoin(customcap.rawAddress.toString(), linejoin) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetCustomLineCapWidthScale(customcap: MutPtr<GpCustomLineCap>, widthscale: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapWidthScale(customcap.rawAddress.toString(), widthscale.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetEffectParameters(effect: MutPtr<CGpEffect>, params: ConstPtr<CVoid>, size: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetEffectParameters(effect.rawAddress.toString(), params.rawAddress.toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetEmpty(region: MutPtr<GpRegion>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetEmpty(region.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesCachedBackground(imageattr: MutPtr<GpImageAttributes>, enableflag: Bool): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesCachedBackground(imageattr.rawAddress.toString(), enableflag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesColorKeys(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType, enableflag: Bool, colorlow: UInt, colorhigh: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesColorKeys(imageattr.rawAddress.toString(), type, enableflag, colorlow.toInt(), colorhigh.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesColorMatrix(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType, enableflag: Bool, colormatrix: ConstPtr<ColorMatrix>, graymatrix: ConstPtr<ColorMatrix>, flags: ColorMatrixFlags): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesColorMatrix(imageattr.rawAddress.toString(), type, enableflag, colormatrix.rawAddress.toString(), graymatrix.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesGamma(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType, enableflag: Bool, gamma: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesGamma(imageattr.rawAddress.toString(), type, enableflag, gamma.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesNoOp(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType, enableflag: Bool): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesNoOp(imageattr.rawAddress.toString(), type, enableflag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesOutputChannel(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType, enableflag: Bool, channelflags: ColorChannelFlags): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesOutputChannel(imageattr.rawAddress.toString(), type, enableflag, channelflags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesOutputChannelColorProfile(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType, enableflag: Bool, colorprofilefilename: Pcwstr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesOutputChannelColorProfile(imageattr.rawAddress.toString(), type, enableflag, colorprofilefilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesRemapTable(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType, enableflag: Bool, mapsize: UInt, map: ConstPtr<ColorMap>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesRemapTable(imageattr.rawAddress.toString(), type, enableflag, mapsize.toInt(), map.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesThreshold(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType, enableflag: Bool, threshold: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesThreshold(imageattr.rawAddress.toString(), type, enableflag, threshold.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesToIdentity(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesToIdentity(imageattr.rawAddress.toString(), type) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesWrapMode(imageattr: MutPtr<GpImageAttributes>, wrap: WrapMode, argb: UInt, clamp: Bool): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesWrapMode(imageattr.rawAddress.toString(), wrap, argb.toInt(), clamp) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImagePalette(image: MutPtr<GpImage>, palette: ConstPtr<ColorPalette>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetImagePalette(image.rawAddress.toString(), palette.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetInfinite(region: MutPtr<GpRegion>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetInfinite(region.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetInterpolationMode(graphics: MutPtr<GpGraphics>, interpolationmode: InterpolationMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetInterpolationMode(graphics.rawAddress.toString(), interpolationmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetLineBlend(brush: MutPtr<GpLineGradient>, blend: ConstPtr<Float>, positions: ConstPtr<Float>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetLineBlend(brush.rawAddress.toString(), blend.rawAddress.toString(), positions.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetLineColors(brush: MutPtr<GpLineGradient>, color1: UInt, color2: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetLineColors(brush.rawAddress.toString(), color1.toInt(), color2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetLineGammaCorrection(brush: MutPtr<GpLineGradient>, usegammacorrection: Bool): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetLineGammaCorrection(brush.rawAddress.toString(), usegammacorrection) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetLineLinearBlend(brush: MutPtr<GpLineGradient>, focus: Float, scale: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetLineLinearBlend(brush.rawAddress.toString(), focus.toDouble(), scale.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetLinePresetBlend(brush: MutPtr<GpLineGradient>, blend: ConstPtr<UInt>, positions: ConstPtr<Float>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetLinePresetBlend(brush.rawAddress.toString(), blend.rawAddress.toString(), positions.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetLineSigmaBlend(brush: MutPtr<GpLineGradient>, focus: Float, scale: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetLineSigmaBlend(brush.rawAddress.toString(), focus.toDouble(), scale.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetLineTransform(brush: MutPtr<GpLineGradient>, matrix: ConstPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetLineTransform(brush.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetLineWrapMode(brush: MutPtr<GpLineGradient>, wrapmode: WrapMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetLineWrapMode(brush.rawAddress.toString(), wrapmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetMatrixElements(matrix: MutPtr<Matrix>, m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetMatrixElements(matrix.rawAddress.toString(), m11.toDouble(), m12.toDouble(), m21.toDouble(), m22.toDouble(), dx.toDouble(), dy.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetMetafileDownLevelRasterizationLimit(metafile: MutPtr<GpMetafile>, metafilerasterizationlimitdpi: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetMetafileDownLevelRasterizationLimit(metafile.rawAddress.toString(), metafilerasterizationlimitdpi.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPageScale(graphics: MutPtr<GpGraphics>, scale: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPageScale(graphics.rawAddress.toString(), scale.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPageUnit(graphics: MutPtr<GpGraphics>, unit: Unit): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPageUnit(graphics.rawAddress.toString(), unit) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathFillMode(path: MutPtr<GpPath>, fillmode: FillMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPathFillMode(path.rawAddress.toString(), fillmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientBlend(brush: MutPtr<GpPathGradient>, blend: ConstPtr<Float>, positions: ConstPtr<Float>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientBlend(brush.rawAddress.toString(), blend.rawAddress.toString(), positions.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientCenterColor(brush: MutPtr<GpPathGradient>, colors: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientCenterColor(brush.rawAddress.toString(), colors.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientCenterPoint(brush: MutPtr<GpPathGradient>, points: ConstPtr<PointF>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientCenterPoint(brush.rawAddress.toString(), points.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientCenterPointI(brush: MutPtr<GpPathGradient>, points: ConstPtr<Point>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientCenterPointI(brush.rawAddress.toString(), points.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientFocusScales(brush: MutPtr<GpPathGradient>, xscale: Float, yscale: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientFocusScales(brush.rawAddress.toString(), xscale.toDouble(), yscale.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientGammaCorrection(brush: MutPtr<GpPathGradient>, usegammacorrection: Bool): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientGammaCorrection(brush.rawAddress.toString(), usegammacorrection) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientLinearBlend(brush: MutPtr<GpPathGradient>, focus: Float, scale: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientLinearBlend(brush.rawAddress.toString(), focus.toDouble(), scale.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientPath(brush: MutPtr<GpPathGradient>, path: ConstPtr<GpPath>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientPath(brush.rawAddress.toString(), path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientPresetBlend(brush: MutPtr<GpPathGradient>, blend: ConstPtr<UInt>, positions: ConstPtr<Float>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientPresetBlend(brush.rawAddress.toString(), blend.rawAddress.toString(), positions.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientSigmaBlend(brush: MutPtr<GpPathGradient>, focus: Float, scale: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientSigmaBlend(brush.rawAddress.toString(), focus.toDouble(), scale.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientSurroundColorsWithCount(brush: MutPtr<GpPathGradient>, color: ConstPtr<UInt>, count: MutPtr<Int>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientSurroundColorsWithCount(brush.rawAddress.toString(), color.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientTransform(brush: MutPtr<GpPathGradient>, matrix: MutPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientTransform(brush.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientWrapMode(brush: MutPtr<GpPathGradient>, wrapmode: WrapMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientWrapMode(brush.rawAddress.toString(), wrapmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathMarker(path: MutPtr<GpPath>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPathMarker(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenBrushFill(pen: MutPtr<GpPen>, brush: MutPtr<GpBrush>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenBrushFill(pen.rawAddress.toString(), brush.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenColor(pen: MutPtr<GpPen>, argb: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenColor(pen.rawAddress.toString(), argb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenCompoundArray(pen: MutPtr<GpPen>, dash: ConstPtr<Float>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenCompoundArray(pen.rawAddress.toString(), dash.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenCustomEndCap(pen: MutPtr<GpPen>, customcap: MutPtr<GpCustomLineCap>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenCustomEndCap(pen.rawAddress.toString(), customcap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenCustomStartCap(pen: MutPtr<GpPen>, customcap: MutPtr<GpCustomLineCap>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenCustomStartCap(pen.rawAddress.toString(), customcap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenDashArray(pen: MutPtr<GpPen>, dash: ConstPtr<Float>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashArray(pen.rawAddress.toString(), dash.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenDashCap197819(pen: MutPtr<GpPen>, dashcap: DashCap): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashCap197819(pen.rawAddress.toString(), dashcap) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenDashOffset(pen: MutPtr<GpPen>, offset: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashOffset(pen.rawAddress.toString(), offset.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenDashStyle(pen: MutPtr<GpPen>, dashstyle: DashStyle): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashStyle(pen.rawAddress.toString(), dashstyle) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenEndCap(pen: MutPtr<GpPen>, endcap: LineCap): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenEndCap(pen.rawAddress.toString(), endcap) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenLineCap197819(pen: MutPtr<GpPen>, startcap: LineCap, endcap: LineCap, dashcap: DashCap): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenLineCap197819(pen.rawAddress.toString(), startcap, endcap, dashcap) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenLineJoin(pen: MutPtr<GpPen>, linejoin: LineJoin): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenLineJoin(pen.rawAddress.toString(), linejoin) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenMiterLimit(pen: MutPtr<GpPen>, miterlimit: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenMiterLimit(pen.rawAddress.toString(), miterlimit.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenMode(pen: MutPtr<GpPen>, penmode: PenAlignment): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenMode(pen.rawAddress.toString(), penmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenStartCap(pen: MutPtr<GpPen>, startcap: LineCap): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenStartCap(pen.rawAddress.toString(), startcap) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenTransform(pen: MutPtr<GpPen>, matrix: MutPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenTransform(pen.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenUnit(pen: MutPtr<GpPen>, unit: Unit): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenUnit(pen.rawAddress.toString(), unit) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenWidth(pen: MutPtr<GpPen>, width: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenWidth(pen.rawAddress.toString(), width.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPixelOffsetMode(graphics: MutPtr<GpGraphics>, pixeloffsetmode: PixelOffsetMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPixelOffsetMode(graphics.rawAddress.toString(), pixeloffsetmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPropertyItem(image: MutPtr<GpImage>, item: ConstPtr<PropertyItem>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPropertyItem(image.rawAddress.toString(), item.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetRenderingOrigin(graphics: MutPtr<GpGraphics>, x: Int, y: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetRenderingOrigin(graphics.rawAddress.toString(), x, y) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetSmoothingMode(graphics: MutPtr<GpGraphics>, smoothingmode: SmoothingMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetSmoothingMode(graphics.rawAddress.toString(), smoothingmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetSolidFillColor(brush: MutPtr<GpSolidFill>, color: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetSolidFillColor(brush.rawAddress.toString(), color.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetStringFormatAlign(format: MutPtr<GpStringFormat>, align: StringAlignment): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatAlign(format.rawAddress.toString(), align) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetStringFormatDigitSubstitution(format: MutPtr<GpStringFormat>, language: UShort, substitute: StringDigitSubstitute): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatDigitSubstitution(format.rawAddress.toString(), language.toInt(), substitute) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetStringFormatFlags(format: MutPtr<GpStringFormat>, flags: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatFlags(format.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetStringFormatHotkeyPrefix(format: MutPtr<GpStringFormat>, hotkeyprefix: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatHotkeyPrefix(format.rawAddress.toString(), hotkeyprefix) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetStringFormatLineAlign(format: MutPtr<GpStringFormat>, align: StringAlignment): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatLineAlign(format.rawAddress.toString(), align) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetStringFormatMeasurableCharacterRanges(format: MutPtr<GpStringFormat>, rangecount: Int, ranges: ConstPtr<CharacterRange>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatMeasurableCharacterRanges(format.rawAddress.toString(), rangecount, ranges.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetStringFormatTabStops(format: MutPtr<GpStringFormat>, firsttaboffset: Float, count: Int, tabstops: ConstPtr<Float>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatTabStops(format.rawAddress.toString(), firsttaboffset.toDouble(), count, tabstops.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetStringFormatTrimming(format: MutPtr<GpStringFormat>, trimming: StringTrimming): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatTrimming(format.rawAddress.toString(), trimming) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetTextContrast(graphics: MutPtr<GpGraphics>, contrast: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetTextContrast(graphics.rawAddress.toString(), contrast.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetTextRenderingHint(graphics: MutPtr<GpGraphics>, mode: TextRenderingHint): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetTextRenderingHint(graphics.rawAddress.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetTextureTransform(brush: MutPtr<GpTexture>, matrix: ConstPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetTextureTransform(brush.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetTextureWrapMode(brush: MutPtr<GpTexture>, wrapmode: WrapMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetTextureWrapMode(brush.rawAddress.toString(), wrapmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetWorldTransform(graphics: MutPtr<GpGraphics>, matrix: MutPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetWorldTransform(graphics.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipShearMatrix(matrix: MutPtr<Matrix>, shearx: Float, sheary: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipShearMatrix(matrix.rawAddress.toString(), shearx.toDouble(), sheary.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipStartPathFigure(path: MutPtr<GpPath>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipStartPathFigure(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipStringFormatGetGenericDefault(format: MutPtr<MutPtr<GpStringFormat>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipStringFormatGetGenericDefault(format.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipStringFormatGetGenericTypographic(format: MutPtr<MutPtr<GpStringFormat>>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipStringFormatGetGenericTypographic(format.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTestControl(control: GpTestControlEnum, param1: MutPtr<CVoid>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTestControl(control, param1.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTransformMatrixPoints(matrix: MutPtr<Matrix>, pts: MutPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTransformMatrixPoints(matrix.rawAddress.toString(), pts.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTransformMatrixPointsI(matrix: MutPtr<Matrix>, pts: MutPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTransformMatrixPointsI(matrix.rawAddress.toString(), pts.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTransformPath(path: MutPtr<GpPath>, matrix: MutPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTransformPath(path.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTransformPoints(graphics: MutPtr<GpGraphics>, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: MutPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTransformPoints(graphics.rawAddress.toString(), destspace, srcspace, points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTransformPointsI(graphics: MutPtr<GpGraphics>, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: MutPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTransformPointsI(graphics.rawAddress.toString(), destspace, srcspace, points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTransformRegion(region: MutPtr<GpRegion>, matrix: MutPtr<Matrix>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTransformRegion(region.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslateClip(graphics: MutPtr<GpGraphics>, dx: Float, dy: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTranslateClip(graphics.rawAddress.toString(), dx.toDouble(), dy.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslateClipI(graphics: MutPtr<GpGraphics>, dx: Int, dy: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTranslateClipI(graphics.rawAddress.toString(), dx, dy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslateLineTransform(brush: MutPtr<GpLineGradient>, dx: Float, dy: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTranslateLineTransform(brush.rawAddress.toString(), dx.toDouble(), dy.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslateMatrix(matrix: MutPtr<Matrix>, offsetx: Float, offsety: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTranslateMatrix(matrix.rawAddress.toString(), offsetx.toDouble(), offsety.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslatePathGradientTransform(brush: MutPtr<GpPathGradient>, dx: Float, dy: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTranslatePathGradientTransform(brush.rawAddress.toString(), dx.toDouble(), dy.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslatePenTransform(pen: MutPtr<GpPen>, dx: Float, dy: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTranslatePenTransform(pen.rawAddress.toString(), dx.toDouble(), dy.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslateRegion(region: MutPtr<GpRegion>, dx: Float, dy: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTranslateRegion(region.rawAddress.toString(), dx.toDouble(), dy.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslateRegionI(region: MutPtr<GpRegion>, dx: Int, dy: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTranslateRegionI(region.rawAddress.toString(), dx, dy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslateTextureTransform(brush: MutPtr<GpTexture>, dx: Float, dy: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTranslateTextureTransform(brush.rawAddress.toString(), dx.toDouble(), dy.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslateWorldTransform(graphics: MutPtr<GpGraphics>, dx: Float, dy: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTranslateWorldTransform(graphics.rawAddress.toString(), dx.toDouble(), dy.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipVectorTransformMatrixPoints(matrix: MutPtr<Matrix>, pts: MutPtr<PointF>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipVectorTransformMatrixPoints(matrix.rawAddress.toString(), pts.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipVectorTransformMatrixPointsI(matrix: MutPtr<Matrix>, pts: MutPtr<Point>, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipVectorTransformMatrixPointsI(matrix.rawAddress.toString(), pts.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipWarpPath(path: MutPtr<GpPath>, matrix: MutPtr<Matrix>, points: ConstPtr<PointF>, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, warpmode: WarpMode, flatness: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipWarpPath(path.rawAddress.toString(), matrix.rawAddress.toString(), points.rawAddress.toString(), count, srcx.toDouble(), srcy.toDouble(), srcwidth.toDouble(), srcheight.toDouble(), warpmode, flatness.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipWidenPath(nativepath: MutPtr<GpPath>, pen: MutPtr<GpPen>, matrix: MutPtr<Matrix>, flatness: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipWidenPath(nativepath.rawAddress.toString(), pen.rawAddress.toString(), matrix.rawAddress.toString(), flatness.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipWindingModeOutline(path: MutPtr<GpPath>, matrix: MutPtr<Matrix>, flatness: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipWindingModeOutline(path.rawAddress.toString(), matrix.rawAddress.toString(), flatness.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiplusNotificationHook(token: MutPtr<ULong>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdiplusNotificationHook(token.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiplusNotificationUnhook(token: ULong) {
    if (windowsWin32GraphicsGdiplusNapiAddon != null) {
        windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdiplusNotificationUnhook(token.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gdiplusShutdown(token: ULong) {
    if (windowsWin32GraphicsGdiplusNapiAddon != null) {
        windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdiplusShutdown(token.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gdiplusStartup(token: MutPtr<ULong>, input: ConstPtr<GdiplusStartupInput>, output: MutPtr<GdiplusStartupOutput>): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdiplusStartup(token.rawAddress.toString(), input.rawAddress.toString(), output.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
