@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HINSTANCE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HBITMAP
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HDC
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HENHMETAFILE
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HMETAFILE
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HPALETTE
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HRGN
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.HICON

private val _windowsWin32GraphicsGdiplusNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun GdipAddPathArc(path: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAddPathArc(path.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), startangle.toDouble(), sweepangle.toDouble()) as Int) else 0

public actual fun GdipAddPathArcI(path: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAddPathArcI(path.toString(), x, y, width, height, startangle.toDouble(), sweepangle.toDouble()) as Int) else 0

public actual fun GdipAddPathBezier(path: Long, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAddPathBezier(path.toString(), x1.toDouble(), y1.toDouble(), x2.toDouble(), y2.toDouble(), x3.toDouble(), y3.toDouble(), x4.toDouble(), y4.toDouble()) as Int) else 0

public actual fun GdipAddPathBezierI(path: Long, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAddPathBezierI(path.toString(), x1, y1, x2, y2, x3, y3, x4, y4) as Int) else 0

public actual fun GdipAddPathBeziers(path: Long, points: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAddPathBeziers(path.toString(), points.toString(), count) as Int) else 0

public actual fun GdipAddPathBeziersI(path: Long, points: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAddPathBeziersI(path.toString(), points.toString(), count) as Int) else 0

public actual fun GdipAddPathClosedCurve(path: Long, points: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAddPathClosedCurve(path.toString(), points.toString(), count) as Int) else 0

public actual fun GdipAddPathClosedCurve2(path: Long, points: Long, count: Int, tension: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAddPathClosedCurve2(path.toString(), points.toString(), count, tension.toDouble()) as Int) else 0

public actual fun GdipAddPathClosedCurve2I(path: Long, points: Long, count: Int, tension: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAddPathClosedCurve2I(path.toString(), points.toString(), count, tension.toDouble()) as Int) else 0

public actual fun GdipAddPathClosedCurveI(path: Long, points: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAddPathClosedCurveI(path.toString(), points.toString(), count) as Int) else 0

public actual fun GdipAddPathCurve(path: Long, points: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve(path.toString(), points.toString(), count) as Int) else 0

public actual fun GdipAddPathCurve2(path: Long, points: Long, count: Int, tension: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve2(path.toString(), points.toString(), count, tension.toDouble()) as Int) else 0

public actual fun GdipAddPathCurve2I(path: Long, points: Long, count: Int, tension: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve2I(path.toString(), points.toString(), count, tension.toDouble()) as Int) else 0

public actual fun GdipAddPathCurve3(path: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve3(path.toString(), points.toString(), count, offset, numberofsegments, tension.toDouble()) as Int) else 0

public actual fun GdipAddPathCurve3I(path: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve3I(path.toString(), points.toString(), count, offset, numberofsegments, tension.toDouble()) as Int) else 0

public actual fun GdipAddPathCurveI(path: Long, points: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurveI(path.toString(), points.toString(), count) as Int) else 0

public actual fun GdipAddPathEllipse(path: Long, x: Float, y: Float, width: Float, height: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAddPathEllipse(path.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) as Int) else 0

public actual fun GdipAddPathEllipseI(path: Long, x: Int, y: Int, width: Int, height: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAddPathEllipseI(path.toString(), x, y, width, height) as Int) else 0

public actual fun GdipAddPathLine(path: Long, x1: Float, y1: Float, x2: Float, y2: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAddPathLine(path.toString(), x1.toDouble(), y1.toDouble(), x2.toDouble(), y2.toDouble()) as Int) else 0

public actual fun GdipAddPathLine2(path: Long, points: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAddPathLine2(path.toString(), points.toString(), count) as Int) else 0

public actual fun GdipAddPathLine2I(path: Long, points: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAddPathLine2I(path.toString(), points.toString(), count) as Int) else 0

public actual fun GdipAddPathLineI(path: Long, x1: Int, y1: Int, x2: Int, y2: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAddPathLineI(path.toString(), x1, y1, x2, y2) as Int) else 0

public actual fun GdipAddPathPath(path: Long, addingpath: Long, connect: BOOL): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAddPathPath(path.toString(), addingpath.toString(), connect) as Int) else 0

public actual fun GdipAddPathPie(path: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAddPathPie(path.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), startangle.toDouble(), sweepangle.toDouble()) as Int) else 0

public actual fun GdipAddPathPieI(path: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAddPathPieI(path.toString(), x, y, width, height, startangle.toDouble(), sweepangle.toDouble()) as Int) else 0

public actual fun GdipAddPathPolygon(path: Long, points: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAddPathPolygon(path.toString(), points.toString(), count) as Int) else 0

public actual fun GdipAddPathPolygonI(path: Long, points: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAddPathPolygonI(path.toString(), points.toString(), count) as Int) else 0

public actual fun GdipAddPathRectangle(path: Long, x: Float, y: Float, width: Float, height: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAddPathRectangle(path.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) as Int) else 0

public actual fun GdipAddPathRectangleI(path: Long, x: Int, y: Int, width: Int, height: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAddPathRectangleI(path.toString(), x, y, width, height) as Int) else 0

public actual fun GdipAddPathRectangles(path: Long, rects: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAddPathRectangles(path.toString(), rects.toString(), count) as Int) else 0

public actual fun GdipAddPathRectanglesI(path: Long, rects: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAddPathRectanglesI(path.toString(), rects.toString(), count) as Int) else 0

public actual fun GdipAddPathString(path: Long, string: PCWSTR, length: Int, family: Long, style: Int, emsize: Float, layoutrect: Long, format: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAddPathString(path.toString(), string.toString(), length, family.toString(), style, emsize.toDouble(), layoutrect.toString(), format.toString()) as Int) else 0

public actual fun GdipAddPathStringI(path: Long, string: PCWSTR, length: Int, family: Long, style: Int, emsize: Float, layoutrect: Long, format: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAddPathStringI(path.toString(), string.toString(), length, family.toString(), style, emsize.toDouble(), layoutrect.toString(), format.toString()) as Int) else 0

public actual fun GdipAlloc(size: ULong): Long =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipAlloc(size.toString()) as String).toLong() else 0L

public actual fun GdipBeginContainer(graphics: Long, dstrect: Long, srcrect: Long, unit: Unit, state: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipBeginContainer(graphics.toString(), dstrect.toString(), srcrect.toString(), unit, state.toString()) as Int) else 0

public actual fun GdipBeginContainer2(graphics: Long, state: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipBeginContainer2(graphics.toString(), state.toString()) as Int) else 0

public actual fun GdipBeginContainerI(graphics: Long, dstrect: Long, srcrect: Long, unit: Unit, state: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipBeginContainerI(graphics.toString(), dstrect.toString(), srcrect.toString(), unit, state.toString()) as Int) else 0

public actual fun GdipBitmapApplyEffect(bitmap: Long, effect: Long, roi: Long, useauxdata: BOOL, auxdata: Long, auxdatasize: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipBitmapApplyEffect(bitmap.toString(), effect.toString(), roi.toString(), useauxdata, auxdata.toString(), auxdatasize.toString()) as Int) else 0

public actual fun GdipBitmapConvertFormat(pinputbitmap: Long, format: Int, dithertype: DitherType, palettetype: PaletteType, palette: Long, alphathresholdpercent: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipBitmapConvertFormat(pinputbitmap.toString(), format, dithertype, palettetype, palette.toString(), alphathresholdpercent.toDouble()) as Int) else 0

public actual fun GdipBitmapCreateApplyEffect(inputbitmaps: Long, numinputs: Int, effect: Long, roi: Long, outputrect: Long, outputbitmap: Long, useauxdata: BOOL, auxdata: Long, auxdatasize: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipBitmapCreateApplyEffect(inputbitmaps.toString(), numinputs, effect.toString(), roi.toString(), outputrect.toString(), outputbitmap.toString(), useauxdata, auxdata.toString(), auxdatasize.toString()) as Int) else 0

public actual fun GdipBitmapGetHistogram(bitmap: Long, format: HistogramFormat, numberofentries: UInt, channel0: Long, channel1: Long, channel2: Long, channel3: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipBitmapGetHistogram(bitmap.toString(), format, numberofentries.toInt(), channel0.toString(), channel1.toString(), channel2.toString(), channel3.toString()) as Int) else 0

public actual fun GdipBitmapGetHistogramSize(format: HistogramFormat, numberofentries: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipBitmapGetHistogramSize(format, numberofentries.toString()) as Int) else 0

public actual fun GdipBitmapGetPixel(bitmap: Long, x: Int, y: Int, color: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipBitmapGetPixel(bitmap.toString(), x, y, color.toString()) as Int) else 0

public actual fun GdipBitmapLockBits(bitmap: Long, rect: Long, flags: UInt, format: Int, lockedbitmapdata: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipBitmapLockBits(bitmap.toString(), rect.toString(), flags.toInt(), format, lockedbitmapdata.toString()) as Int) else 0

public actual fun GdipBitmapSetPixel(bitmap: Long, x: Int, y: Int, color: UInt): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipBitmapSetPixel(bitmap.toString(), x, y, color.toInt()) as Int) else 0

public actual fun GdipBitmapSetResolution(bitmap: Long, xdpi: Float, ydpi: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipBitmapSetResolution(bitmap.toString(), xdpi.toDouble(), ydpi.toDouble()) as Int) else 0

public actual fun GdipBitmapUnlockBits(bitmap: Long, lockedbitmapdata: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipBitmapUnlockBits(bitmap.toString(), lockedbitmapdata.toString()) as Int) else 0

public actual fun GdipClearPathMarkers(path: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipClearPathMarkers(path.toString()) as Int) else 0

public actual fun GdipCloneBitmapArea(x: Float, y: Float, width: Float, height: Float, format: Int, srcbitmap: Long, dstbitmap: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCloneBitmapArea(x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), format, srcbitmap.toString(), dstbitmap.toString()) as Int) else 0

public actual fun GdipCloneBitmapAreaI(x: Int, y: Int, width: Int, height: Int, format: Int, srcbitmap: Long, dstbitmap: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCloneBitmapAreaI(x, y, width, height, format, srcbitmap.toString(), dstbitmap.toString()) as Int) else 0

public actual fun GdipCloneBrush(brush: Long, clonebrush: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCloneBrush(brush.toString(), clonebrush.toString()) as Int) else 0

public actual fun GdipCloneCustomLineCap(customcap: Long, clonedcap: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCloneCustomLineCap(customcap.toString(), clonedcap.toString()) as Int) else 0

public actual fun GdipCloneFont(font: Long, clonefont: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCloneFont(font.toString(), clonefont.toString()) as Int) else 0

public actual fun GdipCloneFontFamily(fontfamily: Long, clonedfontfamily: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCloneFontFamily(fontfamily.toString(), clonedfontfamily.toString()) as Int) else 0

public actual fun GdipCloneImage(image: Long, cloneimage: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCloneImage(image.toString(), cloneimage.toString()) as Int) else 0

public actual fun GdipCloneImageAttributes(imageattr: Long, cloneimageattr: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCloneImageAttributes(imageattr.toString(), cloneimageattr.toString()) as Int) else 0

public actual fun GdipCloneMatrix(matrix: Long, clonematrix: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCloneMatrix(matrix.toString(), clonematrix.toString()) as Int) else 0

public actual fun GdipClonePath(path: Long, clonepath: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipClonePath(path.toString(), clonepath.toString()) as Int) else 0

public actual fun GdipClonePen(pen: Long, clonepen: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipClonePen(pen.toString(), clonepen.toString()) as Int) else 0

public actual fun GdipCloneRegion(region: Long, cloneregion: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCloneRegion(region.toString(), cloneregion.toString()) as Int) else 0

public actual fun GdipCloneStringFormat(format: Long, newformat: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCloneStringFormat(format.toString(), newformat.toString()) as Int) else 0

public actual fun GdipClosePathFigure(path: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipClosePathFigure(path.toString()) as Int) else 0

public actual fun GdipClosePathFigures(path: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipClosePathFigures(path.toString()) as Int) else 0

public actual fun GdipCombineRegionPath(region: Long, path: Long, combinemode: CombineMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCombineRegionPath(region.toString(), path.toString(), combinemode) as Int) else 0

public actual fun GdipCombineRegionRect(region: Long, rect: Long, combinemode: CombineMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCombineRegionRect(region.toString(), rect.toString(), combinemode) as Int) else 0

public actual fun GdipCombineRegionRectI(region: Long, rect: Long, combinemode: CombineMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCombineRegionRectI(region.toString(), rect.toString(), combinemode) as Int) else 0

public actual fun GdipCombineRegionRegion(region: Long, region2: Long, combinemode: CombineMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCombineRegionRegion(region.toString(), region2.toString(), combinemode) as Int) else 0

public actual fun GdipComment(graphics: Long, sizedata: UInt, data: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipComment(graphics.toString(), sizedata.toInt(), data.toString()) as Int) else 0

public actual fun GdipConvertToEmfPlus(refgraphics: Long, metafile: Long, conversionfailureflag: Long, emftype: EmfType, description: PCWSTR, out_metafile: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipConvertToEmfPlus(refgraphics.toString(), metafile.toString(), conversionfailureflag.toString(), emftype, description.toString(), out_metafile.toString()) as Int) else 0

public actual fun GdipConvertToEmfPlusToFile(refgraphics: Long, metafile: Long, conversionfailureflag: Long, filename: PCWSTR, emftype: EmfType, description: PCWSTR, out_metafile: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipConvertToEmfPlusToFile(refgraphics.toString(), metafile.toString(), conversionfailureflag.toString(), filename.toString(), emftype, description.toString(), out_metafile.toString()) as Int) else 0

public actual fun GdipConvertToEmfPlusToStream(refgraphics: Long, metafile: Long, conversionfailureflag: Long, stream: Long, emftype: EmfType, description: PCWSTR, out_metafile: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipConvertToEmfPlusToStream(refgraphics.toString(), metafile.toString(), conversionfailureflag.toString(), stream.toString(), emftype, description.toString(), out_metafile.toString()) as Int) else 0

public actual fun GdipCreateAdjustableArrowCap(height: Float, width: Float, isfilled: BOOL, cap: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateAdjustableArrowCap(height.toDouble(), width.toDouble(), isfilled, cap.toString()) as Int) else 0

public actual fun GdipCreateBitmapFromFile(filename: PCWSTR, bitmap: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromFile(filename.toString(), bitmap.toString()) as Int) else 0

public actual fun GdipCreateBitmapFromFileICM(filename: PCWSTR, bitmap: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromFileICM(filename.toString(), bitmap.toString()) as Int) else 0

public actual fun GdipCreateBitmapFromGdiDib(gdibitmapinfo: Long, gdibitmapdata: Long, bitmap: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromGdiDib(gdibitmapinfo.toString(), gdibitmapdata.toString(), bitmap.toString()) as Int) else 0

public actual fun GdipCreateBitmapFromGraphics(width: Int, height: Int, target: Long, bitmap: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromGraphics(width, height, target.toString(), bitmap.toString()) as Int) else 0

public actual fun GdipCreateBitmapFromHBITMAP(hbm: HBITMAP, hpal: HPALETTE, bitmap: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromHBITMAP(hbm.toString(), hpal.toString(), bitmap.toString()) as Int) else 0

public actual fun GdipCreateBitmapFromHICON(hicon: HICON, bitmap: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromHICON(hicon.toString(), bitmap.toString()) as Int) else 0

public actual fun GdipCreateBitmapFromResource(hinstance: HINSTANCE, lpbitmapname: PCWSTR, bitmap: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromResource(hinstance.toString(), lpbitmapname.toString(), bitmap.toString()) as Int) else 0

public actual fun GdipCreateBitmapFromScan0(width: Int, height: Int, stride: Int, format: Int, scan0: Long, bitmap: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromScan0(width, height, stride, format, scan0.toString(), bitmap.toString()) as Int) else 0

public actual fun GdipCreateBitmapFromStream(stream: Long, bitmap: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromStream(stream.toString(), bitmap.toString()) as Int) else 0

public actual fun GdipCreateBitmapFromStreamICM(stream: Long, bitmap: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromStreamICM(stream.toString(), bitmap.toString()) as Int) else 0

public actual fun GdipCreateCachedBitmap(bitmap: Long, graphics: Long, cachedbitmap: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateCachedBitmap(bitmap.toString(), graphics.toString(), cachedbitmap.toString()) as Int) else 0

public actual fun GdipCreateCustomLineCap(fillpath: Long, strokepath: Long, basecap: LineCap, baseinset: Float, customcap: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateCustomLineCap(fillpath.toString(), strokepath.toString(), basecap, baseinset.toDouble(), customcap.toString()) as Int) else 0

public actual fun GdipCreateEffect(guid: GUID, effect: Long): Status =
    0

public actual fun GdipCreateFont(fontfamily: Long, emsize: Float, style: Int, unit: Unit, font: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateFont(fontfamily.toString(), emsize.toDouble(), style, unit, font.toString()) as Int) else 0

public actual fun GdipCreateFontFamilyFromName(name: PCWSTR, fontcollection: Long, fontfamily: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateFontFamilyFromName(name.toString(), fontcollection.toString(), fontfamily.toString()) as Int) else 0

public actual fun GdipCreateFontFromDC(hdc: HDC, font: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateFontFromDC(hdc.toString(), font.toString()) as Int) else 0

public actual fun GdipCreateFontFromLogfontA(hdc: HDC, logfont: Long, font: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateFontFromLogfontA(hdc.toString(), logfont.toString(), font.toString()) as Int) else 0

public actual fun GdipCreateFontFromLogfontW(hdc: HDC, logfont: Long, font: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateFontFromLogfontW(hdc.toString(), logfont.toString(), font.toString()) as Int) else 0

public actual fun GdipCreateFromHDC(hdc: HDC, graphics: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateFromHDC(hdc.toString(), graphics.toString()) as Int) else 0

public actual fun GdipCreateFromHDC2(hdc: HDC, hdevice: HANDLE, graphics: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateFromHDC2(hdc.toString(), hdevice.toString(), graphics.toString()) as Int) else 0

public actual fun GdipCreateFromHWND(hwnd: HWND, graphics: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateFromHWND(hwnd.toString(), graphics.toString()) as Int) else 0

public actual fun GdipCreateFromHWNDICM(hwnd: HWND, graphics: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateFromHWNDICM(hwnd.toString(), graphics.toString()) as Int) else 0

public actual fun GdipCreateHBITMAPFromBitmap(bitmap: Long, hbmreturn: Long, background: UInt): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateHBITMAPFromBitmap(bitmap.toString(), hbmreturn.toString(), background.toInt()) as Int) else 0

public actual fun GdipCreateHICONFromBitmap(bitmap: Long, hbmreturn: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateHICONFromBitmap(bitmap.toString(), hbmreturn.toString()) as Int) else 0

public actual fun GdipCreateHalftonePalette(): HPALETTE =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateHalftonePalette() as String).toLong() else 0L

public actual fun GdipCreateHatchBrush(hatchstyle: HatchStyle, forecol: UInt, backcol: UInt, brush: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateHatchBrush(hatchstyle, forecol.toInt(), backcol.toInt(), brush.toString()) as Int) else 0

public actual fun GdipCreateImageAttributes(imageattr: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateImageAttributes(imageattr.toString()) as Int) else 0

public actual fun GdipCreateLineBrush(point1: Long, point2: Long, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrush(point1.toString(), point2.toString(), color1.toInt(), color2.toInt(), wrapmode, linegradient.toString()) as Int) else 0

public actual fun GdipCreateLineBrushFromRect(rect: Long, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushFromRect(rect.toString(), color1.toInt(), color2.toInt(), mode, wrapmode, linegradient.toString()) as Int) else 0

public actual fun GdipCreateLineBrushFromRectI(rect: Long, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushFromRectI(rect.toString(), color1.toInt(), color2.toInt(), mode, wrapmode, linegradient.toString()) as Int) else 0

public actual fun GdipCreateLineBrushFromRectWithAngle(rect: Long, color1: UInt, color2: UInt, angle: Float, isanglescalable: BOOL, wrapmode: WrapMode, linegradient: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushFromRectWithAngle(rect.toString(), color1.toInt(), color2.toInt(), angle.toDouble(), isanglescalable, wrapmode, linegradient.toString()) as Int) else 0

public actual fun GdipCreateLineBrushFromRectWithAngleI(rect: Long, color1: UInt, color2: UInt, angle: Float, isanglescalable: BOOL, wrapmode: WrapMode, linegradient: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushFromRectWithAngleI(rect.toString(), color1.toInt(), color2.toInt(), angle.toDouble(), isanglescalable, wrapmode, linegradient.toString()) as Int) else 0

public actual fun GdipCreateLineBrushI(point1: Long, point2: Long, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushI(point1.toString(), point2.toString(), color1.toInt(), color2.toInt(), wrapmode, linegradient.toString()) as Int) else 0

public actual fun GdipCreateMatrix(matrix: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateMatrix(matrix.toString()) as Int) else 0

public actual fun GdipCreateMatrix2(m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float, matrix: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateMatrix2(m11.toDouble(), m12.toDouble(), m21.toDouble(), m22.toDouble(), dx.toDouble(), dy.toDouble(), matrix.toString()) as Int) else 0

public actual fun GdipCreateMatrix3(rect: Long, dstplg: Long, matrix: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateMatrix3(rect.toString(), dstplg.toString(), matrix.toString()) as Int) else 0

public actual fun GdipCreateMatrix3I(rect: Long, dstplg: Long, matrix: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateMatrix3I(rect.toString(), dstplg.toString(), matrix.toString()) as Int) else 0

public actual fun GdipCreateMetafileFromEmf(hemf: HENHMETAFILE, deleteemf: BOOL, metafile: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromEmf(hemf.toString(), deleteemf, metafile.toString()) as Int) else 0

public actual fun GdipCreateMetafileFromFile(file: PCWSTR, metafile: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromFile(file.toString(), metafile.toString()) as Int) else 0

public actual fun GdipCreateMetafileFromStream(stream: Long, metafile: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromStream(stream.toString(), metafile.toString()) as Int) else 0

public actual fun GdipCreateMetafileFromWmf(hwmf: HMETAFILE, deletewmf: BOOL, wmfplaceablefileheader: Long, metafile: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromWmf(hwmf.toString(), deletewmf, wmfplaceablefileheader.toString(), metafile.toString()) as Int) else 0

public actual fun GdipCreateMetafileFromWmfFile(file: PCWSTR, wmfplaceablefileheader: Long, metafile: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromWmfFile(file.toString(), wmfplaceablefileheader.toString(), metafile.toString()) as Int) else 0

public actual fun GdipCreatePath(brushmode: FillMode, path: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreatePath(brushmode, path.toString()) as Int) else 0

public actual fun GdipCreatePath2(param0: Long, param1: Long, param2: Int, param3: FillMode, path: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreatePath2(param0.toString(), param1.toString(), param2, param3, path.toString()) as Int) else 0

public actual fun GdipCreatePath2I(param0: Long, param1: Long, param2: Int, param3: FillMode, path: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreatePath2I(param0.toString(), param1.toString(), param2, param3, path.toString()) as Int) else 0

public actual fun GdipCreatePathGradient(points: Long, count: Int, wrapmode: WrapMode, polygradient: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreatePathGradient(points.toString(), count, wrapmode, polygradient.toString()) as Int) else 0

public actual fun GdipCreatePathGradientFromPath(path: Long, polygradient: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreatePathGradientFromPath(path.toString(), polygradient.toString()) as Int) else 0

public actual fun GdipCreatePathGradientI(points: Long, count: Int, wrapmode: WrapMode, polygradient: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreatePathGradientI(points.toString(), count, wrapmode, polygradient.toString()) as Int) else 0

public actual fun GdipCreatePathIter(iterator: Long, path: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreatePathIter(iterator.toString(), path.toString()) as Int) else 0

public actual fun GdipCreatePen1(color: UInt, width: Float, unit: Unit, pen: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreatePen1(color.toInt(), width.toDouble(), unit, pen.toString()) as Int) else 0

public actual fun GdipCreatePen2(brush: Long, width: Float, unit: Unit, pen: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreatePen2(brush.toString(), width.toDouble(), unit, pen.toString()) as Int) else 0

public actual fun GdipCreateRegion(region: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateRegion(region.toString()) as Int) else 0

public actual fun GdipCreateRegionHrgn(hrgn: HRGN, region: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionHrgn(hrgn.toString(), region.toString()) as Int) else 0

public actual fun GdipCreateRegionPath(path: Long, region: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionPath(path.toString(), region.toString()) as Int) else 0

public actual fun GdipCreateRegionRect(rect: Long, region: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionRect(rect.toString(), region.toString()) as Int) else 0

public actual fun GdipCreateRegionRectI(rect: Long, region: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionRectI(rect.toString(), region.toString()) as Int) else 0

public actual fun GdipCreateRegionRgnData(regiondata: Long, size: Int, region: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionRgnData(regiondata.toString(), size, region.toString()) as Int) else 0

public actual fun GdipCreateSolidFill(color: UInt, brush: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateSolidFill(color.toInt(), brush.toString()) as Int) else 0

public actual fun GdipCreateStreamOnFile(filename: PCWSTR, access: UInt, stream: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateStreamOnFile(filename.toString(), access.toInt(), stream.toString()) as Int) else 0

public actual fun GdipCreateStringFormat(formatattributes: Int, language: UShort, format: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateStringFormat(formatattributes, language.toInt(), format.toString()) as Int) else 0

public actual fun GdipCreateTexture(image: Long, wrapmode: WrapMode, texture: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateTexture(image.toString(), wrapmode, texture.toString()) as Int) else 0

public actual fun GdipCreateTexture2(image: Long, wrapmode: WrapMode, x: Float, y: Float, width: Float, height: Float, texture: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateTexture2(image.toString(), wrapmode, x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), texture.toString()) as Int) else 0

public actual fun GdipCreateTexture2I(image: Long, wrapmode: WrapMode, x: Int, y: Int, width: Int, height: Int, texture: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateTexture2I(image.toString(), wrapmode, x, y, width, height, texture.toString()) as Int) else 0

public actual fun GdipCreateTextureIA(image: Long, imageattributes: Long, x: Float, y: Float, width: Float, height: Float, texture: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateTextureIA(image.toString(), imageattributes.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), texture.toString()) as Int) else 0

public actual fun GdipCreateTextureIAI(image: Long, imageattributes: Long, x: Int, y: Int, width: Int, height: Int, texture: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipCreateTextureIAI(image.toString(), imageattributes.toString(), x, y, width, height, texture.toString()) as Int) else 0

public actual fun GdipDeleteBrush(brush: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDeleteBrush(brush.toString()) as Int) else 0

public actual fun GdipDeleteCachedBitmap(cachedbitmap: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDeleteCachedBitmap(cachedbitmap.toString()) as Int) else 0

public actual fun GdipDeleteCustomLineCap(customcap: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDeleteCustomLineCap(customcap.toString()) as Int) else 0

public actual fun GdipDeleteEffect(effect: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDeleteEffect(effect.toString()) as Int) else 0

public actual fun GdipDeleteFont(font: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDeleteFont(font.toString()) as Int) else 0

public actual fun GdipDeleteFontFamily(fontfamily: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDeleteFontFamily(fontfamily.toString()) as Int) else 0

public actual fun GdipDeleteGraphics(graphics: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDeleteGraphics(graphics.toString()) as Int) else 0

public actual fun GdipDeleteMatrix(matrix: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDeleteMatrix(matrix.toString()) as Int) else 0

public actual fun GdipDeletePath(path: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDeletePath(path.toString()) as Int) else 0

public actual fun GdipDeletePathIter(iterator: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDeletePathIter(iterator.toString()) as Int) else 0

public actual fun GdipDeletePen(pen: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDeletePen(pen.toString()) as Int) else 0

public actual fun GdipDeletePrivateFontCollection(fontcollection: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDeletePrivateFontCollection(fontcollection.toString()) as Int) else 0

public actual fun GdipDeleteRegion(region: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDeleteRegion(region.toString()) as Int) else 0

public actual fun GdipDeleteStringFormat(format: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDeleteStringFormat(format.toString()) as Int) else 0

public actual fun GdipDisposeImage(image: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDisposeImage(image.toString()) as Int) else 0

