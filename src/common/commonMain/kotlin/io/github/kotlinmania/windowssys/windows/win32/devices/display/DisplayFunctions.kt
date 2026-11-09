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

public expect fun BRUSHOBJ_hGetColorTransform(pbo: Long): HANDLE

public expect fun BRUSHOBJ_pvAllocRbrush(pbo: Long, cj: UInt): Long

public expect fun BRUSHOBJ_pvGetRbrush(pbo: Long): Long

public expect fun BRUSHOBJ_ulGetBrushColor(pbo: Long): UInt

public expect fun CLIPOBJ_bEnum(pco: Long, cj: UInt, pul: Long): BOOL

public expect fun CLIPOBJ_cEnumStart(pco: Long, ball: BOOL, itype: UInt, idirection: UInt, climit: UInt): UInt

public expect fun CLIPOBJ_ppoGetPath(pco: Long): Long

public expect fun CapabilitiesRequestAndCapabilitiesReply(hmonitor: HANDLE, pszasciicapabilitiesstring: PSTR, dwcapabilitiesstringlengthincharacters: UInt): Int

public expect fun DegaussMonitor(hmonitor: HANDLE): Int

public expect fun DestroyPhysicalMonitor(hmonitor: HANDLE): BOOL

public expect fun DestroyPhysicalMonitors(dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: Long): BOOL

public expect fun DisplayConfigGetDeviceInfo(requestpacket: Long): Int

public expect fun DisplayConfigSetDeviceInfo(setpacket: Long): Int

public expect fun EngAcquireSemaphore(hsem: HSEMAPHORE)

public expect fun EngAlphaBlend(psodest: Long, psosrc: Long, pco: Long, pxlo: Long, prcldest: Long, prclsrc: Long, pblendobj: Long): BOOL

public expect fun EngAssociateSurface(hsurf: HSURF, hdev: HDEV, flhooks: UInt): BOOL

public expect fun EngBitBlt(psotrg: Long, psosrc: Long, psomask: Long, pco: Long, pxlo: Long, prcltrg: Long, pptlsrc: Long, pptlmask: Long, pbo: Long, pptlbrush: Long, rop4: UInt): BOOL

public expect fun EngCheckAbort(pso: Long): BOOL

public expect fun EngComputeGlyphSet(ncodepage: Int, nfirstchar: Int, cchars: Int): Long

public expect fun EngCopyBits(psodest: Long, psosrc: Long, pco: Long, pxlo: Long, prcldest: Long, pptlsrc: Long): BOOL

public expect fun EngCreateBitmap(sizl: SIZE, lwidth: Int, iformat: UInt, fl: UInt, pvbits: Long): HBITMAP

public expect fun EngCreateClip(): Long

public expect fun EngCreateDeviceBitmap(dhsurf: DHSURF, sizl: SIZE, iformatcompat: UInt): HBITMAP

public expect fun EngCreateDeviceSurface(dhsurf: DHSURF, sizl: SIZE, iformatcompat: UInt): HSURF

public expect fun EngCreatePalette(imode: UInt, ccolors: UInt, pulcolors: Long, flred: UInt, flgreen: UInt, flblue: UInt): HPALETTE

public expect fun EngCreateSemaphore(): HSEMAPHORE

public expect fun EngDeleteClip(pco: Long)

public expect fun EngDeletePalette(hpal: HPALETTE): BOOL

public expect fun EngDeletePath(ppo: Long)

public expect fun EngDeleteSemaphore(hsem: HSEMAPHORE)

public expect fun EngDeleteSurface(hsurf: HSURF): BOOL

public expect fun EngEraseSurface(pso: Long, prcl: Long, icolor: UInt): BOOL

public expect fun EngFillPath(pso: Long, ppo: Long, pco: Long, pbo: Long, pptlbrushorg: Long, mix: UInt, floptions: UInt): BOOL

public expect fun EngFindResource(h: HANDLE, iname: Int, itype: Int, pulsize: Long): Long

