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

public expect fun gdipAddPathArc(path: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status

public expect fun gdipAddPathArcI(path: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status

public expect fun gdipAddPathBezier(path: COpaquePointer?, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status

public expect fun gdipAddPathBezierI(path: COpaquePointer?, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status

public expect fun gdipAddPathBeziers(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status

public expect fun gdipAddPathBeziersI(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status

public expect fun gdipAddPathClosedCurve(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status

public expect fun gdipAddPathClosedCurve2(path: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float): Status

public expect fun gdipAddPathClosedCurve2I(path: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float): Status

public expect fun gdipAddPathClosedCurveI(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status

public expect fun gdipAddPathCurve(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status

public expect fun gdipAddPathCurve2(path: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float): Status

public expect fun gdipAddPathCurve2I(path: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float): Status

public expect fun gdipAddPathCurve3(path: COpaquePointer?, points: COpaquePointer?, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status

public expect fun gdipAddPathCurve3I(path: COpaquePointer?, points: COpaquePointer?, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status

public expect fun gdipAddPathCurveI(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status

public expect fun gdipAddPathEllipse(path: COpaquePointer?, x: Float, y: Float, width: Float, height: Float): Status

public expect fun gdipAddPathEllipseI(path: COpaquePointer?, x: Int, y: Int, width: Int, height: Int): Status

public expect fun gdipAddPathLine(path: COpaquePointer?, x1: Float, y1: Float, x2: Float, y2: Float): Status

public expect fun gdipAddPathLine2(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status

public expect fun gdipAddPathLine2I(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status

public expect fun gdipAddPathLineI(path: COpaquePointer?, x1: Int, y1: Int, x2: Int, y2: Int): Status

public expect fun gdipAddPathPath(path: COpaquePointer?, addingpath: COpaquePointer?, connect: Bool): Status

public expect fun gdipAddPathPie(path: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status

public expect fun gdipAddPathPieI(path: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status

public expect fun gdipAddPathPolygon(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status

public expect fun gdipAddPathPolygonI(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status

public expect fun gdipAddPathRectangle(path: COpaquePointer?, x: Float, y: Float, width: Float, height: Float): Status

public expect fun gdipAddPathRectangleI(path: COpaquePointer?, x: Int, y: Int, width: Int, height: Int): Status

public expect fun gdipAddPathRectangles(path: COpaquePointer?, rects: COpaquePointer?, count: Int): Status

public expect fun gdipAddPathRectanglesI(path: COpaquePointer?, rects: COpaquePointer?, count: Int): Status

public expect fun gdipAddPathString(path: COpaquePointer?, string: Pcwstr, length: Int, family: COpaquePointer?, style: Int, emsize: Float, layoutrect: COpaquePointer?, format: COpaquePointer?): Status

public expect fun gdipAddPathStringI(path: COpaquePointer?, string: Pcwstr, length: Int, family: COpaquePointer?, style: Int, emsize: Float, layoutrect: COpaquePointer?, format: COpaquePointer?): Status

public expect fun gdipAlloc(size: ULong): COpaquePointer?

public expect fun gdipBeginContainer(graphics: COpaquePointer?, dstrect: COpaquePointer?, srcrect: COpaquePointer?, unit: Unit, state: COpaquePointer?): Status

public expect fun gdipBeginContainer2(graphics: COpaquePointer?, state: COpaquePointer?): Status

public expect fun gdipBeginContainerI(graphics: COpaquePointer?, dstrect: COpaquePointer?, srcrect: COpaquePointer?, unit: Unit, state: COpaquePointer?): Status

public expect fun gdipBitmapApplyEffect(bitmap: COpaquePointer?, effect: COpaquePointer?, roi: COpaquePointer?, useauxdata: Bool, auxdata: COpaquePointer?, auxdatasize: COpaquePointer?): Status

public expect fun gdipBitmapConvertFormat(pinputbitmap: COpaquePointer?, format: Int, dithertype: DitherType, palettetype: PaletteType, palette: COpaquePointer?, alphathresholdpercent: Float): Status

public expect fun gdipBitmapCreateApplyEffect(inputbitmaps: COpaquePointer?, numinputs: Int, effect: COpaquePointer?, roi: COpaquePointer?, outputrect: COpaquePointer?, outputbitmap: COpaquePointer?, useauxdata: Bool, auxdata: COpaquePointer?, auxdatasize: COpaquePointer?): Status

public expect fun gdipBitmapGetHistogram(bitmap: COpaquePointer?, format: HistogramFormat, numberofentries: UInt, channel0: COpaquePointer?, channel1: COpaquePointer?, channel2: COpaquePointer?, channel3: COpaquePointer?): Status

public expect fun gdipBitmapGetHistogramSize(format: HistogramFormat, numberofentries: COpaquePointer?): Status

public expect fun gdipBitmapGetPixel(bitmap: COpaquePointer?, x: Int, y: Int, color: COpaquePointer?): Status

public expect fun gdipBitmapLockBits(bitmap: COpaquePointer?, rect: COpaquePointer?, flags: UInt, format: Int, lockedbitmapdata: COpaquePointer?): Status

public expect fun gdipBitmapSetPixel(bitmap: COpaquePointer?, x: Int, y: Int, color: UInt): Status

public expect fun gdipBitmapSetResolution(bitmap: COpaquePointer?, xdpi: Float, ydpi: Float): Status

public expect fun gdipBitmapUnlockBits(bitmap: COpaquePointer?, lockedbitmapdata: COpaquePointer?): Status

public expect fun gdipClearPathMarkers(path: COpaquePointer?): Status

public expect fun gdipCloneBitmapArea(x: Float, y: Float, width: Float, height: Float, format: Int, srcbitmap: COpaquePointer?, dstbitmap: COpaquePointer?): Status

public expect fun gdipCloneBitmapAreaI(x: Int, y: Int, width: Int, height: Int, format: Int, srcbitmap: COpaquePointer?, dstbitmap: COpaquePointer?): Status

public expect fun gdipCloneBrush(brush: COpaquePointer?, clonebrush: COpaquePointer?): Status

public expect fun gdipCloneCustomLineCap(customcap: COpaquePointer?, clonedcap: COpaquePointer?): Status

public expect fun gdipCloneFont(font: COpaquePointer?, clonefont: COpaquePointer?): Status

public expect fun gdipCloneFontFamily(fontfamily: COpaquePointer?, clonedfontfamily: COpaquePointer?): Status

public expect fun gdipCloneImage(image: COpaquePointer?, cloneimage: COpaquePointer?): Status

public expect fun gdipCloneImageAttributes(imageattr: COpaquePointer?, cloneimageattr: COpaquePointer?): Status

public expect fun gdipCloneMatrix(matrix: COpaquePointer?, clonematrix: COpaquePointer?): Status

public expect fun gdipClonePath(path: COpaquePointer?, clonepath: COpaquePointer?): Status

public expect fun gdipClonePen(pen: COpaquePointer?, clonepen: COpaquePointer?): Status

public expect fun gdipCloneRegion(region: COpaquePointer?, cloneregion: COpaquePointer?): Status

public expect fun gdipCloneStringFormat(format: COpaquePointer?, newformat: COpaquePointer?): Status

public expect fun gdipClosePathFigure(path: COpaquePointer?): Status

public expect fun gdipClosePathFigures(path: COpaquePointer?): Status

public expect fun gdipCombineRegionPath(region: COpaquePointer?, path: COpaquePointer?, combinemode: CombineMode): Status

public expect fun gdipCombineRegionRect(region: COpaquePointer?, rect: COpaquePointer?, combinemode: CombineMode): Status

public expect fun gdipCombineRegionRectI(region: COpaquePointer?, rect: COpaquePointer?, combinemode: CombineMode): Status

public expect fun gdipCombineRegionRegion(region: COpaquePointer?, region2: COpaquePointer?, combinemode: CombineMode): Status

public expect fun gdipComment(graphics: COpaquePointer?, sizedata: UInt, data: COpaquePointer?): Status

public expect fun gdipConvertToEmfPlus(refgraphics: COpaquePointer?, metafile: COpaquePointer?, conversionfailureflag: COpaquePointer?, emftype: EmfType, description: Pcwstr, outMetafile: COpaquePointer?): Status

public expect fun gdipConvertToEmfPlusToFile(refgraphics: COpaquePointer?, metafile: COpaquePointer?, conversionfailureflag: COpaquePointer?, filename: Pcwstr, emftype: EmfType, description: Pcwstr, outMetafile: COpaquePointer?): Status

public expect fun gdipConvertToEmfPlusToStream(refgraphics: COpaquePointer?, metafile: COpaquePointer?, conversionfailureflag: COpaquePointer?, stream: COpaquePointer?, emftype: EmfType, description: Pcwstr, outMetafile: COpaquePointer?): Status

public expect fun gdipCreateAdjustableArrowCap(height: Float, width: Float, isfilled: Bool, cap: COpaquePointer?): Status

public expect fun gdipCreateBitmapFromFile(filename: Pcwstr, bitmap: COpaquePointer?): Status

public expect fun gdipCreateBitmapFromFileICM(filename: Pcwstr, bitmap: COpaquePointer?): Status

public expect fun gdipCreateBitmapFromGdiDib(gdibitmapinfo: COpaquePointer?, gdibitmapdata: COpaquePointer?, bitmap: COpaquePointer?): Status

public expect fun gdipCreateBitmapFromGraphics(width: Int, height: Int, target: COpaquePointer?, bitmap: COpaquePointer?): Status

public expect fun gdipCreateBitmapFromHBITMAP(hbm: Hbitmap, hpal: Hpalette, bitmap: COpaquePointer?): Status

public expect fun gdipCreateBitmapFromHICON(hicon: Hicon, bitmap: COpaquePointer?): Status

public expect fun gdipCreateBitmapFromResource(hinstance: Hinstance, lpbitmapname: Pcwstr, bitmap: COpaquePointer?): Status

public expect fun gdipCreateBitmapFromScan0(width: Int, height: Int, stride: Int, format: Int, scan0: COpaquePointer?, bitmap: COpaquePointer?): Status

public expect fun gdipCreateBitmapFromStream(stream: COpaquePointer?, bitmap: COpaquePointer?): Status

public expect fun gdipCreateBitmapFromStreamICM(stream: COpaquePointer?, bitmap: COpaquePointer?): Status

public expect fun gdipCreateCachedBitmap(bitmap: COpaquePointer?, graphics: COpaquePointer?, cachedbitmap: COpaquePointer?): Status

public expect fun gdipCreateCustomLineCap(fillpath: COpaquePointer?, strokepath: COpaquePointer?, basecap: LineCap, baseinset: Float, customcap: COpaquePointer?): Status

public expect fun gdipCreateEffect(guid: Guid, effect: COpaquePointer?): Status

public expect fun gdipCreateFont(fontfamily: COpaquePointer?, emsize: Float, style: Int, unit: Unit, font: COpaquePointer?): Status

public expect fun gdipCreateFontFamilyFromName(name: Pcwstr, fontcollection: COpaquePointer?, fontfamily: COpaquePointer?): Status

public expect fun gdipCreateFontFromDC(hdc: Hdc, font: COpaquePointer?): Status

public expect fun gdipCreateFontFromLogfontA(hdc: Hdc, logfont: COpaquePointer?, font: COpaquePointer?): Status

public expect fun gdipCreateFontFromLogfontW(hdc: Hdc, logfont: COpaquePointer?, font: COpaquePointer?): Status

public expect fun gdipCreateFromHDC(hdc: Hdc, graphics: COpaquePointer?): Status

public expect fun gdipCreateFromHDC2(hdc: Hdc, hdevice: Handle, graphics: COpaquePointer?): Status

public expect fun gdipCreateFromHWND(hwnd: Hwnd, graphics: COpaquePointer?): Status

public expect fun gdipCreateFromHWNDICM(hwnd: Hwnd, graphics: COpaquePointer?): Status

public expect fun gdipCreateHBITMAPFromBitmap(bitmap: COpaquePointer?, hbmreturn: COpaquePointer?, background: UInt): Status

public expect fun gdipCreateHICONFromBitmap(bitmap: COpaquePointer?, hbmreturn: COpaquePointer?): Status

public expect fun gdipCreateHalftonePalette(): Hpalette

public expect fun gdipCreateHatchBrush(hatchstyle: HatchStyle, forecol: UInt, backcol: UInt, brush: COpaquePointer?): Status

public expect fun gdipCreateImageAttributes(imageattr: COpaquePointer?): Status

public expect fun gdipCreateLineBrush(point1: COpaquePointer?, point2: COpaquePointer?, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: COpaquePointer?): Status

public expect fun gdipCreateLineBrushFromRect(rect: COpaquePointer?, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: COpaquePointer?): Status

public expect fun gdipCreateLineBrushFromRectI(rect: COpaquePointer?, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: COpaquePointer?): Status

public expect fun gdipCreateLineBrushFromRectWithAngle(rect: COpaquePointer?, color1: UInt, color2: UInt, angle: Float, isanglescalable: Bool, wrapmode: WrapMode, linegradient: COpaquePointer?): Status

public expect fun gdipCreateLineBrushFromRectWithAngleI(rect: COpaquePointer?, color1: UInt, color2: UInt, angle: Float, isanglescalable: Bool, wrapmode: WrapMode, linegradient: COpaquePointer?): Status

public expect fun gdipCreateLineBrushI(point1: COpaquePointer?, point2: COpaquePointer?, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: COpaquePointer?): Status

public expect fun gdipCreateMatrix(matrix: COpaquePointer?): Status

public expect fun gdipCreateMatrix2(m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float, matrix: COpaquePointer?): Status

public expect fun gdipCreateMatrix3(rect: COpaquePointer?, dstplg: COpaquePointer?, matrix: COpaquePointer?): Status

public expect fun gdipCreateMatrix3I(rect: COpaquePointer?, dstplg: COpaquePointer?, matrix: COpaquePointer?): Status

public expect fun gdipCreateMetafileFromEmf(hemf: Henhmetafile, deleteemf: Bool, metafile: COpaquePointer?): Status

public expect fun gdipCreateMetafileFromFile(file: Pcwstr, metafile: COpaquePointer?): Status

public expect fun gdipCreateMetafileFromStream(stream: COpaquePointer?, metafile: COpaquePointer?): Status

public expect fun gdipCreateMetafileFromWmf(hwmf: Hmetafile, deletewmf: Bool, wmfplaceablefileheader: COpaquePointer?, metafile: COpaquePointer?): Status

public expect fun gdipCreateMetafileFromWmfFile(file: Pcwstr, wmfplaceablefileheader: COpaquePointer?, metafile: COpaquePointer?): Status

public expect fun gdipCreatePath(brushmode: FillMode, path: COpaquePointer?): Status

public expect fun gdipCreatePath2(param0: COpaquePointer?, param1: COpaquePointer?, param2: Int, param3: FillMode, path: COpaquePointer?): Status

public expect fun gdipCreatePath2I(param0: COpaquePointer?, param1: COpaquePointer?, param2: Int, param3: FillMode, path: COpaquePointer?): Status

public expect fun gdipCreatePathGradient(points: COpaquePointer?, count: Int, wrapmode: WrapMode, polygradient: COpaquePointer?): Status

public expect fun gdipCreatePathGradientFromPath(path: COpaquePointer?, polygradient: COpaquePointer?): Status

public expect fun gdipCreatePathGradientI(points: COpaquePointer?, count: Int, wrapmode: WrapMode, polygradient: COpaquePointer?): Status

public expect fun gdipCreatePathIter(iterator: COpaquePointer?, path: COpaquePointer?): Status

public expect fun gdipCreatePen1(color: UInt, width: Float, unit: Unit, pen: COpaquePointer?): Status

public expect fun gdipCreatePen2(brush: COpaquePointer?, width: Float, unit: Unit, pen: COpaquePointer?): Status

public expect fun gdipCreateRegion(region: COpaquePointer?): Status

public expect fun gdipCreateRegionHrgn(hrgn: Hrgn, region: COpaquePointer?): Status

public expect fun gdipCreateRegionPath(path: COpaquePointer?, region: COpaquePointer?): Status

public expect fun gdipCreateRegionRect(rect: COpaquePointer?, region: COpaquePointer?): Status

public expect fun gdipCreateRegionRectI(rect: COpaquePointer?, region: COpaquePointer?): Status

public expect fun gdipCreateRegionRgnData(regiondata: COpaquePointer?, size: Int, region: COpaquePointer?): Status

public expect fun gdipCreateSolidFill(color: UInt, brush: COpaquePointer?): Status

public expect fun gdipCreateStreamOnFile(filename: Pcwstr, access: UInt, stream: COpaquePointer?): Status

public expect fun gdipCreateStringFormat(formatattributes: Int, language: UShort, format: COpaquePointer?): Status

public expect fun gdipCreateTexture(image: COpaquePointer?, wrapmode: WrapMode, texture: COpaquePointer?): Status

public expect fun gdipCreateTexture2(image: COpaquePointer?, wrapmode: WrapMode, x: Float, y: Float, width: Float, height: Float, texture: COpaquePointer?): Status

public expect fun gdipCreateTexture2I(image: COpaquePointer?, wrapmode: WrapMode, x: Int, y: Int, width: Int, height: Int, texture: COpaquePointer?): Status

public expect fun gdipCreateTextureIA(image: COpaquePointer?, imageattributes: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, texture: COpaquePointer?): Status

public expect fun gdipCreateTextureIAI(image: COpaquePointer?, imageattributes: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, texture: COpaquePointer?): Status

public expect fun gdipDeleteBrush(brush: COpaquePointer?): Status

public expect fun gdipDeleteCachedBitmap(cachedbitmap: COpaquePointer?): Status

public expect fun gdipDeleteCustomLineCap(customcap: COpaquePointer?): Status

public expect fun gdipDeleteEffect(effect: COpaquePointer?): Status

public expect fun gdipDeleteFont(font: COpaquePointer?): Status

public expect fun gdipDeleteFontFamily(fontfamily: COpaquePointer?): Status

public expect fun gdipDeleteGraphics(graphics: COpaquePointer?): Status

public expect fun gdipDeleteMatrix(matrix: COpaquePointer?): Status

public expect fun gdipDeletePath(path: COpaquePointer?): Status

public expect fun gdipDeletePathIter(iterator: COpaquePointer?): Status

public expect fun gdipDeletePen(pen: COpaquePointer?): Status

public expect fun gdipDeletePrivateFontCollection(fontcollection: COpaquePointer?): Status

public expect fun gdipDeleteRegion(region: COpaquePointer?): Status

public expect fun gdipDeleteStringFormat(format: COpaquePointer?): Status

public expect fun gdipDisposeImage(image: COpaquePointer?): Status

public expect fun gdipDisposeImageAttributes(imageattr: COpaquePointer?): Status

public expect fun gdipDrawArc(graphics: COpaquePointer?, pen: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status

public expect fun gdipDrawArcI(graphics: COpaquePointer?, pen: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status

public expect fun gdipDrawBezier(graphics: COpaquePointer?, pen: COpaquePointer?, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status

public expect fun gdipDrawBezierI(graphics: COpaquePointer?, pen: COpaquePointer?, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status

public expect fun gdipDrawBeziers(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status

public expect fun gdipDrawBeziersI(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status

public expect fun gdipDrawCachedBitmap(graphics: COpaquePointer?, cachedbitmap: COpaquePointer?, x: Int, y: Int): Status

public expect fun gdipDrawClosedCurve(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status

public expect fun gdipDrawClosedCurve2(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float): Status

public expect fun gdipDrawClosedCurve2I(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float): Status

public expect fun gdipDrawClosedCurveI(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status

public expect fun gdipDrawCurve(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status

public expect fun gdipDrawCurve2(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float): Status

public expect fun gdipDrawCurve2I(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float): Status

public expect fun gdipDrawCurve3(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status

public expect fun gdipDrawCurve3I(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status

public expect fun gdipDrawCurveI(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status

public expect fun gdipDrawDriverString(graphics: COpaquePointer?, text: COpaquePointer?, length: Int, font: COpaquePointer?, brush: COpaquePointer?, positions: COpaquePointer?, flags: Int, matrix: COpaquePointer?): Status

public expect fun gdipDrawEllipse(graphics: COpaquePointer?, pen: COpaquePointer?, x: Float, y: Float, width: Float, height: Float): Status

public expect fun gdipDrawEllipseI(graphics: COpaquePointer?, pen: COpaquePointer?, x: Int, y: Int, width: Int, height: Int): Status

public expect fun gdipDrawImage(graphics: COpaquePointer?, image: COpaquePointer?, x: Float, y: Float): Status

public expect fun gdipDrawImageFX(graphics: COpaquePointer?, image: COpaquePointer?, source: COpaquePointer?, xform: COpaquePointer?, effect: COpaquePointer?, imageattributes: COpaquePointer?, srcunit: Unit): Status

public expect fun gdipDrawImageI(graphics: COpaquePointer?, image: COpaquePointer?, x: Int, y: Int): Status

public expect fun gdipDrawImagePointRect(graphics: COpaquePointer?, image: COpaquePointer?, x: Float, y: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit): Status

public expect fun gdipDrawImagePointRectI(graphics: COpaquePointer?, image: COpaquePointer?, x: Int, y: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit): Status

public expect fun gdipDrawImagePoints(graphics: COpaquePointer?, image: COpaquePointer?, dstpoints: COpaquePointer?, count: Int): Status

public expect fun gdipDrawImagePointsI(graphics: COpaquePointer?, image: COpaquePointer?, dstpoints: COpaquePointer?, count: Int): Status

public expect fun gdipDrawImagePointsRect(graphics: COpaquePointer?, image: COpaquePointer?, points: COpaquePointer?, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?): Status

public expect fun gdipDrawImagePointsRectI(graphics: COpaquePointer?, image: COpaquePointer?, points: COpaquePointer?, count: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?): Status

public expect fun gdipDrawImageRect(graphics: COpaquePointer?, image: COpaquePointer?, x: Float, y: Float, width: Float, height: Float): Status

public expect fun gdipDrawImageRectI(graphics: COpaquePointer?, image: COpaquePointer?, x: Int, y: Int, width: Int, height: Int): Status

public expect fun gdipDrawImageRectRect(graphics: COpaquePointer?, image: COpaquePointer?, dstx: Float, dsty: Float, dstwidth: Float, dstheight: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?): Status

public expect fun gdipDrawImageRectRectI(graphics: COpaquePointer?, image: COpaquePointer?, dstx: Int, dsty: Int, dstwidth: Int, dstheight: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?): Status

public expect fun gdipDrawLine(graphics: COpaquePointer?, pen: COpaquePointer?, x1: Float, y1: Float, x2: Float, y2: Float): Status

public expect fun gdipDrawLineI(graphics: COpaquePointer?, pen: COpaquePointer?, x1: Int, y1: Int, x2: Int, y2: Int): Status

public expect fun gdipDrawLines(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status

public expect fun gdipDrawLinesI(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status

public expect fun gdipDrawPath(graphics: COpaquePointer?, pen: COpaquePointer?, path: COpaquePointer?): Status

public expect fun gdipDrawPie(graphics: COpaquePointer?, pen: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status

public expect fun gdipDrawPieI(graphics: COpaquePointer?, pen: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status

public expect fun gdipDrawPolygon(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status

public expect fun gdipDrawPolygonI(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status

public expect fun gdipDrawRectangle(graphics: COpaquePointer?, pen: COpaquePointer?, x: Float, y: Float, width: Float, height: Float): Status

public expect fun gdipDrawRectangleI(graphics: COpaquePointer?, pen: COpaquePointer?, x: Int, y: Int, width: Int, height: Int): Status

public expect fun gdipDrawRectangles(graphics: COpaquePointer?, pen: COpaquePointer?, rects: COpaquePointer?, count: Int): Status

public expect fun gdipDrawRectanglesI(graphics: COpaquePointer?, pen: COpaquePointer?, rects: COpaquePointer?, count: Int): Status

public expect fun gdipDrawString(graphics: COpaquePointer?, string: Pcwstr, length: Int, font: COpaquePointer?, layoutrect: COpaquePointer?, stringformat: COpaquePointer?, brush: COpaquePointer?): Status

public expect fun gdipEmfToWmfBits(hemf: Henhmetafile, cbdata16: UInt, pdata16: COpaquePointer?, imapmode: Int, eflags: Int): UInt

public expect fun gdipEndContainer(graphics: COpaquePointer?, state: UInt): Status

public expect fun gdipEnumerateMetafileDestPoint(graphics: COpaquePointer?, metafile: COpaquePointer?, destpoint: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status

public expect fun gdipEnumerateMetafileDestPointI(graphics: COpaquePointer?, metafile: COpaquePointer?, destpoint: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status

public expect fun gdipEnumerateMetafileDestPoints(graphics: COpaquePointer?, metafile: COpaquePointer?, destpoints: COpaquePointer?, count: Int, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status

public expect fun gdipEnumerateMetafileDestPointsI(graphics: COpaquePointer?, metafile: COpaquePointer?, destpoints: COpaquePointer?, count: Int, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status

public expect fun gdipEnumerateMetafileDestRect(graphics: COpaquePointer?, metafile: COpaquePointer?, destrect: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status

public expect fun gdipEnumerateMetafileDestRectI(graphics: COpaquePointer?, metafile: COpaquePointer?, destrect: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status

public expect fun gdipEnumerateMetafileSrcRectDestPoint(graphics: COpaquePointer?, metafile: COpaquePointer?, destpoint: COpaquePointer?, srcrect: COpaquePointer?, srcunit: Unit, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status

public expect fun gdipEnumerateMetafileSrcRectDestPointI(graphics: COpaquePointer?, metafile: COpaquePointer?, destpoint: COpaquePointer?, srcrect: COpaquePointer?, srcunit: Unit, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status

public expect fun gdipEnumerateMetafileSrcRectDestPoints(graphics: COpaquePointer?, metafile: COpaquePointer?, destpoints: COpaquePointer?, count: Int, srcrect: COpaquePointer?, srcunit: Unit, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status

public expect fun gdipEnumerateMetafileSrcRectDestPointsI(graphics: COpaquePointer?, metafile: COpaquePointer?, destpoints: COpaquePointer?, count: Int, srcrect: COpaquePointer?, srcunit: Unit, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status

public expect fun gdipEnumerateMetafileSrcRectDestRect(graphics: COpaquePointer?, metafile: COpaquePointer?, destrect: COpaquePointer?, srcrect: COpaquePointer?, srcunit: Unit, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status

public expect fun gdipEnumerateMetafileSrcRectDestRectI(graphics: COpaquePointer?, metafile: COpaquePointer?, destrect: COpaquePointer?, srcrect: COpaquePointer?, srcunit: Unit, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status

public expect fun gdipFillClosedCurve(graphics: COpaquePointer?, brush: COpaquePointer?, points: COpaquePointer?, count: Int): Status

public expect fun gdipFillClosedCurve2(graphics: COpaquePointer?, brush: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float, fillmode: FillMode): Status

public expect fun gdipFillClosedCurve2I(graphics: COpaquePointer?, brush: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float, fillmode: FillMode): Status

public expect fun gdipFillClosedCurveI(graphics: COpaquePointer?, brush: COpaquePointer?, points: COpaquePointer?, count: Int): Status

public expect fun gdipFillEllipse(graphics: COpaquePointer?, brush: COpaquePointer?, x: Float, y: Float, width: Float, height: Float): Status

public expect fun gdipFillEllipseI(graphics: COpaquePointer?, brush: COpaquePointer?, x: Int, y: Int, width: Int, height: Int): Status

public expect fun gdipFillPath(graphics: COpaquePointer?, brush: COpaquePointer?, path: COpaquePointer?): Status

public expect fun gdipFillPie(graphics: COpaquePointer?, brush: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status

public expect fun gdipFillPieI(graphics: COpaquePointer?, brush: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status

public expect fun gdipFillPolygon(graphics: COpaquePointer?, brush: COpaquePointer?, points: COpaquePointer?, count: Int, fillmode: FillMode): Status

public expect fun gdipFillPolygon2(graphics: COpaquePointer?, brush: COpaquePointer?, points: COpaquePointer?, count: Int): Status

public expect fun gdipFillPolygon2I(graphics: COpaquePointer?, brush: COpaquePointer?, points: COpaquePointer?, count: Int): Status

public expect fun gdipFillPolygonI(graphics: COpaquePointer?, brush: COpaquePointer?, points: COpaquePointer?, count: Int, fillmode: FillMode): Status

public expect fun gdipFillRectangle(graphics: COpaquePointer?, brush: COpaquePointer?, x: Float, y: Float, width: Float, height: Float): Status

public expect fun gdipFillRectangleI(graphics: COpaquePointer?, brush: COpaquePointer?, x: Int, y: Int, width: Int, height: Int): Status

public expect fun gdipFillRectangles(graphics: COpaquePointer?, brush: COpaquePointer?, rects: COpaquePointer?, count: Int): Status

public expect fun gdipFillRectanglesI(graphics: COpaquePointer?, brush: COpaquePointer?, rects: COpaquePointer?, count: Int): Status

public expect fun gdipFillRegion(graphics: COpaquePointer?, brush: COpaquePointer?, region: COpaquePointer?): Status

public expect fun gdipFindFirstImageItem(image: COpaquePointer?, item: COpaquePointer?): Status

public expect fun gdipFindNextImageItem(image: COpaquePointer?, item: COpaquePointer?): Status

public expect fun gdipFlattenPath(path: COpaquePointer?, matrix: COpaquePointer?, flatness: Float): Status

public expect fun gdipFlush(graphics: COpaquePointer?, intention: FlushIntention): Status

public expect fun gdipFree(ptr: COpaquePointer?)

public expect fun gdipGetAdjustableArrowCapFillState(cap: COpaquePointer?, fillstate: COpaquePointer?): Status

public expect fun gdipGetAdjustableArrowCapHeight(cap: COpaquePointer?, height: COpaquePointer?): Status

public expect fun gdipGetAdjustableArrowCapMiddleInset(cap: COpaquePointer?, middleinset: COpaquePointer?): Status

public expect fun gdipGetAdjustableArrowCapWidth(cap: COpaquePointer?, width: COpaquePointer?): Status

public expect fun gdipGetAllPropertyItems(image: COpaquePointer?, totalbuffersize: UInt, numproperties: UInt, allitems: COpaquePointer?): Status

public expect fun gdipGetBrushType(brush: COpaquePointer?, type: COpaquePointer?): Status

public expect fun gdipGetCellAscent(family: COpaquePointer?, style: Int, cellascent: COpaquePointer?): Status

public expect fun gdipGetCellDescent(family: COpaquePointer?, style: Int, celldescent: COpaquePointer?): Status

public expect fun gdipGetClip(graphics: COpaquePointer?, region: COpaquePointer?): Status

public expect fun gdipGetClipBounds(graphics: COpaquePointer?, rect: COpaquePointer?): Status

public expect fun gdipGetClipBoundsI(graphics: COpaquePointer?, rect: COpaquePointer?): Status

public expect fun gdipGetCompositingMode(graphics: COpaquePointer?, compositingmode: COpaquePointer?): Status

public expect fun gdipGetCompositingQuality(graphics: COpaquePointer?, compositingquality: COpaquePointer?): Status

public expect fun gdipGetCustomLineCapBaseCap(customcap: COpaquePointer?, basecap: COpaquePointer?): Status

public expect fun gdipGetCustomLineCapBaseInset(customcap: COpaquePointer?, inset: COpaquePointer?): Status

public expect fun gdipGetCustomLineCapStrokeCaps(customcap: COpaquePointer?, startcap: COpaquePointer?, endcap: COpaquePointer?): Status

public expect fun gdipGetCustomLineCapStrokeJoin(customcap: COpaquePointer?, linejoin: COpaquePointer?): Status

public expect fun gdipGetCustomLineCapType(customcap: COpaquePointer?, captype: COpaquePointer?): Status

public expect fun gdipGetCustomLineCapWidthScale(customcap: COpaquePointer?, widthscale: COpaquePointer?): Status

public expect fun gdipGetDC(graphics: COpaquePointer?, hdc: COpaquePointer?): Status

public expect fun gdipGetDpiX(graphics: COpaquePointer?, dpi: COpaquePointer?): Status

public expect fun gdipGetDpiY(graphics: COpaquePointer?, dpi: COpaquePointer?): Status

public expect fun gdipGetEffectParameterSize(effect: COpaquePointer?, size: COpaquePointer?): Status

public expect fun gdipGetEffectParameters(effect: COpaquePointer?, size: COpaquePointer?, params: COpaquePointer?): Status

public expect fun gdipGetEmHeight(family: COpaquePointer?, style: Int, emheight: COpaquePointer?): Status

public expect fun gdipGetEncoderParameterList(image: COpaquePointer?, clsidencoder: COpaquePointer?, size: UInt, buffer: COpaquePointer?): Status

public expect fun gdipGetEncoderParameterListSize(image: COpaquePointer?, clsidencoder: COpaquePointer?, size: COpaquePointer?): Status

public expect fun gdipGetFamily(font: COpaquePointer?, family: COpaquePointer?): Status

public expect fun gdipGetFamilyName(family: COpaquePointer?, name: Pwstr, language: UShort): Status

public expect fun gdipGetFontCollectionFamilyCount(fontcollection: COpaquePointer?, numfound: COpaquePointer?): Status

public expect fun gdipGetFontCollectionFamilyList(fontcollection: COpaquePointer?, numsought: Int, gpfamilies: COpaquePointer?, numfound: COpaquePointer?): Status

public expect fun gdipGetFontHeight(font: COpaquePointer?, graphics: COpaquePointer?, height: COpaquePointer?): Status

public expect fun gdipGetFontHeightGivenDPI(font: COpaquePointer?, dpi: Float, height: COpaquePointer?): Status

public expect fun gdipGetFontSize(font: COpaquePointer?, size: COpaquePointer?): Status

public expect fun gdipGetFontStyle(font: COpaquePointer?, style: COpaquePointer?): Status

public expect fun gdipGetFontUnit(font: COpaquePointer?, unit: COpaquePointer?): Status

public expect fun gdipGetGenericFontFamilyMonospace(nativefamily: COpaquePointer?): Status

public expect fun gdipGetGenericFontFamilySansSerif(nativefamily: COpaquePointer?): Status

public expect fun gdipGetGenericFontFamilySerif(nativefamily: COpaquePointer?): Status

public expect fun gdipGetHatchBackgroundColor(brush: COpaquePointer?, backcol: COpaquePointer?): Status

public expect fun gdipGetHatchForegroundColor(brush: COpaquePointer?, forecol: COpaquePointer?): Status

public expect fun gdipGetHatchStyle(brush: COpaquePointer?, hatchstyle: COpaquePointer?): Status

public expect fun gdipGetHemfFromMetafile(metafile: COpaquePointer?, hemf: COpaquePointer?): Status

public expect fun gdipGetImageAttributesAdjustedPalette(imageattr: COpaquePointer?, colorpalette: COpaquePointer?, coloradjusttype: ColorAdjustType): Status

public expect fun gdipGetImageBounds(image: COpaquePointer?, srcrect: COpaquePointer?, srcunit: COpaquePointer?): Status

public expect fun gdipGetImageDecoders(numdecoders: UInt, size: UInt, decoders: COpaquePointer?): Status

public expect fun gdipGetImageDecodersSize(numdecoders: COpaquePointer?, size: COpaquePointer?): Status

public expect fun gdipGetImageDimension(image: COpaquePointer?, width: COpaquePointer?, height: COpaquePointer?): Status

public expect fun gdipGetImageEncoders(numencoders: UInt, size: UInt, encoders: COpaquePointer?): Status

public expect fun gdipGetImageEncodersSize(numencoders: COpaquePointer?, size: COpaquePointer?): Status

public expect fun gdipGetImageFlags(image: COpaquePointer?, flags: COpaquePointer?): Status

public expect fun gdipGetImageGraphicsContext(image: COpaquePointer?, graphics: COpaquePointer?): Status

public expect fun gdipGetImageHeight(image: COpaquePointer?, height: COpaquePointer?): Status

public expect fun gdipGetImageHorizontalResolution(image: COpaquePointer?, resolution: COpaquePointer?): Status

public expect fun gdipGetImageItemData(image: COpaquePointer?, item: COpaquePointer?): Status

public expect fun gdipGetImagePalette(image: COpaquePointer?, palette: COpaquePointer?, size: Int): Status

public expect fun gdipGetImagePaletteSize(image: COpaquePointer?, size: COpaquePointer?): Status

public expect fun gdipGetImagePixelFormat(image: COpaquePointer?, format: COpaquePointer?): Status

public expect fun gdipGetImageRawFormat(image: COpaquePointer?, format: COpaquePointer?): Status

public expect fun gdipGetImageThumbnail(image: COpaquePointer?, thumbwidth: UInt, thumbheight: UInt, thumbimage: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?): Status

public expect fun gdipGetImageType(image: COpaquePointer?, type: COpaquePointer?): Status

public expect fun gdipGetImageVerticalResolution(image: COpaquePointer?, resolution: COpaquePointer?): Status

public expect fun gdipGetImageWidth(image: COpaquePointer?, width: COpaquePointer?): Status

public expect fun gdipGetInterpolationMode(graphics: COpaquePointer?, interpolationmode: COpaquePointer?): Status

public expect fun gdipGetLineBlend(brush: COpaquePointer?, blend: COpaquePointer?, positions: COpaquePointer?, count: Int): Status

public expect fun gdipGetLineBlendCount(brush: COpaquePointer?, count: COpaquePointer?): Status

public expect fun gdipGetLineColors(brush: COpaquePointer?, colors: COpaquePointer?): Status

public expect fun gdipGetLineGammaCorrection(brush: COpaquePointer?, usegammacorrection: COpaquePointer?): Status

public expect fun gdipGetLinePresetBlend(brush: COpaquePointer?, blend: COpaquePointer?, positions: COpaquePointer?, count: Int): Status

public expect fun gdipGetLinePresetBlendCount(brush: COpaquePointer?, count: COpaquePointer?): Status

public expect fun gdipGetLineRect(brush: COpaquePointer?, rect: COpaquePointer?): Status

public expect fun gdipGetLineRectI(brush: COpaquePointer?, rect: COpaquePointer?): Status

public expect fun gdipGetLineSpacing(family: COpaquePointer?, style: Int, linespacing: COpaquePointer?): Status

public expect fun gdipGetLineTransform(brush: COpaquePointer?, matrix: COpaquePointer?): Status

public expect fun gdipGetLineWrapMode(brush: COpaquePointer?, wrapmode: COpaquePointer?): Status

public expect fun gdipGetLogFontA(font: COpaquePointer?, graphics: COpaquePointer?, logfonta: COpaquePointer?): Status

public expect fun gdipGetLogFontW(font: COpaquePointer?, graphics: COpaquePointer?, logfontw: COpaquePointer?): Status

public expect fun gdipGetMatrixElements(matrix: COpaquePointer?, matrixout: COpaquePointer?): Status

public expect fun gdipGetMetafileDownLevelRasterizationLimit(metafile: COpaquePointer?, metafilerasterizationlimitdpi: COpaquePointer?): Status

public expect fun gdipGetMetafileHeaderFromEmf(hemf: Henhmetafile, header: COpaquePointer?): Status

public expect fun gdipGetMetafileHeaderFromFile(filename: Pcwstr, header: COpaquePointer?): Status

public expect fun gdipGetMetafileHeaderFromMetafile(metafile: COpaquePointer?, header: COpaquePointer?): Status

public expect fun gdipGetMetafileHeaderFromStream(stream: COpaquePointer?, header: COpaquePointer?): Status

public expect fun gdipGetMetafileHeaderFromWmf(hwmf: Hmetafile, wmfplaceablefileheader: COpaquePointer?, header: COpaquePointer?): Status

public expect fun gdipGetNearestColor(graphics: COpaquePointer?, argb: COpaquePointer?): Status

public expect fun gdipGetPageScale(graphics: COpaquePointer?, scale: COpaquePointer?): Status

public expect fun gdipGetPageUnit(graphics: COpaquePointer?, unit: COpaquePointer?): Status

public expect fun gdipGetPathData(path: COpaquePointer?, pathdata: COpaquePointer?): Status

public expect fun gdipGetPathFillMode(path: COpaquePointer?, fillmode: COpaquePointer?): Status

public expect fun gdipGetPathGradientBlend(brush: COpaquePointer?, blend: COpaquePointer?, positions: COpaquePointer?, count: Int): Status

public expect fun gdipGetPathGradientBlendCount(brush: COpaquePointer?, count: COpaquePointer?): Status

public expect fun gdipGetPathGradientCenterColor(brush: COpaquePointer?, colors: COpaquePointer?): Status

public expect fun gdipGetPathGradientCenterPoint(brush: COpaquePointer?, points: COpaquePointer?): Status

public expect fun gdipGetPathGradientCenterPointI(brush: COpaquePointer?, points: COpaquePointer?): Status

public expect fun gdipGetPathGradientFocusScales(brush: COpaquePointer?, xscale: COpaquePointer?, yscale: COpaquePointer?): Status

public expect fun gdipGetPathGradientGammaCorrection(brush: COpaquePointer?, usegammacorrection: COpaquePointer?): Status

public expect fun gdipGetPathGradientPath(brush: COpaquePointer?, path: COpaquePointer?): Status

public expect fun gdipGetPathGradientPointCount(brush: COpaquePointer?, count: COpaquePointer?): Status

public expect fun gdipGetPathGradientPresetBlend(brush: COpaquePointer?, blend: COpaquePointer?, positions: COpaquePointer?, count: Int): Status

public expect fun gdipGetPathGradientPresetBlendCount(brush: COpaquePointer?, count: COpaquePointer?): Status

public expect fun gdipGetPathGradientRect(brush: COpaquePointer?, rect: COpaquePointer?): Status

public expect fun gdipGetPathGradientRectI(brush: COpaquePointer?, rect: COpaquePointer?): Status

public expect fun gdipGetPathGradientSurroundColorCount(brush: COpaquePointer?, count: COpaquePointer?): Status

public expect fun gdipGetPathGradientSurroundColorsWithCount(brush: COpaquePointer?, color: COpaquePointer?, count: COpaquePointer?): Status

public expect fun gdipGetPathGradientTransform(brush: COpaquePointer?, matrix: COpaquePointer?): Status

public expect fun gdipGetPathGradientWrapMode(brush: COpaquePointer?, wrapmode: COpaquePointer?): Status

public expect fun gdipGetPathLastPoint(path: COpaquePointer?, lastpoint: COpaquePointer?): Status

public expect fun gdipGetPathPoints(param0: COpaquePointer?, points: COpaquePointer?, count: Int): Status

public expect fun gdipGetPathPointsI(param0: COpaquePointer?, points: COpaquePointer?, count: Int): Status

public expect fun gdipGetPathTypes(path: COpaquePointer?, types: COpaquePointer?, count: Int): Status

public expect fun gdipGetPathWorldBounds(path: COpaquePointer?, bounds: COpaquePointer?, matrix: COpaquePointer?, pen: COpaquePointer?): Status

public expect fun gdipGetPathWorldBoundsI(path: COpaquePointer?, bounds: COpaquePointer?, matrix: COpaquePointer?, pen: COpaquePointer?): Status

public expect fun gdipGetPenBrushFill(pen: COpaquePointer?, brush: COpaquePointer?): Status

public expect fun gdipGetPenColor(pen: COpaquePointer?, argb: COpaquePointer?): Status

public expect fun gdipGetPenCompoundArray(pen: COpaquePointer?, dash: COpaquePointer?, count: Int): Status

public expect fun gdipGetPenCompoundCount(pen: COpaquePointer?, count: COpaquePointer?): Status

public expect fun gdipGetPenCustomEndCap(pen: COpaquePointer?, customcap: COpaquePointer?): Status

public expect fun gdipGetPenCustomStartCap(pen: COpaquePointer?, customcap: COpaquePointer?): Status

public expect fun gdipGetPenDashArray(pen: COpaquePointer?, dash: COpaquePointer?, count: Int): Status

public expect fun gdipGetPenDashCap197819(pen: COpaquePointer?, dashcap: COpaquePointer?): Status

public expect fun gdipGetPenDashCount(pen: COpaquePointer?, count: COpaquePointer?): Status

public expect fun gdipGetPenDashOffset(pen: COpaquePointer?, offset: COpaquePointer?): Status

public expect fun gdipGetPenDashStyle(pen: COpaquePointer?, dashstyle: COpaquePointer?): Status

public expect fun gdipGetPenEndCap(pen: COpaquePointer?, endcap: COpaquePointer?): Status

public expect fun gdipGetPenFillType(pen: COpaquePointer?, type: COpaquePointer?): Status

public expect fun gdipGetPenLineJoin(pen: COpaquePointer?, linejoin: COpaquePointer?): Status

public expect fun gdipGetPenMiterLimit(pen: COpaquePointer?, miterlimit: COpaquePointer?): Status

public expect fun gdipGetPenMode(pen: COpaquePointer?, penmode: COpaquePointer?): Status

public expect fun gdipGetPenStartCap(pen: COpaquePointer?, startcap: COpaquePointer?): Status

public expect fun gdipGetPenTransform(pen: COpaquePointer?, matrix: COpaquePointer?): Status

public expect fun gdipGetPenUnit(pen: COpaquePointer?, unit: COpaquePointer?): Status

public expect fun gdipGetPenWidth(pen: COpaquePointer?, width: COpaquePointer?): Status

public expect fun gdipGetPixelOffsetMode(graphics: COpaquePointer?, pixeloffsetmode: COpaquePointer?): Status

public expect fun gdipGetPointCount(path: COpaquePointer?, count: COpaquePointer?): Status

public expect fun gdipGetPropertyCount(image: COpaquePointer?, numofproperty: COpaquePointer?): Status

public expect fun gdipGetPropertyIdList(image: COpaquePointer?, numofproperty: UInt, list: COpaquePointer?): Status

public expect fun gdipGetPropertyItem(image: COpaquePointer?, propid: UInt, propsize: UInt, buffer: COpaquePointer?): Status

public expect fun gdipGetPropertyItemSize(image: COpaquePointer?, propid: UInt, size: COpaquePointer?): Status

public expect fun gdipGetPropertySize(image: COpaquePointer?, totalbuffersize: COpaquePointer?, numproperties: COpaquePointer?): Status

public expect fun gdipGetRegionBounds(region: COpaquePointer?, graphics: COpaquePointer?, rect: COpaquePointer?): Status

public expect fun gdipGetRegionBoundsI(region: COpaquePointer?, graphics: COpaquePointer?, rect: COpaquePointer?): Status

public expect fun gdipGetRegionData(region: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt, sizefilled: COpaquePointer?): Status

public expect fun gdipGetRegionDataSize(region: COpaquePointer?, buffersize: COpaquePointer?): Status

public expect fun gdipGetRegionHRgn(region: COpaquePointer?, graphics: COpaquePointer?, hrgn: COpaquePointer?): Status

public expect fun gdipGetRegionScans(region: COpaquePointer?, rects: COpaquePointer?, count: COpaquePointer?, matrix: COpaquePointer?): Status

public expect fun gdipGetRegionScansCount(region: COpaquePointer?, count: COpaquePointer?, matrix: COpaquePointer?): Status

public expect fun gdipGetRegionScansI(region: COpaquePointer?, rects: COpaquePointer?, count: COpaquePointer?, matrix: COpaquePointer?): Status

public expect fun gdipGetRenderingOrigin(graphics: COpaquePointer?, x: COpaquePointer?, y: COpaquePointer?): Status

public expect fun gdipGetSmoothingMode(graphics: COpaquePointer?, smoothingmode: COpaquePointer?): Status

public expect fun gdipGetSolidFillColor(brush: COpaquePointer?, color: COpaquePointer?): Status

public expect fun gdipGetStringFormatAlign(format: COpaquePointer?, align: COpaquePointer?): Status

public expect fun gdipGetStringFormatDigitSubstitution(format: COpaquePointer?, language: COpaquePointer?, substitute: COpaquePointer?): Status

public expect fun gdipGetStringFormatFlags(format: COpaquePointer?, flags: COpaquePointer?): Status

public expect fun gdipGetStringFormatHotkeyPrefix(format: COpaquePointer?, hotkeyprefix: COpaquePointer?): Status

public expect fun gdipGetStringFormatLineAlign(format: COpaquePointer?, align: COpaquePointer?): Status

public expect fun gdipGetStringFormatMeasurableCharacterRangeCount(format: COpaquePointer?, count: COpaquePointer?): Status

public expect fun gdipGetStringFormatTabStopCount(format: COpaquePointer?, count: COpaquePointer?): Status

public expect fun gdipGetStringFormatTabStops(format: COpaquePointer?, count: Int, firsttaboffset: COpaquePointer?, tabstops: COpaquePointer?): Status

public expect fun gdipGetStringFormatTrimming(format: COpaquePointer?, trimming: COpaquePointer?): Status

public expect fun gdipGetTextContrast(graphics: COpaquePointer?, contrast: COpaquePointer?): Status

public expect fun gdipGetTextRenderingHint(graphics: COpaquePointer?, mode: COpaquePointer?): Status

public expect fun gdipGetTextureImage(brush: COpaquePointer?, image: COpaquePointer?): Status

public expect fun gdipGetTextureTransform(brush: COpaquePointer?, matrix: COpaquePointer?): Status

public expect fun gdipGetTextureWrapMode(brush: COpaquePointer?, wrapmode: COpaquePointer?): Status

public expect fun gdipGetVisibleClipBounds(graphics: COpaquePointer?, rect: COpaquePointer?): Status

public expect fun gdipGetVisibleClipBoundsI(graphics: COpaquePointer?, rect: COpaquePointer?): Status

public expect fun gdipGetWorldTransform(graphics: COpaquePointer?, matrix: COpaquePointer?): Status

public expect fun gdipGraphicsClear(graphics: COpaquePointer?, color: UInt): Status

public expect fun gdipGraphicsSetAbort(pgraphics: COpaquePointer?, piabort: COpaquePointer?): Status

public expect fun gdipImageForceValidation(image: COpaquePointer?): Status

public expect fun gdipImageGetFrameCount(image: COpaquePointer?, dimensionid: COpaquePointer?, count: COpaquePointer?): Status

public expect fun gdipImageGetFrameDimensionsCount(image: COpaquePointer?, count: COpaquePointer?): Status

public expect fun gdipImageGetFrameDimensionsList(image: COpaquePointer?, dimensionids: COpaquePointer?, count: UInt): Status

public expect fun gdipImageRotateFlip(image: COpaquePointer?, rftype: RotateFlipType): Status

public expect fun gdipImageSelectActiveFrame(image: COpaquePointer?, dimensionid: COpaquePointer?, frameindex: UInt): Status

public expect fun gdipImageSetAbort(pimage: COpaquePointer?, piabort: COpaquePointer?): Status

public expect fun gdipInitializePalette(palette: COpaquePointer?, palettetype: PaletteType, optimalcolors: Int, usetransparentcolor: Bool, bitmap: COpaquePointer?): Status

public expect fun gdipInvertMatrix(matrix: COpaquePointer?): Status

public expect fun gdipIsClipEmpty(graphics: COpaquePointer?, result: COpaquePointer?): Status

public expect fun gdipIsEmptyRegion(region: COpaquePointer?, graphics: COpaquePointer?, result: COpaquePointer?): Status

public expect fun gdipIsEqualRegion(region: COpaquePointer?, region2: COpaquePointer?, graphics: COpaquePointer?, result: COpaquePointer?): Status

public expect fun gdipIsInfiniteRegion(region: COpaquePointer?, graphics: COpaquePointer?, result: COpaquePointer?): Status

public expect fun gdipIsMatrixEqual(matrix: COpaquePointer?, matrix2: COpaquePointer?, result: COpaquePointer?): Status

public expect fun gdipIsMatrixIdentity(matrix: COpaquePointer?, result: COpaquePointer?): Status

public expect fun gdipIsMatrixInvertible(matrix: COpaquePointer?, result: COpaquePointer?): Status

public expect fun gdipIsOutlineVisiblePathPoint(path: COpaquePointer?, x: Float, y: Float, pen: COpaquePointer?, graphics: COpaquePointer?, result: COpaquePointer?): Status

public expect fun gdipIsOutlineVisiblePathPointI(path: COpaquePointer?, x: Int, y: Int, pen: COpaquePointer?, graphics: COpaquePointer?, result: COpaquePointer?): Status

public expect fun gdipIsStyleAvailable(family: COpaquePointer?, style: Int, isstyleavailable: COpaquePointer?): Status

public expect fun gdipIsVisibleClipEmpty(graphics: COpaquePointer?, result: COpaquePointer?): Status

public expect fun gdipIsVisiblePathPoint(path: COpaquePointer?, x: Float, y: Float, graphics: COpaquePointer?, result: COpaquePointer?): Status

public expect fun gdipIsVisiblePathPointI(path: COpaquePointer?, x: Int, y: Int, graphics: COpaquePointer?, result: COpaquePointer?): Status

public expect fun gdipIsVisiblePoint(graphics: COpaquePointer?, x: Float, y: Float, result: COpaquePointer?): Status

public expect fun gdipIsVisiblePointI(graphics: COpaquePointer?, x: Int, y: Int, result: COpaquePointer?): Status

public expect fun gdipIsVisibleRect(graphics: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, result: COpaquePointer?): Status

public expect fun gdipIsVisibleRectI(graphics: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, result: COpaquePointer?): Status

public expect fun gdipIsVisibleRegionPoint(region: COpaquePointer?, x: Float, y: Float, graphics: COpaquePointer?, result: COpaquePointer?): Status

public expect fun gdipIsVisibleRegionPointI(region: COpaquePointer?, x: Int, y: Int, graphics: COpaquePointer?, result: COpaquePointer?): Status

public expect fun gdipIsVisibleRegionRect(region: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, graphics: COpaquePointer?, result: COpaquePointer?): Status

public expect fun gdipIsVisibleRegionRectI(region: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, graphics: COpaquePointer?, result: COpaquePointer?): Status

public expect fun gdipLoadImageFromFile(filename: Pcwstr, image: COpaquePointer?): Status

public expect fun gdipLoadImageFromFileICM(filename: Pcwstr, image: COpaquePointer?): Status

public expect fun gdipLoadImageFromStream(stream: COpaquePointer?, image: COpaquePointer?): Status

public expect fun gdipLoadImageFromStreamICM(stream: COpaquePointer?, image: COpaquePointer?): Status

public expect fun gdipMeasureCharacterRanges(graphics: COpaquePointer?, string: Pcwstr, length: Int, font: COpaquePointer?, layoutrect: COpaquePointer?, stringformat: COpaquePointer?, regioncount: Int, regions: COpaquePointer?): Status

public expect fun gdipMeasureDriverString(graphics: COpaquePointer?, text: COpaquePointer?, length: Int, font: COpaquePointer?, positions: COpaquePointer?, flags: Int, matrix: COpaquePointer?, boundingbox: COpaquePointer?): Status

public expect fun gdipMeasureString(graphics: COpaquePointer?, string: Pcwstr, length: Int, font: COpaquePointer?, layoutrect: COpaquePointer?, stringformat: COpaquePointer?, boundingbox: COpaquePointer?, codepointsfitted: COpaquePointer?, linesfilled: COpaquePointer?): Status

public expect fun gdipMultiplyLineTransform(brush: COpaquePointer?, matrix: COpaquePointer?, order: MatrixOrder): Status

public expect fun gdipMultiplyMatrix(matrix: COpaquePointer?, matrix2: COpaquePointer?, order: MatrixOrder): Status

public expect fun gdipMultiplyPathGradientTransform(brush: COpaquePointer?, matrix: COpaquePointer?, order: MatrixOrder): Status

public expect fun gdipMultiplyPenTransform(pen: COpaquePointer?, matrix: COpaquePointer?, order: MatrixOrder): Status

public expect fun gdipMultiplyTextureTransform(brush: COpaquePointer?, matrix: COpaquePointer?, order: MatrixOrder): Status

public expect fun gdipMultiplyWorldTransform(graphics: COpaquePointer?, matrix: COpaquePointer?, order: MatrixOrder): Status

public expect fun gdipNewInstalledFontCollection(fontcollection: COpaquePointer?): Status

public expect fun gdipNewPrivateFontCollection(fontcollection: COpaquePointer?): Status

public expect fun gdipPathIterCopyData(iterator: COpaquePointer?, resultcount: COpaquePointer?, points: COpaquePointer?, types: COpaquePointer?, startindex: Int, endindex: Int): Status

public expect fun gdipPathIterEnumerate(iterator: COpaquePointer?, resultcount: COpaquePointer?, points: COpaquePointer?, types: COpaquePointer?, count: Int): Status

public expect fun gdipPathIterGetCount(iterator: COpaquePointer?, count: COpaquePointer?): Status

public expect fun gdipPathIterGetSubpathCount(iterator: COpaquePointer?, count: COpaquePointer?): Status

public expect fun gdipPathIterHasCurve(iterator: COpaquePointer?, hascurve: COpaquePointer?): Status

public expect fun gdipPathIterIsValid(iterator: COpaquePointer?, valid: COpaquePointer?): Status

public expect fun gdipPathIterNextMarker(iterator: COpaquePointer?, resultcount: COpaquePointer?, startindex: COpaquePointer?, endindex: COpaquePointer?): Status

public expect fun gdipPathIterNextMarkerPath(iterator: COpaquePointer?, resultcount: COpaquePointer?, path: COpaquePointer?): Status

public expect fun gdipPathIterNextPathType(iterator: COpaquePointer?, resultcount: COpaquePointer?, pathtype: COpaquePointer?, startindex: COpaquePointer?, endindex: COpaquePointer?): Status

public expect fun gdipPathIterNextSubpath(iterator: COpaquePointer?, resultcount: COpaquePointer?, startindex: COpaquePointer?, endindex: COpaquePointer?, isclosed: COpaquePointer?): Status

public expect fun gdipPathIterNextSubpathPath(iterator: COpaquePointer?, resultcount: COpaquePointer?, path: COpaquePointer?, isclosed: COpaquePointer?): Status

public expect fun gdipPathIterRewind(iterator: COpaquePointer?): Status

public expect fun gdipPlayMetafileRecord(metafile: COpaquePointer?, recordtype: EmfPlusRecordType, flags: UInt, datasize: UInt, data: COpaquePointer?): Status

public expect fun gdipPrivateAddFontFile(fontcollection: COpaquePointer?, filename: Pcwstr): Status

public expect fun gdipPrivateAddMemoryFont(fontcollection: COpaquePointer?, memory: COpaquePointer?, length: Int): Status

public expect fun gdipRecordMetafile(referencehdc: Hdc, type: EmfType, framerect: COpaquePointer?, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: COpaquePointer?): Status

public expect fun gdipRecordMetafileFileName(filename: Pcwstr, referencehdc: Hdc, type: EmfType, framerect: COpaquePointer?, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: COpaquePointer?): Status

public expect fun gdipRecordMetafileFileNameI(filename: Pcwstr, referencehdc: Hdc, type: EmfType, framerect: COpaquePointer?, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: COpaquePointer?): Status

public expect fun gdipRecordMetafileI(referencehdc: Hdc, type: EmfType, framerect: COpaquePointer?, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: COpaquePointer?): Status

public expect fun gdipRecordMetafileStream(stream: COpaquePointer?, referencehdc: Hdc, type: EmfType, framerect: COpaquePointer?, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: COpaquePointer?): Status

public expect fun gdipRecordMetafileStreamI(stream: COpaquePointer?, referencehdc: Hdc, type: EmfType, framerect: COpaquePointer?, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: COpaquePointer?): Status

public expect fun gdipReleaseDC(graphics: COpaquePointer?, hdc: Hdc): Status

public expect fun gdipRemovePropertyItem(image: COpaquePointer?, propid: UInt): Status

public expect fun gdipResetClip(graphics: COpaquePointer?): Status

public expect fun gdipResetImageAttributes(imageattr: COpaquePointer?, type: ColorAdjustType): Status

public expect fun gdipResetLineTransform(brush: COpaquePointer?): Status

public expect fun gdipResetPageTransform(graphics: COpaquePointer?): Status

public expect fun gdipResetPath(path: COpaquePointer?): Status

public expect fun gdipResetPathGradientTransform(brush: COpaquePointer?): Status

public expect fun gdipResetPenTransform(pen: COpaquePointer?): Status

public expect fun gdipResetTextureTransform(brush: COpaquePointer?): Status

public expect fun gdipResetWorldTransform(graphics: COpaquePointer?): Status

public expect fun gdipRestoreGraphics(graphics: COpaquePointer?, state: UInt): Status

public expect fun gdipReversePath(path: COpaquePointer?): Status

public expect fun gdipRotateLineTransform(brush: COpaquePointer?, angle: Float, order: MatrixOrder): Status

public expect fun gdipRotateMatrix(matrix: COpaquePointer?, angle: Float, order: MatrixOrder): Status

public expect fun gdipRotatePathGradientTransform(brush: COpaquePointer?, angle: Float, order: MatrixOrder): Status

public expect fun gdipRotatePenTransform(pen: COpaquePointer?, angle: Float, order: MatrixOrder): Status

public expect fun gdipRotateTextureTransform(brush: COpaquePointer?, angle: Float, order: MatrixOrder): Status

public expect fun gdipRotateWorldTransform(graphics: COpaquePointer?, angle: Float, order: MatrixOrder): Status

public expect fun gdipSaveAdd(image: COpaquePointer?, encoderparams: COpaquePointer?): Status

public expect fun gdipSaveAddImage(image: COpaquePointer?, newimage: COpaquePointer?, encoderparams: COpaquePointer?): Status

public expect fun gdipSaveGraphics(graphics: COpaquePointer?, state: COpaquePointer?): Status

public expect fun gdipSaveImageToFile(image: COpaquePointer?, filename: Pcwstr, clsidencoder: COpaquePointer?, encoderparams: COpaquePointer?): Status

public expect fun gdipSaveImageToStream(image: COpaquePointer?, stream: COpaquePointer?, clsidencoder: COpaquePointer?, encoderparams: COpaquePointer?): Status

public expect fun gdipScaleLineTransform(brush: COpaquePointer?, sx: Float, sy: Float, order: MatrixOrder): Status

public expect fun gdipScaleMatrix(matrix: COpaquePointer?, scalex: Float, scaley: Float, order: MatrixOrder): Status

public expect fun gdipScalePathGradientTransform(brush: COpaquePointer?, sx: Float, sy: Float, order: MatrixOrder): Status

public expect fun gdipScalePenTransform(pen: COpaquePointer?, sx: Float, sy: Float, order: MatrixOrder): Status