public actual fun GdipDisposeImageAttributes(imageattr: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDisposeImageAttributes(imageattr.toString()) as Int) else 0

public actual fun GdipDrawArc(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawArc(graphics.toString(), pen.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), startangle.toDouble(), sweepangle.toDouble()) as Int) else 0

public actual fun GdipDrawArcI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawArcI(graphics.toString(), pen.toString(), x, y, width, height, startangle.toDouble(), sweepangle.toDouble()) as Int) else 0

public actual fun GdipDrawBezier(graphics: Long, pen: Long, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawBezier(graphics.toString(), pen.toString(), x1.toDouble(), y1.toDouble(), x2.toDouble(), y2.toDouble(), x3.toDouble(), y3.toDouble(), x4.toDouble(), y4.toDouble()) as Int) else 0

public actual fun GdipDrawBezierI(graphics: Long, pen: Long, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawBezierI(graphics.toString(), pen.toString(), x1, y1, x2, y2, x3, y3, x4, y4) as Int) else 0

public actual fun GdipDrawBeziers(graphics: Long, pen: Long, points: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawBeziers(graphics.toString(), pen.toString(), points.toString(), count) as Int) else 0

public actual fun GdipDrawBeziersI(graphics: Long, pen: Long, points: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawBeziersI(graphics.toString(), pen.toString(), points.toString(), count) as Int) else 0

public actual fun GdipDrawCachedBitmap(graphics: Long, cachedbitmap: Long, x: Int, y: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawCachedBitmap(graphics.toString(), cachedbitmap.toString(), x, y) as Int) else 0

public actual fun GdipDrawClosedCurve(graphics: Long, pen: Long, points: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawClosedCurve(graphics.toString(), pen.toString(), points.toString(), count) as Int) else 0

public actual fun GdipDrawClosedCurve2(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawClosedCurve2(graphics.toString(), pen.toString(), points.toString(), count, tension.toDouble()) as Int) else 0

public actual fun GdipDrawClosedCurve2I(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawClosedCurve2I(graphics.toString(), pen.toString(), points.toString(), count, tension.toDouble()) as Int) else 0

public actual fun GdipDrawClosedCurveI(graphics: Long, pen: Long, points: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawClosedCurveI(graphics.toString(), pen.toString(), points.toString(), count) as Int) else 0

public actual fun GdipDrawCurve(graphics: Long, pen: Long, points: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve(graphics.toString(), pen.toString(), points.toString(), count) as Int) else 0

public actual fun GdipDrawCurve2(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve2(graphics.toString(), pen.toString(), points.toString(), count, tension.toDouble()) as Int) else 0

public actual fun GdipDrawCurve2I(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve2I(graphics.toString(), pen.toString(), points.toString(), count, tension.toDouble()) as Int) else 0

public actual fun GdipDrawCurve3(graphics: Long, pen: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve3(graphics.toString(), pen.toString(), points.toString(), count, offset, numberofsegments, tension.toDouble()) as Int) else 0

public actual fun GdipDrawCurve3I(graphics: Long, pen: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve3I(graphics.toString(), pen.toString(), points.toString(), count, offset, numberofsegments, tension.toDouble()) as Int) else 0

public actual fun GdipDrawCurveI(graphics: Long, pen: Long, points: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawCurveI(graphics.toString(), pen.toString(), points.toString(), count) as Int) else 0

public actual fun GdipDrawDriverString(graphics: Long, text: Long, length: Int, font: Long, brush: Long, positions: Long, flags: Int, matrix: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawDriverString(graphics.toString(), text.toString(), length, font.toString(), brush.toString(), positions.toString(), flags, matrix.toString()) as Int) else 0

public actual fun GdipDrawEllipse(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawEllipse(graphics.toString(), pen.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) as Int) else 0

public actual fun GdipDrawEllipseI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawEllipseI(graphics.toString(), pen.toString(), x, y, width, height) as Int) else 0

public actual fun GdipDrawImage(graphics: Long, image: Long, x: Float, y: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawImage(graphics.toString(), image.toString(), x.toDouble(), y.toDouble()) as Int) else 0

public actual fun GdipDrawImageFX(graphics: Long, image: Long, source: Long, xform: Long, effect: Long, imageattributes: Long, srcunit: Unit): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawImageFX(graphics.toString(), image.toString(), source.toString(), xform.toString(), effect.toString(), imageattributes.toString(), srcunit) as Int) else 0

public actual fun GdipDrawImageI(graphics: Long, image: Long, x: Int, y: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawImageI(graphics.toString(), image.toString(), x, y) as Int) else 0

public actual fun GdipDrawImagePointRect(graphics: Long, image: Long, x: Float, y: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointRect(graphics.toString(), image.toString(), x.toDouble(), y.toDouble(), srcx.toDouble(), srcy.toDouble(), srcwidth.toDouble(), srcheight.toDouble(), srcunit) as Int) else 0

public actual fun GdipDrawImagePointRectI(graphics: Long, image: Long, x: Int, y: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointRectI(graphics.toString(), image.toString(), x, y, srcx, srcy, srcwidth, srcheight, srcunit) as Int) else 0

public actual fun GdipDrawImagePoints(graphics: Long, image: Long, dstpoints: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePoints(graphics.toString(), image.toString(), dstpoints.toString(), count) as Int) else 0

public actual fun GdipDrawImagePointsI(graphics: Long, image: Long, dstpoints: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointsI(graphics.toString(), image.toString(), dstpoints.toString(), count) as Int) else 0

public actual fun GdipDrawImagePointsRect(graphics: Long, image: Long, points: Long, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: Long, callback: Long, callbackdata: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointsRect(graphics.toString(), image.toString(), points.toString(), count, srcx.toDouble(), srcy.toDouble(), srcwidth.toDouble(), srcheight.toDouble(), srcunit, imageattributes.toString(), callback.toString(), callbackdata.toString()) as Int) else 0

public actual fun GdipDrawImagePointsRectI(graphics: Long, image: Long, points: Long, count: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: Long, callback: Long, callbackdata: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointsRectI(graphics.toString(), image.toString(), points.toString(), count, srcx, srcy, srcwidth, srcheight, srcunit, imageattributes.toString(), callback.toString(), callbackdata.toString()) as Int) else 0

public actual fun GdipDrawImageRect(graphics: Long, image: Long, x: Float, y: Float, width: Float, height: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawImageRect(graphics.toString(), image.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) as Int) else 0

public actual fun GdipDrawImageRectI(graphics: Long, image: Long, x: Int, y: Int, width: Int, height: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawImageRectI(graphics.toString(), image.toString(), x, y, width, height) as Int) else 0

public actual fun GdipDrawImageRectRect(graphics: Long, image: Long, dstx: Float, dsty: Float, dstwidth: Float, dstheight: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: Long, callback: Long, callbackdata: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawImageRectRect(graphics.toString(), image.toString(), dstx.toDouble(), dsty.toDouble(), dstwidth.toDouble(), dstheight.toDouble(), srcx.toDouble(), srcy.toDouble(), srcwidth.toDouble(), srcheight.toDouble(), srcunit, imageattributes.toString(), callback.toString(), callbackdata.toString()) as Int) else 0

public actual fun GdipDrawImageRectRectI(graphics: Long, image: Long, dstx: Int, dsty: Int, dstwidth: Int, dstheight: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: Long, callback: Long, callbackdata: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawImageRectRectI(graphics.toString(), image.toString(), dstx, dsty, dstwidth, dstheight, srcx, srcy, srcwidth, srcheight, srcunit, imageattributes.toString(), callback.toString(), callbackdata.toString()) as Int) else 0

public actual fun GdipDrawLine(graphics: Long, pen: Long, x1: Float, y1: Float, x2: Float, y2: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawLine(graphics.toString(), pen.toString(), x1.toDouble(), y1.toDouble(), x2.toDouble(), y2.toDouble()) as Int) else 0

public actual fun GdipDrawLineI(graphics: Long, pen: Long, x1: Int, y1: Int, x2: Int, y2: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawLineI(graphics.toString(), pen.toString(), x1, y1, x2, y2) as Int) else 0

public actual fun GdipDrawLines(graphics: Long, pen: Long, points: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawLines(graphics.toString(), pen.toString(), points.toString(), count) as Int) else 0

public actual fun GdipDrawLinesI(graphics: Long, pen: Long, points: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawLinesI(graphics.toString(), pen.toString(), points.toString(), count) as Int) else 0

public actual fun GdipDrawPath(graphics: Long, pen: Long, path: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawPath(graphics.toString(), pen.toString(), path.toString()) as Int) else 0

public actual fun GdipDrawPie(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawPie(graphics.toString(), pen.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), startangle.toDouble(), sweepangle.toDouble()) as Int) else 0

public actual fun GdipDrawPieI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawPieI(graphics.toString(), pen.toString(), x, y, width, height, startangle.toDouble(), sweepangle.toDouble()) as Int) else 0

public actual fun GdipDrawPolygon(graphics: Long, pen: Long, points: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawPolygon(graphics.toString(), pen.toString(), points.toString(), count) as Int) else 0

public actual fun GdipDrawPolygonI(graphics: Long, pen: Long, points: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawPolygonI(graphics.toString(), pen.toString(), points.toString(), count) as Int) else 0

public actual fun GdipDrawRectangle(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawRectangle(graphics.toString(), pen.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) as Int) else 0

public actual fun GdipDrawRectangleI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawRectangleI(graphics.toString(), pen.toString(), x, y, width, height) as Int) else 0

public actual fun GdipDrawRectangles(graphics: Long, pen: Long, rects: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawRectangles(graphics.toString(), pen.toString(), rects.toString(), count) as Int) else 0

public actual fun GdipDrawRectanglesI(graphics: Long, pen: Long, rects: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawRectanglesI(graphics.toString(), pen.toString(), rects.toString(), count) as Int) else 0

public actual fun GdipDrawString(graphics: Long, string: PCWSTR, length: Int, font: Long, layoutrect: Long, stringformat: Long, brush: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipDrawString(graphics.toString(), string.toString(), length, font.toString(), layoutrect.toString(), stringformat.toString(), brush.toString()) as Int) else 0

public actual fun GdipEmfToWmfBits(hemf: HENHMETAFILE, cbdata16: UInt, pdata16: Long, imapmode: Int, eflags: Int): UInt =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipEmfToWmfBits(hemf.toString(), cbdata16.toInt(), pdata16.toString(), imapmode, eflags) as Int).toUInt() else 0u

public actual fun GdipEndContainer(graphics: Long, state: UInt): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipEndContainer(graphics.toString(), state.toInt()) as Int) else 0

public actual fun GdipEnumerateMetafileDestPoint(graphics: Long, metafile: Long, destpoint: Long, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestPoint(graphics.toString(), metafile.toString(), destpoint.toString(), callback.toString(), callbackdata.toString(), imageattributes.toString()) as Int) else 0

public actual fun GdipEnumerateMetafileDestPointI(graphics: Long, metafile: Long, destpoint: Long, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestPointI(graphics.toString(), metafile.toString(), destpoint.toString(), callback.toString(), callbackdata.toString(), imageattributes.toString()) as Int) else 0

public actual fun GdipEnumerateMetafileDestPoints(graphics: Long, metafile: Long, destpoints: Long, count: Int, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestPoints(graphics.toString(), metafile.toString(), destpoints.toString(), count, callback.toString(), callbackdata.toString(), imageattributes.toString()) as Int) else 0

public actual fun GdipEnumerateMetafileDestPointsI(graphics: Long, metafile: Long, destpoints: Long, count: Int, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestPointsI(graphics.toString(), metafile.toString(), destpoints.toString(), count, callback.toString(), callbackdata.toString(), imageattributes.toString()) as Int) else 0

public actual fun GdipEnumerateMetafileDestRect(graphics: Long, metafile: Long, destrect: Long, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestRect(graphics.toString(), metafile.toString(), destrect.toString(), callback.toString(), callbackdata.toString(), imageattributes.toString()) as Int) else 0

public actual fun GdipEnumerateMetafileDestRectI(graphics: Long, metafile: Long, destrect: Long, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestRectI(graphics.toString(), metafile.toString(), destrect.toString(), callback.toString(), callbackdata.toString(), imageattributes.toString()) as Int) else 0

public actual fun GdipEnumerateMetafileSrcRectDestPoint(graphics: Long, metafile: Long, destpoint: Long, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestPoint(graphics.toString(), metafile.toString(), destpoint.toString(), srcrect.toString(), srcunit, callback.toString(), callbackdata.toString(), imageattributes.toString()) as Int) else 0

public actual fun GdipEnumerateMetafileSrcRectDestPointI(graphics: Long, metafile: Long, destpoint: Long, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestPointI(graphics.toString(), metafile.toString(), destpoint.toString(), srcrect.toString(), srcunit, callback.toString(), callbackdata.toString(), imageattributes.toString()) as Int) else 0

public actual fun GdipEnumerateMetafileSrcRectDestPoints(graphics: Long, metafile: Long, destpoints: Long, count: Int, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestPoints(graphics.toString(), metafile.toString(), destpoints.toString(), count, srcrect.toString(), srcunit, callback.toString(), callbackdata.toString(), imageattributes.toString()) as Int) else 0

public actual fun GdipEnumerateMetafileSrcRectDestPointsI(graphics: Long, metafile: Long, destpoints: Long, count: Int, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestPointsI(graphics.toString(), metafile.toString(), destpoints.toString(), count, srcrect.toString(), srcunit, callback.toString(), callbackdata.toString(), imageattributes.toString()) as Int) else 0

public actual fun GdipEnumerateMetafileSrcRectDestRect(graphics: Long, metafile: Long, destrect: Long, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestRect(graphics.toString(), metafile.toString(), destrect.toString(), srcrect.toString(), srcunit, callback.toString(), callbackdata.toString(), imageattributes.toString()) as Int) else 0

public actual fun GdipEnumerateMetafileSrcRectDestRectI(graphics: Long, metafile: Long, destrect: Long, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestRectI(graphics.toString(), metafile.toString(), destrect.toString(), srcrect.toString(), srcunit, callback.toString(), callbackdata.toString(), imageattributes.toString()) as Int) else 0

public actual fun GdipFillClosedCurve(graphics: Long, brush: Long, points: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipFillClosedCurve(graphics.toString(), brush.toString(), points.toString(), count) as Int) else 0

