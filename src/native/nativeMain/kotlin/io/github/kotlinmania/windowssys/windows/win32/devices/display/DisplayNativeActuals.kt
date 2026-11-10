@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.display

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Size
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hmonitor
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun brushobjHGetColorTransform(pbo: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_brushobjHGetColorTransform(pbo?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun brushobjPvAllocRbrush(pbo: COpaquePointer?, cj: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_brushobjPvAllocRbrush(pbo?.value?.toCPointer<ByteVar>(), cj)?.let { COpaquePointer(it.toLong()) }

public actual fun brushobjPvGetRbrush(pbo: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_brushobjPvGetRbrush(pbo?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun brushobjUlGetBrushColor(pbo: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_brushobjUlGetBrushColor(pbo?.value?.toCPointer<ByteVar>())

public actual fun clipobjBEnum(pco: COpaquePointer?, cj: UInt, pul: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_clipobjBEnum(pco?.value?.toCPointer<ByteVar>(), cj, pul?.value?.toCPointer<ByteVar>())

public actual fun clipobjCEnumStart(pco: COpaquePointer?, ball: Bool, itype: UInt, idirection: UInt, climit: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_clipobjCEnumStart(pco?.value?.toCPointer<ByteVar>(), ball, itype, idirection, climit)

public actual fun clipobjPpoGetPath(pco: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_clipobjPpoGetPath(pco?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun capabilitiesRequestAndCapabilitiesReply(hmonitor: Handle, pszasciicapabilitiesstring: Pstr, dwcapabilitiesstringlengthincharacters: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_capabilitiesRequestAndCapabilitiesReply(hmonitor?.value?.toCPointer<ByteVar>(), pszasciicapabilitiesstring?.value?.toCPointer<ByteVar>(), dwcapabilitiesstringlengthincharacters)

public actual fun degaussMonitor(hmonitor: Handle): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_degaussMonitor(hmonitor?.value?.toCPointer<ByteVar>())

public actual fun destroyPhysicalMonitor(hmonitor: Handle): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_destroyPhysicalMonitor(hmonitor?.value?.toCPointer<ByteVar>())

public actual fun destroyPhysicalMonitors(dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_destroyPhysicalMonitors(dwphysicalmonitorarraysize, pphysicalmonitorarray?.value?.toCPointer<ByteVar>())

public actual fun displayConfigGetDeviceInfo(requestpacket: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_displayConfigGetDeviceInfo(requestpacket?.value?.toCPointer<ByteVar>())

public actual fun displayConfigSetDeviceInfo(setpacket: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_displayConfigSetDeviceInfo(setpacket?.value?.toCPointer<ByteVar>())

public actual fun engAcquireSemaphore(hsem: Hsemaphore) {
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engAcquireSemaphore(hsem?.value?.toCPointer<ByteVar>())
}

public actual fun engAlphaBlend(psodest: COpaquePointer?, psosrc: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, prcldest: COpaquePointer?, prclsrc: COpaquePointer?, pblendobj: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engAlphaBlend(psodest?.value?.toCPointer<ByteVar>(), psosrc?.value?.toCPointer<ByteVar>(), pco?.value?.toCPointer<ByteVar>(), pxlo?.value?.toCPointer<ByteVar>(), prcldest?.value?.toCPointer<ByteVar>(), prclsrc?.value?.toCPointer<ByteVar>(), pblendobj?.value?.toCPointer<ByteVar>())

public actual fun engAssociateSurface(hsurf: Hsurf, hdev: Hdev, flhooks: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engAssociateSurface(hsurf?.value?.toCPointer<ByteVar>(), hdev?.value?.toCPointer<ByteVar>(), flhooks)

public actual fun engBitBlt(psotrg: COpaquePointer?, psosrc: COpaquePointer?, psomask: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, prcltrg: COpaquePointer?, pptlsrc: COpaquePointer?, pptlmask: COpaquePointer?, pbo: COpaquePointer?, pptlbrush: COpaquePointer?, rop4: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engBitBlt(psotrg?.value?.toCPointer<ByteVar>(), psosrc?.value?.toCPointer<ByteVar>(), psomask?.value?.toCPointer<ByteVar>(), pco?.value?.toCPointer<ByteVar>(), pxlo?.value?.toCPointer<ByteVar>(), prcltrg?.value?.toCPointer<ByteVar>(), pptlsrc?.value?.toCPointer<ByteVar>(), pptlmask?.value?.toCPointer<ByteVar>(), pbo?.value?.toCPointer<ByteVar>(), pptlbrush?.value?.toCPointer<ByteVar>(), rop4)

public actual fun engCheckAbort(pso: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engCheckAbort(pso?.value?.toCPointer<ByteVar>())

public actual fun engComputeGlyphSet(ncodepage: Int, nfirstchar: Int, cchars: Int): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engComputeGlyphSet(ncodepage, nfirstchar, cchars)?.let { COpaquePointer(it.toLong()) }

public actual fun engCopyBits(psodest: COpaquePointer?, psosrc: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, prcldest: COpaquePointer?, pptlsrc: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engCopyBits(psodest?.value?.toCPointer<ByteVar>(), psosrc?.value?.toCPointer<ByteVar>(), pco?.value?.toCPointer<ByteVar>(), pxlo?.value?.toCPointer<ByteVar>(), prcldest?.value?.toCPointer<ByteVar>(), pptlsrc?.value?.toCPointer<ByteVar>())

public actual fun engCreateBitmap(sizl: Size, lwidth: Int, iformat: UInt, fl: UInt, pvbits: COpaquePointer?): Hbitmap =
    null

public actual fun engCreateClip(): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engCreateClip()?.let { COpaquePointer(it.toLong()) }

public actual fun engCreateDeviceBitmap(dhsurf: Dhsurf, sizl: Size, iformatcompat: UInt): Hbitmap =
    null

public actual fun engCreateDeviceSurface(dhsurf: Dhsurf, sizl: Size, iformatcompat: UInt): Hsurf =
    null

public actual fun engCreatePalette(imode: UInt, ccolors: UInt, pulcolors: COpaquePointer?, flred: UInt, flgreen: UInt, flblue: UInt): Hpalette =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engCreatePalette(imode, ccolors, pulcolors?.value?.toCPointer<ByteVar>(), flred, flgreen, flblue)?.let { COpaquePointer(it.toLong()) }

public actual fun engCreateSemaphore(): Hsemaphore =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engCreateSemaphore()?.let { COpaquePointer(it.toLong()) }

public actual fun engDeleteClip(pco: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engDeleteClip(pco?.value?.toCPointer<ByteVar>())
}

public actual fun engDeletePalette(hpal: Hpalette): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engDeletePalette(hpal?.value?.toCPointer<ByteVar>())

public actual fun engDeletePath(ppo: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engDeletePath(ppo?.value?.toCPointer<ByteVar>())
}

public actual fun engDeleteSemaphore(hsem: Hsemaphore) {
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engDeleteSemaphore(hsem?.value?.toCPointer<ByteVar>())
}

public actual fun engDeleteSurface(hsurf: Hsurf): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engDeleteSurface(hsurf?.value?.toCPointer<ByteVar>())

public actual fun engEraseSurface(pso: COpaquePointer?, prcl: COpaquePointer?, icolor: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engEraseSurface(pso?.value?.toCPointer<ByteVar>(), prcl?.value?.toCPointer<ByteVar>(), icolor)

public actual fun engFillPath(pso: COpaquePointer?, ppo: COpaquePointer?, pco: COpaquePointer?, pbo: COpaquePointer?, pptlbrushorg: COpaquePointer?, mix: UInt, floptions: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engFillPath(pso?.value?.toCPointer<ByteVar>(), ppo?.value?.toCPointer<ByteVar>(), pco?.value?.toCPointer<ByteVar>(), pbo?.value?.toCPointer<ByteVar>(), pptlbrushorg?.value?.toCPointer<ByteVar>(), mix, floptions)

public actual fun engFindResource(h: Handle, iname: Int, itype: Int, pulsize: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engFindResource(h?.value?.toCPointer<ByteVar>(), iname, itype, pulsize?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun engFreeModule(h: Handle) {
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engFreeModule(h?.value?.toCPointer<ByteVar>())
}

public actual fun engGetCurrentCodePage(oemcodepage: COpaquePointer?, ansicodepage: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engGetCurrentCodePage(oemcodepage?.value?.toCPointer<ByteVar>(), ansicodepage?.value?.toCPointer<ByteVar>())
}

public actual fun engGetDriverName(hdev: Hdev): Pwstr =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engGetDriverName(hdev?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun engGetPrinterDataFileName(hdev: Hdev): Pwstr =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engGetPrinterDataFileName(hdev?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun engGradientFill(psodest: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, pvertex: COpaquePointer?, nvertex: UInt, pmesh: COpaquePointer?, nmesh: UInt, prclextents: COpaquePointer?, pptlditherorg: COpaquePointer?, ulmode: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engGradientFill(psodest?.value?.toCPointer<ByteVar>(), pco?.value?.toCPointer<ByteVar>(), pxlo?.value?.toCPointer<ByteVar>(), pvertex?.value?.toCPointer<ByteVar>(), nvertex, pmesh?.value?.toCPointer<ByteVar>(), nmesh, prclextents?.value?.toCPointer<ByteVar>(), pptlditherorg?.value?.toCPointer<ByteVar>(), ulmode)

public actual fun engLineTo(pso: COpaquePointer?, pco: COpaquePointer?, pbo: COpaquePointer?, x1: Int, y1: Int, x2: Int, y2: Int, prclbounds: COpaquePointer?, mix: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engLineTo(pso?.value?.toCPointer<ByteVar>(), pco?.value?.toCPointer<ByteVar>(), pbo?.value?.toCPointer<ByteVar>(), x1, y1, x2, y2, prclbounds?.value?.toCPointer<ByteVar>(), mix)

public actual fun engLoadModule(pwsz: Pcwstr): Handle =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engLoadModule(pwsz?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun engLockSurface(hsurf: Hsurf): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engLockSurface(hsurf?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun engMarkBandingSurface(hsurf: Hsurf): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engMarkBandingSurface(hsurf?.value?.toCPointer<ByteVar>())

public actual fun engMultiByteToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: COpaquePointer?, multibytestring: Pcstr, bytesinmultibytestring: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engMultiByteToUnicodeN(unicodestring?.value?.toCPointer<ByteVar>(), maxbytesinunicodestring, bytesinunicodestring?.value?.toCPointer<ByteVar>(), multibytestring?.value?.toCPointer<ByteVar>(), bytesinmultibytestring)
}

public actual fun engMultiByteToWideChar(codepage: UInt, widecharstring: Pwstr, bytesinwidecharstring: Int, multibytestring: Pcstr, bytesinmultibytestring: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engMultiByteToWideChar(codepage, widecharstring?.value?.toCPointer<ByteVar>(), bytesinwidecharstring, multibytestring?.value?.toCPointer<ByteVar>(), bytesinmultibytestring)

public actual fun engPaint(pso: COpaquePointer?, pco: COpaquePointer?, pbo: COpaquePointer?, pptlbrushorg: COpaquePointer?, mix: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engPaint(pso?.value?.toCPointer<ByteVar>(), pco?.value?.toCPointer<ByteVar>(), pbo?.value?.toCPointer<ByteVar>(), pptlbrushorg?.value?.toCPointer<ByteVar>(), mix)

public actual fun engPlgBlt(psotrg: COpaquePointer?, psosrc: COpaquePointer?, psomsk: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, pca: COpaquePointer?, pptlbrushorg: COpaquePointer?, pptfx: COpaquePointer?, prcl: COpaquePointer?, pptl: COpaquePointer?, imode: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engPlgBlt(psotrg?.value?.toCPointer<ByteVar>(), psosrc?.value?.toCPointer<ByteVar>(), psomsk?.value?.toCPointer<ByteVar>(), pco?.value?.toCPointer<ByteVar>(), pxlo?.value?.toCPointer<ByteVar>(), pca?.value?.toCPointer<ByteVar>(), pptlbrushorg?.value?.toCPointer<ByteVar>(), pptfx?.value?.toCPointer<ByteVar>(), prcl?.value?.toCPointer<ByteVar>(), pptl?.value?.toCPointer<ByteVar>(), imode)

public actual fun engQueryEMFInfo(hdev: Hdev, pemfinfo: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engQueryEMFInfo(hdev?.value?.toCPointer<ByteVar>(), pemfinfo?.value?.toCPointer<ByteVar>())

public actual fun engQueryLocalTime(param0: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engQueryLocalTime(param0?.value?.toCPointer<ByteVar>())
}

public actual fun engReleaseSemaphore(hsem: Hsemaphore) {
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engReleaseSemaphore(hsem?.value?.toCPointer<ByteVar>())
}

public actual fun engStretchBlt(psodest: COpaquePointer?, psosrc: COpaquePointer?, psomask: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, pca: COpaquePointer?, pptlhtorg: COpaquePointer?, prcldest: COpaquePointer?, prclsrc: COpaquePointer?, pptlmask: COpaquePointer?, imode: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engStretchBlt(psodest?.value?.toCPointer<ByteVar>(), psosrc?.value?.toCPointer<ByteVar>(), psomask?.value?.toCPointer<ByteVar>(), pco?.value?.toCPointer<ByteVar>(), pxlo?.value?.toCPointer<ByteVar>(), pca?.value?.toCPointer<ByteVar>(), pptlhtorg?.value?.toCPointer<ByteVar>(), prcldest?.value?.toCPointer<ByteVar>(), prclsrc?.value?.toCPointer<ByteVar>(), pptlmask?.value?.toCPointer<ByteVar>(), imode)

public actual fun engStretchBltROP(psodest: COpaquePointer?, psosrc: COpaquePointer?, psomask: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, pca: COpaquePointer?, pptlhtorg: COpaquePointer?, prcldest: COpaquePointer?, prclsrc: COpaquePointer?, pptlmask: COpaquePointer?, imode: UInt, pbo: COpaquePointer?, rop4: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engStretchBltROP(psodest?.value?.toCPointer<ByteVar>(), psosrc?.value?.toCPointer<ByteVar>(), psomask?.value?.toCPointer<ByteVar>(), pco?.value?.toCPointer<ByteVar>(), pxlo?.value?.toCPointer<ByteVar>(), pca?.value?.toCPointer<ByteVar>(), pptlhtorg?.value?.toCPointer<ByteVar>(), prcldest?.value?.toCPointer<ByteVar>(), prclsrc?.value?.toCPointer<ByteVar>(), pptlmask?.value?.toCPointer<ByteVar>(), imode, pbo?.value?.toCPointer<ByteVar>(), rop4)

public actual fun engStrokeAndFillPath(pso: COpaquePointer?, ppo: COpaquePointer?, pco: COpaquePointer?, pxo: COpaquePointer?, pbostroke: COpaquePointer?, plineattrs: COpaquePointer?, pbofill: COpaquePointer?, pptlbrushorg: COpaquePointer?, mixfill: UInt, floptions: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engStrokeAndFillPath(pso?.value?.toCPointer<ByteVar>(), ppo?.value?.toCPointer<ByteVar>(), pco?.value?.toCPointer<ByteVar>(), pxo?.value?.toCPointer<ByteVar>(), pbostroke?.value?.toCPointer<ByteVar>(), plineattrs?.value?.toCPointer<ByteVar>(), pbofill?.value?.toCPointer<ByteVar>(), pptlbrushorg?.value?.toCPointer<ByteVar>(), mixfill, floptions)

public actual fun engStrokePath(pso: COpaquePointer?, ppo: COpaquePointer?, pco: COpaquePointer?, pxo: COpaquePointer?, pbo: COpaquePointer?, pptlbrushorg: COpaquePointer?, plineattrs: COpaquePointer?, mix: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engStrokePath(pso?.value?.toCPointer<ByteVar>(), ppo?.value?.toCPointer<ByteVar>(), pco?.value?.toCPointer<ByteVar>(), pxo?.value?.toCPointer<ByteVar>(), pbo?.value?.toCPointer<ByteVar>(), pptlbrushorg?.value?.toCPointer<ByteVar>(), plineattrs?.value?.toCPointer<ByteVar>(), mix)

public actual fun engTextOut(pso: COpaquePointer?, pstro: COpaquePointer?, pfo: COpaquePointer?, pco: COpaquePointer?, prclextra: COpaquePointer?, prclopaque: COpaquePointer?, pbofore: COpaquePointer?, pboopaque: COpaquePointer?, pptlorg: COpaquePointer?, mix: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engTextOut(pso?.value?.toCPointer<ByteVar>(), pstro?.value?.toCPointer<ByteVar>(), pfo?.value?.toCPointer<ByteVar>(), pco?.value?.toCPointer<ByteVar>(), prclextra?.value?.toCPointer<ByteVar>(), prclopaque?.value?.toCPointer<ByteVar>(), pbofore?.value?.toCPointer<ByteVar>(), pboopaque?.value?.toCPointer<ByteVar>(), pptlorg?.value?.toCPointer<ByteVar>(), mix)

public actual fun engTransparentBlt(psodst: COpaquePointer?, psosrc: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, prcldst: COpaquePointer?, prclsrc: COpaquePointer?, transcolor: UInt, bcalledfrombitblt: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engTransparentBlt(psodst?.value?.toCPointer<ByteVar>(), psosrc?.value?.toCPointer<ByteVar>(), pco?.value?.toCPointer<ByteVar>(), pxlo?.value?.toCPointer<ByteVar>(), prcldst?.value?.toCPointer<ByteVar>(), prclsrc?.value?.toCPointer<ByteVar>(), transcolor, bcalledfrombitblt)

public actual fun engUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: COpaquePointer?, unicodestring: Pcwstr, bytesinunicodestring: UInt) {
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engUnicodeToMultiByteN(multibytestring?.value?.toCPointer<ByteVar>(), maxbytesinmultibytestring, bytesinmultibytestring?.value?.toCPointer<ByteVar>(), unicodestring?.value?.toCPointer<ByteVar>(), bytesinunicodestring)
}

public actual fun engUnlockSurface(pso: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engUnlockSurface(pso?.value?.toCPointer<ByteVar>())
}

public actual fun engWideCharToMultiByte(codepage: UInt, widecharstring: Pcwstr, bytesinwidecharstring: Int, multibytestring: Pstr, bytesinmultibytestring: Int): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engWideCharToMultiByte(codepage, widecharstring?.value?.toCPointer<ByteVar>(), bytesinwidecharstring, multibytestring?.value?.toCPointer<ByteVar>(), bytesinmultibytestring)

public actual fun fontobjCGetAllGlyphHandles(pfo: COpaquePointer?, phg: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_fontobjCGetAllGlyphHandles(pfo?.value?.toCPointer<ByteVar>(), phg?.value?.toCPointer<ByteVar>())

public actual fun fontobjCGetGlyphs(pfo: COpaquePointer?, imode: UInt, cglyph: UInt, phg: COpaquePointer?, ppvglyph: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_fontobjCGetGlyphs(pfo?.value?.toCPointer<ByteVar>(), imode, cglyph, phg?.value?.toCPointer<ByteVar>(), ppvglyph?.value?.toCPointer<ByteVar>())

public actual fun fontobjPQueryGlyphAttrs(pfo: COpaquePointer?, imode: UInt): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_fontobjPQueryGlyphAttrs(pfo?.value?.toCPointer<ByteVar>(), imode)?.let { COpaquePointer(it.toLong()) }

public actual fun fontobjPfdg(pfo: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_fontobjPfdg(pfo?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fontobjPifi(pfo: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_fontobjPifi(pfo?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fontobjPvTrueTypeFontFile(pfo: COpaquePointer?, pcjfile: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_fontobjPvTrueTypeFontFile(pfo?.value?.toCPointer<ByteVar>(), pcjfile?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fontobjPxoGetXform(pfo: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_fontobjPxoGetXform(pfo?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fontobjVGetInfo(pfo: COpaquePointer?, cjsize: UInt, pfi: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_fontobjVGetInfo(pfo?.value?.toCPointer<ByteVar>(), cjsize, pfi?.value?.toCPointer<ByteVar>())
}

public actual fun getAutoRotationState(pstate: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getAutoRotationState(pstate?.value?.toCPointer<ByteVar>())

public actual fun getCapabilitiesStringLength(hmonitor: Handle, pdwcapabilitiesstringlengthincharacters: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getCapabilitiesStringLength(hmonitor?.value?.toCPointer<ByteVar>(), pdwcapabilitiesstringlengthincharacters?.value?.toCPointer<ByteVar>())

public actual fun getDisplayAutoRotationPreferences(porientation: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getDisplayAutoRotationPreferences(porientation?.value?.toCPointer<ByteVar>())

public actual fun getDisplayConfigBufferSizes(flags: QueryDisplayConfigFlags, numpatharrayelements: COpaquePointer?, nummodeinfoarrayelements: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getDisplayConfigBufferSizes(flags, numpatharrayelements?.value?.toCPointer<ByteVar>(), nummodeinfoarrayelements?.value?.toCPointer<ByteVar>())

public actual fun getMonitorBrightness(hmonitor: Handle, pdwminimumbrightness: COpaquePointer?, pdwcurrentbrightness: COpaquePointer?, pdwmaximumbrightness: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getMonitorBrightness(hmonitor?.value?.toCPointer<ByteVar>(), pdwminimumbrightness?.value?.toCPointer<ByteVar>(), pdwcurrentbrightness?.value?.toCPointer<ByteVar>(), pdwmaximumbrightness?.value?.toCPointer<ByteVar>())

public actual fun getMonitorCapabilities(hmonitor: Handle, pdwmonitorcapabilities: COpaquePointer?, pdwsupportedcolortemperatures: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getMonitorCapabilities(hmonitor?.value?.toCPointer<ByteVar>(), pdwmonitorcapabilities?.value?.toCPointer<ByteVar>(), pdwsupportedcolortemperatures?.value?.toCPointer<ByteVar>())

public actual fun getMonitorColorTemperature(hmonitor: Handle, pctcurrentcolortemperature: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getMonitorColorTemperature(hmonitor?.value?.toCPointer<ByteVar>(), pctcurrentcolortemperature?.value?.toCPointer<ByteVar>())

public actual fun getMonitorContrast(hmonitor: Handle, pdwminimumcontrast: COpaquePointer?, pdwcurrentcontrast: COpaquePointer?, pdwmaximumcontrast: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getMonitorContrast(hmonitor?.value?.toCPointer<ByteVar>(), pdwminimumcontrast?.value?.toCPointer<ByteVar>(), pdwcurrentcontrast?.value?.toCPointer<ByteVar>(), pdwmaximumcontrast?.value?.toCPointer<ByteVar>())

public actual fun getMonitorDisplayAreaPosition(hmonitor: Handle, ptpositiontype: McPositionType, pdwminimumposition: COpaquePointer?, pdwcurrentposition: COpaquePointer?, pdwmaximumposition: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getMonitorDisplayAreaPosition(hmonitor?.value?.toCPointer<ByteVar>(), ptpositiontype, pdwminimumposition?.value?.toCPointer<ByteVar>(), pdwcurrentposition?.value?.toCPointer<ByteVar>(), pdwmaximumposition?.value?.toCPointer<ByteVar>())

public actual fun getMonitorDisplayAreaSize(hmonitor: Handle, stsizetype: McSizeType, pdwminimumwidthorheight: COpaquePointer?, pdwcurrentwidthorheight: COpaquePointer?, pdwmaximumwidthorheight: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getMonitorDisplayAreaSize(hmonitor?.value?.toCPointer<ByteVar>(), stsizetype, pdwminimumwidthorheight?.value?.toCPointer<ByteVar>(), pdwcurrentwidthorheight?.value?.toCPointer<ByteVar>(), pdwmaximumwidthorheight?.value?.toCPointer<ByteVar>())

public actual fun getMonitorRedGreenOrBlueDrive(hmonitor: Handle, dtdrivetype: McDriveType, pdwminimumdrive: COpaquePointer?, pdwcurrentdrive: COpaquePointer?, pdwmaximumdrive: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getMonitorRedGreenOrBlueDrive(hmonitor?.value?.toCPointer<ByteVar>(), dtdrivetype, pdwminimumdrive?.value?.toCPointer<ByteVar>(), pdwcurrentdrive?.value?.toCPointer<ByteVar>(), pdwmaximumdrive?.value?.toCPointer<ByteVar>())

public actual fun getMonitorRedGreenOrBlueGain(hmonitor: Handle, gtgaintype: McGainType, pdwminimumgain: COpaquePointer?, pdwcurrentgain: COpaquePointer?, pdwmaximumgain: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getMonitorRedGreenOrBlueGain(hmonitor?.value?.toCPointer<ByteVar>(), gtgaintype, pdwminimumgain?.value?.toCPointer<ByteVar>(), pdwcurrentgain?.value?.toCPointer<ByteVar>(), pdwmaximumgain?.value?.toCPointer<ByteVar>())

public actual fun getMonitorTechnologyType(hmonitor: Handle, pdtydisplaytechnologytype: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getMonitorTechnologyType(hmonitor?.value?.toCPointer<ByteVar>(), pdtydisplaytechnologytype?.value?.toCPointer<ByteVar>())

public actual fun getNumberOfPhysicalMonitorsFromHMONITOR(hmonitor: Hmonitor, pdwnumberofphysicalmonitors: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getNumberOfPhysicalMonitorsFromHMONITOR(hmonitor?.value?.toCPointer<ByteVar>(), pdwnumberofphysicalmonitors?.value?.toCPointer<ByteVar>())

public actual fun getPhysicalMonitorsFromHMONITOR(hmonitor: Hmonitor, dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getPhysicalMonitorsFromHMONITOR(hmonitor?.value?.toCPointer<ByteVar>(), dwphysicalmonitorarraysize, pphysicalmonitorarray?.value?.toCPointer<ByteVar>())

public actual fun getTimingReport(hmonitor: Handle, pmtrmonitortimingreport: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getTimingReport(hmonitor?.value?.toCPointer<ByteVar>(), pmtrmonitortimingreport?.value?.toCPointer<ByteVar>())

public actual fun getVCPFeatureAndVCPFeatureReply(hmonitor: Handle, bvcpcode: UByte, pvct: COpaquePointer?, pdwcurrentvalue: COpaquePointer?, pdwmaximumvalue: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getVCPFeatureAndVCPFeatureReply(hmonitor?.value?.toCPointer<ByteVar>(), bvcpcode, pvct?.value?.toCPointer<ByteVar>(), pdwcurrentvalue?.value?.toCPointer<ByteVar>(), pdwmaximumvalue?.value?.toCPointer<ByteVar>())

public actual fun htGet8BppformatPalette(ppaletteentry: COpaquePointer?, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_htGet8BppformatPalette(ppaletteentry?.value?.toCPointer<ByteVar>(), redgamma, greengamma, bluegamma)

public actual fun htGet8BppmaskPalette(ppaletteentry: COpaquePointer?, use8bppmaskpal: Bool, cmymask: UByte, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_htGet8BppmaskPalette(ppaletteentry?.value?.toCPointer<ByteVar>(), use8bppmaskpal, cmymask, redgamma, greengamma, bluegamma)

public actual fun pathobjBEnum(ppo: COpaquePointer?, ppd: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_pathobjBEnum(ppo?.value?.toCPointer<ByteVar>(), ppd?.value?.toCPointer<ByteVar>())

public actual fun pathobjBEnumClipLines(ppo: COpaquePointer?, cb: UInt, pcl: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_pathobjBEnumClipLines(ppo?.value?.toCPointer<ByteVar>(), cb, pcl?.value?.toCPointer<ByteVar>())

public actual fun pathobjVEnumStart(ppo: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_pathobjVEnumStart(ppo?.value?.toCPointer<ByteVar>())
}

public actual fun pathobjVEnumStartClipLines(ppo: COpaquePointer?, pco: COpaquePointer?, pso: COpaquePointer?, pla: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_pathobjVEnumStartClipLines(ppo?.value?.toCPointer<ByteVar>(), pco?.value?.toCPointer<ByteVar>(), pso?.value?.toCPointer<ByteVar>(), pla?.value?.toCPointer<ByteVar>())
}

public actual fun pathobjVGetBounds(ppo: COpaquePointer?, prectfx: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_pathobjVGetBounds(ppo?.value?.toCPointer<ByteVar>(), prectfx?.value?.toCPointer<ByteVar>())
}

public actual fun queryDisplayConfig(flags: QueryDisplayConfigFlags, numpatharrayelements: COpaquePointer?, patharray: COpaquePointer?, nummodeinfoarrayelements: COpaquePointer?, modeinfoarray: COpaquePointer?, currenttopologyid: COpaquePointer?): Win32Error =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_queryDisplayConfig(flags, numpatharrayelements?.value?.toCPointer<ByteVar>(), patharray?.value?.toCPointer<ByteVar>(), nummodeinfoarrayelements?.value?.toCPointer<ByteVar>(), modeinfoarray?.value?.toCPointer<ByteVar>(), currenttopologyid?.value?.toCPointer<ByteVar>())

public actual fun restoreMonitorFactoryColorDefaults(hmonitor: Handle): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_restoreMonitorFactoryColorDefaults(hmonitor?.value?.toCPointer<ByteVar>())

public actual fun restoreMonitorFactoryDefaults(hmonitor: Handle): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_restoreMonitorFactoryDefaults(hmonitor?.value?.toCPointer<ByteVar>())

public actual fun strobjBEnum(pstro: COpaquePointer?, pc: COpaquePointer?, ppgpos: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_strobjBEnum(pstro?.value?.toCPointer<ByteVar>(), pc?.value?.toCPointer<ByteVar>(), ppgpos?.value?.toCPointer<ByteVar>())

public actual fun strobjBEnumPositionsOnly(pstro: COpaquePointer?, pc: COpaquePointer?, ppgpos: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_strobjBEnumPositionsOnly(pstro?.value?.toCPointer<ByteVar>(), pc?.value?.toCPointer<ByteVar>(), ppgpos?.value?.toCPointer<ByteVar>())

public actual fun strobjBGetAdvanceWidths(pso: COpaquePointer?, ifirst: UInt, c: UInt, pptqd: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_strobjBGetAdvanceWidths(pso?.value?.toCPointer<ByteVar>(), ifirst, c, pptqd?.value?.toCPointer<ByteVar>())

public actual fun strobjDwGetCodePage(pstro: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_strobjDwGetCodePage(pstro?.value?.toCPointer<ByteVar>())

public actual fun strobjVEnumStart(pstro: COpaquePointer?) {
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_strobjVEnumStart(pstro?.value?.toCPointer<ByteVar>())
}

public actual fun saveCurrentMonitorSettings(hmonitor: Handle): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_saveCurrentMonitorSettings(hmonitor?.value?.toCPointer<ByteVar>())

public actual fun saveCurrentSettings(hmonitor: Handle): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_saveCurrentSettings(hmonitor?.value?.toCPointer<ByteVar>())

public actual fun setDisplayAutoRotationPreferences(orientation: OrientationPreference): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_setDisplayAutoRotationPreferences(orientation)

public actual fun setDisplayConfig(numpatharrayelements: UInt, patharray: COpaquePointer?, nummodeinfoarrayelements: UInt, modeinfoarray: COpaquePointer?, flags: SetDisplayConfigFlags): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_setDisplayConfig(numpatharrayelements, patharray?.value?.toCPointer<ByteVar>(), nummodeinfoarrayelements, modeinfoarray?.value?.toCPointer<ByteVar>(), flags)

public actual fun setMonitorBrightness(hmonitor: Handle, dwnewbrightness: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_setMonitorBrightness(hmonitor?.value?.toCPointer<ByteVar>(), dwnewbrightness)

public actual fun setMonitorColorTemperature(hmonitor: Handle, ctcurrentcolortemperature: McColorTemperature): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_setMonitorColorTemperature(hmonitor?.value?.toCPointer<ByteVar>(), ctcurrentcolortemperature)

public actual fun setMonitorContrast(hmonitor: Handle, dwnewcontrast: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_setMonitorContrast(hmonitor?.value?.toCPointer<ByteVar>(), dwnewcontrast)

public actual fun setMonitorDisplayAreaPosition(hmonitor: Handle, ptpositiontype: McPositionType, dwnewposition: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_setMonitorDisplayAreaPosition(hmonitor?.value?.toCPointer<ByteVar>(), ptpositiontype, dwnewposition)

public actual fun setMonitorDisplayAreaSize(hmonitor: Handle, stsizetype: McSizeType, dwnewdisplayareawidthorheight: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_setMonitorDisplayAreaSize(hmonitor?.value?.toCPointer<ByteVar>(), stsizetype, dwnewdisplayareawidthorheight)

public actual fun setMonitorRedGreenOrBlueDrive(hmonitor: Handle, dtdrivetype: McDriveType, dwnewdrive: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_setMonitorRedGreenOrBlueDrive(hmonitor?.value?.toCPointer<ByteVar>(), dtdrivetype, dwnewdrive)

public actual fun setMonitorRedGreenOrBlueGain(hmonitor: Handle, gtgaintype: McGainType, dwnewgain: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_setMonitorRedGreenOrBlueGain(hmonitor?.value?.toCPointer<ByteVar>(), gtgaintype, dwnewgain)

public actual fun setVCPFeature(hmonitor: Handle, bvcpcode: UByte, dwnewvalue: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_setVCPFeature(hmonitor?.value?.toCPointer<ByteVar>(), bvcpcode, dwnewvalue)

public actual fun xformobjBApplyXform(pxo: COpaquePointer?, imode: UInt, cpoints: UInt, pvin: COpaquePointer?, pvout: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_xformobjBApplyXform(pxo?.value?.toCPointer<ByteVar>(), imode, cpoints, pvin?.value?.toCPointer<ByteVar>(), pvout?.value?.toCPointer<ByteVar>())

public actual fun xformobjIGetXform(pxo: COpaquePointer?, pxform: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_xformobjIGetXform(pxo?.value?.toCPointer<ByteVar>(), pxform?.value?.toCPointer<ByteVar>())

public actual fun xlateobjCGetPalette(pxlo: COpaquePointer?, ipal: UInt, cpal: UInt, ppal: COpaquePointer?): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_xlateobjCGetPalette(pxlo?.value?.toCPointer<ByteVar>(), ipal, cpal, ppal?.value?.toCPointer<ByteVar>())

public actual fun xlateobjHGetColorTransform(pxlo: COpaquePointer?): Handle =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_xlateobjHGetColorTransform(pxlo?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun xlateobjIXlate(pxlo: COpaquePointer?, icolor: UInt): UInt =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_xlateobjIXlate(pxlo?.value?.toCPointer<ByteVar>(), icolor)

public actual fun xlateobjPiVector(pxlo: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_xlateobjPiVector(pxlo?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }
