@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun GdipAddPathArc(path: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAddPathArc(path.toCPointer<ByteVar>(), x, y, width, height, startangle, sweepangle)

public actual fun GdipAddPathArcI(path: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAddPathArcI(path.toCPointer<ByteVar>(), x, y, width, height, startangle, sweepangle)

public actual fun GdipAddPathBezier(path: Long, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAddPathBezier(path.toCPointer<ByteVar>(), x1, y1, x2, y2, x3, y3, x4, y4)

public actual fun GdipAddPathBezierI(path: Long, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAddPathBezierI(path.toCPointer<ByteVar>(), x1, y1, x2, y2, x3, y3, x4, y4)

public actual fun GdipAddPathBeziers(path: Long, points: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAddPathBeziers(path.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count)

public actual fun GdipAddPathBeziersI(path: Long, points: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAddPathBeziersI(path.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count)

public actual fun GdipAddPathClosedCurve(path: Long, points: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAddPathClosedCurve(path.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count)

public actual fun GdipAddPathClosedCurve2(path: Long, points: Long, count: Int, tension: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAddPathClosedCurve2(path.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count, tension)

public actual fun GdipAddPathClosedCurve2I(path: Long, points: Long, count: Int, tension: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAddPathClosedCurve2I(path.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count, tension)

public actual fun GdipAddPathClosedCurveI(path: Long, points: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAddPathClosedCurveI(path.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count)

public actual fun GdipAddPathCurve(path: Long, points: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve(path.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count)

public actual fun GdipAddPathCurve2(path: Long, points: Long, count: Int, tension: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve2(path.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count, tension)

public actual fun GdipAddPathCurve2I(path: Long, points: Long, count: Int, tension: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve2I(path.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count, tension)

public actual fun GdipAddPathCurve3(path: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve3(path.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count, offset, numberofsegments, tension)

public actual fun GdipAddPathCurve3I(path: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve3I(path.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count, offset, numberofsegments, tension)

public actual fun GdipAddPathCurveI(path: Long, points: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurveI(path.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count)

public actual fun GdipAddPathEllipse(path: Long, x: Float, y: Float, width: Float, height: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAddPathEllipse(path.toCPointer<ByteVar>(), x, y, width, height)

public actual fun GdipAddPathEllipseI(path: Long, x: Int, y: Int, width: Int, height: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAddPathEllipseI(path.toCPointer<ByteVar>(), x, y, width, height)

public actual fun GdipAddPathLine(path: Long, x1: Float, y1: Float, x2: Float, y2: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAddPathLine(path.toCPointer<ByteVar>(), x1, y1, x2, y2)

public actual fun GdipAddPathLine2(path: Long, points: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAddPathLine2(path.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count)

public actual fun GdipAddPathLine2I(path: Long, points: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAddPathLine2I(path.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count)

public actual fun GdipAddPathLineI(path: Long, x1: Int, y1: Int, x2: Int, y2: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAddPathLineI(path.toCPointer<ByteVar>(), x1, y1, x2, y2)

public actual fun GdipAddPathPath(path: Long, addingpath: Long, connect: BOOL): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAddPathPath(path.toCPointer<ByteVar>(), addingpath.toCPointer<ByteVar>(), connect)

public actual fun GdipAddPathPie(path: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAddPathPie(path.toCPointer<ByteVar>(), x, y, width, height, startangle, sweepangle)

public actual fun GdipAddPathPieI(path: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAddPathPieI(path.toCPointer<ByteVar>(), x, y, width, height, startangle, sweepangle)

public actual fun GdipAddPathPolygon(path: Long, points: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAddPathPolygon(path.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count)

public actual fun GdipAddPathPolygonI(path: Long, points: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAddPathPolygonI(path.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count)

public actual fun GdipAddPathRectangle(path: Long, x: Float, y: Float, width: Float, height: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAddPathRectangle(path.toCPointer<ByteVar>(), x, y, width, height)

public actual fun GdipAddPathRectangleI(path: Long, x: Int, y: Int, width: Int, height: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAddPathRectangleI(path.toCPointer<ByteVar>(), x, y, width, height)

public actual fun GdipAddPathRectangles(path: Long, rects: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAddPathRectangles(path.toCPointer<ByteVar>(), rects.toCPointer<ByteVar>(), count)

public actual fun GdipAddPathRectanglesI(path: Long, rects: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAddPathRectanglesI(path.toCPointer<ByteVar>(), rects.toCPointer<ByteVar>(), count)

public actual fun GdipAddPathString(path: Long, string: PCWSTR, length: Int, family: Long, style: Int, emsize: Float, layoutrect: Long, format: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAddPathString(path.toCPointer<ByteVar>(), string.toCPointer<ByteVar>(), length, family.toCPointer<ByteVar>(), style, emsize, layoutrect.toCPointer<ByteVar>(), format.toCPointer<ByteVar>())

public actual fun GdipAddPathStringI(path: Long, string: PCWSTR, length: Int, family: Long, style: Int, emsize: Float, layoutrect: Long, format: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAddPathStringI(path.toCPointer<ByteVar>(), string.toCPointer<ByteVar>(), length, family.toCPointer<ByteVar>(), style, emsize, layoutrect.toCPointer<ByteVar>(), format.toCPointer<ByteVar>())

public actual fun GdipAlloc(size: ULong): Long =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipAlloc(size)?.toLong() ?: 0L

public actual fun GdipBeginContainer(graphics: Long, dstrect: Long, srcrect: Long, unit: Unit, state: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipBeginContainer(graphics.toCPointer<ByteVar>(), dstrect.toCPointer<ByteVar>(), srcrect.toCPointer<ByteVar>(), unit, state.toCPointer<ByteVar>())

public actual fun GdipBeginContainer2(graphics: Long, state: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipBeginContainer2(graphics.toCPointer<ByteVar>(), state.toCPointer<ByteVar>())

public actual fun GdipBeginContainerI(graphics: Long, dstrect: Long, srcrect: Long, unit: Unit, state: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipBeginContainerI(graphics.toCPointer<ByteVar>(), dstrect.toCPointer<ByteVar>(), srcrect.toCPointer<ByteVar>(), unit, state.toCPointer<ByteVar>())

public actual fun GdipBitmapApplyEffect(bitmap: Long, effect: Long, roi: Long, useauxdata: BOOL, auxdata: Long, auxdatasize: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipBitmapApplyEffect(bitmap.toCPointer<ByteVar>(), effect.toCPointer<ByteVar>(), roi.toCPointer<ByteVar>(), useauxdata, auxdata.toCPointer<ByteVar>(), auxdatasize.toCPointer<ByteVar>())

public actual fun GdipBitmapConvertFormat(pinputbitmap: Long, format: Int, dithertype: DitherType, palettetype: PaletteType, palette: Long, alphathresholdpercent: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipBitmapConvertFormat(pinputbitmap.toCPointer<ByteVar>(), format, dithertype, palettetype, palette.toCPointer<ByteVar>(), alphathresholdpercent)

public actual fun GdipBitmapCreateApplyEffect(inputbitmaps: Long, numinputs: Int, effect: Long, roi: Long, outputrect: Long, outputbitmap: Long, useauxdata: BOOL, auxdata: Long, auxdatasize: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipBitmapCreateApplyEffect(inputbitmaps.toCPointer<ByteVar>(), numinputs, effect.toCPointer<ByteVar>(), roi.toCPointer<ByteVar>(), outputrect.toCPointer<ByteVar>(), outputbitmap.toCPointer<ByteVar>(), useauxdata, auxdata.toCPointer<ByteVar>(), auxdatasize.toCPointer<ByteVar>())

public actual fun GdipBitmapGetHistogram(bitmap: Long, format: HistogramFormat, numberofentries: UInt, channel0: Long, channel1: Long, channel2: Long, channel3: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipBitmapGetHistogram(bitmap.toCPointer<ByteVar>(), format, numberofentries, channel0.toCPointer<ByteVar>(), channel1.toCPointer<ByteVar>(), channel2.toCPointer<ByteVar>(), channel3.toCPointer<ByteVar>())

public actual fun GdipBitmapGetHistogramSize(format: HistogramFormat, numberofentries: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipBitmapGetHistogramSize(format, numberofentries.toCPointer<ByteVar>())

public actual fun GdipBitmapGetPixel(bitmap: Long, x: Int, y: Int, color: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipBitmapGetPixel(bitmap.toCPointer<ByteVar>(), x, y, color.toCPointer<ByteVar>())

public actual fun GdipBitmapLockBits(bitmap: Long, rect: Long, flags: UInt, format: Int, lockedbitmapdata: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipBitmapLockBits(bitmap.toCPointer<ByteVar>(), rect.toCPointer<ByteVar>(), flags, format, lockedbitmapdata.toCPointer<ByteVar>())

public actual fun GdipBitmapSetPixel(bitmap: Long, x: Int, y: Int, color: UInt): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipBitmapSetPixel(bitmap.toCPointer<ByteVar>(), x, y, color)

public actual fun GdipBitmapSetResolution(bitmap: Long, xdpi: Float, ydpi: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipBitmapSetResolution(bitmap.toCPointer<ByteVar>(), xdpi, ydpi)

public actual fun GdipBitmapUnlockBits(bitmap: Long, lockedbitmapdata: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipBitmapUnlockBits(bitmap.toCPointer<ByteVar>(), lockedbitmapdata.toCPointer<ByteVar>())

public actual fun GdipClearPathMarkers(path: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipClearPathMarkers(path.toCPointer<ByteVar>())

public actual fun GdipCloneBitmapArea(x: Float, y: Float, width: Float, height: Float, format: Int, srcbitmap: Long, dstbitmap: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCloneBitmapArea(x, y, width, height, format, srcbitmap.toCPointer<ByteVar>(), dstbitmap.toCPointer<ByteVar>())

public actual fun GdipCloneBitmapAreaI(x: Int, y: Int, width: Int, height: Int, format: Int, srcbitmap: Long, dstbitmap: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCloneBitmapAreaI(x, y, width, height, format, srcbitmap.toCPointer<ByteVar>(), dstbitmap.toCPointer<ByteVar>())

public actual fun GdipCloneBrush(brush: Long, clonebrush: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCloneBrush(brush.toCPointer<ByteVar>(), clonebrush.toCPointer<ByteVar>())

public actual fun GdipCloneCustomLineCap(customcap: Long, clonedcap: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCloneCustomLineCap(customcap.toCPointer<ByteVar>(), clonedcap.toCPointer<ByteVar>())

public actual fun GdipCloneFont(font: Long, clonefont: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCloneFont(font.toCPointer<ByteVar>(), clonefont.toCPointer<ByteVar>())

public actual fun GdipCloneFontFamily(fontfamily: Long, clonedfontfamily: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCloneFontFamily(fontfamily.toCPointer<ByteVar>(), clonedfontfamily.toCPointer<ByteVar>())

public actual fun GdipCloneImage(image: Long, cloneimage: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCloneImage(image.toCPointer<ByteVar>(), cloneimage.toCPointer<ByteVar>())

public actual fun GdipCloneImageAttributes(imageattr: Long, cloneimageattr: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCloneImageAttributes(imageattr.toCPointer<ByteVar>(), cloneimageattr.toCPointer<ByteVar>())

public actual fun GdipCloneMatrix(matrix: Long, clonematrix: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCloneMatrix(matrix.toCPointer<ByteVar>(), clonematrix.toCPointer<ByteVar>())

public actual fun GdipClonePath(path: Long, clonepath: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipClonePath(path.toCPointer<ByteVar>(), clonepath.toCPointer<ByteVar>())

public actual fun GdipClonePen(pen: Long, clonepen: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipClonePen(pen.toCPointer<ByteVar>(), clonepen.toCPointer<ByteVar>())

public actual fun GdipCloneRegion(region: Long, cloneregion: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCloneRegion(region.toCPointer<ByteVar>(), cloneregion.toCPointer<ByteVar>())

public actual fun GdipCloneStringFormat(format: Long, newformat: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCloneStringFormat(format.toCPointer<ByteVar>(), newformat.toCPointer<ByteVar>())

public actual fun GdipClosePathFigure(path: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipClosePathFigure(path.toCPointer<ByteVar>())

public actual fun GdipClosePathFigures(path: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipClosePathFigures(path.toCPointer<ByteVar>())

public actual fun GdipCombineRegionPath(region: Long, path: Long, combinemode: CombineMode): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCombineRegionPath(region.toCPointer<ByteVar>(), path.toCPointer<ByteVar>(), combinemode)

public actual fun GdipCombineRegionRect(region: Long, rect: Long, combinemode: CombineMode): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCombineRegionRect(region.toCPointer<ByteVar>(), rect.toCPointer<ByteVar>(), combinemode)

public actual fun GdipCombineRegionRectI(region: Long, rect: Long, combinemode: CombineMode): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCombineRegionRectI(region.toCPointer<ByteVar>(), rect.toCPointer<ByteVar>(), combinemode)

public actual fun GdipCombineRegionRegion(region: Long, region2: Long, combinemode: CombineMode): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCombineRegionRegion(region.toCPointer<ByteVar>(), region2.toCPointer<ByteVar>(), combinemode)

public actual fun GdipComment(graphics: Long, sizedata: UInt, data: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipComment(graphics.toCPointer<ByteVar>(), sizedata, data.toCPointer<ByteVar>())

public actual fun GdipConvertToEmfPlus(refgraphics: Long, metafile: Long, conversionfailureflag: Long, emftype: EmfType, description: PCWSTR, out_metafile: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipConvertToEmfPlus(refgraphics.toCPointer<ByteVar>(), metafile.toCPointer<ByteVar>(), conversionfailureflag.toCPointer<ByteVar>(), emftype, description.toCPointer<ByteVar>(), out_metafile.toCPointer<ByteVar>())

public actual fun GdipConvertToEmfPlusToFile(refgraphics: Long, metafile: Long, conversionfailureflag: Long, filename: PCWSTR, emftype: EmfType, description: PCWSTR, out_metafile: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipConvertToEmfPlusToFile(refgraphics.toCPointer<ByteVar>(), metafile.toCPointer<ByteVar>(), conversionfailureflag.toCPointer<ByteVar>(), filename.toCPointer<ByteVar>(), emftype, description.toCPointer<ByteVar>(), out_metafile.toCPointer<ByteVar>())

public actual fun GdipConvertToEmfPlusToStream(refgraphics: Long, metafile: Long, conversionfailureflag: Long, stream: Long, emftype: EmfType, description: PCWSTR, out_metafile: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipConvertToEmfPlusToStream(refgraphics.toCPointer<ByteVar>(), metafile.toCPointer<ByteVar>(), conversionfailureflag.toCPointer<ByteVar>(), stream.toCPointer<ByteVar>(), emftype, description.toCPointer<ByteVar>(), out_metafile.toCPointer<ByteVar>())

public actual fun GdipCreateAdjustableArrowCap(height: Float, width: Float, isfilled: BOOL, cap: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateAdjustableArrowCap(height, width, isfilled, cap.toCPointer<ByteVar>())

public actual fun GdipCreateBitmapFromFile(filename: PCWSTR, bitmap: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromFile(filename.toCPointer<ByteVar>(), bitmap.toCPointer<ByteVar>())

public actual fun GdipCreateBitmapFromFileICM(filename: PCWSTR, bitmap: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromFileICM(filename.toCPointer<ByteVar>(), bitmap.toCPointer<ByteVar>())

public actual fun GdipCreateBitmapFromGdiDib(gdibitmapinfo: Long, gdibitmapdata: Long, bitmap: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromGdiDib(gdibitmapinfo.toCPointer<ByteVar>(), gdibitmapdata.toCPointer<ByteVar>(), bitmap.toCPointer<ByteVar>())

public actual fun GdipCreateBitmapFromGraphics(width: Int, height: Int, target: Long, bitmap: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromGraphics(width, height, target.toCPointer<ByteVar>(), bitmap.toCPointer<ByteVar>())

public actual fun GdipCreateBitmapFromHBITMAP(hbm: HBITMAP, hpal: HPALETTE, bitmap: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromHBITMAP(hbm.toCPointer<ByteVar>(), hpal.toCPointer<ByteVar>(), bitmap.toCPointer<ByteVar>())

public actual fun GdipCreateBitmapFromHICON(hicon: HICON, bitmap: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromHICON(hicon.toCPointer<ByteVar>(), bitmap.toCPointer<ByteVar>())

public actual fun GdipCreateBitmapFromResource(hinstance: HINSTANCE, lpbitmapname: PCWSTR, bitmap: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromResource(hinstance.toCPointer<ByteVar>(), lpbitmapname.toCPointer<ByteVar>(), bitmap.toCPointer<ByteVar>())

public actual fun GdipCreateBitmapFromScan0(width: Int, height: Int, stride: Int, format: Int, scan0: Long, bitmap: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromScan0(width, height, stride, format, scan0.toCPointer<ByteVar>(), bitmap.toCPointer<ByteVar>())

public actual fun GdipCreateBitmapFromStream(stream: Long, bitmap: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromStream(stream.toCPointer<ByteVar>(), bitmap.toCPointer<ByteVar>())

public actual fun GdipCreateBitmapFromStreamICM(stream: Long, bitmap: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromStreamICM(stream.toCPointer<ByteVar>(), bitmap.toCPointer<ByteVar>())

public actual fun GdipCreateCachedBitmap(bitmap: Long, graphics: Long, cachedbitmap: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateCachedBitmap(bitmap.toCPointer<ByteVar>(), graphics.toCPointer<ByteVar>(), cachedbitmap.toCPointer<ByteVar>())

public actual fun GdipCreateCustomLineCap(fillpath: Long, strokepath: Long, basecap: LineCap, baseinset: Float, customcap: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateCustomLineCap(fillpath.toCPointer<ByteVar>(), strokepath.toCPointer<ByteVar>(), basecap, baseinset, customcap.toCPointer<ByteVar>())

public actual fun GdipCreateEffect(guid: GUID, effect: Long): Status =
    0

public actual fun GdipCreateFont(fontfamily: Long, emsize: Float, style: Int, unit: Unit, font: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateFont(fontfamily.toCPointer<ByteVar>(), emsize, style, unit, font.toCPointer<ByteVar>())

public actual fun GdipCreateFontFamilyFromName(name: PCWSTR, fontcollection: Long, fontfamily: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateFontFamilyFromName(name.toCPointer<ByteVar>(), fontcollection.toCPointer<ByteVar>(), fontfamily.toCPointer<ByteVar>())

public actual fun GdipCreateFontFromDC(hdc: HDC, font: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateFontFromDC(hdc.toCPointer<ByteVar>(), font.toCPointer<ByteVar>())

public actual fun GdipCreateFontFromLogfontA(hdc: HDC, logfont: Long, font: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateFontFromLogfontA(hdc.toCPointer<ByteVar>(), logfont.toCPointer<ByteVar>(), font.toCPointer<ByteVar>())

public actual fun GdipCreateFontFromLogfontW(hdc: HDC, logfont: Long, font: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateFontFromLogfontW(hdc.toCPointer<ByteVar>(), logfont.toCPointer<ByteVar>(), font.toCPointer<ByteVar>())

public actual fun GdipCreateFromHDC(hdc: HDC, graphics: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateFromHDC(hdc.toCPointer<ByteVar>(), graphics.toCPointer<ByteVar>())

public actual fun GdipCreateFromHDC2(hdc: HDC, hdevice: HANDLE, graphics: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateFromHDC2(hdc.toCPointer<ByteVar>(), hdevice.toCPointer<ByteVar>(), graphics.toCPointer<ByteVar>())

public actual fun GdipCreateFromHWND(hwnd: HWND, graphics: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateFromHWND(hwnd.toCPointer<ByteVar>(), graphics.toCPointer<ByteVar>())

public actual fun GdipCreateFromHWNDICM(hwnd: HWND, graphics: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateFromHWNDICM(hwnd.toCPointer<ByteVar>(), graphics.toCPointer<ByteVar>())

public actual fun GdipCreateHBITMAPFromBitmap(bitmap: Long, hbmreturn: Long, background: UInt): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateHBITMAPFromBitmap(bitmap.toCPointer<ByteVar>(), hbmreturn.toCPointer<ByteVar>(), background)

public actual fun GdipCreateHICONFromBitmap(bitmap: Long, hbmreturn: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateHICONFromBitmap(bitmap.toCPointer<ByteVar>(), hbmreturn.toCPointer<ByteVar>())

public actual fun GdipCreateHalftonePalette(): HPALETTE =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateHalftonePalette()?.toLong() ?: 0L

public actual fun GdipCreateHatchBrush(hatchstyle: HatchStyle, forecol: UInt, backcol: UInt, brush: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateHatchBrush(hatchstyle, forecol, backcol, brush.toCPointer<ByteVar>())

public actual fun GdipCreateImageAttributes(imageattr: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateImageAttributes(imageattr.toCPointer<ByteVar>())

public actual fun GdipCreateLineBrush(point1: Long, point2: Long, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrush(point1.toCPointer<ByteVar>(), point2.toCPointer<ByteVar>(), color1, color2, wrapmode, linegradient.toCPointer<ByteVar>())

public actual fun GdipCreateLineBrushFromRect(rect: Long, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushFromRect(rect.toCPointer<ByteVar>(), color1, color2, mode, wrapmode, linegradient.toCPointer<ByteVar>())

public actual fun GdipCreateLineBrushFromRectI(rect: Long, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushFromRectI(rect.toCPointer<ByteVar>(), color1, color2, mode, wrapmode, linegradient.toCPointer<ByteVar>())

public actual fun GdipCreateLineBrushFromRectWithAngle(rect: Long, color1: UInt, color2: UInt, angle: Float, isanglescalable: BOOL, wrapmode: WrapMode, linegradient: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushFromRectWithAngle(rect.toCPointer<ByteVar>(), color1, color2, angle, isanglescalable, wrapmode, linegradient.toCPointer<ByteVar>())

public actual fun GdipCreateLineBrushFromRectWithAngleI(rect: Long, color1: UInt, color2: UInt, angle: Float, isanglescalable: BOOL, wrapmode: WrapMode, linegradient: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushFromRectWithAngleI(rect.toCPointer<ByteVar>(), color1, color2, angle, isanglescalable, wrapmode, linegradient.toCPointer<ByteVar>())

public actual fun GdipCreateLineBrushI(point1: Long, point2: Long, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushI(point1.toCPointer<ByteVar>(), point2.toCPointer<ByteVar>(), color1, color2, wrapmode, linegradient.toCPointer<ByteVar>())

public actual fun GdipCreateMatrix(matrix: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateMatrix(matrix.toCPointer<ByteVar>())

public actual fun GdipCreateMatrix2(m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float, matrix: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateMatrix2(m11, m12, m21, m22, dx, dy, matrix.toCPointer<ByteVar>())

public actual fun GdipCreateMatrix3(rect: Long, dstplg: Long, matrix: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateMatrix3(rect.toCPointer<ByteVar>(), dstplg.toCPointer<ByteVar>(), matrix.toCPointer<ByteVar>())

public actual fun GdipCreateMatrix3I(rect: Long, dstplg: Long, matrix: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateMatrix3I(rect.toCPointer<ByteVar>(), dstplg.toCPointer<ByteVar>(), matrix.toCPointer<ByteVar>())

public actual fun GdipCreateMetafileFromEmf(hemf: HENHMETAFILE, deleteemf: BOOL, metafile: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromEmf(hemf.toCPointer<ByteVar>(), deleteemf, metafile.toCPointer<ByteVar>())

public actual fun GdipCreateMetafileFromFile(file: PCWSTR, metafile: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromFile(file.toCPointer<ByteVar>(), metafile.toCPointer<ByteVar>())

public actual fun GdipCreateMetafileFromStream(stream: Long, metafile: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromStream(stream.toCPointer<ByteVar>(), metafile.toCPointer<ByteVar>())

public actual fun GdipCreateMetafileFromWmf(hwmf: HMETAFILE, deletewmf: BOOL, wmfplaceablefileheader: Long, metafile: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromWmf(hwmf.toCPointer<ByteVar>(), deletewmf, wmfplaceablefileheader.toCPointer<ByteVar>(), metafile.toCPointer<ByteVar>())

public actual fun GdipCreateMetafileFromWmfFile(file: PCWSTR, wmfplaceablefileheader: Long, metafile: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromWmfFile(file.toCPointer<ByteVar>(), wmfplaceablefileheader.toCPointer<ByteVar>(), metafile.toCPointer<ByteVar>())

public actual fun GdipCreatePath(brushmode: FillMode, path: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreatePath(brushmode, path.toCPointer<ByteVar>())

public actual fun GdipCreatePath2(param0: Long, param1: Long, param2: Int, param3: FillMode, path: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreatePath2(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2, param3, path.toCPointer<ByteVar>())

public actual fun GdipCreatePath2I(param0: Long, param1: Long, param2: Int, param3: FillMode, path: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreatePath2I(param0.toCPointer<ByteVar>(), param1.toCPointer<ByteVar>(), param2, param3, path.toCPointer<ByteVar>())

public actual fun GdipCreatePathGradient(points: Long, count: Int, wrapmode: WrapMode, polygradient: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreatePathGradient(points.toCPointer<ByteVar>(), count, wrapmode, polygradient.toCPointer<ByteVar>())

public actual fun GdipCreatePathGradientFromPath(path: Long, polygradient: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreatePathGradientFromPath(path.toCPointer<ByteVar>(), polygradient.toCPointer<ByteVar>())

public actual fun GdipCreatePathGradientI(points: Long, count: Int, wrapmode: WrapMode, polygradient: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreatePathGradientI(points.toCPointer<ByteVar>(), count, wrapmode, polygradient.toCPointer<ByteVar>())

public actual fun GdipCreatePathIter(iterator: Long, path: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreatePathIter(iterator.toCPointer<ByteVar>(), path.toCPointer<ByteVar>())

public actual fun GdipCreatePen1(color: UInt, width: Float, unit: Unit, pen: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreatePen1(color, width, unit, pen.toCPointer<ByteVar>())

public actual fun GdipCreatePen2(brush: Long, width: Float, unit: Unit, pen: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreatePen2(brush.toCPointer<ByteVar>(), width, unit, pen.toCPointer<ByteVar>())

public actual fun GdipCreateRegion(region: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateRegion(region.toCPointer<ByteVar>())

public actual fun GdipCreateRegionHrgn(hrgn: HRGN, region: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionHrgn(hrgn.toCPointer<ByteVar>(), region.toCPointer<ByteVar>())

public actual fun GdipCreateRegionPath(path: Long, region: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionPath(path.toCPointer<ByteVar>(), region.toCPointer<ByteVar>())

public actual fun GdipCreateRegionRect(rect: Long, region: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionRect(rect.toCPointer<ByteVar>(), region.toCPointer<ByteVar>())

public actual fun GdipCreateRegionRectI(rect: Long, region: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionRectI(rect.toCPointer<ByteVar>(), region.toCPointer<ByteVar>())

public actual fun GdipCreateRegionRgnData(regiondata: Long, size: Int, region: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionRgnData(regiondata.toCPointer<ByteVar>(), size, region.toCPointer<ByteVar>())

public actual fun GdipCreateSolidFill(color: UInt, brush: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateSolidFill(color, brush.toCPointer<ByteVar>())

public actual fun GdipCreateStreamOnFile(filename: PCWSTR, access: UInt, stream: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateStreamOnFile(filename.toCPointer<ByteVar>(), access, stream.toCPointer<ByteVar>())

public actual fun GdipCreateStringFormat(formatattributes: Int, language: UShort, format: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateStringFormat(formatattributes, language, format.toCPointer<ByteVar>())

public actual fun GdipCreateTexture(image: Long, wrapmode: WrapMode, texture: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateTexture(image.toCPointer<ByteVar>(), wrapmode, texture.toCPointer<ByteVar>())

public actual fun GdipCreateTexture2(image: Long, wrapmode: WrapMode, x: Float, y: Float, width: Float, height: Float, texture: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateTexture2(image.toCPointer<ByteVar>(), wrapmode, x, y, width, height, texture.toCPointer<ByteVar>())

public actual fun GdipCreateTexture2I(image: Long, wrapmode: WrapMode, x: Int, y: Int, width: Int, height: Int, texture: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateTexture2I(image.toCPointer<ByteVar>(), wrapmode, x, y, width, height, texture.toCPointer<ByteVar>())

public actual fun GdipCreateTextureIA(image: Long, imageattributes: Long, x: Float, y: Float, width: Float, height: Float, texture: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateTextureIA(image.toCPointer<ByteVar>(), imageattributes.toCPointer<ByteVar>(), x, y, width, height, texture.toCPointer<ByteVar>())

public actual fun GdipCreateTextureIAI(image: Long, imageattributes: Long, x: Int, y: Int, width: Int, height: Int, texture: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipCreateTextureIAI(image.toCPointer<ByteVar>(), imageattributes.toCPointer<ByteVar>(), x, y, width, height, texture.toCPointer<ByteVar>())

public actual fun GdipDeleteBrush(brush: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDeleteBrush(brush.toCPointer<ByteVar>())

public actual fun GdipDeleteCachedBitmap(cachedbitmap: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDeleteCachedBitmap(cachedbitmap.toCPointer<ByteVar>())

public actual fun GdipDeleteCustomLineCap(customcap: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDeleteCustomLineCap(customcap.toCPointer<ByteVar>())

public actual fun GdipDeleteEffect(effect: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDeleteEffect(effect.toCPointer<ByteVar>())

public actual fun GdipDeleteFont(font: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDeleteFont(font.toCPointer<ByteVar>())

public actual fun GdipDeleteFontFamily(fontfamily: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDeleteFontFamily(fontfamily.toCPointer<ByteVar>())

public actual fun GdipDeleteGraphics(graphics: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDeleteGraphics(graphics.toCPointer<ByteVar>())

public actual fun GdipDeleteMatrix(matrix: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDeleteMatrix(matrix.toCPointer<ByteVar>())

public actual fun GdipDeletePath(path: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDeletePath(path.toCPointer<ByteVar>())

public actual fun GdipDeletePathIter(iterator: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDeletePathIter(iterator.toCPointer<ByteVar>())

public actual fun GdipDeletePen(pen: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDeletePen(pen.toCPointer<ByteVar>())

public actual fun GdipDeletePrivateFontCollection(fontcollection: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDeletePrivateFontCollection(fontcollection.toCPointer<ByteVar>())

public actual fun GdipDeleteRegion(region: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDeleteRegion(region.toCPointer<ByteVar>())

public actual fun GdipDeleteStringFormat(format: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDeleteStringFormat(format.toCPointer<ByteVar>())

public actual fun GdipDisposeImage(image: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDisposeImage(image.toCPointer<ByteVar>())

public actual fun GdipDisposeImageAttributes(imageattr: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDisposeImageAttributes(imageattr.toCPointer<ByteVar>())

public actual fun GdipDrawArc(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawArc(graphics.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>(), x, y, width, height, startangle, sweepangle)

public actual fun GdipDrawArcI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawArcI(graphics.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>(), x, y, width, height, startangle, sweepangle)

public actual fun GdipDrawBezier(graphics: Long, pen: Long, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawBezier(graphics.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>(), x1, y1, x2, y2, x3, y3, x4, y4)

public actual fun GdipDrawBezierI(graphics: Long, pen: Long, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawBezierI(graphics.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>(), x1, y1, x2, y2, x3, y3, x4, y4)

public actual fun GdipDrawBeziers(graphics: Long, pen: Long, points: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawBeziers(graphics.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count)

public actual fun GdipDrawBeziersI(graphics: Long, pen: Long, points: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawBeziersI(graphics.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count)

public actual fun GdipDrawCachedBitmap(graphics: Long, cachedbitmap: Long, x: Int, y: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawCachedBitmap(graphics.toCPointer<ByteVar>(), cachedbitmap.toCPointer<ByteVar>(), x, y)

public actual fun GdipDrawClosedCurve(graphics: Long, pen: Long, points: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawClosedCurve(graphics.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count)

public actual fun GdipDrawClosedCurve2(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawClosedCurve2(graphics.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count, tension)

public actual fun GdipDrawClosedCurve2I(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawClosedCurve2I(graphics.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count, tension)

public actual fun GdipDrawClosedCurveI(graphics: Long, pen: Long, points: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawClosedCurveI(graphics.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count)

public actual fun GdipDrawCurve(graphics: Long, pen: Long, points: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve(graphics.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count)

public actual fun GdipDrawCurve2(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve2(graphics.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count, tension)

public actual fun GdipDrawCurve2I(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve2I(graphics.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count, tension)

public actual fun GdipDrawCurve3(graphics: Long, pen: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve3(graphics.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count, offset, numberofsegments, tension)

public actual fun GdipDrawCurve3I(graphics: Long, pen: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve3I(graphics.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count, offset, numberofsegments, tension)

public actual fun GdipDrawCurveI(graphics: Long, pen: Long, points: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawCurveI(graphics.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count)

public actual fun GdipDrawDriverString(graphics: Long, text: Long, length: Int, font: Long, brush: Long, positions: Long, flags: Int, matrix: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawDriverString(graphics.toCPointer<ByteVar>(), text.toCPointer<ByteVar>(), length, font.toCPointer<ByteVar>(), brush.toCPointer<ByteVar>(), positions.toCPointer<ByteVar>(), flags, matrix.toCPointer<ByteVar>())

public actual fun GdipDrawEllipse(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawEllipse(graphics.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>(), x, y, width, height)

public actual fun GdipDrawEllipseI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawEllipseI(graphics.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>(), x, y, width, height)

public actual fun GdipDrawImage(graphics: Long, image: Long, x: Float, y: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawImage(graphics.toCPointer<ByteVar>(), image.toCPointer<ByteVar>(), x, y)

public actual fun GdipDrawImageFX(graphics: Long, image: Long, source: Long, xform: Long, effect: Long, imageattributes: Long, srcunit: Unit): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawImageFX(graphics.toCPointer<ByteVar>(), image.toCPointer<ByteVar>(), source.toCPointer<ByteVar>(), xform.toCPointer<ByteVar>(), effect.toCPointer<ByteVar>(), imageattributes.toCPointer<ByteVar>(), srcunit)

public actual fun GdipDrawImageI(graphics: Long, image: Long, x: Int, y: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawImageI(graphics.toCPointer<ByteVar>(), image.toCPointer<ByteVar>(), x, y)

public actual fun GdipDrawImagePointRect(graphics: Long, image: Long, x: Float, y: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointRect(graphics.toCPointer<ByteVar>(), image.toCPointer<ByteVar>(), x, y, srcx, srcy, srcwidth, srcheight, srcunit)

public actual fun GdipDrawImagePointRectI(graphics: Long, image: Long, x: Int, y: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointRectI(graphics.toCPointer<ByteVar>(), image.toCPointer<ByteVar>(), x, y, srcx, srcy, srcwidth, srcheight, srcunit)

public actual fun GdipDrawImagePoints(graphics: Long, image: Long, dstpoints: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePoints(graphics.toCPointer<ByteVar>(), image.toCPointer<ByteVar>(), dstpoints.toCPointer<ByteVar>(), count)

public actual fun GdipDrawImagePointsI(graphics: Long, image: Long, dstpoints: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointsI(graphics.toCPointer<ByteVar>(), image.toCPointer<ByteVar>(), dstpoints.toCPointer<ByteVar>(), count)

public actual fun GdipDrawImagePointsRect(graphics: Long, image: Long, points: Long, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: Long, callback: Long, callbackdata: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointsRect(graphics.toCPointer<ByteVar>(), image.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count, srcx, srcy, srcwidth, srcheight, srcunit, imageattributes.toCPointer<ByteVar>(), callback, callbackdata.toCPointer<ByteVar>())

public actual fun GdipDrawImagePointsRectI(graphics: Long, image: Long, points: Long, count: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: Long, callback: Long, callbackdata: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointsRectI(graphics.toCPointer<ByteVar>(), image.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count, srcx, srcy, srcwidth, srcheight, srcunit, imageattributes.toCPointer<ByteVar>(), callback, callbackdata.toCPointer<ByteVar>())

public actual fun GdipDrawImageRect(graphics: Long, image: Long, x: Float, y: Float, width: Float, height: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawImageRect(graphics.toCPointer<ByteVar>(), image.toCPointer<ByteVar>(), x, y, width, height)

public actual fun GdipDrawImageRectI(graphics: Long, image: Long, x: Int, y: Int, width: Int, height: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawImageRectI(graphics.toCPointer<ByteVar>(), image.toCPointer<ByteVar>(), x, y, width, height)

public actual fun GdipDrawImageRectRect(graphics: Long, image: Long, dstx: Float, dsty: Float, dstwidth: Float, dstheight: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: Long, callback: Long, callbackdata: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawImageRectRect(graphics.toCPointer<ByteVar>(), image.toCPointer<ByteVar>(), dstx, dsty, dstwidth, dstheight, srcx, srcy, srcwidth, srcheight, srcunit, imageattributes.toCPointer<ByteVar>(), callback, callbackdata.toCPointer<ByteVar>())

public actual fun GdipDrawImageRectRectI(graphics: Long, image: Long, dstx: Int, dsty: Int, dstwidth: Int, dstheight: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: Long, callback: Long, callbackdata: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawImageRectRectI(graphics.toCPointer<ByteVar>(), image.toCPointer<ByteVar>(), dstx, dsty, dstwidth, dstheight, srcx, srcy, srcwidth, srcheight, srcunit, imageattributes.toCPointer<ByteVar>(), callback, callbackdata.toCPointer<ByteVar>())

public actual fun GdipDrawLine(graphics: Long, pen: Long, x1: Float, y1: Float, x2: Float, y2: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawLine(graphics.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>(), x1, y1, x2, y2)

public actual fun GdipDrawLineI(graphics: Long, pen: Long, x1: Int, y1: Int, x2: Int, y2: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawLineI(graphics.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>(), x1, y1, x2, y2)

public actual fun GdipDrawLines(graphics: Long, pen: Long, points: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawLines(graphics.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count)

public actual fun GdipDrawLinesI(graphics: Long, pen: Long, points: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawLinesI(graphics.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count)

public actual fun GdipDrawPath(graphics: Long, pen: Long, path: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawPath(graphics.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>(), path.toCPointer<ByteVar>())

public actual fun GdipDrawPie(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawPie(graphics.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>(), x, y, width, height, startangle, sweepangle)

public actual fun GdipDrawPieI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawPieI(graphics.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>(), x, y, width, height, startangle, sweepangle)

public actual fun GdipDrawPolygon(graphics: Long, pen: Long, points: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawPolygon(graphics.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count)

public actual fun GdipDrawPolygonI(graphics: Long, pen: Long, points: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawPolygonI(graphics.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count)

public actual fun GdipDrawRectangle(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawRectangle(graphics.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>(), x, y, width, height)

public actual fun GdipDrawRectangleI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawRectangleI(graphics.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>(), x, y, width, height)

public actual fun GdipDrawRectangles(graphics: Long, pen: Long, rects: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawRectangles(graphics.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>(), rects.toCPointer<ByteVar>(), count)

public actual fun GdipDrawRectanglesI(graphics: Long, pen: Long, rects: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawRectanglesI(graphics.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>(), rects.toCPointer<ByteVar>(), count)

public actual fun GdipDrawString(graphics: Long, string: PCWSTR, length: Int, font: Long, layoutrect: Long, stringformat: Long, brush: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipDrawString(graphics.toCPointer<ByteVar>(), string.toCPointer<ByteVar>(), length, font.toCPointer<ByteVar>(), layoutrect.toCPointer<ByteVar>(), stringformat.toCPointer<ByteVar>(), brush.toCPointer<ByteVar>())

public actual fun GdipEmfToWmfBits(hemf: HENHMETAFILE, cbdata16: UInt, pdata16: Long, imapmode: Int, eflags: Int): UInt =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipEmfToWmfBits(hemf.toCPointer<ByteVar>(), cbdata16, pdata16.toCPointer<ByteVar>(), imapmode, eflags)

public actual fun GdipEndContainer(graphics: Long, state: UInt): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipEndContainer(graphics.toCPointer<ByteVar>(), state)

public actual fun GdipEnumerateMetafileDestPoint(graphics: Long, metafile: Long, destpoint: Long, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestPoint(graphics.toCPointer<ByteVar>(), metafile.toCPointer<ByteVar>(), destpoint.toCPointer<ByteVar>(), callback, callbackdata.toCPointer<ByteVar>(), imageattributes.toCPointer<ByteVar>())

public actual fun GdipEnumerateMetafileDestPointI(graphics: Long, metafile: Long, destpoint: Long, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestPointI(graphics.toCPointer<ByteVar>(), metafile.toCPointer<ByteVar>(), destpoint.toCPointer<ByteVar>(), callback, callbackdata.toCPointer<ByteVar>(), imageattributes.toCPointer<ByteVar>())

public actual fun GdipEnumerateMetafileDestPoints(graphics: Long, metafile: Long, destpoints: Long, count: Int, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestPoints(graphics.toCPointer<ByteVar>(), metafile.toCPointer<ByteVar>(), destpoints.toCPointer<ByteVar>(), count, callback, callbackdata.toCPointer<ByteVar>(), imageattributes.toCPointer<ByteVar>())

public actual fun GdipEnumerateMetafileDestPointsI(graphics: Long, metafile: Long, destpoints: Long, count: Int, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestPointsI(graphics.toCPointer<ByteVar>(), metafile.toCPointer<ByteVar>(), destpoints.toCPointer<ByteVar>(), count, callback, callbackdata.toCPointer<ByteVar>(), imageattributes.toCPointer<ByteVar>())

public actual fun GdipEnumerateMetafileDestRect(graphics: Long, metafile: Long, destrect: Long, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestRect(graphics.toCPointer<ByteVar>(), metafile.toCPointer<ByteVar>(), destrect.toCPointer<ByteVar>(), callback, callbackdata.toCPointer<ByteVar>(), imageattributes.toCPointer<ByteVar>())

public actual fun GdipEnumerateMetafileDestRectI(graphics: Long, metafile: Long, destrect: Long, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestRectI(graphics.toCPointer<ByteVar>(), metafile.toCPointer<ByteVar>(), destrect.toCPointer<ByteVar>(), callback, callbackdata.toCPointer<ByteVar>(), imageattributes.toCPointer<ByteVar>())

public actual fun GdipEnumerateMetafileSrcRectDestPoint(graphics: Long, metafile: Long, destpoint: Long, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestPoint(graphics.toCPointer<ByteVar>(), metafile.toCPointer<ByteVar>(), destpoint.toCPointer<ByteVar>(), srcrect.toCPointer<ByteVar>(), srcunit, callback, callbackdata.toCPointer<ByteVar>(), imageattributes.toCPointer<ByteVar>())

public actual fun GdipEnumerateMetafileSrcRectDestPointI(graphics: Long, metafile: Long, destpoint: Long, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestPointI(graphics.toCPointer<ByteVar>(), metafile.toCPointer<ByteVar>(), destpoint.toCPointer<ByteVar>(), srcrect.toCPointer<ByteVar>(), srcunit, callback, callbackdata.toCPointer<ByteVar>(), imageattributes.toCPointer<ByteVar>())

public actual fun GdipEnumerateMetafileSrcRectDestPoints(graphics: Long, metafile: Long, destpoints: Long, count: Int, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestPoints(graphics.toCPointer<ByteVar>(), metafile.toCPointer<ByteVar>(), destpoints.toCPointer<ByteVar>(), count, srcrect.toCPointer<ByteVar>(), srcunit, callback, callbackdata.toCPointer<ByteVar>(), imageattributes.toCPointer<ByteVar>())

public actual fun GdipEnumerateMetafileSrcRectDestPointsI(graphics: Long, metafile: Long, destpoints: Long, count: Int, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestPointsI(graphics.toCPointer<ByteVar>(), metafile.toCPointer<ByteVar>(), destpoints.toCPointer<ByteVar>(), count, srcrect.toCPointer<ByteVar>(), srcunit, callback, callbackdata.toCPointer<ByteVar>(), imageattributes.toCPointer<ByteVar>())

public actual fun GdipEnumerateMetafileSrcRectDestRect(graphics: Long, metafile: Long, destrect: Long, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestRect(graphics.toCPointer<ByteVar>(), metafile.toCPointer<ByteVar>(), destrect.toCPointer<ByteVar>(), srcrect.toCPointer<ByteVar>(), srcunit, callback, callbackdata.toCPointer<ByteVar>(), imageattributes.toCPointer<ByteVar>())

public actual fun GdipEnumerateMetafileSrcRectDestRectI(graphics: Long, metafile: Long, destrect: Long, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestRectI(graphics.toCPointer<ByteVar>(), metafile.toCPointer<ByteVar>(), destrect.toCPointer<ByteVar>(), srcrect.toCPointer<ByteVar>(), srcunit, callback, callbackdata.toCPointer<ByteVar>(), imageattributes.toCPointer<ByteVar>())

public actual fun GdipFillClosedCurve(graphics: Long, brush: Long, points: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipFillClosedCurve(graphics.toCPointer<ByteVar>(), brush.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count)

public actual fun GdipFillClosedCurve2(graphics: Long, brush: Long, points: Long, count: Int, tension: Float, fillmode: FillMode): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipFillClosedCurve2(graphics.toCPointer<ByteVar>(), brush.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count, tension, fillmode)

public actual fun GdipFillClosedCurve2I(graphics: Long, brush: Long, points: Long, count: Int, tension: Float, fillmode: FillMode): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipFillClosedCurve2I(graphics.toCPointer<ByteVar>(), brush.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count, tension, fillmode)

public actual fun GdipFillClosedCurveI(graphics: Long, brush: Long, points: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipFillClosedCurveI(graphics.toCPointer<ByteVar>(), brush.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count)

public actual fun GdipFillEllipse(graphics: Long, brush: Long, x: Float, y: Float, width: Float, height: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipFillEllipse(graphics.toCPointer<ByteVar>(), brush.toCPointer<ByteVar>(), x, y, width, height)

public actual fun GdipFillEllipseI(graphics: Long, brush: Long, x: Int, y: Int, width: Int, height: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipFillEllipseI(graphics.toCPointer<ByteVar>(), brush.toCPointer<ByteVar>(), x, y, width, height)

public actual fun GdipFillPath(graphics: Long, brush: Long, path: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipFillPath(graphics.toCPointer<ByteVar>(), brush.toCPointer<ByteVar>(), path.toCPointer<ByteVar>())

public actual fun GdipFillPie(graphics: Long, brush: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipFillPie(graphics.toCPointer<ByteVar>(), brush.toCPointer<ByteVar>(), x, y, width, height, startangle, sweepangle)

public actual fun GdipFillPieI(graphics: Long, brush: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipFillPieI(graphics.toCPointer<ByteVar>(), brush.toCPointer<ByteVar>(), x, y, width, height, startangle, sweepangle)

public actual fun GdipFillPolygon(graphics: Long, brush: Long, points: Long, count: Int, fillmode: FillMode): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipFillPolygon(graphics.toCPointer<ByteVar>(), brush.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count, fillmode)

public actual fun GdipFillPolygon2(graphics: Long, brush: Long, points: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipFillPolygon2(graphics.toCPointer<ByteVar>(), brush.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count)

public actual fun GdipFillPolygon2I(graphics: Long, brush: Long, points: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipFillPolygon2I(graphics.toCPointer<ByteVar>(), brush.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count)

public actual fun GdipFillPolygonI(graphics: Long, brush: Long, points: Long, count: Int, fillmode: FillMode): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipFillPolygonI(graphics.toCPointer<ByteVar>(), brush.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count, fillmode)

public actual fun GdipFillRectangle(graphics: Long, brush: Long, x: Float, y: Float, width: Float, height: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipFillRectangle(graphics.toCPointer<ByteVar>(), brush.toCPointer<ByteVar>(), x, y, width, height)

public actual fun GdipFillRectangleI(graphics: Long, brush: Long, x: Int, y: Int, width: Int, height: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipFillRectangleI(graphics.toCPointer<ByteVar>(), brush.toCPointer<ByteVar>(), x, y, width, height)

public actual fun GdipFillRectangles(graphics: Long, brush: Long, rects: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipFillRectangles(graphics.toCPointer<ByteVar>(), brush.toCPointer<ByteVar>(), rects.toCPointer<ByteVar>(), count)

public actual fun GdipFillRectanglesI(graphics: Long, brush: Long, rects: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipFillRectanglesI(graphics.toCPointer<ByteVar>(), brush.toCPointer<ByteVar>(), rects.toCPointer<ByteVar>(), count)

public actual fun GdipFillRegion(graphics: Long, brush: Long, region: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipFillRegion(graphics.toCPointer<ByteVar>(), brush.toCPointer<ByteVar>(), region.toCPointer<ByteVar>())

public actual fun GdipFindFirstImageItem(image: Long, item: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipFindFirstImageItem(image.toCPointer<ByteVar>(), item.toCPointer<ByteVar>())

public actual fun GdipFindNextImageItem(image: Long, item: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipFindNextImageItem(image.toCPointer<ByteVar>(), item.toCPointer<ByteVar>())

public actual fun GdipFlattenPath(path: Long, matrix: Long, flatness: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipFlattenPath(path.toCPointer<ByteVar>(), matrix.toCPointer<ByteVar>(), flatness)

public actual fun GdipFlush(graphics: Long, intention: FlushIntention): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipFlush(graphics.toCPointer<ByteVar>(), intention)

public actual fun GdipFree(ptr: Long) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipFree(ptr.toCPointer<ByteVar>())
}

public actual fun GdipGetAdjustableArrowCapFillState(cap: Long, fillstate: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetAdjustableArrowCapFillState(cap.toCPointer<ByteVar>(), fillstate.toCPointer<ByteVar>())

public actual fun GdipGetAdjustableArrowCapHeight(cap: Long, height: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetAdjustableArrowCapHeight(cap.toCPointer<ByteVar>(), height.toCPointer<ByteVar>())

public actual fun GdipGetAdjustableArrowCapMiddleInset(cap: Long, middleinset: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetAdjustableArrowCapMiddleInset(cap.toCPointer<ByteVar>(), middleinset.toCPointer<ByteVar>())

public actual fun GdipGetAdjustableArrowCapWidth(cap: Long, width: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetAdjustableArrowCapWidth(cap.toCPointer<ByteVar>(), width.toCPointer<ByteVar>())

public actual fun GdipGetAllPropertyItems(image: Long, totalbuffersize: UInt, numproperties: UInt, allitems: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetAllPropertyItems(image.toCPointer<ByteVar>(), totalbuffersize, numproperties, allitems.toCPointer<ByteVar>())

public actual fun GdipGetBrushType(brush: Long, type: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetBrushType(brush.toCPointer<ByteVar>(), type.toCPointer<ByteVar>())

public actual fun GdipGetCellAscent(family: Long, style: Int, cellascent: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetCellAscent(family.toCPointer<ByteVar>(), style, cellascent.toCPointer<ByteVar>())

public actual fun GdipGetCellDescent(family: Long, style: Int, celldescent: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetCellDescent(family.toCPointer<ByteVar>(), style, celldescent.toCPointer<ByteVar>())

public actual fun GdipGetClip(graphics: Long, region: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetClip(graphics.toCPointer<ByteVar>(), region.toCPointer<ByteVar>())

public actual fun GdipGetClipBounds(graphics: Long, rect: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetClipBounds(graphics.toCPointer<ByteVar>(), rect.toCPointer<ByteVar>())

public actual fun GdipGetClipBoundsI(graphics: Long, rect: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetClipBoundsI(graphics.toCPointer<ByteVar>(), rect.toCPointer<ByteVar>())

public actual fun GdipGetCompositingMode(graphics: Long, compositingmode: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetCompositingMode(graphics.toCPointer<ByteVar>(), compositingmode.toCPointer<ByteVar>())

public actual fun GdipGetCompositingQuality(graphics: Long, compositingquality: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetCompositingQuality(graphics.toCPointer<ByteVar>(), compositingquality.toCPointer<ByteVar>())

public actual fun GdipGetCustomLineCapBaseCap(customcap: Long, basecap: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapBaseCap(customcap.toCPointer<ByteVar>(), basecap.toCPointer<ByteVar>())

public actual fun GdipGetCustomLineCapBaseInset(customcap: Long, inset: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapBaseInset(customcap.toCPointer<ByteVar>(), inset.toCPointer<ByteVar>())

public actual fun GdipGetCustomLineCapStrokeCaps(customcap: Long, startcap: Long, endcap: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapStrokeCaps(customcap.toCPointer<ByteVar>(), startcap.toCPointer<ByteVar>(), endcap.toCPointer<ByteVar>())

public actual fun GdipGetCustomLineCapStrokeJoin(customcap: Long, linejoin: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapStrokeJoin(customcap.toCPointer<ByteVar>(), linejoin.toCPointer<ByteVar>())

public actual fun GdipGetCustomLineCapType(customcap: Long, captype: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapType(customcap.toCPointer<ByteVar>(), captype.toCPointer<ByteVar>())

public actual fun GdipGetCustomLineCapWidthScale(customcap: Long, widthscale: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapWidthScale(customcap.toCPointer<ByteVar>(), widthscale.toCPointer<ByteVar>())

public actual fun GdipGetDC(graphics: Long, hdc: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetDC(graphics.toCPointer<ByteVar>(), hdc.toCPointer<ByteVar>())

public actual fun GdipGetDpiX(graphics: Long, dpi: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetDpiX(graphics.toCPointer<ByteVar>(), dpi.toCPointer<ByteVar>())

public actual fun GdipGetDpiY(graphics: Long, dpi: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetDpiY(graphics.toCPointer<ByteVar>(), dpi.toCPointer<ByteVar>())

public actual fun GdipGetEffectParameterSize(effect: Long, size: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetEffectParameterSize(effect.toCPointer<ByteVar>(), size.toCPointer<ByteVar>())

public actual fun GdipGetEffectParameters(effect: Long, size: Long, params: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetEffectParameters(effect.toCPointer<ByteVar>(), size.toCPointer<ByteVar>(), params.toCPointer<ByteVar>())

public actual fun GdipGetEmHeight(family: Long, style: Int, emheight: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetEmHeight(family.toCPointer<ByteVar>(), style, emheight.toCPointer<ByteVar>())

public actual fun GdipGetEncoderParameterList(image: Long, clsidencoder: Long, size: UInt, buffer: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetEncoderParameterList(image.toCPointer<ByteVar>(), clsidencoder.toCPointer<ByteVar>(), size, buffer.toCPointer<ByteVar>())

public actual fun GdipGetEncoderParameterListSize(image: Long, clsidencoder: Long, size: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetEncoderParameterListSize(image.toCPointer<ByteVar>(), clsidencoder.toCPointer<ByteVar>(), size.toCPointer<ByteVar>())

public actual fun GdipGetFamily(font: Long, family: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetFamily(font.toCPointer<ByteVar>(), family.toCPointer<ByteVar>())

public actual fun GdipGetFamilyName(family: Long, name: PWSTR, language: UShort): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetFamilyName(family.toCPointer<ByteVar>(), name.toCPointer<ByteVar>(), language)

public actual fun GdipGetFontCollectionFamilyCount(fontcollection: Long, numfound: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetFontCollectionFamilyCount(fontcollection.toCPointer<ByteVar>(), numfound.toCPointer<ByteVar>())

public actual fun GdipGetFontCollectionFamilyList(fontcollection: Long, numsought: Int, gpfamilies: Long, numfound: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetFontCollectionFamilyList(fontcollection.toCPointer<ByteVar>(), numsought, gpfamilies.toCPointer<ByteVar>(), numfound.toCPointer<ByteVar>())

public actual fun GdipGetFontHeight(font: Long, graphics: Long, height: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetFontHeight(font.toCPointer<ByteVar>(), graphics.toCPointer<ByteVar>(), height.toCPointer<ByteVar>())

public actual fun GdipGetFontHeightGivenDPI(font: Long, dpi: Float, height: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetFontHeightGivenDPI(font.toCPointer<ByteVar>(), dpi, height.toCPointer<ByteVar>())

public actual fun GdipGetFontSize(font: Long, size: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetFontSize(font.toCPointer<ByteVar>(), size.toCPointer<ByteVar>())

public actual fun GdipGetFontStyle(font: Long, style: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetFontStyle(font.toCPointer<ByteVar>(), style.toCPointer<ByteVar>())

public actual fun GdipGetFontUnit(font: Long, unit: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetFontUnit(font.toCPointer<ByteVar>(), unit.toCPointer<ByteVar>())

public actual fun GdipGetGenericFontFamilyMonospace(nativefamily: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetGenericFontFamilyMonospace(nativefamily.toCPointer<ByteVar>())

public actual fun GdipGetGenericFontFamilySansSerif(nativefamily: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetGenericFontFamilySansSerif(nativefamily.toCPointer<ByteVar>())

public actual fun GdipGetGenericFontFamilySerif(nativefamily: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetGenericFontFamilySerif(nativefamily.toCPointer<ByteVar>())

public actual fun GdipGetHatchBackgroundColor(brush: Long, backcol: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetHatchBackgroundColor(brush.toCPointer<ByteVar>(), backcol.toCPointer<ByteVar>())

public actual fun GdipGetHatchForegroundColor(brush: Long, forecol: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetHatchForegroundColor(brush.toCPointer<ByteVar>(), forecol.toCPointer<ByteVar>())

public actual fun GdipGetHatchStyle(brush: Long, hatchstyle: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetHatchStyle(brush.toCPointer<ByteVar>(), hatchstyle.toCPointer<ByteVar>())

public actual fun GdipGetHemfFromMetafile(metafile: Long, hemf: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetHemfFromMetafile(metafile.toCPointer<ByteVar>(), hemf.toCPointer<ByteVar>())

public actual fun GdipGetImageAttributesAdjustedPalette(imageattr: Long, colorpalette: Long, coloradjusttype: ColorAdjustType): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetImageAttributesAdjustedPalette(imageattr.toCPointer<ByteVar>(), colorpalette.toCPointer<ByteVar>(), coloradjusttype)

public actual fun GdipGetImageBounds(image: Long, srcrect: Long, srcunit: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetImageBounds(image.toCPointer<ByteVar>(), srcrect.toCPointer<ByteVar>(), srcunit.toCPointer<ByteVar>())

public actual fun GdipGetImageDecoders(numdecoders: UInt, size: UInt, decoders: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetImageDecoders(numdecoders, size, decoders.toCPointer<ByteVar>())

public actual fun GdipGetImageDecodersSize(numdecoders: Long, size: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetImageDecodersSize(numdecoders.toCPointer<ByteVar>(), size.toCPointer<ByteVar>())

public actual fun GdipGetImageDimension(image: Long, width: Long, height: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetImageDimension(image.toCPointer<ByteVar>(), width.toCPointer<ByteVar>(), height.toCPointer<ByteVar>())

public actual fun GdipGetImageEncoders(numencoders: UInt, size: UInt, encoders: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetImageEncoders(numencoders, size, encoders.toCPointer<ByteVar>())

public actual fun GdipGetImageEncodersSize(numencoders: Long, size: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetImageEncodersSize(numencoders.toCPointer<ByteVar>(), size.toCPointer<ByteVar>())

public actual fun GdipGetImageFlags(image: Long, flags: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetImageFlags(image.toCPointer<ByteVar>(), flags.toCPointer<ByteVar>())

public actual fun GdipGetImageGraphicsContext(image: Long, graphics: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetImageGraphicsContext(image.toCPointer<ByteVar>(), graphics.toCPointer<ByteVar>())

public actual fun GdipGetImageHeight(image: Long, height: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetImageHeight(image.toCPointer<ByteVar>(), height.toCPointer<ByteVar>())

public actual fun GdipGetImageHorizontalResolution(image: Long, resolution: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetImageHorizontalResolution(image.toCPointer<ByteVar>(), resolution.toCPointer<ByteVar>())

public actual fun GdipGetImageItemData(image: Long, item: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetImageItemData(image.toCPointer<ByteVar>(), item.toCPointer<ByteVar>())

public actual fun GdipGetImagePalette(image: Long, palette: Long, size: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetImagePalette(image.toCPointer<ByteVar>(), palette.toCPointer<ByteVar>(), size)

public actual fun GdipGetImagePaletteSize(image: Long, size: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetImagePaletteSize(image.toCPointer<ByteVar>(), size.toCPointer<ByteVar>())

public actual fun GdipGetImagePixelFormat(image: Long, format: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetImagePixelFormat(image.toCPointer<ByteVar>(), format.toCPointer<ByteVar>())

public actual fun GdipGetImageRawFormat(image: Long, format: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetImageRawFormat(image.toCPointer<ByteVar>(), format.toCPointer<ByteVar>())

public actual fun GdipGetImageThumbnail(image: Long, thumbwidth: UInt, thumbheight: UInt, thumbimage: Long, callback: Long, callbackdata: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetImageThumbnail(image.toCPointer<ByteVar>(), thumbwidth, thumbheight, thumbimage.toCPointer<ByteVar>(), callback, callbackdata.toCPointer<ByteVar>())

public actual fun GdipGetImageType(image: Long, type: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetImageType(image.toCPointer<ByteVar>(), type.toCPointer<ByteVar>())

public actual fun GdipGetImageVerticalResolution(image: Long, resolution: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetImageVerticalResolution(image.toCPointer<ByteVar>(), resolution.toCPointer<ByteVar>())

public actual fun GdipGetImageWidth(image: Long, width: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetImageWidth(image.toCPointer<ByteVar>(), width.toCPointer<ByteVar>())

public actual fun GdipGetInterpolationMode(graphics: Long, interpolationmode: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetInterpolationMode(graphics.toCPointer<ByteVar>(), interpolationmode.toCPointer<ByteVar>())

public actual fun GdipGetLineBlend(brush: Long, blend: Long, positions: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetLineBlend(brush.toCPointer<ByteVar>(), blend.toCPointer<ByteVar>(), positions.toCPointer<ByteVar>(), count)

public actual fun GdipGetLineBlendCount(brush: Long, count: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetLineBlendCount(brush.toCPointer<ByteVar>(), count.toCPointer<ByteVar>())

public actual fun GdipGetLineColors(brush: Long, colors: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetLineColors(brush.toCPointer<ByteVar>(), colors.toCPointer<ByteVar>())

public actual fun GdipGetLineGammaCorrection(brush: Long, usegammacorrection: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetLineGammaCorrection(brush.toCPointer<ByteVar>(), usegammacorrection.toCPointer<ByteVar>())

public actual fun GdipGetLinePresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetLinePresetBlend(brush.toCPointer<ByteVar>(), blend.toCPointer<ByteVar>(), positions.toCPointer<ByteVar>(), count)

public actual fun GdipGetLinePresetBlendCount(brush: Long, count: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetLinePresetBlendCount(brush.toCPointer<ByteVar>(), count.toCPointer<ByteVar>())

public actual fun GdipGetLineRect(brush: Long, rect: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetLineRect(brush.toCPointer<ByteVar>(), rect.toCPointer<ByteVar>())

public actual fun GdipGetLineRectI(brush: Long, rect: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetLineRectI(brush.toCPointer<ByteVar>(), rect.toCPointer<ByteVar>())

public actual fun GdipGetLineSpacing(family: Long, style: Int, linespacing: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetLineSpacing(family.toCPointer<ByteVar>(), style, linespacing.toCPointer<ByteVar>())

public actual fun GdipGetLineTransform(brush: Long, matrix: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetLineTransform(brush.toCPointer<ByteVar>(), matrix.toCPointer<ByteVar>())

public actual fun GdipGetLineWrapMode(brush: Long, wrapmode: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetLineWrapMode(brush.toCPointer<ByteVar>(), wrapmode.toCPointer<ByteVar>())

public actual fun GdipGetLogFontA(font: Long, graphics: Long, logfonta: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetLogFontA(font.toCPointer<ByteVar>(), graphics.toCPointer<ByteVar>(), logfonta.toCPointer<ByteVar>())

public actual fun GdipGetLogFontW(font: Long, graphics: Long, logfontw: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetLogFontW(font.toCPointer<ByteVar>(), graphics.toCPointer<ByteVar>(), logfontw.toCPointer<ByteVar>())

public actual fun GdipGetMatrixElements(matrix: Long, matrixout: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetMatrixElements(matrix.toCPointer<ByteVar>(), matrixout.toCPointer<ByteVar>())

public actual fun GdipGetMetafileDownLevelRasterizationLimit(metafile: Long, metafilerasterizationlimitdpi: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileDownLevelRasterizationLimit(metafile.toCPointer<ByteVar>(), metafilerasterizationlimitdpi.toCPointer<ByteVar>())

public actual fun GdipGetMetafileHeaderFromEmf(hemf: HENHMETAFILE, header: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromEmf(hemf.toCPointer<ByteVar>(), header.toCPointer<ByteVar>())

public actual fun GdipGetMetafileHeaderFromFile(filename: PCWSTR, header: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromFile(filename.toCPointer<ByteVar>(), header.toCPointer<ByteVar>())

public actual fun GdipGetMetafileHeaderFromMetafile(metafile: Long, header: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromMetafile(metafile.toCPointer<ByteVar>(), header.toCPointer<ByteVar>())

public actual fun GdipGetMetafileHeaderFromStream(stream: Long, header: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromStream(stream.toCPointer<ByteVar>(), header.toCPointer<ByteVar>())

public actual fun GdipGetMetafileHeaderFromWmf(hwmf: HMETAFILE, wmfplaceablefileheader: Long, header: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromWmf(hwmf.toCPointer<ByteVar>(), wmfplaceablefileheader.toCPointer<ByteVar>(), header.toCPointer<ByteVar>())

public actual fun GdipGetNearestColor(graphics: Long, argb: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetNearestColor(graphics.toCPointer<ByteVar>(), argb.toCPointer<ByteVar>())

public actual fun GdipGetPageScale(graphics: Long, scale: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPageScale(graphics.toCPointer<ByteVar>(), scale.toCPointer<ByteVar>())

public actual fun GdipGetPageUnit(graphics: Long, unit: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPageUnit(graphics.toCPointer<ByteVar>(), unit.toCPointer<ByteVar>())

public actual fun GdipGetPathData(path: Long, pathdata: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPathData(path.toCPointer<ByteVar>(), pathdata.toCPointer<ByteVar>())

public actual fun GdipGetPathFillMode(path: Long, fillmode: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPathFillMode(path.toCPointer<ByteVar>(), fillmode.toCPointer<ByteVar>())

public actual fun GdipGetPathGradientBlend(brush: Long, blend: Long, positions: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientBlend(brush.toCPointer<ByteVar>(), blend.toCPointer<ByteVar>(), positions.toCPointer<ByteVar>(), count)

public actual fun GdipGetPathGradientBlendCount(brush: Long, count: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientBlendCount(brush.toCPointer<ByteVar>(), count.toCPointer<ByteVar>())

public actual fun GdipGetPathGradientCenterColor(brush: Long, colors: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientCenterColor(brush.toCPointer<ByteVar>(), colors.toCPointer<ByteVar>())

public actual fun GdipGetPathGradientCenterPoint(brush: Long, points: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientCenterPoint(brush.toCPointer<ByteVar>(), points.toCPointer<ByteVar>())

public actual fun GdipGetPathGradientCenterPointI(brush: Long, points: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientCenterPointI(brush.toCPointer<ByteVar>(), points.toCPointer<ByteVar>())

public actual fun GdipGetPathGradientFocusScales(brush: Long, xscale: Long, yscale: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientFocusScales(brush.toCPointer<ByteVar>(), xscale.toCPointer<ByteVar>(), yscale.toCPointer<ByteVar>())

public actual fun GdipGetPathGradientGammaCorrection(brush: Long, usegammacorrection: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientGammaCorrection(brush.toCPointer<ByteVar>(), usegammacorrection.toCPointer<ByteVar>())

public actual fun GdipGetPathGradientPath(brush: Long, path: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientPath(brush.toCPointer<ByteVar>(), path.toCPointer<ByteVar>())

public actual fun GdipGetPathGradientPointCount(brush: Long, count: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientPointCount(brush.toCPointer<ByteVar>(), count.toCPointer<ByteVar>())

public actual fun GdipGetPathGradientPresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientPresetBlend(brush.toCPointer<ByteVar>(), blend.toCPointer<ByteVar>(), positions.toCPointer<ByteVar>(), count)

public actual fun GdipGetPathGradientPresetBlendCount(brush: Long, count: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientPresetBlendCount(brush.toCPointer<ByteVar>(), count.toCPointer<ByteVar>())

public actual fun GdipGetPathGradientRect(brush: Long, rect: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientRect(brush.toCPointer<ByteVar>(), rect.toCPointer<ByteVar>())

public actual fun GdipGetPathGradientRectI(brush: Long, rect: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientRectI(brush.toCPointer<ByteVar>(), rect.toCPointer<ByteVar>())

public actual fun GdipGetPathGradientSurroundColorCount(brush: Long, count: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientSurroundColorCount(brush.toCPointer<ByteVar>(), count.toCPointer<ByteVar>())

public actual fun GdipGetPathGradientSurroundColorsWithCount(brush: Long, color: Long, count: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientSurroundColorsWithCount(brush.toCPointer<ByteVar>(), color.toCPointer<ByteVar>(), count.toCPointer<ByteVar>())

public actual fun GdipGetPathGradientTransform(brush: Long, matrix: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientTransform(brush.toCPointer<ByteVar>(), matrix.toCPointer<ByteVar>())

public actual fun GdipGetPathGradientWrapMode(brush: Long, wrapmode: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientWrapMode(brush.toCPointer<ByteVar>(), wrapmode.toCPointer<ByteVar>())

public actual fun GdipGetPathLastPoint(path: Long, lastpoint: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPathLastPoint(path.toCPointer<ByteVar>(), lastpoint.toCPointer<ByteVar>())

public actual fun GdipGetPathPoints(param0: Long, points: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPathPoints(param0.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count)

public actual fun GdipGetPathPointsI(param0: Long, points: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPathPointsI(param0.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count)

public actual fun GdipGetPathTypes(path: Long, types: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPathTypes(path.toCPointer<ByteVar>(), types.toCPointer<ByteVar>(), count)

public actual fun GdipGetPathWorldBounds(path: Long, bounds: Long, matrix: Long, pen: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPathWorldBounds(path.toCPointer<ByteVar>(), bounds.toCPointer<ByteVar>(), matrix.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>())

public actual fun GdipGetPathWorldBoundsI(path: Long, bounds: Long, matrix: Long, pen: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPathWorldBoundsI(path.toCPointer<ByteVar>(), bounds.toCPointer<ByteVar>(), matrix.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>())

public actual fun GdipGetPenBrushFill(pen: Long, brush: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPenBrushFill(pen.toCPointer<ByteVar>(), brush.toCPointer<ByteVar>())

public actual fun GdipGetPenColor(pen: Long, argb: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPenColor(pen.toCPointer<ByteVar>(), argb.toCPointer<ByteVar>())

public actual fun GdipGetPenCompoundArray(pen: Long, dash: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPenCompoundArray(pen.toCPointer<ByteVar>(), dash.toCPointer<ByteVar>(), count)

public actual fun GdipGetPenCompoundCount(pen: Long, count: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPenCompoundCount(pen.toCPointer<ByteVar>(), count.toCPointer<ByteVar>())

public actual fun GdipGetPenCustomEndCap(pen: Long, customcap: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPenCustomEndCap(pen.toCPointer<ByteVar>(), customcap.toCPointer<ByteVar>())

public actual fun GdipGetPenCustomStartCap(pen: Long, customcap: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPenCustomStartCap(pen.toCPointer<ByteVar>(), customcap.toCPointer<ByteVar>())

public actual fun GdipGetPenDashArray(pen: Long, dash: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashArray(pen.toCPointer<ByteVar>(), dash.toCPointer<ByteVar>(), count)

public actual fun GdipGetPenDashCap197819(pen: Long, dashcap: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashCap197819(pen.toCPointer<ByteVar>(), dashcap.toCPointer<ByteVar>())

public actual fun GdipGetPenDashCount(pen: Long, count: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashCount(pen.toCPointer<ByteVar>(), count.toCPointer<ByteVar>())

public actual fun GdipGetPenDashOffset(pen: Long, offset: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashOffset(pen.toCPointer<ByteVar>(), offset.toCPointer<ByteVar>())

public actual fun GdipGetPenDashStyle(pen: Long, dashstyle: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashStyle(pen.toCPointer<ByteVar>(), dashstyle.toCPointer<ByteVar>())

public actual fun GdipGetPenEndCap(pen: Long, endcap: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPenEndCap(pen.toCPointer<ByteVar>(), endcap.toCPointer<ByteVar>())

public actual fun GdipGetPenFillType(pen: Long, type: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPenFillType(pen.toCPointer<ByteVar>(), type.toCPointer<ByteVar>())

public actual fun GdipGetPenLineJoin(pen: Long, linejoin: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPenLineJoin(pen.toCPointer<ByteVar>(), linejoin.toCPointer<ByteVar>())

public actual fun GdipGetPenMiterLimit(pen: Long, miterlimit: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPenMiterLimit(pen.toCPointer<ByteVar>(), miterlimit.toCPointer<ByteVar>())

public actual fun GdipGetPenMode(pen: Long, penmode: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPenMode(pen.toCPointer<ByteVar>(), penmode.toCPointer<ByteVar>())

public actual fun GdipGetPenStartCap(pen: Long, startcap: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPenStartCap(pen.toCPointer<ByteVar>(), startcap.toCPointer<ByteVar>())

public actual fun GdipGetPenTransform(pen: Long, matrix: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPenTransform(pen.toCPointer<ByteVar>(), matrix.toCPointer<ByteVar>())

public actual fun GdipGetPenUnit(pen: Long, unit: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPenUnit(pen.toCPointer<ByteVar>(), unit.toCPointer<ByteVar>())

public actual fun GdipGetPenWidth(pen: Long, width: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPenWidth(pen.toCPointer<ByteVar>(), width.toCPointer<ByteVar>())

public actual fun GdipGetPixelOffsetMode(graphics: Long, pixeloffsetmode: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPixelOffsetMode(graphics.toCPointer<ByteVar>(), pixeloffsetmode.toCPointer<ByteVar>())

public actual fun GdipGetPointCount(path: Long, count: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPointCount(path.toCPointer<ByteVar>(), count.toCPointer<ByteVar>())

public actual fun GdipGetPropertyCount(image: Long, numofproperty: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPropertyCount(image.toCPointer<ByteVar>(), numofproperty.toCPointer<ByteVar>())

public actual fun GdipGetPropertyIdList(image: Long, numofproperty: UInt, list: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPropertyIdList(image.toCPointer<ByteVar>(), numofproperty, list.toCPointer<ByteVar>())

public actual fun GdipGetPropertyItem(image: Long, propid: UInt, propsize: UInt, buffer: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPropertyItem(image.toCPointer<ByteVar>(), propid, propsize, buffer.toCPointer<ByteVar>())

public actual fun GdipGetPropertyItemSize(image: Long, propid: UInt, size: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPropertyItemSize(image.toCPointer<ByteVar>(), propid, size.toCPointer<ByteVar>())

public actual fun GdipGetPropertySize(image: Long, totalbuffersize: Long, numproperties: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetPropertySize(image.toCPointer<ByteVar>(), totalbuffersize.toCPointer<ByteVar>(), numproperties.toCPointer<ByteVar>())

public actual fun GdipGetRegionBounds(region: Long, graphics: Long, rect: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetRegionBounds(region.toCPointer<ByteVar>(), graphics.toCPointer<ByteVar>(), rect.toCPointer<ByteVar>())

public actual fun GdipGetRegionBoundsI(region: Long, graphics: Long, rect: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetRegionBoundsI(region.toCPointer<ByteVar>(), graphics.toCPointer<ByteVar>(), rect.toCPointer<ByteVar>())

public actual fun GdipGetRegionData(region: Long, buffer: Long, buffersize: UInt, sizefilled: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetRegionData(region.toCPointer<ByteVar>(), buffer.toCPointer<ByteVar>(), buffersize, sizefilled.toCPointer<ByteVar>())

public actual fun GdipGetRegionDataSize(region: Long, buffersize: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetRegionDataSize(region.toCPointer<ByteVar>(), buffersize.toCPointer<ByteVar>())

public actual fun GdipGetRegionHRgn(region: Long, graphics: Long, hrgn: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetRegionHRgn(region.toCPointer<ByteVar>(), graphics.toCPointer<ByteVar>(), hrgn.toCPointer<ByteVar>())

public actual fun GdipGetRegionScans(region: Long, rects: Long, count: Long, matrix: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetRegionScans(region.toCPointer<ByteVar>(), rects.toCPointer<ByteVar>(), count.toCPointer<ByteVar>(), matrix.toCPointer<ByteVar>())

public actual fun GdipGetRegionScansCount(region: Long, count: Long, matrix: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetRegionScansCount(region.toCPointer<ByteVar>(), count.toCPointer<ByteVar>(), matrix.toCPointer<ByteVar>())

public actual fun GdipGetRegionScansI(region: Long, rects: Long, count: Long, matrix: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetRegionScansI(region.toCPointer<ByteVar>(), rects.toCPointer<ByteVar>(), count.toCPointer<ByteVar>(), matrix.toCPointer<ByteVar>())

public actual fun GdipGetRenderingOrigin(graphics: Long, x: Long, y: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetRenderingOrigin(graphics.toCPointer<ByteVar>(), x.toCPointer<ByteVar>(), y.toCPointer<ByteVar>())

public actual fun GdipGetSmoothingMode(graphics: Long, smoothingmode: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetSmoothingMode(graphics.toCPointer<ByteVar>(), smoothingmode.toCPointer<ByteVar>())

public actual fun GdipGetSolidFillColor(brush: Long, color: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetSolidFillColor(brush.toCPointer<ByteVar>(), color.toCPointer<ByteVar>())

public actual fun GdipGetStringFormatAlign(format: Long, align: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatAlign(format.toCPointer<ByteVar>(), align.toCPointer<ByteVar>())

public actual fun GdipGetStringFormatDigitSubstitution(format: Long, language: Long, substitute: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatDigitSubstitution(format.toCPointer<ByteVar>(), language.toCPointer<ByteVar>(), substitute.toCPointer<ByteVar>())

public actual fun GdipGetStringFormatFlags(format: Long, flags: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatFlags(format.toCPointer<ByteVar>(), flags.toCPointer<ByteVar>())

public actual fun GdipGetStringFormatHotkeyPrefix(format: Long, hotkeyprefix: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatHotkeyPrefix(format.toCPointer<ByteVar>(), hotkeyprefix.toCPointer<ByteVar>())

public actual fun GdipGetStringFormatLineAlign(format: Long, align: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatLineAlign(format.toCPointer<ByteVar>(), align.toCPointer<ByteVar>())

public actual fun GdipGetStringFormatMeasurableCharacterRangeCount(format: Long, count: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatMeasurableCharacterRangeCount(format.toCPointer<ByteVar>(), count.toCPointer<ByteVar>())

public actual fun GdipGetStringFormatTabStopCount(format: Long, count: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatTabStopCount(format.toCPointer<ByteVar>(), count.toCPointer<ByteVar>())

public actual fun GdipGetStringFormatTabStops(format: Long, count: Int, firsttaboffset: Long, tabstops: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatTabStops(format.toCPointer<ByteVar>(), count, firsttaboffset.toCPointer<ByteVar>(), tabstops.toCPointer<ByteVar>())

public actual fun GdipGetStringFormatTrimming(format: Long, trimming: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatTrimming(format.toCPointer<ByteVar>(), trimming.toCPointer<ByteVar>())

public actual fun GdipGetTextContrast(graphics: Long, contrast: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetTextContrast(graphics.toCPointer<ByteVar>(), contrast.toCPointer<ByteVar>())

public actual fun GdipGetTextRenderingHint(graphics: Long, mode: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetTextRenderingHint(graphics.toCPointer<ByteVar>(), mode.toCPointer<ByteVar>())

public actual fun GdipGetTextureImage(brush: Long, image: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetTextureImage(brush.toCPointer<ByteVar>(), image.toCPointer<ByteVar>())

public actual fun GdipGetTextureTransform(brush: Long, matrix: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetTextureTransform(brush.toCPointer<ByteVar>(), matrix.toCPointer<ByteVar>())

public actual fun GdipGetTextureWrapMode(brush: Long, wrapmode: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetTextureWrapMode(brush.toCPointer<ByteVar>(), wrapmode.toCPointer<ByteVar>())

public actual fun GdipGetVisibleClipBounds(graphics: Long, rect: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetVisibleClipBounds(graphics.toCPointer<ByteVar>(), rect.toCPointer<ByteVar>())

public actual fun GdipGetVisibleClipBoundsI(graphics: Long, rect: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetVisibleClipBoundsI(graphics.toCPointer<ByteVar>(), rect.toCPointer<ByteVar>())

public actual fun GdipGetWorldTransform(graphics: Long, matrix: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGetWorldTransform(graphics.toCPointer<ByteVar>(), matrix.toCPointer<ByteVar>())

public actual fun GdipGraphicsClear(graphics: Long, color: UInt): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGraphicsClear(graphics.toCPointer<ByteVar>(), color)

public actual fun GdipGraphicsSetAbort(pgraphics: Long, piabort: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipGraphicsSetAbort(pgraphics.toCPointer<ByteVar>(), piabort.toCPointer<ByteVar>())

public actual fun GdipImageForceValidation(image: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipImageForceValidation(image.toCPointer<ByteVar>())

public actual fun GdipImageGetFrameCount(image: Long, dimensionid: Long, count: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipImageGetFrameCount(image.toCPointer<ByteVar>(), dimensionid.toCPointer<ByteVar>(), count.toCPointer<ByteVar>())

public actual fun GdipImageGetFrameDimensionsCount(image: Long, count: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipImageGetFrameDimensionsCount(image.toCPointer<ByteVar>(), count.toCPointer<ByteVar>())

public actual fun GdipImageGetFrameDimensionsList(image: Long, dimensionids: Long, count: UInt): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipImageGetFrameDimensionsList(image.toCPointer<ByteVar>(), dimensionids.toCPointer<ByteVar>(), count)

public actual fun GdipImageRotateFlip(image: Long, rftype: RotateFlipType): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipImageRotateFlip(image.toCPointer<ByteVar>(), rftype)

public actual fun GdipImageSelectActiveFrame(image: Long, dimensionid: Long, frameindex: UInt): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipImageSelectActiveFrame(image.toCPointer<ByteVar>(), dimensionid.toCPointer<ByteVar>(), frameindex)

public actual fun GdipImageSetAbort(pimage: Long, piabort: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipImageSetAbort(pimage.toCPointer<ByteVar>(), piabort.toCPointer<ByteVar>())

public actual fun GdipInitializePalette(palette: Long, palettetype: PaletteType, optimalcolors: Int, usetransparentcolor: BOOL, bitmap: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipInitializePalette(palette.toCPointer<ByteVar>(), palettetype, optimalcolors, usetransparentcolor, bitmap.toCPointer<ByteVar>())

public actual fun GdipInvertMatrix(matrix: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipInvertMatrix(matrix.toCPointer<ByteVar>())

public actual fun GdipIsClipEmpty(graphics: Long, result: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipIsClipEmpty(graphics.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun GdipIsEmptyRegion(region: Long, graphics: Long, result: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipIsEmptyRegion(region.toCPointer<ByteVar>(), graphics.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun GdipIsEqualRegion(region: Long, region2: Long, graphics: Long, result: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipIsEqualRegion(region.toCPointer<ByteVar>(), region2.toCPointer<ByteVar>(), graphics.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun GdipIsInfiniteRegion(region: Long, graphics: Long, result: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipIsInfiniteRegion(region.toCPointer<ByteVar>(), graphics.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun GdipIsMatrixEqual(matrix: Long, matrix2: Long, result: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipIsMatrixEqual(matrix.toCPointer<ByteVar>(), matrix2.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun GdipIsMatrixIdentity(matrix: Long, result: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipIsMatrixIdentity(matrix.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun GdipIsMatrixInvertible(matrix: Long, result: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipIsMatrixInvertible(matrix.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun GdipIsOutlineVisiblePathPoint(path: Long, x: Float, y: Float, pen: Long, graphics: Long, result: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipIsOutlineVisiblePathPoint(path.toCPointer<ByteVar>(), x, y, pen.toCPointer<ByteVar>(), graphics.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun GdipIsOutlineVisiblePathPointI(path: Long, x: Int, y: Int, pen: Long, graphics: Long, result: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipIsOutlineVisiblePathPointI(path.toCPointer<ByteVar>(), x, y, pen.toCPointer<ByteVar>(), graphics.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun GdipIsStyleAvailable(family: Long, style: Int, isstyleavailable: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipIsStyleAvailable(family.toCPointer<ByteVar>(), style, isstyleavailable.toCPointer<ByteVar>())

public actual fun GdipIsVisibleClipEmpty(graphics: Long, result: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleClipEmpty(graphics.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun GdipIsVisiblePathPoint(path: Long, x: Float, y: Float, graphics: Long, result: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipIsVisiblePathPoint(path.toCPointer<ByteVar>(), x, y, graphics.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun GdipIsVisiblePathPointI(path: Long, x: Int, y: Int, graphics: Long, result: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipIsVisiblePathPointI(path.toCPointer<ByteVar>(), x, y, graphics.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun GdipIsVisiblePoint(graphics: Long, x: Float, y: Float, result: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipIsVisiblePoint(graphics.toCPointer<ByteVar>(), x, y, result.toCPointer<ByteVar>())

public actual fun GdipIsVisiblePointI(graphics: Long, x: Int, y: Int, result: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipIsVisiblePointI(graphics.toCPointer<ByteVar>(), x, y, result.toCPointer<ByteVar>())

public actual fun GdipIsVisibleRect(graphics: Long, x: Float, y: Float, width: Float, height: Float, result: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRect(graphics.toCPointer<ByteVar>(), x, y, width, height, result.toCPointer<ByteVar>())

public actual fun GdipIsVisibleRectI(graphics: Long, x: Int, y: Int, width: Int, height: Int, result: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRectI(graphics.toCPointer<ByteVar>(), x, y, width, height, result.toCPointer<ByteVar>())

public actual fun GdipIsVisibleRegionPoint(region: Long, x: Float, y: Float, graphics: Long, result: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRegionPoint(region.toCPointer<ByteVar>(), x, y, graphics.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun GdipIsVisibleRegionPointI(region: Long, x: Int, y: Int, graphics: Long, result: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRegionPointI(region.toCPointer<ByteVar>(), x, y, graphics.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun GdipIsVisibleRegionRect(region: Long, x: Float, y: Float, width: Float, height: Float, graphics: Long, result: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRegionRect(region.toCPointer<ByteVar>(), x, y, width, height, graphics.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun GdipIsVisibleRegionRectI(region: Long, x: Int, y: Int, width: Int, height: Int, graphics: Long, result: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRegionRectI(region.toCPointer<ByteVar>(), x, y, width, height, graphics.toCPointer<ByteVar>(), result.toCPointer<ByteVar>())

public actual fun GdipLoadImageFromFile(filename: PCWSTR, image: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipLoadImageFromFile(filename.toCPointer<ByteVar>(), image.toCPointer<ByteVar>())

public actual fun GdipLoadImageFromFileICM(filename: PCWSTR, image: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipLoadImageFromFileICM(filename.toCPointer<ByteVar>(), image.toCPointer<ByteVar>())

public actual fun GdipLoadImageFromStream(stream: Long, image: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipLoadImageFromStream(stream.toCPointer<ByteVar>(), image.toCPointer<ByteVar>())

public actual fun GdipLoadImageFromStreamICM(stream: Long, image: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipLoadImageFromStreamICM(stream.toCPointer<ByteVar>(), image.toCPointer<ByteVar>())

public actual fun GdipMeasureCharacterRanges(graphics: Long, string: PCWSTR, length: Int, font: Long, layoutrect: Long, stringformat: Long, regioncount: Int, regions: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipMeasureCharacterRanges(graphics.toCPointer<ByteVar>(), string.toCPointer<ByteVar>(), length, font.toCPointer<ByteVar>(), layoutrect.toCPointer<ByteVar>(), stringformat.toCPointer<ByteVar>(), regioncount, regions.toCPointer<ByteVar>())

public actual fun GdipMeasureDriverString(graphics: Long, text: Long, length: Int, font: Long, positions: Long, flags: Int, matrix: Long, boundingbox: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipMeasureDriverString(graphics.toCPointer<ByteVar>(), text.toCPointer<ByteVar>(), length, font.toCPointer<ByteVar>(), positions.toCPointer<ByteVar>(), flags, matrix.toCPointer<ByteVar>(), boundingbox.toCPointer<ByteVar>())

public actual fun GdipMeasureString(graphics: Long, string: PCWSTR, length: Int, font: Long, layoutrect: Long, stringformat: Long, boundingbox: Long, codepointsfitted: Long, linesfilled: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipMeasureString(graphics.toCPointer<ByteVar>(), string.toCPointer<ByteVar>(), length, font.toCPointer<ByteVar>(), layoutrect.toCPointer<ByteVar>(), stringformat.toCPointer<ByteVar>(), boundingbox.toCPointer<ByteVar>(), codepointsfitted.toCPointer<ByteVar>(), linesfilled.toCPointer<ByteVar>())

public actual fun GdipMultiplyLineTransform(brush: Long, matrix: Long, order: MatrixOrder): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipMultiplyLineTransform(brush.toCPointer<ByteVar>(), matrix.toCPointer<ByteVar>(), order)

public actual fun GdipMultiplyMatrix(matrix: Long, matrix2: Long, order: MatrixOrder): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipMultiplyMatrix(matrix.toCPointer<ByteVar>(), matrix2.toCPointer<ByteVar>(), order)

public actual fun GdipMultiplyPathGradientTransform(brush: Long, matrix: Long, order: MatrixOrder): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipMultiplyPathGradientTransform(brush.toCPointer<ByteVar>(), matrix.toCPointer<ByteVar>(), order)

public actual fun GdipMultiplyPenTransform(pen: Long, matrix: Long, order: MatrixOrder): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipMultiplyPenTransform(pen.toCPointer<ByteVar>(), matrix.toCPointer<ByteVar>(), order)

public actual fun GdipMultiplyTextureTransform(brush: Long, matrix: Long, order: MatrixOrder): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipMultiplyTextureTransform(brush.toCPointer<ByteVar>(), matrix.toCPointer<ByteVar>(), order)

public actual fun GdipMultiplyWorldTransform(graphics: Long, matrix: Long, order: MatrixOrder): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipMultiplyWorldTransform(graphics.toCPointer<ByteVar>(), matrix.toCPointer<ByteVar>(), order)

public actual fun GdipNewInstalledFontCollection(fontcollection: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipNewInstalledFontCollection(fontcollection.toCPointer<ByteVar>())

public actual fun GdipNewPrivateFontCollection(fontcollection: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipNewPrivateFontCollection(fontcollection.toCPointer<ByteVar>())

public actual fun GdipPathIterCopyData(iterator: Long, resultcount: Long, points: Long, types: Long, startindex: Int, endindex: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipPathIterCopyData(iterator.toCPointer<ByteVar>(), resultcount.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), types.toCPointer<ByteVar>(), startindex, endindex)

public actual fun GdipPathIterEnumerate(iterator: Long, resultcount: Long, points: Long, types: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipPathIterEnumerate(iterator.toCPointer<ByteVar>(), resultcount.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), types.toCPointer<ByteVar>(), count)

public actual fun GdipPathIterGetCount(iterator: Long, count: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipPathIterGetCount(iterator.toCPointer<ByteVar>(), count.toCPointer<ByteVar>())

public actual fun GdipPathIterGetSubpathCount(iterator: Long, count: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipPathIterGetSubpathCount(iterator.toCPointer<ByteVar>(), count.toCPointer<ByteVar>())

public actual fun GdipPathIterHasCurve(iterator: Long, hascurve: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipPathIterHasCurve(iterator.toCPointer<ByteVar>(), hascurve.toCPointer<ByteVar>())

public actual fun GdipPathIterIsValid(iterator: Long, valid: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipPathIterIsValid(iterator.toCPointer<ByteVar>(), valid.toCPointer<ByteVar>())

public actual fun GdipPathIterNextMarker(iterator: Long, resultcount: Long, startindex: Long, endindex: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextMarker(iterator.toCPointer<ByteVar>(), resultcount.toCPointer<ByteVar>(), startindex.toCPointer<ByteVar>(), endindex.toCPointer<ByteVar>())

public actual fun GdipPathIterNextMarkerPath(iterator: Long, resultcount: Long, path: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextMarkerPath(iterator.toCPointer<ByteVar>(), resultcount.toCPointer<ByteVar>(), path.toCPointer<ByteVar>())

public actual fun GdipPathIterNextPathType(iterator: Long, resultcount: Long, pathtype: Long, startindex: Long, endindex: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextPathType(iterator.toCPointer<ByteVar>(), resultcount.toCPointer<ByteVar>(), pathtype.toCPointer<ByteVar>(), startindex.toCPointer<ByteVar>(), endindex.toCPointer<ByteVar>())

public actual fun GdipPathIterNextSubpath(iterator: Long, resultcount: Long, startindex: Long, endindex: Long, isclosed: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextSubpath(iterator.toCPointer<ByteVar>(), resultcount.toCPointer<ByteVar>(), startindex.toCPointer<ByteVar>(), endindex.toCPointer<ByteVar>(), isclosed.toCPointer<ByteVar>())

public actual fun GdipPathIterNextSubpathPath(iterator: Long, resultcount: Long, path: Long, isclosed: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextSubpathPath(iterator.toCPointer<ByteVar>(), resultcount.toCPointer<ByteVar>(), path.toCPointer<ByteVar>(), isclosed.toCPointer<ByteVar>())

public actual fun GdipPathIterRewind(iterator: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipPathIterRewind(iterator.toCPointer<ByteVar>())

public actual fun GdipPlayMetafileRecord(metafile: Long, recordtype: EmfPlusRecordType, flags: UInt, datasize: UInt, data: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipPlayMetafileRecord(metafile.toCPointer<ByteVar>(), recordtype, flags, datasize, data.toCPointer<ByteVar>())

public actual fun GdipPrivateAddFontFile(fontcollection: Long, filename: PCWSTR): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipPrivateAddFontFile(fontcollection.toCPointer<ByteVar>(), filename.toCPointer<ByteVar>())

public actual fun GdipPrivateAddMemoryFont(fontcollection: Long, memory: Long, length: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipPrivateAddMemoryFont(fontcollection.toCPointer<ByteVar>(), memory.toCPointer<ByteVar>(), length)

public actual fun GdipRecordMetafile(referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafile(referencehdc.toCPointer<ByteVar>(), type, framerect.toCPointer<ByteVar>(), frameunit, description.toCPointer<ByteVar>(), metafile.toCPointer<ByteVar>())

public actual fun GdipRecordMetafileFileName(filename: PCWSTR, referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileFileName(filename.toCPointer<ByteVar>(), referencehdc.toCPointer<ByteVar>(), type, framerect.toCPointer<ByteVar>(), frameunit, description.toCPointer<ByteVar>(), metafile.toCPointer<ByteVar>())

public actual fun GdipRecordMetafileFileNameI(filename: PCWSTR, referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileFileNameI(filename.toCPointer<ByteVar>(), referencehdc.toCPointer<ByteVar>(), type, framerect.toCPointer<ByteVar>(), frameunit, description.toCPointer<ByteVar>(), metafile.toCPointer<ByteVar>())

public actual fun GdipRecordMetafileI(referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileI(referencehdc.toCPointer<ByteVar>(), type, framerect.toCPointer<ByteVar>(), frameunit, description.toCPointer<ByteVar>(), metafile.toCPointer<ByteVar>())

public actual fun GdipRecordMetafileStream(stream: Long, referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileStream(stream.toCPointer<ByteVar>(), referencehdc.toCPointer<ByteVar>(), type, framerect.toCPointer<ByteVar>(), frameunit, description.toCPointer<ByteVar>(), metafile.toCPointer<ByteVar>())

public actual fun GdipRecordMetafileStreamI(stream: Long, referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileStreamI(stream.toCPointer<ByteVar>(), referencehdc.toCPointer<ByteVar>(), type, framerect.toCPointer<ByteVar>(), frameunit, description.toCPointer<ByteVar>(), metafile.toCPointer<ByteVar>())

public actual fun GdipReleaseDC(graphics: Long, hdc: HDC): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipReleaseDC(graphics.toCPointer<ByteVar>(), hdc.toCPointer<ByteVar>())

public actual fun GdipRemovePropertyItem(image: Long, propid: UInt): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipRemovePropertyItem(image.toCPointer<ByteVar>(), propid)

public actual fun GdipResetClip(graphics: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipResetClip(graphics.toCPointer<ByteVar>())

public actual fun GdipResetImageAttributes(imageattr: Long, type: ColorAdjustType): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipResetImageAttributes(imageattr.toCPointer<ByteVar>(), type)

public actual fun GdipResetLineTransform(brush: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipResetLineTransform(brush.toCPointer<ByteVar>())

public actual fun GdipResetPageTransform(graphics: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipResetPageTransform(graphics.toCPointer<ByteVar>())

public actual fun GdipResetPath(path: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipResetPath(path.toCPointer<ByteVar>())

public actual fun GdipResetPathGradientTransform(brush: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipResetPathGradientTransform(brush.toCPointer<ByteVar>())

public actual fun GdipResetPenTransform(pen: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipResetPenTransform(pen.toCPointer<ByteVar>())

public actual fun GdipResetTextureTransform(brush: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipResetTextureTransform(brush.toCPointer<ByteVar>())

public actual fun GdipResetWorldTransform(graphics: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipResetWorldTransform(graphics.toCPointer<ByteVar>())

public actual fun GdipRestoreGraphics(graphics: Long, state: UInt): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipRestoreGraphics(graphics.toCPointer<ByteVar>(), state)

public actual fun GdipReversePath(path: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipReversePath(path.toCPointer<ByteVar>())

public actual fun GdipRotateLineTransform(brush: Long, angle: Float, order: MatrixOrder): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipRotateLineTransform(brush.toCPointer<ByteVar>(), angle, order)

public actual fun GdipRotateMatrix(matrix: Long, angle: Float, order: MatrixOrder): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipRotateMatrix(matrix.toCPointer<ByteVar>(), angle, order)

public actual fun GdipRotatePathGradientTransform(brush: Long, angle: Float, order: MatrixOrder): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipRotatePathGradientTransform(brush.toCPointer<ByteVar>(), angle, order)

public actual fun GdipRotatePenTransform(pen: Long, angle: Float, order: MatrixOrder): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipRotatePenTransform(pen.toCPointer<ByteVar>(), angle, order)

public actual fun GdipRotateTextureTransform(brush: Long, angle: Float, order: MatrixOrder): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipRotateTextureTransform(brush.toCPointer<ByteVar>(), angle, order)

public actual fun GdipRotateWorldTransform(graphics: Long, angle: Float, order: MatrixOrder): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipRotateWorldTransform(graphics.toCPointer<ByteVar>(), angle, order)

public actual fun GdipSaveAdd(image: Long, encoderparams: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSaveAdd(image.toCPointer<ByteVar>(), encoderparams.toCPointer<ByteVar>())

public actual fun GdipSaveAddImage(image: Long, newimage: Long, encoderparams: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSaveAddImage(image.toCPointer<ByteVar>(), newimage.toCPointer<ByteVar>(), encoderparams.toCPointer<ByteVar>())

public actual fun GdipSaveGraphics(graphics: Long, state: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSaveGraphics(graphics.toCPointer<ByteVar>(), state.toCPointer<ByteVar>())

public actual fun GdipSaveImageToFile(image: Long, filename: PCWSTR, clsidencoder: Long, encoderparams: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSaveImageToFile(image.toCPointer<ByteVar>(), filename.toCPointer<ByteVar>(), clsidencoder.toCPointer<ByteVar>(), encoderparams.toCPointer<ByteVar>())

public actual fun GdipSaveImageToStream(image: Long, stream: Long, clsidencoder: Long, encoderparams: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSaveImageToStream(image.toCPointer<ByteVar>(), stream.toCPointer<ByteVar>(), clsidencoder.toCPointer<ByteVar>(), encoderparams.toCPointer<ByteVar>())

public actual fun GdipScaleLineTransform(brush: Long, sx: Float, sy: Float, order: MatrixOrder): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipScaleLineTransform(brush.toCPointer<ByteVar>(), sx, sy, order)

public actual fun GdipScaleMatrix(matrix: Long, scalex: Float, scaley: Float, order: MatrixOrder): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipScaleMatrix(matrix.toCPointer<ByteVar>(), scalex, scaley, order)

public actual fun GdipScalePathGradientTransform(brush: Long, sx: Float, sy: Float, order: MatrixOrder): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipScalePathGradientTransform(brush.toCPointer<ByteVar>(), sx, sy, order)

public actual fun GdipScalePenTransform(pen: Long, sx: Float, sy: Float, order: MatrixOrder): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipScalePenTransform(pen.toCPointer<ByteVar>(), sx, sy, order)

public actual fun GdipScaleTextureTransform(brush: Long, sx: Float, sy: Float, order: MatrixOrder): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipScaleTextureTransform(brush.toCPointer<ByteVar>(), sx, sy, order)

public actual fun GdipScaleWorldTransform(graphics: Long, sx: Float, sy: Float, order: MatrixOrder): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipScaleWorldTransform(graphics.toCPointer<ByteVar>(), sx, sy, order)

public actual fun GdipSetAdjustableArrowCapFillState(cap: Long, fillstate: BOOL): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetAdjustableArrowCapFillState(cap.toCPointer<ByteVar>(), fillstate)

public actual fun GdipSetAdjustableArrowCapHeight(cap: Long, height: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetAdjustableArrowCapHeight(cap.toCPointer<ByteVar>(), height)

public actual fun GdipSetAdjustableArrowCapMiddleInset(cap: Long, middleinset: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetAdjustableArrowCapMiddleInset(cap.toCPointer<ByteVar>(), middleinset)

public actual fun GdipSetAdjustableArrowCapWidth(cap: Long, width: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetAdjustableArrowCapWidth(cap.toCPointer<ByteVar>(), width)

public actual fun GdipSetClipGraphics(graphics: Long, srcgraphics: Long, combinemode: CombineMode): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetClipGraphics(graphics.toCPointer<ByteVar>(), srcgraphics.toCPointer<ByteVar>(), combinemode)

public actual fun GdipSetClipHrgn(graphics: Long, hrgn: HRGN, combinemode: CombineMode): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetClipHrgn(graphics.toCPointer<ByteVar>(), hrgn.toCPointer<ByteVar>(), combinemode)

public actual fun GdipSetClipPath(graphics: Long, path: Long, combinemode: CombineMode): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetClipPath(graphics.toCPointer<ByteVar>(), path.toCPointer<ByteVar>(), combinemode)

public actual fun GdipSetClipRect(graphics: Long, x: Float, y: Float, width: Float, height: Float, combinemode: CombineMode): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetClipRect(graphics.toCPointer<ByteVar>(), x, y, width, height, combinemode)

public actual fun GdipSetClipRectI(graphics: Long, x: Int, y: Int, width: Int, height: Int, combinemode: CombineMode): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetClipRectI(graphics.toCPointer<ByteVar>(), x, y, width, height, combinemode)

public actual fun GdipSetClipRegion(graphics: Long, region: Long, combinemode: CombineMode): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetClipRegion(graphics.toCPointer<ByteVar>(), region.toCPointer<ByteVar>(), combinemode)

public actual fun GdipSetCompositingMode(graphics: Long, compositingmode: CompositingMode): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetCompositingMode(graphics.toCPointer<ByteVar>(), compositingmode)

public actual fun GdipSetCompositingQuality(graphics: Long, compositingquality: CompositingQuality): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetCompositingQuality(graphics.toCPointer<ByteVar>(), compositingquality)

public actual fun GdipSetCustomLineCapBaseCap(customcap: Long, basecap: LineCap): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapBaseCap(customcap.toCPointer<ByteVar>(), basecap)

public actual fun GdipSetCustomLineCapBaseInset(customcap: Long, inset: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapBaseInset(customcap.toCPointer<ByteVar>(), inset)

public actual fun GdipSetCustomLineCapStrokeCaps(customcap: Long, startcap: LineCap, endcap: LineCap): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapStrokeCaps(customcap.toCPointer<ByteVar>(), startcap, endcap)

public actual fun GdipSetCustomLineCapStrokeJoin(customcap: Long, linejoin: LineJoin): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapStrokeJoin(customcap.toCPointer<ByteVar>(), linejoin)

public actual fun GdipSetCustomLineCapWidthScale(customcap: Long, widthscale: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapWidthScale(customcap.toCPointer<ByteVar>(), widthscale)

public actual fun GdipSetEffectParameters(effect: Long, params: Long, size: UInt): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetEffectParameters(effect.toCPointer<ByteVar>(), params.toCPointer<ByteVar>(), size)

public actual fun GdipSetEmpty(region: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetEmpty(region.toCPointer<ByteVar>())

public actual fun GdipSetImageAttributesCachedBackground(imageattr: Long, enableflag: BOOL): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesCachedBackground(imageattr.toCPointer<ByteVar>(), enableflag)

public actual fun GdipSetImageAttributesColorKeys(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, colorlow: UInt, colorhigh: UInt): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesColorKeys(imageattr.toCPointer<ByteVar>(), type, enableflag, colorlow, colorhigh)

public actual fun GdipSetImageAttributesColorMatrix(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, colormatrix: Long, graymatrix: Long, flags: ColorMatrixFlags): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesColorMatrix(imageattr.toCPointer<ByteVar>(), type, enableflag, colormatrix.toCPointer<ByteVar>(), graymatrix.toCPointer<ByteVar>(), flags)

public actual fun GdipSetImageAttributesGamma(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, gamma: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesGamma(imageattr.toCPointer<ByteVar>(), type, enableflag, gamma)

public actual fun GdipSetImageAttributesNoOp(imageattr: Long, type: ColorAdjustType, enableflag: BOOL): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesNoOp(imageattr.toCPointer<ByteVar>(), type, enableflag)

public actual fun GdipSetImageAttributesOutputChannel(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, channelflags: ColorChannelFlags): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesOutputChannel(imageattr.toCPointer<ByteVar>(), type, enableflag, channelflags)

public actual fun GdipSetImageAttributesOutputChannelColorProfile(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, colorprofilefilename: PCWSTR): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesOutputChannelColorProfile(imageattr.toCPointer<ByteVar>(), type, enableflag, colorprofilefilename.toCPointer<ByteVar>())

public actual fun GdipSetImageAttributesRemapTable(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, mapsize: UInt, map: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesRemapTable(imageattr.toCPointer<ByteVar>(), type, enableflag, mapsize, map.toCPointer<ByteVar>())

public actual fun GdipSetImageAttributesThreshold(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, threshold: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesThreshold(imageattr.toCPointer<ByteVar>(), type, enableflag, threshold)

public actual fun GdipSetImageAttributesToIdentity(imageattr: Long, type: ColorAdjustType): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesToIdentity(imageattr.toCPointer<ByteVar>(), type)

public actual fun GdipSetImageAttributesWrapMode(imageattr: Long, wrap: WrapMode, argb: UInt, clamp: BOOL): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesWrapMode(imageattr.toCPointer<ByteVar>(), wrap, argb, clamp)

public actual fun GdipSetImagePalette(image: Long, palette: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetImagePalette(image.toCPointer<ByteVar>(), palette.toCPointer<ByteVar>())

public actual fun GdipSetInfinite(region: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetInfinite(region.toCPointer<ByteVar>())

public actual fun GdipSetInterpolationMode(graphics: Long, interpolationmode: InterpolationMode): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetInterpolationMode(graphics.toCPointer<ByteVar>(), interpolationmode)

public actual fun GdipSetLineBlend(brush: Long, blend: Long, positions: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetLineBlend(brush.toCPointer<ByteVar>(), blend.toCPointer<ByteVar>(), positions.toCPointer<ByteVar>(), count)

public actual fun GdipSetLineColors(brush: Long, color1: UInt, color2: UInt): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetLineColors(brush.toCPointer<ByteVar>(), color1, color2)

public actual fun GdipSetLineGammaCorrection(brush: Long, usegammacorrection: BOOL): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetLineGammaCorrection(brush.toCPointer<ByteVar>(), usegammacorrection)

public actual fun GdipSetLineLinearBlend(brush: Long, focus: Float, scale: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetLineLinearBlend(brush.toCPointer<ByteVar>(), focus, scale)

public actual fun GdipSetLinePresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetLinePresetBlend(brush.toCPointer<ByteVar>(), blend.toCPointer<ByteVar>(), positions.toCPointer<ByteVar>(), count)

public actual fun GdipSetLineSigmaBlend(brush: Long, focus: Float, scale: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetLineSigmaBlend(brush.toCPointer<ByteVar>(), focus, scale)

public actual fun GdipSetLineTransform(brush: Long, matrix: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetLineTransform(brush.toCPointer<ByteVar>(), matrix.toCPointer<ByteVar>())

public actual fun GdipSetLineWrapMode(brush: Long, wrapmode: WrapMode): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetLineWrapMode(brush.toCPointer<ByteVar>(), wrapmode)

public actual fun GdipSetMatrixElements(matrix: Long, m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetMatrixElements(matrix.toCPointer<ByteVar>(), m11, m12, m21, m22, dx, dy)

public actual fun GdipSetMetafileDownLevelRasterizationLimit(metafile: Long, metafilerasterizationlimitdpi: UInt): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetMetafileDownLevelRasterizationLimit(metafile.toCPointer<ByteVar>(), metafilerasterizationlimitdpi)

public actual fun GdipSetPageScale(graphics: Long, scale: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPageScale(graphics.toCPointer<ByteVar>(), scale)

public actual fun GdipSetPageUnit(graphics: Long, unit: Unit): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPageUnit(graphics.toCPointer<ByteVar>(), unit)

public actual fun GdipSetPathFillMode(path: Long, fillmode: FillMode): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPathFillMode(path.toCPointer<ByteVar>(), fillmode)

public actual fun GdipSetPathGradientBlend(brush: Long, blend: Long, positions: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientBlend(brush.toCPointer<ByteVar>(), blend.toCPointer<ByteVar>(), positions.toCPointer<ByteVar>(), count)

public actual fun GdipSetPathGradientCenterColor(brush: Long, colors: UInt): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientCenterColor(brush.toCPointer<ByteVar>(), colors)

public actual fun GdipSetPathGradientCenterPoint(brush: Long, points: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientCenterPoint(brush.toCPointer<ByteVar>(), points.toCPointer<ByteVar>())

public actual fun GdipSetPathGradientCenterPointI(brush: Long, points: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientCenterPointI(brush.toCPointer<ByteVar>(), points.toCPointer<ByteVar>())

public actual fun GdipSetPathGradientFocusScales(brush: Long, xscale: Float, yscale: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientFocusScales(brush.toCPointer<ByteVar>(), xscale, yscale)

public actual fun GdipSetPathGradientGammaCorrection(brush: Long, usegammacorrection: BOOL): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientGammaCorrection(brush.toCPointer<ByteVar>(), usegammacorrection)

public actual fun GdipSetPathGradientLinearBlend(brush: Long, focus: Float, scale: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientLinearBlend(brush.toCPointer<ByteVar>(), focus, scale)

public actual fun GdipSetPathGradientPath(brush: Long, path: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientPath(brush.toCPointer<ByteVar>(), path.toCPointer<ByteVar>())

public actual fun GdipSetPathGradientPresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientPresetBlend(brush.toCPointer<ByteVar>(), blend.toCPointer<ByteVar>(), positions.toCPointer<ByteVar>(), count)

public actual fun GdipSetPathGradientSigmaBlend(brush: Long, focus: Float, scale: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientSigmaBlend(brush.toCPointer<ByteVar>(), focus, scale)

public actual fun GdipSetPathGradientSurroundColorsWithCount(brush: Long, color: Long, count: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientSurroundColorsWithCount(brush.toCPointer<ByteVar>(), color.toCPointer<ByteVar>(), count.toCPointer<ByteVar>())

public actual fun GdipSetPathGradientTransform(brush: Long, matrix: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientTransform(brush.toCPointer<ByteVar>(), matrix.toCPointer<ByteVar>())

public actual fun GdipSetPathGradientWrapMode(brush: Long, wrapmode: WrapMode): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientWrapMode(brush.toCPointer<ByteVar>(), wrapmode)

public actual fun GdipSetPathMarker(path: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPathMarker(path.toCPointer<ByteVar>())

public actual fun GdipSetPenBrushFill(pen: Long, brush: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPenBrushFill(pen.toCPointer<ByteVar>(), brush.toCPointer<ByteVar>())

public actual fun GdipSetPenColor(pen: Long, argb: UInt): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPenColor(pen.toCPointer<ByteVar>(), argb)

public actual fun GdipSetPenCompoundArray(pen: Long, dash: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPenCompoundArray(pen.toCPointer<ByteVar>(), dash.toCPointer<ByteVar>(), count)

public actual fun GdipSetPenCustomEndCap(pen: Long, customcap: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPenCustomEndCap(pen.toCPointer<ByteVar>(), customcap.toCPointer<ByteVar>())

public actual fun GdipSetPenCustomStartCap(pen: Long, customcap: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPenCustomStartCap(pen.toCPointer<ByteVar>(), customcap.toCPointer<ByteVar>())

public actual fun GdipSetPenDashArray(pen: Long, dash: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPenDashArray(pen.toCPointer<ByteVar>(), dash.toCPointer<ByteVar>(), count)

public actual fun GdipSetPenDashCap197819(pen: Long, dashcap: DashCap): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPenDashCap197819(pen.toCPointer<ByteVar>(), dashcap)

public actual fun GdipSetPenDashOffset(pen: Long, offset: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPenDashOffset(pen.toCPointer<ByteVar>(), offset)

public actual fun GdipSetPenDashStyle(pen: Long, dashstyle: DashStyle): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPenDashStyle(pen.toCPointer<ByteVar>(), dashstyle)

public actual fun GdipSetPenEndCap(pen: Long, endcap: LineCap): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPenEndCap(pen.toCPointer<ByteVar>(), endcap)

public actual fun GdipSetPenLineCap197819(pen: Long, startcap: LineCap, endcap: LineCap, dashcap: DashCap): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPenLineCap197819(pen.toCPointer<ByteVar>(), startcap, endcap, dashcap)

public actual fun GdipSetPenLineJoin(pen: Long, linejoin: LineJoin): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPenLineJoin(pen.toCPointer<ByteVar>(), linejoin)

public actual fun GdipSetPenMiterLimit(pen: Long, miterlimit: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPenMiterLimit(pen.toCPointer<ByteVar>(), miterlimit)

public actual fun GdipSetPenMode(pen: Long, penmode: PenAlignment): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPenMode(pen.toCPointer<ByteVar>(), penmode)

public actual fun GdipSetPenStartCap(pen: Long, startcap: LineCap): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPenStartCap(pen.toCPointer<ByteVar>(), startcap)

public actual fun GdipSetPenTransform(pen: Long, matrix: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPenTransform(pen.toCPointer<ByteVar>(), matrix.toCPointer<ByteVar>())

public actual fun GdipSetPenUnit(pen: Long, unit: Unit): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPenUnit(pen.toCPointer<ByteVar>(), unit)

public actual fun GdipSetPenWidth(pen: Long, width: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPenWidth(pen.toCPointer<ByteVar>(), width)

public actual fun GdipSetPixelOffsetMode(graphics: Long, pixeloffsetmode: PixelOffsetMode): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPixelOffsetMode(graphics.toCPointer<ByteVar>(), pixeloffsetmode)

public actual fun GdipSetPropertyItem(image: Long, item: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetPropertyItem(image.toCPointer<ByteVar>(), item.toCPointer<ByteVar>())

public actual fun GdipSetRenderingOrigin(graphics: Long, x: Int, y: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetRenderingOrigin(graphics.toCPointer<ByteVar>(), x, y)

public actual fun GdipSetSmoothingMode(graphics: Long, smoothingmode: SmoothingMode): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetSmoothingMode(graphics.toCPointer<ByteVar>(), smoothingmode)

public actual fun GdipSetSolidFillColor(brush: Long, color: UInt): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetSolidFillColor(brush.toCPointer<ByteVar>(), color)

public actual fun GdipSetStringFormatAlign(format: Long, align: StringAlignment): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatAlign(format.toCPointer<ByteVar>(), align)

public actual fun GdipSetStringFormatDigitSubstitution(format: Long, language: UShort, substitute: StringDigitSubstitute): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatDigitSubstitution(format.toCPointer<ByteVar>(), language, substitute)

public actual fun GdipSetStringFormatFlags(format: Long, flags: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatFlags(format.toCPointer<ByteVar>(), flags)

public actual fun GdipSetStringFormatHotkeyPrefix(format: Long, hotkeyprefix: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatHotkeyPrefix(format.toCPointer<ByteVar>(), hotkeyprefix)

public actual fun GdipSetStringFormatLineAlign(format: Long, align: StringAlignment): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatLineAlign(format.toCPointer<ByteVar>(), align)

public actual fun GdipSetStringFormatMeasurableCharacterRanges(format: Long, rangecount: Int, ranges: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatMeasurableCharacterRanges(format.toCPointer<ByteVar>(), rangecount, ranges.toCPointer<ByteVar>())

public actual fun GdipSetStringFormatTabStops(format: Long, firsttaboffset: Float, count: Int, tabstops: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatTabStops(format.toCPointer<ByteVar>(), firsttaboffset, count, tabstops.toCPointer<ByteVar>())

public actual fun GdipSetStringFormatTrimming(format: Long, trimming: StringTrimming): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatTrimming(format.toCPointer<ByteVar>(), trimming)

public actual fun GdipSetTextContrast(graphics: Long, contrast: UInt): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetTextContrast(graphics.toCPointer<ByteVar>(), contrast)

public actual fun GdipSetTextRenderingHint(graphics: Long, mode: TextRenderingHint): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetTextRenderingHint(graphics.toCPointer<ByteVar>(), mode)

public actual fun GdipSetTextureTransform(brush: Long, matrix: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetTextureTransform(brush.toCPointer<ByteVar>(), matrix.toCPointer<ByteVar>())

public actual fun GdipSetTextureWrapMode(brush: Long, wrapmode: WrapMode): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetTextureWrapMode(brush.toCPointer<ByteVar>(), wrapmode)

public actual fun GdipSetWorldTransform(graphics: Long, matrix: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipSetWorldTransform(graphics.toCPointer<ByteVar>(), matrix.toCPointer<ByteVar>())

public actual fun GdipShearMatrix(matrix: Long, shearx: Float, sheary: Float, order: MatrixOrder): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipShearMatrix(matrix.toCPointer<ByteVar>(), shearx, sheary, order)

public actual fun GdipStartPathFigure(path: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipStartPathFigure(path.toCPointer<ByteVar>())

public actual fun GdipStringFormatGetGenericDefault(format: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipStringFormatGetGenericDefault(format.toCPointer<ByteVar>())

public actual fun GdipStringFormatGetGenericTypographic(format: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipStringFormatGetGenericTypographic(format.toCPointer<ByteVar>())

public actual fun GdipTestControl(control: GpTestControlEnum, param1: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipTestControl(control, param1.toCPointer<ByteVar>())

public actual fun GdipTransformMatrixPoints(matrix: Long, pts: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipTransformMatrixPoints(matrix.toCPointer<ByteVar>(), pts.toCPointer<ByteVar>(), count)

public actual fun GdipTransformMatrixPointsI(matrix: Long, pts: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipTransformMatrixPointsI(matrix.toCPointer<ByteVar>(), pts.toCPointer<ByteVar>(), count)

public actual fun GdipTransformPath(path: Long, matrix: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipTransformPath(path.toCPointer<ByteVar>(), matrix.toCPointer<ByteVar>())

public actual fun GdipTransformPoints(graphics: Long, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipTransformPoints(graphics.toCPointer<ByteVar>(), destspace, srcspace, points.toCPointer<ByteVar>(), count)

public actual fun GdipTransformPointsI(graphics: Long, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipTransformPointsI(graphics.toCPointer<ByteVar>(), destspace, srcspace, points.toCPointer<ByteVar>(), count)

public actual fun GdipTransformRegion(region: Long, matrix: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipTransformRegion(region.toCPointer<ByteVar>(), matrix.toCPointer<ByteVar>())

public actual fun GdipTranslateClip(graphics: Long, dx: Float, dy: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipTranslateClip(graphics.toCPointer<ByteVar>(), dx, dy)

public actual fun GdipTranslateClipI(graphics: Long, dx: Int, dy: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipTranslateClipI(graphics.toCPointer<ByteVar>(), dx, dy)

public actual fun GdipTranslateLineTransform(brush: Long, dx: Float, dy: Float, order: MatrixOrder): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipTranslateLineTransform(brush.toCPointer<ByteVar>(), dx, dy, order)

public actual fun GdipTranslateMatrix(matrix: Long, offsetx: Float, offsety: Float, order: MatrixOrder): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipTranslateMatrix(matrix.toCPointer<ByteVar>(), offsetx, offsety, order)

public actual fun GdipTranslatePathGradientTransform(brush: Long, dx: Float, dy: Float, order: MatrixOrder): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipTranslatePathGradientTransform(brush.toCPointer<ByteVar>(), dx, dy, order)

public actual fun GdipTranslatePenTransform(pen: Long, dx: Float, dy: Float, order: MatrixOrder): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipTranslatePenTransform(pen.toCPointer<ByteVar>(), dx, dy, order)

public actual fun GdipTranslateRegion(region: Long, dx: Float, dy: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipTranslateRegion(region.toCPointer<ByteVar>(), dx, dy)

public actual fun GdipTranslateRegionI(region: Long, dx: Int, dy: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipTranslateRegionI(region.toCPointer<ByteVar>(), dx, dy)

public actual fun GdipTranslateTextureTransform(brush: Long, dx: Float, dy: Float, order: MatrixOrder): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipTranslateTextureTransform(brush.toCPointer<ByteVar>(), dx, dy, order)

public actual fun GdipTranslateWorldTransform(graphics: Long, dx: Float, dy: Float, order: MatrixOrder): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipTranslateWorldTransform(graphics.toCPointer<ByteVar>(), dx, dy, order)

public actual fun GdipVectorTransformMatrixPoints(matrix: Long, pts: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipVectorTransformMatrixPoints(matrix.toCPointer<ByteVar>(), pts.toCPointer<ByteVar>(), count)

public actual fun GdipVectorTransformMatrixPointsI(matrix: Long, pts: Long, count: Int): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipVectorTransformMatrixPointsI(matrix.toCPointer<ByteVar>(), pts.toCPointer<ByteVar>(), count)

public actual fun GdipWarpPath(path: Long, matrix: Long, points: Long, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, warpmode: WarpMode, flatness: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipWarpPath(path.toCPointer<ByteVar>(), matrix.toCPointer<ByteVar>(), points.toCPointer<ByteVar>(), count, srcx, srcy, srcwidth, srcheight, warpmode, flatness)

public actual fun GdipWidenPath(nativepath: Long, pen: Long, matrix: Long, flatness: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipWidenPath(nativepath.toCPointer<ByteVar>(), pen.toCPointer<ByteVar>(), matrix.toCPointer<ByteVar>(), flatness)

public actual fun GdipWindingModeOutline(path: Long, matrix: Long, flatness: Float): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdipWindingModeOutline(path.toCPointer<ByteVar>(), matrix.toCPointer<ByteVar>(), flatness)

public actual fun GdiplusNotificationHook(token: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdiplusNotificationHook(token.toCPointer<ByteVar>())

public actual fun GdiplusNotificationUnhook(token: ULong) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdiplusNotificationUnhook(token)
}

public actual fun GdiplusShutdown(token: ULong) {
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdiplusShutdown(token)
}

public actual fun GdiplusStartup(token: Long, input: Long, output: Long): Status =
    io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus.cinterop.windowssys_windows_win32_graphics_gdiplus_GdiplusStartup(token.toCPointer<ByteVar>(), input.toCPointer<ByteVar>(), output.toCPointer<ByteVar>())
