@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

private val windowsWin32GraphicsGdiplusNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun gdipAddPathArc(path: MutPtr, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathArc(path.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), startangle.toDouble(), sweepangle.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathArcI(path: MutPtr, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathArcI(path.rawAddress.toString(), x, y, width, height, startangle.toDouble(), sweepangle.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathBezier(path: MutPtr, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathBezier(path.rawAddress.toString(), x1.toDouble(), y1.toDouble(), x2.toDouble(), y2.toDouble(), x3.toDouble(), y3.toDouble(), x4.toDouble(), y4.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathBezierI(path: MutPtr, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathBezierI(path.rawAddress.toString(), x1, y1, x2, y2, x3, y3, x4, y4) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathBeziers(path: MutPtr, points: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathBeziers(path.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathBeziersI(path: MutPtr, points: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathBeziersI(path.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathClosedCurve(path: MutPtr, points: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurve(path.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathClosedCurve2(path: MutPtr, points: ConstPtr, count: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurve2(path.rawAddress.toString(), points.rawAddress.toString(), count, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathClosedCurve2I(path: MutPtr, points: ConstPtr, count: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurve2I(path.rawAddress.toString(), points.rawAddress.toString(), count, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathClosedCurveI(path: MutPtr, points: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurveI(path.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathCurve(path: MutPtr, points: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve(path.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathCurve2(path: MutPtr, points: ConstPtr, count: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve2(path.rawAddress.toString(), points.rawAddress.toString(), count, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathCurve2I(path: MutPtr, points: ConstPtr, count: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve2I(path.rawAddress.toString(), points.rawAddress.toString(), count, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathCurve3(path: MutPtr, points: ConstPtr, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve3(path.rawAddress.toString(), points.rawAddress.toString(), count, offset, numberofsegments, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathCurve3I(path: MutPtr, points: ConstPtr, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve3I(path.rawAddress.toString(), points.rawAddress.toString(), count, offset, numberofsegments, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathCurveI(path: MutPtr, points: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurveI(path.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathEllipse(path: MutPtr, x: Float, y: Float, width: Float, height: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathEllipse(path.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathEllipseI(path: MutPtr, x: Int, y: Int, width: Int, height: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathEllipseI(path.rawAddress.toString(), x, y, width, height) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathLine(path: MutPtr, x1: Float, y1: Float, x2: Float, y2: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathLine(path.rawAddress.toString(), x1.toDouble(), y1.toDouble(), x2.toDouble(), y2.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathLine2(path: MutPtr, points: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathLine2(path.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathLine2I(path: MutPtr, points: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathLine2I(path.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathLineI(path: MutPtr, x1: Int, y1: Int, x2: Int, y2: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathLineI(path.rawAddress.toString(), x1, y1, x2, y2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathPath(path: MutPtr, addingpath: ConstPtr, connect: Bool): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathPath(path.rawAddress.toString(), addingpath.rawAddress.toString(), connect) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathPie(path: MutPtr, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathPie(path.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), startangle.toDouble(), sweepangle.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathPieI(path: MutPtr, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathPieI(path.rawAddress.toString(), x, y, width, height, startangle.toDouble(), sweepangle.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathPolygon(path: MutPtr, points: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathPolygon(path.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathPolygonI(path: MutPtr, points: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathPolygonI(path.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathRectangle(path: MutPtr, x: Float, y: Float, width: Float, height: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectangle(path.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathRectangleI(path: MutPtr, x: Int, y: Int, width: Int, height: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectangleI(path.rawAddress.toString(), x, y, width, height) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathRectangles(path: MutPtr, rects: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectangles(path.rawAddress.toString(), rects.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathRectanglesI(path: MutPtr, rects: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectanglesI(path.rawAddress.toString(), rects.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathString(path: MutPtr, string: Pcwstr, length: Int, family: ConstPtr, style: Int, emsize: Float, layoutrect: ConstPtr, format: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathString(path.rawAddress.toString(), string.rawAddress.toString(), length, family.rawAddress.toString(), style, emsize.toDouble(), layoutrect.rawAddress.toString(), format.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAddPathStringI(path: MutPtr, string: Pcwstr, length: Int, family: ConstPtr, style: Int, emsize: Float, layoutrect: ConstPtr, format: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAddPathStringI(path.rawAddress.toString(), string.rawAddress.toString(), length, family.rawAddress.toString(), style, emsize.toDouble(), layoutrect.rawAddress.toString(), format.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipAlloc(size: ULong): MutPtr =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) MutPtr((windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipAlloc(size.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBeginContainer(graphics: MutPtr, dstrect: ConstPtr, srcrect: ConstPtr, unit: Unit, state: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipBeginContainer(graphics.rawAddress.toString(), dstrect.rawAddress.toString(), srcrect.rawAddress.toString(), unit, state.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBeginContainer2(graphics: MutPtr, state: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipBeginContainer2(graphics.rawAddress.toString(), state.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBeginContainerI(graphics: MutPtr, dstrect: ConstPtr, srcrect: ConstPtr, unit: Unit, state: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipBeginContainerI(graphics.rawAddress.toString(), dstrect.rawAddress.toString(), srcrect.rawAddress.toString(), unit, state.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapApplyEffect(bitmap: MutPtr, effect: MutPtr, roi: MutPtr, useauxdata: Bool, auxdata: MutPtr, auxdatasize: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipBitmapApplyEffect(bitmap.rawAddress.toString(), effect.rawAddress.toString(), roi.rawAddress.toString(), useauxdata, auxdata.rawAddress.toString(), auxdatasize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapConvertFormat(pinputbitmap: MutPtr, format: Int, dithertype: DitherType, palettetype: PaletteType, palette: MutPtr, alphathresholdpercent: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipBitmapConvertFormat(pinputbitmap.rawAddress.toString(), format, dithertype, palettetype, palette.rawAddress.toString(), alphathresholdpercent.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapCreateApplyEffect(inputbitmaps: MutPtr, numinputs: Int, effect: MutPtr, roi: MutPtr, outputrect: MutPtr, outputbitmap: MutPtr, useauxdata: Bool, auxdata: MutPtr, auxdatasize: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipBitmapCreateApplyEffect(inputbitmaps.rawAddress.toString(), numinputs, effect.rawAddress.toString(), roi.rawAddress.toString(), outputrect.rawAddress.toString(), outputbitmap.rawAddress.toString(), useauxdata, auxdata.rawAddress.toString(), auxdatasize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapGetHistogram(bitmap: MutPtr, format: HistogramFormat, numberofentries: UInt, channel0: MutPtr, channel1: MutPtr, channel2: MutPtr, channel3: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipBitmapGetHistogram(bitmap.rawAddress.toString(), format, numberofentries.toInt(), channel0.rawAddress.toString(), channel1.rawAddress.toString(), channel2.rawAddress.toString(), channel3.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapGetHistogramSize(format: HistogramFormat, numberofentries: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipBitmapGetHistogramSize(format, numberofentries.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapGetPixel(bitmap: MutPtr, x: Int, y: Int, color: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipBitmapGetPixel(bitmap.rawAddress.toString(), x, y, color.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapLockBits(bitmap: MutPtr, rect: ConstPtr, flags: UInt, format: Int, lockedbitmapdata: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipBitmapLockBits(bitmap.rawAddress.toString(), rect.rawAddress.toString(), flags.toInt(), format, lockedbitmapdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapSetPixel(bitmap: MutPtr, x: Int, y: Int, color: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipBitmapSetPixel(bitmap.rawAddress.toString(), x, y, color.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapSetResolution(bitmap: MutPtr, xdpi: Float, ydpi: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipBitmapSetResolution(bitmap.rawAddress.toString(), xdpi.toDouble(), ydpi.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipBitmapUnlockBits(bitmap: MutPtr, lockedbitmapdata: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipBitmapUnlockBits(bitmap.rawAddress.toString(), lockedbitmapdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipClearPathMarkers(path: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipClearPathMarkers(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneBitmapArea(x: Float, y: Float, width: Float, height: Float, format: Int, srcbitmap: MutPtr, dstbitmap: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCloneBitmapArea(x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), format, srcbitmap.rawAddress.toString(), dstbitmap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneBitmapAreaI(x: Int, y: Int, width: Int, height: Int, format: Int, srcbitmap: MutPtr, dstbitmap: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCloneBitmapAreaI(x, y, width, height, format, srcbitmap.rawAddress.toString(), dstbitmap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneBrush(brush: MutPtr, clonebrush: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCloneBrush(brush.rawAddress.toString(), clonebrush.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneCustomLineCap(customcap: MutPtr, clonedcap: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCloneCustomLineCap(customcap.rawAddress.toString(), clonedcap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneFont(font: MutPtr, clonefont: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCloneFont(font.rawAddress.toString(), clonefont.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneFontFamily(fontfamily: MutPtr, clonedfontfamily: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCloneFontFamily(fontfamily.rawAddress.toString(), clonedfontfamily.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneImage(image: MutPtr, cloneimage: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCloneImage(image.rawAddress.toString(), cloneimage.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneImageAttributes(imageattr: ConstPtr, cloneimageattr: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCloneImageAttributes(imageattr.rawAddress.toString(), cloneimageattr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneMatrix(matrix: MutPtr, clonematrix: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCloneMatrix(matrix.rawAddress.toString(), clonematrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipClonePath(path: MutPtr, clonepath: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipClonePath(path.rawAddress.toString(), clonepath.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipClonePen(pen: MutPtr, clonepen: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipClonePen(pen.rawAddress.toString(), clonepen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneRegion(region: MutPtr, cloneregion: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCloneRegion(region.rawAddress.toString(), cloneregion.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCloneStringFormat(format: ConstPtr, newformat: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCloneStringFormat(format.rawAddress.toString(), newformat.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipClosePathFigure(path: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipClosePathFigure(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipClosePathFigures(path: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipClosePathFigures(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCombineRegionPath(region: MutPtr, path: MutPtr, combinemode: CombineMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionPath(region.rawAddress.toString(), path.rawAddress.toString(), combinemode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCombineRegionRect(region: MutPtr, rect: ConstPtr, combinemode: CombineMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionRect(region.rawAddress.toString(), rect.rawAddress.toString(), combinemode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCombineRegionRectI(region: MutPtr, rect: ConstPtr, combinemode: CombineMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionRectI(region.rawAddress.toString(), rect.rawAddress.toString(), combinemode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCombineRegionRegion(region: MutPtr, region2: MutPtr, combinemode: CombineMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionRegion(region.rawAddress.toString(), region2.rawAddress.toString(), combinemode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipComment(graphics: MutPtr, sizedata: UInt, data: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipComment(graphics.rawAddress.toString(), sizedata.toInt(), data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipConvertToEmfPlus(refgraphics: ConstPtr, metafile: MutPtr, conversionfailureflag: MutPtr, emftype: EmfType, description: Pcwstr, outMetafile: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipConvertToEmfPlus(refgraphics.rawAddress.toString(), metafile.rawAddress.toString(), conversionfailureflag.rawAddress.toString(), emftype, description.rawAddress.toString(), outMetafile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipConvertToEmfPlusToFile(refgraphics: ConstPtr, metafile: MutPtr, conversionfailureflag: MutPtr, filename: Pcwstr, emftype: EmfType, description: Pcwstr, outMetafile: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipConvertToEmfPlusToFile(refgraphics.rawAddress.toString(), metafile.rawAddress.toString(), conversionfailureflag.rawAddress.toString(), filename.rawAddress.toString(), emftype, description.rawAddress.toString(), outMetafile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipConvertToEmfPlusToStream(refgraphics: ConstPtr, metafile: MutPtr, conversionfailureflag: MutPtr, stream: MutPtr, emftype: EmfType, description: Pcwstr, outMetafile: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipConvertToEmfPlusToStream(refgraphics.rawAddress.toString(), metafile.rawAddress.toString(), conversionfailureflag.rawAddress.toString(), stream.rawAddress.toString(), emftype, description.rawAddress.toString(), outMetafile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateAdjustableArrowCap(height: Float, width: Float, isfilled: Bool, cap: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateAdjustableArrowCap(height.toDouble(), width.toDouble(), isfilled, cap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromFile(filename: Pcwstr, bitmap: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromFile(filename.rawAddress.toString(), bitmap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromFileICM(filename: Pcwstr, bitmap: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromFileICM(filename.rawAddress.toString(), bitmap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromGdiDib(gdibitmapinfo: ConstPtr, gdibitmapdata: MutPtr, bitmap: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromGdiDib(gdibitmapinfo.rawAddress.toString(), gdibitmapdata.rawAddress.toString(), bitmap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromGraphics(width: Int, height: Int, target: MutPtr, bitmap: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromGraphics(width, height, target.rawAddress.toString(), bitmap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromHBITMAP(hbm: Hbitmap, hpal: Hpalette, bitmap: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromHBITMAP(hbm.rawAddress.toString(), hpal.rawAddress.toString(), bitmap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromHICON(hicon: Hicon, bitmap: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromHICON(hicon.rawAddress.toString(), bitmap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromResource(hinstance: Hinstance, lpbitmapname: Pcwstr, bitmap: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromResource(hinstance.rawAddress.toString(), lpbitmapname.rawAddress.toString(), bitmap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromScan0(width: Int, height: Int, stride: Int, format: Int, scan0: ConstPtr, bitmap: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromScan0(width, height, stride, format, scan0.rawAddress.toString(), bitmap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromStream(stream: MutPtr, bitmap: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromStream(stream.rawAddress.toString(), bitmap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateBitmapFromStreamICM(stream: MutPtr, bitmap: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromStreamICM(stream.rawAddress.toString(), bitmap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateCachedBitmap(bitmap: MutPtr, graphics: MutPtr, cachedbitmap: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateCachedBitmap(bitmap.rawAddress.toString(), graphics.rawAddress.toString(), cachedbitmap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateCustomLineCap(fillpath: MutPtr, strokepath: MutPtr, basecap: LineCap, baseinset: Float, customcap: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateCustomLineCap(fillpath.rawAddress.toString(), strokepath.rawAddress.toString(), basecap, baseinset.toDouble(), customcap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateEffect(guid: Guid, effect: MutPtr): Status =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFont(fontfamily: ConstPtr, emsize: Float, style: Int, unit: Unit, font: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateFont(fontfamily.rawAddress.toString(), emsize.toDouble(), style, unit, font.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFontFamilyFromName(name: Pcwstr, fontcollection: MutPtr, fontfamily: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFamilyFromName(name.rawAddress.toString(), fontcollection.rawAddress.toString(), fontfamily.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFontFromDC(hdc: Hdc, font: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFromDC(hdc.rawAddress.toString(), font.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFontFromLogfontA(hdc: Hdc, logfont: ConstPtr, font: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFromLogfontA(hdc.rawAddress.toString(), logfont.rawAddress.toString(), font.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFontFromLogfontW(hdc: Hdc, logfont: ConstPtr, font: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFromLogfontW(hdc.rawAddress.toString(), logfont.rawAddress.toString(), font.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFromHDC(hdc: Hdc, graphics: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHDC(hdc.rawAddress.toString(), graphics.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFromHDC2(hdc: Hdc, hdevice: Handle, graphics: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHDC2(hdc.rawAddress.toString(), hdevice.rawAddress.toString(), graphics.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFromHWND(hwnd: Hwnd, graphics: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHWND(hwnd.rawAddress.toString(), graphics.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateFromHWNDICM(hwnd: Hwnd, graphics: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHWNDICM(hwnd.rawAddress.toString(), graphics.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateHBITMAPFromBitmap(bitmap: MutPtr, hbmreturn: MutPtr, background: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateHBITMAPFromBitmap(bitmap.rawAddress.toString(), hbmreturn.rawAddress.toString(), background.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateHICONFromBitmap(bitmap: MutPtr, hbmreturn: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateHICONFromBitmap(bitmap.rawAddress.toString(), hbmreturn.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateHalftonePalette(): Hpalette =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) MutPtr((windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateHalftonePalette() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateHatchBrush(hatchstyle: HatchStyle, forecol: UInt, backcol: UInt, brush: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateHatchBrush(hatchstyle, forecol.toInt(), backcol.toInt(), brush.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateImageAttributes(imageattr: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateImageAttributes(imageattr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateLineBrush(point1: ConstPtr, point2: ConstPtr, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrush(point1.rawAddress.toString(), point2.rawAddress.toString(), color1.toInt(), color2.toInt(), wrapmode, linegradient.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateLineBrushFromRect(rect: ConstPtr, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRect(rect.rawAddress.toString(), color1.toInt(), color2.toInt(), mode, wrapmode, linegradient.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateLineBrushFromRectI(rect: ConstPtr, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRectI(rect.rawAddress.toString(), color1.toInt(), color2.toInt(), mode, wrapmode, linegradient.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateLineBrushFromRectWithAngle(rect: ConstPtr, color1: UInt, color2: UInt, angle: Float, isanglescalable: Bool, wrapmode: WrapMode, linegradient: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRectWithAngle(rect.rawAddress.toString(), color1.toInt(), color2.toInt(), angle.toDouble(), isanglescalable, wrapmode, linegradient.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateLineBrushFromRectWithAngleI(rect: ConstPtr, color1: UInt, color2: UInt, angle: Float, isanglescalable: Bool, wrapmode: WrapMode, linegradient: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRectWithAngleI(rect.rawAddress.toString(), color1.toInt(), color2.toInt(), angle.toDouble(), isanglescalable, wrapmode, linegradient.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateLineBrushI(point1: ConstPtr, point2: ConstPtr, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushI(point1.rawAddress.toString(), point2.rawAddress.toString(), color1.toInt(), color2.toInt(), wrapmode, linegradient.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMatrix(matrix: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix(matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMatrix2(m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float, matrix: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix2(m11.toDouble(), m12.toDouble(), m21.toDouble(), m22.toDouble(), dx.toDouble(), dy.toDouble(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMatrix3(rect: ConstPtr, dstplg: ConstPtr, matrix: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix3(rect.rawAddress.toString(), dstplg.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMatrix3I(rect: ConstPtr, dstplg: ConstPtr, matrix: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix3I(rect.rawAddress.toString(), dstplg.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMetafileFromEmf(hemf: Henhmetafile, deleteemf: Bool, metafile: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromEmf(hemf.rawAddress.toString(), deleteemf, metafile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMetafileFromFile(file: Pcwstr, metafile: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromFile(file.rawAddress.toString(), metafile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMetafileFromStream(stream: MutPtr, metafile: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromStream(stream.rawAddress.toString(), metafile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMetafileFromWmf(hwmf: Hmetafile, deletewmf: Bool, wmfplaceablefileheader: ConstPtr, metafile: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromWmf(hwmf.rawAddress.toString(), deletewmf, wmfplaceablefileheader.rawAddress.toString(), metafile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateMetafileFromWmfFile(file: Pcwstr, wmfplaceablefileheader: ConstPtr, metafile: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromWmfFile(file.rawAddress.toString(), wmfplaceablefileheader.rawAddress.toString(), metafile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePath(brushmode: FillMode, path: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreatePath(brushmode, path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePath2(param0: ConstPtr, param1: ConstPtr, param2: Int, param3: FillMode, path: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreatePath2(param0.rawAddress.toString(), param1.rawAddress.toString(), param2, param3, path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePath2I(param0: ConstPtr, param1: ConstPtr, param2: Int, param3: FillMode, path: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreatePath2I(param0.rawAddress.toString(), param1.rawAddress.toString(), param2, param3, path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePathGradient(points: ConstPtr, count: Int, wrapmode: WrapMode, polygradient: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreatePathGradient(points.rawAddress.toString(), count, wrapmode, polygradient.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePathGradientFromPath(path: ConstPtr, polygradient: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreatePathGradientFromPath(path.rawAddress.toString(), polygradient.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePathGradientI(points: ConstPtr, count: Int, wrapmode: WrapMode, polygradient: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreatePathGradientI(points.rawAddress.toString(), count, wrapmode, polygradient.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePathIter(iterator: MutPtr, path: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreatePathIter(iterator.rawAddress.toString(), path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePen1(color: UInt, width: Float, unit: Unit, pen: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreatePen1(color.toInt(), width.toDouble(), unit, pen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreatePen2(brush: MutPtr, width: Float, unit: Unit, pen: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreatePen2(brush.rawAddress.toString(), width.toDouble(), unit, pen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateRegion(region: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateRegion(region.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateRegionHrgn(hrgn: Hrgn, region: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionHrgn(hrgn.rawAddress.toString(), region.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateRegionPath(path: MutPtr, region: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionPath(path.rawAddress.toString(), region.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateRegionRect(rect: ConstPtr, region: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionRect(rect.rawAddress.toString(), region.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateRegionRectI(rect: ConstPtr, region: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionRectI(rect.rawAddress.toString(), region.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateRegionRgnData(regiondata: ConstPtr, size: Int, region: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionRgnData(regiondata.rawAddress.toString(), size, region.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateSolidFill(color: UInt, brush: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateSolidFill(color.toInt(), brush.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateStreamOnFile(filename: Pcwstr, access: UInt, stream: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateStreamOnFile(filename.rawAddress.toString(), access.toInt(), stream.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateStringFormat(formatattributes: Int, language: UShort, format: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateStringFormat(formatattributes, language.toInt(), format.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateTexture(image: MutPtr, wrapmode: WrapMode, texture: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateTexture(image.rawAddress.toString(), wrapmode, texture.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateTexture2(image: MutPtr, wrapmode: WrapMode, x: Float, y: Float, width: Float, height: Float, texture: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateTexture2(image.rawAddress.toString(), wrapmode, x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), texture.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateTexture2I(image: MutPtr, wrapmode: WrapMode, x: Int, y: Int, width: Int, height: Int, texture: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateTexture2I(image.rawAddress.toString(), wrapmode, x, y, width, height, texture.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateTextureIA(image: MutPtr, imageattributes: ConstPtr, x: Float, y: Float, width: Float, height: Float, texture: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateTextureIA(image.rawAddress.toString(), imageattributes.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), texture.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipCreateTextureIAI(image: MutPtr, imageattributes: ConstPtr, x: Int, y: Int, width: Int, height: Int, texture: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipCreateTextureIAI(image.rawAddress.toString(), imageattributes.rawAddress.toString(), x, y, width, height, texture.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteBrush(brush: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDeleteBrush(brush.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteCachedBitmap(cachedbitmap: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDeleteCachedBitmap(cachedbitmap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteCustomLineCap(customcap: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDeleteCustomLineCap(customcap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteEffect(effect: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDeleteEffect(effect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteFont(font: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDeleteFont(font.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteFontFamily(fontfamily: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDeleteFontFamily(fontfamily.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteGraphics(graphics: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDeleteGraphics(graphics.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteMatrix(matrix: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDeleteMatrix(matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeletePath(path: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDeletePath(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeletePathIter(iterator: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDeletePathIter(iterator.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeletePen(pen: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDeletePen(pen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeletePrivateFontCollection(fontcollection: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDeletePrivateFontCollection(fontcollection.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteRegion(region: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDeleteRegion(region.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDeleteStringFormat(format: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDeleteStringFormat(format.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDisposeImage(image: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDisposeImage(image.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDisposeImageAttributes(imageattr: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDisposeImageAttributes(imageattr.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawArc(graphics: MutPtr, pen: MutPtr, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawArc(graphics.rawAddress.toString(), pen.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), startangle.toDouble(), sweepangle.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawArcI(graphics: MutPtr, pen: MutPtr, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawArcI(graphics.rawAddress.toString(), pen.rawAddress.toString(), x, y, width, height, startangle.toDouble(), sweepangle.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawBezier(graphics: MutPtr, pen: MutPtr, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawBezier(graphics.rawAddress.toString(), pen.rawAddress.toString(), x1.toDouble(), y1.toDouble(), x2.toDouble(), y2.toDouble(), x3.toDouble(), y3.toDouble(), x4.toDouble(), y4.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawBezierI(graphics: MutPtr, pen: MutPtr, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawBezierI(graphics.rawAddress.toString(), pen.rawAddress.toString(), x1, y1, x2, y2, x3, y3, x4, y4) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawBeziers(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawBeziers(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawBeziersI(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawBeziersI(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawCachedBitmap(graphics: MutPtr, cachedbitmap: MutPtr, x: Int, y: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawCachedBitmap(graphics.rawAddress.toString(), cachedbitmap.rawAddress.toString(), x, y) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawClosedCurve(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurve(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawClosedCurve2(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurve2(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawClosedCurve2I(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurve2I(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawClosedCurveI(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurveI(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawCurve(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawCurve2(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve2(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawCurve2I(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve2I(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawCurve3(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve3(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count, offset, numberofsegments, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawCurve3I(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve3I(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count, offset, numberofsegments, tension.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawCurveI(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawCurveI(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawDriverString(graphics: MutPtr, text: ConstPtr, length: Int, font: ConstPtr, brush: ConstPtr, positions: ConstPtr, flags: Int, matrix: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawDriverString(graphics.rawAddress.toString(), text.rawAddress.toString(), length, font.rawAddress.toString(), brush.rawAddress.toString(), positions.rawAddress.toString(), flags, matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawEllipse(graphics: MutPtr, pen: MutPtr, x: Float, y: Float, width: Float, height: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawEllipse(graphics.rawAddress.toString(), pen.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawEllipseI(graphics: MutPtr, pen: MutPtr, x: Int, y: Int, width: Int, height: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawEllipseI(graphics.rawAddress.toString(), pen.rawAddress.toString(), x, y, width, height) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImage(graphics: MutPtr, image: MutPtr, x: Float, y: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawImage(graphics.rawAddress.toString(), image.rawAddress.toString(), x.toDouble(), y.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImageFX(graphics: MutPtr, image: MutPtr, source: MutPtr, xform: MutPtr, effect: MutPtr, imageattributes: MutPtr, srcunit: Unit): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawImageFX(graphics.rawAddress.toString(), image.rawAddress.toString(), source.rawAddress.toString(), xform.rawAddress.toString(), effect.rawAddress.toString(), imageattributes.rawAddress.toString(), srcunit) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImageI(graphics: MutPtr, image: MutPtr, x: Int, y: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawImageI(graphics.rawAddress.toString(), image.rawAddress.toString(), x, y) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImagePointRect(graphics: MutPtr, image: MutPtr, x: Float, y: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointRect(graphics.rawAddress.toString(), image.rawAddress.toString(), x.toDouble(), y.toDouble(), srcx.toDouble(), srcy.toDouble(), srcwidth.toDouble(), srcheight.toDouble(), srcunit) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImagePointRectI(graphics: MutPtr, image: MutPtr, x: Int, y: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointRectI(graphics.rawAddress.toString(), image.rawAddress.toString(), x, y, srcx, srcy, srcwidth, srcheight, srcunit) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImagePoints(graphics: MutPtr, image: MutPtr, dstpoints: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePoints(graphics.rawAddress.toString(), image.rawAddress.toString(), dstpoints.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImagePointsI(graphics: MutPtr, image: MutPtr, dstpoints: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointsI(graphics.rawAddress.toString(), image.rawAddress.toString(), dstpoints.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImagePointsRect(graphics: MutPtr, image: MutPtr, points: ConstPtr, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: ConstPtr, callback: Long, callbackdata: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointsRect(graphics.rawAddress.toString(), image.rawAddress.toString(), points.rawAddress.toString(), count, srcx.toDouble(), srcy.toDouble(), srcwidth.toDouble(), srcheight.toDouble(), srcunit, imageattributes.rawAddress.toString(), callback.toString(), callbackdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImagePointsRectI(graphics: MutPtr, image: MutPtr, points: ConstPtr, count: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: ConstPtr, callback: Long, callbackdata: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointsRectI(graphics.rawAddress.toString(), image.rawAddress.toString(), points.rawAddress.toString(), count, srcx, srcy, srcwidth, srcheight, srcunit, imageattributes.rawAddress.toString(), callback.toString(), callbackdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImageRect(graphics: MutPtr, image: MutPtr, x: Float, y: Float, width: Float, height: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRect(graphics.rawAddress.toString(), image.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImageRectI(graphics: MutPtr, image: MutPtr, x: Int, y: Int, width: Int, height: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRectI(graphics.rawAddress.toString(), image.rawAddress.toString(), x, y, width, height) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImageRectRect(graphics: MutPtr, image: MutPtr, dstx: Float, dsty: Float, dstwidth: Float, dstheight: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: ConstPtr, callback: Long, callbackdata: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRectRect(graphics.rawAddress.toString(), image.rawAddress.toString(), dstx.toDouble(), dsty.toDouble(), dstwidth.toDouble(), dstheight.toDouble(), srcx.toDouble(), srcy.toDouble(), srcwidth.toDouble(), srcheight.toDouble(), srcunit, imageattributes.rawAddress.toString(), callback.toString(), callbackdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawImageRectRectI(graphics: MutPtr, image: MutPtr, dstx: Int, dsty: Int, dstwidth: Int, dstheight: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: ConstPtr, callback: Long, callbackdata: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRectRectI(graphics.rawAddress.toString(), image.rawAddress.toString(), dstx, dsty, dstwidth, dstheight, srcx, srcy, srcwidth, srcheight, srcunit, imageattributes.rawAddress.toString(), callback.toString(), callbackdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawLine(graphics: MutPtr, pen: MutPtr, x1: Float, y1: Float, x2: Float, y2: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawLine(graphics.rawAddress.toString(), pen.rawAddress.toString(), x1.toDouble(), y1.toDouble(), x2.toDouble(), y2.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawLineI(graphics: MutPtr, pen: MutPtr, x1: Int, y1: Int, x2: Int, y2: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawLineI(graphics.rawAddress.toString(), pen.rawAddress.toString(), x1, y1, x2, y2) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawLines(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawLines(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawLinesI(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawLinesI(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawPath(graphics: MutPtr, pen: MutPtr, path: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawPath(graphics.rawAddress.toString(), pen.rawAddress.toString(), path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawPie(graphics: MutPtr, pen: MutPtr, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawPie(graphics.rawAddress.toString(), pen.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), startangle.toDouble(), sweepangle.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawPieI(graphics: MutPtr, pen: MutPtr, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawPieI(graphics.rawAddress.toString(), pen.rawAddress.toString(), x, y, width, height, startangle.toDouble(), sweepangle.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawPolygon(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawPolygon(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawPolygonI(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawPolygonI(graphics.rawAddress.toString(), pen.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawRectangle(graphics: MutPtr, pen: MutPtr, x: Float, y: Float, width: Float, height: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawRectangle(graphics.rawAddress.toString(), pen.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawRectangleI(graphics: MutPtr, pen: MutPtr, x: Int, y: Int, width: Int, height: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawRectangleI(graphics.rawAddress.toString(), pen.rawAddress.toString(), x, y, width, height) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawRectangles(graphics: MutPtr, pen: MutPtr, rects: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawRectangles(graphics.rawAddress.toString(), pen.rawAddress.toString(), rects.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawRectanglesI(graphics: MutPtr, pen: MutPtr, rects: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawRectanglesI(graphics.rawAddress.toString(), pen.rawAddress.toString(), rects.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipDrawString(graphics: MutPtr, string: Pcwstr, length: Int, font: ConstPtr, layoutrect: ConstPtr, stringformat: ConstPtr, brush: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipDrawString(graphics.rawAddress.toString(), string.rawAddress.toString(), length, font.rawAddress.toString(), layoutrect.rawAddress.toString(), stringformat.rawAddress.toString(), brush.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEmfToWmfBits(hemf: Henhmetafile, cbdata16: UInt, pdata16: MutPtr, imapmode: Int, eflags: Int): UInt =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipEmfToWmfBits(hemf.rawAddress.toString(), cbdata16.toInt(), pdata16.rawAddress.toString(), imapmode, eflags) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEndContainer(graphics: MutPtr, state: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipEndContainer(graphics.rawAddress.toString(), state.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileDestPoint(graphics: MutPtr, metafile: ConstPtr, destpoint: ConstPtr, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPoint(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destpoint.rawAddress.toString(), callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileDestPointI(graphics: MutPtr, metafile: ConstPtr, destpoint: ConstPtr, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPointI(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destpoint.rawAddress.toString(), callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileDestPoints(graphics: MutPtr, metafile: ConstPtr, destpoints: ConstPtr, count: Int, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPoints(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destpoints.rawAddress.toString(), count, callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileDestPointsI(graphics: MutPtr, metafile: ConstPtr, destpoints: ConstPtr, count: Int, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPointsI(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destpoints.rawAddress.toString(), count, callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileDestRect(graphics: MutPtr, metafile: ConstPtr, destrect: ConstPtr, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestRect(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destrect.rawAddress.toString(), callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileDestRectI(graphics: MutPtr, metafile: ConstPtr, destrect: ConstPtr, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestRectI(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destrect.rawAddress.toString(), callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileSrcRectDestPoint(graphics: MutPtr, metafile: ConstPtr, destpoint: ConstPtr, srcrect: ConstPtr, srcunit: Unit, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPoint(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destpoint.rawAddress.toString(), srcrect.rawAddress.toString(), srcunit, callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileSrcRectDestPointI(graphics: MutPtr, metafile: ConstPtr, destpoint: ConstPtr, srcrect: ConstPtr, srcunit: Unit, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPointI(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destpoint.rawAddress.toString(), srcrect.rawAddress.toString(), srcunit, callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileSrcRectDestPoints(graphics: MutPtr, metafile: ConstPtr, destpoints: ConstPtr, count: Int, srcrect: ConstPtr, srcunit: Unit, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPoints(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destpoints.rawAddress.toString(), count, srcrect.rawAddress.toString(), srcunit, callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileSrcRectDestPointsI(graphics: MutPtr, metafile: ConstPtr, destpoints: ConstPtr, count: Int, srcrect: ConstPtr, srcunit: Unit, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPointsI(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destpoints.rawAddress.toString(), count, srcrect.rawAddress.toString(), srcunit, callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileSrcRectDestRect(graphics: MutPtr, metafile: ConstPtr, destrect: ConstPtr, srcrect: ConstPtr, srcunit: Unit, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestRect(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destrect.rawAddress.toString(), srcrect.rawAddress.toString(), srcunit, callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipEnumerateMetafileSrcRectDestRectI(graphics: MutPtr, metafile: ConstPtr, destrect: ConstPtr, srcrect: ConstPtr, srcunit: Unit, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestRectI(graphics.rawAddress.toString(), metafile.rawAddress.toString(), destrect.rawAddress.toString(), srcrect.rawAddress.toString(), srcunit, callback.toString(), callbackdata.rawAddress.toString(), imageattributes.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillClosedCurve(graphics: MutPtr, brush: MutPtr, points: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurve(graphics.rawAddress.toString(), brush.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillClosedCurve2(graphics: MutPtr, brush: MutPtr, points: ConstPtr, count: Int, tension: Float, fillmode: FillMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurve2(graphics.rawAddress.toString(), brush.rawAddress.toString(), points.rawAddress.toString(), count, tension.toDouble(), fillmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillClosedCurve2I(graphics: MutPtr, brush: MutPtr, points: ConstPtr, count: Int, tension: Float, fillmode: FillMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurve2I(graphics.rawAddress.toString(), brush.rawAddress.toString(), points.rawAddress.toString(), count, tension.toDouble(), fillmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillClosedCurveI(graphics: MutPtr, brush: MutPtr, points: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurveI(graphics.rawAddress.toString(), brush.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillEllipse(graphics: MutPtr, brush: MutPtr, x: Float, y: Float, width: Float, height: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillEllipse(graphics.rawAddress.toString(), brush.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillEllipseI(graphics: MutPtr, brush: MutPtr, x: Int, y: Int, width: Int, height: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillEllipseI(graphics.rawAddress.toString(), brush.rawAddress.toString(), x, y, width, height) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillPath(graphics: MutPtr, brush: MutPtr, path: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillPath(graphics.rawAddress.toString(), brush.rawAddress.toString(), path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillPie(graphics: MutPtr, brush: MutPtr, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillPie(graphics.rawAddress.toString(), brush.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), startangle.toDouble(), sweepangle.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillPieI(graphics: MutPtr, brush: MutPtr, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillPieI(graphics.rawAddress.toString(), brush.rawAddress.toString(), x, y, width, height, startangle.toDouble(), sweepangle.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillPolygon(graphics: MutPtr, brush: MutPtr, points: ConstPtr, count: Int, fillmode: FillMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillPolygon(graphics.rawAddress.toString(), brush.rawAddress.toString(), points.rawAddress.toString(), count, fillmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillPolygon2(graphics: MutPtr, brush: MutPtr, points: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillPolygon2(graphics.rawAddress.toString(), brush.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillPolygon2I(graphics: MutPtr, brush: MutPtr, points: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillPolygon2I(graphics.rawAddress.toString(), brush.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillPolygonI(graphics: MutPtr, brush: MutPtr, points: ConstPtr, count: Int, fillmode: FillMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillPolygonI(graphics.rawAddress.toString(), brush.rawAddress.toString(), points.rawAddress.toString(), count, fillmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillRectangle(graphics: MutPtr, brush: MutPtr, x: Float, y: Float, width: Float, height: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillRectangle(graphics.rawAddress.toString(), brush.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillRectangleI(graphics: MutPtr, brush: MutPtr, x: Int, y: Int, width: Int, height: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillRectangleI(graphics.rawAddress.toString(), brush.rawAddress.toString(), x, y, width, height) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillRectangles(graphics: MutPtr, brush: MutPtr, rects: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillRectangles(graphics.rawAddress.toString(), brush.rawAddress.toString(), rects.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillRectanglesI(graphics: MutPtr, brush: MutPtr, rects: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillRectanglesI(graphics.rawAddress.toString(), brush.rawAddress.toString(), rects.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFillRegion(graphics: MutPtr, brush: MutPtr, region: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFillRegion(graphics.rawAddress.toString(), brush.rawAddress.toString(), region.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFindFirstImageItem(image: MutPtr, item: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFindFirstImageItem(image.rawAddress.toString(), item.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFindNextImageItem(image: MutPtr, item: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFindNextImageItem(image.rawAddress.toString(), item.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFlattenPath(path: MutPtr, matrix: MutPtr, flatness: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFlattenPath(path.rawAddress.toString(), matrix.rawAddress.toString(), flatness.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFlush(graphics: MutPtr, intention: FlushIntention): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFlush(graphics.rawAddress.toString(), intention) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipFree(ptr: MutPtr) {
    if (windowsWin32GraphicsGdiplusNapiAddon != null) {
        windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipFree(ptr.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun gdipGetAdjustableArrowCapFillState(cap: MutPtr, fillstate: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapFillState(cap.rawAddress.toString(), fillstate.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetAdjustableArrowCapHeight(cap: MutPtr, height: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapHeight(cap.rawAddress.toString(), height.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetAdjustableArrowCapMiddleInset(cap: MutPtr, middleinset: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapMiddleInset(cap.rawAddress.toString(), middleinset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetAdjustableArrowCapWidth(cap: MutPtr, width: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapWidth(cap.rawAddress.toString(), width.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetAllPropertyItems(image: MutPtr, totalbuffersize: UInt, numproperties: UInt, allitems: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetAllPropertyItems(image.rawAddress.toString(), totalbuffersize.toInt(), numproperties.toInt(), allitems.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetBrushType(brush: MutPtr, type: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetBrushType(brush.rawAddress.toString(), type.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCellAscent(family: ConstPtr, style: Int, cellascent: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetCellAscent(family.rawAddress.toString(), style, cellascent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCellDescent(family: ConstPtr, style: Int, celldescent: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetCellDescent(family.rawAddress.toString(), style, celldescent.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetClip(graphics: MutPtr, region: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetClip(graphics.rawAddress.toString(), region.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetClipBounds(graphics: MutPtr, rect: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetClipBounds(graphics.rawAddress.toString(), rect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetClipBoundsI(graphics: MutPtr, rect: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetClipBoundsI(graphics.rawAddress.toString(), rect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCompositingMode(graphics: MutPtr, compositingmode: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetCompositingMode(graphics.rawAddress.toString(), compositingmode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCompositingQuality(graphics: MutPtr, compositingquality: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetCompositingQuality(graphics.rawAddress.toString(), compositingquality.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCustomLineCapBaseCap(customcap: MutPtr, basecap: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapBaseCap(customcap.rawAddress.toString(), basecap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCustomLineCapBaseInset(customcap: MutPtr, inset: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapBaseInset(customcap.rawAddress.toString(), inset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCustomLineCapStrokeCaps(customcap: MutPtr, startcap: MutPtr, endcap: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapStrokeCaps(customcap.rawAddress.toString(), startcap.rawAddress.toString(), endcap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCustomLineCapStrokeJoin(customcap: MutPtr, linejoin: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapStrokeJoin(customcap.rawAddress.toString(), linejoin.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCustomLineCapType(customcap: MutPtr, captype: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapType(customcap.rawAddress.toString(), captype.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetCustomLineCapWidthScale(customcap: MutPtr, widthscale: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapWidthScale(customcap.rawAddress.toString(), widthscale.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetDC(graphics: MutPtr, hdc: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetDC(graphics.rawAddress.toString(), hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetDpiX(graphics: MutPtr, dpi: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetDpiX(graphics.rawAddress.toString(), dpi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetDpiY(graphics: MutPtr, dpi: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetDpiY(graphics.rawAddress.toString(), dpi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetEffectParameterSize(effect: MutPtr, size: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetEffectParameterSize(effect.rawAddress.toString(), size.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetEffectParameters(effect: MutPtr, size: MutPtr, params: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetEffectParameters(effect.rawAddress.toString(), size.rawAddress.toString(), params.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetEmHeight(family: ConstPtr, style: Int, emheight: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetEmHeight(family.rawAddress.toString(), style, emheight.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetEncoderParameterList(image: MutPtr, clsidencoder: ConstPtr, size: UInt, buffer: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetEncoderParameterList(image.rawAddress.toString(), clsidencoder.rawAddress.toString(), size.toInt(), buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetEncoderParameterListSize(image: MutPtr, clsidencoder: ConstPtr, size: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetEncoderParameterListSize(image.rawAddress.toString(), clsidencoder.rawAddress.toString(), size.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFamily(font: MutPtr, family: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetFamily(font.rawAddress.toString(), family.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFamilyName(family: ConstPtr, name: Pwstr, language: UShort): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetFamilyName(family.rawAddress.toString(), name.rawAddress.toString(), language.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFontCollectionFamilyCount(fontcollection: MutPtr, numfound: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetFontCollectionFamilyCount(fontcollection.rawAddress.toString(), numfound.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFontCollectionFamilyList(fontcollection: ConstPtr, numsought: Int, gpfamilies: MutPtr, numfound: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetFontCollectionFamilyList(fontcollection.rawAddress.toString(), numsought, gpfamilies.rawAddress.toString(), numfound.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFontHeight(font: ConstPtr, graphics: ConstPtr, height: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetFontHeight(font.rawAddress.toString(), graphics.rawAddress.toString(), height.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFontHeightGivenDPI(font: ConstPtr, dpi: Float, height: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetFontHeightGivenDPI(font.rawAddress.toString(), dpi.toDouble(), height.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFontSize(font: MutPtr, size: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetFontSize(font.rawAddress.toString(), size.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFontStyle(font: MutPtr, style: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetFontStyle(font.rawAddress.toString(), style.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetFontUnit(font: MutPtr, unit: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetFontUnit(font.rawAddress.toString(), unit.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetGenericFontFamilyMonospace(nativefamily: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetGenericFontFamilyMonospace(nativefamily.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetGenericFontFamilySansSerif(nativefamily: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetGenericFontFamilySansSerif(nativefamily.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetGenericFontFamilySerif(nativefamily: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetGenericFontFamilySerif(nativefamily.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetHatchBackgroundColor(brush: MutPtr, backcol: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetHatchBackgroundColor(brush.rawAddress.toString(), backcol.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetHatchForegroundColor(brush: MutPtr, forecol: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetHatchForegroundColor(brush.rawAddress.toString(), forecol.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetHatchStyle(brush: MutPtr, hatchstyle: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetHatchStyle(brush.rawAddress.toString(), hatchstyle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetHemfFromMetafile(metafile: MutPtr, hemf: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetHemfFromMetafile(metafile.rawAddress.toString(), hemf.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageAttributesAdjustedPalette(imageattr: MutPtr, colorpalette: MutPtr, coloradjusttype: ColorAdjustType): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageAttributesAdjustedPalette(imageattr.rawAddress.toString(), colorpalette.rawAddress.toString(), coloradjusttype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageBounds(image: MutPtr, srcrect: MutPtr, srcunit: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageBounds(image.rawAddress.toString(), srcrect.rawAddress.toString(), srcunit.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageDecoders(numdecoders: UInt, size: UInt, decoders: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageDecoders(numdecoders.toInt(), size.toInt(), decoders.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageDecodersSize(numdecoders: MutPtr, size: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageDecodersSize(numdecoders.rawAddress.toString(), size.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageDimension(image: MutPtr, width: MutPtr, height: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageDimension(image.rawAddress.toString(), width.rawAddress.toString(), height.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageEncoders(numencoders: UInt, size: UInt, encoders: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageEncoders(numencoders.toInt(), size.toInt(), encoders.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageEncodersSize(numencoders: MutPtr, size: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageEncodersSize(numencoders.rawAddress.toString(), size.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageFlags(image: MutPtr, flags: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageFlags(image.rawAddress.toString(), flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageGraphicsContext(image: MutPtr, graphics: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageGraphicsContext(image.rawAddress.toString(), graphics.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageHeight(image: MutPtr, height: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageHeight(image.rawAddress.toString(), height.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageHorizontalResolution(image: MutPtr, resolution: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageHorizontalResolution(image.rawAddress.toString(), resolution.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageItemData(image: MutPtr, item: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageItemData(image.rawAddress.toString(), item.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImagePalette(image: MutPtr, palette: MutPtr, size: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImagePalette(image.rawAddress.toString(), palette.rawAddress.toString(), size) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImagePaletteSize(image: MutPtr, size: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImagePaletteSize(image.rawAddress.toString(), size.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImagePixelFormat(image: MutPtr, format: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImagePixelFormat(image.rawAddress.toString(), format.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageRawFormat(image: MutPtr, format: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageRawFormat(image.rawAddress.toString(), format.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageThumbnail(image: MutPtr, thumbwidth: UInt, thumbheight: UInt, thumbimage: MutPtr, callback: Long, callbackdata: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageThumbnail(image.rawAddress.toString(), thumbwidth.toInt(), thumbheight.toInt(), thumbimage.rawAddress.toString(), callback.toString(), callbackdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageType(image: MutPtr, type: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageType(image.rawAddress.toString(), type.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageVerticalResolution(image: MutPtr, resolution: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageVerticalResolution(image.rawAddress.toString(), resolution.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetImageWidth(image: MutPtr, width: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetImageWidth(image.rawAddress.toString(), width.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetInterpolationMode(graphics: MutPtr, interpolationmode: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetInterpolationMode(graphics.rawAddress.toString(), interpolationmode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineBlend(brush: MutPtr, blend: MutPtr, positions: MutPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetLineBlend(brush.rawAddress.toString(), blend.rawAddress.toString(), positions.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineBlendCount(brush: MutPtr, count: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetLineBlendCount(brush.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineColors(brush: MutPtr, colors: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetLineColors(brush.rawAddress.toString(), colors.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineGammaCorrection(brush: MutPtr, usegammacorrection: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetLineGammaCorrection(brush.rawAddress.toString(), usegammacorrection.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLinePresetBlend(brush: MutPtr, blend: MutPtr, positions: MutPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetLinePresetBlend(brush.rawAddress.toString(), blend.rawAddress.toString(), positions.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLinePresetBlendCount(brush: MutPtr, count: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetLinePresetBlendCount(brush.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineRect(brush: MutPtr, rect: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetLineRect(brush.rawAddress.toString(), rect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineRectI(brush: MutPtr, rect: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetLineRectI(brush.rawAddress.toString(), rect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineSpacing(family: ConstPtr, style: Int, linespacing: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetLineSpacing(family.rawAddress.toString(), style, linespacing.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineTransform(brush: MutPtr, matrix: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetLineTransform(brush.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLineWrapMode(brush: MutPtr, wrapmode: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetLineWrapMode(brush.rawAddress.toString(), wrapmode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLogFontA(font: MutPtr, graphics: MutPtr, logfonta: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetLogFontA(font.rawAddress.toString(), graphics.rawAddress.toString(), logfonta.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetLogFontW(font: MutPtr, graphics: MutPtr, logfontw: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetLogFontW(font.rawAddress.toString(), graphics.rawAddress.toString(), logfontw.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetMatrixElements(matrix: ConstPtr, matrixout: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetMatrixElements(matrix.rawAddress.toString(), matrixout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetMetafileDownLevelRasterizationLimit(metafile: ConstPtr, metafilerasterizationlimitdpi: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileDownLevelRasterizationLimit(metafile.rawAddress.toString(), metafilerasterizationlimitdpi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetMetafileHeaderFromEmf(hemf: Henhmetafile, header: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromEmf(hemf.rawAddress.toString(), header.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetMetafileHeaderFromFile(filename: Pcwstr, header: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromFile(filename.rawAddress.toString(), header.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetMetafileHeaderFromMetafile(metafile: MutPtr, header: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromMetafile(metafile.rawAddress.toString(), header.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetMetafileHeaderFromStream(stream: MutPtr, header: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromStream(stream.rawAddress.toString(), header.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetMetafileHeaderFromWmf(hwmf: Hmetafile, wmfplaceablefileheader: ConstPtr, header: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromWmf(hwmf.rawAddress.toString(), wmfplaceablefileheader.rawAddress.toString(), header.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetNearestColor(graphics: MutPtr, argb: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetNearestColor(graphics.rawAddress.toString(), argb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPageScale(graphics: MutPtr, scale: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPageScale(graphics.rawAddress.toString(), scale.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPageUnit(graphics: MutPtr, unit: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPageUnit(graphics.rawAddress.toString(), unit.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathData(path: MutPtr, pathdata: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathData(path.rawAddress.toString(), pathdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathFillMode(path: MutPtr, fillmode: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathFillMode(path.rawAddress.toString(), fillmode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientBlend(brush: MutPtr, blend: MutPtr, positions: MutPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientBlend(brush.rawAddress.toString(), blend.rawAddress.toString(), positions.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientBlendCount(brush: MutPtr, count: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientBlendCount(brush.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientCenterColor(brush: MutPtr, colors: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientCenterColor(brush.rawAddress.toString(), colors.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientCenterPoint(brush: MutPtr, points: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientCenterPoint(brush.rawAddress.toString(), points.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientCenterPointI(brush: MutPtr, points: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientCenterPointI(brush.rawAddress.toString(), points.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientFocusScales(brush: MutPtr, xscale: MutPtr, yscale: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientFocusScales(brush.rawAddress.toString(), xscale.rawAddress.toString(), yscale.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientGammaCorrection(brush: MutPtr, usegammacorrection: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientGammaCorrection(brush.rawAddress.toString(), usegammacorrection.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientPath(brush: MutPtr, path: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPath(brush.rawAddress.toString(), path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientPointCount(brush: MutPtr, count: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPointCount(brush.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientPresetBlend(brush: MutPtr, blend: MutPtr, positions: MutPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPresetBlend(brush.rawAddress.toString(), blend.rawAddress.toString(), positions.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientPresetBlendCount(brush: MutPtr, count: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPresetBlendCount(brush.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientRect(brush: MutPtr, rect: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientRect(brush.rawAddress.toString(), rect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientRectI(brush: MutPtr, rect: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientRectI(brush.rawAddress.toString(), rect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientSurroundColorCount(brush: MutPtr, count: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientSurroundColorCount(brush.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientSurroundColorsWithCount(brush: ConstPtr, color: MutPtr, count: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientSurroundColorsWithCount(brush.rawAddress.toString(), color.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientTransform(brush: MutPtr, matrix: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientTransform(brush.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathGradientWrapMode(brush: MutPtr, wrapmode: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientWrapMode(brush.rawAddress.toString(), wrapmode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathLastPoint(path: MutPtr, lastpoint: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathLastPoint(path.rawAddress.toString(), lastpoint.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathPoints(param0: MutPtr, points: MutPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathPoints(param0.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathPointsI(param0: MutPtr, points: MutPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathPointsI(param0.rawAddress.toString(), points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathTypes(path: ConstPtr, types: MutPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathTypes(path.rawAddress.toString(), types.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathWorldBounds(path: MutPtr, bounds: MutPtr, matrix: ConstPtr, pen: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathWorldBounds(path.rawAddress.toString(), bounds.rawAddress.toString(), matrix.rawAddress.toString(), pen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPathWorldBoundsI(path: MutPtr, bounds: MutPtr, matrix: ConstPtr, pen: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPathWorldBoundsI(path.rawAddress.toString(), bounds.rawAddress.toString(), matrix.rawAddress.toString(), pen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenBrushFill(pen: MutPtr, brush: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenBrushFill(pen.rawAddress.toString(), brush.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenColor(pen: MutPtr, argb: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenColor(pen.rawAddress.toString(), argb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenCompoundArray(pen: MutPtr, dash: MutPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenCompoundArray(pen.rawAddress.toString(), dash.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenCompoundCount(pen: MutPtr, count: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenCompoundCount(pen.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenCustomEndCap(pen: MutPtr, customcap: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenCustomEndCap(pen.rawAddress.toString(), customcap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenCustomStartCap(pen: MutPtr, customcap: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenCustomStartCap(pen.rawAddress.toString(), customcap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenDashArray(pen: MutPtr, dash: MutPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashArray(pen.rawAddress.toString(), dash.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenDashCap197819(pen: MutPtr, dashcap: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashCap197819(pen.rawAddress.toString(), dashcap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenDashCount(pen: MutPtr, count: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashCount(pen.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenDashOffset(pen: MutPtr, offset: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashOffset(pen.rawAddress.toString(), offset.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenDashStyle(pen: MutPtr, dashstyle: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashStyle(pen.rawAddress.toString(), dashstyle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenEndCap(pen: MutPtr, endcap: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenEndCap(pen.rawAddress.toString(), endcap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenFillType(pen: MutPtr, type: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenFillType(pen.rawAddress.toString(), type.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenLineJoin(pen: MutPtr, linejoin: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenLineJoin(pen.rawAddress.toString(), linejoin.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenMiterLimit(pen: MutPtr, miterlimit: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenMiterLimit(pen.rawAddress.toString(), miterlimit.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenMode(pen: MutPtr, penmode: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenMode(pen.rawAddress.toString(), penmode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenStartCap(pen: MutPtr, startcap: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenStartCap(pen.rawAddress.toString(), startcap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenTransform(pen: MutPtr, matrix: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenTransform(pen.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenUnit(pen: MutPtr, unit: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenUnit(pen.rawAddress.toString(), unit.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPenWidth(pen: MutPtr, width: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPenWidth(pen.rawAddress.toString(), width.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPixelOffsetMode(graphics: MutPtr, pixeloffsetmode: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPixelOffsetMode(graphics.rawAddress.toString(), pixeloffsetmode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPointCount(path: MutPtr, count: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPointCount(path.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPropertyCount(image: MutPtr, numofproperty: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyCount(image.rawAddress.toString(), numofproperty.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPropertyIdList(image: MutPtr, numofproperty: UInt, list: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyIdList(image.rawAddress.toString(), numofproperty.toInt(), list.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPropertyItem(image: MutPtr, propid: UInt, propsize: UInt, buffer: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyItem(image.rawAddress.toString(), propid.toInt(), propsize.toInt(), buffer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPropertyItemSize(image: MutPtr, propid: UInt, size: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyItemSize(image.rawAddress.toString(), propid.toInt(), size.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetPropertySize(image: MutPtr, totalbuffersize: MutPtr, numproperties: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetPropertySize(image.rawAddress.toString(), totalbuffersize.rawAddress.toString(), numproperties.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRegionBounds(region: MutPtr, graphics: MutPtr, rect: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetRegionBounds(region.rawAddress.toString(), graphics.rawAddress.toString(), rect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRegionBoundsI(region: MutPtr, graphics: MutPtr, rect: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetRegionBoundsI(region.rawAddress.toString(), graphics.rawAddress.toString(), rect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRegionData(region: MutPtr, buffer: MutPtr, buffersize: UInt, sizefilled: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetRegionData(region.rawAddress.toString(), buffer.rawAddress.toString(), buffersize.toInt(), sizefilled.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRegionDataSize(region: MutPtr, buffersize: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetRegionDataSize(region.rawAddress.toString(), buffersize.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRegionHRgn(region: MutPtr, graphics: MutPtr, hrgn: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetRegionHRgn(region.rawAddress.toString(), graphics.rawAddress.toString(), hrgn.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRegionScans(region: MutPtr, rects: MutPtr, count: MutPtr, matrix: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetRegionScans(region.rawAddress.toString(), rects.rawAddress.toString(), count.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRegionScansCount(region: MutPtr, count: MutPtr, matrix: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetRegionScansCount(region.rawAddress.toString(), count.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRegionScansI(region: MutPtr, rects: MutPtr, count: MutPtr, matrix: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetRegionScansI(region.rawAddress.toString(), rects.rawAddress.toString(), count.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetRenderingOrigin(graphics: MutPtr, x: MutPtr, y: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetRenderingOrigin(graphics.rawAddress.toString(), x.rawAddress.toString(), y.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetSmoothingMode(graphics: MutPtr, smoothingmode: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetSmoothingMode(graphics.rawAddress.toString(), smoothingmode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetSolidFillColor(brush: MutPtr, color: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetSolidFillColor(brush.rawAddress.toString(), color.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatAlign(format: ConstPtr, align: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatAlign(format.rawAddress.toString(), align.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatDigitSubstitution(format: ConstPtr, language: MutPtr, substitute: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatDigitSubstitution(format.rawAddress.toString(), language.rawAddress.toString(), substitute.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatFlags(format: ConstPtr, flags: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatFlags(format.rawAddress.toString(), flags.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatHotkeyPrefix(format: ConstPtr, hotkeyprefix: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatHotkeyPrefix(format.rawAddress.toString(), hotkeyprefix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatLineAlign(format: ConstPtr, align: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatLineAlign(format.rawAddress.toString(), align.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatMeasurableCharacterRangeCount(format: ConstPtr, count: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatMeasurableCharacterRangeCount(format.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatTabStopCount(format: ConstPtr, count: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatTabStopCount(format.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatTabStops(format: ConstPtr, count: Int, firsttaboffset: MutPtr, tabstops: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatTabStops(format.rawAddress.toString(), count, firsttaboffset.rawAddress.toString(), tabstops.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetStringFormatTrimming(format: ConstPtr, trimming: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatTrimming(format.rawAddress.toString(), trimming.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetTextContrast(graphics: MutPtr, contrast: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetTextContrast(graphics.rawAddress.toString(), contrast.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetTextRenderingHint(graphics: MutPtr, mode: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetTextRenderingHint(graphics.rawAddress.toString(), mode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetTextureImage(brush: MutPtr, image: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetTextureImage(brush.rawAddress.toString(), image.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetTextureTransform(brush: MutPtr, matrix: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetTextureTransform(brush.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetTextureWrapMode(brush: MutPtr, wrapmode: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetTextureWrapMode(brush.rawAddress.toString(), wrapmode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetVisibleClipBounds(graphics: MutPtr, rect: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetVisibleClipBounds(graphics.rawAddress.toString(), rect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetVisibleClipBoundsI(graphics: MutPtr, rect: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetVisibleClipBoundsI(graphics.rawAddress.toString(), rect.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGetWorldTransform(graphics: MutPtr, matrix: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGetWorldTransform(graphics.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGraphicsClear(graphics: MutPtr, color: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGraphicsClear(graphics.rawAddress.toString(), color.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipGraphicsSetAbort(pgraphics: MutPtr, piabort: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipGraphicsSetAbort(pgraphics.rawAddress.toString(), piabort.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipImageForceValidation(image: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipImageForceValidation(image.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipImageGetFrameCount(image: MutPtr, dimensionid: ConstPtr, count: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipImageGetFrameCount(image.rawAddress.toString(), dimensionid.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipImageGetFrameDimensionsCount(image: MutPtr, count: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipImageGetFrameDimensionsCount(image.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipImageGetFrameDimensionsList(image: MutPtr, dimensionids: MutPtr, count: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipImageGetFrameDimensionsList(image.rawAddress.toString(), dimensionids.rawAddress.toString(), count.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipImageRotateFlip(image: MutPtr, rftype: RotateFlipType): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipImageRotateFlip(image.rawAddress.toString(), rftype) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipImageSelectActiveFrame(image: MutPtr, dimensionid: ConstPtr, frameindex: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipImageSelectActiveFrame(image.rawAddress.toString(), dimensionid.rawAddress.toString(), frameindex.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipImageSetAbort(pimage: MutPtr, piabort: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipImageSetAbort(pimage.rawAddress.toString(), piabort.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipInitializePalette(palette: MutPtr, palettetype: PaletteType, optimalcolors: Int, usetransparentcolor: Bool, bitmap: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipInitializePalette(palette.rawAddress.toString(), palettetype, optimalcolors, usetransparentcolor, bitmap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipInvertMatrix(matrix: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipInvertMatrix(matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsClipEmpty(graphics: MutPtr, result: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsClipEmpty(graphics.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsEmptyRegion(region: MutPtr, graphics: MutPtr, result: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsEmptyRegion(region.rawAddress.toString(), graphics.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsEqualRegion(region: MutPtr, region2: MutPtr, graphics: MutPtr, result: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsEqualRegion(region.rawAddress.toString(), region2.rawAddress.toString(), graphics.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsInfiniteRegion(region: MutPtr, graphics: MutPtr, result: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsInfiniteRegion(region.rawAddress.toString(), graphics.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsMatrixEqual(matrix: ConstPtr, matrix2: ConstPtr, result: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsMatrixEqual(matrix.rawAddress.toString(), matrix2.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsMatrixIdentity(matrix: ConstPtr, result: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsMatrixIdentity(matrix.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsMatrixInvertible(matrix: ConstPtr, result: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsMatrixInvertible(matrix.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsOutlineVisiblePathPoint(path: MutPtr, x: Float, y: Float, pen: MutPtr, graphics: MutPtr, result: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsOutlineVisiblePathPoint(path.rawAddress.toString(), x.toDouble(), y.toDouble(), pen.rawAddress.toString(), graphics.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsOutlineVisiblePathPointI(path: MutPtr, x: Int, y: Int, pen: MutPtr, graphics: MutPtr, result: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsOutlineVisiblePathPointI(path.rawAddress.toString(), x, y, pen.rawAddress.toString(), graphics.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsStyleAvailable(family: ConstPtr, style: Int, isstyleavailable: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsStyleAvailable(family.rawAddress.toString(), style, isstyleavailable.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisibleClipEmpty(graphics: MutPtr, result: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleClipEmpty(graphics.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisiblePathPoint(path: MutPtr, x: Float, y: Float, graphics: MutPtr, result: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePathPoint(path.rawAddress.toString(), x.toDouble(), y.toDouble(), graphics.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisiblePathPointI(path: MutPtr, x: Int, y: Int, graphics: MutPtr, result: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePathPointI(path.rawAddress.toString(), x, y, graphics.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisiblePoint(graphics: MutPtr, x: Float, y: Float, result: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePoint(graphics.rawAddress.toString(), x.toDouble(), y.toDouble(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisiblePointI(graphics: MutPtr, x: Int, y: Int, result: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePointI(graphics.rawAddress.toString(), x, y, result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisibleRect(graphics: MutPtr, x: Float, y: Float, width: Float, height: Float, result: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRect(graphics.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisibleRectI(graphics: MutPtr, x: Int, y: Int, width: Int, height: Int, result: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRectI(graphics.rawAddress.toString(), x, y, width, height, result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisibleRegionPoint(region: MutPtr, x: Float, y: Float, graphics: MutPtr, result: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionPoint(region.rawAddress.toString(), x.toDouble(), y.toDouble(), graphics.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisibleRegionPointI(region: MutPtr, x: Int, y: Int, graphics: MutPtr, result: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionPointI(region.rawAddress.toString(), x, y, graphics.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisibleRegionRect(region: MutPtr, x: Float, y: Float, width: Float, height: Float, graphics: MutPtr, result: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionRect(region.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), graphics.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipIsVisibleRegionRectI(region: MutPtr, x: Int, y: Int, width: Int, height: Int, graphics: MutPtr, result: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionRectI(region.rawAddress.toString(), x, y, width, height, graphics.rawAddress.toString(), result.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipLoadImageFromFile(filename: Pcwstr, image: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromFile(filename.rawAddress.toString(), image.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipLoadImageFromFileICM(filename: Pcwstr, image: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromFileICM(filename.rawAddress.toString(), image.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipLoadImageFromStream(stream: MutPtr, image: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromStream(stream.rawAddress.toString(), image.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipLoadImageFromStreamICM(stream: MutPtr, image: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromStreamICM(stream.rawAddress.toString(), image.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMeasureCharacterRanges(graphics: MutPtr, string: Pcwstr, length: Int, font: ConstPtr, layoutrect: ConstPtr, stringformat: ConstPtr, regioncount: Int, regions: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipMeasureCharacterRanges(graphics.rawAddress.toString(), string.rawAddress.toString(), length, font.rawAddress.toString(), layoutrect.rawAddress.toString(), stringformat.rawAddress.toString(), regioncount, regions.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMeasureDriverString(graphics: MutPtr, text: ConstPtr, length: Int, font: ConstPtr, positions: ConstPtr, flags: Int, matrix: ConstPtr, boundingbox: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipMeasureDriverString(graphics.rawAddress.toString(), text.rawAddress.toString(), length, font.rawAddress.toString(), positions.rawAddress.toString(), flags, matrix.rawAddress.toString(), boundingbox.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMeasureString(graphics: MutPtr, string: Pcwstr, length: Int, font: ConstPtr, layoutrect: ConstPtr, stringformat: ConstPtr, boundingbox: MutPtr, codepointsfitted: MutPtr, linesfilled: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipMeasureString(graphics.rawAddress.toString(), string.rawAddress.toString(), length, font.rawAddress.toString(), layoutrect.rawAddress.toString(), stringformat.rawAddress.toString(), boundingbox.rawAddress.toString(), codepointsfitted.rawAddress.toString(), linesfilled.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMultiplyLineTransform(brush: MutPtr, matrix: ConstPtr, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipMultiplyLineTransform(brush.rawAddress.toString(), matrix.rawAddress.toString(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMultiplyMatrix(matrix: MutPtr, matrix2: MutPtr, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipMultiplyMatrix(matrix.rawAddress.toString(), matrix2.rawAddress.toString(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMultiplyPathGradientTransform(brush: MutPtr, matrix: ConstPtr, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipMultiplyPathGradientTransform(brush.rawAddress.toString(), matrix.rawAddress.toString(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMultiplyPenTransform(pen: MutPtr, matrix: ConstPtr, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipMultiplyPenTransform(pen.rawAddress.toString(), matrix.rawAddress.toString(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMultiplyTextureTransform(brush: MutPtr, matrix: ConstPtr, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipMultiplyTextureTransform(brush.rawAddress.toString(), matrix.rawAddress.toString(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipMultiplyWorldTransform(graphics: MutPtr, matrix: ConstPtr, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipMultiplyWorldTransform(graphics.rawAddress.toString(), matrix.rawAddress.toString(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipNewInstalledFontCollection(fontcollection: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipNewInstalledFontCollection(fontcollection.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipNewPrivateFontCollection(fontcollection: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipNewPrivateFontCollection(fontcollection.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterCopyData(iterator: MutPtr, resultcount: MutPtr, points: MutPtr, types: MutPtr, startindex: Int, endindex: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipPathIterCopyData(iterator.rawAddress.toString(), resultcount.rawAddress.toString(), points.rawAddress.toString(), types.rawAddress.toString(), startindex, endindex) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterEnumerate(iterator: MutPtr, resultcount: MutPtr, points: MutPtr, types: MutPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipPathIterEnumerate(iterator.rawAddress.toString(), resultcount.rawAddress.toString(), points.rawAddress.toString(), types.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterGetCount(iterator: MutPtr, count: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipPathIterGetCount(iterator.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterGetSubpathCount(iterator: MutPtr, count: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipPathIterGetSubpathCount(iterator.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterHasCurve(iterator: MutPtr, hascurve: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipPathIterHasCurve(iterator.rawAddress.toString(), hascurve.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterIsValid(iterator: MutPtr, valid: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipPathIterIsValid(iterator.rawAddress.toString(), valid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterNextMarker(iterator: MutPtr, resultcount: MutPtr, startindex: MutPtr, endindex: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextMarker(iterator.rawAddress.toString(), resultcount.rawAddress.toString(), startindex.rawAddress.toString(), endindex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterNextMarkerPath(iterator: MutPtr, resultcount: MutPtr, path: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextMarkerPath(iterator.rawAddress.toString(), resultcount.rawAddress.toString(), path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterNextPathType(iterator: MutPtr, resultcount: MutPtr, pathtype: MutPtr, startindex: MutPtr, endindex: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextPathType(iterator.rawAddress.toString(), resultcount.rawAddress.toString(), pathtype.rawAddress.toString(), startindex.rawAddress.toString(), endindex.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterNextSubpath(iterator: MutPtr, resultcount: MutPtr, startindex: MutPtr, endindex: MutPtr, isclosed: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextSubpath(iterator.rawAddress.toString(), resultcount.rawAddress.toString(), startindex.rawAddress.toString(), endindex.rawAddress.toString(), isclosed.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterNextSubpathPath(iterator: MutPtr, resultcount: MutPtr, path: MutPtr, isclosed: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextSubpathPath(iterator.rawAddress.toString(), resultcount.rawAddress.toString(), path.rawAddress.toString(), isclosed.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPathIterRewind(iterator: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipPathIterRewind(iterator.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPlayMetafileRecord(metafile: ConstPtr, recordtype: EmfPlusRecordType, flags: UInt, datasize: UInt, data: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipPlayMetafileRecord(metafile.rawAddress.toString(), recordtype, flags.toInt(), datasize.toInt(), data.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPrivateAddFontFile(fontcollection: MutPtr, filename: Pcwstr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipPrivateAddFontFile(fontcollection.rawAddress.toString(), filename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipPrivateAddMemoryFont(fontcollection: MutPtr, memory: ConstPtr, length: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipPrivateAddMemoryFont(fontcollection.rawAddress.toString(), memory.rawAddress.toString(), length) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRecordMetafile(referencehdc: Hdc, type: EmfType, framerect: ConstPtr, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafile(referencehdc.rawAddress.toString(), type, framerect.rawAddress.toString(), frameunit, description.rawAddress.toString(), metafile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRecordMetafileFileName(filename: Pcwstr, referencehdc: Hdc, type: EmfType, framerect: ConstPtr, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileFileName(filename.rawAddress.toString(), referencehdc.rawAddress.toString(), type, framerect.rawAddress.toString(), frameunit, description.rawAddress.toString(), metafile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRecordMetafileFileNameI(filename: Pcwstr, referencehdc: Hdc, type: EmfType, framerect: ConstPtr, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileFileNameI(filename.rawAddress.toString(), referencehdc.rawAddress.toString(), type, framerect.rawAddress.toString(), frameunit, description.rawAddress.toString(), metafile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRecordMetafileI(referencehdc: Hdc, type: EmfType, framerect: ConstPtr, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileI(referencehdc.rawAddress.toString(), type, framerect.rawAddress.toString(), frameunit, description.rawAddress.toString(), metafile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRecordMetafileStream(stream: MutPtr, referencehdc: Hdc, type: EmfType, framerect: ConstPtr, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileStream(stream.rawAddress.toString(), referencehdc.rawAddress.toString(), type, framerect.rawAddress.toString(), frameunit, description.rawAddress.toString(), metafile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRecordMetafileStreamI(stream: MutPtr, referencehdc: Hdc, type: EmfType, framerect: ConstPtr, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileStreamI(stream.rawAddress.toString(), referencehdc.rawAddress.toString(), type, framerect.rawAddress.toString(), frameunit, description.rawAddress.toString(), metafile.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipReleaseDC(graphics: MutPtr, hdc: Hdc): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipReleaseDC(graphics.rawAddress.toString(), hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRemovePropertyItem(image: MutPtr, propid: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipRemovePropertyItem(image.rawAddress.toString(), propid.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetClip(graphics: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipResetClip(graphics.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetImageAttributes(imageattr: MutPtr, type: ColorAdjustType): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipResetImageAttributes(imageattr.rawAddress.toString(), type) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetLineTransform(brush: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipResetLineTransform(brush.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetPageTransform(graphics: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipResetPageTransform(graphics.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetPath(path: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipResetPath(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetPathGradientTransform(brush: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipResetPathGradientTransform(brush.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetPenTransform(pen: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipResetPenTransform(pen.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetTextureTransform(brush: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipResetTextureTransform(brush.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipResetWorldTransform(graphics: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipResetWorldTransform(graphics.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRestoreGraphics(graphics: MutPtr, state: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipRestoreGraphics(graphics.rawAddress.toString(), state.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipReversePath(path: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipReversePath(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRotateLineTransform(brush: MutPtr, angle: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipRotateLineTransform(brush.rawAddress.toString(), angle.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRotateMatrix(matrix: MutPtr, angle: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipRotateMatrix(matrix.rawAddress.toString(), angle.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRotatePathGradientTransform(brush: MutPtr, angle: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipRotatePathGradientTransform(brush.rawAddress.toString(), angle.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRotatePenTransform(pen: MutPtr, angle: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipRotatePenTransform(pen.rawAddress.toString(), angle.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRotateTextureTransform(brush: MutPtr, angle: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipRotateTextureTransform(brush.rawAddress.toString(), angle.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipRotateWorldTransform(graphics: MutPtr, angle: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipRotateWorldTransform(graphics.rawAddress.toString(), angle.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSaveAdd(image: MutPtr, encoderparams: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSaveAdd(image.rawAddress.toString(), encoderparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSaveAddImage(image: MutPtr, newimage: MutPtr, encoderparams: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSaveAddImage(image.rawAddress.toString(), newimage.rawAddress.toString(), encoderparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSaveGraphics(graphics: MutPtr, state: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSaveGraphics(graphics.rawAddress.toString(), state.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSaveImageToFile(image: MutPtr, filename: Pcwstr, clsidencoder: ConstPtr, encoderparams: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSaveImageToFile(image.rawAddress.toString(), filename.rawAddress.toString(), clsidencoder.rawAddress.toString(), encoderparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSaveImageToStream(image: MutPtr, stream: MutPtr, clsidencoder: ConstPtr, encoderparams: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSaveImageToStream(image.rawAddress.toString(), stream.rawAddress.toString(), clsidencoder.rawAddress.toString(), encoderparams.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipScaleLineTransform(brush: MutPtr, sx: Float, sy: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipScaleLineTransform(brush.rawAddress.toString(), sx.toDouble(), sy.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipScaleMatrix(matrix: MutPtr, scalex: Float, scaley: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipScaleMatrix(matrix.rawAddress.toString(), scalex.toDouble(), scaley.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipScalePathGradientTransform(brush: MutPtr, sx: Float, sy: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipScalePathGradientTransform(brush.rawAddress.toString(), sx.toDouble(), sy.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipScalePenTransform(pen: MutPtr, sx: Float, sy: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipScalePenTransform(pen.rawAddress.toString(), sx.toDouble(), sy.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipScaleTextureTransform(brush: MutPtr, sx: Float, sy: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipScaleTextureTransform(brush.rawAddress.toString(), sx.toDouble(), sy.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipScaleWorldTransform(graphics: MutPtr, sx: Float, sy: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipScaleWorldTransform(graphics.rawAddress.toString(), sx.toDouble(), sy.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetAdjustableArrowCapFillState(cap: MutPtr, fillstate: Bool): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapFillState(cap.rawAddress.toString(), fillstate) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetAdjustableArrowCapHeight(cap: MutPtr, height: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapHeight(cap.rawAddress.toString(), height.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetAdjustableArrowCapMiddleInset(cap: MutPtr, middleinset: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapMiddleInset(cap.rawAddress.toString(), middleinset.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetAdjustableArrowCapWidth(cap: MutPtr, width: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapWidth(cap.rawAddress.toString(), width.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetClipGraphics(graphics: MutPtr, srcgraphics: MutPtr, combinemode: CombineMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetClipGraphics(graphics.rawAddress.toString(), srcgraphics.rawAddress.toString(), combinemode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetClipHrgn(graphics: MutPtr, hrgn: Hrgn, combinemode: CombineMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetClipHrgn(graphics.rawAddress.toString(), hrgn.rawAddress.toString(), combinemode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetClipPath(graphics: MutPtr, path: MutPtr, combinemode: CombineMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetClipPath(graphics.rawAddress.toString(), path.rawAddress.toString(), combinemode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetClipRect(graphics: MutPtr, x: Float, y: Float, width: Float, height: Float, combinemode: CombineMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetClipRect(graphics.rawAddress.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), combinemode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetClipRectI(graphics: MutPtr, x: Int, y: Int, width: Int, height: Int, combinemode: CombineMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetClipRectI(graphics.rawAddress.toString(), x, y, width, height, combinemode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetClipRegion(graphics: MutPtr, region: MutPtr, combinemode: CombineMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetClipRegion(graphics.rawAddress.toString(), region.rawAddress.toString(), combinemode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetCompositingMode(graphics: MutPtr, compositingmode: CompositingMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetCompositingMode(graphics.rawAddress.toString(), compositingmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetCompositingQuality(graphics: MutPtr, compositingquality: CompositingQuality): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetCompositingQuality(graphics.rawAddress.toString(), compositingquality) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetCustomLineCapBaseCap(customcap: MutPtr, basecap: LineCap): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapBaseCap(customcap.rawAddress.toString(), basecap) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetCustomLineCapBaseInset(customcap: MutPtr, inset: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapBaseInset(customcap.rawAddress.toString(), inset.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetCustomLineCapStrokeCaps(customcap: MutPtr, startcap: LineCap, endcap: LineCap): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapStrokeCaps(customcap.rawAddress.toString(), startcap, endcap) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetCustomLineCapStrokeJoin(customcap: MutPtr, linejoin: LineJoin): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapStrokeJoin(customcap.rawAddress.toString(), linejoin) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetCustomLineCapWidthScale(customcap: MutPtr, widthscale: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapWidthScale(customcap.rawAddress.toString(), widthscale.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetEffectParameters(effect: MutPtr, params: ConstPtr, size: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetEffectParameters(effect.rawAddress.toString(), params.rawAddress.toString(), size.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetEmpty(region: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetEmpty(region.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesCachedBackground(imageattr: MutPtr, enableflag: Bool): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesCachedBackground(imageattr.rawAddress.toString(), enableflag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesColorKeys(imageattr: MutPtr, type: ColorAdjustType, enableflag: Bool, colorlow: UInt, colorhigh: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesColorKeys(imageattr.rawAddress.toString(), type, enableflag, colorlow.toInt(), colorhigh.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesColorMatrix(imageattr: MutPtr, type: ColorAdjustType, enableflag: Bool, colormatrix: ConstPtr, graymatrix: ConstPtr, flags: ColorMatrixFlags): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesColorMatrix(imageattr.rawAddress.toString(), type, enableflag, colormatrix.rawAddress.toString(), graymatrix.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesGamma(imageattr: MutPtr, type: ColorAdjustType, enableflag: Bool, gamma: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesGamma(imageattr.rawAddress.toString(), type, enableflag, gamma.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesNoOp(imageattr: MutPtr, type: ColorAdjustType, enableflag: Bool): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesNoOp(imageattr.rawAddress.toString(), type, enableflag) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesOutputChannel(imageattr: MutPtr, type: ColorAdjustType, enableflag: Bool, channelflags: ColorChannelFlags): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesOutputChannel(imageattr.rawAddress.toString(), type, enableflag, channelflags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesOutputChannelColorProfile(imageattr: MutPtr, type: ColorAdjustType, enableflag: Bool, colorprofilefilename: Pcwstr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesOutputChannelColorProfile(imageattr.rawAddress.toString(), type, enableflag, colorprofilefilename.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesRemapTable(imageattr: MutPtr, type: ColorAdjustType, enableflag: Bool, mapsize: UInt, map: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesRemapTable(imageattr.rawAddress.toString(), type, enableflag, mapsize.toInt(), map.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesThreshold(imageattr: MutPtr, type: ColorAdjustType, enableflag: Bool, threshold: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesThreshold(imageattr.rawAddress.toString(), type, enableflag, threshold.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesToIdentity(imageattr: MutPtr, type: ColorAdjustType): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesToIdentity(imageattr.rawAddress.toString(), type) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImageAttributesWrapMode(imageattr: MutPtr, wrap: WrapMode, argb: UInt, clamp: Bool): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesWrapMode(imageattr.rawAddress.toString(), wrap, argb.toInt(), clamp) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetImagePalette(image: MutPtr, palette: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetImagePalette(image.rawAddress.toString(), palette.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetInfinite(region: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetInfinite(region.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetInterpolationMode(graphics: MutPtr, interpolationmode: InterpolationMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetInterpolationMode(graphics.rawAddress.toString(), interpolationmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetLineBlend(brush: MutPtr, blend: ConstPtr, positions: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetLineBlend(brush.rawAddress.toString(), blend.rawAddress.toString(), positions.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetLineColors(brush: MutPtr, color1: UInt, color2: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetLineColors(brush.rawAddress.toString(), color1.toInt(), color2.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetLineGammaCorrection(brush: MutPtr, usegammacorrection: Bool): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetLineGammaCorrection(brush.rawAddress.toString(), usegammacorrection) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetLineLinearBlend(brush: MutPtr, focus: Float, scale: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetLineLinearBlend(brush.rawAddress.toString(), focus.toDouble(), scale.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetLinePresetBlend(brush: MutPtr, blend: ConstPtr, positions: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetLinePresetBlend(brush.rawAddress.toString(), blend.rawAddress.toString(), positions.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetLineSigmaBlend(brush: MutPtr, focus: Float, scale: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetLineSigmaBlend(brush.rawAddress.toString(), focus.toDouble(), scale.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetLineTransform(brush: MutPtr, matrix: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetLineTransform(brush.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetLineWrapMode(brush: MutPtr, wrapmode: WrapMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetLineWrapMode(brush.rawAddress.toString(), wrapmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetMatrixElements(matrix: MutPtr, m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetMatrixElements(matrix.rawAddress.toString(), m11.toDouble(), m12.toDouble(), m21.toDouble(), m22.toDouble(), dx.toDouble(), dy.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetMetafileDownLevelRasterizationLimit(metafile: MutPtr, metafilerasterizationlimitdpi: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetMetafileDownLevelRasterizationLimit(metafile.rawAddress.toString(), metafilerasterizationlimitdpi.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPageScale(graphics: MutPtr, scale: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPageScale(graphics.rawAddress.toString(), scale.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPageUnit(graphics: MutPtr, unit: Unit): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPageUnit(graphics.rawAddress.toString(), unit) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathFillMode(path: MutPtr, fillmode: FillMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPathFillMode(path.rawAddress.toString(), fillmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientBlend(brush: MutPtr, blend: ConstPtr, positions: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientBlend(brush.rawAddress.toString(), blend.rawAddress.toString(), positions.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientCenterColor(brush: MutPtr, colors: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientCenterColor(brush.rawAddress.toString(), colors.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientCenterPoint(brush: MutPtr, points: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientCenterPoint(brush.rawAddress.toString(), points.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientCenterPointI(brush: MutPtr, points: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientCenterPointI(brush.rawAddress.toString(), points.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientFocusScales(brush: MutPtr, xscale: Float, yscale: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientFocusScales(brush.rawAddress.toString(), xscale.toDouble(), yscale.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientGammaCorrection(brush: MutPtr, usegammacorrection: Bool): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientGammaCorrection(brush.rawAddress.toString(), usegammacorrection) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientLinearBlend(brush: MutPtr, focus: Float, scale: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientLinearBlend(brush.rawAddress.toString(), focus.toDouble(), scale.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientPath(brush: MutPtr, path: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientPath(brush.rawAddress.toString(), path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientPresetBlend(brush: MutPtr, blend: ConstPtr, positions: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientPresetBlend(brush.rawAddress.toString(), blend.rawAddress.toString(), positions.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientSigmaBlend(brush: MutPtr, focus: Float, scale: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientSigmaBlend(brush.rawAddress.toString(), focus.toDouble(), scale.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientSurroundColorsWithCount(brush: MutPtr, color: ConstPtr, count: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientSurroundColorsWithCount(brush.rawAddress.toString(), color.rawAddress.toString(), count.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientTransform(brush: MutPtr, matrix: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientTransform(brush.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathGradientWrapMode(brush: MutPtr, wrapmode: WrapMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientWrapMode(brush.rawAddress.toString(), wrapmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPathMarker(path: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPathMarker(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenBrushFill(pen: MutPtr, brush: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenBrushFill(pen.rawAddress.toString(), brush.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenColor(pen: MutPtr, argb: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenColor(pen.rawAddress.toString(), argb.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenCompoundArray(pen: MutPtr, dash: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenCompoundArray(pen.rawAddress.toString(), dash.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenCustomEndCap(pen: MutPtr, customcap: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenCustomEndCap(pen.rawAddress.toString(), customcap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenCustomStartCap(pen: MutPtr, customcap: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenCustomStartCap(pen.rawAddress.toString(), customcap.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenDashArray(pen: MutPtr, dash: ConstPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashArray(pen.rawAddress.toString(), dash.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenDashCap197819(pen: MutPtr, dashcap: DashCap): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashCap197819(pen.rawAddress.toString(), dashcap) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenDashOffset(pen: MutPtr, offset: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashOffset(pen.rawAddress.toString(), offset.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenDashStyle(pen: MutPtr, dashstyle: DashStyle): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashStyle(pen.rawAddress.toString(), dashstyle) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenEndCap(pen: MutPtr, endcap: LineCap): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenEndCap(pen.rawAddress.toString(), endcap) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenLineCap197819(pen: MutPtr, startcap: LineCap, endcap: LineCap, dashcap: DashCap): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenLineCap197819(pen.rawAddress.toString(), startcap, endcap, dashcap) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenLineJoin(pen: MutPtr, linejoin: LineJoin): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenLineJoin(pen.rawAddress.toString(), linejoin) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenMiterLimit(pen: MutPtr, miterlimit: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenMiterLimit(pen.rawAddress.toString(), miterlimit.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenMode(pen: MutPtr, penmode: PenAlignment): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenMode(pen.rawAddress.toString(), penmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenStartCap(pen: MutPtr, startcap: LineCap): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenStartCap(pen.rawAddress.toString(), startcap) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenTransform(pen: MutPtr, matrix: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenTransform(pen.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenUnit(pen: MutPtr, unit: Unit): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenUnit(pen.rawAddress.toString(), unit) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPenWidth(pen: MutPtr, width: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPenWidth(pen.rawAddress.toString(), width.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPixelOffsetMode(graphics: MutPtr, pixeloffsetmode: PixelOffsetMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPixelOffsetMode(graphics.rawAddress.toString(), pixeloffsetmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetPropertyItem(image: MutPtr, item: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetPropertyItem(image.rawAddress.toString(), item.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetRenderingOrigin(graphics: MutPtr, x: Int, y: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetRenderingOrigin(graphics.rawAddress.toString(), x, y) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetSmoothingMode(graphics: MutPtr, smoothingmode: SmoothingMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetSmoothingMode(graphics.rawAddress.toString(), smoothingmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetSolidFillColor(brush: MutPtr, color: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetSolidFillColor(brush.rawAddress.toString(), color.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetStringFormatAlign(format: MutPtr, align: StringAlignment): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatAlign(format.rawAddress.toString(), align) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetStringFormatDigitSubstitution(format: MutPtr, language: UShort, substitute: StringDigitSubstitute): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatDigitSubstitution(format.rawAddress.toString(), language.toInt(), substitute) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetStringFormatFlags(format: MutPtr, flags: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatFlags(format.rawAddress.toString(), flags) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetStringFormatHotkeyPrefix(format: MutPtr, hotkeyprefix: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatHotkeyPrefix(format.rawAddress.toString(), hotkeyprefix) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetStringFormatLineAlign(format: MutPtr, align: StringAlignment): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatLineAlign(format.rawAddress.toString(), align) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetStringFormatMeasurableCharacterRanges(format: MutPtr, rangecount: Int, ranges: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatMeasurableCharacterRanges(format.rawAddress.toString(), rangecount, ranges.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetStringFormatTabStops(format: MutPtr, firsttaboffset: Float, count: Int, tabstops: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatTabStops(format.rawAddress.toString(), firsttaboffset.toDouble(), count, tabstops.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetStringFormatTrimming(format: MutPtr, trimming: StringTrimming): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatTrimming(format.rawAddress.toString(), trimming) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetTextContrast(graphics: MutPtr, contrast: UInt): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetTextContrast(graphics.rawAddress.toString(), contrast.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetTextRenderingHint(graphics: MutPtr, mode: TextRenderingHint): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetTextRenderingHint(graphics.rawAddress.toString(), mode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetTextureTransform(brush: MutPtr, matrix: ConstPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetTextureTransform(brush.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetTextureWrapMode(brush: MutPtr, wrapmode: WrapMode): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetTextureWrapMode(brush.rawAddress.toString(), wrapmode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipSetWorldTransform(graphics: MutPtr, matrix: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipSetWorldTransform(graphics.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipShearMatrix(matrix: MutPtr, shearx: Float, sheary: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipShearMatrix(matrix.rawAddress.toString(), shearx.toDouble(), sheary.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipStartPathFigure(path: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipStartPathFigure(path.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipStringFormatGetGenericDefault(format: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipStringFormatGetGenericDefault(format.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipStringFormatGetGenericTypographic(format: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipStringFormatGetGenericTypographic(format.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTestControl(control: GpTestControlEnum, param1: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTestControl(control, param1.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTransformMatrixPoints(matrix: MutPtr, pts: MutPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTransformMatrixPoints(matrix.rawAddress.toString(), pts.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTransformMatrixPointsI(matrix: MutPtr, pts: MutPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTransformMatrixPointsI(matrix.rawAddress.toString(), pts.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTransformPath(path: MutPtr, matrix: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTransformPath(path.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTransformPoints(graphics: MutPtr, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: MutPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTransformPoints(graphics.rawAddress.toString(), destspace, srcspace, points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTransformPointsI(graphics: MutPtr, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: MutPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTransformPointsI(graphics.rawAddress.toString(), destspace, srcspace, points.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTransformRegion(region: MutPtr, matrix: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTransformRegion(region.rawAddress.toString(), matrix.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslateClip(graphics: MutPtr, dx: Float, dy: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTranslateClip(graphics.rawAddress.toString(), dx.toDouble(), dy.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslateClipI(graphics: MutPtr, dx: Int, dy: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTranslateClipI(graphics.rawAddress.toString(), dx, dy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslateLineTransform(brush: MutPtr, dx: Float, dy: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTranslateLineTransform(brush.rawAddress.toString(), dx.toDouble(), dy.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslateMatrix(matrix: MutPtr, offsetx: Float, offsety: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTranslateMatrix(matrix.rawAddress.toString(), offsetx.toDouble(), offsety.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslatePathGradientTransform(brush: MutPtr, dx: Float, dy: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTranslatePathGradientTransform(brush.rawAddress.toString(), dx.toDouble(), dy.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslatePenTransform(pen: MutPtr, dx: Float, dy: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTranslatePenTransform(pen.rawAddress.toString(), dx.toDouble(), dy.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslateRegion(region: MutPtr, dx: Float, dy: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTranslateRegion(region.rawAddress.toString(), dx.toDouble(), dy.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslateRegionI(region: MutPtr, dx: Int, dy: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTranslateRegionI(region.rawAddress.toString(), dx, dy) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslateTextureTransform(brush: MutPtr, dx: Float, dy: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTranslateTextureTransform(brush.rawAddress.toString(), dx.toDouble(), dy.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipTranslateWorldTransform(graphics: MutPtr, dx: Float, dy: Float, order: MatrixOrder): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipTranslateWorldTransform(graphics.rawAddress.toString(), dx.toDouble(), dy.toDouble(), order) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipVectorTransformMatrixPoints(matrix: MutPtr, pts: MutPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipVectorTransformMatrixPoints(matrix.rawAddress.toString(), pts.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipVectorTransformMatrixPointsI(matrix: MutPtr, pts: MutPtr, count: Int): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipVectorTransformMatrixPointsI(matrix.rawAddress.toString(), pts.rawAddress.toString(), count) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipWarpPath(path: MutPtr, matrix: MutPtr, points: ConstPtr, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, warpmode: WarpMode, flatness: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipWarpPath(path.rawAddress.toString(), matrix.rawAddress.toString(), points.rawAddress.toString(), count, srcx.toDouble(), srcy.toDouble(), srcwidth.toDouble(), srcheight.toDouble(), warpmode, flatness.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipWidenPath(nativepath: MutPtr, pen: MutPtr, matrix: MutPtr, flatness: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipWidenPath(nativepath.rawAddress.toString(), pen.rawAddress.toString(), matrix.rawAddress.toString(), flatness.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdipWindingModeOutline(path: MutPtr, matrix: MutPtr, flatness: Float): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdipWindingModeOutline(path.rawAddress.toString(), matrix.rawAddress.toString(), flatness.toDouble()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun gdiplusNotificationHook(token: MutPtr): Status =
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

public actual fun gdiplusStartup(token: MutPtr, input: ConstPtr, output: MutPtr): Status =
    if (windowsWin32GraphicsGdiplusNapiAddon != null) (windowsWin32GraphicsGdiplusNapiAddon.windowssysWindowsWin32GraphicsGdiplusGdiplusStartup(token.rawAddress.toString(), input.rawAddress.toString(), output.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
