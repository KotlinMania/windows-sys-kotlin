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

public expect fun gdipAddPathArc(path: MutPtr, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status

public expect fun gdipAddPathArcI(path: MutPtr, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status

public expect fun gdipAddPathBezier(path: MutPtr, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status

public expect fun gdipAddPathBezierI(path: MutPtr, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status

public expect fun gdipAddPathBeziers(path: MutPtr, points: ConstPtr, count: Int): Status

public expect fun gdipAddPathBeziersI(path: MutPtr, points: ConstPtr, count: Int): Status

public expect fun gdipAddPathClosedCurve(path: MutPtr, points: ConstPtr, count: Int): Status

public expect fun gdipAddPathClosedCurve2(path: MutPtr, points: ConstPtr, count: Int, tension: Float): Status

public expect fun gdipAddPathClosedCurve2I(path: MutPtr, points: ConstPtr, count: Int, tension: Float): Status

public expect fun gdipAddPathClosedCurveI(path: MutPtr, points: ConstPtr, count: Int): Status

public expect fun gdipAddPathCurve(path: MutPtr, points: ConstPtr, count: Int): Status

public expect fun gdipAddPathCurve2(path: MutPtr, points: ConstPtr, count: Int, tension: Float): Status

public expect fun gdipAddPathCurve2I(path: MutPtr, points: ConstPtr, count: Int, tension: Float): Status

public expect fun gdipAddPathCurve3(path: MutPtr, points: ConstPtr, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status

public expect fun gdipAddPathCurve3I(path: MutPtr, points: ConstPtr, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status

public expect fun gdipAddPathCurveI(path: MutPtr, points: ConstPtr, count: Int): Status

public expect fun gdipAddPathEllipse(path: MutPtr, x: Float, y: Float, width: Float, height: Float): Status

public expect fun gdipAddPathEllipseI(path: MutPtr, x: Int, y: Int, width: Int, height: Int): Status

public expect fun gdipAddPathLine(path: MutPtr, x1: Float, y1: Float, x2: Float, y2: Float): Status

public expect fun gdipAddPathLine2(path: MutPtr, points: ConstPtr, count: Int): Status

public expect fun gdipAddPathLine2I(path: MutPtr, points: ConstPtr, count: Int): Status

public expect fun gdipAddPathLineI(path: MutPtr, x1: Int, y1: Int, x2: Int, y2: Int): Status

public expect fun gdipAddPathPath(path: MutPtr, addingpath: ConstPtr, connect: Bool): Status

public expect fun gdipAddPathPie(path: MutPtr, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status

public expect fun gdipAddPathPieI(path: MutPtr, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status

public expect fun gdipAddPathPolygon(path: MutPtr, points: ConstPtr, count: Int): Status

public expect fun gdipAddPathPolygonI(path: MutPtr, points: ConstPtr, count: Int): Status

public expect fun gdipAddPathRectangle(path: MutPtr, x: Float, y: Float, width: Float, height: Float): Status

public expect fun gdipAddPathRectangleI(path: MutPtr, x: Int, y: Int, width: Int, height: Int): Status

public expect fun gdipAddPathRectangles(path: MutPtr, rects: ConstPtr, count: Int): Status

public expect fun gdipAddPathRectanglesI(path: MutPtr, rects: ConstPtr, count: Int): Status

public expect fun gdipAddPathString(path: MutPtr, string: Pcwstr, length: Int, family: ConstPtr, style: Int, emsize: Float, layoutrect: ConstPtr, format: ConstPtr): Status

public expect fun gdipAddPathStringI(path: MutPtr, string: Pcwstr, length: Int, family: ConstPtr, style: Int, emsize: Float, layoutrect: ConstPtr, format: ConstPtr): Status

public expect fun gdipAlloc(size: ULong): MutPtr

public expect fun gdipBeginContainer(graphics: MutPtr, dstrect: ConstPtr, srcrect: ConstPtr, unit: Unit, state: MutPtr): Status

public expect fun gdipBeginContainer2(graphics: MutPtr, state: MutPtr): Status

public expect fun gdipBeginContainerI(graphics: MutPtr, dstrect: ConstPtr, srcrect: ConstPtr, unit: Unit, state: MutPtr): Status

public expect fun gdipBitmapApplyEffect(bitmap: MutPtr, effect: MutPtr, roi: MutPtr, useauxdata: Bool, auxdata: MutPtr, auxdatasize: MutPtr): Status

public expect fun gdipBitmapConvertFormat(pinputbitmap: MutPtr, format: Int, dithertype: DitherType, palettetype: PaletteType, palette: MutPtr, alphathresholdpercent: Float): Status

public expect fun gdipBitmapCreateApplyEffect(inputbitmaps: MutPtr, numinputs: Int, effect: MutPtr, roi: MutPtr, outputrect: MutPtr, outputbitmap: MutPtr, useauxdata: Bool, auxdata: MutPtr, auxdatasize: MutPtr): Status

public expect fun gdipBitmapGetHistogram(bitmap: MutPtr, format: HistogramFormat, numberofentries: UInt, channel0: MutPtr, channel1: MutPtr, channel2: MutPtr, channel3: MutPtr): Status

public expect fun gdipBitmapGetHistogramSize(format: HistogramFormat, numberofentries: MutPtr): Status

public expect fun gdipBitmapGetPixel(bitmap: MutPtr, x: Int, y: Int, color: MutPtr): Status

public expect fun gdipBitmapLockBits(bitmap: MutPtr, rect: ConstPtr, flags: UInt, format: Int, lockedbitmapdata: MutPtr): Status

public expect fun gdipBitmapSetPixel(bitmap: MutPtr, x: Int, y: Int, color: UInt): Status

public expect fun gdipBitmapSetResolution(bitmap: MutPtr, xdpi: Float, ydpi: Float): Status

public expect fun gdipBitmapUnlockBits(bitmap: MutPtr, lockedbitmapdata: MutPtr): Status

public expect fun gdipClearPathMarkers(path: MutPtr): Status

public expect fun gdipCloneBitmapArea(x: Float, y: Float, width: Float, height: Float, format: Int, srcbitmap: MutPtr, dstbitmap: MutPtr): Status

public expect fun gdipCloneBitmapAreaI(x: Int, y: Int, width: Int, height: Int, format: Int, srcbitmap: MutPtr, dstbitmap: MutPtr): Status

public expect fun gdipCloneBrush(brush: MutPtr, clonebrush: MutPtr): Status

public expect fun gdipCloneCustomLineCap(customcap: MutPtr, clonedcap: MutPtr): Status

public expect fun gdipCloneFont(font: MutPtr, clonefont: MutPtr): Status

public expect fun gdipCloneFontFamily(fontfamily: MutPtr, clonedfontfamily: MutPtr): Status

public expect fun gdipCloneImage(image: MutPtr, cloneimage: MutPtr): Status

public expect fun gdipCloneImageAttributes(imageattr: ConstPtr, cloneimageattr: MutPtr): Status

public expect fun gdipCloneMatrix(matrix: MutPtr, clonematrix: MutPtr): Status

public expect fun gdipClonePath(path: MutPtr, clonepath: MutPtr): Status

public expect fun gdipClonePen(pen: MutPtr, clonepen: MutPtr): Status

public expect fun gdipCloneRegion(region: MutPtr, cloneregion: MutPtr): Status

public expect fun gdipCloneStringFormat(format: ConstPtr, newformat: MutPtr): Status

public expect fun gdipClosePathFigure(path: MutPtr): Status

public expect fun gdipClosePathFigures(path: MutPtr): Status

public expect fun gdipCombineRegionPath(region: MutPtr, path: MutPtr, combinemode: CombineMode): Status

public expect fun gdipCombineRegionRect(region: MutPtr, rect: ConstPtr, combinemode: CombineMode): Status

public expect fun gdipCombineRegionRectI(region: MutPtr, rect: ConstPtr, combinemode: CombineMode): Status

public expect fun gdipCombineRegionRegion(region: MutPtr, region2: MutPtr, combinemode: CombineMode): Status

public expect fun gdipComment(graphics: MutPtr, sizedata: UInt, data: ConstPtr): Status

public expect fun gdipConvertToEmfPlus(refgraphics: ConstPtr, metafile: MutPtr, conversionfailureflag: MutPtr, emftype: EmfType, description: Pcwstr, outMetafile: MutPtr): Status

public expect fun gdipConvertToEmfPlusToFile(refgraphics: ConstPtr, metafile: MutPtr, conversionfailureflag: MutPtr, filename: Pcwstr, emftype: EmfType, description: Pcwstr, outMetafile: MutPtr): Status

public expect fun gdipConvertToEmfPlusToStream(refgraphics: ConstPtr, metafile: MutPtr, conversionfailureflag: MutPtr, stream: MutPtr, emftype: EmfType, description: Pcwstr, outMetafile: MutPtr): Status

public expect fun gdipCreateAdjustableArrowCap(height: Float, width: Float, isfilled: Bool, cap: MutPtr): Status

public expect fun gdipCreateBitmapFromFile(filename: Pcwstr, bitmap: MutPtr): Status

public expect fun gdipCreateBitmapFromFileICM(filename: Pcwstr, bitmap: MutPtr): Status

public expect fun gdipCreateBitmapFromGdiDib(gdibitmapinfo: ConstPtr, gdibitmapdata: MutPtr, bitmap: MutPtr): Status

public expect fun gdipCreateBitmapFromGraphics(width: Int, height: Int, target: MutPtr, bitmap: MutPtr): Status

public expect fun gdipCreateBitmapFromHBITMAP(hbm: Hbitmap, hpal: Hpalette, bitmap: MutPtr): Status

public expect fun gdipCreateBitmapFromHICON(hicon: Hicon, bitmap: MutPtr): Status

public expect fun gdipCreateBitmapFromResource(hinstance: Hinstance, lpbitmapname: Pcwstr, bitmap: MutPtr): Status

public expect fun gdipCreateBitmapFromScan0(width: Int, height: Int, stride: Int, format: Int, scan0: ConstPtr, bitmap: MutPtr): Status

public expect fun gdipCreateBitmapFromStream(stream: MutPtr, bitmap: MutPtr): Status

public expect fun gdipCreateBitmapFromStreamICM(stream: MutPtr, bitmap: MutPtr): Status

public expect fun gdipCreateCachedBitmap(bitmap: MutPtr, graphics: MutPtr, cachedbitmap: MutPtr): Status

public expect fun gdipCreateCustomLineCap(fillpath: MutPtr, strokepath: MutPtr, basecap: LineCap, baseinset: Float, customcap: MutPtr): Status

public expect fun gdipCreateEffect(guid: Guid, effect: MutPtr): Status

public expect fun gdipCreateFont(fontfamily: ConstPtr, emsize: Float, style: Int, unit: Unit, font: MutPtr): Status

public expect fun gdipCreateFontFamilyFromName(name: Pcwstr, fontcollection: MutPtr, fontfamily: MutPtr): Status

public expect fun gdipCreateFontFromDC(hdc: Hdc, font: MutPtr): Status

public expect fun gdipCreateFontFromLogfontA(hdc: Hdc, logfont: ConstPtr, font: MutPtr): Status

public expect fun gdipCreateFontFromLogfontW(hdc: Hdc, logfont: ConstPtr, font: MutPtr): Status

public expect fun gdipCreateFromHDC(hdc: Hdc, graphics: MutPtr): Status

public expect fun gdipCreateFromHDC2(hdc: Hdc, hdevice: Handle, graphics: MutPtr): Status

public expect fun gdipCreateFromHWND(hwnd: Hwnd, graphics: MutPtr): Status

public expect fun gdipCreateFromHWNDICM(hwnd: Hwnd, graphics: MutPtr): Status

public expect fun gdipCreateHBITMAPFromBitmap(bitmap: MutPtr, hbmreturn: MutPtr, background: UInt): Status

public expect fun gdipCreateHICONFromBitmap(bitmap: MutPtr, hbmreturn: MutPtr): Status

public expect fun gdipCreateHalftonePalette(): Hpalette

public expect fun gdipCreateHatchBrush(hatchstyle: HatchStyle, forecol: UInt, backcol: UInt, brush: MutPtr): Status

public expect fun gdipCreateImageAttributes(imageattr: MutPtr): Status

public expect fun gdipCreateLineBrush(point1: ConstPtr, point2: ConstPtr, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: MutPtr): Status

public expect fun gdipCreateLineBrushFromRect(rect: ConstPtr, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: MutPtr): Status

public expect fun gdipCreateLineBrushFromRectI(rect: ConstPtr, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: MutPtr): Status

public expect fun gdipCreateLineBrushFromRectWithAngle(rect: ConstPtr, color1: UInt, color2: UInt, angle: Float, isanglescalable: Bool, wrapmode: WrapMode, linegradient: MutPtr): Status

public expect fun gdipCreateLineBrushFromRectWithAngleI(rect: ConstPtr, color1: UInt, color2: UInt, angle: Float, isanglescalable: Bool, wrapmode: WrapMode, linegradient: MutPtr): Status

public expect fun gdipCreateLineBrushI(point1: ConstPtr, point2: ConstPtr, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: MutPtr): Status

public expect fun gdipCreateMatrix(matrix: MutPtr): Status

public expect fun gdipCreateMatrix2(m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float, matrix: MutPtr): Status

public expect fun gdipCreateMatrix3(rect: ConstPtr, dstplg: ConstPtr, matrix: MutPtr): Status

public expect fun gdipCreateMatrix3I(rect: ConstPtr, dstplg: ConstPtr, matrix: MutPtr): Status

public expect fun gdipCreateMetafileFromEmf(hemf: Henhmetafile, deleteemf: Bool, metafile: MutPtr): Status

public expect fun gdipCreateMetafileFromFile(file: Pcwstr, metafile: MutPtr): Status

public expect fun gdipCreateMetafileFromStream(stream: MutPtr, metafile: MutPtr): Status

public expect fun gdipCreateMetafileFromWmf(hwmf: Hmetafile, deletewmf: Bool, wmfplaceablefileheader: ConstPtr, metafile: MutPtr): Status

public expect fun gdipCreateMetafileFromWmfFile(file: Pcwstr, wmfplaceablefileheader: ConstPtr, metafile: MutPtr): Status

public expect fun gdipCreatePath(brushmode: FillMode, path: MutPtr): Status

public expect fun gdipCreatePath2(param0: ConstPtr, param1: ConstPtr, param2: Int, param3: FillMode, path: MutPtr): Status

public expect fun gdipCreatePath2I(param0: ConstPtr, param1: ConstPtr, param2: Int, param3: FillMode, path: MutPtr): Status

public expect fun gdipCreatePathGradient(points: ConstPtr, count: Int, wrapmode: WrapMode, polygradient: MutPtr): Status

public expect fun gdipCreatePathGradientFromPath(path: ConstPtr, polygradient: MutPtr): Status

public expect fun gdipCreatePathGradientI(points: ConstPtr, count: Int, wrapmode: WrapMode, polygradient: MutPtr): Status

public expect fun gdipCreatePathIter(iterator: MutPtr, path: MutPtr): Status

public expect fun gdipCreatePen1(color: UInt, width: Float, unit: Unit, pen: MutPtr): Status

public expect fun gdipCreatePen2(brush: MutPtr, width: Float, unit: Unit, pen: MutPtr): Status

public expect fun gdipCreateRegion(region: MutPtr): Status

public expect fun gdipCreateRegionHrgn(hrgn: Hrgn, region: MutPtr): Status

public expect fun gdipCreateRegionPath(path: MutPtr, region: MutPtr): Status

public expect fun gdipCreateRegionRect(rect: ConstPtr, region: MutPtr): Status

public expect fun gdipCreateRegionRectI(rect: ConstPtr, region: MutPtr): Status

public expect fun gdipCreateRegionRgnData(regiondata: ConstPtr, size: Int, region: MutPtr): Status

public expect fun gdipCreateSolidFill(color: UInt, brush: MutPtr): Status

public expect fun gdipCreateStreamOnFile(filename: Pcwstr, access: UInt, stream: MutPtr): Status

public expect fun gdipCreateStringFormat(formatattributes: Int, language: UShort, format: MutPtr): Status

public expect fun gdipCreateTexture(image: MutPtr, wrapmode: WrapMode, texture: MutPtr): Status

public expect fun gdipCreateTexture2(image: MutPtr, wrapmode: WrapMode, x: Float, y: Float, width: Float, height: Float, texture: MutPtr): Status

public expect fun gdipCreateTexture2I(image: MutPtr, wrapmode: WrapMode, x: Int, y: Int, width: Int, height: Int, texture: MutPtr): Status

public expect fun gdipCreateTextureIA(image: MutPtr, imageattributes: ConstPtr, x: Float, y: Float, width: Float, height: Float, texture: MutPtr): Status

public expect fun gdipCreateTextureIAI(image: MutPtr, imageattributes: ConstPtr, x: Int, y: Int, width: Int, height: Int, texture: MutPtr): Status

public expect fun gdipDeleteBrush(brush: MutPtr): Status

public expect fun gdipDeleteCachedBitmap(cachedbitmap: MutPtr): Status

public expect fun gdipDeleteCustomLineCap(customcap: MutPtr): Status

public expect fun gdipDeleteEffect(effect: MutPtr): Status

public expect fun gdipDeleteFont(font: MutPtr): Status

public expect fun gdipDeleteFontFamily(fontfamily: MutPtr): Status

public expect fun gdipDeleteGraphics(graphics: MutPtr): Status

public expect fun gdipDeleteMatrix(matrix: MutPtr): Status

public expect fun gdipDeletePath(path: MutPtr): Status

public expect fun gdipDeletePathIter(iterator: MutPtr): Status

public expect fun gdipDeletePen(pen: MutPtr): Status

public expect fun gdipDeletePrivateFontCollection(fontcollection: MutPtr): Status

public expect fun gdipDeleteRegion(region: MutPtr): Status

public expect fun gdipDeleteStringFormat(format: MutPtr): Status

public expect fun gdipDisposeImage(image: MutPtr): Status

public expect fun gdipDisposeImageAttributes(imageattr: MutPtr): Status

public expect fun gdipDrawArc(graphics: MutPtr, pen: MutPtr, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status

public expect fun gdipDrawArcI(graphics: MutPtr, pen: MutPtr, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status

public expect fun gdipDrawBezier(graphics: MutPtr, pen: MutPtr, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status

public expect fun gdipDrawBezierI(graphics: MutPtr, pen: MutPtr, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status

public expect fun gdipDrawBeziers(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status

public expect fun gdipDrawBeziersI(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status

public expect fun gdipDrawCachedBitmap(graphics: MutPtr, cachedbitmap: MutPtr, x: Int, y: Int): Status

public expect fun gdipDrawClosedCurve(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status

public expect fun gdipDrawClosedCurve2(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int, tension: Float): Status

public expect fun gdipDrawClosedCurve2I(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int, tension: Float): Status

public expect fun gdipDrawClosedCurveI(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status

public expect fun gdipDrawCurve(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status

public expect fun gdipDrawCurve2(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int, tension: Float): Status

public expect fun gdipDrawCurve2I(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int, tension: Float): Status

public expect fun gdipDrawCurve3(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status

public expect fun gdipDrawCurve3I(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status

public expect fun gdipDrawCurveI(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status

public expect fun gdipDrawDriverString(graphics: MutPtr, text: ConstPtr, length: Int, font: ConstPtr, brush: ConstPtr, positions: ConstPtr, flags: Int, matrix: ConstPtr): Status

public expect fun gdipDrawEllipse(graphics: MutPtr, pen: MutPtr, x: Float, y: Float, width: Float, height: Float): Status

public expect fun gdipDrawEllipseI(graphics: MutPtr, pen: MutPtr, x: Int, y: Int, width: Int, height: Int): Status

public expect fun gdipDrawImage(graphics: MutPtr, image: MutPtr, x: Float, y: Float): Status

public expect fun gdipDrawImageFX(graphics: MutPtr, image: MutPtr, source: MutPtr, xform: MutPtr, effect: MutPtr, imageattributes: MutPtr, srcunit: Unit): Status

public expect fun gdipDrawImageI(graphics: MutPtr, image: MutPtr, x: Int, y: Int): Status

public expect fun gdipDrawImagePointRect(graphics: MutPtr, image: MutPtr, x: Float, y: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit): Status

public expect fun gdipDrawImagePointRectI(graphics: MutPtr, image: MutPtr, x: Int, y: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit): Status

public expect fun gdipDrawImagePoints(graphics: MutPtr, image: MutPtr, dstpoints: ConstPtr, count: Int): Status

public expect fun gdipDrawImagePointsI(graphics: MutPtr, image: MutPtr, dstpoints: ConstPtr, count: Int): Status

public expect fun gdipDrawImagePointsRect(graphics: MutPtr, image: MutPtr, points: ConstPtr, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: ConstPtr, callback: Long, callbackdata: MutPtr): Status

public expect fun gdipDrawImagePointsRectI(graphics: MutPtr, image: MutPtr, points: ConstPtr, count: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: ConstPtr, callback: Long, callbackdata: MutPtr): Status

public expect fun gdipDrawImageRect(graphics: MutPtr, image: MutPtr, x: Float, y: Float, width: Float, height: Float): Status

public expect fun gdipDrawImageRectI(graphics: MutPtr, image: MutPtr, x: Int, y: Int, width: Int, height: Int): Status

public expect fun gdipDrawImageRectRect(graphics: MutPtr, image: MutPtr, dstx: Float, dsty: Float, dstwidth: Float, dstheight: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: ConstPtr, callback: Long, callbackdata: MutPtr): Status

public expect fun gdipDrawImageRectRectI(graphics: MutPtr, image: MutPtr, dstx: Int, dsty: Int, dstwidth: Int, dstheight: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: ConstPtr, callback: Long, callbackdata: MutPtr): Status

public expect fun gdipDrawLine(graphics: MutPtr, pen: MutPtr, x1: Float, y1: Float, x2: Float, y2: Float): Status

public expect fun gdipDrawLineI(graphics: MutPtr, pen: MutPtr, x1: Int, y1: Int, x2: Int, y2: Int): Status

public expect fun gdipDrawLines(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status

public expect fun gdipDrawLinesI(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status

public expect fun gdipDrawPath(graphics: MutPtr, pen: MutPtr, path: MutPtr): Status

public expect fun gdipDrawPie(graphics: MutPtr, pen: MutPtr, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status

public expect fun gdipDrawPieI(graphics: MutPtr, pen: MutPtr, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status

public expect fun gdipDrawPolygon(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status

public expect fun gdipDrawPolygonI(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status

public expect fun gdipDrawRectangle(graphics: MutPtr, pen: MutPtr, x: Float, y: Float, width: Float, height: Float): Status

public expect fun gdipDrawRectangleI(graphics: MutPtr, pen: MutPtr, x: Int, y: Int, width: Int, height: Int): Status

public expect fun gdipDrawRectangles(graphics: MutPtr, pen: MutPtr, rects: ConstPtr, count: Int): Status

public expect fun gdipDrawRectanglesI(graphics: MutPtr, pen: MutPtr, rects: ConstPtr, count: Int): Status

public expect fun gdipDrawString(graphics: MutPtr, string: Pcwstr, length: Int, font: ConstPtr, layoutrect: ConstPtr, stringformat: ConstPtr, brush: ConstPtr): Status

public expect fun gdipEmfToWmfBits(hemf: Henhmetafile, cbdata16: UInt, pdata16: MutPtr, imapmode: Int, eflags: Int): UInt

public expect fun gdipEndContainer(graphics: MutPtr, state: UInt): Status

public expect fun gdipEnumerateMetafileDestPoint(graphics: MutPtr, metafile: ConstPtr, destpoint: ConstPtr, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status

public expect fun gdipEnumerateMetafileDestPointI(graphics: MutPtr, metafile: ConstPtr, destpoint: ConstPtr, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status

public expect fun gdipEnumerateMetafileDestPoints(graphics: MutPtr, metafile: ConstPtr, destpoints: ConstPtr, count: Int, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status

public expect fun gdipEnumerateMetafileDestPointsI(graphics: MutPtr, metafile: ConstPtr, destpoints: ConstPtr, count: Int, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status

public expect fun gdipEnumerateMetafileDestRect(graphics: MutPtr, metafile: ConstPtr, destrect: ConstPtr, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status

public expect fun gdipEnumerateMetafileDestRectI(graphics: MutPtr, metafile: ConstPtr, destrect: ConstPtr, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status

public expect fun gdipEnumerateMetafileSrcRectDestPoint(graphics: MutPtr, metafile: ConstPtr, destpoint: ConstPtr, srcrect: ConstPtr, srcunit: Unit, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status

public expect fun gdipEnumerateMetafileSrcRectDestPointI(graphics: MutPtr, metafile: ConstPtr, destpoint: ConstPtr, srcrect: ConstPtr, srcunit: Unit, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status

public expect fun gdipEnumerateMetafileSrcRectDestPoints(graphics: MutPtr, metafile: ConstPtr, destpoints: ConstPtr, count: Int, srcrect: ConstPtr, srcunit: Unit, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status

public expect fun gdipEnumerateMetafileSrcRectDestPointsI(graphics: MutPtr, metafile: ConstPtr, destpoints: ConstPtr, count: Int, srcrect: ConstPtr, srcunit: Unit, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status

public expect fun gdipEnumerateMetafileSrcRectDestRect(graphics: MutPtr, metafile: ConstPtr, destrect: ConstPtr, srcrect: ConstPtr, srcunit: Unit, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status

public expect fun gdipEnumerateMetafileSrcRectDestRectI(graphics: MutPtr, metafile: ConstPtr, destrect: ConstPtr, srcrect: ConstPtr, srcunit: Unit, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status

public expect fun gdipFillClosedCurve(graphics: MutPtr, brush: MutPtr, points: ConstPtr, count: Int): Status

public expect fun gdipFillClosedCurve2(graphics: MutPtr, brush: MutPtr, points: ConstPtr, count: Int, tension: Float, fillmode: FillMode): Status

public expect fun gdipFillClosedCurve2I(graphics: MutPtr, brush: MutPtr, points: ConstPtr, count: Int, tension: Float, fillmode: FillMode): Status

public expect fun gdipFillClosedCurveI(graphics: MutPtr, brush: MutPtr, points: ConstPtr, count: Int): Status

public expect fun gdipFillEllipse(graphics: MutPtr, brush: MutPtr, x: Float, y: Float, width: Float, height: Float): Status

public expect fun gdipFillEllipseI(graphics: MutPtr, brush: MutPtr, x: Int, y: Int, width: Int, height: Int): Status

public expect fun gdipFillPath(graphics: MutPtr, brush: MutPtr, path: MutPtr): Status

public expect fun gdipFillPie(graphics: MutPtr, brush: MutPtr, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status

public expect fun gdipFillPieI(graphics: MutPtr, brush: MutPtr, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status

public expect fun gdipFillPolygon(graphics: MutPtr, brush: MutPtr, points: ConstPtr, count: Int, fillmode: FillMode): Status

public expect fun gdipFillPolygon2(graphics: MutPtr, brush: MutPtr, points: ConstPtr, count: Int): Status

public expect fun gdipFillPolygon2I(graphics: MutPtr, brush: MutPtr, points: ConstPtr, count: Int): Status

public expect fun gdipFillPolygonI(graphics: MutPtr, brush: MutPtr, points: ConstPtr, count: Int, fillmode: FillMode): Status

public expect fun gdipFillRectangle(graphics: MutPtr, brush: MutPtr, x: Float, y: Float, width: Float, height: Float): Status

public expect fun gdipFillRectangleI(graphics: MutPtr, brush: MutPtr, x: Int, y: Int, width: Int, height: Int): Status

public expect fun gdipFillRectangles(graphics: MutPtr, brush: MutPtr, rects: ConstPtr, count: Int): Status

public expect fun gdipFillRectanglesI(graphics: MutPtr, brush: MutPtr, rects: ConstPtr, count: Int): Status

public expect fun gdipFillRegion(graphics: MutPtr, brush: MutPtr, region: MutPtr): Status

public expect fun gdipFindFirstImageItem(image: MutPtr, item: MutPtr): Status

public expect fun gdipFindNextImageItem(image: MutPtr, item: MutPtr): Status

public expect fun gdipFlattenPath(path: MutPtr, matrix: MutPtr, flatness: Float): Status

public expect fun gdipFlush(graphics: MutPtr, intention: FlushIntention): Status

public expect fun gdipFree(ptr: MutPtr)

public expect fun gdipGetAdjustableArrowCapFillState(cap: MutPtr, fillstate: MutPtr): Status

public expect fun gdipGetAdjustableArrowCapHeight(cap: MutPtr, height: MutPtr): Status

public expect fun gdipGetAdjustableArrowCapMiddleInset(cap: MutPtr, middleinset: MutPtr): Status

public expect fun gdipGetAdjustableArrowCapWidth(cap: MutPtr, width: MutPtr): Status

public expect fun gdipGetAllPropertyItems(image: MutPtr, totalbuffersize: UInt, numproperties: UInt, allitems: MutPtr): Status

public expect fun gdipGetBrushType(brush: MutPtr, type: MutPtr): Status

public expect fun gdipGetCellAscent(family: ConstPtr, style: Int, cellascent: MutPtr): Status

public expect fun gdipGetCellDescent(family: ConstPtr, style: Int, celldescent: MutPtr): Status

public expect fun gdipGetClip(graphics: MutPtr, region: MutPtr): Status

public expect fun gdipGetClipBounds(graphics: MutPtr, rect: MutPtr): Status

public expect fun gdipGetClipBoundsI(graphics: MutPtr, rect: MutPtr): Status

public expect fun gdipGetCompositingMode(graphics: MutPtr, compositingmode: MutPtr): Status

public expect fun gdipGetCompositingQuality(graphics: MutPtr, compositingquality: MutPtr): Status

public expect fun gdipGetCustomLineCapBaseCap(customcap: MutPtr, basecap: MutPtr): Status

public expect fun gdipGetCustomLineCapBaseInset(customcap: MutPtr, inset: MutPtr): Status

public expect fun gdipGetCustomLineCapStrokeCaps(customcap: MutPtr, startcap: MutPtr, endcap: MutPtr): Status

public expect fun gdipGetCustomLineCapStrokeJoin(customcap: MutPtr, linejoin: MutPtr): Status

public expect fun gdipGetCustomLineCapType(customcap: MutPtr, captype: MutPtr): Status

public expect fun gdipGetCustomLineCapWidthScale(customcap: MutPtr, widthscale: MutPtr): Status

public expect fun gdipGetDC(graphics: MutPtr, hdc: MutPtr): Status

public expect fun gdipGetDpiX(graphics: MutPtr, dpi: MutPtr): Status

public expect fun gdipGetDpiY(graphics: MutPtr, dpi: MutPtr): Status

public expect fun gdipGetEffectParameterSize(effect: MutPtr, size: MutPtr): Status

public expect fun gdipGetEffectParameters(effect: MutPtr, size: MutPtr, params: MutPtr): Status

public expect fun gdipGetEmHeight(family: ConstPtr, style: Int, emheight: MutPtr): Status

public expect fun gdipGetEncoderParameterList(image: MutPtr, clsidencoder: ConstPtr, size: UInt, buffer: MutPtr): Status

public expect fun gdipGetEncoderParameterListSize(image: MutPtr, clsidencoder: ConstPtr, size: MutPtr): Status

public expect fun gdipGetFamily(font: MutPtr, family: MutPtr): Status

public expect fun gdipGetFamilyName(family: ConstPtr, name: Pwstr, language: UShort): Status

public expect fun gdipGetFontCollectionFamilyCount(fontcollection: MutPtr, numfound: MutPtr): Status

public expect fun gdipGetFontCollectionFamilyList(fontcollection: ConstPtr, numsought: Int, gpfamilies: MutPtr, numfound: MutPtr): Status

public expect fun gdipGetFontHeight(font: ConstPtr, graphics: ConstPtr, height: MutPtr): Status

public expect fun gdipGetFontHeightGivenDPI(font: ConstPtr, dpi: Float, height: MutPtr): Status

public expect fun gdipGetFontSize(font: MutPtr, size: MutPtr): Status

public expect fun gdipGetFontStyle(font: MutPtr, style: MutPtr): Status

public expect fun gdipGetFontUnit(font: MutPtr, unit: MutPtr): Status

public expect fun gdipGetGenericFontFamilyMonospace(nativefamily: MutPtr): Status

public expect fun gdipGetGenericFontFamilySansSerif(nativefamily: MutPtr): Status

public expect fun gdipGetGenericFontFamilySerif(nativefamily: MutPtr): Status

public expect fun gdipGetHatchBackgroundColor(brush: MutPtr, backcol: MutPtr): Status

public expect fun gdipGetHatchForegroundColor(brush: MutPtr, forecol: MutPtr): Status

public expect fun gdipGetHatchStyle(brush: MutPtr, hatchstyle: MutPtr): Status

public expect fun gdipGetHemfFromMetafile(metafile: MutPtr, hemf: MutPtr): Status

public expect fun gdipGetImageAttributesAdjustedPalette(imageattr: MutPtr, colorpalette: MutPtr, coloradjusttype: ColorAdjustType): Status

public expect fun gdipGetImageBounds(image: MutPtr, srcrect: MutPtr, srcunit: MutPtr): Status

public expect fun gdipGetImageDecoders(numdecoders: UInt, size: UInt, decoders: MutPtr): Status

public expect fun gdipGetImageDecodersSize(numdecoders: MutPtr, size: MutPtr): Status

public expect fun gdipGetImageDimension(image: MutPtr, width: MutPtr, height: MutPtr): Status

public expect fun gdipGetImageEncoders(numencoders: UInt, size: UInt, encoders: MutPtr): Status

public expect fun gdipGetImageEncodersSize(numencoders: MutPtr, size: MutPtr): Status

public expect fun gdipGetImageFlags(image: MutPtr, flags: MutPtr): Status

public expect fun gdipGetImageGraphicsContext(image: MutPtr, graphics: MutPtr): Status

public expect fun gdipGetImageHeight(image: MutPtr, height: MutPtr): Status

public expect fun gdipGetImageHorizontalResolution(image: MutPtr, resolution: MutPtr): Status

public expect fun gdipGetImageItemData(image: MutPtr, item: MutPtr): Status

public expect fun gdipGetImagePalette(image: MutPtr, palette: MutPtr, size: Int): Status

public expect fun gdipGetImagePaletteSize(image: MutPtr, size: MutPtr): Status

public expect fun gdipGetImagePixelFormat(image: MutPtr, format: MutPtr): Status

public expect fun gdipGetImageRawFormat(image: MutPtr, format: MutPtr): Status

public expect fun gdipGetImageThumbnail(image: MutPtr, thumbwidth: UInt, thumbheight: UInt, thumbimage: MutPtr, callback: Long, callbackdata: MutPtr): Status

public expect fun gdipGetImageType(image: MutPtr, type: MutPtr): Status

public expect fun gdipGetImageVerticalResolution(image: MutPtr, resolution: MutPtr): Status

public expect fun gdipGetImageWidth(image: MutPtr, width: MutPtr): Status

public expect fun gdipGetInterpolationMode(graphics: MutPtr, interpolationmode: MutPtr): Status

public expect fun gdipGetLineBlend(brush: MutPtr, blend: MutPtr, positions: MutPtr, count: Int): Status

public expect fun gdipGetLineBlendCount(brush: MutPtr, count: MutPtr): Status

public expect fun gdipGetLineColors(brush: MutPtr, colors: MutPtr): Status

public expect fun gdipGetLineGammaCorrection(brush: MutPtr, usegammacorrection: MutPtr): Status

public expect fun gdipGetLinePresetBlend(brush: MutPtr, blend: MutPtr, positions: MutPtr, count: Int): Status

public expect fun gdipGetLinePresetBlendCount(brush: MutPtr, count: MutPtr): Status

public expect fun gdipGetLineRect(brush: MutPtr, rect: MutPtr): Status

public expect fun gdipGetLineRectI(brush: MutPtr, rect: MutPtr): Status

public expect fun gdipGetLineSpacing(family: ConstPtr, style: Int, linespacing: MutPtr): Status

public expect fun gdipGetLineTransform(brush: MutPtr, matrix: MutPtr): Status

public expect fun gdipGetLineWrapMode(brush: MutPtr, wrapmode: MutPtr): Status

public expect fun gdipGetLogFontA(font: MutPtr, graphics: MutPtr, logfonta: MutPtr): Status

public expect fun gdipGetLogFontW(font: MutPtr, graphics: MutPtr, logfontw: MutPtr): Status

public expect fun gdipGetMatrixElements(matrix: ConstPtr, matrixout: MutPtr): Status

public expect fun gdipGetMetafileDownLevelRasterizationLimit(metafile: ConstPtr, metafilerasterizationlimitdpi: MutPtr): Status

public expect fun gdipGetMetafileHeaderFromEmf(hemf: Henhmetafile, header: MutPtr): Status

public expect fun gdipGetMetafileHeaderFromFile(filename: Pcwstr, header: MutPtr): Status

public expect fun gdipGetMetafileHeaderFromMetafile(metafile: MutPtr, header: MutPtr): Status

public expect fun gdipGetMetafileHeaderFromStream(stream: MutPtr, header: MutPtr): Status

public expect fun gdipGetMetafileHeaderFromWmf(hwmf: Hmetafile, wmfplaceablefileheader: ConstPtr, header: MutPtr): Status

public expect fun gdipGetNearestColor(graphics: MutPtr, argb: MutPtr): Status

public expect fun gdipGetPageScale(graphics: MutPtr, scale: MutPtr): Status

public expect fun gdipGetPageUnit(graphics: MutPtr, unit: MutPtr): Status

public expect fun gdipGetPathData(path: MutPtr, pathdata: MutPtr): Status

public expect fun gdipGetPathFillMode(path: MutPtr, fillmode: MutPtr): Status

public expect fun gdipGetPathGradientBlend(brush: MutPtr, blend: MutPtr, positions: MutPtr, count: Int): Status

public expect fun gdipGetPathGradientBlendCount(brush: MutPtr, count: MutPtr): Status

public expect fun gdipGetPathGradientCenterColor(brush: MutPtr, colors: MutPtr): Status

public expect fun gdipGetPathGradientCenterPoint(brush: MutPtr, points: MutPtr): Status

public expect fun gdipGetPathGradientCenterPointI(brush: MutPtr, points: MutPtr): Status

public expect fun gdipGetPathGradientFocusScales(brush: MutPtr, xscale: MutPtr, yscale: MutPtr): Status

public expect fun gdipGetPathGradientGammaCorrection(brush: MutPtr, usegammacorrection: MutPtr): Status

public expect fun gdipGetPathGradientPath(brush: MutPtr, path: MutPtr): Status

public expect fun gdipGetPathGradientPointCount(brush: MutPtr, count: MutPtr): Status

public expect fun gdipGetPathGradientPresetBlend(brush: MutPtr, blend: MutPtr, positions: MutPtr, count: Int): Status

public expect fun gdipGetPathGradientPresetBlendCount(brush: MutPtr, count: MutPtr): Status

public expect fun gdipGetPathGradientRect(brush: MutPtr, rect: MutPtr): Status

public expect fun gdipGetPathGradientRectI(brush: MutPtr, rect: MutPtr): Status

public expect fun gdipGetPathGradientSurroundColorCount(brush: MutPtr, count: MutPtr): Status

public expect fun gdipGetPathGradientSurroundColorsWithCount(brush: ConstPtr, color: MutPtr, count: MutPtr): Status

public expect fun gdipGetPathGradientTransform(brush: MutPtr, matrix: MutPtr): Status

public expect fun gdipGetPathGradientWrapMode(brush: MutPtr, wrapmode: MutPtr): Status

public expect fun gdipGetPathLastPoint(path: MutPtr, lastpoint: MutPtr): Status

public expect fun gdipGetPathPoints(param0: MutPtr, points: MutPtr, count: Int): Status

public expect fun gdipGetPathPointsI(param0: MutPtr, points: MutPtr, count: Int): Status

public expect fun gdipGetPathTypes(path: ConstPtr, types: MutPtr, count: Int): Status

public expect fun gdipGetPathWorldBounds(path: MutPtr, bounds: MutPtr, matrix: ConstPtr, pen: ConstPtr): Status

public expect fun gdipGetPathWorldBoundsI(path: MutPtr, bounds: MutPtr, matrix: ConstPtr, pen: ConstPtr): Status

public expect fun gdipGetPenBrushFill(pen: MutPtr, brush: MutPtr): Status

public expect fun gdipGetPenColor(pen: MutPtr, argb: MutPtr): Status

public expect fun gdipGetPenCompoundArray(pen: MutPtr, dash: MutPtr, count: Int): Status

public expect fun gdipGetPenCompoundCount(pen: MutPtr, count: MutPtr): Status

public expect fun gdipGetPenCustomEndCap(pen: MutPtr, customcap: MutPtr): Status

public expect fun gdipGetPenCustomStartCap(pen: MutPtr, customcap: MutPtr): Status

public expect fun gdipGetPenDashArray(pen: MutPtr, dash: MutPtr, count: Int): Status

public expect fun gdipGetPenDashCap197819(pen: MutPtr, dashcap: MutPtr): Status

public expect fun gdipGetPenDashCount(pen: MutPtr, count: MutPtr): Status

public expect fun gdipGetPenDashOffset(pen: MutPtr, offset: MutPtr): Status

public expect fun gdipGetPenDashStyle(pen: MutPtr, dashstyle: MutPtr): Status

public expect fun gdipGetPenEndCap(pen: MutPtr, endcap: MutPtr): Status

public expect fun gdipGetPenFillType(pen: MutPtr, type: MutPtr): Status

public expect fun gdipGetPenLineJoin(pen: MutPtr, linejoin: MutPtr): Status

public expect fun gdipGetPenMiterLimit(pen: MutPtr, miterlimit: MutPtr): Status

public expect fun gdipGetPenMode(pen: MutPtr, penmode: MutPtr): Status

public expect fun gdipGetPenStartCap(pen: MutPtr, startcap: MutPtr): Status

public expect fun gdipGetPenTransform(pen: MutPtr, matrix: MutPtr): Status

public expect fun gdipGetPenUnit(pen: MutPtr, unit: MutPtr): Status

public expect fun gdipGetPenWidth(pen: MutPtr, width: MutPtr): Status

public expect fun gdipGetPixelOffsetMode(graphics: MutPtr, pixeloffsetmode: MutPtr): Status

public expect fun gdipGetPointCount(path: MutPtr, count: MutPtr): Status

public expect fun gdipGetPropertyCount(image: MutPtr, numofproperty: MutPtr): Status

public expect fun gdipGetPropertyIdList(image: MutPtr, numofproperty: UInt, list: MutPtr): Status

public expect fun gdipGetPropertyItem(image: MutPtr, propid: UInt, propsize: UInt, buffer: MutPtr): Status

public expect fun gdipGetPropertyItemSize(image: MutPtr, propid: UInt, size: MutPtr): Status

public expect fun gdipGetPropertySize(image: MutPtr, totalbuffersize: MutPtr, numproperties: MutPtr): Status

public expect fun gdipGetRegionBounds(region: MutPtr, graphics: MutPtr, rect: MutPtr): Status

public expect fun gdipGetRegionBoundsI(region: MutPtr, graphics: MutPtr, rect: MutPtr): Status

public expect fun gdipGetRegionData(region: MutPtr, buffer: MutPtr, buffersize: UInt, sizefilled: MutPtr): Status

public expect fun gdipGetRegionDataSize(region: MutPtr, buffersize: MutPtr): Status

public expect fun gdipGetRegionHRgn(region: MutPtr, graphics: MutPtr, hrgn: MutPtr): Status

public expect fun gdipGetRegionScans(region: MutPtr, rects: MutPtr, count: MutPtr, matrix: MutPtr): Status

public expect fun gdipGetRegionScansCount(region: MutPtr, count: MutPtr, matrix: MutPtr): Status

public expect fun gdipGetRegionScansI(region: MutPtr, rects: MutPtr, count: MutPtr, matrix: MutPtr): Status

public expect fun gdipGetRenderingOrigin(graphics: MutPtr, x: MutPtr, y: MutPtr): Status

public expect fun gdipGetSmoothingMode(graphics: MutPtr, smoothingmode: MutPtr): Status

public expect fun gdipGetSolidFillColor(brush: MutPtr, color: MutPtr): Status

public expect fun gdipGetStringFormatAlign(format: ConstPtr, align: MutPtr): Status

public expect fun gdipGetStringFormatDigitSubstitution(format: ConstPtr, language: MutPtr, substitute: MutPtr): Status

public expect fun gdipGetStringFormatFlags(format: ConstPtr, flags: MutPtr): Status

public expect fun gdipGetStringFormatHotkeyPrefix(format: ConstPtr, hotkeyprefix: MutPtr): Status

public expect fun gdipGetStringFormatLineAlign(format: ConstPtr, align: MutPtr): Status

public expect fun gdipGetStringFormatMeasurableCharacterRangeCount(format: ConstPtr, count: MutPtr): Status

public expect fun gdipGetStringFormatTabStopCount(format: ConstPtr, count: MutPtr): Status

public expect fun gdipGetStringFormatTabStops(format: ConstPtr, count: Int, firsttaboffset: MutPtr, tabstops: MutPtr): Status

public expect fun gdipGetStringFormatTrimming(format: ConstPtr, trimming: MutPtr): Status

public expect fun gdipGetTextContrast(graphics: MutPtr, contrast: MutPtr): Status

public expect fun gdipGetTextRenderingHint(graphics: MutPtr, mode: MutPtr): Status

public expect fun gdipGetTextureImage(brush: MutPtr, image: MutPtr): Status

public expect fun gdipGetTextureTransform(brush: MutPtr, matrix: MutPtr): Status

public expect fun gdipGetTextureWrapMode(brush: MutPtr, wrapmode: MutPtr): Status

public expect fun gdipGetVisibleClipBounds(graphics: MutPtr, rect: MutPtr): Status

public expect fun gdipGetVisibleClipBoundsI(graphics: MutPtr, rect: MutPtr): Status

public expect fun gdipGetWorldTransform(graphics: MutPtr, matrix: MutPtr): Status

public expect fun gdipGraphicsClear(graphics: MutPtr, color: UInt): Status

public expect fun gdipGraphicsSetAbort(pgraphics: MutPtr, piabort: MutPtr): Status

public expect fun gdipImageForceValidation(image: MutPtr): Status

public expect fun gdipImageGetFrameCount(image: MutPtr, dimensionid: ConstPtr, count: MutPtr): Status

public expect fun gdipImageGetFrameDimensionsCount(image: MutPtr, count: MutPtr): Status

public expect fun gdipImageGetFrameDimensionsList(image: MutPtr, dimensionids: MutPtr, count: UInt): Status

public expect fun gdipImageRotateFlip(image: MutPtr, rftype: RotateFlipType): Status

public expect fun gdipImageSelectActiveFrame(image: MutPtr, dimensionid: ConstPtr, frameindex: UInt): Status

public expect fun gdipImageSetAbort(pimage: MutPtr, piabort: MutPtr): Status

public expect fun gdipInitializePalette(palette: MutPtr, palettetype: PaletteType, optimalcolors: Int, usetransparentcolor: Bool, bitmap: MutPtr): Status

public expect fun gdipInvertMatrix(matrix: MutPtr): Status

public expect fun gdipIsClipEmpty(graphics: MutPtr, result: MutPtr): Status

public expect fun gdipIsEmptyRegion(region: MutPtr, graphics: MutPtr, result: MutPtr): Status

public expect fun gdipIsEqualRegion(region: MutPtr, region2: MutPtr, graphics: MutPtr, result: MutPtr): Status

public expect fun gdipIsInfiniteRegion(region: MutPtr, graphics: MutPtr, result: MutPtr): Status

public expect fun gdipIsMatrixEqual(matrix: ConstPtr, matrix2: ConstPtr, result: MutPtr): Status

public expect fun gdipIsMatrixIdentity(matrix: ConstPtr, result: MutPtr): Status

public expect fun gdipIsMatrixInvertible(matrix: ConstPtr, result: MutPtr): Status

public expect fun gdipIsOutlineVisiblePathPoint(path: MutPtr, x: Float, y: Float, pen: MutPtr, graphics: MutPtr, result: MutPtr): Status

public expect fun gdipIsOutlineVisiblePathPointI(path: MutPtr, x: Int, y: Int, pen: MutPtr, graphics: MutPtr, result: MutPtr): Status

public expect fun gdipIsStyleAvailable(family: ConstPtr, style: Int, isstyleavailable: MutPtr): Status

public expect fun gdipIsVisibleClipEmpty(graphics: MutPtr, result: MutPtr): Status

public expect fun gdipIsVisiblePathPoint(path: MutPtr, x: Float, y: Float, graphics: MutPtr, result: MutPtr): Status

public expect fun gdipIsVisiblePathPointI(path: MutPtr, x: Int, y: Int, graphics: MutPtr, result: MutPtr): Status

public expect fun gdipIsVisiblePoint(graphics: MutPtr, x: Float, y: Float, result: MutPtr): Status

public expect fun gdipIsVisiblePointI(graphics: MutPtr, x: Int, y: Int, result: MutPtr): Status

public expect fun gdipIsVisibleRect(graphics: MutPtr, x: Float, y: Float, width: Float, height: Float, result: MutPtr): Status

public expect fun gdipIsVisibleRectI(graphics: MutPtr, x: Int, y: Int, width: Int, height: Int, result: MutPtr): Status

public expect fun gdipIsVisibleRegionPoint(region: MutPtr, x: Float, y: Float, graphics: MutPtr, result: MutPtr): Status

public expect fun gdipIsVisibleRegionPointI(region: MutPtr, x: Int, y: Int, graphics: MutPtr, result: MutPtr): Status

public expect fun gdipIsVisibleRegionRect(region: MutPtr, x: Float, y: Float, width: Float, height: Float, graphics: MutPtr, result: MutPtr): Status

public expect fun gdipIsVisibleRegionRectI(region: MutPtr, x: Int, y: Int, width: Int, height: Int, graphics: MutPtr, result: MutPtr): Status

public expect fun gdipLoadImageFromFile(filename: Pcwstr, image: MutPtr): Status

public expect fun gdipLoadImageFromFileICM(filename: Pcwstr, image: MutPtr): Status

public expect fun gdipLoadImageFromStream(stream: MutPtr, image: MutPtr): Status

public expect fun gdipLoadImageFromStreamICM(stream: MutPtr, image: MutPtr): Status

public expect fun gdipMeasureCharacterRanges(graphics: MutPtr, string: Pcwstr, length: Int, font: ConstPtr, layoutrect: ConstPtr, stringformat: ConstPtr, regioncount: Int, regions: MutPtr): Status

public expect fun gdipMeasureDriverString(graphics: MutPtr, text: ConstPtr, length: Int, font: ConstPtr, positions: ConstPtr, flags: Int, matrix: ConstPtr, boundingbox: MutPtr): Status

public expect fun gdipMeasureString(graphics: MutPtr, string: Pcwstr, length: Int, font: ConstPtr, layoutrect: ConstPtr, stringformat: ConstPtr, boundingbox: MutPtr, codepointsfitted: MutPtr, linesfilled: MutPtr): Status

public expect fun gdipMultiplyLineTransform(brush: MutPtr, matrix: ConstPtr, order: MatrixOrder): Status

public expect fun gdipMultiplyMatrix(matrix: MutPtr, matrix2: MutPtr, order: MatrixOrder): Status

public expect fun gdipMultiplyPathGradientTransform(brush: MutPtr, matrix: ConstPtr, order: MatrixOrder): Status

public expect fun gdipMultiplyPenTransform(pen: MutPtr, matrix: ConstPtr, order: MatrixOrder): Status

public expect fun gdipMultiplyTextureTransform(brush: MutPtr, matrix: ConstPtr, order: MatrixOrder): Status

public expect fun gdipMultiplyWorldTransform(graphics: MutPtr, matrix: ConstPtr, order: MatrixOrder): Status

public expect fun gdipNewInstalledFontCollection(fontcollection: MutPtr): Status

public expect fun gdipNewPrivateFontCollection(fontcollection: MutPtr): Status

public expect fun gdipPathIterCopyData(iterator: MutPtr, resultcount: MutPtr, points: MutPtr, types: MutPtr, startindex: Int, endindex: Int): Status

public expect fun gdipPathIterEnumerate(iterator: MutPtr, resultcount: MutPtr, points: MutPtr, types: MutPtr, count: Int): Status

public expect fun gdipPathIterGetCount(iterator: MutPtr, count: MutPtr): Status

public expect fun gdipPathIterGetSubpathCount(iterator: MutPtr, count: MutPtr): Status

public expect fun gdipPathIterHasCurve(iterator: MutPtr, hascurve: MutPtr): Status

public expect fun gdipPathIterIsValid(iterator: MutPtr, valid: MutPtr): Status

public expect fun gdipPathIterNextMarker(iterator: MutPtr, resultcount: MutPtr, startindex: MutPtr, endindex: MutPtr): Status

public expect fun gdipPathIterNextMarkerPath(iterator: MutPtr, resultcount: MutPtr, path: MutPtr): Status

public expect fun gdipPathIterNextPathType(iterator: MutPtr, resultcount: MutPtr, pathtype: MutPtr, startindex: MutPtr, endindex: MutPtr): Status

public expect fun gdipPathIterNextSubpath(iterator: MutPtr, resultcount: MutPtr, startindex: MutPtr, endindex: MutPtr, isclosed: MutPtr): Status

public expect fun gdipPathIterNextSubpathPath(iterator: MutPtr, resultcount: MutPtr, path: MutPtr, isclosed: MutPtr): Status

public expect fun gdipPathIterRewind(iterator: MutPtr): Status

public expect fun gdipPlayMetafileRecord(metafile: ConstPtr, recordtype: EmfPlusRecordType, flags: UInt, datasize: UInt, data: ConstPtr): Status

public expect fun gdipPrivateAddFontFile(fontcollection: MutPtr, filename: Pcwstr): Status

public expect fun gdipPrivateAddMemoryFont(fontcollection: MutPtr, memory: ConstPtr, length: Int): Status

public expect fun gdipRecordMetafile(referencehdc: Hdc, type: EmfType, framerect: ConstPtr, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr): Status

public expect fun gdipRecordMetafileFileName(filename: Pcwstr, referencehdc: Hdc, type: EmfType, framerect: ConstPtr, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr): Status

public expect fun gdipRecordMetafileFileNameI(filename: Pcwstr, referencehdc: Hdc, type: EmfType, framerect: ConstPtr, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr): Status

public expect fun gdipRecordMetafileI(referencehdc: Hdc, type: EmfType, framerect: ConstPtr, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr): Status

public expect fun gdipRecordMetafileStream(stream: MutPtr, referencehdc: Hdc, type: EmfType, framerect: ConstPtr, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr): Status

public expect fun gdipRecordMetafileStreamI(stream: MutPtr, referencehdc: Hdc, type: EmfType, framerect: ConstPtr, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr): Status

public expect fun gdipReleaseDC(graphics: MutPtr, hdc: Hdc): Status

public expect fun gdipRemovePropertyItem(image: MutPtr, propid: UInt): Status

public expect fun gdipResetClip(graphics: MutPtr): Status

public expect fun gdipResetImageAttributes(imageattr: MutPtr, type: ColorAdjustType): Status

public expect fun gdipResetLineTransform(brush: MutPtr): Status

public expect fun gdipResetPageTransform(graphics: MutPtr): Status

public expect fun gdipResetPath(path: MutPtr): Status

public expect fun gdipResetPathGradientTransform(brush: MutPtr): Status

public expect fun gdipResetPenTransform(pen: MutPtr): Status

public expect fun gdipResetTextureTransform(brush: MutPtr): Status

public expect fun gdipResetWorldTransform(graphics: MutPtr): Status

public expect fun gdipRestoreGraphics(graphics: MutPtr, state: UInt): Status

public expect fun gdipReversePath(path: MutPtr): Status

public expect fun gdipRotateLineTransform(brush: MutPtr, angle: Float, order: MatrixOrder): Status

public expect fun gdipRotateMatrix(matrix: MutPtr, angle: Float, order: MatrixOrder): Status

public expect fun gdipRotatePathGradientTransform(brush: MutPtr, angle: Float, order: MatrixOrder): Status

public expect fun gdipRotatePenTransform(pen: MutPtr, angle: Float, order: MatrixOrder): Status

public expect fun gdipRotateTextureTransform(brush: MutPtr, angle: Float, order: MatrixOrder): Status

public expect fun gdipRotateWorldTransform(graphics: MutPtr, angle: Float, order: MatrixOrder): Status

public expect fun gdipSaveAdd(image: MutPtr, encoderparams: ConstPtr): Status

public expect fun gdipSaveAddImage(image: MutPtr, newimage: MutPtr, encoderparams: ConstPtr): Status

public expect fun gdipSaveGraphics(graphics: MutPtr, state: MutPtr): Status

public expect fun gdipSaveImageToFile(image: MutPtr, filename: Pcwstr, clsidencoder: ConstPtr, encoderparams: ConstPtr): Status

public expect fun gdipSaveImageToStream(image: MutPtr, stream: MutPtr, clsidencoder: ConstPtr, encoderparams: ConstPtr): Status

public expect fun gdipScaleLineTransform(brush: MutPtr, sx: Float, sy: Float, order: MatrixOrder): Status

public expect fun gdipScaleMatrix(matrix: MutPtr, scalex: Float, scaley: Float, order: MatrixOrder): Status

public expect fun gdipScalePathGradientTransform(brush: MutPtr, sx: Float, sy: Float, order: MatrixOrder): Status

public expect fun gdipScalePenTransform(pen: MutPtr, sx: Float, sy: Float, order: MatrixOrder): Status
