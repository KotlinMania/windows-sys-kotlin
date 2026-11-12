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

public expect fun brushobjHGetColorTransform(pbo: MutPtr<Brushobj>): Handle

public expect fun brushobjPvAllocRbrush(pbo: MutPtr<Brushobj>, cj: UInt): MutPtr<CVoid>

public expect fun brushobjPvGetRbrush(pbo: MutPtr<Brushobj>): MutPtr<CVoid>

public expect fun brushobjUlGetBrushColor(pbo: MutPtr<Brushobj>): UInt

public expect fun clipobjBEnum(pco: MutPtr<Clipobj>, cj: UInt, pul: MutPtr<UInt>): Bool

public expect fun clipobjCEnumStart(pco: MutPtr<Clipobj>, ball: Bool, itype: UInt, idirection: UInt, climit: UInt): UInt

public expect fun clipobjPpoGetPath(pco: MutPtr<Clipobj>): MutPtr<Pathobj>

public expect fun capabilitiesRequestAndCapabilitiesReply(hmonitor: Handle, pszasciicapabilitiesstring: Pstr, dwcapabilitiesstringlengthincharacters: UInt): Int

public expect fun degaussMonitor(hmonitor: Handle): Int

public expect fun destroyPhysicalMonitor(hmonitor: Handle): Bool

public expect fun destroyPhysicalMonitors(dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: ConstPtr<PhysicalMonitor>): Bool

public expect fun displayConfigGetDeviceInfo(requestpacket: MutPtr<DisplayconfigDeviceInfoHeader>): Int

public expect fun displayConfigSetDeviceInfo(setpacket: ConstPtr<DisplayconfigDeviceInfoHeader>): Int

public expect fun engAcquireSemaphore(hsem: Hsemaphore)

public expect fun engAlphaBlend(psodest: MutPtr<Surfobj>, psosrc: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pxlo: MutPtr<Xlateobj>, prcldest: MutPtr<Rectl>, prclsrc: MutPtr<Rectl>, pblendobj: MutPtr<Blendobj>): Bool

public expect fun engAssociateSurface(hsurf: Hsurf, hdev: Hdev, flhooks: UInt): Bool

public expect fun engBitBlt(psotrg: ConstPtr<Surfobj>, psosrc: ConstPtr<Surfobj>, psomask: ConstPtr<Surfobj>, pco: ConstPtr<Clipobj>, pxlo: ConstPtr<Xlateobj>, prcltrg: ConstPtr<Rectl>, pptlsrc: ConstPtr<Pointl>, pptlmask: ConstPtr<Pointl>, pbo: ConstPtr<Brushobj>, pptlbrush: ConstPtr<Pointl>, rop4: UInt): Bool

public expect fun engCheckAbort(pso: MutPtr<Surfobj>): Bool

public expect fun engComputeGlyphSet(ncodepage: Int, nfirstchar: Int, cchars: Int): MutPtr<FdGlyphset>

public expect fun engCopyBits(psodest: MutPtr<Surfobj>, psosrc: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pxlo: MutPtr<Xlateobj>, prcldest: MutPtr<Rectl>, pptlsrc: MutPtr<Pointl>): Bool

public expect fun engCreateBitmap(sizl: Size, lwidth: Int, iformat: UInt, fl: UInt, pvbits: MutPtr<CVoid>): Hbitmap

public expect fun engCreateClip(): MutPtr<Clipobj>

public expect fun engCreateDeviceBitmap(dhsurf: Dhsurf, sizl: Size, iformatcompat: UInt): Hbitmap

public expect fun engCreateDeviceSurface(dhsurf: Dhsurf, sizl: Size, iformatcompat: UInt): Hsurf

public expect fun engCreatePalette(imode: UInt, ccolors: UInt, pulcolors: MutPtr<UInt>, flred: UInt, flgreen: UInt, flblue: UInt): Hpalette

public expect fun engCreateSemaphore(): Hsemaphore

public expect fun engDeleteClip(pco: ConstPtr<Clipobj>)

public expect fun engDeletePalette(hpal: Hpalette): Bool

public expect fun engDeletePath(ppo: MutPtr<Pathobj>)

public expect fun engDeleteSemaphore(hsem: Hsemaphore)

public expect fun engDeleteSurface(hsurf: Hsurf): Bool

public expect fun engEraseSurface(pso: MutPtr<Surfobj>, prcl: MutPtr<Rectl>, icolor: UInt): Bool

public expect fun engFillPath(pso: MutPtr<Surfobj>, ppo: MutPtr<Pathobj>, pco: MutPtr<Clipobj>, pbo: MutPtr<Brushobj>, pptlbrushorg: MutPtr<Pointl>, mix: UInt, floptions: UInt): Bool

public expect fun engFindResource(h: Handle, iname: Int, itype: Int, pulsize: MutPtr<UInt>): MutPtr<CVoid>

public expect fun engFreeModule(h: Handle)

public expect fun engGetCurrentCodePage(oemcodepage: MutPtr<UShort>, ansicodepage: MutPtr<UShort>)

public expect fun engGetDriverName(hdev: Hdev): Pwstr

public expect fun engGetPrinterDataFileName(hdev: Hdev): Pwstr

public expect fun engGradientFill(psodest: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pxlo: MutPtr<Xlateobj>, pvertex: MutPtr<Trivertex>, nvertex: UInt, pmesh: MutPtr<CVoid>, nmesh: UInt, prclextents: MutPtr<Rectl>, pptlditherorg: MutPtr<Pointl>, ulmode: UInt): Bool

public expect fun engLineTo(pso: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pbo: MutPtr<Brushobj>, x1: Int, y1: Int, x2: Int, y2: Int, prclbounds: MutPtr<Rectl>, mix: UInt): Bool

public expect fun engLoadModule(pwsz: Pcwstr): Handle

public expect fun engLockSurface(hsurf: Hsurf): MutPtr<Surfobj>

public expect fun engMarkBandingSurface(hsurf: Hsurf): Bool

public expect fun engMultiByteToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: MutPtr<UInt>, multibytestring: Pcstr, bytesinmultibytestring: UInt)

public expect fun engMultiByteToWideChar(codepage: UInt, widecharstring: Pwstr, bytesinwidecharstring: Int, multibytestring: Pcstr, bytesinmultibytestring: Int): Int

public expect fun engPaint(pso: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pbo: MutPtr<Brushobj>, pptlbrushorg: MutPtr<Pointl>, mix: UInt): Bool

public expect fun engPlgBlt(psotrg: MutPtr<Surfobj>, psosrc: MutPtr<Surfobj>, psomsk: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pxlo: MutPtr<Xlateobj>, pca: MutPtr<Coloradjustment>, pptlbrushorg: MutPtr<Pointl>, pptfx: MutPtr<Pointfix>, prcl: MutPtr<Rectl>, pptl: MutPtr<Pointl>, imode: UInt): Bool

public expect fun engQueryEMFInfo(hdev: Hdev, pemfinfo: MutPtr<Emfinfo>): Bool

public expect fun engQueryLocalTime(param0: MutPtr<EngTimeFields>)

public expect fun engReleaseSemaphore(hsem: Hsemaphore)

public expect fun engStretchBlt(psodest: MutPtr<Surfobj>, psosrc: MutPtr<Surfobj>, psomask: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pxlo: MutPtr<Xlateobj>, pca: MutPtr<Coloradjustment>, pptlhtorg: MutPtr<Pointl>, prcldest: MutPtr<Rectl>, prclsrc: MutPtr<Rectl>, pptlmask: MutPtr<Pointl>, imode: UInt): Bool