public actual fun GdipFillClosedCurve2(graphics: Long, brush: Long, points: Long, count: Int, tension: Float, fillmode: FillMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipFillClosedCurve2(graphics.toString(), brush.toString(), points.toString(), count, tension.toDouble(), fillmode) as Int) else 0

public actual fun GdipFillClosedCurve2I(graphics: Long, brush: Long, points: Long, count: Int, tension: Float, fillmode: FillMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipFillClosedCurve2I(graphics.toString(), brush.toString(), points.toString(), count, tension.toDouble(), fillmode) as Int) else 0

public actual fun GdipFillClosedCurveI(graphics: Long, brush: Long, points: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipFillClosedCurveI(graphics.toString(), brush.toString(), points.toString(), count) as Int) else 0

public actual fun GdipFillEllipse(graphics: Long, brush: Long, x: Float, y: Float, width: Float, height: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipFillEllipse(graphics.toString(), brush.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) as Int) else 0

public actual fun GdipFillEllipseI(graphics: Long, brush: Long, x: Int, y: Int, width: Int, height: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipFillEllipseI(graphics.toString(), brush.toString(), x, y, width, height) as Int) else 0

public actual fun GdipFillPath(graphics: Long, brush: Long, path: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipFillPath(graphics.toString(), brush.toString(), path.toString()) as Int) else 0

public actual fun GdipFillPie(graphics: Long, brush: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipFillPie(graphics.toString(), brush.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), startangle.toDouble(), sweepangle.toDouble()) as Int) else 0

public actual fun GdipFillPieI(graphics: Long, brush: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipFillPieI(graphics.toString(), brush.toString(), x, y, width, height, startangle.toDouble(), sweepangle.toDouble()) as Int) else 0

public actual fun GdipFillPolygon(graphics: Long, brush: Long, points: Long, count: Int, fillmode: FillMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipFillPolygon(graphics.toString(), brush.toString(), points.toString(), count, fillmode) as Int) else 0

public actual fun GdipFillPolygon2(graphics: Long, brush: Long, points: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipFillPolygon2(graphics.toString(), brush.toString(), points.toString(), count) as Int) else 0

public actual fun GdipFillPolygon2I(graphics: Long, brush: Long, points: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipFillPolygon2I(graphics.toString(), brush.toString(), points.toString(), count) as Int) else 0

public actual fun GdipFillPolygonI(graphics: Long, brush: Long, points: Long, count: Int, fillmode: FillMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipFillPolygonI(graphics.toString(), brush.toString(), points.toString(), count, fillmode) as Int) else 0

public actual fun GdipFillRectangle(graphics: Long, brush: Long, x: Float, y: Float, width: Float, height: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipFillRectangle(graphics.toString(), brush.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble()) as Int) else 0

public actual fun GdipFillRectangleI(graphics: Long, brush: Long, x: Int, y: Int, width: Int, height: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipFillRectangleI(graphics.toString(), brush.toString(), x, y, width, height) as Int) else 0

public actual fun GdipFillRectangles(graphics: Long, brush: Long, rects: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipFillRectangles(graphics.toString(), brush.toString(), rects.toString(), count) as Int) else 0

public actual fun GdipFillRectanglesI(graphics: Long, brush: Long, rects: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipFillRectanglesI(graphics.toString(), brush.toString(), rects.toString(), count) as Int) else 0

public actual fun GdipFillRegion(graphics: Long, brush: Long, region: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipFillRegion(graphics.toString(), brush.toString(), region.toString()) as Int) else 0

public actual fun GdipFindFirstImageItem(image: Long, item: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipFindFirstImageItem(image.toString(), item.toString()) as Int) else 0

public actual fun GdipFindNextImageItem(image: Long, item: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipFindNextImageItem(image.toString(), item.toString()) as Int) else 0

public actual fun GdipFlattenPath(path: Long, matrix: Long, flatness: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipFlattenPath(path.toString(), matrix.toString(), flatness.toDouble()) as Int) else 0

public actual fun GdipFlush(graphics: Long, intention: FlushIntention): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipFlush(graphics.toString(), intention) as Int) else 0

public actual fun GdipFree(ptr: Long) {
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) {
        _windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipFree(ptr.toString())
    }
}

public actual fun GdipGetAdjustableArrowCapFillState(cap: Long, fillstate: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetAdjustableArrowCapFillState(cap.toString(), fillstate.toString()) as Int) else 0

public actual fun GdipGetAdjustableArrowCapHeight(cap: Long, height: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetAdjustableArrowCapHeight(cap.toString(), height.toString()) as Int) else 0

public actual fun GdipGetAdjustableArrowCapMiddleInset(cap: Long, middleinset: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetAdjustableArrowCapMiddleInset(cap.toString(), middleinset.toString()) as Int) else 0

public actual fun GdipGetAdjustableArrowCapWidth(cap: Long, width: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetAdjustableArrowCapWidth(cap.toString(), width.toString()) as Int) else 0

public actual fun GdipGetAllPropertyItems(image: Long, totalbuffersize: UInt, numproperties: UInt, allitems: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetAllPropertyItems(image.toString(), totalbuffersize.toInt(), numproperties.toInt(), allitems.toString()) as Int) else 0

public actual fun GdipGetBrushType(brush: Long, type: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetBrushType(brush.toString(), type.toString()) as Int) else 0

public actual fun GdipGetCellAscent(family: Long, style: Int, cellascent: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetCellAscent(family.toString(), style, cellascent.toString()) as Int) else 0

public actual fun GdipGetCellDescent(family: Long, style: Int, celldescent: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetCellDescent(family.toString(), style, celldescent.toString()) as Int) else 0

public actual fun GdipGetClip(graphics: Long, region: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetClip(graphics.toString(), region.toString()) as Int) else 0

public actual fun GdipGetClipBounds(graphics: Long, rect: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetClipBounds(graphics.toString(), rect.toString()) as Int) else 0

public actual fun GdipGetClipBoundsI(graphics: Long, rect: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetClipBoundsI(graphics.toString(), rect.toString()) as Int) else 0

public actual fun GdipGetCompositingMode(graphics: Long, compositingmode: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetCompositingMode(graphics.toString(), compositingmode.toString()) as Int) else 0

public actual fun GdipGetCompositingQuality(graphics: Long, compositingquality: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetCompositingQuality(graphics.toString(), compositingquality.toString()) as Int) else 0

public actual fun GdipGetCustomLineCapBaseCap(customcap: Long, basecap: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapBaseCap(customcap.toString(), basecap.toString()) as Int) else 0

public actual fun GdipGetCustomLineCapBaseInset(customcap: Long, inset: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapBaseInset(customcap.toString(), inset.toString()) as Int) else 0

public actual fun GdipGetCustomLineCapStrokeCaps(customcap: Long, startcap: Long, endcap: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapStrokeCaps(customcap.toString(), startcap.toString(), endcap.toString()) as Int) else 0

public actual fun GdipGetCustomLineCapStrokeJoin(customcap: Long, linejoin: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapStrokeJoin(customcap.toString(), linejoin.toString()) as Int) else 0

public actual fun GdipGetCustomLineCapType(customcap: Long, captype: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapType(customcap.toString(), captype.toString()) as Int) else 0

public actual fun GdipGetCustomLineCapWidthScale(customcap: Long, widthscale: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapWidthScale(customcap.toString(), widthscale.toString()) as Int) else 0

public actual fun GdipGetDC(graphics: Long, hdc: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetDC(graphics.toString(), hdc.toString()) as Int) else 0

public actual fun GdipGetDpiX(graphics: Long, dpi: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetDpiX(graphics.toString(), dpi.toString()) as Int) else 0

public actual fun GdipGetDpiY(graphics: Long, dpi: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetDpiY(graphics.toString(), dpi.toString()) as Int) else 0

public actual fun GdipGetEffectParameterSize(effect: Long, size: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetEffectParameterSize(effect.toString(), size.toString()) as Int) else 0

public actual fun GdipGetEffectParameters(effect: Long, size: Long, params: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetEffectParameters(effect.toString(), size.toString(), params.toString()) as Int) else 0

public actual fun GdipGetEmHeight(family: Long, style: Int, emheight: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetEmHeight(family.toString(), style, emheight.toString()) as Int) else 0

public actual fun GdipGetEncoderParameterList(image: Long, clsidencoder: Long, size: UInt, buffer: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetEncoderParameterList(image.toString(), clsidencoder.toString(), size.toInt(), buffer.toString()) as Int) else 0

public actual fun GdipGetEncoderParameterListSize(image: Long, clsidencoder: Long, size: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetEncoderParameterListSize(image.toString(), clsidencoder.toString(), size.toString()) as Int) else 0

public actual fun GdipGetFamily(font: Long, family: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetFamily(font.toString(), family.toString()) as Int) else 0

public actual fun GdipGetFamilyName(family: Long, name: PWSTR, language: UShort): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetFamilyName(family.toString(), name.toString(), language.toInt()) as Int) else 0

public actual fun GdipGetFontCollectionFamilyCount(fontcollection: Long, numfound: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetFontCollectionFamilyCount(fontcollection.toString(), numfound.toString()) as Int) else 0

public actual fun GdipGetFontCollectionFamilyList(fontcollection: Long, numsought: Int, gpfamilies: Long, numfound: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetFontCollectionFamilyList(fontcollection.toString(), numsought, gpfamilies.toString(), numfound.toString()) as Int) else 0

public actual fun GdipGetFontHeight(font: Long, graphics: Long, height: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetFontHeight(font.toString(), graphics.toString(), height.toString()) as Int) else 0

public actual fun GdipGetFontHeightGivenDPI(font: Long, dpi: Float, height: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetFontHeightGivenDPI(font.toString(), dpi.toDouble(), height.toString()) as Int) else 0

public actual fun GdipGetFontSize(font: Long, size: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetFontSize(font.toString(), size.toString()) as Int) else 0

public actual fun GdipGetFontStyle(font: Long, style: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetFontStyle(font.toString(), style.toString()) as Int) else 0

public actual fun GdipGetFontUnit(font: Long, unit: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetFontUnit(font.toString(), unit.toString()) as Int) else 0

public actual fun GdipGetGenericFontFamilyMonospace(nativefamily: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetGenericFontFamilyMonospace(nativefamily.toString()) as Int) else 0

public actual fun GdipGetGenericFontFamilySansSerif(nativefamily: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetGenericFontFamilySansSerif(nativefamily.toString()) as Int) else 0

public actual fun GdipGetGenericFontFamilySerif(nativefamily: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetGenericFontFamilySerif(nativefamily.toString()) as Int) else 0

public actual fun GdipGetHatchBackgroundColor(brush: Long, backcol: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetHatchBackgroundColor(brush.toString(), backcol.toString()) as Int) else 0

public actual fun GdipGetHatchForegroundColor(brush: Long, forecol: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetHatchForegroundColor(brush.toString(), forecol.toString()) as Int) else 0

public actual fun GdipGetHatchStyle(brush: Long, hatchstyle: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetHatchStyle(brush.toString(), hatchstyle.toString()) as Int) else 0

public actual fun GdipGetHemfFromMetafile(metafile: Long, hemf: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetHemfFromMetafile(metafile.toString(), hemf.toString()) as Int) else 0

public actual fun GdipGetImageAttributesAdjustedPalette(imageattr: Long, colorpalette: Long, coloradjusttype: ColorAdjustType): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetImageAttributesAdjustedPalette(imageattr.toString(), colorpalette.toString(), coloradjusttype) as Int) else 0

public actual fun GdipGetImageBounds(image: Long, srcrect: Long, srcunit: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetImageBounds(image.toString(), srcrect.toString(), srcunit.toString()) as Int) else 0

public actual fun GdipGetImageDecoders(numdecoders: UInt, size: UInt, decoders: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetImageDecoders(numdecoders.toInt(), size.toInt(), decoders.toString()) as Int) else 0

public actual fun GdipGetImageDecodersSize(numdecoders: Long, size: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetImageDecodersSize(numdecoders.toString(), size.toString()) as Int) else 0

public actual fun GdipGetImageDimension(image: Long, width: Long, height: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetImageDimension(image.toString(), width.toString(), height.toString()) as Int) else 0

public actual fun GdipGetImageEncoders(numencoders: UInt, size: UInt, encoders: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetImageEncoders(numencoders.toInt(), size.toInt(), encoders.toString()) as Int) else 0

public actual fun GdipGetImageEncodersSize(numencoders: Long, size: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetImageEncodersSize(numencoders.toString(), size.toString()) as Int) else 0

public actual fun GdipGetImageFlags(image: Long, flags: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetImageFlags(image.toString(), flags.toString()) as Int) else 0

public actual fun GdipGetImageGraphicsContext(image: Long, graphics: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetImageGraphicsContext(image.toString(), graphics.toString()) as Int) else 0

public actual fun GdipGetImageHeight(image: Long, height: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetImageHeight(image.toString(), height.toString()) as Int) else 0

public actual fun GdipGetImageHorizontalResolution(image: Long, resolution: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetImageHorizontalResolution(image.toString(), resolution.toString()) as Int) else 0

public actual fun GdipGetImageItemData(image: Long, item: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetImageItemData(image.toString(), item.toString()) as Int) else 0

public actual fun GdipGetImagePalette(image: Long, palette: Long, size: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetImagePalette(image.toString(), palette.toString(), size) as Int) else 0

public actual fun GdipGetImagePaletteSize(image: Long, size: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetImagePaletteSize(image.toString(), size.toString()) as Int) else 0

public actual fun GdipGetImagePixelFormat(image: Long, format: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetImagePixelFormat(image.toString(), format.toString()) as Int) else 0

public actual fun GdipGetImageRawFormat(image: Long, format: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetImageRawFormat(image.toString(), format.toString()) as Int) else 0

public actual fun GdipGetImageThumbnail(image: Long, thumbwidth: UInt, thumbheight: UInt, thumbimage: Long, callback: Long, callbackdata: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetImageThumbnail(image.toString(), thumbwidth.toInt(), thumbheight.toInt(), thumbimage.toString(), callback.toString(), callbackdata.toString()) as Int) else 0

public actual fun GdipGetImageType(image: Long, type: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetImageType(image.toString(), type.toString()) as Int) else 0

