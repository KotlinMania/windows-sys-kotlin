@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.display

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayBrushobjHGetColorTransform
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayBrushobjPvAllocRbrush
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayBrushobjPvGetRbrush
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayBrushobjUlGetBrushColor
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayCapabilitiesRequestAndCapabilitiesReply
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayClipobjBEnum
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayClipobjCEnumStart
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayClipobjPpoGetPath
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayDegaussMonitor
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayDestroyPhysicalMonitor
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayDestroyPhysicalMonitors
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayDisplayConfigGetDeviceInfo
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayDisplayConfigSetDeviceInfo
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngAcquireSemaphore
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngAlphaBlend
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngAssociateSurface
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngBitBlt
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngCheckAbort
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngComputeGlyphSet
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngCopyBits
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngCreateClip
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngCreatePalette
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngCreateSemaphore
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngDeleteClip
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngDeletePalette
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngDeletePath
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngDeleteSemaphore
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngDeleteSurface
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngEraseSurface
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngFillPath
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngFindResource
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngFreeModule
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngGetCurrentCodePage
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngGetDriverName
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngGetPrinterDataFileName
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngGradientFill
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngLineTo
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngLoadModule
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngLockSurface
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngMarkBandingSurface
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngMultiByteToUnicodeN
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngMultiByteToWideChar
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngPaint
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngPlgBlt
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngQueryEMFInfo
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngQueryLocalTime
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngReleaseSemaphore
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngStretchBlt
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngStretchBltROP
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngStrokeAndFillPath
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngStrokePath
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngTextOut
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngTransparentBlt
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngUnicodeToMultiByteN
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngUnlockSurface
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayEngWideCharToMultiByte
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayFontobjCGetAllGlyphHandles
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayFontobjCGetGlyphs
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayFontobjPQueryGlyphAttrs
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayFontobjPfdg
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayFontobjPifi
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayFontobjPvTrueTypeFontFile
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayFontobjPxoGetXform
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayFontobjVGetInfo
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayGetAutoRotationState
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayGetCapabilitiesStringLength
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayGetDisplayAutoRotationPreferences
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayGetDisplayConfigBufferSizes
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayGetMonitorBrightness
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayGetMonitorCapabilities
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayGetMonitorColorTemperature
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayGetMonitorContrast
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayGetMonitorDisplayAreaPosition
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayGetMonitorDisplayAreaSize
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayGetMonitorRedGreenOrBlueDrive
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayGetMonitorRedGreenOrBlueGain
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayGetMonitorTechnologyType
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayGetNumberOfPhysicalMonitorsFromHMONITOR
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayGetPhysicalMonitorsFromHMONITOR
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayGetTimingReport
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayGetVCPFeatureAndVCPFeatureReply
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayHtGet8BppformatPalette
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayHtGet8BppmaskPalette
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayPathobjBEnum
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayPathobjBEnumClipLines
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayPathobjVEnumStart
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayPathobjVEnumStartClipLines
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayPathobjVGetBounds
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayQueryDisplayConfig
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayRestoreMonitorFactoryColorDefaults
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayRestoreMonitorFactoryDefaults
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplaySaveCurrentMonitorSettings
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplaySaveCurrentSettings
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplaySetDisplayAutoRotationPreferences
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplaySetDisplayConfig
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplaySetMonitorBrightness
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplaySetMonitorColorTemperature
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplaySetMonitorContrast
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplaySetMonitorDisplayAreaPosition
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplaySetMonitorDisplayAreaSize
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplaySetMonitorRedGreenOrBlueDrive
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplaySetMonitorRedGreenOrBlueGain
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplaySetVCPFeature
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayStrobjBEnum
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayStrobjBEnumPositionsOnly
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayStrobjBGetAdvanceWidths
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayStrobjDwGetCodePage
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayStrobjVEnumStart
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayXformobjBApplyXform
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayXformobjIGetXform
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayXlateobjCGetPalette
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayXlateobjHGetColorTransform
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayXlateobjIXlate
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssysWindowsWin32DevicesDisplayXlateobjPiVector
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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun brushobjHGetColorTransform(pbo: MutPtr<Brushobj>): Handle =
    MutPtr(windowssysWindowsWin32DevicesDisplayBrushobjHGetColorTransform(pbo.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun brushobjPvAllocRbrush(pbo: MutPtr<Brushobj>, cj: UInt): MutPtr<CVoid> =
    MutPtr(windowssysWindowsWin32DevicesDisplayBrushobjPvAllocRbrush(pbo.rawAddress.toCPointer<ByteVar>(), cj)?.toLong() ?: 0L)

public actual fun brushobjPvGetRbrush(pbo: MutPtr<Brushobj>): MutPtr<CVoid> =
    MutPtr(windowssysWindowsWin32DevicesDisplayBrushobjPvGetRbrush(pbo.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun brushobjUlGetBrushColor(pbo: MutPtr<Brushobj>): UInt =
    windowssysWindowsWin32DevicesDisplayBrushobjUlGetBrushColor(pbo.rawAddress.toCPointer<ByteVar>())

public actual fun clipobjBEnum(pco: MutPtr<Clipobj>, cj: UInt, pul: MutPtr<UInt>): Bool =
    windowssysWindowsWin32DevicesDisplayClipobjBEnum(pco.rawAddress.toCPointer<ByteVar>(), cj, pul.rawAddress.toCPointer<ByteVar>())

public actual fun clipobjCEnumStart(pco: MutPtr<Clipobj>, ball: Bool, itype: UInt, idirection: UInt, climit: UInt): UInt =
    windowssysWindowsWin32DevicesDisplayClipobjCEnumStart(pco.rawAddress.toCPointer<ByteVar>(), ball, itype, idirection, climit)

public actual fun clipobjPpoGetPath(pco: MutPtr<Clipobj>): MutPtr<Pathobj> =
    MutPtr(windowssysWindowsWin32DevicesDisplayClipobjPpoGetPath(pco.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun capabilitiesRequestAndCapabilitiesReply(hmonitor: Handle, pszasciicapabilitiesstring: Pstr, dwcapabilitiesstringlengthincharacters: UInt): Int =
    windowssysWindowsWin32DevicesDisplayCapabilitiesRequestAndCapabilitiesReply(hmonitor.rawAddress.toCPointer<ByteVar>(), pszasciicapabilitiesstring.rawAddress.toCPointer<ByteVar>(), dwcapabilitiesstringlengthincharacters)

public actual fun degaussMonitor(hmonitor: Handle): Int =
    windowssysWindowsWin32DevicesDisplayDegaussMonitor(hmonitor.rawAddress.toCPointer<ByteVar>())

public actual fun destroyPhysicalMonitor(hmonitor: Handle): Bool =
    windowssysWindowsWin32DevicesDisplayDestroyPhysicalMonitor(hmonitor.rawAddress.toCPointer<ByteVar>())

public actual fun destroyPhysicalMonitors(dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: ConstPtr<PhysicalMonitor>): Bool =
    windowssysWindowsWin32DevicesDisplayDestroyPhysicalMonitors(dwphysicalmonitorarraysize, pphysicalmonitorarray.rawAddress.toCPointer<ByteVar>())

public actual fun displayConfigGetDeviceInfo(requestpacket: MutPtr<DisplayconfigDeviceInfoHeader>): Int =
    windowssysWindowsWin32DevicesDisplayDisplayConfigGetDeviceInfo(requestpacket.rawAddress.toCPointer<ByteVar>())

public actual fun displayConfigSetDeviceInfo(setpacket: ConstPtr<DisplayconfigDeviceInfoHeader>): Int =
    windowssysWindowsWin32DevicesDisplayDisplayConfigSetDeviceInfo(setpacket.rawAddress.toCPointer<ByteVar>())

public actual fun engAcquireSemaphore(hsem: Hsemaphore) {
    windowssysWindowsWin32DevicesDisplayEngAcquireSemaphore(hsem.rawAddress.toCPointer<ByteVar>())
}

public actual fun engAlphaBlend(psodest: MutPtr<Surfobj>, psosrc: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pxlo: MutPtr<Xlateobj>, prcldest: MutPtr<Rectl>, prclsrc: MutPtr<Rectl>, pblendobj: MutPtr<Blendobj>): Bool =
    windowssysWindowsWin32DevicesDisplayEngAlphaBlend(psodest.rawAddress.toCPointer<ByteVar>(), psosrc.rawAddress.toCPointer<ByteVar>(), pco.rawAddress.toCPointer<ByteVar>(), pxlo.rawAddress.toCPointer<ByteVar>(), prcldest.rawAddress.toCPointer<ByteVar>(), prclsrc.rawAddress.toCPointer<ByteVar>(), pblendobj.rawAddress.toCPointer<ByteVar>())

public actual fun engAssociateSurface(hsurf: Hsurf, hdev: Hdev, flhooks: UInt): Bool =
    windowssysWindowsWin32DevicesDisplayEngAssociateSurface(hsurf.rawAddress.toCPointer<ByteVar>(), hdev.rawAddress.toCPointer<ByteVar>(), flhooks)

public actual fun engBitBlt(psotrg: ConstPtr<Surfobj>, psosrc: ConstPtr<Surfobj>, psomask: ConstPtr<Surfobj>, pco: ConstPtr<Clipobj>, pxlo: ConstPtr<Xlateobj>, prcltrg: ConstPtr<Rectl>, pptlsrc: ConstPtr<Pointl>, pptlmask: ConstPtr<Pointl>, pbo: ConstPtr<Brushobj>, pptlbrush: ConstPtr<Pointl>, rop4: UInt): Bool =
    windowssysWindowsWin32DevicesDisplayEngBitBlt(psotrg.rawAddress.toCPointer<ByteVar>(), psosrc.rawAddress.toCPointer<ByteVar>(), psomask.rawAddress.toCPointer<ByteVar>(), pco.rawAddress.toCPointer<ByteVar>(), pxlo.rawAddress.toCPointer<ByteVar>(), prcltrg.rawAddress.toCPointer<ByteVar>(), pptlsrc.rawAddress.toCPointer<ByteVar>(), pptlmask.rawAddress.toCPointer<ByteVar>(), pbo.rawAddress.toCPointer<ByteVar>(), pptlbrush.rawAddress.toCPointer<ByteVar>(), rop4)

public actual fun engCheckAbort(pso: MutPtr<Surfobj>): Bool =
    windowssysWindowsWin32DevicesDisplayEngCheckAbort(pso.rawAddress.toCPointer<ByteVar>())

public actual fun engComputeGlyphSet(ncodepage: Int, nfirstchar: Int, cchars: Int): MutPtr<FdGlyphset> =
    MutPtr(windowssysWindowsWin32DevicesDisplayEngComputeGlyphSet(ncodepage, nfirstchar, cchars)?.toLong() ?: 0L)

public actual fun engCopyBits(psodest: MutPtr<Surfobj>, psosrc: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pxlo: MutPtr<Xlateobj>, prcldest: MutPtr<Rectl>, pptlsrc: MutPtr<Pointl>): Bool =
    windowssysWindowsWin32DevicesDisplayEngCopyBits(psodest.rawAddress.toCPointer<ByteVar>(), psosrc.rawAddress.toCPointer<ByteVar>(), pco.rawAddress.toCPointer<ByteVar>(), pxlo.rawAddress.toCPointer<ByteVar>(), prcldest.rawAddress.toCPointer<ByteVar>(), pptlsrc.rawAddress.toCPointer<ByteVar>())

public actual fun engCreateBitmap(sizl: Size, lwidth: Int, iformat: UInt, fl: UInt, pvbits: MutPtr<CVoid>): Hbitmap =
    MutPtr(0L)

public actual fun engCreateClip(): MutPtr<Clipobj> =
    MutPtr(windowssysWindowsWin32DevicesDisplayEngCreateClip()?.toLong() ?: 0L)

public actual fun engCreateDeviceBitmap(dhsurf: Dhsurf, sizl: Size, iformatcompat: UInt): Hbitmap =
    MutPtr(0L)

public actual fun engCreateDeviceSurface(dhsurf: Dhsurf, sizl: Size, iformatcompat: UInt): Hsurf =
    MutPtr(0L)

public actual fun engCreatePalette(imode: UInt, ccolors: UInt, pulcolors: MutPtr<UInt>, flred: UInt, flgreen: UInt, flblue: UInt): Hpalette =
    MutPtr(windowssysWindowsWin32DevicesDisplayEngCreatePalette(imode, ccolors, pulcolors.rawAddress.toCPointer<ByteVar>(), flred, flgreen, flblue)?.toLong() ?: 0L)

public actual fun engCreateSemaphore(): Hsemaphore =
    MutPtr(windowssysWindowsWin32DevicesDisplayEngCreateSemaphore()?.toLong() ?: 0L)

public actual fun engDeleteClip(pco: ConstPtr<Clipobj>) {
    windowssysWindowsWin32DevicesDisplayEngDeleteClip(pco.rawAddress.toCPointer<ByteVar>())
}

public actual fun engDeletePalette(hpal: Hpalette): Bool =
    windowssysWindowsWin32DevicesDisplayEngDeletePalette(hpal.rawAddress.toCPointer<ByteVar>())

public actual fun engDeletePath(ppo: MutPtr<Pathobj>) {
    windowssysWindowsWin32DevicesDisplayEngDeletePath(ppo.rawAddress.toCPointer<ByteVar>())
}

public actual fun engDeleteSemaphore(hsem: Hsemaphore) {
    windowssysWindowsWin32DevicesDisplayEngDeleteSemaphore(hsem.rawAddress.toCPointer<ByteVar>())
}

public actual fun engDeleteSurface(hsurf: Hsurf): Bool =
    windowssysWindowsWin32DevicesDisplayEngDeleteSurface(hsurf.rawAddress.toCPointer<ByteVar>())

public actual fun engEraseSurface(pso: MutPtr<Surfobj>, prcl: MutPtr<Rectl>, icolor: UInt): Bool =
    windowssysWindowsWin32DevicesDisplayEngEraseSurface(pso.rawAddress.toCPointer<ByteVar>(), prcl.rawAddress.toCPointer<ByteVar>(), icolor)

public actual fun engFillPath(pso: MutPtr<Surfobj>, ppo: MutPtr<Pathobj>, pco: MutPtr<Clipobj>, pbo: MutPtr<Brushobj>, pptlbrushorg: MutPtr<Pointl>, mix: UInt, floptions: UInt): Bool =
    windowssysWindowsWin32DevicesDisplayEngFillPath(pso.rawAddress.toCPointer<ByteVar>(), ppo.rawAddress.toCPointer<ByteVar>(), pco.rawAddress.toCPointer<ByteVar>(), pbo.rawAddress.toCPointer<ByteVar>(), pptlbrushorg.rawAddress.toCPointer<ByteVar>(), mix, floptions)

public actual fun engFindResource(h: Handle, iname: Int, itype: Int, pulsize: MutPtr<UInt>): MutPtr<CVoid> =
    MutPtr(windowssysWindowsWin32DevicesDisplayEngFindResource(h.rawAddress.toCPointer<ByteVar>(), iname, itype, pulsize.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun engFreeModule(h: Handle) {
    windowssysWindowsWin32DevicesDisplayEngFreeModule(h.rawAddress.toCPointer<ByteVar>())
}

public actual fun engGetCurrentCodePage(oemcodepage: MutPtr<UShort>, ansicodepage: MutPtr<UShort>) {
    windowssysWindowsWin32DevicesDisplayEngGetCurrentCodePage(oemcodepage.rawAddress.toCPointer<ByteVar>(), ansicodepage.rawAddress.toCPointer<ByteVar>())
}

public actual fun engGetDriverName(hdev: Hdev): Pwstr =
    MutPtr(windowssysWindowsWin32DevicesDisplayEngGetDriverName(hdev.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun engGetPrinterDataFileName(hdev: Hdev): Pwstr =
    MutPtr(windowssysWindowsWin32DevicesDisplayEngGetPrinterDataFileName(hdev.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun engGradientFill(psodest: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pxlo: MutPtr<Xlateobj>, pvertex: MutPtr<Trivertex>, nvertex: UInt, pmesh: MutPtr<CVoid>, nmesh: UInt, prclextents: MutPtr<Rectl>, pptlditherorg: MutPtr<Pointl>, ulmode: UInt): Bool =
    windowssysWindowsWin32DevicesDisplayEngGradientFill(psodest.rawAddress.toCPointer<ByteVar>(), pco.rawAddress.toCPointer<ByteVar>(), pxlo.rawAddress.toCPointer<ByteVar>(), pvertex.rawAddress.toCPointer<ByteVar>(), nvertex, pmesh.rawAddress.toCPointer<ByteVar>(), nmesh, prclextents.rawAddress.toCPointer<ByteVar>(), pptlditherorg.rawAddress.toCPointer<ByteVar>(), ulmode)

public actual fun engLineTo(pso: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pbo: MutPtr<Brushobj>, x1: Int, y1: Int, x2: Int, y2: Int, prclbounds: MutPtr<Rectl>, mix: UInt): Bool =
    windowssysWindowsWin32DevicesDisplayEngLineTo(pso.rawAddress.toCPointer<ByteVar>(), pco.rawAddress.toCPointer<ByteVar>(), pbo.rawAddress.toCPointer<ByteVar>(), x1, y1, x2, y2, prclbounds.rawAddress.toCPointer<ByteVar>(), mix)

public actual fun engLoadModule(pwsz: Pcwstr): Handle =
    MutPtr(windowssysWindowsWin32DevicesDisplayEngLoadModule(pwsz.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun engLockSurface(hsurf: Hsurf): MutPtr<Surfobj> =
    MutPtr(windowssysWindowsWin32DevicesDisplayEngLockSurface(hsurf.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun engMarkBandingSurface(hsurf: Hsurf): Bool =
    windowssysWindowsWin32DevicesDisplayEngMarkBandingSurface(hsurf.rawAddress.toCPointer<ByteVar>())

public actual fun engMultiByteToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: MutPtr<UInt>, multibytestring: Pcstr, bytesinmultibytestring: UInt) {
    windowssysWindowsWin32DevicesDisplayEngMultiByteToUnicodeN(unicodestring.rawAddress.toCPointer<ByteVar>(), maxbytesinunicodestring, bytesinunicodestring.rawAddress.toCPointer<ByteVar>(), multibytestring.rawAddress.toCPointer<ByteVar>(), bytesinmultibytestring)
}

public actual fun engMultiByteToWideChar(codepage: UInt, widecharstring: Pwstr, bytesinwidecharstring: Int, multibytestring: Pcstr, bytesinmultibytestring: Int): Int =
    windowssysWindowsWin32DevicesDisplayEngMultiByteToWideChar(codepage, widecharstring.rawAddress.toCPointer<ByteVar>(), bytesinwidecharstring, multibytestring.rawAddress.toCPointer<ByteVar>(), bytesinmultibytestring)

public actual fun engPaint(pso: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pbo: MutPtr<Brushobj>, pptlbrushorg: MutPtr<Pointl>, mix: UInt): Bool =
    windowssysWindowsWin32DevicesDisplayEngPaint(pso.rawAddress.toCPointer<ByteVar>(), pco.rawAddress.toCPointer<ByteVar>(), pbo.rawAddress.toCPointer<ByteVar>(), pptlbrushorg.rawAddress.toCPointer<ByteVar>(), mix)

public actual fun engPlgBlt(psotrg: MutPtr<Surfobj>, psosrc: MutPtr<Surfobj>, psomsk: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pxlo: MutPtr<Xlateobj>, pca: MutPtr<Coloradjustment>, pptlbrushorg: MutPtr<Pointl>, pptfx: MutPtr<Pointfix>, prcl: MutPtr<Rectl>, pptl: MutPtr<Pointl>, imode: UInt): Bool =
    windowssysWindowsWin32DevicesDisplayEngPlgBlt(psotrg.rawAddress.toCPointer<ByteVar>(), psosrc.rawAddress.toCPointer<ByteVar>(), psomsk.rawAddress.toCPointer<ByteVar>(), pco.rawAddress.toCPointer<ByteVar>(), pxlo.rawAddress.toCPointer<ByteVar>(), pca.rawAddress.toCPointer<ByteVar>(), pptlbrushorg.rawAddress.toCPointer<ByteVar>(), pptfx.rawAddress.toCPointer<ByteVar>(), prcl.rawAddress.toCPointer<ByteVar>(), pptl.rawAddress.toCPointer<ByteVar>(), imode)

public actual fun engQueryEMFInfo(hdev: Hdev, pemfinfo: MutPtr<Emfinfo>): Bool =
    windowssysWindowsWin32DevicesDisplayEngQueryEMFInfo(hdev.rawAddress.toCPointer<ByteVar>(), pemfinfo.rawAddress.toCPointer<ByteVar>())

public actual fun engQueryLocalTime(param0: MutPtr<EngTimeFields>) {
    windowssysWindowsWin32DevicesDisplayEngQueryLocalTime(param0.rawAddress.toCPointer<ByteVar>())
}

public actual fun engReleaseSemaphore(hsem: Hsemaphore) {
    windowssysWindowsWin32DevicesDisplayEngReleaseSemaphore(hsem.rawAddress.toCPointer<ByteVar>())
}

public actual fun engStretchBlt(psodest: MutPtr<Surfobj>, psosrc: MutPtr<Surfobj>, psomask: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pxlo: MutPtr<Xlateobj>, pca: MutPtr<Coloradjustment>, pptlhtorg: MutPtr<Pointl>, prcldest: MutPtr<Rectl>, prclsrc: MutPtr<Rectl>, pptlmask: MutPtr<Pointl>, imode: UInt): Bool =
    windowssysWindowsWin32DevicesDisplayEngStretchBlt(psodest.rawAddress.toCPointer<ByteVar>(), psosrc.rawAddress.toCPointer<ByteVar>(), psomask.rawAddress.toCPointer<ByteVar>(), pco.rawAddress.toCPointer<ByteVar>(), pxlo.rawAddress.toCPointer<ByteVar>(), pca.rawAddress.toCPointer<ByteVar>(), pptlhtorg.rawAddress.toCPointer<ByteVar>(), prcldest.rawAddress.toCPointer<ByteVar>(), prclsrc.rawAddress.toCPointer<ByteVar>(), pptlmask.rawAddress.toCPointer<ByteVar>(), imode)

public actual fun engStretchBltROP(psodest: MutPtr<Surfobj>, psosrc: MutPtr<Surfobj>, psomask: MutPtr<Surfobj>, pco: MutPtr<Clipobj>, pxlo: MutPtr<Xlateobj>, pca: MutPtr<Coloradjustment>, pptlhtorg: MutPtr<Pointl>, prcldest: MutPtr<Rectl>, prclsrc: MutPtr<Rectl>, pptlmask: MutPtr<Pointl>, imode: UInt, pbo: MutPtr<Brushobj>, rop4: UInt): Bool =
    windowssysWindowsWin32DevicesDisplayEngStretchBltROP(psodest.rawAddress.toCPointer<ByteVar>(), psosrc.rawAddress.toCPointer<ByteVar>(), psomask.rawAddress.toCPointer<ByteVar>(), pco.rawAddress.toCPointer<ByteVar>(), pxlo.rawAddress.toCPointer<ByteVar>(), pca.rawAddress.toCPointer<ByteVar>(), pptlhtorg.rawAddress.toCPointer<ByteVar>(), prcldest.rawAddress.toCPointer<ByteVar>(), prclsrc.rawAddress.toCPointer<ByteVar>(), pptlmask.rawAddress.toCPointer<ByteVar>(), imode, pbo.rawAddress.toCPointer<ByteVar>(), rop4)

public actual fun engStrokeAndFillPath(pso: MutPtr<Surfobj>, ppo: MutPtr<Pathobj>, pco: MutPtr<Clipobj>, pxo: MutPtr<Xformobj>, pbostroke: MutPtr<Brushobj>, plineattrs: MutPtr<Lineattrs>, pbofill: MutPtr<Brushobj>, pptlbrushorg: MutPtr<Pointl>, mixfill: UInt, floptions: UInt): Bool =
    windowssysWindowsWin32DevicesDisplayEngStrokeAndFillPath(pso.rawAddress.toCPointer<ByteVar>(), ppo.rawAddress.toCPointer<ByteVar>(), pco.rawAddress.toCPointer<ByteVar>(), pxo.rawAddress.toCPointer<ByteVar>(), pbostroke.rawAddress.toCPointer<ByteVar>(), plineattrs.rawAddress.toCPointer<ByteVar>(), pbofill.rawAddress.toCPointer<ByteVar>(), pptlbrushorg.rawAddress.toCPointer<ByteVar>(), mixfill, floptions)

public actual fun engStrokePath(pso: MutPtr<Surfobj>, ppo: MutPtr<Pathobj>, pco: MutPtr<Clipobj>, pxo: MutPtr<Xformobj>, pbo: MutPtr<Brushobj>, pptlbrushorg: MutPtr<Pointl>, plineattrs: MutPtr<Lineattrs>, mix: UInt): Bool =
    windowssysWindowsWin32DevicesDisplayEngStrokePath(pso.rawAddress.toCPointer<ByteVar>(), ppo.rawAddress.toCPointer<ByteVar>(), pco.rawAddress.toCPointer<ByteVar>(), pxo.rawAddress.toCPointer<ByteVar>(), pbo.rawAddress.toCPointer<ByteVar>(), pptlbrushorg.rawAddress.toCPointer<ByteVar>(), plineattrs.rawAddress.toCPointer<ByteVar>(), mix)

public actual fun engTextOut(pso: MutPtr<Surfobj>, pstro: MutPtr<Strobj>, pfo: MutPtr<Fontobj>, pco: MutPtr<Clipobj>, prclextra: MutPtr<Rectl>, prclopaque: MutPtr<Rectl>, pbofore: MutPtr<Brushobj>, pboopaque: MutPtr<Brushobj>, pptlorg: MutPtr<Pointl>, mix: UInt): Bool =
    windowssysWindowsWin32DevicesDisplayEngTextOut(pso.rawAddress.toCPointer<ByteVar>(), pstro.rawAddress.toCPointer<ByteVar>(), pfo.rawAddress.toCPointer<ByteVar>(), pco.rawAddress.toCPointer<ByteVar>(), prclextra.rawAddress.toCPointer<ByteVar>(), prclopaque.rawAddress.toCPointer<ByteVar>(), pbofore.rawAddress.toCPointer<ByteVar>(), pboopaque.rawAddress.toCPointer<ByteVar>(), pptlorg.rawAddress.toCPointer<ByteVar>(), mix)

public actual fun engTransparentBlt(psodst: ConstPtr<Surfobj>, psosrc: ConstPtr<Surfobj>, pco: ConstPtr<Clipobj>, pxlo: ConstPtr<Xlateobj>, prcldst: ConstPtr<Rectl>, prclsrc: ConstPtr<Rectl>, transcolor: UInt, bcalledfrombitblt: UInt): Bool =
    windowssysWindowsWin32DevicesDisplayEngTransparentBlt(psodst.rawAddress.toCPointer<ByteVar>(), psosrc.rawAddress.toCPointer<ByteVar>(), pco.rawAddress.toCPointer<ByteVar>(), pxlo.rawAddress.toCPointer<ByteVar>(), prcldst.rawAddress.toCPointer<ByteVar>(), prclsrc.rawAddress.toCPointer<ByteVar>(), transcolor, bcalledfrombitblt)

public actual fun engUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: MutPtr<UInt>, unicodestring: Pcwstr, bytesinunicodestring: UInt) {
    windowssysWindowsWin32DevicesDisplayEngUnicodeToMultiByteN(multibytestring.rawAddress.toCPointer<ByteVar>(), maxbytesinmultibytestring, bytesinmultibytestring.rawAddress.toCPointer<ByteVar>(), unicodestring.rawAddress.toCPointer<ByteVar>(), bytesinunicodestring)
}

public actual fun engUnlockSurface(pso: MutPtr<Surfobj>) {
    windowssysWindowsWin32DevicesDisplayEngUnlockSurface(pso.rawAddress.toCPointer<ByteVar>())
}

public actual fun engWideCharToMultiByte(codepage: UInt, widecharstring: Pcwstr, bytesinwidecharstring: Int, multibytestring: Pstr, bytesinmultibytestring: Int): Int =
    windowssysWindowsWin32DevicesDisplayEngWideCharToMultiByte(codepage, widecharstring.rawAddress.toCPointer<ByteVar>(), bytesinwidecharstring, multibytestring.rawAddress.toCPointer<ByteVar>(), bytesinmultibytestring)

public actual fun fontobjCGetAllGlyphHandles(pfo: MutPtr<Fontobj>, phg: MutPtr<UInt>): UInt =
    windowssysWindowsWin32DevicesDisplayFontobjCGetAllGlyphHandles(pfo.rawAddress.toCPointer<ByteVar>(), phg.rawAddress.toCPointer<ByteVar>())

public actual fun fontobjCGetGlyphs(pfo: MutPtr<Fontobj>, imode: UInt, cglyph: UInt, phg: MutPtr<UInt>, ppvglyph: MutPtr<MutPtr<CVoid>>): UInt =
    windowssysWindowsWin32DevicesDisplayFontobjCGetGlyphs(pfo.rawAddress.toCPointer<ByteVar>(), imode, cglyph, phg.rawAddress.toCPointer<ByteVar>(), ppvglyph.rawAddress.toCPointer<ByteVar>())

public actual fun fontobjPQueryGlyphAttrs(pfo: MutPtr<Fontobj>, imode: UInt): MutPtr<FdGlyphattr> =
    MutPtr(windowssysWindowsWin32DevicesDisplayFontobjPQueryGlyphAttrs(pfo.rawAddress.toCPointer<ByteVar>(), imode)?.toLong() ?: 0L)

public actual fun fontobjPfdg(pfo: MutPtr<Fontobj>): MutPtr<FdGlyphset> =
    MutPtr(windowssysWindowsWin32DevicesDisplayFontobjPfdg(pfo.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fontobjPifi(pfo: ConstPtr<Fontobj>): MutPtr<Ifimetrics> =
    MutPtr(windowssysWindowsWin32DevicesDisplayFontobjPifi(pfo.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fontobjPvTrueTypeFontFile(pfo: MutPtr<Fontobj>, pcjfile: MutPtr<UInt>): MutPtr<CVoid> =
    MutPtr(windowssysWindowsWin32DevicesDisplayFontobjPvTrueTypeFontFile(pfo.rawAddress.toCPointer<ByteVar>(), pcjfile.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fontobjPxoGetXform(pfo: ConstPtr<Fontobj>): MutPtr<Xformobj> =
    MutPtr(windowssysWindowsWin32DevicesDisplayFontobjPxoGetXform(pfo.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun fontobjVGetInfo(pfo: MutPtr<Fontobj>, cjsize: UInt, pfi: MutPtr<Fontinfo>) {
    windowssysWindowsWin32DevicesDisplayFontobjVGetInfo(pfo.rawAddress.toCPointer<ByteVar>(), cjsize, pfi.rawAddress.toCPointer<ByteVar>())
}

public actual fun getAutoRotationState(pstate: MutPtr<ArState>): Bool =
    windowssysWindowsWin32DevicesDisplayGetAutoRotationState(pstate.rawAddress.toCPointer<ByteVar>())

public actual fun getCapabilitiesStringLength(hmonitor: Handle, pdwcapabilitiesstringlengthincharacters: MutPtr<UInt>): Int =
    windowssysWindowsWin32DevicesDisplayGetCapabilitiesStringLength(hmonitor.rawAddress.toCPointer<ByteVar>(), pdwcapabilitiesstringlengthincharacters.rawAddress.toCPointer<ByteVar>())

public actual fun getDisplayAutoRotationPreferences(porientation: MutPtr<OrientationPreference>): Bool =
    windowssysWindowsWin32DevicesDisplayGetDisplayAutoRotationPreferences(porientation.rawAddress.toCPointer<ByteVar>())

public actual fun getDisplayConfigBufferSizes(flags: QueryDisplayConfigFlags, numpatharrayelements: MutPtr<UInt>, nummodeinfoarrayelements: MutPtr<UInt>): Win32Error =
    windowssysWindowsWin32DevicesDisplayGetDisplayConfigBufferSizes(flags, numpatharrayelements.rawAddress.toCPointer<ByteVar>(), nummodeinfoarrayelements.rawAddress.toCPointer<ByteVar>())

public actual fun getMonitorBrightness(hmonitor: Handle, pdwminimumbrightness: MutPtr<UInt>, pdwcurrentbrightness: MutPtr<UInt>, pdwmaximumbrightness: MutPtr<UInt>): Int =
    windowssysWindowsWin32DevicesDisplayGetMonitorBrightness(hmonitor.rawAddress.toCPointer<ByteVar>(), pdwminimumbrightness.rawAddress.toCPointer<ByteVar>(), pdwcurrentbrightness.rawAddress.toCPointer<ByteVar>(), pdwmaximumbrightness.rawAddress.toCPointer<ByteVar>())

public actual fun getMonitorCapabilities(hmonitor: Handle, pdwmonitorcapabilities: MutPtr<UInt>, pdwsupportedcolortemperatures: MutPtr<UInt>): Int =
    windowssysWindowsWin32DevicesDisplayGetMonitorCapabilities(hmonitor.rawAddress.toCPointer<ByteVar>(), pdwmonitorcapabilities.rawAddress.toCPointer<ByteVar>(), pdwsupportedcolortemperatures.rawAddress.toCPointer<ByteVar>())

public actual fun getMonitorColorTemperature(hmonitor: Handle, pctcurrentcolortemperature: MutPtr<McColorTemperature>): Int =
    windowssysWindowsWin32DevicesDisplayGetMonitorColorTemperature(hmonitor.rawAddress.toCPointer<ByteVar>(), pctcurrentcolortemperature.rawAddress.toCPointer<ByteVar>())

public actual fun getMonitorContrast(hmonitor: Handle, pdwminimumcontrast: MutPtr<UInt>, pdwcurrentcontrast: MutPtr<UInt>, pdwmaximumcontrast: MutPtr<UInt>): Int =
    windowssysWindowsWin32DevicesDisplayGetMonitorContrast(hmonitor.rawAddress.toCPointer<ByteVar>(), pdwminimumcontrast.rawAddress.toCPointer<ByteVar>(), pdwcurrentcontrast.rawAddress.toCPointer<ByteVar>(), pdwmaximumcontrast.rawAddress.toCPointer<ByteVar>())

public actual fun getMonitorDisplayAreaPosition(hmonitor: Handle, ptpositiontype: McPositionType, pdwminimumposition: MutPtr<UInt>, pdwcurrentposition: MutPtr<UInt>, pdwmaximumposition: MutPtr<UInt>): Int =
    windowssysWindowsWin32DevicesDisplayGetMonitorDisplayAreaPosition(hmonitor.rawAddress.toCPointer<ByteVar>(), ptpositiontype, pdwminimumposition.rawAddress.toCPointer<ByteVar>(), pdwcurrentposition.rawAddress.toCPointer<ByteVar>(), pdwmaximumposition.rawAddress.toCPointer<ByteVar>())

public actual fun getMonitorDisplayAreaSize(hmonitor: Handle, stsizetype: McSizeType, pdwminimumwidthorheight: MutPtr<UInt>, pdwcurrentwidthorheight: MutPtr<UInt>, pdwmaximumwidthorheight: MutPtr<UInt>): Int =
    windowssysWindowsWin32DevicesDisplayGetMonitorDisplayAreaSize(hmonitor.rawAddress.toCPointer<ByteVar>(), stsizetype, pdwminimumwidthorheight.rawAddress.toCPointer<ByteVar>(), pdwcurrentwidthorheight.rawAddress.toCPointer<ByteVar>(), pdwmaximumwidthorheight.rawAddress.toCPointer<ByteVar>())

public actual fun getMonitorRedGreenOrBlueDrive(hmonitor: Handle, dtdrivetype: McDriveType, pdwminimumdrive: MutPtr<UInt>, pdwcurrentdrive: MutPtr<UInt>, pdwmaximumdrive: MutPtr<UInt>): Int =
    windowssysWindowsWin32DevicesDisplayGetMonitorRedGreenOrBlueDrive(hmonitor.rawAddress.toCPointer<ByteVar>(), dtdrivetype, pdwminimumdrive.rawAddress.toCPointer<ByteVar>(), pdwcurrentdrive.rawAddress.toCPointer<ByteVar>(), pdwmaximumdrive.rawAddress.toCPointer<ByteVar>())

public actual fun getMonitorRedGreenOrBlueGain(hmonitor: Handle, gtgaintype: McGainType, pdwminimumgain: MutPtr<UInt>, pdwcurrentgain: MutPtr<UInt>, pdwmaximumgain: MutPtr<UInt>): Int =
    windowssysWindowsWin32DevicesDisplayGetMonitorRedGreenOrBlueGain(hmonitor.rawAddress.toCPointer<ByteVar>(), gtgaintype, pdwminimumgain.rawAddress.toCPointer<ByteVar>(), pdwcurrentgain.rawAddress.toCPointer<ByteVar>(), pdwmaximumgain.rawAddress.toCPointer<ByteVar>())

public actual fun getMonitorTechnologyType(hmonitor: Handle, pdtydisplaytechnologytype: MutPtr<McDisplayTechnologyType>): Int =
    windowssysWindowsWin32DevicesDisplayGetMonitorTechnologyType(hmonitor.rawAddress.toCPointer<ByteVar>(), pdtydisplaytechnologytype.rawAddress.toCPointer<ByteVar>())

public actual fun getNumberOfPhysicalMonitorsFromHMONITOR(hmonitor: Hmonitor, pdwnumberofphysicalmonitors: MutPtr<UInt>): Bool =
    windowssysWindowsWin32DevicesDisplayGetNumberOfPhysicalMonitorsFromHMONITOR(hmonitor.rawAddress.toCPointer<ByteVar>(), pdwnumberofphysicalmonitors.rawAddress.toCPointer<ByteVar>())

public actual fun getPhysicalMonitorsFromHMONITOR(hmonitor: Hmonitor, dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: MutPtr<PhysicalMonitor>): Bool =
    windowssysWindowsWin32DevicesDisplayGetPhysicalMonitorsFromHMONITOR(hmonitor.rawAddress.toCPointer<ByteVar>(), dwphysicalmonitorarraysize, pphysicalmonitorarray.rawAddress.toCPointer<ByteVar>())

public actual fun getTimingReport(hmonitor: Handle, pmtrmonitortimingreport: MutPtr<McTimingReport>): Int =
    windowssysWindowsWin32DevicesDisplayGetTimingReport(hmonitor.rawAddress.toCPointer<ByteVar>(), pmtrmonitortimingreport.rawAddress.toCPointer<ByteVar>())

public actual fun getVCPFeatureAndVCPFeatureReply(hmonitor: Handle, bvcpcode: UByte, pvct: MutPtr<McVcpCodeType>, pdwcurrentvalue: MutPtr<UInt>, pdwmaximumvalue: MutPtr<UInt>): Int =
    windowssysWindowsWin32DevicesDisplayGetVCPFeatureAndVCPFeatureReply(hmonitor.rawAddress.toCPointer<ByteVar>(), bvcpcode, pvct.rawAddress.toCPointer<ByteVar>(), pdwcurrentvalue.rawAddress.toCPointer<ByteVar>(), pdwmaximumvalue.rawAddress.toCPointer<ByteVar>())

public actual fun htGet8BppformatPalette(ppaletteentry: MutPtr<Paletteentry>, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int =
    windowssysWindowsWin32DevicesDisplayHtGet8BppformatPalette(ppaletteentry.rawAddress.toCPointer<ByteVar>(), redgamma, greengamma, bluegamma)

public actual fun htGet8BppmaskPalette(ppaletteentry: MutPtr<Paletteentry>, use8bppmaskpal: Bool, cmymask: UByte, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int =
    windowssysWindowsWin32DevicesDisplayHtGet8BppmaskPalette(ppaletteentry.rawAddress.toCPointer<ByteVar>(), use8bppmaskpal, cmymask, redgamma, greengamma, bluegamma)

public actual fun pathobjBEnum(ppo: MutPtr<Pathobj>, ppd: MutPtr<Pathdata>): Bool =
    windowssysWindowsWin32DevicesDisplayPathobjBEnum(ppo.rawAddress.toCPointer<ByteVar>(), ppd.rawAddress.toCPointer<ByteVar>())

public actual fun pathobjBEnumClipLines(ppo: MutPtr<Pathobj>, cb: UInt, pcl: MutPtr<Clipline>): Bool =
    windowssysWindowsWin32DevicesDisplayPathobjBEnumClipLines(ppo.rawAddress.toCPointer<ByteVar>(), cb, pcl.rawAddress.toCPointer<ByteVar>())

public actual fun pathobjVEnumStart(ppo: MutPtr<Pathobj>) {
    windowssysWindowsWin32DevicesDisplayPathobjVEnumStart(ppo.rawAddress.toCPointer<ByteVar>())
}

public actual fun pathobjVEnumStartClipLines(ppo: MutPtr<Pathobj>, pco: MutPtr<Clipobj>, pso: MutPtr<Surfobj>, pla: MutPtr<Lineattrs>) {
    windowssysWindowsWin32DevicesDisplayPathobjVEnumStartClipLines(ppo.rawAddress.toCPointer<ByteVar>(), pco.rawAddress.toCPointer<ByteVar>(), pso.rawAddress.toCPointer<ByteVar>(), pla.rawAddress.toCPointer<ByteVar>())
}

public actual fun pathobjVGetBounds(ppo: MutPtr<Pathobj>, prectfx: MutPtr<Rectfx>) {
    windowssysWindowsWin32DevicesDisplayPathobjVGetBounds(ppo.rawAddress.toCPointer<ByteVar>(), prectfx.rawAddress.toCPointer<ByteVar>())
}

public actual fun queryDisplayConfig(flags: QueryDisplayConfigFlags, numpatharrayelements: MutPtr<UInt>, patharray: MutPtr<DisplayconfigPathInfo>, nummodeinfoarrayelements: MutPtr<UInt>, modeinfoarray: MutPtr<DisplayconfigModeInfo>, currenttopologyid: MutPtr<DisplayconfigTopologyId>): Win32Error =
    windowssysWindowsWin32DevicesDisplayQueryDisplayConfig(flags, numpatharrayelements.rawAddress.toCPointer<ByteVar>(), patharray.rawAddress.toCPointer<ByteVar>(), nummodeinfoarrayelements.rawAddress.toCPointer<ByteVar>(), modeinfoarray.rawAddress.toCPointer<ByteVar>(), currenttopologyid.rawAddress.toCPointer<ByteVar>())

public actual fun restoreMonitorFactoryColorDefaults(hmonitor: Handle): Int =
    windowssysWindowsWin32DevicesDisplayRestoreMonitorFactoryColorDefaults(hmonitor.rawAddress.toCPointer<ByteVar>())

public actual fun restoreMonitorFactoryDefaults(hmonitor: Handle): Int =
    windowssysWindowsWin32DevicesDisplayRestoreMonitorFactoryDefaults(hmonitor.rawAddress.toCPointer<ByteVar>())

public actual fun strobjBEnum(pstro: MutPtr<Strobj>, pc: MutPtr<UInt>, ppgpos: MutPtr<MutPtr<Glyphpos>>): Bool =
    windowssysWindowsWin32DevicesDisplayStrobjBEnum(pstro.rawAddress.toCPointer<ByteVar>(), pc.rawAddress.toCPointer<ByteVar>(), ppgpos.rawAddress.toCPointer<ByteVar>())

public actual fun strobjBEnumPositionsOnly(pstro: MutPtr<Strobj>, pc: MutPtr<UInt>, ppgpos: MutPtr<MutPtr<Glyphpos>>): Bool =
    windowssysWindowsWin32DevicesDisplayStrobjBEnumPositionsOnly(pstro.rawAddress.toCPointer<ByteVar>(), pc.rawAddress.toCPointer<ByteVar>(), ppgpos.rawAddress.toCPointer<ByteVar>())

public actual fun strobjBGetAdvanceWidths(pso: MutPtr<Strobj>, ifirst: UInt, c: UInt, pptqd: MutPtr<Pointqf>): Bool =
    windowssysWindowsWin32DevicesDisplayStrobjBGetAdvanceWidths(pso.rawAddress.toCPointer<ByteVar>(), ifirst, c, pptqd.rawAddress.toCPointer<ByteVar>())

public actual fun strobjDwGetCodePage(pstro: MutPtr<Strobj>): UInt =
    windowssysWindowsWin32DevicesDisplayStrobjDwGetCodePage(pstro.rawAddress.toCPointer<ByteVar>())

public actual fun strobjVEnumStart(pstro: MutPtr<Strobj>) {
    windowssysWindowsWin32DevicesDisplayStrobjVEnumStart(pstro.rawAddress.toCPointer<ByteVar>())
}

public actual fun saveCurrentMonitorSettings(hmonitor: Handle): Int =
    windowssysWindowsWin32DevicesDisplaySaveCurrentMonitorSettings(hmonitor.rawAddress.toCPointer<ByteVar>())

public actual fun saveCurrentSettings(hmonitor: Handle): Int =
    windowssysWindowsWin32DevicesDisplaySaveCurrentSettings(hmonitor.rawAddress.toCPointer<ByteVar>())

public actual fun setDisplayAutoRotationPreferences(orientation: OrientationPreference): Bool =
    windowssysWindowsWin32DevicesDisplaySetDisplayAutoRotationPreferences(orientation)

public actual fun setDisplayConfig(numpatharrayelements: UInt, patharray: ConstPtr<DisplayconfigPathInfo>, nummodeinfoarrayelements: UInt, modeinfoarray: ConstPtr<DisplayconfigModeInfo>, flags: SetDisplayConfigFlags): Int =
    windowssysWindowsWin32DevicesDisplaySetDisplayConfig(numpatharrayelements, patharray.rawAddress.toCPointer<ByteVar>(), nummodeinfoarrayelements, modeinfoarray.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun setMonitorBrightness(hmonitor: Handle, dwnewbrightness: UInt): Int =
    windowssysWindowsWin32DevicesDisplaySetMonitorBrightness(hmonitor.rawAddress.toCPointer<ByteVar>(), dwnewbrightness)

public actual fun setMonitorColorTemperature(hmonitor: Handle, ctcurrentcolortemperature: McColorTemperature): Int =
    windowssysWindowsWin32DevicesDisplaySetMonitorColorTemperature(hmonitor.rawAddress.toCPointer<ByteVar>(), ctcurrentcolortemperature)

public actual fun setMonitorContrast(hmonitor: Handle, dwnewcontrast: UInt): Int =
    windowssysWindowsWin32DevicesDisplaySetMonitorContrast(hmonitor.rawAddress.toCPointer<ByteVar>(), dwnewcontrast)

public actual fun setMonitorDisplayAreaPosition(hmonitor: Handle, ptpositiontype: McPositionType, dwnewposition: UInt): Int =
    windowssysWindowsWin32DevicesDisplaySetMonitorDisplayAreaPosition(hmonitor.rawAddress.toCPointer<ByteVar>(), ptpositiontype, dwnewposition)

public actual fun setMonitorDisplayAreaSize(hmonitor: Handle, stsizetype: McSizeType, dwnewdisplayareawidthorheight: UInt): Int =
    windowssysWindowsWin32DevicesDisplaySetMonitorDisplayAreaSize(hmonitor.rawAddress.toCPointer<ByteVar>(), stsizetype, dwnewdisplayareawidthorheight)

public actual fun setMonitorRedGreenOrBlueDrive(hmonitor: Handle, dtdrivetype: McDriveType, dwnewdrive: UInt): Int =
    windowssysWindowsWin32DevicesDisplaySetMonitorRedGreenOrBlueDrive(hmonitor.rawAddress.toCPointer<ByteVar>(), dtdrivetype, dwnewdrive)

public actual fun setMonitorRedGreenOrBlueGain(hmonitor: Handle, gtgaintype: McGainType, dwnewgain: UInt): Int =
    windowssysWindowsWin32DevicesDisplaySetMonitorRedGreenOrBlueGain(hmonitor.rawAddress.toCPointer<ByteVar>(), gtgaintype, dwnewgain)

public actual fun setVCPFeature(hmonitor: Handle, bvcpcode: UByte, dwnewvalue: UInt): Int =
    windowssysWindowsWin32DevicesDisplaySetVCPFeature(hmonitor.rawAddress.toCPointer<ByteVar>(), bvcpcode, dwnewvalue)

public actual fun xformobjBApplyXform(pxo: MutPtr<Xformobj>, imode: UInt, cpoints: UInt, pvin: MutPtr<CVoid>, pvout: MutPtr<CVoid>): Bool =
    windowssysWindowsWin32DevicesDisplayXformobjBApplyXform(pxo.rawAddress.toCPointer<ByteVar>(), imode, cpoints, pvin.rawAddress.toCPointer<ByteVar>(), pvout.rawAddress.toCPointer<ByteVar>())

public actual fun xformobjIGetXform(pxo: ConstPtr<Xformobj>, pxform: MutPtr<Xforml>): UInt =
    windowssysWindowsWin32DevicesDisplayXformobjIGetXform(pxo.rawAddress.toCPointer<ByteVar>(), pxform.rawAddress.toCPointer<ByteVar>())

public actual fun xlateobjCGetPalette(pxlo: MutPtr<Xlateobj>, ipal: UInt, cpal: UInt, ppal: MutPtr<UInt>): UInt =
    windowssysWindowsWin32DevicesDisplayXlateobjCGetPalette(pxlo.rawAddress.toCPointer<ByteVar>(), ipal, cpal, ppal.rawAddress.toCPointer<ByteVar>())

public actual fun xlateobjHGetColorTransform(pxlo: MutPtr<Xlateobj>): Handle =
    MutPtr(windowssysWindowsWin32DevicesDisplayXlateobjHGetColorTransform(pxlo.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun xlateobjIXlate(pxlo: MutPtr<Xlateobj>, icolor: UInt): UInt =
    windowssysWindowsWin32DevicesDisplayXlateobjIXlate(pxlo.rawAddress.toCPointer<ByteVar>(), icolor)

public actual fun xlateobjPiVector(pxlo: MutPtr<Xlateobj>): MutPtr<UInt> =
    MutPtr(windowssysWindowsWin32DevicesDisplayXlateobjPiVector(pxlo.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)
