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

public actual fun BRUSHOBJ_hGetColorTransform(pbo: Long): HANDLE =
    0L

public actual fun BRUSHOBJ_pvAllocRbrush(pbo: Long, cj: UInt): Long =
    0L

public actual fun BRUSHOBJ_pvGetRbrush(pbo: Long): Long =
    0L

public actual fun BRUSHOBJ_ulGetBrushColor(pbo: Long): UInt =
    0u

public actual fun CLIPOBJ_bEnum(pco: Long, cj: UInt, pul: Long): BOOL =
    0

public actual fun CLIPOBJ_cEnumStart(pco: Long, ball: BOOL, itype: UInt, idirection: UInt, climit: UInt): UInt =
    0u

public actual fun CLIPOBJ_ppoGetPath(pco: Long): Long =
    0L

public actual fun CapabilitiesRequestAndCapabilitiesReply(hmonitor: HANDLE, pszasciicapabilitiesstring: PSTR, dwcapabilitiesstringlengthincharacters: UInt): Int =
    0

public actual fun DegaussMonitor(hmonitor: HANDLE): Int =
    0

public actual fun DestroyPhysicalMonitor(hmonitor: HANDLE): BOOL =
    0

public actual fun DestroyPhysicalMonitors(dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: Long): BOOL =
    0

public actual fun DisplayConfigGetDeviceInfo(requestpacket: Long): Int =
    0

public actual fun DisplayConfigSetDeviceInfo(setpacket: Long): Int =
    0

public actual fun EngAcquireSemaphore(hsem: HSEMAPHORE) {
}

public actual fun EngAlphaBlend(psodest: Long, psosrc: Long, pco: Long, pxlo: Long, prcldest: Long, prclsrc: Long, pblendobj: Long): BOOL =
    0

public actual fun EngAssociateSurface(hsurf: HSURF, hdev: HDEV, flhooks: UInt): BOOL =
    0

public actual fun EngBitBlt(psotrg: Long, psosrc: Long, psomask: Long, pco: Long, pxlo: Long, prcltrg: Long, pptlsrc: Long, pptlmask: Long, pbo: Long, pptlbrush: Long, rop4: UInt): BOOL =
    0

public actual fun EngCheckAbort(pso: Long): BOOL =
    0

public actual fun EngComputeGlyphSet(ncodepage: Int, nfirstchar: Int, cchars: Int): Long =
    0L

public actual fun EngCopyBits(psodest: Long, psosrc: Long, pco: Long, pxlo: Long, prcldest: Long, pptlsrc: Long): BOOL =
    0

public actual fun EngCreateBitmap(sizl: SIZE, lwidth: Int, iformat: UInt, fl: UInt, pvbits: Long): HBITMAP =
    0L

public actual fun EngCreateClip(): Long =
    0L

public actual fun EngCreateDeviceBitmap(dhsurf: DHSURF, sizl: SIZE, iformatcompat: UInt): HBITMAP =
    0L

public actual fun EngCreateDeviceSurface(dhsurf: DHSURF, sizl: SIZE, iformatcompat: UInt): HSURF =
    0L

public actual fun EngCreatePalette(imode: UInt, ccolors: UInt, pulcolors: Long, flred: UInt, flgreen: UInt, flblue: UInt): HPALETTE =
    0L

public actual fun EngCreateSemaphore(): HSEMAPHORE =
    0L

public actual fun EngDeleteClip(pco: Long) {
}

public actual fun EngDeletePalette(hpal: HPALETTE): BOOL =
    0

public actual fun EngDeletePath(ppo: Long) {
}

public actual fun EngDeleteSemaphore(hsem: HSEMAPHORE) {
}

public actual fun EngDeleteSurface(hsurf: HSURF): BOOL =
    0

public actual fun EngEraseSurface(pso: Long, prcl: Long, icolor: UInt): BOOL =
    0

public actual fun EngFillPath(pso: Long, ppo: Long, pco: Long, pbo: Long, pptlbrushorg: Long, mix: UInt, floptions: UInt): BOOL =
    0

public actual fun EngFindResource(h: HANDLE, iname: Int, itype: Int, pulsize: Long): Long =
    0L

public actual fun EngFreeModule(h: HANDLE) {
}