public expect fun EngFreeModule(h: HANDLE)

public expect fun EngGetCurrentCodePage(oemcodepage: Long, ansicodepage: Long)

public expect fun EngGetDriverName(hdev: HDEV): PWSTR

public expect fun EngGetPrinterDataFileName(hdev: HDEV): PWSTR

public expect fun EngGradientFill(psodest: Long, pco: Long, pxlo: Long, pvertex: Long, nvertex: UInt, pmesh: Long, nmesh: UInt, prclextents: Long, pptlditherorg: Long, ulmode: UInt): BOOL

public expect fun EngLineTo(pso: Long, pco: Long, pbo: Long, x1: Int, y1: Int, x2: Int, y2: Int, prclbounds: Long, mix: UInt): BOOL

public expect fun EngLoadModule(pwsz: PCWSTR): HANDLE

public expect fun EngLockSurface(hsurf: HSURF): Long

public expect fun EngMarkBandingSurface(hsurf: HSURF): BOOL

public expect fun EngMultiByteToUnicodeN(unicodestring: PWSTR, maxbytesinunicodestring: UInt, bytesinunicodestring: Long, multibytestring: PCSTR, bytesinmultibytestring: UInt)

public expect fun EngMultiByteToWideChar(codepage: UInt, widecharstring: PWSTR, bytesinwidecharstring: Int, multibytestring: PCSTR, bytesinmultibytestring: Int): Int

public expect fun EngPaint(pso: Long, pco: Long, pbo: Long, pptlbrushorg: Long, mix: UInt): BOOL

public expect fun EngPlgBlt(psotrg: Long, psosrc: Long, psomsk: Long, pco: Long, pxlo: Long, pca: Long, pptlbrushorg: Long, pptfx: Long, prcl: Long, pptl: Long, imode: UInt): BOOL

public expect fun EngQueryEMFInfo(hdev: HDEV, pemfinfo: Long): BOOL

public expect fun EngQueryLocalTime(param0: Long)

public expect fun EngReleaseSemaphore(hsem: HSEMAPHORE)

public expect fun EngStretchBlt(psodest: Long, psosrc: Long, psomask: Long, pco: Long, pxlo: Long, pca: Long, pptlhtorg: Long, prcldest: Long, prclsrc: Long, pptlmask: Long, imode: UInt): BOOL

public expect fun EngStretchBltROP(psodest: Long, psosrc: Long, psomask: Long, pco: Long, pxlo: Long, pca: Long, pptlhtorg: Long, prcldest: Long, prclsrc: Long, pptlmask: Long, imode: UInt, pbo: Long, rop4: UInt): BOOL

public expect fun EngStrokeAndFillPath(pso: Long, ppo: Long, pco: Long, pxo: Long, pbostroke: Long, plineattrs: Long, pbofill: Long, pptlbrushorg: Long, mixfill: UInt, floptions: UInt): BOOL

public expect fun EngStrokePath(pso: Long, ppo: Long, pco: Long, pxo: Long, pbo: Long, pptlbrushorg: Long, plineattrs: Long, mix: UInt): BOOL

public expect fun EngTextOut(pso: Long, pstro: Long, pfo: Long, pco: Long, prclextra: Long, prclopaque: Long, pbofore: Long, pboopaque: Long, pptlorg: Long, mix: UInt): BOOL

public expect fun EngTransparentBlt(psodst: Long, psosrc: Long, pco: Long, pxlo: Long, prcldst: Long, prclsrc: Long, transcolor: UInt, bcalledfrombitblt: UInt): BOOL

public expect fun EngUnicodeToMultiByteN(multibytestring: PSTR, maxbytesinmultibytestring: UInt, bytesinmultibytestring: Long, unicodestring: PCWSTR, bytesinunicodestring: UInt)

public expect fun EngUnlockSurface(pso: Long)

public expect fun EngWideCharToMultiByte(codepage: UInt, widecharstring: PCWSTR, bytesinwidecharstring: Int, multibytestring: PSTR, bytesinmultibytestring: Int): Int

