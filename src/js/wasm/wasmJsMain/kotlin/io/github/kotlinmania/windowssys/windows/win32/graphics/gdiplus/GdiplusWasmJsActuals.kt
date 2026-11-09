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

public actual fun GdipAddPathArc(path: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    0

public actual fun GdipAddPathArcI(path: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    0

public actual fun GdipAddPathBezier(path: Long, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status =
    0

public actual fun GdipAddPathBezierI(path: Long, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status =
    0

public actual fun GdipAddPathBeziers(path: Long, points: Long, count: Int): Status =
    0

public actual fun GdipAddPathBeziersI(path: Long, points: Long, count: Int): Status =
    0

public actual fun GdipAddPathClosedCurve(path: Long, points: Long, count: Int): Status =
    0

public actual fun GdipAddPathClosedCurve2(path: Long, points: Long, count: Int, tension: Float): Status =
    0

public actual fun GdipAddPathClosedCurve2I(path: Long, points: Long, count: Int, tension: Float): Status =
    0

public actual fun GdipAddPathClosedCurveI(path: Long, points: Long, count: Int): Status =
    0

public actual fun GdipAddPathCurve(path: Long, points: Long, count: Int): Status =
    0

public actual fun GdipAddPathCurve2(path: Long, points: Long, count: Int, tension: Float): Status =
    0

public actual fun GdipAddPathCurve2I(path: Long, points: Long, count: Int, tension: Float): Status =
    0

public actual fun GdipAddPathCurve3(path: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    0

public actual fun GdipAddPathCurve3I(path: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    0

public actual fun GdipAddPathCurveI(path: Long, points: Long, count: Int): Status =
    0

public actual fun GdipAddPathEllipse(path: Long, x: Float, y: Float, width: Float, height: Float): Status =
    0

public actual fun GdipAddPathEllipseI(path: Long, x: Int, y: Int, width: Int, height: Int): Status =
    0

public actual fun GdipAddPathLine(path: Long, x1: Float, y1: Float, x2: Float, y2: Float): Status =
    0

public actual fun GdipAddPathLine2(path: Long, points: Long, count: Int): Status =
    0

public actual fun GdipAddPathLine2I(path: Long, points: Long, count: Int): Status =
    0

public actual fun GdipAddPathLineI(path: Long, x1: Int, y1: Int, x2: Int, y2: Int): Status =
    0

public actual fun GdipAddPathPath(path: Long, addingpath: Long, connect: BOOL): Status =
    0

public actual fun GdipAddPathPie(path: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    0

public actual fun GdipAddPathPieI(path: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    0

public actual fun GdipAddPathPolygon(path: Long, points: Long, count: Int): Status =
    0

public actual fun GdipAddPathPolygonI(path: Long, points: Long, count: Int): Status =
    0

public actual fun GdipAddPathRectangle(path: Long, x: Float, y: Float, width: Float, height: Float): Status =
    0

public actual fun GdipAddPathRectangleI(path: Long, x: Int, y: Int, width: Int, height: Int): Status =
    0

public actual fun GdipAddPathRectangles(path: Long, rects: Long, count: Int): Status =
    0

public actual fun GdipAddPathRectanglesI(path: Long, rects: Long, count: Int): Status =
    0

public actual fun GdipAddPathString(path: Long, string: PCWSTR, length: Int, family: Long, style: Int, emsize: Float, layoutrect: Long, format: Long): Status =
    0

public actual fun GdipAddPathStringI(path: Long, string: PCWSTR, length: Int, family: Long, style: Int, emsize: Float, layoutrect: Long, format: Long): Status =
    0

public actual fun GdipAlloc(size: ULong): Long =
    0L

public actual fun GdipBeginContainer(graphics: Long, dstrect: Long, srcrect: Long, unit: Unit, state: Long): Status =
    0

public actual fun GdipBeginContainer2(graphics: Long, state: Long): Status =
    0

public actual fun GdipBeginContainerI(graphics: Long, dstrect: Long, srcrect: Long, unit: Unit, state: Long): Status =
    0

public actual fun GdipBitmapApplyEffect(bitmap: Long, effect: Long, roi: Long, useauxdata: BOOL, auxdata: Long, auxdatasize: Long): Status =
    0

public actual fun GdipBitmapConvertFormat(pinputbitmap: Long, format: Int, dithertype: DitherType, palettetype: PaletteType, palette: Long, alphathresholdpercent: Float): Status =
    0

public actual fun GdipBitmapCreateApplyEffect(inputbitmaps: Long, numinputs: Int, effect: Long, roi: Long, outputrect: Long, outputbitmap: Long, useauxdata: BOOL, auxdata: Long, auxdatasize: Long): Status =
    0

public actual fun GdipBitmapGetHistogram(bitmap: Long, format: HistogramFormat, numberofentries: UInt, channel0: Long, channel1: Long, channel2: Long, channel3: Long): Status =
    0

public actual fun GdipBitmapGetHistogramSize(format: HistogramFormat, numberofentries: Long): Status =
    0

public actual fun GdipBitmapGetPixel(bitmap: Long, x: Int, y: Int, color: Long): Status =
    0

public actual fun GdipBitmapLockBits(bitmap: Long, rect: Long, flags: UInt, format: Int, lockedbitmapdata: Long): Status =
    0

public actual fun GdipBitmapSetPixel(bitmap: Long, x: Int, y: Int, color: UInt): Status =
    0

public actual fun GdipBitmapSetResolution(bitmap: Long, xdpi: Float, ydpi: Float): Status =
    0

public actual fun GdipBitmapUnlockBits(bitmap: Long, lockedbitmapdata: Long): Status =
    0

public actual fun GdipClearPathMarkers(path: Long): Status =
    0

public actual fun GdipCloneBitmapArea(x: Float, y: Float, width: Float, height: Float, format: Int, srcbitmap: Long, dstbitmap: Long): Status =
    0

public actual fun GdipCloneBitmapAreaI(x: Int, y: Int, width: Int, height: Int, format: Int, srcbitmap: Long, dstbitmap: Long): Status =
    0

public actual fun GdipCloneBrush(brush: Long, clonebrush: Long): Status =
    0

public actual fun GdipCloneCustomLineCap(customcap: Long, clonedcap: Long): Status =
    0

public actual fun GdipCloneFont(font: Long, clonefont: Long): Status =
    0

public actual fun GdipCloneFontFamily(fontfamily: Long, clonedfontfamily: Long): Status =
    0

public actual fun GdipCloneImage(image: Long, cloneimage: Long): Status =
    0

public actual fun GdipCloneImageAttributes(imageattr: Long, cloneimageattr: Long): Status =
    0

public actual fun GdipCloneMatrix(matrix: Long, clonematrix: Long): Status =
    0

public actual fun GdipClonePath(path: Long, clonepath: Long): Status =
    0

public actual fun GdipClonePen(pen: Long, clonepen: Long): Status =
    0

public actual fun GdipCloneRegion(region: Long, cloneregion: Long): Status =
    0

public actual fun GdipCloneStringFormat(format: Long, newformat: Long): Status =
    0

public actual fun GdipClosePathFigure(path: Long): Status =
    0

public actual fun GdipClosePathFigures(path: Long): Status =
    0

public actual fun GdipCombineRegionPath(region: Long, path: Long, combinemode: CombineMode): Status =
    0

public actual fun GdipCombineRegionRect(region: Long, rect: Long, combinemode: CombineMode): Status =
    0

public actual fun GdipCombineRegionRectI(region: Long, rect: Long, combinemode: CombineMode): Status =
    0

public actual fun GdipCombineRegionRegion(region: Long, region2: Long, combinemode: CombineMode): Status =
    0

public actual fun GdipComment(graphics: Long, sizedata: UInt, data: Long): Status =
    0

public actual fun GdipConvertToEmfPlus(refgraphics: Long, metafile: Long, conversionfailureflag: Long, emftype: EmfType, description: PCWSTR, out_metafile: Long): Status =
    0

public actual fun GdipConvertToEmfPlusToFile(refgraphics: Long, metafile: Long, conversionfailureflag: Long, filename: PCWSTR, emftype: EmfType, description: PCWSTR, out_metafile: Long): Status =
    0

public actual fun GdipConvertToEmfPlusToStream(refgraphics: Long, metafile: Long, conversionfailureflag: Long, stream: Long, emftype: EmfType, description: PCWSTR, out_metafile: Long): Status =
    0

public actual fun GdipCreateAdjustableArrowCap(height: Float, width: Float, isfilled: BOOL, cap: Long): Status =
    0

public actual fun GdipCreateBitmapFromFile(filename: PCWSTR, bitmap: Long): Status =
    0

public actual fun GdipCreateBitmapFromFileICM(filename: PCWSTR, bitmap: Long): Status =
    0

public actual fun GdipCreateBitmapFromGdiDib(gdibitmapinfo: Long, gdibitmapdata: Long, bitmap: Long): Status =
    0

public actual fun GdipCreateBitmapFromGraphics(width: Int, height: Int, target: Long, bitmap: Long): Status =
    0

public actual fun GdipCreateBitmapFromHBITMAP(hbm: HBITMAP, hpal: HPALETTE, bitmap: Long): Status =
    0

public actual fun GdipCreateBitmapFromHICON(hicon: HICON, bitmap: Long): Status =
    0

public actual fun GdipCreateBitmapFromResource(hinstance: HINSTANCE, lpbitmapname: PCWSTR, bitmap: Long): Status =
    0

public actual fun GdipCreateBitmapFromScan0(width: Int, height: Int, stride: Int, format: Int, scan0: Long, bitmap: Long): Status =
    0

public actual fun GdipCreateBitmapFromStream(stream: Long, bitmap: Long): Status =
    0

public actual fun GdipCreateBitmapFromStreamICM(stream: Long, bitmap: Long): Status =
    0

public actual fun GdipCreateCachedBitmap(bitmap: Long, graphics: Long, cachedbitmap: Long): Status =
    0

public actual fun GdipCreateCustomLineCap(fillpath: Long, strokepath: Long, basecap: LineCap, baseinset: Float, customcap: Long): Status =
    0

public actual fun GdipCreateEffect(guid: GUID, effect: Long): Status =
    0

public actual fun GdipCreateFont(fontfamily: Long, emsize: Float, style: Int, unit: Unit, font: Long): Status =
    0

public actual fun GdipCreateFontFamilyFromName(name: PCWSTR, fontcollection: Long, fontfamily: Long): Status =
    0

public actual fun GdipCreateFontFromDC(hdc: HDC, font: Long): Status =
    0

public actual fun GdipCreateFontFromLogfontA(hdc: HDC, logfont: Long, font: Long): Status =
    0

public actual fun GdipCreateFontFromLogfontW(hdc: HDC, logfont: Long, font: Long): Status =
    0

public actual fun GdipCreateFromHDC(hdc: HDC, graphics: Long): Status =
    0

public actual fun GdipCreateFromHDC2(hdc: HDC, hdevice: HANDLE, graphics: Long): Status =
    0

public actual fun GdipCreateFromHWND(hwnd: HWND, graphics: Long): Status =
    0

public actual fun GdipCreateFromHWNDICM(hwnd: HWND, graphics: Long): Status =
    0

public actual fun GdipCreateHBITMAPFromBitmap(bitmap: Long, hbmreturn: Long, background: UInt): Status =
    0

public actual fun GdipCreateHICONFromBitmap(bitmap: Long, hbmreturn: Long): Status =
    0

public actual fun GdipCreateHalftonePalette(): HPALETTE =
    0L

public actual fun GdipCreateHatchBrush(hatchstyle: HatchStyle, forecol: UInt, backcol: UInt, brush: Long): Status =
    0

public actual fun GdipCreateImageAttributes(imageattr: Long): Status =
    0

public actual fun GdipCreateLineBrush(point1: Long, point2: Long, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: Long): Status =
    0

public actual fun GdipCreateLineBrushFromRect(rect: Long, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: Long): Status =
    0

public actual fun GdipCreateLineBrushFromRectI(rect: Long, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: Long): Status =
    0

public actual fun GdipCreateLineBrushFromRectWithAngle(rect: Long, color1: UInt, color2: UInt, angle: Float, isanglescalable: BOOL, wrapmode: WrapMode, linegradient: Long): Status =
    0

public actual fun GdipCreateLineBrushFromRectWithAngleI(rect: Long, color1: UInt, color2: UInt, angle: Float, isanglescalable: BOOL, wrapmode: WrapMode, linegradient: Long): Status =
    0

public actual fun GdipCreateLineBrushI(point1: Long, point2: Long, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: Long): Status =
    0

public actual fun GdipCreateMatrix(matrix: Long): Status =
    0

public actual fun GdipCreateMatrix2(m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float, matrix: Long): Status =
    0

public actual fun GdipCreateMatrix3(rect: Long, dstplg: Long, matrix: Long): Status =
    0

public actual fun GdipCreateMatrix3I(rect: Long, dstplg: Long, matrix: Long): Status =
    0

public actual fun GdipCreateMetafileFromEmf(hemf: HENHMETAFILE, deleteemf: BOOL, metafile: Long): Status =
    0

public actual fun GdipCreateMetafileFromFile(file: PCWSTR, metafile: Long): Status =
    0

public actual fun GdipCreateMetafileFromStream(stream: Long, metafile: Long): Status =
    0

public actual fun GdipCreateMetafileFromWmf(hwmf: HMETAFILE, deletewmf: BOOL, wmfplaceablefileheader: Long, metafile: Long): Status =
    0

public actual fun GdipCreateMetafileFromWmfFile(file: PCWSTR, wmfplaceablefileheader: Long, metafile: Long): Status =
    0

public actual fun GdipCreatePath(brushmode: FillMode, path: Long): Status =
    0

public actual fun GdipCreatePath2(param0: Long, param1: Long, param2: Int, param3: FillMode, path: Long): Status =
    0

public actual fun GdipCreatePath2I(param0: Long, param1: Long, param2: Int, param3: FillMode, path: Long): Status =
    0

public actual fun GdipCreatePathGradient(points: Long, count: Int, wrapmode: WrapMode, polygradient: Long): Status =
    0

public actual fun GdipCreatePathGradientFromPath(path: Long, polygradient: Long): Status =
    0

public actual fun GdipCreatePathGradientI(points: Long, count: Int, wrapmode: WrapMode, polygradient: Long): Status =
    0

public actual fun GdipCreatePathIter(iterator: Long, path: Long): Status =
    0

public actual fun GdipCreatePen1(color: UInt, width: Float, unit: Unit, pen: Long): Status =
    0

public actual fun GdipCreatePen2(brush: Long, width: Float, unit: Unit, pen: Long): Status =
    0

public actual fun GdipCreateRegion(region: Long): Status =
    0

public actual fun GdipCreateRegionHrgn(hrgn: HRGN, region: Long): Status =
    0

public actual fun GdipCreateRegionPath(path: Long, region: Long): Status =
    0

public actual fun GdipCreateRegionRect(rect: Long, region: Long): Status =
    0

public actual fun GdipCreateRegionRectI(rect: Long, region: Long): Status =
    0

public actual fun GdipCreateRegionRgnData(regiondata: Long, size: Int, region: Long): Status =
    0

public actual fun GdipCreateSolidFill(color: UInt, brush: Long): Status =
    0

public actual fun GdipCreateStreamOnFile(filename: PCWSTR, access: UInt, stream: Long): Status =
    0

public actual fun GdipCreateStringFormat(formatattributes: Int, language: UShort, format: Long): Status =
    0

public actual fun GdipCreateTexture(image: Long, wrapmode: WrapMode, texture: Long): Status =
    0

public actual fun GdipCreateTexture2(image: Long, wrapmode: WrapMode, x: Float, y: Float, width: Float, height: Float, texture: Long): Status =
    0

public actual fun GdipCreateTexture2I(image: Long, wrapmode: WrapMode, x: Int, y: Int, width: Int, height: Int, texture: Long): Status =
    0

public actual fun GdipCreateTextureIA(image: Long, imageattributes: Long, x: Float, y: Float, width: Float, height: Float, texture: Long): Status =
    0

public actual fun GdipCreateTextureIAI(image: Long, imageattributes: Long, x: Int, y: Int, width: Int, height: Int, texture: Long): Status =
    0

public actual fun GdipDeleteBrush(brush: Long): Status =
    0

public actual fun GdipDeleteCachedBitmap(cachedbitmap: Long): Status =
    0

public actual fun GdipDeleteCustomLineCap(customcap: Long): Status =
    0

public actual fun GdipDeleteEffect(effect: Long): Status =
    0

public actual fun GdipDeleteFont(font: Long): Status =
    0

public actual fun GdipDeleteFontFamily(fontfamily: Long): Status =
    0

public actual fun GdipDeleteGraphics(graphics: Long): Status =
    0

public actual fun GdipDeleteMatrix(matrix: Long): Status =
    0

public actual fun GdipDeletePath(path: Long): Status =
    0

public actual fun GdipDeletePathIter(iterator: Long): Status =
    0

public actual fun GdipDeletePen(pen: Long): Status =
    0

public actual fun GdipDeletePrivateFontCollection(fontcollection: Long): Status =
    0

public actual fun GdipDeleteRegion(region: Long): Status =
    0

public actual fun GdipDeleteStringFormat(format: Long): Status =
    0

public actual fun GdipDisposeImage(image: Long): Status =
    0

public actual fun GdipDisposeImageAttributes(imageattr: Long): Status =
    0

public actual fun GdipDrawArc(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    0

public actual fun GdipDrawArcI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    0

public actual fun GdipDrawBezier(graphics: Long, pen: Long, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status =
    0

public actual fun GdipDrawBezierI(graphics: Long, pen: Long, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status =
    0

public actual fun GdipDrawBeziers(graphics: Long, pen: Long, points: Long, count: Int): Status =
    0

public actual fun GdipDrawBeziersI(graphics: Long, pen: Long, points: Long, count: Int): Status =
    0

public actual fun GdipDrawCachedBitmap(graphics: Long, cachedbitmap: Long, x: Int, y: Int): Status =
    0

public actual fun GdipDrawClosedCurve(graphics: Long, pen: Long, points: Long, count: Int): Status =
    0

public actual fun GdipDrawClosedCurve2(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Status =
    0

public actual fun GdipDrawClosedCurve2I(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Status =
    0

public actual fun GdipDrawClosedCurveI(graphics: Long, pen: Long, points: Long, count: Int): Status =
    0

public actual fun GdipDrawCurve(graphics: Long, pen: Long, points: Long, count: Int): Status =
    0

public actual fun GdipDrawCurve2(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Status =
    0

public actual fun GdipDrawCurve2I(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Status =
    0

public actual fun GdipDrawCurve3(graphics: Long, pen: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    0

public actual fun GdipDrawCurve3I(graphics: Long, pen: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    0

public actual fun GdipDrawCurveI(graphics: Long, pen: Long, points: Long, count: Int): Status =
    0

public actual fun GdipDrawDriverString(graphics: Long, text: Long, length: Int, font: Long, brush: Long, positions: Long, flags: Int, matrix: Long): Status =
    0

public actual fun GdipDrawEllipse(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float): Status =
    0

public actual fun GdipDrawEllipseI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int): Status =
    0

public actual fun GdipDrawImage(graphics: Long, image: Long, x: Float, y: Float): Status =
    0

public actual fun GdipDrawImageFX(graphics: Long, image: Long, source: Long, xform: Long, effect: Long, imageattributes: Long, srcunit: Unit): Status =
    0

public actual fun GdipDrawImageI(graphics: Long, image: Long, x: Int, y: Int): Status =
    0

public actual fun GdipDrawImagePointRect(graphics: Long, image: Long, x: Float, y: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit): Status =
    0

public actual fun GdipDrawImagePointRectI(graphics: Long, image: Long, x: Int, y: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit): Status =
    0

public actual fun GdipDrawImagePoints(graphics: Long, image: Long, dstpoints: Long, count: Int): Status =
    0

public actual fun GdipDrawImagePointsI(graphics: Long, image: Long, dstpoints: Long, count: Int): Status =
    0

public actual fun GdipDrawImagePointsRect(graphics: Long, image: Long, points: Long, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: Long, callback: Long, callbackdata: Long): Status =
    0

public actual fun GdipDrawImagePointsRectI(graphics: Long, image: Long, points: Long, count: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: Long, callback: Long, callbackdata: Long): Status =
    0

public actual fun GdipDrawImageRect(graphics: Long, image: Long, x: Float, y: Float, width: Float, height: Float): Status =
    0

public actual fun GdipDrawImageRectI(graphics: Long, image: Long, x: Int, y: Int, width: Int, height: Int): Status =
    0

public actual fun GdipDrawImageRectRect(graphics: Long, image: Long, dstx: Float, dsty: Float, dstwidth: Float, dstheight: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: Long, callback: Long, callbackdata: Long): Status =
    0

public actual fun GdipDrawImageRectRectI(graphics: Long, image: Long, dstx: Int, dsty: Int, dstwidth: Int, dstheight: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: Long, callback: Long, callbackdata: Long): Status =
    0

public actual fun GdipDrawLine(graphics: Long, pen: Long, x1: Float, y1: Float, x2: Float, y2: Float): Status =
    0

public actual fun GdipDrawLineI(graphics: Long, pen: Long, x1: Int, y1: Int, x2: Int, y2: Int): Status =
    0

public actual fun GdipDrawLines(graphics: Long, pen: Long, points: Long, count: Int): Status =
    0

public actual fun GdipDrawLinesI(graphics: Long, pen: Long, points: Long, count: Int): Status =
    0

public actual fun GdipDrawPath(graphics: Long, pen: Long, path: Long): Status =
    0

public actual fun GdipDrawPie(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    0

public actual fun GdipDrawPieI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    0

public actual fun GdipDrawPolygon(graphics: Long, pen: Long, points: Long, count: Int): Status =
    0

public actual fun GdipDrawPolygonI(graphics: Long, pen: Long, points: Long, count: Int): Status =
    0

public actual fun GdipDrawRectangle(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float): Status =
    0

public actual fun GdipDrawRectangleI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int): Status =
    0

public actual fun GdipDrawRectangles(graphics: Long, pen: Long, rects: Long, count: Int): Status =
    0

public actual fun GdipDrawRectanglesI(graphics: Long, pen: Long, rects: Long, count: Int): Status =
    0

public actual fun GdipDrawString(graphics: Long, string: PCWSTR, length: Int, font: Long, layoutrect: Long, stringformat: Long, brush: Long): Status =
    0

public actual fun GdipEmfToWmfBits(hemf: HENHMETAFILE, cbdata16: UInt, pdata16: Long, imapmode: Int, eflags: Int): UInt =
    0u

public actual fun GdipEndContainer(graphics: Long, state: UInt): Status =
    0

public actual fun GdipEnumerateMetafileDestPoint(graphics: Long, metafile: Long, destpoint: Long, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    0

public actual fun GdipEnumerateMetafileDestPointI(graphics: Long, metafile: Long, destpoint: Long, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    0

public actual fun GdipEnumerateMetafileDestPoints(graphics: Long, metafile: Long, destpoints: Long, count: Int, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    0

public actual fun GdipEnumerateMetafileDestPointsI(graphics: Long, metafile: Long, destpoints: Long, count: Int, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    0

public actual fun GdipEnumerateMetafileDestRect(graphics: Long, metafile: Long, destrect: Long, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    0

public actual fun GdipEnumerateMetafileDestRectI(graphics: Long, metafile: Long, destrect: Long, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    0

public actual fun GdipEnumerateMetafileSrcRectDestPoint(graphics: Long, metafile: Long, destpoint: Long, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    0

public actual fun GdipEnumerateMetafileSrcRectDestPointI(graphics: Long, metafile: Long, destpoint: Long, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    0

public actual fun GdipEnumerateMetafileSrcRectDestPoints(graphics: Long, metafile: Long, destpoints: Long, count: Int, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    0

public actual fun GdipEnumerateMetafileSrcRectDestPointsI(graphics: Long, metafile: Long, destpoints: Long, count: Int, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    0

public actual fun GdipEnumerateMetafileSrcRectDestRect(graphics: Long, metafile: Long, destrect: Long, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    0

public actual fun GdipEnumerateMetafileSrcRectDestRectI(graphics: Long, metafile: Long, destrect: Long, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status =
    0

public actual fun GdipFillClosedCurve(graphics: Long, brush: Long, points: Long, count: Int): Status =
    0

public actual fun GdipFillClosedCurve2(graphics: Long, brush: Long, points: Long, count: Int, tension: Float, fillmode: FillMode): Status =
    0

public actual fun GdipFillClosedCurve2I(graphics: Long, brush: Long, points: Long, count: Int, tension: Float, fillmode: FillMode): Status =
    0

public actual fun GdipFillClosedCurveI(graphics: Long, brush: Long, points: Long, count: Int): Status =
    0

public actual fun GdipFillEllipse(graphics: Long, brush: Long, x: Float, y: Float, width: Float, height: Float): Status =
    0

public actual fun GdipFillEllipseI(graphics: Long, brush: Long, x: Int, y: Int, width: Int, height: Int): Status =
    0

public actual fun GdipFillPath(graphics: Long, brush: Long, path: Long): Status =
    0

public actual fun GdipFillPie(graphics: Long, brush: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    0

public actual fun GdipFillPieI(graphics: Long, brush: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    0

public actual fun GdipFillPolygon(graphics: Long, brush: Long, points: Long, count: Int, fillmode: FillMode): Status =
    0

public actual fun GdipFillPolygon2(graphics: Long, brush: Long, points: Long, count: Int): Status =
    0

public actual fun GdipFillPolygon2I(graphics: Long, brush: Long, points: Long, count: Int): Status =
    0

public actual fun GdipFillPolygonI(graphics: Long, brush: Long, points: Long, count: Int, fillmode: FillMode): Status =
    0

public actual fun GdipFillRectangle(graphics: Long, brush: Long, x: Float, y: Float, width: Float, height: Float): Status =
    0

public actual fun GdipFillRectangleI(graphics: Long, brush: Long, x: Int, y: Int, width: Int, height: Int): Status =
    0

public actual fun GdipFillRectangles(graphics: Long, brush: Long, rects: Long, count: Int): Status =
    0

public actual fun GdipFillRectanglesI(graphics: Long, brush: Long, rects: Long, count: Int): Status =
    0

public actual fun GdipFillRegion(graphics: Long, brush: Long, region: Long): Status =
    0

public actual fun GdipFindFirstImageItem(image: Long, item: Long): Status =
    0

public actual fun GdipFindNextImageItem(image: Long, item: Long): Status =
    0

public actual fun GdipFlattenPath(path: Long, matrix: Long, flatness: Float): Status =
    0

public actual fun GdipFlush(graphics: Long, intention: FlushIntention): Status =
    0

public actual fun GdipFree(ptr: Long) {
}

public actual fun GdipGetAdjustableArrowCapFillState(cap: Long, fillstate: Long): Status =
    0

public actual fun GdipGetAdjustableArrowCapHeight(cap: Long, height: Long): Status =
    0

public actual fun GdipGetAdjustableArrowCapMiddleInset(cap: Long, middleinset: Long): Status =
    0

public actual fun GdipGetAdjustableArrowCapWidth(cap: Long, width: Long): Status =
    0

public actual fun GdipGetAllPropertyItems(image: Long, totalbuffersize: UInt, numproperties: UInt, allitems: Long): Status =
    0

public actual fun GdipGetBrushType(brush: Long, type: Long): Status =
    0

public actual fun GdipGetCellAscent(family: Long, style: Int, cellascent: Long): Status =
    0

public actual fun GdipGetCellDescent(family: Long, style: Int, celldescent: Long): Status =
    0

public actual fun GdipGetClip(graphics: Long, region: Long): Status =
    0

public actual fun GdipGetClipBounds(graphics: Long, rect: Long): Status =
    0

public actual fun GdipGetClipBoundsI(graphics: Long, rect: Long): Status =
    0

public actual fun GdipGetCompositingMode(graphics: Long, compositingmode: Long): Status =
    0

public actual fun GdipGetCompositingQuality(graphics: Long, compositingquality: Long): Status =
    0

public actual fun GdipGetCustomLineCapBaseCap(customcap: Long, basecap: Long): Status =
    0

public actual fun GdipGetCustomLineCapBaseInset(customcap: Long, inset: Long): Status =
    0

public actual fun GdipGetCustomLineCapStrokeCaps(customcap: Long, startcap: Long, endcap: Long): Status =
    0

public actual fun GdipGetCustomLineCapStrokeJoin(customcap: Long, linejoin: Long): Status =
    0

public actual fun GdipGetCustomLineCapType(customcap: Long, captype: Long): Status =
    0

public actual fun GdipGetCustomLineCapWidthScale(customcap: Long, widthscale: Long): Status =
    0

public actual fun GdipGetDC(graphics: Long, hdc: Long): Status =
    0

public actual fun GdipGetDpiX(graphics: Long, dpi: Long): Status =
    0

public actual fun GdipGetDpiY(graphics: Long, dpi: Long): Status =
    0

public actual fun GdipGetEffectParameterSize(effect: Long, size: Long): Status =
    0

public actual fun GdipGetEffectParameters(effect: Long, size: Long, params: Long): Status =
    0

public actual fun GdipGetEmHeight(family: Long, style: Int, emheight: Long): Status =
    0

public actual fun GdipGetEncoderParameterList(image: Long, clsidencoder: Long, size: UInt, buffer: Long): Status =
    0

public actual fun GdipGetEncoderParameterListSize(image: Long, clsidencoder: Long, size: Long): Status =
    0

public actual fun GdipGetFamily(font: Long, family: Long): Status =
    0

public actual fun GdipGetFamilyName(family: Long, name: PWSTR, language: UShort): Status =
    0

public actual fun GdipGetFontCollectionFamilyCount(fontcollection: Long, numfound: Long): Status =
    0

public actual fun GdipGetFontCollectionFamilyList(fontcollection: Long, numsought: Int, gpfamilies: Long, numfound: Long): Status =
    0

public actual fun GdipGetFontHeight(font: Long, graphics: Long, height: Long): Status =
    0

public actual fun GdipGetFontHeightGivenDPI(font: Long, dpi: Float, height: Long): Status =
    0

public actual fun GdipGetFontSize(font: Long, size: Long): Status =
    0

public actual fun GdipGetFontStyle(font: Long, style: Long): Status =
    0

public actual fun GdipGetFontUnit(font: Long, unit: Long): Status =
    0

public actual fun GdipGetGenericFontFamilyMonospace(nativefamily: Long): Status =
    0

public actual fun GdipGetGenericFontFamilySansSerif(nativefamily: Long): Status =
    0

public actual fun GdipGetGenericFontFamilySerif(nativefamily: Long): Status =
    0

public actual fun GdipGetHatchBackgroundColor(brush: Long, backcol: Long): Status =
    0

public actual fun GdipGetHatchForegroundColor(brush: Long, forecol: Long): Status =
    0

public actual fun GdipGetHatchStyle(brush: Long, hatchstyle: Long): Status =
    0

public actual fun GdipGetHemfFromMetafile(metafile: Long, hemf: Long): Status =
    0

public actual fun GdipGetImageAttributesAdjustedPalette(imageattr: Long, colorpalette: Long, coloradjusttype: ColorAdjustType): Status =
    0

public actual fun GdipGetImageBounds(image: Long, srcrect: Long, srcunit: Long): Status =
    0

public actual fun GdipGetImageDecoders(numdecoders: UInt, size: UInt, decoders: Long): Status =
    0

public actual fun GdipGetImageDecodersSize(numdecoders: Long, size: Long): Status =
    0

public actual fun GdipGetImageDimension(image: Long, width: Long, height: Long): Status =
    0

public actual fun GdipGetImageEncoders(numencoders: UInt, size: UInt, encoders: Long): Status =
    0

public actual fun GdipGetImageEncodersSize(numencoders: Long, size: Long): Status =
    0

public actual fun GdipGetImageFlags(image: Long, flags: Long): Status =
    0

public actual fun GdipGetImageGraphicsContext(image: Long, graphics: Long): Status =
    0

public actual fun GdipGetImageHeight(image: Long, height: Long): Status =
    0

public actual fun GdipGetImageHorizontalResolution(image: Long, resolution: Long): Status =
    0

public actual fun GdipGetImageItemData(image: Long, item: Long): Status =
    0

public actual fun GdipGetImagePalette(image: Long, palette: Long, size: Int): Status =
    0

public actual fun GdipGetImagePaletteSize(image: Long, size: Long): Status =
    0

public actual fun GdipGetImagePixelFormat(image: Long, format: Long): Status =
    0

public actual fun GdipGetImageRawFormat(image: Long, format: Long): Status =
    0

public actual fun GdipGetImageThumbnail(image: Long, thumbwidth: UInt, thumbheight: UInt, thumbimage: Long, callback: Long, callbackdata: Long): Status =
    0

public actual fun GdipGetImageType(image: Long, type: Long): Status =
    0

public actual fun GdipGetImageVerticalResolution(image: Long, resolution: Long): Status =
    0

public actual fun GdipGetImageWidth(image: Long, width: Long): Status =
    0

public actual fun GdipGetInterpolationMode(graphics: Long, interpolationmode: Long): Status =
    0

public actual fun GdipGetLineBlend(brush: Long, blend: Long, positions: Long, count: Int): Status =
    0

public actual fun GdipGetLineBlendCount(brush: Long, count: Long): Status =
    0

public actual fun GdipGetLineColors(brush: Long, colors: Long): Status =
    0

public actual fun GdipGetLineGammaCorrection(brush: Long, usegammacorrection: Long): Status =
    0

public actual fun GdipGetLinePresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Status =
    0

public actual fun GdipGetLinePresetBlendCount(brush: Long, count: Long): Status =
    0

public actual fun GdipGetLineRect(brush: Long, rect: Long): Status =
    0

public actual fun GdipGetLineRectI(brush: Long, rect: Long): Status =
    0

public actual fun GdipGetLineSpacing(family: Long, style: Int, linespacing: Long): Status =
    0

public actual fun GdipGetLineTransform(brush: Long, matrix: Long): Status =
    0

public actual fun GdipGetLineWrapMode(brush: Long, wrapmode: Long): Status =
    0

public actual fun GdipGetLogFontA(font: Long, graphics: Long, logfonta: Long): Status =
    0

public actual fun GdipGetLogFontW(font: Long, graphics: Long, logfontw: Long): Status =
    0

public actual fun GdipGetMatrixElements(matrix: Long, matrixout: Long): Status =
    0

public actual fun GdipGetMetafileDownLevelRasterizationLimit(metafile: Long, metafilerasterizationlimitdpi: Long): Status =
    0

public actual fun GdipGetMetafileHeaderFromEmf(hemf: HENHMETAFILE, header: Long): Status =
    0

public actual fun GdipGetMetafileHeaderFromFile(filename: PCWSTR, header: Long): Status =
    0

public actual fun GdipGetMetafileHeaderFromMetafile(metafile: Long, header: Long): Status =
    0

public actual fun GdipGetMetafileHeaderFromStream(stream: Long, header: Long): Status =
    0

public actual fun GdipGetMetafileHeaderFromWmf(hwmf: HMETAFILE, wmfplaceablefileheader: Long, header: Long): Status =
    0

public actual fun GdipGetNearestColor(graphics: Long, argb: Long): Status =
    0

public actual fun GdipGetPageScale(graphics: Long, scale: Long): Status =
    0

public actual fun GdipGetPageUnit(graphics: Long, unit: Long): Status =
    0

public actual fun GdipGetPathData(path: Long, pathdata: Long): Status =
    0

public actual fun GdipGetPathFillMode(path: Long, fillmode: Long): Status =
    0

public actual fun GdipGetPathGradientBlend(brush: Long, blend: Long, positions: Long, count: Int): Status =
    0

public actual fun GdipGetPathGradientBlendCount(brush: Long, count: Long): Status =
    0

public actual fun GdipGetPathGradientCenterColor(brush: Long, colors: Long): Status =
    0

public actual fun GdipGetPathGradientCenterPoint(brush: Long, points: Long): Status =
    0

public actual fun GdipGetPathGradientCenterPointI(brush: Long, points: Long): Status =
    0

public actual fun GdipGetPathGradientFocusScales(brush: Long, xscale: Long, yscale: Long): Status =
    0

public actual fun GdipGetPathGradientGammaCorrection(brush: Long, usegammacorrection: Long): Status =
    0

public actual fun GdipGetPathGradientPath(brush: Long, path: Long): Status =
    0

public actual fun GdipGetPathGradientPointCount(brush: Long, count: Long): Status =
    0

public actual fun GdipGetPathGradientPresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Status =
    0

public actual fun GdipGetPathGradientPresetBlendCount(brush: Long, count: Long): Status =
    0

public actual fun GdipGetPathGradientRect(brush: Long, rect: Long): Status =
    0

public actual fun GdipGetPathGradientRectI(brush: Long, rect: Long): Status =
    0

public actual fun GdipGetPathGradientSurroundColorCount(brush: Long, count: Long): Status =
    0

public actual fun GdipGetPathGradientSurroundColorsWithCount(brush: Long, color: Long, count: Long): Status =
    0

public actual fun GdipGetPathGradientTransform(brush: Long, matrix: Long): Status =
    0

public actual fun GdipGetPathGradientWrapMode(brush: Long, wrapmode: Long): Status =
    0

public actual fun GdipGetPathLastPoint(path: Long, lastpoint: Long): Status =
    0

public actual fun GdipGetPathPoints(param0: Long, points: Long, count: Int): Status =
    0

public actual fun GdipGetPathPointsI(param0: Long, points: Long, count: Int): Status =
    0

public actual fun GdipGetPathTypes(path: Long, types: Long, count: Int): Status =
    0

public actual fun GdipGetPathWorldBounds(path: Long, bounds: Long, matrix: Long, pen: Long): Status =
    0

public actual fun GdipGetPathWorldBoundsI(path: Long, bounds: Long, matrix: Long, pen: Long): Status =
    0

public actual fun GdipGetPenBrushFill(pen: Long, brush: Long): Status =
    0

public actual fun GdipGetPenColor(pen: Long, argb: Long): Status =
    0

public actual fun GdipGetPenCompoundArray(pen: Long, dash: Long, count: Int): Status =
    0

public actual fun GdipGetPenCompoundCount(pen: Long, count: Long): Status =
    0

public actual fun GdipGetPenCustomEndCap(pen: Long, customcap: Long): Status =
    0

public actual fun GdipGetPenCustomStartCap(pen: Long, customcap: Long): Status =
    0

public actual fun GdipGetPenDashArray(pen: Long, dash: Long, count: Int): Status =
    0

public actual fun GdipGetPenDashCap197819(pen: Long, dashcap: Long): Status =
    0

public actual fun GdipGetPenDashCount(pen: Long, count: Long): Status =
    0

public actual fun GdipGetPenDashOffset(pen: Long, offset: Long): Status =
    0

public actual fun GdipGetPenDashStyle(pen: Long, dashstyle: Long): Status =
    0

public actual fun GdipGetPenEndCap(pen: Long, endcap: Long): Status =
    0

public actual fun GdipGetPenFillType(pen: Long, type: Long): Status =
    0

public actual fun GdipGetPenLineJoin(pen: Long, linejoin: Long): Status =
    0

public actual fun GdipGetPenMiterLimit(pen: Long, miterlimit: Long): Status =
    0

public actual fun GdipGetPenMode(pen: Long, penmode: Long): Status =
    0

public actual fun GdipGetPenStartCap(pen: Long, startcap: Long): Status =
    0

public actual fun GdipGetPenTransform(pen: Long, matrix: Long): Status =
    0

public actual fun GdipGetPenUnit(pen: Long, unit: Long): Status =
    0

public actual fun GdipGetPenWidth(pen: Long, width: Long): Status =
    0

public actual fun GdipGetPixelOffsetMode(graphics: Long, pixeloffsetmode: Long): Status =
    0

public actual fun GdipGetPointCount(path: Long, count: Long): Status =
    0

public actual fun GdipGetPropertyCount(image: Long, numofproperty: Long): Status =
    0

public actual fun GdipGetPropertyIdList(image: Long, numofproperty: UInt, list: Long): Status =
    0

public actual fun GdipGetPropertyItem(image: Long, propid: UInt, propsize: UInt, buffer: Long): Status =
    0

public actual fun GdipGetPropertyItemSize(image: Long, propid: UInt, size: Long): Status =
    0

public actual fun GdipGetPropertySize(image: Long, totalbuffersize: Long, numproperties: Long): Status =
    0

public actual fun GdipGetRegionBounds(region: Long, graphics: Long, rect: Long): Status =
    0

public actual fun GdipGetRegionBoundsI(region: Long, graphics: Long, rect: Long): Status =
    0

public actual fun GdipGetRegionData(region: Long, buffer: Long, buffersize: UInt, sizefilled: Long): Status =
    0

public actual fun GdipGetRegionDataSize(region: Long, buffersize: Long): Status =
    0

public actual fun GdipGetRegionHRgn(region: Long, graphics: Long, hrgn: Long): Status =
    0

public actual fun GdipGetRegionScans(region: Long, rects: Long, count: Long, matrix: Long): Status =
    0

public actual fun GdipGetRegionScansCount(region: Long, count: Long, matrix: Long): Status =
    0

public actual fun GdipGetRegionScansI(region: Long, rects: Long, count: Long, matrix: Long): Status =
    0

public actual fun GdipGetRenderingOrigin(graphics: Long, x: Long, y: Long): Status =
    0

public actual fun GdipGetSmoothingMode(graphics: Long, smoothingmode: Long): Status =
    0

public actual fun GdipGetSolidFillColor(brush: Long, color: Long): Status =
    0

public actual fun GdipGetStringFormatAlign(format: Long, align: Long): Status =
    0

public actual fun GdipGetStringFormatDigitSubstitution(format: Long, language: Long, substitute: Long): Status =
    0

public actual fun GdipGetStringFormatFlags(format: Long, flags: Long): Status =
    0

public actual fun GdipGetStringFormatHotkeyPrefix(format: Long, hotkeyprefix: Long): Status =
    0

public actual fun GdipGetStringFormatLineAlign(format: Long, align: Long): Status =
    0

public actual fun GdipGetStringFormatMeasurableCharacterRangeCount(format: Long, count: Long): Status =
    0

public actual fun GdipGetStringFormatTabStopCount(format: Long, count: Long): Status =
    0

public actual fun GdipGetStringFormatTabStops(format: Long, count: Int, firsttaboffset: Long, tabstops: Long): Status =
    0

public actual fun GdipGetStringFormatTrimming(format: Long, trimming: Long): Status =
    0

public actual fun GdipGetTextContrast(graphics: Long, contrast: Long): Status =
    0

public actual fun GdipGetTextRenderingHint(graphics: Long, mode: Long): Status =
    0

public actual fun GdipGetTextureImage(brush: Long, image: Long): Status =
    0

public actual fun GdipGetTextureTransform(brush: Long, matrix: Long): Status =
    0

public actual fun GdipGetTextureWrapMode(brush: Long, wrapmode: Long): Status =
    0

public actual fun GdipGetVisibleClipBounds(graphics: Long, rect: Long): Status =
    0

public actual fun GdipGetVisibleClipBoundsI(graphics: Long, rect: Long): Status =
    0

public actual fun GdipGetWorldTransform(graphics: Long, matrix: Long): Status =
    0

public actual fun GdipGraphicsClear(graphics: Long, color: UInt): Status =
    0

public actual fun GdipGraphicsSetAbort(pgraphics: Long, piabort: Long): Status =
    0

public actual fun GdipImageForceValidation(image: Long): Status =
    0

public actual fun GdipImageGetFrameCount(image: Long, dimensionid: Long, count: Long): Status =
    0

public actual fun GdipImageGetFrameDimensionsCount(image: Long, count: Long): Status =
    0

public actual fun GdipImageGetFrameDimensionsList(image: Long, dimensionids: Long, count: UInt): Status =
    0

public actual fun GdipImageRotateFlip(image: Long, rftype: RotateFlipType): Status =
    0

public actual fun GdipImageSelectActiveFrame(image: Long, dimensionid: Long, frameindex: UInt): Status =
    0

public actual fun GdipImageSetAbort(pimage: Long, piabort: Long): Status =
    0

public actual fun GdipInitializePalette(palette: Long, palettetype: PaletteType, optimalcolors: Int, usetransparentcolor: BOOL, bitmap: Long): Status =
    0

public actual fun GdipInvertMatrix(matrix: Long): Status =
    0

public actual fun GdipIsClipEmpty(graphics: Long, result: Long): Status =
    0

public actual fun GdipIsEmptyRegion(region: Long, graphics: Long, result: Long): Status =
    0

public actual fun GdipIsEqualRegion(region: Long, region2: Long, graphics: Long, result: Long): Status =
    0

public actual fun GdipIsInfiniteRegion(region: Long, graphics: Long, result: Long): Status =
    0

public actual fun GdipIsMatrixEqual(matrix: Long, matrix2: Long, result: Long): Status =
    0

public actual fun GdipIsMatrixIdentity(matrix: Long, result: Long): Status =
    0

public actual fun GdipIsMatrixInvertible(matrix: Long, result: Long): Status =
    0

public actual fun GdipIsOutlineVisiblePathPoint(path: Long, x: Float, y: Float, pen: Long, graphics: Long, result: Long): Status =
    0

public actual fun GdipIsOutlineVisiblePathPointI(path: Long, x: Int, y: Int, pen: Long, graphics: Long, result: Long): Status =
    0

public actual fun GdipIsStyleAvailable(family: Long, style: Int, isstyleavailable: Long): Status =
    0

public actual fun GdipIsVisibleClipEmpty(graphics: Long, result: Long): Status =
    0

public actual fun GdipIsVisiblePathPoint(path: Long, x: Float, y: Float, graphics: Long, result: Long): Status =
    0

public actual fun GdipIsVisiblePathPointI(path: Long, x: Int, y: Int, graphics: Long, result: Long): Status =
    0

public actual fun GdipIsVisiblePoint(graphics: Long, x: Float, y: Float, result: Long): Status =
    0

public actual fun GdipIsVisiblePointI(graphics: Long, x: Int, y: Int, result: Long): Status =
    0

public actual fun GdipIsVisibleRect(graphics: Long, x: Float, y: Float, width: Float, height: Float, result: Long): Status =
    0

public actual fun GdipIsVisibleRectI(graphics: Long, x: Int, y: Int, width: Int, height: Int, result: Long): Status =
    0

public actual fun GdipIsVisibleRegionPoint(region: Long, x: Float, y: Float, graphics: Long, result: Long): Status =
    0

public actual fun GdipIsVisibleRegionPointI(region: Long, x: Int, y: Int, graphics: Long, result: Long): Status =
    0

public actual fun GdipIsVisibleRegionRect(region: Long, x: Float, y: Float, width: Float, height: Float, graphics: Long, result: Long): Status =
    0

public actual fun GdipIsVisibleRegionRectI(region: Long, x: Int, y: Int, width: Int, height: Int, graphics: Long, result: Long): Status =
    0

public actual fun GdipLoadImageFromFile(filename: PCWSTR, image: Long): Status =
    0

public actual fun GdipLoadImageFromFileICM(filename: PCWSTR, image: Long): Status =
    0

public actual fun GdipLoadImageFromStream(stream: Long, image: Long): Status =
    0

public actual fun GdipLoadImageFromStreamICM(stream: Long, image: Long): Status =
    0

public actual fun GdipMeasureCharacterRanges(graphics: Long, string: PCWSTR, length: Int, font: Long, layoutrect: Long, stringformat: Long, regioncount: Int, regions: Long): Status =
    0

public actual fun GdipMeasureDriverString(graphics: Long, text: Long, length: Int, font: Long, positions: Long, flags: Int, matrix: Long, boundingbox: Long): Status =
    0

public actual fun GdipMeasureString(graphics: Long, string: PCWSTR, length: Int, font: Long, layoutrect: Long, stringformat: Long, boundingbox: Long, codepointsfitted: Long, linesfilled: Long): Status =
    0

public actual fun GdipMultiplyLineTransform(brush: Long, matrix: Long, order: MatrixOrder): Status =
    0

public actual fun GdipMultiplyMatrix(matrix: Long, matrix2: Long, order: MatrixOrder): Status =
    0

public actual fun GdipMultiplyPathGradientTransform(brush: Long, matrix: Long, order: MatrixOrder): Status =
    0

public actual fun GdipMultiplyPenTransform(pen: Long, matrix: Long, order: MatrixOrder): Status =
    0

public actual fun GdipMultiplyTextureTransform(brush: Long, matrix: Long, order: MatrixOrder): Status =
    0

public actual fun GdipMultiplyWorldTransform(graphics: Long, matrix: Long, order: MatrixOrder): Status =
    0

public actual fun GdipNewInstalledFontCollection(fontcollection: Long): Status =
    0

public actual fun GdipNewPrivateFontCollection(fontcollection: Long): Status =
    0

public actual fun GdipPathIterCopyData(iterator: Long, resultcount: Long, points: Long, types: Long, startindex: Int, endindex: Int): Status =
    0

public actual fun GdipPathIterEnumerate(iterator: Long, resultcount: Long, points: Long, types: Long, count: Int): Status =
    0

public actual fun GdipPathIterGetCount(iterator: Long, count: Long): Status =
    0

public actual fun GdipPathIterGetSubpathCount(iterator: Long, count: Long): Status =
    0

public actual fun GdipPathIterHasCurve(iterator: Long, hascurve: Long): Status =
    0

public actual fun GdipPathIterIsValid(iterator: Long, valid: Long): Status =
    0

public actual fun GdipPathIterNextMarker(iterator: Long, resultcount: Long, startindex: Long, endindex: Long): Status =
    0

public actual fun GdipPathIterNextMarkerPath(iterator: Long, resultcount: Long, path: Long): Status =
    0

public actual fun GdipPathIterNextPathType(iterator: Long, resultcount: Long, pathtype: Long, startindex: Long, endindex: Long): Status =
    0

public actual fun GdipPathIterNextSubpath(iterator: Long, resultcount: Long, startindex: Long, endindex: Long, isclosed: Long): Status =
    0

public actual fun GdipPathIterNextSubpathPath(iterator: Long, resultcount: Long, path: Long, isclosed: Long): Status =
    0

public actual fun GdipPathIterRewind(iterator: Long): Status =
    0

public actual fun GdipPlayMetafileRecord(metafile: Long, recordtype: EmfPlusRecordType, flags: UInt, datasize: UInt, data: Long): Status =
    0

public actual fun GdipPrivateAddFontFile(fontcollection: Long, filename: PCWSTR): Status =
    0

public actual fun GdipPrivateAddMemoryFont(fontcollection: Long, memory: Long, length: Int): Status =
    0

public actual fun GdipRecordMetafile(referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status =
    0

public actual fun GdipRecordMetafileFileName(filename: PCWSTR, referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status =
    0

public actual fun GdipRecordMetafileFileNameI(filename: PCWSTR, referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status =
    0

public actual fun GdipRecordMetafileI(referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status =
    0

public actual fun GdipRecordMetafileStream(stream: Long, referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status =
    0

public actual fun GdipRecordMetafileStreamI(stream: Long, referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status =
    0

public actual fun GdipReleaseDC(graphics: Long, hdc: HDC): Status =
    0

public actual fun GdipRemovePropertyItem(image: Long, propid: UInt): Status =
    0

public actual fun GdipResetClip(graphics: Long): Status =
    0

public actual fun GdipResetImageAttributes(imageattr: Long, type: ColorAdjustType): Status =
    0

public actual fun GdipResetLineTransform(brush: Long): Status =
    0

public actual fun GdipResetPageTransform(graphics: Long): Status =
    0

public actual fun GdipResetPath(path: Long): Status =
    0

public actual fun GdipResetPathGradientTransform(brush: Long): Status =
    0

public actual fun GdipResetPenTransform(pen: Long): Status =
    0

public actual fun GdipResetTextureTransform(brush: Long): Status =
    0

public actual fun GdipResetWorldTransform(graphics: Long): Status =
    0

public actual fun GdipRestoreGraphics(graphics: Long, state: UInt): Status =
    0

public actual fun GdipReversePath(path: Long): Status =
    0

public actual fun GdipRotateLineTransform(brush: Long, angle: Float, order: MatrixOrder): Status =
    0

public actual fun GdipRotateMatrix(matrix: Long, angle: Float, order: MatrixOrder): Status =
    0

public actual fun GdipRotatePathGradientTransform(brush: Long, angle: Float, order: MatrixOrder): Status =
    0

public actual fun GdipRotatePenTransform(pen: Long, angle: Float, order: MatrixOrder): Status =
    0

public actual fun GdipRotateTextureTransform(brush: Long, angle: Float, order: MatrixOrder): Status =
    0

public actual fun GdipRotateWorldTransform(graphics: Long, angle: Float, order: MatrixOrder): Status =
    0

public actual fun GdipSaveAdd(image: Long, encoderparams: Long): Status =
    0

public actual fun GdipSaveAddImage(image: Long, newimage: Long, encoderparams: Long): Status =
    0

public actual fun GdipSaveGraphics(graphics: Long, state: Long): Status =
    0

public actual fun GdipSaveImageToFile(image: Long, filename: PCWSTR, clsidencoder: Long, encoderparams: Long): Status =
    0

public actual fun GdipSaveImageToStream(image: Long, stream: Long, clsidencoder: Long, encoderparams: Long): Status =
    0

public actual fun GdipScaleLineTransform(brush: Long, sx: Float, sy: Float, order: MatrixOrder): Status =
    0

public actual fun GdipScaleMatrix(matrix: Long, scalex: Float, scaley: Float, order: MatrixOrder): Status =
    0

public actual fun GdipScalePathGradientTransform(brush: Long, sx: Float, sy: Float, order: MatrixOrder): Status =
    0

public actual fun GdipScalePenTransform(pen: Long, sx: Float, sy: Float, order: MatrixOrder): Status =
    0

public actual fun GdipScaleTextureTransform(brush: Long, sx: Float, sy: Float, order: MatrixOrder): Status =
    0

public actual fun GdipScaleWorldTransform(graphics: Long, sx: Float, sy: Float, order: MatrixOrder): Status =
    0

public actual fun GdipSetAdjustableArrowCapFillState(cap: Long, fillstate: BOOL): Status =
    0

public actual fun GdipSetAdjustableArrowCapHeight(cap: Long, height: Float): Status =
    0

public actual fun GdipSetAdjustableArrowCapMiddleInset(cap: Long, middleinset: Float): Status =
    0

public actual fun GdipSetAdjustableArrowCapWidth(cap: Long, width: Float): Status =
    0

public actual fun GdipSetClipGraphics(graphics: Long, srcgraphics: Long, combinemode: CombineMode): Status =
    0

public actual fun GdipSetClipHrgn(graphics: Long, hrgn: HRGN, combinemode: CombineMode): Status =
    0

public actual fun GdipSetClipPath(graphics: Long, path: Long, combinemode: CombineMode): Status =
    0

public actual fun GdipSetClipRect(graphics: Long, x: Float, y: Float, width: Float, height: Float, combinemode: CombineMode): Status =
    0

public actual fun GdipSetClipRectI(graphics: Long, x: Int, y: Int, width: Int, height: Int, combinemode: CombineMode): Status =
    0

public actual fun GdipSetClipRegion(graphics: Long, region: Long, combinemode: CombineMode): Status =
    0

public actual fun GdipSetCompositingMode(graphics: Long, compositingmode: CompositingMode): Status =
    0

public actual fun GdipSetCompositingQuality(graphics: Long, compositingquality: CompositingQuality): Status =
    0

public actual fun GdipSetCustomLineCapBaseCap(customcap: Long, basecap: LineCap): Status =
    0

public actual fun GdipSetCustomLineCapBaseInset(customcap: Long, inset: Float): Status =
    0

public actual fun GdipSetCustomLineCapStrokeCaps(customcap: Long, startcap: LineCap, endcap: LineCap): Status =
    0

public actual fun GdipSetCustomLineCapStrokeJoin(customcap: Long, linejoin: LineJoin): Status =
    0

public actual fun GdipSetCustomLineCapWidthScale(customcap: Long, widthscale: Float): Status =
    0

public actual fun GdipSetEffectParameters(effect: Long, params: Long, size: UInt): Status =
    0

public actual fun GdipSetEmpty(region: Long): Status =
    0

public actual fun GdipSetImageAttributesCachedBackground(imageattr: Long, enableflag: BOOL): Status =
    0

public actual fun GdipSetImageAttributesColorKeys(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, colorlow: UInt, colorhigh: UInt): Status =
    0

public actual fun GdipSetImageAttributesColorMatrix(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, colormatrix: Long, graymatrix: Long, flags: ColorMatrixFlags): Status =
    0

public actual fun GdipSetImageAttributesGamma(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, gamma: Float): Status =
    0

public actual fun GdipSetImageAttributesNoOp(imageattr: Long, type: ColorAdjustType, enableflag: BOOL): Status =
    0

public actual fun GdipSetImageAttributesOutputChannel(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, channelflags: ColorChannelFlags): Status =
    0

public actual fun GdipSetImageAttributesOutputChannelColorProfile(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, colorprofilefilename: PCWSTR): Status =
    0

public actual fun GdipSetImageAttributesRemapTable(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, mapsize: UInt, map: Long): Status =
    0

public actual fun GdipSetImageAttributesThreshold(imageattr: Long, type: ColorAdjustType, enableflag: BOOL, threshold: Float): Status =
    0

public actual fun GdipSetImageAttributesToIdentity(imageattr: Long, type: ColorAdjustType): Status =
    0

public actual fun GdipSetImageAttributesWrapMode(imageattr: Long, wrap: WrapMode, argb: UInt, clamp: BOOL): Status =
    0

public actual fun GdipSetImagePalette(image: Long, palette: Long): Status =
    0

public actual fun GdipSetInfinite(region: Long): Status =
    0

public actual fun GdipSetInterpolationMode(graphics: Long, interpolationmode: InterpolationMode): Status =
    0

public actual fun GdipSetLineBlend(brush: Long, blend: Long, positions: Long, count: Int): Status =
    0

public actual fun GdipSetLineColors(brush: Long, color1: UInt, color2: UInt): Status =
    0

public actual fun GdipSetLineGammaCorrection(brush: Long, usegammacorrection: BOOL): Status =
    0

public actual fun GdipSetLineLinearBlend(brush: Long, focus: Float, scale: Float): Status =
    0

public actual fun GdipSetLinePresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Status =
    0

public actual fun GdipSetLineSigmaBlend(brush: Long, focus: Float, scale: Float): Status =
    0

public actual fun GdipSetLineTransform(brush: Long, matrix: Long): Status =
    0

public actual fun GdipSetLineWrapMode(brush: Long, wrapmode: WrapMode): Status =
    0

public actual fun GdipSetMatrixElements(matrix: Long, m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float): Status =
    0

public actual fun GdipSetMetafileDownLevelRasterizationLimit(metafile: Long, metafilerasterizationlimitdpi: UInt): Status =
    0

public actual fun GdipSetPageScale(graphics: Long, scale: Float): Status =
    0

public actual fun GdipSetPageUnit(graphics: Long, unit: Unit): Status =
    0

public actual fun GdipSetPathFillMode(path: Long, fillmode: FillMode): Status =
    0

public actual fun GdipSetPathGradientBlend(brush: Long, blend: Long, positions: Long, count: Int): Status =
    0

public actual fun GdipSetPathGradientCenterColor(brush: Long, colors: UInt): Status =
    0

public actual fun GdipSetPathGradientCenterPoint(brush: Long, points: Long): Status =
    0

public actual fun GdipSetPathGradientCenterPointI(brush: Long, points: Long): Status =
    0

public actual fun GdipSetPathGradientFocusScales(brush: Long, xscale: Float, yscale: Float): Status =
    0

public actual fun GdipSetPathGradientGammaCorrection(brush: Long, usegammacorrection: BOOL): Status =
    0

public actual fun GdipSetPathGradientLinearBlend(brush: Long, focus: Float, scale: Float): Status =
    0

public actual fun GdipSetPathGradientPath(brush: Long, path: Long): Status =
    0

public actual fun GdipSetPathGradientPresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Status =
    0

public actual fun GdipSetPathGradientSigmaBlend(brush: Long, focus: Float, scale: Float): Status =
    0

public actual fun GdipSetPathGradientSurroundColorsWithCount(brush: Long, color: Long, count: Long): Status =
    0

public actual fun GdipSetPathGradientTransform(brush: Long, matrix: Long): Status =
    0

public actual fun GdipSetPathGradientWrapMode(brush: Long, wrapmode: WrapMode): Status =
    0

public actual fun GdipSetPathMarker(path: Long): Status =
    0

public actual fun GdipSetPenBrushFill(pen: Long, brush: Long): Status =
    0

public actual fun GdipSetPenColor(pen: Long, argb: UInt): Status =
    0

public actual fun GdipSetPenCompoundArray(pen: Long, dash: Long, count: Int): Status =
    0

public actual fun GdipSetPenCustomEndCap(pen: Long, customcap: Long): Status =
    0

public actual fun GdipSetPenCustomStartCap(pen: Long, customcap: Long): Status =
    0

public actual fun GdipSetPenDashArray(pen: Long, dash: Long, count: Int): Status =
    0

public actual fun GdipSetPenDashCap197819(pen: Long, dashcap: DashCap): Status =
    0

public actual fun GdipSetPenDashOffset(pen: Long, offset: Float): Status =
    0

public actual fun GdipSetPenDashStyle(pen: Long, dashstyle: DashStyle): Status =
    0

public actual fun GdipSetPenEndCap(pen: Long, endcap: LineCap): Status =
    0

public actual fun GdipSetPenLineCap197819(pen: Long, startcap: LineCap, endcap: LineCap, dashcap: DashCap): Status =
    0

public actual fun GdipSetPenLineJoin(pen: Long, linejoin: LineJoin): Status =
    0

public actual fun GdipSetPenMiterLimit(pen: Long, miterlimit: Float): Status =
    0

public actual fun GdipSetPenMode(pen: Long, penmode: PenAlignment): Status =
    0

public actual fun GdipSetPenStartCap(pen: Long, startcap: LineCap): Status =
    0

public actual fun GdipSetPenTransform(pen: Long, matrix: Long): Status =
    0

public actual fun GdipSetPenUnit(pen: Long, unit: Unit): Status =
    0

public actual fun GdipSetPenWidth(pen: Long, width: Float): Status =
    0

public actual fun GdipSetPixelOffsetMode(graphics: Long, pixeloffsetmode: PixelOffsetMode): Status =
    0

public actual fun GdipSetPropertyItem(image: Long, item: Long): Status =
    0

public actual fun GdipSetRenderingOrigin(graphics: Long, x: Int, y: Int): Status =
    0

public actual fun GdipSetSmoothingMode(graphics: Long, smoothingmode: SmoothingMode): Status =
    0

public actual fun GdipSetSolidFillColor(brush: Long, color: UInt): Status =
    0

public actual fun GdipSetStringFormatAlign(format: Long, align: StringAlignment): Status =
    0

public actual fun GdipSetStringFormatDigitSubstitution(format: Long, language: UShort, substitute: StringDigitSubstitute): Status =
    0

public actual fun GdipSetStringFormatFlags(format: Long, flags: Int): Status =
    0

public actual fun GdipSetStringFormatHotkeyPrefix(format: Long, hotkeyprefix: Int): Status =
    0

public actual fun GdipSetStringFormatLineAlign(format: Long, align: StringAlignment): Status =
    0

public actual fun GdipSetStringFormatMeasurableCharacterRanges(format: Long, rangecount: Int, ranges: Long): Status =
    0

public actual fun GdipSetStringFormatTabStops(format: Long, firsttaboffset: Float, count: Int, tabstops: Long): Status =
    0

public actual fun GdipSetStringFormatTrimming(format: Long, trimming: StringTrimming): Status =
    0

public actual fun GdipSetTextContrast(graphics: Long, contrast: UInt): Status =
    0

public actual fun GdipSetTextRenderingHint(graphics: Long, mode: TextRenderingHint): Status =
    0

public actual fun GdipSetTextureTransform(brush: Long, matrix: Long): Status =
    0

public actual fun GdipSetTextureWrapMode(brush: Long, wrapmode: WrapMode): Status =
    0

public actual fun GdipSetWorldTransform(graphics: Long, matrix: Long): Status =
    0

public actual fun GdipShearMatrix(matrix: Long, shearx: Float, sheary: Float, order: MatrixOrder): Status =
    0

public actual fun GdipStartPathFigure(path: Long): Status =
    0

public actual fun GdipStringFormatGetGenericDefault(format: Long): Status =
    0

public actual fun GdipStringFormatGetGenericTypographic(format: Long): Status =
    0

public actual fun GdipTestControl(control: GpTestControlEnum, param1: Long): Status =
    0

public actual fun GdipTransformMatrixPoints(matrix: Long, pts: Long, count: Int): Status =
    0

public actual fun GdipTransformMatrixPointsI(matrix: Long, pts: Long, count: Int): Status =
    0

public actual fun GdipTransformPath(path: Long, matrix: Long): Status =
    0

public actual fun GdipTransformPoints(graphics: Long, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: Long, count: Int): Status =
    0

public actual fun GdipTransformPointsI(graphics: Long, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: Long, count: Int): Status =
    0

public actual fun GdipTransformRegion(region: Long, matrix: Long): Status =
    0

public actual fun GdipTranslateClip(graphics: Long, dx: Float, dy: Float): Status =
    0

public actual fun GdipTranslateClipI(graphics: Long, dx: Int, dy: Int): Status =
    0

public actual fun GdipTranslateLineTransform(brush: Long, dx: Float, dy: Float, order: MatrixOrder): Status =
    0

public actual fun GdipTranslateMatrix(matrix: Long, offsetx: Float, offsety: Float, order: MatrixOrder): Status =
    0

public actual fun GdipTranslatePathGradientTransform(brush: Long, dx: Float, dy: Float, order: MatrixOrder): Status =
    0

public actual fun GdipTranslatePenTransform(pen: Long, dx: Float, dy: Float, order: MatrixOrder): Status =
    0

public actual fun GdipTranslateRegion(region: Long, dx: Float, dy: Float): Status =
    0

public actual fun GdipTranslateRegionI(region: Long, dx: Int, dy: Int): Status =
    0

public actual fun GdipTranslateTextureTransform(brush: Long, dx: Float, dy: Float, order: MatrixOrder): Status =
    0

public actual fun GdipTranslateWorldTransform(graphics: Long, dx: Float, dy: Float, order: MatrixOrder): Status =
    0

public actual fun GdipVectorTransformMatrixPoints(matrix: Long, pts: Long, count: Int): Status =
    0

public actual fun GdipVectorTransformMatrixPointsI(matrix: Long, pts: Long, count: Int): Status =
    0

public actual fun GdipWarpPath(path: Long, matrix: Long, points: Long, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, warpmode: WarpMode, flatness: Float): Status =
    0

public actual fun GdipWidenPath(nativepath: Long, pen: Long, matrix: Long, flatness: Float): Status =
    0

public actual fun GdipWindingModeOutline(path: Long, matrix: Long, flatness: Float): Status =
    0

public actual fun GdiplusNotificationHook(token: Long): Status =
    0

public actual fun GdiplusNotificationUnhook(token: ULong) {
}

public actual fun GdiplusShutdown(token: ULong) {
}

public actual fun GdiplusStartup(token: Long, input: Long, output: Long): Status =
    0
