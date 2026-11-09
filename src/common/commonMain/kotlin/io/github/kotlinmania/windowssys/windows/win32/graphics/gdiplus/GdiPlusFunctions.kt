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

public expect fun GdipAddPathArc(path: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status

public expect fun GdipAddPathArcI(path: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status

public expect fun GdipAddPathBezier(path: Long, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status

public expect fun GdipAddPathBezierI(path: Long, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status

public expect fun GdipAddPathBeziers(path: Long, points: Long, count: Int): Status

public expect fun GdipAddPathBeziersI(path: Long, points: Long, count: Int): Status

public expect fun GdipAddPathClosedCurve(path: Long, points: Long, count: Int): Status

public expect fun GdipAddPathClosedCurve2(path: Long, points: Long, count: Int, tension: Float): Status

public expect fun GdipAddPathClosedCurve2I(path: Long, points: Long, count: Int, tension: Float): Status

public expect fun GdipAddPathClosedCurveI(path: Long, points: Long, count: Int): Status

public expect fun GdipAddPathCurve(path: Long, points: Long, count: Int): Status

public expect fun GdipAddPathCurve2(path: Long, points: Long, count: Int, tension: Float): Status

public expect fun GdipAddPathCurve2I(path: Long, points: Long, count: Int, tension: Float): Status

public expect fun GdipAddPathCurve3(path: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status

public expect fun GdipAddPathCurve3I(path: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status

public expect fun GdipAddPathCurveI(path: Long, points: Long, count: Int): Status

public expect fun GdipAddPathEllipse(path: Long, x: Float, y: Float, width: Float, height: Float): Status

public expect fun GdipAddPathEllipseI(path: Long, x: Int, y: Int, width: Int, height: Int): Status

public expect fun GdipAddPathLine(path: Long, x1: Float, y1: Float, x2: Float, y2: Float): Status

public expect fun GdipAddPathLine2(path: Long, points: Long, count: Int): Status

public expect fun GdipAddPathLine2I(path: Long, points: Long, count: Int): Status

public expect fun GdipAddPathLineI(path: Long, x1: Int, y1: Int, x2: Int, y2: Int): Status

public expect fun GdipAddPathPath(path: Long, addingpath: Long, connect: BOOL): Status

public expect fun GdipAddPathPie(path: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status

public expect fun GdipAddPathPieI(path: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status

public expect fun GdipAddPathPolygon(path: Long, points: Long, count: Int): Status

public expect fun GdipAddPathPolygonI(path: Long, points: Long, count: Int): Status

public expect fun GdipAddPathRectangle(path: Long, x: Float, y: Float, width: Float, height: Float): Status

public expect fun GdipAddPathRectangleI(path: Long, x: Int, y: Int, width: Int, height: Int): Status

public expect fun GdipAddPathRectangles(path: Long, rects: Long, count: Int): Status

public expect fun GdipAddPathRectanglesI(path: Long, rects: Long, count: Int): Status

public expect fun GdipAddPathString(path: Long, string: PCWSTR, length: Int, family: Long, style: Int, emsize: Float, layoutrect: Long, format: Long): Status

public expect fun GdipAddPathStringI(path: Long, string: PCWSTR, length: Int, family: Long, style: Int, emsize: Float, layoutrect: Long, format: Long): Status

public expect fun GdipAlloc(size: ULong): Long

public expect fun GdipBeginContainer(graphics: Long, dstrect: Long, srcrect: Long, unit: Unit, state: Long): Status

public expect fun GdipBeginContainer2(graphics: Long, state: Long): Status

public expect fun GdipBeginContainerI(graphics: Long, dstrect: Long, srcrect: Long, unit: Unit, state: Long): Status

public expect fun GdipBitmapApplyEffect(bitmap: Long, effect: Long, roi: Long, useauxdata: BOOL, auxdata: Long, auxdatasize: Long): Status

public expect fun GdipBitmapConvertFormat(pinputbitmap: Long, format: Int, dithertype: DitherType, palettetype: PaletteType, palette: Long, alphathresholdpercent: Float): Status

public expect fun GdipBitmapCreateApplyEffect(inputbitmaps: Long, numinputs: Int, effect: Long, roi: Long, outputrect: Long, outputbitmap: Long, useauxdata: BOOL, auxdata: Long, auxdatasize: Long): Status

public expect fun GdipBitmapGetHistogram(bitmap: Long, format: HistogramFormat, numberofentries: UInt, channel0: Long, channel1: Long, channel2: Long, channel3: Long): Status

public expect fun GdipBitmapGetHistogramSize(format: HistogramFormat, numberofentries: Long): Status

public expect fun GdipBitmapGetPixel(bitmap: Long, x: Int, y: Int, color: Long): Status

public expect fun GdipBitmapLockBits(bitmap: Long, rect: Long, flags: UInt, format: Int, lockedbitmapdata: Long): Status

public expect fun GdipBitmapSetPixel(bitmap: Long, x: Int, y: Int, color: UInt): Status

public expect fun GdipBitmapSetResolution(bitmap: Long, xdpi: Float, ydpi: Float): Status

public expect fun GdipBitmapUnlockBits(bitmap: Long, lockedbitmapdata: Long): Status

public expect fun GdipClearPathMarkers(path: Long): Status

public expect fun GdipCloneBitmapArea(x: Float, y: Float, width: Float, height: Float, format: Int, srcbitmap: Long, dstbitmap: Long): Status

public expect fun GdipCloneBitmapAreaI(x: Int, y: Int, width: Int, height: Int, format: Int, srcbitmap: Long, dstbitmap: Long): Status

public expect fun GdipCloneBrush(brush: Long, clonebrush: Long): Status

public expect fun GdipCloneCustomLineCap(customcap: Long, clonedcap: Long): Status

public expect fun GdipCloneFont(font: Long, clonefont: Long): Status

public expect fun GdipCloneFontFamily(fontfamily: Long, clonedfontfamily: Long): Status

public expect fun GdipCloneImage(image: Long, cloneimage: Long): Status

public expect fun GdipCloneImageAttributes(imageattr: Long, cloneimageattr: Long): Status

public expect fun GdipCloneMatrix(matrix: Long, clonematrix: Long): Status

public expect fun GdipClonePath(path: Long, clonepath: Long): Status

public expect fun GdipClonePen(pen: Long, clonepen: Long): Status

public expect fun GdipCloneRegion(region: Long, cloneregion: Long): Status

public expect fun GdipCloneStringFormat(format: Long, newformat: Long): Status

public expect fun GdipClosePathFigure(path: Long): Status

public expect fun GdipClosePathFigures(path: Long): Status

public expect fun GdipCombineRegionPath(region: Long, path: Long, combinemode: CombineMode): Status

public expect fun GdipCombineRegionRect(region: Long, rect: Long, combinemode: CombineMode): Status

public expect fun GdipCombineRegionRectI(region: Long, rect: Long, combinemode: CombineMode): Status

public expect fun GdipCombineRegionRegion(region: Long, region2: Long, combinemode: CombineMode): Status

public expect fun GdipComment(graphics: Long, sizedata: UInt, data: Long): Status

public expect fun GdipConvertToEmfPlus(refgraphics: Long, metafile: Long, conversionfailureflag: Long, emftype: EmfType, description: PCWSTR, out_metafile: Long): Status

public expect fun GdipConvertToEmfPlusToFile(refgraphics: Long, metafile: Long, conversionfailureflag: Long, filename: PCWSTR, emftype: EmfType, description: PCWSTR, out_metafile: Long): Status

public expect fun GdipConvertToEmfPlusToStream(refgraphics: Long, metafile: Long, conversionfailureflag: Long, stream: Long, emftype: EmfType, description: PCWSTR, out_metafile: Long): Status

public expect fun GdipCreateAdjustableArrowCap(height: Float, width: Float, isfilled: BOOL, cap: Long): Status

public expect fun GdipCreateBitmapFromFile(filename: PCWSTR, bitmap: Long): Status

public expect fun GdipCreateBitmapFromFileICM(filename: PCWSTR, bitmap: Long): Status

public expect fun GdipCreateBitmapFromGdiDib(gdibitmapinfo: Long, gdibitmapdata: Long, bitmap: Long): Status

public expect fun GdipCreateBitmapFromGraphics(width: Int, height: Int, target: Long, bitmap: Long): Status

public expect fun GdipCreateBitmapFromHBITMAP(hbm: HBITMAP, hpal: HPALETTE, bitmap: Long): Status

public expect fun GdipCreateBitmapFromHICON(hicon: HICON, bitmap: Long): Status

public expect fun GdipCreateBitmapFromResource(hinstance: HINSTANCE, lpbitmapname: PCWSTR, bitmap: Long): Status

public expect fun GdipCreateBitmapFromScan0(width: Int, height: Int, stride: Int, format: Int, scan0: Long, bitmap: Long): Status

public expect fun GdipCreateBitmapFromStream(stream: Long, bitmap: Long): Status

public expect fun GdipCreateBitmapFromStreamICM(stream: Long, bitmap: Long): Status

public expect fun GdipCreateCachedBitmap(bitmap: Long, graphics: Long, cachedbitmap: Long): Status

public expect fun GdipCreateCustomLineCap(fillpath: Long, strokepath: Long, basecap: LineCap, baseinset: Float, customcap: Long): Status

public expect fun GdipCreateEffect(guid: GUID, effect: Long): Status

public expect fun GdipCreateFont(fontfamily: Long, emsize: Float, style: Int, unit: Unit, font: Long): Status

public expect fun GdipCreateFontFamilyFromName(name: PCWSTR, fontcollection: Long, fontfamily: Long): Status

public expect fun GdipCreateFontFromDC(hdc: HDC, font: Long): Status

public expect fun GdipCreateFontFromLogfontA(hdc: HDC, logfont: Long, font: Long): Status

public expect fun GdipCreateFontFromLogfontW(hdc: HDC, logfont: Long, font: Long): Status

public expect fun GdipCreateFromHDC(hdc: HDC, graphics: Long): Status

public expect fun GdipCreateFromHDC2(hdc: HDC, hdevice: HANDLE, graphics: Long): Status

public expect fun GdipCreateFromHWND(hwnd: HWND, graphics: Long): Status

public expect fun GdipCreateFromHWNDICM(hwnd: HWND, graphics: Long): Status

public expect fun GdipCreateHBITMAPFromBitmap(bitmap: Long, hbmreturn: Long, background: UInt): Status

public expect fun GdipCreateHICONFromBitmap(bitmap: Long, hbmreturn: Long): Status

public expect fun GdipCreateHalftonePalette(): HPALETTE

public expect fun GdipCreateHatchBrush(hatchstyle: HatchStyle, forecol: UInt, backcol: UInt, brush: Long): Status

public expect fun GdipCreateImageAttributes(imageattr: Long): Status

public expect fun GdipCreateLineBrush(point1: Long, point2: Long, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: Long): Status

public expect fun GdipCreateLineBrushFromRect(rect: Long, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: Long): Status

public expect fun GdipCreateLineBrushFromRectI(rect: Long, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: Long): Status

public expect fun GdipCreateLineBrushFromRectWithAngle(rect: Long, color1: UInt, color2: UInt, angle: Float, isanglescalable: BOOL, wrapmode: WrapMode, linegradient: Long): Status

public expect fun GdipCreateLineBrushFromRectWithAngleI(rect: Long, color1: UInt, color2: UInt, angle: Float, isanglescalable: BOOL, wrapmode: WrapMode, linegradient: Long): Status

public expect fun GdipCreateLineBrushI(point1: Long, point2: Long, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: Long): Status

public expect fun GdipCreateMatrix(matrix: Long): Status

public expect fun GdipCreateMatrix2(m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float, matrix: Long): Status

public expect fun GdipCreateMatrix3(rect: Long, dstplg: Long, matrix: Long): Status

public expect fun GdipCreateMatrix3I(rect: Long, dstplg: Long, matrix: Long): Status

public expect fun GdipCreateMetafileFromEmf(hemf: HENHMETAFILE, deleteemf: BOOL, metafile: Long): Status

public expect fun GdipCreateMetafileFromFile(file: PCWSTR, metafile: Long): Status

public expect fun GdipCreateMetafileFromStream(stream: Long, metafile: Long): Status

public expect fun GdipCreateMetafileFromWmf(hwmf: HMETAFILE, deletewmf: BOOL, wmfplaceablefileheader: Long, metafile: Long): Status

public expect fun GdipCreateMetafileFromWmfFile(file: PCWSTR, wmfplaceablefileheader: Long, metafile: Long): Status

public expect fun GdipCreatePath(brushmode: FillMode, path: Long): Status

public expect fun GdipCreatePath2(param0: Long, param1: Long, param2: Int, param3: FillMode, path: Long): Status

public expect fun GdipCreatePath2I(param0: Long, param1: Long, param2: Int, param3: FillMode, path: Long): Status

public expect fun GdipCreatePathGradient(points: Long, count: Int, wrapmode: WrapMode, polygradient: Long): Status

public expect fun GdipCreatePathGradientFromPath(path: Long, polygradient: Long): Status

public expect fun GdipCreatePathGradientI(points: Long, count: Int, wrapmode: WrapMode, polygradient: Long): Status

public expect fun GdipCreatePathIter(iterator: Long, path: Long): Status

public expect fun GdipCreatePen1(color: UInt, width: Float, unit: Unit, pen: Long): Status

public expect fun GdipCreatePen2(brush: Long, width: Float, unit: Unit, pen: Long): Status

public expect fun GdipCreateRegion(region: Long): Status

public expect fun GdipCreateRegionHrgn(hrgn: HRGN, region: Long): Status

public expect fun GdipCreateRegionPath(path: Long, region: Long): Status

public expect fun GdipCreateRegionRect(rect: Long, region: Long): Status

public expect fun GdipCreateRegionRectI(rect: Long, region: Long): Status

public expect fun GdipCreateRegionRgnData(regiondata: Long, size: Int, region: Long): Status

public expect fun GdipCreateSolidFill(color: UInt, brush: Long): Status

public expect fun GdipCreateStreamOnFile(filename: PCWSTR, access: UInt, stream: Long): Status

public expect fun GdipCreateStringFormat(formatattributes: Int, language: UShort, format: Long): Status

public expect fun GdipCreateTexture(image: Long, wrapmode: WrapMode, texture: Long): Status

public expect fun GdipCreateTexture2(image: Long, wrapmode: WrapMode, x: Float, y: Float, width: Float, height: Float, texture: Long): Status

public expect fun GdipCreateTexture2I(image: Long, wrapmode: WrapMode, x: Int, y: Int, width: Int, height: Int, texture: Long): Status

public expect fun GdipCreateTextureIA(image: Long, imageattributes: Long, x: Float, y: Float, width: Float, height: Float, texture: Long): Status

public expect fun GdipCreateTextureIAI(image: Long, imageattributes: Long, x: Int, y: Int, width: Int, height: Int, texture: Long): Status

public expect fun GdipDeleteBrush(brush: Long): Status

public expect fun GdipDeleteCachedBitmap(cachedbitmap: Long): Status

public expect fun GdipDeleteCustomLineCap(customcap: Long): Status

public expect fun GdipDeleteEffect(effect: Long): Status

public expect fun GdipDeleteFont(font: Long): Status

public expect fun GdipDeleteFontFamily(fontfamily: Long): Status

public expect fun GdipDeleteGraphics(graphics: Long): Status

public expect fun GdipDeleteMatrix(matrix: Long): Status

public expect fun GdipDeletePath(path: Long): Status

public expect fun GdipDeletePathIter(iterator: Long): Status

public expect fun GdipDeletePen(pen: Long): Status

public expect fun GdipDeletePrivateFontCollection(fontcollection: Long): Status

public expect fun GdipDeleteRegion(region: Long): Status

public expect fun GdipDeleteStringFormat(format: Long): Status

public expect fun GdipDisposeImage(image: Long): Status

public expect fun GdipDisposeImageAttributes(imageattr: Long): Status

public expect fun GdipDrawArc(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status

public expect fun GdipDrawArcI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status

public expect fun GdipDrawBezier(graphics: Long, pen: Long, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status

public expect fun GdipDrawBezierI(graphics: Long, pen: Long, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status

public expect fun GdipDrawBeziers(graphics: Long, pen: Long, points: Long, count: Int): Status

public expect fun GdipDrawBeziersI(graphics: Long, pen: Long, points: Long, count: Int): Status

public expect fun GdipDrawCachedBitmap(graphics: Long, cachedbitmap: Long, x: Int, y: Int): Status

public expect fun GdipDrawClosedCurve(graphics: Long, pen: Long, points: Long, count: Int): Status

public expect fun GdipDrawClosedCurve2(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Status

public expect fun GdipDrawClosedCurve2I(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Status

public expect fun GdipDrawClosedCurveI(graphics: Long, pen: Long, points: Long, count: Int): Status

public expect fun GdipDrawCurve(graphics: Long, pen: Long, points: Long, count: Int): Status

public expect fun GdipDrawCurve2(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Status

public expect fun GdipDrawCurve2I(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Status

public expect fun GdipDrawCurve3(graphics: Long, pen: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status

public expect fun GdipDrawCurve3I(graphics: Long, pen: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status

public expect fun GdipDrawCurveI(graphics: Long, pen: Long, points: Long, count: Int): Status

public expect fun GdipDrawDriverString(graphics: Long, text: Long, length: Int, font: Long, brush: Long, positions: Long, flags: Int, matrix: Long): Status

public expect fun GdipDrawEllipse(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float): Status

public expect fun GdipDrawEllipseI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int): Status

public expect fun GdipDrawImage(graphics: Long, image: Long, x: Float, y: Float): Status

public expect fun GdipDrawImageFX(graphics: Long, image: Long, source: Long, xform: Long, effect: Long, imageattributes: Long, srcunit: Unit): Status

public expect fun GdipDrawImageI(graphics: Long, image: Long, x: Int, y: Int): Status

public expect fun GdipDrawImagePointRect(graphics: Long, image: Long, x: Float, y: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit): Status

public expect fun GdipDrawImagePointRectI(graphics: Long, image: Long, x: Int, y: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit): Status

public expect fun GdipDrawImagePoints(graphics: Long, image: Long, dstpoints: Long, count: Int): Status

public expect fun GdipDrawImagePointsI(graphics: Long, image: Long, dstpoints: Long, count: Int): Status

public expect fun GdipDrawImagePointsRect(graphics: Long, image: Long, points: Long, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: Long, callback: Long, callbackdata: Long): Status

public expect fun GdipDrawImagePointsRectI(graphics: Long, image: Long, points: Long, count: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: Long, callback: Long, callbackdata: Long): Status

public expect fun GdipDrawImageRect(graphics: Long, image: Long, x: Float, y: Float, width: Float, height: Float): Status

public expect fun GdipDrawImageRectI(graphics: Long, image: Long, x: Int, y: Int, width: Int, height: Int): Status

public expect fun GdipDrawImageRectRect(graphics: Long, image: Long, dstx: Float, dsty: Float, dstwidth: Float, dstheight: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: Long, callback: Long, callbackdata: Long): Status

public expect fun GdipDrawImageRectRectI(graphics: Long, image: Long, dstx: Int, dsty: Int, dstwidth: Int, dstheight: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: Long, callback: Long, callbackdata: Long): Status

public expect fun GdipDrawLine(graphics: Long, pen: Long, x1: Float, y1: Float, x2: Float, y2: Float): Status

public expect fun GdipDrawLineI(graphics: Long, pen: Long, x1: Int, y1: Int, x2: Int, y2: Int): Status

public expect fun GdipDrawLines(graphics: Long, pen: Long, points: Long, count: Int): Status

public expect fun GdipDrawLinesI(graphics: Long, pen: Long, points: Long, count: Int): Status

public expect fun GdipDrawPath(graphics: Long, pen: Long, path: Long): Status

public expect fun GdipDrawPie(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status

public expect fun GdipDrawPieI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status

public expect fun GdipDrawPolygon(graphics: Long, pen: Long, points: Long, count: Int): Status

public expect fun GdipDrawPolygonI(graphics: Long, pen: Long, points: Long, count: Int): Status

public expect fun GdipDrawRectangle(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float): Status

public expect fun GdipDrawRectangleI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int): Status

public expect fun GdipDrawRectangles(graphics: Long, pen: Long, rects: Long, count: Int): Status

public expect fun GdipDrawRectanglesI(graphics: Long, pen: Long, rects: Long, count: Int): Status

public expect fun GdipDrawString(graphics: Long, string: PCWSTR, length: Int, font: Long, layoutrect: Long, stringformat: Long, brush: Long): Status

public expect fun GdipEmfToWmfBits(hemf: HENHMETAFILE, cbdata16: UInt, pdata16: Long, imapmode: Int, eflags: Int): UInt

public expect fun GdipEndContainer(graphics: Long, state: UInt): Status

public expect fun GdipEnumerateMetafileDestPoint(graphics: Long, metafile: Long, destpoint: Long, callback: Long, callbackdata: Long, imageattributes: Long): Status

public expect fun GdipEnumerateMetafileDestPointI(graphics: Long, metafile: Long, destpoint: Long, callback: Long, callbackdata: Long, imageattributes: Long): Status

public expect fun GdipEnumerateMetafileDestPoints(graphics: Long, metafile: Long, destpoints: Long, count: Int, callback: Long, callbackdata: Long, imageattributes: Long): Status

public expect fun GdipEnumerateMetafileDestPointsI(graphics: Long, metafile: Long, destpoints: Long, count: Int, callback: Long, callbackdata: Long, imageattributes: Long): Status

public expect fun GdipEnumerateMetafileDestRect(graphics: Long, metafile: Long, destrect: Long, callback: Long, callbackdata: Long, imageattributes: Long): Status

public expect fun GdipEnumerateMetafileDestRectI(graphics: Long, metafile: Long, destrect: Long, callback: Long, callbackdata: Long, imageattributes: Long): Status

public expect fun GdipEnumerateMetafileSrcRectDestPoint(graphics: Long, metafile: Long, destpoint: Long, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status

public expect fun GdipEnumerateMetafileSrcRectDestPointI(graphics: Long, metafile: Long, destpoint: Long, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status

public expect fun GdipEnumerateMetafileSrcRectDestPoints(graphics: Long, metafile: Long, destpoints: Long, count: Int, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status

public expect fun GdipEnumerateMetafileSrcRectDestPointsI(graphics: Long, metafile: Long, destpoints: Long, count: Int, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status

public expect fun GdipEnumerateMetafileSrcRectDestRect(graphics: Long, metafile: Long, destrect: Long, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status

public expect fun GdipEnumerateMetafileSrcRectDestRectI(graphics: Long, metafile: Long, destrect: Long, srcrect: Long, srcunit: Unit, callback: Long, callbackdata: Long, imageattributes: Long): Status

public expect fun GdipFillClosedCurve(graphics: Long, brush: Long, points: Long, count: Int): Status

public expect fun GdipFillClosedCurve2(graphics: Long, brush: Long, points: Long, count: Int, tension: Float, fillmode: FillMode): Status

public expect fun GdipFillClosedCurve2I(graphics: Long, brush: Long, points: Long, count: Int, tension: Float, fillmode: FillMode): Status

public expect fun GdipFillClosedCurveI(graphics: Long, brush: Long, points: Long, count: Int): Status

public expect fun GdipFillEllipse(graphics: Long, brush: Long, x: Float, y: Float, width: Float, height: Float): Status

public expect fun GdipFillEllipseI(graphics: Long, brush: Long, x: Int, y: Int, width: Int, height: Int): Status

public expect fun GdipFillPath(graphics: Long, brush: Long, path: Long): Status

public expect fun GdipFillPie(graphics: Long, brush: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status

public expect fun GdipFillPieI(graphics: Long, brush: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status

public expect fun GdipFillPolygon(graphics: Long, brush: Long, points: Long, count: Int, fillmode: FillMode): Status

public expect fun GdipFillPolygon2(graphics: Long, brush: Long, points: Long, count: Int): Status

public expect fun GdipFillPolygon2I(graphics: Long, brush: Long, points: Long, count: Int): Status

public expect fun GdipFillPolygonI(graphics: Long, brush: Long, points: Long, count: Int, fillmode: FillMode): Status

public expect fun GdipFillRectangle(graphics: Long, brush: Long, x: Float, y: Float, width: Float, height: Float): Status

public expect fun GdipFillRectangleI(graphics: Long, brush: Long, x: Int, y: Int, width: Int, height: Int): Status

public expect fun GdipFillRectangles(graphics: Long, brush: Long, rects: Long, count: Int): Status

public expect fun GdipFillRectanglesI(graphics: Long, brush: Long, rects: Long, count: Int): Status

public expect fun GdipFillRegion(graphics: Long, brush: Long, region: Long): Status

public expect fun GdipFindFirstImageItem(image: Long, item: Long): Status

public expect fun GdipFindNextImageItem(image: Long, item: Long): Status

public expect fun GdipFlattenPath(path: Long, matrix: Long, flatness: Float): Status

public expect fun GdipFlush(graphics: Long, intention: FlushIntention): Status

public expect fun GdipFree(ptr: Long)

public expect fun GdipGetAdjustableArrowCapFillState(cap: Long, fillstate: Long): Status

public expect fun GdipGetAdjustableArrowCapHeight(cap: Long, height: Long): Status

public expect fun GdipGetAdjustableArrowCapMiddleInset(cap: Long, middleinset: Long): Status

public expect fun GdipGetAdjustableArrowCapWidth(cap: Long, width: Long): Status

public expect fun GdipGetAllPropertyItems(image: Long, totalbuffersize: UInt, numproperties: UInt, allitems: Long): Status

public expect fun GdipGetBrushType(brush: Long, type: Long): Status

public expect fun GdipGetCellAscent(family: Long, style: Int, cellascent: Long): Status

public expect fun GdipGetCellDescent(family: Long, style: Int, celldescent: Long): Status

public expect fun GdipGetClip(graphics: Long, region: Long): Status

public expect fun GdipGetClipBounds(graphics: Long, rect: Long): Status

public expect fun GdipGetClipBoundsI(graphics: Long, rect: Long): Status

public expect fun GdipGetCompositingMode(graphics: Long, compositingmode: Long): Status

public expect fun GdipGetCompositingQuality(graphics: Long, compositingquality: Long): Status

public expect fun GdipGetCustomLineCapBaseCap(customcap: Long, basecap: Long): Status

public expect fun GdipGetCustomLineCapBaseInset(customcap: Long, inset: Long): Status

public expect fun GdipGetCustomLineCapStrokeCaps(customcap: Long, startcap: Long, endcap: Long): Status

public expect fun GdipGetCustomLineCapStrokeJoin(customcap: Long, linejoin: Long): Status

public expect fun GdipGetCustomLineCapType(customcap: Long, captype: Long): Status

public expect fun GdipGetCustomLineCapWidthScale(customcap: Long, widthscale: Long): Status

public expect fun GdipGetDC(graphics: Long, hdc: Long): Status

public expect fun GdipGetDpiX(graphics: Long, dpi: Long): Status

public expect fun GdipGetDpiY(graphics: Long, dpi: Long): Status

public expect fun GdipGetEffectParameterSize(effect: Long, size: Long): Status

public expect fun GdipGetEffectParameters(effect: Long, size: Long, params: Long): Status

public expect fun GdipGetEmHeight(family: Long, style: Int, emheight: Long): Status

public expect fun GdipGetEncoderParameterList(image: Long, clsidencoder: Long, size: UInt, buffer: Long): Status

public expect fun GdipGetEncoderParameterListSize(image: Long, clsidencoder: Long, size: Long): Status

public expect fun GdipGetFamily(font: Long, family: Long): Status

public expect fun GdipGetFamilyName(family: Long, name: PWSTR, language: UShort): Status

public expect fun GdipGetFontCollectionFamilyCount(fontcollection: Long, numfound: Long): Status

public expect fun GdipGetFontCollectionFamilyList(fontcollection: Long, numsought: Int, gpfamilies: Long, numfound: Long): Status

public expect fun GdipGetFontHeight(font: Long, graphics: Long, height: Long): Status

public expect fun GdipGetFontHeightGivenDPI(font: Long, dpi: Float, height: Long): Status

public expect fun GdipGetFontSize(font: Long, size: Long): Status

public expect fun GdipGetFontStyle(font: Long, style: Long): Status

public expect fun GdipGetFontUnit(font: Long, unit: Long): Status

public expect fun GdipGetGenericFontFamilyMonospace(nativefamily: Long): Status

public expect fun GdipGetGenericFontFamilySansSerif(nativefamily: Long): Status

public expect fun GdipGetGenericFontFamilySerif(nativefamily: Long): Status

public expect fun GdipGetHatchBackgroundColor(brush: Long, backcol: Long): Status

public expect fun GdipGetHatchForegroundColor(brush: Long, forecol: Long): Status

public expect fun GdipGetHatchStyle(brush: Long, hatchstyle: Long): Status

public expect fun GdipGetHemfFromMetafile(metafile: Long, hemf: Long): Status

public expect fun GdipGetImageAttributesAdjustedPalette(imageattr: Long, colorpalette: Long, coloradjusttype: ColorAdjustType): Status

public expect fun GdipGetImageBounds(image: Long, srcrect: Long, srcunit: Long): Status

public expect fun GdipGetImageDecoders(numdecoders: UInt, size: UInt, decoders: Long): Status

public expect fun GdipGetImageDecodersSize(numdecoders: Long, size: Long): Status

public expect fun GdipGetImageDimension(image: Long, width: Long, height: Long): Status

public expect fun GdipGetImageEncoders(numencoders: UInt, size: UInt, encoders: Long): Status

public expect fun GdipGetImageEncodersSize(numencoders: Long, size: Long): Status

public expect fun GdipGetImageFlags(image: Long, flags: Long): Status

public expect fun GdipGetImageGraphicsContext(image: Long, graphics: Long): Status

public expect fun GdipGetImageHeight(image: Long, height: Long): Status

public expect fun GdipGetImageHorizontalResolution(image: Long, resolution: Long): Status

public expect fun GdipGetImageItemData(image: Long, item: Long): Status

public expect fun GdipGetImagePalette(image: Long, palette: Long, size: Int): Status

public expect fun GdipGetImagePaletteSize(image: Long, size: Long): Status

public expect fun GdipGetImagePixelFormat(image: Long, format: Long): Status

public expect fun GdipGetImageRawFormat(image: Long, format: Long): Status

public expect fun GdipGetImageThumbnail(image: Long, thumbwidth: UInt, thumbheight: UInt, thumbimage: Long, callback: Long, callbackdata: Long): Status

public expect fun GdipGetImageType(image: Long, type: Long): Status

public expect fun GdipGetImageVerticalResolution(image: Long, resolution: Long): Status

public expect fun GdipGetImageWidth(image: Long, width: Long): Status

public expect fun GdipGetInterpolationMode(graphics: Long, interpolationmode: Long): Status

public expect fun GdipGetLineBlend(brush: Long, blend: Long, positions: Long, count: Int): Status

public expect fun GdipGetLineBlendCount(brush: Long, count: Long): Status

public expect fun GdipGetLineColors(brush: Long, colors: Long): Status

public expect fun GdipGetLineGammaCorrection(brush: Long, usegammacorrection: Long): Status

public expect fun GdipGetLinePresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Status

public expect fun GdipGetLinePresetBlendCount(brush: Long, count: Long): Status

public expect fun GdipGetLineRect(brush: Long, rect: Long): Status

public expect fun GdipGetLineRectI(brush: Long, rect: Long): Status

public expect fun GdipGetLineSpacing(family: Long, style: Int, linespacing: Long): Status

public expect fun GdipGetLineTransform(brush: Long, matrix: Long): Status

public expect fun GdipGetLineWrapMode(brush: Long, wrapmode: Long): Status

public expect fun GdipGetLogFontA(font: Long, graphics: Long, logfonta: Long): Status

public expect fun GdipGetLogFontW(font: Long, graphics: Long, logfontw: Long): Status

public expect fun GdipGetMatrixElements(matrix: Long, matrixout: Long): Status

public expect fun GdipGetMetafileDownLevelRasterizationLimit(metafile: Long, metafilerasterizationlimitdpi: Long): Status

public expect fun GdipGetMetafileHeaderFromEmf(hemf: HENHMETAFILE, header: Long): Status

public expect fun GdipGetMetafileHeaderFromFile(filename: PCWSTR, header: Long): Status

public expect fun GdipGetMetafileHeaderFromMetafile(metafile: Long, header: Long): Status

public expect fun GdipGetMetafileHeaderFromStream(stream: Long, header: Long): Status

public expect fun GdipGetMetafileHeaderFromWmf(hwmf: HMETAFILE, wmfplaceablefileheader: Long, header: Long): Status

public expect fun GdipGetNearestColor(graphics: Long, argb: Long): Status

public expect fun GdipGetPageScale(graphics: Long, scale: Long): Status

public expect fun GdipGetPageUnit(graphics: Long, unit: Long): Status

public expect fun GdipGetPathData(path: Long, pathdata: Long): Status

public expect fun GdipGetPathFillMode(path: Long, fillmode: Long): Status

public expect fun GdipGetPathGradientBlend(brush: Long, blend: Long, positions: Long, count: Int): Status

public expect fun GdipGetPathGradientBlendCount(brush: Long, count: Long): Status

public expect fun GdipGetPathGradientCenterColor(brush: Long, colors: Long): Status

public expect fun GdipGetPathGradientCenterPoint(brush: Long, points: Long): Status

public expect fun GdipGetPathGradientCenterPointI(brush: Long, points: Long): Status

public expect fun GdipGetPathGradientFocusScales(brush: Long, xscale: Long, yscale: Long): Status

public expect fun GdipGetPathGradientGammaCorrection(brush: Long, usegammacorrection: Long): Status

public expect fun GdipGetPathGradientPath(brush: Long, path: Long): Status

public expect fun GdipGetPathGradientPointCount(brush: Long, count: Long): Status

public expect fun GdipGetPathGradientPresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Status

public expect fun GdipGetPathGradientPresetBlendCount(brush: Long, count: Long): Status

public expect fun GdipGetPathGradientRect(brush: Long, rect: Long): Status

public expect fun GdipGetPathGradientRectI(brush: Long, rect: Long): Status

public expect fun GdipGetPathGradientSurroundColorCount(brush: Long, count: Long): Status

public expect fun GdipGetPathGradientSurroundColorsWithCount(brush: Long, color: Long, count: Long): Status

public expect fun GdipGetPathGradientTransform(brush: Long, matrix: Long): Status

public expect fun GdipGetPathGradientWrapMode(brush: Long, wrapmode: Long): Status

public expect fun GdipGetPathLastPoint(path: Long, lastpoint: Long): Status

public expect fun GdipGetPathPoints(param0: Long, points: Long, count: Int): Status

public expect fun GdipGetPathPointsI(param0: Long, points: Long, count: Int): Status

public expect fun GdipGetPathTypes(path: Long, types: Long, count: Int): Status

public expect fun GdipGetPathWorldBounds(path: Long, bounds: Long, matrix: Long, pen: Long): Status

public expect fun GdipGetPathWorldBoundsI(path: Long, bounds: Long, matrix: Long, pen: Long): Status

public expect fun GdipGetPenBrushFill(pen: Long, brush: Long): Status

public expect fun GdipGetPenColor(pen: Long, argb: Long): Status

public expect fun GdipGetPenCompoundArray(pen: Long, dash: Long, count: Int): Status

public expect fun GdipGetPenCompoundCount(pen: Long, count: Long): Status

public expect fun GdipGetPenCustomEndCap(pen: Long, customcap: Long): Status

public expect fun GdipGetPenCustomStartCap(pen: Long, customcap: Long): Status

public expect fun GdipGetPenDashArray(pen: Long, dash: Long, count: Int): Status

public expect fun GdipGetPenDashCap197819(pen: Long, dashcap: Long): Status

public expect fun GdipGetPenDashCount(pen: Long, count: Long): Status

public expect fun GdipGetPenDashOffset(pen: Long, offset: Long): Status

public expect fun GdipGetPenDashStyle(pen: Long, dashstyle: Long): Status

public expect fun GdipGetPenEndCap(pen: Long, endcap: Long): Status

public expect fun GdipGetPenFillType(pen: Long, type: Long): Status

public expect fun GdipGetPenLineJoin(pen: Long, linejoin: Long): Status

public expect fun GdipGetPenMiterLimit(pen: Long, miterlimit: Long): Status

public expect fun GdipGetPenMode(pen: Long, penmode: Long): Status

public expect fun GdipGetPenStartCap(pen: Long, startcap: Long): Status

public expect fun GdipGetPenTransform(pen: Long, matrix: Long): Status

public expect fun GdipGetPenUnit(pen: Long, unit: Long): Status

public expect fun GdipGetPenWidth(pen: Long, width: Long): Status

public expect fun GdipGetPixelOffsetMode(graphics: Long, pixeloffsetmode: Long): Status

public expect fun GdipGetPointCount(path: Long, count: Long): Status

public expect fun GdipGetPropertyCount(image: Long, numofproperty: Long): Status

public expect fun GdipGetPropertyIdList(image: Long, numofproperty: UInt, list: Long): Status

public expect fun GdipGetPropertyItem(image: Long, propid: UInt, propsize: UInt, buffer: Long): Status

public expect fun GdipGetPropertyItemSize(image: Long, propid: UInt, size: Long): Status

public expect fun GdipGetPropertySize(image: Long, totalbuffersize: Long, numproperties: Long): Status

public expect fun GdipGetRegionBounds(region: Long, graphics: Long, rect: Long): Status

public expect fun GdipGetRegionBoundsI(region: Long, graphics: Long, rect: Long): Status

public expect fun GdipGetRegionData(region: Long, buffer: Long, buffersize: UInt, sizefilled: Long): Status

public expect fun GdipGetRegionDataSize(region: Long, buffersize: Long): Status

public expect fun GdipGetRegionHRgn(region: Long, graphics: Long, hrgn: Long): Status

public expect fun GdipGetRegionScans(region: Long, rects: Long, count: Long, matrix: Long): Status

public expect fun GdipGetRegionScansCount(region: Long, count: Long, matrix: Long): Status

public expect fun GdipGetRegionScansI(region: Long, rects: Long, count: Long, matrix: Long): Status

public expect fun GdipGetRenderingOrigin(graphics: Long, x: Long, y: Long): Status

public expect fun GdipGetSmoothingMode(graphics: Long, smoothingmode: Long): Status

public expect fun GdipGetSolidFillColor(brush: Long, color: Long): Status

public expect fun GdipGetStringFormatAlign(format: Long, align: Long): Status

public expect fun GdipGetStringFormatDigitSubstitution(format: Long, language: Long, substitute: Long): Status

public expect fun GdipGetStringFormatFlags(format: Long, flags: Long): Status

public expect fun GdipGetStringFormatHotkeyPrefix(format: Long, hotkeyprefix: Long): Status

public expect fun GdipGetStringFormatLineAlign(format: Long, align: Long): Status

public expect fun GdipGetStringFormatMeasurableCharacterRangeCount(format: Long, count: Long): Status

public expect fun GdipGetStringFormatTabStopCount(format: Long, count: Long): Status

public expect fun GdipGetStringFormatTabStops(format: Long, count: Int, firsttaboffset: Long, tabstops: Long): Status

public expect fun GdipGetStringFormatTrimming(format: Long, trimming: Long): Status

public expect fun GdipGetTextContrast(graphics: Long, contrast: Long): Status

public expect fun GdipGetTextRenderingHint(graphics: Long, mode: Long): Status

public expect fun GdipGetTextureImage(brush: Long, image: Long): Status

public expect fun GdipGetTextureTransform(brush: Long, matrix: Long): Status

public expect fun GdipGetTextureWrapMode(brush: Long, wrapmode: Long): Status

public expect fun GdipGetVisibleClipBounds(graphics: Long, rect: Long): Status

public expect fun GdipGetVisibleClipBoundsI(graphics: Long, rect: Long): Status

public expect fun GdipGetWorldTransform(graphics: Long, matrix: Long): Status

public expect fun GdipGraphicsClear(graphics: Long, color: UInt): Status

public expect fun GdipGraphicsSetAbort(pgraphics: Long, piabort: Long): Status

public expect fun GdipImageForceValidation(image: Long): Status

public expect fun GdipImageGetFrameCount(image: Long, dimensionid: Long, count: Long): Status

public expect fun GdipImageGetFrameDimensionsCount(image: Long, count: Long): Status

public expect fun GdipImageGetFrameDimensionsList(image: Long, dimensionids: Long, count: UInt): Status

public expect fun GdipImageRotateFlip(image: Long, rftype: RotateFlipType): Status

public expect fun GdipImageSelectActiveFrame(image: Long, dimensionid: Long, frameindex: UInt): Status

public expect fun GdipImageSetAbort(pimage: Long, piabort: Long): Status

public expect fun GdipInitializePalette(palette: Long, palettetype: PaletteType, optimalcolors: Int, usetransparentcolor: BOOL, bitmap: Long): Status

public expect fun GdipInvertMatrix(matrix: Long): Status

public expect fun GdipIsClipEmpty(graphics: Long, result: Long): Status

public expect fun GdipIsEmptyRegion(region: Long, graphics: Long, result: Long): Status

public expect fun GdipIsEqualRegion(region: Long, region2: Long, graphics: Long, result: Long): Status

public expect fun GdipIsInfiniteRegion(region: Long, graphics: Long, result: Long): Status

public expect fun GdipIsMatrixEqual(matrix: Long, matrix2: Long, result: Long): Status

public expect fun GdipIsMatrixIdentity(matrix: Long, result: Long): Status

public expect fun GdipIsMatrixInvertible(matrix: Long, result: Long): Status

public expect fun GdipIsOutlineVisiblePathPoint(path: Long, x: Float, y: Float, pen: Long, graphics: Long, result: Long): Status

public expect fun GdipIsOutlineVisiblePathPointI(path: Long, x: Int, y: Int, pen: Long, graphics: Long, result: Long): Status

public expect fun GdipIsStyleAvailable(family: Long, style: Int, isstyleavailable: Long): Status

public expect fun GdipIsVisibleClipEmpty(graphics: Long, result: Long): Status

public expect fun GdipIsVisiblePathPoint(path: Long, x: Float, y: Float, graphics: Long, result: Long): Status

public expect fun GdipIsVisiblePathPointI(path: Long, x: Int, y: Int, graphics: Long, result: Long): Status

public expect fun GdipIsVisiblePoint(graphics: Long, x: Float, y: Float, result: Long): Status

public expect fun GdipIsVisiblePointI(graphics: Long, x: Int, y: Int, result: Long): Status

public expect fun GdipIsVisibleRect(graphics: Long, x: Float, y: Float, width: Float, height: Float, result: Long): Status

public expect fun GdipIsVisibleRectI(graphics: Long, x: Int, y: Int, width: Int, height: Int, result: Long): Status

public expect fun GdipIsVisibleRegionPoint(region: Long, x: Float, y: Float, graphics: Long, result: Long): Status

public expect fun GdipIsVisibleRegionPointI(region: Long, x: Int, y: Int, graphics: Long, result: Long): Status

public expect fun GdipIsVisibleRegionRect(region: Long, x: Float, y: Float, width: Float, height: Float, graphics: Long, result: Long): Status

public expect fun GdipIsVisibleRegionRectI(region: Long, x: Int, y: Int, width: Int, height: Int, graphics: Long, result: Long): Status

public expect fun GdipLoadImageFromFile(filename: PCWSTR, image: Long): Status

public expect fun GdipLoadImageFromFileICM(filename: PCWSTR, image: Long): Status

public expect fun GdipLoadImageFromStream(stream: Long, image: Long): Status

public expect fun GdipLoadImageFromStreamICM(stream: Long, image: Long): Status

public expect fun GdipMeasureCharacterRanges(graphics: Long, string: PCWSTR, length: Int, font: Long, layoutrect: Long, stringformat: Long, regioncount: Int, regions: Long): Status

public expect fun GdipMeasureDriverString(graphics: Long, text: Long, length: Int, font: Long, positions: Long, flags: Int, matrix: Long, boundingbox: Long): Status

public expect fun GdipMeasureString(graphics: Long, string: PCWSTR, length: Int, font: Long, layoutrect: Long, stringformat: Long, boundingbox: Long, codepointsfitted: Long, linesfilled: Long): Status

public expect fun GdipMultiplyLineTransform(brush: Long, matrix: Long, order: MatrixOrder): Status

public expect fun GdipMultiplyMatrix(matrix: Long, matrix2: Long, order: MatrixOrder): Status

public expect fun GdipMultiplyPathGradientTransform(brush: Long, matrix: Long, order: MatrixOrder): Status

public expect fun GdipMultiplyPenTransform(pen: Long, matrix: Long, order: MatrixOrder): Status

public expect fun GdipMultiplyTextureTransform(brush: Long, matrix: Long, order: MatrixOrder): Status

public expect fun GdipMultiplyWorldTransform(graphics: Long, matrix: Long, order: MatrixOrder): Status

public expect fun GdipNewInstalledFontCollection(fontcollection: Long): Status

public expect fun GdipNewPrivateFontCollection(fontcollection: Long): Status

public expect fun GdipPathIterCopyData(iterator: Long, resultcount: Long, points: Long, types: Long, startindex: Int, endindex: Int): Status

public expect fun GdipPathIterEnumerate(iterator: Long, resultcount: Long, points: Long, types: Long, count: Int): Status

public expect fun GdipPathIterGetCount(iterator: Long, count: Long): Status

public expect fun GdipPathIterGetSubpathCount(iterator: Long, count: Long): Status

public expect fun GdipPathIterHasCurve(iterator: Long, hascurve: Long): Status

public expect fun GdipPathIterIsValid(iterator: Long, valid: Long): Status

public expect fun GdipPathIterNextMarker(iterator: Long, resultcount: Long, startindex: Long, endindex: Long): Status

public expect fun GdipPathIterNextMarkerPath(iterator: Long, resultcount: Long, path: Long): Status

public expect fun GdipPathIterNextPathType(iterator: Long, resultcount: Long, pathtype: Long, startindex: Long, endindex: Long): Status

public expect fun GdipPathIterNextSubpath(iterator: Long, resultcount: Long, startindex: Long, endindex: Long, isclosed: Long): Status

public expect fun GdipPathIterNextSubpathPath(iterator: Long, resultcount: Long, path: Long, isclosed: Long): Status

public expect fun GdipPathIterRewind(iterator: Long): Status

public expect fun GdipPlayMetafileRecord(metafile: Long, recordtype: EmfPlusRecordType, flags: UInt, datasize: UInt, data: Long): Status

public expect fun GdipPrivateAddFontFile(fontcollection: Long, filename: PCWSTR): Status

public expect fun GdipPrivateAddMemoryFont(fontcollection: Long, memory: Long, length: Int): Status

public expect fun GdipRecordMetafile(referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status

public expect fun GdipRecordMetafileFileName(filename: PCWSTR, referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status

public expect fun GdipRecordMetafileFileNameI(filename: PCWSTR, referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status

public expect fun GdipRecordMetafileI(referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status

public expect fun GdipRecordMetafileStream(stream: Long, referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status

public expect fun GdipRecordMetafileStreamI(stream: Long, referencehdc: HDC, type: EmfType, framerect: Long, frameunit: MetafileFrameUnit, description: PCWSTR, metafile: Long): Status

public expect fun GdipReleaseDC(graphics: Long, hdc: HDC): Status

public expect fun GdipRemovePropertyItem(image: Long, propid: UInt): Status

public expect fun GdipResetClip(graphics: Long): Status

public expect fun GdipResetImageAttributes(imageattr: Long, type: ColorAdjustType): Status

public expect fun GdipResetLineTransform(brush: Long): Status

public expect fun GdipResetPageTransform(graphics: Long): Status

public expect fun GdipResetPath(path: Long): Status

public expect fun GdipResetPathGradientTransform(brush: Long): Status

public expect fun GdipResetPenTransform(pen: Long): Status

public expect fun GdipResetTextureTransform(brush: Long): Status

public expect fun GdipResetWorldTransform(graphics: Long): Status

public expect fun GdipRestoreGraphics(graphics: Long, state: UInt): Status

public expect fun GdipReversePath(path: Long): Status

public expect fun GdipRotateLineTransform(brush: Long, angle: Float, order: MatrixOrder): Status

public expect fun GdipRotateMatrix(matrix: Long, angle: Float, order: MatrixOrder): Status

public expect fun GdipRotatePathGradientTransform(brush: Long, angle: Float, order: MatrixOrder): Status

public expect fun GdipRotatePenTransform(pen: Long, angle: Float, order: MatrixOrder): Status

public expect fun GdipRotateTextureTransform(brush: Long, angle: Float, order: MatrixOrder): Status

public expect fun GdipRotateWorldTransform(graphics: Long, angle: Float, order: MatrixOrder): Status

public expect fun GdipSaveAdd(image: Long, encoderparams: Long): Status

public expect fun GdipSaveAddImage(image: Long, newimage: Long, encoderparams: Long): Status

public expect fun GdipSaveGraphics(graphics: Long, state: Long): Status

public expect fun GdipSaveImageToFile(image: Long, filename: PCWSTR, clsidencoder: Long, encoderparams: Long): Status

public expect fun GdipSaveImageToStream(image: Long, stream: Long, clsidencoder: Long, encoderparams: Long): Status

public expect fun GdipScaleLineTransform(brush: Long, sx: Float, sy: Float, order: MatrixOrder): Status

public expect fun GdipScaleMatrix(matrix: Long, scalex: Float, scaley: Float, order: MatrixOrder): Status

public expect fun GdipScalePathGradientTransform(brush: Long, sx: Float, sy: Float, order: MatrixOrder): Status

public expect fun GdipScalePenTransform(pen: Long, sx: Float, sy: Float, order: MatrixOrder): Status
