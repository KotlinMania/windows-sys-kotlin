@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.display

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.SIZE
import io.github.kotlinmania.windowssys.windows.win32.foundation.WIN32_ERROR
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HBITMAP
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HMONITOR
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HPALETTE

private val _windowsWin32DevicesDisplayNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun BRUSHOBJ_hGetColorTransform(pbo: Long): HANDLE =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_BRUSHOBJ_hGetColorTransform(pbo.toString()) as String).toLong() else 0L

public actual fun BRUSHOBJ_pvAllocRbrush(pbo: Long, cj: UInt): Long =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_BRUSHOBJ_pvAllocRbrush(pbo.toString(), cj.toInt()) as String).toLong() else 0L

public actual fun BRUSHOBJ_pvGetRbrush(pbo: Long): Long =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_BRUSHOBJ_pvGetRbrush(pbo.toString()) as String).toLong() else 0L

public actual fun BRUSHOBJ_ulGetBrushColor(pbo: Long): UInt =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_BRUSHOBJ_ulGetBrushColor(pbo.toString()) as Int).toUInt() else 0u

public actual fun CLIPOBJ_bEnum(pco: Long, cj: UInt, pul: Long): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_CLIPOBJ_bEnum(pco.toString(), cj.toInt(), pul.toString()) as Int) else 0

public actual fun CLIPOBJ_cEnumStart(pco: Long, ball: BOOL, itype: UInt, idirection: UInt, climit: UInt): UInt =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_CLIPOBJ_cEnumStart(pco.toString(), ball, itype.toInt(), idirection.toInt(), climit.toInt()) as Int).toUInt() else 0u

public actual fun CLIPOBJ_ppoGetPath(pco: Long): Long =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_CLIPOBJ_ppoGetPath(pco.toString()) as String).toLong() else 0L

public actual fun CapabilitiesRequestAndCapabilitiesReply(hmonitor: HANDLE, pszasciicapabilitiesstring: PSTR, dwcapabilitiesstringlengthincharacters: UInt): Int =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_CapabilitiesRequestAndCapabilitiesReply(hmonitor.toString(), pszasciicapabilitiesstring.toString(), dwcapabilitiesstringlengthincharacters.toInt()) as Int) else 0

public actual fun DegaussMonitor(hmonitor: HANDLE): Int =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_DegaussMonitor(hmonitor.toString()) as Int) else 0

public actual fun DestroyPhysicalMonitor(hmonitor: HANDLE): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_DestroyPhysicalMonitor(hmonitor.toString()) as Int) else 0

public actual fun DestroyPhysicalMonitors(dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: Long): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_DestroyPhysicalMonitors(dwphysicalmonitorarraysize.toInt(), pphysicalmonitorarray.toString()) as Int) else 0

public actual fun DisplayConfigGetDeviceInfo(requestpacket: Long): Int =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_DisplayConfigGetDeviceInfo(requestpacket.toString()) as Int) else 0

public actual fun DisplayConfigSetDeviceInfo(setpacket: Long): Int =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_DisplayConfigSetDeviceInfo(setpacket.toString()) as Int) else 0

public actual fun EngAcquireSemaphore(hsem: HSEMAPHORE) {
    if (_windowsWin32DevicesDisplayNapiAddon != null) {
        _windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngAcquireSemaphore(hsem.toString())
    }
}

public actual fun EngAlphaBlend(psodest: Long, psosrc: Long, pco: Long, pxlo: Long, prcldest: Long, prclsrc: Long, pblendobj: Long): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngAlphaBlend(psodest.toString(), psosrc.toString(), pco.toString(), pxlo.toString(), prcldest.toString(), prclsrc.toString(), pblendobj.toString()) as Int) else 0

public actual fun EngAssociateSurface(hsurf: HSURF, hdev: HDEV, flhooks: UInt): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngAssociateSurface(hsurf.toString(), hdev.toString(), flhooks.toInt()) as Int) else 0

public actual fun EngBitBlt(psotrg: Long, psosrc: Long, psomask: Long, pco: Long, pxlo: Long, prcltrg: Long, pptlsrc: Long, pptlmask: Long, pbo: Long, pptlbrush: Long, rop4: UInt): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngBitBlt(psotrg.toString(), psosrc.toString(), psomask.toString(), pco.toString(), pxlo.toString(), prcltrg.toString(), pptlsrc.toString(), pptlmask.toString(), pbo.toString(), pptlbrush.toString(), rop4.toInt()) as Int) else 0

public actual fun EngCheckAbort(pso: Long): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngCheckAbort(pso.toString()) as Int) else 0

public actual fun EngComputeGlyphSet(ncodepage: Int, nfirstchar: Int, cchars: Int): Long =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngComputeGlyphSet(ncodepage, nfirstchar, cchars) as String).toLong() else 0L

public actual fun EngCopyBits(psodest: Long, psosrc: Long, pco: Long, pxlo: Long, prcldest: Long, pptlsrc: Long): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngCopyBits(psodest.toString(), psosrc.toString(), pco.toString(), pxlo.toString(), prcldest.toString(), pptlsrc.toString()) as Int) else 0

public actual fun EngCreateBitmap(sizl: SIZE, lwidth: Int, iformat: UInt, fl: UInt, pvbits: Long): HBITMAP =
    0L

public actual fun EngCreateClip(): Long =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngCreateClip() as String).toLong() else 0L

public actual fun EngCreateDeviceBitmap(dhsurf: DHSURF, sizl: SIZE, iformatcompat: UInt): HBITMAP =
    0L

public actual fun EngCreateDeviceSurface(dhsurf: DHSURF, sizl: SIZE, iformatcompat: UInt): HSURF =
    0L

public actual fun EngCreatePalette(imode: UInt, ccolors: UInt, pulcolors: Long, flred: UInt, flgreen: UInt, flblue: UInt): HPALETTE =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngCreatePalette(imode.toInt(), ccolors.toInt(), pulcolors.toString(), flred.toInt(), flgreen.toInt(), flblue.toInt()) as String).toLong() else 0L

public actual fun EngCreateSemaphore(): HSEMAPHORE =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngCreateSemaphore() as String).toLong() else 0L

public actual fun EngDeleteClip(pco: Long) {
    if (_windowsWin32DevicesDisplayNapiAddon != null) {
        _windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngDeleteClip(pco.toString())
    }
}

public actual fun EngDeletePalette(hpal: HPALETTE): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngDeletePalette(hpal.toString()) as Int) else 0

public actual fun EngDeletePath(ppo: Long) {
    if (_windowsWin32DevicesDisplayNapiAddon != null) {
        _windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngDeletePath(ppo.toString())
    }
}

public actual fun EngDeleteSemaphore(hsem: HSEMAPHORE) {
    if (_windowsWin32DevicesDisplayNapiAddon != null) {
        _windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngDeleteSemaphore(hsem.toString())
    }
}

public actual fun EngDeleteSurface(hsurf: HSURF): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngDeleteSurface(hsurf.toString()) as Int) else 0

public actual fun EngEraseSurface(pso: Long, prcl: Long, icolor: UInt): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngEraseSurface(pso.toString(), prcl.toString(), icolor.toInt()) as Int) else 0

public actual fun EngFillPath(pso: Long, ppo: Long, pco: Long, pbo: Long, pptlbrushorg: Long, mix: UInt, floptions: UInt): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngFillPath(pso.toString(), ppo.toString(), pco.toString(), pbo.toString(), pptlbrushorg.toString(), mix.toInt(), floptions.toInt()) as Int) else 0

public actual fun EngFindResource(h: HANDLE, iname: Int, itype: Int, pulsize: Long): Long =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngFindResource(h.toString(), iname, itype, pulsize.toString()) as String).toLong() else 0L

public actual fun EngFreeModule(h: HANDLE) {
    if (_windowsWin32DevicesDisplayNapiAddon != null) {
        _windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngFreeModule(h.toString())
    }
}

public actual fun EngGetCurrentCodePage(oemcodepage: Long, ansicodepage: Long) {
    if (_windowsWin32DevicesDisplayNapiAddon != null) {
        _windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngGetCurrentCodePage(oemcodepage.toString(), ansicodepage.toString())
    }
}

public actual fun EngGetDriverName(hdev: HDEV): PWSTR =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngGetDriverName(hdev.toString()) as String).toLong() else 0L

public actual fun EngGetPrinterDataFileName(hdev: HDEV): PWSTR =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngGetPrinterDataFileName(hdev.toString()) as String).toLong() else 0L

public actual fun EngGradientFill(psodest: Long, pco: Long, pxlo: Long, pvertex: Long, nvertex: UInt, pmesh: Long, nmesh: UInt, prclextents: Long, pptlditherorg: Long, ulmode: UInt): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngGradientFill(psodest.toString(), pco.toString(), pxlo.toString(), pvertex.toString(), nvertex.toInt(), pmesh.toString(), nmesh.toInt(), prclextents.toString(), pptlditherorg.toString(), ulmode.toInt()) as Int) else 0

public actual fun EngLineTo(pso: Long, pco: Long, pbo: Long, x1: Int, y1: Int, x2: Int, y2: Int, prclbounds: Long, mix: UInt): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngLineTo(pso.toString(), pco.toString(), pbo.toString(), x1, y1, x2, y2, prclbounds.toString(), mix.toInt()) as Int) else 0

public actual fun EngLoadModule(pwsz: PCWSTR): HANDLE =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngLoadModule(pwsz.toString()) as String).toLong() else 0L

public actual fun EngLockSurface(hsurf: HSURF): Long =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngLockSurface(hsurf.toString()) as String).toLong() else 0L

public actual fun EngMarkBandingSurface(hsurf: HSURF): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngMarkBandingSurface(hsurf.toString()) as Int) else 0

public actual fun EngMultiByteToUnicodeN(unicodestring: PWSTR, maxbytesinunicodestring: UInt, bytesinunicodestring: Long, multibytestring: PCSTR, bytesinmultibytestring: UInt) {
    if (_windowsWin32DevicesDisplayNapiAddon != null) {
        _windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngMultiByteToUnicodeN(unicodestring.toString(), maxbytesinunicodestring.toInt(), bytesinunicodestring.toString(), multibytestring.toString(), bytesinmultibytestring.toInt())
    }
}

public actual fun EngMultiByteToWideChar(codepage: UInt, widecharstring: PWSTR, bytesinwidecharstring: Int, multibytestring: PCSTR, bytesinmultibytestring: Int): Int =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngMultiByteToWideChar(codepage.toInt(), widecharstring.toString(), bytesinwidecharstring, multibytestring.toString(), bytesinmultibytestring) as Int) else 0

public actual fun EngPaint(pso: Long, pco: Long, pbo: Long, pptlbrushorg: Long, mix: UInt): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngPaint(pso.toString(), pco.toString(), pbo.toString(), pptlbrushorg.toString(), mix.toInt()) as Int) else 0

public actual fun EngPlgBlt(psotrg: Long, psosrc: Long, psomsk: Long, pco: Long, pxlo: Long, pca: Long, pptlbrushorg: Long, pptfx: Long, prcl: Long, pptl: Long, imode: UInt): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngPlgBlt(psotrg.toString(), psosrc.toString(), psomsk.toString(), pco.toString(), pxlo.toString(), pca.toString(), pptlbrushorg.toString(), pptfx.toString(), prcl.toString(), pptl.toString(), imode.toInt()) as Int) else 0

public actual fun EngQueryEMFInfo(hdev: HDEV, pemfinfo: Long): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngQueryEMFInfo(hdev.toString(), pemfinfo.toString()) as Int) else 0

public actual fun EngQueryLocalTime(param0: Long) {
    if (_windowsWin32DevicesDisplayNapiAddon != null) {
        _windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngQueryLocalTime(param0.toString())
    }
}

public actual fun EngReleaseSemaphore(hsem: HSEMAPHORE) {
    if (_windowsWin32DevicesDisplayNapiAddon != null) {
        _windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngReleaseSemaphore(hsem.toString())
    }
}

public actual fun EngStretchBlt(psodest: Long, psosrc: Long, psomask: Long, pco: Long, pxlo: Long, pca: Long, pptlhtorg: Long, prcldest: Long, prclsrc: Long, pptlmask: Long, imode: UInt): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngStretchBlt(psodest.toString(), psosrc.toString(), psomask.toString(), pco.toString(), pxlo.toString(), pca.toString(), pptlhtorg.toString(), prcldest.toString(), prclsrc.toString(), pptlmask.toString(), imode.toInt()) as Int) else 0

public actual fun EngStretchBltROP(psodest: Long, psosrc: Long, psomask: Long, pco: Long, pxlo: Long, pca: Long, pptlhtorg: Long, prcldest: Long, prclsrc: Long, pptlmask: Long, imode: UInt, pbo: Long, rop4: UInt): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngStretchBltROP(psodest.toString(), psosrc.toString(), psomask.toString(), pco.toString(), pxlo.toString(), pca.toString(), pptlhtorg.toString(), prcldest.toString(), prclsrc.toString(), pptlmask.toString(), imode.toInt(), pbo.toString(), rop4.toInt()) as Int) else 0

public actual fun EngStrokeAndFillPath(pso: Long, ppo: Long, pco: Long, pxo: Long, pbostroke: Long, plineattrs: Long, pbofill: Long, pptlbrushorg: Long, mixfill: UInt, floptions: UInt): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngStrokeAndFillPath(pso.toString(), ppo.toString(), pco.toString(), pxo.toString(), pbostroke.toString(), plineattrs.toString(), pbofill.toString(), pptlbrushorg.toString(), mixfill.toInt(), floptions.toInt()) as Int) else 0

public actual fun EngStrokePath(pso: Long, ppo: Long, pco: Long, pxo: Long, pbo: Long, pptlbrushorg: Long, plineattrs: Long, mix: UInt): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngStrokePath(pso.toString(), ppo.toString(), pco.toString(), pxo.toString(), pbo.toString(), pptlbrushorg.toString(), plineattrs.toString(), mix.toInt()) as Int) else 0

public actual fun EngTextOut(pso: Long, pstro: Long, pfo: Long, pco: Long, prclextra: Long, prclopaque: Long, pbofore: Long, pboopaque: Long, pptlorg: Long, mix: UInt): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngTextOut(pso.toString(), pstro.toString(), pfo.toString(), pco.toString(), prclextra.toString(), prclopaque.toString(), pbofore.toString(), pboopaque.toString(), pptlorg.toString(), mix.toInt()) as Int) else 0

public actual fun EngTransparentBlt(psodst: Long, psosrc: Long, pco: Long, pxlo: Long, prcldst: Long, prclsrc: Long, transcolor: UInt, bcalledfrombitblt: UInt): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngTransparentBlt(psodst.toString(), psosrc.toString(), pco.toString(), pxlo.toString(), prcldst.toString(), prclsrc.toString(), transcolor.toInt(), bcalledfrombitblt.toInt()) as Int) else 0

public actual fun EngUnicodeToMultiByteN(multibytestring: PSTR, maxbytesinmultibytestring: UInt, bytesinmultibytestring: Long, unicodestring: PCWSTR, bytesinunicodestring: UInt) {
    if (_windowsWin32DevicesDisplayNapiAddon != null) {
        _windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngUnicodeToMultiByteN(multibytestring.toString(), maxbytesinmultibytestring.toInt(), bytesinmultibytestring.toString(), unicodestring.toString(), bytesinunicodestring.toInt())
    }
}

public actual fun EngUnlockSurface(pso: Long) {
    if (_windowsWin32DevicesDisplayNapiAddon != null) {
        _windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngUnlockSurface(pso.toString())
    }
}

public actual fun EngWideCharToMultiByte(codepage: UInt, widecharstring: PCWSTR, bytesinwidecharstring: Int, multibytestring: PSTR, bytesinmultibytestring: Int): Int =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_EngWideCharToMultiByte(codepage.toInt(), widecharstring.toString(), bytesinwidecharstring, multibytestring.toString(), bytesinmultibytestring) as Int) else 0

public actual fun FONTOBJ_cGetAllGlyphHandles(pfo: Long, phg: Long): UInt =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_FONTOBJ_cGetAllGlyphHandles(pfo.toString(), phg.toString()) as Int).toUInt() else 0u

public actual fun FONTOBJ_cGetGlyphs(pfo: Long, imode: UInt, cglyph: UInt, phg: Long, ppvglyph: Long): UInt =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_FONTOBJ_cGetGlyphs(pfo.toString(), imode.toInt(), cglyph.toInt(), phg.toString(), ppvglyph.toString()) as Int).toUInt() else 0u

public actual fun FONTOBJ_pQueryGlyphAttrs(pfo: Long, imode: UInt): Long =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_FONTOBJ_pQueryGlyphAttrs(pfo.toString(), imode.toInt()) as String).toLong() else 0L

public actual fun FONTOBJ_pfdg(pfo: Long): Long =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_FONTOBJ_pfdg(pfo.toString()) as String).toLong() else 0L

public actual fun FONTOBJ_pifi(pfo: Long): Long =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_FONTOBJ_pifi(pfo.toString()) as String).toLong() else 0L

public actual fun FONTOBJ_pvTrueTypeFontFile(pfo: Long, pcjfile: Long): Long =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_FONTOBJ_pvTrueTypeFontFile(pfo.toString(), pcjfile.toString()) as String).toLong() else 0L

public actual fun FONTOBJ_pxoGetXform(pfo: Long): Long =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_FONTOBJ_pxoGetXform(pfo.toString()) as String).toLong() else 0L

public actual fun FONTOBJ_vGetInfo(pfo: Long, cjsize: UInt, pfi: Long) {
    if (_windowsWin32DevicesDisplayNapiAddon != null) {
        _windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_FONTOBJ_vGetInfo(pfo.toString(), cjsize.toInt(), pfi.toString())
    }
}

public actual fun GetAutoRotationState(pstate: Long): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_GetAutoRotationState(pstate.toString()) as Int) else 0

public actual fun GetCapabilitiesStringLength(hmonitor: HANDLE, pdwcapabilitiesstringlengthincharacters: Long): Int =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_GetCapabilitiesStringLength(hmonitor.toString(), pdwcapabilitiesstringlengthincharacters.toString()) as Int) else 0

public actual fun GetDisplayAutoRotationPreferences(porientation: Long): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_GetDisplayAutoRotationPreferences(porientation.toString()) as Int) else 0

public actual fun GetDisplayConfigBufferSizes(flags: QUERY_DISPLAY_CONFIG_FLAGS, numpatharrayelements: Long, nummodeinfoarrayelements: Long): WIN32_ERROR =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_GetDisplayConfigBufferSizes(flags.toInt(), numpatharrayelements.toString(), nummodeinfoarrayelements.toString()) as Int).toUInt() else 0u

public actual fun GetMonitorBrightness(hmonitor: HANDLE, pdwminimumbrightness: Long, pdwcurrentbrightness: Long, pdwmaximumbrightness: Long): Int =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_GetMonitorBrightness(hmonitor.toString(), pdwminimumbrightness.toString(), pdwcurrentbrightness.toString(), pdwmaximumbrightness.toString()) as Int) else 0

public actual fun GetMonitorCapabilities(hmonitor: HANDLE, pdwmonitorcapabilities: Long, pdwsupportedcolortemperatures: Long): Int =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_GetMonitorCapabilities(hmonitor.toString(), pdwmonitorcapabilities.toString(), pdwsupportedcolortemperatures.toString()) as Int) else 0

public actual fun GetMonitorColorTemperature(hmonitor: HANDLE, pctcurrentcolortemperature: Long): Int =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_GetMonitorColorTemperature(hmonitor.toString(), pctcurrentcolortemperature.toString()) as Int) else 0

public actual fun GetMonitorContrast(hmonitor: HANDLE, pdwminimumcontrast: Long, pdwcurrentcontrast: Long, pdwmaximumcontrast: Long): Int =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_GetMonitorContrast(hmonitor.toString(), pdwminimumcontrast.toString(), pdwcurrentcontrast.toString(), pdwmaximumcontrast.toString()) as Int) else 0

public actual fun GetMonitorDisplayAreaPosition(hmonitor: HANDLE, ptpositiontype: MC_POSITION_TYPE, pdwminimumposition: Long, pdwcurrentposition: Long, pdwmaximumposition: Long): Int =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_GetMonitorDisplayAreaPosition(hmonitor.toString(), ptpositiontype, pdwminimumposition.toString(), pdwcurrentposition.toString(), pdwmaximumposition.toString()) as Int) else 0

public actual fun GetMonitorDisplayAreaSize(hmonitor: HANDLE, stsizetype: MC_SIZE_TYPE, pdwminimumwidthorheight: Long, pdwcurrentwidthorheight: Long, pdwmaximumwidthorheight: Long): Int =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_GetMonitorDisplayAreaSize(hmonitor.toString(), stsizetype, pdwminimumwidthorheight.toString(), pdwcurrentwidthorheight.toString(), pdwmaximumwidthorheight.toString()) as Int) else 0

public actual fun GetMonitorRedGreenOrBlueDrive(hmonitor: HANDLE, dtdrivetype: MC_DRIVE_TYPE, pdwminimumdrive: Long, pdwcurrentdrive: Long, pdwmaximumdrive: Long): Int =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_GetMonitorRedGreenOrBlueDrive(hmonitor.toString(), dtdrivetype, pdwminimumdrive.toString(), pdwcurrentdrive.toString(), pdwmaximumdrive.toString()) as Int) else 0

public actual fun GetMonitorRedGreenOrBlueGain(hmonitor: HANDLE, gtgaintype: MC_GAIN_TYPE, pdwminimumgain: Long, pdwcurrentgain: Long, pdwmaximumgain: Long): Int =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_GetMonitorRedGreenOrBlueGain(hmonitor.toString(), gtgaintype, pdwminimumgain.toString(), pdwcurrentgain.toString(), pdwmaximumgain.toString()) as Int) else 0

public actual fun GetMonitorTechnologyType(hmonitor: HANDLE, pdtydisplaytechnologytype: Long): Int =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_GetMonitorTechnologyType(hmonitor.toString(), pdtydisplaytechnologytype.toString()) as Int) else 0

public actual fun GetNumberOfPhysicalMonitorsFromHMONITOR(hmonitor: HMONITOR, pdwnumberofphysicalmonitors: Long): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_GetNumberOfPhysicalMonitorsFromHMONITOR(hmonitor.toString(), pdwnumberofphysicalmonitors.toString()) as Int) else 0

public actual fun GetPhysicalMonitorsFromHMONITOR(hmonitor: HMONITOR, dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: Long): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_GetPhysicalMonitorsFromHMONITOR(hmonitor.toString(), dwphysicalmonitorarraysize.toInt(), pphysicalmonitorarray.toString()) as Int) else 0

public actual fun GetTimingReport(hmonitor: HANDLE, pmtrmonitortimingreport: Long): Int =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_GetTimingReport(hmonitor.toString(), pmtrmonitortimingreport.toString()) as Int) else 0

public actual fun GetVCPFeatureAndVCPFeatureReply(hmonitor: HANDLE, bvcpcode: UByte, pvct: Long, pdwcurrentvalue: Long, pdwmaximumvalue: Long): Int =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_GetVCPFeatureAndVCPFeatureReply(hmonitor.toString(), bvcpcode.toInt(), pvct.toString(), pdwcurrentvalue.toString(), pdwmaximumvalue.toString()) as Int) else 0

public actual fun HT_Get8BPPFormatPalette(ppaletteentry: Long, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_HT_Get8BPPFormatPalette(ppaletteentry.toString(), redgamma.toInt(), greengamma.toInt(), bluegamma.toInt()) as Int) else 0

public actual fun HT_Get8BPPMaskPalette(ppaletteentry: Long, use8bppmaskpal: BOOL, cmymask: UByte, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_HT_Get8BPPMaskPalette(ppaletteentry.toString(), use8bppmaskpal, cmymask.toInt(), redgamma.toInt(), greengamma.toInt(), bluegamma.toInt()) as Int) else 0

public actual fun PATHOBJ_bEnum(ppo: Long, ppd: Long): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_PATHOBJ_bEnum(ppo.toString(), ppd.toString()) as Int) else 0

public actual fun PATHOBJ_bEnumClipLines(ppo: Long, cb: UInt, pcl: Long): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_PATHOBJ_bEnumClipLines(ppo.toString(), cb.toInt(), pcl.toString()) as Int) else 0

public actual fun PATHOBJ_vEnumStart(ppo: Long) {
    if (_windowsWin32DevicesDisplayNapiAddon != null) {
        _windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_PATHOBJ_vEnumStart(ppo.toString())
    }
}

public actual fun PATHOBJ_vEnumStartClipLines(ppo: Long, pco: Long, pso: Long, pla: Long) {
    if (_windowsWin32DevicesDisplayNapiAddon != null) {
        _windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_PATHOBJ_vEnumStartClipLines(ppo.toString(), pco.toString(), pso.toString(), pla.toString())
    }
}

public actual fun PATHOBJ_vGetBounds(ppo: Long, prectfx: Long) {
    if (_windowsWin32DevicesDisplayNapiAddon != null) {
        _windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_PATHOBJ_vGetBounds(ppo.toString(), prectfx.toString())
    }
}

public actual fun QueryDisplayConfig(flags: QUERY_DISPLAY_CONFIG_FLAGS, numpatharrayelements: Long, patharray: Long, nummodeinfoarrayelements: Long, modeinfoarray: Long, currenttopologyid: Long): WIN32_ERROR =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_QueryDisplayConfig(flags.toInt(), numpatharrayelements.toString(), patharray.toString(), nummodeinfoarrayelements.toString(), modeinfoarray.toString(), currenttopologyid.toString()) as Int).toUInt() else 0u

public actual fun RestoreMonitorFactoryColorDefaults(hmonitor: HANDLE): Int =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_RestoreMonitorFactoryColorDefaults(hmonitor.toString()) as Int) else 0

public actual fun RestoreMonitorFactoryDefaults(hmonitor: HANDLE): Int =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_RestoreMonitorFactoryDefaults(hmonitor.toString()) as Int) else 0

public actual fun STROBJ_bEnum(pstro: Long, pc: Long, ppgpos: Long): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_STROBJ_bEnum(pstro.toString(), pc.toString(), ppgpos.toString()) as Int) else 0

public actual fun STROBJ_bEnumPositionsOnly(pstro: Long, pc: Long, ppgpos: Long): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_STROBJ_bEnumPositionsOnly(pstro.toString(), pc.toString(), ppgpos.toString()) as Int) else 0

public actual fun STROBJ_bGetAdvanceWidths(pso: Long, ifirst: UInt, c: UInt, pptqd: Long): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_STROBJ_bGetAdvanceWidths(pso.toString(), ifirst.toInt(), c.toInt(), pptqd.toString()) as Int) else 0

public actual fun STROBJ_dwGetCodePage(pstro: Long): UInt =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_STROBJ_dwGetCodePage(pstro.toString()) as Int).toUInt() else 0u

public actual fun STROBJ_vEnumStart(pstro: Long) {
    if (_windowsWin32DevicesDisplayNapiAddon != null) {
        _windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_STROBJ_vEnumStart(pstro.toString())
    }
}

public actual fun SaveCurrentMonitorSettings(hmonitor: HANDLE): Int =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_SaveCurrentMonitorSettings(hmonitor.toString()) as Int) else 0

public actual fun SaveCurrentSettings(hmonitor: HANDLE): Int =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_SaveCurrentSettings(hmonitor.toString()) as Int) else 0

public actual fun SetDisplayAutoRotationPreferences(orientation: ORIENTATION_PREFERENCE): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_SetDisplayAutoRotationPreferences(orientation) as Int) else 0

public actual fun SetDisplayConfig(numpatharrayelements: UInt, patharray: Long, nummodeinfoarrayelements: UInt, modeinfoarray: Long, flags: SET_DISPLAY_CONFIG_FLAGS): Int =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_SetDisplayConfig(numpatharrayelements.toInt(), patharray.toString(), nummodeinfoarrayelements.toInt(), modeinfoarray.toString(), flags.toInt()) as Int) else 0

public actual fun SetMonitorBrightness(hmonitor: HANDLE, dwnewbrightness: UInt): Int =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_SetMonitorBrightness(hmonitor.toString(), dwnewbrightness.toInt()) as Int) else 0

public actual fun SetMonitorColorTemperature(hmonitor: HANDLE, ctcurrentcolortemperature: MC_COLOR_TEMPERATURE): Int =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_SetMonitorColorTemperature(hmonitor.toString(), ctcurrentcolortemperature) as Int) else 0

public actual fun SetMonitorContrast(hmonitor: HANDLE, dwnewcontrast: UInt): Int =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_SetMonitorContrast(hmonitor.toString(), dwnewcontrast.toInt()) as Int) else 0

public actual fun SetMonitorDisplayAreaPosition(hmonitor: HANDLE, ptpositiontype: MC_POSITION_TYPE, dwnewposition: UInt): Int =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_SetMonitorDisplayAreaPosition(hmonitor.toString(), ptpositiontype, dwnewposition.toInt()) as Int) else 0

public actual fun SetMonitorDisplayAreaSize(hmonitor: HANDLE, stsizetype: MC_SIZE_TYPE, dwnewdisplayareawidthorheight: UInt): Int =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_SetMonitorDisplayAreaSize(hmonitor.toString(), stsizetype, dwnewdisplayareawidthorheight.toInt()) as Int) else 0

public actual fun SetMonitorRedGreenOrBlueDrive(hmonitor: HANDLE, dtdrivetype: MC_DRIVE_TYPE, dwnewdrive: UInt): Int =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_SetMonitorRedGreenOrBlueDrive(hmonitor.toString(), dtdrivetype, dwnewdrive.toInt()) as Int) else 0

public actual fun SetMonitorRedGreenOrBlueGain(hmonitor: HANDLE, gtgaintype: MC_GAIN_TYPE, dwnewgain: UInt): Int =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_SetMonitorRedGreenOrBlueGain(hmonitor.toString(), gtgaintype, dwnewgain.toInt()) as Int) else 0

public actual fun SetVCPFeature(hmonitor: HANDLE, bvcpcode: UByte, dwnewvalue: UInt): Int =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_SetVCPFeature(hmonitor.toString(), bvcpcode.toInt(), dwnewvalue.toInt()) as Int) else 0

public actual fun XFORMOBJ_bApplyXform(pxo: Long, imode: UInt, cpoints: UInt, pvin: Long, pvout: Long): BOOL =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_XFORMOBJ_bApplyXform(pxo.toString(), imode.toInt(), cpoints.toInt(), pvin.toString(), pvout.toString()) as Int) else 0

public actual fun XFORMOBJ_iGetXform(pxo: Long, pxform: Long): UInt =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_XFORMOBJ_iGetXform(pxo.toString(), pxform.toString()) as Int).toUInt() else 0u

public actual fun XLATEOBJ_cGetPalette(pxlo: Long, ipal: UInt, cpal: UInt, ppal: Long): UInt =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_XLATEOBJ_cGetPalette(pxlo.toString(), ipal.toInt(), cpal.toInt(), ppal.toString()) as Int).toUInt() else 0u

public actual fun XLATEOBJ_hGetColorTransform(pxlo: Long): HANDLE =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_XLATEOBJ_hGetColorTransform(pxlo.toString()) as String).toLong() else 0L

public actual fun XLATEOBJ_iXlate(pxlo: Long, icolor: UInt): UInt =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_XLATEOBJ_iXlate(pxlo.toString(), icolor.toInt()) as Int).toUInt() else 0u

public actual fun XLATEOBJ_piVector(pxlo: Long): Long =
    if (_windowsWin32DevicesDisplayNapiAddon != null) (_windowsWin32DevicesDisplayNapiAddon.windowssys_windows_win32_devices_display_XLATEOBJ_piVector(pxlo.toString()) as String).toLong() else 0L
