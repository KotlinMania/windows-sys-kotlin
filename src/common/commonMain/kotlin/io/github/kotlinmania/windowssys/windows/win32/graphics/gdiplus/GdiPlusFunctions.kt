package io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus

import io.github.kotlinmania.windowssys.Win32DynamicFfi
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

public fun GdipAddPathArc(path: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipAddPathArc", 5460, false, longArrayOf(path, (x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL), (width.toRawBits().toLong() and 0xFFFF_FFFFL), (height.toRawBits().toLong() and 0xFFFF_FFFFL), (startangle.toRawBits().toLong() and 0xFFFF_FFFFL), (sweepangle.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipAddPathArcI(path: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipAddPathArcI", 5120, false, longArrayOf(path, x.toLong(), y.toLong(), width.toLong(), height.toLong(), (startangle.toRawBits().toLong() and 0xFFFF_FFFFL), (sweepangle.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipAddPathBezier(path: Long, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipAddPathBezier", 21844, false, longArrayOf(path, (x1.toRawBits().toLong() and 0xFFFF_FFFFL), (y1.toRawBits().toLong() and 0xFFFF_FFFFL), (x2.toRawBits().toLong() and 0xFFFF_FFFFL), (y2.toRawBits().toLong() and 0xFFFF_FFFFL), (x3.toRawBits().toLong() and 0xFFFF_FFFFL), (y3.toRawBits().toLong() and 0xFFFF_FFFFL), (x4.toRawBits().toLong() and 0xFFFF_FFFFL), (y4.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipAddPathBezierI(path: Long, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipAddPathBezierI", longArrayOf(path, x1.toLong(), y1.toLong(), x2.toLong(), y2.toLong(), x3.toLong(), y3.toLong(), x4.toLong(), y4.toLong())).toInt()
}

public fun GdipAddPathBeziers(path: Long, points: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipAddPathBeziers", longArrayOf(path, points, count.toLong())).toInt()
}

public fun GdipAddPathBeziersI(path: Long, points: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipAddPathBeziersI", longArrayOf(path, points, count.toLong())).toInt()
}

public fun GdipAddPathClosedCurve(path: Long, points: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipAddPathClosedCurve", longArrayOf(path, points, count.toLong())).toInt()
}

public fun GdipAddPathClosedCurve2(path: Long, points: Long, count: Int, tension: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipAddPathClosedCurve2", 64, false, longArrayOf(path, points, count.toLong(), (tension.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipAddPathClosedCurve2I(path: Long, points: Long, count: Int, tension: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipAddPathClosedCurve2I", 64, false, longArrayOf(path, points, count.toLong(), (tension.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipAddPathClosedCurveI(path: Long, points: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipAddPathClosedCurveI", longArrayOf(path, points, count.toLong())).toInt()
}

public fun GdipAddPathCurve(path: Long, points: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipAddPathCurve", longArrayOf(path, points, count.toLong())).toInt()
}

public fun GdipAddPathCurve2(path: Long, points: Long, count: Int, tension: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipAddPathCurve2", 64, false, longArrayOf(path, points, count.toLong(), (tension.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipAddPathCurve2I(path: Long, points: Long, count: Int, tension: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipAddPathCurve2I", 64, false, longArrayOf(path, points, count.toLong(), (tension.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipAddPathCurve3(path: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipAddPathCurve3", 1024, false, longArrayOf(path, points, count.toLong(), offset.toLong(), numberofsegments.toLong(), (tension.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipAddPathCurve3I(path: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipAddPathCurve3I", 1024, false, longArrayOf(path, points, count.toLong(), offset.toLong(), numberofsegments.toLong(), (tension.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipAddPathCurveI(path: Long, points: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipAddPathCurveI", longArrayOf(path, points, count.toLong())).toInt()
}

public fun GdipAddPathEllipse(path: Long, x: Float, y: Float, width: Float, height: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipAddPathEllipse", 340, false, longArrayOf(path, (x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL), (width.toRawBits().toLong() and 0xFFFF_FFFFL), (height.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipAddPathEllipseI(path: Long, x: Int, y: Int, width: Int, height: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipAddPathEllipseI", longArrayOf(path, x.toLong(), y.toLong(), width.toLong(), height.toLong())).toInt()
}

public fun GdipAddPathLine(path: Long, x1: Float, y1: Float, x2: Float, y2: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipAddPathLine", 340, false, longArrayOf(path, (x1.toRawBits().toLong() and 0xFFFF_FFFFL), (y1.toRawBits().toLong() and 0xFFFF_FFFFL), (x2.toRawBits().toLong() and 0xFFFF_FFFFL), (y2.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipAddPathLine2(path: Long, points: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipAddPathLine2", longArrayOf(path, points, count.toLong())).toInt()
}

public fun GdipAddPathLine2I(path: Long, points: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipAddPathLine2I", longArrayOf(path, points, count.toLong())).toInt()
}

public fun GdipAddPathLineI(path: Long, x1: Int, y1: Int, x2: Int, y2: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipAddPathLineI", longArrayOf(path, x1.toLong(), y1.toLong(), x2.toLong(), y2.toLong())).toInt()
}

public fun GdipAddPathPath(path: Long, addingpath: Long, connect: BOOL): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipAddPathPath", longArrayOf(path, addingpath, connect.toLong())).toInt()
}

public fun GdipAddPathPie(path: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipAddPathPie", 5460, false, longArrayOf(path, (x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL), (width.toRawBits().toLong() and 0xFFFF_FFFFL), (height.toRawBits().toLong() and 0xFFFF_FFFFL), (startangle.toRawBits().toLong() and 0xFFFF_FFFFL), (sweepangle.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipAddPathPieI(path: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipAddPathPieI", 5120, false, longArrayOf(path, x.toLong(), y.toLong(), width.toLong(), height.toLong(), (startangle.toRawBits().toLong() and 0xFFFF_FFFFL), (sweepangle.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipAddPathPolygon(path: Long, points: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipAddPathPolygon", longArrayOf(path, points, count.toLong())).toInt()
}

public fun GdipAddPathPolygonI(path: Long, points: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipAddPathPolygonI", longArrayOf(path, points, count.toLong())).toInt()
}

public fun GdipAddPathRectangle(path: Long, x: Float, y: Float, width: Float, height: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipAddPathRectangle", 340, false, longArrayOf(path, (x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL), (width.toRawBits().toLong() and 0xFFFF_FFFFL), (height.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipAddPathRectangleI(path: Long, x: Int, y: Int, width: Int, height: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipAddPathRectangleI", longArrayOf(path, x.toLong(), y.toLong(), width.toLong(), height.toLong())).toInt()
}

public fun GdipAddPathRectangles(path: Long, rects: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipAddPathRectangles", longArrayOf(path, rects, count.toLong())).toInt()
}

public fun GdipAddPathRectanglesI(path: Long, rects: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipAddPathRectanglesI", longArrayOf(path, rects, count.toLong())).toInt()
}

public fun GdipAddPathString(path: Long, string: PCWSTR, length: Int, family: Long, style: Int, emsize: Float, layoutrect: Long, format: Long): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipAddPathString", 1024, false, longArrayOf(path, string, length.toLong(), family, style.toLong(), (emsize.toRawBits().toLong() and 0xFFFF_FFFFL), layoutrect, format)).toLong().toInt()
}

public fun GdipAddPathStringI(path: Long, string: PCWSTR, length: Int, family: Long, style: Int, emsize: Float, layoutrect: Long, format: Long): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipAddPathStringI", 1024, false, longArrayOf(path, string, length.toLong(), family, style.toLong(), (emsize.toRawBits().toLong() and 0xFFFF_FFFFL), layoutrect, format)).toLong().toInt()
}

public fun GdipAlloc(size: ULong): Long {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipAlloc", longArrayOf(size.toLong()))
}

public fun GdipBeginContainer(graphics: Long, dstrect: Long, srcrect: Long, unit: Unit, state: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipBeginContainer", longArrayOf(graphics, dstrect, srcrect, unit.toLong(), state)).toInt()
}

public fun GdipBeginContainer2(graphics: Long, state: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipBeginContainer2", longArrayOf(graphics, state)).toInt()
}

public fun GdipBeginContainerI(graphics: Long, dstrect: Long, srcrect: Long, unit: Unit, state: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipBeginContainerI", longArrayOf(graphics, dstrect, srcrect, unit.toLong(), state)).toInt()
}

public fun GdipBitmapApplyEffect(bitmap: Long, effect: Long, roi: Long, useauxdata: BOOL, auxdata: Long, auxdatasize: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipBitmapApplyEffect", longArrayOf(bitmap, effect, roi, useauxdata.toLong(), auxdata, auxdatasize)).toInt()
}

public fun GdipBitmapConvertFormat(pinputbitmap: Long, format: Int, dithertype: DitherType, palettetype: PaletteType, palette: Long, alphathresholdpercent: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipBitmapConvertFormat", 1024, false, longArrayOf(pinputbitmap, format.toLong(), dithertype.toLong(), palettetype.toLong(), palette, (alphathresholdpercent.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipBitmapCreateApplyEffect(inputbitmaps: Long, numinputs: Int, effect: Long, roi: Long, outputrect: Long, outputbitmap: Long, useauxdata: BOOL, auxdata: Long, auxdatasize: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipBitmapCreateApplyEffect", longArrayOf(inputbitmaps, numinputs.toLong(), effect, roi, outputrect, outputbitmap, useauxdata.toLong(), auxdata, auxdatasize)).toInt()
}

public fun GdipBitmapGetHistogram(bitmap: Long, format: HistogramFormat, numberofentries: UInt, channel0: Long, channel1: Long, channel2: Long, channel3: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipBitmapGetHistogram", longArrayOf(bitmap, format.toLong(), numberofentries.toLong(), channel0, channel1, channel2, channel3)).toInt()
}

public fun GdipBitmapGetHistogramSize(format: HistogramFormat, numberofentries: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipBitmapGetHistogramSize", longArrayOf(format.toLong(), numberofentries)).toInt()
}

public fun GdipBitmapGetPixel(bitmap: Long, x: Int, y: Int, color: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipBitmapGetPixel", longArrayOf(bitmap, x.toLong(), y.toLong(), color)).toInt()
}

public fun GdipBitmapLockBits(bitmap: Long, rect: Long, flags: UInt, format: Int, lockedbitmapdata: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipBitmapLockBits", longArrayOf(bitmap, rect, flags.toLong(), format.toLong(), lockedbitmapdata)).toInt()
}

public fun GdipBitmapSetPixel(bitmap: Long, x: Int, y: Int, color: UInt): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipBitmapSetPixel", longArrayOf(bitmap, x.toLong(), y.toLong(), color.toLong())).toInt()
}

public fun GdipBitmapSetResolution(bitmap: Long, xdpi: Float, ydpi: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipBitmapSetResolution", 20, false, longArrayOf(bitmap, (xdpi.toRawBits().toLong() and 0xFFFF_FFFFL), (ydpi.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipBitmapUnlockBits(bitmap: Long, lockedbitmapdata: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipBitmapUnlockBits", longArrayOf(bitmap, lockedbitmapdata)).toInt()
}

public fun GdipClearPathMarkers(path: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipClearPathMarkers", longArrayOf(path)).toInt()
}

public fun GdipCloneBitmapArea(x: Float, y: Float, width: Float, height: Float, format: Int, srcbitmap: Long, dstbitmap: Long): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipCloneBitmapArea", 85, false, longArrayOf((x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL), (width.toRawBits().toLong() and 0xFFFF_FFFFL), (height.toRawBits().toLong() and 0xFFFF_FFFFL), format.toLong(), srcbitmap, dstbitmap)).toLong().toInt()
}

public fun GdipCloneBitmapAreaI(x: Int, y: Int, width: Int, height: Int, format: Int, srcbitmap: Long, dstbitmap: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCloneBitmapAreaI", longArrayOf(x.toLong(), y.toLong(), width.toLong(), height.toLong(), format.toLong(), srcbitmap, dstbitmap)).toInt()
}

public fun GdipCloneBrush(brush: Long, clonebrush: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCloneBrush", longArrayOf(brush, clonebrush)).toInt()
}

public fun GdipCloneCustomLineCap(customcap: Long, clonedcap: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCloneCustomLineCap", longArrayOf(customcap, clonedcap)).toInt()
}

public fun GdipCloneFont(font: Long, clonefont: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCloneFont", longArrayOf(font, clonefont)).toInt()
}

public fun GdipCloneFontFamily(fontfamily: Long, clonedfontfamily: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCloneFontFamily", longArrayOf(fontfamily, clonedfontfamily)).toInt()
}

public fun GdipCloneImage(image: Long, cloneimage: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCloneImage", longArrayOf(image, cloneimage)).toInt()
}

public fun GdipCloneImageAttributes(imageattr: Long, cloneimageattr: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCloneImageAttributes", longArrayOf(imageattr, cloneimageattr)).toInt()
}

public fun GdipCloneMatrix(matrix: Long, clonematrix: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCloneMatrix", longArrayOf(matrix, clonematrix)).toInt()
}

public fun GdipClonePath(path: Long, clonepath: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipClonePath", longArrayOf(path, clonepath)).toInt()
}

public fun GdipClonePen(pen: Long, clonepen: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipClonePen", longArrayOf(pen, clonepen)).toInt()
}

public fun GdipCloneRegion(region: Long, cloneregion: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCloneRegion", longArrayOf(region, cloneregion)).toInt()
}

public fun GdipCloneStringFormat(format: Long, newformat: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCloneStringFormat", longArrayOf(format, newformat)).toInt()
}

public fun GdipClosePathFigure(path: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipClosePathFigure", longArrayOf(path)).toInt()
}

public fun GdipClosePathFigures(path: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipClosePathFigures", longArrayOf(path)).toInt()
}

public fun GdipCombineRegionPath(region: Long, path: Long, combinemode: CombineMode): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCombineRegionPath", longArrayOf(region, path, combinemode.toLong())).toInt()
}

public fun GdipCombineRegionRect(region: Long, rect: Long, combinemode: CombineMode): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCombineRegionRect", longArrayOf(region, rect, combinemode.toLong())).toInt()
}

public fun GdipCombineRegionRectI(region: Long, rect: Long, combinemode: CombineMode): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCombineRegionRectI", longArrayOf(region, rect, combinemode.toLong())).toInt()
}

public fun GdipCombineRegionRegion(region: Long, region2: Long, combinemode: CombineMode): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCombineRegionRegion", longArrayOf(region, region2, combinemode.toLong())).toInt()
}

