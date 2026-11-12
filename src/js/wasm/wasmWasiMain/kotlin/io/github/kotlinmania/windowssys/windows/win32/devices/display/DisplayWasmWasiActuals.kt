@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun brushobjHGetColorTransform(pbo: MutPtr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayBrushobjHGetColorTransform")

public actual fun brushobjPvAllocRbrush(pbo: MutPtr, cj: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayBrushobjPvAllocRbrush")

public actual fun brushobjPvGetRbrush(pbo: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayBrushobjPvGetRbrush")

public actual fun brushobjUlGetBrushColor(pbo: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayBrushobjUlGetBrushColor")

public actual fun clipobjBEnum(pco: MutPtr, cj: UInt, pul: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayClipobjBEnum")

public actual fun clipobjCEnumStart(pco: MutPtr, ball: Bool, itype: UInt, idirection: UInt, climit: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayClipobjCEnumStart")

public actual fun clipobjPpoGetPath(pco: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayClipobjPpoGetPath")

public actual fun capabilitiesRequestAndCapabilitiesReply(hmonitor: Handle, pszasciicapabilitiesstring: Pstr, dwcapabilitiesstringlengthincharacters: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayCapabilitiesRequestAndCapabilitiesReply")

public actual fun degaussMonitor(hmonitor: Handle): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayDegaussMonitor")

public actual fun destroyPhysicalMonitor(hmonitor: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayDestroyPhysicalMonitor")

public actual fun destroyPhysicalMonitors(dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayDestroyPhysicalMonitors")

public actual fun displayConfigGetDeviceInfo(requestpacket: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayDisplayConfigGetDeviceInfo")

public actual fun displayConfigSetDeviceInfo(setpacket: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayDisplayConfigSetDeviceInfo")

public actual fun engAcquireSemaphore(hsem: Hsemaphore): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngAcquireSemaphore")

public actual fun engAlphaBlend(psodest: MutPtr, psosrc: MutPtr, pco: MutPtr, pxlo: MutPtr, prcldest: MutPtr, prclsrc: MutPtr, pblendobj: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngAlphaBlend")

public actual fun engAssociateSurface(hsurf: Hsurf, hdev: Hdev, flhooks: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngAssociateSurface")

public actual fun engBitBlt(psotrg: ConstPtr, psosrc: ConstPtr, psomask: ConstPtr, pco: ConstPtr, pxlo: ConstPtr, prcltrg: ConstPtr, pptlsrc: ConstPtr, pptlmask: ConstPtr, pbo: ConstPtr, pptlbrush: ConstPtr, rop4: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngBitBlt")

public actual fun engCheckAbort(pso: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngCheckAbort")

public actual fun engComputeGlyphSet(ncodepage: Int, nfirstchar: Int, cchars: Int): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngComputeGlyphSet")

public actual fun engCopyBits(psodest: MutPtr, psosrc: MutPtr, pco: MutPtr, pxlo: MutPtr, prcldest: MutPtr, pptlsrc: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngCopyBits")

public actual fun engCreateBitmap(sizl: Size, lwidth: Int, iformat: UInt, fl: UInt, pvbits: MutPtr): Hbitmap =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngCreateBitmap")

public actual fun engCreateClip(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngCreateClip")

public actual fun engCreateDeviceBitmap(dhsurf: Dhsurf, sizl: Size, iformatcompat: UInt): Hbitmap =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngCreateDeviceBitmap")

public actual fun engCreateDeviceSurface(dhsurf: Dhsurf, sizl: Size, iformatcompat: UInt): Hsurf =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngCreateDeviceSurface")

public actual fun engCreatePalette(imode: UInt, ccolors: UInt, pulcolors: MutPtr, flred: UInt, flgreen: UInt, flblue: UInt): Hpalette =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngCreatePalette")

public actual fun engCreateSemaphore(): Hsemaphore =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngCreateSemaphore")

public actual fun engDeleteClip(pco: ConstPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngDeleteClip")

public actual fun engDeletePalette(hpal: Hpalette): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngDeletePalette")

public actual fun engDeletePath(ppo: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngDeletePath")

public actual fun engDeleteSemaphore(hsem: Hsemaphore): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngDeleteSemaphore")

public actual fun engDeleteSurface(hsurf: Hsurf): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngDeleteSurface")

public actual fun engEraseSurface(pso: MutPtr, prcl: MutPtr, icolor: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngEraseSurface")

public actual fun engFillPath(pso: MutPtr, ppo: MutPtr, pco: MutPtr, pbo: MutPtr, pptlbrushorg: MutPtr, mix: UInt, floptions: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngFillPath")

public actual fun engFindResource(h: Handle, iname: Int, itype: Int, pulsize: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngFindResource")

public actual fun engFreeModule(h: Handle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngFreeModule")

public actual fun engGetCurrentCodePage(oemcodepage: MutPtr, ansicodepage: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngGetCurrentCodePage")

public actual fun engGetDriverName(hdev: Hdev): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngGetDriverName")

public actual fun engGetPrinterDataFileName(hdev: Hdev): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngGetPrinterDataFileName")

public actual fun engGradientFill(psodest: MutPtr, pco: MutPtr, pxlo: MutPtr, pvertex: MutPtr, nvertex: UInt, pmesh: MutPtr, nmesh: UInt, prclextents: MutPtr, pptlditherorg: MutPtr, ulmode: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngGradientFill")

public actual fun engLineTo(pso: MutPtr, pco: MutPtr, pbo: MutPtr, x1: Int, y1: Int, x2: Int, y2: Int, prclbounds: MutPtr, mix: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngLineTo")

public actual fun engLoadModule(pwsz: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngLoadModule")

public actual fun engLockSurface(hsurf: Hsurf): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngLockSurface")

public actual fun engMarkBandingSurface(hsurf: Hsurf): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngMarkBandingSurface")

public actual fun engMultiByteToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: MutPtr, multibytestring: Pcstr, bytesinmultibytestring: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngMultiByteToUnicodeN")

public actual fun engMultiByteToWideChar(codepage: UInt, widecharstring: Pwstr, bytesinwidecharstring: Int, multibytestring: Pcstr, bytesinmultibytestring: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngMultiByteToWideChar")

public actual fun engPaint(pso: MutPtr, pco: MutPtr, pbo: MutPtr, pptlbrushorg: MutPtr, mix: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngPaint")

public actual fun engPlgBlt(psotrg: MutPtr, psosrc: MutPtr, psomsk: MutPtr, pco: MutPtr, pxlo: MutPtr, pca: MutPtr, pptlbrushorg: MutPtr, pptfx: MutPtr, prcl: MutPtr, pptl: MutPtr, imode: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngPlgBlt")

public actual fun engQueryEMFInfo(hdev: Hdev, pemfinfo: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngQueryEMFInfo")

public actual fun engQueryLocalTime(param0: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngQueryLocalTime")

public actual fun engReleaseSemaphore(hsem: Hsemaphore): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngReleaseSemaphore")

public actual fun engStretchBlt(psodest: MutPtr, psosrc: MutPtr, psomask: MutPtr, pco: MutPtr, pxlo: MutPtr, pca: MutPtr, pptlhtorg: MutPtr, prcldest: MutPtr, prclsrc: MutPtr, pptlmask: MutPtr, imode: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngStretchBlt")

public actual fun engStretchBltROP(psodest: MutPtr, psosrc: MutPtr, psomask: MutPtr, pco: MutPtr, pxlo: MutPtr, pca: MutPtr, pptlhtorg: MutPtr, prcldest: MutPtr, prclsrc: MutPtr, pptlmask: MutPtr, imode: UInt, pbo: MutPtr, rop4: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngStretchBltROP")

public actual fun engStrokeAndFillPath(pso: MutPtr, ppo: MutPtr, pco: MutPtr, pxo: MutPtr, pbostroke: MutPtr, plineattrs: MutPtr, pbofill: MutPtr, pptlbrushorg: MutPtr, mixfill: UInt, floptions: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngStrokeAndFillPath")

public actual fun engStrokePath(pso: MutPtr, ppo: MutPtr, pco: MutPtr, pxo: MutPtr, pbo: MutPtr, pptlbrushorg: MutPtr, plineattrs: MutPtr, mix: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngStrokePath")

public actual fun engTextOut(pso: MutPtr, pstro: MutPtr, pfo: MutPtr, pco: MutPtr, prclextra: MutPtr, prclopaque: MutPtr, pbofore: MutPtr, pboopaque: MutPtr, pptlorg: MutPtr, mix: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngTextOut")

public actual fun engTransparentBlt(psodst: ConstPtr, psosrc: ConstPtr, pco: ConstPtr, pxlo: ConstPtr, prcldst: ConstPtr, prclsrc: ConstPtr, transcolor: UInt, bcalledfrombitblt: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngTransparentBlt")

public actual fun engUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: MutPtr, unicodestring: Pcwstr, bytesinunicodestring: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngUnicodeToMultiByteN")

public actual fun engUnlockSurface(pso: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngUnlockSurface")

public actual fun engWideCharToMultiByte(codepage: UInt, widecharstring: Pcwstr, bytesinwidecharstring: Int, multibytestring: Pstr, bytesinmultibytestring: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngWideCharToMultiByte")

public actual fun fontobjCGetAllGlyphHandles(pfo: MutPtr, phg: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayFontobjCGetAllGlyphHandles")

public actual fun fontobjCGetGlyphs(pfo: MutPtr, imode: UInt, cglyph: UInt, phg: MutPtr, ppvglyph: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayFontobjCGetGlyphs")

public actual fun fontobjPQueryGlyphAttrs(pfo: MutPtr, imode: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayFontobjPQueryGlyphAttrs")

public actual fun fontobjPfdg(pfo: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayFontobjPfdg")

public actual fun fontobjPifi(pfo: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayFontobjPifi")

public actual fun fontobjPvTrueTypeFontFile(pfo: MutPtr, pcjfile: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayFontobjPvTrueTypeFontFile")

public actual fun fontobjPxoGetXform(pfo: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayFontobjPxoGetXform")

public actual fun fontobjVGetInfo(pfo: MutPtr, cjsize: UInt, pfi: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayFontobjVGetInfo")

public actual fun getAutoRotationState(pstate: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetAutoRotationState")

public actual fun getCapabilitiesStringLength(hmonitor: Handle, pdwcapabilitiesstringlengthincharacters: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetCapabilitiesStringLength")

public actual fun getDisplayAutoRotationPreferences(porientation: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetDisplayAutoRotationPreferences")

public actual fun getDisplayConfigBufferSizes(flags: QueryDisplayConfigFlags, numpatharrayelements: MutPtr, nummodeinfoarrayelements: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetDisplayConfigBufferSizes")

public actual fun getMonitorBrightness(hmonitor: Handle, pdwminimumbrightness: MutPtr, pdwcurrentbrightness: MutPtr, pdwmaximumbrightness: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetMonitorBrightness")

public actual fun getMonitorCapabilities(hmonitor: Handle, pdwmonitorcapabilities: MutPtr, pdwsupportedcolortemperatures: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetMonitorCapabilities")

public actual fun getMonitorColorTemperature(hmonitor: Handle, pctcurrentcolortemperature: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetMonitorColorTemperature")

public actual fun getMonitorContrast(hmonitor: Handle, pdwminimumcontrast: MutPtr, pdwcurrentcontrast: MutPtr, pdwmaximumcontrast: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetMonitorContrast")

public actual fun getMonitorDisplayAreaPosition(hmonitor: Handle, ptpositiontype: McPositionType, pdwminimumposition: MutPtr, pdwcurrentposition: MutPtr, pdwmaximumposition: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetMonitorDisplayAreaPosition")

public actual fun getMonitorDisplayAreaSize(hmonitor: Handle, stsizetype: McSizeType, pdwminimumwidthorheight: MutPtr, pdwcurrentwidthorheight: MutPtr, pdwmaximumwidthorheight: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetMonitorDisplayAreaSize")

public actual fun getMonitorRedGreenOrBlueDrive(hmonitor: Handle, dtdrivetype: McDriveType, pdwminimumdrive: MutPtr, pdwcurrentdrive: MutPtr, pdwmaximumdrive: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetMonitorRedGreenOrBlueDrive")

public actual fun getMonitorRedGreenOrBlueGain(hmonitor: Handle, gtgaintype: McGainType, pdwminimumgain: MutPtr, pdwcurrentgain: MutPtr, pdwmaximumgain: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetMonitorRedGreenOrBlueGain")

public actual fun getMonitorTechnologyType(hmonitor: Handle, pdtydisplaytechnologytype: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetMonitorTechnologyType")

public actual fun getNumberOfPhysicalMonitorsFromHMONITOR(hmonitor: Hmonitor, pdwnumberofphysicalmonitors: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetNumberOfPhysicalMonitorsFromHMONITOR")

public actual fun getPhysicalMonitorsFromHMONITOR(hmonitor: Hmonitor, dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetPhysicalMonitorsFromHMONITOR")

public actual fun getTimingReport(hmonitor: Handle, pmtrmonitortimingreport: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetTimingReport")

public actual fun getVCPFeatureAndVCPFeatureReply(hmonitor: Handle, bvcpcode: UByte, pvct: MutPtr, pdwcurrentvalue: MutPtr, pdwmaximumvalue: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetVCPFeatureAndVCPFeatureReply")

public actual fun htGet8BppformatPalette(ppaletteentry: MutPtr, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayHtGet8BppformatPalette")

public actual fun htGet8BppmaskPalette(ppaletteentry: MutPtr, use8bppmaskpal: Bool, cmymask: UByte, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayHtGet8BppmaskPalette")

public actual fun pathobjBEnum(ppo: MutPtr, ppd: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayPathobjBEnum")

public actual fun pathobjBEnumClipLines(ppo: MutPtr, cb: UInt, pcl: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayPathobjBEnumClipLines")

public actual fun pathobjVEnumStart(ppo: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayPathobjVEnumStart")

public actual fun pathobjVEnumStartClipLines(ppo: MutPtr, pco: MutPtr, pso: MutPtr, pla: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayPathobjVEnumStartClipLines")

public actual fun pathobjVGetBounds(ppo: MutPtr, prectfx: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayPathobjVGetBounds")

public actual fun queryDisplayConfig(flags: QueryDisplayConfigFlags, numpatharrayelements: MutPtr, patharray: MutPtr, nummodeinfoarrayelements: MutPtr, modeinfoarray: MutPtr, currenttopologyid: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayQueryDisplayConfig")

public actual fun restoreMonitorFactoryColorDefaults(hmonitor: Handle): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayRestoreMonitorFactoryColorDefaults")

public actual fun restoreMonitorFactoryDefaults(hmonitor: Handle): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayRestoreMonitorFactoryDefaults")

public actual fun strobjBEnum(pstro: MutPtr, pc: MutPtr, ppgpos: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayStrobjBEnum")

public actual fun strobjBEnumPositionsOnly(pstro: MutPtr, pc: MutPtr, ppgpos: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayStrobjBEnumPositionsOnly")

public actual fun strobjBGetAdvanceWidths(pso: MutPtr, ifirst: UInt, c: UInt, pptqd: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayStrobjBGetAdvanceWidths")

public actual fun strobjDwGetCodePage(pstro: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayStrobjDwGetCodePage")

public actual fun strobjVEnumStart(pstro: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayStrobjVEnumStart")

public actual fun saveCurrentMonitorSettings(hmonitor: Handle): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplaySaveCurrentMonitorSettings")

public actual fun saveCurrentSettings(hmonitor: Handle): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplaySaveCurrentSettings")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDisplaySetDisplayAutoRotationPreferences")
private external fun wasiWindowssysWindowsWin32DevicesDisplaySetDisplayAutoRotationPreferences(orientation: Int): Int

public actual fun setDisplayAutoRotationPreferences(orientation: OrientationPreference): Bool =
    wasiWindowssysWindowsWin32DevicesDisplaySetDisplayAutoRotationPreferences(orientation)

public actual fun setDisplayConfig(numpatharrayelements: UInt, patharray: ConstPtr, nummodeinfoarrayelements: UInt, modeinfoarray: ConstPtr, flags: SetDisplayConfigFlags): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplaySetDisplayConfig")

public actual fun setMonitorBrightness(hmonitor: Handle, dwnewbrightness: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplaySetMonitorBrightness")

public actual fun setMonitorColorTemperature(hmonitor: Handle, ctcurrentcolortemperature: McColorTemperature): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplaySetMonitorColorTemperature")

public actual fun setMonitorContrast(hmonitor: Handle, dwnewcontrast: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplaySetMonitorContrast")

public actual fun setMonitorDisplayAreaPosition(hmonitor: Handle, ptpositiontype: McPositionType, dwnewposition: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplaySetMonitorDisplayAreaPosition")

public actual fun setMonitorDisplayAreaSize(hmonitor: Handle, stsizetype: McSizeType, dwnewdisplayareawidthorheight: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplaySetMonitorDisplayAreaSize")

public actual fun setMonitorRedGreenOrBlueDrive(hmonitor: Handle, dtdrivetype: McDriveType, dwnewdrive: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplaySetMonitorRedGreenOrBlueDrive")

public actual fun setMonitorRedGreenOrBlueGain(hmonitor: Handle, gtgaintype: McGainType, dwnewgain: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplaySetMonitorRedGreenOrBlueGain")

public actual fun setVCPFeature(hmonitor: Handle, bvcpcode: UByte, dwnewvalue: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplaySetVCPFeature")

public actual fun xformobjBApplyXform(pxo: MutPtr, imode: UInt, cpoints: UInt, pvin: MutPtr, pvout: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayXformobjBApplyXform")

public actual fun xformobjIGetXform(pxo: ConstPtr, pxform: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayXformobjIGetXform")

public actual fun xlateobjCGetPalette(pxlo: MutPtr, ipal: UInt, cpal: UInt, ppal: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayXlateobjCGetPalette")

public actual fun xlateobjHGetColorTransform(pxlo: MutPtr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayXlateobjHGetColorTransform")

public actual fun xlateobjIXlate(pxlo: MutPtr, icolor: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayXlateobjIXlate")

public actual fun xlateobjPiVector(pxlo: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayXlateobjPiVector")
