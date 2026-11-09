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

private object WindowsWin32GraphicsGdiplusJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAddPathArc(path: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAddPathArcI(path: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAddPathBezier(path: Long, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAddPathBezierI(path: Long, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAddPathBeziers(path: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAddPathBeziersI(path: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAddPathClosedCurve(path: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAddPathClosedCurve2(path: Long, points: Long, count: Int, tension: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAddPathClosedCurve2I(path: Long, points: Long, count: Int, tension: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAddPathClosedCurveI(path: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve(path: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve2(path: Long, points: Long, count: Int, tension: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve2I(path: Long, points: Long, count: Int, tension: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve3(path: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve3I(path: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurveI(path: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAddPathEllipse(path: Long, x: Float, y: Float, width: Float, height: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAddPathEllipseI(path: Long, x: Int, y: Int, width: Int, height: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAddPathLine(path: Long, x1: Float, y1: Float, x2: Float, y2: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAddPathLine2(path: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAddPathLine2I(path: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAddPathLineI(path: Long, x1: Int, y1: Int, x2: Int, y2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAddPathPath(path: Long, addingpath: Long, connect: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAddPathPie(path: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAddPathPieI(path: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAddPathPolygon(path: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAddPathPolygonI(path: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAddPathRectangle(path: Long, x: Float, y: Float, width: Float, height: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAddPathRectangleI(path: Long, x: Int, y: Int, width: Int, height: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAddPathRectangles(path: Long, rects: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAddPathRectanglesI(path: Long, rects: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAddPathString(path: Long, string: Long, length: Int, family: Long, style: Int, emsize: Float, layoutrect: Long, format: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAddPathStringI(path: Long, string: Long, length: Int, family: Long, style: Int, emsize: Float, layoutrect: Long, format: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipAlloc(size: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipBeginContainer(graphics: Long, dstrect: Long, srcrect: Long, unit: Int, state: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipBeginContainer2(graphics: Long, state: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipBeginContainerI(graphics: Long, dstrect: Long, srcrect: Long, unit: Int, state: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipBitmapApplyEffect(bitmap: Long, effect: Long, roi: Long, useauxdata: Int, auxdata: Long, auxdatasize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipBitmapConvertFormat(pinputbitmap: Long, format: Int, dithertype: Int, palettetype: Int, palette: Long, alphathresholdpercent: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipBitmapCreateApplyEffect(inputbitmaps: Long, numinputs: Int, effect: Long, roi: Long, outputrect: Long, outputbitmap: Long, useauxdata: Int, auxdata: Long, auxdatasize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipBitmapGetHistogram(bitmap: Long, format: Int, numberofentries: Int, channel0: Long, channel1: Long, channel2: Long, channel3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipBitmapGetHistogramSize(format: Int, numberofentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipBitmapGetPixel(bitmap: Long, x: Int, y: Int, color: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipBitmapLockBits(bitmap: Long, rect: Long, flags: Int, format: Int, lockedbitmapdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipBitmapSetPixel(bitmap: Long, x: Int, y: Int, color: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipBitmapSetResolution(bitmap: Long, xdpi: Float, ydpi: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipBitmapUnlockBits(bitmap: Long, lockedbitmapdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipClearPathMarkers(path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCloneBitmapArea(x: Float, y: Float, width: Float, height: Float, format: Int, srcbitmap: Long, dstbitmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCloneBitmapAreaI(x: Int, y: Int, width: Int, height: Int, format: Int, srcbitmap: Long, dstbitmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCloneBrush(brush: Long, clonebrush: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCloneCustomLineCap(customcap: Long, clonedcap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCloneFont(font: Long, clonefont: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCloneFontFamily(fontfamily: Long, clonedfontfamily: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCloneImage(image: Long, cloneimage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCloneImageAttributes(imageattr: Long, cloneimageattr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCloneMatrix(matrix: Long, clonematrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipClonePath(path: Long, clonepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipClonePen(pen: Long, clonepen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCloneRegion(region: Long, cloneregion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCloneStringFormat(format: Long, newformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipClosePathFigure(path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipClosePathFigures(path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCombineRegionPath(region: Long, path: Long, combinemode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCombineRegionRect(region: Long, rect: Long, combinemode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCombineRegionRectI(region: Long, rect: Long, combinemode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCombineRegionRegion(region: Long, region2: Long, combinemode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipComment(graphics: Long, sizedata: Int, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipConvertToEmfPlus(refgraphics: Long, metafile: Long, conversionfailureflag: Long, emftype: Int, description: Long, out_metafile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipConvertToEmfPlusToFile(refgraphics: Long, metafile: Long, conversionfailureflag: Long, filename: Long, emftype: Int, description: Long, out_metafile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipConvertToEmfPlusToStream(refgraphics: Long, metafile: Long, conversionfailureflag: Long, stream: Long, emftype: Int, description: Long, out_metafile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateAdjustableArrowCap(height: Float, width: Float, isfilled: Int, cap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromFile(filename: Long, bitmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromFileICM(filename: Long, bitmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromGdiDib(gdibitmapinfo: Long, gdibitmapdata: Long, bitmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromGraphics(width: Int, height: Int, target: Long, bitmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromHBITMAP(hbm: Long, hpal: Long, bitmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromHICON(hicon: Long, bitmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromResource(hinstance: Long, lpbitmapname: Long, bitmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromScan0(width: Int, height: Int, stride: Int, format: Int, scan0: Long, bitmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromStream(stream: Long, bitmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromStreamICM(stream: Long, bitmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateCachedBitmap(bitmap: Long, graphics: Long, cachedbitmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateCustomLineCap(fillpath: Long, strokepath: Long, basecap: Int, baseinset: Float, customcap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateFont(fontfamily: Long, emsize: Float, style: Int, unit: Int, font: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateFontFamilyFromName(name: Long, fontcollection: Long, fontfamily: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateFontFromDC(hdc: Long, font: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateFontFromLogfontA(hdc: Long, logfont: Long, font: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateFontFromLogfontW(hdc: Long, logfont: Long, font: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateFromHDC(hdc: Long, graphics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateFromHDC2(hdc: Long, hdevice: Long, graphics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateFromHWND(hwnd: Long, graphics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateFromHWNDICM(hwnd: Long, graphics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateHBITMAPFromBitmap(bitmap: Long, hbmreturn: Long, background: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateHICONFromBitmap(bitmap: Long, hbmreturn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateHalftonePalette(): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateHatchBrush(hatchstyle: Int, forecol: Int, backcol: Int, brush: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateImageAttributes(imageattr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrush(point1: Long, point2: Long, color1: Int, color2: Int, wrapmode: Int, linegradient: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushFromRect(rect: Long, color1: Int, color2: Int, mode: Int, wrapmode: Int, linegradient: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushFromRectI(rect: Long, color1: Int, color2: Int, mode: Int, wrapmode: Int, linegradient: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushFromRectWithAngle(rect: Long, color1: Int, color2: Int, angle: Float, isanglescalable: Int, wrapmode: Int, linegradient: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushFromRectWithAngleI(rect: Long, color1: Int, color2: Int, angle: Float, isanglescalable: Int, wrapmode: Int, linegradient: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushI(point1: Long, point2: Long, color1: Int, color2: Int, wrapmode: Int, linegradient: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateMatrix(matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateMatrix2(m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateMatrix3(rect: Long, dstplg: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateMatrix3I(rect: Long, dstplg: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromEmf(hemf: Long, deleteemf: Int, metafile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromFile(file: Long, metafile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromStream(stream: Long, metafile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromWmf(hwmf: Long, deletewmf: Int, wmfplaceablefileheader: Long, metafile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromWmfFile(file: Long, wmfplaceablefileheader: Long, metafile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreatePath(brushmode: Int, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreatePath2(param0: Long, param1: Long, param2: Int, param3: Int, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreatePath2I(param0: Long, param1: Long, param2: Int, param3: Int, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreatePathGradient(points: Long, count: Int, wrapmode: Int, polygradient: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreatePathGradientFromPath(path: Long, polygradient: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreatePathGradientI(points: Long, count: Int, wrapmode: Int, polygradient: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreatePathIter(iterator: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreatePen1(color: Int, width: Float, unit: Int, pen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreatePen2(brush: Long, width: Float, unit: Int, pen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateRegion(region: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionHrgn(hrgn: Long, region: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionPath(path: Long, region: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionRect(rect: Long, region: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionRectI(rect: Long, region: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionRgnData(regiondata: Long, size: Int, region: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateSolidFill(color: Int, brush: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateStreamOnFile(filename: Long, access: Int, stream: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateStringFormat(formatattributes: Int, language: Short, format: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateTexture(image: Long, wrapmode: Int, texture: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateTexture2(image: Long, wrapmode: Int, x: Float, y: Float, width: Float, height: Float, texture: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateTexture2I(image: Long, wrapmode: Int, x: Int, y: Int, width: Int, height: Int, texture: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateTextureIA(image: Long, imageattributes: Long, x: Float, y: Float, width: Float, height: Float, texture: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipCreateTextureIAI(image: Long, imageattributes: Long, x: Int, y: Int, width: Int, height: Int, texture: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDeleteBrush(brush: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDeleteCachedBitmap(cachedbitmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDeleteCustomLineCap(customcap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDeleteEffect(effect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDeleteFont(font: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDeleteFontFamily(fontfamily: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDeleteGraphics(graphics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDeleteMatrix(matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDeletePath(path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDeletePathIter(iterator: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDeletePen(pen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDeletePrivateFontCollection(fontcollection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDeleteRegion(region: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDeleteStringFormat(format: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDisposeImage(image: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDisposeImageAttributes(imageattr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawArc(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawArcI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawBezier(graphics: Long, pen: Long, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawBezierI(graphics: Long, pen: Long, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawBeziers(graphics: Long, pen: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawBeziersI(graphics: Long, pen: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawCachedBitmap(graphics: Long, cachedbitmap: Long, x: Int, y: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawClosedCurve(graphics: Long, pen: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawClosedCurve2(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawClosedCurve2I(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawClosedCurveI(graphics: Long, pen: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve(graphics: Long, pen: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve2(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve2I(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve3(graphics: Long, pen: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve3I(graphics: Long, pen: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawCurveI(graphics: Long, pen: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawDriverString(graphics: Long, text: Long, length: Int, font: Long, brush: Long, positions: Long, flags: Int, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawEllipse(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawEllipseI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawImage(graphics: Long, image: Long, x: Float, y: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawImageFX(graphics: Long, image: Long, source: Long, xform: Long, effect: Long, imageattributes: Long, srcunit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawImageI(graphics: Long, image: Long, x: Int, y: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointRect(graphics: Long, image: Long, x: Float, y: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointRectI(graphics: Long, image: Long, x: Int, y: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePoints(graphics: Long, image: Long, dstpoints: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointsI(graphics: Long, image: Long, dstpoints: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointsRect(graphics: Long, image: Long, points: Long, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Int, imageattributes: Long, callback: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointsRectI(graphics: Long, image: Long, points: Long, count: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Int, imageattributes: Long, callback: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawImageRect(graphics: Long, image: Long, x: Float, y: Float, width: Float, height: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawImageRectI(graphics: Long, image: Long, x: Int, y: Int, width: Int, height: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawImageRectRect(graphics: Long, image: Long, dstx: Float, dsty: Float, dstwidth: Float, dstheight: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Int, imageattributes: Long, callback: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawImageRectRectI(graphics: Long, image: Long, dstx: Int, dsty: Int, dstwidth: Int, dstheight: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Int, imageattributes: Long, callback: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawLine(graphics: Long, pen: Long, x1: Float, y1: Float, x2: Float, y2: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawLineI(graphics: Long, pen: Long, x1: Int, y1: Int, x2: Int, y2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawLines(graphics: Long, pen: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawLinesI(graphics: Long, pen: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawPath(graphics: Long, pen: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawPie(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawPieI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawPolygon(graphics: Long, pen: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawPolygonI(graphics: Long, pen: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawRectangle(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawRectangleI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawRectangles(graphics: Long, pen: Long, rects: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawRectanglesI(graphics: Long, pen: Long, rects: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipDrawString(graphics: Long, string: Long, length: Int, font: Long, layoutrect: Long, stringformat: Long, brush: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipEmfToWmfBits(hemf: Long, cbdata16: Int, pdata16: Long, imapmode: Int, eflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipEndContainer(graphics: Long, state: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestPoint(graphics: Long, metafile: Long, destpoint: Long, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestPointI(graphics: Long, metafile: Long, destpoint: Long, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestPoints(graphics: Long, metafile: Long, destpoints: Long, count: Int, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestPointsI(graphics: Long, metafile: Long, destpoints: Long, count: Int, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestRect(graphics: Long, metafile: Long, destrect: Long, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestRectI(graphics: Long, metafile: Long, destrect: Long, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestPoint(graphics: Long, metafile: Long, destpoint: Long, srcrect: Long, srcunit: Int, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestPointI(graphics: Long, metafile: Long, destpoint: Long, srcrect: Long, srcunit: Int, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestPoints(graphics: Long, metafile: Long, destpoints: Long, count: Int, srcrect: Long, srcunit: Int, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestPointsI(graphics: Long, metafile: Long, destpoints: Long, count: Int, srcrect: Long, srcunit: Int, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestRect(graphics: Long, metafile: Long, destrect: Long, srcrect: Long, srcunit: Int, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestRectI(graphics: Long, metafile: Long, destrect: Long, srcrect: Long, srcunit: Int, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipFillClosedCurve(graphics: Long, brush: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipFillClosedCurve2(graphics: Long, brush: Long, points: Long, count: Int, tension: Float, fillmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipFillClosedCurve2I(graphics: Long, brush: Long, points: Long, count: Int, tension: Float, fillmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipFillClosedCurveI(graphics: Long, brush: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipFillEllipse(graphics: Long, brush: Long, x: Float, y: Float, width: Float, height: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipFillEllipseI(graphics: Long, brush: Long, x: Int, y: Int, width: Int, height: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipFillPath(graphics: Long, brush: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipFillPie(graphics: Long, brush: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipFillPieI(graphics: Long, brush: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipFillPolygon(graphics: Long, brush: Long, points: Long, count: Int, fillmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipFillPolygon2(graphics: Long, brush: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipFillPolygon2I(graphics: Long, brush: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipFillPolygonI(graphics: Long, brush: Long, points: Long, count: Int, fillmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipFillRectangle(graphics: Long, brush: Long, x: Float, y: Float, width: Float, height: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipFillRectangleI(graphics: Long, brush: Long, x: Int, y: Int, width: Int, height: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipFillRectangles(graphics: Long, brush: Long, rects: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipFillRectanglesI(graphics: Long, brush: Long, rects: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipFillRegion(graphics: Long, brush: Long, region: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipFindFirstImageItem(image: Long, item: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipFindNextImageItem(image: Long, item: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipFlattenPath(path: Long, matrix: Long, flatness: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipFlush(graphics: Long, intention: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipFree(ptr: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetAdjustableArrowCapFillState(cap: Long, fillstate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetAdjustableArrowCapHeight(cap: Long, height: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetAdjustableArrowCapMiddleInset(cap: Long, middleinset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetAdjustableArrowCapWidth(cap: Long, width: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetAllPropertyItems(image: Long, totalbuffersize: Int, numproperties: Int, allitems: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetBrushType(brush: Long, type: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetCellAscent(family: Long, style: Int, cellascent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetCellDescent(family: Long, style: Int, celldescent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetClip(graphics: Long, region: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetClipBounds(graphics: Long, rect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetClipBoundsI(graphics: Long, rect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetCompositingMode(graphics: Long, compositingmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetCompositingQuality(graphics: Long, compositingquality: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapBaseCap(customcap: Long, basecap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapBaseInset(customcap: Long, inset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapStrokeCaps(customcap: Long, startcap: Long, endcap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapStrokeJoin(customcap: Long, linejoin: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapType(customcap: Long, captype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapWidthScale(customcap: Long, widthscale: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetDC(graphics: Long, hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetDpiX(graphics: Long, dpi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetDpiY(graphics: Long, dpi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetEffectParameterSize(effect: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetEffectParameters(effect: Long, size: Long, params: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetEmHeight(family: Long, style: Int, emheight: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetEncoderParameterList(image: Long, clsidencoder: Long, size: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetEncoderParameterListSize(image: Long, clsidencoder: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetFamily(font: Long, family: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetFamilyName(family: Long, name: Long, language: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetFontCollectionFamilyCount(fontcollection: Long, numfound: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetFontCollectionFamilyList(fontcollection: Long, numsought: Int, gpfamilies: Long, numfound: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetFontHeight(font: Long, graphics: Long, height: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetFontHeightGivenDPI(font: Long, dpi: Float, height: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetFontSize(font: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetFontStyle(font: Long, style: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetFontUnit(font: Long, unit: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetGenericFontFamilyMonospace(nativefamily: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetGenericFontFamilySansSerif(nativefamily: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetGenericFontFamilySerif(nativefamily: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetHatchBackgroundColor(brush: Long, backcol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetHatchForegroundColor(brush: Long, forecol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetHatchStyle(brush: Long, hatchstyle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetHemfFromMetafile(metafile: Long, hemf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetImageAttributesAdjustedPalette(imageattr: Long, colorpalette: Long, coloradjusttype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetImageBounds(image: Long, srcrect: Long, srcunit: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetImageDecoders(numdecoders: Int, size: Int, decoders: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetImageDecodersSize(numdecoders: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetImageDimension(image: Long, width: Long, height: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetImageEncoders(numencoders: Int, size: Int, encoders: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetImageEncodersSize(numencoders: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetImageFlags(image: Long, flags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetImageGraphicsContext(image: Long, graphics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetImageHeight(image: Long, height: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetImageHorizontalResolution(image: Long, resolution: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetImageItemData(image: Long, item: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetImagePalette(image: Long, palette: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetImagePaletteSize(image: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetImagePixelFormat(image: Long, format: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetImageRawFormat(image: Long, format: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetImageThumbnail(image: Long, thumbwidth: Int, thumbheight: Int, thumbimage: Long, callback: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetImageType(image: Long, type: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetImageVerticalResolution(image: Long, resolution: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetImageWidth(image: Long, width: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetInterpolationMode(graphics: Long, interpolationmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetLineBlend(brush: Long, blend: Long, positions: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetLineBlendCount(brush: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetLineColors(brush: Long, colors: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetLineGammaCorrection(brush: Long, usegammacorrection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetLinePresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetLinePresetBlendCount(brush: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetLineRect(brush: Long, rect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetLineRectI(brush: Long, rect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetLineSpacing(family: Long, style: Int, linespacing: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetLineTransform(brush: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetLineWrapMode(brush: Long, wrapmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetLogFontA(font: Long, graphics: Long, logfonta: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetLogFontW(font: Long, graphics: Long, logfontw: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetMatrixElements(matrix: Long, matrixout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileDownLevelRasterizationLimit(metafile: Long, metafilerasterizationlimitdpi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromEmf(hemf: Long, header: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromFile(filename: Long, header: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromMetafile(metafile: Long, header: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromStream(stream: Long, header: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromWmf(hwmf: Long, wmfplaceablefileheader: Long, header: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetNearestColor(graphics: Long, argb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPageScale(graphics: Long, scale: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPageUnit(graphics: Long, unit: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPathData(path: Long, pathdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPathFillMode(path: Long, fillmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientBlend(brush: Long, blend: Long, positions: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientBlendCount(brush: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientCenterColor(brush: Long, colors: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientCenterPoint(brush: Long, points: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientCenterPointI(brush: Long, points: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientFocusScales(brush: Long, xscale: Long, yscale: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientGammaCorrection(brush: Long, usegammacorrection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientPath(brush: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientPointCount(brush: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientPresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientPresetBlendCount(brush: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientRect(brush: Long, rect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientRectI(brush: Long, rect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientSurroundColorCount(brush: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientSurroundColorsWithCount(brush: Long, color: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientTransform(brush: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientWrapMode(brush: Long, wrapmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPathLastPoint(path: Long, lastpoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPathPoints(param0: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPathPointsI(param0: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPathTypes(path: Long, types: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPathWorldBounds(path: Long, bounds: Long, matrix: Long, pen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPathWorldBoundsI(path: Long, bounds: Long, matrix: Long, pen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPenBrushFill(pen: Long, brush: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPenColor(pen: Long, argb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPenCompoundArray(pen: Long, dash: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPenCompoundCount(pen: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPenCustomEndCap(pen: Long, customcap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPenCustomStartCap(pen: Long, customcap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashArray(pen: Long, dash: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashCap197819(pen: Long, dashcap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashCount(pen: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashOffset(pen: Long, offset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashStyle(pen: Long, dashstyle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPenEndCap(pen: Long, endcap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPenFillType(pen: Long, type: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPenLineJoin(pen: Long, linejoin: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPenMiterLimit(pen: Long, miterlimit: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPenMode(pen: Long, penmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPenStartCap(pen: Long, startcap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPenTransform(pen: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPenUnit(pen: Long, unit: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPenWidth(pen: Long, width: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPixelOffsetMode(graphics: Long, pixeloffsetmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPointCount(path: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPropertyCount(image: Long, numofproperty: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPropertyIdList(image: Long, numofproperty: Int, list: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPropertyItem(image: Long, propid: Int, propsize: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPropertyItemSize(image: Long, propid: Int, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetPropertySize(image: Long, totalbuffersize: Long, numproperties: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetRegionBounds(region: Long, graphics: Long, rect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetRegionBoundsI(region: Long, graphics: Long, rect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetRegionData(region: Long, buffer: Long, buffersize: Int, sizefilled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetRegionDataSize(region: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetRegionHRgn(region: Long, graphics: Long, hrgn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetRegionScans(region: Long, rects: Long, count: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetRegionScansCount(region: Long, count: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetRegionScansI(region: Long, rects: Long, count: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetRenderingOrigin(graphics: Long, x: Long, y: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetSmoothingMode(graphics: Long, smoothingmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetSolidFillColor(brush: Long, color: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatAlign(format: Long, align: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatDigitSubstitution(format: Long, language: Long, substitute: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatFlags(format: Long, flags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatHotkeyPrefix(format: Long, hotkeyprefix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatLineAlign(format: Long, align: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatMeasurableCharacterRangeCount(format: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatTabStopCount(format: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatTabStops(format: Long, count: Int, firsttaboffset: Long, tabstops: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatTrimming(format: Long, trimming: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetTextContrast(graphics: Long, contrast: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetTextRenderingHint(graphics: Long, mode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetTextureImage(brush: Long, image: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetTextureTransform(brush: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetTextureWrapMode(brush: Long, wrapmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetVisibleClipBounds(graphics: Long, rect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetVisibleClipBoundsI(graphics: Long, rect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGetWorldTransform(graphics: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGraphicsClear(graphics: Long, color: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipGraphicsSetAbort(pgraphics: Long, piabort: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipImageForceValidation(image: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipImageGetFrameCount(image: Long, dimensionid: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipImageGetFrameDimensionsCount(image: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipImageGetFrameDimensionsList(image: Long, dimensionids: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipImageRotateFlip(image: Long, rftype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipImageSelectActiveFrame(image: Long, dimensionid: Long, frameindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipImageSetAbort(pimage: Long, piabort: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipInitializePalette(palette: Long, palettetype: Int, optimalcolors: Int, usetransparentcolor: Int, bitmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipInvertMatrix(matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipIsClipEmpty(graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipIsEmptyRegion(region: Long, graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipIsEqualRegion(region: Long, region2: Long, graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipIsInfiniteRegion(region: Long, graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipIsMatrixEqual(matrix: Long, matrix2: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipIsMatrixIdentity(matrix: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipIsMatrixInvertible(matrix: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipIsOutlineVisiblePathPoint(path: Long, x: Float, y: Float, pen: Long, graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipIsOutlineVisiblePathPointI(path: Long, x: Int, y: Int, pen: Long, graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipIsStyleAvailable(family: Long, style: Int, isstyleavailable: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleClipEmpty(graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipIsVisiblePathPoint(path: Long, x: Float, y: Float, graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipIsVisiblePathPointI(path: Long, x: Int, y: Int, graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipIsVisiblePoint(graphics: Long, x: Float, y: Float, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipIsVisiblePointI(graphics: Long, x: Int, y: Int, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRect(graphics: Long, x: Float, y: Float, width: Float, height: Float, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRectI(graphics: Long, x: Int, y: Int, width: Int, height: Int, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRegionPoint(region: Long, x: Float, y: Float, graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRegionPointI(region: Long, x: Int, y: Int, graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRegionRect(region: Long, x: Float, y: Float, width: Float, height: Float, graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRegionRectI(region: Long, x: Int, y: Int, width: Int, height: Int, graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipLoadImageFromFile(filename: Long, image: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipLoadImageFromFileICM(filename: Long, image: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipLoadImageFromStream(stream: Long, image: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipLoadImageFromStreamICM(stream: Long, image: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipMeasureCharacterRanges(graphics: Long, string: Long, length: Int, font: Long, layoutrect: Long, stringformat: Long, regioncount: Int, regions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipMeasureDriverString(graphics: Long, text: Long, length: Int, font: Long, positions: Long, flags: Int, matrix: Long, boundingbox: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipMeasureString(graphics: Long, string: Long, length: Int, font: Long, layoutrect: Long, stringformat: Long, boundingbox: Long, codepointsfitted: Long, linesfilled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipMultiplyLineTransform(brush: Long, matrix: Long, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipMultiplyMatrix(matrix: Long, matrix2: Long, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipMultiplyPathGradientTransform(brush: Long, matrix: Long, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipMultiplyPenTransform(pen: Long, matrix: Long, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipMultiplyTextureTransform(brush: Long, matrix: Long, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipMultiplyWorldTransform(graphics: Long, matrix: Long, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipNewInstalledFontCollection(fontcollection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipNewPrivateFontCollection(fontcollection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipPathIterCopyData(iterator: Long, resultcount: Long, points: Long, types: Long, startindex: Int, endindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipPathIterEnumerate(iterator: Long, resultcount: Long, points: Long, types: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipPathIterGetCount(iterator: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipPathIterGetSubpathCount(iterator: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipPathIterHasCurve(iterator: Long, hascurve: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipPathIterIsValid(iterator: Long, valid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextMarker(iterator: Long, resultcount: Long, startindex: Long, endindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextMarkerPath(iterator: Long, resultcount: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextPathType(iterator: Long, resultcount: Long, pathtype: Long, startindex: Long, endindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextSubpath(iterator: Long, resultcount: Long, startindex: Long, endindex: Long, isclosed: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextSubpathPath(iterator: Long, resultcount: Long, path: Long, isclosed: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipPathIterRewind(iterator: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipPlayMetafileRecord(metafile: Long, recordtype: Int, flags: Int, datasize: Int, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipPrivateAddFontFile(fontcollection: Long, filename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipPrivateAddMemoryFont(fontcollection: Long, memory: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafile(referencehdc: Long, type: Int, framerect: Long, frameunit: Int, description: Long, metafile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileFileName(filename: Long, referencehdc: Long, type: Int, framerect: Long, frameunit: Int, description: Long, metafile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileFileNameI(filename: Long, referencehdc: Long, type: Int, framerect: Long, frameunit: Int, description: Long, metafile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileI(referencehdc: Long, type: Int, framerect: Long, frameunit: Int, description: Long, metafile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileStream(stream: Long, referencehdc: Long, type: Int, framerect: Long, frameunit: Int, description: Long, metafile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileStreamI(stream: Long, referencehdc: Long, type: Int, framerect: Long, frameunit: Int, description: Long, metafile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipReleaseDC(graphics: Long, hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipRemovePropertyItem(image: Long, propid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipResetClip(graphics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipResetImageAttributes(imageattr: Long, type: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipResetLineTransform(brush: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipResetPageTransform(graphics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipResetPath(path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipResetPathGradientTransform(brush: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipResetPenTransform(pen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipResetTextureTransform(brush: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipResetWorldTransform(graphics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipRestoreGraphics(graphics: Long, state: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipReversePath(path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipRotateLineTransform(brush: Long, angle: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipRotateMatrix(matrix: Long, angle: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipRotatePathGradientTransform(brush: Long, angle: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipRotatePenTransform(pen: Long, angle: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipRotateTextureTransform(brush: Long, angle: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipRotateWorldTransform(graphics: Long, angle: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSaveAdd(image: Long, encoderparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSaveAddImage(image: Long, newimage: Long, encoderparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSaveGraphics(graphics: Long, state: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSaveImageToFile(image: Long, filename: Long, clsidencoder: Long, encoderparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSaveImageToStream(image: Long, stream: Long, clsidencoder: Long, encoderparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipScaleLineTransform(brush: Long, sx: Float, sy: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipScaleMatrix(matrix: Long, scalex: Float, scaley: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipScalePathGradientTransform(brush: Long, sx: Float, sy: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipScalePenTransform(pen: Long, sx: Float, sy: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipScaleTextureTransform(brush: Long, sx: Float, sy: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipScaleWorldTransform(graphics: Long, sx: Float, sy: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetAdjustableArrowCapFillState(cap: Long, fillstate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetAdjustableArrowCapHeight(cap: Long, height: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetAdjustableArrowCapMiddleInset(cap: Long, middleinset: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetAdjustableArrowCapWidth(cap: Long, width: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetClipGraphics(graphics: Long, srcgraphics: Long, combinemode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetClipHrgn(graphics: Long, hrgn: Long, combinemode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetClipPath(graphics: Long, path: Long, combinemode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetClipRect(graphics: Long, x: Float, y: Float, width: Float, height: Float, combinemode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetClipRectI(graphics: Long, x: Int, y: Int, width: Int, height: Int, combinemode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetClipRegion(graphics: Long, region: Long, combinemode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetCompositingMode(graphics: Long, compositingmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetCompositingQuality(graphics: Long, compositingquality: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapBaseCap(customcap: Long, basecap: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapBaseInset(customcap: Long, inset: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapStrokeCaps(customcap: Long, startcap: Int, endcap: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapStrokeJoin(customcap: Long, linejoin: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapWidthScale(customcap: Long, widthscale: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetEffectParameters(effect: Long, params: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetEmpty(region: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesCachedBackground(imageattr: Long, enableflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesColorKeys(imageattr: Long, type: Int, enableflag: Int, colorlow: Int, colorhigh: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesColorMatrix(imageattr: Long, type: Int, enableflag: Int, colormatrix: Long, graymatrix: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesGamma(imageattr: Long, type: Int, enableflag: Int, gamma: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesNoOp(imageattr: Long, type: Int, enableflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesOutputChannel(imageattr: Long, type: Int, enableflag: Int, channelflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesOutputChannelColorProfile(imageattr: Long, type: Int, enableflag: Int, colorprofilefilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesRemapTable(imageattr: Long, type: Int, enableflag: Int, mapsize: Int, map: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesThreshold(imageattr: Long, type: Int, enableflag: Int, threshold: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesToIdentity(imageattr: Long, type: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesWrapMode(imageattr: Long, wrap: Int, argb: Int, clamp: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetImagePalette(image: Long, palette: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetInfinite(region: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetInterpolationMode(graphics: Long, interpolationmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetLineBlend(brush: Long, blend: Long, positions: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetLineColors(brush: Long, color1: Int, color2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetLineGammaCorrection(brush: Long, usegammacorrection: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetLineLinearBlend(brush: Long, focus: Float, scale: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetLinePresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetLineSigmaBlend(brush: Long, focus: Float, scale: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetLineTransform(brush: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetLineWrapMode(brush: Long, wrapmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetMatrixElements(matrix: Long, m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetMetafileDownLevelRasterizationLimit(metafile: Long, metafilerasterizationlimitdpi: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPageScale(graphics: Long, scale: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPageUnit(graphics: Long, unit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPathFillMode(path: Long, fillmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientBlend(brush: Long, blend: Long, positions: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientCenterColor(brush: Long, colors: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientCenterPoint(brush: Long, points: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientCenterPointI(brush: Long, points: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientFocusScales(brush: Long, xscale: Float, yscale: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientGammaCorrection(brush: Long, usegammacorrection: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientLinearBlend(brush: Long, focus: Float, scale: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientPath(brush: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientPresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientSigmaBlend(brush: Long, focus: Float, scale: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientSurroundColorsWithCount(brush: Long, color: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientTransform(brush: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientWrapMode(brush: Long, wrapmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPathMarker(path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPenBrushFill(pen: Long, brush: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPenColor(pen: Long, argb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPenCompoundArray(pen: Long, dash: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPenCustomEndCap(pen: Long, customcap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPenCustomStartCap(pen: Long, customcap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPenDashArray(pen: Long, dash: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPenDashCap197819(pen: Long, dashcap: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPenDashOffset(pen: Long, offset: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPenDashStyle(pen: Long, dashstyle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPenEndCap(pen: Long, endcap: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPenLineCap197819(pen: Long, startcap: Int, endcap: Int, dashcap: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPenLineJoin(pen: Long, linejoin: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPenMiterLimit(pen: Long, miterlimit: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPenMode(pen: Long, penmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPenStartCap(pen: Long, startcap: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPenTransform(pen: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPenUnit(pen: Long, unit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPenWidth(pen: Long, width: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPixelOffsetMode(graphics: Long, pixeloffsetmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetPropertyItem(image: Long, item: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetRenderingOrigin(graphics: Long, x: Int, y: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetSmoothingMode(graphics: Long, smoothingmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetSolidFillColor(brush: Long, color: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatAlign(format: Long, align: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatDigitSubstitution(format: Long, language: Short, substitute: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatFlags(format: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatHotkeyPrefix(format: Long, hotkeyprefix: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatLineAlign(format: Long, align: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatMeasurableCharacterRanges(format: Long, rangecount: Int, ranges: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatTabStops(format: Long, firsttaboffset: Float, count: Int, tabstops: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatTrimming(format: Long, trimming: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetTextContrast(graphics: Long, contrast: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetTextRenderingHint(graphics: Long, mode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetTextureTransform(brush: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetTextureWrapMode(brush: Long, wrapmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipSetWorldTransform(graphics: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipShearMatrix(matrix: Long, shearx: Float, sheary: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipStartPathFigure(path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipStringFormatGetGenericDefault(format: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipStringFormatGetGenericTypographic(format: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipTestControl(control: Int, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipTransformMatrixPoints(matrix: Long, pts: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipTransformMatrixPointsI(matrix: Long, pts: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipTransformPath(path: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipTransformPoints(graphics: Long, destspace: Int, srcspace: Int, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipTransformPointsI(graphics: Long, destspace: Int, srcspace: Int, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipTransformRegion(region: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipTranslateClip(graphics: Long, dx: Float, dy: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipTranslateClipI(graphics: Long, dx: Int, dy: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipTranslateLineTransform(brush: Long, dx: Float, dy: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipTranslateMatrix(matrix: Long, offsetx: Float, offsety: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipTranslatePathGradientTransform(brush: Long, dx: Float, dy: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipTranslatePenTransform(pen: Long, dx: Float, dy: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipTranslateRegion(region: Long, dx: Float, dy: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipTranslateRegionI(region: Long, dx: Int, dy: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipTranslateTextureTransform(brush: Long, dx: Float, dy: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipTranslateWorldTransform(graphics: Long, dx: Float, dy: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipVectorTransformMatrixPoints(matrix: Long, pts: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipVectorTransformMatrixPointsI(matrix: Long, pts: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipWarpPath(path: Long, matrix: Long, points: Long, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, warpmode: Int, flatness: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipWidenPath(nativepath: Long, pen: Long, matrix: Long, flatness: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdipWindingModeOutline(path: Long, matrix: Long, flatness: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdiplusNotificationHook(token: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdiplusNotificationUnhook(token: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdiplusShutdown(token: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_GdiplusStartup(token: Long, input: Long, output: Long): Int
}

public actual fun GdipAddPathArc(path: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAddPathArc(path, x, y, width, height, startangle, sweepangle)

public actual fun GdipAddPathArcI(path: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAddPathArcI(path, x, y, width, height, startangle, sweepangle)

public actual fun GdipAddPathBezier(path: Long, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAddPathBezier(path, x1, y1, x2, y2, x3, y3, x4, y4)

public actual fun GdipAddPathBezierI(path: Long, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAddPathBezierI(path, x1, y1, x2, y2, x3, y3, x4, y4)

public actual fun GdipAddPathBeziers(path: Long, points: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAddPathBeziers(path, points, count)

public actual fun GdipAddPathBeziersI(path: Long, points: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAddPathBeziersI(path, points, count)

public actual fun GdipAddPathClosedCurve(path: Long, points: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAddPathClosedCurve(path, points, count)

public actual fun GdipAddPathClosedCurve2(path: Long, points: Long, count: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAddPathClosedCurve2(path, points, count, tension)

public actual fun GdipAddPathClosedCurve2I(path: Long, points: Long, count: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAddPathClosedCurve2I(path, points, count, tension)

public actual fun GdipAddPathClosedCurveI(path: Long, points: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAddPathClosedCurveI(path, points, count)

public actual fun GdipAddPathCurve(path: Long, points: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve(path, points, count)

public actual fun GdipAddPathCurve2(path: Long, points: Long, count: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve2(path, points, count, tension)

public actual fun GdipAddPathCurve2I(path: Long, points: Long, count: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve2I(path, points, count, tension)

public actual fun GdipAddPathCurve3(path: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve3(path, points, count, offset, numberofsegments, tension)

public actual fun GdipAddPathCurve3I(path: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurve3I(path, points, count, offset, numberofsegments, tension)

public actual fun GdipAddPathCurveI(path: Long, points: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAddPathCurveI(path, points, count)

public actual fun GdipAddPathEllipse(path: Long, x: Float, y: Float, width: Float, height: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAddPathEllipse(path, x, y, width, height)

public actual fun GdipAddPathEllipseI(path: Long, x: Int, y: Int, width: Int, height: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAddPathEllipseI(path, x, y, width, height)

public actual fun GdipAddPathLine(path: Long, x1: Float, y1: Float, x2: Float, y2: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAddPathLine(path, x1, y1, x2, y2)

public actual fun GdipAddPathLine2(path: Long, points: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAddPathLine2(path, points, count)

public actual fun GdipAddPathLine2I(path: Long, points: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAddPathLine2I(path, points, count)

public actual fun GdipAddPathLineI(path: Long, x1: Int, y1: Int, x2: Int, y2: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAddPathLineI(path, x1, y1, x2, y2)

public actual fun GdipAddPathPath(path: Long, addingpath: Long, connect: BOOL): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAddPathPath(path, addingpath, connect)

public actual fun GdipAddPathPie(path: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAddPathPie(path, x, y, width, height, startangle, sweepangle)

public actual fun GdipAddPathPieI(path: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAddPathPieI(path, x, y, width, height, startangle, sweepangle)

public actual fun GdipAddPathPolygon(path: Long, points: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAddPathPolygon(path, points, count)

public actual fun GdipAddPathPolygonI(path: Long, points: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAddPathPolygonI(path, points, count)

public actual fun GdipAddPathRectangle(path: Long, x: Float, y: Float, width: Float, height: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAddPathRectangle(path, x, y, width, height)

public actual fun GdipAddPathRectangleI(path: Long, x: Int, y: Int, width: Int, height: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAddPathRectangleI(path, x, y, width, height)

public actual fun GdipAddPathRectangles(path: Long, rects: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAddPathRectangles(path, rects, count)

public actual fun GdipAddPathRectanglesI(path: Long, rects: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAddPathRectanglesI(path, rects, count)

public actual fun GdipAddPathString(path: Long, string: PCWSTR, length: Int, family: Long, style: Int, emsize: Float, layoutrect: Long, format: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAddPathString(path, string, length, family, style, emsize, layoutrect, format)

public actual fun GdipAddPathStringI(path: Long, string: PCWSTR, length: Int, family: Long, style: Int, emsize: Float, layoutrect: Long, format: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAddPathStringI(path, string, length, family, style, emsize, layoutrect, format)

public actual fun GdipAlloc(size: ULong): Long =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipAlloc(size.toLong())

public actual fun GdipBeginContainer(graphics: Long, dstrect: Long, srcrect: Long, unit: Unit, state: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipBeginContainer(graphics, dstrect, srcrect, unit, state)

public actual fun GdipBeginContainer2(graphics: Long, state: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipBeginContainer2(graphics, state)

public actual fun GdipBeginContainerI(graphics: Long, dstrect: Long, srcrect: Long, unit: Unit, state: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipBeginContainerI(graphics, dstrect, srcrect, unit, state)

public actual fun GdipBitmapApplyEffect(bitmap: Long, effect: Long, roi: Long, useauxdata: BOOL, auxdata: Long, auxdatasize: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipBitmapApplyEffect(bitmap, effect, roi, useauxdata, auxdata, auxdatasize)

public actual fun GdipBitmapConvertFormat(pinputbitmap: Long, format: Int, dithertype: DitherType, palettetype: PaletteType, palette: Long, alphathresholdpercent: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipBitmapConvertFormat(pinputbitmap, format, dithertype, palettetype, palette, alphathresholdpercent)

public actual fun GdipBitmapCreateApplyEffect(inputbitmaps: Long, numinputs: Int, effect: Long, roi: Long, outputrect: Long, outputbitmap: Long, useauxdata: BOOL, auxdata: Long, auxdatasize: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipBitmapCreateApplyEffect(inputbitmaps, numinputs, effect, roi, outputrect, outputbitmap, useauxdata, auxdata, auxdatasize)

public actual fun GdipBitmapGetHistogram(bitmap: Long, format: HistogramFormat, numberofentries: UInt, channel0: Long, channel1: Long, channel2: Long, channel3: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipBitmapGetHistogram(bitmap, format, numberofentries.toInt(), channel0, channel1, channel2, channel3)

public actual fun GdipBitmapGetHistogramSize(format: HistogramFormat, numberofentries: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipBitmapGetHistogramSize(format, numberofentries)

public actual fun GdipBitmapGetPixel(bitmap: Long, x: Int, y: Int, color: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipBitmapGetPixel(bitmap, x, y, color)

public actual fun GdipBitmapLockBits(bitmap: Long, rect: Long, flags: UInt, format: Int, lockedbitmapdata: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipBitmapLockBits(bitmap, rect, flags.toInt(), format, lockedbitmapdata)

public actual fun GdipBitmapSetPixel(bitmap: Long, x: Int, y: Int, color: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipBitmapSetPixel(bitmap, x, y, color.toInt())

public actual fun GdipBitmapSetResolution(bitmap: Long, xdpi: Float, ydpi: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipBitmapSetResolution(bitmap, xdpi, ydpi)

public actual fun GdipBitmapUnlockBits(bitmap: Long, lockedbitmapdata: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipBitmapUnlockBits(bitmap, lockedbitmapdata)

public actual fun GdipClearPathMarkers(path: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipClearPathMarkers(path)

public actual fun GdipCloneBitmapArea(x: Float, y: Float, width: Float, height: Float, format: Int, srcbitmap: Long, dstbitmap: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCloneBitmapArea(x, y, width, height, format, srcbitmap, dstbitmap)

public actual fun GdipCloneBitmapAreaI(x: Int, y: Int, width: Int, height: Int, format: Int, srcbitmap: Long, dstbitmap: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCloneBitmapAreaI(x, y, width, height, format, srcbitmap, dstbitmap)

public actual fun GdipCloneBrush(brush: Long, clonebrush: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCloneBrush(brush, clonebrush)

public actual fun GdipCloneCustomLineCap(customcap: Long, clonedcap: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCloneCustomLineCap(customcap, clonedcap)

public actual fun GdipCloneFont(font: Long, clonefont: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCloneFont(font, clonefont)

public actual fun GdipCloneFontFamily(fontfamily: Long, clonedfontfamily: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCloneFontFamily(fontfamily, clonedfontfamily)

public actual fun GdipCloneImage(image: Long, cloneimage: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCloneImage(image, cloneimage)

public actual fun GdipCloneImageAttributes(imageattr: Long, cloneimageattr: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCloneImageAttributes(imageattr, cloneimageattr)

public actual fun GdipCloneMatrix(matrix: Long, clonematrix: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCloneMatrix(matrix, clonematrix)

public actual fun GdipClonePath(path: Long, clonepath: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipClonePath(path, clonepath)

public actual fun GdipClonePen(pen: Long, clonepen: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipClonePen(pen, clonepen)

public actual fun GdipCloneRegion(region: Long, cloneregion: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCloneRegion(region, cloneregion)

public actual fun GdipCloneStringFormat(format: Long, newformat: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCloneStringFormat(format, newformat)

public actual fun GdipClosePathFigure(path: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipClosePathFigure(path)

public actual fun GdipClosePathFigures(path: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipClosePathFigures(path)

public actual fun GdipCombineRegionPath(region: Long, path: Long, combinemode: CombineMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCombineRegionPath(region, path, combinemode)

public actual fun GdipCombineRegionRect(region: Long, rect: Long, combinemode: CombineMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCombineRegionRect(region, rect, combinemode)

public actual fun GdipCombineRegionRectI(region: Long, rect: Long, combinemode: CombineMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCombineRegionRectI(region, rect, combinemode)

public actual fun GdipCombineRegionRegion(region: Long, region2: Long, combinemode: CombineMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCombineRegionRegion(region, region2, combinemode)

public actual fun GdipComment(graphics: Long, sizedata: UInt, data: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipComment(graphics, sizedata.toInt(), data)

public actual fun GdipConvertToEmfPlus(refgraphics: Long, metafile: Long, conversionfailureflag: Long, emftype: EmfType, description: PCWSTR, out_metafile: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipConvertToEmfPlus(refgraphics, metafile, conversionfailureflag, emftype, description, out_metafile)

public actual fun GdipConvertToEmfPlusToFile(refgraphics: Long, metafile: Long, conversionfailureflag: Long, filename: PCWSTR, emftype: EmfType, description: PCWSTR, out_metafile: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipConvertToEmfPlusToFile(refgraphics, metafile, conversionfailureflag, filename, emftype, description, out_metafile)

public actual fun GdipConvertToEmfPlusToStream(refgraphics: Long, metafile: Long, conversionfailureflag: Long, stream: Long, emftype: EmfType, description: PCWSTR, out_metafile: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipConvertToEmfPlusToStream(refgraphics, metafile, conversionfailureflag, stream, emftype, description, out_metafile)

public actual fun GdipCreateAdjustableArrowCap(height: Float, width: Float, isfilled: BOOL, cap: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateAdjustableArrowCap(height, width, isfilled, cap)

public actual fun GdipCreateBitmapFromFile(filename: PCWSTR, bitmap: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromFile(filename, bitmap)

public actual fun GdipCreateBitmapFromFileICM(filename: PCWSTR, bitmap: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromFileICM(filename, bitmap)

public actual fun GdipCreateBitmapFromGdiDib(gdibitmapinfo: Long, gdibitmapdata: Long, bitmap: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromGdiDib(gdibitmapinfo, gdibitmapdata, bitmap)

public actual fun GdipCreateBitmapFromGraphics(width: Int, height: Int, target: Long, bitmap: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromGraphics(width, height, target, bitmap)

public actual fun GdipCreateBitmapFromHBITMAP(hbm: HBITMAP, hpal: HPALETTE, bitmap: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromHBITMAP(hbm, hpal, bitmap)

public actual fun GdipCreateBitmapFromHICON(hicon: HICON, bitmap: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromHICON(hicon, bitmap)

public actual fun GdipCreateBitmapFromResource(hinstance: HINSTANCE, lpbitmapname: PCWSTR, bitmap: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromResource(hinstance, lpbitmapname, bitmap)

public actual fun GdipCreateBitmapFromScan0(width: Int, height: Int, stride: Int, format: Int, scan0: Long, bitmap: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromScan0(width, height, stride, format, scan0, bitmap)

public actual fun GdipCreateBitmapFromStream(stream: Long, bitmap: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromStream(stream, bitmap)

public actual fun GdipCreateBitmapFromStreamICM(stream: Long, bitmap: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateBitmapFromStreamICM(stream, bitmap)

public actual fun GdipCreateCachedBitmap(bitmap: Long, graphics: Long, cachedbitmap: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateCachedBitmap(bitmap, graphics, cachedbitmap)

public actual fun GdipCreateCustomLineCap(fillpath: Long, strokepath: Long, basecap: LineCap, baseinset: Float, customcap: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateCustomLineCap(fillpath, strokepath, basecap, baseinset, customcap)

public actual fun GdipCreateEffect(guid: GUID, effect: Long): Status =
    0

public actual fun GdipCreateFont(fontfamily: Long, emsize: Float, style: Int, unit: Unit, font: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateFont(fontfamily, emsize, style, unit, font)

public actual fun GdipCreateFontFamilyFromName(name: PCWSTR, fontcollection: Long, fontfamily: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateFontFamilyFromName(name, fontcollection, fontfamily)

public actual fun GdipCreateFontFromDC(hdc: HDC, font: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateFontFromDC(hdc, font)

public actual fun GdipCreateFontFromLogfontA(hdc: HDC, logfont: Long, font: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateFontFromLogfontA(hdc, logfont, font)

public actual fun GdipCreateFontFromLogfontW(hdc: HDC, logfont: Long, font: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateFontFromLogfontW(hdc, logfont, font)

public actual fun GdipCreateFromHDC(hdc: HDC, graphics: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateFromHDC(hdc, graphics)

public actual fun GdipCreateFromHDC2(hdc: HDC, hdevice: HANDLE, graphics: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateFromHDC2(hdc, hdevice, graphics)

public actual fun GdipCreateFromHWND(hwnd: HWND, graphics: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateFromHWND(hwnd, graphics)

public actual fun GdipCreateFromHWNDICM(hwnd: HWND, graphics: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateFromHWNDICM(hwnd, graphics)

public actual fun GdipCreateHBITMAPFromBitmap(bitmap: Long, hbmreturn: Long, background: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateHBITMAPFromBitmap(bitmap, hbmreturn, background.toInt())

public actual fun GdipCreateHICONFromBitmap(bitmap: Long, hbmreturn: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateHICONFromBitmap(bitmap, hbmreturn)

public actual fun GdipCreateHalftonePalette(): HPALETTE =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateHalftonePalette()

public actual fun GdipCreateHatchBrush(hatchstyle: HatchStyle, forecol: UInt, backcol: UInt, brush: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateHatchBrush(hatchstyle, forecol.toInt(), backcol.toInt(), brush)

public actual fun GdipCreateImageAttributes(imageattr: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateImageAttributes(imageattr)

public actual fun GdipCreateLineBrush(point1: Long, point2: Long, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrush(point1, point2, color1.toInt(), color2.toInt(), wrapmode, linegradient)

public actual fun GdipCreateLineBrushFromRect(rect: Long, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushFromRect(rect, color1.toInt(), color2.toInt(), mode, wrapmode, linegradient)

public actual fun GdipCreateLineBrushFromRectI(rect: Long, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushFromRectI(rect, color1.toInt(), color2.toInt(), mode, wrapmode, linegradient)

public actual fun GdipCreateLineBrushFromRectWithAngle(rect: Long, color1: UInt, color2: UInt, angle: Float, isanglescalable: BOOL, wrapmode: WrapMode, linegradient: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushFromRectWithAngle(rect, color1.toInt(), color2.toInt(), angle, isanglescalable, wrapmode, linegradient)

public actual fun GdipCreateLineBrushFromRectWithAngleI(rect: Long, color1: UInt, color2: UInt, angle: Float, isanglescalable: BOOL, wrapmode: WrapMode, linegradient: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushFromRectWithAngleI(rect, color1.toInt(), color2.toInt(), angle, isanglescalable, wrapmode, linegradient)

public actual fun GdipCreateLineBrushI(point1: Long, point2: Long, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateLineBrushI(point1, point2, color1.toInt(), color2.toInt(), wrapmode, linegradient)

public actual fun GdipCreateMatrix(matrix: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateMatrix(matrix)

public actual fun GdipCreateMatrix2(m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float, matrix: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateMatrix2(m11, m12, m21, m22, dx, dy, matrix)

public actual fun GdipCreateMatrix3(rect: Long, dstplg: Long, matrix: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateMatrix3(rect, dstplg, matrix)

public actual fun GdipCreateMatrix3I(rect: Long, dstplg: Long, matrix: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateMatrix3I(rect, dstplg, matrix)

public actual fun GdipCreateMetafileFromEmf(hemf: HENHMETAFILE, deleteemf: BOOL, metafile: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromEmf(hemf, deleteemf, metafile)

public actual fun GdipCreateMetafileFromFile(file: PCWSTR, metafile: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromFile(file, metafile)

public actual fun GdipCreateMetafileFromStream(stream: Long, metafile: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromStream(stream, metafile)

public actual fun GdipCreateMetafileFromWmf(hwmf: HMETAFILE, deletewmf: BOOL, wmfplaceablefileheader: Long, metafile: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromWmf(hwmf, deletewmf, wmfplaceablefileheader, metafile)

public actual fun GdipCreateMetafileFromWmfFile(file: PCWSTR, wmfplaceablefileheader: Long, metafile: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateMetafileFromWmfFile(file, wmfplaceablefileheader, metafile)

public actual fun GdipCreatePath(brushmode: FillMode, path: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreatePath(brushmode, path)

public actual fun GdipCreatePath2(param0: Long, param1: Long, param2: Int, param3: FillMode, path: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreatePath2(param0, param1, param2, param3, path)

public actual fun GdipCreatePath2I(param0: Long, param1: Long, param2: Int, param3: FillMode, path: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreatePath2I(param0, param1, param2, param3, path)

public actual fun GdipCreatePathGradient(points: Long, count: Int, wrapmode: WrapMode, polygradient: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreatePathGradient(points, count, wrapmode, polygradient)

public actual fun GdipCreatePathGradientFromPath(path: Long, polygradient: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreatePathGradientFromPath(path, polygradient)

public actual fun GdipCreatePathGradientI(points: Long, count: Int, wrapmode: WrapMode, polygradient: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreatePathGradientI(points, count, wrapmode, polygradient)

public actual fun GdipCreatePathIter(iterator: Long, path: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreatePathIter(iterator, path)

public actual fun GdipCreatePen1(color: UInt, width: Float, unit: Unit, pen: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreatePen1(color.toInt(), width, unit, pen)

public actual fun GdipCreatePen2(brush: Long, width: Float, unit: Unit, pen: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreatePen2(brush, width, unit, pen)

public actual fun GdipCreateRegion(region: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateRegion(region)

public actual fun GdipCreateRegionHrgn(hrgn: HRGN, region: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionHrgn(hrgn, region)

public actual fun GdipCreateRegionPath(path: Long, region: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionPath(path, region)

public actual fun GdipCreateRegionRect(rect: Long, region: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionRect(rect, region)

public actual fun GdipCreateRegionRectI(rect: Long, region: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionRectI(rect, region)

public actual fun GdipCreateRegionRgnData(regiondata: Long, size: Int, region: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateRegionRgnData(regiondata, size, region)

public actual fun GdipCreateSolidFill(color: UInt, brush: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateSolidFill(color.toInt(), brush)

public actual fun GdipCreateStreamOnFile(filename: PCWSTR, access: UInt, stream: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateStreamOnFile(filename, access.toInt(), stream)

public actual fun GdipCreateStringFormat(formatattributes: Int, language: UShort, format: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateStringFormat(formatattributes, language.toShort(), format)

public actual fun GdipCreateTexture(image: Long, wrapmode: WrapMode, texture: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateTexture(image, wrapmode, texture)

public actual fun GdipCreateTexture2(image: Long, wrapmode: WrapMode, x: Float, y: Float, width: Float, height: Float, texture: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateTexture2(image, wrapmode, x, y, width, height, texture)

public actual fun GdipCreateTexture2I(image: Long, wrapmode: WrapMode, x: Int, y: Int, width: Int, height: Int, texture: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateTexture2I(image, wrapmode, x, y, width, height, texture)

public actual fun GdipCreateTextureIA(image: Long, imageattributes: Long, x: Float, y: Float, width: Float, height: Float, texture: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateTextureIA(image, imageattributes, x, y, width, height, texture)

public actual fun GdipCreateTextureIAI(image: Long, imageattributes: Long, x: Int, y: Int, width: Int, height: Int, texture: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipCreateTextureIAI(image, imageattributes, x, y, width, height, texture)

public actual fun GdipDeleteBrush(brush: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDeleteBrush(brush)

public actual fun GdipDeleteCachedBitmap(cachedbitmap: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDeleteCachedBitmap(cachedbitmap)

public actual fun GdipDeleteCustomLineCap(customcap: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDeleteCustomLineCap(customcap)

public actual fun GdipDeleteEffect(effect: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDeleteEffect(effect)

public actual fun GdipDeleteFont(font: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDeleteFont(font)

public actual fun GdipDeleteFontFamily(fontfamily: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDeleteFontFamily(fontfamily)

public actual fun GdipDeleteGraphics(graphics: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDeleteGraphics(graphics)

public actual fun GdipDeleteMatrix(matrix: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDeleteMatrix(matrix)

public actual fun GdipDeletePath(path: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDeletePath(path)

public actual fun GdipDeletePathIter(iterator: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDeletePathIter(iterator)

public actual fun GdipDeletePen(pen: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDeletePen(pen)

public actual fun GdipDeletePrivateFontCollection(fontcollection: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDeletePrivateFontCollection(fontcollection)

public actual fun GdipDeleteRegion(region: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDeleteRegion(region)

public actual fun GdipDeleteStringFormat(format: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDeleteStringFormat(format)

public actual fun GdipDisposeImage(image: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDisposeImage(image)

public actual fun GdipDisposeImageAttributes(imageattr: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDisposeImageAttributes(imageattr)

public actual fun GdipDrawArc(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawArc(graphics, pen, x, y, width, height, startangle, sweepangle)

public actual fun GdipDrawArcI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawArcI(graphics, pen, x, y, width, height, startangle, sweepangle)

public actual fun GdipDrawBezier(graphics: Long, pen: Long, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawBezier(graphics, pen, x1, y1, x2, y2, x3, y3, x4, y4)

public actual fun GdipDrawBezierI(graphics: Long, pen: Long, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawBezierI(graphics, pen, x1, y1, x2, y2, x3, y3, x4, y4)

public actual fun GdipDrawBeziers(graphics: Long, pen: Long, points: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawBeziers(graphics, pen, points, count)

public actual fun GdipDrawBeziersI(graphics: Long, pen: Long, points: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawBeziersI(graphics, pen, points, count)

public actual fun GdipDrawCachedBitmap(graphics: Long, cachedbitmap: Long, x: Int, y: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawCachedBitmap(graphics, cachedbitmap, x, y)

public actual fun GdipDrawClosedCurve(graphics: Long, pen: Long, points: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawClosedCurve(graphics, pen, points, count)

public actual fun GdipDrawClosedCurve2(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawClosedCurve2(graphics, pen, points, count, tension)

public actual fun GdipDrawClosedCurve2I(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawClosedCurve2I(graphics, pen, points, count, tension)

public actual fun GdipDrawClosedCurveI(graphics: Long, pen: Long, points: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawClosedCurveI(graphics, pen, points, count)

public actual fun GdipDrawCurve(graphics: Long, pen: Long, points: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve(graphics, pen, points, count)

public actual fun GdipDrawCurve2(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve2(graphics, pen, points, count, tension)

public actual fun GdipDrawCurve2I(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve2I(graphics, pen, points, count, tension)

public actual fun GdipDrawCurve3(graphics: Long, pen: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve3(graphics, pen, points, count, offset, numberofsegments, tension)

public actual fun GdipDrawCurve3I(graphics: Long, pen: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawCurve3I(graphics, pen, points, count, offset, numberofsegments, tension)

public actual fun GdipDrawCurveI(graphics: Long, pen: Long, points: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawCurveI(graphics, pen, points, count)

public actual fun GdipDrawDriverString(graphics: Long, text: Long, length: Int, font: Long, brush: Long, positions: Long, flags: Int, matrix: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawDriverString(graphics, text, length, font, brush, positions, flags, matrix)

public actual fun GdipDrawEllipse(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawEllipse(graphics, pen, x, y, width, height)

public actual fun GdipDrawEllipseI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawEllipseI(graphics, pen, x, y, width, height)

public actual fun GdipDrawImage(graphics: Long, image: Long, x: Float, y: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawImage(graphics, image, x, y)

public actual fun GdipDrawImageFX(graphics: Long, image: Long, source: Long, xform: Long, effect: Long, imageattributes: Long, srcunit: Unit): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawImageFX(graphics, image, source, xform, effect, imageattributes, srcunit)

public actual fun GdipDrawImageI(graphics: Long, image: Long, x: Int, y: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawImageI(graphics, image, x, y)

public actual fun GdipDrawImagePointRect(graphics: Long, image: Long, x: Float, y: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointRect(graphics, image, x, y, srcx, srcy, srcwidth, srcheight, srcunit)

public actual fun GdipDrawImagePointRectI(graphics: Long, image: Long, x: Int, y: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointRectI(graphics, image, x, y, srcx, srcy, srcwidth, srcheight, srcunit)

public actual fun GdipDrawImagePoints(graphics: Long, image: Long, dstpoints: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePoints(graphics, image, dstpoints, count)

public actual fun GdipDrawImagePointsI(graphics: Long, image: Long, dstpoints: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointsI(graphics, image, dstpoints, count)

public actual fun GdipDrawImagePointsRect(graphics: Long, image: Long, points: Long, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: Long, callback: Long, callbackdata: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointsRect(graphics, image, points, count, srcx, srcy, srcwidth, srcheight, srcunit, imageattributes, callback, callbackdata)

public actual fun GdipDrawImagePointsRectI(graphics: Long, image: Long, points: Long, count: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: Long, callback: Long, callbackdata: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawImagePointsRectI(graphics, image, points, count, srcx, srcy, srcwidth, srcheight, srcunit, imageattributes, callback, callbackdata)

public actual fun GdipDrawImageRect(graphics: Long, image: Long, x: Float, y: Float, width: Float, height: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawImageRect(graphics, image, x, y, width, height)

public actual fun GdipDrawImageRectI(graphics: Long, image: Long, x: Int, y: Int, width: Int, height: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawImageRectI(graphics, image, x, y, width, height)

public actual fun GdipDrawImageRectRect(graphics: Long, image: Long, dstx: Float, dsty: Float, dstwidth: Float, dstheight: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: Long, callback: Long, callbackdata: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawImageRectRect(graphics, image, dstx, dsty, dstwidth, dstheight, srcx, srcy, srcwidth, srcheight, srcunit, imageattributes, callback, callbackdata)

public actual fun GdipDrawImageRectRectI(graphics: Long, image: Long, dstx: Int, dsty: Int, dstwidth: Int, dstheight: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: Long, callback: Long, callbackdata: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawImageRectRectI(graphics, image, dstx, dsty, dstwidth, dstheight, srcx, srcy, srcwidth, srcheight, srcunit, imageattributes, callback, callbackdata)

public actual fun GdipDrawLine(graphics: Long, pen: Long, x1: Float, y1: Float, x2: Float, y2: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawLine(graphics, pen, x1, y1, x2, y2)

public actual fun GdipDrawLineI(graphics: Long, pen: Long, x1: Int, y1: Int, x2: Int, y2: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawLineI(graphics, pen, x1, y1, x2, y2)

public actual fun GdipDrawLines(graphics: Long, pen: Long, points: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawLines(graphics, pen, points, count)

public actual fun GdipDrawLinesI(graphics: Long, pen: Long, points: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawLinesI(graphics, pen, points, count)

public actual fun GdipDrawPath(graphics: Long, pen: Long, path: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawPath(graphics, pen, path)

public actual fun GdipDrawPie(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawPie(graphics, pen, x, y, width, height, startangle, sweepangle)

public actual fun GdipDrawPieI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawPieI(graphics, pen, x, y, width, height, startangle, sweepangle)

public actual fun GdipDrawPolygon(graphics: Long, pen: Long, points: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawPolygon(graphics, pen, points, count)

public actual fun GdipDrawPolygonI(graphics: Long, pen: Long, points: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawPolygonI(graphics, pen, points, count)

public actual fun GdipDrawRectangle(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawRectangle(graphics, pen, x, y, width, height)

public actual fun GdipDrawRectangleI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawRectangleI(graphics, pen, x, y, width, height)

public actual fun GdipDrawRectangles(graphics: Long, pen: Long, rects: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawRectangles(graphics, pen, rects, count)

public actual fun GdipDrawRectanglesI(graphics: Long, pen: Long, rects: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawRectanglesI(graphics, pen, rects, count)

public actual fun GdipDrawString(graphics: Long, string: PCWSTR, length: Int, font: Long, layoutrect: Long, stringformat: Long, brush: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipDrawString(graphics, string, length, font, layoutrect, stringformat, brush)

public actual fun GdipEmfToWmfBits(hemf: HENHMETAFILE, cbdata16: UInt, pdata16: Long, imapmode: Int, eflags: Int): UInt =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipEmfToWmfBits(hemf, cbdata16.toInt(), pdata16, imapmode, eflags).toUInt()

public actual fun GdipEndContainer(graphics: Long, state: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipEndContainer(graphics, state.toInt())

public actual fun GdipEnumerateMetafileDestPoint(graphics: Long, metafile: Long, destpoint: Long, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestPoint(graphics, metafile, destpoint, callback, callbackdata, imageattributes)

public actual fun GdipEnumerateMetafileDestPointI(graphics: Long, metafile: Long, destpoint: Long, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestPointI(graphics, metafile, destpoint, callback, callbackdata, imageattributes)

public actual fun GdipEnumerateMetafileDestPoints(graphics: Long, metafile: Long, destpoints: Long, count: Int, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestPoints(graphics, metafile, destpoints, count, callback, callbackdata, imageattributes)

public actual fun GdipEnumerateMetafileDestPointsI(graphics: Long, metafile: Long, destpoints: Long, count: Int, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestPointsI(graphics, metafile, destpoints, count, callback, callbackdata, imageattributes)

public actual fun GdipEnumerateMetafileDestRect(graphics: Long, metafile: Long, destrect: Long, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestRect(graphics, metafile, destrect, callback, callbackdata, imageattributes)

public actual fun GdipEnumerateMetafileDestRectI(graphics: Long, metafile: Long, destrect: Long, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileDestRectI(graphics, metafile, destrect, callback, callbackdata, imageattributes)

public actual fun GdipEnumerateMetafileSrcRectDestPoint(graphics: Long, metafile: Long, destpoint: Long, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestPoint(graphics, metafile, destpoint, srcrect, srcunit, callback, callbackdata, imageattributes)

public actual fun GdipEnumerateMetafileSrcRectDestPointI(graphics: Long, metafile: Long, destpoint: Long, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestPointI(graphics, metafile, destpoint, srcrect, srcunit, callback, callbackdata, imageattributes)

public actual fun GdipEnumerateMetafileSrcRectDestPoints(graphics: Long, metafile: Long, destpoints: Long, count: Int, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestPoints(graphics, metafile, destpoints, count, srcrect, srcunit, callback, callbackdata, imageattributes)

public actual fun GdipEnumerateMetafileSrcRectDestPointsI(graphics: Long, metafile: Long, destpoints: Long, count: Int, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestPointsI(graphics, metafile, destpoints, count, srcrect, srcunit, callback, callbackdata, imageattributes)

public actual fun GdipEnumerateMetafileSrcRectDestRect(graphics: Long, metafile: Long, destrect: Long, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestRect(graphics, metafile, destrect, srcrect, srcunit, callback, callbackdata, imageattributes)

public actual fun GdipEnumerateMetafileSrcRectDestRectI(graphics: Long, metafile: Long, destrect: Long, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipEnumerateMetafileSrcRectDestRectI(graphics, metafile, destrect, srcrect, srcunit, callback, callbackdata, imageattributes)

public actual fun GdipFillClosedCurve(graphics: Long, brush: Long, points: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipFillClosedCurve(graphics, brush, points, count)

public actual fun GdipFillClosedCurve2(graphics: Long, brush: Long, points: Long, count: Int, tension: Float, fillmode: FillMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipFillClosedCurve2(graphics, brush, points, count, tension, fillmode)

public actual fun GdipFillClosedCurve2I(graphics: Long, brush: Long, points: Long, count: Int, tension: Float, fillmode: FillMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipFillClosedCurve2I(graphics, brush, points, count, tension, fillmode)

public actual fun GdipFillClosedCurveI(graphics: Long, brush: Long, points: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipFillClosedCurveI(graphics, brush, points, count)

public actual fun GdipFillEllipse(graphics: Long, brush: Long, x: Float, y: Float, width: Float, height: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipFillEllipse(graphics, brush, x, y, width, height)

public actual fun GdipFillEllipseI(graphics: Long, brush: Long, x: Int, y: Int, width: Int, height: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipFillEllipseI(graphics, brush, x, y, width, height)

public actual fun GdipFillPath(graphics: Long, brush: Long, path: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipFillPath(graphics, brush, path)

public actual fun GdipFillPie(graphics: Long, brush: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipFillPie(graphics, brush, x, y, width, height, startangle, sweepangle)

public actual fun GdipFillPieI(graphics: Long, brush: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipFillPieI(graphics, brush, x, y, width, height, startangle, sweepangle)

public actual fun GdipFillPolygon(graphics: Long, brush: Long, points: Long, count: Int, fillmode: FillMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipFillPolygon(graphics, brush, points, count, fillmode)

public actual fun GdipFillPolygon2(graphics: Long, brush: Long, points: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipFillPolygon2(graphics, brush, points, count)

public actual fun GdipFillPolygon2I(graphics: Long, brush: Long, points: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipFillPolygon2I(graphics, brush, points, count)

public actual fun GdipFillPolygonI(graphics: Long, brush: Long, points: Long, count: Int, fillmode: FillMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipFillPolygonI(graphics, brush, points, count, fillmode)

public actual fun GdipFillRectangle(graphics: Long, brush: Long, x: Float, y: Float, width: Float, height: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipFillRectangle(graphics, brush, x, y, width, height)

public actual fun GdipFillRectangleI(graphics: Long, brush: Long, x: Int, y: Int, width: Int, height: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipFillRectangleI(graphics, brush, x, y, width, height)

public actual fun GdipFillRectangles(graphics: Long, brush: Long, rects: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipFillRectangles(graphics, brush, rects, count)

public actual fun GdipFillRectanglesI(graphics: Long, brush: Long, rects: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipFillRectanglesI(graphics, brush, rects, count)

public actual fun GdipFillRegion(graphics: Long, brush: Long, region: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipFillRegion(graphics, brush, region)

public actual fun GdipFindFirstImageItem(image: Long, item: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipFindFirstImageItem(image, item)

public actual fun GdipFindNextImageItem(image: Long, item: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipFindNextImageItem(image, item)

public actual fun GdipFlattenPath(path: Long, matrix: Long, flatness: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipFlattenPath(path, matrix, flatness)

public actual fun GdipFlush(graphics: Long, intention: FlushIntention): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipFlush(graphics, intention)

public actual fun GdipFree(ptr: Long) {
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipFree(ptr)
}

public actual fun GdipGetAdjustableArrowCapFillState(cap: Long, fillstate: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetAdjustableArrowCapFillState(cap, fillstate)

public actual fun GdipGetAdjustableArrowCapHeight(cap: Long, height: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetAdjustableArrowCapHeight(cap, height)

public actual fun GdipGetAdjustableArrowCapMiddleInset(cap: Long, middleinset: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetAdjustableArrowCapMiddleInset(cap, middleinset)

public actual fun GdipGetAdjustableArrowCapWidth(cap: Long, width: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetAdjustableArrowCapWidth(cap, width)

public actual fun GdipGetAllPropertyItems(image: Long, totalbuffersize: UInt, numproperties: UInt, allitems: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetAllPropertyItems(image, totalbuffersize.toInt(), numproperties.toInt(), allitems)

public actual fun GdipGetBrushType(brush: Long, type: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetBrushType(brush, type)

public actual fun GdipGetCellAscent(family: Long, style: Int, cellascent: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetCellAscent(family, style, cellascent)

public actual fun GdipGetCellDescent(family: Long, style: Int, celldescent: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetCellDescent(family, style, celldescent)

public actual fun GdipGetClip(graphics: Long, region: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetClip(graphics, region)

public actual fun GdipGetClipBounds(graphics: Long, rect: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetClipBounds(graphics, rect)

public actual fun GdipGetClipBoundsI(graphics: Long, rect: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetClipBoundsI(graphics, rect)

public actual fun GdipGetCompositingMode(graphics: Long, compositingmode: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetCompositingMode(graphics, compositingmode)

public actual fun GdipGetCompositingQuality(graphics: Long, compositingquality: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetCompositingQuality(graphics, compositingquality)

public actual fun GdipGetCustomLineCapBaseCap(customcap: Long, basecap: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapBaseCap(customcap, basecap)

public actual fun GdipGetCustomLineCapBaseInset(customcap: Long, inset: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapBaseInset(customcap, inset)

public actual fun GdipGetCustomLineCapStrokeCaps(customcap: Long, startcap: Long, endcap: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapStrokeCaps(customcap, startcap, endcap)

public actual fun GdipGetCustomLineCapStrokeJoin(customcap: Long, linejoin: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapStrokeJoin(customcap, linejoin)

public actual fun GdipGetCustomLineCapType(customcap: Long, captype: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapType(customcap, captype)

public actual fun GdipGetCustomLineCapWidthScale(customcap: Long, widthscale: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetCustomLineCapWidthScale(customcap, widthscale)

public actual fun GdipGetDC(graphics: Long, hdc: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetDC(graphics, hdc)

public actual fun GdipGetDpiX(graphics: Long, dpi: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetDpiX(graphics, dpi)

public actual fun GdipGetDpiY(graphics: Long, dpi: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetDpiY(graphics, dpi)

public actual fun GdipGetEffectParameterSize(effect: Long, size: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetEffectParameterSize(effect, size)

public actual fun GdipGetEffectParameters(effect: Long, size: Long, params: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetEffectParameters(effect, size, params)

public actual fun GdipGetEmHeight(family: Long, style: Int, emheight: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetEmHeight(family, style, emheight)

public actual fun GdipGetEncoderParameterList(image: Long, clsidencoder: Long, size: UInt, buffer: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetEncoderParameterList(image, clsidencoder, size.toInt(), buffer)

public actual fun GdipGetEncoderParameterListSize(image: Long, clsidencoder: Long, size: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetEncoderParameterListSize(image, clsidencoder, size)

public actual fun GdipGetFamily(font: Long, family: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetFamily(font, family)

public actual fun GdipGetFamilyName(family: Long, name: PWSTR, language: UShort): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetFamilyName(family, name, language.toShort())

public actual fun GdipGetFontCollectionFamilyCount(fontcollection: Long, numfound: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetFontCollectionFamilyCount(fontcollection, numfound)

public actual fun GdipGetFontCollectionFamilyList(fontcollection: Long, numsought: Int, gpfamilies: Long, numfound: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetFontCollectionFamilyList(fontcollection, numsought, gpfamilies, numfound)

public actual fun GdipGetFontHeight(font: Long, graphics: Long, height: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetFontHeight(font, graphics, height)

public actual fun GdipGetFontHeightGivenDPI(font: Long, dpi: Float, height: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetFontHeightGivenDPI(font, dpi, height)

public actual fun GdipGetFontSize(font: Long, size: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetFontSize(font, size)

public actual fun GdipGetFontStyle(font: Long, style: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetFontStyle(font, style)

public actual fun GdipGetFontUnit(font: Long, unit: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetFontUnit(font, unit)

public actual fun GdipGetGenericFontFamilyMonospace(nativefamily: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetGenericFontFamilyMonospace(nativefamily)

public actual fun GdipGetGenericFontFamilySansSerif(nativefamily: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetGenericFontFamilySansSerif(nativefamily)

public actual fun GdipGetGenericFontFamilySerif(nativefamily: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetGenericFontFamilySerif(nativefamily)

public actual fun GdipGetHatchBackgroundColor(brush: Long, backcol: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetHatchBackgroundColor(brush, backcol)

public actual fun GdipGetHatchForegroundColor(brush: Long, forecol: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetHatchForegroundColor(brush, forecol)

public actual fun GdipGetHatchStyle(brush: Long, hatchstyle: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetHatchStyle(brush, hatchstyle)

public actual fun GdipGetHemfFromMetafile(metafile: Long, hemf: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetHemfFromMetafile(metafile, hemf)

public actual fun GdipGetImageAttributesAdjustedPalette(imageattr: Long, colorpalette: Long, coloradjusttype: ColorAdjustType): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetImageAttributesAdjustedPalette(imageattr, colorpalette, coloradjusttype)

public actual fun GdipGetImageBounds(image: Long, srcrect: Long, srcunit: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetImageBounds(image, srcrect, srcunit)

public actual fun GdipGetImageDecoders(numdecoders: UInt, size: UInt, decoders: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetImageDecoders(numdecoders.toInt(), size.toInt(), decoders)

public actual fun GdipGetImageDecodersSize(numdecoders: Long, size: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetImageDecodersSize(numdecoders, size)

public actual fun GdipGetImageDimension(image: Long, width: Long, height: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetImageDimension(image, width, height)

public actual fun GdipGetImageEncoders(numencoders: UInt, size: UInt, encoders: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetImageEncoders(numencoders.toInt(), size.toInt(), encoders)

public actual fun GdipGetImageEncodersSize(numencoders: Long, size: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetImageEncodersSize(numencoders, size)

public actual fun GdipGetImageFlags(image: Long, flags: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetImageFlags(image, flags)

public actual fun GdipGetImageGraphicsContext(image: Long, graphics: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetImageGraphicsContext(image, graphics)

public actual fun GdipGetImageHeight(image: Long, height: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetImageHeight(image, height)

public actual fun GdipGetImageHorizontalResolution(image: Long, resolution: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetImageHorizontalResolution(image, resolution)

public actual fun GdipGetImageItemData(image: Long, item: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetImageItemData(image, item)

public actual fun GdipGetImagePalette(image: Long, palette: Long, size: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetImagePalette(image, palette, size)

public actual fun GdipGetImagePaletteSize(image: Long, size: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetImagePaletteSize(image, size)

public actual fun GdipGetImagePixelFormat(image: Long, format: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetImagePixelFormat(image, format)

public actual fun GdipGetImageRawFormat(image: Long, format: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetImageRawFormat(image, format)

public actual fun GdipGetImageThumbnail(image: Long, thumbwidth: UInt, thumbheight: UInt, thumbimage: Long, callback: Long, callbackdata: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetImageThumbnail(image, thumbwidth.toInt(), thumbheight.toInt(), thumbimage, callback, callbackdata)

public actual fun GdipGetImageType(image: Long, type: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetImageType(image, type)

public actual fun GdipGetImageVerticalResolution(image: Long, resolution: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetImageVerticalResolution(image, resolution)

public actual fun GdipGetImageWidth(image: Long, width: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetImageWidth(image, width)

public actual fun GdipGetInterpolationMode(graphics: Long, interpolationmode: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetInterpolationMode(graphics, interpolationmode)

public actual fun GdipGetLineBlend(brush: Long, blend: Long, positions: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetLineBlend(brush, blend, positions, count)

public actual fun GdipGetLineBlendCount(brush: Long, count: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetLineBlendCount(brush, count)

public actual fun GdipGetLineColors(brush: Long, colors: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetLineColors(brush, colors)

public actual fun GdipGetLineGammaCorrection(brush: Long, usegammacorrection: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetLineGammaCorrection(brush, usegammacorrection)

public actual fun GdipGetLinePresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetLinePresetBlend(brush, blend, positions, count)

public actual fun GdipGetLinePresetBlendCount(brush: Long, count: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetLinePresetBlendCount(brush, count)

public actual fun GdipGetLineRect(brush: Long, rect: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetLineRect(brush, rect)

public actual fun GdipGetLineRectI(brush: Long, rect: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetLineRectI(brush, rect)

public actual fun GdipGetLineSpacing(family: Long, style: Int, linespacing: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetLineSpacing(family, style, linespacing)

public actual fun GdipGetLineTransform(brush: Long, matrix: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetLineTransform(brush, matrix)

public actual fun GdipGetLineWrapMode(brush: Long, wrapmode: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetLineWrapMode(brush, wrapmode)

public actual fun GdipGetLogFontA(font: Long, graphics: Long, logfonta: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetLogFontA(font, graphics, logfonta)

public actual fun GdipGetLogFontW(font: Long, graphics: Long, logfontw: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetLogFontW(font, graphics, logfontw)

public actual fun GdipGetMatrixElements(matrix: Long, matrixout: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetMatrixElements(matrix, matrixout)

public actual fun GdipGetMetafileDownLevelRasterizationLimit(metafile: Long, metafilerasterizationlimitdpi: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileDownLevelRasterizationLimit(metafile, metafilerasterizationlimitdpi)

public actual fun GdipGetMetafileHeaderFromEmf(hemf: HENHMETAFILE, header: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromEmf(hemf, header)

public actual fun GdipGetMetafileHeaderFromFile(filename: PCWSTR, header: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromFile(filename, header)

public actual fun GdipGetMetafileHeaderFromMetafile(metafile: Long, header: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromMetafile(metafile, header)

public actual fun GdipGetMetafileHeaderFromStream(stream: Long, header: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromStream(stream, header)

public actual fun GdipGetMetafileHeaderFromWmf(hwmf: HMETAFILE, wmfplaceablefileheader: Long, header: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetMetafileHeaderFromWmf(hwmf, wmfplaceablefileheader, header)

public actual fun GdipGetNearestColor(graphics: Long, argb: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetNearestColor(graphics, argb)

public actual fun GdipGetPageScale(graphics: Long, scale: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPageScale(graphics, scale)

public actual fun GdipGetPageUnit(graphics: Long, unit: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPageUnit(graphics, unit)

public actual fun GdipGetPathData(path: Long, pathdata: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPathData(path, pathdata)

public actual fun GdipGetPathFillMode(path: Long, fillmode: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPathFillMode(path, fillmode)

public actual fun GdipGetPathGradientBlend(brush: Long, blend: Long, positions: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientBlend(brush, blend, positions, count)

public actual fun GdipGetPathGradientBlendCount(brush: Long, count: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientBlendCount(brush, count)

public actual fun GdipGetPathGradientCenterColor(brush: Long, colors: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientCenterColor(brush, colors)

public actual fun GdipGetPathGradientCenterPoint(brush: Long, points: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientCenterPoint(brush, points)

public actual fun GdipGetPathGradientCenterPointI(brush: Long, points: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientCenterPointI(brush, points)

public actual fun GdipGetPathGradientFocusScales(brush: Long, xscale: Long, yscale: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientFocusScales(brush, xscale, yscale)

public actual fun GdipGetPathGradientGammaCorrection(brush: Long, usegammacorrection: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientGammaCorrection(brush, usegammacorrection)

public actual fun GdipGetPathGradientPath(brush: Long, path: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientPath(brush, path)

public actual fun GdipGetPathGradientPointCount(brush: Long, count: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientPointCount(brush, count)

public actual fun GdipGetPathGradientPresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientPresetBlend(brush, blend, positions, count)

public actual fun GdipGetPathGradientPresetBlendCount(brush: Long, count: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientPresetBlendCount(brush, count)

public actual fun GdipGetPathGradientRect(brush: Long, rect: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientRect(brush, rect)

public actual fun GdipGetPathGradientRectI(brush: Long, rect: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientRectI(brush, rect)

public actual fun GdipGetPathGradientSurroundColorCount(brush: Long, count: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientSurroundColorCount(brush, count)

public actual fun GdipGetPathGradientSurroundColorsWithCount(brush: Long, color: Long, count: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientSurroundColorsWithCount(brush, color, count)

public actual fun GdipGetPathGradientTransform(brush: Long, matrix: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientTransform(brush, matrix)

public actual fun GdipGetPathGradientWrapMode(brush: Long, wrapmode: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPathGradientWrapMode(brush, wrapmode)

public actual fun GdipGetPathLastPoint(path: Long, lastpoint: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPathLastPoint(path, lastpoint)

public actual fun GdipGetPathPoints(param0: Long, points: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPathPoints(param0, points, count)

public actual fun GdipGetPathPointsI(param0: Long, points: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPathPointsI(param0, points, count)

public actual fun GdipGetPathTypes(path: Long, types: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPathTypes(path, types, count)

public actual fun GdipGetPathWorldBounds(path: Long, bounds: Long, matrix: Long, pen: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPathWorldBounds(path, bounds, matrix, pen)

public actual fun GdipGetPathWorldBoundsI(path: Long, bounds: Long, matrix: Long, pen: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPathWorldBoundsI(path, bounds, matrix, pen)

public actual fun GdipGetPenBrushFill(pen: Long, brush: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPenBrushFill(pen, brush)

public actual fun GdipGetPenColor(pen: Long, argb: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPenColor(pen, argb)

public actual fun GdipGetPenCompoundArray(pen: Long, dash: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPenCompoundArray(pen, dash, count)

public actual fun GdipGetPenCompoundCount(pen: Long, count: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPenCompoundCount(pen, count)

public actual fun GdipGetPenCustomEndCap(pen: Long, customcap: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPenCustomEndCap(pen, customcap)

public actual fun GdipGetPenCustomStartCap(pen: Long, customcap: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPenCustomStartCap(pen, customcap)

public actual fun GdipGetPenDashArray(pen: Long, dash: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashArray(pen, dash, count)

public actual fun GdipGetPenDashCap197819(pen: Long, dashcap: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashCap197819(pen, dashcap)

public actual fun GdipGetPenDashCount(pen: Long, count: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashCount(pen, count)

public actual fun GdipGetPenDashOffset(pen: Long, offset: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashOffset(pen, offset)

public actual fun GdipGetPenDashStyle(pen: Long, dashstyle: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPenDashStyle(pen, dashstyle)

public actual fun GdipGetPenEndCap(pen: Long, endcap: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPenEndCap(pen, endcap)

public actual fun GdipGetPenFillType(pen: Long, type: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPenFillType(pen, type)

public actual fun GdipGetPenLineJoin(pen: Long, linejoin: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPenLineJoin(pen, linejoin)

public actual fun GdipGetPenMiterLimit(pen: Long, miterlimit: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPenMiterLimit(pen, miterlimit)

public actual fun GdipGetPenMode(pen: Long, penmode: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPenMode(pen, penmode)

public actual fun GdipGetPenStartCap(pen: Long, startcap: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPenStartCap(pen, startcap)

public actual fun GdipGetPenTransform(pen: Long, matrix: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPenTransform(pen, matrix)

public actual fun GdipGetPenUnit(pen: Long, unit: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPenUnit(pen, unit)

public actual fun GdipGetPenWidth(pen: Long, width: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPenWidth(pen, width)

public actual fun GdipGetPixelOffsetMode(graphics: Long, pixeloffsetmode: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPixelOffsetMode(graphics, pixeloffsetmode)

public actual fun GdipGetPointCount(path: Long, count: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPointCount(path, count)

public actual fun GdipGetPropertyCount(image: Long, numofproperty: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPropertyCount(image, numofproperty)

public actual fun GdipGetPropertyIdList(image: Long, numofproperty: UInt, list: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPropertyIdList(image, numofproperty.toInt(), list)

public actual fun GdipGetPropertyItem(image: Long, propid: UInt, propsize: UInt, buffer: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPropertyItem(image, propid.toInt(), propsize.toInt(), buffer)

public actual fun GdipGetPropertyItemSize(image: Long, propid: UInt, size: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPropertyItemSize(image, propid.toInt(), size)

public actual fun GdipGetPropertySize(image: Long, totalbuffersize: Long, numproperties: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetPropertySize(image, totalbuffersize, numproperties)

public actual fun GdipGetRegionBounds(region: Long, graphics: Long, rect: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetRegionBounds(region, graphics, rect)

public actual fun GdipGetRegionBoundsI(region: Long, graphics: Long, rect: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetRegionBoundsI(region, graphics, rect)

public actual fun GdipGetRegionData(region: Long, buffer: Long, buffersize: UInt, sizefilled: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetRegionData(region, buffer, buffersize.toInt(), sizefilled)

public actual fun GdipGetRegionDataSize(region: Long, buffersize: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetRegionDataSize(region, buffersize)

public actual fun GdipGetRegionHRgn(region: Long, graphics: Long, hrgn: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetRegionHRgn(region, graphics, hrgn)

public actual fun GdipGetRegionScans(region: Long, rects: Long, count: Long, matrix: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetRegionScans(region, rects, count, matrix)

public actual fun GdipGetRegionScansCount(region: Long, count: Long, matrix: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetRegionScansCount(region, count, matrix)

public actual fun GdipGetRegionScansI(region: Long, rects: Long, count: Long, matrix: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetRegionScansI(region, rects, count, matrix)

public actual fun GdipGetRenderingOrigin(graphics: Long, x: Long, y: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetRenderingOrigin(graphics, x, y)

public actual fun GdipGetSmoothingMode(graphics: Long, smoothingmode: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetSmoothingMode(graphics, smoothingmode)

public actual fun GdipGetSolidFillColor(brush: Long, color: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetSolidFillColor(brush, color)

public actual fun GdipGetStringFormatAlign(format: Long, align: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatAlign(format, align)

public actual fun GdipGetStringFormatDigitSubstitution(format: Long, language: Long, substitute: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatDigitSubstitution(format, language, substitute)

public actual fun GdipGetStringFormatFlags(format: Long, flags: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatFlags(format, flags)

public actual fun GdipGetStringFormatHotkeyPrefix(format: Long, hotkeyprefix: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatHotkeyPrefix(format, hotkeyprefix)

public actual fun GdipGetStringFormatLineAlign(format: Long, align: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatLineAlign(format, align)

public actual fun GdipGetStringFormatMeasurableCharacterRangeCount(format: Long, count: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatMeasurableCharacterRangeCount(format, count)

public actual fun GdipGetStringFormatTabStopCount(format: Long, count: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatTabStopCount(format, count)

public actual fun GdipGetStringFormatTabStops(format: Long, count: Int, firsttaboffset: Long, tabstops: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatTabStops(format, count, firsttaboffset, tabstops)

public actual fun GdipGetStringFormatTrimming(format: Long, trimming: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetStringFormatTrimming(format, trimming)

public actual fun GdipGetTextContrast(graphics: Long, contrast: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetTextContrast(graphics, contrast)

public actual fun GdipGetTextRenderingHint(graphics: Long, mode: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetTextRenderingHint(graphics, mode)

public actual fun GdipGetTextureImage(brush: Long, image: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetTextureImage(brush, image)

public actual fun GdipGetTextureTransform(brush: Long, matrix: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetTextureTransform(brush, matrix)

public actual fun GdipGetTextureWrapMode(brush: Long, wrapmode: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetTextureWrapMode(brush, wrapmode)

public actual fun GdipGetVisibleClipBounds(graphics: Long, rect: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetVisibleClipBounds(graphics, rect)

public actual fun GdipGetVisibleClipBoundsI(graphics: Long, rect: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetVisibleClipBoundsI(graphics, rect)

public actual fun GdipGetWorldTransform(graphics: Long, matrix: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGetWorldTransform(graphics, matrix)

public actual fun GdipGraphicsClear(graphics: Long, color: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGraphicsClear(graphics, color.toInt())

public actual fun GdipGraphicsSetAbort(pgraphics: Long, piabort: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipGraphicsSetAbort(pgraphics, piabort)

public actual fun GdipImageForceValidation(image: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipImageForceValidation(image)

public actual fun GdipImageGetFrameCount(image: Long, dimensionid: Long, count: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipImageGetFrameCount(image, dimensionid, count)

public actual fun GdipImageGetFrameDimensionsCount(image: Long, count: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipImageGetFrameDimensionsCount(image, count)

public actual fun GdipImageGetFrameDimensionsList(image: Long, dimensionids: Long, count: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipImageGetFrameDimensionsList(image, dimensionids, count.toInt())

public actual fun GdipImageRotateFlip(image: Long, rftype: RotateFlipType): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipImageRotateFlip(image, rftype)

public actual fun GdipImageSelectActiveFrame(image: Long, dimensionid: Long, frameindex: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipImageSelectActiveFrame(image, dimensionid, frameindex.toInt())

public actual fun GdipImageSetAbort(pimage: Long, piabort: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipImageSetAbort(pimage, piabort)

public actual fun GdipInitializePalette(palette: Long, palettetype: PaletteType, optimalcolors: Int, usetransparentcolor: BOOL, bitmap: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipInitializePalette(palette, palettetype, optimalcolors, usetransparentcolor, bitmap)

public actual fun GdipInvertMatrix(matrix: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipInvertMatrix(matrix)

public actual fun GdipIsClipEmpty(graphics: Long, result: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipIsClipEmpty(graphics, result)

public actual fun GdipIsEmptyRegion(region: Long, graphics: Long, result: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipIsEmptyRegion(region, graphics, result)

public actual fun GdipIsEqualRegion(region: Long, region2: Long, graphics: Long, result: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipIsEqualRegion(region, region2, graphics, result)

public actual fun GdipIsInfiniteRegion(region: Long, graphics: Long, result: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipIsInfiniteRegion(region, graphics, result)

public actual fun GdipIsMatrixEqual(matrix: Long, matrix2: Long, result: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipIsMatrixEqual(matrix, matrix2, result)

public actual fun GdipIsMatrixIdentity(matrix: Long, result: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipIsMatrixIdentity(matrix, result)

public actual fun GdipIsMatrixInvertible(matrix: Long, result: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipIsMatrixInvertible(matrix, result)

public actual fun GdipIsOutlineVisiblePathPoint(path: Long, x: Float, y: Float, pen: Long, graphics: Long, result: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipIsOutlineVisiblePathPoint(path, x, y, pen, graphics, result)

public actual fun GdipIsOutlineVisiblePathPointI(path: Long, x: Int, y: Int, pen: Long, graphics: Long, result: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipIsOutlineVisiblePathPointI(path, x, y, pen, graphics, result)

public actual fun GdipIsStyleAvailable(family: Long, style: Int, isstyleavailable: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipIsStyleAvailable(family, style, isstyleavailable)

public actual fun GdipIsVisibleClipEmpty(graphics: Long, result: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleClipEmpty(graphics, result)

public actual fun GdipIsVisiblePathPoint(path: Long, x: Float, y: Float, graphics: Long, result: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipIsVisiblePathPoint(path, x, y, graphics, result)

public actual fun GdipIsVisiblePathPointI(path: Long, x: Int, y: Int, graphics: Long, result: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipIsVisiblePathPointI(path, x, y, graphics, result)

public actual fun GdipIsVisiblePoint(graphics: Long, x: Float, y: Float, result: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipIsVisiblePoint(graphics, x, y, result)

public actual fun GdipIsVisiblePointI(graphics: Long, x: Int, y: Int, result: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipIsVisiblePointI(graphics, x, y, result)

public actual fun GdipIsVisibleRect(graphics: Long, x: Float, y: Float, width: Float, height: Float, result: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRect(graphics, x, y, width, height, result)

public actual fun GdipIsVisibleRectI(graphics: Long, x: Int, y: Int, width: Int, height: Int, result: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRectI(graphics, x, y, width, height, result)

public actual fun GdipIsVisibleRegionPoint(region: Long, x: Float, y: Float, graphics: Long, result: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRegionPoint(region, x, y, graphics, result)

public actual fun GdipIsVisibleRegionPointI(region: Long, x: Int, y: Int, graphics: Long, result: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRegionPointI(region, x, y, graphics, result)

public actual fun GdipIsVisibleRegionRect(region: Long, x: Float, y: Float, width: Float, height: Float, graphics: Long, result: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRegionRect(region, x, y, width, height, graphics, result)

public actual fun GdipIsVisibleRegionRectI(region: Long, x: Int, y: Int, width: Int, height: Int, graphics: Long, result: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipIsVisibleRegionRectI(region, x, y, width, height, graphics, result)

public actual fun GdipLoadImageFromFile(filename: PCWSTR, image: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipLoadImageFromFile(filename, image)

public actual fun GdipLoadImageFromFileICM(filename: PCWSTR, image: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipLoadImageFromFileICM(filename, image)

public actual fun GdipLoadImageFromStream(stream: Long, image: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipLoadImageFromStream(stream, image)

public actual fun GdipLoadImageFromStreamICM(stream: Long, image: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipLoadImageFromStreamICM(stream, image)

public actual fun GdipMeasureCharacterRanges(graphics: Long, string: PCWSTR, length: Int, font: Long, layoutrect: Long, stringformat: Long, regioncount: Int, regions: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipMeasureCharacterRanges(graphics, string, length, font, layoutrect, stringformat, regioncount, regions)

public actual fun GdipMeasureDriverString(graphics: Long, text: Long, length: Int, font: Long, positions: Long, flags: Int, matrix: Long, boundingbox: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipMeasureDriverString(graphics, text, length, font, positions, flags, matrix, boundingbox)

public actual fun GdipMeasureString(graphics: Long, string: PCWSTR, length: Int, font: Long, layoutrect: Long, stringformat: Long, boundingbox: Long, codepointsfitted: Long, linesfilled: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipMeasureString(graphics, string, length, font, layoutrect, stringformat, boundingbox, codepointsfitted, linesfilled)

public actual fun GdipMultiplyLineTransform(brush: Long, matrix: Long, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipMultiplyLineTransform(brush, matrix, order)

public actual fun GdipMultiplyMatrix(matrix: Long, matrix2: Long, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipMultiplyMatrix(matrix, matrix2, order)

public actual fun GdipMultiplyPathGradientTransform(brush: Long, matrix: Long, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipMultiplyPathGradientTransform(brush, matrix, order)

public actual fun GdipMultiplyPenTransform(pen: Long, matrix: Long, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipMultiplyPenTransform(pen, matrix, order)

public actual fun GdipMultiplyTextureTransform(brush: Long, matrix: Long, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipMultiplyTextureTransform(brush, matrix, order)

public actual fun GdipMultiplyWorldTransform(graphics: Long, matrix: Long, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipMultiplyWorldTransform(graphics, matrix, order)

public actual fun GdipNewInstalledFontCollection(fontcollection: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipNewInstalledFontCollection(fontcollection)

public actual fun GdipNewPrivateFontCollection(fontcollection: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipNewPrivateFontCollection(fontcollection)

public actual fun GdipPathIterCopyData(iterator: Long, resultcount: Long, points: Long, types: Long, startindex: Int, endindex: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipPathIterCopyData(iterator, resultcount, points, types, startindex, endindex)

public actual fun GdipPathIterEnumerate(iterator: Long, resultcount: Long, points: Long, types: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipPathIterEnumerate(iterator, resultcount, points, types, count)

public actual fun GdipPathIterGetCount(iterator: Long, count: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipPathIterGetCount(iterator, count)

public actual fun GdipPathIterGetSubpathCount(iterator: Long, count: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipPathIterGetSubpathCount(iterator, count)

public actual fun GdipPathIterHasCurve(iterator: Long, hascurve: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipPathIterHasCurve(iterator, hascurve)

public actual fun GdipPathIterIsValid(iterator: Long, valid: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipPathIterIsValid(iterator, valid)

public actual fun GdipPathIterNextMarker(iterator: Long, resultcount: Long, startindex: Long, endindex: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextMarker(iterator, resultcount, startindex, endindex)

public actual fun GdipPathIterNextMarkerPath(iterator: Long, resultcount: Long, path: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextMarkerPath(iterator, resultcount, path)

public actual fun GdipPathIterNextPathType(iterator: Long, resultcount: Long, pathtype: Long, startindex: Long, endindex: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextPathType(iterator, resultcount, pathtype, startindex, endindex)

public actual fun GdipPathIterNextSubpath(iterator: Long, resultcount: Long, startindex: Long, endindex: Long, isclosed: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextSubpath(iterator, resultcount, startindex, endindex, isclosed)

public actual fun GdipPathIterNextSubpathPath(iterator: Long, resultcount: Long, path: Long, isclosed: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipPathIterNextSubpathPath(iterator, resultcount, path, isclosed)

public actual fun GdipPathIterRewind(iterator: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipPathIterRewind(iterator)

public actual fun GdipPlayMetafileRecord(metafile: Long, recordtype: EmfPlusRecordType, flags: UInt, datasize: UInt, data: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipPlayMetafileRecord(metafile, recordtype, flags.toInt(), datasize.toInt(), data)

public actual fun GdipPrivateAddFontFile(fontcollection: Long, filename: PCWSTR): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipPrivateAddFontFile(fontcollection, filename)

public actual fun GdipPrivateAddMemoryFont(fontcollection: Long, memory: Long, length: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipPrivateAddMemoryFont(fontcollection, memory, length)

public actual fun GdipRecordMetafile(referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafile(referencehdc, type, framerect, frameunit, description, metafile)

public actual fun GdipRecordMetafileFileName(filename: PCWSTR, referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileFileName(filename, referencehdc, type, framerect, frameunit, description, metafile)

public actual fun GdipRecordMetafileFileNameI(filename: PCWSTR, referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileFileNameI(filename, referencehdc, type, framerect, frameunit, description, metafile)

public actual fun GdipRecordMetafileI(referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileI(referencehdc, type, framerect, frameunit, description, metafile)

public actual fun GdipRecordMetafileStream(stream: Long, referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileStream(stream, referencehdc, type, framerect, frameunit, description, metafile)

public actual fun GdipRecordMetafileStreamI(stream: Long, referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipRecordMetafileStreamI(stream, referencehdc, type, framerect, frameunit, description, metafile)

public actual fun GdipReleaseDC(graphics: Long, hdc: HDC): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipReleaseDC(graphics, hdc)

public actual fun GdipRemovePropertyItem(image: Long, propid: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipRemovePropertyItem(image, propid.toInt())

public actual fun GdipResetClip(graphics: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipResetClip(graphics)

public actual fun GdipResetImageAttributes(imageattr: Long, type: ColorAdjustType): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipResetImageAttributes(imageattr, type)

public actual fun GdipResetLineTransform(brush: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipResetLineTransform(brush)

public actual fun GdipResetPageTransform(graphics: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipResetPageTransform(graphics)

public actual fun GdipResetPath(path: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipResetPath(path)

public actual fun GdipResetPathGradientTransform(brush: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipResetPathGradientTransform(brush)

public actual fun GdipResetPenTransform(pen: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipResetPenTransform(pen)

public actual fun GdipResetTextureTransform(brush: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipResetTextureTransform(brush)

public actual fun GdipResetWorldTransform(graphics: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipResetWorldTransform(graphics)

public actual fun GdipRestoreGraphics(graphics: Long, state: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipRestoreGraphics(graphics, state.toInt())

public actual fun GdipReversePath(path: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipReversePath(path)

public actual fun GdipRotateLineTransform(brush: Long, angle: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipRotateLineTransform(brush, angle, order)

public actual fun GdipRotateMatrix(matrix: Long, angle: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipRotateMatrix(matrix, angle, order)

public actual fun GdipRotatePathGradientTransform(brush: Long, angle: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipRotatePathGradientTransform(brush, angle, order)

public actual fun GdipRotatePenTransform(pen: Long, angle: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipRotatePenTransform(pen, angle, order)

public actual fun GdipRotateTextureTransform(brush: Long, angle: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipRotateTextureTransform(brush, angle, order)

public actual fun GdipRotateWorldTransform(graphics: Long, angle: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipRotateWorldTransform(graphics, angle, order)

public actual fun GdipSaveAdd(image: Long, encoderparams: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSaveAdd(image, encoderparams)

public actual fun GdipSaveAddImage(image: Long, newimage: Long, encoderparams: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSaveAddImage(image, newimage, encoderparams)

public actual fun GdipSaveGraphics(graphics: Long, state: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSaveGraphics(graphics, state)

public actual fun GdipSaveImageToFile(image: Long, filename: PCWSTR, clsidencoder: Long, encoderparams: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSaveImageToFile(image, filename, clsidencoder, encoderparams)

public actual fun GdipSaveImageToStream(image: Long, stream: Long, clsidencoder: Long, encoderparams: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSaveImageToStream(image, stream, clsidencoder, encoderparams)

public actual fun GdipScaleLineTransform(brush: Long, sx: Float, sy: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipScaleLineTransform(brush, sx, sy, order)

public actual fun GdipScaleMatrix(matrix: Long, scalex: Float, scaley: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipScaleMatrix(matrix, scalex, scaley, order)

public actual fun GdipScalePathGradientTransform(brush: Long, sx: Float, sy: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipScalePathGradientTransform(brush, sx, sy, order)

public actual fun GdipScalePenTransform(pen: Long, sx: Float, sy: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipScalePenTransform(pen, sx, sy, order)

public actual fun GdipScaleTextureTransform(brush: Long, sx: Float, sy: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipScaleTextureTransform(brush, sx, sy, order)

public actual fun GdipScaleWorldTransform(graphics: Long, sx: Float, sy: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipScaleWorldTransform(graphics, sx, sy, order)

public actual fun GdipSetAdjustableArrowCapFillState(cap: Long, fillstate: BOOL): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetAdjustableArrowCapFillState(cap, fillstate)

public actual fun GdipSetAdjustableArrowCapHeight(cap: Long, height: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetAdjustableArrowCapHeight(cap, height)

public actual fun GdipSetAdjustableArrowCapMiddleInset(cap: Long, middleinset: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetAdjustableArrowCapMiddleInset(cap, middleinset)

public actual fun GdipSetAdjustableArrowCapWidth(cap: Long, width: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetAdjustableArrowCapWidth(cap, width)

public actual fun GdipSetClipGraphics(graphics: Long, srcgraphics: Long, combinemode: CombineMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetClipGraphics(graphics, srcgraphics, combinemode)

public actual fun GdipSetClipHrgn(graphics: Long, hrgn: HRGN, combinemode: CombineMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetClipHrgn(graphics, hrgn, combinemode)

public actual fun GdipSetClipPath(graphics: Long, path: Long, combinemode: CombineMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetClipPath(graphics, path, combinemode)

public actual fun GdipSetClipRect(graphics: Long, x: Float, y: Float, width: Float, height: Float, combinemode: CombineMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetClipRect(graphics, x, y, width, height, combinemode)

public actual fun GdipSetClipRectI(graphics: Long, x: Int, y: Int, width: Int, height: Int, combinemode: CombineMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetClipRectI(graphics, x, y, width, height, combinemode)

public actual fun GdipSetClipRegion(graphics: Long, region: Long, combinemode: CombineMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetClipRegion(graphics, region, combinemode)

public actual fun GdipSetCompositingMode(graphics: Long, compositingmode: CompositingMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetCompositingMode(graphics, compositingmode)

public actual fun GdipSetCompositingQuality(graphics: Long, compositingquality: CompositingQuality): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetCompositingQuality(graphics, compositingquality)

public actual fun GdipSetCustomLineCapBaseCap(customcap: Long, basecap: LineCap): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapBaseCap(customcap, basecap)

public actual fun GdipSetCustomLineCapBaseInset(customcap: Long, inset: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapBaseInset(customcap, inset)

public actual fun GdipSetCustomLineCapStrokeCaps(customcap: Long, startcap: LineCap, endcap: LineCap): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapStrokeCaps(customcap, startcap, endcap)

public actual fun GdipSetCustomLineCapStrokeJoin(customcap: Long, linejoin: LineJoin): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapStrokeJoin(customcap, linejoin)

public actual fun GdipSetCustomLineCapWidthScale(customcap: Long, widthscale: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetCustomLineCapWidthScale(customcap, widthscale)

public actual fun GdipSetEffectParameters(effect: Long, params: Long, size: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetEffectParameters(effect, params, size.toInt())

public actual fun GdipSetEmpty(region: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetEmpty(region)

public actual fun GdipSetImageAttributesCachedBackground(imageattr: Long, enableflag: BOOL): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesCachedBackground(imageattr, enableflag)

public actual fun GdipSetImageAttributesColorKeys(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, colorlow: UInt, colorhigh: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesColorKeys(imageattr, type, enableflag, colorlow.toInt(), colorhigh.toInt())

public actual fun GdipSetImageAttributesColorMatrix(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, colormatrix: Long, graymatrix: Long, flags: ColorMatrixFlags): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesColorMatrix(imageattr, type, enableflag, colormatrix, graymatrix, flags)

public actual fun GdipSetImageAttributesGamma(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, gamma: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesGamma(imageattr, type, enableflag, gamma)

public actual fun GdipSetImageAttributesNoOp(imageattr: Long, type: ColorAdjustType, enableflag: BOOL): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesNoOp(imageattr, type, enableflag)

public actual fun GdipSetImageAttributesOutputChannel(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, channelflags: ColorChannelFlags): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesOutputChannel(imageattr, type, enableflag, channelflags)

public actual fun GdipSetImageAttributesOutputChannelColorProfile(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, colorprofilefilename: PCWSTR): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesOutputChannelColorProfile(imageattr, type, enableflag, colorprofilefilename)

public actual fun GdipSetImageAttributesRemapTable(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, mapsize: UInt, map: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesRemapTable(imageattr, type, enableflag, mapsize.toInt(), map)

public actual fun GdipSetImageAttributesThreshold(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, threshold: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesThreshold(imageattr, type, enableflag, threshold)

public actual fun GdipSetImageAttributesToIdentity(imageattr: Long, type: ColorAdjustType): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesToIdentity(imageattr, type)

public actual fun GdipSetImageAttributesWrapMode(imageattr: Long, wrap: WrapMode, argb: UInt, clamp: BOOL): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetImageAttributesWrapMode(imageattr, wrap, argb.toInt(), clamp)

public actual fun GdipSetImagePalette(image: Long, palette: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetImagePalette(image, palette)

public actual fun GdipSetInfinite(region: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetInfinite(region)

public actual fun GdipSetInterpolationMode(graphics: Long, interpolationmode: InterpolationMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetInterpolationMode(graphics, interpolationmode)

public actual fun GdipSetLineBlend(brush: Long, blend: Long, positions: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetLineBlend(brush, blend, positions, count)

public actual fun GdipSetLineColors(brush: Long, color1: UInt, color2: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetLineColors(brush, color1.toInt(), color2.toInt())

public actual fun GdipSetLineGammaCorrection(brush: Long, usegammacorrection: BOOL): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetLineGammaCorrection(brush, usegammacorrection)

public actual fun GdipSetLineLinearBlend(brush: Long, focus: Float, scale: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetLineLinearBlend(brush, focus, scale)

public actual fun GdipSetLinePresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetLinePresetBlend(brush, blend, positions, count)

public actual fun GdipSetLineSigmaBlend(brush: Long, focus: Float, scale: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetLineSigmaBlend(brush, focus, scale)

public actual fun GdipSetLineTransform(brush: Long, matrix: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetLineTransform(brush, matrix)

public actual fun GdipSetLineWrapMode(brush: Long, wrapmode: WrapMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetLineWrapMode(brush, wrapmode)

public actual fun GdipSetMatrixElements(matrix: Long, m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetMatrixElements(matrix, m11, m12, m21, m22, dx, dy)

public actual fun GdipSetMetafileDownLevelRasterizationLimit(metafile: Long, metafilerasterizationlimitdpi: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetMetafileDownLevelRasterizationLimit(metafile, metafilerasterizationlimitdpi.toInt())

public actual fun GdipSetPageScale(graphics: Long, scale: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPageScale(graphics, scale)

public actual fun GdipSetPageUnit(graphics: Long, unit: Unit): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPageUnit(graphics, unit)

public actual fun GdipSetPathFillMode(path: Long, fillmode: FillMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPathFillMode(path, fillmode)

public actual fun GdipSetPathGradientBlend(brush: Long, blend: Long, positions: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientBlend(brush, blend, positions, count)

public actual fun GdipSetPathGradientCenterColor(brush: Long, colors: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientCenterColor(brush, colors.toInt())

public actual fun GdipSetPathGradientCenterPoint(brush: Long, points: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientCenterPoint(brush, points)

public actual fun GdipSetPathGradientCenterPointI(brush: Long, points: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientCenterPointI(brush, points)

public actual fun GdipSetPathGradientFocusScales(brush: Long, xscale: Float, yscale: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientFocusScales(brush, xscale, yscale)

public actual fun GdipSetPathGradientGammaCorrection(brush: Long, usegammacorrection: BOOL): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientGammaCorrection(brush, usegammacorrection)

public actual fun GdipSetPathGradientLinearBlend(brush: Long, focus: Float, scale: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientLinearBlend(brush, focus, scale)

public actual fun GdipSetPathGradientPath(brush: Long, path: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientPath(brush, path)

public actual fun GdipSetPathGradientPresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientPresetBlend(brush, blend, positions, count)

public actual fun GdipSetPathGradientSigmaBlend(brush: Long, focus: Float, scale: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientSigmaBlend(brush, focus, scale)

public actual fun GdipSetPathGradientSurroundColorsWithCount(brush: Long, color: Long, count: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientSurroundColorsWithCount(brush, color, count)

public actual fun GdipSetPathGradientTransform(brush: Long, matrix: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientTransform(brush, matrix)

public actual fun GdipSetPathGradientWrapMode(brush: Long, wrapmode: WrapMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPathGradientWrapMode(brush, wrapmode)

public actual fun GdipSetPathMarker(path: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPathMarker(path)

public actual fun GdipSetPenBrushFill(pen: Long, brush: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPenBrushFill(pen, brush)

public actual fun GdipSetPenColor(pen: Long, argb: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPenColor(pen, argb.toInt())

public actual fun GdipSetPenCompoundArray(pen: Long, dash: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPenCompoundArray(pen, dash, count)

public actual fun GdipSetPenCustomEndCap(pen: Long, customcap: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPenCustomEndCap(pen, customcap)

public actual fun GdipSetPenCustomStartCap(pen: Long, customcap: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPenCustomStartCap(pen, customcap)

public actual fun GdipSetPenDashArray(pen: Long, dash: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPenDashArray(pen, dash, count)

public actual fun GdipSetPenDashCap197819(pen: Long, dashcap: DashCap): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPenDashCap197819(pen, dashcap)

public actual fun GdipSetPenDashOffset(pen: Long, offset: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPenDashOffset(pen, offset)

public actual fun GdipSetPenDashStyle(pen: Long, dashstyle: DashStyle): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPenDashStyle(pen, dashstyle)

public actual fun GdipSetPenEndCap(pen: Long, endcap: LineCap): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPenEndCap(pen, endcap)

public actual fun GdipSetPenLineCap197819(pen: Long, startcap: LineCap, endcap: LineCap, dashcap: DashCap): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPenLineCap197819(pen, startcap, endcap, dashcap)

public actual fun GdipSetPenLineJoin(pen: Long, linejoin: LineJoin): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPenLineJoin(pen, linejoin)

public actual fun GdipSetPenMiterLimit(pen: Long, miterlimit: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPenMiterLimit(pen, miterlimit)

public actual fun GdipSetPenMode(pen: Long, penmode: PenAlignment): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPenMode(pen, penmode)

public actual fun GdipSetPenStartCap(pen: Long, startcap: LineCap): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPenStartCap(pen, startcap)

public actual fun GdipSetPenTransform(pen: Long, matrix: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPenTransform(pen, matrix)

public actual fun GdipSetPenUnit(pen: Long, unit: Unit): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPenUnit(pen, unit)

public actual fun GdipSetPenWidth(pen: Long, width: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPenWidth(pen, width)

public actual fun GdipSetPixelOffsetMode(graphics: Long, pixeloffsetmode: PixelOffsetMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPixelOffsetMode(graphics, pixeloffsetmode)

public actual fun GdipSetPropertyItem(image: Long, item: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetPropertyItem(image, item)

public actual fun GdipSetRenderingOrigin(graphics: Long, x: Int, y: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetRenderingOrigin(graphics, x, y)

public actual fun GdipSetSmoothingMode(graphics: Long, smoothingmode: SmoothingMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetSmoothingMode(graphics, smoothingmode)

public actual fun GdipSetSolidFillColor(brush: Long, color: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetSolidFillColor(brush, color.toInt())

public actual fun GdipSetStringFormatAlign(format: Long, align: StringAlignment): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatAlign(format, align)

public actual fun GdipSetStringFormatDigitSubstitution(format: Long, language: UShort, substitute: StringDigitSubstitute): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatDigitSubstitution(format, language.toShort(), substitute)

public actual fun GdipSetStringFormatFlags(format: Long, flags: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatFlags(format, flags)

public actual fun GdipSetStringFormatHotkeyPrefix(format: Long, hotkeyprefix: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatHotkeyPrefix(format, hotkeyprefix)

public actual fun GdipSetStringFormatLineAlign(format: Long, align: StringAlignment): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatLineAlign(format, align)

public actual fun GdipSetStringFormatMeasurableCharacterRanges(format: Long, rangecount: Int, ranges: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatMeasurableCharacterRanges(format, rangecount, ranges)

public actual fun GdipSetStringFormatTabStops(format: Long, firsttaboffset: Float, count: Int, tabstops: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatTabStops(format, firsttaboffset, count, tabstops)

public actual fun GdipSetStringFormatTrimming(format: Long, trimming: StringTrimming): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetStringFormatTrimming(format, trimming)

public actual fun GdipSetTextContrast(graphics: Long, contrast: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetTextContrast(graphics, contrast.toInt())

public actual fun GdipSetTextRenderingHint(graphics: Long, mode: TextRenderingHint): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetTextRenderingHint(graphics, mode)

public actual fun GdipSetTextureTransform(brush: Long, matrix: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetTextureTransform(brush, matrix)

public actual fun GdipSetTextureWrapMode(brush: Long, wrapmode: WrapMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetTextureWrapMode(brush, wrapmode)

public actual fun GdipSetWorldTransform(graphics: Long, matrix: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipSetWorldTransform(graphics, matrix)

public actual fun GdipShearMatrix(matrix: Long, shearx: Float, sheary: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipShearMatrix(matrix, shearx, sheary, order)

public actual fun GdipStartPathFigure(path: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipStartPathFigure(path)

public actual fun GdipStringFormatGetGenericDefault(format: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipStringFormatGetGenericDefault(format)

public actual fun GdipStringFormatGetGenericTypographic(format: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipStringFormatGetGenericTypographic(format)

public actual fun GdipTestControl(control: GpTestControlEnum, param1: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipTestControl(control, param1)

public actual fun GdipTransformMatrixPoints(matrix: Long, pts: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipTransformMatrixPoints(matrix, pts, count)

public actual fun GdipTransformMatrixPointsI(matrix: Long, pts: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipTransformMatrixPointsI(matrix, pts, count)

public actual fun GdipTransformPath(path: Long, matrix: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipTransformPath(path, matrix)

public actual fun GdipTransformPoints(graphics: Long, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipTransformPoints(graphics, destspace, srcspace, points, count)

public actual fun GdipTransformPointsI(graphics: Long, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipTransformPointsI(graphics, destspace, srcspace, points, count)

public actual fun GdipTransformRegion(region: Long, matrix: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipTransformRegion(region, matrix)

public actual fun GdipTranslateClip(graphics: Long, dx: Float, dy: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipTranslateClip(graphics, dx, dy)

public actual fun GdipTranslateClipI(graphics: Long, dx: Int, dy: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipTranslateClipI(graphics, dx, dy)

public actual fun GdipTranslateLineTransform(brush: Long, dx: Float, dy: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipTranslateLineTransform(brush, dx, dy, order)

public actual fun GdipTranslateMatrix(matrix: Long, offsetx: Float, offsety: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipTranslateMatrix(matrix, offsetx, offsety, order)

public actual fun GdipTranslatePathGradientTransform(brush: Long, dx: Float, dy: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipTranslatePathGradientTransform(brush, dx, dy, order)

public actual fun GdipTranslatePenTransform(pen: Long, dx: Float, dy: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipTranslatePenTransform(pen, dx, dy, order)

public actual fun GdipTranslateRegion(region: Long, dx: Float, dy: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipTranslateRegion(region, dx, dy)

public actual fun GdipTranslateRegionI(region: Long, dx: Int, dy: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipTranslateRegionI(region, dx, dy)

public actual fun GdipTranslateTextureTransform(brush: Long, dx: Float, dy: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipTranslateTextureTransform(brush, dx, dy, order)

public actual fun GdipTranslateWorldTransform(graphics: Long, dx: Float, dy: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipTranslateWorldTransform(graphics, dx, dy, order)

public actual fun GdipVectorTransformMatrixPoints(matrix: Long, pts: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipVectorTransformMatrixPoints(matrix, pts, count)

public actual fun GdipVectorTransformMatrixPointsI(matrix: Long, pts: Long, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipVectorTransformMatrixPointsI(matrix, pts, count)

public actual fun GdipWarpPath(path: Long, matrix: Long, points: Long, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, warpmode: WarpMode, flatness: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipWarpPath(path, matrix, points, count, srcx, srcy, srcwidth, srcheight, warpmode, flatness)

public actual fun GdipWidenPath(nativepath: Long, pen: Long, matrix: Long, flatness: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipWidenPath(nativepath, pen, matrix, flatness)

public actual fun GdipWindingModeOutline(path: Long, matrix: Long, flatness: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdipWindingModeOutline(path, matrix, flatness)

public actual fun GdiplusNotificationHook(token: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdiplusNotificationHook(token)

public actual fun GdiplusNotificationUnhook(token: ULong) {
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdiplusNotificationUnhook(token.toLong())
}

public actual fun GdiplusShutdown(token: ULong) {
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdiplusShutdown(token.toLong())
}

public actual fun GdiplusStartup(token: Long, input: Long, output: Long): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_GdiplusStartup(token, input, output)