public fun GdipComment(graphics: Long, sizedata: UInt, data: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipComment", longArrayOf(graphics, sizedata.toLong(), data)).toInt()
}

public fun GdipConvertToEmfPlus(refgraphics: Long, metafile: Long, conversionfailureflag: Long, emftype: EmfType, description: PCWSTR, out_metafile: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipConvertToEmfPlus", longArrayOf(refgraphics, metafile, conversionfailureflag, emftype.toLong(), description, out_metafile)).toInt()
}

public fun GdipConvertToEmfPlusToFile(refgraphics: Long, metafile: Long, conversionfailureflag: Long, filename: PCWSTR, emftype: EmfType, description: PCWSTR, out_metafile: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipConvertToEmfPlusToFile", longArrayOf(refgraphics, metafile, conversionfailureflag, filename, emftype.toLong(), description, out_metafile)).toInt()
}

public fun GdipConvertToEmfPlusToStream(refgraphics: Long, metafile: Long, conversionfailureflag: Long, stream: Long, emftype: EmfType, description: PCWSTR, out_metafile: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipConvertToEmfPlusToStream", longArrayOf(refgraphics, metafile, conversionfailureflag, stream, emftype.toLong(), description, out_metafile)).toInt()
}

public fun GdipCreateAdjustableArrowCap(height: Float, width: Float, isfilled: BOOL, cap: Long): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipCreateAdjustableArrowCap", 5, false, longArrayOf((height.toRawBits().toLong() and 0xFFFF_FFFFL), (width.toRawBits().toLong() and 0xFFFF_FFFFL), isfilled.toLong(), cap)).toLong().toInt()
}

public fun GdipCreateBitmapFromFile(filename: PCWSTR, bitmap: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateBitmapFromFile", longArrayOf(filename, bitmap)).toInt()
}

public fun GdipCreateBitmapFromFileICM(filename: PCWSTR, bitmap: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateBitmapFromFileICM", longArrayOf(filename, bitmap)).toInt()
}

public fun GdipCreateBitmapFromGdiDib(gdibitmapinfo: Long, gdibitmapdata: Long, bitmap: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateBitmapFromGdiDib", longArrayOf(gdibitmapinfo, gdibitmapdata, bitmap)).toInt()
}

public fun GdipCreateBitmapFromGraphics(width: Int, height: Int, target: Long, bitmap: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateBitmapFromGraphics", longArrayOf(width.toLong(), height.toLong(), target, bitmap)).toInt()
}

public fun GdipCreateBitmapFromHBITMAP(hbm: HBITMAP, hpal: HPALETTE, bitmap: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateBitmapFromHBITMAP", longArrayOf(hbm, hpal, bitmap)).toInt()
}

public fun GdipCreateBitmapFromHICON(hicon: HICON, bitmap: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateBitmapFromHICON", longArrayOf(hicon, bitmap)).toInt()
}

public fun GdipCreateBitmapFromResource(hinstance: HINSTANCE, lpbitmapname: PCWSTR, bitmap: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateBitmapFromResource", longArrayOf(hinstance, lpbitmapname, bitmap)).toInt()
}

public fun GdipCreateBitmapFromScan0(width: Int, height: Int, stride: Int, format: Int, scan0: Long, bitmap: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateBitmapFromScan0", longArrayOf(width.toLong(), height.toLong(), stride.toLong(), format.toLong(), scan0, bitmap)).toInt()
}

public fun GdipCreateBitmapFromStream(stream: Long, bitmap: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateBitmapFromStream", longArrayOf(stream, bitmap)).toInt()
}

public fun GdipCreateBitmapFromStreamICM(stream: Long, bitmap: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateBitmapFromStreamICM", longArrayOf(stream, bitmap)).toInt()
}

public fun GdipCreateCachedBitmap(bitmap: Long, graphics: Long, cachedbitmap: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateCachedBitmap", longArrayOf(bitmap, graphics, cachedbitmap)).toInt()
}

public fun GdipCreateCustomLineCap(fillpath: Long, strokepath: Long, basecap: LineCap, baseinset: Float, customcap: Long): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipCreateCustomLineCap", 64, false, longArrayOf(fillpath, strokepath, basecap.toLong(), (baseinset.toRawBits().toLong() and 0xFFFF_FFFFL), customcap)).toLong().toInt()
}

public fun GdipCreateEffect(guid: GUID, effect: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateEffect", longArrayOf(run { val buf = ByteArray(16); buf[0] = (guid.data1.toInt() and 0xFF).toByte(); buf[1] = ((guid.data1.toInt() ushr 8) and 0xFF).toByte(); buf[2] = ((guid.data1.toInt() ushr 16) and 0xFF).toByte(); buf[3] = ((guid.data1.toInt() ushr 24) and 0xFF).toByte(); buf[4] = (guid.data2.toInt() and 0xFF).toByte(); buf[5] = ((guid.data2.toInt() ushr 8) and 0xFF).toByte(); buf[6] = (guid.data3.toInt() and 0xFF).toByte(); buf[7] = ((guid.data3.toInt() ushr 8) and 0xFF).toByte(); for (i in 0 until minOf(8, guid.data4.size)) buf[8 + i] = guid.data4[i].toByte(); val ptr = Win32DynamicFfi.allocZeroed(16); Win32DynamicFfi.writeBytes(ptr, buf); ptr }, effect)).toInt()
}

public fun GdipCreateFont(fontfamily: Long, emsize: Float, style: Int, unit: Unit, font: Long): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipCreateFont", 4, false, longArrayOf(fontfamily, (emsize.toRawBits().toLong() and 0xFFFF_FFFFL), style.toLong(), unit.toLong(), font)).toLong().toInt()
}

public fun GdipCreateFontFamilyFromName(name: PCWSTR, fontcollection: Long, fontfamily: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateFontFamilyFromName", longArrayOf(name, fontcollection, fontfamily)).toInt()
}

public fun GdipCreateFontFromDC(hdc: HDC, font: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateFontFromDC", longArrayOf(hdc, font)).toInt()
}

public fun GdipCreateFontFromLogfontA(hdc: HDC, logfont: Long, font: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateFontFromLogfontA", longArrayOf(hdc, logfont, font)).toInt()
}

public fun GdipCreateFontFromLogfontW(hdc: HDC, logfont: Long, font: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateFontFromLogfontW", longArrayOf(hdc, logfont, font)).toInt()
}

public fun GdipCreateFromHDC(hdc: HDC, graphics: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateFromHDC", longArrayOf(hdc, graphics)).toInt()
}

public fun GdipCreateFromHDC2(hdc: HDC, hdevice: HANDLE, graphics: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateFromHDC2", longArrayOf(hdc, hdevice, graphics)).toInt()
}

public fun GdipCreateFromHWND(hwnd: HWND, graphics: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateFromHWND", longArrayOf(hwnd, graphics)).toInt()
}

public fun GdipCreateFromHWNDICM(hwnd: HWND, graphics: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateFromHWNDICM", longArrayOf(hwnd, graphics)).toInt()
}

public fun GdipCreateHBITMAPFromBitmap(bitmap: Long, hbmreturn: Long, background: UInt): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateHBITMAPFromBitmap", longArrayOf(bitmap, hbmreturn, background.toLong())).toInt()
}

public fun GdipCreateHICONFromBitmap(bitmap: Long, hbmreturn: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateHICONFromBitmap", longArrayOf(bitmap, hbmreturn)).toInt()
}

public fun GdipCreateHalftonePalette(): HPALETTE {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateHalftonePalette", longArrayOf())
}

public fun GdipCreateHatchBrush(hatchstyle: HatchStyle, forecol: UInt, backcol: UInt, brush: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateHatchBrush", longArrayOf(hatchstyle.toLong(), forecol.toLong(), backcol.toLong(), brush)).toInt()
}

public fun GdipCreateImageAttributes(imageattr: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateImageAttributes", longArrayOf(imageattr)).toInt()
}

public fun GdipCreateLineBrush(point1: Long, point2: Long, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateLineBrush", longArrayOf(point1, point2, color1.toLong(), color2.toLong(), wrapmode.toLong(), linegradient)).toInt()
}

public fun GdipCreateLineBrushFromRect(rect: Long, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateLineBrushFromRect", longArrayOf(rect, color1.toLong(), color2.toLong(), mode.toLong(), wrapmode.toLong(), linegradient)).toInt()
}

public fun GdipCreateLineBrushFromRectI(rect: Long, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateLineBrushFromRectI", longArrayOf(rect, color1.toLong(), color2.toLong(), mode.toLong(), wrapmode.toLong(), linegradient)).toInt()
}

public fun GdipCreateLineBrushFromRectWithAngle(rect: Long, color1: UInt, color2: UInt, angle: Float, isanglescalable: BOOL, wrapmode: WrapMode, linegradient: Long): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipCreateLineBrushFromRectWithAngle", 64, false, longArrayOf(rect, color1.toLong(), color2.toLong(), (angle.toRawBits().toLong() and 0xFFFF_FFFFL), isanglescalable.toLong(), wrapmode.toLong(), linegradient)).toLong().toInt()
}

public fun GdipCreateLineBrushFromRectWithAngleI(rect: Long, color1: UInt, color2: UInt, angle: Float, isanglescalable: BOOL, wrapmode: WrapMode, linegradient: Long): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipCreateLineBrushFromRectWithAngleI", 64, false, longArrayOf(rect, color1.toLong(), color2.toLong(), (angle.toRawBits().toLong() and 0xFFFF_FFFFL), isanglescalable.toLong(), wrapmode.toLong(), linegradient)).toLong().toInt()
}

public fun GdipCreateLineBrushI(point1: Long, point2: Long, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateLineBrushI", longArrayOf(point1, point2, color1.toLong(), color2.toLong(), wrapmode.toLong(), linegradient)).toInt()
}

public fun GdipCreateMatrix(matrix: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateMatrix", longArrayOf(matrix)).toInt()
}

public fun GdipCreateMatrix2(m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float, matrix: Long): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipCreateMatrix2", 1365, false, longArrayOf((m11.toRawBits().toLong() and 0xFFFF_FFFFL), (m12.toRawBits().toLong() and 0xFFFF_FFFFL), (m21.toRawBits().toLong() and 0xFFFF_FFFFL), (m22.toRawBits().toLong() and 0xFFFF_FFFFL), (dx.toRawBits().toLong() and 0xFFFF_FFFFL), (dy.toRawBits().toLong() and 0xFFFF_FFFFL), matrix)).toLong().toInt()
}

public fun GdipCreateMatrix3(rect: Long, dstplg: Long, matrix: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateMatrix3", longArrayOf(rect, dstplg, matrix)).toInt()
}

public fun GdipCreateMatrix3I(rect: Long, dstplg: Long, matrix: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateMatrix3I", longArrayOf(rect, dstplg, matrix)).toInt()
}

public fun GdipCreateMetafileFromEmf(hemf: HENHMETAFILE, deleteemf: BOOL, metafile: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateMetafileFromEmf", longArrayOf(hemf, deleteemf.toLong(), metafile)).toInt()
}

public fun GdipCreateMetafileFromFile(file: PCWSTR, metafile: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateMetafileFromFile", longArrayOf(file, metafile)).toInt()
}

public fun GdipCreateMetafileFromStream(stream: Long, metafile: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateMetafileFromStream", longArrayOf(stream, metafile)).toInt()
}

public fun GdipCreateMetafileFromWmf(hwmf: HMETAFILE, deletewmf: BOOL, wmfplaceablefileheader: Long, metafile: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateMetafileFromWmf", longArrayOf(hwmf, deletewmf.toLong(), wmfplaceablefileheader, metafile)).toInt()
}

public fun GdipCreateMetafileFromWmfFile(file: PCWSTR, wmfplaceablefileheader: Long, metafile: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateMetafileFromWmfFile", longArrayOf(file, wmfplaceablefileheader, metafile)).toInt()
}

public fun GdipCreatePath(brushmode: FillMode, path: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreatePath", longArrayOf(brushmode.toLong(), path)).toInt()
}

public fun GdipCreatePath2(param0: Long, param1: Long, param2: Int, param3: FillMode, path: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreatePath2", longArrayOf(param0, param1, param2.toLong(), param3.toLong(), path)).toInt()
}

public fun GdipCreatePath2I(param0: Long, param1: Long, param2: Int, param3: FillMode, path: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreatePath2I", longArrayOf(param0, param1, param2.toLong(), param3.toLong(), path)).toInt()
}

public fun GdipCreatePathGradient(points: Long, count: Int, wrapmode: WrapMode, polygradient: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreatePathGradient", longArrayOf(points, count.toLong(), wrapmode.toLong(), polygradient)).toInt()
}

public fun GdipCreatePathGradientFromPath(path: Long, polygradient: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreatePathGradientFromPath", longArrayOf(path, polygradient)).toInt()
}

public fun GdipCreatePathGradientI(points: Long, count: Int, wrapmode: WrapMode, polygradient: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreatePathGradientI", longArrayOf(points, count.toLong(), wrapmode.toLong(), polygradient)).toInt()
}

public fun GdipCreatePathIter(iterator: Long, path: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreatePathIter", longArrayOf(iterator, path)).toInt()
}

public fun GdipCreatePen1(color: UInt, width: Float, unit: Unit, pen: Long): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipCreatePen1", 4, false, longArrayOf(color.toLong(), (width.toRawBits().toLong() and 0xFFFF_FFFFL), unit.toLong(), pen)).toLong().toInt()
}

public fun GdipCreatePen2(brush: Long, width: Float, unit: Unit, pen: Long): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipCreatePen2", 4, false, longArrayOf(brush, (width.toRawBits().toLong() and 0xFFFF_FFFFL), unit.toLong(), pen)).toLong().toInt()
}

public fun GdipCreateRegion(region: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateRegion", longArrayOf(region)).toInt()
}

public fun GdipCreateRegionHrgn(hrgn: HRGN, region: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateRegionHrgn", longArrayOf(hrgn, region)).toInt()
}

public fun GdipCreateRegionPath(path: Long, region: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateRegionPath", longArrayOf(path, region)).toInt()
}

public fun GdipCreateRegionRect(rect: Long, region: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateRegionRect", longArrayOf(rect, region)).toInt()
}

public fun GdipCreateRegionRectI(rect: Long, region: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateRegionRectI", longArrayOf(rect, region)).toInt()
}

public fun GdipCreateRegionRgnData(regiondata: Long, size: Int, region: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateRegionRgnData", longArrayOf(regiondata, size.toLong(), region)).toInt()
}

public fun GdipCreateSolidFill(color: UInt, brush: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateSolidFill", longArrayOf(color.toLong(), brush)).toInt()
}

public fun GdipCreateStreamOnFile(filename: PCWSTR, access: UInt, stream: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateStreamOnFile", longArrayOf(filename, access.toLong(), stream)).toInt()
}

public fun GdipCreateStringFormat(formatattributes: Int, language: UShort, format: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateStringFormat", longArrayOf(formatattributes.toLong(), language.toLong(), format)).toInt()
}

public fun GdipCreateTexture(image: Long, wrapmode: WrapMode, texture: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateTexture", longArrayOf(image, wrapmode.toLong(), texture)).toInt()
}

public fun GdipCreateTexture2(image: Long, wrapmode: WrapMode, x: Float, y: Float, width: Float, height: Float, texture: Long): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipCreateTexture2", 1360, false, longArrayOf(image, wrapmode.toLong(), (x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL), (width.toRawBits().toLong() and 0xFFFF_FFFFL), (height.toRawBits().toLong() and 0xFFFF_FFFFL), texture)).toLong().toInt()
}

public fun GdipCreateTexture2I(image: Long, wrapmode: WrapMode, x: Int, y: Int, width: Int, height: Int, texture: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateTexture2I", longArrayOf(image, wrapmode.toLong(), x.toLong(), y.toLong(), width.toLong(), height.toLong(), texture)).toInt()
}

public fun GdipCreateTextureIA(image: Long, imageattributes: Long, x: Float, y: Float, width: Float, height: Float, texture: Long): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipCreateTextureIA", 1360, false, longArrayOf(image, imageattributes, (x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL), (width.toRawBits().toLong() and 0xFFFF_FFFFL), (height.toRawBits().toLong() and 0xFFFF_FFFFL), texture)).toLong().toInt()
}

public fun GdipCreateTextureIAI(image: Long, imageattributes: Long, x: Int, y: Int, width: Int, height: Int, texture: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipCreateTextureIAI", longArrayOf(image, imageattributes, x.toLong(), y.toLong(), width.toLong(), height.toLong(), texture)).toInt()
}

public fun GdipDeleteBrush(brush: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDeleteBrush", longArrayOf(brush)).toInt()
}

public fun GdipDeleteCachedBitmap(cachedbitmap: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDeleteCachedBitmap", longArrayOf(cachedbitmap)).toInt()
}

public fun GdipDeleteCustomLineCap(customcap: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDeleteCustomLineCap", longArrayOf(customcap)).toInt()
}

public fun GdipDeleteEffect(effect: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDeleteEffect", longArrayOf(effect)).toInt()
}

public fun GdipDeleteFont(font: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDeleteFont", longArrayOf(font)).toInt()
}

public fun GdipDeleteFontFamily(fontfamily: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDeleteFontFamily", longArrayOf(fontfamily)).toInt()
}

public fun GdipDeleteGraphics(graphics: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDeleteGraphics", longArrayOf(graphics)).toInt()
}

public fun GdipDeleteMatrix(matrix: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDeleteMatrix", longArrayOf(matrix)).toInt()
}

public fun GdipDeletePath(path: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDeletePath", longArrayOf(path)).toInt()
}

public fun GdipDeletePathIter(iterator: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDeletePathIter", longArrayOf(iterator)).toInt()
}

public fun GdipDeletePen(pen: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDeletePen", longArrayOf(pen)).toInt()
}

public fun GdipDeletePrivateFontCollection(fontcollection: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDeletePrivateFontCollection", longArrayOf(fontcollection)).toInt()
}

public fun GdipDeleteRegion(region: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDeleteRegion", longArrayOf(region)).toInt()
}

public fun GdipDeleteStringFormat(format: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDeleteStringFormat", longArrayOf(format)).toInt()
}

public fun GdipDisposeImage(image: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDisposeImage", longArrayOf(image)).toInt()
}

public fun GdipDisposeImageAttributes(imageattr: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDisposeImageAttributes", longArrayOf(imageattr)).toInt()
}

public fun GdipDrawArc(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipDrawArc", 21840, false, longArrayOf(graphics, pen, (x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL), (width.toRawBits().toLong() and 0xFFFF_FFFFL), (height.toRawBits().toLong() and 0xFFFF_FFFFL), (startangle.toRawBits().toLong() and 0xFFFF_FFFFL), (sweepangle.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipDrawArcI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipDrawArcI", 20480, false, longArrayOf(graphics, pen, x.toLong(), y.toLong(), width.toLong(), height.toLong(), (startangle.toRawBits().toLong() and 0xFFFF_FFFFL), (sweepangle.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipDrawBezier(graphics: Long, pen: Long, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipDrawBezier", 21840, false, longArrayOf(graphics, pen, (x1.toRawBits().toLong() and 0xFFFF_FFFFL), (y1.toRawBits().toLong() and 0xFFFF_FFFFL), (x2.toRawBits().toLong() and 0xFFFF_FFFFL), (y2.toRawBits().toLong() and 0xFFFF_FFFFL), (x3.toRawBits().toLong() and 0xFFFF_FFFFL), (y3.toRawBits().toLong() and 0xFFFF_FFFFL), (x4.toRawBits().toLong() and 0xFFFF_FFFFL), (y4.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipDrawBezierI(graphics: Long, pen: Long, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDrawBezierI", longArrayOf(graphics, pen, x1.toLong(), y1.toLong(), x2.toLong(), y2.toLong(), x3.toLong(), y3.toLong(), x4.toLong(), y4.toLong())).toInt()
}

public fun GdipDrawBeziers(graphics: Long, pen: Long, points: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDrawBeziers", longArrayOf(graphics, pen, points, count.toLong())).toInt()
}

public fun GdipDrawBeziersI(graphics: Long, pen: Long, points: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDrawBeziersI", longArrayOf(graphics, pen, points, count.toLong())).toInt()
}

public fun GdipDrawCachedBitmap(graphics: Long, cachedbitmap: Long, x: Int, y: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDrawCachedBitmap", longArrayOf(graphics, cachedbitmap, x.toLong(), y.toLong())).toInt()
}

public fun GdipDrawClosedCurve(graphics: Long, pen: Long, points: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDrawClosedCurve", longArrayOf(graphics, pen, points, count.toLong())).toInt()
}

public fun GdipDrawClosedCurve2(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipDrawClosedCurve2", 256, false, longArrayOf(graphics, pen, points, count.toLong(), (tension.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipDrawClosedCurve2I(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipDrawClosedCurve2I", 256, false, longArrayOf(graphics, pen, points, count.toLong(), (tension.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipDrawClosedCurveI(graphics: Long, pen: Long, points: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDrawClosedCurveI", longArrayOf(graphics, pen, points, count.toLong())).toInt()
}

public fun GdipDrawCurve(graphics: Long, pen: Long, points: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDrawCurve", longArrayOf(graphics, pen, points, count.toLong())).toInt()
}

public fun GdipDrawCurve2(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipDrawCurve2", 256, false, longArrayOf(graphics, pen, points, count.toLong(), (tension.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipDrawCurve2I(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipDrawCurve2I", 256, false, longArrayOf(graphics, pen, points, count.toLong(), (tension.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipDrawCurve3(graphics: Long, pen: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipDrawCurve3", 4096, false, longArrayOf(graphics, pen, points, count.toLong(), offset.toLong(), numberofsegments.toLong(), (tension.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipDrawCurve3I(graphics: Long, pen: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipDrawCurve3I", 4096, false, longArrayOf(graphics, pen, points, count.toLong(), offset.toLong(), numberofsegments.toLong(), (tension.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipDrawCurveI(graphics: Long, pen: Long, points: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDrawCurveI", longArrayOf(graphics, pen, points, count.toLong())).toInt()
}

public fun GdipDrawDriverString(graphics: Long, text: Long, length: Int, font: Long, brush: Long, positions: Long, flags: Int, matrix: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDrawDriverString", longArrayOf(graphics, text, length.toLong(), font, brush, positions, flags.toLong(), matrix)).toInt()
}

public fun GdipDrawEllipse(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipDrawEllipse", 1360, false, longArrayOf(graphics, pen, (x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL), (width.toRawBits().toLong() and 0xFFFF_FFFFL), (height.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipDrawEllipseI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDrawEllipseI", longArrayOf(graphics, pen, x.toLong(), y.toLong(), width.toLong(), height.toLong())).toInt()
}

public fun GdipDrawImage(graphics: Long, image: Long, x: Float, y: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipDrawImage", 80, false, longArrayOf(graphics, image, (x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipDrawImageFX(graphics: Long, image: Long, source: Long, xform: Long, effect: Long, imageattributes: Long, srcunit: Unit): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDrawImageFX", longArrayOf(graphics, image, source, xform, effect, imageattributes, srcunit.toLong())).toInt()
}

public fun GdipDrawImageI(graphics: Long, image: Long, x: Int, y: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDrawImageI", longArrayOf(graphics, image, x.toLong(), y.toLong())).toInt()
}

public fun GdipDrawImagePointRect(graphics: Long, image: Long, x: Float, y: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipDrawImagePointRect", 21840, false, longArrayOf(graphics, image, (x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL), (srcx.toRawBits().toLong() and 0xFFFF_FFFFL), (srcy.toRawBits().toLong() and 0xFFFF_FFFFL), (srcwidth.toRawBits().toLong() and 0xFFFF_FFFFL), (srcheight.toRawBits().toLong() and 0xFFFF_FFFFL), srcunit.toLong())).toLong().toInt()
}

public fun GdipDrawImagePointRectI(graphics: Long, image: Long, x: Int, y: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDrawImagePointRectI", longArrayOf(graphics, image, x.toLong(), y.toLong(), srcx.toLong(), srcy.toLong(), srcwidth.toLong(), srcheight.toLong(), srcunit.toLong())).toInt()
}

public fun GdipDrawImagePoints(graphics: Long, image: Long, dstpoints: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDrawImagePoints", longArrayOf(graphics, image, dstpoints, count.toLong())).toInt()
}

public fun GdipDrawImagePointsI(graphics: Long, image: Long, dstpoints: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDrawImagePointsI", longArrayOf(graphics, image, dstpoints, count.toLong())).toInt()
}

public fun GdipDrawImagePointsRect(graphics: Long, image: Long, points: Long, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: Long, callback: Long, callbackdata: Long): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipDrawImagePointsRect", 21760, false, longArrayOf(graphics, image, points, count.toLong(), (srcx.toRawBits().toLong() and 0xFFFF_FFFFL), (srcy.toRawBits().toLong() and 0xFFFF_FFFFL), (srcwidth.toRawBits().toLong() and 0xFFFF_FFFFL), (srcheight.toRawBits().toLong() and 0xFFFF_FFFFL), srcunit.toLong(), imageattributes, callback, callbackdata)).toLong().toInt()
}

public fun GdipDrawImagePointsRectI(graphics: Long, image: Long, points: Long, count: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: Long, callback: Long, callbackdata: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDrawImagePointsRectI", longArrayOf(graphics, image, points, count.toLong(), srcx.toLong(), srcy.toLong(), srcwidth.toLong(), srcheight.toLong(), srcunit.toLong(), imageattributes, callback, callbackdata)).toInt()
}

public fun GdipDrawImageRect(graphics: Long, image: Long, x: Float, y: Float, width: Float, height: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipDrawImageRect", 1360, false, longArrayOf(graphics, image, (x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL), (width.toRawBits().toLong() and 0xFFFF_FFFFL), (height.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipDrawImageRectI(graphics: Long, image: Long, x: Int, y: Int, width: Int, height: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDrawImageRectI", longArrayOf(graphics, image, x.toLong(), y.toLong(), width.toLong(), height.toLong())).toInt()
}

public fun GdipDrawImageRectRect(graphics: Long, image: Long, dstx: Float, dsty: Float, dstwidth: Float, dstheight: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: Long, callback: Long, callbackdata: Long): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipDrawImageRectRect", 21840, false, longArrayOf(graphics, image, (dstx.toRawBits().toLong() and 0xFFFF_FFFFL), (dsty.toRawBits().toLong() and 0xFFFF_FFFFL), (dstwidth.toRawBits().toLong() and 0xFFFF_FFFFL), (dstheight.toRawBits().toLong() and 0xFFFF_FFFFL), (srcx.toRawBits().toLong() and 0xFFFF_FFFFL), (srcy.toRawBits().toLong() and 0xFFFF_FFFFL), (srcwidth.toRawBits().toLong() and 0xFFFF_FFFFL), (srcheight.toRawBits().toLong() and 0xFFFF_FFFFL), srcunit.toLong(), imageattributes, callback, callbackdata)).toLong().toInt()
}

public fun GdipDrawImageRectRectI(graphics: Long, image: Long, dstx: Int, dsty: Int, dstwidth: Int, dstheight: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: Long, callback: Long, callbackdata: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDrawImageRectRectI", longArrayOf(graphics, image, dstx.toLong(), dsty.toLong(), dstwidth.toLong(), dstheight.toLong(), srcx.toLong(), srcy.toLong(), srcwidth.toLong(), srcheight.toLong(), srcunit.toLong(), imageattributes, callback, callbackdata)).toInt()
}

public fun GdipDrawLine(graphics: Long, pen: Long, x1: Float, y1: Float, x2: Float, y2: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipDrawLine", 1360, false, longArrayOf(graphics, pen, (x1.toRawBits().toLong() and 0xFFFF_FFFFL), (y1.toRawBits().toLong() and 0xFFFF_FFFFL), (x2.toRawBits().toLong() and 0xFFFF_FFFFL), (y2.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipDrawLineI(graphics: Long, pen: Long, x1: Int, y1: Int, x2: Int, y2: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDrawLineI", longArrayOf(graphics, pen, x1.toLong(), y1.toLong(), x2.toLong(), y2.toLong())).toInt()
}

public fun GdipDrawLines(graphics: Long, pen: Long, points: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDrawLines", longArrayOf(graphics, pen, points, count.toLong())).toInt()
}

public fun GdipDrawLinesI(graphics: Long, pen: Long, points: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDrawLinesI", longArrayOf(graphics, pen, points, count.toLong())).toInt()
}

public fun GdipDrawPath(graphics: Long, pen: Long, path: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDrawPath", longArrayOf(graphics, pen, path)).toInt()
}

public fun GdipDrawPie(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipDrawPie", 21840, false, longArrayOf(graphics, pen, (x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL), (width.toRawBits().toLong() and 0xFFFF_FFFFL), (height.toRawBits().toLong() and 0xFFFF_FFFFL), (startangle.toRawBits().toLong() and 0xFFFF_FFFFL), (sweepangle.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipDrawPieI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipDrawPieI", 20480, false, longArrayOf(graphics, pen, x.toLong(), y.toLong(), width.toLong(), height.toLong(), (startangle.toRawBits().toLong() and 0xFFFF_FFFFL), (sweepangle.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipDrawPolygon(graphics: Long, pen: Long, points: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDrawPolygon", longArrayOf(graphics, pen, points, count.toLong())).toInt()
}

public fun GdipDrawPolygonI(graphics: Long, pen: Long, points: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDrawPolygonI", longArrayOf(graphics, pen, points, count.toLong())).toInt()
}

public fun GdipDrawRectangle(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipDrawRectangle", 1360, false, longArrayOf(graphics, pen, (x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL), (width.toRawBits().toLong() and 0xFFFF_FFFFL), (height.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipDrawRectangleI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDrawRectangleI", longArrayOf(graphics, pen, x.toLong(), y.toLong(), width.toLong(), height.toLong())).toInt()
}

public fun GdipDrawRectangles(graphics: Long, pen: Long, rects: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDrawRectangles", longArrayOf(graphics, pen, rects, count.toLong())).toInt()
}

public fun GdipDrawRectanglesI(graphics: Long, pen: Long, rects: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDrawRectanglesI", longArrayOf(graphics, pen, rects, count.toLong())).toInt()
}

public fun GdipDrawString(graphics: Long, string: PCWSTR, length: Int, font: Long, layoutrect: Long, stringformat: Long, brush: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipDrawString", longArrayOf(graphics, string, length.toLong(), font, layoutrect, stringformat, brush)).toInt()
}

public fun GdipEmfToWmfBits(hemf: HENHMETAFILE, cbdata16: UInt, pdata16: Long, imapmode: Int, eflags: Int): UInt {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipEmfToWmfBits", longArrayOf(hemf, cbdata16.toLong(), pdata16, imapmode.toLong(), eflags.toLong())).toUInt()
}

public fun GdipEndContainer(graphics: Long, state: UInt): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipEndContainer", longArrayOf(graphics, state.toLong())).toInt()
}

public fun GdipEnumerateMetafileDestPoint(graphics: Long, metafile: Long, destpoint: Long, callback: Long, callbackdata: Long, imageattributes: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipEnumerateMetafileDestPoint", longArrayOf(graphics, metafile, destpoint, callback, callbackdata, imageattributes)).toInt()
}

public fun GdipEnumerateMetafileDestPointI(graphics: Long, metafile: Long, destpoint: Long, callback: Long, callbackdata: Long, imageattributes: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipEnumerateMetafileDestPointI", longArrayOf(graphics, metafile, destpoint, callback, callbackdata, imageattributes)).toInt()
}

public fun GdipEnumerateMetafileDestPoints(graphics: Long, metafile: Long, destpoints: Long, count: Int, callback: Long, callbackdata: Long, imageattributes: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipEnumerateMetafileDestPoints", longArrayOf(graphics, metafile, destpoints, count.toLong(), callback, callbackdata, imageattributes)).toInt()
}

public fun GdipEnumerateMetafileDestPointsI(graphics: Long, metafile: Long, destpoints: Long, count: Int, callback: Long, callbackdata: Long, imageattributes: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipEnumerateMetafileDestPointsI", longArrayOf(graphics, metafile, destpoints, count.toLong(), callback, callbackdata, imageattributes)).toInt()
}

public fun GdipEnumerateMetafileDestRect(graphics: Long, metafile: Long, destrect: Long, callback: Long, callbackdata: Long, imageattributes: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipEnumerateMetafileDestRect", longArrayOf(graphics, metafile, destrect, callback, callbackdata, imageattributes)).toInt()
}

public fun GdipEnumerateMetafileDestRectI(graphics: Long, metafile: Long, destrect: Long, callback: Long, callbackdata: Long, imageattributes: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipEnumerateMetafileDestRectI", longArrayOf(graphics, metafile, destrect, callback, callbackdata, imageattributes)).toInt()
}

public fun GdipEnumerateMetafileSrcRectDestPoint(graphics: Long, metafile: Long, destpoint: Long, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipEnumerateMetafileSrcRectDestPoint", longArrayOf(graphics, metafile, destpoint, srcrect, srcunit.toLong(), callback, callbackdata, imageattributes)).toInt()
}

public fun GdipEnumerateMetafileSrcRectDestPointI(graphics: Long, metafile: Long, destpoint: Long, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipEnumerateMetafileSrcRectDestPointI", longArrayOf(graphics, metafile, destpoint, srcrect, srcunit.toLong(), callback, callbackdata, imageattributes)).toInt()
}

public fun GdipEnumerateMetafileSrcRectDestPoints(graphics: Long, metafile: Long, destpoints: Long, count: Int, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipEnumerateMetafileSrcRectDestPoints", longArrayOf(graphics, metafile, destpoints, count.toLong(), srcrect, srcunit.toLong(), callback, callbackdata, imageattributes)).toInt()
}

public fun GdipEnumerateMetafileSrcRectDestPointsI(graphics: Long, metafile: Long, destpoints: Long, count: Int, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipEnumerateMetafileSrcRectDestPointsI", longArrayOf(graphics, metafile, destpoints, count.toLong(), srcrect, srcunit.toLong(), callback, callbackdata, imageattributes)).toInt()
}

public fun GdipEnumerateMetafileSrcRectDestRect(graphics: Long, metafile: Long, destrect: Long, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipEnumerateMetafileSrcRectDestRect", longArrayOf(graphics, metafile, destrect, srcrect, srcunit.toLong(), callback, callbackdata, imageattributes)).toInt()
}

public fun GdipEnumerateMetafileSrcRectDestRectI(graphics: Long, metafile: Long, destrect: Long, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipEnumerateMetafileSrcRectDestRectI", longArrayOf(graphics, metafile, destrect, srcrect, srcunit.toLong(), callback, callbackdata, imageattributes)).toInt()
}

public fun GdipFillClosedCurve(graphics: Long, brush: Long, points: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipFillClosedCurve", longArrayOf(graphics, brush, points, count.toLong())).toInt()
}

public fun GdipFillClosedCurve2(graphics: Long, brush: Long, points: Long, count: Int, tension: Float, fillmode: FillMode): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipFillClosedCurve2", 256, false, longArrayOf(graphics, brush, points, count.toLong(), (tension.toRawBits().toLong() and 0xFFFF_FFFFL), fillmode.toLong())).toLong().toInt()
}

public fun GdipFillClosedCurve2I(graphics: Long, brush: Long, points: Long, count: Int, tension: Float, fillmode: FillMode): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipFillClosedCurve2I", 256, false, longArrayOf(graphics, brush, points, count.toLong(), (tension.toRawBits().toLong() and 0xFFFF_FFFFL), fillmode.toLong())).toLong().toInt()
}

public fun GdipFillClosedCurveI(graphics: Long, brush: Long, points: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipFillClosedCurveI", longArrayOf(graphics, brush, points, count.toLong())).toInt()
}

public fun GdipFillEllipse(graphics: Long, brush: Long, x: Float, y: Float, width: Float, height: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipFillEllipse", 1360, false, longArrayOf(graphics, brush, (x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL), (width.toRawBits().toLong() and 0xFFFF_FFFFL), (height.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipFillEllipseI(graphics: Long, brush: Long, x: Int, y: Int, width: Int, height: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipFillEllipseI", longArrayOf(graphics, brush, x.toLong(), y.toLong(), width.toLong(), height.toLong())).toInt()
}

public fun GdipFillPath(graphics: Long, brush: Long, path: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipFillPath", longArrayOf(graphics, brush, path)).toInt()
}

public fun GdipFillPie(graphics: Long, brush: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipFillPie", 21840, false, longArrayOf(graphics, brush, (x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL), (width.toRawBits().toLong() and 0xFFFF_FFFFL), (height.toRawBits().toLong() and 0xFFFF_FFFFL), (startangle.toRawBits().toLong() and 0xFFFF_FFFFL), (sweepangle.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipFillPieI(graphics: Long, brush: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipFillPieI", 20480, false, longArrayOf(graphics, brush, x.toLong(), y.toLong(), width.toLong(), height.toLong(), (startangle.toRawBits().toLong() and 0xFFFF_FFFFL), (sweepangle.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipFillPolygon(graphics: Long, brush: Long, points: Long, count: Int, fillmode: FillMode): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipFillPolygon", longArrayOf(graphics, brush, points, count.toLong(), fillmode.toLong())).toInt()
}

public fun GdipFillPolygon2(graphics: Long, brush: Long, points: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipFillPolygon2", longArrayOf(graphics, brush, points, count.toLong())).toInt()
}

public fun GdipFillPolygon2I(graphics: Long, brush: Long, points: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipFillPolygon2I", longArrayOf(graphics, brush, points, count.toLong())).toInt()
}

public fun GdipFillPolygonI(graphics: Long, brush: Long, points: Long, count: Int, fillmode: FillMode): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipFillPolygonI", longArrayOf(graphics, brush, points, count.toLong(), fillmode.toLong())).toInt()
}

public fun GdipFillRectangle(graphics: Long, brush: Long, x: Float, y: Float, width: Float, height: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipFillRectangle", 1360, false, longArrayOf(graphics, brush, (x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL), (width.toRawBits().toLong() and 0xFFFF_FFFFL), (height.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipFillRectangleI(graphics: Long, brush: Long, x: Int, y: Int, width: Int, height: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipFillRectangleI", longArrayOf(graphics, brush, x.toLong(), y.toLong(), width.toLong(), height.toLong())).toInt()
}

public fun GdipFillRectangles(graphics: Long, brush: Long, rects: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipFillRectangles", longArrayOf(graphics, brush, rects, count.toLong())).toInt()
}

public fun GdipFillRectanglesI(graphics: Long, brush: Long, rects: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipFillRectanglesI", longArrayOf(graphics, brush, rects, count.toLong())).toInt()
}

public fun GdipFillRegion(graphics: Long, brush: Long, region: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipFillRegion", longArrayOf(graphics, brush, region)).toInt()
}

public fun GdipFindFirstImageItem(image: Long, item: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipFindFirstImageItem", longArrayOf(image, item)).toInt()
}

public fun GdipFindNextImageItem(image: Long, item: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipFindNextImageItem", longArrayOf(image, item)).toInt()
}

public fun GdipFlattenPath(path: Long, matrix: Long, flatness: Float): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipFlattenPath", 16, false, longArrayOf(path, matrix, (flatness.toRawBits().toLong() and 0xFFFF_FFFFL))).toLong().toInt()
}

public fun GdipFlush(graphics: Long, intention: FlushIntention): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipFlush", longArrayOf(graphics, intention.toLong())).toInt()
}

public fun GdipFree(ptr: Long) {
    Win32DynamicFfi.invoke("gdiplus.dll", "GdipFree", longArrayOf(ptr))
}

public fun GdipGetAdjustableArrowCapFillState(cap: Long, fillstate: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetAdjustableArrowCapFillState", longArrayOf(cap, fillstate)).toInt()
}

public fun GdipGetAdjustableArrowCapHeight(cap: Long, height: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetAdjustableArrowCapHeight", longArrayOf(cap, height)).toInt()
}

public fun GdipGetAdjustableArrowCapMiddleInset(cap: Long, middleinset: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetAdjustableArrowCapMiddleInset", longArrayOf(cap, middleinset)).toInt()
}

public fun GdipGetAdjustableArrowCapWidth(cap: Long, width: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetAdjustableArrowCapWidth", longArrayOf(cap, width)).toInt()
}

public fun GdipGetAllPropertyItems(image: Long, totalbuffersize: UInt, numproperties: UInt, allitems: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetAllPropertyItems", longArrayOf(image, totalbuffersize.toLong(), numproperties.toLong(), allitems)).toInt()
}

public fun GdipGetBrushType(brush: Long, type: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetBrushType", longArrayOf(brush, type)).toInt()
}

public fun GdipGetCellAscent(family: Long, style: Int, cellascent: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetCellAscent", longArrayOf(family, style.toLong(), cellascent)).toInt()
}

public fun GdipGetCellDescent(family: Long, style: Int, celldescent: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetCellDescent", longArrayOf(family, style.toLong(), celldescent)).toInt()
}

public fun GdipGetClip(graphics: Long, region: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetClip", longArrayOf(graphics, region)).toInt()
}

public fun GdipGetClipBounds(graphics: Long, rect: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetClipBounds", longArrayOf(graphics, rect)).toInt()
}

public fun GdipGetClipBoundsI(graphics: Long, rect: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetClipBoundsI", longArrayOf(graphics, rect)).toInt()
}

public fun GdipGetCompositingMode(graphics: Long, compositingmode: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetCompositingMode", longArrayOf(graphics, compositingmode)).toInt()
}

public fun GdipGetCompositingQuality(graphics: Long, compositingquality: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetCompositingQuality", longArrayOf(graphics, compositingquality)).toInt()
}

public fun GdipGetCustomLineCapBaseCap(customcap: Long, basecap: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetCustomLineCapBaseCap", longArrayOf(customcap, basecap)).toInt()
}

public fun GdipGetCustomLineCapBaseInset(customcap: Long, inset: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetCustomLineCapBaseInset", longArrayOf(customcap, inset)).toInt()
}

public fun GdipGetCustomLineCapStrokeCaps(customcap: Long, startcap: Long, endcap: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetCustomLineCapStrokeCaps", longArrayOf(customcap, startcap, endcap)).toInt()
}

public fun GdipGetCustomLineCapStrokeJoin(customcap: Long, linejoin: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetCustomLineCapStrokeJoin", longArrayOf(customcap, linejoin)).toInt()
}

public fun GdipGetCustomLineCapType(customcap: Long, captype: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetCustomLineCapType", longArrayOf(customcap, captype)).toInt()
}

public fun GdipGetCustomLineCapWidthScale(customcap: Long, widthscale: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetCustomLineCapWidthScale", longArrayOf(customcap, widthscale)).toInt()
}

public fun GdipGetDC(graphics: Long, hdc: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetDC", longArrayOf(graphics, hdc)).toInt()
}

public fun GdipGetDpiX(graphics: Long, dpi: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetDpiX", longArrayOf(graphics, dpi)).toInt()
}

public fun GdipGetDpiY(graphics: Long, dpi: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetDpiY", longArrayOf(graphics, dpi)).toInt()
}

public fun GdipGetEffectParameterSize(effect: Long, size: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetEffectParameterSize", longArrayOf(effect, size)).toInt()
}

public fun GdipGetEffectParameters(effect: Long, size: Long, params: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetEffectParameters", longArrayOf(effect, size, params)).toInt()
}

public fun GdipGetEmHeight(family: Long, style: Int, emheight: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetEmHeight", longArrayOf(family, style.toLong(), emheight)).toInt()
}

public fun GdipGetEncoderParameterList(image: Long, clsidencoder: Long, size: UInt, buffer: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetEncoderParameterList", longArrayOf(image, clsidencoder, size.toLong(), buffer)).toInt()
}

public fun GdipGetEncoderParameterListSize(image: Long, clsidencoder: Long, size: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetEncoderParameterListSize", longArrayOf(image, clsidencoder, size)).toInt()
}

public fun GdipGetFamily(font: Long, family: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetFamily", longArrayOf(font, family)).toInt()
}

public fun GdipGetFamilyName(family: Long, name: PWSTR, language: UShort): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetFamilyName", longArrayOf(family, name, language.toLong())).toInt()
}

public fun GdipGetFontCollectionFamilyCount(fontcollection: Long, numfound: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetFontCollectionFamilyCount", longArrayOf(fontcollection, numfound)).toInt()
}

public fun GdipGetFontCollectionFamilyList(fontcollection: Long, numsought: Int, gpfamilies: Long, numfound: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetFontCollectionFamilyList", longArrayOf(fontcollection, numsought.toLong(), gpfamilies, numfound)).toInt()
}

public fun GdipGetFontHeight(font: Long, graphics: Long, height: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetFontHeight", longArrayOf(font, graphics, height)).toInt()
}

public fun GdipGetFontHeightGivenDPI(font: Long, dpi: Float, height: Long): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipGetFontHeightGivenDPI", 4, false, longArrayOf(font, (dpi.toRawBits().toLong() and 0xFFFF_FFFFL), height)).toLong().toInt()
}

public fun GdipGetFontSize(font: Long, size: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetFontSize", longArrayOf(font, size)).toInt()
}

public fun GdipGetFontStyle(font: Long, style: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetFontStyle", longArrayOf(font, style)).toInt()
}

public fun GdipGetFontUnit(font: Long, unit: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetFontUnit", longArrayOf(font, unit)).toInt()
}

public fun GdipGetGenericFontFamilyMonospace(nativefamily: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetGenericFontFamilyMonospace", longArrayOf(nativefamily)).toInt()
}

public fun GdipGetGenericFontFamilySansSerif(nativefamily: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetGenericFontFamilySansSerif", longArrayOf(nativefamily)).toInt()
}

public fun GdipGetGenericFontFamilySerif(nativefamily: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetGenericFontFamilySerif", longArrayOf(nativefamily)).toInt()
}

public fun GdipGetHatchBackgroundColor(brush: Long, backcol: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetHatchBackgroundColor", longArrayOf(brush, backcol)).toInt()
}

public fun GdipGetHatchForegroundColor(brush: Long, forecol: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetHatchForegroundColor", longArrayOf(brush, forecol)).toInt()
}

public fun GdipGetHatchStyle(brush: Long, hatchstyle: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetHatchStyle", longArrayOf(brush, hatchstyle)).toInt()
}

public fun GdipGetHemfFromMetafile(metafile: Long, hemf: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetHemfFromMetafile", longArrayOf(metafile, hemf)).toInt()
}

public fun GdipGetImageAttributesAdjustedPalette(imageattr: Long, colorpalette: Long, coloradjusttype: ColorAdjustType): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetImageAttributesAdjustedPalette", longArrayOf(imageattr, colorpalette, coloradjusttype.toLong())).toInt()
}

public fun GdipGetImageBounds(image: Long, srcrect: Long, srcunit: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetImageBounds", longArrayOf(image, srcrect, srcunit)).toInt()
}

public fun GdipGetImageDecoders(numdecoders: UInt, size: UInt, decoders: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetImageDecoders", longArrayOf(numdecoders.toLong(), size.toLong(), decoders)).toInt()
}

public fun GdipGetImageDecodersSize(numdecoders: Long, size: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetImageDecodersSize", longArrayOf(numdecoders, size)).toInt()
}

public fun GdipGetImageDimension(image: Long, width: Long, height: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetImageDimension", longArrayOf(image, width, height)).toInt()
}

public fun GdipGetImageEncoders(numencoders: UInt, size: UInt, encoders: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetImageEncoders", longArrayOf(numencoders.toLong(), size.toLong(), encoders)).toInt()
}

public fun GdipGetImageEncodersSize(numencoders: Long, size: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetImageEncodersSize", longArrayOf(numencoders, size)).toInt()
}

public fun GdipGetImageFlags(image: Long, flags: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetImageFlags", longArrayOf(image, flags)).toInt()
}

public fun GdipGetImageGraphicsContext(image: Long, graphics: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetImageGraphicsContext", longArrayOf(image, graphics)).toInt()
}

public fun GdipGetImageHeight(image: Long, height: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetImageHeight", longArrayOf(image, height)).toInt()
}

public fun GdipGetImageHorizontalResolution(image: Long, resolution: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetImageHorizontalResolution", longArrayOf(image, resolution)).toInt()
}

public fun GdipGetImageItemData(image: Long, item: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetImageItemData", longArrayOf(image, item)).toInt()
}

public fun GdipGetImagePalette(image: Long, palette: Long, size: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetImagePalette", longArrayOf(image, palette, size.toLong())).toInt()
}

public fun GdipGetImagePaletteSize(image: Long, size: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetImagePaletteSize", longArrayOf(image, size)).toInt()
}

public fun GdipGetImagePixelFormat(image: Long, format: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetImagePixelFormat", longArrayOf(image, format)).toInt()
}

public fun GdipGetImageRawFormat(image: Long, format: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetImageRawFormat", longArrayOf(image, format)).toInt()
}

public fun GdipGetImageThumbnail(image: Long, thumbwidth: UInt, thumbheight: UInt, thumbimage: Long, callback: Long, callbackdata: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetImageThumbnail", longArrayOf(image, thumbwidth.toLong(), thumbheight.toLong(), thumbimage, callback, callbackdata)).toInt()
}

public fun GdipGetImageType(image: Long, type: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetImageType", longArrayOf(image, type)).toInt()
}

public fun GdipGetImageVerticalResolution(image: Long, resolution: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetImageVerticalResolution", longArrayOf(image, resolution)).toInt()
}

public fun GdipGetImageWidth(image: Long, width: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetImageWidth", longArrayOf(image, width)).toInt()
}

public fun GdipGetInterpolationMode(graphics: Long, interpolationmode: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetInterpolationMode", longArrayOf(graphics, interpolationmode)).toInt()
}

public fun GdipGetLineBlend(brush: Long, blend: Long, positions: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetLineBlend", longArrayOf(brush, blend, positions, count.toLong())).toInt()
}

public fun GdipGetLineBlendCount(brush: Long, count: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetLineBlendCount", longArrayOf(brush, count)).toInt()
}

public fun GdipGetLineColors(brush: Long, colors: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetLineColors", longArrayOf(brush, colors)).toInt()
}

public fun GdipGetLineGammaCorrection(brush: Long, usegammacorrection: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetLineGammaCorrection", longArrayOf(brush, usegammacorrection)).toInt()
}

public fun GdipGetLinePresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetLinePresetBlend", longArrayOf(brush, blend, positions, count.toLong())).toInt()
}

public fun GdipGetLinePresetBlendCount(brush: Long, count: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetLinePresetBlendCount", longArrayOf(brush, count)).toInt()
}

public fun GdipGetLineRect(brush: Long, rect: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetLineRect", longArrayOf(brush, rect)).toInt()
}

public fun GdipGetLineRectI(brush: Long, rect: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetLineRectI", longArrayOf(brush, rect)).toInt()
}

public fun GdipGetLineSpacing(family: Long, style: Int, linespacing: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetLineSpacing", longArrayOf(family, style.toLong(), linespacing)).toInt()
}

public fun GdipGetLineTransform(brush: Long, matrix: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetLineTransform", longArrayOf(brush, matrix)).toInt()
}

public fun GdipGetLineWrapMode(brush: Long, wrapmode: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetLineWrapMode", longArrayOf(brush, wrapmode)).toInt()
}

public fun GdipGetLogFontA(font: Long, graphics: Long, logfonta: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetLogFontA", longArrayOf(font, graphics, logfonta)).toInt()
}

public fun GdipGetLogFontW(font: Long, graphics: Long, logfontw: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetLogFontW", longArrayOf(font, graphics, logfontw)).toInt()
}

public fun GdipGetMatrixElements(matrix: Long, matrixout: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetMatrixElements", longArrayOf(matrix, matrixout)).toInt()
}

public fun GdipGetMetafileDownLevelRasterizationLimit(metafile: Long, metafilerasterizationlimitdpi: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetMetafileDownLevelRasterizationLimit", longArrayOf(metafile, metafilerasterizationlimitdpi)).toInt()
}

public fun GdipGetMetafileHeaderFromEmf(hemf: HENHMETAFILE, header: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetMetafileHeaderFromEmf", longArrayOf(hemf, header)).toInt()
}

public fun GdipGetMetafileHeaderFromFile(filename: PCWSTR, header: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetMetafileHeaderFromFile", longArrayOf(filename, header)).toInt()
}

public fun GdipGetMetafileHeaderFromMetafile(metafile: Long, header: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetMetafileHeaderFromMetafile", longArrayOf(metafile, header)).toInt()
}

public fun GdipGetMetafileHeaderFromStream(stream: Long, header: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetMetafileHeaderFromStream", longArrayOf(stream, header)).toInt()
}

public fun GdipGetMetafileHeaderFromWmf(hwmf: HMETAFILE, wmfplaceablefileheader: Long, header: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetMetafileHeaderFromWmf", longArrayOf(hwmf, wmfplaceablefileheader, header)).toInt()
}

public fun GdipGetNearestColor(graphics: Long, argb: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetNearestColor", longArrayOf(graphics, argb)).toInt()
}

public fun GdipGetPageScale(graphics: Long, scale: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPageScale", longArrayOf(graphics, scale)).toInt()
}

public fun GdipGetPageUnit(graphics: Long, unit: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPageUnit", longArrayOf(graphics, unit)).toInt()
}

public fun GdipGetPathData(path: Long, pathdata: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPathData", longArrayOf(path, pathdata)).toInt()
}

public fun GdipGetPathFillMode(path: Long, fillmode: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPathFillMode", longArrayOf(path, fillmode)).toInt()
}

public fun GdipGetPathGradientBlend(brush: Long, blend: Long, positions: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPathGradientBlend", longArrayOf(brush, blend, positions, count.toLong())).toInt()
}

public fun GdipGetPathGradientBlendCount(brush: Long, count: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPathGradientBlendCount", longArrayOf(brush, count)).toInt()
}

public fun GdipGetPathGradientCenterColor(brush: Long, colors: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPathGradientCenterColor", longArrayOf(brush, colors)).toInt()
}

public fun GdipGetPathGradientCenterPoint(brush: Long, points: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPathGradientCenterPoint", longArrayOf(brush, points)).toInt()
}

public fun GdipGetPathGradientCenterPointI(brush: Long, points: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPathGradientCenterPointI", longArrayOf(brush, points)).toInt()
}

public fun GdipGetPathGradientFocusScales(brush: Long, xscale: Long, yscale: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPathGradientFocusScales", longArrayOf(brush, xscale, yscale)).toInt()
}

public fun GdipGetPathGradientGammaCorrection(brush: Long, usegammacorrection: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPathGradientGammaCorrection", longArrayOf(brush, usegammacorrection)).toInt()
}

public fun GdipGetPathGradientPath(brush: Long, path: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPathGradientPath", longArrayOf(brush, path)).toInt()
}

public fun GdipGetPathGradientPointCount(brush: Long, count: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPathGradientPointCount", longArrayOf(brush, count)).toInt()
}

public fun GdipGetPathGradientPresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPathGradientPresetBlend", longArrayOf(brush, blend, positions, count.toLong())).toInt()
}

public fun GdipGetPathGradientPresetBlendCount(brush: Long, count: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPathGradientPresetBlendCount", longArrayOf(brush, count)).toInt()
}

public fun GdipGetPathGradientRect(brush: Long, rect: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPathGradientRect", longArrayOf(brush, rect)).toInt()
}

public fun GdipGetPathGradientRectI(brush: Long, rect: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPathGradientRectI", longArrayOf(brush, rect)).toInt()
}

public fun GdipGetPathGradientSurroundColorCount(brush: Long, count: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPathGradientSurroundColorCount", longArrayOf(brush, count)).toInt()
}

public fun GdipGetPathGradientSurroundColorsWithCount(brush: Long, color: Long, count: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPathGradientSurroundColorsWithCount", longArrayOf(brush, color, count)).toInt()
}

public fun GdipGetPathGradientTransform(brush: Long, matrix: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPathGradientTransform", longArrayOf(brush, matrix)).toInt()
}

public fun GdipGetPathGradientWrapMode(brush: Long, wrapmode: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPathGradientWrapMode", longArrayOf(brush, wrapmode)).toInt()
}

public fun GdipGetPathLastPoint(path: Long, lastpoint: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPathLastPoint", longArrayOf(path, lastpoint)).toInt()
}

public fun GdipGetPathPoints(param0: Long, points: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPathPoints", longArrayOf(param0, points, count.toLong())).toInt()
}

public fun GdipGetPathPointsI(param0: Long, points: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPathPointsI", longArrayOf(param0, points, count.toLong())).toInt()
}

public fun GdipGetPathTypes(path: Long, types: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPathTypes", longArrayOf(path, types, count.toLong())).toInt()
}

public fun GdipGetPathWorldBounds(path: Long, bounds: Long, matrix: Long, pen: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPathWorldBounds", longArrayOf(path, bounds, matrix, pen)).toInt()
}

public fun GdipGetPathWorldBoundsI(path: Long, bounds: Long, matrix: Long, pen: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPathWorldBoundsI", longArrayOf(path, bounds, matrix, pen)).toInt()
}

public fun GdipGetPenBrushFill(pen: Long, brush: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPenBrushFill", longArrayOf(pen, brush)).toInt()
}

public fun GdipGetPenColor(pen: Long, argb: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPenColor", longArrayOf(pen, argb)).toInt()
}

public fun GdipGetPenCompoundArray(pen: Long, dash: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPenCompoundArray", longArrayOf(pen, dash, count.toLong())).toInt()
}

public fun GdipGetPenCompoundCount(pen: Long, count: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPenCompoundCount", longArrayOf(pen, count)).toInt()
}

public fun GdipGetPenCustomEndCap(pen: Long, customcap: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPenCustomEndCap", longArrayOf(pen, customcap)).toInt()
}

public fun GdipGetPenCustomStartCap(pen: Long, customcap: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPenCustomStartCap", longArrayOf(pen, customcap)).toInt()
}

public fun GdipGetPenDashArray(pen: Long, dash: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPenDashArray", longArrayOf(pen, dash, count.toLong())).toInt()
}

public fun GdipGetPenDashCap197819(pen: Long, dashcap: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPenDashCap197819", longArrayOf(pen, dashcap)).toInt()
}

public fun GdipGetPenDashCount(pen: Long, count: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPenDashCount", longArrayOf(pen, count)).toInt()
}

public fun GdipGetPenDashOffset(pen: Long, offset: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPenDashOffset", longArrayOf(pen, offset)).toInt()
}

public fun GdipGetPenDashStyle(pen: Long, dashstyle: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPenDashStyle", longArrayOf(pen, dashstyle)).toInt()
}

public fun GdipGetPenEndCap(pen: Long, endcap: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPenEndCap", longArrayOf(pen, endcap)).toInt()
}

public fun GdipGetPenFillType(pen: Long, type: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPenFillType", longArrayOf(pen, type)).toInt()
}

public fun GdipGetPenLineJoin(pen: Long, linejoin: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPenLineJoin", longArrayOf(pen, linejoin)).toInt()
}

public fun GdipGetPenMiterLimit(pen: Long, miterlimit: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPenMiterLimit", longArrayOf(pen, miterlimit)).toInt()
}

public fun GdipGetPenMode(pen: Long, penmode: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPenMode", longArrayOf(pen, penmode)).toInt()
}

public fun GdipGetPenStartCap(pen: Long, startcap: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPenStartCap", longArrayOf(pen, startcap)).toInt()
}

public fun GdipGetPenTransform(pen: Long, matrix: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPenTransform", longArrayOf(pen, matrix)).toInt()
}

public fun GdipGetPenUnit(pen: Long, unit: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPenUnit", longArrayOf(pen, unit)).toInt()
}

public fun GdipGetPenWidth(pen: Long, width: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPenWidth", longArrayOf(pen, width)).toInt()
}

public fun GdipGetPixelOffsetMode(graphics: Long, pixeloffsetmode: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPixelOffsetMode", longArrayOf(graphics, pixeloffsetmode)).toInt()
}

public fun GdipGetPointCount(path: Long, count: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPointCount", longArrayOf(path, count)).toInt()
}

public fun GdipGetPropertyCount(image: Long, numofproperty: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPropertyCount", longArrayOf(image, numofproperty)).toInt()
}