public expect fun FONTOBJ_cGetAllGlyphHandles(pfo: Long, phg: Long): UInt

public expect fun FONTOBJ_cGetGlyphs(pfo: Long, imode: UInt, cglyph: UInt, phg: Long, ppvglyph: Long): UInt

public expect fun FONTOBJ_pQueryGlyphAttrs(pfo: Long, imode: UInt): Long

public expect fun FONTOBJ_pfdg(pfo: Long): Long

public expect fun FONTOBJ_pifi(pfo: Long): Long

public expect fun FONTOBJ_pvTrueTypeFontFile(pfo: Long, pcjfile: Long): Long

public expect fun FONTOBJ_pxoGetXform(pfo: Long): Long

public expect fun FONTOBJ_vGetInfo(pfo: Long, cjsize: UInt, pfi: Long)

public expect fun GetAutoRotationState(pstate: Long): BOOL

public expect fun GetCapabilitiesStringLength(hmonitor: HANDLE, pdwcapabilitiesstringlengthincharacters: Long): Int

public expect fun GetDisplayAutoRotationPreferences(porientation: Long): BOOL

public expect fun GetDisplayConfigBufferSizes(flags: QUERY_DISPLAY_CONFIG_FLAGS, numpatharrayelements: Long, nummodeinfoarrayelements: Long): WIN32_ERROR

public expect fun GetMonitorBrightness(hmonitor: HANDLE, pdwminimumbrightness: Long, pdwcurrentbrightness: Long, pdwmaximumbrightness: Long): Int

public expect fun GetMonitorCapabilities(hmonitor: HANDLE, pdwmonitorcapabilities: Long, pdwsupportedcolortemperatures: Long): Int

public expect fun GetMonitorColorTemperature(hmonitor: HANDLE, pctcurrentcolortemperature: Long): Int

public expect fun GetMonitorContrast(hmonitor: HANDLE, pdwminimumcontrast: Long, pdwcurrentcontrast: Long, pdwmaximumcontrast: Long): Int

public expect fun GetMonitorDisplayAreaPosition(hmonitor: HANDLE, ptpositiontype: MC_POSITION_TYPE, pdwminimumposition: Long, pdwcurrentposition: Long, pdwmaximumposition: Long): Int

public expect fun GetMonitorDisplayAreaSize(hmonitor: HANDLE, stsizetype: MC_SIZE_TYPE, pdwminimumwidthorheight: Long, pdwcurrentwidthorheight: Long, pdwmaximumwidthorheight: Long): Int

public expect fun GetMonitorRedGreenOrBlueDrive(hmonitor: HANDLE, dtdrivetype: MC_DRIVE_TYPE, pdwminimumdrive: Long, pdwcurrentdrive: Long, pdwmaximumdrive: Long): Int

public expect fun GetMonitorRedGreenOrBlueGain(hmonitor: HANDLE, gtgaintype: MC_GAIN_TYPE, pdwminimumgain: Long, pdwcurrentgain: Long, pdwmaximumgain: Long): Int

public expect fun GetMonitorTechnologyType(hmonitor: HANDLE, pdtydisplaytechnologytype: Long): Int

public expect fun GetNumberOfPhysicalMonitorsFromHMONITOR(hmonitor: HMONITOR, pdwnumberofphysicalmonitors: Long): BOOL

public expect fun GetPhysicalMonitorsFromHMONITOR(hmonitor: HMONITOR, dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: Long): BOOL

public expect fun GetTimingReport(hmonitor: HANDLE, pmtrmonitortimingreport: Long): Int

public expect fun GetVCPFeatureAndVCPFeatureReply(hmonitor: HANDLE, bvcpcode: UByte, pvct: Long, pdwcurrentvalue: Long, pdwmaximumvalue: Long): Int

