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

public expect fun brushobjHGetColorTransform(pbo: COpaquePointer?): Handle

public expect fun brushobjPvAllocRbrush(pbo: COpaquePointer?, cj: UInt): COpaquePointer?

public expect fun brushobjPvGetRbrush(pbo: COpaquePointer?): COpaquePointer?

public expect fun brushobjUlGetBrushColor(pbo: COpaquePointer?): UInt

public expect fun clipobjBEnum(pco: COpaquePointer?, cj: UInt, pul: COpaquePointer?): Bool

public expect fun clipobjCEnumStart(pco: COpaquePointer?, ball: Bool, itype: UInt, idirection: UInt, climit: UInt): UInt

public expect fun clipobjPpoGetPath(pco: COpaquePointer?): COpaquePointer?

public expect fun capabilitiesRequestAndCapabilitiesReply(hmonitor: Handle, pszasciicapabilitiesstring: Pstr, dwcapabilitiesstringlengthincharacters: UInt): Int

public expect fun degaussMonitor(hmonitor: Handle): Int

public expect fun destroyPhysicalMonitor(hmonitor: Handle): Bool

public expect fun destroyPhysicalMonitors(dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: COpaquePointer?): Bool

public expect fun displayConfigGetDeviceInfo(requestpacket: COpaquePointer?): Int

public expect fun displayConfigSetDeviceInfo(setpacket: COpaquePointer?): Int

public expect fun engAcquireSemaphore(hsem: Hsemaphore)

public expect fun engAlphaBlend(psodest: COpaquePointer?, psosrc: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, prcldest: COpaquePointer?, prclsrc: COpaquePointer?, pblendobj: COpaquePointer?): Bool

public expect fun engAssociateSurface(hsurf: Hsurf, hdev: Hdev, flhooks: UInt): Bool

public expect fun engBitBlt(psotrg: COpaquePointer?, psosrc: COpaquePointer?, psomask: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, prcltrg: COpaquePointer?, pptlsrc: COpaquePointer?, pptlmask: COpaquePointer?, pbo: COpaquePointer?, pptlbrush: COpaquePointer?, rop4: UInt): Bool

public expect fun engCheckAbort(pso: COpaquePointer?): Bool

public expect fun engComputeGlyphSet(ncodepage: Int, nfirstchar: Int, cchars: Int): COpaquePointer?

public expect fun engCopyBits(psodest: COpaquePointer?, psosrc: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, prcldest: COpaquePointer?, pptlsrc: COpaquePointer?): Bool

public expect fun engCreateBitmap(sizl: Size, lwidth: Int, iformat: UInt, fl: UInt, pvbits: COpaquePointer?): Hbitmap

public expect fun engCreateClip(): COpaquePointer?

public expect fun engCreateDeviceBitmap(dhsurf: Dhsurf, sizl: Size, iformatcompat: UInt): Hbitmap

public expect fun engCreateDeviceSurface(dhsurf: Dhsurf, sizl: Size, iformatcompat: UInt): Hsurf

public expect fun engCreatePalette(imode: UInt, ccolors: UInt, pulcolors: COpaquePointer?, flred: UInt, flgreen: UInt, flblue: UInt): Hpalette

public expect fun engCreateSemaphore(): Hsemaphore

public expect fun engDeleteClip(pco: COpaquePointer?)

public expect fun engDeletePalette(hpal: Hpalette): Bool

public expect fun engDeletePath(ppo: COpaquePointer?)

public expect fun engDeleteSemaphore(hsem: Hsemaphore)

public expect fun engDeleteSurface(hsurf: Hsurf): Bool

public expect fun engEraseSurface(pso: COpaquePointer?, prcl: COpaquePointer?, icolor: UInt): Bool

public expect fun engFillPath(pso: COpaquePointer?, ppo: COpaquePointer?, pco: COpaquePointer?, pbo: COpaquePointer?, pptlbrushorg: COpaquePointer?, mix: UInt, floptions: UInt): Bool

public expect fun engFindResource(h: Handle, iname: Int, itype: Int, pulsize: COpaquePointer?): COpaquePointer?

public expect fun engFreeModule(h: Handle)

public expect fun engGetCurrentCodePage(oemcodepage: COpaquePointer?, ansicodepage: COpaquePointer?)

public expect fun engGetDriverName(hdev: Hdev): Pwstr

public expect fun engGetPrinterDataFileName(hdev: Hdev): Pwstr

public expect fun engGradientFill(psodest: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, pvertex: COpaquePointer?, nvertex: UInt, pmesh: COpaquePointer?, nmesh: UInt, prclextents: COpaquePointer?, pptlditherorg: COpaquePointer?, ulmode: UInt): Bool

public expect fun engLineTo(pso: COpaquePointer?, pco: COpaquePointer?, pbo: COpaquePointer?, x1: Int, y1: Int, x2: Int, y2: Int, prclbounds: COpaquePointer?, mix: UInt): Bool

public expect fun engLoadModule(pwsz: Pcwstr): Handle

public expect fun engLockSurface(hsurf: Hsurf): COpaquePointer?

public expect fun engMarkBandingSurface(hsurf: Hsurf): Bool

public expect fun engMultiByteToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: COpaquePointer?, multibytestring: Pcstr, bytesinmultibytestring: UInt)

public expect fun engMultiByteToWideChar(codepage: UInt, widecharstring: Pwstr, bytesinwidecharstring: Int, multibytestring: Pcstr, bytesinmultibytestring: Int): Int

public expect fun engPaint(pso: COpaquePointer?, pco: COpaquePointer?, pbo: COpaquePointer?, pptlbrushorg: COpaquePointer?, mix: UInt): Bool

public expect fun engPlgBlt(psotrg: COpaquePointer?, psosrc: COpaquePointer?, psomsk: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, pca: COpaquePointer?, pptlbrushorg: COpaquePointer?, pptfx: COpaquePointer?, prcl: COpaquePointer?, pptl: COpaquePointer?, imode: UInt): Bool

public expect fun engQueryEMFInfo(hdev: Hdev, pemfinfo: COpaquePointer?): Bool

public expect fun engQueryLocalTime(param0: COpaquePointer?)

public expect fun engReleaseSemaphore(hsem: Hsemaphore)

public expect fun engStretchBlt(psodest: COpaquePointer?, psosrc: COpaquePointer?, psomask: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, pca: COpaquePointer?, pptlhtorg: COpaquePointer?, prcldest: COpaquePointer?, prclsrc: COpaquePointer?, pptlmask: COpaquePointer?, imode: UInt): Bool

public expect fun engStretchBltROP(psodest: COpaquePointer?, psosrc: COpaquePointer?, psomask: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, pca: COpaquePointer?, pptlhtorg: COpaquePointer?, prcldest: COpaquePointer?, prclsrc: COpaquePointer?, pptlmask: COpaquePointer?, imode: UInt, pbo: COpaquePointer?, rop4: UInt): Bool

public expect fun engStrokeAndFillPath(pso: COpaquePointer?, ppo: COpaquePointer?, pco: COpaquePointer?, pxo: COpaquePointer?, pbostroke: COpaquePointer?, plineattrs: COpaquePointer?, pbofill: COpaquePointer?, pptlbrushorg: COpaquePointer?, mixfill: UInt, floptions: UInt): Bool

public expect fun engStrokePath(pso: COpaquePointer?, ppo: COpaquePointer?, pco: COpaquePointer?, pxo: COpaquePointer?, pbo: COpaquePointer?, pptlbrushorg: COpaquePointer?, plineattrs: COpaquePointer?, mix: UInt): Bool

public expect fun engTextOut(pso: COpaquePointer?, pstro: COpaquePointer?, pfo: COpaquePointer?, pco: COpaquePointer?, prclextra: COpaquePointer?, prclopaque: COpaquePointer?, pbofore: COpaquePointer?, pboopaque: COpaquePointer?, pptlorg: COpaquePointer?, mix: UInt): Bool

public expect fun engTransparentBlt(psodst: COpaquePointer?, psosrc: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, prcldst: COpaquePointer?, prclsrc: COpaquePointer?, transcolor: UInt, bcalledfrombitblt: UInt): Bool

public expect fun engUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: COpaquePointer?, unicodestring: Pcwstr, bytesinunicodestring: UInt)

public expect fun engUnlockSurface(pso: COpaquePointer?)

public expect fun engWideCharToMultiByte(codepage: UInt, widecharstring: Pcwstr, bytesinwidecharstring: Int, multibytestring: Pstr, bytesinmultibytestring: Int): Int

public expect fun fontobjCGetAllGlyphHandles(pfo: COpaquePointer?, phg: COpaquePointer?): UInt

public expect fun fontobjCGetGlyphs(pfo: COpaquePointer?, imode: UInt, cglyph: UInt, phg: COpaquePointer?, ppvglyph: COpaquePointer?): UInt

public expect fun fontobjPQueryGlyphAttrs(pfo: COpaquePointer?, imode: UInt): COpaquePointer?

public expect fun fontobjPfdg(pfo: COpaquePointer?): COpaquePointer?

public expect fun fontobjPifi(pfo: COpaquePointer?): COpaquePointer?

public expect fun fontobjPvTrueTypeFontFile(pfo: COpaquePointer?, pcjfile: COpaquePointer?): COpaquePointer?

public expect fun fontobjPxoGetXform(pfo: COpaquePointer?): COpaquePointer?

public expect fun fontobjVGetInfo(pfo: COpaquePointer?, cjsize: UInt, pfi: COpaquePointer?)

public expect fun getAutoRotationState(pstate: COpaquePointer?): Bool

public expect fun getCapabilitiesStringLength(hmonitor: Handle, pdwcapabilitiesstringlengthincharacters: COpaquePointer?): Int

public expect fun getDisplayAutoRotationPreferences(porientation: COpaquePointer?): Bool

public expect fun getDisplayConfigBufferSizes(flags: QueryDisplayConfigFlags, numpatharrayelements: COpaquePointer?, nummodeinfoarrayelements: COpaquePointer?): Win32Error

public expect fun getMonitorBrightness(hmonitor: Handle, pdwminimumbrightness: COpaquePointer?, pdwcurrentbrightness: COpaquePointer?, pdwmaximumbrightness: COpaquePointer?): Int

public expect fun getMonitorCapabilities(hmonitor: Handle, pdwmonitorcapabilities: COpaquePointer?, pdwsupportedcolortemperatures: COpaquePointer?): Int

public expect fun getMonitorColorTemperature(hmonitor: Handle, pctcurrentcolortemperature: COpaquePointer?): Int

public expect fun getMonitorContrast(hmonitor: Handle, pdwminimumcontrast: COpaquePointer?, pdwcurrentcontrast: COpaquePointer?, pdwmaximumcontrast: COpaquePointer?): Int

public expect fun getMonitorDisplayAreaPosition(hmonitor: Handle, ptpositiontype: McPositionType, pdwminimumposition: COpaquePointer?, pdwcurrentposition: COpaquePointer?, pdwmaximumposition: COpaquePointer?): Int

public expect fun getMonitorDisplayAreaSize(hmonitor: Handle, stsizetype: McSizeType, pdwminimumwidthorheight: COpaquePointer?, pdwcurrentwidthorheight: COpaquePointer?, pdwmaximumwidthorheight: COpaquePointer?): Int

public expect fun getMonitorRedGreenOrBlueDrive(hmonitor: Handle, dtdrivetype: McDriveType, pdwminimumdrive: COpaquePointer?, pdwcurrentdrive: COpaquePointer?, pdwmaximumdrive: COpaquePointer?): Int

public expect fun getMonitorRedGreenOrBlueGain(hmonitor: Handle, gtgaintype: McGainType, pdwminimumgain: COpaquePointer?, pdwcurrentgain: COpaquePointer?, pdwmaximumgain: COpaquePointer?): Int

public expect fun getMonitorTechnologyType(hmonitor: Handle, pdtydisplaytechnologytype: COpaquePointer?): Int

public expect fun getNumberOfPhysicalMonitorsFromHMONITOR(hmonitor: Hmonitor, pdwnumberofphysicalmonitors: COpaquePointer?): Bool

public expect fun getPhysicalMonitorsFromHMONITOR(hmonitor: Hmonitor, dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: COpaquePointer?): Bool

public expect fun getTimingReport(hmonitor: Handle, pmtrmonitortimingreport: COpaquePointer?): Int

public expect fun getVCPFeatureAndVCPFeatureReply(hmonitor: Handle, bvcpcode: UByte, pvct: COpaquePointer?, pdwcurrentvalue: COpaquePointer?, pdwmaximumvalue: COpaquePointer?): Int

public expect fun htGet8BppformatPalette(ppaletteentry: COpaquePointer?, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int

public expect fun htGet8BppmaskPalette(ppaletteentry: COpaquePointer?, use8bppmaskpal: Bool, cmymask: UByte, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int

public expect fun pathobjBEnum(ppo: COpaquePointer?, ppd: COpaquePointer?): Bool

public expect fun pathobjBEnumClipLines(ppo: COpaquePointer?, cb: UInt, pcl: COpaquePointer?): Bool

public expect fun pathobjVEnumStart(ppo: COpaquePointer?)

public expect fun pathobjVEnumStartClipLines(ppo: COpaquePointer?, pco: COpaquePointer?, pso: COpaquePointer?, pla: COpaquePointer?)

public expect fun pathobjVGetBounds(ppo: COpaquePointer?, prectfx: COpaquePointer?)

public expect fun queryDisplayConfig(flags: QueryDisplayConfigFlags, numpatharrayelements: COpaquePointer?, patharray: COpaquePointer?, nummodeinfoarrayelements: COpaquePointer?, modeinfoarray: COpaquePointer?, currenttopologyid: COpaquePointer?): Win32Error

public expect fun restoreMonitorFactoryColorDefaults(hmonitor: Handle): Int

public expect fun restoreMonitorFactoryDefaults(hmonitor: Handle): Int

public expect fun strobjBEnum(pstro: COpaquePointer?, pc: COpaquePointer?, ppgpos: COpaquePointer?): Bool

public expect fun strobjBEnumPositionsOnly(pstro: COpaquePointer?, pc: COpaquePointer?, ppgpos: COpaquePointer?): Bool

public expect fun strobjBGetAdvanceWidths(pso: COpaquePointer?, ifirst: UInt, c: UInt, pptqd: COpaquePointer?): Bool

public expect fun strobjDwGetCodePage(pstro: COpaquePointer?): UInt

public expect fun strobjVEnumStart(pstro: COpaquePointer?)

public expect fun saveCurrentMonitorSettings(hmonitor: Handle): Int

public expect fun saveCurrentSettings(hmonitor: Handle): Int

public expect fun setDisplayAutoRotationPreferences(orientation: OrientationPreference): Bool

public expect fun setDisplayConfig(numpatharrayelements: UInt, patharray: COpaquePointer?, nummodeinfoarrayelements: UInt, modeinfoarray: COpaquePointer?, flags: SetDisplayConfigFlags): Int

public expect fun setMonitorBrightness(hmonitor: Handle, dwnewbrightness: UInt): Int

public expect fun setMonitorColorTemperature(hmonitor: Handle, ctcurrentcolortemperature: McColorTemperature): Int

public expect fun setMonitorContrast(hmonitor: Handle, dwnewcontrast: UInt): Int

public expect fun setMonitorDisplayAreaPosition(hmonitor: Handle, ptpositiontype: McPositionType, dwnewposition: UInt): Int

public expect fun setMonitorDisplayAreaSize(hmonitor: Handle, stsizetype: McSizeType, dwnewdisplayareawidthorheight: UInt): Int

public expect fun setMonitorRedGreenOrBlueDrive(hmonitor: Handle, dtdrivetype: McDriveType, dwnewdrive: UInt): Int

public expect fun setMonitorRedGreenOrBlueGain(hmonitor: Handle, gtgaintype: McGainType, dwnewgain: UInt): Int

public expect fun setVCPFeature(hmonitor: Handle, bvcpcode: UByte, dwnewvalue: UInt): Int

public expect fun xformobjBApplyXform(pxo: COpaquePointer?, imode: UInt, cpoints: UInt, pvin: COpaquePointer?, pvout: COpaquePointer?): Bool

public expect fun xformobjIGetXform(pxo: COpaquePointer?, pxform: COpaquePointer?): UInt

public expect fun xlateobjCGetPalette(pxlo: COpaquePointer?, ipal: UInt, cpal: UInt, ppal: COpaquePointer?): UInt

public expect fun xlateobjHGetColorTransform(pxlo: COpaquePointer?): Handle

public expect fun xlateobjIXlate(pxlo: COpaquePointer?, icolor: UInt): UInt

public expect fun xlateobjPiVector(pxlo: COpaquePointer?): COpaquePointer?