public fun GdipGetPropertyIdList(image: Long, numofproperty: UInt, list: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPropertyIdList", longArrayOf(image, numofproperty.toLong(), list)).toInt()
}

public fun GdipGetPropertyItem(image: Long, propid: UInt, propsize: UInt, buffer: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPropertyItem", longArrayOf(image, propid.toLong(), propsize.toLong(), buffer)).toInt()
}

public fun GdipGetPropertyItemSize(image: Long, propid: UInt, size: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPropertyItemSize", longArrayOf(image, propid.toLong(), size)).toInt()
}

public fun GdipGetPropertySize(image: Long, totalbuffersize: Long, numproperties: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetPropertySize", longArrayOf(image, totalbuffersize, numproperties)).toInt()
}

public fun GdipGetRegionBounds(region: Long, graphics: Long, rect: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetRegionBounds", longArrayOf(region, graphics, rect)).toInt()
}

public fun GdipGetRegionBoundsI(region: Long, graphics: Long, rect: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetRegionBoundsI", longArrayOf(region, graphics, rect)).toInt()
}

public fun GdipGetRegionData(region: Long, buffer: Long, buffersize: UInt, sizefilled: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetRegionData", longArrayOf(region, buffer, buffersize.toLong(), sizefilled)).toInt()
}

public fun GdipGetRegionDataSize(region: Long, buffersize: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetRegionDataSize", longArrayOf(region, buffersize)).toInt()
}

public fun GdipGetRegionHRgn(region: Long, graphics: Long, hrgn: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetRegionHRgn", longArrayOf(region, graphics, hrgn)).toInt()
}

public fun GdipGetRegionScans(region: Long, rects: Long, count: Long, matrix: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetRegionScans", longArrayOf(region, rects, count, matrix)).toInt()
}

public fun GdipGetRegionScansCount(region: Long, count: Long, matrix: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetRegionScansCount", longArrayOf(region, count, matrix)).toInt()
}

public fun GdipGetRegionScansI(region: Long, rects: Long, count: Long, matrix: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetRegionScansI", longArrayOf(region, rects, count, matrix)).toInt()
}

public fun GdipGetRenderingOrigin(graphics: Long, x: Long, y: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetRenderingOrigin", longArrayOf(graphics, x, y)).toInt()
}

public fun GdipGetSmoothingMode(graphics: Long, smoothingmode: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetSmoothingMode", longArrayOf(graphics, smoothingmode)).toInt()
}

public fun GdipGetSolidFillColor(brush: Long, color: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetSolidFillColor", longArrayOf(brush, color)).toInt()
}

public fun GdipGetStringFormatAlign(format: Long, align: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetStringFormatAlign", longArrayOf(format, align)).toInt()
}

public fun GdipGetStringFormatDigitSubstitution(format: Long, language: Long, substitute: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetStringFormatDigitSubstitution", longArrayOf(format, language, substitute)).toInt()
}

public fun GdipGetStringFormatFlags(format: Long, flags: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetStringFormatFlags", longArrayOf(format, flags)).toInt()
}

public fun GdipGetStringFormatHotkeyPrefix(format: Long, hotkeyprefix: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetStringFormatHotkeyPrefix", longArrayOf(format, hotkeyprefix)).toInt()
}

public fun GdipGetStringFormatLineAlign(format: Long, align: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetStringFormatLineAlign", longArrayOf(format, align)).toInt()
}

public fun GdipGetStringFormatMeasurableCharacterRangeCount(format: Long, count: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetStringFormatMeasurableCharacterRangeCount", longArrayOf(format, count)).toInt()
}

public fun GdipGetStringFormatTabStopCount(format: Long, count: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetStringFormatTabStopCount", longArrayOf(format, count)).toInt()
}

public fun GdipGetStringFormatTabStops(format: Long, count: Int, firsttaboffset: Long, tabstops: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetStringFormatTabStops", longArrayOf(format, count.toLong(), firsttaboffset, tabstops)).toInt()
}

public fun GdipGetStringFormatTrimming(format: Long, trimming: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetStringFormatTrimming", longArrayOf(format, trimming)).toInt()
}

public fun GdipGetTextContrast(graphics: Long, contrast: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetTextContrast", longArrayOf(graphics, contrast)).toInt()
}

public fun GdipGetTextRenderingHint(graphics: Long, mode: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetTextRenderingHint", longArrayOf(graphics, mode)).toInt()
}

public fun GdipGetTextureImage(brush: Long, image: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetTextureImage", longArrayOf(brush, image)).toInt()
}

public fun GdipGetTextureTransform(brush: Long, matrix: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetTextureTransform", longArrayOf(brush, matrix)).toInt()
}

public fun GdipGetTextureWrapMode(brush: Long, wrapmode: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetTextureWrapMode", longArrayOf(brush, wrapmode)).toInt()
}

public fun GdipGetVisibleClipBounds(graphics: Long, rect: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetVisibleClipBounds", longArrayOf(graphics, rect)).toInt()
}

public fun GdipGetVisibleClipBoundsI(graphics: Long, rect: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetVisibleClipBoundsI", longArrayOf(graphics, rect)).toInt()
}

public fun GdipGetWorldTransform(graphics: Long, matrix: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGetWorldTransform", longArrayOf(graphics, matrix)).toInt()
}

public fun GdipGraphicsClear(graphics: Long, color: UInt): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGraphicsClear", longArrayOf(graphics, color.toLong())).toInt()
}

public fun GdipGraphicsSetAbort(pgraphics: Long, piabort: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipGraphicsSetAbort", longArrayOf(pgraphics, piabort)).toInt()
}

public fun GdipImageForceValidation(image: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipImageForceValidation", longArrayOf(image)).toInt()
}

public fun GdipImageGetFrameCount(image: Long, dimensionid: Long, count: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipImageGetFrameCount", longArrayOf(image, dimensionid, count)).toInt()
}

public fun GdipImageGetFrameDimensionsCount(image: Long, count: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipImageGetFrameDimensionsCount", longArrayOf(image, count)).toInt()
}

public fun GdipImageGetFrameDimensionsList(image: Long, dimensionids: Long, count: UInt): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipImageGetFrameDimensionsList", longArrayOf(image, dimensionids, count.toLong())).toInt()
}

public fun GdipImageRotateFlip(image: Long, rftype: RotateFlipType): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipImageRotateFlip", longArrayOf(image, rftype.toLong())).toInt()
}

public fun GdipImageSelectActiveFrame(image: Long, dimensionid: Long, frameindex: UInt): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipImageSelectActiveFrame", longArrayOf(image, dimensionid, frameindex.toLong())).toInt()
}

public fun GdipImageSetAbort(pimage: Long, piabort: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipImageSetAbort", longArrayOf(pimage, piabort)).toInt()
}

public fun GdipInitializePalette(palette: Long, palettetype: PaletteType, optimalcolors: Int, usetransparentcolor: BOOL, bitmap: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipInitializePalette", longArrayOf(palette, palettetype.toLong(), optimalcolors.toLong(), usetransparentcolor.toLong(), bitmap)).toInt()
}

public fun GdipInvertMatrix(matrix: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipInvertMatrix", longArrayOf(matrix)).toInt()
}

public fun GdipIsClipEmpty(graphics: Long, result: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipIsClipEmpty", longArrayOf(graphics, result)).toInt()
}

public fun GdipIsEmptyRegion(region: Long, graphics: Long, result: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipIsEmptyRegion", longArrayOf(region, graphics, result)).toInt()
}

public fun GdipIsEqualRegion(region: Long, region2: Long, graphics: Long, result: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipIsEqualRegion", longArrayOf(region, region2, graphics, result)).toInt()
}

public fun GdipIsInfiniteRegion(region: Long, graphics: Long, result: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipIsInfiniteRegion", longArrayOf(region, graphics, result)).toInt()
}

public fun GdipIsMatrixEqual(matrix: Long, matrix2: Long, result: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipIsMatrixEqual", longArrayOf(matrix, matrix2, result)).toInt()
}

public fun GdipIsMatrixIdentity(matrix: Long, result: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipIsMatrixIdentity", longArrayOf(matrix, result)).toInt()
}

public fun GdipIsMatrixInvertible(matrix: Long, result: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipIsMatrixInvertible", longArrayOf(matrix, result)).toInt()
}

public fun GdipIsOutlineVisiblePathPoint(path: Long, x: Float, y: Float, pen: Long, graphics: Long, result: Long): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipIsOutlineVisiblePathPoint", 20, false, longArrayOf(path, (x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL), pen, graphics, result)).toLong().toInt()
}

public fun GdipIsOutlineVisiblePathPointI(path: Long, x: Int, y: Int, pen: Long, graphics: Long, result: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipIsOutlineVisiblePathPointI", longArrayOf(path, x.toLong(), y.toLong(), pen, graphics, result)).toInt()
}

public fun GdipIsStyleAvailable(family: Long, style: Int, isstyleavailable: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipIsStyleAvailable", longArrayOf(family, style.toLong(), isstyleavailable)).toInt()
}

public fun GdipIsVisibleClipEmpty(graphics: Long, result: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipIsVisibleClipEmpty", longArrayOf(graphics, result)).toInt()
}

public fun GdipIsVisiblePathPoint(path: Long, x: Float, y: Float, graphics: Long, result: Long): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipIsVisiblePathPoint", 20, false, longArrayOf(path, (x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL), graphics, result)).toLong().toInt()
}

public fun GdipIsVisiblePathPointI(path: Long, x: Int, y: Int, graphics: Long, result: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipIsVisiblePathPointI", longArrayOf(path, x.toLong(), y.toLong(), graphics, result)).toInt()
}

public fun GdipIsVisiblePoint(graphics: Long, x: Float, y: Float, result: Long): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipIsVisiblePoint", 20, false, longArrayOf(graphics, (x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL), result)).toLong().toInt()
}

public fun GdipIsVisiblePointI(graphics: Long, x: Int, y: Int, result: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipIsVisiblePointI", longArrayOf(graphics, x.toLong(), y.toLong(), result)).toInt()
}

public fun GdipIsVisibleRect(graphics: Long, x: Float, y: Float, width: Float, height: Float, result: Long): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipIsVisibleRect", 340, false, longArrayOf(graphics, (x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL), (width.toRawBits().toLong() and 0xFFFF_FFFFL), (height.toRawBits().toLong() and 0xFFFF_FFFFL), result)).toLong().toInt()
}

public fun GdipIsVisibleRectI(graphics: Long, x: Int, y: Int, width: Int, height: Int, result: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipIsVisibleRectI", longArrayOf(graphics, x.toLong(), y.toLong(), width.toLong(), height.toLong(), result)).toInt()
}

public fun GdipIsVisibleRegionPoint(region: Long, x: Float, y: Float, graphics: Long, result: Long): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipIsVisibleRegionPoint", 20, false, longArrayOf(region, (x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL), graphics, result)).toLong().toInt()
}

public fun GdipIsVisibleRegionPointI(region: Long, x: Int, y: Int, graphics: Long, result: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipIsVisibleRegionPointI", longArrayOf(region, x.toLong(), y.toLong(), graphics, result)).toInt()
}

public fun GdipIsVisibleRegionRect(region: Long, x: Float, y: Float, width: Float, height: Float, graphics: Long, result: Long): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipIsVisibleRegionRect", 340, false, longArrayOf(region, (x.toRawBits().toLong() and 0xFFFF_FFFFL), (y.toRawBits().toLong() and 0xFFFF_FFFFL), (width.toRawBits().toLong() and 0xFFFF_FFFFL), (height.toRawBits().toLong() and 0xFFFF_FFFFL), graphics, result)).toLong().toInt()
}

public fun GdipIsVisibleRegionRectI(region: Long, x: Int, y: Int, width: Int, height: Int, graphics: Long, result: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipIsVisibleRegionRectI", longArrayOf(region, x.toLong(), y.toLong(), width.toLong(), height.toLong(), graphics, result)).toInt()
}

public fun GdipLoadImageFromFile(filename: PCWSTR, image: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipLoadImageFromFile", longArrayOf(filename, image)).toInt()
}

public fun GdipLoadImageFromFileICM(filename: PCWSTR, image: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipLoadImageFromFileICM", longArrayOf(filename, image)).toInt()
}

public fun GdipLoadImageFromStream(stream: Long, image: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipLoadImageFromStream", longArrayOf(stream, image)).toInt()
}

public fun GdipLoadImageFromStreamICM(stream: Long, image: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipLoadImageFromStreamICM", longArrayOf(stream, image)).toInt()
}