public actual fun GdipGetImageVerticalResolution(image: Long, resolution: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetImageVerticalResolution(image.toString(), resolution.toString()) as Int) else 0

public actual fun GdipGetImageWidth(image: Long, width: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetImageWidth(image.toString(), width.toString()) as Int) else 0

public actual fun GdipGetInterpolationMode(graphics: Long, interpolationmode: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetInterpolationMode(graphics.toString(), interpolationmode.toString()) as Int) else 0

public actual fun GdipGetLineBlend(brush: Long, blend: Long, positions: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetLineBlend(brush.toString(), blend.toString(), positions.toString(), count) as Int) else 0

public actual fun GdipGetLineBlendCount(brush: Long, count: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetLineBlendCount(brush.toString(), count.toString()) as Int) else 0

public actual fun GdipGetLineColors(brush: Long, colors: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetLineColors(brush.toString(), colors.toString()) as Int) else 0

public actual fun GdipGetLineGammaCorrection(brush: Long, usegammacorrection: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetLineGammaCorrection(brush.toString(), usegammacorrection.toString()) as Int) else 0

public actual fun GdipGetLinePresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetLinePresetBlend(brush.toString(), blend.toString(), positions.toString(), count) as Int) else 0

public actual fun GdipGetLinePresetBlendCount(brush: Long, count: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetLinePresetBlendCount(brush.toString(), count.toString()) as Int) else 0

public actual fun GdipGetLineRect(brush: Long, rect: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetLineRect(brush.toString(), rect.toString()) as Int) else 0

public actual fun GdipGetLineRectI(brush: Long, rect: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetLineRectI(brush.toString(), rect.toString()) as Int) else 0

public actual fun GdipGetLineSpacing(family: Long, style: Int, linespacing: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetLineSpacing(family.toString(), style, linespacing.toString()) as Int) else 0

public actual fun GdipGetLineTransform(brush: Long, matrix: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetLineTransform(brush.toString(), matrix.toString()) as Int) else 0

public actual fun GdipGetLineWrapMode(brush: Long, wrapmode: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetLineWrapMode(brush.toString(), wrapmode.toString()) as Int) else 0

public actual fun GdipGetLogFontA(font: Long, graphics: Long, logfonta: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetLogFontA(font.toString(), graphics.toString(), logfonta.toString()) as Int) else 0

public actual fun GdipGetLogFontW(font: Long, graphics: Long, logfontw: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetLogFontW(font.toString(), graphics.toString(), logfontw.toString()) as Int) else 0

public actual fun GdipGetMatrixElements(matrix: Long, matrixout: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetMatrixElements(matrix.toString(), matrixout.toString()) as Int) else 0

public actual fun GdipGetMetafileDownLevelRasterizationLimit(metafile: Long, metafilerasterizationlimitdpi: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileDownLevelRasterizationLimit(metafile.toString(), metafilerasterizationlimitdpi.toString()) as Int) else 0

public actual fun GdipGetMetafileHeaderFromEmf(hemf: HENHMETAFILE, header: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromEmf(hemf.toString(), header.toString()) as Int) else 0

public actual fun GdipGetMetafileHeaderFromFile(filename: PCWSTR, header: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromFile(filename.toString(), header.toString()) as Int) else 0

public actual fun GdipGetMetafileHeaderFromMetafile(metafile: Long, header: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromMetafile(metafile.toString(), header.toString()) as Int) else 0

public actual fun GdipGetMetafileHeaderFromStream(stream: Long, header: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromStream(stream.toString(), header.toString()) as Int) else 0

public actual fun GdipGetMetafileHeaderFromWmf(hwmf: HMETAFILE, wmfplaceablefileheader: Long, header: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromWmf(hwmf.toString(), wmfplaceablefileheader.toString(), header.toString()) as Int) else 0

public actual fun GdipGetNearestColor(graphics: Long, argb: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetNearestColor(graphics.toString(), argb.toString()) as Int) else 0

public actual fun GdipGetPageScale(graphics: Long, scale: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPageScale(graphics.toString(), scale.toString()) as Int) else 0

public actual fun GdipGetPageUnit(graphics: Long, unit: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPageUnit(graphics.toString(), unit.toString()) as Int) else 0

public actual fun GdipGetPathData(path: Long, pathdata: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPathData(path.toString(), pathdata.toString()) as Int) else 0

public actual fun GdipGetPathFillMode(path: Long, fillmode: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPathFillMode(path.toString(), fillmode.toString()) as Int) else 0

public actual fun GdipGetPathGradientBlend(brush: Long, blend: Long, positions: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientBlend(brush.toString(), blend.toString(), positions.toString(), count) as Int) else 0

public actual fun GdipGetPathGradientBlendCount(brush: Long, count: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientBlendCount(brush.toString(), count.toString()) as Int) else 0

public actual fun GdipGetPathGradientCenterColor(brush: Long, colors: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientCenterColor(brush.toString(), colors.toString()) as Int) else 0

public actual fun GdipGetPathGradientCenterPoint(brush: Long, points: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientCenterPoint(brush.toString(), points.toString()) as Int) else 0

public actual fun GdipGetPathGradientCenterPointI(brush: Long, points: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientCenterPointI(brush.toString(), points.toString()) as Int) else 0

public actual fun GdipGetPathGradientFocusScales(brush: Long, xscale: Long, yscale: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientFocusScales(brush.toString(), xscale.toString(), yscale.toString()) as Int) else 0

public actual fun GdipGetPathGradientGammaCorrection(brush: Long, usegammacorrection: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientGammaCorrection(brush.toString(), usegammacorrection.toString()) as Int) else 0

public actual fun GdipGetPathGradientPath(brush: Long, path: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientPath(brush.toString(), path.toString()) as Int) else 0

public actual fun GdipGetPathGradientPointCount(brush: Long, count: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientPointCount(brush.toString(), count.toString()) as Int) else 0

public actual fun GdipGetPathGradientPresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientPresetBlend(brush.toString(), blend.toString(), positions.toString(), count) as Int) else 0

public actual fun GdipGetPathGradientPresetBlendCount(brush: Long, count: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientPresetBlendCount(brush.toString(), count.toString()) as Int) else 0

public actual fun GdipGetPathGradientRect(brush: Long, rect: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientRect(brush.toString(), rect.toString()) as Int) else 0

public actual fun GdipGetPathGradientRectI(brush: Long, rect: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientRectI(brush.toString(), rect.toString()) as Int) else 0

public actual fun GdipGetPathGradientSurroundColorCount(brush: Long, count: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientSurroundColorCount(brush.toString(), count.toString()) as Int) else 0

public actual fun GdipGetPathGradientSurroundColorsWithCount(brush: Long, color: Long, count: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientSurroundColorsWithCount(brush.toString(), color.toString(), count.toString()) as Int) else 0

public actual fun GdipGetPathGradientTransform(brush: Long, matrix: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientTransform(brush.toString(), matrix.toString()) as Int) else 0

public actual fun GdipGetPathGradientWrapMode(brush: Long, wrapmode: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientWrapMode(brush.toString(), wrapmode.toString()) as Int) else 0

public actual fun GdipGetPathLastPoint(path: Long, lastpoint: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPathLastPoint(path.toString(), lastpoint.toString()) as Int) else 0

public actual fun GdipGetPathPoints(param0: Long, points: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPathPoints(param0.toString(), points.toString(), count) as Int) else 0

public actual fun GdipGetPathPointsI(param0: Long, points: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPathPointsI(param0.toString(), points.toString(), count) as Int) else 0

public actual fun GdipGetPathTypes(path: Long, types: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPathTypes(path.toString(), types.toString(), count) as Int) else 0

public actual fun GdipGetPathWorldBounds(path: Long, bounds: Long, matrix: Long, pen: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPathWorldBounds(path.toString(), bounds.toString(), matrix.toString(), pen.toString()) as Int) else 0

public actual fun GdipGetPathWorldBoundsI(path: Long, bounds: Long, matrix: Long, pen: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPathWorldBoundsI(path.toString(), bounds.toString(), matrix.toString(), pen.toString()) as Int) else 0

public actual fun GdipGetPenBrushFill(pen: Long, brush: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPenBrushFill(pen.toString(), brush.toString()) as Int) else 0

public actual fun GdipGetPenColor(pen: Long, argb: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPenColor(pen.toString(), argb.toString()) as Int) else 0

public actual fun GdipGetPenCompoundArray(pen: Long, dash: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPenCompoundArray(pen.toString(), dash.toString(), count) as Int) else 0

public actual fun GdipGetPenCompoundCount(pen: Long, count: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPenCompoundCount(pen.toString(), count.toString()) as Int) else 0

public actual fun GdipGetPenCustomEndCap(pen: Long, customcap: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPenCustomEndCap(pen.toString(), customcap.toString()) as Int) else 0

public actual fun GdipGetPenCustomStartCap(pen: Long, customcap: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPenCustomStartCap(pen.toString(), customcap.toString()) as Int) else 0

public actual fun GdipGetPenDashArray(pen: Long, dash: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashArray(pen.toString(), dash.toString(), count) as Int) else 0

public actual fun GdipGetPenDashCap197819(pen: Long, dashcap: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashCap197819(pen.toString(), dashcap.toString()) as Int) else 0

public actual fun GdipGetPenDashCount(pen: Long, count: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashCount(pen.toString(), count.toString()) as Int) else 0

public actual fun GdipGetPenDashOffset(pen: Long, offset: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashOffset(pen.toString(), offset.toString()) as Int) else 0

public actual fun GdipGetPenDashStyle(pen: Long, dashstyle: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashStyle(pen.toString(), dashstyle.toString()) as Int) else 0

public actual fun GdipGetPenEndCap(pen: Long, endcap: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPenEndCap(pen.toString(), endcap.toString()) as Int) else 0

public actual fun GdipGetPenFillType(pen: Long, type: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPenFillType(pen.toString(), type.toString()) as Int) else 0

public actual fun GdipGetPenLineJoin(pen: Long, linejoin: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPenLineJoin(pen.toString(), linejoin.toString()) as Int) else 0

public actual fun GdipGetPenMiterLimit(pen: Long, miterlimit: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPenMiterLimit(pen.toString(), miterlimit.toString()) as Int) else 0

public actual fun GdipGetPenMode(pen: Long, penmode: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPenMode(pen.toString(), penmode.toString()) as Int) else 0

public actual fun GdipGetPenStartCap(pen: Long, startcap: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPenStartCap(pen.toString(), startcap.toString()) as Int) else 0

public actual fun GdipGetPenTransform(pen: Long, matrix: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPenTransform(pen.toString(), matrix.toString()) as Int) else 0

public actual fun GdipGetPenUnit(pen: Long, unit: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPenUnit(pen.toString(), unit.toString()) as Int) else 0

public actual fun GdipGetPenWidth(pen: Long, width: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPenWidth(pen.toString(), width.toString()) as Int) else 0

public actual fun GdipGetPixelOffsetMode(graphics: Long, pixeloffsetmode: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPixelOffsetMode(graphics.toString(), pixeloffsetmode.toString()) as Int) else 0

public actual fun GdipGetPointCount(path: Long, count: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPointCount(path.toString(), count.toString()) as Int) else 0

public actual fun GdipGetPropertyCount(image: Long, numofproperty: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPropertyCount(image.toString(), numofproperty.toString()) as Int) else 0

public actual fun GdipGetPropertyIdList(image: Long, numofproperty: UInt, list: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPropertyIdList(image.toString(), numofproperty.toInt(), list.toString()) as Int) else 0

public actual fun GdipGetPropertyItem(image: Long, propid: UInt, propsize: UInt, buffer: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPropertyItem(image.toString(), propid.toInt(), propsize.toInt(), buffer.toString()) as Int) else 0

public actual fun GdipGetPropertyItemSize(image: Long, propid: UInt, size: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPropertyItemSize(image.toString(), propid.toInt(), size.toString()) as Int) else 0

public actual fun GdipGetPropertySize(image: Long, totalbuffersize: Long, numproperties: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetPropertySize(image.toString(), totalbuffersize.toString(), numproperties.toString()) as Int) else 0

public actual fun GdipGetRegionBounds(region: Long, graphics: Long, rect: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetRegionBounds(region.toString(), graphics.toString(), rect.toString()) as Int) else 0

public actual fun GdipGetRegionBoundsI(region: Long, graphics: Long, rect: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetRegionBoundsI(region.toString(), graphics.toString(), rect.toString()) as Int) else 0

public actual fun GdipGetRegionData(region: Long, buffer: Long, buffersize: UInt, sizefilled: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetRegionData(region.toString(), buffer.toString(), buffersize.toInt(), sizefilled.toString()) as Int) else 0

public actual fun GdipGetRegionDataSize(region: Long, buffersize: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetRegionDataSize(region.toString(), buffersize.toString()) as Int) else 0

public actual fun GdipGetRegionHRgn(region: Long, graphics: Long, hrgn: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetRegionHRgn(region.toString(), graphics.toString(), hrgn.toString()) as Int) else 0

public actual fun GdipGetRegionScans(region: Long, rects: Long, count: Long, matrix: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetRegionScans(region.toString(), rects.toString(), count.toString(), matrix.toString()) as Int) else 0

public actual fun GdipGetRegionScansCount(region: Long, count: Long, matrix: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetRegionScansCount(region.toString(), count.toString(), matrix.toString()) as Int) else 0

public actual fun GdipGetRegionScansI(region: Long, rects: Long, count: Long, matrix: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetRegionScansI(region.toString(), rects.toString(), count.toString(), matrix.toString()) as Int) else 0

public actual fun GdipGetRenderingOrigin(graphics: Long, x: Long, y: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetRenderingOrigin(graphics.toString(), x.toString(), y.toString()) as Int) else 0

public actual fun GdipGetSmoothingMode(graphics: Long, smoothingmode: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetSmoothingMode(graphics.toString(), smoothingmode.toString()) as Int) else 0

public actual fun GdipGetSolidFillColor(brush: Long, color: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetSolidFillColor(brush.toString(), color.toString()) as Int) else 0

public actual fun GdipGetStringFormatAlign(format: Long, align: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatAlign(format.toString(), align.toString()) as Int) else 0

public actual fun GdipGetStringFormatDigitSubstitution(format: Long, language: Long, substitute: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatDigitSubstitution(format.toString(), language.toString(), substitute.toString()) as Int) else 0

public actual fun GdipGetStringFormatFlags(format: Long, flags: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatFlags(format.toString(), flags.toString()) as Int) else 0

public actual fun GdipGetStringFormatHotkeyPrefix(format: Long, hotkeyprefix: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatHotkeyPrefix(format.toString(), hotkeyprefix.toString()) as Int) else 0

public actual fun GdipGetStringFormatLineAlign(format: Long, align: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatLineAlign(format.toString(), align.toString()) as Int) else 0

public actual fun GdipGetStringFormatMeasurableCharacterRangeCount(format: Long, count: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatMeasurableCharacterRangeCount(format.toString(), count.toString()) as Int) else 0

public actual fun GdipGetStringFormatTabStopCount(format: Long, count: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatTabStopCount(format.toString(), count.toString()) as Int) else 0

public actual fun GdipGetStringFormatTabStops(format: Long, count: Int, firsttaboffset: Long, tabstops: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatTabStops(format.toString(), count, firsttaboffset.toString(), tabstops.toString()) as Int) else 0

public actual fun GdipGetStringFormatTrimming(format: Long, trimming: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatTrimming(format.toString(), trimming.toString()) as Int) else 0

public actual fun GdipGetTextContrast(graphics: Long, contrast: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetTextContrast(graphics.toString(), contrast.toString()) as Int) else 0

public actual fun GdipGetTextRenderingHint(graphics: Long, mode: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetTextRenderingHint(graphics.toString(), mode.toString()) as Int) else 0

public actual fun GdipGetTextureImage(brush: Long, image: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetTextureImage(brush.toString(), image.toString()) as Int) else 0

public actual fun GdipGetTextureTransform(brush: Long, matrix: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetTextureTransform(brush.toString(), matrix.toString()) as Int) else 0

public actual fun GdipGetTextureWrapMode(brush: Long, wrapmode: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetTextureWrapMode(brush.toString(), wrapmode.toString()) as Int) else 0

public actual fun GdipGetVisibleClipBounds(graphics: Long, rect: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetVisibleClipBounds(graphics.toString(), rect.toString()) as Int) else 0

public actual fun GdipGetVisibleClipBoundsI(graphics: Long, rect: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetVisibleClipBoundsI(graphics.toString(), rect.toString()) as Int) else 0

public actual fun GdipGetWorldTransform(graphics: Long, matrix: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGetWorldTransform(graphics.toString(), matrix.toString()) as Int) else 0

public actual fun GdipGraphicsClear(graphics: Long, color: UInt): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGraphicsClear(graphics.toString(), color.toInt()) as Int) else 0

public actual fun GdipGraphicsSetAbort(pgraphics: Long, piabort: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipGraphicsSetAbort(pgraphics.toString(), piabort.toString()) as Int) else 0

public actual fun GdipImageForceValidation(image: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipImageForceValidation(image.toString()) as Int) else 0

public actual fun GdipImageGetFrameCount(image: Long, dimensionid: Long, count: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipImageGetFrameCount(image.toString(), dimensionid.toString(), count.toString()) as Int) else 0

public actual fun GdipImageGetFrameDimensionsCount(image: Long, count: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipImageGetFrameDimensionsCount(image.toString(), count.toString()) as Int) else 0

public actual fun GdipImageGetFrameDimensionsList(image: Long, dimensionids: Long, count: UInt): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipImageGetFrameDimensionsList(image.toString(), dimensionids.toString(), count.toInt()) as Int) else 0

public actual fun GdipImageRotateFlip(image: Long, rftype: RotateFlipType): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipImageRotateFlip(image.toString(), rftype) as Int) else 0

public actual fun GdipImageSelectActiveFrame(image: Long, dimensionid: Long, frameindex: UInt): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipImageSelectActiveFrame(image.toString(), dimensionid.toString(), frameindex.toInt()) as Int) else 0

public actual fun GdipImageSetAbort(pimage: Long, piabort: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipImageSetAbort(pimage.toString(), piabort.toString()) as Int) else 0

public actual fun GdipInitializePalette(palette: Long, palettetype: PaletteType, optimalcolors: Int, usetransparentcolor: BOOL, bitmap: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipInitializePalette(palette.toString(), palettetype, optimalcolors, usetransparentcolor, bitmap.toString()) as Int) else 0

public actual fun GdipInvertMatrix(matrix: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipInvertMatrix(matrix.toString()) as Int) else 0

public actual fun GdipIsClipEmpty(graphics: Long, result: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipIsClipEmpty(graphics.toString(), result.toString()) as Int) else 0

public actual fun GdipIsEmptyRegion(region: Long, graphics: Long, result: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipIsEmptyRegion(region.toString(), graphics.toString(), result.toString()) as Int) else 0

public actual fun GdipIsEqualRegion(region: Long, region2: Long, graphics: Long, result: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipIsEqualRegion(region.toString(), region2.toString(), graphics.toString(), result.toString()) as Int) else 0

public actual fun GdipIsInfiniteRegion(region: Long, graphics: Long, result: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipIsInfiniteRegion(region.toString(), graphics.toString(), result.toString()) as Int) else 0

public actual fun GdipIsMatrixEqual(matrix: Long, matrix2: Long, result: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipIsMatrixEqual(matrix.toString(), matrix2.toString(), result.toString()) as Int) else 0

public actual fun GdipIsMatrixIdentity(matrix: Long, result: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipIsMatrixIdentity(matrix.toString(), result.toString()) as Int) else 0

public actual fun GdipIsMatrixInvertible(matrix: Long, result: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipIsMatrixInvertible(matrix.toString(), result.toString()) as Int) else 0

public actual fun GdipIsOutlineVisiblePathPoint(path: Long, x: Float, y: Float, pen: Long, graphics: Long, result: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipIsOutlineVisiblePathPoint(path.toString(), x.toDouble(), y.toDouble(), pen.toString(), graphics.toString(), result.toString()) as Int) else 0

public actual fun GdipIsOutlineVisiblePathPointI(path: Long, x: Int, y: Int, pen: Long, graphics: Long, result: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipIsOutlineVisiblePathPointI(path.toString(), x, y, pen.toString(), graphics.toString(), result.toString()) as Int) else 0

public actual fun GdipIsStyleAvailable(family: Long, style: Int, isstyleavailable: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipIsStyleAvailable(family.toString(), style, isstyleavailable.toString()) as Int) else 0

public actual fun GdipIsVisibleClipEmpty(graphics: Long, result: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleClipEmpty(graphics.toString(), result.toString()) as Int) else 0

public actual fun GdipIsVisiblePathPoint(path: Long, x: Float, y: Float, graphics: Long, result: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipIsVisiblePathPoint(path.toString(), x.toDouble(), y.toDouble(), graphics.toString(), result.toString()) as Int) else 0

public actual fun GdipIsVisiblePathPointI(path: Long, x: Int, y: Int, graphics: Long, result: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipIsVisiblePathPointI(path.toString(), x, y, graphics.toString(), result.toString()) as Int) else 0

public actual fun GdipIsVisiblePoint(graphics: Long, x: Float, y: Float, result: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipIsVisiblePoint(graphics.toString(), x.toDouble(), y.toDouble(), result.toString()) as Int) else 0

public actual fun GdipIsVisiblePointI(graphics: Long, x: Int, y: Int, result: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipIsVisiblePointI(graphics.toString(), x, y, result.toString()) as Int) else 0

public actual fun GdipIsVisibleRect(graphics: Long, x: Float, y: Float, width: Float, height: Float, result: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRect(graphics.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), result.toString()) as Int) else 0

public actual fun GdipIsVisibleRectI(graphics: Long, x: Int, y: Int, width: Int, height: Int, result: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRectI(graphics.toString(), x, y, width, height, result.toString()) as Int) else 0

public actual fun GdipIsVisibleRegionPoint(region: Long, x: Float, y: Float, graphics: Long, result: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRegionPoint(region.toString(), x.toDouble(), y.toDouble(), graphics.toString(), result.toString()) as Int) else 0

public actual fun GdipIsVisibleRegionPointI(region: Long, x: Int, y: Int, graphics: Long, result: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRegionPointI(region.toString(), x, y, graphics.toString(), result.toString()) as Int) else 0

public actual fun GdipIsVisibleRegionRect(region: Long, x: Float, y: Float, width: Float, height: Float, graphics: Long, result: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRegionRect(region.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), graphics.toString(), result.toString()) as Int) else 0

public actual fun GdipIsVisibleRegionRectI(region: Long, x: Int, y: Int, width: Int, height: Int, graphics: Long, result: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRegionRectI(region.toString(), x, y, width, height, graphics.toString(), result.toString()) as Int) else 0

public actual fun GdipLoadImageFromFile(filename: PCWSTR, image: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipLoadImageFromFile(filename.toString(), image.toString()) as Int) else 0

public actual fun GdipLoadImageFromFileICM(filename: PCWSTR, image: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipLoadImageFromFileICM(filename.toString(), image.toString()) as Int) else 0

public actual fun GdipLoadImageFromStream(stream: Long, image: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipLoadImageFromStream(stream.toString(), image.toString()) as Int) else 0

public actual fun GdipLoadImageFromStreamICM(stream: Long, image: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipLoadImageFromStreamICM(stream.toString(), image.toString()) as Int) else 0

public actual fun GdipMeasureCharacterRanges(graphics: Long, string: PCWSTR, length: Int, font: Long, layoutrect: Long, stringformat: Long, regioncount: Int, regions: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipMeasureCharacterRanges(graphics.toString(), string.toString(), length, font.toString(), layoutrect.toString(), stringformat.toString(), regioncount, regions.toString()) as Int) else 0

public actual fun GdipMeasureDriverString(graphics: Long, text: Long, length: Int, font: Long, positions: Long, flags: Int, matrix: Long, boundingbox: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipMeasureDriverString(graphics.toString(), text.toString(), length, font.toString(), positions.toString(), flags, matrix.toString(), boundingbox.toString()) as Int) else 0

public actual fun GdipMeasureString(graphics: Long, string: PCWSTR, length: Int, font: Long, layoutrect: Long, stringformat: Long, boundingbox: Long, codepointsfitted: Long, linesfilled: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipMeasureString(graphics.toString(), string.toString(), length, font.toString(), layoutrect.toString(), stringformat.toString(), boundingbox.toString(), codepointsfitted.toString(), linesfilled.toString()) as Int) else 0

public actual fun GdipMultiplyLineTransform(brush: Long, matrix: Long, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipMultiplyLineTransform(brush.toString(), matrix.toString(), order) as Int) else 0

public actual fun GdipMultiplyMatrix(matrix: Long, matrix2: Long, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipMultiplyMatrix(matrix.toString(), matrix2.toString(), order) as Int) else 0

public actual fun GdipMultiplyPathGradientTransform(brush: Long, matrix: Long, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipMultiplyPathGradientTransform(brush.toString(), matrix.toString(), order) as Int) else 0

public actual fun GdipMultiplyPenTransform(pen: Long, matrix: Long, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipMultiplyPenTransform(pen.toString(), matrix.toString(), order) as Int) else 0

public actual fun GdipMultiplyTextureTransform(brush: Long, matrix: Long, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipMultiplyTextureTransform(brush.toString(), matrix.toString(), order) as Int) else 0

public actual fun GdipMultiplyWorldTransform(graphics: Long, matrix: Long, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipMultiplyWorldTransform(graphics.toString(), matrix.toString(), order) as Int) else 0

public actual fun GdipNewInstalledFontCollection(fontcollection: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipNewInstalledFontCollection(fontcollection.toString()) as Int) else 0

public actual fun GdipNewPrivateFontCollection(fontcollection: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipNewPrivateFontCollection(fontcollection.toString()) as Int) else 0

public actual fun GdipPathIterCopyData(iterator: Long, resultcount: Long, points: Long, types: Long, startindex: Int, endindex: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipPathIterCopyData(iterator.toString(), resultcount.toString(), points.toString(), types.toString(), startindex, endindex) as Int) else 0

public actual fun GdipPathIterEnumerate(iterator: Long, resultcount: Long, points: Long, types: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipPathIterEnumerate(iterator.toString(), resultcount.toString(), points.toString(), types.toString(), count) as Int) else 0

public actual fun GdipPathIterGetCount(iterator: Long, count: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipPathIterGetCount(iterator.toString(), count.toString()) as Int) else 0

public actual fun GdipPathIterGetSubpathCount(iterator: Long, count: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipPathIterGetSubpathCount(iterator.toString(), count.toString()) as Int) else 0

public actual fun GdipPathIterHasCurve(iterator: Long, hascurve: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipPathIterHasCurve(iterator.toString(), hascurve.toString()) as Int) else 0

public actual fun GdipPathIterIsValid(iterator: Long, valid: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipPathIterIsValid(iterator.toString(), valid.toString()) as Int) else 0

public actual fun GdipPathIterNextMarker(iterator: Long, resultcount: Long, startindex: Long, endindex: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextMarker(iterator.toString(), resultcount.toString(), startindex.toString(), endindex.toString()) as Int) else 0

public actual fun GdipPathIterNextMarkerPath(iterator: Long, resultcount: Long, path: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextMarkerPath(iterator.toString(), resultcount.toString(), path.toString()) as Int) else 0

public actual fun GdipPathIterNextPathType(iterator: Long, resultcount: Long, pathtype: Long, startindex: Long, endindex: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextPathType(iterator.toString(), resultcount.toString(), pathtype.toString(), startindex.toString(), endindex.toString()) as Int) else 0

public actual fun GdipPathIterNextSubpath(iterator: Long, resultcount: Long, startindex: Long, endindex: Long, isclosed: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextSubpath(iterator.toString(), resultcount.toString(), startindex.toString(), endindex.toString(), isclosed.toString()) as Int) else 0

public actual fun GdipPathIterNextSubpathPath(iterator: Long, resultcount: Long, path: Long, isclosed: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextSubpathPath(iterator.toString(), resultcount.toString(), path.toString(), isclosed.toString()) as Int) else 0

public actual fun GdipPathIterRewind(iterator: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipPathIterRewind(iterator.toString()) as Int) else 0

public actual fun GdipPlayMetafileRecord(metafile: Long, recordtype: EmfPlusRecordType, flags: UInt, datasize: UInt, data: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipPlayMetafileRecord(metafile.toString(), recordtype, flags.toInt(), datasize.toInt(), data.toString()) as Int) else 0

public actual fun GdipPrivateAddFontFile(fontcollection: Long, filename: PCWSTR): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipPrivateAddFontFile(fontcollection.toString(), filename.toString()) as Int) else 0

public actual fun GdipPrivateAddMemoryFont(fontcollection: Long, memory: Long, length: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipPrivateAddMemoryFont(fontcollection.toString(), memory.toString(), length) as Int) else 0

public actual fun GdipRecordMetafile(referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafile(referencehdc.toString(), type, framerect.toString(), frameunit, description.toString(), metafile.toString()) as Int) else 0

public actual fun GdipRecordMetafileFileName(filename: PCWSTR, referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileFileName(filename.toString(), referencehdc.toString(), type, framerect.toString(), frameunit, description.toString(), metafile.toString()) as Int) else 0

public actual fun GdipRecordMetafileFileNameI(filename: PCWSTR, referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileFileNameI(filename.toString(), referencehdc.toString(), type, framerect.toString(), frameunit, description.toString(), metafile.toString()) as Int) else 0

public actual fun GdipRecordMetafileI(referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileI(referencehdc.toString(), type, framerect.toString(), frameunit, description.toString(), metafile.toString()) as Int) else 0

public actual fun GdipRecordMetafileStream(stream: Long, referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileStream(stream.toString(), referencehdc.toString(), type, framerect.toString(), frameunit, description.toString(), metafile.toString()) as Int) else 0

public actual fun GdipRecordMetafileStreamI(stream: Long, referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileStreamI(stream.toString(), referencehdc.toString(), type, framerect.toString(), frameunit, description.toString(), metafile.toString()) as Int) else 0

public actual fun GdipReleaseDC(graphics: Long, hdc: HDC): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipReleaseDC(graphics.toString(), hdc.toString()) as Int) else 0

public actual fun GdipRemovePropertyItem(image: Long, propid: UInt): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipRemovePropertyItem(image.toString(), propid.toInt()) as Int) else 0

public actual fun GdipResetClip(graphics: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipResetClip(graphics.toString()) as Int) else 0

public actual fun GdipResetImageAttributes(imageattr: Long, type: ColorAdjustType): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipResetImageAttributes(imageattr.toString(), type) as Int) else 0

public actual fun GdipResetLineTransform(brush: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipResetLineTransform(brush.toString()) as Int) else 0

public actual fun GdipResetPageTransform(graphics: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipResetPageTransform(graphics.toString()) as Int) else 0

public actual fun GdipResetPath(path: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipResetPath(path.toString()) as Int) else 0

public actual fun GdipResetPathGradientTransform(brush: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipResetPathGradientTransform(brush.toString()) as Int) else 0

public actual fun GdipResetPenTransform(pen: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipResetPenTransform(pen.toString()) as Int) else 0

public actual fun GdipResetTextureTransform(brush: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipResetTextureTransform(brush.toString()) as Int) else 0

public actual fun GdipResetWorldTransform(graphics: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipResetWorldTransform(graphics.toString()) as Int) else 0

public actual fun GdipRestoreGraphics(graphics: Long, state: UInt): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipRestoreGraphics(graphics.toString(), state.toInt()) as Int) else 0

public actual fun GdipReversePath(path: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipReversePath(path.toString()) as Int) else 0

public actual fun GdipRotateLineTransform(brush: Long, angle: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipRotateLineTransform(brush.toString(), angle.toDouble(), order) as Int) else 0

public actual fun GdipRotateMatrix(matrix: Long, angle: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipRotateMatrix(matrix.toString(), angle.toDouble(), order) as Int) else 0

public actual fun GdipRotatePathGradientTransform(brush: Long, angle: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipRotatePathGradientTransform(brush.toString(), angle.toDouble(), order) as Int) else 0

public actual fun GdipRotatePenTransform(pen: Long, angle: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipRotatePenTransform(pen.toString(), angle.toDouble(), order) as Int) else 0

public actual fun GdipRotateTextureTransform(brush: Long, angle: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipRotateTextureTransform(brush.toString(), angle.toDouble(), order) as Int) else 0

public actual fun GdipRotateWorldTransform(graphics: Long, angle: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipRotateWorldTransform(graphics.toString(), angle.toDouble(), order) as Int) else 0

public actual fun GdipSaveAdd(image: Long, encoderparams: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSaveAdd(image.toString(), encoderparams.toString()) as Int) else 0

public actual fun GdipSaveAddImage(image: Long, newimage: Long, encoderparams: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSaveAddImage(image.toString(), newimage.toString(), encoderparams.toString()) as Int) else 0

public actual fun GdipSaveGraphics(graphics: Long, state: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSaveGraphics(graphics.toString(), state.toString()) as Int) else 0

public actual fun GdipSaveImageToFile(image: Long, filename: PCWSTR, clsidencoder: Long, encoderparams: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSaveImageToFile(image.toString(), filename.toString(), clsidencoder.toString(), encoderparams.toString()) as Int) else 0

public actual fun GdipSaveImageToStream(image: Long, stream: Long, clsidencoder: Long, encoderparams: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSaveImageToStream(image.toString(), stream.toString(), clsidencoder.toString(), encoderparams.toString()) as Int) else 0

public actual fun GdipScaleLineTransform(brush: Long, sx: Float, sy: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipScaleLineTransform(brush.toString(), sx.toDouble(), sy.toDouble(), order) as Int) else 0

public actual fun GdipScaleMatrix(matrix: Long, scalex: Float, scaley: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipScaleMatrix(matrix.toString(), scalex.toDouble(), scaley.toDouble(), order) as Int) else 0

public actual fun GdipScalePathGradientTransform(brush: Long, sx: Float, sy: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipScalePathGradientTransform(brush.toString(), sx.toDouble(), sy.toDouble(), order) as Int) else 0

public actual fun GdipScalePenTransform(pen: Long, sx: Float, sy: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipScalePenTransform(pen.toString(), sx.toDouble(), sy.toDouble(), order) as Int) else 0

public actual fun GdipScaleTextureTransform(brush: Long, sx: Float, sy: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipScaleTextureTransform(brush.toString(), sx.toDouble(), sy.toDouble(), order) as Int) else 0

public actual fun GdipScaleWorldTransform(graphics: Long, sx: Float, sy: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipScaleWorldTransform(graphics.toString(), sx.toDouble(), sy.toDouble(), order) as Int) else 0

public actual fun GdipSetAdjustableArrowCapFillState(cap: Long, fillstate: BOOL): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetAdjustableArrowCapFillState(cap.toString(), fillstate) as Int) else 0

public actual fun GdipSetAdjustableArrowCapHeight(cap: Long, height: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetAdjustableArrowCapHeight(cap.toString(), height.toDouble()) as Int) else 0

public actual fun GdipSetAdjustableArrowCapMiddleInset(cap: Long, middleinset: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetAdjustableArrowCapMiddleInset(cap.toString(), middleinset.toDouble()) as Int) else 0

public actual fun GdipSetAdjustableArrowCapWidth(cap: Long, width: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetAdjustableArrowCapWidth(cap.toString(), width.toDouble()) as Int) else 0

public actual fun GdipSetClipGraphics(graphics: Long, srcgraphics: Long, combinemode: CombineMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetClipGraphics(graphics.toString(), srcgraphics.toString(), combinemode) as Int) else 0

public actual fun GdipSetClipHrgn(graphics: Long, hrgn: HRGN, combinemode: CombineMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetClipHrgn(graphics.toString(), hrgn.toString(), combinemode) as Int) else 0

public actual fun GdipSetClipPath(graphics: Long, path: Long, combinemode: CombineMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetClipPath(graphics.toString(), path.toString(), combinemode) as Int) else 0

public actual fun GdipSetClipRect(graphics: Long, x: Float, y: Float, width: Float, height: Float, combinemode: CombineMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetClipRect(graphics.toString(), x.toDouble(), y.toDouble(), width.toDouble(), height.toDouble(), combinemode) as Int) else 0

public actual fun GdipSetClipRectI(graphics: Long, x: Int, y: Int, width: Int, height: Int, combinemode: CombineMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetClipRectI(graphics.toString(), x, y, width, height, combinemode) as Int) else 0

public actual fun GdipSetClipRegion(graphics: Long, region: Long, combinemode: CombineMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetClipRegion(graphics.toString(), region.toString(), combinemode) as Int) else 0

public actual fun GdipSetCompositingMode(graphics: Long, compositingmode: CompositingMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetCompositingMode(graphics.toString(), compositingmode) as Int) else 0

public actual fun GdipSetCompositingQuality(graphics: Long, compositingquality: CompositingQuality): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetCompositingQuality(graphics.toString(), compositingquality) as Int) else 0

public actual fun GdipSetCustomLineCapBaseCap(customcap: Long, basecap: LineCap): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapBaseCap(customcap.toString(), basecap) as Int) else 0

public actual fun GdipSetCustomLineCapBaseInset(customcap: Long, inset: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapBaseInset(customcap.toString(), inset.toDouble()) as Int) else 0

public actual fun GdipSetCustomLineCapStrokeCaps(customcap: Long, startcap: LineCap, endcap: LineCap): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapStrokeCaps(customcap.toString(), startcap, endcap) as Int) else 0

public actual fun GdipSetCustomLineCapStrokeJoin(customcap: Long, linejoin: LineJoin): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapStrokeJoin(customcap.toString(), linejoin) as Int) else 0

public actual fun GdipSetCustomLineCapWidthScale(customcap: Long, widthscale: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapWidthScale(customcap.toString(), widthscale.toDouble()) as Int) else 0

public actual fun GdipSetEffectParameters(effect: Long, params: Long, size: UInt): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetEffectParameters(effect.toString(), params.toString(), size.toInt()) as Int) else 0

public actual fun GdipSetEmpty(region: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetEmpty(region.toString()) as Int) else 0

public actual fun GdipSetImageAttributesCachedBackground(imageattr: Long, enableflag: BOOL): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesCachedBackground(imageattr.toString(), enableflag) as Int) else 0

public actual fun GdipSetImageAttributesColorKeys(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, colorlow: UInt, colorhigh: UInt): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesColorKeys(imageattr.toString(), type, enableflag, colorlow.toInt(), colorhigh.toInt()) as Int) else 0

public actual fun GdipSetImageAttributesColorMatrix(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, colormatrix: Long, graymatrix: Long, flags: ColorMatrixFlags): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesColorMatrix(imageattr.toString(), type, enableflag, colormatrix.toString(), graymatrix.toString(), flags) as Int) else 0

public actual fun GdipSetImageAttributesGamma(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, gamma: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesGamma(imageattr.toString(), type, enableflag, gamma.toDouble()) as Int) else 0

public actual fun GdipSetImageAttributesNoOp(imageattr: Long, type: ColorAdjustType, enableflag: BOOL): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesNoOp(imageattr.toString(), type, enableflag) as Int) else 0

public actual fun GdipSetImageAttributesOutputChannel(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, channelflags: ColorChannelFlags): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesOutputChannel(imageattr.toString(), type, enableflag, channelflags) as Int) else 0

public actual fun GdipSetImageAttributesOutputChannelColorProfile(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, colorprofilefilename: PCWSTR): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesOutputChannelColorProfile(imageattr.toString(), type, enableflag, colorprofilefilename.toString()) as Int) else 0

public actual fun GdipSetImageAttributesRemapTable(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, mapsize: UInt, map: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesRemapTable(imageattr.toString(), type, enableflag, mapsize.toInt(), map.toString()) as Int) else 0

public actual fun GdipSetImageAttributesThreshold(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, threshold: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesThreshold(imageattr.toString(), type, enableflag, threshold.toDouble()) as Int) else 0

public actual fun GdipSetImageAttributesToIdentity(imageattr: Long, type: ColorAdjustType): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesToIdentity(imageattr.toString(), type) as Int) else 0

public actual fun GdipSetImageAttributesWrapMode(imageattr: Long, wrap: WrapMode, argb: UInt, clamp: BOOL): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesWrapMode(imageattr.toString(), wrap, argb.toInt(), clamp) as Int) else 0

public actual fun GdipSetImagePalette(image: Long, palette: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetImagePalette(image.toString(), palette.toString()) as Int) else 0

public actual fun GdipSetInfinite(region: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetInfinite(region.toString()) as Int) else 0

public actual fun GdipSetInterpolationMode(graphics: Long, interpolationmode: InterpolationMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetInterpolationMode(graphics.toString(), interpolationmode) as Int) else 0

public actual fun GdipSetLineBlend(brush: Long, blend: Long, positions: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetLineBlend(brush.toString(), blend.toString(), positions.toString(), count) as Int) else 0

public actual fun GdipSetLineColors(brush: Long, color1: UInt, color2: UInt): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetLineColors(brush.toString(), color1.toInt(), color2.toInt()) as Int) else 0

public actual fun GdipSetLineGammaCorrection(brush: Long, usegammacorrection: BOOL): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetLineGammaCorrection(brush.toString(), usegammacorrection) as Int) else 0

public actual fun GdipSetLineLinearBlend(brush: Long, focus: Float, scale: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetLineLinearBlend(brush.toString(), focus.toDouble(), scale.toDouble()) as Int) else 0

public actual fun GdipSetLinePresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetLinePresetBlend(brush.toString(), blend.toString(), positions.toString(), count) as Int) else 0

public actual fun GdipSetLineSigmaBlend(brush: Long, focus: Float, scale: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetLineSigmaBlend(brush.toString(), focus.toDouble(), scale.toDouble()) as Int) else 0

public actual fun GdipSetLineTransform(brush: Long, matrix: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetLineTransform(brush.toString(), matrix.toString()) as Int) else 0

public actual fun GdipSetLineWrapMode(brush: Long, wrapmode: WrapMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetLineWrapMode(brush.toString(), wrapmode) as Int) else 0

public actual fun GdipSetMatrixElements(matrix: Long, m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetMatrixElements(matrix.toString(), m11.toDouble(), m12.toDouble(), m21.toDouble(), m22.toDouble(), dx.toDouble(), dy.toDouble()) as Int) else 0

public actual fun GdipSetMetafileDownLevelRasterizationLimit(metafile: Long, metafilerasterizationlimitdpi: UInt): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetMetafileDownLevelRasterizationLimit(metafile.toString(), metafilerasterizationlimitdpi.toInt()) as Int) else 0

public actual fun GdipSetPageScale(graphics: Long, scale: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPageScale(graphics.toString(), scale.toDouble()) as Int) else 0

public actual fun GdipSetPageUnit(graphics: Long, unit: Unit): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPageUnit(graphics.toString(), unit) as Int) else 0

public actual fun GdipSetPathFillMode(path: Long, fillmode: FillMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPathFillMode(path.toString(), fillmode) as Int) else 0

public actual fun GdipSetPathGradientBlend(brush: Long, blend: Long, positions: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientBlend(brush.toString(), blend.toString(), positions.toString(), count) as Int) else 0

public actual fun GdipSetPathGradientCenterColor(brush: Long, colors: UInt): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientCenterColor(brush.toString(), colors.toInt()) as Int) else 0

public actual fun GdipSetPathGradientCenterPoint(brush: Long, points: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientCenterPoint(brush.toString(), points.toString()) as Int) else 0

public actual fun GdipSetPathGradientCenterPointI(brush: Long, points: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientCenterPointI(brush.toString(), points.toString()) as Int) else 0

public actual fun GdipSetPathGradientFocusScales(brush: Long, xscale: Float, yscale: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientFocusScales(brush.toString(), xscale.toDouble(), yscale.toDouble()) as Int) else 0

public actual fun GdipSetPathGradientGammaCorrection(brush: Long, usegammacorrection: BOOL): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientGammaCorrection(brush.toString(), usegammacorrection) as Int) else 0

public actual fun GdipSetPathGradientLinearBlend(brush: Long, focus: Float, scale: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientLinearBlend(brush.toString(), focus.toDouble(), scale.toDouble()) as Int) else 0

public actual fun GdipSetPathGradientPath(brush: Long, path: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientPath(brush.toString(), path.toString()) as Int) else 0

public actual fun GdipSetPathGradientPresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientPresetBlend(brush.toString(), blend.toString(), positions.toString(), count) as Int) else 0

public actual fun GdipSetPathGradientSigmaBlend(brush: Long, focus: Float, scale: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientSigmaBlend(brush.toString(), focus.toDouble(), scale.toDouble()) as Int) else 0

public actual fun GdipSetPathGradientSurroundColorsWithCount(brush: Long, color: Long, count: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientSurroundColorsWithCount(brush.toString(), color.toString(), count.toString()) as Int) else 0

public actual fun GdipSetPathGradientTransform(brush: Long, matrix: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientTransform(brush.toString(), matrix.toString()) as Int) else 0

public actual fun GdipSetPathGradientWrapMode(brush: Long, wrapmode: WrapMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientWrapMode(brush.toString(), wrapmode) as Int) else 0

public actual fun GdipSetPathMarker(path: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPathMarker(path.toString()) as Int) else 0

public actual fun GdipSetPenBrushFill(pen: Long, brush: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPenBrushFill(pen.toString(), brush.toString()) as Int) else 0

public actual fun GdipSetPenColor(pen: Long, argb: UInt): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPenColor(pen.toString(), argb.toInt()) as Int) else 0

public actual fun GdipSetPenCompoundArray(pen: Long, dash: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPenCompoundArray(pen.toString(), dash.toString(), count) as Int) else 0

public actual fun GdipSetPenCustomEndCap(pen: Long, customcap: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPenCustomEndCap(pen.toString(), customcap.toString()) as Int) else 0

public actual fun GdipSetPenCustomStartCap(pen: Long, customcap: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPenCustomStartCap(pen.toString(), customcap.toString()) as Int) else 0

public actual fun GdipSetPenDashArray(pen: Long, dash: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPenDashArray(pen.toString(), dash.toString(), count) as Int) else 0

public actual fun GdipSetPenDashCap197819(pen: Long, dashcap: DashCap): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPenDashCap197819(pen.toString(), dashcap) as Int) else 0

public actual fun GdipSetPenDashOffset(pen: Long, offset: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPenDashOffset(pen.toString(), offset.toDouble()) as Int) else 0

public actual fun GdipSetPenDashStyle(pen: Long, dashstyle: DashStyle): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPenDashStyle(pen.toString(), dashstyle) as Int) else 0

public actual fun GdipSetPenEndCap(pen: Long, endcap: LineCap): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPenEndCap(pen.toString(), endcap) as Int) else 0

public actual fun GdipSetPenLineCap197819(pen: Long, startcap: LineCap, endcap: LineCap, dashcap: DashCap): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPenLineCap197819(pen.toString(), startcap, endcap, dashcap) as Int) else 0

public actual fun GdipSetPenLineJoin(pen: Long, linejoin: LineJoin): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPenLineJoin(pen.toString(), linejoin) as Int) else 0

public actual fun GdipSetPenMiterLimit(pen: Long, miterlimit: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPenMiterLimit(pen.toString(), miterlimit.toDouble()) as Int) else 0

public actual fun GdipSetPenMode(pen: Long, penmode: PenAlignment): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPenMode(pen.toString(), penmode) as Int) else 0

public actual fun GdipSetPenStartCap(pen: Long, startcap: LineCap): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPenStartCap(pen.toString(), startcap) as Int) else 0

public actual fun GdipSetPenTransform(pen: Long, matrix: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPenTransform(pen.toString(), matrix.toString()) as Int) else 0

public actual fun GdipSetPenUnit(pen: Long, unit: Unit): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPenUnit(pen.toString(), unit) as Int) else 0

public actual fun GdipSetPenWidth(pen: Long, width: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPenWidth(pen.toString(), width.toDouble()) as Int) else 0

public actual fun GdipSetPixelOffsetMode(graphics: Long, pixeloffsetmode: PixelOffsetMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPixelOffsetMode(graphics.toString(), pixeloffsetmode) as Int) else 0

public actual fun GdipSetPropertyItem(image: Long, item: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetPropertyItem(image.toString(), item.toString()) as Int) else 0

public actual fun GdipSetRenderingOrigin(graphics: Long, x: Int, y: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetRenderingOrigin(graphics.toString(), x, y) as Int) else 0

public actual fun GdipSetSmoothingMode(graphics: Long, smoothingmode: SmoothingMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetSmoothingMode(graphics.toString(), smoothingmode) as Int) else 0

public actual fun GdipSetSolidFillColor(brush: Long, color: UInt): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetSolidFillColor(brush.toString(), color.toInt()) as Int) else 0

public actual fun GdipSetStringFormatAlign(format: Long, align: StringAlignment): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatAlign(format.toString(), align) as Int) else 0

public actual fun GdipSetStringFormatDigitSubstitution(format: Long, language: UShort, substitute: StringDigitSubstitute): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatDigitSubstitution(format.toString(), language.toInt(), substitute) as Int) else 0

public actual fun GdipSetStringFormatFlags(format: Long, flags: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatFlags(format.toString(), flags) as Int) else 0

public actual fun GdipSetStringFormatHotkeyPrefix(format: Long, hotkeyprefix: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatHotkeyPrefix(format.toString(), hotkeyprefix) as Int) else 0

public actual fun GdipSetStringFormatLineAlign(format: Long, align: StringAlignment): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatLineAlign(format.toString(), align) as Int) else 0

public actual fun GdipSetStringFormatMeasurableCharacterRanges(format: Long, rangecount: Int, ranges: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatMeasurableCharacterRanges(format.toString(), rangecount, ranges.toString()) as Int) else 0

public actual fun GdipSetStringFormatTabStops(format: Long, firsttaboffset: Float, count: Int, tabstops: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatTabStops(format.toString(), firsttaboffset.toDouble(), count, tabstops.toString()) as Int) else 0

public actual fun GdipSetStringFormatTrimming(format: Long, trimming: StringTrimming): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatTrimming(format.toString(), trimming) as Int) else 0

public actual fun GdipSetTextContrast(graphics: Long, contrast: UInt): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetTextContrast(graphics.toString(), contrast.toInt()) as Int) else 0

public actual fun GdipSetTextRenderingHint(graphics: Long, mode: TextRenderingHint): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetTextRenderingHint(graphics.toString(), mode) as Int) else 0

public actual fun GdipSetTextureTransform(brush: Long, matrix: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetTextureTransform(brush.toString(), matrix.toString()) as Int) else 0

public actual fun GdipSetTextureWrapMode(brush: Long, wrapmode: WrapMode): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetTextureWrapMode(brush.toString(), wrapmode) as Int) else 0

public actual fun GdipSetWorldTransform(graphics: Long, matrix: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipSetWorldTransform(graphics.toString(), matrix.toString()) as Int) else 0

public actual fun GdipShearMatrix(matrix: Long, shearx: Float, sheary: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipShearMatrix(matrix.toString(), shearx.toDouble(), sheary.toDouble(), order) as Int) else 0

public actual fun GdipStartPathFigure(path: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipStartPathFigure(path.toString()) as Int) else 0

public actual fun GdipStringFormatGetGenericDefault(format: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipStringFormatGetGenericDefault(format.toString()) as Int) else 0

public actual fun GdipStringFormatGetGenericTypographic(format: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipStringFormatGetGenericTypographic(format.toString()) as Int) else 0

public actual fun GdipTestControl(control: GpTestControlEnum, param1: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipTestControl(control, param1.toString()) as Int) else 0

public actual fun GdipTransformMatrixPoints(matrix: Long, pts: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipTransformMatrixPoints(matrix.toString(), pts.toString(), count) as Int) else 0

public actual fun GdipTransformMatrixPointsI(matrix: Long, pts: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipTransformMatrixPointsI(matrix.toString(), pts.toString(), count) as Int) else 0

public actual fun GdipTransformPath(path: Long, matrix: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipTransformPath(path.toString(), matrix.toString()) as Int) else 0

public actual fun GdipTransformPoints(graphics: Long, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipTransformPoints(graphics.toString(), destspace, srcspace, points.toString(), count) as Int) else 0

public actual fun GdipTransformPointsI(graphics: Long, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipTransformPointsI(graphics.toString(), destspace, srcspace, points.toString(), count) as Int) else 0

public actual fun GdipTransformRegion(region: Long, matrix: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipTransformRegion(region.toString(), matrix.toString()) as Int) else 0

public actual fun GdipTranslateClip(graphics: Long, dx: Float, dy: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipTranslateClip(graphics.toString(), dx.toDouble(), dy.toDouble()) as Int) else 0

public actual fun GdipTranslateClipI(graphics: Long, dx: Int, dy: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipTranslateClipI(graphics.toString(), dx, dy) as Int) else 0

public actual fun GdipTranslateLineTransform(brush: Long, dx: Float, dy: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipTranslateLineTransform(brush.toString(), dx.toDouble(), dy.toDouble(), order) as Int) else 0

public actual fun GdipTranslateMatrix(matrix: Long, offsetx: Float, offsety: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipTranslateMatrix(matrix.toString(), offsetx.toDouble(), offsety.toDouble(), order) as Int) else 0

public actual fun GdipTranslatePathGradientTransform(brush: Long, dx: Float, dy: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipTranslatePathGradientTransform(brush.toString(), dx.toDouble(), dy.toDouble(), order) as Int) else 0

public actual fun GdipTranslatePenTransform(pen: Long, dx: Float, dy: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipTranslatePenTransform(pen.toString(), dx.toDouble(), dy.toDouble(), order) as Int) else 0

public actual fun GdipTranslateRegion(region: Long, dx: Float, dy: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipTranslateRegion(region.toString(), dx.toDouble(), dy.toDouble()) as Int) else 0

public actual fun GdipTranslateRegionI(region: Long, dx: Int, dy: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipTranslateRegionI(region.toString(), dx, dy) as Int) else 0

public actual fun GdipTranslateTextureTransform(brush: Long, dx: Float, dy: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipTranslateTextureTransform(brush.toString(), dx.toDouble(), dy.toDouble(), order) as Int) else 0

public actual fun GdipTranslateWorldTransform(graphics: Long, dx: Float, dy: Float, order: MatrixOrder): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipTranslateWorldTransform(graphics.toString(), dx.toDouble(), dy.toDouble(), order) as Int) else 0

public actual fun GdipVectorTransformMatrixPoints(matrix: Long, pts: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipVectorTransformMatrixPoints(matrix.toString(), pts.toString(), count) as Int) else 0

public actual fun GdipVectorTransformMatrixPointsI(matrix: Long, pts: Long, count: Int): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipVectorTransformMatrixPointsI(matrix.toString(), pts.toString(), count) as Int) else 0

public actual fun GdipWarpPath(path: Long, matrix: Long, points: Long, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, warpmode: WarpMode, flatness: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipWarpPath(path.toString(), matrix.toString(), points.toString(), count, srcx.toDouble(), srcy.toDouble(), srcwidth.toDouble(), srcheight.toDouble(), warpmode, flatness.toDouble()) as Int) else 0

public actual fun GdipWidenPath(nativepath: Long, pen: Long, matrix: Long, flatness: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipWidenPath(nativepath.toString(), pen.toString(), matrix.toString(), flatness.toDouble()) as Int) else 0

public actual fun GdipWindingModeOutline(path: Long, matrix: Long, flatness: Float): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdipWindingModeOutline(path.toString(), matrix.toString(), flatness.toDouble()) as Int) else 0

public actual fun GdiplusNotificationHook(token: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdiplusNotificationHook(token.toString()) as Int) else 0

public actual fun GdiplusNotificationUnhook(token: ULong) {
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) {
        _windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdiplusNotificationUnhook(token.toString())
    }
}

public actual fun GdiplusShutdown(token: ULong) {
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) {
        _windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdiplusShutdown(token.toString())
    }
}

public actual fun GdiplusStartup(token: Long, input: Long, output: Long): Status =
    if (_windowsWin32GraphicsGdiplusNapiAddon != null) (_windowsWin32GraphicsGdiplusNapiAddon.windowssys_windows_win32_graphics_gdiplus_GdiplusStartup(token.toString(), input.toString(), output.toString()) as Int) else 0
