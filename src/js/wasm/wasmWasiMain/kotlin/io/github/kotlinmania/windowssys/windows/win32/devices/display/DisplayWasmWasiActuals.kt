@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun brushobjHGetColorTransform(pbo: MutPtr<Brushobj>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayBrushobjHGetColorTransform")

public actual fun brushobjPvAllocRbrush(pbo: MutPtr<Brushobj>, cj: UInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayBrushobjPvAllocRbrush")

public actual fun brushobjPvGetRbrush(pbo: MutPtr<Brushobj>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayBrushobjPvGetRbrush")

public actual fun brushobjUlGetBrushColor(pbo: MutPtr<Brushobj>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayBrushobjUlGetBrushColor")

public actual fun clipobjBEnum(pco: MutPtr<Clipobj>, cj: UInt, pul: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayClipobjBEnum")

public actual fun clipobjCEnumStart(pco: MutPtr<Clipobj>, ball: Bool, itype: UInt, idirection: UInt, climit: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayClipobjCEnumStart")

public actual fun clipobjPpoGetPath(pco: MutPtr<Clipobj>): MutPtr<Pathobj> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayClipobjPpoGetPath")

public actual fun capabilitiesRequestAndCapabilitiesReply(hmonitor: Handle, pszasciicapabilitiesstring: Pstr, dwcapabilitiesstringlengthincharacters: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayCapabilitiesRequestAndCapabilitiesReply")

public actual fun degaussMonitor(hmonitor: Handle): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayDegaussMonitor")

public actual fun destroyPhysicalMonitor(hmonitor: Handle): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayDestroyPhysicalMonitor")

public actual fun destroyPhysicalMonitors(dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: ConstPtr<PhysicalMonitor>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayDestroyPhysicalMonitors")

public actual fun displayConfigGetDeviceInfo(requestpacket: MutPtr<DisplayconfigDeviceInfoHeader>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayDisplayConfigGetDeviceInfo")

public actual fun displayConfigSetDeviceInfo(setpacket: ConstPtr<DisplayconfigDeviceInfoHeader>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayDisplayConfigSetDeviceInfo")

public actual fun engAcquireSemaphore(hsem: Hsemaphore): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngAcquireSemaphore")

public actual fun engAlphaBlend(psodest: MutPtr<Surfobj>, psosrc: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pxlo: MutPtr<Xlateobj>, prcldest: MutPtr<Rectl>, prclsrc: MutPtr<Rectl>, pblendobj: MutPtr<Blendobj>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngAlphaBlend")

public actual fun engAssociateSurface(hsurf: Hsurf, hdev: Hdev, flhooks: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngAssociateSurface")

public actual fun engBitBlt(psotrg: ConstPtr<Surfobj>, psosrc: ConstPtr<Surfobj>, psomask: ConstPtr<Surfobj>, pco: ConstPtr<Clipobj>, pxlo: ConstPtr<Xlateobj>, prcltrg: ConstPtr<Rectl>, pptlsrc: ConstPtr<Pointl>, pptlmask: ConstPtr<Pointl>, pbo: ConstPtr<Brushobj>, pptlbrush: ConstPtr<Pointl>, rop4: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngBitBlt")

public actual fun engCheckAbort(pso: MutPtr<Surfobj>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngCheckAbort")

public actual fun engComputeGlyphSet(ncodepage: Int, nfirstchar: Int, cchars: Int): MutPtr<FdGlyphset> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngComputeGlyphSet")

public actual fun engCopyBits(psodest: MutPtr<Surfobj>, psosrc: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pxlo: MutPtr<Xlateobj>, prcldest: MutPtr<Rectl>, pptlsrc: MutPtr<Pointl>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngCopyBits")

public actual fun engCreateBitmap(sizl: Size, lwidth: Int, iformat: UInt, fl: UInt, pvbits: MutPtr<CVoid>): Hbitmap =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngCreateBitmap")

public actual fun engCreateClip(): MutPtr<Clipobj> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngCreateClip")

public actual fun engCreateDeviceBitmap(dhsurf: Dhsurf, sizl: Size, iformatcompat: UInt): Hbitmap =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngCreateDeviceBitmap")

public actual fun engCreateDeviceSurface(dhsurf: Dhsurf, sizl: Size, iformatcompat: UInt): Hsurf =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngCreateDeviceSurface")

public actual fun engCreatePalette(imode: UInt, ccolors: UInt, pulcolors: MutPtr<UInt>, flred: UInt, flgreen: UInt, flblue: UInt): Hpalette =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngCreatePalette")

public actual fun engCreateSemaphore(): Hsemaphore =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngCreateSemaphore")

public actual fun engDeleteClip(pco: ConstPtr<Clipobj>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngDeleteClip")

public actual fun engDeletePalette(hpal: Hpalette): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngDeletePalette")

public actual fun engDeletePath(ppo: MutPtr<Pathobj>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngDeletePath")

public actual fun engDeleteSemaphore(hsem: Hsemaphore): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngDeleteSemaphore")

public actual fun engDeleteSurface(hsurf: Hsurf): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngDeleteSurface")

public actual fun engEraseSurface(pso: MutPtr<Surfobj>, prcl: MutPtr<Rectl>, icolor: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngEraseSurface")

public actual fun engFillPath(pso: MutPtr<Surfobj>, ppo: MutPtr<Pathobj>, pco: MutPtr<Clipobj>, pbo: MutPtr<Brushobj>, pptlbrushorg: MutPtr<Pointl>, mix: UInt, floptions: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngFillPath")

public actual fun engFindResource(h: Handle, iname: Int, itype: Int, pulsize: MutPtr<UInt>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngFindResource")

public actual fun engFreeModule(h: Handle): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngFreeModule")

public actual fun engGetCurrentCodePage(oemcodepage: MutPtr<UShort>, ansicodepage: MutPtr<UShort>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngGetCurrentCodePage")

public actual fun engGetDriverName(hdev: Hdev): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngGetDriverName")

public actual fun engGetPrinterDataFileName(hdev: Hdev): Pwstr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngGetPrinterDataFileName")

public actual fun engGradientFill(psodest: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pxlo: MutPtr<Xlateobj>, pvertex: MutPtr<Trivertex>, nvertex: UInt, pmesh: MutPtr<CVoid>, nmesh: UInt, prclextents: MutPtr<Rectl>, pptlditherorg: MutPtr<Pointl>, ulmode: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngGradientFill")

public actual fun engLineTo(pso: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pbo: MutPtr<Brushobj>, x1: Int, y1: Int, x2: Int, y2: Int, prclbounds: MutPtr<Rectl>, mix: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngLineTo")

public actual fun engLoadModule(pwsz: Pcwstr): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngLoadModule")

public actual fun engLockSurface(hsurf: Hsurf): MutPtr<Surfobj> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngLockSurface")

public actual fun engMarkBandingSurface(hsurf: Hsurf): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngMarkBandingSurface")

public actual fun engMultiByteToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: MutPtr<UInt>, multibytestring: Pcstr, bytesinmultibytestring: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngMultiByteToUnicodeN")

public actual fun engMultiByteToWideChar(codepage: UInt, widecharstring: Pwstr, bytesinwidecharstring: Int, multibytestring: Pcstr, bytesinmultibytestring: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngMultiByteToWideChar")

public actual fun engPaint(pso: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pbo: MutPtr<Brushobj>, pptlbrushorg: MutPtr<Pointl>, mix: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngPaint")

public actual fun engPlgBlt(psotrg: MutPtr<Surfobj>, psosrc: MutPtr<Surfobj>, psomsk: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pxlo: MutPtr<Xlateobj>, pca: MutPtr<Coloradjustment>, pptlbrushorg: MutPtr<Pointl>, pptfx: MutPtr<Pointfix>, prcl: MutPtr<Rectl>, pptl: MutPtr<Pointl>, imode: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngPlgBlt")

public actual fun engQueryEMFInfo(hdev: Hdev, pemfinfo: MutPtr<Emfinfo>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngQueryEMFInfo")

public actual fun engQueryLocalTime(param0: MutPtr<EngTimeFields>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngQueryLocalTime")

public actual fun engReleaseSemaphore(hsem: Hsemaphore): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngReleaseSemaphore")

public actual fun engStretchBlt(psodest: MutPtr<Surfobj>, psosrc: MutPtr<Surfobj>, psomask: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pxlo: MutPtr<Xlateobj>, pca: MutPtr<Coloradjustment>, pptlhtorg: MutPtr<Pointl>, prcldest: MutPtr<Rectl>, prclsrc: MutPtr<Rectl>, pptlmask: MutPtr<Pointl>, imode: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngStretchBlt")

public actual fun engStretchBltROP(psodest: MutPtr<Surfobj>, psosrc: MutPtr<Surfobj>, psomask: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pxlo: MutPtr<Xlateobj>, pca: MutPtr<Coloradjustment>, pptlhtorg: MutPtr<Pointl>, prcldest: MutPtr<Rectl>, prclsrc: MutPtr<Rectl>, pptlmask: MutPtr<Pointl>, imode: UInt, pbo: MutPtr<Brushobj>, rop4: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngStretchBltROP")

public actual fun engStrokeAndFillPath(pso: MutPtr<Surfobj>, ppo: MutPtr<Pathobj>, pco: MutPtr<Clipobj>, pxo: MutPtr<Xformobj>, pbostroke: MutPtr<Brushobj>, plineattrs: MutPtr<Lineattrs>, pbofill: MutPtr<Brushobj>, pptlbrushorg: MutPtr<Pointl>, mixfill: UInt, floptions: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngStrokeAndFillPath")

public actual fun engStrokePath(pso: MutPtr<Surfobj>, ppo: MutPtr<Pathobj>, pco: MutPtr<Clipobj>, pxo: MutPtr<Xformobj>, pbo: MutPtr<Brushobj>, pptlbrushorg: MutPtr<Pointl>, plineattrs: MutPtr<Lineattrs>, mix: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngStrokePath")

public actual fun engTextOut(pso: MutPtr<Surfobj>, pstro: MutPtr<Strobj>, pfo: MutPtr<Fontobj>, pco: MutPtr<Clipobj>, prclextra: MutPtr<Rectl>, prclopaque: MutPtr<Rectl>, pbofore: MutPtr<Brushobj>, pboopaque: MutPtr<Brushobj>, pptlorg: MutPtr<Pointl>, mix: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngTextOut")

public actual fun engTransparentBlt(psodst: ConstPtr<Surfobj>, psosrc: ConstPtr<Surfobj>, pco: ConstPtr<Clipobj>, pxlo: ConstPtr<Xlateobj>, prcldst: ConstPtr<Rectl>, prclsrc: ConstPtr<Rectl>, transcolor: UInt, bcalledfrombitblt: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngTransparentBlt")

public actual fun engUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: MutPtr<UInt>, unicodestring: Pcwstr, bytesinunicodestring: UInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngUnicodeToMultiByteN")

public actual fun engUnlockSurface(pso: MutPtr<Surfobj>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngUnlockSurface")

public actual fun engWideCharToMultiByte(codepage: UInt, widecharstring: Pcwstr, bytesinwidecharstring: Int, multibytestring: Pstr, bytesinmultibytestring: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayEngWideCharToMultiByte")

public actual fun fontobjCGetAllGlyphHandles(pfo: MutPtr<Fontobj>, phg: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayFontobjCGetAllGlyphHandles")

public actual fun fontobjCGetGlyphs(pfo: MutPtr<Fontobj>, imode: UInt, cglyph: UInt, phg: MutPtr<UInt>, ppvglyph: MutPtr<MutPtr<CVoid>>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayFontobjCGetGlyphs")

public actual fun fontobjPQueryGlyphAttrs(pfo: MutPtr<Fontobj>, imode: UInt): MutPtr<FdGlyphattr> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayFontobjPQueryGlyphAttrs")

public actual fun fontobjPfdg(pfo: MutPtr<Fontobj>): MutPtr<FdGlyphset> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayFontobjPfdg")

public actual fun fontobjPifi(pfo: ConstPtr<Fontobj>): MutPtr<Ifimetrics> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayFontobjPifi")

public actual fun fontobjPvTrueTypeFontFile(pfo: MutPtr<Fontobj>, pcjfile: MutPtr<UInt>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayFontobjPvTrueTypeFontFile")

public actual fun fontobjPxoGetXform(pfo: ConstPtr<Fontobj>): MutPtr<Xformobj> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayFontobjPxoGetXform")

public actual fun fontobjVGetInfo(pfo: MutPtr<Fontobj>, cjsize: UInt, pfi: MutPtr<Fontinfo>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayFontobjVGetInfo")

public actual fun getAutoRotationState(pstate: MutPtr<ArState>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetAutoRotationState")

public actual fun getCapabilitiesStringLength(hmonitor: Handle, pdwcapabilitiesstringlengthincharacters: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetCapabilitiesStringLength")

public actual fun getDisplayAutoRotationPreferences(porientation: MutPtr<OrientationPreference>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetDisplayAutoRotationPreferences")

public actual fun getDisplayConfigBufferSizes(flags: QueryDisplayConfigFlags, numpatharrayelements: MutPtr<UInt>, nummodeinfoarrayelements: MutPtr<UInt>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetDisplayConfigBufferSizes")

public actual fun getMonitorBrightness(hmonitor: Handle, pdwminimumbrightness: MutPtr<UInt>, pdwcurrentbrightness: MutPtr<UInt>, pdwmaximumbrightness: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetMonitorBrightness")

public actual fun getMonitorCapabilities(hmonitor: Handle, pdwmonitorcapabilities: MutPtr<UInt>, pdwsupportedcolortemperatures: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetMonitorCapabilities")

public actual fun getMonitorColorTemperature(hmonitor: Handle, pctcurrentcolortemperature: MutPtr<McColorTemperature>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetMonitorColorTemperature")

public actual fun getMonitorContrast(hmonitor: Handle, pdwminimumcontrast: MutPtr<UInt>, pdwcurrentcontrast: MutPtr<UInt>, pdwmaximumcontrast: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetMonitorContrast")

public actual fun getMonitorDisplayAreaPosition(hmonitor: Handle, ptpositiontype: McPositionType, pdwminimumposition: MutPtr<UInt>, pdwcurrentposition: MutPtr<UInt>, pdwmaximumposition: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetMonitorDisplayAreaPosition")

public actual fun getMonitorDisplayAreaSize(hmonitor: Handle, stsizetype: McSizeType, pdwminimumwidthorheight: MutPtr<UInt>, pdwcurrentwidthorheight: MutPtr<UInt>, pdwmaximumwidthorheight: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetMonitorDisplayAreaSize")

public actual fun getMonitorRedGreenOrBlueDrive(hmonitor: Handle, dtdrivetype: McDriveType, pdwminimumdrive: MutPtr<UInt>, pdwcurrentdrive: MutPtr<UInt>, pdwmaximumdrive: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetMonitorRedGreenOrBlueDrive")

public actual fun getMonitorRedGreenOrBlueGain(hmonitor: Handle, gtgaintype: McGainType, pdwminimumgain: MutPtr<UInt>, pdwcurrentgain: MutPtr<UInt>, pdwmaximumgain: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetMonitorRedGreenOrBlueGain")

public actual fun getMonitorTechnologyType(hmonitor: Handle, pdtydisplaytechnologytype: MutPtr<McDisplayTechnologyType>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetMonitorTechnologyType")

public actual fun getNumberOfPhysicalMonitorsFromHMONITOR(hmonitor: Hmonitor, pdwnumberofphysicalmonitors: MutPtr<UInt>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetNumberOfPhysicalMonitorsFromHMONITOR")

public actual fun getPhysicalMonitorsFromHMONITOR(hmonitor: Hmonitor, dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: MutPtr<PhysicalMonitor>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetPhysicalMonitorsFromHMONITOR")

public actual fun getTimingReport(hmonitor: Handle, pmtrmonitortimingreport: MutPtr<McTimingReport>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetTimingReport")

public actual fun getVCPFeatureAndVCPFeatureReply(hmonitor: Handle, bvcpcode: UByte, pvct: MutPtr<McVcpCodeType>, pdwcurrentvalue: MutPtr<UInt>, pdwmaximumvalue: MutPtr<UInt>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayGetVCPFeatureAndVCPFeatureReply")

public actual fun htGet8BppformatPalette(ppaletteentry: MutPtr<Paletteentry>, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayHtGet8BppformatPalette")

public actual fun htGet8BppmaskPalette(ppaletteentry: MutPtr<Paletteentry>, use8bppmaskpal: Bool, cmymask: UByte, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayHtGet8BppmaskPalette")

public actual fun pathobjBEnum(ppo: MutPtr<Pathobj>, ppd: MutPtr<Pathdata>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayPathobjBEnum")

public actual fun pathobjBEnumClipLines(ppo: MutPtr<Pathobj>, cb: UInt, pcl: MutPtr<Clipline>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayPathobjBEnumClipLines")

public actual fun pathobjVEnumStart(ppo: MutPtr<Pathobj>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayPathobjVEnumStart")

public actual fun pathobjVEnumStartClipLines(ppo: MutPtr<Pathobj>, pco: MutPtr<Clipobj>, pso: MutPtr<Surfobj>, pla: MutPtr<Lineattrs>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayPathobjVEnumStartClipLines")

public actual fun pathobjVGetBounds(ppo: MutPtr<Pathobj>, prectfx: MutPtr<Rectfx>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayPathobjVGetBounds")

public actual fun queryDisplayConfig(flags: QueryDisplayConfigFlags, numpatharrayelements: MutPtr<UInt>, patharray: MutPtr<DisplayconfigPathInfo>, nummodeinfoarrayelements: MutPtr<UInt>, modeinfoarray: MutPtr<DisplayconfigModeInfo>, currenttopologyid: MutPtr<DisplayconfigTopologyId>): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayQueryDisplayConfig")

public actual fun restoreMonitorFactoryColorDefaults(hmonitor: Handle): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayRestoreMonitorFactoryColorDefaults")

public actual fun restoreMonitorFactoryDefaults(hmonitor: Handle): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayRestoreMonitorFactoryDefaults")

public actual fun strobjBEnum(pstro: MutPtr<Strobj>, pc: MutPtr<UInt>, ppgpos: MutPtr<MutPtr<Glyphpos>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayStrobjBEnum")

public actual fun strobjBEnumPositionsOnly(pstro: MutPtr<Strobj>, pc: MutPtr<UInt>, ppgpos: MutPtr<MutPtr<Glyphpos>>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayStrobjBEnumPositionsOnly")

public actual fun strobjBGetAdvanceWidths(pso: MutPtr<Strobj>, ifirst: UInt, c: UInt, pptqd: MutPtr<Pointqf>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayStrobjBGetAdvanceWidths")

public actual fun strobjDwGetCodePage(pstro: MutPtr<Strobj>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayStrobjDwGetCodePage")

public actual fun strobjVEnumStart(pstro: MutPtr<Strobj>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayStrobjVEnumStart")

public actual fun saveCurrentMonitorSettings(hmonitor: Handle): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplaySaveCurrentMonitorSettings")

public actual fun saveCurrentSettings(hmonitor: Handle): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplaySaveCurrentSettings")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32DevicesDisplaySetDisplayAutoRotationPreferences")
private external fun wasiWindowssysWindowsWin32DevicesDisplaySetDisplayAutoRotationPreferences(orientation: Int): Int

public actual fun setDisplayAutoRotationPreferences(orientation: OrientationPreference): Bool =
    wasiWindowssysWindowsWin32DevicesDisplaySetDisplayAutoRotationPreferences(orientation).toInt()

public actual fun setDisplayConfig(numpatharrayelements: UInt, patharray: ConstPtr<DisplayconfigPathInfo>, nummodeinfoarrayelements: UInt, modeinfoarray: ConstPtr<DisplayconfigModeInfo>, flags: SetDisplayConfigFlags): Int =
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

public actual fun xformobjBApplyXform(pxo: MutPtr<Xformobj>, imode: UInt, cpoints: UInt, pvin: MutPtr<CVoid>, pvout: MutPtr<CVoid>): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayXformobjBApplyXform")

public actual fun xformobjIGetXform(pxo: ConstPtr<Xformobj>, pxform: MutPtr<Xforml>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayXformobjIGetXform")

public actual fun xlateobjCGetPalette(pxlo: MutPtr<Xlateobj>, ipal: UInt, cpal: UInt, ppal: MutPtr<UInt>): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayXlateobjCGetPalette")

public actual fun xlateobjHGetColorTransform(pxlo: MutPtr<Xlateobj>): Handle =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayXlateobjHGetColorTransform")

public actual fun xlateobjIXlate(pxlo: MutPtr<Xlateobj>, icolor: UInt): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayXlateobjIXlate")

public actual fun xlateobjPiVector(pxlo: MutPtr<Xlateobj>): MutPtr<UInt> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesDisplayXlateobjPiVector")
