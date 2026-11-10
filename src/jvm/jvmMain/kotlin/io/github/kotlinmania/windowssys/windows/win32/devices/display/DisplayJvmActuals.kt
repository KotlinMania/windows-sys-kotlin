@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32DevicesDisplayJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_brushobjHGetColorTransform(pbo: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_brushobjPvAllocRbrush(pbo: Long, cj: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_brushobjPvGetRbrush(pbo: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_brushobjUlGetBrushColor(pbo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_clipobjBEnum(pco: Long, cj: Int, pul: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_clipobjCEnumStart(pco: Long, ball: Int, itype: Int, idirection: Int, climit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_clipobjPpoGetPath(pco: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_capabilitiesRequestAndCapabilitiesReply(hmonitor: Long, pszasciicapabilitiesstring: Long, dwcapabilitiesstringlengthincharacters: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_degaussMonitor(hmonitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_destroyPhysicalMonitor(hmonitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_destroyPhysicalMonitors(dwphysicalmonitorarraysize: Int, pphysicalmonitorarray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_displayConfigGetDeviceInfo(requestpacket: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_displayConfigSetDeviceInfo(setpacket: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engAcquireSemaphore(hsem: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engAlphaBlend(psodest: Long, psosrc: Long, pco: Long, pxlo: Long, prcldest: Long, prclsrc: Long, pblendobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engAssociateSurface(hsurf: Long, hdev: Long, flhooks: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engBitBlt(psotrg: Long, psosrc: Long, psomask: Long, pco: Long, pxlo: Long, prcltrg: Long, pptlsrc: Long, pptlmask: Long, pbo: Long, pptlbrush: Long, rop4: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engCheckAbort(pso: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engComputeGlyphSet(ncodepage: Int, nfirstchar: Int, cchars: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engCopyBits(psodest: Long, psosrc: Long, pco: Long, pxlo: Long, prcldest: Long, pptlsrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engCreateClip(): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engCreatePalette(imode: Int, ccolors: Int, pulcolors: Long, flred: Int, flgreen: Int, flblue: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engCreateSemaphore(): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engDeleteClip(pco: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engDeletePalette(hpal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engDeletePath(ppo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engDeleteSemaphore(hsem: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engDeleteSurface(hsurf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engEraseSurface(pso: Long, prcl: Long, icolor: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engFillPath(pso: Long, ppo: Long, pco: Long, pbo: Long, pptlbrushorg: Long, mix: Int, floptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engFindResource(h: Long, iname: Int, itype: Int, pulsize: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engFreeModule(h: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engGetCurrentCodePage(oemcodepage: Long, ansicodepage: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engGetDriverName(hdev: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engGetPrinterDataFileName(hdev: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engGradientFill(psodest: Long, pco: Long, pxlo: Long, pvertex: Long, nvertex: Int, pmesh: Long, nmesh: Int, prclextents: Long, pptlditherorg: Long, ulmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engLineTo(pso: Long, pco: Long, pbo: Long, x1: Int, y1: Int, x2: Int, y2: Int, prclbounds: Long, mix: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engLoadModule(pwsz: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engLockSurface(hsurf: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engMarkBandingSurface(hsurf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engMultiByteToUnicodeN(unicodestring: Long, maxbytesinunicodestring: Int, bytesinunicodestring: Long, multibytestring: Long, bytesinmultibytestring: Int)

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engMultiByteToWideChar(codepage: Int, widecharstring: Long, bytesinwidecharstring: Int, multibytestring: Long, bytesinmultibytestring: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engPaint(pso: Long, pco: Long, pbo: Long, pptlbrushorg: Long, mix: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engPlgBlt(psotrg: Long, psosrc: Long, psomsk: Long, pco: Long, pxlo: Long, pca: Long, pptlbrushorg: Long, pptfx: Long, prcl: Long, pptl: Long, imode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engQueryEMFInfo(hdev: Long, pemfinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engQueryLocalTime(param0: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engReleaseSemaphore(hsem: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engStretchBlt(psodest: Long, psosrc: Long, psomask: Long, pco: Long, pxlo: Long, pca: Long, pptlhtorg: Long, prcldest: Long, prclsrc: Long, pptlmask: Long, imode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engStretchBltROP(psodest: Long, psosrc: Long, psomask: Long, pco: Long, pxlo: Long, pca: Long, pptlhtorg: Long, prcldest: Long, prclsrc: Long, pptlmask: Long, imode: Int, pbo: Long, rop4: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engStrokeAndFillPath(pso: Long, ppo: Long, pco: Long, pxo: Long, pbostroke: Long, plineattrs: Long, pbofill: Long, pptlbrushorg: Long, mixfill: Int, floptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engStrokePath(pso: Long, ppo: Long, pco: Long, pxo: Long, pbo: Long, pptlbrushorg: Long, plineattrs: Long, mix: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engTextOut(pso: Long, pstro: Long, pfo: Long, pco: Long, prclextra: Long, prclopaque: Long, pbofore: Long, pboopaque: Long, pptlorg: Long, mix: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engTransparentBlt(psodst: Long, psosrc: Long, pco: Long, pxlo: Long, prcldst: Long, prclsrc: Long, transcolor: Int, bcalledfrombitblt: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engUnicodeToMultiByteN(multibytestring: Long, maxbytesinmultibytestring: Int, bytesinmultibytestring: Long, unicodestring: Long, bytesinunicodestring: Int)

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engUnlockSurface(pso: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_engWideCharToMultiByte(codepage: Int, widecharstring: Long, bytesinwidecharstring: Int, multibytestring: Long, bytesinmultibytestring: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_fontobjCGetAllGlyphHandles(pfo: Long, phg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_fontobjCGetGlyphs(pfo: Long, imode: Int, cglyph: Int, phg: Long, ppvglyph: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_fontobjPQueryGlyphAttrs(pfo: Long, imode: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_fontobjPfdg(pfo: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_fontobjPifi(pfo: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_fontobjPvTrueTypeFontFile(pfo: Long, pcjfile: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_fontobjPxoGetXform(pfo: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_fontobjVGetInfo(pfo: Long, cjsize: Int, pfi: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_getAutoRotationState(pstate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_getCapabilitiesStringLength(hmonitor: Long, pdwcapabilitiesstringlengthincharacters: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_getDisplayAutoRotationPreferences(porientation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_getDisplayConfigBufferSizes(flags: Int, numpatharrayelements: Long, nummodeinfoarrayelements: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_getMonitorBrightness(hmonitor: Long, pdwminimumbrightness: Long, pdwcurrentbrightness: Long, pdwmaximumbrightness: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_getMonitorCapabilities(hmonitor: Long, pdwmonitorcapabilities: Long, pdwsupportedcolortemperatures: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_getMonitorColorTemperature(hmonitor: Long, pctcurrentcolortemperature: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_getMonitorContrast(hmonitor: Long, pdwminimumcontrast: Long, pdwcurrentcontrast: Long, pdwmaximumcontrast: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_getMonitorDisplayAreaPosition(hmonitor: Long, ptpositiontype: Int, pdwminimumposition: Long, pdwcurrentposition: Long, pdwmaximumposition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_getMonitorDisplayAreaSize(hmonitor: Long, stsizetype: Int, pdwminimumwidthorheight: Long, pdwcurrentwidthorheight: Long, pdwmaximumwidthorheight: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_getMonitorRedGreenOrBlueDrive(hmonitor: Long, dtdrivetype: Int, pdwminimumdrive: Long, pdwcurrentdrive: Long, pdwmaximumdrive: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_getMonitorRedGreenOrBlueGain(hmonitor: Long, gtgaintype: Int, pdwminimumgain: Long, pdwcurrentgain: Long, pdwmaximumgain: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_getMonitorTechnologyType(hmonitor: Long, pdtydisplaytechnologytype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_getNumberOfPhysicalMonitorsFromHMONITOR(hmonitor: Long, pdwnumberofphysicalmonitors: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_getPhysicalMonitorsFromHMONITOR(hmonitor: Long, dwphysicalmonitorarraysize: Int, pphysicalmonitorarray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_getTimingReport(hmonitor: Long, pmtrmonitortimingreport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_getVCPFeatureAndVCPFeatureReply(hmonitor: Long, bvcpcode: Byte, pvct: Long, pdwcurrentvalue: Long, pdwmaximumvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_htGet8BppformatPalette(ppaletteentry: Long, redgamma: Short, greengamma: Short, bluegamma: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_htGet8BppmaskPalette(ppaletteentry: Long, use8bppmaskpal: Int, cmymask: Byte, redgamma: Short, greengamma: Short, bluegamma: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_pathobjBEnum(ppo: Long, ppd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_pathobjBEnumClipLines(ppo: Long, cb: Int, pcl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_pathobjVEnumStart(ppo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_pathobjVEnumStartClipLines(ppo: Long, pco: Long, pso: Long, pla: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_pathobjVGetBounds(ppo: Long, prectfx: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_queryDisplayConfig(flags: Int, numpatharrayelements: Long, patharray: Long, nummodeinfoarrayelements: Long, modeinfoarray: Long, currenttopologyid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_restoreMonitorFactoryColorDefaults(hmonitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_restoreMonitorFactoryDefaults(hmonitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_strobjBEnum(pstro: Long, pc: Long, ppgpos: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_strobjBEnumPositionsOnly(pstro: Long, pc: Long, ppgpos: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_strobjBGetAdvanceWidths(pso: Long, ifirst: Int, c: Int, pptqd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_strobjDwGetCodePage(pstro: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_strobjVEnumStart(pstro: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_saveCurrentMonitorSettings(hmonitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_saveCurrentSettings(hmonitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_setDisplayAutoRotationPreferences(orientation: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_setDisplayConfig(numpatharrayelements: Int, patharray: Long, nummodeinfoarrayelements: Int, modeinfoarray: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_setMonitorBrightness(hmonitor: Long, dwnewbrightness: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_setMonitorColorTemperature(hmonitor: Long, ctcurrentcolortemperature: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_setMonitorContrast(hmonitor: Long, dwnewcontrast: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_setMonitorDisplayAreaPosition(hmonitor: Long, ptpositiontype: Int, dwnewposition: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_setMonitorDisplayAreaSize(hmonitor: Long, stsizetype: Int, dwnewdisplayareawidthorheight: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_setMonitorRedGreenOrBlueDrive(hmonitor: Long, dtdrivetype: Int, dwnewdrive: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_setMonitorRedGreenOrBlueGain(hmonitor: Long, gtgaintype: Int, dwnewgain: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_setVCPFeature(hmonitor: Long, bvcpcode: Byte, dwnewvalue: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_xformobjBApplyXform(pxo: Long, imode: Int, cpoints: Int, pvin: Long, pvout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_xformobjIGetXform(pxo: Long, pxform: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_xlateobjCGetPalette(pxlo: Long, ipal: Int, cpal: Int, ppal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_xlateobjHGetColorTransform(pxlo: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_xlateobjIXlate(pxlo: Long, icolor: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_xlateobjPiVector(pxlo: Long): Long
}

public actual fun brushobjHGetColorTransform(pbo: COpaquePointer?): Handle =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_brushobjHGetColorTransform((pbo?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun brushobjPvAllocRbrush(pbo: COpaquePointer?, cj: UInt): COpaquePointer? =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_brushobjPvAllocRbrush((pbo?.value ?: 0L), cj.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun brushobjPvGetRbrush(pbo: COpaquePointer?): COpaquePointer? =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_brushobjPvGetRbrush((pbo?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun brushobjUlGetBrushColor(pbo: COpaquePointer?): UInt =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_brushobjUlGetBrushColor((pbo?.value ?: 0L)).toUInt()

public actual fun clipobjBEnum(pco: COpaquePointer?, cj: UInt, pul: COpaquePointer?): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_clipobjBEnum((pco?.value ?: 0L), cj.toInt(), (pul?.value ?: 0L))

public actual fun clipobjCEnumStart(pco: COpaquePointer?, ball: Bool, itype: UInt, idirection: UInt, climit: UInt): UInt =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_clipobjCEnumStart((pco?.value ?: 0L), ball, itype.toInt(), idirection.toInt(), climit.toInt()).toUInt()

public actual fun clipobjPpoGetPath(pco: COpaquePointer?): COpaquePointer? =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_clipobjPpoGetPath((pco?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun capabilitiesRequestAndCapabilitiesReply(hmonitor: Handle, pszasciicapabilitiesstring: Pstr, dwcapabilitiesstringlengthincharacters: UInt): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_capabilitiesRequestAndCapabilitiesReply((hmonitor?.value ?: 0L), (pszasciicapabilitiesstring?.value ?: 0L), dwcapabilitiesstringlengthincharacters.toInt())

public actual fun degaussMonitor(hmonitor: Handle): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_degaussMonitor((hmonitor?.value ?: 0L))

public actual fun destroyPhysicalMonitor(hmonitor: Handle): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_destroyPhysicalMonitor((hmonitor?.value ?: 0L))

public actual fun destroyPhysicalMonitors(dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: COpaquePointer?): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_destroyPhysicalMonitors(dwphysicalmonitorarraysize.toInt(), (pphysicalmonitorarray?.value ?: 0L))

public actual fun displayConfigGetDeviceInfo(requestpacket: COpaquePointer?): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_displayConfigGetDeviceInfo((requestpacket?.value ?: 0L))

public actual fun displayConfigSetDeviceInfo(setpacket: COpaquePointer?): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_displayConfigSetDeviceInfo((setpacket?.value ?: 0L))

public actual fun engAcquireSemaphore(hsem: Hsemaphore) {
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engAcquireSemaphore((hsem?.value ?: 0L))
}

public actual fun engAlphaBlend(psodest: COpaquePointer?, psosrc: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, prcldest: COpaquePointer?, prclsrc: COpaquePointer?, pblendobj: COpaquePointer?): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engAlphaBlend((psodest?.value ?: 0L), (psosrc?.value ?: 0L), (pco?.value ?: 0L), (pxlo?.value ?: 0L), (prcldest?.value ?: 0L), (prclsrc?.value ?: 0L), (pblendobj?.value ?: 0L))

public actual fun engAssociateSurface(hsurf: Hsurf, hdev: Hdev, flhooks: UInt): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engAssociateSurface((hsurf?.value ?: 0L), (hdev?.value ?: 0L), flhooks.toInt())

public actual fun engBitBlt(psotrg: COpaquePointer?, psosrc: COpaquePointer?, psomask: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, prcltrg: COpaquePointer?, pptlsrc: COpaquePointer?, pptlmask: COpaquePointer?, pbo: COpaquePointer?, pptlbrush: COpaquePointer?, rop4: UInt): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engBitBlt((psotrg?.value ?: 0L), (psosrc?.value ?: 0L), (psomask?.value ?: 0L), (pco?.value ?: 0L), (pxlo?.value ?: 0L), (prcltrg?.value ?: 0L), (pptlsrc?.value ?: 0L), (pptlmask?.value ?: 0L), (pbo?.value ?: 0L), (pptlbrush?.value ?: 0L), rop4.toInt())

public actual fun engCheckAbort(pso: COpaquePointer?): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engCheckAbort((pso?.value ?: 0L))

public actual fun engComputeGlyphSet(ncodepage: Int, nfirstchar: Int, cchars: Int): COpaquePointer? =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engComputeGlyphSet(ncodepage, nfirstchar, cchars).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun engCopyBits(psodest: COpaquePointer?, psosrc: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, prcldest: COpaquePointer?, pptlsrc: COpaquePointer?): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engCopyBits((psodest?.value ?: 0L), (psosrc?.value ?: 0L), (pco?.value ?: 0L), (pxlo?.value ?: 0L), (prcldest?.value ?: 0L), (pptlsrc?.value ?: 0L))

public actual fun engCreateBitmap(sizl: Size, lwidth: Int, iformat: UInt, fl: UInt, pvbits: COpaquePointer?): Hbitmap =
    null

public actual fun engCreateClip(): COpaquePointer? =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engCreateClip().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun engCreateDeviceBitmap(dhsurf: Dhsurf, sizl: Size, iformatcompat: UInt): Hbitmap =
    null

public actual fun engCreateDeviceSurface(dhsurf: Dhsurf, sizl: Size, iformatcompat: UInt): Hsurf =
    null

public actual fun engCreatePalette(imode: UInt, ccolors: UInt, pulcolors: COpaquePointer?, flred: UInt, flgreen: UInt, flblue: UInt): Hpalette =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engCreatePalette(imode.toInt(), ccolors.toInt(), (pulcolors?.value ?: 0L), flred.toInt(), flgreen.toInt(), flblue.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun engCreateSemaphore(): Hsemaphore =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engCreateSemaphore().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun engDeleteClip(pco: COpaquePointer?) {
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engDeleteClip((pco?.value ?: 0L))
}

public actual fun engDeletePalette(hpal: Hpalette): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engDeletePalette((hpal?.value ?: 0L))

public actual fun engDeletePath(ppo: COpaquePointer?) {
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engDeletePath((ppo?.value ?: 0L))
}

public actual fun engDeleteSemaphore(hsem: Hsemaphore) {
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engDeleteSemaphore((hsem?.value ?: 0L))
}

public actual fun engDeleteSurface(hsurf: Hsurf): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engDeleteSurface((hsurf?.value ?: 0L))

public actual fun engEraseSurface(pso: COpaquePointer?, prcl: COpaquePointer?, icolor: UInt): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engEraseSurface((pso?.value ?: 0L), (prcl?.value ?: 0L), icolor.toInt())

public actual fun engFillPath(pso: COpaquePointer?, ppo: COpaquePointer?, pco: COpaquePointer?, pbo: COpaquePointer?, pptlbrushorg: COpaquePointer?, mix: UInt, floptions: UInt): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engFillPath((pso?.value ?: 0L), (ppo?.value ?: 0L), (pco?.value ?: 0L), (pbo?.value ?: 0L), (pptlbrushorg?.value ?: 0L), mix.toInt(), floptions.toInt())

public actual fun engFindResource(h: Handle, iname: Int, itype: Int, pulsize: COpaquePointer?): COpaquePointer? =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engFindResource((h?.value ?: 0L), iname, itype, (pulsize?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun engFreeModule(h: Handle) {
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engFreeModule((h?.value ?: 0L))
}

public actual fun engGetCurrentCodePage(oemcodepage: COpaquePointer?, ansicodepage: COpaquePointer?) {
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engGetCurrentCodePage((oemcodepage?.value ?: 0L), (ansicodepage?.value ?: 0L))
}

public actual fun engGetDriverName(hdev: Hdev): Pwstr =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engGetDriverName((hdev?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun engGetPrinterDataFileName(hdev: Hdev): Pwstr =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engGetPrinterDataFileName((hdev?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun engGradientFill(psodest: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, pvertex: COpaquePointer?, nvertex: UInt, pmesh: COpaquePointer?, nmesh: UInt, prclextents: COpaquePointer?, pptlditherorg: COpaquePointer?, ulmode: UInt): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engGradientFill((psodest?.value ?: 0L), (pco?.value ?: 0L), (pxlo?.value ?: 0L), (pvertex?.value ?: 0L), nvertex.toInt(), (pmesh?.value ?: 0L), nmesh.toInt(), (prclextents?.value ?: 0L), (pptlditherorg?.value ?: 0L), ulmode.toInt())

public actual fun engLineTo(pso: COpaquePointer?, pco: COpaquePointer?, pbo: COpaquePointer?, x1: Int, y1: Int, x2: Int, y2: Int, prclbounds: COpaquePointer?, mix: UInt): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engLineTo((pso?.value ?: 0L), (pco?.value ?: 0L), (pbo?.value ?: 0L), x1, y1, x2, y2, (prclbounds?.value ?: 0L), mix.toInt())

public actual fun engLoadModule(pwsz: Pcwstr): Handle =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engLoadModule((pwsz?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun engLockSurface(hsurf: Hsurf): COpaquePointer? =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engLockSurface((hsurf?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun engMarkBandingSurface(hsurf: Hsurf): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engMarkBandingSurface((hsurf?.value ?: 0L))

public actual fun engMultiByteToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: COpaquePointer?, multibytestring: Pcstr, bytesinmultibytestring: UInt) {
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engMultiByteToUnicodeN((unicodestring?.value ?: 0L), maxbytesinunicodestring.toInt(), (bytesinunicodestring?.value ?: 0L), (multibytestring?.value ?: 0L), bytesinmultibytestring.toInt())
}

public actual fun engMultiByteToWideChar(codepage: UInt, widecharstring: Pwstr, bytesinwidecharstring: Int, multibytestring: Pcstr, bytesinmultibytestring: Int): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engMultiByteToWideChar(codepage.toInt(), (widecharstring?.value ?: 0L), bytesinwidecharstring, (multibytestring?.value ?: 0L), bytesinmultibytestring)

public actual fun engPaint(pso: COpaquePointer?, pco: COpaquePointer?, pbo: COpaquePointer?, pptlbrushorg: COpaquePointer?, mix: UInt): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engPaint((pso?.value ?: 0L), (pco?.value ?: 0L), (pbo?.value ?: 0L), (pptlbrushorg?.value ?: 0L), mix.toInt())

public actual fun engPlgBlt(psotrg: COpaquePointer?, psosrc: COpaquePointer?, psomsk: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, pca: COpaquePointer?, pptlbrushorg: COpaquePointer?, pptfx: COpaquePointer?, prcl: COpaquePointer?, pptl: COpaquePointer?, imode: UInt): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engPlgBlt((psotrg?.value ?: 0L), (psosrc?.value ?: 0L), (psomsk?.value ?: 0L), (pco?.value ?: 0L), (pxlo?.value ?: 0L), (pca?.value ?: 0L), (pptlbrushorg?.value ?: 0L), (pptfx?.value ?: 0L), (prcl?.value ?: 0L), (pptl?.value ?: 0L), imode.toInt())

public actual fun engQueryEMFInfo(hdev: Hdev, pemfinfo: COpaquePointer?): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engQueryEMFInfo((hdev?.value ?: 0L), (pemfinfo?.value ?: 0L))

public actual fun engQueryLocalTime(param0: COpaquePointer?) {
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engQueryLocalTime((param0?.value ?: 0L))
}

public actual fun engReleaseSemaphore(hsem: Hsemaphore) {
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engReleaseSemaphore((hsem?.value ?: 0L))
}

public actual fun engStretchBlt(psodest: COpaquePointer?, psosrc: COpaquePointer?, psomask: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, pca: COpaquePointer?, pptlhtorg: COpaquePointer?, prcldest: COpaquePointer?, prclsrc: COpaquePointer?, pptlmask: COpaquePointer?, imode: UInt): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engStretchBlt((psodest?.value ?: 0L), (psosrc?.value ?: 0L), (psomask?.value ?: 0L), (pco?.value ?: 0L), (pxlo?.value ?: 0L), (pca?.value ?: 0L), (pptlhtorg?.value ?: 0L), (prcldest?.value ?: 0L), (prclsrc?.value ?: 0L), (pptlmask?.value ?: 0L), imode.toInt())

public actual fun engStretchBltROP(psodest: COpaquePointer?, psosrc: COpaquePointer?, psomask: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, pca: COpaquePointer?, pptlhtorg: COpaquePointer?, prcldest: COpaquePointer?, prclsrc: COpaquePointer?, pptlmask: COpaquePointer?, imode: UInt, pbo: COpaquePointer?, rop4: UInt): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engStretchBltROP((psodest?.value ?: 0L), (psosrc?.value ?: 0L), (psomask?.value ?: 0L), (pco?.value ?: 0L), (pxlo?.value ?: 0L), (pca?.value ?: 0L), (pptlhtorg?.value ?: 0L), (prcldest?.value ?: 0L), (prclsrc?.value ?: 0L), (pptlmask?.value ?: 0L), imode.toInt(), (pbo?.value ?: 0L), rop4.toInt())

public actual fun engStrokeAndFillPath(pso: COpaquePointer?, ppo: COpaquePointer?, pco: COpaquePointer?, pxo: COpaquePointer?, pbostroke: COpaquePointer?, plineattrs: COpaquePointer?, pbofill: COpaquePointer?, pptlbrushorg: COpaquePointer?, mixfill: UInt, floptions: UInt): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engStrokeAndFillPath((pso?.value ?: 0L), (ppo?.value ?: 0L), (pco?.value ?: 0L), (pxo?.value ?: 0L), (pbostroke?.value ?: 0L), (plineattrs?.value ?: 0L), (pbofill?.value ?: 0L), (pptlbrushorg?.value ?: 0L), mixfill.toInt(), floptions.toInt())

public actual fun engStrokePath(pso: COpaquePointer?, ppo: COpaquePointer?, pco: COpaquePointer?, pxo: COpaquePointer?, pbo: COpaquePointer?, pptlbrushorg: COpaquePointer?, plineattrs: COpaquePointer?, mix: UInt): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engStrokePath((pso?.value ?: 0L), (ppo?.value ?: 0L), (pco?.value ?: 0L), (pxo?.value ?: 0L), (pbo?.value ?: 0L), (pptlbrushorg?.value ?: 0L), (plineattrs?.value ?: 0L), mix.toInt())

public actual fun engTextOut(pso: COpaquePointer?, pstro: COpaquePointer?, pfo: COpaquePointer?, pco: COpaquePointer?, prclextra: COpaquePointer?, prclopaque: COpaquePointer?, pbofore: COpaquePointer?, pboopaque: COpaquePointer?, pptlorg: COpaquePointer?, mix: UInt): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engTextOut((pso?.value ?: 0L), (pstro?.value ?: 0L), (pfo?.value ?: 0L), (pco?.value ?: 0L), (prclextra?.value ?: 0L), (prclopaque?.value ?: 0L), (pbofore?.value ?: 0L), (pboopaque?.value ?: 0L), (pptlorg?.value ?: 0L), mix.toInt())

public actual fun engTransparentBlt(psodst: COpaquePointer?, psosrc: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, prcldst: COpaquePointer?, prclsrc: COpaquePointer?, transcolor: UInt, bcalledfrombitblt: UInt): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engTransparentBlt((psodst?.value ?: 0L), (psosrc?.value ?: 0L), (pco?.value ?: 0L), (pxlo?.value ?: 0L), (prcldst?.value ?: 0L), (prclsrc?.value ?: 0L), transcolor.toInt(), bcalledfrombitblt.toInt())

public actual fun engUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: COpaquePointer?, unicodestring: Pcwstr, bytesinunicodestring: UInt) {
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engUnicodeToMultiByteN((multibytestring?.value ?: 0L), maxbytesinmultibytestring.toInt(), (bytesinmultibytestring?.value ?: 0L), (unicodestring?.value ?: 0L), bytesinunicodestring.toInt())
}

public actual fun engUnlockSurface(pso: COpaquePointer?) {
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engUnlockSurface((pso?.value ?: 0L))
}

public actual fun engWideCharToMultiByte(codepage: UInt, widecharstring: Pcwstr, bytesinwidecharstring: Int, multibytestring: Pstr, bytesinmultibytestring: Int): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_engWideCharToMultiByte(codepage.toInt(), (widecharstring?.value ?: 0L), bytesinwidecharstring, (multibytestring?.value ?: 0L), bytesinmultibytestring)

public actual fun fontobjCGetAllGlyphHandles(pfo: COpaquePointer?, phg: COpaquePointer?): UInt =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_fontobjCGetAllGlyphHandles((pfo?.value ?: 0L), (phg?.value ?: 0L)).toUInt()

public actual fun fontobjCGetGlyphs(pfo: COpaquePointer?, imode: UInt, cglyph: UInt, phg: COpaquePointer?, ppvglyph: COpaquePointer?): UInt =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_fontobjCGetGlyphs((pfo?.value ?: 0L), imode.toInt(), cglyph.toInt(), (phg?.value ?: 0L), (ppvglyph?.value ?: 0L)).toUInt()

public actual fun fontobjPQueryGlyphAttrs(pfo: COpaquePointer?, imode: UInt): COpaquePointer? =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_fontobjPQueryGlyphAttrs((pfo?.value ?: 0L), imode.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fontobjPfdg(pfo: COpaquePointer?): COpaquePointer? =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_fontobjPfdg((pfo?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fontobjPifi(pfo: COpaquePointer?): COpaquePointer? =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_fontobjPifi((pfo?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fontobjPvTrueTypeFontFile(pfo: COpaquePointer?, pcjfile: COpaquePointer?): COpaquePointer? =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_fontobjPvTrueTypeFontFile((pfo?.value ?: 0L), (pcjfile?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fontobjPxoGetXform(pfo: COpaquePointer?): COpaquePointer? =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_fontobjPxoGetXform((pfo?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fontobjVGetInfo(pfo: COpaquePointer?, cjsize: UInt, pfi: COpaquePointer?) {
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_fontobjVGetInfo((pfo?.value ?: 0L), cjsize.toInt(), (pfi?.value ?: 0L))
}

public actual fun getAutoRotationState(pstate: COpaquePointer?): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_getAutoRotationState((pstate?.value ?: 0L))

public actual fun getCapabilitiesStringLength(hmonitor: Handle, pdwcapabilitiesstringlengthincharacters: COpaquePointer?): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_getCapabilitiesStringLength((hmonitor?.value ?: 0L), (pdwcapabilitiesstringlengthincharacters?.value ?: 0L))

public actual fun getDisplayAutoRotationPreferences(porientation: COpaquePointer?): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_getDisplayAutoRotationPreferences((porientation?.value ?: 0L))

public actual fun getDisplayConfigBufferSizes(flags: QueryDisplayConfigFlags, numpatharrayelements: COpaquePointer?, nummodeinfoarrayelements: COpaquePointer?): Win32Error =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_getDisplayConfigBufferSizes(flags.toInt(), (numpatharrayelements?.value ?: 0L), (nummodeinfoarrayelements?.value ?: 0L)).toUInt()

public actual fun getMonitorBrightness(hmonitor: Handle, pdwminimumbrightness: COpaquePointer?, pdwcurrentbrightness: COpaquePointer?, pdwmaximumbrightness: COpaquePointer?): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_getMonitorBrightness((hmonitor?.value ?: 0L), (pdwminimumbrightness?.value ?: 0L), (pdwcurrentbrightness?.value ?: 0L), (pdwmaximumbrightness?.value ?: 0L))

public actual fun getMonitorCapabilities(hmonitor: Handle, pdwmonitorcapabilities: COpaquePointer?, pdwsupportedcolortemperatures: COpaquePointer?): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_getMonitorCapabilities((hmonitor?.value ?: 0L), (pdwmonitorcapabilities?.value ?: 0L), (pdwsupportedcolortemperatures?.value ?: 0L))

public actual fun getMonitorColorTemperature(hmonitor: Handle, pctcurrentcolortemperature: COpaquePointer?): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_getMonitorColorTemperature((hmonitor?.value ?: 0L), (pctcurrentcolortemperature?.value ?: 0L))

public actual fun getMonitorContrast(hmonitor: Handle, pdwminimumcontrast: COpaquePointer?, pdwcurrentcontrast: COpaquePointer?, pdwmaximumcontrast: COpaquePointer?): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_getMonitorContrast((hmonitor?.value ?: 0L), (pdwminimumcontrast?.value ?: 0L), (pdwcurrentcontrast?.value ?: 0L), (pdwmaximumcontrast?.value ?: 0L))

public actual fun getMonitorDisplayAreaPosition(hmonitor: Handle, ptpositiontype: McPositionType, pdwminimumposition: COpaquePointer?, pdwcurrentposition: COpaquePointer?, pdwmaximumposition: COpaquePointer?): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_getMonitorDisplayAreaPosition((hmonitor?.value ?: 0L), ptpositiontype, (pdwminimumposition?.value ?: 0L), (pdwcurrentposition?.value ?: 0L), (pdwmaximumposition?.value ?: 0L))

public actual fun getMonitorDisplayAreaSize(hmonitor: Handle, stsizetype: McSizeType, pdwminimumwidthorheight: COpaquePointer?, pdwcurrentwidthorheight: COpaquePointer?, pdwmaximumwidthorheight: COpaquePointer?): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_getMonitorDisplayAreaSize((hmonitor?.value ?: 0L), stsizetype, (pdwminimumwidthorheight?.value ?: 0L), (pdwcurrentwidthorheight?.value ?: 0L), (pdwmaximumwidthorheight?.value ?: 0L))

public actual fun getMonitorRedGreenOrBlueDrive(hmonitor: Handle, dtdrivetype: McDriveType, pdwminimumdrive: COpaquePointer?, pdwcurrentdrive: COpaquePointer?, pdwmaximumdrive: COpaquePointer?): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_getMonitorRedGreenOrBlueDrive((hmonitor?.value ?: 0L), dtdrivetype, (pdwminimumdrive?.value ?: 0L), (pdwcurrentdrive?.value ?: 0L), (pdwmaximumdrive?.value ?: 0L))

public actual fun getMonitorRedGreenOrBlueGain(hmonitor: Handle, gtgaintype: McGainType, pdwminimumgain: COpaquePointer?, pdwcurrentgain: COpaquePointer?, pdwmaximumgain: COpaquePointer?): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_getMonitorRedGreenOrBlueGain((hmonitor?.value ?: 0L), gtgaintype, (pdwminimumgain?.value ?: 0L), (pdwcurrentgain?.value ?: 0L), (pdwmaximumgain?.value ?: 0L))

public actual fun getMonitorTechnologyType(hmonitor: Handle, pdtydisplaytechnologytype: COpaquePointer?): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_getMonitorTechnologyType((hmonitor?.value ?: 0L), (pdtydisplaytechnologytype?.value ?: 0L))

public actual fun getNumberOfPhysicalMonitorsFromHMONITOR(hmonitor: Hmonitor, pdwnumberofphysicalmonitors: COpaquePointer?): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_getNumberOfPhysicalMonitorsFromHMONITOR((hmonitor?.value ?: 0L), (pdwnumberofphysicalmonitors?.value ?: 0L))

public actual fun getPhysicalMonitorsFromHMONITOR(hmonitor: Hmonitor, dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: COpaquePointer?): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_getPhysicalMonitorsFromHMONITOR((hmonitor?.value ?: 0L), dwphysicalmonitorarraysize.toInt(), (pphysicalmonitorarray?.value ?: 0L))

public actual fun getTimingReport(hmonitor: Handle, pmtrmonitortimingreport: COpaquePointer?): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_getTimingReport((hmonitor?.value ?: 0L), (pmtrmonitortimingreport?.value ?: 0L))

public actual fun getVCPFeatureAndVCPFeatureReply(hmonitor: Handle, bvcpcode: UByte, pvct: COpaquePointer?, pdwcurrentvalue: COpaquePointer?, pdwmaximumvalue: COpaquePointer?): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_getVCPFeatureAndVCPFeatureReply((hmonitor?.value ?: 0L), bvcpcode.toByte(), (pvct?.value ?: 0L), (pdwcurrentvalue?.value ?: 0L), (pdwmaximumvalue?.value ?: 0L))

public actual fun htGet8BppformatPalette(ppaletteentry: COpaquePointer?, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_htGet8BppformatPalette((ppaletteentry?.value ?: 0L), redgamma.toShort(), greengamma.toShort(), bluegamma.toShort())

public actual fun htGet8BppmaskPalette(ppaletteentry: COpaquePointer?, use8bppmaskpal: Bool, cmymask: UByte, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_htGet8BppmaskPalette((ppaletteentry?.value ?: 0L), use8bppmaskpal, cmymask.toByte(), redgamma.toShort(), greengamma.toShort(), bluegamma.toShort())

public actual fun pathobjBEnum(ppo: COpaquePointer?, ppd: COpaquePointer?): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_pathobjBEnum((ppo?.value ?: 0L), (ppd?.value ?: 0L))

public actual fun pathobjBEnumClipLines(ppo: COpaquePointer?, cb: UInt, pcl: COpaquePointer?): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_pathobjBEnumClipLines((ppo?.value ?: 0L), cb.toInt(), (pcl?.value ?: 0L))

public actual fun pathobjVEnumStart(ppo: COpaquePointer?) {
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_pathobjVEnumStart((ppo?.value ?: 0L))
}

public actual fun pathobjVEnumStartClipLines(ppo: COpaquePointer?, pco: COpaquePointer?, pso: COpaquePointer?, pla: COpaquePointer?) {
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_pathobjVEnumStartClipLines((ppo?.value ?: 0L), (pco?.value ?: 0L), (pso?.value ?: 0L), (pla?.value ?: 0L))
}

public actual fun pathobjVGetBounds(ppo: COpaquePointer?, prectfx: COpaquePointer?) {
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_pathobjVGetBounds((ppo?.value ?: 0L), (prectfx?.value ?: 0L))
}

public actual fun queryDisplayConfig(flags: QueryDisplayConfigFlags, numpatharrayelements: COpaquePointer?, patharray: COpaquePointer?, nummodeinfoarrayelements: COpaquePointer?, modeinfoarray: COpaquePointer?, currenttopologyid: COpaquePointer?): Win32Error =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_queryDisplayConfig(flags.toInt(), (numpatharrayelements?.value ?: 0L), (patharray?.value ?: 0L), (nummodeinfoarrayelements?.value ?: 0L), (modeinfoarray?.value ?: 0L), (currenttopologyid?.value ?: 0L)).toUInt()

public actual fun restoreMonitorFactoryColorDefaults(hmonitor: Handle): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_restoreMonitorFactoryColorDefaults((hmonitor?.value ?: 0L))

public actual fun restoreMonitorFactoryDefaults(hmonitor: Handle): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_restoreMonitorFactoryDefaults((hmonitor?.value ?: 0L))

public actual fun strobjBEnum(pstro: COpaquePointer?, pc: COpaquePointer?, ppgpos: COpaquePointer?): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_strobjBEnum((pstro?.value ?: 0L), (pc?.value ?: 0L), (ppgpos?.value ?: 0L))

public actual fun strobjBEnumPositionsOnly(pstro: COpaquePointer?, pc: COpaquePointer?, ppgpos: COpaquePointer?): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_strobjBEnumPositionsOnly((pstro?.value ?: 0L), (pc?.value ?: 0L), (ppgpos?.value ?: 0L))

public actual fun strobjBGetAdvanceWidths(pso: COpaquePointer?, ifirst: UInt, c: UInt, pptqd: COpaquePointer?): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_strobjBGetAdvanceWidths((pso?.value ?: 0L), ifirst.toInt(), c.toInt(), (pptqd?.value ?: 0L))

public actual fun strobjDwGetCodePage(pstro: COpaquePointer?): UInt =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_strobjDwGetCodePage((pstro?.value ?: 0L)).toUInt()

public actual fun strobjVEnumStart(pstro: COpaquePointer?) {
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_strobjVEnumStart((pstro?.value ?: 0L))
}

public actual fun saveCurrentMonitorSettings(hmonitor: Handle): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_saveCurrentMonitorSettings((hmonitor?.value ?: 0L))

public actual fun saveCurrentSettings(hmonitor: Handle): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_saveCurrentSettings((hmonitor?.value ?: 0L))

public actual fun setDisplayAutoRotationPreferences(orientation: OrientationPreference): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_setDisplayAutoRotationPreferences(orientation)

public actual fun setDisplayConfig(numpatharrayelements: UInt, patharray: COpaquePointer?, nummodeinfoarrayelements: UInt, modeinfoarray: COpaquePointer?, flags: SetDisplayConfigFlags): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_setDisplayConfig(numpatharrayelements.toInt(), (patharray?.value ?: 0L), nummodeinfoarrayelements.toInt(), (modeinfoarray?.value ?: 0L), flags.toInt())

public actual fun setMonitorBrightness(hmonitor: Handle, dwnewbrightness: UInt): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_setMonitorBrightness((hmonitor?.value ?: 0L), dwnewbrightness.toInt())

public actual fun setMonitorColorTemperature(hmonitor: Handle, ctcurrentcolortemperature: McColorTemperature): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_setMonitorColorTemperature((hmonitor?.value ?: 0L), ctcurrentcolortemperature)

public actual fun setMonitorContrast(hmonitor: Handle, dwnewcontrast: UInt): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_setMonitorContrast((hmonitor?.value ?: 0L), dwnewcontrast.toInt())

public actual fun setMonitorDisplayAreaPosition(hmonitor: Handle, ptpositiontype: McPositionType, dwnewposition: UInt): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_setMonitorDisplayAreaPosition((hmonitor?.value ?: 0L), ptpositiontype, dwnewposition.toInt())

public actual fun setMonitorDisplayAreaSize(hmonitor: Handle, stsizetype: McSizeType, dwnewdisplayareawidthorheight: UInt): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_setMonitorDisplayAreaSize((hmonitor?.value ?: 0L), stsizetype, dwnewdisplayareawidthorheight.toInt())

public actual fun setMonitorRedGreenOrBlueDrive(hmonitor: Handle, dtdrivetype: McDriveType, dwnewdrive: UInt): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_setMonitorRedGreenOrBlueDrive((hmonitor?.value ?: 0L), dtdrivetype, dwnewdrive.toInt())

public actual fun setMonitorRedGreenOrBlueGain(hmonitor: Handle, gtgaintype: McGainType, dwnewgain: UInt): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_setMonitorRedGreenOrBlueGain((hmonitor?.value ?: 0L), gtgaintype, dwnewgain.toInt())

public actual fun setVCPFeature(hmonitor: Handle, bvcpcode: UByte, dwnewvalue: UInt): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_setVCPFeature((hmonitor?.value ?: 0L), bvcpcode.toByte(), dwnewvalue.toInt())

public actual fun xformobjBApplyXform(pxo: COpaquePointer?, imode: UInt, cpoints: UInt, pvin: COpaquePointer?, pvout: COpaquePointer?): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_xformobjBApplyXform((pxo?.value ?: 0L), imode.toInt(), cpoints.toInt(), (pvin?.value ?: 0L), (pvout?.value ?: 0L))

public actual fun xformobjIGetXform(pxo: COpaquePointer?, pxform: COpaquePointer?): UInt =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_xformobjIGetXform((pxo?.value ?: 0L), (pxform?.value ?: 0L)).toUInt()

public actual fun xlateobjCGetPalette(pxlo: COpaquePointer?, ipal: UInt, cpal: UInt, ppal: COpaquePointer?): UInt =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_xlateobjCGetPalette((pxlo?.value ?: 0L), ipal.toInt(), cpal.toInt(), (ppal?.value ?: 0L)).toUInt()

public actual fun xlateobjHGetColorTransform(pxlo: COpaquePointer?): Handle =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_xlateobjHGetColorTransform((pxlo?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun xlateobjIXlate(pxlo: COpaquePointer?, icolor: UInt): UInt =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_xlateobjIXlate((pxlo?.value ?: 0L), icolor.toInt()).toUInt()

public actual fun xlateobjPiVector(pxlo: COpaquePointer?): COpaquePointer? =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_xlateobjPiVector((pxlo?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }
