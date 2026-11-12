@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.gdi

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Colorref
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hglobal
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hinstance
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Lparam
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.foundation.Size
import io.github.kotlinmania.windowssys.windows.win32.foundation.Wparam

private object WindowsWin32GraphicsGdiJniBridge {
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
        val stream = WindowsWin32GraphicsGdiJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32GraphicsGdiAbortPath(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiAddFontMemResourceEx(pfileview: Long, cjsize: Int, pvresrved: Long, pnumfonts: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiAddFontResourceA(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiAddFontResourceExA(name: Long, fl: Int, res: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiAddFontResourceExW(name: Long, fl: Int, res: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiAddFontResourceW(param0: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiAngleArc(hdc: Long, x: Int, y: Int, r: Int, startangle: Float, sweepangle: Float): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiAnimatePalette(hpal: Long, istartindex: Int, centries: Int, ppe: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiArc(hdc: Long, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiArcTo(hdc: Long, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiBeginPaint(hwnd: Long, lppaint: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiBeginPath(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiBitBlt(hdc: Long, x: Int, y: Int, cx: Int, cy: Int, hdcsrc: Long, x1: Int, y1: Int, rop: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCancelDC(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiChangeDisplaySettingsA(lpdevmode: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiChangeDisplaySettingsExA(lpszdevicename: Long, lpdevmode: Long, hwnd: Long, dwflags: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiChangeDisplaySettingsExW(lpszdevicename: Long, lpdevmode: Long, hwnd: Long, dwflags: Int, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiChangeDisplaySettingsW(lpdevmode: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiChord(hdc: Long, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiClientToScreen(hwnd: Long, lppoint: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCloseEnhMetaFile(hdc: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCloseFigure(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCloseMetaFile(hdc: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCombineRgn(hrgndst: Long, hrgnsrc1: Long, hrgnsrc2: Long, imode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCombineTransform(lpxfout: Long, lpxf1: Long, lpxf2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCopyEnhMetaFileA(henh: Long, lpfilename: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCopyEnhMetaFileW(henh: Long, lpfilename: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCopyMetaFileA(param0: Long, param1: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCopyMetaFileW(param0: Long, param1: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCopyRect(lprcdst: Long, lprcsrc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateBitmap(nwidth: Int, nheight: Int, nplanes: Int, nbitcount: Int, lpbits: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateBitmapIndirect(pbm: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateBrushIndirect(plbrush: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateCompatibleBitmap(hdc: Long, cx: Int, cy: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateCompatibleDC(hdc: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateDCA(pwszdriver: Long, pwszdevice: Long, pszport: Long, pdm: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateDCW(pwszdriver: Long, pwszdevice: Long, pszport: Long, pdm: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateDIBPatternBrush(h: Long, iusage: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateDIBPatternBrushPt(lppackeddib: Long, iusage: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateDIBSection(hdc: Long, pbmi: Long, usage: Int, ppvbits: Long, hsection: Long, offset: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateDIBitmap(hdc: Long, pbmih: Long, flinit: Int, pjbits: Long, pbmi: Long, iusage: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateDiscardableBitmap(hdc: Long, cx: Int, cy: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateEllipticRgn(x1: Int, y1: Int, x2: Int, y2: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateEllipticRgnIndirect(lprect: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateEnhMetaFileA(hdc: Long, lpfilename: Long, lprc: Long, lpdesc: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateEnhMetaFileW(hdc: Long, lpfilename: Long, lprc: Long, lpdesc: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateFontA(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: Int, bunderline: Int, bstrikeout: Int, icharset: Int, ioutprecision: Int, iclipprecision: Int, iquality: Int, ipitchandfamily: Int, pszfacename: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateFontIndirectA(lplf: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateFontIndirectExA(param0: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateFontIndirectExW(param0: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateFontIndirectW(lplf: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateFontPackage(puchsrcbuffer: Long, ulsrcbuffersize: Int, ppuchfontpackagebuffer: Long, pulfontpackagebuffersize: Long, pulbyteswritten: Long, usflag: Short, usttcindex: Short, ussubsetformat: Short, ussubsetlanguage: Short, ussubsetplatform: Short, ussubsetencoding: Short, pussubsetkeeplist: Long, ussubsetlistcount: Short, lpfnallocate: Long, lpfnreallocate: Long, lpfnfree: Long, lpvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateFontW(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: Int, bunderline: Int, bstrikeout: Int, icharset: Int, ioutprecision: Int, iclipprecision: Int, iquality: Int, ipitchandfamily: Int, pszfacename: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateHalftonePalette(hdc: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateHatchBrush(ihatch: Int, color: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateICA(pszdriver: Long, pszdevice: Long, pszport: Long, pdm: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateICW(pszdriver: Long, pszdevice: Long, pszport: Long, pdm: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateMetaFileA(pszfile: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateMetaFileW(pszfile: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreatePalette(plpal: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreatePatternBrush(hbm: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreatePen(istyle: Int, cwidth: Int, color: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreatePenIndirect(plpen: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreatePolyPolygonRgn(pptl: Long, pc: Long, cpoly: Int, imode: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreatePolygonRgn(pptl: Long, cpoint: Int, imode: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateRectRgn(x1: Int, y1: Int, x2: Int, y2: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateRectRgnIndirect(lprect: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateRoundRectRgn(x1: Int, y1: Int, x2: Int, y2: Int, w: Int, h: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateScalableFontResourceA(fdwhidden: Int, lpszfont: Long, lpszfile: Long, lpszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateScalableFontResourceW(fdwhidden: Int, lpszfont: Long, lpszfile: Long, lpszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiCreateSolidBrush(color: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiDPtoLP(hdc: Long, lppt: Long, c: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiDeleteDC(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiDeleteEnhMetaFile(hmf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiDeleteMetaFile(hmf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiDeleteObject(ho: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiDrawAnimatedRects(hwnd: Long, idani: Int, lprcfrom: Long, lprcto: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiDrawCaption(hwnd: Long, hdc: Long, lprect: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiDrawEdge(hdc: Long, qrc: Long, edge: Int, grfflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiDrawEscape(hdc: Long, iescape: Int, cjin: Int, lpin: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiDrawFocusRect(hdc: Long, lprc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiDrawFrameControl(param0: Long, param1: Long, param2: Int, param3: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiDrawStateA(hdc: Long, hbrfore: Long, qfncallback: Long, ldata: Long, wdata: Long, x: Int, y: Int, cx: Int, cy: Int, uflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiDrawStateW(hdc: Long, hbrfore: Long, qfncallback: Long, ldata: Long, wdata: Long, x: Int, y: Int, cx: Int, cy: Int, uflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiDrawTextA(hdc: Long, lpchtext: Long, cchtext: Int, lprc: Long, format: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiDrawTextExA(hdc: Long, lpchtext: Long, cchtext: Int, lprc: Long, format: Int, lpdtp: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiDrawTextExW(hdc: Long, lpchtext: Long, cchtext: Int, lprc: Long, format: Int, lpdtp: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiDrawTextW(hdc: Long, lpchtext: Long, cchtext: Int, lprc: Long, format: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiEllipse(hdc: Long, left: Int, top: Int, right: Int, bottom: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiEndPaint(hwnd: Long, lppaint: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiEndPath(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiEnumDisplayDevicesA(lpdevice: Long, idevnum: Int, lpdisplaydevice: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiEnumDisplayDevicesW(lpdevice: Long, idevnum: Int, lpdisplaydevice: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiEnumDisplayMonitors(hdc: Long, lprcclip: Long, lpfnenum: Long, dwdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiEnumDisplaySettingsA(lpszdevicename: Long, imodenum: Int, lpdevmode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiEnumDisplaySettingsExA(lpszdevicename: Long, imodenum: Int, lpdevmode: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiEnumDisplaySettingsExW(lpszdevicename: Long, imodenum: Int, lpdevmode: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiEnumDisplaySettingsW(lpszdevicename: Long, imodenum: Int, lpdevmode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiEnumEnhMetaFile(hdc: Long, hmf: Long, proc: Long, param3: Long, lprect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiEnumFontFamiliesA(hdc: Long, lplogfont: Long, lpproc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiEnumFontFamiliesExA(hdc: Long, lplogfont: Long, lpproc: Long, lparam: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiEnumFontFamiliesExW(hdc: Long, lplogfont: Long, lpproc: Long, lparam: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiEnumFontFamiliesW(hdc: Long, lplogfont: Long, lpproc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiEnumFontsA(hdc: Long, lplogfont: Long, lpproc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiEnumFontsW(hdc: Long, lplogfont: Long, lpproc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiEnumMetaFile(hdc: Long, hmf: Long, proc: Long, param3: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiEnumObjects(hdc: Long, ntype: Int, lpfunc: Long, lparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiEqualRect(lprc1: Long, lprc2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiEqualRgn(hrgn1: Long, hrgn2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiExcludeClipRect(hdc: Long, left: Int, top: Int, right: Int, bottom: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiExcludeUpdateRgn(hdc: Long, hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiExtCreatePen(ipenstyle: Int, cwidth: Int, plbrush: Long, cstyle: Int, pstyle: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiExtCreateRegion(lpx: Long, ncount: Int, lpdata: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiExtFloodFill(hdc: Long, x: Int, y: Int, color: Int, type: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiExtSelectClipRgn(hdc: Long, hrgn: Long, mode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiExtTextOutA(hdc: Long, x: Int, y: Int, options: Int, lprect: Long, lpstring: Long, c: Int, lpdx: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiExtTextOutW(hdc: Long, x: Int, y: Int, options: Int, lprect: Long, lpstring: Long, c: Int, lpdx: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiFillPath(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiFillRect(hdc: Long, lprc: Long, hbr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiFillRgn(hdc: Long, hrgn: Long, hbr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiFixBrushOrgEx(hdc: Long, x: Int, y: Int, ptl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiFlattenPath(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiFloodFill(hdc: Long, x: Int, y: Int, color: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiFrameRect(hdc: Long, lprc: Long, hbr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiFrameRgn(hdc: Long, hrgn: Long, hbr: Long, w: Int, h: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGdiComment(hdc: Long, nsize: Int, lpdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGdiFlush(): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGdiGetBatchLimit(): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGdiGradientFill(hdc: Long, pvertex: Long, nvertex: Int, pmesh: Long, ncount: Int, ulmode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGdiSetBatchLimit(dw: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGdiTransparentBlt(hdcdest: Long, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Long, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetArcDirection(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetAspectRatioFilterEx(hdc: Long, lpsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetBitmapBits(hbit: Long, cb: Int, lpvbits: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetBitmapDimensionEx(hbit: Long, lpsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetBkColor(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetBkMode(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetBoundsRect(hdc: Long, lprect: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetBrushOrgEx(hdc: Long, lppt: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetCharABCWidthsA(hdc: Long, wfirst: Int, wlast: Int, lpabc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetCharABCWidthsFloatA(hdc: Long, ifirst: Int, ilast: Int, lpabc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetCharABCWidthsFloatW(hdc: Long, ifirst: Int, ilast: Int, lpabc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetCharABCWidthsI(hdc: Long, gifirst: Int, cgi: Int, pgi: Long, pabc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetCharABCWidthsW(hdc: Long, wfirst: Int, wlast: Int, lpabc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetCharWidth32A(hdc: Long, ifirst: Int, ilast: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetCharWidth32W(hdc: Long, ifirst: Int, ilast: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetCharWidthA(hdc: Long, ifirst: Int, ilast: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetCharWidthFloatA(hdc: Long, ifirst: Int, ilast: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetCharWidthFloatW(hdc: Long, ifirst: Int, ilast: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetCharWidthI(hdc: Long, gifirst: Int, cgi: Int, pgi: Long, piwidths: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetCharWidthW(hdc: Long, ifirst: Int, ilast: Int, lpbuffer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetCharacterPlacementA(hdc: Long, lpstring: Long, ncount: Int, nmexextent: Int, lpresults: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetCharacterPlacementW(hdc: Long, lpstring: Long, ncount: Int, nmexextent: Int, lpresults: Long, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetClipBox(hdc: Long, lprect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetClipRgn(hdc: Long, hrgn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetColorAdjustment(hdc: Long, lpca: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetCurrentObject(hdc: Long, type: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetCurrentPositionEx(hdc: Long, lppt: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetDC(hwnd: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetDCBrushColor(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetDCEx(hwnd: Long, hrgnclip: Long, flags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetDCOrgEx(hdc: Long, lppt: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetDCPenColor(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetDIBColorTable(hdc: Long, istart: Int, centries: Int, prgbq: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetDIBits(hdc: Long, hbm: Long, start: Int, clines: Int, lpvbits: Long, lpbmi: Long, usage: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetDeviceCaps(hdc: Long, index: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetEnhMetaFileA(lpname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetEnhMetaFileBits(hemf: Long, nsize: Int, lpdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetEnhMetaFileDescriptionA(hemf: Long, cchbuffer: Int, lpdescription: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetEnhMetaFileDescriptionW(hemf: Long, cchbuffer: Int, lpdescription: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetEnhMetaFileHeader(hemf: Long, nsize: Int, lpenhmetaheader: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetEnhMetaFilePaletteEntries(hemf: Long, nnumentries: Int, lppaletteentries: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetEnhMetaFileW(lpname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetFontData(hdc: Long, dwtable: Int, dwoffset: Int, pvbuffer: Long, cjbuffer: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetFontLanguageInfo(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetFontUnicodeRanges(hdc: Long, lpgs: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetGlyphIndicesA(hdc: Long, lpstr: Long, c: Int, pgi: Long, fl: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetGlyphIndicesW(hdc: Long, lpstr: Long, c: Int, pgi: Long, fl: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetGlyphOutlineA(hdc: Long, uchar: Int, fuformat: Int, lpgm: Long, cjbuffer: Int, pvbuffer: Long, lpmat2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetGlyphOutlineW(hdc: Long, uchar: Int, fuformat: Int, lpgm: Long, cjbuffer: Int, pvbuffer: Long, lpmat2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetGraphicsMode(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetKerningPairsA(hdc: Long, npairs: Int, lpkernpair: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetKerningPairsW(hdc: Long, npairs: Int, lpkernpair: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetLayout(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetMapMode(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetMetaFileA(lpname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetMetaFileBitsEx(hmf: Long, cbbuffer: Int, lpdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetMetaFileW(lpname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetMetaRgn(hdc: Long, hrgn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetMiterLimit(hdc: Long, plimit: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetMonitorInfoA(hmonitor: Long, lpmi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetMonitorInfoW(hmonitor: Long, lpmi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetNearestColor(hdc: Long, color: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetNearestPaletteIndex(h: Long, color: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetObjectA(h: Long, c: Int, pv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetObjectType(h: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetObjectW(h: Long, c: Int, pv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetOutlineTextMetricsA(hdc: Long, cjcopy: Int, potm: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetOutlineTextMetricsW(hdc: Long, cjcopy: Int, potm: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetPaletteEntries(hpal: Long, istart: Int, centries: Int, ppalentries: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetPath(hdc: Long, apt: Long, aj: Long, cpt: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetPixel(hdc: Long, x: Int, y: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetPolyFillMode(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetROP2(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetRandomRgn(hdc: Long, hrgn: Long, i: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetRasterizerCaps(lpraststat: Long, cjbytes: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetRegionData(hrgn: Long, ncount: Int, lprgndata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetRgnBox(hrgn: Long, lprc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetStockObject(i: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetStretchBltMode(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetSysColor(nindex: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetSysColorBrush(nindex: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetSystemPaletteEntries(hdc: Long, istart: Int, centries: Int, ppalentries: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetSystemPaletteUse(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetTabbedTextExtentA(hdc: Long, lpstring: Long, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetTabbedTextExtentW(hdc: Long, lpstring: Long, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetTextAlign(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetTextCharacterExtra(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetTextColor(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetTextExtentExPointA(hdc: Long, lpszstring: Long, cchstring: Int, nmaxextent: Int, lpnfit: Long, lpndx: Long, lpsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetTextExtentExPointI(hdc: Long, lpwszstring: Long, cwchstring: Int, nmaxextent: Int, lpnfit: Long, lpndx: Long, lpsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetTextExtentExPointW(hdc: Long, lpszstring: Long, cchstring: Int, nmaxextent: Int, lpnfit: Long, lpndx: Long, lpsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetTextExtentPoint32A(hdc: Long, lpstring: Long, c: Int, psizl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetTextExtentPoint32W(hdc: Long, lpstring: Long, c: Int, psizl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetTextExtentPointA(hdc: Long, lpstring: Long, c: Int, lpsz: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetTextExtentPointI(hdc: Long, pgiin: Long, cgi: Int, psize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetTextExtentPointW(hdc: Long, lpstring: Long, c: Int, lpsz: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetTextFaceA(hdc: Long, c: Int, lpname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetTextFaceW(hdc: Long, c: Int, lpname: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetTextMetricsA(hdc: Long, lptm: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetTextMetricsW(hdc: Long, lptm: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetUpdateRect(hwnd: Long, lprect: Long, berase: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetUpdateRgn(hwnd: Long, hrgn: Long, berase: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetViewportExtEx(hdc: Long, lpsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetViewportOrgEx(hdc: Long, lppoint: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetWinMetaFileBits(hemf: Long, cbdata16: Int, pdata16: Long, imapmode: Int, hdcref: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetWindowDC(hwnd: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetWindowExtEx(hdc: Long, lpsize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetWindowOrgEx(hdc: Long, lppoint: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetWindowRgn(hwnd: Long, hrgn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetWindowRgnBox(hwnd: Long, lprc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGetWorldTransform(hdc: Long, lpxf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGradientFill(hdc: Long, pvertex: Long, nvertex: Int, pmesh: Long, nmesh: Int, ulmode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGrayStringA(hdc: Long, hbrush: Long, lpoutputfunc: Long, lpdata: Long, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiGrayStringW(hdc: Long, hbrush: Long, lpoutputfunc: Long, lpdata: Long, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiInflateRect(lprc: Long, dx: Int, dy: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiIntersectClipRect(hdc: Long, left: Int, top: Int, right: Int, bottom: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiIntersectRect(lprcdst: Long, lprcsrc1: Long, lprcsrc2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiInvalidateRect(hwnd: Long, lprect: Long, berase: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiInvalidateRgn(hwnd: Long, hrgn: Long, berase: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiInvertRect(hdc: Long, lprc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiInvertRgn(hdc: Long, hrgn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiIsRectEmpty(lprc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiLPtoDP(hdc: Long, lppt: Long, c: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiLineDDA(xstart: Int, ystart: Int, xend: Int, yend: Int, lpproc: Long, data: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiLineTo(hdc: Long, x: Int, y: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiLoadBitmapA(hinstance: Long, lpbitmapname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiLoadBitmapW(hinstance: Long, lpbitmapname: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiLockWindowUpdate(hwndlock: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiMapWindowPoints(hwndfrom: Long, hwndto: Long, lppoints: Long, cpoints: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiMaskBlt(hdcdest: Long, xdest: Int, ydest: Int, width: Int, height: Int, hdcsrc: Long, xsrc: Int, ysrc: Int, hbmmask: Long, xmask: Int, ymask: Int, rop: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiMergeFontPackage(puchmergefontbuffer: Long, ulmergefontbuffersize: Int, puchfontpackagebuffer: Long, ulfontpackagebuffersize: Int, ppuchdestbuffer: Long, puldestbuffersize: Long, pulbyteswritten: Long, usmode: Short, lpfnallocate: Long, lpfnreallocate: Long, lpfnfree: Long, lpvreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiModifyWorldTransform(hdc: Long, lpxf: Long, mode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiMonitorFromRect(lprc: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiMonitorFromWindow(hwnd: Long, dwflags: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiMoveToEx(hdc: Long, x: Int, y: Int, lppt: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiOffsetClipRgn(hdc: Long, x: Int, y: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiOffsetRect(lprc: Long, dx: Int, dy: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiOffsetRgn(hrgn: Long, x: Int, y: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiOffsetViewportOrgEx(hdc: Long, x: Int, y: Int, lppt: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiOffsetWindowOrgEx(hdc: Long, x: Int, y: Int, lppt: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiPaintDesktop(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiPaintRgn(hdc: Long, hrgn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiPatBlt(hdc: Long, x: Int, y: Int, w: Int, h: Int, rop: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiPathToRegion(hdc: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiPie(hdc: Long, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiPlayEnhMetaFile(hdc: Long, hmf: Long, lprect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiPlayEnhMetaFileRecord(hdc: Long, pht: Long, pmr: Long, cht: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiPlayMetaFile(hdc: Long, hmf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiPlayMetaFileRecord(hdc: Long, lphandletable: Long, lpmr: Long, noobjs: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiPlgBlt(hdcdest: Long, lppoint: Long, hdcsrc: Long, xsrc: Int, ysrc: Int, width: Int, height: Int, hbmmask: Long, xmask: Int, ymask: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiPolyBezier(hdc: Long, apt: Long, cpt: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiPolyBezierTo(hdc: Long, apt: Long, cpt: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiPolyDraw(hdc: Long, apt: Long, aj: Long, cpt: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiPolyPolygon(hdc: Long, apt: Long, asz: Long, csz: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiPolyPolyline(hdc: Long, apt: Long, asz: Long, csz: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiPolyTextOutA(hdc: Long, ppt: Long, nstrings: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiPolyTextOutW(hdc: Long, ppt: Long, nstrings: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiPolygon(hdc: Long, apt: Long, cpt: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiPolyline(hdc: Long, apt: Long, cpt: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiPolylineTo(hdc: Long, apt: Long, cpt: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiPtInRegion(hrgn: Long, x: Int, y: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiPtVisible(hdc: Long, x: Int, y: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiRealizePalette(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiRectInRegion(hrgn: Long, lprect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiRectVisible(hdc: Long, lprect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiRectangle(hdc: Long, left: Int, top: Int, right: Int, bottom: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiRedrawWindow(hwnd: Long, lprcupdate: Long, hrgnupdate: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiReleaseDC(hwnd: Long, hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiRemoveFontMemResourceEx(h: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiRemoveFontResourceA(lpfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiRemoveFontResourceExA(name: Long, fl: Int, pdv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiRemoveFontResourceExW(name: Long, fl: Int, pdv: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiRemoveFontResourceW(lpfilename: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiResetDCA(hdc: Long, lpdm: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiResetDCW(hdc: Long, lpdm: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiResizePalette(hpal: Long, n: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiRestoreDC(hdc: Long, nsaveddc: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiRoundRect(hdc: Long, left: Int, top: Int, right: Int, bottom: Int, width: Int, height: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSaveDC(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiScaleViewportExtEx(hdc: Long, xn: Int, dx: Int, yn: Int, yd: Int, lpsz: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiScaleWindowExtEx(hdc: Long, xn: Int, xd: Int, yn: Int, yd: Int, lpsz: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiScreenToClient(hwnd: Long, lppoint: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSelectClipPath(hdc: Long, mode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSelectClipRgn(hdc: Long, hrgn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSelectObject(hdc: Long, h: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSelectPalette(hdc: Long, hpal: Long, bforcebkgd: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetArcDirection(hdc: Long, dir: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetBitmapBits(hbm: Long, cb: Int, pvbits: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetBitmapDimensionEx(hbm: Long, w: Int, h: Int, lpsz: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetBkColor(hdc: Long, color: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetBkMode(hdc: Long, mode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetBoundsRect(hdc: Long, lprect: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetBrushOrgEx(hdc: Long, x: Int, y: Int, lppt: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetColorAdjustment(hdc: Long, lpca: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetDCBrushColor(hdc: Long, color: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetDCPenColor(hdc: Long, color: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetDIBColorTable(hdc: Long, istart: Int, centries: Int, prgbq: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetDIBits(hdc: Long, hbm: Long, start: Int, clines: Int, lpbits: Long, lpbmi: Long, coloruse: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetDIBitsToDevice(hdc: Long, xdest: Int, ydest: Int, w: Int, h: Int, xsrc: Int, ysrc: Int, startscan: Int, clines: Int, lpvbits: Long, lpbmi: Long, coloruse: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetEnhMetaFileBits(nsize: Int, pb: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetGraphicsMode(hdc: Long, imode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetLayout(hdc: Long, l: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetMapMode(hdc: Long, imode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetMapperFlags(hdc: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetMetaFileBitsEx(cbbuffer: Int, lpdata: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetMetaRgn(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetMiterLimit(hdc: Long, limit: Float, old: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetPaletteEntries(hpal: Long, istart: Int, centries: Int, ppalentries: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetPixel(hdc: Long, x: Int, y: Int, color: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetPixelV(hdc: Long, x: Int, y: Int, color: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetPolyFillMode(hdc: Long, mode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetROP2(hdc: Long, rop2: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetRect(lprc: Long, xleft: Int, ytop: Int, xright: Int, ybottom: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetRectEmpty(lprc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetRectRgn(hrgn: Long, left: Int, top: Int, right: Int, bottom: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetStretchBltMode(hdc: Long, mode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetSysColors(celements: Int, lpaelements: Long, lpargbvalues: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetSystemPaletteUse(hdc: Long, use: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetTextAlign(hdc: Long, align: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetTextCharacterExtra(hdc: Long, extra: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetTextColor(hdc: Long, color: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetTextJustification(hdc: Long, extra: Int, count: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetViewportExtEx(hdc: Long, x: Int, y: Int, lpsz: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetViewportOrgEx(hdc: Long, x: Int, y: Int, lppt: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetWindowExtEx(hdc: Long, x: Int, y: Int, lpsz: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetWindowOrgEx(hdc: Long, x: Int, y: Int, lppt: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetWindowRgn(hwnd: Long, hrgn: Long, bredraw: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSetWorldTransform(hdc: Long, lpxf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiStretchBlt(hdcdest: Long, xdest: Int, ydest: Int, wdest: Int, hdest: Int, hdcsrc: Long, xsrc: Int, ysrc: Int, wsrc: Int, hsrc: Int, rop: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiStretchDIBits(hdc: Long, xdest: Int, ydest: Int, destwidth: Int, destheight: Int, xsrc: Int, ysrc: Int, srcwidth: Int, srcheight: Int, lpbits: Long, lpbmi: Long, iusage: Int, rop: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiStrokeAndFillPath(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiStrokePath(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiSubtractRect(lprcdst: Long, lprcsrc1: Long, lprcsrc2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiTTCharToUnicode(hdc: Long, puccharcodes: Long, ulcharcodesize: Int, pusshortcodes: Long, ulshortcodesize: Int, ulflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiTTDeleteEmbeddedFont(hfontreference: Long, ulflags: Int, pulstatus: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiTTEmbedFont(hdc: Long, ulflags: Int, ulcharset: Int, pulprivstatus: Long, pulstatus: Long, lpfnwritetostream: Long, lpvwritestream: Long, puscharcodeset: Long, uscharcodecount: Short, uslanguage: Short, pttembedinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiTTEmbedFontEx(hdc: Long, ulflags: Int, ulcharset: Int, pulprivstatus: Long, pulstatus: Long, lpfnwritetostream: Long, lpvwritestream: Long, pulcharcodeset: Long, uscharcodecount: Short, uslanguage: Short, pttembedinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiTTEmbedFontFromFileA(hdc: Long, szfontfilename: Long, usttcindex: Short, ulflags: Int, ulcharset: Int, pulprivstatus: Long, pulstatus: Long, lpfnwritetostream: Long, lpvwritestream: Long, puscharcodeset: Long, uscharcodecount: Short, uslanguage: Short, pttembedinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiTTEnableEmbeddingForFacename(lpszfacename: Long, benable: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiTTGetEmbeddedFontInfo(ulflags: Int, pulprivstatus: Long, ulprivs: Int, pulstatus: Long, lpfnreadfromstream: Long, lpvreadstream: Long, pttloadinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiTTGetEmbeddingType(hdc: Long, pulembedtype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiTTGetNewFontName(phfontreference: Long, wzwinfamilyname: Long, cchmaxwinname: Int, szmacfamilyname: Long, cchmaxmacname: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiTTIsEmbeddingEnabled(hdc: Long, pbenabled: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiTTIsEmbeddingEnabledForFacename(lpszfacename: Long, pbenabled: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiTTLoadEmbeddedFont(phfontreference: Long, ulflags: Int, pulprivstatus: Long, ulprivs: Int, pulstatus: Long, lpfnreadfromstream: Long, lpvreadstream: Long, szwinfamilyname: Long, szmacfamilyname: Long, pttloadinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiTTRunValidationTests(hdc: Long, ptestparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiTTRunValidationTestsEx(hdc: Long, ptestparam: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiTabbedTextOutA(hdc: Long, x: Int, y: Int, lpstring: Long, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long, ntaborigin: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiTabbedTextOutW(hdc: Long, x: Int, y: Int, lpstring: Long, chcount: Int, ntabpositions: Int, lpntabstoppositions: Long, ntaborigin: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiTextOutA(hdc: Long, x: Int, y: Int, lpstring: Long, c: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiTextOutW(hdc: Long, x: Int, y: Int, lpstring: Long, c: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiTransparentBlt(hdcdest: Long, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Long, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiUnionRect(lprcdst: Long, lprcsrc1: Long, lprcsrc2: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiUnrealizeObject(h: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiUpdateColors(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiUpdateWindow(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiValidateRect(hwnd: Long, lprect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiValidateRgn(hwnd: Long, hrgn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiWidenPath(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiWindowFromDC(hdc: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32GraphicsGdiWglSwapMultipleBuffers(param0: Int, param1: Long): Int
}

public actual fun abortPath(hdc: Hdc): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiAbortPath(hdc.rawAddress)

public actual fun addFontMemResourceEx(pfileview: ConstPtr<CVoid>, cjsize: UInt, pvresrved: ConstPtr<CVoid>, pnumfonts: ConstPtr<UInt>): Handle =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiAddFontMemResourceEx(pfileview.rawAddress, cjsize.toInt(), pvresrved.rawAddress, pnumfonts.rawAddress))

public actual fun addFontResourceA(param0: Pcstr): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiAddFontResourceA(param0.rawAddress)

public actual fun addFontResourceExA(name: Pcstr, fl: FontResourceCharacteristics, res: ConstPtr<CVoid>): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiAddFontResourceExA(name.rawAddress, fl.toInt(), res.rawAddress)

public actual fun addFontResourceExW(name: Pcwstr, fl: FontResourceCharacteristics, res: ConstPtr<CVoid>): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiAddFontResourceExW(name.rawAddress, fl.toInt(), res.rawAddress)

public actual fun addFontResourceW(param0: Pcwstr): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiAddFontResourceW(param0.rawAddress)

public actual fun alphaBlend(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, ftn: Blendfunction): Bool =
    0

public actual fun angleArc(hdc: Hdc, x: Int, y: Int, r: UInt, startangle: Float, sweepangle: Float): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiAngleArc(hdc.rawAddress, x, y, r.toInt(), startangle, sweepangle)

public actual fun animatePalette(hpal: Hpalette, istartindex: UInt, centries: UInt, ppe: ConstPtr<Paletteentry>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiAnimatePalette(hpal.rawAddress, istartindex.toInt(), centries.toInt(), ppe.rawAddress)

public actual fun arc(hdc: Hdc, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiArc(hdc.rawAddress, x1, y1, x2, y2, x3, y3, x4, y4)

public actual fun arcTo(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiArcTo(hdc.rawAddress, left, top, right, bottom, xr1, yr1, xr2, yr2)

public actual fun beginPaint(hwnd: Hwnd, lppaint: MutPtr<Paintstruct>): Hdc =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiBeginPaint(hwnd.rawAddress, lppaint.rawAddress))

public actual fun beginPath(hdc: Hdc): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiBeginPath(hdc.rawAddress)

public actual fun bitBlt(hdc: Hdc, x: Int, y: Int, cx: Int, cy: Int, hdcsrc: Hdc, x1: Int, y1: Int, rop: RopCode): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiBitBlt(hdc.rawAddress, x, y, cx, cy, hdcsrc.rawAddress, x1, y1, rop.toInt())

public actual fun cancelDC(hdc: Hdc): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCancelDC(hdc.rawAddress)

public actual fun changeDisplaySettingsA(lpdevmode: ConstPtr<Devmodea>, dwflags: CdsType): DispChange =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiChangeDisplaySettingsA(lpdevmode.rawAddress, dwflags.toInt())

public actual fun changeDisplaySettingsExA(lpszdevicename: Pcstr, lpdevmode: ConstPtr<Devmodea>, hwnd: Hwnd, dwflags: CdsType, lparam: ConstPtr<CVoid>): DispChange =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiChangeDisplaySettingsExA(lpszdevicename.rawAddress, lpdevmode.rawAddress, hwnd.rawAddress, dwflags.toInt(), lparam.rawAddress)

public actual fun changeDisplaySettingsExW(lpszdevicename: Pcwstr, lpdevmode: ConstPtr<Devmodew>, hwnd: Hwnd, dwflags: CdsType, lparam: ConstPtr<CVoid>): DispChange =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiChangeDisplaySettingsExW(lpszdevicename.rawAddress, lpdevmode.rawAddress, hwnd.rawAddress, dwflags.toInt(), lparam.rawAddress)

public actual fun changeDisplaySettingsW(lpdevmode: ConstPtr<Devmodew>, dwflags: CdsType): DispChange =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiChangeDisplaySettingsW(lpdevmode.rawAddress, dwflags.toInt())

public actual fun chord(hdc: Hdc, x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiChord(hdc.rawAddress, x1, y1, x2, y2, x3, y3, x4, y4)

public actual fun clientToScreen(hwnd: Hwnd, lppoint: MutPtr<Point>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiClientToScreen(hwnd.rawAddress, lppoint.rawAddress)

public actual fun closeEnhMetaFile(hdc: Hdc): Henhmetafile =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCloseEnhMetaFile(hdc.rawAddress))

public actual fun closeFigure(hdc: Hdc): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCloseFigure(hdc.rawAddress)

public actual fun closeMetaFile(hdc: Hdc): Hmetafile =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCloseMetaFile(hdc.rawAddress))

public actual fun combineRgn(hrgndst: Hrgn, hrgnsrc1: Hrgn, hrgnsrc2: Hrgn, imode: RgnCombineMode): GdiRegionType =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCombineRgn(hrgndst.rawAddress, hrgnsrc1.rawAddress, hrgnsrc2.rawAddress, imode)

public actual fun combineTransform(lpxfout: MutPtr<Xform>, lpxf1: ConstPtr<Xform>, lpxf2: ConstPtr<Xform>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCombineTransform(lpxfout.rawAddress, lpxf1.rawAddress, lpxf2.rawAddress)

public actual fun copyEnhMetaFileA(henh: Henhmetafile, lpfilename: Pcstr): Henhmetafile =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCopyEnhMetaFileA(henh.rawAddress, lpfilename.rawAddress))

public actual fun copyEnhMetaFileW(henh: Henhmetafile, lpfilename: Pcwstr): Henhmetafile =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCopyEnhMetaFileW(henh.rawAddress, lpfilename.rawAddress))

public actual fun copyMetaFileA(param0: Hmetafile, param1: Pcstr): Hmetafile =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCopyMetaFileA(param0.rawAddress, param1.rawAddress))

public actual fun copyMetaFileW(param0: Hmetafile, param1: Pcwstr): Hmetafile =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCopyMetaFileW(param0.rawAddress, param1.rawAddress))

public actual fun copyRect(lprcdst: MutPtr<Rect>, lprcsrc: ConstPtr<Rect>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCopyRect(lprcdst.rawAddress, lprcsrc.rawAddress)

public actual fun createBitmap(nwidth: Int, nheight: Int, nplanes: UInt, nbitcount: UInt, lpbits: ConstPtr<CVoid>): Hbitmap =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateBitmap(nwidth, nheight, nplanes.toInt(), nbitcount.toInt(), lpbits.rawAddress))

public actual fun createBitmapIndirect(pbm: ConstPtr<Bitmap>): Hbitmap =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateBitmapIndirect(pbm.rawAddress))

public actual fun createBrushIndirect(plbrush: ConstPtr<Logbrush>): Hbrush =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateBrushIndirect(plbrush.rawAddress))

public actual fun createCompatibleBitmap(hdc: Hdc, cx: Int, cy: Int): Hbitmap =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateCompatibleBitmap(hdc.rawAddress, cx, cy))

public actual fun createCompatibleDC(hdc: Hdc): Hdc =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateCompatibleDC(hdc.rawAddress))

public actual fun createDCA(pwszdriver: Pcstr, pwszdevice: Pcstr, pszport: Pcstr, pdm: ConstPtr<Devmodea>): Hdc =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateDCA(pwszdriver.rawAddress, pwszdevice.rawAddress, pszport.rawAddress, pdm.rawAddress))

public actual fun createDCW(pwszdriver: Pcwstr, pwszdevice: Pcwstr, pszport: Pcwstr, pdm: ConstPtr<Devmodew>): Hdc =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateDCW(pwszdriver.rawAddress, pwszdevice.rawAddress, pszport.rawAddress, pdm.rawAddress))

public actual fun createDIBPatternBrush(h: Hglobal, iusage: DibUsage): Hbrush =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateDIBPatternBrush(h.rawAddress, iusage.toInt()))

public actual fun createDIBPatternBrushPt(lppackeddib: ConstPtr<CVoid>, iusage: DibUsage): Hbrush =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateDIBPatternBrushPt(lppackeddib.rawAddress, iusage.toInt()))

public actual fun createDIBSection(hdc: Hdc, pbmi: ConstPtr<Bitmapinfo>, usage: DibUsage, ppvbits: MutPtr<MutPtr<CVoid>>, hsection: Handle, offset: UInt): Hbitmap =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateDIBSection(hdc.rawAddress, pbmi.rawAddress, usage.toInt(), ppvbits.rawAddress, hsection.rawAddress, offset.toInt()))

public actual fun createDIBitmap(hdc: Hdc, pbmih: ConstPtr<Bitmapinfoheader>, flinit: UInt, pjbits: ConstPtr<CVoid>, pbmi: ConstPtr<Bitmapinfo>, iusage: DibUsage): Hbitmap =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateDIBitmap(hdc.rawAddress, pbmih.rawAddress, flinit.toInt(), pjbits.rawAddress, pbmi.rawAddress, iusage.toInt()))

public actual fun createDiscardableBitmap(hdc: Hdc, cx: Int, cy: Int): Hbitmap =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateDiscardableBitmap(hdc.rawAddress, cx, cy))

public actual fun createEllipticRgn(x1: Int, y1: Int, x2: Int, y2: Int): Hrgn =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateEllipticRgn(x1, y1, x2, y2))

public actual fun createEllipticRgnIndirect(lprect: ConstPtr<Rect>): Hrgn =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateEllipticRgnIndirect(lprect.rawAddress))

public actual fun createEnhMetaFileA(hdc: Hdc, lpfilename: Pcstr, lprc: ConstPtr<Rect>, lpdesc: Pcstr): Hdc =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateEnhMetaFileA(hdc.rawAddress, lpfilename.rawAddress, lprc.rawAddress, lpdesc.rawAddress))

public actual fun createEnhMetaFileW(hdc: Hdc, lpfilename: Pcwstr, lprc: ConstPtr<Rect>, lpdesc: Pcwstr): Hdc =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateEnhMetaFileW(hdc.rawAddress, lpfilename.rawAddress, lprc.rawAddress, lpdesc.rawAddress))

public actual fun createFontA(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: UInt, bunderline: UInt, bstrikeout: UInt, icharset: UInt, ioutprecision: UInt, iclipprecision: UInt, iquality: UInt, ipitchandfamily: UInt, pszfacename: Pcstr): Hfont =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateFontA(cheight, cwidth, cescapement, corientation, cweight, bitalic.toInt(), bunderline.toInt(), bstrikeout.toInt(), icharset.toInt(), ioutprecision.toInt(), iclipprecision.toInt(), iquality.toInt(), ipitchandfamily.toInt(), pszfacename.rawAddress))

public actual fun createFontIndirectA(lplf: ConstPtr<Logfonta>): Hfont =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateFontIndirectA(lplf.rawAddress))

public actual fun createFontIndirectExA(param0: ConstPtr<Enumlogfontexdva>): Hfont =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateFontIndirectExA(param0.rawAddress))

public actual fun createFontIndirectExW(param0: ConstPtr<Enumlogfontexdvw>): Hfont =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateFontIndirectExW(param0.rawAddress))

public actual fun createFontIndirectW(lplf: ConstPtr<Logfontw>): Hfont =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateFontIndirectW(lplf.rawAddress))

public actual fun createFontPackage(puchsrcbuffer: ConstPtr<UByte>, ulsrcbuffersize: UInt, ppuchfontpackagebuffer: MutPtr<MutPtr<UByte>>, pulfontpackagebuffersize: MutPtr<UInt>, pulbyteswritten: MutPtr<UInt>, usflag: UShort, usttcindex: UShort, ussubsetformat: UShort, ussubsetlanguage: UShort, ussubsetplatform: CreateFontPackageSubsetPlatform, ussubsetencoding: CreateFontPackageSubsetEncoding, pussubsetkeeplist: ConstPtr<UShort>, ussubsetlistcount: UShort, lpfnallocate: CfpAllocproc, lpfnreallocate: CfpReallocproc, lpfnfree: CfpFreeproc, lpvreserved: MutPtr<CVoid>): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateFontPackage(puchsrcbuffer.rawAddress, ulsrcbuffersize.toInt(), ppuchfontpackagebuffer.rawAddress, pulfontpackagebuffersize.rawAddress, pulbyteswritten.rawAddress, usflag.toShort(), usttcindex.toShort(), ussubsetformat.toShort(), ussubsetlanguage.toShort(), ussubsetplatform, ussubsetencoding, pussubsetkeeplist.rawAddress, ussubsetlistcount.toShort(), 0L, 0L, 0L, lpvreserved.rawAddress).toUInt()

public actual fun createFontW(cheight: Int, cwidth: Int, cescapement: Int, corientation: Int, cweight: Int, bitalic: UInt, bunderline: UInt, bstrikeout: UInt, icharset: UInt, ioutprecision: UInt, iclipprecision: UInt, iquality: UInt, ipitchandfamily: UInt, pszfacename: Pcwstr): Hfont =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateFontW(cheight, cwidth, cescapement, corientation, cweight, bitalic.toInt(), bunderline.toInt(), bstrikeout.toInt(), icharset.toInt(), ioutprecision.toInt(), iclipprecision.toInt(), iquality.toInt(), ipitchandfamily.toInt(), pszfacename.rawAddress))

public actual fun createHalftonePalette(hdc: Hdc): Hpalette =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateHalftonePalette(hdc.rawAddress))

public actual fun createHatchBrush(ihatch: HatchBrushStyle, color: Colorref): Hbrush =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateHatchBrush(ihatch, color.toInt()))

public actual fun createICA(pszdriver: Pcstr, pszdevice: Pcstr, pszport: Pcstr, pdm: ConstPtr<Devmodea>): Hdc =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateICA(pszdriver.rawAddress, pszdevice.rawAddress, pszport.rawAddress, pdm.rawAddress))

public actual fun createICW(pszdriver: Pcwstr, pszdevice: Pcwstr, pszport: Pcwstr, pdm: ConstPtr<Devmodew>): Hdc =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateICW(pszdriver.rawAddress, pszdevice.rawAddress, pszport.rawAddress, pdm.rawAddress))

public actual fun createMetaFileA(pszfile: Pcstr): Hdc =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateMetaFileA(pszfile.rawAddress))

public actual fun createMetaFileW(pszfile: Pcwstr): Hdc =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateMetaFileW(pszfile.rawAddress))

public actual fun createPalette(plpal: ConstPtr<Logpalette>): Hpalette =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreatePalette(plpal.rawAddress))

public actual fun createPatternBrush(hbm: Hbitmap): Hbrush =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreatePatternBrush(hbm.rawAddress))

public actual fun createPen(istyle: PenStyle, cwidth: Int, color: Colorref): Hpen =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreatePen(istyle, cwidth, color.toInt()))

public actual fun createPenIndirect(plpen: ConstPtr<Logpen>): Hpen =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreatePenIndirect(plpen.rawAddress))

public actual fun createPolyPolygonRgn(pptl: ConstPtr<Point>, pc: ConstPtr<Int>, cpoly: Int, imode: CreatePolygonRgnMode): Hrgn =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreatePolyPolygonRgn(pptl.rawAddress, pc.rawAddress, cpoly, imode))

public actual fun createPolygonRgn(pptl: ConstPtr<Point>, cpoint: Int, imode: CreatePolygonRgnMode): Hrgn =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreatePolygonRgn(pptl.rawAddress, cpoint, imode))

public actual fun createRectRgn(x1: Int, y1: Int, x2: Int, y2: Int): Hrgn =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateRectRgn(x1, y1, x2, y2))

public actual fun createRectRgnIndirect(lprect: ConstPtr<Rect>): Hrgn =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateRectRgnIndirect(lprect.rawAddress))

public actual fun createRoundRectRgn(x1: Int, y1: Int, x2: Int, y2: Int, w: Int, h: Int): Hrgn =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateRoundRectRgn(x1, y1, x2, y2, w, h))

public actual fun createScalableFontResourceA(fdwhidden: UInt, lpszfont: Pcstr, lpszfile: Pcstr, lpszpath: Pcstr): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateScalableFontResourceA(fdwhidden.toInt(), lpszfont.rawAddress, lpszfile.rawAddress, lpszpath.rawAddress)

public actual fun createScalableFontResourceW(fdwhidden: UInt, lpszfont: Pcwstr, lpszfile: Pcwstr, lpszpath: Pcwstr): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateScalableFontResourceW(fdwhidden.toInt(), lpszfont.rawAddress, lpszfile.rawAddress, lpszpath.rawAddress)

public actual fun createSolidBrush(color: Colorref): Hbrush =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiCreateSolidBrush(color.toInt()))

public actual fun dPtoLP(hdc: Hdc, lppt: MutPtr<Point>, c: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiDPtoLP(hdc.rawAddress, lppt.rawAddress, c)

public actual fun deleteDC(hdc: Hdc): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiDeleteDC(hdc.rawAddress)

public actual fun deleteEnhMetaFile(hmf: Henhmetafile): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiDeleteEnhMetaFile(hmf.rawAddress)

public actual fun deleteMetaFile(hmf: Hmetafile): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiDeleteMetaFile(hmf.rawAddress)

public actual fun deleteObject(ho: Hgdiobj): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiDeleteObject(ho.rawAddress)

public actual fun drawAnimatedRects(hwnd: Hwnd, idani: Int, lprcfrom: ConstPtr<Rect>, lprcto: ConstPtr<Rect>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiDrawAnimatedRects(hwnd.rawAddress, idani, lprcfrom.rawAddress, lprcto.rawAddress)

public actual fun drawCaption(hwnd: Hwnd, hdc: Hdc, lprect: ConstPtr<Rect>, flags: DrawCaptionFlags): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiDrawCaption(hwnd.rawAddress, hdc.rawAddress, lprect.rawAddress, flags.toInt())

public actual fun drawEdge(hdc: Hdc, qrc: MutPtr<Rect>, edge: DrawedgeFlags, grfflags: DrawEdgeFlags): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiDrawEdge(hdc.rawAddress, qrc.rawAddress, edge.toInt(), grfflags.toInt())

public actual fun drawEscape(hdc: Hdc, iescape: Int, cjin: Int, lpin: Pcstr): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiDrawEscape(hdc.rawAddress, iescape, cjin, lpin.rawAddress)

public actual fun drawFocusRect(hdc: Hdc, lprc: ConstPtr<Rect>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiDrawFocusRect(hdc.rawAddress, lprc.rawAddress)

public actual fun drawFrameControl(param0: Hdc, param1: MutPtr<Rect>, param2: DfcType, param3: DfcsState): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiDrawFrameControl(param0.rawAddress, param1.rawAddress, param2.toInt(), param3.toInt())

public actual fun drawStateA(hdc: Hdc, hbrfore: Hbrush, qfncallback: Drawstateproc, ldata: Lparam, wdata: Wparam, x: Int, y: Int, cx: Int, cy: Int, uflags: DrawstateFlags): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiDrawStateA(hdc.rawAddress, hbrfore.rawAddress, 0L, ldata, wdata.toLong(), x, y, cx, cy, uflags.toInt())

public actual fun drawStateW(hdc: Hdc, hbrfore: Hbrush, qfncallback: Drawstateproc, ldata: Lparam, wdata: Wparam, x: Int, y: Int, cx: Int, cy: Int, uflags: DrawstateFlags): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiDrawStateW(hdc.rawAddress, hbrfore.rawAddress, 0L, ldata, wdata.toLong(), x, y, cx, cy, uflags.toInt())

public actual fun drawTextA(hdc: Hdc, lpchtext: Pcstr, cchtext: Int, lprc: MutPtr<Rect>, format: DrawTextFormat): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiDrawTextA(hdc.rawAddress, lpchtext.rawAddress, cchtext, lprc.rawAddress, format.toInt())

public actual fun drawTextExA(hdc: Hdc, lpchtext: Pstr, cchtext: Int, lprc: MutPtr<Rect>, format: DrawTextFormat, lpdtp: ConstPtr<Drawtextparams>): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiDrawTextExA(hdc.rawAddress, lpchtext.rawAddress, cchtext, lprc.rawAddress, format.toInt(), lpdtp.rawAddress)

public actual fun drawTextExW(hdc: Hdc, lpchtext: Pwstr, cchtext: Int, lprc: MutPtr<Rect>, format: DrawTextFormat, lpdtp: ConstPtr<Drawtextparams>): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiDrawTextExW(hdc.rawAddress, lpchtext.rawAddress, cchtext, lprc.rawAddress, format.toInt(), lpdtp.rawAddress)

public actual fun drawTextW(hdc: Hdc, lpchtext: Pcwstr, cchtext: Int, lprc: MutPtr<Rect>, format: DrawTextFormat): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiDrawTextW(hdc.rawAddress, lpchtext.rawAddress, cchtext, lprc.rawAddress, format.toInt())

public actual fun ellipse(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiEllipse(hdc.rawAddress, left, top, right, bottom)

public actual fun endPaint(hwnd: Hwnd, lppaint: ConstPtr<Paintstruct>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiEndPaint(hwnd.rawAddress, lppaint.rawAddress)

public actual fun endPath(hdc: Hdc): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiEndPath(hdc.rawAddress)

public actual fun enumDisplayDevicesA(lpdevice: Pcstr, idevnum: UInt, lpdisplaydevice: MutPtr<DisplayDevicea>, dwflags: UInt): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiEnumDisplayDevicesA(lpdevice.rawAddress, idevnum.toInt(), lpdisplaydevice.rawAddress, dwflags.toInt())

public actual fun enumDisplayDevicesW(lpdevice: Pcwstr, idevnum: UInt, lpdisplaydevice: MutPtr<DisplayDevicew>, dwflags: UInt): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiEnumDisplayDevicesW(lpdevice.rawAddress, idevnum.toInt(), lpdisplaydevice.rawAddress, dwflags.toInt())

public actual fun enumDisplayMonitors(hdc: Hdc, lprcclip: ConstPtr<Rect>, lpfnenum: Monitorenumproc, dwdata: Lparam): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiEnumDisplayMonitors(hdc.rawAddress, lprcclip.rawAddress, 0L, dwdata)

public actual fun enumDisplaySettingsA(lpszdevicename: Pcstr, imodenum: EnumDisplaySettingsMode, lpdevmode: MutPtr<Devmodea>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiEnumDisplaySettingsA(lpszdevicename.rawAddress, imodenum.toInt(), lpdevmode.rawAddress)

public actual fun enumDisplaySettingsExA(lpszdevicename: Pcstr, imodenum: EnumDisplaySettingsMode, lpdevmode: MutPtr<Devmodea>, dwflags: EnumDisplaySettingsFlags): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiEnumDisplaySettingsExA(lpszdevicename.rawAddress, imodenum.toInt(), lpdevmode.rawAddress, dwflags.toInt())

public actual fun enumDisplaySettingsExW(lpszdevicename: Pcwstr, imodenum: EnumDisplaySettingsMode, lpdevmode: MutPtr<Devmodew>, dwflags: EnumDisplaySettingsFlags): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiEnumDisplaySettingsExW(lpszdevicename.rawAddress, imodenum.toInt(), lpdevmode.rawAddress, dwflags.toInt())

public actual fun enumDisplaySettingsW(lpszdevicename: Pcwstr, imodenum: EnumDisplaySettingsMode, lpdevmode: MutPtr<Devmodew>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiEnumDisplaySettingsW(lpszdevicename.rawAddress, imodenum.toInt(), lpdevmode.rawAddress)

public actual fun enumEnhMetaFile(hdc: Hdc, hmf: Henhmetafile, proc: Enhmfenumproc, param3: ConstPtr<CVoid>, lprect: ConstPtr<Rect>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiEnumEnhMetaFile(hdc.rawAddress, hmf.rawAddress, 0L, param3.rawAddress, lprect.rawAddress)

public actual fun enumFontFamiliesA(hdc: Hdc, lplogfont: Pcstr, lpproc: Fontenumproca, lparam: Lparam): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiEnumFontFamiliesA(hdc.rawAddress, lplogfont.rawAddress, 0L, lparam)

public actual fun enumFontFamiliesExA(hdc: Hdc, lplogfont: ConstPtr<Logfonta>, lpproc: Fontenumproca, lparam: Lparam, dwflags: UInt): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiEnumFontFamiliesExA(hdc.rawAddress, lplogfont.rawAddress, 0L, lparam, dwflags.toInt())

public actual fun enumFontFamiliesExW(hdc: Hdc, lplogfont: ConstPtr<Logfontw>, lpproc: Fontenumprocw, lparam: Lparam, dwflags: UInt): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiEnumFontFamiliesExW(hdc.rawAddress, lplogfont.rawAddress, 0L, lparam, dwflags.toInt())

public actual fun enumFontFamiliesW(hdc: Hdc, lplogfont: Pcwstr, lpproc: Fontenumprocw, lparam: Lparam): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiEnumFontFamiliesW(hdc.rawAddress, lplogfont.rawAddress, 0L, lparam)

public actual fun enumFontsA(hdc: Hdc, lplogfont: Pcstr, lpproc: Fontenumproca, lparam: Lparam): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiEnumFontsA(hdc.rawAddress, lplogfont.rawAddress, 0L, lparam)

public actual fun enumFontsW(hdc: Hdc, lplogfont: Pcwstr, lpproc: Fontenumprocw, lparam: Lparam): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiEnumFontsW(hdc.rawAddress, lplogfont.rawAddress, 0L, lparam)

public actual fun enumMetaFile(hdc: Hdc, hmf: Hmetafile, proc: Mfenumproc, param3: Lparam): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiEnumMetaFile(hdc.rawAddress, hmf.rawAddress, 0L, param3)

public actual fun enumObjects(hdc: Hdc, ntype: ObjType, lpfunc: Gobjenumproc, lparam: Lparam): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiEnumObjects(hdc.rawAddress, ntype, 0L, lparam)

public actual fun equalRect(lprc1: ConstPtr<Rect>, lprc2: ConstPtr<Rect>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiEqualRect(lprc1.rawAddress, lprc2.rawAddress)

public actual fun equalRgn(hrgn1: Hrgn, hrgn2: Hrgn): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiEqualRgn(hrgn1.rawAddress, hrgn2.rawAddress)

public actual fun excludeClipRect(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): GdiRegionType =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiExcludeClipRect(hdc.rawAddress, left, top, right, bottom)

public actual fun excludeUpdateRgn(hdc: Hdc, hwnd: Hwnd): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiExcludeUpdateRgn(hdc.rawAddress, hwnd.rawAddress)

public actual fun extCreatePen(ipenstyle: UInt, cwidth: UInt, plbrush: ConstPtr<Logbrush>, cstyle: UInt, pstyle: ConstPtr<UInt>): Hpen =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiExtCreatePen(ipenstyle.toInt(), cwidth.toInt(), plbrush.rawAddress, cstyle.toInt(), pstyle.rawAddress))

public actual fun extCreateRegion(lpx: ConstPtr<Xform>, ncount: UInt, lpdata: ConstPtr<Rgndata>): Hrgn =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiExtCreateRegion(lpx.rawAddress, ncount.toInt(), lpdata.rawAddress))

public actual fun extFloodFill(hdc: Hdc, x: Int, y: Int, color: Colorref, type: ExtFloodFillType): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiExtFloodFill(hdc.rawAddress, x, y, color.toInt(), type.toInt())

public actual fun extSelectClipRgn(hdc: Hdc, hrgn: Hrgn, mode: RgnCombineMode): GdiRegionType =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiExtSelectClipRgn(hdc.rawAddress, hrgn.rawAddress, mode)

public actual fun extTextOutA(hdc: Hdc, x: Int, y: Int, options: EtoOptions, lprect: ConstPtr<Rect>, lpstring: Pcstr, c: UInt, lpdx: ConstPtr<Int>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiExtTextOutA(hdc.rawAddress, x, y, options.toInt(), lprect.rawAddress, lpstring.rawAddress, c.toInt(), lpdx.rawAddress)

public actual fun extTextOutW(hdc: Hdc, x: Int, y: Int, options: EtoOptions, lprect: ConstPtr<Rect>, lpstring: Pcwstr, c: UInt, lpdx: ConstPtr<Int>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiExtTextOutW(hdc.rawAddress, x, y, options.toInt(), lprect.rawAddress, lpstring.rawAddress, c.toInt(), lpdx.rawAddress)

public actual fun fillPath(hdc: Hdc): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiFillPath(hdc.rawAddress)

public actual fun fillRect(hdc: Hdc, lprc: ConstPtr<Rect>, hbr: Hbrush): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiFillRect(hdc.rawAddress, lprc.rawAddress, hbr.rawAddress)

public actual fun fillRgn(hdc: Hdc, hrgn: Hrgn, hbr: Hbrush): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiFillRgn(hdc.rawAddress, hrgn.rawAddress, hbr.rawAddress)

public actual fun fixBrushOrgEx(hdc: Hdc, x: Int, y: Int, ptl: ConstPtr<Point>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiFixBrushOrgEx(hdc.rawAddress, x, y, ptl.rawAddress)

public actual fun flattenPath(hdc: Hdc): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiFlattenPath(hdc.rawAddress)

public actual fun floodFill(hdc: Hdc, x: Int, y: Int, color: Colorref): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiFloodFill(hdc.rawAddress, x, y, color.toInt())

public actual fun frameRect(hdc: Hdc, lprc: ConstPtr<Rect>, hbr: Hbrush): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiFrameRect(hdc.rawAddress, lprc.rawAddress, hbr.rawAddress)

public actual fun frameRgn(hdc: Hdc, hrgn: Hrgn, hbr: Hbrush, w: Int, h: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiFrameRgn(hdc.rawAddress, hrgn.rawAddress, hbr.rawAddress, w, h)

public actual fun gdiAlphaBlend(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, ftn: Blendfunction): Bool =
    0

public actual fun gdiComment(hdc: Hdc, nsize: UInt, lpdata: ConstPtr<UByte>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGdiComment(hdc.rawAddress, nsize.toInt(), lpdata.rawAddress)

public actual fun gdiFlush(): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGdiFlush()

public actual fun gdiGetBatchLimit(): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGdiGetBatchLimit().toUInt()

public actual fun gdiGradientFill(hdc: Hdc, pvertex: ConstPtr<Trivertex>, nvertex: UInt, pmesh: ConstPtr<CVoid>, ncount: UInt, ulmode: GradientFill): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGdiGradientFill(hdc.rawAddress, pvertex.rawAddress, nvertex.toInt(), pmesh.rawAddress, ncount.toInt(), ulmode.toInt())

public actual fun gdiSetBatchLimit(dw: UInt): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGdiSetBatchLimit(dw.toInt()).toUInt()

public actual fun gdiTransparentBlt(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: UInt): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGdiTransparentBlt(hdcdest.rawAddress, xorigindest, yorigindest, wdest, hdest, hdcsrc.rawAddress, xoriginsrc, yoriginsrc, wsrc, hsrc, crtransparent.toInt())

public actual fun getArcDirection(hdc: Hdc): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetArcDirection(hdc.rawAddress)

public actual fun getAspectRatioFilterEx(hdc: Hdc, lpsize: MutPtr<Size>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetAspectRatioFilterEx(hdc.rawAddress, lpsize.rawAddress)

public actual fun getBitmapBits(hbit: Hbitmap, cb: Int, lpvbits: MutPtr<CVoid>): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetBitmapBits(hbit.rawAddress, cb, lpvbits.rawAddress)

public actual fun getBitmapDimensionEx(hbit: Hbitmap, lpsize: MutPtr<Size>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetBitmapDimensionEx(hbit.rawAddress, lpsize.rawAddress)

public actual fun getBkColor(hdc: Hdc): Colorref =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetBkColor(hdc.rawAddress).toUInt()

public actual fun getBkMode(hdc: Hdc): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetBkMode(hdc.rawAddress)

public actual fun getBoundsRect(hdc: Hdc, lprect: MutPtr<Rect>, flags: UInt): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetBoundsRect(hdc.rawAddress, lprect.rawAddress, flags.toInt()).toUInt()

public actual fun getBrushOrgEx(hdc: Hdc, lppt: MutPtr<Point>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetBrushOrgEx(hdc.rawAddress, lppt.rawAddress)

public actual fun getCharABCWidthsA(hdc: Hdc, wfirst: UInt, wlast: UInt, lpabc: MutPtr<Abc>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetCharABCWidthsA(hdc.rawAddress, wfirst.toInt(), wlast.toInt(), lpabc.rawAddress)

public actual fun getCharABCWidthsFloatA(hdc: Hdc, ifirst: UInt, ilast: UInt, lpabc: MutPtr<Abcfloat>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetCharABCWidthsFloatA(hdc.rawAddress, ifirst.toInt(), ilast.toInt(), lpabc.rawAddress)

public actual fun getCharABCWidthsFloatW(hdc: Hdc, ifirst: UInt, ilast: UInt, lpabc: MutPtr<Abcfloat>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetCharABCWidthsFloatW(hdc.rawAddress, ifirst.toInt(), ilast.toInt(), lpabc.rawAddress)

public actual fun getCharABCWidthsI(hdc: Hdc, gifirst: UInt, cgi: UInt, pgi: ConstPtr<UShort>, pabc: MutPtr<Abc>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetCharABCWidthsI(hdc.rawAddress, gifirst.toInt(), cgi.toInt(), pgi.rawAddress, pabc.rawAddress)

public actual fun getCharABCWidthsW(hdc: Hdc, wfirst: UInt, wlast: UInt, lpabc: MutPtr<Abc>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetCharABCWidthsW(hdc.rawAddress, wfirst.toInt(), wlast.toInt(), lpabc.rawAddress)

public actual fun getCharWidth32A(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: MutPtr<Int>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetCharWidth32A(hdc.rawAddress, ifirst.toInt(), ilast.toInt(), lpbuffer.rawAddress)

public actual fun getCharWidth32W(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: MutPtr<Int>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetCharWidth32W(hdc.rawAddress, ifirst.toInt(), ilast.toInt(), lpbuffer.rawAddress)

public actual fun getCharWidthA(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: MutPtr<Int>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetCharWidthA(hdc.rawAddress, ifirst.toInt(), ilast.toInt(), lpbuffer.rawAddress)

public actual fun getCharWidthFloatA(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: MutPtr<Float>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetCharWidthFloatA(hdc.rawAddress, ifirst.toInt(), ilast.toInt(), lpbuffer.rawAddress)

public actual fun getCharWidthFloatW(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: MutPtr<Float>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetCharWidthFloatW(hdc.rawAddress, ifirst.toInt(), ilast.toInt(), lpbuffer.rawAddress)

public actual fun getCharWidthI(hdc: Hdc, gifirst: UInt, cgi: UInt, pgi: ConstPtr<UShort>, piwidths: MutPtr<Int>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetCharWidthI(hdc.rawAddress, gifirst.toInt(), cgi.toInt(), pgi.rawAddress, piwidths.rawAddress)

public actual fun getCharWidthW(hdc: Hdc, ifirst: UInt, ilast: UInt, lpbuffer: MutPtr<Int>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetCharWidthW(hdc.rawAddress, ifirst.toInt(), ilast.toInt(), lpbuffer.rawAddress)

public actual fun getCharacterPlacementA(hdc: Hdc, lpstring: Pcstr, ncount: Int, nmexextent: Int, lpresults: MutPtr<GcpResultsa>, dwflags: GetCharacterPlacementFlags): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetCharacterPlacementA(hdc.rawAddress, lpstring.rawAddress, ncount, nmexextent, lpresults.rawAddress, dwflags.toInt()).toUInt()

public actual fun getCharacterPlacementW(hdc: Hdc, lpstring: Pcwstr, ncount: Int, nmexextent: Int, lpresults: MutPtr<GcpResultsw>, dwflags: GetCharacterPlacementFlags): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetCharacterPlacementW(hdc.rawAddress, lpstring.rawAddress, ncount, nmexextent, lpresults.rawAddress, dwflags.toInt()).toUInt()

public actual fun getClipBox(hdc: Hdc, lprect: MutPtr<Rect>): GdiRegionType =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetClipBox(hdc.rawAddress, lprect.rawAddress)

public actual fun getClipRgn(hdc: Hdc, hrgn: Hrgn): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetClipRgn(hdc.rawAddress, hrgn.rawAddress)

public actual fun getColorAdjustment(hdc: Hdc, lpca: MutPtr<Coloradjustment>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetColorAdjustment(hdc.rawAddress, lpca.rawAddress)

public actual fun getCurrentObject(hdc: Hdc, type: UInt): Hgdiobj =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetCurrentObject(hdc.rawAddress, type.toInt()))

public actual fun getCurrentPositionEx(hdc: Hdc, lppt: MutPtr<Point>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetCurrentPositionEx(hdc.rawAddress, lppt.rawAddress)

public actual fun getDC(hwnd: Hwnd): Hdc =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetDC(hwnd.rawAddress))

public actual fun getDCBrushColor(hdc: Hdc): Colorref =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetDCBrushColor(hdc.rawAddress).toUInt()

public actual fun getDCEx(hwnd: Hwnd, hrgnclip: Hrgn, flags: GetDcxFlags): Hdc =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetDCEx(hwnd.rawAddress, hrgnclip.rawAddress, flags.toInt()))

public actual fun getDCOrgEx(hdc: Hdc, lppt: MutPtr<Point>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetDCOrgEx(hdc.rawAddress, lppt.rawAddress)

public actual fun getDCPenColor(hdc: Hdc): Colorref =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetDCPenColor(hdc.rawAddress).toUInt()

public actual fun getDIBColorTable(hdc: Hdc, istart: UInt, centries: UInt, prgbq: MutPtr<Rgbquad>): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetDIBColorTable(hdc.rawAddress, istart.toInt(), centries.toInt(), prgbq.rawAddress).toUInt()

public actual fun getDIBits(hdc: Hdc, hbm: Hbitmap, start: UInt, clines: UInt, lpvbits: MutPtr<CVoid>, lpbmi: MutPtr<Bitmapinfo>, usage: DibUsage): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetDIBits(hdc.rawAddress, hbm.rawAddress, start.toInt(), clines.toInt(), lpvbits.rawAddress, lpbmi.rawAddress, usage.toInt())

public actual fun getDeviceCaps(hdc: Hdc, index: Int): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetDeviceCaps(hdc.rawAddress, index)

public actual fun getEnhMetaFileA(lpname: Pcstr): Henhmetafile =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetEnhMetaFileA(lpname.rawAddress))

public actual fun getEnhMetaFileBits(hemf: Henhmetafile, nsize: UInt, lpdata: MutPtr<UByte>): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetEnhMetaFileBits(hemf.rawAddress, nsize.toInt(), lpdata.rawAddress).toUInt()

public actual fun getEnhMetaFileDescriptionA(hemf: Henhmetafile, cchbuffer: UInt, lpdescription: Pstr): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetEnhMetaFileDescriptionA(hemf.rawAddress, cchbuffer.toInt(), lpdescription.rawAddress).toUInt()

public actual fun getEnhMetaFileDescriptionW(hemf: Henhmetafile, cchbuffer: UInt, lpdescription: Pwstr): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetEnhMetaFileDescriptionW(hemf.rawAddress, cchbuffer.toInt(), lpdescription.rawAddress).toUInt()

public actual fun getEnhMetaFileHeader(hemf: Henhmetafile, nsize: UInt, lpenhmetaheader: MutPtr<Enhmetaheader>): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetEnhMetaFileHeader(hemf.rawAddress, nsize.toInt(), lpenhmetaheader.rawAddress).toUInt()

public actual fun getEnhMetaFilePaletteEntries(hemf: Henhmetafile, nnumentries: UInt, lppaletteentries: MutPtr<Paletteentry>): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetEnhMetaFilePaletteEntries(hemf.rawAddress, nnumentries.toInt(), lppaletteentries.rawAddress).toUInt()

public actual fun getEnhMetaFileW(lpname: Pcwstr): Henhmetafile =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetEnhMetaFileW(lpname.rawAddress))

public actual fun getFontData(hdc: Hdc, dwtable: UInt, dwoffset: UInt, pvbuffer: MutPtr<CVoid>, cjbuffer: UInt): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetFontData(hdc.rawAddress, dwtable.toInt(), dwoffset.toInt(), pvbuffer.rawAddress, cjbuffer.toInt()).toUInt()

public actual fun getFontLanguageInfo(hdc: Hdc): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetFontLanguageInfo(hdc.rawAddress).toUInt()

public actual fun getFontUnicodeRanges(hdc: Hdc, lpgs: MutPtr<Glyphset>): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetFontUnicodeRanges(hdc.rawAddress, lpgs.rawAddress).toUInt()

public actual fun getGlyphIndicesA(hdc: Hdc, lpstr: Pcstr, c: Int, pgi: MutPtr<UShort>, fl: UInt): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetGlyphIndicesA(hdc.rawAddress, lpstr.rawAddress, c, pgi.rawAddress, fl.toInt()).toUInt()

public actual fun getGlyphIndicesW(hdc: Hdc, lpstr: Pcwstr, c: Int, pgi: MutPtr<UShort>, fl: UInt): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetGlyphIndicesW(hdc.rawAddress, lpstr.rawAddress, c, pgi.rawAddress, fl.toInt()).toUInt()

public actual fun getGlyphOutlineA(hdc: Hdc, uchar: UInt, fuformat: GetGlyphOutlineFormat, lpgm: MutPtr<Glyphmetrics>, cjbuffer: UInt, pvbuffer: MutPtr<CVoid>, lpmat2: ConstPtr<Mat2>): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetGlyphOutlineA(hdc.rawAddress, uchar.toInt(), fuformat.toInt(), lpgm.rawAddress, cjbuffer.toInt(), pvbuffer.rawAddress, lpmat2.rawAddress).toUInt()

public actual fun getGlyphOutlineW(hdc: Hdc, uchar: UInt, fuformat: GetGlyphOutlineFormat, lpgm: MutPtr<Glyphmetrics>, cjbuffer: UInt, pvbuffer: MutPtr<CVoid>, lpmat2: ConstPtr<Mat2>): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetGlyphOutlineW(hdc.rawAddress, uchar.toInt(), fuformat.toInt(), lpgm.rawAddress, cjbuffer.toInt(), pvbuffer.rawAddress, lpmat2.rawAddress).toUInt()

public actual fun getGraphicsMode(hdc: Hdc): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetGraphicsMode(hdc.rawAddress)

public actual fun getKerningPairsA(hdc: Hdc, npairs: UInt, lpkernpair: MutPtr<Kerningpair>): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetKerningPairsA(hdc.rawAddress, npairs.toInt(), lpkernpair.rawAddress).toUInt()

public actual fun getKerningPairsW(hdc: Hdc, npairs: UInt, lpkernpair: MutPtr<Kerningpair>): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetKerningPairsW(hdc.rawAddress, npairs.toInt(), lpkernpair.rawAddress).toUInt()

public actual fun getLayout(hdc: Hdc): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetLayout(hdc.rawAddress).toUInt()

public actual fun getMapMode(hdc: Hdc): HdcMapMode =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetMapMode(hdc.rawAddress)

public actual fun getMetaFileA(lpname: Pcstr): Hmetafile =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetMetaFileA(lpname.rawAddress))

public actual fun getMetaFileBitsEx(hmf: Hmetafile, cbbuffer: UInt, lpdata: MutPtr<CVoid>): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetMetaFileBitsEx(hmf.rawAddress, cbbuffer.toInt(), lpdata.rawAddress).toUInt()

public actual fun getMetaFileW(lpname: Pcwstr): Hmetafile =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetMetaFileW(lpname.rawAddress))

public actual fun getMetaRgn(hdc: Hdc, hrgn: Hrgn): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetMetaRgn(hdc.rawAddress, hrgn.rawAddress)

public actual fun getMiterLimit(hdc: Hdc, plimit: MutPtr<Float>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetMiterLimit(hdc.rawAddress, plimit.rawAddress)

public actual fun getMonitorInfoA(hmonitor: Hmonitor, lpmi: MutPtr<Monitorinfo>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetMonitorInfoA(hmonitor.rawAddress, lpmi.rawAddress)

public actual fun getMonitorInfoW(hmonitor: Hmonitor, lpmi: MutPtr<Monitorinfo>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetMonitorInfoW(hmonitor.rawAddress, lpmi.rawAddress)

public actual fun getNearestColor(hdc: Hdc, color: Colorref): Colorref =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetNearestColor(hdc.rawAddress, color.toInt()).toUInt()

public actual fun getNearestPaletteIndex(h: Hpalette, color: Colorref): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetNearestPaletteIndex(h.rawAddress, color.toInt()).toUInt()

public actual fun getObjectA(h: Hgdiobj, c: Int, pv: MutPtr<CVoid>): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetObjectA(h.rawAddress, c, pv.rawAddress)

public actual fun getObjectType(h: Hgdiobj): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetObjectType(h.rawAddress).toUInt()

public actual fun getObjectW(h: Hgdiobj, c: Int, pv: MutPtr<CVoid>): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetObjectW(h.rawAddress, c, pv.rawAddress)

public actual fun getOutlineTextMetricsA(hdc: Hdc, cjcopy: UInt, potm: MutPtr<Outlinetextmetrica>): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetOutlineTextMetricsA(hdc.rawAddress, cjcopy.toInt(), potm.rawAddress).toUInt()

public actual fun getOutlineTextMetricsW(hdc: Hdc, cjcopy: UInt, potm: MutPtr<Outlinetextmetricw>): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetOutlineTextMetricsW(hdc.rawAddress, cjcopy.toInt(), potm.rawAddress).toUInt()

public actual fun getPaletteEntries(hpal: Hpalette, istart: UInt, centries: UInt, ppalentries: MutPtr<Paletteentry>): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetPaletteEntries(hpal.rawAddress, istart.toInt(), centries.toInt(), ppalentries.rawAddress).toUInt()

public actual fun getPath(hdc: Hdc, apt: MutPtr<Point>, aj: MutPtr<UByte>, cpt: Int): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetPath(hdc.rawAddress, apt.rawAddress, aj.rawAddress, cpt)

public actual fun getPixel(hdc: Hdc, x: Int, y: Int): Colorref =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetPixel(hdc.rawAddress, x, y).toUInt()

public actual fun getPolyFillMode(hdc: Hdc): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetPolyFillMode(hdc.rawAddress)

public actual fun getROP2(hdc: Hdc): R2Mode =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetROP2(hdc.rawAddress)

public actual fun getRandomRgn(hdc: Hdc, hrgn: Hrgn, i: Int): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetRandomRgn(hdc.rawAddress, hrgn.rawAddress, i)

public actual fun getRasterizerCaps(lpraststat: MutPtr<RasterizerStatus>, cjbytes: UInt): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetRasterizerCaps(lpraststat.rawAddress, cjbytes.toInt())

public actual fun getRegionData(hrgn: Hrgn, ncount: UInt, lprgndata: MutPtr<Rgndata>): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetRegionData(hrgn.rawAddress, ncount.toInt(), lprgndata.rawAddress).toUInt()

public actual fun getRgnBox(hrgn: Hrgn, lprc: MutPtr<Rect>): GdiRegionType =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetRgnBox(hrgn.rawAddress, lprc.rawAddress)

public actual fun getStockObject(i: GetStockObjectFlags): Hgdiobj =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetStockObject(i))

public actual fun getStretchBltMode(hdc: Hdc): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetStretchBltMode(hdc.rawAddress)

public actual fun getSysColor(nindex: SysColorIndex): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetSysColor(nindex).toUInt()

public actual fun getSysColorBrush(nindex: SysColorIndex): Hbrush =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetSysColorBrush(nindex))

public actual fun getSystemPaletteEntries(hdc: Hdc, istart: UInt, centries: UInt, ppalentries: MutPtr<Paletteentry>): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetSystemPaletteEntries(hdc.rawAddress, istart.toInt(), centries.toInt(), ppalentries.rawAddress).toUInt()

public actual fun getSystemPaletteUse(hdc: Hdc): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetSystemPaletteUse(hdc.rawAddress).toUInt()

public actual fun getTabbedTextExtentA(hdc: Hdc, lpstring: Pcstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: ConstPtr<Int>): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetTabbedTextExtentA(hdc.rawAddress, lpstring.rawAddress, chcount, ntabpositions, lpntabstoppositions.rawAddress).toUInt()

public actual fun getTabbedTextExtentW(hdc: Hdc, lpstring: Pcwstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: ConstPtr<Int>): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetTabbedTextExtentW(hdc.rawAddress, lpstring.rawAddress, chcount, ntabpositions, lpntabstoppositions.rawAddress).toUInt()

public actual fun getTextAlign(hdc: Hdc): TextAlignOptions =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetTextAlign(hdc.rawAddress).toUInt()

public actual fun getTextCharacterExtra(hdc: Hdc): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetTextCharacterExtra(hdc.rawAddress)

public actual fun getTextColor(hdc: Hdc): Colorref =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetTextColor(hdc.rawAddress).toUInt()

public actual fun getTextExtentExPointA(hdc: Hdc, lpszstring: Pcstr, cchstring: Int, nmaxextent: Int, lpnfit: MutPtr<Int>, lpndx: MutPtr<Int>, lpsize: MutPtr<Size>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetTextExtentExPointA(hdc.rawAddress, lpszstring.rawAddress, cchstring, nmaxextent, lpnfit.rawAddress, lpndx.rawAddress, lpsize.rawAddress)

public actual fun getTextExtentExPointI(hdc: Hdc, lpwszstring: ConstPtr<UShort>, cwchstring: Int, nmaxextent: Int, lpnfit: MutPtr<Int>, lpndx: MutPtr<Int>, lpsize: MutPtr<Size>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetTextExtentExPointI(hdc.rawAddress, lpwszstring.rawAddress, cwchstring, nmaxextent, lpnfit.rawAddress, lpndx.rawAddress, lpsize.rawAddress)

public actual fun getTextExtentExPointW(hdc: Hdc, lpszstring: Pcwstr, cchstring: Int, nmaxextent: Int, lpnfit: MutPtr<Int>, lpndx: MutPtr<Int>, lpsize: MutPtr<Size>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetTextExtentExPointW(hdc.rawAddress, lpszstring.rawAddress, cchstring, nmaxextent, lpnfit.rawAddress, lpndx.rawAddress, lpsize.rawAddress)

public actual fun getTextExtentPoint32A(hdc: Hdc, lpstring: Pcstr, c: Int, psizl: MutPtr<Size>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetTextExtentPoint32A(hdc.rawAddress, lpstring.rawAddress, c, psizl.rawAddress)

public actual fun getTextExtentPoint32W(hdc: Hdc, lpstring: Pcwstr, c: Int, psizl: MutPtr<Size>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetTextExtentPoint32W(hdc.rawAddress, lpstring.rawAddress, c, psizl.rawAddress)

public actual fun getTextExtentPointA(hdc: Hdc, lpstring: Pcstr, c: Int, lpsz: MutPtr<Size>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetTextExtentPointA(hdc.rawAddress, lpstring.rawAddress, c, lpsz.rawAddress)

public actual fun getTextExtentPointI(hdc: Hdc, pgiin: ConstPtr<UShort>, cgi: Int, psize: MutPtr<Size>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetTextExtentPointI(hdc.rawAddress, pgiin.rawAddress, cgi, psize.rawAddress)

public actual fun getTextExtentPointW(hdc: Hdc, lpstring: Pcwstr, c: Int, lpsz: MutPtr<Size>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetTextExtentPointW(hdc.rawAddress, lpstring.rawAddress, c, lpsz.rawAddress)

public actual fun getTextFaceA(hdc: Hdc, c: Int, lpname: Pstr): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetTextFaceA(hdc.rawAddress, c, lpname.rawAddress)

public actual fun getTextFaceW(hdc: Hdc, c: Int, lpname: Pwstr): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetTextFaceW(hdc.rawAddress, c, lpname.rawAddress)

public actual fun getTextMetricsA(hdc: Hdc, lptm: MutPtr<Textmetrica>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetTextMetricsA(hdc.rawAddress, lptm.rawAddress)

public actual fun getTextMetricsW(hdc: Hdc, lptm: MutPtr<Textmetricw>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetTextMetricsW(hdc.rawAddress, lptm.rawAddress)

public actual fun getUpdateRect(hwnd: Hwnd, lprect: MutPtr<Rect>, berase: Bool): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetUpdateRect(hwnd.rawAddress, lprect.rawAddress, berase)

public actual fun getUpdateRgn(hwnd: Hwnd, hrgn: Hrgn, berase: Bool): GdiRegionType =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetUpdateRgn(hwnd.rawAddress, hrgn.rawAddress, berase)

public actual fun getViewportExtEx(hdc: Hdc, lpsize: MutPtr<Size>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetViewportExtEx(hdc.rawAddress, lpsize.rawAddress)

public actual fun getViewportOrgEx(hdc: Hdc, lppoint: MutPtr<Point>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetViewportOrgEx(hdc.rawAddress, lppoint.rawAddress)

public actual fun getWinMetaFileBits(hemf: Henhmetafile, cbdata16: UInt, pdata16: MutPtr<UByte>, imapmode: Int, hdcref: Hdc): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetWinMetaFileBits(hemf.rawAddress, cbdata16.toInt(), pdata16.rawAddress, imapmode, hdcref.rawAddress).toUInt()

public actual fun getWindowDC(hwnd: Hwnd): Hdc =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetWindowDC(hwnd.rawAddress))

public actual fun getWindowExtEx(hdc: Hdc, lpsize: MutPtr<Size>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetWindowExtEx(hdc.rawAddress, lpsize.rawAddress)

public actual fun getWindowOrgEx(hdc: Hdc, lppoint: MutPtr<Point>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetWindowOrgEx(hdc.rawAddress, lppoint.rawAddress)

public actual fun getWindowRgn(hwnd: Hwnd, hrgn: Hrgn): GdiRegionType =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetWindowRgn(hwnd.rawAddress, hrgn.rawAddress)

public actual fun getWindowRgnBox(hwnd: Hwnd, lprc: MutPtr<Rect>): GdiRegionType =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetWindowRgnBox(hwnd.rawAddress, lprc.rawAddress)

public actual fun getWorldTransform(hdc: Hdc, lpxf: MutPtr<Xform>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGetWorldTransform(hdc.rawAddress, lpxf.rawAddress)

public actual fun gradientFill(hdc: Hdc, pvertex: ConstPtr<Trivertex>, nvertex: UInt, pmesh: ConstPtr<CVoid>, nmesh: UInt, ulmode: GradientFill): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGradientFill(hdc.rawAddress, pvertex.rawAddress, nvertex.toInt(), pmesh.rawAddress, nmesh.toInt(), ulmode.toInt())

public actual fun grayStringA(hdc: Hdc, hbrush: Hbrush, lpoutputfunc: Graystringproc, lpdata: Lparam, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGrayStringA(hdc.rawAddress, hbrush.rawAddress, 0L, lpdata, ncount, x, y, nwidth, nheight)

public actual fun grayStringW(hdc: Hdc, hbrush: Hbrush, lpoutputfunc: Graystringproc, lpdata: Lparam, ncount: Int, x: Int, y: Int, nwidth: Int, nheight: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiGrayStringW(hdc.rawAddress, hbrush.rawAddress, 0L, lpdata, ncount, x, y, nwidth, nheight)

public actual fun inflateRect(lprc: MutPtr<Rect>, dx: Int, dy: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiInflateRect(lprc.rawAddress, dx, dy)

public actual fun intersectClipRect(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): GdiRegionType =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiIntersectClipRect(hdc.rawAddress, left, top, right, bottom)

public actual fun intersectRect(lprcdst: MutPtr<Rect>, lprcsrc1: ConstPtr<Rect>, lprcsrc2: ConstPtr<Rect>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiIntersectRect(lprcdst.rawAddress, lprcsrc1.rawAddress, lprcsrc2.rawAddress)

public actual fun invalidateRect(hwnd: Hwnd, lprect: ConstPtr<Rect>, berase: Bool): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiInvalidateRect(hwnd.rawAddress, lprect.rawAddress, berase)

public actual fun invalidateRgn(hwnd: Hwnd, hrgn: Hrgn, berase: Bool): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiInvalidateRgn(hwnd.rawAddress, hrgn.rawAddress, berase)

public actual fun invertRect(hdc: Hdc, lprc: ConstPtr<Rect>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiInvertRect(hdc.rawAddress, lprc.rawAddress)

public actual fun invertRgn(hdc: Hdc, hrgn: Hrgn): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiInvertRgn(hdc.rawAddress, hrgn.rawAddress)

public actual fun isRectEmpty(lprc: ConstPtr<Rect>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiIsRectEmpty(lprc.rawAddress)

public actual fun lPtoDP(hdc: Hdc, lppt: MutPtr<Point>, c: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiLPtoDP(hdc.rawAddress, lppt.rawAddress, c)

public actual fun lineDDA(xstart: Int, ystart: Int, xend: Int, yend: Int, lpproc: Lineddaproc, data: Lparam): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiLineDDA(xstart, ystart, xend, yend, 0L, data)

public actual fun lineTo(hdc: Hdc, x: Int, y: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiLineTo(hdc.rawAddress, x, y)

public actual fun loadBitmapA(hinstance: Hinstance, lpbitmapname: Pcstr): Hbitmap =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiLoadBitmapA(hinstance.rawAddress, lpbitmapname.rawAddress))

public actual fun loadBitmapW(hinstance: Hinstance, lpbitmapname: Pcwstr): Hbitmap =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiLoadBitmapW(hinstance.rawAddress, lpbitmapname.rawAddress))

public actual fun lockWindowUpdate(hwndlock: Hwnd): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiLockWindowUpdate(hwndlock.rawAddress)

public actual fun mapWindowPoints(hwndfrom: Hwnd, hwndto: Hwnd, lppoints: MutPtr<Point>, cpoints: UInt): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiMapWindowPoints(hwndfrom.rawAddress, hwndto.rawAddress, lppoints.rawAddress, cpoints.toInt())

public actual fun maskBlt(hdcdest: Hdc, xdest: Int, ydest: Int, width: Int, height: Int, hdcsrc: Hdc, xsrc: Int, ysrc: Int, hbmmask: Hbitmap, xmask: Int, ymask: Int, rop: UInt): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiMaskBlt(hdcdest.rawAddress, xdest, ydest, width, height, hdcsrc.rawAddress, xsrc, ysrc, hbmmask.rawAddress, xmask, ymask, rop.toInt())

public actual fun mergeFontPackage(puchmergefontbuffer: ConstPtr<UByte>, ulmergefontbuffersize: UInt, puchfontpackagebuffer: ConstPtr<UByte>, ulfontpackagebuffersize: UInt, ppuchdestbuffer: MutPtr<MutPtr<UByte>>, puldestbuffersize: MutPtr<UInt>, pulbyteswritten: MutPtr<UInt>, usmode: UShort, lpfnallocate: CfpAllocproc, lpfnreallocate: CfpReallocproc, lpfnfree: CfpFreeproc, lpvreserved: MutPtr<CVoid>): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiMergeFontPackage(puchmergefontbuffer.rawAddress, ulmergefontbuffersize.toInt(), puchfontpackagebuffer.rawAddress, ulfontpackagebuffersize.toInt(), ppuchdestbuffer.rawAddress, puldestbuffersize.rawAddress, pulbyteswritten.rawAddress, usmode.toShort(), 0L, 0L, 0L, lpvreserved.rawAddress).toUInt()

public actual fun modifyWorldTransform(hdc: Hdc, lpxf: ConstPtr<Xform>, mode: ModifyWorldTransformMode): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiModifyWorldTransform(hdc.rawAddress, lpxf.rawAddress, mode.toInt())

public actual fun monitorFromPoint(pt: Point, dwflags: MonitorFromFlags): Hmonitor =
    MutPtr(0L)

public actual fun monitorFromRect(lprc: ConstPtr<Rect>, dwflags: MonitorFromFlags): Hmonitor =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiMonitorFromRect(lprc.rawAddress, dwflags.toInt()))

public actual fun monitorFromWindow(hwnd: Hwnd, dwflags: MonitorFromFlags): Hmonitor =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiMonitorFromWindow(hwnd.rawAddress, dwflags.toInt()))

public actual fun moveToEx(hdc: Hdc, x: Int, y: Int, lppt: MutPtr<Point>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiMoveToEx(hdc.rawAddress, x, y, lppt.rawAddress)

public actual fun offsetClipRgn(hdc: Hdc, x: Int, y: Int): GdiRegionType =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiOffsetClipRgn(hdc.rawAddress, x, y)

public actual fun offsetRect(lprc: MutPtr<Rect>, dx: Int, dy: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiOffsetRect(lprc.rawAddress, dx, dy)

public actual fun offsetRgn(hrgn: Hrgn, x: Int, y: Int): GdiRegionType =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiOffsetRgn(hrgn.rawAddress, x, y)

public actual fun offsetViewportOrgEx(hdc: Hdc, x: Int, y: Int, lppt: MutPtr<Point>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiOffsetViewportOrgEx(hdc.rawAddress, x, y, lppt.rawAddress)

public actual fun offsetWindowOrgEx(hdc: Hdc, x: Int, y: Int, lppt: MutPtr<Point>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiOffsetWindowOrgEx(hdc.rawAddress, x, y, lppt.rawAddress)

public actual fun paintDesktop(hdc: Hdc): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiPaintDesktop(hdc.rawAddress)

public actual fun paintRgn(hdc: Hdc, hrgn: Hrgn): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiPaintRgn(hdc.rawAddress, hrgn.rawAddress)

public actual fun patBlt(hdc: Hdc, x: Int, y: Int, w: Int, h: Int, rop: RopCode): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiPatBlt(hdc.rawAddress, x, y, w, h, rop.toInt())

public actual fun pathToRegion(hdc: Hdc): Hrgn =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiPathToRegion(hdc.rawAddress))

public actual fun pie(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int, xr1: Int, yr1: Int, xr2: Int, yr2: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiPie(hdc.rawAddress, left, top, right, bottom, xr1, yr1, xr2, yr2)

public actual fun playEnhMetaFile(hdc: Hdc, hmf: Henhmetafile, lprect: ConstPtr<Rect>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiPlayEnhMetaFile(hdc.rawAddress, hmf.rawAddress, lprect.rawAddress)

public actual fun playEnhMetaFileRecord(hdc: Hdc, pht: ConstPtr<Handletable>, pmr: ConstPtr<Enhmetarecord>, cht: UInt): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiPlayEnhMetaFileRecord(hdc.rawAddress, pht.rawAddress, pmr.rawAddress, cht.toInt())

public actual fun playMetaFile(hdc: Hdc, hmf: Hmetafile): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiPlayMetaFile(hdc.rawAddress, hmf.rawAddress)

public actual fun playMetaFileRecord(hdc: Hdc, lphandletable: ConstPtr<Handletable>, lpmr: ConstPtr<Metarecord>, noobjs: UInt): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiPlayMetaFileRecord(hdc.rawAddress, lphandletable.rawAddress, lpmr.rawAddress, noobjs.toInt())

public actual fun plgBlt(hdcdest: Hdc, lppoint: ConstPtr<Point>, hdcsrc: Hdc, xsrc: Int, ysrc: Int, width: Int, height: Int, hbmmask: Hbitmap, xmask: Int, ymask: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiPlgBlt(hdcdest.rawAddress, lppoint.rawAddress, hdcsrc.rawAddress, xsrc, ysrc, width, height, hbmmask.rawAddress, xmask, ymask)

public actual fun polyBezier(hdc: Hdc, apt: ConstPtr<Point>, cpt: UInt): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiPolyBezier(hdc.rawAddress, apt.rawAddress, cpt.toInt())

public actual fun polyBezierTo(hdc: Hdc, apt: ConstPtr<Point>, cpt: UInt): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiPolyBezierTo(hdc.rawAddress, apt.rawAddress, cpt.toInt())

public actual fun polyDraw(hdc: Hdc, apt: ConstPtr<Point>, aj: ConstPtr<UByte>, cpt: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiPolyDraw(hdc.rawAddress, apt.rawAddress, aj.rawAddress, cpt)

public actual fun polyPolygon(hdc: Hdc, apt: ConstPtr<Point>, asz: ConstPtr<Int>, csz: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiPolyPolygon(hdc.rawAddress, apt.rawAddress, asz.rawAddress, csz)

public actual fun polyPolyline(hdc: Hdc, apt: ConstPtr<Point>, asz: ConstPtr<UInt>, csz: UInt): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiPolyPolyline(hdc.rawAddress, apt.rawAddress, asz.rawAddress, csz.toInt())

public actual fun polyTextOutA(hdc: Hdc, ppt: ConstPtr<Polytexta>, nstrings: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiPolyTextOutA(hdc.rawAddress, ppt.rawAddress, nstrings)

public actual fun polyTextOutW(hdc: Hdc, ppt: ConstPtr<Polytextw>, nstrings: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiPolyTextOutW(hdc.rawAddress, ppt.rawAddress, nstrings)

public actual fun polygon(hdc: Hdc, apt: ConstPtr<Point>, cpt: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiPolygon(hdc.rawAddress, apt.rawAddress, cpt)

public actual fun polyline(hdc: Hdc, apt: ConstPtr<Point>, cpt: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiPolyline(hdc.rawAddress, apt.rawAddress, cpt)

public actual fun polylineTo(hdc: Hdc, apt: ConstPtr<Point>, cpt: UInt): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiPolylineTo(hdc.rawAddress, apt.rawAddress, cpt.toInt())

public actual fun ptInRect(lprc: ConstPtr<Rect>, pt: Point): Bool =
    0

public actual fun ptInRegion(hrgn: Hrgn, x: Int, y: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiPtInRegion(hrgn.rawAddress, x, y)

public actual fun ptVisible(hdc: Hdc, x: Int, y: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiPtVisible(hdc.rawAddress, x, y)

public actual fun realizePalette(hdc: Hdc): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiRealizePalette(hdc.rawAddress).toUInt()

public actual fun rectInRegion(hrgn: Hrgn, lprect: ConstPtr<Rect>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiRectInRegion(hrgn.rawAddress, lprect.rawAddress)

public actual fun rectVisible(hdc: Hdc, lprect: ConstPtr<Rect>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiRectVisible(hdc.rawAddress, lprect.rawAddress)

public actual fun rectangle(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiRectangle(hdc.rawAddress, left, top, right, bottom)

public actual fun redrawWindow(hwnd: Hwnd, lprcupdate: ConstPtr<Rect>, hrgnupdate: Hrgn, flags: RedrawWindowFlags): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiRedrawWindow(hwnd.rawAddress, lprcupdate.rawAddress, hrgnupdate.rawAddress, flags.toInt())

public actual fun releaseDC(hwnd: Hwnd, hdc: Hdc): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiReleaseDC(hwnd.rawAddress, hdc.rawAddress)

public actual fun removeFontMemResourceEx(h: Handle): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiRemoveFontMemResourceEx(h.rawAddress)

public actual fun removeFontResourceA(lpfilename: Pcstr): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiRemoveFontResourceA(lpfilename.rawAddress)

public actual fun removeFontResourceExA(name: Pcstr, fl: UInt, pdv: ConstPtr<CVoid>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiRemoveFontResourceExA(name.rawAddress, fl.toInt(), pdv.rawAddress)

public actual fun removeFontResourceExW(name: Pcwstr, fl: UInt, pdv: ConstPtr<CVoid>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiRemoveFontResourceExW(name.rawAddress, fl.toInt(), pdv.rawAddress)

public actual fun removeFontResourceW(lpfilename: Pcwstr): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiRemoveFontResourceW(lpfilename.rawAddress)

public actual fun resetDCA(hdc: Hdc, lpdm: ConstPtr<Devmodea>): Hdc =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiResetDCA(hdc.rawAddress, lpdm.rawAddress))

public actual fun resetDCW(hdc: Hdc, lpdm: ConstPtr<Devmodew>): Hdc =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiResetDCW(hdc.rawAddress, lpdm.rawAddress))

public actual fun resizePalette(hpal: Hpalette, n: UInt): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiResizePalette(hpal.rawAddress, n.toInt())

public actual fun restoreDC(hdc: Hdc, nsaveddc: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiRestoreDC(hdc.rawAddress, nsaveddc)

public actual fun roundRect(hdc: Hdc, left: Int, top: Int, right: Int, bottom: Int, width: Int, height: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiRoundRect(hdc.rawAddress, left, top, right, bottom, width, height)

public actual fun saveDC(hdc: Hdc): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSaveDC(hdc.rawAddress)

public actual fun scaleViewportExtEx(hdc: Hdc, xn: Int, dx: Int, yn: Int, yd: Int, lpsz: MutPtr<Size>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiScaleViewportExtEx(hdc.rawAddress, xn, dx, yn, yd, lpsz.rawAddress)

public actual fun scaleWindowExtEx(hdc: Hdc, xn: Int, xd: Int, yn: Int, yd: Int, lpsz: MutPtr<Size>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiScaleWindowExtEx(hdc.rawAddress, xn, xd, yn, yd, lpsz.rawAddress)

public actual fun screenToClient(hwnd: Hwnd, lppoint: MutPtr<Point>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiScreenToClient(hwnd.rawAddress, lppoint.rawAddress)

public actual fun selectClipPath(hdc: Hdc, mode: RgnCombineMode): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSelectClipPath(hdc.rawAddress, mode)

public actual fun selectClipRgn(hdc: Hdc, hrgn: Hrgn): GdiRegionType =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSelectClipRgn(hdc.rawAddress, hrgn.rawAddress)

public actual fun selectObject(hdc: Hdc, h: Hgdiobj): Hgdiobj =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSelectObject(hdc.rawAddress, h.rawAddress))

public actual fun selectPalette(hdc: Hdc, hpal: Hpalette, bforcebkgd: Bool): Hpalette =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSelectPalette(hdc.rawAddress, hpal.rawAddress, bforcebkgd))

public actual fun setArcDirection(hdc: Hdc, dir: ArcDirection): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetArcDirection(hdc.rawAddress, dir)

public actual fun setBitmapBits(hbm: Hbitmap, cb: UInt, pvbits: ConstPtr<CVoid>): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetBitmapBits(hbm.rawAddress, cb.toInt(), pvbits.rawAddress)

public actual fun setBitmapDimensionEx(hbm: Hbitmap, w: Int, h: Int, lpsz: MutPtr<Size>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetBitmapDimensionEx(hbm.rawAddress, w, h, lpsz.rawAddress)

public actual fun setBkColor(hdc: Hdc, color: Colorref): Colorref =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetBkColor(hdc.rawAddress, color.toInt()).toUInt()

public actual fun setBkMode(hdc: Hdc, mode: Int): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetBkMode(hdc.rawAddress, mode)

public actual fun setBoundsRect(hdc: Hdc, lprect: ConstPtr<Rect>, flags: SetBoundsRectFlags): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetBoundsRect(hdc.rawAddress, lprect.rawAddress, flags.toInt()).toUInt()

public actual fun setBrushOrgEx(hdc: Hdc, x: Int, y: Int, lppt: MutPtr<Point>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetBrushOrgEx(hdc.rawAddress, x, y, lppt.rawAddress)

public actual fun setColorAdjustment(hdc: Hdc, lpca: ConstPtr<Coloradjustment>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetColorAdjustment(hdc.rawAddress, lpca.rawAddress)

public actual fun setDCBrushColor(hdc: Hdc, color: Colorref): Colorref =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetDCBrushColor(hdc.rawAddress, color.toInt()).toUInt()

public actual fun setDCPenColor(hdc: Hdc, color: Colorref): Colorref =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetDCPenColor(hdc.rawAddress, color.toInt()).toUInt()

public actual fun setDIBColorTable(hdc: Hdc, istart: UInt, centries: UInt, prgbq: ConstPtr<Rgbquad>): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetDIBColorTable(hdc.rawAddress, istart.toInt(), centries.toInt(), prgbq.rawAddress).toUInt()

public actual fun setDIBits(hdc: Hdc, hbm: Hbitmap, start: UInt, clines: UInt, lpbits: ConstPtr<CVoid>, lpbmi: ConstPtr<Bitmapinfo>, coloruse: DibUsage): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetDIBits(hdc.rawAddress, hbm.rawAddress, start.toInt(), clines.toInt(), lpbits.rawAddress, lpbmi.rawAddress, coloruse.toInt())

public actual fun setDIBitsToDevice(hdc: Hdc, xdest: Int, ydest: Int, w: UInt, h: UInt, xsrc: Int, ysrc: Int, startscan: UInt, clines: UInt, lpvbits: ConstPtr<CVoid>, lpbmi: ConstPtr<Bitmapinfo>, coloruse: DibUsage): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetDIBitsToDevice(hdc.rawAddress, xdest, ydest, w.toInt(), h.toInt(), xsrc, ysrc, startscan.toInt(), clines.toInt(), lpvbits.rawAddress, lpbmi.rawAddress, coloruse.toInt())

public actual fun setEnhMetaFileBits(nsize: UInt, pb: ConstPtr<UByte>): Henhmetafile =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetEnhMetaFileBits(nsize.toInt(), pb.rawAddress))

public actual fun setGraphicsMode(hdc: Hdc, imode: GraphicsMode): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetGraphicsMode(hdc.rawAddress, imode)

public actual fun setLayout(hdc: Hdc, l: DcLayout): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetLayout(hdc.rawAddress, l.toInt()).toUInt()

public actual fun setMapMode(hdc: Hdc, imode: HdcMapMode): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetMapMode(hdc.rawAddress, imode)

public actual fun setMapperFlags(hdc: Hdc, flags: UInt): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetMapperFlags(hdc.rawAddress, flags.toInt()).toUInt()

public actual fun setMetaFileBitsEx(cbbuffer: UInt, lpdata: ConstPtr<UByte>): Hmetafile =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetMetaFileBitsEx(cbbuffer.toInt(), lpdata.rawAddress))

public actual fun setMetaRgn(hdc: Hdc): GdiRegionType =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetMetaRgn(hdc.rawAddress)

public actual fun setMiterLimit(hdc: Hdc, limit: Float, old: MutPtr<Float>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetMiterLimit(hdc.rawAddress, limit, old.rawAddress)

public actual fun setPaletteEntries(hpal: Hpalette, istart: UInt, centries: UInt, ppalentries: ConstPtr<Paletteentry>): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetPaletteEntries(hpal.rawAddress, istart.toInt(), centries.toInt(), ppalentries.rawAddress).toUInt()

public actual fun setPixel(hdc: Hdc, x: Int, y: Int, color: Colorref): Colorref =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetPixel(hdc.rawAddress, x, y, color.toInt()).toUInt()

public actual fun setPixelV(hdc: Hdc, x: Int, y: Int, color: Colorref): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetPixelV(hdc.rawAddress, x, y, color.toInt())

public actual fun setPolyFillMode(hdc: Hdc, mode: CreatePolygonRgnMode): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetPolyFillMode(hdc.rawAddress, mode)

public actual fun setROP2(hdc: Hdc, rop2: R2Mode): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetROP2(hdc.rawAddress, rop2)

public actual fun setRect(lprc: MutPtr<Rect>, xleft: Int, ytop: Int, xright: Int, ybottom: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetRect(lprc.rawAddress, xleft, ytop, xright, ybottom)

public actual fun setRectEmpty(lprc: MutPtr<Rect>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetRectEmpty(lprc.rawAddress)

public actual fun setRectRgn(hrgn: Hrgn, left: Int, top: Int, right: Int, bottom: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetRectRgn(hrgn.rawAddress, left, top, right, bottom)

public actual fun setStretchBltMode(hdc: Hdc, mode: StretchBltMode): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetStretchBltMode(hdc.rawAddress, mode)

public actual fun setSysColors(celements: Int, lpaelements: ConstPtr<Int>, lpargbvalues: ConstPtr<Colorref>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetSysColors(celements, lpaelements.rawAddress, lpargbvalues.rawAddress)

public actual fun setSystemPaletteUse(hdc: Hdc, use: SystemPaletteUse): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetSystemPaletteUse(hdc.rawAddress, use.toInt()).toUInt()

public actual fun setTextAlign(hdc: Hdc, align: TextAlignOptions): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetTextAlign(hdc.rawAddress, align.toInt()).toUInt()

public actual fun setTextCharacterExtra(hdc: Hdc, extra: Int): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetTextCharacterExtra(hdc.rawAddress, extra)

public actual fun setTextColor(hdc: Hdc, color: Colorref): Colorref =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetTextColor(hdc.rawAddress, color.toInt()).toUInt()

public actual fun setTextJustification(hdc: Hdc, extra: Int, count: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetTextJustification(hdc.rawAddress, extra, count)

public actual fun setViewportExtEx(hdc: Hdc, x: Int, y: Int, lpsz: MutPtr<Size>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetViewportExtEx(hdc.rawAddress, x, y, lpsz.rawAddress)

public actual fun setViewportOrgEx(hdc: Hdc, x: Int, y: Int, lppt: MutPtr<Point>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetViewportOrgEx(hdc.rawAddress, x, y, lppt.rawAddress)

public actual fun setWindowExtEx(hdc: Hdc, x: Int, y: Int, lpsz: MutPtr<Size>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetWindowExtEx(hdc.rawAddress, x, y, lpsz.rawAddress)

public actual fun setWindowOrgEx(hdc: Hdc, x: Int, y: Int, lppt: MutPtr<Point>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetWindowOrgEx(hdc.rawAddress, x, y, lppt.rawAddress)

public actual fun setWindowRgn(hwnd: Hwnd, hrgn: Hrgn, bredraw: Bool): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetWindowRgn(hwnd.rawAddress, hrgn.rawAddress, bredraw)

public actual fun setWorldTransform(hdc: Hdc, lpxf: ConstPtr<Xform>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSetWorldTransform(hdc.rawAddress, lpxf.rawAddress)

public actual fun stretchBlt(hdcdest: Hdc, xdest: Int, ydest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xsrc: Int, ysrc: Int, wsrc: Int, hsrc: Int, rop: RopCode): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiStretchBlt(hdcdest.rawAddress, xdest, ydest, wdest, hdest, hdcsrc.rawAddress, xsrc, ysrc, wsrc, hsrc, rop.toInt())

public actual fun stretchDIBits(hdc: Hdc, xdest: Int, ydest: Int, destwidth: Int, destheight: Int, xsrc: Int, ysrc: Int, srcwidth: Int, srcheight: Int, lpbits: ConstPtr<CVoid>, lpbmi: ConstPtr<Bitmapinfo>, iusage: DibUsage, rop: RopCode): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiStretchDIBits(hdc.rawAddress, xdest, ydest, destwidth, destheight, xsrc, ysrc, srcwidth, srcheight, lpbits.rawAddress, lpbmi.rawAddress, iusage.toInt(), rop.toInt())

public actual fun strokeAndFillPath(hdc: Hdc): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiStrokeAndFillPath(hdc.rawAddress)

public actual fun strokePath(hdc: Hdc): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiStrokePath(hdc.rawAddress)

public actual fun subtractRect(lprcdst: MutPtr<Rect>, lprcsrc1: ConstPtr<Rect>, lprcsrc2: ConstPtr<Rect>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiSubtractRect(lprcdst.rawAddress, lprcsrc1.rawAddress, lprcsrc2.rawAddress)

public actual fun tTCharToUnicode(hdc: Hdc, puccharcodes: ConstPtr<UByte>, ulcharcodesize: UInt, pusshortcodes: MutPtr<UShort>, ulshortcodesize: UInt, ulflags: UInt): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiTTCharToUnicode(hdc.rawAddress, puccharcodes.rawAddress, ulcharcodesize.toInt(), pusshortcodes.rawAddress, ulshortcodesize.toInt(), ulflags.toInt())

public actual fun tTDeleteEmbeddedFont(hfontreference: Handle, ulflags: UInt, pulstatus: MutPtr<UInt>): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiTTDeleteEmbeddedFont(hfontreference.rawAddress, ulflags.toInt(), pulstatus.rawAddress)

public actual fun tTEmbedFont(hdc: Hdc, ulflags: TtembedFlags, ulcharset: EmbedFontCharset, pulprivstatus: MutPtr<EmbeddedFontPrivStatus>, pulstatus: MutPtr<UInt>, lpfnwritetostream: Writeembedproc, lpvwritestream: ConstPtr<CVoid>, puscharcodeset: ConstPtr<UShort>, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: ConstPtr<Ttembedinfo>): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiTTEmbedFont(hdc.rawAddress, ulflags.toInt(), ulcharset.toInt(), pulprivstatus.rawAddress, pulstatus.rawAddress, 0L, lpvwritestream.rawAddress, puscharcodeset.rawAddress, uscharcodecount.toShort(), uslanguage.toShort(), pttembedinfo.rawAddress)

public actual fun tTEmbedFontEx(hdc: Hdc, ulflags: TtembedFlags, ulcharset: EmbedFontCharset, pulprivstatus: MutPtr<EmbeddedFontPrivStatus>, pulstatus: MutPtr<UInt>, lpfnwritetostream: Writeembedproc, lpvwritestream: ConstPtr<CVoid>, pulcharcodeset: ConstPtr<UInt>, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: ConstPtr<Ttembedinfo>): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiTTEmbedFontEx(hdc.rawAddress, ulflags.toInt(), ulcharset.toInt(), pulprivstatus.rawAddress, pulstatus.rawAddress, 0L, lpvwritestream.rawAddress, pulcharcodeset.rawAddress, uscharcodecount.toShort(), uslanguage.toShort(), pttembedinfo.rawAddress)

public actual fun tTEmbedFontFromFileA(hdc: Hdc, szfontfilename: Pcstr, usttcindex: UShort, ulflags: TtembedFlags, ulcharset: EmbedFontCharset, pulprivstatus: MutPtr<EmbeddedFontPrivStatus>, pulstatus: MutPtr<UInt>, lpfnwritetostream: Writeembedproc, lpvwritestream: ConstPtr<CVoid>, puscharcodeset: ConstPtr<UShort>, uscharcodecount: UShort, uslanguage: UShort, pttembedinfo: ConstPtr<Ttembedinfo>): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiTTEmbedFontFromFileA(hdc.rawAddress, szfontfilename.rawAddress, usttcindex.toShort(), ulflags.toInt(), ulcharset.toInt(), pulprivstatus.rawAddress, pulstatus.rawAddress, 0L, lpvwritestream.rawAddress, puscharcodeset.rawAddress, uscharcodecount.toShort(), uslanguage.toShort(), pttembedinfo.rawAddress)

public actual fun tTEnableEmbeddingForFacename(lpszfacename: Pcstr, benable: Bool): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiTTEnableEmbeddingForFacename(lpszfacename.rawAddress, benable)

public actual fun tTGetEmbeddedFontInfo(ulflags: TtembedFlags, pulprivstatus: MutPtr<UInt>, ulprivs: FontLicensePrivs, pulstatus: MutPtr<UInt>, lpfnreadfromstream: Readembedproc, lpvreadstream: ConstPtr<CVoid>, pttloadinfo: ConstPtr<Ttloadinfo>): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiTTGetEmbeddedFontInfo(ulflags.toInt(), pulprivstatus.rawAddress, ulprivs.toInt(), pulstatus.rawAddress, 0L, lpvreadstream.rawAddress, pttloadinfo.rawAddress)

public actual fun tTGetEmbeddingType(hdc: Hdc, pulembedtype: MutPtr<EmbeddedFontPrivStatus>): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiTTGetEmbeddingType(hdc.rawAddress, pulembedtype.rawAddress)

public actual fun tTGetNewFontName(phfontreference: ConstPtr<Handle>, wzwinfamilyname: Pwstr, cchmaxwinname: Int, szmacfamilyname: Pstr, cchmaxmacname: Int): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiTTGetNewFontName(phfontreference.rawAddress, wzwinfamilyname.rawAddress, cchmaxwinname, szmacfamilyname.rawAddress, cchmaxmacname)

public actual fun tTIsEmbeddingEnabled(hdc: Hdc, pbenabled: MutPtr<Bool>): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiTTIsEmbeddingEnabled(hdc.rawAddress, pbenabled.rawAddress)

public actual fun tTIsEmbeddingEnabledForFacename(lpszfacename: Pcstr, pbenabled: MutPtr<Bool>): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiTTIsEmbeddingEnabledForFacename(lpszfacename.rawAddress, pbenabled.rawAddress)

public actual fun tTLoadEmbeddedFont(phfontreference: MutPtr<Handle>, ulflags: UInt, pulprivstatus: MutPtr<EmbeddedFontPrivStatus>, ulprivs: FontLicensePrivs, pulstatus: MutPtr<TtloadEmbeddedFontStatus>, lpfnreadfromstream: Readembedproc, lpvreadstream: ConstPtr<CVoid>, szwinfamilyname: Pcwstr, szmacfamilyname: Pcstr, pttloadinfo: ConstPtr<Ttloadinfo>): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiTTLoadEmbeddedFont(phfontreference.rawAddress, ulflags.toInt(), pulprivstatus.rawAddress, ulprivs.toInt(), pulstatus.rawAddress, 0L, lpvreadstream.rawAddress, szwinfamilyname.rawAddress, szmacfamilyname.rawAddress, pttloadinfo.rawAddress)

public actual fun tTRunValidationTests(hdc: Hdc, ptestparam: ConstPtr<Ttvalidationtestsparams>): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiTTRunValidationTests(hdc.rawAddress, ptestparam.rawAddress)

public actual fun tTRunValidationTestsEx(hdc: Hdc, ptestparam: ConstPtr<Ttvalidationtestsparamsex>): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiTTRunValidationTestsEx(hdc.rawAddress, ptestparam.rawAddress)

public actual fun tabbedTextOutA(hdc: Hdc, x: Int, y: Int, lpstring: Pcstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: ConstPtr<Int>, ntaborigin: Int): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiTabbedTextOutA(hdc.rawAddress, x, y, lpstring.rawAddress, chcount, ntabpositions, lpntabstoppositions.rawAddress, ntaborigin)

public actual fun tabbedTextOutW(hdc: Hdc, x: Int, y: Int, lpstring: Pcwstr, chcount: Int, ntabpositions: Int, lpntabstoppositions: ConstPtr<Int>, ntaborigin: Int): Int =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiTabbedTextOutW(hdc.rawAddress, x, y, lpstring.rawAddress, chcount, ntabpositions, lpntabstoppositions.rawAddress, ntaborigin)

public actual fun textOutA(hdc: Hdc, x: Int, y: Int, lpstring: Pcstr, c: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiTextOutA(hdc.rawAddress, x, y, lpstring.rawAddress, c)

public actual fun textOutW(hdc: Hdc, x: Int, y: Int, lpstring: Pcwstr, c: Int): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiTextOutW(hdc.rawAddress, x, y, lpstring.rawAddress, c)

public actual fun transparentBlt(hdcdest: Hdc, xorigindest: Int, yorigindest: Int, wdest: Int, hdest: Int, hdcsrc: Hdc, xoriginsrc: Int, yoriginsrc: Int, wsrc: Int, hsrc: Int, crtransparent: UInt): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiTransparentBlt(hdcdest.rawAddress, xorigindest, yorigindest, wdest, hdest, hdcsrc.rawAddress, xoriginsrc, yoriginsrc, wsrc, hsrc, crtransparent.toInt())

public actual fun unionRect(lprcdst: MutPtr<Rect>, lprcsrc1: ConstPtr<Rect>, lprcsrc2: ConstPtr<Rect>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiUnionRect(lprcdst.rawAddress, lprcsrc1.rawAddress, lprcsrc2.rawAddress)

public actual fun unrealizeObject(h: Hgdiobj): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiUnrealizeObject(h.rawAddress)

public actual fun updateColors(hdc: Hdc): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiUpdateColors(hdc.rawAddress)

public actual fun updateWindow(hwnd: Hwnd): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiUpdateWindow(hwnd.rawAddress)

public actual fun validateRect(hwnd: Hwnd, lprect: ConstPtr<Rect>): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiValidateRect(hwnd.rawAddress, lprect.rawAddress)

public actual fun validateRgn(hwnd: Hwnd, hrgn: Hrgn): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiValidateRgn(hwnd.rawAddress, hrgn.rawAddress)

public actual fun widenPath(hdc: Hdc): Bool =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiWidenPath(hdc.rawAddress)

public actual fun windowFromDC(hdc: Hdc): Hwnd =
    MutPtr(WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiWindowFromDC(hdc.rawAddress))

public actual fun wglSwapMultipleBuffers(param0: UInt, param1: ConstPtr<Wglswap>): UInt =
    WindowsWin32GraphicsGdiJniBridge.windowssysWindowsWin32GraphicsGdiWglSwapMultipleBuffers(param0.toInt(), param1.rawAddress).toUInt()
