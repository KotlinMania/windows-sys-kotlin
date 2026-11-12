@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32GraphicsGdiplusJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32GraphicsGdiplusJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAddPathArc(path: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAddPathArcI(path: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAddPathBezier(path: Long, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAddPathBezierI(path: Long, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAddPathBeziers(path: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAddPathBeziersI(path: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurve(path: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurve2(path: Long, points: Long, count: Int, tension: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurve2I(path: Long, points: Long, count: Int, tension: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurveI(path: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve(path: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve2(path: Long, points: Long, count: Int, tension: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve2I(path: Long, points: Long, count: Int, tension: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve3(path: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve3I(path: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurveI(path: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAddPathEllipse(path: Long, x: Float, y: Float, width: Float, height: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAddPathEllipseI(path: Long, x: Int, y: Int, width: Int, height: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAddPathLine(path: Long, x1: Float, y1: Float, x2: Float, y2: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAddPathLine2(path: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAddPathLine2I(path: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAddPathLineI(path: Long, x1: Int, y1: Int, x2: Int, y2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAddPathPath(path: Long, addingpath: Long, connect: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAddPathPie(path: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAddPathPieI(path: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAddPathPolygon(path: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAddPathPolygonI(path: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectangle(path: Long, x: Float, y: Float, width: Float, height: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectangleI(path: Long, x: Int, y: Int, width: Int, height: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectangles(path: Long, rects: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectanglesI(path: Long, rects: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAddPathString(path: Long, string: Long, length: Int, family: Long, style: Int, emsize: Float, layoutrect: Long, format: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAddPathStringI(path: Long, string: Long, length: Int, family: Long, style: Int, emsize: Float, layoutrect: Long, format: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipAlloc(size: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipBeginContainer(graphics: Long, dstrect: Long, srcrect: Long, unit: Int, state: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipBeginContainer2(graphics: Long, state: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipBeginContainerI(graphics: Long, dstrect: Long, srcrect: Long, unit: Int, state: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipBitmapApplyEffect(bitmap: Long, effect: Long, roi: Long, useauxdata: Int, auxdata: Long, auxdatasize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipBitmapConvertFormat(pinputbitmap: Long, format: Int, dithertype: Int, palettetype: Int, palette: Long, alphathresholdpercent: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipBitmapCreateApplyEffect(inputbitmaps: Long, numinputs: Int, effect: Long, roi: Long, outputrect: Long, outputbitmap: Long, useauxdata: Int, auxdata: Long, auxdatasize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipBitmapGetHistogram(bitmap: Long, format: Int, numberofentries: Int, channel0: Long, channel1: Long, channel2: Long, channel3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipBitmapGetHistogramSize(format: Int, numberofentries: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipBitmapGetPixel(bitmap: Long, x: Int, y: Int, color: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipBitmapLockBits(bitmap: Long, rect: Long, flags: Int, format: Int, lockedbitmapdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipBitmapSetPixel(bitmap: Long, x: Int, y: Int, color: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipBitmapSetResolution(bitmap: Long, xdpi: Float, ydpi: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipBitmapUnlockBits(bitmap: Long, lockedbitmapdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipClearPathMarkers(path: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCloneBitmapArea(x: Float, y: Float, width: Float, height: Float, format: Int, srcbitmap: Long, dstbitmap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCloneBitmapAreaI(x: Int, y: Int, width: Int, height: Int, format: Int, srcbitmap: Long, dstbitmap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCloneBrush(brush: Long, clonebrush: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCloneCustomLineCap(customcap: Long, clonedcap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCloneFont(font: Long, clonefont: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCloneFontFamily(fontfamily: Long, clonedfontfamily: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCloneImage(image: Long, cloneimage: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCloneImageAttributes(imageattr: Long, cloneimageattr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCloneMatrix(matrix: Long, clonematrix: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipClonePath(path: Long, clonepath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipClonePen(pen: Long, clonepen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCloneRegion(region: Long, cloneregion: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCloneStringFormat(format: Long, newformat: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipClosePathFigure(path: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipClosePathFigures(path: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionPath(region: Long, path: Long, combinemode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionRect(region: Long, rect: Long, combinemode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionRectI(region: Long, rect: Long, combinemode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionRegion(region: Long, region2: Long, combinemode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipComment(graphics: Long, sizedata: Int, data: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipConvertToEmfPlus(refgraphics: Long, metafile: Long, conversionfailureflag: Long, emftype: Int, description: Long, outMetafile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipConvertToEmfPlusToFile(refgraphics: Long, metafile: Long, conversionfailureflag: Long, filename: Long, emftype: Int, description: Long, outMetafile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipConvertToEmfPlusToStream(refgraphics: Long, metafile: Long, conversionfailureflag: Long, stream: Long, emftype: Int, description: Long, outMetafile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateAdjustableArrowCap(height: Float, width: Float, isfilled: Int, cap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromFile(filename: Long, bitmap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromFileICM(filename: Long, bitmap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromGdiDib(gdibitmapinfo: Long, gdibitmapdata: Long, bitmap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromGraphics(width: Int, height: Int, target: Long, bitmap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromHBITMAP(hbm: Long, hpal: Long, bitmap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromHICON(hicon: Long, bitmap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromResource(hinstance: Long, lpbitmapname: Long, bitmap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromScan0(width: Int, height: Int, stride: Int, format: Int, scan0: Long, bitmap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromStream(stream: Long, bitmap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromStreamICM(stream: Long, bitmap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateCachedBitmap(bitmap: Long, graphics: Long, cachedbitmap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateCustomLineCap(fillpath: Long, strokepath: Long, basecap: Int, baseinset: Float, customcap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateFont(fontfamily: Long, emsize: Float, style: Int, unit: Int, font: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFamilyFromName(name: Long, fontcollection: Long, fontfamily: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFromDC(hdc: Long, font: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFromLogfontA(hdc: Long, logfont: Long, font: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFromLogfontW(hdc: Long, logfont: Long, font: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHDC(hdc: Long, graphics: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHDC2(hdc: Long, hdevice: Long, graphics: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHWND(hwnd: Long, graphics: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHWNDICM(hwnd: Long, graphics: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateHBITMAPFromBitmap(bitmap: Long, hbmreturn: Long, background: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateHICONFromBitmap(bitmap: Long, hbmreturn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateHalftonePalette(): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateHatchBrush(hatchstyle: Int, forecol: Int, backcol: Int, brush: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateImageAttributes(imageattr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrush(point1: Long, point2: Long, color1: Int, color2: Int, wrapmode: Int, linegradient: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRect(rect: Long, color1: Int, color2: Int, mode: Int, wrapmode: Int, linegradient: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRectI(rect: Long, color1: Int, color2: Int, mode: Int, wrapmode: Int, linegradient: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRectWithAngle(rect: Long, color1: Int, color2: Int, angle: Float, isanglescalable: Int, wrapmode: Int, linegradient: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRectWithAngleI(rect: Long, color1: Int, color2: Int, angle: Float, isanglescalable: Int, wrapmode: Int, linegradient: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushI(point1: Long, point2: Long, color1: Int, color2: Int, wrapmode: Int, linegradient: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix(matrix: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix2(m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float, matrix: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix3(rect: Long, dstplg: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix3I(rect: Long, dstplg: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromEmf(hemf: Long, deleteemf: Int, metafile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromFile(file: Long, metafile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromStream(stream: Long, metafile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromWmf(hwmf: Long, deletewmf: Int, wmfplaceablefileheader: Long, metafile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromWmfFile(file: Long, wmfplaceablefileheader: Long, metafile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreatePath(brushmode: Int, path: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreatePath2(param0: Long, param1: Long, param2: Int, param3: Int, path: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreatePath2I(param0: Long, param1: Long, param2: Int, param3: Int, path: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreatePathGradient(points: Long, count: Int, wrapmode: Int, polygradient: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreatePathGradientFromPath(path: Long, polygradient: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreatePathGradientI(points: Long, count: Int, wrapmode: Int, polygradient: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreatePathIter(iterator: Long, path: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreatePen1(color: Int, width: Float, unit: Int, pen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreatePen2(brush: Long, width: Float, unit: Int, pen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateRegion(region: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionHrgn(hrgn: Long, region: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionPath(path: Long, region: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionRect(rect: Long, region: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionRectI(rect: Long, region: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionRgnData(regiondata: Long, size: Int, region: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateSolidFill(color: Int, brush: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateStreamOnFile(filename: Long, access: Int, stream: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateStringFormat(formatattributes: Int, language: Short, format: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateTexture(image: Long, wrapmode: Int, texture: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateTexture2(image: Long, wrapmode: Int, x: Float, y: Float, width: Float, height: Float, texture: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateTexture2I(image: Long, wrapmode: Int, x: Int, y: Int, width: Int, height: Int, texture: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateTextureIA(image: Long, imageattributes: Long, x: Float, y: Float, width: Float, height: Float, texture: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipCreateTextureIAI(image: Long, imageattributes: Long, x: Int, y: Int, width: Int, height: Int, texture: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDeleteBrush(brush: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDeleteCachedBitmap(cachedbitmap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDeleteCustomLineCap(customcap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDeleteEffect(effect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDeleteFont(font: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDeleteFontFamily(fontfamily: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDeleteGraphics(graphics: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDeleteMatrix(matrix: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDeletePath(path: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDeletePathIter(iterator: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDeletePen(pen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDeletePrivateFontCollection(fontcollection: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDeleteRegion(region: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDeleteStringFormat(format: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDisposeImage(image: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDisposeImageAttributes(imageattr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawArc(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawArcI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawBezier(graphics: Long, pen: Long, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawBezierI(graphics: Long, pen: Long, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawBeziers(graphics: Long, pen: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawBeziersI(graphics: Long, pen: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawCachedBitmap(graphics: Long, cachedbitmap: Long, x: Int, y: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurve(graphics: Long, pen: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurve2(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurve2I(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurveI(graphics: Long, pen: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve(graphics: Long, pen: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve2(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve2I(graphics: Long, pen: Long, points: Long, count: Int, tension: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve3(graphics: Long, pen: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve3I(graphics: Long, pen: Long, points: Long, count: Int, offset: Int, numberofsegments: Int, tension: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawCurveI(graphics: Long, pen: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawDriverString(graphics: Long, text: Long, length: Int, font: Long, brush: Long, positions: Long, flags: Int, matrix: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawEllipse(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawEllipseI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawImage(graphics: Long, image: Long, x: Float, y: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawImageFX(graphics: Long, image: Long, source: Long, xform: Long, effect: Long, imageattributes: Long, srcunit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawImageI(graphics: Long, image: Long, x: Int, y: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointRect(graphics: Long, image: Long, x: Float, y: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointRectI(graphics: Long, image: Long, x: Int, y: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePoints(graphics: Long, image: Long, dstpoints: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointsI(graphics: Long, image: Long, dstpoints: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointsRect(graphics: Long, image: Long, points: Long, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Int, imageattributes: Long, callback: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointsRectI(graphics: Long, image: Long, points: Long, count: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Int, imageattributes: Long, callback: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRect(graphics: Long, image: Long, x: Float, y: Float, width: Float, height: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRectI(graphics: Long, image: Long, x: Int, y: Int, width: Int, height: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRectRect(graphics: Long, image: Long, dstx: Float, dsty: Float, dstwidth: Float, dstheight: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Int, imageattributes: Long, callback: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRectRectI(graphics: Long, image: Long, dstx: Int, dsty: Int, dstwidth: Int, dstheight: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Int, imageattributes: Long, callback: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawLine(graphics: Long, pen: Long, x1: Float, y1: Float, x2: Float, y2: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawLineI(graphics: Long, pen: Long, x1: Int, y1: Int, x2: Int, y2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawLines(graphics: Long, pen: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawLinesI(graphics: Long, pen: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawPath(graphics: Long, pen: Long, path: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawPie(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawPieI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawPolygon(graphics: Long, pen: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawPolygonI(graphics: Long, pen: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawRectangle(graphics: Long, pen: Long, x: Float, y: Float, width: Float, height: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawRectangleI(graphics: Long, pen: Long, x: Int, y: Int, width: Int, height: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawRectangles(graphics: Long, pen: Long, rects: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawRectanglesI(graphics: Long, pen: Long, rects: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipDrawString(graphics: Long, string: Long, length: Int, font: Long, layoutrect: Long, stringformat: Long, brush: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipEmfToWmfBits(hemf: Long, cbdata16: Int, pdata16: Long, imapmode: Int, eflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipEndContainer(graphics: Long, state: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPoint(graphics: Long, metafile: Long, destpoint: Long, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPointI(graphics: Long, metafile: Long, destpoint: Long, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPoints(graphics: Long, metafile: Long, destpoints: Long, count: Int, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPointsI(graphics: Long, metafile: Long, destpoints: Long, count: Int, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestRect(graphics: Long, metafile: Long, destrect: Long, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestRectI(graphics: Long, metafile: Long, destrect: Long, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPoint(graphics: Long, metafile: Long, destpoint: Long, srcrect: Long, srcunit: Int, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPointI(graphics: Long, metafile: Long, destpoint: Long, srcrect: Long, srcunit: Int, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPoints(graphics: Long, metafile: Long, destpoints: Long, count: Int, srcrect: Long, srcunit: Int, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPointsI(graphics: Long, metafile: Long, destpoints: Long, count: Int, srcrect: Long, srcunit: Int, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestRect(graphics: Long, metafile: Long, destrect: Long, srcrect: Long, srcunit: Int, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestRectI(graphics: Long, metafile: Long, destrect: Long, srcrect: Long, srcunit: Int, callback: Long, callbackdata: Long, imageattributes: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurve(graphics: Long, brush: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurve2(graphics: Long, brush: Long, points: Long, count: Int, tension: Float, fillmode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurve2I(graphics: Long, brush: Long, points: Long, count: Int, tension: Float, fillmode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurveI(graphics: Long, brush: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipFillEllipse(graphics: Long, brush: Long, x: Float, y: Float, width: Float, height: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipFillEllipseI(graphics: Long, brush: Long, x: Int, y: Int, width: Int, height: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipFillPath(graphics: Long, brush: Long, path: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipFillPie(graphics: Long, brush: Long, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipFillPieI(graphics: Long, brush: Long, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipFillPolygon(graphics: Long, brush: Long, points: Long, count: Int, fillmode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipFillPolygon2(graphics: Long, brush: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipFillPolygon2I(graphics: Long, brush: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipFillPolygonI(graphics: Long, brush: Long, points: Long, count: Int, fillmode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipFillRectangle(graphics: Long, brush: Long, x: Float, y: Float, width: Float, height: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipFillRectangleI(graphics: Long, brush: Long, x: Int, y: Int, width: Int, height: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipFillRectangles(graphics: Long, brush: Long, rects: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipFillRectanglesI(graphics: Long, brush: Long, rects: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipFillRegion(graphics: Long, brush: Long, region: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipFindFirstImageItem(image: Long, item: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipFindNextImageItem(image: Long, item: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipFlattenPath(path: Long, matrix: Long, flatness: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipFlush(graphics: Long, intention: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipFree(ptr: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapFillState(cap: Long, fillstate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapHeight(cap: Long, height: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapMiddleInset(cap: Long, middleinset: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapWidth(cap: Long, width: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetAllPropertyItems(image: Long, totalbuffersize: Int, numproperties: Int, allitems: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetBrushType(brush: Long, type: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetCellAscent(family: Long, style: Int, cellascent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetCellDescent(family: Long, style: Int, celldescent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetClip(graphics: Long, region: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetClipBounds(graphics: Long, rect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetClipBoundsI(graphics: Long, rect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetCompositingMode(graphics: Long, compositingmode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetCompositingQuality(graphics: Long, compositingquality: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapBaseCap(customcap: Long, basecap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapBaseInset(customcap: Long, inset: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapStrokeCaps(customcap: Long, startcap: Long, endcap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapStrokeJoin(customcap: Long, linejoin: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapType(customcap: Long, captype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapWidthScale(customcap: Long, widthscale: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetDC(graphics: Long, hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetDpiX(graphics: Long, dpi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetDpiY(graphics: Long, dpi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetEffectParameterSize(effect: Long, size: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetEffectParameters(effect: Long, size: Long, params: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetEmHeight(family: Long, style: Int, emheight: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetEncoderParameterList(image: Long, clsidencoder: Long, size: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetEncoderParameterListSize(image: Long, clsidencoder: Long, size: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetFamily(font: Long, family: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetFamilyName(family: Long, name: Long, language: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetFontCollectionFamilyCount(fontcollection: Long, numfound: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetFontCollectionFamilyList(fontcollection: Long, numsought: Int, gpfamilies: Long, numfound: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetFontHeight(font: Long, graphics: Long, height: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetFontHeightGivenDPI(font: Long, dpi: Float, height: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetFontSize(font: Long, size: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetFontStyle(font: Long, style: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetFontUnit(font: Long, unit: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetGenericFontFamilyMonospace(nativefamily: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetGenericFontFamilySansSerif(nativefamily: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetGenericFontFamilySerif(nativefamily: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetHatchBackgroundColor(brush: Long, backcol: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetHatchForegroundColor(brush: Long, forecol: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetHatchStyle(brush: Long, hatchstyle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetHemfFromMetafile(metafile: Long, hemf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetImageAttributesAdjustedPalette(imageattr: Long, colorpalette: Long, coloradjusttype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetImageBounds(image: Long, srcrect: Long, srcunit: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetImageDecoders(numdecoders: Int, size: Int, decoders: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetImageDecodersSize(numdecoders: Long, size: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetImageDimension(image: Long, width: Long, height: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetImageEncoders(numencoders: Int, size: Int, encoders: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetImageEncodersSize(numencoders: Long, size: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetImageFlags(image: Long, flags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetImageGraphicsContext(image: Long, graphics: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetImageHeight(image: Long, height: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetImageHorizontalResolution(image: Long, resolution: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetImageItemData(image: Long, item: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetImagePalette(image: Long, palette: Long, size: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetImagePaletteSize(image: Long, size: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetImagePixelFormat(image: Long, format: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetImageRawFormat(image: Long, format: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetImageThumbnail(image: Long, thumbwidth: Int, thumbheight: Int, thumbimage: Long, callback: Long, callbackdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetImageType(image: Long, type: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetImageVerticalResolution(image: Long, resolution: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetImageWidth(image: Long, width: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetInterpolationMode(graphics: Long, interpolationmode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetLineBlend(brush: Long, blend: Long, positions: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetLineBlendCount(brush: Long, count: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetLineColors(brush: Long, colors: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetLineGammaCorrection(brush: Long, usegammacorrection: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetLinePresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetLinePresetBlendCount(brush: Long, count: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetLineRect(brush: Long, rect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetLineRectI(brush: Long, rect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetLineSpacing(family: Long, style: Int, linespacing: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetLineTransform(brush: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetLineWrapMode(brush: Long, wrapmode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetLogFontA(font: Long, graphics: Long, logfonta: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetLogFontW(font: Long, graphics: Long, logfontw: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetMatrixElements(matrix: Long, matrixout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileDownLevelRasterizationLimit(metafile: Long, metafilerasterizationlimitdpi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromEmf(hemf: Long, header: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromFile(filename: Long, header: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromMetafile(metafile: Long, header: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromStream(stream: Long, header: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromWmf(hwmf: Long, wmfplaceablefileheader: Long, header: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetNearestColor(graphics: Long, argb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPageScale(graphics: Long, scale: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPageUnit(graphics: Long, unit: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPathData(path: Long, pathdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPathFillMode(path: Long, fillmode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientBlend(brush: Long, blend: Long, positions: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientBlendCount(brush: Long, count: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientCenterColor(brush: Long, colors: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientCenterPoint(brush: Long, points: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientCenterPointI(brush: Long, points: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientFocusScales(brush: Long, xscale: Long, yscale: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientGammaCorrection(brush: Long, usegammacorrection: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPath(brush: Long, path: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPointCount(brush: Long, count: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPresetBlendCount(brush: Long, count: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientRect(brush: Long, rect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientRectI(brush: Long, rect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientSurroundColorCount(brush: Long, count: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientSurroundColorsWithCount(brush: Long, color: Long, count: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientTransform(brush: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientWrapMode(brush: Long, wrapmode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPathLastPoint(path: Long, lastpoint: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPathPoints(param0: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPathPointsI(param0: Long, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPathTypes(path: Long, types: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPathWorldBounds(path: Long, bounds: Long, matrix: Long, pen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPathWorldBoundsI(path: Long, bounds: Long, matrix: Long, pen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPenBrushFill(pen: Long, brush: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPenColor(pen: Long, argb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPenCompoundArray(pen: Long, dash: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPenCompoundCount(pen: Long, count: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPenCustomEndCap(pen: Long, customcap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPenCustomStartCap(pen: Long, customcap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashArray(pen: Long, dash: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashCap197819(pen: Long, dashcap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashCount(pen: Long, count: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashOffset(pen: Long, offset: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashStyle(pen: Long, dashstyle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPenEndCap(pen: Long, endcap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPenFillType(pen: Long, type: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPenLineJoin(pen: Long, linejoin: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPenMiterLimit(pen: Long, miterlimit: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPenMode(pen: Long, penmode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPenStartCap(pen: Long, startcap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPenTransform(pen: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPenUnit(pen: Long, unit: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPenWidth(pen: Long, width: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPixelOffsetMode(graphics: Long, pixeloffsetmode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPointCount(path: Long, count: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyCount(image: Long, numofproperty: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyIdList(image: Long, numofproperty: Int, list: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyItem(image: Long, propid: Int, propsize: Int, buffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyItemSize(image: Long, propid: Int, size: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetPropertySize(image: Long, totalbuffersize: Long, numproperties: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetRegionBounds(region: Long, graphics: Long, rect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetRegionBoundsI(region: Long, graphics: Long, rect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetRegionData(region: Long, buffer: Long, buffersize: Int, sizefilled: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetRegionDataSize(region: Long, buffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetRegionHRgn(region: Long, graphics: Long, hrgn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetRegionScans(region: Long, rects: Long, count: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetRegionScansCount(region: Long, count: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetRegionScansI(region: Long, rects: Long, count: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetRenderingOrigin(graphics: Long, x: Long, y: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetSmoothingMode(graphics: Long, smoothingmode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetSolidFillColor(brush: Long, color: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatAlign(format: Long, align: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatDigitSubstitution(format: Long, language: Long, substitute: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatFlags(format: Long, flags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatHotkeyPrefix(format: Long, hotkeyprefix: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatLineAlign(format: Long, align: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatMeasurableCharacterRangeCount(format: Long, count: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatTabStopCount(format: Long, count: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatTabStops(format: Long, count: Int, firsttaboffset: Long, tabstops: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatTrimming(format: Long, trimming: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetTextContrast(graphics: Long, contrast: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetTextRenderingHint(graphics: Long, mode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetTextureImage(brush: Long, image: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetTextureTransform(brush: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetTextureWrapMode(brush: Long, wrapmode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetVisibleClipBounds(graphics: Long, rect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetVisibleClipBoundsI(graphics: Long, rect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGetWorldTransform(graphics: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGraphicsClear(graphics: Long, color: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipGraphicsSetAbort(pgraphics: Long, piabort: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipImageForceValidation(image: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipImageGetFrameCount(image: Long, dimensionid: Long, count: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipImageGetFrameDimensionsCount(image: Long, count: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipImageGetFrameDimensionsList(image: Long, dimensionids: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipImageRotateFlip(image: Long, rftype: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipImageSelectActiveFrame(image: Long, dimensionid: Long, frameindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipImageSetAbort(pimage: Long, piabort: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipInitializePalette(palette: Long, palettetype: Int, optimalcolors: Int, usetransparentcolor: Int, bitmap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipInvertMatrix(matrix: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipIsClipEmpty(graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipIsEmptyRegion(region: Long, graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipIsEqualRegion(region: Long, region2: Long, graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipIsInfiniteRegion(region: Long, graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipIsMatrixEqual(matrix: Long, matrix2: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipIsMatrixIdentity(matrix: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipIsMatrixInvertible(matrix: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipIsOutlineVisiblePathPoint(path: Long, x: Float, y: Float, pen: Long, graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipIsOutlineVisiblePathPointI(path: Long, x: Int, y: Int, pen: Long, graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipIsStyleAvailable(family: Long, style: Int, isstyleavailable: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleClipEmpty(graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePathPoint(path: Long, x: Float, y: Float, graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePathPointI(path: Long, x: Int, y: Int, graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePoint(graphics: Long, x: Float, y: Float, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePointI(graphics: Long, x: Int, y: Int, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRect(graphics: Long, x: Float, y: Float, width: Float, height: Float, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRectI(graphics: Long, x: Int, y: Int, width: Int, height: Int, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionPoint(region: Long, x: Float, y: Float, graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionPointI(region: Long, x: Int, y: Int, graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionRect(region: Long, x: Float, y: Float, width: Float, height: Float, graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionRectI(region: Long, x: Int, y: Int, width: Int, height: Int, graphics: Long, result: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromFile(filename: Long, image: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromFileICM(filename: Long, image: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromStream(stream: Long, image: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromStreamICM(stream: Long, image: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipMeasureCharacterRanges(graphics: Long, string: Long, length: Int, font: Long, layoutrect: Long, stringformat: Long, regioncount: Int, regions: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipMeasureDriverString(graphics: Long, text: Long, length: Int, font: Long, positions: Long, flags: Int, matrix: Long, boundingbox: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipMeasureString(graphics: Long, string: Long, length: Int, font: Long, layoutrect: Long, stringformat: Long, boundingbox: Long, codepointsfitted: Long, linesfilled: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipMultiplyLineTransform(brush: Long, matrix: Long, order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipMultiplyMatrix(matrix: Long, matrix2: Long, order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipMultiplyPathGradientTransform(brush: Long, matrix: Long, order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipMultiplyPenTransform(pen: Long, matrix: Long, order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipMultiplyTextureTransform(brush: Long, matrix: Long, order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipMultiplyWorldTransform(graphics: Long, matrix: Long, order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipNewInstalledFontCollection(fontcollection: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipNewPrivateFontCollection(fontcollection: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipPathIterCopyData(iterator: Long, resultcount: Long, points: Long, types: Long, startindex: Int, endindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipPathIterEnumerate(iterator: Long, resultcount: Long, points: Long, types: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipPathIterGetCount(iterator: Long, count: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipPathIterGetSubpathCount(iterator: Long, count: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipPathIterHasCurve(iterator: Long, hascurve: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipPathIterIsValid(iterator: Long, valid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextMarker(iterator: Long, resultcount: Long, startindex: Long, endindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextMarkerPath(iterator: Long, resultcount: Long, path: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextPathType(iterator: Long, resultcount: Long, pathtype: Long, startindex: Long, endindex: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextSubpath(iterator: Long, resultcount: Long, startindex: Long, endindex: Long, isclosed: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextSubpathPath(iterator: Long, resultcount: Long, path: Long, isclosed: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipPathIterRewind(iterator: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipPlayMetafileRecord(metafile: Long, recordtype: Int, flags: Int, datasize: Int, data: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipPrivateAddFontFile(fontcollection: Long, filename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipPrivateAddMemoryFont(fontcollection: Long, memory: Long, length: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafile(referencehdc: Long, type: Int, framerect: Long, frameunit: Int, description: Long, metafile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileFileName(filename: Long, referencehdc: Long, type: Int, framerect: Long, frameunit: Int, description: Long, metafile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileFileNameI(filename: Long, referencehdc: Long, type: Int, framerect: Long, frameunit: Int, description: Long, metafile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileI(referencehdc: Long, type: Int, framerect: Long, frameunit: Int, description: Long, metafile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileStream(stream: Long, referencehdc: Long, type: Int, framerect: Long, frameunit: Int, description: Long, metafile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileStreamI(stream: Long, referencehdc: Long, type: Int, framerect: Long, frameunit: Int, description: Long, metafile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipReleaseDC(graphics: Long, hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipRemovePropertyItem(image: Long, propid: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipResetClip(graphics: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipResetImageAttributes(imageattr: Long, type: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipResetLineTransform(brush: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipResetPageTransform(graphics: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipResetPath(path: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipResetPathGradientTransform(brush: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipResetPenTransform(pen: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipResetTextureTransform(brush: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipResetWorldTransform(graphics: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipRestoreGraphics(graphics: Long, state: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipReversePath(path: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipRotateLineTransform(brush: Long, angle: Float, order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipRotateMatrix(matrix: Long, angle: Float, order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipRotatePathGradientTransform(brush: Long, angle: Float, order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipRotatePenTransform(pen: Long, angle: Float, order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipRotateTextureTransform(brush: Long, angle: Float, order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipRotateWorldTransform(graphics: Long, angle: Float, order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSaveAdd(image: Long, encoderparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSaveAddImage(image: Long, newimage: Long, encoderparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSaveGraphics(graphics: Long, state: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSaveImageToFile(image: Long, filename: Long, clsidencoder: Long, encoderparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSaveImageToStream(image: Long, stream: Long, clsidencoder: Long, encoderparams: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipScaleLineTransform(brush: Long, sx: Float, sy: Float, order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipScaleMatrix(matrix: Long, scalex: Float, scaley: Float, order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipScalePathGradientTransform(brush: Long, sx: Float, sy: Float, order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipScalePenTransform(pen: Long, sx: Float, sy: Float, order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipScaleTextureTransform(brush: Long, sx: Float, sy: Float, order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipScaleWorldTransform(graphics: Long, sx: Float, sy: Float, order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapFillState(cap: Long, fillstate: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapHeight(cap: Long, height: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapMiddleInset(cap: Long, middleinset: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapWidth(cap: Long, width: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetClipGraphics(graphics: Long, srcgraphics: Long, combinemode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetClipHrgn(graphics: Long, hrgn: Long, combinemode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetClipPath(graphics: Long, path: Long, combinemode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetClipRect(graphics: Long, x: Float, y: Float, width: Float, height: Float, combinemode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetClipRectI(graphics: Long, x: Int, y: Int, width: Int, height: Int, combinemode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetClipRegion(graphics: Long, region: Long, combinemode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetCompositingMode(graphics: Long, compositingmode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetCompositingQuality(graphics: Long, compositingquality: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapBaseCap(customcap: Long, basecap: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapBaseInset(customcap: Long, inset: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapStrokeCaps(customcap: Long, startcap: Int, endcap: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapStrokeJoin(customcap: Long, linejoin: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapWidthScale(customcap: Long, widthscale: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetEffectParameters(effect: Long, params: Long, size: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetEmpty(region: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesCachedBackground(imageattr: Long, enableflag: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesColorKeys(imageattr: Long, type: Int, enableflag: Int, colorlow: Int, colorhigh: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesColorMatrix(imageattr: Long, type: Int, enableflag: Int, colormatrix: Long, graymatrix: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesGamma(imageattr: Long, type: Int, enableflag: Int, gamma: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesNoOp(imageattr: Long, type: Int, enableflag: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesOutputChannel(imageattr: Long, type: Int, enableflag: Int, channelflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesOutputChannelColorProfile(imageattr: Long, type: Int, enableflag: Int, colorprofilefilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesRemapTable(imageattr: Long, type: Int, enableflag: Int, mapsize: Int, map: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesThreshold(imageattr: Long, type: Int, enableflag: Int, threshold: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesToIdentity(imageattr: Long, type: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesWrapMode(imageattr: Long, wrap: Int, argb: Int, clamp: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetImagePalette(image: Long, palette: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetInfinite(region: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetInterpolationMode(graphics: Long, interpolationmode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetLineBlend(brush: Long, blend: Long, positions: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetLineColors(brush: Long, color1: Int, color2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetLineGammaCorrection(brush: Long, usegammacorrection: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetLineLinearBlend(brush: Long, focus: Float, scale: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetLinePresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetLineSigmaBlend(brush: Long, focus: Float, scale: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetLineTransform(brush: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetLineWrapMode(brush: Long, wrapmode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetMatrixElements(matrix: Long, m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetMetafileDownLevelRasterizationLimit(metafile: Long, metafilerasterizationlimitdpi: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPageScale(graphics: Long, scale: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPageUnit(graphics: Long, unit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPathFillMode(path: Long, fillmode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientBlend(brush: Long, blend: Long, positions: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientCenterColor(brush: Long, colors: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientCenterPoint(brush: Long, points: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientCenterPointI(brush: Long, points: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientFocusScales(brush: Long, xscale: Float, yscale: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientGammaCorrection(brush: Long, usegammacorrection: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientLinearBlend(brush: Long, focus: Float, scale: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientPath(brush: Long, path: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientPresetBlend(brush: Long, blend: Long, positions: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientSigmaBlend(brush: Long, focus: Float, scale: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientSurroundColorsWithCount(brush: Long, color: Long, count: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientTransform(brush: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientWrapMode(brush: Long, wrapmode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPathMarker(path: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPenBrushFill(pen: Long, brush: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPenColor(pen: Long, argb: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPenCompoundArray(pen: Long, dash: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPenCustomEndCap(pen: Long, customcap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPenCustomStartCap(pen: Long, customcap: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashArray(pen: Long, dash: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashCap197819(pen: Long, dashcap: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashOffset(pen: Long, offset: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashStyle(pen: Long, dashstyle: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPenEndCap(pen: Long, endcap: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPenLineCap197819(pen: Long, startcap: Int, endcap: Int, dashcap: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPenLineJoin(pen: Long, linejoin: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPenMiterLimit(pen: Long, miterlimit: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPenMode(pen: Long, penmode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPenStartCap(pen: Long, startcap: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPenTransform(pen: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPenUnit(pen: Long, unit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPenWidth(pen: Long, width: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPixelOffsetMode(graphics: Long, pixeloffsetmode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetPropertyItem(image: Long, item: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetRenderingOrigin(graphics: Long, x: Int, y: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetSmoothingMode(graphics: Long, smoothingmode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetSolidFillColor(brush: Long, color: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatAlign(format: Long, align: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatDigitSubstitution(format: Long, language: Short, substitute: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatFlags(format: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatHotkeyPrefix(format: Long, hotkeyprefix: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatLineAlign(format: Long, align: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatMeasurableCharacterRanges(format: Long, rangecount: Int, ranges: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatTabStops(format: Long, firsttaboffset: Float, count: Int, tabstops: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatTrimming(format: Long, trimming: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetTextContrast(graphics: Long, contrast: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetTextRenderingHint(graphics: Long, mode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetTextureTransform(brush: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetTextureWrapMode(brush: Long, wrapmode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipSetWorldTransform(graphics: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipShearMatrix(matrix: Long, shearx: Float, sheary: Float, order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipStartPathFigure(path: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipStringFormatGetGenericDefault(format: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipStringFormatGetGenericTypographic(format: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipTestControl(control: Int, param1: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipTransformMatrixPoints(matrix: Long, pts: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipTransformMatrixPointsI(matrix: Long, pts: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipTransformPath(path: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipTransformPoints(graphics: Long, destspace: Int, srcspace: Int, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipTransformPointsI(graphics: Long, destspace: Int, srcspace: Int, points: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipTransformRegion(region: Long, matrix: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipTranslateClip(graphics: Long, dx: Float, dy: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipTranslateClipI(graphics: Long, dx: Int, dy: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipTranslateLineTransform(brush: Long, dx: Float, dy: Float, order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipTranslateMatrix(matrix: Long, offsetx: Float, offsety: Float, order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipTranslatePathGradientTransform(brush: Long, dx: Float, dy: Float, order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipTranslatePenTransform(pen: Long, dx: Float, dy: Float, order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipTranslateRegion(region: Long, dx: Float, dy: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipTranslateRegionI(region: Long, dx: Int, dy: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipTranslateTextureTransform(brush: Long, dx: Float, dy: Float, order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipTranslateWorldTransform(graphics: Long, dx: Float, dy: Float, order: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipVectorTransformMatrixPoints(matrix: Long, pts: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipVectorTransformMatrixPointsI(matrix: Long, pts: Long, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipWarpPath(path: Long, matrix: Long, points: Long, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, warpmode: Int, flatness: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipWidenPath(nativepath: Long, pen: Long, matrix: Long, flatness: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdipWindingModeOutline(path: Long, matrix: Long, flatness: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdiplusNotificationHook(token: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdiplusNotificationUnhook(token: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdiplusShutdown(token: Long)

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiplusGdiplusStartup(token: Long, input: Long, output: Long): Int
}

public actual fun gdipAddPathArc(path: MutPtr, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAddPathArc(path.rawAddress, x, y, width, height, startangle, sweepangle)

public actual fun gdipAddPathArcI(path: MutPtr, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAddPathArcI(path.rawAddress, x, y, width, height, startangle, sweepangle)

public actual fun gdipAddPathBezier(path: MutPtr, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAddPathBezier(path.rawAddress, x1, y1, x2, y2, x3, y3, x4, y4)

public actual fun gdipAddPathBezierI(path: MutPtr, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAddPathBezierI(path.rawAddress, x1, y1, x2, y2, x3, y3, x4, y4)

public actual fun gdipAddPathBeziers(path: MutPtr, points: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAddPathBeziers(path.rawAddress, points.rawAddress, count)

public actual fun gdipAddPathBeziersI(path: MutPtr, points: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAddPathBeziersI(path.rawAddress, points.rawAddress, count)

public actual fun gdipAddPathClosedCurve(path: MutPtr, points: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurve(path.rawAddress, points.rawAddress, count)

public actual fun gdipAddPathClosedCurve2(path: MutPtr, points: ConstPtr, count: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurve2(path.rawAddress, points.rawAddress, count, tension)

public actual fun gdipAddPathClosedCurve2I(path: MutPtr, points: ConstPtr, count: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurve2I(path.rawAddress, points.rawAddress, count, tension)

public actual fun gdipAddPathClosedCurveI(path: MutPtr, points: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAddPathClosedCurveI(path.rawAddress, points.rawAddress, count)

public actual fun gdipAddPathCurve(path: MutPtr, points: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve(path.rawAddress, points.rawAddress, count)

public actual fun gdipAddPathCurve2(path: MutPtr, points: ConstPtr, count: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve2(path.rawAddress, points.rawAddress, count, tension)

public actual fun gdipAddPathCurve2I(path: MutPtr, points: ConstPtr, count: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve2I(path.rawAddress, points.rawAddress, count, tension)

public actual fun gdipAddPathCurve3(path: MutPtr, points: ConstPtr, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve3(path.rawAddress, points.rawAddress, count, offset, numberofsegments, tension)

public actual fun gdipAddPathCurve3I(path: MutPtr, points: ConstPtr, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurve3I(path.rawAddress, points.rawAddress, count, offset, numberofsegments, tension)

public actual fun gdipAddPathCurveI(path: MutPtr, points: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAddPathCurveI(path.rawAddress, points.rawAddress, count)

public actual fun gdipAddPathEllipse(path: MutPtr, x: Float, y: Float, width: Float, height: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAddPathEllipse(path.rawAddress, x, y, width, height)

public actual fun gdipAddPathEllipseI(path: MutPtr, x: Int, y: Int, width: Int, height: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAddPathEllipseI(path.rawAddress, x, y, width, height)

public actual fun gdipAddPathLine(path: MutPtr, x1: Float, y1: Float, x2: Float, y2: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAddPathLine(path.rawAddress, x1, y1, x2, y2)

public actual fun gdipAddPathLine2(path: MutPtr, points: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAddPathLine2(path.rawAddress, points.rawAddress, count)

public actual fun gdipAddPathLine2I(path: MutPtr, points: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAddPathLine2I(path.rawAddress, points.rawAddress, count)

public actual fun gdipAddPathLineI(path: MutPtr, x1: Int, y1: Int, x2: Int, y2: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAddPathLineI(path.rawAddress, x1, y1, x2, y2)

public actual fun gdipAddPathPath(path: MutPtr, addingpath: ConstPtr, connect: Bool): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAddPathPath(path.rawAddress, addingpath.rawAddress, connect)

public actual fun gdipAddPathPie(path: MutPtr, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAddPathPie(path.rawAddress, x, y, width, height, startangle, sweepangle)

public actual fun gdipAddPathPieI(path: MutPtr, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAddPathPieI(path.rawAddress, x, y, width, height, startangle, sweepangle)

public actual fun gdipAddPathPolygon(path: MutPtr, points: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAddPathPolygon(path.rawAddress, points.rawAddress, count)

public actual fun gdipAddPathPolygonI(path: MutPtr, points: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAddPathPolygonI(path.rawAddress, points.rawAddress, count)

public actual fun gdipAddPathRectangle(path: MutPtr, x: Float, y: Float, width: Float, height: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectangle(path.rawAddress, x, y, width, height)

public actual fun gdipAddPathRectangleI(path: MutPtr, x: Int, y: Int, width: Int, height: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectangleI(path.rawAddress, x, y, width, height)

public actual fun gdipAddPathRectangles(path: MutPtr, rects: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectangles(path.rawAddress, rects.rawAddress, count)

public actual fun gdipAddPathRectanglesI(path: MutPtr, rects: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAddPathRectanglesI(path.rawAddress, rects.rawAddress, count)

public actual fun gdipAddPathString(path: MutPtr, string: Pcwstr, length: Int, family: ConstPtr, style: Int, emsize: Float, layoutrect: ConstPtr, format: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAddPathString(path.rawAddress, string.rawAddress, length, family.rawAddress, style, emsize, layoutrect.rawAddress, format.rawAddress)

public actual fun gdipAddPathStringI(path: MutPtr, string: Pcwstr, length: Int, family: ConstPtr, style: Int, emsize: Float, layoutrect: ConstPtr, format: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAddPathStringI(path.rawAddress, string.rawAddress, length, family.rawAddress, style, emsize, layoutrect.rawAddress, format.rawAddress)

public actual fun gdipAlloc(size: ULong): MutPtr =
    MutPtr(WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipAlloc(size.toLong()))

public actual fun gdipBeginContainer(graphics: MutPtr, dstrect: ConstPtr, srcrect: ConstPtr, unit: Unit, state: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipBeginContainer(graphics.rawAddress, dstrect.rawAddress, srcrect.rawAddress, unit, state.rawAddress)

public actual fun gdipBeginContainer2(graphics: MutPtr, state: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipBeginContainer2(graphics.rawAddress, state.rawAddress)

public actual fun gdipBeginContainerI(graphics: MutPtr, dstrect: ConstPtr, srcrect: ConstPtr, unit: Unit, state: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipBeginContainerI(graphics.rawAddress, dstrect.rawAddress, srcrect.rawAddress, unit, state.rawAddress)

public actual fun gdipBitmapApplyEffect(bitmap: MutPtr, effect: MutPtr, roi: MutPtr, useauxdata: Bool, auxdata: MutPtr, auxdatasize: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipBitmapApplyEffect(bitmap.rawAddress, effect.rawAddress, roi.rawAddress, useauxdata, auxdata.rawAddress, auxdatasize.rawAddress)

public actual fun gdipBitmapConvertFormat(pinputbitmap: MutPtr, format: Int, dithertype: DitherType, palettetype: PaletteType, palette: MutPtr, alphathresholdpercent: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipBitmapConvertFormat(pinputbitmap.rawAddress, format, dithertype, palettetype, palette.rawAddress, alphathresholdpercent)

public actual fun gdipBitmapCreateApplyEffect(inputbitmaps: MutPtr, numinputs: Int, effect: MutPtr, roi: MutPtr, outputrect: MutPtr, outputbitmap: MutPtr, useauxdata: Bool, auxdata: MutPtr, auxdatasize: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipBitmapCreateApplyEffect(inputbitmaps.rawAddress, numinputs, effect.rawAddress, roi.rawAddress, outputrect.rawAddress, outputbitmap.rawAddress, useauxdata, auxdata.rawAddress, auxdatasize.rawAddress)

public actual fun gdipBitmapGetHistogram(bitmap: MutPtr, format: HistogramFormat, numberofentries: UInt, channel0: MutPtr, channel1: MutPtr, channel2: MutPtr, channel3: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipBitmapGetHistogram(bitmap.rawAddress, format, numberofentries.toInt(), channel0.rawAddress, channel1.rawAddress, channel2.rawAddress, channel3.rawAddress)

public actual fun gdipBitmapGetHistogramSize(format: HistogramFormat, numberofentries: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipBitmapGetHistogramSize(format, numberofentries.rawAddress)

public actual fun gdipBitmapGetPixel(bitmap: MutPtr, x: Int, y: Int, color: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipBitmapGetPixel(bitmap.rawAddress, x, y, color.rawAddress)

public actual fun gdipBitmapLockBits(bitmap: MutPtr, rect: ConstPtr, flags: UInt, format: Int, lockedbitmapdata: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipBitmapLockBits(bitmap.rawAddress, rect.rawAddress, flags.toInt(), format, lockedbitmapdata.rawAddress)

public actual fun gdipBitmapSetPixel(bitmap: MutPtr, x: Int, y: Int, color: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipBitmapSetPixel(bitmap.rawAddress, x, y, color.toInt())

public actual fun gdipBitmapSetResolution(bitmap: MutPtr, xdpi: Float, ydpi: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipBitmapSetResolution(bitmap.rawAddress, xdpi, ydpi)

public actual fun gdipBitmapUnlockBits(bitmap: MutPtr, lockedbitmapdata: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipBitmapUnlockBits(bitmap.rawAddress, lockedbitmapdata.rawAddress)

public actual fun gdipClearPathMarkers(path: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipClearPathMarkers(path.rawAddress)

public actual fun gdipCloneBitmapArea(x: Float, y: Float, width: Float, height: Float, format: Int, srcbitmap: MutPtr, dstbitmap: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCloneBitmapArea(x, y, width, height, format, srcbitmap.rawAddress, dstbitmap.rawAddress)

public actual fun gdipCloneBitmapAreaI(x: Int, y: Int, width: Int, height: Int, format: Int, srcbitmap: MutPtr, dstbitmap: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCloneBitmapAreaI(x, y, width, height, format, srcbitmap.rawAddress, dstbitmap.rawAddress)

public actual fun gdipCloneBrush(brush: MutPtr, clonebrush: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCloneBrush(brush.rawAddress, clonebrush.rawAddress)

public actual fun gdipCloneCustomLineCap(customcap: MutPtr, clonedcap: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCloneCustomLineCap(customcap.rawAddress, clonedcap.rawAddress)

public actual fun gdipCloneFont(font: MutPtr, clonefont: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCloneFont(font.rawAddress, clonefont.rawAddress)

public actual fun gdipCloneFontFamily(fontfamily: MutPtr, clonedfontfamily: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCloneFontFamily(fontfamily.rawAddress, clonedfontfamily.rawAddress)

public actual fun gdipCloneImage(image: MutPtr, cloneimage: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCloneImage(image.rawAddress, cloneimage.rawAddress)

public actual fun gdipCloneImageAttributes(imageattr: ConstPtr, cloneimageattr: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCloneImageAttributes(imageattr.rawAddress, cloneimageattr.rawAddress)

public actual fun gdipCloneMatrix(matrix: MutPtr, clonematrix: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCloneMatrix(matrix.rawAddress, clonematrix.rawAddress)

public actual fun gdipClonePath(path: MutPtr, clonepath: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipClonePath(path.rawAddress, clonepath.rawAddress)

public actual fun gdipClonePen(pen: MutPtr, clonepen: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipClonePen(pen.rawAddress, clonepen.rawAddress)

public actual fun gdipCloneRegion(region: MutPtr, cloneregion: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCloneRegion(region.rawAddress, cloneregion.rawAddress)

public actual fun gdipCloneStringFormat(format: ConstPtr, newformat: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCloneStringFormat(format.rawAddress, newformat.rawAddress)

public actual fun gdipClosePathFigure(path: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipClosePathFigure(path.rawAddress)

public actual fun gdipClosePathFigures(path: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipClosePathFigures(path.rawAddress)

public actual fun gdipCombineRegionPath(region: MutPtr, path: MutPtr, combinemode: CombineMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionPath(region.rawAddress, path.rawAddress, combinemode)

public actual fun gdipCombineRegionRect(region: MutPtr, rect: ConstPtr, combinemode: CombineMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionRect(region.rawAddress, rect.rawAddress, combinemode)

public actual fun gdipCombineRegionRectI(region: MutPtr, rect: ConstPtr, combinemode: CombineMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionRectI(region.rawAddress, rect.rawAddress, combinemode)

public actual fun gdipCombineRegionRegion(region: MutPtr, region2: MutPtr, combinemode: CombineMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCombineRegionRegion(region.rawAddress, region2.rawAddress, combinemode)

public actual fun gdipComment(graphics: MutPtr, sizedata: UInt, data: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipComment(graphics.rawAddress, sizedata.toInt(), data.rawAddress)

public actual fun gdipConvertToEmfPlus(refgraphics: ConstPtr, metafile: MutPtr, conversionfailureflag: MutPtr, emftype: EmfType, description: Pcwstr, outMetafile: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipConvertToEmfPlus(refgraphics.rawAddress, metafile.rawAddress, conversionfailureflag.rawAddress, emftype, description.rawAddress, outMetafile.rawAddress)

public actual fun gdipConvertToEmfPlusToFile(refgraphics: ConstPtr, metafile: MutPtr, conversionfailureflag: MutPtr, filename: Pcwstr, emftype: EmfType, description: Pcwstr, outMetafile: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipConvertToEmfPlusToFile(refgraphics.rawAddress, metafile.rawAddress, conversionfailureflag.rawAddress, filename.rawAddress, emftype, description.rawAddress, outMetafile.rawAddress)

public actual fun gdipConvertToEmfPlusToStream(refgraphics: ConstPtr, metafile: MutPtr, conversionfailureflag: MutPtr, stream: MutPtr, emftype: EmfType, description: Pcwstr, outMetafile: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipConvertToEmfPlusToStream(refgraphics.rawAddress, metafile.rawAddress, conversionfailureflag.rawAddress, stream.rawAddress, emftype, description.rawAddress, outMetafile.rawAddress)

public actual fun gdipCreateAdjustableArrowCap(height: Float, width: Float, isfilled: Bool, cap: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateAdjustableArrowCap(height, width, isfilled, cap.rawAddress)

public actual fun gdipCreateBitmapFromFile(filename: Pcwstr, bitmap: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromFile(filename.rawAddress, bitmap.rawAddress)

public actual fun gdipCreateBitmapFromFileICM(filename: Pcwstr, bitmap: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromFileICM(filename.rawAddress, bitmap.rawAddress)

public actual fun gdipCreateBitmapFromGdiDib(gdibitmapinfo: ConstPtr, gdibitmapdata: MutPtr, bitmap: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromGdiDib(gdibitmapinfo.rawAddress, gdibitmapdata.rawAddress, bitmap.rawAddress)

public actual fun gdipCreateBitmapFromGraphics(width: Int, height: Int, target: MutPtr, bitmap: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromGraphics(width, height, target.rawAddress, bitmap.rawAddress)

public actual fun gdipCreateBitmapFromHBITMAP(hbm: Hbitmap, hpal: Hpalette, bitmap: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromHBITMAP(hbm.rawAddress, hpal.rawAddress, bitmap.rawAddress)

public actual fun gdipCreateBitmapFromHICON(hicon: Hicon, bitmap: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromHICON(hicon.rawAddress, bitmap.rawAddress)

public actual fun gdipCreateBitmapFromResource(hinstance: Hinstance, lpbitmapname: Pcwstr, bitmap: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromResource(hinstance.rawAddress, lpbitmapname.rawAddress, bitmap.rawAddress)

public actual fun gdipCreateBitmapFromScan0(width: Int, height: Int, stride: Int, format: Int, scan0: ConstPtr, bitmap: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromScan0(width, height, stride, format, scan0.rawAddress, bitmap.rawAddress)

public actual fun gdipCreateBitmapFromStream(stream: MutPtr, bitmap: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromStream(stream.rawAddress, bitmap.rawAddress)

public actual fun gdipCreateBitmapFromStreamICM(stream: MutPtr, bitmap: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateBitmapFromStreamICM(stream.rawAddress, bitmap.rawAddress)

public actual fun gdipCreateCachedBitmap(bitmap: MutPtr, graphics: MutPtr, cachedbitmap: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateCachedBitmap(bitmap.rawAddress, graphics.rawAddress, cachedbitmap.rawAddress)

public actual fun gdipCreateCustomLineCap(fillpath: MutPtr, strokepath: MutPtr, basecap: LineCap, baseinset: Float, customcap: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateCustomLineCap(fillpath.rawAddress, strokepath.rawAddress, basecap, baseinset, customcap.rawAddress)

public actual fun gdipCreateEffect(guid: Guid, effect: MutPtr): Status =
    0

public actual fun gdipCreateFont(fontfamily: ConstPtr, emsize: Float, style: Int, unit: Unit, font: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateFont(fontfamily.rawAddress, emsize, style, unit, font.rawAddress)

public actual fun gdipCreateFontFamilyFromName(name: Pcwstr, fontcollection: MutPtr, fontfamily: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFamilyFromName(name.rawAddress, fontcollection.rawAddress, fontfamily.rawAddress)

public actual fun gdipCreateFontFromDC(hdc: Hdc, font: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFromDC(hdc.rawAddress, font.rawAddress)

public actual fun gdipCreateFontFromLogfontA(hdc: Hdc, logfont: ConstPtr, font: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFromLogfontA(hdc.rawAddress, logfont.rawAddress, font.rawAddress)

public actual fun gdipCreateFontFromLogfontW(hdc: Hdc, logfont: ConstPtr, font: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateFontFromLogfontW(hdc.rawAddress, logfont.rawAddress, font.rawAddress)

public actual fun gdipCreateFromHDC(hdc: Hdc, graphics: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHDC(hdc.rawAddress, graphics.rawAddress)

public actual fun gdipCreateFromHDC2(hdc: Hdc, hdevice: Handle, graphics: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHDC2(hdc.rawAddress, hdevice.rawAddress, graphics.rawAddress)

public actual fun gdipCreateFromHWND(hwnd: Hwnd, graphics: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHWND(hwnd.rawAddress, graphics.rawAddress)

public actual fun gdipCreateFromHWNDICM(hwnd: Hwnd, graphics: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateFromHWNDICM(hwnd.rawAddress, graphics.rawAddress)

public actual fun gdipCreateHBITMAPFromBitmap(bitmap: MutPtr, hbmreturn: MutPtr, background: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateHBITMAPFromBitmap(bitmap.rawAddress, hbmreturn.rawAddress, background.toInt())

public actual fun gdipCreateHICONFromBitmap(bitmap: MutPtr, hbmreturn: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateHICONFromBitmap(bitmap.rawAddress, hbmreturn.rawAddress)

public actual fun gdipCreateHalftonePalette(): Hpalette =
    MutPtr(WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateHalftonePalette())

public actual fun gdipCreateHatchBrush(hatchstyle: HatchStyle, forecol: UInt, backcol: UInt, brush: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateHatchBrush(hatchstyle, forecol.toInt(), backcol.toInt(), brush.rawAddress)

public actual fun gdipCreateImageAttributes(imageattr: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateImageAttributes(imageattr.rawAddress)

public actual fun gdipCreateLineBrush(point1: ConstPtr, point2: ConstPtr, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrush(point1.rawAddress, point2.rawAddress, color1.toInt(), color2.toInt(), wrapmode, linegradient.rawAddress)

public actual fun gdipCreateLineBrushFromRect(rect: ConstPtr, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRect(rect.rawAddress, color1.toInt(), color2.toInt(), mode, wrapmode, linegradient.rawAddress)

public actual fun gdipCreateLineBrushFromRectI(rect: ConstPtr, color1: UInt, color2: UInt, mode: LinearGradientMode, wrapmode: WrapMode, linegradient: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRectI(rect.rawAddress, color1.toInt(), color2.toInt(), mode, wrapmode, linegradient.rawAddress)

public actual fun gdipCreateLineBrushFromRectWithAngle(rect: ConstPtr, color1: UInt, color2: UInt, angle: Float, isanglescalable: Bool, wrapmode: WrapMode, linegradient: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRectWithAngle(rect.rawAddress, color1.toInt(), color2.toInt(), angle, isanglescalable, wrapmode, linegradient.rawAddress)

public actual fun gdipCreateLineBrushFromRectWithAngleI(rect: ConstPtr, color1: UInt, color2: UInt, angle: Float, isanglescalable: Bool, wrapmode: WrapMode, linegradient: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushFromRectWithAngleI(rect.rawAddress, color1.toInt(), color2.toInt(), angle, isanglescalable, wrapmode, linegradient.rawAddress)

public actual fun gdipCreateLineBrushI(point1: ConstPtr, point2: ConstPtr, color1: UInt, color2: UInt, wrapmode: WrapMode, linegradient: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateLineBrushI(point1.rawAddress, point2.rawAddress, color1.toInt(), color2.toInt(), wrapmode, linegradient.rawAddress)

public actual fun gdipCreateMatrix(matrix: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix(matrix.rawAddress)

public actual fun gdipCreateMatrix2(m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float, matrix: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix2(m11, m12, m21, m22, dx, dy, matrix.rawAddress)

public actual fun gdipCreateMatrix3(rect: ConstPtr, dstplg: ConstPtr, matrix: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix3(rect.rawAddress, dstplg.rawAddress, matrix.rawAddress)

public actual fun gdipCreateMatrix3I(rect: ConstPtr, dstplg: ConstPtr, matrix: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateMatrix3I(rect.rawAddress, dstplg.rawAddress, matrix.rawAddress)

public actual fun gdipCreateMetafileFromEmf(hemf: Henhmetafile, deleteemf: Bool, metafile: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromEmf(hemf.rawAddress, deleteemf, metafile.rawAddress)

public actual fun gdipCreateMetafileFromFile(file: Pcwstr, metafile: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromFile(file.rawAddress, metafile.rawAddress)

public actual fun gdipCreateMetafileFromStream(stream: MutPtr, metafile: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromStream(stream.rawAddress, metafile.rawAddress)

public actual fun gdipCreateMetafileFromWmf(hwmf: Hmetafile, deletewmf: Bool, wmfplaceablefileheader: ConstPtr, metafile: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromWmf(hwmf.rawAddress, deletewmf, wmfplaceablefileheader.rawAddress, metafile.rawAddress)

public actual fun gdipCreateMetafileFromWmfFile(file: Pcwstr, wmfplaceablefileheader: ConstPtr, metafile: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateMetafileFromWmfFile(file.rawAddress, wmfplaceablefileheader.rawAddress, metafile.rawAddress)

public actual fun gdipCreatePath(brushmode: FillMode, path: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreatePath(brushmode, path.rawAddress)

public actual fun gdipCreatePath2(param0: ConstPtr, param1: ConstPtr, param2: Int, param3: FillMode, path: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreatePath2(param0.rawAddress, param1.rawAddress, param2, param3, path.rawAddress)

public actual fun gdipCreatePath2I(param0: ConstPtr, param1: ConstPtr, param2: Int, param3: FillMode, path: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreatePath2I(param0.rawAddress, param1.rawAddress, param2, param3, path.rawAddress)

public actual fun gdipCreatePathGradient(points: ConstPtr, count: Int, wrapmode: WrapMode, polygradient: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreatePathGradient(points.rawAddress, count, wrapmode, polygradient.rawAddress)

public actual fun gdipCreatePathGradientFromPath(path: ConstPtr, polygradient: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreatePathGradientFromPath(path.rawAddress, polygradient.rawAddress)

public actual fun gdipCreatePathGradientI(points: ConstPtr, count: Int, wrapmode: WrapMode, polygradient: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreatePathGradientI(points.rawAddress, count, wrapmode, polygradient.rawAddress)

public actual fun gdipCreatePathIter(iterator: MutPtr, path: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreatePathIter(iterator.rawAddress, path.rawAddress)

public actual fun gdipCreatePen1(color: UInt, width: Float, unit: Unit, pen: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreatePen1(color.toInt(), width, unit, pen.rawAddress)

public actual fun gdipCreatePen2(brush: MutPtr, width: Float, unit: Unit, pen: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreatePen2(brush.rawAddress, width, unit, pen.rawAddress)

public actual fun gdipCreateRegion(region: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateRegion(region.rawAddress)

public actual fun gdipCreateRegionHrgn(hrgn: Hrgn, region: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionHrgn(hrgn.rawAddress, region.rawAddress)

public actual fun gdipCreateRegionPath(path: MutPtr, region: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionPath(path.rawAddress, region.rawAddress)

public actual fun gdipCreateRegionRect(rect: ConstPtr, region: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionRect(rect.rawAddress, region.rawAddress)

public actual fun gdipCreateRegionRectI(rect: ConstPtr, region: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionRectI(rect.rawAddress, region.rawAddress)

public actual fun gdipCreateRegionRgnData(regiondata: ConstPtr, size: Int, region: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateRegionRgnData(regiondata.rawAddress, size, region.rawAddress)

public actual fun gdipCreateSolidFill(color: UInt, brush: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateSolidFill(color.toInt(), brush.rawAddress)

public actual fun gdipCreateStreamOnFile(filename: Pcwstr, access: UInt, stream: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateStreamOnFile(filename.rawAddress, access.toInt(), stream.rawAddress)

public actual fun gdipCreateStringFormat(formatattributes: Int, language: UShort, format: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateStringFormat(formatattributes, language.toShort(), format.rawAddress)

public actual fun gdipCreateTexture(image: MutPtr, wrapmode: WrapMode, texture: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateTexture(image.rawAddress, wrapmode, texture.rawAddress)

public actual fun gdipCreateTexture2(image: MutPtr, wrapmode: WrapMode, x: Float, y: Float, width: Float, height: Float, texture: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateTexture2(image.rawAddress, wrapmode, x, y, width, height, texture.rawAddress)

public actual fun gdipCreateTexture2I(image: MutPtr, wrapmode: WrapMode, x: Int, y: Int, width: Int, height: Int, texture: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateTexture2I(image.rawAddress, wrapmode, x, y, width, height, texture.rawAddress)

public actual fun gdipCreateTextureIA(image: MutPtr, imageattributes: ConstPtr, x: Float, y: Float, width: Float, height: Float, texture: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateTextureIA(image.rawAddress, imageattributes.rawAddress, x, y, width, height, texture.rawAddress)

public actual fun gdipCreateTextureIAI(image: MutPtr, imageattributes: ConstPtr, x: Int, y: Int, width: Int, height: Int, texture: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipCreateTextureIAI(image.rawAddress, imageattributes.rawAddress, x, y, width, height, texture.rawAddress)

public actual fun gdipDeleteBrush(brush: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDeleteBrush(brush.rawAddress)

public actual fun gdipDeleteCachedBitmap(cachedbitmap: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDeleteCachedBitmap(cachedbitmap.rawAddress)

public actual fun gdipDeleteCustomLineCap(customcap: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDeleteCustomLineCap(customcap.rawAddress)

public actual fun gdipDeleteEffect(effect: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDeleteEffect(effect.rawAddress)

public actual fun gdipDeleteFont(font: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDeleteFont(font.rawAddress)

public actual fun gdipDeleteFontFamily(fontfamily: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDeleteFontFamily(fontfamily.rawAddress)

public actual fun gdipDeleteGraphics(graphics: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDeleteGraphics(graphics.rawAddress)

public actual fun gdipDeleteMatrix(matrix: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDeleteMatrix(matrix.rawAddress)

public actual fun gdipDeletePath(path: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDeletePath(path.rawAddress)

public actual fun gdipDeletePathIter(iterator: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDeletePathIter(iterator.rawAddress)

public actual fun gdipDeletePen(pen: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDeletePen(pen.rawAddress)

public actual fun gdipDeletePrivateFontCollection(fontcollection: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDeletePrivateFontCollection(fontcollection.rawAddress)

public actual fun gdipDeleteRegion(region: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDeleteRegion(region.rawAddress)

public actual fun gdipDeleteStringFormat(format: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDeleteStringFormat(format.rawAddress)

public actual fun gdipDisposeImage(image: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDisposeImage(image.rawAddress)

public actual fun gdipDisposeImageAttributes(imageattr: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDisposeImageAttributes(imageattr.rawAddress)

public actual fun gdipDrawArc(graphics: MutPtr, pen: MutPtr, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawArc(graphics.rawAddress, pen.rawAddress, x, y, width, height, startangle, sweepangle)

public actual fun gdipDrawArcI(graphics: MutPtr, pen: MutPtr, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawArcI(graphics.rawAddress, pen.rawAddress, x, y, width, height, startangle, sweepangle)

public actual fun gdipDrawBezier(graphics: MutPtr, pen: MutPtr, x1: Float, y1: Float, x2: Float, y2: Float, x3: Float, y3: Float, x4: Float, y4: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawBezier(graphics.rawAddress, pen.rawAddress, x1, y1, x2, y2, x3, y3, x4, y4)

public actual fun gdipDrawBezierI(graphics: MutPtr, pen: MutPtr, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawBezierI(graphics.rawAddress, pen.rawAddress, x1, y1, x2, y2, x3, y3, x4, y4)

public actual fun gdipDrawBeziers(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawBeziers(graphics.rawAddress, pen.rawAddress, points.rawAddress, count)

public actual fun gdipDrawBeziersI(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawBeziersI(graphics.rawAddress, pen.rawAddress, points.rawAddress, count)

public actual fun gdipDrawCachedBitmap(graphics: MutPtr, cachedbitmap: MutPtr, x: Int, y: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawCachedBitmap(graphics.rawAddress, cachedbitmap.rawAddress, x, y)

public actual fun gdipDrawClosedCurve(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurve(graphics.rawAddress, pen.rawAddress, points.rawAddress, count)

public actual fun gdipDrawClosedCurve2(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurve2(graphics.rawAddress, pen.rawAddress, points.rawAddress, count, tension)

public actual fun gdipDrawClosedCurve2I(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurve2I(graphics.rawAddress, pen.rawAddress, points.rawAddress, count, tension)

public actual fun gdipDrawClosedCurveI(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawClosedCurveI(graphics.rawAddress, pen.rawAddress, points.rawAddress, count)

public actual fun gdipDrawCurve(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve(graphics.rawAddress, pen.rawAddress, points.rawAddress, count)

public actual fun gdipDrawCurve2(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve2(graphics.rawAddress, pen.rawAddress, points.rawAddress, count, tension)

public actual fun gdipDrawCurve2I(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve2I(graphics.rawAddress, pen.rawAddress, points.rawAddress, count, tension)

public actual fun gdipDrawCurve3(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve3(graphics.rawAddress, pen.rawAddress, points.rawAddress, count, offset, numberofsegments, tension)

public actual fun gdipDrawCurve3I(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int, offset: Int, numberofsegments: Int, tension: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawCurve3I(graphics.rawAddress, pen.rawAddress, points.rawAddress, count, offset, numberofsegments, tension)

public actual fun gdipDrawCurveI(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawCurveI(graphics.rawAddress, pen.rawAddress, points.rawAddress, count)

public actual fun gdipDrawDriverString(graphics: MutPtr, text: ConstPtr, length: Int, font: ConstPtr, brush: ConstPtr, positions: ConstPtr, flags: Int, matrix: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawDriverString(graphics.rawAddress, text.rawAddress, length, font.rawAddress, brush.rawAddress, positions.rawAddress, flags, matrix.rawAddress)

public actual fun gdipDrawEllipse(graphics: MutPtr, pen: MutPtr, x: Float, y: Float, width: Float, height: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawEllipse(graphics.rawAddress, pen.rawAddress, x, y, width, height)

public actual fun gdipDrawEllipseI(graphics: MutPtr, pen: MutPtr, x: Int, y: Int, width: Int, height: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawEllipseI(graphics.rawAddress, pen.rawAddress, x, y, width, height)

public actual fun gdipDrawImage(graphics: MutPtr, image: MutPtr, x: Float, y: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawImage(graphics.rawAddress, image.rawAddress, x, y)

public actual fun gdipDrawImageFX(graphics: MutPtr, image: MutPtr, source: MutPtr, xform: MutPtr, effect: MutPtr, imageattributes: MutPtr, srcunit: Unit): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawImageFX(graphics.rawAddress, image.rawAddress, source.rawAddress, xform.rawAddress, effect.rawAddress, imageattributes.rawAddress, srcunit)

public actual fun gdipDrawImageI(graphics: MutPtr, image: MutPtr, x: Int, y: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawImageI(graphics.rawAddress, image.rawAddress, x, y)

public actual fun gdipDrawImagePointRect(graphics: MutPtr, image: MutPtr, x: Float, y: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointRect(graphics.rawAddress, image.rawAddress, x, y, srcx, srcy, srcwidth, srcheight, srcunit)

public actual fun gdipDrawImagePointRectI(graphics: MutPtr, image: MutPtr, x: Int, y: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointRectI(graphics.rawAddress, image.rawAddress, x, y, srcx, srcy, srcwidth, srcheight, srcunit)

public actual fun gdipDrawImagePoints(graphics: MutPtr, image: MutPtr, dstpoints: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePoints(graphics.rawAddress, image.rawAddress, dstpoints.rawAddress, count)

public actual fun gdipDrawImagePointsI(graphics: MutPtr, image: MutPtr, dstpoints: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointsI(graphics.rawAddress, image.rawAddress, dstpoints.rawAddress, count)

public actual fun gdipDrawImagePointsRect(graphics: MutPtr, image: MutPtr, points: ConstPtr, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: ConstPtr, callback: Long, callbackdata: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointsRect(graphics.rawAddress, image.rawAddress, points.rawAddress, count, srcx, srcy, srcwidth, srcheight, srcunit, imageattributes.rawAddress, callback, callbackdata.rawAddress)

public actual fun gdipDrawImagePointsRectI(graphics: MutPtr, image: MutPtr, points: ConstPtr, count: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: ConstPtr, callback: Long, callbackdata: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawImagePointsRectI(graphics.rawAddress, image.rawAddress, points.rawAddress, count, srcx, srcy, srcwidth, srcheight, srcunit, imageattributes.rawAddress, callback, callbackdata.rawAddress)

public actual fun gdipDrawImageRect(graphics: MutPtr, image: MutPtr, x: Float, y: Float, width: Float, height: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRect(graphics.rawAddress, image.rawAddress, x, y, width, height)

public actual fun gdipDrawImageRectI(graphics: MutPtr, image: MutPtr, x: Int, y: Int, width: Int, height: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRectI(graphics.rawAddress, image.rawAddress, x, y, width, height)

public actual fun gdipDrawImageRectRect(graphics: MutPtr, image: MutPtr, dstx: Float, dsty: Float, dstwidth: Float, dstheight: Float, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, srcunit: Unit, imageattributes: ConstPtr, callback: Long, callbackdata: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRectRect(graphics.rawAddress, image.rawAddress, dstx, dsty, dstwidth, dstheight, srcx, srcy, srcwidth, srcheight, srcunit, imageattributes.rawAddress, callback, callbackdata.rawAddress)

public actual fun gdipDrawImageRectRectI(graphics: MutPtr, image: MutPtr, dstx: Int, dsty: Int, dstwidth: Int, dstheight: Int, srcx: Int, srcy: Int, srcwidth: Int, srcheight: Int, srcunit: Unit, imageattributes: ConstPtr, callback: Long, callbackdata: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawImageRectRectI(graphics.rawAddress, image.rawAddress, dstx, dsty, dstwidth, dstheight, srcx, srcy, srcwidth, srcheight, srcunit, imageattributes.rawAddress, callback, callbackdata.rawAddress)

public actual fun gdipDrawLine(graphics: MutPtr, pen: MutPtr, x1: Float, y1: Float, x2: Float, y2: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawLine(graphics.rawAddress, pen.rawAddress, x1, y1, x2, y2)

public actual fun gdipDrawLineI(graphics: MutPtr, pen: MutPtr, x1: Int, y1: Int, x2: Int, y2: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawLineI(graphics.rawAddress, pen.rawAddress, x1, y1, x2, y2)

public actual fun gdipDrawLines(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawLines(graphics.rawAddress, pen.rawAddress, points.rawAddress, count)

public actual fun gdipDrawLinesI(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawLinesI(graphics.rawAddress, pen.rawAddress, points.rawAddress, count)

public actual fun gdipDrawPath(graphics: MutPtr, pen: MutPtr, path: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawPath(graphics.rawAddress, pen.rawAddress, path.rawAddress)

public actual fun gdipDrawPie(graphics: MutPtr, pen: MutPtr, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawPie(graphics.rawAddress, pen.rawAddress, x, y, width, height, startangle, sweepangle)

public actual fun gdipDrawPieI(graphics: MutPtr, pen: MutPtr, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawPieI(graphics.rawAddress, pen.rawAddress, x, y, width, height, startangle, sweepangle)

public actual fun gdipDrawPolygon(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawPolygon(graphics.rawAddress, pen.rawAddress, points.rawAddress, count)

public actual fun gdipDrawPolygonI(graphics: MutPtr, pen: MutPtr, points: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawPolygonI(graphics.rawAddress, pen.rawAddress, points.rawAddress, count)

public actual fun gdipDrawRectangle(graphics: MutPtr, pen: MutPtr, x: Float, y: Float, width: Float, height: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawRectangle(graphics.rawAddress, pen.rawAddress, x, y, width, height)

public actual fun gdipDrawRectangleI(graphics: MutPtr, pen: MutPtr, x: Int, y: Int, width: Int, height: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawRectangleI(graphics.rawAddress, pen.rawAddress, x, y, width, height)

public actual fun gdipDrawRectangles(graphics: MutPtr, pen: MutPtr, rects: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawRectangles(graphics.rawAddress, pen.rawAddress, rects.rawAddress, count)

public actual fun gdipDrawRectanglesI(graphics: MutPtr, pen: MutPtr, rects: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawRectanglesI(graphics.rawAddress, pen.rawAddress, rects.rawAddress, count)

public actual fun gdipDrawString(graphics: MutPtr, string: Pcwstr, length: Int, font: ConstPtr, layoutrect: ConstPtr, stringformat: ConstPtr, brush: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipDrawString(graphics.rawAddress, string.rawAddress, length, font.rawAddress, layoutrect.rawAddress, stringformat.rawAddress, brush.rawAddress)

public actual fun gdipEmfToWmfBits(hemf: Henhmetafile, cbdata16: UInt, pdata16: MutPtr, imapmode: Int, eflags: Int): UInt =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipEmfToWmfBits(hemf.rawAddress, cbdata16.toInt(), pdata16.rawAddress, imapmode, eflags).toUInt()

public actual fun gdipEndContainer(graphics: MutPtr, state: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipEndContainer(graphics.rawAddress, state.toInt())

public actual fun gdipEnumerateMetafileDestPoint(graphics: MutPtr, metafile: ConstPtr, destpoint: ConstPtr, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPoint(graphics.rawAddress, metafile.rawAddress, destpoint.rawAddress, callback, callbackdata.rawAddress, imageattributes.rawAddress)

public actual fun gdipEnumerateMetafileDestPointI(graphics: MutPtr, metafile: ConstPtr, destpoint: ConstPtr, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPointI(graphics.rawAddress, metafile.rawAddress, destpoint.rawAddress, callback, callbackdata.rawAddress, imageattributes.rawAddress)

public actual fun gdipEnumerateMetafileDestPoints(graphics: MutPtr, metafile: ConstPtr, destpoints: ConstPtr, count: Int, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPoints(graphics.rawAddress, metafile.rawAddress, destpoints.rawAddress, count, callback, callbackdata.rawAddress, imageattributes.rawAddress)

public actual fun gdipEnumerateMetafileDestPointsI(graphics: MutPtr, metafile: ConstPtr, destpoints: ConstPtr, count: Int, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestPointsI(graphics.rawAddress, metafile.rawAddress, destpoints.rawAddress, count, callback, callbackdata.rawAddress, imageattributes.rawAddress)

public actual fun gdipEnumerateMetafileDestRect(graphics: MutPtr, metafile: ConstPtr, destrect: ConstPtr, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestRect(graphics.rawAddress, metafile.rawAddress, destrect.rawAddress, callback, callbackdata.rawAddress, imageattributes.rawAddress)

public actual fun gdipEnumerateMetafileDestRectI(graphics: MutPtr, metafile: ConstPtr, destrect: ConstPtr, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileDestRectI(graphics.rawAddress, metafile.rawAddress, destrect.rawAddress, callback, callbackdata.rawAddress, imageattributes.rawAddress)

public actual fun gdipEnumerateMetafileSrcRectDestPoint(graphics: MutPtr, metafile: ConstPtr, destpoint: ConstPtr, srcrect: ConstPtr, srcunit: Unit, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPoint(graphics.rawAddress, metafile.rawAddress, destpoint.rawAddress, srcrect.rawAddress, srcunit, callback, callbackdata.rawAddress, imageattributes.rawAddress)

public actual fun gdipEnumerateMetafileSrcRectDestPointI(graphics: MutPtr, metafile: ConstPtr, destpoint: ConstPtr, srcrect: ConstPtr, srcunit: Unit, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPointI(graphics.rawAddress, metafile.rawAddress, destpoint.rawAddress, srcrect.rawAddress, srcunit, callback, callbackdata.rawAddress, imageattributes.rawAddress)

public actual fun gdipEnumerateMetafileSrcRectDestPoints(graphics: MutPtr, metafile: ConstPtr, destpoints: ConstPtr, count: Int, srcrect: ConstPtr, srcunit: Unit, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPoints(graphics.rawAddress, metafile.rawAddress, destpoints.rawAddress, count, srcrect.rawAddress, srcunit, callback, callbackdata.rawAddress, imageattributes.rawAddress)

public actual fun gdipEnumerateMetafileSrcRectDestPointsI(graphics: MutPtr, metafile: ConstPtr, destpoints: ConstPtr, count: Int, srcrect: ConstPtr, srcunit: Unit, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestPointsI(graphics.rawAddress, metafile.rawAddress, destpoints.rawAddress, count, srcrect.rawAddress, srcunit, callback, callbackdata.rawAddress, imageattributes.rawAddress)

public actual fun gdipEnumerateMetafileSrcRectDestRect(graphics: MutPtr, metafile: ConstPtr, destrect: ConstPtr, srcrect: ConstPtr, srcunit: Unit, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestRect(graphics.rawAddress, metafile.rawAddress, destrect.rawAddress, srcrect.rawAddress, srcunit, callback, callbackdata.rawAddress, imageattributes.rawAddress)

public actual fun gdipEnumerateMetafileSrcRectDestRectI(graphics: MutPtr, metafile: ConstPtr, destrect: ConstPtr, srcrect: ConstPtr, srcunit: Unit, callback: Long, callbackdata: MutPtr, imageattributes: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipEnumerateMetafileSrcRectDestRectI(graphics.rawAddress, metafile.rawAddress, destrect.rawAddress, srcrect.rawAddress, srcunit, callback, callbackdata.rawAddress, imageattributes.rawAddress)

public actual fun gdipFillClosedCurve(graphics: MutPtr, brush: MutPtr, points: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurve(graphics.rawAddress, brush.rawAddress, points.rawAddress, count)

public actual fun gdipFillClosedCurve2(graphics: MutPtr, brush: MutPtr, points: ConstPtr, count: Int, tension: Float, fillmode: FillMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurve2(graphics.rawAddress, brush.rawAddress, points.rawAddress, count, tension, fillmode)

public actual fun gdipFillClosedCurve2I(graphics: MutPtr, brush: MutPtr, points: ConstPtr, count: Int, tension: Float, fillmode: FillMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurve2I(graphics.rawAddress, brush.rawAddress, points.rawAddress, count, tension, fillmode)

public actual fun gdipFillClosedCurveI(graphics: MutPtr, brush: MutPtr, points: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipFillClosedCurveI(graphics.rawAddress, brush.rawAddress, points.rawAddress, count)

public actual fun gdipFillEllipse(graphics: MutPtr, brush: MutPtr, x: Float, y: Float, width: Float, height: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipFillEllipse(graphics.rawAddress, brush.rawAddress, x, y, width, height)

public actual fun gdipFillEllipseI(graphics: MutPtr, brush: MutPtr, x: Int, y: Int, width: Int, height: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipFillEllipseI(graphics.rawAddress, brush.rawAddress, x, y, width, height)

public actual fun gdipFillPath(graphics: MutPtr, brush: MutPtr, path: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipFillPath(graphics.rawAddress, brush.rawAddress, path.rawAddress)

public actual fun gdipFillPie(graphics: MutPtr, brush: MutPtr, x: Float, y: Float, width: Float, height: Float, startangle: Float, sweepangle: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipFillPie(graphics.rawAddress, brush.rawAddress, x, y, width, height, startangle, sweepangle)

public actual fun gdipFillPieI(graphics: MutPtr, brush: MutPtr, x: Int, y: Int, width: Int, height: Int, startangle: Float, sweepangle: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipFillPieI(graphics.rawAddress, brush.rawAddress, x, y, width, height, startangle, sweepangle)

public actual fun gdipFillPolygon(graphics: MutPtr, brush: MutPtr, points: ConstPtr, count: Int, fillmode: FillMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipFillPolygon(graphics.rawAddress, brush.rawAddress, points.rawAddress, count, fillmode)

public actual fun gdipFillPolygon2(graphics: MutPtr, brush: MutPtr, points: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipFillPolygon2(graphics.rawAddress, brush.rawAddress, points.rawAddress, count)

public actual fun gdipFillPolygon2I(graphics: MutPtr, brush: MutPtr, points: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipFillPolygon2I(graphics.rawAddress, brush.rawAddress, points.rawAddress, count)

public actual fun gdipFillPolygonI(graphics: MutPtr, brush: MutPtr, points: ConstPtr, count: Int, fillmode: FillMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipFillPolygonI(graphics.rawAddress, brush.rawAddress, points.rawAddress, count, fillmode)

public actual fun gdipFillRectangle(graphics: MutPtr, brush: MutPtr, x: Float, y: Float, width: Float, height: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipFillRectangle(graphics.rawAddress, brush.rawAddress, x, y, width, height)

public actual fun gdipFillRectangleI(graphics: MutPtr, brush: MutPtr, x: Int, y: Int, width: Int, height: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipFillRectangleI(graphics.rawAddress, brush.rawAddress, x, y, width, height)

public actual fun gdipFillRectangles(graphics: MutPtr, brush: MutPtr, rects: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipFillRectangles(graphics.rawAddress, brush.rawAddress, rects.rawAddress, count)

public actual fun gdipFillRectanglesI(graphics: MutPtr, brush: MutPtr, rects: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipFillRectanglesI(graphics.rawAddress, brush.rawAddress, rects.rawAddress, count)

public actual fun gdipFillRegion(graphics: MutPtr, brush: MutPtr, region: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipFillRegion(graphics.rawAddress, brush.rawAddress, region.rawAddress)

public actual fun gdipFindFirstImageItem(image: MutPtr, item: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipFindFirstImageItem(image.rawAddress, item.rawAddress)

public actual fun gdipFindNextImageItem(image: MutPtr, item: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipFindNextImageItem(image.rawAddress, item.rawAddress)

public actual fun gdipFlattenPath(path: MutPtr, matrix: MutPtr, flatness: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipFlattenPath(path.rawAddress, matrix.rawAddress, flatness)

public actual fun gdipFlush(graphics: MutPtr, intention: FlushIntention): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipFlush(graphics.rawAddress, intention)

public actual fun gdipFree(ptr: MutPtr) {
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipFree(ptr.rawAddress)
}

public actual fun gdipGetAdjustableArrowCapFillState(cap: MutPtr, fillstate: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapFillState(cap.rawAddress, fillstate.rawAddress)

public actual fun gdipGetAdjustableArrowCapHeight(cap: MutPtr, height: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapHeight(cap.rawAddress, height.rawAddress)

public actual fun gdipGetAdjustableArrowCapMiddleInset(cap: MutPtr, middleinset: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapMiddleInset(cap.rawAddress, middleinset.rawAddress)

public actual fun gdipGetAdjustableArrowCapWidth(cap: MutPtr, width: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetAdjustableArrowCapWidth(cap.rawAddress, width.rawAddress)

public actual fun gdipGetAllPropertyItems(image: MutPtr, totalbuffersize: UInt, numproperties: UInt, allitems: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetAllPropertyItems(image.rawAddress, totalbuffersize.toInt(), numproperties.toInt(), allitems.rawAddress)

public actual fun gdipGetBrushType(brush: MutPtr, type: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetBrushType(brush.rawAddress, type.rawAddress)

public actual fun gdipGetCellAscent(family: ConstPtr, style: Int, cellascent: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetCellAscent(family.rawAddress, style, cellascent.rawAddress)

public actual fun gdipGetCellDescent(family: ConstPtr, style: Int, celldescent: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetCellDescent(family.rawAddress, style, celldescent.rawAddress)

public actual fun gdipGetClip(graphics: MutPtr, region: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetClip(graphics.rawAddress, region.rawAddress)

public actual fun gdipGetClipBounds(graphics: MutPtr, rect: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetClipBounds(graphics.rawAddress, rect.rawAddress)

public actual fun gdipGetClipBoundsI(graphics: MutPtr, rect: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetClipBoundsI(graphics.rawAddress, rect.rawAddress)

public actual fun gdipGetCompositingMode(graphics: MutPtr, compositingmode: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetCompositingMode(graphics.rawAddress, compositingmode.rawAddress)

public actual fun gdipGetCompositingQuality(graphics: MutPtr, compositingquality: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetCompositingQuality(graphics.rawAddress, compositingquality.rawAddress)

public actual fun gdipGetCustomLineCapBaseCap(customcap: MutPtr, basecap: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapBaseCap(customcap.rawAddress, basecap.rawAddress)

public actual fun gdipGetCustomLineCapBaseInset(customcap: MutPtr, inset: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapBaseInset(customcap.rawAddress, inset.rawAddress)

public actual fun gdipGetCustomLineCapStrokeCaps(customcap: MutPtr, startcap: MutPtr, endcap: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapStrokeCaps(customcap.rawAddress, startcap.rawAddress, endcap.rawAddress)

public actual fun gdipGetCustomLineCapStrokeJoin(customcap: MutPtr, linejoin: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapStrokeJoin(customcap.rawAddress, linejoin.rawAddress)

public actual fun gdipGetCustomLineCapType(customcap: MutPtr, captype: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapType(customcap.rawAddress, captype.rawAddress)

public actual fun gdipGetCustomLineCapWidthScale(customcap: MutPtr, widthscale: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetCustomLineCapWidthScale(customcap.rawAddress, widthscale.rawAddress)

public actual fun gdipGetDC(graphics: MutPtr, hdc: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetDC(graphics.rawAddress, hdc.rawAddress)

public actual fun gdipGetDpiX(graphics: MutPtr, dpi: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetDpiX(graphics.rawAddress, dpi.rawAddress)

public actual fun gdipGetDpiY(graphics: MutPtr, dpi: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetDpiY(graphics.rawAddress, dpi.rawAddress)

public actual fun gdipGetEffectParameterSize(effect: MutPtr, size: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetEffectParameterSize(effect.rawAddress, size.rawAddress)

public actual fun gdipGetEffectParameters(effect: MutPtr, size: MutPtr, params: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetEffectParameters(effect.rawAddress, size.rawAddress, params.rawAddress)

public actual fun gdipGetEmHeight(family: ConstPtr, style: Int, emheight: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetEmHeight(family.rawAddress, style, emheight.rawAddress)

public actual fun gdipGetEncoderParameterList(image: MutPtr, clsidencoder: ConstPtr, size: UInt, buffer: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetEncoderParameterList(image.rawAddress, clsidencoder.rawAddress, size.toInt(), buffer.rawAddress)

public actual fun gdipGetEncoderParameterListSize(image: MutPtr, clsidencoder: ConstPtr, size: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetEncoderParameterListSize(image.rawAddress, clsidencoder.rawAddress, size.rawAddress)

public actual fun gdipGetFamily(font: MutPtr, family: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetFamily(font.rawAddress, family.rawAddress)

public actual fun gdipGetFamilyName(family: ConstPtr, name: Pwstr, language: UShort): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetFamilyName(family.rawAddress, name.rawAddress, language.toShort())

public actual fun gdipGetFontCollectionFamilyCount(fontcollection: MutPtr, numfound: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetFontCollectionFamilyCount(fontcollection.rawAddress, numfound.rawAddress)

public actual fun gdipGetFontCollectionFamilyList(fontcollection: ConstPtr, numsought: Int, gpfamilies: MutPtr, numfound: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetFontCollectionFamilyList(fontcollection.rawAddress, numsought, gpfamilies.rawAddress, numfound.rawAddress)

public actual fun gdipGetFontHeight(font: ConstPtr, graphics: ConstPtr, height: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetFontHeight(font.rawAddress, graphics.rawAddress, height.rawAddress)

public actual fun gdipGetFontHeightGivenDPI(font: ConstPtr, dpi: Float, height: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetFontHeightGivenDPI(font.rawAddress, dpi, height.rawAddress)

public actual fun gdipGetFontSize(font: MutPtr, size: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetFontSize(font.rawAddress, size.rawAddress)

public actual fun gdipGetFontStyle(font: MutPtr, style: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetFontStyle(font.rawAddress, style.rawAddress)

public actual fun gdipGetFontUnit(font: MutPtr, unit: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetFontUnit(font.rawAddress, unit.rawAddress)

public actual fun gdipGetGenericFontFamilyMonospace(nativefamily: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetGenericFontFamilyMonospace(nativefamily.rawAddress)

public actual fun gdipGetGenericFontFamilySansSerif(nativefamily: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetGenericFontFamilySansSerif(nativefamily.rawAddress)

public actual fun gdipGetGenericFontFamilySerif(nativefamily: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetGenericFontFamilySerif(nativefamily.rawAddress)

public actual fun gdipGetHatchBackgroundColor(brush: MutPtr, backcol: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetHatchBackgroundColor(brush.rawAddress, backcol.rawAddress)

public actual fun gdipGetHatchForegroundColor(brush: MutPtr, forecol: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetHatchForegroundColor(brush.rawAddress, forecol.rawAddress)

public actual fun gdipGetHatchStyle(brush: MutPtr, hatchstyle: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetHatchStyle(brush.rawAddress, hatchstyle.rawAddress)

public actual fun gdipGetHemfFromMetafile(metafile: MutPtr, hemf: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetHemfFromMetafile(metafile.rawAddress, hemf.rawAddress)

public actual fun gdipGetImageAttributesAdjustedPalette(imageattr: MutPtr, colorpalette: MutPtr, coloradjusttype: ColorAdjustType): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetImageAttributesAdjustedPalette(imageattr.rawAddress, colorpalette.rawAddress, coloradjusttype)

public actual fun gdipGetImageBounds(image: MutPtr, srcrect: MutPtr, srcunit: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetImageBounds(image.rawAddress, srcrect.rawAddress, srcunit.rawAddress)

public actual fun gdipGetImageDecoders(numdecoders: UInt, size: UInt, decoders: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetImageDecoders(numdecoders.toInt(), size.toInt(), decoders.rawAddress)

public actual fun gdipGetImageDecodersSize(numdecoders: MutPtr, size: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetImageDecodersSize(numdecoders.rawAddress, size.rawAddress)

public actual fun gdipGetImageDimension(image: MutPtr, width: MutPtr, height: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetImageDimension(image.rawAddress, width.rawAddress, height.rawAddress)

public actual fun gdipGetImageEncoders(numencoders: UInt, size: UInt, encoders: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetImageEncoders(numencoders.toInt(), size.toInt(), encoders.rawAddress)

public actual fun gdipGetImageEncodersSize(numencoders: MutPtr, size: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetImageEncodersSize(numencoders.rawAddress, size.rawAddress)

public actual fun gdipGetImageFlags(image: MutPtr, flags: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetImageFlags(image.rawAddress, flags.rawAddress)

public actual fun gdipGetImageGraphicsContext(image: MutPtr, graphics: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetImageGraphicsContext(image.rawAddress, graphics.rawAddress)

public actual fun gdipGetImageHeight(image: MutPtr, height: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetImageHeight(image.rawAddress, height.rawAddress)

public actual fun gdipGetImageHorizontalResolution(image: MutPtr, resolution: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetImageHorizontalResolution(image.rawAddress, resolution.rawAddress)

public actual fun gdipGetImageItemData(image: MutPtr, item: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetImageItemData(image.rawAddress, item.rawAddress)

public actual fun gdipGetImagePalette(image: MutPtr, palette: MutPtr, size: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetImagePalette(image.rawAddress, palette.rawAddress, size)

public actual fun gdipGetImagePaletteSize(image: MutPtr, size: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetImagePaletteSize(image.rawAddress, size.rawAddress)

public actual fun gdipGetImagePixelFormat(image: MutPtr, format: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetImagePixelFormat(image.rawAddress, format.rawAddress)

public actual fun gdipGetImageRawFormat(image: MutPtr, format: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetImageRawFormat(image.rawAddress, format.rawAddress)

public actual fun gdipGetImageThumbnail(image: MutPtr, thumbwidth: UInt, thumbheight: UInt, thumbimage: MutPtr, callback: Long, callbackdata: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetImageThumbnail(image.rawAddress, thumbwidth.toInt(), thumbheight.toInt(), thumbimage.rawAddress, callback, callbackdata.rawAddress)

public actual fun gdipGetImageType(image: MutPtr, type: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetImageType(image.rawAddress, type.rawAddress)

public actual fun gdipGetImageVerticalResolution(image: MutPtr, resolution: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetImageVerticalResolution(image.rawAddress, resolution.rawAddress)

public actual fun gdipGetImageWidth(image: MutPtr, width: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetImageWidth(image.rawAddress, width.rawAddress)

public actual fun gdipGetInterpolationMode(graphics: MutPtr, interpolationmode: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetInterpolationMode(graphics.rawAddress, interpolationmode.rawAddress)

public actual fun gdipGetLineBlend(brush: MutPtr, blend: MutPtr, positions: MutPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetLineBlend(brush.rawAddress, blend.rawAddress, positions.rawAddress, count)

public actual fun gdipGetLineBlendCount(brush: MutPtr, count: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetLineBlendCount(brush.rawAddress, count.rawAddress)

public actual fun gdipGetLineColors(brush: MutPtr, colors: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetLineColors(brush.rawAddress, colors.rawAddress)

public actual fun gdipGetLineGammaCorrection(brush: MutPtr, usegammacorrection: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetLineGammaCorrection(brush.rawAddress, usegammacorrection.rawAddress)

public actual fun gdipGetLinePresetBlend(brush: MutPtr, blend: MutPtr, positions: MutPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetLinePresetBlend(brush.rawAddress, blend.rawAddress, positions.rawAddress, count)

public actual fun gdipGetLinePresetBlendCount(brush: MutPtr, count: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetLinePresetBlendCount(brush.rawAddress, count.rawAddress)

public actual fun gdipGetLineRect(brush: MutPtr, rect: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetLineRect(brush.rawAddress, rect.rawAddress)

public actual fun gdipGetLineRectI(brush: MutPtr, rect: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetLineRectI(brush.rawAddress, rect.rawAddress)

public actual fun gdipGetLineSpacing(family: ConstPtr, style: Int, linespacing: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetLineSpacing(family.rawAddress, style, linespacing.rawAddress)

public actual fun gdipGetLineTransform(brush: MutPtr, matrix: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetLineTransform(brush.rawAddress, matrix.rawAddress)

public actual fun gdipGetLineWrapMode(brush: MutPtr, wrapmode: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetLineWrapMode(brush.rawAddress, wrapmode.rawAddress)

public actual fun gdipGetLogFontA(font: MutPtr, graphics: MutPtr, logfonta: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetLogFontA(font.rawAddress, graphics.rawAddress, logfonta.rawAddress)

public actual fun gdipGetLogFontW(font: MutPtr, graphics: MutPtr, logfontw: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetLogFontW(font.rawAddress, graphics.rawAddress, logfontw.rawAddress)

public actual fun gdipGetMatrixElements(matrix: ConstPtr, matrixout: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetMatrixElements(matrix.rawAddress, matrixout.rawAddress)

public actual fun gdipGetMetafileDownLevelRasterizationLimit(metafile: ConstPtr, metafilerasterizationlimitdpi: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileDownLevelRasterizationLimit(metafile.rawAddress, metafilerasterizationlimitdpi.rawAddress)

public actual fun gdipGetMetafileHeaderFromEmf(hemf: Henhmetafile, header: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromEmf(hemf.rawAddress, header.rawAddress)

public actual fun gdipGetMetafileHeaderFromFile(filename: Pcwstr, header: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromFile(filename.rawAddress, header.rawAddress)

public actual fun gdipGetMetafileHeaderFromMetafile(metafile: MutPtr, header: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromMetafile(metafile.rawAddress, header.rawAddress)

public actual fun gdipGetMetafileHeaderFromStream(stream: MutPtr, header: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromStream(stream.rawAddress, header.rawAddress)

public actual fun gdipGetMetafileHeaderFromWmf(hwmf: Hmetafile, wmfplaceablefileheader: ConstPtr, header: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetMetafileHeaderFromWmf(hwmf.rawAddress, wmfplaceablefileheader.rawAddress, header.rawAddress)

public actual fun gdipGetNearestColor(graphics: MutPtr, argb: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetNearestColor(graphics.rawAddress, argb.rawAddress)

public actual fun gdipGetPageScale(graphics: MutPtr, scale: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPageScale(graphics.rawAddress, scale.rawAddress)

public actual fun gdipGetPageUnit(graphics: MutPtr, unit: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPageUnit(graphics.rawAddress, unit.rawAddress)

public actual fun gdipGetPathData(path: MutPtr, pathdata: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPathData(path.rawAddress, pathdata.rawAddress)

public actual fun gdipGetPathFillMode(path: MutPtr, fillmode: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPathFillMode(path.rawAddress, fillmode.rawAddress)

public actual fun gdipGetPathGradientBlend(brush: MutPtr, blend: MutPtr, positions: MutPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientBlend(brush.rawAddress, blend.rawAddress, positions.rawAddress, count)

public actual fun gdipGetPathGradientBlendCount(brush: MutPtr, count: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientBlendCount(brush.rawAddress, count.rawAddress)

public actual fun gdipGetPathGradientCenterColor(brush: MutPtr, colors: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientCenterColor(brush.rawAddress, colors.rawAddress)

public actual fun gdipGetPathGradientCenterPoint(brush: MutPtr, points: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientCenterPoint(brush.rawAddress, points.rawAddress)

public actual fun gdipGetPathGradientCenterPointI(brush: MutPtr, points: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientCenterPointI(brush.rawAddress, points.rawAddress)

public actual fun gdipGetPathGradientFocusScales(brush: MutPtr, xscale: MutPtr, yscale: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientFocusScales(brush.rawAddress, xscale.rawAddress, yscale.rawAddress)

public actual fun gdipGetPathGradientGammaCorrection(brush: MutPtr, usegammacorrection: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientGammaCorrection(brush.rawAddress, usegammacorrection.rawAddress)

public actual fun gdipGetPathGradientPath(brush: MutPtr, path: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPath(brush.rawAddress, path.rawAddress)

public actual fun gdipGetPathGradientPointCount(brush: MutPtr, count: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPointCount(brush.rawAddress, count.rawAddress)

public actual fun gdipGetPathGradientPresetBlend(brush: MutPtr, blend: MutPtr, positions: MutPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPresetBlend(brush.rawAddress, blend.rawAddress, positions.rawAddress, count)

public actual fun gdipGetPathGradientPresetBlendCount(brush: MutPtr, count: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientPresetBlendCount(brush.rawAddress, count.rawAddress)

public actual fun gdipGetPathGradientRect(brush: MutPtr, rect: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientRect(brush.rawAddress, rect.rawAddress)

public actual fun gdipGetPathGradientRectI(brush: MutPtr, rect: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientRectI(brush.rawAddress, rect.rawAddress)

public actual fun gdipGetPathGradientSurroundColorCount(brush: MutPtr, count: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientSurroundColorCount(brush.rawAddress, count.rawAddress)

public actual fun gdipGetPathGradientSurroundColorsWithCount(brush: ConstPtr, color: MutPtr, count: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientSurroundColorsWithCount(brush.rawAddress, color.rawAddress, count.rawAddress)

public actual fun gdipGetPathGradientTransform(brush: MutPtr, matrix: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientTransform(brush.rawAddress, matrix.rawAddress)

public actual fun gdipGetPathGradientWrapMode(brush: MutPtr, wrapmode: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPathGradientWrapMode(brush.rawAddress, wrapmode.rawAddress)

public actual fun gdipGetPathLastPoint(path: MutPtr, lastpoint: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPathLastPoint(path.rawAddress, lastpoint.rawAddress)

public actual fun gdipGetPathPoints(param0: MutPtr, points: MutPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPathPoints(param0.rawAddress, points.rawAddress, count)

public actual fun gdipGetPathPointsI(param0: MutPtr, points: MutPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPathPointsI(param0.rawAddress, points.rawAddress, count)

public actual fun gdipGetPathTypes(path: ConstPtr, types: MutPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPathTypes(path.rawAddress, types.rawAddress, count)

public actual fun gdipGetPathWorldBounds(path: MutPtr, bounds: MutPtr, matrix: ConstPtr, pen: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPathWorldBounds(path.rawAddress, bounds.rawAddress, matrix.rawAddress, pen.rawAddress)

public actual fun gdipGetPathWorldBoundsI(path: MutPtr, bounds: MutPtr, matrix: ConstPtr, pen: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPathWorldBoundsI(path.rawAddress, bounds.rawAddress, matrix.rawAddress, pen.rawAddress)

public actual fun gdipGetPenBrushFill(pen: MutPtr, brush: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPenBrushFill(pen.rawAddress, brush.rawAddress)

public actual fun gdipGetPenColor(pen: MutPtr, argb: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPenColor(pen.rawAddress, argb.rawAddress)

public actual fun gdipGetPenCompoundArray(pen: MutPtr, dash: MutPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPenCompoundArray(pen.rawAddress, dash.rawAddress, count)

public actual fun gdipGetPenCompoundCount(pen: MutPtr, count: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPenCompoundCount(pen.rawAddress, count.rawAddress)

public actual fun gdipGetPenCustomEndCap(pen: MutPtr, customcap: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPenCustomEndCap(pen.rawAddress, customcap.rawAddress)

public actual fun gdipGetPenCustomStartCap(pen: MutPtr, customcap: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPenCustomStartCap(pen.rawAddress, customcap.rawAddress)

public actual fun gdipGetPenDashArray(pen: MutPtr, dash: MutPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashArray(pen.rawAddress, dash.rawAddress, count)

public actual fun gdipGetPenDashCap197819(pen: MutPtr, dashcap: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashCap197819(pen.rawAddress, dashcap.rawAddress)

public actual fun gdipGetPenDashCount(pen: MutPtr, count: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashCount(pen.rawAddress, count.rawAddress)

public actual fun gdipGetPenDashOffset(pen: MutPtr, offset: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashOffset(pen.rawAddress, offset.rawAddress)

public actual fun gdipGetPenDashStyle(pen: MutPtr, dashstyle: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPenDashStyle(pen.rawAddress, dashstyle.rawAddress)

public actual fun gdipGetPenEndCap(pen: MutPtr, endcap: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPenEndCap(pen.rawAddress, endcap.rawAddress)

public actual fun gdipGetPenFillType(pen: MutPtr, type: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPenFillType(pen.rawAddress, type.rawAddress)

public actual fun gdipGetPenLineJoin(pen: MutPtr, linejoin: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPenLineJoin(pen.rawAddress, linejoin.rawAddress)

public actual fun gdipGetPenMiterLimit(pen: MutPtr, miterlimit: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPenMiterLimit(pen.rawAddress, miterlimit.rawAddress)

public actual fun gdipGetPenMode(pen: MutPtr, penmode: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPenMode(pen.rawAddress, penmode.rawAddress)

public actual fun gdipGetPenStartCap(pen: MutPtr, startcap: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPenStartCap(pen.rawAddress, startcap.rawAddress)

public actual fun gdipGetPenTransform(pen: MutPtr, matrix: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPenTransform(pen.rawAddress, matrix.rawAddress)

public actual fun gdipGetPenUnit(pen: MutPtr, unit: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPenUnit(pen.rawAddress, unit.rawAddress)

public actual fun gdipGetPenWidth(pen: MutPtr, width: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPenWidth(pen.rawAddress, width.rawAddress)

public actual fun gdipGetPixelOffsetMode(graphics: MutPtr, pixeloffsetmode: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPixelOffsetMode(graphics.rawAddress, pixeloffsetmode.rawAddress)

public actual fun gdipGetPointCount(path: MutPtr, count: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPointCount(path.rawAddress, count.rawAddress)

public actual fun gdipGetPropertyCount(image: MutPtr, numofproperty: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyCount(image.rawAddress, numofproperty.rawAddress)

public actual fun gdipGetPropertyIdList(image: MutPtr, numofproperty: UInt, list: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyIdList(image.rawAddress, numofproperty.toInt(), list.rawAddress)

public actual fun gdipGetPropertyItem(image: MutPtr, propid: UInt, propsize: UInt, buffer: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyItem(image.rawAddress, propid.toInt(), propsize.toInt(), buffer.rawAddress)

public actual fun gdipGetPropertyItemSize(image: MutPtr, propid: UInt, size: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPropertyItemSize(image.rawAddress, propid.toInt(), size.rawAddress)

public actual fun gdipGetPropertySize(image: MutPtr, totalbuffersize: MutPtr, numproperties: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetPropertySize(image.rawAddress, totalbuffersize.rawAddress, numproperties.rawAddress)

public actual fun gdipGetRegionBounds(region: MutPtr, graphics: MutPtr, rect: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetRegionBounds(region.rawAddress, graphics.rawAddress, rect.rawAddress)

public actual fun gdipGetRegionBoundsI(region: MutPtr, graphics: MutPtr, rect: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetRegionBoundsI(region.rawAddress, graphics.rawAddress, rect.rawAddress)

public actual fun gdipGetRegionData(region: MutPtr, buffer: MutPtr, buffersize: UInt, sizefilled: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetRegionData(region.rawAddress, buffer.rawAddress, buffersize.toInt(), sizefilled.rawAddress)

public actual fun gdipGetRegionDataSize(region: MutPtr, buffersize: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetRegionDataSize(region.rawAddress, buffersize.rawAddress)

public actual fun gdipGetRegionHRgn(region: MutPtr, graphics: MutPtr, hrgn: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetRegionHRgn(region.rawAddress, graphics.rawAddress, hrgn.rawAddress)

public actual fun gdipGetRegionScans(region: MutPtr, rects: MutPtr, count: MutPtr, matrix: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetRegionScans(region.rawAddress, rects.rawAddress, count.rawAddress, matrix.rawAddress)

public actual fun gdipGetRegionScansCount(region: MutPtr, count: MutPtr, matrix: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetRegionScansCount(region.rawAddress, count.rawAddress, matrix.rawAddress)

public actual fun gdipGetRegionScansI(region: MutPtr, rects: MutPtr, count: MutPtr, matrix: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetRegionScansI(region.rawAddress, rects.rawAddress, count.rawAddress, matrix.rawAddress)

public actual fun gdipGetRenderingOrigin(graphics: MutPtr, x: MutPtr, y: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetRenderingOrigin(graphics.rawAddress, x.rawAddress, y.rawAddress)

public actual fun gdipGetSmoothingMode(graphics: MutPtr, smoothingmode: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetSmoothingMode(graphics.rawAddress, smoothingmode.rawAddress)

public actual fun gdipGetSolidFillColor(brush: MutPtr, color: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetSolidFillColor(brush.rawAddress, color.rawAddress)

public actual fun gdipGetStringFormatAlign(format: ConstPtr, align: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatAlign(format.rawAddress, align.rawAddress)

public actual fun gdipGetStringFormatDigitSubstitution(format: ConstPtr, language: MutPtr, substitute: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatDigitSubstitution(format.rawAddress, language.rawAddress, substitute.rawAddress)

public actual fun gdipGetStringFormatFlags(format: ConstPtr, flags: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatFlags(format.rawAddress, flags.rawAddress)

public actual fun gdipGetStringFormatHotkeyPrefix(format: ConstPtr, hotkeyprefix: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatHotkeyPrefix(format.rawAddress, hotkeyprefix.rawAddress)

public actual fun gdipGetStringFormatLineAlign(format: ConstPtr, align: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatLineAlign(format.rawAddress, align.rawAddress)

public actual fun gdipGetStringFormatMeasurableCharacterRangeCount(format: ConstPtr, count: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatMeasurableCharacterRangeCount(format.rawAddress, count.rawAddress)

public actual fun gdipGetStringFormatTabStopCount(format: ConstPtr, count: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatTabStopCount(format.rawAddress, count.rawAddress)

public actual fun gdipGetStringFormatTabStops(format: ConstPtr, count: Int, firsttaboffset: MutPtr, tabstops: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatTabStops(format.rawAddress, count, firsttaboffset.rawAddress, tabstops.rawAddress)

public actual fun gdipGetStringFormatTrimming(format: ConstPtr, trimming: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetStringFormatTrimming(format.rawAddress, trimming.rawAddress)

public actual fun gdipGetTextContrast(graphics: MutPtr, contrast: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetTextContrast(graphics.rawAddress, contrast.rawAddress)

public actual fun gdipGetTextRenderingHint(graphics: MutPtr, mode: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetTextRenderingHint(graphics.rawAddress, mode.rawAddress)

public actual fun gdipGetTextureImage(brush: MutPtr, image: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetTextureImage(brush.rawAddress, image.rawAddress)

public actual fun gdipGetTextureTransform(brush: MutPtr, matrix: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetTextureTransform(brush.rawAddress, matrix.rawAddress)

public actual fun gdipGetTextureWrapMode(brush: MutPtr, wrapmode: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetTextureWrapMode(brush.rawAddress, wrapmode.rawAddress)

public actual fun gdipGetVisibleClipBounds(graphics: MutPtr, rect: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetVisibleClipBounds(graphics.rawAddress, rect.rawAddress)

public actual fun gdipGetVisibleClipBoundsI(graphics: MutPtr, rect: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetVisibleClipBoundsI(graphics.rawAddress, rect.rawAddress)

public actual fun gdipGetWorldTransform(graphics: MutPtr, matrix: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGetWorldTransform(graphics.rawAddress, matrix.rawAddress)

public actual fun gdipGraphicsClear(graphics: MutPtr, color: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGraphicsClear(graphics.rawAddress, color.toInt())

public actual fun gdipGraphicsSetAbort(pgraphics: MutPtr, piabort: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipGraphicsSetAbort(pgraphics.rawAddress, piabort.rawAddress)

public actual fun gdipImageForceValidation(image: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipImageForceValidation(image.rawAddress)

public actual fun gdipImageGetFrameCount(image: MutPtr, dimensionid: ConstPtr, count: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipImageGetFrameCount(image.rawAddress, dimensionid.rawAddress, count.rawAddress)

public actual fun gdipImageGetFrameDimensionsCount(image: MutPtr, count: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipImageGetFrameDimensionsCount(image.rawAddress, count.rawAddress)

public actual fun gdipImageGetFrameDimensionsList(image: MutPtr, dimensionids: MutPtr, count: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipImageGetFrameDimensionsList(image.rawAddress, dimensionids.rawAddress, count.toInt())

public actual fun gdipImageRotateFlip(image: MutPtr, rftype: RotateFlipType): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipImageRotateFlip(image.rawAddress, rftype)

public actual fun gdipImageSelectActiveFrame(image: MutPtr, dimensionid: ConstPtr, frameindex: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipImageSelectActiveFrame(image.rawAddress, dimensionid.rawAddress, frameindex.toInt())

public actual fun gdipImageSetAbort(pimage: MutPtr, piabort: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipImageSetAbort(pimage.rawAddress, piabort.rawAddress)

public actual fun gdipInitializePalette(palette: MutPtr, palettetype: PaletteType, optimalcolors: Int, usetransparentcolor: Bool, bitmap: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipInitializePalette(palette.rawAddress, palettetype, optimalcolors, usetransparentcolor, bitmap.rawAddress)

public actual fun gdipInvertMatrix(matrix: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipInvertMatrix(matrix.rawAddress)

public actual fun gdipIsClipEmpty(graphics: MutPtr, result: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipIsClipEmpty(graphics.rawAddress, result.rawAddress)

public actual fun gdipIsEmptyRegion(region: MutPtr, graphics: MutPtr, result: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipIsEmptyRegion(region.rawAddress, graphics.rawAddress, result.rawAddress)

public actual fun gdipIsEqualRegion(region: MutPtr, region2: MutPtr, graphics: MutPtr, result: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipIsEqualRegion(region.rawAddress, region2.rawAddress, graphics.rawAddress, result.rawAddress)

public actual fun gdipIsInfiniteRegion(region: MutPtr, graphics: MutPtr, result: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipIsInfiniteRegion(region.rawAddress, graphics.rawAddress, result.rawAddress)

public actual fun gdipIsMatrixEqual(matrix: ConstPtr, matrix2: ConstPtr, result: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipIsMatrixEqual(matrix.rawAddress, matrix2.rawAddress, result.rawAddress)

public actual fun gdipIsMatrixIdentity(matrix: ConstPtr, result: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipIsMatrixIdentity(matrix.rawAddress, result.rawAddress)

public actual fun gdipIsMatrixInvertible(matrix: ConstPtr, result: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipIsMatrixInvertible(matrix.rawAddress, result.rawAddress)

public actual fun gdipIsOutlineVisiblePathPoint(path: MutPtr, x: Float, y: Float, pen: MutPtr, graphics: MutPtr, result: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipIsOutlineVisiblePathPoint(path.rawAddress, x, y, pen.rawAddress, graphics.rawAddress, result.rawAddress)

public actual fun gdipIsOutlineVisiblePathPointI(path: MutPtr, x: Int, y: Int, pen: MutPtr, graphics: MutPtr, result: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipIsOutlineVisiblePathPointI(path.rawAddress, x, y, pen.rawAddress, graphics.rawAddress, result.rawAddress)

public actual fun gdipIsStyleAvailable(family: ConstPtr, style: Int, isstyleavailable: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipIsStyleAvailable(family.rawAddress, style, isstyleavailable.rawAddress)

public actual fun gdipIsVisibleClipEmpty(graphics: MutPtr, result: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleClipEmpty(graphics.rawAddress, result.rawAddress)

public actual fun gdipIsVisiblePathPoint(path: MutPtr, x: Float, y: Float, graphics: MutPtr, result: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePathPoint(path.rawAddress, x, y, graphics.rawAddress, result.rawAddress)

public actual fun gdipIsVisiblePathPointI(path: MutPtr, x: Int, y: Int, graphics: MutPtr, result: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePathPointI(path.rawAddress, x, y, graphics.rawAddress, result.rawAddress)

public actual fun gdipIsVisiblePoint(graphics: MutPtr, x: Float, y: Float, result: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePoint(graphics.rawAddress, x, y, result.rawAddress)

public actual fun gdipIsVisiblePointI(graphics: MutPtr, x: Int, y: Int, result: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipIsVisiblePointI(graphics.rawAddress, x, y, result.rawAddress)

public actual fun gdipIsVisibleRect(graphics: MutPtr, x: Float, y: Float, width: Float, height: Float, result: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRect(graphics.rawAddress, x, y, width, height, result.rawAddress)

public actual fun gdipIsVisibleRectI(graphics: MutPtr, x: Int, y: Int, width: Int, height: Int, result: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRectI(graphics.rawAddress, x, y, width, height, result.rawAddress)

public actual fun gdipIsVisibleRegionPoint(region: MutPtr, x: Float, y: Float, graphics: MutPtr, result: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionPoint(region.rawAddress, x, y, graphics.rawAddress, result.rawAddress)

public actual fun gdipIsVisibleRegionPointI(region: MutPtr, x: Int, y: Int, graphics: MutPtr, result: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionPointI(region.rawAddress, x, y, graphics.rawAddress, result.rawAddress)

public actual fun gdipIsVisibleRegionRect(region: MutPtr, x: Float, y: Float, width: Float, height: Float, graphics: MutPtr, result: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionRect(region.rawAddress, x, y, width, height, graphics.rawAddress, result.rawAddress)

public actual fun gdipIsVisibleRegionRectI(region: MutPtr, x: Int, y: Int, width: Int, height: Int, graphics: MutPtr, result: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipIsVisibleRegionRectI(region.rawAddress, x, y, width, height, graphics.rawAddress, result.rawAddress)

public actual fun gdipLoadImageFromFile(filename: Pcwstr, image: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromFile(filename.rawAddress, image.rawAddress)

public actual fun gdipLoadImageFromFileICM(filename: Pcwstr, image: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromFileICM(filename.rawAddress, image.rawAddress)

public actual fun gdipLoadImageFromStream(stream: MutPtr, image: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromStream(stream.rawAddress, image.rawAddress)

public actual fun gdipLoadImageFromStreamICM(stream: MutPtr, image: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipLoadImageFromStreamICM(stream.rawAddress, image.rawAddress)

public actual fun gdipMeasureCharacterRanges(graphics: MutPtr, string: Pcwstr, length: Int, font: ConstPtr, layoutrect: ConstPtr, stringformat: ConstPtr, regioncount: Int, regions: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipMeasureCharacterRanges(graphics.rawAddress, string.rawAddress, length, font.rawAddress, layoutrect.rawAddress, stringformat.rawAddress, regioncount, regions.rawAddress)

public actual fun gdipMeasureDriverString(graphics: MutPtr, text: ConstPtr, length: Int, font: ConstPtr, positions: ConstPtr, flags: Int, matrix: ConstPtr, boundingbox: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipMeasureDriverString(graphics.rawAddress, text.rawAddress, length, font.rawAddress, positions.rawAddress, flags, matrix.rawAddress, boundingbox.rawAddress)

public actual fun gdipMeasureString(graphics: MutPtr, string: Pcwstr, length: Int, font: ConstPtr, layoutrect: ConstPtr, stringformat: ConstPtr, boundingbox: MutPtr, codepointsfitted: MutPtr, linesfilled: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipMeasureString(graphics.rawAddress, string.rawAddress, length, font.rawAddress, layoutrect.rawAddress, stringformat.rawAddress, boundingbox.rawAddress, codepointsfitted.rawAddress, linesfilled.rawAddress)

public actual fun gdipMultiplyLineTransform(brush: MutPtr, matrix: ConstPtr, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipMultiplyLineTransform(brush.rawAddress, matrix.rawAddress, order)

public actual fun gdipMultiplyMatrix(matrix: MutPtr, matrix2: MutPtr, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipMultiplyMatrix(matrix.rawAddress, matrix2.rawAddress, order)

public actual fun gdipMultiplyPathGradientTransform(brush: MutPtr, matrix: ConstPtr, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipMultiplyPathGradientTransform(brush.rawAddress, matrix.rawAddress, order)

public actual fun gdipMultiplyPenTransform(pen: MutPtr, matrix: ConstPtr, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipMultiplyPenTransform(pen.rawAddress, matrix.rawAddress, order)

public actual fun gdipMultiplyTextureTransform(brush: MutPtr, matrix: ConstPtr, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipMultiplyTextureTransform(brush.rawAddress, matrix.rawAddress, order)

public actual fun gdipMultiplyWorldTransform(graphics: MutPtr, matrix: ConstPtr, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipMultiplyWorldTransform(graphics.rawAddress, matrix.rawAddress, order)

public actual fun gdipNewInstalledFontCollection(fontcollection: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipNewInstalledFontCollection(fontcollection.rawAddress)

public actual fun gdipNewPrivateFontCollection(fontcollection: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipNewPrivateFontCollection(fontcollection.rawAddress)

public actual fun gdipPathIterCopyData(iterator: MutPtr, resultcount: MutPtr, points: MutPtr, types: MutPtr, startindex: Int, endindex: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipPathIterCopyData(iterator.rawAddress, resultcount.rawAddress, points.rawAddress, types.rawAddress, startindex, endindex)

public actual fun gdipPathIterEnumerate(iterator: MutPtr, resultcount: MutPtr, points: MutPtr, types: MutPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipPathIterEnumerate(iterator.rawAddress, resultcount.rawAddress, points.rawAddress, types.rawAddress, count)

public actual fun gdipPathIterGetCount(iterator: MutPtr, count: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipPathIterGetCount(iterator.rawAddress, count.rawAddress)

public actual fun gdipPathIterGetSubpathCount(iterator: MutPtr, count: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipPathIterGetSubpathCount(iterator.rawAddress, count.rawAddress)

public actual fun gdipPathIterHasCurve(iterator: MutPtr, hascurve: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipPathIterHasCurve(iterator.rawAddress, hascurve.rawAddress)

public actual fun gdipPathIterIsValid(iterator: MutPtr, valid: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipPathIterIsValid(iterator.rawAddress, valid.rawAddress)

public actual fun gdipPathIterNextMarker(iterator: MutPtr, resultcount: MutPtr, startindex: MutPtr, endindex: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextMarker(iterator.rawAddress, resultcount.rawAddress, startindex.rawAddress, endindex.rawAddress)

public actual fun gdipPathIterNextMarkerPath(iterator: MutPtr, resultcount: MutPtr, path: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextMarkerPath(iterator.rawAddress, resultcount.rawAddress, path.rawAddress)

public actual fun gdipPathIterNextPathType(iterator: MutPtr, resultcount: MutPtr, pathtype: MutPtr, startindex: MutPtr, endindex: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextPathType(iterator.rawAddress, resultcount.rawAddress, pathtype.rawAddress, startindex.rawAddress, endindex.rawAddress)

public actual fun gdipPathIterNextSubpath(iterator: MutPtr, resultcount: MutPtr, startindex: MutPtr, endindex: MutPtr, isclosed: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextSubpath(iterator.rawAddress, resultcount.rawAddress, startindex.rawAddress, endindex.rawAddress, isclosed.rawAddress)

public actual fun gdipPathIterNextSubpathPath(iterator: MutPtr, resultcount: MutPtr, path: MutPtr, isclosed: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipPathIterNextSubpathPath(iterator.rawAddress, resultcount.rawAddress, path.rawAddress, isclosed.rawAddress)

public actual fun gdipPathIterRewind(iterator: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipPathIterRewind(iterator.rawAddress)

public actual fun gdipPlayMetafileRecord(metafile: ConstPtr, recordtype: EmfPlusRecordType, flags: UInt, datasize: UInt, data: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipPlayMetafileRecord(metafile.rawAddress, recordtype, flags.toInt(), datasize.toInt(), data.rawAddress)

public actual fun gdipPrivateAddFontFile(fontcollection: MutPtr, filename: Pcwstr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipPrivateAddFontFile(fontcollection.rawAddress, filename.rawAddress)

public actual fun gdipPrivateAddMemoryFont(fontcollection: MutPtr, memory: ConstPtr, length: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipPrivateAddMemoryFont(fontcollection.rawAddress, memory.rawAddress, length)

public actual fun gdipRecordMetafile(referencehdc: Hdc, type: EmfType, framerect: ConstPtr, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafile(referencehdc.rawAddress, type, framerect.rawAddress, frameunit, description.rawAddress, metafile.rawAddress)

public actual fun gdipRecordMetafileFileName(filename: Pcwstr, referencehdc: Hdc, type: EmfType, framerect: ConstPtr, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileFileName(filename.rawAddress, referencehdc.rawAddress, type, framerect.rawAddress, frameunit, description.rawAddress, metafile.rawAddress)

public actual fun gdipRecordMetafileFileNameI(filename: Pcwstr, referencehdc: Hdc, type: EmfType, framerect: ConstPtr, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileFileNameI(filename.rawAddress, referencehdc.rawAddress, type, framerect.rawAddress, frameunit, description.rawAddress, metafile.rawAddress)

public actual fun gdipRecordMetafileI(referencehdc: Hdc, type: EmfType, framerect: ConstPtr, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileI(referencehdc.rawAddress, type, framerect.rawAddress, frameunit, description.rawAddress, metafile.rawAddress)

public actual fun gdipRecordMetafileStream(stream: MutPtr, referencehdc: Hdc, type: EmfType, framerect: ConstPtr, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileStream(stream.rawAddress, referencehdc.rawAddress, type, framerect.rawAddress, frameunit, description.rawAddress, metafile.rawAddress)

public actual fun gdipRecordMetafileStreamI(stream: MutPtr, referencehdc: Hdc, type: EmfType, framerect: ConstPtr, frameunit: MetafileFrameUnit, description: Pcwstr, metafile: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipRecordMetafileStreamI(stream.rawAddress, referencehdc.rawAddress, type, framerect.rawAddress, frameunit, description.rawAddress, metafile.rawAddress)

public actual fun gdipReleaseDC(graphics: MutPtr, hdc: Hdc): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipReleaseDC(graphics.rawAddress, hdc.rawAddress)

public actual fun gdipRemovePropertyItem(image: MutPtr, propid: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipRemovePropertyItem(image.rawAddress, propid.toInt())

public actual fun gdipResetClip(graphics: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipResetClip(graphics.rawAddress)

public actual fun gdipResetImageAttributes(imageattr: MutPtr, type: ColorAdjustType): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipResetImageAttributes(imageattr.rawAddress, type)

public actual fun gdipResetLineTransform(brush: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipResetLineTransform(brush.rawAddress)

public actual fun gdipResetPageTransform(graphics: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipResetPageTransform(graphics.rawAddress)

public actual fun gdipResetPath(path: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipResetPath(path.rawAddress)

public actual fun gdipResetPathGradientTransform(brush: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipResetPathGradientTransform(brush.rawAddress)

public actual fun gdipResetPenTransform(pen: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipResetPenTransform(pen.rawAddress)

public actual fun gdipResetTextureTransform(brush: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipResetTextureTransform(brush.rawAddress)

public actual fun gdipResetWorldTransform(graphics: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipResetWorldTransform(graphics.rawAddress)

public actual fun gdipRestoreGraphics(graphics: MutPtr, state: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipRestoreGraphics(graphics.rawAddress, state.toInt())

public actual fun gdipReversePath(path: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipReversePath(path.rawAddress)

public actual fun gdipRotateLineTransform(brush: MutPtr, angle: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipRotateLineTransform(brush.rawAddress, angle, order)

public actual fun gdipRotateMatrix(matrix: MutPtr, angle: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipRotateMatrix(matrix.rawAddress, angle, order)

public actual fun gdipRotatePathGradientTransform(brush: MutPtr, angle: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipRotatePathGradientTransform(brush.rawAddress, angle, order)

public actual fun gdipRotatePenTransform(pen: MutPtr, angle: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipRotatePenTransform(pen.rawAddress, angle, order)

public actual fun gdipRotateTextureTransform(brush: MutPtr, angle: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipRotateTextureTransform(brush.rawAddress, angle, order)

public actual fun gdipRotateWorldTransform(graphics: MutPtr, angle: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipRotateWorldTransform(graphics.rawAddress, angle, order)

public actual fun gdipSaveAdd(image: MutPtr, encoderparams: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSaveAdd(image.rawAddress, encoderparams.rawAddress)

public actual fun gdipSaveAddImage(image: MutPtr, newimage: MutPtr, encoderparams: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSaveAddImage(image.rawAddress, newimage.rawAddress, encoderparams.rawAddress)

public actual fun gdipSaveGraphics(graphics: MutPtr, state: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSaveGraphics(graphics.rawAddress, state.rawAddress)

public actual fun gdipSaveImageToFile(image: MutPtr, filename: Pcwstr, clsidencoder: ConstPtr, encoderparams: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSaveImageToFile(image.rawAddress, filename.rawAddress, clsidencoder.rawAddress, encoderparams.rawAddress)

public actual fun gdipSaveImageToStream(image: MutPtr, stream: MutPtr, clsidencoder: ConstPtr, encoderparams: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSaveImageToStream(image.rawAddress, stream.rawAddress, clsidencoder.rawAddress, encoderparams.rawAddress)

public actual fun gdipScaleLineTransform(brush: MutPtr, sx: Float, sy: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipScaleLineTransform(brush.rawAddress, sx, sy, order)

public actual fun gdipScaleMatrix(matrix: MutPtr, scalex: Float, scaley: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipScaleMatrix(matrix.rawAddress, scalex, scaley, order)

public actual fun gdipScalePathGradientTransform(brush: MutPtr, sx: Float, sy: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipScalePathGradientTransform(brush.rawAddress, sx, sy, order)

public actual fun gdipScalePenTransform(pen: MutPtr, sx: Float, sy: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipScalePenTransform(pen.rawAddress, sx, sy, order)

public actual fun gdipScaleTextureTransform(brush: MutPtr, sx: Float, sy: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipScaleTextureTransform(brush.rawAddress, sx, sy, order)

public actual fun gdipScaleWorldTransform(graphics: MutPtr, sx: Float, sy: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipScaleWorldTransform(graphics.rawAddress, sx, sy, order)

public actual fun gdipSetAdjustableArrowCapFillState(cap: MutPtr, fillstate: Bool): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapFillState(cap.rawAddress, fillstate)

public actual fun gdipSetAdjustableArrowCapHeight(cap: MutPtr, height: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapHeight(cap.rawAddress, height)

public actual fun gdipSetAdjustableArrowCapMiddleInset(cap: MutPtr, middleinset: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapMiddleInset(cap.rawAddress, middleinset)

public actual fun gdipSetAdjustableArrowCapWidth(cap: MutPtr, width: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetAdjustableArrowCapWidth(cap.rawAddress, width)

public actual fun gdipSetClipGraphics(graphics: MutPtr, srcgraphics: MutPtr, combinemode: CombineMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetClipGraphics(graphics.rawAddress, srcgraphics.rawAddress, combinemode)

public actual fun gdipSetClipHrgn(graphics: MutPtr, hrgn: Hrgn, combinemode: CombineMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetClipHrgn(graphics.rawAddress, hrgn.rawAddress, combinemode)

public actual fun gdipSetClipPath(graphics: MutPtr, path: MutPtr, combinemode: CombineMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetClipPath(graphics.rawAddress, path.rawAddress, combinemode)

public actual fun gdipSetClipRect(graphics: MutPtr, x: Float, y: Float, width: Float, height: Float, combinemode: CombineMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetClipRect(graphics.rawAddress, x, y, width, height, combinemode)

public actual fun gdipSetClipRectI(graphics: MutPtr, x: Int, y: Int, width: Int, height: Int, combinemode: CombineMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetClipRectI(graphics.rawAddress, x, y, width, height, combinemode)

public actual fun gdipSetClipRegion(graphics: MutPtr, region: MutPtr, combinemode: CombineMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetClipRegion(graphics.rawAddress, region.rawAddress, combinemode)

public actual fun gdipSetCompositingMode(graphics: MutPtr, compositingmode: CompositingMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetCompositingMode(graphics.rawAddress, compositingmode)

public actual fun gdipSetCompositingQuality(graphics: MutPtr, compositingquality: CompositingQuality): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetCompositingQuality(graphics.rawAddress, compositingquality)

public actual fun gdipSetCustomLineCapBaseCap(customcap: MutPtr, basecap: LineCap): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapBaseCap(customcap.rawAddress, basecap)

public actual fun gdipSetCustomLineCapBaseInset(customcap: MutPtr, inset: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapBaseInset(customcap.rawAddress, inset)

public actual fun gdipSetCustomLineCapStrokeCaps(customcap: MutPtr, startcap: LineCap, endcap: LineCap): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapStrokeCaps(customcap.rawAddress, startcap, endcap)

public actual fun gdipSetCustomLineCapStrokeJoin(customcap: MutPtr, linejoin: LineJoin): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapStrokeJoin(customcap.rawAddress, linejoin)

public actual fun gdipSetCustomLineCapWidthScale(customcap: MutPtr, widthscale: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetCustomLineCapWidthScale(customcap.rawAddress, widthscale)

public actual fun gdipSetEffectParameters(effect: MutPtr, params: ConstPtr, size: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetEffectParameters(effect.rawAddress, params.rawAddress, size.toInt())

public actual fun gdipSetEmpty(region: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetEmpty(region.rawAddress)

public actual fun gdipSetImageAttributesCachedBackground(imageattr: MutPtr, enableflag: Bool): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesCachedBackground(imageattr.rawAddress, enableflag)

public actual fun gdipSetImageAttributesColorKeys(imageattr: MutPtr, type: ColorAdjustType, enableflag: Bool, colorlow: UInt, colorhigh: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesColorKeys(imageattr.rawAddress, type, enableflag, colorlow.toInt(), colorhigh.toInt())

public actual fun gdipSetImageAttributesColorMatrix(imageattr: MutPtr, type: ColorAdjustType, enableflag: Bool, colormatrix: ConstPtr, graymatrix: ConstPtr, flags: ColorMatrixFlags): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesColorMatrix(imageattr.rawAddress, type, enableflag, colormatrix.rawAddress, graymatrix.rawAddress, flags)

public actual fun gdipSetImageAttributesGamma(imageattr: MutPtr, type: ColorAdjustType, enableflag: Bool, gamma: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesGamma(imageattr.rawAddress, type, enableflag, gamma)

public actual fun gdipSetImageAttributesNoOp(imageattr: MutPtr, type: ColorAdjustType, enableflag: Bool): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesNoOp(imageattr.rawAddress, type, enableflag)

public actual fun gdipSetImageAttributesOutputChannel(imageattr: MutPtr, type: ColorAdjustType, enableflag: Bool, channelflags: ColorChannelFlags): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesOutputChannel(imageattr.rawAddress, type, enableflag, channelflags)

public actual fun gdipSetImageAttributesOutputChannelColorProfile(imageattr: MutPtr, type: ColorAdjustType, enableflag: Bool, colorprofilefilename: Pcwstr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesOutputChannelColorProfile(imageattr.rawAddress, type, enableflag, colorprofilefilename.rawAddress)

public actual fun gdipSetImageAttributesRemapTable(imageattr: MutPtr, type: ColorAdjustType, enableflag: Bool, mapsize: UInt, map: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesRemapTable(imageattr.rawAddress, type, enableflag, mapsize.toInt(), map.rawAddress)

public actual fun gdipSetImageAttributesThreshold(imageattr: MutPtr, type: ColorAdjustType, enableflag: Bool, threshold: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesThreshold(imageattr.rawAddress, type, enableflag, threshold)

public actual fun gdipSetImageAttributesToIdentity(imageattr: MutPtr, type: ColorAdjustType): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesToIdentity(imageattr.rawAddress, type)

public actual fun gdipSetImageAttributesWrapMode(imageattr: MutPtr, wrap: WrapMode, argb: UInt, clamp: Bool): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetImageAttributesWrapMode(imageattr.rawAddress, wrap, argb.toInt(), clamp)

public actual fun gdipSetImagePalette(image: MutPtr, palette: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetImagePalette(image.rawAddress, palette.rawAddress)

public actual fun gdipSetInfinite(region: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetInfinite(region.rawAddress)

public actual fun gdipSetInterpolationMode(graphics: MutPtr, interpolationmode: InterpolationMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetInterpolationMode(graphics.rawAddress, interpolationmode)

public actual fun gdipSetLineBlend(brush: MutPtr, blend: ConstPtr, positions: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetLineBlend(brush.rawAddress, blend.rawAddress, positions.rawAddress, count)

public actual fun gdipSetLineColors(brush: MutPtr, color1: UInt, color2: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetLineColors(brush.rawAddress, color1.toInt(), color2.toInt())

public actual fun gdipSetLineGammaCorrection(brush: MutPtr, usegammacorrection: Bool): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetLineGammaCorrection(brush.rawAddress, usegammacorrection)

public actual fun gdipSetLineLinearBlend(brush: MutPtr, focus: Float, scale: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetLineLinearBlend(brush.rawAddress, focus, scale)

public actual fun gdipSetLinePresetBlend(brush: MutPtr, blend: ConstPtr, positions: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetLinePresetBlend(brush.rawAddress, blend.rawAddress, positions.rawAddress, count)

public actual fun gdipSetLineSigmaBlend(brush: MutPtr, focus: Float, scale: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetLineSigmaBlend(brush.rawAddress, focus, scale)

public actual fun gdipSetLineTransform(brush: MutPtr, matrix: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetLineTransform(brush.rawAddress, matrix.rawAddress)

public actual fun gdipSetLineWrapMode(brush: MutPtr, wrapmode: WrapMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetLineWrapMode(brush.rawAddress, wrapmode)

public actual fun gdipSetMatrixElements(matrix: MutPtr, m11: Float, m12: Float, m21: Float, m22: Float, dx: Float, dy: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetMatrixElements(matrix.rawAddress, m11, m12, m21, m22, dx, dy)

public actual fun gdipSetMetafileDownLevelRasterizationLimit(metafile: MutPtr, metafilerasterizationlimitdpi: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetMetafileDownLevelRasterizationLimit(metafile.rawAddress, metafilerasterizationlimitdpi.toInt())

public actual fun gdipSetPageScale(graphics: MutPtr, scale: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPageScale(graphics.rawAddress, scale)

public actual fun gdipSetPageUnit(graphics: MutPtr, unit: Unit): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPageUnit(graphics.rawAddress, unit)

public actual fun gdipSetPathFillMode(path: MutPtr, fillmode: FillMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPathFillMode(path.rawAddress, fillmode)

public actual fun gdipSetPathGradientBlend(brush: MutPtr, blend: ConstPtr, positions: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientBlend(brush.rawAddress, blend.rawAddress, positions.rawAddress, count)

public actual fun gdipSetPathGradientCenterColor(brush: MutPtr, colors: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientCenterColor(brush.rawAddress, colors.toInt())

public actual fun gdipSetPathGradientCenterPoint(brush: MutPtr, points: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientCenterPoint(brush.rawAddress, points.rawAddress)

public actual fun gdipSetPathGradientCenterPointI(brush: MutPtr, points: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientCenterPointI(brush.rawAddress, points.rawAddress)

public actual fun gdipSetPathGradientFocusScales(brush: MutPtr, xscale: Float, yscale: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientFocusScales(brush.rawAddress, xscale, yscale)

public actual fun gdipSetPathGradientGammaCorrection(brush: MutPtr, usegammacorrection: Bool): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientGammaCorrection(brush.rawAddress, usegammacorrection)

public actual fun gdipSetPathGradientLinearBlend(brush: MutPtr, focus: Float, scale: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientLinearBlend(brush.rawAddress, focus, scale)

public actual fun gdipSetPathGradientPath(brush: MutPtr, path: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientPath(brush.rawAddress, path.rawAddress)

public actual fun gdipSetPathGradientPresetBlend(brush: MutPtr, blend: ConstPtr, positions: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientPresetBlend(brush.rawAddress, blend.rawAddress, positions.rawAddress, count)

public actual fun gdipSetPathGradientSigmaBlend(brush: MutPtr, focus: Float, scale: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientSigmaBlend(brush.rawAddress, focus, scale)

public actual fun gdipSetPathGradientSurroundColorsWithCount(brush: MutPtr, color: ConstPtr, count: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientSurroundColorsWithCount(brush.rawAddress, color.rawAddress, count.rawAddress)

public actual fun gdipSetPathGradientTransform(brush: MutPtr, matrix: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientTransform(brush.rawAddress, matrix.rawAddress)

public actual fun gdipSetPathGradientWrapMode(brush: MutPtr, wrapmode: WrapMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPathGradientWrapMode(brush.rawAddress, wrapmode)

public actual fun gdipSetPathMarker(path: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPathMarker(path.rawAddress)

public actual fun gdipSetPenBrushFill(pen: MutPtr, brush: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPenBrushFill(pen.rawAddress, brush.rawAddress)

public actual fun gdipSetPenColor(pen: MutPtr, argb: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPenColor(pen.rawAddress, argb.toInt())

public actual fun gdipSetPenCompoundArray(pen: MutPtr, dash: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPenCompoundArray(pen.rawAddress, dash.rawAddress, count)

public actual fun gdipSetPenCustomEndCap(pen: MutPtr, customcap: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPenCustomEndCap(pen.rawAddress, customcap.rawAddress)

public actual fun gdipSetPenCustomStartCap(pen: MutPtr, customcap: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPenCustomStartCap(pen.rawAddress, customcap.rawAddress)

public actual fun gdipSetPenDashArray(pen: MutPtr, dash: ConstPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashArray(pen.rawAddress, dash.rawAddress, count)

public actual fun gdipSetPenDashCap197819(pen: MutPtr, dashcap: DashCap): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashCap197819(pen.rawAddress, dashcap)

public actual fun gdipSetPenDashOffset(pen: MutPtr, offset: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashOffset(pen.rawAddress, offset)

public actual fun gdipSetPenDashStyle(pen: MutPtr, dashstyle: DashStyle): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPenDashStyle(pen.rawAddress, dashstyle)

public actual fun gdipSetPenEndCap(pen: MutPtr, endcap: LineCap): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPenEndCap(pen.rawAddress, endcap)

public actual fun gdipSetPenLineCap197819(pen: MutPtr, startcap: LineCap, endcap: LineCap, dashcap: DashCap): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPenLineCap197819(pen.rawAddress, startcap, endcap, dashcap)

public actual fun gdipSetPenLineJoin(pen: MutPtr, linejoin: LineJoin): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPenLineJoin(pen.rawAddress, linejoin)

public actual fun gdipSetPenMiterLimit(pen: MutPtr, miterlimit: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPenMiterLimit(pen.rawAddress, miterlimit)

public actual fun gdipSetPenMode(pen: MutPtr, penmode: PenAlignment): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPenMode(pen.rawAddress, penmode)

public actual fun gdipSetPenStartCap(pen: MutPtr, startcap: LineCap): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPenStartCap(pen.rawAddress, startcap)

public actual fun gdipSetPenTransform(pen: MutPtr, matrix: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPenTransform(pen.rawAddress, matrix.rawAddress)

public actual fun gdipSetPenUnit(pen: MutPtr, unit: Unit): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPenUnit(pen.rawAddress, unit)

public actual fun gdipSetPenWidth(pen: MutPtr, width: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPenWidth(pen.rawAddress, width)

public actual fun gdipSetPixelOffsetMode(graphics: MutPtr, pixeloffsetmode: PixelOffsetMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPixelOffsetMode(graphics.rawAddress, pixeloffsetmode)

public actual fun gdipSetPropertyItem(image: MutPtr, item: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetPropertyItem(image.rawAddress, item.rawAddress)

public actual fun gdipSetRenderingOrigin(graphics: MutPtr, x: Int, y: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetRenderingOrigin(graphics.rawAddress, x, y)

public actual fun gdipSetSmoothingMode(graphics: MutPtr, smoothingmode: SmoothingMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetSmoothingMode(graphics.rawAddress, smoothingmode)

public actual fun gdipSetSolidFillColor(brush: MutPtr, color: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetSolidFillColor(brush.rawAddress, color.toInt())

public actual fun gdipSetStringFormatAlign(format: MutPtr, align: StringAlignment): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatAlign(format.rawAddress, align)

public actual fun gdipSetStringFormatDigitSubstitution(format: MutPtr, language: UShort, substitute: StringDigitSubstitute): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatDigitSubstitution(format.rawAddress, language.toShort(), substitute)

public actual fun gdipSetStringFormatFlags(format: MutPtr, flags: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatFlags(format.rawAddress, flags)

public actual fun gdipSetStringFormatHotkeyPrefix(format: MutPtr, hotkeyprefix: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatHotkeyPrefix(format.rawAddress, hotkeyprefix)

public actual fun gdipSetStringFormatLineAlign(format: MutPtr, align: StringAlignment): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatLineAlign(format.rawAddress, align)

public actual fun gdipSetStringFormatMeasurableCharacterRanges(format: MutPtr, rangecount: Int, ranges: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatMeasurableCharacterRanges(format.rawAddress, rangecount, ranges.rawAddress)

public actual fun gdipSetStringFormatTabStops(format: MutPtr, firsttaboffset: Float, count: Int, tabstops: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatTabStops(format.rawAddress, firsttaboffset, count, tabstops.rawAddress)

public actual fun gdipSetStringFormatTrimming(format: MutPtr, trimming: StringTrimming): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetStringFormatTrimming(format.rawAddress, trimming)

public actual fun gdipSetTextContrast(graphics: MutPtr, contrast: UInt): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetTextContrast(graphics.rawAddress, contrast.toInt())

public actual fun gdipSetTextRenderingHint(graphics: MutPtr, mode: TextRenderingHint): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetTextRenderingHint(graphics.rawAddress, mode)

public actual fun gdipSetTextureTransform(brush: MutPtr, matrix: ConstPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetTextureTransform(brush.rawAddress, matrix.rawAddress)

public actual fun gdipSetTextureWrapMode(brush: MutPtr, wrapmode: WrapMode): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetTextureWrapMode(brush.rawAddress, wrapmode)

public actual fun gdipSetWorldTransform(graphics: MutPtr, matrix: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipSetWorldTransform(graphics.rawAddress, matrix.rawAddress)

public actual fun gdipShearMatrix(matrix: MutPtr, shearx: Float, sheary: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipShearMatrix(matrix.rawAddress, shearx, sheary, order)

public actual fun gdipStartPathFigure(path: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipStartPathFigure(path.rawAddress)

public actual fun gdipStringFormatGetGenericDefault(format: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipStringFormatGetGenericDefault(format.rawAddress)

public actual fun gdipStringFormatGetGenericTypographic(format: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipStringFormatGetGenericTypographic(format.rawAddress)

public actual fun gdipTestControl(control: GpTestControlEnum, param1: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipTestControl(control, param1.rawAddress)

public actual fun gdipTransformMatrixPoints(matrix: MutPtr, pts: MutPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipTransformMatrixPoints(matrix.rawAddress, pts.rawAddress, count)

public actual fun gdipTransformMatrixPointsI(matrix: MutPtr, pts: MutPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipTransformMatrixPointsI(matrix.rawAddress, pts.rawAddress, count)

public actual fun gdipTransformPath(path: MutPtr, matrix: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipTransformPath(path.rawAddress, matrix.rawAddress)

public actual fun gdipTransformPoints(graphics: MutPtr, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: MutPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipTransformPoints(graphics.rawAddress, destspace, srcspace, points.rawAddress, count)

public actual fun gdipTransformPointsI(graphics: MutPtr, destspace: CoordinateSpace, srcspace: CoordinateSpace, points: MutPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipTransformPointsI(graphics.rawAddress, destspace, srcspace, points.rawAddress, count)

public actual fun gdipTransformRegion(region: MutPtr, matrix: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipTransformRegion(region.rawAddress, matrix.rawAddress)

public actual fun gdipTranslateClip(graphics: MutPtr, dx: Float, dy: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipTranslateClip(graphics.rawAddress, dx, dy)

public actual fun gdipTranslateClipI(graphics: MutPtr, dx: Int, dy: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipTranslateClipI(graphics.rawAddress, dx, dy)

public actual fun gdipTranslateLineTransform(brush: MutPtr, dx: Float, dy: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipTranslateLineTransform(brush.rawAddress, dx, dy, order)

public actual fun gdipTranslateMatrix(matrix: MutPtr, offsetx: Float, offsety: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipTranslateMatrix(matrix.rawAddress, offsetx, offsety, order)

public actual fun gdipTranslatePathGradientTransform(brush: MutPtr, dx: Float, dy: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipTranslatePathGradientTransform(brush.rawAddress, dx, dy, order)

public actual fun gdipTranslatePenTransform(pen: MutPtr, dx: Float, dy: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipTranslatePenTransform(pen.rawAddress, dx, dy, order)

public actual fun gdipTranslateRegion(region: MutPtr, dx: Float, dy: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipTranslateRegion(region.rawAddress, dx, dy)

public actual fun gdipTranslateRegionI(region: MutPtr, dx: Int, dy: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipTranslateRegionI(region.rawAddress, dx, dy)

public actual fun gdipTranslateTextureTransform(brush: MutPtr, dx: Float, dy: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipTranslateTextureTransform(brush.rawAddress, dx, dy, order)

public actual fun gdipTranslateWorldTransform(graphics: MutPtr, dx: Float, dy: Float, order: MatrixOrder): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipTranslateWorldTransform(graphics.rawAddress, dx, dy, order)

public actual fun gdipVectorTransformMatrixPoints(matrix: MutPtr, pts: MutPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipVectorTransformMatrixPoints(matrix.rawAddress, pts.rawAddress, count)

public actual fun gdipVectorTransformMatrixPointsI(matrix: MutPtr, pts: MutPtr, count: Int): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipVectorTransformMatrixPointsI(matrix.rawAddress, pts.rawAddress, count)

public actual fun gdipWarpPath(path: MutPtr, matrix: MutPtr, points: ConstPtr, count: Int, srcx: Float, srcy: Float, srcwidth: Float, srcheight: Float, warpmode: WarpMode, flatness: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipWarpPath(path.rawAddress, matrix.rawAddress, points.rawAddress, count, srcx, srcy, srcwidth, srcheight, warpmode, flatness)

public actual fun gdipWidenPath(nativepath: MutPtr, pen: MutPtr, matrix: MutPtr, flatness: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipWidenPath(nativepath.rawAddress, pen.rawAddress, matrix.rawAddress, flatness)

public actual fun gdipWindingModeOutline(path: MutPtr, matrix: MutPtr, flatness: Float): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdipWindingModeOutline(path.rawAddress, matrix.rawAddress, flatness)

public actual fun gdiplusNotificationHook(token: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdiplusNotificationHook(token.rawAddress)

public actual fun gdiplusNotificationUnhook(token: ULong) {
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdiplusNotificationUnhook(token.toLong())
}

public actual fun gdiplusShutdown(token: ULong) {
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdiplusShutdown(token.toLong())
}

public actual fun gdiplusStartup(token: MutPtr, input: ConstPtr, output: MutPtr): Status =
    WindowsWin32GraphicsGdiplusJniBridge.windowssysWindowsWin32GraphicsGdiplusGdiplusStartup(token.rawAddress, input.rawAddress, output.rawAddress)