public expect fun HT_Get8BPPFormatPalette(ppaletteentry: Long, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int

public expect fun HT_Get8BPPMaskPalette(ppaletteentry: Long, use8bppmaskpal: BOOL, cmymask: UByte, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int

public expect fun PATHOBJ_bEnum(ppo: Long, ppd: Long): BOOL

public expect fun PATHOBJ_bEnumClipLines(ppo: Long, cb: UInt, pcl: Long): BOOL

public expect fun PATHOBJ_vEnumStart(ppo: Long)

public expect fun PATHOBJ_vEnumStartClipLines(ppo: Long, pco: Long, pso: Long, pla: Long)

public expect fun PATHOBJ_vGetBounds(ppo: Long, prectfx: Long)

public expect fun QueryDisplayConfig(flags: QUERY_DISPLAY_CONFIG_FLAGS, numpatharrayelements: Long, patharray: Long, nummodeinfoarrayelements: Long, modeinfoarray: Long, currenttopologyid: Long): WIN32_ERROR

public expect fun RestoreMonitorFactoryColorDefaults(hmonitor: HANDLE): Int

public expect fun RestoreMonitorFactoryDefaults(hmonitor: HANDLE): Int

public expect fun STROBJ_bEnum(pstro: Long, pc: Long, ppgpos: Long): BOOL

public expect fun STROBJ_bEnumPositionsOnly(pstro: Long, pc: Long, ppgpos: Long): BOOL

public expect fun STROBJ_bGetAdvanceWidths(pso: Long, ifirst: UInt, c: UInt, pptqd: Long): BOOL

public expect fun STROBJ_dwGetCodePage(pstro: Long): UInt

public expect fun STROBJ_vEnumStart(pstro: Long)

public expect fun SaveCurrentMonitorSettings(hmonitor: HANDLE): Int

public expect fun SaveCurrentSettings(hmonitor: HANDLE): Int

public expect fun SetDisplayAutoRotationPreferences(orientation: ORIENTATION_PREFERENCE): BOOL

public expect fun SetDisplayConfig(numpatharrayelements: UInt, patharray: Long, nummodeinfoarrayelements: UInt, modeinfoarray: Long, flags: SET_DISPLAY_CONFIG_FLAGS): Int

public expect fun SetMonitorBrightness(hmonitor: HANDLE, dwnewbrightness: UInt): Int

public expect fun SetMonitorColorTemperature(hmonitor: HANDLE, ctcurrentcolortemperature: MC_COLOR_TEMPERATURE): Int

public expect fun SetMonitorContrast(hmonitor: HANDLE, dwnewcontrast: UInt): Int

public expect fun SetMonitorDisplayAreaPosition(hmonitor: HANDLE, ptpositiontype: MC_POSITION_TYPE, dwnewposition: UInt): Int

public expect fun SetMonitorDisplayAreaSize(hmonitor: HANDLE, stsizetype: MC_SIZE_TYPE, dwnewdisplayareawidthorheight: UInt): Int

public expect fun SetMonitorRedGreenOrBlueDrive(hmonitor: HANDLE, dtdrivetype: MC_DRIVE_TYPE, dwnewdrive: UInt): Int

public expect fun SetMonitorRedGreenOrBlueGain(hmonitor: HANDLE, gtgaintype: MC_GAIN_TYPE, dwnewgain: UInt): Int

public expect fun SetVCPFeature(hmonitor: HANDLE, bvcpcode: UByte, dwnewvalue: UInt): Int

public expect fun XFORMOBJ_bApplyXform(pxo: Long, imode: UInt, cpoints: UInt, pvin: Long, pvout: Long): BOOL

public expect fun XFORMOBJ_iGetXform(pxo: Long, pxform: Long): UInt

public expect fun XLATEOBJ_cGetPalette(pxlo: Long, ipal: UInt, cpal: UInt, ppal: Long): UInt

public expect fun XLATEOBJ_hGetColorTransform(pxlo: Long): HANDLE

public expect fun XLATEOBJ_iXlate(pxlo: Long, icolor: UInt): UInt

public expect fun XLATEOBJ_piVector(pxlo: Long): Long
