package io.github.kotlinmania.windowssys.windows.win32.graphics.gdiplus

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Bitmapinfo
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Henhmetafile
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hmetafile
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hrgn
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Logfonta
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Logfontw
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.Hicon

public expect fun gdipAddPathArc(path: MutPtr<GpPath>, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status

public expect fun gdipAddPathArcI(path: MutPtr<GpPath>, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status

public expect fun gdipAddPathBezier(path: MutPtr<GpPath>, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status

public expect fun gdipAddPathBezierI(path: MutPtr<GpPath>, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status

public expect fun gdipAddPathBeziers(path: MutPtr<GpPath>, points: ConstPtr<PointF>, count: Int): Status

public expect fun gdipAddPathBeziersI(path: MutPtr<GpPath>, points: ConstPtr<Point>, count: Int): Status

public expect fun gdipAddPathClosedCurve(path: MutPtr<GpPath>, points: ConstPtr<PointF>, count: Int): Status

public expect fun gdipAddPathClosedCurve2(path: MutPtr<GpPath>, points: ConstPtr<PointF>, count: Int, tension: Float): Status

public expect fun gdipAddPathClosedCurve2I(path: MutPtr<GpPath>, points: ConstPtr<Point>, count: Int, tension: Float): Status

public expect fun gdipAddPathClosedCurveI(path: MutPtr<GpPath>, points: ConstPtr<Point>, count: Int): Status

public expect fun gdipAddPathCurve(path: MutPtr<GpPath>, points: ConstPtr<PointF>, count: Int): Status

public expect fun gdipAddPathCurve2(path: MutPtr<GpPath>, points: ConstPtr<PointF>, count: Int, tension: Float): Status

public expect fun gdipAddPathCurve2I(path: MutPtr<GpPath>, points: ConstPtr<Point>, count: Int, tension: Float): Status

public expect fun gdipAddPathCurve3(path: MutPtr<GpPath>, points: ConstPtr<PointF>, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status

public expect fun gdipAddPathCurve3I(path: MutPtr<GpPath>, points: ConstPtr<Point>, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status

public expect fun gdipAddPathCurveI(path: MutPtr<GpPath>, points: ConstPtr<Point>, count: Int): Status

public expect fun gdipAddPathEllipse(path: MutPtr<GpPath>, x: Float, y: Float, width: Float, height: Float): Status

public expect fun gdipAddPathEllipseI(path: MutPtr<GpPath>, x: Int, y: Int, width: Int, height: Int): Status

public expect fun gdipAddPathLine(path: MutPtr<GpPath>, x1: Float, y1: Float, x2: Float, y2: Float): Status

public expect fun gdipAddPathLine2(path: MutPtr<GpPath>, points: ConstPtr<PointF>, count: Int): Status

public expect fun gdipAddPathLine2I(path: MutPtr<GpPath>, points: ConstPtr<Point>, count: Int): Status

public expect fun gdipAddPathLineI(path: MutPtr<GpPath>, x1: Int, y1: Int, x2: Int, y2: Int): Status

public expect fun gdipAddPathPath(path: MutPtr<GpPath>, addingpath: ConstPtr<GpPath>, connect: Bool): Status

public expect fun gdipAddPathPie(path: MutPtr<GpPath>, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status

public expect fun gdipAddPathPieI(path: MutPtr<GpPath>, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status

public expect fun gdipAddPathPolygon(path: MutPtr<GpPath>, points: ConstPtr<PointF>, count: Int): Status

public expect fun gdipAddPathPolygonI(path: MutPtr<GpPath>, points: ConstPtr<Point>, count: Int): Status

public expect fun gdipAddPathRectangle(path: MutPtr<GpPath>, x: Float, y: Float, width: Float, height: Float): Status

public expect fun gdipAddPathRectangleI(path: MutPtr<GpPath>, x: Int, y: Int, width: Int, height: Int): Status

public expect fun gdipAddPathRectangles(path: MutPtr<GpPath>, rects: ConstPtr<RectF>, count: Int): Status

public expect fun gdipAddPathRectanglesI(path: MutPtr<GpPath>, rects: ConstPtr<Rect>, count: Int): Status

public expect fun gdipAddPathString(path: MutPtr<GpPath>, string: Pcwstr, length: Int, family: ConstPtr<GpFontFamily>, style: Int, emsize: Float, layoutrect: ConstPtr<RectF>, format: ConstPtr<GpStringFormat>): Status

public expect fun gdipAddPathStringI(path: MutPtr<GpPath>, string: Pcwstr, length: Int, family: ConstPtr<GpFontFamily>, style: Int, emsize: Float, layoutrect: ConstPtr<Rect>, format: ConstPtr<GpStringFormat>): Status

public expect fun gdipAlloc(size: ULong): MutPtr<CVoid>

public expect fun gdipBeginContainer(graphics: MutPtr<GpGraphics>, dstrect: ConstPtr<RectF>, srcrect: ConstPtr<RectF>, unit: Unit, state: MutPtr<UInt>): Status

public expect fun gdipBeginContainer2(graphics: MutPtr<GpGraphics>, state: MutPtr<UInt>): Status

public expect fun gdipBeginContainerI(graphics: MutPtr<GpGraphics>, dstrect: ConstPtr<Rect>, srcrect: ConstPtr<Rect>, unit: Unit, state: MutPtr<UInt>): Status

public expect fun gdipBitmapApplyEffect(bitmap: MutPtr<GpBitmap>, effect: MutPtr<CGpEffect>, roi: MutPtr<io.github.kotlinmania.windowssys.windows.win32.foundation.Rect>, useauxdata: Bool, auxdata: MutPtr<MutPtr<CVoid>>, auxdatasize: MutPtr<Int>): Status

public expect fun gdipBitmapConvertFormat(pinputbitmap: MutPtr<GpBitmap>, format: Int, dithertype: DitherType, palettetype: PaletteType, palette: MutPtr<ColorPalette>, alphathresholdpercent: Float): Status

public expect fun gdipBitmapCreateApplyEffect(inputbitmaps: MutPtr<MutPtr<GpBitmap>>, numinputs: Int, effect: MutPtr<CGpEffect>, roi: MutPtr<io.github.kotlinmania.windowssys.windows.win32.foundation.Rect>, outputrect: MutPtr<io.github.kotlinmania.windowssys.windows.win32.foundation.Rect>, outputbitmap: MutPtr<MutPtr<GpBitmap>>, useauxdata: Bool, auxdata: MutPtr<MutPtr<CVoid>>, auxdatasize: MutPtr<Int>): Status

public expect fun gdipBitmapGetHistogram(bitmap: MutPtr<GpBitmap>, format: HistogramFormat, numberofentries: UInt, channel0: MutPtr<UInt>, channel1: MutPtr<UInt>, channel2: MutPtr<UInt>, channel3: MutPtr<UInt>): Status

public expect fun gdipBitmapGetHistogramSize(format: HistogramFormat, numberofentries: MutPtr<UInt>): Status

public expect fun gdipBitmapGetPixel(bitmap: MutPtr<GpBitmap>, x: Int, y: Int, color: MutPtr<UInt>): Status

public expect fun gdipBitmapLockBits(bitmap: MutPtr<GpBitmap>, rect: ConstPtr<Rect>, flags: UInt, format: Int, lockedbitmapdata: MutPtr<BitmapData>): Status

public expect fun gdipBitmapSetPixel(bitmap: MutPtr<GpBitmap>, x: Int, y: Int, color: UInt): Status

public expect fun gdipBitmapSetResolution(bitmap: MutPtr<GpBitmap>, xdpi: Float, ydpi: Float): Status

public expect fun gdipBitmapUnlockBits(bitmap: MutPtr<GpBitmap>, lockedbitmapdata: MutPtr<BitmapData>): Status

public expect fun gdipClearPathMarkers(path: MutPtr<GpPath>): Status

public expect fun gdipCloneBitmapArea(x: Float, y: Float, width: Float, height: Float, format: Int, srcbitmap: MutPtr<GpBitmap>, dstbitmap: MutPtr<MutPtr<GpBitmap>>): Status

public expect fun gdipCloneBitmapAreaI(x: Int, y: Int, width: Int, height: Int, format: Int, srcbitmap: MutPtr<GpBitmap>, dstbitmap: MutPtr<MutPtr<GpBitmap>>): Status

public expect fun gdipCloneBrush(brush: MutPtr<GpBrush>, clonebrush: MutPtr<MutPtr<GpBrush>>): Status

public expect fun gdipCloneCustomLineCap(customcap: MutPtr<GpCustomLineCap>, clonedcap: MutPtr<MutPtr<GpCustomLineCap>>): Status

public expect fun gdipCloneFont(font: MutPtr<GpFont>, clonefont: MutPtr<MutPtr<GpFont>>): Status

public expect fun gdipCloneFontFamily(fontfamily: MutPtr<GpFontFamily>, clonedfontfamily: MutPtr<MutPtr<GpFontFamily>>): Status

public expect fun gdipCloneImage(image: MutPtr<GpImage>, cloneimage: MutPtr<MutPtr<GpImage>>): Status

public expect fun gdipCloneImageAttributes(imageattr: ConstPtr<GpImageAttributes>, cloneimageattr: MutPtr<MutPtr<GpImageAttributes>>): Status

public expect fun gdipCloneMatrix(matrix: MutPtr<Matrix>, clonematrix: MutPtr<MutPtr<Matrix>>): Status

public expect fun gdipClonePath(path: MutPtr<GpPath>, clonepath: MutPtr<MutPtr<GpPath>>): Status

public expect fun gdipClonePen(pen: MutPtr<GpPen>, clonepen: MutPtr<MutPtr<GpPen>>): Status

public expect fun gdipCloneRegion(region: MutPtr<GpRegion>, cloneregion: MutPtr<MutPtr<GpRegion>>): Status

public expect fun gdipCloneStringFormat(format: ConstPtr<GpStringFormat>, newformat: MutPtr<MutPtr<GpStringFormat>>): Status

public expect fun gdipClosePathFigure(path: MutPtr<GpPath>): Status

public expect fun gdipClosePathFigures(path: MutPtr<GpPath>): Status

public expect fun gdipCombineRegionPath(region: MutPtr<GpRegion>, path: MutPtr<GpPath>, combinemode: CombineMode): Status

public expect fun gdipCombineRegionRect(region: MutPtr<GpRegion>, rect: ConstPtr<RectF>, combinemode: CombineMode): Status

public expect fun gdipCombineRegionRectI(region: MutPtr<GpRegion>, rect: ConstPtr<Rect>, combinemode: CombineMode): Status

public expect fun gdipCombineRegionRegion(region: MutPtr<GpRegion>, region2: MutPtr<GpRegion>, combinemode: CombineMode): Status

public expect fun gdipComment(graphics: MutPtr<GpGraphics>, sizedata: UInt, data: ConstPtr<UByte>): Status

public expect fun gdipConvertToEmfPlus(refgraphics: ConstPtr<GpGraphics>, metafile: MutPtr<GpMetafile>, conversionfailureflag: MutPtr<Int>, emftype: EmfType, description: Pcwstr, outMetafile: MutPtr<MutPtr<GpMetafile>>): Status

public expect fun gdipConvertToEmfPlusToFile(refgraphics: ConstPtr<GpGraphics>, metafile: MutPtr<GpMetafile>, conversionfailureflag: MutPtr<Int>, filename: Pcwstr, emftype: EmfType, description: Pcwstr, outMetafile: MutPtr<MutPtr<GpMetafile>>): Status

public expect fun gdipConvertToEmfPlusToStream(refgraphics: ConstPtr<GpGraphics>, metafile: MutPtr<GpMetafile>, conversionfailureflag: MutPtr<Int>, stream: MutPtr<CVoid>, emftype: EmfType, description: Pcwstr, outMetafile: MutPtr<MutPtr<GpMetafile>>): Status

public expect fun gdipCreateAdjustableArrowCap(height: Float, width: Float, isfilled: Bool, cap: MutPtr<MutPtr<GpAdjustableArrowCap>>): Status

public expect fun gdipCreateBitmapFromFile(filename: Pcwstr, bitmap: MutPtr<MutPtr<GpBitmap>>): Status

public expect fun gdipCreateBitmapFromFileICM(filename: Pcwstr, bitmap: MutPtr<MutPtr<GpBitmap>>): Status

public expect fun gdipCreateBitmapFromGdiDib(gdibitmapinfo: ConstPtr<Bitmapinfo>, gdibitmapdata: MutPtr<CVoid>, bitmap: MutPtr<MutPtr<GpBitmap>>): Status

public expect fun gdipCreateBitmapFromGraphics(width: Int, height: Int, target: MutPtr<GpGraphics>, bitmap: MutPtr<MutPtr<GpBitmap>>): Status

public expect fun gdipCreateBitmapFromHBITMAP(hbm: Hbitmap, hpal: Hpalette, bitmap: MutPtr<MutPtr<GpBitmap>>): Status

public expect fun gdipCreateBitmapFromHICON(hicon: Hicon, bitmap: MutPtr<MutPtr<GpBitmap>>): Status

public expect fun gdipCreateBitmapFromResource(hinstance: Hinstance, lpbitmapname: Pcwstr, bitmap: MutPtr<MutPtr<GpBitmap>>): Status

public expect fun gdipCreateBitmapFromScan0(width: Int, height: Int, stride: Int, format: Int, scan0: ConstPtr<UByte>, bitmap: MutPtr<MutPtr<GpBitmap>>): Status

public expect fun gdipCreateBitmapFromStream(stream: MutPtr<CVoid>, bitmap: MutPtr<MutPtr<GpBitmap>>): Status

public expect fun gdipCreateBitmapFromStreamICM(stream: MutPtr<CVoid>, bitmap: MutPtr<MutPtr<GpBitmap>>): Status

public expect fun gdipCreateCachedBitmap(bitmap: MutPtr<GpBitmap>, graphics: MutPtr<GpGraphics>, cachedbitmap: MutPtr<MutPtr<GpCachedBitmap>>): Status

public expect fun gdipCreateCustomLineCap(fillpath: MutPtr<GpPath>, strokepath: MutPtr<GpPath>, basecap: LineCap, baseinset: Float, customcap: MutPtr<MutPtr<GpCustomLineCap>>): Status

public expect fun gdipCreateEffect(guid: Guid, effect: MutPtr<MutPtr<CGpEffect>>): Status

public expect fun gdipCreateFont(fontfamily: ConstPtr<GpFontFamily>, emsize: Float, style: Int, unit: Unit, font: MutPtr<MutPtr<GpFont>>): Status

public expect fun gdipCreateFontFamilyFromName(name: Pcwstr, fontcollection: MutPtr<GpFontCollection>, fontfamily: MutPtr<MutPtr<GpFontFamily>>): Status

public expect fun gdipCreateFontFromDC(hdc: Hdc, font: MutPtr<MutPtr<GpFont>>): Status

public expect fun gdipCreateFontFromLogfontA(hdc: Hdc, logfont: ConstPtr<Logfonta>, font: MutPtr<MutPtr<GpFont>>): Status

public expect fun gdipCreateFontFromLogfontW(hdc: Hdc, logfont: ConstPtr<Logfontw>, font: MutPtr<MutPtr<GpFont>>): Status

public expect fun gdipCreateFromHDC(hdc: Hdc, graphics: MutPtr<MutPtr<GpGraphics>>): Status

public expect fun gdipCreateFromHDC2(hdc: Hdc, hdevice: Handle, graphics: MutPtr<MutPtr<GpGraphics>>): Status

public expect fun gdipCreateFromHWND(hwnd: Hwnd, graphics: MutPtr<MutPtr<GpGraphics>>): Status

public expect fun gdipCreateFromHWNDICM(hwnd: Hwnd, graphics: MutPtr<MutPtr<GpGraphics>>): Status

public expect fun gdipCreateHBITMAPFromBitmap(bitmap: MutPtr<GpBitmap>, hbmreturn: MutPtr<Hbitmap>, background: UInt): Status

public expect fun gdipCreateHICONFromBitmap(bitmap: MutPtr<GpBitmap>, hbmreturn: MutPtr<Hicon>): Status

public expect fun gdipCreateHalftonePalette(): Hpalette

public expect fun gdipCreateHatchBrush(hatchstyle: HatchStyle, forecol: UInt, backcol: UInt, brush: MutPtr<MutPtr<GpHatch>>): Status

public expect fun gdipCreateImageAttributes(imageattr: MutPtr<MutPtr<GpImageAttributes>>): Status

public expect fun gdipCreateLineBrush(point1: ConstPtr<PointF>, point2: ConstPtr<PointF>, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: MutPtr<MutPtr<GpLineGradient>>): Status

public expect fun gdipCreateLineBrushFromRect(rect: ConstPtr<RectF>, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: MutPtr<MutPtr<GpLineGradient>>): Status

public expect fun gdipCreateLineBrushFromRectI(rect: ConstPtr<Rect>, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: MutPtr<MutPtr<GpLineGradient>>): Status

public expect fun gdipCreateLineBrushFromRectWithAngle(rect: ConstPtr<RectF>, color1: UInt, color2: UInt, angle: Float, isanglescalable: Bool, wrapmode: WrapMode, linegradient: MutPtr<MutPtr<GpLineGradient>>): Status

public expect fun gdipCreateLineBrushFromRectWithAngleI(rect: ConstPtr<Rect>, color1: UInt, color2: UInt, angle: Float, isanglescalable: Bool, wrapmode: WrapMode, linegradient: MutPtr<MutPtr<GpLineGradient>>): Status

public expect fun gdipCreateLineBrushI(point1: ConstPtr<Point>, point2: ConstPtr<Point>, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: MutPtr<MutPtr<GpLineGradient>>): Status

public expect fun gdipCreateMatrix(matrix: MutPtr<MutPtr<Matrix>>): Status

public expect fun gdipCreateMatrix2(m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float, matrix: MutPtr<MutPtr<Matrix>>): Status

public expect fun gdipCreateMatrix3(rect: ConstPtr<RectF>, dstplg: ConstPtr<PointF>, matrix: MutPtr<MutPtr<Matrix>>): Status

public expect fun gdipCreateMatrix3I(rect: ConstPtr<Rect>, dstplg: ConstPtr<Point>, matrix: MutPtr<MutPtr<Matrix>>): Status

public expect fun gdipCreateMetafileFromEmf(hemf: Henhmetafile, deleteemf: Bool, metafile: MutPtr<MutPtr<GpMetafile>>): Status

public expect fun gdipCreateMetafileFromFile(file: Pcwstr, metafile: MutPtr<MutPtr<GpMetafile>>): Status

public expect fun gdipCreateMetafileFromStream(stream: MutPtr<CVoid>, metafile: MutPtr<MutPtr<GpMetafile>>): Status

public expect fun gdipCreateMetafileFromWmf(hwmf: Hmetafile, deletewmf: Bool, wmfplaceablefileheader: ConstPtr<WmfPlaceableFileHeader>, metafile: MutPtr<MutPtr<GpMetafile>>): Status

public expect fun gdipCreateMetafileFromWmfFile(file: Pcwstr, wmfplaceablefileheader: ConstPtr<WmfPlaceableFileHeader>, metafile: MutPtr<MutPtr<GpMetafile>>): Status

public expect fun gdipCreatePath(brushmode: FillMode, path: MutPtr<MutPtr<GpPath>>): Status

public expect fun gdipCreatePath2(param0: ConstPtr<PointF>, param1: ConstPtr<UByte>, param2: Int, param3: FillMode, path: MutPtr<MutPtr<GpPath>>): Status

public expect fun gdipCreatePath2I(param0: ConstPtr<Point>, param1: ConstPtr<UByte>, param2: Int, param3: FillMode, path: MutPtr<MutPtr<GpPath>>): Status

public expect fun gdipCreatePathGradient(points: ConstPtr<PointF>, count: Int, wrapmode: WrapMode, polygradient: MutPtr<MutPtr<GpPathGradient>>): Status

public expect fun gdipCreatePathGradientFromPath(path: ConstPtr<GpPath>, polygradient: MutPtr<MutPtr<GpPathGradient>>): Status

public expect fun gdipCreatePathGradientI(points: ConstPtr<Point>, count: Int, wrapmode: WrapMode, polygradient: MutPtr<MutPtr<GpPathGradient>>): Status

public expect fun gdipCreatePathIter(iterator: MutPtr<MutPtr<GpPathIterator>>, path: MutPtr<GpPath>): Status

public expect fun gdipCreatePen1(color: UInt, width: Float, unit: Unit, pen: MutPtr<MutPtr<GpPen>>): Status

public expect fun gdipCreatePen2(brush: MutPtr<GpBrush>, width: Float, unit: Unit, pen: MutPtr<MutPtr<GpPen>>): Status

public expect fun gdipCreateRegion(region: MutPtr<MutPtr<GpRegion>>): Status

public expect fun gdipCreateRegionHrgn(hrgn: Hrgn, region: MutPtr<MutPtr<GpRegion>>): Status

public expect fun gdipCreateRegionPath(path: MutPtr<GpPath>, region: MutPtr<MutPtr<GpRegion>>): Status

public expect fun gdipCreateRegionRect(rect: ConstPtr<RectF>, region: MutPtr<MutPtr<GpRegion>>): Status

public expect fun gdipCreateRegionRectI(rect: ConstPtr<Rect>, region: MutPtr<MutPtr<GpRegion>>): Status

public expect fun gdipCreateRegionRgnData(regiondata: ConstPtr<UByte>, size: Int, region: MutPtr<MutPtr<GpRegion>>): Status

public expect fun gdipCreateSolidFill(color: UInt, brush: MutPtr<MutPtr<GpSolidFill>>): Status

public expect fun gdipCreateStreamOnFile(filename: Pcwstr, access: UInt, stream: MutPtr<MutPtr<CVoid>>): Status

public expect fun gdipCreateStringFormat(formatattributes: Int, language: UShort, format: MutPtr<MutPtr<GpStringFormat>>): Status

public expect fun gdipCreateTexture(image: MutPtr<GpImage>, wrapmode: WrapMode, texture: MutPtr<MutPtr<GpTexture>>): Status

public expect fun gdipCreateTexture2(image: MutPtr<GpImage>, wrapmode: WrapMode, x: Float, y: Float, width: Float, height: Float, texture: MutPtr<MutPtr<GpTexture>>): Status

public expect fun gdipCreateTexture2I(image: MutPtr<GpImage>, wrapmode: WrapMode, x: Int, y: Int, width: Int, height: Int, texture: MutPtr<MutPtr<GpTexture>>): Status

public expect fun gdipCreateTextureIA(image: MutPtr<GpImage>, imageattributes: ConstPtr<GpImageAttributes>, x: Float, y: Float, width: Float, height: Float, texture: MutPtr<MutPtr<GpTexture>>): Status

public expect fun gdipCreateTextureIAI(image: MutPtr<GpImage>, imageattributes: ConstPtr<GpImageAttributes>, x: Int, y: Int, width: Int, height: Int, texture: MutPtr<MutPtr<GpTexture>>): Status

public expect fun gdipDeleteBrush(brush: MutPtr<GpBrush>): Status

public expect fun gdipDeleteCachedBitmap(cachedbitmap: MutPtr<GpCachedBitmap>): Status

public expect fun gdipDeleteCustomLineCap(customcap: MutPtr<GpCustomLineCap>): Status

public expect fun gdipDeleteEffect(effect: MutPtr<CGpEffect>): Status

public expect fun gdipDeleteFont(font: MutPtr<GpFont>): Status

public expect fun gdipDeleteFontFamily(fontfamily: MutPtr<GpFontFamily>): Status

public expect fun gdipDeleteGraphics(graphics: MutPtr<GpGraphics>): Status

public expect fun gdipDeleteMatrix(matrix: MutPtr<Matrix>): Status

public expect fun gdipDeletePath(path: MutPtr<GpPath>): Status

public expect fun gdipDeletePathIter(iterator: MutPtr<GpPathIterator>): Status

public expect fun gdipDeletePen(pen: MutPtr<GpPen>): Status

public expect fun gdipDeletePrivateFontCollection(fontcollection: MutPtr<MutPtr<GpFontCollection>>): Status

public expect fun gdipDeleteRegion(region: MutPtr<GpRegion>): Status

public expect fun gdipDeleteStringFormat(format: MutPtr<GpStringFormat>): Status

public expect fun gdipDisposeImage(image: MutPtr<GpImage>): Status

public expect fun gdipDisposeImageAttributes(imageattr: MutPtr<GpImageAttributes>): Status

public expect fun gdipDrawArc(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status

public expect fun gdipDrawArcI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status

public expect fun gdipDrawBezier(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status

public expect fun gdipDrawBezierI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status

public expect fun gdipDrawBeziers(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<PointF>, count: Int): Status

public expect fun gdipDrawBeziersI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<Point>, count: Int): Status

public expect fun gdipDrawCachedBitmap(graphics: MutPtr<GpGraphics>, cachedbitmap: MutPtr<GpCachedBitmap>, x: Int, y: Int): Status

public expect fun gdipDrawClosedCurve(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<PointF>, count: Int): Status

public expect fun gdipDrawClosedCurve2(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<PointF>, count: Int, tension: Float): Status

public expect fun gdipDrawClosedCurve2I(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<Point>, count: Int, tension: Float): Status

public expect fun gdipDrawClosedCurveI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<Point>, count: Int): Status

public expect fun gdipDrawCurve(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<PointF>, count: Int): Status

public expect fun gdipDrawCurve2(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<PointF>, count: Int, tension: Float): Status

public expect fun gdipDrawCurve2I(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<Point>, count: Int, tension: Float): Status

public expect fun gdipDrawCurve3(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<PointF>, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status

public expect fun gdipDrawCurve3I(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<Point>, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status

public expect fun gdipDrawCurveI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<Point>, count: Int): Status

public expect fun gdipDrawDriverString(graphics: MutPtr<GpGraphics>, text: ConstPtr<UShort>, length: Int, font: ConstPtr<GpFont>, brush: ConstPtr<GpBrush>, positions: ConstPtr<PointF>, flags: Int, matrix: ConstPtr<Matrix>): Status

public expect fun gdipDrawEllipse(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x: Float, y: Float, width: Float, height: Float): Status

public expect fun gdipDrawEllipseI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x: Int, y: Int, width: Int, height: Int): Status

public expect fun gdipDrawImage(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, x: Float, y: Float): Status

public expect fun gdipDrawImageFX(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, source: MutPtr<RectF>, xform: MutPtr<Matrix>, effect: MutPtr<CGpEffect>, imageattributes: MutPtr<GpImageAttributes>, srcunit: Unit): Status

public expect fun gdipDrawImageI(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, x: Int, y: Int): Status

public expect fun gdipDrawImagePointRect(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, x: Float, y: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit): Status

public expect fun gdipDrawImagePointRectI(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, x: Int, y: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit): Status

public expect fun gdipDrawImagePoints(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, dstpoints: ConstPtr<PointF>, count: Int): Status

public expect fun gdipDrawImagePointsI(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, dstpoints: ConstPtr<Point>, count: Int): Status

public expect fun gdipDrawImagePointsRect(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, points: ConstPtr<PointF>, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: ConstPtr<GpImageAttributes>, callback: Long, callbackdata: MutPtr<CVoid>): Status

public expect fun gdipDrawImagePointsRectI(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, points: ConstPtr<Point>, count: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: ConstPtr<GpImageAttributes>, callback: Long, callbackdata: MutPtr<CVoid>): Status

public expect fun gdipDrawImageRect(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, x: Float, y: Float, width: Float, height: Float): Status

public expect fun gdipDrawImageRectI(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, x: Int, y: Int, width: Int, height: Int): Status

public expect fun gdipDrawImageRectRect(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, dstx: Float, dsty: Float, dstwidth: Float, dstheight: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: ConstPtr<GpImageAttributes>, callback: Long, callbackdata: MutPtr<CVoid>): Status

public expect fun gdipDrawImageRectRectI(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, dstx: Int, dsty: Int, dstwidth: Int, dstheight: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: ConstPtr<GpImageAttributes>, callback: Long, callbackdata: MutPtr<CVoid>): Status

public expect fun gdipDrawLine(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x1: Float, y1: Float, x2: Float, y2: Float): Status

public expect fun gdipDrawLineI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x1: Int, y1: Int, x2: Int, y2: Int): Status

public expect fun gdipDrawLines(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<PointF>, count: Int): Status

public expect fun gdipDrawLinesI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<Point>, count: Int): Status

public expect fun gdipDrawPath(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, path: MutPtr<GpPath>): Status

public expect fun gdipDrawPie(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status

public expect fun gdipDrawPieI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status

public expect fun gdipDrawPolygon(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<PointF>, count: Int): Status

public expect fun gdipDrawPolygonI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<Point>, count: Int): Status

public expect fun gdipDrawRectangle(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x: Float, y: Float, width: Float, height: Float): Status

public expect fun gdipDrawRectangleI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x: Int, y: Int, width: Int, height: Int): Status

public expect fun gdipDrawRectangles(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, rects: ConstPtr<RectF>, count: Int): Status

public expect fun gdipDrawRectanglesI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, rects: ConstPtr<Rect>, count: Int): Status

public expect fun gdipDrawString(graphics: MutPtr<GpGraphics>, string: Pcwstr, length: Int, font: ConstPtr<GpFont>, layoutrect: ConstPtr<RectF>, stringformat: ConstPtr<GpStringFormat>, brush: ConstPtr<GpBrush>): Status

public expect fun gdipEmfToWmfBits(hemf: Henhmetafile, cbdata16: UInt, pdata16: MutPtr<UByte>, imapmode: Int, eflags: Int): UInt

public expect fun gdipEndContainer(graphics: MutPtr<GpGraphics>, state: UInt): Status

public expect fun gdipEnumerateMetafileDestPoint(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destpoint: ConstPtr<PointF>, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status

public expect fun gdipEnumerateMetafileDestPointI(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destpoint: ConstPtr<Point>, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status

public expect fun gdipEnumerateMetafileDestPoints(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destpoints: ConstPtr<PointF>, count: Int, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status

public expect fun gdipEnumerateMetafileDestPointsI(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destpoints: ConstPtr<Point>, count: Int, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status

public expect fun gdipEnumerateMetafileDestRect(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destrect: ConstPtr<RectF>, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status

public expect fun gdipEnumerateMetafileDestRectI(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destrect: ConstPtr<Rect>, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status

public expect fun gdipEnumerateMetafileSrcRectDestPoint(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destpoint: ConstPtr<PointF>, srcrect: ConstPtr<RectF>, srcunit: Unit, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status

public expect fun gdipEnumerateMetafileSrcRectDestPointI(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destpoint: ConstPtr<Point>, srcrect: ConstPtr<Rect>, srcunit: Unit, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status

public expect fun gdipEnumerateMetafileSrcRectDestPoints(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destpoints: ConstPtr<PointF>, count: Int, srcrect: ConstPtr<RectF>, srcunit: Unit, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status

public expect fun gdipEnumerateMetafileSrcRectDestPointsI(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destpoints: ConstPtr<Point>, count: Int, srcrect: ConstPtr<Rect>, srcunit: Unit, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status

public expect fun gdipEnumerateMetafileSrcRectDestRect(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destrect: ConstPtr<RectF>, srcrect: ConstPtr<RectF>, srcunit: Unit, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status

public expect fun gdipEnumerateMetafileSrcRectDestRectI(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destrect: ConstPtr<Rect>, srcrect: ConstPtr<Rect>, srcunit: Unit, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status

public expect fun gdipFillClosedCurve(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, points: ConstPtr<PointF>, count: Int): Status

public expect fun gdipFillClosedCurve2(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, points: ConstPtr<PointF>, count: Int, tension: Float, fillmode: FillMode): Status

public expect fun gdipFillClosedCurve2I(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, points: ConstPtr<Point>, count: Int, tension: Float, fillmode: FillMode): Status

public expect fun gdipFillClosedCurveI(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, points: ConstPtr<Point>, count: Int): Status

public expect fun gdipFillEllipse(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, x: Float, y: Float, width: Float, height: Float): Status

public expect fun gdipFillEllipseI(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, x: Int, y: Int, width: Int, height: Int): Status

public expect fun gdipFillPath(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, path: MutPtr<GpPath>): Status

public expect fun gdipFillPie(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status

public expect fun gdipFillPieI(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status

public expect fun gdipFillPolygon(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, points: ConstPtr<PointF>, count: Int, fillmode: FillMode): Status

public expect fun gdipFillPolygon2(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, points: ConstPtr<PointF>, count: Int): Status

public expect fun gdipFillPolygon2I(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, points: ConstPtr<Point>, count: Int): Status

public expect fun gdipFillPolygonI(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, points: ConstPtr<Point>, count: Int, fillmode: FillMode): Status

public expect fun gdipFillRectangle(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, x: Float, y: Float, width: Float, height: Float): Status

public expect fun gdipFillRectangleI(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, x: Int, y: Int, width: Int, height: Int): Status

public expect fun gdipFillRectangles(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, rects: ConstPtr<RectF>, count: Int): Status

public expect fun gdipFillRectanglesI(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, rects: ConstPtr<Rect>, count: Int): Status

public expect fun gdipFillRegion(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, region: MutPtr<GpRegion>): Status

public expect fun gdipFindFirstImageItem(image: MutPtr<GpImage>, item: MutPtr<ImageItemData>): Status

public expect fun gdipFindNextImageItem(image: MutPtr<GpImage>, item: MutPtr<ImageItemData>): Status

public expect fun gdipFlattenPath(path: MutPtr<GpPath>, matrix: MutPtr<Matrix>, flatness: Float): Status

public expect fun gdipFlush(graphics: MutPtr<GpGraphics>, intention: FlushIntention): Status

public expect fun gdipFree(ptr: MutPtr<CVoid>)

public expect fun gdipGetAdjustableArrowCapFillState(cap: MutPtr<GpAdjustableArrowCap>, fillstate: MutPtr<Bool>): Status

public expect fun gdipGetAdjustableArrowCapHeight(cap: MutPtr<GpAdjustableArrowCap>, height: MutPtr<Float>): Status

public expect fun gdipGetAdjustableArrowCapMiddleInset(cap: MutPtr<GpAdjustableArrowCap>, middleinset: MutPtr<Float>): Status

public expect fun gdipGetAdjustableArrowCapWidth(cap: MutPtr<GpAdjustableArrowCap>, width: MutPtr<Float>): Status

public expect fun gdipGetAllPropertyItems(image: MutPtr<GpImage>, totalbuffersize: UInt, numproperties: UInt, allitems: MutPtr<PropertyItem>): Status

public expect fun gdipGetBrushType(brush: MutPtr<GpBrush>, type: MutPtr<BrushType>): Status

public expect fun gdipGetCellAscent(family: ConstPtr<GpFontFamily>, style: Int, cellascent: MutPtr<UShort>): Status

public expect fun gdipGetCellDescent(family: ConstPtr<GpFontFamily>, style: Int, celldescent: MutPtr<UShort>): Status

public expect fun gdipGetClip(graphics: MutPtr<GpGraphics>, region: MutPtr<GpRegion>): Status

public expect fun gdipGetClipBounds(graphics: MutPtr<GpGraphics>, rect: MutPtr<RectF>): Status

public expect fun gdipGetClipBoundsI(graphics: MutPtr<GpGraphics>, rect: MutPtr<Rect>): Status

public expect fun gdipGetCompositingMode(graphics: MutPtr<GpGraphics>, compositingmode: MutPtr<CompositingMode>): Status

public expect fun gdipGetCompositingQuality(graphics: MutPtr<GpGraphics>, compositingquality: MutPtr<CompositingQuality>): Status

public expect fun gdipGetCustomLineCapBaseCap(customcap: MutPtr<GpCustomLineCap>, basecap: MutPtr<LineCap>): Status

public expect fun gdipGetCustomLineCapBaseInset(customcap: MutPtr<GpCustomLineCap>, inset: MutPtr<Float>): Status

public expect fun gdipGetCustomLineCapStrokeCaps(customcap: MutPtr<GpCustomLineCap>, startcap: MutPtr<LineCap>, endcap: MutPtr<LineCap>): Status

public expect fun gdipGetCustomLineCapStrokeJoin(customcap: MutPtr<GpCustomLineCap>, linejoin: MutPtr<LineJoin>): Status

public expect fun gdipGetCustomLineCapType(customcap: MutPtr<GpCustomLineCap>, captype: MutPtr<CustomLineCapType>): Status

public expect fun gdipGetCustomLineCapWidthScale(customcap: MutPtr<GpCustomLineCap>, widthscale: MutPtr<Float>): Status

public expect fun gdipGetDC(graphics: MutPtr<GpGraphics>, hdc: MutPtr<Hdc>): Status

public expect fun gdipGetDpiX(graphics: MutPtr<GpGraphics>, dpi: MutPtr<Float>): Status

public expect fun gdipGetDpiY(graphics: MutPtr<GpGraphics>, dpi: MutPtr<Float>): Status

public expect fun gdipGetEffectParameterSize(effect: MutPtr<CGpEffect>, size: MutPtr<UInt>): Status

public expect fun gdipGetEffectParameters(effect: MutPtr<CGpEffect>, size: MutPtr<UInt>, params: MutPtr<CVoid>): Status

public expect fun gdipGetEmHeight(family: ConstPtr<GpFontFamily>, style: Int, emheight: MutPtr<UShort>): Status

public expect fun gdipGetEncoderParameterList(image: MutPtr<GpImage>, clsidencoder: ConstPtr<Guid>, size: UInt, buffer: MutPtr<EncoderParameters>): Status

public expect fun gdipGetEncoderParameterListSize(image: MutPtr<GpImage>, clsidencoder: ConstPtr<Guid>, size: MutPtr<UInt>): Status

public expect fun gdipGetFamily(font: MutPtr<GpFont>, family: MutPtr<MutPtr<GpFontFamily>>): Status

public expect fun gdipGetFamilyName(family: ConstPtr<GpFontFamily>, name: Pwstr, language: UShort): Status

public expect fun gdipGetFontCollectionFamilyCount(fontcollection: MutPtr<GpFontCollection>, numfound: MutPtr<Int>): Status

public expect fun gdipGetFontCollectionFamilyList(fontcollection: ConstPtr<GpFontCollection>, numsought: Int, gpfamilies: MutPtr<MutPtr<GpFontFamily>>, numfound: MutPtr<Int>): Status

public expect fun gdipGetFontHeight(font: ConstPtr<GpFont>, graphics: ConstPtr<GpGraphics>, height: MutPtr<Float>): Status

public expect fun gdipGetFontHeightGivenDPI(font: ConstPtr<GpFont>, dpi: Float, height: MutPtr<Float>): Status

public expect fun gdipGetFontSize(font: MutPtr<GpFont>, size: MutPtr<Float>): Status

public expect fun gdipGetFontStyle(font: MutPtr<GpFont>, style: MutPtr<Int>): Status

public expect fun gdipGetFontUnit(font: MutPtr<GpFont>, unit: MutPtr<Unit>): Status

public expect fun gdipGetGenericFontFamilyMonospace(nativefamily: MutPtr<MutPtr<GpFontFamily>>): Status

public expect fun gdipGetGenericFontFamilySansSerif(nativefamily: MutPtr<MutPtr<GpFontFamily>>): Status

public expect fun gdipGetGenericFontFamilySerif(nativefamily: MutPtr<MutPtr<GpFontFamily>>): Status

public expect fun gdipGetHatchBackgroundColor(brush: MutPtr<GpHatch>, backcol: MutPtr<UInt>): Status

public expect fun gdipGetHatchForegroundColor(brush: MutPtr<GpHatch>, forecol: MutPtr<UInt>): Status

public expect fun gdipGetHatchStyle(brush: MutPtr<GpHatch>, hatchstyle: MutPtr<HatchStyle>): Status

public expect fun gdipGetHemfFromMetafile(metafile: MutPtr<GpMetafile>, hemf: MutPtr<Henhmetafile>): Status

public expect fun gdipGetImageAttributesAdjustedPalette(imageattr: MutPtr<GpImageAttributes>, colorpalette: MutPtr<ColorPalette>, coloradjusttype: ColorAdjustType): Status

public expect fun gdipGetImageBounds(image: MutPtr<GpImage>, srcrect: MutPtr<RectF>, srcunit: MutPtr<Unit>): Status

public expect fun gdipGetImageDecoders(numdecoders: UInt, size: UInt, decoders: MutPtr<ImageCodecInfo>): Status

public expect fun gdipGetImageDecodersSize(numdecoders: MutPtr<UInt>, size: MutPtr<UInt>): Status

public expect fun gdipGetImageDimension(image: MutPtr<GpImage>, width: MutPtr<Float>, height: MutPtr<Float>): Status

public expect fun gdipGetImageEncoders(numencoders: UInt, size: UInt, encoders: MutPtr<ImageCodecInfo>): Status

public expect fun gdipGetImageEncodersSize(numencoders: MutPtr<UInt>, size: MutPtr<UInt>): Status

public expect fun gdipGetImageFlags(image: MutPtr<GpImage>, flags: MutPtr<UInt>): Status

public expect fun gdipGetImageGraphicsContext(image: MutPtr<GpImage>, graphics: MutPtr<MutPtr<GpGraphics>>): Status

public expect fun gdipGetImageHeight(image: MutPtr<GpImage>, height: MutPtr<UInt>): Status

public expect fun gdipGetImageHorizontalResolution(image: MutPtr<GpImage>, resolution: MutPtr<Float>): Status

public expect fun gdipGetImageItemData(image: MutPtr<GpImage>, item: MutPtr<ImageItemData>): Status

public expect fun gdipGetImagePalette(image: MutPtr<GpImage>, palette: MutPtr<ColorPalette>, size: Int): Status

public expect fun gdipGetImagePaletteSize(image: MutPtr<GpImage>, size: MutPtr<Int>): Status

public expect fun gdipGetImagePixelFormat(image: MutPtr<GpImage>, format: MutPtr<Int>): Status

public expect fun gdipGetImageRawFormat(image: MutPtr<GpImage>, format: MutPtr<Guid>): Status

public expect fun gdipGetImageThumbnail(image: MutPtr<GpImage>, thumbwidth: UInt, thumbheight: UInt, thumbimage: MutPtr<MutPtr<GpImage>>, callback: Long, callbackdata: MutPtr<CVoid>): Status

public expect fun gdipGetImageType(image: MutPtr<GpImage>, type: MutPtr<ImageType>): Status

public expect fun gdipGetImageVerticalResolution(image: MutPtr<GpImage>, resolution: MutPtr<Float>): Status

public expect fun gdipGetImageWidth(image: MutPtr<GpImage>, width: MutPtr<UInt>): Status

public expect fun gdipGetInterpolationMode(graphics: MutPtr<GpGraphics>, interpolationmode: MutPtr<InterpolationMode>): Status

public expect fun gdipGetLineBlend(brush: MutPtr<GpLineGradient>, blend: MutPtr<Float>, positions: MutPtr<Float>, count: Int): Status

public expect fun gdipGetLineBlendCount(brush: MutPtr<GpLineGradient>, count: MutPtr<Int>): Status

public expect fun gdipGetLineColors(brush: MutPtr<GpLineGradient>, colors: MutPtr<UInt>): Status

public expect fun gdipGetLineGammaCorrection(brush: MutPtr<GpLineGradient>, usegammacorrection: MutPtr<Bool>): Status

public expect fun gdipGetLinePresetBlend(brush: MutPtr<GpLineGradient>, blend: MutPtr<UInt>, positions: MutPtr<Float>, count: Int): Status

public expect fun gdipGetLinePresetBlendCount(brush: MutPtr<GpLineGradient>, count: MutPtr<Int>): Status

public expect fun gdipGetLineRect(brush: MutPtr<GpLineGradient>, rect: MutPtr<RectF>): Status

public expect fun gdipGetLineRectI(brush: MutPtr<GpLineGradient>, rect: MutPtr<Rect>): Status

public expect fun gdipGetLineSpacing(family: ConstPtr<GpFontFamily>, style: Int, linespacing: MutPtr<UShort>): Status

public expect fun gdipGetLineTransform(brush: MutPtr<GpLineGradient>, matrix: MutPtr<Matrix>): Status

public expect fun gdipGetLineWrapMode(brush: MutPtr<GpLineGradient>, wrapmode: MutPtr<WrapMode>): Status

public expect fun gdipGetLogFontA(font: MutPtr<GpFont>, graphics: MutPtr<GpGraphics>, logfonta: MutPtr<Logfonta>): Status

public expect fun gdipGetLogFontW(font: MutPtr<GpFont>, graphics: MutPtr<GpGraphics>, logfontw: MutPtr<Logfontw>): Status

public expect fun gdipGetMatrixElements(matrix: ConstPtr<Matrix>, matrixout: MutPtr<Float>): Status

public expect fun gdipGetMetafileDownLevelRasterizationLimit(metafile: ConstPtr<GpMetafile>, metafilerasterizationlimitdpi: MutPtr<UInt>): Status

public expect fun gdipGetMetafileHeaderFromEmf(hemf: Henhmetafile, header: MutPtr<MetafileHeader>): Status

public expect fun gdipGetMetafileHeaderFromFile(filename: Pcwstr, header: MutPtr<MetafileHeader>): Status

public expect fun gdipGetMetafileHeaderFromMetafile(metafile: MutPtr<GpMetafile>, header: MutPtr<MetafileHeader>): Status

public expect fun gdipGetMetafileHeaderFromStream(stream: MutPtr<CVoid>, header: MutPtr<MetafileHeader>): Status

public expect fun gdipGetMetafileHeaderFromWmf(hwmf: Hmetafile, wmfplaceablefileheader: ConstPtr<WmfPlaceableFileHeader>, header: MutPtr<MetafileHeader>): Status

public expect fun gdipGetNearestColor(graphics: MutPtr<GpGraphics>, argb: MutPtr<UInt>): Status

public expect fun gdipGetPageScale(graphics: MutPtr<GpGraphics>, scale: MutPtr<Float>): Status

public expect fun gdipGetPageUnit(graphics: MutPtr<GpGraphics>, unit: MutPtr<Unit>): Status

public expect fun gdipGetPathData(path: MutPtr<GpPath>, pathdata: MutPtr<PathData>): Status

public expect fun gdipGetPathFillMode(path: MutPtr<GpPath>, fillmode: MutPtr<FillMode>): Status

public expect fun gdipGetPathGradientBlend(brush: MutPtr<GpPathGradient>, blend: MutPtr<Float>, positions: MutPtr<Float>, count: Int): Status

public expect fun gdipGetPathGradientBlendCount(brush: MutPtr<GpPathGradient>, count: MutPtr<Int>): Status

public expect fun gdipGetPathGradientCenterColor(brush: MutPtr<GpPathGradient>, colors: MutPtr<UInt>): Status

public expect fun gdipGetPathGradientCenterPoint(brush: MutPtr<GpPathGradient>, points: MutPtr<PointF>): Status

public expect fun gdipGetPathGradientCenterPointI(brush: MutPtr<GpPathGradient>, points: MutPtr<Point>): Status

public expect fun gdipGetPathGradientFocusScales(brush: MutPtr<GpPathGradient>, xscale: MutPtr<Float>, yscale: MutPtr<Float>): Status

public expect fun gdipGetPathGradientGammaCorrection(brush: MutPtr<GpPathGradient>, usegammacorrection: MutPtr<Bool>): Status

public expect fun gdipGetPathGradientPath(brush: MutPtr<GpPathGradient>, path: MutPtr<GpPath>): Status

public expect fun gdipGetPathGradientPointCount(brush: MutPtr<GpPathGradient>, count: MutPtr<Int>): Status

public expect fun gdipGetPathGradientPresetBlend(brush: MutPtr<GpPathGradient>, blend: MutPtr<UInt>, positions: MutPtr<Float>, count: Int): Status

public expect fun gdipGetPathGradientPresetBlendCount(brush: MutPtr<GpPathGradient>, count: MutPtr<Int>): Status

public expect fun gdipGetPathGradientRect(brush: MutPtr<GpPathGradient>, rect: MutPtr<RectF>): Status

public expect fun gdipGetPathGradientRectI(brush: MutPtr<GpPathGradient>, rect: MutPtr<Rect>): Status

public expect fun gdipGetPathGradientSurroundColorCount(brush: MutPtr<GpPathGradient>, count: MutPtr<Int>): Status

public expect fun gdipGetPathGradientSurroundColorsWithCount(brush: ConstPtr<GpPathGradient>, color: MutPtr<UInt>, count: MutPtr<Int>): Status

public expect fun gdipGetPathGradientTransform(brush: MutPtr<GpPathGradient>, matrix: MutPtr<Matrix>): Status

public expect fun gdipGetPathGradientWrapMode(brush: MutPtr<GpPathGradient>, wrapmode: MutPtr<WrapMode>): Status

public expect fun gdipGetPathLastPoint(path: MutPtr<GpPath>, lastpoint: MutPtr<PointF>): Status

public expect fun gdipGetPathPoints(param0: MutPtr<GpPath>, points: MutPtr<PointF>, count: Int): Status

public expect fun gdipGetPathPointsI(param0: MutPtr<GpPath>, points: MutPtr<Point>, count: Int): Status

public expect fun gdipGetPathTypes(path: ConstPtr<GpPath>, types: MutPtr<UByte>, count: Int): Status

public expect fun gdipGetPathWorldBounds(path: MutPtr<GpPath>, bounds: MutPtr<RectF>, matrix: ConstPtr<Matrix>, pen: ConstPtr<GpPen>): Status

public expect fun gdipGetPathWorldBoundsI(path: MutPtr<GpPath>, bounds: MutPtr<Rect>, matrix: ConstPtr<Matrix>, pen: ConstPtr<GpPen>): Status

public expect fun gdipGetPenBrushFill(pen: MutPtr<GpPen>, brush: MutPtr<MutPtr<GpBrush>>): Status

public expect fun gdipGetPenColor(pen: MutPtr<GpPen>, argb: MutPtr<UInt>): Status

public expect fun gdipGetPenCompoundArray(pen: MutPtr<GpPen>, dash: MutPtr<Float>, count: Int): Status

public expect fun gdipGetPenCompoundCount(pen: MutPtr<GpPen>, count: MutPtr<Int>): Status

public expect fun gdipGetPenCustomEndCap(pen: MutPtr<GpPen>, customcap: MutPtr<MutPtr<GpCustomLineCap>>): Status

public expect fun gdipGetPenCustomStartCap(pen: MutPtr<GpPen>, customcap: MutPtr<MutPtr<GpCustomLineCap>>): Status

public expect fun gdipGetPenDashArray(pen: MutPtr<GpPen>, dash: MutPtr<Float>, count: Int): Status

public expect fun gdipGetPenDashCap197819(pen: MutPtr<GpPen>, dashcap: MutPtr<DashCap>): Status

public expect fun gdipGetPenDashCount(pen: MutPtr<GpPen>, count: MutPtr<Int>): Status

public expect fun gdipGetPenDashOffset(pen: MutPtr<GpPen>, offset: MutPtr<Float>): Status

public expect fun gdipGetPenDashStyle(pen: MutPtr<GpPen>, dashstyle: MutPtr<DashStyle>): Status

public expect fun gdipGetPenEndCap(pen: MutPtr<GpPen>, endcap: MutPtr<LineCap>): Status

public expect fun gdipGetPenFillType(pen: MutPtr<GpPen>, type: MutPtr<PenType>): Status

public expect fun gdipGetPenLineJoin(pen: MutPtr<GpPen>, linejoin: MutPtr<LineJoin>): Status

public expect fun gdipGetPenMiterLimit(pen: MutPtr<GpPen>, miterlimit: MutPtr<Float>): Status

public expect fun gdipGetPenMode(pen: MutPtr<GpPen>, penmode: MutPtr<PenAlignment>): Status

public expect fun gdipGetPenStartCap(pen: MutPtr<GpPen>, startcap: MutPtr<LineCap>): Status

public expect fun gdipGetPenTransform(pen: MutPtr<GpPen>, matrix: MutPtr<Matrix>): Status

public expect fun gdipGetPenUnit(pen: MutPtr<GpPen>, unit: MutPtr<Unit>): Status

public expect fun gdipGetPenWidth(pen: MutPtr<GpPen>, width: MutPtr<Float>): Status

public expect fun gdipGetPixelOffsetMode(graphics: MutPtr<GpGraphics>, pixeloffsetmode: MutPtr<PixelOffsetMode>): Status

public expect fun gdipGetPointCount(path: MutPtr<GpPath>, count: MutPtr<Int>): Status

public expect fun gdipGetPropertyCount(image: MutPtr<GpImage>, numofproperty: MutPtr<UInt>): Status

public expect fun gdipGetPropertyIdList(image: MutPtr<GpImage>, numofproperty: UInt, list: MutPtr<UInt>): Status

public expect fun gdipGetPropertyItem(image: MutPtr<GpImage>, propid: UInt, propsize: UInt, buffer: MutPtr<PropertyItem>): Status

public expect fun gdipGetPropertyItemSize(image: MutPtr<GpImage>, propid: UInt, size: MutPtr<UInt>): Status

public expect fun gdipGetPropertySize(image: MutPtr<GpImage>, totalbuffersize: MutPtr<UInt>, numproperties: MutPtr<UInt>): Status

public expect fun gdipGetRegionBounds(region: MutPtr<GpRegion>, graphics: MutPtr<GpGraphics>, rect: MutPtr<RectF>): Status

public expect fun gdipGetRegionBoundsI(region: MutPtr<GpRegion>, graphics: MutPtr<GpGraphics>, rect: MutPtr<Rect>): Status

public expect fun gdipGetRegionData(region: MutPtr<GpRegion>, buffer: MutPtr<UByte>, buffersize: UInt, sizefilled: MutPtr<UInt>): Status

public expect fun gdipGetRegionDataSize(region: MutPtr<GpRegion>, buffersize: MutPtr<UInt>): Status

public expect fun gdipGetRegionHRgn(region: MutPtr<GpRegion>, graphics: MutPtr<GpGraphics>, hrgn: MutPtr<Hrgn>): Status

public expect fun gdipGetRegionScans(region: MutPtr<GpRegion>, rects: MutPtr<RectF>, count: MutPtr<Int>, matrix: MutPtr<Matrix>): Status

public expect fun gdipGetRegionScansCount(region: MutPtr<GpRegion>, count: MutPtr<UInt>, matrix: MutPtr<Matrix>): Status

public expect fun gdipGetRegionScansI(region: MutPtr<GpRegion>, rects: MutPtr<Rect>, count: MutPtr<Int>, matrix: MutPtr<Matrix>): Status

public expect fun gdipGetRenderingOrigin(graphics: MutPtr<GpGraphics>, x: MutPtr<Int>, y: MutPtr<Int>): Status

public expect fun gdipGetSmoothingMode(graphics: MutPtr<GpGraphics>, smoothingmode: MutPtr<SmoothingMode>): Status

public expect fun gdipGetSolidFillColor(brush: MutPtr<GpSolidFill>, color: MutPtr<UInt>): Status

public expect fun gdipGetStringFormatAlign(format: ConstPtr<GpStringFormat>, align: MutPtr<StringAlignment>): Status

public expect fun gdipGetStringFormatDigitSubstitution(format: ConstPtr<GpStringFormat>, language: MutPtr<UShort>, substitute: MutPtr<StringDigitSubstitute>): Status

public expect fun gdipGetStringFormatFlags(format: ConstPtr<GpStringFormat>, flags: MutPtr<Int>): Status

public expect fun gdipGetStringFormatHotkeyPrefix(format: ConstPtr<GpStringFormat>, hotkeyprefix: MutPtr<Int>): Status

public expect fun gdipGetStringFormatLineAlign(format: ConstPtr<GpStringFormat>, align: MutPtr<StringAlignment>): Status

public expect fun gdipGetStringFormatMeasurableCharacterRangeCount(format: ConstPtr<GpStringFormat>, count: MutPtr<Int>): Status

public expect fun gdipGetStringFormatTabStopCount(format: ConstPtr<GpStringFormat>, count: MutPtr<Int>): Status

public expect fun gdipGetStringFormatTabStops(format: ConstPtr<GpStringFormat>, count: Int, firsttaboffset: MutPtr<Float>, tabstops: MutPtr<Float>): Status

public expect fun gdipGetStringFormatTrimming(format: ConstPtr<GpStringFormat>, trimming: MutPtr<StringTrimming>): Status

public expect fun gdipGetTextContrast(graphics: MutPtr<GpGraphics>, contrast: MutPtr<UInt>): Status

public expect fun gdipGetTextRenderingHint(graphics: MutPtr<GpGraphics>, mode: MutPtr<TextRenderingHint>): Status

public expect fun gdipGetTextureImage(brush: MutPtr<GpTexture>, image: MutPtr<MutPtr<GpImage>>): Status

public expect fun gdipGetTextureTransform(brush: MutPtr<GpTexture>, matrix: MutPtr<Matrix>): Status

public expect fun gdipGetTextureWrapMode(brush: MutPtr<GpTexture>, wrapmode: MutPtr<WrapMode>): Status

public expect fun gdipGetVisibleClipBounds(graphics: MutPtr<GpGraphics>, rect: MutPtr<RectF>): Status

public expect fun gdipGetVisibleClipBoundsI(graphics: MutPtr<GpGraphics>, rect: MutPtr<Rect>): Status

public expect fun gdipGetWorldTransform(graphics: MutPtr<GpGraphics>, matrix: MutPtr<Matrix>): Status

public expect fun gdipGraphicsClear(graphics: MutPtr<GpGraphics>, color: UInt): Status

public expect fun gdipGraphicsSetAbort(pgraphics: MutPtr<GpGraphics>, piabort: MutPtr<CVoid>): Status

public expect fun gdipImageForceValidation(image: MutPtr<GpImage>): Status

public expect fun gdipImageGetFrameCount(image: MutPtr<GpImage>, dimensionid: ConstPtr<Guid>, count: MutPtr<UInt>): Status

public expect fun gdipImageGetFrameDimensionsCount(image: MutPtr<GpImage>, count: MutPtr<UInt>): Status

public expect fun gdipImageGetFrameDimensionsList(image: MutPtr<GpImage>, dimensionids: MutPtr<Guid>, count: UInt): Status

public expect fun gdipImageRotateFlip(image: MutPtr<GpImage>, rftype: RotateFlipType): Status

public expect fun gdipImageSelectActiveFrame(image: MutPtr<GpImage>, dimensionid: ConstPtr<Guid>, frameindex: UInt): Status

public expect fun gdipImageSetAbort(pimage: MutPtr<GpImage>, piabort: MutPtr<CVoid>): Status

public expect fun gdipInitializePalette(palette: MutPtr<ColorPalette>, palettetype: PaletteType, optimalcolors: Int, usetransparentcolor: Bool, bitmap: MutPtr<GpBitmap>): Status

public expect fun gdipInvertMatrix(matrix: MutPtr<Matrix>): Status

public expect fun gdipIsClipEmpty(graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status

public expect fun gdipIsEmptyRegion(region: MutPtr<GpRegion>, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status

public expect fun gdipIsEqualRegion(region: MutPtr<GpRegion>, region2: MutPtr<GpRegion>, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status

public expect fun gdipIsInfiniteRegion(region: MutPtr<GpRegion>, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status

public expect fun gdipIsMatrixEqual(matrix: ConstPtr<Matrix>, matrix2: ConstPtr<Matrix>, result: MutPtr<Bool>): Status

public expect fun gdipIsMatrixIdentity(matrix: ConstPtr<Matrix>, result: MutPtr<Bool>): Status

public expect fun gdipIsMatrixInvertible(matrix: ConstPtr<Matrix>, result: MutPtr<Bool>): Status

public expect fun gdipIsOutlineVisiblePathPoint(path: MutPtr<GpPath>, x: Float, y: Float, pen: MutPtr<GpPen>, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status

public expect fun gdipIsOutlineVisiblePathPointI(path: MutPtr<GpPath>, x: Int, y: Int, pen: MutPtr<GpPen>, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status

public expect fun gdipIsStyleAvailable(family: ConstPtr<GpFontFamily>, style: Int, isstyleavailable: MutPtr<Bool>): Status

public expect fun gdipIsVisibleClipEmpty(graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status

public expect fun gdipIsVisiblePathPoint(path: MutPtr<GpPath>, x: Float, y: Float, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status

public expect fun gdipIsVisiblePathPointI(path: MutPtr<GpPath>, x: Int, y: Int, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status

public expect fun gdipIsVisiblePoint(graphics: MutPtr<GpGraphics>, x: Float, y: Float, result: MutPtr<Bool>): Status

public expect fun gdipIsVisiblePointI(graphics: MutPtr<GpGraphics>, x: Int, y: Int, result: MutPtr<Bool>): Status

public expect fun gdipIsVisibleRect(graphics: MutPtr<GpGraphics>, x: Float, y: Float, width: Float, height: Float, result: MutPtr<Bool>): Status

public expect fun gdipIsVisibleRectI(graphics: MutPtr<GpGraphics>, x: Int, y: Int, width: Int, height: Int, result: MutPtr<Bool>): Status

public expect fun gdipIsVisibleRegionPoint(region: MutPtr<GpRegion>, x: Float, y: Float, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status

public expect fun gdipIsVisibleRegionPointI(region: MutPtr<GpRegion>, x: Int, y: Int, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status

public expect fun gdipIsVisibleRegionRect(region: MutPtr<GpRegion>, x: Float, y: Float, width: Float, height: Float, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status

public expect fun gdipIsVisibleRegionRectI(region: MutPtr<GpRegion>, x: Int, y: Int, width: Int, height: Int, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status

public expect fun gdipLoadImageFromFile(filename: Pcwstr, image: MutPtr<MutPtr<GpImage>>): Status

public expect fun gdipLoadImageFromFileICM(filename: Pcwstr, image: MutPtr<MutPtr<GpImage>>): Status

public expect fun gdipLoadImageFromStream(stream: MutPtr<CVoid>, image: MutPtr<MutPtr<GpImage>>): Status

public expect fun gdipLoadImageFromStreamICM(stream: MutPtr<CVoid>, image: MutPtr<MutPtr<GpImage>>): Status

public expect fun gdipMeasureCharacterRanges(graphics: MutPtr<GpGraphics>, string: Pcwstr, length: Int, font: ConstPtr<GpFont>, layoutrect: ConstPtr<RectF>, stringformat: ConstPtr<GpStringFormat>, regioncount: Int, regions: MutPtr<MutPtr<GpRegion>>): Status

public expect fun gdipMeasureDriverString(graphics: MutPtr<GpGraphics>, text: ConstPtr<UShort>, length: Int, font: ConstPtr<GpFont>, positions: ConstPtr<PointF>, flags: Int, matrix: ConstPtr<Matrix>, boundingbox: MutPtr<RectF>): Status

public expect fun gdipMeasureString(graphics: MutPtr<GpGraphics>, string: Pcwstr, length: Int, font: ConstPtr<GpFont>, layoutrect: ConstPtr<RectF>, stringformat: ConstPtr<GpStringFormat>, boundingbox: MutPtr<RectF>, codepointsfitted: MutPtr<Int>, linesfilled: MutPtr<Int>): Status

public expect fun gdipMultiplyLineTransform(brush: MutPtr<GpLineGradient>, matrix: ConstPtr<Matrix>, order: MatrixOrder): Status

public expect fun gdipMultiplyMatrix(matrix: MutPtr<Matrix>, matrix2: MutPtr<Matrix>, order: MatrixOrder): Status

public expect fun gdipMultiplyPathGradientTransform(brush: MutPtr<GpPathGradient>, matrix: ConstPtr<Matrix>, order: MatrixOrder): Status

public expect fun gdipMultiplyPenTransform(pen: MutPtr<GpPen>, matrix: ConstPtr<Matrix>, order: MatrixOrder): Status

public expect fun gdipMultiplyTextureTransform(brush: MutPtr<GpTexture>, matrix: ConstPtr<Matrix>, order: MatrixOrder): Status

public expect fun gdipMultiplyWorldTransform(graphics: MutPtr<GpGraphics>, matrix: ConstPtr<Matrix>, order: MatrixOrder): Status

public expect fun gdipNewInstalledFontCollection(fontcollection: MutPtr<MutPtr<GpFontCollection>>): Status

public expect fun gdipNewPrivateFontCollection(fontcollection: MutPtr<MutPtr<GpFontCollection>>): Status

public expect fun gdipPathIterCopyData(iterator: MutPtr<GpPathIterator>, resultcount: MutPtr<Int>, points: MutPtr<PointF>, types: MutPtr<UByte>, startindex: Int, endindex: Int): Status

public expect fun gdipPathIterEnumerate(iterator: MutPtr<GpPathIterator>, resultcount: MutPtr<Int>, points: MutPtr<PointF>, types: MutPtr<UByte>, count: Int): Status

public expect fun gdipPathIterGetCount(iterator: MutPtr<GpPathIterator>, count: MutPtr<Int>): Status

public expect fun gdipPathIterGetSubpathCount(iterator: MutPtr<GpPathIterator>, count: MutPtr<Int>): Status

public expect fun gdipPathIterHasCurve(iterator: MutPtr<GpPathIterator>, hascurve: MutPtr<Bool>): Status

public expect fun gdipPathIterIsValid(iterator: MutPtr<GpPathIterator>, valid: MutPtr<Bool>): Status

public expect fun gdipPathIterNextMarker(iterator: MutPtr<GpPathIterator>, resultcount: MutPtr<Int>, startindex: MutPtr<Int>, endindex: MutPtr<Int>): Status

public expect fun gdipPathIterNextMarkerPath(iterator: MutPtr<GpPathIterator>, resultcount: MutPtr<Int>, path: MutPtr<GpPath>): Status

public expect fun gdipPathIterNextPathType(iterator: MutPtr<GpPathIterator>, resultcount: MutPtr<Int>, pathtype: MutPtr<UByte>, startindex: MutPtr<Int>, endindex: MutPtr<Int>): Status

public expect fun gdipPathIterNextSubpath(iterator: MutPtr<GpPathIterator>, resultcount: MutPtr<Int>, startindex: MutPtr<Int>, endindex: MutPtr<Int>, isclosed: MutPtr<Bool>): Status

public expect fun gdipPathIterNextSubpathPath(iterator: MutPtr<GpPathIterator>, resultcount: MutPtr<Int>, path: MutPtr<GpPath>, isclosed: MutPtr<Bool>): Status

public expect fun gdipPathIterRewind(iterator: MutPtr<GpPathIterator>): Status

public expect fun gdipPlayMetafileRecord(metafile: ConstPtr<GpMetafile>, recordtype: EmfPlusRecordType, flags: UInt, datasize: UInt, data: ConstPtr<UByte>): Status

public expect fun gdipPrivateAddFontFile(fontcollection: MutPtr<GpFontCollection>, filename: Pcwstr): Status

public expect fun gdipPrivateAddMemoryFont(fontcollection: MutPtr<GpFontCollection>, memory: ConstPtr<CVoid>, length: Int): Status

public expect fun gdipRecordMetafile(referencehdc: Hdc, type: EmfType, framerect: ConstPtr<RectF>, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr<MutPtr<GpMetafile>>): Status

public expect fun gdipRecordMetafileFileName(filename: Pcwstr, referencehdc: Hdc, type: EmfType, framerect: ConstPtr<RectF>, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr<MutPtr<GpMetafile>>): Status

public expect fun gdipRecordMetafileFileNameI(filename: Pcwstr, referencehdc: Hdc, type: EmfType, framerect: ConstPtr<Rect>, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr<MutPtr<GpMetafile>>): Status

public expect fun gdipRecordMetafileI(referencehdc: Hdc, type: EmfType, framerect: ConstPtr<Rect>, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr<MutPtr<GpMetafile>>): Status

public expect fun gdipRecordMetafileStream(stream: MutPtr<CVoid>, referencehdc: Hdc, type: EmfType, framerect: ConstPtr<RectF>, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr<MutPtr<GpMetafile>>): Status

public expect fun gdipRecordMetafileStreamI(stream: MutPtr<CVoid>, referencehdc: Hdc, type: EmfType, framerect: ConstPtr<Rect>, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr<MutPtr<GpMetafile>>): Status

public expect fun gdipReleaseDC(graphics: MutPtr<GpGraphics>, hdc: Hdc): Status

public expect fun gdipRemovePropertyItem(image: MutPtr<GpImage>, propid: UInt): Status

public expect fun gdipResetClip(graphics: MutPtr<GpGraphics>): Status

public expect fun gdipResetImageAttributes(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType): Status

public expect fun gdipResetLineTransform(brush: MutPtr<GpLineGradient>): Status

public expect fun gdipResetPageTransform(graphics: MutPtr<GpGraphics>): Status

public expect fun gdipResetPath(path: MutPtr<GpPath>): Status

public expect fun gdipResetPathGradientTransform(brush: MutPtr<GpPathGradient>): Status

public expect fun gdipResetPenTransform(pen: MutPtr<GpPen>): Status

public expect fun gdipResetTextureTransform(brush: MutPtr<GpTexture>): Status

public expect fun gdipResetWorldTransform(graphics: MutPtr<GpGraphics>): Status

public expect fun gdipRestoreGraphics(graphics: MutPtr<GpGraphics>, state: UInt): Status

public expect fun gdipReversePath(path: MutPtr<GpPath>): Status

public expect fun gdipRotateLineTransform(brush: MutPtr<GpLineGradient>, angle: Float, order: MatrixOrder): Status

public expect fun gdipRotateMatrix(matrix: MutPtr<Matrix>, angle: Float, order: MatrixOrder): Status

public expect fun gdipRotatePathGradientTransform(brush: MutPtr<GpPathGradient>, angle: Float, order: MatrixOrder): Status

public expect fun gdipRotatePenTransform(pen: MutPtr<GpPen>, angle: Float, order: MatrixOrder): Status

public expect fun gdipRotateTextureTransform(brush: MutPtr<GpTexture>, angle: Float, order: MatrixOrder): Status

public expect fun gdipRotateWorldTransform(graphics: MutPtr<GpGraphics>, angle: Float, order: MatrixOrder): Status

public expect fun gdipSaveAdd(image: MutPtr<GpImage>, encoderparams: ConstPtr<EncoderParameters>): Status

public expect fun gdipSaveAddImage(image: MutPtr<GpImage>, newimage: MutPtr<GpImage>, encoderparams: ConstPtr<EncoderParameters>): Status

public expect fun gdipSaveGraphics(graphics: MutPtr<GpGraphics>, state: MutPtr<UInt>): Status

public expect fun gdipSaveImageToFile(image: MutPtr<GpImage>, filename: Pcwstr, clsidencoder: ConstPtr<Guid>, encoderparams: ConstPtr<EncoderParameters>): Status

public expect fun gdipSaveImageToStream(image: MutPtr<GpImage>, stream: MutPtr<CVoid>, clsidencoder: ConstPtr<Guid>, encoderparams: ConstPtr<EncoderParameters>): Status

public expect fun gdipScaleLineTransform(brush: MutPtr<GpLineGradient>, sx: Float, sy: Float, order: MatrixOrder): Status

public expect fun gdipScaleMatrix(matrix: MutPtr<Matrix>, scalex: Float, scaley: Float, order: MatrixOrder): Status

public expect fun gdipScalePathGradientTransform(brush: MutPtr<GpPathGradient>, sx: Float, sy: Float, order: MatrixOrder): Status

public expect fun gdipScalePenTransform(pen: MutPtr<GpPen>, sx: Float, sy: Float, order: MatrixOrder): Status
