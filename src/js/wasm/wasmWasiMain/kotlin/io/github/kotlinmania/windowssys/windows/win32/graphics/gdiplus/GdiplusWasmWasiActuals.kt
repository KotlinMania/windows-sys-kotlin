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

public actual fun gdipAddPathArc(path: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipAddPathArcI(path: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipAddPathBezier(path: COpaquePointer?, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipAddPathBezierI(path: COpaquePointer?, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipAddPathBeziers(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipAddPathBeziersI(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipAddPathClosedCurve(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipAddPathClosedCurve2(path: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipAddPathClosedCurve2I(path: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipAddPathClosedCurveI(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipAddPathCurve(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipAddPathCurve2(path: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipAddPathCurve2I(path: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipAddPathCurve3(path: COpaquePointer?, points: COpaquePointer?, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipAddPathCurve3I(path: COpaquePointer?, points: COpaquePointer?, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipAddPathCurveI(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipAddPathEllipse(path: COpaquePointer?, x: Float, y: Float, width: Float, height: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipAddPathEllipseI(path: COpaquePointer?, x: Int, y: Int, width: Int, height: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipAddPathLine(path: COpaquePointer?, x1: Float, y1: Float, x2: Float, y2: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipAddPathLine2(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipAddPathLine2I(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipAddPathLineI(path: COpaquePointer?, x1: Int, y1: Int, x2: Int, y2: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipAddPathPath(path: COpaquePointer?, addingpath: COpaquePointer?, connect: Bool): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipAddPathPie(path: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipAddPathPieI(path: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipAddPathPolygon(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipAddPathPolygonI(path: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipAddPathRectangle(path: COpaquePointer?, x: Float, y: Float, width: Float, height: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipAddPathRectangleI(path: COpaquePointer?, x: Int, y: Int, width: Int, height: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipAddPathRectangles(path: COpaquePointer?, rects: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipAddPathRectanglesI(path: COpaquePointer?, rects: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipAddPathString(path: COpaquePointer?, string: Pcwstr, length: Int, family: COpaquePointer?, style: Int, emsize: Float, layoutrect: COpaquePointer?, format: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipAddPathStringI(path: COpaquePointer?, string: Pcwstr, length: Int, family: COpaquePointer?, style: Int, emsize: Float, layoutrect: COpaquePointer?, format: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipAlloc(size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipBeginContainer(graphics: COpaquePointer?, dstrect: COpaquePointer?, srcrect: COpaquePointer?, unit: Unit, state: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipBeginContainer2(graphics: COpaquePointer?, state: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipBeginContainerI(graphics: COpaquePointer?, dstrect: COpaquePointer?, srcrect: COpaquePointer?, unit: Unit, state: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipBitmapApplyEffect(bitmap: COpaquePointer?, effect: COpaquePointer?, roi: COpaquePointer?, useauxdata: Bool, auxdata: COpaquePointer?, auxdatasize: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipBitmapConvertFormat(pinputbitmap: COpaquePointer?, format: Int, dithertype: DitherType, palettetype: PaletteType, palette: COpaquePointer?, alphathresholdpercent: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipBitmapCreateApplyEffect(inputbitmaps: COpaquePointer?, numinputs: Int, effect: COpaquePointer?, roi: COpaquePointer?, outputrect: COpaquePointer?, outputbitmap: COpaquePointer?, useauxdata: Bool, auxdata: COpaquePointer?, auxdatasize: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipBitmapGetHistogram(bitmap: COpaquePointer?, format: HistogramFormat, numberofentries: UInt, channel0: COpaquePointer?, channel1: COpaquePointer?, channel2: COpaquePointer?, channel3: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipBitmapGetHistogramSize(format: HistogramFormat, numberofentries: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipBitmapGetPixel(bitmap: COpaquePointer?, x: Int, y: Int, color: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipBitmapLockBits(bitmap: COpaquePointer?, rect: COpaquePointer?, flags: UInt, format: Int, lockedbitmapdata: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipBitmapSetPixel(bitmap: COpaquePointer?, x: Int, y: Int, color: UInt): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipBitmapSetResolution(bitmap: COpaquePointer?, xdpi: Float, ydpi: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipBitmapUnlockBits(bitmap: COpaquePointer?, lockedbitmapdata: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipClearPathMarkers(path: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCloneBitmapArea(x: Float, y: Float, width: Float, height: Float, format: Int, srcbitmap: COpaquePointer?, dstbitmap: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCloneBitmapAreaI(x: Int, y: Int, width: Int, height: Int, format: Int, srcbitmap: COpaquePointer?, dstbitmap: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCloneBrush(brush: COpaquePointer?, clonebrush: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCloneCustomLineCap(customcap: COpaquePointer?, clonedcap: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCloneFont(font: COpaquePointer?, clonefont: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCloneFontFamily(fontfamily: COpaquePointer?, clonedfontfamily: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCloneImage(image: COpaquePointer?, cloneimage: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCloneImageAttributes(imageattr: COpaquePointer?, cloneimageattr: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCloneMatrix(matrix: COpaquePointer?, clonematrix: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipClonePath(path: COpaquePointer?, clonepath: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipClonePen(pen: COpaquePointer?, clonepen: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCloneRegion(region: COpaquePointer?, cloneregion: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCloneStringFormat(format: COpaquePointer?, newformat: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipClosePathFigure(path: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipClosePathFigures(path: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCombineRegionPath(region: COpaquePointer?, path: COpaquePointer?, combinemode: CombineMode): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCombineRegionRect(region: COpaquePointer?, rect: COpaquePointer?, combinemode: CombineMode): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCombineRegionRectI(region: COpaquePointer?, rect: COpaquePointer?, combinemode: CombineMode): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCombineRegionRegion(region: COpaquePointer?, region2: COpaquePointer?, combinemode: CombineMode): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipComment(graphics: COpaquePointer?, sizedata: UInt, data: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipConvertToEmfPlus(refgraphics: COpaquePointer?, metafile: COpaquePointer?, conversionfailureflag: COpaquePointer?, emftype: EmfType, description: Pcwstr, outMetafile: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipConvertToEmfPlusToFile(refgraphics: COpaquePointer?, metafile: COpaquePointer?, conversionfailureflag: COpaquePointer?, filename: Pcwstr, emftype: EmfType, description: Pcwstr, outMetafile: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipConvertToEmfPlusToStream(refgraphics: COpaquePointer?, metafile: COpaquePointer?, conversionfailureflag: COpaquePointer?, stream: COpaquePointer?, emftype: EmfType, description: Pcwstr, outMetafile: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateAdjustableArrowCap(height: Float, width: Float, isfilled: Bool, cap: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateBitmapFromFile(filename: Pcwstr, bitmap: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateBitmapFromFileICM(filename: Pcwstr, bitmap: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateBitmapFromGdiDib(gdibitmapinfo: COpaquePointer?, gdibitmapdata: COpaquePointer?, bitmap: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateBitmapFromGraphics(width: Int, height: Int, target: COpaquePointer?, bitmap: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateBitmapFromHBITMAP(hbm: Hbitmap, hpal: Hpalette, bitmap: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateBitmapFromHICON(hicon: Hicon, bitmap: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateBitmapFromResource(hinstance: Hinstance, lpbitmapname: Pcwstr, bitmap: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateBitmapFromScan0(width: Int, height: Int, stride: Int, format: Int, scan0: COpaquePointer?, bitmap: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateBitmapFromStream(stream: COpaquePointer?, bitmap: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateBitmapFromStreamICM(stream: COpaquePointer?, bitmap: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateCachedBitmap(bitmap: COpaquePointer?, graphics: COpaquePointer?, cachedbitmap: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateCustomLineCap(fillpath: COpaquePointer?, strokepath: COpaquePointer?, basecap: LineCap, baseinset: Float, customcap: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateEffect(guid: Guid, effect: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateFont(fontfamily: COpaquePointer?, emsize: Float, style: Int, unit: Unit, font: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateFontFamilyFromName(name: Pcwstr, fontcollection: COpaquePointer?, fontfamily: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateFontFromDC(hdc: Hdc, font: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateFontFromLogfontA(hdc: Hdc, logfont: COpaquePointer?, font: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateFontFromLogfontW(hdc: Hdc, logfont: COpaquePointer?, font: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateFromHDC(hdc: Hdc, graphics: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateFromHDC2(hdc: Hdc, hdevice: Handle, graphics: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateFromHWND(hwnd: Hwnd, graphics: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateFromHWNDICM(hwnd: Hwnd, graphics: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateHBITMAPFromBitmap(bitmap: COpaquePointer?, hbmreturn: COpaquePointer?, background: UInt): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateHICONFromBitmap(bitmap: COpaquePointer?, hbmreturn: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateHalftonePalette(): Hpalette =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateHatchBrush(hatchstyle: HatchStyle, forecol: UInt, backcol: UInt, brush: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateImageAttributes(imageattr: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateLineBrush(point1: COpaquePointer?, point2: COpaquePointer?, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateLineBrushFromRect(rect: COpaquePointer?, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateLineBrushFromRectI(rect: COpaquePointer?, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateLineBrushFromRectWithAngle(rect: COpaquePointer?, color1: UInt, color2: UInt, angle: Float, isanglescalable: Bool, wrapmode: WrapMode, linegradient: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateLineBrushFromRectWithAngleI(rect: COpaquePointer?, color1: UInt, color2: UInt, angle: Float, isanglescalable: Bool, wrapmode: WrapMode, linegradient: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateLineBrushI(point1: COpaquePointer?, point2: COpaquePointer?, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateMatrix(matrix: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateMatrix2(m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float, matrix: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateMatrix3(rect: COpaquePointer?, dstplg: COpaquePointer?, matrix: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateMatrix3I(rect: COpaquePointer?, dstplg: COpaquePointer?, matrix: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateMetafileFromEmf(hemf: Henhmetafile, deleteemf: Bool, metafile: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateMetafileFromFile(file: Pcwstr, metafile: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateMetafileFromStream(stream: COpaquePointer?, metafile: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateMetafileFromWmf(hwmf: Hmetafile, deletewmf: Bool, wmfplaceablefileheader: COpaquePointer?, metafile: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateMetafileFromWmfFile(file: Pcwstr, wmfplaceablefileheader: COpaquePointer?, metafile: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreatePath(brushmode: FillMode, path: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreatePath2(param0: COpaquePointer?, param1: COpaquePointer?, param2: Int, param3: FillMode, path: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreatePath2I(param0: COpaquePointer?, param1: COpaquePointer?, param2: Int, param3: FillMode, path: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreatePathGradient(points: COpaquePointer?, count: Int, wrapmode: WrapMode, polygradient: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreatePathGradientFromPath(path: COpaquePointer?, polygradient: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreatePathGradientI(points: COpaquePointer?, count: Int, wrapmode: WrapMode, polygradient: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreatePathIter(iterator: COpaquePointer?, path: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreatePen1(color: UInt, width: Float, unit: Unit, pen: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreatePen2(brush: COpaquePointer?, width: Float, unit: Unit, pen: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateRegion(region: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateRegionHrgn(hrgn: Hrgn, region: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateRegionPath(path: COpaquePointer?, region: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateRegionRect(rect: COpaquePointer?, region: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateRegionRectI(rect: COpaquePointer?, region: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateRegionRgnData(regiondata: COpaquePointer?, size: Int, region: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateSolidFill(color: UInt, brush: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateStreamOnFile(filename: Pcwstr, access: UInt, stream: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateStringFormat(formatattributes: Int, language: UShort, format: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateTexture(image: COpaquePointer?, wrapmode: WrapMode, texture: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateTexture2(image: COpaquePointer?, wrapmode: WrapMode, x: Float, y: Float, width: Float, height: Float, texture: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateTexture2I(image: COpaquePointer?, wrapmode: WrapMode, x: Int, y: Int, width: Int, height: Int, texture: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateTextureIA(image: COpaquePointer?, imageattributes: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, texture: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipCreateTextureIAI(image: COpaquePointer?, imageattributes: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, texture: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDeleteBrush(brush: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDeleteCachedBitmap(cachedbitmap: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDeleteCustomLineCap(customcap: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDeleteEffect(effect: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDeleteFont(font: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDeleteFontFamily(fontfamily: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDeleteGraphics(graphics: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDeleteMatrix(matrix: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDeletePath(path: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDeletePathIter(iterator: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDeletePen(pen: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDeletePrivateFontCollection(fontcollection: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDeleteRegion(region: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDeleteStringFormat(format: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDisposeImage(image: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDisposeImageAttributes(imageattr: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawArc(graphics: COpaquePointer?, pen: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawArcI(graphics: COpaquePointer?, pen: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawBezier(graphics: COpaquePointer?, pen: COpaquePointer?, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawBezierI(graphics: COpaquePointer?, pen: COpaquePointer?, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawBeziers(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawBeziersI(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawCachedBitmap(graphics: COpaquePointer?, cachedbitmap: COpaquePointer?, x: Int, y: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawClosedCurve(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawClosedCurve2(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawClosedCurve2I(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawClosedCurveI(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawCurve(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawCurve2(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawCurve2I(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawCurve3(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawCurve3I(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawCurveI(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawDriverString(graphics: COpaquePointer?, text: COpaquePointer?, length: Int, font: COpaquePointer?, brush: COpaquePointer?, positions: COpaquePointer?, flags: Int, matrix: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawEllipse(graphics: COpaquePointer?, pen: COpaquePointer?, x: Float, y: Float, width: Float, height: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawEllipseI(graphics: COpaquePointer?, pen: COpaquePointer?, x: Int, y: Int, width: Int, height: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawImage(graphics: COpaquePointer?, image: COpaquePointer?, x: Float, y: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawImageFX(graphics: COpaquePointer?, image: COpaquePointer?, source: COpaquePointer?, xform: COpaquePointer?, effect: COpaquePointer?, imageattributes: COpaquePointer?, srcunit: Unit): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawImageI(graphics: COpaquePointer?, image: COpaquePointer?, x: Int, y: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawImagePointRect(graphics: COpaquePointer?, image: COpaquePointer?, x: Float, y: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawImagePointRectI(graphics: COpaquePointer?, image: COpaquePointer?, x: Int, y: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawImagePoints(graphics: COpaquePointer?, image: COpaquePointer?, dstpoints: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawImagePointsI(graphics: COpaquePointer?, image: COpaquePointer?, dstpoints: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawImagePointsRect(graphics: COpaquePointer?, image: COpaquePointer?, points: COpaquePointer?, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawImagePointsRectI(graphics: COpaquePointer?, image: COpaquePointer?, points: COpaquePointer?, count: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawImageRect(graphics: COpaquePointer?, image: COpaquePointer?, x: Float, y: Float, width: Float, height: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawImageRectI(graphics: COpaquePointer?, image: COpaquePointer?, x: Int, y: Int, width: Int, height: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawImageRectRect(graphics: COpaquePointer?, image: COpaquePointer?, dstx: Float, dsty: Float, dstwidth: Float, dstheight: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawImageRectRectI(graphics: COpaquePointer?, image: COpaquePointer?, dstx: Int, dsty: Int, dstwidth: Int, dstheight: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawLine(graphics: COpaquePointer?, pen: COpaquePointer?, x1: Float, y1: Float, x2: Float, y2: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawLineI(graphics: COpaquePointer?, pen: COpaquePointer?, x1: Int, y1: Int, x2: Int, y2: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawLines(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawLinesI(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawPath(graphics: COpaquePointer?, pen: COpaquePointer?, path: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawPie(graphics: COpaquePointer?, pen: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawPieI(graphics: COpaquePointer?, pen: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawPolygon(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawPolygonI(graphics: COpaquePointer?, pen: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawRectangle(graphics: COpaquePointer?, pen: COpaquePointer?, x: Float, y: Float, width: Float, height: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawRectangleI(graphics: COpaquePointer?, pen: COpaquePointer?, x: Int, y: Int, width: Int, height: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawRectangles(graphics: COpaquePointer?, pen: COpaquePointer?, rects: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawRectanglesI(graphics: COpaquePointer?, pen: COpaquePointer?, rects: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipDrawString(graphics: COpaquePointer?, string: Pcwstr, length: Int, font: COpaquePointer?, layoutrect: COpaquePointer?, stringformat: COpaquePointer?, brush: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipEmfToWmfBits(hemf: Henhmetafile, cbdata16: UInt, pdata16: COpaquePointer?, imapmode: Int, eflags: Int): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipEndContainer(graphics: COpaquePointer?, state: UInt): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipEnumerateMetafileDestPoint(graphics: COpaquePointer?, metafile: COpaquePointer?, destpoint: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipEnumerateMetafileDestPointI(graphics: COpaquePointer?, metafile: COpaquePointer?, destpoint: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipEnumerateMetafileDestPoints(graphics: COpaquePointer?, metafile: COpaquePointer?, destpoints: COpaquePointer?, count: Int, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipEnumerateMetafileDestPointsI(graphics: COpaquePointer?, metafile: COpaquePointer?, destpoints: COpaquePointer?, count: Int, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipEnumerateMetafileDestRect(graphics: COpaquePointer?, metafile: COpaquePointer?, destrect: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipEnumerateMetafileDestRectI(graphics: COpaquePointer?, metafile: COpaquePointer?, destrect: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipEnumerateMetafileSrcRectDestPoint(graphics: COpaquePointer?, metafile: COpaquePointer?, destpoint: COpaquePointer?, srcrect: COpaquePointer?, srcunit: Unit, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipEnumerateMetafileSrcRectDestPointI(graphics: COpaquePointer?, metafile: COpaquePointer?, destpoint: COpaquePointer?, srcrect: COpaquePointer?, srcunit: Unit, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipEnumerateMetafileSrcRectDestPoints(graphics: COpaquePointer?, metafile: COpaquePointer?, destpoints: COpaquePointer?, count: Int, srcrect: COpaquePointer?, srcunit: Unit, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipEnumerateMetafileSrcRectDestPointsI(graphics: COpaquePointer?, metafile: COpaquePointer?, destpoints: COpaquePointer?, count: Int, srcrect: COpaquePointer?, srcunit: Unit, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipEnumerateMetafileSrcRectDestRect(graphics: COpaquePointer?, metafile: COpaquePointer?, destrect: COpaquePointer?, srcrect: COpaquePointer?, srcunit: Unit, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipEnumerateMetafileSrcRectDestRectI(graphics: COpaquePointer?, metafile: COpaquePointer?, destrect: COpaquePointer?, srcrect: COpaquePointer?, srcunit: Unit, callback: Long, callbackdata: COpaquePointer?, imageattributes: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipFillClosedCurve(graphics: COpaquePointer?, brush: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipFillClosedCurve2(graphics: COpaquePointer?, brush: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float, fillmode: FillMode): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipFillClosedCurve2I(graphics: COpaquePointer?, brush: COpaquePointer?, points: COpaquePointer?, count: Int, tension: Float, fillmode: FillMode): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipFillClosedCurveI(graphics: COpaquePointer?, brush: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipFillEllipse(graphics: COpaquePointer?, brush: COpaquePointer?, x: Float, y: Float, width: Float, height: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipFillEllipseI(graphics: COpaquePointer?, brush: COpaquePointer?, x: Int, y: Int, width: Int, height: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipFillPath(graphics: COpaquePointer?, brush: COpaquePointer?, path: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipFillPie(graphics: COpaquePointer?, brush: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipFillPieI(graphics: COpaquePointer?, brush: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipFillPolygon(graphics: COpaquePointer?, brush: COpaquePointer?, points: COpaquePointer?, count: Int, fillmode: FillMode): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipFillPolygon2(graphics: COpaquePointer?, brush: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipFillPolygon2I(graphics: COpaquePointer?, brush: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipFillPolygonI(graphics: COpaquePointer?, brush: COpaquePointer?, points: COpaquePointer?, count: Int, fillmode: FillMode): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipFillRectangle(graphics: COpaquePointer?, brush: COpaquePointer?, x: Float, y: Float, width: Float, height: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipFillRectangleI(graphics: COpaquePointer?, brush: COpaquePointer?, x: Int, y: Int, width: Int, height: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipFillRectangles(graphics: COpaquePointer?, brush: COpaquePointer?, rects: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipFillRectanglesI(graphics: COpaquePointer?, brush: COpaquePointer?, rects: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipFillRegion(graphics: COpaquePointer?, brush: COpaquePointer?, region: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipFindFirstImageItem(image: COpaquePointer?, item: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipFindNextImageItem(image: COpaquePointer?, item: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipFlattenPath(path: COpaquePointer?, matrix: COpaquePointer?, flatness: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipFlush(graphics: COpaquePointer?, intention: FlushIntention): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipFree(ptr: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetAdjustableArrowCapFillState(cap: COpaquePointer?, fillstate: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetAdjustableArrowCapHeight(cap: COpaquePointer?, height: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetAdjustableArrowCapMiddleInset(cap: COpaquePointer?, middleinset: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetAdjustableArrowCapWidth(cap: COpaquePointer?, width: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetAllPropertyItems(image: COpaquePointer?, totalbuffersize: UInt, numproperties: UInt, allitems: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetBrushType(brush: COpaquePointer?, type: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetCellAscent(family: COpaquePointer?, style: Int, cellascent: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetCellDescent(family: COpaquePointer?, style: Int, celldescent: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetClip(graphics: COpaquePointer?, region: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetClipBounds(graphics: COpaquePointer?, rect: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetClipBoundsI(graphics: COpaquePointer?, rect: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetCompositingMode(graphics: COpaquePointer?, compositingmode: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetCompositingQuality(graphics: COpaquePointer?, compositingquality: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetCustomLineCapBaseCap(customcap: COpaquePointer?, basecap: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetCustomLineCapBaseInset(customcap: COpaquePointer?, inset: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetCustomLineCapStrokeCaps(customcap: COpaquePointer?, startcap: COpaquePointer?, endcap: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetCustomLineCapStrokeJoin(customcap: COpaquePointer?, linejoin: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetCustomLineCapType(customcap: COpaquePointer?, captype: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetCustomLineCapWidthScale(customcap: COpaquePointer?, widthscale: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetDC(graphics: COpaquePointer?, hdc: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetDpiX(graphics: COpaquePointer?, dpi: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetDpiY(graphics: COpaquePointer?, dpi: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetEffectParameterSize(effect: COpaquePointer?, size: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetEffectParameters(effect: COpaquePointer?, size: COpaquePointer?, params: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetEmHeight(family: COpaquePointer?, style: Int, emheight: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetEncoderParameterList(image: COpaquePointer?, clsidencoder: COpaquePointer?, size: UInt, buffer: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetEncoderParameterListSize(image: COpaquePointer?, clsidencoder: COpaquePointer?, size: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetFamily(font: COpaquePointer?, family: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetFamilyName(family: COpaquePointer?, name: Pwstr, language: UShort): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetFontCollectionFamilyCount(fontcollection: COpaquePointer?, numfound: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetFontCollectionFamilyList(fontcollection: COpaquePointer?, numsought: Int, gpfamilies: COpaquePointer?, numfound: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetFontHeight(font: COpaquePointer?, graphics: COpaquePointer?, height: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetFontHeightGivenDPI(font: COpaquePointer?, dpi: Float, height: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetFontSize(font: COpaquePointer?, size: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetFontStyle(font: COpaquePointer?, style: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetFontUnit(font: COpaquePointer?, unit: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetGenericFontFamilyMonospace(nativefamily: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetGenericFontFamilySansSerif(nativefamily: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetGenericFontFamilySerif(nativefamily: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetHatchBackgroundColor(brush: COpaquePointer?, backcol: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetHatchForegroundColor(brush: COpaquePointer?, forecol: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetHatchStyle(brush: COpaquePointer?, hatchstyle: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetHemfFromMetafile(metafile: COpaquePointer?, hemf: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetImageAttributesAdjustedPalette(imageattr: COpaquePointer?, colorpalette: COpaquePointer?, coloradjusttype: ColorAdjustType): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetImageBounds(image: COpaquePointer?, srcrect: COpaquePointer?, srcunit: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetImageDecoders(numdecoders: UInt, size: UInt, decoders: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetImageDecodersSize(numdecoders: COpaquePointer?, size: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetImageDimension(image: COpaquePointer?, width: COpaquePointer?, height: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetImageEncoders(numencoders: UInt, size: UInt, encoders: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetImageEncodersSize(numencoders: COpaquePointer?, size: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetImageFlags(image: COpaquePointer?, flags: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetImageGraphicsContext(image: COpaquePointer?, graphics: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetImageHeight(image: COpaquePointer?, height: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetImageHorizontalResolution(image: COpaquePointer?, resolution: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetImageItemData(image: COpaquePointer?, item: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetImagePalette(image: COpaquePointer?, palette: COpaquePointer?, size: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetImagePaletteSize(image: COpaquePointer?, size: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetImagePixelFormat(image: COpaquePointer?, format: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetImageRawFormat(image: COpaquePointer?, format: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetImageThumbnail(image: COpaquePointer?, thumbwidth: UInt, thumbheight: UInt, thumbimage: COpaquePointer?, callback: Long, callbackdata: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetImageType(image: COpaquePointer?, type: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetImageVerticalResolution(image: COpaquePointer?, resolution: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetImageWidth(image: COpaquePointer?, width: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetInterpolationMode(graphics: COpaquePointer?, interpolationmode: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetLineBlend(brush: COpaquePointer?, blend: COpaquePointer?, positions: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetLineBlendCount(brush: COpaquePointer?, count: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetLineColors(brush: COpaquePointer?, colors: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetLineGammaCorrection(brush: COpaquePointer?, usegammacorrection: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetLinePresetBlend(brush: COpaquePointer?, blend: COpaquePointer?, positions: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetLinePresetBlendCount(brush: COpaquePointer?, count: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetLineRect(brush: COpaquePointer?, rect: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetLineRectI(brush: COpaquePointer?, rect: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetLineSpacing(family: COpaquePointer?, style: Int, linespacing: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetLineTransform(brush: COpaquePointer?, matrix: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetLineWrapMode(brush: COpaquePointer?, wrapmode: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetLogFontA(font: COpaquePointer?, graphics: COpaquePointer?, logfonta: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetLogFontW(font: COpaquePointer?, graphics: COpaquePointer?, logfontw: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetMatrixElements(matrix: COpaquePointer?, matrixout: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetMetafileDownLevelRasterizationLimit(metafile: COpaquePointer?, metafilerasterizationlimitdpi: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetMetafileHeaderFromEmf(hemf: Henhmetafile, header: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetMetafileHeaderFromFile(filename: Pcwstr, header: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetMetafileHeaderFromMetafile(metafile: COpaquePointer?, header: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetMetafileHeaderFromStream(stream: COpaquePointer?, header: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetMetafileHeaderFromWmf(hwmf: Hmetafile, wmfplaceablefileheader: COpaquePointer?, header: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetNearestColor(graphics: COpaquePointer?, argb: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPageScale(graphics: COpaquePointer?, scale: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPageUnit(graphics: COpaquePointer?, unit: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPathData(path: COpaquePointer?, pathdata: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPathFillMode(path: COpaquePointer?, fillmode: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPathGradientBlend(brush: COpaquePointer?, blend: COpaquePointer?, positions: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPathGradientBlendCount(brush: COpaquePointer?, count: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPathGradientCenterColor(brush: COpaquePointer?, colors: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPathGradientCenterPoint(brush: COpaquePointer?, points: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPathGradientCenterPointI(brush: COpaquePointer?, points: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPathGradientFocusScales(brush: COpaquePointer?, xscale: COpaquePointer?, yscale: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPathGradientGammaCorrection(brush: COpaquePointer?, usegammacorrection: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPathGradientPath(brush: COpaquePointer?, path: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPathGradientPointCount(brush: COpaquePointer?, count: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPathGradientPresetBlend(brush: COpaquePointer?, blend: COpaquePointer?, positions: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPathGradientPresetBlendCount(brush: COpaquePointer?, count: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPathGradientRect(brush: COpaquePointer?, rect: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPathGradientRectI(brush: COpaquePointer?, rect: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPathGradientSurroundColorCount(brush: COpaquePointer?, count: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPathGradientSurroundColorsWithCount(brush: COpaquePointer?, color: COpaquePointer?, count: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPathGradientTransform(brush: COpaquePointer?, matrix: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPathGradientWrapMode(brush: COpaquePointer?, wrapmode: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPathLastPoint(path: COpaquePointer?, lastpoint: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPathPoints(param0: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPathPointsI(param0: COpaquePointer?, points: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPathTypes(path: COpaquePointer?, types: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPathWorldBounds(path: COpaquePointer?, bounds: COpaquePointer?, matrix: COpaquePointer?, pen: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPathWorldBoundsI(path: COpaquePointer?, bounds: COpaquePointer?, matrix: COpaquePointer?, pen: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPenBrushFill(pen: COpaquePointer?, brush: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPenColor(pen: COpaquePointer?, argb: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPenCompoundArray(pen: COpaquePointer?, dash: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPenCompoundCount(pen: COpaquePointer?, count: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPenCustomEndCap(pen: COpaquePointer?, customcap: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPenCustomStartCap(pen: COpaquePointer?, customcap: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPenDashArray(pen: COpaquePointer?, dash: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPenDashCap197819(pen: COpaquePointer?, dashcap: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPenDashCount(pen: COpaquePointer?, count: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPenDashOffset(pen: COpaquePointer?, offset: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPenDashStyle(pen: COpaquePointer?, dashstyle: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPenEndCap(pen: COpaquePointer?, endcap: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPenFillType(pen: COpaquePointer?, type: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPenLineJoin(pen: COpaquePointer?, linejoin: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPenMiterLimit(pen: COpaquePointer?, miterlimit: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPenMode(pen: COpaquePointer?, penmode: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPenStartCap(pen: COpaquePointer?, startcap: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPenTransform(pen: COpaquePointer?, matrix: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPenUnit(pen: COpaquePointer?, unit: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPenWidth(pen: COpaquePointer?, width: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPixelOffsetMode(graphics: COpaquePointer?, pixeloffsetmode: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPointCount(path: COpaquePointer?, count: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPropertyCount(image: COpaquePointer?, numofproperty: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPropertyIdList(image: COpaquePointer?, numofproperty: UInt, list: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPropertyItem(image: COpaquePointer?, propid: UInt, propsize: UInt, buffer: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPropertyItemSize(image: COpaquePointer?, propid: UInt, size: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetPropertySize(image: COpaquePointer?, totalbuffersize: COpaquePointer?, numproperties: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetRegionBounds(region: COpaquePointer?, graphics: COpaquePointer?, rect: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetRegionBoundsI(region: COpaquePointer?, graphics: COpaquePointer?, rect: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetRegionData(region: COpaquePointer?, buffer: COpaquePointer?, buffersize: UInt, sizefilled: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetRegionDataSize(region: COpaquePointer?, buffersize: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetRegionHRgn(region: COpaquePointer?, graphics: COpaquePointer?, hrgn: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetRegionScans(region: COpaquePointer?, rects: COpaquePointer?, count: COpaquePointer?, matrix: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetRegionScansCount(region: COpaquePointer?, count: COpaquePointer?, matrix: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetRegionScansI(region: COpaquePointer?, rects: COpaquePointer?, count: COpaquePointer?, matrix: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetRenderingOrigin(graphics: COpaquePointer?, x: COpaquePointer?, y: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetSmoothingMode(graphics: COpaquePointer?, smoothingmode: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetSolidFillColor(brush: COpaquePointer?, color: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetStringFormatAlign(format: COpaquePointer?, align: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetStringFormatDigitSubstitution(format: COpaquePointer?, language: COpaquePointer?, substitute: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetStringFormatFlags(format: COpaquePointer?, flags: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetStringFormatHotkeyPrefix(format: COpaquePointer?, hotkeyprefix: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetStringFormatLineAlign(format: COpaquePointer?, align: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetStringFormatMeasurableCharacterRangeCount(format: COpaquePointer?, count: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetStringFormatTabStopCount(format: COpaquePointer?, count: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetStringFormatTabStops(format: COpaquePointer?, count: Int, firsttaboffset: COpaquePointer?, tabstops: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetStringFormatTrimming(format: COpaquePointer?, trimming: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetTextContrast(graphics: COpaquePointer?, contrast: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetTextRenderingHint(graphics: COpaquePointer?, mode: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetTextureImage(brush: COpaquePointer?, image: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetTextureTransform(brush: COpaquePointer?, matrix: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetTextureWrapMode(brush: COpaquePointer?, wrapmode: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetVisibleClipBounds(graphics: COpaquePointer?, rect: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetVisibleClipBoundsI(graphics: COpaquePointer?, rect: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGetWorldTransform(graphics: COpaquePointer?, matrix: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGraphicsClear(graphics: COpaquePointer?, color: UInt): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipGraphicsSetAbort(pgraphics: COpaquePointer?, piabort: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipImageForceValidation(image: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipImageGetFrameCount(image: COpaquePointer?, dimensionid: COpaquePointer?, count: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipImageGetFrameDimensionsCount(image: COpaquePointer?, count: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipImageGetFrameDimensionsList(image: COpaquePointer?, dimensionids: COpaquePointer?, count: UInt): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipImageRotateFlip(image: COpaquePointer?, rftype: RotateFlipType): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipImageSelectActiveFrame(image: COpaquePointer?, dimensionid: COpaquePointer?, frameindex: UInt): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipImageSetAbort(pimage: COpaquePointer?, piabort: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipInitializePalette(palette: COpaquePointer?, palettetype: PaletteType, optimalcolors: Int, usetransparentcolor: Bool, bitmap: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipInvertMatrix(matrix: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipIsClipEmpty(graphics: COpaquePointer?, result: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipIsEmptyRegion(region: COpaquePointer?, graphics: COpaquePointer?, result: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipIsEqualRegion(region: COpaquePointer?, region2: COpaquePointer?, graphics: COpaquePointer?, result: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipIsInfiniteRegion(region: COpaquePointer?, graphics: COpaquePointer?, result: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipIsMatrixEqual(matrix: COpaquePointer?, matrix2: COpaquePointer?, result: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipIsMatrixIdentity(matrix: COpaquePointer?, result: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipIsMatrixInvertible(matrix: COpaquePointer?, result: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipIsOutlineVisiblePathPoint(path: COpaquePointer?, x: Float, y: Float, pen: COpaquePointer?, graphics: COpaquePointer?, result: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipIsOutlineVisiblePathPointI(path: COpaquePointer?, x: Int, y: Int, pen: COpaquePointer?, graphics: COpaquePointer?, result: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipIsStyleAvailable(family: COpaquePointer?, style: Int, isstyleavailable: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipIsVisibleClipEmpty(graphics: COpaquePointer?, result: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipIsVisiblePathPoint(path: COpaquePointer?, x: Float, y: Float, graphics: COpaquePointer?, result: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipIsVisiblePathPointI(path: COpaquePointer?, x: Int, y: Int, graphics: COpaquePointer?, result: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipIsVisiblePoint(graphics: COpaquePointer?, x: Float, y: Float, result: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipIsVisiblePointI(graphics: COpaquePointer?, x: Int, y: Int, result: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipIsVisibleRect(graphics: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, result: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipIsVisibleRectI(graphics: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, result: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipIsVisibleRegionPoint(region: COpaquePointer?, x: Float, y: Float, graphics: COpaquePointer?, result: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipIsVisibleRegionPointI(region: COpaquePointer?, x: Int, y: Int, graphics: COpaquePointer?, result: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipIsVisibleRegionRect(region: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, graphics: COpaquePointer?, result: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipIsVisibleRegionRectI(region: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, graphics: COpaquePointer?, result: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipLoadImageFromFile(filename: Pcwstr, image: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipLoadImageFromFileICM(filename: Pcwstr, image: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipLoadImageFromStream(stream: COpaquePointer?, image: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipLoadImageFromStreamICM(stream: COpaquePointer?, image: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipMeasureCharacterRanges(graphics: COpaquePointer?, string: Pcwstr, length: Int, font: COpaquePointer?, layoutrect: COpaquePointer?, stringformat: COpaquePointer?, regioncount: Int, regions: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipMeasureDriverString(graphics: COpaquePointer?, text: COpaquePointer?, length: Int, font: COpaquePointer?, positions: COpaquePointer?, flags: Int, matrix: COpaquePointer?, boundingbox: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipMeasureString(graphics: COpaquePointer?, string: Pcwstr, length: Int, font: COpaquePointer?, layoutrect: COpaquePointer?, stringformat: COpaquePointer?, boundingbox: COpaquePointer?, codepointsfitted: COpaquePointer?, linesfilled: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipMultiplyLineTransform(brush: COpaquePointer?, matrix: COpaquePointer?, order: MatrixOrder): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipMultiplyMatrix(matrix: COpaquePointer?, matrix2: COpaquePointer?, order: MatrixOrder): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipMultiplyPathGradientTransform(brush: COpaquePointer?, matrix: COpaquePointer?, order: MatrixOrder): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipMultiplyPenTransform(pen: COpaquePointer?, matrix: COpaquePointer?, order: MatrixOrder): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipMultiplyTextureTransform(brush: COpaquePointer?, matrix: COpaquePointer?, order: MatrixOrder): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipMultiplyWorldTransform(graphics: COpaquePointer?, matrix: COpaquePointer?, order: MatrixOrder): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipNewInstalledFontCollection(fontcollection: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipNewPrivateFontCollection(fontcollection: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipPathIterCopyData(iterator: COpaquePointer?, resultcount: COpaquePointer?, points: COpaquePointer?, types: COpaquePointer?, startindex: Int, endindex: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipPathIterEnumerate(iterator: COpaquePointer?, resultcount: COpaquePointer?, points: COpaquePointer?, types: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipPathIterGetCount(iterator: COpaquePointer?, count: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipPathIterGetSubpathCount(iterator: COpaquePointer?, count: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipPathIterHasCurve(iterator: COpaquePointer?, hascurve: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipPathIterIsValid(iterator: COpaquePointer?, valid: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipPathIterNextMarker(iterator: COpaquePointer?, resultcount: COpaquePointer?, startindex: COpaquePointer?, endindex: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipPathIterNextMarkerPath(iterator: COpaquePointer?, resultcount: COpaquePointer?, path: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipPathIterNextPathType(iterator: COpaquePointer?, resultcount: COpaquePointer?, pathtype: COpaquePointer?, startindex: COpaquePointer?, endindex: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipPathIterNextSubpath(iterator: COpaquePointer?, resultcount: COpaquePointer?, startindex: COpaquePointer?, endindex: COpaquePointer?, isclosed: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipPathIterNextSubpathPath(iterator: COpaquePointer?, resultcount: COpaquePointer?, path: COpaquePointer?, isclosed: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipPathIterRewind(iterator: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipPlayMetafileRecord(metafile: COpaquePointer?, recordtype: EmfPlusRecordType, flags: UInt, datasize: UInt, data: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipPrivateAddFontFile(fontcollection: COpaquePointer?, filename: Pcwstr): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipPrivateAddMemoryFont(fontcollection: COpaquePointer?, memory: COpaquePointer?, length: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipRecordMetafile(referencehdc: Hdc, type: EmfType, framerect: COpaquePointer?, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipRecordMetafileFileName(filename: Pcwstr, referencehdc: Hdc, type: EmfType, framerect: COpaquePointer?, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipRecordMetafileFileNameI(filename: Pcwstr, referencehdc: Hdc, type: EmfType, framerect: COpaquePointer?, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipRecordMetafileI(referencehdc: Hdc, type: EmfType, framerect: COpaquePointer?, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipRecordMetafileStream(stream: COpaquePointer?, referencehdc: Hdc, type: EmfType, framerect: COpaquePointer?, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipRecordMetafileStreamI(stream: COpaquePointer?, referencehdc: Hdc, type: EmfType, framerect: COpaquePointer?, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipReleaseDC(graphics: COpaquePointer?, hdc: Hdc): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipRemovePropertyItem(image: COpaquePointer?, propid: UInt): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipResetClip(graphics: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipResetImageAttributes(imageattr: COpaquePointer?, type: ColorAdjustType): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipResetLineTransform(brush: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipResetPageTransform(graphics: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipResetPath(path: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipResetPathGradientTransform(brush: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipResetPenTransform(pen: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipResetTextureTransform(brush: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipResetWorldTransform(graphics: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipRestoreGraphics(graphics: COpaquePointer?, state: UInt): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipReversePath(path: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipRotateLineTransform(brush: COpaquePointer?, angle: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipRotateMatrix(matrix: COpaquePointer?, angle: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipRotatePathGradientTransform(brush: COpaquePointer?, angle: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipRotatePenTransform(pen: COpaquePointer?, angle: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipRotateTextureTransform(brush: COpaquePointer?, angle: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipRotateWorldTransform(graphics: COpaquePointer?, angle: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSaveAdd(image: COpaquePointer?, encoderparams: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSaveAddImage(image: COpaquePointer?, newimage: COpaquePointer?, encoderparams: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSaveGraphics(graphics: COpaquePointer?, state: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSaveImageToFile(image: COpaquePointer?, filename: Pcwstr, clsidencoder: COpaquePointer?, encoderparams: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSaveImageToStream(image: COpaquePointer?, stream: COpaquePointer?, clsidencoder: COpaquePointer?, encoderparams: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipScaleLineTransform(brush: COpaquePointer?, sx: Float, sy: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipScaleMatrix(matrix: COpaquePointer?, scalex: Float, scaley: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipScalePathGradientTransform(brush: COpaquePointer?, sx: Float, sy: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipScalePenTransform(pen: COpaquePointer?, sx: Float, sy: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipScaleTextureTransform(brush: COpaquePointer?, sx: Float, sy: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipScaleWorldTransform(graphics: COpaquePointer?, sx: Float, sy: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetAdjustableArrowCapFillState(cap: COpaquePointer?, fillstate: Bool): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetAdjustableArrowCapHeight(cap: COpaquePointer?, height: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetAdjustableArrowCapMiddleInset(cap: COpaquePointer?, middleinset: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetAdjustableArrowCapWidth(cap: COpaquePointer?, width: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetClipGraphics(graphics: COpaquePointer?, srcgraphics: COpaquePointer?, combinemode: CombineMode): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetClipHrgn(graphics: COpaquePointer?, hrgn: Hrgn, combinemode: CombineMode): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetClipPath(graphics: COpaquePointer?, path: COpaquePointer?, combinemode: CombineMode): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetClipRect(graphics: COpaquePointer?, x: Float, y: Float, width: Float, height: Float, combinemode: CombineMode): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetClipRectI(graphics: COpaquePointer?, x: Int, y: Int, width: Int, height: Int, combinemode: CombineMode): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetClipRegion(graphics: COpaquePointer?, region: COpaquePointer?, combinemode: CombineMode): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetCompositingMode(graphics: COpaquePointer?, compositingmode: CompositingMode): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetCompositingQuality(graphics: COpaquePointer?, compositingquality: CompositingQuality): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetCustomLineCapBaseCap(customcap: COpaquePointer?, basecap: LineCap): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetCustomLineCapBaseInset(customcap: COpaquePointer?, inset: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetCustomLineCapStrokeCaps(customcap: COpaquePointer?, startcap: LineCap, endcap: LineCap): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetCustomLineCapStrokeJoin(customcap: COpaquePointer?, linejoin: LineJoin): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetCustomLineCapWidthScale(customcap: COpaquePointer?, widthscale: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetEffectParameters(effect: COpaquePointer?, params: COpaquePointer?, size: UInt): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetEmpty(region: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetImageAttributesCachedBackground(imageattr: COpaquePointer?, enableflag: Bool): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetImageAttributesColorKeys(imageattr: COpaquePointer?, type: ColorAdjustType, enableflag: Bool, colorlow: UInt, colorhigh: UInt): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetImageAttributesColorMatrix(imageattr: COpaquePointer?, type: ColorAdjustType, enableflag: Bool, colormatrix: COpaquePointer?, graymatrix: COpaquePointer?, flags: ColorMatrixFlags): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetImageAttributesGamma(imageattr: COpaquePointer?, type: ColorAdjustType, enableflag: Bool, gamma: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetImageAttributesNoOp(imageattr: COpaquePointer?, type: ColorAdjustType, enableflag: Bool): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetImageAttributesOutputChannel(imageattr: COpaquePointer?, type: ColorAdjustType, enableflag: Bool, channelflags: ColorChannelFlags): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetImageAttributesOutputChannelColorProfile(imageattr: COpaquePointer?, type: ColorAdjustType, enableflag: Bool, colorprofilefilename: Pcwstr): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetImageAttributesRemapTable(imageattr: COpaquePointer?, type: ColorAdjustType, enableflag: Bool, mapsize: UInt, map: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetImageAttributesThreshold(imageattr: COpaquePointer?, type: ColorAdjustType, enableflag: Bool, threshold: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetImageAttributesToIdentity(imageattr: COpaquePointer?, type: ColorAdjustType): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetImageAttributesWrapMode(imageattr: COpaquePointer?, wrap: WrapMode, argb: UInt, clamp: Bool): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetImagePalette(image: COpaquePointer?, palette: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetInfinite(region: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetInterpolationMode(graphics: COpaquePointer?, interpolationmode: InterpolationMode): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetLineBlend(brush: COpaquePointer?, blend: COpaquePointer?, positions: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetLineColors(brush: COpaquePointer?, color1: UInt, color2: UInt): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetLineGammaCorrection(brush: COpaquePointer?, usegammacorrection: Bool): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetLineLinearBlend(brush: COpaquePointer?, focus: Float, scale: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetLinePresetBlend(brush: COpaquePointer?, blend: COpaquePointer?, positions: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetLineSigmaBlend(brush: COpaquePointer?, focus: Float, scale: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetLineTransform(brush: COpaquePointer?, matrix: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetLineWrapMode(brush: COpaquePointer?, wrapmode: WrapMode): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetMatrixElements(matrix: COpaquePointer?, m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetMetafileDownLevelRasterizationLimit(metafile: COpaquePointer?, metafilerasterizationlimitdpi: UInt): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPageScale(graphics: COpaquePointer?, scale: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPageUnit(graphics: COpaquePointer?, unit: Unit): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPathFillMode(path: COpaquePointer?, fillmode: FillMode): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPathGradientBlend(brush: COpaquePointer?, blend: COpaquePointer?, positions: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPathGradientCenterColor(brush: COpaquePointer?, colors: UInt): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPathGradientCenterPoint(brush: COpaquePointer?, points: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPathGradientCenterPointI(brush: COpaquePointer?, points: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPathGradientFocusScales(brush: COpaquePointer?, xscale: Float, yscale: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPathGradientGammaCorrection(brush: COpaquePointer?, usegammacorrection: Bool): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPathGradientLinearBlend(brush: COpaquePointer?, focus: Float, scale: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPathGradientPath(brush: COpaquePointer?, path: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPathGradientPresetBlend(brush: COpaquePointer?, blend: COpaquePointer?, positions: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPathGradientSigmaBlend(brush: COpaquePointer?, focus: Float, scale: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPathGradientSurroundColorsWithCount(brush: COpaquePointer?, color: COpaquePointer?, count: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPathGradientTransform(brush: COpaquePointer?, matrix: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPathGradientWrapMode(brush: COpaquePointer?, wrapmode: WrapMode): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPathMarker(path: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPenBrushFill(pen: COpaquePointer?, brush: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPenColor(pen: COpaquePointer?, argb: UInt): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPenCompoundArray(pen: COpaquePointer?, dash: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPenCustomEndCap(pen: COpaquePointer?, customcap: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPenCustomStartCap(pen: COpaquePointer?, customcap: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPenDashArray(pen: COpaquePointer?, dash: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPenDashCap197819(pen: COpaquePointer?, dashcap: DashCap): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPenDashOffset(pen: COpaquePointer?, offset: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPenDashStyle(pen: COpaquePointer?, dashstyle: DashStyle): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPenEndCap(pen: COpaquePointer?, endcap: LineCap): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPenLineCap197819(pen: COpaquePointer?, startcap: LineCap, endcap: LineCap, dashcap: DashCap): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPenLineJoin(pen: COpaquePointer?, linejoin: LineJoin): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPenMiterLimit(pen: COpaquePointer?, miterlimit: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPenMode(pen: COpaquePointer?, penmode: PenAlignment): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPenStartCap(pen: COpaquePointer?, startcap: LineCap): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPenTransform(pen: COpaquePointer?, matrix: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPenUnit(pen: COpaquePointer?, unit: Unit): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPenWidth(pen: COpaquePointer?, width: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPixelOffsetMode(graphics: COpaquePointer?, pixeloffsetmode: PixelOffsetMode): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetPropertyItem(image: COpaquePointer?, item: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetRenderingOrigin(graphics: COpaquePointer?, x: Int, y: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetSmoothingMode(graphics: COpaquePointer?, smoothingmode: SmoothingMode): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetSolidFillColor(brush: COpaquePointer?, color: UInt): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetStringFormatAlign(format: COpaquePointer?, align: StringAlignment): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetStringFormatDigitSubstitution(format: COpaquePointer?, language: UShort, substitute: StringDigitSubstitute): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetStringFormatFlags(format: COpaquePointer?, flags: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetStringFormatHotkeyPrefix(format: COpaquePointer?, hotkeyprefix: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetStringFormatLineAlign(format: COpaquePointer?, align: StringAlignment): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetStringFormatMeasurableCharacterRanges(format: COpaquePointer?, rangecount: Int, ranges: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetStringFormatTabStops(format: COpaquePointer?, firsttaboffset: Float, count: Int, tabstops: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetStringFormatTrimming(format: COpaquePointer?, trimming: StringTrimming): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetTextContrast(graphics: COpaquePointer?, contrast: UInt): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetTextRenderingHint(graphics: COpaquePointer?, mode: TextRenderingHint): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetTextureTransform(brush: COpaquePointer?, matrix: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetTextureWrapMode(brush: COpaquePointer?, wrapmode: WrapMode): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipSetWorldTransform(graphics: COpaquePointer?, matrix: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipShearMatrix(matrix: COpaquePointer?, shearx: Float, sheary: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipStartPathFigure(path: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipStringFormatGetGenericDefault(format: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipStringFormatGetGenericTypographic(format: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipTestControl(control: GpTestControlEnum, param1: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipTransformMatrixPoints(matrix: COpaquePointer?, pts: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipTransformMatrixPointsI(matrix: COpaquePointer?, pts: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipTransformPath(path: COpaquePointer?, matrix: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipTransformPoints(graphics: COpaquePointer?, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipTransformPointsI(graphics: COpaquePointer?, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipTransformRegion(region: COpaquePointer?, matrix: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipTranslateClip(graphics: COpaquePointer?, dx: Float, dy: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipTranslateClipI(graphics: COpaquePointer?, dx: Int, dy: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipTranslateLineTransform(brush: COpaquePointer?, dx: Float, dy: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipTranslateMatrix(matrix: COpaquePointer?, offsetx: Float, offsety: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipTranslatePathGradientTransform(brush: COpaquePointer?, dx: Float, dy: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipTranslatePenTransform(pen: COpaquePointer?, dx: Float, dy: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipTranslateRegion(region: COpaquePointer?, dx: Float, dy: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipTranslateRegionI(region: COpaquePointer?, dx: Int, dy: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipTranslateTextureTransform(brush: COpaquePointer?, dx: Float, dy: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipTranslateWorldTransform(graphics: COpaquePointer?, dx: Float, dy: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipVectorTransformMatrixPoints(matrix: COpaquePointer?, pts: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipVectorTransformMatrixPointsI(matrix: COpaquePointer?, pts: COpaquePointer?, count: Int): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipWarpPath(path: COpaquePointer?, matrix: COpaquePointer?, points: COpaquePointer?, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, warpmode: WarpMode, flatness: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipWidenPath(nativepath: COpaquePointer?, pen: COpaquePointer?, matrix: COpaquePointer?, flatness: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdipWindingModeOutline(path: COpaquePointer?, matrix: COpaquePointer?, flatness: Float): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdiplusNotificationHook(token: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdiplusNotificationUnhook(token: ULong): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdiplusShutdown(token: ULong): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun gdiplusStartup(token: COpaquePointer?, input: COpaquePointer?, output: COpaquePointer?): Status =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
