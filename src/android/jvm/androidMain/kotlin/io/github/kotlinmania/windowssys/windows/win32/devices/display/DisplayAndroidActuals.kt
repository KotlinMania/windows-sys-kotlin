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

private object WindowsWin32DevicesDisplayJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_BRUSHOBJ_hGetColorTransform(pbo: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_BRUSHOBJ_pvAllocRbrush(pbo: Long, cj: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_BRUSHOBJ_pvGetRbrush(pbo: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_BRUSHOBJ_ulGetBrushColor(pbo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_CLIPOBJ_bEnum(pco: Long, cj: Int, pul: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_CLIPOBJ_cEnumStart(pco: Long, ball: Int, itype: Int, idirection: Int, climit: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_CLIPOBJ_ppoGetPath(pco: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_CapabilitiesRequestAndCapabilitiesReply(hmonitor: Long, pszasciicapabilitiesstring: Long, dwcapabilitiesstringlengthincharacters: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_DegaussMonitor(hmonitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_DestroyPhysicalMonitor(hmonitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_DestroyPhysicalMonitors(dwphysicalmonitorarraysize: Int, pphysicalmonitorarray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_DisplayConfigGetDeviceInfo(requestpacket: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_DisplayConfigSetDeviceInfo(setpacket: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngAcquireSemaphore(hsem: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngAlphaBlend(psodest: Long, psosrc: Long, pco: Long, pxlo: Long, prcldest: Long, prclsrc: Long, pblendobj: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngAssociateSurface(hsurf: Long, hdev: Long, flhooks: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngBitBlt(psotrg: Long, psosrc: Long, psomask: Long, pco: Long, pxlo: Long, prcltrg: Long, pptlsrc: Long, pptlmask: Long, pbo: Long, pptlbrush: Long, rop4: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngCheckAbort(pso: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngComputeGlyphSet(ncodepage: Int, nfirstchar: Int, cchars: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngCopyBits(psodest: Long, psosrc: Long, pco: Long, pxlo: Long, prcldest: Long, pptlsrc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngCreateClip(): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngCreatePalette(imode: Int, ccolors: Int, pulcolors: Long, flred: Int, flgreen: Int, flblue: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngCreateSemaphore(): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngDeleteClip(pco: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngDeletePalette(hpal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngDeletePath(ppo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngDeleteSemaphore(hsem: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngDeleteSurface(hsurf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngEraseSurface(pso: Long, prcl: Long, icolor: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngFillPath(pso: Long, ppo: Long, pco: Long, pbo: Long, pptlbrushorg: Long, mix: Int, floptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngFindResource(h: Long, iname: Int, itype: Int, pulsize: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngFreeModule(h: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngGetCurrentCodePage(oemcodepage: Long, ansicodepage: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngGetDriverName(hdev: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngGetPrinterDataFileName(hdev: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngGradientFill(psodest: Long, pco: Long, pxlo: Long, pvertex: Long, nvertex: Int, pmesh: Long, nmesh: Int, prclextents: Long, pptlditherorg: Long, ulmode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngLineTo(pso: Long, pco: Long, pbo: Long, x1: Int, y1: Int, x2: Int, y2: Int, prclbounds: Long, mix: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngLoadModule(pwsz: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngLockSurface(hsurf: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngMarkBandingSurface(hsurf: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngMultiByteToUnicodeN(unicodestring: Long, maxbytesinunicodestring: Int, bytesinunicodestring: Long, multibytestring: Long, bytesinmultibytestring: Int)

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngMultiByteToWideChar(codepage: Int, widecharstring: Long, bytesinwidecharstring: Int, multibytestring: Long, bytesinmultibytestring: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngPaint(pso: Long, pco: Long, pbo: Long, pptlbrushorg: Long, mix: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngPlgBlt(psotrg: Long, psosrc: Long, psomsk: Long, pco: Long, pxlo: Long, pca: Long, pptlbrushorg: Long, pptfx: Long, prcl: Long, pptl: Long, imode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngQueryEMFInfo(hdev: Long, pemfinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngQueryLocalTime(param0: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngReleaseSemaphore(hsem: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngStretchBlt(psodest: Long, psosrc: Long, psomask: Long, pco: Long, pxlo: Long, pca: Long, pptlhtorg: Long, prcldest: Long, prclsrc: Long, pptlmask: Long, imode: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngStretchBltROP(psodest: Long, psosrc: Long, psomask: Long, pco: Long, pxlo: Long, pca: Long, pptlhtorg: Long, prcldest: Long, prclsrc: Long, pptlmask: Long, imode: Int, pbo: Long, rop4: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngStrokeAndFillPath(pso: Long, ppo: Long, pco: Long, pxo: Long, pbostroke: Long, plineattrs: Long, pbofill: Long, pptlbrushorg: Long, mixfill: Int, floptions: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngStrokePath(pso: Long, ppo: Long, pco: Long, pxo: Long, pbo: Long, pptlbrushorg: Long, plineattrs: Long, mix: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngTextOut(pso: Long, pstro: Long, pfo: Long, pco: Long, prclextra: Long, prclopaque: Long, pbofore: Long, pboopaque: Long, pptlorg: Long, mix: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngTransparentBlt(psodst: Long, psosrc: Long, pco: Long, pxlo: Long, prcldst: Long, prclsrc: Long, transcolor: Int, bcalledfrombitblt: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngUnicodeToMultiByteN(multibytestring: Long, maxbytesinmultibytestring: Int, bytesinmultibytestring: Long, unicodestring: Long, bytesinunicodestring: Int)

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngUnlockSurface(pso: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_EngWideCharToMultiByte(codepage: Int, widecharstring: Long, bytesinwidecharstring: Int, multibytestring: Long, bytesinmultibytestring: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_FONTOBJ_cGetAllGlyphHandles(pfo: Long, phg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_FONTOBJ_cGetGlyphs(pfo: Long, imode: Int, cglyph: Int, phg: Long, ppvglyph: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_FONTOBJ_pQueryGlyphAttrs(pfo: Long, imode: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_FONTOBJ_pfdg(pfo: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_FONTOBJ_pifi(pfo: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_FONTOBJ_pvTrueTypeFontFile(pfo: Long, pcjfile: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_FONTOBJ_pxoGetXform(pfo: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_FONTOBJ_vGetInfo(pfo: Long, cjsize: Int, pfi: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_GetAutoRotationState(pstate: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_GetCapabilitiesStringLength(hmonitor: Long, pdwcapabilitiesstringlengthincharacters: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_GetDisplayAutoRotationPreferences(porientation: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_GetDisplayConfigBufferSizes(flags: Int, numpatharrayelements: Long, nummodeinfoarrayelements: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_GetMonitorBrightness(hmonitor: Long, pdwminimumbrightness: Long, pdwcurrentbrightness: Long, pdwmaximumbrightness: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_GetMonitorCapabilities(hmonitor: Long, pdwmonitorcapabilities: Long, pdwsupportedcolortemperatures: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_GetMonitorColorTemperature(hmonitor: Long, pctcurrentcolortemperature: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_GetMonitorContrast(hmonitor: Long, pdwminimumcontrast: Long, pdwcurrentcontrast: Long, pdwmaximumcontrast: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_GetMonitorDisplayAreaPosition(hmonitor: Long, ptpositiontype: Int, pdwminimumposition: Long, pdwcurrentposition: Long, pdwmaximumposition: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_GetMonitorDisplayAreaSize(hmonitor: Long, stsizetype: Int, pdwminimumwidthorheight: Long, pdwcurrentwidthorheight: Long, pdwmaximumwidthorheight: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_GetMonitorRedGreenOrBlueDrive(hmonitor: Long, dtdrivetype: Int, pdwminimumdrive: Long, pdwcurrentdrive: Long, pdwmaximumdrive: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_GetMonitorRedGreenOrBlueGain(hmonitor: Long, gtgaintype: Int, pdwminimumgain: Long, pdwcurrentgain: Long, pdwmaximumgain: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_GetMonitorTechnologyType(hmonitor: Long, pdtydisplaytechnologytype: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_GetNumberOfPhysicalMonitorsFromHMONITOR(hmonitor: Long, pdwnumberofphysicalmonitors: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_GetPhysicalMonitorsFromHMONITOR(hmonitor: Long, dwphysicalmonitorarraysize: Int, pphysicalmonitorarray: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_GetTimingReport(hmonitor: Long, pmtrmonitortimingreport: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_GetVCPFeatureAndVCPFeatureReply(hmonitor: Long, bvcpcode: Byte, pvct: Long, pdwcurrentvalue: Long, pdwmaximumvalue: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_HT_Get8BPPFormatPalette(ppaletteentry: Long, redgamma: Short, greengamma: Short, bluegamma: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_HT_Get8BPPMaskPalette(ppaletteentry: Long, use8bppmaskpal: Int, cmymask: Byte, redgamma: Short, greengamma: Short, bluegamma: Short): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_PATHOBJ_bEnum(ppo: Long, ppd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_PATHOBJ_bEnumClipLines(ppo: Long, cb: Int, pcl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_PATHOBJ_vEnumStart(ppo: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_PATHOBJ_vEnumStartClipLines(ppo: Long, pco: Long, pso: Long, pla: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_PATHOBJ_vGetBounds(ppo: Long, prectfx: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_QueryDisplayConfig(flags: Int, numpatharrayelements: Long, patharray: Long, nummodeinfoarrayelements: Long, modeinfoarray: Long, currenttopologyid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_RestoreMonitorFactoryColorDefaults(hmonitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_RestoreMonitorFactoryDefaults(hmonitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_STROBJ_bEnum(pstro: Long, pc: Long, ppgpos: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_STROBJ_bEnumPositionsOnly(pstro: Long, pc: Long, ppgpos: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_STROBJ_bGetAdvanceWidths(pso: Long, ifirst: Int, c: Int, pptqd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_STROBJ_dwGetCodePage(pstro: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_STROBJ_vEnumStart(pstro: Long)

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_SaveCurrentMonitorSettings(hmonitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_SaveCurrentSettings(hmonitor: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_SetDisplayAutoRotationPreferences(orientation: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_SetDisplayConfig(numpatharrayelements: Int, patharray: Long, nummodeinfoarrayelements: Int, modeinfoarray: Long, flags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_SetMonitorBrightness(hmonitor: Long, dwnewbrightness: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_SetMonitorColorTemperature(hmonitor: Long, ctcurrentcolortemperature: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_SetMonitorContrast(hmonitor: Long, dwnewcontrast: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_SetMonitorDisplayAreaPosition(hmonitor: Long, ptpositiontype: Int, dwnewposition: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_SetMonitorDisplayAreaSize(hmonitor: Long, stsizetype: Int, dwnewdisplayareawidthorheight: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_SetMonitorRedGreenOrBlueDrive(hmonitor: Long, dtdrivetype: Int, dwnewdrive: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_SetMonitorRedGreenOrBlueGain(hmonitor: Long, gtgaintype: Int, dwnewgain: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_SetVCPFeature(hmonitor: Long, bvcpcode: Byte, dwnewvalue: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_XFORMOBJ_bApplyXform(pxo: Long, imode: Int, cpoints: Int, pvin: Long, pvout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_XFORMOBJ_iGetXform(pxo: Long, pxform: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_XLATEOBJ_cGetPalette(pxlo: Long, ipal: Int, cpal: Int, ppal: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_XLATEOBJ_hGetColorTransform(pxlo: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_XLATEOBJ_iXlate(pxlo: Long, icolor: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_devices_display_XLATEOBJ_piVector(pxlo: Long): Long
}

public actual fun BRUSHOBJ_hGetColorTransform(pbo: Long): HANDLE =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_BRUSHOBJ_hGetColorTransform(pbo)

public actual fun BRUSHOBJ_pvAllocRbrush(pbo: Long, cj: UInt): Long =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_BRUSHOBJ_pvAllocRbrush(pbo, cj.toInt())

public actual fun BRUSHOBJ_pvGetRbrush(pbo: Long): Long =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_BRUSHOBJ_pvGetRbrush(pbo)

public actual fun BRUSHOBJ_ulGetBrushColor(pbo: Long): UInt =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_BRUSHOBJ_ulGetBrushColor(pbo).toUInt()

public actual fun CLIPOBJ_bEnum(pco: Long, cj: UInt, pul: Long): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_CLIPOBJ_bEnum(pco, cj.toInt(), pul)

public actual fun CLIPOBJ_cEnumStart(pco: Long, ball: BOOL, itype: UInt, idirection: UInt, climit: UInt): UInt =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_CLIPOBJ_cEnumStart(pco, ball, itype.toInt(), idirection.toInt(), climit.toInt()).toUInt()

public actual fun CLIPOBJ_ppoGetPath(pco: Long): Long =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_CLIPOBJ_ppoGetPath(pco)

public actual fun CapabilitiesRequestAndCapabilitiesReply(hmonitor: HANDLE, pszasciicapabilitiesstring: PSTR, dwcapabilitiesstringlengthincharacters: UInt): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_CapabilitiesRequestAndCapabilitiesReply(hmonitor, pszasciicapabilitiesstring, dwcapabilitiesstringlengthincharacters.toInt())

public actual fun DegaussMonitor(hmonitor: HANDLE): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_DegaussMonitor(hmonitor)

public actual fun DestroyPhysicalMonitor(hmonitor: HANDLE): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_DestroyPhysicalMonitor(hmonitor)

public actual fun DestroyPhysicalMonitors(dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: Long): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_DestroyPhysicalMonitors(dwphysicalmonitorarraysize.toInt(), pphysicalmonitorarray)

public actual fun DisplayConfigGetDeviceInfo(requestpacket: Long): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_DisplayConfigGetDeviceInfo(requestpacket)

public actual fun DisplayConfigSetDeviceInfo(setpacket: Long): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_DisplayConfigSetDeviceInfo(setpacket)

public actual fun EngAcquireSemaphore(hsem: HSEMAPHORE) {
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngAcquireSemaphore(hsem)
}

public actual fun EngAlphaBlend(psodest: Long, psosrc: Long, pco: Long, pxlo: Long, prcldest: Long, prclsrc: Long, pblendobj: Long): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngAlphaBlend(psodest, psosrc, pco, pxlo, prcldest, prclsrc, pblendobj)

public actual fun EngAssociateSurface(hsurf: HSURF, hdev: HDEV, flhooks: UInt): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngAssociateSurface(hsurf, hdev, flhooks.toInt())

public actual fun EngBitBlt(psotrg: Long, psosrc: Long, psomask: Long, pco: Long, pxlo: Long, prcltrg: Long, pptlsrc: Long, pptlmask: Long, pbo: Long, pptlbrush: Long, rop4: UInt): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngBitBlt(psotrg, psosrc, psomask, pco, pxlo, prcltrg, pptlsrc, pptlmask, pbo, pptlbrush, rop4.toInt())

public actual fun EngCheckAbort(pso: Long): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngCheckAbort(pso)

public actual fun EngComputeGlyphSet(ncodepage: Int, nfirstchar: Int, cchars: Int): Long =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngComputeGlyphSet(ncodepage, nfirstchar, cchars)

public actual fun EngCopyBits(psodest: Long, psosrc: Long, pco: Long, pxlo: Long, prcldest: Long, pptlsrc: Long): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngCopyBits(psodest, psosrc, pco, pxlo, prcldest, pptlsrc)

public actual fun EngCreateBitmap(sizl: SIZE, lwidth: Int, iformat: UInt, fl: UInt, pvbits: Long): HBITMAP =
    0L

public actual fun EngCreateClip(): Long =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngCreateClip()

public actual fun EngCreateDeviceBitmap(dhsurf: DHSURF, sizl: SIZE, iformatcompat: UInt): HBITMAP =
    0L

public actual fun EngCreateDeviceSurface(dhsurf: DHSURF, sizl: SIZE, iformatcompat: UInt): HSURF =
    0L

public actual fun EngCreatePalette(imode: UInt, ccolors: UInt, pulcolors: Long, flred: UInt, flgreen: UInt, flblue: UInt): HPALETTE =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngCreatePalette(imode.toInt(), ccolors.toInt(), pulcolors, flred.toInt(), flgreen.toInt(), flblue.toInt())

public actual fun EngCreateSemaphore(): HSEMAPHORE =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngCreateSemaphore()

public actual fun EngDeleteClip(pco: Long) {
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngDeleteClip(pco)
}

public actual fun EngDeletePalette(hpal: HPALETTE): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngDeletePalette(hpal)

public actual fun EngDeletePath(ppo: Long) {
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngDeletePath(ppo)
}

public actual fun EngDeleteSemaphore(hsem: HSEMAPHORE) {
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngDeleteSemaphore(hsem)
}

public actual fun EngDeleteSurface(hsurf: HSURF): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngDeleteSurface(hsurf)

public actual fun EngEraseSurface(pso: Long, prcl: Long, icolor: UInt): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngEraseSurface(pso, prcl, icolor.toInt())

public actual fun EngFillPath(pso: Long, ppo: Long, pco: Long, pbo: Long, pptlbrushorg: Long, mix: UInt, floptions: UInt): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngFillPath(pso, ppo, pco, pbo, pptlbrushorg, mix.toInt(), floptions.toInt())

public actual fun EngFindResource(h: HANDLE, iname: Int, itype: Int, pulsize: Long): Long =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngFindResource(h, iname, itype, pulsize)

public actual fun EngFreeModule(h: HANDLE) {
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngFreeModule(h)
}

public actual fun EngGetCurrentCodePage(oemcodepage: Long, ansicodepage: Long) {
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngGetCurrentCodePage(oemcodepage, ansicodepage)
}

public actual fun EngGetDriverName(hdev: HDEV): PWSTR =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngGetDriverName(hdev)

public actual fun EngGetPrinterDataFileName(hdev: HDEV): PWSTR =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngGetPrinterDataFileName(hdev)

public actual fun EngGradientFill(psodest: Long, pco: Long, pxlo: Long, pvertex: Long, nvertex: UInt, pmesh: Long, nmesh: UInt, prclextents: Long, pptlditherorg: Long, ulmode: UInt): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngGradientFill(psodest, pco, pxlo, pvertex, nvertex.toInt(), pmesh, nmesh.toInt(), prclextents, pptlditherorg, ulmode.toInt())

public actual fun EngLineTo(pso: Long, pco: Long, pbo: Long, x1: Int, y1: Int, x2: Int, y2: Int, prclbounds: Long, mix: UInt): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngLineTo(pso, pco, pbo, x1, y1, x2, y2, prclbounds, mix.toInt())

public actual fun EngLoadModule(pwsz: PCWSTR): HANDLE =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngLoadModule(pwsz)

public actual fun EngLockSurface(hsurf: HSURF): Long =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngLockSurface(hsurf)

public actual fun EngMarkBandingSurface(hsurf: HSURF): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngMarkBandingSurface(hsurf)

public actual fun EngMultiByteToUnicodeN(unicodestring: PWSTR, maxbytesinunicodestring: UInt, bytesinunicodestring: Long, multibytestring: PCSTR, bytesinmultibytestring: UInt) {
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngMultiByteToUnicodeN(unicodestring, maxbytesinunicodestring.toInt(), bytesinunicodestring, multibytestring, bytesinmultibytestring.toInt())
}

public actual fun EngMultiByteToWideChar(codepage: UInt, widecharstring: PWSTR, bytesinwidecharstring: Int, multibytestring: PCSTR, bytesinmultibytestring: Int): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngMultiByteToWideChar(codepage.toInt(), widecharstring, bytesinwidecharstring, multibytestring, bytesinmultibytestring)

public actual fun EngPaint(pso: Long, pco: Long, pbo: Long, pptlbrushorg: Long, mix: UInt): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngPaint(pso, pco, pbo, pptlbrushorg, mix.toInt())

public actual fun EngPlgBlt(psotrg: Long, psosrc: Long, psomsk: Long, pco: Long, pxlo: Long, pca: Long, pptlbrushorg: Long, pptfx: Long, prcl: Long, pptl: Long, imode: UInt): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngPlgBlt(psotrg, psosrc, psomsk, pco, pxlo, pca, pptlbrushorg, pptfx, prcl, pptl, imode.toInt())

public actual fun EngQueryEMFInfo(hdev: HDEV, pemfinfo: Long): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngQueryEMFInfo(hdev, pemfinfo)

public actual fun EngQueryLocalTime(param0: Long) {
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngQueryLocalTime(param0)
}

public actual fun EngReleaseSemaphore(hsem: HSEMAPHORE) {
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngReleaseSemaphore(hsem)
}

public actual fun EngStretchBlt(psodest: Long, psosrc: Long, psomask: Long, pco: Long, pxlo: Long, pca: Long, pptlhtorg: Long, prcldest: Long, prclsrc: Long, pptlmask: Long, imode: UInt): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngStretchBlt(psodest, psosrc, psomask, pco, pxlo, pca, pptlhtorg, prcldest, prclsrc, pptlmask, imode.toInt())

public actual fun EngStretchBltROP(psodest: Long, psosrc: Long, psomask: Long, pco: Long, pxlo: Long, pca: Long, pptlhtorg: Long, prcldest: Long, prclsrc: Long, pptlmask: Long, imode: UInt, pbo: Long, rop4: UInt): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngStretchBltROP(psodest, psosrc, psomask, pco, pxlo, pca, pptlhtorg, prcldest, prclsrc, pptlmask, imode.toInt(), pbo, rop4.toInt())

public actual fun EngStrokeAndFillPath(pso: Long, ppo: Long, pco: Long, pxo: Long, pbostroke: Long, plineattrs: Long, pbofill: Long, pptlbrushorg: Long, mixfill: UInt, floptions: UInt): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngStrokeAndFillPath(pso, ppo, pco, pxo, pbostroke, plineattrs, pbofill, pptlbrushorg, mixfill.toInt(), floptions.toInt())

public actual fun EngStrokePath(pso: Long, ppo: Long, pco: Long, pxo: Long, pbo: Long, pptlbrushorg: Long, plineattrs: Long, mix: UInt): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngStrokePath(pso, ppo, pco, pxo, pbo, pptlbrushorg, plineattrs, mix.toInt())

public actual fun EngTextOut(pso: Long, pstro: Long, pfo: Long, pco: Long, prclextra: Long, prclopaque: Long, pbofore: Long, pboopaque: Long, pptlorg: Long, mix: UInt): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngTextOut(pso, pstro, pfo, pco, prclextra, prclopaque, pbofore, pboopaque, pptlorg, mix.toInt())

public actual fun EngTransparentBlt(psodst: Long, psosrc: Long, pco: Long, pxlo: Long, prcldst: Long, prclsrc: Long, transcolor: UInt, bcalledfrombitblt: UInt): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngTransparentBlt(psodst, psosrc, pco, pxlo, prcldst, prclsrc, transcolor.toInt(), bcalledfrombitblt.toInt())

public actual fun EngUnicodeToMultiByteN(multibytestring: PSTR, maxbytesinmultibytestring: UInt, bytesinmultibytestring: Long, unicodestring: PCWSTR, bytesinunicodestring: UInt) {
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngUnicodeToMultiByteN(multibytestring, maxbytesinmultibytestring.toInt(), bytesinmultibytestring, unicodestring, bytesinunicodestring.toInt())
}

public actual fun EngUnlockSurface(pso: Long) {
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngUnlockSurface(pso)
}

public actual fun EngWideCharToMultiByte(codepage: UInt, widecharstring: PCWSTR, bytesinwidecharstring: Int, multibytestring: PSTR, bytesinmultibytestring: Int): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_EngWideCharToMultiByte(codepage.toInt(), widecharstring, bytesinwidecharstring, multibytestring, bytesinmultibytestring)

public actual fun FONTOBJ_cGetAllGlyphHandles(pfo: Long, phg: Long): UInt =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_FONTOBJ_cGetAllGlyphHandles(pfo, phg).toUInt()

public actual fun FONTOBJ_cGetGlyphs(pfo: Long, imode: UInt, cglyph: UInt, phg: Long, ppvglyph: Long): UInt =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_FONTOBJ_cGetGlyphs(pfo, imode.toInt(), cglyph.toInt(), phg, ppvglyph).toUInt()

public actual fun FONTOBJ_pQueryGlyphAttrs(pfo: Long, imode: UInt): Long =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_FONTOBJ_pQueryGlyphAttrs(pfo, imode.toInt())

public actual fun FONTOBJ_pfdg(pfo: Long): Long =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_FONTOBJ_pfdg(pfo)

public actual fun FONTOBJ_pifi(pfo: Long): Long =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_FONTOBJ_pifi(pfo)

public actual fun FONTOBJ_pvTrueTypeFontFile(pfo: Long, pcjfile: Long): Long =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_FONTOBJ_pvTrueTypeFontFile(pfo, pcjfile)

public actual fun FONTOBJ_pxoGetXform(pfo: Long): Long =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_FONTOBJ_pxoGetXform(pfo)

public actual fun FONTOBJ_vGetInfo(pfo: Long, cjsize: UInt, pfi: Long) {
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_FONTOBJ_vGetInfo(pfo, cjsize.toInt(), pfi)
}

public actual fun GetAutoRotationState(pstate: Long): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_GetAutoRotationState(pstate)

public actual fun GetCapabilitiesStringLength(hmonitor: HANDLE, pdwcapabilitiesstringlengthincharacters: Long): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_GetCapabilitiesStringLength(hmonitor, pdwcapabilitiesstringlengthincharacters)

public actual fun GetDisplayAutoRotationPreferences(porientation: Long): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_GetDisplayAutoRotationPreferences(porientation)

public actual fun GetDisplayConfigBufferSizes(flags: QUERY_DISPLAY_CONFIG_FLAGS, numpatharrayelements: Long, nummodeinfoarrayelements: Long): WIN32_ERROR =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_GetDisplayConfigBufferSizes(flags.toInt(), numpatharrayelements, nummodeinfoarrayelements).toUInt()

public actual fun GetMonitorBrightness(hmonitor: HANDLE, pdwminimumbrightness: Long, pdwcurrentbrightness: Long, pdwmaximumbrightness: Long): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_GetMonitorBrightness(hmonitor, pdwminimumbrightness, pdwcurrentbrightness, pdwmaximumbrightness)

public actual fun GetMonitorCapabilities(hmonitor: HANDLE, pdwmonitorcapabilities: Long, pdwsupportedcolortemperatures: Long): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_GetMonitorCapabilities(hmonitor, pdwmonitorcapabilities, pdwsupportedcolortemperatures)

public actual fun GetMonitorColorTemperature(hmonitor: HANDLE, pctcurrentcolortemperature: Long): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_GetMonitorColorTemperature(hmonitor, pctcurrentcolortemperature)

public actual fun GetMonitorContrast(hmonitor: HANDLE, pdwminimumcontrast: Long, pdwcurrentcontrast: Long, pdwmaximumcontrast: Long): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_GetMonitorContrast(hmonitor, pdwminimumcontrast, pdwcurrentcontrast, pdwmaximumcontrast)

public actual fun GetMonitorDisplayAreaPosition(hmonitor: HANDLE, ptpositiontype: MC_POSITION_TYPE, pdwminimumposition: Long, pdwcurrentposition: Long, pdwmaximumposition: Long): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_GetMonitorDisplayAreaPosition(hmonitor, ptpositiontype, pdwminimumposition, pdwcurrentposition, pdwmaximumposition)

public actual fun GetMonitorDisplayAreaSize(hmonitor: HANDLE, stsizetype: MC_SIZE_TYPE, pdwminimumwidthorheight: Long, pdwcurrentwidthorheight: Long, pdwmaximumwidthorheight: Long): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_GetMonitorDisplayAreaSize(hmonitor, stsizetype, pdwminimumwidthorheight, pdwcurrentwidthorheight, pdwmaximumwidthorheight)

public actual fun GetMonitorRedGreenOrBlueDrive(hmonitor: HANDLE, dtdrivetype: MC_DRIVE_TYPE, pdwminimumdrive: Long, pdwcurrentdrive: Long, pdwmaximumdrive: Long): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_GetMonitorRedGreenOrBlueDrive(hmonitor, dtdrivetype, pdwminimumdrive, pdwcurrentdrive, pdwmaximumdrive)

public actual fun GetMonitorRedGreenOrBlueGain(hmonitor: HANDLE, gtgaintype: MC_GAIN_TYPE, pdwminimumgain: Long, pdwcurrentgain: Long, pdwmaximumgain: Long): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_GetMonitorRedGreenOrBlueGain(hmonitor, gtgaintype, pdwminimumgain, pdwcurrentgain, pdwmaximumgain)

public actual fun GetMonitorTechnologyType(hmonitor: HANDLE, pdtydisplaytechnologytype: Long): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_GetMonitorTechnologyType(hmonitor, pdtydisplaytechnologytype)

public actual fun GetNumberOfPhysicalMonitorsFromHMONITOR(hmonitor: HMONITOR, pdwnumberofphysicalmonitors: Long): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_GetNumberOfPhysicalMonitorsFromHMONITOR(hmonitor, pdwnumberofphysicalmonitors)

public actual fun GetPhysicalMonitorsFromHMONITOR(hmonitor: HMONITOR, dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: Long): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_GetPhysicalMonitorsFromHMONITOR(hmonitor, dwphysicalmonitorarraysize.toInt(), pphysicalmonitorarray)

public actual fun GetTimingReport(hmonitor: HANDLE, pmtrmonitortimingreport: Long): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_GetTimingReport(hmonitor, pmtrmonitortimingreport)

public actual fun GetVCPFeatureAndVCPFeatureReply(hmonitor: HANDLE, bvcpcode: UByte, pvct: Long, pdwcurrentvalue: Long, pdwmaximumvalue: Long): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_GetVCPFeatureAndVCPFeatureReply(hmonitor, bvcpcode.toByte(), pvct, pdwcurrentvalue, pdwmaximumvalue)

public actual fun HT_Get8BPPFormatPalette(ppaletteentry: Long, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_HT_Get8BPPFormatPalette(ppaletteentry, redgamma.toShort(), greengamma.toShort(), bluegamma.toShort())

public actual fun HT_Get8BPPMaskPalette(ppaletteentry: Long, use8bppmaskpal: BOOL, cmymask: UByte, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_HT_Get8BPPMaskPalette(ppaletteentry, use8bppmaskpal, cmymask.toByte(), redgamma.toShort(), greengamma.toShort(), bluegamma.toShort())

public actual fun PATHOBJ_bEnum(ppo: Long, ppd: Long): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_PATHOBJ_bEnum(ppo, ppd)

public actual fun PATHOBJ_bEnumClipLines(ppo: Long, cb: UInt, pcl: Long): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_PATHOBJ_bEnumClipLines(ppo, cb.toInt(), pcl)

public actual fun PATHOBJ_vEnumStart(ppo: Long) {
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_PATHOBJ_vEnumStart(ppo)
}

public actual fun PATHOBJ_vEnumStartClipLines(ppo: Long, pco: Long, pso: Long, pla: Long) {
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_PATHOBJ_vEnumStartClipLines(ppo, pco, pso, pla)
}

public actual fun PATHOBJ_vGetBounds(ppo: Long, prectfx: Long) {
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_PATHOBJ_vGetBounds(ppo, prectfx)
}

public actual fun QueryDisplayConfig(flags: QUERY_DISPLAY_CONFIG_FLAGS, numpatharrayelements: Long, patharray: Long, nummodeinfoarrayelements: Long, modeinfoarray: Long, currenttopologyid: Long): WIN32_ERROR =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_QueryDisplayConfig(flags.toInt(), numpatharrayelements, patharray, nummodeinfoarrayelements, modeinfoarray, currenttopologyid).toUInt()

public actual fun RestoreMonitorFactoryColorDefaults(hmonitor: HANDLE): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_RestoreMonitorFactoryColorDefaults(hmonitor)

public actual fun RestoreMonitorFactoryDefaults(hmonitor: HANDLE): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_RestoreMonitorFactoryDefaults(hmonitor)

public actual fun STROBJ_bEnum(pstro: Long, pc: Long, ppgpos: Long): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_STROBJ_bEnum(pstro, pc, ppgpos)

public actual fun STROBJ_bEnumPositionsOnly(pstro: Long, pc: Long, ppgpos: Long): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_STROBJ_bEnumPositionsOnly(pstro, pc, ppgpos)

public actual fun STROBJ_bGetAdvanceWidths(pso: Long, ifirst: UInt, c: UInt, pptqd: Long): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_STROBJ_bGetAdvanceWidths(pso, ifirst.toInt(), c.toInt(), pptqd)

public actual fun STROBJ_dwGetCodePage(pstro: Long): UInt =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_STROBJ_dwGetCodePage(pstro).toUInt()

public actual fun STROBJ_vEnumStart(pstro: Long) {
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_STROBJ_vEnumStart(pstro)
}

public actual fun SaveCurrentMonitorSettings(hmonitor: HANDLE): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_SaveCurrentMonitorSettings(hmonitor)

public actual fun SaveCurrentSettings(hmonitor: HANDLE): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_SaveCurrentSettings(hmonitor)

public actual fun SetDisplayAutoRotationPreferences(orientation: ORIENTATION_PREFERENCE): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_SetDisplayAutoRotationPreferences(orientation)

public actual fun SetDisplayConfig(numpatharrayelements: UInt, patharray: Long, nummodeinfoarrayelements: UInt, modeinfoarray: Long, flags: SET_DISPLAY_CONFIG_FLAGS): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_SetDisplayConfig(numpatharrayelements.toInt(), patharray, nummodeinfoarrayelements.toInt(), modeinfoarray, flags.toInt())

public actual fun SetMonitorBrightness(hmonitor: HANDLE, dwnewbrightness: UInt): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_SetMonitorBrightness(hmonitor, dwnewbrightness.toInt())

public actual fun SetMonitorColorTemperature(hmonitor: HANDLE, ctcurrentcolortemperature: MC_COLOR_TEMPERATURE): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_SetMonitorColorTemperature(hmonitor, ctcurrentcolortemperature)

public actual fun SetMonitorContrast(hmonitor: HANDLE, dwnewcontrast: UInt): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_SetMonitorContrast(hmonitor, dwnewcontrast.toInt())

public actual fun SetMonitorDisplayAreaPosition(hmonitor: HANDLE, ptpositiontype: MC_POSITION_TYPE, dwnewposition: UInt): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_SetMonitorDisplayAreaPosition(hmonitor, ptpositiontype, dwnewposition.toInt())

public actual fun SetMonitorDisplayAreaSize(hmonitor: HANDLE, stsizetype: MC_SIZE_TYPE, dwnewdisplayareawidthorheight: UInt): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_SetMonitorDisplayAreaSize(hmonitor, stsizetype, dwnewdisplayareawidthorheight.toInt())

public actual fun SetMonitorRedGreenOrBlueDrive(hmonitor: HANDLE, dtdrivetype: MC_DRIVE_TYPE, dwnewdrive: UInt): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_SetMonitorRedGreenOrBlueDrive(hmonitor, dtdrivetype, dwnewdrive.toInt())

public actual fun SetMonitorRedGreenOrBlueGain(hmonitor: HANDLE, gtgaintype: MC_GAIN_TYPE, dwnewgain: UInt): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_SetMonitorRedGreenOrBlueGain(hmonitor, gtgaintype, dwnewgain.toInt())

public actual fun SetVCPFeature(hmonitor: HANDLE, bvcpcode: UByte, dwnewvalue: UInt): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_SetVCPFeature(hmonitor, bvcpcode.toByte(), dwnewvalue.toInt())

public actual fun XFORMOBJ_bApplyXform(pxo: Long, imode: UInt, cpoints: UInt, pvin: Long, pvout: Long): BOOL =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_XFORMOBJ_bApplyXform(pxo, imode.toInt(), cpoints.toInt(), pvin, pvout)

public actual fun XFORMOBJ_iGetXform(pxo: Long, pxform: Long): UInt =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_XFORMOBJ_iGetXform(pxo, pxform).toUInt()

public actual fun XLATEOBJ_cGetPalette(pxlo: Long, ipal: UInt, cpal: UInt, ppal: Long): UInt =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_XLATEOBJ_cGetPalette(pxlo, ipal.toInt(), cpal.toInt(), ppal).toUInt()

public actual fun XLATEOBJ_hGetColorTransform(pxlo: Long): HANDLE =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_XLATEOBJ_hGetColorTransform(pxlo)

public actual fun XLATEOBJ_iXlate(pxlo: Long, icolor: UInt): UInt =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_XLATEOBJ_iXlate(pxlo, icolor.toInt()).toUInt()

public actual fun XLATEOBJ_piVector(pxlo: Long): Long =
    WindowsWin32DevicesDisplayJniBridge.windowssys_windows_win32_devices_display_XLATEOBJ_piVector(pxlo)
