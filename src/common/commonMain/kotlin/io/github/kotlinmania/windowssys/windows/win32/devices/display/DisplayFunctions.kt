package io.github.kotlinmania.windowssys.windows.win32.devices.display

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

public expect fun brushobjHGetColorTransform(pbo: MutPtr): Handle

public expect fun brushobjPvAllocRbrush(pbo: MutPtr, cj: UInt): MutPtr

public expect fun brushobjPvGetRbrush(pbo: MutPtr): MutPtr

public expect fun brushobjUlGetBrushColor(pbo: MutPtr): UInt

public expect fun clipobjBEnum(pco: MutPtr, cj: UInt, pul: MutPtr): Bool

public expect fun clipobjCEnumStart(pco: MutPtr, ball: Bool, itype: UInt, idirection: UInt, climit: UInt): UInt

public expect fun clipobjPpoGetPath(pco: MutPtr): MutPtr

public expect fun capabilitiesRequestAndCapabilitiesReply(hmonitor: Handle, pszasciicapabilitiesstring: Pstr, dwcapabilitiesstringlengthincharacters: UInt): Int

public expect fun degaussMonitor(hmonitor: Handle): Int

public expect fun destroyPhysicalMonitor(hmonitor: Handle): Bool

public expect fun destroyPhysicalMonitors(dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: ConstPtr): Bool

public expect fun displayConfigGetDeviceInfo(requestpacket: MutPtr): Int

public expect fun displayConfigSetDeviceInfo(setpacket: ConstPtr): Int

public expect fun engAcquireSemaphore(hsem: Hsemaphore)

public expect fun engAlphaBlend(psodest: MutPtr, psosrc: MutPtr, pco: MutPtr, pxlo: MutPtr, prcldest: MutPtr, prclsrc: MutPtr, pblendobj: MutPtr): Bool

public expect fun engAssociateSurface(hsurf: Hsurf, hdev: Hdev, flhooks: UInt): Bool

public expect fun engBitBlt(psotrg: ConstPtr, psosrc: ConstPtr, psomask: ConstPtr, pco: ConstPtr, pxlo: ConstPtr, prcltrg: ConstPtr, pptlsrc: ConstPtr, pptlmask: ConstPtr, pbo: ConstPtr, pptlbrush: ConstPtr, rop4: UInt): Bool

public expect fun engCheckAbort(pso: MutPtr): Bool

public expect fun engComputeGlyphSet(ncodepage: Int, nfirstchar: Int, cchars: Int): MutPtr

public expect fun engCopyBits(psodest: MutPtr, psosrc: MutPtr, pco: MutPtr, pxlo: MutPtr, prcldest: MutPtr, pptlsrc: MutPtr): Bool

public expect fun engCreateBitmap(sizl: Size, lwidth: Int, iformat: UInt, fl: UInt, pvbits: MutPtr): Hbitmap

public expect fun engCreateClip(): MutPtr

public expect fun engCreateDeviceBitmap(dhsurf: Dhsurf, sizl: Size, iformatcompat: UInt): Hbitmap

public expect fun engCreateDeviceSurface(dhsurf: Dhsurf, sizl: Size, iformatcompat: UInt): Hsurf

public expect fun engCreatePalette(imode: UInt, ccolors: UInt, pulcolors: MutPtr, flred: UInt, flgreen: UInt, flblue: UInt): Hpalette

public expect fun engCreateSemaphore(): Hsemaphore

public expect fun engDeleteClip(pco: ConstPtr)

public expect fun engDeletePalette(hpal: Hpalette): Bool

public expect fun engDeletePath(ppo: MutPtr)

public expect fun engDeleteSemaphore(hsem: Hsemaphore)

public expect fun engDeleteSurface(hsurf: Hsurf): Bool

public expect fun engEraseSurface(pso: MutPtr, prcl: MutPtr, icolor: UInt): Bool

public expect fun engFillPath(pso: MutPtr, ppo: MutPtr, pco: MutPtr, pbo: MutPtr, pptlbrushorg: MutPtr, mix: UInt, floptions: UInt): Bool

public expect fun engFindResource(h: Handle, iname: Int, itype: Int, pulsize: MutPtr): MutPtr

public expect fun engFreeModule(h: Handle)

public expect fun engGetCurrentCodePage(oemcodepage: MutPtr, ansicodepage: MutPtr)

public expect fun engGetDriverName(hdev: Hdev): Pwstr

public expect fun engGetPrinterDataFileName(hdev: Hdev): Pwstr

public expect fun engGradientFill(psodest: MutPtr, pco: MutPtr, pxlo: MutPtr, pvertex: MutPtr, nvertex: UInt, pmesh: MutPtr, nmesh: UInt, prclextents: MutPtr, pptlditherorg: MutPtr, ulmode: UInt): Bool

public expect fun engLineTo(pso: MutPtr, pco: MutPtr, pbo: MutPtr, x1: Int, y1: Int, x2: Int, y2: Int, prclbounds: MutPtr, mix: UInt): Bool

public expect fun engLoadModule(pwsz: Pcwstr): Handle

public expect fun engLockSurface(hsurf: Hsurf): MutPtr

public expect fun engMarkBandingSurface(hsurf: Hsurf): Bool

public expect fun engMultiByteToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: MutPtr, multibytestring: Pcstr, bytesinmultibytestring: UInt)

public expect fun engMultiByteToWideChar(codepage: UInt, widecharstring: Pwstr, bytesinwidecharstring: Int, multibytestring: Pcstr, bytesinmultibytestring: Int): Int

public expect fun engPaint(pso: MutPtr, pco: MutPtr, pbo: MutPtr, pptlbrushorg: MutPtr, mix: UInt): Bool

public expect fun engPlgBlt(psotrg: MutPtr, psosrc: MutPtr, psomsk: MutPtr, pco: MutPtr, pxlo: MutPtr, pca: MutPtr, pptlbrushorg: MutPtr, pptfx: MutPtr, prcl: MutPtr, pptl: MutPtr, imode: UInt): Bool

public expect fun engQueryEMFInfo(hdev: Hdev, pemfinfo: MutPtr): Bool

public expect fun engQueryLocalTime(param0: MutPtr)

public expect fun engReleaseSemaphore(hsem: Hsemaphore)

public expect fun engStretchBlt(psodest: MutPtr, psosrc: MutPtr, psomask: MutPtr, pco: MutPtr, pxlo: MutPtr, pca: MutPtr, pptlhtorg: MutPtr, prcldest: MutPtr, prclsrc: MutPtr, pptlmask: MutPtr, imode: UInt): Bool

public expect fun engStretchBltROP(psodest: MutPtr, psosrc: MutPtr, psomask: MutPtr, pco: MutPtr, pxlo: MutPtr, pca: MutPtr, pptlhtorg: MutPtr, prcldest: MutPtr, prclsrc: MutPtr, pptlmask: MutPtr, imode: UInt, pbo: MutPtr, rop4: UInt): Bool

public expect fun engStrokeAndFillPath(pso: MutPtr, ppo: MutPtr, pco: MutPtr, pxo: MutPtr, pbostroke: MutPtr, plineattrs: MutPtr, pbofill: MutPtr, pptlbrushorg: MutPtr, mixfill: UInt, floptions: UInt): Bool

public expect fun engStrokePath(pso: MutPtr, ppo: MutPtr, pco: MutPtr, pxo: MutPtr, pbo: MutPtr, pptlbrushorg: MutPtr, plineattrs: MutPtr, mix: UInt): Bool

public expect fun engTextOut(pso: MutPtr, pstro: MutPtr, pfo: MutPtr, pco: MutPtr, prclextra: MutPtr, prclopaque: MutPtr, pbofore: MutPtr, pboopaque: MutPtr, pptlorg: MutPtr, mix: UInt): Bool

public expect fun engTransparentBlt(psodst: ConstPtr, psosrc: ConstPtr, pco: ConstPtr, pxlo: ConstPtr, prcldst: ConstPtr, prclsrc: ConstPtr, transcolor: UInt, bcalledfrombitblt: UInt): Bool

public expect fun engUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: MutPtr, unicodestring: Pcwstr, bytesinunicodestring: UInt)

public expect fun engUnlockSurface(pso: MutPtr)

public expect fun engWideCharToMultiByte(codepage: UInt, widecharstring: Pcwstr, bytesinwidecharstring: Int, multibytestring: Pstr, bytesinmultibytestring: Int): Int

public expect fun fontobjCGetAllGlyphHandles(pfo: MutPtr, phg: MutPtr): UInt

public expect fun fontobjCGetGlyphs(pfo: MutPtr, imode: UInt, cglyph: UInt, phg: MutPtr, ppvglyph: MutPtr): UInt

public expect fun fontobjPQueryGlyphAttrs(pfo: MutPtr, imode: UInt): MutPtr

public expect fun fontobjPfdg(pfo: MutPtr): MutPtr

public expect fun fontobjPifi(pfo: ConstPtr): MutPtr

public expect fun fontobjPvTrueTypeFontFile(pfo: MutPtr, pcjfile: MutPtr): MutPtr

public expect fun fontobjPxoGetXform(pfo: ConstPtr): MutPtr

public expect fun fontobjVGetInfo(pfo: MutPtr, cjsize: UInt, pfi: MutPtr)

public expect fun getAutoRotationState(pstate: MutPtr): Bool

public expect fun getCapabilitiesStringLength(hmonitor: Handle, pdwcapabilitiesstringlengthincharacters: MutPtr): Int

public expect fun getDisplayAutoRotationPreferences(porientation: MutPtr): Bool

public expect fun getDisplayConfigBufferSizes(flags: QueryDisplayConfigFlags, numpatharrayelements: MutPtr, nummodeinfoarrayelements: MutPtr): Win32Error

public expect fun getMonitorBrightness(hmonitor: Handle, pdwminimumbrightness: MutPtr, pdwcurrentbrightness: MutPtr, pdwmaximumbrightness: MutPtr): Int

public expect fun getMonitorCapabilities(hmonitor: Handle, pdwmonitorcapabilities: MutPtr, pdwsupportedcolortemperatures: MutPtr): Int

public expect fun getMonitorColorTemperature(hmonitor: Handle, pctcurrentcolortemperature: MutPtr): Int

public expect fun getMonitorContrast(hmonitor: Handle, pdwminimumcontrast: MutPtr, pdwcurrentcontrast: MutPtr, pdwmaximumcontrast: MutPtr): Int

public expect fun getMonitorDisplayAreaPosition(hmonitor: Handle, ptpositiontype: McPositionType, pdwminimumposition: MutPtr, pdwcurrentposition: MutPtr, pdwmaximumposition: MutPtr): Int

public expect fun getMonitorDisplayAreaSize(hmonitor: Handle, stsizetype: McSizeType, pdwminimumwidthorheight: MutPtr, pdwcurrentwidthorheight: MutPtr, pdwmaximumwidthorheight: MutPtr): Int

public expect fun getMonitorRedGreenOrBlueDrive(hmonitor: Handle, dtdrivetype: McDriveType, pdwminimumdrive: MutPtr, pdwcurrentdrive: MutPtr, pdwmaximumdrive: MutPtr): Int

public expect fun getMonitorRedGreenOrBlueGain(hmonitor: Handle, gtgaintype: McGainType, pdwminimumgain: MutPtr, pdwcurrentgain: MutPtr, pdwmaximumgain: MutPtr): Int

public expect fun getMonitorTechnologyType(hmonitor: Handle, pdtydisplaytechnologytype: MutPtr): Int

public expect fun getNumberOfPhysicalMonitorsFromHMONITOR(hmonitor: Hmonitor, pdwnumberofphysicalmonitors: MutPtr): Bool

public expect fun getPhysicalMonitorsFromHMONITOR(hmonitor: Hmonitor, dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: MutPtr): Bool

public expect fun getTimingReport(hmonitor: Handle, pmtrmonitortimingreport: MutPtr): Int

public expect fun getVCPFeatureAndVCPFeatureReply(hmonitor: Handle, bvcpcode: UByte, pvct: MutPtr, pdwcurrentvalue: MutPtr, pdwmaximumvalue: MutPtr): Int

public expect fun htGet8BppformatPalette(ppaletteentry: MutPtr, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int

public expect fun htGet8BppmaskPalette(ppaletteentry: MutPtr, use8bppmaskpal: Bool, cmymask: UByte, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int

public expect fun pathobjBEnum(ppo: MutPtr, ppd: MutPtr): Bool

public expect fun pathobjBEnumClipLines(ppo: MutPtr, cb: UInt, pcl: MutPtr): Bool

public expect fun pathobjVEnumStart(ppo: MutPtr)

public expect fun pathobjVEnumStartClipLines(ppo: MutPtr, pco: MutPtr, pso: MutPtr, pla: MutPtr)

public expect fun pathobjVGetBounds(ppo: MutPtr, prectfx: MutPtr)

public expect fun queryDisplayConfig(flags: QueryDisplayConfigFlags, numpatharrayelements: MutPtr, patharray: MutPtr, nummodeinfoarrayelements: MutPtr, modeinfoarray: MutPtr, currenttopologyid: MutPtr): Win32Error

public expect fun restoreMonitorFactoryColorDefaults(hmonitor: Handle): Int

public expect fun restoreMonitorFactoryDefaults(hmonitor: Handle): Int

public expect fun strobjBEnum(pstro: MutPtr, pc: MutPtr, ppgpos: MutPtr): Bool

public expect fun strobjBEnumPositionsOnly(pstro: MutPtr, pc: MutPtr, ppgpos: MutPtr): Bool

public expect fun strobjBGetAdvanceWidths(pso: MutPtr, ifirst: UInt, c: UInt, pptqd: MutPtr): Bool

public expect fun strobjDwGetCodePage(pstro: MutPtr): UInt

public expect fun strobjVEnumStart(pstro: MutPtr)

public expect fun saveCurrentMonitorSettings(hmonitor: Handle): Int

public expect fun saveCurrentSettings(hmonitor: Handle): Int

public expect fun setDisplayAutoRotationPreferences(orientation: OrientationPreference): Bool

public expect fun setDisplayConfig(numpatharrayelements: UInt, patharray: ConstPtr, nummodeinfoarrayelements: UInt, modeinfoarray: ConstPtr, flags: SetDisplayConfigFlags): Int

public expect fun setMonitorBrightness(hmonitor: Handle, dwnewbrightness: UInt): Int

public expect fun setMonitorColorTemperature(hmonitor: Handle, ctcurrentcolortemperature: McColorTemperature): Int

public expect fun setMonitorContrast(hmonitor: Handle, dwnewcontrast: UInt): Int

public expect fun setMonitorDisplayAreaPosition(hmonitor: Handle, ptpositiontype: McPositionType, dwnewposition: UInt): Int

public expect fun setMonitorDisplayAreaSize(hmonitor: Handle, stsizetype: McSizeType, dwnewdisplayareawidthorheight: UInt): Int

public expect fun setMonitorRedGreenOrBlueDrive(hmonitor: Handle, dtdrivetype: McDriveType, dwnewdrive: UInt): Int

public expect fun setMonitorRedGreenOrBlueGain(hmonitor: Handle, gtgaintype: McGainType, dwnewgain: UInt): Int

public expect fun setVCPFeature(hmonitor: Handle, bvcpcode: UByte, dwnewvalue: UInt): Int

public expect fun xformobjBApplyXform(pxo: MutPtr, imode: UInt, cpoints: UInt, pvin: MutPtr, pvout: MutPtr): Bool

public expect fun xformobjIGetXform(pxo: ConstPtr, pxform: MutPtr): UInt

public expect fun xlateobjCGetPalette(pxlo: MutPtr, ipal: UInt, cpal: UInt, ppal: MutPtr): UInt

public expect fun xlateobjHGetColorTransform(pxlo: MutPtr): Handle

public expect fun xlateobjIXlate(pxlo: MutPtr, icolor: UInt): UInt

public expect fun xlateobjPiVector(pxlo: MutPtr): MutPtr