public actual fun EngGetCurrentCodePage(oemcodepage: Long, ansicodepage: Long) {
}

public actual fun EngGetDriverName(hdev: HDEV): PWSTR =
    0L

public actual fun EngGetPrinterDataFileName(hdev: HDEV): PWSTR =
    0L

public actual fun EngGradientFill(psodest: Long, pco: Long, pxlo: Long, pvertex: Long, nvertex: UInt, pmesh: Long, nmesh: UInt, prclextents: Long, pptlditherorg: Long, ulmode: UInt): BOOL =
    0

public actual fun EngLineTo(pso: Long, pco: Long, pbo: Long, x1: Int, y1: Int, x2: Int, y2: Int, prclbounds: Long, mix: UInt): BOOL =
    0

public actual fun EngLoadModule(pwsz: PCWSTR): HANDLE =
    0L

public actual fun EngLockSurface(hsurf: HSURF): Long =
    0L

public actual fun EngMarkBandingSurface(hsurf: HSURF): BOOL =
    0

public actual fun EngMultiByteToUnicodeN(unicodestring: PWSTR, maxbytesinunicodestring: UInt, bytesinunicodestring: Long, multibytestring: PCSTR, bytesinmultibytestring: UInt) {
}

public actual fun EngMultiByteToWideChar(codepage: UInt, widecharstring: PWSTR, bytesinwidecharstring: Int, multibytestring: PCSTR, bytesinmultibytestring: Int): Int =
    0

public actual fun EngPaint(pso: Long, pco: Long, pbo: Long, pptlbrushorg: Long, mix: UInt): BOOL =
    0

public actual fun EngPlgBlt(psotrg: Long, psosrc: Long, psomsk: Long, pco: Long, pxlo: Long, pca: Long, pptlbrushorg: Long, pptfx: Long, prcl: Long, pptl: Long, imode: UInt): BOOL =
    0

public actual fun EngQueryEMFInfo(hdev: HDEV, pemfinfo: Long): BOOL =
    0

public actual fun EngQueryLocalTime(param0: Long) {
}

public actual fun EngReleaseSemaphore(hsem: HSEMAPHORE) {
}

public actual fun EngStretchBlt(psodest: Long, psosrc: Long, psomask: Long, pco: Long, pxlo: Long, pca: Long, pptlhtorg: Long, prcldest: Long, prclsrc: Long, pptlmask: Long, imode: UInt): BOOL =
    0

public actual fun EngStretchBltROP(psodest: Long, psosrc: Long, psomask: Long, pco: Long, pxlo: Long, pca: Long, pptlhtorg: Long, prcldest: Long, prclsrc: Long, pptlmask: Long, imode: UInt, pbo: Long, rop4: UInt): BOOL =
    0

public actual fun EngStrokeAndFillPath(pso: Long, ppo: Long, pco: Long, pxo: Long, pbostroke: Long, plineattrs: Long, pbofill: Long, pptlbrushorg: Long, mixfill: UInt, floptions: UInt): BOOL =
    0

public actual fun EngStrokePath(pso: Long, ppo: Long, pco: Long, pxo: Long, pbo: Long, pptlbrushorg: Long, plineattrs: Long, mix: UInt): BOOL =
    0

public actual fun EngTextOut(pso: Long, pstro: Long, pfo: Long, pco: Long, prclextra: Long, prclopaque: Long, pbofore: Long, pboopaque: Long, pptlorg: Long, mix: UInt): BOOL =
    0

public actual fun EngTransparentBlt(psodst: Long, psosrc: Long, pco: Long, pxlo: Long, prcldst: Long, prclsrc: Long, transcolor: UInt, bcalledfrombitblt: UInt): BOOL =
    0

public actual fun EngUnicodeToMultiByteN(multibytestring: PSTR, maxbytesinmultibytestring: UInt, bytesinmultibytestring: Long, unicodestring: PCWSTR, bytesinunicodestring: UInt) {
}

public actual fun EngUnlockSurface(pso: Long) {
}

public actual fun EngWideCharToMultiByte(codepage: UInt, widecharstring: PCWSTR, bytesinwidecharstring: Int, multibytestring: PSTR, bytesinmultibytestring: Int): Int =
    0

