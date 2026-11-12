@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.display

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Pointl
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rectl
import io.github.kotlinmania.windowssys.windows.win32.foundation.Size
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Coloradjustment
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hmonitor
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Paletteentry
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Trivertex

private object WindowsWin32DevicesDisplayJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayBrushobjHGetColorTransform(pbo: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayBrushobjPvAllocRbrush(pbo: Long, cj: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayBrushobjPvGetRbrush(pbo: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayBrushobjUlGetBrushColor(pbo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayClipobjBEnum(pco: Long, cj: Int, pul: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayClipobjCEnumStart(pco: Long, ball: Int, itype: Int, idirection: Int, climit: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayClipobjPpoGetPath(pco: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayCapabilitiesRequestAndCapabilitiesReply(hmonitor: Long, pszasciicapabilitiesstring: Long, dwcapabilitiesstringlengthincharacters: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayDegaussMonitor(hmonitor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayDestroyPhysicalMonitor(hmonitor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayDestroyPhysicalMonitors(dwphysicalmonitorarraysize: Int, pphysicalmonitorarray: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayDisplayConfigGetDeviceInfo(requestpacket: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayDisplayConfigSetDeviceInfo(setpacket: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngAcquireSemaphore(hsem: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngAlphaBlend(psodest: Long, psosrc: Long, pco: Long, pxlo: Long, prcldest: Long, prclsrc: Long, pblendobj: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngAssociateSurface(hsurf: Long, hdev: Long, flhooks: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngBitBlt(psotrg: Long, psosrc: Long, psomask: Long, pco: Long, pxlo: Long, prcltrg: Long, pptlsrc: Long, pptlmask: Long, pbo: Long, pptlbrush: Long, rop4: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngCheckAbort(pso: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngComputeGlyphSet(ncodepage: Int, nfirstchar: Int, cchars: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngCopyBits(psodest: Long, psosrc: Long, pco: Long, pxlo: Long, prcldest: Long, pptlsrc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngCreateClip(): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngCreatePalette(imode: Int, ccolors: Int, pulcolors: Long, flred: Int, flgreen: Int, flblue: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngCreateSemaphore(): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngDeleteClip(pco: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngDeletePalette(hpal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngDeletePath(ppo: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngDeleteSemaphore(hsem: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngDeleteSurface(hsurf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngEraseSurface(pso: Long, prcl: Long, icolor: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngFillPath(pso: Long, ppo: Long, pco: Long, pbo: Long, pptlbrushorg: Long, mix: Int, floptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngFindResource(h: Long, iname: Int, itype: Int, pulsize: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngFreeModule(h: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngGetCurrentCodePage(oemcodepage: Long, ansicodepage: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngGetDriverName(hdev: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngGetPrinterDataFileName(hdev: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngGradientFill(psodest: Long, pco: Long, pxlo: Long, pvertex: Long, nvertex: Int, pmesh: Long, nmesh: Int, prclextents: Long, pptlditherorg: Long, ulmode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngLineTo(pso: Long, pco: Long, pbo: Long, x1: Int, y1: Int, x2: Int, y2: Int, prclbounds: Long, mix: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngLoadModule(pwsz: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngLockSurface(hsurf: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngMarkBandingSurface(hsurf: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngMultiByteToUnicodeN(unicodestring: Long, maxbytesinunicodestring: Int, bytesinunicodestring: Long, multibytestring: Long, bytesinmultibytestring: Int)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngMultiByteToWideChar(codepage: Int, widecharstring: Long, bytesinwidecharstring: Int, multibytestring: Long, bytesinmultibytestring: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngPaint(pso: Long, pco: Long, pbo: Long, pptlbrushorg: Long, mix: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngPlgBlt(psotrg: Long, psosrc: Long, psomsk: Long, pco: Long, pxlo: Long, pca: Long, pptlbrushorg: Long, pptfx: Long, prcl: Long, pptl: Long, imode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngQueryEMFInfo(hdev: Long, pemfinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngQueryLocalTime(param0: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngReleaseSemaphore(hsem: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngStretchBlt(psodest: Long, psosrc: Long, psomask: Long, pco: Long, pxlo: Long, pca: Long, pptlhtorg: Long, prcldest: Long, prclsrc: Long, pptlmask: Long, imode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngStretchBltROP(psodest: Long, psosrc: Long, psomask: Long, pco: Long, pxlo: Long, pca: Long, pptlhtorg: Long, prcldest: Long, prclsrc: Long, pptlmask: Long, imode: Int, pbo: Long, rop4: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngStrokeAndFillPath(pso: Long, ppo: Long, pco: Long, pxo: Long, pbostroke: Long, plineattrs: Long, pbofill: Long, pptlbrushorg: Long, mixfill: Int, floptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngStrokePath(pso: Long, ppo: Long, pco: Long, pxo: Long, pbo: Long, pptlbrushorg: Long, plineattrs: Long, mix: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngTextOut(pso: Long, pstro: Long, pfo: Long, pco: Long, prclextra: Long, prclopaque: Long, pbofore: Long, pboopaque: Long, pptlorg: Long, mix: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngTransparentBlt(psodst: Long, psosrc: Long, pco: Long, pxlo: Long, prcldst: Long, prclsrc: Long, transcolor: Int, bcalledfrombitblt: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngUnicodeToMultiByteN(multibytestring: Long, maxbytesinmultibytestring: Int, bytesinmultibytestring: Long, unicodestring: Long, bytesinunicodestring: Int)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngUnlockSurface(pso: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayEngWideCharToMultiByte(codepage: Int, widecharstring: Long, bytesinwidecharstring: Int, multibytestring: Long, bytesinmultibytestring: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayFontobjCGetAllGlyphHandles(pfo: Long, phg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayFontobjCGetGlyphs(pfo: Long, imode: Int, cglyph: Int, phg: Long, ppvglyph: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayFontobjPQueryGlyphAttrs(pfo: Long, imode: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayFontobjPfdg(pfo: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayFontobjPifi(pfo: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayFontobjPvTrueTypeFontFile(pfo: Long, pcjfile: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayFontobjPxoGetXform(pfo: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayFontobjVGetInfo(pfo: Long, cjsize: Int, pfi: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayGetAutoRotationState(pstate: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayGetCapabilitiesStringLength(hmonitor: Long, pdwcapabilitiesstringlengthincharacters: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayGetDisplayAutoRotationPreferences(porientation: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayGetDisplayConfigBufferSizes(flags: Int, numpatharrayelements: Long, nummodeinfoarrayelements: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayGetMonitorBrightness(hmonitor: Long, pdwminimumbrightness: Long, pdwcurrentbrightness: Long, pdwmaximumbrightness: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayGetMonitorCapabilities(hmonitor: Long, pdwmonitorcapabilities: Long, pdwsupportedcolortemperatures: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayGetMonitorColorTemperature(hmonitor: Long, pctcurrentcolortemperature: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayGetMonitorContrast(hmonitor: Long, pdwminimumcontrast: Long, pdwcurrentcontrast: Long, pdwmaximumcontrast: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayGetMonitorDisplayAreaPosition(hmonitor: Long, ptpositiontype: Int, pdwminimumposition: Long, pdwcurrentposition: Long, pdwmaximumposition: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayGetMonitorDisplayAreaSize(hmonitor: Long, stsizetype: Int, pdwminimumwidthorheight: Long, pdwcurrentwidthorheight: Long, pdwmaximumwidthorheight: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayGetMonitorRedGreenOrBlueDrive(hmonitor: Long, dtdrivetype: Int, pdwminimumdrive: Long, pdwcurrentdrive: Long, pdwmaximumdrive: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayGetMonitorRedGreenOrBlueGain(hmonitor: Long, gtgaintype: Int, pdwminimumgain: Long, pdwcurrentgain: Long, pdwmaximumgain: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayGetMonitorTechnologyType(hmonitor: Long, pdtydisplaytechnologytype: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayGetNumberOfPhysicalMonitorsFromHMONITOR(hmonitor: Long, pdwnumberofphysicalmonitors: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayGetPhysicalMonitorsFromHMONITOR(hmonitor: Long, dwphysicalmonitorarraysize: Int, pphysicalmonitorarray: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayGetTimingReport(hmonitor: Long, pmtrmonitortimingreport: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayGetVCPFeatureAndVCPFeatureReply(hmonitor: Long, bvcpcode: Byte, pvct: Long, pdwcurrentvalue: Long, pdwmaximumvalue: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayHtGet8BppformatPalette(ppaletteentry: Long, redgamma: Short, greengamma: Short, bluegamma: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayHtGet8BppmaskPalette(ppaletteentry: Long, use8bppmaskpal: Int, cmymask: Byte, redgamma: Short, greengamma: Short, bluegamma: Short): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayPathobjBEnum(ppo: Long, ppd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayPathobjBEnumClipLines(ppo: Long, cb: Int, pcl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayPathobjVEnumStart(ppo: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayPathobjVEnumStartClipLines(ppo: Long, pco: Long, pso: Long, pla: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayPathobjVGetBounds(ppo: Long, prectfx: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayQueryDisplayConfig(flags: Int, numpatharrayelements: Long, patharray: Long, nummodeinfoarrayelements: Long, modeinfoarray: Long, currenttopologyid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayRestoreMonitorFactoryColorDefaults(hmonitor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayRestoreMonitorFactoryDefaults(hmonitor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayStrobjBEnum(pstro: Long, pc: Long, ppgpos: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayStrobjBEnumPositionsOnly(pstro: Long, pc: Long, ppgpos: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayStrobjBGetAdvanceWidths(pso: Long, ifirst: Int, c: Int, pptqd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayStrobjDwGetCodePage(pstro: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayStrobjVEnumStart(pstro: Long)

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplaySaveCurrentMonitorSettings(hmonitor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplaySaveCurrentSettings(hmonitor: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplaySetDisplayAutoRotationPreferences(orientation: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplaySetDisplayConfig(numpatharrayelements: Int, patharray: Long, nummodeinfoarrayelements: Int, modeinfoarray: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplaySetMonitorBrightness(hmonitor: Long, dwnewbrightness: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplaySetMonitorColorTemperature(hmonitor: Long, ctcurrentcolortemperature: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplaySetMonitorContrast(hmonitor: Long, dwnewcontrast: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplaySetMonitorDisplayAreaPosition(hmonitor: Long, ptpositiontype: Int, dwnewposition: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplaySetMonitorDisplayAreaSize(hmonitor: Long, stsizetype: Int, dwnewdisplayareawidthorheight: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplaySetMonitorRedGreenOrBlueDrive(hmonitor: Long, dtdrivetype: Int, dwnewdrive: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplaySetMonitorRedGreenOrBlueGain(hmonitor: Long, gtgaintype: Int, dwnewgain: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplaySetVCPFeature(hmonitor: Long, bvcpcode: Byte, dwnewvalue: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayXformobjBApplyXform(pxo: Long, imode: Int, cpoints: Int, pvin: Long, pvout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayXformobjIGetXform(pxo: Long, pxform: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayXlateobjCGetPalette(pxlo: Long, ipal: Int, cpal: Int, ppal: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayXlateobjHGetColorTransform(pxlo: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayXlateobjIXlate(pxlo: Long, icolor: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32DevicesDisplayXlateobjPiVector(pxlo: Long): Long
}

public actual fun brushobjHGetColorTransform(pbo: MutPtr<Brushobj>): Handle =
    MutPtr(WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayBrushobjHGetColorTransform(pbo.rawAddress))

public actual fun brushobjPvAllocRbrush(pbo: MutPtr<Brushobj>, cj: UInt): MutPtr<CVoid> =
    MutPtr(WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayBrushobjPvAllocRbrush(pbo.rawAddress, cj.toInt()))

public actual fun brushobjPvGetRbrush(pbo: MutPtr<Brushobj>): MutPtr<CVoid> =
    MutPtr(WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayBrushobjPvGetRbrush(pbo.rawAddress))

public actual fun brushobjUlGetBrushColor(pbo: MutPtr<Brushobj>): UInt =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayBrushobjUlGetBrushColor(pbo.rawAddress).toUInt()

public actual fun clipobjBEnum(pco: MutPtr<Clipobj>, cj: UInt, pul: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayClipobjBEnum(pco.rawAddress, cj.toInt(), pul.rawAddress)

public actual fun clipobjCEnumStart(pco: MutPtr<Clipobj>, ball: Bool, itype: UInt, idirection: UInt, climit: UInt): UInt =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayClipobjCEnumStart(pco.rawAddress, ball, itype.toInt(), idirection.toInt(), climit.toInt()).toUInt()

public actual fun clipobjPpoGetPath(pco: MutPtr<Clipobj>): MutPtr<Pathobj> =
    MutPtr(WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayClipobjPpoGetPath(pco.rawAddress))

public actual fun capabilitiesRequestAndCapabilitiesReply(hmonitor: Handle, pszasciicapabilitiesstring: Pstr, dwcapabilitiesstringlengthincharacters: UInt): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayCapabilitiesRequestAndCapabilitiesReply(hmonitor.rawAddress, pszasciicapabilitiesstring.rawAddress, dwcapabilitiesstringlengthincharacters.toInt())

public actual fun degaussMonitor(hmonitor: Handle): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayDegaussMonitor(hmonitor.rawAddress)

public actual fun destroyPhysicalMonitor(hmonitor: Handle): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayDestroyPhysicalMonitor(hmonitor.rawAddress)

public actual fun destroyPhysicalMonitors(dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: ConstPtr<PhysicalMonitor>): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayDestroyPhysicalMonitors(dwphysicalmonitorarraysize.toInt(), pphysicalmonitorarray.rawAddress)

public actual fun displayConfigGetDeviceInfo(requestpacket: MutPtr<DisplayconfigDeviceInfoHeader>): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayDisplayConfigGetDeviceInfo(requestpacket.rawAddress)

public actual fun displayConfigSetDeviceInfo(setpacket: ConstPtr<DisplayconfigDeviceInfoHeader>): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayDisplayConfigSetDeviceInfo(setpacket.rawAddress)

public actual fun engAcquireSemaphore(hsem: Hsemaphore) {
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngAcquireSemaphore(hsem.rawAddress)
}

public actual fun engAlphaBlend(psodest: MutPtr<Surfobj>, psosrc: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pxlo: MutPtr<Xlateobj>, prcldest: MutPtr<Rectl>, prclsrc: MutPtr<Rectl>, pblendobj: MutPtr<Blendobj>): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngAlphaBlend(psodest.rawAddress, psosrc.rawAddress, pco.rawAddress, pxlo.rawAddress, prcldest.rawAddress, prclsrc.rawAddress, pblendobj.rawAddress)

public actual fun engAssociateSurface(hsurf: Hsurf, hdev: Hdev, flhooks: UInt): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngAssociateSurface(hsurf.rawAddress, hdev.rawAddress, flhooks.toInt())

public actual fun engBitBlt(psotrg: ConstPtr<Surfobj>, psosrc: ConstPtr<Surfobj>, psomask: ConstPtr<Surfobj>, pco: ConstPtr<Clipobj>, pxlo: ConstPtr<Xlateobj>, prcltrg: ConstPtr<Rectl>, pptlsrc: ConstPtr<Pointl>, pptlmask: ConstPtr<Pointl>, pbo: ConstPtr<Brushobj>, pptlbrush: ConstPtr<Pointl>, rop4: UInt): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngBitBlt(psotrg.rawAddress, psosrc.rawAddress, psomask.rawAddress, pco.rawAddress, pxlo.rawAddress, prcltrg.rawAddress, pptlsrc.rawAddress, pptlmask.rawAddress, pbo.rawAddress, pptlbrush.rawAddress, rop4.toInt())

public actual fun engCheckAbort(pso: MutPtr<Surfobj>): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngCheckAbort(pso.rawAddress)

public actual fun engComputeGlyphSet(ncodepage: Int, nfirstchar: Int, cchars: Int): MutPtr<FdGlyphset> =
    MutPtr(WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngComputeGlyphSet(ncodepage, nfirstchar, cchars))

public actual fun engCopyBits(psodest: MutPtr<Surfobj>, psosrc: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pxlo: MutPtr<Xlateobj>, prcldest: MutPtr<Rectl>, pptlsrc: MutPtr<Pointl>): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngCopyBits(psodest.rawAddress, psosrc.rawAddress, pco.rawAddress, pxlo.rawAddress, prcldest.rawAddress, pptlsrc.rawAddress)

public actual fun engCreateBitmap(sizl: Size, lwidth: Int, iformat: UInt, fl: UInt, pvbits: MutPtr<CVoid>): Hbitmap =
    MutPtr(0L)

public actual fun engCreateClip(): MutPtr<Clipobj> =
    MutPtr(WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngCreateClip())

public actual fun engCreateDeviceBitmap(dhsurf: Dhsurf, sizl: Size, iformatcompat: UInt): Hbitmap =
    MutPtr(0L)

public actual fun engCreateDeviceSurface(dhsurf: Dhsurf, sizl: Size, iformatcompat: UInt): Hsurf =
    MutPtr(0L)

public actual fun engCreatePalette(imode: UInt, ccolors: UInt, pulcolors: MutPtr<UInt>, flred: UInt, flgreen: UInt, flblue: UInt): Hpalette =
    MutPtr(WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngCreatePalette(imode.toInt(), ccolors.toInt(), pulcolors.rawAddress, flred.toInt(), flgreen.toInt(), flblue.toInt()))

public actual fun engCreateSemaphore(): Hsemaphore =
    MutPtr(WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngCreateSemaphore())

public actual fun engDeleteClip(pco: ConstPtr<Clipobj>) {
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngDeleteClip(pco.rawAddress)
}

public actual fun engDeletePalette(hpal: Hpalette): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngDeletePalette(hpal.rawAddress)

public actual fun engDeletePath(ppo: MutPtr<Pathobj>) {
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngDeletePath(ppo.rawAddress)
}

public actual fun engDeleteSemaphore(hsem: Hsemaphore) {
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngDeleteSemaphore(hsem.rawAddress)
}

public actual fun engDeleteSurface(hsurf: Hsurf): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngDeleteSurface(hsurf.rawAddress)

public actual fun engEraseSurface(pso: MutPtr<Surfobj>, prcl: MutPtr<Rectl>, icolor: UInt): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngEraseSurface(pso.rawAddress, prcl.rawAddress, icolor.toInt())

public actual fun engFillPath(pso: MutPtr<Surfobj>, ppo: MutPtr<Pathobj>, pco: MutPtr<Clipobj>, pbo: MutPtr<Brushobj>, pptlbrushorg: MutPtr<Pointl>, mix: UInt, floptions: UInt): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngFillPath(pso.rawAddress, ppo.rawAddress, pco.rawAddress, pbo.rawAddress, pptlbrushorg.rawAddress, mix.toInt(), floptions.toInt())

public actual fun engFindResource(h: Handle, iname: Int, itype: Int, pulsize: MutPtr<UInt>): MutPtr<CVoid> =
    MutPtr(WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngFindResource(h.rawAddress, iname, itype, pulsize.rawAddress))

public actual fun engFreeModule(h: Handle) {
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngFreeModule(h.rawAddress)
}

public actual fun engGetCurrentCodePage(oemcodepage: MutPtr<UShort>, ansicodepage: MutPtr<UShort>) {
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngGetCurrentCodePage(oemcodepage.rawAddress, ansicodepage.rawAddress)
}

public actual fun engGetDriverName(hdev: Hdev): Pwstr =
    MutPtr(WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngGetDriverName(hdev.rawAddress))

public actual fun engGetPrinterDataFileName(hdev: Hdev): Pwstr =
    MutPtr(WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngGetPrinterDataFileName(hdev.rawAddress))

public actual fun engGradientFill(psodest: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pxlo: MutPtr<Xlateobj>, pvertex: MutPtr<Trivertex>, nvertex: UInt, pmesh: MutPtr<CVoid>, nmesh: UInt, prclextents: MutPtr<Rectl>, pptlditherorg: MutPtr<Pointl>, ulmode: UInt): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngGradientFill(psodest.rawAddress, pco.rawAddress, pxlo.rawAddress, pvertex.rawAddress, nvertex.toInt(), pmesh.rawAddress, nmesh.toInt(), prclextents.rawAddress, pptlditherorg.rawAddress, ulmode.toInt())

public actual fun engLineTo(pso: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pbo: MutPtr<Brushobj>, x1: Int, y1: Int, x2: Int, y2: Int, prclbounds: MutPtr<Rectl>, mix: UInt): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngLineTo(pso.rawAddress, pco.rawAddress, pbo.rawAddress, x1, y1, x2, y2, prclbounds.rawAddress, mix.toInt())

public actual fun engLoadModule(pwsz: Pcwstr): Handle =
    MutPtr(WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngLoadModule(pwsz.rawAddress))

public actual fun engLockSurface(hsurf: Hsurf): MutPtr<Surfobj> =
    MutPtr(WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngLockSurface(hsurf.rawAddress))

public actual fun engMarkBandingSurface(hsurf: Hsurf): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngMarkBandingSurface(hsurf.rawAddress)

public actual fun engMultiByteToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: MutPtr<UInt>, multibytestring: Pcstr, bytesinmultibytestring: UInt) {
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngMultiByteToUnicodeN(unicodestring.rawAddress, maxbytesinunicodestring.toInt(), bytesinunicodestring.rawAddress, multibytestring.rawAddress, bytesinmultibytestring.toInt())
}

public actual fun engMultiByteToWideChar(codepage: UInt, widecharstring: Pwstr, bytesinwidecharstring: Int, multibytestring: Pcstr, bytesinmultibytestring: Int): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngMultiByteToWideChar(codepage.toInt(), widecharstring.rawAddress, bytesinwidecharstring, multibytestring.rawAddress, bytesinmultibytestring)

public actual fun engPaint(pso: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pbo: MutPtr<Brushobj>, pptlbrushorg: MutPtr<Pointl>, mix: UInt): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngPaint(pso.rawAddress, pco.rawAddress, pbo.rawAddress, pptlbrushorg.rawAddress, mix.toInt())

public actual fun engPlgBlt(psotrg: MutPtr<Surfobj>, psosrc: MutPtr<Surfobj>, psomsk: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pxlo: MutPtr<Xlateobj>, pca: MutPtr<Coloradjustment>, pptlbrushorg: MutPtr<Pointl>, pptfx: MutPtr<Pointfix>, prcl: MutPtr<Rectl>, pptl: MutPtr<Pointl>, imode: UInt): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngPlgBlt(psotrg.rawAddress, psosrc.rawAddress, psomsk.rawAddress, pco.rawAddress, pxlo.rawAddress, pca.rawAddress, pptlbrushorg.rawAddress, pptfx.rawAddress, prcl.rawAddress, pptl.rawAddress, imode.toInt())

public actual fun engQueryEMFInfo(hdev: Hdev, pemfinfo: MutPtr<Emfinfo>): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngQueryEMFInfo(hdev.rawAddress, pemfinfo.rawAddress)

public actual fun engQueryLocalTime(param0: MutPtr<EngTimeFields>) {
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngQueryLocalTime(param0.rawAddress)
}

public actual fun engReleaseSemaphore(hsem: Hsemaphore) {
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngReleaseSemaphore(hsem.rawAddress)
}

public actual fun engStretchBlt(psodest: MutPtr<Surfobj>, psosrc: MutPtr<Surfobj>, psomask: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pxlo: MutPtr<Xlateobj>, pca: MutPtr<Coloradjustment>, pptlhtorg: MutPtr<Pointl>, prcldest: MutPtr<Rectl>, prclsrc: MutPtr<Rectl>, pptlmask: MutPtr<Pointl>, imode: UInt): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngStretchBlt(psodest.rawAddress, psosrc.rawAddress, psomask.rawAddress, pco.rawAddress, pxlo.rawAddress, pca.rawAddress, pptlhtorg.rawAddress, prcldest.rawAddress, prclsrc.rawAddress, pptlmask.rawAddress, imode.toInt())

public actual fun engStretchBltROP(psodest: MutPtr<Surfobj>, psosrc: MutPtr<Surfobj>, psomask: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pxlo: MutPtr<Xlateobj>, pca: MutPtr<Coloradjustment>, pptlhtorg: MutPtr<Pointl>, prcldest: MutPtr<Rectl>, prclsrc: MutPtr<Rectl>, pptlmask: MutPtr<Pointl>, imode: UInt, pbo: MutPtr<Brushobj>, rop4: UInt): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngStretchBltROP(psodest.rawAddress, psosrc.rawAddress, psomask.rawAddress, pco.rawAddress, pxlo.rawAddress, pca.rawAddress, pptlhtorg.rawAddress, prcldest.rawAddress, prclsrc.rawAddress, pptlmask.rawAddress, imode.toInt(), pbo.rawAddress, rop4.toInt())

public actual fun engStrokeAndFillPath(pso: MutPtr<Surfobj>, ppo: MutPtr<Pathobj>, pco: MutPtr<Clipobj>, pxo: MutPtr<Xformobj>, pbostroke: MutPtr<Brushobj>, plineattrs: MutPtr<Lineattrs>, pbofill: MutPtr<Brushobj>, pptlbrushorg: MutPtr<Pointl>, mixfill: UInt, floptions: UInt): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngStrokeAndFillPath(pso.rawAddress, ppo.rawAddress, pco.rawAddress, pxo.rawAddress, pbostroke.rawAddress, plineattrs.rawAddress, pbofill.rawAddress, pptlbrushorg.rawAddress, mixfill.toInt(), floptions.toInt())

public actual fun engStrokePath(pso: MutPtr<Surfobj>, ppo: MutPtr<Pathobj>, pco: MutPtr<Clipobj>, pxo: MutPtr<Xformobj>, pbo: MutPtr<Brushobj>, pptlbrushorg: MutPtr<Pointl>, plineattrs: MutPtr<Lineattrs>, mix: UInt): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngStrokePath(pso.rawAddress, ppo.rawAddress, pco.rawAddress, pxo.rawAddress, pbo.rawAddress, pptlbrushorg.rawAddress, plineattrs.rawAddress, mix.toInt())

public actual fun engTextOut(pso: MutPtr<Surfobj>, pstro: MutPtr<Strobj>, pfo: MutPtr<Fontobj>, pco: MutPtr<Clipobj>, prclextra: MutPtr<Rectl>, prclopaque: MutPtr<Rectl>, pbofore: MutPtr<Brushobj>, pboopaque: MutPtr<Brushobj>, pptlorg: MutPtr<Pointl>, mix: UInt): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngTextOut(pso.rawAddress, pstro.rawAddress, pfo.rawAddress, pco.rawAddress, prclextra.rawAddress, prclopaque.rawAddress, pbofore.rawAddress, pboopaque.rawAddress, pptlorg.rawAddress, mix.toInt())

public actual fun engTransparentBlt(psodst: ConstPtr<Surfobj>, psosrc: ConstPtr<Surfobj>, pco: ConstPtr<Clipobj>, pxlo: ConstPtr<Xlateobj>, prcldst: ConstPtr<Rectl>, prclsrc: ConstPtr<Rectl>, transcolor: UInt, bcalledfrombitblt: UInt): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngTransparentBlt(psodst.rawAddress, psosrc.rawAddress, pco.rawAddress, pxlo.rawAddress, prcldst.rawAddress, prclsrc.rawAddress, transcolor.toInt(), bcalledfrombitblt.toInt())

public actual fun engUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: MutPtr<UInt>, unicodestring: Pcwstr, bytesinunicodestring: UInt) {
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngUnicodeToMultiByteN(multibytestring.rawAddress, maxbytesinmultibytestring.toInt(), bytesinmultibytestring.rawAddress, unicodestring.rawAddress, bytesinunicodestring.toInt())
}

public actual fun engUnlockSurface(pso: MutPtr<Surfobj>) {
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngUnlockSurface(pso.rawAddress)
}

public actual fun engWideCharToMultiByte(codepage: UInt, widecharstring: Pcwstr, bytesinwidecharstring: Int, multibytestring: Pstr, bytesinmultibytestring: Int): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayEngWideCharToMultiByte(codepage.toInt(), widecharstring.rawAddress, bytesinwidecharstring, multibytestring.rawAddress, bytesinmultibytestring)

public actual fun fontobjCGetAllGlyphHandles(pfo: MutPtr<Fontobj>, phg: MutPtr<UInt>): UInt =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayFontobjCGetAllGlyphHandles(pfo.rawAddress, phg.rawAddress).toUInt()

public actual fun fontobjCGetGlyphs(pfo: MutPtr<Fontobj>, imode: UInt, cglyph: UInt, phg: MutPtr<UInt>, ppvglyph: MutPtr<MutPtr<CVoid>>): UInt =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayFontobjCGetGlyphs(pfo.rawAddress, imode.toInt(), cglyph.toInt(), phg.rawAddress, ppvglyph.rawAddress).toUInt()

public actual fun fontobjPQueryGlyphAttrs(pfo: MutPtr<Fontobj>, imode: UInt): MutPtr<FdGlyphattr> =
    MutPtr(WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayFontobjPQueryGlyphAttrs(pfo.rawAddress, imode.toInt()))

public actual fun fontobjPfdg(pfo: MutPtr<Fontobj>): MutPtr<FdGlyphset> =
    MutPtr(WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayFontobjPfdg(pfo.rawAddress))

public actual fun fontobjPifi(pfo: ConstPtr<Fontobj>): MutPtr<Ifimetrics> =
    MutPtr(WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayFontobjPifi(pfo.rawAddress))

public actual fun fontobjPvTrueTypeFontFile(pfo: MutPtr<Fontobj>, pcjfile: MutPtr<UInt>): MutPtr<CVoid> =
    MutPtr(WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayFontobjPvTrueTypeFontFile(pfo.rawAddress, pcjfile.rawAddress))

public actual fun fontobjPxoGetXform(pfo: ConstPtr<Fontobj>): MutPtr<Xformobj> =
    MutPtr(WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayFontobjPxoGetXform(pfo.rawAddress))

public actual fun fontobjVGetInfo(pfo: MutPtr<Fontobj>, cjsize: UInt, pfi: MutPtr<Fontinfo>) {
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayFontobjVGetInfo(pfo.rawAddress, cjsize.toInt(), pfi.rawAddress)
}

public actual fun getAutoRotationState(pstate: MutPtr<ArState>): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayGetAutoRotationState(pstate.rawAddress)

public actual fun getCapabilitiesStringLength(hmonitor: Handle, pdwcapabilitiesstringlengthincharacters: MutPtr<UInt>): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayGetCapabilitiesStringLength(hmonitor.rawAddress, pdwcapabilitiesstringlengthincharacters.rawAddress)

public actual fun getDisplayAutoRotationPreferences(porientation: MutPtr<OrientationPreference>): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayGetDisplayAutoRotationPreferences(porientation.rawAddress)

public actual fun getDisplayConfigBufferSizes(flags: QueryDisplayConfigFlags, numpatharrayelements: MutPtr<UInt>, nummodeinfoarrayelements: MutPtr<UInt>): Win32Error =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayGetDisplayConfigBufferSizes(flags.toInt(), numpatharrayelements.rawAddress, nummodeinfoarrayelements.rawAddress).toUInt()

public actual fun getMonitorBrightness(hmonitor: Handle, pdwminimumbrightness: MutPtr<UInt>, pdwcurrentbrightness: MutPtr<UInt>, pdwmaximumbrightness: MutPtr<UInt>): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayGetMonitorBrightness(hmonitor.rawAddress, pdwminimumbrightness.rawAddress, pdwcurrentbrightness.rawAddress, pdwmaximumbrightness.rawAddress)

public actual fun getMonitorCapabilities(hmonitor: Handle, pdwmonitorcapabilities: MutPtr<UInt>, pdwsupportedcolortemperatures: MutPtr<UInt>): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayGetMonitorCapabilities(hmonitor.rawAddress, pdwmonitorcapabilities.rawAddress, pdwsupportedcolortemperatures.rawAddress)

public actual fun getMonitorColorTemperature(hmonitor: Handle, pctcurrentcolortemperature: MutPtr<McColorTemperature>): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayGetMonitorColorTemperature(hmonitor.rawAddress, pctcurrentcolortemperature.rawAddress)

public actual fun getMonitorContrast(hmonitor: Handle, pdwminimumcontrast: MutPtr<UInt>, pdwcurrentcontrast: MutPtr<UInt>, pdwmaximumcontrast: MutPtr<UInt>): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayGetMonitorContrast(hmonitor.rawAddress, pdwminimumcontrast.rawAddress, pdwcurrentcontrast.rawAddress, pdwmaximumcontrast.rawAddress)

public actual fun getMonitorDisplayAreaPosition(hmonitor: Handle, ptpositiontype: McPositionType, pdwminimumposition: MutPtr<UInt>, pdwcurrentposition: MutPtr<UInt>, pdwmaximumposition: MutPtr<UInt>): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayGetMonitorDisplayAreaPosition(hmonitor.rawAddress, ptpositiontype, pdwminimumposition.rawAddress, pdwcurrentposition.rawAddress, pdwmaximumposition.rawAddress)

public actual fun getMonitorDisplayAreaSize(hmonitor: Handle, stsizetype: McSizeType, pdwminimumwidthorheight: MutPtr<UInt>, pdwcurrentwidthorheight: MutPtr<UInt>, pdwmaximumwidthorheight: MutPtr<UInt>): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayGetMonitorDisplayAreaSize(hmonitor.rawAddress, stsizetype, pdwminimumwidthorheight.rawAddress, pdwcurrentwidthorheight.rawAddress, pdwmaximumwidthorheight.rawAddress)

public actual fun getMonitorRedGreenOrBlueDrive(hmonitor: Handle, dtdrivetype: McDriveType, pdwminimumdrive: MutPtr<UInt>, pdwcurrentdrive: MutPtr<UInt>, pdwmaximumdrive: MutPtr<UInt>): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayGetMonitorRedGreenOrBlueDrive(hmonitor.rawAddress, dtdrivetype, pdwminimumdrive.rawAddress, pdwcurrentdrive.rawAddress, pdwmaximumdrive.rawAddress)

public actual fun getMonitorRedGreenOrBlueGain(hmonitor: Handle, gtgaintype: McGainType, pdwminimumgain: MutPtr<UInt>, pdwcurrentgain: MutPtr<UInt>, pdwmaximumgain: MutPtr<UInt>): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayGetMonitorRedGreenOrBlueGain(hmonitor.rawAddress, gtgaintype, pdwminimumgain.rawAddress, pdwcurrentgain.rawAddress, pdwmaximumgain.rawAddress)

public actual fun getMonitorTechnologyType(hmonitor: Handle, pdtydisplaytechnologytype: MutPtr<McDisplayTechnologyType>): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayGetMonitorTechnologyType(hmonitor.rawAddress, pdtydisplaytechnologytype.rawAddress)

public actual fun getNumberOfPhysicalMonitorsFromHMONITOR(hmonitor: Hmonitor, pdwnumberofphysicalmonitors: MutPtr<UInt>): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayGetNumberOfPhysicalMonitorsFromHMONITOR(hmonitor.rawAddress, pdwnumberofphysicalmonitors.rawAddress)

public actual fun getPhysicalMonitorsFromHMONITOR(hmonitor: Hmonitor, dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: MutPtr<PhysicalMonitor>): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayGetPhysicalMonitorsFromHMONITOR(hmonitor.rawAddress, dwphysicalmonitorarraysize.toInt(), pphysicalmonitorarray.rawAddress)

public actual fun getTimingReport(hmonitor: Handle, pmtrmonitortimingreport: MutPtr<McTimingReport>): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayGetTimingReport(hmonitor.rawAddress, pmtrmonitortimingreport.rawAddress)

public actual fun getVCPFeatureAndVCPFeatureReply(hmonitor: Handle, bvcpcode: UByte, pvct: MutPtr<McVcpCodeType>, pdwcurrentvalue: MutPtr<UInt>, pdwmaximumvalue: MutPtr<UInt>): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayGetVCPFeatureAndVCPFeatureReply(hmonitor.rawAddress, bvcpcode.toByte(), pvct.rawAddress, pdwcurrentvalue.rawAddress, pdwmaximumvalue.rawAddress)

public actual fun htGet8BppformatPalette(ppaletteentry: MutPtr<Paletteentry>, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayHtGet8BppformatPalette(ppaletteentry.rawAddress, redgamma.toShort(), greengamma.toShort(), bluegamma.toShort())

public actual fun htGet8BppmaskPalette(ppaletteentry: MutPtr<Paletteentry>, use8bppmaskpal: Bool, cmymask: UByte, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayHtGet8BppmaskPalette(ppaletteentry.rawAddress, use8bppmaskpal, cmymask.toByte(), redgamma.toShort(), greengamma.toShort(), bluegamma.toShort())

public actual fun pathobjBEnum(ppo: MutPtr<Pathobj>, ppd: MutPtr<Pathdata>): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayPathobjBEnum(ppo.rawAddress, ppd.rawAddress)

public actual fun pathobjBEnumClipLines(ppo: MutPtr<Pathobj>, cb: UInt, pcl: MutPtr<Clipline>): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayPathobjBEnumClipLines(ppo.rawAddress, cb.toInt(), pcl.rawAddress)

public actual fun pathobjVEnumStart(ppo: MutPtr<Pathobj>) {
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayPathobjVEnumStart(ppo.rawAddress)
}

public actual fun pathobjVEnumStartClipLines(ppo: MutPtr<Pathobj>, pco: MutPtr<Clipobj>, pso: MutPtr<Surfobj>, pla: MutPtr<Lineattrs>) {
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayPathobjVEnumStartClipLines(ppo.rawAddress, pco.rawAddress, pso.rawAddress, pla.rawAddress)
}

public actual fun pathobjVGetBounds(ppo: MutPtr<Pathobj>, prectfx: MutPtr<Rectfx>) {
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayPathobjVGetBounds(ppo.rawAddress, prectfx.rawAddress)
}

public actual fun queryDisplayConfig(flags: QueryDisplayConfigFlags, numpatharrayelements: MutPtr<UInt>, patharray: MutPtr<DisplayconfigPathInfo>, nummodeinfoarrayelements: MutPtr<UInt>, modeinfoarray: MutPtr<DisplayconfigModeInfo>, currenttopologyid: MutPtr<DisplayconfigTopologyId>): Win32Error =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayQueryDisplayConfig(flags.toInt(), numpatharrayelements.rawAddress, patharray.rawAddress, nummodeinfoarrayelements.rawAddress, modeinfoarray.rawAddress, currenttopologyid.rawAddress).toUInt()

public actual fun restoreMonitorFactoryColorDefaults(hmonitor: Handle): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayRestoreMonitorFactoryColorDefaults(hmonitor.rawAddress)

public actual fun restoreMonitorFactoryDefaults(hmonitor: Handle): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayRestoreMonitorFactoryDefaults(hmonitor.rawAddress)

public actual fun strobjBEnum(pstro: MutPtr<Strobj>, pc: MutPtr<UInt>, ppgpos: MutPtr<MutPtr<Glyphpos>>): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayStrobjBEnum(pstro.rawAddress, pc.rawAddress, ppgpos.rawAddress)

public actual fun strobjBEnumPositionsOnly(pstro: MutPtr<Strobj>, pc: MutPtr<UInt>, ppgpos: MutPtr<MutPtr<Glyphpos>>): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayStrobjBEnumPositionsOnly(pstro.rawAddress, pc.rawAddress, ppgpos.rawAddress)

public actual fun strobjBGetAdvanceWidths(pso: MutPtr<Strobj>, ifirst: UInt, c: UInt, pptqd: MutPtr<Pointqf>): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayStrobjBGetAdvanceWidths(pso.rawAddress, ifirst.toInt(), c.toInt(), pptqd.rawAddress)

public actual fun strobjDwGetCodePage(pstro: MutPtr<Strobj>): UInt =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayStrobjDwGetCodePage(pstro.rawAddress).toUInt()

public actual fun strobjVEnumStart(pstro: MutPtr<Strobj>) {
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayStrobjVEnumStart(pstro.rawAddress)
}

public actual fun saveCurrentMonitorSettings(hmonitor: Handle): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplaySaveCurrentMonitorSettings(hmonitor.rawAddress)

public actual fun saveCurrentSettings(hmonitor: Handle): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplaySaveCurrentSettings(hmonitor.rawAddress)

public actual fun setDisplayAutoRotationPreferences(orientation: OrientationPreference): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplaySetDisplayAutoRotationPreferences(orientation)

public actual fun setDisplayConfig(numpatharrayelements: UInt, patharray: ConstPtr<DisplayconfigPathInfo>, nummodeinfoarrayelements: UInt, modeinfoarray: ConstPtr<DisplayconfigModeInfo>, flags: SetDisplayConfigFlags): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplaySetDisplayConfig(numpatharrayelements.toInt(), patharray.rawAddress, nummodeinfoarrayelements.toInt(), modeinfoarray.rawAddress, flags.toInt())

public actual fun setMonitorBrightness(hmonitor: Handle, dwnewbrightness: UInt): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplaySetMonitorBrightness(hmonitor.rawAddress, dwnewbrightness.toInt())

public actual fun setMonitorColorTemperature(hmonitor: Handle, ctcurrentcolortemperature: McColorTemperature): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplaySetMonitorColorTemperature(hmonitor.rawAddress, ctcurrentcolortemperature)

public actual fun setMonitorContrast(hmonitor: Handle, dwnewcontrast: UInt): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplaySetMonitorContrast(hmonitor.rawAddress, dwnewcontrast.toInt())

public actual fun setMonitorDisplayAreaPosition(hmonitor: Handle, ptpositiontype: McPositionType, dwnewposition: UInt): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplaySetMonitorDisplayAreaPosition(hmonitor.rawAddress, ptpositiontype, dwnewposition.toInt())

public actual fun setMonitorDisplayAreaSize(hmonitor: Handle, stsizetype: McSizeType, dwnewdisplayareawidthorheight: UInt): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplaySetMonitorDisplayAreaSize(hmonitor.rawAddress, stsizetype, dwnewdisplayareawidthorheight.toInt())

public actual fun setMonitorRedGreenOrBlueDrive(hmonitor: Handle, dtdrivetype: McDriveType, dwnewdrive: UInt): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplaySetMonitorRedGreenOrBlueDrive(hmonitor.rawAddress, dtdrivetype, dwnewdrive.toInt())

public actual fun setMonitorRedGreenOrBlueGain(hmonitor: Handle, gtgaintype: McGainType, dwnewgain: UInt): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplaySetMonitorRedGreenOrBlueGain(hmonitor.rawAddress, gtgaintype, dwnewgain.toInt())

public actual fun setVCPFeature(hmonitor: Handle, bvcpcode: UByte, dwnewvalue: UInt): Int =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplaySetVCPFeature(hmonitor.rawAddress, bvcpcode.toByte(), dwnewvalue.toInt())

public actual fun xformobjBApplyXform(pxo: MutPtr<Xformobj>, imode: UInt, cpoints: UInt, pvin: MutPtr<CVoid>, pvout: MutPtr<CVoid>): Bool =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayXformobjBApplyXform(pxo.rawAddress, imode.toInt(), cpoints.toInt(), pvin.rawAddress, pvout.rawAddress)

public actual fun xformobjIGetXform(pxo: ConstPtr<Xformobj>, pxform: MutPtr<Xforml>): UInt =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayXformobjIGetXform(pxo.rawAddress, pxform.rawAddress).toUInt()

public actual fun xlateobjCGetPalette(pxlo: MutPtr<Xlateobj>, ipal: UInt, cpal: UInt, ppal: MutPtr<UInt>): UInt =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayXlateobjCGetPalette(pxlo.rawAddress, ipal.toInt(), cpal.toInt(), ppal.rawAddress).toUInt()

public actual fun xlateobjHGetColorTransform(pxlo: MutPtr<Xlateobj>): Handle =
    MutPtr(WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayXlateobjHGetColorTransform(pxlo.rawAddress))

public actual fun xlateobjIXlate(pxlo: MutPtr<Xlateobj>, icolor: UInt): UInt =
    WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayXlateobjIXlate(pxlo.rawAddress, icolor.toInt()).toUInt()

public actual fun xlateobjPiVector(pxlo: MutPtr<Xlateobj>): MutPtr<UInt> =
    MutPtr(WindowsWin32DevicesDisplayJniBridge.windowssysWindowsWin32DevicesDisplayXlateobjPiVector(pxlo.rawAddress))
