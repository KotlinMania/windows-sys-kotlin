@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun gdipAddPathArc(path: MutPtr, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathArc")

public actual fun gdipAddPathArcI(path: MutPtr, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathArcI")

public actual fun gdipAddPathBezier(path: MutPtr, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathBezier")

public actual fun gdipAddPathBezierI(path: MutPtr, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathBezierI")

public actual fun gdipAddPathBeziers(path: MutPtr, points: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathBeziers")

public actual fun gdipAddPathBeziersI(path: MutPtr, points: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathBeziersI")

public actual fun gdipAddPathClosedCurve(path: MutPtr, points: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurve")

public actual fun gdipAddPathClosedCurve2(path: MutPtr, points: ConstPtr, count: Int, tension: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurve2")

public actual fun gdipAddPathClosedCurve2I(path: MutPtr, points: ConstPtr, count: Int, tension: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurve2I")

public actual fun gdipAddPathClosedCurveI(path: MutPtr, points: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurveI")

public actual fun gdipAddPathCurve(path: MutPtr, points: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve")

public actual fun gdipAddPathCurve2(path: MutPtr, points: ConstPtr, count: Int, tension: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve2")

public actual fun gdipAddPathCurve2I(path: MutPtr, points: ConstPtr, count: Int, tension: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve2I")

public actual fun gdipAddPathCurve3(path: MutPtr, points: ConstPtr, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve3")

public actual fun gdipAddPathCurve3I(path: MutPtr, points: ConstPtr, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve3I")

public actual fun gdipAddPathCurveI(path: MutPtr, points: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurveI")

public actual fun gdipAddPathEllipse(path: MutPtr, x: Float, y: Float, width: Float, height: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathEllipse")

public actual fun gdipAddPathEllipseI(path: MutPtr, x: Int, y: Int, width: Int, height: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathEllipseI")

public actual fun gdipAddPathLine(path: MutPtr, x1: Float, y1: Float, x2: Float, y2: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathLine")

public actual fun gdipAddPathLine2(path: MutPtr, points: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathLine2")

public actual fun gdipAddPathLine2I(path: MutPtr, points: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathLine2I")

public actual fun gdipAddPathLineI(path: MutPtr, x1: Int, y1: Int, x2: Int, y2: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathLineI")

public actual fun gdipAddPathPath(path: MutPtr, addingpath: ConstPtr, connect: Bool): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathPath")

public actual fun gdipAddPathPie(path: MutPtr, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathPie")

public actual fun gdipAddPathPieI(path: MutPtr, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathPieI")

public actual fun gdipAddPathPolygon(path: MutPtr, points: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathPolygon")

public actual fun gdipAddPathPolygonI(path: MutPtr, points: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathPolygonI")

public actual fun gdipAddPathRectangle(path: MutPtr, x: Float, y: Float, width: Float, height: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectangle")

public actual fun gdipAddPathRectangleI(path: MutPtr, x: Int, y: Int, width: Int, height: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectangleI")

public actual fun gdipAddPathRectangles(path: MutPtr, rects: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectangles")

public actual fun gdipAddPathRectanglesI(path: MutPtr, rects: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectanglesI")

public actual fun gdipAddPathString(path: MutPtr, string: Pcwstr, length: Int, family: ConstPtr, style: Int, emsize: Float, layoutrect: ConstPtr, format: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathString")

public actual fun gdipAddPathStringI(path: MutPtr, string: Pcwstr, length: Int, family: ConstPtr, style: Int, emsize: Float, layoutrect: ConstPtr, format: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathStringI")

public actual fun gdipAlloc(size: ULong): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAlloc")

public actual fun gdipBeginContainer(graphics: MutPtr, dstrect: ConstPtr, srcrect: ConstPtr, unit: Unit, state: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipBeginContainer")

public actual fun gdipBeginContainer2(graphics: MutPtr, state: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipBeginContainer2")

public actual fun gdipBeginContainerI(graphics: MutPtr, dstrect: ConstPtr, srcrect: ConstPtr, unit: Unit, state: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipBeginContainerI")

public actual fun gdipBitmapApplyEffect(bitmap: MutPtr, effect: MutPtr, roi: MutPtr, useauxdata: Bool, auxdata: MutPtr, auxdatasize: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipBitmapApplyEffect")

public actual fun gdipBitmapConvertFormat(pinputbitmap: MutPtr, format: Int, dithertype: DitherType, palettetype: PaletteType, palette: MutPtr, alphathresholdpercent: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipBitmapConvertFormat")

public actual fun gdipBitmapCreateApplyEffect(inputbitmaps: MutPtr, numinputs: Int, effect: MutPtr, roi: MutPtr, outputrect: MutPtr, outputbitmap: MutPtr, useauxdata: Bool, auxdata: MutPtr, auxdatasize: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipBitmapCreateApplyEffect")

public actual fun gdipBitmapGetHistogram(bitmap: MutPtr, format: HistogramFormat, numberofentries: UInt, channel0: MutPtr, channel1: MutPtr, channel2: MutPtr, channel3: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipBitmapGetHistogram")

public actual fun gdipBitmapGetHistogramSize(format: HistogramFormat, numberofentries: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipBitmapGetHistogramSize")

public actual fun gdipBitmapGetPixel(bitmap: MutPtr, x: Int, y: Int, color: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipBitmapGetPixel")

public actual fun gdipBitmapLockBits(bitmap: MutPtr, rect: ConstPtr, flags: UInt, format: Int, lockedbitmapdata: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipBitmapLockBits")

public actual fun gdipBitmapSetPixel(bitmap: MutPtr, x: Int, y: Int, color: UInt): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipBitmapSetPixel")

public actual fun gdipBitmapSetResolution(bitmap: MutPtr, xdpi: Float, ydpi: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipBitmapSetResolution")

public actual fun gdipBitmapUnlockBits(bitmap: MutPtr, lockedbitmapdata: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipBitmapUnlockBits")

public actual fun gdipClearPathMarkers(path: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipClearPathMarkers")

public actual fun gdipCloneBitmapArea(x: Float, y: Float, width: Float, height: Float, format: Int, srcbitmap: MutPtr, dstbitmap: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCloneBitmapArea")

public actual fun gdipCloneBitmapAreaI(x: Int, y: Int, width: Int, height: Int, format: Int, srcbitmap: MutPtr, dstbitmap: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCloneBitmapAreaI")

public actual fun gdipCloneBrush(brush: MutPtr, clonebrush: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCloneBrush")

public actual fun gdipCloneCustomLineCap(customcap: MutPtr, clonedcap: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCloneCustomLineCap")

public actual fun gdipCloneFont(font: MutPtr, clonefont: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCloneFont")

public actual fun gdipCloneFontFamily(fontfamily: MutPtr, clonedfontfamily: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCloneFontFamily")

public actual fun gdipCloneImage(image: MutPtr, cloneimage: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCloneImage")

public actual fun gdipCloneImageAttributes(imageattr: ConstPtr, cloneimageattr: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCloneImageAttributes")

public actual fun gdipCloneMatrix(matrix: MutPtr, clonematrix: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCloneMatrix")

public actual fun gdipClonePath(path: MutPtr, clonepath: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipClonePath")

public actual fun gdipClonePen(pen: MutPtr, clonepen: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipClonePen")

public actual fun gdipCloneRegion(region: MutPtr, cloneregion: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCloneRegion")

public actual fun gdipCloneStringFormat(format: ConstPtr, newformat: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCloneStringFormat")

public actual fun gdipClosePathFigure(path: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipClosePathFigure")

public actual fun gdipClosePathFigures(path: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipClosePathFigures")

public actual fun gdipCombineRegionPath(region: MutPtr, path: MutPtr, combinemode: CombineMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionPath")

public actual fun gdipCombineRegionRect(region: MutPtr, rect: ConstPtr, combinemode: CombineMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionRect")

public actual fun gdipCombineRegionRectI(region: MutPtr, rect: ConstPtr, combinemode: CombineMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionRectI")

public actual fun gdipCombineRegionRegion(region: MutPtr, region2: MutPtr, combinemode: CombineMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionRegion")

public actual fun gdipComment(graphics: MutPtr, sizedata: UInt, data: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipComment")

public actual fun gdipConvertToEmfPlus(refgraphics: ConstPtr, metafile: MutPtr, conversionfailureflag: MutPtr, emftype: EmfType, description: Pcwstr, outMetafile: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipConvertToEmfPlus")

public actual fun gdipConvertToEmfPlusToFile(refgraphics: ConstPtr, metafile: MutPtr, conversionfailureflag: MutPtr, filename: Pcwstr, emftype: EmfType, description: Pcwstr, outMetafile: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipConvertToEmfPlusToFile")

public actual fun gdipConvertToEmfPlusToStream(refgraphics: ConstPtr, metafile: MutPtr, conversionfailureflag: MutPtr, stream: MutPtr, emftype: EmfType, description: Pcwstr, outMetafile: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipConvertToEmfPlusToStream")

public actual fun gdipCreateAdjustableArrowCap(height: Float, width: Float, isfilled: Bool, cap: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateAdjustableArrowCap")

public actual fun gdipCreateBitmapFromFile(filename: Pcwstr, bitmap: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromFile")

public actual fun gdipCreateBitmapFromFileICM(filename: Pcwstr, bitmap: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromFileICM")

public actual fun gdipCreateBitmapFromGdiDib(gdibitmapinfo: ConstPtr, gdibitmapdata: MutPtr, bitmap: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromGdiDib")

public actual fun gdipCreateBitmapFromGraphics(width: Int, height: Int, target: MutPtr, bitmap: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromGraphics")

public actual fun gdipCreateBitmapFromHBITMAP(hbm: Hbitmap, hpal: Hpalette, bitmap: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromHBITMAP")

public actual fun gdipCreateBitmapFromHICON(hicon: Hicon, bitmap: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromHICON")

public actual fun gdipCreateBitmapFromResource(hinstance: Hinstance, lpbitmapname: Pcwstr, bitmap: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromResource")

public actual fun gdipCreateBitmapFromScan0(width: Int, height: Int, stride: Int, format: Int, scan0: ConstPtr, bitmap: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromScan0")

public actual fun gdipCreateBitmapFromStream(stream: MutPtr, bitmap: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromStream")

public actual fun gdipCreateBitmapFromStreamICM(stream: MutPtr, bitmap: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromStreamICM")

public actual fun gdipCreateCachedBitmap(bitmap: MutPtr, graphics: MutPtr, cachedbitmap: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateCachedBitmap")

public actual fun gdipCreateCustomLineCap(fillpath: MutPtr, strokepath: MutPtr, basecap: LineCap, baseinset: Float, customcap: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateCustomLineCap")

public actual fun gdipCreateEffect(guid: Guid, effect: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateEffect")

public actual fun gdipCreateFont(fontfamily: ConstPtr, emsize: Float, style: Int, unit: Unit, font: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateFont")

public actual fun gdipCreateFontFamilyFromName(name: Pcwstr, fontcollection: MutPtr, fontfamily: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFamilyFromName")

public actual fun gdipCreateFontFromDC(hdc: Hdc, font: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFromDC")

public actual fun gdipCreateFontFromLogfontA(hdc: Hdc, logfont: ConstPtr, font: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFromLogfontA")

public actual fun gdipCreateFontFromLogfontW(hdc: Hdc, logfont: ConstPtr, font: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFromLogfontW")

public actual fun gdipCreateFromHDC(hdc: Hdc, graphics: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHDC")

public actual fun gdipCreateFromHDC2(hdc: Hdc, hdevice: Handle, graphics: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHDC2")

public actual fun gdipCreateFromHWND(hwnd: Hwnd, graphics: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHWND")

public actual fun gdipCreateFromHWNDICM(hwnd: Hwnd, graphics: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHWNDICM")

public actual fun gdipCreateHBITMAPFromBitmap(bitmap: MutPtr, hbmreturn: MutPtr, background: UInt): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateHBITMAPFromBitmap")

public actual fun gdipCreateHICONFromBitmap(bitmap: MutPtr, hbmreturn: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateHICONFromBitmap")

public actual fun gdipCreateHalftonePalette(): Hpalette =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateHalftonePalette")

public actual fun gdipCreateHatchBrush(hatchstyle: HatchStyle, forecol: UInt, backcol: UInt, brush: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateHatchBrush")

public actual fun gdipCreateImageAttributes(imageattr: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateImageAttributes")

public actual fun gdipCreateLineBrush(point1: ConstPtr, point2: ConstPtr, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrush")

public actual fun gdipCreateLineBrushFromRect(rect: ConstPtr, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRect")

public actual fun gdipCreateLineBrushFromRectI(rect: ConstPtr, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRectI")

public actual fun gdipCreateLineBrushFromRectWithAngle(rect: ConstPtr, color1: UInt, color2: UInt, angle: Float, isanglescalable: Bool, wrapmode: WrapMode, linegradient: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRectWithAngle")

public actual fun gdipCreateLineBrushFromRectWithAngleI(rect: ConstPtr, color1: UInt, color2: UInt, angle: Float, isanglescalable: Bool, wrapmode: WrapMode, linegradient: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRectWithAngleI")

public actual fun gdipCreateLineBrushI(point1: ConstPtr, point2: ConstPtr, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushI")

public actual fun gdipCreateMatrix(matrix: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix")

public actual fun gdipCreateMatrix2(m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float, matrix: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix2")

public actual fun gdipCreateMatrix3(rect: ConstPtr, dstplg: ConstPtr, matrix: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix3")

public actual fun gdipCreateMatrix3I(rect: ConstPtr, dstplg: ConstPtr, matrix: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix3I")

public actual fun gdipCreateMetafileFromEmf(hemf: Henhmetafile, deleteemf: Bool, metafile: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromEmf")

public actual fun gdipCreateMetafileFromFile(file: Pcwstr, metafile: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromFile")

public actual fun gdipCreateMetafileFromStream(stream: MutPtr, metafile: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromStream")

public actual fun gdipCreateMetafileFromWmf(hwmf: Hmetafile, deletewmf: Bool, wmfplaceablefileheader: ConstPtr, metafile: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromWmf")

public actual fun gdipCreateMetafileFromWmfFile(file: Pcwstr, wmfplaceablefileheader: ConstPtr, metafile: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromWmfFile")

public actual fun gdipCreatePath(brushmode: FillMode, path: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreatePath")

public actual fun gdipCreatePath2(param0: ConstPtr, param1: ConstPtr, param2: Int, param3: FillMode, path: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreatePath2")

public actual fun gdipCreatePath2I(param0: ConstPtr, param1: ConstPtr, param2: Int, param3: FillMode, path: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreatePath2I")

public actual fun gdipCreatePathGradient(points: ConstPtr, count: Int, wrapmode: WrapMode, polygradient: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreatePathGradient")

public actual fun gdipCreatePathGradientFromPath(path: ConstPtr, polygradient: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreatePathGradientFromPath")

public actual fun gdipCreatePathGradientI(points: ConstPtr, count: Int, wrapmode: WrapMode, polygradient: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreatePathGradientI")

public actual fun gdipCreatePathIter(iterator: MutPtr, path: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreatePathIter")

public actual fun gdipCreatePen1(color: UInt, width: Float, unit: Unit, pen: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreatePen1")

public actual fun gdipCreatePen2(brush: MutPtr, width: Float, unit: Unit, pen: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreatePen2")

public actual fun gdipCreateRegion(region: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateRegion")

public actual fun gdipCreateRegionHrgn(hrgn: Hrgn, region: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionHrgn")

public actual fun gdipCreateRegionPath(path: MutPtr, region: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionPath")

public actual fun gdipCreateRegionRect(rect: ConstPtr, region: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionRect")

public actual fun gdipCreateRegionRectI(rect: ConstPtr, region: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionRectI")

public actual fun gdipCreateRegionRgnData(regiondata: ConstPtr, size: Int, region: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionRgnData")

public actual fun gdipCreateSolidFill(color: UInt, brush: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateSolidFill")

public actual fun gdipCreateStreamOnFile(filename: Pcwstr, access: UInt, stream: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateStreamOnFile")

public actual fun gdipCreateStringFormat(formatattributes: Int, language: UShort, format: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateStringFormat")

public actual fun gdipCreateTexture(image: MutPtr, wrapmode: WrapMode, texture: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateTexture")

public actual fun gdipCreateTexture2(image: MutPtr, wrapmode: WrapMode, x: Float, y: Float, width: Float, height: Float, texture: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateTexture2")

public actual fun gdipCreateTexture2I(image: MutPtr, wrapmode: WrapMode, x: Int, y: Int, width: Int, height: Int, texture: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateTexture2I")

public actual fun gdipCreateTextureIA(image: MutPtr, imageattributes: ConstPtr, x: Float, y: Float, width: Float, height: Float, texture: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateTextureIA")

public actual fun gdipCreateTextureIAI(image: MutPtr, imageattributes: ConstPtr, x: Int, y: Int, width: Int, height: Int, texture: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateTextureIAI")

public actual fun gdipDeleteBrush(brush: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDeleteBrush")

public actual fun gdipDeleteCachedBitmap(cachedbitmap: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDeleteCachedBitmap")

public actual fun gdipDeleteCustomLineCap(customcap: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDeleteCustomLineCap")

public actual fun gdipDeleteEffect(effect: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDeleteEffect")

public actual fun gdipDeleteFont(font: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDeleteFont")

public actual fun gdipDeleteFontFamily(fontfamily: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDeleteFontFamily")

public actual fun gdipDeleteGraphics(graphics: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDeleteGraphics")

public actual fun gdipDeleteMatrix(matrix: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDeleteMatrix")

public actual fun gdipDeletePath(path: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDeletePath")

public actual fun gdipDeletePathIter(iterator: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDeletePathIter")

public actual fun gdipDeletePen(pen: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDeletePen")

public actual fun gdipDeletePrivateFontCollection(fontcollection: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDeletePrivateFontCollection")

public actual fun gdipDeleteRegion(region: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDeleteRegion")

public actual fun gdipDeleteStringFormat(format: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDeleteStringFormat")

public actual fun gdipDisposeImage(image: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDisposeImage")

public actual fun gdipDisposeImageAttributes(imageattr: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDisposeImageAttributes")

public actual fun gdipDrawArc(graphics: MutPtr, pen: MutPtr, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawArc")

public actual fun gdipDrawArcI(graphics: MutPtr, pen: MutPtr, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawArcI")

public actual fun gdipDrawBezier(graphics: MutPtr, pen: MutPtr, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawBezier")

public actual fun gdipDrawBezierI(graphics: MutPtr, pen: MutPtr, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawBezierI")

public actual fun gdipDrawBeziers(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawBeziers")

public actual fun gdipDrawBeziersI(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawBeziersI")

public actual fun gdipDrawCachedBitmap(graphics: MutPtr, cachedbitmap: MutPtr, x: Int, y: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawCachedBitmap")

public actual fun gdipDrawClosedCurve(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurve")

public actual fun gdipDrawClosedCurve2(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int, tension: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurve2")

public actual fun gdipDrawClosedCurve2I(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int, tension: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurve2I")

public actual fun gdipDrawClosedCurveI(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurveI")

public actual fun gdipDrawCurve(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve")

public actual fun gdipDrawCurve2(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int, tension: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve2")

public actual fun gdipDrawCurve2I(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int, tension: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve2I")

public actual fun gdipDrawCurve3(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve3")

public actual fun gdipDrawCurve3I(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve3I")

public actual fun gdipDrawCurveI(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawCurveI")

public actual fun gdipDrawDriverString(graphics: MutPtr, text: ConstPtr, length: Int, font: ConstPtr, brush: ConstPtr, positions: ConstPtr, flags: Int, matrix: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawDriverString")

public actual fun gdipDrawEllipse(graphics: MutPtr, pen: MutPtr, x: Float, y: Float, width: Float, height: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawEllipse")

public actual fun gdipDrawEllipseI(graphics: MutPtr, pen: MutPtr, x: Int, y: Int, width: Int, height: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawEllipseI")

public actual fun gdipDrawImage(graphics: MutPtr, image: MutPtr, x: Float, y: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawImage")

public actual fun gdipDrawImageFX(graphics: MutPtr, image: MutPtr, source: MutPtr, xform: MutPtr, effect: MutPtr, imageattributes: MutPtr, srcunit: Unit): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawImageFX")

public actual fun gdipDrawImageI(graphics: MutPtr, image: MutPtr, x: Int, y: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawImageI")

public actual fun gdipDrawImagePointRect(graphics: MutPtr, image: MutPtr, x: Float, y: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointRect")

public actual fun gdipDrawImagePointRectI(graphics: MutPtr, image: MutPtr, x: Int, y: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointRectI")

public actual fun gdipDrawImagePoints(graphics: MutPtr, image: MutPtr, dstpoints: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePoints")

public actual fun gdipDrawImagePointsI(graphics: MutPtr, image: MutPtr, dstpoints: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointsI")

public actual fun gdipDrawImagePointsRect(graphics: MutPtr, image: MutPtr, points: ConstPtr, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: ConstPtr, callback: Long, callbackdata: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointsRect")

public actual fun gdipDrawImagePointsRectI(graphics: MutPtr, image: MutPtr, points: ConstPtr, count: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: ConstPtr, callback: Long, callbackdata: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointsRectI")

public actual fun gdipDrawImageRect(graphics: MutPtr, image: MutPtr, x: Float, y: Float, width: Float, height: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRect")

public actual fun gdipDrawImageRectI(graphics: MutPtr, image: MutPtr, x: Int, y: Int, width: Int, height: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRectI")

public actual fun gdipDrawImageRectRect(graphics: MutPtr, image: MutPtr, dstx: Float, dsty: Float, dstwidth: Float, dstheight: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: ConstPtr, callback: Long, callbackdata: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRectRect")

public actual fun gdipDrawImageRectRectI(graphics: MutPtr, image: MutPtr, dstx: Int, dsty: Int, dstwidth: Int, dstheight: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: ConstPtr, callback: Long, callbackdata: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRectRectI")

public actual fun gdipDrawLine(graphics: MutPtr, pen: MutPtr, x1: Float, y1: Float, x2: Float, y2: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawLine")

public actual fun gdipDrawLineI(graphics: MutPtr, pen: MutPtr, x1: Int, y1: Int, x2: Int, y2: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawLineI")

public actual fun gdipDrawLines(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawLines")

public actual fun gdipDrawLinesI(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawLinesI")

public actual fun gdipDrawPath(graphics: MutPtr, pen: MutPtr, path: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawPath")

public actual fun gdipDrawPie(graphics: MutPtr, pen: MutPtr, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawPie")

public actual fun gdipDrawPieI(graphics: MutPtr, pen: MutPtr, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawPieI")

public actual fun gdipDrawPolygon(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawPolygon")

public actual fun gdipDrawPolygonI(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawPolygonI")

public actual fun gdipDrawRectangle(graphics: MutPtr, pen: MutPtr, x: Float, y: Float, width: Float, height: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawRectangle")

public actual fun gdipDrawRectangleI(graphics: MutPtr, pen: MutPtr, x: Int, y: Int, width: Int, height: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawRectangleI")

public actual fun gdipDrawRectangles(graphics: MutPtr, pen: MutPtr, rects: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawRectangles")

public actual fun gdipDrawRectanglesI(graphics: MutPtr, pen: MutPtr, rects: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawRectanglesI")

public actual fun gdipDrawString(graphics: MutPtr, string: Pcwstr, length: Int, font: ConstPtr, layoutrect: ConstPtr, stringformat: ConstPtr, brush: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawString")

public actual fun gdipEmfToWmfBits(hemf: Henhmetafile, cbdata16: UInt, pdata16: MutPtr, imapmode: Int, eflags: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipEmfToWmfBits")

public actual fun gdipEndContainer(graphics: MutPtr, state: UInt): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipEndContainer")

public actual fun gdipEnumerateMetafileDestPoint(graphics: MutPtr, metafile: ConstPtr, destpoint: ConstPtr, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPoint")

public actual fun gdipEnumerateMetafileDestPointI(graphics: MutPtr, metafile: ConstPtr, destpoint: ConstPtr, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPointI")

public actual fun gdipEnumerateMetafileDestPoints(graphics: MutPtr, metafile: ConstPtr, destpoints: ConstPtr, count: Int, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPoints")

public actual fun gdipEnumerateMetafileDestPointsI(graphics: MutPtr, metafile: ConstPtr, destpoints: ConstPtr, count: Int, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPointsI")

public actual fun gdipEnumerateMetafileDestRect(graphics: MutPtr, metafile: ConstPtr, destrect: ConstPtr, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestRect")

public actual fun gdipEnumerateMetafileDestRectI(graphics: MutPtr, metafile: ConstPtr, destrect: ConstPtr, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestRectI")

public actual fun gdipEnumerateMetafileSrcRectDestPoint(graphics: MutPtr, metafile: ConstPtr, destpoint: ConstPtr, srcrect: ConstPtr, srcunit: Unit, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPoint")

public actual fun gdipEnumerateMetafileSrcRectDestPointI(graphics: MutPtr, metafile: ConstPtr, destpoint: ConstPtr, srcrect: ConstPtr, srcunit: Unit, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPointI")

public actual fun gdipEnumerateMetafileSrcRectDestPoints(graphics: MutPtr, metafile: ConstPtr, destpoints: ConstPtr, count: Int, srcrect: ConstPtr, srcunit: Unit, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPoints")

public actual fun gdipEnumerateMetafileSrcRectDestPointsI(graphics: MutPtr, metafile: ConstPtr, destpoints: ConstPtr, count: Int, srcrect: ConstPtr, srcunit: Unit, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPointsI")

public actual fun gdipEnumerateMetafileSrcRectDestRect(graphics: MutPtr, metafile: ConstPtr, destrect: ConstPtr, srcrect: ConstPtr, srcunit: Unit, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestRect")

public actual fun gdipEnumerateMetafileSrcRectDestRectI(graphics: MutPtr, metafile: ConstPtr, destrect: ConstPtr, srcrect: ConstPtr, srcunit: Unit, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestRectI")

public actual fun gdipFillClosedCurve(graphics: MutPtr, brush: MutPtr, points: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurve")

public actual fun gdipFillClosedCurve2(graphics: MutPtr, brush: MutPtr, points: ConstPtr, count: Int, tension: Float, fillmode: FillMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurve2")

public actual fun gdipFillClosedCurve2I(graphics: MutPtr, brush: MutPtr, points: ConstPtr, count: Int, tension: Float, fillmode: FillMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurve2I")

public actual fun gdipFillClosedCurveI(graphics: MutPtr, brush: MutPtr, points: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurveI")

public actual fun gdipFillEllipse(graphics: MutPtr, brush: MutPtr, x: Float, y: Float, width: Float, height: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillEllipse")

public actual fun gdipFillEllipseI(graphics: MutPtr, brush: MutPtr, x: Int, y: Int, width: Int, height: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillEllipseI")

public actual fun gdipFillPath(graphics: MutPtr, brush: MutPtr, path: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillPath")

public actual fun gdipFillPie(graphics: MutPtr, brush: MutPtr, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillPie")

public actual fun gdipFillPieI(graphics: MutPtr, brush: MutPtr, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillPieI")

public actual fun gdipFillPolygon(graphics: MutPtr, brush: MutPtr, points: ConstPtr, count: Int, fillmode: FillMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillPolygon")

public actual fun gdipFillPolygon2(graphics: MutPtr, brush: MutPtr, points: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillPolygon2")

public actual fun gdipFillPolygon2I(graphics: MutPtr, brush: MutPtr, points: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillPolygon2I")

public actual fun gdipFillPolygonI(graphics: MutPtr, brush: MutPtr, points: ConstPtr, count: Int, fillmode: FillMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillPolygonI")

public actual fun gdipFillRectangle(graphics: MutPtr, brush: MutPtr, x: Float, y: Float, width: Float, height: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillRectangle")

public actual fun gdipFillRectangleI(graphics: MutPtr, brush: MutPtr, x: Int, y: Int, width: Int, height: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillRectangleI")

public actual fun gdipFillRectangles(graphics: MutPtr, brush: MutPtr, rects: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillRectangles")

public actual fun gdipFillRectanglesI(graphics: MutPtr, brush: MutPtr, rects: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillRectanglesI")

public actual fun gdipFillRegion(graphics: MutPtr, brush: MutPtr, region: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillRegion")

public actual fun gdipFindFirstImageItem(image: MutPtr, item: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFindFirstImageItem")

public actual fun gdipFindNextImageItem(image: MutPtr, item: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFindNextImageItem")

public actual fun gdipFlattenPath(path: MutPtr, matrix: MutPtr, flatness: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFlattenPath")

public actual fun gdipFlush(graphics: MutPtr, intention: FlushIntention): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFlush")

public actual fun gdipFree(ptr: MutPtr): kotlin.Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFree")

public actual fun gdipGetAdjustableArrowCapFillState(cap: MutPtr, fillstate: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapFillState")

public actual fun gdipGetAdjustableArrowCapHeight(cap: MutPtr, height: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapHeight")

public actual fun gdipGetAdjustableArrowCapMiddleInset(cap: MutPtr, middleinset: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapMiddleInset")

public actual fun gdipGetAdjustableArrowCapWidth(cap: MutPtr, width: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapWidth")

public actual fun gdipGetAllPropertyItems(image: MutPtr, totalbuffersize: UInt, numproperties: UInt, allitems: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetAllPropertyItems")

public actual fun gdipGetBrushType(brush: MutPtr, type: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetBrushType")

public actual fun gdipGetCellAscent(family: ConstPtr, style: Int, cellascent: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetCellAscent")

public actual fun gdipGetCellDescent(family: ConstPtr, style: Int, celldescent: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetCellDescent")

public actual fun gdipGetClip(graphics: MutPtr, region: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetClip")

public actual fun gdipGetClipBounds(graphics: MutPtr, rect: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetClipBounds")

public actual fun gdipGetClipBoundsI(graphics: MutPtr, rect: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetClipBoundsI")

public actual fun gdipGetCompositingMode(graphics: MutPtr, compositingmode: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetCompositingMode")

public actual fun gdipGetCompositingQuality(graphics: MutPtr, compositingquality: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetCompositingQuality")

public actual fun gdipGetCustomLineCapBaseCap(customcap: MutPtr, basecap: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapBaseCap")

public actual fun gdipGetCustomLineCapBaseInset(customcap: MutPtr, inset: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapBaseInset")

public actual fun gdipGetCustomLineCapStrokeCaps(customcap: MutPtr, startcap: MutPtr, endcap: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapStrokeCaps")

public actual fun gdipGetCustomLineCapStrokeJoin(customcap: MutPtr, linejoin: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapStrokeJoin")

public actual fun gdipGetCustomLineCapType(customcap: MutPtr, captype: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapType")

public actual fun gdipGetCustomLineCapWidthScale(customcap: MutPtr, widthscale: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapWidthScale")

public actual fun gdipGetDC(graphics: MutPtr, hdc: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetDC")

public actual fun gdipGetDpiX(graphics: MutPtr, dpi: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetDpiX")

public actual fun gdipGetDpiY(graphics: MutPtr, dpi: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetDpiY")

public actual fun gdipGetEffectParameterSize(effect: MutPtr, size: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetEffectParameterSize")

public actual fun gdipGetEffectParameters(effect: MutPtr, size: MutPtr, params: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetEffectParameters")

public actual fun gdipGetEmHeight(family: ConstPtr, style: Int, emheight: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetEmHeight")

public actual fun gdipGetEncoderParameterList(image: MutPtr, clsidencoder: ConstPtr, size: UInt, buffer: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetEncoderParameterList")

public actual fun gdipGetEncoderParameterListSize(image: MutPtr, clsidencoder: ConstPtr, size: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetEncoderParameterListSize")

public actual fun gdipGetFamily(font: MutPtr, family: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetFamily")

public actual fun gdipGetFamilyName(family: ConstPtr, name: Pwstr, language: UShort): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetFamilyName")

public actual fun gdipGetFontCollectionFamilyCount(fontcollection: MutPtr, numfound: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetFontCollectionFamilyCount")

public actual fun gdipGetFontCollectionFamilyList(fontcollection: ConstPtr, numsought: Int, gpfamilies: MutPtr, numfound: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetFontCollectionFamilyList")

public actual fun gdipGetFontHeight(font: ConstPtr, graphics: ConstPtr, height: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetFontHeight")

public actual fun gdipGetFontHeightGivenDPI(font: ConstPtr, dpi: Float, height: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetFontHeightGivenDPI")

public actual fun gdipGetFontSize(font: MutPtr, size: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetFontSize")

public actual fun gdipGetFontStyle(font: MutPtr, style: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetFontStyle")

public actual fun gdipGetFontUnit(font: MutPtr, unit: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetFontUnit")

public actual fun gdipGetGenericFontFamilyMonospace(nativefamily: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetGenericFontFamilyMonospace")

public actual fun gdipGetGenericFontFamilySansSerif(nativefamily: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetGenericFontFamilySansSerif")

public actual fun gdipGetGenericFontFamilySerif(nativefamily: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetGenericFontFamilySerif")

public actual fun gdipGetHatchBackgroundColor(brush: MutPtr, backcol: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetHatchBackgroundColor")

public actual fun gdipGetHatchForegroundColor(brush: MutPtr, forecol: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetHatchForegroundColor")

public actual fun gdipGetHatchStyle(brush: MutPtr, hatchstyle: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetHatchStyle")

public actual fun gdipGetHemfFromMetafile(metafile: MutPtr, hemf: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetHemfFromMetafile")

public actual fun gdipGetImageAttributesAdjustedPalette(imageattr: MutPtr, colorpalette: MutPtr, coloradjusttype: ColorAdjustType): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageAttributesAdjustedPalette")

public actual fun gdipGetImageBounds(image: MutPtr, srcrect: MutPtr, srcunit: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageBounds")

public actual fun gdipGetImageDecoders(numdecoders: UInt, size: UInt, decoders: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageDecoders")

public actual fun gdipGetImageDecodersSize(numdecoders: MutPtr, size: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageDecodersSize")

public actual fun gdipGetImageDimension(image: MutPtr, width: MutPtr, height: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageDimension")

public actual fun gdipGetImageEncoders(numencoders: UInt, size: UInt, encoders: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageEncoders")

public actual fun gdipGetImageEncodersSize(numencoders: MutPtr, size: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageEncodersSize")

public actual fun gdipGetImageFlags(image: MutPtr, flags: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageFlags")

public actual fun gdipGetImageGraphicsContext(image: MutPtr, graphics: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageGraphicsContext")

public actual fun gdipGetImageHeight(image: MutPtr, height: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageHeight")

public actual fun gdipGetImageHorizontalResolution(image: MutPtr, resolution: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageHorizontalResolution")

public actual fun gdipGetImageItemData(image: MutPtr, item: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageItemData")

public actual fun gdipGetImagePalette(image: MutPtr, palette: MutPtr, size: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImagePalette")

public actual fun gdipGetImagePaletteSize(image: MutPtr, size: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImagePaletteSize")

public actual fun gdipGetImagePixelFormat(image: MutPtr, format: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImagePixelFormat")

public actual fun gdipGetImageRawFormat(image: MutPtr, format: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageRawFormat")

public actual fun gdipGetImageThumbnail(image: MutPtr, thumbwidth: UInt, thumbheight: UInt, thumbimage: MutPtr, callback: Long, callbackdata: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageThumbnail")

public actual fun gdipGetImageType(image: MutPtr, type: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageType")

public actual fun gdipGetImageVerticalResolution(image: MutPtr, resolution: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageVerticalResolution")

public actual fun gdipGetImageWidth(image: MutPtr, width: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageWidth")

public actual fun gdipGetInterpolationMode(graphics: MutPtr, interpolationmode: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetInterpolationMode")

public actual fun gdipGetLineBlend(brush: MutPtr, blend: MutPtr, positions: MutPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetLineBlend")

public actual fun gdipGetLineBlendCount(brush: MutPtr, count: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetLineBlendCount")

public actual fun gdipGetLineColors(brush: MutPtr, colors: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetLineColors")

public actual fun gdipGetLineGammaCorrection(brush: MutPtr, usegammacorrection: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetLineGammaCorrection")

public actual fun gdipGetLinePresetBlend(brush: MutPtr, blend: MutPtr, positions: MutPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetLinePresetBlend")

public actual fun gdipGetLinePresetBlendCount(brush: MutPtr, count: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetLinePresetBlendCount")

public actual fun gdipGetLineRect(brush: MutPtr, rect: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetLineRect")

public actual fun gdipGetLineRectI(brush: MutPtr, rect: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetLineRectI")

public actual fun gdipGetLineSpacing(family: ConstPtr, style: Int, linespacing: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetLineSpacing")

public actual fun gdipGetLineTransform(brush: MutPtr, matrix: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetLineTransform")

public actual fun gdipGetLineWrapMode(brush: MutPtr, wrapmode: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetLineWrapMode")

public actual fun gdipGetLogFontA(font: MutPtr, graphics: MutPtr, logfonta: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetLogFontA")

public actual fun gdipGetLogFontW(font: MutPtr, graphics: MutPtr, logfontw: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetLogFontW")

public actual fun gdipGetMatrixElements(matrix: ConstPtr, matrixout: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetMatrixElements")

public actual fun gdipGetMetafileDownLevelRasterizationLimit(metafile: ConstPtr, metafilerasterizationlimitdpi: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileDownLevelRasterizationLimit")

public actual fun gdipGetMetafileHeaderFromEmf(hemf: Henhmetafile, header: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromEmf")

public actual fun gdipGetMetafileHeaderFromFile(filename: Pcwstr, header: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromFile")

public actual fun gdipGetMetafileHeaderFromMetafile(metafile: MutPtr, header: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromMetafile")

public actual fun gdipGetMetafileHeaderFromStream(stream: MutPtr, header: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromStream")

public actual fun gdipGetMetafileHeaderFromWmf(hwmf: Hmetafile, wmfplaceablefileheader: ConstPtr, header: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromWmf")

public actual fun gdipGetNearestColor(graphics: MutPtr, argb: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetNearestColor")

public actual fun gdipGetPageScale(graphics: MutPtr, scale: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPageScale")

public actual fun gdipGetPageUnit(graphics: MutPtr, unit: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPageUnit")

public actual fun gdipGetPathData(path: MutPtr, pathdata: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathData")

public actual fun gdipGetPathFillMode(path: MutPtr, fillmode: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathFillMode")

public actual fun gdipGetPathGradientBlend(brush: MutPtr, blend: MutPtr, positions: MutPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientBlend")

public actual fun gdipGetPathGradientBlendCount(brush: MutPtr, count: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientBlendCount")

public actual fun gdipGetPathGradientCenterColor(brush: MutPtr, colors: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientCenterColor")

public actual fun gdipGetPathGradientCenterPoint(brush: MutPtr, points: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientCenterPoint")

public actual fun gdipGetPathGradientCenterPointI(brush: MutPtr, points: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientCenterPointI")

public actual fun gdipGetPathGradientFocusScales(brush: MutPtr, xscale: MutPtr, yscale: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientFocusScales")

public actual fun gdipGetPathGradientGammaCorrection(brush: MutPtr, usegammacorrection: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientGammaCorrection")

public actual fun gdipGetPathGradientPath(brush: MutPtr, path: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPath")

public actual fun gdipGetPathGradientPointCount(brush: MutPtr, count: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPointCount")

public actual fun gdipGetPathGradientPresetBlend(brush: MutPtr, blend: MutPtr, positions: MutPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPresetBlend")

public actual fun gdipGetPathGradientPresetBlendCount(brush: MutPtr, count: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPresetBlendCount")

public actual fun gdipGetPathGradientRect(brush: MutPtr, rect: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientRect")

public actual fun gdipGetPathGradientRectI(brush: MutPtr, rect: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientRectI")

public actual fun gdipGetPathGradientSurroundColorCount(brush: MutPtr, count: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientSurroundColorCount")

public actual fun gdipGetPathGradientSurroundColorsWithCount(brush: ConstPtr, color: MutPtr, count: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientSurroundColorsWithCount")

public actual fun gdipGetPathGradientTransform(brush: MutPtr, matrix: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientTransform")

public actual fun gdipGetPathGradientWrapMode(brush: MutPtr, wrapmode: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientWrapMode")

public actual fun gdipGetPathLastPoint(path: MutPtr, lastpoint: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathLastPoint")

public actual fun gdipGetPathPoints(param0: MutPtr, points: MutPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathPoints")

public actual fun gdipGetPathPointsI(param0: MutPtr, points: MutPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathPointsI")

public actual fun gdipGetPathTypes(path: ConstPtr, types: MutPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathTypes")

public actual fun gdipGetPathWorldBounds(path: MutPtr, bounds: MutPtr, matrix: ConstPtr, pen: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathWorldBounds")

public actual fun gdipGetPathWorldBoundsI(path: MutPtr, bounds: MutPtr, matrix: ConstPtr, pen: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathWorldBoundsI")

public actual fun gdipGetPenBrushFill(pen: MutPtr, brush: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenBrushFill")

public actual fun gdipGetPenColor(pen: MutPtr, argb: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenColor")

public actual fun gdipGetPenCompoundArray(pen: MutPtr, dash: MutPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenCompoundArray")

public actual fun gdipGetPenCompoundCount(pen: MutPtr, count: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenCompoundCount")

public actual fun gdipGetPenCustomEndCap(pen: MutPtr, customcap: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenCustomEndCap")

public actual fun gdipGetPenCustomStartCap(pen: MutPtr, customcap: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenCustomStartCap")

public actual fun gdipGetPenDashArray(pen: MutPtr, dash: MutPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashArray")

public actual fun gdipGetPenDashCap197819(pen: MutPtr, dashcap: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashCap197819")

public actual fun gdipGetPenDashCount(pen: MutPtr, count: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashCount")

public actual fun gdipGetPenDashOffset(pen: MutPtr, offset: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashOffset")

public actual fun gdipGetPenDashStyle(pen: MutPtr, dashstyle: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashStyle")

public actual fun gdipGetPenEndCap(pen: MutPtr, endcap: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenEndCap")

public actual fun gdipGetPenFillType(pen: MutPtr, type: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenFillType")

public actual fun gdipGetPenLineJoin(pen: MutPtr, linejoin: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenLineJoin")

public actual fun gdipGetPenMiterLimit(pen: MutPtr, miterlimit: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenMiterLimit")

public actual fun gdipGetPenMode(pen: MutPtr, penmode: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenMode")

public actual fun gdipGetPenStartCap(pen: MutPtr, startcap: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenStartCap")

public actual fun gdipGetPenTransform(pen: MutPtr, matrix: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenTransform")

public actual fun gdipGetPenUnit(pen: MutPtr, unit: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenUnit")

public actual fun gdipGetPenWidth(pen: MutPtr, width: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenWidth")

public actual fun gdipGetPixelOffsetMode(graphics: MutPtr, pixeloffsetmode: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPixelOffsetMode")

public actual fun gdipGetPointCount(path: MutPtr, count: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPointCount")

public actual fun gdipGetPropertyCount(image: MutPtr, numofproperty: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyCount")

public actual fun gdipGetPropertyIdList(image: MutPtr, numofproperty: UInt, list: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyIdList")

public actual fun gdipGetPropertyItem(image: MutPtr, propid: UInt, propsize: UInt, buffer: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyItem")

public actual fun gdipGetPropertyItemSize(image: MutPtr, propid: UInt, size: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyItemSize")

public actual fun gdipGetPropertySize(image: MutPtr, totalbuffersize: MutPtr, numproperties: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPropertySize")

public actual fun gdipGetRegionBounds(region: MutPtr, graphics: MutPtr, rect: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetRegionBounds")

public actual fun gdipGetRegionBoundsI(region: MutPtr, graphics: MutPtr, rect: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetRegionBoundsI")

public actual fun gdipGetRegionData(region: MutPtr, buffer: MutPtr, buffersize: UInt, sizefilled: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetRegionData")

public actual fun gdipGetRegionDataSize(region: MutPtr, buffersize: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetRegionDataSize")

public actual fun gdipGetRegionHRgn(region: MutPtr, graphics: MutPtr, hrgn: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetRegionHRgn")

public actual fun gdipGetRegionScans(region: MutPtr, rects: MutPtr, count: MutPtr, matrix: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetRegionScans")

public actual fun gdipGetRegionScansCount(region: MutPtr, count: MutPtr, matrix: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetRegionScansCount")

public actual fun gdipGetRegionScansI(region: MutPtr, rects: MutPtr, count: MutPtr, matrix: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetRegionScansI")

public actual fun gdipGetRenderingOrigin(graphics: MutPtr, x: MutPtr, y: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetRenderingOrigin")

public actual fun gdipGetSmoothingMode(graphics: MutPtr, smoothingmode: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetSmoothingMode")

public actual fun gdipGetSolidFillColor(brush: MutPtr, color: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetSolidFillColor")

public actual fun gdipGetStringFormatAlign(format: ConstPtr, align: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatAlign")

public actual fun gdipGetStringFormatDigitSubstitution(format: ConstPtr, language: MutPtr, substitute: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatDigitSubstitution")

public actual fun gdipGetStringFormatFlags(format: ConstPtr, flags: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatFlags")

public actual fun gdipGetStringFormatHotkeyPrefix(format: ConstPtr, hotkeyprefix: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatHotkeyPrefix")

public actual fun gdipGetStringFormatLineAlign(format: ConstPtr, align: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatLineAlign")

public actual fun gdipGetStringFormatMeasurableCharacterRangeCount(format: ConstPtr, count: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatMeasurableCharacterRangeCount")

public actual fun gdipGetStringFormatTabStopCount(format: ConstPtr, count: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatTabStopCount")

public actual fun gdipGetStringFormatTabStops(format: ConstPtr, count: Int, firsttaboffset: MutPtr, tabstops: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatTabStops")

public actual fun gdipGetStringFormatTrimming(format: ConstPtr, trimming: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatTrimming")

public actual fun gdipGetTextContrast(graphics: MutPtr, contrast: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetTextContrast")

public actual fun gdipGetTextRenderingHint(graphics: MutPtr, mode: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetTextRenderingHint")

public actual fun gdipGetTextureImage(brush: MutPtr, image: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetTextureImage")

public actual fun gdipGetTextureTransform(brush: MutPtr, matrix: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetTextureTransform")

public actual fun gdipGetTextureWrapMode(brush: MutPtr, wrapmode: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetTextureWrapMode")

public actual fun gdipGetVisibleClipBounds(graphics: MutPtr, rect: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetVisibleClipBounds")

public actual fun gdipGetVisibleClipBoundsI(graphics: MutPtr, rect: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetVisibleClipBoundsI")

public actual fun gdipGetWorldTransform(graphics: MutPtr, matrix: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetWorldTransform")

public actual fun gdipGraphicsClear(graphics: MutPtr, color: UInt): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGraphicsClear")

public actual fun gdipGraphicsSetAbort(pgraphics: MutPtr, piabort: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGraphicsSetAbort")

public actual fun gdipImageForceValidation(image: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipImageForceValidation")

public actual fun gdipImageGetFrameCount(image: MutPtr, dimensionid: ConstPtr, count: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipImageGetFrameCount")

public actual fun gdipImageGetFrameDimensionsCount(image: MutPtr, count: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipImageGetFrameDimensionsCount")

public actual fun gdipImageGetFrameDimensionsList(image: MutPtr, dimensionids: MutPtr, count: UInt): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipImageGetFrameDimensionsList")

public actual fun gdipImageRotateFlip(image: MutPtr, rftype: RotateFlipType): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipImageRotateFlip")

public actual fun gdipImageSelectActiveFrame(image: MutPtr, dimensionid: ConstPtr, frameindex: UInt): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipImageSelectActiveFrame")

public actual fun gdipImageSetAbort(pimage: MutPtr, piabort: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipImageSetAbort")

public actual fun gdipInitializePalette(palette: MutPtr, palettetype: PaletteType, optimalcolors: Int, usetransparentcolor: Bool, bitmap: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipInitializePalette")

public actual fun gdipInvertMatrix(matrix: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipInvertMatrix")

public actual fun gdipIsClipEmpty(graphics: MutPtr, result: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsClipEmpty")

public actual fun gdipIsEmptyRegion(region: MutPtr, graphics: MutPtr, result: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsEmptyRegion")

public actual fun gdipIsEqualRegion(region: MutPtr, region2: MutPtr, graphics: MutPtr, result: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsEqualRegion")

public actual fun gdipIsInfiniteRegion(region: MutPtr, graphics: MutPtr, result: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsInfiniteRegion")

public actual fun gdipIsMatrixEqual(matrix: ConstPtr, matrix2: ConstPtr, result: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsMatrixEqual")

public actual fun gdipIsMatrixIdentity(matrix: ConstPtr, result: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsMatrixIdentity")

public actual fun gdipIsMatrixInvertible(matrix: ConstPtr, result: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsMatrixInvertible")

public actual fun gdipIsOutlineVisiblePathPoint(path: MutPtr, x: Float, y: Float, pen: MutPtr, graphics: MutPtr, result: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsOutlineVisiblePathPoint")

public actual fun gdipIsOutlineVisiblePathPointI(path: MutPtr, x: Int, y: Int, pen: MutPtr, graphics: MutPtr, result: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsOutlineVisiblePathPointI")

public actual fun gdipIsStyleAvailable(family: ConstPtr, style: Int, isstyleavailable: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsStyleAvailable")

public actual fun gdipIsVisibleClipEmpty(graphics: MutPtr, result: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleClipEmpty")

public actual fun gdipIsVisiblePathPoint(path: MutPtr, x: Float, y: Float, graphics: MutPtr, result: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePathPoint")

public actual fun gdipIsVisiblePathPointI(path: MutPtr, x: Int, y: Int, graphics: MutPtr, result: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePathPointI")

public actual fun gdipIsVisiblePoint(graphics: MutPtr, x: Float, y: Float, result: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePoint")

public actual fun gdipIsVisiblePointI(graphics: MutPtr, x: Int, y: Int, result: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePointI")

public actual fun gdipIsVisibleRect(graphics: MutPtr, x: Float, y: Float, width: Float, height: Float, result: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRect")

public actual fun gdipIsVisibleRectI(graphics: MutPtr, x: Int, y: Int, width: Int, height: Int, result: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRectI")

public actual fun gdipIsVisibleRegionPoint(region: MutPtr, x: Float, y: Float, graphics: MutPtr, result: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionPoint")

public actual fun gdipIsVisibleRegionPointI(region: MutPtr, x: Int, y: Int, graphics: MutPtr, result: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionPointI")

public actual fun gdipIsVisibleRegionRect(region: MutPtr, x: Float, y: Float, width: Float, height: Float, graphics: MutPtr, result: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionRect")

public actual fun gdipIsVisibleRegionRectI(region: MutPtr, x: Int, y: Int, width: Int, height: Int, graphics: MutPtr, result: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionRectI")

public actual fun gdipLoadImageFromFile(filename: Pcwstr, image: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromFile")

public actual fun gdipLoadImageFromFileICM(filename: Pcwstr, image: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromFileICM")

public actual fun gdipLoadImageFromStream(stream: MutPtr, image: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromStream")

public actual fun gdipLoadImageFromStreamICM(stream: MutPtr, image: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromStreamICM")

public actual fun gdipMeasureCharacterRanges(graphics: MutPtr, string: Pcwstr, length: Int, font: ConstPtr, layoutrect: ConstPtr, stringformat: ConstPtr, regioncount: Int, regions: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipMeasureCharacterRanges")

public actual fun gdipMeasureDriverString(graphics: MutPtr, text: ConstPtr, length: Int, font: ConstPtr, positions: ConstPtr, flags: Int, matrix: ConstPtr, boundingbox: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipMeasureDriverString")

public actual fun gdipMeasureString(graphics: MutPtr, string: Pcwstr, length: Int, font: ConstPtr, layoutrect: ConstPtr, stringformat: ConstPtr, boundingbox: MutPtr, codepointsfitted: MutPtr, linesfilled: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipMeasureString")

public actual fun gdipMultiplyLineTransform(brush: MutPtr, matrix: ConstPtr, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipMultiplyLineTransform")

public actual fun gdipMultiplyMatrix(matrix: MutPtr, matrix2: MutPtr, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipMultiplyMatrix")

public actual fun gdipMultiplyPathGradientTransform(brush: MutPtr, matrix: ConstPtr, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipMultiplyPathGradientTransform")

public actual fun gdipMultiplyPenTransform(pen: MutPtr, matrix: ConstPtr, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipMultiplyPenTransform")

public actual fun gdipMultiplyTextureTransform(brush: MutPtr, matrix: ConstPtr, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipMultiplyTextureTransform")

public actual fun gdipMultiplyWorldTransform(graphics: MutPtr, matrix: ConstPtr, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipMultiplyWorldTransform")

public actual fun gdipNewInstalledFontCollection(fontcollection: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipNewInstalledFontCollection")

public actual fun gdipNewPrivateFontCollection(fontcollection: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipNewPrivateFontCollection")

public actual fun gdipPathIterCopyData(iterator: MutPtr, resultcount: MutPtr, points: MutPtr, types: MutPtr, startindex: Int, endindex: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipPathIterCopyData")

public actual fun gdipPathIterEnumerate(iterator: MutPtr, resultcount: MutPtr, points: MutPtr, types: MutPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipPathIterEnumerate")

public actual fun gdipPathIterGetCount(iterator: MutPtr, count: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipPathIterGetCount")

public actual fun gdipPathIterGetSubpathCount(iterator: MutPtr, count: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipPathIterGetSubpathCount")

public actual fun gdipPathIterHasCurve(iterator: MutPtr, hascurve: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipPathIterHasCurve")

public actual fun gdipPathIterIsValid(iterator: MutPtr, valid: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipPathIterIsValid")

public actual fun gdipPathIterNextMarker(iterator: MutPtr, resultcount: MutPtr, startindex: MutPtr, endindex: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextMarker")

public actual fun gdipPathIterNextMarkerPath(iterator: MutPtr, resultcount: MutPtr, path: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextMarkerPath")

public actual fun gdipPathIterNextPathType(iterator: MutPtr, resultcount: MutPtr, pathtype: MutPtr, startindex: MutPtr, endindex: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextPathType")

public actual fun gdipPathIterNextSubpath(iterator: MutPtr, resultcount: MutPtr, startindex: MutPtr, endindex: MutPtr, isclosed: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextSubpath")

public actual fun gdipPathIterNextSubpathPath(iterator: MutPtr, resultcount: MutPtr, path: MutPtr, isclosed: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextSubpathPath")

public actual fun gdipPathIterRewind(iterator: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipPathIterRewind")

public actual fun gdipPlayMetafileRecord(metafile: ConstPtr, recordtype: EmfPlusRecordType, flags: UInt, datasize: UInt, data: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipPlayMetafileRecord")

public actual fun gdipPrivateAddFontFile(fontcollection: MutPtr, filename: Pcwstr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipPrivateAddFontFile")

public actual fun gdipPrivateAddMemoryFont(fontcollection: MutPtr, memory: ConstPtr, length: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipPrivateAddMemoryFont")

public actual fun gdipRecordMetafile(referencehdc: Hdc, type: EmfType, framerect: ConstPtr, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafile")

public actual fun gdipRecordMetafileFileName(filename: Pcwstr, referencehdc: Hdc, type: EmfType, framerect: ConstPtr, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileFileName")

public actual fun gdipRecordMetafileFileNameI(filename: Pcwstr, referencehdc: Hdc, type: EmfType, framerect: ConstPtr, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileFileNameI")

public actual fun gdipRecordMetafileI(referencehdc: Hdc, type: EmfType, framerect: ConstPtr, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileI")

public actual fun gdipRecordMetafileStream(stream: MutPtr, referencehdc: Hdc, type: EmfType, framerect: ConstPtr, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileStream")

public actual fun gdipRecordMetafileStreamI(stream: MutPtr, referencehdc: Hdc, type: EmfType, framerect: ConstPtr, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileStreamI")

public actual fun gdipReleaseDC(graphics: MutPtr, hdc: Hdc): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipReleaseDC")

public actual fun gdipRemovePropertyItem(image: MutPtr, propid: UInt): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipRemovePropertyItem")

public actual fun gdipResetClip(graphics: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipResetClip")

public actual fun gdipResetImageAttributes(imageattr: MutPtr, type: ColorAdjustType): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipResetImageAttributes")

public actual fun gdipResetLineTransform(brush: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipResetLineTransform")

public actual fun gdipResetPageTransform(graphics: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipResetPageTransform")

public actual fun gdipResetPath(path: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipResetPath")

public actual fun gdipResetPathGradientTransform(brush: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipResetPathGradientTransform")

public actual fun gdipResetPenTransform(pen: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipResetPenTransform")

public actual fun gdipResetTextureTransform(brush: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipResetTextureTransform")

public actual fun gdipResetWorldTransform(graphics: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipResetWorldTransform")

public actual fun gdipRestoreGraphics(graphics: MutPtr, state: UInt): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipRestoreGraphics")

public actual fun gdipReversePath(path: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipReversePath")

public actual fun gdipRotateLineTransform(brush: MutPtr, angle: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipRotateLineTransform")

public actual fun gdipRotateMatrix(matrix: MutPtr, angle: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipRotateMatrix")

public actual fun gdipRotatePathGradientTransform(brush: MutPtr, angle: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipRotatePathGradientTransform")

public actual fun gdipRotatePenTransform(pen: MutPtr, angle: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipRotatePenTransform")

public actual fun gdipRotateTextureTransform(brush: MutPtr, angle: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipRotateTextureTransform")

public actual fun gdipRotateWorldTransform(graphics: MutPtr, angle: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipRotateWorldTransform")

public actual fun gdipSaveAdd(image: MutPtr, encoderparams: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSaveAdd")

public actual fun gdipSaveAddImage(image: MutPtr, newimage: MutPtr, encoderparams: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSaveAddImage")

public actual fun gdipSaveGraphics(graphics: MutPtr, state: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSaveGraphics")

public actual fun gdipSaveImageToFile(image: MutPtr, filename: Pcwstr, clsidencoder: ConstPtr, encoderparams: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSaveImageToFile")

public actual fun gdipSaveImageToStream(image: MutPtr, stream: MutPtr, clsidencoder: ConstPtr, encoderparams: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSaveImageToStream")

public actual fun gdipScaleLineTransform(brush: MutPtr, sx: Float, sy: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipScaleLineTransform")

public actual fun gdipScaleMatrix(matrix: MutPtr, scalex: Float, scaley: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipScaleMatrix")

public actual fun gdipScalePathGradientTransform(brush: MutPtr, sx: Float, sy: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipScalePathGradientTransform")

public actual fun gdipScalePenTransform(pen: MutPtr, sx: Float, sy: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipScalePenTransform")

public actual fun gdipScaleTextureTransform(brush: MutPtr, sx: Float, sy: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipScaleTextureTransform")

public actual fun gdipScaleWorldTransform(graphics: MutPtr, sx: Float, sy: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipScaleWorldTransform")

public actual fun gdipSetAdjustableArrowCapFillState(cap: MutPtr, fillstate: Bool): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapFillState")

public actual fun gdipSetAdjustableArrowCapHeight(cap: MutPtr, height: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapHeight")

public actual fun gdipSetAdjustableArrowCapMiddleInset(cap: MutPtr, middleinset: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapMiddleInset")

public actual fun gdipSetAdjustableArrowCapWidth(cap: MutPtr, width: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapWidth")

public actual fun gdipSetClipGraphics(graphics: MutPtr, srcgraphics: MutPtr, combinemode: CombineMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetClipGraphics")

public actual fun gdipSetClipHrgn(graphics: MutPtr, hrgn: Hrgn, combinemode: CombineMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetClipHrgn")

public actual fun gdipSetClipPath(graphics: MutPtr, path: MutPtr, combinemode: CombineMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetClipPath")

public actual fun gdipSetClipRect(graphics: MutPtr, x: Float, y: Float, width: Float, height: Float, combinemode: CombineMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetClipRect")

public actual fun gdipSetClipRectI(graphics: MutPtr, x: Int, y: Int, width: Int, height: Int, combinemode: CombineMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetClipRectI")

public actual fun gdipSetClipRegion(graphics: MutPtr, region: MutPtr, combinemode: CombineMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetClipRegion")

public actual fun gdipSetCompositingMode(graphics: MutPtr, compositingmode: CompositingMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetCompositingMode")

public actual fun gdipSetCompositingQuality(graphics: MutPtr, compositingquality: CompositingQuality): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetCompositingQuality")

public actual fun gdipSetCustomLineCapBaseCap(customcap: MutPtr, basecap: LineCap): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapBaseCap")

public actual fun gdipSetCustomLineCapBaseInset(customcap: MutPtr, inset: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapBaseInset")

public actual fun gdipSetCustomLineCapStrokeCaps(customcap: MutPtr, startcap: LineCap, endcap: LineCap): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapStrokeCaps")

public actual fun gdipSetCustomLineCapStrokeJoin(customcap: MutPtr, linejoin: LineJoin): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapStrokeJoin")

public actual fun gdipSetCustomLineCapWidthScale(customcap: MutPtr, widthscale: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapWidthScale")

public actual fun gdipSetEffectParameters(effect: MutPtr, params: ConstPtr, size: UInt): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetEffectParameters")

public actual fun gdipSetEmpty(region: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetEmpty")

public actual fun gdipSetImageAttributesCachedBackground(imageattr: MutPtr, enableflag: Bool): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesCachedBackground")

public actual fun gdipSetImageAttributesColorKeys(imageattr: MutPtr, type: ColorAdjustType, enableflag: Bool, colorlow: UInt, colorhigh: UInt): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesColorKeys")

public actual fun gdipSetImageAttributesColorMatrix(imageattr: MutPtr, type: ColorAdjustType, enableflag: Bool, colormatrix: ConstPtr, graymatrix: ConstPtr, flags: ColorMatrixFlags): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesColorMatrix")

public actual fun gdipSetImageAttributesGamma(imageattr: MutPtr, type: ColorAdjustType, enableflag: Bool, gamma: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesGamma")

public actual fun gdipSetImageAttributesNoOp(imageattr: MutPtr, type: ColorAdjustType, enableflag: Bool): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesNoOp")

public actual fun gdipSetImageAttributesOutputChannel(imageattr: MutPtr, type: ColorAdjustType, enableflag: Bool, channelflags: ColorChannelFlags): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesOutputChannel")

public actual fun gdipSetImageAttributesOutputChannelColorProfile(imageattr: MutPtr, type: ColorAdjustType, enableflag: Bool, colorprofilefilename: Pcwstr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesOutputChannelColorProfile")

public actual fun gdipSetImageAttributesRemapTable(imageattr: MutPtr, type: ColorAdjustType, enableflag: Bool, mapsize: UInt, map: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesRemapTable")

public actual fun gdipSetImageAttributesThreshold(imageattr: MutPtr, type: ColorAdjustType, enableflag: Bool, threshold: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesThreshold")

public actual fun gdipSetImageAttributesToIdentity(imageattr: MutPtr, type: ColorAdjustType): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesToIdentity")

public actual fun gdipSetImageAttributesWrapMode(imageattr: MutPtr, wrap: WrapMode, argb: UInt, clamp: Bool): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesWrapMode")

public actual fun gdipSetImagePalette(image: MutPtr, palette: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetImagePalette")

public actual fun gdipSetInfinite(region: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetInfinite")

public actual fun gdipSetInterpolationMode(graphics: MutPtr, interpolationmode: InterpolationMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetInterpolationMode")

public actual fun gdipSetLineBlend(brush: MutPtr, blend: ConstPtr, positions: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetLineBlend")

public actual fun gdipSetLineColors(brush: MutPtr, color1: UInt, color2: UInt): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetLineColors")

public actual fun gdipSetLineGammaCorrection(brush: MutPtr, usegammacorrection: Bool): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetLineGammaCorrection")

public actual fun gdipSetLineLinearBlend(brush: MutPtr, focus: Float, scale: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetLineLinearBlend")

public actual fun gdipSetLinePresetBlend(brush: MutPtr, blend: ConstPtr, positions: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetLinePresetBlend")

public actual fun gdipSetLineSigmaBlend(brush: MutPtr, focus: Float, scale: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetLineSigmaBlend")

public actual fun gdipSetLineTransform(brush: MutPtr, matrix: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetLineTransform")

public actual fun gdipSetLineWrapMode(brush: MutPtr, wrapmode: WrapMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetLineWrapMode")

public actual fun gdipSetMatrixElements(matrix: MutPtr, m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetMatrixElements")

public actual fun gdipSetMetafileDownLevelRasterizationLimit(metafile: MutPtr, metafilerasterizationlimitdpi: UInt): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetMetafileDownLevelRasterizationLimit")

public actual fun gdipSetPageScale(graphics: MutPtr, scale: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPageScale")

public actual fun gdipSetPageUnit(graphics: MutPtr, unit: Unit): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPageUnit")

public actual fun gdipSetPathFillMode(path: MutPtr, fillmode: FillMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPathFillMode")

public actual fun gdipSetPathGradientBlend(brush: MutPtr, blend: ConstPtr, positions: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientBlend")

public actual fun gdipSetPathGradientCenterColor(brush: MutPtr, colors: UInt): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientCenterColor")

public actual fun gdipSetPathGradientCenterPoint(brush: MutPtr, points: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientCenterPoint")

public actual fun gdipSetPathGradientCenterPointI(brush: MutPtr, points: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientCenterPointI")

public actual fun gdipSetPathGradientFocusScales(brush: MutPtr, xscale: Float, yscale: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientFocusScales")

public actual fun gdipSetPathGradientGammaCorrection(brush: MutPtr, usegammacorrection: Bool): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientGammaCorrection")

public actual fun gdipSetPathGradientLinearBlend(brush: MutPtr, focus: Float, scale: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientLinearBlend")

public actual fun gdipSetPathGradientPath(brush: MutPtr, path: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientPath")

public actual fun gdipSetPathGradientPresetBlend(brush: MutPtr, blend: ConstPtr, positions: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientPresetBlend")

public actual fun gdipSetPathGradientSigmaBlend(brush: MutPtr, focus: Float, scale: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientSigmaBlend")

public actual fun gdipSetPathGradientSurroundColorsWithCount(brush: MutPtr, color: ConstPtr, count: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientSurroundColorsWithCount")

public actual fun gdipSetPathGradientTransform(brush: MutPtr, matrix: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientTransform")

public actual fun gdipSetPathGradientWrapMode(brush: MutPtr, wrapmode: WrapMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientWrapMode")

public actual fun gdipSetPathMarker(path: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPathMarker")

public actual fun gdipSetPenBrushFill(pen: MutPtr, brush: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenBrushFill")

public actual fun gdipSetPenColor(pen: MutPtr, argb: UInt): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenColor")

public actual fun gdipSetPenCompoundArray(pen: MutPtr, dash: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenCompoundArray")

public actual fun gdipSetPenCustomEndCap(pen: MutPtr, customcap: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenCustomEndCap")

public actual fun gdipSetPenCustomStartCap(pen: MutPtr, customcap: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenCustomStartCap")

public actual fun gdipSetPenDashArray(pen: MutPtr, dash: ConstPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashArray")

public actual fun gdipSetPenDashCap197819(pen: MutPtr, dashcap: DashCap): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashCap197819")

public actual fun gdipSetPenDashOffset(pen: MutPtr, offset: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashOffset")

public actual fun gdipSetPenDashStyle(pen: MutPtr, dashstyle: DashStyle): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashStyle")

public actual fun gdipSetPenEndCap(pen: MutPtr, endcap: LineCap): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenEndCap")

public actual fun gdipSetPenLineCap197819(pen: MutPtr, startcap: LineCap, endcap: LineCap, dashcap: DashCap): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenLineCap197819")

public actual fun gdipSetPenLineJoin(pen: MutPtr, linejoin: LineJoin): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenLineJoin")

public actual fun gdipSetPenMiterLimit(pen: MutPtr, miterlimit: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenMiterLimit")

public actual fun gdipSetPenMode(pen: MutPtr, penmode: PenAlignment): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenMode")

public actual fun gdipSetPenStartCap(pen: MutPtr, startcap: LineCap): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenStartCap")

public actual fun gdipSetPenTransform(pen: MutPtr, matrix: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenTransform")

public actual fun gdipSetPenUnit(pen: MutPtr, unit: Unit): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenUnit")

public actual fun gdipSetPenWidth(pen: MutPtr, width: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenWidth")

public actual fun gdipSetPixelOffsetMode(graphics: MutPtr, pixeloffsetmode: PixelOffsetMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPixelOffsetMode")

public actual fun gdipSetPropertyItem(image: MutPtr, item: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPropertyItem")

public actual fun gdipSetRenderingOrigin(graphics: MutPtr, x: Int, y: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetRenderingOrigin")

public actual fun gdipSetSmoothingMode(graphics: MutPtr, smoothingmode: SmoothingMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetSmoothingMode")

public actual fun gdipSetSolidFillColor(brush: MutPtr, color: UInt): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetSolidFillColor")

public actual fun gdipSetStringFormatAlign(format: MutPtr, align: StringAlignment): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatAlign")

public actual fun gdipSetStringFormatDigitSubstitution(format: MutPtr, language: UShort, substitute: StringDigitSubstitute): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatDigitSubstitution")

public actual fun gdipSetStringFormatFlags(format: MutPtr, flags: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatFlags")

public actual fun gdipSetStringFormatHotkeyPrefix(format: MutPtr, hotkeyprefix: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatHotkeyPrefix")

public actual fun gdipSetStringFormatLineAlign(format: MutPtr, align: StringAlignment): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatLineAlign")

public actual fun gdipSetStringFormatMeasurableCharacterRanges(format: MutPtr, rangecount: Int, ranges: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatMeasurableCharacterRanges")

public actual fun gdipSetStringFormatTabStops(format: MutPtr, firsttaboffset: Float, count: Int, tabstops: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatTabStops")

public actual fun gdipSetStringFormatTrimming(format: MutPtr, trimming: StringTrimming): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatTrimming")

public actual fun gdipSetTextContrast(graphics: MutPtr, contrast: UInt): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetTextContrast")

public actual fun gdipSetTextRenderingHint(graphics: MutPtr, mode: TextRenderingHint): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetTextRenderingHint")

public actual fun gdipSetTextureTransform(brush: MutPtr, matrix: ConstPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetTextureTransform")

public actual fun gdipSetTextureWrapMode(brush: MutPtr, wrapmode: WrapMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetTextureWrapMode")

public actual fun gdipSetWorldTransform(graphics: MutPtr, matrix: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetWorldTransform")

public actual fun gdipShearMatrix(matrix: MutPtr, shearx: Float, sheary: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipShearMatrix")

public actual fun gdipStartPathFigure(path: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipStartPathFigure")

public actual fun gdipStringFormatGetGenericDefault(format: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipStringFormatGetGenericDefault")

public actual fun gdipStringFormatGetGenericTypographic(format: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipStringFormatGetGenericTypographic")

public actual fun gdipTestControl(control: GpTestControlEnum, param1: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTestControl")

public actual fun gdipTransformMatrixPoints(matrix: MutPtr, pts: MutPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTransformMatrixPoints")

public actual fun gdipTransformMatrixPointsI(matrix: MutPtr, pts: MutPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTransformMatrixPointsI")

public actual fun gdipTransformPath(path: MutPtr, matrix: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTransformPath")

public actual fun gdipTransformPoints(graphics: MutPtr, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: MutPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTransformPoints")

public actual fun gdipTransformPointsI(graphics: MutPtr, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: MutPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTransformPointsI")

public actual fun gdipTransformRegion(region: MutPtr, matrix: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTransformRegion")

public actual fun gdipTranslateClip(graphics: MutPtr, dx: Float, dy: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTranslateClip")

public actual fun gdipTranslateClipI(graphics: MutPtr, dx: Int, dy: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTranslateClipI")

public actual fun gdipTranslateLineTransform(brush: MutPtr, dx: Float, dy: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTranslateLineTransform")

public actual fun gdipTranslateMatrix(matrix: MutPtr, offsetx: Float, offsety: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTranslateMatrix")

public actual fun gdipTranslatePathGradientTransform(brush: MutPtr, dx: Float, dy: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTranslatePathGradientTransform")

public actual fun gdipTranslatePenTransform(pen: MutPtr, dx: Float, dy: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTranslatePenTransform")

public actual fun gdipTranslateRegion(region: MutPtr, dx: Float, dy: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTranslateRegion")

public actual fun gdipTranslateRegionI(region: MutPtr, dx: Int, dy: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTranslateRegionI")

public actual fun gdipTranslateTextureTransform(brush: MutPtr, dx: Float, dy: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTranslateTextureTransform")

public actual fun gdipTranslateWorldTransform(graphics: MutPtr, dx: Float, dy: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTranslateWorldTransform")

public actual fun gdipVectorTransformMatrixPoints(matrix: MutPtr, pts: MutPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipVectorTransformMatrixPoints")

public actual fun gdipVectorTransformMatrixPointsI(matrix: MutPtr, pts: MutPtr, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipVectorTransformMatrixPointsI")

public actual fun gdipWarpPath(path: MutPtr, matrix: MutPtr, points: ConstPtr, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, warpmode: WarpMode, flatness: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipWarpPath")

public actual fun gdipWidenPath(nativepath: MutPtr, pen: MutPtr, matrix: MutPtr, flatness: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipWidenPath")

public actual fun gdipWindingModeOutline(path: MutPtr, matrix: MutPtr, flatness: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipWindingModeOutline")

public actual fun gdiplusNotificationHook(token: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdiplusNotificationHook")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsGdiplusGdiplusNotificationUnhook")
private external fun wasiWindowssysWindowsWin32GraphicsGdiplusGdiplusNotificationUnhook(token: Long): kotlin.Unit

public actual fun gdiplusNotificationUnhook(token: ULong): kotlin.Unit =
    wasiWindowssysWindowsWin32GraphicsGdiplusGdiplusNotificationUnhook(token.toLong())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsGdiplusGdiplusShutdown")
private external fun wasiWindowssysWindowsWin32GraphicsGdiplusGdiplusShutdown(token: Long): kotlin.Unit

public actual fun gdiplusShutdown(token: ULong): kotlin.Unit =
    wasiWindowssysWindowsWin32GraphicsGdiplusGdiplusShutdown(token.toLong())

public actual fun gdiplusStartup(token: MutPtr, input: ConstPtr, output: MutPtr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdiplusStartup")