public actual fun FONTOBJ_cGetAllGlyphHandles(pfo: Long, phg: Long): UInt =
    0u

public actual fun FONTOBJ_cGetGlyphs(pfo: Long, imode: UInt, cglyph: UInt, phg: Long, ppvglyph: Long): UInt =
    0u

public actual fun FONTOBJ_pQueryGlyphAttrs(pfo: Long, imode: UInt): Long =
    0L

public actual fun FONTOBJ_pfdg(pfo: Long): Long =
    0L

public actual fun FONTOBJ_pifi(pfo: Long): Long =
    0L

public actual fun FONTOBJ_pvTrueTypeFontFile(pfo: Long, pcjfile: Long): Long =
    0L

public actual fun FONTOBJ_pxoGetXform(pfo: Long): Long =
    0L

public actual fun FONTOBJ_vGetInfo(pfo: Long, cjsize: UInt, pfi: Long) {
}

public actual fun GetAutoRotationState(pstate: Long): BOOL =
    0

public actual fun GetCapabilitiesStringLength(hmonitor: HANDLE, pdwcapabilitiesstringlengthincharacters: Long): Int =
    0

public actual fun GetDisplayAutoRotationPreferences(porientation: Long): BOOL =
    0

public actual fun GetDisplayConfigBufferSizes(flags: QUERY_DISPLAY_CONFIG_FLAGS, numpatharrayelements: Long, nummodeinfoarrayelements: Long): WIN32_ERROR =
    0u

public actual fun GetMonitorBrightness(hmonitor: HANDLE, pdwminimumbrightness: Long, pdwcurrentbrightness: Long, pdwmaximumbrightness: Long): Int =
    0

public actual fun GetMonitorCapabilities(hmonitor: HANDLE, pdwmonitorcapabilities: Long, pdwsupportedcolortemperatures: Long): Int =
    0

public actual fun GetMonitorColorTemperature(hmonitor: HANDLE, pctcurrentcolortemperature: Long): Int =
    0

public actual fun GetMonitorContrast(hmonitor: HANDLE, pdwminimumcontrast: Long, pdwcurrentcontrast: Long, pdwmaximumcontrast: Long): Int =
    0

public actual fun GetMonitorDisplayAreaPosition(hmonitor: HANDLE, ptpositiontype: MC_POSITION_TYPE, pdwminimumposition: Long, pdwcurrentposition: Long, pdwmaximumposition: Long): Int =
    0

public actual fun GetMonitorDisplayAreaSize(hmonitor: HANDLE, stsizetype: MC_SIZE_TYPE, pdwminimumwidthorheight: Long, pdwcurrentwidthorheight: Long, pdwmaximumwidthorheight: Long): Int =
    0

public actual fun GetMonitorRedGreenOrBlueDrive(hmonitor: HANDLE, dtdrivetype: MC_DRIVE_TYPE, pdwminimumdrive: Long, pdwcurrentdrive: Long, pdwmaximumdrive: Long): Int =
    0

public actual fun GetMonitorRedGreenOrBlueGain(hmonitor: HANDLE, gtgaintype: MC_GAIN_TYPE, pdwminimumgain: Long, pdwcurrentgain: Long, pdwmaximumgain: Long): Int =
    0

public actual fun GetMonitorTechnologyType(hmonitor: HANDLE, pdtydisplaytechnologytype: Long): Int =
    0

public actual fun GetNumberOfPhysicalMonitorsFromHMONITOR(hmonitor: HMONITOR, pdwnumberofphysicalmonitors: Long): BOOL =
    0

public actual fun GetPhysicalMonitorsFromHMONITOR(hmonitor: HMONITOR, dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: Long): BOOL =
    0

public actual fun GetTimingReport(hmonitor: HANDLE, pmtrmonitortimingreport: Long): Int =
    0

public actual fun GetVCPFeatureAndVCPFeatureReply(hmonitor: HANDLE, bvcpcode: UByte, pvct: Long, pdwcurrentvalue: Long, pdwmaximumvalue: Long): Int =
    0