public fun GdipMeasureCharacterRanges(graphics: Long, string: PCWSTR, length: Int, font: Long, layoutrect: Long, stringformat: Long, regioncount: Int, regions: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipMeasureCharacterRanges", longArrayOf(graphics, string, length.toLong(), font, layoutrect, stringformat, regioncount.toLong(), regions)).toInt()
}

public fun GdipMeasureDriverString(graphics: Long, text: Long, length: Int, font: Long, positions: Long, flags: Int, matrix: Long, boundingbox: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipMeasureDriverString", longArrayOf(graphics, text, length.toLong(), font, positions, flags.toLong(), matrix, boundingbox)).toInt()
}

public fun GdipMeasureString(graphics: Long, string: PCWSTR, length: Int, font: Long, layoutrect: Long, stringformat: Long, boundingbox: Long, codepointsfitted: Long, linesfilled: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipMeasureString", longArrayOf(graphics, string, length.toLong(), font, layoutrect, stringformat, boundingbox, codepointsfitted, linesfilled)).toInt()
}

public fun GdipMultiplyLineTransform(brush: Long, matrix: Long, order: MatrixOrder): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipMultiplyLineTransform", longArrayOf(brush, matrix, order.toLong())).toInt()
}

public fun GdipMultiplyMatrix(matrix: Long, matrix2: Long, order: MatrixOrder): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipMultiplyMatrix", longArrayOf(matrix, matrix2, order.toLong())).toInt()
}

public fun GdipMultiplyPathGradientTransform(brush: Long, matrix: Long, order: MatrixOrder): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipMultiplyPathGradientTransform", longArrayOf(brush, matrix, order.toLong())).toInt()
}

public fun GdipMultiplyPenTransform(pen: Long, matrix: Long, order: MatrixOrder): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipMultiplyPenTransform", longArrayOf(pen, matrix, order.toLong())).toInt()
}

public fun GdipMultiplyTextureTransform(brush: Long, matrix: Long, order: MatrixOrder): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipMultiplyTextureTransform", longArrayOf(brush, matrix, order.toLong())).toInt()
}

public fun GdipMultiplyWorldTransform(graphics: Long, matrix: Long, order: MatrixOrder): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipMultiplyWorldTransform", longArrayOf(graphics, matrix, order.toLong())).toInt()
}

public fun GdipNewInstalledFontCollection(fontcollection: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipNewInstalledFontCollection", longArrayOf(fontcollection)).toInt()
}

public fun GdipNewPrivateFontCollection(fontcollection: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipNewPrivateFontCollection", longArrayOf(fontcollection)).toInt()
}

public fun GdipPathIterCopyData(iterator: Long, resultcount: Long, points: Long, types: Long, startindex: Int, endindex: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipPathIterCopyData", longArrayOf(iterator, resultcount, points, types, startindex.toLong(), endindex.toLong())).toInt()
}

public fun GdipPathIterEnumerate(iterator: Long, resultcount: Long, points: Long, types: Long, count: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipPathIterEnumerate", longArrayOf(iterator, resultcount, points, types, count.toLong())).toInt()
}

public fun GdipPathIterGetCount(iterator: Long, count: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipPathIterGetCount", longArrayOf(iterator, count)).toInt()
}

public fun GdipPathIterGetSubpathCount(iterator: Long, count: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipPathIterGetSubpathCount", longArrayOf(iterator, count)).toInt()
}

public fun GdipPathIterHasCurve(iterator: Long, hascurve: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipPathIterHasCurve", longArrayOf(iterator, hascurve)).toInt()
}

public fun GdipPathIterIsValid(iterator: Long, valid: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipPathIterIsValid", longArrayOf(iterator, valid)).toInt()
}

public fun GdipPathIterNextMarker(iterator: Long, resultcount: Long, startindex: Long, endindex: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipPathIterNextMarker", longArrayOf(iterator, resultcount, startindex, endindex)).toInt()
}

public fun GdipPathIterNextMarkerPath(iterator: Long, resultcount: Long, path: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipPathIterNextMarkerPath", longArrayOf(iterator, resultcount, path)).toInt()
}

public fun GdipPathIterNextPathType(iterator: Long, resultcount: Long, pathtype: Long, startindex: Long, endindex: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipPathIterNextPathType", longArrayOf(iterator, resultcount, pathtype, startindex, endindex)).toInt()
}

public fun GdipPathIterNextSubpath(iterator: Long, resultcount: Long, startindex: Long, endindex: Long, isclosed: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipPathIterNextSubpath", longArrayOf(iterator, resultcount, startindex, endindex, isclosed)).toInt()
}

public fun GdipPathIterNextSubpathPath(iterator: Long, resultcount: Long, path: Long, isclosed: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipPathIterNextSubpathPath", longArrayOf(iterator, resultcount, path, isclosed)).toInt()
}

public fun GdipPathIterRewind(iterator: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipPathIterRewind", longArrayOf(iterator)).toInt()
}

public fun GdipPlayMetafileRecord(metafile: Long, recordtype: EmfPlusRecordType, flags: UInt, datasize: UInt, data: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipPlayMetafileRecord", longArrayOf(metafile, recordtype.toLong(), flags.toLong(), datasize.toLong(), data)).toInt()
}

public fun GdipPrivateAddFontFile(fontcollection: Long, filename: PCWSTR): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipPrivateAddFontFile", longArrayOf(fontcollection, filename)).toInt()
}

public fun GdipPrivateAddMemoryFont(fontcollection: Long, memory: Long, length: Int): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipPrivateAddMemoryFont", longArrayOf(fontcollection, memory, length.toLong())).toInt()
}

public fun GdipRecordMetafile(referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipRecordMetafile", longArrayOf(referencehdc, type.toLong(), framerect, frameunit.toLong(), description, metafile)).toInt()
}

public fun GdipRecordMetafileFileName(filename: PCWSTR, referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipRecordMetafileFileName", longArrayOf(filename, referencehdc, type.toLong(), framerect, frameunit.toLong(), description, metafile)).toInt()
}

public fun GdipRecordMetafileFileNameI(filename: PCWSTR, referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipRecordMetafileFileNameI", longArrayOf(filename, referencehdc, type.toLong(), framerect, frameunit.toLong(), description, metafile)).toInt()
}

public fun GdipRecordMetafileI(referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipRecordMetafileI", longArrayOf(referencehdc, type.toLong(), framerect, frameunit.toLong(), description, metafile)).toInt()
}

public fun GdipRecordMetafileStream(stream: Long, referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipRecordMetafileStream", longArrayOf(stream, referencehdc, type.toLong(), framerect, frameunit.toLong(), description, metafile)).toInt()
}

public fun GdipRecordMetafileStreamI(stream: Long, referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipRecordMetafileStreamI", longArrayOf(stream, referencehdc, type.toLong(), framerect, frameunit.toLong(), description, metafile)).toInt()
}

public fun GdipReleaseDC(graphics: Long, hdc: HDC): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipReleaseDC", longArrayOf(graphics, hdc)).toInt()
}

public fun GdipRemovePropertyItem(image: Long, propid: UInt): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipRemovePropertyItem", longArrayOf(image, propid.toLong())).toInt()
}

public fun GdipResetClip(graphics: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipResetClip", longArrayOf(graphics)).toInt()
}

public fun GdipResetImageAttributes(imageattr: Long, type: ColorAdjustType): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipResetImageAttributes", longArrayOf(imageattr, type.toLong())).toInt()
}

public fun GdipResetLineTransform(brush: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipResetLineTransform", longArrayOf(brush)).toInt()
}

public fun GdipResetPageTransform(graphics: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipResetPageTransform", longArrayOf(graphics)).toInt()
}

public fun GdipResetPath(path: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipResetPath", longArrayOf(path)).toInt()
}

public fun GdipResetPathGradientTransform(brush: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipResetPathGradientTransform", longArrayOf(brush)).toInt()
}

public fun GdipResetPenTransform(pen: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipResetPenTransform", longArrayOf(pen)).toInt()
}

public fun GdipResetTextureTransform(brush: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipResetTextureTransform", longArrayOf(brush)).toInt()
}

public fun GdipResetWorldTransform(graphics: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipResetWorldTransform", longArrayOf(graphics)).toInt()
}

public fun GdipRestoreGraphics(graphics: Long, state: UInt): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipRestoreGraphics", longArrayOf(graphics, state.toLong())).toInt()
}

public fun GdipReversePath(path: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipReversePath", longArrayOf(path)).toInt()
}

public fun GdipRotateLineTransform(brush: Long, angle: Float, order: MatrixOrder): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipRotateLineTransform", 4, false, longArrayOf(brush, (angle.toRawBits().toLong() and 0xFFFF_FFFFL), order.toLong())).toLong().toInt()
}

public fun GdipRotateMatrix(matrix: Long, angle: Float, order: MatrixOrder): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipRotateMatrix", 4, false, longArrayOf(matrix, (angle.toRawBits().toLong() and 0xFFFF_FFFFL), order.toLong())).toLong().toInt()
}

public fun GdipRotatePathGradientTransform(brush: Long, angle: Float, order: MatrixOrder): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipRotatePathGradientTransform", 4, false, longArrayOf(brush, (angle.toRawBits().toLong() and 0xFFFF_FFFFL), order.toLong())).toLong().toInt()
}

public fun GdipRotatePenTransform(pen: Long, angle: Float, order: MatrixOrder): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipRotatePenTransform", 4, false, longArrayOf(pen, (angle.toRawBits().toLong() and 0xFFFF_FFFFL), order.toLong())).toLong().toInt()
}

public fun GdipRotateTextureTransform(brush: Long, angle: Float, order: MatrixOrder): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipRotateTextureTransform", 4, false, longArrayOf(brush, (angle.toRawBits().toLong() and 0xFFFF_FFFFL), order.toLong())).toLong().toInt()
}

public fun GdipRotateWorldTransform(graphics: Long, angle: Float, order: MatrixOrder): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipRotateWorldTransform", 4, false, longArrayOf(graphics, (angle.toRawBits().toLong() and 0xFFFF_FFFFL), order.toLong())).toLong().toInt()
}

public fun GdipSaveAdd(image: Long, encoderparams: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSaveAdd", longArrayOf(image, encoderparams)).toInt()
}

public fun GdipSaveAddImage(image: Long, newimage: Long, encoderparams: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSaveAddImage", longArrayOf(image, newimage, encoderparams)).toInt()
}

public fun GdipSaveGraphics(graphics: Long, state: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSaveGraphics", longArrayOf(graphics, state)).toInt()
}

public fun GdipSaveImageToFile(image: Long, filename: PCWSTR, clsidencoder: Long, encoderparams: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSaveImageToFile", longArrayOf(image, filename, clsidencoder, encoderparams)).toInt()
}

public fun GdipSaveImageToStream(image: Long, stream: Long, clsidencoder: Long, encoderparams: Long): Status {
    return Win32DynamicFfi.invoke("gdiplus.dll", "GdipSaveImageToStream", longArrayOf(image, stream, clsidencoder, encoderparams)).toInt()
}

public fun GdipScaleLineTransform(brush: Long, sx: Float, sy: Float, order: MatrixOrder): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipScaleLineTransform", 20, false, longArrayOf(brush, (sx.toRawBits().toLong() and 0xFFFF_FFFFL), (sy.toRawBits().toLong() and 0xFFFF_FFFFL), order.toLong())).toLong().toInt()
}

public fun GdipScaleMatrix(matrix: Long, scalex: Float, scaley: Float, order: MatrixOrder): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipScaleMatrix", 20, false, longArrayOf(matrix, (scalex.toRawBits().toLong() and 0xFFFF_FFFFL), (scaley.toRawBits().toLong() and 0xFFFF_FFFFL), order.toLong())).toLong().toInt()
}

public fun GdipScalePathGradientTransform(brush: Long, sx: Float, sy: Float, order: MatrixOrder): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipScalePathGradientTransform", 20, false, longArrayOf(brush, (sx.toRawBits().toLong() and 0xFFFF_FFFFL), (sy.toRawBits().toLong() and 0xFFFF_FFFFL), order.toLong())).toLong().toInt()
}

public fun GdipScalePenTransform(pen: Long, sx: Float, sy: Float, order: MatrixOrder): Status {
    return Win32DynamicFfi.invokeFp("gdiplus.dll", "GdipScalePenTransform", 20, false, longArrayOf(pen, (sx.toRawBits().toLong() and 0xFFFF_FFFFL), (sy.toRawBits().toLong() and 0xFFFF_FFFFL), order.toLong())).toLong().toInt()
}