public expect fun engStretchBltROP(psodest: MutPtr<Surfobj>, psosrc: MutPtr<Surfobj>, psomask: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pxlo: MutPtr<Xlateobj>, pca: MutPtr<Coloradjustment>, pptlhtorg: MutPtr<Pointl>, prcldest: MutPtr<Rectl>, prclsrc: MutPtr<Rectl>, pptlmask: MutPtr<Pointl>, imode: UInt, pbo: MutPtr<Brushobj>, rop4: UInt): Bool

public expect fun engStrokeAndFillPath(pso: MutPtr<Surfobj>, ppo: MutPtr<Pathobj>, pco: MutPtr<Clipobj>, pxo: MutPtr<Xformobj>, pbostroke: MutPtr<Brushobj>, plineattrs: MutPtr<Lineattrs>, pbofill: MutPtr<Brushobj>, pptlbrushorg: MutPtr<Pointl>, mixfill: UInt, floptions: UInt): Bool

public expect fun engStrokePath(pso: MutPtr<Surfobj>, ppo: MutPtr<Pathobj>, pco: MutPtr<Clipobj>, pxo: MutPtr<Xformobj>, pbo: MutPtr<Brushobj>, pptlbrushorg: MutPtr<Pointl>, plineattrs: MutPtr<Lineattrs>, mix: UInt): Bool

public expect fun engTextOut(pso: MutPtr<Surfobj>, pstro: MutPtr<Strobj>, pfo: MutPtr<Fontobj>, pco: MutPtr<Clipobj>, prclextra: MutPtr<Rectl>, prclopaque: MutPtr<Rectl>, pbofore: MutPtr<Brushobj>, pboopaque: MutPtr<Brushobj>, pptlorg: MutPtr<Pointl>, mix: UInt): Bool

public expect fun engTransparentBlt(psodst: ConstPtr<Surfobj>, psosrc: ConstPtr<Surfobj>, pco: ConstPtr<Clipobj>, pxlo: ConstPtr<Xlateobj>, prcldst: ConstPtr<Rectl>, prclsrc: ConstPtr<Rectl>, transcolor: UInt, bcalledfrombitblt: UInt): Bool

public expect fun engUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: MutPtr<UInt>, unicodestring: Pcwstr, bytesinunicodestring: UInt)

public expect fun engUnlockSurface(pso: MutPtr<Surfobj>)

public expect fun engWideCharToMultiByte(codepage: UInt, widecharstring: Pcwstr, bytesinwidecharstring: Int, multibytestring: Pstr, bytesinmultibytestring: Int): Int

public expect fun fontobjCGetAllGlyphHandles(pfo: MutPtr<Fontobj>, phg: MutPtr<UInt>): UInt

public expect fun fontobjCGetGlyphs(pfo: MutPtr<Fontobj>, imode: UInt, cglyph: UInt, phg: MutPtr<UInt>, ppvglyph: MutPtr<MutPtr<CVoid>>): UInt

public expect fun fontobjPQueryGlyphAttrs(pfo: MutPtr<Fontobj>, imode: UInt): MutPtr<FdGlyphattr>

public expect fun fontobjPfdg(pfo: MutPtr<Fontobj>): MutPtr<FdGlyphset>

public expect fun fontobjPifi(pfo: ConstPtr<Fontobj>): MutPtr<Ifimetrics>

public expect fun fontobjPvTrueTypeFontFile(pfo: MutPtr<Fontobj>, pcjfile: MutPtr<UInt>): MutPtr<CVoid>

public expect fun fontobjPxoGetXform(pfo: ConstPtr<Fontobj>): MutPtr<Xformobj>

public expect fun fontobjVGetInfo(pfo: MutPtr<Fontobj>, cjsize: UInt, pfi: MutPtr<Fontinfo>)

public expect fun getAutoRotationState(pstate: MutPtr<ArState>): Bool

public expect fun getCapabilitiesStringLength(hmonitor: Handle, pdwcapabilitiesstringlengthincharacters: MutPtr<UInt>): Int

public expect fun getDisplayAutoRotationPreferences(porientation: MutPtr<OrientationPreference>): Bool

public expect fun getDisplayConfigBufferSizes(flags: QueryDisplayConfigFlags, numpatharrayelements: MutPtr<UInt>, nummodeinfoarrayelements: MutPtr<UInt>): Win32Error

public expect fun getMonitorBrightness(hmonitor: Handle, pdwminimumbrightness: MutPtr<UInt>, pdwcurrentbrightness: MutPtr<UInt>, pdwmaximumbrightness: MutPtr<UInt>): Int

public expect fun getMonitorCapabilities(hmonitor: Handle, pdwmonitorcapabilities: MutPtr<UInt>, pdwsupportedcolortemperatures: MutPtr<UInt>): Int

public expect fun getMonitorColorTemperature(hmonitor: Handle, pctcurrentcolortemperature: MutPtr<McColorTemperature>): Int

public expect fun getMonitorContrast(hmonitor: Handle, pdwminimumcontrast: MutPtr<UInt>, pdwcurrentcontrast: MutPtr<UInt>, pdwmaximumcontrast: MutPtr<UInt>): Int

public expect fun getMonitorDisplayAreaPosition(hmonitor: Handle, ptpositiontype: McPositionType, pdwminimumposition: MutPtr<UInt>, pdwcurrentposition: MutPtr<UInt>, pdwmaximumposition: MutPtr<UInt>): Int

public expect fun getMonitorDisplayAreaSize(hmonitor: Handle, stsizetype: McSizeType, pdwminimumwidthorheight: MutPtr<UInt>, pdwcurrentwidthorheight: MutPtr<UInt>, pdwmaximumwidthorheight: MutPtr<UInt>): Int

public expect fun getMonitorRedGreenOrBlueDrive(hmonitor: Handle, dtdrivetype: McDriveType, pdwminimumdrive: MutPtr<UInt>, pdwcurrentdrive: MutPtr<UInt>, pdwmaximumdrive: MutPtr<UInt>): Int

public expect fun getMonitorRedGreenOrBlueGain(hmonitor: Handle, gtgaintype: McGainType, pdwminimumgain: MutPtr<UInt>, pdwcurrentgain: MutPtr<UInt>, pdwmaximumgain: MutPtr<UInt>): Int

public expect fun getMonitorTechnologyType(hmonitor: Handle, pdtydisplaytechnologytype: MutPtr<McDisplayTechnologyType>): Int

public expect fun getNumberOfPhysicalMonitorsFromHMONITOR(hmonitor: Hmonitor, pdwnumberofphysicalmonitors: MutPtr<UInt>): Bool

public expect fun getPhysicalMonitorsFromHMONITOR(hmonitor: Hmonitor, dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: MutPtr<PhysicalMonitor>): Bool

public expect fun getTimingReport(hmonitor: Handle, pmtrmonitortimingreport: MutPtr<McTimingReport>): Int

public expect fun getVCPFeatureAndVCPFeatureReply(hmonitor: Handle, bvcpcode: UByte, pvct: MutPtr<McVcpCodeType>, pdwcurrentvalue: MutPtr<UInt>, pdwmaximumvalue: MutPtr<UInt>): Int