public actual fun HT_Get8BPPFormatPalette(ppaletteentry: Long, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int =
    0

public actual fun HT_Get8BPPMaskPalette(ppaletteentry: Long, use8bppmaskpal: BOOL, cmymask: UByte, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int =
    0

public actual fun PATHOBJ_bEnum(ppo: Long, ppd: Long): BOOL =
    0

public actual fun PATHOBJ_bEnumClipLines(ppo: Long, cb: UInt, pcl: Long): BOOL =
    0

public actual fun PATHOBJ_vEnumStart(ppo: Long) {
}

public actual fun PATHOBJ_vEnumStartClipLines(ppo: Long, pco: Long, pso: Long, pla: Long) {
}

public actual fun PATHOBJ_vGetBounds(ppo: Long, prectfx: Long) {
}

public actual fun QueryDisplayConfig(flags: QUERY_DISPLAY_CONFIG_FLAGS, numpatharrayelements: Long, patharray: Long, nummodeinfoarrayelements: Long, modeinfoarray: Long, currenttopologyid: Long): WIN32_ERROR =
    0u

public actual fun RestoreMonitorFactoryColorDefaults(hmonitor: HANDLE): Int =
    0

public actual fun RestoreMonitorFactoryDefaults(hmonitor: HANDLE): Int =
    0

public actual fun STROBJ_bEnum(pstro: Long, pc: Long, ppgpos: Long): BOOL =
    0

public actual fun STROBJ_bEnumPositionsOnly(pstro: Long, pc: Long, ppgpos: Long): BOOL =
    0

public actual fun STROBJ_bGetAdvanceWidths(pso: Long, ifirst: UInt, c: UInt, pptqd: Long): BOOL =
    0

public actual fun STROBJ_dwGetCodePage(pstro: Long): UInt =
    0u

public actual fun STROBJ_vEnumStart(pstro: Long) {
}

public actual fun SaveCurrentMonitorSettings(hmonitor: HANDLE): Int =
    0

public actual fun SaveCurrentSettings(hmonitor: HANDLE): Int =
    0

public actual fun SetDisplayAutoRotationPreferences(orientation: ORIENTATION_PREFERENCE): BOOL =
    0

public actual fun SetDisplayConfig(numpatharrayelements: UInt, patharray: Long, nummodeinfoarrayelements: UInt, modeinfoarray: Long, flags: SET_DISPLAY_CONFIG_FLAGS): Int =
    0

public actual fun SetMonitorBrightness(hmonitor: HANDLE, dwnewbrightness: UInt): Int =
    0

public actual fun SetMonitorColorTemperature(hmonitor: HANDLE, ctcurrentcolortemperature: MC_COLOR_TEMPERATURE): Int =
    0

public actual fun SetMonitorContrast(hmonitor: HANDLE, dwnewcontrast: UInt): Int =
    0

public actual fun SetMonitorDisplayAreaPosition(hmonitor: HANDLE, ptpositiontype: MC_POSITION_TYPE, dwnewposition: UInt): Int =
    0

public actual fun SetMonitorDisplayAreaSize(hmonitor: HANDLE, stsizetype: MC_SIZE_TYPE, dwnewdisplayareawidthorheight: UInt): Int =
    0

public actual fun SetMonitorRedGreenOrBlueDrive(hmonitor: HANDLE, dtdrivetype: MC_DRIVE_TYPE, dwnewdrive: UInt): Int =
    0

public actual fun SetMonitorRedGreenOrBlueGain(hmonitor: HANDLE, gtgaintype: MC_GAIN_TYPE, dwnewgain: UInt): Int =
    0

public actual fun SetVCPFeature(hmonitor: HANDLE, bvcpcode: UByte, dwnewvalue: UInt): Int =
    0

public actual fun XFORMOBJ_bApplyXform(pxo: Long, imode: UInt, cpoints: UInt, pvin: Long, pvout: Long): BOOL =
    0

public actual fun XFORMOBJ_iGetXform(pxo: Long, pxform: Long): UInt =
    0u

public actual fun XLATEOBJ_cGetPalette(pxlo: Long, ipal: UInt, cpal: UInt, ppal: Long): UInt =
    0u

public actual fun XLATEOBJ_hGetColorTransform(pxlo: Long): HANDLE =
    0L

public actual fun XLATEOBJ_iXlate(pxlo: Long, icolor: UInt): UInt =
    0u

public actual fun XLATEOBJ_piVector(pxlo: Long): Long =
    0L
