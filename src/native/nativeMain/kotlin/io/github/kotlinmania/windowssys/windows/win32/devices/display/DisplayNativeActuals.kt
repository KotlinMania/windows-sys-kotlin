@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.display

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_brushobjHGetColorTransform
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_brushobjPvAllocRbrush
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_brushobjPvGetRbrush
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_brushobjUlGetBrushColor
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_capabilitiesRequestAndCapabilitiesReply
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_clipobjBEnum
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_clipobjCEnumStart
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_clipobjPpoGetPath
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_degaussMonitor
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_destroyPhysicalMonitor
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_destroyPhysicalMonitors
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_displayConfigGetDeviceInfo
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_displayConfigSetDeviceInfo
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engAcquireSemaphore
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engAlphaBlend
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engAssociateSurface
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engBitBlt
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engCheckAbort
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engComputeGlyphSet
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engCopyBits
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engCreateClip
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engCreatePalette
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engCreateSemaphore
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engDeleteClip
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engDeletePalette
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engDeletePath
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engDeleteSemaphore
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engDeleteSurface
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engEraseSurface
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engFillPath
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engFindResource
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engFreeModule
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engGetCurrentCodePage
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engGetDriverName
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engGetPrinterDataFileName
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engGradientFill
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engLineTo
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engLoadModule
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engLockSurface
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engMarkBandingSurface
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engMultiByteToUnicodeN
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engMultiByteToWideChar
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engPaint
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engPlgBlt
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engQueryEMFInfo
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engQueryLocalTime
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engReleaseSemaphore
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engStretchBlt
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engStretchBltROP
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engStrokeAndFillPath
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engStrokePath
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engTextOut
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engTransparentBlt
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engUnicodeToMultiByteN
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engUnlockSurface
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_engWideCharToMultiByte
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_fontobjCGetAllGlyphHandles
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_fontobjCGetGlyphs
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_fontobjPQueryGlyphAttrs
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_fontobjPfdg
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_fontobjPifi
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_fontobjPvTrueTypeFontFile
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_fontobjPxoGetXform
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_fontobjVGetInfo
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getAutoRotationState
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getCapabilitiesStringLength
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getDisplayAutoRotationPreferences
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getDisplayConfigBufferSizes
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getMonitorBrightness
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getMonitorCapabilities
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getMonitorColorTemperature
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getMonitorContrast
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getMonitorDisplayAreaPosition
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getMonitorDisplayAreaSize
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getMonitorRedGreenOrBlueDrive
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getMonitorRedGreenOrBlueGain
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getMonitorTechnologyType
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getNumberOfPhysicalMonitorsFromHMONITOR
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getPhysicalMonitorsFromHMONITOR
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getTimingReport
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_getVCPFeatureAndVCPFeatureReply
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_htGet8BppformatPalette
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_htGet8BppmaskPalette
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_pathobjBEnum
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_pathobjBEnumClipLines
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_pathobjVEnumStart
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_pathobjVEnumStartClipLines
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_pathobjVGetBounds
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_queryDisplayConfig
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_restoreMonitorFactoryColorDefaults
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_restoreMonitorFactoryDefaults
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_saveCurrentMonitorSettings
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_saveCurrentSettings
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_setDisplayAutoRotationPreferences
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_setDisplayConfig
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_setMonitorBrightness
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_setMonitorColorTemperature
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_setMonitorContrast
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_setMonitorDisplayAreaPosition
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_setMonitorDisplayAreaSize
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_setMonitorRedGreenOrBlueDrive
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_setMonitorRedGreenOrBlueGain
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_setVCPFeature
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_strobjBEnum
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_strobjBEnumPositionsOnly
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_strobjBGetAdvanceWidths
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_strobjDwGetCodePage
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_strobjVEnumStart
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_xformobjBApplyXform
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_xformobjIGetXform
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_xlateobjCGetPalette
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_xlateobjHGetColorTransform
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_xlateobjIXlate
import io.github.kotlinmania.windowssys.windows.win32.devices.display.cinterop.windowssys_windows_win32_devices_display_xlateobjPiVector
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Size
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hbitmap
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hmonitor
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hpalette
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun brushobjHGetColorTransform(pbo: COpaquePointer?): Handle =
    windowssys_windows_win32_devices_display_brushobjHGetColorTransform(pbo?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun brushobjPvAllocRbrush(pbo: COpaquePointer?, cj: UInt): COpaquePointer? =
    windowssys_windows_win32_devices_display_brushobjPvAllocRbrush(pbo?.value?.toCPointer<ByteVar>(), cj)?.let { COpaquePointer(it.toLong()) }

public actual fun brushobjPvGetRbrush(pbo: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_devices_display_brushobjPvGetRbrush(pbo?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun brushobjUlGetBrushColor(pbo: COpaquePointer?): UInt =
    windowssys_windows_win32_devices_display_brushobjUlGetBrushColor(pbo?.value?.toCPointer<ByteVar>())

public actual fun clipobjBEnum(pco: COpaquePointer?, cj: UInt, pul: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_display_clipobjBEnum(pco?.value?.toCPointer<ByteVar>(), cj, pul?.value?.toCPointer<ByteVar>())

public actual fun clipobjCEnumStart(pco: COpaquePointer?, ball: Bool, itype: UInt, idirection: UInt, climit: UInt): UInt =
    windowssys_windows_win32_devices_display_clipobjCEnumStart(pco?.value?.toCPointer<ByteVar>(), ball, itype, idirection, climit)

public actual fun clipobjPpoGetPath(pco: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_devices_display_clipobjPpoGetPath(pco?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun capabilitiesRequestAndCapabilitiesReply(hmonitor: Handle, pszasciicapabilitiesstring: Pstr, dwcapabilitiesstringlengthincharacters: UInt): Int =
    windowssys_windows_win32_devices_display_capabilitiesRequestAndCapabilitiesReply(hmonitor?.value?.toCPointer<ByteVar>(), pszasciicapabilitiesstring?.value?.toCPointer<ByteVar>(), dwcapabilitiesstringlengthincharacters)

public actual fun degaussMonitor(hmonitor: Handle): Int =
    windowssys_windows_win32_devices_display_degaussMonitor(hmonitor?.value?.toCPointer<ByteVar>())

public actual fun destroyPhysicalMonitor(hmonitor: Handle): Bool =
    windowssys_windows_win32_devices_display_destroyPhysicalMonitor(hmonitor?.value?.toCPointer<ByteVar>())

public actual fun destroyPhysicalMonitors(dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_display_destroyPhysicalMonitors(dwphysicalmonitorarraysize, pphysicalmonitorarray?.value?.toCPointer<ByteVar>())

public actual fun displayConfigGetDeviceInfo(requestpacket: COpaquePointer?): Int =
    windowssys_windows_win32_devices_display_displayConfigGetDeviceInfo(requestpacket?.value?.toCPointer<ByteVar>())

public actual fun displayConfigSetDeviceInfo(setpacket: COpaquePointer?): Int =
    windowssys_windows_win32_devices_display_displayConfigSetDeviceInfo(setpacket?.value?.toCPointer<ByteVar>())

public actual fun engAcquireSemaphore(hsem: Hsemaphore) {
    windowssys_windows_win32_devices_display_engAcquireSemaphore(hsem?.value?.toCPointer<ByteVar>())
}

public actual fun engAlphaBlend(psodest: COpaquePointer?, psosrc: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, prcldest: COpaquePointer?, prclsrc: COpaquePointer?, pblendobj: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_display_engAlphaBlend(psodest?.value?.toCPointer<ByteVar>(), psosrc?.value?.toCPointer<ByteVar>(), pco?.value?.toCPointer<ByteVar>(), pxlo?.value?.toCPointer<ByteVar>(), prcldest?.value?.toCPointer<ByteVar>(), prclsrc?.value?.toCPointer<ByteVar>(), pblendobj?.value?.toCPointer<ByteVar>())

public actual fun engAssociateSurface(hsurf: Hsurf, hdev: Hdev, flhooks: UInt): Bool =
    windowssys_windows_win32_devices_display_engAssociateSurface(hsurf?.value?.toCPointer<ByteVar>(), hdev?.value?.toCPointer<ByteVar>(), flhooks)

public actual fun engBitBlt(psotrg: COpaquePointer?, psosrc: COpaquePointer?, psomask: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, prcltrg: COpaquePointer?, pptlsrc: COpaquePointer?, pptlmask: COpaquePointer?, pbo: COpaquePointer?, pptlbrush: COpaquePointer?, rop4: UInt): Bool =
    windowssys_windows_win32_devices_display_engBitBlt(psotrg?.value?.toCPointer<ByteVar>(), psosrc?.value?.toCPointer<ByteVar>(), psomask?.value?.toCPointer<ByteVar>(), pco?.value?.toCPointer<ByteVar>(), pxlo?.value?.toCPointer<ByteVar>(), prcltrg?.value?.toCPointer<ByteVar>(), pptlsrc?.value?.toCPointer<ByteVar>(), pptlmask?.value?.toCPointer<ByteVar>(), pbo?.value?.toCPointer<ByteVar>(), pptlbrush?.value?.toCPointer<ByteVar>(), rop4)

public actual fun engCheckAbort(pso: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_display_engCheckAbort(pso?.value?.toCPointer<ByteVar>())

public actual fun engComputeGlyphSet(ncodepage: Int, nfirstchar: Int, cchars: Int): COpaquePointer? =
    windowssys_windows_win32_devices_display_engComputeGlyphSet(ncodepage, nfirstchar, cchars)?.let { COpaquePointer(it.toLong()) }

public actual fun engCopyBits(psodest: COpaquePointer?, psosrc: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, prcldest: COpaquePointer?, pptlsrc: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_display_engCopyBits(psodest?.value?.toCPointer<ByteVar>(), psosrc?.value?.toCPointer<ByteVar>(), pco?.value?.toCPointer<ByteVar>(), pxlo?.value?.toCPointer<ByteVar>(), prcldest?.value?.toCPointer<ByteVar>(), pptlsrc?.value?.toCPointer<ByteVar>())

public actual fun engCreateBitmap(sizl: Size, lwidth: Int, iformat: UInt, fl: UInt, pvbits: COpaquePointer?): Hbitmap =
    null

public actual fun engCreateClip(): COpaquePointer? =
    windowssys_windows_win32_devices_display_engCreateClip()?.let { COpaquePointer(it.toLong()) }

public actual fun engCreateDeviceBitmap(dhsurf: Dhsurf, sizl: Size, iformatcompat: UInt): Hbitmap =
    null

public actual fun engCreateDeviceSurface(dhsurf: Dhsurf, sizl: Size, iformatcompat: UInt): Hsurf =
    null

public actual fun engCreatePalette(imode: UInt, ccolors: UInt, pulcolors: COpaquePointer?, flred: UInt, flgreen: UInt, flblue: UInt): Hpalette =
    windowssys_windows_win32_devices_display_engCreatePalette(imode, ccolors, pulcolors?.value?.toCPointer<ByteVar>(), flred, flgreen, flblue)?.let { COpaquePointer(it.toLong()) }

public actual fun engCreateSemaphore(): Hsemaphore =
    windowssys_windows_win32_devices_display_engCreateSemaphore()?.let { COpaquePointer(it.toLong()) }

public actual fun engDeleteClip(pco: COpaquePointer?) {
    windowssys_windows_win32_devices_display_engDeleteClip(pco?.value?.toCPointer<ByteVar>())
}

public actual fun engDeletePalette(hpal: Hpalette): Bool =
    windowssys_windows_win32_devices_display_engDeletePalette(hpal?.value?.toCPointer<ByteVar>())

public actual fun engDeletePath(ppo: COpaquePointer?) {
    windowssys_windows_win32_devices_display_engDeletePath(ppo?.value?.toCPointer<ByteVar>())
}

public actual fun engDeleteSemaphore(hsem: Hsemaphore) {
    windowssys_windows_win32_devices_display_engDeleteSemaphore(hsem?.value?.toCPointer<ByteVar>())
}

public actual fun engDeleteSurface(hsurf: Hsurf): Bool =
    windowssys_windows_win32_devices_display_engDeleteSurface(hsurf?.value?.toCPointer<ByteVar>())

public actual fun engEraseSurface(pso: COpaquePointer?, prcl: COpaquePointer?, icolor: UInt): Bool =
    windowssys_windows_win32_devices_display_engEraseSurface(pso?.value?.toCPointer<ByteVar>(), prcl?.value?.toCPointer<ByteVar>(), icolor)

public actual fun engFillPath(pso: COpaquePointer?, ppo: COpaquePointer?, pco: COpaquePointer?, pbo: COpaquePointer?, pptlbrushorg: COpaquePointer?, mix: UInt, floptions: UInt): Bool =
    windowssys_windows_win32_devices_display_engFillPath(pso?.value?.toCPointer<ByteVar>(), ppo?.value?.toCPointer<ByteVar>(), pco?.value?.toCPointer<ByteVar>(), pbo?.value?.toCPointer<ByteVar>(), pptlbrushorg?.value?.toCPointer<ByteVar>(), mix, floptions)

public actual fun engFindResource(h: Handle, iname: Int, itype: Int, pulsize: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_devices_display_engFindResource(h?.value?.toCPointer<ByteVar>(), iname, itype, pulsize?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun engFreeModule(h: Handle) {
    windowssys_windows_win32_devices_display_engFreeModule(h?.value?.toCPointer<ByteVar>())
}

public actual fun engGetCurrentCodePage(oemcodepage: COpaquePointer?, ansicodepage: COpaquePointer?) {
    windowssys_windows_win32_devices_display_engGetCurrentCodePage(oemcodepage?.value?.toCPointer<ByteVar>(), ansicodepage?.value?.toCPointer<ByteVar>())
}

public actual fun engGetDriverName(hdev: Hdev): Pwstr =
    windowssys_windows_win32_devices_display_engGetDriverName(hdev?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun engGetPrinterDataFileName(hdev: Hdev): Pwstr =
    windowssys_windows_win32_devices_display_engGetPrinterDataFileName(hdev?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun engGradientFill(psodest: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, pvertex: COpaquePointer?, nvertex: UInt, pmesh: COpaquePointer?, nmesh: UInt, prclextents: COpaquePointer?, pptlditherorg: COpaquePointer?, ulmode: UInt): Bool =
    windowssys_windows_win32_devices_display_engGradientFill(psodest?.value?.toCPointer<ByteVar>(), pco?.value?.toCPointer<ByteVar>(), pxlo?.value?.toCPointer<ByteVar>(), pvertex?.value?.toCPointer<ByteVar>(), nvertex, pmesh?.value?.toCPointer<ByteVar>(), nmesh, prclextents?.value?.toCPointer<ByteVar>(), pptlditherorg?.value?.toCPointer<ByteVar>(), ulmode)

public actual fun engLineTo(pso: COpaquePointer?, pco: COpaquePointer?, pbo: COpaquePointer?, x1: Int, y1: Int, x2: Int, y2: Int, prclbounds: COpaquePointer?, mix: UInt): Bool =
    windowssys_windows_win32_devices_display_engLineTo(pso?.value?.toCPointer<ByteVar>(), pco?.value?.toCPointer<ByteVar>(), pbo?.value?.toCPointer<ByteVar>(), x1, y1, x2, y2, prclbounds?.value?.toCPointer<ByteVar>(), mix)

public actual fun engLoadModule(pwsz: Pcwstr): Handle =
    windowssys_windows_win32_devices_display_engLoadModule(pwsz?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun engLockSurface(hsurf: Hsurf): COpaquePointer? =
    windowssys_windows_win32_devices_display_engLockSurface(hsurf?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun engMarkBandingSurface(hsurf: Hsurf): Bool =
    windowssys_windows_win32_devices_display_engMarkBandingSurface(hsurf?.value?.toCPointer<ByteVar>())

public actual fun engMultiByteToUnicodeN(unicodestring: Pwstr, maxbytesinunicodestring: UInt, bytesinunicodestring: COpaquePointer?, multibytestring: Pcstr, bytesinmultibytestring: UInt) {
    windowssys_windows_win32_devices_display_engMultiByteToUnicodeN(unicodestring?.value?.toCPointer<ByteVar>(), maxbytesinunicodestring, bytesinunicodestring?.value?.toCPointer<ByteVar>(), multibytestring?.value?.toCPointer<ByteVar>(), bytesinmultibytestring)
}

public actual fun engMultiByteToWideChar(codepage: UInt, widecharstring: Pwstr, bytesinwidecharstring: Int, multibytestring: Pcstr, bytesinmultibytestring: Int): Int =
    windowssys_windows_win32_devices_display_engMultiByteToWideChar(codepage, widecharstring?.value?.toCPointer<ByteVar>(), bytesinwidecharstring, multibytestring?.value?.toCPointer<ByteVar>(), bytesinmultibytestring)

public actual fun engPaint(pso: COpaquePointer?, pco: COpaquePointer?, pbo: COpaquePointer?, pptlbrushorg: COpaquePointer?, mix: UInt): Bool =
    windowssys_windows_win32_devices_display_engPaint(pso?.value?.toCPointer<ByteVar>(), pco?.value?.toCPointer<ByteVar>(), pbo?.value?.toCPointer<ByteVar>(), pptlbrushorg?.value?.toCPointer<ByteVar>(), mix)

public actual fun engPlgBlt(psotrg: COpaquePointer?, psosrc: COpaquePointer?, psomsk: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, pca: COpaquePointer?, pptlbrushorg: COpaquePointer?, pptfx: COpaquePointer?, prcl: COpaquePointer?, pptl: COpaquePointer?, imode: UInt): Bool =
    windowssys_windows_win32_devices_display_engPlgBlt(psotrg?.value?.toCPointer<ByteVar>(), psosrc?.value?.toCPointer<ByteVar>(), psomsk?.value?.toCPointer<ByteVar>(), pco?.value?.toCPointer<ByteVar>(), pxlo?.value?.toCPointer<ByteVar>(), pca?.value?.toCPointer<ByteVar>(), pptlbrushorg?.value?.toCPointer<ByteVar>(), pptfx?.value?.toCPointer<ByteVar>(), prcl?.value?.toCPointer<ByteVar>(), pptl?.value?.toCPointer<ByteVar>(), imode)

public actual fun engQueryEMFInfo(hdev: Hdev, pemfinfo: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_display_engQueryEMFInfo(hdev?.value?.toCPointer<ByteVar>(), pemfinfo?.value?.toCPointer<ByteVar>())

public actual fun engQueryLocalTime(param0: COpaquePointer?) {
    windowssys_windows_win32_devices_display_engQueryLocalTime(param0?.value?.toCPointer<ByteVar>())
}

public actual fun engReleaseSemaphore(hsem: Hsemaphore) {
    windowssys_windows_win32_devices_display_engReleaseSemaphore(hsem?.value?.toCPointer<ByteVar>())
}

public actual fun engStretchBlt(psodest: COpaquePointer?, psosrc: COpaquePointer?, psomask: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, pca: COpaquePointer?, pptlhtorg: COpaquePointer?, prcldest: COpaquePointer?, prclsrc: COpaquePointer?, pptlmask: COpaquePointer?, imode: UInt): Bool =
    windowssys_windows_win32_devices_display_engStretchBlt(psodest?.value?.toCPointer<ByteVar>(), psosrc?.value?.toCPointer<ByteVar>(), psomask?.value?.toCPointer<ByteVar>(), pco?.value?.toCPointer<ByteVar>(), pxlo?.value?.toCPointer<ByteVar>(), pca?.value?.toCPointer<ByteVar>(), pptlhtorg?.value?.toCPointer<ByteVar>(), prcldest?.value?.toCPointer<ByteVar>(), prclsrc?.value?.toCPointer<ByteVar>(), pptlmask?.value?.toCPointer<ByteVar>(), imode)

public actual fun engStretchBltROP(psodest: COpaquePointer?, psosrc: COpaquePointer?, psomask: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, pca: COpaquePointer?, pptlhtorg: COpaquePointer?, prcldest: COpaquePointer?, prclsrc: COpaquePointer?, pptlmask: COpaquePointer?, imode: UInt, pbo: COpaquePointer?, rop4: UInt): Bool =
    windowssys_windows_win32_devices_display_engStretchBltROP(psodest?.value?.toCPointer<ByteVar>(), psosrc?.value?.toCPointer<ByteVar>(), psomask?.value?.toCPointer<ByteVar>(), pco?.value?.toCPointer<ByteVar>(), pxlo?.value?.toCPointer<ByteVar>(), pca?.value?.toCPointer<ByteVar>(), pptlhtorg?.value?.toCPointer<ByteVar>(), prcldest?.value?.toCPointer<ByteVar>(), prclsrc?.value?.toCPointer<ByteVar>(), pptlmask?.value?.toCPointer<ByteVar>(), imode, pbo?.value?.toCPointer<ByteVar>(), rop4)

public actual fun engStrokeAndFillPath(pso: COpaquePointer?, ppo: COpaquePointer?, pco: COpaquePointer?, pxo: COpaquePointer?, pbostroke: COpaquePointer?, plineattrs: COpaquePointer?, pbofill: COpaquePointer?, pptlbrushorg: COpaquePointer?, mixfill: UInt, floptions: UInt): Bool =
    windowssys_windows_win32_devices_display_engStrokeAndFillPath(pso?.value?.toCPointer<ByteVar>(), ppo?.value?.toCPointer<ByteVar>(), pco?.value?.toCPointer<ByteVar>(), pxo?.value?.toCPointer<ByteVar>(), pbostroke?.value?.toCPointer<ByteVar>(), plineattrs?.value?.toCPointer<ByteVar>(), pbofill?.value?.toCPointer<ByteVar>(), pptlbrushorg?.value?.toCPointer<ByteVar>(), mixfill, floptions)

public actual fun engStrokePath(pso: COpaquePointer?, ppo: COpaquePointer?, pco: COpaquePointer?, pxo: COpaquePointer?, pbo: COpaquePointer?, pptlbrushorg: COpaquePointer?, plineattrs: COpaquePointer?, mix: UInt): Bool =
    windowssys_windows_win32_devices_display_engStrokePath(pso?.value?.toCPointer<ByteVar>(), ppo?.value?.toCPointer<ByteVar>(), pco?.value?.toCPointer<ByteVar>(), pxo?.value?.toCPointer<ByteVar>(), pbo?.value?.toCPointer<ByteVar>(), pptlbrushorg?.value?.toCPointer<ByteVar>(), plineattrs?.value?.toCPointer<ByteVar>(), mix)

public actual fun engTextOut(pso: COpaquePointer?, pstro: COpaquePointer?, pfo: COpaquePointer?, pco: COpaquePointer?, prclextra: COpaquePointer?, prclopaque: COpaquePointer?, pbofore: COpaquePointer?, pboopaque: COpaquePointer?, pptlorg: COpaquePointer?, mix: UInt): Bool =
    windowssys_windows_win32_devices_display_engTextOut(pso?.value?.toCPointer<ByteVar>(), pstro?.value?.toCPointer<ByteVar>(), pfo?.value?.toCPointer<ByteVar>(), pco?.value?.toCPointer<ByteVar>(), prclextra?.value?.toCPointer<ByteVar>(), prclopaque?.value?.toCPointer<ByteVar>(), pbofore?.value?.toCPointer<ByteVar>(), pboopaque?.value?.toCPointer<ByteVar>(), pptlorg?.value?.toCPointer<ByteVar>(), mix)

public actual fun engTransparentBlt(psodst: COpaquePointer?, psosrc: COpaquePointer?, pco: COpaquePointer?, pxlo: COpaquePointer?, prcldst: COpaquePointer?, prclsrc: COpaquePointer?, transcolor: UInt, bcalledfrombitblt: UInt): Bool =
    windowssys_windows_win32_devices_display_engTransparentBlt(psodst?.value?.toCPointer<ByteVar>(), psosrc?.value?.toCPointer<ByteVar>(), pco?.value?.toCPointer<ByteVar>(), pxlo?.value?.toCPointer<ByteVar>(), prcldst?.value?.toCPointer<ByteVar>(), prclsrc?.value?.toCPointer<ByteVar>(), transcolor, bcalledfrombitblt)

public actual fun engUnicodeToMultiByteN(multibytestring: Pstr, maxbytesinmultibytestring: UInt, bytesinmultibytestring: COpaquePointer?, unicodestring: Pcwstr, bytesinunicodestring: UInt) {
    windowssys_windows_win32_devices_display_engUnicodeToMultiByteN(multibytestring?.value?.toCPointer<ByteVar>(), maxbytesinmultibytestring, bytesinmultibytestring?.value?.toCPointer<ByteVar>(), unicodestring?.value?.toCPointer<ByteVar>(), bytesinunicodestring)
}

public actual fun engUnlockSurface(pso: COpaquePointer?) {
    windowssys_windows_win32_devices_display_engUnlockSurface(pso?.value?.toCPointer<ByteVar>())
}

public actual fun engWideCharToMultiByte(codepage: UInt, widecharstring: Pcwstr, bytesinwidecharstring: Int, multibytestring: Pstr, bytesinmultibytestring: Int): Int =
    windowssys_windows_win32_devices_display_engWideCharToMultiByte(codepage, widecharstring?.value?.toCPointer<ByteVar>(), bytesinwidecharstring, multibytestring?.value?.toCPointer<ByteVar>(), bytesinmultibytestring)

public actual fun fontobjCGetAllGlyphHandles(pfo: COpaquePointer?, phg: COpaquePointer?): UInt =
    windowssys_windows_win32_devices_display_fontobjCGetAllGlyphHandles(pfo?.value?.toCPointer<ByteVar>(), phg?.value?.toCPointer<ByteVar>())

public actual fun fontobjCGetGlyphs(pfo: COpaquePointer?, imode: UInt, cglyph: UInt, phg: COpaquePointer?, ppvglyph: COpaquePointer?): UInt =
    windowssys_windows_win32_devices_display_fontobjCGetGlyphs(pfo?.value?.toCPointer<ByteVar>(), imode, cglyph, phg?.value?.toCPointer<ByteVar>(), ppvglyph?.value?.toCPointer<ByteVar>())

public actual fun fontobjPQueryGlyphAttrs(pfo: COpaquePointer?, imode: UInt): COpaquePointer? =
    windowssys_windows_win32_devices_display_fontobjPQueryGlyphAttrs(pfo?.value?.toCPointer<ByteVar>(), imode)?.let { COpaquePointer(it.toLong()) }

public actual fun fontobjPfdg(pfo: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_devices_display_fontobjPfdg(pfo?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fontobjPifi(pfo: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_devices_display_fontobjPifi(pfo?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fontobjPvTrueTypeFontFile(pfo: COpaquePointer?, pcjfile: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_devices_display_fontobjPvTrueTypeFontFile(pfo?.value?.toCPointer<ByteVar>(), pcjfile?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fontobjPxoGetXform(pfo: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_devices_display_fontobjPxoGetXform(pfo?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fontobjVGetInfo(pfo: COpaquePointer?, cjsize: UInt, pfi: COpaquePointer?) {
    windowssys_windows_win32_devices_display_fontobjVGetInfo(pfo?.value?.toCPointer<ByteVar>(), cjsize, pfi?.value?.toCPointer<ByteVar>())
}

public actual fun getAutoRotationState(pstate: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_display_getAutoRotationState(pstate?.value?.toCPointer<ByteVar>())

public actual fun getCapabilitiesStringLength(hmonitor: Handle, pdwcapabilitiesstringlengthincharacters: COpaquePointer?): Int =
    windowssys_windows_win32_devices_display_getCapabilitiesStringLength(hmonitor?.value?.toCPointer<ByteVar>(), pdwcapabilitiesstringlengthincharacters?.value?.toCPointer<ByteVar>())

public actual fun getDisplayAutoRotationPreferences(porientation: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_display_getDisplayAutoRotationPreferences(porientation?.value?.toCPointer<ByteVar>())

public actual fun getDisplayConfigBufferSizes(flags: QueryDisplayConfigFlags, numpatharrayelements: COpaquePointer?, nummodeinfoarrayelements: COpaquePointer?): Win32Error =
    windowssys_windows_win32_devices_display_getDisplayConfigBufferSizes(flags, numpatharrayelements?.value?.toCPointer<ByteVar>(), nummodeinfoarrayelements?.value?.toCPointer<ByteVar>())

public actual fun getMonitorBrightness(hmonitor: Handle, pdwminimumbrightness: COpaquePointer?, pdwcurrentbrightness: COpaquePointer?, pdwmaximumbrightness: COpaquePointer?): Int =
    windowssys_windows_win32_devices_display_getMonitorBrightness(hmonitor?.value?.toCPointer<ByteVar>(), pdwminimumbrightness?.value?.toCPointer<ByteVar>(), pdwcurrentbrightness?.value?.toCPointer<ByteVar>(), pdwmaximumbrightness?.value?.toCPointer<ByteVar>())

public actual fun getMonitorCapabilities(hmonitor: Handle, pdwmonitorcapabilities: COpaquePointer?, pdwsupportedcolortemperatures: COpaquePointer?): Int =
    windowssys_windows_win32_devices_display_getMonitorCapabilities(hmonitor?.value?.toCPointer<ByteVar>(), pdwmonitorcapabilities?.value?.toCPointer<ByteVar>(), pdwsupportedcolortemperatures?.value?.toCPointer<ByteVar>())

public actual fun getMonitorColorTemperature(hmonitor: Handle, pctcurrentcolortemperature: COpaquePointer?): Int =
    windowssys_windows_win32_devices_display_getMonitorColorTemperature(hmonitor?.value?.toCPointer<ByteVar>(), pctcurrentcolortemperature?.value?.toCPointer<ByteVar>())

public actual fun getMonitorContrast(hmonitor: Handle, pdwminimumcontrast: COpaquePointer?, pdwcurrentcontrast: COpaquePointer?, pdwmaximumcontrast: COpaquePointer?): Int =
    windowssys_windows_win32_devices_display_getMonitorContrast(hmonitor?.value?.toCPointer<ByteVar>(), pdwminimumcontrast?.value?.toCPointer<ByteVar>(), pdwcurrentcontrast?.value?.toCPointer<ByteVar>(), pdwmaximumcontrast?.value?.toCPointer<ByteVar>())

public actual fun getMonitorDisplayAreaPosition(hmonitor: Handle, ptpositiontype: McPositionType, pdwminimumposition: COpaquePointer?, pdwcurrentposition: COpaquePointer?, pdwmaximumposition: COpaquePointer?): Int =
    windowssys_windows_win32_devices_display_getMonitorDisplayAreaPosition(hmonitor?.value?.toCPointer<ByteVar>(), ptpositiontype, pdwminimumposition?.value?.toCPointer<ByteVar>(), pdwcurrentposition?.value?.toCPointer<ByteVar>(), pdwmaximumposition?.value?.toCPointer<ByteVar>())

public actual fun getMonitorDisplayAreaSize(hmonitor: Handle, stsizetype: McSizeType, pdwminimumwidthorheight: COpaquePointer?, pdwcurrentwidthorheight: COpaquePointer?, pdwmaximumwidthorheight: COpaquePointer?): Int =
    windowssys_windows_win32_devices_display_getMonitorDisplayAreaSize(hmonitor?.value?.toCPointer<ByteVar>(), stsizetype, pdwminimumwidthorheight?.value?.toCPointer<ByteVar>(), pdwcurrentwidthorheight?.value?.toCPointer<ByteVar>(), pdwmaximumwidthorheight?.value?.toCPointer<ByteVar>())

public actual fun getMonitorRedGreenOrBlueDrive(hmonitor: Handle, dtdrivetype: McDriveType, pdwminimumdrive: COpaquePointer?, pdwcurrentdrive: COpaquePointer?, pdwmaximumdrive: COpaquePointer?): Int =
    windowssys_windows_win32_devices_display_getMonitorRedGreenOrBlueDrive(hmonitor?.value?.toCPointer<ByteVar>(), dtdrivetype, pdwminimumdrive?.value?.toCPointer<ByteVar>(), pdwcurrentdrive?.value?.toCPointer<ByteVar>(), pdwmaximumdrive?.value?.toCPointer<ByteVar>())

public actual fun getMonitorRedGreenOrBlueGain(hmonitor: Handle, gtgaintype: McGainType, pdwminimumgain: COpaquePointer?, pdwcurrentgain: COpaquePointer?, pdwmaximumgain: COpaquePointer?): Int =
    windowssys_windows_win32_devices_display_getMonitorRedGreenOrBlueGain(hmonitor?.value?.toCPointer<ByteVar>(), gtgaintype, pdwminimumgain?.value?.toCPointer<ByteVar>(), pdwcurrentgain?.value?.toCPointer<ByteVar>(), pdwmaximumgain?.value?.toCPointer<ByteVar>())

public actual fun getMonitorTechnologyType(hmonitor: Handle, pdtydisplaytechnologytype: COpaquePointer?): Int =
    windowssys_windows_win32_devices_display_getMonitorTechnologyType(hmonitor?.value?.toCPointer<ByteVar>(), pdtydisplaytechnologytype?.value?.toCPointer<ByteVar>())

public actual fun getNumberOfPhysicalMonitorsFromHMONITOR(hmonitor: Hmonitor, pdwnumberofphysicalmonitors: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_display_getNumberOfPhysicalMonitorsFromHMONITOR(hmonitor?.value?.toCPointer<ByteVar>(), pdwnumberofphysicalmonitors?.value?.toCPointer<ByteVar>())

public actual fun getPhysicalMonitorsFromHMONITOR(hmonitor: Hmonitor, dwphysicalmonitorarraysize: UInt, pphysicalmonitorarray: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_display_getPhysicalMonitorsFromHMONITOR(hmonitor?.value?.toCPointer<ByteVar>(), dwphysicalmonitorarraysize, pphysicalmonitorarray?.value?.toCPointer<ByteVar>())

public actual fun getTimingReport(hmonitor: Handle, pmtrmonitortimingreport: COpaquePointer?): Int =
    windowssys_windows_win32_devices_display_getTimingReport(hmonitor?.value?.toCPointer<ByteVar>(), pmtrmonitortimingreport?.value?.toCPointer<ByteVar>())

public actual fun getVCPFeatureAndVCPFeatureReply(hmonitor: Handle, bvcpcode: UByte, pvct: COpaquePointer?, pdwcurrentvalue: COpaquePointer?, pdwmaximumvalue: COpaquePointer?): Int =
    windowssys_windows_win32_devices_display_getVCPFeatureAndVCPFeatureReply(hmonitor?.value?.toCPointer<ByteVar>(), bvcpcode, pvct?.value?.toCPointer<ByteVar>(), pdwcurrentvalue?.value?.toCPointer<ByteVar>(), pdwmaximumvalue?.value?.toCPointer<ByteVar>())

public actual fun htGet8BppformatPalette(ppaletteentry: COpaquePointer?, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int =
    windowssys_windows_win32_devices_display_htGet8BppformatPalette(ppaletteentry?.value?.toCPointer<ByteVar>(), redgamma, greengamma, bluegamma)

public actual fun htGet8BppmaskPalette(ppaletteentry: COpaquePointer?, use8bppmaskpal: Bool, cmymask: UByte, redgamma: UShort, greengamma: UShort, bluegamma: UShort): Int =
    windowssys_windows_win32_devices_display_htGet8BppmaskPalette(ppaletteentry?.value?.toCPointer<ByteVar>(), use8bppmaskpal, cmymask, redgamma, greengamma, bluegamma)

public actual fun pathobjBEnum(ppo: COpaquePointer?, ppd: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_display_pathobjBEnum(ppo?.value?.toCPointer<ByteVar>(), ppd?.value?.toCPointer<ByteVar>())

public actual fun pathobjBEnumClipLines(ppo: COpaquePointer?, cb: UInt, pcl: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_display_pathobjBEnumClipLines(ppo?.value?.toCPointer<ByteVar>(), cb, pcl?.value?.toCPointer<ByteVar>())

public actual fun pathobjVEnumStart(ppo: COpaquePointer?) {
    windowssys_windows_win32_devices_display_pathobjVEnumStart(ppo?.value?.toCPointer<ByteVar>())
}

public actual fun pathobjVEnumStartClipLines(ppo: COpaquePointer?, pco: COpaquePointer?, pso: COpaquePointer?, pla: COpaquePointer?) {
    windowssys_windows_win32_devices_display_pathobjVEnumStartClipLines(ppo?.value?.toCPointer<ByteVar>(), pco?.value?.toCPointer<ByteVar>(), pso?.value?.toCPointer<ByteVar>(), pla?.value?.toCPointer<ByteVar>())
}

public actual fun pathobjVGetBounds(ppo: COpaquePointer?, prectfx: COpaquePointer?) {
    windowssys_windows_win32_devices_display_pathobjVGetBounds(ppo?.value?.toCPointer<ByteVar>(), prectfx?.value?.toCPointer<ByteVar>())
}

public actual fun queryDisplayConfig(flags: QueryDisplayConfigFlags, numpatharrayelements: COpaquePointer?, patharray: COpaquePointer?, nummodeinfoarrayelements: COpaquePointer?, modeinfoarray: COpaquePointer?, currenttopologyid: COpaquePointer?): Win32Error =
    windowssys_windows_win32_devices_display_queryDisplayConfig(flags, numpatharrayelements?.value?.toCPointer<ByteVar>(), patharray?.value?.toCPointer<ByteVar>(), nummodeinfoarrayelements?.value?.toCPointer<ByteVar>(), modeinfoarray?.value?.toCPointer<ByteVar>(), currenttopologyid?.value?.toCPointer<ByteVar>())

public actual fun restoreMonitorFactoryColorDefaults(hmonitor: Handle): Int =
    windowssys_windows_win32_devices_display_restoreMonitorFactoryColorDefaults(hmonitor?.value?.toCPointer<ByteVar>())

public actual fun restoreMonitorFactoryDefaults(hmonitor: Handle): Int =
    windowssys_windows_win32_devices_display_restoreMonitorFactoryDefaults(hmonitor?.value?.toCPointer<ByteVar>())

public actual fun strobjBEnum(pstro: COpaquePointer?, pc: COpaquePointer?, ppgpos: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_display_strobjBEnum(pstro?.value?.toCPointer<ByteVar>(), pc?.value?.toCPointer<ByteVar>(), ppgpos?.value?.toCPointer<ByteVar>())

public actual fun strobjBEnumPositionsOnly(pstro: COpaquePointer?, pc: COpaquePointer?, ppgpos: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_display_strobjBEnumPositionsOnly(pstro?.value?.toCPointer<ByteVar>(), pc?.value?.toCPointer<ByteVar>(), ppgpos?.value?.toCPointer<ByteVar>())

public actual fun strobjBGetAdvanceWidths(pso: COpaquePointer?, ifirst: UInt, c: UInt, pptqd: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_display_strobjBGetAdvanceWidths(pso?.value?.toCPointer<ByteVar>(), ifirst, c, pptqd?.value?.toCPointer<ByteVar>())

public actual fun strobjDwGetCodePage(pstro: COpaquePointer?): UInt =
    windowssys_windows_win32_devices_display_strobjDwGetCodePage(pstro?.value?.toCPointer<ByteVar>())

public actual fun strobjVEnumStart(pstro: COpaquePointer?) {
    windowssys_windows_win32_devices_display_strobjVEnumStart(pstro?.value?.toCPointer<ByteVar>())
}

public actual fun saveCurrentMonitorSettings(hmonitor: Handle): Int =
    windowssys_windows_win32_devices_display_saveCurrentMonitorSettings(hmonitor?.value?.toCPointer<ByteVar>())

public actual fun saveCurrentSettings(hmonitor: Handle): Int =
    windowssys_windows_win32_devices_display_saveCurrentSettings(hmonitor?.value?.toCPointer<ByteVar>())

public actual fun setDisplayAutoRotationPreferences(orientation: OrientationPreference): Bool =
    windowssys_windows_win32_devices_display_setDisplayAutoRotationPreferences(orientation)

public actual fun setDisplayConfig(numpatharrayelements: UInt, patharray: COpaquePointer?, nummodeinfoarrayelements: UInt, modeinfoarray: COpaquePointer?, flags: SetDisplayConfigFlags): Int =
    windowssys_windows_win32_devices_display_setDisplayConfig(numpatharrayelements, patharray?.value?.toCPointer<ByteVar>(), nummodeinfoarrayelements, modeinfoarray?.value?.toCPointer<ByteVar>(), flags)

public actual fun setMonitorBrightness(hmonitor: Handle, dwnewbrightness: UInt): Int =
    windowssys_windows_win32_devices_display_setMonitorBrightness(hmonitor?.value?.toCPointer<ByteVar>(), dwnewbrightness)

public actual fun setMonitorColorTemperature(hmonitor: Handle, ctcurrentcolortemperature: McColorTemperature): Int =
    windowssys_windows_win32_devices_display_setMonitorColorTemperature(hmonitor?.value?.toCPointer<ByteVar>(), ctcurrentcolortemperature)

public actual fun setMonitorContrast(hmonitor: Handle, dwnewcontrast: UInt): Int =
    windowssys_windows_win32_devices_display_setMonitorContrast(hmonitor?.value?.toCPointer<ByteVar>(), dwnewcontrast)

public actual fun setMonitorDisplayAreaPosition(hmonitor: Handle, ptpositiontype: McPositionType, dwnewposition: UInt): Int =
    windowssys_windows_win32_devices_display_setMonitorDisplayAreaPosition(hmonitor?.value?.toCPointer<ByteVar>(), ptpositiontype, dwnewposition)

public actual fun setMonitorDisplayAreaSize(hmonitor: Handle, stsizetype: McSizeType, dwnewdisplayareawidthorheight: UInt): Int =
    windowssys_windows_win32_devices_display_setMonitorDisplayAreaSize(hmonitor?.value?.toCPointer<ByteVar>(), stsizetype, dwnewdisplayareawidthorheight)

public actual fun setMonitorRedGreenOrBlueDrive(hmonitor: Handle, dtdrivetype: McDriveType, dwnewdrive: UInt): Int =
    windowssys_windows_win32_devices_display_setMonitorRedGreenOrBlueDrive(hmonitor?.value?.toCPointer<ByteVar>(), dtdrivetype, dwnewdrive)

public actual fun setMonitorRedGreenOrBlueGain(hmonitor: Handle, gtgaintype: McGainType, dwnewgain: UInt): Int =
    windowssys_windows_win32_devices_display_setMonitorRedGreenOrBlueGain(hmonitor?.value?.toCPointer<ByteVar>(), gtgaintype, dwnewgain)

public actual fun setVCPFeature(hmonitor: Handle, bvcpcode: UByte, dwnewvalue: UInt): Int =
    windowssys_windows_win32_devices_display_setVCPFeature(hmonitor?.value?.toCPointer<ByteVar>(), bvcpcode, dwnewvalue)

public actual fun xformobjBApplyXform(pxo: COpaquePointer?, imode: UInt, cpoints: UInt, pvin: COpaquePointer?, pvout: COpaquePointer?): Bool =
    windowssys_windows_win32_devices_display_xformobjBApplyXform(pxo?.value?.toCPointer<ByteVar>(), imode, cpoints, pvin?.value?.toCPointer<ByteVar>(), pvout?.value?.toCPointer<ByteVar>())

public actual fun xformobjIGetXform(pxo: COpaquePointer?, pxform: COpaquePointer?): UInt =
    windowssys_windows_win32_devices_display_xformobjIGetXform(pxo?.value?.toCPointer<ByteVar>(), pxform?.value?.toCPointer<ByteVar>())

public actual fun xlateobjCGetPalette(pxlo: COpaquePointer?, ipal: UInt, cpal: UInt, ppal: COpaquePointer?): UInt =
    windowssys_windows_win32_devices_display_xlateobjCGetPalette(pxlo?.value?.toCPointer<ByteVar>(), ipal, cpal, ppal?.value?.toCPointer<ByteVar>())

public actual fun xlateobjHGetColorTransform(pxlo: COpaquePointer?): Handle =
    windowssys_windows_win32_devices_display_xlateobjHGetColorTransform(pxlo?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun xlateobjIXlate(pxlo: COpaquePointer?, icolor: UInt): UInt =
    windowssys_windows_win32_devices_display_xlateobjIXlate(pxlo?.value?.toCPointer<ByteVar>(), icolor)

public actual fun xlateobjPiVector(pxlo: COpaquePointer?): COpaquePointer? =
    windowssys_windows_win32_devices_display_xlateobjPiVector(pxlo?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }
