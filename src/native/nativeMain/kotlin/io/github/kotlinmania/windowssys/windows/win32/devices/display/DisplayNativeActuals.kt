@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun BRUSHOBJ_hGetColorTransform(pbo: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_BRUSHOBJ_hGetColorTransform(pbo.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun BRUSHOBJ_pvAllocRbrush(pbo: Long, cj: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_BRUSHOBJ_pvAllocRbrush(pbo.toCPointer<ByteVar>(), cj)?.toLong() ?: 0L

public actual fun BRUSHOBJ_pvGetRbrush(pbo: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_BRUSHOBJ_pvGetRbrush(pbo.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun BRUSHOBJ_ulGetBrushColor(pbo: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_BRUSHOBJ_ulGetBrushColor(pbo.toCPointer<ByteVar>())

public actual fun CLIPOBJ_bEnum(pco: Long, cj: UInt, pul: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_CLIPOBJ_bEnum(pco.toCPointer<ByteVar>(), cj, pul.toCPointer<ByteVar>())

public actual fun CLIPOBJ_cEnumStart(pco: Long, ball: BOOL, itype: UInt, idirection: UInt, climit: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_CLIPOBJ_cEnumStart(pco.toCPointer<ByteVar>(), ball, itype, idirection, climit)

public actual fun CLIPOBJ_ppoGetPath(pco: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_CLIPOBJ_ppoGetPath(pco.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun CapabilitiesRequestAndCapabilitiesReply(hmonitor: HANDLE, pszasciicapabilitiesstring: PSTR, dwcapabilitiesstringlengthincharacters: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_CapabilitiesRequestAndCapabilitiesReply(hmonitor.toCPointer<ByteVar>(), pszasciicapabilitiesstring.toCPointer<ByteVar>(), dwcapabilitiesstringlengthincharacters)

public actual fun DegaussMonitor(hmonitor: HANDLE): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_DegaussMonitor(hmonitor.toCPointer<ByteVar>())

public actual fun DestroyPhysicalMonitor(hmonitor: HANDLE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_DestroyPhysicalMonitor(hmonitor.toCPointer<ByteVar>())

public actual fun DestroyPhysicalMonitors(dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_DestroyPhysicalMonitors(dwphysicalmonitorarraysize, pphysicalmonitorarray.toCPointer<ByteVar>())

public actual fun DisplayConfigGetDeviceInfo(requestpacket: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_DisplayConfigGetDeviceInfo(requestpacket.toCPointer<ByteVar>())

public actual fun DisplayConfigSetDeviceInfo(setpacket: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_DisplayConfigSetDeviceInfo(setpacket.toCPointer<ByteVar>())

public actual fun EngAcquireSemaphore(hsem: HSEMAPHORE) {
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngAcquireSemaphore(hsem.toCPointer<ByteVar>())
}

public actual fun EngAlphaBlend(psodest: Long, psosrc: Long, pco: Long, pxlo: Long, prcldest: Long, prclsrc: Long, pblendobj: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngAlphaBlend(psodest.toCPointer<ByteVar>(), psosrc.toCPointer<ByteVar>(), pco.toCPointer<ByteVar>(), pxlo.toCPointer<ByteVar>(), prcldest.toCPointer<ByteVar>(), prclsrc.toCPointer<ByteVar>(), pblendobj.toCPointer<ByteVar>())

public actual fun EngAssociateSurface(hsurf: HSURF, hdev: HDEV, flhooks: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngAssociateSurface(hsurf.toCPointer<ByteVar>(), hdev.toCPointer<ByteVar>(), flhooks)

public actual fun EngBitBlt(psotrg: Long, psosrc: Long, psomask: Long, pco: Long, pxlo: Long, prcltrg: Long, pptlsrc: Long, pptlmask: Long, pbo: Long, pptlbrush: Long, rop4: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngBitBlt(psotrg.toCPointer<ByteVar>(), psosrc.toCPointer<ByteVar>(), psomask.toCPointer<ByteVar>(), pco.toCPointer<ByteVar>(), pxlo.toCPointer<ByteVar>(), prcltrg.toCPointer<ByteVar>(), pptlsrc.toCPointer<ByteVar>(), pptlmask.toCPointer<ByteVar>(), pbo.toCPointer<ByteVar>(), pptlbrush.toCPointer<ByteVar>(), rop4)

public actual fun EngCheckAbort(pso: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngCheckAbort(pso.toCPointer<ByteVar>())

public actual fun EngComputeGlyphSet(ncodepage: Int, nfirstchar: Int, cchars: Int): Long =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngComputeGlyphSet(ncodepage, nfirstchar, cchars)?.toLong() ?: 0L

public actual fun EngCopyBits(psodest: Long, psosrc: Long, pco: Long, pxlo: Long, prcldest: Long, pptlsrc: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngCopyBits(psodest.toCPointer<ByteVar>(), psosrc.toCPointer<ByteVar>(), pco.toCPointer<ByteVar>(), pxlo.toCPointer<ByteVar>(), prcldest.toCPointer<ByteVar>(), pptlsrc.toCPointer<ByteVar>())

public actual fun EngCreateBitmap(sizl: SIZE, lwidth: Int, iformat: UInt, fl: UInt, pvbits: Long): HBITMAP =
    0L

public actual fun EngCreateClip(): Long =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngCreateClip()?.toLong() ?: 0L

public actual fun EngCreateDeviceBitmap(dhsurf: DHSURF, sizl: SIZE, iformatcompat: UInt): HBITMAP =
    0L

public actual fun EngCreateDeviceSurface(dhsurf: DHSURF, sizl: SIZE, iformatcompat: UInt): HSURF =
    0L

public actual fun EngCreatePalette(imode: UInt, ccolors: UInt, pulcolors: Long, flred: UInt, flgreen: UInt, flblue: UInt): HPALETTE =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngCreatePalette(imode, ccolors, pulcolors.toCPointer<ByteVar>(), flred, flgreen, flblue)?.toLong() ?: 0L

public actual fun EngCreateSemaphore(): HSEMAPHORE =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngCreateSemaphore()?.toLong() ?: 0L

public actual fun EngDeleteClip(pco: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngDeleteClip(pco.toCPointer<ByteVar>())
}

public actual fun EngDeletePalette(hpal: HPALETTE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngDeletePalette(hpal.toCPointer<ByteVar>())

public actual fun EngDeletePath(ppo: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngDeletePath(ppo.toCPointer<ByteVar>())
}

public actual fun EngDeleteSemaphore(hsem: HSEMAPHORE) {
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngDeleteSemaphore(hsem.toCPointer<ByteVar>())
}

public actual fun EngDeleteSurface(hsurf: HSURF): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngDeleteSurface(hsurf.toCPointer<ByteVar>())

public actual fun EngEraseSurface(pso: Long, prcl: Long, icolor: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngEraseSurface(pso.toCPointer<ByteVar>(), prcl.toCPointer<ByteVar>(), icolor)

public actual fun EngFillPath(pso: Long, ppo: Long, pco: Long, pbo: Long, pptlbrushorg: Long, mix: UInt, floptions: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngFillPath(pso.toCPointer<ByteVar>(), ppo.toCPointer<ByteVar>(), pco.toCPointer<ByteVar>(), pbo.toCPointer<ByteVar>(), pptlbrushorg.toCPointer<ByteVar>(), mix, floptions)

public actual fun EngFindResource(h: HANDLE, iname: Int, itype: Int, pulsize: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngFindResource(h.toCPointer<ByteVar>(), iname, itype, pulsize.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun EngFreeModule(h: HANDLE) {
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngFreeModule(h.toCPointer<ByteVar>())
}

public actual fun EngGetCurrentCodePage(oemcodepage: Long, ansicodepage: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngGetCurrentCodePage(oemcodepage.toCPointer<ByteVar>(), ansicodepage.toCPointer<ByteVar>())
}

public actual fun EngGetDriverName(hdev: HDEV): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngGetDriverName(hdev.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun EngGetPrinterDataFileName(hdev: HDEV): PWSTR =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngGetPrinterDataFileName(hdev.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun EngGradientFill(psodest: Long, pco: Long, pxlo: Long, pvertex: Long, nvertex: UInt, pmesh: Long, nmesh: UInt, prclextents: Long, pptlditherorg: Long, ulmode: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngGradientFill(psodest.toCPointer<ByteVar>(), pco.toCPointer<ByteVar>(), pxlo.toCPointer<ByteVar>(), pvertex.toCPointer<ByteVar>(), nvertex, pmesh.toCPointer<ByteVar>(), nmesh, prclextents.toCPointer<ByteVar>(), pptlditherorg.toCPointer<ByteVar>(), ulmode)

public actual fun EngLineTo(pso: Long, pco: Long, pbo: Long, x1: Int, y1: Int, x2: Int, y2: Int, prclbounds: Long, mix: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngLineTo(pso.toCPointer<ByteVar>(), pco.toCPointer<ByteVar>(), pbo.toCPointer<ByteVar>(), x1, y1, x2, y2, prclbounds.toCPointer<ByteVar>(), mix)

public actual fun EngLoadModule(pwsz: PCWSTR): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngLoadModule(pwsz.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun EngLockSurface(hsurf: HSURF): Long =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngLockSurface(hsurf.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun EngMarkBandingSurface(hsurf: HSURF): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngMarkBandingSurface(hsurf.toCPointer<ByteVar>())

public actual fun EngMultiByteToUnicodeN(unicodestring: PWSTR, maxbytesinunicodestring: UInt, bytesinunicodestring: Long, multibytestring: PCSTR, bytesinmultibytestring: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngMultiByteToUnicodeN(unicodestring.toCPointer<ByteVar>(), maxbytesinunicodestring, bytesinunicodestring.toCPointer<ByteVar>(), multibytestring.toCPointer<ByteVar>(), bytesinmultibytestring)
}

public actual fun EngMultiByteToWideChar(codepage: UInt, widecharstring: PWSTR, bytesinwidecharstring: Int, multibytestring: PCSTR, bytesinmultibytestring: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngMultiByteToWideChar(codepage, widecharstring.toCPointer<ByteVar>(), bytesinwidecharstring, multibytestring.toCPointer<ByteVar>(), bytesinmultibytestring)

public actual fun EngPaint(pso: Long, pco: Long, pbo: Long, pptlbrushorg: Long, mix: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngPaint(pso.toCPointer<ByteVar>(), pco.toCPointer<ByteVar>(), pbo.toCPointer<ByteVar>(), pptlbrushorg.toCPointer<ByteVar>(), mix)

public actual fun EngPlgBlt(psotrg: Long, psosrc: Long, psomsk: Long, pco: Long, pxlo: Long, pca: Long, pptlbrushorg: Long, pptfx: Long, prcl: Long, pptl: Long, imode: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngPlgBlt(psotrg.toCPointer<ByteVar>(), psosrc.toCPointer<ByteVar>(), psomsk.toCPointer<ByteVar>(), pco.toCPointer<ByteVar>(), pxlo.toCPointer<ByteVar>(), pca.toCPointer<ByteVar>(), pptlbrushorg.toCPointer<ByteVar>(), pptfx.toCPointer<ByteVar>(), prcl.toCPointer<ByteVar>(), pptl.toCPointer<ByteVar>(), imode)

public actual fun EngQueryEMFInfo(hdev: HDEV, pemfinfo: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngQueryEMFInfo(hdev.toCPointer<ByteVar>(), pemfinfo.toCPointer<ByteVar>())

public actual fun EngQueryLocalTime(param0: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngQueryLocalTime(param0.toCPointer<ByteVar>())
}

public actual fun EngReleaseSemaphore(hsem: HSEMAPHORE) {
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngReleaseSemaphore(hsem.toCPointer<ByteVar>())
}

public actual fun EngStretchBlt(psodest: Long, psosrc: Long, psomask: Long, pco: Long, pxlo: Long, pca: Long, pptlhtorg: Long, prcldest: Long, prclsrc: Long, pptlmask: Long, imode: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngStretchBlt(psodest.toCPointer<ByteVar>(), psosrc.toCPointer<ByteVar>(), psomask.toCPointer<ByteVar>(), pco.toCPointer<ByteVar>(), pxlo.toCPointer<ByteVar>(), pca.toCPointer<ByteVar>(), pptlhtorg.toCPointer<ByteVar>(), prcldest.toCPointer<ByteVar>(), prclsrc.toCPointer<ByteVar>(), pptlmask.toCPointer<ByteVar>(), imode)

public actual fun EngStretchBltROP(psodest: Long, psosrc: Long, psomask: Long, pco: Long, pxlo: Long, pca: Long, pptlhtorg: Long, prcldest: Long, prclsrc: Long, pptlmask: Long, imode: UInt, pbo: Long, rop4: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngStretchBltROP(psodest.toCPointer<ByteVar>(), psosrc.toCPointer<ByteVar>(), psomask.toCPointer<ByteVar>(), pco.toCPointer<ByteVar>(), pxlo.toCPointer<ByteVar>(), pca.toCPointer<ByteVar>(), pptlhtorg.toCPointer<ByteVar>(), prcldest.toCPointer<ByteVar>(), prclsrc.toCPointer<ByteVar>(), pptlmask.toCPointer<ByteVar>(), imode, pbo.toCPointer<ByteVar>(), rop4)

public actual fun EngStrokeAndFillPath(pso: Long, ppo: Long, pco: Long, pxo: Long, pbostroke: Long, plineattrs: Long, pbofill: Long, pptlbrushorg: Long, mixfill: UInt, floptions: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngStrokeAndFillPath(pso.toCPointer<ByteVar>(), ppo.toCPointer<ByteVar>(), pco.toCPointer<ByteVar>(), pxo.toCPointer<ByteVar>(), pbostroke.toCPointer<ByteVar>(), plineattrs.toCPointer<ByteVar>(), pbofill.toCPointer<ByteVar>(), pptlbrushorg.toCPointer<ByteVar>(), mixfill, floptions)

public actual fun EngStrokePath(pso: Long, ppo: Long, pco: Long, pxo: Long, pbo: Long, pptlbrushorg: Long, plineattrs: Long, mix: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngStrokePath(pso.toCPointer<ByteVar>(), ppo.toCPointer<ByteVar>(), pco.toCPointer<ByteVar>(), pxo.toCPointer<ByteVar>(), pbo.toCPointer<ByteVar>(), pptlbrushorg.toCPointer<ByteVar>(), plineattrs.toCPointer<ByteVar>(), mix)

public actual fun EngTextOut(pso: Long, pstro: Long, pfo: Long, pco: Long, prclextra: Long, prclopaque: Long, pbofore: Long, pboopaque: Long, pptlorg: Long, mix: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngTextOut(pso.toCPointer<ByteVar>(), pstro.toCPointer<ByteVar>(), pfo.toCPointer<ByteVar>(), pco.toCPointer<ByteVar>(), prclextra.toCPointer<ByteVar>(), prclopaque.toCPointer<ByteVar>(), pbofore.toCPointer<ByteVar>(), pboopaque.toCPointer<ByteVar>(), pptlorg.toCPointer<ByteVar>(), mix)

public actual fun EngTransparentBlt(psodst: Long, psosrc: Long, pco: Long, pxlo: Long, prcldst: Long, prclsrc: Long, transcolor: UInt, bcalledfrombitblt: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngTransparentBlt(psodst.toCPointer<ByteVar>(), psosrc.toCPointer<ByteVar>(), pco.toCPointer<ByteVar>(), pxlo.toCPointer<ByteVar>(), prcldst.toCPointer<ByteVar>(), prclsrc.toCPointer<ByteVar>(), transcolor, bcalledfrombitblt)

public actual fun EngUnicodeToMultiByteN(multibytestring: PSTR, maxbytesinmultibytestring: UInt, bytesinmultibytestring: Long, unicodestring: PCWSTR, bytesinunicodestring: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngUnicodeToMultiByteN(multibytestring.toCPointer<ByteVar>(), maxbytesinmultibytestring, bytesinmultibytestring.toCPointer<ByteVar>(), unicodestring.toCPointer<ByteVar>(), bytesinunicodestring)
}

public actual fun EngUnlockSurface(pso: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngUnlockSurface(pso.toCPointer<ByteVar>())
}

public actual fun EngWideCharToMultiByte(codepage: UInt, widecharstring: PCWSTR, bytesinwidecharstring: Int, multibytestring: PSTR, bytesinmultibytestring: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_EngWideCharToMultiByte(codepage, widecharstring.toCPointer<ByteVar>(), bytesinwidecharstring, multibytestring.toCPointer<ByteVar>(), bytesinmultibytestring)

public actual fun FONTOBJ_cGetAllGlyphHandles(pfo: Long, phg: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_FONTOBJ_cGetAllGlyphHandles(pfo.toCPointer<ByteVar>(), phg.toCPointer<ByteVar>())

public actual fun FONTOBJ_cGetGlyphs(pfo: Long, imode: UInt, cglyph: UInt, phg: Long, ppvglyph: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_FONTOBJ_cGetGlyphs(pfo.toCPointer<ByteVar>(), imode, cglyph, phg.toCPointer<ByteVar>(), ppvglyph.toCPointer<ByteVar>())

public actual fun FONTOBJ_pQueryGlyphAttrs(pfo: Long, imode: UInt): Long =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_FONTOBJ_pQueryGlyphAttrs(pfo.toCPointer<ByteVar>(), imode)?.toLong() ?: 0L

public actual fun FONTOBJ_pfdg(pfo: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_FONTOBJ_pfdg(pfo.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FONTOBJ_pifi(pfo: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_FONTOBJ_pifi(pfo.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FONTOBJ_pvTrueTypeFontFile(pfo: Long, pcjfile: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_FONTOBJ_pvTrueTypeFontFile(pfo.toCPointer<ByteVar>(), pcjfile.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FONTOBJ_pxoGetXform(pfo: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_FONTOBJ_pxoGetXform(pfo.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun FONTOBJ_vGetInfo(pfo: Long, cjsize: UInt, pfi: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_FONTOBJ_vGetInfo(pfo.toCPointer<ByteVar>(), cjsize, pfi.toCPointer<ByteVar>())
}

public actual fun GetAutoRotationState(pstate: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_GetAutoRotationState(pstate.toCPointer<ByteVar>())

public actual fun GetCapabilitiesStringLength(hmonitor: HANDLE, pdwcapabilitiesstringlengthincharacters: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_GetCapabilitiesStringLength(hmonitor.toCPointer<ByteVar>(), pdwcapabilitiesstringlengthincharacters.toCPointer<ByteVar>())

public actual fun GetDisplayAutoRotationPreferences(porientation: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_GetDisplayAutoRotationPreferences(porientation.toCPointer<ByteVar>())

public actual fun GetDisplayConfigBufferSizes(flags: QUERY_DISPLAY_CONFIG_FLAGS, numpatharrayelements: Long, nummodeinfoarrayelements: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_GetDisplayConfigBufferSizes(flags, numpatharrayelements.toCPointer<ByteVar>(), nummodeinfoarrayelements.toCPointer<ByteVar>())

public actual fun GetMonitorBrightness(hmonitor: HANDLE, pdwminimumbrightness: Long, pdwcurrentbrightness: Long, pdwmaximumbrightness: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_GetMonitorBrightness(hmonitor.toCPointer<ByteVar>(), pdwminimumbrightness.toCPointer<ByteVar>(), pdwcurrentbrightness.toCPointer<ByteVar>(), pdwmaximumbrightness.toCPointer<ByteVar>())

public actual fun GetMonitorCapabilities(hmonitor: HANDLE, pdwmonitorcapabilities: Long, pdwsupportedcolortemperatures: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_GetMonitorCapabilities(hmonitor.toCPointer<ByteVar>(), pdwmonitorcapabilities.toCPointer<ByteVar>(), pdwsupportedcolortemperatures.toCPointer<ByteVar>())

public actual fun GetMonitorColorTemperature(hmonitor: HANDLE, pctcurrentcolortemperature: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_GetMonitorColorTemperature(hmonitor.toCPointer<ByteVar>(), pctcurrentcolortemperature.toCPointer<ByteVar>())

public actual fun GetMonitorContrast(hmonitor: HANDLE, pdwminimumcontrast: Long, pdwcurrentcontrast: Long, pdwmaximumcontrast: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_GetMonitorContrast(hmonitor.toCPointer<ByteVar>(), pdwminimumcontrast.toCPointer<ByteVar>(), pdwcurrentcontrast.toCPointer<ByteVar>(), pdwmaximumcontrast.toCPointer<ByteVar>())

public actual fun GetMonitorDisplayAreaPosition(hmonitor: HANDLE, ptpositiontype: MC_POSITION_TYPE, pdwminimumposition: Long, pdwcurrentposition: Long, pdwmaximumposition: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_GetMonitorDisplayAreaPosition(hmonitor.toCPointer<ByteVar>(), ptpositiontype, pdwminimumposition.toCPointer<ByteVar>(), pdwcurrentposition.toCPointer<ByteVar>(), pdwmaximumposition.toCPointer<ByteVar>())

public actual fun GetMonitorDisplayAreaSize(hmonitor: HANDLE, stsizetype: MC_SIZE_TYPE, pdwminimumwidthorheight: Long, pdwcurrentwidthorheight: Long, pdwmaximumwidthorheight: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_GetMonitorDisplayAreaSize(hmonitor.toCPointer<ByteVar>(), stsizetype, pdwminimumwidthorheight.toCPointer<ByteVar>(), pdwcurrentwidthorheight.toCPointer<ByteVar>(), pdwmaximumwidthorheight.toCPointer<ByteVar>())

public actual fun GetMonitorRedGreenOrBlueDrive(hmonitor: HANDLE, dtdrivetype: MC_DRIVE_TYPE, pdwminimumdrive: Long, pdwcurrentdrive: Long, pdwmaximumdrive: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_GetMonitorRedGreenOrBlueDrive(hmonitor.toCPointer<ByteVar>(), dtdrivetype, pdwminimumdrive.toCPointer<ByteVar>(), pdwcurrentdrive.toCPointer<ByteVar>(), pdwmaximumdrive.toCPointer<ByteVar>())

public actual fun GetMonitorRedGreenOrBlueGain(hmonitor: HANDLE, gtgaintype: MC_GAIN_TYPE, pdwminimumgain: Long, pdwcurrentgain: Long, pdwmaximumgain: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_GetMonitorRedGreenOrBlueGain(hmonitor.toCPointer<ByteVar>(), gtgaintype, pdwminimumgain.toCPointer<ByteVar>(), pdwcurrentgain.toCPointer<ByteVar>(), pdwmaximumgain.toCPointer<ByteVar>())

public actual fun GetMonitorTechnologyType(hmonitor: HANDLE, pdtydisplaytechnologytype: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_GetMonitorTechnologyType(hmonitor.toCPointer<ByteVar>(), pdtydisplaytechnologytype.toCPointer<ByteVar>())

public actual fun GetNumberOfPhysicalMonitorsFromHMONITOR(hmonitor: HMONITOR, pdwnumberofphysicalmonitors: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_GetNumberOfPhysicalMonitorsFromHMONITOR(hmonitor.toCPointer<ByteVar>(), pdwnumberofphysicalmonitors.toCPointer<ByteVar>())

public actual fun GetPhysicalMonitorsFromHMONITOR(hmonitor: HMONITOR, dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_GetPhysicalMonitorsFromHMONITOR(hmonitor.toCPointer<ByteVar>(), dwphysicalmonitorarraysize, pphysicalmonitorarray.toCPointer<ByteVar>())

public actual fun GetTimingReport(hmonitor: HANDLE, pmtrmonitortimingreport: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_GetTimingReport(hmonitor.toCPointer<ByteVar>(), pmtrmonitortimingreport.toCPointer<ByteVar>())

public actual fun GetVCPFeatureAndVCPFeatureReply(hmonitor: HANDLE, bvcpcode: UByte, pvct: Long, pdwcurrentvalue: Long, pdwmaximumvalue: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_GetVCPFeatureAndVCPFeatureReply(hmonitor.toCPointer<ByteVar>(), bvcpcode, pvct.toCPointer<ByteVar>(), pdwcurrentvalue.toCPointer<ByteVar>(), pdwmaximumvalue.toCPointer<ByteVar>())

public actual fun HT_Get8BPPFormatPalette(ppaletteentry: Long, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_HT_Get8BPPFormatPalette(ppaletteentry.toCPointer<ByteVar>(), redgamma, greengamma, bluegamma)

public actual fun HT_Get8BPPMaskPalette(ppaletteentry: Long, use8bppmaskpal: BOOL, cmymask: UByte, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_HT_Get8BPPMaskPalette(ppaletteentry.toCPointer<ByteVar>(), use8bppmaskpal, cmymask, redgamma, greengamma, bluegamma)

public actual fun PATHOBJ_bEnum(ppo: Long, ppd: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_PATHOBJ_bEnum(ppo.toCPointer<ByteVar>(), ppd.toCPointer<ByteVar>())

public actual fun PATHOBJ_bEnumClipLines(ppo: Long, cb: UInt, pcl: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_PATHOBJ_bEnumClipLines(ppo.toCPointer<ByteVar>(), cb, pcl.toCPointer<ByteVar>())

public actual fun PATHOBJ_vEnumStart(ppo: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_PATHOBJ_vEnumStart(ppo.toCPointer<ByteVar>())
}

public actual fun PATHOBJ_vEnumStartClipLines(ppo: Long, pco: Long, pso: Long, pla: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_PATHOBJ_vEnumStartClipLines(ppo.toCPointer<ByteVar>(), pco.toCPointer<ByteVar>(), pso.toCPointer<ByteVar>(), pla.toCPointer<ByteVar>())
}

public actual fun PATHOBJ_vGetBounds(ppo: Long, prectfx: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_PATHOBJ_vGetBounds(ppo.toCPointer<ByteVar>(), prectfx.toCPointer<ByteVar>())
}

public actual fun QueryDisplayConfig(flags: QUERY_DISPLAY_CONFIG_FLAGS, numpatharrayelements: Long, patharray: Long, nummodeinfoarrayelements: Long, modeinfoarray: Long, currenttopologyid: Long): WIN32_ERROR =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_QueryDisplayConfig(flags, numpatharrayelements.toCPointer<ByteVar>(), patharray.toCPointer<ByteVar>(), nummodeinfoarrayelements.toCPointer<ByteVar>(), modeinfoarray.toCPointer<ByteVar>(), currenttopologyid.toCPointer<ByteVar>())

public actual fun RestoreMonitorFactoryColorDefaults(hmonitor: HANDLE): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_RestoreMonitorFactoryColorDefaults(hmonitor.toCPointer<ByteVar>())

public actual fun RestoreMonitorFactoryDefaults(hmonitor: HANDLE): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_RestoreMonitorFactoryDefaults(hmonitor.toCPointer<ByteVar>())

public actual fun STROBJ_bEnum(pstro: Long, pc: Long, ppgpos: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_STROBJ_bEnum(pstro.toCPointer<ByteVar>(), pc.toCPointer<ByteVar>(), ppgpos.toCPointer<ByteVar>())

public actual fun STROBJ_bEnumPositionsOnly(pstro: Long, pc: Long, ppgpos: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_STROBJ_bEnumPositionsOnly(pstro.toCPointer<ByteVar>(), pc.toCPointer<ByteVar>(), ppgpos.toCPointer<ByteVar>())

public actual fun STROBJ_bGetAdvanceWidths(pso: Long, ifirst: UInt, c: UInt, pptqd: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_STROBJ_bGetAdvanceWidths(pso.toCPointer<ByteVar>(), ifirst, c, pptqd.toCPointer<ByteVar>())

public actual fun STROBJ_dwGetCodePage(pstro: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_STROBJ_dwGetCodePage(pstro.toCPointer<ByteVar>())

public actual fun STROBJ_vEnumStart(pstro: Long) {
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_STROBJ_vEnumStart(pstro.toCPointer<ByteVar>())
}

public actual fun SaveCurrentMonitorSettings(hmonitor: HANDLE): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_SaveCurrentMonitorSettings(hmonitor.toCPointer<ByteVar>())

public actual fun SaveCurrentSettings(hmonitor: HANDLE): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_SaveCurrentSettings(hmonitor.toCPointer<ByteVar>())

public actual fun SetDisplayAutoRotationPreferences(orientation: ORIENTATION_PREFERENCE): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_SetDisplayAutoRotationPreferences(orientation)

public actual fun SetDisplayConfig(numpatharrayelements: UInt, patharray: Long, nummodeinfoarrayelements: UInt, modeinfoarray: Long, flags: SET_DISPLAY_CONFIG_FLAGS): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_SetDisplayConfig(numpatharrayelements, patharray.toCPointer<ByteVar>(), nummodeinfoarrayelements, modeinfoarray.toCPointer<ByteVar>(), flags)

public actual fun SetMonitorBrightness(hmonitor: HANDLE, dwnewbrightness: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_SetMonitorBrightness(hmonitor.toCPointer<ByteVar>(), dwnewbrightness)

public actual fun SetMonitorColorTemperature(hmonitor: HANDLE, ctcurrentcolortemperature: MC_COLOR_TEMPERATURE): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_SetMonitorColorTemperature(hmonitor.toCPointer<ByteVar>(), ctcurrentcolortemperature)

public actual fun SetMonitorContrast(hmonitor: HANDLE, dwnewcontrast: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_SetMonitorContrast(hmonitor.toCPointer<ByteVar>(), dwnewcontrast)

public actual fun SetMonitorDisplayAreaPosition(hmonitor: HANDLE, ptpositiontype: MC_POSITION_TYPE, dwnewposition: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_SetMonitorDisplayAreaPosition(hmonitor.toCPointer<ByteVar>(), ptpositiontype, dwnewposition)

public actual fun SetMonitorDisplayAreaSize(hmonitor: HANDLE, stsizetype: MC_SIZE_TYPE, dwnewdisplayareawidthorheight: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_SetMonitorDisplayAreaSize(hmonitor.toCPointer<ByteVar>(), stsizetype, dwnewdisplayareawidthorheight)

public actual fun SetMonitorRedGreenOrBlueDrive(hmonitor: HANDLE, dtdrivetype: MC_DRIVE_TYPE, dwnewdrive: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_SetMonitorRedGreenOrBlueDrive(hmonitor.toCPointer<ByteVar>(), dtdrivetype, dwnewdrive)

public actual fun SetMonitorRedGreenOrBlueGain(hmonitor: HANDLE, gtgaintype: MC_GAIN_TYPE, dwnewgain: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_SetMonitorRedGreenOrBlueGain(hmonitor.toCPointer<ByteVar>(), gtgaintype, dwnewgain)

public actual fun SetVCPFeature(hmonitor: HANDLE, bvcpcode: UByte, dwnewvalue: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_SetVCPFeature(hmonitor.toCPointer<ByteVar>(), bvcpcode, dwnewvalue)

public actual fun XFORMOBJ_bApplyXform(pxo: Long, imode: UInt, cpoints: UInt, pvin: Long, pvout: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_XFORMOBJ_bApplyXform(pxo.toCPointer<ByteVar>(), imode, cpoints, pvin.toCPointer<ByteVar>(), pvout.toCPointer<ByteVar>())

public actual fun XFORMOBJ_iGetXform(pxo: Long, pxform: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_XFORMOBJ_iGetXform(pxo.toCPointer<ByteVar>(), pxform.toCPointer<ByteVar>())

public actual fun XLATEOBJ_cGetPalette(pxlo: Long, ipal: UInt, cpal: UInt, ppal: Long): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_XLATEOBJ_cGetPalette(pxlo.toCPointer<ByteVar>(), ipal, cpal, ppal.toCPointer<ByteVar>())

public actual fun XLATEOBJ_hGetColorTransform(pxlo: Long): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_XLATEOBJ_hGetColorTransform(pxlo.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun XLATEOBJ_iXlate(pxlo: Long, icolor: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_XLATEOBJ_iXlate(pxlo.toCPointer<ByteVar>(), icolor)

public actual fun XLATEOBJ_piVector(pxlo: Long): Long =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_XLATEOBJ_piVector(pxlo.toCPointer<ByteVar>())?.toLong() ?: 0L
