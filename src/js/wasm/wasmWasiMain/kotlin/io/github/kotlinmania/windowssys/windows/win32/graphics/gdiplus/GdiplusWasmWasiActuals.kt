@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun gdipAddPathArc(path: MutPtr<GpPath>, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathArc")

public actual fun gdipAddPathArcI(path: MutPtr<GpPath>, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathArcI")

public actual fun gdipAddPathBezier(path: MutPtr<GpPath>, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathBezier")

public actual fun gdipAddPathBezierI(path: MutPtr<GpPath>, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathBezierI")

public actual fun gdipAddPathBeziers(path: MutPtr<GpPath>, points: ConstPtr<PointF>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathBeziers")

public actual fun gdipAddPathBeziersI(path: MutPtr<GpPath>, points: ConstPtr<Point>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathBeziersI")

public actual fun gdipAddPathClosedCurve(path: MutPtr<GpPath>, points: ConstPtr<PointF>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurve")

public actual fun gdipAddPathClosedCurve2(path: MutPtr<GpPath>, points: ConstPtr<PointF>, count: Int, tension: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurve2")

public actual fun gdipAddPathClosedCurve2I(path: MutPtr<GpPath>, points: ConstPtr<Point>, count: Int, tension: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurve2I")

public actual fun gdipAddPathClosedCurveI(path: MutPtr<GpPath>, points: ConstPtr<Point>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurveI")

public actual fun gdipAddPathCurve(path: MutPtr<GpPath>, points: ConstPtr<PointF>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve")

public actual fun gdipAddPathCurve2(path: MutPtr<GpPath>, points: ConstPtr<PointF>, count: Int, tension: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve2")

public actual fun gdipAddPathCurve2I(path: MutPtr<GpPath>, points: ConstPtr<Point>, count: Int, tension: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve2I")

public actual fun gdipAddPathCurve3(path: MutPtr<GpPath>, points: ConstPtr<PointF>, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve3")

public actual fun gdipAddPathCurve3I(path: MutPtr<GpPath>, points: ConstPtr<Point>, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve3I")

public actual fun gdipAddPathCurveI(path: MutPtr<GpPath>, points: ConstPtr<Point>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurveI")

public actual fun gdipAddPathEllipse(path: MutPtr<GpPath>, x: Float, y: Float, width: Float, height: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathEllipse")

public actual fun gdipAddPathEllipseI(path: MutPtr<GpPath>, x: Int, y: Int, width: Int, height: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathEllipseI")

public actual fun gdipAddPathLine(path: MutPtr<GpPath>, x1: Float, y1: Float, x2: Float, y2: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathLine")

public actual fun gdipAddPathLine2(path: MutPtr<GpPath>, points: ConstPtr<PointF>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathLine2")

public actual fun gdipAddPathLine2I(path: MutPtr<GpPath>, points: ConstPtr<Point>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathLine2I")

public actual fun gdipAddPathLineI(path: MutPtr<GpPath>, x1: Int, y1: Int, x2: Int, y2: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathLineI")

public actual fun gdipAddPathPath(path: MutPtr<GpPath>, addingpath: ConstPtr<GpPath>, connect: Bool): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathPath")

public actual fun gdipAddPathPie(path: MutPtr<GpPath>, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathPie")

public actual fun gdipAddPathPieI(path: MutPtr<GpPath>, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathPieI")

public actual fun gdipAddPathPolygon(path: MutPtr<GpPath>, points: ConstPtr<PointF>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathPolygon")

public actual fun gdipAddPathPolygonI(path: MutPtr<GpPath>, points: ConstPtr<Point>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathPolygonI")

public actual fun gdipAddPathRectangle(path: MutPtr<GpPath>, x: Float, y: Float, width: Float, height: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectangle")

public actual fun gdipAddPathRectangleI(path: MutPtr<GpPath>, x: Int, y: Int, width: Int, height: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectangleI")

public actual fun gdipAddPathRectangles(path: MutPtr<GpPath>, rects: ConstPtr<RectF>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectangles")

public actual fun gdipAddPathRectanglesI(path: MutPtr<GpPath>, rects: ConstPtr<Rect>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectanglesI")

public actual fun gdipAddPathString(path: MutPtr<GpPath>, string: Pcwstr, length: Int, family: ConstPtr<GpFontFamily>, style: Int, emsize: Float, layoutrect: ConstPtr<RectF>, format: ConstPtr<GpStringFormat>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathString")

public actual fun gdipAddPathStringI(path: MutPtr<GpPath>, string: Pcwstr, length: Int, family: ConstPtr<GpFontFamily>, style: Int, emsize: Float, layoutrect: ConstPtr<Rect>, format: ConstPtr<GpStringFormat>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAddPathStringI")

public actual fun gdipAlloc(size: ULong): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipAlloc")

public actual fun gdipBeginContainer(graphics: MutPtr<GpGraphics>, dstrect: ConstPtr<RectF>, srcrect: ConstPtr<RectF>, unit: Unit, state: MutPtr<UInt>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipBeginContainer")

public actual fun gdipBeginContainer2(graphics: MutPtr<GpGraphics>, state: MutPtr<UInt>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipBeginContainer2")

public actual fun gdipBeginContainerI(graphics: MutPtr<GpGraphics>, dstrect: ConstPtr<Rect>, srcrect: ConstPtr<Rect>, unit: Unit, state: MutPtr<UInt>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipBeginContainerI")

public actual fun gdipBitmapApplyEffect(bitmap: MutPtr<GpBitmap>, effect: MutPtr<CGpEffect>, roi: MutPtr<io.github.kotlinmania.windowssys.windows.win32.foundation.Rect>, useauxdata: Bool, auxdata: MutPtr<MutPtr<CVoid>>, auxdatasize: MutPtr<Int>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipBitmapApplyEffect")

public actual fun gdipBitmapConvertFormat(pinputbitmap: MutPtr<GpBitmap>, format: Int, dithertype: DitherType, palettetype: PaletteType, palette: MutPtr<ColorPalette>, alphathresholdpercent: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipBitmapConvertFormat")

public actual fun gdipBitmapCreateApplyEffect(inputbitmaps: MutPtr<MutPtr<GpBitmap>>, numinputs: Int, effect: MutPtr<CGpEffect>, roi: MutPtr<io.github.kotlinmania.windowssys.windows.win32.foundation.Rect>, outputrect: MutPtr<io.github.kotlinmania.windowssys.windows.win32.foundation.Rect>, outputbitmap: MutPtr<MutPtr<GpBitmap>>, useauxdata: Bool, auxdata: MutPtr<MutPtr<CVoid>>, auxdatasize: MutPtr<Int>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipBitmapCreateApplyEffect")

public actual fun gdipBitmapGetHistogram(bitmap: MutPtr<GpBitmap>, format: HistogramFormat, numberofentries: UInt, channel0: MutPtr<UInt>, channel1: MutPtr<UInt>, channel2: MutPtr<UInt>, channel3: MutPtr<UInt>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipBitmapGetHistogram")

public actual fun gdipBitmapGetHistogramSize(format: HistogramFormat, numberofentries: MutPtr<UInt>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipBitmapGetHistogramSize")

public actual fun gdipBitmapGetPixel(bitmap: MutPtr<GpBitmap>, x: Int, y: Int, color: MutPtr<UInt>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipBitmapGetPixel")

public actual fun gdipBitmapLockBits(bitmap: MutPtr<GpBitmap>, rect: ConstPtr<Rect>, flags: UInt, format: Int, lockedbitmapdata: MutPtr<BitmapData>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipBitmapLockBits")

public actual fun gdipBitmapSetPixel(bitmap: MutPtr<GpBitmap>, x: Int, y: Int, color: UInt): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipBitmapSetPixel")

public actual fun gdipBitmapSetResolution(bitmap: MutPtr<GpBitmap>, xdpi: Float, ydpi: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipBitmapSetResolution")

public actual fun gdipBitmapUnlockBits(bitmap: MutPtr<GpBitmap>, lockedbitmapdata: MutPtr<BitmapData>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipBitmapUnlockBits")

public actual fun gdipClearPathMarkers(path: MutPtr<GpPath>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipClearPathMarkers")

public actual fun gdipCloneBitmapArea(x: Float, y: Float, width: Float, height: Float, format: Int, srcbitmap: MutPtr<GpBitmap>, dstbitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCloneBitmapArea")

public actual fun gdipCloneBitmapAreaI(x: Int, y: Int, width: Int, height: Int, format: Int, srcbitmap: MutPtr<GpBitmap>, dstbitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCloneBitmapAreaI")

public actual fun gdipCloneBrush(brush: MutPtr<GpBrush>, clonebrush: MutPtr<MutPtr<GpBrush>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCloneBrush")

public actual fun gdipCloneCustomLineCap(customcap: MutPtr<GpCustomLineCap>, clonedcap: MutPtr<MutPtr<GpCustomLineCap>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCloneCustomLineCap")

public actual fun gdipCloneFont(font: MutPtr<GpFont>, clonefont: MutPtr<MutPtr<GpFont>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCloneFont")

public actual fun gdipCloneFontFamily(fontfamily: MutPtr<GpFontFamily>, clonedfontfamily: MutPtr<MutPtr<GpFontFamily>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCloneFontFamily")

public actual fun gdipCloneImage(image: MutPtr<GpImage>, cloneimage: MutPtr<MutPtr<GpImage>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCloneImage")

public actual fun gdipCloneImageAttributes(imageattr: ConstPtr<GpImageAttributes>, cloneimageattr: MutPtr<MutPtr<GpImageAttributes>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCloneImageAttributes")

public actual fun gdipCloneMatrix(matrix: MutPtr<Matrix>, clonematrix: MutPtr<MutPtr<Matrix>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCloneMatrix")

public actual fun gdipClonePath(path: MutPtr<GpPath>, clonepath: MutPtr<MutPtr<GpPath>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipClonePath")

public actual fun gdipClonePen(pen: MutPtr<GpPen>, clonepen: MutPtr<MutPtr<GpPen>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipClonePen")

public actual fun gdipCloneRegion(region: MutPtr<GpRegion>, cloneregion: MutPtr<MutPtr<GpRegion>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCloneRegion")

public actual fun gdipCloneStringFormat(format: ConstPtr<GpStringFormat>, newformat: MutPtr<MutPtr<GpStringFormat>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCloneStringFormat")

public actual fun gdipClosePathFigure(path: MutPtr<GpPath>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipClosePathFigure")

public actual fun gdipClosePathFigures(path: MutPtr<GpPath>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipClosePathFigures")

public actual fun gdipCombineRegionPath(region: MutPtr<GpRegion>, path: MutPtr<GpPath>, combinemode: CombineMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionPath")

public actual fun gdipCombineRegionRect(region: MutPtr<GpRegion>, rect: ConstPtr<RectF>, combinemode: CombineMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionRect")

public actual fun gdipCombineRegionRectI(region: MutPtr<GpRegion>, rect: ConstPtr<Rect>, combinemode: CombineMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionRectI")

public actual fun gdipCombineRegionRegion(region: MutPtr<GpRegion>, region2: MutPtr<GpRegion>, combinemode: CombineMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionRegion")

public actual fun gdipComment(graphics: MutPtr<GpGraphics>, sizedata: UInt, data: ConstPtr<UByte>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipComment")

public actual fun gdipConvertToEmfPlus(refgraphics: ConstPtr<GpGraphics>, metafile: MutPtr<GpMetafile>, conversionfailureflag: MutPtr<Int>, emftype: EmfType, description: Pcwstr, outMetafile: MutPtr<MutPtr<GpMetafile>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipConvertToEmfPlus")

public actual fun gdipConvertToEmfPlusToFile(refgraphics: ConstPtr<GpGraphics>, metafile: MutPtr<GpMetafile>, conversionfailureflag: MutPtr<Int>, filename: Pcwstr, emftype: EmfType, description: Pcwstr, outMetafile: MutPtr<MutPtr<GpMetafile>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipConvertToEmfPlusToFile")

public actual fun gdipConvertToEmfPlusToStream(refgraphics: ConstPtr<GpGraphics>, metafile: MutPtr<GpMetafile>, conversionfailureflag: MutPtr<Int>, stream: MutPtr<CVoid>, emftype: EmfType, description: Pcwstr, outMetafile: MutPtr<MutPtr<GpMetafile>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipConvertToEmfPlusToStream")

public actual fun gdipCreateAdjustableArrowCap(height: Float, width: Float, isfilled: Bool, cap: MutPtr<MutPtr<GpAdjustableArrowCap>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateAdjustableArrowCap")

public actual fun gdipCreateBitmapFromFile(filename: Pcwstr, bitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromFile")

public actual fun gdipCreateBitmapFromFileICM(filename: Pcwstr, bitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromFileICM")

public actual fun gdipCreateBitmapFromGdiDib(gdibitmapinfo: ConstPtr<Bitmapinfo>, gdibitmapdata: MutPtr<CVoid>, bitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromGdiDib")

public actual fun gdipCreateBitmapFromGraphics(width: Int, height: Int, target: MutPtr<GpGraphics>, bitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromGraphics")

public actual fun gdipCreateBitmapFromHBITMAP(hbm: Hbitmap, hpal: Hpalette, bitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromHBITMAP")

public actual fun gdipCreateBitmapFromHICON(hicon: Hicon, bitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromHICON")

public actual fun gdipCreateBitmapFromResource(hinstance: Hinstance, lpbitmapname: Pcwstr, bitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromResource")

public actual fun gdipCreateBitmapFromScan0(width: Int, height: Int, stride: Int, format: Int, scan0: ConstPtr<UByte>, bitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromScan0")

public actual fun gdipCreateBitmapFromStream(stream: MutPtr<CVoid>, bitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromStream")

public actual fun gdipCreateBitmapFromStreamICM(stream: MutPtr<CVoid>, bitmap: MutPtr<MutPtr<GpBitmap>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromStreamICM")

public actual fun gdipCreateCachedBitmap(bitmap: MutPtr<GpBitmap>, graphics: MutPtr<GpGraphics>, cachedbitmap: MutPtr<MutPtr<GpCachedBitmap>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateCachedBitmap")

public actual fun gdipCreateCustomLineCap(fillpath: MutPtr<GpPath>, strokepath: MutPtr<GpPath>, basecap: LineCap, baseinset: Float, customcap: MutPtr<MutPtr<GpCustomLineCap>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateCustomLineCap")

public actual fun gdipCreateEffect(guid: Guid, effect: MutPtr<MutPtr<CGpEffect>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateEffect")

public actual fun gdipCreateFont(fontfamily: ConstPtr<GpFontFamily>, emsize: Float, style: Int, unit: Unit, font: MutPtr<MutPtr<GpFont>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateFont")

public actual fun gdipCreateFontFamilyFromName(name: Pcwstr, fontcollection: MutPtr<GpFontCollection>, fontfamily: MutPtr<MutPtr<GpFontFamily>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFamilyFromName")

public actual fun gdipCreateFontFromDC(hdc: Hdc, font: MutPtr<MutPtr<GpFont>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFromDC")

public actual fun gdipCreateFontFromLogfontA(hdc: Hdc, logfont: ConstPtr<Logfonta>, font: MutPtr<MutPtr<GpFont>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFromLogfontA")

public actual fun gdipCreateFontFromLogfontW(hdc: Hdc, logfont: ConstPtr<Logfontw>, font: MutPtr<MutPtr<GpFont>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFromLogfontW")

public actual fun gdipCreateFromHDC(hdc: Hdc, graphics: MutPtr<MutPtr<GpGraphics>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHDC")

public actual fun gdipCreateFromHDC2(hdc: Hdc, hdevice: Handle, graphics: MutPtr<MutPtr<GpGraphics>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHDC2")

public actual fun gdipCreateFromHWND(hwnd: Hwnd, graphics: MutPtr<MutPtr<GpGraphics>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHWND")

public actual fun gdipCreateFromHWNDICM(hwnd: Hwnd, graphics: MutPtr<MutPtr<GpGraphics>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHWNDICM")

public actual fun gdipCreateHBITMAPFromBitmap(bitmap: MutPtr<GpBitmap>, hbmreturn: MutPtr<Hbitmap>, background: UInt): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateHBITMAPFromBitmap")

public actual fun gdipCreateHICONFromBitmap(bitmap: MutPtr<GpBitmap>, hbmreturn: MutPtr<Hicon>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateHICONFromBitmap")

public actual fun gdipCreateHalftonePalette(): Hpalette =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateHalftonePalette")

public actual fun gdipCreateHatchBrush(hatchstyle: HatchStyle, forecol: UInt, backcol: UInt, brush: MutPtr<MutPtr<GpHatch>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateHatchBrush")

public actual fun gdipCreateImageAttributes(imageattr: MutPtr<MutPtr<GpImageAttributes>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateImageAttributes")

public actual fun gdipCreateLineBrush(point1: ConstPtr<PointF>, point2: ConstPtr<PointF>, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: MutPtr<MutPtr<GpLineGradient>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrush")

public actual fun gdipCreateLineBrushFromRect(rect: ConstPtr<RectF>, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: MutPtr<MutPtr<GpLineGradient>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRect")

public actual fun gdipCreateLineBrushFromRectI(rect: ConstPtr<Rect>, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: MutPtr<MutPtr<GpLineGradient>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRectI")

public actual fun gdipCreateLineBrushFromRectWithAngle(rect: ConstPtr<RectF>, color1: UInt, color2: UInt, angle: Float, isanglescalable: Bool, wrapmode: WrapMode, linegradient: MutPtr<MutPtr<GpLineGradient>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRectWithAngle")

public actual fun gdipCreateLineBrushFromRectWithAngleI(rect: ConstPtr<Rect>, color1: UInt, color2: UInt, angle: Float, isanglescalable: Bool, wrapmode: WrapMode, linegradient: MutPtr<MutPtr<GpLineGradient>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRectWithAngleI")

public actual fun gdipCreateLineBrushI(point1: ConstPtr<Point>, point2: ConstPtr<Point>, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: MutPtr<MutPtr<GpLineGradient>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushI")

public actual fun gdipCreateMatrix(matrix: MutPtr<MutPtr<Matrix>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix")

public actual fun gdipCreateMatrix2(m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float, matrix: MutPtr<MutPtr<Matrix>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix2")

public actual fun gdipCreateMatrix3(rect: ConstPtr<RectF>, dstplg: ConstPtr<PointF>, matrix: MutPtr<MutPtr<Matrix>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix3")

public actual fun gdipCreateMatrix3I(rect: ConstPtr<Rect>, dstplg: ConstPtr<Point>, matrix: MutPtr<MutPtr<Matrix>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix3I")

public actual fun gdipCreateMetafileFromEmf(hemf: Henhmetafile, deleteemf: Bool, metafile: MutPtr<MutPtr<GpMetafile>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromEmf")

public actual fun gdipCreateMetafileFromFile(file: Pcwstr, metafile: MutPtr<MutPtr<GpMetafile>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromFile")

public actual fun gdipCreateMetafileFromStream(stream: MutPtr<CVoid>, metafile: MutPtr<MutPtr<GpMetafile>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromStream")

public actual fun gdipCreateMetafileFromWmf(hwmf: Hmetafile, deletewmf: Bool, wmfplaceablefileheader: ConstPtr<WmfPlaceableFileHeader>, metafile: MutPtr<MutPtr<GpMetafile>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromWmf")

public actual fun gdipCreateMetafileFromWmfFile(file: Pcwstr, wmfplaceablefileheader: ConstPtr<WmfPlaceableFileHeader>, metafile: MutPtr<MutPtr<GpMetafile>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromWmfFile")

public actual fun gdipCreatePath(brushmode: FillMode, path: MutPtr<MutPtr<GpPath>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreatePath")

public actual fun gdipCreatePath2(param0: ConstPtr<PointF>, param1: ConstPtr<UByte>, param2: Int, param3: FillMode, path: MutPtr<MutPtr<GpPath>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreatePath2")

public actual fun gdipCreatePath2I(param0: ConstPtr<Point>, param1: ConstPtr<UByte>, param2: Int, param3: FillMode, path: MutPtr<MutPtr<GpPath>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreatePath2I")

public actual fun gdipCreatePathGradient(points: ConstPtr<PointF>, count: Int, wrapmode: WrapMode, polygradient: MutPtr<MutPtr<GpPathGradient>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreatePathGradient")

public actual fun gdipCreatePathGradientFromPath(path: ConstPtr<GpPath>, polygradient: MutPtr<MutPtr<GpPathGradient>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreatePathGradientFromPath")

public actual fun gdipCreatePathGradientI(points: ConstPtr<Point>, count: Int, wrapmode: WrapMode, polygradient: MutPtr<MutPtr<GpPathGradient>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreatePathGradientI")

public actual fun gdipCreatePathIter(iterator: MutPtr<MutPtr<GpPathIterator>>, path: MutPtr<GpPath>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreatePathIter")

public actual fun gdipCreatePen1(color: UInt, width: Float, unit: Unit, pen: MutPtr<MutPtr<GpPen>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreatePen1")

public actual fun gdipCreatePen2(brush: MutPtr<GpBrush>, width: Float, unit: Unit, pen: MutPtr<MutPtr<GpPen>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreatePen2")

public actual fun gdipCreateRegion(region: MutPtr<MutPtr<GpRegion>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateRegion")

public actual fun gdipCreateRegionHrgn(hrgn: Hrgn, region: MutPtr<MutPtr<GpRegion>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionHrgn")

public actual fun gdipCreateRegionPath(path: MutPtr<GpPath>, region: MutPtr<MutPtr<GpRegion>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionPath")

public actual fun gdipCreateRegionRect(rect: ConstPtr<RectF>, region: MutPtr<MutPtr<GpRegion>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionRect")

public actual fun gdipCreateRegionRectI(rect: ConstPtr<Rect>, region: MutPtr<MutPtr<GpRegion>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionRectI")

public actual fun gdipCreateRegionRgnData(regiondata: ConstPtr<UByte>, size: Int, region: MutPtr<MutPtr<GpRegion>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionRgnData")

public actual fun gdipCreateSolidFill(color: UInt, brush: MutPtr<MutPtr<GpSolidFill>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateSolidFill")

public actual fun gdipCreateStreamOnFile(filename: Pcwstr, access: UInt, stream: MutPtr<MutPtr<CVoid>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateStreamOnFile")

public actual fun gdipCreateStringFormat(formatattributes: Int, language: UShort, format: MutPtr<MutPtr<GpStringFormat>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateStringFormat")

public actual fun gdipCreateTexture(image: MutPtr<GpImage>, wrapmode: WrapMode, texture: MutPtr<MutPtr<GpTexture>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateTexture")

public actual fun gdipCreateTexture2(image: MutPtr<GpImage>, wrapmode: WrapMode, x: Float, y: Float, width: Float, height: Float, texture: MutPtr<MutPtr<GpTexture>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateTexture2")

public actual fun gdipCreateTexture2I(image: MutPtr<GpImage>, wrapmode: WrapMode, x: Int, y: Int, width: Int, height: Int, texture: MutPtr<MutPtr<GpTexture>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateTexture2I")

public actual fun gdipCreateTextureIA(image: MutPtr<GpImage>, imageattributes: ConstPtr<GpImageAttributes>, x: Float, y: Float, width: Float, height: Float, texture: MutPtr<MutPtr<GpTexture>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateTextureIA")

public actual fun gdipCreateTextureIAI(image: MutPtr<GpImage>, imageattributes: ConstPtr<GpImageAttributes>, x: Int, y: Int, width: Int, height: Int, texture: MutPtr<MutPtr<GpTexture>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipCreateTextureIAI")

public actual fun gdipDeleteBrush(brush: MutPtr<GpBrush>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDeleteBrush")

public actual fun gdipDeleteCachedBitmap(cachedbitmap: MutPtr<GpCachedBitmap>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDeleteCachedBitmap")

public actual fun gdipDeleteCustomLineCap(customcap: MutPtr<GpCustomLineCap>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDeleteCustomLineCap")

public actual fun gdipDeleteEffect(effect: MutPtr<CGpEffect>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDeleteEffect")

public actual fun gdipDeleteFont(font: MutPtr<GpFont>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDeleteFont")

public actual fun gdipDeleteFontFamily(fontfamily: MutPtr<GpFontFamily>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDeleteFontFamily")

public actual fun gdipDeleteGraphics(graphics: MutPtr<GpGraphics>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDeleteGraphics")

public actual fun gdipDeleteMatrix(matrix: MutPtr<Matrix>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDeleteMatrix")

public actual fun gdipDeletePath(path: MutPtr<GpPath>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDeletePath")

public actual fun gdipDeletePathIter(iterator: MutPtr<GpPathIterator>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDeletePathIter")

public actual fun gdipDeletePen(pen: MutPtr<GpPen>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDeletePen")

public actual fun gdipDeletePrivateFontCollection(fontcollection: MutPtr<MutPtr<GpFontCollection>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDeletePrivateFontCollection")

public actual fun gdipDeleteRegion(region: MutPtr<GpRegion>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDeleteRegion")

public actual fun gdipDeleteStringFormat(format: MutPtr<GpStringFormat>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDeleteStringFormat")

public actual fun gdipDisposeImage(image: MutPtr<GpImage>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDisposeImage")

public actual fun gdipDisposeImageAttributes(imageattr: MutPtr<GpImageAttributes>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDisposeImageAttributes")

public actual fun gdipDrawArc(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawArc")

public actual fun gdipDrawArcI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawArcI")

public actual fun gdipDrawBezier(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawBezier")

public actual fun gdipDrawBezierI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawBezierI")

public actual fun gdipDrawBeziers(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<PointF>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawBeziers")

public actual fun gdipDrawBeziersI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<Point>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawBeziersI")

public actual fun gdipDrawCachedBitmap(graphics: MutPtr<GpGraphics>, cachedbitmap: MutPtr<GpCachedBitmap>, x: Int, y: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawCachedBitmap")

public actual fun gdipDrawClosedCurve(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<PointF>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurve")

public actual fun gdipDrawClosedCurve2(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<PointF>, count: Int, tension: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurve2")

public actual fun gdipDrawClosedCurve2I(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<Point>, count: Int, tension: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurve2I")

public actual fun gdipDrawClosedCurveI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<Point>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurveI")

public actual fun gdipDrawCurve(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<PointF>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve")

public actual fun gdipDrawCurve2(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<PointF>, count: Int, tension: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve2")

public actual fun gdipDrawCurve2I(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<Point>, count: Int, tension: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve2I")

public actual fun gdipDrawCurve3(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<PointF>, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve3")

public actual fun gdipDrawCurve3I(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<Point>, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve3I")

public actual fun gdipDrawCurveI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<Point>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawCurveI")

public actual fun gdipDrawDriverString(graphics: MutPtr<GpGraphics>, text: ConstPtr<UShort>, length: Int, font: ConstPtr<GpFont>, brush: ConstPtr<GpBrush>, positions: ConstPtr<PointF>, flags: Int, matrix: ConstPtr<Matrix>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawDriverString")

public actual fun gdipDrawEllipse(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x: Float, y: Float, width: Float, height: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawEllipse")

public actual fun gdipDrawEllipseI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x: Int, y: Int, width: Int, height: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawEllipseI")

public actual fun gdipDrawImage(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, x: Float, y: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawImage")

public actual fun gdipDrawImageFX(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, source: MutPtr<RectF>, xform: MutPtr<Matrix>, effect: MutPtr<CGpEffect>, imageattributes: MutPtr<GpImageAttributes>, srcunit: Unit): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawImageFX")

public actual fun gdipDrawImageI(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, x: Int, y: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawImageI")

public actual fun gdipDrawImagePointRect(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, x: Float, y: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointRect")

public actual fun gdipDrawImagePointRectI(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, x: Int, y: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointRectI")

public actual fun gdipDrawImagePoints(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, dstpoints: ConstPtr<PointF>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePoints")

public actual fun gdipDrawImagePointsI(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, dstpoints: ConstPtr<Point>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointsI")

public actual fun gdipDrawImagePointsRect(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, points: ConstPtr<PointF>, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: ConstPtr<GpImageAttributes>, callback: Long, callbackdata: MutPtr<CVoid>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointsRect")

public actual fun gdipDrawImagePointsRectI(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, points: ConstPtr<Point>, count: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: ConstPtr<GpImageAttributes>, callback: Long, callbackdata: MutPtr<CVoid>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointsRectI")

public actual fun gdipDrawImageRect(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, x: Float, y: Float, width: Float, height: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRect")

public actual fun gdipDrawImageRectI(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, x: Int, y: Int, width: Int, height: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRectI")

public actual fun gdipDrawImageRectRect(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, dstx: Float, dsty: Float, dstwidth: Float, dstheight: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: ConstPtr<GpImageAttributes>, callback: Long, callbackdata: MutPtr<CVoid>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRectRect")

public actual fun gdipDrawImageRectRectI(graphics: MutPtr<GpGraphics>, image: MutPtr<GpImage>, dstx: Int, dsty: Int, dstwidth: Int, dstheight: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: ConstPtr<GpImageAttributes>, callback: Long, callbackdata: MutPtr<CVoid>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRectRectI")

public actual fun gdipDrawLine(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x1: Float, y1: Float, x2: Float, y2: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawLine")

public actual fun gdipDrawLineI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x1: Int, y1: Int, x2: Int, y2: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawLineI")

public actual fun gdipDrawLines(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<PointF>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawLines")

public actual fun gdipDrawLinesI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<Point>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawLinesI")

public actual fun gdipDrawPath(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, path: MutPtr<GpPath>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawPath")

public actual fun gdipDrawPie(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawPie")

public actual fun gdipDrawPieI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawPieI")

public actual fun gdipDrawPolygon(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<PointF>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawPolygon")

public actual fun gdipDrawPolygonI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, points: ConstPtr<Point>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawPolygonI")

public actual fun gdipDrawRectangle(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x: Float, y: Float, width: Float, height: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawRectangle")

public actual fun gdipDrawRectangleI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, x: Int, y: Int, width: Int, height: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawRectangleI")

public actual fun gdipDrawRectangles(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, rects: ConstPtr<RectF>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawRectangles")

public actual fun gdipDrawRectanglesI(graphics: MutPtr<GpGraphics>, pen: MutPtr<GpPen>, rects: ConstPtr<Rect>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawRectanglesI")

public actual fun gdipDrawString(graphics: MutPtr<GpGraphics>, string: Pcwstr, length: Int, font: ConstPtr<GpFont>, layoutrect: ConstPtr<RectF>, stringformat: ConstPtr<GpStringFormat>, brush: ConstPtr<GpBrush>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipDrawString")

public actual fun gdipEmfToWmfBits(hemf: Henhmetafile, cbdata16: UInt, pdata16: MutPtr<UByte>, imapmode: Int, eflags: Int): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipEmfToWmfBits")

public actual fun gdipEndContainer(graphics: MutPtr<GpGraphics>, state: UInt): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipEndContainer")

public actual fun gdipEnumerateMetafileDestPoint(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destpoint: ConstPtr<PointF>, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPoint")

public actual fun gdipEnumerateMetafileDestPointI(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destpoint: ConstPtr<Point>, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPointI")

public actual fun gdipEnumerateMetafileDestPoints(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destpoints: ConstPtr<PointF>, count: Int, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPoints")

public actual fun gdipEnumerateMetafileDestPointsI(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destpoints: ConstPtr<Point>, count: Int, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPointsI")

public actual fun gdipEnumerateMetafileDestRect(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destrect: ConstPtr<RectF>, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestRect")

public actual fun gdipEnumerateMetafileDestRectI(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destrect: ConstPtr<Rect>, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestRectI")

public actual fun gdipEnumerateMetafileSrcRectDestPoint(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destpoint: ConstPtr<PointF>, srcrect: ConstPtr<RectF>, srcunit: Unit, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPoint")

public actual fun gdipEnumerateMetafileSrcRectDestPointI(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destpoint: ConstPtr<Point>, srcrect: ConstPtr<Rect>, srcunit: Unit, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPointI")

public actual fun gdipEnumerateMetafileSrcRectDestPoints(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destpoints: ConstPtr<PointF>, count: Int, srcrect: ConstPtr<RectF>, srcunit: Unit, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPoints")

public actual fun gdipEnumerateMetafileSrcRectDestPointsI(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destpoints: ConstPtr<Point>, count: Int, srcrect: ConstPtr<Rect>, srcunit: Unit, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPointsI")

public actual fun gdipEnumerateMetafileSrcRectDestRect(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destrect: ConstPtr<RectF>, srcrect: ConstPtr<RectF>, srcunit: Unit, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestRect")

public actual fun gdipEnumerateMetafileSrcRectDestRectI(graphics: MutPtr<GpGraphics>, metafile: ConstPtr<GpMetafile>, destrect: ConstPtr<Rect>, srcrect: ConstPtr<Rect>, srcunit: Unit, callback: Long, callbackdata: MutPtr<CVoid>, imageattributes: ConstPtr<GpImageAttributes>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestRectI")

public actual fun gdipFillClosedCurve(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, points: ConstPtr<PointF>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurve")

public actual fun gdipFillClosedCurve2(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, points: ConstPtr<PointF>, count: Int, tension: Float, fillmode: FillMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurve2")

public actual fun gdipFillClosedCurve2I(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, points: ConstPtr<Point>, count: Int, tension: Float, fillmode: FillMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurve2I")

public actual fun gdipFillClosedCurveI(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, points: ConstPtr<Point>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurveI")

public actual fun gdipFillEllipse(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, x: Float, y: Float, width: Float, height: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillEllipse")

public actual fun gdipFillEllipseI(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, x: Int, y: Int, width: Int, height: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillEllipseI")

public actual fun gdipFillPath(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, path: MutPtr<GpPath>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillPath")

public actual fun gdipFillPie(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillPie")

public actual fun gdipFillPieI(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillPieI")

public actual fun gdipFillPolygon(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, points: ConstPtr<PointF>, count: Int, fillmode: FillMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillPolygon")

public actual fun gdipFillPolygon2(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, points: ConstPtr<PointF>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillPolygon2")

public actual fun gdipFillPolygon2I(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, points: ConstPtr<Point>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillPolygon2I")

public actual fun gdipFillPolygonI(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, points: ConstPtr<Point>, count: Int, fillmode: FillMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillPolygonI")

public actual fun gdipFillRectangle(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, x: Float, y: Float, width: Float, height: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillRectangle")

public actual fun gdipFillRectangleI(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, x: Int, y: Int, width: Int, height: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillRectangleI")

public actual fun gdipFillRectangles(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, rects: ConstPtr<RectF>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillRectangles")

public actual fun gdipFillRectanglesI(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, rects: ConstPtr<Rect>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillRectanglesI")

public actual fun gdipFillRegion(graphics: MutPtr<GpGraphics>, brush: MutPtr<GpBrush>, region: MutPtr<GpRegion>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFillRegion")

public actual fun gdipFindFirstImageItem(image: MutPtr<GpImage>, item: MutPtr<ImageItemData>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFindFirstImageItem")

public actual fun gdipFindNextImageItem(image: MutPtr<GpImage>, item: MutPtr<ImageItemData>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFindNextImageItem")

public actual fun gdipFlattenPath(path: MutPtr<GpPath>, matrix: MutPtr<Matrix>, flatness: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFlattenPath")

public actual fun gdipFlush(graphics: MutPtr<GpGraphics>, intention: FlushIntention): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFlush")

public actual fun gdipFree(ptr: MutPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipFree")

public actual fun gdipGetAdjustableArrowCapFillState(cap: MutPtr<GpAdjustableArrowCap>, fillstate: MutPtr<Bool>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapFillState")

public actual fun gdipGetAdjustableArrowCapHeight(cap: MutPtr<GpAdjustableArrowCap>, height: MutPtr<Float>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapHeight")

public actual fun gdipGetAdjustableArrowCapMiddleInset(cap: MutPtr<GpAdjustableArrowCap>, middleinset: MutPtr<Float>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapMiddleInset")

public actual fun gdipGetAdjustableArrowCapWidth(cap: MutPtr<GpAdjustableArrowCap>, width: MutPtr<Float>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapWidth")

public actual fun gdipGetAllPropertyItems(image: MutPtr<GpImage>, totalbuffersize: UInt, numproperties: UInt, allitems: MutPtr<PropertyItem>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetAllPropertyItems")

public actual fun gdipGetBrushType(brush: MutPtr<GpBrush>, type: MutPtr<BrushType>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetBrushType")

public actual fun gdipGetCellAscent(family: ConstPtr<GpFontFamily>, style: Int, cellascent: MutPtr<UShort>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetCellAscent")

public actual fun gdipGetCellDescent(family: ConstPtr<GpFontFamily>, style: Int, celldescent: MutPtr<UShort>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetCellDescent")

public actual fun gdipGetClip(graphics: MutPtr<GpGraphics>, region: MutPtr<GpRegion>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetClip")

public actual fun gdipGetClipBounds(graphics: MutPtr<GpGraphics>, rect: MutPtr<RectF>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetClipBounds")

public actual fun gdipGetClipBoundsI(graphics: MutPtr<GpGraphics>, rect: MutPtr<Rect>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetClipBoundsI")

public actual fun gdipGetCompositingMode(graphics: MutPtr<GpGraphics>, compositingmode: MutPtr<CompositingMode>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetCompositingMode")

public actual fun gdipGetCompositingQuality(graphics: MutPtr<GpGraphics>, compositingquality: MutPtr<CompositingQuality>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetCompositingQuality")

public actual fun gdipGetCustomLineCapBaseCap(customcap: MutPtr<GpCustomLineCap>, basecap: MutPtr<LineCap>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapBaseCap")

public actual fun gdipGetCustomLineCapBaseInset(customcap: MutPtr<GpCustomLineCap>, inset: MutPtr<Float>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapBaseInset")

public actual fun gdipGetCustomLineCapStrokeCaps(customcap: MutPtr<GpCustomLineCap>, startcap: MutPtr<LineCap>, endcap: MutPtr<LineCap>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapStrokeCaps")

public actual fun gdipGetCustomLineCapStrokeJoin(customcap: MutPtr<GpCustomLineCap>, linejoin: MutPtr<LineJoin>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapStrokeJoin")

public actual fun gdipGetCustomLineCapType(customcap: MutPtr<GpCustomLineCap>, captype: MutPtr<CustomLineCapType>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapType")

public actual fun gdipGetCustomLineCapWidthScale(customcap: MutPtr<GpCustomLineCap>, widthscale: MutPtr<Float>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapWidthScale")

public actual fun gdipGetDC(graphics: MutPtr<GpGraphics>, hdc: MutPtr<Hdc>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetDC")

public actual fun gdipGetDpiX(graphics: MutPtr<GpGraphics>, dpi: MutPtr<Float>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetDpiX")

public actual fun gdipGetDpiY(graphics: MutPtr<GpGraphics>, dpi: MutPtr<Float>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetDpiY")

public actual fun gdipGetEffectParameterSize(effect: MutPtr<CGpEffect>, size: MutPtr<UInt>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetEffectParameterSize")

public actual fun gdipGetEffectParameters(effect: MutPtr<CGpEffect>, size: MutPtr<UInt>, params: MutPtr<CVoid>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetEffectParameters")

public actual fun gdipGetEmHeight(family: ConstPtr<GpFontFamily>, style: Int, emheight: MutPtr<UShort>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetEmHeight")

public actual fun gdipGetEncoderParameterList(image: MutPtr<GpImage>, clsidencoder: ConstPtr<Guid>, size: UInt, buffer: MutPtr<EncoderParameters>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetEncoderParameterList")

public actual fun gdipGetEncoderParameterListSize(image: MutPtr<GpImage>, clsidencoder: ConstPtr<Guid>, size: MutPtr<UInt>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetEncoderParameterListSize")

public actual fun gdipGetFamily(font: MutPtr<GpFont>, family: MutPtr<MutPtr<GpFontFamily>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetFamily")

public actual fun gdipGetFamilyName(family: ConstPtr<GpFontFamily>, name: Pwstr, language: UShort): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetFamilyName")

public actual fun gdipGetFontCollectionFamilyCount(fontcollection: MutPtr<GpFontCollection>, numfound: MutPtr<Int>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetFontCollectionFamilyCount")

public actual fun gdipGetFontCollectionFamilyList(fontcollection: ConstPtr<GpFontCollection>, numsought: Int, gpfamilies: MutPtr<MutPtr<GpFontFamily>>, numfound: MutPtr<Int>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetFontCollectionFamilyList")

public actual fun gdipGetFontHeight(font: ConstPtr<GpFont>, graphics: ConstPtr<GpGraphics>, height: MutPtr<Float>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetFontHeight")

public actual fun gdipGetFontHeightGivenDPI(font: ConstPtr<GpFont>, dpi: Float, height: MutPtr<Float>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetFontHeightGivenDPI")

public actual fun gdipGetFontSize(font: MutPtr<GpFont>, size: MutPtr<Float>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetFontSize")

public actual fun gdipGetFontStyle(font: MutPtr<GpFont>, style: MutPtr<Int>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetFontStyle")

public actual fun gdipGetFontUnit(font: MutPtr<GpFont>, unit: MutPtr<Unit>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetFontUnit")

public actual fun gdipGetGenericFontFamilyMonospace(nativefamily: MutPtr<MutPtr<GpFontFamily>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetGenericFontFamilyMonospace")

public actual fun gdipGetGenericFontFamilySansSerif(nativefamily: MutPtr<MutPtr<GpFontFamily>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetGenericFontFamilySansSerif")

public actual fun gdipGetGenericFontFamilySerif(nativefamily: MutPtr<MutPtr<GpFontFamily>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetGenericFontFamilySerif")

public actual fun gdipGetHatchBackgroundColor(brush: MutPtr<GpHatch>, backcol: MutPtr<UInt>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetHatchBackgroundColor")

public actual fun gdipGetHatchForegroundColor(brush: MutPtr<GpHatch>, forecol: MutPtr<UInt>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetHatchForegroundColor")

public actual fun gdipGetHatchStyle(brush: MutPtr<GpHatch>, hatchstyle: MutPtr<HatchStyle>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetHatchStyle")

public actual fun gdipGetHemfFromMetafile(metafile: MutPtr<GpMetafile>, hemf: MutPtr<Henhmetafile>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetHemfFromMetafile")

public actual fun gdipGetImageAttributesAdjustedPalette(imageattr: MutPtr<GpImageAttributes>, colorpalette: MutPtr<ColorPalette>, coloradjusttype: ColorAdjustType): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageAttributesAdjustedPalette")

public actual fun gdipGetImageBounds(image: MutPtr<GpImage>, srcrect: MutPtr<RectF>, srcunit: MutPtr<Unit>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageBounds")

public actual fun gdipGetImageDecoders(numdecoders: UInt, size: UInt, decoders: MutPtr<ImageCodecInfo>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageDecoders")

public actual fun gdipGetImageDecodersSize(numdecoders: MutPtr<UInt>, size: MutPtr<UInt>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageDecodersSize")

public actual fun gdipGetImageDimension(image: MutPtr<GpImage>, width: MutPtr<Float>, height: MutPtr<Float>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageDimension")

public actual fun gdipGetImageEncoders(numencoders: UInt, size: UInt, encoders: MutPtr<ImageCodecInfo>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageEncoders")

public actual fun gdipGetImageEncodersSize(numencoders: MutPtr<UInt>, size: MutPtr<UInt>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageEncodersSize")

public actual fun gdipGetImageFlags(image: MutPtr<GpImage>, flags: MutPtr<UInt>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageFlags")

public actual fun gdipGetImageGraphicsContext(image: MutPtr<GpImage>, graphics: MutPtr<MutPtr<GpGraphics>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageGraphicsContext")

public actual fun gdipGetImageHeight(image: MutPtr<GpImage>, height: MutPtr<UInt>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageHeight")

public actual fun gdipGetImageHorizontalResolution(image: MutPtr<GpImage>, resolution: MutPtr<Float>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageHorizontalResolution")

public actual fun gdipGetImageItemData(image: MutPtr<GpImage>, item: MutPtr<ImageItemData>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageItemData")

public actual fun gdipGetImagePalette(image: MutPtr<GpImage>, palette: MutPtr<ColorPalette>, size: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImagePalette")

public actual fun gdipGetImagePaletteSize(image: MutPtr<GpImage>, size: MutPtr<Int>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImagePaletteSize")

public actual fun gdipGetImagePixelFormat(image: MutPtr<GpImage>, format: MutPtr<Int>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImagePixelFormat")

public actual fun gdipGetImageRawFormat(image: MutPtr<GpImage>, format: MutPtr<Guid>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageRawFormat")

public actual fun gdipGetImageThumbnail(image: MutPtr<GpImage>, thumbwidth: UInt, thumbheight: UInt, thumbimage: MutPtr<MutPtr<GpImage>>, callback: Long, callbackdata: MutPtr<CVoid>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageThumbnail")

public actual fun gdipGetImageType(image: MutPtr<GpImage>, type: MutPtr<ImageType>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageType")

public actual fun gdipGetImageVerticalResolution(image: MutPtr<GpImage>, resolution: MutPtr<Float>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageVerticalResolution")

public actual fun gdipGetImageWidth(image: MutPtr<GpImage>, width: MutPtr<UInt>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetImageWidth")

public actual fun gdipGetInterpolationMode(graphics: MutPtr<GpGraphics>, interpolationmode: MutPtr<InterpolationMode>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetInterpolationMode")

public actual fun gdipGetLineBlend(brush: MutPtr<GpLineGradient>, blend: MutPtr<Float>, positions: MutPtr<Float>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetLineBlend")

public actual fun gdipGetLineBlendCount(brush: MutPtr<GpLineGradient>, count: MutPtr<Int>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetLineBlendCount")

public actual fun gdipGetLineColors(brush: MutPtr<GpLineGradient>, colors: MutPtr<UInt>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetLineColors")

public actual fun gdipGetLineGammaCorrection(brush: MutPtr<GpLineGradient>, usegammacorrection: MutPtr<Bool>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetLineGammaCorrection")

public actual fun gdipGetLinePresetBlend(brush: MutPtr<GpLineGradient>, blend: MutPtr<UInt>, positions: MutPtr<Float>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetLinePresetBlend")

public actual fun gdipGetLinePresetBlendCount(brush: MutPtr<GpLineGradient>, count: MutPtr<Int>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetLinePresetBlendCount")

public actual fun gdipGetLineRect(brush: MutPtr<GpLineGradient>, rect: MutPtr<RectF>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetLineRect")

public actual fun gdipGetLineRectI(brush: MutPtr<GpLineGradient>, rect: MutPtr<Rect>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetLineRectI")

public actual fun gdipGetLineSpacing(family: ConstPtr<GpFontFamily>, style: Int, linespacing: MutPtr<UShort>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetLineSpacing")

public actual fun gdipGetLineTransform(brush: MutPtr<GpLineGradient>, matrix: MutPtr<Matrix>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetLineTransform")

public actual fun gdipGetLineWrapMode(brush: MutPtr<GpLineGradient>, wrapmode: MutPtr<WrapMode>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetLineWrapMode")

public actual fun gdipGetLogFontA(font: MutPtr<GpFont>, graphics: MutPtr<GpGraphics>, logfonta: MutPtr<Logfonta>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetLogFontA")

public actual fun gdipGetLogFontW(font: MutPtr<GpFont>, graphics: MutPtr<GpGraphics>, logfontw: MutPtr<Logfontw>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetLogFontW")

public actual fun gdipGetMatrixElements(matrix: ConstPtr<Matrix>, matrixout: MutPtr<Float>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetMatrixElements")

public actual fun gdipGetMetafileDownLevelRasterizationLimit(metafile: ConstPtr<GpMetafile>, metafilerasterizationlimitdpi: MutPtr<UInt>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileDownLevelRasterizationLimit")

public actual fun gdipGetMetafileHeaderFromEmf(hemf: Henhmetafile, header: MutPtr<MetafileHeader>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromEmf")

public actual fun gdipGetMetafileHeaderFromFile(filename: Pcwstr, header: MutPtr<MetafileHeader>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromFile")

public actual fun gdipGetMetafileHeaderFromMetafile(metafile: MutPtr<GpMetafile>, header: MutPtr<MetafileHeader>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromMetafile")

public actual fun gdipGetMetafileHeaderFromStream(stream: MutPtr<CVoid>, header: MutPtr<MetafileHeader>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromStream")

public actual fun gdipGetMetafileHeaderFromWmf(hwmf: Hmetafile, wmfplaceablefileheader: ConstPtr<WmfPlaceableFileHeader>, header: MutPtr<MetafileHeader>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromWmf")

public actual fun gdipGetNearestColor(graphics: MutPtr<GpGraphics>, argb: MutPtr<UInt>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetNearestColor")

public actual fun gdipGetPageScale(graphics: MutPtr<GpGraphics>, scale: MutPtr<Float>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPageScale")

public actual fun gdipGetPageUnit(graphics: MutPtr<GpGraphics>, unit: MutPtr<Unit>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPageUnit")

public actual fun gdipGetPathData(path: MutPtr<GpPath>, pathdata: MutPtr<PathData>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathData")

public actual fun gdipGetPathFillMode(path: MutPtr<GpPath>, fillmode: MutPtr<FillMode>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathFillMode")

public actual fun gdipGetPathGradientBlend(brush: MutPtr<GpPathGradient>, blend: MutPtr<Float>, positions: MutPtr<Float>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientBlend")

public actual fun gdipGetPathGradientBlendCount(brush: MutPtr<GpPathGradient>, count: MutPtr<Int>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientBlendCount")

public actual fun gdipGetPathGradientCenterColor(brush: MutPtr<GpPathGradient>, colors: MutPtr<UInt>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientCenterColor")

public actual fun gdipGetPathGradientCenterPoint(brush: MutPtr<GpPathGradient>, points: MutPtr<PointF>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientCenterPoint")

public actual fun gdipGetPathGradientCenterPointI(brush: MutPtr<GpPathGradient>, points: MutPtr<Point>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientCenterPointI")

public actual fun gdipGetPathGradientFocusScales(brush: MutPtr<GpPathGradient>, xscale: MutPtr<Float>, yscale: MutPtr<Float>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientFocusScales")

public actual fun gdipGetPathGradientGammaCorrection(brush: MutPtr<GpPathGradient>, usegammacorrection: MutPtr<Bool>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientGammaCorrection")

public actual fun gdipGetPathGradientPath(brush: MutPtr<GpPathGradient>, path: MutPtr<GpPath>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPath")

public actual fun gdipGetPathGradientPointCount(brush: MutPtr<GpPathGradient>, count: MutPtr<Int>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPointCount")

public actual fun gdipGetPathGradientPresetBlend(brush: MutPtr<GpPathGradient>, blend: MutPtr<UInt>, positions: MutPtr<Float>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPresetBlend")

public actual fun gdipGetPathGradientPresetBlendCount(brush: MutPtr<GpPathGradient>, count: MutPtr<Int>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPresetBlendCount")

public actual fun gdipGetPathGradientRect(brush: MutPtr<GpPathGradient>, rect: MutPtr<RectF>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientRect")

public actual fun gdipGetPathGradientRectI(brush: MutPtr<GpPathGradient>, rect: MutPtr<Rect>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientRectI")

public actual fun gdipGetPathGradientSurroundColorCount(brush: MutPtr<GpPathGradient>, count: MutPtr<Int>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientSurroundColorCount")

public actual fun gdipGetPathGradientSurroundColorsWithCount(brush: ConstPtr<GpPathGradient>, color: MutPtr<UInt>, count: MutPtr<Int>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientSurroundColorsWithCount")

public actual fun gdipGetPathGradientTransform(brush: MutPtr<GpPathGradient>, matrix: MutPtr<Matrix>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientTransform")

public actual fun gdipGetPathGradientWrapMode(brush: MutPtr<GpPathGradient>, wrapmode: MutPtr<WrapMode>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientWrapMode")

public actual fun gdipGetPathLastPoint(path: MutPtr<GpPath>, lastpoint: MutPtr<PointF>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathLastPoint")

public actual fun gdipGetPathPoints(param0: MutPtr<GpPath>, points: MutPtr<PointF>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathPoints")

public actual fun gdipGetPathPointsI(param0: MutPtr<GpPath>, points: MutPtr<Point>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathPointsI")

public actual fun gdipGetPathTypes(path: ConstPtr<GpPath>, types: MutPtr<UByte>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathTypes")

public actual fun gdipGetPathWorldBounds(path: MutPtr<GpPath>, bounds: MutPtr<RectF>, matrix: ConstPtr<Matrix>, pen: ConstPtr<GpPen>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathWorldBounds")

public actual fun gdipGetPathWorldBoundsI(path: MutPtr<GpPath>, bounds: MutPtr<Rect>, matrix: ConstPtr<Matrix>, pen: ConstPtr<GpPen>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPathWorldBoundsI")

public actual fun gdipGetPenBrushFill(pen: MutPtr<GpPen>, brush: MutPtr<MutPtr<GpBrush>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenBrushFill")

public actual fun gdipGetPenColor(pen: MutPtr<GpPen>, argb: MutPtr<UInt>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenColor")

public actual fun gdipGetPenCompoundArray(pen: MutPtr<GpPen>, dash: MutPtr<Float>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenCompoundArray")

public actual fun gdipGetPenCompoundCount(pen: MutPtr<GpPen>, count: MutPtr<Int>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenCompoundCount")

public actual fun gdipGetPenCustomEndCap(pen: MutPtr<GpPen>, customcap: MutPtr<MutPtr<GpCustomLineCap>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenCustomEndCap")

public actual fun gdipGetPenCustomStartCap(pen: MutPtr<GpPen>, customcap: MutPtr<MutPtr<GpCustomLineCap>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenCustomStartCap")

public actual fun gdipGetPenDashArray(pen: MutPtr<GpPen>, dash: MutPtr<Float>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashArray")

public actual fun gdipGetPenDashCap197819(pen: MutPtr<GpPen>, dashcap: MutPtr<DashCap>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashCap197819")

public actual fun gdipGetPenDashCount(pen: MutPtr<GpPen>, count: MutPtr<Int>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashCount")

public actual fun gdipGetPenDashOffset(pen: MutPtr<GpPen>, offset: MutPtr<Float>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashOffset")

public actual fun gdipGetPenDashStyle(pen: MutPtr<GpPen>, dashstyle: MutPtr<DashStyle>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashStyle")

public actual fun gdipGetPenEndCap(pen: MutPtr<GpPen>, endcap: MutPtr<LineCap>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenEndCap")

public actual fun gdipGetPenFillType(pen: MutPtr<GpPen>, type: MutPtr<PenType>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenFillType")

public actual fun gdipGetPenLineJoin(pen: MutPtr<GpPen>, linejoin: MutPtr<LineJoin>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenLineJoin")

public actual fun gdipGetPenMiterLimit(pen: MutPtr<GpPen>, miterlimit: MutPtr<Float>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenMiterLimit")

public actual fun gdipGetPenMode(pen: MutPtr<GpPen>, penmode: MutPtr<PenAlignment>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenMode")

public actual fun gdipGetPenStartCap(pen: MutPtr<GpPen>, startcap: MutPtr<LineCap>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenStartCap")

public actual fun gdipGetPenTransform(pen: MutPtr<GpPen>, matrix: MutPtr<Matrix>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenTransform")

public actual fun gdipGetPenUnit(pen: MutPtr<GpPen>, unit: MutPtr<Unit>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenUnit")

public actual fun gdipGetPenWidth(pen: MutPtr<GpPen>, width: MutPtr<Float>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPenWidth")

public actual fun gdipGetPixelOffsetMode(graphics: MutPtr<GpGraphics>, pixeloffsetmode: MutPtr<PixelOffsetMode>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPixelOffsetMode")

public actual fun gdipGetPointCount(path: MutPtr<GpPath>, count: MutPtr<Int>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPointCount")

public actual fun gdipGetPropertyCount(image: MutPtr<GpImage>, numofproperty: MutPtr<UInt>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyCount")

public actual fun gdipGetPropertyIdList(image: MutPtr<GpImage>, numofproperty: UInt, list: MutPtr<UInt>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyIdList")

public actual fun gdipGetPropertyItem(image: MutPtr<GpImage>, propid: UInt, propsize: UInt, buffer: MutPtr<PropertyItem>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyItem")

public actual fun gdipGetPropertyItemSize(image: MutPtr<GpImage>, propid: UInt, size: MutPtr<UInt>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyItemSize")

public actual fun gdipGetPropertySize(image: MutPtr<GpImage>, totalbuffersize: MutPtr<UInt>, numproperties: MutPtr<UInt>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetPropertySize")

public actual fun gdipGetRegionBounds(region: MutPtr<GpRegion>, graphics: MutPtr<GpGraphics>, rect: MutPtr<RectF>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetRegionBounds")

public actual fun gdipGetRegionBoundsI(region: MutPtr<GpRegion>, graphics: MutPtr<GpGraphics>, rect: MutPtr<Rect>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetRegionBoundsI")

public actual fun gdipGetRegionData(region: MutPtr<GpRegion>, buffer: MutPtr<UByte>, buffersize: UInt, sizefilled: MutPtr<UInt>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetRegionData")

public actual fun gdipGetRegionDataSize(region: MutPtr<GpRegion>, buffersize: MutPtr<UInt>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetRegionDataSize")

public actual fun gdipGetRegionHRgn(region: MutPtr<GpRegion>, graphics: MutPtr<GpGraphics>, hrgn: MutPtr<Hrgn>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetRegionHRgn")

public actual fun gdipGetRegionScans(region: MutPtr<GpRegion>, rects: MutPtr<RectF>, count: MutPtr<Int>, matrix: MutPtr<Matrix>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetRegionScans")

public actual fun gdipGetRegionScansCount(region: MutPtr<GpRegion>, count: MutPtr<UInt>, matrix: MutPtr<Matrix>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetRegionScansCount")

public actual fun gdipGetRegionScansI(region: MutPtr<GpRegion>, rects: MutPtr<Rect>, count: MutPtr<Int>, matrix: MutPtr<Matrix>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetRegionScansI")

public actual fun gdipGetRenderingOrigin(graphics: MutPtr<GpGraphics>, x: MutPtr<Int>, y: MutPtr<Int>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetRenderingOrigin")

public actual fun gdipGetSmoothingMode(graphics: MutPtr<GpGraphics>, smoothingmode: MutPtr<SmoothingMode>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetSmoothingMode")

public actual fun gdipGetSolidFillColor(brush: MutPtr<GpSolidFill>, color: MutPtr<UInt>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetSolidFillColor")

public actual fun gdipGetStringFormatAlign(format: ConstPtr<GpStringFormat>, align: MutPtr<StringAlignment>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatAlign")

public actual fun gdipGetStringFormatDigitSubstitution(format: ConstPtr<GpStringFormat>, language: MutPtr<UShort>, substitute: MutPtr<StringDigitSubstitute>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatDigitSubstitution")

public actual fun gdipGetStringFormatFlags(format: ConstPtr<GpStringFormat>, flags: MutPtr<Int>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatFlags")

public actual fun gdipGetStringFormatHotkeyPrefix(format: ConstPtr<GpStringFormat>, hotkeyprefix: MutPtr<Int>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatHotkeyPrefix")

public actual fun gdipGetStringFormatLineAlign(format: ConstPtr<GpStringFormat>, align: MutPtr<StringAlignment>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatLineAlign")

public actual fun gdipGetStringFormatMeasurableCharacterRangeCount(format: ConstPtr<GpStringFormat>, count: MutPtr<Int>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatMeasurableCharacterRangeCount")

public actual fun gdipGetStringFormatTabStopCount(format: ConstPtr<GpStringFormat>, count: MutPtr<Int>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatTabStopCount")

public actual fun gdipGetStringFormatTabStops(format: ConstPtr<GpStringFormat>, count: Int, firsttaboffset: MutPtr<Float>, tabstops: MutPtr<Float>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatTabStops")

public actual fun gdipGetStringFormatTrimming(format: ConstPtr<GpStringFormat>, trimming: MutPtr<StringTrimming>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatTrimming")

public actual fun gdipGetTextContrast(graphics: MutPtr<GpGraphics>, contrast: MutPtr<UInt>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetTextContrast")

public actual fun gdipGetTextRenderingHint(graphics: MutPtr<GpGraphics>, mode: MutPtr<TextRenderingHint>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetTextRenderingHint")

public actual fun gdipGetTextureImage(brush: MutPtr<GpTexture>, image: MutPtr<MutPtr<GpImage>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetTextureImage")

public actual fun gdipGetTextureTransform(brush: MutPtr<GpTexture>, matrix: MutPtr<Matrix>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetTextureTransform")

public actual fun gdipGetTextureWrapMode(brush: MutPtr<GpTexture>, wrapmode: MutPtr<WrapMode>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetTextureWrapMode")

public actual fun gdipGetVisibleClipBounds(graphics: MutPtr<GpGraphics>, rect: MutPtr<RectF>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetVisibleClipBounds")

public actual fun gdipGetVisibleClipBoundsI(graphics: MutPtr<GpGraphics>, rect: MutPtr<Rect>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetVisibleClipBoundsI")

public actual fun gdipGetWorldTransform(graphics: MutPtr<GpGraphics>, matrix: MutPtr<Matrix>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGetWorldTransform")

public actual fun gdipGraphicsClear(graphics: MutPtr<GpGraphics>, color: UInt): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGraphicsClear")

public actual fun gdipGraphicsSetAbort(pgraphics: MutPtr<GpGraphics>, piabort: MutPtr<CVoid>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipGraphicsSetAbort")

public actual fun gdipImageForceValidation(image: MutPtr<GpImage>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipImageForceValidation")

public actual fun gdipImageGetFrameCount(image: MutPtr<GpImage>, dimensionid: ConstPtr<Guid>, count: MutPtr<UInt>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipImageGetFrameCount")

public actual fun gdipImageGetFrameDimensionsCount(image: MutPtr<GpImage>, count: MutPtr<UInt>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipImageGetFrameDimensionsCount")

public actual fun gdipImageGetFrameDimensionsList(image: MutPtr<GpImage>, dimensionids: MutPtr<Guid>, count: UInt): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipImageGetFrameDimensionsList")

public actual fun gdipImageRotateFlip(image: MutPtr<GpImage>, rftype: RotateFlipType): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipImageRotateFlip")

public actual fun gdipImageSelectActiveFrame(image: MutPtr<GpImage>, dimensionid: ConstPtr<Guid>, frameindex: UInt): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipImageSelectActiveFrame")

public actual fun gdipImageSetAbort(pimage: MutPtr<GpImage>, piabort: MutPtr<CVoid>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipImageSetAbort")

public actual fun gdipInitializePalette(palette: MutPtr<ColorPalette>, palettetype: PaletteType, optimalcolors: Int, usetransparentcolor: Bool, bitmap: MutPtr<GpBitmap>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipInitializePalette")

public actual fun gdipInvertMatrix(matrix: MutPtr<Matrix>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipInvertMatrix")

public actual fun gdipIsClipEmpty(graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsClipEmpty")

public actual fun gdipIsEmptyRegion(region: MutPtr<GpRegion>, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsEmptyRegion")

public actual fun gdipIsEqualRegion(region: MutPtr<GpRegion>, region2: MutPtr<GpRegion>, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsEqualRegion")

public actual fun gdipIsInfiniteRegion(region: MutPtr<GpRegion>, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsInfiniteRegion")

public actual fun gdipIsMatrixEqual(matrix: ConstPtr<Matrix>, matrix2: ConstPtr<Matrix>, result: MutPtr<Bool>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsMatrixEqual")

public actual fun gdipIsMatrixIdentity(matrix: ConstPtr<Matrix>, result: MutPtr<Bool>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsMatrixIdentity")

public actual fun gdipIsMatrixInvertible(matrix: ConstPtr<Matrix>, result: MutPtr<Bool>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsMatrixInvertible")

public actual fun gdipIsOutlineVisiblePathPoint(path: MutPtr<GpPath>, x: Float, y: Float, pen: MutPtr<GpPen>, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsOutlineVisiblePathPoint")

public actual fun gdipIsOutlineVisiblePathPointI(path: MutPtr<GpPath>, x: Int, y: Int, pen: MutPtr<GpPen>, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsOutlineVisiblePathPointI")

public actual fun gdipIsStyleAvailable(family: ConstPtr<GpFontFamily>, style: Int, isstyleavailable: MutPtr<Bool>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsStyleAvailable")

public actual fun gdipIsVisibleClipEmpty(graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleClipEmpty")

public actual fun gdipIsVisiblePathPoint(path: MutPtr<GpPath>, x: Float, y: Float, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePathPoint")

public actual fun gdipIsVisiblePathPointI(path: MutPtr<GpPath>, x: Int, y: Int, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePathPointI")

public actual fun gdipIsVisiblePoint(graphics: MutPtr<GpGraphics>, x: Float, y: Float, result: MutPtr<Bool>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePoint")

public actual fun gdipIsVisiblePointI(graphics: MutPtr<GpGraphics>, x: Int, y: Int, result: MutPtr<Bool>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePointI")

public actual fun gdipIsVisibleRect(graphics: MutPtr<GpGraphics>, x: Float, y: Float, width: Float, height: Float, result: MutPtr<Bool>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRect")

public actual fun gdipIsVisibleRectI(graphics: MutPtr<GpGraphics>, x: Int, y: Int, width: Int, height: Int, result: MutPtr<Bool>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRectI")

public actual fun gdipIsVisibleRegionPoint(region: MutPtr<GpRegion>, x: Float, y: Float, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionPoint")

public actual fun gdipIsVisibleRegionPointI(region: MutPtr<GpRegion>, x: Int, y: Int, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionPointI")

public actual fun gdipIsVisibleRegionRect(region: MutPtr<GpRegion>, x: Float, y: Float, width: Float, height: Float, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionRect")

public actual fun gdipIsVisibleRegionRectI(region: MutPtr<GpRegion>, x: Int, y: Int, width: Int, height: Int, graphics: MutPtr<GpGraphics>, result: MutPtr<Bool>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionRectI")

public actual fun gdipLoadImageFromFile(filename: Pcwstr, image: MutPtr<MutPtr<GpImage>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromFile")

public actual fun gdipLoadImageFromFileICM(filename: Pcwstr, image: MutPtr<MutPtr<GpImage>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromFileICM")

public actual fun gdipLoadImageFromStream(stream: MutPtr<CVoid>, image: MutPtr<MutPtr<GpImage>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromStream")

public actual fun gdipLoadImageFromStreamICM(stream: MutPtr<CVoid>, image: MutPtr<MutPtr<GpImage>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromStreamICM")

public actual fun gdipMeasureCharacterRanges(graphics: MutPtr<GpGraphics>, string: Pcwstr, length: Int, font: ConstPtr<GpFont>, layoutrect: ConstPtr<RectF>, stringformat: ConstPtr<GpStringFormat>, regioncount: Int, regions: MutPtr<MutPtr<GpRegion>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipMeasureCharacterRanges")

public actual fun gdipMeasureDriverString(graphics: MutPtr<GpGraphics>, text: ConstPtr<UShort>, length: Int, font: ConstPtr<GpFont>, positions: ConstPtr<PointF>, flags: Int, matrix: ConstPtr<Matrix>, boundingbox: MutPtr<RectF>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipMeasureDriverString")

public actual fun gdipMeasureString(graphics: MutPtr<GpGraphics>, string: Pcwstr, length: Int, font: ConstPtr<GpFont>, layoutrect: ConstPtr<RectF>, stringformat: ConstPtr<GpStringFormat>, boundingbox: MutPtr<RectF>, codepointsfitted: MutPtr<Int>, linesfilled: MutPtr<Int>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipMeasureString")

public actual fun gdipMultiplyLineTransform(brush: MutPtr<GpLineGradient>, matrix: ConstPtr<Matrix>, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipMultiplyLineTransform")

public actual fun gdipMultiplyMatrix(matrix: MutPtr<Matrix>, matrix2: MutPtr<Matrix>, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipMultiplyMatrix")

public actual fun gdipMultiplyPathGradientTransform(brush: MutPtr<GpPathGradient>, matrix: ConstPtr<Matrix>, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipMultiplyPathGradientTransform")

public actual fun gdipMultiplyPenTransform(pen: MutPtr<GpPen>, matrix: ConstPtr<Matrix>, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipMultiplyPenTransform")

public actual fun gdipMultiplyTextureTransform(brush: MutPtr<GpTexture>, matrix: ConstPtr<Matrix>, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipMultiplyTextureTransform")

public actual fun gdipMultiplyWorldTransform(graphics: MutPtr<GpGraphics>, matrix: ConstPtr<Matrix>, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipMultiplyWorldTransform")

public actual fun gdipNewInstalledFontCollection(fontcollection: MutPtr<MutPtr<GpFontCollection>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipNewInstalledFontCollection")

public actual fun gdipNewPrivateFontCollection(fontcollection: MutPtr<MutPtr<GpFontCollection>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipNewPrivateFontCollection")

public actual fun gdipPathIterCopyData(iterator: MutPtr<GpPathIterator>, resultcount: MutPtr<Int>, points: MutPtr<PointF>, types: MutPtr<UByte>, startindex: Int, endindex: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipPathIterCopyData")

public actual fun gdipPathIterEnumerate(iterator: MutPtr<GpPathIterator>, resultcount: MutPtr<Int>, points: MutPtr<PointF>, types: MutPtr<UByte>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipPathIterEnumerate")

public actual fun gdipPathIterGetCount(iterator: MutPtr<GpPathIterator>, count: MutPtr<Int>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipPathIterGetCount")

public actual fun gdipPathIterGetSubpathCount(iterator: MutPtr<GpPathIterator>, count: MutPtr<Int>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipPathIterGetSubpathCount")

public actual fun gdipPathIterHasCurve(iterator: MutPtr<GpPathIterator>, hascurve: MutPtr<Bool>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipPathIterHasCurve")

public actual fun gdipPathIterIsValid(iterator: MutPtr<GpPathIterator>, valid: MutPtr<Bool>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipPathIterIsValid")

public actual fun gdipPathIterNextMarker(iterator: MutPtr<GpPathIterator>, resultcount: MutPtr<Int>, startindex: MutPtr<Int>, endindex: MutPtr<Int>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextMarker")

public actual fun gdipPathIterNextMarkerPath(iterator: MutPtr<GpPathIterator>, resultcount: MutPtr<Int>, path: MutPtr<GpPath>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextMarkerPath")

public actual fun gdipPathIterNextPathType(iterator: MutPtr<GpPathIterator>, resultcount: MutPtr<Int>, pathtype: MutPtr<UByte>, startindex: MutPtr<Int>, endindex: MutPtr<Int>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextPathType")

public actual fun gdipPathIterNextSubpath(iterator: MutPtr<GpPathIterator>, resultcount: MutPtr<Int>, startindex: MutPtr<Int>, endindex: MutPtr<Int>, isclosed: MutPtr<Bool>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextSubpath")

public actual fun gdipPathIterNextSubpathPath(iterator: MutPtr<GpPathIterator>, resultcount: MutPtr<Int>, path: MutPtr<GpPath>, isclosed: MutPtr<Bool>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextSubpathPath")

public actual fun gdipPathIterRewind(iterator: MutPtr<GpPathIterator>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipPathIterRewind")

public actual fun gdipPlayMetafileRecord(metafile: ConstPtr<GpMetafile>, recordtype: EmfPlusRecordType, flags: UInt, datasize: UInt, data: ConstPtr<UByte>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipPlayMetafileRecord")

public actual fun gdipPrivateAddFontFile(fontcollection: MutPtr<GpFontCollection>, filename: Pcwstr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipPrivateAddFontFile")

public actual fun gdipPrivateAddMemoryFont(fontcollection: MutPtr<GpFontCollection>, memory: ConstPtr<CVoid>, length: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipPrivateAddMemoryFont")

public actual fun gdipRecordMetafile(referencehdc: Hdc, type: EmfType, framerect: ConstPtr<RectF>, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr<MutPtr<GpMetafile>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafile")

public actual fun gdipRecordMetafileFileName(filename: Pcwstr, referencehdc: Hdc, type: EmfType, framerect: ConstPtr<RectF>, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr<MutPtr<GpMetafile>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileFileName")

public actual fun gdipRecordMetafileFileNameI(filename: Pcwstr, referencehdc: Hdc, type: EmfType, framerect: ConstPtr<Rect>, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr<MutPtr<GpMetafile>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileFileNameI")

public actual fun gdipRecordMetafileI(referencehdc: Hdc, type: EmfType, framerect: ConstPtr<Rect>, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr<MutPtr<GpMetafile>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileI")

public actual fun gdipRecordMetafileStream(stream: MutPtr<CVoid>, referencehdc: Hdc, type: EmfType, framerect: ConstPtr<RectF>, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr<MutPtr<GpMetafile>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileStream")

public actual fun gdipRecordMetafileStreamI(stream: MutPtr<CVoid>, referencehdc: Hdc, type: EmfType, framerect: ConstPtr<Rect>, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr<MutPtr<GpMetafile>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileStreamI")

public actual fun gdipReleaseDC(graphics: MutPtr<GpGraphics>, hdc: Hdc): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipReleaseDC")

public actual fun gdipRemovePropertyItem(image: MutPtr<GpImage>, propid: UInt): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipRemovePropertyItem")

public actual fun gdipResetClip(graphics: MutPtr<GpGraphics>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipResetClip")

public actual fun gdipResetImageAttributes(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipResetImageAttributes")

public actual fun gdipResetLineTransform(brush: MutPtr<GpLineGradient>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipResetLineTransform")

public actual fun gdipResetPageTransform(graphics: MutPtr<GpGraphics>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipResetPageTransform")

public actual fun gdipResetPath(path: MutPtr<GpPath>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipResetPath")

public actual fun gdipResetPathGradientTransform(brush: MutPtr<GpPathGradient>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipResetPathGradientTransform")

public actual fun gdipResetPenTransform(pen: MutPtr<GpPen>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipResetPenTransform")

public actual fun gdipResetTextureTransform(brush: MutPtr<GpTexture>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipResetTextureTransform")

public actual fun gdipResetWorldTransform(graphics: MutPtr<GpGraphics>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipResetWorldTransform")

public actual fun gdipRestoreGraphics(graphics: MutPtr<GpGraphics>, state: UInt): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipRestoreGraphics")

public actual fun gdipReversePath(path: MutPtr<GpPath>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipReversePath")

public actual fun gdipRotateLineTransform(brush: MutPtr<GpLineGradient>, angle: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipRotateLineTransform")

public actual fun gdipRotateMatrix(matrix: MutPtr<Matrix>, angle: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipRotateMatrix")

public actual fun gdipRotatePathGradientTransform(brush: MutPtr<GpPathGradient>, angle: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipRotatePathGradientTransform")

public actual fun gdipRotatePenTransform(pen: MutPtr<GpPen>, angle: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipRotatePenTransform")

public actual fun gdipRotateTextureTransform(brush: MutPtr<GpTexture>, angle: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipRotateTextureTransform")

public actual fun gdipRotateWorldTransform(graphics: MutPtr<GpGraphics>, angle: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipRotateWorldTransform")

public actual fun gdipSaveAdd(image: MutPtr<GpImage>, encoderparams: ConstPtr<EncoderParameters>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSaveAdd")

public actual fun gdipSaveAddImage(image: MutPtr<GpImage>, newimage: MutPtr<GpImage>, encoderparams: ConstPtr<EncoderParameters>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSaveAddImage")

public actual fun gdipSaveGraphics(graphics: MutPtr<GpGraphics>, state: MutPtr<UInt>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSaveGraphics")

public actual fun gdipSaveImageToFile(image: MutPtr<GpImage>, filename: Pcwstr, clsidencoder: ConstPtr<Guid>, encoderparams: ConstPtr<EncoderParameters>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSaveImageToFile")

public actual fun gdipSaveImageToStream(image: MutPtr<GpImage>, stream: MutPtr<CVoid>, clsidencoder: ConstPtr<Guid>, encoderparams: ConstPtr<EncoderParameters>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSaveImageToStream")

public actual fun gdipScaleLineTransform(brush: MutPtr<GpLineGradient>, sx: Float, sy: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipScaleLineTransform")

public actual fun gdipScaleMatrix(matrix: MutPtr<Matrix>, scalex: Float, scaley: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipScaleMatrix")

public actual fun gdipScalePathGradientTransform(brush: MutPtr<GpPathGradient>, sx: Float, sy: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipScalePathGradientTransform")

public actual fun gdipScalePenTransform(pen: MutPtr<GpPen>, sx: Float, sy: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipScalePenTransform")

public actual fun gdipScaleTextureTransform(brush: MutPtr<GpTexture>, sx: Float, sy: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipScaleTextureTransform")

public actual fun gdipScaleWorldTransform(graphics: MutPtr<GpGraphics>, sx: Float, sy: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipScaleWorldTransform")

public actual fun gdipSetAdjustableArrowCapFillState(cap: MutPtr<GpAdjustableArrowCap>, fillstate: Bool): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapFillState")

public actual fun gdipSetAdjustableArrowCapHeight(cap: MutPtr<GpAdjustableArrowCap>, height: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapHeight")

public actual fun gdipSetAdjustableArrowCapMiddleInset(cap: MutPtr<GpAdjustableArrowCap>, middleinset: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapMiddleInset")

public actual fun gdipSetAdjustableArrowCapWidth(cap: MutPtr<GpAdjustableArrowCap>, width: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapWidth")

public actual fun gdipSetClipGraphics(graphics: MutPtr<GpGraphics>, srcgraphics: MutPtr<GpGraphics>, combinemode: CombineMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetClipGraphics")

public actual fun gdipSetClipHrgn(graphics: MutPtr<GpGraphics>, hrgn: Hrgn, combinemode: CombineMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetClipHrgn")

public actual fun gdipSetClipPath(graphics: MutPtr<GpGraphics>, path: MutPtr<GpPath>, combinemode: CombineMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetClipPath")

public actual fun gdipSetClipRect(graphics: MutPtr<GpGraphics>, x: Float, y: Float, width: Float, height: Float, combinemode: CombineMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetClipRect")

public actual fun gdipSetClipRectI(graphics: MutPtr<GpGraphics>, x: Int, y: Int, width: Int, height: Int, combinemode: CombineMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetClipRectI")

public actual fun gdipSetClipRegion(graphics: MutPtr<GpGraphics>, region: MutPtr<GpRegion>, combinemode: CombineMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetClipRegion")

public actual fun gdipSetCompositingMode(graphics: MutPtr<GpGraphics>, compositingmode: CompositingMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetCompositingMode")

public actual fun gdipSetCompositingQuality(graphics: MutPtr<GpGraphics>, compositingquality: CompositingQuality): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetCompositingQuality")

public actual fun gdipSetCustomLineCapBaseCap(customcap: MutPtr<GpCustomLineCap>, basecap: LineCap): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapBaseCap")

public actual fun gdipSetCustomLineCapBaseInset(customcap: MutPtr<GpCustomLineCap>, inset: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapBaseInset")

public actual fun gdipSetCustomLineCapStrokeCaps(customcap: MutPtr<GpCustomLineCap>, startcap: LineCap, endcap: LineCap): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapStrokeCaps")

public actual fun gdipSetCustomLineCapStrokeJoin(customcap: MutPtr<GpCustomLineCap>, linejoin: LineJoin): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapStrokeJoin")

public actual fun gdipSetCustomLineCapWidthScale(customcap: MutPtr<GpCustomLineCap>, widthscale: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapWidthScale")

public actual fun gdipSetEffectParameters(effect: MutPtr<CGpEffect>, params: ConstPtr<CVoid>, size: UInt): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetEffectParameters")

public actual fun gdipSetEmpty(region: MutPtr<GpRegion>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetEmpty")

public actual fun gdipSetImageAttributesCachedBackground(imageattr: MutPtr<GpImageAttributes>, enableflag: Bool): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesCachedBackground")

public actual fun gdipSetImageAttributesColorKeys(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType, enableflag: Bool, colorlow: UInt, colorhigh: UInt): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesColorKeys")

public actual fun gdipSetImageAttributesColorMatrix(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType, enableflag: Bool, colormatrix: ConstPtr<ColorMatrix>, graymatrix: ConstPtr<ColorMatrix>, flags: ColorMatrixFlags): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesColorMatrix")

public actual fun gdipSetImageAttributesGamma(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType, enableflag: Bool, gamma: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesGamma")

public actual fun gdipSetImageAttributesNoOp(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType, enableflag: Bool): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesNoOp")

public actual fun gdipSetImageAttributesOutputChannel(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType, enableflag: Bool, channelflags: ColorChannelFlags): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesOutputChannel")

public actual fun gdipSetImageAttributesOutputChannelColorProfile(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType, enableflag: Bool, colorprofilefilename: Pcwstr): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesOutputChannelColorProfile")

public actual fun gdipSetImageAttributesRemapTable(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType, enableflag: Bool, mapsize: UInt, map: ConstPtr<ColorMap>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesRemapTable")

public actual fun gdipSetImageAttributesThreshold(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType, enableflag: Bool, threshold: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesThreshold")

public actual fun gdipSetImageAttributesToIdentity(imageattr: MutPtr<GpImageAttributes>, type: ColorAdjustType): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesToIdentity")

public actual fun gdipSetImageAttributesWrapMode(imageattr: MutPtr<GpImageAttributes>, wrap: WrapMode, argb: UInt, clamp: Bool): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesWrapMode")

public actual fun gdipSetImagePalette(image: MutPtr<GpImage>, palette: ConstPtr<ColorPalette>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetImagePalette")

public actual fun gdipSetInfinite(region: MutPtr<GpRegion>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetInfinite")

public actual fun gdipSetInterpolationMode(graphics: MutPtr<GpGraphics>, interpolationmode: InterpolationMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetInterpolationMode")

public actual fun gdipSetLineBlend(brush: MutPtr<GpLineGradient>, blend: ConstPtr<Float>, positions: ConstPtr<Float>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetLineBlend")

public actual fun gdipSetLineColors(brush: MutPtr<GpLineGradient>, color1: UInt, color2: UInt): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetLineColors")

public actual fun gdipSetLineGammaCorrection(brush: MutPtr<GpLineGradient>, usegammacorrection: Bool): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetLineGammaCorrection")

public actual fun gdipSetLineLinearBlend(brush: MutPtr<GpLineGradient>, focus: Float, scale: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetLineLinearBlend")

public actual fun gdipSetLinePresetBlend(brush: MutPtr<GpLineGradient>, blend: ConstPtr<UInt>, positions: ConstPtr<Float>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetLinePresetBlend")

public actual fun gdipSetLineSigmaBlend(brush: MutPtr<GpLineGradient>, focus: Float, scale: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetLineSigmaBlend")

public actual fun gdipSetLineTransform(brush: MutPtr<GpLineGradient>, matrix: ConstPtr<Matrix>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetLineTransform")

public actual fun gdipSetLineWrapMode(brush: MutPtr<GpLineGradient>, wrapmode: WrapMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetLineWrapMode")

public actual fun gdipSetMatrixElements(matrix: MutPtr<Matrix>, m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetMatrixElements")

public actual fun gdipSetMetafileDownLevelRasterizationLimit(metafile: MutPtr<GpMetafile>, metafilerasterizationlimitdpi: UInt): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetMetafileDownLevelRasterizationLimit")

public actual fun gdipSetPageScale(graphics: MutPtr<GpGraphics>, scale: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPageScale")

public actual fun gdipSetPageUnit(graphics: MutPtr<GpGraphics>, unit: Unit): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPageUnit")

public actual fun gdipSetPathFillMode(path: MutPtr<GpPath>, fillmode: FillMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPathFillMode")

public actual fun gdipSetPathGradientBlend(brush: MutPtr<GpPathGradient>, blend: ConstPtr<Float>, positions: ConstPtr<Float>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientBlend")

public actual fun gdipSetPathGradientCenterColor(brush: MutPtr<GpPathGradient>, colors: UInt): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientCenterColor")

public actual fun gdipSetPathGradientCenterPoint(brush: MutPtr<GpPathGradient>, points: ConstPtr<PointF>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientCenterPoint")

public actual fun gdipSetPathGradientCenterPointI(brush: MutPtr<GpPathGradient>, points: ConstPtr<Point>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientCenterPointI")

public actual fun gdipSetPathGradientFocusScales(brush: MutPtr<GpPathGradient>, xscale: Float, yscale: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientFocusScales")

public actual fun gdipSetPathGradientGammaCorrection(brush: MutPtr<GpPathGradient>, usegammacorrection: Bool): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientGammaCorrection")

public actual fun gdipSetPathGradientLinearBlend(brush: MutPtr<GpPathGradient>, focus: Float, scale: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientLinearBlend")

public actual fun gdipSetPathGradientPath(brush: MutPtr<GpPathGradient>, path: ConstPtr<GpPath>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientPath")

public actual fun gdipSetPathGradientPresetBlend(brush: MutPtr<GpPathGradient>, blend: ConstPtr<UInt>, positions: ConstPtr<Float>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientPresetBlend")

public actual fun gdipSetPathGradientSigmaBlend(brush: MutPtr<GpPathGradient>, focus: Float, scale: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientSigmaBlend")

public actual fun gdipSetPathGradientSurroundColorsWithCount(brush: MutPtr<GpPathGradient>, color: ConstPtr<UInt>, count: MutPtr<Int>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientSurroundColorsWithCount")

public actual fun gdipSetPathGradientTransform(brush: MutPtr<GpPathGradient>, matrix: MutPtr<Matrix>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientTransform")

public actual fun gdipSetPathGradientWrapMode(brush: MutPtr<GpPathGradient>, wrapmode: WrapMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientWrapMode")

public actual fun gdipSetPathMarker(path: MutPtr<GpPath>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPathMarker")

public actual fun gdipSetPenBrushFill(pen: MutPtr<GpPen>, brush: MutPtr<GpBrush>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenBrushFill")

public actual fun gdipSetPenColor(pen: MutPtr<GpPen>, argb: UInt): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenColor")

public actual fun gdipSetPenCompoundArray(pen: MutPtr<GpPen>, dash: ConstPtr<Float>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenCompoundArray")

public actual fun gdipSetPenCustomEndCap(pen: MutPtr<GpPen>, customcap: MutPtr<GpCustomLineCap>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenCustomEndCap")

public actual fun gdipSetPenCustomStartCap(pen: MutPtr<GpPen>, customcap: MutPtr<GpCustomLineCap>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenCustomStartCap")

public actual fun gdipSetPenDashArray(pen: MutPtr<GpPen>, dash: ConstPtr<Float>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashArray")

public actual fun gdipSetPenDashCap197819(pen: MutPtr<GpPen>, dashcap: DashCap): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashCap197819")

public actual fun gdipSetPenDashOffset(pen: MutPtr<GpPen>, offset: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashOffset")

public actual fun gdipSetPenDashStyle(pen: MutPtr<GpPen>, dashstyle: DashStyle): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashStyle")

public actual fun gdipSetPenEndCap(pen: MutPtr<GpPen>, endcap: LineCap): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenEndCap")

public actual fun gdipSetPenLineCap197819(pen: MutPtr<GpPen>, startcap: LineCap, endcap: LineCap, dashcap: DashCap): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenLineCap197819")

public actual fun gdipSetPenLineJoin(pen: MutPtr<GpPen>, linejoin: LineJoin): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenLineJoin")

public actual fun gdipSetPenMiterLimit(pen: MutPtr<GpPen>, miterlimit: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenMiterLimit")

public actual fun gdipSetPenMode(pen: MutPtr<GpPen>, penmode: PenAlignment): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenMode")

public actual fun gdipSetPenStartCap(pen: MutPtr<GpPen>, startcap: LineCap): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenStartCap")

public actual fun gdipSetPenTransform(pen: MutPtr<GpPen>, matrix: MutPtr<Matrix>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenTransform")

public actual fun gdipSetPenUnit(pen: MutPtr<GpPen>, unit: Unit): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenUnit")

public actual fun gdipSetPenWidth(pen: MutPtr<GpPen>, width: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPenWidth")

public actual fun gdipSetPixelOffsetMode(graphics: MutPtr<GpGraphics>, pixeloffsetmode: PixelOffsetMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPixelOffsetMode")

public actual fun gdipSetPropertyItem(image: MutPtr<GpImage>, item: ConstPtr<PropertyItem>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetPropertyItem")

public actual fun gdipSetRenderingOrigin(graphics: MutPtr<GpGraphics>, x: Int, y: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetRenderingOrigin")

public actual fun gdipSetSmoothingMode(graphics: MutPtr<GpGraphics>, smoothingmode: SmoothingMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetSmoothingMode")

public actual fun gdipSetSolidFillColor(brush: MutPtr<GpSolidFill>, color: UInt): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetSolidFillColor")

public actual fun gdipSetStringFormatAlign(format: MutPtr<GpStringFormat>, align: StringAlignment): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatAlign")

public actual fun gdipSetStringFormatDigitSubstitution(format: MutPtr<GpStringFormat>, language: UShort, substitute: StringDigitSubstitute): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatDigitSubstitution")

public actual fun gdipSetStringFormatFlags(format: MutPtr<GpStringFormat>, flags: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatFlags")

public actual fun gdipSetStringFormatHotkeyPrefix(format: MutPtr<GpStringFormat>, hotkeyprefix: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatHotkeyPrefix")

public actual fun gdipSetStringFormatLineAlign(format: MutPtr<GpStringFormat>, align: StringAlignment): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatLineAlign")

public actual fun gdipSetStringFormatMeasurableCharacterRanges(format: MutPtr<GpStringFormat>, rangecount: Int, ranges: ConstPtr<CharacterRange>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatMeasurableCharacterRanges")

public actual fun gdipSetStringFormatTabStops(format: MutPtr<GpStringFormat>, firsttaboffset: Float, count: Int, tabstops: ConstPtr<Float>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatTabStops")

public actual fun gdipSetStringFormatTrimming(format: MutPtr<GpStringFormat>, trimming: StringTrimming): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatTrimming")

public actual fun gdipSetTextContrast(graphics: MutPtr<GpGraphics>, contrast: UInt): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetTextContrast")

public actual fun gdipSetTextRenderingHint(graphics: MutPtr<GpGraphics>, mode: TextRenderingHint): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetTextRenderingHint")

public actual fun gdipSetTextureTransform(brush: MutPtr<GpTexture>, matrix: ConstPtr<Matrix>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetTextureTransform")

public actual fun gdipSetTextureWrapMode(brush: MutPtr<GpTexture>, wrapmode: WrapMode): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetTextureWrapMode")

public actual fun gdipSetWorldTransform(graphics: MutPtr<GpGraphics>, matrix: MutPtr<Matrix>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipSetWorldTransform")

public actual fun gdipShearMatrix(matrix: MutPtr<Matrix>, shearx: Float, sheary: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipShearMatrix")

public actual fun gdipStartPathFigure(path: MutPtr<GpPath>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipStartPathFigure")

public actual fun gdipStringFormatGetGenericDefault(format: MutPtr<MutPtr<GpStringFormat>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipStringFormatGetGenericDefault")

public actual fun gdipStringFormatGetGenericTypographic(format: MutPtr<MutPtr<GpStringFormat>>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipStringFormatGetGenericTypographic")

public actual fun gdipTestControl(control: GpTestControlEnum, param1: MutPtr<CVoid>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTestControl")

public actual fun gdipTransformMatrixPoints(matrix: MutPtr<Matrix>, pts: MutPtr<PointF>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTransformMatrixPoints")

public actual fun gdipTransformMatrixPointsI(matrix: MutPtr<Matrix>, pts: MutPtr<Point>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTransformMatrixPointsI")

public actual fun gdipTransformPath(path: MutPtr<GpPath>, matrix: MutPtr<Matrix>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTransformPath")

public actual fun gdipTransformPoints(graphics: MutPtr<GpGraphics>, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: MutPtr<PointF>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTransformPoints")

public actual fun gdipTransformPointsI(graphics: MutPtr<GpGraphics>, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: MutPtr<Point>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTransformPointsI")

public actual fun gdipTransformRegion(region: MutPtr<GpRegion>, matrix: MutPtr<Matrix>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTransformRegion")

public actual fun gdipTranslateClip(graphics: MutPtr<GpGraphics>, dx: Float, dy: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTranslateClip")

public actual fun gdipTranslateClipI(graphics: MutPtr<GpGraphics>, dx: Int, dy: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTranslateClipI")

public actual fun gdipTranslateLineTransform(brush: MutPtr<GpLineGradient>, dx: Float, dy: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTranslateLineTransform")

public actual fun gdipTranslateMatrix(matrix: MutPtr<Matrix>, offsetx: Float, offsety: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTranslateMatrix")

public actual fun gdipTranslatePathGradientTransform(brush: MutPtr<GpPathGradient>, dx: Float, dy: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTranslatePathGradientTransform")

public actual fun gdipTranslatePenTransform(pen: MutPtr<GpPen>, dx: Float, dy: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTranslatePenTransform")

public actual fun gdipTranslateRegion(region: MutPtr<GpRegion>, dx: Float, dy: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTranslateRegion")

public actual fun gdipTranslateRegionI(region: MutPtr<GpRegion>, dx: Int, dy: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTranslateRegionI")

public actual fun gdipTranslateTextureTransform(brush: MutPtr<GpTexture>, dx: Float, dy: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTranslateTextureTransform")

public actual fun gdipTranslateWorldTransform(graphics: MutPtr<GpGraphics>, dx: Float, dy: Float, order: MatrixOrder): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipTranslateWorldTransform")

public actual fun gdipVectorTransformMatrixPoints(matrix: MutPtr<Matrix>, pts: MutPtr<PointF>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipVectorTransformMatrixPoints")

public actual fun gdipVectorTransformMatrixPointsI(matrix: MutPtr<Matrix>, pts: MutPtr<Point>, count: Int): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipVectorTransformMatrixPointsI")

public actual fun gdipWarpPath(path: MutPtr<GpPath>, matrix: MutPtr<Matrix>, points: ConstPtr<PointF>, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, warpmode: WarpMode, flatness: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipWarpPath")

public actual fun gdipWidenPath(nativepath: MutPtr<GpPath>, pen: MutPtr<GpPen>, matrix: MutPtr<Matrix>, flatness: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipWidenPath")

public actual fun gdipWindingModeOutline(path: MutPtr<GpPath>, matrix: MutPtr<Matrix>, flatness: Float): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdipWindingModeOutline")

public actual fun gdiplusNotificationHook(token: MutPtr<ULong>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdiplusNotificationHook")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsGdiplusGdiplusNotificationUnhook")
private external fun wasiWindowssysWindowsWin32GraphicsGdiplusGdiplusNotificationUnhook(token: Long): Unit

public actual fun gdiplusNotificationUnhook(token: ULong): Unit =
    wasiWindowssysWindowsWin32GraphicsGdiplusGdiplusNotificationUnhook(token.toLong())

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32GraphicsGdiplusGdiplusShutdown")
private external fun wasiWindowssysWindowsWin32GraphicsGdiplusGdiplusShutdown(token: Long): Unit

public actual fun gdiplusShutdown(token: ULong): Unit =
    wasiWindowssysWindowsWin32GraphicsGdiplusGdiplusShutdown(token.toLong())

public actual fun gdiplusStartup(token: MutPtr<ULong>, input: ConstPtr<GdiplusStartupInput>, output: MutPtr<GdiplusStartupOutput>): Status =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsGdiplusGdiplusStartup")
