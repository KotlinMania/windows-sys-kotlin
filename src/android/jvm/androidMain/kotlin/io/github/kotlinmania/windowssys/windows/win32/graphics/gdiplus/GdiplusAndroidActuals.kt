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

private object WindowsWin32GraphicsGdiplusJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAddPathArc(path: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAddPathArcI(path: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAddPathBezier(path: Long, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAddPathBezierI(path: Long, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAddPathBeziers(path: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAddPathBeziersI(path: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAddPathClosedCurve(path: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAddPathClosedCurve2(path: Long, points: Long, count: Int, tension: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAddPathClosedCurve2I(path: Long, points: Long, count: Int, tension: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAddPathClosedCurveI(path: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAddPathCurve(path: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAddPathCurve2(path: Long, points: Long, count: Int, tension: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAddPathCurve2I(path: Long, points: Long, count: Int, tension: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAddPathCurve3(path: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAddPathCurve3I(path: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAddPathCurveI(path: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAddPathEllipse(path: Long, x: Float, y: Float, width: Float, height: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAddPathEllipseI(path: Long, x: Int, y: Int, width: Int, height: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAddPathLine(path: Long, x1: Float, y1: Float, x2: Float, y2: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAddPathLine2(path: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAddPathLine2I(path: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAddPathLineI(path: Long, x1: Int, y1: Int, x2: Int, y2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAddPathPath(path: Long, addingpath: Long, connect: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAddPathPie(path: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAddPathPieI(path: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAddPathPolygon(path: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAddPathPolygonI(path: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAddPathRectangle(path: Long, x: Float, y: Float, width: Float, height: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAddPathRectangleI(path: Long, x: Int, y: Int, width: Int, height: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAddPathRectangles(path: Long, rects: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAddPathRectanglesI(path: Long, rects: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAddPathString(path: Long, string: Long, length: Int, family: Long, style: Int, emsize: Float, layoutrect: Long, format: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAddPathStringI(path: Long, string: Long, length: Int, family: Long, style: Int, emsize: Float, layoutrect: Long, format: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipAlloc(size: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipBeginContainer(graphics: Long, dstrect: Long, srcrect: Long, unit: Int, state: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipBeginContainer2(graphics: Long, state: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipBeginContainerI(graphics: Long, dstrect: Long, srcrect: Long, unit: Int, state: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipBitmapApplyEffect(bitmap: Long, effect: Long, roi: Long, useauxdata: Int, auxdata: Long, auxdatasize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipBitmapConvertFormat(pinputbitmap: Long, format: Int, dithertype: Int, palettetype: Int, palette: Long, alphathresholdpercent: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipBitmapCreateApplyEffect(inputbitmaps: Long, numinputs: Int, effect: Long, roi: Long, outputrect: Long, outputbitmap: Long, useauxdata: Int, auxdata: Long, auxdatasize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipBitmapGetHistogram(bitmap: Long, format: Int, numberofentries: Int, channel0: Long, channel1: Long, channel2: Long, channel3: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipBitmapGetHistogramSize(format: Int, numberofentries: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipBitmapGetPixel(bitmap: Long, x: Int, y: Int, color: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipBitmapLockBits(bitmap: Long, rect: Long, flags: Int, format: Int, lockedbitmapdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipBitmapSetPixel(bitmap: Long, x: Int, y: Int, color: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipBitmapSetResolution(bitmap: Long, xdpi: Float, ydpi: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipBitmapUnlockBits(bitmap: Long, lockedbitmapdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipClearPathMarkers(path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCloneBitmapArea(x: Float, y: Float, width: Float, height: Float, format: Int, srcbitmap: Long, dstbitmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCloneBitmapAreaI(x: Int, y: Int, width: Int, height: Int, format: Int, srcbitmap: Long, dstbitmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCloneBrush(brush: Long, clonebrush: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCloneCustomLineCap(customcap: Long, clonedcap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCloneFont(font: Long, clonefont: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCloneFontFamily(fontfamily: Long, clonedfontfamily: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCloneImage(image: Long, cloneimage: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCloneImageAttributes(imageattr: Long, cloneimageattr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCloneMatrix(matrix: Long, clonematrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipClonePath(path: Long, clonepath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipClonePen(pen: Long, clonepen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCloneRegion(region: Long, cloneregion: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCloneStringFormat(format: Long, newformat: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipClosePathFigure(path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipClosePathFigures(path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCombineRegionPath(region: Long, path: Long, combinemode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCombineRegionRect(region: Long, rect: Long, combinemode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCombineRegionRectI(region: Long, rect: Long, combinemode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCombineRegionRegion(region: Long, region2: Long, combinemode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipComment(graphics: Long, sizedata: Int, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipConvertToEmfPlus(refgraphics: Long, metafile: Long, conversionfailureflag: Long, emftype: Int, description: Long, outMetafile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipConvertToEmfPlusToFile(refgraphics: Long, metafile: Long, conversionfailureflag: Long, filename: Long, emftype: Int, description: Long, outMetafile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipConvertToEmfPlusToStream(refgraphics: Long, metafile: Long, conversionfailureflag: Long, stream: Long, emftype: Int, description: Long, outMetafile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateAdjustableArrowCap(height: Float, width: Float, isfilled: Int, cap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateBitmapFromFile(filename: Long, bitmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateBitmapFromFileICM(filename: Long, bitmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateBitmapFromGdiDib(gdibitmapinfo: Long, gdibitmapdata: Long, bitmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateBitmapFromGraphics(width: Int, height: Int, target: Long, bitmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateBitmapFromHBITMAP(hbm: Long, hpal: Long, bitmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateBitmapFromHICON(hicon: Long, bitmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateBitmapFromResource(hinstance: Long, lpbitmapname: Long, bitmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateBitmapFromScan0(width: Int, height: Int, stride: Int, format: Int, scan0: Long, bitmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateBitmapFromStream(stream: Long, bitmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateBitmapFromStreamICM(stream: Long, bitmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateCachedBitmap(bitmap: Long, graphics: Long, cachedbitmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateCustomLineCap(fillpath: Long, strokepath: Long, basecap: Int, baseinset: Float, customcap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateFont(fontfamily: Long, emsize: Float, style: Int, unit: Int, font: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateFontFamilyFromName(name: Long, fontcollection: Long, fontfamily: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateFontFromDC(hdc: Long, font: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateFontFromLogfontA(hdc: Long, logfont: Long, font: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateFontFromLogfontW(hdc: Long, logfont: Long, font: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateFromHDC(hdc: Long, graphics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateFromHDC2(hdc: Long, hdevice: Long, graphics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateFromHWND(hwnd: Long, graphics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateFromHWNDICM(hwnd: Long, graphics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateHBITMAPFromBitmap(bitmap: Long, hbmreturn: Long, background: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateHICONFromBitmap(bitmap: Long, hbmreturn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateHalftonePalette(): Long

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateHatchBrush(hatchstyle: Int, forecol: Int, backcol: Int, brush: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateImageAttributes(imageattr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateLineBrush(point1: Long, point2: Long, color1: Int, color2: Int, wrapmode: Int, linegradient: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateLineBrushFromRect(rect: Long, color1: Int, color2: Int, mode: Int, wrapmode: Int, linegradient: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateLineBrushFromRectI(rect: Long, color1: Int, color2: Int, mode: Int, wrapmode: Int, linegradient: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateLineBrushFromRectWithAngle(rect: Long, color1: Int, color2: Int, angle: Float, isanglescalable: Int, wrapmode: Int, linegradient: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateLineBrushFromRectWithAngleI(rect: Long, color1: Int, color2: Int, angle: Float, isanglescalable: Int, wrapmode: Int, linegradient: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateLineBrushI(point1: Long, point2: Long, color1: Int, color2: Int, wrapmode: Int, linegradient: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateMatrix(matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateMatrix2(m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateMatrix3(rect: Long, dstplg: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateMatrix3I(rect: Long, dstplg: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateMetafileFromEmf(hemf: Long, deleteemf: Int, metafile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateMetafileFromFile(file: Long, metafile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateMetafileFromStream(stream: Long, metafile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateMetafileFromWmf(hwmf: Long, deletewmf: Int, wmfplaceablefileheader: Long, metafile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateMetafileFromWmfFile(file: Long, wmfplaceablefileheader: Long, metafile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreatePath(brushmode: Int, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreatePath2(param0: Long, param1: Long, param2: Int, param3: Int, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreatePath2I(param0: Long, param1: Long, param2: Int, param3: Int, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreatePathGradient(points: Long, count: Int, wrapmode: Int, polygradient: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreatePathGradientFromPath(path: Long, polygradient: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreatePathGradientI(points: Long, count: Int, wrapmode: Int, polygradient: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreatePathIter(iterator: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreatePen1(color: Int, width: Float, unit: Int, pen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreatePen2(brush: Long, width: Float, unit: Int, pen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateRegion(region: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateRegionHrgn(hrgn: Long, region: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateRegionPath(path: Long, region: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateRegionRect(rect: Long, region: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateRegionRectI(rect: Long, region: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateRegionRgnData(regiondata: Long, size: Int, region: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateSolidFill(color: Int, brush: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateStreamOnFile(filename: Long, access: Int, stream: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateStringFormat(formatattributes: Int, language: Short, format: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateTexture(image: Long, wrapmode: Int, texture: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateTexture2(image: Long, wrapmode: Int, x: Float, y: Float, width: Float, height: Float, texture: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateTexture2I(image: Long, wrapmode: Int, x: Int, y: Int, width: Int, height: Int, texture: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateTextureIA(image: Long, imageattributes: Long, x: Float, y: Float, width: Float, height: Float, texture: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipCreateTextureIAI(image: Long, imageattributes: Long, x: Int, y: Int, width: Int, height: Int, texture: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDeleteBrush(brush: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDeleteCachedBitmap(cachedbitmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDeleteCustomLineCap(customcap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDeleteEffect(effect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDeleteFont(font: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDeleteFontFamily(fontfamily: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDeleteGraphics(graphics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDeleteMatrix(matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDeletePath(path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDeletePathIter(iterator: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDeletePen(pen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDeletePrivateFontCollection(fontcollection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDeleteRegion(region: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDeleteStringFormat(format: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDisposeImage(image: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDisposeImageAttributes(imageattr: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawArc(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawArcI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawBezier(graphics: Long, pen: Long, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawBezierI(graphics: Long, pen: Long, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawBeziers(graphics: Long, pen: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawBeziersI(graphics: Long, pen: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawCachedBitmap(graphics: Long, cachedbitmap: Long, x: Int, y: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawClosedCurve(graphics: Long, pen: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawClosedCurve2(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawClosedCurve2I(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawClosedCurveI(graphics: Long, pen: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawCurve(graphics: Long, pen: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawCurve2(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawCurve2I(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawCurve3(graphics: Long, pen: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawCurve3I(graphics: Long, pen: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawCurveI(graphics: Long, pen: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawDriverString(graphics: Long, text: Long, length: Int, font: Long, brush: Long, positions: Long, flags: Int, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawEllipse(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawEllipseI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawImage(graphics: Long, image: Long, x: Float, y: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawImageFX(graphics: Long, image: Long, source: Long, xform: Long, effect: Long, imageattributes: Long, srcunit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawImageI(graphics: Long, image: Long, x: Int, y: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawImagePointRect(graphics: Long, image: Long, x: Float, y: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawImagePointRectI(graphics: Long, image: Long, x: Int, y: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawImagePoints(graphics: Long, image: Long, dstpoints: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawImagePointsI(graphics: Long, image: Long, dstpoints: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawImagePointsRect(graphics: Long, image: Long, points: Long, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Int, imageattributes: Long, callback: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawImagePointsRectI(graphics: Long, image: Long, points: Long, count: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Int, imageattributes: Long, callback: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawImageRect(graphics: Long, image: Long, x: Float, y: Float, width: Float, height: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawImageRectI(graphics: Long, image: Long, x: Int, y: Int, width: Int, height: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawImageRectRect(graphics: Long, image: Long, dstx: Float, dsty: Float, dstwidth: Float, dstheight: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Int, imageattributes: Long, callback: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawImageRectRectI(graphics: Long, image: Long, dstx: Int, dsty: Int, dstwidth: Int, dstheight: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Int, imageattributes: Long, callback: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawLine(graphics: Long, pen: Long, x1: Float, y1: Float, x2: Float, y2: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawLineI(graphics: Long, pen: Long, x1: Int, y1: Int, x2: Int, y2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawLines(graphics: Long, pen: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawLinesI(graphics: Long, pen: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawPath(graphics: Long, pen: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawPie(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawPieI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawPolygon(graphics: Long, pen: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawPolygonI(graphics: Long, pen: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawRectangle(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawRectangleI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawRectangles(graphics: Long, pen: Long, rects: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawRectanglesI(graphics: Long, pen: Long, rects: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipDrawString(graphics: Long, string: Long, length: Int, font: Long, layoutrect: Long, stringformat: Long, brush: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipEmfToWmfBits(hemf: Long, cbdata16: Int, pdata16: Long, imapmode: Int, eflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipEndContainer(graphics: Long, state: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileDestPoint(graphics: Long, metafile: Long, destpoint: Long, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileDestPointI(graphics: Long, metafile: Long, destpoint: Long, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileDestPoints(graphics: Long, metafile: Long, destpoints: Long, count: Int, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileDestPointsI(graphics: Long, metafile: Long, destpoints: Long, count: Int, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileDestRect(graphics: Long, metafile: Long, destrect: Long, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileDestRectI(graphics: Long, metafile: Long, destrect: Long, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileSrcRectDestPoint(graphics: Long, metafile: Long, destpoint: Long, srcrect: Long, srcunit: Int, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileSrcRectDestPointI(graphics: Long, metafile: Long, destpoint: Long, srcrect: Long, srcunit: Int, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileSrcRectDestPoints(graphics: Long, metafile: Long, destpoints: Long, count: Int, srcrect: Long, srcunit: Int, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileSrcRectDestPointsI(graphics: Long, metafile: Long, destpoints: Long, count: Int, srcrect: Long, srcunit: Int, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileSrcRectDestRect(graphics: Long, metafile: Long, destrect: Long, srcrect: Long, srcunit: Int, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileSrcRectDestRectI(graphics: Long, metafile: Long, destrect: Long, srcrect: Long, srcunit: Int, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipFillClosedCurve(graphics: Long, brush: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipFillClosedCurve2(graphics: Long, brush: Long, points: Long, count: Int, tension: Float, fillmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipFillClosedCurve2I(graphics: Long, brush: Long, points: Long, count: Int, tension: Float, fillmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipFillClosedCurveI(graphics: Long, brush: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipFillEllipse(graphics: Long, brush: Long, x: Float, y: Float, width: Float, height: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipFillEllipseI(graphics: Long, brush: Long, x: Int, y: Int, width: Int, height: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipFillPath(graphics: Long, brush: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipFillPie(graphics: Long, brush: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipFillPieI(graphics: Long, brush: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipFillPolygon(graphics: Long, brush: Long, points: Long, count: Int, fillmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipFillPolygon2(graphics: Long, brush: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipFillPolygon2I(graphics: Long, brush: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipFillPolygonI(graphics: Long, brush: Long, points: Long, count: Int, fillmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipFillRectangle(graphics: Long, brush: Long, x: Float, y: Float, width: Float, height: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipFillRectangleI(graphics: Long, brush: Long, x: Int, y: Int, width: Int, height: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipFillRectangles(graphics: Long, brush: Long, rects: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipFillRectanglesI(graphics: Long, brush: Long, rects: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipFillRegion(graphics: Long, brush: Long, region: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipFindFirstImageItem(image: Long, item: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipFindNextImageItem(image: Long, item: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipFlattenPath(path: Long, matrix: Long, flatness: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipFlush(graphics: Long, intention: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipFree(ptr: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetAdjustableArrowCapFillState(cap: Long, fillstate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetAdjustableArrowCapHeight(cap: Long, height: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetAdjustableArrowCapMiddleInset(cap: Long, middleinset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetAdjustableArrowCapWidth(cap: Long, width: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetAllPropertyItems(image: Long, totalbuffersize: Int, numproperties: Int, allitems: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetBrushType(brush: Long, type: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetCellAscent(family: Long, style: Int, cellascent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetCellDescent(family: Long, style: Int, celldescent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetClip(graphics: Long, region: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetClipBounds(graphics: Long, rect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetClipBoundsI(graphics: Long, rect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetCompositingMode(graphics: Long, compositingmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetCompositingQuality(graphics: Long, compositingquality: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetCustomLineCapBaseCap(customcap: Long, basecap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetCustomLineCapBaseInset(customcap: Long, inset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetCustomLineCapStrokeCaps(customcap: Long, startcap: Long, endcap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetCustomLineCapStrokeJoin(customcap: Long, linejoin: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetCustomLineCapType(customcap: Long, captype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetCustomLineCapWidthScale(customcap: Long, widthscale: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetDC(graphics: Long, hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetDpiX(graphics: Long, dpi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetDpiY(graphics: Long, dpi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetEffectParameterSize(effect: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetEffectParameters(effect: Long, size: Long, params: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetEmHeight(family: Long, style: Int, emheight: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetEncoderParameterList(image: Long, clsidencoder: Long, size: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetEncoderParameterListSize(image: Long, clsidencoder: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetFamily(font: Long, family: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetFamilyName(family: Long, name: Long, language: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetFontCollectionFamilyCount(fontcollection: Long, numfound: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetFontCollectionFamilyList(fontcollection: Long, numsought: Int, gpfamilies: Long, numfound: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetFontHeight(font: Long, graphics: Long, height: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetFontHeightGivenDPI(font: Long, dpi: Float, height: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetFontSize(font: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetFontStyle(font: Long, style: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetFontUnit(font: Long, unit: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetGenericFontFamilyMonospace(nativefamily: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetGenericFontFamilySansSerif(nativefamily: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetGenericFontFamilySerif(nativefamily: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetHatchBackgroundColor(brush: Long, backcol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetHatchForegroundColor(brush: Long, forecol: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetHatchStyle(brush: Long, hatchstyle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetHemfFromMetafile(metafile: Long, hemf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetImageAttributesAdjustedPalette(imageattr: Long, colorpalette: Long, coloradjusttype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetImageBounds(image: Long, srcrect: Long, srcunit: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetImageDecoders(numdecoders: Int, size: Int, decoders: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetImageDecodersSize(numdecoders: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetImageDimension(image: Long, width: Long, height: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetImageEncoders(numencoders: Int, size: Int, encoders: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetImageEncodersSize(numencoders: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetImageFlags(image: Long, flags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetImageGraphicsContext(image: Long, graphics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetImageHeight(image: Long, height: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetImageHorizontalResolution(image: Long, resolution: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetImageItemData(image: Long, item: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetImagePalette(image: Long, palette: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetImagePaletteSize(image: Long, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetImagePixelFormat(image: Long, format: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetImageRawFormat(image: Long, format: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetImageThumbnail(image: Long, thumbwidth: Int, thumbheight: Int, thumbimage: Long, callback: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetImageType(image: Long, type: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetImageVerticalResolution(image: Long, resolution: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetImageWidth(image: Long, width: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetInterpolationMode(graphics: Long, interpolationmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetLineBlend(brush: Long, blend: Long, positions: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetLineBlendCount(brush: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetLineColors(brush: Long, colors: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetLineGammaCorrection(brush: Long, usegammacorrection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetLinePresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetLinePresetBlendCount(brush: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetLineRect(brush: Long, rect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetLineRectI(brush: Long, rect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetLineSpacing(family: Long, style: Int, linespacing: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetLineTransform(brush: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetLineWrapMode(brush: Long, wrapmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetLogFontA(font: Long, graphics: Long, logfonta: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetLogFontW(font: Long, graphics: Long, logfontw: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetMatrixElements(matrix: Long, matrixout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetMetafileDownLevelRasterizationLimit(metafile: Long, metafilerasterizationlimitdpi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetMetafileHeaderFromEmf(hemf: Long, header: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetMetafileHeaderFromFile(filename: Long, header: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetMetafileHeaderFromMetafile(metafile: Long, header: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetMetafileHeaderFromStream(stream: Long, header: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetMetafileHeaderFromWmf(hwmf: Long, wmfplaceablefileheader: Long, header: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetNearestColor(graphics: Long, argb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPageScale(graphics: Long, scale: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPageUnit(graphics: Long, unit: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPathData(path: Long, pathdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPathFillMode(path: Long, fillmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientBlend(brush: Long, blend: Long, positions: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientBlendCount(brush: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientCenterColor(brush: Long, colors: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientCenterPoint(brush: Long, points: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientCenterPointI(brush: Long, points: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientFocusScales(brush: Long, xscale: Long, yscale: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientGammaCorrection(brush: Long, usegammacorrection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientPath(brush: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientPointCount(brush: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientPresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientPresetBlendCount(brush: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientRect(brush: Long, rect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientRectI(brush: Long, rect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientSurroundColorCount(brush: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientSurroundColorsWithCount(brush: Long, color: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientTransform(brush: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientWrapMode(brush: Long, wrapmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPathLastPoint(path: Long, lastpoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPathPoints(param0: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPathPointsI(param0: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPathTypes(path: Long, types: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPathWorldBounds(path: Long, bounds: Long, matrix: Long, pen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPathWorldBoundsI(path: Long, bounds: Long, matrix: Long, pen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPenBrushFill(pen: Long, brush: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPenColor(pen: Long, argb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPenCompoundArray(pen: Long, dash: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPenCompoundCount(pen: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPenCustomEndCap(pen: Long, customcap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPenCustomStartCap(pen: Long, customcap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPenDashArray(pen: Long, dash: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPenDashCap197819(pen: Long, dashcap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPenDashCount(pen: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPenDashOffset(pen: Long, offset: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPenDashStyle(pen: Long, dashstyle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPenEndCap(pen: Long, endcap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPenFillType(pen: Long, type: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPenLineJoin(pen: Long, linejoin: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPenMiterLimit(pen: Long, miterlimit: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPenMode(pen: Long, penmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPenStartCap(pen: Long, startcap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPenTransform(pen: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPenUnit(pen: Long, unit: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPenWidth(pen: Long, width: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPixelOffsetMode(graphics: Long, pixeloffsetmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPointCount(path: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPropertyCount(image: Long, numofproperty: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPropertyIdList(image: Long, numofproperty: Int, list: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPropertyItem(image: Long, propid: Int, propsize: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPropertyItemSize(image: Long, propid: Int, size: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetPropertySize(image: Long, totalbuffersize: Long, numproperties: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetRegionBounds(region: Long, graphics: Long, rect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetRegionBoundsI(region: Long, graphics: Long, rect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetRegionData(region: Long, buffer: Long, buffersize: Int, sizefilled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetRegionDataSize(region: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetRegionHRgn(region: Long, graphics: Long, hrgn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetRegionScans(region: Long, rects: Long, count: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetRegionScansCount(region: Long, count: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetRegionScansI(region: Long, rects: Long, count: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetRenderingOrigin(graphics: Long, x: Long, y: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetSmoothingMode(graphics: Long, smoothingmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetSolidFillColor(brush: Long, color: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetStringFormatAlign(format: Long, align: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetStringFormatDigitSubstitution(format: Long, language: Long, substitute: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetStringFormatFlags(format: Long, flags: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetStringFormatHotkeyPrefix(format: Long, hotkeyprefix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetStringFormatLineAlign(format: Long, align: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetStringFormatMeasurableCharacterRangeCount(format: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetStringFormatTabStopCount(format: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetStringFormatTabStops(format: Long, count: Int, firsttaboffset: Long, tabstops: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetStringFormatTrimming(format: Long, trimming: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetTextContrast(graphics: Long, contrast: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetTextRenderingHint(graphics: Long, mode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetTextureImage(brush: Long, image: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetTextureTransform(brush: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetTextureWrapMode(brush: Long, wrapmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetVisibleClipBounds(graphics: Long, rect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetVisibleClipBoundsI(graphics: Long, rect: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGetWorldTransform(graphics: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGraphicsClear(graphics: Long, color: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipGraphicsSetAbort(pgraphics: Long, piabort: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipImageForceValidation(image: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipImageGetFrameCount(image: Long, dimensionid: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipImageGetFrameDimensionsCount(image: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipImageGetFrameDimensionsList(image: Long, dimensionids: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipImageRotateFlip(image: Long, rftype: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipImageSelectActiveFrame(image: Long, dimensionid: Long, frameindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipImageSetAbort(pimage: Long, piabort: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipInitializePalette(palette: Long, palettetype: Int, optimalcolors: Int, usetransparentcolor: Int, bitmap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipInvertMatrix(matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipIsClipEmpty(graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipIsEmptyRegion(region: Long, graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipIsEqualRegion(region: Long, region2: Long, graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipIsInfiniteRegion(region: Long, graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipIsMatrixEqual(matrix: Long, matrix2: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipIsMatrixIdentity(matrix: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipIsMatrixInvertible(matrix: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipIsOutlineVisiblePathPoint(path: Long, x: Float, y: Float, pen: Long, graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipIsOutlineVisiblePathPointI(path: Long, x: Int, y: Int, pen: Long, graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipIsStyleAvailable(family: Long, style: Int, isstyleavailable: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipIsVisibleClipEmpty(graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipIsVisiblePathPoint(path: Long, x: Float, y: Float, graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipIsVisiblePathPointI(path: Long, x: Int, y: Int, graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipIsVisiblePoint(graphics: Long, x: Float, y: Float, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipIsVisiblePointI(graphics: Long, x: Int, y: Int, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipIsVisibleRect(graphics: Long, x: Float, y: Float, width: Float, height: Float, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipIsVisibleRectI(graphics: Long, x: Int, y: Int, width: Int, height: Int, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipIsVisibleRegionPoint(region: Long, x: Float, y: Float, graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipIsVisibleRegionPointI(region: Long, x: Int, y: Int, graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipIsVisibleRegionRect(region: Long, x: Float, y: Float, width: Float, height: Float, graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipIsVisibleRegionRectI(region: Long, x: Int, y: Int, width: Int, height: Int, graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipLoadImageFromFile(filename: Long, image: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipLoadImageFromFileICM(filename: Long, image: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipLoadImageFromStream(stream: Long, image: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipLoadImageFromStreamICM(stream: Long, image: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipMeasureCharacterRanges(graphics: Long, string: Long, length: Int, font: Long, layoutrect: Long, stringformat: Long, regioncount: Int, regions: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipMeasureDriverString(graphics: Long, text: Long, length: Int, font: Long, positions: Long, flags: Int, matrix: Long, boundingbox: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipMeasureString(graphics: Long, string: Long, length: Int, font: Long, layoutrect: Long, stringformat: Long, boundingbox: Long, codepointsfitted: Long, linesfilled: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipMultiplyLineTransform(brush: Long, matrix: Long, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipMultiplyMatrix(matrix: Long, matrix2: Long, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipMultiplyPathGradientTransform(brush: Long, matrix: Long, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipMultiplyPenTransform(pen: Long, matrix: Long, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipMultiplyTextureTransform(brush: Long, matrix: Long, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipMultiplyWorldTransform(graphics: Long, matrix: Long, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipNewInstalledFontCollection(fontcollection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipNewPrivateFontCollection(fontcollection: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipPathIterCopyData(iterator: Long, resultcount: Long, points: Long, types: Long, startindex: Int, endindex: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipPathIterEnumerate(iterator: Long, resultcount: Long, points: Long, types: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipPathIterGetCount(iterator: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipPathIterGetSubpathCount(iterator: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipPathIterHasCurve(iterator: Long, hascurve: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipPathIterIsValid(iterator: Long, valid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipPathIterNextMarker(iterator: Long, resultcount: Long, startindex: Long, endindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipPathIterNextMarkerPath(iterator: Long, resultcount: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipPathIterNextPathType(iterator: Long, resultcount: Long, pathtype: Long, startindex: Long, endindex: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipPathIterNextSubpath(iterator: Long, resultcount: Long, startindex: Long, endindex: Long, isclosed: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipPathIterNextSubpathPath(iterator: Long, resultcount: Long, path: Long, isclosed: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipPathIterRewind(iterator: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipPlayMetafileRecord(metafile: Long, recordtype: Int, flags: Int, datasize: Int, data: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipPrivateAddFontFile(fontcollection: Long, filename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipPrivateAddMemoryFont(fontcollection: Long, memory: Long, length: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipRecordMetafile(referencehdc: Long, type: Int, framerect: Long, frameunit: Int, description: Long, metafile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipRecordMetafileFileName(filename: Long, referencehdc: Long, type: Int, framerect: Long, frameunit: Int, description: Long, metafile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipRecordMetafileFileNameI(filename: Long, referencehdc: Long, type: Int, framerect: Long, frameunit: Int, description: Long, metafile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipRecordMetafileI(referencehdc: Long, type: Int, framerect: Long, frameunit: Int, description: Long, metafile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipRecordMetafileStream(stream: Long, referencehdc: Long, type: Int, framerect: Long, frameunit: Int, description: Long, metafile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipRecordMetafileStreamI(stream: Long, referencehdc: Long, type: Int, framerect: Long, frameunit: Int, description: Long, metafile: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipReleaseDC(graphics: Long, hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipRemovePropertyItem(image: Long, propid: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipResetClip(graphics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipResetImageAttributes(imageattr: Long, type: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipResetLineTransform(brush: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipResetPageTransform(graphics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipResetPath(path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipResetPathGradientTransform(brush: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipResetPenTransform(pen: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipResetTextureTransform(brush: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipResetWorldTransform(graphics: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipRestoreGraphics(graphics: Long, state: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipReversePath(path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipRotateLineTransform(brush: Long, angle: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipRotateMatrix(matrix: Long, angle: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipRotatePathGradientTransform(brush: Long, angle: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipRotatePenTransform(pen: Long, angle: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipRotateTextureTransform(brush: Long, angle: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipRotateWorldTransform(graphics: Long, angle: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSaveAdd(image: Long, encoderparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSaveAddImage(image: Long, newimage: Long, encoderparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSaveGraphics(graphics: Long, state: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSaveImageToFile(image: Long, filename: Long, clsidencoder: Long, encoderparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSaveImageToStream(image: Long, stream: Long, clsidencoder: Long, encoderparams: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipScaleLineTransform(brush: Long, sx: Float, sy: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipScaleMatrix(matrix: Long, scalex: Float, scaley: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipScalePathGradientTransform(brush: Long, sx: Float, sy: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipScalePenTransform(pen: Long, sx: Float, sy: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipScaleTextureTransform(brush: Long, sx: Float, sy: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipScaleWorldTransform(graphics: Long, sx: Float, sy: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetAdjustableArrowCapFillState(cap: Long, fillstate: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetAdjustableArrowCapHeight(cap: Long, height: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetAdjustableArrowCapMiddleInset(cap: Long, middleinset: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetAdjustableArrowCapWidth(cap: Long, width: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetClipGraphics(graphics: Long, srcgraphics: Long, combinemode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetClipHrgn(graphics: Long, hrgn: Long, combinemode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetClipPath(graphics: Long, path: Long, combinemode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetClipRect(graphics: Long, x: Float, y: Float, width: Float, height: Float, combinemode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetClipRectI(graphics: Long, x: Int, y: Int, width: Int, height: Int, combinemode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetClipRegion(graphics: Long, region: Long, combinemode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetCompositingMode(graphics: Long, compositingmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetCompositingQuality(graphics: Long, compositingquality: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetCustomLineCapBaseCap(customcap: Long, basecap: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetCustomLineCapBaseInset(customcap: Long, inset: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetCustomLineCapStrokeCaps(customcap: Long, startcap: Int, endcap: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetCustomLineCapStrokeJoin(customcap: Long, linejoin: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetCustomLineCapWidthScale(customcap: Long, widthscale: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetEffectParameters(effect: Long, params: Long, size: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetEmpty(region: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetImageAttributesCachedBackground(imageattr: Long, enableflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetImageAttributesColorKeys(imageattr: Long, type: Int, enableflag: Int, colorlow: Int, colorhigh: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetImageAttributesColorMatrix(imageattr: Long, type: Int, enableflag: Int, colormatrix: Long, graymatrix: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetImageAttributesGamma(imageattr: Long, type: Int, enableflag: Int, gamma: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetImageAttributesNoOp(imageattr: Long, type: Int, enableflag: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetImageAttributesOutputChannel(imageattr: Long, type: Int, enableflag: Int, channelflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetImageAttributesOutputChannelColorProfile(imageattr: Long, type: Int, enableflag: Int, colorprofilefilename: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetImageAttributesRemapTable(imageattr: Long, type: Int, enableflag: Int, mapsize: Int, map: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetImageAttributesThreshold(imageattr: Long, type: Int, enableflag: Int, threshold: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetImageAttributesToIdentity(imageattr: Long, type: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetImageAttributesWrapMode(imageattr: Long, wrap: Int, argb: Int, clamp: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetImagePalette(image: Long, palette: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetInfinite(region: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetInterpolationMode(graphics: Long, interpolationmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetLineBlend(brush: Long, blend: Long, positions: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetLineColors(brush: Long, color1: Int, color2: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetLineGammaCorrection(brush: Long, usegammacorrection: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetLineLinearBlend(brush: Long, focus: Float, scale: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetLinePresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetLineSigmaBlend(brush: Long, focus: Float, scale: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetLineTransform(brush: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetLineWrapMode(brush: Long, wrapmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetMatrixElements(matrix: Long, m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetMetafileDownLevelRasterizationLimit(metafile: Long, metafilerasterizationlimitdpi: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPageScale(graphics: Long, scale: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPageUnit(graphics: Long, unit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPathFillMode(path: Long, fillmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientBlend(brush: Long, blend: Long, positions: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientCenterColor(brush: Long, colors: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientCenterPoint(brush: Long, points: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientCenterPointI(brush: Long, points: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientFocusScales(brush: Long, xscale: Float, yscale: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientGammaCorrection(brush: Long, usegammacorrection: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientLinearBlend(brush: Long, focus: Float, scale: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientPath(brush: Long, path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientPresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientSigmaBlend(brush: Long, focus: Float, scale: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientSurroundColorsWithCount(brush: Long, color: Long, count: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientTransform(brush: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientWrapMode(brush: Long, wrapmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPathMarker(path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPenBrushFill(pen: Long, brush: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPenColor(pen: Long, argb: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPenCompoundArray(pen: Long, dash: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPenCustomEndCap(pen: Long, customcap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPenCustomStartCap(pen: Long, customcap: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPenDashArray(pen: Long, dash: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPenDashCap197819(pen: Long, dashcap: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPenDashOffset(pen: Long, offset: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPenDashStyle(pen: Long, dashstyle: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPenEndCap(pen: Long, endcap: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPenLineCap197819(pen: Long, startcap: Int, endcap: Int, dashcap: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPenLineJoin(pen: Long, linejoin: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPenMiterLimit(pen: Long, miterlimit: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPenMode(pen: Long, penmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPenStartCap(pen: Long, startcap: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPenTransform(pen: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPenUnit(pen: Long, unit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPenWidth(pen: Long, width: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPixelOffsetMode(graphics: Long, pixeloffsetmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetPropertyItem(image: Long, item: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetRenderingOrigin(graphics: Long, x: Int, y: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetSmoothingMode(graphics: Long, smoothingmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetSolidFillColor(brush: Long, color: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetStringFormatAlign(format: Long, align: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetStringFormatDigitSubstitution(format: Long, language: Short, substitute: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetStringFormatFlags(format: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetStringFormatHotkeyPrefix(format: Long, hotkeyprefix: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetStringFormatLineAlign(format: Long, align: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetStringFormatMeasurableCharacterRanges(format: Long, rangecount: Int, ranges: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetStringFormatTabStops(format: Long, firsttaboffset: Float, count: Int, tabstops: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetStringFormatTrimming(format: Long, trimming: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetTextContrast(graphics: Long, contrast: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetTextRenderingHint(graphics: Long, mode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetTextureTransform(brush: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetTextureWrapMode(brush: Long, wrapmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipSetWorldTransform(graphics: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipShearMatrix(matrix: Long, shearx: Float, sheary: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipStartPathFigure(path: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipStringFormatGetGenericDefault(format: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipStringFormatGetGenericTypographic(format: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipTestControl(control: Int, param1: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipTransformMatrixPoints(matrix: Long, pts: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipTransformMatrixPointsI(matrix: Long, pts: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipTransformPath(path: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipTransformPoints(graphics: Long, destspace: Int, srcspace: Int, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipTransformPointsI(graphics: Long, destspace: Int, srcspace: Int, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipTransformRegion(region: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipTranslateClip(graphics: Long, dx: Float, dy: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipTranslateClipI(graphics: Long, dx: Int, dy: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipTranslateLineTransform(brush: Long, dx: Float, dy: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipTranslateMatrix(matrix: Long, offsetx: Float, offsety: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipTranslatePathGradientTransform(brush: Long, dx: Float, dy: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipTranslatePenTransform(pen: Long, dx: Float, dy: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipTranslateRegion(region: Long, dx: Float, dy: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipTranslateRegionI(region: Long, dx: Int, dy: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipTranslateTextureTransform(brush: Long, dx: Float, dy: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipTranslateWorldTransform(graphics: Long, dx: Float, dy: Float, order: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipVectorTransformMatrixPoints(matrix: Long, pts: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipVectorTransformMatrixPointsI(matrix: Long, pts: Long, count: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipWarpPath(path: Long, matrix: Long, points: Long, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, warpmode: Int, flatness: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipWidenPath(nativepath: Long, pen: Long, matrix: Long, flatness: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdipWindingModeOutline(path: Long, matrix: Long, flatness: Float): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdiplusNotificationHook(token: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdiplusNotificationUnhook(token: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdiplusShutdown(token: Long)

    @JvmStatic
    external fun windowssys_windows_win32_graphics_gdiplus_gdiplusStartup(token: Long, input: Long, output: Long): Int
}

public actual fun gdipAddPathArc(path: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAddPathArc((path?.value ?: 0L), x, y, width, height, startangle, sweepangle)

public actual fun gdipAddPathArcI(path: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAddPathArcI((path?.value ?: 0L), x, y, width, height, startangle, sweepangle)

public actual fun gdipAddPathBezier(path: COpaquePointer?, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAddPathBezier((path?.value ?: 0L), x1, y1, x2, y2, x3, y3, x4, y4)

public actual fun gdipAddPathBezierI(path: COpaquePointer?, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAddPathBezierI((path?.value ?: 0L), x1, y1, x2, y2, x3, y3, x4, y4)

public actual fun gdipAddPathBeziers(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAddPathBeziers((path?.value ?: 0L), (points?.value ?: 0L), count)

public actual fun gdipAddPathBeziersI(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAddPathBeziersI((path?.value ?: 0L), (points?.value ?: 0L), count)

public actual fun gdipAddPathClosedCurve(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAddPathClosedCurve((path?.value ?: 0L), (points?.value ?: 0L), count)

public actual fun gdipAddPathClosedCurve2(path: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAddPathClosedCurve2((path?.value ?: 0L), (points?.value ?: 0L), count, tension)

public actual fun gdipAddPathClosedCurve2I(path: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAddPathClosedCurve2I((path?.value ?: 0L), (points?.value ?: 0L), count, tension)

public actual fun gdipAddPathClosedCurveI(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAddPathClosedCurveI((path?.value ?: 0L), (points?.value ?: 0L), count)

public actual fun gdipAddPathCurve(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAddPathCurve((path?.value ?: 0L), (points?.value ?: 0L), count)

public actual fun gdipAddPathCurve2(path: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAddPathCurve2((path?.value ?: 0L), (points?.value ?: 0L), count, tension)

public actual fun gdipAddPathCurve2I(path: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAddPathCurve2I((path?.value ?: 0L), (points?.value ?: 0L), count, tension)

public actual fun gdipAddPathCurve3(path: COpaquePointer?, points: COpaquePointer?, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAddPathCurve3((path?.value ?: 0L), (points?.value ?: 0L), count, offset, numberofsegments, tension)

public actual fun gdipAddPathCurve3I(path: COpaquePointer?, points: COpaquePointer?, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAddPathCurve3I((path?.value ?: 0L), (points?.value ?: 0L), count, offset, numberofsegments, tension)

public actual fun gdipAddPathCurveI(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAddPathCurveI((path?.value ?: 0L), (points?.value ?: 0L), count)

public actual fun gdipAddPathEllipse(path: COpaquePointer?, x: Float, y: Float, width: Float, height: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAddPathEllipse((path?.value ?: 0L), x, y, width, height)

public actual fun gdipAddPathEllipseI(path: COpaquePointer?, x: Int, y: Int, width: Int, height: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAddPathEllipseI((path?.value ?: 0L), x, y, width, height)

public actual fun gdipAddPathLine(path: COpaquePointer?, x1: Float, y1: Float, x2: Float, y2: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAddPathLine((path?.value ?: 0L), x1, y1, x2, y2)

public actual fun gdipAddPathLine2(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAddPathLine2((path?.value ?: 0L), (points?.value ?: 0L), count)

public actual fun gdipAddPathLine2I(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAddPathLine2I((path?.value ?: 0L), (points?.value ?: 0L), count)

public actual fun gdipAddPathLineI(path: COpaquePointer?, x1: Int, y1: Int, x2: Int, y2: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAddPathLineI((path?.value ?: 0L), x1, y1, x2, y2)

public actual fun gdipAddPathPath(path: COpaquePointer?, addingpath: COpaquePointer?, connect: Bool): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAddPathPath((path?.value ?: 0L), (addingpath?.value ?: 0L), connect)

public actual fun gdipAddPathPie(path: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAddPathPie((path?.value ?: 0L), x, y, width, height, startangle, sweepangle)

public actual fun gdipAddPathPieI(path: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAddPathPieI((path?.value ?: 0L), x, y, width, height, startangle, sweepangle)

public actual fun gdipAddPathPolygon(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAddPathPolygon((path?.value ?: 0L), (points?.value ?: 0L), count)

public actual fun gdipAddPathPolygonI(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAddPathPolygonI((path?.value ?: 0L), (points?.value ?: 0L), count)

public actual fun gdipAddPathRectangle(path: COpaquePointer?, x: Float, y: Float, width: Float, height: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAddPathRectangle((path?.value ?: 0L), x, y, width, height)

public actual fun gdipAddPathRectangleI(path: COpaquePointer?, x: Int, y: Int, width: Int, height: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAddPathRectangleI((path?.value ?: 0L), x, y, width, height)

public actual fun gdipAddPathRectangles(path: COpaquePointer?, rects: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAddPathRectangles((path?.value ?: 0L), (rects?.value ?: 0L), count)

public actual fun gdipAddPathRectanglesI(path: COpaquePointer?, rects: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAddPathRectanglesI((path?.value ?: 0L), (rects?.value ?: 0L), count)

public actual fun gdipAddPathString(path: COpaquePointer?, string: Pcwstr, length: Int, family: COpaquePointer?, style: Int, emsize: Float, layoutrect: COpaquePointer?, format: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAddPathString((path?.value ?: 0L), (string?.value ?: 0L), length, (family?.value ?: 0L), style, emsize, (layoutrect?.value ?: 0L), (format?.value ?: 0L))

public actual fun gdipAddPathStringI(path: COpaquePointer?, string: Pcwstr, length: Int, family: COpaquePointer?, style: Int, emsize: Float, layoutrect: COpaquePointer?, format: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAddPathStringI((path?.value ?: 0L), (string?.value ?: 0L), length, (family?.value ?: 0L), style, emsize, (layoutrect?.value ?: 0L), (format?.value ?: 0L))

public actual fun gdipAlloc(size: ULong): COpaquePointer? =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipAlloc(size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gdipBeginContainer(graphics: COpaquePointer?, dstrect: COpaquePointer?, srcrect: COpaquePointer?, unit: Unit, state: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipBeginContainer((graphics?.value ?: 0L), (dstrect?.value ?: 0L), (srcrect?.value ?: 0L), unit, (state?.value ?: 0L))

public actual fun gdipBeginContainer2(graphics: COpaquePointer?, state: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipBeginContainer2((graphics?.value ?: 0L), (state?.value ?: 0L))

public actual fun gdipBeginContainerI(graphics: COpaquePointer?, dstrect: COpaquePointer?, srcrect: COpaquePointer?, unit: Unit, state: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipBeginContainerI((graphics?.value ?: 0L), (dstrect?.value ?: 0L), (srcrect?.value ?: 0L), unit, (state?.value ?: 0L))

public actual fun gdipBitmapApplyEffect(bitmap: COpaquePointer?, effect: COpaquePointer?, roi: COpaquePointer?, useauxdata: Bool, auxdata: COpaquePointer?, auxdatasize: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipBitmapApplyEffect((bitmap?.value ?: 0L), (effect?.value ?: 0L), (roi?.value ?: 0L), useauxdata, (auxdata?.value ?: 0L), (auxdatasize?.value ?: 0L))

public actual fun gdipBitmapConvertFormat(pinputbitmap: COpaquePointer?, format: Int, dithertype: DitherType, palettetype: PaletteType, palette: COpaquePointer?, alphathresholdpercent: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipBitmapConvertFormat((pinputbitmap?.value ?: 0L), format, dithertype, palettetype, (palette?.value ?: 0L), alphathresholdpercent)

public actual fun gdipBitmapCreateApplyEffect(inputbitmaps: COpaquePointer?, numinputs: Int, effect: COpaquePointer?, roi: COpaquePointer?, outputrect: COpaquePointer?, outputbitmap: COpaquePointer?, useauxdata: Bool, auxdata: COpaquePointer?, auxdatasize: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipBitmapCreateApplyEffect((inputbitmaps?.value ?: 0L), numinputs, (effect?.value ?: 0L), (roi?.value ?: 0L), (outputrect?.value ?: 0L), (outputbitmap?.value ?: 0L), useauxdata, (auxdata?.value ?: 0L), (auxdatasize?.value ?: 0L))

public actual fun gdipBitmapGetHistogram(bitmap: COpaquePointer?, format: HistogramFormat, numberofentries: UInt, channel0: COpaquePointer?, channel1: COpaquePointer?, channel2: COpaquePointer?, channel3: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipBitmapGetHistogram((bitmap?.value ?: 0L), format, numberofentries.toInt(), (channel0?.value ?: 0L), (channel1?.value ?: 0L), (channel2?.value ?: 0L), (channel3?.value ?: 0L))

public actual fun gdipBitmapGetHistogramSize(format: HistogramFormat, numberofentries: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipBitmapGetHistogramSize(format, (numberofentries?.value ?: 0L))

public actual fun gdipBitmapGetPixel(bitmap: COpaquePointer?, x: Int, y: Int, color: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipBitmapGetPixel((bitmap?.value ?: 0L), x, y, (color?.value ?: 0L))

public actual fun gdipBitmapLockBits(bitmap: COpaquePointer?, rect: COpaquePointer?, flags: UInt, format: Int, lockedbitmapdata: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipBitmapLockBits((bitmap?.value ?: 0L), (rect?.value ?: 0L), flags.toInt(), format, (lockedbitmapdata?.value ?: 0L))

public actual fun gdipBitmapSetPixel(bitmap: COpaquePointer?, x: Int, y: Int, color: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipBitmapSetPixel((bitmap?.value ?: 0L), x, y, color.toInt())

public actual fun gdipBitmapSetResolution(bitmap: COpaquePointer?, xdpi: Float, ydpi: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipBitmapSetResolution((bitmap?.value ?: 0L), xdpi, ydpi)

public actual fun gdipBitmapUnlockBits(bitmap: COpaquePointer?, lockedbitmapdata: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipBitmapUnlockBits((bitmap?.value ?: 0L), (lockedbitmapdata?.value ?: 0L))

public actual fun gdipClearPathMarkers(path: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipClearPathMarkers((path?.value ?: 0L))

public actual fun gdipCloneBitmapArea(x: Float, y: Float, width: Float, height: Float, format: Int, srcbitmap: COpaquePointer?, dstbitmap: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCloneBitmapArea(x, y, width, height, format, (srcbitmap?.value ?: 0L), (dstbitmap?.value ?: 0L))

public actual fun gdipCloneBitmapAreaI(x: Int, y: Int, width: Int, height: Int, format: Int, srcbitmap: COpaquePointer?, dstbitmap: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCloneBitmapAreaI(x, y, width, height, format, (srcbitmap?.value ?: 0L), (dstbitmap?.value ?: 0L))

public actual fun gdipCloneBrush(brush: COpaquePointer?, clonebrush: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCloneBrush((brush?.value ?: 0L), (clonebrush?.value ?: 0L))

public actual fun gdipCloneCustomLineCap(customcap: COpaquePointer?, clonedcap: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCloneCustomLineCap((customcap?.value ?: 0L), (clonedcap?.value ?: 0L))

public actual fun gdipCloneFont(font: COpaquePointer?, clonefont: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCloneFont((font?.value ?: 0L), (clonefont?.value ?: 0L))

public actual fun gdipCloneFontFamily(fontfamily: COpaquePointer?, clonedfontfamily: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCloneFontFamily((fontfamily?.value ?: 0L), (clonedfontfamily?.value ?: 0L))

public actual fun gdipCloneImage(image: COpaquePointer?, cloneimage: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCloneImage((image?.value ?: 0L), (cloneimage?.value ?: 0L))

public actual fun gdipCloneImageAttributes(imageattr: COpaquePointer?, cloneimageattr: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCloneImageAttributes((imageattr?.value ?: 0L), (cloneimageattr?.value ?: 0L))

public actual fun gdipCloneMatrix(matrix: COpaquePointer?, clonematrix: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCloneMatrix((matrix?.value ?: 0L), (clonematrix?.value ?: 0L))

public actual fun gdipClonePath(path: COpaquePointer?, clonepath: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipClonePath((path?.value ?: 0L), (clonepath?.value ?: 0L))

public actual fun gdipClonePen(pen: COpaquePointer?, clonepen: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipClonePen((pen?.value ?: 0L), (clonepen?.value ?: 0L))

public actual fun gdipCloneRegion(region: COpaquePointer?, cloneregion: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCloneRegion((region?.value ?: 0L), (cloneregion?.value ?: 0L))

public actual fun gdipCloneStringFormat(format: COpaquePointer?, newformat: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCloneStringFormat((format?.value ?: 0L), (newformat?.value ?: 0L))

public actual fun gdipClosePathFigure(path: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipClosePathFigure((path?.value ?: 0L))

public actual fun gdipClosePathFigures(path: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipClosePathFigures((path?.value ?: 0L))

public actual fun gdipCombineRegionPath(region: COpaquePointer?, path: COpaquePointer?, combinemode: CombineMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCombineRegionPath((region?.value ?: 0L), (path?.value ?: 0L), combinemode)

public actual fun gdipCombineRegionRect(region: COpaquePointer?, rect: COpaquePointer?, combinemode: CombineMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCombineRegionRect((region?.value ?: 0L), (rect?.value ?: 0L), combinemode)

public actual fun gdipCombineRegionRectI(region: COpaquePointer?, rect: COpaquePointer?, combinemode: CombineMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCombineRegionRectI((region?.value ?: 0L), (rect?.value ?: 0L), combinemode)

public actual fun gdipCombineRegionRegion(region: COpaquePointer?, region2: COpaquePointer?, combinemode: CombineMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCombineRegionRegion((region?.value ?: 0L), (region2?.value ?: 0L), combinemode)

public actual fun gdipComment(graphics: COpaquePointer?, sizedata: UInt, data: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipComment((graphics?.value ?: 0L), sizedata.toInt(), (data?.value ?: 0L))

public actual fun gdipConvertToEmfPlus(refgraphics: COpaquePointer?, metafile: COpaquePointer?, conversionfailureflag: COpaquePointer?, emftype: EmfType, description: Pcwstr, outMetafile: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipConvertToEmfPlus((refgraphics?.value ?: 0L), (metafile?.value ?: 0L), (conversionfailureflag?.value ?: 0L), emftype, (description?.value ?: 0L), (outMetafile?.value ?: 0L))

public actual fun gdipConvertToEmfPlusToFile(refgraphics: COpaquePointer?, metafile: COpaquePointer?, conversionfailureflag: COpaquePointer?, filename: Pcwstr, emftype: EmfType, description: Pcwstr, outMetafile: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipConvertToEmfPlusToFile((refgraphics?.value ?: 0L), (metafile?.value ?: 0L), (conversionfailureflag?.value ?: 0L), (filename?.value ?: 0L), emftype, (description?.value ?: 0L), (outMetafile?.value ?: 0L))

public actual fun gdipConvertToEmfPlusToStream(refgraphics: COpaquePointer?, metafile: COpaquePointer?, conversionfailureflag: COpaquePointer?, stream: COpaquePointer?, emftype: EmfType, description: Pcwstr, outMetafile: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipConvertToEmfPlusToStream((refgraphics?.value ?: 0L), (metafile?.value ?: 0L), (conversionfailureflag?.value ?: 0L), (stream?.value ?: 0L), emftype, (description?.value ?: 0L), (outMetafile?.value ?: 0L))

public actual fun gdipCreateAdjustableArrowCap(height: Float, width: Float, isfilled: Bool, cap: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateAdjustableArrowCap(height, width, isfilled, (cap?.value ?: 0L))

public actual fun gdipCreateBitmapFromFile(filename: Pcwstr, bitmap: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateBitmapFromFile((filename?.value ?: 0L), (bitmap?.value ?: 0L))

public actual fun gdipCreateBitmapFromFileICM(filename: Pcwstr, bitmap: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateBitmapFromFileICM((filename?.value ?: 0L), (bitmap?.value ?: 0L))

public actual fun gdipCreateBitmapFromGdiDib(gdibitmapinfo: COpaquePointer?, gdibitmapdata: COpaquePointer?, bitmap: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateBitmapFromGdiDib((gdibitmapinfo?.value ?: 0L), (gdibitmapdata?.value ?: 0L), (bitmap?.value ?: 0L))

public actual fun gdipCreateBitmapFromGraphics(width: Int, height: Int, target: COpaquePointer?, bitmap: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateBitmapFromGraphics(width, height, (target?.value ?: 0L), (bitmap?.value ?: 0L))

public actual fun gdipCreateBitmapFromHBITMAP(hbm: Hbitmap, hpal: Hpalette, bitmap: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateBitmapFromHBITMAP((hbm?.value ?: 0L), (hpal?.value ?: 0L), (bitmap?.value ?: 0L))

public actual fun gdipCreateBitmapFromHICON(hicon: Hicon, bitmap: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateBitmapFromHICON((hicon?.value ?: 0L), (bitmap?.value ?: 0L))

public actual fun gdipCreateBitmapFromResource(hinstance: Hinstance, lpbitmapname: Pcwstr, bitmap: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateBitmapFromResource((hinstance?.value ?: 0L), (lpbitmapname?.value ?: 0L), (bitmap?.value ?: 0L))

public actual fun gdipCreateBitmapFromScan0(width: Int, height: Int, stride: Int, format: Int, scan0: COpaquePointer?, bitmap: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateBitmapFromScan0(width, height, stride, format, (scan0?.value ?: 0L), (bitmap?.value ?: 0L))

public actual fun gdipCreateBitmapFromStream(stream: COpaquePointer?, bitmap: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateBitmapFromStream((stream?.value ?: 0L), (bitmap?.value ?: 0L))

public actual fun gdipCreateBitmapFromStreamICM(stream: COpaquePointer?, bitmap: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateBitmapFromStreamICM((stream?.value ?: 0L), (bitmap?.value ?: 0L))

public actual fun gdipCreateCachedBitmap(bitmap: COpaquePointer?, graphics: COpaquePointer?, cachedbitmap: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateCachedBitmap((bitmap?.value ?: 0L), (graphics?.value ?: 0L), (cachedbitmap?.value ?: 0L))

public actual fun gdipCreateCustomLineCap(fillpath: COpaquePointer?, strokepath: COpaquePointer?, basecap: LineCap, baseinset: Float, customcap: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateCustomLineCap((fillpath?.value ?: 0L), (strokepath?.value ?: 0L), basecap, baseinset, (customcap?.value ?: 0L))

public actual fun gdipCreateEffect(guid: Guid, effect: COpaquePointer?): Status =
    0

public actual fun gdipCreateFont(fontfamily: COpaquePointer?, emsize: Float, style: Int, unit: Unit, font: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateFont((fontfamily?.value ?: 0L), emsize, style, unit, (font?.value ?: 0L))

public actual fun gdipCreateFontFamilyFromName(name: Pcwstr, fontcollection: COpaquePointer?, fontfamily: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateFontFamilyFromName((name?.value ?: 0L), (fontcollection?.value ?: 0L), (fontfamily?.value ?: 0L))

public actual fun gdipCreateFontFromDC(hdc: Hdc, font: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateFontFromDC((hdc?.value ?: 0L), (font?.value ?: 0L))

public actual fun gdipCreateFontFromLogfontA(hdc: Hdc, logfont: COpaquePointer?, font: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateFontFromLogfontA((hdc?.value ?: 0L), (logfont?.value ?: 0L), (font?.value ?: 0L))

public actual fun gdipCreateFontFromLogfontW(hdc: Hdc, logfont: COpaquePointer?, font: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateFontFromLogfontW((hdc?.value ?: 0L), (logfont?.value ?: 0L), (font?.value ?: 0L))

public actual fun gdipCreateFromHDC(hdc: Hdc, graphics: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateFromHDC((hdc?.value ?: 0L), (graphics?.value ?: 0L))

public actual fun gdipCreateFromHDC2(hdc: Hdc, hdevice: Handle, graphics: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateFromHDC2((hdc?.value ?: 0L), (hdevice?.value ?: 0L), (graphics?.value ?: 0L))

public actual fun gdipCreateFromHWND(hwnd: Hwnd, graphics: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateFromHWND((hwnd?.value ?: 0L), (graphics?.value ?: 0L))

public actual fun gdipCreateFromHWNDICM(hwnd: Hwnd, graphics: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateFromHWNDICM((hwnd?.value ?: 0L), (graphics?.value ?: 0L))

public actual fun gdipCreateHBITMAPFromBitmap(bitmap: COpaquePointer?, hbmreturn: COpaquePointer?, background: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateHBITMAPFromBitmap((bitmap?.value ?: 0L), (hbmreturn?.value ?: 0L), background.toInt())

public actual fun gdipCreateHICONFromBitmap(bitmap: COpaquePointer?, hbmreturn: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateHICONFromBitmap((bitmap?.value ?: 0L), (hbmreturn?.value ?: 0L))

public actual fun gdipCreateHalftonePalette(): Hpalette =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateHalftonePalette().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gdipCreateHatchBrush(hatchstyle: HatchStyle, forecol: UInt, backcol: UInt, brush: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateHatchBrush(hatchstyle, forecol.toInt(), backcol.toInt(), (brush?.value ?: 0L))

public actual fun gdipCreateImageAttributes(imageattr: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateImageAttributes((imageattr?.value ?: 0L))

public actual fun gdipCreateLineBrush(point1: COpaquePointer?, point2: COpaquePointer?, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateLineBrush((point1?.value ?: 0L), (point2?.value ?: 0L), color1.toInt(), color2.toInt(), wrapmode, (linegradient?.value ?: 0L))

public actual fun gdipCreateLineBrushFromRect(rect: COpaquePointer?, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateLineBrushFromRect((rect?.value ?: 0L), color1.toInt(), color2.toInt(), mode, wrapmode, (linegradient?.value ?: 0L))

public actual fun gdipCreateLineBrushFromRectI(rect: COpaquePointer?, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateLineBrushFromRectI((rect?.value ?: 0L), color1.toInt(), color2.toInt(), mode, wrapmode, (linegradient?.value ?: 0L))

public actual fun gdipCreateLineBrushFromRectWithAngle(rect: COpaquePointer?, color1: UInt, color2: UInt, angle: Float, isanglescalable: Bool, wrapmode: WrapMode, linegradient: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateLineBrushFromRectWithAngle((rect?.value ?: 0L), color1.toInt(), color2.toInt(), angle, isanglescalable, wrapmode, (linegradient?.value ?: 0L))

public actual fun gdipCreateLineBrushFromRectWithAngleI(rect: COpaquePointer?, color1: UInt, color2: UInt, angle: Float, isanglescalable: Bool, wrapmode: WrapMode, linegradient: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateLineBrushFromRectWithAngleI((rect?.value ?: 0L), color1.toInt(), color2.toInt(), angle, isanglescalable, wrapmode, (linegradient?.value ?: 0L))

public actual fun gdipCreateLineBrushI(point1: COpaquePointer?, point2: COpaquePointer?, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateLineBrushI((point1?.value ?: 0L), (point2?.value ?: 0L), color1.toInt(), color2.toInt(), wrapmode, (linegradient?.value ?: 0L))

public actual fun gdipCreateMatrix(matrix: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateMatrix((matrix?.value ?: 0L))

public actual fun gdipCreateMatrix2(m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float, matrix: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateMatrix2(m11, m12, m21, m22, dx, dy, (matrix?.value ?: 0L))

public actual fun gdipCreateMatrix3(rect: COpaquePointer?, dstplg: COpaquePointer?, matrix: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateMatrix3((rect?.value ?: 0L), (dstplg?.value ?: 0L), (matrix?.value ?: 0L))

public actual fun gdipCreateMatrix3I(rect: COpaquePointer?, dstplg: COpaquePointer?, matrix: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateMatrix3I((rect?.value ?: 0L), (dstplg?.value ?: 0L), (matrix?.value ?: 0L))

public actual fun gdipCreateMetafileFromEmf(hemf: Henhmetafile, deleteemf: Bool, metafile: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateMetafileFromEmf((hemf?.value ?: 0L), deleteemf, (metafile?.value ?: 0L))

public actual fun gdipCreateMetafileFromFile(file: Pcwstr, metafile: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateMetafileFromFile((file?.value ?: 0L), (metafile?.value ?: 0L))

public actual fun gdipCreateMetafileFromStream(stream: COpaquePointer?, metafile: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateMetafileFromStream((stream?.value ?: 0L), (metafile?.value ?: 0L))

public actual fun gdipCreateMetafileFromWmf(hwmf: Hmetafile, deletewmf: Bool, wmfplaceablefileheader: COpaquePointer?, metafile: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateMetafileFromWmf((hwmf?.value ?: 0L), deletewmf, (wmfplaceablefileheader?.value ?: 0L), (metafile?.value ?: 0L))

public actual fun gdipCreateMetafileFromWmfFile(file: Pcwstr, wmfplaceablefileheader: COpaquePointer?, metafile: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateMetafileFromWmfFile((file?.value ?: 0L), (wmfplaceablefileheader?.value ?: 0L), (metafile?.value ?: 0L))

public actual fun gdipCreatePath(brushmode: FillMode, path: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreatePath(brushmode, (path?.value ?: 0L))

public actual fun gdipCreatePath2(param0: COpaquePointer?, param1: COpaquePointer?, param2: Int, param3: FillMode, path: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreatePath2((param0?.value ?: 0L), (param1?.value ?: 0L), param2, param3, (path?.value ?: 0L))

public actual fun gdipCreatePath2I(param0: COpaquePointer?, param1: COpaquePointer?, param2: Int, param3: FillMode, path: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreatePath2I((param0?.value ?: 0L), (param1?.value ?: 0L), param2, param3, (path?.value ?: 0L))

public actual fun gdipCreatePathGradient(points: COpaquePointer?, count: Int, wrapmode: WrapMode, polygradient: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreatePathGradient((points?.value ?: 0L), count, wrapmode, (polygradient?.value ?: 0L))

public actual fun gdipCreatePathGradientFromPath(path: COpaquePointer?, polygradient: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreatePathGradientFromPath((path?.value ?: 0L), (polygradient?.value ?: 0L))

public actual fun gdipCreatePathGradientI(points: COpaquePointer?, count: Int, wrapmode: WrapMode, polygradient: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreatePathGradientI((points?.value ?: 0L), count, wrapmode, (polygradient?.value ?: 0L))

public actual fun gdipCreatePathIter(iterator: COpaquePointer?, path: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreatePathIter((iterator?.value ?: 0L), (path?.value ?: 0L))

public actual fun gdipCreatePen1(color: UInt, width: Float, unit: Unit, pen: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreatePen1(color.toInt(), width, unit, (pen?.value ?: 0L))

public actual fun gdipCreatePen2(brush: COpaquePointer?, width: Float, unit: Unit, pen: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreatePen2((brush?.value ?: 0L), width, unit, (pen?.value ?: 0L))

public actual fun gdipCreateRegion(region: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateRegion((region?.value ?: 0L))

public actual fun gdipCreateRegionHrgn(hrgn: Hrgn, region: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateRegionHrgn((hrgn?.value ?: 0L), (region?.value ?: 0L))

public actual fun gdipCreateRegionPath(path: COpaquePointer?, region: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateRegionPath((path?.value ?: 0L), (region?.value ?: 0L))

public actual fun gdipCreateRegionRect(rect: COpaquePointer?, region: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateRegionRect((rect?.value ?: 0L), (region?.value ?: 0L))

public actual fun gdipCreateRegionRectI(rect: COpaquePointer?, region: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateRegionRectI((rect?.value ?: 0L), (region?.value ?: 0L))

public actual fun gdipCreateRegionRgnData(regiondata: COpaquePointer?, size: Int, region: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateRegionRgnData((regiondata?.value ?: 0L), size, (region?.value ?: 0L))

public actual fun gdipCreateSolidFill(color: UInt, brush: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateSolidFill(color.toInt(), (brush?.value ?: 0L))

public actual fun gdipCreateStreamOnFile(filename: Pcwstr, access: UInt, stream: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateStreamOnFile((filename?.value ?: 0L), access.toInt(), (stream?.value ?: 0L))

public actual fun gdipCreateStringFormat(formatattributes: Int, language: UShort, format: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateStringFormat(formatattributes, language.toShort(), (format?.value ?: 0L))

public actual fun gdipCreateTexture(image: COpaquePointer?, wrapmode: WrapMode, texture: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateTexture((image?.value ?: 0L), wrapmode, (texture?.value ?: 0L))

public actual fun gdipCreateTexture2(image: COpaquePointer?, wrapmode: WrapMode, x: Float, y: Float, width: Float, height: Float, texture: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateTexture2((image?.value ?: 0L), wrapmode, x, y, width, height, (texture?.value ?: 0L))

public actual fun gdipCreateTexture2I(image: COpaquePointer?, wrapmode: WrapMode, x: Int, y: Int, width: Int, height: Int, texture: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateTexture2I((image?.value ?: 0L), wrapmode, x, y, width, height, (texture?.value ?: 0L))

public actual fun gdipCreateTextureIA(image: COpaquePointer?, imageattributes: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, texture: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateTextureIA((image?.value ?: 0L), (imageattributes?.value ?: 0L), x, y, width, height, (texture?.value ?: 0L))

public actual fun gdipCreateTextureIAI(image: COpaquePointer?, imageattributes: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, texture: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipCreateTextureIAI((image?.value ?: 0L), (imageattributes?.value ?: 0L), x, y, width, height, (texture?.value ?: 0L))

public actual fun gdipDeleteBrush(brush: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDeleteBrush((brush?.value ?: 0L))

public actual fun gdipDeleteCachedBitmap(cachedbitmap: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDeleteCachedBitmap((cachedbitmap?.value ?: 0L))

public actual fun gdipDeleteCustomLineCap(customcap: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDeleteCustomLineCap((customcap?.value ?: 0L))

public actual fun gdipDeleteEffect(effect: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDeleteEffect((effect?.value ?: 0L))

public actual fun gdipDeleteFont(font: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDeleteFont((font?.value ?: 0L))

public actual fun gdipDeleteFontFamily(fontfamily: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDeleteFontFamily((fontfamily?.value ?: 0L))

public actual fun gdipDeleteGraphics(graphics: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDeleteGraphics((graphics?.value ?: 0L))

public actual fun gdipDeleteMatrix(matrix: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDeleteMatrix((matrix?.value ?: 0L))

public actual fun gdipDeletePath(path: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDeletePath((path?.value ?: 0L))

public actual fun gdipDeletePathIter(iterator: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDeletePathIter((iterator?.value ?: 0L))

public actual fun gdipDeletePen(pen: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDeletePen((pen?.value ?: 0L))

public actual fun gdipDeletePrivateFontCollection(fontcollection: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDeletePrivateFontCollection((fontcollection?.value ?: 0L))

public actual fun gdipDeleteRegion(region: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDeleteRegion((region?.value ?: 0L))

public actual fun gdipDeleteStringFormat(format: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDeleteStringFormat((format?.value ?: 0L))

public actual fun gdipDisposeImage(image: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDisposeImage((image?.value ?: 0L))

public actual fun gdipDisposeImageAttributes(imageattr: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDisposeImageAttributes((imageattr?.value ?: 0L))

public actual fun gdipDrawArc(graphics: COpaquePointer?, pen: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawArc((graphics?.value ?: 0L), (pen?.value ?: 0L), x, y, width, height, startangle, sweepangle)

public actual fun gdipDrawArcI(graphics: COpaquePointer?, pen: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawArcI((graphics?.value ?: 0L), (pen?.value ?: 0L), x, y, width, height, startangle, sweepangle)

public actual fun gdipDrawBezier(graphics: COpaquePointer?, pen: COpaquePointer?, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawBezier((graphics?.value ?: 0L), (pen?.value ?: 0L), x1, y1, x2, y2, x3, y3, x4, y4)

public actual fun gdipDrawBezierI(graphics: COpaquePointer?, pen: COpaquePointer?, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawBezierI((graphics?.value ?: 0L), (pen?.value ?: 0L), x1, y1, x2, y2, x3, y3, x4, y4)

public actual fun gdipDrawBeziers(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawBeziers((graphics?.value ?: 0L), (pen?.value ?: 0L), (points?.value ?: 0L), count)

public actual fun gdipDrawBeziersI(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawBeziersI((graphics?.value ?: 0L), (pen?.value ?: 0L), (points?.value ?: 0L), count)

public actual fun gdipDrawCachedBitmap(graphics: COpaquePointer?, cachedbitmap: COpaquePointer?, x: Int, y: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawCachedBitmap((graphics?.value ?: 0L), (cachedbitmap?.value ?: 0L), x, y)

public actual fun gdipDrawClosedCurve(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawClosedCurve((graphics?.value ?: 0L), (pen?.value ?: 0L), (points?.value ?: 0L), count)

public actual fun gdipDrawClosedCurve2(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawClosedCurve2((graphics?.value ?: 0L), (pen?.value ?: 0L), (points?.value ?: 0L), count, tension)

public actual fun gdipDrawClosedCurve2I(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawClosedCurve2I((graphics?.value ?: 0L), (pen?.value ?: 0L), (points?.value ?: 0L), count, tension)

public actual fun gdipDrawClosedCurveI(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawClosedCurveI((graphics?.value ?: 0L), (pen?.value ?: 0L), (points?.value ?: 0L), count)

public actual fun gdipDrawCurve(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawCurve((graphics?.value ?: 0L), (pen?.value ?: 0L), (points?.value ?: 0L), count)

public actual fun gdipDrawCurve2(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawCurve2((graphics?.value ?: 0L), (pen?.value ?: 0L), (points?.value ?: 0L), count, tension)

public actual fun gdipDrawCurve2I(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawCurve2I((graphics?.value ?: 0L), (pen?.value ?: 0L), (points?.value ?: 0L), count, tension)

public actual fun gdipDrawCurve3(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawCurve3((graphics?.value ?: 0L), (pen?.value ?: 0L), (points?.value ?: 0L), count, offset, numberofsegments, tension)

public actual fun gdipDrawCurve3I(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawCurve3I((graphics?.value ?: 0L), (pen?.value ?: 0L), (points?.value ?: 0L), count, offset, numberofsegments, tension)

public actual fun gdipDrawCurveI(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawCurveI((graphics?.value ?: 0L), (pen?.value ?: 0L), (points?.value ?: 0L), count)

public actual fun gdipDrawDriverString(graphics: COpaquePointer?, text: COpaquePointer?, length: Int, font: COpaquePointer?, brush: COpaquePointer?, positions: COpaquePointer?, flags: Int, matrix: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawDriverString((graphics?.value ?: 0L), (text?.value ?: 0L), length, (font?.value ?: 0L), (brush?.value ?: 0L), (positions?.value ?: 0L), flags, (matrix?.value ?: 0L))

public actual fun gdipDrawEllipse(graphics: COpaquePointer?, pen: COpaquePointer?, x: Float, y: Float, width: Float, height: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawEllipse((graphics?.value ?: 0L), (pen?.value ?: 0L), x, y, width, height)

public actual fun gdipDrawEllipseI(graphics: COpaquePointer?, pen: COpaquePointer?, x: Int, y: Int, width: Int, height: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawEllipseI((graphics?.value ?: 0L), (pen?.value ?: 0L), x, y, width, height)

public actual fun gdipDrawImage(graphics: COpaquePointer?, image: COpaquePointer?, x: Float, y: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawImage((graphics?.value ?: 0L), (image?.value ?: 0L), x, y)

public actual fun gdipDrawImageFX(graphics: COpaquePointer?, image: COpaquePointer?, source: COpaquePointer?, xform: COpaquePointer?, effect: COpaquePointer?, imageattributes: COpaquePointer?, srcunit: Unit): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawImageFX((graphics?.value ?: 0L), (image?.value ?: 0L), (source?.value ?: 0L), (xform?.value ?: 0L), (effect?.value ?: 0L), (imageattributes?.value ?: 0L), srcunit)

public actual fun gdipDrawImageI(graphics: COpaquePointer?, image: COpaquePointer?, x: Int, y: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawImageI((graphics?.value ?: 0L), (image?.value ?: 0L), x, y)

public actual fun gdipDrawImagePointRect(graphics: COpaquePointer?, image: COpaquePointer?, x: Float, y: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawImagePointRect((graphics?.value ?: 0L), (image?.value ?: 0L), x, y, srcx, srcy, srcwidth, srcheight, srcunit)

public actual fun gdipDrawImagePointRectI(graphics: COpaquePointer?, image: COpaquePointer?, x: Int, y: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawImagePointRectI((graphics?.value ?: 0L), (image?.value ?: 0L), x, y, srcx, srcy, srcwidth, srcheight, srcunit)

public actual fun gdipDrawImagePoints(graphics: COpaquePointer?, image: COpaquePointer?, dstpoints: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawImagePoints((graphics?.value ?: 0L), (image?.value ?: 0L), (dstpoints?.value ?: 0L), count)

public actual fun gdipDrawImagePointsI(graphics: COpaquePointer?, image: COpaquePointer?, dstpoints: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawImagePointsI((graphics?.value ?: 0L), (image?.value ?: 0L), (dstpoints?.value ?: 0L), count)

public actual fun gdipDrawImagePointsRect(graphics: COpaquePointer?, image: COpaquePointer?, points: COpaquePointer?, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawImagePointsRect((graphics?.value ?: 0L), (image?.value ?: 0L), (points?.value ?: 0L), count, srcx, srcy, srcwidth, srcheight, srcunit, (imageattributes?.value ?: 0L), callback, (callbackdata?.value ?: 0L))

public actual fun gdipDrawImagePointsRectI(graphics: COpaquePointer?, image: COpaquePointer?, points: COpaquePointer?, count: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawImagePointsRectI((graphics?.value ?: 0L), (image?.value ?: 0L), (points?.value ?: 0L), count, srcx, srcy, srcwidth, srcheight, srcunit, (imageattributes?.value ?: 0L), callback, (callbackdata?.value ?: 0L))

public actual fun gdipDrawImageRect(graphics: COpaquePointer?, image: COpaquePointer?, x: Float, y: Float, width: Float, height: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawImageRect((graphics?.value ?: 0L), (image?.value ?: 0L), x, y, width, height)

public actual fun gdipDrawImageRectI(graphics: COpaquePointer?, image: COpaquePointer?, x: Int, y: Int, width: Int, height: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawImageRectI((graphics?.value ?: 0L), (image?.value ?: 0L), x, y, width, height)

public actual fun gdipDrawImageRectRect(graphics: COpaquePointer?, image: COpaquePointer?, dstx: Float, dsty: Float, dstwidth: Float, dstheight: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawImageRectRect((graphics?.value ?: 0L), (image?.value ?: 0L), dstx, dsty, dstwidth, dstheight, srcx, srcy, srcwidth, srcheight, srcunit, (imageattributes?.value ?: 0L), callback, (callbackdata?.value ?: 0L))

public actual fun gdipDrawImageRectRectI(graphics: COpaquePointer?, image: COpaquePointer?, dstx: Int, dsty: Int, dstwidth: Int, dstheight: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawImageRectRectI((graphics?.value ?: 0L), (image?.value ?: 0L), dstx, dsty, dstwidth, dstheight, srcx, srcy, srcwidth, srcheight, srcunit, (imageattributes?.value ?: 0L), callback, (callbackdata?.value ?: 0L))

public actual fun gdipDrawLine(graphics: COpaquePointer?, pen: COpaquePointer?, x1: Float, y1: Float, x2: Float, y2: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawLine((graphics?.value ?: 0L), (pen?.value ?: 0L), x1, y1, x2, y2)

public actual fun gdipDrawLineI(graphics: COpaquePointer?, pen: COpaquePointer?, x1: Int, y1: Int, x2: Int, y2: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawLineI((graphics?.value ?: 0L), (pen?.value ?: 0L), x1, y1, x2, y2)

public actual fun gdipDrawLines(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawLines((graphics?.value ?: 0L), (pen?.value ?: 0L), (points?.value ?: 0L), count)

public actual fun gdipDrawLinesI(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawLinesI((graphics?.value ?: 0L), (pen?.value ?: 0L), (points?.value ?: 0L), count)

public actual fun gdipDrawPath(graphics: COpaquePointer?, pen: COpaquePointer?, path: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawPath((graphics?.value ?: 0L), (pen?.value ?: 0L), (path?.value ?: 0L))

public actual fun gdipDrawPie(graphics: COpaquePointer?, pen: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawPie((graphics?.value ?: 0L), (pen?.value ?: 0L), x, y, width, height, startangle, sweepangle)

public actual fun gdipDrawPieI(graphics: COpaquePointer?, pen: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawPieI((graphics?.value ?: 0L), (pen?.value ?: 0L), x, y, width, height, startangle, sweepangle)

public actual fun gdipDrawPolygon(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawPolygon((graphics?.value ?: 0L), (pen?.value ?: 0L), (points?.value ?: 0L), count)

public actual fun gdipDrawPolygonI(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawPolygonI((graphics?.value ?: 0L), (pen?.value ?: 0L), (points?.value ?: 0L), count)

public actual fun gdipDrawRectangle(graphics: COpaquePointer?, pen: COpaquePointer?, x: Float, y: Float, width: Float, height: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawRectangle((graphics?.value ?: 0L), (pen?.value ?: 0L), x, y, width, height)

public actual fun gdipDrawRectangleI(graphics: COpaquePointer?, pen: COpaquePointer?, x: Int, y: Int, width: Int, height: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawRectangleI((graphics?.value ?: 0L), (pen?.value ?: 0L), x, y, width, height)

public actual fun gdipDrawRectangles(graphics: COpaquePointer?, pen: COpaquePointer?, rects: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawRectangles((graphics?.value ?: 0L), (pen?.value ?: 0L), (rects?.value ?: 0L), count)

public actual fun gdipDrawRectanglesI(graphics: COpaquePointer?, pen: COpaquePointer?, rects: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawRectanglesI((graphics?.value ?: 0L), (pen?.value ?: 0L), (rects?.value ?: 0L), count)

public actual fun gdipDrawString(graphics: COpaquePointer?, string: Pcwstr, length: Int, font: COpaquePointer?, layoutrect: COpaquePointer?, stringformat: COpaquePointer?, brush: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipDrawString((graphics?.value ?: 0L), (string?.value ?: 0L), length, (font?.value ?: 0L), (layoutrect?.value ?: 0L), (stringformat?.value ?: 0L), (brush?.value ?: 0L))

public actual fun gdipEmfToWmfBits(hemf: Henhmetafile, cbdata16: UInt, pdata16: COpaquePointer?, imapmode: Int, eflags: Int): UInt =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipEmfToWmfBits((hemf?.value ?: 0L), cbdata16.toInt(), (pdata16?.value ?: 0L), imapmode, eflags).toUInt()

public actual fun gdipEndContainer(graphics: COpaquePointer?, state: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipEndContainer((graphics?.value ?: 0L), state.toInt())

public actual fun gdipEnumerateMetafileDestPoint(graphics: COpaquePointer?, metafile: COpaquePointer?, destpoint: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileDestPoint((graphics?.value ?: 0L), (metafile?.value ?: 0L), (destpoint?.value ?: 0L), callback, (callbackdata?.value ?: 0L), (imageattributes?.value ?: 0L))

public actual fun gdipEnumerateMetafileDestPointI(graphics: COpaquePointer?, metafile: COpaquePointer?, destpoint: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileDestPointI((graphics?.value ?: 0L), (metafile?.value ?: 0L), (destpoint?.value ?: 0L), callback, (callbackdata?.value ?: 0L), (imageattributes?.value ?: 0L))

public actual fun gdipEnumerateMetafileDestPoints(graphics: COpaquePointer?, metafile: COpaquePointer?, destpoints: COpaquePointer?, count: Int, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileDestPoints((graphics?.value ?: 0L), (metafile?.value ?: 0L), (destpoints?.value ?: 0L), count, callback, (callbackdata?.value ?: 0L), (imageattributes?.value ?: 0L))

public actual fun gdipEnumerateMetafileDestPointsI(graphics: COpaquePointer?, metafile: COpaquePointer?, destpoints: COpaquePointer?, count: Int, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileDestPointsI((graphics?.value ?: 0L), (metafile?.value ?: 0L), (destpoints?.value ?: 0L), count, callback, (callbackdata?.value ?: 0L), (imageattributes?.value ?: 0L))

public actual fun gdipEnumerateMetafileDestRect(graphics: COpaquePointer?, metafile: COpaquePointer?, destrect: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileDestRect((graphics?.value ?: 0L), (metafile?.value ?: 0L), (destrect?.value ?: 0L), callback, (callbackdata?.value ?: 0L), (imageattributes?.value ?: 0L))

public actual fun gdipEnumerateMetafileDestRectI(graphics: COpaquePointer?, metafile: COpaquePointer?, destrect: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileDestRectI((graphics?.value ?: 0L), (metafile?.value ?: 0L), (destrect?.value ?: 0L), callback, (callbackdata?.value ?: 0L), (imageattributes?.value ?: 0L))

public actual fun gdipEnumerateMetafileSrcRectDestPoint(graphics: COpaquePointer?, metafile: COpaquePointer?, destpoint: COpaquePointer?, srcrect: COpaquePointer?, srcunit: Unit, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileSrcRectDestPoint((graphics?.value ?: 0L), (metafile?.value ?: 0L), (destpoint?.value ?: 0L), (srcrect?.value ?: 0L), srcunit, callback, (callbackdata?.value ?: 0L), (imageattributes?.value ?: 0L))

public actual fun gdipEnumerateMetafileSrcRectDestPointI(graphics: COpaquePointer?, metafile: COpaquePointer?, destpoint: COpaquePointer?, srcrect: COpaquePointer?, srcunit: Unit, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileSrcRectDestPointI((graphics?.value ?: 0L), (metafile?.value ?: 0L), (destpoint?.value ?: 0L), (srcrect?.value ?: 0L), srcunit, callback, (callbackdata?.value ?: 0L), (imageattributes?.value ?: 0L))

public actual fun gdipEnumerateMetafileSrcRectDestPoints(graphics: COpaquePointer?, metafile: COpaquePointer?, destpoints: COpaquePointer?, count: Int, srcrect: COpaquePointer?, srcunit: Unit, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileSrcRectDestPoints((graphics?.value ?: 0L), (metafile?.value ?: 0L), (destpoints?.value ?: 0L), count, (srcrect?.value ?: 0L), srcunit, callback, (callbackdata?.value ?: 0L), (imageattributes?.value ?: 0L))

public actual fun gdipEnumerateMetafileSrcRectDestPointsI(graphics: COpaquePointer?, metafile: COpaquePointer?, destpoints: COpaquePointer?, count: Int, srcrect: COpaquePointer?, srcunit: Unit, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileSrcRectDestPointsI((graphics?.value ?: 0L), (metafile?.value ?: 0L), (destpoints?.value ?: 0L), count, (srcrect?.value ?: 0L), srcunit, callback, (callbackdata?.value ?: 0L), (imageattributes?.value ?: 0L))

public actual fun gdipEnumerateMetafileSrcRectDestRect(graphics: COpaquePointer?, metafile: COpaquePointer?, destrect: COpaquePointer?, srcrect: COpaquePointer?, srcunit: Unit, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileSrcRectDestRect((graphics?.value ?: 0L), (metafile?.value ?: 0L), (destrect?.value ?: 0L), (srcrect?.value ?: 0L), srcunit, callback, (callbackdata?.value ?: 0L), (imageattributes?.value ?: 0L))

public actual fun gdipEnumerateMetafileSrcRectDestRectI(graphics: COpaquePointer?, metafile: COpaquePointer?, destrect: COpaquePointer?, srcrect: COpaquePointer?, srcunit: Unit, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipEnumerateMetafileSrcRectDestRectI((graphics?.value ?: 0L), (metafile?.value ?: 0L), (destrect?.value ?: 0L), (srcrect?.value ?: 0L), srcunit, callback, (callbackdata?.value ?: 0L), (imageattributes?.value ?: 0L))

public actual fun gdipFillClosedCurve(graphics: COpaquePointer?, brush: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipFillClosedCurve((graphics?.value ?: 0L), (brush?.value ?: 0L), (points?.value ?: 0L), count)

public actual fun gdipFillClosedCurve2(graphics: COpaquePointer?, brush: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float, fillmode: FillMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipFillClosedCurve2((graphics?.value ?: 0L), (brush?.value ?: 0L), (points?.value ?: 0L), count, tension, fillmode)

public actual fun gdipFillClosedCurve2I(graphics: COpaquePointer?, brush: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float, fillmode: FillMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipFillClosedCurve2I((graphics?.value ?: 0L), (brush?.value ?: 0L), (points?.value ?: 0L), count, tension, fillmode)

public actual fun gdipFillClosedCurveI(graphics: COpaquePointer?, brush: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipFillClosedCurveI((graphics?.value ?: 0L), (brush?.value ?: 0L), (points?.value ?: 0L), count)

public actual fun gdipFillEllipse(graphics: COpaquePointer?, brush: COpaquePointer?, x: Float, y: Float, width: Float, height: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipFillEllipse((graphics?.value ?: 0L), (brush?.value ?: 0L), x, y, width, height)

public actual fun gdipFillEllipseI(graphics: COpaquePointer?, brush: COpaquePointer?, x: Int, y: Int, width: Int, height: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipFillEllipseI((graphics?.value ?: 0L), (brush?.value ?: 0L), x, y, width, height)

public actual fun gdipFillPath(graphics: COpaquePointer?, brush: COpaquePointer?, path: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipFillPath((graphics?.value ?: 0L), (brush?.value ?: 0L), (path?.value ?: 0L))

public actual fun gdipFillPie(graphics: COpaquePointer?, brush: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipFillPie((graphics?.value ?: 0L), (brush?.value ?: 0L), x, y, width, height, startangle, sweepangle)

public actual fun gdipFillPieI(graphics: COpaquePointer?, brush: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipFillPieI((graphics?.value ?: 0L), (brush?.value ?: 0L), x, y, width, height, startangle, sweepangle)

public actual fun gdipFillPolygon(graphics: COpaquePointer?, brush: COpaquePointer?, points: COpaquePointer?, count: Int, fillmode: FillMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipFillPolygon((graphics?.value ?: 0L), (brush?.value ?: 0L), (points?.value ?: 0L), count, fillmode)

public actual fun gdipFillPolygon2(graphics: COpaquePointer?, brush: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipFillPolygon2((graphics?.value ?: 0L), (brush?.value ?: 0L), (points?.value ?: 0L), count)

public actual fun gdipFillPolygon2I(graphics: COpaquePointer?, brush: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipFillPolygon2I((graphics?.value ?: 0L), (brush?.value ?: 0L), (points?.value ?: 0L), count)

public actual fun gdipFillPolygonI(graphics: COpaquePointer?, brush: COpaquePointer?, points: COpaquePointer?, count: Int, fillmode: FillMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipFillPolygonI((graphics?.value ?: 0L), (brush?.value ?: 0L), (points?.value ?: 0L), count, fillmode)

public actual fun gdipFillRectangle(graphics: COpaquePointer?, brush: COpaquePointer?, x: Float, y: Float, width: Float, height: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipFillRectangle((graphics?.value ?: 0L), (brush?.value ?: 0L), x, y, width, height)

public actual fun gdipFillRectangleI(graphics: COpaquePointer?, brush: COpaquePointer?, x: Int, y: Int, width: Int, height: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipFillRectangleI((graphics?.value ?: 0L), (brush?.value ?: 0L), x, y, width, height)

public actual fun gdipFillRectangles(graphics: COpaquePointer?, brush: COpaquePointer?, rects: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipFillRectangles((graphics?.value ?: 0L), (brush?.value ?: 0L), (rects?.value ?: 0L), count)

public actual fun gdipFillRectanglesI(graphics: COpaquePointer?, brush: COpaquePointer?, rects: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipFillRectanglesI((graphics?.value ?: 0L), (brush?.value ?: 0L), (rects?.value ?: 0L), count)

public actual fun gdipFillRegion(graphics: COpaquePointer?, brush: COpaquePointer?, region: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipFillRegion((graphics?.value ?: 0L), (brush?.value ?: 0L), (region?.value ?: 0L))

public actual fun gdipFindFirstImageItem(image: COpaquePointer?, item: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipFindFirstImageItem((image?.value ?: 0L), (item?.value ?: 0L))

public actual fun gdipFindNextImageItem(image: COpaquePointer?, item: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipFindNextImageItem((image?.value ?: 0L), (item?.value ?: 0L))

public actual fun gdipFlattenPath(path: COpaquePointer?, matrix: COpaquePointer?, flatness: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipFlattenPath((path?.value ?: 0L), (matrix?.value ?: 0L), flatness)

public actual fun gdipFlush(graphics: COpaquePointer?, intention: FlushIntention): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipFlush((graphics?.value ?: 0L), intention)

public actual fun gdipFree(ptr: COpaquePointer?) {
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipFree((ptr?.value ?: 0L))
}

public actual fun gdipGetAdjustableArrowCapFillState(cap: COpaquePointer?, fillstate: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetAdjustableArrowCapFillState((cap?.value ?: 0L), (fillstate?.value ?: 0L))

public actual fun gdipGetAdjustableArrowCapHeight(cap: COpaquePointer?, height: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetAdjustableArrowCapHeight((cap?.value ?: 0L), (height?.value ?: 0L))

public actual fun gdipGetAdjustableArrowCapMiddleInset(cap: COpaquePointer?, middleinset: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetAdjustableArrowCapMiddleInset((cap?.value ?: 0L), (middleinset?.value ?: 0L))

public actual fun gdipGetAdjustableArrowCapWidth(cap: COpaquePointer?, width: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetAdjustableArrowCapWidth((cap?.value ?: 0L), (width?.value ?: 0L))

public actual fun gdipGetAllPropertyItems(image: COpaquePointer?, totalbuffersize: UInt, numproperties: UInt, allitems: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetAllPropertyItems((image?.value ?: 0L), totalbuffersize.toInt(), numproperties.toInt(), (allitems?.value ?: 0L))

public actual fun gdipGetBrushType(brush: COpaquePointer?, type: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetBrushType((brush?.value ?: 0L), (type?.value ?: 0L))

public actual fun gdipGetCellAscent(family: COpaquePointer?, style: Int, cellascent: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetCellAscent((family?.value ?: 0L), style, (cellascent?.value ?: 0L))

public actual fun gdipGetCellDescent(family: COpaquePointer?, style: Int, celldescent: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetCellDescent((family?.value ?: 0L), style, (celldescent?.value ?: 0L))

public actual fun gdipGetClip(graphics: COpaquePointer?, region: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetClip((graphics?.value ?: 0L), (region?.value ?: 0L))

public actual fun gdipGetClipBounds(graphics: COpaquePointer?, rect: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetClipBounds((graphics?.value ?: 0L), (rect?.value ?: 0L))

public actual fun gdipGetClipBoundsI(graphics: COpaquePointer?, rect: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetClipBoundsI((graphics?.value ?: 0L), (rect?.value ?: 0L))

public actual fun gdipGetCompositingMode(graphics: COpaquePointer?, compositingmode: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetCompositingMode((graphics?.value ?: 0L), (compositingmode?.value ?: 0L))

public actual fun gdipGetCompositingQuality(graphics: COpaquePointer?, compositingquality: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetCompositingQuality((graphics?.value ?: 0L), (compositingquality?.value ?: 0L))

public actual fun gdipGetCustomLineCapBaseCap(customcap: COpaquePointer?, basecap: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetCustomLineCapBaseCap((customcap?.value ?: 0L), (basecap?.value ?: 0L))

public actual fun gdipGetCustomLineCapBaseInset(customcap: COpaquePointer?, inset: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetCustomLineCapBaseInset((customcap?.value ?: 0L), (inset?.value ?: 0L))

public actual fun gdipGetCustomLineCapStrokeCaps(customcap: COpaquePointer?, startcap: COpaquePointer?, endcap: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetCustomLineCapStrokeCaps((customcap?.value ?: 0L), (startcap?.value ?: 0L), (endcap?.value ?: 0L))

public actual fun gdipGetCustomLineCapStrokeJoin(customcap: COpaquePointer?, linejoin: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetCustomLineCapStrokeJoin((customcap?.value ?: 0L), (linejoin?.value ?: 0L))

public actual fun gdipGetCustomLineCapType(customcap: COpaquePointer?, captype: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetCustomLineCapType((customcap?.value ?: 0L), (captype?.value ?: 0L))

public actual fun gdipGetCustomLineCapWidthScale(customcap: COpaquePointer?, widthscale: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetCustomLineCapWidthScale((customcap?.value ?: 0L), (widthscale?.value ?: 0L))

public actual fun gdipGetDC(graphics: COpaquePointer?, hdc: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetDC((graphics?.value ?: 0L), (hdc?.value ?: 0L))

public actual fun gdipGetDpiX(graphics: COpaquePointer?, dpi: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetDpiX((graphics?.value ?: 0L), (dpi?.value ?: 0L))

public actual fun gdipGetDpiY(graphics: COpaquePointer?, dpi: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetDpiY((graphics?.value ?: 0L), (dpi?.value ?: 0L))

public actual fun gdipGetEffectParameterSize(effect: COpaquePointer?, size: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetEffectParameterSize((effect?.value ?: 0L), (size?.value ?: 0L))

public actual fun gdipGetEffectParameters(effect: COpaquePointer?, size: COpaquePointer?, params: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetEffectParameters((effect?.value ?: 0L), (size?.value ?: 0L), (params?.value ?: 0L))

public actual fun gdipGetEmHeight(family: COpaquePointer?, style: Int, emheight: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetEmHeight((family?.value ?: 0L), style, (emheight?.value ?: 0L))

public actual fun gdipGetEncoderParameterList(image: COpaquePointer?, clsidencoder: COpaquePointer?, size: UInt, buffer: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetEncoderParameterList((image?.value ?: 0L), (clsidencoder?.value ?: 0L), size.toInt(), (buffer?.value ?: 0L))

public actual fun gdipGetEncoderParameterListSize(image: COpaquePointer?, clsidencoder: COpaquePointer?, size: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetEncoderParameterListSize((image?.value ?: 0L), (clsidencoder?.value ?: 0L), (size?.value ?: 0L))

public actual fun gdipGetFamily(font: COpaquePointer?, family: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetFamily((font?.value ?: 0L), (family?.value ?: 0L))

public actual fun gdipGetFamilyName(family: COpaquePointer?, name: Pwstr, language: UShort): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetFamilyName((family?.value ?: 0L), (name?.value ?: 0L), language.toShort())

public actual fun gdipGetFontCollectionFamilyCount(fontcollection: COpaquePointer?, numfound: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetFontCollectionFamilyCount((fontcollection?.value ?: 0L), (numfound?.value ?: 0L))

public actual fun gdipGetFontCollectionFamilyList(fontcollection: COpaquePointer?, numsought: Int, gpfamilies: COpaquePointer?, numfound: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetFontCollectionFamilyList((fontcollection?.value ?: 0L), numsought, (gpfamilies?.value ?: 0L), (numfound?.value ?: 0L))

public actual fun gdipGetFontHeight(font: COpaquePointer?, graphics: COpaquePointer?, height: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetFontHeight((font?.value ?: 0L), (graphics?.value ?: 0L), (height?.value ?: 0L))

public actual fun gdipGetFontHeightGivenDPI(font: COpaquePointer?, dpi: Float, height: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetFontHeightGivenDPI((font?.value ?: 0L), dpi, (height?.value ?: 0L))

public actual fun gdipGetFontSize(font: COpaquePointer?, size: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetFontSize((font?.value ?: 0L), (size?.value ?: 0L))

public actual fun gdipGetFontStyle(font: COpaquePointer?, style: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetFontStyle((font?.value ?: 0L), (style?.value ?: 0L))

public actual fun gdipGetFontUnit(font: COpaquePointer?, unit: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetFontUnit((font?.value ?: 0L), (unit?.value ?: 0L))

public actual fun gdipGetGenericFontFamilyMonospace(nativefamily: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetGenericFontFamilyMonospace((nativefamily?.value ?: 0L))

public actual fun gdipGetGenericFontFamilySansSerif(nativefamily: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetGenericFontFamilySansSerif((nativefamily?.value ?: 0L))

public actual fun gdipGetGenericFontFamilySerif(nativefamily: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetGenericFontFamilySerif((nativefamily?.value ?: 0L))

public actual fun gdipGetHatchBackgroundColor(brush: COpaquePointer?, backcol: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetHatchBackgroundColor((brush?.value ?: 0L), (backcol?.value ?: 0L))

public actual fun gdipGetHatchForegroundColor(brush: COpaquePointer?, forecol: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetHatchForegroundColor((brush?.value ?: 0L), (forecol?.value ?: 0L))

public actual fun gdipGetHatchStyle(brush: COpaquePointer?, hatchstyle: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetHatchStyle((brush?.value ?: 0L), (hatchstyle?.value ?: 0L))

public actual fun gdipGetHemfFromMetafile(metafile: COpaquePointer?, hemf: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetHemfFromMetafile((metafile?.value ?: 0L), (hemf?.value ?: 0L))

public actual fun gdipGetImageAttributesAdjustedPalette(imageattr: COpaquePointer?, colorpalette: COpaquePointer?, coloradjusttype: ColorAdjustType): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetImageAttributesAdjustedPalette((imageattr?.value ?: 0L), (colorpalette?.value ?: 0L), coloradjusttype)

public actual fun gdipGetImageBounds(image: COpaquePointer?, srcrect: COpaquePointer?, srcunit: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetImageBounds((image?.value ?: 0L), (srcrect?.value ?: 0L), (srcunit?.value ?: 0L))

public actual fun gdipGetImageDecoders(numdecoders: UInt, size: UInt, decoders: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetImageDecoders(numdecoders.toInt(), size.toInt(), (decoders?.value ?: 0L))

public actual fun gdipGetImageDecodersSize(numdecoders: COpaquePointer?, size: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetImageDecodersSize((numdecoders?.value ?: 0L), (size?.value ?: 0L))

public actual fun gdipGetImageDimension(image: COpaquePointer?, width: COpaquePointer?, height: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetImageDimension((image?.value ?: 0L), (width?.value ?: 0L), (height?.value ?: 0L))

public actual fun gdipGetImageEncoders(numencoders: UInt, size: UInt, encoders: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetImageEncoders(numencoders.toInt(), size.toInt(), (encoders?.value ?: 0L))

public actual fun gdipGetImageEncodersSize(numencoders: COpaquePointer?, size: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetImageEncodersSize((numencoders?.value ?: 0L), (size?.value ?: 0L))

public actual fun gdipGetImageFlags(image: COpaquePointer?, flags: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetImageFlags((image?.value ?: 0L), (flags?.value ?: 0L))

public actual fun gdipGetImageGraphicsContext(image: COpaquePointer?, graphics: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetImageGraphicsContext((image?.value ?: 0L), (graphics?.value ?: 0L))

public actual fun gdipGetImageHeight(image: COpaquePointer?, height: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetImageHeight((image?.value ?: 0L), (height?.value ?: 0L))

public actual fun gdipGetImageHorizontalResolution(image: COpaquePointer?, resolution: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetImageHorizontalResolution((image?.value ?: 0L), (resolution?.value ?: 0L))

public actual fun gdipGetImageItemData(image: COpaquePointer?, item: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetImageItemData((image?.value ?: 0L), (item?.value ?: 0L))

public actual fun gdipGetImagePalette(image: COpaquePointer?, palette: COpaquePointer?, size: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetImagePalette((image?.value ?: 0L), (palette?.value ?: 0L), size)

public actual fun gdipGetImagePaletteSize(image: COpaquePointer?, size: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetImagePaletteSize((image?.value ?: 0L), (size?.value ?: 0L))

public actual fun gdipGetImagePixelFormat(image: COpaquePointer?, format: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetImagePixelFormat((image?.value ?: 0L), (format?.value ?: 0L))

public actual fun gdipGetImageRawFormat(image: COpaquePointer?, format: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetImageRawFormat((image?.value ?: 0L), (format?.value ?: 0L))

public actual fun gdipGetImageThumbnail(image: COpaquePointer?, thumbwidth: UInt, thumbheight: UInt, thumbimage: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetImageThumbnail((image?.value ?: 0L), thumbwidth.toInt(), thumbheight.toInt(), (thumbimage?.value ?: 0L), callback, (callbackdata?.value ?: 0L))

public actual fun gdipGetImageType(image: COpaquePointer?, type: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetImageType((image?.value ?: 0L), (type?.value ?: 0L))

public actual fun gdipGetImageVerticalResolution(image: COpaquePointer?, resolution: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetImageVerticalResolution((image?.value ?: 0L), (resolution?.value ?: 0L))

public actual fun gdipGetImageWidth(image: COpaquePointer?, width: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetImageWidth((image?.value ?: 0L), (width?.value ?: 0L))

public actual fun gdipGetInterpolationMode(graphics: COpaquePointer?, interpolationmode: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetInterpolationMode((graphics?.value ?: 0L), (interpolationmode?.value ?: 0L))

public actual fun gdipGetLineBlend(brush: COpaquePointer?, blend: COpaquePointer?, positions: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetLineBlend((brush?.value ?: 0L), (blend?.value ?: 0L), (positions?.value ?: 0L), count)

public actual fun gdipGetLineBlendCount(brush: COpaquePointer?, count: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetLineBlendCount((brush?.value ?: 0L), (count?.value ?: 0L))

public actual fun gdipGetLineColors(brush: COpaquePointer?, colors: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetLineColors((brush?.value ?: 0L), (colors?.value ?: 0L))

public actual fun gdipGetLineGammaCorrection(brush: COpaquePointer?, usegammacorrection: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetLineGammaCorrection((brush?.value ?: 0L), (usegammacorrection?.value ?: 0L))

public actual fun gdipGetLinePresetBlend(brush: COpaquePointer?, blend: COpaquePointer?, positions: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetLinePresetBlend((brush?.value ?: 0L), (blend?.value ?: 0L), (positions?.value ?: 0L), count)

public actual fun gdipGetLinePresetBlendCount(brush: COpaquePointer?, count: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetLinePresetBlendCount((brush?.value ?: 0L), (count?.value ?: 0L))

public actual fun gdipGetLineRect(brush: COpaquePointer?, rect: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetLineRect((brush?.value ?: 0L), (rect?.value ?: 0L))

public actual fun gdipGetLineRectI(brush: COpaquePointer?, rect: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetLineRectI((brush?.value ?: 0L), (rect?.value ?: 0L))

public actual fun gdipGetLineSpacing(family: COpaquePointer?, style: Int, linespacing: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetLineSpacing((family?.value ?: 0L), style, (linespacing?.value ?: 0L))

public actual fun gdipGetLineTransform(brush: COpaquePointer?, matrix: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetLineTransform((brush?.value ?: 0L), (matrix?.value ?: 0L))

public actual fun gdipGetLineWrapMode(brush: COpaquePointer?, wrapmode: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetLineWrapMode((brush?.value ?: 0L), (wrapmode?.value ?: 0L))

public actual fun gdipGetLogFontA(font: COpaquePointer?, graphics: COpaquePointer?, logfonta: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetLogFontA((font?.value ?: 0L), (graphics?.value ?: 0L), (logfonta?.value ?: 0L))

public actual fun gdipGetLogFontW(font: COpaquePointer?, graphics: COpaquePointer?, logfontw: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetLogFontW((font?.value ?: 0L), (graphics?.value ?: 0L), (logfontw?.value ?: 0L))

public actual fun gdipGetMatrixElements(matrix: COpaquePointer?, matrixout: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetMatrixElements((matrix?.value ?: 0L), (matrixout?.value ?: 0L))

public actual fun gdipGetMetafileDownLevelRasterizationLimit(metafile: COpaquePointer?, metafilerasterizationlimitdpi: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetMetafileDownLevelRasterizationLimit((metafile?.value ?: 0L), (metafilerasterizationlimitdpi?.value ?: 0L))

public actual fun gdipGetMetafileHeaderFromEmf(hemf: Henhmetafile, header: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetMetafileHeaderFromEmf((hemf?.value ?: 0L), (header?.value ?: 0L))

public actual fun gdipGetMetafileHeaderFromFile(filename: Pcwstr, header: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetMetafileHeaderFromFile((filename?.value ?: 0L), (header?.value ?: 0L))

public actual fun gdipGetMetafileHeaderFromMetafile(metafile: COpaquePointer?, header: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetMetafileHeaderFromMetafile((metafile?.value ?: 0L), (header?.value ?: 0L))

public actual fun gdipGetMetafileHeaderFromStream(stream: COpaquePointer?, header: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetMetafileHeaderFromStream((stream?.value ?: 0L), (header?.value ?: 0L))

public actual fun gdipGetMetafileHeaderFromWmf(hwmf: Hmetafile, wmfplaceablefileheader: COpaquePointer?, header: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetMetafileHeaderFromWmf((hwmf?.value ?: 0L), (wmfplaceablefileheader?.value ?: 0L), (header?.value ?: 0L))

public actual fun gdipGetNearestColor(graphics: COpaquePointer?, argb: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetNearestColor((graphics?.value ?: 0L), (argb?.value ?: 0L))

public actual fun gdipGetPageScale(graphics: COpaquePointer?, scale: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPageScale((graphics?.value ?: 0L), (scale?.value ?: 0L))

public actual fun gdipGetPageUnit(graphics: COpaquePointer?, unit: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPageUnit((graphics?.value ?: 0L), (unit?.value ?: 0L))

public actual fun gdipGetPathData(path: COpaquePointer?, pathdata: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPathData((path?.value ?: 0L), (pathdata?.value ?: 0L))

public actual fun gdipGetPathFillMode(path: COpaquePointer?, fillmode: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPathFillMode((path?.value ?: 0L), (fillmode?.value ?: 0L))

public actual fun gdipGetPathGradientBlend(brush: COpaquePointer?, blend: COpaquePointer?, positions: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientBlend((brush?.value ?: 0L), (blend?.value ?: 0L), (positions?.value ?: 0L), count)

public actual fun gdipGetPathGradientBlendCount(brush: COpaquePointer?, count: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientBlendCount((brush?.value ?: 0L), (count?.value ?: 0L))

public actual fun gdipGetPathGradientCenterColor(brush: COpaquePointer?, colors: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientCenterColor((brush?.value ?: 0L), (colors?.value ?: 0L))

public actual fun gdipGetPathGradientCenterPoint(brush: COpaquePointer?, points: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientCenterPoint((brush?.value ?: 0L), (points?.value ?: 0L))

public actual fun gdipGetPathGradientCenterPointI(brush: COpaquePointer?, points: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientCenterPointI((brush?.value ?: 0L), (points?.value ?: 0L))

public actual fun gdipGetPathGradientFocusScales(brush: COpaquePointer?, xscale: COpaquePointer?, yscale: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientFocusScales((brush?.value ?: 0L), (xscale?.value ?: 0L), (yscale?.value ?: 0L))

public actual fun gdipGetPathGradientGammaCorrection(brush: COpaquePointer?, usegammacorrection: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientGammaCorrection((brush?.value ?: 0L), (usegammacorrection?.value ?: 0L))

public actual fun gdipGetPathGradientPath(brush: COpaquePointer?, path: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientPath((brush?.value ?: 0L), (path?.value ?: 0L))

public actual fun gdipGetPathGradientPointCount(brush: COpaquePointer?, count: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientPointCount((brush?.value ?: 0L), (count?.value ?: 0L))

public actual fun gdipGetPathGradientPresetBlend(brush: COpaquePointer?, blend: COpaquePointer?, positions: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientPresetBlend((brush?.value ?: 0L), (blend?.value ?: 0L), (positions?.value ?: 0L), count)

public actual fun gdipGetPathGradientPresetBlendCount(brush: COpaquePointer?, count: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientPresetBlendCount((brush?.value ?: 0L), (count?.value ?: 0L))

public actual fun gdipGetPathGradientRect(brush: COpaquePointer?, rect: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientRect((brush?.value ?: 0L), (rect?.value ?: 0L))

public actual fun gdipGetPathGradientRectI(brush: COpaquePointer?, rect: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientRectI((brush?.value ?: 0L), (rect?.value ?: 0L))

public actual fun gdipGetPathGradientSurroundColorCount(brush: COpaquePointer?, count: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientSurroundColorCount((brush?.value ?: 0L), (count?.value ?: 0L))

public actual fun gdipGetPathGradientSurroundColorsWithCount(brush: COpaquePointer?, color: COpaquePointer?, count: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientSurroundColorsWithCount((brush?.value ?: 0L), (color?.value ?: 0L), (count?.value ?: 0L))

public actual fun gdipGetPathGradientTransform(brush: COpaquePointer?, matrix: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientTransform((brush?.value ?: 0L), (matrix?.value ?: 0L))

public actual fun gdipGetPathGradientWrapMode(brush: COpaquePointer?, wrapmode: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPathGradientWrapMode((brush?.value ?: 0L), (wrapmode?.value ?: 0L))

public actual fun gdipGetPathLastPoint(path: COpaquePointer?, lastpoint: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPathLastPoint((path?.value ?: 0L), (lastpoint?.value ?: 0L))

public actual fun gdipGetPathPoints(param0: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPathPoints((param0?.value ?: 0L), (points?.value ?: 0L), count)

public actual fun gdipGetPathPointsI(param0: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPathPointsI((param0?.value ?: 0L), (points?.value ?: 0L), count)

public actual fun gdipGetPathTypes(path: COpaquePointer?, types: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPathTypes((path?.value ?: 0L), (types?.value ?: 0L), count)

public actual fun gdipGetPathWorldBounds(path: COpaquePointer?, bounds: COpaquePointer?, matrix: COpaquePointer?, pen: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPathWorldBounds((path?.value ?: 0L), (bounds?.value ?: 0L), (matrix?.value ?: 0L), (pen?.value ?: 0L))

public actual fun gdipGetPathWorldBoundsI(path: COpaquePointer?, bounds: COpaquePointer?, matrix: COpaquePointer?, pen: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPathWorldBoundsI((path?.value ?: 0L), (bounds?.value ?: 0L), (matrix?.value ?: 0L), (pen?.value ?: 0L))

public actual fun gdipGetPenBrushFill(pen: COpaquePointer?, brush: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPenBrushFill((pen?.value ?: 0L), (brush?.value ?: 0L))

public actual fun gdipGetPenColor(pen: COpaquePointer?, argb: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPenColor((pen?.value ?: 0L), (argb?.value ?: 0L))

public actual fun gdipGetPenCompoundArray(pen: COpaquePointer?, dash: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPenCompoundArray((pen?.value ?: 0L), (dash?.value ?: 0L), count)

public actual fun gdipGetPenCompoundCount(pen: COpaquePointer?, count: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPenCompoundCount((pen?.value ?: 0L), (count?.value ?: 0L))

public actual fun gdipGetPenCustomEndCap(pen: COpaquePointer?, customcap: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPenCustomEndCap((pen?.value ?: 0L), (customcap?.value ?: 0L))

public actual fun gdipGetPenCustomStartCap(pen: COpaquePointer?, customcap: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPenCustomStartCap((pen?.value ?: 0L), (customcap?.value ?: 0L))

public actual fun gdipGetPenDashArray(pen: COpaquePointer?, dash: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPenDashArray((pen?.value ?: 0L), (dash?.value ?: 0L), count)

public actual fun gdipGetPenDashCap197819(pen: COpaquePointer?, dashcap: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPenDashCap197819((pen?.value ?: 0L), (dashcap?.value ?: 0L))

public actual fun gdipGetPenDashCount(pen: COpaquePointer?, count: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPenDashCount((pen?.value ?: 0L), (count?.value ?: 0L))

public actual fun gdipGetPenDashOffset(pen: COpaquePointer?, offset: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPenDashOffset((pen?.value ?: 0L), (offset?.value ?: 0L))

public actual fun gdipGetPenDashStyle(pen: COpaquePointer?, dashstyle: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPenDashStyle((pen?.value ?: 0L), (dashstyle?.value ?: 0L))

public actual fun gdipGetPenEndCap(pen: COpaquePointer?, endcap: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPenEndCap((pen?.value ?: 0L), (endcap?.value ?: 0L))

public actual fun gdipGetPenFillType(pen: COpaquePointer?, type: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPenFillType((pen?.value ?: 0L), (type?.value ?: 0L))

public actual fun gdipGetPenLineJoin(pen: COpaquePointer?, linejoin: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPenLineJoin((pen?.value ?: 0L), (linejoin?.value ?: 0L))

public actual fun gdipGetPenMiterLimit(pen: COpaquePointer?, miterlimit: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPenMiterLimit((pen?.value ?: 0L), (miterlimit?.value ?: 0L))

public actual fun gdipGetPenMode(pen: COpaquePointer?, penmode: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPenMode((pen?.value ?: 0L), (penmode?.value ?: 0L))

public actual fun gdipGetPenStartCap(pen: COpaquePointer?, startcap: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPenStartCap((pen?.value ?: 0L), (startcap?.value ?: 0L))

public actual fun gdipGetPenTransform(pen: COpaquePointer?, matrix: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPenTransform((pen?.value ?: 0L), (matrix?.value ?: 0L))

public actual fun gdipGetPenUnit(pen: COpaquePointer?, unit: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPenUnit((pen?.value ?: 0L), (unit?.value ?: 0L))

public actual fun gdipGetPenWidth(pen: COpaquePointer?, width: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPenWidth((pen?.value ?: 0L), (width?.value ?: 0L))

public actual fun gdipGetPixelOffsetMode(graphics: COpaquePointer?, pixeloffsetmode: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPixelOffsetMode((graphics?.value ?: 0L), (pixeloffsetmode?.value ?: 0L))

public actual fun gdipGetPointCount(path: COpaquePointer?, count: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPointCount((path?.value ?: 0L), (count?.value ?: 0L))

public actual fun gdipGetPropertyCount(image: COpaquePointer?, numofproperty: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPropertyCount((image?.value ?: 0L), (numofproperty?.value ?: 0L))

public actual fun gdipGetPropertyIdList(image: COpaquePointer?, numofproperty: UInt, list: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPropertyIdList((image?.value ?: 0L), numofproperty.toInt(), (list?.value ?: 0L))

public actual fun gdipGetPropertyItem(image: COpaquePointer?, propid: UInt, propsize: UInt, buffer: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPropertyItem((image?.value ?: 0L), propid.toInt(), propsize.toInt(), (buffer?.value ?: 0L))

public actual fun gdipGetPropertyItemSize(image: COpaquePointer?, propid: UInt, size: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPropertyItemSize((image?.value ?: 0L), propid.toInt(), (size?.value ?: 0L))

public actual fun gdipGetPropertySize(image: COpaquePointer?, totalbuffersize: COpaquePointer?, numproperties: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetPropertySize((image?.value ?: 0L), (totalbuffersize?.value ?: 0L), (numproperties?.value ?: 0L))

public actual fun gdipGetRegionBounds(region: COpaquePointer?, graphics: COpaquePointer?, rect: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetRegionBounds((region?.value ?: 0L), (graphics?.value ?: 0L), (rect?.value ?: 0L))

public actual fun gdipGetRegionBoundsI(region: COpaquePointer?, graphics: COpaquePointer?, rect: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetRegionBoundsI((region?.value ?: 0L), (graphics?.value ?: 0L), (rect?.value ?: 0L))

public actual fun gdipGetRegionData(region: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt, sizefilled: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetRegionData((region?.value ?: 0L), (buffer?.value ?: 0L), buffersize.toInt(), (sizefilled?.value ?: 0L))

public actual fun gdipGetRegionDataSize(region: COpaquePointer?, buffersize: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetRegionDataSize((region?.value ?: 0L), (buffersize?.value ?: 0L))

public actual fun gdipGetRegionHRgn(region: COpaquePointer?, graphics: COpaquePointer?, hrgn: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetRegionHRgn((region?.value ?: 0L), (graphics?.value ?: 0L), (hrgn?.value ?: 0L))

public actual fun gdipGetRegionScans(region: COpaquePointer?, rects: COpaquePointer?, count: COpaquePointer?, matrix: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetRegionScans((region?.value ?: 0L), (rects?.value ?: 0L), (count?.value ?: 0L), (matrix?.value ?: 0L))

public actual fun gdipGetRegionScansCount(region: COpaquePointer?, count: COpaquePointer?, matrix: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetRegionScansCount((region?.value ?: 0L), (count?.value ?: 0L), (matrix?.value ?: 0L))

public actual fun gdipGetRegionScansI(region: COpaquePointer?, rects: COpaquePointer?, count: COpaquePointer?, matrix: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetRegionScansI((region?.value ?: 0L), (rects?.value ?: 0L), (count?.value ?: 0L), (matrix?.value ?: 0L))

public actual fun gdipGetRenderingOrigin(graphics: COpaquePointer?, x: COpaquePointer?, y: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetRenderingOrigin((graphics?.value ?: 0L), (x?.value ?: 0L), (y?.value ?: 0L))

public actual fun gdipGetSmoothingMode(graphics: COpaquePointer?, smoothingmode: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetSmoothingMode((graphics?.value ?: 0L), (smoothingmode?.value ?: 0L))

public actual fun gdipGetSolidFillColor(brush: COpaquePointer?, color: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetSolidFillColor((brush?.value ?: 0L), (color?.value ?: 0L))

public actual fun gdipGetStringFormatAlign(format: COpaquePointer?, align: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetStringFormatAlign((format?.value ?: 0L), (align?.value ?: 0L))

public actual fun gdipGetStringFormatDigitSubstitution(format: COpaquePointer?, language: COpaquePointer?, substitute: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetStringFormatDigitSubstitution((format?.value ?: 0L), (language?.value ?: 0L), (substitute?.value ?: 0L))

public actual fun gdipGetStringFormatFlags(format: COpaquePointer?, flags: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetStringFormatFlags((format?.value ?: 0L), (flags?.value ?: 0L))

public actual fun gdipGetStringFormatHotkeyPrefix(format: COpaquePointer?, hotkeyprefix: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetStringFormatHotkeyPrefix((format?.value ?: 0L), (hotkeyprefix?.value ?: 0L))

public actual fun gdipGetStringFormatLineAlign(format: COpaquePointer?, align: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetStringFormatLineAlign((format?.value ?: 0L), (align?.value ?: 0L))

public actual fun gdipGetStringFormatMeasurableCharacterRangeCount(format: COpaquePointer?, count: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetStringFormatMeasurableCharacterRangeCount((format?.value ?: 0L), (count?.value ?: 0L))

public actual fun gdipGetStringFormatTabStopCount(format: COpaquePointer?, count: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetStringFormatTabStopCount((format?.value ?: 0L), (count?.value ?: 0L))

public actual fun gdipGetStringFormatTabStops(format: COpaquePointer?, count: Int, firsttaboffset: COpaquePointer?, tabstops: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetStringFormatTabStops((format?.value ?: 0L), count, (firsttaboffset?.value ?: 0L), (tabstops?.value ?: 0L))

public actual fun gdipGetStringFormatTrimming(format: COpaquePointer?, trimming: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetStringFormatTrimming((format?.value ?: 0L), (trimming?.value ?: 0L))

public actual fun gdipGetTextContrast(graphics: COpaquePointer?, contrast: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetTextContrast((graphics?.value ?: 0L), (contrast?.value ?: 0L))

public actual fun gdipGetTextRenderingHint(graphics: COpaquePointer?, mode: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetTextRenderingHint((graphics?.value ?: 0L), (mode?.value ?: 0L))

public actual fun gdipGetTextureImage(brush: COpaquePointer?, image: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetTextureImage((brush?.value ?: 0L), (image?.value ?: 0L))

public actual fun gdipGetTextureTransform(brush: COpaquePointer?, matrix: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetTextureTransform((brush?.value ?: 0L), (matrix?.value ?: 0L))

public actual fun gdipGetTextureWrapMode(brush: COpaquePointer?, wrapmode: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetTextureWrapMode((brush?.value ?: 0L), (wrapmode?.value ?: 0L))

public actual fun gdipGetVisibleClipBounds(graphics: COpaquePointer?, rect: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetVisibleClipBounds((graphics?.value ?: 0L), (rect?.value ?: 0L))

public actual fun gdipGetVisibleClipBoundsI(graphics: COpaquePointer?, rect: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetVisibleClipBoundsI((graphics?.value ?: 0L), (rect?.value ?: 0L))

public actual fun gdipGetWorldTransform(graphics: COpaquePointer?, matrix: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGetWorldTransform((graphics?.value ?: 0L), (matrix?.value ?: 0L))

public actual fun gdipGraphicsClear(graphics: COpaquePointer?, color: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGraphicsClear((graphics?.value ?: 0L), color.toInt())

public actual fun gdipGraphicsSetAbort(pgraphics: COpaquePointer?, piabort: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipGraphicsSetAbort((pgraphics?.value ?: 0L), (piabort?.value ?: 0L))

public actual fun gdipImageForceValidation(image: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipImageForceValidation((image?.value ?: 0L))

public actual fun gdipImageGetFrameCount(image: COpaquePointer?, dimensionid: COpaquePointer?, count: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipImageGetFrameCount((image?.value ?: 0L), (dimensionid?.value ?: 0L), (count?.value ?: 0L))

public actual fun gdipImageGetFrameDimensionsCount(image: COpaquePointer?, count: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipImageGetFrameDimensionsCount((image?.value ?: 0L), (count?.value ?: 0L))

public actual fun gdipImageGetFrameDimensionsList(image: COpaquePointer?, dimensionids: COpaquePointer?, count: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipImageGetFrameDimensionsList((image?.value ?: 0L), (dimensionids?.value ?: 0L), count.toInt())

public actual fun gdipImageRotateFlip(image: COpaquePointer?, rftype: RotateFlipType): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipImageRotateFlip((image?.value ?: 0L), rftype)

public actual fun gdipImageSelectActiveFrame(image: COpaquePointer?, dimensionid: COpaquePointer?, frameindex: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipImageSelectActiveFrame((image?.value ?: 0L), (dimensionid?.value ?: 0L), frameindex.toInt())

public actual fun gdipImageSetAbort(pimage: COpaquePointer?, piabort: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipImageSetAbort((pimage?.value ?: 0L), (piabort?.value ?: 0L))

public actual fun gdipInitializePalette(palette: COpaquePointer?, palettetype: PaletteType, optimalcolors: Int, usetransparentcolor: Bool, bitmap: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipInitializePalette((palette?.value ?: 0L), palettetype, optimalcolors, usetransparentcolor, (bitmap?.value ?: 0L))

public actual fun gdipInvertMatrix(matrix: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipInvertMatrix((matrix?.value ?: 0L))

public actual fun gdipIsClipEmpty(graphics: COpaquePointer?, result: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipIsClipEmpty((graphics?.value ?: 0L), (result?.value ?: 0L))

public actual fun gdipIsEmptyRegion(region: COpaquePointer?, graphics: COpaquePointer?, result: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipIsEmptyRegion((region?.value ?: 0L), (graphics?.value ?: 0L), (result?.value ?: 0L))

public actual fun gdipIsEqualRegion(region: COpaquePointer?, region2: COpaquePointer?, graphics: COpaquePointer?, result: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipIsEqualRegion((region?.value ?: 0L), (region2?.value ?: 0L), (graphics?.value ?: 0L), (result?.value ?: 0L))

public actual fun gdipIsInfiniteRegion(region: COpaquePointer?, graphics: COpaquePointer?, result: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipIsInfiniteRegion((region?.value ?: 0L), (graphics?.value ?: 0L), (result?.value ?: 0L))

public actual fun gdipIsMatrixEqual(matrix: COpaquePointer?, matrix2: COpaquePointer?, result: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipIsMatrixEqual((matrix?.value ?: 0L), (matrix2?.value ?: 0L), (result?.value ?: 0L))

public actual fun gdipIsMatrixIdentity(matrix: COpaquePointer?, result: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipIsMatrixIdentity((matrix?.value ?: 0L), (result?.value ?: 0L))

public actual fun gdipIsMatrixInvertible(matrix: COpaquePointer?, result: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipIsMatrixInvertible((matrix?.value ?: 0L), (result?.value ?: 0L))

public actual fun gdipIsOutlineVisiblePathPoint(path: COpaquePointer?, x: Float, y: Float, pen: COpaquePointer?, graphics: COpaquePointer?, result: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipIsOutlineVisiblePathPoint((path?.value ?: 0L), x, y, (pen?.value ?: 0L), (graphics?.value ?: 0L), (result?.value ?: 0L))

public actual fun gdipIsOutlineVisiblePathPointI(path: COpaquePointer?, x: Int, y: Int, pen: COpaquePointer?, graphics: COpaquePointer?, result: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipIsOutlineVisiblePathPointI((path?.value ?: 0L), x, y, (pen?.value ?: 0L), (graphics?.value ?: 0L), (result?.value ?: 0L))

public actual fun gdipIsStyleAvailable(family: COpaquePointer?, style: Int, isstyleavailable: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipIsStyleAvailable((family?.value ?: 0L), style, (isstyleavailable?.value ?: 0L))

public actual fun gdipIsVisibleClipEmpty(graphics: COpaquePointer?, result: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipIsVisibleClipEmpty((graphics?.value ?: 0L), (result?.value ?: 0L))

public actual fun gdipIsVisiblePathPoint(path: COpaquePointer?, x: Float, y: Float, graphics: COpaquePointer?, result: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipIsVisiblePathPoint((path?.value ?: 0L), x, y, (graphics?.value ?: 0L), (result?.value ?: 0L))

public actual fun gdipIsVisiblePathPointI(path: COpaquePointer?, x: Int, y: Int, graphics: COpaquePointer?, result: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipIsVisiblePathPointI((path?.value ?: 0L), x, y, (graphics?.value ?: 0L), (result?.value ?: 0L))

public actual fun gdipIsVisiblePoint(graphics: COpaquePointer?, x: Float, y: Float, result: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipIsVisiblePoint((graphics?.value ?: 0L), x, y, (result?.value ?: 0L))

public actual fun gdipIsVisiblePointI(graphics: COpaquePointer?, x: Int, y: Int, result: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipIsVisiblePointI((graphics?.value ?: 0L), x, y, (result?.value ?: 0L))

public actual fun gdipIsVisibleRect(graphics: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, result: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipIsVisibleRect((graphics?.value ?: 0L), x, y, width, height, (result?.value ?: 0L))

public actual fun gdipIsVisibleRectI(graphics: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, result: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipIsVisibleRectI((graphics?.value ?: 0L), x, y, width, height, (result?.value ?: 0L))

public actual fun gdipIsVisibleRegionPoint(region: COpaquePointer?, x: Float, y: Float, graphics: COpaquePointer?, result: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipIsVisibleRegionPoint((region?.value ?: 0L), x, y, (graphics?.value ?: 0L), (result?.value ?: 0L))

public actual fun gdipIsVisibleRegionPointI(region: COpaquePointer?, x: Int, y: Int, graphics: COpaquePointer?, result: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipIsVisibleRegionPointI((region?.value ?: 0L), x, y, (graphics?.value ?: 0L), (result?.value ?: 0L))

public actual fun gdipIsVisibleRegionRect(region: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, graphics: COpaquePointer?, result: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipIsVisibleRegionRect((region?.value ?: 0L), x, y, width, height, (graphics?.value ?: 0L), (result?.value ?: 0L))

public actual fun gdipIsVisibleRegionRectI(region: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, graphics: COpaquePointer?, result: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipIsVisibleRegionRectI((region?.value ?: 0L), x, y, width, height, (graphics?.value ?: 0L), (result?.value ?: 0L))

public actual fun gdipLoadImageFromFile(filename: Pcwstr, image: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipLoadImageFromFile((filename?.value ?: 0L), (image?.value ?: 0L))

public actual fun gdipLoadImageFromFileICM(filename: Pcwstr, image: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipLoadImageFromFileICM((filename?.value ?: 0L), (image?.value ?: 0L))

public actual fun gdipLoadImageFromStream(stream: COpaquePointer?, image: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipLoadImageFromStream((stream?.value ?: 0L), (image?.value ?: 0L))

public actual fun gdipLoadImageFromStreamICM(stream: COpaquePointer?, image: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipLoadImageFromStreamICM((stream?.value ?: 0L), (image?.value ?: 0L))

public actual fun gdipMeasureCharacterRanges(graphics: COpaquePointer?, string: Pcwstr, length: Int, font: COpaquePointer?, layoutrect: COpaquePointer?, stringformat: COpaquePointer?, regioncount: Int, regions: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipMeasureCharacterRanges((graphics?.value ?: 0L), (string?.value ?: 0L), length, (font?.value ?: 0L), (layoutrect?.value ?: 0L), (stringformat?.value ?: 0L), regioncount, (regions?.value ?: 0L))

public actual fun gdipMeasureDriverString(graphics: COpaquePointer?, text: COpaquePointer?, length: Int, font: COpaquePointer?, positions: COpaquePointer?, flags: Int, matrix: COpaquePointer?, boundingbox: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipMeasureDriverString((graphics?.value ?: 0L), (text?.value ?: 0L), length, (font?.value ?: 0L), (positions?.value ?: 0L), flags, (matrix?.value ?: 0L), (boundingbox?.value ?: 0L))

public actual fun gdipMeasureString(graphics: COpaquePointer?, string: Pcwstr, length: Int, font: COpaquePointer?, layoutrect: COpaquePointer?, stringformat: COpaquePointer?, boundingbox: COpaquePointer?, codepointsfitted: COpaquePointer?, linesfilled: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipMeasureString((graphics?.value ?: 0L), (string?.value ?: 0L), length, (font?.value ?: 0L), (layoutrect?.value ?: 0L), (stringformat?.value ?: 0L), (boundingbox?.value ?: 0L), (codepointsfitted?.value ?: 0L), (linesfilled?.value ?: 0L))

public actual fun gdipMultiplyLineTransform(brush: COpaquePointer?, matrix: COpaquePointer?, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipMultiplyLineTransform((brush?.value ?: 0L), (matrix?.value ?: 0L), order)

public actual fun gdipMultiplyMatrix(matrix: COpaquePointer?, matrix2: COpaquePointer?, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipMultiplyMatrix((matrix?.value ?: 0L), (matrix2?.value ?: 0L), order)

public actual fun gdipMultiplyPathGradientTransform(brush: COpaquePointer?, matrix: COpaquePointer?, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipMultiplyPathGradientTransform((brush?.value ?: 0L), (matrix?.value ?: 0L), order)

public actual fun gdipMultiplyPenTransform(pen: COpaquePointer?, matrix: COpaquePointer?, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipMultiplyPenTransform((pen?.value ?: 0L), (matrix?.value ?: 0L), order)

public actual fun gdipMultiplyTextureTransform(brush: COpaquePointer?, matrix: COpaquePointer?, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipMultiplyTextureTransform((brush?.value ?: 0L), (matrix?.value ?: 0L), order)

public actual fun gdipMultiplyWorldTransform(graphics: COpaquePointer?, matrix: COpaquePointer?, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipMultiplyWorldTransform((graphics?.value ?: 0L), (matrix?.value ?: 0L), order)

public actual fun gdipNewInstalledFontCollection(fontcollection: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipNewInstalledFontCollection((fontcollection?.value ?: 0L))

public actual fun gdipNewPrivateFontCollection(fontcollection: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipNewPrivateFontCollection((fontcollection?.value ?: 0L))

public actual fun gdipPathIterCopyData(iterator: COpaquePointer?, resultcount: COpaquePointer?, points: COpaquePointer?, types: COpaquePointer?, startindex: Int, endindex: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipPathIterCopyData((iterator?.value ?: 0L), (resultcount?.value ?: 0L), (points?.value ?: 0L), (types?.value ?: 0L), startindex, endindex)

public actual fun gdipPathIterEnumerate(iterator: COpaquePointer?, resultcount: COpaquePointer?, points: COpaquePointer?, types: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipPathIterEnumerate((iterator?.value ?: 0L), (resultcount?.value ?: 0L), (points?.value ?: 0L), (types?.value ?: 0L), count)

public actual fun gdipPathIterGetCount(iterator: COpaquePointer?, count: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipPathIterGetCount((iterator?.value ?: 0L), (count?.value ?: 0L))

public actual fun gdipPathIterGetSubpathCount(iterator: COpaquePointer?, count: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipPathIterGetSubpathCount((iterator?.value ?: 0L), (count?.value ?: 0L))

public actual fun gdipPathIterHasCurve(iterator: COpaquePointer?, hascurve: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipPathIterHasCurve((iterator?.value ?: 0L), (hascurve?.value ?: 0L))

public actual fun gdipPathIterIsValid(iterator: COpaquePointer?, valid: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipPathIterIsValid((iterator?.value ?: 0L), (valid?.value ?: 0L))

public actual fun gdipPathIterNextMarker(iterator: COpaquePointer?, resultcount: COpaquePointer?, startindex: COpaquePointer?, endindex: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipPathIterNextMarker((iterator?.value ?: 0L), (resultcount?.value ?: 0L), (startindex?.value ?: 0L), (endindex?.value ?: 0L))

public actual fun gdipPathIterNextMarkerPath(iterator: COpaquePointer?, resultcount: COpaquePointer?, path: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipPathIterNextMarkerPath((iterator?.value ?: 0L), (resultcount?.value ?: 0L), (path?.value ?: 0L))

public actual fun gdipPathIterNextPathType(iterator: COpaquePointer?, resultcount: COpaquePointer?, pathtype: COpaquePointer?, startindex: COpaquePointer?, endindex: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipPathIterNextPathType((iterator?.value ?: 0L), (resultcount?.value ?: 0L), (pathtype?.value ?: 0L), (startindex?.value ?: 0L), (endindex?.value ?: 0L))

public actual fun gdipPathIterNextSubpath(iterator: COpaquePointer?, resultcount: COpaquePointer?, startindex: COpaquePointer?, endindex: COpaquePointer?, isclosed: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipPathIterNextSubpath((iterator?.value ?: 0L), (resultcount?.value ?: 0L), (startindex?.value ?: 0L), (endindex?.value ?: 0L), (isclosed?.value ?: 0L))

public actual fun gdipPathIterNextSubpathPath(iterator: COpaquePointer?, resultcount: COpaquePointer?, path: COpaquePointer?, isclosed: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipPathIterNextSubpathPath((iterator?.value ?: 0L), (resultcount?.value ?: 0L), (path?.value ?: 0L), (isclosed?.value ?: 0L))

public actual fun gdipPathIterRewind(iterator: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipPathIterRewind((iterator?.value ?: 0L))

public actual fun gdipPlayMetafileRecord(metafile: COpaquePointer?, recordtype: EmfPlusRecordType, flags: UInt, datasize: UInt, data: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipPlayMetafileRecord((metafile?.value ?: 0L), recordtype, flags.toInt(), datasize.toInt(), (data?.value ?: 0L))

public actual fun gdipPrivateAddFontFile(fontcollection: COpaquePointer?, filename: Pcwstr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipPrivateAddFontFile((fontcollection?.value ?: 0L), (filename?.value ?: 0L))

public actual fun gdipPrivateAddMemoryFont(fontcollection: COpaquePointer?, memory: COpaquePointer?, length: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipPrivateAddMemoryFont((fontcollection?.value ?: 0L), (memory?.value ?: 0L), length)

public actual fun gdipRecordMetafile(referencehdc: Hdc, type: EmfType, framerect: COpaquePointer?, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipRecordMetafile((referencehdc?.value ?: 0L), type, (framerect?.value ?: 0L), frameunit, (description?.value ?: 0L), (metafile?.value ?: 0L))

public actual fun gdipRecordMetafileFileName(filename: Pcwstr, referencehdc: Hdc, type: EmfType, framerect: COpaquePointer?, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipRecordMetafileFileName((filename?.value ?: 0L), (referencehdc?.value ?: 0L), type, (framerect?.value ?: 0L), frameunit, (description?.value ?: 0L), (metafile?.value ?: 0L))

public actual fun gdipRecordMetafileFileNameI(filename: Pcwstr, referencehdc: Hdc, type: EmfType, framerect: COpaquePointer?, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipRecordMetafileFileNameI((filename?.value ?: 0L), (referencehdc?.value ?: 0L), type, (framerect?.value ?: 0L), frameunit, (description?.value ?: 0L), (metafile?.value ?: 0L))

public actual fun gdipRecordMetafileI(referencehdc: Hdc, type: EmfType, framerect: COpaquePointer?, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipRecordMetafileI((referencehdc?.value ?: 0L), type, (framerect?.value ?: 0L), frameunit, (description?.value ?: 0L), (metafile?.value ?: 0L))

public actual fun gdipRecordMetafileStream(stream: COpaquePointer?, referencehdc: Hdc, type: EmfType, framerect: COpaquePointer?, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipRecordMetafileStream((stream?.value ?: 0L), (referencehdc?.value ?: 0L), type, (framerect?.value ?: 0L), frameunit, (description?.value ?: 0L), (metafile?.value ?: 0L))

public actual fun gdipRecordMetafileStreamI(stream: COpaquePointer?, referencehdc: Hdc, type: EmfType, framerect: COpaquePointer?, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipRecordMetafileStreamI((stream?.value ?: 0L), (referencehdc?.value ?: 0L), type, (framerect?.value ?: 0L), frameunit, (description?.value ?: 0L), (metafile?.value ?: 0L))

public actual fun gdipReleaseDC(graphics: COpaquePointer?, hdc: Hdc): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipReleaseDC((graphics?.value ?: 0L), (hdc?.value ?: 0L))

public actual fun gdipRemovePropertyItem(image: COpaquePointer?, propid: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipRemovePropertyItem((image?.value ?: 0L), propid.toInt())

public actual fun gdipResetClip(graphics: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipResetClip((graphics?.value ?: 0L))

public actual fun gdipResetImageAttributes(imageattr: COpaquePointer?, type: ColorAdjustType): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipResetImageAttributes((imageattr?.value ?: 0L), type)

public actual fun gdipResetLineTransform(brush: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipResetLineTransform((brush?.value ?: 0L))

public actual fun gdipResetPageTransform(graphics: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipResetPageTransform((graphics?.value ?: 0L))

public actual fun gdipResetPath(path: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipResetPath((path?.value ?: 0L))

public actual fun gdipResetPathGradientTransform(brush: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipResetPathGradientTransform((brush?.value ?: 0L))

public actual fun gdipResetPenTransform(pen: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipResetPenTransform((pen?.value ?: 0L))

public actual fun gdipResetTextureTransform(brush: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipResetTextureTransform((brush?.value ?: 0L))

public actual fun gdipResetWorldTransform(graphics: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipResetWorldTransform((graphics?.value ?: 0L))

public actual fun gdipRestoreGraphics(graphics: COpaquePointer?, state: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipRestoreGraphics((graphics?.value ?: 0L), state.toInt())

public actual fun gdipReversePath(path: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipReversePath((path?.value ?: 0L))

public actual fun gdipRotateLineTransform(brush: COpaquePointer?, angle: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipRotateLineTransform((brush?.value ?: 0L), angle, order)

public actual fun gdipRotateMatrix(matrix: COpaquePointer?, angle: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipRotateMatrix((matrix?.value ?: 0L), angle, order)

public actual fun gdipRotatePathGradientTransform(brush: COpaquePointer?, angle: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipRotatePathGradientTransform((brush?.value ?: 0L), angle, order)

public actual fun gdipRotatePenTransform(pen: COpaquePointer?, angle: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipRotatePenTransform((pen?.value ?: 0L), angle, order)

public actual fun gdipRotateTextureTransform(brush: COpaquePointer?, angle: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipRotateTextureTransform((brush?.value ?: 0L), angle, order)

public actual fun gdipRotateWorldTransform(graphics: COpaquePointer?, angle: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipRotateWorldTransform((graphics?.value ?: 0L), angle, order)

public actual fun gdipSaveAdd(image: COpaquePointer?, encoderparams: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSaveAdd((image?.value ?: 0L), (encoderparams?.value ?: 0L))

public actual fun gdipSaveAddImage(image: COpaquePointer?, newimage: COpaquePointer?, encoderparams: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSaveAddImage((image?.value ?: 0L), (newimage?.value ?: 0L), (encoderparams?.value ?: 0L))

public actual fun gdipSaveGraphics(graphics: COpaquePointer?, state: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSaveGraphics((graphics?.value ?: 0L), (state?.value ?: 0L))

public actual fun gdipSaveImageToFile(image: COpaquePointer?, filename: Pcwstr, clsidencoder: COpaquePointer?, encoderparams: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSaveImageToFile((image?.value ?: 0L), (filename?.value ?: 0L), (clsidencoder?.value ?: 0L), (encoderparams?.value ?: 0L))

public actual fun gdipSaveImageToStream(image: COpaquePointer?, stream: COpaquePointer?, clsidencoder: COpaquePointer?, encoderparams: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSaveImageToStream((image?.value ?: 0L), (stream?.value ?: 0L), (clsidencoder?.value ?: 0L), (encoderparams?.value ?: 0L))

public actual fun gdipScaleLineTransform(brush: COpaquePointer?, sx: Float, sy: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipScaleLineTransform((brush?.value ?: 0L), sx, sy, order)

public actual fun gdipScaleMatrix(matrix: COpaquePointer?, scalex: Float, scaley: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipScaleMatrix((matrix?.value ?: 0L), scalex, scaley, order)

public actual fun gdipScalePathGradientTransform(brush: COpaquePointer?, sx: Float, sy: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipScalePathGradientTransform((brush?.value ?: 0L), sx, sy, order)

public actual fun gdipScalePenTransform(pen: COpaquePointer?, sx: Float, sy: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipScalePenTransform((pen?.value ?: 0L), sx, sy, order)

public actual fun gdipScaleTextureTransform(brush: COpaquePointer?, sx: Float, sy: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipScaleTextureTransform((brush?.value ?: 0L), sx, sy, order)

public actual fun gdipScaleWorldTransform(graphics: COpaquePointer?, sx: Float, sy: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipScaleWorldTransform((graphics?.value ?: 0L), sx, sy, order)

public actual fun gdipSetAdjustableArrowCapFillState(cap: COpaquePointer?, fillstate: Bool): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetAdjustableArrowCapFillState((cap?.value ?: 0L), fillstate)

public actual fun gdipSetAdjustableArrowCapHeight(cap: COpaquePointer?, height: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetAdjustableArrowCapHeight((cap?.value ?: 0L), height)

public actual fun gdipSetAdjustableArrowCapMiddleInset(cap: COpaquePointer?, middleinset: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetAdjustableArrowCapMiddleInset((cap?.value ?: 0L), middleinset)

public actual fun gdipSetAdjustableArrowCapWidth(cap: COpaquePointer?, width: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetAdjustableArrowCapWidth((cap?.value ?: 0L), width)

public actual fun gdipSetClipGraphics(graphics: COpaquePointer?, srcgraphics: COpaquePointer?, combinemode: CombineMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetClipGraphics((graphics?.value ?: 0L), (srcgraphics?.value ?: 0L), combinemode)

public actual fun gdipSetClipHrgn(graphics: COpaquePointer?, hrgn: Hrgn, combinemode: CombineMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetClipHrgn((graphics?.value ?: 0L), (hrgn?.value ?: 0L), combinemode)

public actual fun gdipSetClipPath(graphics: COpaquePointer?, path: COpaquePointer?, combinemode: CombineMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetClipPath((graphics?.value ?: 0L), (path?.value ?: 0L), combinemode)

public actual fun gdipSetClipRect(graphics: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, combinemode: CombineMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetClipRect((graphics?.value ?: 0L), x, y, width, height, combinemode)

public actual fun gdipSetClipRectI(graphics: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, combinemode: CombineMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetClipRectI((graphics?.value ?: 0L), x, y, width, height, combinemode)

public actual fun gdipSetClipRegion(graphics: COpaquePointer?, region: COpaquePointer?, combinemode: CombineMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetClipRegion((graphics?.value ?: 0L), (region?.value ?: 0L), combinemode)

public actual fun gdipSetCompositingMode(graphics: COpaquePointer?, compositingmode: CompositingMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetCompositingMode((graphics?.value ?: 0L), compositingmode)

public actual fun gdipSetCompositingQuality(graphics: COpaquePointer?, compositingquality: CompositingQuality): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetCompositingQuality((graphics?.value ?: 0L), compositingquality)

public actual fun gdipSetCustomLineCapBaseCap(customcap: COpaquePointer?, basecap: LineCap): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetCustomLineCapBaseCap((customcap?.value ?: 0L), basecap)

public actual fun gdipSetCustomLineCapBaseInset(customcap: COpaquePointer?, inset: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetCustomLineCapBaseInset((customcap?.value ?: 0L), inset)

public actual fun gdipSetCustomLineCapStrokeCaps(customcap: COpaquePointer?, startcap: LineCap, endcap: LineCap): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetCustomLineCapStrokeCaps((customcap?.value ?: 0L), startcap, endcap)

public actual fun gdipSetCustomLineCapStrokeJoin(customcap: COpaquePointer?, linejoin: LineJoin): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetCustomLineCapStrokeJoin((customcap?.value ?: 0L), linejoin)

public actual fun gdipSetCustomLineCapWidthScale(customcap: COpaquePointer?, widthscale: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetCustomLineCapWidthScale((customcap?.value ?: 0L), widthscale)

public actual fun gdipSetEffectParameters(effect: COpaquePointer?, params: COpaquePointer?, size: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetEffectParameters((effect?.value ?: 0L), (params?.value ?: 0L), size.toInt())

public actual fun gdipSetEmpty(region: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetEmpty((region?.value ?: 0L))

public actual fun gdipSetImageAttributesCachedBackground(imageattr: COpaquePointer?, enableflag: Bool): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetImageAttributesCachedBackground((imageattr?.value ?: 0L), enableflag)

public actual fun gdipSetImageAttributesColorKeys(imageattr: COpaquePointer?, type: ColorAdjustType, enableflag: Bool, colorlow: UInt, colorhigh: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetImageAttributesColorKeys((imageattr?.value ?: 0L), type, enableflag, colorlow.toInt(), colorhigh.toInt())

public actual fun gdipSetImageAttributesColorMatrix(imageattr: COpaquePointer?, type: ColorAdjustType, enableflag: Bool, colormatrix: COpaquePointer?, graymatrix: COpaquePointer?, flags: ColorMatrixFlags): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetImageAttributesColorMatrix((imageattr?.value ?: 0L), type, enableflag, (colormatrix?.value ?: 0L), (graymatrix?.value ?: 0L), flags)

public actual fun gdipSetImageAttributesGamma(imageattr: COpaquePointer?, type: ColorAdjustType, enableflag: Bool, gamma: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetImageAttributesGamma((imageattr?.value ?: 0L), type, enableflag, gamma)

public actual fun gdipSetImageAttributesNoOp(imageattr: COpaquePointer?, type: ColorAdjustType, enableflag: Bool): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetImageAttributesNoOp((imageattr?.value ?: 0L), type, enableflag)

public actual fun gdipSetImageAttributesOutputChannel(imageattr: COpaquePointer?, type: ColorAdjustType, enableflag: Bool, channelflags: ColorChannelFlags): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetImageAttributesOutputChannel((imageattr?.value ?: 0L), type, enableflag, channelflags)

public actual fun gdipSetImageAttributesOutputChannelColorProfile(imageattr: COpaquePointer?, type: ColorAdjustType, enableflag: Bool, colorprofilefilename: Pcwstr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetImageAttributesOutputChannelColorProfile((imageattr?.value ?: 0L), type, enableflag, (colorprofilefilename?.value ?: 0L))

public actual fun gdipSetImageAttributesRemapTable(imageattr: COpaquePointer?, type: ColorAdjustType, enableflag: Bool, mapsize: UInt, map: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetImageAttributesRemapTable((imageattr?.value ?: 0L), type, enableflag, mapsize.toInt(), (map?.value ?: 0L))

public actual fun gdipSetImageAttributesThreshold(imageattr: COpaquePointer?, type: ColorAdjustType, enableflag: Bool, threshold: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetImageAttributesThreshold((imageattr?.value ?: 0L), type, enableflag, threshold)

public actual fun gdipSetImageAttributesToIdentity(imageattr: COpaquePointer?, type: ColorAdjustType): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetImageAttributesToIdentity((imageattr?.value ?: 0L), type)

public actual fun gdipSetImageAttributesWrapMode(imageattr: COpaquePointer?, wrap: WrapMode, argb: UInt, clamp: Bool): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetImageAttributesWrapMode((imageattr?.value ?: 0L), wrap, argb.toInt(), clamp)

public actual fun gdipSetImagePalette(image: COpaquePointer?, palette: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetImagePalette((image?.value ?: 0L), (palette?.value ?: 0L))

public actual fun gdipSetInfinite(region: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetInfinite((region?.value ?: 0L))

public actual fun gdipSetInterpolationMode(graphics: COpaquePointer?, interpolationmode: InterpolationMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetInterpolationMode((graphics?.value ?: 0L), interpolationmode)

public actual fun gdipSetLineBlend(brush: COpaquePointer?, blend: COpaquePointer?, positions: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetLineBlend((brush?.value ?: 0L), (blend?.value ?: 0L), (positions?.value ?: 0L), count)

public actual fun gdipSetLineColors(brush: COpaquePointer?, color1: UInt, color2: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetLineColors((brush?.value ?: 0L), color1.toInt(), color2.toInt())

public actual fun gdipSetLineGammaCorrection(brush: COpaquePointer?, usegammacorrection: Bool): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetLineGammaCorrection((brush?.value ?: 0L), usegammacorrection)

public actual fun gdipSetLineLinearBlend(brush: COpaquePointer?, focus: Float, scale: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetLineLinearBlend((brush?.value ?: 0L), focus, scale)

public actual fun gdipSetLinePresetBlend(brush: COpaquePointer?, blend: COpaquePointer?, positions: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetLinePresetBlend((brush?.value ?: 0L), (blend?.value ?: 0L), (positions?.value ?: 0L), count)

public actual fun gdipSetLineSigmaBlend(brush: COpaquePointer?, focus: Float, scale: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetLineSigmaBlend((brush?.value ?: 0L), focus, scale)

public actual fun gdipSetLineTransform(brush: COpaquePointer?, matrix: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetLineTransform((brush?.value ?: 0L), (matrix?.value ?: 0L))

public actual fun gdipSetLineWrapMode(brush: COpaquePointer?, wrapmode: WrapMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetLineWrapMode((brush?.value ?: 0L), wrapmode)

public actual fun gdipSetMatrixElements(matrix: COpaquePointer?, m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetMatrixElements((matrix?.value ?: 0L), m11, m12, m21, m22, dx, dy)

public actual fun gdipSetMetafileDownLevelRasterizationLimit(metafile: COpaquePointer?, metafilerasterizationlimitdpi: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetMetafileDownLevelRasterizationLimit((metafile?.value ?: 0L), metafilerasterizationlimitdpi.toInt())

public actual fun gdipSetPageScale(graphics: COpaquePointer?, scale: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPageScale((graphics?.value ?: 0L), scale)

public actual fun gdipSetPageUnit(graphics: COpaquePointer?, unit: Unit): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPageUnit((graphics?.value ?: 0L), unit)

public actual fun gdipSetPathFillMode(path: COpaquePointer?, fillmode: FillMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPathFillMode((path?.value ?: 0L), fillmode)

public actual fun gdipSetPathGradientBlend(brush: COpaquePointer?, blend: COpaquePointer?, positions: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientBlend((brush?.value ?: 0L), (blend?.value ?: 0L), (positions?.value ?: 0L), count)

public actual fun gdipSetPathGradientCenterColor(brush: COpaquePointer?, colors: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientCenterColor((brush?.value ?: 0L), colors.toInt())

public actual fun gdipSetPathGradientCenterPoint(brush: COpaquePointer?, points: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientCenterPoint((brush?.value ?: 0L), (points?.value ?: 0L))

public actual fun gdipSetPathGradientCenterPointI(brush: COpaquePointer?, points: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientCenterPointI((brush?.value ?: 0L), (points?.value ?: 0L))

public actual fun gdipSetPathGradientFocusScales(brush: COpaquePointer?, xscale: Float, yscale: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientFocusScales((brush?.value ?: 0L), xscale, yscale)

public actual fun gdipSetPathGradientGammaCorrection(brush: COpaquePointer?, usegammacorrection: Bool): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientGammaCorrection((brush?.value ?: 0L), usegammacorrection)

public actual fun gdipSetPathGradientLinearBlend(brush: COpaquePointer?, focus: Float, scale: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientLinearBlend((brush?.value ?: 0L), focus, scale)

public actual fun gdipSetPathGradientPath(brush: COpaquePointer?, path: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientPath((brush?.value ?: 0L), (path?.value ?: 0L))

public actual fun gdipSetPathGradientPresetBlend(brush: COpaquePointer?, blend: COpaquePointer?, positions: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientPresetBlend((brush?.value ?: 0L), (blend?.value ?: 0L), (positions?.value ?: 0L), count)

public actual fun gdipSetPathGradientSigmaBlend(brush: COpaquePointer?, focus: Float, scale: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientSigmaBlend((brush?.value ?: 0L), focus, scale)

public actual fun gdipSetPathGradientSurroundColorsWithCount(brush: COpaquePointer?, color: COpaquePointer?, count: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientSurroundColorsWithCount((brush?.value ?: 0L), (color?.value ?: 0L), (count?.value ?: 0L))

public actual fun gdipSetPathGradientTransform(brush: COpaquePointer?, matrix: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientTransform((brush?.value ?: 0L), (matrix?.value ?: 0L))

public actual fun gdipSetPathGradientWrapMode(brush: COpaquePointer?, wrapmode: WrapMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPathGradientWrapMode((brush?.value ?: 0L), wrapmode)

public actual fun gdipSetPathMarker(path: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPathMarker((path?.value ?: 0L))

public actual fun gdipSetPenBrushFill(pen: COpaquePointer?, brush: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPenBrushFill((pen?.value ?: 0L), (brush?.value ?: 0L))

public actual fun gdipSetPenColor(pen: COpaquePointer?, argb: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPenColor((pen?.value ?: 0L), argb.toInt())

public actual fun gdipSetPenCompoundArray(pen: COpaquePointer?, dash: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPenCompoundArray((pen?.value ?: 0L), (dash?.value ?: 0L), count)

public actual fun gdipSetPenCustomEndCap(pen: COpaquePointer?, customcap: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPenCustomEndCap((pen?.value ?: 0L), (customcap?.value ?: 0L))

public actual fun gdipSetPenCustomStartCap(pen: COpaquePointer?, customcap: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPenCustomStartCap((pen?.value ?: 0L), (customcap?.value ?: 0L))

public actual fun gdipSetPenDashArray(pen: COpaquePointer?, dash: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPenDashArray((pen?.value ?: 0L), (dash?.value ?: 0L), count)

public actual fun gdipSetPenDashCap197819(pen: COpaquePointer?, dashcap: DashCap): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPenDashCap197819((pen?.value ?: 0L), dashcap)

public actual fun gdipSetPenDashOffset(pen: COpaquePointer?, offset: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPenDashOffset((pen?.value ?: 0L), offset)

public actual fun gdipSetPenDashStyle(pen: COpaquePointer?, dashstyle: DashStyle): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPenDashStyle((pen?.value ?: 0L), dashstyle)

public actual fun gdipSetPenEndCap(pen: COpaquePointer?, endcap: LineCap): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPenEndCap((pen?.value ?: 0L), endcap)

public actual fun gdipSetPenLineCap197819(pen: COpaquePointer?, startcap: LineCap, endcap: LineCap, dashcap: DashCap): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPenLineCap197819((pen?.value ?: 0L), startcap, endcap, dashcap)

public actual fun gdipSetPenLineJoin(pen: COpaquePointer?, linejoin: LineJoin): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPenLineJoin((pen?.value ?: 0L), linejoin)

public actual fun gdipSetPenMiterLimit(pen: COpaquePointer?, miterlimit: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPenMiterLimit((pen?.value ?: 0L), miterlimit)

public actual fun gdipSetPenMode(pen: COpaquePointer?, penmode: PenAlignment): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPenMode((pen?.value ?: 0L), penmode)

public actual fun gdipSetPenStartCap(pen: COpaquePointer?, startcap: LineCap): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPenStartCap((pen?.value ?: 0L), startcap)

public actual fun gdipSetPenTransform(pen: COpaquePointer?, matrix: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPenTransform((pen?.value ?: 0L), (matrix?.value ?: 0L))

public actual fun gdipSetPenUnit(pen: COpaquePointer?, unit: Unit): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPenUnit((pen?.value ?: 0L), unit)

public actual fun gdipSetPenWidth(pen: COpaquePointer?, width: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPenWidth((pen?.value ?: 0L), width)

public actual fun gdipSetPixelOffsetMode(graphics: COpaquePointer?, pixeloffsetmode: PixelOffsetMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPixelOffsetMode((graphics?.value ?: 0L), pixeloffsetmode)

public actual fun gdipSetPropertyItem(image: COpaquePointer?, item: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetPropertyItem((image?.value ?: 0L), (item?.value ?: 0L))

public actual fun gdipSetRenderingOrigin(graphics: COpaquePointer?, x: Int, y: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetRenderingOrigin((graphics?.value ?: 0L), x, y)

public actual fun gdipSetSmoothingMode(graphics: COpaquePointer?, smoothingmode: SmoothingMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetSmoothingMode((graphics?.value ?: 0L), smoothingmode)

public actual fun gdipSetSolidFillColor(brush: COpaquePointer?, color: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetSolidFillColor((brush?.value ?: 0L), color.toInt())

public actual fun gdipSetStringFormatAlign(format: COpaquePointer?, align: StringAlignment): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetStringFormatAlign((format?.value ?: 0L), align)

public actual fun gdipSetStringFormatDigitSubstitution(format: COpaquePointer?, language: UShort, substitute: StringDigitSubstitute): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetStringFormatDigitSubstitution((format?.value ?: 0L), language.toShort(), substitute)

public actual fun gdipSetStringFormatFlags(format: COpaquePointer?, flags: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetStringFormatFlags((format?.value ?: 0L), flags)

public actual fun gdipSetStringFormatHotkeyPrefix(format: COpaquePointer?, hotkeyprefix: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetStringFormatHotkeyPrefix((format?.value ?: 0L), hotkeyprefix)

public actual fun gdipSetStringFormatLineAlign(format: COpaquePointer?, align: StringAlignment): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetStringFormatLineAlign((format?.value ?: 0L), align)

public actual fun gdipSetStringFormatMeasurableCharacterRanges(format: COpaquePointer?, rangecount: Int, ranges: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetStringFormatMeasurableCharacterRanges((format?.value ?: 0L), rangecount, (ranges?.value ?: 0L))

public actual fun gdipSetStringFormatTabStops(format: COpaquePointer?, firsttaboffset: Float, count: Int, tabstops: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetStringFormatTabStops((format?.value ?: 0L), firsttaboffset, count, (tabstops?.value ?: 0L))

public actual fun gdipSetStringFormatTrimming(format: COpaquePointer?, trimming: StringTrimming): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetStringFormatTrimming((format?.value ?: 0L), trimming)

public actual fun gdipSetTextContrast(graphics: COpaquePointer?, contrast: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetTextContrast((graphics?.value ?: 0L), contrast.toInt())

public actual fun gdipSetTextRenderingHint(graphics: COpaquePointer?, mode: TextRenderingHint): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetTextRenderingHint((graphics?.value ?: 0L), mode)

public actual fun gdipSetTextureTransform(brush: COpaquePointer?, matrix: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetTextureTransform((brush?.value ?: 0L), (matrix?.value ?: 0L))

public actual fun gdipSetTextureWrapMode(brush: COpaquePointer?, wrapmode: WrapMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetTextureWrapMode((brush?.value ?: 0L), wrapmode)

public actual fun gdipSetWorldTransform(graphics: COpaquePointer?, matrix: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipSetWorldTransform((graphics?.value ?: 0L), (matrix?.value ?: 0L))

public actual fun gdipShearMatrix(matrix: COpaquePointer?, shearx: Float, sheary: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipShearMatrix((matrix?.value ?: 0L), shearx, sheary, order)

public actual fun gdipStartPathFigure(path: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipStartPathFigure((path?.value ?: 0L))

public actual fun gdipStringFormatGetGenericDefault(format: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipStringFormatGetGenericDefault((format?.value ?: 0L))

public actual fun gdipStringFormatGetGenericTypographic(format: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipStringFormatGetGenericTypographic((format?.value ?: 0L))

public actual fun gdipTestControl(control: GpTestControlEnum, param1: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipTestControl(control, (param1?.value ?: 0L))

public actual fun gdipTransformMatrixPoints(matrix: COpaquePointer?, pts: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipTransformMatrixPoints((matrix?.value ?: 0L), (pts?.value ?: 0L), count)

public actual fun gdipTransformMatrixPointsI(matrix: COpaquePointer?, pts: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipTransformMatrixPointsI((matrix?.value ?: 0L), (pts?.value ?: 0L), count)

public actual fun gdipTransformPath(path: COpaquePointer?, matrix: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipTransformPath((path?.value ?: 0L), (matrix?.value ?: 0L))

public actual fun gdipTransformPoints(graphics: COpaquePointer?, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipTransformPoints((graphics?.value ?: 0L), destspace, srcspace, (points?.value ?: 0L), count)

public actual fun gdipTransformPointsI(graphics: COpaquePointer?, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipTransformPointsI((graphics?.value ?: 0L), destspace, srcspace, (points?.value ?: 0L), count)

public actual fun gdipTransformRegion(region: COpaquePointer?, matrix: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipTransformRegion((region?.value ?: 0L), (matrix?.value ?: 0L))

public actual fun gdipTranslateClip(graphics: COpaquePointer?, dx: Float, dy: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipTranslateClip((graphics?.value ?: 0L), dx, dy)

public actual fun gdipTranslateClipI(graphics: COpaquePointer?, dx: Int, dy: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipTranslateClipI((graphics?.value ?: 0L), dx, dy)

public actual fun gdipTranslateLineTransform(brush: COpaquePointer?, dx: Float, dy: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipTranslateLineTransform((brush?.value ?: 0L), dx, dy, order)

public actual fun gdipTranslateMatrix(matrix: COpaquePointer?, offsetx: Float, offsety: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipTranslateMatrix((matrix?.value ?: 0L), offsetx, offsety, order)

public actual fun gdipTranslatePathGradientTransform(brush: COpaquePointer?, dx: Float, dy: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipTranslatePathGradientTransform((brush?.value ?: 0L), dx, dy, order)

public actual fun gdipTranslatePenTransform(pen: COpaquePointer?, dx: Float, dy: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipTranslatePenTransform((pen?.value ?: 0L), dx, dy, order)

public actual fun gdipTranslateRegion(region: COpaquePointer?, dx: Float, dy: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipTranslateRegion((region?.value ?: 0L), dx, dy)

public actual fun gdipTranslateRegionI(region: COpaquePointer?, dx: Int, dy: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipTranslateRegionI((region?.value ?: 0L), dx, dy)

public actual fun gdipTranslateTextureTransform(brush: COpaquePointer?, dx: Float, dy: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipTranslateTextureTransform((brush?.value ?: 0L), dx, dy, order)

public actual fun gdipTranslateWorldTransform(graphics: COpaquePointer?, dx: Float, dy: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipTranslateWorldTransform((graphics?.value ?: 0L), dx, dy, order)

public actual fun gdipVectorTransformMatrixPoints(matrix: COpaquePointer?, pts: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipVectorTransformMatrixPoints((matrix?.value ?: 0L), (pts?.value ?: 0L), count)

public actual fun gdipVectorTransformMatrixPointsI(matrix: COpaquePointer?, pts: COpaquePointer?, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipVectorTransformMatrixPointsI((matrix?.value ?: 0L), (pts?.value ?: 0L), count)

public actual fun gdipWarpPath(path: COpaquePointer?, matrix: COpaquePointer?, points: COpaquePointer?, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, warpmode: WarpMode, flatness: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipWarpPath((path?.value ?: 0L), (matrix?.value ?: 0L), (points?.value ?: 0L), count, srcx, srcy, srcwidth, srcheight, warpmode, flatness)

public actual fun gdipWidenPath(nativepath: COpaquePointer?, pen: COpaquePointer?, matrix: COpaquePointer?, flatness: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipWidenPath((nativepath?.value ?: 0L), (pen?.value ?: 0L), (matrix?.value ?: 0L), flatness)

public actual fun gdipWindingModeOutline(path: COpaquePointer?, matrix: COpaquePointer?, flatness: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdipWindingModeOutline((path?.value ?: 0L), (matrix?.value ?: 0L), flatness)

public actual fun gdiplusNotificationHook(token: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdiplusNotificationHook((token?.value ?: 0L))

public actual fun gdiplusNotificationUnhook(token: ULong) {
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdiplusNotificationUnhook(token.toLong())
}

public actual fun gdiplusShutdown(token: ULong) {
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdiplusShutdown(token.toLong())
}

public actual fun gdiplusStartup(token: COpaquePointer?, input: COpaquePointer?, output: COpaquePointer?): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssys_windows_win32_graphics_gdiplus_gdiplusStartup((token?.value ?: 0L), (input?.value ?: 0L), (output?.value ?: 0L))