public expect fun htGet8BppformatPalette(ppaletteentry: MutPtr<Paletteentry>, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int

public expect fun htGet8BppmaskPalette(ppaletteentry: MutPtr<Paletteentry>, use8bppmaskpal: Bool, cmymask: UByte, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int

public expect fun pathobjBEnum(ppo: MutPtr<Pathobj>, ppd: MutPtr<Pathdata>): Bool

public expect fun pathobjBEnumClipLines(ppo: MutPtr<Pathobj>, cb: UInt, pcl: MutPtr<Clipline>): Bool

public expect fun pathobjVEnumStart(ppo: MutPtr<Pathobj>)

public expect fun pathobjVEnumStartClipLines(ppo: MutPtr<Pathobj>, pco: MutPtr<Clipobj>, pso: MutPtr<Surfobj>, pla: MutPtr<Lineattrs>)

public expect fun pathobjVGetBounds(ppo: MutPtr<Pathobj>, prectfx: MutPtr<Rectfx>)

public expect fun queryDisplayConfig(flags: QueryDisplayConfigFlags, numpatharrayelements: MutPtr<UInt>, patharray: MutPtr<DisplayconfigPathInfo>, nummodeinfoarrayelements: MutPtr<UInt>, modeinfoarray: MutPtr<DisplayconfigModeInfo>, currenttopologyid: MutPtr<DisplayconfigTopologyId>): Win32Error

public expect fun restoreMonitorFactoryColorDefaults(hmonitor: Handle): Int

public expect fun restoreMonitorFactoryDefaults(hmonitor: Handle): Int

public expect fun strobjBEnum(pstro: MutPtr<Strobj>, pc: MutPtr<UInt>, ppgpos: MutPtr<MutPtr<Glyphpos>>): Bool

public expect fun strobjBEnumPositionsOnly(pstro: MutPtr<Strobj>, pc: MutPtr<UInt>, ppgpos: MutPtr<MutPtr<Glyphpos>>): Bool

public expect fun strobjBGetAdvanceWidths(pso: MutPtr<Strobj>, ifirst: UInt, c: UInt, pptqd: MutPtr<Pointqf>): Bool

public expect fun strobjDwGetCodePage(pstro: MutPtr<Strobj>): UInt

public expect fun strobjVEnumStart(pstro: MutPtr<Strobj>)

public expect fun saveCurrentMonitorSettings(hmonitor: Handle): Int

public expect fun saveCurrentSettings(hmonitor: Handle): Int

public expect fun setDisplayAutoRotationPreferences(orientation: OrientationPreference): Bool

public expect fun setDisplayConfig(numpatharrayelements: UInt, patharray: ConstPtr<DisplayconfigPathInfo>, nummodeinfoarrayelements: UInt, modeinfoarray: ConstPtr<DisplayconfigModeInfo>, flags: SetDisplayConfigFlags): Int

public expect fun setMonitorBrightness(hmonitor: Handle, dwnewbrightness: UInt): Int

public expect fun setMonitorColorTemperature(hmonitor: Handle, ctcurrentcolortemperature: McColorTemperature): Int

public expect fun setMonitorContrast(hmonitor: Handle, dwnewcontrast: UInt): Int

public expect fun setMonitorDisplayAreaPosition(hmonitor: Handle, ptpositiontype: McPositionType, dwnewposition: UInt): Int

public expect fun setMonitorDisplayAreaSize(hmonitor: Handle, stsizetype: McSizeType, dwnewdisplayareawidthorheight: UInt): Int

public expect fun setMonitorRedGreenOrBlueDrive(hmonitor: Handle, dtdrivetype: McDriveType, dwnewdrive: UInt): Int

public expect fun setMonitorRedGreenOrBlueGain(hmonitor: Handle, gtgaintype: McGainType, dwnewgain: UInt): Int

public expect fun setVCPFeature(hmonitor: Handle, bvcpcode: UByte, dwnewvalue: UInt): Int

public expect fun xformobjBApplyXform(pxo: MutPtr<Xformobj>, imode: UInt, cpoints: UInt, pvin: MutPtr<CVoid>, pvout: MutPtr<CVoid>): Bool

public expect fun xformobjIGetXform(pxo: ConstPtr<Xformobj>, pxform: MutPtr<Xforml>): UInt

public expect fun xlateobjCGetPalette(pxlo: MutPtr<Xlateobj>, ipal: UInt, cpal: UInt, ppal: MutPtr<UInt>): UInt

public expect fun xlateobjHGetColorTransform(pxlo: MutPtr<Xlateobj>): Handle

public expect fun xlateobjIXlate(pxlo: MutPtr<Xlateobj>, icolor: UInt): UInt

public expect fun xlateobjPiVector(pxlo: MutPtr<Xlateobj>): MutPtr<UInt>
